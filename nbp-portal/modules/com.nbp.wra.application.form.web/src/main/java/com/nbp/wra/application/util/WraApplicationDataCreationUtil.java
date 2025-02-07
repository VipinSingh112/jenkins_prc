package com.nbp.wra.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.WRAAppCurrentStageLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class WraApplicationDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber, String typeOfApplication) {
		
		WRAApplication wraApplicationRenewalProcess=null;

		wraApplicationRenewalProcess =WRAApplicationLocalServiceUtil.createWRAApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		
		wraApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		wraApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		wraApplicationRenewalProcess.setCreateDate(new Date());
		wraApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		wraApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		wraApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
		wraApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		if(typeOfApplication.equals("Application for a Permit to Drill a Well")) {
		wraApplicationRenewalProcess.setTypeOfPermit(WRAApplicationWorkflowConstant.RENEW);
		}else {
		wraApplicationRenewalProcess.setTypeOfTransaction(WRAApplicationWorkflowConstant.RENEW_APPLICATION);
		}
		wraApplicationRenewalProcess.setStatus(WRAApplicationWorkflowConstant.DRAFT);
		wraApplicationRenewalProcess.setTypeOfApplication(typeOfApplication);
		WRAApplicationLocalServiceUtil.updateWRAApplication(wraApplicationRenewalProcess);
		WRAAppCurrentStage renewCurrentStage=null;
		renewCurrentStage= WRAAppCurrentStageLocalServiceUtil.createWRAAppCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		
		if(typeOfApplication.equals("Application for a Licence to Abstract &amp; User Water")) {
			renewCurrentStage.setLastFormStep("childStep2");
		}
		else if(typeOfApplication.equals("Application for a Permit to Drill a Well")) {
			 renewCurrentStage.setLastFormStep("childStep4");
	    }	
		else if(typeOfApplication.equals("Application for a Well Drillers Licence")) {
			 renewCurrentStage.setLastFormStep("childStep5");
	    }	
		renewCurrentStage.setWraApplicationId(wraApplicationRenewalProcess.getWraApplicationId());
		WRAAppCurrentStageLocalServiceUtil.updateWRAAppCurrentStage(renewCurrentStage);


		
		
		
		String renewLicenseUrl = 
				 "/group/guest/wra-application-form?wraApplicationId="
						+wraApplicationRenewalProcess.getWraApplicationId()+"&_permitNumber="+licenseNumber;
		
		
		return renewLicenseUrl;
	
	}
	}

