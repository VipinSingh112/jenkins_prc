<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addPersonResponsibleThirdPartyUrl" id="person/responsible/third/party/detail"/>
<portlet:resourceURL var="addRegisteredClientOrgThirdPartyUrl" id="registered/client/org/third/party/detail"/>
<portlet:resourceURL var="addStaffDetailThirdPartyUrl" id="staff/detail/third/party/detail"/>
<portlet:resourceURL var="addAuditorListThirdPartyUrl" id="auditor/list/third/party/detail"/>
<portlet:resourceURL var="addOutsourceActNatureThirdPartyUrl" id="outsource/act/nature/third/party/detail"/>
<portlet:resourceURL var="addActivityPerformedLocThirdPartyUrl" id="activity/performed/loc/third/party/detail"/>
<!--make resource command of these -->
<portlet:resourceURL var="addPersonnelResponsibleDetailDataUrl" id="add/fda/approvals/application/information"/>
<portlet:resourceURL var="addRegisteredClientOrgThirdPartyDetailDataUrl" id="add/fda/approvals/scope/client/and/intrest"/>
<portlet:resourceURL var="addStaffDetailThirdPartyDataUrl" id="add/fda/personnel/and/resources/first"/>
<portlet:resourceURL var="addAuditorListThirdPartyDataUrl" id="add/fda/personnel/and/resources/second"/>
<portlet:resourceURL var="addOutsourceActNatureThirdPartyDataUrl" id="add/fda/personnel/and/resources/third"/>
<portlet:resourceURL var="addActivityPerformedLocThirdPartyDataUrl" id="add/fda/personnel/and/resources/four"/>
<script>
    $("input[name='accreditationFdaScheme']").change(function(){
        if($(this).val() == "Other"){
            $(".accreditationFdaSchemeOther").removeClass("hide");
        }else{
            $(".accreditationFdaSchemeOther").addClass("hide");
        }
    });
    $("input[name='supplementaryCertificateStandard']").change(function(){
        if($(this).val() == "Other"){
            $(".supplementaryCertificateStandardOther").removeClass("hide");
        }else{
            $(".supplementaryCertificateStandardOther").addClass("hide");
        }
    });
    $("#listOfStandardThirdParty").on('change', function(){
        $(".standard-list-third-party").html(($(this).val())); 
    });

    $("input[name='thirdPartyLegalEntity']").change(function(){
        if($(this).val() == "Yes"){
            $(".legalStatusDescribeThirdParty").removeClass("hide");
        }else{
            $(".legalStatusDescribeThirdParty").addClass("hide");
        }
    });
    $("input[name='thirdPartyOtherServices']").change(function(){
        if($(this).val() == "Yes"){
            $(".thirdPartyOtherServicesBox").removeClass("hide");
        }else{
            $(".thirdPartyOtherServicesBox").addClass("hide");
        }
    });

    $("input[name='thirdPartyEstablishedRelation']").change(function(){
        if($(this).val() == "Yes"){
            $(".thirdPartyEstablishedRelationBox").removeClass("hide");
        }else{
            $(".thirdPartyEstablishedRelationBox").addClass("hide");
        }
    });
    $("input[name='orgPreviouslyAccreditedThirdParty']").change(function(){
        if($(this).val() == "Yes"){
            $(".orgPreviouslyAccreditedThirdPartyBox").removeClass("hide");
        }else{
            $(".orgPreviouslyAccreditedThirdPartyBox").addClass("hide");
        }
    });
    $("input[name='thirdPartyBodyOutsource']").change(function(){
        if($(this).val() == "Yes"){
            $(".thirdPartyOutsourceBox").removeClass("hide");
        }else{
            $(".thirdPartyOutsourceBox").addClass("hide");
        }
    });

    $("input[name='otherFeeReqThirdParty']").change(function(){
        if($(this).val() == "Yes"){
            $(".otherFeeReqThirdPartyBox").removeClass("hide");
        }else{
            $(".otherFeeReqThirdPartyBox").addClass("hide");
        }
    });
    $("input:checkbox[name=accreditationCategory]").on("change", function() {
        toggleCategoryChecklist();
    });
    function toggleCategoryChecklist() {
    $("input:checkbox[name=accreditationCategory]").each(function() {
        if ($(this).prop("checked")) {
        $(this).parent().next('.accreditationCategoryInfo').removeClass("hide");
        } else {
        $(this).parent().next('.accreditationCategoryInfo').addClass("hide");
        }
    });
  }
    $(".management-sys-req-third-party input").change(function(){
        $(this).parent().parent().next(".managementRefThirdParty").removeClass("hide");
    });

    $(document).on('change', '#authorizedPersonnelThirdPartyBtn', function() {
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#authorizedPersonnelThirdPartyImageHolder");
        var form1a_image_holder = $("#authorizedPersonnelThirdPartyImageHolderPre");
        image_holder.empty();
        form1a_image_holder.empty();
        if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
        if (typeof(FileReader) != "undefined") {
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
    $(document).on('change', '#companyStampThirdPartyBtn', function() {
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#companyStampThirdPartyImageHolder");
        var form1a_image_holder = $("#companyStampThirdPartyImageHolderPre");
        image_holder.empty();
        form1a_image_holder.empty();
        if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
        if (typeof(FileReader) != "undefined") {
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
    
    $(document).on('change', '#applicantRepresentativeThirdPartySignatureBtn', function() {
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#applicantRepresentativeThirdPartySignature");
        var form1a_image_holder = $("#applicantRepresentativeThirdPartySignaturePre");
        image_holder.empty();
        form1a_image_holder.empty();
        if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
        if (typeof(FileReader) != "undefined") {
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
    function addThirdPartyScopeInfo(){
        var selectedScopeList = [];
        $("input[name='accreditationCategory']").each(function(){
            if($(this).prop("checked")){
                selectedScopeList.push($(this).val());
            }
        });
        if(selectedScopeList.includes("Preventive Control for Human Foods(PCHF)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Preventive Control for Human Foods(PCHF)"+'</td><td id="foodProduct1Preview"></td><td id="foodRegulation1Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Preventive Control for Animal Foods (PCAF)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Preventive Control for Animal Foods (PCAF)"+'</td><td id="foodProduct2Preview"></td><td id="foodRegulation2Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Acidified Foods (AF)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Acidified Foods (AF)"+'</td><td id="foodProduct3Preview"></td><td id="foodRegulation3Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Low-Acid Canned Foods (LACF)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Low-Acid Canned Foods (LACF)"+'</td><td id="foodProduct4Preview"></td><td id="foodRegulation4Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Juice Hazard Analysis and Critical Control Point (Juice HACCP)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Juice Hazard Analysis and Critical Control Point (Juice HACCP)"+'</td><td id="foodProduct5Preview"></td><td id="foodRegulation5Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Seafood Hazard Analysis and Critical Control Point (Seafood HACCP)")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Seafood Hazard Analysis and Critical Control Point (Seafood HACCP)"+'</td><td id="foodProduct6Preview"></td><td id="foodRegulation6Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Shell eggs")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Shell eggs"+'</td><td id="foodProduct7Preview"></td><td id="foodRegulation7Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Produce Safety")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Produce Safety"+'</td><td id="foodProduct8Preview"></td><td id="foodRegulation8Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Medicated Feed")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Medicated Feed"+'</td><td id="foodProduct9Preview"></td><td id="foodRegulation9Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Dietary Supplements")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Dietary Supplements"+'</td><td id="foodProduct10Preview"></td><td id="foodRegulation10Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Other")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Other"+'</td><td id="foodProduct11Preview"></td><td id="foodRegulation11Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
        if(selectedScopeList.includes("Other2")){
            scopeTable = document.querySelector("#scopeTable");
            scopeTableRow = document.createElement('tr');
            scopeTableRow.innerHTML = '<td>'+"Other2"+'</td><td id="foodProduct12Preview"></td><td id="foodRegulation12Preview"></td>';
            scopeTable.append(scopeTableRow);
        }
    }
    function previewThirdPartyScope(){
        $(".scope-list-checkboxes textarea").each(function(){
            if($(this).val()!=""){
            preId = $(this).prop('id')+"Preview";
            $("#"+preId).html($(this).val());
            }
        });
    }
    function addPersonResponsibleThirdPartyDetail(){
		personResponsibleThirdPartyVal = $("#personResponsibleThirdPartyVal").val();
		 technicalPersonNameThirdParty = $("#technicalPersonNameThirdParty").val();
		 technicalPersonEmailThirdParty = $("#technicalPersonEmailThirdParty").val();
		 if(technicalPersonNameThirdParty != "" || technicalPersonEmailThirdParty !=""){
			$(".addPersonResponsibleDetailThirdPartyTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonResponsibleThirdPartyUrl}",
				data : {
					"<portlet:namespace/>personResponsibleThirdPartyVal" : personResponsibleThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonResponsibleDetailThirdPartyTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonNameThirdParty" + personResponsibleThirdPartyVal).append(technicalPersonNameThirdParty);
					$(".technicalPersonEmailThirdParty" + personResponsibleThirdPartyVal).append(technicalPersonEmailThirdParty);
					addPersonResponsibleThirdPartyDetailData("");
					personResponsibleThirdPartyVal++;
					$("#personResponsibleThirdPartyVal").val(personResponsibleThirdPartyVal);
					$("#technicalPersonNameThirdParty").val("");
					$("#technicalPersonEmailThirdParty").val("");
				}
			});
		}else{
			$("#technicalPersonNameThirdParty").focus();
		}
	}
    function personResponsibleThirdPartyEditTab(personResponsibleThirdPartyVal){
    	$(".editPersonResponsibleThirdPartyEditTabPopup").modal("show");
    	$(".editTechnicalPersonNameThirdParty").attr("id" , "editTechnicalPersonNameThirdParty"+personResponsibleThirdPartyVal);
    	$(".editTechnicalPersonEmailThirdParty").attr("id" , "editTechnicalPersonEmailThirdParty"+personResponsibleThirdPartyVal);
    	technicalPersonNameThirdParty = $(".technicalPersonNameThirdParty"+personResponsibleThirdPartyVal+":first").text().trim();
    	technicalPersonEmailThirdParty = $(".technicalPersonEmailThirdParty"+personResponsibleThirdPartyVal+":first").text().trim();
    	$("#editTechnicalPersonNameThirdParty"+personResponsibleThirdPartyVal).val(technicalPersonNameThirdParty);
    	$("#editTechnicalPersonEmailThirdParty"+personResponsibleThirdPartyVal).val(technicalPersonEmailThirdParty);
    	$(".saveEditPersonResponsibleThirdPartyPopupDataBtn").attr("onclick" , "personResponsibleThirdPartyEditDataTab("+personResponsibleThirdPartyVal+")");
    }
    function personResponsibleThirdPartyEditDataTab(personResponsibleThirdPartyVal){
    	$(".technicalPersonNameThirdParty" + personResponsibleThirdPartyVal).html($("#editTechnicalPersonNameThirdParty"+personResponsibleThirdPartyVal).val());
    	$(".technicalPersonEmailThirdParty" + personResponsibleThirdPartyVal).html($("#editTechnicalPersonEmailThirdParty"+personResponsibleThirdPartyVal).val());
    	$(".editTechnicalPersonNameThirdParty").val("");
    	$(".editTechnicalPersonEmailThirdParty").val("");
    	
    }
    function personResponsibleThirdPartyDeleteData(personResponsibleThirdPartyValData) {
    	  var personResponsibleThirdPartyCountCounter = $("#personResponsibleThirdPartyVal").val();
    	  $("#personResponsibleThirdPartyVal").val(personResponsibleThirdPartyCountCounter - 1);
    	  var delRowElement = $(".personnel-responsible-third-party-row" + personResponsibleThirdPartyValData); 
    	  delRowElement.remove();
    	  var j = parseInt(personResponsibleThirdPartyValData) + 1;
    	  for (var i = j; i <= personResponsibleThirdPartyCountCounter; i++) {
    		var prevCounter = i - 1;
    		var rowElement = $(".personnel-responsible-third-party-row" + i);
    		rowElement.attr("class", "personnel-responsible-third-party-row" + prevCounter);
    		rowElement.find("td.technicalPersonNameThirdParty"+i).removeClass("technicalPersonNameThirdParty"+i).addClass("technicalPersonNameThirdParty"+prevCounter);
    		rowElement.find("td.technicalPersonEmailThirdParty"+i).removeClass("technicalPersonEmailThirdParty"+i).addClass("technicalPersonEmailThirdParty"+prevCounter);
    		rowElement.find("#personResponsibleThirdPartyDeleteDataTab").attr('onclick', 'personResponsibleThirdPartyDeleteData(' +prevCounter+ ')');
    		rowElement.find("#personResponsibleThirdPartyEditTab").attr('onclick', 'personResponsibleThirdPartyEditTab(' +prevCounter+ ')');
    	  }
    }
    function addRegisteredClientOrgThirdPartyDetail(){
		registeredClientOrgThirdPartyVal = $("#registeredClientOrgThirdPartyVal").val();
		 clientOrganizationNameThirdParty = $("#clientOrganizationNameThirdParty").val();
		 foodProductThirdParty = $("#foodProductThirdParty").val();
     	fdaRegulationsThirdParty = $("#fdaRegulationsThirdParty").val();
     	firstGrantedDateThirdParty = $("#firstGrantedDateThirdParty").val();
		 if(clientOrganizationNameThirdParty != "" || foodProductThirdParty !="" || fdaRegulationsThirdParty !="" || firstGrantedDateThirdParty !=""){
			$(".addRegisteredClientOrgThirdPartyDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRegisteredClientOrgThirdPartyUrl}",
				data : {
					"<portlet:namespace/>registeredClientOrgThirdPartyVal" : registeredClientOrgThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addRegisteredClientOrgThirdPartyDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".clientOrganizationNameThirdParty" + registeredClientOrgThirdPartyVal).append(clientOrganizationNameThirdParty);
					$(".foodProductThirdParty" + registeredClientOrgThirdPartyVal).append(foodProductThirdParty);
					$(".fdaRegulationsThirdParty" + registeredClientOrgThirdPartyVal).append(fdaRegulationsThirdParty);
          			$(".firstGrantedDateThirdParty" + registeredClientOrgThirdPartyVal).append(firstGrantedDateThirdParty);
					addRegisteredClientOrgThirdPartyDetailData("");
					registeredClientOrgThirdPartyVal++;
					$("#registeredClientOrgThirdPartyVal").val(registeredClientOrgThirdPartyVal);
					$("#clientOrganizationNameThirdParty").val("");
					$("#foodProductThirdParty").val("");
          			$("#fdaRegulationsThirdParty").val("");
         			$("#firstGrantedDateThirdParty").val("");
				}
			});
		}else{
			$("#clientOrganizationNameThirdParty").focus();
		}
	}
    function registeredClientOrgThirdPartyEditTab(registeredClientOrgThirdPartyVal){
		$(".editRegisteredClientOrgThirdPartyEditTabPopup").modal("show");
		$(".editClientOrganizationNameThirdParty").attr("id" , "editClientOrganizationNameThirdParty"+registeredClientOrgThirdPartyVal);
		$(".editFoodProductThirdParty").attr("id" , "editFoodProductThirdParty"+registeredClientOrgThirdPartyVal);
		$(".editFdaRegulationsThirdParty").attr("id" , "editFdaRegulationsThirdParty"+registeredClientOrgThirdPartyVal);
		$(".editFirstGrantedDateThirdParty").attr("id" , "editFirstGrantedDateThirdParty"+registeredClientOrgThirdPartyVal);
		clientOrganizationNameThirdParty = $(".clientOrganizationNameThirdParty"+registeredClientOrgThirdPartyVal+":first").text().trim();
		foodProductThirdParty = $(".foodProductThirdParty"+registeredClientOrgThirdPartyVal+":first").text().trim();
		fdaRegulationsThirdParty = $(".fdaRegulationsThirdParty"+registeredClientOrgThirdPartyVal+":first").text().trim();
		firstGrantedDateThirdParty = $(".firstGrantedDateThirdParty"+registeredClientOrgThirdPartyVal+":first").text().trim();
		$("#editClientOrganizationNameThirdParty"+registeredClientOrgThirdPartyVal).val(clientOrganizationNameThirdParty);
		$("#editFoodProductThirdParty"+registeredClientOrgThirdPartyVal).val(foodProductThirdParty);
		$("#editFdaRegulationsThirdParty"+registeredClientOrgThirdPartyVal).val(fdaRegulationsThirdParty);
		$("#editFirstGrantedDateThirdParty"+registeredClientOrgThirdPartyVal).val(firstGrantedDateThirdParty);
		$(".saveEditRegisteredClientOrgThirdPartyPopupDataBtn").attr("onclick" , "registeredClientOrgThirdPartyEditDataTab("+registeredClientOrgThirdPartyVal+")");
	}
	function registeredClientOrgThirdPartyEditDataTab(registeredClientOrgThirdPartyVal){
		addRegisteredClientOrgThirdPartyDetailData(registeredClientOrgThirdPartyVal);
		$(".clientOrganizationNameThirdParty" + registeredClientOrgThirdPartyVal).html($("#editClientOrganizationNameThirdParty"+registeredClientOrgThirdPartyVal).val());
		$(".foodProductThirdParty" + registeredClientOrgThirdPartyVal).html($("#editFoodProductThirdParty"+registeredClientOrgThirdPartyVal).val());
		$(".fdaRegulationsThirdParty" + registeredClientOrgThirdPartyVal).html($("#editFdaRegulationsThirdParty"+registeredClientOrgThirdPartyVal).val());
		$(".firstGrantedDateThirdParty" + registeredClientOrgThirdPartyVal).html($("#editFirstGrantedDateThirdParty"+registeredClientOrgThirdPartyVal).val());
		$(".editClientOrganizationNameThirdParty").val("");
		$(".editFoodProductThirdParty").val("");
		$(".editFdaRegulationsThirdParty").val("");
		$(".editFirstGrantedDateThirdParty").val("");
	}
	function registeredClientOrgThirdPartyDeleteData(registeredClientOrgThirdPartyValData) {
		  var registeredClientOrgThirdPartyCountCounter = $("#registeredClientOrgThirdPartyVal").val();
		  $("#registeredClientOrgThirdPartyVal").val(registeredClientOrgThirdPartyCountCounter - 1);
		  var delRowElement = $(".registered-client-org-third-party-row" + registeredClientOrgThirdPartyValData); 
		  delRowElement.remove();
		  var j = parseInt(registeredClientOrgThirdPartyValData) + 1;
		  for (var i = j; i <= registeredClientOrgThirdPartyCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".registered-client-org-third-party-row" + i);
		    rowElement.attr("class", "registered-client-org-third-party-row" + prevCounter);
		    rowElement.find("td.clientOrganizationNameThirdParty"+i).removeClass("clientOrganizationNameThirdParty"+i).addClass("clientOrganizationNameThirdParty"+prevCounter);
		    rowElement.find("td.foodProductThirdParty"+i).removeClass("foodProductThirdParty"+i).addClass("foodProductThirdParty"+prevCounter);
			rowElement.find("td.fdaRegulationsThirdParty"+i).removeClass("fdaRegulationsThirdParty"+i).addClass("fdaRegulationsThirdParty"+prevCounter);
			rowElement.find("td.firstGrantedDateThirdParty"+i).removeClass("firstGrantedDateThirdParty"+i).addClass("firstGrantedDateThirdParty"+prevCounter);
		    rowElement.find("#registeredClientOrgThirdPartyDeleteDataTab").attr('onclick', 'registeredClientOrgThirdPartyDeleteData(' +prevCounter+ ')');
		    rowElement.find("#registeredClientOrgThirdPartyEditTab").attr('onclick', 'registeredClientOrgThirdPartyEditTab(' +prevCounter+ ')');
		  }
	}
    function addStaffDetailThirdParty(){
		 staffDetailThirdPartyVal = $("#staffDetailThirdPartyVal").val();
		 staffNameThirdParty = $("#staffNameThirdParty").val();
		 jobTitleThirdParty = $("#jobTitleThirdParty").val();
		 majorResponsibilitiesThirdParty = $("#majorResponsibilitiesThirdParty").val();
		 specificFunctionThirdParty = $("#specificFunctionThirdParty").val();
		 if(staffNameThirdParty != "" || jobTitleThirdParty !="" || majorResponsibilitiesThirdParty !="" || specificFunctionThirdParty !=""){
			$(".addStaffDetailThirdPartyTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailThirdPartyUrl}",
				data : {
					"<portlet:namespace/>staffDetailThirdPartyVal" : staffDetailThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailThirdPartyTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameThirdParty" + staffDetailThirdPartyVal).append(staffNameThirdParty);
					$(".jobTitleThirdParty" + staffDetailThirdPartyVal).append(jobTitleThirdParty);
					$(".majorResponsibilitiesThirdParty" + staffDetailThirdPartyVal).append(majorResponsibilitiesThirdParty);
					$(".specificFunctionThirdParty" + staffDetailThirdPartyVal).append(specificFunctionThirdParty);
					addStaffDetailThirdPartyData("");
					staffDetailThirdPartyVal++;
					$("#staffDetailThirdPartyVal").val(staffDetailThirdPartyVal);
					$("#staffNameThirdParty").val("");
					$("#jobTitleThirdParty").val("");
					$("#majorResponsibilitiesThirdParty").val("");
					$("#specificFunctionThirdParty").val("");
				}
			});
		}else{
			$("#staffNameThirdParty").focus();
		}
	}
    function staffDetailThirdPartyEditTab(staffDetailThirdPartyVal){
		$(".editStaffDetailThirdPartyEditTabPopup").modal("show");
		$(".editStaffNameThirdParty").attr("id" , "editStaffNameThirdParty"+staffDetailThirdPartyVal);
		$(".editJobTitleThirdParty").attr("id" , "editJobTitleThirdParty"+staffDetailThirdPartyVal);
		$(".editMajorResponsibilitiesThirdParty").attr("id" , "editMajorResponsibilitiesThirdParty"+staffDetailThirdPartyVal);
		$(".editSpecificFunctionThirdParty").attr("id" , "editSpecificFunctionThirdParty"+staffDetailThirdPartyVal);
		staffNameThirdParty = $(".staffNameThirdParty"+staffDetailThirdPartyVal+":first").text().trim();
		jobTitleThirdParty = $(".jobTitleThirdParty"+staffDetailThirdPartyVal+":first").text().trim();
		majorResponsibilitiesThirdParty = $(".majorResponsibilitiesThirdParty"+staffDetailThirdPartyVal+":first").text().trim();
		specificFunctionThirdParty = $(".specificFunctionThirdParty"+staffDetailThirdPartyVal+":first").text().trim();
		$("#editStaffNameThirdParty"+staffDetailThirdPartyVal).val(staffNameThirdParty);
		$("#editJobTitleThirdParty"+staffDetailThirdPartyVal).val(jobTitleThirdParty);
		$("#editMajorResponsibilitiesThirdParty"+staffDetailThirdPartyVal).val(majorResponsibilitiesThirdParty);
		$("#editSpecificFunctionThirdParty"+staffDetailThirdPartyVal).val(specificFunctionThirdParty);
		$(".saveEditStaffDetailThirdPartyPopupDataBtn").attr("onclick" , "staffDetailThirdPartyEditDataTab("+staffDetailThirdPartyVal+")");
	}
	function staffDetailThirdPartyEditDataTab(staffDetailThirdPartyVal){
		addStaffDetailThirdPartyData(staffDetailThirdPartyVal);
		$(".staffNameThirdParty" + staffDetailThirdPartyVal).html($("#editStaffNameThirdParty"+staffDetailThirdPartyVal).val());
		$(".jobTitleThirdParty" + staffDetailThirdPartyVal).html($("#editJobTitleThirdParty"+staffDetailThirdPartyVal).val());
		$(".majorResponsibilitiesThirdParty" + staffDetailThirdPartyVal).html($("#editMajorResponsibilitiesThirdParty"+staffDetailThirdPartyVal).val());
		$(".specificFunctionThirdParty" + staffDetailThirdPartyVal).html($("#editSpecificFunctionThirdParty"+staffDetailThirdPartyVal).val());
		$(".editStaffNameThirdParty").val("");
		$(".editJobTitleThirdParty").val("");
		$(".editMajorResponsibilitiesThirdParty").val("");
		$(".editSpecificFunctionThirdParty").val("");
	}
	function staffDetailThirdPartyDeleteData(staffDetailThirdPartyValData) {
		  var staffDetailThirdPartyCountCounter = $("#staffDetailThirdPartyVal").val();
		  $("#staffDetailThirdPartyVal").val(staffDetailThirdPartyCountCounter - 1);
		  var delRowElement = $(".staff-detail-third-party-row" + staffDetailThirdPartyValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailThirdPartyValData) + 1;
		  for (var i = j; i <= staffDetailThirdPartyCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-third-party-row" + i);
		    rowElement.attr("class", "staff-detail-third-party-row" + prevCounter);
		    rowElement.find("td.staffNameThirdParty"+i).removeClass("staffNameThirdParty"+i).addClass("staffNameThirdParty"+prevCounter);
		    rowElement.find("td.jobTitleThirdParty"+i).removeClass("jobTitleThirdParty"+i).addClass("jobTitleThirdParty"+prevCounter);
			rowElement.find("td.majorResponsibilitiesThirdParty"+i).removeClass("majorResponsibilitiesThirdParty"+i).addClass("majorResponsibilitiesThirdParty"+prevCounter);
			rowElement.find("td.specificFunctionThirdParty"+i).removeClass("specificFunctionThirdParty"+i).addClass("specificFunctionThirdParty"+prevCounter);
		    rowElement.find("#staffDetailThirdPartyDeleteDataTab").attr('onclick', 'staffDetailThirdPartyDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailThirdPartyEditTab").attr('onclick', 'staffDetailThirdPartyEditTab(' +prevCounter+ ')');
		  }
	}
    function addAuditorListThirdParty(){
		auditorListThirdPartyVal = $("#auditorListThirdPartyVal").val();
		 auditorNameThirdParty = $("#auditorNameThirdParty").val();
		 auditorRoleThirdParty = $("#auditorRoleThirdParty").val();
		 auditorExpertiseAreaThirdParty = $("#auditorExpertiseAreaThirdParty").val();
		 if(auditorNameThirdParty != "" || auditorRoleThirdParty !="" || auditorExpertiseAreaThirdParty !=""){
			$(".addAuditorListThirdPartyTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAuditorListThirdPartyUrl}",
				data : {
					"<portlet:namespace/>auditorListThirdPartyVal" : auditorListThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addAuditorListThirdPartyTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".auditorNameThirdParty" + auditorListThirdPartyVal).append(auditorNameThirdParty);
					$(".auditorRoleThirdParty" + auditorListThirdPartyVal).append(auditorRoleThirdParty);
					$(".auditorExpertiseAreaThirdParty" + auditorListThirdPartyVal).append(auditorExpertiseAreaThirdParty);
					addAuditorListThirdPartyData("");
					auditorListThirdPartyVal++;
					$("#auditorListThirdPartyVal").val(auditorListThirdPartyVal);
					$("#auditorNameThirdParty").val("");
					$("#auditorRoleThirdParty").val("");
					$("#auditorExpertiseAreaThirdParty").val("");
				}
			});
		}else{
			$("#auditorNameThirdParty").focus();
		}
	}
    function auditorListThirdPartyEditTab(auditorListThirdPartyVal){
		$(".editAuditorListThirdPartyEditTabPopup").modal("show");
		$(".editAuditorNameThirdParty").attr("id" , "editAuditorNameThirdParty"+auditorListThirdPartyVal);
		$(".editAuditorRoleThirdParty").attr("id" , "editAuditorRoleThirdParty"+auditorListThirdPartyVal);
		$(".editAuditorExpertiseAreaThirdParty").attr("id" , "editAuditorExpertiseAreaThirdParty"+auditorListThirdPartyVal);
		auditorNameThirdParty = $(".auditorNameThirdParty"+auditorListThirdPartyVal+":first").text().trim();
		auditorRoleThirdParty = $(".auditorRoleThirdParty"+auditorListThirdPartyVal+":first").text().trim();
		auditorExpertiseAreaThirdParty = $(".auditorExpertiseAreaThirdParty"+auditorListThirdPartyVal+":first").text().trim();
		$("#editAuditorNameThirdParty"+auditorListThirdPartyVal).val(auditorNameThirdParty);
		$("#editAuditorRoleThirdParty"+auditorListThirdPartyVal).val(auditorRoleThirdParty);
		$("#editAuditorExpertiseAreaThirdParty"+auditorListThirdPartyVal).val(auditorExpertiseAreaThirdParty);
		$(".saveEditAuditorListThirdPartyPopupDataBtn").attr("onclick" , "auditorListThirdPartyEditDataTab("+auditorListThirdPartyVal+")");
	}
	function auditorListThirdPartyEditDataTab(auditorListThirdPartyVal){
		addAuditorListThirdPartyData(auditorListThirdPartyVal);
		$(".auditorNameThirdParty" + auditorListThirdPartyVal).html($("#editAuditorNameThirdParty"+auditorListThirdPartyVal).val());
		$(".auditorRoleThirdParty" + auditorListThirdPartyVal).html($("#editAuditorRoleThirdParty"+auditorListThirdPartyVal).val());
		$(".auditorExpertiseAreaThirdParty" + auditorListThirdPartyVal).html($("#editAuditorExpertiseAreaThirdParty"+auditorListThirdPartyVal).val());
		$(".editAuditorNameThirdParty").val("");
		$(".editAuditorRoleThirdParty").val("");
		$(".editAuditorExpertiseAreaThirdParty").val("");
	}
	function auditorListThirdPartyDeleteData(auditorListThirdPartyValData) {
		  var auditorListThirdPartyCountCounter = $("#auditorListThirdPartyVal").val();
		  $("#auditorListThirdPartyVal").val(auditorListThirdPartyCountCounter - 1);
		  var delRowElement = $(".auditor-list-third-party-row" + auditorListThirdPartyValData); 
		  delRowElement.remove();
		  var j = parseInt(auditorListThirdPartyValData) + 1;
		  for (var i = j; i <= auditorListThirdPartyCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".auditor-list-third-party-row" + i);
		    rowElement.attr("class", "auditor-list-third-party-row" + prevCounter);
		    rowElement.find("td.auditorNameThirdParty"+i).removeClass("auditorNameThirdParty"+i).addClass("auditorNameThirdParty"+prevCounter);
		    rowElement.find("td.auditorRoleThirdParty"+i).removeClass("auditorRoleThirdParty"+i).addClass("auditorRoleThirdParty"+prevCounter);
			 rowElement.find("td.auditorExpertiseAreaThirdParty"+i).removeClass("auditorExpertiseAreaThirdParty"+i).addClass("auditorExpertiseAreaThirdParty"+prevCounter);
		    rowElement.find("#auditorListThirdPartyDeleteDataTab").attr('onclick', 'auditorListThirdPartyDeleteData(' +prevCounter+ ')');
		    rowElement.find("#auditorListThirdPartyEditTab").attr('onclick', 'auditorListThirdPartyEditTab(' +prevCounter+ ')');
		  }
	}
    function addOutsourceActNatureThirdParty(){
		outsourceActNatureThirdPartyVal = $("#outsourceActNatureThirdPartyVal").val();
		 outsourcedActivityThirdParty = $("#outsourcedActivityThirdParty").val();
		 serviceProvdierThirdParty = $("#serviceProvdierThirdParty").val();
		 if(outsourcedActivityThirdParty != "" || serviceProvdierThirdParty !=""){
			$(".addOutsourceActNatureThirdPartyTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addOutsourceActNatureThirdPartyUrl}",
				data : {
					"<portlet:namespace/>outsourceActNatureThirdPartyVal" : outsourceActNatureThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addOutsourceActNatureThirdPartyTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".outsourcedActivityThirdParty" + outsourceActNatureThirdPartyVal).append(outsourcedActivityThirdParty);
					$(".serviceProvdierThirdParty" + outsourceActNatureThirdPartyVal).append(serviceProvdierThirdParty);
					addOutsourceActNatureThirdPartyData("");
					outsourceActNatureThirdPartyVal++;
					$("#outsourceActNatureThirdPartyVal").val(outsourceActNatureThirdPartyVal);
					$("#outsourcedActivityThirdParty").val("");
					$("#serviceProvdierThirdParty").val("");
				}
			});
		}else{
			$("#outsourcedActivityThirdParty").focus();
		}
	}
    function outsourceActNatureThirdPartyEditTab(outsourceActNatureThirdPartyVal){
    	$(".editOutsourceActNatureThirdPartyEditTabPopup").modal("show");
    	$(".editOutsourcedActivityThirdParty").attr("id" , "editOutsourcedActivityThirdParty"+outsourceActNatureThirdPartyVal);
    	$(".editServiceProvdierThirdParty").attr("id" , "editServiceProvdierThirdParty"+outsourceActNatureThirdPartyVal);
    	outsourcedActivityThirdParty = $(".outsourcedActivityThirdParty"+outsourceActNatureThirdPartyVal+":first").text().trim();
    	serviceProvdierThirdParty = $(".serviceProvdierThirdParty"+outsourceActNatureThirdPartyVal+":first").text().trim();
    	$("#editOutsourcedActivityThirdParty"+outsourceActNatureThirdPartyVal).val(outsourcedActivityThirdParty);
    	$("#editServiceProvdierThirdParty"+outsourceActNatureThirdPartyVal).val(serviceProvdierThirdParty);
    	$(".saveEditOutsourceActNatureThirdPartyPopupDataBtn").attr("onclick" , "outsourceActNatureThirdPartyEditDataTab("+outsourceActNatureThirdPartyVal+")");
    }
    function outsourceActNatureThirdPartyEditDataTab(outsourceActNatureThirdPartyVal){
    	addOutsourceActNatureThirdPartyData(outsourceActNatureThirdPartyVal);
    	$(".outsourcedActivityThirdParty" + outsourceActNatureThirdPartyVal).html($("#editOutsourcedActivityThirdParty"+outsourceActNatureThirdPartyVal).val());
    	$(".serviceProvdierThirdParty" + outsourceActNatureThirdPartyVal).html($("#editServiceProvdierThirdParty"+outsourceActNatureThirdPartyVal).val());
    	$(".editOutsourcedActivityThirdParty").val("");
    	$(".editServiceProvdierThirdParty").val("");
    	
    }
    function outsourceActNatureThirdPartyDeleteData(outsourceActNatureThirdPartyValData) {
    	  var outsourceActNatureThirdPartyCountCounter = $("#outsourceActNatureThirdPartyVal").val();
    	  $("#outsourceActNatureThirdPartyVal").val(outsourceActNatureThirdPartyCountCounter - 1);
    	  var delRowElement = $(".outsource-act-nature-third-party-row" + outsourceActNatureThirdPartyValData); 
    	  delRowElement.remove();
    	  var j = parseInt(outsourceActNatureThirdPartyValData) + 1;
    	  for (var i = j; i <= outsourceActNatureThirdPartyCountCounter; i++) {
    		var prevCounter = i - 1;
    		var rowElement = $(".outsource-act-nature-third-party-row" + i);
    		rowElement.attr("class", "outsource-act-nature-third-party-row" + prevCounter);
    		rowElement.find("td.outsourcedActivityThirdParty"+i).removeClass("outsourcedActivityThirdParty"+i).addClass("outsourcedActivityThirdParty"+prevCounter);
    		rowElement.find("td.serviceProvdierThirdParty"+i).removeClass("serviceProvdierThirdParty"+i).addClass("serviceProvdierThirdParty"+prevCounter);
    		rowElement.find("#outsourceActNatureThirdPartyDeleteDataTab").attr('onclick', 'outsourceActNatureThirdPartyDeleteData(' +prevCounter+ ')');
    		rowElement.find("#outsourceActNatureThirdPartyEditTab").attr('onclick', 'outsourceActNatureThirdPartyEditTab(' +prevCounter+ ')');
    	  }
    }

    function addActivityPerformedLocThirdParty(){
		activityPerformedLocThirdPartyVal = $("#activityPerformedLocThirdPartyVal").val();
		
		 activityLocNumThirdParty = $("#activityLocNumThirdParty").val();
		 activityLocationThirdParty = $("#activityLocationThirdParty").val();
		 certifiedActivityLocationThirdParty = $("#certifiedActivityLocationThirdParty").val();
		 activityContactDetailThirdParty = $("#activityContactDetailThirdParty").val();
		 if(activityLocNumThirdParty != "" || activityLocationThirdParty !="" || certifiedActivityLocationThirdParty !="" || activityContactDetailThirdParty !=""){
			$(".addActivityPerformedLocThirdPartyTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addActivityPerformedLocThirdPartyUrl}",
				data : {
					"<portlet:namespace/>activityPerformedLocThirdPartyVal" : activityPerformedLocThirdPartyVal,
				},
				async:false,
				success : function(data) {
					$(".addActivityPerformedLocThirdPartyTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".activityLocNumThirdParty" + activityPerformedLocThirdPartyVal).append(activityLocNumThirdParty);
					$(".activityLocationThirdParty" + activityPerformedLocThirdPartyVal).append(activityLocationThirdParty);
					$(".certifiedActivityLocationThirdParty" + activityPerformedLocThirdPartyVal).append(certifiedActivityLocationThirdParty);
					$(".activityContactDetailThirdParty" + activityPerformedLocThirdPartyVal).append(activityContactDetailThirdParty);
					addActivityPerformedLocThirdPartyData("");
					activityPerformedLocThirdPartyVal++;
					$("#activityPerformedLocThirdPartyVal").val(activityPerformedLocThirdPartyVal);
					$("#activityLocNumThirdParty").val("");
					$("#activityLocationThirdParty").val("");
					$("#certifiedActivityLocationThirdParty").val("");
					$("#activityContactDetailThirdParty").val("");
				}
			});
		}else{
			$("#activityLocNumThirdParty").focus();
		}
	}
    function activityPerformedLocEditTab(activityPerformedLocThirdPartyVal){
		$(".editActivityPerformedNoEditTabPopup").modal("show");
		$(".editActivityLocNumThirdParty").attr("id" , "editActivityLocNumThirdParty"+activityPerformedLocThirdPartyVal);
		$(".editActivityLocationThirdParty").attr("id" , "editActivityLocationThirdParty"+activityPerformedLocThirdPartyVal);
		$(".editCertifiedActivityLocationThirdParty").attr("id" , "editCertifiedActivityLocationThirdParty"+activityPerformedLocThirdPartyVal);
		$(".editActivityContactDetailThirdParty").attr("id" , "editActivityContactDetailThirdParty"+activityPerformedLocThirdPartyVal);
		activityLocNumThirdParty = $(".activityLocNumThirdParty"+activityPerformedLocThirdPartyVal+":first").text().trim();
		activityLocationThirdParty = $(".activityLocationThirdParty"+activityPerformedLocThirdPartyVal+":first").text().trim();
		certifiedActivityLocationThirdParty = $(".certifiedActivityLocationThirdParty"+activityPerformedLocThirdPartyVal+":first").text().trim();
		activityContactDetailThirdParty = $(".activityContactDetailThirdParty"+activityPerformedLocThirdPartyVal+":first").text().trim();
		$("#editActivityLocNumThirdParty"+activityPerformedLocThirdPartyVal).val(activityLocNumThirdParty);
		$("#editActivityLocationThirdParty"+activityPerformedLocThirdPartyVal).val(activityLocationThirdParty);
		$("#editCertifiedActivityLocationThirdParty"+activityPerformedLocThirdPartyVal).val(certifiedActivityLocationThirdParty);
		$("#editActivityContactDetailThirdParty"+activityPerformedLocThirdPartyVal).val(activityContactDetailThirdParty);
		$(".saveEditActivityPerformedLocNoPopupDataBtn").attr("onclick" , "activityPerformedLocEditDataTab("+activityPerformedLocThirdPartyVal+")");
	}
	function activityPerformedLocEditDataTab(activityPerformedLocThirdPartyVal){
		addActivityPerformedLocThirdPartyData(activityPerformedLocThirdPartyVal);
		$(".activityLocNumThirdParty" + activityPerformedLocThirdPartyVal).html($("#editActivityLocNumThirdParty"+activityPerformedLocThirdPartyVal).val());
		$(".activityLocationThirdParty" + activityPerformedLocThirdPartyVal).html($("#editActivityLocationThirdParty"+activityPerformedLocThirdPartyVal).val());
		$(".certifiedActivityLocationThirdParty" + activityPerformedLocThirdPartyVal).html($("#editCertifiedActivityLocationThirdParty"+activityPerformedLocThirdPartyVal).val());
		$(".activityContactDetailThirdParty" + activityPerformedLocThirdPartyVal).html($("#editActivityContactDetailThirdParty"+activityPerformedLocThirdPartyVal).val());
		$(".editActivityLocNumThirdParty").val("");
		$(".editActivityLocationThirdParty").val("");
		$(".editCertifiedActivityLocationThirdParty").val("");
		$(".editActivityContactDetailThirdParty").val("");
	}
	function activityPerformedLocDeleteData(activityPerformedLocThirdPartyValData) {
		  var activityPerformedLocCountCounter = $("#activityPerformedLocThirdPartyVal").val();
		  $("#activityPerformedLocThirdPartyVal").val(activityPerformedLocCountCounter - 1);
		  var delRowElement = $(".activity-performed-third-party-row" + activityPerformedLocThirdPartyValData); 
		  delRowElement.remove();
		  var j = parseInt(activityPerformedLocThirdPartyValData) + 1;
		  for (var i = j; i <= activityPerformedLocCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".activity-performed-third-party-row" + i);
		    rowElement.attr("class", "activity-performed-third-party-row" + prevCounter);
		    rowElement.find("td.activityLocNumThirdParty"+i).removeClass("activityLocNumThirdParty"+i).addClass("activityLocNumThirdParty"+prevCounter);
		    rowElement.find("td.activityLocationThirdParty"+i).removeClass("activityLocationThirdParty"+i).addClass("activityLocationThirdParty"+prevCounter);
			rowElement.find("td.certifiedActivityLocationThirdParty"+i).removeClass("certifiedActivityLocationThirdParty"+i).addClass("certifiedActivityLocationThirdParty"+prevCounter);
			rowElement.find("td.activityContactDetailThirdParty"+i).removeClass("activityContactDetailThirdParty"+i).addClass("activityContactDetailThirdParty"+prevCounter);
		    rowElement.find("#activityPerformedLocDeleteDataTab").attr('onclick', 'activityPerformedLocDeleteData(' +prevCounter+ ')');
		    rowElement.find("#activityPerformedLocEditTab").attr('onclick', 'activityPerformedLocEditTab(' +prevCounter+ ')');
		  }
	}
	function addPersonResponsibleThirdPartyDetailData(counter) {
		if (counter != "") {
		uniqueId = $("#personResponsibleThirdPartyId" + counter).val();
    	name = $("#technicalPersonNameThirdParty"+ counter).val();
	    email = $("#technicalPersonEmailThirdParty"+ counter).val();
		} else {
			uniqueId = $("#personResponsibleThirdPartyId").val();
	    	name = $("#technicalPersonNameThirdParty").val();
		    email = $("#technicalPersonEmailThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaAppliInfo=$("#personResponsibleThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonnelResponsibleDetailDataUrl}",
					data : {
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>email" : email,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaAppliInfo" : counterOfFdaAppliInfo,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personResponsibleThirdPartyId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addRegisteredClientOrgThirdPartyDetailData(counter) {
		if (counter != "") {
		uniqueId = $("#registeredClientOrgThirdPartyId" + counter).val();
    	clientOrganization = $("#clientOrganizationNameThirdParty"+ counter).val();
	    foodProduct = $("#foodProductThirdParty"+ counter).val();
	    fdaRegulations = $("#fdaRegulationsThirdParty"+ counter).val();
	    dateGranted = $("#firstGrantedDateThirdParty"+ counter).val();
		} else {
			uniqueId = $("#registeredClientOrgThirdPartyId").val();
	    	clientOrganization = $("#clientOrganizationNameThirdParty").val();
		    foodProduct = $("#foodProductThirdParty").val();
		    fdaRegulations = $("#fdaRegulationsThirdParty").val();
		    dateGranted = $("#firstGrantedDateThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaScopeclientAndIntrested=$("#registeredClientOrgThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addRegisteredClientOrgThirdPartyDetailDataUrl}",
					data : {
						"<portlet:namespace/>clientOrganization" : clientOrganization,
						"<portlet:namespace/>foodProduct" : foodProduct,
						"<portlet:namespace/>fdaRegulations" : fdaRegulations,
						"<portlet:namespace/>dateGranted" : dateGranted,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaScopeclientAndIntrested" : counterOfFdaScopeclientAndIntrested,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#registeredClientOrgThirdPartyId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addStaffDetailThirdPartyData(counter) {
		if (counter != "") {
		uniqueId = $("#staffDetailThirdPartyId" + counter).val();
    	nameOfStaffMember = $("#staffNameThirdParty"+ counter).val();
	    jobTitle = $("#jobTitleThirdParty"+ counter).val();
	    majorResponsibility = $("#majorResponsibilitiesThirdParty"+ counter).val();
	    specificFunction = $("#specificFunctionThirdParty"+ counter).val();
		} else {
			uniqueId = $("#staffDetailThirdPartyId").val();
	    	nameOfStaffMember = $("#staffNameThirdParty").val();
		    jobTitle = $("#jobTitleThirdParty").val();
		    majorResponsibility = $("#majorResponsibilitiesThirdParty").val();
		    specificFunction = $("#specificFunctionThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaPersonalFirst=$("#staffDetailThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailThirdPartyDataUrl}",
					data : {
						"<portlet:namespace/>nameOfStaffMember" : nameOfStaffMember,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibility" : majorResponsibility,
						"<portlet:namespace/>specificFunction" : specificFunction,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaPersonalFirst" : counterOfFdaPersonalFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailThirdPartyId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addAuditorListThirdPartyData(counter) {
		if (counter != "") {
		uniqueId = $("#auditorListThirdPartyId" + counter).val();
    	name = $("#auditorNameThirdParty"+ counter).val();
	    role = $("#auditorRoleThirdParty"+ counter).val();
	    fdaRegulation = $("#auditorExpertiseAreaThirdParty"+ counter).val();
		} else {
			uniqueId = $("#auditorListThirdPartyId").val();
	    	name = $("#auditorNameThirdParty").val();
		    role = $("#auditorRoleThirdParty").val();
		    fdaRegulation = $("#auditorExpertiseAreaThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaPersonalSecond=$("#auditorListThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addAuditorListThirdPartyDataUrl}",
					data : {
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>role" : role,
						"<portlet:namespace/>fdaRegulation" : fdaRegulation,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaPersonalSecond" : counterOfFdaPersonalSecond,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#auditorListThirdPartyId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function addOutsourceActNatureThirdPartyData(counter) {
		if (counter != "") {
		uniqueId = $("#outsourceActNatureThirdPartyId" + counter).val();
    	outSourcedActivity = $("#outsourcedActivityThirdParty"+ counter).val();
	    supplierServicePro = $("#serviceProvdierThirdParty"+ counter).val();
		} else {
			uniqueId = $("#outsourceActNatureThirdPartyId").val();
	    	outSourcedActivity = $("#outsourcedActivityThirdParty").val();
		    supplierServicePro = $("#serviceProvdierThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaPersonalThird=$("#outsourceActNatureThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addOutsourceActNatureThirdPartyDataUrl}",
					data : {
						"<portlet:namespace/>outSourcedActivity" : outSourcedActivity,
						"<portlet:namespace/>supplierServicePro" : supplierServicePro,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaPersonalThird" : counterOfFdaPersonalThird,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#outsourceActNatureThirdPartyId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addActivityPerformedLocThirdPartyData(counter) {
		if (counter != "") {
		uniqueId = $("#activityPerformedLocId" + counter).val();
    	number = $("#activityLocNumThirdParty"+ counter).val();
	    locationAddress = $("#activityLocationThirdParty"+ counter).val();
		certificationActivities = $("#certifiedActivityLocationThirdParty"+ counter).val();
	    contactDetails = $("#activityContactDetailThirdParty"+ counter).val();
		} else {
			uniqueId = $("#activityPerformedLocId").val();
	    	number = $("#activityLocNumThirdParty").val();
		    locationAddress = $("#activityLocationThirdParty").val();
			certificationActivities = $("#certifiedActivityLocationThirdParty").val();
		    contactDetails = $("#activityContactDetailThirdParty").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaPersonalFour=$("#outsourceActNatureThirdPartyVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addActivityPerformedLocThirdPartyDataUrl}",
					data : {
						"<portlet:namespace/>number" : number,
						"<portlet:namespace/>locationAddress" : locationAddress,
						"<portlet:namespace/>certificationActivities" : certificationActivities,
						"<portlet:namespace/>contactDetails" : contactDetails,
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfFdaPersonalFour" : counterOfFdaPersonalFour,
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
</script>