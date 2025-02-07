<portlet:resourceURL var="addApplicantDetailInfoUrl" id="/applicant/detail/info"/>
<portlet:resourceURL var="addCompanyDetailInfoUrl" id="/company/detail/info"/>
<portlet:resourceURL var="addHomeDetailInfoUrl" id="/home/detail/info"/>
<portlet:resourceURL var="addPatientCountInfoUrl" id="/patient/count/info"/>
<portlet:resourceURL var="addNursingStaffDetailInfoUrl" id="/nursing/staff/detail/info"/>
<portlet:resourceURL var="addMedicalPractitionerDetailInfoUrl" id="/medical/practitioner/detail/info"/>
<portlet:resourceURL var="addMaternityHomeDetailInfoUrl" id="/maternity/home/detail/info"/>
<portlet:resourceURL var="delteMedicalApplicant" id="delteMedicalApplicant"/>
<script>
	function applicantInfo(){
		nextForm();
		pendingMedicalFacilities();
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
	
/* 		var $active = $('.nav-tabs li>.active');
		$active.parent().next().find('.nav-link').removeClass('disabled');
		$active.parent().next().find('.nav-link span').removeClass('gray');
		nextTab($active); */
		const formSections = document.getElementsByClassName('form-wizard');
	    for (const formSection of formSections) {
		 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
		 }
	}
	function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();
	}
	/* ADD MORE FORMS JS */
	 
	 function addApplicantDetail(){
		 applicantDetailVal = $("#applicantDetailVal").val();
		 applicantName = $("#applicantName").val();
		 applicantTelephone = $("#applicantTelephone").val();
		 applicantAddress = $("#applicantAddress").val();
		 applicantEmailAddress = $("#applicantEmailAddress").val();
		 applicantNationality = $("#applicantNationality").val();
		 if(applicantName != "" || applicantTelephone !="" || applicantAddress !="" || applicantEmailAddress !="" || applicantNationality !=""){
			$(".addApplicantDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addApplicantDetailInfoUrl}",
				data : {
					"<portlet:namespace/>applicantDetailVal" : applicantDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addApplicantDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".applicantName" + applicantDetailVal).append(applicantName);
					$(".applicantTelephone" + applicantDetailVal).append(applicantTelephone);
					$(".applicantAddress" + applicantDetailVal).append(applicantAddress);
					$(".applicantEmailAddress" + applicantDetailVal).append(applicantEmailAddress);
					$(".applicantNationality" + applicantDetailVal).append(applicantNationality);
					
					/* VALUE INCREAMENT */
					applicantDetailData('','');
					applicantDetailVal++;
					$("#applicantDetailVal").val(applicantDetailVal);
					
					/* RESET FORM FIELDS */
					$("#applicantName").val("");
					$("#applicantTelephone").val("");
					$("#applicantAddress").val("");
					$("#applicantEmailAddress").val("");
					$("#applicantNationality").val("");
				}
			});
		}else{
			$("#applicantName").focus();
		}
	}
	 function applicantDetailEditTab(applicantDetailVal){
			$(".editApplicantDetailEditTabPopup").modal("show");
			$(".editApplicantName").attr("id" , "editApplicantName"+applicantDetailVal);
			$(".editApplicantTelephone").attr("id" , "editApplicantTelephone"+applicantDetailVal);
			$(".editApplicantAddress").attr("id" , "editApplicantAddress"+applicantDetailVal);
			$(".editApplicantEmailAddress").attr("id" , "editApplicantEmailAddress"+applicantDetailVal);
			$(".editApplicantNationality").attr("id" , "editApplicantNationality"+applicantDetailVal);
			
			applicantName = $(".applicantName"+applicantDetailVal+":first").text().trim();
			applicantTelephone = $(".applicantTelephone"+applicantDetailVal+":first").text().trim();
			applicantAddress = $(".applicantAddress"+applicantDetailVal+":first").text().trim();
			applicantEmailAddress = $(".applicantEmailAddress"+applicantDetailVal+":first").text().trim();
			applicantNationality = $(".applicantNationality"+applicantDetailVal+":first").text().trim();
			
			$("#editApplicantName"+applicantDetailVal).val(applicantName);
			$("#editApplicantTelephone"+applicantDetailVal).val(applicantTelephone);
			$("#editApplicantAddress"+applicantDetailVal).val(applicantAddress);
			$("#editApplicantEmailAddress"+applicantDetailVal).val(applicantEmailAddress);
			$("#editApplicantNationality"+applicantDetailVal).val(applicantNationality);
			
			$(".saveEditApplicantDetailPopupDataBtn").attr("onclick" , "applicantDetailEditData("+applicantDetailVal+")");
		}
	 	function applicantDetailEditData(applicantDetailVal){
	 		applicantDetailData(applicantDetailVal,'');
			$(".applicantName" + applicantDetailVal).html($("#editApplicantName"+applicantDetailVal).val());
			$(".applicantTelephone" + applicantDetailVal).html($("#editApplicantTelephone"+applicantDetailVal).val());
			$(".applicantAddress" + applicantDetailVal).html($("#editApplicantAddress"+applicantDetailVal).val());
			$(".applicantEmailAddress" + applicantDetailVal).html($("#editApplicantEmailAddress"+applicantDetailVal).val());
			$(".applicantNationality" + applicantDetailVal).html($("#editApplicantNationality"+applicantDetailVal).val());
			
			$(".editApplicantName").val("");
			$(".editApplicantTelephone").val("");
			$(".editApplicantAddress").val("");
			$(".editApplicantEmailAddress").val("");
			$(".editApplicantNationality").val("");
	 	}
	 	
	 	function applicantDetailDeleteData(applicantDetailValData) {
	 		applicantDetailData(applicantDetailValData,'deleteApplicant');
			  var applicantDetailCounter = $("#applicantDetailVal").val();
			  $("#applicantDetailVal").val(applicantDetailCounter - 1);
			  var delRowElement = $(".applicant-row" + applicantDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(applicantDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= applicantDetailCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".applicant-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "applicant-row" + prevCounter);
			    rowElement.find("td.applicantName"+i).removeClass("applicantName"+i).addClass("applicantName"+prevCounter);
			    rowElement.find("td.applicantTelephone"+i).removeClass("applicantTelephone"+i).addClass("applicantTelephone"+prevCounter);
			    rowElement.find("td.applicantAddress"+i).removeClass("applicantAddress"+i).addClass("applicantAddress"+prevCounter);
			    rowElement.find("td.applicantEmailAddress"+i).removeClass("applicantEmailAddress"+i).addClass("applicantEmailAddress"+prevCounter);
			    rowElement.find("td.applicantNationality"+i).removeClass("applicantNationality"+i).addClass("applicantNationality"+prevCounter);
			    rowElement.find("#applicantDetailDeleteDataTab").attr('onclick', 'applicantDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#applicantDetailEditTab").attr('onclick', 'applicantDetailEditTab(' +prevCounter+ ')');
			  }
		}
	 	
	 /* Company Detail Form */
	 	
	 function addCompanyDetail(){
		 companyDetailVal = $("#companyDetailVal").val();
		 comFullName = $("#comFullName").val();
		 comAddress = $("#comAddress").val();
		 comOffice = $("#comOffice").val();
		 if(comFullName != "" || comAddress !="" || comOffice !=""){
			$(".addCompanyDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addCompanyDetailInfoUrl}",
				data : {
					"<portlet:namespace/>companyDetailVal" : companyDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addCompanyDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".comFullName" + companyDetailVal).append(comFullName);
					$(".comAddress" + companyDetailVal).append(comAddress);
					$(".comOffice" + companyDetailVal).append(comOffice);
					
					/* VALUE INCREAMENT */
					comapnyDetailData('','');
					companyDetailVal++;
					$("#companyDetailVal").val(companyDetailVal);
					
					/* RESET FORM FIELDS */
					$("#comFullName").val("");
					$("#comAddress").val("");
					$("#comOffice").val("");
				}
			});
		}else{
			$("#comFullName").focus();
		}
	}
	 function companyDetailEditTab(companyDetailVal){
			$(".editcompanyDetailEditTabPopup").modal("show");
			$(".editComFullName").attr("id" , "editComFullName"+companyDetailVal);
			$(".editComAddress").attr("id" , "editComAddress"+companyDetailVal);
			$(".editComOffice").attr("id" , "editComOffice"+companyDetailVal);
			
			comFullName = $(".comFullName"+companyDetailVal+":first").text().trim();
			comAddress = $(".comAddress"+companyDetailVal+":first").text().trim();
			comOffice = $(".comOffice"+companyDetailVal+":first").text().trim();
			
			$("#editComFullName"+companyDetailVal).val(comFullName);
			$("#editComAddress"+companyDetailVal).val(comAddress);
			$("#editComOffice"+companyDetailVal).val(comOffice);
			
			$(".saveEditCompanyDetailPopupDataBtn").attr("onclick" , "companyDetailEditData("+companyDetailVal+")");
		}
	 	function companyDetailEditData(companyDetailVal){
	 		comapnyDetailData(companyDetailVal,'');
			$(".comFullName" + companyDetailVal).html($("#editComFullName"+companyDetailVal).val());
			$(".comAddress" + companyDetailVal).html($("#editComAddress"+companyDetailVal).val());
			$(".comOffice" + companyDetailVal).html($("#editComOffice"+companyDetailVal).val());
			
			$(".editComFullName").val("");
			$(".editComAddress").val("");
			$(".editComOffice").val("");
		}
	 	function companyDetailDeleteData(companyDetailValData) {
	 		comapnyDetailData(companyDetailValData,'deleteApplicant');
			  var companyDetailCounter = $("#companyDetailVal").val();
			  $("#companyDetailVal").val(companyDetailCounter - 1);
			  var delRowElement = $(".company-row" + companyDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(companyDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= companyDetailCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".company-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "company-row"+ prevCounter);
			    rowElement.find("td.comFullName"+i).removeClass("comFullName"+i).addClass("comFullName"+prevCounter);
			    rowElement.find("td.comAddress"+i).removeClass("comAddress"+i).addClass("comAddress"+prevCounter);
			    rowElement.find("td.comOffice"+i).removeClass("comOffice"+i).addClass("comOffice"+prevCounter);
			    rowElement.find("#companyDetailDeleteDataTab").attr('onclick', 'companyDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#companyDetailEditTab").attr('onclick', 'companyDetailEditTab(' +prevCounter+ ')');
			  }
		 }
	 /* Home Detail Form */
		 	
	 function addHomeDetail(){
		 homeDetailVal = $("#homeDetailVal").val();
		 homeCarriedName = $("#homeCarriedName").val();
		 homeAddress = $("#homeAddress").val();
		 homeEmailAddress = $("#homeEmailAddress").val();
		 homeTelephone = $("#homeTelephone").val();
		 homeSitutationDescription = $("#homeSitutationDescription").val();
		 homeOtherBusinessPremises = $("#homeOtherBusinessPremises").val();
		 if(homeCarriedName != "" || homeAddress !="" || homeTelephone !="" || homeSitutationDescription !="" || homeOtherBusinessPremises !=""){
			$(".addHomeDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addHomeDetailInfoUrl}",
				data : {
					"<portlet:namespace/>homeDetailVal" : homeDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addHomeDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".homeCarriedName" + homeDetailVal).append(homeCarriedName);
					$(".homeAddress" + homeDetailVal).append(homeAddress);
					$(".homeEmailAddress" + homeDetailVal).append(homeEmailAddress);
					$(".homeTelephone" + homeDetailVal).append(homeTelephone);
					$(".homeSitutationDescription" + homeDetailVal).append(homeSitutationDescription);
					$(".homeOtherBusinessPremises" + homeDetailVal).append(homeOtherBusinessPremises);
					
					/* VALUE INCREAMENT */
					homeDetailData('','');
					homeDetailVal++;
					$("#homeDetailVal").val(homeDetailVal);
					
					/* RESET FORM FIELDS */
					$("#homeCarriedName").val("");
					$("#homeAddress").val("");
					$("#homeEmailAddress").val("");
					$("#homeTelephone").val("");
					$("#homeSitutationDescription").val("");
					$("#homeOtherBusinessPremises").val("");
				}
			});
		}else{
			$("#homeCarriedName").focus();
		}
	}
	 function homeDetailEditTab(homeDetailVal){
			$(".editHomeDetailEditTabPopup").modal("show");
			$(".editHomeCarriedName").attr("id" , "editHomeCarriedName"+homeDetailVal);
			$(".editHomeAddress").attr("id" , "editHomeAddress"+homeDetailVal);
			$(".editHomeEmailAddress").attr("id" , "editHomeEmailAddress"+homeDetailVal);
			$(".editHomeTelephone").attr("id" , "editHomeTelephone"+homeDetailVal);
			$(".editHomeSitutationDescription").attr("id" , "editHomeSitutationDescription"+homeDetailVal);
			$(".editHomeOtherBusinessPremises").attr("id" , "editHomeOtherBusinessPremises"+homeDetailVal);
			
			homeCarriedName = $(".homeCarriedName"+homeDetailVal+":first").text().trim();
			homeAddress = $(".homeAddress"+homeDetailVal+":first").text().trim();
			homeEmailAddress = $(".homeEmailAddress"+homeDetailVal+":first").text().trim();
			homeTelephone = $(".homeTelephone"+homeDetailVal+":first").text().trim();
			homeSitutationDescription = $(".homeSitutationDescription"+homeDetailVal+":first").text().trim();
			homeOtherBusinessPremises = $(".homeOtherBusinessPremises"+homeDetailVal+":first").text().trim();
			
			$("#editHomeCarriedName"+homeDetailVal).val(homeCarriedName);
			$("#editHomeAddress"+homeDetailVal).val(homeAddress);
			$("#editHomeEmailAddress"+homeDetailVal).val(homeEmailAddress);
			$("#editHomeTelephone"+homeDetailVal).val(homeTelephone);
			$("#editHomeSitutationDescription"+homeDetailVal).val(homeSitutationDescription);
			$("#editHomeOtherBusinessPremises"+homeDetailVal).val(homeOtherBusinessPremises);
			
			$(".saveEditHomeDetailPopupDataBtn").attr("onclick" , "homeDetailEditData("+homeDetailVal+")");
		}
	 
	 function homeDetailEditData(homeDetailVal){
		 homeDetailData(homeDetailVal,'');
			$(".homeCarriedName" + homeDetailVal).html($("#editHomeCarriedName"+homeDetailVal).val());
			$(".homeAddress" + homeDetailVal).html($("#editHomeAddress"+homeDetailVal).val());
			$(".homeEmailAddress" + homeDetailVal).html($("#editHomeEmailAddress"+homeDetailVal).val());
			$(".homeTelephone" + homeDetailVal).html($("#editHomeTelephone"+homeDetailVal).val());
			$(".homeSituationDescription" + homeDetailVal).html($("#editHomeSitutationDescription"+homeDetailVal).val());
			$(".homeOtherBusinessPremises" + homeDetailVal).html($("#editHomeOtherBusinessPremises"+homeDetailVal).val());
			
			$(".editHomeCarriedName").val("");
			$(".editHomeAddress").val("");
			$(".editHomeEmailAddress").val("");
			$(".editHomeTelephone").val("");
			$(".editHomeSitutationDescription").val("");
			$(".editHomeOtherBusinessPremises").val("");
		}
	 
	 function homeDetailDeleteData(homeDetailValData) {
		 homeDetailData(homeDetailValData,'deleteApplicant');
		  var homeDetailCounter = $("#homeDetailVal").val();
		  $("#homeDetailVal").val(homeDetailCounter - 1);
		  var delRowElement = $(".home-row" + homeDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(homeDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= homeDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".home-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "home-row" + prevCounter);
		    rowElement.find("td.homeCarriedName"+i).removeClass("homeCarriedName"+i).addClass("homeCarriedName"+prevCounter);
		    rowElement.find("td.homeAddress"+i).removeClass("homeAddress"+i).addClass("homeAddress"+prevCounter);
		    rowElement.find("td.homeTelephone"+i).removeClass("homeTelephone"+i).addClass("homeTelephone"+prevCounter);
		    rowElement.find("td.homeEmailAddress"+i).removeClass("homeEmailAddress"+i).addClass("homeEmailAddress"+prevCounter);
		    rowElement.find("td.homeSitutationDescription"+i).removeClass("homeSitutationDescription"+i).addClass("homeSitutationDescription"+prevCounter);
		    rowElement.find("td.homeOtherBusinessPremises"+i).removeClass("homeOtherBusinessPremises"+i).addClass("homeOtherBusinessPremises"+prevCounter);
		    rowElement.find("#homeDetailDeleteDataTab").attr('onclick', 'homeDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#homeDetailEditTab").attr('onclick', 'homeDetailEditTab(' +prevCounter+ ')');
		  }
	}
	/* PatientCount Detail Form */
 	
	 function addPatientCount(){
		 patientCountVal = $("#patientCountVal").val();
		
		 maternityPatientNum = $("#maternityPatientNum").val();
		 otherPatientNum = $("#otherPatientNum").val();
		 if(maternityPatientNum != "" || otherPatientNum !="" ){
			$(".addPatientCountTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPatientCountInfoUrl}",
				data : {
					"<portlet:namespace/>patientCountVal" : patientCountVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addPatientCountTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".maternityPatientNum" + patientCountVal).append(maternityPatientNum);
					$(".otherPatientNum" + patientCountVal).append(otherPatientNum);
					
					/* VALUE INCREAMENT */
					patientCountData('','');
					patientCountVal++;
					$("#patientCountVal").val(patientCountVal);
					
					/* RESET FORM FIELDS */
					$("#maternityPatientNum").val("");
					$("#otherPatientNum").val("");
				}
			});
		}else{
			$("#maternityPatientNum").focus();
		}
	}
	 function patientCountEditTab(patientCountVal){
		$(".editPatientCounEditTabPopup").modal("show");
		$(".editMaternityPatientNum").attr("id" , "editMaternityPatientNum"+patientCountVal);
		$(".editOtherPatientNum").attr("id" , "editOtherPatientNum"+patientCountVal);
		
		maternityPatientNum = $(".maternityPatientNum"+patientCountVal+":first").text().trim();
		otherPatientNum = $(".otherPatientNum"+patientCountVal+":first").text().trim();
		
		$("#editMaternityPatientNum"+patientCountVal).val(maternityPatientNum);
		$("#editOtherPatientNum"+patientCountVal).val(otherPatientNum);
		
		$(".saveEditPatientCounPopupDataBtn").attr("onclick" , "patientCountEditData("+patientCountVal+")");
	}
 	function patientCountEditData(patientCountVal){
 		patientCountData(patientCountVal,'');
		$(".maternityPatientNum" + patientCountVal).html($("#editMaternityPatientNum"+patientCountVal).val());
		$(".otherPatientNum" + patientCountVal).html($("#editOtherPatientNum"+patientCountVal).val());
		
		$(".editMaternityPatientNum").val("");
		$(".editOtherPatientNum").val("");
		
	}
 	function patientCountDeleteData(patientCountValData) {
 		patientCountData(patientCountValData,'deleteApplicant');
	  var patientCountCounter = $("#patientCountVal").val();
	  $("#patientCountVal").val(patientCountCounter - 1);
	  var delRowElement = $(".patient-row" + patientCountValData); 
	  delRowElement.remove();
	  var j = parseInt(patientCountValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= patientCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".patient-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "patient-row" + prevCounter);
	    rowElement.find("td.maternityPatientNum"+i).removeClass("maternityPatientNum"+i).addClass("maternityPatientNum"+prevCounter);
	    rowElement.find("td.otherPatientNum"+i).removeClass("otherPatientNum"+i).addClass("otherPatientNum"+prevCounter);
	    rowElement.find("#patientCountDeleteDataTab").attr('onclick', 'patientCountDeleteData(' +prevCounter+ ')');
	    rowElement.find("#patientCountEditTab").attr('onclick', 'patientCountEditTab(' +prevCounter+ ')');
	  }
	}
	/* NursingStaffDetail Detail Form */
 	
	 function addNursingStaffDetail(){
		 nursingStaffDetailVal = $("#nursingStaffDetailVal").val();
		
		 nursingStaffName = $("#nursingStaffName").val();
		 nursingStaffQualifications = $("#nursingStaffQualifications").val();
		 if(nursingStaffName != "" || nursingStaffQualifications !="" ){
			 $(".addNursingStaffDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addNursingStaffDetailInfoUrl}",
				data : {
					"<portlet:namespace/>nursingStaffDetailVal" : nursingStaffDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addNursingStaffDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".nursingStaffName" + nursingStaffDetailVal).append(nursingStaffName);
					$(".nursingStaffQualifications" + nursingStaffDetailVal).append(nursingStaffQualifications);
					//$(".nursingStaffCategory" + nursingStaffDetailVal).append(nursingStaffCategory);
					
					/* VALUE INCREAMENT */
					nursingStaffData('','');
					nursingStaffDetailVal++;
					$("#nursingStaffDetailVal").val(nursingStaffDetailVal);
					
					/* RESET FORM FIELDS */
					$("#nursingStaffName").val("");
					$("#nursingStaffQualifications").val("");
					//$("#nursingStaffCategory").val("");
				}
			});
		}else{
			$("#maternityPatientNum").focus();
		}
	}
	 function nursingStaffEditTab(nursingStaffDetailVal){
		$(".editNursingStaffEditTabPopup").modal("show");
		$(".editNursingStaffName").attr("id" , "editNursingStaffName"+nursingStaffDetailVal);
		$(".editNursingStaffQualifications").attr("id" , "editNursingStaffQualifications"+nursingStaffDetailVal);
		//$(".editNursingStaffCategory").attr("id" , "editNursingStaffCategory"+nursingStaffDetailVal);
		
		nursingStaffName = $(".nursingStaffName"+nursingStaffDetailVal+":first").text().trim();
		nursingStaffQualifications = $(".nursingStaffQualifications"+nursingStaffDetailVal+":first").text().trim();
		//nursingStaffCategory = $(".nursingStaffCategory"+nursingStaffDetailVal+":first").text().trim();
		
		
		$("#editNursingStaffName"+nursingStaffDetailVal).val(nursingStaffName);
		$("#editNursingStaffQualifications"+nursingStaffDetailVal).val(nursingStaffQualifications);
		//$("#editNursingStaffCategory"+nursingStaffDetailVal).val(nursingStaffCategory);
		
		
		$(".saveEditNursingStaffPopupDataBtn").attr("onclick" , "nursingStaffEditData("+nursingStaffDetailVal+")");
	}
 	function nursingStaffEditData(nursingStaffDetailVal){
 		nursingStaffData(nursingStaffDetailVal,'');
		$(".nursingStaffName" + nursingStaffDetailVal).html($("#editNursingStaffName"+nursingStaffDetailVal).val());
		$(".nursingStaffQualifications" + nursingStaffDetailVal).html($("#editNursingStaffQualifications"+nursingStaffDetailVal).val());
		//$(".nursingStaffCategory" + nursingStaffDetailVal).html($("#editNursingStaffCategory"+nursingStaffDetailVal).val());
		
		
		$(".editNursingStaffName").val("");
		$(".editNursingStaffQualifications").val("");
		//$(".editNursingStaffCategory").val("");
		
	}
 	function nursingStaffDetailDeleteData(nursingStaffDetailValData) {
 		nursingStaffData(nursingStaffDetailValData,'deleteApplicant');
		  var nursingStaffCountCounter = $("#nursingStaffDetailVal").val();
		  $("#nursingStaffDetailVal").val(nursingStaffCountCounter - 1);
		  var delRowElement = $(".nursing-row" + nursingStaffDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(nursingStaffDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= nursingStaffCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".nursing-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "nursing-row" + prevCounter);
		    rowElement.find("td.nursingStaffName"+i).removeClass("nursingStaffName"+i).addClass("nursingStaffName"+prevCounter);
		    rowElement.find("td.nursingStaffQualifications"+i).removeClass("nursingStaffQualifications"+i).addClass("nursingStaffQualifications"+prevCounter);
		   // rowElement.find("td.nursingStaffCategory"+i).removeClass("nursingStaffCategory"+i).addClass("nursingStaffCategory"+prevCounter);
		    rowElement.find("#nursingStaffDetailDeleteDataTab").attr('onclick', 'nursingStaffDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#nursingStaffDetailEditTab").attr('onclick', 'nursingStaffEditTab(' +prevCounter+ ')');
		  }
	}
	 /* MedicalPractitioner Detail Form */
	 	
	 function addMedicalPractitionerDetail(){
		 medicalPractitionerDetailVal = $("#medicalPractitionerDetailVal").val();
		
		 medicalPractitionerName = $("#medicalPractitionerName").val();
		 medicalPractitionerQualifications = $("#medicalPractitionerQualifications").val();
		 medicalPractitionerQualifiesNurseRatio = $("#medicalPractitionerQualifiesNurseRatio").val();
		 if(medicalPractitionerName != "" || medicalPractitionerQualifications !="" || medicalPractitionerQualifiesNurseRatio !=""){
			$(".addMedicalPractitionerDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMedicalPractitionerDetailInfoUrl}",
				data : {
					"<portlet:namespace/>medicalPractitionerDetailVal" : medicalPractitionerDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addMedicalPractitionerDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".medicalPractitionerName" + medicalPractitionerDetailVal).append(medicalPractitionerName);
					$(".medicalPractitionerQualifications" + medicalPractitionerDetailVal).append(medicalPractitionerQualifications);
					$(".medicalPractitionerQualifiesNurseRatio" + medicalPractitionerDetailVal).append(medicalPractitionerQualifiesNurseRatio);
					
					/* VALUE INCREAMENT */
					medicalPractitionerData('','');
					medicalPractitionerDetailVal++;
					$("#medicalPractitionerDetailVal").val(medicalPractitionerDetailVal);
					
					/* RESET FORM FIELDS */
					$("#medicalPractitionerName").val("");
					$("#medicalPractitionerQualifications").val("");
					$("#medicalPractitionerQualifiesNurseRatio").val("");
				}
			});
		}else{
			$("#maternityPatientNum").focus();
		}
	}
	 function medicalPractitionerDetailEditTab(medicalPractitionerDetailVal){
		$(".editMedicalPractitionerTabPopup").modal("show");
		$(".editMedicalPractitionerName").attr("id" , "editMedicalPractitionerName"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerQualifications").attr("id" , "editMedicalPractitionerQualifications"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerQualifiesNurseRatio").attr("id" , "editMedicalPractitionerQualifiesNurseRatio"+medicalPractitionerDetailVal);
		
		medicalPractitionerName = $(".medicalPractitionerName"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerQualifications = $(".medicalPractitionerQualifications"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerQualifiesNurseRatio = $(".medicalPractitionerQualifiesNurseRatio"+medicalPractitionerDetailVal+":first").text().trim();
		
		$("#editMedicalPractitionerName"+medicalPractitionerDetailVal).val(medicalPractitionerName);
		$("#editMedicalPractitionerQualifications"+medicalPractitionerDetailVal).val(medicalPractitionerQualifications);
		$("#editMedicalPractitionerQualifiesNurseRatio"+medicalPractitionerDetailVal).val(medicalPractitionerQualifiesNurseRatio);
		
		$(".saveEditMedicalPractitionerDetailPopupDataBtn").attr("onclick" , "medicalPractitionerEditData("+medicalPractitionerDetailVal+")");
	}
 	function medicalPractitionerEditData(medicalPractitionerDetailVal){
 		medicalPractitionerData(medicalPractitionerDetailVal,'');
		$(".medicalPractitionerName" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerName"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerQualifications" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerQualifications"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerQualifiesNurseRatio" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerQualifiesNurseRatio"+medicalPractitionerDetailVal).val());
		
		$(".editMedicalPractitionerName").val("");
		$(".editMedicalPractitionerQualifications").val("");
		$(".editMedicalPractitionerQualifiesNurseRatio").val("");
		
	}
 	function medicalPractitionerDetailDeleteData(medicalPractitionerDetailValData){
 		medicalPractitionerData(medicalPractitionerDetailValData,'deleteApplicant');
		 var medicalPractitionerDetailCounter = $("#medicalPractitionerDetailVal").val();
		  $("#medicalPractitionerDetailVal").val(medicalPractitionerDetailCounter - 1);
		  var delRowElement = $(".maternity-row" + medicalPractitionerDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(medicalPractitionerDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= medicalPractitionerDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".maternity-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "maternity-row"+ prevCounter);
		    rowElement.find("td.medicalPractitionerName"+i).removeClass("medicalPractitionerName"+i).addClass("medicalPractitionerName"+prevCounter);
		    rowElement.find("td.medicalPractitionerQualifications"+i).removeClass("medicalPractitionerQualifications"+i).addClass("medicalPractitionerQualifications"+prevCounter);
		    rowElement.find("td.medicalPractitionerQualifiesNurseRatio"+i).removeClass("medicalPractitionerQualifiesNurseRatio"+i).addClass("medicalPractitionerQualifiesNurseRatio"+prevCounter);
		    rowElement.find("#medicalPractitionerDetailDeleteDataTab").attr('onclick', 'medicalPractitionerDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#medicalPractitionerEditTab").attr('onclick', 'medicalPractitionerDetailEditTab(' +prevCounter+ ')');
		  }
	 }

	 /* MaternityHomeDetail Detail Form */
	 	
	 function addMaternityHomeDetail(){
		 maternityHomeDetailVal = $("#maternityHomeDetailVal").val();
		
		 maternityHomeName = $("#maternityHomeName").val();
		 maternityHomeQualifications = $("#maternityHomeQualifications").val();
		 maternityHomeQualified = $("#maternityHomeQualified").val();
		 if(maternityHomeName != "" || maternityHomeQualifications !="" || maternityHomeQualified !=""){
			$(".addMaternityHomeDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMaternityHomeDetailInfoUrl}",
				data : {
					"<portlet:namespace/>maternityHomeDetailVal" : maternityHomeDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addMaternityHomeDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".maternityHomeName" + maternityHomeDetailVal).append(maternityHomeName);
					$(".maternityHomeQualifications" + maternityHomeDetailVal).append(maternityHomeQualifications);
					$(".maternityHomeQualified" + maternityHomeDetailVal).append(maternityHomeQualified);
					/* VALUE INCREAMENT */
					maternityHomeData('','');
					maternityHomeDetailVal++;
					$("#maternityHomeDetailVal").val(maternityHomeDetailVal);
					
					/* RESET FORM FIELDS */
					$("#maternityHomeName").val("");
					$("#maternityHomeQualifications").val("");
					$("#maternityHomeQualified").val("");
				}
			});
		}else{
			$("#maternityPatientNum").focus();
		}
	}
	 function maternityHomeEditTab(maternityHomeDetailVal){
		 $(".editMaternityDetailEditTabPopup").modal("show");
		 $(".editMaternityHomeName").attr("id" , "editMaternityHomeName"+maternityHomeDetailVal);
		 $(".editMaternityHomeQualifications").attr("id" , "editMaternityHomeQualifications"+maternityHomeDetailVal);
		 $(".editMaternityHomeQualified").attr("id" , "editMaternityHomeQualified"+maternityHomeDetailVal);
		 
		 maternityHomeName = $(".maternityHomeName"+maternityHomeDetailVal+":first").text().trim();
		 maternityHomeQualifications = $(".maternityHomeQualifications"+maternityHomeDetailVal+":first").text().trim();
		 maternityHomeQualified = $(".maternityHomeQualified"+maternityHomeDetailVal+":first").text().trim();
		 
		 $("#editMaternityHomeName"+maternityHomeDetailVal).val(maternityHomeName);
		 $("#editMaternityHomeQualifications"+maternityHomeDetailVal).val(maternityHomeQualifications);
	     $("#editMaternityHomeQualified"+maternityHomeDetailVal).val(maternityHomeQualified);
	     
	     $(".saveEditMaternityDetailPopupDataBtn").attr("onclick" , "maternityDetailEditData("+maternityHomeDetailVal+")");
	  }
	 function maternityDetailEditData(maternityHomeDetailVal){
		 maternityHomeData(maternityHomeDetailVal,'');
		 $(".maternityHomeName" + maternityHomeDetailVal).html($("#editMaternityHomeName"+maternityHomeDetailVal).val());
		 $(".maternityHomeQualifications" + maternityHomeDetailVal).html($("#editMaternityHomeQualifications"+maternityHomeDetailVal).val());
		 $(".maternityHomeQualified" + maternityHomeDetailVal).html($("#editMaternityHomeQualified"+maternityHomeDetailVal).val());
		 
		 $(".editMaternityHomeName").val("");
		 $(".editMaternityHomeQualifications").val("");
		 $(".editMaternityHomeQualified").val("");
	 }
	 function maternityDetailDeleteData(maternityHomeDetailValData){
		 maternityHomeData(maternityHomeDetailValData,'deleteApplicant');
		 var maternityDetailCounter = $("#maternityHomeDetailVal").val();
		  $("#maternityHomeDetailVal").val(maternityDetailCounter - 1);
		  var delRowElement = $(".maternity-row" + maternityHomeDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(maternityHomeDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= maternityDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".company-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "maternity-row"+ prevCounter);
		    rowElement.find("td.maternityHomeName"+i).removeClass("maternityHomeName"+i).addClass("maternityHomeName"+prevCounter);
		    rowElement.find("td.maternityHomeQualifications"+i).removeClass("maternityHomeQualifications"+i).addClass("maternityHomeQualifications"+prevCounter);
		    rowElement.find("td.maternityHomeQualified"+i).removeClass("maternityHomeQualified"+i).addClass("maternityHomeQualified"+prevCounter);
		    rowElement.find("#maternityDetailDeleteDataTab").attr('onclick', 'maternityDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#maternityHomeDetailEditTab").attr('onclick', 'maternityHomeEditTab(' +prevCounter+ ')');
		  }
	 }
	 
	 function previewSignatureDetailInfo(){
		 homeCarriedName = $("#homeCarriedName").val();
		 homeAddress = $("#homeAddress").val();
		 homeTelephone = $("#homeTelephone").val();
		 homeEmailAddress = $("#homeEmailAddress").val();
		 homeSitutationDescription = $("#homeSitutationDescription").val();
		 homeOtherBusinessPremises = $("#homeOtherBusinessPremises").val();
		 
		$("#homeCarriedNamePreview").html(homeCarriedName);
		$("#homeAddressPreview").html(homeAddress);
		$("#homeTelephonePreview").html(homeTelephone);
		$("#homeEmailAddressPreview").html(homeEmailAddress);
		$("#homeSitutationDescriptionPreview").html(homeSitutationDescription);
		$("#homeOtherBusinessPremisesPreview").html(homeOtherBusinessPremises);
		
		maternityPatientNum = $("#maternityPatientNum").val();
		otherPatientNum = $("#otherPatientNum").val();
		 
		$("#maternityPatientNumPreview").html(maternityPatientNum);
		$("#otherPatientNumPreview").html(otherPatientNum);
		
		nursingStaffCategory = $("#nursingStaffCategory").val();
		$("#nursingStaffCategoryPreview").html(nursingStaffCategory);
		
		empConnectionNum = $("#empConnectionNum").val();
		empConnectionParticulars = $("#empConnectionParticulars").val();
		patientFee = $("#patientFee").val();
		applicantInterestAddress = $("#applicantInterestAddress").val();
		signatureDate = $("#signatureDate").val();
		$("#empConnectionNumPreview").html(empConnectionNum);
		$("#empConnectionParticularsPreview").html(empConnectionParticulars);
		$("#patientFeePreview").html(patientFee);
		$("#applicantInterestAddressPreview").html(applicantInterestAddress);
		$("#signatureDatePreview").html(signatureDate);
	 }
	 
	 /*applicant detail*/
	 function applicantDetailData(counter,deleteKey){
		 if(counter!=''&&deleteKey==''){
	     applicantDetailVal = counter;
		 applicantName = $("#editApplicantName"+counter).val();
		 applicantTelephone = $("#editApplicantTelephone"+counter).val();
		 applicantAddress = $("#editApplicantAddress"+counter).val();
		 applicantEmailAddress = $("#editApplicantEmailAddress"+counter).val();
		 applicantNationality = $("#editApplicantNationality"+counter).val();
		 medicalApplicationId=$("#medicalApplicationId").val();
		 }else{
		 applicantDetailVal = $("#applicantDetailVal").val();
		 applicantName = $("#applicantName").val();
		 applicantTelephone = $("#applicantTelephone").val();
		 applicantAddress = $("#applicantAddress").val();
		 applicantEmailAddress = $("#applicantEmailAddress").val();
		 applicantNationality = $("#applicantNationality").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
		 }
		 medicalFacilitiesAppliId=$("#medicalFacilitiesAppliId"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesApplicantDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": applicantDetailVal,
			    	 "<portlet:namespace/>applicantName": applicantName,
			    	 "<portlet:namespace/>applicantTelephone": applicantTelephone,
			    	 "<portlet:namespace/>applicantAddress": applicantAddress,
			    	 "<portlet:namespace/>applicantEmailAddress": applicantEmailAddress,
			    	 "<portlet:namespace/>applicantNationality": applicantNationality,    
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesAppliId": medicalFacilitiesAppliId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			    	 
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
				    $("#medicalFacilitiesAppliId"+result["counter"]).val(result["medicalFacilitiesAppliId"]);
		    },
			    error: function (data) {
			    },
			  });
	}

    /*home detail */
	 function homeDetailData(counter,deleteKey){
    	if(counter!=''&&deleteKey==''){
    		console.log("edit");
    	 homeDetailVal =counter;
   		 homeCarriedName = $("#editHomeCarriedName"+counter).val();
   		 homeAddress = $("#editHomeAddress"+counter).val();
   		 homeEmailAddress = $("#editHomeEmailAddress"+counter).val();
   		 homeTelephone = $("#editHomeTelephone"+counter).val();
   		 homeSitutationDescription = $("#editHomeSitutationDescription"+counter).val();
   		 homeOtherBusinessPremises = $("#editHomeOtherBusinessPremises"+counter).val();
   		 medicalApplicationId=$("#medicalApplicationId").val();
    	}else{
    	homeDetailVal = $("#homeDetailVal").val();
		 homeCarriedName = $("#homeCarriedName").val();
		 homeAddress = $("#homeAddress").val();
		 homeEmailAddress = $("#homeEmailAddress").val();
		 homeTelephone = $("#homeTelephone").val();
		 homeSitutationDescription = $("#homeSitutationDescription").val();
		 homeOtherBusinessPremises = $("#homeOtherBusinessPremises").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
    	}
    	medicalFacilitiesHomeInfoId=$("#medicalFacilitiesHomeInfoId"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesHomeDetailUrl}",
			    
			    data: {
			    	 "<portlet:namespace/>counter": homeDetailVal,
			    	 "<portlet:namespace/>homeCarriedName": homeCarriedName,
			    	 "<portlet:namespace/>homeAddress": homeAddress,
			    	 "<portlet:namespace/>homeEmailAddress": homeEmailAddress,
			    	 "<portlet:namespace/>homeTelephone": homeTelephone,
			    	 "<portlet:namespace/>homeSitutationDescription": homeSitutationDescription,
			    	 "<portlet:namespace/>homeOtherBusinessPremises": homeOtherBusinessPremises,
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesHomeInfoId": medicalFacilitiesHomeInfoId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#medicalFacilitiesHomeInfoId"+result["counter"]).val(result["medicalFacilitiesHomeInfoId"]);
		    },
			    error: function (data) {
			    },
			  });
	}
    
	 /*number of patient*/
	 function patientCountData(counter,deleteKey){
		 if(counter!=''&&deleteKey==''){
		 patientCountVal =counter;
		 maternityPatientNum = $("#editMaternityPatientNum"+counter).val();
		 otherPatientNum = $("#editOtherPatientNum"+counter).val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }else{
		 patientCountVal = $("#patientCountVal").val();		
		 maternityPatientNum = $("#maternityPatientNum").val();
		 otherPatientNum = $("#otherPatientNum").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }
		 medicalFacilitiesHomeTwoId=$("#patientCount"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesPatientCountUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": patientCountVal,
			    	 "<portlet:namespace/>maternityPatientNum": maternityPatientNum,
			    	 "<portlet:namespace/>otherPatientNum": otherPatientNum,			    	
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesHomeTwoId": medicalFacilitiesHomeTwoId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#patientCount"+result["counter"]).val(result["medicalFacilitiesHomeTwoId"]);
		    },
			    error: function (data) {
			    },
			  });
	}
/*Nursing staff*/
	 function nursingStaffData(counter,deleteKey){
	 if(counter!=''&&deleteKey==''){
		 nursingStaffDetailVal =counter;
		 nursingStaffName = $("#editNursingStaffName"+counter).val();
		 nursingStaffQualifications = $("#editNursingStaffQualifications"+counter).val();
		 nursingStaffCategory = $("#editNursingStaffCategory"+counter).val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }else{
		 nursingStaffDetailVal = $("#nursingStaffDetailVal").val();		
		 nursingStaffName = $("#nursingStaffName").val();
		 nursingStaffQualifications = $("#nursingStaffQualifications").val();
		 nursingStaffCategory = $("#nursingStaffCategory").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }
	 	medicalFacilitiesNurseStaffId=$("#nursingStaffDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesNursingStaffDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": nursingStaffDetailVal,
			    	 "<portlet:namespace/>nursingStaffName": nursingStaffName,
			    	 "<portlet:namespace/>nursingStaffQualifications": nursingStaffQualifications,
			    	 "<portlet:namespace/>nursingStaffCategory": nursingStaffCategory,			    	
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesNurseStaffId": medicalFacilitiesNurseStaffId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#nursingStaffDetail"+result["counter"]).val(result["medicalFacilitiesNurseStaffId"]);
		    },
			    error: function (data) {
			    },
			  });
	}
/*medical practitioner details*/
	 function medicalPractitionerData(counter,deleteKey){
	 if(counter!=''&&deleteKey==''){
		 medicalPractitionerDetailVal =counter;
		 medicalPractitionerName = $("#editMedicalPractitionerName"+counter).val();
		 medicalPractitionerQualifications = $("#editMedicalPractitionerQualifications"+counter).val();
		 medicalPractitionerQualifiesNurseRatio = $("#editMedicalPractitionerQualifiesNurseRatio"+counter).val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }else{
    	 medicalPractitionerDetailVal = $("#medicalPractitionerDetailVal").val();		
		 medicalPractitionerName = $("#medicalPractitionerName").val();
		 medicalPractitionerQualifications = $("#medicalPractitionerQualifications").val();
		 medicalPractitionerQualifiesNurseRatio = $("#medicalPractitionerQualifiesNurseRatio").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
	    }
	 medicalFacilitiesNurseDetailId=$("#medicalPractitionerDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesMedicalPractitionerDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": medicalPractitionerDetailVal,
			    	 "<portlet:namespace/>medicalPractitionerName": medicalPractitionerName,
			    	 "<portlet:namespace/>medicalPractitionerQualifications": medicalPractitionerQualifications,
			    	 "<portlet:namespace/>medicalPractitionerQualifiesNurseRatio": medicalPractitionerQualifiesNurseRatio,			    	
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesNurseDetailId": medicalFacilitiesNurseDetailId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#medicalPractitionerDetail"+result["counter"]).val(result["medicalFacilitiesNurseDetailId"]);
		    },
			    error: function (data) {
			    },
			  });
	}
/*superintendence of a qualified nurse */
	 function medicalPractitionerQualifiedNurseData(isSaveAndContinue){		
		 superintendenceNurseName = $("#superintendenceNurseName").val();
		 superintendenceNurseQualifications = $("#superintendenceNurseQualifications").val();		
		 qualifiedNurse=$("input[name='qualifiedNurse']:checked").val();
		 patientCareUnderSuperintence=$("input[name='patientCareUnderSuperintence']:checked").val();
		 medicalPractitionerName = $("#medicalPractitionerName").val();
		 medicalPractitionerQualifications = $("#medicalPractitionerQualifications").val();
		 medicalPractitionerQualifiesNurseRatio = $("#medicalPractitionerQualifiesNurseRatio").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesPractitionerQualifiedNurseDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>superintendenceNurseName": superintendenceNurseName,
			    	 "<portlet:namespace/>superintendenceNurseQualifications": superintendenceNurseQualifications,			    				    	
			    	 "<portlet:namespace/>qualifiedNurse": qualifiedNurse,			    				    	
			    	 "<portlet:namespace/>patientCareUnderSuperintence": patientCareUnderSuperintence,			    				    	
			    	 "<portlet:namespace/>medicalPractitionerName": medicalPractitionerName,			    				    	
			    	 "<portlet:namespace/>medicalPractitionerQualifications": medicalPractitionerQualifications,			    				    	
			    	 "<portlet:namespace/>medicalPractitionerQualifiesNurseRatio": medicalPractitionerQualifiesNurseRatio,			    				    	
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			      		    },
			    success: function (data) {
			    	if(!isSaveAndContinue){
			    		applicantInfo();
			    	}
		    	},
			    error: function (data) {
			    },
			  });
	}
/*maternity home details*/
      function maternityHomeData(counter,deleteKey){
  	 	 if(counter!=''&&deleteKey==''){
  		  	 maternityHomeDetailVal=counter;
		 	 maternityHomeName = $("#editMaternityHomeName"+counter).val();
			 maternityHomeQualifications = $("#editMaternityHomeQualifications"+counter).val();
			 maternityHomeQualified = $("#editMaternityHomeQualified"+counter).val();
			 medicalApplicationId=$("#medicalApplicationId").val();
		    }else{
  		 maternityHomeDetailVal = $("#maternityHomeDetailVal").val();		
		 maternityHomeName = $("#maternityHomeName").val();
		 maternityHomeQualifications = $("#maternityHomeQualifications").val();
		 maternityHomeQualified = $("#maternityHomeQualified").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
    	 }
  	 	medicalFacilitiesMaterHomeId=$("#maternityHomeDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesMaternityDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": maternityHomeDetailVal,
			    	 "<portlet:namespace/>maternityHomeName": maternityHomeName,
			    	 "<portlet:namespace/>maternityHomeQualifications": maternityHomeQualifications,
			    	 "<portlet:namespace/>maternityHomeQualified": maternityHomeQualified,			    	
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesMaterHomeId": medicalFacilitiesMaterHomeId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#maternityHomeDetail"+result["counter"]).val(result["medicalFacilitiesMaterHomeId"]);
		    	},
			    error: function (data) {
			    },
			  });
	}
	
/* Company Details */
function comapnyDetailData(counter,deleteKey){
    	if(counter!=''&&deleteKey==''){
    	 companyDetailVal =counter;
    	 comFullName = $("#editComFullName"+counter).val();
	   	 comAddress = $("#editComAddress"+counter).val();
	   	 comOffice = $("#editComOffice"+counter).val();
   		 medicalApplicationId=$("#medicalApplicationId").val();
    	}else{
    	 companyDetailVal = $("#companyDetailVal").val();
    	 comFullName = $("#comFullName").val();
    	 comAddress = $("#comAddress").val();
    	 comOffice = $("#comOffice").val();
		 medicalApplicationId=$("#medicalApplicationId").val();
    	}
    	 medicalFacilitiesComDetailId=$("#companyDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesCompanyDetailUrl}",
			    
			    data: {
			    	 "<portlet:namespace/>counter": companyDetailVal,
			    	 "<portlet:namespace/>comFullName": comFullName,
			    	 "<portlet:namespace/>comAddress": comAddress,
			    	 "<portlet:namespace/>comOffice": comOffice,
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			    	 "<portlet:namespace/>medicalFacilitiesComDetailId": medicalFacilitiesComDetailId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#companyDetail"+result["counter"]).val(result["medicalFacilitiesComDetailId"]);
		   	 	},
			    error: function (data) {
			    },
		});
	}
 
 
 
	/*signature */
	function signatureData(){
		empConnectionNum = $("#empConnectionNum").val();
		empConnectionParticulars = $("#empConnectionParticulars").val();
		patientFee = $("#patientFee").val();
		applicantInterestAddress = $("#applicantInterestAddress").val();
		signatureDate = $("#signatureDate").val();
		medicalApplicationId=$("#medicalApplicationId").val();
		 $.ajax({
			    type: "POST",
			    url: "${medicalFacilitiesSignatureUrl}",
			    data: {
			    	 "<portlet:namespace/>empConnectionNum": empConnectionNum,
			    	 "<portlet:namespace/>empConnectionParticulars": empConnectionParticulars,
			    	 "<portlet:namespace/>patientFee": patientFee,
			    	 "<portlet:namespace/>applicantInterestAddress": applicantInterestAddress,			
			    	 "<portlet:namespace/>signatureDate": signatureDate,			
			    	 "<portlet:namespace/>medicalApplicationId": medicalApplicationId,
			      		    },
			    success: function (data) {
			    	uploadDocuments('signatureUploadBtn','Signature of Applicant Employee');
		    	},
			    error: function (data) {
			    },
		});
	 }
	 function deleteApplicantINfo(keyForDelete){
   	 	$.ajax({
			    type: "POST",
			    url: "${delteMedicalApplicant}",
			    data: {
			    	 "<portlet:namespace/>keyForDelete": KeyForDelete,
			      		    },
			    success: function (data) {
		    },
			    error: function (data) {
		    },
		});
	 }
	 
	 function naveTabCount(){
		var j = 1;
		$(".side-tab-count").find(".nav-item").each(function() {
		    var $next = $(this);
		    
		    if (!$next.hasClass('hide')) {
		        $next.find('.step-type').html(j);
		        j++;
		    }
		});
		var i = 1;
		$(".side-tab-pre-count").find(".nav-item").each(function() {
		    var $nextPre = $(this);
		    
		    if (!$nextPre.hasClass('hide')) {
		        $nextPre.find('.step-type').html(i);
		        i++;
		    }
		});
	 }
</script>