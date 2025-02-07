<portlet:resourceURL var="miicPendingUrl" id="/miic/pending"></portlet:resourceURL>
<portlet:resourceURL var="miicGettingDocumentListUrl" id="/miic/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="miicDoucumentsUpload" id="/miic/document/upload"></portlet:resourceURL>
<portlet:resourceURL var="miicDeleteDocumentUrl" id="/miic/delete/document"></portlet:resourceURL>
<portlet:resourceURL var="submitMiicApplicationUrl" id="/submit/miic/application"></portlet:resourceURL>
<portlet:resourceURL var="miicGenericSupportingDocUrl" id="/upload/documents/in/miic"></portlet:resourceURL>
<portlet:resourceURL var="addMiicDownloadPdfUrl" id="/pdf/download/miic"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renewLicenseUrl/miic"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for</p>
							<p class="common-banner-title f1 mb-0">MIIC(CET and Safeguard Mechanism)</p>
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
								<li class="active farm">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">
										TYPE OF APPLICATION</p> <span></span>
								</li>
								<li class="farm">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">
										MIIC CATEGORY TYPE</p> <span></span>
								</li>
								<li class="form-section farm ">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="farm rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">Supporting Documents</p> <span></span>
								</li>
							    <li style="display:none" class="last-step">
                                    <span></span>
                                </li>
							</ul>
							 <input type="hidden" id="miicApplicationId" name="miicApplicationId" value=""> 
							 <input type="hidden" id="miicCurrentStage" name="miicCurrentStage">
							 <input type="hidden" id="dashboardUrl" name="dashboardUrl" value="">
							 <input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							 <input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=miicApplicationId%>">
						</div>
						<%@ include file="/type-of-application/miic-application-type.jsp"%>
 						<%@ include file="/type-of-registration/miic-registration-type.jsp"%>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/miic-documents.jsp" %>
                        <%@ include file="/preview/final-preview-tabs.jsp"%>
                        <%@ include file="/miic-final-submission.jsp" %>
                        
					</form>
				</div>
			</div>
		</div>
	</div>
</section>


<script>
var filledDocument = "";
var numberOfDocument = "";
  $("#miic-application-type-box .wizard-card").click(function(){
	$("#miic-application-type-box .wizard-card").removeClass("active");
	$(".application-type-card-content").children().children().removeClass("text-white");
	$(this).addClass("active");
	$(this).find(".application-type-card-content").children().children().addClass("text-white");
	$("#miic-type-option-value").val($(this).find(".wizard-title span").html());
	$("#miicTransactionFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	$("#miicRegistrationTypeBox .wizard-card").removeClass("active");
	$("#miicTransationTypeBox .wizard-card").removeClass("active");
	if($("#miic-type-option-value").val() == 'Suspension of CET'){
		$("#miicRegistrationTypeBox, .cet-option, #miicProcessCetForm, #miicProcessCetPreview").removeClass("hide");
		$("#miicTransationTypeBox, .safeguard-option, #miicProcessSafeguardForm, #miicProcessSafeguardPreview").addClass("hide");
		$(".miicProcessTypeFormTab").html("Suspension of CET");
		$(".supporting-doc-preview").removeClass("hide");
		return $(".suspension-cet-ins").removeClass("hide");
		// $(".draft-application-type").html("Suspension of CET");
	}else{
		$("#miicRegistrationTypeBox, .cet-option, #miicProcessCetForm, #miicProcessCetPreview").addClass("hide");
		$("#miicTransationTypeBox, .safeguard-option, #miicProcessSafeguardForm, #miicProcessSafeguardPreview").removeClass("hide");
		$(".miicProcessTypeFormTab").html("Safeguard Mechanism");
		$(".supporting-doc-preview").removeClass("hide");
		return $(".safeguard-ins").removeClass("hide");
		// $(".draft-application-type").html("Safeguard Certification");
	}
	$("#miicCategoryTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#miicRenewSection").addClass("hide");
});  

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
}); 

/*set the value of type of Manufacturer*/
$("#miicRegistrationTypeBox .wizard-card").click(function () {
  $("#miicOptionValue").val($(this).find(".wizard-title").html());
});	
	
/*set the value of type of Transaction*/
$("#miicTransationTypeBox .wizard-card").click(function () {
	  $("#project-type-option-value").val($(this).find(".wizard-title").html());
	});	
 var miicTypeCount = 1;
 var manufacturereRegTypeCount = 1;
 var manufacturereUnRegTypeCount = 1;
 var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function () {
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        
        /* Scroll Page to top */
        scrollToPageTop();
        
        if(currentFieldSet == "miicFormsFieldset"){
        	var requiredDoc = $("div[id='requiredDoc']").length;
        	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
        	if(requiredDoc >= 1){
        		$(".mandatory-doc-heading").removeClass("hide");
        		numberOfDocument = requiredDoc;
        		if(numberOfDocument != filledDocument){
            		$("#miicSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
            	}
        	}
        	currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
				if(currentFormToSave == "Suspension of CET"){
	    			addCetSuspensionDetailBox();
	    		}else if(currentFormToSave == "Safeguard Mechanism"){
	    			addMaterialRequiredDetailBox();
	    			addGoodsProducedDetailBox();
	    		}
				pendingMiicApplication();
        }
        if(currentFieldSet == "miicSupportingDocumentFieldset"){
        	uploadGenericDocumentsInMiic("Generic Documents");
        	showFinalSubmitButton(); 
        	finalPreviewScroll();
            previewApplicantDetailInfo();
            previewMiicSuspensionOfCetForm();
            downloadPDF();
			showDocsPreview(miicTypeCount);
            miicTypeCount++;
			pendingMiicApplication();
        }  
        
        if(currentFieldSet=="miicCategoryTypeFieldset"){
        	pendingMiicApplication();
        	gettingDocumentList(); 
        	activeSelectForm();
        	mainAddress = $("#mainAddress").val();
            mainEmail = $("#mainEmail").val();
        	miicType = $("#miic-type-option-value").val();
        	if(miicType == "Suspension of CET"){
        		mainApplicantName = $("#mainApplicantName").val();
        		if(mainAddress && mainEmail && mainApplicantName){
        			$("#miicFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
        		}else{
        			$("#miicFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        		}
        	}else{
        		mainProducerName = $("#mainProducerName").val();
        		if(mainAddress && mainEmail && mainProducerName){
        			$("#miicFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
        		}else{
        			$("#miicFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
        		}
        	}
			
        }
       if($("#miic-type-option-value").val() == "Suspension of CET" && currentFieldSet=="miicFormsFieldset"){
    	   addMiicSuspensionOfCetForm();
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
					 $("#film-form-tabs.jsp").find(".tab-pane.active").next(".tab-pane").find(".tab-form-title").each(function () {
						 selectedDraftFormsToSave.push($(this).html());
				    });
					 console.log(selectedDraftFormsToSave);
					var $active = $('.nav-tabs li>.active');
					$active.parent().next().find('.nav-link')
							.removeClass('disabled');
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
    function showFinalSubmitButton(){
    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    	if(currentFieldSet == "miicSupportingDocumentFieldset" || currentFieldSet == "miicPreviewFieldset"){
            	$(".form-wizard-next-btn ").hide();
            	$(".form-wizard-save-btn").hide();
            	$(".final-submit").removeClass("hide");
            }else{
            	$(".form-wizard-next-btn").show();
            	$(".form-wizard-save-btn").show();
            	$(".final-submit").addClass("hide");
            }
    }
	$("#company-detail-edit-tab").click(function(){
	   $('#MiicformPreviewFieldset').removeClass("show");
	   $('#MiicFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
       $(".final-submit").addClass("hide");
       $(".final-submit-container").addClass("hide");
       $("#applicantDetailTab").trigger("click");
       $(".form-section").addClass("active");
       $(".rm, .form-section").removeClass("activated");
       scrollToPageTop();
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
   function finalSubmitMiicApp(){
	   submitMiic();
		 $(".final-submit-container").removeClass("hide");	
	}
   
   function pendingMiicApplication(){
	     miicApplicationId=$("#miicApplicationId").val();
		 miicApplciation=$("#miic-type-option-value").val();
		 typeOfManufacturer=$("#miicOptionValue").val();
		 typeOfTransaction=$("#project-type-option-value").val();
		 currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 $.ajax({
			    type: "POST",
			    url: "${miicPendingUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>miicApplicationId": miicApplicationId,
			    	  "<portlet:namespace/>miicApplciation": miicApplciation,
			    	  "<portlet:namespace/>typeOfManufacturer": typeOfManufacturer,
			    	  "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			    	  "<portlet:namespace/>currentFormToSave": currentFormToSave,
			    	  "<portlet:namespace/>currentStage": currentStage,
			    	  "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,

			    	  
			      		    },
   		    async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	$("#miicApplicationId").val(result["miicApplicationId"]);
	 	    	},
				 error: function (data) {
			    },
			  });
	}
 function gettingDocumentList() {
	    miicApplciation=$("#miic-type-option-value").val();
	    typeOfManufacturer=$("#miicOptionValue").val();
	    miicApplicationId=$("#miicApplicationId").val();
		$
				.ajax({
					type : "POST",
					url : "${miicGettingDocumentListUrl}",
					data : {
						"<portlet:namespace/>miicApplciation" : miicApplciation,
						"<portlet:namespace/>typeOfManufacturer" : typeOfManufacturer,
						"<portlet:namespace/>miicApplicationId" : miicApplicationId,
					},
					success : function(data) {
						$("#documentList").html(data);
						var miicApplicationId = '<%=miicApplicationId%>';
						if (miicApplicationId > 0) {
								numberOfDocument = $("div[id='requiredDoc']").length;
								filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;

								if (numberOfDocument != filledDocument) {
									$("#ogtSupportingDocumentFieldset #save-continue").css({
										"opacity": "0.4", 
										"pointer-events": "none", 
										"cursor": "default"
									});
								} else {
									$("#ogtSupportingDocumentFieldset #save-continue").css({
										"opacity": "1", 
										"pointer-events": "auto", 
										"cursor": "pointer"
									});
								}
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
		$("#ncraEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#ncraDocumentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
 function supportingDocumentUpload(){
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#ncraDocumentuploadCounter")
				.val();
		var fileID = 'ncraEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'
				+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		miicApplicationId=$("#miicApplicationId").val();
		$.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'ncraEnrollDocuments',
					url : '${miicDoucumentsUpload}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>documentName" : documentName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>miicApplicationId" : miicApplicationId,
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
						filledDocument = $("#documentList .supporting-document-card").find(".uploaded-info").length;
			            console.log("filledDocument-------"+filledDocument);
			            if(numberOfDocument == filledDocument){
			            	$("#miicSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			            }	
					},
					error : function() {
					}
				});
	}
	$(function() {
		$(document).on('change', '#ncraEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	
	function opendelDocPopup(fileEntry, counter) {
		$("#ncraDocumentuploadCounter").val(counter);
		$("#deletepopup" + fileEntry).modal("show");
	}
	
	function deleteDocument(fileEntryId) {
		var ncraDocumentuploadCounter = $("#ncraDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${miicDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + ncraDocumentuploadCounter).removeClass(
						"disabled");
				$("#document-name" + ncraDocumentuploadCounter).html("");
				var requiredDoc = $("div[id='requiredDoc']").length;
				var notRequireDoc = $("div[id='notRequiredDoc']").length;
			    if(requiredDoc >= 1){
			    if(ncraDocumentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + ncraDocumentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#miicSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				}
				}
				if(notRequireDoc >= 1){
					$("#nonRequireDocNamePreview" + ncraDocumentuploadCounter).html("");
				}
			},
			error : function(data) {

			}
		});
	}
   $("#applicant-details-edit-tab").click(function(){
	   $('#miicPreviewFieldset').removeClass("show");
	   $('#miicFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#applicantDetailTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
   $("#process-details-edit-tab").click(function(){
	   $('#miicPreviewFieldset').removeClass("show");
	   $('#miicFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#processDetailsTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
   $("#supporting-doc-edit-tab").click(function(){
	   $('#miicPreviewFieldset').removeClass("show");
	   $('#miicSupportingDocumentFieldset').addClass("show", "400");
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
   function activeSelectForm(){
		$(".miic-application-forms .tab-pane").removeClass("active");
		$(".miic-application-forms .tab-pane:first").addClass("active");
		$(".miic-form-tabs .nav-link").removeClass("active");
		$(".miic-form-tabs .nav-link:first").addClass("active");
	}
   	
   
	function submitMiic(){
		 miicApplciation=$("#miic-type-option-value").val();
		 typeOfManufacturer=$("#miicOptionValue").val();
		 typeOfTransaction=$("#project-type-option-value").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 miicApplicationId=$("#miicApplicationId").val();
		   $.ajax({
			    type: "POST",
			    url: "${submitMiicApplicationUrl}",
			    data: {
			      "<portlet:namespace/>miicApplciation": miicApplciation,
				  "<portlet:namespace/>typeOfManufacturer": typeOfManufacturer,
			      "<portlet:namespace/>typeOfTransaction": typeOfTransaction,
			      "<portlet:namespace/>currentStage": currentStage,
			      "<portlet:namespace/>miicApplicationId": miicApplicationId,
			    },
			    success: function (data) { 
			    var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
			    	 if(appStatus=="submitted"){
					   		$("#miicDashboardButtonFinalContainer").removeClass("hide");
					   		$("#submitted-content").removeClass("hide");
					   		$("#application_submitted-img").removeClass("hide");
					   	}else{
					   		$("#draft-content").removeClass("hide");
					   		$("#application_draft-img").removeClass("hide");
					   	}
			      $("#dashboardUrl").val(result["dashboardUrl"]);
			      $("#miicApplicationId").val(result["miicAppicationId"]);
			      $("#submit_pop_app_no").html(result["miicAppNo"]);
			      $("#submit_pop_status").html(result["appStatus"]);
			      $("#submit_pop_category").html(result["category"]);
			      $("#category").html(result["category"]);
			 	  $(".custom_loader").addClass("hide");
		    	  $(".final-submit-content").css({"opacity":"1"}); 
	    	    },
			    error: function (data) {},
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
	        $('#miicGenericUpload')[0].files = newFileList.files;
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

$(document).on('change', '#miicGenericUpload', function () {
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
	            var miicApplicationId = "<%=miicApplicationId%>";
	        	if(miicApplicationId > 0 ){
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
	            $("#miicPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#miicPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});
	
function uploadGenericDocumentsInMiic(folderName) {
	    var saveAndConCheck = $("#saveAndConCheck").val();
		miicApplicationId=$("#miicApplicationId").val();
		var fileID = 'miicGenericUpload';
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : 'miicGenericUpload',
			url : '${miicGenericSupportingDocUrl}',
			dataType : 'text',
			data : {
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>folderName": folderName,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>saveAndConCheck" : saveAndConCheck,
			},
			success: function (data) {
				 $(".additionalDocPreviewOne, #additionalDocPreview").html("");
		        	var parsedData = JSON.parse(data);
		        	 try{
		        		var parsedData = typeof data === "string" ? JSON.parse(data) : data;
	        	        var jsonArrayLength = parsedData.length
        	            var responseData = parsedData.filter((value, index, self) =>
	        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
	        	        );}catch(error){}
	        	if (jsonArrayLength > 0){
              	var counter = 1;
					$.each(responseData,function(key,entry){
						console.log(entry.fileName);
						console.log("File name is - "+entry.fileName);
						console.log("File URL is - "+entry.downloadFileUrl);
						var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
						documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
		                $('#additionalDocPreview').append(documentContainerPreview);		
		                counter++;    
		                $(".noAdditionalSupportingDoc").addClass("hide");
					});
				}else{
					$(".noAdditionalSupportingDoc").removeClass("hide");
				}
              $("#miicPreviewFieldset .custom_loader").addClass("hide");
              $(".preview-section").removeClass("hide");
              $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
              
			},
			error: function (data, status, e) {
			}
		});
}
	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+currentId).remove();
	}
	function openSaveToDraftPopupMiic(){
		 $(".savecountinuePopup").modal("show");
	     miicApplicationId=$("#miicApplicationId").val();
		 miicApplciation=$("#miic-type-option-value").val();
		 typeOfManufacturer=$("#miicOptionValue").val();
		 typeOfTransaction=$("#project-type-option-value").val();
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
 		if(currentFormToSave == "Applicant Details"){
 			addMiicApplicantFormInfo(true);
		}else if(currentFormToSave == "Suspension of CET"){
			addCetSuspensionDetailBox();
			addMiicSuspensionOfCetForm();
		}else if(currentFormToSave == "Safeguard Mechanism"){
			addMaterialRequiredDetailBox();
			addGoodsProducedDetailBox();
		}
		saveAndContinue = "true"; 
		$.ajax({type : "POST",
					url : "${miicPendingUrl}",
					data : {
						"<portlet:namespace/>miicApplicationId" : miicApplicationId,
						"<portlet:namespace/>miicApplciation" : miicApplciation,
						"<portlet:namespace/>typeOfManufacturer" : typeOfManufacturer,
						"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
						"<portlet:namespace/>currentFormToSave" : currentFormToSave,
						"<portlet:namespace/>currentStage" : currentStage,
						"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
						"<portlet:namespace/>saveAndContinue" : saveAndContinue,
					},
					async : false,
					success : function(data) {
						var result = data.APP_DATA;
						$("#miicApplicationId").val(result["miicApplicationId"]);
						var applicationNumber = result["miicAppNo"];
						var category = result["category"];
						if (applicationNumber != null && category != null) {
							$("#pop_app_no").html(result["miicAppNo"]);
							$("#pop_category").html(result["category"]);
							$(".draft-application-type").html(result["category"]);
						}
					},
					error : function(data) {
					},
				});
	}	
	function miicDeleteDocumentForGeneric(fileEntryId) {
		var documentuploadCounter = $("#ncraDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${miicDeleteDocumentUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
				$("#documentUpload" + documentuploadCounter).removeClass("disabled");
			},
			error : function(data) {

			}
		});
	}

	function downloadPDF() {
		miicApplicationId=$("#miicApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${addMiicDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>miicApplicationId": miicApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        $("#miicDownloadPDF").attr("href", result["fileUrl"]);
                        $("#miicDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                },
                error: function(data) {},
        });
    }
	
	function renewalLicense() {
		$("#miic-renew-btn").attr("disabled", "disabled");
        $("#renewLicenseNumbervalidation").addClass("hide");
        transactionNumber = $("#renew-licence-number").val();
        certificateNumber = $("#renew-permit-number").val();
        $.ajax({
                type: "POST",
                url: '${renewLicenseUrl}',
                data: {
                        "<portlet:namespace/>transactionNumber": transactionNumber,
                        "<portlet:namespace/>certificateNumber": certificateNumber,
                },
                success: function(data) {
                	var result = data.APP_DATA;
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var validation=result["transactionNumberCheck"];
                	console.log(validation);
                        if (validation == 0) {
                        	 $("#renewLicenseNumbervalidation").removeClass("hide");
                             $("#miic-renew-btn").removeAttr("disabled");
                        }else{
                        	window.location.href = renewLicenseUrl;
                        }
                },
                error: function(data) {}
        });
	}
	 function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
		    miicApplicationId=$("#miicApplicationId").val();
			saveAndCon='<%=miicApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>miicApplicationId": miicApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
				
			}
		}
</script>