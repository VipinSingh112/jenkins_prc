<%@page import="com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAReqIrrigation"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAAppPayment"%>
<%@page import="com.nbp.wra.application.form.service.service.LicenceToWellDrillerLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.LicenceToWellDriller"%>
<%@page import="com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.PermitToDrillAWell"%>
<%@page import="com.nbp.wra.application.form.service.service.RenewLicAbstractAndWaterLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater"%>
<%@page import="com.nbp.wra.application.form.service.service.LicenceToAbstractInfoLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAAppCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAAppCurrentStage"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.LicenceToAbstractInfo"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAApplication"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:resourceURL var="wraDocumentsUpload" id="/wra/document/upload"></portlet:resourceURL>
<portlet:resourceURL var="signatureUploadInWRAFormUrl" id="/wra/signature/upload"></portlet:resourceURL>
<portlet:resourceURL var="addWaterIrrigationDetailInfoUrl" id="/water/irrigation/info"></portlet:resourceURL>
<portlet:resourceURL var="addWaterRequiredIrrigationInfoUrl" id="/add/water/required/irrigation/edit"></portlet:resourceURL>
<portlet:resourceURL var="deleteWaterRequiredIrrigationAddUrl" id="/water/required/irrigation/delete"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
int counterOfDocuments=1;
String currentStage = "";
String lastFormStep = "";
String paymentMethod = "";
String typeOfApplication = null;
String typeOfTransaction = null;
String typeOfPermit = null;
String typeOfTransacPermit = null;
String userWaterTypeCategories = null;
String consumptiveSubCategories = null;
String nonConsumptiveSubCategories = null;
String industrialTypeSubCategories = null;
String methodOfPaymentq = null;
String amountPaidq = null;

WRAApplication wraApplication=null;
LicenceToAbstractInfo wraAbstractInfo=null;
RenewLicAbstractAndWater renewAbstractInfo=null;
PermitToDrillAWell permitToDrillAWell=null;
LicenceToWellDriller licToDrillAWell = null;
WRAAppPayment wraPayment = null;
List<WRAReqIrrigation> waterReqIrr=null;
int sizeOfWaterReqIrrAdd=0;

WRAAppCurrentStage wraCurrentStage=null;

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;

DLFolder abstractSign = null;
List<DLFileEntry> abstractSignFileEntry = null;
FileEntry abstractSignDocFE=null;
String abstractSignUrl="";

DLFolder abstractRenewSign = null;
List<DLFileEntry> abstractRenewSignFileEntry = null;
FileEntry abstractRenewSignDocFE=null;
String abstractRenewSignUrl="";

DLFolder permitWellSign = null;
List<DLFileEntry> permitWellSignFileEntry = null;
FileEntry permitWellSignDocFE=null;
String permitWellSignUrl="";

DLFolder wellDrillingSign = null;
List<DLFileEntry> wellDrillingSignFileEntry = null;
FileEntry wellDrillingSignDocFE=null;
String wellDrillingSignUrl="";

String feeRecipetUrl="";
String feeRecipet="";
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";
String formNameDocUrl="";

long wraApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "wraApplicationId"))){
	wraApplicationId =ParamUtil.getLong(request, "wraApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("wraApplicationId"))){
	wraApplicationId = Long.valueOf(httpServletRequest.getParameter("wraApplicationId"));
}
if(wraApplicationId>0){
	try{
		wraApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
	}catch(Exception e){}
	try{
		wraAbstractInfo= LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
	}catch(Exception e){}
	try{
		renewAbstractInfo= RenewLicAbstractAndWaterLocalServiceUtil.getWRA_By_Id(wraApplicationId);
	}catch(Exception e){}
	try{
		permitToDrillAWell= PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
	}catch(Exception e){}
	try{
		licToDrillAWell= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
	}catch(Exception e){}
	try {
		//waterReqIrr = WRAReqIrrigationLocalServiceUtil.getWaterRequired_BY_AppId(wraApplicationId);
		waterReqIrr = WRAReqIrrigationLocalServiceUtil.getWRA_By_CtrAppId(wraApplicationId, OrderByComparatorFactoryUtil.create("WraReqIrrigation", "counter", true));
		sizeOfWaterReqIrrAdd=waterReqIrr.size();
	} catch (Exception e) {
	}
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "WRA Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(wraApplicationId));

	} catch (Exception e) {
	}
	
	/* Signature */
	try {
		abstractSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Abstract Signature Applicant");
		abstractSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),abstractSign.getFolderId());
	} catch (Exception e) {
	}
	if (abstractSignFileEntry != null) {
		for (DLFileEntry uploadedFile : abstractSignFileEntry) {
			abstractSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			abstractSignUrl = DLURLHelperUtil.getDownloadURL(abstractSignDocFE, abstractSignDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try {
		abstractRenewSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Abstract Renew Signature Applicant");
		abstractRenewSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),abstractRenewSign.getFolderId());
	} catch (Exception e) {
	}
	if (abstractRenewSignFileEntry != null) {
		for (DLFileEntry uploadedFile : abstractRenewSignFileEntry) {
			abstractRenewSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			abstractRenewSignUrl = DLURLHelperUtil.getDownloadURL(abstractRenewSignDocFE, abstractRenewSignDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	
	try {
		permitWellSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Permit Signature Applicant");
		permitWellSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),permitWellSign.getFolderId());
	} catch (Exception e) {
	}
	if (permitWellSignFileEntry != null) {
		for (DLFileEntry uploadedFile : permitWellSignFileEntry) {
			permitWellSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			permitWellSignUrl = DLURLHelperUtil.getDownloadURL(permitWellSignDocFE, permitWellSignDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
		}
	}
	try {
		wellDrillingSign = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Well Drilling Signature Applicant");
		wellDrillingSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),wellDrillingSign.getFolderId());
	} catch (Exception e) {
	}
	if (wellDrillingSignFileEntry != null) {
		for (DLFileEntry uploadedFile : wellDrillingSignFileEntry) {
			wellDrillingSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			wellDrillingSignUrl = DLURLHelperUtil.getDownloadURL(wellDrillingSignDocFE, wellDrillingSignDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
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
	
	
	if (Validator.isNotNull(wraApplication)) {
		if (Validator.isNotNull(wraApplication.getTypeOfApplication())) {
			typeOfApplication = wraApplication.getTypeOfApplication();
		}
		if (Validator.isNotNull(wraApplication.getTypeOfTransaction())) {
			typeOfTransaction = wraApplication.getTypeOfTransaction();
		}
		if (Validator.isNotNull(wraApplication.getTypeOfPermit())) {
			typeOfPermit = wraApplication.getTypeOfPermit();
		}
		if (Validator.isNotNull(wraApplication.getTypeOfTransacPermit())) {
			typeOfTransacPermit = wraApplication.getTypeOfTransacPermit();
		}
		if (Validator.isNotNull(wraApplication.getUserWaterTypeCat())) {
			userWaterTypeCategories = wraApplication.getUserWaterTypeCat();
		}
		if (Validator.isNotNull(wraApplication.getConsumptiveSubCat())) {
			consumptiveSubCategories = wraApplication.getConsumptiveSubCat();
		}
		if (Validator.isNotNull(wraApplication.getNonConsumptiveSubCat())) {
			nonConsumptiveSubCategories = wraApplication.getNonConsumptiveSubCat();
		}
		if (Validator.isNotNull(wraApplication.getIndustrialTypeSubCat())) {
			industrialTypeSubCategories = wraApplication.getIndustrialTypeSubCat();
		}
	}
	try {
		wraCurrentStage = WRAAppCurrentStageLocalServiceUtil.getByWRA_Stage(wraApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(wraCurrentStage)
			&& Validator.isNotNull(wraCurrentStage.getCurrentStage())) {
		currentStage = wraCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(wraCurrentStage)
			&& Validator.isNotNull(wraCurrentStage.getLastFormStep())) {
		lastFormStep = wraCurrentStage.getLastFormStep();
	}
	try {
		wraPayment = WRAAppPaymentLocalServiceUtil.getgetWRA_By_Id(wraApplicationId);
		paymentMethod=wraPayment.getPaymentMethod();
		methodOfPaymentq=wraPayment.getAmountCurrency();
		amountPaidq=wraPayment.getAmountPaid();
	} catch (Exception e) {
	}
}
%>


<script>
function uploadDocuments(fileID,folderName,url){
	var fileID = fileID;
	 var fileInput = $("#" + fileID)[0]; // File input element
    var fileLength = fileInput.files.length; // Count of selected files
   var saveAndConCheck = $("#saveAndConCheck").val();
	
// Decide what to send to the backend
   var fileData = fileLength > 0 ? fileID : "0";
   // Show loader
   $("#wraFormPreviewFieldset .custom_loader").removeClass("hide");
   $(".preview-section").addClass("hide");
	wraApplicationId=$("#wraApplicationId").val();
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${signatureUploadInWRAFormUrl}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>wraApplicationId": wraApplicationId,
			            "<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		           },
		           	async: false,
			        success: function (data, status) {
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
								
								$("#"+fileID+"-preview").html(entry.fileName);
							});
						}
						$("#wraFormPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			        },
			        error: function (data, status, e) {
			        }
			    });
		}
		
	function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    wraApplicationId=$("#wraApplicationId").val();
	saveAndCon='<%=wraApplicationId%>';
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