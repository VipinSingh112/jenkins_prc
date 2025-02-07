<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalNurseStaffPremisesLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelper"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppHelperLocalService"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesSignInfoLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesMaterHomeLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseDetailLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesQNurseLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseStaffLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeTwoLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesComDetailLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppliInfoLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp"%>
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
<portlet:resourceURL var="medicalFacilitiesPendingUrl" id="medical/facilities/pending"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesApplicantDetailUrl" id="medical/facilities/applicant/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesCompanyDetailUrl" id="medical/facilities/company/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesHomeDetailUrl" id="medical/facilities/home/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesPatientCountUrl" id="medical/facilities/patient/count"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesNursingStaffDetailUrl" id="medical/facilities/nursing/staff/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesMedicalPractitionerDetailUrl" id="medical/facilities/medical/practitioner/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesPractitionerQualifiedNurseDetailUrl" id="medical/facilities/practitioner/qualified/nurse/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesMaternityDetailUrl" id="medical/facilities/maternity/detail"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesSignatureUrl" id="medical/facilities/signature"></portlet:resourceURL>
<portlet:resourceURL var="submitMedicalFacilitiesApplicationUrl" id="submit/medical/facilities/application"></portlet:resourceURL>
<portlet:resourceURL var="MedicalFacilitiesGettingDocumentListUrl" id="medical/facilities/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="signatureUploadInMedicalFormUrl" id="medical/facilities/signature/upload"></portlet:resourceURL>
<portlet:resourceURL var="medicalFacilitiesNurseStaffPremisesUrl" id="medical/facilities/nurse/premises"></portlet:resourceURL>
<portlet:resourceURL var="deleteGenericDocOfMedicalUrl" id="delete/generic/doc/of/medical"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<%
//String fileUrl="";
MedicalFacilitiesApp medicalApplication=null;
List<MedicalFacilitiesAppliInfo> applicantDetailsAdd=null;
int sizeOfApplicantDetailAdd=0;

List<MedicalFacilitiesComDetail> companyDetailInfo=null;
int sizeOfCompanyDetail=0;

MedicalFacilitiesHomeInfo homeDetailAdd=null;
int sizeOfHomeDetailAdd=0;

List<MedicalFacilitiesHomeTwo> numOfPaitentInfo=null;
int sizeOfPatientCount=0;

List<MedicalFacilitiesNurseStaff> nursingStaffInfo=null;
int sizeOfNursingStaff=0;

List<MedicalFacilitiesMaterHome> maternityInfo=null;
int sizeOfMaternityHome=0;

List<MedicalFacilitiesNurseDetail> practiceNurseInfo=null;
int sizeOfPracticeNurse=0;

MedicalFacilitiesQNurse qualifiedNurseInfo=null;
MedicalFacilitiesSignInfo signatureInfo=null; 
MedicalCurrentStage medicalCurrentStage=null;
MedicalFaciltiesPayment medicalPayment=null;
MedicalNurseStaffPremises medStaffPremises=null;

String natureOfApplicant = "";
String typeOfTransaction = "";
String medicalCategory = "";
String subCategory = "";
String nursingHomesSubCategoryVal = "";
String nursingHomesCategory = "";
String numberOfBeds = "";
String currentStage = "";
String lastFormStep = "";
String paymentMethod = "";

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;

DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";


String feeRecipet="";
String feeRecipetUrl="";

long medicalApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "medicalApplicationId"))){
	medicalApplicationId =ParamUtil.getLong(request, "medicalApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("medicalApplicationId"))){
	medicalApplicationId = Long.valueOf(httpServletRequest.getParameter("medicalApplicationId"));
}
if(medicalApplicationId>0){
	try {
		medicalApplication = MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesApp(medicalApplicationId);
	} catch (Exception e) {}
	
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Medical Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(medicalApplicationId));

	} catch (Exception e) {
	}
	/*Form Docs */
	try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Signature of Applicant Employee");
		attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (attachedFileEntry != null) {
		for (DLFileEntry uploadedFile : attachedFileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formNameDoc= DLURLHelperUtil.getDownloadURL(attachDocFE, attachDocFE.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
		}
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
	
	if (Validator.isNotNull(medicalApplication)) {
		if (Validator.isNotNull(medicalApplication.getNatureOfApplicant())) {
			natureOfApplicant = medicalApplication.getNatureOfApplicant();
		}
		if (Validator.isNotNull(medicalApplication.getTypeOfTransaction())) {
			typeOfTransaction = medicalApplication.getTypeOfTransaction();
		}
		if (Validator.isNotNull(medicalApplication.getMedicalCategory())) {
			medicalCategory = medicalApplication.getMedicalCategory();
		}
		if (Validator.isNotNull(medicalApplication.getSubCategory())) {
			subCategory = medicalApplication.getSubCategory();
		}
		if (Validator.isNotNull(medicalApplication.getNursingHomesCategory())) {
			nursingHomesCategory = medicalApplication.getNursingHomesCategory();
		}
		if (Validator.isNotNull(medicalApplication.getNursingSubCategoryVal())) {
			nursingHomesSubCategoryVal = medicalApplication.getNursingSubCategoryVal();
		}
		if (Validator.isNotNull(medicalApplication.getNumberOfBeds())) {
			numberOfBeds = medicalApplication.getNumberOfBeds();
		}
	} 
	try {
		medicalCurrentStage = MedicalCurrentStageLocalServiceUtil.getByMED_Stage(medicalApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(medicalCurrentStage) && Validator.isNotNull(medicalCurrentStage.getCurrentStage())) {
		currentStage = medicalCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(medicalCurrentStage) && Validator.isNotNull(medicalCurrentStage.getLastFormStep())) {
		lastFormStep = medicalCurrentStage.getLastFormStep();
	}
	try {
		applicantDetailsAdd = MedicalFacilitiesAppliInfoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfApplicantDetailAdd=applicantDetailsAdd.size();
	} catch (Exception e) {
	}
	try {
		homeDetailAdd = MedicalFacilitiesHomeInfoLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
		//sizeOfHomeDetailAdd=homeDetailAdd.size();
	} catch (Exception e) {
	}
	try {
		medStaffPremises=MedicalNurseStaffPremisesLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
	} catch (Exception e) {
	}

	try {
		numOfPaitentInfo = MedicalFacilitiesHomeTwoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfPatientCount=numOfPaitentInfo.size();
	} catch (Exception e) {
	}
	try {
		nursingStaffInfo = MedicalFacilitiesNurseStaffLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfNursingStaff=nursingStaffInfo.size();
	} catch (Exception e) {
	}
	try {
		qualifiedNurseInfo = MedicalFacilitiesQNurseLocalServiceUtil.getMedicalFacilitiesById(medicalApplicationId);
	} catch (Exception e) {
	}
	try {
		practiceNurseInfo = MedicalFacilitiesNurseDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfPracticeNurse=practiceNurseInfo.size();
	} catch (Exception e) {
	}
	try {
		maternityInfo = MedicalFacilitiesMaterHomeLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfMaternityHome=maternityInfo.size();
	} catch (Exception e) {
	}
	try {
		companyDetailInfo = MedicalFacilitiesComDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		sizeOfCompanyDetail=companyDetailInfo.size();
	} catch (Exception e) {
	}
	try {
		signatureInfo = MedicalFacilitiesSignInfoLocalServiceUtil.getMedicalFacilitiesById(medicalApplicationId);
	} catch (Exception e) {
	}
	try {
		medicalPayment = MedicalFaciltiesPaymentLocalServiceUtil.getMedicalAppById(medicalApplicationId);
		paymentMethod=medicalPayment.getPaymentMethod();
	} catch (Exception e) {
	}
	
}
%>
<script>
function uploadDocuments(fileID,folderName){
	medicalApplicationId=$("#medicalApplicationId").val();
	
	var fileID = 'medicalGenericUpload';
	 var fileInput = $("#" + fileID)[0]; // File input element
    var fileLength = fileInput.files.length; // Count of selected files
   var saveAndConCheck = $("#saveAndConCheck").val();
	
// Decide what to send to the backend
   var fileData = fileLength > 0 ? fileID : "0";

   // Show loader
   $("#medicalFormPreviewFieldset .custom_loader").removeClass("hide");
   $(".preview-section").addClass("hide");
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${signatureUploadInMedicalFormUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			            "<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		           },
		           	async: false,
			        success: function (data) {
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
									console.log(entry.fileName);
									
										var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
					                    
					                    documentContainerPreview.append('<a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a>');
					                    
					                    $('#additionalDocPreview').append(documentContainerPreview);		
					                    counter++;
					                    $(".noAdditionalSupportingDoc").addClass("hide");
								}); 
							} else{
								$(".noAdditionalSupportingDoc").removeClass("hide");
	                        	$.each(responseData,function(key,entry){
									$("#"+fileID+"-preview").html(entry.fileName);
								});
							}
		        	        $("#medicalFormPreviewFieldset .custom_loader").addClass("hide");
							$(".preview-section").removeClass("hide");
							$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
							/*disable the download print button  */
							$("#medicalDownloadPDF, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			        },
			        error: function (data, status, e) {
			        }
			    });
		}
		
function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    medicalApplicationId=$("#medicalApplicationId").val();
	saveAndCon='<%=medicalApplicationId%>';
	if(saveAndCon>0){
	 	 $.ajax({
		        type: "POST",
		        url: '${delteDocAferSaveconUrl}',
		        data: {
		            "<portlet:namespace/>fileName": fileName,
		            "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
		        },
		        success: function (data) {
		        },
		        error: function (data) {
		        }
		    });	
		
	}
}

</script> 