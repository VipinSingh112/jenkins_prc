package com.nbp.factories.registration.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationWorkFlowConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FactoriesRegistrationApplicationDataUtil {

	public static String createRegistrationApplication(
			ThemeDisplay themeDisplay, String registrationNum) {
	
		FactoriesApplicationRegistration registrationApplication=null;
		
		registrationApplication =FactoriesApplicationRegistrationLocalServiceUtil.createFactoriesApplicationRegistration(CounterLocalServiceUtil.increment());
	     
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		
		registrationApplication.setGroupId(themeDisplay.getScopeGroupId());
		registrationApplication.setCompanyId(themeDisplay.getCompanyId());
		registrationApplication.setUserId(themeDisplay.getUserId());
		registrationApplication.setUserName(themeDisplay.getUser().getFullName());
		registrationApplication.setCreateDate(new Date());
		registrationApplication.setExpiredLicenseAppNumber(registrationNum);
		registrationApplication.setApplicationNumber(formatted + "/" + formattedDate);
		registrationApplication.setTypeOfTransaction(FactoriesRegistrationApplicationWorkFlowConstants.REGISTRATION_APPLICATION);
		registrationApplication.setStatus(FactoriesRegistrationApplicationWorkFlowConstants.DRAFT);
		FactoriesApplicationRegistrationLocalServiceUtil.updateFactoriesApplicationRegistration(registrationApplication); 
		
		FactoriesRegstCurrentStage RegstCurrentStage=FactoriesRegstCurrentStageLocalServiceUtil.createFactoriesRegstCurrentStage(CounterLocalServiceUtil.increment());
		
		RegstCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
		RegstCurrentStage.setLastFormStep("childStep1");
		RegstCurrentStage.setFactoriesApplicationId(registrationApplication.getFactoriesApplicationId());
		FactoriesRegstCurrentStageLocalServiceUtil.updateFactoriesRegstCurrentStage(RegstCurrentStage);
		String renewLicenseUrl = "/group/guest/factories-registration-application-form?factoriesApplicationId="
				+ registrationApplication.getFactoriesApplicationId()+"&registrationNum="+registrationNum;
		return renewLicenseUrl;	
	
    }
}
