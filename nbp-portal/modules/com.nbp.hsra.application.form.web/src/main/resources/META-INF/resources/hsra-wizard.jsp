<portlet:resourceURL var="hsraPendingUrl" id="/hsra/pending"></portlet:resourceURL>
<portlet:resourceURL var="hsraSubmitApplicationUrl" id="/hsra/submit/application"></portlet:resourceURL>
<portlet:resourceURL var="submitFeeDetailsInHsraUrl" id="/submit/fee/detail/in/hsra"></portlet:resourceURL>
<portlet:resourceURL var="hsraDownloadPDFUrl" id="/hsra/download/pdf"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Applications for</p>
							<p class="common-banner-title f1 mb-0">Grants of
								Authorizations</p>

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
					<form action="" method="post" role="form"
						enctype="multipart/form-data" id="formSection">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
                                <li class="active">
                                    <p class="application-form-upper-title">Select your desired</p>
                                    <p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
                                </li>
                                <li class="">
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
                                <li class="rm fee-payment fp">
                                    <p class="application-form-upper-title">Upload the proof of</p>
                                    <p class="application-form-lower-heading">APPLICATION FEES PAYMENT</p> <span></span>
                                </li>
                                <li style="display:none" class="last-step">
                                    <span></span>
                                </li>
                            </ul>
							<input type="hidden" id="hsraApplicationId" name="hsraApplicationId" value="">
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=hsraApplicationId%>">
						</div>
						<%@ include file="/type-of-applicant/hsra-applicant-type.jsp"%> 
						<%-- <%@ include file="/type-of-transaction/hsra-transaction-type.jsp"%> --%>
						<jsp:include page="/type-of-transaction/hsra-transaction-type.jsp"/>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/hsra-documents.jsp"%>
						<%@ include file="/hsra-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/hsra-final-submission.jsp"%>
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
var hsraDocCount= 1;
var hsraDocServiceCount= 1;
var hsraBrokerDocCount= 1;
var hsraQualifiedDocCount= 1;
$(".appicant-type .wizard-card").click(function(){
	$(".appicant-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#applicantTypeVal").val($(this).find(".wizard-title").html());
	applicantType = $("#applicantTypeVal").val();
	$(".category-sources").addClass("hide");
	if(applicantType == "Users of Radiation Sources"){
		$(".service-button").removeClass("hide");
		$(".activity-type").removeClass("hide");
		$(".activity-type .wizard-card").removeClass("active");
		$(".activity-type .wizard-card").removeClass("disabled");
		$(".activity-type .wizard-card").removeClass("active");
		$(".activity-type .application-type-card-title").removeClass("disabled-individual-rd");
		$(".activity-type .wizard-card").css({"pointer-events": "auto", opacity: "1",});
		$("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		docRenderCount = 1;
	}
	if(applicantType == "Service Providers"){
		$(".activity-type").removeClass("hide");
		$(".service-button").addClass("hide");
		$(".activity-type .wizard-card").removeClass("active");
		$(".activity-type .wizard-card").addClass("disabled");
		$(".activity-type .application-type-card-title").addClass("disabled-individual-rd");
		$(".activity-type .wizard-card").css({"pointer-events": "none", opacity: "0.4",});
		
		$(".activity-type #serviceProvider").removeClass("disabled");
		$(".activity-type #serviceProvider .application-type-card-title").removeClass("disabled-individual-rd");
		$(".activity-type #serviceProvider").css({"pointer-events": "auto", opacity: "1",});

		$(".activity-type #serviceProvider").addClass("active");
		$("#activityTypeVal").val("Service Provider");
		$("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
		docRenderCount = 1;
	}
	if(applicantType == "Brokers"){
		$(".service-button").removeClass("hide");
		$(".activity-type").addClass("hide");
		$("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
		docRenderCount = 1;
	}
	if(applicantType == "Qualified Experts"){
		$(".service-button").removeClass("hide");
		$(".activity-type").addClass("hide");
		$("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
		docRenderCount = 1;
	}
});
$(".activity-type .wizard-card").click(function(){
	$(".activity-type .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#activityTypeVal").val($(this).find(".wizard-title").html());
	applicantType = $("#applicantTypeVal").val();
	if(applicantType == "Users of Radiation Sources"){
		$(".category-sources").removeClass("hide");
		$(".category-sources .wizard-card").removeClass("active");
		// $("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		$("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
	}
});
$("#transactionType .wizard-card").click(function(){
	$("#transactionType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#transactionTypeVal").val($(this).find(".wizard-title").html());
	transactionType = $("#transactionTypeVal").val();
	applicantType = $("#applicantTypeVal").val();
	applicationTypeVal = $("#applicationTypeVal").val();
	if(transactionType == "New"){
		$("#authorizationSection").addClass("hide");
		$("#specificApplicableType").removeClass("hide");
		if(applicantType == "Users of Radiation Sources"){
			$("#payment_category").html("Users of Radiation Sources");
			$(".hsraFacilitiesFee").html("50,000");
		}
		if(applicantType == "Service Providers"){
			$("#payment_category").html("Service Providers");
			$(".hsraFacilitiesFee").html("20,000");
		}
		if(applicationTypeVal == "Application for Licence"){
			$("#newLicence").attr("checked", "true");
		}
		if(applicationTypeVal == "Application for Registration"){
			$("#newRegistration").attr("checked", "true");
		}
	}else{
		$("#specificApplicableType").addClass("hide");
		$("#authorizationSection").removeClass("hide");
		if(applicantType == "Users of Radiation Sources"){
			$("#payment_category").html("Users of Radiation Sources");
			$(".hsraFacilitiesFee").html("30,000");
		}
		if(applicantType == "Service Providers"){
			$("#payment_category").html("Service Providers");
			$(".hsraFacilitiesFee").html("20,000");
		}
	}
	if(transactionType == "Renewal"){
		$("#renewal").attr("checked", "true");
	}
	if(transactionType == "Amendent"){
		$("#amendent").attr("checked", "true");
	}
	$("#specificApplicableType .wizard-card").removeClass("active");
	$("#hsraTransactionFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	
	
});
$("#specificApplicableType .wizard-card").click(function(){
	$(this).toggleClass("active");
	$("#hsraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});
$("#brokerTransactionType .wizard-card").click(function(){
	$("#brokerTransactionType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#brokerTransactionTypeVal").val($(this).find(".wizard-title").html());
	brokerTransactionType = $("#brokerTransactionTypeVal").val();
	applicantType = $("#applicantTypeVal").val();
	$("#qualifiedAreaType").addClass("hide");
		if(brokerTransactionType == "New"){
			if(applicantType == "Brokers"){
				$("#brokerRegistrationSection").addClass("hide");
				$("#hsraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
				
				/* FEE CONFIGURATION */
		    	$("#payment_category").html("Brokers");
		    	$(".hsraFacilitiesFee").html("20,000");
			}
			if(applicantType == "Qualified Experts"){
				$("#hsraTransactionFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
				$("#brokerRegistrationSection").addClass("hide");
				$("#qualifiedAreaType").removeClass("hide");
				/* FEE CONFIGURATION */
		    	$("#payment_category").html("Qualified Experts");
		    	$(".hsraFacilitiesFee").html("50,000");
			}
		}else{
			if(applicantType == "Brokers"){
				/* FEE CONFIGURATION */
		    	$("#payment_category").html("Brokers");
		    	$(".hsraFacilitiesFee").html("20,000");
			}
			if(applicantType == "Qualified Experts"){
				/* FEE CONFIGURATION */
		    	$("#payment_category").html("Qualified Experts");
		    	$(".hsraFacilitiesFee").html("50,000");
			}
			$("#brokerRegistrationSection").removeClass("hide");
			$("#hsraTransactionFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		}
		$("input[name='applicationTypes']").each(function(){
			let applicationType = $(this).val();
		    $(this).prop("checked", false);
		    $(this).prop("disabled", true);
		    if(applicationType === brokerTransactionType){
		        $(this).prop("checked", true);
		        $(this).prop("disabled", false);
		    }
		});
});
$("#qualifiedAreaType .wizard-card").click(function(){
	$(this).toggleClass("active");
	$("#hsraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});

var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    if(currentFieldSet == "hsraApplicantTypeFieldset"){
    	
		scrollToPageTop();
    	
    	$(".form-wizard-previous-btn").removeClass("hide");
		$(".form-wizard-previous-btn").removeClass("hide");    	
		$(".form-wizard-save-btn").removeClass("hide");
	    pendingHsraApplication();
		$("#riskLevelType, #applicationLicenceType, #transactionType, #specificApplicableType, #authorizationSection, #brokerTransactionType, #brokerRegistrationSection, #qualifiedAreaType").addClass("hide");
		$(".nuclear-safety-forms, .notification-practices-forms, .fit-proper-declaration-forms, .broker-registration-forms, .qualified-expert-forms").addClass("hide");
		$("#userRadiationFeeIcon, #serviceProvidersFeeIcon, #brokerFeeIcon, #qualifiedFeeIcon").addClass("hide");
		applicantType = $("#applicantTypeVal").val();
		activityType = $("#activityTypeVal").val();
		$("#nuclearRegistrationLicence").val(activityType);
		
		$("#applicationLicenceType .wizard-card").removeClass("disabled");
		$("#applicationLicenceType .wizard-card").removeClass("active");
		$("#applicationLicenceType .wizard-card .wizard-title").removeClass("disabled-individual-rd");
		$("#applicationLicenceType .wizard-card").css({"pointer-events": "auto", opacity: "1",});
		if(applicantType == "Users of Radiation Sources"){
			$("#userRadiationFeeIcon").removeClass("hide");
			
			$("#riskLevelType, #applicationLicenceType, #transactionType").removeClass("hide");
			
			$("#riskLevelType").removeClass("hide");

			$("#riskLevelType .wizard-card").addClass("disabled");
			$("#riskLevelType .wizard-card .wizard-title").addClass("disabled-individual-rd");
			$("#riskLevelType .wizard-card").css({"pointer-events": "none", opacity: "0.4",});
			$("#riskLevelType .wizard-card img").removeClass("hide");
			$("#riskLevelType .wizard-card img.active").addClass("hide");
			/* Source of Category */
	    	var catOne = new Array();
	    	$("input:checkbox[name=categoryOne]:checked").each(function () {
	    	    catOne.push($(this).val());
	    	});
	    	var cateTwo = new Array();
	    	$("input:checkbox[name=categoryTwo]:checked").each(function () {
	    		cateTwo.push($(this).val());
	    	});
	    	var catThree = new Array();
	    	$("input:checkbox[name=categoryThree]:checked").each(function () {
	    		catThree.push($(this).val());
	    	});
	    	var catFour = new Array();
	    	$("input:checkbox[name=categoryFour]:checked").each(function () {
	    		catFour.push($(this).val());
	    	});
	    	var catFive = new Array();
	    	$("input:checkbox[name=categoryFive]:checked").each(function () {
	    		catFive.push($(this).val());
	    	});
	    	/* FORMS */
	    	$(".nuclear-safety-forms, .notification-practices-forms, .fit-proper-declaration-forms").removeClass("hide");
	    	$(".section-five, .section-six").addClass("hide");

	    	$("#supportingDocStep").html("18");
	    	$("#feePaymentStep").html("19");
	    	$('#riskLevelVal').val("High Risk");
	    	
	    	if(catOne.length == 0 && cateTwo.length == 0&&catThree.length == 0&&catFour.length == 0&&catFive.length == 0){
	    		$(".section-five").removeClass("hide");
	    	}if((catOne.length > 0 || cateTwo.length > 0)&& (catFour.length > 0 || catFive.length > 0)){
	    		$(".section-five").removeClass("hide");
	    	}
	    	
	    	
	    	if((catOne.length > 0 || cateTwo.length > 0) && catThree.length == 0 && catFour.length == 0 && catFive.length == 0){
	    		$("#riskLevelType #highRisk").removeClass("disabled");
	    		$("#riskLevelType #highRisk .wizard-title").removeClass("disabled-individual-rd");
	    		$("#riskLevelType #highRisk").css({"pointer-events": "auto", opacity: "1",});
	    		$("#riskLevelType #highRisk").addClass("active");
	    		$('#riskLevelVal').val("High Risk");
	    		$("#riskLevelType #highRisk").find("img").addClass("hide");
	    		$("#riskLevelType #highRisk").find("img.active").removeClass("hide");
	    		
	    		$("#applicationLicenceType #registrationApplication").addClass("disabled");
				$("#applicationLicenceType #registrationApplication .wizard-title").addClass("disabled-individual-rd");
				$("#applicationLicenceType #registrationApplication").css({"pointer-events": "none", opacity: "0.4",});

				$("#applicationLicenceType #licenceApplication").addClass("active");
				$("#applicationTypeVal").val("Application for Licence");
				
				$(".section-five").removeClass("hide");
				
	    	}else if(catThree.length > 0 && cateTwo.length == 0 && catOne.length == 0 && catFour.length == 0 && catFive.length == 0){
	    		$("#riskLevelType #mediumRisk").removeClass("disabled");
	    		$("#riskLevelType #mediumRisk .wizard-title").removeClass("disabled-individual-rd");
	    		$("#riskLevelType #mediumRisk").css({"pointer-events": "auto", opacity: "1",});
	    		$("#riskLevelType #mediumRisk").addClass("active");
	    		$("#riskLevelVal").val("Medium Risk");
	    		
	    		$("#riskLevelType #mediumRisk").find("img").addClass("hide");
	    		$("#riskLevelType #mediumRisk").find("img.active").removeClass("hide");
	    		
	    		$("#applicationLicenceType #registrationApplication").addClass("disabled");
				$("#applicationLicenceType #registrationApplication .wizard-title").addClass("disabled-individual-rd");
				$("#applicationLicenceType #registrationApplication").css({"pointer-events": "none", opacity: "0.4",});

				$("#applicationLicenceType #licenceApplication").addClass("active");
				$("#applicationTypeVal").val("Application for Licence");
				
				$(".section-five").removeClass("hide");
				
	    	}else if((catFour.length > 0 || catFive.length > 0) && catThree.length == 0 && catOne.length == 0 && cateTwo.length == 0){
	    		$("#riskLevelType #lowRisk").removeClass("disabled");
	    		$("#riskLevelType #lowRisk .wizard-title").removeClass("disabled-individual-rd");
	    		$("#riskLevelType #lowRisk").css({"pointer-events": "auto", opacity: "1",});
	    		$("#riskLevelType #lowRisk").addClass("active");
	    		$("#riskLevelVal").val("Low Risk");
	    		
	    		$("#riskLevelType #lowRisk").find("img").addClass("hide");
	    		$("#riskLevelType #lowRisk").find("img.active").removeClass("hide");
	    		
	    		$("#applicationLicenceType #licenceApplication").addClass("disabled");
				$("#applicationLicenceType #licenceApplication .wizard-title").addClass("disabled-individual-rd");
				$("#applicationLicenceType #licenceApplication").css({"pointer-events": "none", opacity: "0.4",});

				$("#applicationLicenceType #registrationApplication").addClass("active");
				$("#applicationTypeVal").val("Application for Registration");
				
				
				$(".section-six").removeClass("hide");
				
	    	}else{
	    		$("#riskLevelType #highRisk").removeClass("disabled");
	    		$("#riskLevelType #highRisk .wizard-title").removeClass("disabled-individual-rd");
	    		$("#riskLevelType #highRisk").css({"pointer-events": "auto", opacity: "1",});
	    		$("#riskLevelType #highRisk").addClass("active");
	    		
	    		$("#riskLevelType #highRisk").find("img").addClass("hide");
	    		$("#riskLevelType #highRisk").find("img.active").removeClass("hide");
	    		
	    		$("#applicationLicenceType #registrationApplication").addClass("disabled");
				$("#applicationLicenceType #registrationApplication .wizard-title").addClass("disabled-individual-rd");
				$("#applicationLicenceType #registrationApplication").css({"pointer-events": "none", opacity: "0.4",});

				$("#applicationLicenceType #licenceApplication").addClass("active");
				$("#applicationTypeVal").val("Application for Licence");
				
	    	}
	    	
		}
		if(applicantType == "Service Providers"){
			$("#serviceProvidersFeeIcon").removeClass("hide");
			
			$("#applicationLicenceType, #transactionType").removeClass("hide");
			
			$("#applicationLicenceType #registrationApplication").addClass("disabled");
			$("#applicationLicenceType #registrationApplication .wizard-title").addClass("disabled-individual-rd");
			$("#applicationLicenceType #registrationApplication").css({"pointer-events": "none", opacity: "0.4",});

			$("#applicationLicenceType #licenceApplication").addClass("active");
			$("#applicationTypeVal").val("Application for Licence");
			
			/* FORMS */
			$(".nuclear-safety-forms").removeClass("hide");
			$(".section-five, .section-six, .notification-practices-forms, .fit-proper-declaration-forms").addClass("hide");
			$("#supportingDocStep").html("9");
	    	$("#feePaymentStep").html("10");
			
		}
		if(applicantType == "Brokers"){
			$("#brokerFeeIcon").removeClass("hide");
			$("#brokerTransactionType").removeClass("hide");
	    	/* FORMS */
	    	$(".broker-registration-forms").removeClass("hide");
	    	$("#supportingDocStep").html("3");
	    	$("#feePaymentStep").html("4");
		}
		if(applicantType == "Qualified Experts"){
			$("#qualifiedFeeIcon").removeClass("hide");
			$("#brokerTransactionType").removeClass("hide");
	    	/* FORMS */
	    	$(".qualified-expert-forms").removeClass("hide");
	    	$("#supportingDocStep").html("5");
	    	$("#feePaymentStep").html("6");
		}
		$("#specificApplicableType").addClass("hide");
		$("#transactionType .wizard-card").removeClass("active");
		$("#brokerTransactionType .wizard-card").removeClass("active");
    	$("#hsraTransactionFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});    	
    }
    
	if(currentFieldSet == "hsraTransactionFieldset"){
		showSelectedCategoryForm();
		activeSelectForm();
		pendingHsraApplication();
        applicantTypeVal = $("#applicantTypeVal").val();
		$("#hsraFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
        if(applicantTypeVal == "Users of Radiation Sources"){
            legalPersonName = $("#legalPersonName").val();
		    legalPersonEmail = $("#legalPersonEmail").val();
            if(legalPersonName && legalPersonEmail){
                $("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
            }
		}

		if(applicantTypeVal == "Service Providers"){
            nuclearName = $("#nuclearName").val();
		    nuclearEmailAdd = $("#nuclearEmailAdd").val();
            if(nuclearName && nuclearEmailAdd){
                $("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
            }
		}

		if(applicantTypeVal == "Brokers"){
            organizationNameD = $("#organizationNameD").val();
		    organizationEmailAdd = $("#organizationEmailAdd").val();
            if(organizationNameD && organizationEmailAdd){
                $("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
            }
		}

		typeOfApplication = $("#applicantTypeVal").val();
			if (typeOfApplication == "Users of Radiation Sources" || $("#applicantTypeVal").val() == "Service Providers") {
				if (hsraDocCount == 1) {
					gettingDocumentList();
				}
				hsraDocCount++;
			} 

			if ($("#applicantTypeVal").val() == "Brokers") {
				if (hsraBrokerDocCount == 1) {
					gettingDocumentList();
				}
				hsraBrokerDocCount++;
			}

			if ($("#applicantTypeVal").val() == "Qualified Experts") {
				if (hsraQualifiedDocCount == 1) {
					gettingDocumentList();
				}
				hsraQualifiedDocCount++;
			}
	}
	if(currentFieldSet == "hsraFormsFieldset"){
		addBrokerDeclaration();
		addQualityexpertDeclaration();
		uploadDocuments('declarationSignBtn',"Signature of Declaration");	
		 var requiredDoc = $("div[id='requiredDoc']").length;
		filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		if(requiredDoc >= 1){
			$(".mandatory-doc-heading").removeClass("hide");
			numberOfDocument = requiredDoc;
			if(numberOfDocument != filledDocument){
				$("#hsraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			}
		}
	}
	if(currentFieldSet == "hsraSupportingDocumentFieldset"){
		uploadDocuments('hsraGenericUpload','Generic Documents');
	}
	if(currentFieldSet == "hsrafeePaymentFieldset"){
		uploadDocuments('hsraGenericUpload','Generic Documents');
		downloadPDF();
		submitFeeDetailsInHsra();
		showFinalSubmitButton();
		finalPreviewScroll();
		$(".fee-amount-preview").html($("#amountPaid").val());
    	$(".fee-currency-preview").html($("#amountCurrency").val());
    	previewMethod();
    	docRenderCount = 1;
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
  jQuery('.form-wizard-previous-btn').click(function () {
	  var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	  var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	    if(currentFieldSet == "hsraTransactionFieldset"){
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
    $('.nav-tabs > li a[title]').tooltip(); 
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
   
$(document).ready(function () {
    var selectedFiles = [];
    var selectedGenericFiles = [];
    
    function updateFileInput() {
        var newFileList = new DataTransfer();
        for (var i = 0; i < selectedFiles.length; i++) {
            newFileList.items.add(selectedFiles[i]);
        }
        $('#hsraGenericUpload')[0].files = newFileList.files;
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
        renderPreview(); 
        updateFileInput();
    });

    $(document).on('change', '#hsraGenericUpload', function () {
        var files = $(this)[0].files;
        var newFiles = [];

        for (var i = 0; i < files.length; i++) {
            var selectedGenericFiles = $(".generic-document-list")
                .find("#document-name")
                .map(function () {
                    return $(this).html();
                })
                .get();
            var genericFileExists = selectedGenericFiles.some(function (genericFile) {
                return genericFile === files[i].name; 
            });
            
            var fileExists = selectedFiles.some(function (file) {
                return file.name === files[i].name;
            });
            var hsraApplicationId = "<%=hsraApplicationId%>";
        	if(hsraApplicationId > 0 ){
        		if (!fileExists && !genericFileExists) {
                    newFiles.push(files[i]);
                }
        	}else{
        		if (!fileExists) {
                    newFiles.push(files[i]);
                }
        	}
        }
        selectedFiles = selectedFiles.concat(newFiles); 
        renderPreview(); 
        updateFileInput();
        if (selectedFiles.length > 0) {
            $('.uploaded-delete').show();
            $(".noAdditionalSupportingDoc").hide();
            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
            $("#hsraFormPreviewFieldset .custom_loader").removeClass("hide");
            $(".preview-section").addClass("hide");
        } else {
        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
            $('.uploaded-delete').hide();
            $(".noAdditionalSupportingDoc").show();
            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
            $("#hsraFormPreviewFieldset .custom_loader").addClass("hide");
            $(".preview-section").removeClass("hide");
        	}
        }
    });
});
function deleteDoc(id) {
    var currentId = id;
	$(".document-container-preview"+currentId).remove();
}

 function showFinalSubmitButton(){
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        if(currentFieldSet == "hsrafeePaymentFieldset" || currentFieldSet == "hsraFormPreviewFieldset"){
                $(".form-wizard-next-btn ").hide();
                $(".form-wizard-save-btn").hide();
                $(".final-submit").removeClass("hide");
            }else{
                $(".form-wizard-next-btn").show();
                $(".form-wizard-save-btn").show();
                $(".final-submit").addClass("hide");
            }
    } 
 function openSaveToDraftPopup(){
     $(".savecountinuePopup").modal("show");
     hsraApplicationId=$("#hsraApplicationId").val();
		typeOfApplicant=$("#applicantTypeVal").val();
		typeOfActivities=$("#activityTypeVal").val();
		applicantType = $("#applicantTypeVal").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		applicantType = $("#applicantTypeVal").val();
		
		
		if(applicantType == "Users of Radiation Sources" || applicantType == "Service Providers"){
		   currentFormToSaveNuclearSafety = $("#hsraFormsFieldset .nuclear-safety-forms#side-tabs").find(".active span:nth-child(2)").text();
		   if(currentFormToSaveNuclearSafety == "Instructions"){
			   applicantInfo(true);
		   }else if(currentFormToSaveNuclearSafety=="Section I"){
			   radiationSectionOneHsraApplication(true);
		   }else if(currentFormToSaveNuclearSafety=="Section II"){
			   applicantDetailSecTwoHsraApplication(true);
		   }else if(currentFormToSaveNuclearSafety=="Section III"){
			   detailOfBusinessSecThree(true);
			   uploadDocuments('financialGuaranteeUpload',"Financial Guarantee","Financial Guarantee");
		   }else if(currentFormToSaveNuclearSafety=="Section IV"){
			   addUnsealedSourcesDetail();
				addSealedSourcesDetail();
				addRadiationDevicesDetail();
				purposeOfPropLicenceSecFour(true);
			}else if(currentFormToSaveNuclearSafety=="Section V"){
				addAlternateRsoDetail();
				addQualifedExpertDetail();
				radiationSafetyProgramSectionFive(true);
				 uploadDocuments('copy-of-cv',"Radiation Safety Officer Details","Radiation Safety Officer (RSO) Details");
		    	 uploadDocuments('experience-copy',"Copy of the curriculum vitae","Copy of the curriculum vitae or resume of the prospective alternate RSO indicating radiation safety-related experience.");
		    	 uploadDocuments('certificates-copy',"Copies of relevant","Copies of relevant RSO training certificates of the prospective RSO.");
		    	 uploadDocuments('qualified-copy',"Details of Qualified Expert ","Qualified Expert Details");
		    	 uploadDocuments('curriculum-copy',"Curriculum Vitae Copy","Copy of the curriculum vitae or resume of the prospective alternate Qualified Expert indicating radiation safety-related experience.");
		    	 uploadDocuments('qualified-expert',"Prospective Qualified Expert","Copies of relevant training certificates of the prospective Qualified Expert.");
		    	 uploadDocuments('applicantRepresentativeSignatureBtn',"Signature of Representative");
		    	 uploadDocuments('classificationOfWorkers',"Safety Classification of Workers","Classification of Workers");
		    	 uploadDocuments('radiationProUpload',"Radiation Protection Program","Radiation Protection Program (RPP)");
		    	 uploadDocuments('scopeOfActivitiesUpload',"Scope of Activities","Scope of Activities");
		    	 uploadDocuments('managementSystemUpload',"Safety Management System","Management System");
		    	 uploadDocuments('workerRecordingsUpload',"Safety Recording Doses","Ascertaining and recording doses to workers");
		    	 uploadDocuments('constraintsLimitsUpload',"Safety Dose Limit Optimization","Dose limits, dose constraints and optimization");
		    	 uploadDocuments('equipmentMonitoringUpload',"maintenance of individual","Acquisition and maintenance of individual monitoring equipment");
		    	 uploadDocuments('areasControlUpload',"Safety Workplace Monitoring","Workplace Monitoring");
		    	 uploadDocuments('classificationAreaUpload',"Classification Control","Classification of areas (control and supervised areas) and local rules");
		    	 uploadDocuments('radioactiveSourcesUpload',"Control of radioactive","Control of radioactive contamination; where unsealed radiation sources are handled");
		    	 uploadDocuments('radiationiInstrumentsUpload',"Radiation detection instrum","Radiation detection instruments");
		    	 uploadDocuments('healthWorkersUpload',"Health Surveillance of Workers","Health Surveillance of Workers");
		    	 uploadDocuments('investigationLevelUpload',"Investigation Levels","Investigation Levels and Feedback of Operating Experience");
		    	 uploadDocuments('recordReportingUpload',"Record Reporting System","Record and Reporting System");
		    	 uploadDocuments('securityAccessUpload',"Access control and security","Access control and security");
		    	 uploadDocuments('raditionSourcesUpload',"Controlling possession","Controlling possession of radiation sources");
		    	 uploadDocuments('workerTrainingUpload',"Worker Training","Worker Training and Authorization");
		    	 uploadDocuments('publicControlUpload',"Control of Public Exposure","Control of Public Exposure");
		    	 uploadDocuments('emergencyProceeUpload',"Safety Emergency Procedures","Emergency Procedures");
		    	 uploadDocuments('licenceLocationUpload',"Safety Decommissioning","Decommissioning");
		    	 uploadDocuments('lowAchievableProgramUpload',"Low As Reasonably Achievable","As Low As Reasonably Achievable (ALARA) Program");
		    	 uploadDocuments('leakTestingUpload',"Leak testing of sealed sources","Leak testing of sealed sources");
		    	 uploadDocuments('transferSourcesUpload',"Transfer of radiation sources","Transfer of radiation sources");
		    	 uploadDocuments('nuclearMaterialsUpload',"Nuclear Materials Transfer","Transfer of radiation sources and / nuclear materials");
		    	 uploadDocuments('transportPackagingUpload',"Packaging Transfer Material","Packaging and transport of radiation sources and/nuclear materials");
		    	 uploadDocuments('internalReviewUpload',"Safety Internal review","Internal review");
		    	 uploadDocuments('sourcesActivitiesUpload',"Append Safety Assessment","Append Safety Assessment for facilities of activities involving sources of Categories 1 and 2");
			}else if(currentFormToSaveNuclearSafety=="Section VI"){
				addAlternateRsoOneDetail();
				addQualifedExpertOneDetail();
				radiationSafetyLowRiskSectionSix(true);
				uploadDocuments('relevant-cv-copy',"Relevant Cv Copy","Qualified Expert Details");
		    	uploadDocuments('certificates-cv',"Certificate Cv","Radiation Safety Officer (RSO) Details");
		    	uploadDocuments('resume-copy',"Resume Copy","Copy of the curriculum vitae or resume of the prospective alternate RSO indicating radiation safety-related experience.");
		    	uploadDocuments('training-copy',"Training Copy","Copies of relevant RSO training certificates of the prospective RSO");
		    	uploadDocuments('qualified-resume-copy',"Qualified Resume Copy","Copy of the curriculum vitae or resume");
		    	uploadDocuments('training-expert',"Training Expert","Copies of relevant training certificates");
			}else if(currentFormToSaveNuclearSafety=="Section VII"){
				addMedicalPractitionerDetail();
				addAcknowledgementMedicalDetail();
				addApplicantSignatureDetail();
				addSectionSeventhDetail(true);
				uploadDocuments('administrationTreatmentUpload', "Administration of Radiation", "Administration of Radiation Doses for Therapeutic Treatment");
				uploadDocuments('qualityProgrammeUpload', "Quality Assurance Programme", "Quality Assurance Programme for Medical Exposure");
				uploadDocuments('instructionsCaregiversUpload', "Instructions to Caregiver", "Instructions to Caregivers");
				uploadDocuments('instructionsPatientsUpload', "Instructions to Patients", "Instructions to Patients and their Families");
				uploadDocuments('patientsReleaseUpload', "Release of Patients", "Release of Patients");
				uploadDocuments('treatmentRoomsUpload', "Release of Treatment Rooms", "Decontamination and Release of Treatment Rooms");
				uploadDocuments('medicalEmergenciesUpload', "Medical Emergencies", "Medical Emergencies");
				uploadDocuments('nuclearMedicineUpload', "Therapeutic Nuclear Medicine", "For Therapeutic Nuclear Medicine: Assignment of Nuclear Medicine Therapy Rooms");
				uploadDocuments('diagnosticStudiesUpload', "Diagnostic Studies Protocols", "Diagnostic Studies Protocols and Procedures");
				uploadDocuments('biomedicalResearchUpload', "Biomedical Research", "For Biomedical Research");
				uploadDocuments('researchReviewUpload', "Research Review Committee", "Research Review Committee");
				uploadDocuments('emergencyOperatingUpload', "Emergency and Operating", "Emergency and Operating Procedures");
				uploadDocuments('certificatePackagesUpload', "Application for Registration", "Application for Registration of Use of Packages");
				uploadDocuments('exposureDevicesUpload', "Use of Exposure Devices", "Maintenance and Use of Exposure Devices");
				uploadDocuments('equipmentSafetyUpload', "Safety Emergency Equipment", "Safety and Emergency Equipment");
				uploadDocuments('transportPlanOneUpload', "Transport Plan", "Transport Plan");
				uploadDocuments('animalsTreatmentUpload', "Treatment to Animals", "Administering Treatment to Animals");
				uploadDocuments('animalHousingUpload', "Animal Housing", "Animal Housing");
				uploadDocuments('disposalWasteUpload', "Disposal of Animal Waste", "Disposal of Animal Waste");
				uploadDocuments('monitoringAnimalHousingUpload', "Release of Animal Housing", "Monitoring and Release of Animal Housing");
				uploadDocuments('releaseAnimalsUpload', "Release of Animals", "Release of Animals");
				uploadDocuments('proceduresAppUpload', "Append Procedures", "Procedures");
				uploadDocuments('disposalsAppUpload', "Management Disposal Waste", "Disposals");
				uploadDocuments('monitoringMaterialNuUpload', "Procedures for Monitoring", "Monitoring");
				uploadDocuments('handlingProceduresUpload', "Handling Procedures", "Handling Procedures");
				uploadDocuments('hoppersEntryUpload', "Rules for Entry into the Vessels", "Rules for Entry into the Vessels or Hoppers");
				uploadDocuments('operatingConditionsUpload', "Operating Conditions", "Operating Conditions and Maintenance Programme");
				uploadDocuments('insertionTypeUpload', "Operation of Insertion-Type", "Operation of Insertion-Type Fixed Gauges");
				uploadDocuments('installationFixedUpload', "Installation of Fixed Gauges", "Installation and Dismounting of Fixed Gauges");
				uploadDocuments('transportPlanGaugeUpload', "Transport Plan", "Transport Plan");
				uploadDocuments('EmergencyAdditionUpload', "Emergency Procedures", "Emergency Procedures");
				uploadDocuments('nuclearEnviromentUpload', "Release of Radiation Sources", "Release of Radiation Sources");
				uploadDocuments('fishingToolUpload', "Fishing for Stuck Tools", "Fishing for Stuck Tools/Sources");
				uploadDocuments('sealedSourcesUpload', "Abandonment of Sealed Sources", "Abandonment of Sealed Sources");
				uploadDocuments('abandonmentZoneUpload', "Abandonment of Unsealed Sources", "Abandonment of Unsealed Sources");
				uploadDocuments('servicingCopyUpload', "Servicing Procedures", "Servicing Procedures");
				uploadDocuments('manufacturingDevelopmentUpload', "Copy of All Manufacturing", "Manufacturing or Development Procedures");
				uploadDocuments('acknowledgementMedicalSignatureUpload',"Signature of Acknowledgement Medical");
				uploadDocuments('applicantSignaturelegalSignatureUpload',"Signature of Applicant Medical");
				
			}else if(currentFormToSaveNuclearSafety=="Declaration"){
				uploadDocuments('signatureOperatorBtn',"Signature of Service Declaration");
				radiationDeclaration(true);
			}else if(currentFormToSaveNuclearSafety=="Section 1 : Address and Contact Information"){
				addLegalInformation(true);
			}else if(currentFormToSaveNuclearSafety=="Section 2 : Details of Source"){
				addSourcesDetail();
				addDetailSource(true);
			}else if(currentFormToSaveNuclearSafety=="Section 3 : Radionuclide"){
				addRadionuclideDetail();
				addRadionuclideButton(true);
			}else if(currentFormToSaveNuclearSafety=="Section 4 : Radiation Generating Equipment"){
				addGenEquipmentDetail();
				addRadiationGeneratinEquipment(true);
				uploadDocuments('legalPersonSignatureBtn',"Signature of Equip");
			}
		}  
		
		if(currentStage == "SUPPORTING DOCUMENTS"){
			uploadDocuments('hsraGenericUpload','Generic Documents');
		   }
		if(currentStage == "APPLICATION FEES PAYMENT"){
			uploadDocuments('hsraGenericUpload','Generic Documents');
			submitFeeDetailsInHsra();
		   }

		if(applicantType == "Brokers"){
			currentFormToSaveBrokers = $("#hsraFormsFieldset .broker-registration-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveBrokers=="Broker Registration"){
				addBrokerDetail(true);
				uploadDocuments('proof-copy',"Certified Copy of Broker Licence","License Customs Brokers Information");
			}else if(currentFormToSaveBrokers=="Declaration"){
				addBrokerDeclaration();
				uploadDocuments('signatureBrokerBtn',"Signature of Broker");
			}
		}
		if(applicantType == "Qualified Experts"){
			currentFormToSaveQualified = $("#hsraFormsFieldset .qualified-expert-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveQualified=="Instructions"){
				/* addInstructionsDetails(true); */
		    }else if(currentFormToSaveQualified=="Part A : Applicant Details"){
				addExpertDetails(true);
				uploadDocuments('expertSignatureBtn',"Signature of Quality Expert");
			}else if(currentFormToSaveQualified=="Part B : Employment Details"){
				addEmploymentDetails(true);
			}else if(currentFormToSaveQualified=="Part C : Proficiency Details"){
				addProficiencyDetails(true);
			}else if(currentFormToSaveQualified=="Declaration"){
				addQualityexpertDeclaration();
				uploadDocuments('declarationSignBtn',"Signature of Declaration");
			}
		}
		
		var categoryOfSourcesOne=  new Array();
		$("input:checkbox[name=categoryOne]:checked").each(function(){
			categoryOfSourcesOne.push($(this).val());
		});
		var categoryOne= categoryOfSourcesOne.toString();
		
		var categoryOfSourcesTwo=  new Array();
		$("input:checkbox[name=categoryTwo]:checked").each(function(){
			categoryOfSourcesTwo.push($(this).val());
		});
		var categoryTwo= categoryOfSourcesTwo.toString();
		
		var categoryOfSourcesThree=  new Array();
		$("input:checkbox[name=categoryThree]:checked").each(function(){
			categoryOfSourcesThree.push($(this).val());
		});
		var categoryThree= categoryOfSourcesThree.toString();
		
		var categoryOfSourcesFour=  new Array();
		$("input:checkbox[name=categoryFour]:checked").each(function(){
			categoryOfSourcesFour.push($(this).val());
		});
		var categoryFour= categoryOfSourcesFour.toString();
		
		var categoryOfSourcesFive=  new Array();
		$("input:checkbox[name=categoryFive]:checked").each(function(){
			categoryOfSourcesFive.push($(this).val());
		});
		var categoryFive= categoryOfSourcesFive.toString();
		
		riskLevel=$("#riskLevelVal").val();
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfTransaction=$("#transactionTypeVal").val();
		brokerTransactionType=$("#brokerTransactionTypeVal").val();
		selectedSpecificType = [];
		$("#specificApplicableType").find(".wizard-card.active .wizard-title").each(function() {
			selectedSpecificType.push($(this).html());
		});
		specificApplicable = selectedSpecificType.toString();
		
		qualifiedAreaType = [];
		$("#qualifiedAreaType").find(".wizard-card.active .wizard-title").each(function() {
			qualifiedAreaType.push($(this).html());
		});
		qualifiedArea = qualifiedAreaType.toString();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		saveAndContinue = "true"; 
		 $.ajax({
			    type: "POST",
			    url: "${hsraPendingUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
			    	  "<portlet:namespace/>typeOfActivities": typeOfActivities,
			    	  "<portlet:namespace/>categoryOne": categoryOne,
			    	  "<portlet:namespace/>categoryTwo": categoryTwo,
			    	  "<portlet:namespace/>categoryThree": categoryThree,
			    	  "<portlet:namespace/>categoryFour": categoryFour,
			    	  "<portlet:namespace/>categoryFive": categoryFive,
			    	  "<portlet:namespace/>riskLevel": riskLevel,
			    	  "<portlet:namespace/>typeOfApplication": typeOfApplication,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>brokerTransactionType": brokerTransactionType,
			    	  "<portlet:namespace/>specificApplicable": specificApplicable,
			    	  "<portlet:namespace/>currentStage": currentStage,
			    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			    	  "<portlet:namespace/>saveAndContinue": saveAndContinue,
			    	  "<portlet:namespace/>qualifiedArea": qualifiedArea,
			      		    },
		    async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
					$("#hsraApplicationId").val(
							result["hsraApplicationId"]);
					var applicationNumber = result["hsraAppNum"];
					var hsraCategory = result["hsraCategory"];
					var hsraDraftCategory = result["hsraDraftCategory"];
					
					if (applicationNumber != null
							&& hsraCategory != null) {
						$("#pop_app_no").html(
								result["hsraAppNum"]);
						$("#pop_category").html(result["hsraCategory"]);
						$("#draftCategory").html(result["hsraDraftCategory"]);
						/* $("#draftCategory").html(result["hsraCategory"]); */
						
						if(hsraCategory == "Users of Radiation Sources" || hsraCategory == "Service Providers"){
				    		if(hsraDraftCategory == "Application for Licence"){
				    			$("#draftCategory").html("Licence for Authorisation");
				    		}
				    		if(hsraDraftCategory == "Application for Registration"){
				    			$("#draftCategory").html("Registration for Authorisation");
				    		}
				    	}
				    	if(hsraCategory == "Brokers" || hsraCategory == "Qualified Experts"){
				    		$("#draftCategory").html("Registration for Authorisation");
				    	}
					}
	 	    	},
				 error: function (data) {
			    },
			  });
 }
 function openSaveToSubmitPopup() {
	 submitHsraApplication();
     $(".final-submit-container").removeClass("hide");
 }

$("#makePayment").click(function () {
	  $("#paymentPopUp").modal("show");
	});

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


	$("#hsra-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#hsra-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #mining-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #medical-payment-upload").val('');
	    }
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
	
	function previewMethod() {
	    // For input and textarea elements
	    $("input, textarea, select").each(function() {
	        $(this).each(function() {
	            if($(this).val() != "") {
	                let preId = $(this).prop('id') + "Preview";
	                $("#" + preId).html($(this).val());
	            }
	        });
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
	            let checkedValues = ""; 
	            let checkboxName = $(this).prop('name'); 
	            
	            $("input[type='checkbox'][name='" + checkboxName + "']:checked").each(function() {
	                checkedValues += $(this).val() + ", "; 
	            });
	            
	            let preId = checkboxName + "Preview"; 
	            $("#" + preId).html(checkedValues.slice(0, -2)); 
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
	/* Application Form Save */ 
	  function pendingHsraApplication(){
		hsraApplicationId=$("#hsraApplicationId").val();
		typeOfApplicant=$("#applicantTypeVal").val();
		typeOfActivities=$("#activityTypeVal").val();
		var categoryOfSourcesOne=  new Array();
		$("input:checkbox[name=categoryOne]:checked").each(function(){
			categoryOfSourcesOne.push($(this).val());
		});
		var categoryOne= categoryOfSourcesOne.toString();
		
		var categoryOfSourcesTwo=  new Array();
		$("input:checkbox[name=categoryTwo]:checked").each(function(){
			categoryOfSourcesTwo.push($(this).val());
		});
		var categoryTwo= categoryOfSourcesTwo.toString();
		
		var categoryOfSourcesThree=  new Array();
		$("input:checkbox[name=categoryThree]:checked").each(function(){
			categoryOfSourcesThree.push($(this).val());
		});
		var categoryThree= categoryOfSourcesThree.toString();
		
		var categoryOfSourcesFour=  new Array();
		$("input:checkbox[name=categoryFour]:checked").each(function(){
			categoryOfSourcesFour.push($(this).val());
		});
		var categoryFour= categoryOfSourcesFour.toString();
		
		var categoryOfSourcesFive=  new Array();
		$("input:checkbox[name=categoryFive]:checked").each(function(){
			categoryOfSourcesFive.push($(this).val());
		});
		var categoryFive= categoryOfSourcesFive.toString();
		riskLevel=$("#riskLevelVal").val();
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfTransaction=$("#transactionTypeVal").val();
		brokerTransactionType=$("#brokerTransactionTypeVal").val();
		selectedSpecificType = [];
		$("#specificApplicableType").find(".wizard-card.active .wizard-title").each(function() {
			selectedSpecificType.push($(this).html());
		});
		specificApplicable = selectedSpecificType.toString();
		qualifiedAreaType = [];
		$("#qualifiedAreaType").find(".wizard-card.active .wizard-title").each(function() {
			qualifiedAreaType.push($(this).html());
		});
		qualifiedArea = qualifiedAreaType.toString();
		/* specificApplicable=$("#registrationPracticesTypeVal").val(); */
		 $.ajax({
			    type: "POST",
			    url: "${hsraPendingUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
			    	  "<portlet:namespace/>typeOfActivities": typeOfActivities,
			    	  "<portlet:namespace/>categoryOne": categoryOne,
			    	  "<portlet:namespace/>categoryTwo": categoryTwo,
			    	  "<portlet:namespace/>categoryThree": categoryThree,
			    	  "<portlet:namespace/>categoryFour": categoryFour,
			    	  "<portlet:namespace/>categoryFive": categoryFive,
			    	  "<portlet:namespace/>riskLevel": riskLevel,
			    	  "<portlet:namespace/>typeOfApplication": typeOfApplication,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>brokerTransactionType": brokerTransactionType,
			    	  "<portlet:namespace/>specificApplicable": specificApplicable,
			    	  "<portlet:namespace/>qualifiedArea": qualifiedArea,
			      		    },
		    async:false,
			    success: function (data) { 
			       var result = data.APP_DATA;
			    	$("#hsraApplicationId").val(result["hsraApplicationId"]);
			    	gettingDocumentList();
	 	    	},
				 error: function (data) {
			    },
			  });
	}
	  /*Download Pdf*/
	 	function downloadPDF() {
	    	hsraApplicationId=$("#hsraApplicationId").val();
			checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
	        $.ajax({
	                type: "POST",
	                url: "${hsraDownloadPDFUrl}",
	                data: {
	                        "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
	                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
	                },
	                success: function(data) {
	                        var result = data.APP_DATA;
	                        $("#hsraDownloadPDF").attr("href", result["fileUrl"]);
	                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
	                },
	                error: function(data) {},
	        });
	    }
	  
		 function renewLicense() {
			 
				$("#variation-submit-btn").attr("disabled", "disabled");
		        $("#registrationNumberValidation").addClass("hide");
		        licenseNumber = $("#registrationNumber").val();
				typeOfApplicant=$("#applicantTypeVal").val();
				registrationDate=$("#registrationDate").val();
				brokerTransactionType=$("#brokerTransactionTypeVal").val();
				
		        $.ajax({
		                type: "POST",
		                url: '${renewLicenseUrl}',
		                data: {
		                        "<portlet:namespace/>licenseNumber":licenseNumber,
								"<portlet:namespace/>typeOfApplicant":typeOfApplicant,
								"<portlet:namespace/>registrationDate":registrationDate,
								"<portlet:namespace/>brokerTransactionType":brokerTransactionType,
		                       
		                },
		                success: function(data) {
		                	var result = data.APP_DATA;
		                	var renewLicenseUrl=result["renewLicenseUrl"];
		                	var validation=result["licenseNumberCheck"];
		                	console.log(validation);
		                        if (validation == 0) {
		                                $("#registrationNumberValidation").removeClass("hide");
		                                $("#variation-submit-btn").removeAttr("disabled"); 
										$("#registrationNumber").focus();
		                        }else{
		                        	window.location.href = renewLicenseUrl;
		                        }
		                },
		                error: function(data) {}
		        });
			} 
			function renewLicenseRadiation() {
			 
				$("#variation-submit-btn").attr("disabled", "disabled");
		        $("#currentAuthorizationValidation").addClass("hide");
		        licenseNumber = $("#currentAuthorization").val();
				typeOfApplicant=$("#applicantTypeVal").val();
				riskLevel=$('#riskLevelVal').val();
		        $.ajax({
		                type: "POST",
		                url: '${renewLicenseUrl}',
		                data: {
		                        "<portlet:namespace/>licenseNumber":licenseNumber,
								"<portlet:namespace/>typeOfApplicant":typeOfApplicant,
								"<portlet:namespace/>riskLevel":riskLevel,
		                       
		                },
		                success: function(data) {
		                	var result = data.APP_DATA;
		                	var renewLicenseUrl=result["renewLicenseUrl"];
		                	var validation=result["licenseNumberCheck"];
		                	console.log(validation);
		                        if (validation == 0) {
		                                $("#currentAuthorizationValidation").removeClass("hide");
		                                $("#variation-submit-btn").removeAttr("disabled"); 
									
		                        }else{
		                        	window.location.href = renewLicenseUrl;
		                        }
		                },
		                error: function(data) {}
		        });
			} 
	  function submitHsraApplication(){
		  hsraApplicationId=$("#hsraApplicationId").val();
			typeOfApplicant=$("#applicantTypeVal").val();
			typeOfActivities=$("#activityTypeVal").val();
			 $.ajax({
				    type: "POST",
				    url: "${hsraSubmitApplicationUrl}",
				    data: {
				    	
				    	"<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				    	  "<portlet:namespace/>typeOfActivities": typeOfActivities,
				      		    },
	  		    async:false,
				    success: function (data) { 
				    	var result = data.APP_DATA;
				    	var appStatus = result["appStatus"];
						   if(appStatus=="submitted"){
						   		$("#continueDashboardHsra").removeClass("hide");
						   		$("#submitted-content").removeClass("hide");
						   		$("#application_submitted-img").removeClass("hide");
						   	}else{
						   		
						   		$("#draft-content").removeClass("hide");
						   		$("#application_draft-img").removeClass("hide");
						   		$("#application_submitted-img").addClass("hide");
						   		
						   	}
						$(".custom_loader").addClass("hide");
						if(result!=null){
							console.log("Result categoryOfSources is -- "+result["categoryOfSources"]);
							category = result["category"];
							categoryOfSources = result["categoryOfSources"];
							console.log("Result categoryOfSources is -- "+categoryOfSources);
					    	$("#submit_pop_app_no").html(result["hsraAppNo"]);
					    	$("#submit_pop_status").html(result["appStatus"]);
					    	$("#submit_pop_category").html(result["category"]);
					    	$("#submittedCategory").html(result["category"]);
					    	$("#hsraApplicationId").val(result["hsraApplicationId"]);
					    	if(category == "Users of Radiation Sources" || category == "Service Providers"){
					    		if(categoryOfSources == "Application for Licence"){
					    			$(".submitted-status").html("Licence for Authorisation");
					    		}
					    		if(categoryOfSources == "Application for Registration"){
					    			$(".submitted-status").html("Registration for Authorisation");
					    		}
					    	}
					    	if(category == "Brokers" || category == "Qualified Experts"){
					    		$(".submitted-status").html("Registration for Authorisation");
					    	}
					    }
		 	    	},
					 error: function (data) {
				    },
				  });
		}
	 
		function submitFeeDetailsInHsra(){
			hsraApplicationId=$("#hsraApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paymentFee").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${fireBrigadefeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
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
				     var fileID = 'hsra-payment-upload';
			   		$.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${submitFeeDetailsInHsraUrl}",
			   		    fileElementId: 'hsra-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		      "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			   			  "<portlet:namespace/>paymentFee": paymentFee,
			   		      "<portlet:namespace/>amountPaid": amountPaid,
		  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
			   		    },
			   		    success: function (data) { 
						    var parsedData = JSON.parse(data);
			   		     	console.log("parsedData new - "+parsedData);
			   		    	$.each(parsedData,function(key,entry){
								// Append the download URL to the specified element
								var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
					            console.log("decoded download URL - " + decodedUrl);
					            $("#payment-upload-preview").html(entry.fileName);
								$("#payment-upload-preview").attr("href", decodedUrl);
			   		    	});

			   		    },
			   		    error: function (data) {},
			   		  });
		     }
		}
		function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
		    hsraApplicationId=$("#hsraApplicationId").val();
			saveAndCon='<%=hsraApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
			}
		}
</script>