<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosiveAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment"%>
<%@page import="com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm"%>
<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage"%>
<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var ="addToPendingAppUrl" id="/add/pending/app/url"></portlet:resourceURL>
<portlet:resourceURL var ="draftExplosiveAppUrl" id="/add/pending/app/url"></portlet:resourceURL>
<portlet:resourceURL var ="addToSubmitAppUrl" id="/add/submit/app/url"></portlet:resourceURL>
<portlet:resourceURL var="addBlasterDetailInfo" id="blaster/detail/Info"></portlet:resourceURL>
<portlet:resourceURL var="addPyrotechnicDetailInfo" id="pyrotechnic/detail/Info"></portlet:resourceURL>
<portlet:resourceURL var="explosivesDeleteDocumentUrl" id="/explosives/Delete/Document"></portlet:resourceURL>
<portlet:resourceURL var="explosivesDoucumentsUpload" id="/explosives/upload/document"></portlet:resourceURL>
<portlet:resourceURL var="ExplosivesGettingDocumentListUrl" id="explosives/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<%
ExplosivesApplication explosivesApplication = null;
ExplosivesCurrentStage explosiveCurrentStage = null;
ExplosiveAppPayment explosivePayment=null;
BlasterCompetencyForm blaster=null;

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;

DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";
String imageDoc="";
String feeRecipetUrl="";
String feeRecipet="";

String paymentMethod="";
String amount="";
String currency="";

int counterOfDocuments=1;
long explosivesApplicationId=0;

String typeOfApplicant="";
String typeOfTransaction="";
String lastFormStep="";
String currentStage="";
String blastingCourse="";

HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "explosivesApplicationId"))){
	explosivesApplicationId =ParamUtil.getLong(request, "explosivesApplicationId");
}
else if (Validator.isNotNull(httpServletRequest.getParameter("explosivesApplicationId"))) {
	explosivesApplicationId = Long.valueOf(httpServletRequest.getParameter("explosivesApplicationId"));
}

if(explosivesApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Explosive Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(explosivesApplicationId));

	} catch (Exception e) {
	}
	
	/*Signature of Applicant */
	try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Signature of Applicant");
		attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (attachedFileEntry != null) {
		for (DLFileEntry uploadedFile : attachedFileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formNameDoc=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
 /*Image of Applicant*/
 try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Image of Applicant");
		attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (attachedFileEntry != null) {
		for (DLFileEntry uploadedFile : attachedFileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			imageDoc=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		explosivesApplication= ExplosivesApplicationLocalServiceUtil.getExplosiveById(explosivesApplicationId);
	}catch(Exception e){}
	
	if (Validator.isNotNull(explosivesApplication)) {
		if (Validator.isNotNull(explosivesApplication.getTypeOfApplicant())) {
			typeOfApplicant = explosivesApplication.getTypeOfApplicant();
		}
		if (Validator.isNotNull(explosivesApplication.getTypeOfTransaction())) {
			typeOfTransaction = explosivesApplication.getTypeOfTransaction();
		}
	}
	
	try {
		explosiveCurrentStage = ExplosivesCurrentStageLocalServiceUtil.getByExplosive_Stage(explosivesApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(explosiveCurrentStage)
			&& Validator.isNotNull(explosiveCurrentStage.getCurrentStage())) {
		currentStage = explosiveCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(explosiveCurrentStage)
			&& Validator.isNotNull(explosiveCurrentStage.getLastFormDetailsStep())) {
		lastFormStep = explosiveCurrentStage.getLastFormDetailsStep();
	}
	try {
		blaster= BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
		if (Validator.isNotNull(blaster.getBlastingCourse())){
			blastingCourse=blaster.getBlastingCourse();
		}
	} catch (Exception e) {
	}
	
	
	try{
		explosivePayment=ExplosiveAppPaymentLocalServiceUtil.getExplosiveById(explosivesApplicationId);
		paymentMethod=explosivePayment.getPaymentMethod();
		amount=Validator.isNotNull(explosivePayment)&&Validator.isNotNull(explosivePayment.getAmountPaid())?explosivePayment.getAmountPaid():"";
		currency=Validator.isNotNull(explosivePayment)&&Validator.isNotNull(explosivePayment.getAmountCurrency())?explosivePayment.getAmountCurrency():"";
	}catch(Exception e){}
	
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
	
}
%>
<script>
function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    explosivesApplicationId=$("#explosivesApplicationId").val();
	saveAndCon='<%=explosivesApplicationId%>';
	if(saveAndCon>0){
	 	 $.ajax({
		        type: "POST",
		        url: '${delteDocAferSaveconUrl}',
		        data: {
		            "<portlet:namespace/>fileName": fileName,
		            "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
		        },
		        success: function (data) {
		        },
		        error: function (data) {
		        }
		    });	
		
	}
}

</script>