package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.exception.NoSuchMiningLeaseApplicationException;
import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.service.MiningAppCurrentStageLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
	(immediate = true, 
	property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=/mining/pending" }, 
	service = MVCResourceCommand.class)

public class MiningApplicationPendingResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(MiningApplicationPendingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			_log.info("Mining Pending Resource Command Start");

			long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
			String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
			String prospectingRightsTransactionType = ParamUtil.getString(resourceRequest, "prospectingRightsTransactionType");
			String miningLicenceTransactionType = ParamUtil.getString(resourceRequest, "miningLicenceTransactionType");
			String prospectingLicenceTransactionType = ParamUtil.getString(resourceRequest, "prospectingLicenceTransactionType");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
			String areaDelinationTotalApprox = ParamUtil.getString(resourceRequest, "areaDelinationTotalApprox");
			String licenceExclusiveSpecialType = ParamUtil.getString(resourceRequest, "licenceExclusiveSpecialType");
			String miningMineralsTypeVal = ParamUtil.getString(resourceRequest, "miningMineralsTypeVal");
			System.out.println("sdas-----------"+miningMineralsTypeVal);
			String otherMineral = ParamUtil.getString(resourceRequest, "otherMineral");
			String areaDelination = ParamUtil.getString(resourceRequest, "areaDelination");
			String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
			String leaseProspLicNumber = ParamUtil.getString(resourceRequest, "leaseProspLicNumber");
			String leaseProspRightsNumber = ParamUtil.getString(resourceRequest, "leaseProspRightsNumber");
			String miningAreaApprox = ParamUtil.getString(resourceRequest, "miningAreaApprox");
			String renewMLNum = ParamUtil.getString(resourceRequest, "renewMLNum");
			String proLicNumber = ParamUtil.getString(resourceRequest, "proLicNumber");
			
			MiningLeaseApplication miningApplication=null;
			MiningAppCurrentStage miningAppCurrentStage=null;
			
			try {
				miningApplication=MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningLeaseApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			if (Validator.isNull(miningApplication)) {
				miningApplication = MiningLeaseApplicationLocalServiceUtil.createMiningLeaseApplication(CounterLocalServiceUtil.increment());
				
			}
			
			miningApplication.setTypeOfApplicant(typeOfApplicant);
			miningApplication.setProspectingRightNumber(prospectingRightsTransactionType);
			miningApplication.setTypeOfTransaction(miningLicenceTransactionType);
			miningApplication.setTypeOfProspectingLicence(prospectingLicenceTransactionType);
			miningApplication.setAreaDelinationTotalApprox(areaDelinationTotalApprox);
			miningApplication.setAreaDelination(areaDelination);
			miningApplication.setLicenceExclusiveSpecial(licenceExclusiveSpecialType);
			miningApplication.setMiningMineralsTypeVal(miningMineralsTypeVal);
			miningApplication.setOtherMineralBox(otherMineral);
			miningApplication.setProspLicenseNum(proLicNumber);
			miningApplication.setCompanyId(themeDisplay.getCompanyId());
			miningApplication.setCreateDate(new Date());
			miningApplication.setUserId(themeDisplay.getUserId());
			miningApplication.setGroupId(themeDisplay.getScopeGroupId());
			miningApplication.setUserName(themeDisplay.getUser().getFullName());
			miningApplication.setProspRightsNum(licenseNumber);
			if(typeOfApplicant.equals("Mining Lease")) {
				miningApplication.setProspRightsNum(leaseProspLicNumber);
				miningApplication.setProspLicenseNum(leaseProspRightsNumber);
				miningApplication.setAreaDelinationTotalApprox(miningAreaApprox);
				miningApplication.setExpiredLicenseAppNumber(renewMLNum);
			}
			
			miningApplication.setStatus(MiningApplicationWorkflowConstant.PENDING_AND_DRAFT);
			
			if (Validator.isNull(miningApplication.getApplicationNumber())) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				miningApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplication);
			
			
			// Updating Current Stage
			try {
				miningAppCurrentStage = MiningAppCurrentStageLocalServiceUtil.getByMining_Stage(miningApplication.getMiningLeaseApplicationId());
			} catch (Exception e) {
			}
			if (miningAppCurrentStage == null) {
				miningAppCurrentStage = MiningAppCurrentStageLocalServiceUtil.createMiningAppCurrentStage(CounterLocalServiceUtil.increment());
			}
			miningAppCurrentStage.setCurrentStage(currentStage);
			miningAppCurrentStage.setLastFormStep(lastFormDetailsStep);
			miningAppCurrentStage.setMiningLeaseApplicationId(miningApplication.getMiningLeaseApplicationId());
			MiningAppCurrentStageLocalServiceUtil.updateMiningAppCurrentStage(miningAppCurrentStage);
			
			/*
			  if(licenseNumber!="") {
			  miningAppCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
			  }
			 */
			jsonOBJ.put("miningAppNo", miningApplication.getApplicationNumber());
			jsonOBJ.put("category", miningApplication.getTypeOfApplicant());
			jsonOBJ.put("miningLeaseApplicationId", miningApplication.getMiningLeaseApplicationId());
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
