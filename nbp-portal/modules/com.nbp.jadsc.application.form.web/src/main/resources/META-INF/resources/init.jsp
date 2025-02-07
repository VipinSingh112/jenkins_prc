<%@page import="com.nbp.jadsc.application.form.service.service.JADSCChecklistAddLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCNoticeOfAppearanceLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCChecklistLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCChecklist"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCCertificateOfVeracityLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceAddFormLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCOathRequest"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCInformationRequestLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCInformationRequest"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCCurrentStage"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCApplication"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var="documentUploadUtilUrl" id="document/Upload/Util/Url"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<% 
int counterOfDocuments=1;
String currentStage = "";
String lastFormStep = "";
String typeOfApplication="";
String typeOfComplaint="";
String typeOfTransaction="";
String typeOfApplicant="";
String industriesImpacted="";
int checkListSize=0;
int sizeOfJadscChecklistAdd=0;
String breachOfConfidentiality="";
String categoriesOfConfidentialInfo="";
String reasonForConfidentialStatus="";
String nonConfidentialSummary="";
String selectedCheckListValue="";

JADSCApplication jadscApplication=null;
JADSCCurrentStage jadscCurrentStage=null;

List<JADSCChecklistAdd> jadscChecklistadd=null;


JADSCInformationRequest infoReq=null;
JADSCOathRequest oathReq=null;
JADSCCertificateOfService certificateService=null;
List<JADSCCertificateOfServiceAddForm> certiOfServiceAdd=null;
List<JADSCChecklist> checklist = null;

int sizeOfCeritificateServiceAdd=0;

JADSCCertificateOfVeracity ceritifiVeracity=null;

JADSCNoticeOfAppearance noticeAppearance=null;

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;

DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";

DLFolder docOathJustice = null;
List<DLFileEntry> oathJusticeFileEntry = null;
FileEntry athJusticeDocFE=null;
String oathJusticeDoc="";

DLFolder docService = null;
List<DLFileEntry> serviceFileEntry = null;
FileEntry serviceDocFE=null;
String serviceDoc="";

DLFolder docCerVeracity = null;
List<DLFileEntry> cerVeracityFileEntry = null;
FileEntry cerVeracityDocFE=null;
String cerVeracityDoc="";

DLFolder docJusticeVeracity = null;
List<DLFileEntry> justiceVeracityFileEntry = null;
FileEntry justiceVeracityDocFE=null;
String justiceVeracityDoc="";

DLFolder docNoticeSign = null;
List<DLFileEntry> noticeSignFileEntry = null;
FileEntry noticeSignDocFE=null;
String noticeSignDoc="";

long jadscApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "jadscApplicationId"))){
	jadscApplicationId =ParamUtil.getLong(request, "jadscApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("jadscApplicationId"))){
	jadscApplicationId = Long.valueOf(httpServletRequest.getParameter("jadscApplicationId"));
}
if(jadscApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JADSC Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(jadscApplicationId));

	} catch (Exception e) {
	}
	/*Form Docs */
	try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Oath Submitter Sign");
		attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (attachedFileEntry != null) {
		for (DLFileEntry uploadedFile : attachedFileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formNameDoc=DLURLHelperUtil.getDownloadURL (attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docOathJustice = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Oath Justice Sign");
		oathJusticeFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docOathJustice.getFolderId());
	} catch (Exception e) {
	}
	if (oathJusticeFileEntry != null) {
		for (DLFileEntry uploadedFile : oathJusticeFileEntry) {
			athJusticeDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			oathJusticeDoc=DLURLHelperUtil.getDownloadURL (athJusticeDocFE,
					athJusticeDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docService = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Certificate of Service Sign");
		serviceFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docService.getFolderId());
	} catch (Exception e) {
	}
	if (serviceFileEntry != null) {
		for (DLFileEntry uploadedFile : serviceFileEntry) {
			serviceDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			serviceDoc=DLURLHelperUtil.getDownloadURL (serviceDocFE,
					serviceDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docCerVeracity = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Certificate of Veracity Sign");
		cerVeracityFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docCerVeracity.getFolderId());
	} catch (Exception e) {
	}
	if (cerVeracityFileEntry != null) {
		for (DLFileEntry uploadedFile : cerVeracityFileEntry) {
			cerVeracityDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			cerVeracityDoc=DLURLHelperUtil.getDownloadURL (cerVeracityDocFE,
					cerVeracityDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docJusticeVeracity = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Certificate of Veracity Peace Justice");
		justiceVeracityFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docJusticeVeracity.getFolderId());
	} catch (Exception e) {
	}
	if (justiceVeracityFileEntry != null) {
		for (DLFileEntry uploadedFile : justiceVeracityFileEntry) {
			justiceVeracityDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			justiceVeracityDoc=DLURLHelperUtil.getDownloadURL (justiceVeracityDocFE,
					justiceVeracityDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try{
		docNoticeSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Notice of Appearance Sign");
		noticeSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docNoticeSign.getFolderId());
	} catch (Exception e) {
	}
	if (noticeSignFileEntry != null) {
		for (DLFileEntry uploadedFile : noticeSignFileEntry) {
			noticeSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			noticeSignDoc=DLURLHelperUtil.getDownloadURL (noticeSignDocFE,
					noticeSignDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		jadscApplication =JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
	} catch (Exception e) {}
	try {
		infoReq =JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try {
		oathReq =JADSCOathRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try {
		certificateService =JADSCCertificateOfServiceLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try {
		certiOfServiceAdd =JADSCCertificateOfServiceAddFormLocalServiceUtil.getJADSCDataListBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try {
		ceritifiVeracity =JADSCCertificateOfVeracityLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try {
		checklist =JADSCChecklistLocalServiceUtil.getJADSC_ByAppId(jadscApplicationId);
	} catch (Exception e) {
		e.printStackTrace();
	}

	if(checklist!=null){
		checkListSize=checklist.size();
	}
	try {
		jadscChecklistadd =JADSCChecklistAddLocalServiceUtil.getAppIdJADSC(jadscApplicationId);
		sizeOfJadscChecklistAdd=jadscChecklistadd.size();
	} catch (Exception e) {}
	

	try {
		noticeAppearance = JADSCNoticeOfAppearanceLocalServiceUtil.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
	} catch (Exception e) {}
	try{
		certiOfServiceAdd= JADSCCertificateOfServiceAddFormLocalServiceUtil.getJADSCDataListBy_Id(jadscApplicationId);
		sizeOfCeritificateServiceAdd=certiOfServiceAdd.size();
	}catch (Exception e) {}
	
	if (Validator.isNotNull(jadscApplication)) {
		if (Validator.isNotNull(jadscApplication.getTypeOfApplication())) {
			typeOfApplication = jadscApplication.getTypeOfApplication();
		}
		if (Validator.isNotNull(jadscApplication.getTypeOfComplaint())) {
			typeOfComplaint = jadscApplication.getTypeOfComplaint();
		}
		if (Validator.isNotNull(jadscApplication.getTypeOfTransaction())) {
			typeOfTransaction = jadscApplication.getTypeOfTransaction();
		}
		if (Validator.isNotNull(jadscApplication.getTypeOfApplicant())) {
			typeOfApplicant = jadscApplication.getTypeOfApplicant();
		}
		if (Validator.isNotNull(jadscApplication.getIndustriesImpacted())) {
			industriesImpacted = jadscApplication.getIndustriesImpacted();
		}
		if (Validator.isNotNull(jadscApplication.getBreachOfConfidentiality())) {
			breachOfConfidentiality = jadscApplication.getBreachOfConfidentiality();
		}
		if (Validator.isNotNull(jadscApplication.getCategoriesOfConfidentialInfo())) {
			categoriesOfConfidentialInfo = jadscApplication.getCategoriesOfConfidentialInfo();
		}
		if (Validator.isNotNull(jadscApplication.getReasonForConfidentialStatus())) {
			reasonForConfidentialStatus = jadscApplication.getReasonForConfidentialStatus();
		}
		if (Validator.isNotNull(jadscApplication.getNonConfidentialSummary())) {
			nonConfidentialSummary = jadscApplication.getNonConfidentialSummary();
		}
	}
	try {
		jadscCurrentStage = JADSCCurrentStageLocalServiceUtil.getByJadsc_Stage(jadscApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(jadscCurrentStage) && Validator.isNotNull(jadscCurrentStage.getCurrentStage())) {
		currentStage = jadscCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(jadscCurrentStage) && Validator.isNotNull(jadscCurrentStage.getLastFormStep())) {
		lastFormStep = jadscCurrentStage.getLastFormStep();
	}
}

%>
<script>
function uploadDocuments(fileID,folderName,url){
	 var fileID = 'jadscGenericUpload';
	 var fileInput = $("#" + fileID)[0]; // File input element
     var fileLength = fileInput.files.length; // Count of selected files
     var saveAndConCheck = $("#saveAndConCheck").val();
 //Decide what to send to the backend
     var fileData = fileLength > 0 ? fileID : "0";
  // Show loader
	 $("#jadscFormPreviewFieldset .custom_loader").removeClass("hide");
	 $(".preview-section").addClass("hide");
	 jadscApplicationId=$("#jadscApplicationId").val();
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${documentUploadUtilUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
			            "<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		           },
		           async: false,
		           success: function (data,status) {
		        	   $(".additionalDocPreviewOne, #additionalDocPreview").html("");
		        		var parsedData = JSON.parse(data);
			        	 try{
	    	                var parsedData = typeof data === "string" ? JSON.parse(data) : data;
	        	            var jsonArrayLength=parsedData.JSON_LENGTH;
	        	            var uniqueArray = parsedData.fileData;
	        	            var responseData = uniqueArray.filter((value, index, self) =>
	        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
		        	        );
		        	         }catch(error){}
		        	    	       if (jsonArrayLength > 0){
		   		                	var counter = 1;
		   							$.each(responseData,function(key,entry){
		   									var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
		   				                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
		   				                    $('#additionalDocPreview').append(documentContainerPreview);		
		   				                    counter++; 
		   				                    $(".noAdditionalSupportingDoc").addClass("hide");
		   							});
		   		                }else{
		   		                	$(".noAdditionalSupportingDoc").removeClass("hide");
		                           	$.each(responseData,function(key,entry){
		   								console.log(entry.fileName);
		   								$("#"+fileID+"-preview").html(entry.fileName);
		   							});
		   						}
		        	    	    console.log("doc uploaded successfully");
		        	    	    $("#jadscFormPreviewFieldset .custom_loader").addClass("hide");
		   		                $(".preview-section").removeClass("hide");
		   		                $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		           },
			        error: function (data, status, e) {
			        }
			    });
		}
	
function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    jadscApplicationId=$("#jadscApplicationId").val();
	saveAndCon='<%=jadscApplicationId%>';
	if(saveAndCon>0){
	 	 $.ajax({
		        type: "POST",
		        url: '${delteDocAferSaveconUrl}',
		        data: {
		            "<portlet:namespace/>fileName": fileName,
		            "<portlet:namespace/>wraApplicationId": wraApplicationId,
		        },
		        success: function (data) {
		        },
		        error: function (data) {
		        }
		    });	
		
	}
}
</script>