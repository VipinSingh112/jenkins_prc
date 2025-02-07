package com.nbp.sez.status.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationCurrentStageLocalServiceUtil;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SezStatusApplicationDataCreationUtil {
	
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber, String sezStatus,String wfhCheck,String ApplicantStatus,String typeOfTransactionWFH,String renew) {
		SezStatusApplication sezApplicationRenewalProcess = null;
		sezApplicationRenewalProcess = SezStatusApplicationLocalServiceUtil.createSezStatusApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num); 
		sezApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		sezApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		sezApplicationRenewalProcess.setCreateDate(new Date());
		sezApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		sezApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		sezApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
		sezApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		if(sezStatus.equals("SEZ Developer")) {
		sezApplicationRenewalProcess.setTypeOfTransaction("Application for Renewal of SEZ Developer Status");
		}else if(sezStatus.equals("SEZ Occupant")) {
		sezApplicationRenewalProcess.setTypeOfTransaction(" Application for Renewal of SEZ Occupant Status");	
		}else if(sezStatus.equals("SEZ Zone User")) {
		sezApplicationRenewalProcess.setTypeOfTransaction(" Application for Re-authorization SEZ Zone User Status");	
		}
		sezApplicationRenewalProcess.setDoYouWantTo("Submit an Application for SEZ Status");
		if(Validator.isNotNull(wfhCheck)){
		sezApplicationRenewalProcess.setDoYouWantTo("Submit an Application for A Work From Home Certificate");
		sezApplicationRenewalProcess.setApplicantStatusWFH(ApplicantStatus);
		sezApplicationRenewalProcess.setTypeOfTransactionWFH(typeOfTransactionWFH);
		}
		sezApplicationRenewalProcess.setStatus(SezStatusApplicationWorkflowConstant.DRAFT);
		sezApplicationRenewalProcess.setSezStatus(sezStatus);
		SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(sezApplicationRenewalProcess);
		
		SezStatusApplicationCurrentStage renewCurrentStage=SezStatusApplicationCurrentStageLocalServiceUtil.createSezStatusApplicationCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
        if(Validator.isNotNull(wfhCheck)) {
        	renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
        	renewCurrentStage.setLastFormStep("childStep20");
        }
		renewCurrentStage.setSezStatusApplicationId(sezApplicationRenewalProcess.getSezStatusApplicationId());
		SezStatusApplicationCurrentStageLocalServiceUtil.updateSezStatusApplicationCurrentStage(renewCurrentStage);
		String renewLicenseUrl = "/group/guest/sez-status-application-form?sezStatusApplicationId="
				+ sezApplicationRenewalProcess.getSezStatusApplicationId()+"&_permitNumber="+licenseNumber+"&_renew="+renew;
		return renewLicenseUrl;
	}
	}