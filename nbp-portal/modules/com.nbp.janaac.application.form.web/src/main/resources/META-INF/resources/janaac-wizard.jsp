<portlet:resourceURL var="janaacApplicationGettingDocumentList" id="/janaac/document/list"></portlet:resourceURL>
<portlet:resourceURL var="janaacDownloadPDFUrl" id="/janaac/download/pdf"></portlet:resourceURL>
<portlet:resourceURL var="submitFeeDetailsInJanaacUrl" id="/submit/fee/detail/in/janaac"></portlet:resourceURL>
<portlet:resourceURL var="janaacDeleteDocumentUrl" id="/janaac/Delete/Document"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for</p>
							<p class="common-banner-title f1 mb-0">Accreditation</p>
							<p class="common-banner-info f2 mb-3">JANAAC was established as Jamaica's national accreditation body in order to provide 
							accreditation services to conformity assessment bodies (CABs), such as laboratories, inspection bodies and certification bodies.</p>
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
									<p class="application-form-lower-heading">Type of Accreditation</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">Type of Transaction</p> <span></span>
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
							 <input type="hidden" id="janaacApplicationId" name="janaacApplicationId" value=""> 
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true"> 
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=janaacApplicationId%>">
						</div>
						<%@ include file="/type-of-services/janaac-services-type.jsp"%>
						<jsp:include page="/type-of-transaction/janaac-transaction-type.jsp"/>
						<jsp:include page="/forms/form-tabs.jsp"/>
						<%@ include file="/supporting-documents/janaac-documents.jsp"%>
						<%@ include file="/janaac-fee-payment.jsp"%>
						<jsp:include page="/preview/final-preview-tabs.jsp"/>
						<jsp:include page="/janaac-final-submission.jsp"/>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>

var docRenderCount=1;
var filledDocument = "";
var numberOfDocument = "";
var accMedicalLabCounter=1;
var accTestingCaliberationLabCounter=1;
var certBodies17021Counter=1;
var certBodies17065Counter=1;
var certBodies17024Counter=1;
var inspectionBodiesCounter=1;
var fdaAprovalCounter=1;
var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function () {
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        scrollToPageTop();
        laboratoriesAccreditationVal=$("#laboratoriesAccreditationVal").val();
        inspectingAccreditationVal=$("#inspectingAccreditationVal").val();
        certificationAccreditationVal=$("#certificationAccreditationVal").val();
        if(currentFieldSet == "janaacServicesTypeFieldset"){
        	accreditationType = $("#accreditationTypeVal").val();
        	if(accreditationType == "Accreditation for Labs" || accreditationType == "Accreditation for Inspection Bodies"){
        		$(".transactionTypeFirst").addClass("hide");
        		$(".transactionTypeSecond").removeClass("hide");
        	}
        	else{
        		$(".transactionTypeFirst").removeClass("hide");
        		$(".transactionTypeSecond").addClass("hide");
        	}
        /* 	pendingJanaacApplication(); */
			if(accreditationType=="Accreditation for Labs"){
			    	typeOFAccreditationService=$("#laboratoriesAccreditationVal").val();	
					if(typeOFAccreditationService=="Accreditation of Medical Labs to the ISO 15189 Standard"){
						if(accMedicalLabCounter==1){
							gettingDocumentList();
						}
						accMedicalLabCounter++;
					}
					else if((typeOFAccreditationService=="Accreditation of Testing Labs to the ISO/IEC 17025 Standard")||(typeOFAccreditationService=="Accreditation of Calibration Labs to the ISO/IEC 17025 Standard")){
						if(accTestingCaliberationLabCounter==1){
							gettingDocumentList();
						}
						accTestingCaliberationLabCounter++;
					}
			}
			 if(accreditationType=="Accreditation for Certification Bodies"){
			    	typeOFAccreditationService=$("#certificationAccreditationVal").val();	
					if(typeOFAccreditationService=="Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
						if(certBodies17021Counter==1){
							gettingDocumentList();
						}
						certBodies17021Counter++;
					}
					else if(typeOFAccreditationService=="Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
						if(certBodies17065Counter==1){
							gettingDocumentList();
						}
						certBodies17065Counter++;
					}
					else if(typeOFAccreditationService=="Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
						if(certBodies17024Counter==1){
							gettingDocumentList();
						}
						certBodies17024Counter++;
					}
			}
			 if(accreditationType=="Accreditation for Inspection Bodies"){
			    	typeOFAccreditationService=$("#inspectingAccreditationVal").val();	
					if(typeOFAccreditationService=="Accreditation of Inspection Bodies to the ISO/IEC 17020 Standard"){
						if(inspectionBodiesCounter==1){
							gettingDocumentList();
						}
						inspectionBodiesCounter++;
					}
			}
			 if(accreditationType=="FDA Approvals"){
			    	typeOFAccreditationService=$("#thirdPartyAccreditationVal").val();	
					
					if(typeOFAccreditationService=="FDA TPP Accreditation of 3rd Party Certification Bodies Under the FDA-Food Safety Modernisation Act (FSMA)"){
						if(fdaAprovalCounter==1){
							gettingDocumentList();
						}
						fdaAprovalCounter++;
					}
			}
        }
		if(currentFieldSet == "janaacTransactionTypeFieldset"){
			janaacTransactionTypeVal = $("#janaacTransactionTypeVal").val();
			if(janaacTransactionTypeVal == "Initial Accreditation"){
				$('#janaacFormsFieldset input[type=radio][value="1st Accreditation"]').attr("checked", "true");
			}
			else{
				$('#janaacFormsFieldset input[type=radio][value="' + janaacTransactionTypeVal + '"]').attr("checked", "true");
			}
			activeSelectForm();
			pendingJanaacApplication(); 
			accreditationType = $("#accreditationTypeVal").val();
			if(accreditationType == "Accreditation for Labs"){
				laboratoriesAccreditation = $("#laboratoriesAccreditationVal").val();
				if(laboratoriesAccreditation == "Accreditation of Medical Labs to the ISO 15189 Standard"){
					applicantName=$("#applicantName").val();
					authorizedPersonnelName=$("#authorizedPersonnelName").val();
					if(authorizedPersonnelName != "" && applicantName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(laboratoriesAccreditation == "Accreditation of Testing Labs to the ISO/IEC 17025 Standard"){
					applicantName=$("#testingApplicantName").val();
					authorizedPersonnelName=$("#testingAuthorizedPersonnelName").val();
					if(applicantName != "" && authorizedPersonnelName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(laboratoriesAccreditation == "Accreditation of Calibration Labs to the ISO/IEC 17025 Standard"){
					applicantName=$("#calibrationApplicantName").val();
					authorizedPersonnelName=$("#calibrationAuthorizedPersonnelName").val();
					if(applicantName != "" && authorizedPersonnelName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
			}
			if(accreditationType == "Accreditation for Certification Bodies"){
				certificationAccreditation = $("#certificationAccreditationVal").val();
				if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
					applicantName=$("#applicantNameCertification").val();
					authorizedPersonnelName=$("#authorizedPersonnelManagementName").val();
					if(applicantName != "" && authorizedPersonnelName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
					applicantName=$("#applicantNameCerProduct").val();
					authorizedPersonnelName=$("#authorizedPersonnelCerProductName").val();
					if(applicantName != "" && authorizedPersonnelName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(certificationAccreditation == "Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
					applicantNameCerBodies=$("#applicantNameCerBodies").val();
					authorizedPersonnelName=$("#authorizedPersonnelCerBodiesName").val();
					if(applicantNameCerBodies != "" && authorizedPersonnelName != ""){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#janaacFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
			}
			if(accreditationType == "Accreditation for Inspection Bodies"){
				accreditationTypeVal = $("#accreditationTypeVal").val();
				$("#janaacFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				if(accreditationTypeVal == "Accreditation for Inspection Bodies"){
					applicantNameInsBodies = $("#applicantNameInsBodies").val();
					if(applicantNameInsBodies){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
				}
			}
			if(accreditationType == "FDA Approvals"){
				accreditationTypeVal = $("#accreditationTypeVal").val();
				$("#janaacFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
					if(accreditationTypeVal == "FDA Approvals"){
						applicantNameThirdParty = $("#applicantNameThirdParty").val();
					if(applicantNameThirdParty){
						$("#janaacFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
				}	
			}
		}
		
		if(currentFieldSet == "janaacSupportingDocumentFieldset"){
			uploadDocuments('janaacGenericUpload',"Generic Documents");
			pendingJanaacApplication();
		}
		if(currentFieldSet=="janaacFormsFieldset"){
			if(laboratoriesAccreditationVal=="Accreditation of Medical Labs to the ISO 15189 Standard"){
			accMediLabOtherReq();
			}
			else if(laboratoriesAccreditationVal=="Accreditation of Testing Labs to the ISO/IEC 17025 Standard"){
			accMediLabTestOtherReq();
			}
			else if(laboratoriesAccreditationVal=="Accreditation of Calibration Labs to the ISO/IEC 17025 Standard"){
			accMediLabCalibrationOtherReq();
			}
			else if(inspectingAccreditationVal=="Accreditation of Inspection Bodies to the ISO/IEC 17020 Standard"){
				accInsBodiesOtherReq();
			}
			else if(certificationAccreditationVal=="Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
				accCerBodiesOtherReq();
			}
			else if(certificationAccreditationVal=="Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
				accCerBodiesProductOtherReq();
			}
			else if(certificationAccreditationVal=="Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
				accCertiBodiesOtherReq();
			}
			var requiredDoc = $("div[id='requiredDoc']").length;
			filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
			if(requiredDoc >= 1){
				$(".mandatory-doc-heading").removeClass("hide");
				numberOfDocument = requiredDoc;
				if(numberOfDocument != filledDocument){
		    		$("#janaacSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    	}
			}
			pendingJanaacApplication();
		}
		if(currentFieldSet == "janaacfeePaymentFieldset"){
			showDocsPreview(docRenderCount);
			docRenderCount++;
			submitFeeDetailsInJanaac();
			uploadDocuments('janaacGenericUpload',"Generic Documents");
			showFinalSubmitButton();
			finalPreviewScroll();
			previewMedicalApplicationInfo();
			previewMedicalActivityDescInfo();
			previewMedicalOrganizationDescInfo();
			previewMedicalPhysicalResInfo();
			previewMedicalManagementInfo();
			previewMedicalOtherReqInfo();
			previewThirdPartyScope();
			previewMethod();
			$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());
			pendingJanaacApplication();
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
	});  
	function submitFeeDetailsInJanaac(){
		janaacApplicationId=$("#janaacApplicationId").val();
	    paymentMethod = $("#paymentMethod").val();
	    paymentFee = $("#paymentFee").val();
	    amountPaid=$("#amountPaid").val();
	    amountCurrency=$("#amountCurrency").val();
	    if(paymentMethod=="Credit Card"){
		    $.ajax({
		        type: "POST",
		        url: '${submitFeeDetailsInJanaacUrl}',
		        data: {
		          "<portlet:namespace/>janaacApplicationId": janaacApplicationId,
	  		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
	              "<portlet:namespace/>paymentFee": paymentFee, 
	              "<portlet:namespace/>amountPaid": amountPaid,
	      		  "<portlet:namespace/>amountCurrency": amountCurrency,
		        },
		        success: function (data) {
		            $("#janaacDeletepopup"+fileEntryId).modal("hide");
		            $("#unpload-info-card"+fileEntryId).remove();
		        },
		        error: function (data) {
		        }
		    });
	    }else{
			     var fileID = 'payment-upload';
		   		$.ajaxFileUpload({
		   		    secureuri: false,
		   		    method: "POST",
		   		    url: "${submitFeeDetailsInJanaacUrl}",
		   		    fileElementId: 'payment-upload',
		   		    dataType: 'text',
		   		    data: {
		   		      "<portlet:namespace/>fileID": fileID,
		   		      "<portlet:namespace/>command": "fileUpload",
		   		      "<portlet:namespace/>janaacApplicationId": janaacApplicationId,
		   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
		   			  "<portlet:namespace/>paymentFee": paymentFee,
		   		      "<portlet:namespace/>amountPaid": amountPaid,
	  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
		   		    },
		   		    success: function (data) {
		   		        downloadPDF();
					    var parsedData = JSON.parse(data);
		   		    	$.each(parsedData,function(key,entry){
							// Append the download URL to the specified element
							var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
				            $("#payment-upload-preview").html(entry.fileName);
							$("#payment-upload-preview").attr("href", decodedUrl);
		   		    	});

		   		    },
		   		    error: function (data) {},
		   		  });
	     }
	}
	   function downloadPDF() {
	    	    janaacApplicationId=$("#janaacApplicationId").val();
	    		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
	    		$.ajax({
	    			type : "POST",
	    			url : "${janaacDownloadPDFUrl}",
	    			data : {
	    				 "<portlet:namespace/>janaacApplicationId": janaacApplicationId,
	                     "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
	    			},
	    			success : function(data) {
	    				  var result = data.APP_DATA;
	                      $("#janaacDownloadPDF").attr("href", result["fileUrl"]);
	                      $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
	    			},
	    			error : function(data) {
	    			},
	    		});
	          
	      } 
	   function opendelDocPopup(fileEntry, counter) {
			$("#documentuploadCounter").val(counter);
			$("#janaacDeletepopup" + fileEntry).modal("show");
		}
	   function deleteDocumentFee(fileEntryId) {
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${janaacDeleteDocumentUrl}',
				data : {
					"<portlet:namespace/>fileEntryId" : fileEntryId,
				},
				success : function(data) {
					$("#janaacDeletepopup" + fileEntryId).modal("hide");
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
		     
		        $("#payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		    } else {
		        // Otherwise, disable the upload button
		    	$("#payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		    }
		}
		function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
		    janaacApplicationId=$("#janaacApplicationId").val();
			saveAndCon='<%=janaacApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>janaacApplicationId": janaacApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
			}
		}
  </script>
