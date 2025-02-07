package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraCurrentStageLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;
import com.nbp.ncra.application.form.web.constants.NcraApplicationWorkflowConstants;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(

		property = { "javax.portlet.name="+ NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
				"mvc.command.name=/pending/ncra/application" }, service = MVCResourceCommand.class)

public class NCRAPendingApplicationFormResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		//private static Log _log = LogFactoryUtil.getLog(NCRAPendingApplicationFormResourceCommand.class.getName());
		System.out.println("started");
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
			String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
			String verificationOption = ParamUtil.getString(resourceRequest, "verificationOption");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
			String entityId = (String) themeDisplay.getUser().getExpandoBridge()
					.getAttribute(NcraApplicationWorkflowConstants.ENTITY_ID);
			NcraApplication application = null;
			NcraCurrentStage applicationCurrentStage = null;
			try {
				application = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
			} catch (Exception e1) {
				// TODO: handle exception
			}
			try {
				applicationCurrentStage = NcraCurrentStageLocalServiceUtil
						.getNcraCurrent_By_NCRA_Id(ncraApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (application == null) {
				application = NcraApplicationLocalServiceUtil.createNcraApplication(CounterLocalServiceUtil.increment());
			}
			application.setCompanyId(themeDisplay.getCompanyId());
			application.setGroupId(themeDisplay.getScopeGroupId());
			application.setUserId(themeDisplay.getUserId());
			application.setUserName(themeDisplay.getUser().getFullName());
			application.setStatus(NcraApplicationWorkflowConstants.DRAFT);
			application.setEntityId(entityId);
			application.setDoYouWant(verificationOption);
			application.setTypeOfTransaction(typeOfTransaction);
			if(Validator.isNull(application.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				application.setApplicationNumber(formatted + "/" + formattedDate);
			}
			NcraApplicationLocalServiceUtil.updateNcraApplication(application);
			// setting current Stage
			if (applicationCurrentStage == null) {
				applicationCurrentStage = NcraCurrentStageLocalServiceUtil
						.createNcraCurrentStage(CounterLocalServiceUtil.increment());
			}
			applicationCurrentStage.setCurrentStage(currentStage);
			applicationCurrentStage.setLastFormStepDetails(lastFormDetailsStep);
			applicationCurrentStage.setNcraApplicationId(application.getNcraApplicationId());
			NcraCurrentStageLocalServiceUtil.updateNcraCurrentStage(applicationCurrentStage);
			jsonOBJ.put("ncraApplicationId", application.getNcraApplicationId());
			jsonOBJ.put("category", application.getDoYouWant());
			jsonOBJ.put("appStatus", NcraApplicationWorkflowConstants.DRAFT_Label);
			jsonOBJ.put("applicationNumner", application.getApplicationNumber());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			System.out.println("started end--"+application.getNcraApplicationId());
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				//_log.error("An Error Has Occured", e);
			}
			//_log.info("NCRA APPLICATION PENDING END");

		return false;
	}

}
