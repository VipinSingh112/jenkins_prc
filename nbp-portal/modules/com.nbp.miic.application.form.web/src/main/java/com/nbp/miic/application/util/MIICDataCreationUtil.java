package com.nbp.miic.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;
import com.nbp.miic.application.form.services.service.MiicApplicationCurrentStageLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MIICDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String transactionNumber) {
		MiicApplication miicApplicationRenewalProcess=null;
		miicApplicationRenewalProcess = MiicApplicationLocalServiceUtil.createMiicApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		miicApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
		miicApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
		miicApplicationRenewalProcess.setCreateDate(new Date());
		miicApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
		miicApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
		miicApplicationRenewalProcess.setExpiredLicenseAppNumber(transactionNumber);
		miicApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
		miicApplicationRenewalProcess.setTypeOfTransaction(MIICApplicationWorkflowConstant.RENEW);
		miicApplicationRenewalProcess.setStatus(MIICApplicationWorkflowConstant.DRAFT);
		MiicApplicationLocalServiceUtil.updateMiicApplication(miicApplicationRenewalProcess);
		MiicApplicationCurrentStage renewCurrentStage= MiicApplicationCurrentStageLocalServiceUtil.createMiicApplicationCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
		renewCurrentStage.setLastFormStep("childStep1");
		renewCurrentStage.setMiicApplicationId(miicApplicationRenewalProcess.getMiicApplicationId());
		MiicApplicationCurrentStageLocalServiceUtil.updateMiicApplicationCurrentStage(renewCurrentStage);
		String renewLicenseUrl = "/group/guest/miic-application-form?miicApplicationId="
				+ miicApplicationRenewalProcess.getMiicApplicationId();
		return renewLicenseUrl;
		
	}
}
