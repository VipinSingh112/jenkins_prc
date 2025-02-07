<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesProcessedFoodActLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var="factoriesMultipleDocumentUpload" id="factories/Multiple/Document/Upload"></portlet:resourceURL>
<portlet:resourceURL var="productDetailAddUrl" id="product/detail/add"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<%
int counterOfDocuments = 1;
FactoriesRegstCurrentStage factoriesCurrentStage=null;
String currentStage = "";
String lastFormStep = "";
String areYouProcessing="";
String paymentMethod = "";
String typeOfTransaction = null;
String productCategories = null;

String feeRecipetUrl="";
String feeRecipet="";


FactoriesApplicationRegistration factoriesApplication=null;
FactoriesProcessedFoodAct processedFoodAct=null;
FactoriesStandardActInfo standardActInfo=null;
FactoriesAppPayment factoriesPayment=null; 
List<FactoriesProductDetailsAdd> productDetailAdd=null;
int sizeOfProductDetail=0;

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";

DLFolder docProcessedStatement = null;
List<DLFileEntry> processedFileEntry = null;
FileEntry processedDocFE=null;
String formProcessedDoc="";
String amount=null;
String currency=null;

long factoriesApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "factoriesApplicationId"))){
	factoriesApplicationId =ParamUtil.getLong(request, "factoriesApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("factoriesApplicationId"))){
	factoriesApplicationId = Long.valueOf(httpServletRequest.getParameter("factoriesApplicationId"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("paymentMethod"))){
	paymentMethod = String.valueOf(httpServletRequest.getParameter("paymentMethod"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("amount"))){
	amount = String.valueOf(httpServletRequest.getParameter("amount"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("currency"))){
	currency = String.valueOf(httpServletRequest.getParameter("currency"));
}
if(factoriesApplicationId>0){
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Factories Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(factoriesApplicationId));

	} catch (Exception e) {
	}
	/*Signature */
	try{
		docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Standard Act Signature");
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
	try{
		docProcessedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "Processed Food Act Signature");
		processedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docProcessedStatement.getFolderId());
	} catch (Exception e) {
	}
	if (processedFileEntry != null) {
		for (DLFileEntry uploadedFile : processedFileEntry) {
			processedDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			formProcessedDoc=DLURLHelperUtil.getDownloadURL(processedDocFE,
					processedDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			
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
try{
	factoriesApplication= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesRegistrationById(factoriesApplicationId);
}catch(Exception e){}
try{
	processedFoodAct= FactoriesProcessedFoodActLocalServiceUtil.getFactoriesById(factoriesApplicationId);
	
	
}catch(Exception e){
	e.printStackTrace();
}
try{
	standardActInfo= FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
}catch(Exception e){}
try{
	productDetailAdd= FactoriesProductDetailsAddLocalServiceUtil.getFactoriesById(factoriesApplicationId);
	sizeOfProductDetail=productDetailAdd.size();
}catch(Exception e){}

	
	if (Validator.isNotNull(factoriesApplication)) {
		if (Validator.isNotNull(factoriesApplication.getTypeOfTransaction())) {
			typeOfTransaction = factoriesApplication.getTypeOfTransaction();
		}
		if (Validator.isNotNull(factoriesApplication.getProductCategory())) {
			productCategories = factoriesApplication.getProductCategory();
		}
		
		if(Validator.isNotNull(factoriesApplication.getAreYouProcessing())){
			areYouProcessing=factoriesApplication.getAreYouProcessing();	
		}
		
	}
	try {
		factoriesCurrentStage = FactoriesRegstCurrentStageLocalServiceUtil.getByFactories_Stage(factoriesApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(factoriesCurrentStage)
			&& Validator.isNotNull(factoriesCurrentStage.getCurrentStage())) {
		currentStage = factoriesCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(factoriesCurrentStage)
			&& Validator.isNotNull(factoriesCurrentStage.getLastFormStep())) {
		lastFormStep = factoriesCurrentStage.getLastFormStep();
	}
	try {
		factoriesPayment = FactoriesAppPaymentLocalServiceUtil.getFactoriesRegistrationById(factoriesApplicationId);
		paymentMethod=factoriesPayment.getPaymentMethod();
		amount=Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getAmountPaid())?factoriesPayment.getAmountPaid():"";
		currency=Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getAmountCurrency())?factoriesPayment.getAmountCurrency():"";
	} catch (Exception e) {
	}
}




%>
<script>
function uploadDocuments(fileID,folderName,url){
	factoriesRegistrationApplicationId=$("#factoriesRegistrationApplicationId").val();
	
	var fileID = fileID;
	 var fileInput = $("#" + fileID)[0]; // File input element
    var fileLength = fileInput.files.length; // Count of selected files
   var saveAndConCheck = $("#saveAndConCheck").val();
	
// Decide what to send to the backend
   var fileData = fileLength > 0 ? fileID : "0";

   // Show loader
   $("#factoriesFormPreviewFieldset .custom_loader").removeClass("hide");
   $(".preview-section").addClass("hide");
			    $.ajaxFileUpload({
			        secureuri: false,
			        method: "POST",
			        fileElementId: fileID,
			        url: "${factoriesMultipleDocumentUpload}",
			        dataType: 'text',
			        data: {
			            "<portlet:namespace/>fileID": fileID,
			            "<portlet:namespace/>command": "fileUpload",
			            "<portlet:namespace/>folderName": folderName,
			            "<portlet:namespace/>factoriesRegistrationApplicationId": factoriesRegistrationApplicationId,
			            "<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		           },
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
								
									var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
				                    
				                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
				                    
				                    $('#additionalDocPreview').append(documentContainerPreview);		
				                    counter++; 
				                    $(".noAdditionalSupportingDoc").addClass("hide");
							});
						}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
						}
		                $("#factoriesFormPreviewFieldset .custom_loader").addClass("hide");
		                $(".preview-section").removeClass("hide");
		                $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		                /*disable the download print button  */
						$("#factoriesDownloadPDF, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			        },
			        error: function (data, status, e) {
			        }
			    });
	}
function deleteAfterSaveConDoc(id) {
    var fileName = $("#"+id).next().html();
    factoriesRegistrationApplicationId=$("#factoriesRegistrationApplicationId").val();
	saveAndCon='<%=factoriesApplicationId%>';
	if(saveAndCon>0){
	 	 $.ajax({
		        type: "POST",
		        url: '${delteDocAferSaveconUrl}',
		        data: {
		            "<portlet:namespace/>fileName": fileName,
		            "<portlet:namespace/>factoriesRegistrationApplicationId": factoriesRegistrationApplicationId,
		        },
		        success: function (data) {
		        },
		        error: function (data) {
		        }
		    });	
		
	}
}
</script>