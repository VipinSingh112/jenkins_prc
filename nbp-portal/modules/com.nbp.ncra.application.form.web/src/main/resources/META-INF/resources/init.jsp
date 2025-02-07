<%@page import="com.nbp.ncra.application.form.service.service.NcraFeeSubmissionLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraFeeSubmission"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDateLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplication"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraCurrentStage"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />
<portlet:resourceURL var="docUploadInNCRAFormUrl" id="/doc/upload/in/ncra/form/url"></portlet:resourceURL>
<portlet:resourceURL var="petrolInfo" id="/petrolInfo"></portlet:resourceURL>
<portlet:defineObjects />
<%
FileEntry fileEntrySingle = null;
String fileUrl="";
String currentStageName="";
String lastFormDetailName="";
String typeOfTransaction="";
String doYouWant="";
long sizeOfWeighDevice=0;
int counterOfDocuments=1;
long ncraApplicationId = 0;
DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
DLFolder supportingDocSign = null;
DLFolder supportingDocGeneric = null;
List<DLFileEntry> genericFileEntry = null;
List<DLFileEntry> signFileEntry = null;
FileEntry fileEntrySign = null;
String signUrl = "";
String payment="";
String thirtyDayCreditActive="";
String paymentUpfrontActive="";
String fileUrlSignature = "";
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if (Validator.isNotNull(ParamUtil.getLong(request, "ncraApplicationId"))) {
	ncraApplicationId = ParamUtil.getLong(request, "ncraApplicationId");
} else if (Validator.isNotNull(httpServletRequest.getParameter("ncraApplicationId"))) {
	ncraApplicationId = Long.valueOf(httpServletRequest.getParameter("ncraApplicationId"));
}
NcraVerifyWeighingDate ncraVerifyWeighingDate=null;
List<NcraVerifyWeighingDeviceInfo>   weighingDeviceInfo=null;
NcraApplication ncraApplication=null;
NcraApplicantDetailInfo ncraApplicantDetailInfo = null;
NcraFeeSubmission feeSubmission=null;
String selectedFee="";
if(ncraApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCRA Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(ncraApplicationId));

	} catch (Exception e) {
	}
	try {
		supportingDocSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Verification of Weighing Signature");
		signFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocSign.getFolderId());
	} catch (Exception e) {
	}
	if (signFileEntry != null) {
		for (DLFileEntry uploadedFile : signFileEntry) {
			fileEntrySingle = DLAppLocalServiceUtil
					.getFileEntry(uploadedFile.getFileEntryId());
			signUrl = DLURLHelperUtil.getDownloadURL(
					fileEntrySingle, fileEntrySingle.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try {
		supportingDocGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Generic Documents");
		genericFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocGeneric.getFolderId());
	} catch (Exception e) {
	}
	try{
		ncraApplicantDetailInfo = NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
	}
	catch(Exception e){}
	try{
		feeSubmission = NcraFeeSubmissionLocalServiceUtil.getNcraFee_By_NCRA_Id(ncraApplicationId);
	}
	catch(Exception e){}
	if(feeSubmission!=null){
		if(feeSubmission.getCreditStatus().equals("30 Days Credit")){
			thirtyDayCreditActive="active";
		}else if(feeSubmission.getCreditStatus().equals("Payment Upfront")){
			paymentUpfrontActive="active";
		}
		selectedFee=feeSubmission.getCreditStatus();
	}
	NcraCurrentStage currentStage=null;
	try{
		currentStage=NcraCurrentStageLocalServiceUtil.getNcraCurrent_By_NCRA_Id(ncraApplicationId);
	}catch(Exception e){}
	if(currentStage!=null){
		currentStageName=currentStage.getCurrentStage();
		lastFormDetailName=currentStage.getLastFormStepDetails();
	}
	try{
		ncraApplication=NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
	}catch(Exception e){}
	try{
		weighingDeviceInfo=NcraVerifyWeighingDeviceInfoLocalServiceUtil.getNcraVerify_By_DataList(ncraApplicationId);
	}catch(Exception e){}
	try{
		ncraVerifyWeighingDate=NcraVerifyWeighingDateLocalServiceUtil.getNcraVerify_By_Date(ncraApplicationId);//getting by app Id
	}catch(Exception e){}
	
	if(weighingDeviceInfo!=null){
		sizeOfWeighDevice=weighingDeviceInfo.size();
	}
	if(ncraApplication!=null){
		doYouWant=ncraApplication.getDoYouWant();
		typeOfTransaction=ncraApplication.getTypeOfTransaction();
	}
}
%>
<script>
function uploadDocuments(fileID,folderName,url){
	ncraApplicationId=$("#ncraApplicationId").val();
	    $.ajaxFileUpload({
	        secureuri: false,
	        method: "POST",
	        fileElementId: fileID,
	        url: "${docUploadInNCRAFormUrl}",
	        dataType: 'text',
	        data: {
	            "<portlet:namespace/>fileID": fileID,
	            "<portlet:namespace/>command": "fileUpload",
	            "<portlet:namespace/>folderName": folderName,
	            "<portlet:namespace/>ncraApplicationId": ncraApplicationId,
           },
           	async: false,
	        success: function (data, status) {
	        },
	        error: function (data, status, e) {
	        }
	    });
	}
</script>