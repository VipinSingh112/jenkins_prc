package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
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
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.osi.service.document.upload.util.OsiServicesApplicationDataCreationUtil;
import com.nbp.osi.service.document.upload.util.OsiServicesApplicationDocumentsCopyUtil;
import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;
import com.nbp.osi.services.application.form.service.service.OSIServiceComSignLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServiceApplicationWorkflowConstant;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, property = 
	{ 
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		    "mvc.command.name=renew/License/info" 
			}, 
	service = MVCResourceCommand.class
	)
public class RenewOsiServiceLicenceResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "OSI Services Supported Documents";
	static Log _log = LogFactoryUtil.getLog(RenewOsiServiceLicenceResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String permitNumber = ParamUtil.getString(resourceRequest, "permitNumber");
		String natureOfApplicant = ParamUtil.getString(resourceRequest, "natureOfApplicant");
		String doYouWant = ParamUtil.getString(resourceRequest, "doYouWant");
		OsiServicesApplication  osiServiceApplication =null;
		OsiServicesApplication  osiServiceRenewalProcess = null;
		long osiServiceApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					osiServiceApplication = OsiServicesApplicationLocalServiceUtil.getOSIServicesByAppNo(licenseNumber);
				}
			 osiServiceApplicationId=osiServiceApplication.getOsiServicesApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(osiServiceApplication)) {
				if (Validator.isNull(licenseNumber)&&(Validator.isNull(permitNumber))){
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
				else if (Validator.isNotNull(licenseNumber)) {
					String renewUrl = OsiServicesApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber ,natureOfApplicant,doYouWant);
					jsonOBJ.put("renewLicenseUrl", renewUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().print(jsonFeed.toString());
				}
				else {
				String renewUrl = OsiServicesApplicationDataCreationUtil.getApplicationData(themeDisplay, permitNumber,natureOfApplicant,doYouWant);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(osiServiceApplication.getStatus()==OSIServiceApplicationWorkflowConstant.SUBMITTED) {
					if (Validator.isNotNull(licenseNumber)) {
						try {
							osiServiceRenewalProcess = OsiServicesApplicationLocalServiceUtil
									.getOsiServicesByAT_AppNo(OSIServiceApplicationWorkflowConstant.RENEW_PROCESS,licenseNumber);
						} catch (Exception e) {
						}
					}
					if(osiServiceRenewalProcess == null) {
						osiServiceRenewalProcess = OsiServicesApplicationLocalServiceUtil.createOsiServicesApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						osiServiceRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						osiServiceRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						osiServiceRenewalProcess.setCreateDate(new Date());
						osiServiceRenewalProcess.setUserId(themeDisplay.getUserId());
						osiServiceRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						osiServiceRenewalProcess.setDoYouWant(osiServiceApplication.getDoYouWant());
						osiServiceRenewalProcess.setTypeOfApplicant(osiServiceApplication.getTypeOfApplicant());
						osiServiceRenewalProcess.setNatureOfApplicant(osiServiceApplication.getNatureOfApplicant());
						osiServiceRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						osiServiceRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						osiServiceRenewalProcess.setTypeOfTransaction(OSIServiceApplicationWorkflowConstant.RENEW_PROCESS);
						osiServiceRenewalProcess.setStatus(OSIServiceApplicationWorkflowConstant.DRAFT);
						OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServiceRenewalProcess);
				
							OSIServiceCurrentStage renewCurrentStage= OSIServiceCurrentStageLocalServiceUtil.createOSIServiceCurrentStage(CounterLocalServiceUtil.increment());
							renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
							if(osiServiceApplication.getNatureOfApplicant().equals("Individual")) {
								renewCurrentStage.setLastFormDetailsStep("childStep6");
							}else if(osiServiceApplication.getNatureOfApplicant().equals("Company")) {
								renewCurrentStage.setLastFormDetailsStep("childStep13");
							}
							
							renewCurrentStage.setOsiServicesApplicationId(osiServiceRenewalProcess.getOsiServicesApplicationId());
							OSIServiceCurrentStageLocalServiceUtil.updateOSIServiceCurrentStage(renewCurrentStage);
						copyingDataFromOriginalApplication(osiServiceApplication.getOsiServicesApplicationId(), osiServiceRenewalProcess.getOsiServicesApplicationId());
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

						} catch (PortalException e) {
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(osiServiceApplicationId));
						} catch (PortalException e) {
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											osiServiceRenewalProcess.getOsiServicesApplicationId()));
						} catch (Exception e) {
						}
						if (copiedDlFolder == null) {
							try {
								OsiServicesApplicationDocumentsCopyUtil.copyFolder(
										themeDisplay.getScopeGroupId(),
										supportingDocsMainFolder.getFolderId(),
										originalRootDlFolder.getFolderId(),
										String.valueOf(osiServiceRenewalProcess.getOsiServicesApplicationId()),
										supportingDocsMainFolder.getDescription(),
										serviceContext,
										supportingDocsMainFolder.getFolderId(),
										themeDisplay.getUserId(),
										osiServiceRenewalProcess.getOsiServicesApplicationId());

							}catch (Exception e) {
							}
							}
					}
					String renewLicenseUrl = "/group/guest/osi-service-application?osiServiceApplicationId="
							+ osiServiceRenewalProcess.getOsiServicesApplicationId();
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
		} catch (Exception e) {
		}
		return false;
	}
	
	public static void copyingDataFromOriginalApplication(long osiServicesApplicationId,
			long osiServiceRenewAppId) {
	 OsiServicesApplication  osiServiceApplication =null;
	 try {
		 osiServiceApplication= OsiServicesApplicationLocalServiceUtil.getOsiServicesApplication(osiServicesApplicationId);
	} catch (Exception e) {
	}
	 if(osiServiceApplication.getNatureOfApplicant().equals("Individual")) {
		 
	
	 OsiServicesTrusteeIndividualDetailinfo detailinfo = null;
		try {
			detailinfo = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.getOsiServicesTrusteeIndividualDetailinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		OsiServicesTrusteeIndividualDetailinfo ciData = null;
		try {
			ciData = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.getOsiServicesTrusteeIndividualDetailinfoById(osiServiceRenewAppId);
		}catch(Exception e) {
		}
		if(ciData==null) {
			ciData= OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.createOsiServicesTrusteeIndividualDetailinfo(CounterLocalServiceUtil.increment());
		}
		if(detailinfo != null) {
			ciData.setIndiFamilyName(detailinfo.getIndiFamilyName());
			ciData.setIndiGivenName(detailinfo.getIndiGivenName());
			ciData.setIndiDateOfBirth(detailinfo.getIndiDateOfBirth());
			ciData.setIndiOtherLegalNames(detailinfo.getIndiOtherLegalNames());
			ciData.setIndiBusinessAddress(detailinfo.getIndiBusinessAddress());
			ciData.setIndiBusinessTeleNo(detailinfo.getIndiBusinessTeleNo());
			ciData.setIndiBusinessFaxNo(detailinfo.getIndiBusinessFaxNo());
			ciData.setIndiBusinessEmail(detailinfo.getIndiBusinessEmail());
			ciData.setIndiHomeAddress(detailinfo.getIndiHomeAddress());
			ciData.setIndiHomeTeleNo(detailinfo.getIndiHomeTeleNo());
			ciData.setIndiHomeFaxNo(detailinfo.getIndiHomeFaxNo());
			ciData.setIndiHomeEmail(detailinfo.getIndiHomeEmail());
			ciData.setIndiCurrentEmployer(detailinfo.getIndiCurrentEmployer());
			ciData.setIndiDateOfEmployment(detailinfo.getIndiDateOfEmployment());
			ciData.setIndiProfessionalOrg(detailinfo.getIndiProfessionalOrg());
			ciData.setOsiServicesApplicationId(osiServiceRenewAppId);
			OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.updateOsiServicesTrusteeIndividualDetailinfo(ciData);
		}
		///
		OsiServicesTrusteeIndividualQualificationinfo  individualQualificationinfo=null;
		OsiServicesTrusteeIndividualQualificationinfo renewIndiQualaification= null;
		
		try {
			individualQualificationinfo= OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.getOsiServicesTrusteeIndividualQualificationinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewIndiQualaification = OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.getOsiServicesTrusteeIndividualQualificationinfoById(osiServiceRenewAppId);
		}catch (Exception e) {
		}
		if(renewIndiQualaification==null) {
			renewIndiQualaification=OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.createOsiServicesTrusteeIndividualQualificationinfo(CounterLocalServiceUtil.increment());
		}
		if(individualQualificationinfo != null) {
			renewIndiQualaification.setOrgMember(individualQualificationinfo.getOrgMember());
			renewIndiQualaification.setOsiServicesApplicationId(osiServiceRenewAppId);
			OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil.updateOsiServicesTrusteeIndividualQualificationinfo(renewIndiQualaification);
			
		}
		
		///
		OsiServicesTrusteeDeclerationAndSignatureinfo andSignatureinfo=null;
		OsiServicesTrusteeDeclerationAndSignatureinfo renewSignatureinfo= null;
		
		try {
			andSignatureinfo= OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.getOsiServicesTrusteeDeclerationAndSignatureinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewSignatureinfo = OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.getOsiServicesTrusteeDeclerationAndSignatureinfoById(osiServiceRenewAppId);
		}catch (Exception e) {
		}
		if(renewSignatureinfo==null) {
			renewSignatureinfo=OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.createOsiServicesTrusteeDeclerationAndSignatureinfo(CounterLocalServiceUtil.increment());
		}
		if(andSignatureinfo != null) {
			renewSignatureinfo.setIndiUndersignedDated(andSignatureinfo.getIndiUndersignedDated());
			renewSignatureinfo.setIndiUndersignedApplicantName(andSignatureinfo.getIndiUndersignedApplicantName());
			renewSignatureinfo.setOsiServicesApplicationId(osiServiceRenewAppId);
			OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil.updateOsiServicesTrusteeDeclerationAndSignatureinfo(renewSignatureinfo);
			
		}
		
		///
		OsiServicesTrusteeLicenseBreakdowninfo breakdowninfo=null;
		OsiServicesTrusteeLicenseBreakdowninfo renewBreakdowninfo= null;
		
		try {
			breakdowninfo= OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.getOsiServicesTrusteeLicenseBreakdowninfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewBreakdowninfo = OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.getOsiServicesTrusteeLicenseBreakdowninfoById(osiServiceRenewAppId);
		}catch (Exception e) {
		}
		if(renewBreakdowninfo==null) {
			renewBreakdowninfo= OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.createOsiServicesTrusteeLicenseBreakdowninfo(CounterLocalServiceUtil.increment());
		}
		if(breakdowninfo != null) {
			renewBreakdowninfo.setIndiBreakdownApplicantName(breakdowninfo.getIndiBreakdownApplicantName());
			renewBreakdowninfo.setIndiBreakdownFirm(breakdowninfo.getIndiBreakdownFirm());
			renewBreakdowninfo.setIndiBreakdownDated(breakdowninfo.getIndiBreakdownDated());
			renewBreakdowninfo.setIndiBreakdownTrusteeName(breakdowninfo.getIndiBreakdownTrusteeName());
			renewBreakdowninfo.setIndiBreakdownTrusteeDate(breakdowninfo.getIndiBreakdownTrusteeDate());
			renewBreakdowninfo.setOsiServicesApplicationId(osiServiceRenewAppId);
			OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil.updateOsiServicesTrusteeLicenseBreakdowninfo(renewBreakdowninfo);
			
		}
		////
		List<OsiServicesTrusteeBreadDownAddinfo>  originalAddinfo = null;
		OsiServicesTrusteeBreadDownAddinfo renewAddinfo = null;
		try {
			originalAddinfo = OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.getBreakDownAdd_By_Id(osiServicesApplicationId);
		}catch (Exception e) {
		}
		if(originalAddinfo != null){
			for (OsiServicesTrusteeBreadDownAddinfo trusteeBreakDownInfo : originalAddinfo) {
				renewAddinfo = OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.createOsiServicesTrusteeBreadDownAddinfo(CounterLocalServiceUtil.increment());
				renewAddinfo.setBreakdownWorkingYear(trusteeBreakDownInfo.getBreakdownWorkingYear());
				renewAddinfo.setWorkingBankrupties(trusteeBreakDownInfo.getWorkingBankrupties());
				renewAddinfo.setWorkingProposal(trusteeBreakDownInfo.getWorkingProposal());
				renewAddinfo.setWorkingComBankrupts(trusteeBreakDownInfo.getWorkingComBankrupts());
				renewAddinfo.setWorkingComProposal(trusteeBreakDownInfo.getWorkingComProposal());
				renewAddinfo.setWorkingInterimReceive(trusteeBreakDownInfo.getWorkingInterimReceive());
				renewAddinfo.setBreakdownWorkingCreditors(trusteeBreakDownInfo.getBreakdownWorkingCreditors());
				renewAddinfo.setBreakdownWorkingOther(trusteeBreakDownInfo.getBreakdownWorkingOther());
				renewAddinfo.setCounter(trusteeBreakDownInfo.getCounter());
				renewAddinfo.setOsiServicesApplicationId(osiServiceRenewAppId);
				OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.updateOsiServicesTrusteeBreadDownAddinfo(renewAddinfo);
			}	
		}
		///
		 OSIServiceSupportingDocInd supportingDocInd=null;
		 OSIServiceSupportingDocInd renewSupportingDocInd= null;
		
		try {
			supportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewSupportingDocInd = OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServiceRenewAppId);
		}catch (Exception e) {
		}
		if(renewSupportingDocInd==null) {
			renewSupportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.createOSIServiceSupportingDocInd(CounterLocalServiceUtil.increment());
		}
		if(supportingDocInd != null) {
			renewSupportingDocInd.setSupportingDocCheckboxes(supportingDocInd.getSupportingDocCheckboxes());
			renewSupportingDocInd.setCategory(supportingDocInd.getCategory());
			renewSupportingDocInd.setOsiServicesApplicationId(osiServiceRenewAppId);
			OSIServiceSupportingDocIndLocalServiceUtil.updateOSIServiceSupportingDocInd(renewSupportingDocInd);
			
		}
	 }else if(osiServiceApplication.getNatureOfApplicant().equals("Company")) {
		 OsiServicesTrusteeCompanyinfo companyinfo=null;
		 OsiServicesTrusteeCompanyinfo renewCompanyinfo=null;
		
		try {
			companyinfo= OsiServicesTrusteeCompanyinfoLocalServiceUtil.getOsiServicesTrusteeCompanyinfoById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewCompanyinfo = OsiServicesTrusteeCompanyinfoLocalServiceUtil.getOsiServicesTrusteeCompanyinfoById(osiServiceRenewAppId);
		}catch (Exception e) {
		}
		if(renewCompanyinfo==null) {
			renewCompanyinfo= OsiServicesTrusteeCompanyinfoLocalServiceUtil.createOsiServicesTrusteeCompanyinfo(CounterLocalServiceUtil.increment());
		}
		if(companyinfo != null) {
			renewCompanyinfo.setComCorporationName(companyinfo.getComCorporationName());
			renewCompanyinfo.setComHeadOfficeAddress(companyinfo.getComHeadOfficeAddress());
			renewCompanyinfo.setComTeleNo(companyinfo.getComTeleNo());
			renewCompanyinfo.setComFaxNo(companyinfo.getComFaxNo());
			renewCompanyinfo.setComEmail(companyinfo.getComEmail());
			renewCompanyinfo.setOtherCountry(companyinfo.getOtherCountry());
			renewCompanyinfo.setComIncorporationDate(companyinfo.getComIncorporationDate());
			renewCompanyinfo.setComLicenceRequest(companyinfo.getComLicenceRequest());
			renewCompanyinfo.setOsiServicesApplicationId(osiServiceRenewAppId);
			OsiServicesTrusteeCompanyinfoLocalServiceUtil.updateOsiServicesTrusteeCompanyinfo(renewCompanyinfo);
		}
		///
		OSIServiceComSign osiServiceComSign=null;
		OSIServiceComSign renewalComSign=null;
		
		try {
			osiServiceComSign=OSIServiceComSignLocalServiceUtil.getOsiServicesSignBy_Id(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewalComSign = OSIServiceComSignLocalServiceUtil.getOsiServicesSignBy_Id(osiServicesApplicationId);
		}catch (Exception e) {
		}
		if(renewalComSign==null) {
			renewalComSign= OSIServiceComSignLocalServiceUtil.createOSIServiceComSign(CounterLocalServiceUtil.increment());
		}
		if(companyinfo != null) {
			renewalComSign.setComSignDate(osiServiceComSign.getComSignDate());
			renewalComSign.setOsiServicesApplicationId(osiServiceRenewAppId);
			OSIServiceComSignLocalServiceUtil.updateOSIServiceComSign(renewalComSign);
		}
		///
		OSIServiceSupportingDocInd supportingDocInd=null;
		OSIServiceSupportingDocInd renewComsupportDocInd=null;
		try {
			supportingDocInd=OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		try {
			renewComsupportDocInd = OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServicesApplicationId);
		}catch (Exception e) {
		}
		if(renewComsupportDocInd==null) {
			renewComsupportDocInd= OSIServiceSupportingDocIndLocalServiceUtil.createOSIServiceSupportingDocInd(CounterLocalServiceUtil.increment());
		}
		if(companyinfo != null) {
			renewComsupportDocInd.setSupportingDocCheckboxes(supportingDocInd.getSupportingDocCheckboxes());
			renewComsupportDocInd.setNonProvisionReasonReq1(supportingDocInd.getNonProvisionReasonReq1());
			renewComsupportDocInd.setExpectedDateReq1(supportingDocInd.getExpectedDateReq1()); 
			renewComsupportDocInd.setNonProvisionReasonReq2(supportingDocInd.getNonProvisionReasonReq2());
			renewComsupportDocInd.setExpectedDateReq2(supportingDocInd.getExpectedDateReq2()); 
			renewComsupportDocInd.setNonProvisionReasonReq3(supportingDocInd.getNonProvisionReasonReq3());
			renewComsupportDocInd.setExpectedDateReq3(supportingDocInd.getExpectedDateReq3()); 
			renewComsupportDocInd.setNonProvisionReasonReq4(supportingDocInd.getNonProvisionReasonReq4());
			renewComsupportDocInd.setExpectedDateReq4(supportingDocInd.getExpectedDateReq4()); 
			renewComsupportDocInd.setNonProvisionReasonReq5(supportingDocInd.getNonProvisionReasonReq5());
			renewComsupportDocInd.setExpectedDateReq5(supportingDocInd.getExpectedDateReq5());
			renewComsupportDocInd.setNonProvisionReasonReq6(supportingDocInd.getNonProvisionReasonReq6());
			renewComsupportDocInd.setExpectedDateReq6(supportingDocInd.getExpectedDateReq6());
			renewComsupportDocInd.setNonProvisionReasonReq7(supportingDocInd.getNonProvisionReasonReq7());
			renewComsupportDocInd.setExpectedDateReq7(supportingDocInd.getExpectedDateReq7());
			renewComsupportDocInd.setNonProvisionReasonReq8(supportingDocInd.getNonProvisionReasonReq8());
			renewComsupportDocInd.setExpectedDateReq8(supportingDocInd.getExpectedDateReq8());
			renewComsupportDocInd.setNonProvisionReasonReq9(supportingDocInd.getNonProvisionReasonReq9());
			renewComsupportDocInd.setExpectedDateReq9(supportingDocInd.getExpectedDateReq9());
			renewComsupportDocInd.setNonProvisionReasonReq10(supportingDocInd.getNonProvisionReasonReq10());
			renewComsupportDocInd.setExpectedDateReq10(supportingDocInd.getExpectedDateReq10());
			renewComsupportDocInd.setNonProvisionReasonReq11(supportingDocInd.getNonProvisionReasonReq11());
			renewComsupportDocInd.setExpectedDateReq11(supportingDocInd.getExpectedDateReq11());
			renewComsupportDocInd.setNonProvisionReasonReq12(supportingDocInd.getNonProvisionReasonReq12());
			renewComsupportDocInd.setExpectedDateReq12(supportingDocInd.getExpectedDateReq12());
			renewComsupportDocInd.setCategory(supportingDocInd.getCategory());
			renewComsupportDocInd.setOsiServicesApplicationId(osiServiceRenewAppId);
			OSIServiceSupportingDocIndLocalServiceUtil.updateOSIServiceSupportingDocInd(renewComsupportDocInd);
		}
		 
	 }
		OsiServicesAppPayment applicationPayment = null;
		OsiServicesAppPayment originalPayment = null;
		try {
			originalPayment=OsiServicesAppPaymentLocalServiceUtil.getOsiServiceAppPaymentById(osiServicesApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(originalPayment)) {
		applicationPayment = OsiServicesAppPaymentLocalServiceUtil.createOsiServicesAppPayment(
				CounterLocalServiceUtil.increment(OsiServicesAppPayment.class.getName()));
		applicationPayment.setPaymentMethod(originalPayment.getPaymentMethod());
		applicationPayment.setPaymentFee(originalPayment.getPaymentFee());
		applicationPayment.setOsiServicesApplicationId(osiServiceRenewAppId);
		OsiServicesAppPaymentLocalServiceUtil.updateOsiServicesAppPayment(applicationPayment);
		}
	}
	@Reference
	private CommonsUtil commonsUtil;
}

