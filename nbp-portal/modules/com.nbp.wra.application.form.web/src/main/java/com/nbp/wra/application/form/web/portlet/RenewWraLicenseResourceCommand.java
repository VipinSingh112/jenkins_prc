package com.nbp.wra.application.form.web.portlet;

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
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.LicenceToAbstractInfoLocalServiceUtil;
import com.nbp.wra.application.form.service.service.LicenceToWellDrillerLocalServiceUtil;
import com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAAppCurrentStageLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;
import com.nbp.wra.application.form.web.constants.WRAApplicationWorkflowConstant;
import com.nbp.wra.application.util.WraApplicationDataCreationUtil;
import com.nbp.wra.application.util.WraApplicationDocumentsCopyUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name="  + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/renew/license" }, service = MVCResourceCommand.class)
public class RenewWraLicenseResourceCommand implements MVCResourceCommand {
	static Log _log = LogFactoryUtil.getLog(RenewWraLicenseResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "WRA Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String typeOfApplication=ParamUtil.getString(resourceRequest, "typeOfApplication");
		String transactionType=ParamUtil.getString(resourceRequest, "transactionType");
		
		WRAApplication wraApplication=null;
		WRAApplication wraApplicationRenewalProcess=null;
		
		long wraApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					wraApplication =WRAApplicationLocalServiceUtil.getWraApplicationBy_ApplicationNumber(licenseNumber);
				}
			
				wraApplicationId=wraApplication.getWraApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(wraApplication)) {
				if (Validator.isNull(licenseNumber)){
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
			
				String renewUrl =WraApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,typeOfApplication);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(wraApplication.getStatus()==WRAApplicationWorkflowConstant.SUBMITTED) {
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							wraApplicationRenewalProcess = WRAApplicationLocalServiceUtil.getWraByRT_AppNo(WRAApplicationWorkflowConstant.RENEW_APPLICATION,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(wraApplicationRenewalProcess==null) {
						WRAAppCurrentStage renewCurrentStage=null;
						renewCurrentStage= WRAAppCurrentStageLocalServiceUtil.createWRAAppCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						
		
						
						if(wraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract &amp; User Water")||(wraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water"))){
							 renewCurrentStage.setLastFormStep("childStep2");
						}
						if(wraApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
							 renewCurrentStage.setLastFormStep("childStep4");
						}
						
						if(wraApplication.getTypeOfApplication().equals("Application for a Well Drillers Licence")) {
							renewCurrentStage.setLastFormStep("childStep5");
						}
	
						
							
						wraApplicationRenewalProcess=WRAApplicationLocalServiceUtil.createWRAApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						wraApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						wraApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						wraApplicationRenewalProcess.setCreateDate(new Date());
						wraApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						wraApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						wraApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						wraApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						if(wraApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
						wraApplicationRenewalProcess.setTypeOfPermit(WRAApplicationWorkflowConstant.RENEW);
						}else {
						wraApplicationRenewalProcess.setTypeOfTransaction(WRAApplicationWorkflowConstant.RENEW_APPLICATION);
						}
						wraApplicationRenewalProcess.setStatus(WRAApplicationWorkflowConstant.DRAFT);
						wraApplicationRenewalProcess.setTypeOfApplication(wraApplication.getTypeOfApplication());
					
					
						WRAApplicationLocalServiceUtil.updateWRAApplication(wraApplicationRenewalProcess);
						renewCurrentStage.setWraApplicationId(wraApplicationRenewalProcess.getWraApplicationId());
						WRAAppCurrentStageLocalServiceUtil.updateWRAAppCurrentStage(renewCurrentStage);
		
						
						
						copyingDataFromOriginalApplication(wraApplication.getWraApplicationId(), wraApplicationRenewalProcess.getWraApplicationId());
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
									String.valueOf(wraApplicationId));

							

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											wraApplicationRenewalProcess.getWraApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							WraApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
										 wraApplicationRenewalProcess.getWraApplicationId()),
									     supportingDocsMainFolder.getDescription(), serviceContext,
									     supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									     wraApplicationRenewalProcess.getWraApplicationId());

						}
					}
					
					String renewLicenseUrl = 
							 "/group/guest/wra-application-form?wraApplicationId="
									+wraApplicationRenewalProcess.getWraApplicationId();
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
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}
	
	public static void copyingDataFromOriginalApplication(long wraApplicationId,
			long wraRenewalApplicationId) {
		
		 
		 WRAApplication wraApplication=null;
		 
		 try {
			 wraApplication=WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		 }catch(Exception e) {}
		 
		 
//		 if(wraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water")) {
//			 
//			 LicenceToAbstractInfo abstractInfo = null;
//			 LicenceToAbstractInfo renewAbstractInfo = null;
//			 
//			 try {
//					abstractInfo= LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
//				} catch (Exception e) {}
//			 try {
//				 renewAbstractInfo= LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
//				} catch (Exception e) {}
//			 
//			 if(abstractInfo!=null) {
//				    renewAbstractInfo.setApplicationNum(abstractInfo.getApplicationNum());
//					renewAbstractInfo.setNameOfApplicant(abstractInfo.getNameOfApplicant());
//					renewAbstractInfo.setParishApplicant(abstractInfo.getParishApplicant());
//					renewAbstractInfo.setMailingAddOfApplicant(abstractInfo.getMailingAddOfApplicant());
//					renewAbstractInfo.setEmailOfApplicant(abstractInfo.getEmailOfApplicant());
//					renewAbstractInfo.setOfficePhone(abstractInfo.getOfficePhone());
//					renewAbstractInfo.setMobilePhone(abstractInfo.getMobilePhone());
//					renewAbstractInfo.setHomePhone(abstractInfo.getHomePhone());
//					renewAbstractInfo.setLocationOfProposedParish(abstractInfo.getLocationOfProposedParish());
//					renewAbstractInfo.setLocationOfProParishWork(abstractInfo.getLocationOfProParishWork());
//					renewAbstractInfo.setNameOfContractor(abstractInfo.getNameOfContractor());
//					renewAbstractInfo.setParishContractor(abstractInfo.getParishContractor());
//					renewAbstractInfo.setAddressOfContractor(abstractInfo.getAddressOfContractor());
//					renewAbstractInfo.setSourceOfWater(abstractInfo.getSourceOfWater());
//					renewAbstractInfo.setPurposeWaterUse(abstractInfo.getPurposeWaterUse());
//					renewAbstractInfo.setMeansOfDisposal(abstractInfo.getMeansOfDisposal()); 
//					renewAbstractInfo.setEstimateDepthOfBorewell(abstractInfo.getEstimateDepthOfBorewell());
//					renewAbstractInfo.setDiameterOfBorewell(abstractInfo.getDiameterOfBorewell());
//					renewAbstractInfo.setArtesianSupply(abstractInfo.getArtesianSupply());
//					renewAbstractInfo.setGeologicalStrait(abstractInfo.getGeologicalStrait());
//					renewAbstractInfo.setMethodOfAbstractingWater(abstractInfo.getMethodOfAbstractingWater());
//					renewAbstractInfo.setMaxDailyQuant(abstractInfo.getMaxDailyQuant());
//					renewAbstractInfo.setTypeOfAppratusProposed(abstractInfo.getTypeOfAppratusProposed());
//					renewAbstractInfo.setOtherInformation(abstractInfo.getOtherInformation());
//					renewAbstractInfo.setRequestToSupplyWater(abstractInfo.getRequestToSupplyWater());
//					renewAbstractInfo.setAuthorityInformation(abstractInfo.getAuthorityInformation());
//					renewAbstractInfo.setDateOfSign(abstractInfo.getDateOfSign());
//					renewAbstractInfo.setWraApplicationId(wraRenewalApplicationId);
//					LicenceToAbstractInfoLocalServiceUtil.updateLicenceToAbstractInfo(renewAbstractInfo);
//					
//			 }
//			 
//			 //add more first
//		    List<WRAReqIrrigation> wraReqIrr=null;
//			 WRAReqIrrigation renewWraReqIrr=null;
//			 try {
//				  wraReqIrr= WRAReqIrrigationLocalServiceUtil.getWaterRequired_BY_AppId(wraApplicationId);
//			  } catch (Exception e) {}
//			 
//			 if(wraReqIrr!=null) {
//				 for(WRAReqIrrigation wraIrrigation:wraReqIrr) {
//					 renewWraReqIrr= WRAReqIrrigationLocalServiceUtil.createWRAReqIrrigation(CounterLocalServiceUtil.increment());
//					 renewWraReqIrr.setCounter(wraIrrigation.getCounter());
//					 renewWraReqIrr.setAbstractAreaIrrigated(wraIrrigation.getAbstractAreaIrrigated());
//					 renewWraReqIrr.setAbstractSystemIrrigated(wraIrrigation.getAbstractSystemIrrigated());
//					 renewWraReqIrr.setWraApplicationId(wraRenewalApplicationId);
//					 WRAReqIrrigationLocalServiceUtil.updateWRAReqIrrigation(renewWraReqIrr);
//					
//				 }
//			 }
//
//		 }
		 if(wraApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
			 
			 PermitToDrillAWell permitToDrillAWell =null;
			 PermitToDrillAWell renewPermitToDrillAWell =null;
			 
			 try {
	    			permitToDrillAWell=PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
				} catch (Exception e) {}
			 try {
				 renewPermitToDrillAWell=PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
				} catch (Exception e) {}
			 
			 if(permitToDrillAWell!=null) {
				 
				    renewPermitToDrillAWell.setPermitDrillApplicationNum(permitToDrillAWell.getPermitDrillApplicationNum());
				    renewPermitToDrillAWell.setPermitDrillingApplicantName(permitToDrillAWell.getPermitDrillingApplicantName());
				    renewPermitToDrillAWell.setPermitDrillingMailingAddParish(permitToDrillAWell.getPermitDrillingMailingAddParish());
				    renewPermitToDrillAWell.setPermitDrillingMailingAddress(permitToDrillAWell.getPermitDrillingMailingAddress());
				    renewPermitToDrillAWell.setPermitDrillingEmailAddress(permitToDrillAWell.getPermitDrillingEmailAddress());
				    renewPermitToDrillAWell.setPermitDrillingOfficePhone(permitToDrillAWell.getPermitDrillingOfficePhone());
				    renewPermitToDrillAWell.setPermitDrillingMobilePhone(permitToDrillAWell.getPermitDrillingMobilePhone());
				    renewPermitToDrillAWell.setWellDrillingHomePhone(permitToDrillAWell.getWellDrillingHomePhone());
				    renewPermitToDrillAWell.setPermitDrillingWorkLocation(permitToDrillAWell.getPermitDrillingWorkLocation());
				    renewPermitToDrillAWell.setPermitDrillingLocation(permitToDrillAWell.getPermitDrillingLocation());
				    renewPermitToDrillAWell.setPermitDrillingNature(permitToDrillAWell.getPermitDrillingNature());
				    renewPermitToDrillAWell.setPermitDrillingContractorName(permitToDrillAWell.getPermitDrillingContractorName());
				    renewPermitToDrillAWell.setPermitDrillContractAddress(permitToDrillAWell.getPermitDrillContractAddress());
				    renewPermitToDrillAWell.setPermitDrillingContractorAdd(permitToDrillAWell.getPermitDrillingContractorAdd());
				    renewPermitToDrillAWell.setPermitDrillingPurpose(permitToDrillAWell.getPermitDrillingPurpose());
				    renewPermitToDrillAWell.setPermitDrillingBoreholeDepth(permitToDrillAWell.getPermitDrillingBoreholeDepth());
				    renewPermitToDrillAWell.setPermitDrillingDiameterBorehole(permitToDrillAWell.getPermitDrillingDiameterBorehole());
				    renewPermitToDrillAWell.setPermitDrillingMethod(permitToDrillAWell.getPermitDrillingMethod());
				    renewPermitToDrillAWell.setPermitDrillingConstMethod(permitToDrillAWell.getPermitDrillingConstMethod());
				    renewPermitToDrillAWell.setPermitDrillingSupplies(permitToDrillAWell.getPermitDrillingSupplies());
				    renewPermitToDrillAWell.setPermitDrillingTechnicalInfo(permitToDrillAWell.getPermitDrillingTechnicalInfo());
				    renewPermitToDrillAWell.setPermitDrillingCubic(permitToDrillAWell.getPermitDrillingCubic());
				    renewPermitToDrillAWell.setPermitDrillingAuthority(permitToDrillAWell.getPermitDrillingAuthority());
				    renewPermitToDrillAWell.setPermitDrillingSignDate(permitToDrillAWell.getPermitDrillingSignDate());
				    renewPermitToDrillAWell.setWraApplicationId(wraRenewalApplicationId);
				    PermitToDrillAWellLocalServiceUtil.updatePermitToDrillAWell(renewPermitToDrillAWell);
			 }
			 
		 }
		 
		 if(wraApplication.getTypeOfApplication().equals("Application for a Well Drillers Licence")) {
			 
			 LicenceToWellDriller licenceToDrillAWell = null;
			 LicenceToWellDriller renewLicenceToDrillAWell = null;
			 
			 try {
				 licenceToDrillAWell= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
				} catch (Exception e) {}
			 try {
				 renewLicenceToDrillAWell= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
				} catch (Exception e) {}
			 
			 if(licenceToDrillAWell!=null) {
				    renewLicenceToDrillAWell.setWellDrillingApplicationNo(licenceToDrillAWell.getWellDrillingApplicationNo());
					renewLicenceToDrillAWell.setPermitDrillingApplicantName(licenceToDrillAWell.getPermitDrillingApplicantName());
					renewLicenceToDrillAWell.setPermitDrillingAddressParish(licenceToDrillAWell.getPermitDrillingAddressParish());
					renewLicenceToDrillAWell.setPermitDrillingApplicantAddress(licenceToDrillAWell.getPermitDrillingApplicantAddress());
					renewLicenceToDrillAWell.setPermitDrillingDOBDate(licenceToDrillAWell.getPermitDrillingDOBDate());
					renewLicenceToDrillAWell.setPermitDrillingEducational(licenceToDrillAWell.getPermitDrillingEducational());
					renewLicenceToDrillAWell.setPermitDrillingSpecificTraining(licenceToDrillAWell.getPermitDrillingSpecificTraining());
					renewLicenceToDrillAWell.setPermitDrillingSpecificExp(licenceToDrillAWell.getPermitDrillingSpecificExp());
					renewLicenceToDrillAWell.setPermitDrillingSelfEmployed(licenceToDrillAWell.getPermitDrillingSelfEmployed());
					renewLicenceToDrillAWell.setPermitDrillingName(licenceToDrillAWell.getPermitDrillingName());
					renewLicenceToDrillAWell.setPermitDrillingPresentEmployer(licenceToDrillAWell.getPermitDrillingPresentEmployer());
					renewLicenceToDrillAWell.setPermitDrillingEmployerAddress(licenceToDrillAWell.getPermitDrillingEmployerAddress());
					renewLicenceToDrillAWell.setPermitDrillingFirstRefName(licenceToDrillAWell.getPermitDrillingFirstRefName());
					renewLicenceToDrillAWell.setPermitDrillingFirstRefAdd(licenceToDrillAWell.getPermitDrillingFirstRefAdd());
					renewLicenceToDrillAWell.setPermitDrillingSecondRefName(licenceToDrillAWell.getPermitDrillingSecondRefName());
					renewLicenceToDrillAWell.setPermitDrillingSecondRefAdd(licenceToDrillAWell.getPermitDrillingSecondRefAdd());
					renewLicenceToDrillAWell.setPermitDrillingSignatureDate(licenceToDrillAWell.getPermitDrillingSignatureDate());
					renewLicenceToDrillAWell.setWraApplicationId(wraRenewalApplicationId);
					LicenceToWellDrillerLocalServiceUtil.updateLicenceToWellDriller(renewLicenceToDrillAWell);
			 }
			 
		 }
	
}
		
}		
		
		
		
	
