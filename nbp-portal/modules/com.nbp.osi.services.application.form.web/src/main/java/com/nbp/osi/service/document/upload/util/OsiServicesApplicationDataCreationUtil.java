package com.nbp.osi.service.document.upload.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServiceApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OsiServicesApplicationDataCreationUtil {
public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber,String natureOfApplicant,String doYouWant) {
	OsiServicesApplication  osiServiceRenewalProcess = null;
	osiServiceRenewalProcess = OsiServicesApplicationLocalServiceUtil.createOsiServicesApplication(CounterLocalServiceUtil.increment());
	DateFormat df = new SimpleDateFormat("yy");
	String formattedDate = df.format(Calendar.getInstance().getTime());
	SecureRandom random = new SecureRandom();
	int num = random.nextInt(100000);
	String formatted = String.format("%05d", num);
	osiServiceRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
	osiServiceRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
	osiServiceRenewalProcess.setCreateDate(new Date());
	osiServiceRenewalProcess.setUserId(themeDisplay.getUserId());
	osiServiceRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
	osiServiceRenewalProcess.setNatureOfApplicant(natureOfApplicant);
	osiServiceRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
	osiServiceRenewalProcess.setDoYouWant(doYouWant);
	osiServiceRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
	osiServiceRenewalProcess.setTypeOfTransaction(OSIServiceApplicationWorkflowConstant.RENEW_PROCESS);
	osiServiceRenewalProcess.setStatus(OSIServiceApplicationWorkflowConstant.DRAFT);
	OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServiceRenewalProcess);
	
	OSIServiceCurrentStage renewCurrentStage= OSIServiceCurrentStageLocalServiceUtil.createOSIServiceCurrentStage(CounterLocalServiceUtil.increment());
	if(natureOfApplicant.equals("Individual")){
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		renewCurrentStage.setLastFormDetailsStep("childStep6");
	}
	if(natureOfApplicant.equals("Company")){
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		renewCurrentStage.setLastFormDetailsStep("childStep13");
	}
	
	renewCurrentStage.setOsiServicesApplicationId(osiServiceRenewalProcess.getOsiServicesApplicationId());
	OSIServiceCurrentStageLocalServiceUtil.updateOSIServiceCurrentStage(renewCurrentStage);
	
	
	String renewLicenseUrl = "/group/guest/osi-service-application?osiServiceApplicationId="
			+ osiServiceRenewalProcess.getOsiServicesApplicationId()+"&_permitNumber="+licenseNumber;
	return renewLicenseUrl;
	
}
}
