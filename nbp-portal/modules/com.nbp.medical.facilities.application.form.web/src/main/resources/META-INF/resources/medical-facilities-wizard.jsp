<portlet:resourceURL var ="medicalDoucumentsUpload" id="/supporting/Document/Upload"></portlet:resourceURL>
<portlet:resourceURL var ="draftMedicalFacilitiesApplicationUrl" id="/draft/medical/app/url"></portlet:resourceURL>
<portlet:resourceURL var ="medicalFeeDetailsUrl" id="/fee/medical/payment/url"></portlet:resourceURL>
<portlet:resourceURL var ="deletedocumentUrl" id="/delete/document/Url"></portlet:resourceURL>
<portlet:resourceURL var="medicalDownloadPdfUrl" id="/medical/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license/url"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for Registration of an</p>
							<p class="common-banner-title f1 mb-0">Institutional Healthcare Facility / Healthcare Facility</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support"
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
					<form action="" method="post" role="form" enctype="multipart/form-data">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">APPLICANT NATURE</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">TYPE OF CATEGORY</p> <span></span>
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
			                       <span></span>
			                    </li>
							</ul>
							<input type="hidden" id="medicalApplicationId" name="medicalApplicationId" value=""> 
							<input type="hidden" id="medicalCurrentStage" name="medicalCurrentStage">
							<input type="hidden" id="permitNumber" name="permitNumber">
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=medicalApplicationId%>">
						</div>
						<%@ include file="/type-of-applicant/medical-applicant-type.jsp"%>
						<%@ include file="/registration-category/medical-registration-category.jsp"%>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/medical-documents.jsp"%>
						<%@ include file="/medical-fee-payment.jsp"%>
             			<%@ include file="/preview/final-preview-tabs.jsp"%>
             			<%@ include file="/medical-final-submission.jsp" %>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var filledDocument = "";
var numberOfDocument = "";
var docRenderCount;
var medicalfacilitiesDocCount=1;
	$(".appicant-type .wizard-card").click(function(){
		$(".appicant-type .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#medicalApplicantTypeVal").val($(this).find(".wizard-title").html());
		$(".transaction-type .wizard-card").removeClass("active");
		$(".transaction-type").removeClass("hide");
		if($("#medicalApplicantTypeVal").val() == "Company/Society/Association"){
			$(".company-form").removeClass("hide");
		}else{
			$(".company-form").addClass("hide");
		}
		$("#applicantNature").html($("#medicalApplicantTypeVal").val());
	});
	$(".transaction-type .wizard-card").click(function(){
		$(".transaction-type .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#medicalTransactionTypeVal").val($(this).find(".wizard-title").html());
		if($("#medicalTransactionTypeVal").val() == "Renewal"){
			$("#medicalRenewSection").removeClass("hide");
		}else{
			$("#medicalRenewSection").addClass("hide");
		}
		$("#medicalFacilitiesCategoryType .wizard-card").removeClass("active");
		$("#medicalFacilitiesCategoryType .wizard-title").removeClass("text-white");
		$(".long-term-category, .nursing-homes-category, .residents-capacity-category").addClass("hide");
		$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	});
	var selectedMedicalFacilitiesCategories = new Array();
	
	$("#medicalFacilitiesCategoryType .wizard-card").click(function () {
		$("#medicalFacilitiesCategoryType .wizard-card").removeClass("active");
		$("#medicalFacilitiesCategoryType .wizard-title").removeClass("text-white");
	    $(this).addClass("active");
	    $(this).find(".wizard-title").addClass("text-white");
	    $("#medicalFacilitiesCategoryTypeVal").val($(this).find(".wizard-title").html());
	    var medicalFacilitiesCategory = $("#medicalFacilitiesCategoryTypeVal").val();
	    $(".nursing-homes-subcategory, .residents-capacity-category").addClass("hide");
	    $("#longTermFeeIcon, #hospitalsFeeIcon, #ambulatoryFacilitiesFeeIcon").addClass("hide");
	    if(medicalFacilitiesCategory == "Long Term Care Facilities"){
	    	console.log("medicalFacilitiesCategory - "+medicalFacilitiesCategory);
	    	$(".long-term-category").removeClass("hide");
	    	$(".residents-capacity-category, .nursing-homes-category, .medical-Facilities-Sub-Category").addClass("hide");
	    	$("#payment_category").html("Long Term Care Facilities");
	    	$("#longTermFeeIcon").removeClass("hide");
	    }else{
	    	$(".medical-Facilities-Sub-Category .wizard-card").removeClass("active");
	    	$(".medical-Facilities-Sub-Category").removeClass("hide");
	    	$(".long-term-category, .nursing-homes-category").addClass("hide");
	    }
	    if(medicalFacilitiesCategory == "Hospitals"){
	    	$("#payment_category").html("Hospitals");
	    	$("#hospitalsFeeIcon").removeClass("hide");
	    }
	    if(medicalFacilitiesCategory == "Ambulatory Facilities"){
	    	$("#payment_category").html("Ambulatory Facilities");
	    	$("#ambulatoryFacilitiesFeeIcon").removeClass("hide");
	    }
	    /* $("#medicalFacilitiesCategoryType").find(".wizard-card.active .wizard-title").each(function () {
	    	selectedMedicalFacilitiesCategories.push($(this).html());
	    }); */
	    
	   /*  if(selectedMedicalFacilitiesCategories.length > 1 && selectedMedicalFacilitiesCategories.includes("Long Term Care Facilities")){
	    	$(".long-term-category").removeClass("hide");
		}else{
			$(".long-term-category, .nursing-homes-category, .residents-capacity-category").addClass("hide");
		}
	    if (selectedMedicalFacilitiesCategories.length === 1 && selectedMedicalFacilitiesCategories[0] === "Long Term Care Facilities") {
	    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    	$(".residents-capacity-category").removeClass("hide");
	    } */
	    /* if(selectedMedicalFacilitiesCategories.length == 0){
	    	$(".residents-capacity-category").addClass("hide");
	    	$(".residents-capacity-category .wizard-card").removeClass("active");
	    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    }else{
	    	$(".residents-capacity-category").removeClass("hide");
	    } */
	    $(".wizard-navigation-box-right").removeClass("hide");
	});
	
	$(".medical-Facilities-Sub-Category .wizard-card").click(function(){
		$(".medical-Facilities-Sub-Category .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#medicalFacilitiesSubCategoryTypeVal").val($(this).find(".wizard-title").html());
		$(".residents-capacity-category").removeClass("hide");
    	$(".residents-capacity-category .wizard-card").removeClass("active");
    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    	$(".not-maternity-home, .maternity-home").addClass("hide");
    	medicalFacilitiesSubCategory = $("#medicalFacilitiesSubCategoryTypeVal").val();
    	if(medicalFacilitiesSubCategory == "Maternity"){
    		$(".maternity-home").removeClass("hide");
    	}
		if(medicalFacilitiesSubCategory == "Non-Maternity"){
			$(".not-maternity-home").removeClass("hide");
    	}
		if(medicalFacilitiesSubCategory == "Mixed"){
			$(".not-maternity-home, .maternity-home").removeClass("hide");
    	}
	});
	
	$("#longTermCareTab").click(function(){
		$(".long-term-category .wizard-card").removeClass("active");
		$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	});
	/* var selectedNursingHomesCategories = new Array(); */
	$(".long-term-category .wizard-card").click(function(){
		$(".long-term-category .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#longTermCategoryTypeVal").val($(this).find(".wizard-title").html());
		$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		/* selectedNursingHomesCategories = []; */
		$(".maternity-home").addClass("hide");
	    $(".not-maternity-home").addClass("hide");
		if($("#longTermCategoryTypeVal").val() == "Nursing Homes"){
			$(".nursing-homes-category").removeClass("hide");
			$("#nursingHomesCategoryBox .wizard-card").removeClass("active");
			$("#nursingHomesCategoryBox .wizard-card-title").removeClass("text-white");
			$(".residents-capacity-category").addClass("hide");
			$(".residents-capacity-category .wizard-card").removeClass("active");
		}else{
			$(".nursing-homes-category").addClass("hide");
			$(".residents-capacity-category").removeClass("hide");
			$(".residents-capacity-category .wizard-card").removeClass("active");
			$(".nursing-homes-subcategory").addClass("hide");
		}
	});
	/* $("#nursingHomesCategoryBox .wizard-card").click(function (){
		selectedNursingHomesCategories = [];
	    $(this).toggleClass("active");
	    $(this).find(".wizard-card-title").toggleClass("text-white");
	    $("#nursingHomesCategoryBox").find(".wizard-card.active .wizard-card-title").each(function () {
	    	selectedNursingHomesCategories.push($(this).html());
	    });
	    console.log("array------------"+selectedNursingHomesCategories);
	    $(".residents-capacity-category").removeClass("hide");
	    if(selectedNursingHomesCategories.length == 0){
	    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    	$(".residents-capacity-category .wizard-card").removeClass("active");
	    }
	    if(selectedNursingHomesCategories.includes("Maternity Homes")){
	       $(".maternity-home").removeClass("hide");
	       $(".not-maternity-home").addClass("hide");
	       $(".nursing-homes-subcategory").removeClass("hide");
	       $(".residents-capacity-category").addClass("hide");
	    }else{
	    	$(".maternity-home").addClass("hide");
	    	$(".not-maternity-home").removeClass("hide");
	    }
	}); */
	$("#nursingHomesCategoryBox .wizard-card").click(function () {
	    // Clear the array at the start of the click event
	    selectedNursingHomesCategories = [];

	    $(this).toggleClass("active");
	    $(this).find(".wizard-card-title").toggleClass("text-white");

	    $("#nursingHomesCategoryBox").find(".wizard-card.active .wizard-title").each(function () {
	        selectedNursingHomesCategories.push($(this).html());
	    });

	    console.log("array------------" + selectedNursingHomesCategories);
	    $(".residents-capacity-category").removeClass("hide");

	    if (selectedNursingHomesCategories.length == 0) {
	        $("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	        $(".residents-capacity-category .wizard-card").removeClass("active");
	    }

	    if (selectedNursingHomesCategories.includes("Maternity Homes")) {
	        $(".maternity-home").removeClass("hide");
	        $(".not-maternity-home").addClass("hide");
	        $(".nursing-homes-subcategory").removeClass("hide");
	        $(".nursing-homes-subcategory .wizard-card").removeClass("active");
	        $(".residents-capacity-category").addClass("hide");
	    } else {
	        $(".maternity-home").addClass("hide");
	        $(".not-maternity-home").removeClass("hide");
	        $(".nursing-homes-subcategory").addClass("hide");
	    }
	});

	$(".nursing-homes-subcategory .wizard-card").click(function(){
		$(".nursing-homes-subcategory .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#nursingHomesSubCategoryVal").val($(this).find(".wizard-title").html());
		$(".residents-capacity-category").removeClass("hide");
    	$(".residents-capacity-category .wizard-card").removeClass("active");
    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    	$(".not-maternity-home, .maternity-home").addClass("hide");
    	nursingHomesSubCategory = $("#nursingHomesSubCategoryVal").val();
    	if(nursingHomesSubCategory == "Maternity Only"){
    		$(".maternity-home").removeClass("hide");
    	}
		if(nursingHomesSubCategory == "Mixed"){
			$(".not-maternity-home, .maternity-home").removeClass("hide");
    	}
	});
	$(".residents-capacity-category .wizard-card").click(function(){
		$(".residents-capacity-category .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#residentsCapacityCategoryVal").val($(this).find(".wizard-title").html());
		$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		if($("#residentsCapacityCategoryVal").val() == "Less than 25 Beds"){
			$(".medicalFacilitiesFee").html("5,000.00");
		}else{
			$(".medicalFacilitiesFee").html("10,000.00");
		}
		/* if (selectedMedicalFacilitiesCategories.length === 1 && selectedMedicalFacilitiesCategories[0] === "Long Term Care Facilities") {
	    	$("#medicalRegistrationCategoryFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	    	$(".long-term-category").removeClass("hide");
	    } */
	});
/* 
 medical-facilities-wizard.jsp
 
 $("#miicRegistrationTypeBox .wizard-card").click(function(){
	$("#miicRegistrationTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#miicTransationTypeBox .wizard-card").removeClass("active");
	$("#miicTransationTypeBox").removeClass("hide");
	$("#miicCategoryTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#miicRenewSection").addClass("hide");
});
 $("#miicNewBtn").click(function(){
	$("#miicTransationTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#miicCategoryTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#miicRenewSection").addClass("hide");
 });
$("#miicRenewalBtn").click(function(){
	$("#miicTransationTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#miicRenewSection").removeClass("hide");
	$("#miicCategoryTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});  */

 var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function () {
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        
        /* Scroll Page to top */
        scrollToPageTop();
        
        if(currentFieldSet == "medicalApplicantTypeFieldset"){
			$(".medical-Facilities-Sub-Category, .nursing-homes-subcategory").addClass("hide");

			pendingMedicalFacilities();
			$(".wizard-navigation-box-right").addClass("hide");

			if(medicalfacilitiesDocCount==1){
 				 gettingDocumentList();
     		} 
			 medicalfacilitiesDocCount++;
	
		}
        /* if(currentFieldSet == "miicFormsFieldset"){
        	var requiredDoc = $("#requiredCounter").val();
        	filledDocument = $("#documentList .supporting-document-card").find(".uploaded-info").length;
        	if(requiredDoc > 1){
        		numberOfDocument = requiredDoc;
        		if(numberOfDocument != filledDocument){
            		$("#miicSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
            	}
        	}
        } */
        if(currentFieldSet == "medicalRegistrationCategoryFieldset"){
        	activeSelectForm();
        	pendingMedicalFacilities();
			/* showFormTabNum(); */
			naveTabCount();
        }  
        
        if(currentFieldSet == "medicalfeePaymentFieldset"){
        	//downloadPDF();
        	submitFeeDetailsInMedical();
        	showFinalSubmitButton(); 
        	finalPreviewScroll();
        	previewMethod();
        	previewSignatureDetailInfo();
        	$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());
			pendingMedicalFacilities();
			
			docRenderCount = 1;
        	showDocsPreview(docRenderCount);
			docRenderCount++;
			
        }  
        if(currentFieldSet == "medicalFormsFieldset"){
        	signatureData();
		    pendingMedicalFacilities();
         	/* DOCUMENT VALIDATION */
			var requiredDoc = $("div[id='requiredDoc']").length;
			filledDocument = $("#documentList .supporting-document-card").find(".uploaded-info").length;
			if(requiredDoc >= 1){
				$(".mandatory-doc-heading").removeClass("hide");
				numberOfDocument = requiredDoc;
				if(numberOfDocument != filledDocument){
					$("#medicalSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				}
			}
			/* Call BO Functions */
			addApplicantDetail();
			addCompanyDetail();
			addNursingStaffDetail();
			addMaternityHomeDetail();
        }  
        
        if(currentFieldSet == "medicalSupportingDocumentFieldset"){
			uploadDocuments('medicalGenericUpload','Generic Documents');
			pendingMedicalFacilities();
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
      
      $(".preview-edit-button").click(function(){
  		$('#medicalFormPreviewFieldset').removeClass("show");
  		$('#medicalFormsFieldset').addClass("show", "400");
  		$(".form-wizard-next-btn ").show();
  		$(".form-wizard-save-btn").show();
  		$(".final-submit").addClass("hide");
  		$(".final-submit-container").addClass("hide");
  		formTabId = $(this).prop('id')+"FormTab";
  	    $("#"+formTabId).trigger("click");
  		$(".form-section").addClass("active");
  		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
		$(".last-step").removeClass("active");
		scrollToPageTop();
  	});
      $("#supporting-doc-edit-tab").click(function(){
  		$('#medicalFormPreviewFieldset').removeClass("show");
  		$('#medicalSupportingDocumentFieldset').addClass("show", "400");
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
  		$('#medicalFormPreviewFieldset').removeClass("show");
  		$('#medicalfeePaymentFieldset').addClass("show", "400");
  		$(".form-wizard-next-btn ").show();
  		$(".form-wizard-save-btn").show();
  		$(".final-submit").addClass("hide");
  		$(".final-submit-container").addClass("hide");
  		$(".fee-payment").addClass("active");
  		$(".fp, .fee-payment").removeClass("activated");
		$(".last-step").removeClass("activated");
		$(".last-step").removeClass("active");
		scrollToPageTop();
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

		function prevTab(elem) {
			$(elem).parent().prev()
					.find('a[data-toggle="tab"]').click();

		}
	});
    function showFinalSubmitButton(){
    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    	if(currentFieldSet == "medicalfeePaymentFieldset" || currentFieldSet == "medicalFormPreviewFieldset"){
            	$(".form-wizard-next-btn ").hide();
            	$(".form-wizard-save-btn").hide();
            	$(".final-submit").removeClass("hide");
            }else{
            	$(".form-wizard-next-btn").show();
            	$(".form-wizard-save-btn").show();
            	$(".final-submit").addClass("hide");
            }
    }
    function activeSelectForm(){
		$(".tab-pane").removeClass("active");
		$(".tab-pane:first").addClass("active");
		$("#side-tabs .nav-link").removeClass("active");
		$("#side-tabs .nav-link").addClass("disabled");
		$("#side-tabs .nav-link:first").addClass("active");
		$("#side-tabs .nav-link:first").removeClass("disabled");
	}
    $(document).ready(function () {
    	$('input[name="superintendenceNurseQualifications"], input[name="patientFee"]').tagsinput({
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
   function expandDetails(id){
	    var currentIsActive = $("#"+id).hasClass('is-active');
	    $("#"+id).removeClass('is-active');
	    $("#"+id).next('.accordion__body').removeClass('is-active');
	    if (currentIsActive != 1) {
	        $("#"+id).addClass('is-active');
	        $("#"+id).next('.accordion__body').addClass('is-active');
	    }
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
	
	$("#medical-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#medical-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #medical-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #medical-payment-upload").val('');
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
	
	function openSaveToDraftPopupMedical() {
		natureOfApplicant = $("#medicalApplicantTypeVal").val();
		typeOfTransaction = $("#medicalTransactionTypeVal").val();
		medicalFacilitiesCategory = $("#medicalFacilitiesCategoryTypeVal").val();
		medicalFacilitiesSubCategoryTypeVal = $("#medicalFacilitiesSubCategoryTypeVal").val();
		nursingHomesSubCategoryVal = $("#nursingHomesSubCategoryVal").val();
		longTermCareFacilities = $("#longTermCategoryTypeVal").val();
		if(longTermCareFacilities=="Nursing Homes"){
			selectedNursingHomeCategory = [];
			$("#nursingHomesCategoryBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNursingHomeCategory.push($(this).html());
			});
			nursingHomeCategoryVal = selectedNursingHomeCategory.toString();
		}else{
			nursingHomeCategoryVal = $("#nursingHomeCategoryVal").val();
		}
		residentsFacility = $("#residentsCapacityCategoryVal").val();
		medicalApplicationId = $("#medicalApplicationId").val();
		
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
   	 	
   	 	if(currentFormToSave == "Applicant Details"){
   	 		addApplicantDetail();
   	 	}else if(currentFormToSave == "Home Details"){
   	 		addHomeDetailInfo(true); 
		}else if(currentFormToSave == "Company Details"){
			addCompanyDetail(true); 
		}else if(currentFormToSave == "Nursing Staff"){
			addNureStaffPremises(true); 
			addNursingStaffDetail();
		}else if(currentFormToSave == "Medical Practitioner/ Qualified Nurses"){
			medicalPractitionerQualifiedNurseData(true); 
		}else if(currentFormToSave == "Maternity Home"){
			addMaternityHomeDetail(); 
		}else if(currentFormToSave == "Signature"){
			signatureData(); 
			/* uploadDocuments('signatureUploadBtn','Signature of Applicant Employee'); */
		}
   	 if(currentStage=="SUPPORTING DOCUMENTS"){
   		uploadDocuments('medicalGenericUpload','Generic Documents');
   	   	}
		   $.ajax({
			    type: "POST",
			    url: "${draftMedicalFacilitiesApplicationUrl}",
			    data: {
			    "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			      "<portlet:namespace/>natureOfApplicant": natureOfApplicant,
				  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			      "<portlet:namespace/>medicalFacilitiesCategory": medicalFacilitiesCategory,
			      "<portlet:namespace/>longTermCareFacilities": longTermCareFacilities,
			      "<portlet:namespace/>nursingHomeCategoryVal": nursingHomeCategoryVal,
			      "<portlet:namespace/>medicalFacilitiesSubCategoryTypeVal": medicalFacilitiesSubCategoryTypeVal,
			      "<portlet:namespace/>nursingHomesSubCategoryVal": nursingHomesSubCategoryVal,
			      "<portlet:namespace/>residentsFacility": residentsFacility,
			      "<portlet:namespace/>currentFormToSave": currentFormToSave,
		    	  "<portlet:namespace/>currentStage":currentStage,
			      "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
			     
			    },
			    success: function (data) { 
			     var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			      $("#medicalApplicationId").val(result["medicalApplicationId"]);
			      $("#pop_app_no").html(result["medAppNo"]);
			      $("#pop_status").html(result["appStatus"]);
			      $("#pop_category").html(result["category"]); 
			      $("#pop_typeOfTransaction").html(medicalFacilitiesCategory); 
	    	    },
			    error: function (data) {},
			  });
		$(".savecountinuePopup").modal("show");
	}
	function openMedicalSaveToSubmitPopup() {
		submitMedicalFacilities();
		$(".final-submit-container").removeClass("hide");
	}
	
	function pendingMedicalFacilities() {
		medicalFacilitiesAppId = $("#medicalApplicationId").val();
		natureOfApplicant = $("#medicalApplicantTypeVal").val();
		typeOfTransaction = $("#medicalTransactionTypeVal").val();
		medicalFacilitiesCategory = $("#medicalFacilitiesCategoryTypeVal").val();
		medicalFacilitiesSubCategoryTypeVal = $("#medicalFacilitiesSubCategoryTypeVal").val();
		nursingHomesSubCategoryVal = $("#nursingHomesSubCategoryVal").val();
		longTermCareFacilities = $("#longTermCategoryTypeVal").val();
		if(longTermCareFacilities=="Nursing Homes"){
			selectedNursingHomeCategory = [];
			$("#nursingHomesCategoryBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNursingHomeCategory.push($(this).html());
			});
			nursingHomeCategoryVal = selectedNursingHomeCategory.toString();
		}else{
			nursingHomeCategoryVal = $("#nursingHomeCategoryVal").val();
		}
		
		residentsFacility = $("#residentsCapacityCategoryVal").val();
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
		$.ajax({
					type : "POST",
					url : "${medicalFacilitiesPendingUrl}",
					data : {
						"<portlet:namespace/>medicalFacilitiesAppId" : medicalFacilitiesAppId,
						"<portlet:namespace/>natureOfApplicant" : natureOfApplicant,
						"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
						"<portlet:namespace/>medicalFacilitiesCategory" : medicalFacilitiesCategory,
						"<portlet:namespace/>medicalFacilitiesSubCategoryTypeVal" : medicalFacilitiesSubCategoryTypeVal,
						"<portlet:namespace/>longTermCareFacilities" : longTermCareFacilities,
						"<portlet:namespace/>nursingHomeCategoryVal" : nursingHomeCategoryVal,
						"<portlet:namespace/>nursingHomesSubCategoryVal": nursingHomesSubCategoryVal,
						"<portlet:namespace/>residentsFacility" : residentsFacility,
						"<portlet:namespace/>currentFormToSave": currentFormToSave,
				    	  "<portlet:namespace/>currentStage":currentStage,
					      "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var appStatus = result["appStatus"];
						 $("#medicalApplicationId").val(result["medicalApplicationId"]);
					      $("#pop_app_no").html(result["medAppNo"]);
					      $("#pop_status").html(result["appStatus"]);
					      $("#pop_category").html(result["category"]); 
					      $("#pop_typeOfTransaction").html(medicalFacilitiesCategory); 
					},
					error : function(data) {
					},
				});
	}
	
	function submitMedicalFacilities(){
		natureOfApplicant = $("#medicalApplicantTypeVal").val();
		typeOfTransaction = $("#medicalTransactionTypeVal").val();
		medicalFacilitiesCategory = $("#medicalFacilitiesCategoryTypeVal").val();
		medicalFacilitiesSubCategoryTypeVal = $("#medicalFacilitiesSubCategoryTypeVal").val();
		longTermCareFacilities = $("#longTermCategoryTypeVal").val();
		nursingHomesSubCategoryVal = $("#nursingHomesSubCategoryVal").val();
		if(longTermCareFacilities=="Nursing Homes"){
			selectedNursingHomeCategory = [];
			$("#nursingHomesCategoryBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNursingHomeCategory.push($(this).html());
			});
			nursingHomeCategoryVal = selectedNursingHomeCategory.toString();
		}else{
			nursingHomeCategoryVal = $("#nursingHomeCategoryVal").val();
		}
		residentsFacility = $("#residentsCapacityCategoryVal").val();
		medicalApplicationId = $("#medicalApplicationId").val();
		   $.ajax({
			    type: "POST",
			    url: "${submitMedicalFacilitiesApplicationUrl}",
			    data: {
			      "<portlet:namespace/>natureOfApplicant": natureOfApplicant,
				  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			      "<portlet:namespace/>medicalFacilitiesCategory": medicalFacilitiesCategory,
			      "<portlet:namespace/>medicalFacilitiesSubCategoryTypeVal" : medicalFacilitiesSubCategoryTypeVal,
			      "<portlet:namespace/>longTermCareFacilities": longTermCareFacilities,
			      "<portlet:namespace/>nursingHomeCategoryVal": nursingHomeCategoryVal,
			      "<portlet:namespace/>nursingHomesSubCategoryVal": nursingHomesSubCategoryVal,
			      "<portlet:namespace/>residentsFacility": residentsFacility,
			      "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    },
			    success: function (data) { 
			    var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			    	 if(appStatus=="submitted"){
			    		 	$("#continueDashboardMedical").removeClass("hide");
					   		$("#submitted-content").removeClass("hide");
					   		$("#application_submitted-img").removeClass("hide");
					   	}else{
					   		$("#draft-content").removeClass("hide");
					   		$("#application_draft-img").removeClass("hide");
					   	}
			      $("#medicalFacilitiesApplicationId").val(result["medicalFacilitiesApplicationId"]);
			      $("#submit_pop_app_no").html(result["medicalFacilitiesAppNum"]);
			      $("#submit_pop_status").html(result["appStatus"]);
			      $("#submit_pop_category").html(result["category"]);
			      $("#submit_pop_category_sub").html(medicalFacilitiesCategory);
			 	  $(".custom_loader").addClass("hide");
		    	  $(".final-submit-content").css({"opacity":"1"}); 
	    	    },
			    error: function (data) {},
			  });
	}
	
	 function gettingDocumentList() {
		 medicalApplicationId = $("#medicalApplicationId").val();
			$
					.ajax({
						type : "POST",
						url : "${MedicalFacilitiesGettingDocumentListUrl}",
						data : {
							"<portlet:namespace/>medicalApplicationId" : medicalApplicationId,
						},
						success : function(data) {
							$("#documentList").html(data);
						},
						error : function(data) {
						},
					});
	  }
	 $(function () {
			$(document).on('change', '#medicalEnrollDocuments', function() { 
		        var fileName = $(this).val();
		        fileName = fileName.replace("C:\\fakepath\\", "");
		        $(this).next('.custom-file-label').html(fileName);
		    })
		}); 
	 function openDocumentUploadPopup(counterVal,documentName){
         $("#<portlet:namespace/>documentNumber").val("");
			$("#<portlet:namespace/>issueDate").val("");
			$("#<portlet:namespace/>expiryDate").val("");
			$("#documentuploadCounter").val("");
			$('.custom-file-label').html('Choose File');
			$("#documentuploadCounter").val(counterVal);	
			$("#<portlet:namespace/>documentName").val(documentName);
         $("#commonuploadpopup").modal("show");
	}
		function supportingDocumentUpload(){
		 	var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		    var issueDate = $("#<portlet:namespace/>issueDate").val();
		    var expiryDate=$("#<portlet:namespace/>expiryDate").val();
			var documentName = $("#<portlet:namespace/>documentName").val();
			var documentuploadCounter = $("#documentuploadCounter").val();
		    var fileID = 'medicalEnrollDocuments';
		    $("#commonuploadpopup").modal("hide");
		    $('.hidden'+documentuploadCounter).removeClass('hide');
		    var progress = document.getElementById('progress'+documentuploadCounter);
		    progress.ariaValueNow = 50;
		    progress.style.width ='50%';
		    medicalApplicationId = $("#medicalApplicationId").val();
		    $.ajaxFileUpload({
		        secureuri: false,
		        method: "POST",
		        fileElementId: 'medicalEnrollDocuments',
		        url: '${medicalDoucumentsUpload}',
		        dataType: 'text',
		        data: {
		            "<portlet:namespace/>documentNumber": documentNumber,
		            "<portlet:namespace/>documentName": documentName,
		            "<portlet:namespace/>fileID": fileID,
		            "<portlet:namespace/>command": "fileUpload",
		            "<portlet:namespace/>issueDate": issueDate,
		            "<portlet:namespace/>expiryDate": expiryDate,
		            "<portlet:namespace/>documentuploadCounter": documentuploadCounter,
		            "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
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
		            updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
		            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
		            filledDocument=updatedFillDoc-genericFilledDoc;
					if(numberOfDocument == filledDocument){
			        	$("#medicalSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			        }
	        },
		        error: function () {
		        }
		    });
		}
		function submitFeeDetailsInMedical(){
			medicalApplicationId=$("#medicalApplicationId").val();
			    paymentMethod = $("#paymentMethod").val();
			    paymentFee = $("#paidAmount").val();
			    amountPaid=$("#amountPaid").val();
			    amountCurrency=$("#amountCurrency").val();
			    if(paymentMethod=="Credit Card"){
				    $.ajax({
				        type: "POST",
				        url: '${medicalFeeDetailsUrl}',
				        data: {
				          "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			  		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			              "<portlet:namespace/>paymentFee": paymentFee, 
			              "<portlet:namespace/>amountPaid": amountPaid,
			      		  "<portlet:namespace/>amountCurrency": amountCurrency,
				        },
				        success: function (data) {
				        	downloadPDF();
				            $("#deletepopup"+fileEntryId).modal("hide");
				            $("#unpload-info-card"+fileEntryId).remove();
				        },
				        error: function (data) {
				        }
				    });
			    }else{
					     var fileID = 'medical-payment-upload';
				   		$.ajaxFileUpload({
				   		    secureuri: false,
				   		    method: "POST",
				   		    url: "${medicalFeeDetailsUrl}",
				   		    fileElementId: 'medical-payment-upload',
				   		    dataType: 'text',
				   		    data: {
				   		      "<portlet:namespace/>fileID": fileID,
				   		      "<portlet:namespace/>command": "fileUpload",
				   		   	  "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
				   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
				   			  "<portlet:namespace/>paymentFee": paymentFee,
				   		      "<portlet:namespace/>amountPaid": amountPaid,
			  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
				   		    },
				   		    success: function (data) {
				   		    	downloadPDF();
				   		    	var parsedData = JSON.parse(data);
				   		    	$.each(parsedData,function(key,entry){
									console.log(entry.fileName);
									console.log(entry.downloadFileUrl);
									// Append the download URL to the specified element
								    $("#payment-upload-preview").html(entry.fileName);
								    $("#payment-upload-preview").attr("href", entry.downloadFileUrl);
				   		    	});
				   		    },
				   		    error: function (data) {},
				   		  });
			     }
			}
		
		function opendelDocPopup(fileEntry,counter){
			$("#documentuploadCounter").val(counter);
			$("#deletepopup"+fileEntry).modal("show");
		}
	/* 	function deleteDocument(fileEntryId){
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${deletedocumentUrl}',
				data : {
					"<portlet:namespace/>fileEntryId" : fileEntryId,
				},
				success : function(data) {
					$("#deletepopup"+fileEntryId).modal("hide");
					$("#unpload-info-card"+fileEntryId).remove();
					$("#documentUpload"+documentuploadCounter).removeClass("disabled");
					var requiredDoc = $("div[id='requiredDoc']").length;
					var notRequireDoc = $("div[id='notRequiredDoc']").length;
					if(requiredDoc >= 1){
						if(documentuploadCounter <= requiredDoc){
							$("#requireDocNamePreview" + documentuploadCounter).html("");
							filledDocument = filledDocument -1;
							$("#medicalSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
						}
					}
					if(notRequireDoc >= 1){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
					}
				},
				error : function(data) {

				}
			});
		} */
		function deleteDocument(fileEntryId){
		
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${deletedocumentUrl}',
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
						$("#medicalSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
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
		
		function downloadPDF() {
			medicalApplicationId=$("#medicalApplicationId").val();
			checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
	        $.ajax({
	                type: "POST",
	                url: "${medicalDownloadPdfUrl}",
	                data: {
	                        "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
	                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
	                },
	                success: function(data) {
	                        var result = data.APP_DATA;
	                           if (result && result["fileUrl"]) {
	                        $("#medicalDownloadPDF").attr("href", result["fileUrl"]);
	                        $("#medicalDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
	                           }},
	                error: function(data) {},
	        });
	    }
		function previewMethod() {
		    // For input and textarea elements
		    $("input, textarea, select").each(function() {
		        $(this).each(function() {
		            if($(this).val() != "") {
		                let preId = $(this).prop('id') + "Preview";
		                $("#" + preId).html($(this).val());
		            }
		        });
		        /* $(this).each(function() {
		            if($(this).val() != "") {
		                let preId = $(this).prop('id') + "Preview";
		                $("#" + preId).html($(this).val());
		            }
		        }); */
		    });
		    // For radio buttons
		    $("input[type='radio']").each(function() {
		        $(this).each(function() {
		            if($(this).is(":checked")) {
		                let preId = $(this).prop('name') + "Preview";
		                $("#" + preId).html($(this).val());
		            }
		        });
		    });

		    // For checkboxes
		    $("input[type='checkbox']").each(function() {
		        $(this).each(function() {
		            let checkedValues = ""; // Initialize an empty string to store checked values
		            let checkboxName = $(this).prop('name'); // Get the name of the changed checkbox
		            
		            // Loop through checked checkboxes with the same name
		            $("input[type='checkbox'][name='" + checkboxName + "']:checked").each(function() {
		                checkedValues += $(this).val() + ", "; // Append the value of each checked checkbox
		            });
		            
		            let preId = checkboxName + "Preview"; // Get the preview element's ID
		            $("#" + preId).html(checkedValues.slice(0, -2)); // Update the preview element with checked values
		        });
		    });
		}

function renewLicense(){
	$("#medical-renew-btn").attr("disabled", "disabled");
	$("#renewLicenseNumbervalidation").addClass("hide");
	transactionNum = $("#renew-licence-number").val();

	$.ajax({
		type: "POST",
		url: '${renewLicenseUrl}',
		data: {
			"<portlet:namespace/>transactionNum": transactionNum,
		},
		success: function (data) {
			var result = data.APP_DATA;
        	var renewLicenseUrl=result["renewLicenseUrl"];
        	var validation=result["licenseNumberCheck"];
			if(validation == 0){
				$("#renewLicenseNumbervalidation").removeClass("hide");
				$("#medical-renew-btn").removeAttr("disabled");

			}else{
				window.location.href = renewLicenseUrl;
			}
		},
		error: function (data) {

		}
	});
}

/*$(function() {
	$(document).on('change', '#medicalGenericUpload', function() {
		var fileName = $(this).val();
		fileName = fileName.replace("C:\\fakepath\\", "");
		$(this).next('#fireBrigadeGenericFileChosen').html(fileName);

		var files = $(this)[0].files;

        if (files.length > 0) {
            // Clear any existing documents and delete buttons
            $('#uploaded-documents-container').empty();
            $('#additionalDocPreview').empty();
            selectedFiles = []; // Clear the selected files array
			var counter = 1;
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
			$("#medicalFormPreviewFieldset .custom_loader").removeClass("hide");
			$(".preview-section").addClass("hide");
        } else {
            // If no files are selected, hide any existing delete buttons
            $('.uploaded-delete').hide();
            $(".noAdditionalSupportingDoc").show();
			$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			$("#medicalFormPreviewFieldset .custom_loader").addClass("hide");
			$(".preview-section").removeClass("hide");
        }


	});
});*/
$(document).on('change', '#signatureUploadBtn', function() {
	console.log("signature upload calling");
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#signatureImageHolder");
    var form1a_image_holder = $("#signatureImageHolderPre");
    image_holder.empty();
    form1a_image_holder.empty();
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image px-1",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image px-1",
                "height":"100",
                "width":"100"
              }).appendTo(form1a_image_holder);
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
});
</script>