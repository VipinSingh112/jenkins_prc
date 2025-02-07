<portlet:resourceURL var="applicantDetailInfo" id="/applicant/Detail/Info"></portlet:resourceURL>
<portlet:resourceURL var="insolventPersonDetail" id="/insolvent/person/Detail/Info"></portlet:resourceURL>
<portlet:resourceURL var="creditorNameInfo" id="/creditor/name/info"></portlet:resourceURL>
<portlet:resourceURL var="assignmentDetailInfo" id="/assignment/detail/info"></portlet:resourceURL>
<script>
	$("#applicantNature").change(function(){
	    applicantNature = $(this).val();
	    if(applicantNature == "Individual"){
	    	$(".indi-detail").removeClass("hide");
	    	$(".com-detail").addClass("hide");
	    }else{
	    	$(".com-detail").removeClass("hide");
	    	$(".indi-detail").addClass("hide");
	    }
	});
	$("#insolventPersonNature").change(function(){
	    insolventPersonNature = $(this).val();
	    if(insolventPersonNature == "Individual"){
	    	$(".insolvent-indi-detail").removeClass("hide");
	    	$(".insolvent-com-detail").addClass("hide");
	    }else{
	    	$(".insolvent-com-detail").removeClass("hide");
	    	$(".insolvent-indi-detail").addClass("hide");
	    }
	});
	function applicantDetailInfo(isSaveAndContinue){
		applicantNature = $("#applicantNature").val();
		indiFirstName = $("#indiFirstName").val();
		indiLastName = $("#indiLastName").val();
		indiName = indiFirstName+" "+indiLastName;
		$(".indiName").text(indiName);
		companyName = $("#companyName").val();
		address = $("#address").val();
		emailAddress = $("#emailAddress").val();
		telephone = $("#telephone").val();
		applicationDate = $("#applicationDate").val();
		trnNumber = $("#trnNumber").val();
		osiServicesApplicationId = $("#osiServicesApplicationId").val();
		submitForm = true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!isSaveAndContinue){
			if(!trnNumber){
				$("#trnNumber").focus();
				$("#trnNumberValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#trnNumberValidation").addClass("hide");
			}
			if(!applicationDate){
				$("#applicationDate").focus();
				$("#applicationDateValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#applicationDateValidation").addClass("hide");
			}
			if(!telephone){
				$("#telephone").focus();
				$("#telephoneValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#telephoneValidation").addClass("hide");
			}
			if(!emailAddress){
				  $("#emailAddressValidation").removeClass("hide");
				  $("#emailAddressValidation").text("Please Enter E-mail address");
				  $("#emailAddress").focus();
				  submitForm= false;
			  }else if(emailAddress.match(mailformat)){ 
					$("#emailAddressValidation").addClass("hide");
				}else{
						$("#emailAddressValidation").removeClass("hide");
						$("#emailAddressValidation").text("You have Entered an invalid E-mail address");
						$("#emailAddress").focus();
						submitForm= false;
					}
			if(!address){
				$("#address").focus();
				$("#addressValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#addressValidation").addClass("hide");
			}
			if(!applicantNature){
				$("#applicantNature").focus();
				$("#applicantNatureValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#applicantNatureValidation").addClass("hide");
				if(applicantNature == "Individual"){
					if(!indiLastName){
						$("#indiLastName").focus();
						$("#indiLastNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#indiLastNameValidation").addClass("hide");
					}
					if(!indiFirstName){
						$("#indiFirstName").focus();
						$("#indiFirstNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#indiFirstNameValidation").addClass("hide");
					}
			    }else{
			    	if(!companyName){
						$("#companyName").focus();
						$("#companyNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#companyNameValidation").addClass("hide");
					}
			    }
			}
		}
		if(submitForm){
			$.ajax({
		        type: "POST",
		        url: "${applicantDetailInfo}",
		        data: {
		            "<portlet:namespace/>applicantNature": applicantNature,
		            "<portlet:namespace/>indiFirstName": indiFirstName,
		            "<portlet:namespace/>indiLastName": indiLastName,
		            "<portlet:namespace/>indiName": indiName,
		            "<portlet:namespace/>companyName": companyName,
		            "<portlet:namespace/>address": address,
		            "<portlet:namespace/>emailAddress": emailAddress,
		            "<portlet:namespace/>telephone": telephone,
		            "<portlet:namespace/>applicationDate": applicationDate,
		            "<portlet:namespace/>trnNumber": trnNumber,
		            "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
		        },
		        success: function (data) {
		        	if(!isSaveAndContinue){
		        		nextForm();
		        	}
		            // Handle success
		        },
		        error: function (data) {
		            // Handle error
		        },
		    });
		}
	}
	function insolventDetailInfo(isSaveAndContinue){
		insolventPersonNature = $("#insolventPersonNature").val();
		insolventIndiFirstName = $("#insolventIndiFirstName").val();
		insolventIndiLastName = $("#insolventIndiLastName").val();
		insolventCompanyName = $("#insolventCompanyName").val();
		$(".insolventCompanyName").text(insolventCompanyName);
		insolventAddress = $("#insolventAddress").val();
		insolventParish = $("#insolventParish").val();
		insolventEmailAddress = $("#insolventEmailAddress").val();
		insolventTelephone = $("#insolventTelephone").val();
		insolventTrnNumber = $("#insolventTrnNumber").val();
		osiServicesApplicationId = $("#osiServicesApplicationId").val();
		submitForm = true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!isSaveAndContinue){
			if(!insolventTrnNumber){
				$("#insolventTrnNumber").focus();
				$("#insolventTrnNumberValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#insolventTrnNumberValidation").addClass("hide");
			}
			if(!insolventTelephone){
				$("#insolventTelephone").focus();
				$("#insolventTelephoneValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#insolventTelephoneValidation").addClass("hide");
			}
			if(!insolventEmailAddress){
				  $("#insolventEmailAddressValidation").removeClass("hide");
				  $("#insolventEmailAddressValidation").text("Please Enter E-mail address");
				  $("#insolventEmailAddress").focus();
				  submitForm= false;
			  }else if(insolventEmailAddress.match(mailformat)){ 
					$("#insolventEmailAddressValidation").addClass("hide");
				}else{
						$("#insolventEmailAddressValidation").removeClass("hide");
						$("#insolventEmailAddressValidation").text("You have Entered an invalid E-mail address");
						$("#insolventEmailAddress").focus();
						submitForm= false;
					}
			if(!insolventParish){
				$("#insolventParish").focus();
				$("#insolventParishValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#insolventParishValidation").addClass("hide");
			}
			if(!insolventAddress){
				$("#insolventAddress").focus();
				$("#insolventAddressValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#insolventAddressValidation").addClass("hide");
			}
			if(!insolventPersonNature){
				$("#insolventPersonNature").focus();
				$("#insolventPersonNatureValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#insolventPersonNatureValidation").addClass("hide");
				if(insolventPersonNature == "Individual"){
					if(!insolventIndiLastName){
						$("#insolventIndiLastName").focus();
						$("#insolventIndiLastNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#insolventIndiLastNameValidation").addClass("hide");
					}
					if(!insolventIndiFirstName){
						$("#insolventIndiFirstName").focus();
						$("#insolventIndiFirstNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#insolventIndiFirstNameValidation").addClass("hide");
					}
			    }else{
			    	if(!insolventCompanyName){
						$("#insolventCompanyName").focus();
						$("#insolventCompanyNameValidation").removeClass("hide");
						submitForm = false;
					}else{
						$("#insolventCompanyNameValidation").addClass("hide");
					}
			    }
			}
		}
		if(submitForm){
			$.ajax({
		        type: "POST",
		        url: "${insolventPersonDetail}",
		        data: {
		        	  "<portlet:namespace/>insolventPersonNature": insolventPersonNature,
		              "<portlet:namespace/>insolventIndiFirstName": insolventIndiFirstName,
		              "<portlet:namespace/>insolventIndiLastName": insolventIndiLastName,
		              "<portlet:namespace/>insolventCompanyName": insolventCompanyName,
		              "<portlet:namespace/>insolventAddress": insolventAddress,
		              "<portlet:namespace/>insolventParish": insolventParish,
		              "<portlet:namespace/>insolventEmailAddress": insolventEmailAddress,
		              "<portlet:namespace/>insolventTelephone": insolventTelephone,
		              "<portlet:namespace/>insolventTrnNumber": insolventTrnNumber,
		              "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
		        },
		        success: function (data) {
		        	if(!isSaveAndContinue){
		        		nextForm();
		        	}
		        },
		        error: function (data) {
		        },
		    });
		}
	}
	
	$("#creditorName").on('input', function(){
	   $(".creditorName").text($(this).val()); 
	});
	function creditorDetailInfo(isSaveAndContinue){
		creditorName = $("#creditorName").val();
		creditorDate = $("#creditorDate").val();
		creditorAddress = $("#creditorAddress").val();
		osiServicesApplicationId = $("#osiServicesApplicationId").val();
		submitForm = true;
		if(!isSaveAndContinue){
			if(!creditorName){
				$("#creditorName").focus();
				$("#creditorNameValidation").removeClass("hide");
				submitForm = false;
			}else{
				$("#creditorNameValidation").addClass("hide");
			}
		}
		if(submitForm){
			$.ajax({
		        type: "POST",
		        url: "${creditorNameInfo}",
		        
		        data: {
		        	"<portlet:namespace/>creditorName": creditorName,
		            "<portlet:namespace/>creditorDate": creditorDate,
		            "<portlet:namespace/>creditorAddress": creditorAddress,
		            "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
		        },
		        async: false,
		        success: function (data) {
		        	uploadDocuments("creditorUploadBtn","Signature General Benefit Creditors","");
		        	if(!isSaveAndContinue){
		        		nextForm();
		        	}
		        },
		        error: function (data) {
		            // Handle error
		        },
		    });
		}
	}
	function assignmentDetailInfo(){
		assignmentName = $("#assignmentName").val();
		assignmentDated = $("#assignmentDated").val();
		var selectedAssignmentAttached = new Array();
		$("input:checkbox[name=assignmentAttached]:checked").each(function() {
			selectedAssignmentAttached.push($(this).val());
		});
		var selectedInfo=selectedAssignmentAttached.toString();
		
		var trusteeAct = new Array();
		$("input:checkbox[name=trusteeWilling]:checked").each(function() {
			trusteeAct.push($(this).val());
		});
		var trusteeActInfo=trusteeAct.toString();
		
		assignmentAddress = $("#assignmentAddress").val();
		osiServicesApplicationId = $("#osiServicesApplicationId").val();
		$.ajax({
	        type: "POST",
	        url: "${assignmentDetailInfo}",
	        data: {
	        	  "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	              "<portlet:namespace/>assignmentName": assignmentName,
	              "<portlet:namespace/>assignmentDated": assignmentDated,
	              "<portlet:namespace/>selectedAssignmentAttached": selectedInfo,
	              "<portlet:namespace/>assignmentAddress": assignmentAddress,
	              "<portlet:namespace/>trusteeActInfo": trusteeActInfo,
	        },
	        async: false,
	        success: function (data) {
	            // Handle success
	            uploadDocuments("insolventPersonUploadBtn","Signature Assignment","");
	            $("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	        },
	        error: function (data) {
	            // Handle error
	        },
	    });
	}
	$("#assignmentName").on('input', function(){
	   $(".assignmentName").text($(this).val()); 
	});
	$(document).on('change', '#creditorUploadBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#creditorImageHolder");
	    var form1a_image_holder = $("#creditorImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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
	$(document).on('change', '#insolventPersonUploadBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#insolventPersonImageHolder");
	    var form1a_image_holder = $("#insolventPersonImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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

	$("#assignmentName").on('input', function(){
	    if($(this).val()){
	        $("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	    }else{
	        $("#osiServicesFormsFieldset #save-continue").css({'opacity':'0.4', 'pointer-events':'none','cursor':'default'});
	    }
	    
	});
	
</script>