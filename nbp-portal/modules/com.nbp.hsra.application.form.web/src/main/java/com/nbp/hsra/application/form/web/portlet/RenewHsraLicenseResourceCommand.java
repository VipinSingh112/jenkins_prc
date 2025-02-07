package com.nbp.hsra.application.form.web.portlet;

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
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationWorkflowConstant;
import com.nbp.hsra.application.service.exception.NoSuchQualityProficiencyDetailException;
import com.nbp.hsra.application.service.model.AddMedicalPractitioner;
import com.nbp.hsra.application.service.model.AlternateRsoAdd;
import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;
import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.GenEquipmentData;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;
import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;
import com.nbp.hsra.application.service.model.NotifiLegalInfo;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.QualifedExpertAdd;
import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.model.QualityDeclarationInfo;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.model.RadiationDeclaration;
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.model.RadionuclideAdd;
import com.nbp.hsra.application.service.model.RadionuclideInfo;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;
import com.nbp.hsra.application.service.model.SourcesDetailAdd;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.service.AddMedicalPractitionerLocalServiceUtil;
import com.nbp.hsra.application.service.service.AlternateRsoAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.AlternateRsoOneAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.BrokerDeclarationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;
import com.nbp.hsra.application.service.service.GenEquipmentDataLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationCurrentStageLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.MedicalPractitionerAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.NotifiLegalInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualifedExpertAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualifedExpertOneAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityDeclarationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadionuclideAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadionuclideInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.SourcesDetailAddLocalServiceUtil;
import com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil;
import com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil;
import com.nbp.hsra.application.util.HsraApplicationDataCreationUtil;
import com.nbp.hsra.application.util.HsraApplicationDocumentsCopyUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/renew/license" }, service = MVCResourceCommand.class)

public class RenewHsraLicenseResourceCommand implements MVCResourceCommand {
	static Log _log = LogFactoryUtil.getLog(RenewHsraLicenseResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "HSRA Supporting Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("-------------------inside resource command renew---------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String typeOfApplicant=ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String riskLevel=ParamUtil.getString(resourceRequest,"riskLevel");
		String registrationDate=ParamUtil.getString(resourceRequest,"registrationDate");
		String brokerTransactionType=ParamUtil.getString(resourceRequest,"brokerTransactionType");

		HsraApplication  hsraApplication =null;
		HsraApplication  hsraApplicationRenewalProcess =null;
		String renewal=null;
		
		long hsraApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					System.out.println("-------------if licence no is not null-----------------");
					hsraApplication =HsraApplicationLocalServiceUtil.getHsraByAppNum(licenseNumber);
				}
			
				hsraApplicationId=hsraApplication.getHsraApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(hsraApplication)) {
				System.out.println("--------------inside jtb application if it is  null -----------------");
				if (Validator.isNull(licenseNumber)){
					System.out.println("---------------------if licence no. not written-----------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
				renewal="true";
				String renewUrl =HsraApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,typeOfApplicant,riskLevel,renewal,registrationDate,brokerTransactionType);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(hsraApplication.getStatus()==HSRAApplicationWorkflowConstant.SUBMITTED) {
					renewal="true";
					System.out.println("---------------------------after successfully submitted-----------------------");
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							hsraApplicationRenewalProcess = HsraApplicationLocalServiceUtil.getHsraByRT_AppNo(HSRAApplicationWorkflowConstant.RENEW_APPLICATION,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(hsraApplicationRenewalProcess==null) {
						HsraApplicationCurrentStage renewCurrentStage=null;
						renewCurrentStage= HsraApplicationCurrentStageLocalServiceUtil.createHsraApplicationCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						
		
						System.out.println("---------------------after application form detail----------------");
						
						if(hsraApplication.getTypeOfApplication().equals("Brokers")) {
							 renewCurrentStage.setLastFormStep("childStep20");
						}
						if(hsraApplication.getTypeOfApplication().equals("Qualified Experts")) {
							 renewCurrentStage.setLastFormStep("childStep22");
						}
						
						if(hsraApplication.getTypeOfApplicant().equals("Users of Radiation Sources")||hsraApplication.getTypeOfApplicant().equals("Service Providers")) {
							renewCurrentStage.setLastFormStep("childStep1");
						}
	
						
							
						hsraApplicationRenewalProcess=HsraApplicationLocalServiceUtil.createHsraApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						hsraApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						hsraApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						hsraApplicationRenewalProcess.setCreateDate(new Date());
						hsraApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						hsraApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						hsraApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						hsraApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						hsraApplicationRenewalProcess.setTypeOfTransaction(HSRAApplicationWorkflowConstant.RENEW_APPLICATION);
						hsraApplicationRenewalProcess.setStatus(HSRAApplicationWorkflowConstant.DRAFT);
						hsraApplicationRenewalProcess.setTypeOfApplicant(hsraApplication.getTypeOfApplicant());
						hsraApplicationRenewalProcess.setHighOne(hsraApplication.getHighOne());
						hsraApplicationRenewalProcess.setBrokerTransactionType(hsraApplication.getBrokerTransactionType());
						hsraApplicationRenewalProcess.setHighTwo(hsraApplication.getHighTwo());
						hsraApplicationRenewalProcess.setMedium(hsraApplication.getMedium());
						hsraApplicationRenewalProcess.setLowOne(hsraApplication.getLowOne());
						hsraApplicationRenewalProcess.setLowTwo(hsraApplication.getLowTwo());
						hsraApplicationRenewalProcess.setRiskLevel(hsraApplication.getRiskLevel());
						hsraApplicationRenewalProcess.setSpecificApplicable(hsraApplication.getSpecificApplicable());
						try {
							if (Validator.isNotNull(registrationDate)) {
								System.out.println("-----------------inside date condition------------------");
								hsraApplicationRenewalProcess.setExpiredDate(new SimpleDateFormat("yyyy-MM-dd").parse(registrationDate));
							}
						} catch (Exception e) {
						}
						
					
						HsraApplicationLocalServiceUtil.updateHsraApplication(hsraApplicationRenewalProcess);
						renewCurrentStage.setHsraApplicationId(hsraApplicationRenewalProcess.getHsraApplicationId());
						HsraApplicationCurrentStageLocalServiceUtil.updateHsraApplicationCurrentStage(renewCurrentStage);
		
						
						
						copyingDataFromOriginalApplication(hsraApplication.getHsraApplicationId(), hsraApplicationRenewalProcess.getHsraApplicationId(),brokerTransactionType);
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
									String.valueOf(hsraApplicationId));

							

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											hsraApplicationRenewalProcess.getHsraApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							HsraApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
										 hsraApplicationRenewalProcess.getHsraApplicationId()),
									     supportingDocsMainFolder.getDescription(), serviceContext,
									     supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									     hsraApplicationRenewalProcess.getHsraApplicationId());

						}
					}
					
					String renewLicenseUrl = 
							 "/group/guest/hsra-application-form?hsraApplicationId="
									+hsraApplicationRenewalProcess.getHsraApplicationId()+"&renewal="+renewal;
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				
				
				} else {
					System.out.println("-------------------form not submitted----------------going in else-------------------");
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
	
	public static void copyingDataFromOriginalApplication(long hsraApplicationId,
			long hsraRenewalApplicationId, String brokerTransactionType) {
		
		 System.out.println("Hsra renew app id*****"+hsraRenewalApplicationId);
		 
		 HsraApplication  hsraApplication =null;
			
			try {
				hsraApplication = HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
			}catch(Exception e) {}
			
			if(hsraApplication.getTypeOfApplicant().equals("Brokers")) {
			
			BrokerRegistrationInfo brokerRegst = null;
			BrokerRegistrationInfo renewBrokerRegst = null;
			try {
				brokerRegst = BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {}
			try {
				renewBrokerRegst = BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {}
			
			if(renewBrokerRegst!=null) {
				
				if(brokerTransactionType.equals("Renewal")) {
					System.out.println("-----------------inside renewal --brokerTransactionType--------");
				renewBrokerRegst.setApplicationTypes("Renewal");
				}else if(brokerTransactionType.equals("Variation")) {
				renewBrokerRegst.setApplicationTypes("Variation");
				}
				renewBrokerRegst.setOrganizationNameD(brokerRegst.getOrganizationNameD());
				renewBrokerRegst.setBusinessPlace(brokerRegst.getBusinessPlace());
				renewBrokerRegst.setOrganizationTrn(brokerRegst.getOrganizationTrn());
				renewBrokerRegst.setOrganizationTeleNum(brokerRegst.getOrganizationTeleNum());
				renewBrokerRegst.setOrganizationFaxNum(brokerRegst.getOrganizationFaxNum());
				renewBrokerRegst.setOrganizationEmailAdd(brokerRegst.getOrganizationEmailAdd());
				renewBrokerRegst.setBusinessTypeBroker(brokerRegst.getBusinessTypeBroker());
				renewBrokerRegst.setBusinessNumberBroker(brokerRegst.getBusinessNumberBroker());
				renewBrokerRegst.setCorporationNumberBroker(brokerRegst.getCorporationNumberBroker());
				renewBrokerRegst.setPublicActBroker(brokerRegst.getPublicActBroker());
				renewBrokerRegst.setLicenceNumberBroker(brokerRegst.getLicenceNumberBroker());
				renewBrokerRegst.setExpirationDateBroker(brokerRegst.getExpirationDateBroker());
				renewBrokerRegst.setRadioactiveMaterial(brokerRegst.getRadioactiveMaterial());
				renewBrokerRegst.setNuclearMaterial(brokerRegst.getNuclearMaterial());
				renewBrokerRegst.setNuclearTechnology(brokerRegst.getNuclearTechnology());
				renewBrokerRegst.setIonizingApparatus(brokerRegst.getIonizingApparatus());
				renewBrokerRegst.setRadiationSource(brokerRegst.getRadiationSource());
				renewBrokerRegst.setOrganizationTransfer(brokerRegst.getOrganizationTransfer());
				renewBrokerRegst.setNuclearProtection(brokerRegst.getNuclearProtection());
				renewBrokerRegst.setStorageFacility(brokerRegst.getStorageFacility());
				renewBrokerRegst.setAdditionalInformation(brokerRegst.getAdditionalInformation());
				renewBrokerRegst.setHsraApplicationId(hsraRenewalApplicationId);
				BrokerRegistrationInfoLocalServiceUtil.updateBrokerRegistrationInfo(renewBrokerRegst);
			}
			
			BrokerDeclarationInfo brokerDeclare = null;
			BrokerDeclarationInfo renewBrokerDeclare = null;
			
			try {
				brokerDeclare = BrokerDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {
			}
			try {
				renewBrokerDeclare = BrokerDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {
			}
			
			if(brokerDeclare!=null) {
				renewBrokerDeclare.setBrokerOperatorName(brokerDeclare.getBrokerOperatorName());
				renewBrokerDeclare.setBrokerTitle(brokerDeclare.getBrokerTitle());
				renewBrokerDeclare.setSignDate(brokerDeclare.getSignDate());
				renewBrokerDeclare.setHsraApplicationId(hsraRenewalApplicationId);
				BrokerDeclarationInfoLocalServiceUtil.updateBrokerDeclarationInfo(renewBrokerDeclare);
			}
			
			}
			
			if(hsraApplication.getTypeOfApplicant().equals("Qualified Experts")) {
				
				//form 1
				
				QualityApplicantDetail qualityApplicant = null;
				QualityApplicantDetail renewQualityApplicant = null;
				
				try {
					qualityApplicant = QualityApplicantDetailLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewQualityApplicant = QualityApplicantDetailLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				if(qualityApplicant!=null) {
					renewQualityApplicant.setExpertSurname(qualityApplicant.getExpertSurname());
					renewQualityApplicant.setExpertFirstName(qualityApplicant.getExpertFirstName());
					renewQualityApplicant.setExpertId(qualityApplicant.getExpertId());
					renewQualityApplicant.setExpertPosition(qualityApplicant.getExpertPosition());
					renewQualityApplicant.setExpertTelephone(qualityApplicant.getExpertTelephone());
					renewQualityApplicant.setExpertMobile(qualityApplicant.getExpertMobile());
					renewQualityApplicant.setExpertEmail(qualityApplicant.getExpertEmail());
					renewQualityApplicant.setExpertDate(qualityApplicant.getExpertDate());
					renewQualityApplicant.setHsraApplicationId(hsraRenewalApplicationId);
					QualityApplicantDetailLocalServiceUtil.updateQualityApplicantDetail(renewQualityApplicant);
				}
				
				//form 2
				
				QualityEmploymentInfo employmentDetails = null;
				QualityEmploymentInfo renewEmploymentDetails = null;
				
				try {
					employmentDetails = QualityEmploymentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewEmploymentDetails = QualityEmploymentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				if(employmentDetails!=null) {
					renewEmploymentDetails.setCompanyName(employmentDetails.getCompanyName());
					renewEmploymentDetails.setTeleNo(employmentDetails.getTeleNo());
					renewEmploymentDetails.setAddress(employmentDetails.getAddress());
					renewEmploymentDetails.setParish(employmentDetails.getParish());
					renewEmploymentDetails.setMobileNo(employmentDetails.getMobileNo());
					renewEmploymentDetails.setEmailAddress(employmentDetails.getEmailAddress());
					renewEmploymentDetails.setHsraApplicationId(hsraRenewalApplicationId);
					QualityEmploymentInfoLocalServiceUtil.updateQualityEmploymentInfo(renewEmploymentDetails);	
				}
				
				//form 3
				QualityProficiencyDetail proficiencyDetail = null;
				QualityProficiencyDetail renewProficiencyDetail = null;
				
				try {
					proficiencyDetail = QualityProficiencyDetailLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (NoSuchQualityProficiencyDetailException e) {
				}
				try {
					renewProficiencyDetail = QualityProficiencyDetailLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (NoSuchQualityProficiencyDetailException e) {
				}
				if(proficiencyDetail!=null) {
					renewProficiencyDetail.setProficiencyDetails(proficiencyDetail.getProficiencyDetails());
					renewProficiencyDetail.setWorkDurationOne(proficiencyDetail.getWorkDurationOne());
					renewProficiencyDetail.setCapacityOne(proficiencyDetail.getCapacityOne());
					renewProficiencyDetail.setWorkDurationTwo(proficiencyDetail.getWorkDurationTwo());
					renewProficiencyDetail.setCapacityTwo(proficiencyDetail.getCapacityTwo());
					renewProficiencyDetail.setWorkDurationThree(proficiencyDetail.getWorkDurationThree());
					renewProficiencyDetail.setCapacityThree(proficiencyDetail.getCapacityThree());
					renewProficiencyDetail.setWorkDurationFour(proficiencyDetail.getWorkDurationFour());
					renewProficiencyDetail.setCapacityFour(proficiencyDetail.getCapacityFour());
					renewProficiencyDetail.setWorkDurationFive(proficiencyDetail.getWorkDurationFive());
					renewProficiencyDetail.setCapacityFive(proficiencyDetail.getCapacityFive());
					renewProficiencyDetail.setWorkDurationSix(proficiencyDetail.getWorkDurationSix());
					renewProficiencyDetail.setCapacitySix(proficiencyDetail.getCapacitySix());
					renewProficiencyDetail.setWorkDurationSeven(proficiencyDetail.getWorkDurationSeven());
					renewProficiencyDetail.setCapacitySeven(proficiencyDetail.getCapacitySeven());
					renewProficiencyDetail.setWorkDurationEight(proficiencyDetail.getWorkDurationEight());
					renewProficiencyDetail.setCapacityEight(proficiencyDetail.getCapacityEight());
					renewProficiencyDetail.setWorkDurationNine(proficiencyDetail.getWorkDurationNine());
					renewProficiencyDetail.setCapacityNine(proficiencyDetail.getCapacityNine());
					renewProficiencyDetail.setWorkDurationTen(proficiencyDetail.getWorkDurationTen());
					renewProficiencyDetail.setCapacityTen(proficiencyDetail.getCapacityTen());
					renewProficiencyDetail.setWorkDurationEleven(proficiencyDetail.getWorkDurationEleven());
					renewProficiencyDetail.setCapacityEleven(proficiencyDetail.getCapacityEleven());
					renewProficiencyDetail.setWorkDurationTwelve(proficiencyDetail.getWorkDurationTwelve());
					renewProficiencyDetail.setCapacityTwelve(proficiencyDetail.getCapacityTwelve());
					renewProficiencyDetail.setHsraApplicationId(hsraRenewalApplicationId);
					QualityProficiencyDetailLocalServiceUtil.updateQualityProficiencyDetail(renewProficiencyDetail);
				}
				
				//FORM 4
				
				QualityDeclarationInfo qualityDeclare = null;
				QualityDeclarationInfo renewQualityDeclare = null;
				try {
					qualityDeclare = QualityDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewQualityDeclare = QualityDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				
				if(qualityDeclare!=null) {
					renewQualityDeclare.setDeclarationSignDate(qualityDeclare.getDeclarationSignDate());
					renewQualityDeclare.setHsraApplicationId(hsraRenewalApplicationId);
					QualityDeclarationInfoLocalServiceUtil.updateQualityDeclarationInfo(renewQualityDeclare);
				}
			}
			if(hsraApplication.getTypeOfApplicant().equals("Users of Radiation Sources")||hsraApplication.getTypeOfApplicant().equals("Service Providers")) {
				//form 1
				
				RadiationProtectionSecOne radSectionOne=null;
				RadiationProtectionSecOne renewRadSectionOne=null;
				
				try {
					radSectionOne= RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
				}catch (Exception e) {
				}
				try {
					renewRadSectionOne= RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
				}catch (Exception e) {
				}
				
				
				if(radSectionOne!=null) {
					
					renewRadSectionOne.setCurrentAuthNum(radSectionOne.getCurrentAuthNum());
					renewRadSectionOne.setReasonForAmendment(radSectionOne.getReasonForAmendment());
					renewRadSectionOne.setHsraApplicationId(hsraRenewalApplicationId);
					RadiationProtectionSecOneLocalServiceUtil.updateRadiationProtectionSecOne(renewRadSectionOne);
				}
				
				
				//form 2
				DetailOfApplicantSecTwo applicantDetail = null;
				DetailOfApplicantSecTwo renewApplicantDetail = null;
				
				try {
					applicantDetail = DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewApplicantDetail = DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				if(applicantDetail!=null) {
					renewApplicantDetail.setOrganizationName(applicantDetail.getOrganizationName());
					renewApplicantDetail.setNuclearMailingAddr(applicantDetail.getNuclearMailingAddr());
					renewApplicantDetail.setParish(applicantDetail.getParish());
					renewApplicantDetail.setNuclearTrnNumber(applicantDetail.getNuclearTrnNumber());
					renewApplicantDetail.setNuclearTelephoneNo(applicantDetail.getNuclearTelephoneNo());
					renewApplicantDetail.setNuclearFaxNo(applicantDetail.getNuclearFaxNo());
					renewApplicantDetail.setNuclearEmailAddr(applicantDetail.getNuclearEmailAddr());
					renewApplicantDetail.setHsraApplicationId(hsraRenewalApplicationId);
					DetailOfApplicantSecTwoLocalServiceUtil.updateDetailOfApplicantSecTwo(renewApplicantDetail);
				}
				
				//form 3
				DetailOfBusinessSecThree detailOfBusiness = null;
				DetailOfBusinessSecThree renewDetailOfBusiness = null;
				try {
					detailOfBusiness = DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewDetailOfBusiness = DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				
				if(detailOfBusiness!=null) {
					renewDetailOfBusiness.setBusinessType(detailOfBusiness.getBusinessType());
					renewDetailOfBusiness.setNuclearBusinessNumber(detailOfBusiness.getNuclearBusinessNumber());
					renewDetailOfBusiness.setNuclearCorporationNum(detailOfBusiness.getNuclearCorporationNum());
					renewDetailOfBusiness.setNuclearPublicAct(detailOfBusiness.getNuclearPublicAct());
					renewDetailOfBusiness.setNuclearName(detailOfBusiness.getNuclearName());
					renewDetailOfBusiness.setNuclearAddressThird(detailOfBusiness.getNuclearAddressThird());
					renewDetailOfBusiness.setNuclearThirdParish(detailOfBusiness.getNuclearThirdParish());
					renewDetailOfBusiness.setNuclearTelephoneNum(detailOfBusiness.getNuclearTelephoneNum());
					renewDetailOfBusiness.setNuclearfaxNumber(detailOfBusiness.getNuclearfaxNumber());
					renewDetailOfBusiness.setNuclearEmailAdd(detailOfBusiness.getNuclearEmailAdd());
					renewDetailOfBusiness.setNuclearFinancial(detailOfBusiness.getNuclearFinancial());
					renewDetailOfBusiness.setHsraApplicationId(hsraRenewalApplicationId);
					DetailOfBusinessSecThreeLocalServiceUtil.updateDetailOfBusinessSecThree(renewDetailOfBusiness);
				}
				
				
				//form 4
				PurposeOfPropLicence purposeLicence = null;
				PurposeOfPropLicence renewPurposeLicence = null;
				
				try {
					purposeLicence = PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				try {
					renewPurposeLicence = PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
				} catch (Exception e) {
				}
				
				if(purposeLicence!=null) {
					
					renewPurposeLicence.setNuclearRegstLic(purposeLicence.getNuclearRegstLic());
					renewPurposeLicence.setNuclearBusinessPlace(purposeLicence.getNuclearBusinessPlace());
					renewPurposeLicence.setNuclearActivityMainAdd(purposeLicence.getNuclearActivityMainAdd());
					renewPurposeLicence.setApplicationType(purposeLicence.getApplicationType());
					renewPurposeLicence.setNuclearAdditionalLoc(purposeLicence.getNuclearAdditionalLoc());
					renewPurposeLicence.setHsraApplicationId(hsraRenewalApplicationId);
					PurposeOfPropLicenceLocalServiceUtil.updatePurposeOfPropLicence(renewPurposeLicence);
				}
				
				//add more First
				
				List<UnsealedSourceAdd>unsealedInfo=null;
				  UnsealedSourceAdd renewUnsealedInfo=null;
				
				  try {
			        	unsealedInfo=UnsealedSourceAddLocalServiceUtil.getHsraById(hsraApplicationId);
			        } catch (Exception e) {
					}
				  
				  if(unsealedInfo!=null) {
					  for(UnsealedSourceAdd unsealed : unsealedInfo) {
						  renewUnsealedInfo=UnsealedSourceAddLocalServiceUtil.createUnsealedSourceAdd(CounterLocalServiceUtil.increment());
						  renewUnsealedInfo.setCounter(unsealed.getCounter());
						  renewUnsealedInfo.setUnsealedSourcesRadionu(unsealed.getUnsealedSourcesRadionu());
						  renewUnsealedInfo.setUnsealedSourcesActivity(unsealed.getUnsealedSourcesActivity());
						  renewUnsealedInfo.setUnsealedSourcesTotalYear(unsealed.getUnsealedSourcesTotalYear());
						  renewUnsealedInfo.setUnsealedSourcesUse(unsealed.getUnsealedSourcesUse());
						  renewUnsealedInfo.setHsraApplicationId(hsraRenewalApplicationId);
				          UnsealedSourceAddLocalServiceUtil.updateUnsealedSourceAdd(renewUnsealedInfo);
					 }
				  }
				  
				  //add more second
				  
			       List<SealedSourcesAdd> sealedInfo = null;
					SealedSourcesAdd renewSealedInfo = null;
					try {
						sealedInfo = SealedSourcesAddLocalServiceUtil.getHsraById(hsraApplicationId);
					} catch (Exception e) {
					}

					
					if(sealedInfo!=null) {
						for(SealedSourcesAdd sealed : sealedInfo) {
							renewSealedInfo = SealedSourcesAddLocalServiceUtil.createSealedSourcesAdd(CounterLocalServiceUtil.increment());
							renewSealedInfo.setCounter(sealed.getCounter());
							renewSealedInfo.setSealedSourcesRadionu(sealed.getSealedSourcesRadionu());
							renewSealedInfo.setSealedSourcesMaxActivity(sealed.getSealedSourcesMaxActivity());
							renewSealedInfo.setSealedSourcesActivityDate(sealed.getSealedSourcesActivityDate());
							renewSealedInfo.setSealedSourcesCategories(sealed.getSealedSourcesCategories());
							renewSealedInfo.setSealedSourcesUse(sealed.getSealedSourcesUse());
							renewSealedInfo.setHsraApplicationId(hsraRenewalApplicationId);
							SealedSourcesAddLocalServiceUtil.updateSealedSourcesAdd(renewSealedInfo);
							
						}
					}
                  
					//add more third
				
				List<RadiationDevicesAdd> raditionDeviceInfo=null;
					RadiationDevicesAdd renewRaditionDeviceInfo=null;
				   
					 try {
				        	raditionDeviceInfo=RadiationDevicesAddLocalServiceUtil.getHsraById(hsraApplicationId);
				        } catch (Exception e) {
						}
					 
					 if(raditionDeviceInfo!=null) {
						 
						 for(RadiationDevicesAdd radiation : raditionDeviceInfo) {
							renewRaditionDeviceInfo=RadiationDevicesAddLocalServiceUtil.createRadiationDevicesAdd(CounterLocalServiceUtil.increment());
							renewRaditionDeviceInfo.setCounter(radiation.getCounter());
							renewRaditionDeviceInfo.setRadiationDevicesRadio(radiation.getRadiationDevicesRadio());
							renewRaditionDeviceInfo.setRadiationDevicesMaxActivity(radiation.getRadiationDevicesMaxActivity());
							renewRaditionDeviceInfo.setRadiationDevicesManufacturer(radiation.getRadiationDevicesManufacturer());
							renewRaditionDeviceInfo.setRadiationDevicesName(radiation.getRadiationDevicesName());
							renewRaditionDeviceInfo.setRadiationDevicesModelNo(radiation.getRadiationDevicesModelNo());
							renewRaditionDeviceInfo.setRadiationDevicesNumber(radiation.getRadiationDevicesNumber());
							renewRaditionDeviceInfo.setRadiationDevicesUse(radiation.getRadiationDevicesUse());
							renewRaditionDeviceInfo.setHsraApplicationId(hsraRenewalApplicationId);
					        RadiationDevicesAddLocalServiceUtil.updateRadiationDevicesAdd(renewRaditionDeviceInfo);
						 
						 }
						 
					 }
					 
					 //form 5
					 
					 RadiationSafetyProgram radiationSafetyProgram = null;
					 RadiationSafetyProgram renewRadiationSafetyProgram = null;
						try {
							radiationSafetyProgram = RadiationSafetyProgramLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						try {
							renewRadiationSafetyProgram = RadiationSafetyProgramLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						
						if(radiationSafetyProgram!=null) {
							renewRadiationSafetyProgram.setNuclearRsoName(radiationSafetyProgram.getNuclearRsoName());
							renewRadiationSafetyProgram.setNuclearRsoTitle(radiationSafetyProgram.getNuclearRsoTitle());
							renewRadiationSafetyProgram.setNuclearRsoTeleNo(radiationSafetyProgram.getNuclearRsoTeleNo());
							renewRadiationSafetyProgram.setNuclearRsoExt(radiationSafetyProgram.getNuclearRsoExt());
							renewRadiationSafetyProgram.setNuclearRsoFax(radiationSafetyProgram.getNuclearRsoFax());
							renewRadiationSafetyProgram.setNuclearRsoEmail(radiationSafetyProgram.getNuclearRsoEmail());
							renewRadiationSafetyProgram.setRsoDetails(radiationSafetyProgram.getRsoDetails());
							renewRadiationSafetyProgram.setQualifiedExpertName(radiationSafetyProgram.getQualifiedExpertName());
							renewRadiationSafetyProgram.setQualifiedExpertTitle(radiationSafetyProgram.getQualifiedExpertTitle());
							renewRadiationSafetyProgram.setQualifiedExpertTele(radiationSafetyProgram.getQualifiedExpertTele());
							renewRadiationSafetyProgram.setQualifiedExpertExt(radiationSafetyProgram.getQualifiedExpertExt());
							renewRadiationSafetyProgram.setQualifiedExpertFax(radiationSafetyProgram.getQualifiedExpertFax());
							renewRadiationSafetyProgram.setQualifiedExpertEmail(radiationSafetyProgram.getQualifiedExpertEmail());
							renewRadiationSafetyProgram.setQualifiedExpertRegstNo(radiationSafetyProgram.getQualifiedExpertRegstNo());
							renewRadiationSafetyProgram.setQualifiedExpertDate(radiationSafetyProgram.getQualifiedExpertDate());
							renewRadiationSafetyProgram.setQualifiedDetails(radiationSafetyProgram.getQualifiedDetails());
							renewRadiationSafetyProgram.setApplicantName(radiationSafetyProgram.getApplicantName());
							renewRadiationSafetyProgram.setApplicantTitle(radiationSafetyProgram.getApplicantTitle());
							renewRadiationSafetyProgram.setOtherLimitationAuth(radiationSafetyProgram.getOtherLimitationAuth());
							renewRadiationSafetyProgram.setOtherDate(radiationSafetyProgram.getOtherDate());
							renewRadiationSafetyProgram.setClassifiWorkersList(radiationSafetyProgram.getClassifiWorkersList());
							renewRadiationSafetyProgram.setRespiPleaseSpecify(radiationSafetyProgram.getRespiPleaseSpecify());
							renewRadiationSafetyProgram.setTongsPleaseSpecify(radiationSafetyProgram.getTongsPleaseSpecify());
							renewRadiationSafetyProgram.setScopeOfActivities(radiationSafetyProgram.getScopeOfActivities());
							renewRadiationSafetyProgram.setManagementSystem(radiationSafetyProgram.getManagementSystem());
							renewRadiationSafetyProgram.setWorkerRecordings(radiationSafetyProgram.getWorkerRecordings());
							renewRadiationSafetyProgram.setCategoriesLicence(radiationSafetyProgram.getCategoriesLicence());
							renewRadiationSafetyProgram.setRenewalsSummary(radiationSafetyProgram.getRenewalsSummary());
							renewRadiationSafetyProgram.setConstraintsLimits(radiationSafetyProgram.getConstraintsLimits());
							renewRadiationSafetyProgram.setEquipmentMonitoring(radiationSafetyProgram.getEquipmentMonitoring());
							renewRadiationSafetyProgram.setAreasControl(radiationSafetyProgram.getAreasControl());
							renewRadiationSafetyProgram.setRadioactiveSources(radiationSafetyProgram.getRadioactiveSources());
							renewRadiationSafetyProgram.setRadiationiInstruments(radiationSafetyProgram.getRadiationiInstruments());
							renewRadiationSafetyProgram.setHealthWorkers(radiationSafetyProgram.getHealthWorkers());
							renewRadiationSafetyProgram.setInvestigationLevel(radiationSafetyProgram.getInvestigationLevel());
							renewRadiationSafetyProgram.setPolicyDetails(radiationSafetyProgram.getPolicyDetails());
							renewRadiationSafetyProgram.setSecurityAccess(radiationSafetyProgram.getSecurityAccess());
							renewRadiationSafetyProgram.setRaditionSources(radiationSafetyProgram.getRaditionSources());
							renewRadiationSafetyProgram.setWorkerTraining(radiationSafetyProgram.getWorkerTraining());
							renewRadiationSafetyProgram.setPublicControl(radiationSafetyProgram.getPublicControl());
							renewRadiationSafetyProgram.setManagementSources(radiationSafetyProgram.getManagementSources());
							renewRadiationSafetyProgram.setEmergencyProcedure(radiationSafetyProgram.getEmergencyProcedure());
							renewRadiationSafetyProgram.setLicenceLocation(radiationSafetyProgram.getLicenceLocation());
							renewRadiationSafetyProgram.setAchievableProgram(radiationSafetyProgram.getAchievableProgram());
							renewRadiationSafetyProgram.setLeakedTestingSources(radiationSafetyProgram.getLeakedTestingSources());
							renewRadiationSafetyProgram.setTransferSources(radiationSafetyProgram.getTransferSources());
							renewRadiationSafetyProgram.setNuclearMaterials(radiationSafetyProgram.getNuclearMaterials());
							renewRadiationSafetyProgram.setTransportPackaging(radiationSafetyProgram.getTransportPackaging());
							renewRadiationSafetyProgram.setInternalReview(radiationSafetyProgram.getInternalReview());
							renewRadiationSafetyProgram.setSourcesActivities(radiationSafetyProgram.getSourcesActivities());
							renewRadiationSafetyProgram.setIndividualProtectiveEquipment(radiationSafetyProgram.getIndividualProtectiveEquipment());
							renewRadiationSafetyProgram.setResProPleaseSpecify(radiationSafetyProgram.getResProPleaseSpecify());
							renewRadiationSafetyProgram.setHsraApplicationId(hsraRenewalApplicationId);
							RadiationSafetyProgramLocalServiceUtil.updateRadiationSafetyProgram(renewRadiationSafetyProgram);
						}
					 
					 //add more 1
						
				List<AlternateRsoAdd> rasoInfo = null;
					 AlternateRsoAdd renewRasoInfo = null;
					 
					 try {
							rasoInfo = AlternateRsoAddLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
					 
					 if(rasoInfo!=null) {
						 for(AlternateRsoAdd alternateRso:rasoInfo) {
							renewRasoInfo = AlternateRsoAddLocalServiceUtil.createAlternateRsoAdd(CounterLocalServiceUtil.increment());
							renewRasoInfo.setCounter(alternateRso.getCounter());
						    renewRasoInfo.setAlternateRsoName(alternateRso.getAlternateRsoName());
						    renewRasoInfo.setAlternateRsoTitle(alternateRso.getAlternateRsoTitle());
						    renewRasoInfo.setAlternateRsoTelephone(alternateRso.getAlternateRsoTelephone());
						    renewRasoInfo.setAlternateRsoExt(alternateRso.getAlternateRsoExt());
						    renewRasoInfo.setAlternateRsoFax(alternateRso.getAlternateRsoFax());
							renewRasoInfo.setAlternateRsoEmailAdd(alternateRso.getAlternateRsoEmailAdd());
							renewRasoInfo.setHsraApplicationId(hsraRenewalApplicationId);
							AlternateRsoAddLocalServiceUtil.updateAlternateRsoAdd(renewRasoInfo);
						 
					 }
					 }
					 
					 //add more 2
				List<QualifedExpertAdd> expertInfo = null;
					 QualifedExpertAdd renewExpertInfo = null;
					 
					 try {
							expertInfo = QualifedExpertAddLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
					 
					 if(expertInfo!=null) {
						 for(QualifedExpertAdd qualified :expertInfo) {
							    renewExpertInfo = QualifedExpertAddLocalServiceUtil.createQualifedExpertAdd(CounterLocalServiceUtil.increment());
							    renewExpertInfo.setCounter(qualified.getCounter());
							    renewExpertInfo.setQualifedName(qualified.getQualifedName());
							    renewExpertInfo.setQualifedTitle(qualified.getQualifedTitle());
							    renewExpertInfo.setQualifedTelephone(qualified.getQualifedTelephone());
							    renewExpertInfo.setQualifedExt(qualified.getQualifedExt());
							    renewExpertInfo.setQualifedFax(qualified.getQualifedFax());
							    renewExpertInfo.setQualifedEmailAdd(qualified.getQualifedEmailAdd());
							    renewExpertInfo.setQualifedRegistrationNo(qualified.getQualifedRegistrationNo());
								renewExpertInfo.setQualifedExpirationDate(qualified.getQualifedExpirationDate());
								renewExpertInfo.setHsraApplicationId(hsraRenewalApplicationId);
								QualifedExpertAddLocalServiceUtil.updateQualifedExpertAdd(renewExpertInfo);
						 }
					 }
					 
					 //form 7
					 SpecificReqPropLicActivity specificRquirements = null;
					 SpecificReqPropLicActivity renewSpecificRquirements = null;
					 try {
						 specificRquirements = SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
					 try {
						 renewSpecificRquirements = SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
					 
					 if(specificRquirements!=null) {
						    renewSpecificRquirements.setAdminTreatment(specificRquirements.getAdminTreatment());
							renewSpecificRquirements.setQualityProgramme(specificRquirements.getQualityProgramme());
							renewSpecificRquirements.setInstructionsCaregivers(specificRquirements.getInstructionsCaregivers());
							renewSpecificRquirements.setInstructionsPatients(specificRquirements.getInstructionsPatients());
							renewSpecificRquirements.setPatientsRelease(specificRquirements.getPatientsRelease());
							renewSpecificRquirements.setTreatmentRooms(specificRquirements.getTreatmentRooms());
							renewSpecificRquirements.setMedicalEmergencies(specificRquirements.getMedicalEmergencies());
							renewSpecificRquirements.setNuclearMedicine(specificRquirements.getNuclearMedicine());
							renewSpecificRquirements.setDiagnosticStudies(specificRquirements.getDiagnosticStudies());
							renewSpecificRquirements.setBiomedicalResearch(specificRquirements.getBiomedicalResearch());
							renewSpecificRquirements.setResearchReview(specificRquirements.getResearchReview());
							renewSpecificRquirements.setEmergencyOperating(specificRquirements.getEmergencyOperating());
							
							renewSpecificRquirements.setCertificatePackages(specificRquirements.getCertificatePackages());
							renewSpecificRquirements.setExposureDevices(specificRquirements.getExposureDevices());
							renewSpecificRquirements.setEquipmentSafety(specificRquirements.getEquipmentSafety());
							renewSpecificRquirements.setTransportPlan(specificRquirements.getTransportPlan());
							renewSpecificRquirements.setAnimalsTreatment(specificRquirements.getAnimalsTreatment());
							renewSpecificRquirements.setAnimalHousing(specificRquirements.getAnimalHousing());
							renewSpecificRquirements.setDisposalWaste(specificRquirements.getDisposalWaste());
							renewSpecificRquirements.setMonitoringAnimalHousing(specificRquirements.getMonitoringAnimalHousing());
							renewSpecificRquirements.setReleaseAnimals(specificRquirements.getReleaseAnimals());
							renewSpecificRquirements.setProceduresApp(specificRquirements.getProceduresApp());
							renewSpecificRquirements.setDisposalsApp(specificRquirements.getDisposalsApp());
							renewSpecificRquirements.setMonitoringMaterialNu(specificRquirements.getMonitoringMaterialNu());
							
							renewSpecificRquirements.setHandlingProcedures(specificRquirements.getHandlingProcedures());
							renewSpecificRquirements.setHoppersEntry(specificRquirements.getHoppersEntry());
							renewSpecificRquirements.setOperatingConditions(specificRquirements.getOperatingConditions());
							renewSpecificRquirements.setInsertionType(specificRquirements.getInsertionType());
							renewSpecificRquirements.setInstallationFixed(specificRquirements.getInstallationFixed());
							renewSpecificRquirements.setTransportPlanGauge(specificRquirements.getTransportPlanGauge());
							renewSpecificRquirements.setEmergencyAddition(specificRquirements.getEmergencyAddition());
							renewSpecificRquirements.setNuclearEnviroment(specificRquirements.getNuclearEnviroment());
							renewSpecificRquirements.setFishingTool(specificRquirements.getFishingTool());
							renewSpecificRquirements.setSealedSources(specificRquirements.getSealedSources());
							renewSpecificRquirements.setAbandonmentZone(specificRquirements.getAbandonmentZone());
							renewSpecificRquirements.setServicingCopy(specificRquirements.getServicingCopy());
							
							renewSpecificRquirements.setManufacturingDevelopment(specificRquirements.getManufacturingDevelopment());
							renewSpecificRquirements.setHsraApplicationId(hsraRenewalApplicationId);
							SpecificReqPropLicActivityLocalServiceUtil.updateSpecificReqPropLicActivity(renewSpecificRquirements);
					 }
					 
					 
					 //add more 1
					 
				List<MedicalPractitionerAdd> medicalInfo = null;
					 MedicalPractitionerAdd renewMedicalInfo = null;
					 
					 try {
							medicalInfo = MedicalPractitionerAddLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
					
					 if(medicalInfo!=null) {
						 for(MedicalPractitionerAdd medicalPractice:medicalInfo) {
							 renewMedicalInfo = MedicalPractitionerAddLocalServiceUtil.createMedicalPractitionerAdd(CounterLocalServiceUtil.increment());
							 renewMedicalInfo.setCounter(medicalPractice.getCounter());
							 renewMedicalInfo.setMedicalPractitionerName(medicalPractice.getMedicalPractitionerName());
							 renewMedicalInfo.setMedicalPractitionerAddress(medicalPractice.getMedicalPractitionerAddress());
							 renewMedicalInfo.setMedicalPractitionerTelephone(medicalPractice.getMedicalPractitionerTelephone());
							 renewMedicalInfo.setMedicalPractitionerFax(medicalPractice.getMedicalPractitionerFax());
							 renewMedicalInfo.setMedicalPractitionerEmail(medicalPractice.getMedicalPractitionerEmail());
							 renewMedicalInfo.setMedicalPractitionerLicenceNo(medicalPractice.getMedicalPractitionerLicenceNo());
							 renewMedicalInfo.setHsraApplicationId(hsraRenewalApplicationId);
							 MedicalPractitionerAddLocalServiceUtil.updateMedicalPractitionerAdd(renewMedicalInfo); 
						 }
						 
					 }
					 
					 //add more first
				List<AddMedicalPractitioner> medical = null;
					 AddMedicalPractitioner renewMedical = null;
					 
						try {
							medical = AddMedicalPractitionerLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {}
						
						if(medical!=null) {
							for(AddMedicalPractitioner addMedical: medical) {
								renewMedical = AddMedicalPractitionerLocalServiceUtil.createAddMedicalPractitioner(CounterLocalServiceUtil.increment(AddAcknowledgementOfMedicalPractitionerResourceCommand.class.getName()));
								renewMedical.setCounter(addMedical.getCounter());
								renewMedical.setHsraApplicationId(hsraRenewalApplicationId);
								renewMedical.setMedicalPractitionerDate(addMedical.getMedicalPractitionerDate());
								renewMedical.setApplicantDate(addMedical.getApplicantDate());
								AddMedicalPractitionerLocalServiceUtil.updateAddMedicalPractitioner(renewMedical);
							}
						}
						
						// form 8
						
						RadiationDeclaration radiationDeclaration = null;
						RadiationDeclaration renewRadiationDeclaration = null;
						
						try {
							radiationDeclaration = RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						try {
							renewRadiationDeclaration = RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						
						if(radiationDeclaration!=null) {
							
							renewRadiationDeclaration.setLegalOperatorName(radiationDeclaration.getLegalOperatorName());
							renewRadiationDeclaration.setOperatorTitle(radiationDeclaration.getOperatorTitle());
							renewRadiationDeclaration.setOperatorDate(radiationDeclaration.getOperatorDate());
							renewRadiationDeclaration.setHsraApplicationId(hsraRenewalApplicationId);
							RadiationDeclarationLocalServiceUtil.updateRadiationDeclaration(renewRadiationDeclaration);
						}
						
						//form 9
						
						NotifiLegalInfo legalInfo = null;
						NotifiLegalInfo renewLegalInfo = null;
						
						try {
							legalInfo = NotifiLegalInfoLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						try {
							renewLegalInfo = NotifiLegalInfoLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						
						if(legalInfo!=null) {
							
							renewLegalInfo.setHsraApplicationId(hsraRenewalApplicationId);
							renewLegalInfo.setLegalPersonName(legalInfo.getLegalPersonName());
							renewLegalInfo.setLegalPersonAddress(legalInfo.getLegalPersonAddress());
							renewLegalInfo.setOrganizationName(legalInfo.getOrganizationName());
							renewLegalInfo.setOrganizationAddress(legalInfo.getOrganizationAddress());
							renewLegalInfo.setContactNumber(legalInfo.getContactNumber());
							renewLegalInfo.setLegalPersonEmail(legalInfo.getLegalPersonEmail());
							renewLegalInfo.setPracticeNature(legalInfo.getPracticeNature());
							NotifiLegalInfoLocalServiceUtil.updateNotifiLegalInfo(renewLegalInfo);
						}
						
						//form 10
						
					List<SourcesDetailAdd> sourceInfo = null;
						SourcesDetailAdd renewSourceInfo = null;
						try {
							sourceInfo = SourcesDetailAddLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						
						
						if(sourceInfo!=null) {
							for(SourcesDetailAdd sourceDetail :sourceInfo) {
								renewSourceInfo = SourcesDetailAddLocalServiceUtil.createSourcesDetailAdd(CounterLocalServiceUtil.increment());
								renewSourceInfo.setCounter(sourceDetail.getCounter());
								renewSourceInfo.setSourceIdentification(sourceDetail.getSourceIdentification());
								renewSourceInfo.setStateActivity(sourceDetail.getStateActivity());
								renewSourceInfo.setHsraApplicationId(hsraRenewalApplicationId);
								SourcesDetailAddLocalServiceUtil.updateSourcesDetailAdd(renewSourceInfo);
							}
						}
						
						//form 11
						
						//add more 1
				       List<RadionuclideAdd> radionuclideInfo = null;
						RadionuclideAdd renewRadionuclideInfo = null;
						
						try {
							radionuclideInfo = RadionuclideAddLocalServiceUtil.getHsraById(hsraApplicationId);
						} catch (Exception e) {
						}
						if(radionuclideInfo!=null) {
							for(RadionuclideAdd radionuclide:radionuclideInfo) {
								renewRadionuclideInfo = RadionuclideAddLocalServiceUtil.createRadionuclideAdd(CounterLocalServiceUtil.increment());
								renewRadionuclideInfo.setCounter(radionuclide.getCounter());
								renewRadionuclideInfo.setRadionuclideDetails(radionuclide.getRadionuclideDetails());
								renewRadionuclideInfo.setActivityDetails(radionuclide.getActivityDetails());
								renewRadionuclideInfo.setActivityDate(radionuclide.getActivityDate());
								renewRadionuclideInfo.setChemicalDetailsForm(radionuclide.getChemicalDetailsForm());
								renewRadionuclideInfo.setSerialNo(radionuclide.getSerialNo());
								renewRadionuclideInfo.setRadionuclideLocation(radionuclide.getRadionuclideLocation());
								renewRadionuclideInfo.setHsraApplicationId(hsraRenewalApplicationId);
								RadionuclideAddLocalServiceUtil.updateRadionuclideAdd(renewRadionuclideInfo);
							}
						}
						
						//normal
					
						 RadionuclideInfo radionuclide =null;
						 RadionuclideInfo renewRadionuclide =null;
						 
						 try {
							 radionuclide = RadionuclideInfoLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {}
						 try {
							 renewRadionuclide = RadionuclideInfoLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {}
					 
						 if(radionuclide!=null) {
							 renewRadionuclide.setSealedSource(radionuclide.getSealedSource());
							 renewRadionuclide.setManufacturerDetails(radionuclide.getManufacturerDetails());
							 renewRadionuclide.setModelNo(radionuclide.getModelNo());
							 renewRadionuclide.setIdentificationNo(radionuclide.getIdentificationNo());
							 renewRadionuclide.setStatusDetails(radionuclide.getStatusDetails());
							 renewRadionuclide.setHsraApplicationId(hsraRenewalApplicationId);
							 RadionuclideInfoLocalServiceUtil.updateRadionuclideInfo(renewRadionuclide);
						 }
						 
						 //form 12
					List<GenEquipmentData> genEquipInfo = null;
						 GenEquipmentData renewGenEquipInfo = null;
						 
						 try {
								genEquipInfo = GenEquipmentDataLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {
							}
						 
						 if(genEquipInfo!=null) {
							 
							 for(GenEquipmentData general:genEquipInfo) {
								    renewGenEquipInfo = GenEquipmentDataLocalServiceUtil.createGenEquipmentData(CounterLocalServiceUtil.increment());
								    renewGenEquipInfo.setCounter(general.getCounter());
								    renewGenEquipInfo.setManufacturerEquipment(general.getManufacturerEquipment());
								    renewGenEquipInfo.setEquipmentModel(general.getEquipmentModel());
								    renewGenEquipInfo.setEquipmentSerial(general.getEquipmentSerial());
								    renewGenEquipInfo.setOperatingPotential(general.getOperatingPotential());
								    renewGenEquipInfo.setNatureEquipment(general.getNatureEquipment());
								    renewGenEquipInfo.setRadiationGeneratingLoc(general.getRadiationGeneratingLoc());
								    renewGenEquipInfo.setEquipmentModels(general.getEquipmentModels());
								    renewGenEquipInfo.setEquipmentStatusDetail(general.getEquipmentStatusDetail());
								    renewGenEquipInfo.setEquipmentDate(general.getEquipmentDate());
								    renewGenEquipInfo.setHsraApplicationId(hsraRenewalApplicationId);
									GenEquipmentDataLocalServiceUtil.updateGenEquipmentData(renewGenEquipInfo);
							 }
						 }
						 
						 //low risk form
						 
						 RadiationSafetyLowRisk lowRiskSafety = null;
						 RadiationSafetyLowRisk renewLowRiskSafety = null;
						 
						 try {
								lowRiskSafety = RadiationSafetyLowRiskLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {
							}
						 try {
							 renewLowRiskSafety = RadiationSafetyLowRiskLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {
							}
						 
						 if(lowRiskSafety!=null) {
							    renewLowRiskSafety.setAppendixRsoName(lowRiskSafety.getAppendixRsoName());
								renewLowRiskSafety.setAppendixRsoTitle(lowRiskSafety.getAppendixRsoTitle());
								renewLowRiskSafety.setAppendixRsoTeleNo(lowRiskSafety.getAppendixRsoTeleNo());
								renewLowRiskSafety.setAppendixRsoExt(lowRiskSafety.getAppendixRsoExt());
								renewLowRiskSafety.setAppendixRsoFax(lowRiskSafety.getAppendixRsoFax());
								renewLowRiskSafety.setAppendixRsoEmail(lowRiskSafety.getAppendixRsoEmail());
								renewLowRiskSafety.setAppendixRsoDetails(lowRiskSafety.getAppendixRsoDetails());
								renewLowRiskSafety.setQualifiedAppendixName(lowRiskSafety.getQualifiedAppendixName());
								renewLowRiskSafety.setQualifiedAppendixTitle(lowRiskSafety.getQualifiedAppendixTitle());
								renewLowRiskSafety.setQualifiedAppendixTele(lowRiskSafety.getQualifiedAppendixTele());
								renewLowRiskSafety.setQualifiedAppendixExt(lowRiskSafety.getQualifiedAppendixExt());
								renewLowRiskSafety.setQualifiedAppendixFax(lowRiskSafety.getQualifiedAppendixFax());
								renewLowRiskSafety.setQualifiedAppendixEmail(lowRiskSafety.getQualifiedAppendixEmail());
								renewLowRiskSafety.setQualifiedAppendixRegstNo(lowRiskSafety.getQualifiedAppendixRegstNo());
                                renewLowRiskSafety.setQualifiedAppendixDate(lowRiskSafety.getQualifiedAppendixDate());
								renewLowRiskSafety.setQualifiedAppendixDetails(lowRiskSafety.getQualifiedAppendixDetails());
								renewLowRiskSafety.setMonitoringExposure(lowRiskSafety.getMonitoringExposure());
								renewLowRiskSafety.setRecordSystem(lowRiskSafety.getRecordSystem());
								renewLowRiskSafety.setSecurityAccess(lowRiskSafety.getSecurityAccess());
								renewLowRiskSafety.setTrainingInformation(lowRiskSafety.getTrainingInformation());
								renewLowRiskSafety.setLeakTesting(lowRiskSafety.getLeakTesting());
								renewLowRiskSafety.setEmergencyProcedures(lowRiskSafety.getEmergencyProcedures());
								renewLowRiskSafety.setManagementSourcesDis(lowRiskSafety.getManagementSourcesDis());
								renewLowRiskSafety.setHsraApplicationId(hsraRenewalApplicationId);
								RadiationSafetyLowRiskLocalServiceUtil.updateRadiationSafetyLowRisk(renewLowRiskSafety);

						 }
						 
						 //Add more first
						 
					    List<AlternateRsoOneAdd> rsoOneAddInfo = null;
						 AlternateRsoOneAdd renewRsoOneAddInfo = null;
						 try {
							rsoOneAddInfo = AlternateRsoOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {
							}
						 
						 if(rsoOneAddInfo!=null) {
							 for(AlternateRsoOneAdd alternate:rsoOneAddInfo) {
							    renewRsoOneAddInfo = AlternateRsoOneAddLocalServiceUtil.createAlternateRsoOneAdd(CounterLocalServiceUtil.increment());
							    renewRsoOneAddInfo.setCounter(alternate.getCounter());
							    renewRsoOneAddInfo.setAlternateRsoOneName(alternate.getAlternateRsoOneName());
							    renewRsoOneAddInfo.setAlternateRsoOneTitle(alternate.getAlternateRsoOneTitle());
							    renewRsoOneAddInfo.setAlternateRsoOneTelephone(alternate.getAlternateRsoOneTelephone());
							    renewRsoOneAddInfo.setAlternateRsoOneExt(alternate.getAlternateRsoOneExt());
							    renewRsoOneAddInfo.setAlternateRsoOneFax(alternate.getAlternateRsoOneFax());
							    renewRsoOneAddInfo.setAlternateRsoOneEmailAdd(alternate.getAlternateRsoOneEmailAdd());
							    renewRsoOneAddInfo.setHsraApplicationId(hsraRenewalApplicationId);
								AlternateRsoOneAddLocalServiceUtil.updateAlternateRsoOneAdd(renewRsoOneAddInfo);
						 }
						 }
						 
						 //add more second
					List<QualifedExpertOneAdd> expertOneInfo = null;
						 QualifedExpertOneAdd renewExpertOneInfo = null;
						 
						 try {
								expertOneInfo = QualifedExpertOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
							} catch (Exception e) {
							}
						 
						 if(expertOneInfo!=null) {
							 for(QualifedExpertOneAdd qualified :expertOneInfo) {
							    renewExpertOneInfo = QualifedExpertOneAddLocalServiceUtil.createQualifedExpertOneAdd(CounterLocalServiceUtil.increment());
							    renewExpertOneInfo.setCounter(qualified.getCounter());
							    renewExpertOneInfo.setQualifedOneName(qualified.getQualifedOneName());
							    renewExpertOneInfo.setQualifedOneTitle(qualified.getQualifedOneTitle());
							    renewExpertOneInfo.setQualifedOneTelephone(qualified.getQualifedOneTelephone());
							    renewExpertOneInfo.setQualifedOneExt(qualified.getQualifedOneExt());
							    renewExpertOneInfo.setQualifedOneFax(qualified.getQualifedOneFax());
							    renewExpertOneInfo.setQualifedOneEmailAdd(qualified.getQualifedOneEmailAdd());
							    renewExpertOneInfo.setQualifedOneRegistrationNo(qualified.getQualifedOneRegistrationNo());
							    renewExpertOneInfo.setQualifedOneExpirationDate(qualified.getQualifedOneExpirationDate());
							    renewExpertOneInfo.setHsraApplicationId(hsraRenewalApplicationId);
								QualifedExpertOneAddLocalServiceUtil.updateQualifedExpertOneAdd(renewExpertOneInfo);
										
						 }
						 }
						 
						
						 
			
			}
}
}

