package com.nbp.medical.facilities.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.service.MedicalCurrentStageLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

public class MedicalApplicationRenewUtil {
	public static String getRenewalData(String applicationNumber, ThemeDisplay themeDisplay,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		MedicalFacilitiesApp renewMedicalApp = null;
		renewMedicalApp = MedicalFacilitiesAppLocalServiceUtil
				.createMedicalFacilitiesApp(CounterLocalServiceUtil.increment());
		DateFormat df = new SimpleDateFormat("yy");
		String formattedDate = df.format(Calendar.getInstance().getTime());
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(100000);
		String formatted = String.format("%05d", num);
		renewMedicalApp.setCompanyId(themeDisplay.getCompanyId());
		renewMedicalApp.setGroupId(themeDisplay.getScopeGroupId());
		renewMedicalApp.setCreateDate(new Date());
		renewMedicalApp.setUserId(themeDisplay.getUserId());
		renewMedicalApp.setUserName(themeDisplay.getUser().getFullName());
		renewMedicalApp.setExpiredLicenseAppNumber(applicationNumber);
		renewMedicalApp.setApplicationNumber(formatted + "/" + formattedDate);
		renewMedicalApp.setTypeOfTransaction(MedicalFacilitiesApplicationWorkflowConstant.RENEW_PROCESS);
		renewMedicalApp.setStatus(MedicalFacilitiesApplicationWorkflowConstant.DRAFT);
		MedicalFacilitiesAppLocalServiceUtil.updateMedicalFacilitiesApp(renewMedicalApp);

		MedicalCurrentStage renewApplicationCurrentStage = null;
		renewApplicationCurrentStage = MedicalCurrentStageLocalServiceUtil
				.createMedicalCurrentStage(CounterLocalServiceUtil.increment());
		renewApplicationCurrentStage.setCurrentStage("TYPE OF CATEGORY");
		renewApplicationCurrentStage.setMedicalFacilitiesAppId(renewMedicalApp.getMedicalFacilitiesAppId());
		MedicalCurrentStageLocalServiceUtil.updateMedicalCurrentStage(renewApplicationCurrentStage);
		
		String renewLicenseUrl ="/group/guest/medical-facilities-application-form?medicalApplicationId="
				+ renewMedicalApp.getMedicalFacilitiesAppId()+"&applicationNumber="+applicationNumber;
		return renewLicenseUrl;

	}

}
