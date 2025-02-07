<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addBranchDetailInfoUrl" id="/branch/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addDomesticTourBranchDetailInfoUrl" id="/domestic/tour/branch/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addContractVehicleRegisterDetailInfoUrl" id="/contract/vehicle/register/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addCraftTradersApplicantDetailInfoUrl" id="/craft/traders/applicant/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addCraftTradersEmployeeDetailInfoUrl" id="/craft/traders/employee/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addContractDriverListDetailInfoUrl" id="/contract/driver/list/detail/info"></portlet:resourceURL>

<portlet:resourceURL var="addOperatorManagerUrl" id="operator/manager/info"></portlet:resourceURL>

<portlet:resourceURL var="carRentalBranchDetailAddForm" id="/car/rental/branch/detail/edit"></portlet:resourceURL>
<portlet:resourceURL var="domesticTourBranchDetailAddForm" id="/domestic/tour/branch/detail/edit"></portlet:resourceURL>
<portlet:resourceURL var="listVehichleRegstInfoAddForm" id="/list/vehicle/regst/info/edit"></portlet:resourceURL>
<portlet:resourceURL var="listDriverInfoAddForm" id="/list/driver/info/edit"></portlet:resourceURL>
<portlet:resourceURL var="craftTraderApplicantInfoAddForm" id="/craft/trader/applicant/info/edit"></portlet:resourceURL>
<portlet:resourceURL var="craftTraderEmployeeInfoAddForm" id="/craft/trader/employee/info/edit"></portlet:resourceURL>
<portlet:resourceURL var="operatorManagerInfoAddForm" id="/operator/manager/info/edit"></portlet:resourceURL>

<portlet:resourceURL var="deleteOperatorManagerAdd" id="/operator/manager/info/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteCarRentalBranchOfficeDetailAdd" id="/car/rental/branch/office/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteDomesticTourBranchOfficeDetailAdd" id="/domestic/tour/branch/office/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteCarriageListOfVehicleRegstAdd" id="/list/vehicle/regsitration/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteCarriageListOfDriverAdd" id="/list/of/driver/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteCraftTraderApplicantAdd" id="/craft/trader/applicant/delete"></portlet:resourceURL>
<portlet:resourceURL var="deleteCraftTraderEmployeeAdd" id="/craft/trader/employee/delete"></portlet:resourceURL>
<script>

/* Car Rental Branch Detail */
function addcarRentalBranchDetail(){
	carRentalBranchDetailVal = $("#carRentalBranchDetailVal").val();
	 
	carRentalOfficeLocation = $("#carRentalOfficeLocation").val();
	carRentalBranchTelephoneNo = $("#carRentalBranchTelephoneNo").val();

	 if(carRentalBranchTelephoneNo != "" || carRentalOfficeLocation !=""){
		$(".addCarRentalBranchDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addBranchDetailInfoUrl}",
			data : {
				"<portlet:namespace/>carRentalBranchDetailVal" : carRentalBranchDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addCarRentalBranchDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */	
				$(".carRentalOfficeLocation" + carRentalBranchDetailVal).append(carRentalOfficeLocation);
				$(".carRentalBranchTelephoneNo" + carRentalBranchDetailVal).append(carRentalBranchTelephoneNo);
				
				addCarRentalLicenceBranchDetail("");
				
				/* VALUE INCREAMENT */
				/* addLicBranchDetailCarRentalFormNine(); */
				carRentalBranchDetailVal++;
				$("#carRentalBranchDetailVal").val(carRentalBranchDetailVal);
				
				/* RESET FORM FIELDS */
				$("#carRentalOfficeLocation").val("");
				$("#carRentalBranchTelephoneNo").val("");
				
			}
		});
	}else{
		$("#carRentalOfficeLocation").focus();
	}
}
function carRentalBranchDetailEditTab(carRentalBranchDetailVal){
	$(".editCarRentalBranchDetailPopup").modal("show");
	
	$(".editCarRentalOfficeLocation").attr("id" , "editCarRentalOfficeLocation"+carRentalBranchDetailVal);
	$(".editCarRentalBranchTelephoneNo").attr("id" , "editCarRentalBranchTelephoneNo"+carRentalBranchDetailVal);
	
	carRentalOfficeLocation = $(".carRentalOfficeLocation"+carRentalBranchDetailVal+":first").text().trim();
	carRentalBranchTelephoneNo = $(".carRentalBranchTelephoneNo"+carRentalBranchDetailVal+":first").text().trim();

	$("#editCarRentalOfficeLocation"+carRentalBranchDetailVal).val(carRentalOfficeLocation);
	$("#editCarRentalBranchTelephoneNo"+carRentalBranchDetailVal).val(carRentalBranchTelephoneNo);
	
	$(".saveEditCarRentalBranchDetailPopupDataBtn").attr("onclick" , "carRentalBranchDetailEditData("+carRentalBranchDetailVal+")");
}
function carRentalBranchDetailEditData(carRentalBranchDetailVal){
	addCarRentalLicenceBranchDetail(carRentalBranchDetailVal);
	$(".carRentalOfficeLocation" + carRentalBranchDetailVal).html($("#editCarRentalOfficeLocation"+carRentalBranchDetailVal).val());
	$(".carRentalBranchTelephoneNo" + carRentalBranchDetailVal).html($("#editCarRentalBranchTelephoneNo"+carRentalBranchDetailVal).val());
	
	$(".editCarRentalOfficeLocation").val("");
	$(".editCarRentalBranchTelephoneNo").val("");
}
	
function carRentalBranchDetailDeleteData(carRentalBranchDetailVal) {
	deleteCarRentalBranchOfficeDetailData(carRentalBranchDetailVal);
	  var carRentalBranchDetailCounter = $("#carRentalBranchDetailVal").val();
	  $("#carRentalBranchDetailVal").val(carRentalBranchDetailCounter - 1);
	  var delRowElement = $(".branch-detail-row" + carRentalBranchDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(carRentalBranchDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= carRentalBranchDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".branch-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "branch-detail-row" + prevCounter);
	    rowElement.find("td.carRentalOfficeLocation"+i).removeClass("carRentalOfficeLocation"+i).addClass("carRentalOfficeLocation"+prevCounter);
	    rowElement.find("td.carRentalBranchTelephoneNo"+i).removeClass("carRentalBranchTelephoneNo"+i).addClass("carRentalBranchTelephoneNo"+prevCounter);
	    rowElement.find("#carRentalBranchDetailEditTab").attr('onclick', 'carRentalBranchDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#carRentalBranchDetailDeleteData").attr('onclick', 'carRentalBranchDetailDeleteData(' +prevCounter+ ')');
	  }
}

/* Domestic Tour Branch Detail */
function addDomesticTourBranchDetail(){
	domesticTourBranchDetailVal = $("#domesticTourBranchDetailVal").val();
	 
	domesticTourOfficeLocation = $("#domesticTourOfficeLocation").val();
	domesticTourBranchTelephoneNo = $("#domesticTourBranchTelephoneNo").val();
	

	 if(domesticTourBranchTelephoneNo != ""  || domesticTourOfficeLocation !="" ){
		$(".addDomesticTourBranchDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addDomesticTourBranchDetailInfoUrl}",
			data : {
				"<portlet:namespace/>domesticTourBranchDetailVal" : domesticTourBranchDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addDomesticTourBranchDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */	
				$(".domesticTourOfficeLocation" + domesticTourBranchDetailVal).append(domesticTourOfficeLocation);
				$(".domesticTourBranchTelephoneNo" + domesticTourBranchDetailVal).append(domesticTourBranchTelephoneNo);
				
				addDomesticTourLicenceBranchDetail("");
				/* VALUE INCREAMENT */
				/* addLicBranchDetailCarRentalFormNine(); */
				domesticTourBranchDetailVal++;
				$("#domesticTourBranchDetailVal").val(domesticTourBranchDetailVal);
				
				/* RESET FORM FIELDS */
				$("#domesticTourOfficeLocation").val("");
				$("#domesticTourBranchTelephoneNo").val("");
				
			}
		});
	}else{
		$("#domesticTourOfficeLocation").focus();
	}
}
function domesticTourBranchDetailEditTab(domesticTourBranchDetailVal){
	$(".editDomesticTourBranchDetailPopup").modal("show");
	
	$(".editDomesticTourOfficeLocation").attr("id" , "editDomesticTourOfficeLocation"+domesticTourBranchDetailVal);
	$(".editDomesticTourBranchTelephoneNo").attr("id" , "editDomesticTourBranchTelephoneNo"+domesticTourBranchDetailVal);
	
	domesticTourOfficeLocation = $(".domesticTourOfficeLocation"+domesticTourBranchDetailVal+":first").text().trim();
	domesticTourBranchTelephoneNo = $(".domesticTourBranchTelephoneNo"+domesticTourBranchDetailVal+":first").text().trim();

	$("#editDomesticTourOfficeLocation"+domesticTourBranchDetailVal).val(domesticTourOfficeLocation);
	$("#editDomesticTourBranchTelephoneNo"+domesticTourBranchDetailVal).val(domesticTourBranchTelephoneNo);
	
	$(".saveEditDomesticTourBranchDetailPopupDataBtn").attr("onclick" , "domesticTourBranchDetailEditData("+domesticTourBranchDetailVal+")");
}
function domesticTourBranchDetailEditData(domesticTourBranchDetailVal){
	addDomesticTourLicenceBranchDetail(domesticTourBranchDetailVal);
	$(".domesticTourOfficeLocation" + domesticTourBranchDetailVal).html($("#editDomesticTourOfficeLocation"+domesticTourBranchDetailVal).val());
	$(".domesticTourBranchTelephoneNo" + domesticTourBranchDetailVal).html($("#editDomesticTourBranchTelephoneNo"+domesticTourBranchDetailVal).val());
	
	$(".editDomesticTourOfficeLocation").val("");
	$(".editDomesticTourBranchTelephoneNo").val("");
}
	
function domesticTourBranchDetailDeleteData(domesticTourBranchDetailVal){
	deleteDomesticTourBranchOfficeDetailData(domesticTourBranchDetailVal);
	  var domesticTourBranchDetailCounter = $("#domesticTourBranchDetailVal").val();
	  $("#domesticTourBranchDetailVal").val(domesticTourBranchDetailCounter - 1);
	  var delRowElement = $(".domestic-branch-detail-row" + domesticTourBranchDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(domesticTourBranchDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= domesticTourBranchDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".domestic-branch-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "domestic-branch-detail-row" + prevCounter);
	    rowElement.find("td.domesticTourOfficeLocation"+i).removeClass("domesticTourOfficeLocation"+i).addClass("domesticTourOfficeLocation"+prevCounter);
	    rowElement.find("td.domesticTourBranchTelephoneNo"+i).removeClass("domesticTourBranchTelephoneNo"+i).addClass("domesticTourBranchTelephoneNo"+prevCounter);
	    rowElement.find("#domesticTourBranchDetailEditTab").attr('onclick', 'domesticTourBranchDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#craftTradersApplicantDetailDeleteData").attr('onclick', 'craftTradersApplicantDetailDeleteData(' +prevCounter+ ')');
	  }
}

/*  Contract Corriage Vehicle Registration */
function addContractVehicleRegisterDetail(){
	contractVehicleRegisterDetailVal = $("#contractVehicleRegisterDetailVal").val();
	
	contractVehicleRegisterYear = $("#contractVehicleRegisterYear").val();
	contractVehicleRegisterModel = $("#contractVehicleRegisterModel").val();
	contractVehicleRegisterPlate = $("#contractVehicleRegisterPlate").val();
	contractVehicleRegisterExpDate = $("#contractVehicleRegisterExpDate").val();
	contractVehicleRegisterFitnessDate = $("#contractVehicleRegisterFitnessDate").val();
	contractVehicleRegisterChassis = $("#contractVehicleRegisterChassis").val();
	contractVehicleRegisterBased = $("#contractVehicleRegisterBased").val();
	contractVehicleRegisterInsuranceCom = $("#contractVehicleRegisterInsuranceCom").val();
	contractVehicleRegisterPolicyNum = $("#contractVehicleRegisterPolicyNum").val();
	contractVehicleRegisterExpiryDate = $("#contractVehicleRegisterExpiryDate").val();


	 if(contractVehicleRegisterYear != "" || contractVehicleRegisterModel !=""|| contractVehicleRegisterPlate !=""|| contractVehicleRegisterExpDate !=""|| contractVehicleRegisterFitnessDate !=""|| contractVehicleRegisterChassis !=""|| contractVehicleRegisterBased !=""|| contractVehicleRegisterInsuranceCom !=""|| contractVehicleRegisterPolicyNum !=""|| contractVehicleRegisterExpiryDate !=""){
		$(".addContractVehicleRegisterDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addContractVehicleRegisterDetailInfoUrl}",
			data : {
				"<portlet:namespace/>contractVehicleRegisterDetailVal" : contractVehicleRegisterDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addContractVehicleRegisterDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */					
				$(".contractVehicleRegisterYear" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterYear);
				$(".contractVehicleRegisterModel" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterModel);
				$(".contractVehicleRegisterPlate" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterPlate);
				$(".contractVehicleRegisterExpDate" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterExpDate);
				$(".contractVehicleRegisterFitnessDate" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterFitnessDate);
				$(".contractVehicleRegisterChassis" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterChassis);
				$(".contractVehicleRegisterBased" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterBased);
				$(".contractVehicleRegisterInsuranceCom" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterInsuranceCom);
				$(".contractVehicleRegisterPolicyNum" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterPolicyNum);
				$(".contractVehicleRegisterExpiryDate" + contractVehicleRegisterDetailVal).append(contractVehicleRegisterExpiryDate);
				addContractCarriageListVehichleRegstInfo(""); 
				
				/* VALUE INCREAMENT */
				/* addcontractVehicleRegisterFormNine(); */
				contractVehicleRegisterDetailVal++;
				$("#contractVehicleRegisterDetailVal").val(contractVehicleRegisterDetailVal);
				
				/* RESET FORM FIELDS */
				$("#contractVehicleRegisterYear").val("");
				$("#contractVehicleRegisterModel").val("");
				$("#contractVehicleRegisterPlate").val("");
				$("#contractVehicleRegisterExpDate").val("");
				$("#contractVehicleRegisterFitnessDate").val("");
				$("#contractVehicleRegisterChassis").val("");
				$("#contractVehicleRegisterBased").val("");
				$("#contractVehicleRegisterInsuranceCom").val("");
				$("#contractVehicleRegisterPolicyNum").val("");
				$("#contractVehicleRegisterExpiryDate").val("");
			}
		});
	}else{
		$("#contractVehicleRegisterYear").focus();
	}
}

function contractVehicleRegisterDetailEditTab(contractVehicleRegisterDetailVal){
	$(".editContractVehicleRegisterDetailPopup").modal("show");
	
	$(".editContractVehicleRegisterYear").attr("id" , "editContractVehicleRegisterYear"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterModel").attr("id" , "editContractVehicleRegisterModel"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterPlate").attr("id" , "editContractVehicleRegisterPlate"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterExpDate").attr("id" , "editContractVehicleRegisterExpDate"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterFitnessDate").attr("id" , "editContractVehicleRegisterFitnessDate"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterChassis").attr("id" , "editContractVehicleRegisterChassis"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterBased").attr("id" , "editContractVehicleRegisterBased"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterInsuranceCom").attr("id" , "editContractVehicleRegisterInsuranceCom"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterPolicyNum").attr("id" , "editContractVehicleRegisterPolicyNum"+contractVehicleRegisterDetailVal);
	$(".editContractVehicleRegisterExpiryDate").attr("id" , "editContractVehicleRegisterExpiryDate"+contractVehicleRegisterDetailVal);
	
	contractVehicleRegisterYear = $(".contractVehicleRegisterYear"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterModel = $(".contractVehicleRegisterModel"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterPlate = $(".contractVehicleRegisterPlate"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterExpDate = $(".contractVehicleRegisterExpDate"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterFitnessDate = $(".contractVehicleRegisterFitnessDate"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterChassis = $(".contractVehicleRegisterChassis"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterBased = $(".contractVehicleRegisterBased"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterInsuranceCom = $(".contractVehicleRegisterInsuranceCom"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterPolicyNum = $(".contractVehicleRegisterPolicyNum"+contractVehicleRegisterDetailVal+":first").text().trim();
	contractVehicleRegisterExpiryDate = $(".contractVehicleRegisterExpiryDate"+contractVehicleRegisterDetailVal+":first").text().trim();

	$("#editContractVehicleRegisterYear"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterYear);
	$("#editContractVehicleRegisterModel"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterModel);
	$("#editContractVehicleRegisterPlate"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterPlate);
	$("#editContractVehicleRegisterExpDate"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterExpDate);
	$("#editContractVehicleRegisterFitnessDate"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterFitnessDate);
	$("#editContractVehicleRegisterChassis"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterChassis);
	$("#editContractVehicleRegisterBased"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterBased);
	$("#editContractVehicleRegisterInsuranceCom"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterInsuranceCom);
	$("#editContractVehicleRegisterPolicyNum"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterPolicyNum);
	$("#editContractVehicleRegisterExpiryDate"+contractVehicleRegisterDetailVal).val(contractVehicleRegisterExpiryDate);
	
	$(".saveEditContractVehicleRegisterDetailPopupDataBtn").attr("onclick" , "contractVehicleRegisterDetailEditData("+contractVehicleRegisterDetailVal+")");
}
function contractVehicleRegisterDetailEditData(contractVehicleRegisterDetailVal){
	/* addContractCarriageListVehichleRegstInfo(contractVehicleRegisterDetailVal); */
	$(".contractVehicleRegisterYear" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterYear"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterModel" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterModel"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterPlate" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterPlate"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterExpDate" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterExpDate"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterFitnessDate" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterFitnessDate"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterChassis" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterChassis"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterBased" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterBased"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterInsuranceCom" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterInsuranceCom"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterPolicyNum" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterPolicyNum"+contractVehicleRegisterDetailVal).val());
	$(".contractVehicleRegisterExpiryDate" + contractVehicleRegisterDetailVal).html($("#editContractVehicleRegisterExpiryDate"+contractVehicleRegisterDetailVal).val());
	
	$(".editContractVehicleRegisterYear").val("");
	$(".editContractVehicleRegisterModel").val("");
	$(".editContractVehicleRegisterPlate").val("");
	$(".editContractVehicleRegisterExpDate").val("");
	$(".editContractVehicleRegisterFitnessDate").val("");
	$(".editContractVehicleRegisterChassis").val("");
	$(".editContractVehicleRegisterBased").val("");
	$(".editContractVehicleRegisterInsuranceCom").val("");
	$(".editContractVehicleRegisterPolicyNum").val("");
	$(".editContractVehicleRegisterExpiryDate").val("");
}
	
function contractVehicleRegisterDetailDeleteData(contractVehicleRegisterDetailVal){
	/* deleteCarriageListOfVehicleRegstData(contractVehicleRegisterDetailVal); */
	  var contractVehicleRegisterDetailCounter = $("#contractVehicleRegisterDetailVal").val();
	  $("#contractVehicleRegisterDetailVal").val(contractVehicleRegisterDetailCounter - 1);
	  var delRowElement = $(".contract-Vehicle-detail-row" + contractVehicleRegisterDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(contractVehicleRegisterDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= contractVehicleRegisterDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".contract-Vehicle-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "contract-Vehicle-detail-row" + prevCounter);
	    
	    rowElement.find("td.contractVehicleRegisterYear"+i).removeClass("contractVehicleRegisterYear"+i).addClass("contractVehicleRegisterYear"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterModel"+i).removeClass("contractVehicleRegisterModel"+i).addClass("contractVehicleRegisterModel"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterPlate"+i).removeClass("contractVehicleRegisterPlate"+i).addClass("contractVehicleRegisterPlate"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterExpDate"+i).removeClass("contractVehicleRegisterExpDate"+i).addClass("contractVehicleRegisterExpDate"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterFitnessDate"+i).removeClass("contractVehicleRegisterFitnessDate"+i).addClass("contractVehicleRegisterFitnessDate"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterChassis"+i).removeClass("contractVehicleRegisterChassis"+i).addClass("contractVehicleRegisterChassis"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterBased"+i).removeClass("contractVehicleRegisterBased"+i).addClass("contractVehicleRegisterBased"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterInsuranceCom"+i).removeClass("contractVehicleRegisterInsuranceCom"+i).addClass("contractVehicleRegisterInsuranceCom"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterPolicyNum"+i).removeClass("contractVehicleRegisterPolicyNum"+i).addClass("contractVehicleRegisterPolicyNum"+prevCounter);
	    rowElement.find("td.contractVehicleRegisterExpiryDate"+i).removeClass("contractVehicleRegisterExpiryDate"+i).addClass("contractVehicleRegisterExpiryDate"+prevCounter);
	    
	    rowElement.find("#contractVehicleRegisterDetailEditTab").attr('onclick', 'contractVehicleRegisterDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#contractVehicleRegisterDetailDeleteData").attr('onclick', 'contractVehicleRegisterDetailDeleteData(' +prevCounter+ ')');
	  }
}


/*  Contract Carriage Driver List Details */
function addContractDriverListDetail(){
	/* uploadDocuments('contractDriverListSignatureUpload',"Driver's Signature"); */
	contractDriverListDetailVal = $("#contractDriverListDetailVal").val();
	contractDriverListName = $("#contractDriverListName").val();
	contractDriverListLicence = $("#contractDriverListLicence").val();
	contractDriverListExpiryDate = $("#contractDriverListExpiryDate").val();
	driverSignature = $("#driverSignature img").attr("src");
		

	 if(contractDriverListName != "" || contractDriverListLicence !=""|| contractDriverListExpiryDate !=""){
		$(".addContractDriverListDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addContractDriverListDetailInfoUrl}",
			data : {
				"<portlet:namespace/>contractDriverListDetailVal" : contractDriverListDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addContractDriverListDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */					
				$(".contractDriverListName" + contractDriverListDetailVal).append(contractDriverListName);
				$(".contractDriverListLicence" + contractDriverListDetailVal).append(contractDriverListLicence);
				$(".contractDriverListExpiryDate" + contractDriverListDetailVal).append(contractDriverListExpiryDate);
				$("<img />", {
                    "src": driverSignature,
                    "class": "h-100",
                    "height":"100",
                    "width":"100"
                  }).appendTo(".driverSignature" + contractDriverListDetailVal);
				 addContractCarriageListDriverInfo("",contractDriverListDetailVal);  
				/* VALUE INCREAMENT */
				/* addcontractDriverListFormNine(); */
				contractDriverListDetailVal++;
				$("#contractDriverListDetailVal").val(contractDriverListDetailVal);
				
				/* RESET FORM FIELDS */
				$("#contractDriverListName").val("");
				$("#contractDriverListLicence").val("");
				$("#contractDriverListExpiryDate").val("");
				$("#driverSignature").html("");	
				}
		});
	}else{
		$("#contractDriverListName").focus();
	}
}

function contractDriverListDetailEditTab(contractDriverListDetailVal){
	$(".editContractDriverListDetailPopup").modal("show");
	
	$(".editContractDriverListName").attr("id" , "editContractDriverListName"+contractDriverListDetailVal);
	$(".editContractDriverListLicence").attr("id" , "editContractDriverListLicence"+contractDriverListDetailVal);
	$(".editContractDriverListExpiryDate").attr("id" , "editContractDriverListExpiryDate"+contractDriverListDetailVal);
	$(".editContractDriverSignature").attr("id" , "editContractDriverSignature"+contractDriverListDetailVal);
	
	contractDriverListName = $(".contractDriverListName"+contractDriverListDetailVal+":first").text().trim();
	contractDriverListLicence = $(".contractDriverListLicence"+contractDriverListDetailVal+":first").text().trim();
	contractDriverListExpiryDate = $(".contractDriverListExpiryDate"+contractDriverListDetailVal+":first").text().trim();
	contractDriverSignature = $(".driverSignature"+contractDriverListDetailVal+":first img").attr("src");

	$("#editContractDriverListName"+contractDriverListDetailVal).val(contractDriverListName);
	$("#editContractDriverListLicence"+contractDriverListDetailVal).val(contractDriverListLicence);
	$("#editContractDriverListExpiryDate"+contractDriverListDetailVal).val(contractDriverListExpiryDate);
	$("#editContractDriverSignature"+contractDriverListDetailVal).html("");
	$("<img />", {
        "src": contractDriverSignature,
        "class": "h-100",
        "height":"100",
        "width":"100"
      }).appendTo("#editContractDriverSignature" + contractDriverListDetailVal);
	
	$(".saveEditContractDriverListDetailPopupDataBtn").attr("onclick" , "contractDriverListDetailEditData("+contractDriverListDetailVal+")");
}
function contractDriverListDetailEditData(contractDriverListDetailVal){
	addContractCarriageListDriverInfo(contractDriverListDetailVal); 
	$(".contractDriverListName" + contractDriverListDetailVal).html($("#editContractDriverListName"+contractDriverListDetailVal).val());
	$(".contractDriverListLicence" + contractDriverListDetailVal).html($("#editContractDriverListLicence"+contractDriverListDetailVal).val());
	$(".contractDriverListExpiryDate" + contractDriverListDetailVal).html($("#editContractDriverListExpiryDate"+contractDriverListDetailVal).val());
	$(".driverSignature" + contractDriverListDetailVal).html("");
	editContractDriverSignature = $("#editContractDriverSignature"+contractDriverListDetailVal+":first img").attr("src");
	
	$("<img />", {
        "src": editContractDriverSignature,
        "class": "h-100 driverSignature",
        "height":"100",
        "width":"100"
      }).appendTo(".driverSignature" + contractDriverListDetailVal);	
	
	$(".editContractDriverListName").val("");
	$(".editContractDriverListLicence").val("");
	$(".editContractDriverListExpiryDate").val("");
	$(".editContractDriverSignature").val("");
}
	
function contractDriverListDetailDeleteData(contractDriverListDetailVal){
	deleteCarriageListOfDriverData(contractDriverListDetailVal);
	  var contractDriverListDetailCounter = $("#contractDriverListDetailVal").val();
	  $("#contractDriverListDetailVal").val(contractDriverListDetailCounter - 1);
	  var delRowElement = $(".contract-driver-list-detail-row" + contractDriverListDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(contractDriverListDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= contractDriverListDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".contract-driver-list-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "contract-driver-list-detail-row" + prevCounter);
	    
	    rowElement.find("td.contractDriverListName"+i).removeClass("contractDriverListName"+i).addClass("contractDriverListName"+prevCounter);
	    rowElement.find("td.contractDriverListLicence"+i).removeClass("contractDriverListLicence"+i).addClass("contractDriverListLicence"+prevCounter);
	    rowElement.find("td.contractDriverListExpiryDate"+i).removeClass("contractDriverListExpiryDate"+i).addClass("contractDriverListExpiryDate"+prevCounter);
	    rowElement.find("td.driverSignature"+i).removeClass("driverSignature"+i).addClass("driverSignature"+prevCounter);
	    
	    rowElement.find("#contractDriverListDetailEditTab").attr('onclick', 'contractDriverListDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#contractDriverListDetailDeleteData").attr('onclick', 'contractDriverListDetailDeleteData(' +prevCounter+ ')');
	  }
}

/*  Craft Traders Applicant */
function addCraftTradersApplicantDetail(){
	craftTradersApplicantDetailVal = $("#craftTradersApplicantDetailVal").val();
	 
	craftTradersApplicantLocation = $("#craftTradersApplicantLocation").val();

	 if(craftTradersApplicantLocation !=""){
		$(".addCraftTradersApplicantDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addCraftTradersApplicantDetailInfoUrl}",
			data : {
				"<portlet:namespace/>craftTradersApplicantDetailVal" : craftTradersApplicantDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addCraftTradersApplicantDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */					
				$(".craftTradersApplicantLocation" + craftTradersApplicantDetailVal).append(craftTradersApplicantLocation);	
				addCraftTraderApplicantInfo("");
				
				/* VALUE INCREAMENT */
				/* addcontractVehicleRegisterFormNine(); */
				craftTradersApplicantDetailVal++;
				$("#craftTradersApplicantDetailVal").val(craftTradersApplicantDetailVal);
				
				/* RESET FORM FIELDS */
				$("#craftTradersApplicantLocation").val("");
				}
		});
	}else{
		$("#craftTradersApplicantLocation").focus();
	}
}

function craftTradersApplicantDetailEditTab(craftTradersApplicantDetailVal){
	
	$(".editCraftTradersApplicantDetaiPopup").modal("show");
	
	$(".editCraftTradersApplicantLocation").attr("id" , "editCraftTradersApplicantLocation"+craftTradersApplicantDetailVal);
	
	craftTradersApplicantLocation = $(".craftTradersApplicantLocation"+craftTradersApplicantDetailVal+":first").text().trim();

	$("#editCraftTradersApplicantLocation"+craftTradersApplicantDetailVal).val(craftTradersApplicantLocation);
	
	$(".saveEditCraftTradersApplicantDetailPopupDataBtn").attr("onclick" , "craftTradersApplicantDetailEditData("+craftTradersApplicantDetailVal+")");
}
function craftTradersApplicantDetailEditData(craftTradersApplicantDetailVal){
	addCraftTraderApplicantInfo(craftTradersApplicantDetailVal);
	$(".craftTradersApplicantLocation" + craftTradersApplicantDetailVal).html($("#editCraftTradersApplicantLocation"+craftTradersApplicantDetailVal).val());
	
	$(".editCraftTradersApplicantLocation").val("");
}
	
function craftTradersApplicantDetailDeleteData(craftTradersApplicantDetailVal){
	deleteCraftTradersApplicantDetailData(craftTradersApplicantDetailVal);
	  var craftTradersApplicantDetailCounter = $("#craftTradersApplicantDetailVal").val();
	  $("#craftTradersApplicantDetailVal").val(craftTradersApplicantDetailCounter - 1);
	  var delRowElement = $(".craft-applicant-detail-row" + craftTradersApplicantDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(craftTradersApplicantDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= craftTradersApplicantDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".craft-applicant-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "craft-applicant-detail-row" + prevCounter);
	    rowElement.find("td.craftTradersApplicantLocation"+i).removeClass("craftTradersApplicantLocation"+i).addClass("craftTradersApplicantLocation"+prevCounter);
	    
	    rowElement.find("#craftTradersApplicantDetailEditTab").attr('onclick', 'craftTradersApplicantDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#craftTradersApplicantDetailDeleteData").attr('onclick', 'craftTradersApplicantDetailDeleteData(' +prevCounter+ ')');
	  }
}


/*  Craft Traders Employee Details */
function addCraftTradersEmployeeDetail(){
	craftTradersEmployeeDetailVal = $("#craftTradersEmployeeDetailVal").val();
	
	craftTradersEmployeeName = $("#craftTradersEmployeeName").val();
	craftTradersEmployeeAddress = $("#craftTradersEmployeeAddress").val();
	craftTradersEmployeePhoneNo = $("#craftTradersEmployeePhoneNo").val();
	/* craftTradersEmployeeFaxNo = $("#craftTradersEmployeeFaxNo").val(); */

	 if(craftTradersEmployeeName != "" || craftTradersEmployeeAddress !=""|| craftTradersEmployeePhoneNo !=""/* || craftTradersEmployeeFaxNo !="" */){
		$(".addCraftTradersEmployeeDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addCraftTradersEmployeeDetailInfoUrl}",
			data : {
				"<portlet:namespace/>craftTradersEmployeeDetailVal" : craftTradersEmployeeDetailVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addCraftTradersEmployeeDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */					
				$(".craftTradersEmployeeName" + craftTradersEmployeeDetailVal).append(craftTradersEmployeeName);
				$(".craftTradersEmployeeAddress" + craftTradersEmployeeDetailVal).append(craftTradersEmployeeAddress);
				$(".craftTradersEmployeePhoneNo" + craftTradersEmployeeDetailVal).append(craftTradersEmployeePhoneNo);
				/* $(".craftTradersEmployeeFaxNo" + craftTradersEmployeeDetailVal).append(craftTradersEmployeeFaxNo); */	
				addCraftTraderEmployeeInfo("");
				
				/* VALUE INCREAMENT */
				/* addcontractVehicleRegisterFormNine(); */
				craftTradersEmployeeDetailVal++;
				$("#craftTradersEmployeeDetailVal").val(craftTradersEmployeeDetailVal);
				
				/* RESET FORM FIELDS */
				$("#craftTradersEmployeeName").val("");
				$("#craftTradersEmployeeAddress").val("");
				$("#craftTradersEmployeePhoneNo").val("");
				/* $("#craftTradersEmployeeFaxNo").val(""); */
				}
		});
	}else{
		$("#craftTradersEmployeeName").focus();
	}
}
function craftTradersEmployeeDetailEditTab(craftTradersEmployeeDetailVal){
	
	$(".editCraftTradersEmployeeDetailPopup").modal("show");
	
	$(".editCraftTradersEmployeeName").attr("id" , "editCraftTradersEmployeeName"+craftTradersEmployeeDetailVal);
	$(".editCraftTradersEmployeeAddress").attr("id" , "editCraftTradersEmployeeAddress"+craftTradersEmployeeDetailVal);
	$(".editCcraftTradersEmployeePhoneNo").attr("id" , "editCcraftTradersEmployeePhoneNo"+craftTradersEmployeeDetailVal);
	
	craftTradersEmployeeName = $(".craftTradersEmployeeName"+craftTradersEmployeeDetailVal+":first").text().trim();
	craftTradersEmployeeAddress = $(".craftTradersEmployeeAddress"+craftTradersEmployeeDetailVal+":first").text().trim();
	craftTradersEmployeePhoneNo = $(".craftTradersEmployeePhoneNo"+craftTradersEmployeeDetailVal+":first").text().trim();

	$("#editCraftTradersEmployeeName"+craftTradersEmployeeDetailVal).val(craftTradersEmployeeName);
	$("#editCraftTradersEmployeeAddress"+craftTradersEmployeeDetailVal).val(craftTradersEmployeeAddress);
	$("#editCcraftTradersEmployeePhoneNo"+craftTradersEmployeeDetailVal).val(craftTradersEmployeePhoneNo);
	
	$(".saveEditCraftTradersEmployeeDetailPopupDataBtn").attr("onclick" , "editCraftTradersEmployeeDetailEditData("+craftTradersEmployeeDetailVal+")");
}
function editCraftTradersEmployeeDetailEditData(craftTradersEmployeeDetailVal){
	addCraftTraderEmployeeInfo(craftTradersEmployeeDetailVal);
	$(".craftTradersEmployeeName" + craftTradersEmployeeDetailVal).html($("#editCraftTradersEmployeeName"+craftTradersEmployeeDetailVal).val());
	$(".craftTradersEmployeeAddress" + craftTradersEmployeeDetailVal).html($("#editCraftTradersEmployeeAddress"+craftTradersEmployeeDetailVal).val());
	$(".craftTradersEmployeePhoneNo" + craftTradersEmployeeDetailVal).html($("#editCcraftTradersEmployeePhoneNo"+craftTradersEmployeeDetailVal).val());
	
	$(".editCraftTradersEmployeeName").val("");
	$(".editCraftTradersEmployeeAddress").val("");
	$(".editCcraftTradersEmployeePhoneNo").val("");
}
	
function craftTradersEmployeeDetailDeleteData(craftTradersEmployeeDetailVal){
	deleteCraftTradersEmployeeDetailData(craftTradersEmployeeDetailVal);
	  var craftTradersEmployeeDetailCounter = $("#craftTradersEmployeeDetailVal").val();
	  $("#craftTradersEmployeeDetailVal").val(craftTradersEmployeeDetailCounter - 1);
	  var delRowElement = $(".carft-employee-detail-row" + craftTradersEmployeeDetailVal); 
	  delRowElement.remove();
	  var j = parseInt(craftTradersEmployeeDetailVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= craftTradersEmployeeDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".carft-employee-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "carft-employee-detail-row" + prevCounter);
	    
	    rowElement.find("td.craftTradersEmployeeName"+i).removeClass("craftTradersEmployeeName"+i).addClass("craftTradersEmployeeName"+prevCounter);
	    rowElement.find("td.craftTradersEmployeeAddress"+i).removeClass("craftTradersEmployeeAddress"+i).addClass("craftTradersEmployeeAddress"+prevCounter);
	    rowElement.find("td.craftTradersEmployeePhoneNo"+i).removeClass("craftTradersEmployeePhoneNo"+i).addClass("craftTradersEmployeePhoneNo"+prevCounter);
	    
	    rowElement.find("#craftTradersEmployeeDetailEditTab").attr('onclick', 'craftTradersEmployeeDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#craftTradersEmployeeDetailDeleteData").attr('onclick', 'craftTradersEmployeeDetailDeleteData(' +prevCounter+ ')');
	  }
}

var operatorName1 = new Array();
var operatorLoc = new Array();
var operatorEmailAddress = new Array();
var operatorTelephone = new Array();
	function addOperatorManagerDetail(){
		 operatorManagerVal = $("#operatorManagerVal").val();
		 
		 newAttractionsOperatorName = $("#newAttractionsOperatorName").val();
		 newAttractionsLocation = $("#newAttractionsLocation").val();
		 newAttractionsEmailAddress = $("#newAttractionsEmailAddress").val();
		 newAttractionsTelephone = $("#newAttractionsTelephone").val();
		 		 
		 if(newAttractionsOperatorName != "" || newAttractionsLocation !="" || newAttractionsEmailAddress !="" || newAttractionsTelephone !=""){
			$(".addOperatorManagerDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addOperatorManagerUrl}",
				data : {
					"<portlet:namespace/>operatorManagerVal" : operatorManagerVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addOperatorManagerDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".newAttractionsOperatorName" + operatorManagerVal).append(newAttractionsOperatorName);
					$(".newAttractionsLocation" + operatorManagerVal).append(newAttractionsLocation);
					$(".newAttractionsEmailAddress" + operatorManagerVal).append(newAttractionsEmailAddress);
					$(".newAttractionsTelephone" + operatorManagerVal).append(newAttractionsTelephone);
					addAttractionOperatorManagerInfo("");
					
					/* VALUE INCREAMENT */
					
					operatorManagerVal++;
					$("#operatorManagerVal").val(operatorManagerVal);
					
					/* RESET FORM FIELDS */
					$("#newAttractionsOperatorName").val("");
					$("#newAttractionsLocation").val("");
					$("#newAttractionsEmailAddress").val("");
					$("#newAttractionsTelephone").val("");
				}
			});
			
		}else{
			$("#newAttractionsOperatorName").focus();
		}
	}
	function addOperatorManagerDetailPre(){
		operatorManagerVal = $("#operatorManagerVal").val();
		var operatorName1 = [];
		var operatorLoc = [];
		var operatorEmailAddress = [];
		var operatorTelephone = [];
		$(".operatorName").html("");
	    $(".locationAttraction").html("");
	    $(".emailAddress").html("");
	    $(".telephoneAttractionNew").html("");
	   
		for(var i = 1 ; i < operatorManagerVal ; i++){
			
			newAttractionsOperatorName = $(".newAttractionsOperatorName"+i).html();
			newAttractionsLocation = $(".newAttractionsLocation"+i).html();
			newAttractionsEmailAddress = $(".newAttractionsEmailAddress"+i).html();
			newAttractionsTelephone = $(".newAttractionsTelephone"+i).html();
			
			operatorName1.push(newAttractionsOperatorName);
			operatorLoc.push(newAttractionsLocation);
			operatorEmailAddress.push(newAttractionsEmailAddress);
			operatorTelephone.push(newAttractionsTelephone);
			
		 }
		$(".operatorName").html(operatorName1.toString());
		$(".locationAttraction").html(operatorLoc.toString());
		$(".emailAddress").html(operatorEmailAddress.toString());
		$(".telephoneAttractionNew").html(operatorTelephone.toString()); 
	}
	function operatorManagerDetailEditTab(operatorManagerVal){
			$(".editOperatorManagerDetailEditTabPopup").modal("show");
			$(".editNewAttractionsOperatorName").attr("id" , "editNewAttractionsOperatorName"+operatorManagerVal);
			$(".editNewAttractionsLocation").attr("id" , "editNewAttractionsLocation"+operatorManagerVal);
			$(".editNewAttractionsEmailAddress").attr("id" , "editNewAttractionsEmailAddress"+operatorManagerVal);
			$(".editNewAttractionsTelephone").attr("id" , "editNewAttractionsTelephone"+operatorManagerVal);
			
			newAttractionsOperatorName = $(".newAttractionsOperatorName"+operatorManagerVal+":first").text().trim();
			newAttractionsLocation = $(".newAttractionsLocation"+operatorManagerVal+":first").text().trim();
			newAttractionsEmailAddress = $(".newAttractionsEmailAddress"+operatorManagerVal+":first").text().trim();
			newAttractionsTelephone = $(".newAttractionsTelephone"+operatorManagerVal+":first").text().trim();
			
			$("#editNewAttractionsOperatorName"+operatorManagerVal).val(newAttractionsOperatorName);
			$("#editNewAttractionsLocation"+operatorManagerVal).val(newAttractionsLocation);
			$("#editNewAttractionsEmailAddress"+operatorManagerVal).val(newAttractionsEmailAddress);
			$("#editNewAttractionsTelephone"+operatorManagerVal).val(newAttractionsTelephone);
			
			$(".saveEditOperatorManagerDetailPopupDataBtn").attr("onclick" , "operatorManagerDetailEditData("+operatorManagerVal+")");
		}
	 	function operatorManagerDetailEditData(operatorManagerVal){
	 		addAttractionOperatorManagerInfo(operatorManagerVal);
			$(".newAttractionsOperatorName" + operatorManagerVal).html($("#editNewAttractionsOperatorName"+operatorManagerVal).val());
			$(".newAttractionsLocation" + operatorManagerVal).html($("#editNewAttractionsLocation"+operatorManagerVal).val());
			$(".newAttractionsEmailAddress" + operatorManagerVal).html($("#editNewAttractionsEmailAddress"+operatorManagerVal).val());
			$(".newAttractionsTelephone" + operatorManagerVal).html($("#editNewAttractionsTelephone"+operatorManagerVal).val());
			
			$(".editNewAttractionsOperatorName").val("");
			$(".editNewAttractionsLocation").val("");
			$(".editNewAttractionsEmailAddress").val("");
			$(".editNewAttractionsTelephone").val("");
	 	}
	 	
	 	function operatorManagerDetailDeleteData(operatorManagerVal) {
	 		deleteOperatorManagerDetailData(operatorManagerVal);
			  var operatorManagerDetailCounter = $("#operatorManagerVal").val();
			  $("#operatorManagerVal").val(operatorManagerDetailCounter - 1);
			  var delRowElement = $(".operator-manager-detail-row" + operatorManagerVal); 
			  delRowElement.remove();
			  var j = parseInt(operatorManagerVal) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= operatorManagerDetailCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".operator-manager-detail-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "operator-manager-detail-row" + prevCounter);
			    rowElement.find("td.newAttractionsOperatorName"+i).removeClass("newAttractionsOperatorName"+i).addClass("newAttractionsOperatorName"+prevCounter);
			    rowElement.find("td.newAttractionsLocation"+i).removeClass("newAttractionsLocation"+i).addClass("newAttractionsLocation"+prevCounter);
			    rowElement.find("td.newAttractionsEmailAddress"+i).removeClass("newAttractionsEmailAddress"+i).addClass("newAttractionsEmailAddress"+prevCounter);
			    rowElement.find("td.newAttractionsTelephone"+i).removeClass("newAttractionsTelephone"+i).addClass("newAttractionsTelephone"+prevCounter);
			    rowElement.find("#operatorManagerDetailEditTab").attr('onclick', 'operatorManagerDetailEditTab(' +prevCounter+ ')');
			    rowElement.find("#operatorManagerDetailDeleteData").attr('onclick', 'operatorManagerDetailDeleteData(' +prevCounter+ ')');
			  }
		}
	 	
	 	/* Append data to table- methods */
	 	function addCarRentalLicenceBranchDetail(counter){
	 		if(counter!=""){
				carRentalBranchDetailId = $("#carRentalBranchDetailId"+counter).val();
				carRentalOfficeLocation = $("#editCarRentalOfficeLocation"+counter).val();
				carRentalBranchTelephoneNo = $("#editCarRentalBranchTelephoneNo"+counter).val();
				}else{
				counterCarRentalBranch = $("#carRentalBranchDetailVal").val();
				carRentalOfficeLocation = $("#carRentalOfficeLocation").val();
				carRentalBranchTelephoneNo = $("#carRentalBranchTelephoneNo").val();
				carRentalBranchDetailId = $("#carRentalBranchDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterCarRentalBranch = $("#carRentalBranchDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${carRentalBranchDetailAddForm}", 
						data: {
							"<portlet:namespace/>carRentalBranchTelephoneNo": carRentalBranchTelephoneNo,
							"<portlet:namespace/>carRentalOfficeLocation": carRentalOfficeLocation,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>carRentalBranchDetailId": carRentalBranchDetailId,
							"<portlet:namespace/>counterCarRentalBranch": counterCarRentalBranch,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#carRentalBranchDetailId"+counter).val(result["carRentalBranchDetailId"]);
						},
						error: function (data) {
						}
					});
	 	}
	 	function addDomesticTourLicenceBranchDetail(counter){
	 		if(counter!=""){
				domesticTourBranchDetailId = $("#domesticTourBranchDetailId"+counter).val();
				domesticTourOfficeLocation = $("#editDomesticTourOfficeLocation"+counter).val();
				domesticTourBranchTelephoneNo = $("#editDomesticTourBranchTelephoneNo"+counter).val();
				}else{
				counterDomesticTourBranch = $("#domesticTourBranchDetailVal").val();
				domesticTourBranchTelephoneNo = $("#domesticTourBranchTelephoneNo").val();
				domesticTourOfficeLocation = $("#domesticTourOfficeLocation").val();
				domesticTourBranchDetailId = $("#domesticTourBranchDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterDomesticTourBranch = $("#domesticTourBranchDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${domesticTourBranchDetailAddForm}", 
						data: {
							"<portlet:namespace/>domesticTourBranchTelephoneNo": domesticTourBranchTelephoneNo,
							"<portlet:namespace/>domesticTourOfficeLocation": domesticTourOfficeLocation,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>domesticTourBranchDetailId": domesticTourBranchDetailId,
							"<portlet:namespace/>counterDomesticTourBranch": counterDomesticTourBranch,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#domesticTourBranchDetailId"+counter).val(result["domesticTourBranchDetailId"]);
						},
						error: function (data) {
						}
					});
	 	}
	 	function addContractCarriageListVehichleRegstInfo(counter){
	 		if(counter!=""){
				contractVehicleRegisterDetailId = $("#contractVehicleRegisterDetailId"+counter).val();
				contractVehicleRegisterYear = $("#editContractVehicleRegisterYear"+counter).val();
				contractVehicleRegisterModel = $("#editContractVehicleRegisterModel"+counter).val();
				contractVehicleRegisterPlate = $("#editContractVehicleRegisterPlate"+counter).val();
				contractVehicleRegisterExpDate = $("#editContractVehicleRegisterExpDate"+counter).val();
				contractVehicleRegisterFitnessDate = $("#editContractVehicleRegisterFitnessDate"+counter).val();
				contractVehicleRegisterChassis = $("#editContractVehicleRegisterChassis"+counter).val();
				contractVehicleRegisterBased = $("#editContractVehicleRegisterBased"+counter).val();
				contractVehicleRegisterInsuranceCom = $("#editContractVehicleRegisterInsuranceCom"+counter).val();
				contractVehicleRegisterPolicyNum = $("#editContractVehicleRegisterPolicyNum"+counter).val();
				contractVehicleRegisterExpiryDate = $("#editContractVehicleRegisterExpiryDate"+counter).val();
				}else{
				counterListVehicleRegst = $("#contractVehicleRegisterDetailVal").val();
				contractVehicleRegisterYear = $("#contractVehicleRegisterYear").val();
				contractVehicleRegisterModel = $("#contractVehicleRegisterModel").val();
				contractVehicleRegisterPlate = $("#contractVehicleRegisterPlate").val();
				contractVehicleRegisterExpDate = $("#contractVehicleRegisterExpDate").val();
				contractVehicleRegisterFitnessDate = $("#contractVehicleRegisterFitnessDate").val();
				contractVehicleRegisterChassis = $("#contractVehicleRegisterChassis").val();
				contractVehicleRegisterBased = $("#contractVehicleRegisterBased").val();
				contractVehicleRegisterInsuranceCom = $("#contractVehicleRegisterInsuranceCom").val();
				contractVehicleRegisterPolicyNum = $("#contractVehicleRegisterPolicyNum").val();
				contractVehicleRegisterExpiryDate = $("#contractVehicleRegisterExpiryDate").val();
				contractVehicleRegisterDetailId = $("#contractVehicleRegisterDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterListVehicleRegst = $("#contractVehicleRegisterDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${listVehichleRegstInfoAddForm}", 
						data: {
							"<portlet:namespace/>contractVehicleRegisterYear": contractVehicleRegisterYear,
							"<portlet:namespace/>contractVehicleRegisterModel": contractVehicleRegisterModel,
							"<portlet:namespace/>contractVehicleRegisterPlate": contractVehicleRegisterPlate,
							"<portlet:namespace/>contractVehicleRegisterExpDate": contractVehicleRegisterExpDate,
							"<portlet:namespace/>contractVehicleRegisterFitnessDate": contractVehicleRegisterFitnessDate,
							"<portlet:namespace/>contractVehicleRegisterChassis": contractVehicleRegisterChassis,
							"<portlet:namespace/>contractVehicleRegisterBased": contractVehicleRegisterBased,
							"<portlet:namespace/>contractVehicleRegisterInsuranceCom": contractVehicleRegisterInsuranceCom,
							"<portlet:namespace/>contractVehicleRegisterPolicyNum": contractVehicleRegisterPolicyNum,
							"<portlet:namespace/>contractVehicleRegisterExpiryDate": contractVehicleRegisterExpiryDate,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>contractVehicleRegisterDetailId": contractVehicleRegisterDetailId,
							"<portlet:namespace/>counterListVehicleRegst": counterListVehicleRegst,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#contractVehicleRegisterDetailId"+counter).val(result["contractVehicleRegisterDetailId"]);
						},
						error: function (data) {
						}
					});
	 	} 
	 	function addContractCarriageListDriverInfo(counter,docUploadCounter){
	 		if(counter!=""){
				contractDriverListDetailId = $("#contractDriverListDetailId"+counter).val();
				contractDriverListName = $("#editContractDriverListName"+counter).val();
				contractDriverListLicence = $("#editContractDriverListLicence"+counter).val();
				contractDriverListExpiryDate = $("#editContractDriverListExpiryDate"+counter).val();
				/* driverSignature=$("#editContractDriverSignature"+counter).html(""); */
				/* driverSignature = $("#editContractDriverSignature"+counter).val(); */
				}else if (docUploadCounter!="") {
				contractDriverListName = $("#contractDriverListName").val();
				contractDriverListLicence = $("#contractDriverListLicence").val();
				contractDriverListExpiryDate = $("#contractDriverListExpiryDate").val();
				/* driverSignature = $("#driverSignature").val(); */
				contractDriverListDetailId = $("#contractDriverListDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterDriverList = $("#contractDriverListDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${listDriverInfoAddForm}", 
						data: {
							"<portlet:namespace/>contractDriverListName": contractDriverListName,
							"<portlet:namespace/>contractDriverListLicence": contractDriverListLicence,
							"<portlet:namespace/>contractDriverListExpiryDate": contractDriverListExpiryDate,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>contractDriverListDetailId": contractDriverListDetailId,
							"<portlet:namespace/>counterDriverList": counterDriverList,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#contractDriverListDetailId"+counter).val(result["contractDriverListDetailId"]);
							uploadDocuments('contractDriverListSignatureUpload',"Driver's Signature"+counter,""); 
							
							 
						},
						error: function (data) {
						}
					});
	 	} 
	 	function addCraftTraderApplicantInfo(counter){
	 		if(counter!=""){
				craftTradersApplicantDetailId = $("#craftTradersApplicantDetailId"+counter).val();
				craftTradersApplicantLocation  = $("#editCraftTradersApplicantLocation"+counter).val();
				}else{
				counterCraftApplicant = $("#craftTradersApplicantDetailVal").val();
				craftTradersApplicantLocation  = $("#craftTradersApplicantLocation").val();
				craftTradersApplicantDetailId = $("#craftTradersApplicantDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterCraftApplicant = $("#craftTradersApplicantDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${craftTraderApplicantInfoAddForm}", 
						data: {
							"<portlet:namespace/>craftTradersApplicantLocation": craftTradersApplicantLocation ,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>craftTradersApplicantDetailId": craftTradersApplicantDetailId,
							"<portlet:namespace/>counterCraftApplicant": counterCraftApplicant,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#craftTradersApplicantDetailId"+counter).val(result["craftTradersApplicantDetailId"]);
						},
						error: function (data) {
						}
					});
	 	}
	 	function addCraftTraderEmployeeInfo(counter){
	 		if(counter!=""){
				craftTradersEmployeeDetailId = $("#craftTradersEmployeeDetailId"+counter).val();
				craftTradersEmployeeName = $("#editCraftTradersEmployeeName"+counter).val();
				craftTradersEmployeeAddress = $("#editCraftTradersEmployeeAddress"+counter).val();
				craftTradersEmployeePhoneNo = $("#editCcraftTradersEmployeePhoneNo"+counter).val();
				}else{
				counterCraftEmployee = $("#craftTradersEmployeeDetailVal").val();
				craftTradersEmployeeName = $("#craftTradersEmployeeName").val();
				craftTradersEmployeeAddress = $("#craftTradersEmployeeAddress").val();
				craftTradersEmployeePhoneNo = $("#craftTradersEmployeePhoneNo").val();
				craftTradersEmployeeDetailId = $("#craftTradersEmployeeDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterCraftEmployee = $("#craftTradersEmployeeDetailVal").val();
				  $.ajax({
						type: "POST",
						url: "${craftTraderEmployeeInfoAddForm}", 
						data: {
							"<portlet:namespace/>craftTradersEmployeeName": craftTradersEmployeeName,
							"<portlet:namespace/>craftTradersEmployeeAddress": craftTradersEmployeeAddress,
							"<portlet:namespace/>craftTradersEmployeePhoneNo": craftTradersEmployeePhoneNo,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>craftTradersEmployeeDetailId": craftTradersEmployeeDetailId,
							"<portlet:namespace/>counterCraftEmployee": counterCraftEmployee,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#craftTradersEmployeeDetailId"+counter).val(result["craftTradersEmployeeDetailId"]);
						},
						error: function (data) {
						}
					});
	 	}
	 	function addAttractionOperatorManagerInfo(counter){
	 		if(counter!=""){
				operatorManagerDetailId = $("#operatorManagerDetailId"+counter).val();
				newAttractionsOperatorName = $("#editNewAttractionsOperatorName"+counter).val();
				newAttractionsLocation = $("#editNewAttractionsLocation"+counter).val();
				newAttractionsEmailAddress = $("#editNewAttractionsEmailAddress"+counter).val();
				newAttractionsTelephone = $("#editNewAttractionsTelephone"+counter).val();
				}else{
				counterOperator = $("#operatorManagerVal").val();
				newAttractionsOperatorName = $("#newAttractionsOperatorName").val();
				 newAttractionsLocation = $("#newAttractionsLocation").val();
				 newAttractionsEmailAddress = $("#newAttractionsEmailAddress").val();
				 newAttractionsTelephone = $("#newAttractionsTelephone").val();
				operatorManagerDetailId = $("#operatorManagerDetailId").val();
				}
				jtbApplicationId = $("#jtbApplicationId").val();
				counterOperator = $("#operatorManagerVal").val();
				  $.ajax({
						type: "POST",
						url: "${operatorManagerInfoAddForm}", 
						data: {
							"<portlet:namespace/>newAttractionsOperatorName": newAttractionsOperatorName,
							"<portlet:namespace/>newAttractionsLocation": newAttractionsLocation,
							"<portlet:namespace/>newAttractionsEmailAddress": newAttractionsEmailAddress,
							"<portlet:namespace/>newAttractionsTelephone": newAttractionsTelephone,
							"<portlet:namespace/>jtbApplicationId": jtbApplicationId,
							"<portlet:namespace/>operatorManagerDetailId": operatorManagerDetailId,
							"<portlet:namespace/>counterOperator": counterOperator,
						},
						success: function (data) {
							var result=data.APP_DATA;
							var counter=result["counter"];
							$("#operatorManagerDetailId"+counter).val(result["operatorManagerDetailId"]);
						},
						error: function (data) {
						}
					});
	 	}
	 	 function deleteOperatorManagerDetailData(operatorManagerVal){
			operatorManagerDetailId=$("#operatorManagerDetailId"+operatorManagerVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteOperatorManagerAdd}", 
					data: {
						"<portlet:namespace/>operatorManagerDetailId": operatorManagerDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
	 	 function deleteCarRentalBranchOfficeDetailData(carRentalBranchDetailVal){
	 		carRentalBranchDetailId=$("#carRentalBranchDetailId"+carRentalBranchDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteCarRentalBranchOfficeDetailAdd}", 
					data: {
						"<portlet:namespace/>carRentalBranchDetailId": carRentalBranchDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
	 	 function deleteDomesticTourBranchOfficeDetailData(domesticTourBranchDetailVal){
	 		domesticTourBranchDetailId=$("#domesticTourBranchDetailId"+domesticTourBranchDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteDomesticTourBranchOfficeDetailAdd}", 
					data: {
						"<portlet:namespace/>domesticTourBranchDetailId": domesticTourBranchDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
	 	  function deleteCarriageListOfVehicleRegstData(contractVehicleRegisterDetailVal){
	 		contractVehicleRegisterDetailId=$("#contractVehicleRegisterDetailId"+contractVehicleRegisterDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteCarriageListOfVehicleRegstAdd}", 
					data: {
						"<portlet:namespace/>contractVehicleRegisterDetailId": contractVehicleRegisterDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			} 
	 	 function deleteCarriageListOfDriverData(contractDriverListDetailVal){
	 		contractDriverListDetailId=$("#contractDriverListDetailId"+contractDriverListDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteCarriageListOfDriverAdd}", 
					data: {
						"<portlet:namespace/>contractDriverListDetailId": contractDriverListDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
	 	 function deleteCraftTradersApplicantDetailData(craftTradersApplicantDetailVal){
	 		craftTradersApplicantDetailId=$("#craftTradersApplicantDetailId"+craftTradersApplicantDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteCraftTraderApplicantAdd}", 
					data: {
						"<portlet:namespace/>craftTradersApplicantDetailId": craftTradersApplicantDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
	 	 function deleteCraftTradersEmployeeDetailData(craftTradersEmployeeDetailVal){
	 		craftTradersEmployeeDetailId=$("#craftTradersEmployeeDetailId"+craftTradersEmployeeDetailVal).val();
			 $.ajax({
					type: "POST",
					url: "${deleteCraftTraderEmployeeAdd}", 
					data: {
						"<portlet:namespace/>craftTradersEmployeeDetailId": craftTradersEmployeeDetailId,
					},
					success: function (data) {
					},
					error: function (data) {
					}
				});
			}
</script>