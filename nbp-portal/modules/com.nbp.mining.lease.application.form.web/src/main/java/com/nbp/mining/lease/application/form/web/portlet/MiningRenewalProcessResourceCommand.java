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
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.service.MiningAppCurrentStageLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;
import com.nbp.mining.upload.document.commands.MiningApplicationCheckProspRight;
import com.nbp.mining.upload.document.commands.MiningApplicationDataCreationUtil;
import com.nbp.mining.upload.document.commands.MiningApplicationDocumentsCopyUtil;
import com.nbp.mining.upload.document.commands.MiningSecondApplicationUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=/renewal/license/process" }, service = MVCResourceCommand.class)

public class MiningRenewalProcessResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Mining Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(MiningRenewalProcessResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfApplicant=ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String licenseNumber = ParamUtil.getString(resourceRequest, "rightLicenseNumber");
		String prospLicenseNumber = ParamUtil.getString(resourceRequest, "prospLicenseNumber");
		String prospectingRightsTransactionTypeVal = ParamUtil.getString(resourceRequest, "prospectingRightsTransactionTypeVal");
		MiningLeaseApplication miningApplication =null;
		MiningLeaseApplication miningApplicationRenewalProcess = null;
		System.out.println("Called");
		long miningLeaseApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					
					miningApplication = MiningLeaseApplicationLocalServiceUtil.getMiningByAppNum(licenseNumber);
					_log.error("APPLICATION is not null MINING*******"+miningApplication);
				}
				miningLeaseApplicationId = miningApplication.getMiningLeaseApplicationId();
				_log.error("APPLICATION ID MINING*******"+miningLeaseApplicationId);
			}
			catch (Exception e) {
				_log.error(e.getMessage());
			}
			
			System.out.println("Type of Applicant---"+typeOfApplicant);
			if(typeOfApplicant.equals("Prospecting Rights")) {
				System.out.println("Prospecting Right");
			if (Validator.isNull(miningApplication)) {
				if (Validator.isNull(licenseNumber)) {
					
					System.out.println("Prospecting Right--if");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					try {
						resourceResponse.getWriter().write(jsonFeed.toString());
					} catch (Exception e) {}
				}else {
					System.out.println("Prospecting Right--Else");
					String renewUrl = MiningApplicationDataCreationUtil.getApplicationRenewUrl(licenseNumber, themeDisplay,typeOfApplicant,prospectingRightsTransactionTypeVal);
					jsonOBJ.put("renewLicenseUrl", renewUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					try {
						resourceResponse.getWriter().write(jsonFeed.toString());
					} catch (Exception e) {}
				}
			} else {
				System.out.println("Prospecting Right--Found Mining Application--"+miningLeaseApplicationId);
				if (miningApplication.getStatus() == MiningApplicationWorkflowConstant.SUBMITTED) {
					System.out.println("---------after successfully submitted------------");
					if (Validator.isNotNull(licenseNumber)) {
						_log.error("LICENCE NUMBER 33333*******"+licenseNumber);
						try {
							if(prospectingRightsTransactionTypeVal.equals("Surrender")) {
								miningApplicationRenewalProcess = MiningLeaseApplicationLocalServiceUtil.getMiningByRT_AppNo(MiningApplicationWorkflowConstant.SURRENDER,licenseNumber);
							}else {
								miningApplicationRenewalProcess = MiningLeaseApplicationLocalServiceUtil.getMiningByRT_AppNo(MiningApplicationWorkflowConstant.RENEW,licenseNumber);
							}
						
						} catch (Exception e) {
							_log.error("Error123_______________________" + e.getMessage());
						}
					}
					if (miningApplicationRenewalProcess == null) {
						MiningAppCurrentStage currentStage = null;
						currentStage = MiningAppCurrentStageLocalServiceUtil.createMiningAppCurrentStage(CounterLocalServiceUtil.increment());
						currentStage.setCurrentStage("APPLICATION FORM DETAILS");
						System.out.println("-------------------current stage---------"+currentStage);
						
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
						miningApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						miningApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						miningApplicationRenewalProcess.setTypeOfApplicant(miningApplication.getTypeOfApplicant());
						miningApplicationRenewalProcess.setProspectingRightNumber(prospectingRightsTransactionTypeVal);
						miningApplicationRenewalProcess.setTypeOfProspectingLicence(miningApplication.getTypeOfProspectingLicence());
//						miningApplicationRenewalProcess.setTypeOfTransaction(miningApplication.getTypeOfTransaction());
						miningApplicationRenewalProcess.setAreaDelinationTotalApprox(miningApplication.getAreaDelinationTotalApprox());
						miningApplicationRenewalProcess.setLicenceExclusiveSpecial(miningApplication.getLicenceExclusiveSpecial());
						miningApplicationRenewalProcess.setMiningMineralsTypeVal(miningApplication.getMiningMineralsTypeVal());
						miningApplicationRenewalProcess.setOtherMineralBox(miningApplication.getOtherMineralBox());
						miningApplicationRenewalProcess.setAreaDelination(miningApplication.getAreaDelination());
						miningApplicationRenewalProcess.setStatus(MiningApplicationWorkflowConstant.DRAFT);
						MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplicationRenewalProcess);
						_log.error("UPDATED miningApplicationRenewalProcess*******"+miningApplicationRenewalProcess);
						
					    if(miningApplication.getTypeOfApplicant().equals("Prospecting Rights")) {
					    	System.out.println("-------------under condition---------"+miningApplication.getTypeOfApplicant());
						currentStage.setLastFormStep("childStep1");	
					    }
					    
						currentStage.setMiningLeaseApplicationId(miningApplicationRenewalProcess.getMiningLeaseApplicationId());
						MiningAppCurrentStageLocalServiceUtil.updateMiningAppCurrentStage(currentStage);
						
						copyingDataFromOriginalApplication(miningApplication.getMiningLeaseApplicationId(),miningApplicationRenewalProcess.getMiningLeaseApplicationId());
						
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
					String renewLicenseUrl = "/group/guest/mining-application-form?miningLeaseApplicationId="
							+ miningApplicationRenewalProcess.getMiningLeaseApplicationId();
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
			
			}else if(typeOfApplicant.equals("Prospecting Licence")) {
				if (Validator.isNull(miningApplication)) {
					if (Validator.isNull(licenseNumber)) {
						jsonOBJ.put("licenseNumberCheck", "0");
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						try {
							resourceResponse.getWriter().write(jsonFeed.toString());
						} catch (Exception e) {}
					}else  {
						String renewUrl = MiningApplicationDataCreationUtil.getApplicationRenewUrl(licenseNumber, themeDisplay,typeOfApplicant,"");
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
					  String renewUrl = MiningApplicationCheckProspRight.getApplicationRenewUrl(licenseNumber, themeDisplay,typeOfApplicant);
						jsonOBJ.put("renewLicenseUrl", renewUrl);
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						try {
							resourceResponse.getWriter().write(jsonFeed.toString());
						} catch (Exception e) {}
			}
			}
			}
		} catch (Exception e) {
			_log.error("Error1****************" + e.getMessage());
			_log.error("Error*2***************" + e.getCause());
		}

		return false;
	}
	public static void copyingDataFromOriginalApplication(long miningLeaseApplicationId,
			long miningRenewalApplicationId) {
		_log.error("Mining Renewal ID********"+miningRenewalApplicationId);
		_log.error("Mining  ID********"+miningLeaseApplicationId);
	MiningLeaseApplication miningApplication=null;
	try {
		miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningLeaseApplicationId);
	} catch (Exception e) {
		// TODO: handle exception
	}
    if(miningApplication.getTypeOfApplicant().equals("Prospecting Rights")) {
    	System.out.println("-----------------under prospecting right---");
    	MiningProspectingRights miningProspRights = null;
    	MiningProspectingRights renewProspRights = null;

		try {
			miningProspRights = MiningProspectingRightsLocalServiceUtil.getMiningById(miningLeaseApplicationId);
			System.out.println("------------------miningProspRights-------------------"+miningProspRights);
		} catch (Exception e) {
		e.printStackTrace();
		}
		try {
			renewProspRights = MiningProspectingRightsLocalServiceUtil.getMiningById(miningLeaseApplicationId);
			System.out.println("------------------renewProspRights-------------------"+renewProspRights);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(miningProspRights!=null) {
			System.out.println("------------------if not null-------------------");
			renewProspRights.setNameOfApplicant(miningProspRights.getNameOfApplicant());
			renewProspRights.setTrnNum(miningProspRights.getTrnNum());
			renewProspRights.setNationalityOfApplicant(miningProspRights.getNationalityOfApplicant());
			renewProspRights.setAgeOfApplicant(miningProspRights.getAgeOfApplicant());
			renewProspRights.setTelephoneNum(miningProspRights.getTelephoneNum());
			renewProspRights.setEmailAddr(miningProspRights.getEmailAddr());
			renewProspRights.setAddressInJamaica(miningProspRights.getAddressInJamaica());
			renewProspRights.setApplicantProspectAcc(miningProspRights.getApplicantProspectAcc());
			renewProspRights.setOtherPersonName(miningProspRights.getOtherPersonName());
			renewProspRights.setOtherPersonAddr(miningProspRights.getOtherPersonAddr());
			renewProspRights.setPrevApplication(miningProspRights.getPrevApplication());
			renewProspRights.setOffenceMiningAct(miningProspRights.getOffenceMiningAct());
			renewProspRights.setValidProspectRight(miningProspRights.getValidProspectRight());
			renewProspRights.setSurrenderProspectRight(miningProspRights.getSurrenderProspectRight());
			renewProspRights.setMiningLeaseApplicationId(miningRenewalApplicationId);
			MiningProspectingRightsLocalServiceUtil.updateMiningProspectingRights(renewProspRights);
			System.out.println("-----------------renewProspRights+++++++++++---"+renewProspRights);
		}
    }
	}
	
}	