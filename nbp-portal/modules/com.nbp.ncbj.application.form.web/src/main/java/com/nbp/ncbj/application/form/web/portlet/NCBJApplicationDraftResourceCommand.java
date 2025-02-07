package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationWorkflowConstant;

import java.io.IOException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/draft/upload/in/ncbj" }, service = MVCResourceCommand.class)
public class NCBJApplicationDraftResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(NCBJApplicationDraftResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfCertification = ParamUtil.getString(resourceRequest, "typeOfCertification");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String iso9001CertificationValue = ParamUtil.getString(resourceRequest, "iso9001CertificationValue");
		String numberOfSite = ParamUtil.getString(resourceRequest, "numberOfSite");
		String ncbjServiceSurveillanceVal = ParamUtil.getString(resourceRequest, "ncbjServiceSurveillanceVal");
		String iso22000CertificationValue = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "iso22000CertificationValue"));
		String ncbjCertifiedClientServiceVal = ParamUtil.getString(resourceRequest, "ncbjCertifiedClientServiceVal");
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");

		NcbjApplication ncbjApplication = null;
		NcbjCurrentStage ncbjCurrentStage=null;
		try {
			ncbjApplication = NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(ncbjApplication)) {
			ncbjApplication = NcbjApplicationLocalServiceUtil.createNcbjApplication(
					CounterLocalServiceUtil.increment());
		}
		ncbjApplication.setTypeOfCertification(typeOfCertification);
		ncbjApplication.setTypeOfTransaction(typeOfTransaction);
		ncbjApplication.setIso9001CertificationValue(iso9001CertificationValue);
		ncbjApplication.setNumberOfSite(numberOfSite);
		ncbjApplication.setIso22000CertificationValue(iso22000CertificationValue);
		ncbjApplication.setTypeOfServices(ncbjCertifiedClientServiceVal);
		ncbjApplication.setSubCategoryServices(ncbjServiceSurveillanceVal);
		ncbjApplication.setCompanyId(themeDisplay.getCompanyId());
		ncbjApplication.setGroupId(themeDisplay.getScopeGroupId());
		ncbjApplication.setCreateDate(new Date());
		ncbjApplication.setUserId(themeDisplay.getUserId());
		ncbjApplication.setUserName(themeDisplay.getUser().getFullName());
		ncbjApplication.setStatus(NCBJApplicationWorkflowConstant.PENDING_AND_DRAFT);
		if (Validator.isNull(ncbjApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			ncbjApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		NcbjApplicationLocalServiceUtil.updateNcbjApplication(ncbjApplication);
		
		// Updating Current Stage
		try {
			ncbjCurrentStage = NcbjCurrentStageLocalServiceUtil.getByNcbj_Stage(ncbjApplicationId);
		} catch (Exception e) {
		}	
		if (ncbjCurrentStage == null) {
			ncbjCurrentStage = NcbjCurrentStageLocalServiceUtil.createNcbjCurrentStage(CounterLocalServiceUtil.increment());
		}
		ncbjCurrentStage.setCurrentStage(currentStage);
		ncbjCurrentStage.setLastFormStep(lastFormDetailsStep);
		ncbjCurrentStage.setNcbjApplicationId(ncbjApplication.getNcbjApplicationId());
		NcbjCurrentStageLocalServiceUtil.updateNcbjCurrentStage(ncbjCurrentStage);
		
		jsonOBJ.put("ncbjApplicationId", ncbjApplication.getNcbjApplicationId());
		jsonOBJ.put("applicationNumber", ncbjApplication.getApplicationNumber());
		jsonOBJ.put("category", ncbjApplication.getTypeOfCertification());
		jsonOBJ.put("appStatus", NCBJApplicationWorkflowConstant.DRAFT_Label);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}