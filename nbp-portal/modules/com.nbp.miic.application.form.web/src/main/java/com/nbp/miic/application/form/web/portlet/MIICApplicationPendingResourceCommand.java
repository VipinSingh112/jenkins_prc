package com.nbp.miic.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;
import com.nbp.miic.application.form.services.service.MiicApplicationCurrentStageLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;
import com.nbp.miic.application.form.web.constants.MIICApplicationWorkflowConstant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		"mvc.command.name=/miic/pending" }, service = MVCResourceCommand.class)
public class MIICApplicationPendingResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MIICApplicationPendingResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		_log.info("MIIC Pending Resource Command Start");
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
		String miicApplication = ParamUtil.getString(resourceRequest, "miicApplciation");
		String typeOfManufacturer = ParamUtil.getString(resourceRequest, "typeOfManufacturer");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		System.out.println("lastFormDetailsStep in pending is -----------"+lastFormDetailsStep);
		System.out.println("currentStage in pending is -----------"+currentStage);
		MiicApplication miicAppli = null;
		MiicApplicationCurrentStage miicappliCurrentStage = null;
		try {
			miicAppli=MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
		}catch (Exception e) {
		}
		if (Validator.isNull(miicAppli)) {
			miicAppli = MiicApplicationLocalServiceUtil.createMiicApplication(
					CounterLocalServiceUtil.increment(MIICApplicationPendingResourceCommand.class.getName()));
		}
		miicAppli.setMiicApplication(miicApplication);
		miicAppli.setTypeOfManufacturer(typeOfManufacturer);
		miicAppli.setTypeOfTransaction(typeOfTransaction);
		miicAppli.setCompanyId(themeDisplay.getCompanyId());
		miicAppli.setGroupId(themeDisplay.getScopeGroupId());
		miicAppli.setCreateDate(new Date());
		miicAppli.setUserId(themeDisplay.getUserId());
		miicAppli.setUserName(themeDisplay.getUser().getFullName());
		miicAppli.setStatus(MIICApplicationWorkflowConstant.PENDING_AND_DRAFT);
		if (Validator.isNull(miicAppli.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			miicAppli.setApplicationNumber(formatted + "/" + formattedDate);
		}
		MiicApplicationLocalServiceUtil.updateMiicApplication(miicAppli);
		// Updating Current Stage
		try {
			miicappliCurrentStage = MiicApplicationCurrentStageLocalServiceUtil.getMIIC_Stage_MIIC_AI(miicAppli.getMiicApplicationId());
		} catch (Exception e) {
		System.out.println("miicappliCurrentStage if it is incfrement ------------------"+miicappliCurrentStage);
		}
		if (Validator.isNull(miicappliCurrentStage)){
			System.out.println("inside micc application ojkiferh -------------"+miicappliCurrentStage);
			miicappliCurrentStage = MiicApplicationCurrentStageLocalServiceUtil.createMiicApplicationCurrentStage(CounterLocalServiceUtil.increment());
			System.out.println("inside micc application current stage increment -------------"+miicappliCurrentStage);
		}
		miicappliCurrentStage.setCurrentStage(currentStage);
		miicappliCurrentStage.setLastFormStep(lastFormDetailsStep);
		miicappliCurrentStage.setMiicApplicationId(miicAppli.getMiicApplicationId());
		MiicApplicationCurrentStageLocalServiceUtil.updateMiicApplicationCurrentStage(miicappliCurrentStage);

		if (saveAndContinue.equals("true")) {
			jsonOBJ.put("miicAppNo", miicAppli.getApplicationNumber());
			jsonOBJ.put("category", miicAppli.getMiicApplication());
		} else {
			jsonOBJ.put("miicAppNo", "");
			jsonOBJ.put("category", "");
		}
		jsonOBJ.put("miicApplicationId", miicAppli.getMiicApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
