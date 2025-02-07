<portlet:resourceURL var="pendingFactoriesApplication" id="/factories/Pending/App"></portlet:resourceURL>
<portlet:resourceURL var="gettingDocumentListFactoriesUrl" id="getting/Document/List/Factories/Url"></portlet:resourceURL>
<portlet:resourceURL var="factoriesRegistrationDoucumentsUpload" id="factories/Registration/Doucuments/Upload"></portlet:resourceURL>
<portlet:resourceURL var="factoriesRegistrationDeleteDocumentUrl" id="factories/Registration/Delete/DocumentUrl"></portlet:resourceURL>
<portlet:resourceURL var="factoriesfeeDetailsUrl" id="factories/fee/Details/Url"></portlet:resourceURL>
<portlet:resourceURL var="submitFactoriesApplication" id="submit/Factories/Application"></portlet:resourceURL>
<portlet:resourceURL var="draftFactoriesApplication" id="draft/Factories/Application"></portlet:resourceURL>
<portlet:resourceURL var="factoriesStandardActInfo" id="factories/Standard/Act/Info"></portlet:resourceURL>
<portlet:resourceURL var="processedFoodActInfo" id="processed/Food/Act/Info"></portlet:resourceURL>
<portlet:resourceURL var="factoriesDownloadPdfUrl" id="factories/download/pdf"></portlet:resourceURL>
<portlet:resourceURL var="reRegistrationUrl" id="re/Registration"></portlet:resourceURL>
<portlet:resourceURL var ="factoryDeleteDocumentUrl" id="/factory/Delete/Document/Url"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">New/Re-Registration</p>
							<p class="common-banner-title f1 mb-0">NCRA- Registration of Food Processing Establishment</p>
							<p class="common-banner-info f2 mb-3">Under the Processed
								Foods Act (1959) and the Standards Act (1969), the food factory
								must be registered with the National Compliance Regulatory
								Authority (NCRA) before its products can be distributed on the
								market.</p>
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
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">Type of
										Application</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF TRANSACTION</p> <span></span>
								</li>
								<li class="form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM
										DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING
										DOCUMENTS</p> <span></span>
								</li>
								<li class="rm fee-payment fp">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES
										PAYMENT</p> <span></span>
								</li>
								<li style="display: none" class="last-step"><span></span></li>
							</ul>
							<input type="hidden" id="factoriesRegistrationApplicationId" name="factoriesRegistrationApplicationId">
							<!-- <input id="employeeId"
								type="hidden" name="employeeId" /> <input
								id="tourismBonaAttracSignatureInfo" type="hidden"
								name="tourismBonaAttracSignatureInfo" /> <input type="hidden"
								id="tourismCurrentStage" name="tourismCurrentStage"> -->
								 <input
								type="hidden" id="checkPdfDownloadWithoutDocument"
								name="checkPdfDownloadWithoutDocument" value="true">
								<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=factoriesApplicationId%>">
						</div>
						<%@ include
							file="/type-of-transaction/factories-registration-transaction-type.jsp"%>
						<%@ include
							file="/type-of-application/factories-registration-application-type.jsp"%>
						<%@ include file="/forms/factories-registration-form-tabs.jsp"%>
						<%@ include
							file="/supporting-documents/factories-registration-documents.jsp"%>
						<%@ include file="/factories-registration-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/factories-registration-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
docRenderCount = 1;
var filledDocument = "";
var numberOfDocument = "";
var docList = 1;
$("#factoriesTransactionType .wizard-card").click(function(){
	$("#factoriesTransactionType").val($(this).find(".wizard-title span").html());
	$(".application-Fees .common-heading").html("Application Fee");
	$("#rm-payment-method").removeClass("hide");
	$("#factoriesTransactionType .wizard-card, #factoriesProductCategoriesFieldset .wizard-card, #factoriesRegistrationProcessingType .wizard-card, #factoriesProductCategoriesFieldset ul.wizard-cards-list .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#factoriesReRegistrationSection").addClass('hide');
	$("#factoriesRegistrationProcessingType").removeClass("hide");
	$("#factoriesProductCategoriesFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	var factoriesTransactionType = $("#factoriesTransactionType").val();
	if(factoriesTransactionType == "Re-Registration"){
		$("#factoriesReRegistrationSection").removeClass('hide');
		$("#factoriesRegistrationProcessingType").addClass("hide");
	}
	$("#factoriesRegistrationProductCategories").addClass("hide");
});
$("#factoriesRegistrationProcessingType .wizard-card").click(function () {
	$("#factoriesRegistrationProcessingType .wizard-card").removeClass("active");
	$("#factoriesProductCategoriesFieldset ul.wizard-cards-list .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#factoriesApplicationTypeVal").val($(this).find(".wizard-title").html());
	var factoriesApplicationTypeVal = $("#factoriesApplicationTypeVal").val(); 
	$("#payment_category").html(factoriesApplicationTypeVal);
	if(factoriesApplicationTypeVal == "Non-Prescribed Foods"){
		$(".second").addClass('hide');
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	else if(factoriesApplicationTypeVal == "Prescribed Foods"){
		$(".second").removeClass('hide');
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
	}
	$("#factoriesProductCategoriesFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#factoriesRegistrationProductCategories").removeClass("hide");
});	
$("#factoriesProductCategoriesFieldset ul.wizard-cards-list .wizard-card").click(function(){
	$(this).toggleClass("active");	
	$("#factoriesProductCategoriesFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#factoriesApplicationTypeProVal").val($(this).find(".wizard-title").html());
});

/* $("#factoriesRegistrationProcessingType .wizard-card").click(function(){
	$("#factoriesRegistrationProcessingType .wizard-card").removeClass("active");
	$(this).toggleClass("active");	
	$("#factoriesProductCategoriesFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#factoriesApplicationTypeVal").val($(this).find(".wizard-title").html());
	var factoriesApplicationTypeVal = $("#factoriesApplicationTypeVal").val(); 
	$("#payment_category").html(factoriesApplicationTypeVal);
	if(factoriesApplicationTypeVal == "Non-Prescribed Foods"){
		$(".second").addClass('hide');
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	else if(factoriesApplicationTypeVal == "Prescribed Foods"){
		$(".second").removeClass('hide');
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
	}
});
 */
function activeSelectForm(){
	
	$(".factories-registration-forms .tab-pane").removeClass('active');
    $(".factories-registration-forms .nav-link").removeClass("active");
    /* $(".factories-registration-forms .nav-link").addClass("disabled"); */
    
    
    $(".factories-registration-forms .tab-pane:first").addClass("active");
	$(".factories-registration-forms .nav-link:first").addClass("active");
	$(".factories-registration-forms .nav-link:first").removeClass("disabled");
}

var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    
    /* Scroll Page to top */
    scrollToPageTop();
    
    if(currentFieldSet == "factoriesProductCategoriesFieldset"){
    	pendingFactoriesApplication();
    	activeSelectForm();
		factoriesApplicationType = $("#factoriesApplicationTypeVal").val();
		$("#factoriesFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		if(factoriesApplicationType == "Prescribed Foods"){
			processedActEstablishmentName=$("#processedActEstablishmentName").val();
			if(processedActEstablishmentName) {
				$("#factoriesFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			} else {
				$("#factoriesFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			}
		}
		if(factoriesApplicationType == "Non-Prescribed Foods"){
			standardsActEstablishmentName = $("#standardsActEstablishmentName").val();
			standardsActEmail=$("#standardsActEmail").val();
			if(standardsActEstablishmentName != "" && standardsActEmail !=""){
				$("#factoriesFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			}else {
				$("#factoriesFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			}
		}
		selectedProductType = [];
		$("#factoriesRegistrationProductCategories").find(".wizard-card.active .wizard-title").each(function() {
			var product = $(this).html();
			selectedProductType.push(product.replace(/&amp;/g, "&")); 
		});
		//productCategories = selectedProductType.toString();
		productCategories = selectedProductType.join(", ");
		$("#processedActDescription").val(productCategories);
    }
   if(currentFieldSet == "factoriesTransactionTypeFieldset"){
    	if(docList==1){
		     gettingDocumentList();
		} 
    	docList++;
   //	 pendingFactoriesApplication(); 
     } 
    if(currentFieldSet == "factoriesFormsFieldset"){
    	addStandardsActDetail(true);
    	processesFoodActFormA();
    	addProductDetail(true);
    	/* DOCUMENT VALIDATION */
    	var requiredDoc = $("div[id='requiredDoc']").length;
    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
    	if(requiredDoc >= 1){
    		$(".mandatory-doc-heading").removeClass("hide");
    		numberOfDocument = requiredDoc;
    		if(numberOfDocument != filledDocument){
        		$("#factoriesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        	}
    	}
		pendingFactoriesApplication();
     }
  
	if(currentFieldSet == "factoriesSupportingDocumentFieldset"){
		uploadDocuments('factoriesGenericUpload','Generic Document Upload','');
		pendingFactoriesApplication();
	  } 
	 if(currentFieldSet == "factoriesfeePaymentFieldset"){
		 uploadDocuments('factoriesGenericUpload','Generic Document Upload','');
		 showDocsPreview(docRenderCount);
	     docRenderCount++;
		 showFinalSubmitButton();
		 previewStandardActDetailInfo();
	     finalPreviewScroll();
	     $(".fee-amount-preview").html($("#amountPaid").val());
	 	 $(".fee-currency-preview").html($("#amountCurrency").val());
	 	 submitFeeDetailsInFactoriesRegistration();
		 pendingFactoriesApplication();
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
    function showFinalSubmitButton(){
    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    	if(currentFieldSet == "factoriesfeePaymentFieldset" || currentFieldSet == "factoriesFormPreviewFieldset"){
            	$(".form-wizard-next-btn ").hide();
            	$(".form-wizard-save-btn").hide();
            	$(".final-submit").removeClass("hide");
            }else{
            	$(".form-wizard-next-btn").show();
            	$(".form-wizard-save-btn").show();
            	$(".final-submit").addClass("hide");
            }
    }
   
    
    $(document).ready(function () {
    	$('input[name=""]').tagsinput({
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
	$(".prev-step").click(function(e) {
		var $active = $('.nav-tabs li>a.active');
		prevTab($active);
	});

	function prevTab(elem) {
		$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

	}
});

$('input[type=radio][name=establishmentBefore]').change(function() {
    if (this.value == 'Yes') {
        $("#other-copy, #other-copy1, #otherCopyPre").removeClass("hide");
    }
    else{
    	$("#other-copy, #other-copy1, #otherCopyPre").addClass("hide");
    }
});
$('input[type=radio][name=establishmentOperated]').change(function() {
    if (this.value == 'Yes') {
        $("#other-field, #other-field1, #otherfieldPre").removeClass("hide");
    }
    else{
    	$("#other-field, #other-field1, #otherfieldPre").addClass("hide");
    }
});
/*  Standards Act Sign */
$(document).on('change', '#establishmentSignaturefactoriesBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#establishmentSignaturefactoriesImgHolder");
	  var form1a_image_holder = $("#actStandOperatorEstablishmentSignPreview");
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
	        establishmentSignaturefactoriesImgStatus = "True";
	      } else {
	        alert("This browser does not support FileReader.");
	        establishmentSignaturefactoriesImgStatus = "";
	      }
	    } else {
	      alert("Pls select only images");
	      establishmentSignaturefactoriesImgStatus = "";
	    }
	    stansardActValidation();
	  });
/*  Processed Act Sign */
$(document).on('change', '#processedFoodSignaturefactoriesBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#processedFoodSignaturefactoriesImgHolder");
	   var form1a_image_holder = $("#foodActOperatorSignaturePreview");
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
	        processedFoodSignaturefactoriesImgStatus = "True";
	      } else {
	        alert("This browser does not support FileReader.");
	        processedFoodSignaturefactoriesImgStatus = "";
	      }
	    } else {
	      alert("Pls select only images");
	      processedFoodSignaturefactoriesImgStatus = "";
	    }
	    regulationdetailInfo();
	  });
/* next-form */
function applicantInfo(){ 
		nextForm();
		pendingFactoriesApplication();
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
	 function openSaveToDraftPopupFactoriesRegistration() {
			$(".savecountinuePopup").modal("show");
			saveToDraft();
		}
		function finalSubmitFactoriesRegistrationApp() {
			$(".final-submit-container").removeClass("hide");
			submitFactoriesRegistrationApplication();
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
 

    $(document).on('change', '#factories-payment-upload', function() {
		selectedfiles = this.files[0].name;
		$("#factories-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #factories-payment-file-chosen").empty();
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
	
	$("#standardsActEditTab").click(function(){
		   $('#factoriesFormPreviewFieldset').removeClass("show");
		   $('#factoriesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#standardsActTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
	$("#processedFoodActEditTab").click(function(){
		   $('#factoriesFormPreviewFieldset').removeClass("show");
		   $('#factoriesFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#processedActTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
	$("#supporting-doc-edit-tab").click(function(){
		$('#factoriesFormPreviewFieldset').removeClass("show");
		$('#factoriesSupportingDocumentFieldset').addClass("show", "400");
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
		$('#factoriesFormPreviewFieldset').removeClass("show");
		$('#factoriesfeePaymentFieldset').addClass("show", "400");
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
	
		function pendingFactoriesApplication(){
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			typeOfTransaction=$("#factoriesTransactionType").val();
			factoriesApplicationType=$("#factoriesApplicationTypeVal").val();
			if(typeOfTransaction == "New Application"){
				selectedProductType = [];
				$("#factoriesRegistrationProductCategories").find(".wizard-card.active .wizard-title").each(function() {
					selectedProductType.push($(this).html());
				});
				//productCategories = selectedProductType.toString();
				productCategories = selectedProductType.join(";");
				
			}else{
				productCategories = $("#factoriesApplicationTypeProVal").val();
			}
			currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    	lastFormDetailsStep = $(".tab-pane.active").attr("id");
			currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
			
			 $.ajax({
			        type: "POST",
			        url: '${pendingFactoriesApplication}',
			        data: {
			            "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			            "<portlet:namespace/>productCategories": productCategories,
			            "<portlet:namespace/>factoriesApplicationType": factoriesApplicationType,
			            "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			            "<portlet:namespace/>currentFormToSave": currentFormToSave,
			            "<portlet:namespace/>currentFormToSave": currentFormToSave,
			            "<portlet:namespace/>currentStage": currentStage,
			            "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			        },
			       success: function (data) {
			    	   var result=data.APP_DATA;
			    	   $("#pop_app_no").html(result["factoryAppNo"]);
					      $("#pop_status").html(result["appStatus"]);
					      $("#pop_category").html(result["category"]);
					      $("#factoriesRegistrationApplicationId").val(result["factoriesAppicationId"]);
			        },
			        error: function (data) {
			        }
			    });
		}
		
		function deleteGenericDocument(fileEntryId) {
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${factoryDeleteDocumentUrl}',
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
					var notRequireDocCount = $("#notRequiredCounter").val();
					var notRequireDoc = notRequireDocCount - requiredDoc;
					if(requiredDoc > 0){
						if(documentuploadCounter <= requiredDoc){
							$("#requireDocNamePreview" + documentuploadCounter).html("");
							filledDocument = filledDocument -1;
							$("#factoriesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
						}
					}
					if(notRequireDoc > 0){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
					} 
				},
				error : function(data) {

				}
			});
		}
		function deleteDocumentFee(fileEntryId) {
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${factoryDeleteDocumentUrl}',
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
		     
		        $("#factories-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		    } else {
		        // Otherwise, disable the upload button
		    	$("#factories-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		    }
		}
		function submitFactoriesRegistrationApplication(){
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			typeOfTransaction=$("#factoriesTransactionType").val();
			if(typeOfTransaction == "New Application"){
				selectedProductType = [];
				$("#factoriesRegistrationProductCategories").find(".wizard-card.active .wizard-title").each(function() {
					selectedProductType.push($(this).html());
				});
				//productCategories = selectedProductType.toString();
				productCategories = selectedProductType.join(";");
				
			}else{
				productCategories = $("#factoriesApplicationTypeProVal").val();
			}
			factoriesApplicationType=$("#factoriesApplicationTypeVal").val();
			currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
			 $.ajax({
			        type: "POST",
			        url: '${submitFactoriesApplication}',
			        data: {
			            "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			           "<portlet:namespace/>productCategories": productCategories,
			            "<portlet:namespace/>factoriesApplicationType": factoriesApplicationType,
			            "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			            "<portlet:namespace/>currentFormToSave": currentFormToSave,
			        },
			       success: function (data) {
			   	    var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
		    		 if(appStatus==="submitted"){
				   		$("#continueDashboardfactories").removeClass("hide");
				   		$("#submitted-content").removeClass("hide");
				   		$("#application_submitted-img").removeClass("hide");
				   	}else{
				   		$("#draft-content").removeClass("hide");
				   		$("#application_draft-img").removeClass("hide");
				   	}
			      $("#submit_pop_app_no").html(result["factoriesAppNo"]);
			      $("#submit_pop_status").html(result["appStatus"]);
			      $("#submit_pop_category").html(result["category"]);
			     $("#factoriesRegistrationApplicationId").val(result["factoriesApplicationId"]);
			 	  $(".custom_loader").addClass("hide");
		    	  $(".final-submit-content").css({"opacity":"1"}); 
			        },
			        error: function (data) {
			        }
			    });
		}
		function saveToDraft(){
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			typeOfTransaction=$("#factoriesTransactionType").val();
			if(typeOfTransaction == "New Application"){
				selectedProductType = [];
				$("#factoriesRegistrationProductCategories").find(".wizard-card.active .wizard-title").each(function() {
					selectedProductType.push($(this).html());
				});
				//productCategories = selectedProductType.toString();
				productCategories = selectedProductType.join(";");
			}else{
				productCategories = $("#factoriesApplicationTypeProVal").val();
			}
			factoriesApplicationType=$("#factoriesApplicationTypeVal").val();
			
			
			currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    	lastFormDetailsStep = $(".tab-pane.active").attr("id");
			currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSave=="Standards Act"){
				addStandardsActDetail(true);
				addProductDetail(true);
				uploadDocuments('establishmentSignaturefactoriesBtn','Standard Act Signature');
			}if(currentFormToSave=="Form A (Regulation 3)"){
				processesFoodActFormA();
				uploadDocuments('processedFoodSignaturefactoriesBtn','Processed Food Act Signature');
			}
			  if(currentStage == "SUPPORTING DOCUMENTS"){
                  uploadDocuments('factoriesGenericUpload','Generic Document Upload','');
             }
             if(currentStage=="APPLICATION FEES PAYMENT"){
                           submitFeeDetailsInFactoriesRegistration();
                    }

			 $.ajax({
			        type: "POST",
			        url: '${draftFactoriesApplication}',
			        data: {
			            "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			            "<portlet:namespace/>productCategories": productCategories,
			            "<portlet:namespace/>factoriesApplicationType": factoriesApplicationType,
			            "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			            "<portlet:namespace/>currentFormToSave": currentFormToSave,
			            "<portlet:namespace/>currentStage": currentStage,
			            "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			        },
			        async:false,
			       success: function (data) {
			   	  	  var result=data.APP_DATA;
			   	  	  $("#pop_app_no").html(result["factoryAppNo"]);
				      $("#pop_status").html(result["appStatus"]);
				      $("#pop_category").html(result["category"]);
				      $("#factoriesRegistrationApplicationId").val(result["factoriesAppicationId"]);
			        },
			        error: function (data) {
			        }
			    });
		}
		/* function gettingDocumentList(){
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			 $.ajax({
			        type: "POST",
			        url: '${gettingDocumentListFactoriesUrl}',
			        data: {
			            "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			        },
			       success: function (data) {
			    	   $("#documentList").html(data);
			        },
			        error: function (data) {
			        }
			    });
		} */
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
		function supportingDocumentUpload() {
			var documentNumber = $("#<portlet:namespace/>documentNumber").val();
			var issueDate = $("#<portlet:namespace/>issueDate").val();
			var expiryDate = $("#<portlet:namespace/>expiryDate").val();
			var documentName = $("#<portlet:namespace/>documentName").val();
			var documentuploadCounter = $("#documentuploadCounter")
					.val();
			var fileID = 'factoriesEnrollDocuments';
			$("#commonuploadpopup").modal("hide");
			$('.hidden' + documentuploadCounter).removeClass('hide');
			var progress = document.getElementById('progress'
					+ documentuploadCounter);
			progress.ariaValueNow = 50;
			progress.style.width = '50%';
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			$
					.ajaxFileUpload({
						secureuri : false,
						method : "POST",
						fileElementId : 'factoriesEnrollDocuments',
						url : '${factoriesRegistrationDoucumentsUpload}',
						dataType : 'text',
						data : {
							"<portlet:namespace/>documentNumber" : documentNumber,
							"<portlet:namespace/>documentName" : documentName,
							"<portlet:namespace/>fileID" : fileID,
							"<portlet:namespace/>command" : "fileUpload",
							"<portlet:namespace/>issueDate" : issueDate,
							"<portlet:namespace/>expiryDate" : expiryDate,
							"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
							"<portlet:namespace/>factoriesApplicationId" : factoriesApplicationId,
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
							updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
				            genericFilledDoc= $(".supporting-document-card").find(".generic-doc").length;
				            filledDocument=updatedFillDoc-genericFilledDoc;
							if(numberOfDocument == filledDocument){
					        	$("#factoriesSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					        }
						},
						error : function() {
						}
					});
		}
		
		$(function() {
			$(document).on('change', '#factoriesEnrollDocuments', function() {
				var fileName = $(this).val();
				fileName = fileName.replace("C:\\fakepath\\", "");
				$(this).next('.custom-file-label').html(fileName);
			})
		});
		function opendelDocPopup(fileEntry, counter) {
			$("#documentuploadCounter").val(counter);
			$("#deletepopup" + fileEntry).modal("show");
		}
		function deleteDocument(fileEntryId) {
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${factoriesRegistrationDeleteDocumentUrl}',
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
					if(requiredDoc >= 1){
					if(documentuploadCounter <= requiredDoc){
						$("#requireDocNamePreview" + documentuploadCounter).html("");
						filledDocument = filledDocument -1;
						$("#factoriesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
					}
					if(notRequireDoc > 0){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
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
		        $('#factoriesGenericUpload')[0].files = newFileList.files;
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

		    $(document).on('change', '#factoriesGenericUpload', function () {
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
		            var factoriesApplicationId = "<%=factoriesApplicationId%>";
		        	if(factoriesApplicationId > 0 ){
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
		            $("#factoriesFormPreviewFieldset .custom_loader").removeClass("hide");
		            $(".preview-section").addClass("hide");
		        } else {
		        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
		            $('.uploaded-delete').hide();
		            $(".noAdditionalSupportingDoc").show();
		            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		            $("#factoriesFormPreviewFieldset .custom_loader").addClass("hide");
		            $(".preview-section").removeClass("hide");
		        	}
		        }
		    });
		});
		function deleteDoc(id) {
		    var currentId = id;
			$(".document-container-preview"+currentId).remove();
		}
		function submitFeeDetailsInFactoriesRegistration(){
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paymentFee").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${factoriesfeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
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
				     var fileID = 'factories-payment-upload';
			   		$.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${factoriesfeeDetailsUrl}",
			   		    fileElementId: 'factories-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		      "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			   			  "<portlet:namespace/>paymentFee": paymentFee,
			   		      "<portlet:namespace/>amountPaid": amountPaid,
		  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
			   		    },
				   		 success: function (data) { 
				   			downloadPDF();
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
		function addStandardsActDetail(theSaveandContinue) {
			standardsActEstablishmentName = $("#standardsActEstablishmentName").val();
			standardsActAddParish = $("#standardsActAddParish").val();
			standardsActAddress = $("#standardsActAddress").val();
			standardsActTel = $("#standardsActTel").val();
			standardsActWhatsAppNum = $("#standardsActWhatsAppNum").val();
			standardsActEmail = $("#standardsActEmail").val();
			standardsActFaxNum = $("#standardsActFaxNum").val();
			standardsActOperatorName = $("#standardsActOperatorName").val();
			standardsActOperatorAddress = $("#standardsActOperatorAddress").val();
			standardsActParish = $("#standardsActParish").val();
			standardsActOperatorTel = $("#standardsActOperatorTel").val();
			
			standardActProductManufactured = $("#standardActProductManufactured").val();
			standardActBrandManufactured = $("#standardActBrandManufactured").val();
			standardsActProductSize = $("#standardsActProductSize").val();
			
			standardsActLastDate = $("#standardsActLastDate").val();
			standardsActPurpose = $("#standardsActPurpose").val();
			standardsActDate = $("#standardsActDate").val();
			
			establishmentBefore = $('input[name="establishmentBefore"]:checked').val();
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			standardsActEstablishmentName=$("#standardsActEstablishmentName").val();
			standardsActEmail=$("#standardsActEmail").val();
			
			productDetailVal = $("#productDetailVal").val();
			submitForm= true;
			if(!theSaveandContinue){
				var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
				if($("#establishmentSignaturefactoriesImgHolder").find("img").length>0){
					$("#establishmentSignaturefactoriesImgHolderValidation").addClass("hide");
				}else{
					$("#establishmentSignaturefactoriesImgHolderValidation").removeClass("hide");
					const formSection = document.getElementById('establishmentSignaturefactoriesImgHolder');
	    			if (formSection) {
	    			    formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
	    			}
					submitForm= false;
				}
				
				if(!standardsActDate){
					$("#standardsActDateValidation").removeClass("hide");
					$("#standardsActDate").focus();
					submitForm= false;
				}else{
					$("#standardsActDateValidation").addClass("hide");
				}
				if(!establishmentBefore){
					$("#establishmentBeforeValidation").removeClass("hide");
					$('input[name="establishmentBefore"]').focus();
					submitForm= false;
				}else{
					$("#establishmentBeforeValidation").addClass("hide");
				}
				/* BO VALIDATION FOR ONCE */
				if(productDetailVal == 1){					
					brand = $("#brand").val();
					product = $("#product").val();
					productSize = $("#productSize").val();
					measurementValue = $("#measurementValue").val();
					if(!measurementValue){
						$("#measurementValueValidation").removeClass("hide");
						$("#measurementValue").focus();
						submitForm= false;
					}else{
						$("#measurementValueValidation").addClass("hide");
					}
					if(!productSize){
						$("#productSizeValidation").removeClass("hide");
						$("#productSize").focus();
						submitForm= false;
					}else{
						$("#productSizeValidation").addClass("hide");
					}
					if(!product){
						$("#productValidation").removeClass("hide");
						$("#product").focus();
						submitForm= false;
					}else{
						$("#productValidation").addClass("hide");
					}
					if(!brand){
						$("#brandValidation").removeClass("hide");
						$("#brand").focus();
						submitForm= false;
					}else{
						$("#brandValidation").addClass("hide");
					}
				}
				/* BO VALIDATION FOR ONCE END*/
				if(!standardsActOperatorTel){
					$("#standardsActOperatorTelValidation").removeClass("hide");
					$("#standardsActOperatorTel").focus();
					submitForm= false;
				}else{
					$("#standardsActOperatorTelValidation").addClass("hide");
				}
				if(!standardsActParish){
					$("#standardsActParishValidation").removeClass("hide");
					$("#standardsActParish").focus();
					submitForm= false;
				}else{
					$("#standardsActParishValidation").addClass("hide");
				}
				if(!standardsActOperatorAddress){
					$("#standardsActOperatorAddressValidation").removeClass("hide");
					$("#standardsActOperatorAddress").focus();
					submitForm= false;
				}else{
					$("#standardsActOperatorAddressValidation").addClass("hide");
				}
				if(!standardsActOperatorName){
					$("#standardsActOperatorNameValidation").removeClass("hide");
					$("#standardsActOperatorName").focus();
					submitForm= false;
				}else{
					$("#standardsActOperatorNameValidation").addClass("hide");
				}
				if(!standardsActFaxNum){
					$("#standardsActFaxNumValidation").removeClass("hide");
					$("#standardsActFaxNum").focus();
					submitForm= false;
				}else{
					$("#standardsActFaxNumValidation").addClass("hide");
				}
				if(!standardsActEmail){
					$("#standardsActEmailValidation").removeClass("hide");
					$("#standardsActEmailValidation").text("Please Enter Email Address");
					$("#standardsActEmail").focus();
					submitForm= false;
				}else if(standardsActEmail.match(mailformat)){ 
					$("#standardsActEmailValidation").addClass("hide");
				}else{
					$("#standardsActEmailValidation").removeClass("hide");
					$("#standardsActEmailValidation").text("You have Entered an In-valid email address");
					$("#standardsActEmail").focus();
					submitForm= false;
				}
				if(!standardsActWhatsAppNum){
					$("#standardsActWhatsAppNumValidation").removeClass("hide");
					$("#standardsActWhatsAppNum").focus();
					submitForm= false;
				}else{
					$("#standardsActWhatsAppNumValidation").addClass("hide");
				}
				if(!standardsActTel){
					$("#standardsActTelValidation").removeClass("hide");
					$("#standardsActTel").focus();
					submitForm= false;
				}else{
					$("#standardsActTelValidation").addClass("hide");
				}
				if(!standardsActAddress){
					$("#standardsActAddressValidation").removeClass("hide");
					$("#standardsActAddress").focus();
					submitForm= false;
				}else{
					$("#standardsActAddressValidation").addClass("hide");
				}
				if(!standardsActAddParish){
					$("#standardsActAddParishValidation").removeClass("hide");
					$("#standardsActAddParish").focus();
					submitForm= false;
				}else{
					$("#standardsActAddParishValidation").addClass("hide");
				}
				if(!standardsActEstablishmentName){
					$("#standardsActEstablishmentNameValidation").removeClass("hide");
					$("#standardsActEstablishmentName").focus();
					submitForm= false;
				}else{
					$("#standardsActEstablishmentNameValidation").addClass("hide");
				}
				if(establishmentBefore == "Yes"){
					if(!standardsActPurpose){
						$("#standardsActPurposeValidation").removeClass("hide");
						$("#standardsActPurpose").focus();
						submitForm= false;
					}else{
						$("#standardsActPurposeValidation").addClass("hide");
					}
					if(!standardsActLastDate){
						$("#standardsActLastDateValidation").removeClass("hide");
						$("#standardsActLastDate").focus();
						submitForm= false;
					}else{
						$("#standardsActLastDateValidation").addClass("hide");
					}
				}
			}
			
		if(submitForm){
			$.ajax({
				type : "POST",
				url : '${factoriesStandardActInfo}',
				data : {
					"<portlet:namespace/>standardsActEstablishmentName" : standardsActEstablishmentName,
					"<portlet:namespace/>standardsActAddParish" : standardsActAddParish,
					"<portlet:namespace/>standardsActAddress" : standardsActAddress,
					"<portlet:namespace/>standardsActTel" : standardsActTel,
					"<portlet:namespace/>standardsActWhatsAppNum" : standardsActWhatsAppNum,
					"<portlet:namespace/>standardsActEmail" : standardsActEmail,
					"<portlet:namespace/>standardsActFaxNum" : standardsActFaxNum,
					"<portlet:namespace/>standardsActOperatorName" : standardsActOperatorName,
					"<portlet:namespace/>standardsActOperatorAddress" : standardsActOperatorAddress,
					"<portlet:namespace/>standardsActParish" : standardsActParish,
					"<portlet:namespace/>standardsActOperatorTel" : standardsActOperatorTel,
					"<portlet:namespace/>standardActProductManufactured" : standardActProductManufactured,
					"<portlet:namespace/>standardActBrandManufactured" : standardActBrandManufactured,
					"<portlet:namespace/>standardsActProductSize" : standardsActProductSize,
					"<portlet:namespace/>standardsActLastDate" : standardsActLastDate,
					"<portlet:namespace/>standardsActPurpose" : standardsActPurpose,
					"<portlet:namespace/>standardsActDate" : standardsActDate,
					"<portlet:namespace/>establishmentBefore" : establishmentBefore,
					"<portlet:namespace/>factoriesApplicationId" : factoriesApplicationId,

				},
				
				success : function(data) {
					uploadDocuments('establishmentSignaturefactoriesBtn','Standard Act Signature','');
					if(!theSaveandContinue){
						applicantInfo();
					}
					addProductDetail(true);
				},
				error : function(data) {
					
				}
			});
		}
		}

		function getSingleFactoriesDashboard(factoriesDashboardRenderURL) {
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			window.location.href = "/group/guest/factories-registration-dashboard?factoriesApplicationId="
					+ factoriesApplicationId;
    }
		function processesFoodActFormA() {
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			processedActEstablishmentName = $("#processedActEstablishmentName").val();
			processedActParishAddress = $("#processedActParishAddress").val();
			processedActAddress = $("#processedActAddress").val();
			processedActOperatorName = $("#processedActOperatorName").val();
			processedActOperatorAddress = $("#processedActOperatorAddress").val();
			processedActParish = $("#processedActParish").val();
			processedActDescription = $("#processedActDescription").val();
			establishmentOperated = $('input[name="establishmentOperated"]:checked').val();
			processedActLastDate = $("#processedActLastDate").val();
			processedActManufactured = $("#processedActManufactured").val();
			processedActDate = $("#processedActDate").val();
			
			$.ajax({
				type : "POST",
				url : '${processedFoodActInfo}',
				data : {
					"<portlet:namespace/>factoriesApplicationId" : factoriesApplicationId,
					"<portlet:namespace/>processedActEstablishmentName" : processedActEstablishmentName,
					"<portlet:namespace/>processedActParishAddress" : processedActParishAddress,
					"<portlet:namespace/>processedActAddress" : processedActAddress,
					"<portlet:namespace/>processedActOperatorName" : processedActOperatorName,
					"<portlet:namespace/>processedActOperatorAddress" : processedActOperatorAddress,
					"<portlet:namespace/>processedActParish" : processedActParish,
					"<portlet:namespace/>processedActDescription" : processedActDescription,
					"<portlet:namespace/>establishmentOperated" : establishmentOperated,
					"<portlet:namespace/>processedActLastDate" : processedActLastDate,
					"<portlet:namespace/>processedActManufactured" : processedActManufactured,
					"<portlet:namespace/>processedActDate" : processedActDate,
				},
				success : function(data) {
					
					uploadDocuments('processedFoodSignaturefactoriesBtn','Processed Food Act Signature','')
				},
				error : function(data) {

				}
			});
		}
		$(".hidePopup").click(function () {
			$(".editProductDetailEditTabPopup").modal("hide");
		});
		function downloadPDF() {
			factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
			checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
	        $.ajax({
	                type: "POST",
	                url: "${factoriesDownloadPdfUrl}",
	                data: {
	                        "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
	                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
	                },
	                success: function(data) {
	                        var result = data.APP_DATA;
	                           if (result && result["fileUrl"]) {
	                        $("#factoriesDownloadPDF").attr("href", result["fileUrl"]);
	                        $("#factoriesDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
	                           }},
	                error: function(data) {},
	        });
	    }
		
		
		
    	
	    function reRegistration(){
	    	$("#farm-renew-btn").attr("disabled", "disabled");
	    	$("#reRegistrationNumberValidation").addClass("hide");
	    	registrationNum = $("#Re-Registration-number").val();
	    	 $.ajax({
	 	        type: "POST",
	 	        url: '${reRegistrationUrl}',
	 	        data: {
	 	            "<portlet:namespace/>registrationNum": registrationNum,
	 	        },
	 	        success: function (data) {
	 	        	var result = data.APP_DATA;
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var validation=result["registrationNumCheck"];
	 	           if(validation == 0){
	 	        	  $("#reRegistrationNumberValidation").removeClass("hide");
	 	        	 $("#farm-renew-btn").removeAttr("disabled"); 
	 	        	$("#factoriesRegistrationProcessingType").removeClass("hide");
	 	           }else{
	 	        	  window.location.href = renewLicenseUrl;
	 	           }
	 	        },
	 	        error: function (data) {
					
	 	        }
	 	    });
	    }
</script>