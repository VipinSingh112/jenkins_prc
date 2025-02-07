package com.nbp.ncra.application.upload.documents.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraCurrentStageLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NcraApplicationWorkflowConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NcraRenewAppDataUtil {

	public static String createApplicationData(ThemeDisplay themeDisplay, String licenseNumber) {
		NcraApplication ncraApplication = null;
		ncraApplication = NcraApplicationLocalServiceUtil
				.createNcraApplication(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		ncraApplication.setCompanyId(themeDisplay.getCompanyId());
		ncraApplication.setGroupId(themeDisplay.getScopeGroupId());
		ncraApplication.setCreateDate(new Date());
		ncraApplication.setUserId(themeDisplay.getUserId());
		ncraApplication.setUserName(themeDisplay.getUser().getFullName());
		ncraApplication.setExpiredLicenseAppNumber(licenseNumber);
		ncraApplication.setApplicationNumber(formatted + "/" + formattedDate);
		ncraApplication
				.setTypeOfTransaction(NcraApplicationWorkflowConstants.RENEW_APPLICATION);
		ncraApplication.setStatus(NcraApplicationWorkflowConstants.DRAFT);
		NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplication);
		NcraCurrentStage currentStage = null;
			currentStage = NcraCurrentStageLocalServiceUtil
					.createNcraCurrentStage(CounterLocalServiceUtil.increment());
			currentStage.setCurrentStage("TYPE OF TRANSACTION");
			currentStage.setNcraApplicationId(ncraApplication.getNcraApplicationId());
			NcraCurrentStageLocalServiceUtil.updateNcraCurrentStage(currentStage);
			String renewLicenseUrl = "/group/guest/ncra-application-form?ncraApplicationId="
					+ ncraApplication.getNcraApplicationId();
		return renewLicenseUrl;
	}

}
