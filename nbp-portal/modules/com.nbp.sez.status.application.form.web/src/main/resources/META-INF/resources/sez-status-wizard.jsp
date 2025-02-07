<portlet:resourceURL var="sezStatusPending" id="/sez/status/pending"></portlet:resourceURL>
<portlet:resourceURL var="sezStatusDeveloperDetail" id="/sez/status/developer/details"></portlet:resourceURL>
<portlet:resourceURL var="sezStatusFinalSubmitUrl" id="/sez/status/final/submit"></portlet:resourceURL>
<portlet:resourceURL var="feeDetailsUrlInSez" id="/sez/fee/details"></portlet:resourceURL>
<portlet:resourceURL var="documentsDownloadFolderUrl" id="/documents/download_folder"></portlet:resourceURL>
<portlet:resourceURL var="addSezStatusDownloadPdfUrl" id="/sez/status/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="wfmLocationInfoSaveUrl" id="/wfm/location/info/save/url"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<portlet:resourceURL var ="addSubmitConsultancy" id="/submit/consultancy"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for</p>
							<p class="common-banner-title f1 mb-0">SEZ Status</p>
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
									<p class="application-form-lower-heading">
										SEZ STATUS</p> <span></span>
								</li>
								<li>
									<p class="application-form-upper-title">Select</p>
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
								<p class="application-form-lower-heading">SEZ STATUS PREVIEW FORM</p> <span></span>
			                  </li>  
							</ul>
							<input type="hidden" id="sezStatusApplicationId"  name="sezStatusApplicationId" value="">
							<input type="hidden" id="sez-status-currentStage" name="sezStatusCurrentStage" value="">
							<input type="hidden" id="sez-dev-number" name="sez-dev-number" value="">
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=sezStatusApplicationId%>">
						</div>
						<%@ include file="/type-of-sez-status/sez-status-type.jsp"%>
 						<%@ include file="/type-of-sez-status-application/sez-status-application.jsp"%>
						<%@ include file="/forms/sez-status-form-tabs.jsp"%>
						<%@ include file="/supporting-documents/sez-status-documents.jsp"%>
                        <%@ include file="/sez-status-fee-payment.jsp" %>
                        <%@ include file="/preview/final-preview-tabs.jsp" %>
                        <%@ include file="/sez-status-final-submission.jsp" %>
                        <jsp:include page="/sez-status-popup.jsp" />
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"></script>

<script>
var filledDocument = "";
var numberOfDocument = "";
var currentFormToSave = "";
/* for the project type*/
 	$("#sezNewBtn #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#sez-status-type-box .wizard-card").click(function(){
	  $("#sez-status-type-option-value").val($(this).find(".application-type-card-title").html());
	  $("#sez-status-type-box").find(".wizard-card").removeClass("active");
	  $(this).addClass("active");
	  $("#sezOccupantLevel2, #sezZoneLevel2, #sezDeveloperLevel2, #sezDeveloperLevel3, #sezOccupantLevel3").addClass("hide");
	  $("#level-1").find(".wizard-card").removeClass("active");
	  $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	});
	$("#level-1 .wizard-card").click(function(){
	  $("#sez-submit-application-type-option-value").val($(this).find(".wizard-title span").html());
	  $("#level-1").find(".wizard-card").removeClass("active");
	  $(this).addClass("active");
	  $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  downloadFolder();
	  $("#sezOccRenewSection, #sezZoneRenewSection").addClass("hide");
	});
	//$("#scheduleMeetingTab").click(function(){
		//$(".schedule-meeting-box").removeClass("hide");
	//});
	$("#submitApplicationTab").click(function(){
		$(".schedule-meeting-box").addClass("hide");
		$("#typeOfSezStatus").removeClass("hide");
		$("#sezTransactionTypeBox, #registrationCertificate, #sezApplicantStatus").addClass("hide");
	});
	$("#submitApplicationWorkFormHomeTab").click(function(){
		$(".schedule-meeting-box").addClass("hide");
		$("#sezApplicantStatus").removeClass("hide");
		$("#typeOfSezStatus").addClass("hide");
		$("#sezApplicantStatus").find(".wizard-card").removeClass("active");
		$("#sezTransactionTypeBox, #registrationCertificate").addClass("hide");
	});
	$("#sezApplicantStatus .wizard-card").click(function(){
		  $("#sezApplicantStatus").find(".wizard-card").removeClass("active");
		  $(this).addClass("active");
		  $("#applicantStatusVal").val($(this).find(".wizard-title").html());
		  $("#sezTransactionTypeBox").removeClass("hide");
		  $("#sezTransactionTypeBox").find(".wizard-card").removeClass("active");
		  $("#registrationCertificate").addClass("hide");
		  $(".feeHeading").html($("#applicantStatusVal").val());
	});
	$("#sezTransactionTypeBox .wizard-card").click(function(){
	  $("#sezTransactionTypeBox").find(".wizard-card").removeClass("active");
	  $(this).addClass("active");
	  $("#typeTransactionTypeVal").val($(this).find(".wizard-title").html());
	  typeTransactionType = $("#typeTransactionTypeVal").val();
	  if(typeTransactionType == "New"){
		    $("#registrationCertificate").addClass("hide");
			$("#SezStatusApplicationFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			$(".sezZoneApplicationFormTab, #sezZoneApplicationForm, #sezZoneSupportingDoc, .sezZoneApplicationPreviewTab, #sezZoneApplicationPreview").addClass("hide");
			$(".sezOccApplicationFormTab, #sezOccApplicationForm, #sezOccupantSupportingDoc, .sezOccApplicationPreviewTab, #sezOccApplicationPreview").addClass("hide");
			$("#sezDeveloperLevel2, .sezDevApplicationFormTab, #sezDevApplicationForm, #sezDeveloperSupportingDoc, .sezDevApplicationPreviewTab, #sezDevApplicationPreview").addClass("hide");
	  }else{
		    $("#registrationCertificate").removeClass("hide");
		 	$("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
	});
	
	
	$("#sezDeveloperLevel1").click(function(){
		$(".feeAmount").html("$USD 3,000.00");
		$("#paymentFee").val("$USD 3,000.00");
		$(".feeHeading").html("SEZ Developer");
		$("#supportingDocStep").html("11");
		$("#feePaymentStep").html("12");
		$("#sezOccupantLevel2, #sezZoneLevel2, #sezDeveloperLevel3, #sezOccupantLevel3, #sezZoneUserLevel3").addClass("hide");
		$(".sezZoneApplicationFormTab, #sezZoneApplicationForm, #sezZoneSupportingDoc, .sezZoneApplicationPreviewTab, #sezZoneApplicationPreview").addClass("hide");
		$(".sezOccApplicationFormTab, #sezOccApplicationForm, #sezOccupantSupportingDoc, .sezOccApplicationPreviewTab, #sezOccApplicationPreview").addClass("hide");
		$(".sezOccApplicationFormTab").addClass("hide");
		$("#sezWorkFromHomeApplicationForm").addClass("hide");
		$("#sezDeveloperLevel2, .sezDevApplicationFormTab, #sezDevApplicationForm, #sezDeveloperSupportingDoc, .sezDevApplicationPreviewTab, #sezDevApplicationPreview").removeClass("hide");
		$("#sezDeveloperLevel2").find(".wizard-card").removeClass("active");
	});
	$("#sez-industries .wizard-card").click(function(){
		$("#sez-dev-industry-option-value").val($(this).find(".wizard-title").html());
	});
	$("#occupant-industries-check-box .wizard-card").click(function(){
		$("#sez-occu-industry-option-value").val($(this).find(".wizard-title").html());
	});
	$("#sezDeveloperLevel2 .wizard-card").click(function(){
		$("#sez-developer-type-option-value").val($(this).find(".wizard-title").html());
		$("#sezDeveloperLevel2").find(".wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#sezDeveloperLevel3, #sezRenewSection").addClass("hide");
		 if($("#sez-developer-type-option-value").val() == "New Application for SEZ Developer Status"){
			 $("#sezDeveloperLevel3").removeClass("hide");
		 }else{
			 $("#sezRenewSection").removeClass("hide");
		 }
		$("#sezDeveloperLevel3").find(".wizard-card").removeClass("active");
		$("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	});
	$("#sezDeveloperLevel3 .wizard-card").click(function(){
		$("#sezDeveloperLevel3").find(" .wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	});
	$("#sezOccupantLevel1").click(function(){
		$("#supportingDocStep").html("10");
		$("#feePaymentStep").html("11");
	    $("#level-1").addClass("hide");
	    SezOccupant = "SezOccupant";
	    $("#sezDevNumvalidate").removeClass("hide");
	    $("#sezDevNumvalidate .final-submit-container").removeClass("hide");
	    $(".wizard-navigation-box-left, .wizard-navigation-box-right").addClass("hide");
	    setClickEvent(SezOccupant);
	    $("#sezDeveloperLevel2, #sezZoneLevel2, #sezDeveloperLevel3, #sezOccupantLevel3, #sezZoneUserLevel3").addClass("hide");
	    $(".sezOccApplicationFormTab").addClass("hide");
		$("#sezWorkFromHomeApplicationForm").addClass("hide");
	});
	$("#sezOccupantLevel2 .wizard-card").click(function(){
		$("#sezOccupantLevel2").find(".wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#sez-occupant-type-option-value").val($(this).find(".wizard-title").html());
		 $("#sezOccupantLevel3").find(".wizard-card").removeClass("active");
		 $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		 $("#sezOccupantLevel3, #sezOccRenewSection").addClass("hide");
		 if($("#sez-occupant-type-option-value").val() == "New Application for SEZ Occupant Status"){
			 $("#sezOccupantLevel3").removeClass("hide");
		 }else{
			 $("#sezOccRenewSection").removeClass("hide");
		 }
		 
	});
	$("#sezOccupantLevel3 .wizard-card").click(function(){
		 $("#sezOccupantLevel3").find(".wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	});
	$("#sezZoneLevel1").click(function(){
		$("#supportingDocStep").html("8");
		$("#feePaymentStep").html("9");
	    $("#level-1").addClass("hide");
	    SezZoneUser = "SezZoneUser";
	    $("#sezDevNumvalidate").removeClass("hide");
	    $("#sezDevNumvalidate .final-submit-container").removeClass("hide");
	    $(".wizard-navigation-box-left, .wizard-navigation-box-right").addClass("hide");
	    setClickEvent(SezZoneUser);
	    $("#sezDeveloperLevel2, #sezOccupantLevel2, #sezDeveloperLevel3, #sezOccupantLevel3, #sezZoneUserLevel3").addClass("hide");
	    $("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    $(".sezOccApplicationFormTab").addClass("hide");
		$("#sezWorkFromHomeApplicationForm").addClass("hide");
	});
	// Event delegation for .sez-dev-submit-btn
	$(document).on("click", ".sez-dev-submit-btn", function() {
	    var data = $(this).data("param");
	    validateSezDevNum(data);
	});

	function setClickEvent(data) {
	    $(".sez-dev-submit-btn").data("param", data);
	}
	$("#sezZoneLevel2 .wizard-card").click(function(){
		$("#sezZoneLevel2").find(" .wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#sez-zone-type-option-value").val($(this).find(".wizard-title").html());
		 /* $("#sezZoneUserLevel3").removeClass("hide"); */
		 $("#sezZoneUserLevel3").find(".wizard-card").removeClass("active");
		 $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		 $("#sezZoneUserLevel3, #sezZoneRenewSection").addClass("hide");
		 if($("#sez-zone-type-option-value").val() == "New Application for SEZ Zone User Status"){
			 $("#sezZoneUserLevel3").removeClass("hide");
		 }else{
			 $("#sezZoneRenewSection").removeClass("hide");
		 }
	});
	$("#sezZoneUserLevel3 .wizard-card").click(function(){
		 $("#sezZoneUserLevel3").find(" .wizard-card").removeClass("active");
		 $(this).addClass("active");
		 $("#sez-zone-user-option-value").val($(this).find(".wizard-title").html());
		 $("#SezStatusApplicationFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	});
	$("#msmeOccupantLevel1").click(function(){
		$("#sezDeveloperLevel2, #sezOccupantLevel2, #sezZoneLevel2, #sezDeveloperLevel3").addClass("hide");
		$("#level-1").addClass("hide");
	    SezMsmeOccupant = "SezMsmeOccupant";
	    $("#sezDevNumvalidate").removeClass("hide");
	    $(".wizard-navigation-box-left, .wizard-navigation-box-right").addClass("hide");
	    setClickEvent(SezMsmeOccupant);
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
	
	$("#sez-payment-upload").change(function() {
		selectedfiles = this.files[0].name;
		$("#sez-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
		$("#sez-payment-no-file-chosen").addClass("hide");
	});
	
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	   	$(".fee-method-preview").html($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #sez-payment-file-chosen").empty();
	        $(".fee-payment-wrapper #sez-payment-upload").val('');
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
	var devDocRenderCount = 1;
  	var occDocRenderCount = 1;
  	var zoneDocRenderCount = 1;
  	var msmeDocRenderCount = 1;
  	var wfhDocRenderCount = 1;
    var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function () {
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        /* Scroll Page to top */
        scrollToPageTop();
        if(currentFieldSet == "SezStatusApplicationFieldset"){
        	$(".application-Fees .common-heading").html("Application Fee");
      	    $("#rm-payment-method").removeClass("hide");
      	    $(".fee-preview").removeClass("hide");
      	  
        	sezStatus = $("#sez-submit-application-type-option-value").val();
        	typeTransactionTypeVal = $("#typeTransactionTypeVal").val();
        	if(sezStatus == "SEZ Developer"){
        		applicantName = $("#applicantName").val();
        		applicantEmail = $("#applicantEmail").val();
        		publicNotaryName = $("#publicNotaryName").val();
        		if(!applicantName && !applicantEmail && !publicNotaryName){
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        		}else{
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
        		}
        	}else if(sezStatus == "SEZ Occupant"){
        		occApplicantName = $("#occApplicantName").val();
        		occApplicantEmail = $("#occApplicantEmail").val();
        		occPublicNotaryName = $("#occPublicNotaryName").val();
        		if(!occApplicantName && !occApplicantEmail && !occPublicNotaryName){
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        		}else{
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
        		}
        	}else if(sezStatus == "SEZ Zone User"){
        		zoneDevUndertakingDevName = $("#zoneDevUndertakingDevName").val();
        		zoneDevApplicantName = $("#zoneDevApplicantName").val();
        		zoneDevApplicantEmail = $("#zoneDevApplicantEmail").val();
        		zoneDevPublicNotaryName = $("#zoneDevPublicNotaryName").val();
        		if(!zoneDevUndertakingDevName && !zoneDevApplicantName && !zoneDevApplicantEmail && !zoneDevPublicNotaryName){
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        		}else{
        			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
        		}
        	}else if(sezStatus == "MSME Occupant"){
        		$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        	}
          $(".sezWorkFromHomeApplicationFormTab, #sezWorkFromHomeApplicationForm, .sezWorkFromHomeApplicationPreview").addClass("hide");
          sezStatusTypeOptionVal = $("#sez-status-type-option-value").val();
   		  if(sezStatusTypeOptionVal == "Submit an Application for A Work From Home Certificate"){
   			$(".sezWorkFromHomeApplicationFormTab, .sezWorkFromHomeApplicationPreview").removeClass("hide");
			$("#sezWorkFromHomeApplicationForm").removeClass("hide");
			$("#supportingDocStep").html("2");
			/* $("#feePaymentStep").html("3"); */
			
			contactPersonName = $("#contactPersonNameWfh").val();
  			contactPersonEmail = $("#contactPersonEmailWfh").val();
  			workerUtillizingWorkFromHome = $("#workerUtillizingWFH").val();
  			workerMonthsUtillizingWFH = $("#workerMonthsUtillizingWFH").val();
  			$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
  			if(contactPersonName && contactPersonEmail && workerUtillizingWorkFromHome && workerMonthsUtillizingWFH){
  				$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
  			}
   		  }
   			typeTransactionType = $("#typeTransactionTypeVal").val();
	   		if(typeTransactionType == "New" || typeTransactionType == "Renewal"){
		  		  $(".application-Fees .common-heading").html("No Fee Applicable");
		  		  $("#rm-payment-method").addClass("hide");
		  		  $(".fee-preview").addClass("hide");
		  	}else{
		  		$(".application-Fees .common-heading").html("Application Fee");
	      	    $("#rm-payment-method").removeClass("hide");
	      	    $(".fee-preview").removeClass("hide");
	      	    
		  	}
        }
		if(currentFieldSet == "SezStatusFeePaymentFieldset"){
        	finalPreviewScroll();
        	showFinalSubmitButton(); 
        	previewDeveloperGeneralBusinessInfo();
        	previewDeveloperShareholdingInfo();
        	previewDeveloperProposedPorjectInfo();
        	previewDeveloperProposedDevelopmentInfo();
        	previewDeveloperEmployeeSafetyInfo();
        	previewDeveloperEmployementInfo();
        	previewDeveloperDisasterManagementInfo();
        	previewDeveloperInvestmentInfo();
        	previewDeveloperUndertakingInfo();
        	previewDeveloperSubmissionChecklistInfo();
        	previewZoneGeneralBusinessInfo();
        	previewZoneProposedProjInfo();
        	previewZoneInvestmentInfo();
        	previewZoneEmploymentInfo();
        	previewZoneZoneUserUndertakingInfo();
        	previewZoneDeveloperUndertakingInfo();
        	previewZoneSubmissionChecklistInfo();
        	previewOccupantGeneralBusinessInfo();
        	previewOccupantShareholdingInfo();
        	previewOccupantProposedProjInfo();
        	previewOccupantProposedDevelopmentInfo();
        	previewOccupantInvestmentInfo();
        	previewOccupantEmploymentInfo();
        	previewOccupantZoneUndertakingInfo();
        	previewOccupantDeveloperUndertakingInfo();
        	previewOccupantSubmissionChecklistInfo();
        	previewWorkFormHomeInfo();
        	$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());
			pendingSezApplication();
        }   
      if(currentFieldSet == "SezStatusFormsFieldset"){
    	typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
    	typeOfTransactionWFH=$("#typeTransactionTypeVal").val();

    	activeSelectForm();
    	$("#SezStatusFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });

    	 sezStatusTypeOptionValue = $("#sez-status-type-option-value").val();

    	if (sezStatusTypeOptionValue === "Submit an Application for A Work From Home Certificate") {
    	    contactPersonNameWfh = $("#contactPersonNameWfh").val();
    	    contactPersonEmailWfh = $("#contactPersonEmailWfh").val(); 
    	    workerUtillizingWFH = $("#workerUtillizingWFH").val();
    	    if (contactPersonNameWfh && contactPersonEmailWfh && workerUtillizingWFH) {
    	        $("#SezStatusFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
    	    }
    	}

		
		  if(typeOfSezStatus == "SEZ Developer"){
	        developerSubmissionChecklistInfo();   			
	  	  }else if(typeOfSezStatus == "SEZ Occupant"){
	  		occupantSubmissionChecklistInfo();
	  	  }else if(typeOfSezStatus == "SEZ Zone User"){
	  		zoneSubmissionChecklistInfo();
	  	  }else if(typeOfTransactionWFH=="New"){
	  		addWorkFormHomeInfo();
	  	  }
		  sezStatusTypeOptionVal = $("#sez-status-type-option-value").val();
		  if(sezStatusTypeOptionVal == "Submit an Application for A Work From Home Certificate"){
			    workerUtillizingWFH = $("#workerUtillizingWFH").val();
	  			workerMonthsUtillizingWFH = $("#workerMonthsUtillizingWFH").val();
	  			WorkerUtillizingWFhForPayment=workerUtillizingWFH*8*workerMonthsUtillizingWFH;
	  			/* $(".feeHeading").html("8*"+workerUtillizingWFH +" = "+"$USD" +WorkerUtillizingWFhForPayment); */
	  			$(".feeAmount").html("$USD "+WorkerUtillizingWFhForPayment);
			  
		  }
		  sezStatusTypeOption = $("#sez-status-type-option-value").val();
		  if(sezStatusTypeOption == "Submit an Application for A Work From Home Certificate"){
			  addWfhLocationDetail();
		  }
		  /* DOCUMENT VALIDATION */
			var requiredDoc = $("div[id='requiredDoc']").length;
			filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
			if(requiredDoc >= 1){
				$(".mandatory-doc-heading").removeClass("hide");
				numberOfDocument = requiredDoc;
				if(numberOfDocument != filledDocument){
		    		$("#SezStatusSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    	}
			}
			pendingSezApplication();
       }  
      if(currentFieldSet == "SezStatusApplicationFieldset"){
    	  pendingSezApplication();
    	  gettingDocumentList();
    	  activeSelectForm();
    	  typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
  		  if(typeOfSezStatus == "SEZ Developer"){
  					
  	  	  }else if(typeOfSezStatus == "SEZ Occupant"){
  	  		uploadDocuments('approvalLetter','Occupant Letter of Approval','');	
  	  		uploadDocuments('sezDevAgree','Occupant Agreement','');	
  	  	  }else if(typeOfSezStatus == "SEZ Zone User"){
  	  		uploadDocuments('zoneApprovalLetter','Zone Letter of Approval','');	
  	  		uploadDocuments('sezZoneDevAgree','Zone Agreement','');	
  	  	  }else if(typeOfSezStatus == "MSME Occupant"){
  	  	  }
       }  
      if(currentFieldSet == "SezStatusSupportingDocumentFieldset"){
    	  uploadDocuments('sez-application-generic-upload','Generic Documents','');
    	  pendingSezApplication();
       } 
      if(currentFieldSet == "SezStatusFeePaymentFieldset"){
    	  submitFeeDetailsInSez();
    	  downloadPDF();
		  pendingSezApplication(); 
		  
		  typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
    	  if(typeOfSezStatus == "SEZ Developer"){
    		  	showDocsPreview(devDocRenderCount);
    		  	devDocRenderCount++;  			
    	  }else if(typeOfSezStatus == "SEZ Occupant"){
	  			showDocsPreview(occDocRenderCount);
	  			occDocRenderCount++;
    	  }else if(typeOfSezStatus == "SEZ Zone User"){
  				showDocsPreview(zoneDocRenderCount);
  				zoneDocRenderCount++;
    	  }else if(typeOfSezStatus == "MSME Occupant"){
  				showDocsPreview(msmeDocRenderCount);
  				msmeDocRenderCount++;
    	  }
		  sezStatusTypeOptionVal = $("#sez-status-type-option-value").val();
		  if(sezStatusTypeOptionVal == "Submit an Application for A Work From Home Certificate"){
			  showDocsPreview(wfhDocRenderCount);
	    	  wfhDocRenderCount++;  
		  }
		  uploadDocuments('sez-application-generic-upload','Generic Documents','');
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
       	/* Scroll Page to top */
        scrollToPageTop();
       	
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
	 $('#sezOccuParish').on('change', function (e) {
		    var optionSezApplicationParishSelected = $("option:selected", this);
		    var settingSelectedOccuParishValue = this.value;
		    $("#sez-occu-industry-option-value").val(settingSelectedOccuParishValue);
		});
	 $('#sezDevParish').on('change', function (e) {
		    var optionSezApplicationParishSelected = $("option:selected", this);
		    var settingSelectedParishValue = this.value;
		    $("#sez-application-parish-option-value").val(settingSelectedParishValue);
		});
function showFinalSubmitButton(){
		var currentFieldSet = $(".wizard-fieldset.show").attr("id");
		 if(currentFieldSet == "SezStatusFeePaymentFieldset" || currentFieldSet == "SezStatusPreviewFieldset"){
	        	$(".form-wizard-next-btn ").hide();
	        	$(".form-wizard-save-btn").hide();
	        	$(".final-submit").removeClass("hide");
	        }else{
	        	$(".form-wizard-next-btn").show();
	        	$(".form-wizard-save-btn").show();
	        	$(".final-submit").addClass("hide");
	        } 
	}
	function showFinalButtonInLastStage(){
		var currentStage = "<%=currentStage %>";
		if(currentStage == "SEZ STATUS PREVIEW FORM"){
			showFinalSubmitButton();
		}
	}
	function openSezSaveToSubmitPopup(){
		openSezStatusSaveToSubmitPopup();
	    $(".final-submit-container").removeClass("hide");
	}
	$(function () {
		$(document).on('change', '#sezStatusEnrollDocuments', function() { 
	        var fileName = $(this).val();
	        fileName = fileName.replace("C:\\fakepath\\", "");
	        $(this).next('.custom-file-label').html(fileName);
	    })
	}); 
	$(function () {
		$(document).on('change', '#sez-application-generic-upload', function() { 
	        var fileName = $(this).val();
	        fileName = fileName.replace("C:\\fakepath\\", "");
	        $(this).next('#sez-status-generic-file-chosen').html(fileName);
	    })
	}); 
	function pendingSezApplication(){
		 sezStatusApplicationId=$("#sezStatusApplicationId").val();
		 typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 typeOfTransaction="";
		 typeOfTransactionWFH="";
		 typeOfIndustry="";
		 specialEconomicZoneCheckBoxInfo="";
		 zoningClassificationCheckBoxInfo="";
		 sezApplicationParish="";
		 doYouWantTo=$("#sez-status-type-option-value").val();
		 ApplicantStatus="";
		 controlNumber="";
	 if(typeOfSezStatus=="SEZ Occupant"){
		 var occupantZoningCheckBoxArray = new Array();
		  $("input:checkbox[name=sezOccuZoningClassification]:checked").each(function () {
			  occupantZoningCheckBoxArray.push($(this).val());
		  });
		 typeOfTransaction=$("#sez-occupant-type-option-value").val();
		 typeOfIndustry=$("#sez-occu-industry-option-value").val();
		 sezApplicationParish=$("#sezOccuParish").val();
		 var zoningClassificationCheckBoxInfo=occupantZoningCheckBoxArray.toString();
		 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezOccuEconomicZone]:checked").val();
	 }else if(typeOfSezStatus=="SEZ Developer"){
		 var zoningValueCheckBoxArray = new Array();
		  $("input:checkbox[name=sezDevzoningClassification]:checked").each(function () {
			  zoningValueCheckBoxArray.push($(this).val());
		  });	
		  var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezDevEconomicZone]:checked").val();
		 typeOfTransaction=$("#sez-developer-type-option-value").val();
		 typeOfIndustry=$("#sez-dev-industry-option-value").val();
		 sezApplicationParish=$("#sezDevParish").val();
		 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
		 }else if(typeOfSezStatus == "SEZ Zone User"){
			 var zoningValueCheckBoxArray = new Array();
			  $("input:checkbox[name=sezZoneUserZoningClassification]:checked").each(function () {
				  zoningValueCheckBoxArray.push($(this).val());
			  });	
			 typeOfTransaction=$("#sez-zone-type-option-value").val();
			 typeOfIndustry=$("#sez-zone-user-option-value").val();
			 sezApplicationParish=$("#sezZoneParish").val();
			 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
			 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezZoneEconomicZone]:checked").val();
		 }else if(doYouWantTo=="Submit an Application for A Work From Home Certificate"){
			 typeOfTransactionWFH=$("#typeTransactionTypeVal").val();
			 ApplicantStatus=$("#applicantStatusVal").val();
			 controlNumber=$("#controlNumber").val();
		 }
		 $.ajax({
			    type: "POST",
			    url: "${sezStatusPending}",
			    data: {
			    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			    	  "<portlet:namespace/>doYouWantTo": doYouWantTo,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>typeOfIndustry": typeOfIndustry,
			    	  "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
			    	  "<portlet:namespace/>specialEconomicZoneCheckBoxInfo": specialEconomicZoneCheckBoxInfo,
			    	  "<portlet:namespace/>zoningClassificationCheckBoxInfo": zoningClassificationCheckBoxInfo,
			    	  "<portlet:namespace/>sezApplicationParish": sezApplicationParish,
			    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			    	  "<portlet:namespace/>currentStage": currentStage,
			    	  "<portlet:namespace/>typeOfTransactionWFH": typeOfTransactionWFH,
			    	  "<portlet:namespace/>ApplicantStatus": ApplicantStatus,
			    	  "<portlet:namespace/>controlNumber": controlNumber,
			      		    },
      		    async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	 $("#sezStatusApplicationId").val(result["sezStatusApplicationId"]); 
			    	developerDetails();
	 	    	},
			    error: function (data) {
			    },
			  });
	}
	/*consultancy*/
	function submitConsultancy(){
		doYouWant=$("#sez-status-type-option-value").val();
		consultancyName = $("#name").val();
		consultancyEmail = $("#email").val();
		consultancyPhoneNum = $("#phoneNum").val();
		consultancyDateBirth = $("#dateOfBirth").val();
		consultancyBirthCountry = $("#birthCountry").val();
		consultancyCountry = $("#residenceCountry").val();
		consultancySezStatus = $("#bona-accomadation-incentive-purpose").val();
		agendaName=$("#agendaName").val();
		dateForInspection = $("#dateForInspection").val();
		licenseStatusRacingQues = $("input[name='timeForInspection']:checked").val();
		submitForm= true;
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!consultancyEmail){
				$("#emailValidation").removeClass("hide");
				$("#emailValidation").text("Please Enter Email Address");
				$("#consultancyEmail").focus();
				submitForm= false;
			}else if(consultancyEmail.match(mailformat)){ 
				$("#emailValidation").addClass("hide");
			}else{
				$("#emailValidation").removeClass("hide");
				$("#emailValidation").text("You have Entered an In-valid email address");
				$("#consultancyEmail").focus();
				submitForm= false;
			}
			if(!consultancyName){
				$("#nameValidation").removeClass("hide");
				$("#consultancyName").focus();
				submitForm= false;
			}else{
				$("#nameValidation").addClass("hide");
			}	

			if(!consultancyPhoneNum){
				$("#phonenumValidation").removeClass("hide");
				$("#consultancyPhoneNum").focus();
				submitForm= false;
			}else{
				$("#phonenumValidation").addClass("hide");
			}	

			if(!consultancyDateBirth){
				$("#dateOfBirthValidation").removeClass("hide");
				$("#consultancyDateBirth").focus();
				submitForm= false;
			}else{
				$("#dateOfBirthValidation").addClass("hide");
			}

			if(!consultancyBirthCountry){
				$("#birthCountryValidation").removeClass("hide");
				$("#consultancyBirthCountry").focus();
				submitForm= false;
			}else{
				$("#birthCountryValidation").addClass("hide");
			}

			if(!consultancyCountry){
				$("#residenceCountryValidation").removeClass("hide");
				$("#consultancyCountry").focus();
				submitForm= false;
			}else{
				$("#residenceCountryValidation").addClass("hide");
			}

			if (!consultancySezStatus) {
				$("#bona-accomadation-Validation").removeClass("hide");
				$("#consultancySezStatus").focus();
				submitForm = false;
			} else {
				$("#bona-accomadation-Validation").addClass("hide");
			}

			if(!agendaName){
				$("#agendaNameValidation").removeClass("hide");
				$("#agendaName").focus();
				submitForm= false;
			}else{
				$("#agendaNameValidation").addClass("hide");
			}
			if(!dateForInspection){
				$("#dateForInspectionValidation").removeClass("hide");
				$("#dateForInspection").focus();
				submitForm= false;
			}else{
				$("#dateForInspectionValidation").addClass("hide");
			}

			if (!licenseStatusRacingQues) {
				$("#licenseStatusRacingQuesValidation").removeClass("hide");
				$("#licenseStatusRacingQues").focus();
				submitForm = false;
			} else {
				$("#licenseStatusRacingQuesValidation").addClass("hide");
			}
		
			if(submitForm){
				event.preventDefault();
		$.ajax({
			type : "POST",
			url : "${addSubmitConsultancy}",
			data : {
				"<portlet:namespace/>doYouWant" : doYouWant,
				"<portlet:namespace/>consultancyName" : consultancyName,
				"<portlet:namespace/>consultancyEmail" : consultancyEmail,
				"<portlet:namespace/>consultancyPhoneNum" : consultancyPhoneNum,
				"<portlet:namespace/>consultancyDateBirth" : consultancyDateBirth,
				"<portlet:namespace/>consultancyBirthCountry" : consultancyBirthCountry,
				"<portlet:namespace/>consultancyCountry" : consultancyCountry,
				"<portlet:namespace/>consultancySezStatus" : consultancySezStatus,
				"<portlet:namespace/>agendaName" : agendaName,
				"<portlet:namespace/>dateForInspection" : dateForInspection,
				"<portlet:namespace/>licenseStatusRacingQues" : licenseStatusRacingQues,
			},
			success : function(data) {
				 var result = data.APP_DATA;
				 $(".appication-type").addClass("hide");
				 $(".schedule-meeting-box").addClass("hide");
				 $("#consultancy-request").removeClass("hide");
			}
		});
	}
	}

	function developerDetails(){
		sezOccupantDevName="";
		sezDevControl="";
		approvalLetterDate="";
		sezDevNumber="";
		sezDevdate="";
		typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		if(typeOfSezStatus!="SEZ Developer"){
		if(typeOfSezStatus=="SEZ Occupant"){
		 sezOccupantDevName=$("#sezDevName").val();
		 sezDevControl=$("#sezDevControl").val();
		 approvalLetterDate=$("#approvalLetterDate").val();
		 sezDevNumber=$("#sez-dev-number").val();
		 sezDevdate=$("#sezDevdate").val();
		}else if(typeOfSezStatus == "SEZ Zone User"){
			 sezOccupantDevName=$("#sezZoneDevName").val();
			 sezDevControl=$("#sezZoneDevControl").val();
			 approvalLetterDate=$("#zoneApprovalLetterDate").val();
			 sezDevdate=$("#sezZoneDevdate").val();
			 sezDevNumber=$("#sez-dev-number").val();
		}
		 sezStatusApplicationId=$("#sezStatusApplicationId").val();
		 $.ajax({
			    type: "POST",
			    url: "${sezStatusDeveloperDetail}",
			    data: {
			    	 "<portlet:namespace/>sezDevName": sezOccupantDevName,
			    	 "<portlet:namespace/>sezDevControl": sezDevControl,
			    	 "<portlet:namespace/>approvalLetterDate": approvalLetterDate,
			    	  "<portlet:namespace/>sezDevdate": sezDevdate,			    	  
			    	  "<portlet:namespace/>sezDevNumber": sezDevNumber,
			    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			      		    },
			    success: function (data) { 
	 	    },
			    error: function (data) {
			    },
			  });
		}
	}
	function settingDevNumber(){
		sezDevNumber=$("#sezDevNumber").val();
		$("#sez-dev-number").val(sezDevNumber);
	}
	function nextButtonCall(){
		var $active = $('.nav-tabs li>.active');
		$active.parent().next().find('.nav-link').removeClass('disabled');
		$active.parent().next().find('.nav-link span').removeClass('gray');
		nextTab($active);
		const formSections = document.getElementsByClassName('form-wizard');
	    for (const formSection of formSections) {
		 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
		 }
		pendingSezApplication();
	}
	function submitFeeDetailsInSez(){
	    paymentMethod = $("#paymentMethod").val();
	    paymentFee = $("#paymentFee").val();
	    amountPaid=$("#amountPaid").val();
	    amountCurrency=$("#amountCurrency").val();
	    sezStatusApplicationId=$("#sezStatusApplicationId").val();
	    if(paymentMethod=="Credit Card"){
    	    $.ajax({
    	        type: "POST",
    	        url: '${feeDetailsUrlInSez}',
    	        data: {
    	          "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
      		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
                  "<portlet:namespace/>paymentFee": paymentFee, 
                  "<portlet:namespace/>amountPaid": amountPaid,
	      		  "<portlet:namespace/>amountCurrency": amountCurrency,
    	        },
    	        success: function (data) {
    	            $("#deletepopup"+fileEntryId).modal("hide");
    	            $("#unpload-info-card"+fileEntryId).remove();
    	        },
    	        error: function (data) {
    	        }
    	    });
	    }else{
   		     var fileID = 'sez-payment-upload';
   	   		$.ajaxFileUpload({
   	   		    secureuri: false,
   	   		    method: "POST",
   	   		    url: "${feeDetailsUrlInSez}",
   	   		    fileElementId: 'sez-payment-upload',
   	   		    dataType: 'text',
   	   		    data: {
   	   		      "<portlet:namespace/>fileID": fileID,
   	   		      "<portlet:namespace/>command": "fileUpload",
   	   		      "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
   	   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
   	   			  "<portlet:namespace/>paymentFee": paymentFee,
   	   		      "<portlet:namespace/>amountPaid": amountPaid,
      		  	  "<portlet:namespace/>amountCurrency": amountCurrency,
   	   		    },
   	   		    success: function (data) { 
   	   		// Parse the JSON data
   	 			var parsedData = JSON.parse(data);
   	 			$.each(parsedData, function(key, entry) {
   	 			 var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
   	 			 $("#payment-upload-preview").html(entry.fileName);
   	 			 $("#payment-upload-preview").attr("href", decodedUrl);
   	 			});


   	   		    },
   	   		    error: function (data) {},
   	   		  });
	     }
	}
	function gettingDocumentList(){
		 typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		 doYouWantTo=$("#sez-status-type-option-value").val();
		 sezStatusApplicationId=$("#sezStatusApplicationId").val();
		 $.ajax({
			    type: "POST",
			    url: "${sezStatusGettingDocumentList}",
			    data: {
			    	  "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
			    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			    	  "<portlet:namespace/>doYouWantTo": doYouWantTo,
			      		    },
			    success: function (data) { 
			    	$("#documentList").html(data);
			    	numberOfDocument =$("div[id='requiredDoc']").length;
  	   		        filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
	  	   			if(numberOfDocument != filledDocument){
	  	     	   		$("#SezStatusSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  	        	}
	 	    },
			    error: function (data) {
			    },
			  });
	}
	
	function deleteDocument(fileEntryId){
		var documentuploadCounter = $("#sezStatusDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${sezDeletedocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup"+fileEntryId).modal("hide");
				$("#unpload-info-card"+fileEntryId).remove();
				$("#documentUpload"+documentuploadCounter).removeClass("disabled");
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
				var requiredDoc = $("div[id='requiredDoc']").length;
				var notRequireDoc = $("div[id='notRequiredDoc']").length;
	            if(requiredDoc >= 1){
	            if(documentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + documentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#SezStatusSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
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
	function deleteDocumentFee(fileEntryId){
		var documentuploadCounter = $("#sezStatusDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${sezDeletedocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup"+fileEntryId).modal("hide");
				$("#unpload-info-card"+fileEntryId).remove();
				$("#documentUpload"+documentuploadCounter).removeClass("disabled");
				
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
	     
	        $("#sez-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    } else {
	        // Otherwise, disable the upload button
	    	$("#sez-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    }
	}
	function openDocumentUploadPopup(counterVal,documentName){
			$("#<portlet:namespace/>documentNumber").val("");
			$("#<portlet:namespace/>issueDate").val("");
			$("#<portlet:namespace/>expiryDate").val("");
			$("#sezStatusEnrollDocuments").val("");
			$("#commonuploadpopup").modal("show");
			$('.custom-file-label').html('Choose File');
			$("#sezStatusDocumentuploadCounter").val(counterVal);
			$("#<portlet:namespace/>documentName").val(documentName);
	}
	function supportingDocumentUpload(){
		 	var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		    var issueDate = $("#<portlet:namespace/>issueDate").val();
		    var expiryDate=$("#<portlet:namespace/>expiryDate").val();
			var documentName = $("#<portlet:namespace/>documentName").val();
			var documentuploadCounter = $("#sezStatusDocumentuploadCounter").val();
		    var fileID = 'sezStatusEnrollDocuments';
		    $("#commonuploadpopup").modal("hide");
		    $('.hidden'+documentuploadCounter).removeClass('hide');
		    var progress = document.getElementById('progress'+documentuploadCounter);
		    progress.ariaValueNow = 50;
		    progress.style.width ='50%';
		    sezStatusApplicationId=$("#sezStatusApplicationId").val();
		    $.ajaxFileUpload({
		        secureuri: false,
		        method: "POST",
		        fileElementId: 'sezStatusEnrollDocuments',
		        url: '${sezDoucumentsUpload}',
		        dataType: 'text',
		        data: {
		            "<portlet:namespace/>documentNumber": documentNumber,
		            "<portlet:namespace/>documentName": documentName,
		            "<portlet:namespace/>fileID": fileID,
		            "<portlet:namespace/>command": "fileUpload",
		            "<portlet:namespace/>issueDate": issueDate,
		            "<portlet:namespace/>expiryDate": expiryDate,
		            "<portlet:namespace/>documentuploadCounter": documentuploadCounter,
		            "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
		        },
		        success: function (data, status) {
		        	var progress = document.getElementById('progress'+documentuploadCounter);
		            progress.ariaValueNow = 100;
		            progress.style.width ='100%';
		            $('.hidden'+documentuploadCounter).addClass('hide');
		            $("#uploadedFormResult"+documentuploadCounter).html(data);
		            $("#<portlet:namespace/>uploaded-documents"+documentuploadCounter).hide();
		            $(".uploaded-info").removeClass("hide");
		            if(data != ""){
		            	$("#documentUpload"+documentuploadCounter).addClass("disabled");	
		            }
		            updatedFillDoc =$(".supporting-document-card").find(".uploaded-info").length;
		            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
		            filledDocument=updatedFillDoc-genericFilledDoc;
					if(numberOfDocument == filledDocument){
			        	$("#SezStatusSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			        }
	        },
		        error: function () {
		        }
		    });
		}
	
	function opendelDocPopup(fileEntry,counter){
		$("#sezStatusDocumentuploadCounter").val(counter);
		$("#deletepopup"+fileEntry).modal("show");
	}
	
	
	$(document).ready(function () {
	    var selectedFiles = [];
	    var selectedGenericFiles = [];
	    
	    function updateFileInput() {
	        var newFileList = new DataTransfer();
	        for (var i = 0; i < selectedFiles.length; i++) {
	            newFileList.items.add(selectedFiles[i]);
	        }
	        $('#sez-application-generic-upload')[0].files = newFileList.files;
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

	    $(document).on('change', '#sez-application-generic-upload', function () {
	        var files = $(this)[0].files;
	        var newFiles = [];

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
	            var sezStatusApplicationId = "<%=sezStatusApplicationId%>";
	        	if(sezStatusApplicationId > 0 ){
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
	            $("#SezStatusPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#SezStatusPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
	  function deleteDoc(id) {
			var currentId = id;
			$(".document-container-preview"+currentId).remove();
		}
	  function openSezStatusSaveToSubmitPopup(){
			applicantWorkOfHomeStatus=$("#applicantStatusVal").val();
			 sezStatusApplicationId=$("#sezStatusApplicationId").val();
			 typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
			 lastFormDetailsStep = $(".tab-pane.active").attr("id");
			 doYouWantTo=$("#sez-status-type-option-value").val();
			 if(doYouWantTo=="Submit an Application for A Work From Home Certificate"){
				 $("#sez_woek_from_pop-app_no").html("Work from Home Status");
			 }
		 if(typeOfSezStatus=="SEZ Occupant"){
			 var occupantZoningCheckBoxArray = new Array();
			  $("input:checkbox[name=sezOccuZoningClassification]:checked").each(function () {
				  occupantZoningCheckBoxArray.push($(this).val());
			  });
			 typeOfTransaction=$("#sez-occupant-type-option-value").val();
			 typeOfIndustry=$("#sez-occu-industry-option-value").val();
			 sezApplicationParish=$("#sezOccuParish").val();
			 var zoningClassificationCheckBoxInfo=occupantZoningCheckBoxArray.toString();
			 var occupantSpecialEconomicZoneArray=  $("input:radio[name=sezOccuEconomicZone]:checked").val();

		 }else if(typeOfSezStatus=="SEZ Developer"){
			 var zoningValueCheckBoxArray = new Array();
			  $("input:checkbox[name=sezDevzoningClassification]:checked").each(function () {
				  zoningValueCheckBoxArray.push($(this).val());
			  });	
			 typeOfTransaction=$("#sez-developer-type-option-value").val();
			 typeOfIndustry=$("#sez-dev-industry-option-value").val();
			 sezApplicationParish=$("#sezDevParish").val();
			 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
			 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezDevEconomicZone]:checked").val();
			 }else if(typeOfSezStatus == "SEZ Zone User"){
				 
				 var zoningValueCheckBoxArray = new Array();
				  $("input:checkbox[name=sezZoneUserZoningClassification]:checked").each(function () {
					  zoningValueCheckBoxArray.push($(this).val());
				  });	
				 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezZoneEconomicZone]:checked").val();
				 typeOfTransaction=$("#sez-zone-type-option-value").val();
				 typeOfIndustry=$("#sez-zone-user-option-value").val();
				 sezApplicationParish=$("#sezZoneParish").val();
				 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
			 }		
			 $.ajax({
				    type: "POST",
				    url: "${sezStatusFinalSubmitUrl}",
				    data: {
				    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
				    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
				    	  "<portlet:namespace/>typeOfIndustry": typeOfIndustry,
				    	  "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
				    	  "<portlet:namespace/>specialEconomicZoneCheckBoxInfo": specialEconomicZoneCheckBoxInfo,
				    	  "<portlet:namespace/>zoningClassificationCheckBoxInfo": zoningClassificationCheckBoxInfo,
				    	  "<portlet:namespace/>sezApplicationParish": sezApplicationParish,
				    	  "<portlet:namespace/>doYouWantTo": doYouWantTo,
				    	  "<portlet:namespace/>applicantWorkOfHomeStatus": applicantWorkOfHomeStatus,
				      		    },
				    success: function (data) {
				    	var result = data.APP_DATA;
				    	var appStatus = result["status"];
						   if(appStatus=="submitted"){
						   		$("#continueDashboardSezStatus").removeClass("hide");
						   		$("#submitted-content").removeClass("hide");
						   		$("#application_submitted-img").removeClass("hide");
						   	}else{
						   		$("#draft-content").removeClass("hide");
						   		$("#application_draft-img").removeClass("hide");
						   		$("#application_submitted-img").addClass("hide");
						   	}
						$(".custom_loader").addClass("hide");
				    	if(result!=null){
				    	$("#submit_pop_app_no").html(result["sezStatusAppNo"]);
				    	$("#submit_pop_status").html(result["status"]);
				    	$("#submitted-status").html(result["sezStatus"]);
				    	}
				    	
				    	developerDetails();
		 	    },
				    error: function (data) {
				    },
				  });
		}
	function openSaveToDraftPopupSez(){
		debugger;
		 sezStatusApplicationId=$("#sezStatusApplicationId").val();
		 typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 sezStatusType = $("#sez-status-type-option-value").val();
		 typeOfTransaction="";
		 typeOfIndustry="";
		 saveAndContinue="true";
		 specialEconomicZoneCheckBoxInfo="";
		 zoningClassificationCheckBoxInfo="";
		 sezApplicationParish="";
		 typeOfTransactionWFH="";
		 ApplicantStatus="";
		 controlNumber="";
		 if(sezStatusType == "Submit an Application for SEZ Status"){
			 if(typeOfSezStatus=="SEZ Developer"){
				 currentFormToSave=$(".sezDevApplicationFormTab").find(".active span:nth-child(2)").text();
					if(currentFormToSave=="General Business Information"){
						developerGeneralBusinessInfo(true);
						addVentureComInfoBox();
					}else if(currentFormToSave=="Shareholding/Partnership/ Director Information"){
						/*addShareholderDetailBox();
						addDirectorShareholdersBox();
						addComDirectorBox();
						addCorporationBox();
						addDirectorBankruptInvolveBox();*/
						developerShareholdingInfo(true);
				 	}else if(currentFormToSave=="Existing and Proposed Project Brief"){
				 		// addOperatingZoneLocationBox();
				 		developerProposedPorjectInfo(true);
				 	}else if(currentFormToSave=="Proposed Development Plan"){
				 		developerProposedDevelopmentInfo(true);
				 	}else if(currentFormToSave=="Employee Safety and Security"){
				 		/* addSecurityMeasuresBox();
				 		addOccuSafetySystemBox(); */
						developerEmployeeSafety(true);
				 	}else if(currentFormToSave=="Employment Information"){
				 		developerEmployementInfo(true);
				 	}else if(currentFormToSave=="Disaster Management and Emergency Plan"){
				 		/*adddisasterMitigationPlanBox();*/
				 		developerDisasterManagementInfo(true);
				 	}else if(currentFormToSave=="Investment and Financial Information"){
				 		developerInvestmentInfo(true);
				 	}else if(currentFormToSave=="Developer's Undertaking"){
				 		developerUndertakingInfo(true);
				 		uploadDocuments('applicant-signature-upload-btn','Signature of Occupant  Declarant');
						uploadDocuments('public-notary-signature-upload-btn','Signature of Developer Public Notary');
				 	}else if(currentFormToSave=="Submission Checklist"){
				 		developerSubmissionChecklistInfo();
				 		uploadDocuments('sign-req-upload-btn','Signature of Developer Submission Checklist');
				 	}	
			 }
			 if(typeOfSezStatus=="SEZ Occupant"){
				 currentFormToSave=$(".sezOccApplicationFormTab").find(".active span:nth-child(2)").text();
					if(currentFormToSave=="General Business Information"){
						occupantGeneralBusinessInfo(true);
					}else if(currentFormToSave=="Shareholding/Partnership/ Director Information"){
						/*addOccDirectorDetailBox();
						addOccDirectorShareholdersBox();
						addOccPrincipalOfficersBox();*/
						occupantShareholdingInfo(true);
				 	}else if(currentFormToSave=="Existing and/or Proposed Project Brief"){
				 		// addOccFreeZoneLocBox();
				 		occupantProposedProjInfo(true);
				 	}else if(currentFormToSave=="Proposed Area Development Plan"){
				 		occupantProposedDevelopmentInfo(true);
				 	}else if(currentFormToSave=="Investment and Financial Information"){
				 		occupantInvestmentInfo(true);
				 	}else if(currentFormToSave=="Employment Information"){
				 		/* addOccLabourReqBox(); */
						 occupantEmploymentInfo(true);
				 	}else if(currentFormToSave=="Occupant/Zone User Undertaking"){
				 		occupantZoneUndertakingInfo(true);
				 		uploadDocuments('occ-applicant-signature-upload-btn','Signature of Occupant Zone Undertaking');
						uploadDocuments('occ-public-notary-signature-upload-btn','Signature of Occupant Zone Undertaking Notary');
				 	}else if(currentFormToSave=="Developer's Undertaking"){
				 		occupantDeveloperUndertakingInfo(true);
				 		uploadDocuments('occ-dev-applicant-signature-upload-btn','Signature of Occupant Developer Undertaking Stamp');
						uploadDocuments('occ-dev-public-notary-signature-upload-btn','Signature of Occupant Developer Undertaking Notary');
				 	}else if(currentFormToSave=="Submission Checklist"){
				 		occupantSubmissionChecklistInfo();
				 		uploadDocuments('occ-sign-req-upload-btn','Signature of Occupant Submission Checklist Stamp');
				 	}	
			 }
			 if(typeOfSezStatus=="SEZ Zone User"){
				 currentFormToSave=$(".sezZoneApplicationFormTab").find(".active span:nth-child(2)").text();
					if(currentFormToSave=="General Business Information"){
						zoneGeneralBusinessInfo(true);
					}else if(currentFormToSave=="Existing and/or Proposed Project Brief"){
						//addZoneUserFreeZoneLocBox();
						zoneProposedProjInfo(true);
				 	}else if(currentFormToSave=="Investment and Financial Information"){
				 		zoneInvestmentInfo(true);
				 	}else if(currentFormToSave=="Employment Information"){
				 		/*addZoneUserLabourReqBox();*/
				 		zoneEmploymentInfo(true);

				 	}else if(currentFormToSave=="Zone User's Undertaking"){
				 		zoneZoneUserUndertakingInfo(true);
				 		uploadDocuments('zone-user-applicant-signature-upload-btn','Signature of Zone User Undertaking Declarant');
						uploadDocuments('zone-user-public-notary-signature-upload-btn','Signature Of Zone User Undertaking Notary');
				 	}else if(currentFormToSave=="Developer's Undertaking"){
				 		zoneDeveloperUndertakingInfo(true);
				 		uploadDocuments('zone-user-dev-applicant-signature-upload-btn','Signature of Zone User Developer Declarant');
						uploadDocuments('zone-user-dev-public-notary-signature-upload-btn','Signature Of Zone User Developer Notary');
				 	}else if(currentFormToSave=="Submission Checklist"){
				 		zoneSubmissionChecklistInfo();
				 		uploadDocuments('zone-user-sign-req-upload-btn','Signature of Zone User Submission');
				 	}
			 }
		 }	 
		 if(sezStatusType == "Submit an Application for A Work From Home Certificate"){
			 currentFormToSave=$(".sezWorkFromHomeApplicationFormTab").find(".active span:nth-child(2)").text(); 
			 if(typeTransactionType == "New" || typeTransactionType == "Renewal"){
				 currentFormToSave=$(".sezWorkFromHomeApplicationFormTab").find(".active span:nth-child(2)").text();
				 if(currentFormToSave=="Work From Home"){
					 addWorkFormHomeInfo();
					 addWfhLocationDetail();
				 }
			 }
		 }
		 if(currentStage == "SUPPORTING DOCUMENTS"){
			 uploadDocuments('sez-application-generic-upload','Generic Documents','');
		   }
		 if(currentStage == "APPLICATION FEES PAYMENT"){
			 submitFeeDetailsInSez();
		   }
		 
	 	if(typeOfSezStatus=="SEZ Occupant"){
		 var occupantZoningCheckBoxArray = new Array();
		  $("input:checkbox[name=sezOccuZoningClassification]:checked").each(function () {
			  occupantZoningCheckBoxArray.push($(this).val());
		  });
		 typeOfTransaction=$("#sez-occupant-type-option-value").val();
		 typeOfIndustry=$("#sez-occu-industry-option-value").val();
		 sezApplicationParish=$("#sezOccuParish").val();
		 var zoningClassificationCheckBoxInfo=occupantZoningCheckBoxArray.toString();
		 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezOccuEconomicZone]:checked").val();
	 	}else if(typeOfSezStatus=="SEZ Developer"){
		 var zoningValueCheckBoxArray = new Array();
		  $("input:checkbox[name=sezDevzoningClassification]:checked").each(function () {
			  zoningValueCheckBoxArray.push($(this).val());
		  });	
		 typeOfTransaction=$("#sez-developer-type-option-value").val();
		 typeOfIndustry=$("#sez-dev-industry-option-value").val();
		 sezApplicationParish=$("#sezDevParish").val();
		 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
		 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezDevEconomicZone]:checked").val();
		 }else if(typeOfSezStatus == "SEZ Zone User"){
			 
			 var zoningValueCheckBoxArray = new Array();
			  $("input:checkbox[name=sezZoneUserZoningClassification]:checked").each(function () {
				  zoningValueCheckBoxArray.push($(this).val());
			  });	
			 typeOfTransaction=$("#sez-zone-type-option-value").val();
			 typeOfIndustry=$("#sez-zone-user-option-value").val();
			 sezApplicationParish=$("#sezZoneParish").val();
			 var zoningClassificationCheckBoxInfo=zoningValueCheckBoxArray.toString();
			 var specialEconomicZoneCheckBoxInfo=  $("input:radio[name=sezZoneEconomicZone]:checked").val();
		 }else if(sezStatusType=="Submit an Application for A Work From Home Certificate"){
			 typeOfTransactionWFH=$("#typeTransactionTypeVal").val();
			 ApplicantStatus=$("#applicantStatusVal").val();
			 controlNumber=$("#controlNumber").val();
		 }
		 $.ajax({
			    type: "POST",
			    url: "${sezStatusPending}",
			    data: {
			    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>typeOfIndustry": typeOfIndustry,
			    	  "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
			    	  "<portlet:namespace/>specialEconomicZoneCheckBoxInfo": specialEconomicZoneCheckBoxInfo,
			    	  "<portlet:namespace/>zoningClassificationCheckBoxInfo": zoningClassificationCheckBoxInfo,
			    	  "<portlet:namespace/>sezApplicationParish": sezApplicationParish,
			    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			    	  "<portlet:namespace/>currentStage": currentStage,
			    	  "<portlet:namespace/>saveAndContinue": saveAndContinue,
			    	  "<portlet:namespace/>typeOfTransactionWFH": typeOfTransactionWFH,
			    	  "<portlet:namespace/>ApplicantStatus": ApplicantStatus,
			    	  "<portlet:namespace/>controlNumber": controlNumber,
			    	  "<portlet:namespace/>doYouWantTo": sezStatusType,
			      		    },
	  		    async:false,
			    success: function (data) { 
			    	debugger;
			    	var result = data.APP_DATA;
			    	$("#sezStatusApplicationId").val(result["sezStatusApplicationId"]);
			    	developerDetails();
			    	var applicationNumber=result["sezApplicationNumber"];
			    	var sezCategory=result["sezCategory"];
			    	if(applicationNumber!=null&&sezCategory!=null){
			    	$("#pop_app_no").html(result["sezApplicationNumber"]);
				    $("#pop_category").html(result["sezCategory"]);
				    $("#draft-status").html(result["category"]);
				    $(".savecountinuePopup").modal("show");
				    if(currentStage == "TYPE OF TRANSACTION"){
						 debugger;
						 if(typeOfSezStatus=="SEZ Occupant"){
							 uploadDocuments('approvalLetter','Occupant Letter of Approval','');	
					  	  	 uploadDocuments('sezDevAgree','Occupant Agreement','');	
						 } if(typeOfSezStatus=="SEZ Zone User"){
							 uploadDocuments('zoneApprovalLetter','Zone Letter of Approval','');	
					  	  	 uploadDocuments('sezZoneDevAgree','Zone Agreement','');	
						 }
					 }
			    	}
	 	    	},
			    error: function (data) {
			    },
			  });
	}
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #sez-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #sez-payment-upload").val('');
	    }
	});
	function activeSelectForm(){
		sezCategory = $("#sez-submit-application-type-option-value").val();
		sezStatusType = $("#sez-status-type-option-value").val();
		if(sezStatusType == "Submit an Application for A Work From Home Certificate"){
			$("#sezOccApplicationForm .tab-pane, #sezZoneApplicationForm .tab-pane, #sezDevApplicationForm .tab-pane").removeClass("active");
			$(".sezOccApplicationFormTab .nav-link, .sezZoneApplicationFormTab .nav-link, .sezDevApplicationFormTab .nav-link").removeClass("active");
			$("#sezWorkFromHomeApplicationForm .tab-pane").removeClass("active");
			$("#sezWorkFromHomeApplicationForm .tab-pane:first").addClass("active");
			$(".sezWorkFromHomeApplicationFormTab .nav-link").removeClass("active");
			$(".sezWorkFromHomeApplicationFormTab .nav-link:first").addClass("active");
		}
		if(sezCategory == "SEZ Developer"){
			$("#sezOccApplicationForm .tab-pane, #sezZoneApplicationForm .tab-pane").removeClass("active");
			$(".sezOccApplicationFormTab .nav-link, .sezZoneApplicationFormTab .nav-link").removeClass("active");
			$("#sezDevApplicationForm .tab-pane").removeClass("active");
			$("#sezDevApplicationForm .tab-pane:first").addClass("active");
			$(".sezDevApplicationFormTab .nav-link").removeClass("active");
			$(".sezDevApplicationFormTab .nav-link:first").addClass("active");
		}
		if(sezCategory == "SEZ Zone User"){
			$("#sezOccApplicationForm .tab-pane, #sezDevApplicationForm .tab-pane").removeClass("active");
			$(".sezOccApplicationFormTab .nav-link, .sezDevApplicationFormTab .nav-link").removeClass("active");
			$("#sezZoneApplicationForm .tab-pane").removeClass("active");
			$("#sezZoneApplicationForm .tab-pane:first").addClass("active");
			$(".sezZoneApplicationFormTab .nav-link").removeClass("active");
			$(".sezZoneApplicationFormTab .nav-link:first").addClass("active");
		}
		if(sezCategory == "SEZ Occupant"){
			$("#sezDevApplicationForm .tab-pane, #sezZoneApplicationForm .tab-pane").removeClass("active");
			$(".sezDevApplicationFormTab .nav-link, .sezZoneApplicationFormTab .nav-link").removeClass("active");
			$("#sezOccApplicationForm .tab-pane").removeClass("active");
			$("#sezOccApplicationForm .tab-pane:first").addClass("active");
			$(".sezOccApplicationFormTab .nav-link").removeClass("active");
			$(".sezOccApplicationFormTab .nav-link:first").addClass("active");
		}
	}
	/ Render document in preview /
	function showDocsPreview(docRenderCount){
		var requiredDoc = $("#requiredCounter").val();
		var notRequiredDoc = $("#notRequiredCounter").val();
		var j;
		// Parse the string values to numbers
		requiredDoc = parseInt(requiredDoc);
		notRequiredDoc = parseInt(notRequiredDoc);
		var notRequireDocCount;
		if(docRenderCount == "1"){
				var requireDocPreview = document.querySelector('#requireDocPreview');
				requireDocPreview.innerHTML="";
				var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
				notRequireDocPreview.innerHTML="";
			if(requiredDoc > 1){
				j = requiredDoc+1;
				notRequireDocCount = requiredDoc + notRequiredDoc;
				$("#requireDocPreviewSection").removeClass("hide");
				for(i=1;i<=requiredDoc;i++){
					requiredDocPre = $("#requiredDoc"+i).html();
					fileUrl = $("#fileUrl"+i).val();
					var requireDocPreview = document.querySelector('#requireDocPreview');
					var previewData = document.createElement('div');
					previewData.innerHTML = '<p class="sub_heading">'+requiredDocPre+'</p><a class="sub_heading_content" id="requireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
					requireDocPreview.append(previewData);
				}
			}else{
				j = 1;
				notRequireDocCount = notRequiredDoc;
			}
			if(notRequiredDoc > 1){
				$("#notRequireDocPreviewSection").removeClass("hide");
				for(i=j;i<=notRequireDocCount;i++){
					notRequiredDocPre = $("#notRequiredDoc"+i).html();
					fileUrl = $("#fileUrl"+i).val();
					documentName = $("#document-name"+i).html();
					var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
					var previewData = document.createElement('div');
					previewData.innerHTML = '<p class="sub_heading">'+notRequiredDocPre+'</p><a class="sub_heading_content" id="nonRequireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
					notRequireDocPreview.append(previewData);
				}
			}
		}
		/ TO APPEND DOC NAME /
		if(requiredDoc > 0){
			for(i=1;i<=requiredDoc;i++){
				documentName = $("#document-name"+i).html();
				$("#requireDocNamePreview"+i).html(documentName);
			}
		}
		if(notRequiredDoc > 0){
			for(i=j;i<=notRequireDocCount;i++){
				documentName = $("#document-name"+i).html();
				$("#nonRequireDocNamePreview"+i).html(documentName);
			}
		}
	}
	function downloadFolder(){
		 typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		 $.ajax({
			    type: "POST",
			    url: "${documentsDownloadFolderUrl}",
			    data: {
			    	  "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
			    	  "<portlet:namespace/>check":"1",
			      		    },
	  		    async:false,
			    success: function (data) { 
	 	    	},
			    error: function (data) {
			    },
			  });
	}
	
	function downloadEntries(documentKitTypee){
		typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
		 if(typeOfSezStatus=="SEZ Developer"){
	    	 $("#download_kit").attr("href","${documentsDownloadFolderUrl}");
			 $("#download_kit").click();
	    }else if(typeOfSezStatus=="SEZ Occupant"){
	    	 $("#download_kit_Occupant").attr("href","${documentsDownloadFolderUrl}");
			 $("#download_kit_Occupant").click();
	    }else if(typeOfSezStatus == "SEZ Zone User"){
	    	 $("#download_kit_Zone_User").attr("href","${documentsDownloadFolderUrl}");
			 $("#download_kit_Zone_User").click();
	    }
		  dataType : 'text',
		  $.ajax({
			    type: "POST",
			    url: "${documentsDownloadFolderUrl}",
			    data: "<portlet:namespace/>typeOfSezStatus=" + typeOfSezStatus,
			    success: function (data) {
	 	    	},
			    error: function (data) {
			    },
			  }); 
	}
	
	function downloadPDF() {
		sezStatusApplicationId=$("#sezStatusApplicationId").val();
        checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${addSezStatusDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if (result && result["fileUrl"]) {
                        $("#sezStatusDownloadPDF").attr("href", result["fileUrl"]);
                        $("#sezStatusDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
        });
    }
	 function renewLicense() {
		 debugger;
		$("#sez-renew-btn").attr("disabled", "disabled");
		$("#farm-renew-btn").attr("disabled", "disabled");
        $("#renewLicenseNumbervalidation").addClass("hide");
        licenseNumber = $("#renew-licence-number").val();
        typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
        controlNumber=$("#controlNumber").val();
        typeOfTransactionWFH=$("#typeTransactionTypeVal").val();
		ApplicantStatus=$("#applicantStatusVal").val();
        wfhCheck="";
       if(controlNumber!=""){
    	   wfhCheck="true";
    	   licenseNumber=controlNumber;
       }
        $.ajax({
                type: "POST",
                url: '${renewLicenseUrl}',
                data: {
                        "<portlet:namespace/>licenseNumber": licenseNumber,
                        "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
                        "<portlet:namespace/>wfhCheck": wfhCheck,
                        "<portlet:namespace/>typeOfTransactionWFH": typeOfTransactionWFH,
                        "<portlet:namespace/>ApplicantStatus": ApplicantStatus,
                },
                success: function(data) {
                	var result = data.APP_DATA;
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var validation=result["licenseNumberCheck"];
                	console.log(validation);
                        if (validation == 0) {
                                $("#renewLicenseNumbervalidation").removeClass("hide");
                                $("#sez-renew-btn").removeAttr("disabled"); 
                        }else{
                        	window.location.href = renewLicenseUrl;
                        }
                },
                error: function(data) {}
        });
	} 
	 function renewLicenseOcc() {
			$("#sez-occ-renew-btn").attr("disabled", "disabled");
	        $("#renewLicenseNumbervalidationOcc").addClass("hide");
	        licenseNumber = $("#occ-renew-licence-number").val();
	        typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
	       
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber": licenseNumber,
	                        "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
	                        
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                	console.log(validation);
	                        if (validation == 0) {
	                                $("#renewLicenseNumbervalidationOcc").removeClass("hide");
	                                $("#sez-occ-renew-btn").removeAttr("disabled"); 
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		} 
	 function renewLicenseZone() {
			$("#sez-zone-renew-btn").attr("disabled", "disabled");
	        $("#renewLicenseNumbervalidationZone").addClass("hide");
	        licenseNumber = $("#zone-renew-licence-number").val();
	        typeOfSezStatus=$("#sez-submit-application-type-option-value").val();
	       
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber": licenseNumber,
	                        "<portlet:namespace/>typeOfSezStatus": typeOfSezStatus,
	                        
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                	console.log(validation);
	                        if (validation == 0) {
	                                $("#renewLicenseNumbervalidationZone").removeClass("hide");
	                                $("#sez-zone-renew-btn").removeAttr("disabled"); 
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		} 
	
	<!-- Separate Value on Enter -->
	$(document).ready(function () {
		$('input[name="controlNumber"]').tagsinput({
			trimValue: true,
			confirmKeys: [13],
			focusClass: 'my-focus-class'
		});
		
		$('.bootstrap-tagsinput input').on('focus', function() {
			$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
		}).on('blur', function() {
			$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
		});
	});

	function wfmLocationAddInfoSaving(counter){
		if(counter!=null){
			numOfControl=	$(".editControlNumberWfh"+counter).val();
			locationOfCon=$(".editControlNumberLocationWfh"+counter).val();
			parishWfh=$(".editControlNumberParishWfh"+counter).val();
			wfmLocAppId="";
		}else {
			numOfControl = $("#controlNumberWfh").val();
			locationOfCon = $("#controlNumberLocationWfh").val();
			parishWfh = $("#controlNumberParishWfh").val();
			wfmLocAppId="";
		}
		applicationSezId=$("#sezStatusApplicationId").val();
		$.ajax({
			type: "POST",
			url: "${wfmLocationInfoSaveUrl}",
			data: {
				"<portlet:namespace/>controlNumber":numOfControl,
				"<portlet:namespace/>location":locationOfCon,
				"<portlet:namespace/>controlNumberParishWfh":parishWfh,
				"<portlet:namespace/>applicationId":applicationSezId,
				"<portlet:namespace/>wfmLocAppId":wfmLocAppId,
			},
			success: function (data) {
			},
			error: function (data) {
			},
		});
	}
	function deleteAfterSaveConDoc(id) {
	    var fileName = $("#"+id).next().html();
	    sezStatusApplicationId=$("#sezStatusApplicationId").val();
		saveAndCon='<%=sezStatusApplicationId%>';
		if(saveAndCon>0){
		 	 $.ajax({
			        type: "POST",
			        url: '${delteDocAferSaveconUrl}',
			        data: {
			            "<portlet:namespace/>fileName": fileName,
			            "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
			        },
			        success: function (data) {
			        },
			        error: function (data) {
			        }
			    });	
			
		}
	}
</script>