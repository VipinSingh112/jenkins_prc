<portlet:resourceURL var="pendingJadscApplicationUrl" id="pending/Jadsc/Application/Url"></portlet:resourceURL>
<portlet:resourceURL var="gettingDocumentList" id="getting/Document/List"></portlet:resourceURL>
<portlet:resourceURL var="jadscDoucumentsUpload" id="jadsc/Doucuments/Upload"></portlet:resourceURL>
<portlet:resourceURL var="jadscDeleteDocumentUrl" id="jadsc/Delete/Document/Url"></portlet:resourceURL>
<portlet:resourceURL var="draftJadscApplicationUrl" id="draft/Jadsc/Application/Url"></portlet:resourceURL>
<portlet:resourceURL var="jadscDownloadPDFUrl" id="jadsc/Download/PDF"></portlet:resourceURL>
<portlet:resourceURL var="transtionNumberURL" id="transtion/Number"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center"> 
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Filing a Complaint for</p>
							<p class="common-banner-title f1 mb-0">Trade Remedy Investigation</p>
							<p class="common-banner-info f2 mb-3">The Anti-dumping and Subsidies Commission (ADSC) is the Trade Remedies Investigating Authority 
							in Jamaica. Trade Remedies include Anti-dumping, Subsidies and Countervailing Measures and Safeguards</p>
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
					<form action="" method="post" role="form" enctype="multipart/form-data" id="formSection">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active xs-li">
									<p class="application-form-upper-title">Download and Review</p>
									<p class="application-form-lower-heading">DOCUMENTATION</p> <span></span>
								</li>
								<li class="xs-li">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
								</li>
								<li class="xs-li">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">REQUESTED DESIGNATION</p> <span></span>
								</li>
								<li class="form-section xs-li">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents xs-li">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING DOCUMENTS</p> <span></span>
								</li>
								<li class="rm fee-payment fp">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES PAYMENT</p> <span></span>
								</li>
							    <li style="display:none" class="last-step">
			                       <span></span>
			                    </li>
							</ul>
							 <input type="hidden" id="jadscApplicationId" name="jadscApplicationId" value=""> 
							<!--<input type="hidden" id="miningLeaseCurrentStage" name="miningLeaseCurrentStage">
							<input type="hidden" id="permitNumber" name="permitNumber">-->
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true"> 
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=jadscApplicationId%>">
						</div>
						<%@ include file="/informative-documentation/jadsc-informative-doc.jsp"%> 
						<%@ include file="/type-of-application/jadsc-application-type.jsp"%>
						<%@ include file="/type-of-designation/jadsc-designation-type.jsp"%>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/jadsc-documents.jsp"%>
						<%@ include file="/jadsc-fee-payment.jsp"%>
             			<%@ include file="/preview/final-preview-tabs.jsp"%>
             			<%@ include file="/jadsc-final-submission.jsp"%>
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
var jadscDocCount=1;

$(".appication-type .wizard-card").click(function(){
	$(".appication-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$(".complaint-type .wizard-card").removeClass("active");
	$(".complaint-type").removeClass("hide");
	$(".appicant-type, .transaction-type").addClass("hide");
	$("#applicationTypeVal").val($(this).find(".wizard-title").html());
	$("#jadscApplicationTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	$(".complaint-type .wizard-card img").removeClass("hide");
	$(".complaint-type .wizard-card img.active").addClass("hide");
	docRenderCount = 1;
	applicationType = $("#applicationTypeVal").val();
	if(applicationType == "Prefiling Consultation"){
		$(".mandatory-doc-heading").html("Optional Documents (Upload only those documents that are relevant to your application)");
	}else{
		$(".mandatory-doc-heading").html("Mandatory Documents (that may attract an expiry date)");
	}
});
$(".complaint-type .wizard-card").click(function(){
	$(".complaint-type .wizard-card").removeClass("active");
	$(".complaint-type .wizard-card img").removeClass("hide");
	$(".complaint-type .wizard-card img.active").addClass("hide");
	$(this).addClass("active");
	$(this).find("img").addClass("hide");
	$(this).find("img.active").removeClass("hide");
	$(".transaction-type .wizard-card").removeClass("active");
	$(".transaction-type").removeClass("hide");
	$(".appicant-type").addClass("hide");
	$("#complaintTypeVal").val($(this).find(".wizard-title").html());
	$("#jadscApplicationTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	/* $(".appicant-type .wizard-card img").removeClass("hide");
	$(".appicant-type .wizard-card img.active").addClass("hide"); */
});
$(".transaction-type .wizard-card").click(function(){
	var selectedTransactionCategories = new Array();
	$(this).toggleClass("active");
	$("#transactionType").find(".wizard-card.active .wizard-title").each(function () {
		selectedTransactionCategories.push($(this).html());
    });
	$("#transactionTypeVal").val(selectedTransactionCategories);
	$(".confidential-ver, .non-confidential-ver, .confidential-ver-forms, .non-confidential-ver").addClass("hide");
	$("#publicVersionSection").addClass("hide");
	if(selectedTransactionCategories.length == 0){
		$(".appicant-type .wizard-card img").removeClass("hide");
		$(".appicant-type .wizard-card img.active").addClass("hide");
		$(".appicant-type .wizard-card").removeClass("active");
		$(".appicant-type").addClass("hide");
		$(".appicant-type .wizard-card img").removeClass("hide");
		$(".appicant-type .wizard-card img.active").addClass("hide");
		$("#jadscApplicationTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	}else{	
		$(".appicant-type").removeClass("hide");
		$(".confidential-ver, .non-confidential-ver").addClass("col-md-12");
		$(".confidential-ver, .non-confidential-ver").removeClass("col-md-6");
		if(selectedTransactionCategories.includes("Confidential Version") && selectedTransactionCategories.includes("Public Version")){
			$(".confidential-ver, .non-confidential-ver, .confidential-ver-forms").removeClass("hide");
			$(".confidential-ver, .non-confidential-ver").removeClass("col-md-12");
			$(".confidential-ver, .non-confidential-ver").addClass("col-md-6");
		}else if (selectedTransactionCategories.includes("Confidential Version")) {
			$(".confidential-ver, .confidential-ver-forms").removeClass("hide");
		} else if (selectedTransactionCategories.includes("Public Version")) {
			$(".non-confidential-ver").removeClass("hide");
			$(".checklist-step").html("1");
			$("#supportingDocStep").html("2");
		}
	}		
	/* transactionType = $("#transactionTypeVal").val();
	if(transactionType == "Confidential Version"){
		$(".confidential-ver, .confidential-ver-forms").removeClass("hide");
		$(".appicant-type").removeClass("hide");
		$("#publicVersionSection").addClass("hide");
	}
	if(transactionType == "Public Version"){
		$("#publicVersionSection, .non-confidential-ver").removeClass("hide");
		$(".confidential-ver-forms").addClass("hide");
		$(".checklist-step").html("1");
		$("#supportingDocStep").html("2");
	} */
	 
});
$("#adscPublicVerBtn").click(function(){
	$(".appicant-type").removeClass("hide");
});
$(".appicant-type .wizard-card").click(function(){
	$(".appicant-type .wizard-card").removeClass("active");
	$(".appicant-type .wizard-card img").removeClass("hide");
	$(".appicant-type .wizard-card img.active").addClass("hide");
	$(this).addClass("active");
	$(this).find("img").addClass("hide");
	$(this).find("img.active").removeClass("hide");
	$("#typeOfApplicant").val($(this).find(".wizard-title").html());
	$("#jadscApplicationTypeFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
	typeOfApplicant = $("#typeOfApplicant").val();
	transactionType = $("#transactionTypeVal").val();
	if(transactionType.includes("Confidential Version") && transactionType.includes("Public Version")){
		if(typeOfApplicant == "Acting on Behalf of Company E.g. Legal Council"){
			$(".appearance-notice-form").removeClass("hide");
			$(".checklist-step").html("6");
			$("#supportingDocStep").html("7");
		}
		if(typeOfApplicant == "Applicant/Company"){
			$(".appearance-notice-form").addClass("hide");
			$(".checklist-step").html("5");
			$("#supportingDocStep").html("6");
		}
	}else if(transactionType == "Confidential Version"){
		if(transactionType == "Confidential Version"){
			if(typeOfApplicant == "Acting on Behalf of Company E.g. Legal Council"){
				$(".appearance-notice-form").removeClass("hide");
				$(".checklist-step").html("6");
				$("#supportingDocStep").html("7");
			}
			if(typeOfApplicant == "Applicant/Company"){
				$(".appearance-notice-form").addClass("hide");
				$(".checklist-step").html("5");
				$("#supportingDocStep").html("6");
			}
		}
	}
	/* if(transactionType == "Confidential Version"){
		if(typeOfApplicant == "Acting on Behalf of Company E.g. Legal Council"){
			$(".appearance-notice-form").removeClass("hide");
			$(".checklist-step").html("6");
			$("#supportingDocStep").html("7");
		}
		if(typeOfApplicant == "Applicant/Company"){
			$(".appearance-notice-form").addClass("hide");
			$(".checklist-step").html("5");
			$("#supportingDocStep").html("6");
		}
	} */
});

$(".designation-type .wizard-card").click(function(){
	$(".designation-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#designationTypeVal").val($(this).find(".wizard-title").html());
	$("#jadscDesignationFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
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
    
    if(currentFieldSet == "jadscInformativeDocFieldset"){
    	$(".form-wizard-previous-btn").removeClass("hide");
    	$(".form-wizard-save-btn").removeClass("hide");
    	$("#jadscApplicationTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
    	$(".appication-type .wizard-card").removeClass("active");
    	$(".appicant-type, .complaint-type, .transaction-type").addClass("hide");
      pendingJadscApplication();
    }
    
	if(currentFieldSet == "jadscApplicationTypeFieldset"){
		$("#jadscDesignationFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		$(".designation-type .wizard-card").removeClass("active");
    	pendingJadscApplication();

		if(jadscDocCount==1){
 			     gettingDocumentList();
     	} 
		jadscDocCount++;
	}	
	
	if(currentFieldSet == "jadscDesignationFieldset"){ 
		pendingJadscApplication();
		activeSelectForm();
		
		designationTypeVal = $("#designationTypeVal").val();
			
			if(designationTypeVal == "Confidential Version"){
				veracityComName = $("#veracityComName").val();
				if(veracityComName){
					$("#jadscFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
				else{
					$("#jadscFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });

				}

			}
	}
	if(currentFieldSet == "jadscFormsFieldset"){
		addDocServedAddressDetail();
		setChecklistFormInfo();
		addChecklistDetail();
		applicationType = $("#applicationTypeVal").val();
		if(applicationType == "Prefiling Consultation"){
			$("#jadscSupportingDocumentFieldset #save-continue").css({
				"opacity": "1", 
				"pointer-events": "auto", 
				"cursor": "pointer"
			});
		}else{
			/* DOCUMENT VALIDATION */
			var requiredDoc = $("div[id='requiredDoc']").length;
			filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
			if(requiredDoc >= 1){
	            $(".mandatory-doc-heading").removeClass("hide");
				numberOfDocument = requiredDoc;
				if(numberOfDocument != filledDocument){
					$("#jadscSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				}
			}
		}
		 
    pendingJadscApplication();
	}
	if(currentFieldSet == "jadscSupportingDocumentFieldset"){
		showDocsPreview(docRenderCount);
		docRenderCount++;
		uploadDocuments('jadscGenericUpload','Generic Documents','');
    pendingJadscApplication();
	}
	if(currentFieldSet == "jadscfeePaymentFieldset"){
		downloadPDF();
		showFinalSubmitButton();
		finalPreviewScroll();
		previewMethod();
		/* previewMedicalApplicationInfo();
		previewMedicalActivityDescInfo();
		previewMedicalOrganizationDescInfo();
		previewMedicalPhysicalResInfo();
		previewMedicalManagementInfo();
		previewMedicalOtherReqInfo();
		previewThirdPartyScope(); */
		$(".fee-amount-preview").html($("#amountPaid").val());
    	$(".fee-currency-preview").html($("#amountCurrency").val());
    pendingJadscApplication();
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
	  var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	  if(currentFieldSet == "jadscApplicationTypeFieldset"){
	    	$(".form-wizard-previous-btn").addClass("hide");
	    	$(".form-wizard-save-btn").addClass("hide");
	    }
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
		if(currentFieldSet == "jadscfeePaymentFieldset" || currentFieldSet == "jadscFormPreviewFieldset"){
				$(".form-wizard-next-btn ").hide();
				$(".form-wizard-save-btn").hide();
				$(".final-submit").removeClass("hide");
			}else{
				$(".form-wizard-next-btn").show();
				$(".form-wizard-save-btn").show();
				$(".final-submit").addClass("hide");
			}
	}  
	function openSaveToDraftPopup() {
		$(".savecountinuePopup").modal("show");
		draftJadscApplication();
	}
    function openSaveToSubmitPopup() {
		$(".final-submit-container").removeClass("hide");
		submitJadscApplication();
	}
    /* NEXT FORM JS */
	function applicantInfo(){
		nextForm();
    pendingJadscApplication();
	}
	function nextForm(){
		var $active = $('.nav-tabs li > .active'); // Get the parent of the active element
		var $siblings = $active.parent().nextAll();
	
		for (var i = 0; i < $siblings.length; i++) {
		  var $next = $($siblings[i]);
		  
		  if (!$next.hasClass('hide')) {
		    $next.find('.nav-link').removeClass('disabled');
		    $next.find('.nav-link span').removeClass('gray');
		    $prev = $next.prev().find('.nav-link');
		    nextTab($prev);
		    break; // Exit the loop once the first non-hidden tab is found
		  }
		}
		const formSections = document.getElementsByClassName('form-wizard');
		for (const formSection of formSections) {
			formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
			}
	}
	function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();
	}

	function activeSelectForm(){
		$(".tab-pane").removeClass("active");
		$("#side-tabs .nav-link").removeClass("active");
		/* $("#side-tabs .nav-link").addClass("disabled"); */
		transactionType = $("#transactionTypeVal").val();
		if(transactionType.includes("Confidential Version") && transactionType.includes("Public Version")){
			$(".confidential-ver-forms.tab-pane:first").addClass("active");
			$("#side-tabs .confidential-ver-forms:first .nav-link:first").addClass("active");
			$("#side-tabs .confidential-ver-forms:first .nav-link:first").removeClass("disabled");
		}else if(transactionType == "Confidential Version"){
			$(".confidential-ver-forms.tab-pane:first").addClass("active");
			$("#side-tabs .confidential-ver-forms:first .nav-link:first").addClass("active");
			$("#side-tabs .confidential-ver-forms:first .nav-link:first").removeClass("disabled");
		}else if(transactionType == "Public Version"){
			$(".non-confidential-ver-forms.tab-pane:first").addClass("active");
			$("#side-tabs .non-confidential-ver-forms .nav-link:first").addClass("active");
			$("#side-tabs .non-confidential-ver-forms .nav-link:first").removeClass("disabled");
		}
		
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
	
	function expandDetails(id){
		var currentIsActive = $("#"+id).hasClass('is-active');
		$("#"+id).removeClass('is-active');
		$("#"+id).next('.accordion__body').removeClass('is-active');
		if (currentIsActive != 1) {
			$("#"+id).addClass('is-active');
			$("#"+id).next('.accordion__body').addClass('is-active');
		}
	}
	/*  Render document in preview  */
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
			if(requiredDoc = 1){
				j = requiredDoc+1;
				notRequireDocCount = requiredDoc + notRequiredDoc;
				$("#requireDocPreviewSection").removeClass("hide");
				for(i=1;i<=requiredDoc;i++){
					requiredDocPre = $("#requiredDoc"+i).html();
					fileUrl = $("#fileUrl"+i).val();
					var requireDocPreview = document.querySelector('#requireDocPreview');
					var previewData = document.createElement('div');
					previewData.classList.add('mb-3');
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
					previewData.classList.add('mb-3');
					previewData.innerHTML = '<p class="sub_heading">'+notRequiredDocPre+'</p><a class="sub_heading_content" id="nonRequireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
					notRequireDocPreview.append(previewData);
				}
			}
		}
		/*TO APPEND DOC NAME*/
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
	$("#information-request-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#information-request-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
		$(".last-step").removeClass("active");
		scrollToPageTop();
	});
	$("#oath-request-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#oath-request-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
		$(".last-step").removeClass("active");
		scrollToPageTop();
	});
	$("#service-certificate-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#service-certificate-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
	    $(".last-step").removeClass("active");
	    scrollToPageTop();
	});
	$("#veracity-certificate-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#veracity-certificate-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
	    $(".last-step").removeClass("active");
	    scrollToPageTop();
	});
	$("#appearance-notice-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#appearance-notice-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
	    $(".last-step").removeClass("active");
	    scrollToPageTop();
	});

	$("#checklist-details-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscFormsFieldset').addClass("show", "400");
		$(".form-wizard-next-btn ").show();
		$(".form-wizard-save-btn").show();
		$(".final-submit").addClass("hide");
		$(".final-submit-container").addClass("hide");
		$("#checklist-details-tab").trigger("click");
		$(".form-section").addClass("active");
		$(".rm, .form-section").removeClass("activated");
		$(".last-step").removeClass("activated");
	    $(".last-step").removeClass("active");
	    scrollToPageTop();
	});

	$("#supporting-doc-edit-tab").click(function(){
		$('#jadscFormPreviewFieldset').removeClass("show");
		$('#jadscSupportingDocumentFieldset').addClass("show", "400");
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
	function pendingJadscApplication(){ 
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfComplaint=$("#complaintTypeVal").val();
		typeOfTransaction = $("#transactionTypeVal").val();
		typeOfApplicant=$("#typeOfApplicant").val();
		var industriesImpacted=[];
		$('input[name="insdustryImpacted"]:checked').each(function() {
			industriesImpacted.push($(this).val());
        });
		industriesImpactedValues=industriesImpacted.toString();
		
		breachOfConfidentiality=$("#designationTypeVal").val();
		
		var selectedValues = [];
		$("#complaintTypeVal").val();
        $('input[name="confidentialInfoCat"]:checked').each(function() {
            selectedValues.push($(this).val());
        });
		var selectedInformation=selectedValues.toString();
		confidentialStatusReason=$("#confidentialStatusReason").val();
		nonConfidentialSummary=$("#nonConfidentialSummary").val();
		categoriesOfConfiOtherPleaseSpecify=$("#confidentialInfoCatOther").val();
		jadscApplicationId=$("#jadscApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 $.ajax({
	            type: "POST",
	            url: '${pendingJadscApplicationUrl}',
	            data: {
				      "<portlet:namespace/>typeOfApplication": typeOfApplication,
				      "<portlet:namespace/>typeOfComplaint": typeOfComplaint,
				      "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
				      "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				      "<portlet:namespace/>industriesImpactedValues": industriesImpactedValues,
				      "<portlet:namespace/>breachOfConfidentiality": breachOfConfidentiality,
				      "<portlet:namespace/>selectedInformation": selectedInformation,
				      "<portlet:namespace/>confidentialStatusReason": confidentialStatusReason,
				      "<portlet:namespace/>nonConfidentialSummary": nonConfidentialSummary,
				      "<portlet:namespace/>categoriesOfConfiOtherPleaseSpecify": categoriesOfConfiOtherPleaseSpecify,
				      "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				      "<portlet:namespace/>currentStage": currentStage,
				      "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
				    },
	            success: function(data) {
	            	var result=data.APP_DATA;
	            	$("#jadscApplicationId").val(result["jadscApplicationId"]);
	            	// gettingDocumentList();
	            },
	            error: function(data) {}
	    });
		}
	
	function draftJadscApplication(){
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfComplaint=$("#complaintTypeVal").val();
		typeOfTransaction = $("#transactionTypeVal").val();
		typeOfApplicant=$("#typeOfApplicant").val();
		var industriesImpacted=[];
		$('input[name="insdustryImpacted"]:checked').each(function() {
			industriesImpacted.push($(this).val());
        });
		industriesImpactedValues=industriesImpacted.toString();
		breachOfConfidentiality=$("#designationTypeVal").val();
		var selectedValues = [];
        $('input[name="confidentialInfoCat"]:checked').each(function() {
            selectedValues.push($(this).val());
        });
		var selectedInformation=selectedValues.toString();
		confidentialStatusReason=$("#confidentialStatusReason").val();
		nonConfidentialSummary=$("#nonConfidentialSummary").val();
		categoriesOfConfiOtherPleaseSpecify=$("#confidentialInfoCatOther").val();
		jadscApplicationId=$("#jadscApplicationId").val();
	 
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave=$("#side-tabs").find(".active span:nth-child(2)").text();
		
		if(currentFormToSave=="Information Request Form"){
			setInformationRequestInfo(true);
		}if(currentFormToSave=="Oath for Request Form"){
			setOathForRequestInfo(true); 
			uploadDocuments('submitterSignatureBtn','Oath Submitter Sign','');
        	uploadDocuments('justicePeaceBtn','Oath Justice Sign','');
		}if(currentFormToSave=="Certificate of Service Form"){
			setCertificationOfServiceInfo(true);
			uploadDocuments('signedBtn','Certificate of Service Sign','');
			addDocServedAddressDetail();
		}if(currentFormToSave=="Certificate of Veracity Form"){
			setCertificationOfVeracityFormInfo(true);
			uploadDocuments('veracitySignedBtn','Certificate of Veracity Sign','');
        	uploadDocuments('veracityPeaceJusticeBtn','Certificate of Veracity Peace Justice','');
		}if(currentFormToSave=="Notice of Appearance Form"){
			setNoticeOfAppearanceFormInfo(true);
			uploadDocuments('appearanceNoticeSignatureBtn','Notice of Appearance Sign','');
		}if(currentFormToSave=="Checklist"){
			setChecklistFormInfo();
		    //addDocServedAddressDetail();
			addChecklistDetail();
		}if(currentStage == "SUPPORTING DOCUMENTS"){
			uploadDocuments('jadscGenericUpload','Generic Documents','');
		   }
		 $.ajax({
	            type: "POST",
	            url: '${draftJadscApplicationUrl}',
	            data: {
				      "<portlet:namespace/>typeOfApplication": typeOfApplication,
				      "<portlet:namespace/>typeOfComplaint": typeOfComplaint,
				      "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
				      "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				      "<portlet:namespace/>industriesImpactedValues": industriesImpactedValues,
				      "<portlet:namespace/>breachOfConfidentiality": breachOfConfidentiality,
				      "<portlet:namespace/>selectedInformation": selectedInformation,
				      "<portlet:namespace/>confidentialStatusReason": confidentialStatusReason,
				      "<portlet:namespace/>nonConfidentialSummary": nonConfidentialSummary,
				      "<portlet:namespace/>categoriesOfConfiOtherPleaseSpecify": categoriesOfConfiOtherPleaseSpecify,
				      "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				      "<portlet:namespace/>currentFormToSave": currentFormToSave,
			    	  "<portlet:namespace/>currentStage":currentStage,
    			      "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
				    },
	            success: function(data) {
	            	  var result = data.APP_DATA;
				      $("#pop_app_no").html(result["jadscAppNo"]);
				      $("#pop_status").html(result["appStatus"]);
				      $("#pop_category").html(result["category"]);
				      $("#jadscApplicationId").val(result["jadscApplicationId"]);
	            },
	            error: function(data) {}
	    });
		}
	function gettingDocumentList(){
		jadscApplicationId=$("#jadscApplicationId").val();
		 $.ajax({
	            type: "POST",
	            url: '${gettingDocumentList}',
	            data: {
				      "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
	            success: function(data) {
	            	$("#documentList").html(data);
	            	  /* Doc Validation */
			    	var jadscApplicationId = '<%=jadscApplicationId%>';
					if (jadscApplicationId > 0) {
						var currentStage = "<%=currentStage %>";
						/* if(currentStage == "SUPPORTING DOCUMENTS"){ */
							numberOfDocument = $("div[id='requiredDoc']").length;
							filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
							applicationType = $("#applicationTypeVal").val();
							if(applicationType == "Prefiling Consultation"){
								$("#jadscSupportingDocumentFieldset #save-continue").css({
									"opacity": "1", 
									"pointer-events": "auto", 
									"cursor": "pointer"
								});
							}else{
								if (numberOfDocument != filledDocument) {
									$("#jadscSupportingDocumentFieldset #save-continue").css({
										"opacity": "0.4", 
										"pointer-events": "none", 
										"cursor": "default"
									});
								} else {
									$("#jadscSupportingDocumentFieldset #save-continue").css({
										"opacity": "1", 
										"pointer-events": "auto", 
										"cursor": "pointer"
									});
								}
							}
							
						/* } */
					}
			    },
			    error: function (data) {},
			});
		    /* validation(); */
		}
	//POP UP FOR DOC UPLOAD
	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#fireBrigadeEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#documentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
	// DOC UPLOAD
	function uploadDocumentInjadsc() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#documentuploadCounter").val();
		var fileID = 'jadscEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		jadscApplicationId=$("#jadscApplicationId").val();
		$.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'jadscEnrollDocuments',
					url : '${jadscDoucumentsUpload}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>documentName" : documentName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>jadscApplicationId" : jadscApplicationId,
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
						updatedFillDoc =$(".supporting-document-card").find(".uploaded-info").length;
			            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
			            filledDocument=updatedFillDoc-genericFilledDoc;
			            applicationType = $("#applicationTypeVal").val();
			        	if(applicationType == "Prefiling Consultation"){
			        		$("#jadscSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			        	}else{
			        		if(numberOfDocument == filledDocument){
					        	$("#jadscSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					        }
			        	}
						
					},
					error : function() {
					}
				});
	}
	//SETTING NAME OF FILE IN UPLOAD POPUP
	$(function() {
		$(document).on('change', '#jadscEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	//DELETE DOC POP UP
	function opendelDocPopup(fileEntry, counter) {
		$("#documentuploadCounter").val(counter);
		$("#deletepopup" + fileEntry).modal("show");
	}
	//DELETE DOC
	
	function deleteDocument(fileEntryId) {
		var documentuploadCounter = $("#documentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${jadscDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass("disabled");
				$("#document-name" + documentuploadCounter).html("");
				var requiredDoc = $("div[id='requiredDoc']").length;
				var notRequireDoc = $("div[id='notRequiredDoc']").length;
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
				applicationType = $("#applicationTypeVal").val();
				if(applicationType == "Prefiling Consultation"){
					$("#jadscSupportingDocumentFieldset #save-continue").css({
						"opacity": "1", 
						"pointer-events": "auto", 
						"cursor": "pointer"
					});
				}else{
					if(requiredDoc >= 1){
			            if(documentuploadCounter <= requiredDoc){
							$("#requireDocNamePreview" + documentuploadCounter).html("");
							filledDocument = filledDocument -1;
							$("#jadscSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
						}
					}
					if(notRequireDoc >= 1){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
					}
				}
	            
			},
			error : function(data) {

			}
		});
	}
	
	$(document).ready(function () {
	    var selectedFiles = [];
	    var selectedGenericFiles = [];
	    
	    function updateFileInput() {
	        var newFileList = new DataTransfer();
	        for (var i = 0; i < selectedFiles.length; i++) {
	            newFileList.items.add(selectedFiles[i]);
	        }
	        $('#jadscGenericUpload')[0].files = newFileList.files;
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

	    $(document).on('change', '#jadscGenericUpload', function () {
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
	           var jadscApplicationId=<%=jadscApplicationId%>;
	        	if(jadscApplicationId > 0 ){
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
	            $("#jadscFormPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#jadscFormPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
	
  
	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	}
	$('input[type=checkbox][name=confidentialInfoCat]').change(function() {
		  if (this.value === 'Other') {
			  $(".confidentialInfoCatOtherBox").toggleClass("hide", !this.checked);
		  } 
	});
	
	$('input[type=checkbox][name=informationRegComplaint]').change(function() {
		$(this).parent().next(".checklistOtherBox").toggleClass("hide", !this.checked);
	});
	 /*Download Pdf*/
 	function downloadPDF() {
    	jadscApplicationId=$("#jadscApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${jadscDownloadPDFUrl}",
                data: {
                        "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        $("#jadscDownloadPDF").attr("href", result["fileUrl"]);
                        $("#jadscDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                },
                error: function(data) {},
        });
    }
	//renewal funcation//
	function transtionNumber(){
	    	$("#adscPublicVerBtn").attr("disabled", "disabled");
	    	$("#currentAuthorizationValidation").addClass("hide");
	    	transactionNumber = $("#transactionNumber").val();
	    	typeOfApplicant=$("#typeOfApplicant").val();
	    	 $.ajax({
	 	        type: "POST",
	 	        url: '${transtionNumberURL}',
	 	        data: {
	 	            "<portlet:namespace/>transactionNumber": transactionNumber,
	 	           "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
	 	        },
	 	        success: function (data) {
	 	        	var result = data.APP_DATA;
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var validation=result["registrationNumCheck"];
	 	           if(validation == 0){
	 	        	  $("#currentAuthorizationValidation").removeClass("hide");
	 	        	 $("#adscPublicVerBtn").removeAttr("disabled"); 
	 	           }else{
	 	        	  window.location.href =renewLicenseUrl;
	 	           }
	 	        },
	 	        error: function (data) {
	 	        	_log.error("Error****************" + e.getMessage());
	 	        }
	 	    });
	    }
</script>