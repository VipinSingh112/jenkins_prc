package com.nbp.explosives.competency.form.web.portlet;

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
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesCurrentStageLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationWorkFlowConstant;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=/add/pending/app/url" 
		}, 
service = MVCResourceCommand.class)
public class PendingExplosiveApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(PendingExplosiveApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String explosivesApplicationType = ParamUtil.getString(resourceRequest, "explosivesApplicationType");
		String explosivesTransactionType = ParamUtil.getString(resourceRequest, "explosivesTransactionType");
		String competencyCertificateNum = ParamUtil.getString(resourceRequest, "competencyCertificateNum");
		String dateOfIssue = ParamUtil.getString(resourceRequest, "dateOfIssue");
		String dateOfExpiration = ParamUtil.getString(resourceRequest, "dateOfExpiration");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		long explosivesApplicationId = ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		System.out.println("explosivesApplicationType - "+explosivesApplicationType);
		System.out.println("explosivesTransactionType - "+explosivesTransactionType);
		System.out.println("competencyCertificateNum - "+competencyCertificateNum);
		System.out.println("dateOfIssue - "+dateOfIssue);
		System.out.println("dateOfExpiration - "+dateOfExpiration);
		System.out.println("currentStage - "+currentStage);
		System.out.println("lastFormDetailsStep - "+lastFormDetailsStep);
		System.out.println("explosivesApplicationId - "+explosivesApplicationId);
		ExplosivesApplication explosivesApplication = null;
		try {
			explosivesApplication=ExplosivesApplicationLocalServiceUtil.getExplosivesApplication(explosivesApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(explosivesApplication)) {
		explosivesApplication=ExplosivesApplicationLocalServiceUtil.createExplosivesApplication(CounterLocalServiceUtil.increment());
		}
		explosivesApplication.setTypeOfApplicant(explosivesApplicationType);
		explosivesApplication.setTypeOfTransaction(explosivesTransactionType);
		explosivesApplication.setCompetencyCertificateNumber(competencyCertificateNum);
		explosivesApplication.setTypeOfApplicant(explosivesApplicationType);
		try {
			if (Validator.isNotNull(explosivesApplication)) {
				explosivesApplication.setDateOfIssue(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue));
			}
		} catch (Exception e) {
		}
		try {
			if (Validator.isNotNull(explosivesApplication)) {
				explosivesApplication.setDateOfExpiration(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfExpiration));
			}
		} catch (Exception e) {
		}
	  
		explosivesApplication.setCompanyId(themeDisplay.getCompanyId());
		explosivesApplication.setGroupId(themeDisplay.getScopeGroupId());
		explosivesApplication.setCreateDate(new Date());
		explosivesApplication.setUserId(themeDisplay.getUserId());
		explosivesApplication.setUserName(themeDisplay.getUser().getFullName());
		explosivesApplication.setStatus(ExplosivesCompetencyApplicationWorkFlowConstant.PENDING_AND_DRAFT);
		if (Validator.isNull(explosivesApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			explosivesApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(explosivesApplication);
		ExplosivesCurrentStage explosiveCurrentStage = null;
		try {
			explosiveCurrentStage = ExplosivesCurrentStageLocalServiceUtil.getExplosivesCurrentStage(explosivesApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(explosiveCurrentStage)) {
			explosiveCurrentStage = ExplosivesCurrentStageLocalServiceUtil.createExplosivesCurrentStage(CounterLocalServiceUtil.increment());
		}
		explosiveCurrentStage.setLastFormDetailsStep(lastFormDetailsStep);
		explosiveCurrentStage.setCurrentStage(currentStage);
		explosiveCurrentStage.setExplosivesApplicationId(explosivesApplication.getExplosivesApplicationId());
		ExplosivesCurrentStageLocalServiceUtil.updateExplosivesCurrentStage(explosiveCurrentStage);
		
		jsonOBJ.put("ExplosiveAppNum", explosivesApplication.getApplicationNumber());
		jsonOBJ.put("category", explosivesApplication.getTypeOfApplicant());
		jsonOBJ.put("explosivesApplicationId",explosivesApplication.getExplosivesApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		resourceResponse.setContentType("application/json");
		_log.info("-----------------explosivesApplicationId-------------"+explosivesApplication.getExplosivesApplicationId());
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
			_log.info("-----------------inside try-----");
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		_log.info("-----------------------End Pending Function---------------------");
		return false;
	}
}
