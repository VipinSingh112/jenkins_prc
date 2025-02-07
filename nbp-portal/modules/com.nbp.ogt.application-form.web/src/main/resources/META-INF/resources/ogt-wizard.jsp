<portlet:resourceURL var="ogtPendingUrl" id="/ogt/pending"></portlet:resourceURL>
<portlet:resourceURL var="ogtSubmitApplicationUrl" id="/submit/ogt/application"></portlet:resourceURL>
<portlet:resourceURL var="ogtDraftApplicationUrl" id="/draft/ogt/application"></portlet:resourceURL>
<portlet:resourceURL var="ogtDownloadPDFUrl" id="/ogt/download/pdf"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<!-- <p class="common-banner-upper-title f2 mb-0">Application for</p> -->
							<p class="common-banner-title f1 mb-0">OGT(Office of Government Trustee)</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support" class="common-banner-transparent-link f2 d-inline-block">
								Need help in your application?
								<span class="ml-2">
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20"
										fill="none">
										<path
											d="M10 0C4.48 0 0 4.48 0 10C0 15.52 4.48 20 10 20C15.52 20 20 15.52 20 10C20 4.48 15.52 0 10 0ZM17.46 7.12L14.68 8.27C14.17 6.91 13.1 5.83 11.73 5.33L12.88 2.55C14.98 3.35 16.65 5.02 17.46 7.12ZM10 13C8.34 13 7 11.66 7 10C7 8.34 8.34 7 10 7C11.66 7 13 8.34 13 10C13 11.66 11.66 13 10 13ZM7.13 2.54L8.3 5.32C6.92 5.82 5.83 6.91 5.32 8.29L2.54 7.13C3.35 5.02 5.02 3.35 7.13 2.54ZM2.54 12.87L5.32 11.72C5.83 13.1 6.91 14.18 8.29 14.68L7.12 17.46C5.02 16.65 3.35 14.98 2.54 12.87ZM12.88 17.46L11.73 14.68C13.1 14.17 14.18 13.09 14.68 11.71L17.46 12.88C16.65 14.98 14.98 16.65 12.88 17.46Z"
											fill="#FAD47F" />
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
										Nature of the Insolvent Person</p> <span></span>
								</li>
								<li class="form-section farm ">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="farm rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING DOCUMENTS</p> <span></span>
								</li>
								<li style="display:none" class="last-step">
                                    <span></span>
                                </li>
							</ul>
							<input type="hidden" id="ogtApplicationId" name="ogtApplicationId" value="">
							<input type="hidden" id="ogtCurrentStage" name="ogtCurrentStage">
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=ogtApplicationId%>">
						</div>
						<%@ include file="/type-of-nature/ogt-nature-type.jsp" %>
							<%@ include file="/type-of-applicant/ogt-applicant-type.jsp" %>
								<%@ include file="/forms/ogt-form-tabs.jsp" %>
									<%@ include file="/supporting-documents/ogt-documents.jsp" %>
										<%@ include file="/preview/final-preview-tabs.jsp" %>
											<%@ include file="/ogt-final-submission.jsp" %>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var numberOfDocument ="";
var filledDocument ="";
var ogtDocCount=1;
	$("#ogtApplicationLodgeTypeBox .wizard-card").click(function () {
		$("#applicantType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtApplicationLodgeTypeVal").val($(this).find(".wizard-title").html());
		$("#applicantType").removeClass("hide");
		$("#prospecright").addClass("hide");
		$("#matterType").addClass("hide");
	});
	$("#applicantType .wizard-card").click(function () {
		$("#applicantType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtApplicantTypeVal").val($(this).find(".wizard-title").html());
		$("#matterType").addClass("hide");
		$("#debtType").addClass("hide");
		$("#natureType .wizard-card").removeClass("active");
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		$("#manufacturerType").addClass("hide");
		$("#prospecright").addClass("hide");
		$("#matterType").addClass("hide");
		$("#bankruptcyType").addClass("hide");
		$("#debtStatuteBox").addClass("hide");
		ogtApplicantType = $("#ogtApplicantTypeVal").val();
		if(ogtApplicantType == "Claimant"){
			$("#debtorName, #claimantName").attr("disabled", true);
		}else{
			$("#debtorName, #claimantName").attr("disabled", false);
		}
	});
	$("#natureType .wizard-card").click(function () {
		$("#natureType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtApplicantNatureTypeVal").val($(this).find(".wizard-title").html());
		$("#debtType").addClass("hide");
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		$("#manufacturerType").removeClass("hide");
		$("#prospecright").addClass("hide");
		$("#bankruptcyType, #matterType, #debtStatuteBox").addClass("hide");
		$("#manufacturerType .wizard-card").removeClass("active");
		
		var ogtApplicantNatureType = $("#ogtApplicantNatureTypeVal").val();
	    $("#applicantClaimant option").each(function() {
	        if ($(this).val() == ogtApplicantNatureType) {
	            $(this).prop("selected", true); 
	            $("#applicantClaimant").prop("disabled", true);
	            $(this).trigger("change"); 
	        }
	    });
	    $("#insolventPersonNature option").each(function() {
	        if ($(this).val() == ogtApplicantNatureType) {
	            $(this).prop("selected", true); 
	            $("#insolventPersonNature").prop("disabled", true);
	            $(this).trigger("change"); 
	        }
	    });
	});

	$("#manufacturerType .wizard-card").click(function () {
		$("#manufacturerType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtmanufacturerTypeVal").val($(this).find(".wizard-title").html());
		$("#matterType .wizard-card").removeClass("active");
		$("#debtType, #debtStatuteBox").addClass("hide");
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		$("#prospecright").removeClass("hide");
		$("#matterType, #bankruptcyType, #debtType, #debtStatuteBox").addClass("hide");
		var ogtmanufacturerTypeVal = $("#ogtmanufacturerTypeVal").val();
		if (ogtmanufacturerTypeVal == "Registered Manufacturer") {
			$("#ogt-popup").addClass("hide");
			$("#prospecright").removeClass("hide");
			$("#ogt-producer-number-pop-up").modal("hide");
		}else {
			$("#ogt-producer-number-pop-up").modal("show");
			$("#ogt-popup").removeClass("hide");
			$("#prospecright").addClass("hide");
		}
		
	});
	
	$("#matterType .wizard-card").click(function () {
		$("#matterType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtMatterTypeVal").val($(this).find(".wizard-title").html());
		$("#bankruptcyType").removeClass("hide");
		$("#bankruptcyType .wizard-card").removeClass("active");
		$("#debtType .wizard-card").removeClass("active");
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		$("input[name='debtStatute']").prop("checked", false);
		$("#bankruptcyType").removeClass("hide");
		$("#debtStatuteBox").addClass("hide");
		var ogtMatterType = $("#ogtMatterTypeVal").val();
		$(".matterType").html(ogtMatterType);
		if (ogtMatterType == "Bankruptcy") {
			$(".bankrupcy-form").removeClass("hide");
			$("#bankrupcyFormNext").removeClass("hide");
			$("#claimantAttached1").prop("checked", true);
			$("#claimantAttached2").prop("checked", false);
			$("#claimantAttached3").prop("checked", false);
			$("#claimantAttached2, #claimantAttached3").attr("disabled", true);
			$("#debtType").addClass("hide");
			$("#bankruptcyType").removeClass("hide");
			
		} else {
			$(".bankrupcy-form").addClass("hide");
			$("#bankrupcyFormNext").addClass("hide");
			$("#debtType").removeClass("hide");
			$("#bankruptcyType").addClass("hide");
			
		}
		if (ogtMatterType == "Proposal") {
			$("#claimantAttached2").prop("checked", true);
			$("#claimantAttached1").prop("checked", false);
			$("#claimantAttached3").prop("checked", false);
			$("#claimantAttached1, #claimantAttached3").attr("disabled", true);
			
		} if (ogtMatterType == "Receivership") {
			$("#claimantAttached3").prop("checked", true);
			$("#claimantAttached1").prop("checked", false);
			$("#claimantAttached2").prop("checked", false);
			$("#claimantAttached1, #claimantAttached2").attr("disabled", true);
		}
	});

	$("#bankruptcyType .wizard-card").click(function () {
		$("#bankruptcyType .wizard-card").removeClass("active");
		$(this).addClass("active");
		$("#ogtbankruptcyType").val($(this).find(".wizard-title").html());
		$("#debtType").removeClass("hide");
		$("#debtType .wizard-card").removeClass("active");
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		$("#debtStatuteBox").addClass("hide");
		ogtbankruptcyTypeVal = $("#ogtbankruptcyType").val();
		$(".claim-by-creditor-form, .claim-to-property-form, .claim-by-spouse-form").addClass("hide");
		if(ogtbankruptcyTypeVal == "Claim by Creditor"){
			$(".claim-by-creditor-form").removeClass("hide");
			$(".claim-heading").html("Claim by Creditor (Section 188(2))");
		}else if(ogtbankruptcyTypeVal == "Claim to Property"){
			$(".claim-to-property-form").removeClass("hide");
			$(".claim-heading").html("Claim to Property (Section 105)");
		}else{
			$(".claim-by-spouse-form").removeClass("hide");
			$(".claim-heading").html("Claim by Spouse (Section 99)");
		}
	});

	

	$("#debtType .wizard-card").click(function () {
		$(this).toggleClass("active");
		$("#ogtDebtTypeVal").val($(this).find(".wizard-title").html());
		/* $("#ogtApplicantFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"}); */
		$("#debtStatuteBox").removeClass("hide");
		$("input[name='debtStatute']").prop("checked", false);

	});
	/* $("#debtType .wizard-card").click(function(){
		
	}); */
	$("input[name='debtStatute']").change(function () {
		$("#ogtApplicantFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	});

	var nextWizardStep = true;
	jQuery(document).ready(function () {
		jQuery('.wizard-next-btn').click(function () { 
			var parentFieldset = jQuery(this).parents('.wizard-fieldset');
			var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
			var next = jQuery(this);ogtApplicantFieldset
			var currentFieldSet = $(".wizard-fieldset.show").attr("id");

			/* Scroll Page to top */
		    scrollToPageTop();
			
			if (currentFieldSet == "ogtApplicantFieldset") {
				pendingOgtApplication();
				activeSelectForm();
				insolventPersonNature=$("#insolventPersonNature").val();
				insolventIndiFirstName=$("#insolventIndiFirstName").val();
				insolventIndiLastName=$("#insolventIndiLastName").val();
				insolventCompanyName=$("#insolventCompanyName").val();
				$("#ogtformsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				if(insolventPersonNature == "Individual"){
					if (insolventIndiFirstName && insolventIndiLastName) {
						$("#ogtformsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
					} else {
						$("#ogtformsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
					}
				}
				if(insolventPersonNature == "Company"){
					if(insolventCompanyName) {
						$("#ogtformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}else{
						$("#ogtformsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}

				if(ogtDocCount==1){
 			     gettingDocumentList();
	     		} 
				    ogtDocCount++;
				    naveTabCount();
			}
				if (currentFieldSet == "ogtformsFieldset") {
					addProofOfClaimFormC();
					/* DOCUMENT VALIDATION */
			    	var requiredDoc = $("div[id='requiredDoc']").length;
			    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
			    	if(requiredDoc >= 1){
			    		$(".mandatory-doc-heading").removeClass("hide");
			    		numberOfDocument = requiredDoc;
			    		if(numberOfDocument != filledDocument){
			        		$("#ogtSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			        	}
			    	}
					pendingOgtApplication();
				}
				if (currentFieldSet == "ogtSupportingDocumentFieldset") {
					downloadPDF();
					ogtGenericDocuments('Generic Documents');
					previewClaimantDetailInfo();
					previewInsolventDetailInfo();
					previewProofClaimInfo();
					finalPreviewScroll();
					previewMethod();
					var docRenderCount = 1;
					showDocsPreview(docRenderCount);
					docRenderCount++;
					pendingOgtApplication();
					showFinalSubmitButton();
					
					ogtbankruptcyTypeVal = $("#ogtbankruptcyType").val();
					$(".claim-by-creditor-form, .claim-to-property-form, .claim-by-spouse-form").addClass("hide");
					if(ogtbankruptcyTypeVal == "Claim by Creditor"){
						$(".claim-by-creditor-form").removeClass("hide");
						$(".claim-heading").html("Claim by Creditor (Section 188(2))");
					}else if(ogtbankruptcyTypeVal == "Claim to Property"){
						$(".claim-to-property-form").removeClass("hide");
						$(".claim-heading").html("Claim to Property (Section 105)");
					}else{
						$(".claim-by-spouse-form").removeClass("hide");
						$(".claim-heading").html("Claim by Spouse (Section 99)");
					}
				}

				if (nextWizardStep == true) {
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

		//Initialize tooltips
		$('.nav-tabs > li a[title]').tooltip();
		//Wizard
		$('a[data-toggle="tab"]').on('show.bs.tab',
			function (e) {
				var $target = $(e.target);
				if ($target.parent().hasClass('disabled')) {
					return false;
				}
			});
		$(".prev-step").click(function (e) {
			var $active = $('.nav-tabs li>a.active');
			prevTab($active);
		});

		function prevTab(elem) {
			$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

		}
		$(function () {
			$(document).on('change', '#ogtServicesEnrollDocuments', function () {
				var fileName = $(this).val();
				fileName = fileName.replace("C:\\fakepath\\", "");
				$(this).next('.custom-file-label').html(fileName);
			})
		});
		function prevTab(elem) {
			$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

		}
	});
	/* $("#transactionType a").click(function () {
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
}); */

	//click on previous button
	jQuery('.form-wizard-previous-btn').click(function () {
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

	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#ogtServicesEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#ogtServicesDocumentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}

	function supportingDocumentUpload() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#ogtServicesDocumentuploadCounter").val();
		var fileID = 'ogtServicesEnrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress' + documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		ogtApplicationId = $("#ogtApplicationId").val();
		$.ajaxFileUpload({
			secureuri: false,
			method: "POST",
			fileElementId: 'ogtServicesEnrollDocuments',
			url: '${ogtDoucumentsUpload}',
			dataType: 'text',
			data: {
				"<portlet:namespace/>documentNumber": documentNumber,
				"<portlet:namespace/>documentName": documentName,
				"<portlet:namespace/>fileID": fileID,
				"<portlet:namespace/>command": "fileUpload",
				"<portlet:namespace/>issueDate": issueDate,
				"<portlet:namespace/>expiryDate": expiryDate,
				"<portlet:namespace/>documentuploadCounter": documentuploadCounter,
				"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
			},
			success: function (data, status) {
				var progress = document.getElementById('progress' + documentuploadCounter);
				progress.ariaValueNow = 100;
				progress.style.width = '100%';
				$('.hidden' + documentuploadCounter).addClass('hide');
				$("#uploadedFormResult" + documentuploadCounter).html(data);
				$("#<portlet:namespace/>uploaded-documents" + documentuploadCounter).hide();
				$(".uploaded-info").removeClass("hide");
				if (data != "") {
					$("#documentUpload" + documentuploadCounter).addClass("disabled");
				}
				
				updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
	            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
	            filledDocument=updatedFillDoc-genericFilledDoc;
				if(numberOfDocument == filledDocument){
		        	$("#ogtSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		        }
			},
			error: function () {
			}
		});
	}

	function opendelDocPopup(fileEntry, counter) {
		$("#ogtServicesDocumentuploadCounter").val(counter);
		$("#deletepopup" + fileEntry).modal("show");
	}
	function deleteDocument(fileEntryId) {
		var documentuploadCounter = $("#ogtServicesDocumentuploadCounter").val();
		$.ajax({
			type: "POST",
			url: '${ogtDocDeletionUrl}',
			data: {
				"<portlet:namespace/>fileEntryId": fileEntryId,
			},
			success: function (data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass("disabled");
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
				/* filledDocument = filledDocument - 1;
				$("#PharmaSupportingDocumentFieldset .form-wizard-next-btn").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"}); */
				var requiredDoc = $("div[id='requiredDoc']").length;
				var notRequireDoc = $("div[id='notRequiredDoc']").length;
			    if(requiredDoc >= 1){
				    if(documentuploadCounter <= requiredDoc){
						$("#requireDocNamePreview" + documentuploadCounter).html("");
						filledDocument = filledDocument -1;
						$("#ogtSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(notRequireDoc > 0){
					$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
				}
			},
			error: function (data) {

			}
		});
	}
	function ogtGenericDocuments(folderName) {
		ogtApplicationId = $("#ogtApplicationId").val();
		var fileID = 'ogtServiceGenericUpload';
		 var fileInput = $("#" + fileID)[0]; // File input element
	    var fileLength = fileInput.files.length; // Count of selected files
	   var saveAndConCheck = $("#saveAndConCheck").val();
		
	// Decide what to send to the backend
	   var fileData = fileLength > 0 ? fileID : "0";
	   // Show loader
	   $("#ogtFormPreviewFieldset .custom_loader").removeClass("hide");
	   $(".preview-section").addClass("hide");
		$
			.ajaxFileUpload({
				secureuri: false,
				method: "POST",
				fileElementId: 'ogtServiceGenericUpload',
				url: '${signatureUploadInOGTFormUrl}',
				dataType: 'text',
				data: {
					"<portlet:namespace/>folderName": folderName,
					"<portlet:namespace/>fileID": fileID,
					"<portlet:namespace/>command": "fileUpload",
					"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
					"<portlet:namespace/>saveAndConCheck": saveAndConCheck,

				},
				success: function (data, status) {
					 $(".additionalDocPreviewOne, #additionalDocPreview").html("");
			        	var parsedData = JSON.parse(data);
			        	 try{
		    	                var parsedData = typeof data === "string" ? JSON.parse(data) : data;
		        	            var jsonArrayLength=parsedData.JSON_LENGTH;
		        	            var uniqueArray = parsedData.fileData;
		        	           var responseData = uniqueArray.filter((value, index, self) =>
		        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
		        	        );

		        	            }catch(error){}
		        	if (jsonArrayLength > 0){
                     	var counter = 1;
						$.each(responseData,function(key,entry){
							console.log(entry.fileName);
							
								var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
			                    
			                    documentContainerPreview.append('<a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a>');
			                    
			                    $('#additionalDocPreview').append(documentContainerPreview);		
			                    counter++;
			                    $(".noAdditionalSupportingDoc").addClass("hide");
						});
					}else{
						$(".noAdditionalSupportingDoc").removeClass("hide");
					}
                     $("#ogtFormPreviewFieldset .custom_loader").addClass("hide");
                     $(".preview-section").removeClass("hide");
                     $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                     
				},
				error: function (data, status, e) {
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
	        $('#ogtServiceGenericUpload')[0].files = newFileList.files;
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

	    $(document).on('change', '#ogtServiceGenericUpload', function () {
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
	            var ogtApplicationId = "<%=ogtApplicationId%>";
	        	if(ogtApplicationId > 0 ){
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
	            $("#ogtFormPreviewFieldset .custom_loader").removeClass("hide");
	            $(".preview-section").addClass("hide");
	        } else {
	        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
	            $('.uploaded-delete').hide();
	            $(".noAdditionalSupportingDoc").show();
	            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	            $("#ogtFormPreviewFieldset .custom_loader").addClass("hide");
	            $(".preview-section").removeClass("hide");
	        	}
	        }
	    });
	});

	function deleteDoc(id) {
	    var currentId = id;
		$(".document-container-preview"+id).remove();
	}
	
	async function gettingDocumentList() {
		ogtApplicationId = $("#ogtApplicationId").val();
		doYouWant = $("#ogtApplicationLodgeTypeVal").val();
		typeOfApplicant = $("#ogtApplicantTypeVal").val();
		natureOfApplicant = $("#ogtApplicantNatureTypeVal").val();
		typeOfMatter = $("#ogtMatterTypeVal").val();
		typeOfDebt = $("#ogtDebtTypeVal").val();
		debtstatute = $("input[name='debtStatute']:checked").val();
		$.ajax({
			type: "POST",
			url: "${ogtGettingDocumentList}",
			data: {
				"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
				"<portlet:namespace/>doYouWant": doYouWant,
				"<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				"<portlet:namespace/>natureOfApplicant": natureOfApplicant,
				"<portlet:namespace/>typeOfMatter": typeOfMatter,
				"<portlet:namespace/>typeOfDebt": typeOfDebt,
				"<portlet:namespace/>debtstatute": debtstatute,
			},
			success: function (data) {
				$("#documentList").html(data);
				
				var ogtApplicationId = '<%=ogtApplicationId%>';
				if (ogtApplicationId > 0) {
					var currentStage = "<%=currentStage %>";
					if(currentStage == "SUPPORTING DOCUMENTS"){
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
				}
			},
			error: function (data) {
				console.log("Error occurred while fetching document list");
			},
		});
	}

	 /*Download Pdf*/
 	function downloadPDF(){
    	ogtApplicationId=$("#ogtApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${ogtDownloadPDFUrl}",
                data: {
                        "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if (result && result["fileUrl"]) {
                        $("#ogtDownloadPDF").attr("href", result["fileUrl"]);
                        $("#ogtDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
        });
    }
	function showFinalSubmitButton() {
		var currentFieldSet = $(".wizard-fieldset.show").attr("id");
		if (currentFieldSet == "ogtSupportingDocumentFieldset" || currentFieldSet == "ogtFormPreviewFieldset") {
			$(".form-wizard-next-btn ").hide();
			$(".form-wizard-save-btn").hide();
			$(".final-submit").removeClass("hide");
		}else{
			$(".form-wizard-next-btn").show();
			$(".form-wizard-save-btn").show();
			$(".final-submit").addClass("hide");
		}
	}
	function activeSelectForm() {
			$("#ogtAdmissionClaimForm .tab-pane").removeClass("active");
			$(".ogtClaimantFormTab .nav-link").removeClass("active");

			$("#ogtAdmissionClaimForm .tab-pane:first").addClass("active");
			$(".ogtClaimantFormTab .nav-link:first").addClass("active");
	}
	function applicantInfo() {
		nextForm();
		pendingOgtApplication();
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
	function openSaveToDraftPopupOgt() {
		$(".savecountinuePopup").modal("show");
		
		saveToDraft();
	}
	function finalSubmitOgtApp() {
		$(".final-submit-container").removeClass("hide");
		submitOgtApplication();
	}

	/* FORM FUNCTIONS */
	$("#Other1").click(function () {
		var categoryFour = new Array();
		$("input:checkbox[name=category4]:checked").each(function () {
			categoryFour.push($(this).val());
		});
		var selectedInfo = categoryFour.toString();
		valueOfOther = selectedInfo;
		if (valueOfOther == "Other") {
			$(".pleaseSpecify").removeClass("hide");
		} else {
			$(".pleaseSpecify").addClass("hide");
		}
	});
	$('input[type=checkbox][name=statementAccount]').change(function () {
		$(this).parent().next(".detail-operating-box").toggleClass("hide", !this.checked);
	});

	//$("input[name='statementAccount']").change(function(){
	  // if($(this).val() == "Statement of account"){
		// $("#statementAccount1").prop("checked",false);
	   //}else{
		 /*  $("#statementAccount").prop("checked",false);  */
	   //}
	//});
	$("#completingForm").on('input', function () {
		$(".completingForm").html($(this).val());
	});
	$("#debtorName").on('input', function () {
		$(".debtorName").html($(this).val());
	});
	$("#claimantName").on('input', function () {
		$(".claimantName").html($(this).val());
	});
	$("#positionCompletingForm").on('input', function () {
		$(".positionCompletingForm").html($(this).val());
	});
	$("#positionCompletingForm").on('input', function () {
		$("#claimantCheck").val($(this).val() + " of the claimant");
	});
	$("#claimName").on('input', function () {
		$(".claimNamePerson").html($(this).val());
	});
	$("#applicationDateCa").on('input', function () {
		$(".applicationDateCa").html($(this).val());
	});
	$("#valueOfClaim").on('input', function () {
		$(".valueOfClaim").html($(this).val());
	});
	$("#unsecuredClaim1").on('input', function () {
		$(".unsecuredClaim1").html($(this).val());
	});
	$("#regardingAmount1").on('input', function () {
		$(".regardingAmount1").html($(this).val());
	});
	$("#securedClaim1").on('input', function () {
		$(".securedClaim1").html($(this).val());
	});
	$("#bankruptcyDatePro").on('input', function () {
		$(".bankruptcyDatePro").html($(this).val());
	});
	$("#bankruptcyDateSpouse").on('input', function () {
		$(".bankruptcyDateSpouse").html($(this).val());
	});
	$("#completingFormAct").on('input', function () {
		$(".completingFormAct").html($(this).val());
	});
	$("#datePerson").on('input', function () {
		$(".datePerson").html($(this).val());
	});
	$("#justicePeace").on('input', function () {
		$(".justicePeace").html($(this).val());
	});
	$("#amountClaim").on('input', function () {
		$(".amountClaim").html($(this).val());
	});
	$("#amountAdmitted").on('input', function () {
		$(".amountAdmitted").html($(this).val());
	});
	$("#amountPayment").on('input', function () {
		$(".amountPayment").html($(this).val());
	});
	
	$("input[name='incorporationLodged']").change(function(){
		$(".incorporationLodged").html($(this).val()); 
	});

	function pendingOgtApplication() {
		ogtApplicationId = $("#ogtApplicationId").val();
		doYouWant = $("#ogtApplicationLodgeTypeVal").val();
		typeOfApplicant = $("#ogtApplicantTypeVal").val();
		natureOfInsolvent = $("#ogtApplicantNatureTypeVal").val();
		typeOfMatter = $("#ogtMatterTypeVal").val();
		var selectedInformation = [];
	    $("#debtType").find(".application-type-card.active .wizard-title").each(function() {
	        selectedInformation.push($(this).html());
	    });
        var typeOfDebt = selectedInformation.toString();
		registeredManufacturer = $("#ogtmanufacturerTypeVal").val();
		registrationLicenceNum = $("#renew-licence-number").val();
		typeOfBankruptcy= $("#ogtbankruptcyType").val();
		debtstatute = $("input[name='debtStatute']:checked").val();
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		$.ajax({
			type: "POST",
			url: "${ogtPendingUrl}",
			data: {

				"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
				"<portlet:namespace/>doYouWant": doYouWant,
				"<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				"<portlet:namespace/>natureOfInsolvent": natureOfInsolvent,
				"<portlet:namespace/>typeOfMatter": typeOfMatter,
				"<portlet:namespace/>typeOfDebt": typeOfDebt,
				"<portlet:namespace/>registeredManufacturer": registeredManufacturer,
				"<portlet:namespace/>registrationLicenceNum": registrationLicenceNum,
				"<portlet:namespace/>typeOfBankruptcy": typeOfBankruptcy,
				"<portlet:namespace/>debtstatute": debtstatute,
				"<portlet:namespace/>currentFormToSave": currentFormToSave,
			},
			async: false,
			success: function (data) {
				var result = data.APP_DATA;
				$("#ogtApplicationId").val(result["ogtApplicationId"]);
			},
			error: function (data) {
			},
		});
	}
	$(document).on('change', '#sign-req-upload-btn', function() {
		//Get count of selected files
		var countFiles = $(this)[0].files.length;
		var imgPath = $(this)[0].value;
		var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		var image_holder = $("#sign-req-image-holder");
		var form1a_image_holder = $("#sign-req-image-holderPreview");
		image_holder.empty();
		form1a_image_holder.empty();
		if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			if (typeof (FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) {
					var reader = new FileReader();
					reader.onload = function (e) {
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
						}).appendTo(image_holder);
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
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

	$(document).on('change', '#sign-req-justice-upload-btn', function() {
		//Get count of selected files
		var countFiles = $(this)[0].files.length;
		var imgPath = $(this)[0].value;
		var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		var image_holder = $("#sign-req-image-holder-justice");
		var form1a_image_holder = $("#sign-req-image-holder-justicePre");
		image_holder.empty();
		form1a_image_holder.empty();
		if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			if (typeof (FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) {
					var reader = new FileReader();
					reader.onload = function (e) {
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
						}).appendTo(image_holder);
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
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
	$(document).on('change', '#sign-trustee-upload-btn-first', function() {
		//Get count of selected files
		var countFiles = $(this)[0].files.length;
		var imgPath = $(this)[0].value;
		var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		var image_holder = $("#sign-req-image-holder-trustee");
		var form1a_image_holder = $("#sign-req-image-holder-trusteePre");
		image_holder.empty();
		form1a_image_holder.empty();
		if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			if (typeof (FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) {
					var reader = new FileReader();
					reader.onload = function (e) {
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
						}).appendTo(image_holder);
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
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
	$(document).on('change', '#sign-trustee-upload-btn-last', function() {
		//Get count of selected files
		var countFiles = $(this)[0].files.length;
		var imgPath = $(this)[0].value;
		var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		var image_holder = $("#sign-req-image-holder-trustee-pay");
		var form1a_image_holder = $("#sign-trustee-upload-btn-lastPre");
		image_holder.empty();
		form1a_image_holder.empty();
		if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
			if (typeof (FileReader) != "undefined") {
				//loop for each file selected for uploaded.
				for (var i = 0; i < countFiles; i++) {
					var reader = new FileReader();
					reader.onload = function (e) {
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
						}).appendTo(image_holder);
						$("<img />", {
							"src": e.target.result,
							"class": "thumb-image",
							"height": "100",
							"width": "100"
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
	function submitOgtApplication(){
		ogtApplicationId = $("#ogtApplicationId").val();
		doYouWant = $("#ogtApplicationLodgeTypeVal").val();
		typeOfApplicant = $("#ogtApplicantTypeVal").val();
		natureOfInsolvent = $("#ogtApplicantNatureTypeVal").val();
		typeOfMatter = $("#ogtMatterTypeVal").val();
		var selectedInformation = [];
	    $("#debtType").find(".application-type-card.active .wizard-title").each(function() {
	        selectedInformation.push($(this).html());
	    });
        var typeOfDebt = selectedInformation.toString();
        registeredManufacturer = $("#ogtmanufacturerTypeVal").val();
		registrationLicenceNum = $("#renew-licence-number").val();
		typeOfBankruptcy= $("#ogtbankruptcyType").val();
		debtstatute = $("input[name='debtStatute']:checked").val();
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		$.ajax({
			type: "POST",
			url: "${ogtSubmitApplicationUrl}",
			data: {
				"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
				"<portlet:namespace/>doYouWant": doYouWant,
				"<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				"<portlet:namespace/>natureOfInsolvent": natureOfInsolvent,
				"<portlet:namespace/>typeOfMatter": typeOfMatter,
				"<portlet:namespace/>typeOfDebt": typeOfDebt,
				"<portlet:namespace/>registeredManufacturer": registeredManufacturer,
				"<portlet:namespace/>registrationLicenceNum": registrationLicenceNum,
				"<portlet:namespace/>typeOfBankruptcy": typeOfBankruptcy,
				"<portlet:namespace/>debtstatute": debtstatute,
				"<portlet:namespace/>currentFormToSave": currentFormToSave,
			},
			success: function (data) {
				var result = data.APP_DATA;
			 var appStatus = result["appStatus"];
				if (appStatus == "submitted") {
					$("#continueDashboardOGTStatus").removeClass("hide");
					$("#submitted-content").removeClass("hide");
					$("#application_submitted-img").removeClass("hide");
					$(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				} else {
					$("#draft-content").removeClass("hide");
					$("#application_draft-img").removeClass("hide");
				}
				$(".final-submit-container .custom_loader").addClass("hide");
				if (result != null) {
					$("#submit_pop_app_no").html(result["ogtAppNo"]);
					$("#submit_pop_status").html(result["appStatus"]);
					$(".submit_pop_category").html(result["category"]);
				}
			},
			error: function (data) {
			},
		});
	}
	function saveToDraft() {
		ogtApplicationId = $("#ogtApplicationId").val();
		doYouWant = $("#ogtApplicationLodgeTypeVal").val();
		typeOfApplicant = $("#ogtApplicantTypeVal").val();
		natureOfInsolvent = $("#ogtApplicantNatureTypeVal").val();
		typeOfMatter = $("#ogtMatterTypeVal").val();
		var selectedInformation = [];
		    $("#debtType").find(".application-type-card.active .wizard-title").each(function() {
		        selectedInformation.push($(this).html());
		    });
        var typeOfDebt = selectedInformation.toString();
		debtstatute = $("input[name='debtStatute']:checked").val();
		registeredManufacturer = $("#ogtmanufacturerTypeVal").val();
		registrationLicenceNum = $("#renew-licence-number").val();
		typeOfBankruptcy= $("#ogtbankruptcyType").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		  if(currentFormToSave=="Claimant Details"){
			addClaimantDetailsFormInfo(true);
		 }if( currentFormToSave=="Insolvent Person Details"){
			addInsolventDetailFormInfo(true);
		 }if( currentFormToSave=="Section A"){
			addProofOfClaimFormA(true);
		}if(typeOfBankruptcy == "Claim by Creditor" && currentFormToSave=="Section B"){
			addSectionBForm(true)
		}if((typeOfBankruptcy == "Claim to Property" || typeOfBankruptcy == "Claim by Spouse") && currentFormToSave=="Section B"){
			addProofOfClaimFormB(true);
		}if(currentFormToSave=="Signature"){
			addProofOfClaimFormC();
		}if(currentStage == "SUPPORTING DOCUMENTS"){
			ogtGenericDocuments('Generic Documents');
		   }
		$.ajax({
			type: "POST",
			url: "${ogtDraftApplicationUrl}",
			data: {

				"<portlet:namespace/>ogtApplicationId": ogtApplicationId,
				"<portlet:namespace/>doYouWant": doYouWant,
				"<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				"<portlet:namespace/>natureOfInsolvent": natureOfInsolvent,
				"<portlet:namespace/>typeOfMatter": typeOfMatter,
				"<portlet:namespace/>typeOfDebt": typeOfDebt,
				"<portlet:namespace/>debtstatute": debtstatute,
				"<portlet:namespace/>registeredManufacturer": registeredManufacturer,
				"<portlet:namespace/>registrationLicenceNum": registrationLicenceNum,
				"<portlet:namespace/>typeOfBankruptcy": typeOfBankruptcy, 
				"<portlet:namespace/>currentFormToSave": currentFormToSave,
				"<portlet:namespace/>currentStage": currentStage,
				"<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			},
			async: false,
			success: function (data) {
				var result = data.APP_DATA;
				$("#pop_app_no").html(result["ogtAppNo"]);
				$(".pop_category").html(result["category"]);
				$("#pop_status").html(result["appStatus"]);
				$("#ogtApplicationId").val(result["ogtApplicationId"]);

			},
			error: function (data) {
			},
		});

	}
	function formatPhoneNumber(input) {
		// Remove non-numeric characters except "+", "-", and " "
		let formattedInput = input.value.replace(/[^\d\+\-\s]/g, '');
		// Remove any leading "+" if it exists
		formattedInput = formattedInput.replace(/^\+/, '');
		// Apply the desired format
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
		// Update the input value
		input.value = formattedInput;
	}
	
	 /*  PREVIEW FUNCTIONALITIES */
 	$(".preview-edit-button").click(function(){
		$('#ogtFormPreviewFieldset').removeClass("show");
		$('#ogtformsFieldset').addClass("show", "400");
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
		$('#ogtFormPreviewFieldset').removeClass("show");
		$('#ogtSupportingDocumentFieldset').addClass("show", "400");
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

 // registered and unregistered process
 function registeredsubmit(){
		   typeOfApplicant = $("#ogtApplicantTypeVal").val();
		   typeOfPersonAuthorized = $("#ogtApplicantTypeVal").val();		   
			licenseNumber = $("#renew-licence-number").val();
			$("#matterType").removeClass("hide");
			
		}

 function ogtdeleteDocumentForGeneric(fileEntryId) {
		/* var documentuploadCounter = $("#counterOfDocuments").val(); */
		var documentuploadCounter = $("#ogtServicesDocumentuploadCounter").val();
		$.ajax({
			type : "POST",
			url : '${ogtDocDeletionUrl}',
			data : {
				"<portlet:namespace/>fileEntryId" : fileEntryId,
			},
			success : function(data) {
				$("#deletepopup" + fileEntryId).modal("hide");
				$("#unpload-info-card" + fileEntryId).remove();
				$("#documentUpload" + documentuploadCounter).removeClass("disabled");
				$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
			},
			error : function(data) {

			}
		});
	}
 
 function naveTabCount(){
	 var j = 1;
	 $(".side-tab-count").find(".nav-item").each(function() {
	     var $next = $(this);
	     if (!$next.hasClass('hide')) {
	         var $link = $next.find("a");
	         var $stepType = $link.find('.step-type');
	         if ($stepType.length > 0) {
	             $stepType.html(j);
	             j++;
	         } else {
	             console.log("No .step-type found in this nav-item.");
	         }
	     }
	 });
	var i = 1;
	$(".side-tab-pre-count").find(".nav-item").each(function() {
	    var $nextPre = $(this);
	     if (!$nextPre.hasClass('hide')) {
	         var $linkPre = $nextPre.find("a");
	         var $stepTypePre = $linkPre.find('.step-type');
	         if ($stepTypePre.length > 0) {
	             $stepTypePre.html(i);
	             i++;
	         } else {
	             console.log("No .step-type found in this nav-item.");
	         }
	     }
	});
  }
 
 function deleteAfterSaveConDoc(id) {
	    var fileName = $("#"+id).next().html();
	    ogtApplicationId = $("#ogtApplicationId").val();
		saveAndCon='<%=ogtApplicationId%>';
		if(saveAndCon>0){
		 	 $.ajax({
			        type: "POST",
			        url: '${delteDocAferSaveconUrl}',
			        data: {
			            "<portlet:namespace/>fileName": fileName,
			            "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
			        },
			        success: function (data) {
			        },
			        error: function (data) {
			        }
			    });	
			
		}
	}
 </script>