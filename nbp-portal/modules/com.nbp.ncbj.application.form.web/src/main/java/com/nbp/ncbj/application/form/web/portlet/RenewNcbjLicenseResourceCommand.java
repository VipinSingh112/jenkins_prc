package com.nbp.ncbj.application.form.web.portlet;

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
import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;
import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;
import com.nbp.ncbj.application.form.service.service.NCBJCompanyNewLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjAddLocMultiSiteLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailGenLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjNumOfEmpAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjPremisesLocationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjProductServiceDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionTwoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSpecificActivitiesLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationWorkflowConstant;
import com.nbp.ncbj.application.util.NcbjApplicationDataCreationUtil;
import com.nbp.ncbj.application.util.NcbjApplicationDocumentsCopyUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/renew/license"
		},
		service = MVCResourceCommand.class
	)
public class RenewNcbjLicenseResourceCommand implements MVCResourceCommand{
	static Log _log = LogFactoryUtil.getLog(RenewNcbjLicenseResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "NCBJ Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String typeOfCertification = ParamUtil.getString(resourceRequest, "typeOfCertification");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String typeOfService = ParamUtil.getString(resourceRequest, "typeOfService");
		String numberOfSite = ParamUtil.getString(resourceRequest, "numberOfSite");
		String iso9001CertificationValue = ParamUtil.getString(resourceRequest, "iso9001CertificationValue");
		String transferReason = ParamUtil.getString(resourceRequest, "transferReason");

		NcbjApplication application = null;
		NcbjApplication  ncbjApplicationRenewalProcess =null;
		String result=null;
		
		long ncbjApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					application =NcbjApplicationLocalServiceUtil.getNcbj_By_App_Num(licenseNumber);
				}
			
				ncbjApplicationId=application.getNcbjApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(application)) {
				if (Validator.isNull(licenseNumber)){
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
			     result= "renew";
				String renewUrl =NcbjApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,typeOfCertification,typeOfTransaction,typeOfService,numberOfSite,iso9001CertificationValue,result,transferReason);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(application.getStatus()==NCBJApplicationWorkflowConstant.SUBMITTED) {
					result="renew";
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							ncbjApplicationRenewalProcess = NcbjApplicationLocalServiceUtil.getNcbjByRT_AppNo(NCBJApplicationWorkflowConstant.RENEW_APPLICATION,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(ncbjApplicationRenewalProcess==null) {
						NcbjCurrentStage renewCurrentStage=null;
						renewCurrentStage= NcbjCurrentStageLocalServiceUtil.createNcbjCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						
		
						
						if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
							  if(typeOfTransaction.equals("NCBJ Certified Clients")) {
								  renewCurrentStage.setLastFormStep("childStep4");
							  }
							  if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
								  renewCurrentStage.setLastFormStep("childStep1");
								  
							  }
						}else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
							  
							 if(typeOfTransaction.equals("NCBJ Certified Clients")) {
								  renewCurrentStage.setLastFormStep("childStep6");
							  }
						}

						ncbjApplicationRenewalProcess=NcbjApplicationLocalServiceUtil.createNcbjApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						ncbjApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						ncbjApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						ncbjApplicationRenewalProcess.setCreateDate(new Date());
						ncbjApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						ncbjApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						ncbjApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						ncbjApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						ncbjApplicationRenewalProcess.setTypeOfTransaction(NCBJApplicationWorkflowConstant.RENEW_APPLICATION);
						ncbjApplicationRenewalProcess.setStatus(NCBJApplicationWorkflowConstant.DRAFT);
						ncbjApplicationRenewalProcess.setTypeOfCertification(application.getTypeOfCertification());
						ncbjApplicationRenewalProcess.setTypeOfTransaction(application.getTypeOfTransaction());
						ncbjApplicationRenewalProcess.setIso9001CertificationValue(application.getIso9001CertificationValue());
						ncbjApplicationRenewalProcess.setNumberOfSite(application.getNumberOfSite());
						ncbjApplicationRenewalProcess.setTypeOfServices(application.getTypeOfServices());
						if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
							ncbjApplicationRenewalProcess.setTransferReason(transferReason);
						}
						NcbjApplicationLocalServiceUtil.updateNcbjApplication(ncbjApplicationRenewalProcess);
						renewCurrentStage.setNcbjApplicationId(ncbjApplicationRenewalProcess.getNcbjApplicationId());
						NcbjCurrentStageLocalServiceUtil.updateNcbjCurrentStage(renewCurrentStage);
		
						
						
						copyingDataFromOriginalApplication(application.getNcbjApplicationId(), ncbjApplicationRenewalProcess.getNcbjApplicationId(),typeOfService,typeOfCertification,iso9001CertificationValue,typeOfTransaction,numberOfSite);
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
									String.valueOf(ncbjApplicationId));

							

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											ncbjApplicationRenewalProcess.getNcbjApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							NcbjApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
										 ncbjApplicationRenewalProcess.getNcbjApplicationId()),
									     supportingDocsMainFolder.getDescription(), serviceContext,
									     supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									     ncbjApplicationRenewalProcess.getNcbjApplicationId());

						}
					}
					
					String renewLicenseUrl = 
							 "/group/guest/ncbj-application-form?ncbjApplicationId="
									+ncbjApplicationRenewalProcess.getNcbjApplicationId()+"&result="+result;
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
	
	public static void copyingDataFromOriginalApplication(long ncbjApplicationId,
			long ncbjRenewalApplicationId,String typeOfService, String typeOfCertification, String iso9001CertificationValue, String typeOfTransaction, String numberOfSite) {
		
		 
			NcbjApplication application = null;
			
			try {
				application= NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
			}catch (Exception e) {
			}
			
			if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
			if(typeOfService.equals("Recertification")) {
				
				 //first form
				NcbjOrganizationDetail ncbjOrganizationDetail=null;
				NcbjOrganizationDetail renewNcbjOrganizationDetail=null;
				try {
					ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				try {
					renewNcbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				
			
				if(renewNcbjOrganizationDetail!=null) {
					  renewNcbjOrganizationDetail.setNameOfOrganization(ncbjOrganizationDetail.getNameOfOrganization());
					  renewNcbjOrganizationDetail.setAddress(ncbjOrganizationDetail.getAddress());
					  renewNcbjOrganizationDetail.setTelephoneNumber(ncbjOrganizationDetail.getTelephoneNumber());
					  renewNcbjOrganizationDetail.setFaxNumber(ncbjOrganizationDetail.getFaxNumber());
					  renewNcbjOrganizationDetail.setEmailAddress(ncbjOrganizationDetail.getEmailAddress());
					  renewNcbjOrganizationDetail.setHeadOfOrganization(ncbjOrganizationDetail.getHeadOfOrganization());
					  renewNcbjOrganizationDetail.setPosition(ncbjOrganizationDetail.getPosition());
					  renewNcbjOrganizationDetail.setContactPersonName(ncbjOrganizationDetail.getContactPersonName());
					  renewNcbjOrganizationDetail.setContactPersonEmailAddress(ncbjOrganizationDetail.getContactPersonEmailAddress());
					  renewNcbjOrganizationDetail.setContactPersonPosition(ncbjOrganizationDetail.getContactPersonPosition());
					  renewNcbjOrganizationDetail.setManagementSystem(ncbjOrganizationDetail.getManagementSystem());
					  renewNcbjOrganizationDetail.setDeterminedTheScope(ncbjOrganizationDetail.getDeterminedTheScope());
					  renewNcbjOrganizationDetail.setPleaseStageTheScope(ncbjOrganizationDetail.getPleaseStageTheScope());
					  renewNcbjOrganizationDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
					  NcbjOrganizationDetailLocalServiceUtil.updateNcbjOrganizationDetail(renewNcbjOrganizationDetail);
				}
				
				//Bo
				List<NcbjBusinessDetail>quotationBusinessDetail=null;
				NcbjBusinessDetail renewQuotationBusinessDetail=null;
				
				  try {
					  quotationBusinessDetail=NcbjBusinessDetailLocalServiceUtil.getByNcbjBusiDetail(ncbjApplicationId);
			        } catch (Exception e) {
					}
				
				  if(quotationBusinessDetail!=null) {
					  for(NcbjBusinessDetail quotation : quotationBusinessDetail) {
						  renewQuotationBusinessDetail=NcbjBusinessDetailLocalServiceUtil.createNcbjBusinessDetail(CounterLocalServiceUtil.increment());
						  renewQuotationBusinessDetail.setCounter(quotation.getCounter());
						  renewQuotationBusinessDetail.setQuotationAddressOne(quotation.getQuotationAddressOne());
						  renewQuotationBusinessDetail.setQuotationProductTypes(quotation.getQuotationProductTypes());
						  renewQuotationBusinessDetail.setQuotationApplicantShifts(quotation.getQuotationApplicantShifts());
						  renewQuotationBusinessDetail.setQuotationEmpNum(quotation.getQuotationEmpNum());
						  renewQuotationBusinessDetail.setQuotationHeadOffices(quotation.getQuotationHeadOffices());
						  renewQuotationBusinessDetail.setQuotationFullTimeEmploy(quotation.getQuotationFullTimeEmploy());
						  renewQuotationBusinessDetail.setQuotationPartTimeEmploy(quotation.getQuotationPartTimeEmploy());
						  renewQuotationBusinessDetail.setQuotationContractors(quotation.getQuotationContractors());
						  renewQuotationBusinessDetail.setQuotationContractedWorker(quotation.getQuotationContractedWorker());
						  renewQuotationBusinessDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
						  NcbjBusinessDetailLocalServiceUtil.updateNcbjBusinessDetail(renewQuotationBusinessDetail);
					 }
				  }

			}
			if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
				
				//first Bo
				List<NcbjBusinessDetailAdd> businessDetailAdd= null;
				NcbjBusinessDetailAdd renewBusinessDetailAdd= null;
				
				try {
					  businessDetailAdd= NcbjBusinessDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
				  } catch (Exception e) {}
				
				if(businessDetailAdd!=null) {
					 for(NcbjBusinessDetailAdd businessDetail : businessDetailAdd) {
						  renewBusinessDetailAdd= NcbjBusinessDetailAddLocalServiceUtil.createNcbjBusinessDetailAdd(CounterLocalServiceUtil.increment());
						  renewBusinessDetailAdd.setCounter(businessDetail.getCounter());
						  renewBusinessDetailAdd.setNumberAndTimeOfShift(businessDetail.getNumberAndTimeOfShift());
						  renewBusinessDetailAdd.setTypeOfProduct(businessDetail.getTypeOfProduct());
						  renewBusinessDetailAdd.setBusinessAddress(businessDetail.getBusinessAddress());
						  renewBusinessDetailAdd.setHeadOffices(businessDetail.getHeadOffices());
						  renewBusinessDetailAdd.setNoOfFullTimeEmployees(businessDetail.getNoOfFullTimeEmployees());
						  renewBusinessDetailAdd.setNoOfPartTimeEmployees(businessDetail.getNoOfPartTimeEmployees());
						  renewBusinessDetailAdd.setNoOfContractors(businessDetail.getNoOfContractors());
						  renewBusinessDetailAdd.setNoOfContractedWorkers(businessDetail.getNoOfContractedWorkers());
						  renewBusinessDetailAdd.setNcbjApplicationId(ncbjRenewalApplicationId);
						  NcbjBusinessDetailAddLocalServiceUtil.updateNcbjBusinessDetailAdd(renewBusinessDetailAdd);
					 }
				}
				
				//first form
				
				NcbjApplicantDetail preferredDate=null;
				NcbjApplicantDetail renewPreferredDate=null;
				try {
					preferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
				} catch (Exception e) {
				}
				try {
					renewPreferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
				} catch (Exception e) {
				}
				
				if(preferredDate!=null) {
				
					renewPreferredDate.setStageOne(preferredDate.getStageOne());
					renewPreferredDate.setStageTwo(preferredDate.getStageTwo());
					renewPreferredDate.setSurveillanceAudit(preferredDate.getSurveillanceAudit());
					renewPreferredDate.setRecertificationAudit(preferredDate.getRecertificationAudit());
					renewPreferredDate.setPreAassessmentAudit(preferredDate.getPreAassessmentAudit());
					renewPreferredDate.setAnyOtherService(preferredDate.getAnyOtherService());
					renewPreferredDate.setNcbjApplicationId(ncbjRenewalApplicationId);
					NcbjApplicantDetailLocalServiceUtil.updateNcbjApplicantDetail(renewPreferredDate);
				}
				
				
				//second form
				
				NcbjOrgDetailInfo orgDetailInfo=null;
				NcbjOrgDetailInfo renewOrgDetailInfo=null;
				
				try {
					orgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					renewOrgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				if(orgDetailInfo!=null) {
					
					renewOrgDetailInfo.setNewCompanyName(orgDetailInfo.getNewCompanyName());
				    renewOrgDetailInfo.setMailingAddress(orgDetailInfo.getMailingAddress());
				    renewOrgDetailInfo.setCity(orgDetailInfo.getCity());
				    renewOrgDetailInfo.setPostalCode(orgDetailInfo.getPostalCode());
				    renewOrgDetailInfo.setCountry(orgDetailInfo.getCountry());
				    renewOrgDetailInfo.setPhysicalAddress(orgDetailInfo.getPhysicalAddress());
				    renewOrgDetailInfo.setPhysicalCity(orgDetailInfo.getPhysicalCity());
				    renewOrgDetailInfo.setPhysicalPostalCode(orgDetailInfo.getPhysicalPostalCode());
				    renewOrgDetailInfo.setPhysicalCountry(orgDetailInfo.getPhysicalCountry());
				    renewOrgDetailInfo.setCompanyHead(orgDetailInfo.getCompanyHead());
				    renewOrgDetailInfo.setCompanyTitle(orgDetailInfo.getCompanyTitle());
				    renewOrgDetailInfo.setCompanyContact(orgDetailInfo.getCompanyContact());
				    renewOrgDetailInfo.setCompanyContactTitle(orgDetailInfo.getCompanyContactTitle());
				    renewOrgDetailInfo.setCompanyTelephone(orgDetailInfo.getCompanyTelephone());
				    renewOrgDetailInfo.setCompanyFax(orgDetailInfo.getCompanyFax());
					renewOrgDetailInfo.setCompanyEmail(orgDetailInfo.getCompanyEmail());
				    renewOrgDetailInfo.setCompanyWebsite(orgDetailInfo.getCompanyWebsite());
				    renewOrgDetailInfo.setCertificationScope(orgDetailInfo.getCertificationScope());
				    renewOrgDetailInfo.setCertificationScopeRadio(orgDetailInfo.getCertificationScopeRadio());
				    renewOrgDetailInfo.setManageAccessToAuditDet(orgDetailInfo.getManageAccessToAuditDet());
				    renewOrgDetailInfo.setOutsourceProcess(orgDetailInfo.getOutsourceProcess());
				    renewOrgDetailInfo.setRelevantRequirement(orgDetailInfo.getRelevantRequirement());
				    renewOrgDetailInfo.setRelevantRequirementList(orgDetailInfo.getRelevantRequirementList());
				    renewOrgDetailInfo.setManagementAccessToAudit(orgDetailInfo.getManagementAccessToAudit());
				    renewOrgDetailInfo.setPleaseManageDetail(orgDetailInfo.getPleaseManageDetail());
				    renewOrgDetailInfo.setKeyActivity(orgDetailInfo.getKeyActivity());
				    renewOrgDetailInfo.setDesiredCertification(orgDetailInfo.getDesiredCertification());
				    renewOrgDetailInfo.setTransferReason(orgDetailInfo.getTransferReason());
				    renewOrgDetailInfo.setSurveillanceSchedule(orgDetailInfo.getSurveillanceSchedule());
				    renewOrgDetailInfo.setCertifiedManagement(orgDetailInfo.getCertifiedManagement());
				    renewOrgDetailInfo.setIndicateStandard(orgDetailInfo.getIndicateStandard());
				    renewOrgDetailInfo.setCertifiedAccreditedCerti(orgDetailInfo.getCertifiedAccreditedCerti());
				    renewOrgDetailInfo.setCeritificationBodyName(orgDetailInfo.getCeritificationBodyName());
				    renewOrgDetailInfo.setCompanyUsedConsulting(orgDetailInfo.getCompanyUsedConsulting());
				    renewOrgDetailInfo.setConsultingFirm(orgDetailInfo.getConsultingFirm());
				    renewOrgDetailInfo.setConsultant(orgDetailInfo.getConsultant());
				    renewOrgDetailInfo.setTelephone(orgDetailInfo.getTelephone());
				    renewOrgDetailInfo.setNcbjApplicationId(ncbjRenewalApplicationId);
				    NcbjOrgDetailInfoLocalServiceUtil.updateNcbjOrgDetailInfo(renewOrgDetailInfo);
				}
				
				//third form
				NcbjAddLocMultiSite ncbjAdditionalLocation=null;
				NcbjAddLocMultiSite renewNcbjAdditionalLocation=null;
				
				try {
					ncbjAdditionalLocation= NcbjAddLocMultiSiteLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				try {
					renewNcbjAdditionalLocation= NcbjAddLocMultiSiteLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				
				if(ncbjAdditionalLocation!=null) {
					renewNcbjAdditionalLocation.setSignatureName(ncbjAdditionalLocation.getSignatureName());
					renewNcbjAdditionalLocation.setPosition(ncbjAdditionalLocation.getPosition());
					renewNcbjAdditionalLocation.setDate(ncbjAdditionalLocation.getDate());
				}
				
				//quotation form
				
				 //first form
				NcbjOrganizationDetail ncbjOrganizationDetail=null;
				NcbjOrganizationDetail renewNcbjOrganizationDetail=null;
				try {
					ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				try {
					renewNcbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
				} catch (Exception e) {
				}
				
			
				if(renewNcbjOrganizationDetail!=null) {
					  renewNcbjOrganizationDetail.setNameOfOrganization(ncbjOrganizationDetail.getNameOfOrganization());
					  renewNcbjOrganizationDetail.setAddress(ncbjOrganizationDetail.getAddress());
					  renewNcbjOrganizationDetail.setTelephoneNumber(ncbjOrganizationDetail.getTelephoneNumber());
					  renewNcbjOrganizationDetail.setFaxNumber(ncbjOrganizationDetail.getFaxNumber());
					  renewNcbjOrganizationDetail.setEmailAddress(ncbjOrganizationDetail.getEmailAddress());
					  renewNcbjOrganizationDetail.setHeadOfOrganization(ncbjOrganizationDetail.getHeadOfOrganization());
					  renewNcbjOrganizationDetail.setPosition(ncbjOrganizationDetail.getPosition());
					  renewNcbjOrganizationDetail.setContactPersonName(ncbjOrganizationDetail.getContactPersonName());
					  renewNcbjOrganizationDetail.setContactPersonEmailAddress(ncbjOrganizationDetail.getContactPersonEmailAddress());
					  renewNcbjOrganizationDetail.setContactPersonPosition(ncbjOrganizationDetail.getContactPersonPosition());
					  renewNcbjOrganizationDetail.setManagementSystem(ncbjOrganizationDetail.getManagementSystem());
					  renewNcbjOrganizationDetail.setDeterminedTheScope(ncbjOrganizationDetail.getDeterminedTheScope());
					  renewNcbjOrganizationDetail.setPleaseStageTheScope(ncbjOrganizationDetail.getPleaseStageTheScope());
					  renewNcbjOrganizationDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
					  NcbjOrganizationDetailLocalServiceUtil.updateNcbjOrganizationDetail(renewNcbjOrganizationDetail);
				}
				
				//Bo
				List<NcbjBusinessDetail>quotationBusinessDetail=null;
				NcbjBusinessDetail renewQuotationBusinessDetail=null;
				
				  try {
					  quotationBusinessDetail=NcbjBusinessDetailLocalServiceUtil.getByNcbjBusiDetail(ncbjApplicationId);
			        } catch (Exception e) {
					}
				
				  if(quotationBusinessDetail!=null) {
					  for(NcbjBusinessDetail quotation : quotationBusinessDetail) {
						  renewQuotationBusinessDetail=NcbjBusinessDetailLocalServiceUtil.createNcbjBusinessDetail(CounterLocalServiceUtil.increment());
						  renewQuotationBusinessDetail.setCounter(quotation.getCounter());
						  renewQuotationBusinessDetail.setQuotationAddressOne(quotation.getQuotationAddressOne());
						  renewQuotationBusinessDetail.setQuotationProductTypes(quotation.getQuotationProductTypes());
						  renewQuotationBusinessDetail.setQuotationApplicantShifts(quotation.getQuotationApplicantShifts());
						  renewQuotationBusinessDetail.setQuotationEmpNum(quotation.getQuotationEmpNum());
						  renewQuotationBusinessDetail.setQuotationHeadOffices(quotation.getQuotationHeadOffices());
						  renewQuotationBusinessDetail.setQuotationFullTimeEmploy(quotation.getQuotationFullTimeEmploy());
						  renewQuotationBusinessDetail.setQuotationPartTimeEmploy(quotation.getQuotationPartTimeEmploy());
						  renewQuotationBusinessDetail.setQuotationContractors(quotation.getQuotationContractors());
						  renewQuotationBusinessDetail.setQuotationContractedWorker(quotation.getQuotationContractedWorker());
						  renewQuotationBusinessDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
						  NcbjBusinessDetailLocalServiceUtil.updateNcbjBusinessDetail(renewQuotationBusinessDetail);
					 }
				  }
				
			}
	
			
}else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
	
	if(typeOfTransaction.equals("NCBJ Certified Clients")) {
		
		if(numberOfSite.equals("Single Site/Location")) {
			//Normal form sectiuon I
			
			NCBJCompanyNew newCompany=null;
			NCBJCompanyNew renewNewCompany=null;
			try {
				newCompany= NCBJCompanyNewLocalServiceUtil.getNCBJById(ncbjApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				renewNewCompany= NCBJCompanyNewLocalServiceUtil.getNCBJById(ncbjApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if(newCompany!=null) {
				  renewNewCompany.setCompanyName(newCompany.getCompanyName());
				  renewNewCompany.setCompanyAddress(newCompany.getCompanyAddress());
				  renewNewCompany.setHeadOfCompany(newCompany.getHeadOfCompany());
				  renewNewCompany.setJobTitleOne(newCompany.getJobTitleOne());
				  renewNewCompany.setCompanyEmailOne(newCompany.getCompanyEmailOne());
				  renewNewCompany.setCompanyNumOne(newCompany.getCompanyNumOne());
				  renewNewCompany.setJobTitleTwo(newCompany.getJobTitleTwo());
				  renewNewCompany.setContactName(newCompany.getContactName());
				  renewNewCompany.setCompanyEmailTwo(newCompany.getCompanyAddress());
				  renewNewCompany.setCompanyNumTwo(newCompany.getCompanyNumTwo());
				  renewNewCompany.setNcbjApplicationId(ncbjRenewalApplicationId);
				  NCBJCompanyNewLocalServiceUtil.updateNCBJCompanyNew(renewNewCompany);
				 
			}
			
		}
		
		else if(numberOfSite.equals("Multiple Sites more than one Location")) {
			//Bo SectionI 
		List<NcbjCompanyDetailGen> companyDetailTwo= null;
		NcbjCompanyDetailGen renewCompanyDetailTwo= null;		
		
		try {
			companyDetailTwo=NcbjCompanyDetailGenLocalServiceUtil.getNCBJListByAppId(ncbjRenewalApplicationId);
		} catch (Exception e) {}
		
		if(companyDetailTwo!=null) {
			 for(NcbjCompanyDetailGen companyDetail : companyDetailTwo) {
				    renewCompanyDetailTwo = NcbjCompanyDetailGenLocalServiceUtil.createNcbjCompanyDetailGen(CounterLocalServiceUtil.increment());
				    renewCompanyDetailTwo.setCounter(companyDetail.getCounter());
				    renewCompanyDetailTwo.setCompanyName(companyDetail.getCompanyName());
			        renewCompanyDetailTwo.setCompanyAddress(companyDetail.getCompanyAddress());
			        renewCompanyDetailTwo.setHeadOfCompany(companyDetail.getHeadOfCompany());
			        renewCompanyDetailTwo.setJobTitleOne(companyDetail.getJobTitleOne());
			        renewCompanyDetailTwo.setCompanyEmailOne(companyDetail.getCompanyEmailOne());
			        renewCompanyDetailTwo.setCompanyNumOne(companyDetail.getCompanyNumOne());
			        renewCompanyDetailTwo.setContactName(companyDetail.getContactName());
			        renewCompanyDetailTwo.setJobTitleTwo(companyDetail.getJobTitleTwo());
			        renewCompanyDetailTwo.setCompanyEmailTwo(companyDetail.getCompanyEmailTwo());
			        renewCompanyDetailTwo.setCompanyNumTwo(companyDetail.getCompanyNumTwo());
					renewCompanyDetailTwo.setNcbjApplicationId(ncbjRenewalApplicationId);	
					NcbjCompanyDetailGenLocalServiceUtil.updateNcbjCompanyDetailGen(renewCompanyDetailTwo);
			 }
			
			
		}
		
		}
		
		//second bo
	List<NcbjProductServiceDetail> productDetail = null;
		NcbjProductServiceDetail renewProductDetail = null;
		
		try {
			productDetail = NcbjProductServiceDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {}
		
		
		if(productDetail!=null) {
			for(NcbjProductServiceDetail product : productDetail ) {
				renewProductDetail = NcbjProductServiceDetailLocalServiceUtil.createNcbjProductServiceDetail(
						CounterLocalServiceUtil.increment());
				renewProductDetail.setCounter(product.getCounter());
				renewProductDetail.setProductType(product.getProductType());
				renewProductDetail.setProductList(product.getProductList());
				renewProductDetail.setProductLines(product.getProductLines());
				renewProductDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
				NcbjProductServiceDetailLocalServiceUtil.updateNcbjProductServiceDetail(renewProductDetail);
			}
		}
		
		//normal form
		
		NcbjPremisesLocation premisesLocation=null;
		NcbjPremisesLocation renewPremisesLocation=null;
		try {
			premisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		try {
			renewPremisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		
		
		if(premisesLocation!=null) {
			renewPremisesLocation.setActivityExclusion(premisesLocation.getActivityExclusion());
			renewPremisesLocation.setTransferReasonDraft(premisesLocation.getTransferReasonDraft());
			renewPremisesLocation.setTransferReasonAct(premisesLocation.getTransferReasonAct());
			renewPremisesLocation.setProductionFacilitySize(premisesLocation.getProductionFacilitySize());
			renewPremisesLocation.setWarehouseFacilitySize(premisesLocation.getWarehouseFacilitySize());
			renewPremisesLocation.setFacilitiesLocation(premisesLocation.getFacilitiesLocation());
			renewPremisesLocation.setDetailForDiffManagement(premisesLocation.getDetailForDiffManagement());
			renewPremisesLocation.setNcbjApplicationId(ncbjRenewalApplicationId);
			NcbjPremisesLocationLocalServiceUtil.updateNcbjPremisesLocation(renewPremisesLocation);
		}
		
		// Third Bo
		
	List<NcbjNumOfEmpAdd> productDetail2= null;
	NcbjNumOfEmpAdd renewProductDetail2 = null;
   
	try {
		productDetail2 = NcbjNumOfEmpAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
	if(productDetail2!=null) {
		for(NcbjNumOfEmpAdd detail  : productDetail2) {
			renewProductDetail2 = NcbjNumOfEmpAddLocalServiceUtil.createNcbjNumOfEmpAdd(
					CounterLocalServiceUtil.increment());
			renewProductDetail2.setCounter(detail.getCounter());
			renewProductDetail2.setHeadOffice(detail.getHeadOffice());
			renewProductDetail2.setAdministrationOffice(detail.getAdministrationOffice());
			renewProductDetail2.setProductionProcessing(detail.getProductionProcessing());
			renewProductDetail2.setMaintenanceService(detail.getMaintenanceService());
			renewProductDetail2.setLogistics(detail.getLogistics());
			renewProductDetail2.setTotal(detail.getTotal());
			renewProductDetail2.setSeasonal(detail.getSeasonal());
			renewProductDetail2.setTemporary(detail.getTemporary());
			renewProductDetail2.setSubcontracted(detail.getSubcontracted());
			renewProductDetail2.setNcbjApplicationId(ncbjRenewalApplicationId);
			NcbjNumOfEmpAddLocalServiceUtil.updateNcbjNumOfEmpAdd(renewProductDetail2);

		}
	}
	
	//fourth bo
List<NcbjSectionDetailAdd> workPattern = null;
	NcbjSectionDetailAdd renewWorkPattern = null;
	
	try {
		workPattern = NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
		
		
	if(workPattern!=null) {
		for(NcbjSectionDetailAdd work :workPattern) {
			renewWorkPattern = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			renewWorkPattern.setCounter(work.getCounter());
			renewWorkPattern.setAddDetails(work.getAddDetails());
			renewWorkPattern.setNcbjApplicationId(ncbjRenewalApplicationId);
			 NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(renewWorkPattern);
		}
	}
		
		
	//section 2
	NcbjSectionTwo processDetails=null;
	NcbjSectionTwo renewProcessDetails=null;
	try {
		processDetails= NcbjSectionTwoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	try {
		renewProcessDetails= NcbjSectionTwoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	
	if(processDetails!=null) {
		renewProcessDetails.setIncomingMaterials(processDetails.getIncomingMaterials());
		renewProcessDetails.setProductStorage(processDetails.getProductStorage());
		renewProcessDetails.setBuildingSiteAspects(processDetails.getBuildingSiteAspects());
		renewProcessDetails.setWasteDischarges(processDetails.getWasteDischarges());
		renewProcessDetails.setTransportDetails(processDetails.getTransportDetails());
		renewProcessDetails.setSubcontractedActivities(processDetails.getSubcontractedActivities());
		renewProcessDetails.setNcbjApplicationId(ncbjRenewalApplicationId);
		NcbjSectionTwoLocalServiceUtil.updateNcbjSectionTwo(renewProcessDetails);
	}
	
	//section 3
	NcbjSectionThree sectionThree=null;
	NcbjSectionThree renewSectionThree=null;
	try {
		sectionThree= NcbjSectionThreeLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
		// TODO: handle exception
	}
	try {
		renewSectionThree= NcbjSectionThreeLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	if(sectionThree!=null) {
		renewSectionThree.setProcessActivitiesList(sectionThree.getProcessActivitiesList());
		renewSectionThree.setIncomingMaterialsDes(sectionThree.getIncomingMaterialsDes());
		renewSectionThree.setExplainationBox(sectionThree.getExplainationBox());
		renewSectionThree.setCategoryOne(sectionThree.getCategoryOne());
		renewSectionThree.setProcessActivityDescription(sectionThree.getProcessActivityDescription());
		renewSectionThree.setProcessDescription(sectionThree.getProcessDescription());
		renewSectionThree.setNcbjApplicationId(ncbjRenewalApplicationId);
		NcbjSectionThreeLocalServiceUtil.updateNcbjSectionThree(renewSectionThree);
	}
	
	//checklist
	
	List<NcbjSpecificActivities> specificActivities = null;
	NcbjSpecificActivities renewSpecificActivities=null;
	
	try {
		specificActivities = NcbjSpecificActivitiesLocalServiceUtil.getNcbjById(ncbjApplicationId);
	} catch (Exception e) {
	}
	
	if(specificActivities!=null) {
		for(NcbjSpecificActivities specific : specificActivities) {
			renewSpecificActivities = NcbjSpecificActivitiesLocalServiceUtil
					.createNcbjSpecificActivities(CounterLocalServiceUtil.increment());
			renewSpecificActivities.setSpecificActivity(specific.getSpecificActivity());
			renewSpecificActivities.setSpecificActivityNumber(specific.getSpecificActivityNumber());
			renewSpecificActivities.setSpecificActivityChecked(specific.getSpecificActivityChecked());
			renewSpecificActivities.setNcbjApplicationId(ncbjRenewalApplicationId);
			NcbjSpecificActivitiesLocalServiceUtil.updateNcbjSpecificActivities(renewSpecificActivities);
		}
	}
	
	//Bo First 3 rd category
	
	List<NcbjSectionDetailAdd> haccpStudy = null;
	NcbjSectionDetailAdd renewHaccpStudy = null;
	
	try {
		haccpStudy = NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
	
	if(haccpStudy!=null) {
		for(NcbjSectionDetailAdd study :haccpStudy) {
			renewHaccpStudy = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			renewHaccpStudy.setCounter(study.getCounter());
			renewHaccpStudy.setAddNumHaccp(study.getAddNumHaccp());
			renewHaccpStudy.setAddTypeHaccp(study.getAddTypeHaccp());
			renewHaccpStudy.setNcbjApplicationId(ncbjRenewalApplicationId);
			NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(renewHaccpStudy);
		}
	}
	
	//Bo Second 3 rd category
	List<NcbjSectionDetailAdd> analysisDetail = null;
	NcbjSectionDetailAdd renewAnalysisDetail = null;
	try {
		analysisDetail = NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
	
	if(analysisDetail!=null) {
		for(NcbjSectionDetailAdd analysis : analysisDetail) {
			renewAnalysisDetail = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			renewAnalysisDetail.setCounter(analysis.getCounter());
			renewAnalysisDetail.setAddHazard(analysis.getAddHazard());
			renewAnalysisDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
			NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(renewAnalysisDetail);
		}
	}
	
	//Bo Fourth 3 rd Category
	List<NcbjSectionDetailAdd> consentDetail = null;
	NcbjSectionDetailAdd renewConsentDetail = null;
	try {
		consentDetail = NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}		
	
	if(consentDetail!=null) {
		for(NcbjSectionDetailAdd section :consentDetail) {
			renewConsentDetail = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			renewConsentDetail.setCounter(section.getCounter());
			renewConsentDetail.setAddConsentLic(section.getAddConsentLic());
			renewConsentDetail.setNcbjApplicationId(ncbjRenewalApplicationId);
				NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(renewConsentDetail);
		}
			
		}
	
	//section 4
	
	NcbjSectionFour consultService=null;
	NcbjSectionFour renewConsultService=null;
	
	try {
		consultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	
	try {
		renewConsultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	
	if(consultService!=null) {
		renewConsultService.setConsultService(consultService.getConsultService());
		renewConsultService.setConsultTelephone(consultService.getConsultTelephone());
		renewConsultService.setConsultEmail(consultService.getConsultEmail());
		renewConsultService.setConsultStageOne(consultService.getConsultStageOne());
		renewConsultService.setConsultStageTwo(consultService.getConsultStageTwo());
		renewConsultService.setConsultPreassessmentAudit(consultService.getConsultPreassessmentAudit());
		renewConsultService.setConsultRecertificationAudit(consultService.getConsultRecertificationAudit());
		renewConsultService.setConsultOtherService(consultService.getConsultOtherService());
		renewConsultService.setConsultSurveillanceAudit(consultService.getConsultSurveillanceAudit());
		renewConsultService.setConsultDate(consultService.getConsultDate());
		renewConsultService.setConsultName(consultService.getConsultName());
		renewConsultService.setConsultPosition(consultService.getConsultPosition());
		renewConsultService.setNcbjApplicationId(ncbjRenewalApplicationId);
		NcbjSectionFourLocalServiceUtil.updateNcbjSectionFour(renewConsultService);
	}
	
	//quotation form'
	NcbjOrganizationDetail quotationFormTwo=null;
	NcbjOrganizationDetail renewQuotationFormTwo=null;
	try {
		quotationFormTwo= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	try {
		renewQuotationFormTwo= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
	} catch (Exception e) {
	}
	

	if(quotationFormTwo!=null) {
		  renewQuotationFormTwo.setNameOfOrganization(quotationFormTwo.getNameOfOrganization());
		  renewQuotationFormTwo.setAddress(quotationFormTwo.getAddress());
		  renewQuotationFormTwo.setTelephoneNumber(quotationFormTwo.getTelephoneNumber());
		  renewQuotationFormTwo.setFaxNumber(quotationFormTwo.getFaxNumber());
		  renewQuotationFormTwo.setEmailAddress(quotationFormTwo.getEmailAddress());
		  renewQuotationFormTwo.setHeadOfOrganization(quotationFormTwo.getHeadOfOrganization());
		  renewQuotationFormTwo.setPosition(quotationFormTwo.getPosition());
		  renewQuotationFormTwo.setPositionSecondFo(quotationFormTwo.getPositionSecondFo());
		  renewQuotationFormTwo.setManagementSystemFo(quotationFormTwo.getManagementSystemFo());
		  renewQuotationFormTwo.setProductTypes(quotationFormTwo.getProductTypes());
		  renewQuotationFormTwo.setProductLine(quotationFormTwo.getProductLine());
		  renewQuotationFormTwo.setHaccpStudies(quotationFormTwo.getHaccpStudies());
		  renewQuotationFormTwo.setCriticalControlPoints(quotationFormTwo.getCriticalControlPoints());
		  renewQuotationFormTwo.setOperationalNumber(quotationFormTwo.getOperationalNumber());
		  renewQuotationFormTwo.setProductionSize(quotationFormTwo.getProductionSize());
		  renewQuotationFormTwo.setWarehouseSize(quotationFormTwo.getWarehouseSize());
		  renewQuotationFormTwo.setDeterminedTheScope(quotationFormTwo.getDeterminedTheScope());
		  renewQuotationFormTwo.setSeasonalProcess(quotationFormTwo.getSeasonalProcess());
		  renewQuotationFormTwo.setNcbjApplicationId(ncbjRenewalApplicationId);
		  NcbjOrganizationDetailLocalServiceUtil.updateNcbjOrganizationDetail(renewQuotationFormTwo);
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
}
}
