<%@ include file="/init.jsp" %>
<%@ include file="/medical-facilities-wizard.jsp" %>
<%@ include file="/js/nursing-home-js.jsp" %>
<%@ include file="/medical-popup.jsp" %>
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
                        <p class="modal-subtitle f2">Your application for registration of an Institutional Healthcare Facility / Healthcare Facility has been correctly saved as a draft.</p>
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
                                            <svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none">
												<path fill-rule="evenodd" clip-rule="evenodd" d="M110 107.707C113.797 107.707 116.875 110.785 116.875 114.582V121.457H123.75C127.547 121.457 130.625 124.535 130.625 128.332C130.625 132.129 127.547 135.207 123.75 135.207H116.875V142.082C116.875 145.879 113.797 148.957 110 148.957C106.203 148.957 103.125 145.879 103.125 142.082V135.207H96.25C92.4532 135.207 89.375 132.129 89.375 128.332C89.375 124.535 92.4532 121.457 96.25 121.457H103.125V114.582C103.125 110.785 106.203 107.707 110 107.707Z" fill="#047247"/>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M109.523 11.457C101.287 11.4568 94.4191 11.4566 88.9669 12.1896C83.2122 12.9633 78.0165 14.6653 73.8414 18.8404C69.6662 23.0156 67.9643 28.2112 67.1905 33.966C66.4575 39.4181 66.4577 46.286 66.458 54.522V55.2345C47.9305 55.8407 36.8048 58.0056 29.0724 65.7382C18.333 76.4776 18.333 93.7627 18.333 128.332C18.333 162.901 18.333 180.187 29.0724 190.926C39.8118 201.665 57.0966 201.665 91.6662 201.665H128.333C162.902 201.665 180.188 201.665 190.927 190.926C201.666 180.187 201.666 162.901 201.666 128.332C201.666 93.7627 201.666 76.4776 190.927 65.7382C183.195 58.0056 172.069 55.8407 153.541 55.2345V54.5221C153.541 46.2862 153.542 39.4181 152.809 33.966C152.035 28.2112 150.333 23.0156 146.158 18.8404C141.983 14.6653 136.787 12.9633 131.033 12.1896C125.58 11.4566 118.713 11.4568 110.476 11.457H109.523ZM139.791 55.016V54.9987C139.791 46.1619 139.777 40.226 139.182 35.7982C138.613 31.5681 137.63 29.7577 136.435 28.5631C135.241 27.3685 133.431 26.3857 129.2 25.817C124.773 25.2217 118.836 25.207 110 25.207C101.163 25.207 95.2267 25.2217 90.7991 25.817C86.569 26.3857 84.7586 27.3685 83.5641 28.5631C82.3695 29.7577 81.3867 31.5681 80.818 35.7982C80.2226 40.226 80.208 46.1619 80.208 54.9987V55.016C83.8016 54.9987 87.6153 54.9987 91.6663 54.9987H128.333C132.384 54.9987 136.198 54.9987 139.791 55.016ZM146.666 128.332C146.666 148.582 130.25 164.999 110 164.999C89.7492 164.999 73.333 148.582 73.333 128.332C73.333 108.082 89.7492 91.6654 110 91.6654C130.25 91.6654 146.666 108.082 146.666 128.332Z" fill="#047247"/>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">Institutional Healthcare Facility / Healthcare Facility Application<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Type/Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"><span></span>/<span id="pop_typeOfTransaction"></span></p>
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
$(".hidePopup").click(function () {
	$(".editApplicantDetailEditTabPopup").modal("hide");
	$(".editHomeDetailEditTabPopup").modal("hide");
	$(".editcompanyDetailEditTabPopup").modal("hide");
	$(".editPatientCounEditTabPopup").modal("hide");
	$(".editNursingStaffEditTabPopup").modal("hide");
	$(".editMedicalPractitionerTabPopup").modal("hide");
	$(".editMaternityDetailEditTabPopup").modal("hide");
});

/* save and continue */
$(document).ready(function () {
	continueApplicationForm();
});

function continueApplicationForm(){
	var medicalApplicationId = "<%=medicalApplicationId%>";
	if(medicalApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();
		gettingDocumentList();
	}
}
function showLastFormStep(){
	var currentStage = "<%=currentStage %>";
	console.log("Current stage****"+currentStage);
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
function showSelectedCategory(){
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	sizeOfApplicantDetailAdd="<%=sizeOfApplicantDetailAdd%>";
	sizeOfHomeDetailAdd="<%=sizeOfHomeDetailAdd%>";
	sizeOfPatientCount="<%=sizeOfPatientCount%>";
	sizeOfNursingStaff="<%=sizeOfNursingStaff%>";
	sizeOfPracticeNurse="<%=sizeOfPracticeNurse%>";
	sizeOfMaternityHome="<%=sizeOfMaternityHome%>";
	sizeOfCompanyDetail="<%=sizeOfCompanyDetail%>";
	natureOfApplicant="<%=natureOfApplicant%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	
	medicalCategory="<%=medicalCategory%>";
	subCategory="<%=subCategory%>";
	nursingHomesCategory="<%=nursingHomesCategory%>";
	nursingHomesSubCategoryVal="<%=nursingHomesSubCategoryVal%>";
	numberOfBeds="<%=numberOfBeds%>";
	paymentMethod="<%=paymentMethod%>";
	
	var separator = ',';
    var resultArr = nursingHomesCategory.split(separator);
	
	$("#medicalApplicationId").val(<%=medicalApplicationId%>);
	$("#medicalApplicantTypeVal").val(natureOfApplicant);
	$("#medicalTransactionTypeVal").val(typeOfTransaction);
	
	$("#medicalFacilitiesCategoryTypeVal").val(medicalCategory);
	if(medicalCategory=="Long Term Care Facilities"){
		$("#longTermCategoryTypeVal").val(subCategory);
	}else if(medicalCategory=="Hospitals"||medicalCategory=="Ambulatory Facilities"){
		$("#medicalFacilitiesSubCategoryTypeVal").val(subCategory);
	}
	$("#nursingHomeCategoryVal").val(nursingHomesCategory);
	$("#nursingHomesSubCategoryVal").val(nursingHomesSubCategoryVal);
	$("#residentsCapacityCategoryVal").val(numberOfBeds);
	$("#payment-method").val(paymentMethod);
	
	if(sizeOfApplicantDetailAdd>0){
		var counterOfApplicantDetail=parseInt(sizeOfApplicantDetailAdd)+1;
		$(".addApplicantDetailTableBox").removeClass("hide");
		$("#applicantDetailVal").val(counterOfApplicantDetail);
	}
	if(sizeOfHomeDetailAdd>0){
		var counterOfHomeDetail=parseInt(sizeOfHomeDetailAdd)+1;
		$(".addHomeDetailTableBox").removeClass("hide");
		$("#homeDetailVal").val(counterOfHomeDetail);
	}
	if(sizeOfPatientCount>0){
		var counterOfNumPatient=parseInt(sizeOfPatientCount)+1;
		$(".addPatientCountTableBox").removeClass("hide");
		$("#patientCountVal").val(counterOfNumPatient);
	}
	if(sizeOfNursingStaff>0){
		var counterOfNursingStaff=parseInt(sizeOfNursingStaff)+1;
		$(".addNursingStaffDetailTableBox").removeClass("hide");
		$("#nursingStaffDetailVal").val(counterOfNursingStaff);
	}
	if(sizeOfPracticeNurse>0){
		var counterOfPracticeNurse=parseInt(sizeOfPracticeNurse)+1;
		$(".addMedicalPractitionerDetailTableBox").removeClass("hide");
		$("#medicalPractitionerDetailVal").val(counterOfPracticeNurse);
	}
	if(sizeOfMaternityHome>0){
		var counterOfMaternityHome=parseInt(sizeOfMaternityHome)+1;
		$(".addMaternityHomeDetailTableBox").removeClass("hide");
		$("#maternityHomeDetailVal").val(counterOfMaternityHome);
	}
	if(sizeOfCompanyDetail>0){
		var counterOfCompanyDetail=parseInt(sizeOfCompanyDetail)+1;
		$(".addCompanyDetailTableBox").removeClass("hide");
		$("#companyDetailVal").val(counterOfCompanyDetail);
	}
	
	/* Nature of Applicant */
	 if (natureOfApplicant == "Individual"){
		$("#individualApplicant .wizard-title").trigger("click");
	}else if (natureOfApplicant == "Company/Society/Association"){
		$("#companyApplicant .wizard-title").trigger("click");
	}
	/* Type of Transaction */
	 if (typeOfTransaction == "New"){
		$("#ncraNewBtn .wizard-title").trigger("click");
	}else if (typeOfTransaction == "Renewal"){
		$("#ncraRenewBtn .wizard-title").trigger("click");
		/* $("#medicalRenewSection").removeClass("hide"); */
	}
	
	 if(medicalCategory !=""){
		$("#medicalFacilitiesCategoryType .wizard-title").each( function( index, element ){
	    if($(this).text() == medicalCategory){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	    	}
		  });
		} 	
 if(medicalCategory=="Long Term Care Facilities"){
		$("#longTermCategoryBox .wizard-title").each( function( index, element ){
	    if($(this).text() == subCategory){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	    	}
		  });
	 }else if(medicalCategory=="Hospitals"||medicalCategory=="Ambulatory Facilities"){
			$("#medicalFacilitiesSubCategoryBox .wizard-title").each( function( index, element ){
		    if($(this).text() == subCategory){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
		}
	 /* if(numberOfBeds !=""){
			$("#residentsCapacityTypeBox .wizard-title").each( function( index, element ){
		    if($(this).text() == numberOfBeds){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
			} */
	 if (nursingHomesCategory != "") {
		    $("#nursingHomesCategoryBox .wizard-title").each(function(index, element) {
		        if (resultArr.includes($(this).text())){
		        	$(this).closest('.wizard-card-title').addClass("active");
		        	/* $(".residents-capacity-category").removeClass("hide"); */
		        	$(this).closest("a").click();
		        }
		    });
		}
		
	 if(nursingHomesSubCategoryVal !=""){
			$("#nursingHomesSubCategoryBox .wizard-title").each( function( index, element ){
		    if($(this).text() == nursingHomesSubCategoryVal){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
	 }
			numberOfBeds=$("#residentsCapacityCategoryVal").val();
			if(numberOfBeds !=""){
				$("#residentsCapacityTypeBox .wizard-title").each( function( index, element ){
			    if($(this).text() == numberOfBeds){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			    	}
				  });
				}
	    	if(numberOfBeds == "Less than 25 Beds"){
				$(".medicalFacilitiesFee").html("5,000.00");
			}else{
				$(".medicalFacilitiesFee").html("10,000.00");
			}
			
	 /* FEE */
	 if (paymentMethod != "") {
	 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		    if($(this).text() == paymentMethod){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
	  	}
	 gettingDocumentList();	
	 
	 if(currentStage == "SUPPORTING DOCUMENTS"){
			var requiredDoc = $("div[id='requiredDoc']").length;
	    	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
	    	if(requiredDoc > 0){
	    		$(".mandatory-doc-heading").removeClass("hide");
	    		numberOfDocument = requiredDoc;
	    		if(numberOfDocument != filledDocument){
	        		 $("#quarrySupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"}); 
	        	}
	    	}
		}
	 if($(".generic-document .supporting-document-card").length > 0){
			$(".noAdditionalSupportingDoc").addClass("hide");
		}
}
function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormStep%>";
	$( ".tab-content .tab-pane" ).each( function( index, element ){
	    if($(this).attr("id") == lastFormStep ){
	    	$(this).addClass("active");
	    	$(this).prevAll().removeClass("active");
	    	$(this).nextAll().removeClass("active");
	    }
	});
	
	$(".tab-plus-wizard-left li a").each( function( index, element ){
	    if($(this).attr("href") == "#"+lastFormStep ){
	    	$(this).parents().prevAll("li").find("a").removeClass("active disabled");
	    	$(this).addClass("active");
	    	$(this).removeClass("disabled");
	    }
	});
}
function addHomeDetailInfo(isSaveAndContinue){
	homeCarriedName=$("#homeCarriedName").val();
	homeAddress=$("#homeAddress").val();
	homeTelephone=$("#homeTelephone").val();
	homeEmailAddress=$("#homeEmailAddress").val();
	homeSitutationDescription=$("#homeSitutationDescription").val();
	homeOtherBusinessPremises=$("#homeOtherBusinessPremises").val();
	maternityPatientNum=$("#maternityPatientNum").val();
	otherPatientNum=$("#otherPatientNum").val();
	medicalApplicationId=$("#medicalApplicationId").val();
	  $.ajax({
	      type: "POST",
	      url: "${medicalFacilitiesHomeDetailUrl}",	
	      data: {
	        "<portlet:namespace/>homeCarriedName": homeCarriedName,
	        "<portlet:namespace/>homeAddress": homeAddress,
	        "<portlet:namespace/>homeTelephone": homeTelephone,
	        "<portlet:namespace/>homeEmailAddress": homeEmailAddress,
	        "<portlet:namespace/>homeSitutationDescription": homeSitutationDescription,
	        "<portlet:namespace/>homeOtherBusinessPremises": homeOtherBusinessPremises,
	        "<portlet:namespace/>maternityPatientNum": maternityPatientNum,
	        "<portlet:namespace/>otherPatientNum": otherPatientNum,
	        "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
	       
	         },
	      success: function (data) {
	    	  if(!isSaveAndContinue){
	    		  applicantInfo();
	    	  }
	      },
	      error: function (data) {},
	    });
	}
function addNureStaffPremises(isSaveAndContinue){
	nursingStaffCategory=$("#nursingStaffCategory").val();
	medicalApplicationId=$("#medicalApplicationId").val();
	  $.ajax({
	      type: "POST",
	      url: "${medicalFacilitiesNurseStaffPremisesUrl}",	
	      data: {
	        "<portlet:namespace/>nursingStaffCategory": nursingStaffCategory,
	        "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
	       
	         },
	      success: function (data) {
	    	  if(!isSaveAndContinue){
	    		  applicantInfo();
	    		  addNursingStaffDetail();
	    	  }
	      },
	      error: function (data) {},
	    });
	}

function applicantdetail(){
	addApplicantDetail();
	applicantInfo();

	}

function maternityhome(){
	addMaternityHomeDetail();
	applicantInfo();

	}


$(document).ready(function () {
    var selectedFiles = [];
    var selectedGenericFiles = [];
    
    function updateFileInput() {
        var newFileList = new DataTransfer();
        for (var i = 0; i < selectedFiles.length; i++) {
            newFileList.items.add(selectedFiles[i]);
        }
        $('#medicalGenericUpload')[0].files = newFileList.files;
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

    $(document).on('change', '#medicalGenericUpload', function () {
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
            var medicalApplicationId = "<%=medicalApplicationId%>";
        	if(medicalApplicationId > 0 ){
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
            $("#medicalFormPreviewFieldset .custom_loader").removeClass("hide");
            $(".preview-section").addClass("hide");
        } else {
        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
            $('.uploaded-delete').hide();
            $(".noAdditionalSupportingDoc").show();
            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
            $("#medicalFormPreviewFieldset .custom_loader").addClass("hide");
            $(".preview-section").removeClass("hide");
        	}
        }
    });
});

function deleteDoc(id) {
    var currentId = id;
	$(".document-container-preview"+currentId).remove();
}


function deleteGenericDocmentAfterSaveAndContinue(fileEntryId) {
	documentuploadCounter = $("#counterForGenericDoc").val();
	$.ajax({
		type : "POST",
		url : '${deleteGenericDocOfMedicalUrl}',
		data : {
			"<portlet:namespace/>fileEntryId" : fileEntryId,
		},
		success : function(data) {
			$("#deletepopup" + fileEntryId).modal("hide");
			$("#genericSupportingDocuments" + documentuploadCounter).remove();
			$("#documentUpload" + documentuploadCounter).removeClass("disabled");
		},
		error : function(data) {

		}
	});
}
function deleteDocumentFee(fileEntryId) {
	documentuploadCounter = $("#counterForGenericDoc").val();
	$.ajax({
		type : "POST",
		url : '${deleteGenericDocOfMedicalUrl}',
		data : {
			"<portlet:namespace/>fileEntryId" : fileEntryId,
		},
		success : function(data) {
			$("#deletepopup" + fileEntryId).modal("hide");
			$("#unpload-info-card" + fileEntryId).remove();
			$("#documentUpload" + documentuploadCounter).removeClass("disabled");
			
			
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
     
        $("#medical-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
    } else {
        // Otherwise, disable the upload button
    	$("#medical-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
    }
}
</script>