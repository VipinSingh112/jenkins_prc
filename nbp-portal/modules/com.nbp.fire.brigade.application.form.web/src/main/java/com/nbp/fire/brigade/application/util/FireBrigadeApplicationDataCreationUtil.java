package com.nbp.fire.brigade.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.tuple.Pair;

public class FireBrigadeApplicationDataCreationUtil {
    public static long applicationId=0;
	public static Pair<String, Long> getApplicationRecertificationUrl(String transactionNumber,String renewal,ThemeDisplay themeDisplay) {
		
		FireBrigadeApplication fireBrigadeRecertificationProcess=null;
		fireBrigadeRecertificationProcess=FireBrigadeApplicationLocalServiceUtil.createFireBrigadeApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		fireBrigadeRecertificationProcess.setCompanyId(themeDisplay.getCompanyId());
		fireBrigadeRecertificationProcess.setGroupId(themeDisplay.getScopeGroupId());
		fireBrigadeRecertificationProcess.setCreateDate(new Date());
		fireBrigadeRecertificationProcess.setUserId(themeDisplay.getUserId());
		fireBrigadeRecertificationProcess.setUserName(themeDisplay.getUser().getFullName());
		fireBrigadeRecertificationProcess.setExpiredLicenseNumber(transactionNumber);
		fireBrigadeRecertificationProcess.setApplicationNumber(formatted + "/" + formattedDate);
		fireBrigadeRecertificationProcess.setTypeOfTransaction(FireBrigadeApplicationWorkflowConstant.RECERTIFICATION);
		fireBrigadeRecertificationProcess.setStatus(FireBrigadeApplicationWorkflowConstant.DRAFT);
		FireBrigadeApplicationLocalServiceUtil.updateFireBrigadeApplication(fireBrigadeRecertificationProcess);
		
		FireBrigadeAppliCurrentStage currentStage = null;
		currentStage = FireBrigadeAppliCurrentStageLocalServiceUtil.createFireBrigadeAppliCurrentStage(CounterLocalServiceUtil.increment());
		currentStage.setCurrentStage("APPLICATION FORM DETAILS");
		currentStage.setFireBrigadeApplicationId(fireBrigadeRecertificationProcess.getFireBrigadeApplicationId());
		FireBrigadeAppliCurrentStageLocalServiceUtil.updateFireBrigadeAppliCurrentStage(currentStage);
		String recertificationUrl = "/group/guest/fire-brigade-application-form?fireBrigadeApplicationId="
				+ fireBrigadeRecertificationProcess.getFireBrigadeApplicationId();
		applicationId=fireBrigadeRecertificationProcess.getFireBrigadeApplicationId();
		return Pair.of(recertificationUrl, applicationId);
		
	}

}
