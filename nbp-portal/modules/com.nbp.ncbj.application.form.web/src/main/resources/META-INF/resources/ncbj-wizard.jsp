<portlet:resourceURL var="pendingNCBJApplicationUrl" id="/pending/ncbj/application"></portlet:resourceURL>
<portlet:resourceURL var="submitNCBJApplicationUrl" id="/submit/ncbj/application"></portlet:resourceURL>
<portlet:resourceURL var="genericUploadInNCBJFormUrl" id="/generic/upload/in/ncbj"></portlet:resourceURL>
<portlet:resourceURL var="draftNCBJApplicationUrl" id="/draft/upload/in/ncbj"></portlet:resourceURL>
<portlet:resourceURL var ="ncbjFeeDetailsUrl" id="/fee/ncbj/payment/url"></portlet:resourceURL>
<portlet:resourceURL var="ncbjDownloadPdfUrl" id="/ncbj/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license"></portlet:resourceURL>
<portlet:resourceURL var="deletedocumentUrl" id="/delete/document/Url"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for a </p>
							<p class="common-banner-title f1 mb-0">NCBJ Certification </p>
							<p class="common-banner-info f2 mb-3">Secure a certification that will enable you to demonstrate that your products, processes, systems or services are compliant with national and international regulations/standards.</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support"
								class="common-banner-transparent-link f2 d-inline-block">
								<liferay-ui:message key="application-form-help" /> 
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
					<form action="" method="post" role="form" enctype="multipart/form-data">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active farm">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
								</li>
								<li class="farm">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">TYPE OF TRANSACTION</p> <span></span>
								</li>
								<li class="farm form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="farm rm">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING DOCUMENTS</p> <span></span>
									</li>
							    <li style="display:none" class="last-step">
			                       <span></span>
			                    </li>
							</ul>
									<input type="hidden" id="ncbjApplicationId" name="ncbjApplicationId"> 
									<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=ncbjApplicationId%>">
						</div>
						<%@ include file="/ncbj-categories/category-type.jsp"%>
						<%@ include file="/Type-of-transaction/type-of-transaction.jsp"%>
						<%@ include file="/ncbj-forms/ncbj-tabs-form.jsp"%>
						<%@ include file="/supporting-documents/ncbj-supporting-document.jsp" %>
						<%@ include file="/preview/ncbj-final-preview-tabs.jsp"%>
						<%@ include file="/ncbj-final-submission.jsp" %>

					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
function renewLicense() {
	$("#ncbj-renew-btn").attr("disabled", "disabled");
    $("#renewLicenseNumbervalidation").addClass("hide");
    licenseNumber = $("#renew-licence-number").val(); 
    typeOfCertification = $("#ncbjCategoriesValue").val();
	typeOfTransaction = $("#ncbjTransactionTypeValue").val();
	typeOfService = $("#ncbjCertifiedClientServiceVal").val();
	numberOfSite = $("#siteNumberSectionValue").val();
    $.ajax({
            type: "POST",
            url: '${renewLicenseUrl}',
            data: {
                    "<portlet:namespace/>licenseNumber":licenseNumber,
                    "<portlet:namespace/>typeOfCertification":typeOfCertification,
                    "<portlet:namespace/>typeOfTransaction":typeOfTransaction,
                    "<portlet:namespace/>typeOfService":typeOfService,
                    "<portlet:namespace/>numberOfSite":numberOfSite,
            },
            success: function(data) {
            	var result = data.APP_DATA;
            	var renewLicenseUrl=result["renewLicenseUrl"];
            	var validation=result["licenseNumberCheck"];
                    if (validation == 0) {
                            $("#renewLicenseNumbervalidation").removeClass("hide");
                            $("#ncbj-renew-btn").removeAttr("disabled"); 
							$("#renew-licence-number").focus();
                    }else{
                    	window.location.href = renewLicenseUrl;
                    }},
            error: function(data) {}
    });} 
function transferLicense() {
	$("#ncbj-transfer-btn").attr("disabled", "disabled");
    $("#renewLicenseNumbervalidation").addClass("hide");
    licenseNumber = $("#transfer-licence-number").val(); 
    typeOfCertification = $("#ncbjCategoriesValue").val();
	typeOfTransaction = $("#ncbjTransactionTypeValue").val();
	typeOfService = $("#ncbjCertifiedClientServiceVal").val();
	numberOfSite = $("#siteNumberSectionValue").val();
	iso9001CertificationValue = $("#iso9001CertificationValue").val();
	transferReason=$("#transferReason").val();
    $.ajax({
            type: "POST",
            url: '${renewLicenseUrl}',
            data: {
                    "<portlet:namespace/>licenseNumber":licenseNumber,
                    "<portlet:namespace/>typeOfCertification":typeOfCertification,
                    "<portlet:namespace/>typeOfTransaction":typeOfTransaction,
                    "<portlet:namespace/>typeOfService":typeOfService,
                    "<portlet:namespace/>numberOfSite":numberOfSite,
                    "<portlet:namespace/>iso9001CertificationValue":iso9001CertificationValue,           
                    "<portlet:namespace/>transferReason":transferReason,           
            },
            success: function(data) {
            	var result = data.APP_DATA;
            	var renewLicenseUrl=result["renewLicenseUrl"];
            	var validation=result["licenseNumberCheck"];
                    if (validation == 0) {
                            $("#renewLicenseNumbervalidation").removeClass("hide");
                            $("#ncbj-transfer-btn").removeAttr("disabled"); 
							$("#renew-licence-number").focus();
                    }else{
                    	window.location.href = renewLicenseUrl;
                    }},
            error: function(data) {}
    });} 
$("#NcbjCategories .wizard-card").click(function(){
	$("#NcbjCategories .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#ncbjCategoriesValue").val($(this).find(".wizard-title").html());
	ncbjCategories = $("#ncbjCategoriesValue").val();
	$("#ncbjTransactionTypeBox .wizard-card").removeClass("active");
	$("#siteNumberSection .wizard-card").removeClass("active");
	$("#ncbjTransactionTypeBox").removeClass("hide");
	$("#iso9001Certification, #siteNumberSection, #22000CertificateType, #iso22000Certification, #ncbjRenewSection, #ncbjCertifiedClientServiceBox, #ncbjServiceSurveillanceBox, #iso9001CertificationTransField").addClass("hide");
	$("#ncbjTransactionType #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	if(ncbjCategories == "ISO 9001-2015 Certification"){
		$("#ncbjRenewSection").addClass("hide");
		$("#iso9001Certification").addClass("hide");
		$("#siteNumberSection").addClass("hide");
		$(".iso9001CertificationForm").removeClass("hide");
		$(".newForm22000").addClass("hide");
	}
	if(ncbjCategories == "ISO 22000-2018 Certification"){
		$(".newForm22000").removeClass("hide");
		$(".iso9001CertificationForm").addClass("hide");
	}});
$("#ncbjTransactionTypeBox .wizard-card").click(function(){
	$("#ncbjTransactionTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#ncbjTransactionTypeValue").val($(this).find(".wizard-title").html());
	$("#iso9001Certification .wizard-card").removeClass("active");
	$("#iso9001CertificationTransField").addClass("hide");
	$("#iso22000Certification, #ncbjServiceSurveillanceBox").addClass("hide");
	ncbjTransactionType = $("#ncbjTransactionTypeValue").val();
	ncbjCategories = $("#ncbjCategoriesValue").val();
	if(ncbjTransactionType == "NCBJ Certified Clients"){
		$("#ncbjTransactionType #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		$("#ncbjRenewSection").removeClass("hide");
		$("#iso9001Certification").addClass("hide");
		$("#siteNumberSection").addClass("hide");
		if(ncbjCategories == "ISO 9001-2015 Certification"){
			$("#ncbjCertifiedClientServiceBox .wizard-card").removeClass("active");
			$("#ncbjRenewSection").addClass("hide");
			$("#ncbjCertifiedClientServiceBox").removeClass("hide");
		}}else{
		if(ncbjCategories == "ISO 9001-2015 Certification"){
			$("#iso9001Certification").removeClass("hide");
			$("#siteNumberSection").addClass("hide");
			$("#iso9001Certification .wizard-card").removeClass("active");
		}else if(ncbjCategories == "ISO 22000-2018 Certification"){
			$("#iso9001Certification").addClass("hide");
			$("#22000CertificateType").removeClass("hide");
			$("#siteNumberSection .wizard-card").removeClass("active");
			$("#siteNumberSection").removeClass("hide");
		}
		$("#ncbjRenewSection, #ncbjCertifiedClientServiceBox").addClass("hide");
	}});
$("#ncbjCertifiedClientServiceBox .wizard-card").click(function(){
	$("#ncbjCertifiedClientServiceBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#ncbjCertifiedClientServiceVal").val($(this).find(".wizard-title").html());
	ncbjCertifiedClientService = $("#ncbjCertifiedClientServiceVal").val();
	$("#ncbjServiceSurveillanceBox, #ncbjRenewSection").addClass("hide");
	$("#ncbjServiceSurveillanceBox .wizard-card").removeClass("active");
	var ncbjCertifiedClientServiceVal = $("#ncbjCertifiedClientServiceVal").val();
	if(ncbjCertifiedClientService == "Surveillance"){
		$("#ncbjServiceSurveillanceBox").removeClass("hide");
	}
	if(ncbjCertifiedClientService == "Recertification"){
		$("#ncbjRenewSection").removeClass("hide");
	}});
$("#ncbjServiceSurveillanceBox .wizard-card").click(function(){
	$("#ncbjServiceSurveillanceBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#ncbjServiceSurveillanceVal").val($(this).find(".wizard-title").html());
	$("#ncbjTransactionType #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
});
$("#22000CertificateType .wizard-card").click(function(){
	$("#22000CertificateType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#siteNumberSection .wizard-card").removeClass("active");
	$("#iso22000Certification").addClass("hide");
	$("#iso22000CertificateTypeValue").val($(this).find(".wizard-title").html());
	iso22000CertificateType = $("#iso22000CertificateTypeValue").val();
	$("#ncbjTransactionType #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	if(iso22000CertificateType == "Transfer to NCBJ"){
		$("#22000CertificateTypeTransField").removeClass("hide");
		$("#siteNumberSection").addClass("hide");
	}else{
		$("#22000CertificateTypeTransField").addClass("hide");
		$("#siteNumberSection").removeClass("hide");
	}
	if(iso22000CertificateType == "New Certificate"){
		$(".newForm22000").removeClass("hide");
		$(".quotationForm22000").addClass("hide");
	}
	if(iso22000CertificateType == "Request for Quotation"){
		$(".newForm22000").addClass("hide");
		$(".quotationForm22000").removeClass("hide");
	}
});
$("#iso9001Certification .wizard-card").click(function(){
	$("#iso9001Certification .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#iso9001CertificationValue").val($(this).find(".wizard-title").html());
	$("#siteNumberSection .wizard-card").removeClass("active");
	iso9001Certification = $("#iso9001CertificationValue").val();
	$("#ncbjTransactionType #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
	if(iso9001Certification == "Transfer to NCBJ"){
		$("#iso9001CertificationTransField").removeClass("hide");
		$("#siteNumberSection").removeClass("hide");
		$("#transfer9001").prop("checked",true);
		$("#new9001").prop("checked",false);
		$(".newForm9001, .transfer9001Reason").removeClass("hide");
		$(".quotationForm9001").addClass("hide");
		$(".quotation-form-tab").html("4");
	}else{
		$("#iso9001CertificationTransField").addClass("hide");
		$("#siteNumberSection").removeClass("hide");
	}
	if(iso9001Certification == "ISO 9001"){
		$(".quotationForm9001, .transfer9001Reason").addClass("hide");
		$("#new9001").prop("checked",true);
		$("#transfer9001").prop("checked",false)
		$(".quotation-form-tab").html("4");;
	}
});
$("#transferReason").on('input', function(){
   $("#transferReasonTwo").val($(this).val()); 
});
$("#siteNumberSection .wizard-card").click(function(){
	$("#siteNumberSection .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#siteNumberSectionValue").val($(this).find(".wizard-title").html());
	siteNumberSection = $("#siteNumberSectionValue").val();
	ncbjCategories = $("#ncbjCategoriesValue").val();
	if(ncbjCategories == "ISO 22000-2018 Certification"){
		$("#iso22000Certification").removeClass("hide");
		$("#iso22000Certification .wizard-card").removeClass("active");
		$("#ncbjTransactionType #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
		if(siteNumberSection == "Single Site/Location"){
			$(".additional-tab-form-two").addClass("hide");
			$(".additional-tab-form-single-site").removeClass("hide");
		}else{
			$(".additional-tab-form-two").removeClass("hide");
			$(".additional-tab-form-single-site").addClass("hide");
		}
	}else{
		$("#iso22000Certification").addClass("hide");
		$("#ncbjTransactionType #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		if(siteNumberSection == "Single Site/Location"){
			$(".additional-location").addClass("hide");
			$(".section-two-signature").removeClass("hide");
			$(".additional-location-tab").html("Signature");
		}else{
			$(".additional-location").removeClass("hide");
			$(".section-two-signature").addClass("hide");
			$(".additional-location-tab").html("Section II");
		}}
});
$("#iso22000Certification .wizard-card").click(function(){
	$(this).toggleClass("active");
	selectedIso22000CertificationType = [];
	$("#iso22000Certification").find(".wizard-card.active .wizard-title").each(function() {
		selectedIso22000CertificationType.push($(this).html());
	});
	if(selectedIso22000CertificationType.includes("CII - Perishable Animal Products E.g Production of Animal Products including Fish, Seafood, Meat, Eggs, Dairy, Fish Products ")){
		$("#iso22000Cate1").prop("checked",true);
	}
	if(selectedIso22000CertificationType.includes("CII - Perishable Plant Produce E,g. Fruits, Fresh Juices, Vegetables, Grains, Nuts and Pulses ")){
		$("#iso22000Cate2").prop("checked",true);
	}
	if(selectedIso22000CertificationType.includes("CIII - Perishable Animal &amp; Plant Products (Mixed Products) E,g. Pizza, Patty, Sandwich, Ready-to-eat Meals ")){
		$("#iso22000Cate3").prop("checked",true);
	}
	if(selectedIso22000CertificationType.includes("CIII - Ambient Stable Products E,g. Pizza, Patty, Sandwich, Ready-to-eat Meals Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt. ")){
		$("#iso22000Cate4").prop("checked",true);
	}
	$("#ncbjTransactionType #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
});
var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    scrollToPageTop();
    if(currentFieldSet == "ncbjSupportingDocumentFieldset"){
    	downloadPDF();
    	ncbjGenericDocuments('Generic Documents');
    	showFinalSubmitButton();
    	/ Call preview functions /
    	previewApplicantDetailsInfo();
    	previewOrganizationDetailsInfo();
    	previewCompanyDetailsInfo();
    	previewProductAndServices();
    	previewSectionFour();
    	previewMethod();
		pendingNCBJ();
    }
     if(currentFieldSet == "ncbjTransactionType"){
    	pendingNCBJ();
    	activeSelectForm();
		ncbjCategories = $("#ncbjCategoriesValue").val();
		$("#ncbjFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		if(ncbjCategories == "ISO 9001-2015 Certification"){
			nameOfOrganization=$("#nameOfOrganization").val();
			emailAddress=$("#emailAddress").val();
			
			if(nameOfOrganization && emailAddress) {
				$("#ncbjFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			} else {
				$("#ncbjFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			}
		}
		if(ncbjCategories == "ISO 22000-2018 Certification"){
			nameOfOrganizationFo = $("#nameOfOrganizationFo").val();
			emailAddressFo = $("#emailAddressFo").val();
			if(nameOfOrganizationFo && emailAddressFo) {
				$("#ncbjFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			} else {
				$("#ncbjFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			}
		}
		ncbjTransactionType = $("#ncbjTransactionTypeValue").val();
		$(".applicant-details, .quotation-details, .surveillance-details").addClass("hide");
		if(ncbjTransactionType == "New Client"){
			$(".applicant-details, .quotation-details").removeClass("hide");
		}
		if(ncbjTransactionType == "NCBJ Certified Clients"){
			ncbjCertifiedClientService = $("#ncbjCertifiedClientServiceVal").val();
			if(ncbjCertifiedClientService == "Surveillance"){
				$(".surveillance-details").removeClass("hide");
				$(".quotation-details").addClass("hide");
				$("#ncbjFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
				$("#supportingDocStep").html("1");
			}
			if(ncbjCertifiedClientService == "Recertification"){
				$(".quotation-details").removeClass("hide");
				$(".quotation-form-tab").html("1");
			}
		}
		var iso9001CertificationValue = $("#iso9001CertificationValue").val();
		$("input[name='desiredCertification']").each(function(){    
		    if($(this).val() == iso9001CertificationValue){
		        $(this).prop("checked",true);
		        $(this).attr("disabled",false);
		    }else{
		        $(this).prop("checked",false);
		        $(this).attr("disabled",true);
		    }
		});
		if(iso9001CertificationValue == "Transfer to NCBJ"){
	        $("#transfer9001Reason, .transfer9001ReasonPreview").removeClass("hide");
	    }else{
	    	$("#transfer9001Reason, .transfer9001ReasonPreview").addClass("hide");
	    }
	}
    if(currentFieldSet == "ncbjSupportingDocumentFieldset"){
    	finalPreviewScroll();
		pendingNCBJ();
    }
   if(currentFieldSet == "ncbjFormsFieldset"){
	   ncbjCategories = $("#ncbjCategoriesValue").val();
	   if(ncbjCategories == "ISO 9001-2015 Certification"){
    	    addQuotationFormTwoInfo(); 
		    pendingNCBJ();   	
	    	addOrganizationInfo();
	    	addApplicantDetail();
	   }
	   if(ncbjCategories == "ISO 22000-2018 Certification"){
    		addQuotationFormTwoInfo();  
    		addLicenceListDetail();
    		addHazardAnalysisDetail();
    		addHaccpNumberDetail();
    		addWorkPatternDetail();
    		addEmployeesNumberDetail();
    		addProductServicesDetail();
    		addSectionOneCompanyDetail();
	   }
	   siteNumberSectionVal = $("#siteNumberSectionValue").val();
	   if(siteNumberSectionVal == "Multiple Sites more than one Location"){
		   addCompanyDetail();
	   }else{}
	   }
   if(currentFieldSet == "ncbjFeePaymentFieldset"){
	   submitFeeDetailsInNcbj();
	   pendingNCBJ();
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
	function previewMethod() {
	    $("input, textarea, select").each(function() {
	        $(this).each(function() {
	            if($(this).val() != "") {
	                let preId = $(this).prop('id') + "Preview";
	                $("#" + preId).html($(this).val());
	            }
	        });
	    });
	    $("input[type='radio']").each(function() {
	        $(this).each(function() {
	            if($(this).is(":checked")) {
	                let preId = $(this).prop('name') + "Preview";
	                $("#" + preId).html($(this).val());
	            }
	        });
	    });
	    $("input[type='checkbox']").each(function() {
	        $(this).each(function() {
	            let checkedValues = ""; // Initialize an empty string to store checked values
	            let checkboxName = $(this).prop('name'); // Get the name of the changed checkbox
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
});
	function applicantInfo(){
		nextForm();
		pendingNCBJ();
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
  $('input[type=radio][name=orgDeterminedTheScope]').change(function() {
        if (this.value == 'Yes') {
        	$(".pleaseStateTheScope").removeClass("hide");
        }
        else{
        	$(".pleaseStateTheScope").addClass("hide");
        }
    }); 
  $('input[type=radio][name=orgDeterminedTheScopeFo]').change(function() {
      if (this.value == 'Yes') {
      	$(".pleaseStateTheScopeFo").removeClass("hide");
      }
      else{
      	$(".pleaseStateTheScopeFo").addClass("hide");
      }
  }); 
  $('input[type=radio][name=companyUsedFour]').change(function() {
      if (this.value == 'Yes') {
      	$("#cosultantEmail").removeClass("hide");
      	$("#condultingFirmTelephone").removeClass("hide");
      }
      else{
      	$("#cosultantEmail").addClass("hide");
      	$("#condultingFirmTelephone").addClass("hide");
      }
  }); 
  function pendingNCBJ(){
	    typeOfCertification = $("#ncbjCategoriesValue").val();
		typeOfTransaction = $("#ncbjTransactionTypeValue").val();
		iso9001CertificationValue = $("#iso9001CertificationValue").val();
		numberOfSite = $("#siteNumberSectionValue").val();
		if(typeOfCertification=="ISO 22000-2018 Certification"){
			selectedSecondCategory = [];
			$("#iso22000Certification").find(".wizard-card.active .wizard-title").each(function() {
				selectedSecondCategory.push($(this).html());
			});
			iso22000CertificationValue = selectedSecondCategory.join(";");
		}else{
			iso22000CertificationValue = $("#iso22000Certification").val();
		}
		ncbjCertifiedClientServiceVal =$("#ncbjCertifiedClientServiceVal").val();
		ncbjServiceSurveillanceVal=$("#ncbjServiceSurveillanceVal").val();
		ncbjApplicationId = $("#ncbjApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id"); 
		$.ajax({
			type : "POST",
			url : "${pendingNCBJApplicationUrl}",
			data : {
				"<portlet:namespace/>typeOfCertification" : typeOfCertification,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>iso9001CertificationValue" : iso9001CertificationValue,
				"<portlet:namespace/>numberOfSite" : numberOfSite,
				"<portlet:namespace/>iso22000CertificationValue" : iso22000CertificationValue,
				"<portlet:namespace/>ncbjCertifiedClientServiceVal" : ncbjCertifiedClientServiceVal,
				"<portlet:namespace/>ncbjServiceSurveillanceVal" : ncbjServiceSurveillanceVal,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				"<portlet:namespace/>currentStage" : currentStage,
				"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
			},
			success : function(data) {
				var result = data.APP_DATA;
				$("#pop_app_no").html(result["applicationNumber"]);
		        $("#pop_status").html(result["appStatus"]);
		        $("#pop_category").html(result["category"]);
		        $("#draft-category").html(result["category"]);
				$("#ncbjApplicationId").val(result["ncbjApplicationId"]);
			},
			error : function(data) {

			}
		});}
  function openNcbjSaveToSubmitPopup(){
		submitNCBJ();
		$(".final-submit-container").removeClass("hide");
	}
	  function showFinalSubmitButton(){
	    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	    	if(currentFieldSet == "ncbjFormsFieldset" || currentFieldSet == "ncbjSupportingDocumentFieldset"){
	            	$(".form-wizard-next-btn ").hide();
	            	$(".form-wizard-save-btn").hide();
	            	$(".final-submit").removeClass("hide");
	            }else{
	            	$(".form-wizard-next-btn").show();
	            	$(".form-wizard-save-btn").show();
	            	$(".final-submit").addClass("hide");
	            }
	    }
	function submitNCBJ(){
	    typeOfCertification = $("#ncbjCategoriesValue").val();
		typeOfTransaction = $("#ncbjTransactionTypeValue").val();
		iso9001CertificationValue = $("#iso9001CertificationValue").val();
		numberOfSite = $("#siteNumberSectionValue").val();
		if(typeOfCertification=="ISO 22000-2018 Certification"){
			selectedSecondCategory = [];
			$("#iso22000Certification").find(".wizard-card.active .wizard-title").each(function() {
				selectedSecondCategory.push($(this).html());
			});
			iso22000CertificationValue = selectedSecondCategory.join(";");
		}else{
			iso22000CertificationValue = $("#iso22000Certification").val();
		}
		ncbjServiceSurveillanceVal =$("#ncbjServiceSurveillanceVal").val();
		ncbjCertifiedClientServiceVal =$("#ncbjCertifiedClientServiceVal").val();
		ncbjServiceSurveillanceVal=$("#ncbjServiceSurveillanceVal").val();
		ncbjApplicationId = $("#ncbjApplicationId").val();
		   $.ajax({
			    type: "POST",
			    url: "${submitNCBJApplicationUrl}",
			    data: {
			      "<portlet:namespace/>typeOfCertification": typeOfCertification,
				  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			      "<portlet:namespace/>iso9001CertificationValue": iso9001CertificationValue,
			      "<portlet:namespace/>numberOfSite": numberOfSite,
			      "<portlet:namespace/>iso22000CertificationValue": iso22000CertificationValue,
			      "<portlet:namespace/>ncbjCertifiedClientServiceVal" : ncbjCertifiedClientServiceVal,
			      "<portlet:namespace/>ncbjServiceSurveillanceVal" : ncbjServiceSurveillanceVal,
			      "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
			    },
			    success: function (data) {
			    var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			    	 if(appStatus=="submitted"){
			    		 $("#continueDashboardNCBJ").removeClass("hide");
					   		$("#submitted-content").removeClass("hide");
					   		$("#application_submitted-img").removeClass("hide");
					   	 $(".custom_loader").addClass("hide");
					   	}else{
					   		$("#submitted-content").addClass("hide");
					   		$("#draft-content").removeClass("hide");
					   		$("#application_draft-img").removeClass("hide");
					   	 $(".custom_loader").addClass("hide");
					   	}
			    	 
			    	  if (result != null) {
					      $("#ncbjApplicationId").val(result["NCBJApplicationId"]);
					      $("#submit_pop_app_no").html(result["NCBJAppNum"]);
					      $("#submit_pop_category").html(result["category"]);
					      $("#submit_pop_status").html(result["appStatus"]);
				    	  $(".final-submit-content").css({"opacity":"1"}); 
						 }
					 if((typeOfCertification=="ISO 9001-2015 Certification")&&(typeOfTransaction ="New Client")){
						 $("#submitted-status").html("ISO 9001-2015 Certification (New Client)");
					 }  if((typeOfCertification=="ISO 9001-2015 Certification")&&(ncbjCertifiedClientServiceVal=="Surveillance")&&(typeOfTransaction ="NCBJ Certified Clients")){
						$("#submitted-status").html("ISO 9001-2015 Certification (NCBJ Certified Client)"+" "+ncbjServiceSurveillanceVal);
					} if((typeOfCertification=="ISO 9001-2015 Certification")&&(ncbjCertifiedClientServiceVal=="Recertification")){
						$("#submitted-status").html("ISO 9001-2015 Certification (NCBJ Certified Client- Recertification)");
					}
					 if((typeOfCertification=="ISO 22000-2018 Certification")&&(typeOfTransaction=="New Client")){
						 $("#submitted-status").html("ISO 22000-2018 Certification (New Client)");
					 }if((typeOfCertification=="ISO 22000-2018 Certification"
					)&&(typeOfTransaction=="NCBJ Certified Clients")){
						 $("#submitted-status").html("ISO 22000-2018 Certification (NCBJ Certified Client)");
					 }
	    	    },
			    error: function (data) {},
			  });}
	     $(document).ready(function () {
	    	    var selectedFiles = [];
	    	    var selectedGenericFiles = [];
	    	    function updateFileInput() {
	    	        var newFileList = new DataTransfer();
	    	        for (var i = 0; i < selectedFiles.length; i++) {
	    	            newFileList.items.add(selectedFiles[i]);
	    	        }
	    	        $('#ncbjGenericUpload')[0].files = newFileList.files;
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
	    	    $(document).on('change', '#ncbjGenericUpload', function () {
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
	    	            var ncbjApplicationId = "<%=ncbjApplicationId%>";
	    	        	if(ncbjApplicationId > 0 ){
	    	        		if (!fileExists && !genericFileExists) {
	    	                    newFiles.push(files[i]);
	    	                }
	    	        	}else{
	    	        		if (!fileExists) {
	    	                    newFiles.push(files[i]);
	    	                }}}
	    	        selectedFiles = selectedFiles.concat(newFiles); 
	    	        renderPreview(); 
	    	        updateFileInput();
	    	        if (selectedFiles.length > 0) {
	    	            $('.uploaded-delete').show();
	    	            $(".noAdditionalSupportingDoc").hide();
	    	            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    	            $("#ncbjFormPreviewFieldset .custom_loader").removeClass("hide");
	    	            $(".preview-section").addClass("hide");
	    	        } else {
	    	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	    	            $('.uploaded-delete').hide();
	    	            $(".noAdditionalSupportingDoc").show();
	    	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    	            $("#ncbjFormPreviewFieldset .custom_loader").addClass("hide");
	    	            $(".preview-section").removeClass("hide");
	    	        	}
	    	        }
	    	    });
	    	});
	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	}
	function ncbjGenericDocuments(folderName) {
		ncbjApplicationId = $("#ncbjApplicationId").val();
		var fileID = 'ncbjGenericUpload';
		var fileInput = $("#" + fileID)[0]; // File input element
 	    var fileLength = fileInput.files.length; // Count of selected files
 	   var saveAndConCheck = $("#saveAndConCheck").val();
	    var fileData = fileLength > 0 ? fileID : "0";
	    $("#ncbjFormPreviewFieldset .custom_loader").removeClass("hide");
	    $(".preview-section").addClass("hide");
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : 'ncbjGenericUpload',
			url : '${genericUploadInNCBJFormUrl}',
			dataType : 'text',
			data : {
				"<portlet:namespace/>folderName" : folderName,
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				"<portlet:namespace/>saveAndConCheck": saveAndConCheck,
			},
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
					});}}else{
                	$.each(parsedData.fileData, function(index, entry) {
		        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
		        	    $("."+fileID).html(fileTitle); // Set file title
		        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
		        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
		        	});}
				$("#ncbjFormPreviewFieldset .custom_loader").addClass("hide");
				$(".preview-section").removeClass("hide");
				$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			},
			error : function(data, status, e) {}
		});}
	function expandDetails(id){
  	    var currentIsActive = $("#"+id).hasClass('is-active');
  	    $("#"+id).removeClass('is-active');
  	    $("#"+id).next('.accordion__body').removeClass('is-active');
  	    if (currentIsActive != 1) {
  	        $("#"+id).addClass('is-active');
  	        $("#"+id).next('.accordion__body').addClass('is-active');
  	    }}
	function openSaveToDraftPopup(){
		draftNCBJ();
	}
	function activeSelectForm(){
		$(".iso9001CertificationForm, .applicant-details, .quotation-details, .newForm22000").addClass("hide");
		$(".iso9001CertificationForm").removeClass("active");
		$(".iso9001CertificationForm .nav-link").removeClass("active");
		$(".quotation-details").removeClass("active");
		$(".quotation-details .nav-link").removeClass("active");
		$(".newForm22000").removeClass("active");
		$(".newForm22000 .nav-link").removeClass("active");
		ncbjCategories = $("#ncbjCategoriesValue").val();
		if(ncbjCategories == "ISO 9001-2015 Certification"){
			ncbjTransactionType = $("#ncbjTransactionTypeValue").val();
			if(ncbjTransactionType == "New Client"){
				$(".iso9001CertificationForm").removeClass("hide");
				$(".tab-content .iso9001CertificationForm:first").addClass("active");
				$(".iso9001CertificationForm .nav-link:first").addClass("active");
				$(".iso9001CertificationForm .nav-link:first").removeClass("disabled");
				$("#supportingDocStep").html("5");
			}
			if(ncbjTransactionType == "NCBJ Certified Clients"){
				ncbjCertifiedClientService = $("#ncbjCertifiedClientServiceVal").val();
				if(ncbjCertifiedClientService == "Recertification"){
					$(".iso9001CertificationForm, .quotation-details").removeClass("hide");
					$(".tab-content .iso9001CertificationForm.quotation-details").addClass("active");
					$(".iso9001CertificationForm .quotation-details .nav-link:first").addClass("active");
					$(".iso9001CertificationForm .quotation-details .nav-link:first").removeClass("disabled");
					$("#supportingDocStep").html("2");
				}}}
		if(ncbjCategories == "ISO 22000-2018 Certification"){
			$(".newForm22000").removeClass("hide");
			$(".tab-content .newForm22000:first").addClass("active");
			$(".newForm22000 .nav-link:first").addClass("active");
			$(".newForm22000 .nav-link:first").removeClass("disabled");
			$("#supportingDocStep").html("6");
		}
		$(".form-preview-nav .nav-link").removeClass("disabled");
	}
	$("input[name='activityExclusion']").change(function() {
	    if($(this).val() == "Yes"){
	        $(".activityExclusionBox, .activityExclusionBoxPreview").removeClass("hide");
	    }else{
	    	$(".activityExclusionBox, .activityExclusionBoxPreview").addClass("hide");
	    }
	});
	$("input[name='desiredCertification']").change(function() {
	    if($(this).val() == "ISO 9001"){
	        $(".transfer9001Reason").addClass("hide");
	    }else{
	    	$(".transfer9001Reason").removeClass("hide");
	    }
	});
	  function draftNCBJ(){
		$(".savecountinuePopup").modal("show");
	    typeOfCertification = $("#ncbjCategoriesValue").val();
		typeOfTransaction = $("#ncbjTransactionTypeValue").val();
		iso9001CertificationValue = $("#iso9001CertificationValue").val();
		numberOfSite = $("#siteNumberSectionValue").val();
		if(typeOfCertification=="ISO 22000-2018 Certification"){
			selectedSecondCategory = [];
			$("#iso22000Certification").find(".wizard-card.active .wizard-title").each(function() {
				selectedSecondCategory.push($(this).html());
			});
			iso22000CertificationValue = selectedSecondCategory.join(";");
		}else{
			iso22000CertificationValue = $("#iso22000CertificationValue").val();
		}
		ncbjCertifiedClientServiceVal =$("#ncbjCertifiedClientServiceVal").val();
		ncbjServiceSurveillanceVal=$("#ncbjServiceSurveillanceVal").val();
		ncbjApplicationId = $("#ncbjApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id"); 
		if(currentStage=="SUPPORTING DOCUMENTS"){
			ncbjGenericDocuments('Generic Documents');
		}
		if(typeOfCertification == "ISO 9001-2015 Certification"){
			var currentFormToSave9001= $("#ncbjFormsFieldset .iso9001CertificationForm").find(".active span:nth-child(2)").text();
			if(currentFormToSave9001=="Site Details"){
				addCertifiPrefDateInfo(true);
				addApplicantDetail();
			}else if(currentFormToSave9001=="Organization Details"){
				organizationdetailInfo(true);
			}else if(currentFormToSave9001=="Signature"){
				signaturedetailInfo(true);
			}
			else if(currentFormToSave9001=="Section II"){
				signaturedetailInfo(true); 
			}else if(currentFormToSave9001=="Quotation Form"){
				addOrganizationInfo();
				addQuotationApplicantDetail();
			}
		}else if(typeOfCertification == "ISO 22000-2018 Certification"){
			var currentFormToSave22000= $("#ncbjFormsFieldset .newForm22000").find(".active span:nth-child(2)").text();
			if(currentFormToSave22000=="Company Details"){
				addCompanyDetail();
				addCompanyDetailInfo(true);
			}else if(currentFormToSave22000=="Section I"){
				newCompanyDetail();
				addSectionOneCompanyDetail();
				addProductServicesDetail();
				addEmployeesNumberDetail();
				addWorkPatternDetail();
				addPremisesAndLocationInfo(true);
				uploadDocuments('detail-operating','Draft Scope','','');
			}else if(currentFormToSave22000=="Section II"){
				addProcessDetailsInManufacturing(true);
				uploadDocuments('incomingMaterial','Incoming Materials','','');
				uploadDocuments('productStorage','Product Storage','','');
				uploadDocuments('buildingSite','Building and Site Aspects','','');
				uploadDocuments('wasteDischarge','Waste and Discharges','','');
				uploadDocuments('transport','Details of Transport','','');
				uploadDocuments('contractedActivties','Sub Contracted Activities','','');
			}else if(currentFormToSave22000=="Section III"){
				addHaccpNumberDetail();
				addHazardAnalysisDetail();
				addLicenceListDetail();
				addActivitiesProcessesList(true);
				addSpecificActivitiesList();
				uploadDocuments('processActivity','Process Activities','','Activities and Processes on site');
				uploadDocuments('siteActivity','Site Activities','','');
				uploadDocuments('incomingMaterials','Incoming materials','','Incoming materials');
				uploadDocuments('processes','Processes','','Processes');
				uploadDocuments('subContractedActivity','List of sub contracted activities','','');
			}else if(currentFormToSave22000=="Section IV"){
				addConsultancyServicesInfo(true);
				uploadDocuments('sectionFourSignatureBtn','Signature','');
			}else if(currentFormToSave22000=="Quotation Form"){
				addQuotationFormTwoInfo();
				uploadDocuments('operationScope','Scope of the Certification','','The scope along with a corporate brochure or relevant documents defining the nature and scope of your operations');
				uploadDocuments('operationScopeBroch','Scope of the Documents','','State the scope along with a corporate brochure or relevant documents defining the nature and scope of your operations');
			}
		}
		
		$.ajax({
			type : "POST",
			url : "${draftNCBJApplicationUrl}",
			data : {
				"<portlet:namespace/>typeOfCertification" : typeOfCertification,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>iso9001CertificationValue" : iso9001CertificationValue,
				"<portlet:namespace/>numberOfSite" : numberOfSite,
				"<portlet:namespace/>iso22000CertificationValue" : iso22000CertificationValue,
				"<portlet:namespace/>ncbjCertifiedClientServiceVal" : ncbjCertifiedClientServiceVal,
				"<portlet:namespace/>ncbjServiceSurveillanceVal" : ncbjServiceSurveillanceVal,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
			 	"<portlet:namespace/>currentStage" : currentStage,
				"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
			},
			success : function(data) {
				var result = data.APP_DATA;
					$("#pop_app_no").html(result["applicationNumber"]);
			        $("#pop_status").html(result["appStatus"]);
			        $("#pop_category").html(result["category"]);
			        $("#draft-category").html(result["category"]);
				    $("#ncbjApplicationId").val(result["ncbjApplicationId"]);
			},
			error : function(data) {
			}
		});
}
		function formatPhoneNumber(input) {
	        let formattedInput = input.value.replace(/[^\d\+\-\s]/g, '');
	        formattedInput = formattedInput.replace(/^\+/, '');        
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
	        input.value = formattedInput;
	    }
		$(".preview-edit-button").click(function(){
			$('#ncbjFormPreviewFieldset').removeClass("show");
			$('#ncbjFormsFieldset').addClass("show", "400");
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
			$('#ncbjFormPreviewFieldset').removeClass("show");
			$('#ncbjSupportingDocumentFieldset').addClass("show", "400");
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
		
		function submitFeeDetailsInNcbj(){
			ncbjApplicationId=$("#ncbjApplicationId").val();
			    paymentMethod = $("#paymentMethod").val();
			    paymentFee = $("#paidAmount").val();
			    amountPaid=$("#amountPaid").val();
			    amountCurrency=$("#amountCurrency").val();
			    if(paymentMethod=="Credit Card"){
				    $.ajax({
				        type: "POST",
				        url: '${ncbjFeeDetailsUrl}',
				        data: {
				          "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
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
					     var fileID = 'ncbj-payment-upload';
				   		$.ajaxFileUpload({
				   		    secureuri: false,
				   		    method: "POST",
				   		    url: "${ncbjFeeDetailsUrl}",
				   		    fileElementId: 'ncbj-payment-upload',
				   		    dataType: 'text',
				   		    data: {
				   		      "<portlet:namespace/>fileID": fileID,
				   		      "<portlet:namespace/>command": "fileUpload",
				   		   	  "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
				   			  "<portlet:namespace/>paymentFee": paymentFee,
				   		      "<portlet:namespace/>amountPaid": amountPaid,
			  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
				   		    },
				   		    success: function (data) {
				   		    	var parsedData = JSON.parse(data);
				   		    	$.each(parsedData,function(key,entry){
								    $("#payment-upload-preview").html(entry.fileName);
								    $("#payment-upload-preview").attr("href", entry.downloadFileUrl);
				   		    	});
				   		    },
				   		    error: function (data) {},
				   		  });
			     }}
	    function opendelDocPopup(fileEntryId,documentCounter){
			  $("#documentuploadCounter").val(documentCounter);
			  $("#deletepopup"+fileEntryId).modal("show");
		}
		function deleteDocument(fileEntryId) {
			documentuploadCounter = $("#documentuploadCounter").val();
		  $.ajax({
		      type: "POST",
		      url: '${deletedocumentUrl}',
		      data: {
		          "<portlet:namespace/>fileEntryId": fileEntryId,
		      },
		      success: function (data) {
		          $("#deletepopup"+fileEntryId).modal("hide");
		          $("#unpload-info-card"+fileEntryId).remove();
		          $("#documentUpload"+documentuploadCounter).removeClass("disabled");
		          $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
		      },
		      error: function (data) {
		      }
		  });}
		function downloadPDF() {
			ncbjApplicationId=$("#ncbjApplicationId").val();
			checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
	        $.ajax({
	                type: "POST",
	                url: "${ncbjDownloadPdfUrl}",
	                data: {
	                        "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
	                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
	                },
	                success: function(data) {
	                        var result = data.APP_DATA;
	                        $("#ncbjDownloadPDF").attr("href", result["fileUrl"]);
	                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
	                },
	                error: function(data) {},
	        });
	    }
		function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
		    ncbjApplicationId=$("#ncbjApplicationId").val();
			saveAndCon='<%=ncbjApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
			}
		}
</script>