package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/submit/Janaac/Application/Url" }, service = MVCResourceCommand.class)
public class SubmitApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(SubmitApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[JANAAC APPLICATION SUBMIT START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String typeOfAccreditation=ParamUtil.getString(resourceRequest, "typeOfAccreditation");
		String typeOFAccreditationService=ParamUtil.getString(resourceRequest, "typeOFAccreditationService");
		String janaacTransactionType=ParamUtil.getString(resourceRequest, "janaacTransactionType");
		JanaacApplication application=null;
		try {
			application=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(application==null) {
			application=JanaacApplicationLocalServiceUtil.createJanaacApplication(CounterLocalServiceUtil.increment());
					
		}
		if (Validator.isNull(application.getApplicationNumber())) {
			  DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			  String formattedDate = df.format(Calendar.getInstance().getTime());
			  SecureRandom random = new SecureRandom(); int num = random.nextInt(100000);
			  String formatted = String.format("%05d", num);
			  application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JanaacApplicationFormPortletKeys.SUBMITTED);
		application.setAccreditationType(typeOfAccreditation);
		application.setAccServiceType(typeOFAccreditationService);
		application.setTransactionType(janaacTransactionType);
		JanaacApplicationLocalServiceUtil.updateJanaacApplication(application);
		
		String janaacDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
				+ "/janaac-dashboard?janaacApplicationId=";
		janaacDashboarUrl = janaacDashboarUrl
				+ String.valueOf(application.getJanaacApplicationId());
		// Sending Email After Form Submission
		try {
			String CategoryTypeUpperCase = application.getAccreditationType().toUpperCase();
			String subcategoryUpperCase = application.getAccServiceType().toUpperCase();
			String childcategoryUpperCase = application.getTransactionType().toUpperCase();

			String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"successful-application-submission-email-template");
			if (Validator.isNotNull(body)) {
				body = StringUtil.replace(body,
						new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
								"[$subCategory$]", "[$childCategory$]", "[$transactionNo$]", "[$dashboardURL$]" },

						new String[] { themeDisplay.getUser().getFullName(), "JANAAC Accreditation", "entityName",
								CategoryTypeUpperCase, subcategoryUpperCase, childcategoryUpperCase,
								application.getApplicationNumber(), janaacDashboarUrl });
			}
			commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
					themeDisplay.getUser().getEmailAddress(), body);
			_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

		} catch (Exception e) {
			e.printStackTrace();
		}
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonOBJ.put("janaacAppNo", application.getApplicationNumber());
		jsonOBJ.put("category", application.getAccreditationType());
		if(application.getAccreditationType().equals("FDA Approvals")) {
			jsonOBJ.put("janaacSubmitStatus", "FDA Approval");
		}else {
		jsonOBJ.put("janaacSubmitStatus", application.getAccreditationType());
		}
		jsonOBJ.put("appStatus", JanaacApplicationFormPortletKeys.SUBMITTED_Label);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("JANAAC APPLICATION SUBMIT END");
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;

}
