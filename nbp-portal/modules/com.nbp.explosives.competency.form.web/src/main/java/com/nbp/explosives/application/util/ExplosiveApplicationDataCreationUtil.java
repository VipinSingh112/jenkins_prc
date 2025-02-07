package com.nbp.explosives.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesCurrentStageLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationWorkFlowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExplosiveApplicationDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber,String explosivesApplicationType, String dateOfIssue, String dateOfExpiration) {
		ExplosivesApplication explosiveApplicationRenewalProcess = null;
		explosiveApplicationRenewalProcess =ExplosivesApplicationLocalServiceUtil.createExplosivesApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num); 
		explosiveApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		explosiveApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		explosiveApplicationRenewalProcess.setCreateDate(new Date());
		explosiveApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		explosiveApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		explosiveApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
		explosiveApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		explosiveApplicationRenewalProcess.setTypeOfTransaction(ExplosivesCompetencyApplicationWorkFlowConstant.RENEW);
		explosiveApplicationRenewalProcess.setStatus(ExplosivesCompetencyApplicationWorkFlowConstant.DRAFT);
		explosiveApplicationRenewalProcess.setTypeOfApplicant(explosivesApplicationType);
		explosiveApplicationRenewalProcess.setCompetencyCertificateNumber(licenseNumber);
		try {
			if (Validator.isNotNull(explosiveApplicationRenewalProcess)) {
				explosiveApplicationRenewalProcess.setDateOfIssue(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue));
			}
		} catch (Exception e) {
		}
		try {
			if (Validator.isNotNull(explosiveApplicationRenewalProcess)) {
				explosiveApplicationRenewalProcess.setDateOfExpiration(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfExpiration));
			}
		} catch (Exception e) {
		}
		ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(explosiveApplicationRenewalProcess);
		ExplosivesCurrentStage renewCurrentStage=null;
		renewCurrentStage= ExplosivesCurrentStageLocalServiceUtil.createExplosivesCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		renewCurrentStage.setLastFormDetailsStep("childStep1");

		renewCurrentStage.setExplosivesApplicationId(explosiveApplicationRenewalProcess.getExplosivesApplicationId());
		ExplosivesCurrentStageLocalServiceUtil.updateExplosivesCurrentStage(renewCurrentStage);
		String renewLicenseUrl="";
		renewLicenseUrl = "/group/guest/explosives-competency-certification-application-form?explosivesApplicationId="+explosiveApplicationRenewalProcess.getExplosivesApplicationId()
		+"&_permitNumber="+licenseNumber;
		return renewLicenseUrl;
	
	}
	}