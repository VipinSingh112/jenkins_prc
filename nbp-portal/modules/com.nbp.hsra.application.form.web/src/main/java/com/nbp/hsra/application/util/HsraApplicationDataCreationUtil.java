package com.nbp.hsra.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationWorkflowConstant;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;
import com.nbp.hsra.application.service.service.HsraApplicationCurrentStageLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HsraApplicationDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber, String typeOfApplicant,String riskLevel,String renewal,String registrationDate, String brokerTransactionType) {
		HsraApplication  hsraApplicationRenewalProcess =null;
		hsraApplicationRenewalProcess =HsraApplicationLocalServiceUtil.createHsraApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num); 
		hsraApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		hsraApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		hsraApplicationRenewalProcess.setCreateDate(new Date());
		hsraApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		hsraApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		hsraApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
		hsraApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		hsraApplicationRenewalProcess.setTypeOfTransaction(HSRAApplicationWorkflowConstant.RENEW_APPLICATION);
		hsraApplicationRenewalProcess.setStatus(HSRAApplicationWorkflowConstant.DRAFT);
		hsraApplicationRenewalProcess.setTypeOfApplicant(typeOfApplicant);
		hsraApplicationRenewalProcess.setBrokerTransactionType(brokerTransactionType);
		hsraApplicationRenewalProcess.setRiskLevel(riskLevel);
		try {
			if (Validator.isNotNull(registrationDate)) {
				System.out.println("-----------------inside date condition------------------");
				hsraApplicationRenewalProcess.setExpiredDate(new SimpleDateFormat("yyyy-MM-dd").parse(registrationDate));
			}
		} catch (Exception e) {
		}
		
		HsraApplicationLocalServiceUtil.updateHsraApplication(hsraApplicationRenewalProcess);
		HsraApplicationCurrentStage renewCurrentStage=null;
		renewCurrentStage= HsraApplicationCurrentStageLocalServiceUtil.createHsraApplicationCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		System.out.println("--------------------TYPE OF APPLICANT--------"+typeOfApplicant);
		if(typeOfApplicant.equals("Brokers")) {
			renewCurrentStage.setLastFormStep("childStep20");
		}
		else if(typeOfApplicant.equals("Qualified Experts")||typeOfApplicant.equals("Service Providers")||typeOfApplicant.equals("Users of Radiation Sources")) {
			renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
		}
		renewCurrentStage.setHsraApplicationId(hsraApplicationRenewalProcess.getHsraApplicationId());
		HsraApplicationCurrentStageLocalServiceUtil.updateHsraApplicationCurrentStage(renewCurrentStage);
		
		

		
		
		
		String renewLicenseUrl =   "/group/guest/hsra-application-form?hsraApplicationId="
				+hsraApplicationRenewalProcess.getHsraApplicationId()+"&_permitNumber="+licenseNumber+"&renewal="+renewal;
		
		
		return renewLicenseUrl;
	
	}
	}

		
	
	
