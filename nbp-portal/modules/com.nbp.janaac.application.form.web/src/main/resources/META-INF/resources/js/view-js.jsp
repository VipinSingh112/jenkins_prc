<%@ include file="../init.jsp" %>
<script>
function pendingJanaacApplication() {
	typeOfAccreditation=$("#accreditationTypeVal").val();
	typeOFAccreditationService="";
	if(typeOfAccreditation=="Accreditation for Labs"){
		typeOFAccreditationService=$("#laboratoriesAccreditationVal").val();	
	} else if(typeOfAccreditation=="Accreditation for Certification Bodies"){
		typeOFAccreditationService=$("#certificationAccreditationVal").val();
	}
	 else if(typeOfAccreditation=="Accreditation for Inspection Bodies"){
		 typeOFAccreditationService=$("#inspectingAccreditationVal").val();
		}
	 else if(typeOfAccreditation=="FDA Approvals"){
		 typeOFAccreditationService=$("#thirdPartyAccreditationVal").val();
		}
	janaacTransactionType=$("#janaacTransactionTypeVal").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${pendingJanaacApplicationUrl}",
					data : {
						"<portlet:namespace/>typeOfAccreditation" : typeOfAccreditation,
						"<portlet:namespace/>typeOFAccreditationService" : typeOFAccreditationService,
						"<portlet:namespace/>janaacTransactionType" : janaacTransactionType,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
						async:false,
					success : function(data) {
						var result = data.APP_DATA;
				    	 $("#janaacApplicationId").val(result["janaacApplicationId"]);
					},
					error : function(data) {
					},
				});
 }
function uploadDocuments(fileID, folderName,url,applicationId,fileTitle){
	janaacApplicationId = $("#janaacApplicationId").val();
	 var fileID = fileID; 
	var fileInput = $("#" + fileID)[0]; // File input element
	    var fileLength = fileInput.files.length; // Count of selected files
	   var saveAndConCheck = $("#saveAndConCheck").val();
    var fileData = fileLength > 0 ? fileID : "0";
    $("#janaacFormPreviewFieldset .custom_loader").removeClass("hide");
    $(".preview-section").addClass("hide");
	$.ajaxFileUpload({
		secureuri : false,
		method : "POST",
		fileElementId : fileID,
		url : "${uloadFormDocumentUrl}",
		dataType : 'text',
		data : {
			"<portlet:namespace/>fileID" : fileID,
			"<portlet:namespace/>command" : "fileUpload",
			"<portlet:namespace/>folderName" : folderName,
			"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
			"<portlet:namespace/>saveAndConCheck": saveAndConCheck,
		},
		async : false,
		success : function(data, status) {
			  $(".additionalDocPreviewOne, #additionalDocPreview").html("");
			  var parsedData = typeof data === "string" ? JSON.parse(data) : data;
			  if(folderName=="Generic Documents"){
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
								var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
			                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
			                    $('#additionalDocPreview').append(documentContainerPreview);		
			                    counter++; 
			                    $(".noAdditionalSupportingDoc").addClass("hide");
						});}}else{
						$(".noAdditionalSupportingDoc").removeClass("hide");
						$.each(parsedData.fileData, function(index, entry) {
			        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
			        	    $("."+fileID).html(fileTitle); // Set file title
			        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
			        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
			        	});}
					$("#janaacFormPreviewFieldset .custom_loader").addClass("hide");
					$(".preview-section").removeClass("hide");
					$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		},
		error : function(data, status, e) {}
	});}
function janaacDeleteDocumentForGeneric(fileEntryId) {
	var documentuploadCounter = $("#documentuploadCounter").val();
	$.ajax({
		type : "POST",
		url : '${janaacDeleteDocumentUrl}',
		data : {
			"<portlet:namespace/>fileEntryId" : fileEntryId,
		},
		success : function(data) {
			$("#janaacDeletepopup" + fileEntryId).modal("hide");
			$("#unpload-info-card" + fileEntryId).remove();
		    $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
			$("#documentUpload" + documentuploadCounter).removeClass("disabled");
		},
		error : function(data) {
		}
	});
}
function submitJanaacApplication() {
	typeOfAccreditation=$("#accreditationTypeVal").val();
	typeOFAccreditationService="";
	if(typeOfAccreditation=="Accreditation for Labs"){
		typeOFAccreditationService=$("#laboratoriesAccreditationVal").val();	
	} else if(typeOfAccreditation=="Accreditation for Certification Bodies"){
		typeOFAccreditationService=$("#certificationAccreditationVal").val();
	}
	 else if(typeOfAccreditation=="Accreditation for Inspection Bodies"){
		 typeOFAccreditationService=$("#inspectingAccreditationVal").val();
		}
	 else if(typeOfAccreditation=="FDA Approvals"){
		 typeOFAccreditationService=$("#thirdPartyAccreditationVal").val();
		}
	janaacTransactionType=$("#janaacTransactionTypeVal").val();
	janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
					type : "POST",
					url : "${submitJanaacApplicationUrl}",
					data : {
						"<portlet:namespace/>typeOfAccreditation" : typeOfAccreditation,
						"<portlet:namespace/>typeOFAccreditationService" : typeOFAccreditationService,
						"<portlet:namespace/>janaacTransactionType" : janaacTransactionType,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						},
						async:false,
					success : function(data) {
						var result = data.APP_DATA;
			    		$("#submitted-content").removeClass("hide");
			    		$("#application_submitted-img").removeClass("hide");
			    		$("#continueDashboardJannac").removeClass("hide");
				    	$(".custom_loader").addClass("hide");
				    	$("#submit_pop_app_no").html(result["janaacAppNo"]);
					    $("#submit_pop_status").html(result["appStatus"]);
				        $("#submit_pop_category").html(result["category"]);
				       	$("#janaac-submitted-status").html(result["janaacSubmitStatus"]);
				        $("#janaac-submitted-status").html(result["janaacSubmitStatus"]);
				        $("#janaacApplicationId").val(result["janaacApplicationId"]);
					},
					error : function(data) {
					},
				});
 }
 function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#janaacEnrollDocuments").val("");
		$('.custom-file-label').html('Choose File');
		$("#documentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
		$("#commonuploadpopup").modal("show");
	}
 function uploadDocumentInJanaac() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var enrollDocuments = $("#<portlet:namespace/>janaacEnrollDocuments").val();
		var documentuploadCounter = $("#documentuploadCounter").val();
		var fileID = 'janaacEnrollDocuments';
		var documentName = $("#<portlet:namespace/>documentName").val();
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		janaacApplicationId = $("#janaacApplicationId").val();
		$.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'janaacEnrollDocuments',
					url : '${addJanaacUploadDocumentUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>documentName" : documentName,
					},
					success : function(data, status) {
						var progress = document.getElementById('progress'+ documentuploadCounter);
						progress.ariaValueNow = 100;
						progress.style.width = '100%';
						$('.hidden' + documentuploadCounter).addClass('hide');
						$("#uploadedFormResult" + documentuploadCounter).html(data);
						$("#<portlet:namespace/>uploaded-documents"+ documentuploadCounter).hide();
						$(".uploaded-info").removeClass("hide");
						if(data != ""){
			            $("#documentUpload"+documentuploadCounter).addClass("disabled");	
			            }
			            filledDocument = $(".supporting-document-card").find(".uploaded-info").length;
						if(numberOfDocument == filledDocument){
				        	$("#janaacSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				        }
					},
					error : function(data, status, e) {
					}
				});
	}
	function deleteUploadedDocument(fileEntryId) {
		documentuploadCounter = $("#documentuploadCounter").val();
	  $.ajax({
	      type: "POST",
	      url: '${deletedocumentUrl}',
	      data: {
	          "<portlet:namespace/>fileEntryId": fileEntryId,
	      },
	      success: function (data) {
	          $("#janaacDeletepopup"+fileEntryId).modal("hide");
	          $("#unpload-info-card"+fileEntryId).remove();
	          $("#documentUpload"+documentuploadCounter).removeClass("disabled");
	          var requiredDoc = $("div[id='requiredDoc']").length;
		      var notRequireDoc = $("div[id='notRequiredDoc']").length;
			  if(requiredDoc >= 1){
			   if(documentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + documentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#janaacSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
					}
				if(notRequireDoc >= 1){
					$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
				}
	      },
	      error: function (data) {

	      }
	  });
	}
	/* Wizard - Form categories js */
	$("#accreditationType .wizard-card").click(function(){
	$("#accreditationType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#accreditationTypeVal").val($(this).find(".wizard-title").html());
	accreditationType = $("#accreditationTypeVal").val();
	$(".accreditation-service-type").removeClass("hide");
	$(".accreditation-service-type .wizard-card").removeClass("active");
	$("#laboratoriesFeeIcon, #certificationFeeIcon, #inspectionFeeIcon, #thirdPartyFeeIcon").addClass("hide");
	if(accreditationType == "Accreditation for Labs"){
		$("#certificationAccreditation, #inspectingAccreditation, #thirdPartyAccreditation").addClass("hide");
		$("#laboratoriesAccreditation").removeClass("hide");
		$("#laboratoriesFeeIcon").removeClass("hide");
	}else if(accreditationType == "Accreditation for Certification Bodies"){
		$("#laboratoriesAccreditation, #inspectingAccreditation, #thirdPartyAccreditation").addClass("hide");
		$("#certificationAccreditation").removeClass("hide");
		$("#certificationFeeIcon").removeClass("hide");
	}else if(accreditationType == "Accreditation for Inspection Bodies"){
		$("#laboratoriesAccreditation, #certificationAccreditation, #thirdPartyAccreditation").addClass("hide");
		$("#inspectingAccreditation").removeClass("hide");
		$("#inspectionFeeIcon").removeClass("hide");
	}else if(accreditationType == "FDA Approvals"){
		$("#laboratoriesAccreditation, #certificationAccreditation, #inspectingAccreditation").addClass("hide");
		$("#thirdPartyAccreditation").removeClass("hide");
		$("#thirdPartyFeeIcon").removeClass("hide");
	}
	$(".laboratories-medical, .laboratories-testing, .laboratories-calibration, .laboratories-analyses").addClass("hide");
	$(".laboratories-medical-pre, .laboratories-testing-pre, .laboratories-calibration-pre, .laboratories-analyses-pre").addClass("hide");
	$(".certification-management, .certification-bodies, .certification-product").addClass("hide");
	$(".certification-management-pre, .certification-bodies-pre, .certification-product-pre").addClass("hide");
	$(".inspection-bodies").addClass("hide");
	$(".inspection-bodies-pre").addClass("hide");
	$(".third-party-cer").addClass("hide");
	$(".third-party-cer-pre").addClass("hide");
});
 $(".accreditation-service-type .wizard-card").click(function(){
	 $(".transaction-type .wizard-card").removeClass("active"); 
	 $(".form-wizard-save-btn, .form-wizard-next-btn").addClass("hide");
 });
 
$("#laboratoriesAccreditation .wizard-card").click(function(){
	$("#laboratoriesAccreditation .wizard-card").removeClass("active");
	$(this).addClass("active");
	$(".laboratories-medical, .laboratories-testing, .laboratories-calibration, .laboratories-analyses").addClass("hide");
	$(".laboratories-medical-pre, .laboratories-testing-pre, .laboratories-calibration-pre, .laboratories-analyses-pre").addClass("hide");
	$("#laboratoriesAccreditationVal").val($(this).find(".wizard-title").html());
	laboratoriesAccreditation = $("#laboratoriesAccreditationVal").val();	
	if(laboratoriesAccreditation == "Accreditation of Medical Labs to the ISO 15189 Standard"){
		$(".laboratories-medical, .laboratories-medical-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Medical Laboratories");
		$("#supportingDocStep").html("8");
		$("#feePaymentStep").html("9");
		docRenderCount = 1;
	}else if(laboratoriesAccreditation == "Accreditation of Testing Labs to the ISO/IEC 17025 Standard"){
		$(".laboratories-testing, .laboratories-testing-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Testing Labs");
		$("#supportingDocStep").html("7");
		$("#feePaymentStep").html("8");
		docRenderCount = 1;
	}else if(laboratoriesAccreditation == "Accreditation of Calibration Labs to the ISO/IEC 17025 Standard"){
		$(".laboratories-calibration, .laboratories-calibration-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Calibration Labs");
		$("#supportingDocStep").html("7");
		$("#feePaymentStep").html("8");
		docRenderCount = 1;
	}
});
$("#certificationAccreditation .wizard-card").click(function(){
	$("#certificationAccreditation .wizard-card").removeClass("active");
	$(this).addClass("active");
	$(".certification-management, .certification-bodies, .certification-product").addClass("hide");
	$(".certification-management-pre, .certification-bodies-pre, .certification-product-pre").addClass("hide");
	$("#certificationAccreditationVal").val($(this).find(".wizard-title").html());
	$("#supportingDocStep").html("8");
	$("#feePaymentStep").html("9");
	certificationAccreditation = $("#certificationAccreditationVal").val();
	if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
		$(".certification-management, .certification-management-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Certification Bodies-ISO/IEC 17021-1:2015");
		docRenderCount = 1;
	}else if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
		$(".certification-product, .certification-product-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Certification Bodies-ISO/IEC 17065:2012");
		docRenderCount = 1;
	}else if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
		$(".certification-bodies, .certification-bodies-pre").removeClass("hide");
		$("#payment_category").html("Accreditation of Certification Bodies-ISO/IEC 17024:2012");
		docRenderCount = 1;
	}  
});
$("#inspectingAccreditation .wizard-card").click(function(){
	$("#inspectingAccreditation .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#inspectingAccreditationVal").val($(this).find(".wizard-title").html());
	$(".inspection-bodies, .inspection-bodies-pre").removeClass("hide");
	$("#supportingDocStep").html("7");
	$("#feePaymentStep").html("8");
	docRenderCount = 1;
	$("#payment_category").html("Accreditation of Inspection Bodies");
});
$("#thirdPartyAccreditation .wizard-card").click(function(){
	$("#thirdPartyAccreditation .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#thirdPartyAccreditationVal").val($(this).find(".wizard-title").html());
	$(".third-party-cer, .third-party-cer-pre").addClass("hide");
	thirdPartyAccreditation = $("#thirdPartyAccreditationVal").val();
	if(thirdPartyAccreditation == "FDA TPP Accreditation of 3rd Party Certification Bodies Under the FDA-Food Safety Modernisation Act (FSMA)"){
		$(".third-party-cer, .third-party-cer-pre").removeClass("hide");
		$("#supportingDocStep").html("8");
		$("#feePaymentStep").html("9");
		docRenderCount = 1;
		$("#payment_category").html("Accreditation of 3rd Party Certification Bodies");
	}else if(thirdPartyAccreditation == "FDA Labs Accreditation for Analyses of Foods to (LAAF) Accreditation Scheme"){
		$(".laboratories-analyses, .laboratories-analyses-pre").removeClass("hide");
		$("#payment_category").html("FDA Labs Accreditation for Analyses of Foods");
		$("#supportingDocStep").html("");
		$("#feePaymentStep").html("");
		docRenderCount = 1;
	}
});
$(".transaction-type .wizard-card").click(function(){
	$(".transaction-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#janaacTransactionTypeVal").val($(this).find(".wizard-title").html());
	$(".form-wizard-save-btn, .form-wizard-next-btn").removeClass("hide");
});
</script>