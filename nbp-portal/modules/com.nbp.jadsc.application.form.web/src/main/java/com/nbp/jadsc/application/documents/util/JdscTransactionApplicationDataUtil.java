package com.nbp.jadsc.application.documents.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCurrentStageLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JdscTransactionApplicationDataUtil {
	
	public static String createJadscRegistrationApplication(
			ThemeDisplay themeDisplay, String transactionNumber) {
	
		JADSCApplication jadscApplication=null;
		
		jadscApplication =JADSCApplicationLocalServiceUtil.createJADSCApplication(CounterLocalServiceUtil.increment());
	     
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		
		jadscApplication.setGroupId(themeDisplay.getScopeGroupId());
		jadscApplication.setCompanyId(themeDisplay.getCompanyId());
		jadscApplication.setUserId(themeDisplay.getUserId());
		jadscApplication.setUserName(themeDisplay.getUser().getFullName());
		jadscApplication.setCreateDate(new Date());
		jadscApplication.setExpiredLicenseAppNumber(transactionNumber);
		jadscApplication.setApplicationNumber(formatted + "/" + formattedDate);
		jadscApplication.setBreachOfConfidentiality(JADSCApplicationWorkFlowConstants.REGISTRATION_APPLICATION);
		jadscApplication.setStatus(JADSCApplicationWorkFlowConstants.DRAFT);
		JADSCApplicationLocalServiceUtil.updateJADSCApplication(jadscApplication);
		
		JADSCCurrentStage jadscCurrentStage=JADSCCurrentStageLocalServiceUtil.createJADSCCurrentStage(CounterLocalServiceUtil.increment());
		
		jadscCurrentStage.setCurrentStage("TYPE OF APPLICATION");
		jadscCurrentStage.setLastFormStep("childStep1");
		jadscCurrentStage.setJadscApplicationId(jadscApplication.getJadscApplicationId());
		JADSCCurrentStageLocalServiceUtil.updateJADSCCurrentStage(jadscCurrentStage);
		
		
		String renewLicenseUrl ="/group/guest/adsc-application-from?jadscApplicationId="
				+ jadscApplication.getJadscApplicationId()+"&transactionNumber="+transactionNumber;
		return renewLicenseUrl;	
	
    }

}
