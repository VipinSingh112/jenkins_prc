<%@ include file="/init.jsp" %>
<%@ include file="/fire-brigade-wizard.jsp" %>
<div class="modal fade commonsavepopup savecountinuePopup"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
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
						<p class="modal-subtitle f2">Your application for a
							Fire/Occupancy Certificate has been correctly saved as draft.</p>
						<p class="modal-info f2">
							You will be able to continue your application process at any
							moment. You can find the draft in <a
								href="/group/guest/dashboard">your Dashboard:</a>
						</p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box ml-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 512 512" fill="none">
												<path d="M368 480H144C133.391 480 123.217 475.786 115.716 468.284C108.214 460.783 104 450.609 104 440V71.9999C104 61.3912 108.214 51.2171 115.716 43.7156C123.217 36.2142 133.391 31.9999 144 31.9999H290.72C295.976 31.9905 301.183 33.0172 306.042 35.0214C310.902 37.0255 315.318 39.9678 319.04 43.6799L396.32 120.96C400.032 124.682 402.974 129.098 404.979 133.958C406.983 138.817 408.009 144.024 408 149.28V440C408 450.609 403.786 460.783 396.284 468.284C388.783 475.786 378.609 480 368 480ZM144 47.9999C137.635 47.9999 131.53 50.5285 127.029 55.0293C122.529 59.5302 120 65.6347 120 71.9999V440C120 446.365 122.529 452.47 127.029 456.971C131.53 461.471 137.635 464 144 464H368C374.365 464 380.47 461.471 384.971 456.971C389.471 452.47 392 446.365 392 440V149.28C391.994 142.917 389.462 136.817 384.96 132.32L307.68 55.0399C303.183 50.5377 297.083 48.0055 290.72 47.9999H144Z" fill="#047247"/>
												<path d="M257.229 269.453C257.229 269.453 239.486 283.566 239.486 294.974C239.486 300.082 247.09 305.186 257.229 305.186C267.36 305.186 274.964 300.082 274.964 294.974C274.964 283.156 257.229 269.453 257.229 269.453ZM321.912 243.657C322.939 231.231 326.583 219.822 333 209.368L308.364 185C300.583 191.627 291.717 195.295 281.67 195.944C272.467 196.767 263.744 195.038 255.542 190.742C247.101 194.896 238.411 196.633 229.351 195.944C219.983 195.114 211.524 191.83 203.952 186.008L179.246 210.365C185.322 220.972 188.706 232.068 189.37 243.657C189.685 248.993 188.145 256.334 184.691 265.832C183.12 270.318 181.75 274.871 180.584 279.477C179.719 283.265 179.18 286.346 179.004 288.652C178.876 298.766 181.747 307.905 187.632 316.021C192.23 321.948 199.812 328.495 210.343 335.651C221.867 341.451 230.781 345.214 237.025 346.823L242.203 349.201C243.834 349.97 245.58 350.724 247.398 351.547C251.325 353.871 254.083 356.394 255.542 359C257.32 356.183 260.14 353.722 263.895 351.547C266.141 350.59 268.369 349.59 270.575 348.545L274.484 346.82C275.819 346.164 277.575 345.413 279.687 344.587C282.313 343.559 284.953 342.567 287.607 341.611C293.69 339.483 298.126 337.467 300.935 335.647C311.15 328.491 318.619 322.053 323.368 316.289C329.465 308.14 332.424 298.965 332.289 288.648C331.926 284.03 329.949 276.638 326.36 266.571C322.939 256.766 321.421 249.153 321.912 243.657ZM257.229 315.394C234.836 315.394 214.145 297.109 214.145 274.557C214.145 259.242 225.989 244.774 229.351 238.825L239.486 254.141L257.229 228.621L274.964 254.141L285.113 238.825C288.465 244.774 300.319 259.242 300.319 274.557C300.319 297.109 279.624 315.394 257.229 315.394Z" fill="#047247"/>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">Fire/Occupancy Certificate
												Transaction Number</p>
											<p class="licence-number f2" id="pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Category/ Sub Category</p>
										<p class="tier-box-upper f2" id="pop_category"></p>
									</div>
								</div>
								<div class="col-lg-3 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="" class="draftlink f2" id="pop_status">Draft</a>
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
				<div>
					<a href="/home"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Go back to the Homepage
					</a>
				</div>
				<div>
					<a href="/group/guest/dashboard" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
						Continue to your dashboard<span class="ml-2"> <svg
								width="22" height="17" viewBox="0 0 22 17" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
									fill="#1B1917" />
                                <path
									d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
									fill="#1B1917" />
                                <path
									d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z"
									fill="#323232" />
                            </svg>
								<input type="hidden" id="sez-status-child-category" name="sez-status-child-category">
					</span>
					</a>
				</div>
			</div>
		</div>
	</div>
</div> 
<script>
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

$(document).ready(function(){
	continueApplicationForm();
	gettingDocumentList();
});
//Save And Continue Functions
function continueApplicationForm(){
	var fireBrigadeApplicationId = "<%=fireBrigadeApplicationId%>";
	if(fireBrigadeApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();
	}
}

function showLastFormStep(){
	var currentStage = "<%=currentStage%>";
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
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	certificateType="<%=certificateType%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	typeOfApplicant="<%=typeOfApplicant%>";
	typeOfPermises="<%=typeOfPermises%>";
	purposeOfCertificate="<%=purposeOfCertificate%>";
	firebrigadeAppId="<%=fireBrigadeApplicationId%>";
	$("#fireBrigadeApplicationId").val(firebrigadeAppId);
	parish="<%=parish%>";
	equipment="<%=equipment%>";
	certificatePre="<%=certificatePre%>";
	paymentMethod="<%=paymentMethod%>";
	amount="<%=amount%>";
	currency="<%=currency%>";
	premisesCerti="<%=premisesCerti%>";
	$("#certificateTypeVal").val(certificateType);
	$("#applicationTypeVal").val(typeOfTransaction);
	$("#rm-payment-method").val(paymentMethod);
	$("#amountPaid").val(amount);
	$("#amountCurrency").val(currency);
	
	var selectedOptionText = $("#amountCurrency option:selected").text(currency);
	
	if(certificateType!= ""){
		$( "#fire-brigade-type-box .wizard-title" ).each( function( index, element ){
		    if($(this).text() == certificateType ){
		    	$(this).closest('a').click();
		    	
		    }
		});
	}
		if (typeOfTransaction != "") {
		$("#certificateType .wizard-title").each(function(index, element) {
			if ($(this).text() == typeOfTransaction) {
				$(this).closest('a').click();
			}
		});
    }

	if (typeOfApplicant != "") {
		$("#applicantTypeBox .wizard-title").each(function(index, element) {
			if ($(this).text() == typeOfApplicant) {
				$(this).closest('a').click();
			}
		});
    }
	
	if (typeOfPermises != "") {
		$("#premisesTypeBox .wizard-title").each(function(index, element) {
			if ($(this).text() == typeOfPermises) {
				$(this).closest('a').click();
			}
		});
    }
	
	if (purposeOfCertificate != "") {
		$("#certificatePurposeBox .wizard-title").each(function(index, element) {
			if ($(this).text() == purposeOfCertificate) {
				$(this).closest('a').click();
			}
		});
    }
	
	if (equipment.includes("Hose Reels")) {
        $(".equipmentProtection1").removeClass("hide");
    }if (equipment.includes("Portable Fire Extinguishers")) {
        $(".equipmentProtection2").removeClass("hide");
    }if (equipment.includes("Fire Alarm")) {
        $(".equipmentProtection3").removeClass("hide");
    }if (equipment.includes("Smoke/Heat detectors")) {
        $(".equipmentProtection4").removeClass("hide");
    }if (equipment.includes("Sprinkler System")) {
        $(".equipmentProtection5").removeClass("hide");
    }if (equipment.includes("Hydrant")) {
        $(".equipmentProtection6").removeClass("hide");
    }if (equipment.includes("Other")) {
        $(".otherSpecify").removeClass("hide");
    }
    if (certificatePre.includes("Other")) {
        $(".otherCertificatePurpose").removeClass("hide");
    }
    
    /* FEE PAYMENT */
	if (paymentMethod != "") {
	 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		    if($(this).text() == paymentMethod){
		    	$(this).closest("a").click();
		    	}
			  });
	 	$("#amountPaid").val(amount);
	 	$("#amountCurrency").val(currency).trigger("change");
	  	}
	
	permises=$("input[name='premisesOccupancy']:checked").val();
	if(permises=="Single floor structure occupancy"){
		$(".floor-structure-info-form").addClass("hide");
		$("#floorStructureFormMessage").html("You have Single floor structure occupancy , so no need to fill out this form, Please move forward.");
	}
    
	if(typeOfTransaction=="Application for Recertification"){
		if (typeOfTransaction != "") {
			$("#certificateType .wizard-title").each(function(index, element) {
				if ($(this).text() == typeOfTransaction) {
					$(this).closest('a').click();
				}
			});
	    }
	}
	if(premisesCerti=="Yes"){
		$(".premisesCertifiedOption").removeClass("hide");
	}else{
		$(".premisesCertifiedOption").addClass("hide");
	}
	
	}

$(document).ready(function () {
    var selectedFiles = [];
    var selectedGenericFiles = [];
    
    function updateFileInput() {
        var newFileList = new DataTransfer();
        for (var i = 0; i < selectedFiles.length; i++) {
            newFileList.items.add(selectedFiles[i]);
        }
        $('#fireBrigadeGenericUpload')[0].files = newFileList.files;
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

    $(document).on('change', '#fireBrigadeGenericUpload', function () {
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
            var fireBrigadeApplicationId = "<%=fireBrigadeApplicationId%>";
        	if(fireBrigadeApplicationId > 0 ){
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
            $("#fireBrigadeformPreviewFieldset .custom_loader").removeClass("hide");
            $(".preview-section").addClass("hide");
        }else {
        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
            $('.uploaded-delete').hide();
            $(".noAdditionalSupportingDoc").show();
            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
            $("#fireBrigadeformPreviewFieldset .custom_loader").addClass("hide");
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
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	var fileID = fileID;
	 var fileInput = $("#" + fileID)[0]; // File input element
   var fileLength = fileInput.files.length; // Count of selected files
  var saveAndConCheck = $("#saveAndConCheck").val();
	
//Decide what to send to the backend
  var fileData = fileLength > 0 ? fileID : "0";

  // Show loader
  $("#fireBrigadeformPreviewFieldset .custom_loader").removeClass("hide");
  $(".preview-section").addClass("hide");
	$.ajaxFileUpload({
		secureuri : false,
		method : "POST",
		fileElementId : fileID,
		url : '${fireBrigadeGenericSupportingDocUrl}',
		dataType : 'text',
		data : {
			"<portlet:namespace/>fileID" : fileID,
			"<portlet:namespace/>folderName": folderName,
			"<portlet:namespace/>command" : "fileUpload",
			"<portlet:namespace/>fireBrigadeApplicationId" : fireBrigadeApplicationId,
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
	                var counter = 1;
	                $.each(responseData,function(key,entry){
	                	console.log("File name is - " + entry.fileName);  // Check if fileName is being accessed correctly
	                    console.log("File URL is - " + entry.downloadFileUrl);  // Check if downloadFileUrl is being accessed correctly
	                    
	                    var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
	                    
	                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
	                    
	                    $('#additionalDocPreview').append(documentContainerPreview);
	                    counter++;
	                    $(".noAdditionalSupportingDoc").addClass("hide");
					});
				}else{
					$(".noAdditionalSupportingDoc").removeClass("hide");
					$.each(parsedData.fileData, function(index, entry) {
		        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
		        	    console.log(entry); // Log each entry in fileData
		        	    console.log(entry.fileName); // This should log "hello.pdf" for the first entry
		        	    $("."+fileID).html(fileTitle); // Set file title
		        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
		        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
		        	});
				}
     	        } catch (e) {
            }
			$("#fireBrigadeformPreviewFieldset .custom_loader").addClass("hide");
            $(".preview-section").removeClass("hide");
            $(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });

        },
        error: function(data, status, e) {
            console.error("Error during file upload", e);
        }
    });
}
 
function submitFeeDetailsInFireBrigade(){
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
    paymentMethod = $("#paymentMethod").val();
    paymentFee = $("#paymentFee").val();
    amountPaid=$("#amountPaid").val();
    amountCurrency=$("#amountCurrency").val();
    if(paymentMethod=="Credit Card"){
	    $.ajax({
	        type: "POST",
	        url: '${fireBrigadefeeDetailsUrl}',
	        data: {
	          "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
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
		     var fileID = 'fire-brigade-payment-upload';
	   		$.ajaxFileUpload({
	   		    secureuri: false,
	   		    method: "POST",
	   		    url: "${fireBrigadefeeDetailsUrl}",
	   		    fileElementId: 'fire-brigade-payment-upload',
	   		    dataType: 'text',
	   		    data: {
	   		      "<portlet:namespace/>fileID": fileID,
	   		      "<portlet:namespace/>command": "fileUpload",
	   		      "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
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

</script>