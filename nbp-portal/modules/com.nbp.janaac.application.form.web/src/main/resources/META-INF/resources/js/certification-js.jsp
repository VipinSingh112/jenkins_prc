<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addPersonnelResponsibleCerUrl" id="personnel/responsible/cer/detail"/>
<portlet:resourceURL var="addRegisteredClientOrgUrl" id="registered/client/org/detail"/>
<portlet:resourceURL var="addStaffDetailCerUrl" id="staff/detail/cer/detail"/>
<portlet:resourceURL var="addAuditorListUrl" id="auditor/list/detail"/>
<portlet:resourceURL var="addOutsourceActNatureUrl" id="outsource/act/nature/detail"/>
<portlet:resourceURL var="addActivityPerformLocationsUrl" id="activity/perform/locations/detail"/>
<portlet:resourceURL var="addPersonnelResponsibleCerProductUrl" id="personnel/responsible/cer/product/detail"/>

<!--make resouce command of these function  -->

<script>
$("input[name='managementSystem']").change(function(){
    if($(this).val() == "Other"){
        $(".otherManagementSystem").removeClass("hide");
    }else{
        $(".otherManagementSystem").addClass("hide");
    }
});
$("input[name='certificationLegalEntity']").change(function(){
    if($(this).val() == "Yes"){
        $(".legalStatusDescribe").removeClass("hide");
    }else{
        $(".legalStatusDescribe").addClass("hide");
    }
});
$("input[name='certificationOtherServices']").change(function(){
    if($(this).val() == "Yes"){
        $(".certificationOtherServicesBox").removeClass("hide");
    }else{
        $(".certificationOtherServicesBox").addClass("hide");
    }
});
$("input[name='certificationEstablishedRelation']").change(function(){
    if($(this).val() == "Yes"){
        $(".certificationEstablishedRelationBox").removeClass("hide");
    }else{
        $(".certificationEstablishedRelationBox").addClass("hide");
    }
});
$("input[name='orgAccreditedAnotherAccreditation']").change(function(){
    if($(this).val() == "Yes"){
        $(".orgAccreditedAnotherAccreditationBox").removeClass("hide");
    }else{
        $(".orgAccreditedAnotherAccreditationBox").addClass("hide");
    }
});
$("input[name='certificationBodyOutsource']").change(function(){
    if($(this).val() == "Yes"){
        $(".certificationBodyOutsourceBox").removeClass("hide");
    }else{
        $(".certificationBodyOutsourceBox").addClass("hide");
    }
});
$("input[name='otherFeeReq']").change(function(){
    if($(this).val() == "Yes"){
        $(".otherFeeReqBox").removeClass("hide");
    }else{
        $(".otherFeeReqBox").addClass("hide");
    }
});
$("input[name='managementImplementedWithOrg']").change(function(){
    if($(this).val() == "Option A"){
        $(".option-a").removeClass("hide");
        $(".option-b").addClass("hide");
    }else if($(this).val() == "Option B"){
        $(".option-b").removeClass("hide");
        $(".option-a").addClass("hide");
    }
});
$("#listOfStandard").on('change', function(){
   $(".standard-list").html(($(this).val())); 
});
/* Toggle Checklist */
$("input:checkbox[name=certificationStandard]").on("change", function() {
    toggleDocumentChecklist();
});
function toggleDocumentChecklist() {
  $("input:checkbox[name=certificationStandard]").each(function() {
    if ($(this).prop("checked")) {
      $(this).parent().next('.certificationExpertiseBox').removeClass("hide");
    } else {
      $(this).parent().next('.certificationExpertiseBox').addClass("hide");
    }
  });
}

$(".management-sys-req input").change(function(){
    $(this).parent().parent().next(".managementRef").removeClass("hide");
});
$("input[name='cerProductLegalEntity']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerProductlLegalStatusDescribe").removeClass("hide");
    }else{
        $(".cerProductlLegalStatusDescribe").addClass("hide");
    }
});
$("input[name='cerProductOtherServices']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerProductOtherServicesBox").removeClass("hide");
    }else{
        $(".cerProductOtherServicesBox").addClass("hide");
    }
});
$("input[name='cerProductEstablishedRelation']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerProductEstablishedRelationBox").removeClass("hide");
    }else{
        $(".cerProductEstablishedRelationBox").addClass("hide");
    }
});
$("input[name='orgAccreditedAnotherAccreditationCerProduct']").change(function(){
    if($(this).val() == "Yes"){
        $(".orgAccreditedAnotherAccreditationCerProductBox").removeClass("hide");
    }else{
        $(".orgAccreditedAnotherAccreditationCerProductBox").addClass("hide");
    }
});
$("input[name='CerProductBodyOutsource']").change(function(){
    if($(this).val() == "Yes"){
        $(".certProductBodyOutsourceBox").removeClass("hide");
    }else{
        $(".certProductBodyOutsourceBox").addClass("hide");
    }
});
$("input[name='cerProductImplementedWithOrg']").change(function(){
    if($(this).val() == "Option A"){
        $(".cer-product-option-a").removeClass("hide");
        $(".cer-product-option-b").addClass("hide");
    }else if($(this).val() == "Option B"){
        $(".cer-product-option-b").removeClass("hide");
        $(".cer-product-option-a").addClass("hide");
    }
});
$("input[name='otherFeeReqCerProduct']").change(function(){
    if($(this).val() == "Yes"){
        $(".otherFeeReqCerProductBox").removeClass("hide");
    }else{
        $(".otherFeeReqCerProductBox").addClass("hide");
    }
});

$(".management-sys-req input").change(function(){
    $(this).parent().parent().next(".managementRefCerProduct").removeClass("hide");
});


$("input[name='cerBodiesLegalEntity']").change(function(){
    if($(this).val() == "Yes"){
        $(".legalStatusDescribeCerBodies").removeClass("hide");
    }else{
        $(".legalStatusDescribeCerBodies").addClass("hide");
    }
});
$("input[name='cerBodiesOtherServices']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerBodiesOtherServicesBox").removeClass("hide");
    }else{
        $(".cerBodiesOtherServicesBox").addClass("hide");
    }
});
$("input[name='cerBodiesEstablishedRelation']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerBodiesEstablishedRelationBox").removeClass("hide");
    }else{
        $(".cerBodiesEstablishedRelationBox").addClass("hide");
    }
});
$("input[name='orgAccreditedAnotherAccreditationCerBodies']").change(function(){
    if($(this).val() == "Yes"){
        $(".orgAccreditedAnotherAccreditationCerBodiesBox").removeClass("hide");
    }else{
        $(".orgAccreditedAnotherAccreditationCerBodiesBox").addClass("hide");
    }
});
$("input[name='cerBodiesBodyOutsource']").change(function(){
    if($(this).val() == "Yes"){
        $(".cerBodiesOutsourceBox").removeClass("hide");
    }else{
        $(".cerBodiesOutsourceBox").addClass("hide");
    }
});
$("input[name='otherFeeReqCerBodies']").change(function(){
    if($(this).val() == "Yes"){
        $(".otherFeeReqCerBodiesBox").removeClass("hide");
    }else{
        $(".otherFeeReqCerBodiesBox").addClass("hide");
    }
});
$("input[name='managementImplementedWithOrgCerBodies']").change(function(){
    if($(this).val() == "Option A"){
        $(".cer-bodies-option-a").removeClass("hide");
        $(".cer-bodies-option-b").addClass("hide");
    }else if($(this).val() == "Option B"){
        $(".cer-bodies-option-b").removeClass("hide");
        $(".cer-bodies-option-a").addClass("hide");
    }
});
$(".management-sys-req input").change(function(){
    $(this).parent().parent().next(".managementRefCerBodies").removeClass("hide");
});
$(document).on('change', '#companyStampManagementBtn', function() {
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#companyStampManagementImageHolder");
    var form1a_image_holder = $("#companyStampManagementImageHolderPre");
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
$(document).on('change', '#authorizedPersonnelManagementBtn', function() {
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#authorizedPersonnelManagementImageHolder");
    var form1a_image_holder = $("#authorizedPersonnelManagementImageHolderPre");
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
$(document).on('change', '#applicantRepresentativeCerSignatureBtn', function() {
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#applicantRepresentativeCerSignature");
    var form1a_image_holder = $("#applicantRepresentativeCerSignaturePre");
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
$(document).on('change', '#authorizedPersonnelCerProductBtn', function() {
  var countFiles = $(this)[0].files.length;
  var imgPath = $(this)[0].value;
  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
  var image_holder = $("#authorizedPersonnelCerProductImageHolder");
  var form1a_image_holder = $("#authorizedPersonnelCerProductImageHolderPre");
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
$(document).on('change', '#companyStampCerProductBtn', function() {
	  var countFiles = $(this)[0].files.length;
	  var imgPath = $(this)[0].value;
	  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  var image_holder = $("#companyStampCerProductImageHolder");
	  var form1a_image_holder = $("#companyStampCerProductImageHolderPre");
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
$(document).on('change', '#applicantRepresentativeCerProSignatureBtn', function() {
	  var countFiles = $(this)[0].files.length;
	  var imgPath = $(this)[0].value;
	  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  var image_holder = $("#applicantRepresentativeCerProSignature");
	  var form1a_image_holder = $("#applicantRepresentativeCerProSignaturePre");
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
$(document).on('change', '#authorizedPersonnelCerBodiesBtn', function() {
  var countFiles = $(this)[0].files.length;
  var imgPath = $(this)[0].value;
  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
  var image_holder = $("#authorizedPersonnelCerBodiesImageHolder");
  var form1a_image_holder = $("#authorizedPersonnelCerBodiesImageHolderPre");
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
$(document).on('change', '#companyStampCerBodiesBtn', function() {
	  var countFiles = $(this)[0].files.length;
	  var imgPath = $(this)[0].value;
	  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  var image_holder = $("#companyStampCerBodiesImageHolder");
	  var form1a_image_holder = $("#companyStampCerBodiesImageHolderPre");
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
$(document).on('change', '#applicantRepresentativeCerBodiesSignatureBtn', function() {
	  var countFiles = $(this)[0].files.length;
	  var imgPath = $(this)[0].value;
	  var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  var image_holder = $("#applicantRepresentativeCerBodiesSignature");
	  var form1a_image_holder = $("#applicantRepresentativeCerBodiesSignaturePre");
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
  function addPersonResponsibleCerDetail(){
		personResponsibleCerVal = $("#personResponsibleCerVal").val();
		 technicalPersonNameCer = $("#technicalPersonNameCer").val();
		 technicalPersonEmailCer = $("#technicalPersonEmailCer").val();
		 if(technicalPersonNameCer != "" || technicalPersonEmailCer !=""){
			$(".addPersonResponsibleDetailCerTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleCerUrl}",
				data : {
					"<portlet:namespace/>personResponsibleCerVal" : personResponsibleCerVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonResponsibleDetailCerTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonNameCer" + personResponsibleCerVal).append(technicalPersonNameCer);
					$(".technicalPersonEmailCer" + personResponsibleCerVal).append(technicalPersonEmailCer);
					addPersonResponsibleCerDetailData("");
					personResponsibleCerVal++;
					$("#personResponsibleCerVal").val(personResponsibleCerVal);
					$("#technicalPersonNameCer").val("");
					$("#technicalPersonEmailCer").val("");
				}
			});
		}else{
			$("#technicalPersonNameCer").focus();
		}
	}
  function personResponsibleCerEditTab(personResponsibleCerVal){
		$(".editPersonResponsibleCerEditTabPopup").modal("show");
		$(".editTechnicalPersonNameCer").attr("id" , "editTechnicalPersonNameCer"+personResponsibleCerVal);
		$(".editTechnicalPersonEmailCer").attr("id" , "editTechnicalPersonEmailCer"+personResponsibleCerVal);
		technicalPersonNameCer = $(".technicalPersonNameCer"+personResponsibleCerVal+":first").text().trim();
		technicalPersonEmailCer = $(".technicalPersonEmailCer"+personResponsibleCerVal+":first").text().trim();
		$("#editTechnicalPersonNameCer"+personResponsibleCerVal).val(technicalPersonNameCer);
		$("#editTechnicalPersonEmailCer"+personResponsibleCerVal).val(technicalPersonEmailCer);
		$(".saveEditPersonResponsibleCerPopupDataBtn").attr("onclick" , "personResponsibleCerEditDataTab("+personResponsibleCerVal+")");
	}
	function personResponsibleCerEditDataTab(personResponsibleCerVal){
		addPersonResponsibleCerDetailData(personResponsibleCerVal);
		$(".technicalPersonNameCer" + personResponsibleCerVal).html($("#editTechnicalPersonNameCer"+personResponsibleCerVal).val());
		$(".technicalPersonEmailCer" + personResponsibleCerVal).html($("#editTechnicalPersonEmailCer"+personResponsibleCerVal).val());
		$(".editTechnicalPersonNameCer").val("");
		$(".editTechnicalPersonEmailCer").val("");
	}
	function personResponsibleCerDeleteData(personResponsibleCerValData) {
		  var personResponsibleCerCountCounter = $("#personResponsibleCerVal").val();
		  $("#personResponsibleCerVal").val(personResponsibleCerCountCounter - 1);
		  var delRowElement = $(".personnel-responsible-cer-row" + personResponsibleCerValData); 
		  delRowElement.remove();
		  var j = parseInt(personResponsibleCerValData) + 1;
		  for (var i = j; i <= personResponsibleCerCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".personnel-responsible-cer-row" + i);
			rowElement.attr("class", "personnel-responsible-cer-row" + prevCounter);
			rowElement.find("td.technicalPersonNameCer"+i).removeClass("technicalPersonNameCer"+i).addClass("technicalPersonNameCer"+prevCounter);
			rowElement.find("td.technicalPersonEmailCer"+i).removeClass("technicalPersonEmailCer"+i).addClass("technicalPersonEmailCer"+prevCounter);
			rowElement.find("#personResponsibleCerDeleteDataTab").attr('onclick', 'personResponsibleCerDeleteData(' +prevCounter+ ')');
			rowElement.find("#personResponsibleCerEditTab").attr('onclick', 'personResponsibleCerEditTab(' +prevCounter+ ')');
		  }
	}
  function addRegisteredClientOrgDetail(){
		registeredClientOrgVal = $("#registeredClientOrgVal").val();
		 clientOrganization = $("#clientOrganization").val();
		 certificationStandard = $("#certificationStandard").val();
         currentCertification = $("#currentCertification").val();
         clientOrgDate = $("#clientOrgDate").val();
		 if(clientOrganization != "" || certificationStandard !="" || currentCertification !="" || clientOrgDate !=""){
			$(".addRegisteredClientOrgDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRegisteredClientOrgUrl}",
				data : {
					"<portlet:namespace/>registeredClientOrgVal" : registeredClientOrgVal,
				},
				async:false,
				success : function(data) {
					$(".addRegisteredClientOrgDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".clientOrganization" + registeredClientOrgVal).append(clientOrganization);
					$(".certificationStandard" + registeredClientOrgVal).append(certificationStandard);
					$(".currentCertification" + registeredClientOrgVal).append(currentCertification);
          			$(".clientOrgDate" + registeredClientOrgVal).append(clientOrgDate);
					addRegisteredClientOrgDetailData("");
					registeredClientOrgVal++;
					$("#registeredClientOrgVal").val(registeredClientOrgVal);
					$("#clientOrganization").val("");
					$("#certificationStandard").val("");
                    $("#currentCertification").val("");
                    $("#clientOrgDate").val("");
				}
			});
		}else{
			$("#clientOrganization").focus();
		}
	}
  function registeredClientOrgEditTab(registeredClientOrgVal){
		$(".editRegisteredClientOrgEditTabPopup").modal("show");
		$(".editClientOrganization").attr("id" , "editClientOrganization"+registeredClientOrgVal);
		$(".editCertificationStandard").attr("id" , "editCertificationStandard"+registeredClientOrgVal);
		$(".editCurrentCertification").attr("id" , "editCurrentCertification"+registeredClientOrgVal);
		$(".editClientOrgDate").attr("id" , "editClientOrgDate"+registeredClientOrgVal);
		clientOrganization = $(".clientOrganization"+registeredClientOrgVal+":first").text().trim();
		certificationStandard = $(".certificationStandard"+registeredClientOrgVal+":first").text().trim();
		currentCertification = $(".currentCertification"+registeredClientOrgVal+":first").text().trim();
		clientOrgDate = $(".clientOrgDate"+registeredClientOrgVal+":first").text().trim();
		$("#editClientOrganization"+registeredClientOrgVal).val(clientOrganization);
		$("#editCertificationStandard"+registeredClientOrgVal).val(certificationStandard);
		$("#editCurrentCertification"+registeredClientOrgVal).val(currentCertification);
		$("#editClientOrgDate"+registeredClientOrgVal).val(clientOrgDate);
		$(".saveEditRegisteredClientOrgPopupDataBtn").attr("onclick" , "registeredClientOrgEditDataTab("+registeredClientOrgVal+")");
	}
	function registeredClientOrgEditDataTab(registeredClientOrgVal){
		addRegisteredClientOrgDetail(registeredClientOrgVal);
		$(".clientOrganization" + registeredClientOrgVal).html($("#editClientOrganization"+registeredClientOrgVal).val());
		$(".certificationStandard" + registeredClientOrgVal).html($("#editCertificationStandard"+registeredClientOrgVal).val());
		$(".currentCertification" + registeredClientOrgVal).html($("#editCurrentCertification"+registeredClientOrgVal).val());
		$(".clientOrgDate" + registeredClientOrgVal).html($("#editClientOrgDate"+registeredClientOrgVal).val());
		$(".editClientOrganization").val("");
		$(".editCertificationStandard").val("");
		$(".editCurrentCertification").val("");
		$(".editClientOrgDate").val("");
	}
	function registeredClientOrgDeleteData(registeredClientOrgValData) {
		  var registeredClientOrgCountCounter = $("#registeredClientOrgVal").val();
		  $("#registeredClientOrgVal").val(registeredClientOrgCountCounter - 1);
		  var delRowElement = $(".registered-client-org-row" + registeredClientOrgValData); 
		  delRowElement.remove();
		  var j = parseInt(registeredClientOrgValData) + 1;
		  for (var i = j; i <= registeredClientOrgCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".registered-client-org-row" + i);
		    rowElement.attr("class", "registered-client-org-row" + prevCounter);
		    rowElement.find("td.clientOrganization"+i).removeClass("clientOrganization"+i).addClass("clientOrganization"+prevCounter);
		    rowElement.find("td.certificationStandard"+i).removeClass("certificationStandard"+i).addClass("certificationStandard"+prevCounter);
			rowElement.find("td.currentCertification"+i).removeClass("currentCertification"+i).addClass("currentCertification"+prevCounter);
			rowElement.find("td.clientOrgDate"+i).removeClass("clientOrgDate"+i).addClass("clientOrgDate"+prevCounter);
		    rowElement.find("#registeredClientOrgDeleteDataTab").attr('onclick', 'registeredClientOrgDeleteData(' +prevCounter+ ')');
		    rowElement.find("#registeredClientOrgEditTab").attr('onclick', 'registeredClientOrgEditTab(' +prevCounter+ ')');
		  }
	}
  function addStaffDetailCertification(){
		 staffDetailCertificationVal = $("#staffDetailCertificationVal").val();
		 staffNameCertification = $("#staffNameCertification").val();
		 jobTitleCertification = $("#jobTitleCertification").val();
		 majorResponsibilitiesCertification = $("#majorResponsibilitiesCertification").val();
		 specificFunctionCertification = $("#specificFunctionCertification").val();
		 if(staffNameCertification != "" || jobTitleCertification !="" || majorResponsibilitiesCertification !="" || specificFunctionCertification !=""){
			$(".addStaffDetailCertificationTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailCerUrl}",
				data : {
					"<portlet:namespace/>staffDetailCertificationVal" : staffDetailCertificationVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailCertificationTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameCertification" + staffDetailCertificationVal).append(staffNameCertification);
					$(".jobTitleCertification" + staffDetailCertificationVal).append(jobTitleCertification);
					$(".majorResponsibilitiesCertification" + staffDetailCertificationVal).append(majorResponsibilitiesCertification);
					$(".specificFunctionCertification" + staffDetailCertificationVal).append(specificFunctionCertification);
					addStaffDetailCertificationData("");
					staffDetailCertificationVal++;
					$("#staffDetailCertificationVal").val(staffDetailCertificationVal);
					$("#staffNameCertification").val("");
					$("#jobTitleCertification").val("");
					$("#majorResponsibilitiesCertification").val("");
					$("#specificFunctionCertification").val("");
				}
			});
		}else{
			$("#staffNameCertification").focus();
		}
	}
   function staffDetailCertificationEditTab(staffDetailCertificationVal){
		$(".editStaffDetailCertificationEditTabPopup").modal("show");
		$(".editStaffNameCertification").attr("id" , "editStaffNameCertification"+staffDetailCertificationVal);
		$(".editJobTitleCertification").attr("id" , "editJobTitleCertification"+staffDetailCertificationVal);
		$(".editMajorResponsibilitiesCertification").attr("id" , "editMajorResponsibilitiesCertification"+staffDetailCertificationVal);
		$(".editSpecificFunctionCertification").attr("id" , "editSpecificFunctionCertification"+staffDetailCertificationVal);
		staffNameCertification = $(".staffNameCertification"+staffDetailCertificationVal+":first").text().trim();
		jobTitleCertification = $(".jobTitleCertification"+staffDetailCertificationVal+":first").text().trim();
		majorResponsibilitiesCertification = $(".majorResponsibilitiesCertification"+staffDetailCertificationVal+":first").text().trim();
		specificFunctionCertification = $(".specificFunctionCertification"+staffDetailCertificationVal+":first").text().trim();
		$("#editStaffNameCertification"+staffDetailCertificationVal).val(staffNameCertification);
		$("#editJobTitleCertification"+staffDetailCertificationVal).val(jobTitleCertification);
		$("#editMajorResponsibilitiesCertification"+staffDetailCertificationVal).val(majorResponsibilitiesCertification);
		$("#editSpecificFunctionCertification"+staffDetailCertificationVal).val(specificFunctionCertification);
		$(".saveEditStaffDetailCertificationPopupDataBtn").attr("onclick" , "staffDetailCertificationEditDataTab("+staffDetailCertificationVal+")");
	}
	function staffDetailCertificationEditDataTab(staffDetailCertificationVal){
		addStaffDetailCertificationData(staffDetailCertificationVal);
		$(".staffNameCertification" + staffDetailCertificationVal).html($("#editStaffNameCertification"+staffDetailCertificationVal).val());
		$(".jobTitleCertification" + staffDetailCertificationVal).html($("#editJobTitleCertification"+staffDetailCertificationVal).val());
		$(".majorResponsibilitiesCertification" + staffDetailCertificationVal).html($("#editMajorResponsibilitiesCertification"+staffDetailCertificationVal).val());
		$(".specificFunctionCertification" + staffDetailCertificationVal).html($("#editSpecificFunctionCertification"+staffDetailCertificationVal).val());
		$(".editStaffNameCertification").val("");
		$(".editJobTitleCertification").val("");
		$(".editMajorResponsibilitiesCertification").val("");
		$(".editSpecificFunctionCertification").val("");
	}
	function staffDetailCertificationDeleteData(staffDetailCertificationValData) {
		  var staffDetailCertificationCountCounter = $("#staffDetailCertificationVal").val();
		  $("#staffDetailCertificationVal").val(staffDetailCertificationCountCounter - 1);
		  var delRowElement = $(".staff-detail-cer-row" + staffDetailCertificationValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailCertificationValData) + 1;
		  for (var i = j; i <= staffDetailCertificationCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-cer-row" + i);
		    rowElement.attr("class", "staff-detail-cer-row" + prevCounter);
		    rowElement.find("td.staffNameCertification"+i).removeClass("staffNameCertification"+i).addClass("staffNameCertification"+prevCounter);
		    rowElement.find("td.jobTitleCertification"+i).removeClass("jobTitleCertification"+i).addClass("jobTitleCertification"+prevCounter);
			rowElement.find("td.majorResponsibilitiesCertification"+i).removeClass("majorResponsibilitiesCertification"+i).addClass("majorResponsibilitiesCertification"+prevCounter);
			rowElement.find("td.specificFunctionCertification"+i).removeClass("specificFunctionCertification"+i).addClass("specificFunctionCertification"+prevCounter);
		    rowElement.find("#staffDetailCertificationDeleteDataTab").attr('onclick', 'staffDetailCertificationDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailCertificationEditTab").attr('onclick', 'staffDetailCertificationEditTab(' +prevCounter+ ')');
		  }
	}
  function addAuditorList(){
		 auditorListVal = $("#auditorListVal").val();
		 auditorName = $("#auditorName").val();
		 auditorRole = $("#auditorRole").val();
		 auditorCertificationStandard = $("#auditorCertificationStandard").val();
		 auditorExpertiseArea = $("#auditorExpertiseArea").val();
		 if(auditorName != "" || auditorRole !="" || auditorCertificationStandard !="" || auditorExpertiseArea !=""){
			$(".addAuditorListTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAuditorListUrl}",
				data : {
					"<portlet:namespace/>auditorListVal" : auditorListVal,
				},
				async:false,
				success : function(data) {
					$(".addAuditorListTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".auditorName" + auditorListVal).append(auditorName);
					$(".auditorRole" + auditorListVal).append(auditorRole);
					$(".auditorCertificationStandard" + auditorListVal).append(auditorCertificationStandard);
					$(".auditorExpertiseArea" + auditorListVal).append(auditorExpertiseArea);
					addAuditorListData("");
					auditorListVal++;
					$("#auditorListVal").val(auditorListVal);
					$("#auditorName").val("");
					$("#auditorRole").val("");
					$("#auditorCertificationStandard").val("");
					$("#auditorExpertiseArea").val("");
				}
			});
		}else{
			$("#auditorName").focus();
		}
	}
   function auditorListEditTab(auditorListVal){
		$(".editAuditorListEditTabPopup").modal("show");
		$(".editAuditorName").attr("id" , "editAuditorName"+auditorListVal);
		$(".editAuditorRole").attr("id" , "editAuditorRole"+auditorListVal);
		$(".editAuditorCertificationStandard").attr("id" , "editAuditorCertificationStandard"+auditorListVal);
		$(".editAuditorExpertiseArea").attr("id" , "editAuditorExpertiseArea"+auditorListVal);
		auditorName = $(".auditorName"+auditorListVal+":first").text().trim();
		auditorRole = $(".auditorRole"+auditorListVal+":first").text().trim();
		auditorCertificationStandard = $(".auditorCertificationStandard"+auditorListVal+":first").text().trim();
		auditorExpertiseArea = $(".auditorExpertiseArea"+auditorListVal+":first").text().trim();
		$("#editAuditorName"+auditorListVal).val(auditorName);
		$("#editAuditorRole"+auditorListVal).val(auditorRole);
		$("#editAuditorCertificationStandard"+auditorListVal).val(auditorCertificationStandard);
		$("#editAuditorExpertiseArea"+auditorListVal).val(auditorExpertiseArea);
		$(".saveEditAuditorListPopupDataBtn").attr("onclick" , "auditorListEditDataTab("+auditorListVal+")");
	}
	function auditorListEditDataTab(auditorListVal){
		addAuditorListData(auditorListVal);
		$(".auditorName" + auditorListVal).html($("#editAuditorName"+auditorListVal).val());
		$(".auditorRole" + auditorListVal).html($("#editAuditorRole"+auditorListVal).val());
		$(".auditorCertificationStandard" + auditorListVal).html($("#editAuditorCertificationStandard"+auditorListVal).val());
		$(".auditorExpertiseArea" + auditorListVal).html($("#editAuditorExpertiseArea"+auditorListVal).val());
		$(".editAuditorName").val("");
		$(".editAuditorRole").val("");
		$(".editAuditorCertificationStandard").val("");
		$(".editAuditorExpertiseArea").val("");
	}
	function auditorListDeleteData(auditorListValData) {
		  var auditorListCountCounter = $("#auditorListVal").val();
		  $("#auditorListVal").val(auditorListCountCounter - 1);
		  var delRowElement = $(".auditor-list-row" + auditorListValData); 
		  delRowElement.remove();
		  var j = parseInt(auditorListValData) + 1;
		  for (var i = j; i <= auditorListCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".auditor-list-row" + i);
		    rowElement.attr("class", "auditor-list-row" + prevCounter);
		    rowElement.find("td.auditorName"+i).removeClass("auditorName"+i).addClass("auditorName"+prevCounter);
		    rowElement.find("td.auditorRole"+i).removeClass("auditorRole"+i).addClass("auditorRole"+prevCounter);
			rowElement.find("td.auditorCertificationStandard"+i).removeClass("auditorCertificationStandard"+i).addClass("auditorCertificationStandard"+prevCounter);
			rowElement.find("td.auditorExpertiseArea"+i).removeClass("auditorExpertiseArea"+i).addClass("auditorExpertiseArea"+prevCounter);
		    rowElement.find("#auditorListDeleteDataTab").attr('onclick', 'auditorListDeleteData(' +prevCounter+ ')');
		    rowElement.find("#auditorListEditTab").attr('onclick', 'auditorListEditTab(' +prevCounter+ ')');
		  }
	}
	
  function addOutsourceActNature(){
		outsourceActNatureVal = $("#outsourceActNatureVal").val();
		 outsourcedActivity = $("#outsourcedActivity").val();
		 serviceProvdier = $("#serviceProvdier").val();
		 if(outsourcedActivity != "" || serviceProvdier !=""){
			$(".addOutsourceActNatureTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addOutsourceActNatureUrl}",
				data : {
					"<portlet:namespace/>outsourceActNatureVal" : outsourceActNatureVal,
				},
				async:false,
				success : function(data) {
					$(".addOutsourceActNatureTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".outsourcedActivity" + outsourceActNatureVal).append(outsourcedActivity);
					$(".serviceProvdier" + outsourceActNatureVal).append(serviceProvdier);
				    addOutsourceActNatureData("");
					outsourceActNatureVal++;
					$("#outsourceActNatureVal").val(outsourceActNatureVal);
					$("#outsourcedActivity").val("");
					$("#serviceProvdier").val("");
				}
			});
		}else{
			$("#outsourcedActivity").focus();
		}
	}
  function outsourceActNatureEditTab(outsourceActNatureVal){
		$(".editOutsourceActNatureEditTabPopup").modal("show");
		$(".editOutsourcedActivity").attr("id" , "editOutsourcedActivity"+outsourceActNatureVal);
		$(".editServiceProvdier").attr("id" , "editServiceProvdier"+outsourceActNatureVal);
		outsourcedActivity = $(".outsourcedActivity"+outsourceActNatureVal+":first").text().trim();
		serviceProvdier = $(".serviceProvdier"+outsourceActNatureVal+":first").text().trim();
		$("#editOutsourcedActivity"+outsourceActNatureVal).val(outsourcedActivity);
		$("#editServiceProvdier"+outsourceActNatureVal).val(serviceProvdier);
		$(".saveEditOutsourceActNaturePopupDataBtn").attr("onclick" , "outsourceActNatureEditDataTab("+outsourceActNatureVal+")");
	}
	function outsourceActNatureEditDataTab(outsourceActNatureVal){
		$(".outsourcedActivity" + outsourceActNatureVal).html($("#editOutsourcedActivity"+outsourceActNatureVal).val());
		$(".serviceProvdier" + outsourceActNatureVal).html($("#editServiceProvdier"+outsourceActNatureVal).val());
		$(".editOutsourcedActivity").val("");
		$(".editServiceProvdier").val("");
	}
	function outsourceActNatureDeleteData(outsourceActNatureValData) {
		  var outsourceActNatureCountCounter = $("#outsourceActNatureVal").val();
		  $("#outsourceActNatureVal").val(outsourceActNatureCountCounter - 1);
		  var delRowElement = $(".outsource-act-nature-row" + outsourceActNatureValData); 
		  delRowElement.remove();
		  var j = parseInt(outsourceActNatureValData) + 1;
		  for (var i = j; i <= outsourceActNatureCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".outsource-act-nature-row" + i);
			rowElement.attr("class", "outsource-act-nature-row" + prevCounter);
			rowElement.find("td.outsourcedActivity"+i).removeClass("outsourcedActivity"+i).addClass("outsourcedActivity"+prevCounter);
			rowElement.find("td.serviceProvdier"+i).removeClass("serviceProvdier"+i).addClass("serviceProvdier"+prevCounter);
			rowElement.find("#outsourceActNatureDeleteDataTab").attr('onclick', 'outsourceActNatureDeleteData(' +prevCounter+ ')');
			rowElement.find("#outsourceActNatureEditTab").attr('onclick', 'outsourceActNatureEditTab(' +prevCounter+ ')');
		  }
	}
	
  function addActivityPerformLocations(){
		 activityPerformLocationsVal = $("#activityPerformLocationsVal").val();
		 activityPerformNum = $("#activityPerformNum").val();
		 activityPerformLoc = $("#activityPerformLoc").val();
		 activityPerformCertLoc = $("#activityPerformCertLoc").val();
		 activityPerformContact = $("#activityPerformContact").val();
		 if(activityPerformNum != "" || activityPerformLoc !="" || activityPerformCertLoc !="" || activityPerformContact !=""){
			$(".addActivityPerformLocationsTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addActivityPerformLocationsUrl}",
				data : {
					"<portlet:namespace/>activityPerformLocationsVal" : activityPerformLocationsVal,
				},
				async:false,
				success : function(data) {
					$(".addActivityPerformLocationsTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".activityPerformNum" + activityPerformLocationsVal).append(activityPerformNum);
					$(".activityPerformLoc" + activityPerformLocationsVal).append(activityPerformLoc);
					$(".activityPerformCertLoc" + activityPerformLocationsVal).append(activityPerformCertLoc);
					$(".activityPerformContact" + activityPerformLocationsVal).append(activityPerformContact);
					addActivityPerformLocationsData("");
					activityPerformLocationsVal++;
					$("#activityPerformLocationsVal").val(activityPerformLocationsVal);
					$("#activityPerformNum").val("");
					$("#activityPerformLoc").val("");
					$("#activityPerformCertLoc").val("");
					$("#activityPerformContact").val("");
				}
			});
		}else{
			$("#activityPerformNum").focus();
		}
	}
    function activityPerformLocationsEditTab(activityPerformLocationsVal){
		$(".editActivityPerformLocationsEditTabPopup").modal("show");
		$(".editActivityPerformNum").attr("id" , "editActivityPerformNum"+activityPerformLocationsVal);
		$(".editActivityPerformLoc").attr("id" , "editActivityPerformLoc"+activityPerformLocationsVal);
		$(".editActivityPerformCertLoc").attr("id" , "editActivityPerformCertLoc"+activityPerformLocationsVal);
		$(".editActivityPerformContact").attr("id" , "editActivityPerformContact"+activityPerformLocationsVal);
		activityPerformNum = $(".activityPerformNum"+activityPerformLocationsVal+":first").text().trim();
		activityPerformLoc = $(".activityPerformLoc"+activityPerformLocationsVal+":first").text().trim();
		activityPerformCertLoc = $(".activityPerformCertLoc"+activityPerformLocationsVal+":first").text().trim();
		activityPerformContact = $(".activityPerformContact"+activityPerformLocationsVal+":first").text().trim();
		$("#editActivityPerformNum"+activityPerformLocationsVal).val(activityPerformNum);
		$("#editActivityPerformLoc"+activityPerformLocationsVal).val(activityPerformLoc);
		$("#editActivityPerformCertLoc"+activityPerformLocationsVal).val(activityPerformCertLoc);
		$("#editActivityPerformContact"+activityPerformLocationsVal).val(activityPerformContact);
		$(".saveEditActivityPerformLocationsPopupDataBtn").attr("onclick" , "activityPerformLocationsEditDataTab("+activityPerformLocationsVal+")");
	}
	function activityPerformLocationsEditDataTab(activityPerformLocationsVal){
		addActivityPerformLocationsData(activityPerformLocationsVal);
		$(".activityPerformNum" + activityPerformLocationsVal).html($("#editActivityPerformNum"+activityPerformLocationsVal).val());
		$(".activityPerformLoc" + activityPerformLocationsVal).html($("#editActivityPerformLoc"+activityPerformLocationsVal).val());
		$(".activityPerformCertLoc" + activityPerformLocationsVal).html($("#editActivityPerformCertLoc"+activityPerformLocationsVal).val());
		$(".activityPerformContact" + activityPerformLocationsVal).html($("#editActivityPerformContact"+activityPerformLocationsVal).val());
		$(".editActivityPerformNum").val("");
		$(".editActivityPerformLoc").val("");
		$(".editActivityPerformCertLoc").val("");
		$(".editActivityPerformContact").val("");
	}
	function activityPerformLocationsDeleteData(activityPerformLocationsValData) {
		  var activityPerformLocationsCountCounter = $("#activityPerformLocationsVal").val();
		  $("#activityPerformLocationsVal").val(activityPerformLocationsCountCounter - 1);
		  var delRowElement = $(".activity-perform-locations-row" + activityPerformLocationsValData); 
		  delRowElement.remove();
		  var j = parseInt(activityPerformLocationsValData) + 1;
		  for (var i = j; i <= activityPerformLocationsCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".activity-perform-locations-row" + i);
		    rowElement.attr("class", "activity-perform-locations-row" + prevCounter);
		    rowElement.find("td.activityPerformNum"+i).removeClass("activityPerformNum"+i).addClass("activityPerformNum"+prevCounter);
		    rowElement.find("td.activityPerformLoc"+i).removeClass("activityPerformLoc"+i).addClass("activityPerformLoc"+prevCounter);
			rowElement.find("td.activityPerformCertLoc"+i).removeClass("activityPerformCertLoc"+i).addClass("activityPerformCertLoc"+prevCounter);
			rowElement.find("td.activityPerformContact"+i).removeClass("activityPerformContact"+i).addClass("activityPerformContact"+prevCounter);
		    rowElement.find("#activityPerformLocationsDeleteDataTab").attr('onclick', 'activityPerformLocationsDeleteData(' +prevCounter+ ')');
		    rowElement.find("#activityPerformLocationsEditTab").attr('onclick', 'activityPerformLocationsEditTab(' +prevCounter+ ')');
		  }
	}
  function addPersonResponsibleCerProductDetail(){
		personResponsibleCerProductVal = $("#personResponsibleCerProductVal").val();
		 technicalPersonNameCerProduct = $("#technicalPersonNameCerProduct").val();
		 technicalPersonEmailCerProduct = $("#technicalPersonEmailCerProduct").val();
		 if(technicalPersonNameCerProduct != "" || technicalPersonEmailCerProduct !=""){
			$(".addPersonResponsibleCerProductDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleCerProductUrl}",
				data : {
					"<portlet:namespace/>personResponsibleCerProductVal" : personResponsibleCerProductVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonResponsibleCerProductDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonNameCerProduct" + personResponsibleCerProductVal).append(technicalPersonNameCerProduct);
					$(".technicalPersonEmailCerProduct" + personResponsibleCerProductVal).append(technicalPersonEmailCerProduct);
					addPersonResponsibleCerProductDetailData("");
					personResponsibleCerProductVal++;
					$("#personResponsibleCerProductVal").val(personResponsibleCerProductVal);
					$("#technicalPersonNameCerProduct").val("");
					$("#technicalPersonEmailCerProduct").val("");
				}
			});
		}else{
			$("#technicalPersonNameCerProduct").focus();
		}
	}
   function personResponsibleCerProductEditTab(personResponsibleCerProductVal){
		$(".editPersonResponsibleCerProductEditTabPopup").modal("show");
		$(".editTechnicalPersonNameCerProduct").attr("id" , "editTechnicalPersonNameCerProduct"+personResponsibleCerProductVal);
		$(".editTechnicalPersonEmailCerProduct").attr("id" , "editTechnicalPersonEmailCerProduct"+personResponsibleCerProductVal);
		technicalPersonNameCerProduct = $(".technicalPersonNameCerProduct"+personResponsibleCerProductVal+":first").text().trim();
		technicalPersonEmailCerProduct = $(".technicalPersonEmailCerProduct"+personResponsibleCerProductVal+":first").text().trim();
		$("#editTechnicalPersonNameCerProduct"+personResponsibleCerProductVal).val(technicalPersonNameCerProduct);
		$("#editTechnicalPersonEmailCerProduct"+personResponsibleCerProductVal).val(technicalPersonEmailCerProduct);
		$(".saveEditPersonResponsibleCerProductPopupDataBtn").attr("onclick" , "personResponsibleCerProductEditDataTab("+personResponsibleCerProductVal+")");
	}
	function personResponsibleCerProductEditDataTab(personResponsibleCerProductVal){
		addPersonResponsibleCerProductDetailData(personResponsibleCerProductVal);
		$(".technicalPersonNameCerProduct" + personResponsibleCerProductVal).html($("#editTechnicalPersonNameCerProduct"+personResponsibleCerProductVal).val());
		$(".technicalPersonEmailCerProduct" + personResponsibleCerProductVal).html($("#editTechnicalPersonEmailCerProduct"+personResponsibleCerProductVal).val());
		$(".editTechnicalPersonNameCerProduct").val("");
		$(".editTechnicalPersonEmailCerProduct").val("");
		
	}
	function personResponsibleCerProductDeleteData(personResponsibleCerProductValData) {
		  var personResponsibleCerProductCountCounter = $("#personResponsibleCerProductVal").val();
		  $("#personResponsibleCerProductVal").val(personResponsibleCerProductCountCounter - 1);
		  var delRowElement = $(".personnel-responsible-cer-product-row" + personResponsibleCerProductValData); 
		  delRowElement.remove();
		  var j = parseInt(personResponsibleCerProductValData) + 1;
		  for (var i = j; i <= personResponsibleCerProductCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".personnel-responsible-cer-product-row" + i);
			rowElement.attr("class", "personnel-responsible-cer-product-row" + prevCounter);
			rowElement.find("td.technicalPersonNameCerProduct"+i).removeClass("technicalPersonNameCerProduct"+i).addClass("technicalPersonNameCerProduct"+prevCounter);
			rowElement.find("td.technicalPersonEmailCerProduct"+i).removeClass("technicalPersonEmailCerProduct"+i).addClass("technicalPersonEmailCerProduct"+prevCounter);
			rowElement.find("#personResponsibleCerProductDeleteDataTab").attr('onclick', 'personResponsibleCerProductDeleteData(' +prevCounter+ ')');
			rowElement.find("#personResponsibleCerProductEditTab").attr('onclick', 'personResponsibleCerProductEditTab(' +prevCounter+ ')');
		  }
	}
</script>