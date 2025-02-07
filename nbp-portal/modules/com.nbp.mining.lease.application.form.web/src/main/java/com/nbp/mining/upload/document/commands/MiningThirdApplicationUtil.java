package com.nbp.mining.upload.document.commands;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant;
import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.service.MiningAppCurrentStageLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MiningThirdApplicationUtil {
public static String getApplicationThirdRenewUrl(String miningLeaseNumber,ThemeDisplay themeDisplay, String typeOfTransaction ,String typeOfApplicant,String prNumber,String plNumber ) {
	MiningLeaseApplication miningApplicationRenewalProcess = null;
	miningApplicationRenewalProcess = MiningLeaseApplicationLocalServiceUtil.createMiningLeaseApplication(CounterLocalServiceUtil.increment());
	DateFormat df = new SimpleDateFormat("yy");
	String formattedDate = df.format(Calendar.getInstance().getTime());
	SecureRandom random = new SecureRandom();
	int num = random.nextInt(100000);
	String formatted = String.format("%05d", num);
	miningApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
	miningApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
	miningApplicationRenewalProcess.setCreateDate(new Date());
	miningApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
	miningApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
	miningApplicationRenewalProcess.setExpiredLicenseAppNumber(miningLeaseNumber);
	miningApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
	miningApplicationRenewalProcess.setTypeOfTransaction(typeOfTransaction);
	miningApplicationRenewalProcess.setTypeOfApplicant(typeOfApplicant);
	miningApplicationRenewalProcess.setTypeOfProspectingLicence(MiningApplicationWorkflowConstant.TEMPORARY_PERMISSION);
	miningApplicationRenewalProcess.setStatus(MiningApplicationWorkflowConstant.DRAFT);
	
	MiningAppCurrentStage currentStage = null;
	currentStage = MiningAppCurrentStageLocalServiceUtil.createMiningAppCurrentStage(CounterLocalServiceUtil.increment());

	if(typeOfApplicant.equals("Mining Lease")){
	currentStage.setCurrentStage("TYPE OF TRANSACTION");
	miningApplicationRenewalProcess.setProspRightsNum(prNumber);
	miningApplicationRenewalProcess.setProspLicenseNum(plNumber);
	}
	
	currentStage.setMiningLeaseApplicationId(miningApplicationRenewalProcess.getMiningLeaseApplicationId());
	MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplicationRenewalProcess);
	MiningAppCurrentStageLocalServiceUtil.updateMiningAppCurrentStage(currentStage);
	String renewLicenseUrl = "/group/guest/mining-application-form?miningLeaseApplicationId="
			+ miningApplicationRenewalProcess.getMiningLeaseApplicationId()+"&_permitNumber="+miningLeaseNumber;;
	return renewLicenseUrl;
	
}
}

