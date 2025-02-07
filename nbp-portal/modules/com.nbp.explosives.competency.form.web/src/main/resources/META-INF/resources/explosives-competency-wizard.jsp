<portlet:resourceURL var="explosiveFeeDetailsUrl" id="/explosive/fee/payment"></portlet:resourceURL>
<portlet:resourceURL var="explosiveDownloadPdfUrl" id="/explosive/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="explosivesGenericSupportingDocUrl" id="explosives/generic/supporting/doc"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="renew/licence/url"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for </p>
							<p class="common-banner-title f1 mb-0">Explosives Competency Certification</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support"
								class="common-banner-transparent-link f2 d-inline-block"><liferay-ui:message
									key="Need help in your application? " /> <span class="ml-2"> <svg
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
									<p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
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
									<p class="application-form-lower-heading">APPLICATION FEES
										PAYMENT</p> <span></span>
								</li>
								<li style="display: none"  class="last-step">
									<p class="application-form-upper-title">Please Verify</p>
									<p class="application-form-lower-heading">EXPLOSIVES COMPETENCY FORM PREVIEW </p> <span></span>
								</li>
							</ul>
							<input type="hidden" id="explosivesApplicationId" name="explosivesApplicationId" value="">
							<!--   <input type="hidden" id="miicApplicationId" name="miicApplicationId" value=""> 
							 <input type="hidden" id="miicCurrentStage" name="miicCurrentStage">
							 <input type="hidden" id="dashboardUrl" name="dashboardUrl" value="">-->
							 <input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							 <input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=explosivesApplicationId%>">
						</div>
						<%@ include file="/type-of-application/explosives-application-type.jsp"%>
						<%@ include file="/type-of-transaction/explosives-transaction-type.jsp"%>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/explosives-documents.jsp"%>
						<%@ include file="/explosives-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/explosive-final-submission.jsp" %>
					</form>
				</div>
			</div>
		</div>
	</div>
</section> 

<script>
var explosiveDocCount=1;
var filledDocument = "";
var docRenderCount;
$("#explosivesApplicationTypeBox .wizard-card").click(function(){
	$("#explosivesApplicationTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#explosivesApplicationTypeValue").val($(this).find(".wizard-title").html());
	$("#transactionType .wizard-card").removeClass("active");
	$("#competencyCertificateSection").addClass("hide");
	$("#explosivesTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#blasterFeeIcon, #pyrotechnicFeeIcon").addClass("hide");
	explosivesApplicationType = $("#explosivesApplicationTypeValue").val();
	if(explosivesApplicationType == "Blaster's Competency Certificate"){
		$(".applicationTypeHeading, #payment_category").html("Blaster's Competency Certificate");
		$("#blasterFeeIcon").removeClass("hide");
		
		blasterFistName = $("#blasterFistName").val();
		$("#explosivesFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		if(blasterFistName){
		   $("#explosivesFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		}
		
	}else{
		$(".applicationTypeHeading, #payment_category").html("Pyrotechnic Competency Certificate");
		$("#pyrotechnicFeeIcon").removeClass("hide");
	}
});

$("#explosivesRenew").click(function(){
	$("#competencyCertificateSection").removeClass("hide");
	$("#transactionType .wizard-card").removeClass("active");
	$(this).addClass("active"); 
	$("#explosivesTransactionTypeValue").val($(this).find(".wizard-title").html());
	$("#explosivesTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});

$("#explosivesNewCompetency").click(function(){
	$("#competencyCertificateSection").addClass("hide");
	$("#transactionType .wizard-card").removeClass("active");
	$(this).addClass("active"); 
	$("#explosivesTransactionTypeValue").val($(this).find(".wizard-title").html());
	$("#explosivesTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	explosivesTransactionType = $("#explosivesTransactionTypeValue").val();
	if(explosivesTransactionType == "New Competency Certificate"){
		$(".mandatory-doc-heading").addClass("hide");
	}else{
		$(".mandatory-doc-heading").removeClass("hide");
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
		
		if(currentFieldSet == "explosivesTransactionTypeFieldset"){
			pendingApplication();
			/* if(explosiveDocCount==1){ */
				 gettingDocumentList();
    		/* } 
			explosiveDocCount++; */
		   /*  $("#explosivesFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"}); */
			
	    }
		if(currentFieldSet == "explosivesSupportingDocumentFieldset"){
			pendingApplication();
			uploadDocuments("explosivesGenericUpload","Generic Documents");
		}
	    if(currentFieldSet == "explosivesFormsFieldset"){
	    	pendingApplication();
	    	/* addPyrotechnicDetailInfo(false); */
	    	addBlasterDetailInfo();
	    	
	    	/* DOCUMENT VALIDATION */
	    	$("#explosivesSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	    	explosivesTransactionType=$("#explosivesTransactionTypeValue").val();
	    	if(explosivesTransactionType=="Renewal Competency Certificate"){
		    	var requiredDoc = $("div[id='requiredDoc']").length;
		    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    	if(requiredDoc >= 1){
		    		$(".mandatory-doc-heading").removeClass("hide");
		    		numberOfDocument = requiredDoc;
		    		if(numberOfDocument != filledDocument){
		        		$("#explosivesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		        	}
		    	}
	    	}
	    }
	    if(currentFieldSet == "explosivesfeePaymentFieldset"){
	    	pendingApplication();
	    	submitFeeDetailsInExplosive();
	        showFinalSubmitButton();
	    	previewMethod();
			finalPreviewScroll();
			$(".fee-amount-preview").html($("#amountPaid").val());
		 	$(".fee-currency-preview").html($("#amountCurrency").val());
		 	uploadDocuments("explosivesGenericUpload","Generic Documents");	
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
	    
    
	    /* final sumbitbutton */
		function showFinalSubmitButton(){
	    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	        if(currentFieldSet == "explosivesfeePaymentFieldset" || currentFieldSet == "explosivesformPreviewFieldset"){
	                $(".form-wizard-next-btn ").hide();
	                $(".form-wizard-save-btn").hide();
	                $(".final-submit").removeClass("hide");
	            }else{
	                $(".form-wizard-next-btn").show();
	                $(".form-wizard-save-btn").show();
	                $(".final-submit").addClass("hide");
	            }
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
				$active.parent().next().find('.nav-link')
						.removeClass('disabled');
				nextTab($active);
			}); */
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
	
	$("#explosive-competency-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#explosive-competency-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});

	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #explosive-competency-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #explosive-competency-payment-upload").val('');
	    }
	});
	/* Preview Method */
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
 
	function pendingApplication(){
		explosivesApplicationType=$("#explosivesApplicationTypeValue").val();
		explosivesTransactionType=$("#explosivesTransactionTypeValue").val();
		competencyCertificateNum=$("#competencyCertificateNum").val();
		dateOfIssue=$("#dateOfIssue").val();
		dateOfExpiration=$("#dateOfExpiration").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
	    explosivesApplicationId = $("#explosivesApplicationId").val();
	    $.ajax({
		    type: "POST",
		    url: "${addToPendingAppUrl}",
		    data: {
			  "<portlet:namespace/>explosivesApplicationType":explosivesApplicationType,
			  "<portlet:namespace/>explosivesTransactionType": explosivesTransactionType,
			  "<portlet:namespace/>competencyCertificateNum": competencyCertificateNum,
		      "<portlet:namespace/>dateOfIssue": dateOfIssue,
		      "<portlet:namespace/>dateOfExpiration": dateOfExpiration,
		      "<portlet:namespace/>currentStage": currentStage,		      
		      "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
		      "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
		    },
		    success: function (data) {
		    	var result = data.APP_DATA;
		    	var explosivesAppId = result["explosivesApplicationId"];
		        $("#explosivesApplicationId").val(explosivesAppId); 
		    },
		    error: function (data) {},
		});
	}
	/* PAYMENT SUBMISSION */
	function submitFeeDetailsInExplosive(){
		    explosivesApplicationId=$("#explosivesApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paidAmount").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${explosiveFeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
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
				     var fileID = 'explosive-competency-payment-upload';
				     $.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${explosiveFeeDetailsUrl}",
			   		    fileElementId: 'explosive-competency-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		   	  "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
			   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			   			  "<portlet:namespace/>paymentFee": paymentFee,
			   		      "<portlet:namespace/>amountPaid": amountPaid,
		  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
			   		    },
			   		    success: function (data) { 
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
	
	//renew Licence
		 function renewLicense() {
			$("#explosives-renew-btn").attr("disabled", "disabled");
	        $("#explosiveLicenceNumberValidation").addClass("hide");
	        licenseNumber = $("#competencyCertificateNum").val();
	        explosivesApplicationType=$("#explosivesApplicationTypeValue").val();
	        dateOfIssue=$("#dateOfIssue").val();
			dateOfExpiration=$("#dateOfExpiration").val();
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber":licenseNumber,
	                        "<portlet:namespace/>explosivesApplicationType":explosivesApplicationType,
	                        "<portlet:namespace/>dateOfIssue":dateOfIssue,
	                        "<portlet:namespace/>dateOfExpiration":dateOfExpiration,
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                        if (validation == 0) {
	                                $("#explosiveLicenceNumberValidation").removeClass("hide");
	                                $("#explosives-renew-btn").removeAttr("disabled"); 
									$("#competencyCertificateNum").focus();
	                        }else{
	                       	 $('#explosives-renew-btn').prop('disabled', true);
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
	        });
		}
	//submit function
	
	function submitApplication(){
		explosivesApplicationType=$("#explosivesApplicationTypeValue").val();
		explosivesTransactionType=$("#explosivesTransactionTypeValue").val();
		competencyCertificateNum=$("#competencyCertificateNum").val();
		dateOfIssue=$("#dateOfIssue").val();
		dateOfExpiration=$("#dateOfExpiration").val();
	    explosivesApplicationId = $("#explosivesApplicationId").val();
	    $.ajax({
		    type: "POST",
		    url: "${addToSubmitAppUrl}",
		    data: {
			  "<portlet:namespace/>explosivesApplicationType":explosivesApplicationType,
			  "<portlet:namespace/>explosivesTransactionType": explosivesTransactionType,
			  "<portlet:namespace/>competencyCertificateNum": competencyCertificateNum,
		      "<portlet:namespace/>dateOfIssue": dateOfIssue,
		      "<portlet:namespace/>dateOfExpiration": dateOfExpiration,
		      "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
		    },
		    success: function (data) {
		        var result = data.APP_DATA;
		    	var appStatus = result["appStatus"];
				    if(appStatus=="submitted"){
				    	$("#continueDashboardExplosive").removeClass("hide");
				   		$("#submitted-content").removeClass("hide");
				   		$("#application_submitted-img").removeClass("hide");
				   	}else{
				   		$("#draft-content").removeClass("hide");
				   		$("#application_draft-img").removeClass("hide");
				   		/* $("#application_submitted-img").addClass("hide"); */
				   	}
				   	
				$(".custom_loader").addClass("hide");
				if(result!=null){
					$("#submit_pop_app_no").html(result["ExplosiveAppNum"]);
			    	$("#submit_pop_status").html(result["appStatus"]);
			    	$("#submit_pop_category").html(result["category"]);
			    	$("#submitted-status").html(result["category"]);
			    	
			    	
				}
		    },
		    error: function (data) {},
		});
	}
	function gettingDocumentList() {
		explosivesApplicationId = $("#explosivesApplicationId").val();
		explosivesTransactionType=$("#explosivesTransactionTypeValue").val();
			$
					.ajax({
						type : "POST",
						url : "${ExplosivesGettingDocumentListUrl}",
						data : {
							"<portlet:namespace/>explosivesApplicationId" : explosivesApplicationId,
							"<portlet:namespace/>explosivesTransactionType" : explosivesTransactionType,
						},
						 async:false,
						success : function(data) {
							$("#documentList").html(data);
						},
						error : function(data) {
						},
					});
			 validation();
	  }
	async function validation(){
		var explosivesApplicationId = "<%=explosivesApplicationId%>";
		if(explosivesApplicationId>0 ){
		  var requiredDoc = $("div[id='requiredDoc']").length;
		    filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    numberOfDocument = requiredDoc;

		    if (numberOfDocument != filledDocument) {
		        $("#explosivesSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    } else {
		        $("#explosivesSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		    }
	    
	}
	}
	function opendelDocPopup(fileEntry, counter) {
		$("#explosivesDocumentuploadCounter").val(counter);
		$("#deletepopup" + fileEntry).modal("show");
	}

	//download pdf
	function downloadPDF() {
		explosivesApplicationId=$("#explosivesApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${explosiveDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if (result && result["fileUrl"]) {
                        $("#explosivesDownloadPDF").attr("href", result["fileUrl"]);
                        $("#explosivesDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
        });
    }
	function deleteDocument(fileEntryId) {
		var explosivesDocumentuploadCounter = $("#explosivesDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${explosivesDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + explosivesDocumentuploadCounter).removeClass("disabled");
				$("#document-name" + explosivesDocumentuploadCounter).html("");
				$("#genericSupportingDocuments"+explosivesDocumentuploadCounter).addClass("hide");
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
	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#explosivesEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#explosivesDocumentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
	function supportingDocumentUpload() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#explosivesDocumentuploadCounter")
				.val();
		var fileID = 'explosivesEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'
				+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		explosivesApplicationId = $("#explosivesApplicationId").val();
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'explosivesEnrollDocuments',
					url : '${explosivesDoucumentsUpload}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>documentName" : documentName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>explosivesApplicationId" : explosivesApplicationId,
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
							$("#explosivesSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						}
					},
					error : function() {
					}
				});
	}
	$(function() {
		$(document).on('change', '#explosivesEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	
	$(document).ready(function () {
	    var selectedFiles = [];
	    var selectedGenericFiles = [];
	    
	    function updateFileInput() {
	        var newFileList = new DataTransfer();
	        for (var i = 0; i < selectedFiles.length; i++) {
	            newFileList.items.add(selectedFiles[i]);
	        }
	        $('#explosivesGenericUpload')[0].files = newFileList.files;
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

	    $(document).on('change', '#explosivesGenericUpload', function () {
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
	            var explosivesApplicationId = "<%=explosivesApplicationId%>";
	        	if(explosivesApplicationId > 0 ){
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
	        if (selectedFiles.length > 0){
	            $('.uploaded-delete').show();
	            $(".noAdditionalSupportingDoc").hide();
	            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	            $("#explosivesformPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        }else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#explosivesformPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	}
	
	function uploadDocuments(fileID,folderName,url) {
		explosivesApplicationId=$("#explosivesApplicationId").val();
		var fileID = fileID;
		 var fileInput = $("#" + fileID)[0]; // File input element
	   var fileLength = fileInput.files.length; // Count of selected files
	  var saveAndConCheck = $("#saveAndConCheck").val();
		
	//Decide what to send to the backend
	  var fileData = fileLength > 0 ? fileID : "0";

	  // Show loader
	  $("#explosivesformPreviewFieldset .custom_loader").removeClass("hide");
	  $(".preview-section").addClass("hide");
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : fileID,
			url : '${explosivesGenericSupportingDocUrl}',
			dataType : 'text',
			data : {
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>folderName": folderName,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>explosivesApplicationId" : explosivesApplicationId,
				"<portlet:namespace/>saveAndConCheck": saveAndConCheck,
			},
			success: function(data) {
	            try {
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
		                    $(".noAdditionalSupportingDoc").addClass("hide");
						});
					}}else{
						$(".noAdditionalSupportingDoc").removeClass("hide");
						$.each(parsedData.fileData, function(index, entry) {
			        	    $("."+fileID).html(fileTitle); // Set file title
			        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
			        	});}
	     	        } catch (e) {
	                console.error("Error parsing response data: ", e);
	            }
				$("#explosivesformPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	            $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });

	        },
	        error: function(data, status, e) {
	            console.error("Error during file upload", e);
	        }
	    });
	}
	function saveToDraft(){
		explosivesApplicationType=$("#explosivesApplicationTypeValue").val();
		explosivesTransactionType=$("#explosivesTransactionTypeValue").val();
		competencyCertificateNum=$("#competencyCertificateNum").val();
		dateOfIssue=$("#dateOfIssue").val();
		dateOfExpiration=$("#dateOfExpiration").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
	    explosivesApplicationId = $("#explosivesApplicationId").val();
	    if(currentStage=="APPLICATION FORM DETAILS"){
	    	uploadDocuments('blasterApplicantSignatureBtn','Signature of Applicant','explosivesGenericSupportingDocUrl');
			uploadDocuments('blasterApplicantImageBtn','Image of Applicant','explosivesGenericSupportingDocUrl');
	    	addBlasterDetailInfo();
	    }
		if(currentStage == "SUPPORTING DOCUMENTS"){
			uploadDocuments("explosivesGenericUpload","Generic Documents");	
		   }
		   if(currentStage=="APPLICATION FEES PAYMENT"){
			   submitFeeDetailsInExplosive();
			  }
	    $.ajax({
		    type: "POST",
		    url: "${draftExplosiveAppUrl}",
		    data: {
			  "<portlet:namespace/>explosivesApplicationType":explosivesApplicationType,
			  "<portlet:namespace/>explosivesTransactionType": explosivesTransactionType,
			  "<portlet:namespace/>competencyCertificateNum": competencyCertificateNum,
		      "<portlet:namespace/>dateOfIssue": dateOfIssue,
		      "<portlet:namespace/>dateOfExpiration": dateOfExpiration,
		      "<portlet:namespace/>currentStage": currentStage,		      
		      "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
		      "<portlet:namespace/>explosivesApplicationId": explosivesApplicationId,
		    },
		    success: function (data) {
		    	var result = data.APP_DATA;
		    	var explosivesAppId = result["explosivesApplicationId"];
		   	  	  $("#pop_app_no").html(result["ExplosiveAppNum"]);
			      $("#pop_status").html(result["appStatus"]);
			      $("#pop_category").html(result["category"]);
			      $("#draft-status").html(result["category"]);
			      $("#explosivesApplicationId").val(explosivesAppId); 		       
		    },
		    error: function (data) {},
		});
	}
	
	function deleteGenericDocument(fileEntryId) {
		var documentuploadCounter = $("#explosivesDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${explosivesDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentChecklist" + documentuploadCounter).removeClass("hide");
				$("#documentUpload"+documentuploadCounter).removeClass("disabled");
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
			},
			error : function(data) {

			}
		});
	}
	
	function deleteDocumentFee(fileEntryId) {
		var documentuploadCounter = $("#explosivesDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${explosivesDeleteDocumentUrl}',
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
	     
	        $("#explosive-competency-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    } else {
	        // Otherwise, disable the upload button
	    	$("#explosive-competency-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    }
	}
</script>