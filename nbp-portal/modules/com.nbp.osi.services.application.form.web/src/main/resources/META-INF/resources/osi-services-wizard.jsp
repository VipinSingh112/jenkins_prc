<portlet:resourceURL var="osiServicePending" id="/osi/service/pending"></portlet:resourceURL>
<portlet:resourceURL var="osiServicesGettingDocumentListUrl" id="/osi/services/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="osiServicesDoucumentsUploadUrl" id="/osi/services/documents/upload"></portlet:resourceURL>
<portlet:resourceURL var="osiServiceDeleteDocumentUrl" id="/osi/service/delete/document/url"></portlet:resourceURL>
<portlet:resourceURL var="osiServicesfeeDetailsUrl" id="/osi/Services/fee/Details/Url"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="renew/License/info"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for</p>
							<p class="common-banner-title f1 mb-0">OSI Services (Certificate of Assignment/Trustee Licence)</p>
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
									<p class="application-form-lower-heading">CERTIFICATE/LICENCE</p> <span></span>
								</li>
								<li>
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">APPLICANT TYPE</p> <span></span>
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
									<p class="application-form-lower-heading">APPLICATION FEES
										PAYMENT</p> <span></span>
								</li>
								<li style="display: none"  class="last-step">
									<p class="application-form-upper-title">Please Verify</p>
									<p class="application-form-lower-heading">OSI SERVICES FORM PREVIEW </p> <span></span>
								</li>
							</ul>
							<input type="hidden" id="osiServicesApplicationId" name="osiServicesApplicationId" value=""> 
							<input type="hidden" id="osiServicesCurrentStage" name="osiServicesCurrentStage"> 
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name ="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=osiServiceApplicationId%>">
						</div>
						<%@ include file="/type-of-certificate/osi-services-certificate-type.jsp"%>
						<%@ include file="/type-of-applicant/osi-services-applicant-type.jsp"%>
						<%@ include file="/forms/osi-services-form-tabs.jsp"%>
						<%@ include file="/supporting-documents/osi-services-documents.jsp"%>
						<%@ include file="/osi-services-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/osi-services-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var filledDocument = "";
var numberOfDocument = "";
var osiDocRenderCount = 1;
var osiTrusteeDocRenderCount = 1;
$("#osiServicesCertificateTypeBox .wizard-card").click(function(){
	$("#osiServicesCertificateTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#certificateTypeVal").val($(this).find(".wizard-title span").html());
	$("#osiServicesApplicantFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	if($("#certificateTypeVal").val() == "Certificate of Assignment"){
		$("#certificateType").removeClass("hide");
		$("#licenceType").addClass("hide");
		$("#certificateType .wizard-card").removeClass("active");
		$("#rm-payment-method, .fee-section").addClass("hide");
		$(".application-Fees .common-heading").text("No Application Fee is applicable for the selected Category.");
	}else{
		$("#licenceType").removeClass("hide");
		$("#certificateType").addClass("hide");
		$("#licenceType .wizard-card").removeClass("active");
		$("#rm-payment-method, .fee-section").removeClass("hide");
		$(".application-Fees .common-heading").text("Application Fee");
	}
	$("#transactionType").addClass("hide");
	$("#osiRenewSection").addClass("hide");
});
$("#certificateType .wizard-card").click(function(){
	$("#certificateType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#assignmentCertificateTypeVal").val($(this).find(".wizard-title").html());
	$("#osiServicesApplicantFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#osiTrusteeLicenceForm").addClass("hide");
	$("#osiTrusteeIndiLicenceForm, .osiTrusteeIndiLicenceFormTab, #osiTrusteeIndiLicencePre, .osiTrusteeIndiLicencePreTab").addClass("hide");
	$("#osiTrusteeComLicenceForm, .osiTrusteeComLicenceFormTab, #osiTrusteeComLicencePre, .osiTrusteeComLicencePreTab").addClass("hide");
	$("#osiAssignmentCertificateForm, .osiAssignmentCertificateFormTab, #osiAssignmentCertificatePre, .osiAssignmentCertificatePreTab").removeClass("hide");
	$("#supportingDocStep").html('5');
	assignmentName = $("#assignmentName").val();
	if(!assignmentName){
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'0.4', 'pointer-events':'none','cursor':'default'});
	}else{
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	}
	$("#osiRenewSection").addClass("hide");
});
$("#licenceType .wizard-card").click(function(){
	$("#licenceType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#trusteeLicenceTypeVal").val($(this).find(".wizard-title").html());
	$("#transactionType .wizard-card").removeClass("active");
	$("#transactionType").removeClass("hide");
	$("#osiServicesApplicantFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#transactionType .wizard-card").click(function(){
	$("#trusteeTransactionTypeVal").val($(this).find(".wizard-title").html());
	$("#osiAssignmentCertificateForm, .osiAssignmentCertificateFormTab, #osiAssignmentCertificatePre, .osiAssignmentCertificatePreTab").addClass("hide");
});
$("#osiNew").click(function(){
	$("#osiRenew").removeClass("active");
	$(this).addClass("active");
	$("#osiServicesApplicantFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#osiRenewSection").addClass("hide");
});
$("#osiRenew").click(function(){
	$("#osiNew").removeClass("active");
	$(this).addClass("active");
	$("#osiServicesApplicantFieldset #save-continue").css({'opacity':'0.4', 'pointer-events':'none','cursor':'default'});
	$("#osiRenewSection").removeClass("hide");
});
$("#individualApplicant").click(function(){
	$("#osiTrusteeIndiLicenceForm, .osiTrusteeIndiLicenceFormTab, #osiTrusteeIndiLicencePre, .osiTrusteeIndiLicencePreTab").removeClass("hide");
	$("#osiTrusteeComLicenceForm, .osiTrusteeComLicenceFormTab, #osiTrusteeComLicencePre, .osiTrusteeComLicencePreTab").addClass("hide");
	$("#supportingDocStep").html('5');
	$("#feePaymentStep").html('6');
	indiBreakdownApplicantName = $("#indiBreakdownApplicantName").val();
	indiBreakdownTrusteeName = $("#indiBreakdownTrusteeName").val();
	if(!indiBreakdownApplicantName && !indiBreakdownTrusteeName){
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'0.4', 'pointer-events':'none','cursor':'default'});
	}else{
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	}
});
$("#companyApplicant").click(function(){
	$("#osiTrusteeIndiLicenceForm, .osiTrusteeIndiLicenceFormTab, #osiTrusteeIndiLicencePre, .osiTrusteeIndiLicencePreTab").addClass("hide");
	$("#osiTrusteeComLicenceForm, .osiTrusteeComLicenceFormTab, #osiTrusteeComLicencePre, .osiTrusteeComLicencePreTab").removeClass("hide");
	$("#supportingDocStep").html('3');
	$("#feePaymentStep").html('4');
	comCorporationName = $("#comCorporationName").val();
	comEmail = $("#comEmail").val();
	if(!comCorporationName && !comEmail){
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'0.4', 'pointer-events':'none','cursor':'default'});
	}else{
		$("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	}
});

var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id"); 
    
    /* Scroll Page to top */
    scrollToPageTop();
    
    doYouWantTo=$("#certificateTypeVal").val();	
	if(currentFieldSet == "osiServicesFormsFieldset"){
		gettingDocumentList();
		/* DOCUMENT VALIDATION */
		var requiredDoc = $("div[id='requiredDoc']").length;
		filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		if(requiredDoc >= 1){
			numberOfDocument = requiredDoc;
			if(numberOfDocument != filledDocument){
				$("#osiServicesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			}
		}
		addSupportingDocument();
		addDocumentListForm();
		if(doYouWantTo=="Certificate of Assignment"){
				assignmentDetailInfo(false);
		}else{
			trusteeType=$("#trusteeLicenceTypeVal").val();		
		if(trusteeType=="Company"){
			}
		}
		gettingDocumentList();
		 /* DOCUMENT VALIDATION */
		var requiredDoc = $("div[id='requiredDoc']").length;
		filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		if(requiredDoc >= 1){
			$(".mandatory-doc-heading").removeClass("hide");
			numberOfDocument = requiredDoc;
			if(numberOfDocument != filledDocument){
				$("#osiServicesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			}
		}
	}
 	 
 	if(currentFieldSet == "osiServicesApplicantFieldset"){
    	pendingOsiService();
    	activeSelectForm();
     }
 	 if(currentFieldSet == "osiServicesFormsFieldset"){
 		      pendingOsiService();
      }

 	if(currentFieldSet == "osiServicesSupportingDocumentFieldset"){
 		uploadDocuments("osiServiceGenericUpload","OSI Services Generic Documents","");
 		//downloadPDF();
    	/* typeOfOsiServices = $("#certificateTypeVal").val();
    	if(typeOfOsiServices == 'Certificate of Assignment'){
    		showDocsPreview(osiDocRenderCount);
    		osiDocRenderCount++;
    	}else{
    		showDocsPreview(osiTrusteeDocRenderCount);
    		osiTrusteeDocRenderCount++;
    	} */
    	pendingOsiService();
     }
	if(currentFieldSet == "osiServicesfeePaymentFieldset"){
		showDocsPreview(osiDocRenderCount);
		osiDocRenderCount++;
		uploadDocuments("osiServiceGenericUpload","OSI Services Generic Documents","");
		downloadPDF();
		showFinalSubmitButton();
		finalPreviewScroll();
		pendingOsiService();
		submitFeeDetailsInOsiService();
		previewApplicantDetailInfo();
		previewInsolventDetailInfo();
		previewCreditorDetailInfo();
		previewAssignmentDetailInfo();
		previewTruteeIndiDetailInfo();
		previewIndiQualificationDetailInfo();
		previewIndiUndersignedDetailInfo();
		previewIndiLicenceBreakdownInfo();
		previewTruteeComDetailInfo();
		pendingOsiService();
		$(".fee-amount-preview").html($("#amountPaid").val());
    	$(".fee-currency-preview").html($("#amountCurrency").val());
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
 	function showFinalSubmitButton(){
		var currentFieldSet = $(".wizard-fieldset.show").attr("id");
		if(currentFieldSet == "osiServicesfeePaymentFieldset" || currentFieldSet == "osiServicesFormPreviewFieldset"){
	        	$(".form-wizard-next-btn ").hide();
	        	$(".form-wizard-save-btn").hide();
	        	$(".final-submit").removeClass("hide");
	        }else{
	        	$(".form-wizard-next-btn").show();
	        	$(".form-wizard-save-btn").show();
	        	$(".final-submit").addClass("hide");
	        }
	}

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
	function prevTab(elem) {
		$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

	}
	});
		$("#transactionType a").click(function () {
			  $("#trusteeTransactionTypeVal").val(
			    $(this).find(".wizard-title").html()
			  );
			});
		$("#licenceType a").click(function () {
			  $("#trusteeLicenceTypeVal").val(
			    $(this).find(".wizard-title").html()
			  );
			});
		$("#certificateType a").click(function () {
			  $("#assignmentCertificateTypeVal").val(
			    $(this).find(".wizard-title").html()
			  );
			});
		$("#osiServicesCertificateTypeBox a").click(function () {
			  $("#certificateTypeVal").val(
			    $(this).find(".wizard-title").html()
			  );
			});
	function pendingOsiService(){
	osiServiceApplicationId=$("#osiServicesApplicationId").val();
	assignmentCertificateTypeVal=$("#assignmentCertificateTypeVal").val();		
	trusteeLicenceTypeVal=$("#trusteeLicenceTypeVal").val();		
	trusteeTransactionTypeVal=$("#trusteeTransactionTypeVal").val();
	certificateTypeVal=$("#certificateTypeVal").val();
	 lastFormDetailsStep = $(".tab-pane.active").attr("id");
	 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	 $.ajax({
		    type: "POST",
		    url: "${osiServicePending}",
		    data: {
		    	 "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
		    	 "<portlet:namespace/>assignmentCertificateTypeVal": assignmentCertificateTypeVal,
		    	 "<portlet:namespace/>trusteeLicenceTypeVal": trusteeLicenceTypeVal,
		    	 "<portlet:namespace/>trusteeTransactionTypeVal": trusteeTransactionTypeVal,
		    	 "<portlet:namespace/>certificateTypeVal": certificateTypeVal,
		    	 "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
		    	 "<portlet:namespace/>currentStage": currentStage,
		      		    },
		    success: function (data) {
		    	var result = data.APP_DATA;
		        	$("#osiServicesApplicationId").val(result["osiServiceApplicationId"]);
	    },
		    error: function (data) {
		    },
		  });
	}
	function finalSubmitOsiServicesApp(){
		 $(".final-submit-container").removeClass("hide");	
		 /* $(".final-submit-content").css({"opacity":"0.4"}); */
		 submitOsiService();
	}
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
	
	$( "#osi-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#osi-payment-file-chosen").html(selectedfiles);
	});
	
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	   	$(".fee-method-preview").html($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #osi-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #osi-payment-upload").val('');
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
	$("select.car-payment-method").change(function(){
	    var selectedMethod = $(this).children("option:selected").val(); 
	    if (selectedMethod == "Other"){
	    	$("#car-payment-method-other-option, car-payment-method-other-option-pre").removeClass("hide");
	    	$("#car-payment-proof-option, #car-payment-proof-option-pre").addClass("hide");
	    }else{
	    	$("#car-payment-method-other-option, #car-payment-method-other-option-pre").addClass("hide");
	    	$("#car-payment-proof-option, #car-payment-proof-option-pre").removeClass("hide");
	    }
	});
	
	
	function gettingDocumentList() {
		certificateTypeVal = $("#certificateTypeVal").val();
		natureOfApplicant=$("#trusteeLicenceTypeVal").val();
		osiServiceApplicationId = $("#osiServicesApplicationId").val();
		$
				.ajax({
					type : "POST",
					url : "${osiServicesGettingDocumentListUrl}",
					data : {
						"<portlet:namespace/>certificateTypeVal" : certificateTypeVal,
						"<portlet:namespace/>natureOfApplicant" : natureOfApplicant,
						"<portlet:namespace/>osiServiceApplicationId" : osiServiceApplicationId,
					},
					success : function(data) {
						$("#documentList").html(data);
						numberOfDocument =$("div[id='requiredDoc']").length;
	  	   		        filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		  	   			if(numberOfDocument != filledDocument){
		  	     	   		$("#osiServicesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  	        	}
					},
					error : function(data) {
					},
				});
	}
	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#osiServicesEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#osiServicesDocumentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
	function supportingDocumentUpload() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#osiServicesDocumentuploadCounter").val();
		var fileID = 'osiServicesEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		osiServiceApplicationId = $("#osiServicesApplicationId").val();
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'osiServicesEnrollDocuments',
					url : '${osiServicesDoucumentsUploadUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>documentName" : documentName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>osiServiceApplicationId" : osiServiceApplicationId,
					},
					success : function(data, status) {
						var progress = document.getElementById('progress'+ documentuploadCounter);
						progress.ariaValueNow = 100;
						progress.style.width = '100%';
						$('.hidden' + documentuploadCounter).addClass('hide');
						$("#uploadedFormResult" + documentuploadCounter).html(data);
						$("#<portlet:namespace/>uploaded-documents"+ documentuploadCounter).hide();
						$(".uploaded-info").removeClass("hide");
						if (data != "") {
							$("#documentUpload" + documentuploadCounter).addClass("disabled");
						}
						updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
			            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
			            filledDocument=updatedFillDoc-genericFilledDoc;
						if(numberOfDocument == filledDocument){
				        	$("#osiServicesSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				        }
						
					},
					error : function() {
					}
				});
	}
	$(function() {
		$(document).on('change', '#osiServicesEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	
	function opendelDocPopup(counterVal,fileEntryId) {
		$("#osiDocumentuploadCounter").val(fileEntryId);
		$("#deletepopup" + counterVal).modal("show");
	}
	function deleteDocument(fileEntryId) {
		var documentuploadCounter = $("#osiDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${osiServiceDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentChecklist" + documentuploadCounter).removeClass("hide");
				$("#documentUpload"+documentuploadCounter).removeClass("disabled");
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
				var requiredDoc = $("div[id='requiredDoc']").length;
				var notRequireDoc = $("div[id='notRequiredDoc']").length;
	            if(requiredDoc >= 1){
	            if(documentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + documentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#osiServicesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
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
	function deleteDocumentFee(fileEntryId) {
		var documentuploadCounter = $("#osiDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${osiServiceDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentChecklist" + documentuploadCounter).removeClass("hide");
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
	     
	        $("#osi-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    } else {
	        // Otherwise, disable the upload button
	    	$("#osi-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    }
	}
	/* var selectedfiles = "";
	$("#osiServiceGenericUpload").change(function() {
		$("#osiServiceFileChosen").empty();
		for (var i = 0; i < this.files.length; ++i) {
			selectedfiles += '<li>' + this.files.item(i).name + '</li>';
		}
		$("#osiServiceFileChosen").html(selectedfiles);
	}); */
	
	function submitFeeDetailsInOsiService(){
		osiServiceApplicationId = $("#osiServicesApplicationId").val();
	    paymentMethod = $("#paymentMethod").val();
	    paymentFee = $("#paymentFee").val();
	    amountPaid=$("#amountPaid").val();
	    amountCurrency=$("#amountCurrency").val();
	    if(paymentMethod=="Credit Card"){
		    $.ajax({
		        type: "POST",
		        url: '${osiServicesfeeDetailsUrl}',
		        data: {
		          "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
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
			     var fileID = 'osi-payment-upload';
		   		$.ajaxFileUpload({
		   		    secureuri: false,
		   		    method: "POST",
		   		    url: "${osiServicesfeeDetailsUrl}",
		   		    fileElementId: 'osi-payment-upload',
		   		    dataType: 'text',
		   		    data: {
		   		      "<portlet:namespace/>fileID": fileID,
		   		      "<portlet:namespace/>command": "fileUpload",
		   		      "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
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

	function expandDetails(id) {
		var currentIsActive = $("#" + id).hasClass('is-active');
		$("#" + id).removeClass('is-active');
		$("#" + id).next('.accordion__body').removeClass('is-active');
		if (currentIsActive != 1) {
			$("#" + id).addClass('is-active');
			$("#" + id).next('.accordion__body').addClass('is-active');
		}
	}
	$("#assignmentApplicantEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#assignmentApplicantTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#assignmentInsolvenctEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#assignmentInsolvenctTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#assignmentGenInfoEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#assignmentGenInfoTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#assignmentForApplicationEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#assignmentForApplicationTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	
	$("#indiGenInfoEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#indiGenInfoTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#indiQualificationEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#indiQualificationTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#indiSignatureEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#indiSignatureTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#indiBreakdownEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#indiBreakdownTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	
	$("#comBreakdownEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#comBreakdownTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#comSignatureEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#comSignatureTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#comDocumentEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#comDocumentTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#indiDocumentEditTab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $("#indiDocumentTab").trigger("click");
	       $(".form-section").addClass("active");
	       $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
	       $(".last-step").removeClass("active");
	       scrollToPageTop();
	   });
	$("#supporting-doc-edit-tab").click(function(){
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesSupportingDocumentFieldset').addClass("show", "400");
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
		   $('#osiServicesFormPreviewFieldset').removeClass("show");
		   $('#osiServicesfeePaymentFieldset').addClass("show", "400");
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
	function activeSelectForm(){
		certificateTypeVal = $("#certificateTypeVal").val();
		if(certificateTypeVal == "Certificate of Assignment"){
			$("#osiTrusteeIndiLicenceForm .tab-pane, #osiTrusteeComLicenceForm .tab-pane").removeClass("active");
			$(".osiTrusteeIndiLicenceFormTab .nav-link, .osiTrusteeComLicenceFormTab .nav-link").removeClass("active");
			
			$("#osiAssignmentCertificateForm .tab-pane").removeClass("active");
			$("#osiAssignmentCertificateForm .tab-pane:first").addClass("active");
			$(".osiAssignmentCertificateFormTab .nav-link").removeClass("active");
			$(".osiAssignmentCertificateFormTab .nav-link:first").addClass("active");
		}
		if(certificateTypeVal == "Trustee Licence"){
			trusteeLicenceTypeVal = $("#trusteeLicenceTypeVal").val();
			if(trusteeLicenceTypeVal == "Individual"){
				$("#osiAssignmentCertificateForm .tab-pane, #osiTrusteeComLicenceForm .tab-pane").removeClass("active");
				$(".osiAssignmentCertificateFormTab .nav-link, .osiTrusteeComLicenceFormTab .nav-link").removeClass("active");
				
				$("#osiTrusteeIndiLicenceForm .tab-pane").removeClass("active");
				$("#osiTrusteeIndiLicenceForm .tab-pane:first").addClass("active");
				$(".osiTrusteeIndiLicenceFormTab .nav-link").removeClass("active");
				$(".osiTrusteeIndiLicenceFormTab .nav-link:first").addClass("active");
			}else{
				$("#osiTrusteeIndiLicenceForm .tab-pane, #osiAssignmentCertificateForm .tab-pane").removeClass("active");
				$(".osiTrusteeIndiLicenceFormTab .nav-link, .osiAssignmentCertificateForm .nav-link").removeClass("active");
				
				$("#osiTrusteeComLicenceForm .tab-pane").removeClass("active");
				$("#osiTrusteeComLicenceForm .tab-pane:first").addClass("active");
				$(".osiTrusteeComLicenceFormTab .nav-link").removeClass("active");
				$(".osiTrusteeComLicenceFormTab .nav-link:first").addClass("active");
			}
		}
	}
	
	$(document).ready(function () {
	    var selectedFiles = [];
	    var selectedGenericFiles = [];
	    
	    function updateFileInput() {
	        var newFileList = new DataTransfer();
	        for (var i = 0; i < selectedFiles.length; i++) {
	            newFileList.items.add(selectedFiles[i]);
	        }
	        $('#osiServiceGenericUpload')[0].files = newFileList.files;
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

	    $(document).on('change', '#osiServiceGenericUpload', function () {
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
	            var osiServiceApplicationId = "<%=osiServiceApplicationId%>";
	        	if(osiServiceApplicationId > 0 ){
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
	            $("#osiServicesFormPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#osiServicesFormPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});

	/*$(function () {
		$(document).on('change', '#osiServiceGenericUpload', function () {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('#osiServiceFileChosen').html(fileName);

			var files = $(this)[0].files;

	   if (files.length > 0) {
	            
	            $('#uploaded-documents-container').empty();
	            selectedFiles = []; // Clear the selected files array
	            var counter=1;

	            for (var i = 0; i < files.length; i++) {
	                var fileName = files[i].name;
	                selectedFiles.push(files[i]); // Add each file to the selectedFiles array

	                // Create a container for each document and its delete button
	                var documentContainer = $('<div class="document-container"></div>');

	                // Create a delete button for the document
	                var deleteButton = $('<a class="uploaded-delete mr-2" href="#" onclick="deleteDoc('+counter+')"><svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524"></path></svg></a>');

	                // Append the delete button and document name to the container
	                documentContainer.append(deleteButton);
	                documentContainer.append('<span>' + fileName + '</span>');

	                // Append the document container to the documents container
	                $('#uploaded-documents-container').append(documentContainer);
	                counter++;
	            }

	            // Show the delete buttons
	            $('.uploaded-delete').show();
	        	$(".noAdditionalSupportingDoc").hide();
				$(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				$("#osiServicesFormPreviewFieldset .custom_loader").removeClass("hide");
				$(".preview-section").addClass("hide");
	   } else {
	            // If no files are selected, hide any existing delete buttons
	            $('.uploaded-delete').hide();
	        	$(".noAdditionalSupportingDoc").show();
				$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
				$("#osiServicesFormPreviewFieldset .custom_loader").addClass("hide");
				$(".preview-section").removeClass("hide");
	        }



		})
	});*/

	 $(document).ready(function () {
    	$('input[name="indiGivenName"], input[name="indiOtherLegalNames"]').tagsinput({
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


	 
	  function deleteDoc(id) {
			var currentId = id;
			$(".document-container-preview"+currentId).remove();
		}
	 
	 function osiServiceRenewLicense() {
			$("#osi-services-renew-btn").attr("disabled", "disabled");
	        $("#renewLicenseNumbervalidation").addClass("hide");
	        licenseNumber = $("#renew-licence-number").val();
	        permitNumber = $("#renew-permit-number").val();
	        natureOfApplicant = $("#trusteeLicenceTypeVal").val();
	        doYouWant= $("#certificateTypeVal").val();	
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber": licenseNumber,
	                        "<portlet:namespace/>permitNumber": permitNumber,
	                        "<portlet:namespace/>natureOfApplicant": natureOfApplicant,
	                        "<portlet:namespace/>doYouWant": doYouWant,
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                        if (validation == 0) {
	                                $("#renewLicenseNumbervalidation").removeClass("hide");
	                                $("#osi-services-renew-btn").removeAttr("disabled"); 
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		}
	 
	 function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
		    osiServiceApplicationId=$("#osiServicesApplicationId").val();
			saveAndCon='<%=osiServiceApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
				
			}
		}
</script>