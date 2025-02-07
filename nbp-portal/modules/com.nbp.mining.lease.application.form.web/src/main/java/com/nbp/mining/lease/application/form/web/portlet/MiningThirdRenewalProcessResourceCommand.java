package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;
import com.nbp.mining.lease.application.service.service.MiningAppCurrentStageLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningFormFiveDelineationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;
import com.nbp.mining.upload.document.commands.MiningApplicationDocumentsCopyUtil;
import com.nbp.mining.upload.document.commands.MiningThirdApplicationUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=third/Renewal/License" }, service = MVCResourceCommand.class)

public class MiningThirdRenewalProcessResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Mining Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(MiningThirdRenewalProcessResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfApplicant=ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String miningLeaseNumber = ParamUtil.getString(resourceRequest, "miningLeaseNumber");
		String plNumber = ParamUtil.getString(resourceRequest, "plNumber");
		String prNumber = ParamUtil.getString(resourceRequest, "prNumber");
		MiningLeaseApplication miningApplication =null;
		MiningLeaseApplication miningApplicationRenewalProcess = null;
		
	
		long miningLeaseApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(miningLeaseNumber)) {
					
					miningApplication = MiningLeaseApplicationLocalServiceUtil.getMiningByAppNum(miningLeaseNumber);
					_log.error("APPLICATION is not null MINING*******"+miningApplication);
				}
				miningLeaseApplicationId = miningApplication.getMiningLeaseApplicationId();
				_log.error("APPLICATION ID MINING*******"+miningLeaseApplicationId);
			}
			catch (Exception e) {
				_log.error(e.getMessage());
			}
			
			  if(Validator.isNull(miningApplication)){
					if (Validator.isNull(miningLeaseNumber)) {
						jsonOBJ.put("licenseNumberCheck", "0");
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						try {
							resourceResponse.getWriter().write(jsonFeed.toString());
						} catch (Exception e) {}
					}else {
						_log.error("else____++++++++++++++++++++++++++++++");
						String renewUrl = MiningThirdApplicationUtil.getApplicationThirdRenewUrl(miningLeaseNumber, themeDisplay, typeOfTransaction, typeOfApplicant,prNumber,plNumber);
						_log.error("renewUrl++++++++++++++++++++++++++++++"+renewUrl);
						jsonOBJ.put("renewLicenseUrl", renewUrl);
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						try {
							resourceResponse.getWriter().write(jsonFeed.toString());
						} catch (Exception e) {}
					}
			  }
			 else {
				if (miningApplication.getStatus() == MiningApplicationWorkflowConstant.SUBMITTED) {
					System.out.println("---------after successfully submitted------------");
					if (Validator.isNotNull(miningLeaseNumber)) {
						_log.error("LICENCE NUMBER 33333*******"+miningLeaseNumber);
						try {
						miningApplicationRenewalProcess = MiningLeaseApplicationLocalServiceUtil.getMiningByRT_AppNo(MiningApplicationWorkflowConstant.TEMPORARY_PERMISSION,miningLeaseNumber);
						} catch (Exception e) {
							_log.error("Error123_______________________" + e.getMessage());
						}
					}
					if (miningApplicationRenewalProcess == null) {
					
						_log.error("UNDER miningApplicationRenewalProcess*******"+miningApplicationRenewalProcess);
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
						miningApplicationRenewalProcess.setTypeOfApplicant(miningApplication.getTypeOfApplicant());
						miningApplicationRenewalProcess.setTypeOfProspectingLicence(MiningApplicationWorkflowConstant.TEMPORARY_PERMISSION);
						miningApplicationRenewalProcess.setProspRightsNum(prNumber);
						miningApplicationRenewalProcess.setProspLicenseNum(plNumber);
						miningApplicationRenewalProcess.setAreaDelinationTotalApprox(miningApplication.getAreaDelinationTotalApprox());
						miningApplicationRenewalProcess.setLicenceExclusiveSpecial(miningApplication.getLicenceExclusiveSpecial());
						miningApplicationRenewalProcess.setMiningMineralsTypeVal(miningApplication.getMiningMineralsTypeVal());
						miningApplicationRenewalProcess.setOtherMineralBox(miningApplication.getOtherMineralBox());
						miningApplicationRenewalProcess.setAreaDelination(miningApplication.getAreaDelination());
						miningApplicationRenewalProcess.setStatus(MiningApplicationWorkflowConstant.DRAFT);
						MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplicationRenewalProcess);
						
						MiningAppCurrentStage currentStage = null;
						currentStage = MiningAppCurrentStageLocalServiceUtil.createMiningAppCurrentStage(CounterLocalServiceUtil.increment());
						currentStage.setCurrentStage("APPLICATION FORM DETAILS");
					   if(typeOfApplicant.equals("Mining Lease")){
						if(typeOfTransaction.equals("Renewal")||typeOfTransaction.equals("Amendment")) {
							currentStage.setLastFormStep("childStep8");
						}
						else if(typeOfTransaction.equals("Temporary Permission")) {
							currentStage.setLastFormStep("childStep6");	
						}
						else if(typeOfTransaction.equals("Transfer")) {
							currentStage.setLastFormStep("childStep9");	
						}
						else if(typeOfTransaction.equals("Surrender")) {
							currentStage.setLastFormStep("childStep10");	
						}
						
						}
						
						System.out.println("-------------------current stage---------"+currentStage);
						
					    
						currentStage.setMiningLeaseApplicationId(miningApplicationRenewalProcess.getMiningLeaseApplicationId());
						MiningAppCurrentStageLocalServiceUtil.updateMiningAppCurrentStage(currentStage);
						
						copyingDataFromOriginalApplication(miningApplication.getMiningLeaseApplicationId(),miningApplicationRenewalProcess.getMiningLeaseApplicationId(),typeOfTransaction);
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

						} catch (PortalException e) {
							_log.error("Error---->>" + e.getMessage());
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(miningLeaseApplicationId));

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											miningApplicationRenewalProcess.getMiningLeaseApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						try {
						if (copiedDlFolder == null) {
							MiningApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
							supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
							String.valueOf(miningApplicationRenewalProcess.getMiningLeaseApplicationId()),
							supportingDocsMainFolder.getDescription(), serviceContext,
							supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
							miningApplicationRenewalProcess.getMiningLeaseApplicationId());
						}
						
						}catch(Exception e) {
							_log.error("Error---9897-->>" + e.getMessage());
						}
						
					}
					String renewLicenseUrl = "/group/guest/mining-application-form?miningLeaseApplicationId="+ miningApplicationRenewalProcess.getMiningLeaseApplicationId();
					_log.error("renewLicenseUrl++++++++++++++++++++++++++++++"+renewLicenseUrl);
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				} else {
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
			 }
			}
			  
			
		 catch (Exception e) {
			_log.error("Error1****************" + e.getMessage());
			_log.error("Error*2***************" + e.getCause());
		}
		

		return false;
}
	public static void copyingDataFromOriginalApplication(long miningLeaseApplicationId,
			long miningRenewalApplicationId,String typeOfTransaction) {
		_log.error("copyingDataFromOriginalApplication*******");
	MiningLeaseApplication miningApplication=null;
	
	try {
		miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningLeaseApplicationId);
	} catch (Exception e) {
		// TODO: handle exception
	}
	if(typeOfTransaction.equals("Temporary Permission")) {
		
		MiningProspectingLicense prospectLicence=null;
		MiningProspectingLicense renewalLicence=null;
		try {
			prospectLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		} catch (Exception e) {}
		try {
			renewalLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		} catch (Exception e) {}
		
		
		if(prospectLicence!=null) {
			
			renewalLicence.setNameOfApplicant(prospectLicence.getNameOfApplicant());
			renewalLicence.setNationalityOfApplicant(prospectLicence.getNationalityOfApplicant());
			renewalLicence.setAddressInJamaica(prospectLicence.getAddressInJamaica());
			renewalLicence.setNumberOfApplicant(prospectLicence.getNumberOfApplicant());
			renewalLicence.setApproximateArea(prospectLicence.getApproximateArea());
			renewalLicence.setParish(prospectLicence.getParish());
			renewalLicence.setMineralForWhichApplicant(prospectLicence.getMineralForWhichApplicant());
			renewalLicence.setLicence(prospectLicence.getLicence());
			renewalLicence.setDateUponTheLocation(prospectLicence.getDateUponTheLocation());
			renewalLicence.setMiningLeaseApplicationId(miningRenewalApplicationId);
			MiningProspectingLicenseLocalServiceUtil.updateMiningProspectingLicense(renewalLicence);
			
		}
		
		List<MiningProspectingLicenseAdd> directorDetails = null;
		MiningProspectingLicenseAdd renewDirectorDetails= null;
		
		try {
			directorDetails= MiningProspectingLicenseAddLocalServiceUtil.getMinningById(miningLeaseApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		if(directorDetails != null) {
			for (MiningProspectingLicenseAdd directorDetailList : directorDetails) {
				renewDirectorDetails = MiningProspectingLicenseAddLocalServiceUtil.createMiningProspectingLicenseAdd(CounterLocalServiceUtil.increment());
				renewDirectorDetails.setName(directorDetailList.getName());
				renewDirectorDetails.setNationality(directorDetailList.getNationality());
				renewDirectorDetails.setDirectorsOfCompany(directorDetailList.getDirectorsOfCompany());
				renewDirectorDetails.setCounter(directorDetailList.getCounter());
				renewDirectorDetails.setMiningLeaseApplicationId(miningRenewalApplicationId);
				MiningProspectingLicenseAddLocalServiceUtil.updateMiningProspectingLicenseAdd(renewDirectorDetails);
			}
		}
		MiningFormFiveDelineation delineationArea=null;
		MiningFormFiveDelineation renewDelineationArea=null;
		try {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			renewDelineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(delineationArea!=null) {
			renewDelineationArea.setApproximatelyArea(delineationArea.getApproximatelyArea());
			renewDelineationArea.setLocation(delineationArea.getLocation());
			renewDelineationArea.setCoordinates(delineationArea.getCoordinates());
			renewDelineationArea.setNorthSide(delineationArea.getNorthSide());
			renewDelineationArea.setEastSide(delineationArea.getEastSide());
			renewDelineationArea.setFirstNorthSide(delineationArea.getFirstNorthSide());
			renewDelineationArea.setFirstEastSide(delineationArea.getFirstEastSide());
			renewDelineationArea.setFirstLocationGrid(delineationArea.getFirstLocationGrid());
			renewDelineationArea.setFirstDegrees(delineationArea.getFirstDegrees());
			renewDelineationArea.setSecondNorthSide(delineationArea.getSecondNorthSide());
			renewDelineationArea.setSecondEastSide(delineationArea.getSecondEastSide());
			renewDelineationArea.setSecondLocationGrid(delineationArea.getSecondLocationGrid());
			renewDelineationArea.setSecondDegrees(delineationArea.getSecondDegrees());
			renewDelineationArea.setThirdCoordinates(delineationArea.getThirdCoordinates());
			renewDelineationArea.setThirdNorthSide(delineationArea.getThirdNorthSide());
			renewDelineationArea.setThirdEastSide(delineationArea.getThirdEastSide());
			renewDelineationArea.setThirdDegrees(delineationArea.getThirdDegrees());
			renewDelineationArea.setThirdGridLoc(delineationArea.getThirdGridLoc());
			renewDelineationArea.setThirdGridL(delineationArea.getThirdGridL());
			renewDelineationArea.setFourthCoordinates(delineationArea.getFourthCoordinates());
			renewDelineationArea.setFourthNorthSide(delineationArea.getFourthNorthSide());
			renewDelineationArea.setFourthEastSide(delineationArea.getFourthEastSide());
			renewDelineationArea.setFourthDegrees(delineationArea.getFourthDegrees());
			renewDelineationArea.setFourthGridLoc(delineationArea.getFourthGridLoc());
			renewDelineationArea.setFourthGridL(delineationArea.getFourthGridL());
			renewDelineationArea.setFifthCoordinates(delineationArea.getFifthCoordinates());
			renewDelineationArea.setFifthNorthSide(delineationArea.getFifthNorthSide());
			renewDelineationArea.setFifthEastSide(delineationArea.getFifthEastSide());
			renewDelineationArea.setFifthDegrees(delineationArea.getFirstDegrees());
			renewDelineationArea.setFifthGridLoc(delineationArea.getFifthGridLoc());
			renewDelineationArea.setFifthGridL(delineationArea.getFifthGridL());
			renewDelineationArea.setMiningLeaseApplicationId(miningRenewalApplicationId);
			MiningFormFiveDelineationLocalServiceUtil.updateMiningFormFiveDelineation(renewDelineationArea);
		}
		
		
	}

	}
}

	
