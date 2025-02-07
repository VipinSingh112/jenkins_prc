package com.nbp.fire.brigade.application.form.web.portlet;

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
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationWorkflowConstant;
import com.nbp.fire.brigade.application.util.FireBrigadeApplicationDataCreationUtil;
import com.nbp.fire.brigade.application.util.FireBrigadeApplicationDocumentsCopyUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.lang3.tuple.Pair;
import org.osgi.service.component.annotations.Component;

@Component
	(immediate = true, 
		property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=recertification/Fb/License" 
		}, 
	service = MVCResourceCommand.class)


public class RecertificationFireBrigadeAppResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Fire Brigade Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(RecertificationFireBrigadeAppResourceCommand.class);
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String transactionNumber = ParamUtil.getString(resourceRequest, "transactionNumber");
		String fireBrigadeLicenseNumber = ParamUtil.getString(resourceRequest, "fireBrigadeLicenseNumber");
		FireBrigadeApplication fireBrigadeApplication=null;
		FireBrigadeApplication fireBrigadeRecertificationProcess=null;
		String renewal=null;
		long fireBrigadeApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(transactionNumber)) {
					fireBrigadeApplication=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeByAppNo(transactionNumber);
				}/*else if (Validator.isNotNull(fireBrigadeLicenseNumber)) {
					fireBrigadeApplication=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeByAppNo(fireBrigadeLicenseNumber);
				}*/
				fireBrigadeApplicationId= fireBrigadeApplication.getFireBrigadeApplicationId();
			}catch (Exception e) {
				}
		if (Validator.isNull(fireBrigadeApplication)) {
			if (Validator.isNull(transactionNumber)&&(Validator.isNull(fireBrigadeLicenseNumber))) {
				jsonOBJ.put("transactionNumberCheck", "0");
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				try {
					resourceResponse.getWriter().write(jsonFeed.toString());
				} catch (IOException e) {
				}
			}else {
				renewal="true";
				Pair<String, Long> recertificationUrl = FireBrigadeApplicationDataCreationUtil.getApplicationRecertificationUrl(fireBrigadeLicenseNumber,renewal, themeDisplay);
				jsonOBJ.put("renewLicenseUrl", recertificationUrl.getKey());
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				try {
					resourceResponse.getWriter().write(jsonFeed.toString());
				} catch (Exception e) {
				}
			}
		}
		 else {
			 if (fireBrigadeApplication.getStatus() == FireBrigadeApplicationWorkflowConstant.SUBMITTED) {
				 renewal="true";
					if (Validator.isNotNull(transactionNumber)) {
						try {
							fireBrigadeRecertificationProcess = FireBrigadeApplicationLocalServiceUtil.getFB_ByAppType_AppNo(FireBrigadeApplicationWorkflowConstant.RECERTIFICATION,transactionNumber);
						} catch (Exception e) {
						}
					}/*else if((Validator.isNotNull(fireBrigadeLicenseNumber))) {
						try {
							fireBrigadeRecertificationProcess = FireBrigadeApplicationLocalServiceUtil.getFB_ByAppType_AppNo(FireBrigadeApplicationWorkflowConstant.RECERTIFICATION,fireBrigadeLicenseNumber);
						} catch (Exception e) {
						}
						
					}*/
					if (fireBrigadeRecertificationProcess == null) {
						
						FireBrigadeAppliCurrentStage renewCurrentStage=null;
						renewCurrentStage= FireBrigadeAppliCurrentStageLocalServiceUtil.createFireBrigadeAppliCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						renewCurrentStage.setLastFormStep("childStep1");
							
						fireBrigadeRecertificationProcess=FireBrigadeApplicationLocalServiceUtil.createFireBrigadeApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						fireBrigadeRecertificationProcess.setCompanyId(themeDisplay.getCompanyId());
						fireBrigadeRecertificationProcess.setGroupId(themeDisplay.getScopeGroupId());
						fireBrigadeRecertificationProcess.setCreateDate(new Date());
						fireBrigadeRecertificationProcess.setUserId(themeDisplay.getUserId());
						fireBrigadeRecertificationProcess.setUserName(themeDisplay.getUser().getFullName());
						fireBrigadeRecertificationProcess.setExpiredLicenseNumber(transactionNumber);
						/*else if(fireBrigadeLicenseNumber!=null) {
						fireBrigadeRecertificationProcess.setExpiredLicenseNumber(fireBrigadeLicenseNumber);
						}*/
						fireBrigadeRecertificationProcess.setApplicationNumber(formatted + "/" + formattedDate);
						fireBrigadeRecertificationProcess.setTypeOfTransaction(FireBrigadeApplicationWorkflowConstant.RECERTIFICATION);
						fireBrigadeRecertificationProcess.setStatus(FireBrigadeApplicationWorkflowConstant.DRAFT);
						fireBrigadeRecertificationProcess.setCertificateType(fireBrigadeApplication.getCertificateType());
						fireBrigadeRecertificationProcess.setTypeOfApplicant(fireBrigadeApplication.getTypeOfApplicant());
						FireBrigadeApplicationLocalServiceUtil.updateFireBrigadeApplication(fireBrigadeRecertificationProcess);
						
						renewCurrentStage.setFireBrigadeApplicationId(fireBrigadeRecertificationProcess.getFireBrigadeApplicationId());
						FireBrigadeAppliCurrentStageLocalServiceUtil.updateFireBrigadeAppliCurrentStage(renewCurrentStage);
					
				copyingDataFromOriginalApplication(fireBrigadeApplication.getFireBrigadeApplicationId(), fireBrigadeRecertificationProcess.getFireBrigadeApplicationId());
				ServiceContext serviceContext = new ServiceContext();
				DLFolder originalRootDlFolder = null;
				DLFolder supportingDocsMainFolder = null;
				try {
					serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
				} catch (PortalException e1) {
				}
				try {
					originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

				} catch (PortalException e) {
				}
				try {
					supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
							String.valueOf(fireBrigadeApplicationId));

				} catch (PortalException e) {
				}
				DLFolder copiedDlFolder = null;
				try {
					copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							originalRootDlFolder.getFolderId(), String.valueOf(fireBrigadeRecertificationProcess.getFireBrigadeApplicationId()));
				} catch (Exception e) {
				}
				if (copiedDlFolder == null) {
					FireBrigadeApplicationDocumentsCopyUtil.copyFolder(
							themeDisplay.getScopeGroupId(),
							supportingDocsMainFolder.getFolderId(), 
							originalRootDlFolder.getFolderId(),
							String.valueOf(fireBrigadeApplication.getFireBrigadeApplicationId()),
							supportingDocsMainFolder.getDescription(),
							serviceContext,
							supportingDocsMainFolder.getFolderId(),
							themeDisplay.getUserId(),
							fireBrigadeRecertificationProcess.getFireBrigadeApplicationId());
					}	
				}
					String renewLicenseUrl = "/group/guest/fire-brigade-application-form?fireBrigadeApplicationId="
							+ fireBrigadeRecertificationProcess.getFireBrigadeApplicationId()+"&renewal="+renewal;
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					try {
						resourceResponse.getWriter().write(jsonFeed.toString());
					} catch (IOException e) {
					}
					
			} else {
				jsonOBJ.put("transactionNumberCheck", "0");
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				try {
					resourceResponse.getWriter().write(jsonFeed.toString());
				} catch (IOException e) {}
			}
		}}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}
	public static void copyingDataFromOriginalApplication(long fireBrigadeApplicationId,long fbRecertifiAppId) {
		
		FireBrigadeSignatureInfo fbSignatureInfo=null;
		FireBrigadeSignatureInfo ciSignatureInfo=null;
		
		try {
			fbSignatureInfo=FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		
		try {
			ciSignatureInfo= FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if(fbSignatureInfo != null) {
			ciSignatureInfo.setTitle(fbSignatureInfo.getTitle());
			ciSignatureInfo.setName(fbSignatureInfo.getName());
			ciSignatureInfo.setTelephone(fbSignatureInfo.getTelephone());
			ciSignatureInfo.setFax(fbSignatureInfo.getFax());
			ciSignatureInfo.setTrn(fbSignatureInfo.getTrn());
			ciSignatureInfo.setEmail(fbSignatureInfo.getEmail());
			ciSignatureInfo.setDate(fbSignatureInfo.getDate());
			ciSignatureInfo.setAddress(fbSignatureInfo.getAddress());
			ciSignatureInfo.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeSignatureInfoLocalServiceUtil.updateFireBrigadeSignatureInfo(ciSignatureInfo);
		}
		
		FireBrigadePremisesInfo fbPremises=null;
		FireBrigadePremisesInfo ciPremises=null;
		
		try {
			fbPremises=FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		if(ciPremises==null) {
			try {
				ciPremises=FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
		}
		
		if(fbPremises != null) {
			ciPremises.setPremises(fbPremises.getPremises());
			ciPremises.setPremisesCertified(fbPremises.getPremisesCertified());
			ciPremises.setExpirationDate(fbPremises.getExpirationDate());
			ciPremises.setCertificateNumber(fbPremises.getCertificateNumber());
			ciPremises.setName(fbPremises.getName());
			ciPremises.setAddress(fbPremises.getAddress());
			ciPremises.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadePremisesInfoLocalServiceUtil.updateFireBrigadePremisesInfo(ciPremises);
		}
		
		FireBrigadeOperatorDetail fbOperatorDetail=null;
		FireBrigadeOperatorDetail ciOperatorDetail=null;
		
		try {
			fbOperatorDetail=FireBrigadeOperatorDetailLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {	
		}
		if(ciOperatorDetail==null) {
			try {
				ciOperatorDetail=FireBrigadeOperatorDetailLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
		}
		if(fbOperatorDetail != null) {
			ciOperatorDetail.setOperatorName(fbOperatorDetail.getOperatorName());
			ciOperatorDetail.setBusinessName(fbOperatorDetail.getBusinessName());
			ciOperatorDetail.setAddress(fbOperatorDetail.getAddress());
			ciOperatorDetail.setPremisesUses(fbOperatorDetail.getPremisesUses());
			ciOperatorDetail.setPremisesOccupancy(fbOperatorDetail.getPremisesOccupancy());
			ciOperatorDetail.setPremisesBusiness(fbOperatorDetail.getPremisesBusiness());
			ciOperatorDetail.setMaxWorkingPersons(fbOperatorDetail.getMaxWorkingPersons());
			ciOperatorDetail.setMaxNumPersonsAtAnyOneTime(fbOperatorDetail.getMaxNumPersonsAtAnyOneTime());
			ciOperatorDetail.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeOperatorDetailLocalServiceUtil.updateFireBrigadeOperatorDetail(ciOperatorDetail);
		}
		
		
		FireBrigadeMultFloorInfo fbMultiFloor=null;
		FireBrigadeMultFloorInfo ciMultiFloor=null;
		
		
		try {
			fbMultiFloor= FireBrigadeMultFloorInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		if(ciMultiFloor==null) {
			try {
				ciMultiFloor=FireBrigadeMultFloorInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
		}
		if(fbMultiFloor != null) {
			ciMultiFloor.setFloorAlternateExist(fbMultiFloor.getFloorAlternateExist());
			ciMultiFloor.setBuildingRisingMain(fbMultiFloor.getBuildingRisingMain());
			ciMultiFloor.setEquipmentConnection(fbMultiFloor.getEquipmentConnection());
			ciMultiFloor.setBuildingParkingGarage(fbMultiFloor.getBuildingParkingGarage());
			ciMultiFloor.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeMultFloorInfoLocalServiceUtil.updateFireBrigadeMultFloorInfo(ciMultiFloor);
		}
		
		
		FireBrigadeProEquipmentInfo fbProEquip=null;
		FireBrigadeProEquipmentInfo ciProEquip=null;
		
		
		try {
			fbProEquip= FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		
		try {
			ciProEquip=FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if(fbProEquip != null) {
			ciProEquip.setEquipmentProtectionPre(fbProEquip.getEquipmentProtectionPre());
			ciProEquip.setEquipmentProtectionOne(fbProEquip.getEquipmentProtectionOne());
			ciProEquip.setEquipmentProtectionTwo(fbProEquip.getEquipmentProtectionTwo());
			ciProEquip.setEquipmentProtectionThree(fbProEquip.getEquipmentProtectionThree());
			ciProEquip.setEquipmentProtectionFour(fbProEquip.getEquipmentProtectionFour());
			ciProEquip.setEquipmentProtectionFive(fbProEquip.getEquipmentProtectionFive());
			ciProEquip.setEquipmentProtectionSix(fbProEquip.getEquipmentProtectionSix());
			ciProEquip.setOtherEquipment(fbProEquip.getOtherEquipment());
			ciProEquip.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeProEquipmentInfoLocalServiceUtil.updateFireBrigadeProEquipmentInfo(ciProEquip);
		}
		
		
		FireBrigadeHazardousSubInfo fbHazardSubInfo=null;
		FireBrigadeHazardousSubInfo ciHazardSubInfo=null;
		
		try {
			fbHazardSubInfo=FireBrigadeHazardousSubInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		
		try {
			ciHazardSubInfo=FireBrigadeHazardousSubInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if(fbHazardSubInfo != null) {
			ciHazardSubInfo.setLpgCylinder(fbHazardSubInfo.getLpgCylinder());
			ciHazardSubInfo.setFlammableGases(fbHazardSubInfo.getFlammableGases());
			ciHazardSubInfo.setFlammableCombustibleLiquid(fbHazardSubInfo.getFlammableCombustibleLiquid());
			ciHazardSubInfo.setChemicalsLiquid(fbHazardSubInfo.getChemicalsLiquid());
			ciHazardSubInfo.setChemicalsPowder(fbHazardSubInfo.getChemicalsPowder());
			ciHazardSubInfo.setExplosives(fbHazardSubInfo.getExplosives());
			ciHazardSubInfo.setOtherHazardousSubstance(fbHazardSubInfo.getOtherHazardousSubstance());
			ciHazardSubInfo.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeHazardousSubInfoLocalServiceUtil.updateFireBrigadeHazardousSubInfo(ciHazardSubInfo);
		}
		
		FireBrigadeCerPurposeInfo fbCertificatePurpose=null;
		FireBrigadeCerPurposeInfo ciCertificatePurpose=null;
		
		
		try {
			fbCertificatePurpose=FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {}
		
		try {
			ciCertificatePurpose=FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if(fbCertificatePurpose != null) {
			ciCertificatePurpose.setCertificatePurposePre(fbCertificatePurpose.getCertificatePurposePre());
			ciCertificatePurpose.setOtherCertificatePurpose(fbCertificatePurpose.getOtherCertificatePurpose());
			ciCertificatePurpose.setFireBrigadeApplicationId(fbRecertifiAppId);
			FireBrigadeCerPurposeInfoLocalServiceUtil.updateFireBrigadeCerPurposeInfo(ciCertificatePurpose);
		}
	}
}
