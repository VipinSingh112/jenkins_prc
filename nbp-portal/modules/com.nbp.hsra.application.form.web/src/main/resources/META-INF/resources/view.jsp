<%@ include file="/init.jsp" %>
<%@ include file="/hsra-wizard.jsp" %>
<jsp:include page="/js/hsra-home-js.jsp"/>
<jsp:include page="/js/users-js.jsp"/>
<jsp:include page="/forms/hsra-popup.jsp" />
<portlet:resourceURL var="addHsraUploadDocumentUrl" id="/add/Hsra/Upload/Document/Url"></portlet:resourceURL>
<portlet:resourceURL var="hsraApplicationGettingDocumentList" id="/hsra/application/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="deletedocumentUrl" id="/delete/document/Url"></portlet:resourceURL>
<div class="modal fade commonsavepopup savecountinuePopup" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
            </div>
            <div class="modal-pic">
                <img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" />
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12">
                        <p class="modal-title f1">Application saved as draft</p>
                        <p class="modal-subtitle f2">Your application for a <span id="draftCategory"></span> has been correctly saved as draft.</p>
                        <p class="modal-info f2">
                            You will be able to continue your application process at any moment. You can find the draft
                            in
                            <a href="/group/guest/dashboard">your Dashboard:</a>
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="cards-wrapper">
                            <div class="row">
                                <div class="col-lg-5 d-flex justify-content-center">
                                    <div class="licence-box ml-2">
                                        <div class="left">
                                        <img src="<%=request.getContextPath()%>/image/HSRA logo 1 copy.png" class="img-fluid"  alt="logo" height="30" width="37"/>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">HSRA Application Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Status
                                        </p>
                                        <a href="javascript:;" class="draftlink f2" id="pop_status">Draft</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="footer-above-border"></div>
                    </div>
                </div>
            </div>
            <div class="modal-footer border-0 d-flex justify-content-between">
                <div><a href="/home" data-senna-off="true" class="text-dark common-nav-links text-white popup-home hidePopup">
                        <span class="mr-2"><svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
                            </svg>
                        </span>Go back to the Homepage</a>
                </div>
                <div>
                    <a href="/group/guest/dashboard" data-senna-off="true" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
                        Continue to your dashboard<span class="ml-2">
                            <svg width="22" height="17" viewBox="0 0 22 17" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
                                    fill="#1B1917" />
                                <path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
                                    fill="#1B1917" />
                                <path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
                            </svg>

                        </span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("#hsraApplicantTypeFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
        $(".form-wizard-previous-btn").addClass("hide");
    	$(".form-wizard-save-btn").addClass("hide");
    });

    /* Document Upload */
    function gettingDocumentList(){
    	typeOfApplicant=$("#applicantTypeVal").val();
		typeOfActivities=$("#activityTypeVal").val();
		hsraApplicationId=$("#hsraApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${hsraApplicationGettingDocumentList}",
			data : {
				"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
				"<portlet:namespace/>typeOfActivities" : typeOfActivities,
				"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
				},
				async:false,
			success : function(data) {
				$("#documentList").html(data);
                /* Doc Validation */
		    	
		    	var hsraApplicationId = '<%=hsraApplicationId%>';
				if (hsraApplicationId > 0) {
					var currentStage = "<%=currentStage %>";
				/* 	if(currentStage == "SUPPORTING DOCUMENTS"){ */
						var requiredDoc = $("div[id='requiredDoc']").length;
						filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
						numberOfDocument = requiredDoc;
						 
						if (numberOfDocument != filledDocument) {
							$("#hsraSupportingDocumentFieldset #save-continue").css({
								"opacity": "0.4", 
								"pointer-events": "none", 
								"cursor": "default"
							});
						} else {
							$("#hsraSupportingDocumentFieldset #save-continue").css({
								"opacity": "1", 
								"pointer-events": "auto", 
								"cursor": "pointer"
							});
						}
					/* } */
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
		$("#hsraEnrollDocuments").val("");
		$('.custom-file-label').html('Choose File');
		$("#documentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
		$("#commonuploadpopup").modal("show");
	}
    
    function supportingDocumentUpload() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var enrollDocuments = $(
				"#<portlet:namespace/>hsraEnrollDocuments").val();
		var documentuploadCounter = $("#documentuploadCounter").val();
		var fileID = 'hsraEnrollDocuments';
		var documentName = $("#<portlet:namespace/>documentName").val();
		$("#commonuploadpopup").modal("hide");
		$('.hidden' + documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'
				+ documentuploadCounter);
		progress.ariaValueNow = 50;
		progress.style.width = '50%';
		hsraApplicationId=$("#hsraApplicationId").val();
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'hsraEnrollDocuments',
					url : '${addHsraUploadDocumentUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>documentNumber" : documentNumber,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>issueDate" : issueDate,
						"<portlet:namespace/>expiryDate" : expiryDate,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
						"<portlet:namespace/>documentName" : documentName,
					},
					success : function(data, status) {
						var progress = document.getElementById('progress'
								+ documentuploadCounter);
						progress.ariaValueNow = 100;
						progress.style.width = '100%';
						$('.hidden' + documentuploadCounter).addClass('hide');
						$("#uploadedFormResult" + documentuploadCounter).html(data);
						$(
								"#<portlet:namespace/>uploaded-documents" 
										+ documentuploadCounter).hide();
						$(".uploaded-info").removeClass("hide");
						if (data != "") {
							$("#documentUpload" + documentuploadCounter)
									.addClass("disabled");
						}
						updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
			            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
			            filledDocument=updatedFillDoc-genericFilledDoc;
						if(numberOfDocument == filledDocument){
				        	$("#hsraSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				        }
						
					},
					error : function(data, status, e) {
					}
				});
		}
    $(function() {
		$(document).on('change', '#hsraEnrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
    
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
			  var requiredDoc = $("div[id='requiredDoc']").length;
			  var notRequireDoc = $("div[id='notRequiredDoc']").length;
	          if(requiredDoc >= 1){
	          if(documentuploadCounter <= requiredDoc){
					$("#requireDocNamePreview" + documentuploadCounter).html("");
					filledDocument = filledDocument -1;
					$("#hsraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		     }
		     }
				if(notRequireDoc >= 1){
					$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
				}
	      },
	      error: function (data) {

	      }
	  });
	}
	
	function deleteDocumentFee(fileEntryId){
		
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
			
				 checkFilePresence();
			},
			error : function(data) {

			}
		});
	}
	// Function to check if any files for payment remain and enable/disable the upload button
	function checkFilePresence() {
	    // Count the remaining file cards
	    var filesRemaining = $(".uploaded-info-two").length; // Adjust this selector if needed
	    if (filesRemaining === 0) {
	        // If no files are remaining, enable the upload button
	     
	        $("#hsra-payment-uploa, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
	    } else {
	        // Otherwise, disable the upload button
	    	$("#hsra-payment-uploa, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
	    }
	}

    $(document).ready(function(){
		continueApplicationForm();
	});
	//Save And Continue Functions code by Ritika Thapliyal
	function continueApplicationForm(){
		var hsraApplicationId = "<%=hsraApplicationId%>";
		if(hsraApplicationId > 0 ){
			showLastFormStep();
			showSelectedCategory();
			continueEditFormDetails();
			 $(".form-wizard-previous-btn").removeClass("hide");
		    $(".form-wizard-save-btn").removeClass("hide");
		}
	}

	function showLastFormStep(){
		var currentStage  = "<%=currentStage%>";
		console.log("currentStage******"+currentStage);
		$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
		    if($(this).text() == currentStage ){
		    	$(this).parents("li").addClass("active");
		    	$(this).parents("li").prevAll().removeClass("active");
		    	$(this).parents("li").prevAll().addClass("activated");
		    }
		});
		
		$( ".form-wizard fieldset" ).each( function( index, element ){
	        if($(this).attr("name") == currentStage ){
		    	$(this).addClass("show");
		    	$(this).prevAll().removeClass("show");
	    	}
		});
	}

	function continueEditFormDetails(){
		var lastFormStep = "<%=lastFormStep%>";
		console.log('lastFormStep***'+lastFormStep);
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		$(".tab-content .tab-pane").each(function(index, element) {
			if ($(this).attr("id") == lastFormStep) {
				$(this).addClass("active");
				$(this).prevAll().removeClass("active");
				$(this).nextAll().removeClass("active");
			}
		});
		$(".tab-plus-wizard-left li a").each(
				function(index, element) {
					if ($(this).attr("href") == "#" + lastFormStep) {
						$(this).parents().prevAll("li").find("a").removeClass("active disabled");
						$(this).addClass("active");
						$(this).removeClass("disabled");
					}
				});
	}

	function showSelectedCategory(){
		debugger;
		currentStage = "<%=currentStage%>";
		lastFormStep = "<%=lastFormStep%>";
		typeOfApplicant="<%=typeOfApplicant%>";
		typeOfActivities="<%=typeOfActivities%>";
		highOne="<%=highOne%>";
		highTwo="<%=highTwo%>";
		medium="<%=medium%>";
		lowOne="<%=lowOne%>";
		lowTwo="<%=lowTwo%>";
		riskLevel="<%=riskLevel%>";
		renewal="<%=renewal%>";
	    typeOfAppliaction="<%=typeOfApplication%>";
		typeOfTransaction="<%=typeOfTransaction%>";
		brokerTransaction="<%=brokerTransaction%>";
		specificApplicable="<%=specificApplicable%>";
		qualifiedArea="<%=qualifiedArea%>";
		$("#hsraApplicationId").val(<%=hsraApplicationId%>);
		var sizeOfUnsealedSourceAdd=<%=sizeOfUnsealedSourceAdd%>;
		var sizeOfSealedSourceAdd=<%=sizeOfSealedSourceAdd%>;
		var sizeOfRadiationDevices=<%=sizeOfRadiationDevices%>;
		var sizeOfMedicalPractitioner=<%=sizeOfMedicalPractitioner%>;
		var sizeOfSourcesDetail=<%=sizeOfSourcesDetail%>;
		var sizeOfRadionuclideAdd=<%=sizeOfRadionuclideAdd%>;
		var sizeOfAlternateRsoAdd=<%=sizeOfAlternateRsoAdd%>;
		var sizeOfQualifedExpertAdd=<%=sizeOfQualifedExpertAdd%>;
		var sizeOfAlternateRsoOneAdd=<%=sizeOfAlternateRsoOneAdd%>;
		var sizeOfGenEquipmentData=<%=sizeOfGenEquipmentData%>;
		var sizeOfQualifedExpertOneAdd=<%=sizeOfQualifedExpertOneAdd%>
		sealedSource = $('input[name="sealedSource"]:checked').val();
		var sizeOfAddMedicalPractitioner=<%=sizeOfAddMedicalPractitioner%>
		var sizeOfApplicant=<%=sizeOfApplicant%>
		paymentMethod="<%=paymentMethod%>";
		amount="<%=amount%>";
		currency="<%=currency%>";
		applicationType="<%=applicationType%>";
		applicationTypes="<%=applicationTypes%>";
		
		$("#rm-payment-method").val(paymentMethod);
		$("#applicationType").val(applicationType);
		$("#applicationTypes").val(applicationTypes);
		$("#amountCurrency").val(currency);
		$("#brokerTransactionType").val(brokerTransaction);
		
		if (applicationType === "New Licence") {
		    document.getElementById("newLicence").checked = true; 
		} else if (applicationType === "Permit") {
		    document.getElementById("permit").checked = true;
		}else if (applicationType === "New Registration") {
		    document.getElementById("newRegistration").checked = true;
		}else if (applicationType === "Renewal") {
		    document.getElementById("renewal").checked = true;
		}else if (applicationType === "Amendment") {
		    document.getElementById("amendent").checked = true;
		}
		
			if(typeOfApplicant=="Qualified Experts"){
					if(currentStage=="TYPE OF TRANSACTION"){
						$("#riskLevelType").addClass("hide");
						$("#applicationLicenceType").addClass("hide");
						$("#transactionType").addClass("hide");
						$("#type-of-transaction").addClass("hide");
						$("#qualifiedAreaType").removeClass("hide");
					}
			}
			else if((typeOfApplicant=="Service Providers")||(typeOfApplicant=="Users of Radiation Sources")){
				if(riskLevel=="High Risk"){
						$("#childStep7").addClass("hide");
						$(".section-six").addClass("hide");
						$("#supportingDocStep").html("13");
						$("#feePaymentStep").html("14");
						/* Update Payment Category */
						$("#userRadiationFeeIcon").removeClass("hide"); 
						$("#qualifiedFeeIcon,#serviceProvidersFeeIcon,#brokerFeeIcon").addClass("hide");
					}
					else if(riskLevel=="Low Risk"){
						$(".section-five").addClass("hide");
						$("#childStep6").addClass("hide");
						$("#supportingDocStep").html("13");
						 $("#feePaymentStep").html("14");
					}
				
				if(renewal=="true"){
				if(currentStage=="TYPE OF TRANSACTION"){
					$("#riskLevelType").addClass("hide");
					$("#applicationLicenceType").addClass("hide");
					$("#transactionType").addClass("hide");
					$("#type-of-transaction").addClass("hide");
					$("#specificApplicableType").removeClass("hide");
					if(riskLevel=="High Risk"){
					$("#childStep7").addClass("hide");
					$(".section-six").addClass("hide");
					 $("#supportingDocStep").html("13");
					 $("#feePaymentStep").html("14");
				}
				else if(riskLevel=="Low Risk"){
					$(".section-five").addClass("hide");
					$("#childStep6").addClass("hide");
					$("#supportingDocStep").html("13");
					 $("#feePaymentStep").html("14");
				}
				}
				
			}
			}
			if(sealedSource=="Yes"){
				$("#sealedManu").removeClass("hide");
			}else if(sealedSource=="No"){
				$(".sealNoMenu").removeClass("hide");
			}
		
	if (typeOfApplicant != "") {
			$("#applicantType .wizard-title").each(function(index, element) {
				if ($(this).text() == typeOfApplicant) {
					$(this).closest('a').click();
				}
			});
	}
	/* FEE PAYMENT */
	if (paymentMethod != "") {
	 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		    if($(this).text() == paymentMethod){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
	 	$("#amountPaid").val(amount);
	 	$("#amountCurrency").val(currency).trigger("change");
	  	}
	if(typeOfApplicant == "Users of Radiation Sources" || typeOfApplicant == "Service Providers" ){
		if(sizeOfUnsealedSourceAdd>0){
			var counterOfUnsealed=parseInt(sizeOfUnsealedSourceAdd)+1;
			$(".addUnsealedSourcesDetailTableBox").removeClass("hide");
			$("#unsealedSourcesDetailVal").val(counterOfUnsealed);
		}
		if(sizeOfSealedSourceAdd>0){
			var counterOfSealed=parseInt(sizeOfSealedSourceAdd)+1;
			$(".addSealedSourcesDetailTableBox").removeClass("hide");
			$("#sealedSourcesDetailVal").val(counterOfSealed);
		}
		if(sizeOfRadiationDevices>0){
			var counterOfRadiationDevices=parseInt(sizeOfRadiationDevices)+1;
			$(".addRadiationDevicesDetailTableBox").removeClass("hide");
			$("#radiationDevicesDetailVal").val(counterOfRadiationDevices);
		}
		if(sizeOfAddMedicalPractitioner>0){
			var counterOfAddMedicalPractitioner=parseInt(sizeOfAddMedicalPractitioner)+1;
			$(".addAcknowledgementMedicalDetailTableBox").removeClass("hide");
			$("#acknowledgementMedicalDetailVal").val(counterOfAddMedicalPractitioner);
		}
		
		if(sizeOfMedicalPractitioner>0){
			var counterOfMedicalPractitioner=parseInt(sizeOfMedicalPractitioner)+1;
			$(".addMedicalPractitionerDetailTableBox").removeClass("hide");
			$("#medicalPractitionerDetailVal").val(counterOfMedicalPractitioner);
		}
		if(sizeOfApplicant>0){
			var counterOfSizeOfApplicant=parseInt(sizeOfApplicant)+1;
			$(".addApplicantSignatureDetailTableBox").removeClass("hide");
			$("#applicantSignatureDetailVal").val(counterOfSizeOfApplicant);
		}
		
		if(sizeOfSourcesDetail>0){
			var counterOfSourcesDetail=parseInt(sizeOfSourcesDetail)+1;
			$(".addSourcesDetailTableBox").removeClass("hide");
			$("#sourcesDetailVal").val(counterOfSourcesDetail);
		}
		
		 if(sizeOfRadionuclideAdd>0){
			var counterOfRadionuclide=parseInt(sizeOfRadionuclideAdd)+1;
			$(".addRadionuclideDetailTableBox").removeClass("hide");
			$("#radionuclideDetailVal").val(counterOfRadionuclide);
		} 
		if(sizeOfAlternateRsoAdd>0){
			var counterOfAlternateRso=parseInt(sizeOfAlternateRsoAdd)+1;
			$(".addAlternateRsoDetailTableBox").removeClass("hide");
			$("#alternateRsoDetailVal").val(counterOfAlternateRso);
		}
		
		 if(sizeOfQualifedExpertAdd>0){
			var counterOfQualifiedExpect=parseInt(sizeOfQualifedExpertAdd)+1;
			$(".addQualifedExpertDetailTableBox").removeClass("hide");
			$("#qualifedExpertDetailVal").val(counterOfQualifiedExpect);
		}
		 if(sizeOfQualifedExpertOneAdd>0){
			var counterOfQualifiedOneExpect=parseInt(sizeOfQualifedExpertOneAdd)+1;
			$(".addQualifedExpertOneDetailTableBox").removeClass("hide");
			$("#qualifedExpertOneDetailVal").val(counterOfQualifiedOneExpect);
			}
			
		if(sizeOfAlternateRsoOneAdd>0){
			var counterOfAlternateRsoOne=parseInt(sizeOfAlternateRsoOneAdd)+1;
			$(".addAlternateRsoOneDetailTableBox").removeClass("hide");
			$("#alternateRsoOneDetailVal").val(counterOfAlternateRsoOne);
		}
		
		if(sizeOfGenEquipmentData>0){
			var counterOfGenEquipment=parseInt(sizeOfGenEquipmentData)+1;
			$(".addGenEquipmentDetailTableBox").removeClass("hide");
			$("#genEquipmentDetailVals").val(counterOfGenEquipment);
		}
		}
		if (typeOfApplicant == "Users of Radiation Sources") {
			if (typeOfActivities != "") {
				/*for enable button continueToTheNextStep*/
				$("#hsraApplicantTypeFieldset #save-continue").css({
					"opacity" : "1",
					"pointer-events" : "auto",
					"cursor" : "pointer"
				});
				/*remove class from the Category of Sources*/
				$(".category-sources").removeClass("hide");
				$("#type-of-activity .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfActivities) {
								$(this).closest(".wizard-card").addClass(
										"active");
							}
						});
			}
			

	if ((highOne && highOne.trim() !== "" && highOne !== "null")
					|| (highTwo && highTwo.trim() !== "" && highTwo !== "null")) {
				$("#sectionSixEditFormTab").addClass("hide");
			}

			if ((lowOne && lowOne.trim() !== "" && lowOne !== "null")
					|| (lowTwo && lowTwo.trim() !== "" && lowTwo !== "null")) {
				$("#sectionFiveEditFormTab").addClass("hide");
			}

			if (typeOfApplicant == "Users of Radiation Sources") {
				if (riskLevel == "High Risk") {
					$("#hsraPreviewStep5").removeClass("hide");
					$("#mediumRisk").addClass("disabled");
					$("#lowRisk").addClass("disabled");
					$("#risk-level .wizard-title").each(
							function(index, element) {
								if ($(this).text() == riskLevel) {
									$(this).closest(".wizard-card").addClass(
											"active");
								}
							});
				} else if (riskLevel == "Medium Risk") {
					$("#lowRisk").addClass("disabled");
					$("#highRisk").addClass("disabled");
					$("#riskLevelType #mediumRisk").removeClass("disabled");
					$("#riskLevelType #mediumRisk .wizard-title").removeClass(
							"disabled-individual-rd");
					$("#risk-level .wizard-title").each(
							function(index, element) {
								if ($(this).text() == riskLevel) {
									$(this).closest(".wizard-card").addClass(
											"active");
								}
							});
				} else if (riskLevel == "Low Risk") {
					$("#hsraPreviewStep6").removeClass("hide");
					$("#mediumRisk").addClass("disabled");
					$("#highRisk").addClass("disabled");
					$("#riskLevelType #lowRisk").removeClass("disabled");
					$("#riskLevelType #lowRisk .wizard-title").removeClass(
							"disabled-individual-rd");
					$("#risk-level .wizard-title").each(
							function(index, element) {
								if ($(this).text() == riskLevel) {
									$(this).closest(".wizard-card").addClass(
											"active");
								}
							});
				}
			}
			if (typeOfAppliaction != "") {
				$("#type-of-application .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfAppliaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
							}
						});
			}
			if (typeOfTransaction != "") {
				$("#type-of-transaction .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfTransaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
								$(this).click();
							}
						});
			}

			if (specificApplicable != "") {
				$(".nuclear-safety-forms").removeClass("hide");
				var arrayOfSelected = specificApplicable.split(",");
				if (typeOfApplicant == "Users of Radiation Sources") {
					$(
							".medical-practices, .industrial-radiography, .vetrinary-nuclear-medicine, .other-industries, .gauges, .petroleum-exploration, .serivicing, .manufacturing")
							.addClass("hide");
					if (arrayOfSelected.includes("(a)Medical Practices")) {
						$(".medical-practices").removeClass("hide");
						$("#medical-practices").addClass("active");

					}
					if (arrayOfSelected.includes("(b)Industrial Radiography")) {
						$(".industrial-radiography").removeClass("hide");
						$("#industrial-radiography").addClass("active");
					}

					if (arrayOfSelected
							.includes("(c)Veterinary Nuclear Medicine")) {
						$(".vetrinary-nuclear-medicine").removeClass("hide");
						$("#vetrinary-nuclear").addClass("active");
					}
					if (arrayOfSelected
							.includes("(d)Other Industries that use Nuclear Material")) {
						$(".other-industries").removeClass("hide");
						$("#other-industries-nuclear-material").addClass(
								"active");
					}
					if (arrayOfSelected
							.includes("(e)Gauges (Fixed &amp; Portable)")) {
						$(".gauges").removeClass("hide");
						$("#gauges-fixed-portal").addClass("active");
					}
					if (arrayOfSelected
							.includes("(f)Petroleum Exploration (Well Logging)")) {
						$(".petroleum-exploration").removeClass("hide");
						$("#petroleum-exploration-well").addClass("active");
					}
					if (arrayOfSelected.includes("(g)Servicing")) {
						$(".serivicing").removeClass("hide");
						$("#Servicing").addClass("active");
					}
					if (arrayOfSelected.includes("(h)Manufacturing")) {
						$(".manufacturing").removeClass("hide");
						$("#Manufacturing-card").addClass("active");
					}
					
				}
			}

		}
		if (typeOfApplicant == "Service Providers") {
			if (typeOfActivities != "") {
				$(
						".medical-practices, .industrial-radiography, .vetrinary-nuclear-medicine, .other-industries, .gauges, .petroleum-exploration, .serivicing, .manufacturing")
						.addClass("hide");
				$(".serivicing").removeClass("hide");
				$(".nuclear-safety-forms").removeClass("hide");
				$("#riskLevelType").addClass("hide");
				$("#supportingDocStep").html("9");
				$("#feePaymentStep").html("10");
				 /* Update Payment Category */
					$("#serviceProvidersFeeIcon").removeClass("hide");
					$("#qualifiedFeeIcon,#userRadiationFeeIcon,#brokerFeeIcon").addClass("hide"); 
				$(
						".section-five, .section-six, .notification-practices-forms, .fit-proper-declaration-forms")
						.addClass("hide");
				$("#type-of-activity .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfActivities) {
								$(this).closest(".wizard-card").addClass(
										"active");
								$(this).click();
							}
						});
			}
			if (typeOfAppliaction != "") {
				$("#type-of-application .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfAppliaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
							}
						});
			}
			if (typeOfTransaction != "") {
				$("#type-of-transaction .wizard-title").each(
						function(index, element) {
							if ($(this).text() == typeOfTransaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
								$(this).click();
							}
						});
			}

			if (specificApplicable != "") {
				var arrayOfSelected = specificApplicable.split(",");
				$(".medical-practices, .industrial-radiography, .vetrinary-nuclear-medicine, .other-industries, .gauges, .petroleum-exploration, .serivicing, .manufacturing").addClass("hide");
				if (arrayOfSelected.includes("(a)Medical Practices")) {
					$("#medical-practices").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected.includes("(b)Industrial Radiography")) {
					$("#industrial-radiography").addClass("active");
					$(this).closest("a").click();
				}

				if (arrayOfSelected.includes("(c)Veterinary Nuclear Medicine")) {
					$("#vetrinary-nuclear").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected
						.includes("(d)Other Industries that use Nuclear Material")) {
					$("#other-industries-nuclear-material").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected
						.includes("(e)Gauges (Fixed &amp; Portable)")) {
					$("#gauges-fixed-portal").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected
						.includes("(f)Petroleum Exploration (Well Logging)")) {
					$("#petroleum-exploration-well").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected.includes("(g)Servicing")) {
					$(".serivicing").removeClass("hide");
					$("#Servicing").addClass("active");
					$(this).closest("a").click();
				}
				if (arrayOfSelected.includes("(h)Manufacturing")) {
					$("#Manufacturing-card").addClass("active");
					$(this).closest("a").click();
				}
			}

		}
		if (typeOfApplicant == "Service Providers") {
			$("#registrationApplication").addClass("disabled");
			$(".serivicing").removeClass("hide");
		}
		
		if (typeOfApplicant == "Brokers") {
			$("#brokerTransactionType").removeClass("hide");
			$("#transactionType").addClass("hide");
			$("#authorizationSection").addClass("hide");
			$("#riskLevelType").addClass("hide");
			$("#applicationLicenceType").addClass("hide");
			$("#specific-applicable").addClass("hide");
			 $("#supportingDocStep").html("3");
			 $("#feePaymentStep").html("4");
			 /* Update Payment Category */
			 $("#brokerFeeIcon").removeClass("hide");
			 $("#qualifiedFeeIcon,#userRadiationFeeIcon,#serviceProvidersFeeIcon").addClass("hide"); 
			if (typeOfTransaction != "") {
				$(".broker-registration-forms").removeClass("hide");
				$("#brokerTransactionType .wizard-title").each(
						function(index, element) {
							if ($(this).text() == brokerTransaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
								$(this).click();
							}
						});
			}
			$("#payment_category").html("Brokers");
			$(".hsraFacilitiesFee").html("20,000");
			if(renewal=="true"){
			 $("#hsraTransactionFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
			}
		}

		if (typeOfApplicant == "Qualified Experts") {
			if (typeOfTransaction != "") {
				$("#brokerTransactionType").removeClass("hide");
				$("#transactionType").addClass("hide");
				$("#riskLevelType").addClass("hide");
				$("#applicationLicenceType").addClass("hide");
				$(".qualified-expert-forms").removeClass("hide");
				$("#supportingDocStep").html("5");
				$("#feePaymentStep").html("6");
				/* Update Payment Category */
				$("#qualifiedFeeIcon").removeClass("hide");
				$("#brokerFeeIcon,#userRadiationFeeIcon,#serviceProvidersFeeIcon").addClass("hide");
				$("#brokerTransactionType .wizard-title").each(
						function(index, element) {
							if ($(this).text() == brokerTransaction) {
								$(this).closest(".wizard-card").addClass(
										"active");
								$(this).click();
							}
						});
				if (qualifiedArea != "") {
					
					var arrayOfSelected = qualifiedArea.split(",");
					if (arrayOfSelected.includes("Diagnostic Radiology")) {
						$("#DiagnosticRadiology").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Radiotherapy")) {
						$("#Radiotherapy").addClass("active");
						$(this).closest("a").click();
					}

					if (arrayOfSelected.includes("Nuclear Medicine")) {
						$("#NuclearMedicine").addClass("active");
						$(this).closest("a").click();
					}
					
					if (arrayOfSelected
							.includes("Dentistry")) {
						$("#Dentistry").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected
							.includes("Veterinary Radiography")) {
						$("#VeterinaryRadiography").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Non-Destructive Testing")) {
						$("#NonDestructiveTesting").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Fixed Gauges and Fixed Screening Devices")) {
						$("#FixedGaugesScreeningDevices").addClass("active");
						$(this).closest("a").click();
					}
					
					if (arrayOfSelected.includes("Mobile Gauges and Mobile Screening Devices")) {
						$("#MobileGaugesMobileDevices").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Research with Us-Sealed Sources")) {
						$("#ResearchSealedSources").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Research with X-Ray Equipment and Sealed Sources")) {
						$("#ResearchX-RaySealedSources").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Nuclear Reactor")) {
						$("#NuclearReactor").addClass("active");
						$(this).closest("a").click();
					}
					if (arrayOfSelected.includes("Other Application")) {
						$("#OtherApplication").addClass("active");
						$(this).closest("a").click();
					}
				}
			}
		}
		gettingDocumentList();
		
		$(".appliName").html($("#organizationNameD").val());
		$(".bornDate").html($("#applicantDateBirth").val());
		$(".parishName").html($("#parishArea").val());
		$(".countryName").html($("#applicantCountry").val());
		$(".residingTown").html($("#applicantTownName").val());
		$(".dateCertificate").html($("#dateApplicant").val());
		$(".appliNameD").html($("#expertFirstName").val());
		
		if (brokerTransaction === "New") {
		    document.getElementById("applicationType1").checked = true; 
		}else if (brokerTransaction === "Renewal") {
		    document.getElementById("applicationType2").checked = true;
		}else if (brokerTransaction === "Variation") {
		    document.getElementById("applicationType3").checked = true;
		}
	}

	$(".hidePopup").click(function() {
		$(".editUnsealedSourcesEditTabPopup").modal("hide");
		$(".editSealedSourcesEditTabPopup").modal("hide");
		$(".editRadiationDevicesEditTabPopup").modal("hide");
		$(".editMedicalPractitionerEditTabPopup").modal("hide");
		$(".editSourcesDetailEditTabPopup").modal("hide");
		$(".editRadionuclideDetailEditTabPopup").modal("hide");
		$(".editGenEquipmentEditTabPopup").modal("hide");
		$(".editAlternateRsoDetailEditTabPopup").modal("hide");
		$(".editQualifedExpertDetailEditTabPopup").modal("hide");
		$(".editAlternateRsoOneDetailEditTabPopup").modal("hide");
		$(".editQualifedExpertOneDetailEditTabPopup").modal("hide");
		$(".editAcknowledgementMedicalEditTabPopup").modal("hide");
		$(".editApplicantSignatureEditTabPopup").modal("hide");
	});
</script>