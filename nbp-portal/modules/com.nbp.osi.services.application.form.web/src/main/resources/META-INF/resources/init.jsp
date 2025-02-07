<%@page import="com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OSIServiceComSignLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OSIServiceComSign"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesAssignmentDetailinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesInsolventPersoninfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesApplicantinfoLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesApplication"%>
<%@page import="com.nbp.osi.service.document.upload.util.OSIServiceApplicationUtil"%>
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
<portlet:resourceURL var="uploadDocumentInOSIServiceFormUrl" id="/upload/document/osi/service"></portlet:resourceURL>
<%
	DLFolder supportingDocumentsSubFolderGeneric = null;
	List<DLFileEntry> dlFileEntriesGeneric = null;
	int counterOfDocuments = 1;
	String clickPaymentOption = "";
	List<DLFileEntry> fileEntryPaymentFile = null;
	OsiServicesAppPayment osiServiceAppPayment = null;
	FileEntry fileEntry = null;
	String fileUrl = "";
	String counterOfTrustee = "";
	OsiServicesTrusteeCompanyinfo companyinfo = null;
	
	DLFolder docAttachedStatement = null;
	List<DLFileEntry> attachedFileEntry = null;
	FileEntry attachDocFE=null;
	String feeRecipet="";
	String feeRecipetUrl="";
	String amountPaid="";
	int sizeOfYearlyAdd=0;
	Date applicantDate = null;
	long osiServiceApplicationId = 0;
	String doYouWantTo = "";
	String typeOfApplicant = "";
	String natureOfApplicant = "";
	String kindOfApplication = "";
	String currentStageName = "";
	String lastFormStep = "";
	String insolventPersonNature = "";
	String fileEntryTrusteeSign = "";
	String fileUrlTrustUnderSign = "";
	String fileUrlTrustSign = "";
	String fileUrlBreakDownSign = "";
	String checkBoxVal = "";
	OsiServicesApplicantinfo applicantinfo = null;
	OSIServiceCurrentStage currentStage = null;
	OsiServicesApplication osiServicesApplication = null;
	OsiServicesInsolventPersoninfo insolventPersoninfo = null;
	DLFolder supportingDoctrusteeUNderSignature = null;
	DLFolder supportingDoctrusteeBreakTrusteeSignature = null;
	DLFolder supportingDoctrusteeBreakAppSignature = null;
	DLFolder supportingDocumentFolder = null;
	DLFolder supportingSubDocumentFolder = null;
	DLFolder supportingDocSignature = null;
	DLFolder supportingDocInsolventSignature = null;
	DLFolder supportingDoctrusteeSignature = null;
	DLFolder supportingDocComTrusteeSignature = null;
	DLFolder supportingDocumentsParentFolder1 = null;
	DLFolder supportingDocumentsFolder1 = null;
	DLFolder supportingDocumentSubFolderManagment1 = null;
	List<DLFileEntry> fileEntry2 = null;
	FileEntry fileEntryualification =null;
	String qualificationForm = "";
	String ualificationUrl = "";
	DLFolder supportingDocFee = null;
	List<DLFileEntry> feeFileEntry = null;
	List<DLFileEntry> entrySignture = null;
	List<DLFileEntry> entryinsolventSignature = null;
	List<DLFileEntry> trusteeSign = null;
	List<DLFileEntry> trusteeUnderSign = null;
	List<DLFileEntry> breakDownAppSign = null;
	List<DLFileEntry> breakDownTrusteeSign = null;
	List<DLFileEntry> breakDownComTrusteeSign = null;
	FileEntry fileEntryBreakDownSign = null;
	FileEntry fileEntryApplicant = null;
	FileEntry fileEntryTrusteSign = null;
	FileEntry fileEntryTrusteUNderSign = null;
	FileEntry fileEntryBreakTrusteeDownSign = null;
	FileEntry fileEntryBreakTrusteeDownComSign = null;
	String fileUrlBreakTrusteeDownComSign = "";
	String fileUrlBreakTrusteeDownSign = "";
	String fileUrlApplicant = "";
	String paymentMethod = "";
	String amount="";
	String currency="";
	Date assignmentDate = null;
	FileEntry fileEntryInsolvent = null;
	String fileUrlInsolvent = "";
	String natureOfApplicantName = "";
	OsiServicesGeneralBenefitOfCreditorsinfo applicantGeneralinfo = null;
	OsiServicesAssignmentDetailinfo assignmentDetailinfo = null;
	Date indiDateOfBirth = null;
	Date indiDateOfEmployer = null;
	Date breakDownDate = null;
	Date breakDowntrusteeDate = null;
	OsiServicesTrusteeIndividualDetailinfo detailinfo = null;
	OsiServicesTrusteeIndividualQualificationinfo individualQualificationinfo = null;
	OsiServicesTrusteeDeclerationAndSignatureinfo declerationAndSignatureinfo = null;
	OsiServicesTrusteeLicenseBreakdowninfo breakdowninfo = null;
	List<OsiServicesTrusteeBreadDownAddinfo> addinfo = null;
	OSIServiceSupportingDocInd indiDocList=null;
	OSIServiceComSign comSign=null;
	HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
	if (Validator.isNotNull(ParamUtil.getLong(request, "osiServiceApplicationId"))) {
		osiServiceApplicationId = ParamUtil.getLong(request, "osiServiceApplicationId");
	} else if (Validator.isNotNull(httpServletRequest.getParameter("osiServiceApplicationId"))) {
		osiServiceApplicationId = Long.valueOf(httpServletRequest.getParameter("osiServiceApplicationId"));
	}
	if(Validator.isNotNull(httpServletRequest.getParameter("paymentMethod"))){
		paymentMethod = String.valueOf(httpServletRequest.getParameter("paymentMethod"));
	}
	if(Validator.isNotNull(httpServletRequest.getParameter("currency"))){
		currency = String.valueOf(httpServletRequest.getParameter("currency"));
	}
	if(Validator.isNotNull(httpServletRequest.getParameter("amount"))){
		amount = String.valueOf(httpServletRequest.getParameter("amount"));
	}

	try {
		osiServicesApplication = OsiServicesApplicationLocalServiceUtil
				.getOsiServicesApplication(osiServiceApplicationId);
	} catch (Exception e) {
	}
	try {
		currentStage = OSIServiceCurrentStageLocalServiceUtil.getOsiServiceCS_By_CI(osiServiceApplicationId);//--used for getting data through application Id
	} catch (Exception e) {
	}
	if (osiServiceApplicationId > 0) {
		if (osiServicesApplication != null) {
			doYouWantTo = osiServicesApplication.getDoYouWant();
		}
		if (typeOfApplicant != null) {
			typeOfApplicant = osiServicesApplication.getTypeOfApplicant();
		}
		if (natureOfApplicant != null) {
			natureOfApplicant = osiServicesApplication.getNatureOfApplicant();
		}
		if (kindOfApplication != null) {
			kindOfApplication = osiServicesApplication.getTypeOfTransaction();
		}
		if (currentStage != null) {
			currentStageName = currentStage.getCurrentStage();
			lastFormStep = currentStage.getLastFormDetailsStep();
		}
		try {
			applicantinfo = OsiServicesApplicantinfoLocalServiceUtil
					.getOsiServiceApplicantInfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		if (applicantinfo != null) {
			natureOfApplicantName = applicantinfo.getApplicantNature();
		}
		try {
			insolventPersoninfo = OsiServicesInsolventPersoninfoLocalServiceUtil
					.getOsiServicesInsolventPersoninfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		if (insolventPersoninfo != null) {
			insolventPersonNature = insolventPersoninfo.getInsolventPersonNature();
		}
		try {
			supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "OSI Services Supported Documents");
			
			supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentFolder.getFolderId(), String.valueOf(osiServiceApplicationId));
		} catch (Exception e) {
		}
		try {
			supportingDocSignature = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Signature General Benefit Creditors");
			entrySignture = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocSignature.getFolderId());
		} catch (Exception e) {
		}
		if (entrySignture != null) {
			for (DLFileEntry uploadedFile : entrySignture) {
				fileEntryApplicant = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlApplicant = DLURLHelperUtil.getDownloadURL(fileEntryApplicant,
						fileEntryApplicant.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
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
		
		try {
			supportingDocInsolventSignature = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Signature Assignment");
			entryinsolventSignature = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocInsolventSignature.getFolderId());
		} catch (Exception e) {
		}
		if (entryinsolventSignature != null) {
			for (DLFileEntry uploadedFile : entryinsolventSignature) {
				fileEntryInsolvent = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlInsolvent = DLURLHelperUtil.getDownloadURL(fileEntryInsolvent,
						fileEntryInsolvent.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try {
			applicantGeneralinfo = OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceUtil
					.getOsiServicesGeneralBenefitOfCreditorsinfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			assignmentDetailinfo = OsiServicesAssignmentDetailinfoLocalServiceUtil
					.getOsiServiceAssignmentInfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			osiServiceAppPayment = OsiServicesAppPaymentLocalServiceUtil.getOsiServiceAppPaymentById(osiServiceApplicationId);
			paymentMethod=osiServiceAppPayment.getPaymentMethod();
			amount=osiServiceAppPayment.getAmountPaid();
			currency=osiServiceAppPayment.getAmountCurrency();
		} catch (Exception e) {
		}
		try {
			supportingDocFee = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Fee Reciept");
			feeFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocFee.getFolderId());
		} catch (Exception e) {
		}
		try {
			supportingDocumentsSubFolderGeneric = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"OSI Services Generic Documents");
			dlFileEntriesGeneric = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsSubFolderGeneric.getFolderId());
		} catch (Exception e) {
		}
		try {
			supportingDoctrusteeSignature = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Signature Trustee Qualification");
			trusteeSign = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDoctrusteeSignature.getFolderId());
		} catch (Exception e) {
		}
		if (trusteeSign != null) {
			for (DLFileEntry uploadedFile : trusteeSign) {
				fileEntryTrusteSign = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlTrustSign = DLURLHelperUtil.getDownloadURL(fileEntryTrusteSign,
						fileEntryTrusteSign.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}

		try {
			supportingDoctrusteeUNderSignature = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Signature Trustee Undersigned");
			trusteeUnderSign = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDoctrusteeUNderSignature.getFolderId());
		} catch (Exception e) {
		}
		if (trusteeUnderSign != null) {
			for (DLFileEntry uploadedFile : trusteeUnderSign) {
				fileEntryTrusteUNderSign = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlTrustUnderSign = DLURLHelperUtil.getDownloadURL(fileEntryTrusteUNderSign,
						fileEntryTrusteUNderSign.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try {
			detailinfo = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil
					.getOsiServicesTrusteeIndividualDetailinfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			individualQualificationinfo = OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil
					.getOsiServicesTrusteeIndividualQualificationinfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			declerationAndSignatureinfo = OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil
					.getOsiServicesTrusteeDeclerationAndSignatureinfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			addinfo = OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil
					.getBreakDownAdd_By_Id(osiServiceApplicationId);
			sizeOfYearlyAdd=addinfo.size();
			counterOfTrustee=addinfo.get(addinfo.size()).getCounter();
		} catch (Exception e) {
		}
		try{
			indiDocList=OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServiceApplicationId);
		}catch (Exception e) {
		}
		try {
			breakdowninfo = OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil
					.getOsiServicesTrusteeLicenseBreakdowninfoById(osiServiceApplicationId);
		} catch (Exception e) {
		}
		try {
			supportingDoctrusteeBreakAppSignature = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Signature of Applicant");
			breakDownAppSign = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDoctrusteeBreakAppSignature.getFolderId());
		} catch (Exception e) {
		}
		if (breakDownAppSign != null) {
			for (DLFileEntry uploadedFile : breakDownAppSign) {
				fileEntryBreakDownSign = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlBreakDownSign = DLURLHelperUtil.getDownloadURL(fileEntryBreakDownSign,
						fileEntryBreakDownSign.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try {
			supportingDoctrusteeBreakTrusteeSignature = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Signature of Trustee");
			breakDownTrusteeSign = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDoctrusteeBreakTrusteeSignature.getFolderId());
		} catch (Exception e) {
		}
		if (breakDownTrusteeSign != null) {
			for (DLFileEntry uploadedFile : breakDownTrusteeSign) {
				fileEntryBreakTrusteeDownSign = DLAppLocalServiceUtil
						.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlBreakTrusteeDownSign = DLURLHelperUtil.getDownloadURL(fileEntryBreakTrusteeDownSign,
						fileEntryBreakTrusteeDownSign.getFileVersion(), themeDisplay, StringPool.BLANK, false,
						true);
			}
		}
		try {
			supportingDocComTrusteeSignature = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Signature Behalf of Corporation");
			breakDownComTrusteeSign = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocComTrusteeSignature.getFolderId());
		} catch (Exception e) {
		}
		if (breakDownComTrusteeSign != null) {
			for (DLFileEntry uploadedFile : breakDownComTrusteeSign) {
				fileEntryBreakTrusteeDownComSign = DLAppLocalServiceUtil
						.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlBreakTrusteeDownComSign = DLURLHelperUtil.getDownloadURL(
						fileEntryBreakTrusteeDownComSign, fileEntryBreakTrusteeDownComSign.getFileVersion(),
						themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try {
			companyinfo = OsiServicesTrusteeCompanyinfoLocalServiceUtil
					.getOsiServicesTrusteeCompanyinfoById(osiServiceApplicationId);
			checkBoxVal=companyinfo.getOtherCountry();
		} catch (Exception e) {
		}
		try {
			comSign = OSIServiceComSignLocalServiceUtil.getOsiServicesSignBy_Id(osiServiceApplicationId);
		} catch (Exception e) {
		}
	} 
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingSubDocumentFolder.getFolderId(), "qualification Form");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryualification = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			qualificationForm=fileEntryualification.getFileName();
			ualificationUrl=DLURLHelperUtil.getDownloadURL(fileEntryualification,
					fileEntryualification.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
%>
<script>
function uploadDocuments(fileID,folderName,url){
		osiServiceApplicationId = $("#osiServicesApplicationId").val();
		var fileID = fileID;
	    var fileInput = $("#" + fileID)[0]; // File input element
	    var fileLength = fileInput.files.length; // Count of selected files
	   var saveAndConCheck = $("#saveAndConCheck").val();
		
	    var fileData = fileLength > 0 ? fileID : "0";

	    $("#osiServicesFormPreviewFieldset .custom_loader").removeClass("hide");
	    $(".preview-section").addClass("hide");
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : fileID,
					url : '${uploadDocumentInOSIServiceFormUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>folderName" : folderName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>osiServiceApplicationId" : osiServiceApplicationId,
						"<portlet:namespace/>saveAndConCheck": saveAndConCheck,

					},
					success : function(data, status) {
						 $(".additionalDocPreviewOne, #additionalDocPreview").html("");
						 var parsedData = typeof data === "string" ? JSON.parse(data) : data;
						 if(folderName=="OSI Services Generic Documents"){
						  try{
		        	            var jsonArrayLength=parsedData.JSON_LENGTH;
		        	            var uniqueArray = parsedData.fileData;
		        	           var responseData = uniqueArray.filter((value, index, self) =>
		        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
		        	        );

		        	            }catch(error){}
		                	var counter = 1;
							$.each(responseData,function(key,entry){ 
								console.log("File name is - "+entry.fileName);
								console.log("File URL is - "+entry.downloadFileUrl);
								
									var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
				                    
				                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
				                    
				                    $('#additionalDocPreview').append(documentContainerPreview);		
				                    counter++; 
				                    $(".noAdditionalSupportingDoc").addClass("hide");
							});
						}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
							$.each(parsedData.fileData, function(index, entry) {
				        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
				        	    console.log(entry); // Log each entry in fileData
				        	    console.log(entry.fileName); // This should log "hello.pdf" for the first entry
				        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
				        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
				        	});}
						$("#osiServicesFormPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
					},
					error : function(data, status, e) {
					}
				});
	}
</script>