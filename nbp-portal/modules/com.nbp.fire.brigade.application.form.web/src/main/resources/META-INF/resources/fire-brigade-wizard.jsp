<portlet:resourceURL var="fireBrigadePendingUrl" id="/fire/brigade/pending"></portlet:resourceURL>
<portlet:resourceURL id="recertification/Fb/License" var="recertificationFbLicenseUrl"></portlet:resourceURL>
<portlet:resourceURL id="/fire/brigade/download/Pdf" var="addFireBrigadeDownloadPdfUrl"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for
								Certificate</p>
							<!-- <p class="common-banner-title f1 mb-0">of Film Production Permit</p> -->
						</div>
						<div class="col-lg-4 text-right">
							<a href="#"
								class="common-banner-transparent-link f2 d-inline-block"><liferay-ui:message
									key="application-form-help" /> <span class="ml-2"> <svg
										xmlns="http://www.w3.org/2000/svg" width="20" height="20"
										viewBox="0 0 20 20" fill="none">
										<path
											d="M10 0C4.48 0 0 4.48 0 10C0 15.52 4.48 20 10 20C15.52 20 20 15.52 20 10C20 4.48 15.52 0 10 0ZM17.46 7.12L14.68 8.27C14.17 6.91 13.1 5.83 11.73 5.33L12.88 2.55C14.98 3.35 16.65 5.02 17.46 7.12ZM10 13C8.34 13 7 11.66 7 10C7 8.34 8.34 7 10 7C11.66 7 13 8.34 13 10C13 11.66 11.66 13 10 13ZM7.13 2.54L8.3 5.32C6.92 5.82 5.83 6.91 5.32 8.29L2.54 7.13C3.35 5.02 5.02 3.35 7.13 2.54ZM2.54 12.87L5.32 11.72C5.83 13.1 6.91 14.18 8.29 14.68L7.12 17.46C5.02 16.65 3.35 14.98 2.54 12.87ZM12.88 17.46L11.73 14.68C13.1 14.17 14.18 13.09 14.68 11.71L17.46 12.88C16.65 14.98 14.98 16.65 12.88 17.46Z"
											fill="#FAD47F" />
									</svg>
							</span> </a>
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
									<p class="application-form-lower-heading">FIRE BRIGADE CERTIFICATION</p> <span></span>
								</li>
								<li>
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">FIRE BRIGADE TRANSACTION TYPE</p> <span></span>
								</li>
								<li class="form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">Supporting Documents</p> <span></span>
								</li>
								<li class="rm fee-payment">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES
										PAYMENT</p> <span></span>
								</li>
								<li style="display: none" class="last-step">
									<p class="application-form-upper-title">Please Verify</p>
									<p class="application-form-lower-heading">Fire Brigade
										PREVIEW FORM</p> <span></span>
								</li>
							</ul>
							<input type="hidden" id="fireBrigadeApplicationId" name="fireBrigadeApplicationId">
						 	<input type="hidden" id="fireBrigadeCurrentStage" name="fireBrigadeCurrentStage"> 
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=fireBrigadeApplicationId%>">
						</div>
						<%@ include
							file="/type-of-certificate/fire-brigade-certificate-type.jsp"%>
						<%@ include
							file="/type-of-transaction/fire-brigade-transaction-type.jsp"%>
						<%@ include file="/forms/fire-brigade-form-tabs.jsp"%>
						<%@ include
							file="/supporting-documents/fire-brigade-documents.jsp"%>
						<%@ include file="/fire-brigade-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/fire-brigade-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>

$("#certificateType").on('click', function () {
    $("#applicationTypeVal").val("");
    var activeWizardTitle = $(this).find(".wizard-card.active .wizard-title").text();
    $("#applicationTypeVal").val(activeWizardTitle);
});
var filledDocument = "";
var numberOfDocument = "";
var currentFormToSave = "";
var firebrigadeDocCount=1;

$("#fireBrigadeRecertificationBtn").click(function(){
	$("#certificateType .wizard-card").removeClass("active");
    $(this).addClass("active");
	$("#fireRenewSection").removeClass("hide");
    $("#applicantTypeBox, #premisesTypeBox, #certificatePurposeBox").addClass("hide");
});

$("#fire-brigade-type-box .wizard-card").click(function(){
	$("#fire-brigade-type-box .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#certificateTypeVal").val($(this).find(".wizard-title").text());
    $("#fireBrigadeTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $("#certificateType .wizard-card").removeClass("active");
    $("#applicantTypeBox, #fireRenewSection, #premisesTypeBox, #certificatePurposeBox").addClass("hide");
    if($("#certificateTypeVal").val() == "Apply for a Fire Safety Certificate"){
    	$(".feeHeading, .declaration-by").html("Fire safety Certificate");
    }else{
    	$(".feeHeading, .declaration-by").html("Occupancy Certificate");
    }
    
});
$("#fireBrigadeNewApplicationBtn").click(function(){
	$("#certificateType .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#applicantTypeBox .wizard-card").removeClass("active");
    $("#applicantTypeBox").removeClass("hide");
    $("#fireRenewSection").addClass("hide");
    $("#premisesTypeBox, #certificatePurposeBox").addClass("hide");
    $("#fireBrigadeTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#applicantTypeBox .wizard-card").click(function(){
	$("#applicantTypeVal").val($(this).find(".wizard-title").text());
	$("#applicantTypeBox .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#premisesTypeBox .wizard-card").removeClass("active");
    $("#premisesTypeBox").removeClass("hide");
    $("#certificatePurposeBox").addClass("hide");
    $("#fireBrigadeTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#premisesTypeBox .wizard-card").click(function(){
	$("#premisesTypeVal").val($(this).find(".wizard-title").text());
	$("#premisesTypeBox .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#certificatePurposeBox .wizard-card").removeClass("active");
    $("#certificatePurposeBox").removeClass("hide");
    $("#fireBrigadeTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#certificatePurposeBox .wizard-card").click(function(){
	$("#certificatePurposeVal").val($(this).find(".wizard-title").text());
	$("#certificatePurposeBox .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#fireBrigadeTransactionFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
});
	 /* Fee Payment Method */

	$("#credit-card-method").click(function () {
	  $("#payment-method-wrapper").addClass("hide");
	  $("#credit-card-details").removeClass("hide");
	  $("#payment-method").removeClass("hide");
	  $("#payment-method span").html($(this).find(".wizard-title").html());
	});
	$("#direct-deposit-method, #bank-draft-method, #cash-method, #cheque-method, #other-method").click(function () {
	  $("#payment-method-wrapper").addClass("hide");
	  $("#payment-method").removeClass("hide");
	  $("#payment-method span").html($(this).find(".wizard-title").html());
	  $("#selected-payment-method").html($(this).find(".wizard-title").html());
	  $("#selected-payment-method-inner").html(
	    $(this).find(".wizard-title").html()
	  );
	  $("#all-other-payment-details").removeClass("hide");
	});
	$("#makePayment").click(function () {
	  $("#paymentPopUp").modal("show");
	});
	$("#choose-payment-method").click(function () {
		$("#payment-method").addClass("hide");
		$("#all-other-payment-details").addClass("hide");
		$("#credit-card-details").addClass("hide");
		$("#payment-method-wrapper").removeClass("hide");
	});
	
	$("#fire-brigade-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#fireBrigade-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #fireBrigade-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #fire-brigade-payment-upload").val('');
	    }
	});  
	
	$("select.payment-method").change(function(){
        var selectedMethod = $(this).children("option:selected").val(); 
        if (selectedMethod == "Other"){
        	$("#payment-method-other-option, #payment-method-other-option-pre").removeClass("hide");
        	$("#payment-proof-option, #payment-proof-option-pre").addClass("hide");
        }else{
        	$("#payment-method-other-option, #payment-method-other-option-pre").addClass("hide");
        	$("#payment-proof-option, #payment-proof-option-pre").removeClass("hide");
        }
 	});
	var docRenderCount = 1;
 var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function () {
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        
        /* Scroll Page to top */
        scrollToPageTop();
        
		if(currentFieldSet == "fireBrigadeTransactionFieldset"){
	    	pendingFireBrigadeApplication();
	    	
	    	operatorName = $("#operatorName").val();
	    	if(!operatorName){
	    		$("#fireBrigadeFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    	}else{
	    		$("#fireBrigadeFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	    	}
			if(firebrigadeDocCount==1){
 				 gettingDocumentList();
     		} 
 				firebrigadeDocCount++;
		
	    }   
		if(currentFieldSet == "fireBrigadeFormsFieldset"){
			pendingFireBrigadeApplication();
	    	addCertificatePurposeInfo(false);
	    	/* DOCUMENT VALIDATION */
			var requiredDoc = $("div[id='requiredDoc']").length;
			filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
			if(requiredDoc >= 1){
				$(".mandatory-doc-heading").removeClass("hide");
				numberOfDocument = requiredDoc;
				if(numberOfDocument != filledDocument){
					$("#fireBrigadeSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				}
			}
	    }
		
		if(currentFieldSet == "fireBrigadeSupportingDocumentFieldset"){
			uploadDocuments("fireBrigadeGenericUpload","Generic Documents","");			
			pendingFireBrigadeApplication();
	    }
        
		if(currentFieldSet == "fireBrigadeFeePaymentFieldset"){
			submitFeeDetailsInFireBrigade();
			downloadPDF();
			pendingFireBrigadeApplication();
			finalPreviewScroll();
        	showFinalSubmitButton();
        	previewSignatureInfo();
        	previewPremisesInfo();
        	previewOperatorInfo();
        	previewFloorStructureInfo();
        	previewFireProtectionInfo();
        	previewHazardousSubstanceInfo();
        	previewCertificatePurposeInfo();
        	$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());
        	uploadDocuments("fireBrigadeGenericUpload","Generic Documents","");		
        	showDocsPreview(docRenderCount);
			docRenderCount++;
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
					var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link').removeClass('disabled');
					$active.parent().next().find('.nav-link span').removeClass('gray');
					nextTab($active);
				});  */
		$(".prev-step").click(function(e) {
			var $active = $('.nav-tabs li>a.active');
			prevTab($active);
		});
		function nextTab(elem) {
			$(elem).parent().next()
					.find('a[data-toggle="tab"]').click();

		}
		function prevTab(elem) {
			$(elem).parent().prev()
					.find('a[data-toggle="tab"]').click();

		}
		});
    
    function showFinalSubmitButton(){
		var currentFieldSet = $(".wizard-fieldset.show").attr("id");
		 if(currentFieldSet == "fireBrigadeFeePaymentFieldset" || currentFieldSet == "fireBrigadeformPreviewFieldset"){
	        	$(".form-wizard-next-btn ").hide();
	        	$(".form-wizard-save-btn").hide();
	        	$(".final-submit").removeClass("hide");
	        }else{
	        	$(".form-wizard-next-btn").show();
	        	$(".form-wizard-save-btn").show();
	        	$(".final-submit").addClass("hide");
	        } 
	}
    function openFireBrigadeSaveToSubmitPopup(){
    	submitFireBrigade();
    	$(".final-submit-container").removeClass("hide");
    }
    $("#signature-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#signature-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
    $("#premises-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#premises-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
    $("#operator-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#operator-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
    $("#floor-structure-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#floor-structure-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
    $("#fire-protection-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#fire-protection-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
    $("#hazardous-substance-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#hazardous-substance-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
    $("#certificate-purpose-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#certificate-purpose-tab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
    $("#supporting-doc-edit-tab").click(function(){
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeSupportingDocumentFieldset').addClass("show", "400");
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
		   $('#fireBrigadeformPreviewFieldset').removeClass("show");
		   $('#fireBrigadeFeePaymentFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $(".fee-payment").addClass("active");
	       $(".fee-payment").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	function pendingFireBrigadeApplication(){
		 fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		 certificateType=$("#certificateTypeVal").val();
		 typeOfTransaction=$("#applicationTypeVal").val();
		 applicantType=$("#applicantTypeVal").val();
		 premisesType=$("#premisesTypeVal").val();
		 certificatePurpose=$("#certificatePurposeVal").val();
		 parish=$("#fireBrigadeParish").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		 $.ajax({
			    type: "POST",
			    url: "${fireBrigadePendingUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
			    	  "<portlet:namespace/>certificateType": certificateType,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>applicantType": applicantType,
			    	  "<portlet:namespace/>premisesType": premisesType,
			    	  "<portlet:namespace/>certificatePurpose": certificatePurpose,
			    	  "<portlet:namespace/>parish": parish,
			    	  "<portlet:namespace/>currentStage": currentStage,
			    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			      		    },
     		    async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	$("#fireBrigadeApplicationId").val(result["fireBrigadeApplicationId"]);
	 	    	},
				 error: function (data) {
			    },
			  });
	}
	function gettingDocumentList(){
		 typeOfCertificate=$("#certificateTypeVal").val();
		 fireApplicationId="<%=fireBrigadeApplicationId%>";
		$.ajax({
			type : "POST",
			url : "${fireBrigadeGettingDocumentList}",
			data : {
				"<portlet:namespace/>typeOfCertificate" : typeOfCertificate,
				"<portlet:namespace/>fireApplicationId" : fireApplicationId,
			},
			success : function(data) {
				$("#documentList").html(data);
			},
			error : function(data) {
			},
		});
	}
	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#fireBrigadeEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#fireBrigadeDocumentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
	function supportingDocumentUpload() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#fireBrigadeDocumentuploadCounter")
				.val();
		var fileID = 'fireBrigadeEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'
				+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		fireBrigadeApplicationId = $("#fireBrigadeApplicationId").val();
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'fireBrigadeEnrollDocuments',
					url : '${fireBrigadeDoucumentsUpload}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>documentName" : documentName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>fireBrigadeApplicationId" : fireBrigadeApplicationId,
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
						filledDocument = $(".supporting-document-card").find(".uploaded-info").length;
						if(numberOfDocument == filledDocument){
							$("#fireBrigadeSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						}
					},
					error : function() {
					}
				});
	}
	$(function() {
		$(document).on('change', '#fireBrigadeEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	/*$(function() {
		$(document).on('change', '#fireBrigadeGenericUpload', function () {
	        var files = $(this)[0].files; // Get the selected files

	        if (files.length > 0) {
	            var documentCounter = $('#uploaded-documents-container').find(".document-container").length;
	            var counter = documentCounter + 1;

	            for (var i = 0; i < files.length; i++) {
	                var fileName = files[i].name;
	                selectedFiles.push(files[i]); // Add each new file to the selectedFiles array

	                // Create a container for each document and its delete button
	                var documentContainer = $('<div class="document-container"></div>');

	                // Create a delete button for the document
	                var deleteButton = $('<a class="uploaded-delete mr-2" href="#"><svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524"></path></svg></a>');

	                // Append the delete button and document name to the container
	                documentContainer.append(deleteButton);
	                documentContainer.append('<span>' + fileName + '</span>');

	                // Append the document container to the documents container
	                $('#uploaded-documents-container').append(documentContainer);
	                counter++;
	            }

	            // Update the file input with the current selectedFiles
	            updateFileInput();

		            // Show the delete buttons
		            $('.uploaded-delete').show();
		            $(".noAdditionalSupportingDoc").addClass("hide");
		            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		            $("#fireBrigadeformPreviewFieldset .custom_loader").removeClass("hide");
		            $(".preview-section").addClass("hide");
		        } else {
		            // If no files are selected, hide any existing delete buttons
		            $('.uploaded-delete').hide();
		            $(".noAdditionalSupportingDoc").removeClass("hide");
		            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		            $("#fireBrigadeformPreviewFieldset .custom_loader").addClass("hide");
		            $(".preview-section").removeClass("hide");
		        }
		})
	});*/
	function opendelDocPopup(fileEntry, counter) {
		$("#fireBrigadeDocumentuploadCounter").val(counter);
		$("#deletepopup" + fileEntry).modal("show");
	}

	function deleteDocument(fileEntryId) {
		var fireBrigadeDocumentuploadCounter = $("#fireBrigadeDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${fireDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + fireBrigadeDocumentuploadCounter).removeClass("disabled");
				$("#document-name" + fireBrigadeDocumentuploadCounter).html("");
				$("#genericSupportingDocuments"+fireBrigadeDocumentuploadCounter).addClass("hide");
			     var requiredDoc = $("div[id='requiredDoc']").length;
		     	 var notRequireDoc = $("div[id='notRequiredDoc']").length;
				 if(requiredDoc >= 1){
				 if(documentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + documentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#fireBrigadeSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				}
				}
				if(notRequireDoc >= 1){
					$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
				}
			},
			error : function(data) {

			}
		});
	}

	function openSaveToDraftPopupFireBrigade(){
		$(".savecountinuePopup").modal("show");
		fireBrigadeApplicationId = $("#fireBrigadeApplicationId").val();
		certificateType = $("#certificateTypeVal").val();
		typeOfTransaction = $("#applicationTypeVal").val();
		applicantType = $("#applicantTypeVal").val();
		premisesType = $("#premisesTypeVal").val();
		certificatePurpose = $("#certificatePurposeVal").val();
		parish = $("#fireBrigadeParish").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		if(currentFormToSave == "Applicant's Detail"){
			uploadDocuments('signatureUploadBtn','Signature','signatureUploadInFireBrigadeUrl');
			addSignatureInfo(true);
		}else if(currentFormToSave == "Premises's Detail"){
			addPremisesInfo(true);
		}else if(currentFormToSave == "Operator's Detail"){
			addOperatorDetailInfo(true);
		}else if(currentFormToSave == "Multiple Floor Structure"){
			addMultipleFloorStructureInfo(true);
		}else if(currentFormToSave == "Fire Protection Equipment"){
			addFileProtectionEquipmentInfo(true);
		}else if(currentFormToSave == "Hazardous Substance/Materials"){
			addHazardousSubstanceInfo(true);
		}else if(currentFormToSave == "Certificate Purpose"){
			addCertificatePurposeInfo(true);
		}
		if(currentStage=="Supporting Documents"){
			uploadDocuments("fireBrigadeGenericUpload","Generic Documents","");		
	   	   	}
		if(currentStage=="APPLICATION FEES PAYMENT"){
			submitFeeDetailsInFireBrigade();
	   	   	}
		
		
		saveAndContinue = "true"; 
		$
				.ajax({
					type : "POST",
					url : "${fireBrigadePendingUrl}",
					data : {
						"<portlet:namespace/>fireBrigadeApplicationId" : fireBrigadeApplicationId,
						"<portlet:namespace/>certificateType" : certificateType,
						"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
						"<portlet:namespace/>applicantType" : applicantType,
						"<portlet:namespace/>premisesType" : premisesType,
						"<portlet:namespace/>certificatePurpose" : certificatePurpose,
						"<portlet:namespace/>parish" : parish,
						"<portlet:namespace/>currentStage" : currentStage,
						"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
						"<portlet:namespace/>saveAndContinue" : saveAndContinue,
					},
					async : false,
					success : function(data) {
						var result = data.APP_DATA;
						$("#fireBrigadeApplicationId").val(result["fireBrigadeApplicationId"]);
						var applicationNumber = result["fireBrigadeApplicationNumber"];
						var fireBrigadeCategory = result["fireBrigadeCategory"];
						if (applicationNumber != null && fireBrigadeCategory != null) {
							$("#pop_app_no").html(result["fireBrigadeApplicationNumber"]);
							$("#pop_category").html(result["fireBrigadeCategory"]);
						}
					},
					error : function(data) {
					},
				});
	}

	function firedeleteDocumentForGeneric(fileEntryId) {
		var documentuploadCounter = $("#farmDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${fireDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass(
						"disabled");
			},
			error : function(data) {

			}
		});
	}
	function firedeleteFee(fileEntryId) {
		var documentuploadCounter = $("#farmDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${fireDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass(
						"disabled");
				
				checkFilePresence();
			},
			error : function(data) {

			}
		});
	}
	
	function checkFilePresence() {
	    // Count the remaining file cards
	    var filesRemaining = $(".uploaded-info-two").length; // Adjust this selector if needed
	    if (filesRemaining === 0) {
	        // If no files are remaining, enable the upload button
	     
	        $("#fire-brigade-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    } else {
	        // Otherwise, disable the upload button
	    	$("#fire-brigade-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    }
	}
	
	function submitFireBrigade(){
		 certificateType=$("#certificateTypeVal").val();
		 typeOfTransaction=$("#applicationTypeVal").val();
		 applicantType=$("#applicantTypeVal").val();
		 premisesType=$("#premisesTypeVal").val();
		 certificatePurpose=$("#certificatePurposeVal").val();
		 parish=$("#fireBrigadeParish").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		   $.ajax({
			    type: "POST",
			    url: "${submitFireBrigadeApplicationUrl}",
			    data: {
			      "<portlet:namespace/>certificateType": certificateType,
				  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			      "<portlet:namespace/>applicantType": applicantType,
			      "<portlet:namespace/>premisesType": premisesType,
			      "<portlet:namespace/>certificatePurpose": certificatePurpose,
				  "<portlet:namespace/>parish": parish,
				  "<portlet:namespace/>currentStage": currentStage,
				  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
			    },
			    success: function (data) { 
			    var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			    	 if(appStatus==="submitted"){
					   		$("#continueDashboardFireBrigadeStatus").removeClass("hide");
					   		$("#submitted-content").removeClass("hide");
					   		$("#application_submitted-img").removeClass("hide");
					   	}else{
					   		$("#draft-content").removeClass("hide");
					   		$("#application_draft-img").removeClass("hide");
					   	}
			      $("#submit_pop_app_no").html(result["fireBrigadeAppNo"]);
			      $("#submit_pop_status").html(result["appStatus"]);
			      $("#submit_pop_category").html(result["category"]);
			      $("#farmerApplicationId").val(result["fireBrigadeAppicationId"]);
			 	  $(".custom_loader").addClass("hide");
		    	  $(".final-submit-content").css({"opacity":"1"}); 
	    	    },
			    error: function (data) {},
			  });
	}
	$("#new-license-type").click(function(){
		   $("#farm-renew-section").addClass("hide");
	   })
	   $("#farm-renew").click(function(){
		   $("#farm-renew-section").removeClass("hide");
	   });
	
	function recertificationAppFB(){
	 	$("#fire-renew-btn").attr("disabled", "disabled"); 
		$("#renewLicenseNumbervalidation").addClass("hide");
		transactionNumber = $("#renew-licence-number").val();
		fireBrigadeLicenseNumber = $("#renew-permit-number").val();
		$.ajax({
			type : "POST",
			url : "${recertificationFbLicenseUrl}",
			data : {
				"<portlet:namespace/>transactionNumber" : transactionNumber,
				"<portlet:namespace/>fireBrigadeLicenseNumber" : fireBrigadeLicenseNumber,
			},
			success : function(data) {
				var result = data.APP_DATA;
            	var checkLicenseNumber=result["transactionNumberCheck"];
            	var originalApplicationId=result["fireBrigadeApplicationId"];
            	var renewLicenseUrl=result["renewLicenseUrl"];
                    if (checkLicenseNumber == 0) {
                           $("#renewLicenseNumbervalidation").removeClass("hide");
                           $("#fire-renew-btn").removeAttr("disabled"); 
                    }else {
                    	window.location.href = renewLicenseUrl;
                    	
                    } 
			},
			error : function(data) {
			},
		});
	
	}
	
	function downloadPDF() {
		fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${addFireBrigadeDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if (result && result["fileUrl"]) {
                        $("#fireBirgadeDownloadPDF").attr("href", result["fileUrl"]);
                        $("#fireBirgadeDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
        });
    }
	function deleteAfterSaveConDoc(id) {
	    var fileName = $("#"+id).next().html();
	    fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		saveAndCon='<%=fireBrigadeApplicationId%>';
		if(saveAndCon>0){
		 	 $.ajax({
			        type: "POST",
			        url: '${delteDocAferSaveconUrl}',
			        data: {
			            "<portlet:namespace/>fileName": fileName,
			            "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
			        },
			        success: function (data) {
			        },
			        error: function (data) {
			        }
			    });	
			
		}
	}
</script>