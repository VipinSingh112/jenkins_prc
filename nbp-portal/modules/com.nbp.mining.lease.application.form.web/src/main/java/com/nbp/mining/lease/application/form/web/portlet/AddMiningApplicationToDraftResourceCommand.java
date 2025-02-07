package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.exception.NoSuchMiningAppCurrentStageException;
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
	"mvc.command.name=/mining/application/draft" }, 
service = MVCResourceCommand.class)

public class AddMiningApplicationToDraftResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddMiningApplicationToDraftResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		// TODO Auto-generated method stub
		
			_log.info("adding application to draft started--------------------------------");
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
			String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
			String prospectingRightsTransactionType = ParamUtil.getString(resourceRequest, "prospectingRightsTransactionType");
			String miningLicenceTransactionType = ParamUtil.getString(resourceRequest, "miningLicenceTransactionType");
			String prospectingLicenceTransactionType = ParamUtil.getString(resourceRequest, "prospectingLicenceTransactionType");
			String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
			String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
			String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
			String areaDelinationTotalApprox = ParamUtil.getString(resourceRequest, "areaDelinationTotalApprox");
			String licenceExclusiveSpecialType = ParamUtil.getString(resourceRequest, "licenceExclusiveSpecialType");
			String miningMineralsTypeVal = ParamUtil.getString(resourceRequest, "miningMineralsTypeVal");
			String otherMineral = ParamUtil.getString(resourceRequest, "otherMineral");
			String areaDelination = ParamUtil.getString(resourceRequest, "areaDelination");
			int status = ParamUtil.getInteger(resourceRequest, "status");
			
			MiningLeaseApplication miningApplication=null;
			MiningAppCurrentStage miningAppCurrentStage=null;
			
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				
			if(miningLeaseApplicationId>0) {
				
				try {
					miningApplication = MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningLeaseApplicationId);
				} catch (PortalException e) {
					// TODO Auto-generated catch block
				}
				try {
					miningAppCurrentStage = MiningAppCurrentStageLocalServiceUtil.getByMining_Stage(miningLeaseApplicationId);
				} catch (NoSuchMiningAppCurrentStageException e) {
					// TODO Auto-generated catch block
				}
				miningApplication.setModifiedDate(new Date());
			}else {
				miningLeaseApplicationId = CounterLocalServiceUtil.increment();
				 miningApplication = MiningLeaseApplicationLocalServiceUtil.createMiningLeaseApplication(miningLeaseApplicationId);
				 miningApplication.setApplicationNumber(formatted + "/" + formattedDate);
				 miningApplication.setCreateDate(new Date());
				long miningStageId =CounterLocalServiceUtil.increment();
				miningAppCurrentStage = MiningAppCurrentStageLocalServiceUtil.createMiningAppCurrentStage(miningStageId);
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
			miningApplication.setCompanyId(themeDisplay.getCompanyId());
			miningApplication.setCreateDate(new Date());
			miningApplication.setUserId(themeDisplay.getUserId());
			miningApplication.setUserName(themeDisplay.getUser().getFullName());
			miningApplication.setStatus(status);
			MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplication);
			
			/**
			 *  Adding current record information to DB
			 */
			
			miningAppCurrentStage.setCurrentStage(currentStage);
			miningAppCurrentStage.setLastFormStep(lastFormDetailsStep);
			miningAppCurrentStage.setMiningLeaseApplicationId(miningApplication.getMiningLeaseApplicationId());
			MiningAppCurrentStageLocalServiceUtil.updateMiningAppCurrentStage(miningAppCurrentStage);
			
			jsonOBJ.put("miningAppNo", miningApplication.getApplicationNumber());
			jsonOBJ.put("category", miningApplication.getTypeOfApplicant());
			jsonOBJ.put("appStatus", MiningApplicationWorkflowConstant.DRAFT_Label);
			jsonOBJ.put("miningLeaseApplicationId", miningLeaseApplicationId);
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			_log.info("adding application to draft end--------------------------------");
			
		
		return false;
	}

}
