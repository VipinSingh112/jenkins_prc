<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addPersonResponsibleInsBodiesUrl" id="person/responsible/ins/bodies/detail"/>
<portlet:resourceURL var="addStaffDetailInsBodiesUrl" id="staff/detail/ins/bodies/detail"/>
<portlet:resourceURL var="addAccreditationSoughtScopeUrl" id="accreditation/sought/scope/detail"/>
<portlet:resourceURL var="addMajorEquipmentInsBodiesUrl" id="major/equipment/ins/bodies/detail"/>
<portlet:resourceURL var="addApplicationActivityLocInsBodiesUrl" id="application/activity/loc/ins/bodies/detail"/>
<portlet:resourceURL var="addInspectionPersonnelDetailsUrl" id="inspection/personnel/details"/>
<!--make resource command of this resouce  -->
<portlet:resourceURL var="addPersonResponsibleInsBodiesDetailDataUrl" id="add/inspection/bodies/application/info"/>
<portlet:resourceURL var="addInspectionPersonnelDetailsDataUrl" id="add/inspection/bodies/organization/first"/>
<portlet:resourceURL var="addStaffDetailInsBodiesDataUrl" id="add/inspection/bodies/organization/second"/>
<portlet:resourceURL var="addAccreditationSoughtScopeDataUrl" id="add/inspection/bodies/organization/third"/>
<portlet:resourceURL var="addMajorEquipmentInsBodiesDetailDataUrl" id="add/inspection/bodies/physical/resource/first"/>
<portlet:resourceURL var="addApplicationActivityLocInsBodiesDetailDataUrl" id="add/inspection/bodies/physical/resource/second"/>
<script>
$("input[name='insBodiesLegalEntity']").change(function(){
    if($(this).val() == "Yes"){
        $(".legalStatusDescribeInsBodies").removeClass("hide");
    }else{
        $(".legalStatusDescribeInsBodies").addClass("hide");
    }
});
$("input[name='insBodyOrgPart']").change(function(){
    if($(this).val() == "Yes"){
        $(".insBodyOrgPartBoxs").removeClass("hide");
    }else{
        $(".insBodyOrgPartBoxs").addClass("hide");
    }
});
$("input[name='otherFeeReqInsBodies']").change(function(){
    if($(this).val() == "Yes"){
        $(".otherFeeReqInsBodiesBox").removeClass("hide");
    }else{
        $(".otherFeeReqInsBodiesBox").addClass("hide");
    }
});
$(".management-sys-req-ins-bodies input").change(function(){
    $(this).parent().parent().next(".managementRefInsBodies").removeClass("hide");
});
$(document).on('change', '#authorizedPersonnelInsBodiesBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#authorizedPersonnelInsBodiesImageHolder");
    var form1a_image_holder = $("#authorizedPersonnelInsBodiesImageHolderPre");
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
$(document).on('change', '#companyStampInsBodiesBtn', function() {
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#companyStampInsBodiesImageHolder");
    var form1a_image_holder = $("#companyStampInsBodiesImageHolderPre");
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
$(document).on('change', '#applicantRepresentativeInsBodiesSignatureBtn', function() {
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#applicantRepresentativeInsBodiesSignature");
    var form1a_image_holder = $("#applicantRepresentativeInsBodiesSignaturePre");
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
  function addPersonResponsibleInsBodiesDetail(){
		personResponsibleInsBodiesVal = $("#personResponsibleInsBodiesVal").val();
		
		 technicalPersonNameInsBodies = $("#technicalPersonNameInsBodies").val();
		 technicalPersonEmailInsBodies = $("#technicalPersonEmailInsBodies").val();
		 if(technicalPersonNameInsBodies != "" || technicalPersonEmailInsBodies !=""){
			$(".addPersonResponsibleDetailInsBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonResponsibleInsBodiesUrl}",
				data : {
					"<portlet:namespace/>personResponsibleInsBodiesVal" : personResponsibleInsBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonResponsibleDetailInsBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonNameInsBodies" + personResponsibleInsBodiesVal).append(technicalPersonNameInsBodies);
					$(".technicalPersonEmailInsBodies" + personResponsibleInsBodiesVal).append(technicalPersonEmailInsBodies);
					addPersonResponsibleInsBodiesDetailData("");
					personResponsibleInsBodiesVal++;
					$("#personResponsibleInsBodiesVal").val(personResponsibleInsBodiesVal);
					$("#technicalPersonNameInsBodies").val("");
					$("#technicalPersonEmailInsBodies").val("");
				}
			});
		}else{
			$("#technicalPersonNameInsBodies").focus();
		}
	}
  function personResponsibleInsBodiesEditTab(personResponsibleInsBodiesVal){
	    $(".editPersonResponsibleInsBodiesEditTabPopup").modal("show");
	    $(".editTechnicalPersonNameInsBodies").attr("id" , "editTechnicalPersonNameInsBodies"+personResponsibleInsBodiesVal);
		$(".editTechnicalPersonEmailInsBodies").attr("id" , "editTechnicalPersonEmailInsBodies"+personResponsibleInsBodiesVal);
		technicalPersonNameInsBodies = $(".technicalPersonNameInsBodies"+personResponsibleInsBodiesVal+":first").text().trim();
		technicalPersonEmailInsBodies = $(".technicalPersonEmailInsBodies"+personResponsibleInsBodiesVal+":first").text().trim();
		$("#editTechnicalPersonNameInsBodies"+personResponsibleInsBodiesVal).val(technicalPersonNameInsBodies);
		$("#editTechnicalPersonEmailInsBodies"+personResponsibleInsBodiesVal).val(technicalPersonEmailInsBodies);
		$(".saveEditPersonResponsibleInsBodiesPopupDataBtn").attr("onclick" , "personResponsibleInsBodiesEditDataTab("+personResponsibleInsBodiesVal+")");
	}
	function personResponsibleInsBodiesEditDataTab(personResponsibleInsBodiesVal){
		addPersonResponsibleInsBodiesDetailData(personResponsibleInsBodiesVal);
		$(".technicalPersonNameInsBodies" + personResponsibleInsBodiesVal).html($("#editTechnicalPersonNameInsBodies"+personResponsibleInsBodiesVal).val());
		$(".technicalPersonEmailInsBodies" + personResponsibleInsBodiesVal).html($("#editTechnicalPersonEmailInsBodies"+personResponsibleInsBodiesVal).val());
		$(".editTechnicalPersonNameInsBodies").val("");
		$(".editTechnicalPersonEmailInsBodies").val("");
	}
	function personResponsibleInsBodiesDeleteData(personResponsibleInsBodiesValData) {
		  var personResponsibleInsBodiesCountCounter = $("#personResponsibleInsBodiesVal").val();
		  $("#personResponsibleInsBodiesVal").val(personResponsibleInsBodiesCountCounter - 1);
		  var delRowElement = $(".person-responsible-ins-bodies-row" + personResponsibleInsBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(personResponsibleInsBodiesValData) + 1;
		  for (var i = j; i <= personResponsibleInsBodiesCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".person-responsible-ins-bodies-row" + i);
			rowElement.attr("class", "person-responsible-ins-bodies-row" + prevCounter);
			rowElement.find("td.technicalPersonNameInsBodies"+i).removeClass("technicalPersonNameInsBodies"+i).addClass("technicalPersonNameInsBodies"+prevCounter);
			rowElement.find("td.technicalPersonEmailInsBodies"+i).removeClass("technicalPersonEmailInsBodies"+i).addClass("technicalPersonEmailInsBodies"+prevCounter);
			rowElement.find("#personResponsibleInsBodiesDeleteDataTab").attr('onclick', 'personResponsibleInsBodiesDeleteData(' +prevCounter+ ')');
			rowElement.find("#personResponsibleInsBodiesEditTab").attr('onclick', 'personResponsibleInsBodiesEditTab(' +prevCounter+ ')');
		  }
	}
  function addStaffDetailInsBodies(){
		staffDetailInsBodiesVal = $("#staffDetailInsBodiesVal").val();
		 staffNameInsBodies = $("#staffNameInsBodies").val();
		 jobTitleInsBodies = $("#jobTitleInsBodies").val();
		 majorResponsibilitiesInsBodies = $("#majorResponsibilitiesInsBodies").val();
		 specificFunctionInsBodies = $("#specificFunctionInsBodies").val();
		 if(staffNameInsBodies != "" || jobTitleInsBodies !="" || majorResponsibilitiesInsBodies !="" || specificFunctionInsBodies !=""){
			$(".addStaffDetailInsBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailInsBodiesUrl}",
				data : {
					"<portlet:namespace/>staffDetailInsBodiesVal" : staffDetailInsBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailInsBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameInsBodies" + staffDetailInsBodiesVal).append(staffNameInsBodies);
					$(".jobTitleInsBodies" + staffDetailInsBodiesVal).append(jobTitleInsBodies);
					$(".majorResponsibilitiesInsBodies" + staffDetailInsBodiesVal).append(majorResponsibilitiesInsBodies);
					$(".specificFunctionInsBodies" + staffDetailInsBodiesVal).append(specificFunctionInsBodies);
					addStaffDetailInsBodiesData("");
					staffDetailInsBodiesVal++;
					$("#staffDetailInsBodiesVal").val(staffDetailInsBodiesVal);
					$("#staffNameInsBodies").val("");
					$("#jobTitleInsBodies").val("");
					$("#majorResponsibilitiesInsBodies").val("");
					$("#specificFunctionInsBodies").val("");
				}
			});
		}else{
			$("#staffNameInsBodies").focus();
		}
	}
    function staffDetailInsBodiesEditTab(staffDetailInsBodiesVal){
		$(".editStaffDetailInsBodiesEditTabPopup").modal("show");
		$(".editStaffNameInsBodies").attr("id" , "editStaffNameInsBodies"+staffDetailInsBodiesVal);
		$(".editJobTitleInsBodies").attr("id" , "editJobTitleInsBodies"+staffDetailInsBodiesVal);
		$(".editMajorResponsibilitiesInsBodies").attr("id" , "editMajorResponsibilitiesInsBodies"+staffDetailInsBodiesVal);
		$(".editSpecificFunctionInsBodies").attr("id" , "editSpecificFunctionInsBodies"+staffDetailInsBodiesVal);
		staffNameInsBodies = $(".staffNameInsBodies"+staffDetailInsBodiesVal+":first").text().trim();
		jobTitleInsBodies = $(".jobTitleInsBodies"+staffDetailInsBodiesVal+":first").text().trim();
		majorResponsibilitiesInsBodies = $(".majorResponsibilitiesInsBodies"+staffDetailInsBodiesVal+":first").text().trim();
		specificFunctionInsBodies = $(".specificFunctionInsBodies"+staffDetailInsBodiesVal+":first").text().trim();
		$("#editStaffNameInsBodies"+staffDetailInsBodiesVal).val(staffNameInsBodies);
		$("#editJobTitleInsBodies"+staffDetailInsBodiesVal).val(jobTitleInsBodies);
		$("#editMajorResponsibilitiesInsBodies"+staffDetailInsBodiesVal).val(majorResponsibilitiesInsBodies);
		$("#editSpecificFunctionInsBodies"+staffDetailInsBodiesVal).val(specificFunctionInsBodies);
		$(".saveEditStaffDetailInsBodiesPopupDataBtn").attr("onclick" , "staffDetailInsBodiesEditDataTab("+staffDetailInsBodiesVal+")");
	}
	function staffDetailInsBodiesEditDataTab(staffDetailInsBodiesVal){
		addStaffDetailInsBodiesData(staffDetailInsBodiesVal);
		$(".staffNameInsBodies" + staffDetailInsBodiesVal).html($("#editStaffNameInsBodies"+staffDetailInsBodiesVal).val());
		$(".jobTitleInsBodies" + staffDetailInsBodiesVal).html($("#editJobTitleInsBodies"+staffDetailInsBodiesVal).val());
		$(".majorResponsibilitiesInsBodies" + staffDetailInsBodiesVal).html($("#editMajorResponsibilitiesInsBodies"+staffDetailInsBodiesVal).val());
		$(".specificFunctionInsBodies" + staffDetailInsBodiesVal).html($("#editSpecificFunctionInsBodies"+staffDetailInsBodiesVal).val());
		$(".editStaffNameInsBodies").val("");
		$(".editJobTitleInsBodies").val("");
		$(".editMajorResponsibilitiesInsBodies").val("");
		$(".editSpecificFunctionInsBodies").val("");
	}
	function staffDetailInsBodiesDeleteData(staffDetailInsBodiesValData) {
		  var staffDetailInsBodiesCountCounter = $("#staffDetailInsBodiesVal").val();
		  $("#staffDetailInsBodiesVal").val(staffDetailInsBodiesCountCounter - 1);
		  var delRowElement = $(".staff-detail-ins-bodies-row" + staffDetailInsBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailInsBodiesValData) + 1;
		  for (var i = j; i <= staffDetailInsBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-ins-bodies-row" + i);
		    rowElement.attr("class", "staff-detail-ins-bodies-row" + prevCounter);
		    rowElement.find("td.staffNameInsBodies"+i).removeClass("staffNameInsBodies"+i).addClass("staffNameInsBodies"+prevCounter);
		    rowElement.find("td.jobTitleInsBodies"+i).removeClass("jobTitleInsBodies"+i).addClass("jobTitleInsBodies"+prevCounter);
			rowElement.find("td.majorResponsibilitiesInsBodies"+i).removeClass("majorResponsibilitiesInsBodies"+i).addClass("majorResponsibilitiesInsBodies"+prevCounter);
			rowElement.find("td.specificFunctionInsBodies"+i).removeClass("specificFunctionInsBodies"+i).addClass("specificFunctionInsBodies"+prevCounter);
		    rowElement.find("#staffDetailInsBodiesDeleteDataTab").attr('onclick', 'staffDetailInsBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailInsBodiesEditTab").attr('onclick', 'staffDetailInsBodiesEditTab(' +prevCounter+ ')');
		  }
	}
  function addAccreditationSoughtScope(){
		accreditationSoughtScopeVal = $("#accreditationSoughtScopeVal").val();
		activityInsBodies = $("#activityInsBodies").val();
		fieldInsBodies = $("#fieldInsBodies").val();
        rangeInsBodies = $("#rangeInsBodies").val();
        proceduresInsBodies = $("#proceduresInsBodies").val();
        equipmentInsBodies = $("#equipmentInsBodies").val();
        capabilityLimitInsBodies = $("#capabilityLimitInsBodies").val();
		 if(activityInsBodies != "" || fieldInsBodies !="" || rangeInsBodies !="" || proceduresInsBodies !="" || equipmentInsBodies !="" || capabilityLimitInsBodies !=""){
			$(".addAccreditationSoughtScopeTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAccreditationSoughtScopeUrl}",
				data : {
					"<portlet:namespace/>accreditationSoughtScopeVal" : accreditationSoughtScopeVal,
				},
				async:false,
				success : function(data) {
					$(".addAccreditationSoughtScopeTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".activityInsBodies" + accreditationSoughtScopeVal).append(activityInsBodies);
					$(".fieldInsBodies" + accreditationSoughtScopeVal).append(fieldInsBodies);
					$(".rangeInsBodies" + accreditationSoughtScopeVal).append(rangeInsBodies);
		            $(".proceduresInsBodies" + accreditationSoughtScopeVal).append(proceduresInsBodies);
		            $(".equipmentInsBodies" + accreditationSoughtScopeVal).append(equipmentInsBodies);
		            $(".capabilityLimitInsBodies" + accreditationSoughtScopeVal).append(capabilityLimitInsBodies);
					addAccreditationSoughtScopeData("");
					accreditationSoughtScopeVal++;
					$("#accreditationSoughtScopeVal").val(accreditationSoughtScopeVal);
					$("#activityInsBodies").val("");
					$("#fieldInsBodies").val("");
		            $("#rangeInsBodies").val("");
		         	$("#proceduresInsBodies").val("");
		            $("#equipmentInsBodies").val("");
		            $("#capabilityLimitInsBodies").val("");
				}
			});
		}else{
			$("#activityInsBodies").focus();
		}
	}
    function accreditationSoughtScopeEditTab(accreditationSoughtScopeVal){
		$(".editAccreditationSoughtScopeEditTabPopup").modal("show");
		$(".editActivityInsBodies").attr("id" , "editActivityInsBodies"+accreditationSoughtScopeVal);
		$(".editFieldInsBodies").attr("id" , "editFieldInsBodies"+accreditationSoughtScopeVal);
		$(".editRangeInsBodies").attr("id" , "editRangeInsBodies"+accreditationSoughtScopeVal);
		$(".editProceduresInsBodies").attr("id" , "editProceduresInsBodies"+accreditationSoughtScopeVal);
		$(".editEquipmentInsBodies").attr("id" , "editEquipmentInsBodies"+accreditationSoughtScopeVal);
		$(".editCapabilityLimitInsBodies").attr("id" , "editCapabilityLimitInsBodies"+accreditationSoughtScopeVal);
  		activityInsBodies = $(".activityInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		fieldInsBodies = $(".fieldInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		rangeInsBodies = $(".rangeInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		proceduresInsBodies = $(".proceduresInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		equipmentInsBodies = $(".equipmentInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		capabilityLimitInsBodies = $(".capabilityLimitInsBodies"+accreditationSoughtScopeVal+":first").text().trim();
		$("#editActivityInsBodies"+accreditationSoughtScopeVal).val(activityInsBodies);
		$("#editFieldInsBodies"+accreditationSoughtScopeVal).val(fieldInsBodies);
		$("#editRangeInsBodies"+accreditationSoughtScopeVal).val(rangeInsBodies);
		$("#editProceduresInsBodies"+accreditationSoughtScopeVal).val(proceduresInsBodies);
		$("#editEquipmentInsBodies"+accreditationSoughtScopeVal).val(equipmentInsBodies);
		$("#editCapabilityLimitInsBodies"+accreditationSoughtScopeVal).val(capabilityLimitInsBodies);
		$(".saveEditAccreditationSoughtScopePopupDataBtn").attr("onclick" , "accreditationSoughtScopeEditDataTab("+accreditationSoughtScopeVal+")");
	}
	function accreditationSoughtScopeEditDataTab(accreditationSoughtScopeVal){
		addAccreditationSoughtScopeData(accreditationSoughtScopeVal);
		$(".activityInsBodies" + accreditationSoughtScopeVal).html($("#editActivityInsBodies"+accreditationSoughtScopeVal).val());
		$(".fieldInsBodies" + accreditationSoughtScopeVal).html($("#editFieldInsBodies"+accreditationSoughtScopeVal).val());
		$(".rangeInsBodies" + accreditationSoughtScopeVal).html($("#editRangeInsBodies"+accreditationSoughtScopeVal).val());
		$(".proceduresInsBodies" + accreditationSoughtScopeVal).html($("#editProceduresInsBodies"+accreditationSoughtScopeVal).val());
		$(".equipmentInsBodies" + accreditationSoughtScopeVal).html($("#editEquipmentInsBodies"+accreditationSoughtScopeVal).val());
		$(".capabilityLimitInsBodies" + accreditationSoughtScopeVal).html($("#editCapabilityLimitInsBodies"+accreditationSoughtScopeVal).val());
		$(".editActivityInsBodies").val("");
		$(".editFieldInsBodies").val("");
		$(".editRangeInsBodies").val("");
		$(".editProceduresInsBodies").val("");
		$(".editEquipmentInsBodies").val("");
		$(".editCapabilityLimitInsBodies").val("");
	}
	function accreditationSoughtScopeDeleteData(accreditationSoughtScopeValData) {
		  var accreditationSoughtScopeValCountCounter = $("#accreditationSoughtScopeVal").val();
		  $("#accreditationSoughtScopeVal").val(accreditationSoughtScopeValCountCounter - 1);
		  var delRowElement = $(".accreditation-sought-scope-row" + accreditationSoughtScopeValData); 
		  delRowElement.remove();
		  var j = parseInt(accreditationSoughtScopeValData) + 1;
		  for (var i = j; i <= accreditationSoughtScopeValCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".accreditation-sought-scope-row" + i);
		    rowElement.attr("class", "accreditation-sought-scope-row" + prevCounter);
		    rowElement.find("td.activityInsBodies"+i).removeClass("activityInsBodies"+i).addClass("activityInsBodies"+prevCounter);
		    rowElement.find("td.fieldInsBodies"+i).removeClass("fieldInsBodies"+i).addClass("fieldInsBodies"+prevCounter);
			rowElement.find("td.rangeInsBodies"+i).removeClass("rangeInsBodies"+i).addClass("rangeInsBodies"+prevCounter);
			rowElement.find("td.proceduresInsBodies"+i).removeClass("proceduresInsBodies"+i).addClass("proceduresInsBodies"+prevCounter);
		    rowElement.find("td.equipmentInsBodies"+i).removeClass("equipmentInsBodies"+i).addClass("equipmentInsBodies"+prevCounter);
			rowElement.find("td.capabilityLimitInsBodies"+i).removeClass("capabilityLimitInsBodies"+i).addClass("capabilityLimitInsBodies"+prevCounter);
		    rowElement.find("#accreditationSoughtScopeDeleteDataTab").attr('onclick', 'accreditationSoughtScopeDeleteData(' +prevCounter+ ')');
		    rowElement.find("#accreditationSoughtScopeEditTab").attr('onclick', 'accreditationSoughtScopeEditTab(' +prevCounter+ ')');
		  }
	}
  function addMajorEquipmentInsBodiesDetail(){
		majorEquipmentInsBodiesVal = $("#majorEquipmentInsBodiesVal").val();
		 inventoryInsBodies = $("#inventoryInsBodies").val();
		 itemInsBodies = $("#itemInsBodies").val();
		 manufacturerInsBodies = $("#manufacturerInsBodies").val();
		 modelInsBodies = $("#modelInsBodies").val();
         calibrationIntervalInsBodies = $("#calibrationIntervalInsBodies").val();
         calibratedByInsBodies = $("#calibratedByInsBodies").val();
		 if(inventoryInsBodies != "" || itemInsBodies !="" || manufacturerInsBodies !="" || modelInsBodies !="" || calibrationIntervalInsBodies !="" || calibratedByInsBodies !=""){
			$(".addMajorEquipmentInsBodiesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMajorEquipmentInsBodiesUrl}",
				data : {
					"<portlet:namespace/>majorEquipmentInsBodiesVal" : majorEquipmentInsBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addMajorEquipmentInsBodiesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".inventoryInsBodies" + majorEquipmentInsBodiesVal).append(inventoryInsBodies);
					$(".itemInsBodies" + majorEquipmentInsBodiesVal).append(itemInsBodies);
					$(".manufacturerInsBodies" + majorEquipmentInsBodiesVal).append(manufacturerInsBodies);
					$(".modelInsBodies" + majorEquipmentInsBodiesVal).append(modelInsBodies);
                    $(".calibrationIntervalInsBodies" + majorEquipmentInsBodiesVal).append(calibrationIntervalInsBodies);
                    $(".calibratedByInsBodies" + majorEquipmentInsBodiesVal).append(calibratedByInsBodies);
					addMajorEquipmentInsBodiesDetailData("");
					majorEquipmentInsBodiesVal++;
					$("#majorEquipmentInsBodiesVal").val(majorEquipmentInsBodiesVal);
					$("#inventoryInsBodies").val("");
					$("#itemInsBodies").val("");
					$("#manufacturerInsBodies").val("");
					$("#modelInsBodies").val("");
                    $("#calibrationIntervalInsBodies").val("");
                    $("#calibratedByInsBodies").val("");
				}
			});
		}else{
			$("#inventoryInsBodies").focus();
		}
	}
  function majorEquipmentInsBodiesEditTab(majorEquipmentInsBodiesVal){
		$(".editMajorEquipmentInsBodiesEditTabPopup").modal("show");
		$(".editInventoryInsBodies").attr("id" , "editInventoryInsBodies"+majorEquipmentInsBodiesVal);
		$(".editItemInsBodies").attr("id" , "editItemInsBodies"+majorEquipmentInsBodiesVal);
		$(".editManufacturerInsBodies").attr("id" , "editManufacturerInsBodies"+majorEquipmentInsBodiesVal);
		$(".editModelInsBodies").attr("id" , "editModelInsBodies"+majorEquipmentInsBodiesVal);
		$(".editCalibrationIntervalInsBodies").attr("id" , "editCalibrationIntervalInsBodies"+majorEquipmentInsBodiesVal);
		$(".editCalibratedByInsBodies").attr("id" , "editCalibratedByInsBodies"+majorEquipmentInsBodiesVal);
		inventoryInsBodies = $(".inventoryInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		itemInsBodies = $(".itemInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		manufacturerInsBodies = $(".manufacturerInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		modelInsBodies = $(".modelInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		calibrationIntervalInsBodies = $(".calibrationIntervalInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		calibratedByInsBodies = $(".calibratedByInsBodies"+majorEquipmentInsBodiesVal+":first").text().trim();
		$("#editInventoryInsBodies"+majorEquipmentInsBodiesVal).val(inventoryInsBodies);
		$("#editItemInsBodies"+majorEquipmentInsBodiesVal).val(itemInsBodies);
		$("#editManufacturerInsBodies"+majorEquipmentInsBodiesVal).val(manufacturerInsBodies);
		$("#editModelInsBodies"+majorEquipmentInsBodiesVal).val(modelInsBodies);
		$("#editCalibrationIntervalInsBodies"+majorEquipmentInsBodiesVal).val(calibrationIntervalInsBodies);
		$("#editCalibratedByInsBodies"+majorEquipmentInsBodiesVal).val(calibratedByInsBodies);
		$(".saveEditMajorEquipmentInsBodiesPopupDataBtn").attr("onclick" , "majorEquipmentInsBodiesEditDataTab("+majorEquipmentInsBodiesVal+")");
	}
	function majorEquipmentInsBodiesEditDataTab(majorEquipmentInsBodiesVal){
		addMajorEquipmentInsBodiesDetailData(majorEquipmentInsBodiesVal);
		$(".inventoryInsBodies" + majorEquipmentInsBodiesVal).html($("#editInventoryInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".itemInsBodies" + majorEquipmentInsBodiesVal).html($("#editItemInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".manufacturerInsBodies" + majorEquipmentInsBodiesVal).html($("#editManufacturerInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".modelInsBodies" + majorEquipmentInsBodiesVal).html($("#editModelInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".calibrationIntervalInsBodies" + majorEquipmentInsBodiesVal).html($("#editCalibrationIntervalInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".calibratedByInsBodies" + majorEquipmentInsBodiesVal).html($("#editCalibratedByInsBodies"+majorEquipmentInsBodiesVal).val());
		$(".editInventoryInsBodies").val("");
		$(".editItemInsBodies").val("");
		$(".editManufacturerInsBodies").val("");
		$(".editModelInsBodies").val("");
		$(".editCalibrationIntervalInsBodies").val("");
		$(".editCalibratedByInsBodies").val("");
	}
	function majorEquipmentInsBodiesDeleteData(majorEquipmentInsBodiesValData) {
		  var majorEquipmentInsBodiesValCountCounter = $("#majorEquipmentInsBodiesVal").val();
		  $("#majorEquipmentInsBodiesVal").val(majorEquipmentInsBodiesValCountCounter - 1);
		  var delRowElement = $(".major-equipment-ins-bodies-row" + majorEquipmentInsBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(majorEquipmentInsBodiesValData) + 1;
		  for (var i = j; i <= majorEquipmentInsBodiesValCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".major-equipment-ins-bodies-row" + i);
		    rowElement.attr("class", "major-equipment-ins-bodies-row" + prevCounter);
		    rowElement.find("td.inventoryInsBodies"+i).removeClass("inventoryInsBodies"+i).addClass("inventoryInsBodies"+prevCounter);
		    rowElement.find("td.itemInsBodies"+i).removeClass("itemInsBodies"+i).addClass("itemInsBodies"+prevCounter);
			rowElement.find("td.manufacturerInsBodies"+i).removeClass("manufacturerInsBodies"+i).addClass("manufacturerInsBodies"+prevCounter);
			rowElement.find("td.modelInsBodies"+i).removeClass("modelInsBodies"+i).addClass("modelInsBodies"+prevCounter);
		    rowElement.find("td.calibrationIntervalInsBodies"+i).removeClass("calibrationIntervalInsBodies"+i).addClass("calibrationIntervalInsBodies"+prevCounter);
			rowElement.find("td.calibratedByInsBodies"+i).removeClass("calibratedByInsBodies"+i).addClass("calibratedByInsBodies"+prevCounter);
		    rowElement.find("#majorEquipmentInsBodiesDeleteDataTab").attr('onclick', 'majorEquipmentInsBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#majorEquipmentInsBodiesEditTab").attr('onclick', 'majorEquipmentInsBodiesEditTab(' +prevCounter+ ')');
		  }
	}
  function addApplicationActivityLocInsBodiesDetail(){
		applicationActivityLocInsBodiesVal = $("#applicationActivityLocInsBodiesVal").val();
		 numberInsBodies = $("#numberInsBodies").val();
		 applicationActivityAddressInsBodies = $("#applicationActivityAddressInsBodies").val();
		 activityPerformedLocInsBodies = $("#activityPerformedLocInsBodies").val();
		 contactDetailsInsBodies = $("#contactDetailsInsBodies").val();
		 if(numberInsBodies != "" || applicationActivityAddressInsBodies !="" || activityPerformedLocInsBodies !="" || contactDetailsInsBodies !=""){
			$(".addApplicationActivityLocInsBodiesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addApplicationActivityLocInsBodiesUrl}",
				data : {
					"<portlet:namespace/>applicationActivityLocInsBodiesVal" : applicationActivityLocInsBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addApplicationActivityLocInsBodiesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".numberInsBodies" + applicationActivityLocInsBodiesVal).append(numberInsBodies);
					$(".applicationActivityAddressInsBodies" + applicationActivityLocInsBodiesVal).append(applicationActivityAddressInsBodies);
					$(".activityPerformedLocInsBodies" + applicationActivityLocInsBodiesVal).append(activityPerformedLocInsBodies);
					$(".contactDetailsInsBodies" + applicationActivityLocInsBodiesVal).append(contactDetailsInsBodies);
					addApplicationActivityLocInsBodiesDetailData("");
					applicationActivityLocInsBodiesVal++;
					$("#applicationActivityLocInsBodiesVal").val(applicationActivityLocInsBodiesVal);
					$("#numberInsBodies").val("");
					$("#applicationActivityAddressInsBodies").val("");
					$("#activityPerformedLocInsBodies").val("");
					$("#contactDetailsInsBodies").val("");
				}
			});
		}else{
			$("#numberInsBodies").focus();
		}
	}
  function applicationActivityLocInsBodiesEditTab(applicationActivityLocInsBodiesVal){
		$(".editApplicationActivityLocInsBodiesEditTabPopup").modal("show");
		$(".editNumberInsBodies").attr("id" , "editNumberInsBodies"+applicationActivityLocInsBodiesVal);
		$(".editApplicationActivityAddressInsBodies").attr("id" , "editApplicationActivityAddressInsBodies"+applicationActivityLocInsBodiesVal);
		$(".editActivityPerformedLocInsBodies").attr("id" , "editActivityPerformedLocInsBodies"+applicationActivityLocInsBodiesVal);
		$(".editContactDetailsInsBodies").attr("id" , "editContactDetailsInsBodies"+applicationActivityLocInsBodiesVal);
		numberInsBodies = $(".numberInsBodies"+applicationActivityLocInsBodiesVal+":first").text().trim();
		applicationActivityAddressInsBodies = $(".applicationActivityAddressInsBodies"+applicationActivityLocInsBodiesVal+":first").text().trim();
		activityPerformedLocInsBodies = $(".activityPerformedLocInsBodies"+applicationActivityLocInsBodiesVal+":first").text().trim();
		contactDetailsInsBodies = $(".contactDetailsInsBodies"+applicationActivityLocInsBodiesVal+":first").text().trim();
		$("#editNumberInsBodies"+applicationActivityLocInsBodiesVal).val(numberInsBodies);
		$("#editApplicationActivityAddressInsBodies"+applicationActivityLocInsBodiesVal).val(applicationActivityAddressInsBodies);
		$("#editActivityPerformedLocInsBodies"+applicationActivityLocInsBodiesVal).val(activityPerformedLocInsBodies);
		$("#editContactDetailsInsBodies"+applicationActivityLocInsBodiesVal).val(contactDetailsInsBodies);
		$(".saveEditApplicationActivityLocInsBodiesPopupDataBtn").attr("onclick" , "applicationActivityLocInsBodiesEditDataTab("+applicationActivityLocInsBodiesVal+")");
	}
	function applicationActivityLocInsBodiesEditDataTab(applicationActivityLocInsBodiesVal){
		addApplicationActivityLocInsBodiesDetailData(applicationActivityLocInsBodiesVal);
		$(".numberInsBodies" + applicationActivityLocInsBodiesVal).html($("#editNumberInsBodies"+applicationActivityLocInsBodiesVal).val());
		$(".applicationActivityAddressInsBodies" + applicationActivityLocInsBodiesVal).html($("#editApplicationActivityAddressInsBodies"+applicationActivityLocInsBodiesVal).val());
		$(".activityPerformedLocInsBodies" + applicationActivityLocInsBodiesVal).html($("#editActivityPerformedLocInsBodies"+applicationActivityLocInsBodiesVal).val());
		$(".contactDetailsInsBodies" + applicationActivityLocInsBodiesVal).html($("#editContactDetailsInsBodies"+applicationActivityLocInsBodiesVal).val());
		$(".editNumberInsBodies").val("");
		$(".editApplicationActivityAddressInsBodies").val("");
		$(".editActivityPerformedLocInsBodies").val("");
		$(".editContactDetailsInsBodies").val("");
	}
	function applicationActivityLocInsBodiesDeleteData(applicationActivityLocInsBodiesValData) {
		  var applicationActivityLocInsBodiesCountCounter = $("#applicationActivityLocInsBodiesVal").val();
		  $("#applicationActivityLocInsBodiesVal").val(applicationActivityLocInsBodiesCountCounter - 1);
		  var delRowElement = $(".application-activity-loc-ins-bodies-row" + applicationActivityLocInsBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(applicationActivityLocInsBodiesValData) + 1;
		  for (var i = j; i <= applicationActivityLocInsBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".application-activity-loc-ins-bodies-row" + i);
		    rowElement.attr("class", "application-activity-loc-ins-bodies-row" + prevCounter);
		    rowElement.find("td.numberInsBodies"+i).removeClass("numberInsBodies"+i).addClass("numberInsBodies"+prevCounter);
		    rowElement.find("td.applicationActivityAddressInsBodies"+i).removeClass("applicationActivityAddressInsBodies"+i).addClass("applicationActivityAddressInsBodies"+prevCounter);
			rowElement.find("td.activityPerformedLocInsBodies"+i).removeClass("activityPerformedLocInsBodies"+i).addClass("activityPerformedLocInsBodies"+prevCounter);
			rowElement.find("td.contactDetailsInsBodies"+i).removeClass("contactDetailsInsBodies"+i).addClass("contactDetailsInsBodies"+prevCounter);
		    rowElement.find("#applicationActivityLocInsBodiesDeleteDataTab").attr('onclick', 'applicationActivityLocInsBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#applicationActivityLocInsBodiesEditTab").attr('onclick', 'applicationActivityLocInsBodiesEditTab(' +prevCounter+ ')');
		  }
	}
	function addInspectionPersonnelDetails(){
		inspectionPersonnelDetailsVal = $("#inspectionPersonnelDetailsVal").val();
		
		 orgPersonnelNameInsBodies = $("#orgPersonnelNameInsBodies").val();
		 orgPersonnelPositionInsBodies = $("#orgPersonnelPositionInsBodies").val();
		 if(orgPersonnelNameInsBodies != "" || orgPersonnelPositionInsBodies !=""){
			$(".addInspectionPersonnelDetailsTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addInspectionPersonnelDetailsUrl}",
				data : {
					"<portlet:namespace/>inspectionPersonnelDetailsVal" : inspectionPersonnelDetailsVal,
				},
				async:false,
				success : function(data) {
					$(".addInspectionPersonnelDetailsTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".orgPersonnelNameInsBodies" + inspectionPersonnelDetailsVal).append(orgPersonnelNameInsBodies);
					$(".orgPersonnelPositionInsBodies" + inspectionPersonnelDetailsVal).append(orgPersonnelPositionInsBodies);
					addInspectionPersonnelDetailsData("");
					inspectionPersonnelDetailsVal++;
					$("#inspectionPersonnelDetailsVal").val(inspectionPersonnelDetailsVal);
					$("#orgPersonnelNameInsBodies").val("");
					$("#orgPersonnelPositionInsBodies").val("");
				}
			});
		}else{
			$("#orgPersonnelNameInsBodies").focus();
		}
	}
	function inspectionPersonnelEditTab(inspectionPersonnelDetailsVal){
		$(".editInspectionPersonnelEditTabPopup").modal("show");
		$(".editOrgPersonnelNameInsBodies").attr("id" , "editOrgPersonnelNameInsBodies"+inspectionPersonnelDetailsVal);
		$(".editOrgPersonnelPositionInsBodies").attr("id" , "editOrgPersonnelPositionInsBodies"+inspectionPersonnelDetailsVal);
		orgPersonnelNameInsBodies = $(".orgPersonnelNameInsBodies"+inspectionPersonnelDetailsVal+":first").text().trim();
		orgPersonnelPositionInsBodies = $(".orgPersonnelPositionInsBodies"+inspectionPersonnelDetailsVal+":first").text().trim();
		$("#editOrgPersonnelNameInsBodies"+inspectionPersonnelDetailsVal).val(orgPersonnelNameInsBodies);
		$("#editOrgPersonnelPositionInsBodies"+inspectionPersonnelDetailsVal).val(orgPersonnelPositionInsBodies);
		$(".saveEditInspectionPersonnelPopupDataBtn").attr("onclick" , "inspectionPersonnelEditDataTab("+inspectionPersonnelDetailsVal+")");
	}
	function inspectionPersonnelEditDataTab(inspectionPersonnelDetailsVal){
		addInspectionPersonnelDetailsData(inspectionPersonnelDetailsVal);
		$(".orgPersonnelNameInsBodies" + inspectionPersonnelDetailsVal).html($("#editOrgPersonnelNameInsBodies"+inspectionPersonnelDetailsVal).val());
		$(".orgPersonnelPositionInsBodies" + inspectionPersonnelDetailsVal).html($("#editOrgPersonnelPositionInsBodies"+inspectionPersonnelDetailsVal).val());
		$(".editOrgPersonnelNameInsBodies").val("");
		$(".editOrgPersonnelPositionInsBodies").val("");
	}
	function inspectionPersonnelDeleteData(inspectionPersonnelDetailsValData) {
		  var inspectionPersonnelCountCounter = $("#inspectionPersonnelDetailsVal").val();
		  $("#inspectionPersonnelDetailsVal").val(inspectionPersonnelCountCounter - 1);
		  var delRowElement = $(".inspection-personnel-row" + inspectionPersonnelDetailsValData); 
		  delRowElement.remove();
		  var j = parseInt(inspectionPersonnelDetailsValData) + 1;
		  for (var i = j; i <= inspectionPersonnelCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".inspection-personnel-row" + i);
			rowElement.attr("class", "inspection-personnel-row" + prevCounter);
			rowElement.find("td.orgPersonnelNameInsBodies"+i).removeClass("orgPersonnelNameInsBodies"+i).addClass("orgPersonnelNameInsBodies"+prevCounter);
			rowElement.find("td.orgPersonnelPositionInsBodies"+i).removeClass("orgPersonnelPositionInsBodies"+i).addClass("orgPersonnelPositionInsBodies"+prevCounter);
			rowElement.find("#inspectionPersonnelDeleteDataTab").attr('onclick', 'inspectionPersonnelDeleteData(' +prevCounter+ ')');
			rowElement.find("#inspectionPersonnelEditTab").attr('onclick', 'inspectionPersonnelEditTab(' +prevCounter+ ')');
		  }
	}
	function addPersonResponsibleInsBodiesDetailData(counter) {
		if (counter != "") {
			 uniqueId = $("#personResponsibleInsBodiesId" + counter).val();
			 name = $("#technicalPersonNameInsBodies"+ counter).val();
			 email = $("#technicalPersonEmailInsBodies"+ counter).val();
		} else {
			 uniqueId = $("#personResponsibleInsBodiesId").val();
			 name = $("#technicalPersonNameInsBodies").val();
			 email = $("#technicalPersonEmailInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfInspBodiesApplicationInfo = $("#personResponsibleInsBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonResponsibleInsBodiesDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>email" : email,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfInspBodiesApplicationInfo" : counterOfInspBodiesApplicationInfo,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personResponsibleInsBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addInspectionPersonnelDetailsData(counter) {
		if (counter != "") {
			 uniqueId = $("#inspectionPersonnelId" + counter).val();
			 name = $("#orgPersonnelNameInsBodies"+ counter).val();
			 position = $("#orgPersonnelPositionInsBodies"+ counter).val();
		} else {
			 uniqueId = $("#inspectionPersonnelId").val();
			 name = $("#orgPersonnelNameInsBodies").val();
			 position = $("#orgPersonnelPositionInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOforganizationFirst = $("#inspectionPersonnelDetailsVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addInspectionPersonnelDetailsDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>position" : position,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOforganizationFirst" : counterOforganizationFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#inspectionPersonnelId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addStaffDetailInsBodiesData(counter) {
		if (counter != "") {
			 uniqueId = $("#staffDetailInsBodiesId" + counter).val();
			 nameOfStaf = $("#staffNameInsBodies"+ counter).val();
			 jobTitle = $("#jobTitleInsBodies"+ counter).val();
			 majorResponsibility = $("#majorResponsibilitiesInsBodies"+ counter).val();
			 indicateInspector = $("#specificFunctionInsBodies"+ counter).val();
		} else {
			uniqueId = $("#staffDetailInsBodiesId").val();
			 nameOfStaf = $("#staffNameInsBodies").val();
			 jobTitle = $("#jobTitleInsBodies").val();
			 majorResponsibility = $("#majorResponsibilitiesInsBodies").val();
			 indicateInspector = $("#specificFunctionInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOforganizationSecond = $("#staffDetailInsBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailInsBodiesDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>nameOfStaf" : nameOfStaf,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibility" : majorResponsibility,
						"<portlet:namespace/>indicateInspector" : indicateInspector,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOforganizationSecond" : counterOforganizationSecond,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailInsBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addAccreditationSoughtScopeData(counter) {
		if (counter != "") {
			 uniqueId = $("#accreditationSoughtScopeId" + counter).val();
			 inspectionActivity= $("#activityInsBodies"+ counter).val();
			 fieldOfInspection = $("#fieldInsBodies"+ counter).val();
			 typeAndRangeOfInspection = $("#rangeInsBodies"+ counter).val();
			 methodAndProcedure = $("#proceduresInsBodies"+ counter).val();
			 equipment = $("#equipmentInsBodies"+ counter).val();
			 limitsOfCapabilities = $("#capabilityLimitInsBodies"+ counter).val();
		} else {
			 uniqueId = $("#accreditationSoughtScopeId").val();
			 inspectionActivity= $("#activityInsBodies").val();
			 fieldOfInspection = $("#fieldInsBodies").val();
			 typeAndRangeOfInspection = $("#rangeInsBodies").val();
			 methodAndProcedure = $("#proceduresInsBodies").val();
			 equipment = $("#equipmentInsBodies").val();
			 limitsOfCapabilities = $("#capabilityLimitInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOforganizationThird = $("#accreditationSoughtScopeVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addAccreditationSoughtScopeDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>inspectionActivity" : inspectionActivity,
						"<portlet:namespace/>fieldOfInspection" : fieldOfInspection,
						"<portlet:namespace/>typeAndRangeOfInspection" : typeAndRangeOfInspection,
						"<portlet:namespace/>methodAndProcedure" : methodAndProcedure,
						"<portlet:namespace/>equipment" : equipment,
						"<portlet:namespace/>limitsOfCapabilities" : limitsOfCapabilities,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOforganizationThird" : counterOforganizationThird,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#accreditationSoughtScopeId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addMajorEquipmentInsBodiesDetailData(counter){
		if (counter != "") {
			 uniqueId = $("#majorEquipmentInsBodiesId" + counter).val();
			 inventoryNumber= $("#inventoryInsBodies"+ counter).val();
			 item = $("#itemInsBodies"+ counter).val();
			 manufacturer = $("#manufacturerInsBodies"+ counter).val();
			 modelNumber = $("#modelInsBodies"+ counter).val();
			 calibrationInterval = $("#calibrationIntervalInsBodies"+ counter).val();
			 calibratedBy = $("#calibratedByInsBodies"+ counter).val();
		} else {
			 uniqueId = $("#majorEquipmentInsBodiesId").val();
			 inventoryNumber= $("#inventoryInsBodies").val();
			 item = $("#itemInsBodies").val();
			 manufacturer = $("#manufacturerInsBodies").val();
			 modelNumber = $("#modelInsBodies").val();
			 calibrationInterval = $("#calibrationIntervalInsBodies").val();
			 calibratedBy = $("#calibratedByInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPhysicalResourceFirst = $("#accreditationSoughtScopeVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addMajorEquipmentInsBodiesDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>inventoryNumber" : inventoryNumber,
						"<portlet:namespace/>item" : item,
						"<portlet:namespace/>manufacturer" : manufacturer,
						"<portlet:namespace/>modelNumber" : modelNumber,
						"<portlet:namespace/>calibrationInterval" : calibrationInterval,
						"<portlet:namespace/>calibratedBy" : calibratedBy,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPhysicalResourceFirst" : counterOfPhysicalResourceFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#majorEquipmentInsBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addApplicationActivityLocInsBodiesDetailData(counter){
		if (counter != "") {
			 uniqueId = $("#applicationActivityLocInsBodiesId" + counter).val();
			 number= $("#numberInsBodies"+ counter).val();
			 locationAddress = $("#applicationActivityAddressInsBodies"+ counter).val();
			 activiiesPerformedLocation = $("#activityPerformedLocInsBodies"+ counter).val();
			 contactDetails = $("#contactDetailsInsBodies"+ counter).val();
		} else {
			 uniqueId = $("#applicationActivityLocInsBodiesId").val();
			 number= $("#numberInsBodies").val();
			 locationAddress = $("#applicationActivityAddressInsBodies").val();
			 activiiesPerformedLocation = $("#activityPerformedLocInsBodies").val();
			 contactDetails = $("#contactDetailsInsBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPhysicalResourceSecond = $("#accreditationSoughtScopeVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addApplicationActivityLocInsBodiesDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>number" : number,
						"<portlet:namespace/>location" : locationAddress,
						"<portlet:namespace/>activiiesPerformedLocation" : activiiesPerformedLocation,
						"<portlet:namespace/>contactDetails" : contactDetails,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPhysicalResourceSecond" : counterOfPhysicalResourceSecond,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#applicationActivityLocInsBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
</script>