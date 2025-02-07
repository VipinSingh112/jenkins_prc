<%@page import="com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningAppPayment"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningProspectingLicenseAddLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningRenewalLicenceLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningRenewalLicence"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningFormFiveDelineationLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningProspectingLicense"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningProspectingRights"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningAppCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningAppCurrentStage"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningLeaseApplication"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:resourceURL var="miningSubmitApplicationUrl" id="/submit/mining/application"></portlet:resourceURL>
<portlet:resourceURL var="uploadMultipleDocumentsUrl" id="/upload/multiple/documents"></portlet:resourceURL>

<portlet:resourceURL var="addDirectorDetailInfoUrl" id="/director/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addMiningDirectorDetailInfoUrl" id="/mining/director/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addTransferDirectorDetailInfoUrl" id="/transfer/director/detail/info"></portlet:resourceURL>

<portlet:resourceURL var="licDirectorDetailAddForm" id="/licence/director/detail/edit"></portlet:resourceURL>
<portlet:resourceURL var="leaseDirectorDetailAddForm" id="/lease/director/detail/edit"></portlet:resourceURL>
<portlet:resourceURL var="transferDirectorDetailAddForm" id="/transfer/director/detail/edit"></portlet:resourceURL>

<portlet:resourceURL var="deleteDirectorDetailAddForm" id="/delete/director/detail/editForm"></portlet:resourceURL>
<portlet:resourceURL var="deleteLeaseDirectorDetailAddForm" id="/delete/lease/director/detail/editForm"></portlet:resourceURL>
<portlet:resourceURL var="deleteTransferDirectorDetailAddForm" id="/delete/transfer/director/detail/editForm"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="/mining/document/delete"></portlet:resourceURL>

<%
FileEntry fileEntrySingle = null;
FileEntry mlTransferDoc1EntrySingle = null;
FileEntry mlTransferDoc2EntrySingle = null;
FileEntry mlTransferDoc3EntrySingle = null;
FileEntry mlSurrenderDoc1EntrySingle = null;
FileEntry mlSurrenderDoc2EntrySingle = null;
String signUrl = "";
String signLeaseUrl = "";
String signHolderUrl = "";
String signMinisterUrl = "";
String signTransferUrl = "";
String signMiniTransferUrl = "";
String signPersonUrl = "";
String signMiniUrl = "";
String signMiniLeaseUrl = "";
String mlTransferDoc1Url = "";
String mlTransferDoc2Url = "";
String mlSurrenderDoc1Url = "";
String mlSurrenderDoc2Url = "";
String mlTransferDoc3Url = "";
String signLicUrl = "";
String signRenUrl = "";
String paymentMethod = "";
MiningLeaseApplication applicationData=null;
MiningAppCurrentStage miningCurrentStage=null;
String currentStage = "";
String lastFormStep = "";
String copyOfArticles ="";
String typeOfApplicant = null;
String typeOfTransaction = null;
String prospectingRightsTransactionType = null;
String prospectingLicenceTransactionType = null;
String miningLicenceTransactionType = null;
String areaDelination = null;
String areaDelinationTotalApprox = null;
String licenceExclusiveSpecial = null;
String miningMineralsTypeVal = null;
String otherMineral = null;
String renewNum = null;
MiningProspectingRights prospectingRights=null;
MiningProspectingLicense prospectLicence=null;
MiningFormFiveDelineation delineationArea=null;
MiningProspectingLicense surrenderLicence=null;
MiningProspectingLicense transferLicence=null;
MiningRenewalLicence renewLicence= null;
MiningAppPayment miningPayment=null;
List<MiningProspectingLicenseAdd> diretorDetailAdd=null;
int sizeOfLicDiretorDetailAdd=0;
DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
DLFolder rightSignOfApplicant = null;
DLFolder leaseSignOfApplicant = null;
DLFolder surrenderSignOfHolder = null;
DLFolder surrenderSignOfMinister = null;
DLFolder transferSignOfApplicant = null;
DLFolder transferMinSignOfApplicant = null;
DLFolder transferSignOfPerson = null;
DLFolder transferSignOfMiniter = null;
DLFolder leaseSignOfApp = null;
DLFolder mlSurrenderDoc1 = null;
DLFolder mlSurrenderDoc2 = null;
DLFolder mlTransferDoc1 = null;
DLFolder mlTransferDoc2 = null;
DLFolder mlTransferDoc3 = null;
DLFolder licSignOfApp = null;
DLFolder renewSignOfApp = null;
DLFolder supportingDocGeneric = null;
List<DLFileEntry> genericFileEntry = null;
List<DLFileEntry> signFileEntry = null;
List<DLFileEntry> signLeaseFileEntry = null;
List<DLFileEntry> mlTransferDoc1FileEntry = null;
List<DLFileEntry> mlTransferDoc2FileEntry = null;
List<DLFileEntry> mlSurrenderDoc1FileEntry = null;
List<DLFileEntry> mlSurrenderDoc2FileEntry = null;
List<DLFileEntry> mlTransferDoc3FileEntry = null;
List<DLFileEntry> signHolderFileEntry = null;
List<DLFileEntry> signMinisterFileEntry = null;
List<DLFileEntry> signTranFileEntry = null;
List<DLFileEntry> signTranMinFileEntry = null;
List<DLFileEntry> signPersonFileEntry = null;
List<DLFileEntry> signTranMiniFileEntry = null;
List<DLFileEntry> signAppLeaseFileEntry = null;
List<DLFileEntry> signLicFileEntry = null;
List<DLFileEntry> signRenFileEntry = null;
String delinationOfArea="";
String delinationOfAreaTotalApprox="";
String prospectingRightNumber="";
String prospectingLicenceNumber="";
int sizeOfdDetailsAdd=0;
/* FORM DOCS */
DLFolder docPosBank = null;
List<DLFileEntry> bankruptyFileEntry = null;
FileEntry bankruptcyDocFE=null;
String formRightDoc="";

DLFolder docLicPosBank = null;
List<DLFileEntry> licPosFileEntry = null;
FileEntry licPosDocFE=null;
String formLicPosDoc="";

DLFolder docLicRegBank = null;
List<DLFileEntry> licRegFileEntry = null;
FileEntry licRegDocFE=null;
String formLicRegulationDoc="";
DLFolder mlTRDoc = null;
List<DLFileEntry> mlTRDocFileEntry = null;
FileEntry mlTRDocFE=null;
String mlTRDocDoc="";
DLFolder mlTRDoc2 = null;
List<DLFileEntry> mlTRDocFileEntry2 = null;
FileEntry mlTRDocFE2=null;
String mlTRDocDoc2="";

DLFolder docLicCopyBank = null;
List<DLFileEntry> licCopyFileEntry = null;
FileEntry licCopyDocFE=null;
String formLicCopyDoc="";

DLFolder docRenewAreaBank = null;
List<DLFileEntry> renewAreaFileEntry = null;
FileEntry renewAreaDocFE=null;
String formRenewAreaDoc="";

DLFolder docRenewMLSK = null;
List<DLFileEntry> docRenewMLSKFileEntry = null;
FileEntry docRenewMLSKDocFE=null;
String docRenewMLSKDoc="";

DLFolder docTransPos = null;
List<DLFileEntry> transferPosFileEntry = null;
FileEntry transferPosDocFE=null;
String formTransPosDoc="";

DLFolder statentPos = null;
List<DLFileEntry> statPosFileEntry = null;
FileEntry statPosDocFE=null;
String statPosDocName="";

DLFolder leaseSketchPlan = null;
List<DLFileEntry> leaseSketchPlanFileEntry = null;
FileEntry lsDocFE=null;
String lsDocName="";

DLFolder copyOfMamoLease = null;
List<DLFileEntry> copyOfMamoFileEntry = null;
FileEntry copyOfMamoFE=null;
String copyOfMamoDocName="";

DLFolder docTransAssosciation = null;
List<DLFileEntry> transAssosFileEntry = null;
FileEntry transferAssosDocFE=null;
String formTransAssosDoc="";

DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String feeRecipet="";
String feeRecipetUrl="";

DLFolder docLeaseRenewArea = null;
List<DLFileEntry> leaseRenewFileEntry = null;
FileEntry LeaseRenewAreaDocFE=null;
String formLeaseRenewAreaDoc="";
int counterOfDocuments=1;
String applicationRequestType = "";
long originalApplicationId = 0;
long miningApplicationId = 0;
MiningLeaseApplication dataOfMiningAppli=null;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if (Validator.isNotNull(ParamUtil.getLong(request, "miningLeaseApplicationId"))) {
	miningApplicationId = ParamUtil.getLong(request, "miningLeaseApplicationId");
} else if (Validator.isNotNull(httpServletRequest.getParameter("miningLeaseApplicationId"))) {
	miningApplicationId = Long.valueOf(httpServletRequest.getParameter("miningLeaseApplicationId"));
}
if (Validator.isNotNull(httpServletRequest.getParameter(
		"com_nbp_mining_lease_application_form_web_MiningLeaseApplicationFormPortlet_originalApplicationId"))) {
	originalApplicationId = Long.valueOf(httpServletRequest.getParameter(
			"com_nbp_mining_lease_application_form_web_MiningLeaseApplicationFormPortlet_originalApplicationId"));
}
if (Validator.isNotNull(httpServletRequest.getParameter(
		"com_nbp_mining_lease_application_form_web_MiningLeaseApplicationFormPortlet_requestType"))) {
	applicationRequestType = String.valueOf(httpServletRequest.getParameter(
		"com_nbp_mining_lease_application_form_web_MiningLeaseApplicationFormPortlet_requestType"));
}
if(miningApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Mining Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(miningApplicationId));

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
	/* Signature */
	try {
		rightSignOfApplicant = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Rights Signature of Applicant");
		signFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),rightSignOfApplicant.getFolderId());
	} catch (Exception e) {
	}
	if (signFileEntry != null) {
		for (DLFileEntry uploadedFile : signFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	/* Lease Signature of Applicant */
	try {
		leaseSignOfApplicant = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Lease Signature of Applicant");
		signLeaseFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),leaseSignOfApplicant.getFolderId());
	} catch (Exception e) {
	}
	if (signLeaseFileEntry != null) {
		for (DLFileEntry uploadedFile : signLeaseFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signLeaseUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	/* Surrender Signature of Holder */
	try {
		surrenderSignOfHolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Surrender Signature of Holder");
		signHolderFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),surrenderSignOfHolder.getFolderId());
	} catch (Exception e) {
	}
	if (signHolderFileEntry != null) {
		for (DLFileEntry uploadedFile : signHolderFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signHolderUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	/* Surrender Signature of Minister */
	try {
		surrenderSignOfMinister = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Surrender Signature of Minister");
		signMinisterFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),surrenderSignOfMinister.getFolderId());
	} catch (Exception e) {
	}
	if (signMinisterFileEntry != null) {
		for (DLFileEntry uploadedFile : signMinisterFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signMinisterUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	/* Transfer Signature of Applicant */
	try {
		transferSignOfApplicant = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of Applicant");
		signTranFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),transferSignOfApplicant.getFolderId());
	} catch (Exception e) {
	}
	if (signTranFileEntry != null) {
		for (DLFileEntry uploadedFile : signTranFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signTransferUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try {
		transferMinSignOfApplicant = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of Minister");
		signTranFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),transferMinSignOfApplicant.getFolderId());
	} catch (Exception e) {
	}
	if (signTranFileEntry != null) {
		for (DLFileEntry uploadedFile : signTranFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signMiniTransferUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	/* Transfer Signature of the person application*/
	try {
		transferSignOfPerson = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of the person application");
		signPersonFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),transferSignOfPerson.getFolderId());
	} catch (Exception e) {
	}
	if (signPersonFileEntry != null) {
		for (DLFileEntry uploadedFile : signPersonFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signPersonUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	/* Transfer Signature of the Minister*/
	try {
		transferSignOfMiniter = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of the Minister");
		signTranMiniFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),transferSignOfMiniter.getFolderId());
	} catch (Exception e) {
	}
	if (signTranMiniFileEntry != null) {
		for (DLFileEntry uploadedFile : signTranMiniFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signMiniUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	
	/* LEASE Signature of Applicant*/
	try {
		leaseSignOfApp = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE Signature of Applicant");
		signAppLeaseFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),leaseSignOfApp.getFolderId());
	} catch (Exception e) {
	}
	if (signAppLeaseFileEntry != null) {
		for (DLFileEntry uploadedFile : signAppLeaseFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signMiniLeaseUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		mlTransferDoc1 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of Applicant");
		mlTransferDoc1FileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlTransferDoc1.getFolderId());
	} catch (Exception e) {
	}
	if (mlTransferDoc1FileEntry != null) {
		for (DLFileEntry uploadedFile : mlTransferDoc1FileEntry) {
			mlTransferDoc1EntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlTransferDoc1Url = DLURLHelperUtil.getDownloadURL(mlTransferDoc1EntrySingle, mlTransferDoc1EntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		mlTransferDoc2 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of Minister");
		mlTransferDoc2FileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlTransferDoc2.getFolderId());
	} catch (Exception e) {
	}
	if (mlTransferDoc2FileEntry != null) {
		for (DLFileEntry uploadedFile : mlTransferDoc2FileEntry) {
			mlTransferDoc2EntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlTransferDoc2Url = DLURLHelperUtil.getDownloadURL(mlTransferDoc2EntrySingle, mlTransferDoc2EntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		mlSurrenderDoc1 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Surrender Signature of Minister");
		mlSurrenderDoc1FileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlSurrenderDoc1.getFolderId());
	} catch (Exception e) {
	}
	if (mlSurrenderDoc1FileEntry != null) {
		for (DLFileEntry uploadedFile : mlSurrenderDoc1FileEntry) {
			mlSurrenderDoc1EntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlSurrenderDoc1Url = DLURLHelperUtil.getDownloadURL(mlSurrenderDoc1EntrySingle, mlSurrenderDoc1EntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		mlSurrenderDoc2 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Surrender Signature of Holder");
		mlSurrenderDoc2FileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlSurrenderDoc2.getFolderId());
	} catch (Exception e) {
	}
	if (mlSurrenderDoc2FileEntry != null) {
		for (DLFileEntry uploadedFile : mlSurrenderDoc2FileEntry) {
			mlSurrenderDoc2EntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlSurrenderDoc2Url = DLURLHelperUtil.getDownloadURL(mlSurrenderDoc1EntrySingle, mlSurrenderDoc1EntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		mlTransferDoc3 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Transfer Signature of the person application");
		mlTransferDoc3FileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlTransferDoc3.getFolderId());
	} catch (Exception e) {
	}
	if (mlTransferDoc3FileEntry != null) {
		for (DLFileEntry uploadedFile : mlTransferDoc3FileEntry) {
			mlTransferDoc3EntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlTransferDoc3Url = DLURLHelperUtil.getDownloadURL(mlTransferDoc3EntrySingle, mlTransferDoc3EntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	/* Licence Signature of Applicant*/
	try {
		licSignOfApp = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Licence Signature of Applicant");
		signLicFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),licSignOfApp.getFolderId());
	} catch (Exception e) {
	}
	if (signLicFileEntry != null) {
		for (DLFileEntry uploadedFile : signLicFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signLicUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	/* Renew Signature of Applicant*/
	try {
		renewSignOfApp = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Renew Signature of Applicant");
		signRenFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),renewSignOfApp.getFolderId());
	} catch (Exception e) {
	}
	if (signRenFileEntry != null) {
		for (DLFileEntry uploadedFile : signRenFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			signRenUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}

	/*FORM DOC */
	try{
		docPosBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "RIGHTS PRINCIPAL UNDERTAKING");
		bankruptyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docPosBank.getFolderId());
	} catch (Exception e) {
	}
	if (bankruptyFileEntry != null) {
		for (DLFileEntry uploadedFile : bankruptyFileEntry) {
			bankruptcyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formRightDoc=bankruptcyDocFE.getFileName();
		}
	}
	
	try{
		docLicPosBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LICENCE POSITION OF APPLICANT");
		licPosFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docLicPosBank.getFolderId());
	} catch (Exception e) {
	}
	if (licPosFileEntry != null) {
		for (DLFileEntry uploadedFile : licPosFileEntry) {
			licPosDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formLicPosDoc=licPosDocFE.getFileName();
		}
	}
	
	try{
		docLicRegBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LICENCE REGULATION PLAN");
		licRegFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docLicRegBank.getFolderId());
	} catch (Exception e) {
	}
	if (licPosFileEntry != null) {
		for (DLFileEntry uploadedFile : licRegFileEntry) {
			licRegDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formLicRegulationDoc=licRegDocFE.getFileName();
		}
	}
	
	try{
		mlTRDoc = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "TRANSFER STATEMENT OF POSITION");
		mlTRDocFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlTRDoc.getFolderId());
	} catch (Exception e) {
	}
	if (mlTRDocFileEntry != null) {
		for (DLFileEntry uploadedFile : mlTRDocFileEntry) {
			mlTRDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlTRDocDoc=mlTRDocFE.getFileName();
		}
	}
	try{
		mlTRDoc2 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "TRANSFER STATEMENT OF ASSOCIATION");
		mlTRDocFileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),mlTRDoc.getFolderId());
	} catch (Exception e) {
	}
	if (mlTRDocFileEntry2 != null) {
		for (DLFileEntry uploadedFile : mlTRDocFileEntry2) {
			mlTRDocFE2 = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			mlTRDocDoc2=mlTRDocFE2.getFileName();
		}
	}
	
	try{
		docLicCopyBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LICENCE COPYENCLOSED HEREWITH");
		licCopyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docLicCopyBank.getFolderId());
	} catch (Exception e) {
	}
	if (licCopyFileEntry != null) {
		for (DLFileEntry uploadedFile : licCopyFileEntry) {
			licCopyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formLicCopyDoc=licCopyDocFE.getFileName();
		}
	}
	
	try{
		docRenewAreaBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "RENEWAL DELINEATION AREA");
		renewAreaFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docRenewAreaBank.getFolderId());
	} catch (Exception e) {
	}
	if (renewAreaFileEntry != null) {
		for (DLFileEntry uploadedFile : renewAreaFileEntry) {
			renewAreaDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formRenewAreaDoc=renewAreaDocFE.getFileName();
		}
	}
	
	try{
		docRenewMLSK = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE RENEWAL AREA OF DELINEATION");
		docRenewMLSKFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docRenewMLSK.getFolderId());
	} catch (Exception e) {
	}
	if (docRenewMLSKFileEntry != null) {
		for (DLFileEntry uploadedFile : docRenewMLSKFileEntry) {
			docRenewMLSKDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			docRenewMLSKDoc=docRenewMLSKDocFE.getFileName();
		}
	}
	
	try{
		docTransPos = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "TRANSFER STATEMENT OF POSITION");
		transferPosFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docTransPos.getFolderId());
	} catch (Exception e) {
	}
	if (transferPosFileEntry != null) {
		for (DLFileEntry uploadedFile : transferPosFileEntry) {
			transferPosDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formTransPosDoc=transferPosDocFE.getFileName();
		}
	}
	
	try{
		docTransAssosciation = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "TRANSFER STATEMENT OF ASSOCIATION");
		transAssosFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docTransAssosciation.getFolderId());
	} catch (Exception e) {
	}
	if (transAssosFileEntry != null) {
		for (DLFileEntry uploadedFile : transAssosFileEntry) {
			transferAssosDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formTransAssosDoc=transferAssosDocFE.getFileName();
		}
	}
	
	try{
		docLeaseRenewArea = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE RENEWAL AREA OF DELINEATION");
		leaseRenewFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docLeaseRenewArea.getFolderId());
	} catch (Exception e) {
	}
	if (leaseRenewFileEntry != null) {
		for (DLFileEntry uploadedFile : leaseRenewFileEntry) {
			LeaseRenewAreaDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formLeaseRenewAreaDoc=LeaseRenewAreaDocFE.getFileName();
		}
	}
	try{
		statentPos = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE STATEMENT OF POSITION");
		statPosFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),statentPos.getFolderId());
	} catch (Exception e) {
	}
	if (statPosFileEntry != null) {
		for (DLFileEntry uploadedFile : statPosFileEntry) {
			statPosDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			statPosDocName=statPosDocFE.getFileName();
		}
	}
	try{
		leaseSketchPlan = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE SKETCH PLAN");
		leaseSketchPlanFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),leaseSketchPlan.getFolderId());
	} catch (Exception e) {
	}
	if (leaseSketchPlanFileEntry != null) {
		for (DLFileEntry uploadedFile : leaseSketchPlanFileEntry) {
			lsDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			lsDocName=lsDocFE.getFileName();
		}
	}
	try{
		copyOfMamoLease = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "LEASE COPY OF MEMORANDUM");
		copyOfMamoFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),copyOfMamoLease.getFolderId());
	} catch (Exception e) {
	}
	if (copyOfMamoFileEntry != null) {
		for (DLFileEntry uploadedFile : copyOfMamoFileEntry) {
			copyOfMamoFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			copyOfMamoDocName=copyOfMamoFE.getFileName();
		}
	}
	
	try {
		applicationData = MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
	} catch (Exception e) {}
	if(Validator.isNotNull(applicationData)&&Validator.isNotNull(applicationData.getAreaDelination())){
		delinationOfArea=applicationData.getAreaDelination();
	}
	if(Validator.isNotNull(applicationData)&&Validator.isNotNull(applicationData.getProspRightsNum())){
		prospectingRightNumber=applicationData.getProspRightsNum();
	}
	if(Validator.isNotNull(applicationData)&&Validator.isNotNull(applicationData.getProspLicenseNum())){
		prospectingLicenceNumber=applicationData.getProspLicenseNum();
	}
	if(Validator.isNotNull(applicationData)&&Validator.isNotNull(applicationData.getAreaDelinationTotalApprox())){
		System.out.println("----inside----"+applicationData.getAreaDelinationTotalApprox());
		delinationOfAreaTotalApprox=applicationData.getAreaDelinationTotalApprox();
	}
	if(Validator.isNotNull(applicationData)&&Validator.isNotNull(applicationData.getExpiredLicenseAppNumber())){
		renewNum=applicationData.getExpiredLicenseAppNumber();
	}
	try {
		prospectingRights = MiningProspectingRightsLocalServiceUtil.getMiningById(miningApplicationId);
	} catch (Exception e) {}
	try {
		prospectLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
	} catch (Exception e) {}
	try {
		delineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningApplicationId);
	} catch (Exception e) {}
	try {
		surrenderLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
	} catch (Exception e) {}
	try {
		transferLicence = MiningProspectingLicenseLocalServiceUtil.getMinningById(miningApplicationId);
	} catch (Exception e) {}
	try {
		renewLicence = MiningRenewalLicenceLocalServiceUtil.getMiningById(miningApplicationId);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	if (Validator.isNotNull(applicationData)) {
		if (Validator.isNotNull(applicationData.getTypeOfApplicant())) {
			typeOfApplicant = applicationData.getTypeOfApplicant();
		}
		if (Validator.isNotNull(applicationData.getProspectingRightNumber())) {
			prospectingRightsTransactionType = applicationData.getProspectingRightNumber();
		}
		if (Validator.isNotNull(applicationData.getTypeOfProspectingLicence())) {
			prospectingLicenceTransactionType = applicationData.getTypeOfProspectingLicence();
		}
		if (Validator.isNotNull(applicationData.getTypeOfTransaction())) {
			miningLicenceTransactionType = applicationData.getTypeOfTransaction();
		}
		if (Validator.isNotNull(applicationData.getAreaDelination())) {
			areaDelination = applicationData.getAreaDelination();
		}
		if (Validator.isNotNull(applicationData.getAreaDelinationTotalApprox())) {
			areaDelinationTotalApprox = applicationData.getAreaDelinationTotalApprox();
		}
		if (Validator.isNotNull(applicationData.getLicenceExclusiveSpecial())) {
			licenceExclusiveSpecial = applicationData.getLicenceExclusiveSpecial();
		}
		if (Validator.isNotNull(applicationData.getMiningMineralsTypeVal()) || Validator.isNotNull(applicationData.getOtherMineralBox())) {
			miningMineralsTypeVal = applicationData.getMiningMineralsTypeVal();
		}
		
	}
	try {
		miningCurrentStage = MiningAppCurrentStageLocalServiceUtil.getByMining_Stage(miningApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(miningCurrentStage)
			&& Validator.isNotNull(miningCurrentStage.getCurrentStage())) {
		currentStage = miningCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(miningCurrentStage)
			&& Validator.isNotNull(miningCurrentStage.getLastFormStep())) {
		lastFormStep = miningCurrentStage.getLastFormStep();
	}
	try {
		diretorDetailAdd = MiningProspectingLicenseAddLocalServiceUtil.getMinningById(miningApplicationId);
		sizeOfLicDiretorDetailAdd=diretorDetailAdd.size();
	} catch (Exception e) {
	}
	try {
		miningPayment = MiningAppPaymentLocalServiceUtil.getMiningById(miningApplicationId);
		paymentMethod=miningPayment.getPaymentMethod();
	} catch (Exception e) {
	}
	try{
		dataOfMiningAppli=MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningApplicationId);
	}catch(Exception e){
		
	}
	
	if (Validator.isNotNull(prospectLicence)) {
		if (Validator.isNotNull(prospectLicence.getCopyOfArticle())) {
			copyOfArticles = prospectLicence.getCopyOfArticle();
		}
	}
	
}

%>
<script>

	function uploadDocuments(fileID, folderName,url,fileTitle){
		debugger;
		miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		var fileID = fileID; 
		var fileInput = $("#" + fileID)[0]; // File input element
 	    var fileLength = fileInput.files.length; // Count of selected files
 	   var saveAndConCheck = $("#saveAndConCheck").val();
	    var fileData = fileLength > 0 ? fileID : "0";
	    $("#miningFormPreviewFieldset .custom_loader").removeClass("hide");
	    $(".preview-section").addClass("hide");
	    if(fileID=="principal-attachment"){
	    	  $(".principal-attachment").html("13.I attach hereto from my principal an undertaking in the prescribed form.");
	    }
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : fileID,
			url : "${uploadMultipleDocumentsUrl}",
			dataType : 'text',
			data : {
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>folderName" : folderName,
				"<portlet:namespace/>miningLeaseApplicationId" : miningLeaseApplicationId,
				"<portlet:namespace/>saveAndConCheck": saveAndConCheck,
			},
			async : false,
			success : function(data, status) {
				debugger;
				  $(".additionalDocPreviewOne, #additionalDocPreview").html("");
				  var parsedData = typeof data === "string" ? JSON.parse(data) : data;
				  if(folderName=="generic Documents"){
				  try{
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
							});}}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
							$.each(parsedData.fileData, function(index, entry) {
				        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
				        	    console.log(entry); // Log each entry in fileData
				        	    console.log(entry.fileName); // This should log "hello.pdf" for the first entry
				        	    $("."+fileID).html(fileTitle); // Set file title
				        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
				        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
				        	});}
						$("#miningFormPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			},
			error : function(data, status, e) {}
		});
		}
function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    miningApplicationId = $("#ogtApplicationId").val();
	saveAndCon='<%=miningApplicationId%>';
	if(saveAndCon>0){
	 	 $.ajax({
		        type: "POST",
		        url: '${delteDocAferSaveconUrl}',
		        data: {
		            "<portlet:namespace/>fileName": fileName,
		            "<portlet:namespace/>miningApplicationId": miningApplicationId,
		        },
		        success: function (data) {
		        },
		        error: function (data) {
		        }
		    });	
		
	}
}
</script>