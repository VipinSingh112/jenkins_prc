package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;
import com.nbp.sez.status.application.form.service.service.SezConsultancyInspectionLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezDevProposedProjectLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/submit/consultancy" }, service = MVCResourceCommand.class)

public class SubmitConsultancyInspectionFormResourceCommand implements MVCResourceCommand {
	
	private static Log _log = LogFactoryUtil.getLog(SubmitConsultancyInspectionFormResourceCommand.class.getName());
	public static DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		System.out.println("-------------inside submit consultancy--------------------");
		String doYouWant = ParamUtil.getString(resourceRequest, "doYouWant");
		System.out.println("------doYouWant---------------"+doYouWant);
		String consultancyName = ParamUtil.getString(resourceRequest, "consultancyName");
		String consultancyEmail = ParamUtil.getString(resourceRequest, "consultancyEmail");
		String consultancyPhoneNum = ParamUtil.getString(resourceRequest,"consultancyPhoneNum");
		String consultancyDateBirth = ParamUtil.getString(resourceRequest,"consultancyDateBirth");
		String consultancyBirthCountry = ParamUtil.getString(resourceRequest, "consultancyBirthCountry");
		String consultancyCountry = ParamUtil.getString(resourceRequest, "consultancyCountry");
		String consultancySezStatus = ParamUtil.getString(resourceRequest, "consultancySezStatus");
		String agendaName = ParamUtil.getString(resourceRequest, "agendaName");
		String dateForInspection = ParamUtil.getString(resourceRequest, "dateForInspection");
		String licenseStatusRacingQues = ParamUtil.getString(resourceRequest, "licenseStatusRacingQues");
		
		SezConsultancyInspection consultancy = null;
		try {
			consultancy = SezConsultancyInspectionLocalServiceUtil.getSezConsultancyByCat(doYouWant);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(consultancy==null) {
			consultancy = SezConsultancyInspectionLocalServiceUtil
					.createSezConsultancyInspection(CounterLocalServiceUtil.increment());	
			System.out.println("----------inside  consultancy null-----------");
		}
		
		consultancy.setDoYouWant(doYouWant);
		consultancy.setConsultancyName(consultancyName);
		consultancy.setConsultancyEmail(consultancyEmail);
		consultancy.setConsultancyPhoneNum(consultancyPhoneNum);
		try {
			if(Validator.isNotNull(consultancyDateBirth)) {
				consultancy.setConsultancyDateBirth(new SimpleDateFormat("yyyy-MM-dd").parse(consultancyDateBirth));
			}
		}catch(Exception e) {}
		consultancy.setConsultancyBirthCountry(consultancyBirthCountry);
		consultancy.setConsultancyCountry(consultancyCountry);
		consultancy.setConsultancySezStatus(consultancySezStatus);
		consultancy.setAgendaName(agendaName);
		try {
			if(Validator.isNotNull(dateForInspection)) {
		       consultancy.setDateForInspection(new SimpleDateFormat("yyyy-MM-dd").parse(dateForInspection));
			}
		}catch(Exception e) {}
		consultancy.setConsultancyTime(licenseStatusRacingQues);
		
		SezConsultancyInspectionLocalServiceUtil.updateSezConsultancyInspection(consultancy);
		
		//Email-template
		try {
			String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"request-for-consultancy-service");
			if (Validator.isNotNull(body)) {
				commonsUtil.sendMailToUsers("Request For Consultation", "customer-service@dobusinessjamaica.com",
						themeDisplay.getUser().getEmailAddress(), body);
			}
			
			_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		jsonOBJ.put("category", consultancy.getDoYouWant());
		jsonOBJ.put("dateOfInspection", consultancy.getDateForInspection());
		jsonOBJ.put("timeOfInspection",consultancy.getConsultancyTime());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("-----------------------End Consultancy Form---------------------");
 
		return false;
	}
	

	@Reference
	private CommonsUtil commonsUtil;
}
