<portlet:resourceURL var="pendingNcraApplication" id="/pending/ncra/application"></portlet:resourceURL>
<portlet:resourceURL var="gettingDocumentList" id="/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="ncraFormSubmit" id="/ncra/submit"></portlet:resourceURL>
<portlet:resourceURL var="applicantDetailInfo" id="applicant/detail/info"/>
<portlet:resourceURL var="paymentNcra" id="/payment/Ncra"/>
<portlet:resourceURL id="/ncra/download/Pdf" var="ncraDownloadPdfUrl"></portlet:resourceURL>
<portlet:resourceURL id="delete/Row/Table/Weigh/Device" var="deleteRowTableWeighDevice"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for</p>
							<p class="common-banner-title f1 mb-0">NCRA(Verification of Scales And Petrol)</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support" class="common-banner-transparent-link f2 d-inline-block">
								Need help in your application?  
								<span class="ml-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20" fill="none">
										<path d="M10 0C4.48 0 0 4.48 0 10C0 15.52 4.48 20 10 20C15.52 20 20 15.52 20 10C20 4.48 15.52 0 10 0ZM17.46 7.12L14.68 8.27C14.17 6.91 13.1 5.83 11.73 5.33L12.88 2.55C14.98 3.35 16.65 5.02 17.46 7.12ZM10 13C8.34 13 7 11.66 7 10C7 8.34 8.34 7 10 7C11.66 7 13 8.34 13 10C13 11.66 11.66 13 10 13ZM7.13 2.54L8.3 5.32C6.92 5.82 5.83 6.91 5.32 8.29L2.54 7.13C3.35 5.02 5.02 3.35 7.13 2.54ZM2.54 12.87L5.32 11.72C5.83 13.1 6.91 14.18 8.29 14.68L7.12 17.46C5.02 16.65 3.35 14.98 2.54 12.87ZM12.88 17.46L11.73 14.68C13.1 14.17 14.18 13.09 14.68 11.71L17.46 12.88C16.65 14.98 14.98 16.65 12.88 17.46Z" fill="#FAD47F" />
									</svg>
							    </span> 
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="erros warning success">
		<div id="formError"></div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<div class="form-wizard">
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">VERIFICATION OPTION</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF TRANSACTION</p> <span></span>
								</li>
								<li class="form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING DOCUMENTS</p> <span></span>
								</li>
								<li class="rm fee-payment">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES PAYMENT</p> <span></span>
								</li>
								  <li style="display:none" class="last-step">
				                    <p class="application-form-upper-title">Please Verify</p>
									<p class="application-form-lower-heading">NCRA SERVICES FORM PREVIEW</p> <span></span>
				                  </li> 
							</ul>
							<input type="hidden" id="ncraApplicationId"
								name="ncraApplicationId"> 
							<input type="hidden" id="checkPdfDownloadWithoutDocument"
								name="checkPdfDownloadWithoutDocument" value="true">
								<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=ncraApplicationId%>">
						</div>
						<%@ include file="/verification-options/ncra-verification-options.jsp"%>
 						<%@ include file="/type-of-transaction/ncra-transaction-type.jsp"%>
 						<%@ include file="/forms/ncra-form-tabs.jsp"%>
 						<%@ include file="/supporting-documents/ncra-documents.jsp"%>
 						<%@ include file="/ncra-fee-payment.jsp"%>
 						<%@ include file="/preview/final-preview-tabs.jsp"%>
 						<%@ include file="/ncra-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var filledDocument = "";
var numberOfDocument = "";
var docList = 1;
$("#ncra-verification-option-box .wizard-card").click(function(){
	$("#ncra-verification-option-box .wizard-card").removeClass("active");
	$(".application-type-card-content").children().children().removeClass("text-white");
	$(this).addClass("active");
	$(this).find(".application-type-card-content").children().children().addClass("text-white");
	$("#ncra-type-option-box .wizard-card").removeClass("active");
	$("#ncraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#ncraRenewSection").addClass("hide");
	$("#ncra-verification-option-value").val($(this).find(".wizard-title span").html());
	if($("#ncra-verification-option-value").val() == 'Weighing Device'){
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
		$(".fee-payment-preview").addClass("hide");
	}
});

$("#ncraNewBtn").click(function(){
	/* $("#ncra-type-option-box .wizard-card").removeClass("active");
	$(this).addClass("active"); */
	$("#ncraTransactionFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#ncraRenewSection").addClass("hide");
});
$("#ncraRenewBtn").click(function(){
	/* $("#ncra-type-option-box .wizard-card").removeClass("active");
	$(this).addClass("active"); */
	$("#ncraRenewSection").removeClass("hide");
});

$("#ncra-type-option-box .wizard-card").click(function(){
	$("#ncra-type-option-box .wizard-card").removeClass("active");
	$(this).addClass("active");
});

	
$(".credit-type .wizard-card").click(function(){
	$(".credit-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#ncra-fee-payment-option-value").val($(this).find(".wizard-title").html()); 
	
});
var weighingDeviceDocRenderCount = 1;
var importedPetrolDocRenderCount = 1;
var type=$("#ncra-verification-option-value").val();
var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    
    /* Scroll Page to top */
    scrollToPageTop();
    
    var typeOfVerification=$("#ncra-verification-option-value").val();
    if(currentFieldSet == 'ncraTransactionFieldset'){
    	pendingNCRAForm();
    	if(docList == 1){
    		getDocumentList();
    	}
    	docList++;
    	activeSelectForm();
    	if($("#ncra-verification-option-value").val() == 'Weighing Device'){
    		applicantBusinessName = $("#applicant-business-name").val();
    		applicantEmailAddr = $("#applicant-email-addr").val();
    		if(!applicantBusinessName && !applicantEmailAddr){
    			$("#ncraformsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    		}else{
    			$("#ncraformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
    		}
    	}else{
    		applicantBusinessName = $("#importedbusinessname").val();
    		applicantEmailAddr = $("#imported-applicant-email-addr").val();
    		if(!applicantBusinessName && !applicantEmailAddr){
    			$("#ncraformsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    		}else{
    			$("#ncraformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
    		}
    	}
    	
    }
    if(currentFieldSet == 'ncraSupportingDocumentFieldset'){
    	ncraGenericDocuments("Generic Documents");
    	pendingNCRAForm();
    }
    if(currentFieldSet == 'ncraformsFieldset'){
    	currentWeighingFormToSave = $(".weighing-device-tab").find(".active span:nth-child(2)").text();
    	 if(currentWeighingFormToSave == "Verification of Weighing Device"){
    			addVerificationDeviceTableBox();
    		}
	   var type=$("#ncra-verification-option-value").val();    	
    	if(type== 'Imported Petrol Sample'){
    	petroInfo();
    	}
    	weightDeviceDate();
    	pendingNCRAForm();
    	var requiredDoc = $("div[id='requiredDoc']").length;
    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
    	if(requiredDoc >= 1){
    		$(".mandatory-doc-heading").removeClass("hide");
    		numberOfDocument = requiredDoc;
    		if(numberOfDocument != filledDocument){
        		$("#ncraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        	}
    	}
    	
    }
    if(currentFieldSet == 'ncraFeePaymentFieldset'){
    	showFinalSubmitButton();
    	finalPreviewScroll();
    	previewWeighingApplicantDetailInfo();
    	previewWeighingDeviceDetailInfo();
    	previewApplicantDetailInfo();
    	downloadPDF();
    	pendingNCRAForm(); 
    	ncraCreditStatus();
    	feeMethodPreview = $("#ncra-fee-payment-option-value").val();
    	$(".fee-method-preview").html(feeMethodPreview);
    }
    if(currentFieldSet == "ncraSupportingDocumentFieldset"){
    	if($("#ncra-verification-option-value").val() == 'Weighing Device'){
    		showDocsPreview(weighingDeviceDocRenderCount);
    		weighingDeviceDocRenderCount++;
    	}else{
    		showDocsPreview(importedPetrolDocRenderCount);
    		importedPetrolDocRenderCount++;
    	}
		pendingNCRAForm();
    }
    if (nextWizardStep== true) {
      next.parents('.wizard-fieldset').removeClass("show", "400");
      currentActiveStep.removeClass('active').addClass('activated').next().addClass('active', "400");
      next.parents('.wizard-fieldset').next('.wizard-fieldset').addClass("show", "400");
      jQuery(document).find('.wizard-fieldset').each(function () {
        if (jQuery(this).hasClass('show')) {
          var formAtrr = jQuery(this).attr('data-tab-content');
          jQuery(document).find('.form-wizard-steps .form-wizard-step-item').each(function () {
            if (jQuery(this).attr('data-attr') == formAtrr) {
              jQuery(this).addClass('active');
              var innerWidth = jQuery(this).innerWidth();
              var position = jQuery(this).position();
              jQuery(document).find('.form-wizard-step-move').css({ "left": position.left, "width": innerWidth });
            } else {
              jQuery(this).removeClass('active');
            }
          });
        }
      });
    }
    });
  //click on previous button
  jQuery('.form-wizard-previous-btn').click(function () {
	scrollToPageTop();
    var counter = parseInt(jQuery(".wizard-counter").text());;
    var prev = jQuery(this);
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    
    $(".form-wizard-next-btn ").show();
   	$(".final-submit").addClass("hide");
   	$(".final-submit-container").addClass("hide");
   	
    prev.parents('.wizard-fieldset').removeClass("show", "400");
    prev.parents('.wizard-fieldset').prev('.wizard-fieldset').addClass("show", "400");
    currentActiveStep.removeClass('active').prev().removeClass('activated').addClass('active', "400");
    jQuery(document).find('.wizard-fieldset').each(function () {
      if (jQuery(this).hasClass('show')) {
        var formAtrr = jQuery(this).attr('data-tab-content');
        jQuery(document).find('.form-wizard-steps .form-wizard-step-item').each(function () {
          if (jQuery(this).attr('data-attr') == formAtrr) {
            jQuery(this).addClass('active');
            var innerWidth = jQuery(this).innerWidth();
            var position = jQuery(this).position();
            jQuery(document).find('.form-wizard-step-move').css({ "left": position.left, "width": innerWidth });
          } else {
            jQuery(this).removeClass('active');
          }
        });
      }
    });
    $(".form-wizard-save-btn").show();
    $(".final-submit").addClass("hide");
    $(".form-wizard-next-btn").show();
  });

//Initialize tooltips
    $('.nav-tabs > li a[title]').tooltip(); 
	//Wizard
	$('a[data-toggle="tab"]').on('show.bs.tab',
			function(e) {
				var $target = $(e.target);
				if ($target.parent().hasClass('disabled')) {
					return false;
				}
			});

	  /* $(".next-step").click(
			function(e) {
				$("#AcqurieformsFieldset").find(".tab-pane.active").next(".tab-pane").find(".tab-form-title").each(function () {
					selectedFormsToSave.push($(this).html());
			    });
				var $active = $('.nav-tabs li>.active');
				$active.parent().next().find('.nav-link')
						.removeClass('disabled');
				nextTab($active);
			});   */
	
	$(".prev-step").click(function(e) {
		var $active = $('.nav-tabs li>a.active');
		prevTab($active);
	});

	/* function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();

	} */
	function prevTab(elem) {
		$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

	}
});
function showFinalSubmitButton(){
	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	if(currentFieldSet == "ncraFeePaymentFieldset" || currentFieldSet == "ncraFormPreviewFieldset"){
        	$(".form-wizard-next-btn ").hide();
        	$(".form-wizard-save-btn").hide();
        	$(".final-submit").removeClass("hide");
        }else{
        	$(".form-wizard-next-btn").show();
        	$(".form-wizard-save-btn").show();
        	$(".final-submit").addClass("hide");
        }
}
function expandDetails(id) {
	var currentIsActive = $("#" + id).hasClass('is-active');
	$("#" + id).removeClass('is-active');
	$("#" + id).next('.accordion__body').removeClass('is-active');
	if (currentIsActive != 1) {
		$("#" + id).addClass('is-active');
		$("#" + id).next('.accordion__body').addClass('is-active');
	}
}
function finalSubmitNcraApp(){
	 $(".final-submit-container").removeClass("hide");	
	 submitOsiService();
}
	$("#weighing-device-edit-tab").click(function(){
	   $('#ncraFormPreviewFieldset').removeClass("show");
	   $('#ncraformsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#weighing-device-tab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
	$("#weighing-verification-device-edit-tab").click(function(){
	   $('#ncraFormPreviewFieldset').removeClass("show");
	   $('#ncraformsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#weighing-verification-device-tab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
	$("#imported-petrol-pre-edit-tab").click(function(){
	   $('#ncraFormPreviewFieldset').removeClass("show");
	   $('#ncraformsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#imported-petrol-pre-tab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
	$("#supporting-doc-edit-tab").click(function(){
	   $('#ncraFormPreviewFieldset').removeClass("show");
	   $('#ncraSupportingDocumentFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
       $(".final-submit").addClass("hide");
       $(".final-submit-container").addClass("hide");
       $(".supporting-documents").addClass("active");
       $(".rm, .supporting-documents").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
   });
	$("#fee-payment-edit-tab").click(function(){
	   $('#ncraFormPreviewFieldset').removeClass("show");
	   $('#ncraFeePaymentFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
       $(".final-submit").addClass("hide");
       $(".final-submit-container").addClass("hide");
       $(".fee-payment").addClass("active");
       $(".rm, .fee-payment").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
   });
	$("#ncra-verification-option-box  .wizard-card").click(function () {
		  $("#ncra-verification-option-value").val(
				  $(this).find(".application-type-card-title span").html()
		  );
		});
	$("#ncra-type-option-box a").click(function () {
		  $("#ncra-type-of-tenure-value").val(
		    $(this).find(".wizard-title").html()
		  );
		});
	$("#ncra-verification-option-box  .wizard-card").click(function () {
		  $("#ncra-verification-option-value").val(
				  $(this).find(".application-type-card-title span").html()
		  );
		});
	function pendingNCRAForm(){
		typeOfTransaction=$("#ncra-type-of-tenure-value").val();
		verificationOption=$("#ncra-verification-option-value").val();
		ncraApplicationId=$("#ncraApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		$.ajax({
			type : "POST",
			url : "${pendingNcraApplication}",
			data : {
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>verificationOption" : verificationOption,
				"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
				"<portlet:namespace/>currentStage" : currentStage,
				"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
			},
			success : function(data) {
			var result = data.APP_DATA;
				$("#ncraApplicationId").val(result["ncraApplicationId"]);
			/* 	if(draft=="true"){
				$("#pop_category").val(result["category"]);
				$("#pop_status").val(result["appStatus"]);
				$("#pop_app_no").val(result["applicationNumner"]); 
				} */
			},
			error : function(data) {

			}
		});
	}
	function getDocumentList(){
		typeOfTransaction=$("#ncra-type-of-tenure-value").val();
		verificationOption=$("#ncra-verification-option-value").val();
		ncraApplicationId=$("#ncraApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${gettingDocumentList}",
			data : {
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>verificationOption" : verificationOption,
				"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
			},
			success : function(data) {
				$("#documentList").html(data);
				var ncraApplicationId = '<%=ncraApplicationId%>';
				if (ncraApplicationId > 0) {
						numberOfDocument = $("div[id='requiredDoc']").length;
						filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;

						if (numberOfDocument != filledDocument) {
							$("#ogtSupportingDocumentFieldset #save-continue").css({
								"opacity": "0.4", 
								"pointer-events": "none", 
								"cursor": "default"
							});
						} else {
							$("#ogtSupportingDocumentFieldset #save-continue").css({
								"opacity": "1", 
								"pointer-events": "auto", 
								"cursor": "pointer"
							});
						}
				}
			},
			error : function(data) {
			},
		});
}
	$(document).ready(function () {
		debugger;
	    var selectedFiles = [];
	    var selectedGenericFiles = [];
	    console.log("selectedGenericFiles--------"+selectedGenericFiles);
	    function updateFileInput() {
	        var newFileList = new DataTransfer();
	        for (var i = 0; i < selectedFiles.length; i++) {
	            newFileList.items.add(selectedFiles[i]);
	        }
	        $('#ncraGenericUpload')[0].files = newFileList.files;
	    }
	    function renderPreview() {
	        $('#uploaded-documents-container').empty();
	        counterOfDocAfterSaveAndCon=1;
	        selectedFiles.forEach(function (file) {
	            var documentContainer = $('<div class="document-container"></div>');
	            var deleteButton = $(
	            		  '<a class="uploaded-delete mr-2" onClick="deleteAfterSaveConDoc(this.id);" id="deleteButton' +
	            		    counterOfDocAfterSaveAndCon +
	            		    '" href="#">' +
	            		    '<svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">' +
	            		    '<path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524"></path>' +
	            		    '</svg></a>'
	            		);
	            counterOfDocAfterSaveAndCon++;
	            documentContainer.append(deleteButton);
	            documentContainer.append('<span>' + file.name + '</span>');
	            $('#uploaded-documents-container').append(documentContainer);
	            
	        });
	    }

	    $('#uploaded-documents-container').on('click', '.uploaded-delete', function (e) {
	        e.preventDefault();
	        var fileNameToRemove = $(this).next('span').text();
	        selectedFiles = selectedFiles.filter(function (file) {
	            return file.name !== fileNameToRemove;
	        });
	        renderPreview(); // Re-render the preview after deletion
	        updateFileInput();
	    });

	    $(document).on('change', '#ncraGenericUpload', function () {
	        var files = $(this)[0].files;
	        var newFiles = [];
            console.log("newFiles-----------"+newFiles);
	        for (var i = 0; i < files.length; i++) {
	        	// Extract all generic document names as an array
	            var selectedGenericFiles = $(".generic-document-list")
	                .find("#document-name")
	                .map(function () {
	                    return $(this).html(); // Extract each name as a string
	                })
	                .get();

	            // Check if the current file exists in selectedGenericFiles
	            var genericFileExists = selectedGenericFiles.some(function (genericFile) {
	                return genericFile === files[i].name; 
	            });
	            
	            var fileExists = selectedFiles.some(function (file) {
	                return file.name === files[i].name;
	            });
	            var ncraApplicationId = "<%=ncraApplicationId%>";
	            console.log("ncraApplicationId-----------"+ncraApplicationId);
	        	if(ncraApplicationId > 0 ){
	        		if (!fileExists && !genericFileExists) {
	                    newFiles.push(files[i]);
	                }
	        	}else{
	        		if (!fileExists) {
	                    newFiles.push(files[i]);
	                }
	        	}
	        }
	        selectedFiles = selectedFiles.concat(newFiles); // Add new files to selected files
	        renderPreview(); // Render preview with all valid files
	        updateFileInput();
	        // Show or hide elements based on files
	        if (selectedFiles.length > 0) {
	            $('.uploaded-delete').show();
	            $(".noAdditionalSupportingDoc").hide();
	            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	            $("#ncraFormPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#ncraFormPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
	
	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	}
	function ncraCreditStatus(){
		creditStatus=$("#ncra-fee-payment-option-value").val();
		ncraApplicationId=$("#ncraApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${paymentNcra}",
			data : {
				"<portlet:namespace/>creditStatus" : creditStatus,
				"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
			},
			success : function(data) {
			},
			error : function(data) {

			}
		});
	}
	function activeSelectForm(){
		ncraCategory = $("#ncra-verification-option-value").val();
		if(ncraCategory == "Weighing Device"){
			$(".imported-petrol-forms .tab-pane").removeClass("active");
			$(".imported-petrol-tab .nav-link").removeClass("active");
			$(".weighing-device-forms .tab-pane").removeClass("active");
			$(".weighing-device-forms .tab-pane:first").addClass("active");
			$(".weighing-device-tab .nav-link").removeClass("active");
			$(".weighing-device-tab .nav-link:first").addClass("active");
		}
		if(ncraCategory == "Imported Petrol Sample"){
			$(".imported-petrol-forms .tab-pane").addClass("active");
			$(".imported-petrol-tab .nav-link").addClass("active");
			$(".weighing-device-forms .tab-pane").removeClass("active");
			$(".weighing-device-tab .nav-link").removeClass("active");
		}
	}
	
	/* Submit NCRA Form */
	function submitOsiService(){
		typeOfTransaction=$("#ncra-type-of-tenure-value").val();
		verificationOption=$("#ncra-verification-option-value").val();
		ncraApplicationId=$("#ncraApplicationId").val();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 $.ajax({
			    type: "POST",
			    url: "${ncraFormSubmit}",
			    data: {
			    	 "<portlet:namespace/>ncraApplicationId": ncraApplicationId,
			    	 "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	 "<portlet:namespace/>verificationOption": verificationOption,
			    	 "<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
			      		    },
			    success: function (data) {
			    	var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			    	if(appStatus=="submitted"){
			    		$("#continueDashboardNCRAStatus").removeClass("hide");
			    		$("#submitted-content").removeClass("hide");
			    		$("#application_submitted-img").removeClass("hide");
			    	}else{
			    		$("#draft-content").removeClass("hide");
			    		$("#application_draft-img").removeClass("hide");
			    	}
			    	$(".custom_loader").addClass("hide");
			    	$("#submit_pop_app_no").html(result["ncraAppNo"]);
				    $("#submit_pop_status").html(result["appStatus"]);
			        $("#ncraApplicationId").val(result["ncraApplicationId"]);
			        $("#submit_pop_category").html(result["categories"]);
			        $(".custom_loader").addClass("hide");
		    	},
			    error: function (data) {
			    },
			  });
		}
	function downloadPDF() {
		ncraApplicationId=$("#ncraApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${ncraDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>ncraApplicationId": ncraApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        $("#ncraDownloadPDF").attr("href", result["fileUrl"]);
                        $("#ncraDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                },
                error: function(data) {},
        });
    }
	
	function ncraGenericDocuments(folderName) {
		debugger;
		ncraApplicationId = $("#ncraApplicationId").val();
		var fileID = 'ncraGenericUpload';
		$.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'ncraGenericUpload',
					url : '${docUploadInNCRAFormUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>folderName" : folderName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
					},
					success: function (data) {
						debugger;
						 $(".additionalDocPreviewOne, #additionalDocPreview").html("");
				        	var parsedData = JSON.parse(data);
				        	 try{
				        		var parsedData = typeof data === "string" ? JSON.parse(data) : data;
			        	        var jsonArrayLength = parsedData.length
		        	            var responseData = parsedData.filter((value, index, self) =>
			        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
			        	        );}catch(error){}
			        	if (jsonArrayLength > 0){
		              	var counter = 1;
							$.each(responseData,function(key,entry){
								console.log(entry.fileName);
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
						}
		              $("#ncraFormPreviewFieldset .custom_loader").addClass("hide");
		              $(".preview-section").removeClass("hide");
		              $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		              
					},
					error: function (data, status, e) {
					}
				});
		}
	function petroInfo(isSaveAndContinue){
		    applicantBusinessName = $("#importedbusinessname").val();
			applicantAddress = $("#imported-address").val();
			applicantContact = $("#imported-applicant-contact").val();
			applicantTeleNum = $("#imported-applicant-tele-num").val();
			applicantFaxNo = $("#imported-fax-no").val();
			applicantEmailAddr = $("#imported-applicant-email-addr").val();
			applicantLocation = $("#imported-applicant-location").val();
			ncraApplicationId = $("#ncraApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${petrolInfo}",
				data : {
					"<portlet:namespace/>applicantBusinessName" : applicantBusinessName,
					"<portlet:namespace/>applicantAddress" : applicantAddress,
					"<portlet:namespace/>applicantContact" : applicantContact,
					"<portlet:namespace/>applicantTeleNum" : applicantTeleNum,
					"<portlet:namespace/>applicantFaxNo" : applicantFaxNo,
					"<portlet:namespace/>applicantEmailAddr" : applicantEmailAddr,
					"<portlet:namespace/>applicantLocation" : applicantLocation,
					"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
				},
				success : function(data) {
					if(!isSaveAndContinue){
						var $active = $('.nav-tabs li>.active');
						$active.parent().next().find('.nav-link').removeClass('disabled');
						$active.parent().next().find('.nav-link span').removeClass('gray');
						nextTab($active);
						const formSections = document.getElementsByClassName('form-wizard');
					    for (const formSection of formSections) {
						 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
						 }
					}
					$("#ncraformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				},
				error : function(data) {

				}
			});
	}
	function formatPhoneNumber(input) {
        // Remove non-numeric characters except "+", "-", and " "
        let formattedInput = input.value.replace(/[^\d\+\-\s]/g, '');
        // Remove any leading "+" if it exists
        formattedInput = formattedInput.replace(/^\+/, '');        
        // Apply the desired format
        if (formattedInput.length > 0) {
            formattedInput = "+" + formattedInput;
            if (formattedInput.length > 2 && formattedInput.charAt(2) !== " ") {
                formattedInput = formattedInput.substring(0, 2) + " " + formattedInput.substring(2);
            }
            if (formattedInput.length > 8 && formattedInput.charAt(8) !== "-") {
                formattedInput = formattedInput.substring(0, 8) + "-" + formattedInput.substring(8);
            }
            if (formattedInput.length > 13 && formattedInput.charAt(13) !== "-") {
                formattedInput = formattedInput.substring(0, 13) + "-" + formattedInput.substring(13);
            }
        }
        // Update the input value
        input.value = formattedInput;
    }
	/* $("#credit-box a").click(function () {
		  $("#ncra-fee-payment-option-value").val(
		    $(this).find(".wizard-title").html()
		  );
		}); */
	$(function() {
		$(document).on('change', '#ncraEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	function deleteRowFromTable(counter){
		weighDeviceInfoId=$("#weighingDevice"+counter).val();
        $.ajax({
                type: "POST",
                url: "${deleteRowTableWeighDevice}",
                data: {
                        "<portlet:namespace/>weighDeviceInfoId": weighDeviceInfoId,
                },
                success: function(data) {
                },
                error: function(data) {},
        });
    }
	function deleteAfterSaveConDoc(id){
	    var fileName = $("#"+id).next().html();
	    ncraApplicationId=$("#ncraApplicationId").val();
		saveAndCon='<%=ncraApplicationId%>';
		if(saveAndCon>0){
		 	 $.ajax({
			        type: "POST",
			        url: '${delteDocAferSaveconUrl}',
			        data: {
			            "<portlet:namespace/>fileName": fileName,
			            "<portlet:namespace/>ncraApplicationId": ncraApplicationId,
			        },
			        success: function (data) {
			        },
			        error: function (data) {
			        }
			    });	
			
		}
	}
</script>