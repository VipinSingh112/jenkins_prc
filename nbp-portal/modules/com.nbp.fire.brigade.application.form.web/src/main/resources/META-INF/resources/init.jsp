<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalService"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="fireBrigadeDoucumentsUpload" id="/fire/brigade/upload/document"></portlet:resourceURL>
<portlet:resourceURL var="signatureUploadInFireBrigadeUrl" id="/upload/documents/in/fire/brigade"></portlet:resourceURL>
<portlet:resourceURL var="fireBrigadeGettingDocumentList" id="/fire/brigade/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="fireDeleteDocumentUrl" id="/fire/brigade/delete/docuument"></portlet:resourceURL>
<portlet:resourceURL var="fireBrigadeGenericSupportingDocUrl" id="/upload/documents/in/fire/brigade"></portlet:resourceURL>
<portlet:resourceURL var="fireBrigadefeeDetailsUrl" id="/fire/brigade/fee/detail"></portlet:resourceURL>
<portlet:resourceURL var="submitFireBrigadeApplicationUrl" id="/sbmit/fire/brigade/application"></portlet:resourceURL>
<%
FireBrigadeApplication applicationData=null;
FireBrigadeAppPayment firePayment=null;
FireBrigadeAppliCurrentStage fireBrigadeApplicationCurrentStage=null;
long fireBrigadeApplicationId=0;
String currentStage="";
String lastFormStep="";
String certificateType=null;
String typeOfTransaction=null;
String typeOfApplicant=null;
String typeOfPermises=null;
String purposeOfCertificate=null;
String parish=null;
String paymentMethod = "";
String amount="";
String currency="";
String signatureAppli = "";
FireBrigadeCerPurposeInfo certificatePupose = null;
FireBrigadePremisesInfo premisesInfo = null;

int counterOfDocuments=1;
String equipment=null;
String certificatePre=null;
FireBrigadeProEquipmentInfo proEquipmentInfo=null;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if (Validator.isNotNull(httpServletRequest.getParameter("fireBrigadeApplicationId"))) {
	fireBrigadeApplicationId = Long.valueOf(httpServletRequest.getParameter("fireBrigadeApplicationId"));
}


DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
List<DLFileEntry> fileEntry1 = null;
DLFolder supportingDocumentsFolder1 = null;
DLFolder supportingDocumentSubFolderManagment = null;
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String feeRecipet="";
String feeRecipetUrl="";
String premisesCerti="";
FileEntry attachDocFE2=null;

if(fireBrigadeApplicationId>0){
	
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(fireBrigadeApplicationId));

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
	try{
	    applicationData=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeApplication(fireBrigadeApplicationId);
	  }catch(Exception e){
	 }
	if(Validator.isNotNull(applicationData)){
		if(Validator.isNotNull(applicationData.getCertificateType())){
			certificateType=applicationData.getCertificateType();
		}
		if(Validator.isNotNull(applicationData.getTypeOfTransaction())){
			typeOfTransaction=applicationData.getTypeOfTransaction();
		}
		if(Validator.isNotNull(applicationData.getTypeOfApplicant())){
			typeOfApplicant=applicationData.getTypeOfApplicant();	
		}
		if(Validator.isNotNull(applicationData.getTypeOfPermises())){
			typeOfPermises=applicationData.getTypeOfPermises();	
		}
		if(Validator.isNotNull(applicationData.getPurposeOfCertificate())){
			purposeOfCertificate=applicationData.getPurposeOfCertificate();	
		}
		if(Validator.isNotNull(applicationData.getParish())){
			parish=applicationData.getParish();	
		}
	}
	try {
		fireBrigadeApplicationCurrentStage =FireBrigadeAppliCurrentStageLocalServiceUtil.getFireBrigade_Stage_FBAI(fireBrigadeApplicationId);
	}catch (Exception e) {
	}
	if(Validator.isNotNull(fireBrigadeApplicationCurrentStage)
			&& Validator.isNotNull(fireBrigadeApplicationCurrentStage.getCurrentStage())) {
		currentStage = fireBrigadeApplicationCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(fireBrigadeApplicationCurrentStage)
			&& Validator.isNotNull(fireBrigadeApplicationCurrentStage.getLastFormStep())) {
		lastFormStep = fireBrigadeApplicationCurrentStage.getLastFormStep();
	}
	try{
		proEquipmentInfo=FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
	}catch(Exception e){
	}
	try{
		certificatePupose=FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
	}catch(Exception e){
	}
	try{
		premisesInfo=FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
	}catch(Exception e){
	}
	if(Validator.isNotNull(proEquipmentInfo)){
		if(Validator.isNotNull(proEquipmentInfo.getEquipmentProtectionPre())){
			equipment= proEquipmentInfo.getEquipmentProtectionPre();
		}
	}
	if(Validator.isNotNull(premisesInfo)){
		if(Validator.isNotNull(premisesInfo.getPremisesCertified())){
			premisesCerti= premisesInfo.getPremisesCertified();
		}
	}
	if(Validator.isNotNull(certificatePupose)){
		if(Validator.isNotNull(certificatePupose.getCertificatePurposePre())){
			certificatePre= certificatePupose.getCertificatePurposePre();
		}
	}
	
	try {
		firePayment = FireBrigadeAppPaymentLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		paymentMethod=firePayment.getPaymentMethod();
		amount=firePayment.getAmountPaid();
		currency=firePayment.getAmountCurrency();
	} catch (Exception e) {
	}
	try {
		supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
				"Signature");
		fileEntry1 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocumentSubFolderManagment.getFolderId());
		for (DLFileEntry dlFileEntry : fileEntry1) {
			attachDocFE2 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			signatureAppli=DLURLHelperUtil.getDownloadURL(attachDocFE2,
					attachDocFE2.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}} catch (Exception e) {
			e.printStackTrace();
		}
}
%>
<script>
/* function uploadDocuments(fileID,folderName,url){
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${signatureUploadInFireBrigadeUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		           },
			        success: function (data, status) {
			        },
			        error: function (data, status, e) {
			        }
			    });
	} */
</script>