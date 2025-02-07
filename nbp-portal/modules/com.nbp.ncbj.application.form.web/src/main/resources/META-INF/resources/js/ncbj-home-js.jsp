<portlet:resourceURL var="addApplicantDetailInfoUrl" id="/applicants/detail/info" />
<portlet:resourceURL var="addEffectiveApplicantDetailInfoUrl" id="/effective/applicant/detail/info" />
<portlet:resourceURL var="addCompanyDetailInfoUrl" id="/company/detail/info" />
<portlet:resourceURL var="addSectionOneCompanyDetailInfoUrl" id="/section/one/company/info"></portlet:resourceURL>
<portlet:resourceURL var="addProductServicesDetailInfoUrl" id="/product/services/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addEmployeesNumberDetailInfoUrl" id="/employees/number/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addWorkPatternDetailInfoUrl" id="/work/pattern/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addHaccpNumberDetailInfoUrl" id="/haccp/number/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addHazardAnalysisDetailInfoUrl" id="/hazard/analysis/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addLicenceListDetailInfoUrl" id="/licence/list/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="organizationInfoFirstFormUrl" id="/organization/first/form/info"></portlet:resourceURL>
<portlet:resourceURL var="additionalLocationSignUrl" id="/additional/location/multisite/info"></portlet:resourceURL>
<portlet:resourceURL var="companyDetailInfoUrl" id="/company/detail/information/gen"/>
<portlet:resourceURL var="premisesAndLocationInfoUrl" id="/premises/location/information"/>
<portlet:resourceURL var="processDetailsInvolvedInfoUrl" id="/process/details/involved/info"/>
<portlet:resourceURL var="consultancyServicesInfoInfoUrl" id="/consultancy/Services/info"/>
<portlet:resourceURL var="quotationformTwoInfoUrl" id="/quotation/form/two/info"/>
<portlet:resourceURL var="companyDetailTwoUrl" id="/company/form/two/info"/>
<portlet:resourceURL var="productServiceDetailUrl" id="/product/services/info"/>
<portlet:resourceURL var="numberOfEmployeeDetailUrl" id="/number/employee/detail/info"/>
<portlet:resourceURL var="workPatternEmpShiftsUrl" id="/work/pattern/emp/shift/info"/>
<portlet:resourceURL var="haccpNumberStudyDetailUrl" id="/haccp/number/shift/info"/>
<portlet:resourceURL var="hazardAnalysisDetailUrl" id="/hazard/analysis/detail/additional/info"/>
<portlet:resourceURL var="consentLicencePermitUrl" id="/consent/licence/permit/info"/>
<portlet:resourceURL var="activitiesProcessesListUrl" id="/activities/process/list/info"/>
<portlet:resourceURL var="companyDetailMultiInfoUrl" id="/company/detail/multi/info"/>
<portlet:resourceURL var="specificActivitiesListSelectedUrl" id="/specific/Activities/list/info"/>
<portlet:resourceURL var="addquotationApplicantDetailInfoUrl" id="/quotation/applicants/detail/info" />
<portlet:resourceURL var="quotationBusinessDetailsURL" id="/quotation/Business/Details" />
<portlet:resourceURL var="deletequotationBusinessAdd" id="/delete/quotation/Business/Add" />
<portlet:resourceURL var="newCompanyDetailUrl" id="/new/company/Detail/Url" />
<script>
	function addApplicantDetail() {
		applicantDetailVal = $("#applicantDetailVal").val();
		applicantShifts = $("#applicantShifts").val();
		applicantProductTypes = $("#applicantProductTypes").val();
		applicantAddressOne = $("#applicantAddressOne").val();
		headOffices = $("#headOffices").val();
		noOfFullTimeEmployees = $("#noOfFullTimeEmployees").val();
		noOfPartTimeEmployees = $("#noOfPartTimeEmployees").val();
		noOfContractors = $("#noOfContractors").val();
		noOfContractedWorkers = $("#noOfContractedWorkers").val();
		if (applicantShifts != "" || applicantProductTypes != "" || applicantAddressOne != "" || headOffices != "" 
				|| noOfFullTimeEmployees != "" || noOfPartTimeEmployees != "" || noOfContractors != ""|| noOfContractedWorkers != "") {
			$(".addApplicantDetailTableBox").removeClass("hide");
			$
					.ajax({
						type : "POST",
						url : "${addApplicantDetailInfoUrl}",
						data : {
							"<portlet:namespace/>applicantDetailVal" : applicantDetailVal,
						},
						async : false,
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
							$(".applicantShifts" + applicantDetailVal).append(
									applicantShifts);
							$(".applicantProductTypes" + applicantDetailVal)
									.append(applicantProductTypes);
							$(".applicantAddressOne" + applicantDetailVal)
									.append(applicantAddressOne);
							
							$(".headOffices"+ applicantDetailVal)
							.append(headOffices);
							$(".noOfFullTimeEmployees"+ applicantDetailVal)
									.append(noOfFullTimeEmployees);
							$(".noOfPartTimeEmployees"
											+ applicantDetailVal)
									.append(noOfPartTimeEmployees);
							$(".noOfContractors" + applicantDetailVal)
									.append(noOfContractors);
							$(".noOfContractedWorkers"
											+ applicantDetailVal)
									.append(noOfContractedWorkers);
							/* VALUE INCREAMENT */
							addBusinessDetailInfo(''); 
							applicantDetailVal++;
							$("#applicantDetailVal").val(applicantDetailVal);
							/* RESET FORM FIELDS */
							$("#applicantShifts").val("");
							$("#applicantProductTypes").val("");
							$("#applicantAddressOne").val("");
							$("#headOffices").val("");
							$("#noOfFullTimeEmployees").val("");
							$("#noOfPartTimeEmployees").val("");
							$("#noOfContractors").val("");
							$("#noOfContractedWorkers").val("");
						}
					});
		} else {
			$("#applicantAddressOne").focus();
		}
	}
	function applicantDetailEditTab(applicantDetailVal){
		
		$(".editApplicantDetailEditTabPopupOne").modal("show");
		$(".editApplicantAddressOne").attr("id" , "editApplicantAddressOne"+applicantDetailVal);
		$(".editApplicantShifts").attr("id" , "editApplicantShifts"+applicantDetailVal);
		$(".editApplicantProductTypes").attr("id" , "editApplicantProductTypes"+applicantDetailVal);
		$(".editHeadOffices").attr("id" , "editHeadOffices"+applicantDetailVal);
		$(".editNoOfFullTimeEmployees").attr("id" , "editNoOfFullTimeEmployees"+applicantDetailVal);
		$(".editNoOfPartTimeEmployees").attr("id" , "editNoOfPartTimeEmployees"+applicantDetailVal);
		$(".editNoOfContractors").attr("id" , "editNoOfContractors"+applicantDetailVal);
		$(".editNoOfContractedWorkers").attr("id" , "editNoOfContractedWorkers"+applicantDetailVal);
		applicantAddressOne = $(".applicantAddressOne"+applicantDetailVal+":first").text().trim();
		applicantShifts = $(".applicantShifts"+applicantDetailVal+":first").text().trim();
		applicantProductTypes = $(".applicantProductTypes"+applicantDetailVal+":first").text().trim();
		headOffices = $(".headOffices"+applicantDetailVal+":first").text().trim();
		noOfFullTimeEmployees = $(".noOfFullTimeEmployees"+applicantDetailVal+":first").text().trim();
		noOfPartTimeEmployees = $(".noOfPartTimeEmployees"+applicantDetailVal+":first").text().trim();
		noOfContractors = $(".noOfContractors"+applicantDetailVal+":first").text().trim();
		noOfContractedWorkers = $(".noOfContractedWorkers"+applicantDetailVal+":first").text().trim();
		$("#editApplicantAddressOne"+applicantDetailVal).val(applicantAddressOne);
		$("#editApplicantShifts"+applicantDetailVal).val(applicantShifts);
		$("#editApplicantProductTypes"+applicantDetailVal).val(applicantProductTypes);
		$("#editHeadOffices"+applicantDetailVal).val(headOffices);
		$("#editNoOfFullTimeEmployees"+applicantDetailVal).val(noOfFullTimeEmployees);
		$("#editNoOfPartTimeEmployees"+applicantDetailVal).val(noOfPartTimeEmployees);
		$("#editNoOfContractors"+applicantDetailVal).val(noOfContractors);
		$("#editNoOfContractedWorkers"+applicantDetailVal).val(noOfContractedWorkers);
		$(".saveEditApplicantDetailPopupDataBtn").attr("onclick" , "applicantDetailEditData("+applicantDetailVal+")");
	}
 	function applicantDetailEditData(applicantDetailVal){
 		addBusinessDetailInfo(applicantDetailVal);
		$(".applicantAddressOne" + applicantDetailVal).html($("#editApplicantAddressOne"+applicantDetailVal).val());
		$(".applicantShifts" + applicantDetailVal).html($("#editApplicantShifts"+applicantDetailVal).val());
		$(".applicantProductTypes" + applicantDetailVal).html($("#editApplicantProductTypes"+applicantDetailVal).val());
		$(".headOffices" + applicantDetailVal).html($("#editHeadOffices"+applicantDetailVal).val());
		$(".noOfFullTimeEmployees" + applicantDetailVal).html($("#editNoOfFullTimeEmployees"+applicantDetailVal).val());
		$(".noOfPartTimeEmployees" + applicantDetailVal).html($("#editNoOfPartTimeEmployees"+applicantDetailVal).val());
		$(".noOfContractors" + applicantDetailVal).html($("#editNoOfContractors"+applicantDetailVal).val());
		$(".noOfContractedWorkers" + applicantDetailVal).html($("#editNoOfContractedWorkers"+applicantDetailVal).val());
		
		$(".editApplicantAddressOne").val("");
		$(".editApplicantShifts").val("");
		$(".editApplicantProductTypes").val("");
		$(".editHeadOffices").val("");
		$(".editNoOfFullTimeEmployees").val("");
		$(".editNoOfPartTimeEmployees").val("");
		$(".editNoOfContractors").val("");
		$(".editNoOfContractedWorkers").val("");
	}
 	function applicantDetailDeleteData(applicantDetailValData) {
 	      deleteApplicantINfo(applicantDetailValData);
		  var applicantDetailCounter = $("#applicantDetailVal").val();
		  $("#applicantDetailVal").val(applicantDetailCounter - 1);
		  var delRowElement = $(".applicant-row" + applicantDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(applicantDetailValData) + 1;
		  for (var i = j; i <= applicantDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".applicant-row" + i);
		    rowElement.attr("class", "applicant-row"+ prevCounter);
		    rowElement.find("td.applicantAddressOne"+i).removeClass("applicantAddressOne"+i).addClass("applicantAddressOne"+prevCounter);
		    rowElement.find("td.applicantShifts"+i).removeClass("applicantShifts"+i).addClass("applicantShifts"+prevCounter);
		    rowElement.find("td.applicantProductTypes"+i).removeClass("applicantProductTypes"+i).addClass("applicantProductTypes"+prevCounter);
		    rowElement.find("td.headOffices"+i).removeClass("headOffices"+i).addClass("headOffices"+prevCounter);
		    rowElement.find("td.noOfFullTimeEmployees"+i).removeClass("noOfFullTimeEmployees"+i).addClass("noOfFullTimeEmployees"+prevCounter);
		    rowElement.find("td.noOfPartTimeEmployees"+i).removeClass("noOfPartTimeEmployees"+i).addClass("noOfPartTimeEmployees"+prevCounter);
		    rowElement.find("td.noOfContractors"+i).removeClass("noOfContractors"+i).addClass("noOfContractors"+prevCounter);
		    rowElement.find("td.noOfContractedWorkers"+i).removeClass("noOfContractedWorkers"+i).addClass("noOfContractedWorkers"+prevCounter);
		    rowElement.find("#applicantDetailDeleteDataTab").attr('onclick', 'applicantDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#applicantDetailEditTab").attr('onclick', 'applicantDetailEditTab(' +prevCounter+ ')');
		  }
	 }
 	/* Effective need to remove */
	function addEffectiveApplicantDetail() {
		effectiveApplicantDetailVal = $("#effectiveApplicantDetailVal").val();
		
		if (noOfFullTimeEmployees != "" || noOfPartTimeEmployees != ""
				|| noOfContractors != "" || noOfContractedWorkers != "") {
			$(".addEffectiveApplicantDetailTableBox").removeClass("hide");
			$
					.ajax({
						type : "POST",
						url : "${addEffectiveApplicantDetailInfoUrl}",
						data : {
							"<portlet:namespace/>effectiveApplicantDetailVal" : effectiveApplicantDetailVal,
						},
						async : false,
						success : function(data) {
							$(".addEffectiveApplicantDetailTable").each(
									function(index) {
										if (index === 0) {
											$(this).append(data);
										} else {
											$cloneRow = $(data).clone();
											$cloneRow.find('td:last').remove()
													.end();
											$cloneRow.find('td').slice(-2)
													.remove();
											$(this).append($cloneRow);
										}
									});
							addNumOfEffectedPersonalInfo();
							effectiveApplicantDetailVal++;
							$("#effectiveApplicantDetailVal").val(
									effectiveApplicantDetailVal);
						}
					});
		} else {
			$("#noOfFullTimeEmployees").focus();
		}
	}
	function effectiveApplicantDetailEditTab(effectiveApplicantDetailVal){
		$(".editEffectiveApplicantDetailEditTabPopupOne").modal("show");
		$(".editNoOfFullTimeEmployees").attr("id" , "editNoOfFullTimeEmployees"+effectiveApplicantDetailVal);
		$(".editNOfPartTimeEmployees").attr("id" , "editNOfPartTimeEmployees"+effectiveApplicantDetailVal);
		$(".editNoOfContractors").attr("id" , "editNoOfContractors"+effectiveApplicantDetailVal);
		$(".editNoOfContractedWorkers").attr("id" , "editNoOfContractedWorkers"+effectiveApplicantDetailVal);
		noOfFullTimeEmployees = $(".noOfFullTimeEmployees"+effectiveApplicantDetailVal+":first").text().trim();
		noOfPartTimeEmployees = $(".noOfPartTimeEmployees"+effectiveApplicantDetailVal+":first").text().trim();
		noOfContractors = $(".noOfContractors"+effectiveApplicantDetailVal+":first").text().trim();
		noOfContractedWorkers = $(".noOfContractedWorkers"+effectiveApplicantDetailVal+":first").text().trim();
		$("#editNoOfFullTimeEmployees"+effectiveApplicantDetailVal).val(noOfFullTimeEmployees);
		$("#editNOfPartTimeEmployees"+effectiveApplicantDetailVal).val(noOfPartTimeEmployees);
		$("#editNoOfContractors"+effectiveApplicantDetailVal).val(noOfContractors);
		$("#editNoOfContractedWorkers"+effectiveApplicantDetailVal).val(noOfContractedWorkers);
		$(".saveEditEffectiveApplicantDetailPopupDataBtn").attr("onclick" , "effectiveApplicantDetailEditData("+effectiveApplicantDetailVal+")");
	}
 	function effectiveApplicantDetailEditData(effectiveApplicantDetailVal){
		$(".noOfFullTimeEmployees" + effectiveApplicantDetailVal).html($("#editNoOfFullTimeEmployees"+effectiveApplicantDetailVal).val());
		$(".noOfPartTimeEmployees" + effectiveApplicantDetailVal).html($("#editNOfPartTimeEmployees"+effectiveApplicantDetailVal).val());
		$(".noOfContractors" + effectiveApplicantDetailVal).html($("#editNoOfContractors"+effectiveApplicantDetailVal).val());
		$(".noOfContractedWorkers" + effectiveApplicantDetailVal).html($("#editNoOfContractedWorkers"+effectiveApplicantDetailVal).val());
		$(".editNoOfFullTimeEmployees").val("");
		$(".editNOfPartTimeEmployees").val("");
		$(".editNoOfContractors").val("");
		$(".editNoOfContractedWorkers").val("");

	}
 	
 	function effectiveApplicantDetailDeleteData(effectiveApplicantDetailValData) {
		  var effectiveApplicantDetailCounter = $("#effectiveApplicantDetailVal").val();
		  $("#effectiveApplicantDetailVal").val(effectiveApplicantDetailCounter - 1);
		  var delRowElement = $(".effective-applicant-row" + effectiveApplicantDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(effectiveApplicantDetailValData) + 1;
		  for (var i = j; i <= effectiveApplicantDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".effective-applicant-row" + i);
		    rowElement.attr("class", "effective-applicant-row"+ prevCounter);
		    rowElement.find("td.noOfFullTimeEmployees"+i).removeClass("noOfFullTimeEmployees"+i).addClass("noOfFullTimeEmployees"+prevCounter);
		    rowElement.find("td.noOfPartTimeEmployees"+i).removeClass("noOfPartTimeEmployees"+i).addClass("noOfPartTimeEmployees"+prevCounter);
		    rowElement.find("td.noOfContractors"+i).removeClass("noOfContractors"+i).addClass("noOfContractors"+prevCounter);
		    rowElement.find("td.noOfContractedWorkers"+i).removeClass("noOfContractedWorkers"+i).addClass("noOfContractedWorkers"+prevCounter);
		    rowElement.find("#effectiveApplicantDetailDeleteDataTab").attr('onclick', 'effectiveApplicantDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#effectiveApplicantDetailEditTab").attr('onclick', 'effectiveApplicantDetailEditTab(' +prevCounter+ ')');
		  }
	 }
	function addCompanyDetail() {
		companyDetailVal = $("#companyDetailVal").val();
		companyName = $("#companyName").val();
		companyAddress = $("#companyAddress").val();
		headOfCompany = $("#headOfCompany").val();
		jobTitleOne = $("#jobTitleOne").val();
		companyEmailOne = $("#companyEmailOne").val();
		companyNumOne = $("#companyNumOne").val();
		contactName = $("#contactName").val();
		jobTitleTwo = $("#jobTitleTwo").val();
		companyEmailTwo = $("#companyEmailTwo").val();
		companyNumTwo = $("#companyNumTwo").val();
		if (companyName != "" || companyAddress != "" ||
				headOfCompany != "" || jobTitleOne != "" || companyEmailOne != ""
				|| companyNumOne != "" || contactName != ""
				|| jobTitleTwo != "" || companyEmailTwo != ""
				|| companyNumTwo != "") {
			$(".addCompanyDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addCompanyDetailInfoUrl}",
				data : {
					"<portlet:namespace/>companyDetailVal" : companyDetailVal,
				},
				async : false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addCompanyDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td:last').remove().end();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
											
					/* APPEND DATA INTO TABLE */
					$(".companyName" + companyDetailVal)
							.append(companyName);
					$(".companyAddress" + companyDetailVal).append(companyAddress);
					$(".headOfCompany" + companyDetailVal)
							.append(headOfCompany);
					$(".jobTitleOne" + companyDetailVal).append(jobTitleOne);
					$(".companyEmailOne" + companyDetailVal).append(
							companyEmailOne);
					$(".companyNumOne" + companyDetailVal)
							.append(companyNumOne);
					$(".contactName" + companyDetailVal).append(contactName);
					$(".jobTitleTwo" + companyDetailVal).append(jobTitleTwo);
					$(".companyEmailTwo" + companyDetailVal).append(
							companyEmailTwo);
					$(".companyNumTwo" + companyDetailVal)
							.append(companyNumTwo);
					
 					/* VALUE INCREAMENT */
					addCompanyDetailMultiInfo('','');
					companyDetailVal++;
					$("#companyDetailVal").val(companyDetailVal);
					
					/* RESET FORM FIELDS */
					
                    $("#companyName").val("");
					$("#companyAddress").val("");
					$("#headOfCompany").val("");
					$("#jobTitleOne").val("");
					$("#companyEmailOne").val("");
					$("#companyNumOne").val("");
					$("#contactName").val("");
					$("#jobTitleTwo").val("");
					$("#companyEmailTwo").val("");
					$("#companyNumTwo").val("");

				}
			});
		} else {
			$("#companyName").focus();
		}
	}
	
	function companyDetailEditTab(companyDetailVal){
		$(".editCompanyDetailEditTabPopupOne").modal("show");
		$(".editCompanyName").attr("id" , "editCompanyName"+companyDetailVal);
		$(".editCompanyAddress").attr("id" , "editCompanyAddress"+companyDetailVal);
		$(".editHeadOfCompany").attr("id" , "editHeadOfCompany"+companyDetailVal);
		$(".editJobTitleOne").attr("id" , "editJobTitleOne"+companyDetailVal);
		$(".editCompanyEmailOne").attr("id" , "editCompanyEmailOne"+companyDetailVal);
		$(".editCompanyNumOne").attr("id" , "editCompanyNumOne"+companyDetailVal);
		$(".editContactName").attr("id" , "editContactName"+companyDetailVal);
		$(".editJobTitleTwo").attr("id" , "editJobTitleTwo"+companyDetailVal);
		$(".editCompanyEmailTwo").attr("id" , "editCompanyEmailTwo"+companyDetailVal);
		$(".editCompanyNumTwo").attr("id" , "editCompanyNumTwo"+companyDetailVal);
		
		companyName = $(".companyName"+companyDetailVal+":first").text().trim();
		companyAddress = $(".companyAddress"+companyDetailVal+":first").text().trim();
		headOfCompany = $(".headOfCompany"+companyDetailVal+":first").text().trim();
		jobTitleOne = $(".jobTitleOne"+companyDetailVal+":first").text().trim();
		companyEmailOne = $(".companyEmailOne"+companyDetailVal+":first").text().trim();
		companyNumOne = $(".companyNumOne"+companyDetailVal+":first").text().trim();
		contactName = $(".contactName"+companyDetailVal+":first").text().trim();
		jobTitleTwo = $(".jobTitleTwo"+companyDetailVal+":first").text().trim();
		companyEmailTwo = $(".companyEmailTwo"+companyDetailVal+":first").text().trim();
		companyNumTwo = $(".companyNumTwo"+companyDetailVal+":first").text().trim();
		
		$("#editCompanyName"+companyDetailVal).val(companyName);
		$("#editCompanyAddress"+companyDetailVal).val(companyAddress);
		$("#editHeadOfCompany"+companyDetailVal).val(headOfCompany);
		$("#editJobTitleOne"+companyDetailVal).val(jobTitleOne);
		$("#editCompanyEmailOne"+companyDetailVal).val(companyEmailOne);
		$("#editCompanyNumOne"+companyDetailVal).val(companyNumOne);
		$("#editContactName"+companyDetailVal).val(contactName);
		$("#editJobTitleTwo"+companyDetailVal).val(jobTitleTwo);
		$("#editCompanyEmailTwo"+companyDetailVal).val(companyEmailTwo);
		$("#editCompanyNumTwo"+companyDetailVal).val(companyNumTwo);
		
		$(".saveEditCompanyDetailPopupDataBtn").attr("onclick" , "companyDetailEditData("+companyDetailVal+")");
	}
 	function companyDetailEditData(companyDetailVal){
 		addCompanyDetailMultiInfo(companyDetailVal,'');
 		$(".companyName" + companyDetailVal).html($("#editCompanyName"+companyDetailVal).val());
		$(".companyAddress" + companyDetailVal).html($("#editCompanyAddress"+companyDetailVal).val());
		$(".headOfCompany" + companyDetailVal).html($("#editHeadOfCompany"+companyDetailVal).val());
		$(".jobTitleOne" + companyDetailVal).html($("#editJobTitleOne"+companyDetailVal).val());
		$(".companyEmailOne" + companyDetailVal).html($("#editCompanyEmailOne"+companyDetailVal).val());
		$(".companyNumOne" + companyDetailVal).html($("#editCompanyNumOne"+companyDetailVal).val());
		$(".contactName" + companyDetailVal).html($("#editContactName"+companyDetailVal).val());
		$(".jobTitleTwo" + companyDetailVal).html($("#editJobTitleTwo"+companyDetailVal).val());
		$(".companyEmailTwo" + companyDetailVal).html($("#editCompanyEmailTwo"+companyDetailVal).val());
		$(".companyNumTwo" + companyDetailVal).html($("#editCompanyNumTwo"+companyDetailVal).val());

		
		$(".editCompanyName").val("");
		$(".editCompanyAddress").val("");
		$(".editHeadOfCompany").val("");
		$(".editJobTitleOne").val("");
		$(".editCompanyEmailOne").val("");
		$(".editCompanyNumOne").val("");
		$(".editContactName").val("");
		$(".editJobTitleTwo").val("");
		$(".editCompanyEmailTwo").val("");
		$(".editCompanyNumTwo").val("");

	}
 	function companyDetailDeleteData(companyDetailValData) {
 		addCompanyDetailMultiInfo(companyDetailValData,'deleteApplicant');
		  var companyDetailCounter = $("#companyDetailVal").val();
		  $("#companyDetailVal").val(companyDetailCounter - 1);
		  var delRowElement = $(".company-row" + companyDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(companyDetailValData) + 1;
		  //Update the row numbers and IDs for each row
		  for (var i = j; i <= companyDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".company-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "company-row"+ prevCounter);
		    rowElement.find("td.companyName"+i).removeClass("companyName"+i).addClass("companyName"+prevCounter);
		    rowElement.find("td.companyAddress"+i).removeClass("companyAddress"+i).addClass("companyAddress"+prevCounter);
		    rowElement.find("td.headOfCompany"+i).removeClass("headOfCompany"+i).addClass("headOfCompany"+prevCounter);
		    rowElement.find("td.jobTitleOne"+i).removeClass("jobTitleOne"+i).addClass("jobTitleOne"+prevCounter);
		    rowElement.find("td.companyEmailOne"+i).removeClass("companyEmailOne"+i).addClass("companyEmailOne"+prevCounter);
		    rowElement.find("td.companyNumOne"+i).removeClass("companyNumOne"+i).addClass("companyNumOne"+prevCounter);
		    rowElement.find("td.contactName"+i).removeClass("contactName"+i).addClass("contactName"+prevCounter);
		    rowElement.find("td.jobTitleTwo"+i).removeClass("jobTitleTwo"+i).addClass("jobTitleTwo"+prevCounter);
		    rowElement.find("td.companyEmailTwo"+i).removeClass("companyEmailTwo"+i).addClass("companyEmailTwo"+prevCounter);
		    rowElement.find("td.companyNumTwo"+i).removeClass("companyNumTwo"+i).addClass("companyNumTwo"+prevCounter);
		    rowElement.find("#companyDetailDeleteDataTab").attr('onclick', 'companyDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#companyDetailEditTab").attr('onclick', 'companyDetailEditTab(' +prevCounter+ ')');
		  }
	 }
	/*  Section One Company Detail */
 	function addSectionOneCompanyDetail(){
 		sectionOneCompanyDetailVal = $("#sectionOneCompanyDetailVal").val();
 		siteNumberSectionVal = $("#siteNumberSectionValue").val();
 		if(siteNumberSectionVal == "Multiple Sites more than one Location"){
	 		companyNameTwo = $("#companyNameTwo").val();
	 		companyAddressTwo = $("#companyAddressTwo").val();
	 		sectionOneCompName = $("#sectionOneCompName").val();
	 		sectionOneCompJobTitle = $("#sectionOneCompJobTitle").val();
	 		sectionOneCompEmailAddr = $("#sectionOneCompEmailAddr").val();
	 		sectionOneCompTelNum = $("#sectionOneCompTelNum").val();
	 		sectOneCompContactName = $("#sectOneCompContactName").val();
	 		sectOneCompJobTitle = $("#sectOneCompJobTitle").val();
	 		sectOneCompEmail = $("#sectOneCompEmail").val();
	 		sectOneCompTeleNumber = $("#sectOneCompTeleNumber").val();
	
	
	 		 if(companyNameTwo != "" || companyAddressTwo != "" || sectionOneCompName != "" || sectionOneCompJobTitle !=""|| sectionOneCompTelNum !=""|| sectionOneCompTelNum !=""|| sectOneCompContactName !=""|| sectOneCompJobTitle !=""|| sectOneCompEmail !=""|| sectOneCompTeleNumber !=""){
	 			$(".addSectionOneCompanyDetailTableBox").removeClass("hide");
	 			$.ajax({
	 				type : "POST",
	 				url : "${addSectionOneCompanyDetailInfoUrl}",
	 				data : {
	 					"<portlet:namespace/>sectionOneCompanyDetailVal" : sectionOneCompanyDetailVal,
	 				},
	 				async:false,
	 				success : function(data) {
	 					/* APPEND ROW JSP INTO TABLE */
	 					$(".addSectionOneCompanyDetailTable").each(function(index) {
	 						if (index === 0) {
	 							$(this).append(data);
	 						} else {
	 							$cloneRow = $(data).clone();
	 							$cloneRow.find('td').slice(-2).remove();
	 							$(this).append($cloneRow);
	 						}
	 					});
	 					/* APPEND DATA INTO TABLE */		
	 					$(".companyNameTwo" + sectionOneCompanyDetailVal).append(companyNameTwo);
	 					$(".companyAddressTwo" + sectionOneCompanyDetailVal).append(companyAddressTwo);
	 					$(".sectionOneCompName" + sectionOneCompanyDetailVal).append(sectionOneCompName);
	 					$(".sectionOneCompJobTitle" + sectionOneCompanyDetailVal).append(sectionOneCompJobTitle);
	 					$(".sectionOneCompEmailAddr" + sectionOneCompanyDetailVal).append(sectionOneCompEmailAddr);
	 					$(".sectionOneCompTelNum" + sectionOneCompanyDetailVal).append(sectionOneCompTelNum);
	 					$(".sectOneCompContactName" + sectionOneCompanyDetailVal).append(sectOneCompContactName);
	 					$(".sectOneCompJobTitle" + sectionOneCompanyDetailVal).append(sectOneCompJobTitle);
	 					$(".sectOneCompEmail" + sectionOneCompanyDetailVal).append(sectOneCompEmail);
	 					$(".sectOneCompTeleNumber" + sectionOneCompanyDetailVal).append(sectOneCompTeleNumber);
	 					
	 					/* VALUE INCREAMENT */
	 					comapnyDetailTwoData('','');
	 					sectionOneCompanyDetailVal++;
	 					$("#sectionOneCompanyDetailVal").val(sectionOneCompanyDetailVal);
	 					
						/* RESET FORM FIELDS */
	 					$("#companyNameTwo").val("");
	 					$("#companyAddressTwo").val("");
	 					$("#sectionOneCompName").val("");
	 					$("#sectionOneCompJobTitle").val("");
	 					$("#sectionOneCompEmailAddr").val("");
	 					$("#sectionOneCompTelNum").val("");
	 					$("#sectOneCompContactName").val("");
	 					$("#sectOneCompJobTitle").val("");
	 					$("#sectOneCompEmail").val("");
	 					$("#sectOneCompTeleNumber").val("");
	 					
	 				}
	 			});
	 		}else{
	 			$("#companyNameTwo").focus();
	 		}
 		}
 	}
 	function sectionOneCompanyEditTab(sectionOneCompanyDetailVal){
		$(".editSectionOneCompanyEditTabPopup").modal("show");
		$(".editCompanyNameTwo").attr("id" , "editCompanyNameTwo"+sectionOneCompanyDetailVal);
		$(".editCompanyAddressTwo").attr("id" , "editCompanyAddressTwo"+sectionOneCompanyDetailVal);
		$(".editSectionOneCompName").attr("id" , "editSectionOneCompName"+sectionOneCompanyDetailVal);
		$(".editSectionOneCompJobTitle").attr("id" , "editSectionOneCompJobTitle"+sectionOneCompanyDetailVal);
		$(".editSectionOneCompEmailAddr").attr("id" , "editSectionOneCompEmailAddr"+sectionOneCompanyDetailVal);
		$(".editSectionOneCompTelNum").attr("id" , "editSectionOneCompTelNum"+sectionOneCompanyDetailVal);
		$(".editSectOneCompContactName").attr("id" , "editSectOneCompContactName"+sectionOneCompanyDetailVal);
		$(".editSectOneCompJobTitle").attr("id" , "editSectOneCompJobTitle"+sectionOneCompanyDetailVal);
		$(".editSectOneCompEmail").attr("id" , "editSectOneCompEmail"+sectionOneCompanyDetailVal);
		$(".editSectOneCompTeleNumber").attr("id" , "editSectOneCompTeleNumber"+sectionOneCompanyDetailVal);
		
		companyNameTwo = $(".companyNameTwo"+sectionOneCompanyDetailVal+":first").text().trim();
		companyAddressTwo = $(".companyAddressTwo"+sectionOneCompanyDetailVal+":first").text().trim();
		sectionOneCompName = $(".sectionOneCompName"+sectionOneCompanyDetailVal+":first").text().trim();
		sectionOneCompJobTitle = $(".sectionOneCompJobTitle"+sectionOneCompanyDetailVal+":first").text().trim();
		sectionOneCompEmailAddr = $(".sectionOneCompEmailAddr"+sectionOneCompanyDetailVal+":first").text().trim();
		sectionOneCompTelNum = $(".sectionOneCompTelNum"+sectionOneCompanyDetailVal+":first").text().trim();
		sectOneCompContactName = $(".sectOneCompContactName"+sectionOneCompanyDetailVal+":first").text().trim();
		sectOneCompJobTitle = $(".sectOneCompJobTitle"+sectionOneCompanyDetailVal+":first").text().trim();
		sectOneCompEmail = $(".sectOneCompEmail"+sectionOneCompanyDetailVal+":first").text().trim();
		sectOneCompTeleNumber = $(".sectOneCompTeleNumber"+sectionOneCompanyDetailVal+":first").text().trim();
		$("#editCompanyNameTwo"+sectionOneCompanyDetailVal).val(companyNameTwo);
		$("#editCompanyAddressTwo"+sectionOneCompanyDetailVal).val(companyAddressTwo);
		$("#editSectionOneCompName"+sectionOneCompanyDetailVal).val(sectionOneCompName);
		$("#editSectionOneCompJobTitle"+sectionOneCompanyDetailVal).val(sectionOneCompJobTitle);
		$("#editSectionOneCompEmailAddr"+sectionOneCompanyDetailVal).val(sectionOneCompEmailAddr);
		$("#editSectionOneCompTelNum"+sectionOneCompanyDetailVal).val(sectionOneCompTelNum);
		$("#editSectOneCompContactName"+sectionOneCompanyDetailVal).val(sectOneCompContactName);
		$("#editSectOneCompJobTitle"+sectionOneCompanyDetailVal).val(sectOneCompJobTitle);
		$("#editSectOneCompEmail"+sectionOneCompanyDetailVal).val(sectOneCompEmail);
		$("#editSectOneCompTeleNumber"+sectionOneCompanyDetailVal).val(sectOneCompTeleNumber);
		$(".saveSectionOneCompanyPopupDataBtn").attr("onclick" , "sectionOneCompanyEditData("+sectionOneCompanyDetailVal+")");
	}
 	function sectionOneCompanyEditData(sectionOneCompanyDetailVal){
 		comapnyDetailTwoData(sectionOneCompanyDetailVal,'');
		$(".companyNameTwo" + sectionOneCompanyDetailVal).html($("#editCompanyNameTwo"+sectionOneCompanyDetailVal).val());
		$(".companyAddressTwo" + sectionOneCompanyDetailVal).html($("#editCompanyAddressTwo"+sectionOneCompanyDetailVal).val());
		$(".sectionOneCompName" + sectionOneCompanyDetailVal).html($("#editSectionOneCompName"+sectionOneCompanyDetailVal).val());
		$(".sectionOneCompJobTitle" + sectionOneCompanyDetailVal).html($("#editSectionOneCompJobTitle"+sectionOneCompanyDetailVal).val());
		$(".sectionOneCompEmailAddr" + sectionOneCompanyDetailVal).html($("#editSectionOneCompEmailAddr"+sectionOneCompanyDetailVal).val());
		$(".sectionOneCompTelNum" + sectionOneCompanyDetailVal).html($("#editSectionOneCompTelNum"+sectionOneCompanyDetailVal).val());
		$(".sectOneCompContactName" + sectionOneCompanyDetailVal).html($("#editSectOneCompContactName"+sectionOneCompanyDetailVal).val());
		$(".sectOneCompJobTitle" + sectionOneCompanyDetailVal).html($("#editSectOneCompJobTitle"+sectionOneCompanyDetailVal).val());
		$(".sectOneCompEmail" + sectionOneCompanyDetailVal).html($("#editSectOneCompEmail"+sectionOneCompanyDetailVal).val());
		$(".sectOneCompTeleNumber" + sectionOneCompanyDetailVal).html($("#editSectOneCompTeleNumber"+sectionOneCompanyDetailVal).val());
		$(".editCompanyNameTwo").val("");
		$(".editCompanyAddressTwo").val("");
		$(".editSectionOneCompName").val("");
		$(".editSectionOneCompJobTitle").val("");
		$(".editSectionOneCompEmailAddr").val("");
		$(".editSectionOneCompTelNum").val("");
		$(".editSectOneCompContactName").val("");
		$(".editSectOneCompJobTitle").val("");
		$(".editSectOneCompEmail").val("");
		$(".editSectOneCompTeleNumber").val("");	
	}
 	function sectionOneCompanyDetailDeleteData(sectionOneCompanyDetailValData) {
 		comapnyDetailTwoData(sectionOneCompanyDetailValData,'deleteApplicant');
		  var sectionOneCompanyCountCounter = $("#sectionOneCompanyDetailVal").val();
		  $("#sectionOneCompanyDetailVal").val(sectionOneCompanyCountCounter - 1);
		  var delRowElement = $(".section-one-company-detail-row" + sectionOneCompanyDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(sectionOneCompanyDetailValData) + 1;
		  for (var i = j; i <= sectionOneCompanyCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".section-one-company-detail-row" + i);
		    rowElement.attr("class", "section-one-company-detail-row" + prevCounter);
		    rowElement.find("td.companyNameTwo"+i).removeClass("companyNameTwo"+i).addClass("companyNameTwo"+prevCounter);
		    rowElement.find("td.companyAddressTwo"+i).removeClass("companyAddressTwo"+i).addClass("companyAddressTwo"+prevCounter);
		    rowElement.find("td.sectionOneCompName"+i).removeClass("sectionOneCompName"+i).addClass("sectionOneCompName"+prevCounter);
		    rowElement.find("td.sectionOneCompJobTitle"+i).removeClass("sectionOneCompJobTitle"+i).addClass("sectionOneCompJobTitle"+prevCounter);
		    rowElement.find("td.sectionOneCompEmailAddr"+i).removeClass("sectionOneCompEmailAddr"+i).addClass("sectionOneCompEmailAddr"+prevCounter);
		    rowElement.find("td.sectionOneCompTelNum"+i).removeClass("sectionOneCompTelNum"+i).addClass("sectionOneCompTelNum"+prevCounter);
		    rowElement.find("td.sectOneCompContactName"+i).removeClass("sectOneCompContactName"+i).addClass("sectOneCompContactName"+prevCounter);
		    rowElement.find("td.sectOneCompJobTitle"+i).removeClass("sectOneCompJobTitle"+i).addClass("sectOneCompJobTitle"+prevCounter);
		    rowElement.find("td.sectOneCompEmail"+i).removeClass("sectOneCompEmail"+i).addClass("sectOneCompEmail"+prevCounter);
		    rowElement.find("td.sectOneCompTeleNumber"+i).removeClass("sectOneCompTeleNumber"+i).addClass("sectOneCompTeleNumber"+prevCounter);
		    rowElement.find("#sectionOneCompanyDetailDeleteDataTab").attr('onclick', 'sectionOneCompanyDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#sectionOneCompanyDetailEditTab").attr('onclick', 'sectionOneCompanyEditTab(' +prevCounter+ ')');
		  }
	}
 	/* Product Services Detail */
 	function addProductServicesDetail(){
 		productServicesDetailVal = $("#productServicesDetailVal").val();
 		productType = $("#productType").val();
 		productList = $("#productList").val();
 		productLines = $("#productLines").val();

 		 if(productType != "" || productList !="" || productLines != ""){
 			$(".addProductServicesDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addProductServicesDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>productServicesDetailVal" : productServicesDetailVal,
 				},
 				async:false,
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addProductServicesDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".productType" + productServicesDetailVal).append(productType);
 					$(".productList" + productServicesDetailVal).append(productList);
 					$(".productLines" + productServicesDetailVal).append(productLines);
 					/* VALUE INCREAMENT */
 					addProductAndServicesData('');
 					productServicesDetailVal++;
 					$("#productServicesDetailVal").val(productServicesDetailVal);
 					/* RESET FORM FIELDS */
 					$("#productType").val("");
 					$("#productList").val("");
 					$("#productLines").val("");
 				}
 			});
 		}else{
 			$("#productType").focus();
 		}
 	}
 	function productServicesEditTab(productServicesDetailVal){
		$(".editProductServicesEditTabPopup").modal("show");
		$(".editProductType").attr("id" , "editProductType"+productServicesDetailVal);
		$(".editProductList").attr("id" , "editProductList"+productServicesDetailVal);
		$(".editProductLines").attr("id" , "editProductLines"+productServicesDetailVal);
		productType = $(".productType"+productServicesDetailVal+":first").text().trim();
		productList = $(".productList"+productServicesDetailVal+":first").text().trim();
		productLines = $(".productLines"+productServicesDetailVal+":first").text().trim();
		$("#editProductType"+productServicesDetailVal).val(productType);
		$("#editProductList"+productServicesDetailVal).val(productList);
		$("#editProductLines"+productServicesDetailVal).val(productLines);
		$(".saveEditProductServicesPopupDataBtn").attr("onclick" , "productServicesEditData("+productServicesDetailVal+")");
	}
 	function productServicesEditData(productServicesDetailVal){
 		addProductAndServicesData(productServicesDetailVal);
		$(".productType" + productServicesDetailVal).html($("#editProductType"+productServicesDetailVal).val());
		$(".productList" + productServicesDetailVal).html($("#editProductList"+productServicesDetailVal).val());
		$(".productLines" + productServicesDetailVal).html($("#editProductLines"+productServicesDetailVal).val());
		$(".editProductType").val("");
		$(".editProductList").val("");
		$(".editProductLines").val("");
	}
 	function productServicesDetailDeleteData(productServicesDetailValData) {
 	    deleteProductINfo(productServicesDetailValData);
		  var productServicesCountCounter = $("#productServicesDetailVal").val();
		  $("#productServicesDetailVal").val(productServicesCountCounter - 1);
		  var delRowElement = $(".product-services-detail-row" + productServicesDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(productServicesDetailValData) + 1;
		  for (var i = j; i <= productServicesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".product-services-detail-row" + i);
		    rowElement.attr("class", "product-services-detail-row" + prevCounter);
		    rowElement.find("td.productType"+i).removeClass("productType"+i).addClass("productType"+prevCounter);
		    rowElement.find("td.productList"+i).removeClass("productList"+i).addClass("productList"+prevCounter);
		    rowElement.find("td.productLines"+i).removeClass("productLines"+i).addClass("productLines"+prevCounter);
		    rowElement.find("#productServicesDetailDeleteDataTab").attr('onclick', 'productServicesDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#productServicesDetailEditTab").attr('onclick', 'productServicesEditTab(' +prevCounter+ ')');
		  }
	}
 	/*  Number of Employees */
 	function addEmployeesNumberDetail(){
 		employeesNumberDetailVal = $("#employeesNumberDetailVal").val();
 		headOffice = $("#headOffice").val();
 		administrationOffice = $("#administrationOffice").val();
 		productionProcessing = $("#productionProcessing").val();
 		maintenanceService = $("#maintenanceService").val();
 		logistics = $("#logistics").val();
 		total = $("#total").val();
 		seasonal = $("#seasonal").val();
 		temporary = $("#temporary").val();
 		subcontracted = $("#subcontracted").val();
 		 if(headOffice != "" || administrationOffice !=""|| productionProcessing !=""|| maintenanceService !=""|| logistics !=""|| total !=""|| seasonal !=""|| temporary !=""|| subcontracted !=""){
 			$(".addEmployeesNumberDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addEmployeesNumberDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>employeesNumberDetailVal" : employeesNumberDetailVal,
 				},
 				async:false,
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addEmployeesNumberDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".headOffice" + employeesNumberDetailVal).append(headOffice);
 					$(".administrationOffice" + employeesNumberDetailVal).append(administrationOffice);
 					$(".productionProcessing" + employeesNumberDetailVal).append(productionProcessing);
 					$(".maintenanceService" + employeesNumberDetailVal).append(maintenanceService);
 					$(".logistics" + employeesNumberDetailVal).append(logistics);
 					$(".total" + employeesNumberDetailVal).append(total);
 					$(".seasonal" + employeesNumberDetailVal).append(seasonal);
 					$(".temporary" + employeesNumberDetailVal).append(temporary);
 					$(".subcontracted" + employeesNumberDetailVal).append(subcontracted);
 					/* VALUE INCREAMENT */
 					addNumOfEmployeesData('');
 					employeesNumberDetailVal++;
 					$("#employeesNumberDetailVal").val(employeesNumberDetailVal);
 					/* RESET FORM FIELDS */
 					$("#headOffice").val("");
 					$("#administrationOffice").val("");
 					$("#productionProcessing").val("");
 					$("#maintenanceService").val("");
 					$("#logistics").val("");
 					$("#total").val("");
 					$("#seasonal").val("");
 					$("#temporary").val("");
 					$("#subcontracted").val("");
 				}
 			});
 		}else{
 			$("#headOffice").focus();
 		}
 	}
 	function employeesNumberEditTab(employeesNumberDetailVal){
		$(".editEmployeesNumberEditTabPopup").modal("show");
		$(".editHeadOffice").attr("id" , "editHeadOffice"+employeesNumberDetailVal);
		$(".editAdministrationOffice").attr("id" , "editAdministrationOffice"+employeesNumberDetailVal);
		$(".editProductionProcessing").attr("id" , "editProductionProcessing"+employeesNumberDetailVal);
		$(".editMaintenanceService").attr("id" , "editMaintenanceService"+employeesNumberDetailVal);
		$(".editLogistics").attr("id" , "editLogistics"+employeesNumberDetailVal);
		$(".editTotal").attr("id" , "editTotal"+employeesNumberDetailVal);
		$(".editSeasonal").attr("id" , "editSeasonal"+employeesNumberDetailVal);
		$(".editTemporary").attr("id" , "editTemporary"+employeesNumberDetailVal);
		$(".editSubcontracted").attr("id" , "editSubcontracted"+employeesNumberDetailVal);
		headOffice = $(".headOffice"+employeesNumberDetailVal+":first").text().trim();
		administrationOffice = $(".administrationOffice"+employeesNumberDetailVal+":first").text().trim();
		productionProcessing = $(".productionProcessing"+employeesNumberDetailVal+":first").text().trim();
		maintenanceService = $(".maintenanceService"+employeesNumberDetailVal+":first").text().trim();
		logistics = $(".logistics"+employeesNumberDetailVal+":first").text().trim();
		total = $(".total"+employeesNumberDetailVal+":first").text().trim();
		seasonal = $(".seasonal"+employeesNumberDetailVal+":first").text().trim();
		temporary = $(".temporary"+employeesNumberDetailVal+":first").text().trim();
		subcontracted = $(".subcontracted"+employeesNumberDetailVal+":first").text().trim();
		$("#editHeadOffice"+employeesNumberDetailVal).val(headOffice);
		$("#editAdministrationOffice"+employeesNumberDetailVal).val(administrationOffice);
		$("#editProductionProcessing"+employeesNumberDetailVal).val(productionProcessing);
		$("#editMaintenanceService"+employeesNumberDetailVal).val(maintenanceService);
		$("#editLogistics"+employeesNumberDetailVal).val(logistics);
		$("#editTotal"+employeesNumberDetailVal).val(total);
		$("#editSeasonal"+employeesNumberDetailVal).val(seasonal);
		$("#editTemporary"+employeesNumberDetailVal).val(temporary);
		$("#editSubcontracted"+employeesNumberDetailVal).val(subcontracted);
		$(".saveEmployeesNumberPopupDataBtn").attr("onclick" , "employeesNumberEditData("+employeesNumberDetailVal+")");
	}
 	function employeesNumberEditData(employeesNumberDetailVal){
 		addNumOfEmployeesData(employeesNumberDetailVal);
		$(".headOffice" + employeesNumberDetailVal).html($("#editHeadOffice"+employeesNumberDetailVal).val());
		$(".administrationOffice" + employeesNumberDetailVal).html($("#editAdministrationOffice"+employeesNumberDetailVal).val());
		$(".productionProcessing" + employeesNumberDetailVal).html($("#editProductionProcessing"+employeesNumberDetailVal).val());
		$(".maintenanceService" + employeesNumberDetailVal).html($("#editMaintenanceService"+employeesNumberDetailVal).val());
		$(".logistics" + employeesNumberDetailVal).html($("#editLogistics"+employeesNumberDetailVal).val());
		$(".total" + employeesNumberDetailVal).html($("#editTotal"+employeesNumberDetailVal).val());
		$(".seasonal" + employeesNumberDetailVal).html($("#seasonal"+employeesNumberDetailVal).val());
		$(".temporary" + employeesNumberDetailVal).html($("#editTemporary"+employeesNumberDetailVal).val());
		$(".subcontracted" + employeesNumberDetailVal).html($("#editSubcontracted"+employeesNumberDetailVal).val());
		$(".editHeadOffice").val("");
		$(".editAdministrationOffice").val("");
		$(".editProductionProcessing").val("");
		$(".editMaintenanceService").val("");
		$(".editLogistics").val("");
		$(".editTotal").val("");
		$(".editSeasonal").val("");
		$(".editTemporary").val("");
		$(".editSubcontracted").val("");
	}
 	function employeesNumberDetailDeleteData(employeesNumberDetailValData) {
 		deleteNumberOfEmployee(employeesNumberDetailValData);
		  var employeesNumberCountCounter = $("#employeesNumberDetailVal").val();
		  $("#employeesNumberDetailVal").val(employeesNumberCountCounter - 1);
		  var delRowElement = $(".employees-number-detail-row" + employeesNumberDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(employeesNumberDetailValData) + 1;
		  for (var i = j; i <= employeesNumberCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".employees-number-detail-row" + i);
		    rowElement.attr("class", "employees-number-detail-row" + prevCounter);
		    rowElement.find("td.headOffice"+i).removeClass("headOffice"+i).addClass("headOffice"+prevCounter);
		    rowElement.find("td.administrationOffice"+i).removeClass("administrationOffice"+i).addClass("administrationOffice"+prevCounter);
		    rowElement.find("td.productionProcessing"+i).removeClass("productionProcessing"+i).addClass("productionProcessing"+prevCounter);
		    rowElement.find("td.maintenanceService"+i).removeClass("maintenanceService"+i).addClass("maintenanceService"+prevCounter);
		    rowElement.find("td.logistics"+i).removeClass("logistics"+i).addClass("logistics"+prevCounter);
		    rowElement.find("td.total"+i).removeClass("total"+i).addClass("total"+prevCounter);
		    rowElement.find("td.seasonal"+i).removeClass("seasonal"+i).addClass("seasonal"+prevCounter);
		    rowElement.find("td.temporary"+i).removeClass("temporary"+i).addClass("temporary"+prevCounter);
		    rowElement.find("td.subcontracted"+i).removeClass("subcontracted"+i).addClass("subcontracted"+prevCounter);
		    rowElement.find("#employeesNumberDetailDeleteDataTab").attr('onclick', 'employeesNumberDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#employeesNumberDetailEditTab").attr('onclick', 'employeesNumberEditTab(' +prevCounter+ ')');
		  }
	}
	/* Work Pattern Detail */
 	function addWorkPatternDetail(){
 		workPatternDetailVal = $("#workPatternDetailVal").val();
 		employeesShift = $("#employeesShift").val();
 		 if(employeesShift != ""){
 			$(".addWorkPatternDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addWorkPatternDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>workPatternDetailVal" : workPatternDetailVal,
 				},
 				async:false,
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addWorkPatternDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".employeesShift" + workPatternDetailVal).append(employeesShift);
 					/* VALUE INCREAMENT */
 					addWorkPatternEmpShifts('');
 					workPatternDetailVal++;
 					$("#workPatternDetailVal").val(workPatternDetailVal);
 					/* RESET FORM FIELDS */
 					$("#employeesShift").val("");
 				}
 			});
 		}else{
 			$("#employeesShift").focus();
 		}
 	}
 	function workPatternEditTab(workPatternDetailVal){
		$(".editWorkPatternEditTabPopup").modal("show");
		$(".editEmployeesShift").attr("id" , "editEmployeesShift"+workPatternDetailVal);
		employeesShift = $(".employeesShift"+workPatternDetailVal+":first").text().trim();
		$("#editEmployeesShift"+workPatternDetailVal).val(employeesShift);
		$(".saveEditWorkPatternPopupDataBtn").attr("onclick" , "workPatternEditData("+workPatternDetailVal+")");
	}
 	function workPatternEditData(workPatternDetailVal){
 		addWorkPatternEmpShifts(workPatternDetailVal);
		$(".employeesShift" + workPatternDetailVal).html($("#editEmployeesShift"+workPatternDetailVal).val());
		$(".editEmployeesShift").val("");
		
	}
 	function workPatternDetailDeleteData(workPatternDetailValData) {
 		deleteWorkPattern(workPatternDetailValData);
		  var workPatternCountCounter = $("#workPatternDetailVal").val();
		  $("#workPatternDetailVal").val(workPatternCountCounter - 1);
		  var delRowElement = $(".work-pattern-detail-row" + workPatternDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(workPatternDetailValData) + 1;
		  for (var i = j; i <= workPatternCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".work-pattern-detail-row" + i);
		    rowElement.attr("class", "work-pattern-detail-row" + prevCounter);
		    rowElement.find("td.employeesShift"+i).removeClass("employeesShift"+i).addClass("employeesShift"+prevCounter);
		    rowElement.find("#workPatternDetailDeleteDataTab").attr('onclick', 'workPatternDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#workPatternDetailEditTab").attr('onclick', 'workPatternEditTab(' +prevCounter+ ')');
		  }
	}
 	function addHaccpNumberDetail(){
 		haccpNumberDetailVal = $("#haccpNumberDetailVal").val();
 		haccpNumber = $("#haccpNumber").val();
 		haccpType = $("#haccpType").val();
 		
 		haccpStudyNumber=$("#haccpStudyNumber").parent().parent().parent().find(".attach-detailed-overview").html();
 		 if(haccpNumber != "" || haccpType != ""){
 			$(".addHaccpNumberDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addHaccpNumberDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>haccpNumberDetailVal" : haccpNumberDetailVal,
 				},
 				async:false, 
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addHaccpNumberDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".haccpNumber" + haccpNumberDetailVal).append(haccpNumber);
 					$(".haccpType" + haccpNumberDetailVal).append(haccpType);
 					$(".haccpStudyNumber" + haccpNumberDetailVal).append(haccpStudyNumber);
 					/* VALUE INCREAMENT */
 					addHaccpNumberStudyDetail('');
 					haccpNumberDetailVal++;
 					$("#haccpNumberDetailVal").val(haccpNumberDetailVal);
 					/* RESET FORM FIELDS */
 					$("#haccpNumber").val("");
 					$("#haccpType").val("");
 					$("#haccpStudyNumber").parent().parent().parent().find(".attach-detailed-overview").html("");
 				}
 			});
 		}else{
 			$("#haccpNumber").focus();
 		}
 	}
 	function haccpNumberEditTab(haccpNumberDetailVal){
		$(".editHaccpNumberEditTabPopup").modal("show");
		$(".editHaccpNumber").attr("id" , "editHaccpNumber"+haccpNumberDetailVal);
		$(".editHaccpType").attr("id" , "editHaccpType"+haccpNumberDetailVal);
		$(".editHaccpStudyUpload").attr("id" , "editHaccpStudyUpload"+haccpNumberDetailVal);
		haccpNumber = $(".haccpNumber"+haccpNumberDetailVal+":first").text().trim();
		haccpType = $(".haccpType"+haccpNumberDetailVal+":first").text().trim();
		haccpStudyNumber = $(".haccpStudyNumber"+haccpNumberDetailVal+":first").text().trim();
		$("#editHaccpNumber"+haccpNumberDetailVal).val(haccpNumber); 
		$("#editHaccpType"+haccpNumberDetailVal).val(haccpType);
		$("#editHaccpStudyUpload"+haccpNumberDetailVal).html(haccpStudyNumber);
		$(".saveEditHaccpNumberPopupDataBtn").attr("onclick" , "haccpNumberEditData("+haccpNumberDetailVal+")");
	}
 	function haccpNumberEditData(haccpNumberDetailVal){
 		addHaccpNumberStudyDetail(haccpNumberDetailVal)
		$(".haccpNumber" + haccpNumberDetailVal).html($("#editHaccpNumber"+haccpNumberDetailVal).val());
 		$(".haccpType" + haccpNumberDetailVal).html($("#editHaccpType"+haccpNumberDetailVal).val());
 		$(".haccpStudyNumber" + haccpNumberDetailVal).html($("#editHaccpStudyUpload"+haccpNumberDetailVal).html());
		$(".editHaccpNumber").val("");
		$(".editHaccpType").val("");
		$(".editHaccpStudyUpload").html("");
		 
	}
 	function haccpNumberDetailDeleteData(haccpNumberDetailValData) {
          deleteHaccpNumber(haccpNumberDetailValData);
		  var haccpNumberCountCounter = $("#haccpNumberDetailVal").val();
		  $("#haccpNumberDetailVal").val(haccpNumberCountCounter - 1);
		  var delRowElement = $(".haccp-number-detail-row" + haccpNumberDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(haccpNumberDetailValData) + 1;
		  for (var i = j; i <= haccpNumberCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".haccp-number-detail-row" + i);
		    rowElement.attr("class", "haccp-number-detail-row" + prevCounter);
		    rowElement.find("td.haccpNumber"+i).removeClass("haccpNumber"+i).addClass("haccpNumber"+prevCounter);
		    rowElement.find("td.haccpType"+i).removeClass("haccpType"+i).addClass("haccpType"+prevCounter);
		    rowElement.find("td a.haccpStudyNumber"+i).removeClass("haccpStudyNumber"+i).addClass("haccpStudyNumber"+prevCounter);
		    rowElement.find("#haccpNumberDetailDeleteDataTab").attr('onclick', 'haccpNumberDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#haccpNumberDetailEditTab").attr('onclick', 'haccpNumberEditTab(' +prevCounter+ ')');
		  }
	}
 	/* Hazard Analysis Detail */
 	function addHazardAnalysisDetail(){
 		hazardAnalysisDetailVal = $("#hazardAnalysisDetailVal").val();
 		hazardAnalysis = $("#hazardAnalysis").val();
 		hazardControlPoint=$("#hazardControlPoint").parent().parent().parent().find(".attach-detailed-overview").html();
 		 if(hazardAnalysis != ""){
 			$(".addHazardAnalysisDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addHazardAnalysisDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>hazardAnalysisDetailVal" : hazardAnalysisDetailVal,
 				},
 				async:false,
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addHazardAnalysisDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".hazardAnalysis" + hazardAnalysisDetailVal).append(hazardAnalysis);
 					$(".hazardControlPoint" + hazardAnalysisDetailVal).append(hazardControlPoint);
 					/* VALUE INCREAMENT */
 					addHazardAnalysisCritical('');
 					hazardAnalysisDetailVal++;
 					$("#hazardAnalysisDetailVal").val(hazardAnalysisDetailVal);
 					/* RESET FORM FIELDS */
 					$("#hazardAnalysis").val("");
 					$("#hazardControlPoint").parent().parent().parent().find(".attach-detailed-overview").html("");
 				}
 			});
 		}else{
 			$("#hazardAnalysis").focus();
 		}
 	}
 	function hazardAnalysisEditTab(hazardAnalysisDetailVal){
		$(".editHazardAnalysisEditTabPopup").modal("show");
		
		$(".editHazardAnalysis").attr("id" , "editHazardAnalysis"+hazardAnalysisDetailVal);
		$(".editHazardFileUpload").attr("id" , "editHazardFileUpload"+hazardAnalysisDetailVal);
		
		hazardAnalysis = $(".hazardAnalysis"+hazardAnalysisDetailVal+":first").text().trim();
		editHazardControlPoint = $(".hazardControlPoint"+hazardAnalysisDetailVal+":first").text().trim();
		
		$("#editHazardAnalysis"+hazardAnalysisDetailVal).val(hazardAnalysis);
		$("#editHazardFileUpload"+hazardAnalysisDetailVal).html(editHazardControlPoint);
		
		$(".saveEditHazardAnalysisPopupDataBtn").attr("onclick" , "hazardAnalysisEditData("+hazardAnalysisDetailVal+")");
	}
 	function hazardAnalysisEditData(hazardAnalysisDetailVal){
 		addHazardAnalysisCritical(hazardAnalysisDetailVal);
		$(".hazardAnalysis" + hazardAnalysisDetailVal).html($("#editHazardAnalysis"+hazardAnalysisDetailVal).val());
		$(".hazardControlPoint" + hazardAnalysisDetailVal).html($("#editHazardFileUpload"+hazardAnalysisDetailVal).html());
				
		$(".editHazardAnalysis").val("");
		$(".editHazardFileUpload").html("");
	}
 	function hazardAnalysisDetailDeleteData(hazardAnalysisDetailValData) {
 		addHazardAnalysisCritical(hazardAnalysisDetailValData,'deleteApplicant');
		  var hazardAnalysisCountCounter = $("#hazardAnalysisDetailVal").val();
		  $("#hazardAnalysisDetailVal").val(hazardAnalysisCountCounter - 1);
		  var delRowElement = $(".hazard-analysis-detail-row" + hazardAnalysisDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(hazardAnalysisDetailValData) + 1;
		  for (var i = j; i <= hazardAnalysisCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".hazard-analysis-detail-row" + i);
		    rowElement.attr("class", "hazard-analysis-detail-row" + prevCounter);
		    rowElement.find("td.hazardAnalysis"+i).removeClass("hazardAnalysis"+i).addClass("hazardAnalysis"+prevCounter);
		    rowElement.find("td a.hazardControlPoint"+i).removeClass("hazardControlPoint"+i).addClass("hazardControlPoint"+prevCounter);
		    rowElement.find("#hazardAnalysisDetailDeleteDataTab").attr('onclick', 'hazardAnalysisDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#hazardAnalysisDetailEditTab").attr('onclick', 'hazardAnalysisEditTab(' +prevCounter+ ')');
		  }	}
 	function addLicenceListDetail(){
 		licenceListDetailVal = $("#licenceListDetailVal").val();
 		consentsList = $("#consentsList").val();
 		consentsListUpload=$("#consentsListUpload").parent().parent().parent().find(".attach-detailed-overview").html();
 		 if(consentsList != ""){
 			$(".addLicenceListDetailTableBox").removeClass("hide");
 			$.ajax({
 				type : "POST",
 				url : "${addLicenceListDetailInfoUrl}",
 				data : {
 					"<portlet:namespace/>licenceListDetailVal" : licenceListDetailVal,
 				},
 				async:false,
 				success : function(data) {
 					/* APPEND ROW JSP INTO TABLE */
 					$(".addLicenceListDetailTable").each(function(index) {
 						if (index === 0) {
 							$(this).append(data);
 						} else {
 							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
 						}
 					});
 					/* APPEND DATA INTO TABLE */					
 					$(".consentsList" + licenceListDetailVal).append(consentsList);
 					$(".consentsListUpload" + licenceListDetailVal).append(consentsListUpload);
 					/* VALUE INCREAMENT */
 					addConsentLicencePermitData('');
 					licenceListDetailVal++;
 					$("#licenceListDetailVal").val(licenceListDetailVal);
 					/* RESET FORM FIELDS */
 					$("#consentsList").val("");
 					$("#consentsListUpload").parent().parent().parent().find(".attach-detailed-overview").html("");
 				}
 			});
 		}else{
 			$("#consentsList").focus();
 		}}
 	function licenceListEditTab(licenceListDetailVal){
		$(".editLicenceListEditTabPopup").modal("show");
		$(".editConsentsList").attr("id" , "editConsentsList"+licenceListDetailVal);
		$(".editConsentsFileUpload").attr("id" , "editConsentsFileUpload"+licenceListDetailVal);
		consentsList = $(".consentsList"+licenceListDetailVal+":first").text().trim();
		consentsListUpload = $(".consentsListUpload"+licenceListDetailVal+":first").text().trim();
		$("#editConsentsList"+licenceListDetailVal).val(consentsList);
		$("#editConsentsFileUpload"+licenceListDetailVal).html(consentsListUpload);
		$(".saveEditLicenceListPopupDataBtn").attr("onclick" , "licenceListEditDataTab("+licenceListDetailVal+")");
	}
 	function licenceListEditDataTab(licenceListDetailVal){
 		addConsentLicencePermitData(licenceListDetailVal);
		$(".consentsList" + licenceListDetailVal).html($("#editConsentsList"+licenceListDetailVal).val());
		$(".consentsListUpload" + licenceListDetailVal).html($("#editConsentsFileUpload"+licenceListDetailVal).html());
		$(".editConsentsList").val("");
		$(".editConsentsFileUpload").html("");
	}
 	function licenceListDetailDeleteData(licenceListDetailValData) {
 		addConsentLicencePermitData(licenceListDetailValData,'deleteApplicant');
		  var licenceListCountCounter = $("#licenceListDetailVal").val();
		  $("#licenceListDetailVal").val(licenceListCountCounter - 1);
		  var delRowElement = $(".licence-list-detail-row" + licenceListDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(licenceListDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= licenceListCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".licence-list-detail-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "licence-list-detail-row" + prevCounter);
		    rowElement.find("td.consentsList"+i).removeClass("consentsList"+i).addClass("consentsList"+prevCounter);
		    rowElement.find("td a.consentsListUpload"+i).removeClass("consentsListUpload"+i).addClass("consentsListUpload"+prevCounter);
		    rowElement.find("#licenceListDetailDeleteDataTab").attr('onclick', 'licenceListDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#licenceListDetailEditTab").attr('onclick', 'licenceListEditTab(' +prevCounter+ ')');
		  }
	}
	//fetching
	function previewApplicantDetailsInfo() {
		stage1 = $("#stage1").val();
		stage2 = $("#stage2").val();
		surveillanceAudit = $("#surveillanceAudit").val();
		recertificationAudit = $("#recertificationAudit").val();
		preassessmentAudit = $("#preassessmentAudit").val();
		otherServices = $("#otherServices").val();
		$("#stage1Preview").html(stage1);
		$("#stage2Preview").html(stage2);
		$("#survAuditPreview").html(surveillanceAudit);
		$("#recerAuditPreview").html(recertificationAudit);
		$("#preAssessAudiPreview").html(preassessmentAudit);
		$("#otherServicePreview").html(otherServices);
	}
	function previewOrganizationDetailsInfo() {
		name = $("#nameOfOrganization").val();
		address = $("#address").val();
		telephoneNumber = $("#telephoneNumber").val();
		faxNumber = $("#faxNumber").val();
		emailAddress = $("#emailAddress").val();
		headOfOrganization = $("#headOfOrganization").val();
		positionFirst = $("#positionFirst").val();
		contactPersonName = $("#contactPersonName").val();
		contactPersonEmail = $("#contactPersonEmail").val();
		positionSecond = $("#positionSecond").val();
		managementSystem = $("#managementSystem").val();
		cetification=$("input[name='orgDeterminedTheScope']:checked").val();
		scope = $("#scope").val();
		$("#nameOfOrganizationPreview").html(name);
		$("#addressPreview").html(address);
		$("#telephoneNumberPreview").html(telephoneNumber);
		$("#faxNumberPreview").html(faxNumber);
		$("#emailAddressPreview").html(emailAddress);
		$("#headOfOrganizationPreview").html(headOfOrganization);
		$("#positionPreview").html(positionFirst);
		$("#emailAddressPreview").html(emailAddress);
		$("#contactPersonNamePreview").html(contactPersonName);
		$("#contactPersonEmailPreview").html(contactPersonEmail);
		$("#positionSecondPreview").html(positionSecond);
		$("#managementSystemPreview").html(managementSystem);
		$("#cetificationPreview").html(cetification);
		$("#scopePreview").html(scope);
	}
	function previewCompanyDetailsInfo() {
		stage1 = $("#compStage1").val();
		stage2 = $("#compStage2").val();
		surveillanceAudit = $("#compSurveillanceAudit").val();
		recertificationAudit = $("#compRecertificationAudit").val();
		preassessmentAudit = $("#compPreAssessmentAudit").val();
		otherServices = $("#compOtherServices").val();
		$("#compStage1Preview").html(stage1);
		$("#compStage2Preview").html(stage2);
		$("#compSurveillanceAuditpreview").html(surveillanceAudit);
		$("#compRecertificationAuditPreview").html(recertificationAudit);
		$("#compPreAssessmentAuditPreview").html(preassessmentAudit);
		$("#compOtherServicesPreview").html(otherServices);
	}
	function previewProductAndServices() {
		productTypes = $("#productTypes").val();
		productList = $("#productList").val();
		productLines = $("#productLines").val();
		certified = $("#certified").val();
		$("#productTypesPreview").html(productTypes);
		$("#productListPreview").html(productList);
		$("#productLinesPreview").html(productLines);
		$("#cetifiedPreview").html(certified);
	}
	function previewSectionFour() {
		consulting = $("#consulting").val();
		telephone = $("#sfConsultingFirmTelephone").val();
		email = $("#sfConsultingEmail").val();
		preferredDate = $("#sfPreferredDate").val();
		stage1 = $("#sfStage1").val();
		stage2 = $("#sfStage2").val();
		surveillanceAudit = $("#sfSurveillanceAudit").val();
		recertificationAudit = $("#sfRecertificationAudit").val();
		preassessmentAudit = $("#sfPreAssessmentAudit").val();
		otherServices = $("#sfOtherServices").val();
		name = $("#sfName").val();
		position = $("#sfPosition").val();
		date = $("#sfDate").val();
		$("#consultingPreview").html(consulting);
		$("#consultingFirmTelephonePreview").html(telephone);
		$("#consultingEmailPreview").html(email);
		$("#sfPreferredDatePreview").html(preferredDate);
		$("#sfStage1Preview").html(stage1);
		$("#sfStage2Preview").html(stage2);
		$("#sfSurveillanceAuditPreview").html(surveillanceAudit);
		$("#sfRecertificationAuditPreview").html(recertificationAudit);
		$("#sfPreAssessmentAuditPreview").html(preassessmentAudit);
		$("#sfOtherServicesPreview").html(otherServices);
		$("#sfNamePreview").html(name);
		$("#sfPositionPreview").html(position);
		$("#sfDatePreview").html(date);
	}
	/* signature */
	$(document).on('change', '#sectionFourSignatureBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#sectionFourSignatureImageHolder");
	    var form1a_image_holder = $("#sectionFourSignatureImageHolderPreview");
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
    /* Toggle Checklist */
    $("input:checkbox[name=specificActivity]").on("change", function() {
        toggleChecklist();
    });
    function toggleChecklist() {
      $("input:checkbox[name=specificActivity]").each(function() {
        if ($(this).prop("checked")) {
          $(this).parent().next('.specificActivityInfo, .specificActivityInfoPreview').removeClass("hide");
        } else {
          $(this).parent().next('.specificActivityInfo').addClass("hide");
        }
      });
    }
	function organizationdetailInfo(theSaveandContinue){
		newCompanyName= $("#newCompanyName").val();
		companyEmail= $("#companyEmail").val();
	    mailingAddress = $("#newMailingAddress").val();
	    city = $("#newCity").val();
	    postalCode = $("#newPostalCode").val();
	    country = $("#newCountry").val();
	    physicalAddress = $("#physicalAddress").val();
	    physicalCity = $("#physicalCity").val();
	    physicalPostalCode = $("#physicalPostalCode").val();
	    physicalCountry = $("#physicalCountry").val();
	    companyHead = $("#companyHead").val();
	    companyTitle = $("#companyTitle").val();
	    companyContact = $("#companyContact").val();
	    companyContactTitle = $("#companyContactTitle").val();
	    companyTelephone = $("#companyTelephone").val();
	    companyFax = $("#companyFax").val();
	    companyWebsite = $("#companyWebsite").val();
	    certificationScope = $("#companyCertificationScope").val();
	    managementAccessibleToAuditDetail = $("#managementAccessibleToAuditDetail").val();
	    pleaseManageDetail = $("#pleaseManageDetail").val();
	    keyActivity = $("#keyActivity").val();
	    transferReason = $("#transferReasonTwo").val();
	    indicateStandard = $("#indicateStandard").val();
	    ceritificationBodyName = $("#ceritificationBodyName").val();
	    consultingFirm = $("#consultingFirm").val();
	    consultant = $("#consultant").val();
	    telephone = $("#telephone").val();
	    email = $("#email").val();
	    relevantRequirementList = $("#relevantRequirementList").val();
	    certificationScopeRadio = $("input[name='certificationScope']:checked").val();
	    outsourceProcess = $("input[name='outsourceProcess']:checked").val();
	    relevantRequirement = $("input[name='relevantRequirement']:checked").val();
	    managementAccessibleToAudit = $("input[name='managementAccessibleToAudit']:checked").val();
	    desiredCertification = $("input[name='desiredCertification']:checked").val();
	    surveillanceSchedule = $("input[name='surveillanceSchedule']:checked").val();
	    certifiedManagement = $("input[name='certifiedManagement']:checked").val();
	    certifiedAccreditedCertification = $("input[name='certifiedAccreditedCertification']:checked").val();
	    companyUsedConsultingService = $("input[name='companyUsedConsultingService']:checked").val();
	    ncbjApplicationId=$("#ncbjApplicationId").val();
		submitForm= true;
		if(!theSaveandContinue){
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!companyEmail){
			$("#companyEmailValidation").removeClass("hide");
			$("#companyEmailValidation").text("Please Enter Email Address");
			$("#companyEmail").focus();
			submitForm= false;
		}else if(companyEmail.match(mailformat)){ 
			$("#companyEmailValidation").addClass("hide");
		}else{
			$("#companyEmailValidation").removeClass("hide");
			$("#companyEmailValidation").text("You have Entered an In-valid email address");
			$("#companyEmail").focus();
			submitForm= false;
		}
		if(!newCompanyName){
			$("#newCompanyNameValidation").removeClass("hide");
			$("#newCompanyName").focus();
			submitForm= false;
		}else{
			$("#newCompanyNameValidation").addClass("hide");
		    }
		}	
		if(submitForm){
			 $.ajax({
				    type: "POST",
				    url: "${organizationInfoFirstFormUrl}",
				    data: {
				    	"<portlet:namespace/>newCompanyName": newCompanyName,
				        "<portlet:namespace/>companyEmail": companyEmail,
				        "<portlet:namespace/>mailingAddress": mailingAddress,
				        "<portlet:namespace/>city": city,
				        "<portlet:namespace/>postalCode": postalCode,
				        "<portlet:namespace/>country": country,
				        "<portlet:namespace/>physicalAddress": physicalAddress,
				        "<portlet:namespace/>physicalCity": physicalCity,
				        "<portlet:namespace/>physicalPostalCode": physicalPostalCode,
				        "<portlet:namespace/>physicalCountry": physicalCountry,
				        "<portlet:namespace/>companyHead": companyHead,
				        "<portlet:namespace/>companyTitle": companyTitle,
				        "<portlet:namespace/>companyContact": companyContact,
				        "<portlet:namespace/>companyContactTitle": companyContactTitle,
				        "<portlet:namespace/>companyTelephone": companyTelephone,
				        "<portlet:namespace/>companyFax": companyFax,
				        "<portlet:namespace/>companyWebsite": companyWebsite,
				        "<portlet:namespace/>certificationScope": certificationScope,
				        "<portlet:namespace/>relevantRequirementList": relevantRequirementList,
				        "<portlet:namespace/>managementAccessibleToAuditDetail": managementAccessibleToAuditDetail,
				        "<portlet:namespace/>pleaseManageDetail": pleaseManageDetail,
				        "<portlet:namespace/>keyActivity": keyActivity,
				        "<portlet:namespace/>transferReason": transferReason,
				        "<portlet:namespace/>indicateStandard": indicateStandard,
				        "<portlet:namespace/>ceritificationBodyName": ceritificationBodyName,
				        "<portlet:namespace/>consultingFirm": consultingFirm,
				        "<portlet:namespace/>consultant": consultant,
				        "<portlet:namespace/>telephone": telephone,
				        "<portlet:namespace/>email": email,
				        
				        "<portlet:namespace/>certificationScopeRadio": certificationScopeRadio,
				        "<portlet:namespace/>outsourceProcess": outsourceProcess,
				        "<portlet:namespace/>relevantRequirement": relevantRequirement,
				        "<portlet:namespace/>managementAccessibleToAudit": managementAccessibleToAudit,
				        "<portlet:namespace/>desiredCertification": desiredCertification,
				        "<portlet:namespace/>surveillanceSchedule": surveillanceSchedule,
				        "<portlet:namespace/>certifiedManagement": certifiedManagement,
				        "<portlet:namespace/>certifiedAccreditedCertification": certifiedAccreditedCertification,
				        "<portlet:namespace/>companyUsedConsultingService": companyUsedConsultingService,
				        "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				      		    },
				    success: function (data) {
				    	if(!theSaveandContinue){
							applicantInfo();
						}   },
				    error: function (data) {
				    },
				  });			}}
	function signaturedetailInfo(theSaveandContinue){
		signatureName= $("#signatureName").val();
		centralOfficeLink = $("input[name='centralOfficeLink']:checked").val();
	    commonManagementSystem = $("input[name='commonManagementSystem']:checked").val();
	    substantiallySameProcess = $("input[name='substantiallySameProcess']:checked").val();
	    siteSimilarMethod = $("input[name='siteSimilarMethod']:checked").val();
	    siteUnderAudit = $("input[name='siteUnderAudit']:checked").val();
	    siteCorrectiveRight = $("input[name='siteCorrectiveRight']:checked").val();
	    changesAuthority = $("input[name='changesAuthority']:checked").val();
	    position = $("#position").val();
	    date = $("#date").val();
		submitForm= true;
		if(!theSaveandContinue){
			if(!signatureName){
			$("#signatureNameValidation").removeClass("hide");
			$("#signatureName").focus();
			submitForm= false;
		}else{
			$("#signatureNameValidation").addClass("hide");
		    }	
		}
		if(submitForm){
			$.ajax({
			    type: "POST",
			    url: "${additionalLocationSignUrl}",
			    data: {
			    	"<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
			    	"<portlet:namespace/>signatureName": signatureName,
			        "<portlet:namespace/>centralOfficeLink": centralOfficeLink,
			        "<portlet:namespace/>commonManagementSystem": commonManagementSystem,
			        "<portlet:namespace/>substantiallySameProcess": substantiallySameProcess,
			        "<portlet:namespace/>siteSimilarMethod": siteSimilarMethod,
			        "<portlet:namespace/>siteUnderAudit": siteUnderAudit,
			        "<portlet:namespace/>siteCorrectiveRight": siteCorrectiveRight,
			        "<portlet:namespace/>changesAuthority": changesAuthority,
			        "<portlet:namespace/>position": position,
			        "<portlet:namespace/>date": date
			    },
			    success: function (data) {
			    	uploadDocuments('newSignatureBtn','Signature of Applicant','');
			    	if(!theSaveandContinue){
			    		applicantInfo();
			    	}
			    	iso9001Certification = $("#iso9001CertificationValue").val();
			    	if(iso9001Certification == "Transfer to NCBJ"){
			    		$("#ncbjFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			    	}
		    	},
			    error: function (data) {
			    },
			  });		
		}
	}	
	function addBusinessDetailInfo(counter){
		if(counter!=""){
			applicantDetailValId = $("#applicantDetailValId"+counter).val();
			applicantShifts = $("#editApplicantShifts"+counter).val();
			applicantProductTypes = $("#editApplicantProductTypes"+counter).val();
			applicantAddressOne = $("#editApplicantAddressOne"+counter).val();
			headOffices = $("#editHeadOffices"+counter).val();
			noOfFullTimeEmployees = $("#editNoOfFullTimeEmployees"+counter).val();
			noOfPartTimeEmployees = $("#editNoOfPartTimeEmployees"+counter).val();
			noOfContractors = $("#editNoOfContractors"+counter).val();
			noOfContractedWorkers = $("#editNoOfContractedWorkers"+counter).val();
		}else{
			applicantShifts = $("#applicantShifts").val();
			applicantProductTypes = $("#applicantProductTypes").val();
			applicantAddressOne = $("#applicantAddressOne").val();
			headOffices = $("#headOffices").val();
			noOfFullTimeEmployees = $("#noOfFullTimeEmployees").val();
			noOfPartTimeEmployees = $("#noOfPartTimeEmployees").val();
			noOfContractors = $("#noOfContractors").val();
			noOfContractedWorkers = $("#noOfContractedWorkers").val();
			applicantDetailValId = $("#applicantDetailValId").val();
		}
		ncbjApplicationId=$("#ncbjApplicationId").val();
		counterOfApplicantDetail = $("#applicantDetailVal").val();
		
		  $.ajax({
				type: "POST",
				url: "${businessDetailInfoUrl}", 
				data: {
					"<portlet:namespace/>applicantShifts": applicantShifts,
					"<portlet:namespace/>applicantProductTypes": applicantProductTypes,
					"<portlet:namespace/>applicantAddressOne": applicantAddressOne,
					"<portlet:namespace/>headOffices": headOffices,
					"<portlet:namespace/>noOfFullTimeEmployees": noOfFullTimeEmployees,
					"<portlet:namespace/>noOfPartTimeEmployees": noOfPartTimeEmployees,
					"<portlet:namespace/>noOfContractors": noOfContractors,
					"<portlet:namespace/>noOfContractedWorkers": noOfContractedWorkers,
					"<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
					"<portlet:namespace/>counterOfApplicantDetail": counterOfApplicantDetail,
					"<portlet:namespace/>applicantDetailValId": applicantDetailValId,
				},
				success: function (data) {
					var result=data.APP_DATA;
					$("#applicantDetailValId"+result["counter"]).val(result["ncbjBusinessDetailAddId"]);
				},
				error: function (data) {
				}
			});
 	}
	function deleteApplicantINfo(keyForDelete){
		applicantDetailValId=$("#applicantDetailValId"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${delteinformation}", 
				data: {
					"<portlet:namespace/>applicantDetailValId": applicantDetailValId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function deleteProductINfo(keyForDelete){
		productServicesDetailId=$("#productServicesDetailId"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${deleteProductINfoUrl}", 
				data: {
					"<portlet:namespace/>productServicesDetailId": productServicesDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function deleteNumberOfEmployee(keyForDelete){
		employeesNumberDetailId=$("#employeesNumberDetailId"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${deleteNumberOfEmployeeUrl}", 
				data: {
					"<portlet:namespace/>employeesNumberDetailId": employeesNumberDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function deleteWorkPattern(keyForDelete){
		workPatternDetailId=$("#workPatternDetailId"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${deleteWorkPatternUrl}", 
				data: {
					"<portlet:namespace/>workPatternDetailId": workPatternDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function deleteHaccpNumber(keyForDelete){
		haccpNumberDetailId=$("#haccpNumberDetailId"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${deleteHaccpNumberUrl}", 
				data: {
					"<portlet:namespace/>haccpNumberDetailId": haccpNumberDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function addCompanyDetailInfo(isSaveAndCont){
		companyName = $("#companyName").val();
	    companyAddress = $("#companyAddress").val();
	    headOfCompany = $("#headOfCompany").val();
	    jobTitleOne = $("#jobTitleOne").val();
	    companyEmailOne = $("#companyEmailOne").val();
	    companyNumOne = $("#companyNumOne").val();

	    contactName = $("#contactName").val();
	    jobTitleTwo = $("#jobTitleTwo").val();
	    companyEmailTwo = $("#companyEmailTwo").val();
	    companyNumTwo = $("#companyNumTwo").val();
		ncbjApplicationId=$("#ncbjApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${companyDetailInfoUrl}",
				data : {
					"<portlet:namespace/>companyName": companyName,
				    "<portlet:namespace/>companyAddress": companyAddress,
				    "<portlet:namespace/>headOfCompany": headOfCompany,
				    "<portlet:namespace/>jobTitleOne": jobTitleOne,
				    "<portlet:namespace/>companyEmailOne": companyEmailOne,
				    "<portlet:namespace/>companyNumOne": companyNumOne,
				    "<portlet:namespace/>contactName": contactName,
				    "<portlet:namespace/>jobTitleTwo": jobTitleTwo,
				    "<portlet:namespace/>companyEmailTwo": companyEmailTwo,
				    "<portlet:namespace/>companyNumTwo": companyNumTwo,
					"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				},
				success : function(data) {
					if(!isSaveAndCont){
						applicantInfo(); 
					}
				},
				error : function(data) {
				},
			});
		}
	function addPremisesAndLocationInfo(isSaveAndCont){
	 transferReasonDraft = $("#transferReasonDraft").val();
	 activityExclusion =$("input[name='activityExclusion']:checked").val();
	 transferReasonAct = $("#transferReasonAct").val();
	 productionFacilitySize = $("#producitonFacilitySize").val();
	 warehouseFacilitySize = $("#warehouseFacilitySize").val();
	 facilitiesLocation = $("#facilitiesLocation").val();
	 detailForDiffManagement = $("#detailForDiffManagement").val();
	 ncbjApplicationId=$("#ncbjApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${premisesAndLocationInfoUrl}",
				data : {
					"<portlet:namespace/>transferReasonDraft": transferReasonDraft,
					"<portlet:namespace/>activityExclusion": activityExclusion,
					"<portlet:namespace/>transferReasonAct": transferReasonAct,
					"<portlet:namespace/>productionFacilitySize": productionFacilitySize,
				    "<portlet:namespace/>warehouseFacilitySize": warehouseFacilitySize,
				    "<portlet:namespace/>facilitiesLocation": facilitiesLocation,
				    "<portlet:namespace/>detailForDiffManagement": detailForDiffManagement,
					"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				},
				success : function(data) {
					uploadDocuments('detail-operating','Draft Scope','','');
					if(!isSaveAndCont){
						applicantInfo(); 
						addSectionOneCompanyDetail();
						addProductServicesDetail();
						addEmployeesNumberDetail();
						addWorkPatternDetail();
					}
				},
				error : function(data) {
				},
			});
		}
	function addProcessDetailsInManufacturing(isSaveAndCont){
	incomingMaterials = $("#transferReasonPro").val();
	productStorage = $("#transferReasonStorage").val();
	buildingSiteAspects = $("#transferReasonInvest").val();
	wasteDischarges = $("#transferReasonWaste").val();
	transportDetails = $("#transferReasonTransport").val();
	subcontractedActivities = $("#transferReasonSub").val();
	 ncbjApplicationId=$("#ncbjApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${processDetailsInvolvedInfoUrl}",
				data : {
					"<portlet:namespace/>incomingMaterials": incomingMaterials,
				    "<portlet:namespace/>productStorage": productStorage,
				    "<portlet:namespace/>buildingSiteAspects": buildingSiteAspects,
				    "<portlet:namespace/>wasteDischarges": wasteDischarges,
				    "<portlet:namespace/>transportDetails": transportDetails,
				    "<portlet:namespace/>subcontractedActivities": subcontractedActivities,
					"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				},
				success : function(data) {
					uploadDocuments('incomingMaterial','Incoming Materials','','');
					uploadDocuments('productStorage','Product Storage','','');
					uploadDocuments('buildingSite','Building and Site Aspects','','');
					uploadDocuments('wasteDischarge','Waste and Discharges','','');
					uploadDocuments('transport','Details of Transport','','');
					uploadDocuments('contractedActivties','Sub Contracted Activities','','');
					if(!isSaveAndCont){
						applicantInfo();
					}
				},
				error : function(data) {
				},
			});
		}
	function addConsultancyServicesInfo(isSaveAndCont){
	  companyUsedFour = $("input[name='companyUsedFour']:checked").val();
	  consultingFirmTelephone = $("#sfConsultingFirmTelephone").val();
	  consultingEmail = $("#sfConsultingEmail").val();
	  stageOne = $("#sfStage1").val();
	  stageTwo = $("#sfStage2").val();
	  surveillanceAudit = $("#sfSurveillanceAudit").val();
	  recertificationAudit = $("#sfRecertificationAudit").val();
	  preAssessmentAudit = $("#sfPreAssessmentAudit").val();
	  otherServices = $("#sfOtherServices").val();
	  name = $("#sfName").val();
	  position = $("#sfPosition").val();
	  date = $("#sfDate").val();
	  ncbjApplicationId=$("#ncbjApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${consultancyServicesInfoInfoUrl}",
				data : {
					"<portlet:namespace/>companyUsedFour": companyUsedFour,
				    "<portlet:namespace/>consultingFirmTelephone": consultingFirmTelephone,
				    "<portlet:namespace/>consultingEmail": consultingEmail,
				    "<portlet:namespace/>stageOne": stageOne,
				    "<portlet:namespace/>stageTwo": stageTwo,
				    "<portlet:namespace/>surveillanceAudit": surveillanceAudit,
				    "<portlet:namespace/>recertificationAudit": recertificationAudit,
				    "<portlet:namespace/>preAssessmentAudit": preAssessmentAudit,
				    "<portlet:namespace/>otherServices": otherServices,
				    "<portlet:namespace/>name": name,
				    "<portlet:namespace/>position": position,
				    "<portlet:namespace/>date": date,
					"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				},
				success : function(data) {
					uploadDocuments('sectionFourSignatureBtn','Signature','');
					if(!isSaveAndCont){
						applicantInfo();
					}
				},
				error : function(data) {
				},
			});
		}
	function addQuotationFormTwoInfo(){
	 nameOfOrganizationFo = $("#nameOfOrganizationFo").val();
	 addressFo = $("#addressFo").val();
	 telephoneNumberFo = $("#telephoneNumberFo").val();
	 faxNumberFo = $("#faxNumberFo").val();
	 emailAddressFo = $("#emailAddressFo").val();
	 positionFirstFo = $("#positionFirstFo").val();
	 contactPersonNameFo = $("#contactPersonNameFo").val();
	 positionSecondFo = $("#positionSecondFo").val();
	 managementSystemFo = $("#managementSystemFo").val();
	 orgDeterminedTheScopeFo = $("input[name='orgDeterminedTheScopeFo']:checked").val();
	 productTypes = $("#productTypes").val();
	 productLine = $("#productLine").val();
	 haccpStudies = $("#haccpStudies").val();
	 criticalControlPoints = $("#criticalControlPoints").val();
	 operationalNumber = $("#operationalNumber").val();
	 productionSize = $("#productionSize").val();
	 warehouseSize = $("#warehouseSize").val();
	 warehouseDetailSize = $("#warehouseDetailSize").val();
	 seasonalProcess = $("#seasonalProcess").val();
	 ncbjApplicationId=$("#ncbjApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${quotationformTwoInfoUrl}",
				data : {
					"<portlet:namespace/>nameOfOrganizationFo": nameOfOrganizationFo,
				    "<portlet:namespace/>addressFo": addressFo,
				    "<portlet:namespace/>telephoneNumberFo": telephoneNumberFo,
				    "<portlet:namespace/>faxNumberFo": faxNumberFo,
				    "<portlet:namespace/>emailAddressFo": emailAddressFo,
				    "<portlet:namespace/>positionFirstFo": positionFirstFo,
				    "<portlet:namespace/>contactPersonNameFo": contactPersonNameFo,
				    "<portlet:namespace/>positionSecondFo": positionSecondFo,
				    "<portlet:namespace/>managementSystemFo": managementSystemFo,
				    "<portlet:namespace/>orgDeterminedTheScopeFo": orgDeterminedTheScopeFo,
				    "<portlet:namespace/>productTypes": productTypes,
				    "<portlet:namespace/>productLine": productLine,
				    "<portlet:namespace/>haccpStudies": haccpStudies,
				    "<portlet:namespace/>criticalControlPoints": criticalControlPoints,
				    "<portlet:namespace/>operationalNumber": operationalNumber,
				    "<portlet:namespace/>productionSize": productionSize,
				    "<portlet:namespace/>warehouseSize": warehouseSize,
				    "<portlet:namespace/>warehouseDetailSize": warehouseDetailSize,
				    "<portlet:namespace/>seasonalProcess": seasonalProcess,
					"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				},
				success : function(data) {
					addQuotationApplicantDetail();
					uploadDocuments('operationScope','Scope of the Certification','','The scope along with a corporate brochure or relevant documents defining the nature and scope of your operations');
					uploadDocuments('operationScopeBroch','Scope of the Documents','','State the scope along with a corporate brochure or relevant documents defining the nature and scope of your operations');
				},
				error : function(data) {
				},
			});
		}
	function comapnyDetailTwoData(counter,deleteKey){
		if(counter!=''&&deleteKey==''){
		sectionOneCompanyDetailVal =counter;
		companyNameTwo = $("#editCompanyNameTwo"+counter).val();
			companyAddressTwo = $("#editCompanyAddressTwo"+counter).val();
			sectionOneCompName = $("#editSectionOneCompName"+counter).val();
			sectionOneCompJobTitle = $("#editSectionOneCompJobTitle"+counter).val();
			sectionOneCompEmailAddr = $("#editSectionOneCompEmailAddr"+counter).val();
			sectionOneCompTelNum = $("#editSectionOneCompTelNum"+counter).val();
			sectOneCompContactName = $("#editSectOneCompContactName"+counter).val();
			sectOneCompJobTitle = $("#editSectOneCompJobTitle"+counter).val();
			sectOneCompEmail = $("#editSectOneCompEmail"+counter).val();
			sectOneCompTeleNumber = $("#editSectOneCompTeleNumber"+counter).val();
		}else{
			sectionOneCompanyDetailVal = $("#sectionOneCompanyDetailVal").val();
			companyNameTwo = $("#companyNameTwo").val();
	 		companyAddressTwo = $("#companyAddressTwo").val();
	 		sectionOneCompName = $("#sectionOneCompName").val();
	 		sectionOneCompJobTitle = $("#sectionOneCompJobTitle").val();
	 		sectionOneCompEmailAddr = $("#sectionOneCompEmailAddr").val();
	 		sectionOneCompTelNum = $("#sectionOneCompTelNum").val();
	 		sectOneCompContactName = $("#sectOneCompContactName").val();
	 		sectOneCompJobTitle = $("#sectOneCompJobTitle").val();
	 		sectOneCompEmail = $("#sectOneCompEmail").val();
	 		sectOneCompTeleNumber = $("#sectOneCompTeleNumber").val();
		}
		 ncbjApplicationId=$("#ncbjApplicationId").val();
		 ncbjCompanyDetailGenId=$("#sectionOneCompanyDetailId").val();
		 $.ajax({
			    type: "POST",
			    url: "${companyDetailTwoUrl}",
			    
			    data: {
			    	"<portlet:namespace/>counter": sectionOneCompanyDetailVal,
			    	"<portlet:namespace/>companyNameTwo": companyNameTwo,
		    	    "<portlet:namespace/>companyAddressTwo": companyAddressTwo,
		    	    "<portlet:namespace/>sectionOneCompName": sectionOneCompName,
		    	    "<portlet:namespace/>sectionOneCompJobTitle": sectionOneCompJobTitle,
		    	    "<portlet:namespace/>sectionOneCompEmailAddr": sectionOneCompEmailAddr,
		    	    "<portlet:namespace/>sectionOneCompTelNum": sectionOneCompTelNum,
		    	    "<portlet:namespace/>sectOneCompContactName": sectOneCompContactName,
		    	    "<portlet:namespace/>sectOneCompJobTitle": sectOneCompJobTitle,
		    	    "<portlet:namespace/>sectOneCompEmail": sectOneCompEmail,
		    	    "<portlet:namespace/>sectOneCompTeleNumber": sectOneCompTeleNumber,
			    	"<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
			    	"<portlet:namespace/>ncbjCompanyDetailGenId": ncbjCompanyDetailGenId,
			    	"<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#sectionOneCompanyDetailId"+result["counter"]).val(result["ncbjCompanyDetailGenId"]);
		    },
			    error: function (data) {
			    },
			  });
	}
	function addProductAndServicesData(counter){
	  	 	 if(counter!=''){
	  		productServicesDetailId=$("#productServicesDetailId"+counter).val();
	  	    productType = $("#editProductType"+counter).val();
	  		productList = $("#editProductList"+counter).val();
	  		productLines = $("#editProductLines"+counter).val();
				
		    }else{
		    	productServicesDetailId=$("#productServicesDetailId").val();
		 		productType = $("#productType").val();
		 		productList = $("#productList").val();
		 		productLines = $("#productLines").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	productServicesDetailVal=$("#productServicesDetailVal").val();
			 $.ajax({
				    type: "POST",
				    url: "${productServiceDetailUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": productServicesDetailVal,
				    	 "<portlet:namespace/>productType": productType,
				    	 "<portlet:namespace/>productList": productList,
				    	 "<portlet:namespace/>productLines": productLines,			    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>productServicesDetailId": productServicesDetailId,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	$("#productServicesDetailId"+result["counter"]).val(result["productServicesDetailId"]);
			    	},
				    error: function (data) {
				    },
				  });
		}
	function addNumOfEmployeesData(counter){
	  	 	if(counter!=''){
	  	 	employeesNumberDetailId=$("#employeesNumberDetailId"+counter).val();
	  	 	headOffice = $("#editHeadOffice"+counter).val();
	  	 	administrationOffice = $("#editAdministrationOffice"+counter).val();
	  	 	productionProcessing = $("#editProductionProcessing"+counter).val();
	  	 	maintenanceService = $("#editMaintenanceService"+counter).val();
	  	 	logistics = $("#editLogistics"+counter).val();
	  	 	total = $("#editTotal"+counter).val();
	  	 	seasonal = $("#editSeasonal"+counter).val();
	  	 	temporary = $("#editTemporary"+counter).val();
	  	 	subcontracted = $("#editSubcontracted"+counter).val();
				
		    }else{
		    	employeesNumberDetailId=$("#employeesNumberDetailId").val();
		 		headOffice = $("#headOffice").val();
		 		administrationOffice = $("#administrationOffice").val();
		 		productionProcessing = $("#productionProcessing").val();
		 		maintenanceService = $("#maintenanceService").val();
		 		logistics = $("#logistics").val();
		 		total = $("#total").val();
		 		seasonal = $("#seasonal").val();
		 		temporary = $("#temporary").val();
		 		subcontracted = $("#subcontracted").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	employeesNumberDetailVal = $("#employeesNumberDetailVal").val();
			 $.ajax({
				    type: "POST",
				    url: "${numberOfEmployeeDetailUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": employeesNumberDetailVal,
				    	 "<portlet:namespace/>headOffice": headOffice,
				    	 "<portlet:namespace/>administrationOffice": administrationOffice,
				    	 "<portlet:namespace/>productionProcessing": productionProcessing,
				    	 "<portlet:namespace/>maintenanceService": maintenanceService,
				    	 "<portlet:namespace/>logistics": logistics,
				    	 "<portlet:namespace/>total": total,			    	
				    	 "<portlet:namespace/>seasonal": seasonal,			    	
				    	 "<portlet:namespace/>temporary": temporary,			    	
				    	 "<portlet:namespace/>subcontracted": subcontracted,			    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>employeesNumberDetailId": employeesNumberDetailId,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	$("#employeesNumberDetailId"+result["counter"]).val(result["employeesNumberDetailId"]);
			    	},
				    error: function (data) {
				    },
				  });
		}
	function addWorkPatternEmpShifts(counter){
	  	 	if(counter!=''){
	  	 	workPatternDetailId=$("#workPatternDetailId"+counter).val();
	  	 	employeesShift = $("#editEmployeesShift"+counter).val();
				
		    }else{
		    	workPatternDetailId=$("#workPatternDetailId").val();
		 		employeesShift = $("#employeesShift").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	workPatternDetailVal = $("#workPatternDetailVal").val();
	  	 	
			 $.ajax({
				    type: "POST",
				    url: "${workPatternEmpShiftsUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": workPatternDetailVal,
				    	 "<portlet:namespace/>employeesShift": employeesShift,			    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>workPatternDetailId": workPatternDetailId,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	$("#workPatternDetailId"+result["counter"]).val(result["workPatternDetailId"]);
			    	},
				    error: function (data) {
				    },
				  });
		}
	function addHaccpNumberStudyDetail(counter){
	  	 	if(counter!=''){
	  	 	haccpNumberDetailId=$("#haccpNumberDetailId"+counter).val();
	  	 	haccpNumber = $("#editHaccpNumber"+counter).val();
	  	 	haccpType = $("#editHaccpType"+counter).val();
				
		    }else {
		    	haccpNumberDetailId=$("#haccpNumberDetailId").val();
		 		haccpNumber = $("#haccpNumber").val();
		 		haccpType = $("#haccpType").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	haccpNumberDetailVal = $("#haccpNumberDetailVal").val();
			 $.ajax({
				    type: "POST",
				    url: "${haccpNumberStudyDetailUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": haccpNumberDetailVal,
				    	 "<portlet:namespace/>haccpNumber": haccpNumber,			    	
				    	 "<portlet:namespace/>haccpType": haccpType,			    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>haccpNumberDetailId": haccpNumberDetailId,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	var counter = result["counter"];
				    	$("#haccpNumberDetailId"+result["counter"]).val(result["haccpNumberDetailId"]);
				    	uploadDocuments('haccpStudyNumber','Number of HACCP study'+counter,'');
			    	},
				    error: function (data) {
				    },
				  });
		}
	function addCompanyDetailMultiInfo(counter,deleteKey){
	  	 	if(counter!=''&&deleteKey==''){
		  	 	companyDetailVal=counter;
		  	 	companyName = $("#editCompanyName"+counter).val();
		  	 	companyAddress = $("#editCompanyAddress"+counter).val();
		  	 	headOfCompany = $("#editHeadOfCompany"+counter).val();
		  	 	jobTitleOne = $("#editJobTitleOne"+counter).val();
		  	 	companyEmailOne = $("#editCompanyEmailOne"+counter).val();
		  	 	companyNumOne = $("#editCompanyNumOne"+counter).val();
		  	 	contactName = $("#editContactName"+counter).val();
		  	 	jobTitleTwo = $("#editJobTitleTwo"+counter).val();
		  	 	companyEmailTwo = $("#editCompanyEmailTwo"+counter).val();
		  	 	companyNumTwo = $("#editCompanyNumTwo"+counter).val();
		    }else{
		    	companyDetailVal = $("#companyDetailVal").val();
		    	companyName = $("#companyName").val();
			    companyAddress = $("#companyAddress").val();
			    headOfCompany = $("#headOfCompany").val();
			    jobTitleOne = $("#jobTitleOne").val();
			    companyEmailOne = $("#companyEmailOne").val();
			    companyNumOne = $("#companyNumOne").val();
			    contactName = $("#contactName").val();
			    jobTitleTwo = $("#jobTitleTwo").val();
			    companyEmailTwo = $("#companyEmailTwo").val();
			    companyNumTwo = $("#companyNumTwo").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	companyDetailValId=$("#companyDetailValId"+counter).val();
			 $.ajax({
				    type: "POST",
				    url: "${companyDetailMultiInfoUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": companyDetailVal,
				    	 "<portlet:namespace/>companyName": companyName,
					    "<portlet:namespace/>companyAddress": companyAddress,
					    "<portlet:namespace/>headOfCompany": headOfCompany,
					    "<portlet:namespace/>jobTitleOne": jobTitleOne,
					    "<portlet:namespace/>companyEmailOne": companyEmailOne,
					    "<portlet:namespace/>companyNumOne": companyNumOne,
					    "<portlet:namespace/>contactName": contactName,
					    "<portlet:namespace/>jobTitleTwo": jobTitleTwo,
					    "<portlet:namespace/>companyEmailTwo": companyEmailTwo,
					    "<portlet:namespace/>companyNumTwo": companyNumTwo,    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>companyDetailValId": companyDetailValId,
				    	 "<portlet:namespace/>deleteKey": deleteKey,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	$("#companyDetailValId"+result["counter"]).val(result["companyDetailValId"]);
			    	},
				    error: function (data) {
				    },
				  });
		}
	function newCompanyDetail(){
		siteNumberSection = $("#siteNumberSectionValue").val();
		if(siteNumberSection=="Single Site/Location"){
		companyNameNew = $("#companyNameTwo").val();
		companyAddressNew = $("#companyAddressTwo").val();
		headOfCompanyNew = $("#sectionOneCompName").val();
		jobTitleOneNew = $("#sectionOneCompJobTitle").val();
		companyEmailOneNew = $("#sectionOneCompEmailAddr").val();
		companyNumOneNew = $("#sectionOneCompTelNum").val();
		contactNameNew = $("#sectOneCompContactName").val();
		jobTitleTwoNew = $("#sectOneCompJobTitle").val();
		companyEmailTwoNew = $("#sectOneCompEmail").val();
		companyNumTwoNew = $("#sectOneCompTeleNumber").val();
		ncbjApplicationId=$("#ncbjApplicationId").val();
				$.ajax({
					type : "POST",
					url : "${newCompanyDetailUrl}",
					data : {
						"<portlet:namespace/>companyNameNew": companyNameNew,
					    "<portlet:namespace/>companyAddressNew": companyAddressNew,
					    "<portlet:namespace/>headOfCompanyNew": headOfCompanyNew,
					    "<portlet:namespace/>jobTitleOneNew": jobTitleOneNew,
					    "<portlet:namespace/>companyEmailOneNew": companyEmailOneNew,
					    "<portlet:namespace/>companyNumOneNew": companyNumOneNew,
					    "<portlet:namespace/>contactNameNew": contactNameNew,
					    "<portlet:namespace/>jobTitleTwoNew": jobTitleTwoNew,
					    "<portlet:namespace/>companyEmailTwoNew": companyEmailTwoNew,
					    "<portlet:namespace/>companyNumTwoNew": companyNumTwoNew,
						"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
					},
					success : function(data) {
					},
					error : function(data) {
					},
				});
			} }
	function addHazardAnalysisCritical(counter,deleteKey){
		 	if(counter!=''){
		 		hazardAnalysisDetailVal=counter;
		 		hazardAnalysis = $("#editHazardAnalysis"+counter).val();
			
	    }else {
	    	hazardAnalysisDetailVal = $("#hazardAnalysisDetailVal").val();
	    	hazardAnalysis = $("#hazardAnalysis").val();
		 }
		 	ncbjApplicationId=$("#ncbjApplicationId").val();
		 	hazardAnalysisDetailId=$("#hazardAnalysisDetailId"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${hazardAnalysisDetailUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": hazardAnalysisDetailVal,
			    	 "<portlet:namespace/>hazardAnalysis": hazardAnalysis,			    	
			    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
			    	 "<portlet:namespace/>hazardAnalysisDetailId": hazardAnalysisDetailId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	var counter = result["counter"];
			    	$("#hazardAnalysisDetailId"+result["counter"]).val(result["hazardAnalysisDetailId"]);
			    	uploadDocuments('hazardControlPoint','Hazard Analysis'+counter,'');
		    	},
			    error: function (data) {
			    },
			  });}
	function addConsentLicencePermitData(counter,deleteKey){
	  	 	if(counter!=''){
	  	 	licenceListDetailVal=counter;
	  	 	consentsList = $("#editConsentsList"+counter).val();
				
		    }else {
		    	licenceListDetailVal = $("#licenceListDetailVal").val();
		 		consentsList = $("#consentsList").val();
	    	 }
	  	 	ncbjApplicationId=$("#ncbjApplicationId").val();
	  	 	licenceListDetailId=$("#licenceListDetailId"+counter).val();
			 $.ajax({
				    type: "POST",
				    url: "${consentLicencePermitUrl}",
				    data: {
				    	 "<portlet:namespace/>counter": licenceListDetailVal,
				    	 "<portlet:namespace/>consentsList": consentsList,			    	
				    	 "<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
				    	 "<portlet:namespace/>licenceListDetailId": licenceListDetailId,
				    	 "<portlet:namespace/>deleteKey": deleteKey,
				      		    },
				    success: function (data) {
				    	var result=data.APP_DATA;
				    	var counter = result["counter"];
				    	$("#licenceListDetailId"+result["counter"]).val(result["licenceListDetailId"]);
				    	uploadDocuments('consentsListUpload','Consents Licences'+counter,'');
			    	},
				    error: function (data) {
				    },
				  });
		}
	function addActivitiesProcessesList(isSaveAndCont){
	 transferReasonList = $("#transferReasonList").val();
	 processActivityDescription = $("#processActivityDescription").val();
	 incomingMaterialsDescription = $("#incomingMaterialsDescription").val();
	 processesDescription = $("#processesDescription").val();
	 explainActivity = $("#quantity1").val();
		var isoCategoryOne=  new Array();
		$("input:checkbox[name=iso22000Cate]:checked").each(function(){
			isoCategoryOne.push($(this).val());
		});
		var categoryOne= isoCategoryOne.toString();
	 ncbjApplicationId=$("#ncbjApplicationId").val();
				$.ajax({
					type : "POST",
					url : "${activitiesProcessesListUrl}",
					data : {
					    "<portlet:namespace/>transferReasonList": transferReasonList,
					    "<portlet:namespace/>processActivityDescription": processActivityDescription,
					    "<portlet:namespace/>incomingMaterialsDescription": incomingMaterialsDescription,
					    "<portlet:namespace/>processesDescription": processesDescription,
					    "<portlet:namespace/>explainActivity": explainActivity,
					    "<portlet:namespace/>categoryOne": categoryOne,
						"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
					},
					success : function(data) {
						uploadDocuments('processActivity','Process Activities','','Activities and Processes on site');
						uploadDocuments('siteActivity','Site Activities','','');
						uploadDocuments('incomingMaterials','Incoming materials','','Incoming materials');
						uploadDocuments('processes','Processes','','Processes');
						uploadDocuments('subContractedActivity','List of sub contracted activities','','');
						if(!isSaveAndCont){
							applicantInfo();
							addLicenceListDetail();
							addHazardAnalysisDetail();
							addHaccpNumberDetail();
						}
					},
					error : function(data) {
					},
				});
			}
	function addSpecificActivitiesList() {
		for (var i = 1; i <= 10; i++) {
			specificActivity = $("#specificActivity" + i).val();
			specificActivityNumber = $("#specificActivityNumber" + i).val();
			specificActivityChecked = $("#specificActivity" + i).is(':checked');
			ncbjApplicationId = $("#ncbjApplicationId").val();
			$
				.ajax({
					type : "POST",
					url : "${specificActivitiesListSelectedUrl}",
					data : {
						"<portlet:namespace/>specificActivity" : specificActivity,
						"<portlet:namespace/>specificActivityNumber" : specificActivityNumber,
						"<portlet:namespace/>specificActivityChecked" : specificActivityChecked,
						"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
					},
					async: false,
					success : function(data) {
					},
					error : function(data) {
					},
				});
		}
	}
	/* ISO 9001 Quotation BO function */
	function addQuotationApplicantDetail() {
	quotationApplicantDetailVal = $("#quotationApplicantDetailVal").val();
	quotationApplicantShifts = $("#quotationApplicantShifts").val();
	quotationApplicantProductTypes = $("#quotationApplicantProductTypes").val();
	quotationApplicantAddressOne = $("#quotationApplicantAddressOne").val();
	quotationEmpNum = $("#quotationEmpNum").val();
	quotationHeadOffices = $("#quotationHeadOffices").val();
	quotationNoOfFullTimeEmployees = $("#quotationNoOfFullTimeEmployees").val();
	quotationNoOfPartTimeEmployees = $("#quotationNoOfPartTimeEmployees").val();
	quotationNoOfContractors = $("#quotationNoOfContractors").val();
	quotationNoOfContractedWorkers = $("#quotationNoOfContractedWorkers").val();
	if (quotationApplicantShifts != "" || quotationApplicantProductTypes != "" || quotationApplicantAddressOne != "" || quotationEmpNum != "" || quotationHeadOffices != "" 
			|| quotationNoOfFullTimeEmployees != "" || quotationNoOfPartTimeEmployees != "" || quotationNoOfContractors != ""|| quotationNoOfContractedWorkers != "") {
		$(".addQuotationApplicantDetailTableBox").removeClass("hide");
		$.ajax({
					type : "POST",
					url : "${addquotationApplicantDetailInfoUrl}",
					data : {
						"<portlet:namespace/>quotationApplicantDetailVal" : quotationApplicantDetailVal,
					},
					async : false,
					success : function(data) {

						/* APPEND ROW JSP INTO TABLE */
						$(".addQuotationApplicantDetailTable").each(function(index) {
							if (index === 0) {
								$(this).append(data);

							} else {
								$cloneRow = $(data).clone();
								$cloneRow.find('td').slice(-2).remove();
								$(this).append($cloneRow);
							}
						});
						/* APPEND DATA INTO TABLE */
						$(".quotationApplicantShifts" + quotationApplicantDetailVal).append(
								quotationApplicantShifts);
						$(".quotationApplicantProductTypes" + quotationApplicantDetailVal)
								.append(quotationApplicantProductTypes);
						$(".quotationApplicantAddressOne" + quotationApplicantDetailVal)
								.append(quotationApplicantAddressOne);
						$(".quotationEmpNum" + quotationApplicantDetailVal)
						.append(quotationEmpNum);

						$(".quotationHeadOffices"+ quotationApplicantDetailVal)
						.append(quotationHeadOffices);
						$(".quotationNoOfFullTimeEmployees"+ quotationApplicantDetailVal)
								.append(quotationNoOfFullTimeEmployees);
						$(".quotationNoOfPartTimeEmployees"
										+ quotationApplicantDetailVal)
								.append(quotationNoOfPartTimeEmployees);
						$(".quotationNoOfContractors" + quotationApplicantDetailVal)
								.append(quotationNoOfContractors);
						$(".quotationNoOfContractedWorkers"
										+ quotationApplicantDetailVal)
								.append(quotationNoOfContractedWorkers);
						/* VALUE INCREAMENT */
						quotationBusinessDetailsData("");
						/* addBusinessDetailInfo('','');  */
						quotationApplicantDetailVal++;
						$("#quotationApplicantDetailVal").val(quotationApplicantDetailVal);
						/* RESET FORM FIELDS */
						$("#quotationApplicantShifts").val("");
						$("#quotationApplicantProductTypes").val("");
						$("#quotationApplicantAddressOne").val("");
						$("#quotationEmpNum").val("");
						$("#quotationHeadOffices").val("");
						$("#quotationNoOfFullTimeEmployees").val("");
						$("#quotationNoOfPartTimeEmployees").val("");
						$("#quotationNoOfContractors").val("");
						$("#quotationNoOfContractedWorkers").val("");
					}
				});
	} else {
		$("#quotationApplicantAddressOne").focus();
	}
	}
	function quotationApplicantDetailEditTab(quotationApplicantDetailVal){
	$(".editQuotationApplicantDetailEditTabPopup").modal("show");
	$(".editQuotationApplicantAddressOne").attr("id" , "editQuotationApplicantAddressOne"+quotationApplicantDetailVal);
	$(".editQuotationApplicantShifts").attr("id" , "editQuotationApplicantShifts"+quotationApplicantDetailVal);
	$(".editQuotationApplicantProductTypes").attr("id" , "editQuotationApplicantProductTypes"+quotationApplicantDetailVal);
	$(".editQuotationEmpNum").attr("id" , "editQuotationEmpNum"+quotationApplicantDetailVal);
	$(".editQuotationHeadOffices").attr("id" , "editQuotationHeadOffices"+quotationApplicantDetailVal);
	$(".editQuotationNoOfFullTimeEmployees").attr("id" , "editQuotationNoOfFullTimeEmployees"+quotationApplicantDetailVal);
	$(".editQuotationNoOfPartTimeEmployees").attr("id" , "editQuotationNoOfPartTimeEmployees"+quotationApplicantDetailVal);
	$(".editQuotationNoOfContractors").attr("id" , "editQuotationNoOfContractors"+quotationApplicantDetailVal);
	$(".editQuotationNoOfContractedWorkers").attr("id" , "editQuotationNoOfContractedWorkers"+quotationApplicantDetailVal);
	quotationApplicantAddressOne = $(".quotationApplicantAddressOne"+quotationApplicantDetailVal+":first").text().trim();
	quotationApplicantShifts = $(".quotationApplicantShifts"+quotationApplicantDetailVal+":first").text().trim();
	quotationApplicantProductTypes = $(".quotationApplicantProductTypes"+quotationApplicantDetailVal+":first").text().trim();
	quotationEmpNum = $(".quotationEmpNum"+quotationApplicantDetailVal+":first").text().trim();
	quotationHeadOffices = $(".quotationHeadOffices"+quotationApplicantDetailVal+":first").text().trim();
	quotationNoOfFullTimeEmployees = $(".quotationNoOfFullTimeEmployees"+quotationApplicantDetailVal+":first").text().trim();
	quotationNoOfPartTimeEmployees = $(".quotationNoOfPartTimeEmployees"+quotationApplicantDetailVal+":first").text().trim();
	quotationNoOfContractors = $(".quotationNoOfContractors"+quotationApplicantDetailVal+":first").text().trim();
	quotationNoOfContractedWorkers = $(".quotationNoOfContractedWorkers"+quotationApplicantDetailVal+":first").text().trim();
	$("#editQuotationApplicantAddressOne"+quotationApplicantDetailVal).val(quotationApplicantAddressOne);
	$("#editQuotationApplicantShifts"+quotationApplicantDetailVal).val(quotationApplicantShifts);
	$("#editQuotationApplicantProductTypes"+quotationApplicantDetailVal).val(quotationApplicantProductTypes);
	$("#editQuotationEmpNum"+quotationApplicantDetailVal).val(quotationEmpNum);
	$("#editQuotationHeadOffices"+quotationApplicantDetailVal).val(quotationHeadOffices);
	$("#editQuotationNoOfFullTimeEmployees"+quotationApplicantDetailVal).val(quotationNoOfFullTimeEmployees);
	$("#editQuotationNoOfPartTimeEmployees"+quotationApplicantDetailVal).val(quotationNoOfPartTimeEmployees);
	$("#editQuotationNoOfContractors"+quotationApplicantDetailVal).val(quotationNoOfContractors);
	$("#editQuotationNoOfContractedWorkers"+quotationApplicantDetailVal).val(quotationNoOfContractedWorkers);
	$(".saveEditQuotationApplicantDetailPopupDataBtn").attr("onclick" , "quotationApplicantDetailEditData("+quotationApplicantDetailVal+")");
	}
	function quotationApplicantDetailEditData(quotationApplicantDetailVal){
		quotationBusinessDetailsData(quotationApplicantDetailVal);
	$(".quotationApplicantAddressOne" + quotationApplicantDetailVal).html($("#editQuotationApplicantAddressOne"+quotationApplicantDetailVal).val());
	$(".quotationApplicantShifts" + quotationApplicantDetailVal).html($("#editQuotationApplicantShifts"+quotationApplicantDetailVal).val());
	$(".quotationApplicantProductTypes" + quotationApplicantDetailVal).html($("#editQuotationApplicantProductTypes"+quotationApplicantDetailVal).val());
	$(".quotationEmpNum" + quotationApplicantDetailVal).html($("#editQuotationEmpNum"+quotationApplicantDetailVal).val());
	$(".quotationHeadOffices" + quotationApplicantDetailVal).html($("#editQuotationHeadOffices"+quotationApplicantDetailVal).val());
	$(".quotationNoOfFullTimeEmployees" + quotationApplicantDetailVal).html($("#editQuotationNoOfFullTimeEmployees"+quotationApplicantDetailVal).val());
	$(".quotationNoOfPartTimeEmployees" + quotationApplicantDetailVal).html($("#editQuotationNoOfPartTimeEmployees"+quotationApplicantDetailVal).val());
	$(".quotationNoOfContractors" + quotationApplicantDetailVal).html($("#editQuotationNoOfContractors"+quotationApplicantDetailVal).val());
	$(".quotationNoOfContractedWorkers" + quotationApplicantDetailVal).html($("#editQuotationNoOfContractedWorkers"+quotationApplicantDetailVal).val());

	$(".editQuotationApplicantAddressOne").val("");
	$(".editQuotationApplicantShifts").val("");
	$(".editQuotationApplicantProductTypes").val("");
	$(".editQuotationEmpNum").val("");
	$(".editQuotationHeadOffices").val("");
	$(".editQuotationNoOfFullTimeEmployees").val("");
	$(".editQuotationNoOfPartTimeEmployees").val("");
	$(".editQuotationNoOfContractors").val("");
	$(".editQuotationNoOfContractedWorkers").val("");
	}
	function quotationApplicantDetailDeleteDataTab(quotationApplicantDetailVal) {
		deletequotationBusinessDetailsData(quotationApplicantDetailVal);
	  var quotationApplicantDetailCounter = $("#quotationApplicantDetailVal").val();
	  $("#quotationApplicantDetailVal").val(quotationApplicantDetailCounter - 1);
	  var delRowElement = $(".quotation-applicant-row" + quotationApplicantDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(quotationApplicantDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= quotationApplicantDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".quotation-applicant-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "quotation-applicant-row"+ prevCounter);
	    rowElement.find("td.quotationApplicantAddressOne"+i).removeClass("quotationApplicantAddressOne"+i).addClass("quotationApplicantAddressOne"+prevCounter);
	    rowElement.find("td.quotationApplicantShifts"+i).removeClass("quotationApplicantShifts"+i).addClass("quotationApplicantShifts"+prevCounter);
	    rowElement.find("td.quotationApplicantProductTypes"+i).removeClass("quotationApplicantProductTypes"+i).addClass("quotationApplicantProductTypes"+prevCounter);
		rowElement.find("td.quotationEmpNum"+i).removeClass("quotationEmpNum"+i).addClass("quotationEmpNum"+prevCounter);
	    rowElement.find("td.quotationHeadOffices"+i).removeClass("quotationHeadOffices"+i).addClass("quotationHeadOffices"+prevCounter);
	    rowElement.find("td.quotationNoOfFullTimeEmployees"+i).removeClass("quotationNoOfFullTimeEmployees"+i).addClass("quotationNoOfFullTimeEmployees"+prevCounter);
	    rowElement.find("td.quotationNoOfPartTimeEmployees"+i).removeClass("quotationNoOfPartTimeEmployees"+i).addClass("quotationNoOfPartTimeEmployees"+prevCounter);
	    rowElement.find("td.quotationNoOfContractors"+i).removeClass("quotationNoOfContractors"+i).addClass("quotationNoOfContractors"+prevCounter);
	    rowElement.find("td.quotationNoOfContractedWorkers"+i).removeClass("quotationNoOfContractedWorkers"+i).addClass("quotationNoOfContractedWorkers"+prevCounter);
	    rowElement.find("#quotationApplicantDetailDeleteDataTab").attr('onclick', 'quotationApplicantDetailDeleteDataTab(' +prevCounter+ ')');
	    rowElement.find("#quotationApplicantDetailEditTab").attr('onclick', 'quotationApplicantDetailEditTab(' +prevCounter+ ')');
	  }
	}
	function quotationBusinessDetailsData(counter){
		if(counter!=""){
			quotationApplicantDetailValId = $("#quotationApplicantDetailValId"+counter).val();
			quotationApplicantShifts = $("#editQuotationApplicantShifts"+counter).val();
		quotationApplicantProductTypes = $("#editQuotationApplicantProductTypes"+counter).val();
		quotationApplicantAddressOne = $("#editQuotationApplicantAddressOne"+counter).val();
		quotationEmpNum = $("#editQuotationEmpNum"+counter).val();
		quotationHeadOffices = $("#editQuotationHeadOffices"+counter).val();
		quotationNoOfFullTimeEmployees = $("#editQuotationNoOfFullTimeEmployees"+counter).val();
		quotationNoOfPartTimeEmployees = $("#editQuotationNoOfPartTimeEmployees"+counter).val();
		quotationNoOfContractors = $("#editQuotationNoOfContractors"+counter).val();
		quotationNoOfContractedWorkers = $("#editQuotationNoOfContractedWorkers"+counter).val();
		}else{
		quotationApplicantDetailValId = $("#quotationApplicantDetailValId").val();
		counterquotationApplicantDetail = $("#quotationApplicantDetailVal").val();
		
		quotationApplicantShifts = $("#quotationApplicantShifts").val();
		quotationApplicantProductTypes = $("#quotationApplicantProductTypes").val();
		quotationApplicantAddressOne = $("#quotationApplicantAddressOne").val();
		quotationEmpNum = $("#quotationEmpNum").val();
		quotationHeadOffices = $("#quotationHeadOffices").val();
		quotationNoOfFullTimeEmployees = $("#quotationNoOfFullTimeEmployees").val();
		quotationNoOfPartTimeEmployees = $("#quotationNoOfPartTimeEmployees").val();
		quotationNoOfContractors = $("#quotationNoOfContractors").val();
		quotationNoOfContractedWorkers = $("#quotationNoOfContractedWorkers").val();
		
		
		}
			ncbjApplicationId = $("#ncbjApplicationId").val();
		counterquotationApplicantDetail = $("#quotationApplicantDetailVal").val();
		  $.ajax({
				type: "POST",
				url: "${quotationBusinessDetailsURL}", 
				data: {
					"<portlet:namespace/>quotationApplicantShifts": quotationApplicantShifts,
					"<portlet:namespace/>quotationApplicantProductTypes": quotationApplicantProductTypes,
					"<portlet:namespace/>quotationApplicantAddressOne": quotationApplicantAddressOne,
					"<portlet:namespace/>quotationEmpNum": quotationEmpNum,
					"<portlet:namespace/>quotationHeadOffices": quotationHeadOffices,
					"<portlet:namespace/>quotationNoOfFullTimeEmployees": quotationNoOfFullTimeEmployees,
					"<portlet:namespace/>quotationNoOfPartTimeEmployees": quotationNoOfPartTimeEmployees,
					"<portlet:namespace/>quotationNoOfContractors": quotationNoOfContractors,
					"<portlet:namespace/>quotationNoOfContractedWorkers": quotationNoOfContractedWorkers,
					
					"<portlet:namespace/>ncbjApplicationId": ncbjApplicationId,
					"<portlet:namespace/>quotationApplicantDetailValId": quotationApplicantDetailValId,
					"<portlet:namespace/>counterquotationApplicantDetail": counterquotationApplicantDetail,
				},
				success: function (data) {
					var result=data.APP_DATA;
					var counter=result["counter"];
					$("#quotationApplicantDetailValId"+counter).val(result["quotationApplicantDetailValId"]);
				},
				error: function (data) {
				}
			});
	} 
	function deletequotationBusinessDetailsData(quotationApplicantDetailVal){
		quotationApplicantDetailValId=$("#quotationApplicantDetailValId"+quotationApplicantDetailVal).val();
	 $.ajax({
			type: "POST",
			url: "${deletequotationBusinessAdd}", 
			data: {
				"<portlet:namespace/>quotationApplicantDetailValId": quotationApplicantDetailValId,
			},
			success: function (data) {
			},
			error: function (data) {
			}
		});
	}
</script>