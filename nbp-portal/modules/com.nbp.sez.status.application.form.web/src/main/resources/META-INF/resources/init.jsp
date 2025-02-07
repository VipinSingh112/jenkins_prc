<%@page import="com.nbp.sez.status.application.form.service.service.SezOccLocationAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccLocationAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusWFMLocationAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplication"%>
<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevPropDevelopmentPlanLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevProposedProjectLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevProposedProject"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareholdingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevGeneralBusinessIfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusWorkFromHomeLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevGenBusinessInfoAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevProposedProjectAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevEmployeeDefineOccuAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareComDirectorShipAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareCorporationBusAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevSharePleaseStateAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevEmployeeSafetyInfoAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareDirectorAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevSharePrincipalAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneEmployInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneLocationAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleDirectorLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantEmploymentInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantLocationAddBoxLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleOfficerLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoLocalService"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneFinancialInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneGeneralBusinessInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDeveloperDetailsLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDeveloperDetails"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusAppPayment"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevGeneralBusinessIfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplication"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusApplicationCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantInvestAndFinanceInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantUserUndertakingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantShareHoldingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessAddressLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantGeneralBussinessInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<portlet:resourceURL var="sezOccupantGeneralBussinessInfo" id="/sez/status/occupant/general/bussiness/detail"></portlet:resourceURL>
<portlet:resourceURL var="occupantShareHoldingInfo" id="/sez/status/sahre/holding"></portlet:resourceURL>
<portlet:resourceURL var="occupantDirectorAddForm" id="/sez/status/occupant/director/add/form"></portlet:resourceURL>
<portlet:resourceURL var="occupantPrincipleShareHoldingInfo" id="/sez/status/occupant/principle/add/form"></portlet:resourceURL>
<portlet:resourceURL var="occupantPrincipleOfficerInfo" id="/sez/status/occupant/principle/officer/add/form"></portlet:resourceURL>
<portlet:resourceURL var="occupantProposedProjectInfo" id="/sez/status/occupant/proposed/info"></portlet:resourceURL>
<portlet:resourceURL var="proposedDevelopmentInfo" id="/sez/status/proposed/development/info"></portlet:resourceURL>
<portlet:resourceURL var="occupantInvestmentInfo" id="/sez/status/occupant/investment/info"></portlet:resourceURL>
<portlet:resourceURL var="occupantEmploymentInfo" id="/sez/status/occupant/employee/info"></portlet:resourceURL>
<portlet:resourceURL var="occupantDeliveryUndertakingInfo" id="/sez/status/occupant/delivery/undertaking/info"></portlet:resourceURL>
<portlet:resourceURL var="occupantSubmissionInfo" id="/sez/status/occupant/submission/info"></portlet:resourceURL>
<portlet:resourceURL var="occupantZoneUndertakingInfol" id="/sez/status/occupant/zone/undertaking/info"></portlet:resourceURL>
<portlet:resourceURL var="locationBoxAddFormInfo" id="/sez/status/occupant/location/Box/info"></portlet:resourceURL>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupanteDeveloperUndertakingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo"%>
<portlet:resourceURL var="sezStatusPending" id="/sez/status/pending"></portlet:resourceURL>
<portlet:resourceURL var="sezStatusDeveloperDetail" id="/sez/status/developer/details"></portlet:resourceURL>
<portlet:resourceURL var="sezStatusGettingDocumentList" id="/sez/status/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="sezDoucumentsUpload" id="/sez/status/document/upload"></portlet:resourceURL>
<portlet:resourceURL var="sezDeletedocumentUrl" id="/sez/status/document/delete"></portlet:resourceURL>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:resourceURL var ="signatureUploadInSEZFormUrl" id="/upload/signature/in/sez"></portlet:resourceURL>
<portlet:resourceURL var ="addWorkFromHomeInfoUrl" id="/work/from/home/info/in/sez"></portlet:resourceURL>
<portlet:resourceURL var ="addWfhLocationDetailInfoUrl" id="/wfh/location/info/sez"></portlet:resourceURL>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%String fileUrl="";
	String sezStatus="";
	String renew="";
    String typeOfTransaction="";
	String zoneClassification="";
	String specialEconomicZone="";
	String parish="";
	String industries="";
	String clickPaymentOption="";		
	String amount="";		
	String currency="";		
	String occFreeZone="";		
	String occFreeZoneLocation="";		
	String occOwnerShip="";		
	String infastructureOther="";		
	String zoneExistingCompany="";		
	String zoneExistingCompanyOther="";		
	String zoneFreeZoneLocation="";		
	String zoneSourceOfFinance="";	
	int sizeOfOccupantShareHoldingInfo=0;
	int sizeOfLocationAddBox=0;
	int sizeOfProjectLabour=0;
	int sizeOfOccupantLocationAdd=0;
	String counterOfOccupantShareHoldingInfo="";
	int sizeOfOccupantPrincipleOfficer=0;
	int sizeOfOccupantEmployeeInfo=0;
	String counterOfOccupantPrincipleOfficer="";
	long sezStatusApplicationId=0;
	SezStatusApplication applicationData=null;
	SezZoneProposedProjectInfo sezZoneProposedProjectInfo = null;
	DLFolder supportingDocumentsFolder = null;
	DLFolder supportingDocumentsParentFolder = null;
	DLFolder supportingDocumentsFolderSubFolder = null;
	List<DLFileEntry> fileEntryPaymentFile = null;
	List<DLFileEntry> supportinfDocFileEntries = null;
	SezStatusAppPayment applicationPayment=null;
	SezStatusApplicationCurrentStage applicationCurrentStage=null;
	SezOccupantExistingProposedProjectBriefInfo briefInfo=null;
	SezOccupantProposedAreaDevelopmentPlanInfo areaDevelopmentPlanInfo = null;
	SezZoneFinancialInfo sezZoneFinancialInfo = null;
	List<SezOccupantDirectorPartnerSponsorInfo> sezDirectorOccSponsor=null;
	List<SezOccupantPrincipleDirector> sezOccupantShareHoldingInfos=null;
	List<SezOccupantPrincipleOfficer> sezOccupantPrincipleOfficer=null;
	List<SezOccupantLocationAddBox> sezOccupantLocationAddBox=null;
	List<SezOccupantEmploymentInfo> sezOccupantEmploymentInfos=null;
	List<SezOccLocationAdd> sezOccupantLocationAdd=null;
	
	//zone-user
	List<SezZoneLocationAdd> zoneLocationAdd=null;
	List<SezZoneEmployInfo> sezZoneEmpInfo = null;
	int sizeZoneLocationAdd=0;
	int sizeZoneEmpInfo=0;
	long occDirectorSponsorSize=0;
	DLFolder supportingDocumentFolder = null;
	DLFolder supportingSubDocumentFolder = null;
	DLFolder docAttachedStatement = null;
	List<DLFileEntry> attachedFileEntry = null;
	FileEntry attachDocFE=null;
	String feeRecipet="";
	String feeRecipetUrl="";
	String approveLetter="";
	String approveLetterUrl="";
	String zoneAgree="";
	String zoneAgreeUrl="";
	String occApproveLetter="";
	String occApproveLetterUrl="";
	String occAgree="";
	String occAgreeUrl="";
	// developer
	List<SezDevSharePrincipalAdd> sharePrincipalAdd=null;
	List<SezDevShareDirectorAdd> shareDirectorAdd=null;
	List<SezDevShareComDirectorShipAdd> directorShip=null;
	List<SezDevShareCorporationBusAdd> corporationBus=null;
	List<SezDevSharePleaseStateAdd> sharePleaseState=null;
	List<SezDevEmployeeSafetyInfoAdd> employeeSafety = null;
	List<SezDevEmployeeDefineOccuAdd> employeeDefineOcuu = null;
	List<SezDevDisasterManagementAdd> disManagementAdd = null;
	List<SezDevProposedProjectAdd> devProposedProjectAdd=null;
	List<SezDevGenBusinessInfoAdd> genBusinessAdd=null;
	int sizeOfDevGenBussinessAdd=0;
	int sizeOfDevSharePrinciple=0;
	int sizeOfDevShareDirectorAdd=0;
	int sizeOfDevShareComDirectorShipAdd=0;
	int sizeOfDevSharCorporationBusAdd=0;
	int sizeOfDevSharPleaseStateAdd=0;
	int sizeOfDevSharSafetyInfoAdd=0;
	int sizeOfDevSharDefineOccuAdd=0;
	int sizeOfDevSharDisasterManagementAdd=0;
	int sizeOfDevSharProjectAdd=0;
	String occDirectorSponsorCounter="";
	String doYouWant="";
	int counterOfDocuments=1;
	String existingJamaicanCom="";
	String occExistingOther="";
	String currentStage="";
	String lastFormStep="";
	String zoneDeniedApproval="";
	SezOccupantGeneralBussinessInfo bussinessInfo=null;
	SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo = null;
	SezDeveloperDetails sezDeveloperDetails=null;
	String jointVenture="";
	String existingJamaicanCompanies="";
	String articleOfIncorporation="";
	String directorBankRuptcy="";
	String previouslyFreeZone="";
	String currentlyOperatingZone="";
	String specialEconomicZoneValue="";
	String ownerShip="";
	String applicantPreviously="";
	String existingBuilding="";
	  String applicationStatus="";
      String controlNumberWFH="";
      String typeOfTransactionWFH="";
      SezStatusWorkFromHome workFormHomeData=null;
      List<SezStatusWFMLocationAdd> wfhLocationAddData=null;
      int sizeOfSezStatusWFMLocationAdd=0;
	HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
	if (Validator.isNotNull(httpServletRequest.getParameter("sezStatusApplicationId"))) {
		sezStatusApplicationId = Long.valueOf(httpServletRequest.getParameter("sezStatusApplicationId"));
	}
	if (Validator.isNotNull(httpServletRequest.getParameter("_renew"))) {
		renew = String.valueOf(httpServletRequest.getParameter("_renew"));
	}
	if(sezStatusApplicationId>0)
	{
		SezDevGeneralBusinessIfo sezDevGeneralBusinessInfo = null;
		try {
			sezDevGeneralBusinessInfo = SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
			if(Validator.isNotNull(sezDevGeneralBusinessInfo.getJoinVenture())){
				jointVenture=sezDevGeneralBusinessInfo.getJoinVenture();
			}if(Validator.isNotNull(sezDevGeneralBusinessInfo.getExistingJamicanCom())){
				existingJamaicanCompanies=sezDevGeneralBusinessInfo.getExistingJamicanCom();
			}if(Validator.isNotNull(sezDevGeneralBusinessInfo.getArticleOfIncorporation())){
				articleOfIncorporation=sezDevGeneralBusinessInfo.getArticleOfIncorporation();
			}
		}catch (Exception e) {}
		SezDevShareholdingInfo devShareholdingInfo = null;
		try {
			devShareholdingInfo = SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
			directorBankRuptcy=devShareholdingInfo.getDirectorBankrupts();
		} catch (Exception e) {
		}
		SezDevProposedProject devProposedProject = null;
		try {
			devProposedProject = SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);	
			previouslyFreeZone=devProposedProject.getPreviouslyFreeZone();
			currentlyOperatingZone=devProposedProject.getCurentlyOperatingZone();
			specialEconomicZoneValue=devProposedProject.getSpecialEconomicZone();
			ownerShip=devProposedProject.getOwnerShip();
			applicantPreviously=devProposedProject.getApplicantPreviously();
		} catch (Exception e) {
		}
		SezDevPropDevelopmentPlan proposedDevelopmentPlan=null;
		try {
			proposedDevelopmentPlan=SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
			existingBuilding=proposedDevelopmentPlan.getExistingBuilding();
		} catch (Exception e) {
		}
		try {
			supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "SEZ Status Supported Documents");
			supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentFolder.getFolderId(), String.valueOf(sezStatusApplicationId));

		} catch (Exception e) {
		}
		//fee recipet
				try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingSubDocumentFolder.getFolderId(), "Fee Reciept");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {
				}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						feeRecipet=attachDocFE.getFileName();
						feeRecipetUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
								attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}
				} 
		//Attach doc
		        try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingSubDocumentFolder.getFolderId(), "Zone Letter of Approval");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {
				}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						approveLetter=attachDocFE.getFileName();
						approveLetterUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
								attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}
				} 
		        try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingSubDocumentFolder.getFolderId(), "Zone Agreement");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {
				}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						zoneAgree=attachDocFE.getFileName();
						zoneAgreeUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
								attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}
				} 
				
		        try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingSubDocumentFolder.getFolderId(), "Occupant Letter of Approval");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {
				}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						occApproveLetter=attachDocFE.getFileName();
						occApproveLetterUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
								attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}
				} 
		        try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingSubDocumentFolder.getFolderId(), "Occupant Agreement");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {
				}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						occAgree=attachDocFE.getFileName();
						occAgreeUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
								attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}
				} 	
		try{
		applicationData=SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
	}catch(Exception e){}
	if(Validator.isNotNull(applicationData)){
		if(Validator.isNotNull(applicationData.getSezStatus())){
			sezStatus=applicationData.getSezStatus();//zone /occupant/devloper	
		}
		if(Validator.isNotNull(applicationData.getTypeOfTransaction())){
			typeOfTransaction=applicationData.getTypeOfTransaction();//	
		}
		if(Validator.isNotNull(applicationData.getZoningClassification())){
			zoneClassification=applicationData.getZoningClassification();	
		}
		if(Validator.isNotNull(applicationData.getParish())){
			parish=applicationData.getParish();	
		}
		if(Validator.isNotNull(applicationData.getSpecialEconomicZone())){
			specialEconomicZone=applicationData.getSpecialEconomicZone();	
		}
		if(Validator.isNotNull(applicationData.getIndustries())){
			industries=applicationData.getIndustries();	
		}
		if(Validator.isNotNull(applicationData.getDoYouWantTo())){
			doYouWant=applicationData.getDoYouWantTo();	
		}
		if(Validator.isNotNull(applicationData.getApplicantStatusWFH())){
            applicationStatus=applicationData.getApplicantStatusWFH();
    }
    if(Validator.isNotNull(applicationData.getControlNumberWFH())){
            controlNumberWFH=applicationData.getControlNumberWFH();
    }
    if(Validator.isNotNull(applicationData.getTypeOfTransactionWFH())){
            typeOfTransactionWFH=applicationData.getTypeOfTransactionWFH();
    }
	}
	try {
		applicationCurrentStage = SezStatusApplicationCurrentStageLocalServiceUtil
				.getSEZ_Stage_SAI(sezStatusApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(applicationCurrentStage)
			&& Validator.isNotNull(applicationCurrentStage.getCurrentStage())) {
		currentStage = applicationCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(applicationCurrentStage)
			&& Validator.isNotNull(applicationCurrentStage.getLastFormStep())) {
		lastFormStep = applicationCurrentStage.getLastFormStep();
	}
	try{
		applicationPayment=SezStatusAppPaymentLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
	}catch(Exception e){
	}
	if(Validator.isNotNull(applicationPayment)){
		if(Validator.isNotNull(applicationPayment.getPaymentMethod())){
			clickPaymentOption=applicationPayment.getPaymentMethod();
		}
		if(Validator.isNotNull(applicationPayment.getAmountPaid())){
			amount=applicationPayment.getAmountPaid();
		}
		if(Validator.isNotNull(applicationPayment.getAmountCurrency())){
			currency=applicationPayment.getAmountCurrency();
		}
		
	}
	try{
		bussinessInfo=SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId); 
		occExistingOther=bussinessInfo.getOccFormArticle();
		}catch(Exception e){}
	if(Validator.isNotNull(bussinessInfo)){
		if(Validator.isNotNull(bussinessInfo.getOccExistingCom())){
			existingJamaicanCom=bussinessInfo.getOccExistingCom();
		}
		if(Validator.isNotNull(bussinessInfo.getOccFormArticle())){
			occExistingOther=bussinessInfo.getOccFormArticle();
		}
		if(Validator.isNotNull(bussinessInfo.getOccFormArticle())){
			occExistingOther=bussinessInfo.getOccFormArticle();
		}
	}
	try {
		 briefInfo=SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId); 
	}catch (Exception e) {
	}
	if(Validator.isNotNull(briefInfo)){
		if(Validator.isNotNull(briefInfo.getOccDeniedFreeZoneAppr())){
			 occFreeZone=briefInfo.getOccDeniedFreeZoneAppr();	
		}
		if(Validator.isNotNull(briefInfo.getOccFreeZoneLocation())){
			occFreeZoneLocation=briefInfo.getOccFreeZoneLocation();	
		}
		if(Validator.isNotNull(briefInfo.getOccOwnership())){
			occOwnerShip=briefInfo.getOccOwnership();	
		}
	}
	try {
		areaDevelopmentPlanInfo=SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		
	}catch (Exception e) {
	}
	if(Validator.isNotNull(areaDevelopmentPlanInfo)){
		if(Validator.isNotNull(areaDevelopmentPlanInfo.getOtherBuildUpRequirement())){
			infastructureOther=areaDevelopmentPlanInfo.getOtherBuildUpRequirement();
		}
	}
	try{
 		sezDeveloperDetails=SezDeveloperDetailsLocalServiceUtil.getDeveloperDetailsBy_Id(sezStatusApplicationId);
	}catch(Exception e){}
	try{
		sezZoneGeneralBusinessInfo = SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	}catch(Exception e){}
	if(Validator.isNotNull(sezZoneGeneralBusinessInfo)){
		if(Validator.isNotNull(sezZoneGeneralBusinessInfo.getExistingCompany())){
			zoneExistingCompany=sezZoneGeneralBusinessInfo.getExistingCompany();
		}
		if(Validator.isNotNull(sezZoneGeneralBusinessInfo.getArticleForm())){
			zoneExistingCompanyOther=sezZoneGeneralBusinessInfo.getArticleForm();
		}
	}
	try{
		sezZoneProposedProjectInfo = SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
	}catch(Exception e){}
		if(Validator.isNotNull(sezZoneProposedProjectInfo)){
			if(Validator.isNotNull(sezZoneProposedProjectInfo.getEntityDeniedApproval())){
				zoneDeniedApproval=sezZoneProposedProjectInfo.getEntityDeniedApproval();
			}
			if(Validator.isNotNull(sezZoneProposedProjectInfo.getFreeZoneLocation())){
				zoneFreeZoneLocation=sezZoneProposedProjectInfo.getFreeZoneLocation();
			}
		}
		try{
			sezZoneFinancialInfo = SezZoneFinancialInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch(Exception e){}
		if(Validator.isNotNull(sezZoneFinancialInfo)){
			if(Validator.isNotNull(sezZoneFinancialInfo.getFinanceSource())){
			zoneSourceOfFinance=sezZoneFinancialInfo.getFinanceSource();
			}
		}
		try {
			sezDirectorOccSponsor=SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			occDirectorSponsorSize=sezDirectorOccSponsor.size();
		}catch (Exception e) {
		}
		if(sezDirectorOccSponsor!=null){
			for(SezOccupantDirectorPartnerSponsorInfo sezDireSponsor:sezDirectorOccSponsor){
				occDirectorSponsorCounter=sezDireSponsor.getCounter();
			}
		}
		try {
			sezOccupantShareHoldingInfos=SezOccupantPrincipleDirectorLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			sizeOfOccupantShareHoldingInfo=sezOccupantShareHoldingInfos.size();
		}catch (Exception e) {
		}
		try {
			sezOccupantPrincipleOfficer=SezOccupantPrincipleOfficerLocalServiceUtil.getPrincipleOfficerById(sezStatusApplicationId);
			sizeOfOccupantPrincipleOfficer=sezOccupantPrincipleOfficer.size();
		}catch (Exception e) {
		}
		try {
			sezOccupantLocationAddBox=SezOccupantLocationAddBoxLocalServiceUtil.getSezLocationBy_Id(sezStatusApplicationId);
			sizeOfLocationAddBox=sezOccupantLocationAddBox.size();
		}catch (Exception e) {
		}
		try {
		 sezOccupantEmploymentInfos=SezOccupantEmploymentInfoLocalServiceUtil.getSezStatusBy_ID(sezStatusApplicationId); 
		 sizeOfProjectLabour=sezOccupantEmploymentInfos.size(); 
		}catch (Exception e) {}
		
		try {
			sezOccupantLocationAdd=SezOccLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId); 
		 sizeOfOccupantLocationAdd=sezOccupantLocationAdd.size(); 
		}catch (Exception e) {}
		
		try {
			zoneLocationAdd = SezZoneLocationAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeZoneLocationAdd=zoneLocationAdd.size();
		}catch (Exception e) {
		}
		try {
			sezZoneEmpInfo = SezZoneEmployInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeZoneEmpInfo=sezZoneEmpInfo.size();
			}catch (Exception e) {}
		try {
			sharePrincipalAdd = SezDevSharePrincipalAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharePrinciple=sharePrincipalAdd.size();
		} catch (Exception e) {
		}
		try {
			shareDirectorAdd = SezDevShareDirectorAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevShareDirectorAdd=shareDirectorAdd.size();
		} catch (Exception e) {}
		try {
			directorShip = SezDevShareComDirectorShipAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevShareComDirectorShipAdd=directorShip.size();
		} catch (Exception e) {
		}
		try {
			corporationBus = SezDevShareCorporationBusAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharCorporationBusAdd=corporationBus.size();
		} catch (Exception e) {}
		try {
			sharePleaseState = SezDevSharePleaseStateAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharPleaseStateAdd=sharePleaseState.size();
		} catch (Exception e) {
		}
		try {
			employeeSafety = SezDevEmployeeSafetyInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharSafetyInfoAdd=employeeSafety.size();
		} catch (Exception e) {}
		try {
			employeeDefineOcuu = SezDevEmployeeDefineOccuAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharDefineOccuAdd=employeeDefineOcuu.size();
		} catch (Exception e) {}
		try {
			disManagementAdd = SezDevDisasterManagementAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharDisasterManagementAdd=disManagementAdd.size();
		} catch (Exception e) {}
		try {
			devProposedProjectAdd = SezDevProposedProjectAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevSharProjectAdd=devProposedProjectAdd.size();
		} catch (Exception e) {}
		try {
			genBusinessAdd = SezDevGenBusinessInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
			sizeOfDevGenBussinessAdd=genBusinessAdd.size();
		} catch (Exception e) {
		}
		  try{
              workFormHomeData=SezStatusWorkFromHomeLocalServiceUtil.getSezById(sezStatusApplicationId);
      }catch(Exception e){}
      try {
              wfhLocationAddData = SezStatusWFMLocationAddLocalServiceUtil.getSezStatusWFMLocationAddListById(sezStatusApplicationId);
              sizeOfSezStatusWFMLocationAdd=wfhLocationAddData.size();
      } catch (Exception e) {}
	}
	
%>
<script>
function uploadDocuments(fileID,folderName,url){
	debugger;
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	var fileID = fileID;
	 var fileInput = $("#" + fileID)[0]; // File input element
   var fileLength = fileInput.files.length; // Count of selected files
  var saveAndConCheck = $("#saveAndConCheck").val();
	
   var fileData = fileLength > 0 ? fileID : "0";

   $("#SezStatusPreviewFieldset .custom_loader").removeClass("hide");
   $(".preview-section").addClass("hide");
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${signatureUploadInSEZFormUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			            "<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		           },
		           	async: false,
			        success: function (data, status) {
			        	debugger;
			        	$(".additionalDocPreviewOne, #additionalDocPreview").html("");
		                
						  try{
		    	                var parsedData = typeof data === "string" ? JSON.parse(data) : data;
		        	            var jsonArrayLength=parsedData.JSON_LENGTH;
		        	            var uniqueArray = parsedData.fileData;
		        	           var responseData = uniqueArray.filter((value, index, self) =>
		        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
		        	        );

		        	            }catch(error){}
		                if (jsonArrayLength > 0) {
	                	var counter = 1;
						$.each(responseData,function(key,entry){ 
							console.log("File name is - "+entry.fileName);
							console.log("File URL is - "+entry.downloadFileUrl);
							
								var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
			                    
			                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
			                    
			                    $('#additionalDocPreview').append(documentContainerPreview);		
			                    counter++; 
			                    $(".noAdditionalSupportingDoc").addClass("hide");
						});}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
						}
						$("#SezStatusPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			        },
			        error: function (data, status, e) {
			        }
			    });
		}
</script>