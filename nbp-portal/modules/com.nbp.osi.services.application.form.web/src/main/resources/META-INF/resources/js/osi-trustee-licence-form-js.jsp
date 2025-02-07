<portlet:resourceURL var="trusteeIndiDetailInfoUrl" id="/trustee/Indi/Detail/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="underSignedInfoUrl" id="/under/Signed/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="companyDetailsInfoUrl" id="/company/Details/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="orgInfoUrl" id="/org/Info/Url"></portlet:resourceURL>
<portlet:resourceURL var="addYearlyWorkingTimeDetailInfoUrl" id="/yearlyWorkingTime/detail/info"/>
<portlet:resourceURL var="yearlyInfoUrl" id="/yearlyInfoUrl"/>
<portlet:resourceURL var="licenseBreakdownInfoUrl" id="/license/Breakdown/Info/Url"/>
<portlet:resourceURL var="signDateComTrustee" id="/sign/Date/Com/Trustee"/>

<script>
/*let dateDropdown = document.getElementById('breakdownWorkingYear'); 

let currentYear = new Date().getFullYear();    
let earliestYear = 1970;     
 while (currentYear >= earliestYear) {      
  let dateOption = document.createElement('option');          
  dateOption.text = currentYear;      
  dateOption.value = currentYear;        
  dateDropdown.add(dateOption);      
  currentYear -= 1;    
} */
/* TRUSTEE FORM */
function truteeIndiDetailInfo(isSaveAndContinue){
	indiFamilyName = $("#indiFamilyName").val();
	indiGivenName = $("#indiGivenName").val();
	indiDateOfBirth = $("#indiDateOfBirth").val();
	indiOtherLegalNames = $("#indiOtherLegalNames").val();
	indiBusinessAddress = $("#indiBusinessAddress").val();
	indiBusinessTeleNo = $("#indiBusinessTeleNo").val();
	indiBusinessFaxNo = $("#indiBusinessFaxNo").val();
	indiBusinessEmail = $("#indiBusinessEmail").val();
	indiHomeAddress = $("#indiHomeAddress").val();
	indiHomeTeleNo = $("#indiHomeTeleNo").val();
	indiHomeFaxNo = $("#indiHomeFaxNo").val();
	indiHomeEmail = $("#indiHomeEmail").val();
	indiCurrentEmployer = $("#indiCurrentEmployer").val();
	indiDateOfEmployment = $("#indiDateOfEmployment").val();
	indiProfessionalOrg = $("#indiProfessionalOrg").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	submitForm = true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!isSaveAndContinue){
		if(!indiHomeEmail){
			  $("#indiHomeEmailValidation").removeClass("hide");
			  $("#indiHomeEmailValidation").text("Please Enter E-mail address");
			  $("#indiHomeEmail").focus();
			  submitForm= false;
		  }else if(indiHomeEmail.match(mailformat))
		    { 
				$("#indiHomeEmailValidation").addClass("hide");
			}else
				{
					$("#indiHomeEmailValidation").removeClass("hide");
					$("#indiHomeEmailValidation").text("You have Entered an invalid E-mail address");
					$("#indiHomeEmail").focus();
					submitForm= false;
				}
		if(!indiBusinessEmail){
			  $("#indiBusinessEmailValidation").removeClass("hide");
			  $("#indiBusinessEmailValidation").text("Please Enter E-mail address");
			  $("#indiBusinessEmail").focus();
			  submitForm= false;
		  }else if(indiBusinessEmail.match(mailformat))
		    { 
				$("#indiBusinessEmailValidation").addClass("hide");
			}else
				{
					$("#indiBusinessEmailValidation").removeClass("hide");
					$("#indiBusinessEmailValidation").text("You have Entered an invalid E-mail address");
					$("#indiBusinessEmail").focus();
					submitForm= false;
				}
		if(!indiFamilyName){
			$("#indiFamilyName").focus();
			$("#indiFamilyNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#indiFamilyNameValidation").addClass("hide");
		}
	}
	if(submitForm){
		$.ajax({
	        type: "POST",
	        url: "${trusteeIndiDetailInfoUrl}",
	        data: {
	        	  "<portlet:namespace/>indiFamilyName": indiFamilyName,
	              "<portlet:namespace/>indiGivenName": indiGivenName,
	              "<portlet:namespace/>indiDateOfBirth": indiDateOfBirth,
	              "<portlet:namespace/>indiOtherLegalNames": indiOtherLegalNames,
	              "<portlet:namespace/>indiBusinessAddress": indiBusinessAddress,
	              "<portlet:namespace/>indiBusinessTeleNo": indiBusinessTeleNo,
	              "<portlet:namespace/>indiBusinessFaxNo": indiBusinessFaxNo,
	              "<portlet:namespace/>indiBusinessEmail": indiBusinessEmail,
	              "<portlet:namespace/>indiHomeAddress": indiHomeAddress,
	              "<portlet:namespace/>indiHomeTeleNo": indiHomeTeleNo,
	              "<portlet:namespace/>indiHomeFaxNo": indiHomeFaxNo,
	              "<portlet:namespace/>indiHomeEmail": indiHomeEmail,
	              "<portlet:namespace/>indiCurrentEmployer": indiCurrentEmployer,
	              "<portlet:namespace/>indiDateOfEmployment": indiDateOfEmployment,
	              "<portlet:namespace/>indiProfessionalOrg": indiProfessionalOrg,
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
function indiQualificationDetailInfo(isSaveAndContinue){
	orgMember = $("input[name ='orgMember']:checked").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	if(!isSaveAndContinue){
		nextForm();
	}
	$.ajax({
        type: "POST",
        url: "${orgInfoUrl}",
        data: {
              "<portlet:namespace/>orgMember": orgMember,
            "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
        },
        async: false,
        success: function (data) {
            // Handle success
            
            uploadDocuments("qualificationsForm","qualification Form","");
            uploadDocuments("education-upload-btn","Signature Trustee Qualification","");
        },
        error: function (data) {
            // Handle error
        },
    });
}
function nextWithoutSave(isSaveAndContinue){
	if(!isSaveAndContinue){
		nextForm();
	}
}
function indiUndersignedDetailInfo(isSaveAndContinue){
	indiUndersignedApplicantName = $("#indiUndersignedApplicantName").val();
	indiUndersignedDated = $("#indiUndersignedDated").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	submitForm = true;
	if(!isSaveAndContinue){
		if(!indiUndersignedApplicantName){
			$("#indiUndersignedApplicantName").focus();
			$("#indiUndersignedApplicantNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#indiUndersignedApplicantNameValidation").addClass("hide");
		}
	}
	if(submitForm){
		$.ajax({
	        type: "POST",
	        url: "${underSignedInfoUrl}",
	        data: {
	              "<portlet:namespace/>indiUndersignedApplicantName": indiUndersignedApplicantName,
	              "<portlet:namespace/>indiUndersignedDated": indiUndersignedDated,
	              "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	        },
	        async: false,
	        success: function (data) {
	        	uploadDocuments("indi-undersigned-signature-upload-btn","Signature Trustee Undersigned","");
	        	if(!isSaveAndContinue){
	        		nextForm();
	        	}
	        },
	        error: function (data) {
	        },
	    });
	}
}
function indiLicenceBreakdownInfo(isSaveAndContinue){
	indiBreakdownApplicantName = $("#indiBreakdownApplicantName").val();
	indiBreakdownFirm = $("#indiBreakdownFirm").val();
	indiBreakdownDated = $("#indiBreakdownDated").val();
	indiBreakdownTrusteeName = $("#indiBreakdownTrusteeName").val();
	indiBreakdownTrusteeDate = $("#indiBreakdownTrusteeDate").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	submitForm = true;
	if(!isSaveAndContinue){
		osiTrusteeIndiLicenceFormTab = $(".osiTrusteeIndiLicenceFormTab").find(".active span:nth-child(2)").text();
     	if(osiTrusteeIndiLicenceFormTab == 'Trustee Licence Breakdown'){
			 addYearlyWorkingTimeDetailBox();
		 }
		if(!indiBreakdownTrusteeName){
			$("#indiBreakdownTrusteeName").focus();
			$("#indiBreakdownTrusteeNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#indiBreakdownTrusteeNameValidation").addClass("hide");
		}
		if(!indiBreakdownApplicantName){
			$("#indiBreakdownApplicantName").focus();
			$("#indiBreakdownApplicantNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#indiBreakdownApplicantNameValidation").addClass("hide");
		}
	}
	if(submitForm){
		$.ajax({
	        type: "POST",
	        url: "${licenseBreakdownInfoUrl}",
	        data: {
	        	   "<portlet:namespace/>indiBreakdownApplicantName": indiBreakdownApplicantName,
	               "<portlet:namespace/>indiBreakdownFirm": indiBreakdownFirm,
	               "<portlet:namespace/>indiBreakdownDated": indiBreakdownDated,
	               "<portlet:namespace/>indiBreakdownTrusteeName": indiBreakdownTrusteeName,
	               "<portlet:namespace/>indiBreakdownTrusteeDate": indiBreakdownTrusteeDate,
	           	 	"<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	        },
	        async: false,
	        success: function (data) {
	            // Handle success
	            uploadDocuments("breakdown-applicant-signature-upload-btn","Signature of Applicant","");
	            uploadDocuments("breakdown-trustee-signature-upload-btn","Signature of Trustee","");
	            $("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
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
function truteeComDetailInfo(isSaveAndContinue){
	comCorporationName = $("#comCorporationName").val();
	comHeadOfficeAddress = $("#comHeadOfficeAddress").val();
	comTeleNo = $("#comTeleNo").val();
	comFaxNo = $("#comFaxNo").val();
	comEmail = $("#comEmail").val();
	otherCountry = $("input[name ='otherCountry']:checked").val();
	comIncorporationDate = $("#comIncorporationDate").val();
	comIncorporationLicenceReq = $("#comIncorporationLicenceReq").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	submitForm = true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!isSaveAndContinue){
		if(!comEmail){
			  $("#comEmailValidation").removeClass("hide");
			  $("#comEmailValidation").text("Please Enter E-mail address");
			  $("#comEmail").focus();
			  submitForm= false;
		  }else if(comEmail.match(mailformat)){ 
				$("#comEmailValidation").addClass("hide");
			}else{
					$("#comEmailValidation").removeClass("hide");
					$("#comEmailValidation").text("You have Entered an invalid E-mail address");
					$("#comEmail").focus();
					submitForm= false;
				}
		if(!comCorporationName){
			$("#comCorporationName").focus();
			$("#comCorporationNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#comCorporationNameValidation").addClass("hide");
		}
	}
	if(submitForm){
		$.ajax({
	        type: "POST",
	        url: "${companyDetailsInfoUrl}",
	        data: {
	        	 "<portlet:namespace/>comCorporationName": comCorporationName,
	             "<portlet:namespace/>comHeadOfficeAddress": comHeadOfficeAddress,
	             "<portlet:namespace/>comTeleNo": comTeleNo,
	             "<portlet:namespace/>comFaxNo": comFaxNo,
	             "<portlet:namespace/>comEmail": comEmail,
	             "<portlet:namespace/>otherCountry": otherCountry,
	             "<portlet:namespace/>comIncorporationDate": comIncorporationDate,
	             "<portlet:namespace/>comLicenceRequest": comIncorporationLicenceReq,
	           	 "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	        },
	        success: function (data) {
	            // Handle success
	            if(!isSaveAndContinue){
	        		nextForm();
	            }
	        	$("#osiServicesFormsFieldset #save-continue").css({'opacity':'1', 'pointer-events':'auto','cursor':'pointer'});
	        },
	        error: function (data) {
	            // Handle error
	        },
	    });
	}
}
$("#indiUndersignedApplicantName").on('input', function(){
	value = $(this).val();
	VALUE = value.toUpperCase();
	$("#indiUndersignedApplicantName").val(VALUE);
	$(".indiUndersignedApplicantName").text(VALUE);
});
$("#indiBreakdownTrusteeName").on('input', function(){
	value = $(this).val();
	VALUE = value.toUpperCase();
	$("#indiBreakdownTrusteeName").val(VALUE);
	$(".indiBreakdownTrusteeName").text(VALUE);
});
$("#comCorporationName").on('input', function(){
	$(".comCorporationName").text($(this).val());
});
$("#indiBreakdownApplicantName").on('input', function(){
	$(".indiBreakdownApplicantName").text($(this).val());
});

/* ADD MORE FORMS JS */
 
 function addYearlyWorkingTimeDetailBox(){
	 yearlyWorkingTimeDetailVal = $("#yearlyWorkingTimeDetailVal").val();
	 breakdownWorkingYear = $("#breakdownWorkingYear").val();
	 breakdownWorkingBankrupties = $("#breakdownWorkingBankrupties").val();
	 breakdownWorkingProposal = $("#breakdownWorkingProposal").val();
	 breakdownWorkingComBankrupts = $("#breakdownWorkingComBankrupts").val();
	 breakdownWorkingComProposal = $("#breakdownWorkingComProposal").val();
	 breakdownWorkingInterimReceive = $("#breakdownWorkingInterimReceive").val();
	 breakdownWorkingCreditors = $("#breakdownWorkingCreditors").val();
	 breakdownWorkingOther = $("#breakdownWorkingOther").val();
	 if(breakdownWorkingYear != "" || breakdownWorkingBankrupties !="" || breakdownWorkingProposal !="" || breakdownWorkingComBankrupts !="" || breakdownWorkingComProposal !="" || breakdownWorkingInterimReceive !="" || breakdownWorkingCreditors !="" || breakdownWorkingOther !=""){
		$(".addYearlyWorkingTimeTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addYearlyWorkingTimeDetailInfoUrl}",
			data : {
				"<portlet:namespace/>yearlyWorkingTimeDetailVal" : yearlyWorkingTimeDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addYearlyWorkingTimeTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */
				breakdownWorkingYear = $("#breakdownWorkingYear").val();
				breakdownWorkingBankrupties = $("#breakdownWorkingBankrupties").val();
				breakdownWorkingProposal = $("#breakdownWorkingProposal").val();
				breakdownWorkingComBankrupts = $("#breakdownWorkingComBankrupts").val();
				breakdownWorkingComProposal = $("#breakdownWorkingComProposal").val();
				breakdownWorkingInterimReceive = $("#breakdownWorkingInterimReceive").val();
				breakdownWorkingCreditors = $("#breakdownWorkingCreditors").val();
				breakdownWorkingOther = $("#breakdownWorkingOther").val();
				$(".breakdownWorkingYear" + yearlyWorkingTimeDetailVal).append(breakdownWorkingYear);
				$(".breakdownWorkingBankrupties" + yearlyWorkingTimeDetailVal).append(breakdownWorkingBankrupties);
				$(".breakdownWorkingProposal" + yearlyWorkingTimeDetailVal).append(breakdownWorkingProposal);
				$(".breakdownWorkingComBankrupts" + yearlyWorkingTimeDetailVal).append(breakdownWorkingComBankrupts);
				$(".breakdownWorkingComProposal" + yearlyWorkingTimeDetailVal).append(breakdownWorkingComProposal);
				$(".breakdownWorkingInterimReceive" + yearlyWorkingTimeDetailVal).append(breakdownWorkingInterimReceive);
				$(".breakdownWorkingCreditors" + yearlyWorkingTimeDetailVal).append(breakdownWorkingCreditors);
				$(".breakdownWorkingOther" + yearlyWorkingTimeDetailVal).append(breakdownWorkingOther);
				/* occupantDirectorInfo(""); */
				yearlyInfo("");
				/* VALUE INCREAMENT */
				yearlyWorkingTimeDetailVal++;
				$("#yearlyWorkingTimeDetailVal").val(yearlyWorkingTimeDetailVal);
				/* RESET FORM FIELDS */
				$("#breakdownWorkingYear").val("");
				$("#breakdownWorkingBankrupties").val("");
				$("#breakdownWorkingProposal").val("");
				$("#breakdownWorkingComBankrupts").val("");
				$("#breakdownWorkingComProposal").val("");
				$("#breakdownWorkingInterimReceive").val("");
				$("#breakdownWorkingCreditors").val("");
				$("#breakdownWorkingOther").val("");
			}
		});
	 }
}
 function yearlyWorkingTimeDetailEditTab(yearlyWorkingTimeDetailVal){
		$(".editYearlyWorkingTimeDetailPopup").modal("show");
		$(".editBreakdownWorkingYear").attr("id" , "editBreakdownWorkingYear"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingBankrupties").attr("id" , "editBreakdownWorkingBankrupties"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingProposal").attr("id" , "editBreakdownWorkingProposal"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingComBankrupts").attr("id" , "editBreakdownWorkingComBankrupts"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingComProposal").attr("id" , "editBreakdownWorkingComProposal"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingInterimReceive").attr("id" , "editBreakdownWorkingInterimReceive"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingCreditors").attr("id" , "editBreakdownWorkingCreditors"+yearlyWorkingTimeDetailVal);
		$(".editBreakdownWorkingOther").attr("id" , "editBreakdownWorkingOther"+yearlyWorkingTimeDetailVal);
		
		breakdownWorkingYear = $(".breakdownWorkingYear"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingBankrupties = $(".breakdownWorkingBankrupties"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingProposal = $(".breakdownWorkingProposal"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingComBankrupts = $(".breakdownWorkingComBankrupts"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingComProposal = $(".breakdownWorkingComProposal"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingInterimReceive = $(".breakdownWorkingInterimReceive"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingCreditors = $(".breakdownWorkingCreditors"+yearlyWorkingTimeDetailVal+":first").text().trim();
		breakdownWorkingOther = $(".breakdownWorkingOther"+yearlyWorkingTimeDetailVal+":first").text().trim();
		
		$("#editBreakdownWorkingYear"+yearlyWorkingTimeDetailVal).val(breakdownWorkingYear);
		$("#editBreakdownWorkingBankrupties"+yearlyWorkingTimeDetailVal).val(breakdownWorkingBankrupties);
		$("#editBreakdownWorkingProposal"+yearlyWorkingTimeDetailVal).val(breakdownWorkingProposal);
		$("#editBreakdownWorkingComBankrupts"+yearlyWorkingTimeDetailVal).val(breakdownWorkingComBankrupts);
		$("#editBreakdownWorkingComProposal"+yearlyWorkingTimeDetailVal).val(breakdownWorkingComProposal);
		$("#editBreakdownWorkingInterimReceive"+yearlyWorkingTimeDetailVal).val(breakdownWorkingInterimReceive);
		$("#editBreakdownWorkingCreditors"+yearlyWorkingTimeDetailVal).val(breakdownWorkingCreditors);
		$("#editBreakdownWorkingOther"+yearlyWorkingTimeDetailVal).val(breakdownWorkingOther);
		
		$(".saveEditYearlyWorkingTimeDetailPopupDataBtn").attr("onclick" , "yearlyWorkingTimeDetailEditData("+yearlyWorkingTimeDetailVal+")");
	}
 	function yearlyWorkingTimeDetailEditData(yearlyWorkingTimeDetailVal){
		/* occupantDirectorInfo(occDirectorDetailVal); */
		yearlyInfo(yearlyWorkingTimeDetailVal);
		$(".breakdownWorkingYear" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingYear"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingBankrupties" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingBankrupties"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingProposal" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingProposal"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingComBankrupts" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingComBankrupts"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingComProposal" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingComProposal"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingInterimReceive" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingInterimReceive"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingCreditors" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingCreditors"+yearlyWorkingTimeDetailVal).val());
		$(".breakdownWorkingOther" + yearlyWorkingTimeDetailVal).html($("#editBreakdownWorkingOther"+yearlyWorkingTimeDetailVal).val());
		
		$(".editBreakdownWorkingYear").val("");
		$(".editBreakdownWorkingBankrupties").val("");
		$(".editBreakdownWorkingProposal").val("");
		$(".editBreakdownWorkingComBankrupts").val("");
		$(".editBreakdownWorkingComProposal").val("");
		$(".editBreakdownWorkingInterimReceive").val("");
		$(".editBreakdownWorkingCreditors").val("");
		$(".editBreakdownWorkingOther").val("");
	}
 	function yearlyWorkingTimeDeleteData(yearlyWorkingTimeDetailValData) {
		  var yearlyWorkingCountCounter = $("#yearlyWorkingTimeDetailVal").val();
		  $("#yearlyWorkingTimeDetailVal").val(yearlyWorkingCountCounter - 1);
		  var delRowElement = $(".amount-number-row" + yearlyWorkingTimeDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(yearlyWorkingTimeDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= yearlyWorkingCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".amount-number-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "amount-number-row" + prevCounter);
		    rowElement.find("td.breakdownWorkingYear"+i).removeClass("breakdownWorkingYear"+i).addClass("breakdownWorkingYear"+prevCounter);
		    rowElement.find("td.breakdownWorkingBankrupties"+i).removeClass("breakdownWorkingBankrupties"+i).addClass("breakdownWorkingBankrupties"+prevCounter);
		    rowElement.find("td.breakdownWorkingProposal"+i).removeClass("breakdownWorkingProposal"+i).addClass("breakdownWorkingProposal"+prevCounter);
		    rowElement.find("td.breakdownWorkingComBankrupts"+i).removeClass("breakdownWorkingComBankrupts"+i).addClass("breakdownWorkingComBankrupts"+prevCounter);
		    rowElement.find("td.breakdownWorkingComProposal"+i).removeClass("breakdownWorkingComProposal"+i).addClass("breakdownWorkingComProposal"+prevCounter);
		    rowElement.find("td.breakdownWorkingInterimReceive"+i).removeClass("breakdownWorkingInterimReceive"+i).addClass("breakdownWorkingInterimReceive"+prevCounter);
		    rowElement.find("td.breakdownWorkingCreditors"+i).removeClass("breakdownWorkingCreditors"+i).addClass("breakdownWorkingCreditors"+prevCounter);
		    rowElement.find("td.breakdownWorkingOther"+i).removeClass("breakdownWorkingOther"+i).addClass("breakdownWorkingOther"+prevCounter);
		    rowElement.find("#yearlyWorkingTimeDeleteDataTab").attr('onclick', 'yearlyWorkingTimeDeleteData(' +prevCounter+ ')');
		    rowElement.find("#yearlyWorkingTimeEditTab").attr('onclick', 'yearlyWorkingTimeDetailEditTab(' +prevCounter+ ')');
		  }
	}
 $(document).on('change', '#indi-undersigned-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#indi-undersigned-image-holder");
    var form1a_image_holder = $("#indi-undersigned-image-holder-pre");
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
 $(document).on('change', '#breakdown-applicant-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#breakdown-applicant-image-holder");
    var form1a_image_holder = $("#breakdown-applicant-image-holder-pre");
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
 $(document).on('change', '#breakdown-trustee-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#breakdown-trustee-image-holder");
    var form1a_image_holder = $("#breakdown-trustee-image-holder-pre");
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
 $(document).on('change', '#undersigned-com-signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#undersigned-com-image-holder");
    var form1a_image_holder = $("#undersigned-com-image-holder-pre");
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

/* -----PREVIEW----- */
function previewTruteeIndiDetailInfo(){
	indiFamilyName = $("#indiFamilyName").val();
	indiGivenName = $("#indiGivenName").val();
	indiDateOfBirth = $("#indiDateOfBirth").val();
	indiOtherLegalNames = $("#indiOtherLegalNames").val();
	indiBusinessAddress = $("#indiBusinessAddress").val();
	indiBusinessTeleNo = $("#indiBusinessTeleNo").val();
	indiBusinessFaxNo = $("#indiBusinessFaxNo").val();
	indiBusinessEmail = $("#indiBusinessEmail").val();
	indiHomeAddress = $("#indiHomeAddress").val();
	indiHomeTeleNo = $("#indiHomeTeleNo").val();
	indiHomeFaxNo = $("#indiHomeFaxNo").val();
	indiHomeEmail = $("#indiHomeEmail").val();
	indiCurrentEmployer = $("#indiCurrentEmployer").val();
	indiDateOfEmployment = $("#indiDateOfEmployment").val();
	indiProfessionalOrg = $("#indiProfessionalOrg").val();

	$("#indiFamilyNamePreview").html(indiFamilyName);
	$("#indiGivenNamePreview").html(indiGivenName);
	$("#indiDateOfBirthPreview").html(indiDateOfBirth);
	$("#indiOtherLegalNamesPreview").html(indiOtherLegalNames);
	$("#indiBusinessAddressPreview").html(indiBusinessAddress);
	$("#indiBusinessTeleNoPreview").html(indiBusinessTeleNo);
	$("#indiBusinessFaxNoPreview").html(indiBusinessFaxNo);
	$("#indiBusinessEmailPreview").html(indiBusinessEmail);
	$("#indiHomeAddressPreview").html(indiHomeAddress);
	$("#indiHomeTeleNoPreview").html(indiHomeTeleNo);
	$("#indiHomeFaxNoPreview").html(indiHomeFaxNo);
	$("#indiHomeEmailPreview").html(indiHomeEmail);
	$("#indiCurrentEmployerPreview").html(indiCurrentEmployer);
	$("#indiDateOfEmploymentPreview").html(indiDateOfEmployment);
	$("#indiProfessionalOrgPreview").html(indiProfessionalOrg);
}
function previewIndiQualificationDetailInfo(){
	orgMember = $("input[name ='orgMember']:checked").val();
	$("#orgMemberPreview").html(orgMember);
}
function previewIndiUndersignedDetailInfo(){
	indiUndersignedApplicantName = $("#indiUndersignedApplicantName").val();
	indiUndersignedDated = $("#indiUndersignedDated").val();
	$("#indiUndersignedApplicantNamePreview").html(indiUndersignedApplicantName);
	$("#indiUndersignedDatedPreview").html(indiUndersignedDated);
}
function previewIndiLicenceBreakdownInfo(){
	indiBreakdownApplicantName = $("#indiBreakdownApplicantName").val();
	indiBreakdownFirm = $("#indiBreakdownFirm").val();
	indiBreakdownDated = $("#indiBreakdownDated").val();
	indiBreakdownTrusteeName = $("#indiBreakdownTrusteeName").val();
	indiBreakdownTrusteeDate = $("#indiBreakdownTrusteeDate").val();
	var selectedIndSupportingDoc= new Array();
	$("input:checkbox[name=indSupportingDoc]:checked").each(function() {
		selectedIndSupportingDoc.push($(this).val());
	});
	var indiSelectedInfo = selectedIndSupportingDoc.toString();
	
	$("#indiBreakdownApplicantNamePreview").html(indiBreakdownApplicantName);
	$("#indiBreakdownFirmPreview").html(indiBreakdownFirm);
	$("#indiBreakdownDatedPreview").html(indiBreakdownDated);
	$("#indiBreakdownTrusteeNamePreview").html(indiBreakdownTrusteeName);
	$("#indiBreakdownTrusteeDatePreview").html(indiBreakdownTrusteeDate);
	$("#indSupportingDocPreview").html(indiSelectedInfo);
}
function previewTruteeComDetailInfo(){
	comCorporationName = $("#comCorporationName").val();
	comHeadOfficeAddress = $("#comHeadOfficeAddress").val();
	comTeleNo = $("#comTeleNo").val();
	comFaxNo = $("#comFaxNo").val();
	comEmail = $("#comEmail").val();
	comIncorporationDate = $("#comIncorporationDate").val();
	comLicenceRequest = $("#comIncorporationLicenceReq").val();
	comUndersignedIncorporationDate = $("#comUndersignedIncorporationDate").val();
	var selectedComSupportingDoc= new Array();
	$("input:checkbox[name=comSupportingDoc]:checked").each(function() {
		selectedComSupportingDoc.push($(this).val());
	});
	var selectedInfo=selectedComSupportingDoc.toString();
	
	$("#comCorporationNamePreview").html(comCorporationName);
	$("#comHeadOfficeAddressPreview").html(comHeadOfficeAddress);
	$("#comTeleNoPreview").html(comTeleNo);
	$("#comFaxNoPreview").html(comFaxNo);
	$("#comEmailPreview").html(comEmail);
	$("#comIncorporationDatePreview").html(comIncorporationDate);
	$("#comLicenceRequestPreview").html(comLicenceRequest);
	$("#comUndersignedIncorporationDatePreview").html(comUndersignedIncorporationDate);
	$("#comSupportingDocPreview").html(selectedInfo);
}
function signTrusteeComUpload(isSaveAndContinue){
    uploadDocuments("undersigned-com-signature-upload-btn","Signature Behalf of Corporation","");
}
function yearlyInfo(counter){
	osiServicesApplicationId = $("#osiServicesApplicationId").val();
	 yearlyWorkingTimeDetailVal = $("#yearlyWorkingTimeDetailVal").val();
	if(counter!=""){
		breakdownWorkingYear = $("#editBreakdownWorkingYear"+counter).val();
		breakdownWorkingBankrupties = $("#editBreakdownWorkingBankrupties"+counter).val();
		breakdownWorkingProposal = $("#editBreakdownWorkingProposal"+counter).val();
		breakdownWorkingComBankrupts = $("#editBreakdownWorkingComBankrupts"+counter).val();
		breakdownWorkingComProposal = $("#editBreakdownWorkingComProposal"+counter).val();
		breakdownWorkingInterimReceive = $("#editBreakdownWorkingInterimReceive"+counter).val();
		breakdownWorkingCreditors = $("#editBreakdownWorkingCreditors"+counter).val();
		breakdownWorkingOther = $("#editBreakdownWorkingOther"+counter).val();
		yearlyWorkingTime = $("#yearlyWorkingTime"+counter).val();
	}
	else{
	breakdownWorkingYear = $("#breakdownWorkingYear").val();
	breakdownWorkingBankrupties = $("#breakdownWorkingBankrupties").val();
	breakdownWorkingProposal = $("#breakdownWorkingProposal").val();
	breakdownWorkingComBankrupts = $("#breakdownWorkingComBankrupts").val();
	breakdownWorkingComProposal = $("#breakdownWorkingComProposal").val();
	breakdownWorkingInterimReceive = $("#breakdownWorkingInterimReceive").val();
	breakdownWorkingCreditors = $("#breakdownWorkingCreditors").val();
	breakdownWorkingOther = $("#breakdownWorkingOther").val();
	yearlyWorkingTime = "";
	}
		$.ajax({
	        type: "POST",
	        url: "${yearlyInfoUrl}",
	        data: {
	        	 "<portlet:namespace/>breakdownWorkingYear": breakdownWorkingYear,
	             "<portlet:namespace/>breakdownWorkingBankrupties": breakdownWorkingBankrupties,
	             "<portlet:namespace/>breakdownWorkingProposal": breakdownWorkingProposal,
	             "<portlet:namespace/>breakdownWorkingComBankrupts": breakdownWorkingComBankrupts,
	             "<portlet:namespace/>breakdownWorkingComProposal": breakdownWorkingComProposal,
	             "<portlet:namespace/>breakdownWorkingInterimReceive": breakdownWorkingInterimReceive,
	             "<portlet:namespace/>breakdownWorkingCreditors": breakdownWorkingCreditors,
	             "<portlet:namespace/>breakdownWorkingOther": breakdownWorkingOther,
	           	 "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	           	 "<portlet:namespace/>yearlyWorkingTimeDetailVal": yearlyWorkingTimeDetailVal,
	           	 "<portlet:namespace/>yearlyWorkingTime": yearlyWorkingTime,
	        },
	        success: function (data) {
	        	var resultJsonObject=data.APP_DATA;
				var counterOfEmp=resultJsonObject["yearlyCounter"];
				$("#yearlyWorkingTime"+counterOfEmp).val(resultJsonObject["yearlyId"]);
	        },
	        error: function (data) {
	            // Handle error
	        },
	    });
	}
function comTrusteeSign(isSaveAndContinue){	
	dateOfTrusteeComSign = $("#comUndersignedIncorporationDate").val();
	osiServicesApplicationId = $("#osiServicesApplicationId").val();	
	$.ajax({
	    type: "POST",
	    url: "${signDateComTrustee}",
	    data: {
	       	 "<portlet:namespace/>osiServicesApplicationId": osiServicesApplicationId,
	       	 "<portlet:namespace/>dateOfTrusteeComSign": dateOfTrusteeComSign,
	    },
	    success: function (data) {
	    	if(!isSaveAndContinue){
	    		nextForm();
	        }
	    	uploadDocuments("undersigned-com-signature-upload-btn","Signature Behalf of Corporation","");
	    },
	    error: function (data) {
	        // Handle error
	    },
	});
}
</script>