<%@ include file="/init.jsp" %>
<%@ include file="/ncra-wizard.jsp" %>
<portlet:resourceURL var="draftApplicationNcra" id="draft/Application/Ncra"/>
<portlet:resourceURL var="renewLicenseUrl" id="renewLicenseUrl"></portlet:resourceURL>
<portlet:resourceURL var="addNcraUploadDocumentUrl" id="add/ncra/upload/document/url"></portlet:resourceURL>
<portlet:resourceURL var="ncraDocumentDelete" id="ncra/document/delete"></portlet:resourceURL>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo"%>
<div class="modal fade commonsavepopup savecountinuePopup" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
            </div>
            <div class="modal-pic">
                <img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" />
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12">
                        <p class="modal-title f1">Application saved as draft</p>
                        <p class="modal-subtitle f2">Your application for NCRA Services has been correctly saved as draft.</p>
                        <p class="modal-info f2">
                            You will be able to continue your application process at any moment. You can find the draft
                            in
                            <a href="/group/guest/dashboard">your Dashboard:</a>
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="cards-wrapper">
                            <div class="row">
                                <div class="col-lg-5 d-flex justify-content-center">
                                    <div class="licence-box ml-2">
                                        <div class="left">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none">
												<path d="M164.667 157.737H55.3333C51.7087 157.737 48.2325 159.173 45.6695 161.729C43.1065 164.286 41.6667 167.753 41.6667 171.368C41.6667 174.984 43.1065 178.451 45.6695 181.007C48.2325 183.564 51.7087 185 55.3333 185H164.667C168.291 185 171.767 183.564 174.33 181.007C176.893 178.451 178.333 174.984 178.333 171.368C178.333 167.753 176.893 164.286 174.33 161.729C171.767 159.173 168.291 157.737 164.667 157.737ZM178.333 69.1311C174.709 69.1311 171.233 70.5673 168.67 73.1237C166.107 75.6802 164.667 79.1474 164.667 82.7628C164.668 83.6992 164.764 84.6332 164.954 85.5504L140.135 100.416L119.218 58.6893C121.251 56.8346 122.674 54.4106 123.301 51.735C123.928 49.0595 123.73 46.2574 122.733 43.6961C121.735 41.1348 119.985 38.934 117.712 37.3822C115.438 35.8304 112.748 35 109.993 35C107.238 35 104.548 35.8304 102.275 37.3822C100.001 38.934 98.2512 41.1348 97.2538 43.6961C96.2564 46.2574 96.0582 49.0595 96.6854 51.735C97.3125 54.4106 98.7357 56.8346 100.768 58.6893L79.865 100.416L55.0463 85.5504C55.2358 84.6332 55.332 83.6992 55.3333 82.7628C55.3333 80.0667 54.5318 77.4311 53.0301 75.1894C51.5284 72.9477 49.3939 71.2005 46.8967 70.1688C44.3994 69.137 41.6515 68.8671 39.0004 69.3931C36.3494 69.919 33.9142 71.2173 32.0029 73.1237C30.0916 75.0302 28.7899 77.4591 28.2626 80.1034C27.7353 82.7476 28.0059 85.4885 29.0403 87.9794C30.0747 90.4702 31.8264 92.5992 34.0739 94.097C36.3214 95.5949 38.9637 96.3944 41.6667 96.3944C41.9195 96.3944 42.1518 96.333 42.3978 96.3194L47.68 144.105H172.32L177.602 96.3194C177.848 96.3194 178.081 96.3944 178.333 96.3944C181.958 96.3944 185.434 94.9582 187.997 92.4018C190.56 89.8453 192 86.3781 192 82.7628C192 79.1474 190.56 75.6802 187.997 73.1237C185.434 70.5673 181.958 69.1311 178.333 69.1311Z" fill="#047247"></path>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">NCRA Services<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Staus
                                        </p>
                                        <a href="" class="draftlink f2" id="pop_status">Draft</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="footer-above-border"></div>
                    </div>
                </div>
            </div>
            <div class="modal-footer border-0 d-flex justify-content-between">
                <div><a href="/home" class="text-dark common-nav-links text-white popup-home hidePopup">
                        <span class="mr-2"><svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
                            </svg>
                        </span>Go back to the Homepage</a>
                </div>
                <div>
                    <a href="/group/guest/dashboard" data-senna-off="true" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
                        Continue to your dashboard<span class="ml-2">
                            <svg width="22" height="17" viewBox="0 0 22 17" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
                                    fill="#1B1917" />
                                <path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
                                    fill="#1B1917" />
                                <path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
                            </svg>

                        </span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
function nextTab(elem) {
	$(elem).parent().next()
			.find('a[data-toggle="tab"]').click();
}
$(".hidePopup").click(function () {
	$(".editWeighingDeviceDetailPopup").modal("hide");
});
function openSaveToDraftPopupNcra(){
	 $(".savecountinuePopup").modal("show");
	 draftNCRAForm();
	 currentWeighingFormToSave = $(".weighing-device-tab").find(".active span:nth-child(2)").text();
	 currentImportedFormToSave = $(".imported-petrol-tab").find(".active span:nth-child(2)").text();
	 if(currentWeighingFormToSave == "Applicant Details"){
		 applicantDetailsFormInfo(true);
	}else if(currentWeighingFormToSave == "Verification of Weighing Device"){
		addVerificationDeviceTableBox();
		weightDeviceDate();
	}
	if(currentImportedFormToSave == "Applicant Details"){
		petroInfo(true);
	}
	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	if(currentFieldSet == 'ncraFeePaymentFieldset'){
    	ncraCreditStatus();    	
    }
}
 $(document).ready(function(){
	continueApplicationForm();
});
//Save And Continue Functions
function continueApplicationForm(){
	var ncraApplicationId='<%=ncraApplicationId%>';
	if(ncraApplicationId > 0 ){
		showLastFormStep();
		showSelectedCategory();
		continueEditFormDetails();
		showPreviewInLastStage();
	}
}
function showLastFormStep(){
	
	var currentStage = "<%=currentStageName%>";
	$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
	    if($(this).text() == currentStage ){
	    	$(this).parents("li").addClass("active");
	    	$(this).parents("li").prevAll().removeClass("active");
	    	$(this).parents("li").prevAll().addClass("activated");
	    }
	});
	
	$( ".form-wizard fieldset" ).each( function( index, element ){
        if($(this).attr("name") == currentStage ){
	    	$(this).addClass("show");
	    	$(this).prevAll().removeClass("show");
    	}
	});
}
function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormDetailName%>";
	lastFormDetailsStep = $(".tab-pane.active").attr("id");
	$(".tab-content .tab-pane").each(function(index, element) {
		if ($(this).attr("id") == lastFormStep) {
			$(this).addClass("active");
			$(this).prevAll().removeClass("active");
			$(this).nextAll().removeClass("active");
		}
	});
	$(".tab-plus-wizard-left li a").each(
			function(index, element) {
				if ($(this).attr("href") == "#" + lastFormStep) {
					$(this).parents().prevAll("li").find("a").removeClass("active disabled");
					$(this).addClass("active");
					$(this).removeClass("disabled");
				}
			});
}
function showSelectedCategory(){
	applicationId = "<%=ncraApplicationId%>";
	currentStage = "<%=currentStageName%>";
	lastFormStep = "<%=lastFormDetailName%>";
	doYouWant="<%=doYouWant%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	sizeOfWeighDevice="<%=sizeOfWeighDevice%>";
	selectedFee="<%=selectedFee%>";
	$("#ncra-fee-payment-option-value").val(selectedFee);
	$("#ncra-verification-option-value").val(doYouWant);	
	$("#ncra-type-of-tenure-value").val(typeOfTransaction);
	$("#ncraApplicationId").val(applicationId);
	if(doYouWant!= ""){
		$("#ncra-verification-option-box .wizard-title").each( function( index, element ){
		    if($(this).text() == doYouWant ){
		    	$(this).parents(".wizard-card").addClass("active");
		    }
		});
	}
	if(typeOfTransaction!= ""){
		$("#ncra-type-option-box .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfTransaction ){
		    	$(this).parents(".wizard-card").addClass("active");
		    }
		});
	}
	if(sizeOfWeighDevice>0){
		$(".addVerificationDeviceTableBox").removeClass("hide");
	}
	if(doYouWant=="Weighing Device"){
		$(".weighing-device-tab, .weighing-device-forms, .credit-type, .weighing-device-forms-pre").removeClass("hide");
		$(".imported-petrol-tab, .imported-petrol-forms, .imported-petrol-forms-pre").addClass("hide");
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
		$(".verification-type").html("Weighing Device Verification");
		$(".supporting-doc-preview").removeClass("hide");
		$(".fee-payment-preview").removeClass("hide");
	}else{
		$(".weighing-device-tab, .weighing-device-forms, .credit-type, .weighing-device-forms-pre").addClass("hide");
		$(".imported-petrol-tab, .imported-petrol-forms, .imported-petrol-forms-pre").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
		$(".verification-type").html("Imported Petrol Verification");
		$(".supporting-doc-preview").removeClass("hide");
	}
	/* if(doYouWant=="Weighing Device"){
		$(".weighing-device-tab").removeClass("hide");
		$(".weighing-device-forms-pre").removeClass("hide");
		$(".weighing-device-tab").removeClass("hide");
		$(".weighing-device-forms").removeClass("hide");
		$("#credit-box").removeClass("hide");
	}else{
		$(".imported-petrol-tab").removeClass("hide");
		$(".supporting-doc-preview").removeClass("hide");
		$(".imported-petrol-forms-pre").removeClass("hide");
		$(".imported-petrol-tab").removeClass("hide");
		$(".imported-petrol-forms").removeClass("hide");
		$(".credit-type").addClass("hide");
	} */
	getDocumentList();
	
}
function draftNCRAForm(){
	typeOfTransaction=$("#ncra-type-of-tenure-value").val();
	verificationOption=$("#ncra-verification-option-value").val();
	ncraApplicationId=$("#ncraApplicationId").val();
	currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	lastFormDetailsStep = $(".tab-pane.active").attr("id");
	$.ajax({
		type : "POST",
		url : "${draftApplicationNcra}",
		data : {
			"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
			"<portlet:namespace/>verificationOption" : verificationOption,
			"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
			"<portlet:namespace/>currentStage" : currentStage,
			"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
		},
		success : function(data) {
		var result = data.APP_DATA;
			$("#pop_category").html(result["category"]);
			$("#pop_status").html(result["appStatus"]);
			$("#pop_app_no").html(result["applicationNumner"]); 
		},
		error : function(data) {

		}
	});
}
function showPreviewInLastStage(){
 	previewWeighingApplicantDetailInfo();
	previewWeighingDeviceDetailInfo();
	previewApplicantDetailInfo();
	}
function renewLicense() {
	$("#fire-renew-btn").attr("disabled", "disabled");
    $("#renewLicenseNumbervalidation").addClass("hide"); 
    licenseNumber = $("#renew-licence-number").val();
    permitNumber = $("#renew-permit-number").val();
    $.ajax({
            type: "POST",
            url: '${renewLicenseUrl}',
            data: {
                    "<portlet:namespace/>licenseNumber": licenseNumber,
                    "<portlet:namespace/>permitNumber": permitNumber,
            },
            success: function(data) {
            	var result = data.APP_DATA;
            	var checkLicenseNumber=result["licenseNumberCheck"];
            	var renewLicenseUrl=result["renewLicenseUrl"];
                    if (checkLicenseNumber == 0) {
                             $("#renewLicenseNumbervalidation").removeClass("hide");
                             $("#fire-renew-btn").attr("disabled", "disabled"); 
                    }else{
                    	window.location.href = renewLicenseUrl;
                    	
                    }
            },
            error: function(data) {}
    });
}function openDocumentUploadPopup(counterVal, documentName) {
	$("#<portlet:namespace/>documentNumber").val("");
	$("#<portlet:namespace/>issueDate").val("");
	$("#<portlet:namespace/>expiryDate").val("");
	$("#ncraEnrollDocuments").val("");
	$('.custom-file-label').html('Choose File');
	$("#ncraDocumentCounter").val(counterVal);
	$("#<portlet:namespace/>documentName").val(documentName);
	$("#commonuploadpopup").modal("show");
}

function uploadDocumentInNcra() {
	var documentNumber = $("#<portlet:namespace/>documentNumber").val();
	var issueDate = $("#<portlet:namespace/>issueDate").val();
	var expiryDate = $("#<portlet:namespace/>expiryDate").val();
	var enrollDocuments = $(
			"#<portlet:namespace/>ncraEnrollDocuments").val();
	var documentuploadCounter = $("#ncraDocumentCounter").val();
	var fileID = 'ncraEnrollDocuments';
	var documentName = $("#<portlet:namespace/>documentName").val();
	$("#commonuploadpopup").modal("hide");
	$('.hidden' + documentuploadCounter).removeClass('hide');
	var progress = document.getElementById('progress'
			+ documentuploadCounter);
	progress.ariaValueNow = 50;
	progress.style.width = '50%';
	ncraApplicationId=$("#ncraApplicationId").val();
	$
			.ajaxFileUpload({
				secureuri : false,
				method : "POST",
				fileElementId : 'ncraEnrollDocuments',
				url : '${addNcraUploadDocumentUrl}',
				dataType : 'text',
				data : {
					"<portlet:namespace/>documentNumber" : documentNumber,
					"<portlet:namespace/>fileID" : fileID,
					"<portlet:namespace/>command" : "fileUpload",
					"<portlet:namespace/>issueDate" : issueDate,
					"<portlet:namespace/>expiryDate" : expiryDate,
					"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
					"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
					"<portlet:namespace/>documentName" : documentName,
				},
				success : function(data, status) {
					var progress = document.getElementById('progress'
							+ documentuploadCounter);
					progress.ariaValueNow = 100;
					progress.style.width = '100%';
					$('.hidden' + documentuploadCounter).addClass('hide');
					$("#uploadedFormResult" + documentuploadCounter).html(
							data);
					$(
							"#<portlet:namespace/>uploaded-documents"
									+ documentuploadCounter).hide();
					$(".uploaded-info").removeClass("hide");
					if (data != "") {
						$("#documentUpload" + documentuploadCounter)
								.addClass("disabled");
					}
					filledDocument = $(".supporting-document-card").find(
							".uploaded-info").length;
					 console.log("numberOfDocument is "+numberOfDocument+" and filledDocument------- "+filledDocument);
		            if(numberOfDocument == filledDocument){
		            	$("#ncraSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		            }	
				},
				error : function(data, status, e) {
				}
			});
}
function opendelNcraDocPopup(fileEntryId,documentCounter){
	  $("#ncraDocumentCounter").val(documentCounter);
	  $("#ncraDeletepopup"+fileEntryId).modal("show");
}

function deleteNcraUploadedDocument(fileEntryId) {
	documentuploadCounter = $("#ncraDocumentCounter").val();
  $.ajax({
      type: "POST",
      url: '${ncraDocumentDelete}',
      data: {
          "<portlet:namespace/>fileEntryId": fileEntryId,
      },
      success: function (data) {
          $("#ncraDeletepopup"+fileEntryId).modal("hide");
          $("#unpload-info-card"+fileEntryId).remove();
          $("#documentUpload"+documentuploadCounter).removeClass("disabled");
		  var requiredDoc = $("div[id='requiredDoc']").length;
		  var notRequireDoc = $("div[id='notRequiredDoc']").length;
	      if(requiredDoc >= 1){
	      if(documentuploadCounter <= requiredDoc){
				$("#requireDocNamePreview" + documentuploadCounter).html("");
				filledDocument = filledDocument -1;
				$("#ncraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			}
			}
			if(notRequireDoc > 0){
				$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
			}
      },
      error: function (data) {

      }
  });
}

function deleteNcraUploadedDocumentForGeneric(fileEntryId) {
	documentuploadCounter = $("#ncraDocumentCounter").val();
  $.ajax({
      type: "POST",
      url: '${ncraDocumentDelete}',
      data: {
          "<portlet:namespace/>fileEntryId": fileEntryId,
      },
      success: function (data) {
          $("#ncraDeletepopup"+fileEntryId).modal("hide");
          $("#unpload-info-card"+fileEntryId).remove();
          $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
      },
      error: function (data) {

      }
  });
}
/* $("input[name='manufacturing-company-involved']").change(function(){
	var companyInvolvedInExport=$("input[name='manufacturing-company-involved']:checked").val();
	if(companyInvolvedInExport=="Yes"){
		$("#manufacturing-export-quantity").prop("disabled", false);
		$("#manufacturing-export-monetary").prop("disabled", false);
		$("#manufacturing-export-monetary").prop("disabled", false);
	}else if(companyInvolvedInExport=="No"){
		$("#manufacturing-export-quantity").prop("disabled", true);
		$("#manufacturing-export-monetary").prop("disabled", true);
		$("#manufacturing-export-monetary").prop("disabled", true);
	}
}); */
</script>