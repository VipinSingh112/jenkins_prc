<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addActivityPerformedTestingLocUrl" id="activity/performed/testing/loc/detail"/>
<portlet:resourceURL var="addMajorEquipmentTestingUrl" id="major/equipment/testing/detail"/>
<portlet:resourceURL var="addPersonnelResponsibleCalibrationUrl" id="personnel/responsible/calibration/detail"/>
<portlet:resourceURL var="addStaffDetailCalibrationUrl" id="staff/calibration/detail"/>

<portlet:resourceURL var="addScopeForAccreditationCalibrationUrl" id="scope/accreditation/calibration/detail"/>
<portlet:resourceURL var="addActivityPerformedLocCalibrationUrl" id="activity/performed/loc/calibration/detail"/>
<portlet:resourceURL var="addMajorEquipmentCalibrationUrl" id="major/equipment/calibration/detail"/>





<portlet:resourceURL var="addKeyPersonnelDetailsUrl" id="key/personnel/detail"/>

<portlet:resourceURL var="addPersonnelResponsibleDetailDataUrl" id="/add/lab/application/info"/>
<portlet:resourceURL var="addPersonnelResponsibleTestingDetailDataUrl" id="/add/lab/application/info"/>
<portlet:resourceURL var="addPersonnelResponsibleCalibrationDetailDataUrl" id="/add/lab/application/info"/>
<portlet:resourceURL var="addSpecimenCollectionDetailDataUrl" id="/add/lab/desc/of/activity"/>
<portlet:resourceURL var="addTestingSpecimenCollectionDetailDataUrl" id="/add/lab/desc/of/activity"/>
<portlet:resourceURL var="addCalibrationSpecimenCollectionDetailDataUrl" id="/add/lab/desc/of/activity"/>
<portlet:resourceURL var="addPointCareTestingDetailDataUrl" id="/add/point/care/testing/detail/data"/>
<portlet:resourceURL var="addSignatoryAuthorityDetailDataUrl" id="/add/signatory/authority/detail/data/url"/>
<portlet:resourceURL var="addExaminationsScopeDetailDataUrl" id="/add/examinations/scope/detail/data"/>
<portlet:resourceURL var="addMajorEquipmentDetailDataUrl" id="/add/major/equipement/detaiil/data"/>
<portlet:resourceURL var="addApplicationActivityLocDetailDataUrl" id="/add/application/activity/loc/detail/data"/>
<portlet:resourceURL var="addStaffDetailDataUrl" id="add/lab/structural/requirement"/>
<portlet:resourceURL var="addStaffDetailCalibrationDataUrl" id="add/lab/structural/requirement"/>
<portlet:resourceURL var="addScopeForAccreditationDetailDataUrl" id="add/lab/test/structural/req/Sec"/>
<portlet:resourceURL var="addScopeForCalibrationsDetailDataUrl" id="add/lab/cal/struct/requ/sec"/>
<portlet:resourceURL var="addActivityPerformedLocDetailDataUrl" id="add/lab/resource/req/first"/>
<portlet:resourceURL var="addActivityPerformedLocCalibrationDetailDataUrl" id="add/lab/resource/req/first"/>
<portlet:resourceURL var="addMajorEquipmentTestingDetailDataUrl" id="add/lab/resource/req/sec"/>
<portlet:resourceURL var="addMajorEquipmentCalibrationDetailDataUrl" id="add/lab/resource/req/sec"/>
<portlet:resourceURL var="addKeyPersonnelDetailsDataUrl" id="add/Key/Personnel/Details/Data"/>
<script>
function scopeForAccreditationEditTab(scopeForAccreditationVal){
	$(".editScopeForAccreditationEditTabPopup").modal("show");
	$(".editProductTesting").attr("id" , "editProductTesting"+scopeForAccreditationVal);
	$(".editTestsTesting").attr("id" , "editTestsTesting"+scopeForAccreditationVal);
	$(".editMethodsTesting").attr("id" , "editMethodsTesting"+scopeForAccreditationVal);
	$(".editEquipmentTesting").attr("id" , "editEquipmentTesting"+scopeForAccreditationVal);
	$(".editCapanilityLimitTesting").attr("id" , "editCapanilityLimitTesting"+scopeForAccreditationVal);
	$(".editMeasurementUncertaintyTesting").attr("id" , "editMeasurementUncertaintyTesting"+scopeForAccreditationVal);
	productTesting = $(".productTesting"+scopeForAccreditationVal+":first").text().trim();
	testsTesting = $(".testsTesting"+scopeForAccreditationVal+":first").text().trim();
	methodsTesting = $(".methodsTesting"+scopeForAccreditationVal+":first").text().trim();
	equipmentTesting = $(".equipmentTesting"+scopeForAccreditationVal+":first").text().trim();
	capanilityLimitTesting = $(".capanilityLimitTesting"+scopeForAccreditationVal+":first").text().trim();
	measurementUncertaintyTesting = $(".measurementUncertaintyTesting"+scopeForAccreditationVal+":first").text().trim();
	$("#editProductTesting"+scopeForAccreditationVal).val(productTesting);
	$("#editTestsTesting"+scopeForAccreditationVal).val(testsTesting);
	$("#editMethodsTesting"+scopeForAccreditationVal).val(methodsTesting);
	$("#editEquipmentTesting"+scopeForAccreditationVal).val(equipmentTesting);
	$("#editCapanilityLimitTesting"+scopeForAccreditationVal).val(capanilityLimitTesting);
	$("#editMeasurementUncertaintyTesting"+scopeForAccreditationVal).val(measurementUncertaintyTesting);
	$(".saveEditScopeForAccreditationPopupDataBtn").attr("onclick" , "scopeForAccreditationEditDataTab("+scopeForAccreditationVal+")");
}
function scopeForAccreditationEditDataTab(scopeForAccreditationVal){
	addScopeForAccreditationDetailData(scopeForAccreditationVal);
	$(".productTesting" + scopeForAccreditationVal).html($("#editProductTesting"+scopeForAccreditationVal).val());
	$(".testsTesting" + scopeForAccreditationVal).html($("#editTestsTesting"+scopeForAccreditationVal).val());
	$(".methodsTesting" + scopeForAccreditationVal).html($("#editMethodsTesting"+scopeForAccreditationVal).val());
	$(".equipmentTesting" + scopeForAccreditationVal).html($("#editEquipmentTesting"+scopeForAccreditationVal).val());
	$(".capanilityLimitTesting" + scopeForAccreditationVal).html($("#editCapanilityLimitTesting"+scopeForAccreditationVal).val());
	$(".measurementUncertaintyTesting" + scopeForAccreditationVal).html($("#editMeasurementUncertaintyTesting"+scopeForAccreditationVal).val());
	$(".editProductTesting").val("");
	$(".editTestsTesting").val("");
	$(".editMethodsTesting").val("");
	$(".editEquipmentTesting").val("");
	$(".editCapanilityLimitTesting").val("");
	$(".editMeasurementUncertaintyTesting").val("");
}
function scopeForAccreditationDeleteData(scopeForAccreditationValData) {
	  var scopeForAccreditationCountCounter = $("#scopeForAccreditationVal").val();
	  $("#scopeForAccreditationVal").val(scopeForAccreditationCountCounter - 1);
	  var delRowElement = $(".scope-accreditation-row" + scopeForAccreditationValData); 
	  delRowElement.remove();
	  var j = parseInt(scopeForAccreditationValData) + 1;
	  for (var i = j; i <= scopeForAccreditationCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".scope-accreditation-row" + i);
	    rowElement.attr("class", "scope-accreditation-row" + prevCounter);
	    rowElement.find("td.productTesting"+i).removeClass("productTesting"+i).addClass("productTesting"+prevCounter);
	    rowElement.find("td.testsTesting"+i).removeClass("testsTesting"+i).addClass("testsTesting"+prevCounter);
		rowElement.find("td.methodsTesting"+i).removeClass("methodsTesting"+i).addClass("methodsTesting"+prevCounter);
		rowElement.find("td.equipmentTesting"+i).removeClass("equipmentTesting"+i).addClass("equipmentTesting"+prevCounter);
	    rowElement.find("td.capanilityLimitTesting"+i).removeClass("capanilityLimitTesting"+i).addClass("capanilityLimitTesting"+prevCounter);
		rowElement.find("td.measurementUncertaintyTesting"+i).removeClass("measurementUncertaintyTesting"+i).addClass("measurementUncertaintyTesting"+prevCounter);
	    rowElement.find("#scopeForAccreditationDeleteDataTab").attr('onclick', 'scopeForAccreditationDeleteData(' +prevCounter+ ')');
	    rowElement.find("#scopeForAccreditationEditTab").attr('onclick', 'scopeForAccreditationEditTab(' +prevCounter+ ')');
	  }
}
function addActivityPerformedLocDetail(){
	activityPerformedLocVal = $("#activityPerformedLocVal").val();
	 numberTesting = $("#numberTesting").val();
	 applicationActivityAddressTesting = $("#applicationActivityAddressTesting").val();
	 activityPerformedTesting = $("#activityPerformedTesting").val();
	 contactDetailsTesting = $("#contactDetailsTesting").val();
	 if(numberTesting != "" || applicationActivityAddressTesting !="" || activityPerformedTesting !="" || contactDetailsTesting !=""){
		$(".addActivityPerformedLocDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addActivityPerformedTestingLocUrl}",
			data : {
				"<portlet:namespace/>activityPerformedLocVal" : activityPerformedLocVal,
			},
			async:false,
			success : function(data) {
				$(".addActivityPerformedLocDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);

					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".numberTesting" + activityPerformedLocVal).append(numberTesting);
				$(".applicationActivityAddressTesting" + activityPerformedLocVal).append(applicationActivityAddressTesting);
				$(".activityPerformedTesting" + activityPerformedLocVal).append(activityPerformedTesting);
				$(".contactDetailsTesting" + activityPerformedLocVal).append(contactDetailsTesting);
				addActivityPerformedLocDetailData("");
				activityPerformedLocVal++;
				$("#activityPerformedLocVal").val(activityPerformedLocVal);
				$("#numberTesting").val("");
				$("#applicationActivityAddressTesting").val("");
				$("#activityPerformedTesting").val("");
				$("#contactDetailsTesting").val("");
			}
		});
	}else{
		$("#numberTesting").focus();
	}
}
function activityPerformedLocEditTab(activityPerformedLocVal){
	$(".editActivityPerformedLocEditTabPopup").modal("show");
	$(".editNumberTesting").attr("id" , "editNumberTesting"+activityPerformedLocVal);
	$(".editApplicationActivityAddressTesting").attr("id" , "editApplicationActivityAddressTesting"+activityPerformedLocVal);
	$(".editActivityPerformedTesting").attr("id" , "editActivityPerformedTesting"+activityPerformedLocVal);
	$(".editContactDetailsTesting").attr("id" , "editContactDetailsTesting"+activityPerformedLocVal);
	numberTesting = $(".numberTesting"+activityPerformedLocVal+":first").text().trim();
	applicationActivityAddressTesting = $(".applicationActivityAddressTesting"+activityPerformedLocVal+":first").text().trim();
	activityPerformedTesting = $(".activityPerformedTesting"+activityPerformedLocVal+":first").text().trim();
	contactDetailsTesting = $(".contactDetailsTesting"+activityPerformedLocVal+":first").text().trim();
	$("#editNumberTesting"+activityPerformedLocVal).val(numberTesting);
	$("#editApplicationActivityAddressTesting"+activityPerformedLocVal).val(applicationActivityAddressTesting);
	$("#editActivityPerformedTesting"+activityPerformedLocVal).val(activityPerformedTesting);
	$("#editContactDetailsTesting"+activityPerformedLocVal).val(contactDetailsTesting);
	$(".saveEditActivityPerformedLocPopupDataBtn").attr("onclick" , "activityPerformedLocEditDataTab("+activityPerformedLocVal+")");
}
function activityPerformedLocEditDataTab(activityPerformedLocVal){
	addActivityPerformedLocDetailData(activityPerformedLocVal);
	$(".numberTesting" + activityPerformedLocVal).html($("#editNumberTesting"+activityPerformedLocVal).val());
	$(".applicationActivityAddressTesting" + activityPerformedLocVal).html($("#editApplicationActivityAddressTesting"+activityPerformedLocVal).val());
	$(".activityPerformedTesting" + activityPerformedLocVal).html($("#editActivityPerformedTesting"+activityPerformedLocVal).val());
	$(".contactDetailsTesting" + activityPerformedLocVal).html($("#editContactDetailsTesting"+activityPerformedLocVal).val());
	$(".editNumberTesting").val("");
	$(".editApplicationActivityAddressTesting").val("");
	$(".editActivityPerformedTesting").val("");
	$(".editContactDetailsTesting").val("");
}
function activityPerformedLocDeleteData(activityPerformedLocValData) {
	  var activityPerformedLocCountCounter = $("#activityPerformedLocVal").val();
	  $("#activityPerformedLocVal").val(activityPerformedLocCountCounter - 1);
	  var delRowElement = $(".activity-performed-loc-row" + activityPerformedLocValData); 
	  delRowElement.remove();
	  var j = parseInt(activityPerformedLocValData) + 1;
	  for (var i = j; i <= activityPerformedLocCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".activity-performed-loc-row" + i);
	    rowElement.attr("class", "activity-performed-loc-row" + prevCounter);
	    rowElement.find("td.numberTesting"+i).removeClass("numberTesting"+i).addClass("numberTesting"+prevCounter);
	    rowElement.find("td.applicationActivityAddressTesting"+i).removeClass("applicationActivityAddressTesting"+i).addClass("applicationActivityAddressTesting"+prevCounter);
		rowElement.find("td.activityPerformedTesting"+i).removeClass("activityPerformedTesting"+i).addClass("activityPerformedTesting"+prevCounter);
		rowElement.find("td.contactDetailsTesting"+i).removeClass("contactDetailsTesting"+i).addClass("contactDetailsTesting"+prevCounter);
	    rowElement.find("#activityPerformedLocDeleteDataTab").attr('onclick', 'activityPerformedLocDeleteData(' +prevCounter+ ')');
	    rowElement.find("#activityPerformedLocEditTab").attr('onclick', 'activityPerformedLocEditTab(' +prevCounter+ ')');
	  }
}
function addMajorEquipmentTestingDetail(){
	majorEquipmentTestingVal = $("#majorEquipmentTestingVal").val();
	 inventoryTesting = $("#inventoryTesting").val();
	 itemTesting = $("#itemTesting").val();
	 manufacturerTesting = $("#manufacturerTesting").val();
	 modelTesting = $("#modelTesting").val();
	 calibrationIntervalTesting = $("#calibrationIntervalTesting").val();
	 calibratedByTesting = $("#calibratedByTesting").val();
	 if(inventoryTesting != "" || itemTesting !="" || manufacturerTesting !="" || modelTesting !="" || calibrationIntervalTesting !="" || calibratedByTesting !=""){
		$(".addMajorEquipmentTestingDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addMajorEquipmentTestingUrl}",
			data : {
				"<portlet:namespace/>majorEquipmentTestingVal" : majorEquipmentTestingVal,
			},
			async:false,
			success : function(data) {
				$(".addMajorEquipmentTestingDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".inventoryTesting" + majorEquipmentTestingVal).append(inventoryTesting);
				$(".itemTesting" + majorEquipmentTestingVal).append(itemTesting);
				$(".manufacturerTesting" + majorEquipmentTestingVal).append(manufacturerTesting);
				$(".modelTesting" + majorEquipmentTestingVal).append(modelTesting);
				$(".calibrationIntervalTesting" + majorEquipmentTestingVal).append(calibrationIntervalTesting);
				$(".calibratedByTesting" + majorEquipmentTestingVal).append(calibratedByTesting);
				addMajorEquipmentTestingDetailData("");
				majorEquipmentTestingVal++;
				$("#majorEquipmentTestingVal").val(majorEquipmentTestingVal);
				$("#inventoryTesting").val("");
				$("#itemTesting").val("");
				$("#manufacturerTesting").val("");
				$("#modelTesting").val("");
				$("#calibrationIntervalTesting").val("");
				$("#calibratedByTesting").val("");
			}
		});
	}else{
		$("#inventoryTesting").focus();
	}
}
function majorEquipmentTestingEditTab(majorEquipmentTestingVal){
	$(".editMajorEquipmentTestingEditTabPopup").modal("show");
	$(".editInventoryTesting").attr("id" , "editInventoryTesting"+majorEquipmentTestingVal);
	$(".editItemTesting").attr("id" , "editItemTesting"+majorEquipmentTestingVal);
	$(".editManufacturerTesting").attr("id" , "editManufacturerTesting"+majorEquipmentTestingVal);
	$(".editModelTesting").attr("id" , "editModelTesting"+majorEquipmentTestingVal);
	$(".editCalibrationIntervalTesting").attr("id" , "editCalibrationIntervalTesting"+majorEquipmentTestingVal);
	$(".editCalibratedByTesting").attr("id" , "editCalibratedByTesting"+majorEquipmentTestingVal);
	inventoryTesting = $(".inventoryTesting"+majorEquipmentTestingVal+":first").text().trim();
	itemTesting = $(".itemTesting"+majorEquipmentTestingVal+":first").text().trim();
	manufacturerTesting = $(".manufacturerTesting"+majorEquipmentTestingVal+":first").text().trim();
	modelTesting = $(".modelTesting"+majorEquipmentTestingVal+":first").text().trim();
	calibrationIntervalTesting = $(".calibrationIntervalTesting"+majorEquipmentTestingVal+":first").text().trim();
	calibratedByTesting = $(".calibratedByTesting"+majorEquipmentTestingVal+":first").text().trim();
	$("#editInventoryTesting"+majorEquipmentTestingVal).val(inventoryTesting);
	$("#editItemTesting"+majorEquipmentTestingVal).val(itemTesting);
	$("#editManufacturerTesting"+majorEquipmentTestingVal).val(manufacturerTesting);
	$("#editModelTesting"+majorEquipmentTestingVal).val(modelTesting);
	$("#editCalibrationIntervalTesting"+majorEquipmentTestingVal).val(calibrationIntervalTesting);
	$("#editCalibratedByTesting"+majorEquipmentTestingVal).val(calibratedByTesting);
	$(".saveEditMajorEquipmentTestingPopupDataBtn").attr("onclick" , "majorEquipmentTestingEditDataTab("+majorEquipmentTestingVal+")");
}
function majorEquipmentTestingEditDataTab(majorEquipmentTestingVal){
	addMajorEquipmentTestingDetailData(majorEquipmentTestingVal);
	$(".inventoryTesting" + majorEquipmentTestingVal).html($("#editInventoryTesting"+majorEquipmentTestingVal).val());
	$(".itemTesting" + majorEquipmentTestingVal).html($("#editItemTesting"+majorEquipmentTestingVal).val());
	$(".manufacturerTesting" + majorEquipmentTestingVal).html($("#editManufacturerTesting"+majorEquipmentTestingVal).val());
	$(".modelTesting" + majorEquipmentTestingVal).html($("#editModelTesting"+majorEquipmentTestingVal).val());
	$(".calibrationIntervalTesting" + majorEquipmentTestingVal).html($("#editCalibrationIntervalTesting"+majorEquipmentTestingVal).val());
	$(".calibratedByTesting" + majorEquipmentTestingVal).html($("#editCalibratedByTesting"+majorEquipmentTestingVal).val());
	$(".editInventoryTesting").val("");
	$(".editItemTesting").val("");
	$(".editManufacturerTesting").val("");
	$(".editModelTesting").val("");
	$(".editCalibrationIntervalTesting").val("");
	$(".editCalibratedByTesting").val("");
}
function majorEquipmentTestingDeleteData(majorEquipmentTestingValData) {
	  var majorEquipmentTestingCountCounter = $("#majorEquipmentTestingVal").val();
	  $("#majorEquipmentTestingVal").val(majorEquipmentTestingCountCounter - 1);
	  var delRowElement = $(".major-equipment-testing-row" + majorEquipmentTestingValData); 
	  delRowElement.remove();
	  var j = parseInt(majorEquipmentTestingValData) + 1;
	  for (var i = j; i <= majorEquipmentTestingCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".major-equipment-testing-row" + i);
	    rowElement.attr("class", "major-equipment-testing-row" + prevCounter);
	    rowElement.find("td.inventoryTesting"+i).removeClass("inventoryTesting"+i).addClass("inventoryTesting"+prevCounter);
	    rowElement.find("td.itemTesting"+i).removeClass("itemTesting"+i).addClass("itemTesting"+prevCounter);
		rowElement.find("td.manufacturerTesting"+i).removeClass("manufacturerTesting"+i).addClass("manufacturerTesting"+prevCounter);
		rowElement.find("td.modelTesting"+i).removeClass("modelTesting"+i).addClass("modelTesting"+prevCounter);
	    rowElement.find("td.calibrationIntervalTesting"+i).removeClass("calibrationIntervalTesting"+i).addClass("calibrationIntervalTesting"+prevCounter);
		rowElement.find("td.calibratedByTesting"+i).removeClass("calibratedByTesting"+i).addClass("calibratedByTesting"+prevCounter);
	    rowElement.find("#majorEquipmentTestingDeleteDataTab").attr('onclick', 'majorEquipmentTestingDeleteData(' +prevCounter+ ')');
	    rowElement.find("#majorEquipmentTestingEditTab").attr('onclick', 'majorEquipmentTestingEditTab(' +prevCounter+ ')');
	  }
}
function addPersonnelResponsibleCalibrationDetail(){
	personnelResponsibleCalibrationVal = $("#personnelResponsibleCalibrationVal").val();
	 technicalPersonnelNameCalibration = $("#technicalPersonnelNameCalibration").val();
	 technicalPersonnelEmailCalibration = $("#technicalPersonnelEmailCalibration").val();
	 if(technicalPersonnelNameCalibration != "" || technicalPersonnelEmailCalibration !=""){
		$(".addPersonnelResponsibleCalibrationDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addPersonnelResponsibleCalibrationUrl}",
			data : {
				"<portlet:namespace/>personnelResponsibleCalibrationVal" : personnelResponsibleCalibrationVal,
			},
			async:false,
			success : function(data) {
				$(".addPersonnelResponsibleCalibrationDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".technicalPersonnelNameCalibration" + personnelResponsibleCalibrationVal).append(technicalPersonnelNameCalibration);
				$(".technicalPersonnelEmailCalibration" + personnelResponsibleCalibrationVal).append(technicalPersonnelEmailCalibration);
				addPersonnelResponsibleCalibrationDetailData("");
				personnelResponsibleCalibrationVal++;
				$("#personnelResponsibleCalibrationVal").val(personnelResponsibleCalibrationVal);
				$("#technicalPersonnelNameCalibration").val("");
				$("#technicalPersonnelEmailCalibration").val("");
			}
		});
	}else{
		$("#technicalPersonnelNameCalibration").focus();
	}
}
function personnelResponsibleCalibrationEditTab(personnelResponsibleCalibrationVal){
	$(".editPersonnelResponsibleCalibrationEditTabPopup").modal("show");
	$(".editTechnicalPersonnelNameCalibration").attr("id" , "editTechnicalPersonnelNameCalibration"+personnelResponsibleCalibrationVal);
	$(".editTechnicalPersonnelEmailCalibration").attr("id" , "editTechnicalPersonnelEmailCalibration"+personnelResponsibleCalibrationVal);
	technicalPersonnelNameCalibration = $(".technicalPersonnelNameCalibration"+personnelResponsibleCalibrationVal+":first").text().trim();
	technicalPersonnelEmailCalibration = $(".technicalPersonnelEmailCalibration"+personnelResponsibleCalibrationVal+":first").text().trim();
	$("#editTechnicalPersonnelNameCalibration"+personnelResponsibleCalibrationVal).val(technicalPersonnelNameCalibration);
	$("#editTechnicalPersonnelEmailCalibration"+personnelResponsibleCalibrationVal).val(technicalPersonnelEmailCalibration);
	$(".saveEditPersonnelResponsibleCalibrationPopupDataBtn").attr("onclick" , "personnelResponsibleCalibrationEditDataTab("+personnelResponsibleCalibrationVal+")");
}
function personnelResponsibleCalibrationEditDataTab(personnelResponsibleCalibrationVal){
	addPersonnelResponsibleCalibrationDetailData(personnelResponsibleCalibrationVal);
	$(".technicalPersonnelNameCalibration" + personnelResponsibleCalibrationVal).html($("#editTechnicalPersonnelNameCalibration"+personnelResponsibleCalibrationVal).val());
	$(".technicalPersonnelEmailCalibration" + personnelResponsibleCalibrationVal).html($("#editTechnicalPersonnelEmailCalibration"+personnelResponsibleCalibrationVal).val());
	$(".editTechnicalPersonnelNameCalibration").val("");
	$(".editTechnicalPersonnelEmailCalibration").val("");
}
function personnelResponsibleCalibrationDeleteData(personnelResponsibleCalibrationValData) {
	  var personnelResponsibleCalibrationCountCounter = $("#personnelResponsibleCalibrationVal").val();
	  $("#personnelResponsibleCalibrationVal").val(personnelResponsibleCalibrationCountCounter - 1);
	  var delRowElement = $(".personnel-responsible-calibration-row" + personnelResponsibleCalibrationValData); 
	  delRowElement.remove();
	  var j = parseInt(personnelResponsibleCalibrationValData) + 1;
	  for (var i = j; i <= personnelResponsibleCalibrationCountCounter; i++) {
		var prevCounter = i - 1;
		var rowElement = $(".personnel-responsible-calibration-row" + i);
		rowElement.attr("class", "personnel-responsible-calibration-row" + prevCounter);
		rowElement.find("td.technicalPersonnelNameCalibration"+i).removeClass("technicalPersonnelNameCalibration"+i).addClass("technicalPersonnelNameCalibration"+prevCounter);
		rowElement.find("td.technicalPersonnelEmailCalibration"+i).removeClass("technicalPersonnelEmailCalibration"+i).addClass("technicalPersonnelEmailCalibration"+prevCounter);
		rowElement.find("#personnelResponsibleCalibrationDeleteDataTab").attr('onclick', 'personnelResponsibleCalibrationDeleteData(' +prevCounter+ ')');
		rowElement.find("#personnelResponsibleCalibrationEditTab").attr('onclick', 'personnelResponsibleCalibrationEditTab(' +prevCounter+ ')');
	  }
}
function addStaffDetailCalibration(){
	staffDetailCalibrationVal = $("#staffDetailCalibrationVal").val();
	
	 staffNameCalibration = $("#staffNameCalibration").val();
	 jobTitleCalibration = $("#jobTitleCalibration").val();
	 majorResponsibilitiesCalibration = $("#majorResponsibilitiesCalibration").val();
	 analystsInvolveCalibration = $("#analystsInvolveCalibration").val();
	 if(staffNameCalibration != "" || jobTitleCalibration !="" || majorResponsibilitiesCalibration !="" || analystsInvolveCalibration !=""){
		$(".addStaffDetailCalibrationTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addStaffDetailCalibrationUrl}",
			data : {
				"<portlet:namespace/>staffDetailCalibrationVal" : staffDetailCalibrationVal,
			},
			async:false,
			success : function(data) {
				$(".addStaffDetailCalibrationTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);

					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".staffNameCalibration" + staffDetailCalibrationVal).append(staffNameCalibration);
				$(".jobTitleCalibration" + staffDetailCalibrationVal).append(jobTitleCalibration);
				$(".majorResponsibilitiesCalibration" + staffDetailCalibrationVal).append(majorResponsibilitiesCalibration);
				$(".analystsInvolveCalibration" + staffDetailCalibrationVal).append(analystsInvolveCalibration);
				addStaffDetailCalibrationData("");
				staffDetailCalibrationVal++;
				$("#staffDetailCalibrationVal").val(staffDetailCalibrationVal);
				$("#staffNameCalibration").val("");
				$("#jobTitleCalibration").val("");
				$("#majorResponsibilitiesCalibration").val("");
				$("#analystsInvolveCalibration").val("");
			}
		});
	}else{
		$("#staffNameCalibration").focus();
	}
}
function staffDetailCalibrationEditTab(staffDetailCalibrationVal){
	$(".editStaffDetailCalibrationEditTabPopup").modal("show");
	$(".editStaffNameCalibration").attr("id" , "editStaffNameCalibration"+staffDetailCalibrationVal);
	$(".editJobTitleCalibration").attr("id" , "editJobTitleCalibration"+staffDetailCalibrationVal);
	$(".editMajorResponsibilitiesCalibration").attr("id" , "editMajorResponsibilitiesCalibration"+staffDetailCalibrationVal);
	$(".editAnalystsInvolveCalibration").attr("id" , "editAnalystsInvolveCalibration"+staffDetailCalibrationVal);
	staffNameCalibration = $(".staffNameCalibration"+staffDetailCalibrationVal+":first").text().trim();
	jobTitleCalibration = $(".jobTitleCalibration"+staffDetailCalibrationVal+":first").text().trim();
	majorResponsibilitiesCalibration = $(".majorResponsibilitiesCalibration"+staffDetailCalibrationVal+":first").text().trim();
	analystsInvolveCalibration = $(".analystsInvolveCalibration"+staffDetailCalibrationVal+":first").text().trim();
	$("#editStaffNameCalibration"+staffDetailCalibrationVal).val(staffNameCalibration);
	$("#editJobTitleCalibration"+staffDetailCalibrationVal).val(jobTitleCalibration);
	$("#editMajorResponsibilitiesCalibration"+staffDetailCalibrationVal).val(majorResponsibilitiesCalibration);
	$("#editAnalystsInvolveCalibration"+staffDetailCalibrationVal).val(analystsInvolveCalibration);
	$(".saveEditStaffDetailCalibrationPopupDataBtn").attr("onclick" , "staffDetailCalibrationEditDataTab("+staffDetailCalibrationVal+")");
}
function staffDetailCalibrationEditDataTab(staffDetailCalibrationVal){
	addStaffDetailCalibrationData(staffDetailCalibrationVal);
	addStaffDetailCalibrationData(staffDetailCalibrationVal);
	$(".staffNameCalibration" + staffDetailCalibrationVal).html($("#editStaffNameCalibration"+staffDetailCalibrationVal).val());
	$(".jobTitleCalibration" + staffDetailCalibrationVal).html($("#editJobTitleCalibration"+staffDetailCalibrationVal).val());
	$(".majorResponsibilitiesCalibration" + staffDetailCalibrationVal).html($("#editMajorResponsibilitiesCalibration"+staffDetailCalibrationVal).val());
	$(".analystsInvolveCalibration" + staffDetailCalibrationVal).html($("#editAnalystsInvolveCalibration"+staffDetailCalibrationVal).val());
	$(".editStaffNameCalibration").val("");
	$(".editJobTitleCalibration").val("");
	$(".editMajorResponsibilitiesCalibration").val("");
	$(".editAnalystsInvolveCalibration").val("");
}
function staffDetailCalibrationDeleteData(staffDetailCalibrationValData) {
	  var staffDetailCalibrationCountCounter = $("#staffDetailCalibrationVal").val();
	  $("#staffDetailCalibrationVal").val(staffDetailCalibrationCountCounter - 1);
	  var delRowElement = $(".staff-detail-calibration-row" + staffDetailCalibrationValData); 
	  delRowElement.remove();
	  var j = parseInt(staffDetailCalibrationValData) + 1;
	  for (var i = j; i <= staffDetailCalibrationCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".staff-detail-calibration-row" + i);
	    rowElement.attr("class", "staff-detail-calibration-row" + prevCounter);
	    rowElement.find("td.staffNameCalibration"+i).removeClass("staffNameCalibration"+i).addClass("staffNameCalibration"+prevCounter);
	    rowElement.find("td.jobTitleCalibration"+i).removeClass("jobTitleCalibration"+i).addClass("jobTitleCalibration"+prevCounter);
		rowElement.find("td.majorResponsibilitiesCalibration"+i).removeClass("majorResponsibilitiesCalibration"+i).addClass("majorResponsibilitiesCalibration"+prevCounter);
		rowElement.find("td.analystsInvolveCalibration"+i).removeClass("analystsInvolveCalibration"+i).addClass("analystsInvolveCalibration"+prevCounter);
	    rowElement.find("#staffDetailCalibrationDeleteDataTab").attr('onclick', 'staffDetailCalibrationDeleteData(' +prevCounter+ ')');
	    rowElement.find("#staffDetailCalibrationEditTab").attr('onclick', 'staffDetailCalibrationEditTab(' +prevCounter+ ')');
	  }
}
function addScopeForCalibrationsDetail(){
	 scopeForCalibrationsVal = $("#scopeForCalibrationsVal").val();
	 numCalibration = $("#numCalibration").val();
	 qualificationCalibration = $("#qualificationCalibration").val();
	 itemCalibration = $("#itemCalibration").val();
	 rangeCalibration = $("#rangeCalibration").val();
	 measurementProcedureCalibration = $("#measurementProcedureCalibration").val();
	 measurementCalibration = $("#measurementCalibration").val();
	 remarksCalibration = $("#remarksCalibration").val();
	 if(numCalibration != "" || qualificationCalibration !="" || itemCalibration !="" || rangeCalibration !="" || measurementProcedureCalibration !="" || measurementCalibration !="" || remarksCalibration != ""){
		$(".addScopeForCalibrationsDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addScopeForAccreditationCalibrationUrl}",
			data : {
				"<portlet:namespace/>scopeForCalibrationsVal" : scopeForCalibrationsVal,
			},
			async:false,
			success : function(data) {
				$(".addScopeForCalibrationsDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);

					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".numCalibration" + scopeForCalibrationsVal).append(numCalibration);
				$(".qualificationCalibration" + scopeForCalibrationsVal).append(qualificationCalibration);
				$(".itemCalibration" + scopeForCalibrationsVal).append(itemCalibration);
				$(".rangeCalibration" + scopeForCalibrationsVal).append(rangeCalibration);
				$(".measurementProcedureCalibration" + scopeForCalibrationsVal).append(measurementProcedureCalibration);
				$(".measurementCalibration" + scopeForCalibrationsVal).append(measurementCalibration);
				$(".remarksCalibration" + scopeForCalibrationsVal).append(remarksCalibration);
				addScopeForCalibrationsDetailData("");
				scopeForCalibrationsVal++;
				$("#scopeForCalibrationsVal").val(scopeForCalibrationsVal);
				$("#numCalibration").val("");
				$("#qualificationCalibration").val("");
				$("#itemCalibration").val("");
				$("#rangeCalibration").val("");
				$("#measurementProcedureCalibration").val("");
				$("#measurementCalibration").val("");
				$("#remarksCalibration").val("");
			}
		});
	}else{
		$("#numCalibration").focus();
	}
}
function scopeForCalibrationsEditTab(scopeForCalibrationsVal){
	$(".editScopeForCalibrationsEditTabPopup").modal("show");
	$(".editNumCalibration").attr("id" , "editNumCalibration"+scopeForCalibrationsVal);
	$(".editQualificationCalibration").attr("id" , "editQualificationCalibration"+scopeForCalibrationsVal);
	$(".editItemCalibration").attr("id" , "editItemCalibration"+scopeForCalibrationsVal);
	$(".editRangeCalibration").attr("id" , "editRangeCalibration"+scopeForCalibrationsVal);
	$(".editMeasurementProcedureCalibration").attr("id" , "editMeasurementProcedureCalibration"+scopeForCalibrationsVal);
	$(".editMeasurementCalibration").attr("id" , "editMeasurementCalibration"+scopeForCalibrationsVal);
	$(".editRemarksCalibration").attr("id" , "editRemarksCalibration"+scopeForCalibrationsVal);
	numCalibration = $(".numCalibration"+scopeForCalibrationsVal+":first").text().trim();
	qualificationCalibration = $(".qualificationCalibration"+scopeForCalibrationsVal+":first").text().trim();
	itemCalibration = $(".itemCalibration"+scopeForCalibrationsVal+":first").text().trim();
	rangeCalibration = $(".rangeCalibration"+scopeForCalibrationsVal+":first").text().trim();
	measurementProcedureCalibration = $(".measurementProcedureCalibration"+scopeForCalibrationsVal+":first").text().trim();
	measurementCalibration = $(".measurementCalibration"+scopeForCalibrationsVal+":first").text().trim();
	remarksCalibration = $(".remarksCalibration"+scopeForCalibrationsVal+":first").text().trim();
	$("#editNumCalibration"+scopeForCalibrationsVal).val(numCalibration);
	$("#editQualificationCalibration"+scopeForCalibrationsVal).val(qualificationCalibration);
	$("#editItemCalibration"+scopeForCalibrationsVal).val(itemCalibration);
	$("#editRangeCalibration"+scopeForCalibrationsVal).val(rangeCalibration);
	$("#editMeasurementProcedureCalibration"+scopeForCalibrationsVal).val(measurementProcedureCalibration);
	$("#editMeasurementCalibration"+scopeForCalibrationsVal).val(measurementCalibration);
	$("#editRemarksCalibration"+scopeForCalibrationsVal).val(remarksCalibration);
	$(".saveEditScopeForCalibrationsPopupDataBtn").attr("onclick" , "scopeForCalibrationsEditDataTab("+scopeForCalibrationsVal+")");
}
function scopeForCalibrationsEditDataTab(scopeForCalibrationsVal){
	addScopeForCalibrationsDetailData(scopeForCalibrationsVal);
	$(".numCalibration" + scopeForCalibrationsVal).html($("#editNumCalibration"+scopeForCalibrationsVal).val());
	$(".qualificationCalibration" + scopeForCalibrationsVal).html($("#editQualificationCalibration"+scopeForCalibrationsVal).val());
	$(".itemCalibration" + scopeForCalibrationsVal).html($("#editItemCalibration"+scopeForCalibrationsVal).val());
	$(".rangeCalibration" + scopeForCalibrationsVal).html($("#editRangeCalibration"+scopeForCalibrationsVal).val());
	$(".measurementProcedureCalibration" + scopeForCalibrationsVal).html($("#editMeasurementProcedureCalibration"+scopeForCalibrationsVal).val());
	$(".measurementCalibration" + scopeForCalibrationsVal).html($("#editMeasurementCalibration"+scopeForCalibrationsVal).val());
	$(".remarksCalibration" + scopeForCalibrationsVal).html($("#editRemarksCalibration"+scopeForCalibrationsVal).val());
	$(".editNumCalibration").val("");
	$(".editQualificationCalibration").val("");
	$(".editItemCalibration").val("");
	$(".editRangeCalibration").val("");
	$(".editMeasurementProcedureCalibration").val("");
	$(".editMeasurementCalibration").val("");
	$(".editRemarksCalibration").val("");
}
function scopeForCalibrationsDeleteData(scopeForCalibrationsValData) {
	  var scopeForCalibrationsCountCounter = $("#scopeForCalibrationsVal").val();
	  $("#scopeForCalibrationsVal").val(scopeForCalibrationsCountCounter - 1);
	  var delRowElement = $(".scope-accreditation-calibration-row" + scopeForCalibrationsValData); 
	  delRowElement.remove();
	  var j = parseInt(scopeForCalibrationsValData) + 1;
	  for (var i = j; i <= scopeForCalibrationsCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".scope-accreditation-calibration-row" + i);
	    rowElement.attr("class", "scope-accreditation-calibration-row" + prevCounter);
	    rowElement.find("td.numCalibration"+i).removeClass("numCalibration"+i).addClass("numCalibration"+prevCounter);
	    rowElement.find("td.qualificationCalibration"+i).removeClass("qualificationCalibration"+i).addClass("qualificationCalibration"+prevCounter);
		rowElement.find("td.itemCalibration"+i).removeClass("itemCalibration"+i).addClass("itemCalibration"+prevCounter);
		rowElement.find("td.rangeCalibration"+i).removeClass("rangeCalibration"+i).addClass("rangeCalibration"+prevCounter);
	    rowElement.find("td.measurementProcedureCalibration"+i).removeClass("measurementProcedureCalibration"+i).addClass("measurementProcedureCalibration"+prevCounter);
		rowElement.find("td.measurementCalibration"+i).removeClass("measurementCalibration"+i).addClass("measurementCalibration"+prevCounter);
		rowElement.find("td.remarksCalibration"+i).removeClass("remarksCalibration"+i).addClass("remarksCalibration"+prevCounter);
	    rowElement.find("#scopeForCalibrationsDeleteDataTab").attr('onclick', 'scopeForCalibrationsDeleteData(' +prevCounter+ ')');
	    rowElement.find("#scopeForCalibrationsEditTab").attr('onclick', 'scopeForCalibrationsEditTab(' +prevCounter+ ')');
	  }
}
function addActivityPerformedLocCalibrationDetail(){
	 activityPerformedLocCalibrationVal = $("#activityPerformedLocCalibrationVal").val();
	 numberCalibration = $("#numberCalibration").val();
	 applicationActivityAddressCalibration = $("#applicationActivityAddressCalibration").val();
	 activityPerformedCalibration = $("#activityPerformedCalibration").val();
	 contactDetailsCalibration = $("#contactDetailsCalibration").val();
	 if(numberCalibration != "" || applicationActivityAddressCalibration !="" || activityPerformedCalibration !="" || contactDetailsCalibration !=""){
		$(".addActivityPerformedLocCalibrationDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addActivityPerformedLocCalibrationUrl}",
			data : {
				"<portlet:namespace/>activityPerformedLocCalibrationVal" : activityPerformedLocCalibrationVal,
			},
			async:false,
			success : function(data) {
				$(".addActivityPerformedLocCalibrationDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);

					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".numberCalibration" + activityPerformedLocCalibrationVal).append(numberCalibration);
				$(".applicationActivityAddressCalibration" + activityPerformedLocCalibrationVal).append(applicationActivityAddressCalibration);
				$(".activityPerformedCalibration" + activityPerformedLocCalibrationVal).append(activityPerformedCalibration);
				$(".contactDetailsCalibration" + activityPerformedLocCalibrationVal).append(contactDetailsCalibration);
				addActivityPerformedLocCalibrationDetailData("");
				activityPerformedLocCalibrationVal++;
				$("#activityPerformedLocCalibrationVal").val(activityPerformedLocCalibrationVal);
				$("#numberCalibration").val("");
				$("#applicationActivityAddressCalibration").val("");
				$("#activityPerformedCalibration").val("");
				$("#contactDetailsCalibration").val("");
			}
		});
	}else{
		$("#numberCalibration").focus();
	}
}
function activityPerformedLocCalEditTab(activityPerformedLocCalibrationVal){
	$(".editActivityPerformedLocCalEditTabPopup").modal("show");
	$(".editNumberCalibration").attr("id" , "editNumberCalibration"+activityPerformedLocCalibrationVal);
	$(".editApplicationActivityAddressCalibration").attr("id" , "editApplicationActivityAddressCalibration"+activityPerformedLocCalibrationVal);
	$(".editActivityPerformedCalibration").attr("id" , "editActivityPerformedCalibration"+activityPerformedLocCalibrationVal);
	$(".editContactDetailsCalibration").attr("id" , "editContactDetailsCalibration"+activityPerformedLocCalibrationVal);
	numberCalibration = $(".numberCalibration"+activityPerformedLocCalibrationVal+":first").text().trim();
	applicationActivityAddressCalibration = $(".applicationActivityAddressCalibration"+activityPerformedLocCalibrationVal+":first").text().trim();
	activityPerformedCalibration = $(".activityPerformedCalibration"+activityPerformedLocCalibrationVal+":first").text().trim();
	contactDetailsCalibration = $(".contactDetailsCalibration"+activityPerformedLocCalibrationVal+":first").text().trim();
	$("#editNumberCalibration"+activityPerformedLocCalibrationVal).val(numberCalibration);
	$("#editApplicationActivityAddressCalibration"+activityPerformedLocCalibrationVal).val(applicationActivityAddressCalibration);
	$("#editActivityPerformedCalibration"+activityPerformedLocCalibrationVal).val(activityPerformedCalibration);
	$("#editContactDetailsCalibration"+activityPerformedLocCalibrationVal).val(contactDetailsCalibration);
	$(".saveEditActivityPerformedLocCalPopupDataBtn").attr("onclick" , "activityPerformedLocCalEditDataTab("+activityPerformedLocCalibrationVal+")");
}
function activityPerformedLocCalEditDataTab(activityPerformedLocCalibrationVal){
	addActivityPerformedLocCalibrationDetailData(activityPerformedLocCalibrationVal);
	$(".numberCalibration" + activityPerformedLocCalibrationVal).html($("#editNumberCalibration"+activityPerformedLocCalibrationVal).val());
	$(".applicationActivityAddressCalibration" + activityPerformedLocCalibrationVal).html($("#editApplicationActivityAddressCalibration"+activityPerformedLocCalibrationVal).val());
	$(".activityPerformedCalibration" + activityPerformedLocCalibrationVal).html($("#editActivityPerformedCalibration"+activityPerformedLocCalibrationVal).val());
	$(".contactDetailsCalibration" + activityPerformedLocCalibrationVal).html($("#editContactDetailsCalibration"+activityPerformedLocCalibrationVal).val());
	$(".editNumberCalibration").val("");
	$(".editApplicationActivityAddressCalibration").val("");
	$(".editActivityPerformedCalibration").val("");
	$(".editContactDetailsCalibration").val("");
}
function activityPerformedLocCalDeleteData(activityPerformedLocCalibrationValData) {
	  var activityPerformedLocCalCountCounter = $("#activityPerformedLocCalibrationVal").val();
	  $("#activityPerformedLocCalibrationVal").val(activityPerformedLocCalCountCounter - 1);
	  var delRowElement = $(".activity-performed-loc-cal-row" + activityPerformedLocCalibrationValData); 
	  delRowElement.remove();
	  var j = parseInt(activityPerformedLocCalibrationValData) + 1;
	  for (var i = j; i <= activityPerformedLocCalCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".activity-performed-loc-cal-row" + i);
	    rowElement.attr("class", "activity-performed-loc-cal-row" + prevCounter);
	    rowElement.find("td.numberCalibration"+i).removeClass("numberCalibration"+i).addClass("numberCalibration"+prevCounter);
	    rowElement.find("td.applicationActivityAddressCalibration"+i).removeClass("applicationActivityAddressCalibration"+i).addClass("applicationActivityAddressCalibration"+prevCounter);
		rowElement.find("td.activityPerformedCalibration"+i).removeClass("activityPerformedCalibration"+i).addClass("activityPerformedCalibration"+prevCounter);
		rowElement.find("td.contactDetailsCalibration"+i).removeClass("contactDetailsCalibration"+i).addClass("contactDetailsCalibration"+prevCounter);
	    rowElement.find("#activityPerformedLocCalDeleteDataTab").attr('onclick', 'activityPerformedLocCalDeleteData(' +prevCounter+ ')');
	    rowElement.find("#activityPerformedLocCalEditTab").attr('onclick', 'activityPerformedLocCalEditTab(' +prevCounter+ ')');
	  }
}

function addMajorEquipmentCalibrationDetail(){
	majorEquipmentCalibrationVal = $("#majorEquipmentCalibrationVal").val();
	 inventoryCalibration = $("#inventoryCalibration").val();
	 itemEquipmentCalibration = $("#itemEquipmentCalibration").val();
	 manufacturerCalibration = $("#manufacturerCalibration").val();
	 modelCalibration = $("#modelCalibration").val();
	 calibrationIntervalCalibration = $("#calibrationIntervalCalibration").val();
	 calibratedByCalibration = $("#calibratedByCalibration").val();
	 if(inventoryCalibration != "" || itemEquipmentCalibration !="" || manufacturerCalibration !="" || modelCalibration !="" || calibrationIntervalCalibration !="" || calibratedByCalibration !=""){
		$(".addMajorEquipmentCalibrationDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addMajorEquipmentCalibrationUrl}",
			data : {
				"<portlet:namespace/>majorEquipmentCalibrationVal" : majorEquipmentCalibrationVal,
			},
			async:false,
			success : function(data) {
				$(".addMajorEquipmentCalibrationDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".inventoryCalibration" + majorEquipmentCalibrationVal).append(inventoryCalibration);
				$(".itemEquipmentCalibration" + majorEquipmentCalibrationVal).append(itemEquipmentCalibration);
				$(".manufacturerCalibration" + majorEquipmentCalibrationVal).append(manufacturerCalibration);
				$(".modelCalibration" + majorEquipmentCalibrationVal).append(modelCalibration);
				$(".calibrationIntervalCalibration" + majorEquipmentCalibrationVal).append(calibrationIntervalCalibration);
				$(".calibratedByCalibration" + majorEquipmentCalibrationVal).append(calibratedByCalibration);
				addMajorEquipmentCalibrationDetailData("");
				majorEquipmentCalibrationVal++;
				$("#majorEquipmentCalibrationVal").val(majorEquipmentCalibrationVal);
				$("#inventoryCalibration").val("");
				$("#itemEquipmentCalibration").val("");
				$("#manufacturerCalibration").val("");
				$("#modelCalibration").val("");
				$("#calibrationIntervalCalibration").val("");
				$("#calibratedByCalibration").val("");
			}
		});
	}else{
		$("#inventoryCalibration").focus();
	}
}
function majorEquipmentCalibrationEditTab(majorEquipmentCalibrationVal){
	$(".editMajorEquipmentCalibrationEditTabPopup").modal("show");
	$(".editInventoryCalibration").attr("id" , "editInventoryCalibration"+majorEquipmentCalibrationVal);
	$(".editItemEquipmentCalibration").attr("id" , "editItemEquipmentCalibration"+majorEquipmentCalibrationVal);
	$(".editManufacturerCalibration").attr("id" , "editManufacturerCalibration"+majorEquipmentCalibrationVal);
	$(".editModelCalibration").attr("id" , "editModelCalibration"+majorEquipmentCalibrationVal);
	$(".editCalibrationIntervalCalibration").attr("id" , "editCalibrationIntervalCalibration"+majorEquipmentCalibrationVal);
	$(".editCalibratedByCalibration").attr("id" , "editCalibratedByCalibration"+majorEquipmentCalibrationVal);
	inventoryCalibration = $(".inventoryCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	itemEquipmentCalibration = $(".itemEquipmentCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	manufacturerCalibration = $(".manufacturerCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	modelCalibration = $(".modelCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	calibrationIntervalCalibration = $(".calibrationIntervalCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	calibratedByCalibration = $(".calibratedByCalibration"+majorEquipmentCalibrationVal+":first").text().trim();
	$("#editInventoryCalibration"+majorEquipmentCalibrationVal).val(inventoryCalibration);
	$("#editItemEquipmentCalibration"+majorEquipmentCalibrationVal).val(itemEquipmentCalibration);
	$("#editManufacturerCalibration"+majorEquipmentCalibrationVal).val(manufacturerCalibration);
	$("#editModelCalibration"+majorEquipmentCalibrationVal).val(modelCalibration);
	$("#editCalibrationIntervalCalibration"+majorEquipmentCalibrationVal).val(calibrationIntervalCalibration);
	$("#editCalibratedByCalibration"+majorEquipmentCalibrationVal).val(calibratedByCalibration);
	$(".saveEditMajorEquipmentCalibrationPopupDataBtn").attr("onclick" , "majorEquipmentCalibrationEditDataTab("+majorEquipmentCalibrationVal+")");
}
function majorEquipmentCalibrationEditDataTab(majorEquipmentCalibrationVal){
	addMajorEquipmentCalibrationDetailData(majorEquipmentCalibrationVal);
	$(".inventoryCalibration" + majorEquipmentCalibrationVal).html($("#editInventoryCalibration"+majorEquipmentCalibrationVal).val());
	$(".itemEquipmentCalibration" + majorEquipmentCalibrationVal).html($("#editItemEquipmentCalibration"+majorEquipmentCalibrationVal).val());
	$(".manufacturerCalibration" + majorEquipmentCalibrationVal).html($("#editManufacturerCalibration"+majorEquipmentCalibrationVal).val());
	$(".modelCalibration" + majorEquipmentCalibrationVal).html($("#editModelCalibration"+majorEquipmentCalibrationVal).val());
	$(".calibrationIntervalCalibration" + majorEquipmentCalibrationVal).html($("#editCalibrationIntervalCalibration"+majorEquipmentCalibrationVal).val());
	$(".calibratedByCalibration" + majorEquipmentCalibrationVal).html($("#editCalibratedByCalibration"+majorEquipmentCalibrationVal).val());
	$(".editInventoryCalibration").val("");
	$(".editItemEquipmentCalibration").val("");
	$(".editManufacturerCalibration").val("");
	$(".editModelCalibration").val("");
	$(".editCalibrationIntervalCalibration").val("");
	$(".editCalibratedByCalibration").val("");
}
function majorEquipmentCalibrationDeleteData(majorEquipmentCalibrationValData) {
	  var majorEquipmentCalibrationCountCounter = $("#majorEquipmentCalibrationVal").val();
	  $("#majorEquipmentCalibrationVal").val(majorEquipmentCalibrationCountCounter - 1);
	  var delRowElement = $(".major-equipment-calibration-row" + majorEquipmentCalibrationValData); 
	  delRowElement.remove();
	  var j = parseInt(majorEquipmentCalibrationValData) + 1;
	  for (var i = j; i <= majorEquipmentCalibrationCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".major-equipment-calibration-row" + i);
	    rowElement.attr("class", "major-equipment-calibration-row" + prevCounter);
	    rowElement.find("td.inventoryCalibration"+i).removeClass("inventoryCalibration"+i).addClass("inventoryCalibration"+prevCounter);
	    rowElement.find("td.itemEquipmentCalibration"+i).removeClass("itemEquipmentCalibration"+i).addClass("itemEquipmentCalibration"+prevCounter);
		rowElement.find("td.manufacturerCalibration"+i).removeClass("manufacturerCalibration"+i).addClass("manufacturerCalibration"+prevCounter);
		rowElement.find("td.modelCalibration"+i).removeClass("modelCalibration"+i).addClass("modelCalibration"+prevCounter);
	    rowElement.find("td.calibrationIntervalCalibration"+i).removeClass("calibrationIntervalCalibration"+i).addClass("calibrationIntervalCalibration"+prevCounter);
		rowElement.find("td.calibratedByCalibration"+i).removeClass("calibratedByCalibration"+i).addClass("calibratedByCalibration"+prevCounter);
	    rowElement.find("#majorEquipmentCalibrationDeleteDataTab").attr('onclick', 'majorEquipmentCalibrationDeleteData(' +prevCounter+ ')');
	    rowElement.find("#majorEquipmentCalibrationEditTab").attr('onclick', 'majorEquipmentCalibrationEditTab(' +prevCounter+ ')');
	  }
}
function addKeyPersonnelDetails(){
	keyPersonnelDetailsVal = $("#keyPersonnelDetailsVal").val();
	
	 laboratoryPartOfOrgName = $("#laboratoryPartOfOrgName").val();
	 laboratoryPartOfOrgPosition = $("#laboratoryPartOfOrgPosition").val();
	 if(laboratoryPartOfOrgName != "" || laboratoryPartOfOrgPosition !=""){
		$(".addKeyPersonnelDetailsTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addKeyPersonnelDetailsUrl}",
			data : {
				"<portlet:namespace/>keyPersonnelDetailsVal" : keyPersonnelDetailsVal,
			},
			async:false,
			success : function(data) {
				$(".addKeyPersonnelDetailsTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				$(".laboratoryPartOfOrgName" + keyPersonnelDetailsVal).append(laboratoryPartOfOrgName);
				$(".laboratoryPartOfOrgPosition" + keyPersonnelDetailsVal).append(laboratoryPartOfOrgPosition);
				addKeyPersonnelDetailsData("");
				keyPersonnelDetailsVal++;
				$("#keyPersonnelDetailsVal").val(keyPersonnelDetailsVal);
				$("#laboratoryPartOfOrgName").val("");
				$("#laboratoryPartOfOrgPosition").val("");
			}
		});
	}else{
		$("#laboratoryPartOfOrgName").focus();
	}
}
function keyPersonnelEditTab(keyPersonnelDetailsVal){
	$(".editKeyPersonnelEditTabPopup").modal("show");
	$(".editLaboratoryPartOfOrgName").attr("id" , "editLaboratoryPartOfOrgName"+keyPersonnelDetailsVal);
	$(".editLaboratoryPartOfOrgPosition").attr("id" , "editLaboratoryPartOfOrgPosition"+keyPersonnelDetailsVal);
	laboratoryPartOfOrgName = $(".laboratoryPartOfOrgName"+keyPersonnelDetailsVal+":first").text().trim();
	laboratoryPartOfOrgPosition = $(".laboratoryPartOfOrgPosition"+keyPersonnelDetailsVal+":first").text().trim();
	$("#editLaboratoryPartOfOrgName"+keyPersonnelDetailsVal).val(laboratoryPartOfOrgName);
	$("#editLaboratoryPartOfOrgPosition"+keyPersonnelDetailsVal).val(laboratoryPartOfOrgPosition);
	$(".saveEditKeyPersonnelPopupDataBtn").attr("onclick" , "keyPersonnelEditDataTab("+keyPersonnelDetailsVal+")");
}
function keyPersonnelEditDataTab(keyPersonnelDetailsVal){
	$(".laboratoryPartOfOrgName" + keyPersonnelDetailsVal).html($("#editLaboratoryPartOfOrgName"+keyPersonnelDetailsVal).val());
	$(".laboratoryPartOfOrgPosition" + keyPersonnelDetailsVal).html($("#editLaboratoryPartOfOrgPosition"+keyPersonnelDetailsVal).val());
	$(".editLaboratoryPartOfOrgName").val("");
	$(".editLaboratoryPartOfOrgPosition").val("");
}
function keyPersonnelDeleteData(keyPersonnelDetailsValData) {
	  var keyPersonnelCountCounter = $("#keyPersonnelDetailsVal").val();
	  $("#keyPersonnelDetailsVal").val(keyPersonnelCountCounter - 1);
	  var delRowElement = $(".key-personnel-row" + keyPersonnelDetailsValData); 
	  delRowElement.remove();
	  var j = parseInt(keyPersonnelDetailsValData) + 1;
	  for (var i = j; i <= keyPersonnelCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".key-personnel-row" + i);
	    rowElement.attr("class", "key-personnel-row" + prevCounter);
	    rowElement.find("td.laboratoryPartOfOrgName"+i).removeClass("laboratoryPartOfOrgName"+i).addClass("laboratoryPartOfOrgName"+prevCounter);
	    rowElement.find("td.laboratoryPartOfOrgPosition"+i).removeClass("laboratoryPartOfOrgPosition"+i).addClass("laboratoryPartOfOrgPosition"+prevCounter);
	    rowElement.find("#keyPersonnelDeleteDataTab").attr('onclick', 'keyPersonnelDeleteData(' +prevCounter+ ')');
	    rowElement.find("#keyPersonnelEditTab").attr('onclick', 'keyPersonnelEditTab(' +prevCounter+ ')');
	  }
}
function addPersonnelResponsibleDetailData(counter) {
	if (counter != "") {
	uniqueId = $("#personnelResponsibleId" + counter).val();
	labApplicationName = $("#technicalPersonnelName"+ counter).val();
    labApplicationEmail = $("#technicalPersonnelEmail"+ counter).val();
	} else {
	labApplicationName = $("#technicalPersonnelName").val();
	labApplicationEmail = $("#technicalPersonnelEmail").val();
	uniqueId = $("#personnelResponsibleId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfLabApplication=$("#personnelResponsibleVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleDetailDataUrl}",
				data : {
					"<portlet:namespace/>labApplicationName" : labApplicationName,
					"<portlet:namespace/>labApplicationEmail" : labApplicationEmail,
					"<portlet:namespace/>uniqueId" : uniqueId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfLabApplication" : counterOfLabApplication,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#personnelResponsId"+counter).val(result["uniqueId"]);
				},
				error : function(data) {
				}
			});
}
function addSpecimenCollectionDetailData(counter) {
	if (counter != "") {
	uniqueId = $("#specimenCollectionId" + counter).val();
	labDescOfActivityNum = $("#specimenCollectionNumber"+ counter).val();
	labDescOfActivityLocation = $("#specimenCollectionLocation"+ counter).val();
	}else{
	labDescOfActivityNum = $("#specimenCollectionNumber").val();
	labDescOfActivityLocation = $("#specimenCollectionLocation").val();
	uniqueId = $("#specimenCollectionId").val();
	}
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOflabDecOfActivity=$("#specimenColldectionVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addSpecimenCollectionDetailDataUrl}",
				data : {
					"<portlet:namespace/>labDescOfActivityNum" : labDescOfActivityNum,
					"<portlet:namespace/>labDescOfActivityLocation" : labDescOfActivityLocation,
					"<portlet:namespace/>uniqueId" : uniqueId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOflabDecOfActivity" : counterOflabDecOfActivity,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#specimenCollectionId"+counter).val(result["uniqueId"]);
				},
				error : function(data) {
				}
			});
}
function addPointCareTestingDetailData(counter) {
	if (counter != "") {
    pointCareTestingId = $("#pointCareTestingId" + counter).val();
    pointCareTestingReqPoct = $("#pointCareTestingReqPoct"+ counter).val();
	specimenCollectionLocation = $("#specimenCollectionLocation"+ counter).val();
	} else {
		pointCareTestingReqPoct = $("#pointCareTestingReqPoct").val();
		pointCareTestingLocation = $("#pointCareTestingLocation").val();
		pointCareTestingId = $("#pointCareTestingId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfPointCareTesting=$("#pointCareTestingVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addPointCareTestingDetailDataUrl}",
				data : {
					"<portlet:namespace/>pointCareTestingReqPoct" : pointCareTestingReqPoct,
					"<portlet:namespace/>pointCareTestingLocation" : pointCareTestingLocation,
					"<portlet:namespace/>pointCareTestingId" : pointCareTestingId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfPointCareTesting" : counterOfPointCareTesting,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#pointCareTestingId"+counter).val(result["pointCareId"]);
				},
				error : function(data) {
				}
			});
}
function addSignatoryAuthorityDetailData(counter) {
	if (counter != "") {
	 signatoryAuthorityId = $("#signatoryAuthorityId" + counter).val();
	 staffName = $("#staffName"+ counter).val();
	 jobTitle = $("#jobTitle"+ counter).val();
	 majorResponsibilities = $("#majorResponsibilities"+ counter).val();
	} else {
		 staffName = $("#staffName").val();
		 jobTitle = $("#jobTitle").val();
		 majorResponsibilities = $("#majorResponsibilities").val();
		 signatoryAuthorityId = $("#signatoryAuthorityId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfSpecimenCollection=$("#signatoryAuthorityVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addSignatoryAuthorityDetailDataUrl}",
				data : {
					"<portlet:namespace/>staffName" : staffName,
					"<portlet:namespace/>jobTitle" : jobTitle,
					"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
					"<portlet:namespace/>signatoryAuthorityId" : signatoryAuthorityId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfSpecimenCollection" : counterOfSpecimenCollection,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#signatoryAuthorityId"+counter).val(result["signatoryAutorityId"]);
				},
				error : function(data) {
				}
			});
}
function addExaminationsScopeDetailData(counter) {
	if (counter != "") {
		 examinationsScopeId = $("#examinationsScopeId" + counter).val();
		 product = $("#product"+ counter).val();
		 examinations = $("#examinations"+ counter).val();
		 methods = $("#methods"+ counter).val();
		 equipment = $("#equipment"+ counter).val();
		 referenceRange = $("#referenceRange"+ counter).val();
		 measurementUncertainty = $("#measurementUncertainty"+ counter).val();
	} else {
		 product = $("#product").val();
		 examinations = $("#examinations").val();
		 methods =$("#methods").val();
		 equipment =$("#equipment").val();
		 referenceRange =$("#referenceRange").val();
		 measurementUncertainty =$("#measurementUncertainty").val();
		 examinationsScopeId =$("#examinationsScopeId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfExaminations=$("#examinationsScopeVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addExaminationsScopeDetailDataUrl}",
				data : {
					"<portlet:namespace/>product" : product,
					"<portlet:namespace/>examinations" : examinations,
					"<portlet:namespace/>methods" : methods,
					"<portlet:namespace/>equipment" : equipment,
					"<portlet:namespace/>referenceRange" : referenceRange,
					"<portlet:namespace/>measurementUncertainty" : measurementUncertainty,
					"<portlet:namespace/>examinationsScopeId" : examinationsScopeId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfExaminations" : counterOfExaminations,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#examinationsScopeId"+counter).val(result["examinationsScopeId"]);
				},
				error : function(data) {
				}
			});
}
function addMajorEquipmentDetailData(counter){
	if (counter != "") {
		 majorEquipmentId = $("#majorEquipmentId" + counter).val();
		 inventory = $("#inventory"+ counter).val();
		 item = $("#item"+ counter).val();
		 manufacturer = $("#manufacturer"+ counter).val();
		 model = $("#model"+ counter).val();
		 calibrationInterval = $("#calibrationInterval"+ counter).val();
		 calibratedBy = $("#calibratedBy"+ counter).val();
	} else {
		 inventory = $("#inventory").val();
		 item = $("#item").val();
		 manufacturer = $("#manufacturer").val();
		 model = $("#model").val();
		 calibrationInterval = $("#calibrationInterval").val();
		 calibratedBy = $("#calibratedBy").val();
		 majorEquipmentId = $("#majorEquipmentId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfMajorEquipment=$("#majorEquipmentVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addMajorEquipmentDetailDataUrl}",
				data : {
					"<portlet:namespace/>inventory" : inventory,
					"<portlet:namespace/>item" : item,
					"<portlet:namespace/>manufacturer" : manufacturer,
					"<portlet:namespace/>model" : model,
					"<portlet:namespace/>calibrationInterval" : calibrationInterval,
					"<portlet:namespace/>calibratedBy" : calibratedBy,
					"<portlet:namespace/>majorEquipmentId" : majorEquipmentId,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfMajorEquipment" : counterOfMajorEquipment,
					
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#majorEquipmentId"+counter).val(result["majorEquipmentId"]);
				},
				error : function(data) {
				}
			});
}
function addApplicationActivityLocDetailData(counter){
	if (counter != "") {
		 applicationActivityLocId = $("#applicationActivityLocId" + counter).val();
		 activityNumber = $("#activityNumber"+ counter).val();
		 applicationActivityAddress = $("#applicationActivityAddress"+ counter).val();
		 activityPerformedLoc = $("#activityPerformedLoc"+ counter).val();
		 activityContactDetails = $("#activityContactDetails"+ counter).val();
		} else {
			 activityNumber = $("#activityNumber").val();
		 applicationActivityAddress = $("#applicationActivityAddress").val();
		 activityPerformedLoc = $("#activityPerformedLoc").val();
		 activityContactDetails = $("#activityContactDetails").val();
		 applicationActivityLocId = $("#applicationActivityLocId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfApplicationActivity=$("#applicationActivityLocVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addApplicationActivityLocDetailDataUrl}",
				data : {
					"<portlet:namespace/>activityNumber" : activityNumber,
					"<portlet:namespace/>applicationActivityAddress" : applicationActivityAddress,
					"<portlet:namespace/>activityPerformedLoc" : activityPerformedLoc,
					"<portlet:namespace/>activityContactDetails" : activityContactDetails,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfApplicationActivity" : counterOfApplicationActivity,
					"<portlet:namespace/>applicationActivityLocId" : applicationActivityLocId,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#applicationActivityLocId"+counter).val(result["applicationActivityLocId"]);
				},
				error : function(data) {
				}
			});
}
	function addPersonnelResponsibleTestingDetailData(counter){
	if (counter != "") {
		uniqueId = $("#personnelResponsibleTestingId" + counter).val();
		labApplicationName = $("#technicalPersonnelNameTesting"+ counter).val();
		labApplicationEmail = $("#technicalPersonnelEmailTesting"+ counter).val();
		} else {
			labApplicationName= $("#technicalPersonnelNameTesting").val();
			labApplicationEmail = $("#technicalPersonnelEmailTesting").val();
		uniqueId = $("#personnelResponsibleTestingId").val();
	    }
	janaacApplicationId = $("#janaacApplicationId").val();
	counterOfLabApplication=$("#personnelResponsibleTestingVal").val();
	$
			.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleTestingDetailDataUrl}",
				data : {
					"<portlet:namespace/>labApplicationName" : labApplicationName,
					"<portlet:namespace/>labApplicationEmail" : labApplicationEmail,
					"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
					"<portlet:namespace/>counterOfLabApplication" : counterOfLabApplication,
				},
				success : function(data) {
					var result = data.APP_DATA;
					var counter = result["counter"];
					$("#personnelResponsibleTestingId"+counter).val(result["uniqueId"]);
				},
				error : function(data) {
				}
			});
}
    function addTestingSpecimenCollectionDetailData(counter){
		if (counter != "") {
			uniqueId = $("#testingSpecimenCollectionId" + counter).val();
			labDescOfActivityNum = $("#testingSpecimenCollectionNumber" + counter).val();
			labDescOfActivityLocation = $("#testingSpecimenCollectionLocation" + counter).val();
 		} else {
 			uniqueId = $("#testingSpecimenCollectionId").val();
 			labDescOfActivityNum = $("#testingSpecimenCollectionNumber").val();
 			labDescOfActivityLocation = $("#testingSpecimenCollectionLocation").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOflabDecOfActivity=$("#testingSpecimenCollectionVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addTestingSpecimenCollectionDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>labDescOfActivityNum" : labDescOfActivityNum,
						"<portlet:namespace/>labDescOfActivityLocation" : labDescOfActivityLocation,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOflabDecOfActivity" : counterOflabDecOfActivity,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#testingSpecimenCollectionId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	} 
	function addStaffDetailData(counter){
		if (counter != "") {
			 uniqueId = $("#staffDetailTestingId" + counter).val();
			 nameOfStaf = $("#staffNameTesting"+ counter).val();
			 jobTitle = $("#jobTitleTesting"+ counter).val();
			 majorResponsibilities= $("#majorResponsibilitiesTesting"+ counter).val();
			 IndicateAnalysts= $("#analystsInvolveTesting"+ counter).val();
 		} else {
 			 nameOfStaf = $("#staffNameTesting").val();
 			 jobTitle = $("#jobTitleTesting").val();
			 majorResponsibilities = $("#majorResponsibilitiesTesting").val();
			 IndicateAnalysts = $("#analystsInvolveTesting").val();
			 uniqueId = $("#staffDetailTestingId").val();
			 
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfStaff=$("#staffDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>nameOfStaf" : nameOfStaf,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
						"<portlet:namespace/>IndicateAnalysts" : IndicateAnalysts,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfStaff" : counterOfStaff,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailTestingId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addScopeForAccreditationDetailData(counter){
		if (counter != "") {
		 uniquieId = $("#scopeForAccreditationId" + counter).val();
		 product = $("#productTesting"+ counter).val();
		 tests = $("#testsTesting"+ counter).val();
		 method = $("#methodsTesting"+ counter).val();
		 equipment = $("#equipmentTesting"+ counter).val();
		 limitOfCapability = $("#capanilityLimitTesting"+ counter).val();
		 estimateOfMeasurement = $("#measurementUncertaintyTesting"+ counter).val();
 		}else{
 			uniquieId = $("#scopeForAccreditationId" + counter).val();
 			product = $("#productTesting").val();
 			tests = $("#testsTesting").val();
 			method = $("#methodsTesting").val();
 			equipment = $("#equipmentTesting").val();
 			limitOfCapability = $("#capanilityLimitTesting").val();
 			estimateOfMeasurement = $("#measurementUncertaintyTesting").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfStructuralReq=$("#scopeForAccreditationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addScopeForAccreditationDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniquieId" : uniquieId,
						"<portlet:namespace/>product" : product,
						"<portlet:namespace/>tests" : tests,
						"<portlet:namespace/>method" : method,
						"<portlet:namespace/>equipment" : equipment,
						"<portlet:namespace/>limitOfCapability" : limitOfCapability,
						"<portlet:namespace/>estimateOfMeasurement" : estimateOfMeasurement,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfStructuralReq" : counterOfStructuralReq,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#scopeForAccreditationId"+counter).val(result["uniquieId"]);
					},
					error : function(data) {
					}
				});
	}
	function addActivityPerformedLocDetailData(counterInActivity){
		if (counterInActivity != "") {
			 uniqueId=$("#activityPerformedLocId" + counter).val();
			 number=$("#numberTesting"+ counter).val();
			 locationAddress=$("#applicationActivityAddressTesting"+ counter).val();
			 activityPerformedLocation=$("#activityPerformedTesting"+ counter).val();
			 contactDetails=$("#contactDetailsTesting"+ counter).val();
 		}else{
 			uniqueId=$("#activityPerformedLocId").val();
 			number=$("#numberTesting").val();
 			locationAddress=$("#applicationActivityAddressTesting").val();
 			activityPerformedLocation=$("#activityPerformedTesting").val();
 			contactDetails=$("#contactDetailsTesting").val();
		}
		janaacApplicationId=$("#janaacApplicationId").val();
		counterOfresourceReqFirst=$("#activityPerformedLocVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addActivityPerformedLocDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>number" : number,
						"<portlet:namespace/>locationAddress" : locationAddress,
						"<portlet:namespace/>activityPerformedLocation" : activityPerformedLocation,
						"<portlet:namespace/>contactDetails" : contactDetails,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfresourceReqFirst" : counterOfresourceReqFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#activityPerformedLocId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addMajorEquipmentTestingDetailData(counter){
		if (counter != "") {
			 uniqueId = $("#majorEquipmentTestingId" + counter).val();
			 inventoryNumber = $("#inventoryTesting"+ counter).val();
			 item = $("#itemTesting"+ counter).val();
			 manufacturerCalibration = $("#manufacturerTesting"+ counter).val();
			 modelCalibration = $("#modelTesting"+ counter).val();
			 calibrationIntervalCalibration = $("#calibrationIntervalTesting"+ counter).val();
			 calibratedByCalibration = $("#calibratedByTesting"+ counter).val();
 		}else{
 			 uniqueId = $("#majorEquipmentTestingId").val();
			 inventoryNumber = $("#inventoryTesting").val();
			 item = $("#itemTesting").val();
			 manufacturerCalibration = $("#manufacturerTesting"+ counter).val();
			 modelCalibration = $("#modelTesting"+ counter).val();
			 calibrationIntervalCalibration = $("#calibrationIntervalTesting"+ counter).val();
			 calibratedByCalibration = $("#calibratedByTesting"+ counter).val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfMajorEquipmentTesting=$("#majorEquipmentTestingVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addMajorEquipmentTestingDetailDataUrl}",
					data : {
						"<portlet:namespace/>inventoryNumber" : inventoryNumber,
						"<portlet:namespace/>item" : item,
						"<portlet:namespace/>manufacturerCalibration" : manufacturerCalibration,
						"<portlet:namespace/>modelCalibration" : modelCalibration,
						"<portlet:namespace/>calibrationIntervalCalibration" : calibrationIntervalCalibration,
						"<portlet:namespace/>calibratedByCalibration" : calibratedByCalibration,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfMajorEquipmentTesting" : counterOfMajorEquipmentTesting,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#majorEquipmentTestingId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addPersonnelResponsibleCalibrationDetailData(counter){
		if (counter != "") {
			 uniqueId = $("#personnelResponsibleCalibrationId" + counter).val();
			 labApplicationName = $("#technicalPersonnelNameCalibration" + counter).val();
			 labApplicationEmail = $("#technicalPersonnelEmailCalibration" + counter).val();
 		}else{
 			labApplicationName = $("#technicalPersonnelNameCalibration").val();
 			labApplicationEmail = $("#technicalPersonnelEmailCalibration").val();
 			uniqueId = $("#personnelResponsibleCalibrationId").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfLabApplication=$("#personnelResponsibleCalibrationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonnelResponsibleCalibrationDetailDataUrl}",
					data : {
						"<portlet:namespace/>labApplicationName" : labApplicationName,
						"<portlet:namespace/>labApplicationEmail" : labApplicationEmail,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfLabApplication" : counterOfLabApplication,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personnelResponsibleCalibrationId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
function addCalibrationSpecimenCollectionDetailData(counter){
		if (counter != "") {
			uniqueId = $("#calibrationSpecimenCollectionId"+counter).val();
			labDescOfActivityNum = $("#calibrationSpecimenNumber"+counter).val();
			labDescOfActivityLocation = $("#calibrationSpecimenLocation"+counter).val();
			
 		}else{
 			uniqueId = $("#calibrationSpecimenCollectionId"+counter).val();
 			labDescOfActivityNum = $("#calibrationSpecimenNumber").val();
 			labDescOfActivityLocation = $("#calibrationSpecimenLocation").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOflabDecOfActivity=$("#calibrationSpecimenCollectionVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addCalibrationSpecimenCollectionDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>labDescOfActivityNum" : labDescOfActivityNum,
						"<portlet:namespace/>labDescOfActivityLocation" : labDescOfActivityLocation,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOflabDecOfActivity" : counterOflabDecOfActivity,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#calibrationSpecimenCollectionId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addStaffDetailCalibrationData(counter){
		if (counter != "") {
			uniqueId = $("#staffDetailCalibrationId"+counter).val();
			nameOfStaf = $("#staffNameCalibration"+counter).val();
			jobTitle = $("#jobTitleCalibration"+counter).val();
			majorResponsibilities = $("#majorResponsibilitiesCalibration"+counter).val();
			IndicateAnalysts = $("#analystsInvolveCalibration"+counter).val();
 		}else{
 			 uniqueId = $("#staffDetailCalibrationId"+counter).val();
 			nameOfStaf = $("#staffNameCalibration").val();
 			jobTitle = $("#jobTitleCalibration").val();
 			majorResponsibilities = $("#majorResponsibilitiesCalibration").val();
 			IndicateAnalysts = $("#analystsInvolveCalibration").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfStaff=$("#staffDetailCalibrationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailCalibrationDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>nameOfStaf" : nameOfStaf,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
						"<portlet:namespace/>IndicateAnalysts" : IndicateAnalysts,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfStaff" : counterOfStaff,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailCalibrationId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addScopeForCalibrationsDetailData(counter){
		if (counter != "") {
			scopeForCalibrationsId = $("#scopeForCalibrationsId"+counter).val();
			numCalibration = $("#numCalibration"+counter).val();
			qualificationCalibration = $("#qualificationCalibration"+counter).val();
			itemCalibration = $("#itemCalibration"+counter).val();
			rangeCalibration = $("#rangeCalibration"+counter).val();
			measurementProcedureCalibration = $("#measurementProcedureCalibration"+counter).val();
			measurementCalibration = $("#measurementCalibration"+counter).val();
			remarksCalibration = $("#remarksCalibration"+counter).val();
 		}else{
 			numCalibration = $("#numCalibration").val();
 			qualificationCalibration = $("#qualificationCalibration").val();
 			itemCalibration = $("#itemCalibration").val();
 			rangeCalibration = $("#rangeCalibration").val();
 			measurementProcedureCalibration = $("#measurementProcedureCalibration").val();
 			measurementCalibration = $("#measurementCalibration").val();
 			remarksCalibration = $("#remarksCalibration").val();
 			scopeForCalibrationsId = $("#scopeForCalibrationsId").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfScopeforCalibration=$("#scopeForCalibrationsVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addScopeForCalibrationsDetailDataUrl}",
					data : {
						"<portlet:namespace/>scopeForCalibrationsId" : scopeForCalibrationsId,
						"<portlet:namespace/>numCalibration" : numCalibration,
						"<portlet:namespace/>qualificationCalibration" : qualificationCalibration,
						"<portlet:namespace/>itemCalibration" : itemCalibration,
						"<portlet:namespace/>rangeCalibration" : rangeCalibration,
						"<portlet:namespace/>measurementProcedureCalibration" : measurementProcedureCalibration,
						"<portlet:namespace/>measurementCalibration" : measurementCalibration,
						"<portlet:namespace/>remarksCalibration" : remarksCalibration,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfScopeforCalibration" : counterOfScopeforCalibration,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#scopeForCalibrationsId"+counter).val(result["scopeForCalibrationsId"]);
					},
					error : function(data) {
					}
				});
	}
	function addActivityPerformedLocCalibrationDetailData(counter){
		if (counter != "") {
			uniqueId = $("#activityPerformedLocCalId"+counter).val();
			number = $("#numberCalibration"+counter).val();
			locationAddress=$("#applicationActivityAddressCalibration"+counter).val();
			activityPerformedLocation = $("#activityPerformedCalibration"+counter).val();
			contactDetails = $("#contactDetailsCalibration"+counter).val();
 		}else{
 			uniqueId = $("#activityPerformedLocCalId").val();
			number = $("#numberCalibration").val();
			locationAddress = $("#applicationActivityAddressCalibration").val();
			activityPerformedLocation = $("#activityPerformedCalibration").val();
			contactDetails = $("#contactDetailsCalibration").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfresourceReqFirst=$("#activityPerformedLocCalibrationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addActivityPerformedLocCalibrationDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>number" : number,
						"<portlet:namespace/>locationAddress":locationAddress,
						"<portlet:namespace/>activityPerformedLocation" : activityPerformedLocation,
						"<portlet:namespace/>contactDetails" : contactDetails,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfresourceReqFirst" : counterOfresourceReqFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#activityPerformedLocCalId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function addMajorEquipmentCalibrationDetailData(counter){
		if (counter != "") {
			uniqueId = $("#majorEquipmentCalibrationId"+counter).val();
			inventoryNumber = $("#inventoryCalibration"+counter).val();
			item = $("#itemEquipmentCalibration"+counter).val();
			manufacturerCalibration = $("#manufacturerCalibration"+counter).val();
			modelCalibration = $("#modelCalibration"+counter).val();
			calibrationIntervalCalibration = $("#calibrationIntervalCalibration"+counter).val();
			calibratedByCalibration = $("#calibratedByCalibration"+counter).val();
 		}else{
 			uniqueId = $("#majorEquipmentCalibrationId").val();
			inventoryNumber = $("#inventoryCalibration").val();
			item = $("#itemEquipmentCalibration").val();
			manufacturerCalibration = $("#manufacturerCalibration").val();
			modelCalibration = $("#modelCalibration").val();
			calibrationIntervalCalibration = $("#calibrationIntervalCalibration").val();
			calibratedByCalibration = $("#calibratedByCalibration").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfMajorEquipmentCallibration=$("#majorEquipmentCalibrationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addMajorEquipmentCalibrationDetailDataUrl}",
					data : {
						"<portlet:namespace/>inventoryNumber" : inventoryNumber,
						"<portlet:namespace/>item" : item,
						"<portlet:namespace/>manufacturerCalibration" : manufacturerCalibration,
						"<portlet:namespace/>modelCalibration" : modelCalibration,
						"<portlet:namespace/>calibrationIntervalCalibration" : calibrationIntervalCalibration,
						"<portlet:namespace/>calibratedByCalibration" : calibratedByCalibration,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfMajorEquipmentCallibration" : counterOfMajorEquipmentCallibration,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#majorEquipmentCalibrationId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addKeyPersonnelDetailsData(counter) {
		if (counter != "") {
			keyPersonnelId=$("#keyPersonnelId"+ counter).val();
		 
			 laboratoryPartOfOrgName = $("#laboratoryPartOfOrgName"+counter).val();
			 laboratoryPartOfOrgPosition = $("#laboratoryPartOfOrgPosition"+counter).val();
     	
		} else {
			keyPersonnelId=$("#keyPersonnelId").val();
		 
			 laboratoryPartOfOrgName = $("#laboratoryPartOfOrgName").val();
			 laboratoryPartOfOrgPosition = $("#laboratoryPartOfOrgPosition").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterkeyPersonnelDetailsVal = $("#keyPersonnelDetailsVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addKeyPersonnelDetailsDataUrl}",
					data : {
						"<portlet:namespace/>keyPersonnelId" : keyPersonnelId,
						"<portlet:namespace/>laboratoryPartOfOrgName" : laboratoryPartOfOrgName,
						"<portlet:namespace/>laboratoryPartOfOrgPosition" : laboratoryPartOfOrgPosition,
						
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterkeyPersonnelDetailsVal" : counterkeyPersonnelDetailsVal,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#keyPersonnelId"+counter).val(result["keyPersonnelId"]);
					},
					error : function(data) {
					}
				});
	}
</script>