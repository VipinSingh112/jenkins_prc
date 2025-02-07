<portlet:resourceURL var="draftWraApplicationUrl" id="/draft/Wra/Application/Url"></portlet:resourceURL>
<portlet:resourceURL var="wraFeeDetailsUrl" id="/wra/fee/payment/Url"></portlet:resourceURL>
<portlet:resourceURL var="wraDownloadPdfUrl" id="/wra/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license"></portlet:resourceURL>
<section class="wizard-section">
    <div class="inner-common-banner">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="row align-items-center">
                        <div class="col-lg-8">
                            <p class="common-banner-upper-title f2 mb-0">Applications for</p>
                            <p class="common-banner-title f1 mb-0">Licence/Permit</p>
                            <!-- <p class="common-banner-info f2 mb-3"></p> -->
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
                                <li class="active">
                                    <p class="application-form-upper-title">Select your desired</p>
                                    <p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
                                </li>
                                <li class="">
                                    <p class="application-form-upper-title">Select</p>
                                    <p class="application-form-lower-heading">WRA TRANSACTION TYPE</p> <span></span>
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
                                <input type="hidden" id="wraApplicationId" name="wraApplicationId" value=""> 
                            <!--<input type="hidden" id="miningLeaseCurrentStage" name="miningLeaseCurrentStage">
                            <input type="hidden" id="permitNumber" name="permitNumber"> -->
                            <input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
                            <input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=wraApplicationId%>">
                        </div>
                        <%@ include file="/type-of-application/wra-application-type.jsp"%>
                        <%@ include file="/type-of-transaction/wra-transaction-type.jsp"%>
                        <%@ include file="/forms/form-tabs.jsp"%>
                        <%@ include file="/supporting-documents/wra-documents.jsp"%>
                        <%@ include file="/wra-fee-payment.jsp"%>
                        <%@ include file="/preview/final-preview-tabs.jsp"%>
                        <%@ include file="/wra-final-submission.jsp"%>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<script>
var docRenderCount = 1;
var filledDocument = "";
var numberOfDocument = "";
var wraDocCount= 1;
var wraPermitDocCount= 1;
var wraLicenceDocCount=1;
$("#applicationType .wizard-card").click(function(){
    $("#applicationType .wizard-card").removeClass("active");
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $(this).addClass("active");
    $("#applicationTypeVal").val($(this).find(".wizard-title").html());
    var applicationType = $("#applicationTypeVal").val();
    $("#userWaterType, #drillPermitType, #wraLicenceTransactionTypeBox, #wraPermitTransactionTypeBox, #abstractWaterUser, #permitRenewalSection").addClass("hide");
    $("#userWaterTypeCategories, #consumptiveSubCategories, #nonConsumptiveSubCategories").addClass('hide');
    $("#industrialTypeSubCategories, #domesticTypeSubCategories, #agricultureTypeSubCategories").addClass('hide');
    $("#drillPermitType .wizard-card").removeClass("active");
    $("#userWaterType .wizard-card").removeClass("active");
    $("#wraPermitTransactionTypeBox .wizard-card").removeClass("active");
    $("#wraLicenceTransactionTypeBox .wizard-card").removeClass("active");
    if(applicationType == "Application for a Licence to Abstract & User Water"){
		$("#userWaterType").removeClass("hide");
	}
	if(applicationType == "Application for a Permit to Drill a Well"){
		$("#drillPermitType").removeClass("hide");
	}
	if(applicationType == "Application for a Well Drillers Licence"){
		$("#wraLicenceTransactionTypeBox").removeClass("hide");
	}
});
$("#userWaterType .wizard-card").click(function(){
    $("#userWaterType .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#transactionTypeVal").val($(this).find(".wizard-title").html());
    var transactionTypeVal = $("#transactionTypeVal").val();
    $("#abstractWaterUser, #userWaterTypeCategories").addClass('hide');
    
    $("#userWaterTypeCategories .wizard-card").removeClass("active");
    
    $("#consumptiveSubCategories, #nonConsumptiveSubCategories").addClass('hide');
    $("#industrialTypeSubCategories, #domesticTypeSubCategories, #agricultureTypeSubCategories").addClass('hide');
    
    if(transactionTypeVal == "Licence Renewal"){
		$("#abstractWaterUser").removeClass('hide');
	}else{
		$("#userWaterTypeCategories").removeClass('hide');
	}
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#userWaterTypeCategories .wizard-card").click(function(){
	var selectedQuarryCategories = new Array();
    $("#userWaterTypeCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#userWaterTypeCategories").find(".wizard-card.active .wizard-title").each(function () {
		selectedQuarryCategories.push($(this).html());
    });	
    $("#userWaterTypeCategoriesVal").val($(this).find(".wizard-title").html());
    var userWaterTypeCategories = $("#userWaterTypeCategoriesVal").val();
    $("#consumptiveSubCategories, #nonConsumptiveSubCategories").addClass('hide');
    $("#industrialTypeSubCategories, #domesticTypeSubCategories, #agricultureTypeSubCategories").addClass('hide');
    
    $("#userWaterTypeCategoriesVal").val(selectedQuarryCategories);
	$("#abstractWaterPurpose").val(selectedQuarryCategories);
	
    if(userWaterTypeCategories == "Consumptive"){
		$("#consumptiveSubCategories").removeClass('hide');
	}else{
		$("#nonConsumptiveSubCategories").removeClass('hide');
	}
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    
    $("#consumptiveSubCategories .wizard-card").removeClass("active");
    $("#nonConsumptiveSubCategories .wizard-card").removeClass("active");
});

$("#consumptiveSubCategories .wizard-card").click(function(){
    $("#consumptiveSubCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#consumptiveSubCategoriesVal").val($(this).find(".wizard-title").html());
    var consumptiveSubCategories = $("#consumptiveSubCategoriesVal").val();
    $("#industrialTypeSubCategories, #domesticTypeSubCategories, #agricultureTypeSubCategories").addClass('hide');
    if(consumptiveSubCategories == "Industrial"){
		$("#industrialTypeSubCategories").removeClass('hide');
	}else if(consumptiveSubCategories == "Domestic"){
		$("#domesticTypeSubCategories").removeClass('hide');
	}else{
		$("#agricultureTypeSubCategories").removeClass('hide');
	}
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
  
    $("#industrialTypeSubCategories .wizard-card").removeClass("active");
    $("#domesticTypeSubCategories .wizard-card").removeClass("active");
    $("#agricultureTypeSubCategories .wizard-card").removeClass("active");
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});
$("#industrialTypeSubCategories .wizard-card").click(function(){
    $("#industrialTypeSubCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#industrialTypeSubCategoriesVal").val($(this).find(".wizard-title").html());
    var industrialTypeSubCategories = $("#industrialTypeSubCategoriesVal").val();
  	$("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});
$("#domesticTypeSubCategories .wizard-card").click(function(){
    $("#domesticTypeSubCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#domesticTypeSubCategoriesVal").val($(this).find(".wizard-title").html());
    var domesticTypeSubCategories = $("#domesticTypeSubCategoriesVal").val();
  	$("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});
$("#agricultureTypeSubCategories .wizard-card").click(function(){
    $("#agricultureTypeSubCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#agricultureTypeSubCategoriesVal").val($(this).find(".wizard-title").html());
    var agricultureTypeSubCategories = $("#agricultureTypeSubCategoriesVal").val();
  	$("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});
$("#nonConsumptiveSubCategories .wizard-card").click(function(){
    $("#nonConsumptiveSubCategories .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#nonConsumptiveSubCategoriesVal").val($(this).find(".wizard-title").html());
    var nonConsumptiveSubCategories = $("#nonConsumptiveSubCategoriesVal").val();
  	$("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});

$("#drillPermitType .wizard-card").click(function(){
    $("#drillPermitType .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#wraPermitTransactionTypeBox .wizard-card").removeClass("active");
    $("#wraTransactionFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $("#drillPermitTypeVal").val($(this).find(".wizard-title").html());
    var drillPermitType = $("#drillPermitTypeVal").val();
    if(drillPermitType == "Permit to Alter an Existing Well"){
    	$("#permitRenewalSection").removeClass('hide');
    	$("#wraPermitTransactionTypeBox").addClass('hide');
	}else{
		$("#permitRenewalSection").addClass('hide');
		$("#wraPermitTransactionTypeBox").removeClass('hide');
	}
});
$("#wraPermitTransactionTypeBox .wizard-card").click(function(){
    $("#wraPermitTransactionTypeBox .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#wraPermitTransactionTypeVal").val($(this).find(".wizard-title").html());
    var wraPermitTransactionTypeVal = $("#wraPermitTransactionTypeVal").val();
   /*  if(wraPermitTransactionTypeVal == "Renewal of Permit"){
		$("#permitRenewalSection").removeClass('hide');
	}
	if(wraPermitTransactionTypeVal == "New Permit"){
		$("#permitRenewalSection").addClass('hide');
	} */
    
  $("#wraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
});
$("#wraLicenceTransactionTypeBox .wizard-card").click(function(){
    $("#wraLicenceTransactionTypeBox .wizard-card").removeClass("active");
    $(this).addClass("active");
    $("#wraLicenceTransactionTypeVal").val($(this).find(".wizard-title").html());
    $("#wraTransactionFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
  var wraLicenceTransactionType = $("#wraLicenceTransactionTypeVal").val();
  if(wraLicenceTransactionType == "Licence Renewal"){
  	$("#abstractWaterUser").removeClass('hide');
	}else{
		$("#abstractWaterUser").addClass('hide');
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
    
    if(currentFieldSet == "wraTransactionFieldset"){
    	pendingWraApplication();
    	gettingDocumentList();
        $("#wraFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
        applicationType = $("#applicationTypeVal").val();
        if(applicationType == "Application for a Licence to Abstract &amp; User Water"||applicationType =="Application for a Licence to Abstract & User Water"){
        	transactionType = $("#transactionTypeVal").val();
        	if(transactionType == "New Licence"){
        		abstractApplicantName = $("#abstractApplicantName").val();
    		    abstractEmailAddress = $("#abstractEmailAddress").val();
                if(abstractApplicantName && abstractEmailAddress){
                    $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
                }
        	}
			if(transactionType == "Licence Renewal"){
				renewName = $("#renewName").val();
				renewSignName = $("#renewSignName").val();
				if(renewName && renewSignName){
                    $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
                }
        	}
            
        }else if(applicationType == "Application for a Permit to Drill a Well"){
            permitDrillingApplicantName=$("#permitDrillingApplicantName").val();
            permitDrillingEmailAddress=$("#permitDrillingEmailAddress").val();
            if(permitDrillingApplicantName && permitDrillingEmailAddress){
                $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
            }
        }else{
            wellDrillingApplicantName = $("#wellDrillingApplicantName").val();
            if(wellDrillingApplicantName){
                $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
            }
        }

        typeOfApplication=$("#applicationTypeVal").val();
        if (typeOfApplication == "Application for a Licence to Abstract &amp; User Water"||typeOfApplication == "Application for a Licence to Abstract & User Water") {
			if (wraDocCount == 1) {
			    	gettingDocumentList();
		}
			wraDocCount++;
	}
    if (typeOfApplication == "Application for a Permit to Drill a Well") {
     if ($("#drillPermitTypeVal").val() == "Permit to Access a New Well") {
     	if (wraPermitDocCount == 1) {
				gettingDocumentList();
		}
        wraPermitDocCount++;
	}
    }

    if (typeOfApplication == "Application for a Well Drillers Licence") {
     if ($("#wraLicenceTransactionTypeVal").val() == "New Licence") {
     	if (wraLicenceDocCount == 1) {
				gettingDocumentList();
		}
        wraLicenceDocCount++;
	}
    }
}

    if(currentFieldSet == "wraFormsFieldset"){
    	var typeOfApplication=$("#applicationTypeVal").val();
    	var typeOfTransaction=$("#transactionTypeVal").val();
       
    	if(typeOfApplication=="Application for a Licence to Abstract &amp; User Water"||typeOfApplication =="Application for a Licence to Abstract & User Water"){
    		if(typeOfTransaction=="New Licence"){
    		 setLicenceToAbstractAndUseWater();
    		 addWaterIrrigationDetail();
    		}else if(typeOfTransaction=="Licence Renewal"){
    		 setRenewalLicenceAbstractAndUseWater();
    		}
    	}else if(typeOfApplication=="Application for a Permit to Drill a Well"){
    		setPermitDrillingFormData();
    	}else if(typeOfApplication=="Application for a Well Drillers Licence"){
    		setWellDrillingLicenceFormData();
    	}
    	
    	/* DOCUMENT VALIDATION */
    	var requiredDoc = $("div[id='requiredDoc']").length;
    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
    	if(requiredDoc >= 1){
    		$(".mandatory-doc-heading").removeClass("hide");
    		numberOfDocument = requiredDoc;
    		if(numberOfDocument != filledDocument){
        		$("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        	}
    	}
    	pendingWraApplication();
    }
    $(".water-resources-forms, .water-resources-renew-forms, .water-permit-drilling-forms, .water-well-drilling-forms").addClass('hide');
    $(".water-resources-forms-preview, .water-resources-renew-forms-preview, .water-permit-drilling-forms-preview, .water-well-drilling-forms-preview").addClass('hide');
    if(currentFieldSet == "wraTransactionFieldset"){
    	activeSelectForm();
    }
   var applicationType = $("#applicationTypeVal").val();
    
	if(applicationType == "Application for a Licence to Abstract &amp; User Water"||applicationType =="Application for a Licence to Abstract & User Water"){

		var transactionTypeVal = $("#transactionTypeVal").val();
		
			if(transactionTypeVal == "New Licence"){
				
				$(".water-resources-forms").removeClass('hide');
				$(".water-resources-forms-preview").removeClass('hide');
				$(".wraFacilitiesFee").html("15,000");
				
			}  
			else if(transactionTypeVal == "Licence Renewal"){

				$(".water-resources-renew-forms").removeClass('hide');
				$(".water-resources-renew-forms-preview").removeClass('hide');
				$(".wraFacilitiesFee").html("30,000");
		}
		$("#payment_category").html("Licence to Abstract & User Water");
	}
	
	if(applicationType == "Application for a Permit to Drill a Well"){
		$(".water-permit-drilling-forms").removeClass('hide');
		$(".water-permit-drilling-forms-preview").removeClass('hide');
		$(".wraFacilitiesFee").html("15,000");
		$("#payment_category").html("Permit to Drill a Well");
		/* var drillPermitTypeVal = $("#drillPermitTypeVal").val();
		var wraPermitTransactionTypeVal = $("#wraPermitTransactionTypeVal").val();
			
			if(wraPermitTransactionTypeVal == "New Permit"){
				
				$(".water-permit-drilling-forms").removeClass('hide');
				$(".water-permit-drilling-forms-preview").removeClass('hide');				
			}    
			else if(wraPermitTransactionTypeVal == "Renewal of Permit"){

				$(".water-permit-drilling-forms").removeClass('hide');
				$(".water-permit-drilling-forms-preview").removeClass('hide');
		} */			
	}
	
	if(applicationType == "Application for a Well Drillers Licence"){
		$(".water-well-drilling-forms").removeClass('hide');
		$(".water-well-drilling-forms-preview").removeClass('hide');
		$(".wraFacilitiesFee").html("15,000");
		$("#payment_category").html("Well Drillers Licence");
		/* var wraLicenceTransactionTypeVal = $("#wraLicenceTransactionTypeVal").val();
		
			if(wraLicenceTransactionTypeVal == "New Licence"){
				
				$(".water-well-drilling-forms").removeClass('hide');
				$(".water-well-drilling-forms-preview").removeClass('hide');
			}  
			else if(wraPermitTransactionTypeVal == "Licence Renewal"){

				$(".water-well-drilling-forms").removeClass('hide');
				$(".water-well-drilling-forms-preview").removeClass('hide');
		} */
	}		
			
			
    
    if(currentFieldSet == "wraSupportingDocumentFieldset"){
        /* showDocsPreview(docRenderCount);
        docRenderCount++; */
        uploadDocuments('wraGenericUpload','Generic Documents','');
        pendingWraApplication();
    }
    if(currentFieldSet == "wrafeePaymentFieldset"){
    	uploadDocuments('wraGenericUpload','Generic Documents','');
        showFinalSubmitButton();
        finalPreviewScroll();
        previewMethod();
        previewAbstractWaterUserDetailInfo();
        submitFeeDetailsInWRA();
        $(".fee-amount-preview").html($("#amountPaid").val());
        $(".fee-currency-preview").html($("#amountCurrency").val());
        pendingWraApplication();
        
        docRenderCount = 1;
    	showDocsPreview(docRenderCount);
		docRenderCount++;
		
    }
    
    // Form Categories
 $("#userWaterType").addClass("hide");
    applicationType = $("#applicationTypeVal").val();
    if(applicationType == "Application for a Licence to Abstract &amp; User Water"||applicationType =="Application for a Licence to Abstract & User Water"){
        $("#userWaterType").removeClass("hide");
    }
    applicationType = $("#drillPermitTypeVal").val();
    if(applicationType == "Application for a Permit to Drill a Well"){
        $("#drillPermitType").removeClass("hide");
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
        if(currentFieldSet == "wraApplicationTypeFieldset"){
            $(".form-wizard-previous-btn").addClass("hide");
            $(".form-wizard-save-btn").addClass("hide");
        }
        /* scrollToPageTop(); */
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
        if(currentFieldSet == "wrafeePaymentFieldset" || currentFieldSet == "wraFormPreviewFieldset"){
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
    	$(".water-resources-forms .tab-pane, .water-resources-renew-forms .tab-pane, .water-permit-drilling-forms .tab-pane, .water-well-drilling-forms .tab-pane").removeClass('active');
        $(".water-resources-forms .nav-link, .water-resources-renew-forms .nav-link, .water-permit-drilling-forms .nav-link, .water-well-drilling-forms .nav-link").removeClass("active");
        /* $(".water-resources-forms .nav-link, .water-resources-renew-forms .nav-link, .water-permit-drilling-forms .nav-link, .water-well-drilling-forms .nav-link").addClass("disabled"); */
        var applicationType = $("#applicationTypeVal").val();
        if(applicationType == "Application for a Licence to Abstract &amp; User Water" || applicationType == "Application for a Licence to Abstract & User Water"){
    		var transactionTypeVal = $("#transactionTypeVal").val();
    			if(transactionTypeVal == "New Licence"){
    				$(".water-resources-forms .tab-pane:first").addClass("active");
    				$(".water-resources-forms .nav-link:first").addClass("active");
    			    $(".water-resources-forms .nav-link:first").removeClass("disabled");
    			}  
    			else if(transactionTypeVal == "Licence Renewal"){
    				$(".water-resources-renew-forms .tab-pane:first").addClass("active");
    				$(".water-resources-renew-forms .nav-link:first").addClass("active");
    			    $(".water-resources-renew-forms .nav-link:first").removeClass("disabled");
    		}
    	}
        if(applicationType == "Application for a Permit to Drill a Well"){
        	$(".water-permit-drilling-forms .tab-pane:first").addClass("active");
			$(".water-permit-drilling-forms .nav-link:first").addClass("active");
		    $(".water-permit-drilling-forms .nav-link:first").removeClass("disabled");
    		/* var wraPermitTransactionTypeBox = $("#wraPermitTransactionTypeBox").val();
    			if(wraPermitTransactionTypeBox == "New Permit"){
    				
    			}  
    			else if(wraPermitTransactionTypeBox == "Renewal of Permit"){
    				$(".water-permit-drilling-forms .tab-pane:first").addClass("active");
    				$(".water-permit-drilling-forms .nav-link:first").addClass("active");
    			    $(".water-permit-drilling-forms .nav-link:first").removeClass("disabled");
    			
    		} */
    	}
        if(applicationType == "Application for a Well Drillers Licence"){
    		var wraLicenceTransactionTypeVal = $("#wraLicenceTransactionTypeVal").val();
    			if(wraLicenceTransactionTypeVal == "New Licence"){
    				$(".water-well-drilling-forms .tab-pane:first").addClass("active");
    				$(".water-well-drilling-forms .nav-link:first").addClass("active");
    			    $(".water-well-drilling-forms .nav-link:first").removeClass("disabled");
    			}  
    			else if(wraLicenceTransactionTypeVal == "Licence Renewal"){
    				$(".water-well-drilling-forms .tab-pane:first").addClass("active");
    				$(".water-well-drilling-forms .nav-link:first").addClass("active");
    			    $(".water-well-drilling-forms .nav-link:first").removeClass("disabled");
    		}
    	}

    }
    
    function openSaveToDraftPopup() {
    	 draftWraApplication();
        $(".savecountinuePopup").modal("show");
       applicationType = $("#applicationTypeVal").val();
       transactionType = $("#transactionTypeVal").val();
       wraLicenceTransactionTypeVal = $("#wraLicenceTransactionTypeVal").val();
        currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
   	    
   	currentFormToSaveResources = $(".water-resources-forms").find(".active span:nth-child(2)").text();
   	currentFormToSaveRenew = $(".water-resources-renew-forms").find(".active span:nth-child(2)").text();
   	currentFormToSavePermitDrilling = $(".water-permit-drilling-forms").find(".active span:nth-child(2)").text();
   	currentFormToSaveWellDrilling = $(".water-well-drilling-forms").find(".active span:nth-child(2)").text();
   	
   	if(currentFormToSaveResources=="Form A (Regulation 3(1))"){
   		setLicenceToAbstractAndUseWater(true);
		addWaterIrrigationDetail();
		uploadDocuments('applicantSignatureAbstractBtn',"Abstract Signature Applicant");
   	}else if(currentFormToSaveRenew=="Licence Details"){
   		setRenewalLicenceAbstractAndUseWater(true); 
   		uploadDocuments('applicantSignatureRenewBtn',"Abstract Renew Signature Applicant");
	}
   	if(currentFormToSavePermitDrilling=="Form C (Regulation 18(1))"){
   		setPermitDrillingFormData(true);
			uploadDocuments('applicantSignaturePermitBtn',"Permit Signature Applicant");
   	}
   	if(currentFormToSaveWellDrilling=="Form E(Regulation 19(1))"){
   		setWellDrillingLicenceFormData(true);
		   uploadDocuments('applicantSignatureWellDrillingBtn',"Well Drilling Signature Applicant");
   	}
   	
   	if(currentStage=="SUPPORTING DOCUMENTS"){
   	 uploadDocuments('wraGenericUpload','Generic Documents','');
   	}
   	if(currentStage=="APPLICATION FEES PAYMENT"){
   	 submitFeeDetailsInWRA();
   	}
       
    }
    function openSaveToSubmitPopup() {
        $(".final-submit-container").removeClass("hide");
        submitWraApplication();
    }
    /* NEXT FORM JS */
    function applicantInfo(){
        nextForm();
    }
    function nextForm(){
        var $active = $('.nav-tabs li>.active');
        $active.parent().next().find('.nav-link').removeClass('disabled');
        $active.parent().next().find('.nav-link span').removeClass('gray');
        nextTab($active);
        const formSections = document.getElementsByClassName('form-wizard');
        for (const formSection of formSections) {
            formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
            }
    }
    function nextTab(elem) {
        $(elem).parent().next()
                .find('a[data-toggle="tab"]').click();
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
   
  	$("#wra-payment-upload" ).change(function() {
  		selectedfiles = this.files[0].name;
  		$(".attach-detailed-overview").html(selectedfiles);
  		$(".fee-msg").removeClass("hide");
  	});
  	
  	$("#payment-method-wrapper a").click(function(){
  	    oldPaymentProof = $("#paymentMethod").val();
  	    selectedPaymentProof = $(this).find(".wizard-title").html();
  	    $(".fee-method-preview").html(selectedPaymentProof);
  	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
  	    if(selectedPaymentProof != oldPaymentProof){
  	        $(".fee-payment-wrapper #wra-payment-file-chosen").empty();
  	        $("#amountPaid, #amountCurrency").val("");
  	        $(".fee-payment-wrapper #wra-payment-upload").val('');
  	    }
  	});

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
   
    
    $("#abstractApplicantName").on('input', function(){
        $(".applicantName").html($(this).val());
    });
    $("#permitDrillingApplicantName").on('input', function(){
        $(".permitApplicantName").html($(this).val());
    });
    $("#wellDrillingApplicantName").on('input', function(){
        $(".wellApplicantName").html($(this).val());
    });
    $("#renewName").on('input', function(){
        $(".renewApplicantName").html($(this).val());
    });
    $('input[type=radio][name=attachedDevice]').change(function() {
        if (this.value == 'Yes') {
            $(".measuring-device, .measuringDevicePreview").removeClass("hide");
        }
        else{
        	$(".measuring-device, .measuringDevicePreview").addClass("hide");
        }
    });
    
    $('input[type=radio][name=selfEmployed]').change(function() {
        if (this.value == 'No') {
            $(".notSelfEmployed, .notSelfEmployedPreview").removeClass("hide");
        }
        else{
        	$(".notSelfEmployed, .notSelfEmployedPreview").addClass("hide");
        }
    });
    
    $(document).ready(function () {
    	$('input[name="abstractRecordingType"], input[name="abstractWaterSource"], input[name="abstractWaterPurpose"]').tagsinput({
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
     
    /* Abstract sign */
    $(document).on('change', '#applicantSignatureAbstractBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#applicantSignatureAbstractImgHolder");
    var form1a_image_holder = $("#waterUserApplicantSignPre");
    image_holder.empty();
    form1a_image_holder.empty();  
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg" || extn == "webp") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              })
              .appendTo(form1a_image_holder); 
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
/* Renew Signature */
 	$(document).on('change', '#applicantSignatureRenewBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#applicantSignatureRenewImgHolder");
    var form1a_image_holder = $("#applicantSignatureRenewImgHolderPreview");
    image_holder.empty();
   form1a_image_holder.empty();
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg" || extn == "webp") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              })
              .appendTo(form1a_image_holder); 
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
 /*  Permit-Drilling Sign */
 	$(document).on('change', '#applicantSignaturePermitBtn', function() {   
        //Get count of selected files
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#applicantSignaturePermitImgHolder");
        var form1a_image_holder = $("#applicantSignaturePermitImgHolderPreview");
        image_holder.empty();
       form1a_image_holder.empty(); 
        if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg" || extn == "webp") {
          if (typeof(FileReader) != "undefined") {
            //loop for each file selected for uploaded.
            for (var i = 0; i < countFiles; i++) 
            {
              var reader = new FileReader();
              reader.onload = function(e) {
                $("<img />", {
                  "src": e.target.result,
                  "class": "thumb-image",
                  "height":"100",
                  "width":"100"
                }).appendTo(image_holder);
                $("<img />", {
                    "src": e.target.result,
                    "class": "thumb-image",
                    "height":"100",
                    "width":"100"
                  })
                 .appendTo(form1a_image_holder); 
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
    /*  Well-Drilling Licence Sign */
    $(document).on('change', '#applicantSignatureWellDrillingBtn', function() {
        //Get count of selected files
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#applicantSignatureWellDrillingImgHolder");
       var form1a_image_holder = $("#applicantSignatureWellDrillingImgHolderPreview");
        image_holder.empty();
       form1a_image_holder.empty(); 
        if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg" || extn == "webp") {
          if (typeof(FileReader) != "undefined") {
            //loop for each file selected for uploaded.
            for (var i = 0; i < countFiles; i++) 
            {
              var reader = new FileReader();
              reader.onload = function(e) {
                $("<img />", {
                  "src": e.target.result,
                  "class": "thumb-image",
                  "height":"100",
                  "width":"100"
                }).appendTo(image_holder);
                $("<img />", {
                    "src": e.target.result,
                    "class": "thumb-image",
                    "height":"100",
                    "width":"100"
                  })
                  .appendTo(form1a_image_holder); 
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
    
    
   /*  $('#renew-abstract-lic').on('click', function() {
    	typeOfApplication=$("#applicationTypeVal").val();
    	if(typeOfApplication=="Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
    		$('#wra-renew-btn').prop('disabled', true);
		}
    });
    
    $('#wraRenewBtn').on('click', function() {
	    $('#wra-renew-btn').prop('disabled', false);
    }); */
    function renewLicense() {
			$("#wra-renew-btn").attr("disabled", "disabled");
	        $("#registrationNumberValidation").addClass("hide");
	        licenseNumber = $("#registrationNumber").val();
	        typeOfApplication=$("#applicationTypeVal").val();
	
	    	 $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber":licenseNumber,
							"<portlet:namespace/>typeOfApplication":typeOfApplication,
	                       
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                        if (validation == 0) {
	                                $("#registrationNumberValidation").removeClass("hide");
	                                $("#wra-renew-btn").removeAttr("disabled"); 
									$("#registrationNumber").focus();
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		} 
    function renewPermit() {
			$("#wra-renew-btn").attr("disabled", "disabled");
	        $("#permitNumberValidation").addClass("hide");
	        licenseNumber = $("#permitNumber").val();
	        typeOfApplication=$("#applicationTypeVal").val();
	       
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber":licenseNumber,
							"<portlet:namespace/>typeOfApplication":typeOfApplication,
	                       
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                        if (validation == 0) {
	                                $("#permitNumberValidation").removeClass("hide");
	                                $("#wra-renew-btn").removeAttr("disabled"); 
									$("#permitNumber").focus();
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		} 
    function submitFeeDetailsInWRA(){
		    wraApplicationId=$("#wraApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paidAmount").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${wraFeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>wraApplicationId": wraApplicationId,
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
				     var fileID = 'wra-payment-upload';
			   		$.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${wraFeeDetailsUrl}",
			   		    fileElementId: 'wra-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		   	  "<portlet:namespace/>wraApplicationId": wraApplicationId,
			   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			   			  "<portlet:namespace/>paymentFee": paymentFee,
			   		      "<portlet:namespace/>amountPaid": amountPaid,
		  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
			   		    },
			   		    success: function (data) { 
			   		  		// Parse the JSON data
			   		  		downloadPDF();
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
  /*  PREVIEW FUNCTIONALITIES */
 	$(".preview-edit-button").click(function(){
		$('#wraFormPreviewFieldset').removeClass("show");
		$('#wraFormsFieldset').addClass("show", "400");
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
		$('#wraFormPreviewFieldset').removeClass("show");
		$('#wraSupportingDocumentFieldset').addClass("show", "400");
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
		$('#wraFormPreviewFieldset').removeClass("show");
		$('#wrafeePaymentFieldset').addClass("show", "400");
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
	
    function downloadPDF() {
		wraApplicationId=$("#wraApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${wraDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>wraApplicationId": wraApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if(result && result["fileUrl"]) {
                        $("#wraDownloadPDF").attr("href", result["fileUrl"]);
                        $("#wraDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
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
	        $('#wraGenericUpload')[0].files = newFileList.files;
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

	    $(document).on('change', '#wraGenericUpload', function () {
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
	            var wraApplicationId = "<%=wraApplicationId%>";
	        	if(wraApplicationId > 0 ){
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
	            $("#wraFormPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#wraFormPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
 

    function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	} 
</script>