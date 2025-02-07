<%@page import="com.nbp.ogt.application.form.services.service.OgtSectionBLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtSectionB"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.nbp.ogt.application.form.services.service.OGTAppCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OGTAppCurrentStage"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimToSpouseLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimToPropertyLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtProofOfClaim"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimToSpouse"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimToProperty"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimantDetail"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtApplication"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="ogtDoucumentsUpload" id="/ogt/document/upload"></portlet:resourceURL>
<portlet:resourceURL var="ogtGettingDocumentList" id="/ogt/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="signatureUploadInOGTFormUrl" id="/ogt/signature/upload"></portlet:resourceURL>
<portlet:resourceURL var="ogtDocDeletionUrl" id="/ogt/document/delete"></portlet:resourceURL>
<portlet:resourceURL var="sectionBForm" id="add/section/b/form"></portlet:resourceURL>
<%
OgtApplication ogtApplication=null;
OgtClaimantDetail claimantDetail=null;
OgtInsolventPersonDetail insolventDetail=null;
OgtProofOfClaim creditorClaim=null;
OgtClaimToProperty propertyClaim=null;
OgtClaimToSpouse spouseClaim=null;
OGTAppCurrentStage ogtCurrentStage=null;
String currentStage = "";
String lastFormStep = "";
String doYouWant = null;
String typeOfApplicant = null;
String natureOfApplicant = null;
String typeOfMatter = null;
String typeOfDebt = null;
String debtStatute = null;
String fileUrl="";
int counterOfDocuments=1;
String registeredManufacturer = null;
String licenceNumber = null;
String typeOfBankruptcy = null;
DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";
DLFolder statementOfDoc = null;
List<DLFileEntry> statementOfDocFileEntry = null;
FileEntry statementOfDocFE=null;
String formNameDocTwo="";
DLFolder docSecuredClaim = null;
List<DLFileEntry> securedClaimFileEntry = null;
FileEntry securedDocFE=null;
String formSecuredNameDoc="";
DLFolder docDetPayment = null;
List<DLFileEntry> detailPayFileEntry = null;
FileEntry detailaPayDocFE=null;
String formDetailPayNameDoc="";
DLFolder docPosBank = null;
List<DLFileEntry> bankruptyFileEntry = null;
FileEntry bankruptcyDocFE=null;
String formBankruptcyNameDoc="";
DLFolder docAffidavit = null;
List<DLFileEntry> affidavitFileEntry = null;
FileEntry affidavitDocFE=null;
String formAffidavitNameDoc="";
DLFolder docClaimBySpouse = null;
List<DLFileEntry> claimBySpouseFileEntry = null;
FileEntry claimBySpouseDocFE=null;
String formClaimBySpouseNameDoc="";
DLFolder docSignOfPerson = null;
List<DLFileEntry> signOfPersonFileEntry = null;
FileEntry signOfPersonDocFE=null;
String formSignOfPersonNameDoc="";
DLFolder docSignOfJustice = null;
List<DLFileEntry> signOfJusticeFileEntry = null;
FileEntry signOfJusticeDocFE=null;
String formSignOfJusticeNameDoc="";
OgtSectionB ogtSectionBData=null;
String fileUrlFormDetailNameDoc=null;
String fileUrlStatemnetOfAccount=null;
String fileUrlStatemnetOfAccountTwo=null;
String fileUrlSecureClaim=null;
String fileUrlForProssessionOfBan=null;
String fileUrlForClaimBySpouse=null;
String fileUrlForAffidavitAttached=null;
long ogtApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "ogtApplicationId"))){
	ogtApplicationId =ParamUtil.getLong(request, "ogtApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("ogtApplicationId"))){
	ogtApplicationId = Long.valueOf(httpServletRequest.getParameter("ogtApplicationId"));
}
if(ogtApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "OGT Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(ogtApplicationId));

	} catch (Exception e) {
	}
	/*Form Docs */
	try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Attached Statement of Account");
		attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (attachedFileEntry != null) {
		for (DLFileEntry uploadedFile : attachedFileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formNameDoc=attachDocFE.getFileName();
			fileUrlStatemnetOfAccount=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		statementOfDoc = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Attached Statement of Account two");
		statementOfDocFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),statementOfDoc.getFolderId());
	} catch (Exception e) {
	}
	if (statementOfDocFileEntry != null) {
		for (DLFileEntry uploadedFile : statementOfDocFileEntry) {
			statementOfDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formNameDocTwo=statementOfDocFE.getFileName();
			fileUrlStatemnetOfAccountTwo=DLURLHelperUtil.getDownloadURL(statementOfDocFE,
					statementOfDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try{
		docSecuredClaim = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Secured Claim");
		securedClaimFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docSecuredClaim.getFolderId());
	} catch (Exception e) {
	}
	if (securedClaimFileEntry != null) {
		for (DLFileEntry uploadedFile : securedClaimFileEntry) {
			securedDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formSecuredNameDoc=securedDocFE.getFileName();
			fileUrlSecureClaim=DLURLHelperUtil.getDownloadURL(securedDocFE,
					securedDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docDetPayment = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Details of Payments");
		detailPayFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docDetPayment.getFolderId());
	} catch (Exception e) {
	}
	if (detailPayFileEntry != null) {
		for (DLFileEntry uploadedFile : detailPayFileEntry) {
			detailaPayDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formDetailPayNameDoc=detailaPayDocFE.getFileName();
			fileUrlFormDetailNameDoc=DLURLHelperUtil.getDownloadURL(detailaPayDocFE,
					detailaPayDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docPosBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Possession Of Bankruptcy");
		bankruptyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docPosBank.getFolderId());
	} catch (Exception e) {
	}
	if (bankruptyFileEntry != null) {
		for (DLFileEntry uploadedFile : bankruptyFileEntry) {
			bankruptcyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formBankruptcyNameDoc=bankruptcyDocFE.getFileName();
			fileUrlForProssessionOfBan=DLURLHelperUtil.getDownloadURL(detailaPayDocFE,
					detailaPayDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docAffidavit = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Affidavit Attached");
		affidavitFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAffidavit.getFolderId());
	} catch (Exception e) {
	}
	if (affidavitFileEntry != null) {
		for (DLFileEntry uploadedFile : affidavitFileEntry) {
			affidavitDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formAffidavitNameDoc=affidavitDocFE.getFileName();
			fileUrlForAffidavitAttached=DLURLHelperUtil.getDownloadURL(detailaPayDocFE,
					detailaPayDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docClaimBySpouse = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Claim By Spouse");
		claimBySpouseFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docClaimBySpouse.getFolderId());
	} catch (Exception e) {
	}
	if (claimBySpouseFileEntry != null) {
		for (DLFileEntry uploadedFile : claimBySpouseFileEntry) {
			claimBySpouseDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formClaimBySpouseNameDoc=claimBySpouseDocFE.getFileName();
			fileUrlForClaimBySpouse=DLURLHelperUtil.getDownloadURL(detailaPayDocFE,
					detailaPayDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	/* Signature */
	try{
		docSignOfPerson = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Signature of Person Completing Form");
		signOfPersonFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docSignOfPerson.getFolderId());
	} catch (Exception e) {
	}
	if (signOfPersonFileEntry != null) {
		for (DLFileEntry uploadedFile : signOfPersonFileEntry) {
			signOfPersonDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formSignOfPersonNameDoc=DLURLHelperUtil.getDownloadURL(signOfPersonDocFE, signOfPersonDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try{
		docSignOfJustice = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Signature of Justice Peace");
		signOfJusticeFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docSignOfJustice.getFolderId());
	} catch (Exception e) {
	}
	if (signOfJusticeFileEntry != null) {
		for (DLFileEntry uploadedFile : signOfJusticeFileEntry) {
			signOfJusticeDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formSignOfJusticeNameDoc=DLURLHelperUtil.getDownloadURL(signOfJusticeDocFE, signOfJusticeDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try {
		ogtApplication = OgtApplicationLocalServiceUtil.getOgtApplication(ogtApplicationId);
	} catch (Exception e) {}
	
	try{
		claimantDetail=OgtClaimantDetailLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	try{
		insolventDetail=OgtInsolventPersonDetailLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	try{
		creditorClaim=OgtProofOfClaimLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	try{
		propertyClaim=OgtClaimToPropertyLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	try{
		spouseClaim=OgtClaimToSpouseLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	try{
		ogtSectionBData=OgtSectionBLocalServiceUtil.getOgtById(ogtApplicationId);
	}catch(Exception e){}
	
	if (Validator.isNotNull(ogtApplication)) {
		if (Validator.isNotNull(ogtApplication.getDoYouWant())) {
			doYouWant = ogtApplication.getDoYouWant();
		}
		if (Validator.isNotNull(ogtApplication.getTypeOfApplicant())) {
			typeOfApplicant = ogtApplication.getTypeOfApplicant();
		}
		if (Validator.isNotNull(ogtApplication.getNatureOfApplicant())) {
			natureOfApplicant = ogtApplication.getNatureOfApplicant();
		}
		if (Validator.isNotNull(ogtApplication.getTypeOfMatter())) {
			typeOfMatter = ogtApplication.getTypeOfMatter();
		}
		if (Validator.isNotNull(ogtApplication.getTypeOfDebt())) {
			typeOfDebt = ogtApplication.getTypeOfDebt();
		}
		if (Validator.isNotNull(ogtApplication.getDebtStatute())) {
			debtStatute = ogtApplication.getDebtStatute();
		}
		if (Validator.isNotNull(ogtApplication.getRegisteredManufacturer())) {
			registeredManufacturer = ogtApplication.getRegisteredManufacturer();
		}
		if (Validator.isNotNull(ogtApplication.getProspectingRightsNum())) {
			licenceNumber = ogtApplication.getProspectingRightsNum();
		}
		if (Validator.isNotNull(ogtApplication.getTypeOfBankruptcy())) {
			typeOfBankruptcy = ogtApplication.getTypeOfBankruptcy();
		}
	}
	try {
		ogtCurrentStage = OGTAppCurrentStageLocalServiceUtil.getByOGT_Stage(ogtApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(ogtCurrentStage)
			&& Validator.isNotNull(ogtCurrentStage.getCurrentStage())) {
		currentStage = ogtCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(ogtCurrentStage)
			&& Validator.isNotNull(ogtCurrentStage.getLastFormStep())) {
		lastFormStep = ogtCurrentStage.getLastFormStep();
	}
}
%>
<script>
function uploadDocuments(fileID,folderName,url){
	ogtApplicationId=$("#ogtApplicationId").val();
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${signatureUploadInOGTFormUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
		           },
		           	async: false,
			        success: function (data, status) {
			        	var parsedData = JSON.parse(data);
                     	$.each(parsedData,function(key,entry){
							console.log(entry.fileName);
							$("#"+fileID+"-preview").html(entry.fileName);
							$("#"+fileID+"-preview").attr("href", entry.downloadFileUrl);
							console.log("title is  "+entry.title);
						});
			        },
			        error: function (data, status, e) {
			        }
			    });
		}
</script> 