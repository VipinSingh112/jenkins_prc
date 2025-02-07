package com.nbp.ncbj.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NcbjApplicationDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber, String typeOfCertification, String typeOfTransaction, String typeOfService,  String numberOfSite, String iso9001CertificationValue,String result,String transferReason) {
		NcbjApplication  ncbjApplicationRenewalProcess =null;
		ncbjApplicationRenewalProcess=NcbjApplicationLocalServiceUtil.createNcbjApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		ncbjApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		ncbjApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		ncbjApplicationRenewalProcess.setCreateDate(new Date());
		ncbjApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		ncbjApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		ncbjApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
		ncbjApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		ncbjApplicationRenewalProcess.setTypeOfTransaction(NCBJApplicationWorkflowConstant.RENEW_APPLICATION);
		ncbjApplicationRenewalProcess.setStatus(NCBJApplicationWorkflowConstant.DRAFT);
		ncbjApplicationRenewalProcess.setIso9001CertificationValue(iso9001CertificationValue);
		ncbjApplicationRenewalProcess.setTypeOfCertification(typeOfCertification);
		ncbjApplicationRenewalProcess.setTypeOfTransaction(typeOfTransaction);
		ncbjApplicationRenewalProcess.setNumberOfSite(numberOfSite);
		ncbjApplicationRenewalProcess.setTypeOfServices(typeOfService);
		if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
		ncbjApplicationRenewalProcess.setTransferReason(transferReason);
		}
		NcbjApplicationLocalServiceUtil.updateNcbjApplication(ncbjApplicationRenewalProcess);
		NcbjCurrentStage renewCurrentStage=null;
		renewCurrentStage= NcbjCurrentStageLocalServiceUtil.createNcbjCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
			  if(typeOfTransaction.equals("NCBJ Certified Clients")) {
				  renewCurrentStage.setLastFormStep("childStep4");
			  }
			  if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
				  renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
			  }
		}else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
			  
			 if(typeOfTransaction.equals("NCBJ Certified Clients")) {
				 renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
			  }
		}
		renewCurrentStage.setNcbjApplicationId(ncbjApplicationRenewalProcess.getNcbjApplicationId());
		NcbjCurrentStageLocalServiceUtil.updateNcbjCurrentStage(renewCurrentStage);
		
		

		
		
		
		String renewLicenseUrl = 
				 "/group/guest/ncbj-application-form?ncbjApplicationId="
						+ncbjApplicationRenewalProcess.getNcbjApplicationId()+"&_permitNumber="+licenseNumber+"&result="+result;
		
		return renewLicenseUrl;
		
	}
	}