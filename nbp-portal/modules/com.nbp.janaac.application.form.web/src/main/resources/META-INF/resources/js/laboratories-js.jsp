<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addPersonnelResponsibleUrl" id="personnel/responsible/detail"/>
<portlet:resourceURL var="addSignatoryAuthorityUrl" id="signatory/authority/detail"/>
<portlet:resourceURL var="addExaminationsScopeUrl" id="examinations/scope/detail"/>
<portlet:resourceURL var="addApplicationActivityLocUrl" id="application/activity/loc/detail"/>
<portlet:resourceURL var="addMajorEquipmentUrl" id="major/equipment/detail"/>
<portlet:resourceURL var="addPersonnelResponsibleTestingUrl" id="personnel/responsible/testing/detail"/>
<portlet:resourceURL var="addStaffDetailTestingUrl" id="staff/testing/detail"/>
<portlet:resourceURL var="addScopeForAccreditationTestingUrl" id="scope/accreditation/testing/detail"/>
<portlet:resourceURL var="addCalibrationSpecimenCollectionUrl" id="calibration/specimen/collection/detail"/>
<portlet:resourceURL var="addTestingSpecimenCollectionUrl" id="testing/specimen/collection/detail"/>
<portlet:resourceURL var="addSpecimenCollectionUrl" id="specimen/collection/detail"/>
<portlet:resourceURL var="addPointCareTestingUrl" id="point/care/testing/detail"/>
<script>
	$("input[name='laboratoryLegalEntity']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".laboratoryLegalEntityBox").removeClass("hide");
	   }else{
	       $(".laboratoryLegalEntityBox").addClass("hide");
	   }
	});
	$("input[name='laboratoryPartOfOrg']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".laboratoryPartOfOrgBox").removeClass("hide");
	   }else{
	       $(".laboratoryPartOfOrgBox").addClass("hide");
	   }
	});
	$("input[name='structuralLaboratoryLegalEntity']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".structuralLaboratoryLegalEntityBox").removeClass("hide");
	   }else{
	       $(".structuralLaboratoryLegalEntityBox").addClass("hide");
	   }
	});
	$("input[name='calibrationLaboratoryLegalEntity']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".calibrationLaboratoryLegalEntityBox").removeClass("hide");
	   }else{
	       $(".calibrationLaboratoryLegalEntityBox").addClass("hide");
	   }
	});
	$("input[name='laboratoryPartOfTesting']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".laboratoryPartOfTestingBox").removeClass("hide");
	   }else{
	       $(".laboratoryPartOfTestingBox").addClass("hide");
	   }
	});
	$("input[name='calibrationLaboratoryPartOfTesting']").change(function(){
	   if($(this).val() == "Yes"){
	       $(".calibrationLaboratoryPartOfTestingBox").removeClass("hide");
	   }else{
	       $(".calibrationLaboratoryPartOfTestingBox").addClass("hide");
	   }
	});
	$(".management-sys-req-medical input").change(function(){
	    $(this).parent().parent().next(".qualityManualRef").removeClass("hide");
	});
	$(".management-sys-req-testing input").change(function(){
	    $(this).parent().parent().next(".labDocRef").removeClass("hide");
	});
	$(".management-sys-req-calibration input").change(function(){
	    $(this).parent().parent().next(".calibrationLabDocRef").removeClass("hide");
	});
	$(document).on('change', '#authorizedPersonnelBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#authorizedPersonnelImageHolder");
	    var form1a_image_holder = $("#authorizedPersonnelImageHolderPre");
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
	$(document).on('change', '#companyStampBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#companyStampImageHolder");
	    var form1a_image_holder = $("#companyStampImageHolderPre");
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
	$(document).on('change', '#applicantRepresentativeSignatureBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantRepresentativeSignature");
	    var form1a_image_holder = $("#applicantRepresentativeSignaturePre");
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
	$(document).on('change', '#authorizedPersonnelTestingBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#authorizedPersonnelTestingImageHolder");
	    var form1a_image_holder = $("#authorizedPersonnelTestingImageHolderPre");
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
	$(document).on('change', '#companyStampTestingBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#companyStampTestingImageHolder");
	    var form1a_image_holder = $("#companyStampTestingImageHolderPre");
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
	$(document).on('change', '#applicantRepresentativeSignatureTestingBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantRepresentativeSignatureTesting");
	    var form1a_image_holder = $("#applicantRepresentativeSignatureTestingPre");
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
	$(document).on('change', '#authorizedPersonnelCalibrationBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#authorizedPersonnelCalibrationImageHolder");
	    var form1a_image_holder = $("#authorizedPersonnelCalibrationImageHolderPre");
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
	$(document).on('change', '#companyStampCalibrationBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#companyStampCalibrationImageHolder");
	    var form1a_image_holder = $("#companyStampCalibrationImageHolderPre");
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
	$(document).on('change', '#applicantRepresentativeSignatureCalibrationBtn', function() {
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantRepresentativeSignatureCalibration");
	    var form1a_image_holder = $("#applicantRepresentativeSignatureCalibrationPre");
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
	function addPersonnelResponsibleDetail(){
		personnelResponsibleVal = $("#personnelResponsibleVal").val();
		 technicalPersonnelName = $("#technicalPersonnelName").val();
		 technicalPersonnelEmail = $("#technicalPersonnelEmail").val();
		 if(technicalPersonnelName != "" || technicalPersonnelEmail !=""){
			$(".addPersonnelResponsibleDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleUrl}",
				data : {
					"<portlet:namespace/>personnelResponsibleVal" : personnelResponsibleVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonnelResponsibleDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonnelName" + personnelResponsibleVal).append(technicalPersonnelName);
					$(".technicalPersonnelEmail" + personnelResponsibleVal).append(technicalPersonnelEmail);
					addPersonnelResponsibleDetailData("");
					personnelResponsibleVal++;
					$("#personnelResponsibleVal").val(personnelResponsibleVal);
					$("#technicalPersonnelName").val("");
					$("#technicalPersonnelEmail").val("");
				}
			});
		}else{
			$("#technicalPersonnelName").focus();
		}
	}
	function personnelResponsibleEditTab(personnelResponsibleVal){
		$(".editPersonnelResponsibleEditTabPopup").modal("show");
		$(".editTechnicalPersonnelName").attr("id" , "editTechnicalPersonnelName"+personnelResponsibleVal);
		$(".editTechnicalPersonnelEmail").attr("id" , "editTechnicalPersonnelEmail"+personnelResponsibleVal);
		technicalPersonnelName = $(".technicalPersonnelName"+personnelResponsibleVal+":first").text().trim();
		technicalPersonnelEmail = $(".technicalPersonnelEmail"+personnelResponsibleVal+":first").text().trim();
		$("#editTechnicalPersonnelName"+personnelResponsibleVal).val(technicalPersonnelName);
		$("#editTechnicalPersonnelEmail"+personnelResponsibleVal).val(technicalPersonnelEmail);
		$(".saveEditPersonnelResponsiblePopupDataBtn").attr("onclick" , "personnelResponsibleEditDataTab("+personnelResponsibleVal+")");
	}
	function personnelResponsibleEditDataTab(personnelResponsibleVal){
		addPersonnelResponsibleDetailData(personnelResponsibleVal);
		addPersonnelResponsibleDetailData(personnelResponsibleVal);
		$(".technicalPersonnelName" + personnelResponsibleVal).html($("#editTechnicalPersonnelName"+personnelResponsibleVal).val());
		$(".technicalPersonnelEmail" + personnelResponsibleVal).html($("#editTechnicalPersonnelEmail"+personnelResponsibleVal).val());
		$(".editTechnicalPersonnelName").val("");
		$(".editTechnicalPersonnelEmail").val("");
	}
	function personnelResponsibleDeleteData(personnelResponsibleValData) {
		  var personnelResponsibleCountCounter = $("#personnelResponsibleVal").val();
		  $("#personnelResponsibleVal").val(personnelResponsibleCountCounter - 1);
		  var delRowElement = $(".personnel-responsible-row" + personnelResponsibleValData); 
		  delRowElement.remove();
		  var j = parseInt(personnelResponsibleValData) + 1;
		  for (var i = j; i <= personnelResponsibleCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".personnel-responsible-row" + i);
		    rowElement.attr("class", "personnel-responsible-row" + prevCounter);
		    rowElement.find("td.technicalPersonnelName"+i).removeClass("technicalPersonnelName"+i).addClass("technicalPersonnelName"+prevCounter);
		    rowElement.find("td.technicalPersonnelEmail"+i).removeClass("technicalPersonnelEmail"+i).addClass("technicalPersonnelEmail"+prevCounter);
		    rowElement.find("#personnelResponsibleDeleteDataTab").attr('onclick', 'personnelResponsibleDeleteData(' +prevCounter+ ')');
		    rowElement.find("#personnelResponsibleEditTab").attr('onclick', 'personnelResponsibleEditTab(' +prevCounter+ ')');
		  }
	}
	function addSignatoryAuthorityDetail(){
		 signatoryAuthorityVal = $("#signatoryAuthorityVal").val();
		 staffName = $("#staffName").val();
		 jobTitle = $("#jobTitle").val();
		 majorResponsibilities = $("#majorResponsibilities").val();
		 if(staffName != "" || jobTitle !="" || majorResponsibilities !=""){
			$(".addSignatoryAuthorityDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addSignatoryAuthorityUrl}",
				data : {
					"<portlet:namespace/>signatoryAuthorityVal" : signatoryAuthorityVal,
				},
				async:false,
				success : function(data) {
					$(".addSignatoryAuthorityDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffName" + signatoryAuthorityVal).append(staffName);
					$(".jobTitle" + signatoryAuthorityVal).append(jobTitle);
					$(".majorResponsibilities" + signatoryAuthorityVal).append(majorResponsibilities);
					addSignatoryAuthorityDetailData("");
					signatoryAuthorityVal++;
					$("#signatoryAuthorityVal").val(signatoryAuthorityVal);
					$("#staffName").val("");
					$("#jobTitle").val("");
					$("#majorResponsibilities").val("");
				}
			});
		}else{
			$("#staffName").focus();
		}
	}
	function signatoryAuthorityEditTab(signatoryAuthorityVal){
		$(".editSignatoryAuthorityEditTabPopup").modal("show");
		$(".editStaffName").attr("id" , "editStaffName"+signatoryAuthorityVal);
		$(".editJobTitle").attr("id" , "editJobTitle"+signatoryAuthorityVal);
		$(".editMajorResponsibilities").attr("id" , "editMajorResponsibilities"+signatoryAuthorityVal);
		staffName = $(".staffName"+signatoryAuthorityVal+":first").text().trim();
		jobTitle = $(".jobTitle"+signatoryAuthorityVal+":first").text().trim();
		majorResponsibilities = $(".majorResponsibilities"+signatoryAuthorityVal+":first").text().trim();
		$("#editStaffName"+signatoryAuthorityVal).val(staffName);
		$("#editJobTitle"+signatoryAuthorityVal).val(jobTitle);
		$("#editMajorResponsibilities"+signatoryAuthorityVal).val(majorResponsibilities);
		$(".saveEditSignatoryAuthorityPopupDataBtn").attr("onclick" , "signatoryAuthorityEditDataTab("+signatoryAuthorityVal+")");
	}
	function signatoryAuthorityEditDataTab(signatoryAuthorityVal){
		addSignatoryAuthorityDetailData(signatoryAuthorityVal);
		addSignatoryAuthorityDetailData(signatoryAuthorityVal);
		$(".staffName" + signatoryAuthorityVal).html($("#editStaffName"+signatoryAuthorityVal).val());
		$(".jobTitle" + signatoryAuthorityVal).html($("#editJobTitle"+signatoryAuthorityVal).val());
		$(".majorResponsibilities" + signatoryAuthorityVal).html($("#editMajorResponsibilities"+signatoryAuthorityVal).val());
		$(".editStaffName").val("");
		$(".editJobTitle").val("");
		$(".editMajorResponsibilities").val("");
	}
	function signatoryAuthorityDeleteData(signatoryAuthorityValData) {
		  var signatoryAuthorityCountCounter = $("#signatoryAuthorityVal").val();
		  $("#signatoryAuthorityVal").val(signatoryAuthorityCountCounter - 1);
		  var delRowElement = $(".signatory-authority-row" + signatoryAuthorityValData); 
		  delRowElement.remove();
		  var j = parseInt(signatoryAuthorityValData) + 1;
		  for (var i = j; i <= signatoryAuthorityCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".signatory-authority-row" + i);
		    rowElement.attr("class", "signatory-authority-row" + prevCounter);
		    rowElement.find("td.staffName"+i).removeClass("staffName"+i).addClass("staffName"+prevCounter);
		    rowElement.find("td.jobTitle"+i).removeClass("jobTitle"+i).addClass("jobTitle"+prevCounter);
			 rowElement.find("td.majorResponsibilities"+i).removeClass("majorResponsibilities"+i).addClass("majorResponsibilities"+prevCounter);
		    rowElement.find("#signatoryAuthorityDeleteDataTab").attr('onclick', 'signatoryAuthorityDeleteData(' +prevCounter+ ')');
		    rowElement.find("#signatoryAuthorityEditTab").attr('onclick', 'signatoryAuthorityEditTab(' +prevCounter+ ')');
		  }
	}
	function addSpecimenCollectionDetail(){
		specimenCollectionVal = $("#specimenCollectionVal").val();
		specimenCollectionNumber = $("#specimenCollectionNumber").val();
		specimenCollectionLocation = $("#specimenCollectionLocation").val();
		 if(specimenCollectionNumber != "" || specimenCollectionLocation !=""){
			$(".addSpecimenCollectionDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addSpecimenCollectionUrl}",
				data : {
					"<portlet:namespace/>specimenCollectionVal" : specimenCollectionVal,
				},
				async:false,
				success : function(data) {
					$(".addSpecimenCollectionDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".specimenCollectionNumber" + specimenCollectionVal).append(specimenCollectionNumber);
					$(".specimenCollectionLocation" + specimenCollectionVal).append(specimenCollectionLocation);
					addSpecimenCollectionDetailData("");
					specimenCollectionVal++;
					$("#specimenCollectionVal").val(specimenCollectionVal);
					$("#specimenCollectionNumber").val("");
					$("#specimenCollectionLocation").val("");
				}
			});
		}else{
			$("#specimenCollectionNumber").focus();
		}
	}
	function specimenCollectionEditTab(specimenCollectionVal){
		$(".editSpecimenCollectionEditTabPopup").modal("show");
		$(".editSpecimenCollectionNumber").attr("id" , "editSpecimenCollectionNumber"+specimenCollectionVal);
		$(".editSpecimenCollectionLocation").attr("id" , "editSpecimenCollectionLocation"+specimenCollectionVal);
		specimenCollectionNumber = $(".specimenCollectionNumber"+specimenCollectionVal+":first").text().trim();
		specimenCollectionLocation = $(".specimenCollectionLocation"+specimenCollectionVal+":first").text().trim();
		$("#editSpecimenCollectionNumber"+specimenCollectionVal).val(specimenCollectionNumber);
		$("#editSpecimenCollectionLocation"+specimenCollectionVal).val(specimenCollectionLocation);
		$(".saveEditSpecimenCollectionPopupDataBtn").attr("onclick" , "specimenCollectionEditDataTab("+specimenCollectionVal+")");
	}
	function specimenCollectionEditDataTab(specimenCollectionVal){
		addSpecimenCollectionDetailData(specimenCollectionVal);
		addSpecimenCollectionDetailData(specimenCollectionVal);
		$(".specimenCollectionNumber" + specimenCollectionVal).html($("#editSpecimenCollectionNumber"+specimenCollectionVal).val());
		$(".specimenCollectionLocation" + specimenCollectionVal).html($("#editSpecimenCollectionLocation"+specimenCollectionVal).val());
		$(".editSpecimenCollectionNumber").val("");
		$(".editSpecimenCollectionLocation").val("");
	}
	function specimenCollectionDeleteData(specimenCollectionValData) {
		  var specimenCollectionCountCounter = $("#specimenCollectionVal").val();
		  $("#specimenCollectionVal").val(specimenCollectionCountCounter - 1);
		  var delRowElement = $(".specimen-collection-row" + specimenCollectionValData); 
		  delRowElement.remove();
		  var j = parseInt(specimenCollectionValData) + 1;
		  for (var i = j; i <= specimenCollectionCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".specimen-collection-row" + i);
		    rowElement.attr("class", "specimen-collection-row" + prevCounter);
		    rowElement.find("td.specimenCollectionNumber"+i).removeClass("specimenCollectionNumber"+i).addClass("specimenCollectionNumber"+prevCounter);
		    rowElement.find("td.specimenCollectionLocation"+i).removeClass("specimenCollectionLocation"+i).addClass("specimenCollectionLocation"+prevCounter);
		    rowElement.find("#specimenCollectionDeleteDataTab").attr('onclick', 'specimenCollectionDeleteData(' +prevCounter+ ')');
		    rowElement.find("#specimenCollectionEditTab").attr('onclick', 'specimenCollectionEditTab(' +prevCounter+ ')');
		  }
	}
	function addTestingSpecimenCollectionDetail(){
		testingSpecimenCollectionVal = $("#testingSpecimenCollectionVal").val();
		testingSpecimenCollectionNumber = $("#testingSpecimenCollectionNumber").val();
		testingSpecimenCollectionLocation = $("#testingSpecimenCollectionLocation").val();
		 if(testingSpecimenCollectionNumber != "" || testingSpecimenCollectionLocation !=""){
			$(".addTestingSpecimenCollectionDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addTestingSpecimenCollectionUrl}",
				data : {
					"<portlet:namespace/>testingSpecimenCollectionVal" : testingSpecimenCollectionVal,
				},
				async:false,
				success : function(data) {
					$(".addTestingSpecimenCollectionDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".testingSpecimenCollectionNumber" + testingSpecimenCollectionVal).append(testingSpecimenCollectionNumber);
					$(".testingSpecimenCollectionLocation" + testingSpecimenCollectionVal).append(testingSpecimenCollectionLocation);
					addTestingSpecimenCollectionDetailData("");
					testingSpecimenCollectionVal++;
					$("#testingSpecimenCollectionVal").val(testingSpecimenCollectionVal);
					$("#testingSpecimenCollectionNumber").val("");
					$("#testingSpecimenCollectionLocation").val("");
				}
			});
		}else{
			$("#testingSpecimenCollectionNumber").focus();
		}
	}
	function testingSpecimenCollectionEditTab(testingSpecimenCollectionVal){
		$(".editTestingSpecimenCollectionEditTabPopup").modal("show");
		$(".editTestingSpecimenCollectionNumber").attr("id" , "editTestingSpecimenCollectionNumber"+testingSpecimenCollectionVal);
		$(".editTestingSpecimenCollectionLocation").attr("id" , "editTestingSpecimenCollectionLocation"+testingSpecimenCollectionVal);
		testingSpecimenCollectionNumber = $(".testingSpecimenCollectionNumber"+testingSpecimenCollectionVal+":first").text().trim();
		testingSpecimenCollectionLocation = $(".testingSpecimenCollectionLocation"+testingSpecimenCollectionVal+":first").text().trim();
		$("#editTestingSpecimenCollectionNumber"+testingSpecimenCollectionVal).val(testingSpecimenCollectionNumber);
		$("#editTestingSpecimenCollectionLocation"+testingSpecimenCollectionVal).val(testingSpecimenCollectionLocation);
		$(".saveEditTestingSpecimenCollectionPopupDataBtn").attr("onclick" , "testingSpecimenCollectionEditDataTab("+testingSpecimenCollectionVal+")");
	}
	function testingSpecimenCollectionEditDataTab(testingSpecimenCollectionVal){
		addTestingSpecimenCollectionDetailData(testingSpecimenCollectionVal);
		addTestingSpecimenCollectionDetailData(testingSpecimenCollectionVal);
		$(".testingSpecimenCollectionNumber" + testingSpecimenCollectionVal).html($("#editTestingSpecimenCollectionNumber"+testingSpecimenCollectionVal).val());
		$(".testingSpecimenCollectionLocation" + testingSpecimenCollectionVal).html($("#editTestingSpecimenCollectionLocation"+testingSpecimenCollectionVal).val());
		$(".editTestingSpecimenCollectionNumber").val("");
		$(".editTestingSpecimenCollectionLocation").val("");
		
	}
	function testingSpecimenCollectionDeleteData(testingSpecimenCollectionValData) {
		  var testingSpecimenCollectionCountCounter = $("#testingSpecimenCollectionVal").val();
		  $("#testingSpecimenCollectionVal").val(testingSpecimenCollectionCountCounter - 1);
		  var delRowElement = $(".testing-responsible-row" + testingSpecimenCollectionValData); 
		  delRowElement.remove();
		  var j = parseInt(testingSpecimenCollectionValData) + 1;
		  for (var i = j; i <= testingSpecimenCollectionCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".testing-responsible-row" + i);
			rowElement.attr("class", "testing-responsible-row" + prevCounter);
			rowElement.find("td.testingSpecimenCollectionNumber"+i).removeClass("testingSpecimenCollectionNumber"+i).addClass("testingSpecimenCollectionNumber"+prevCounter);
			rowElement.find("td.testingSpecimenCollectionLocation"+i).removeClass("testingSpecimenCollectionLocation"+i).addClass("testingSpecimenCollectionLocation"+prevCounter);
			rowElement.find("#testingSpecimenCollectionDeleteDataTab").attr('onclick', 'testingSpecimenCollectionDeleteData(' +prevCounter+ ')');
			rowElement.find("#testingSpecimenCollectionEditTab").attr('onclick', 'testingSpecimenCollectionEditTab(' +prevCounter+ ')');
		  }
	}
	function addCalibrationSpecimenCollectionDetail(){
		calibrationSpecimenCollectionVal = $("#calibrationSpecimenCollectionVal").val();
		calibrationSpecimenNumber = $("#calibrationSpecimenNumber").val();
		calibrationSpecimenLocation = $("#calibrationSpecimenLocation").val();
		 if(calibrationSpecimenNumber != "" || calibrationSpecimenLocation !=""){
			$(".addCalibrationSpecimenCollectionDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addCalibrationSpecimenCollectionUrl}",
				data : {
					"<portlet:namespace/>calibrationSpecimenCollectionVal" : calibrationSpecimenCollectionVal,
				},
				async:false,
				success : function(data) {
					$(".addCalibrationSpecimenCollectionDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".calibrationSpecimenNumber" + calibrationSpecimenCollectionVal).append(calibrationSpecimenNumber);
					$(".calibrationSpecimenLocation" + calibrationSpecimenCollectionVal).append(calibrationSpecimenLocation);
					addCalibrationSpecimenCollectionDetailData("");
					calibrationSpecimenCollectionVal++;
					$("#calibrationSpecimenCollectionVal").val(calibrationSpecimenCollectionVal);
					$("#calibrationSpecimenNumber").val("");
					$("#calibrationSpecimenLocation").val("");
				}
			});
		}else{
			$("#calibrationSpecimenNumber").focus();
		}
	}
	function calibrationSpecimenCollectionEditTab(calibrationSpecimenCollectionVal){
		$(".editCalibrationSpecimenCollectionEditTabPopup").modal("show");
		$(".editCalibrationSpecimenNumber").attr("id" , "editCalibrationSpecimenNumber"+calibrationSpecimenCollectionVal);
		$(".editCalibrationSpecimenLocation").attr("id" , "editCalibrationSpecimenLocation"+calibrationSpecimenCollectionVal);
		calibrationSpecimenNumber = $(".calibrationSpecimenNumber"+calibrationSpecimenCollectionVal+":first").text().trim();
		calibrationSpecimenLocation = $(".calibrationSpecimenLocation"+calibrationSpecimenCollectionVal+":first").text().trim();
		$("#editCalibrationSpecimenNumber"+calibrationSpecimenCollectionVal).val(calibrationSpecimenNumber);
		$("#editCalibrationSpecimenLocation"+calibrationSpecimenCollectionVal).val(calibrationSpecimenLocation);
		$(".saveEditCalibrationSpecimenCollectionPopupDataBtn").attr("onclick" , "calibrationSpecimenCollectionEditDataTab("+calibrationSpecimenCollectionVal+")");
	}
	function calibrationSpecimenCollectionEditDataTab(calibrationSpecimenCollectionVal){
		addCalibrationSpecimenCollectionDetailData(calibrationSpecimenCollectionVal);
		addCalibrationSpecimenCollectionDetailData(calibrationSpecimenCollectionVal);
		$(".calibrationSpecimenNumber" + calibrationSpecimenCollectionVal).html($("#editCalibrationSpecimenNumber"+calibrationSpecimenCollectionVal).val());
		$(".calibrationSpecimenLocation" + calibrationSpecimenCollectionVal).html($("#editCalibrationSpecimenLocation"+calibrationSpecimenCollectionVal).val());
		$(".editCalibrationSpecimenNumber").val("");
		$(".editCalibrationSpecimenLocation").val("");
	}
	function calibrationSpecimenCollectionDeleteData(calibrationSpecimenCollectionValData) {
		  var calibrationSpecimenCollectionCountCounter = $("#calibrationSpecimenCollectionVal").val();
		  $("#calibrationSpecimenCollectionVal").val(calibrationSpecimenCollectionCountCounter - 1);
		  var delRowElement = $(".calibration-responsible-row" + calibrationSpecimenCollectionValData); 
		  delRowElement.remove();
		  var j = parseInt(calibrationSpecimenCollectionValData) + 1;
		  for (var i = j; i <= calibrationSpecimenCollectionCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".calibration-responsible-row" + i);
			rowElement.attr("class", "calibration-responsible-row" + prevCounter);
			rowElement.find("td.calibrationSpecimenNumber"+i).removeClass("calibrationSpecimenNumber"+i).addClass("calibrationSpecimenNumber"+prevCounter);
			rowElement.find("td.calibrationSpecimenLocation"+i).removeClass("calibrationSpecimenLocation"+i).addClass("calibrationSpecimenLocation"+prevCounter);
			rowElement.find("#calibrationSpecimenCollectionDeleteDataTab").attr('onclick', 'calibrationSpecimenCollectionDeleteData(' +prevCounter+ ')');
			rowElement.find("#calibrationSpecimenCollectionEditTab").attr('onclick', 'calibrationSpecimenCollectionEditTab(' +prevCounter+ ')');
		  }
	}
	function addPointCareTestingDetail(){
		pointCareTestingVal = $("#pointCareTestingVal").val();
		
		pointCareTestingReqPoct = $("#pointCareTestingReqPoct").val();
		pointCareTestingLocation = $("#pointCareTestingLocation").val();
		 if(pointCareTestingReqPoct != "" || pointCareTestingLocation !=""){
			$(".addPointCareTestingDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPointCareTestingUrl}",
				data : {
					"<portlet:namespace/>pointCareTestingVal" : pointCareTestingVal,
				},
				async:false,
				success : function(data) {
					$(".addPointCareTestingDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".pointCareTestingReqPoct" + pointCareTestingVal).append(pointCareTestingReqPoct);
					$(".pointCareTestingLocation" + pointCareTestingVal).append(pointCareTestingLocation);
					addPointCareTestingDetailData("");
					pointCareTestingVal++;
					$("#pointCareTestingVal").val(pointCareTestingVal);
					$("#pointCareTestingReqPoct").val("");
					$("#pointCareTestingLocation").val("");
				}
			});
		}else{
			$("#pointCareTestingReqPoct").focus();
		}
	}
	function pointCareTestingEditTab(pointCareTestingVal){
		$(".editPointCareTestingReqPoctEditTabPopup").modal("show");
		$(".editPointCareTestingReqPoct").attr("id" , "editPointCareTestingReqPoct"+pointCareTestingVal);
		$(".editPointCareTestingLocation").attr("id" , "editPointCareTestingLocation"+pointCareTestingVal);
		pointCareTestingReqPoct = $(".pointCareTestingReqPoct"+pointCareTestingVal+":first").text().trim();
		pointCareTestingLocation = $(".pointCareTestingLocation"+pointCareTestingVal+":first").text().trim();
		$("#editPointCareTestingReqPoct"+pointCareTestingVal).val(pointCareTestingReqPoct);
		$("#editPointCareTestingLocation"+pointCareTestingVal).val(pointCareTestingLocation);
		$(".saveEditPointCareTestingPopupDataBtn").attr("onclick" , "pointCareTestingEditDataTab("+pointCareTestingVal+")");
	}
	function pointCareTestingEditDataTab(pointCareTestingVal){
		addPointCareTestingDetailData(pointCareTestingVal);
		addPointCareTestingDetailData(pointCareTestingVal);
		$(".pointCareTestingReqPoct" + pointCareTestingVal).html($("#editPointCareTestingReqPoct"+pointCareTestingVal).val());
		$(".pointCareTestingLocation" + pointCareTestingVal).html($("#editPointCareTestingLocation"+pointCareTestingVal).val());
		$(".editPointCareTestingReqPoct").val("");
		$(".editPointCareTestingLocation").val("");
	}
	function pointCareTestingDeleteData(pointCareTestingValData) {
		  var pointCareTestingCountCounter = $("#pointCareTestingVal").val();
		  $("#pointCareTestingVal").val(pointCareTestingCountCounter - 1);
		  var delRowElement = $(".point-care-testing-row" + pointCareTestingValData); 
		  delRowElement.remove();
		  var j = parseInt(pointCareTestingValData) + 1;
		  for (var i = j; i <= pointCareTestingCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".point-care-testing-row" + i);
		    rowElement.attr("class", "point-care-testing-row" + prevCounter);
		    rowElement.find("td.pointCareTestingReqPoct"+i).removeClass("pointCareTestingReqPoct"+i).addClass("pointCareTestingReqPoct"+prevCounter);
		    rowElement.find("td.pointCareTestingLocation"+i).removeClass("pointCareTestingLocation"+i).addClass("pointCareTestingLocation"+prevCounter);
		    rowElement.find("#pointCareTestingDeleteDataTab").attr('onclick', 'pointCareTestingDeleteData(' +prevCounter+ ')');
		    rowElement.find("#pointCareTestingEditTab").attr('onclick', 'pointCareTestingEditTab(' +prevCounter+ ')');
		  }
	}
	function addExaminationsScopeDetail(){
		examinationsScopeVal = $("#examinationsScopeVal").val();
		 product = $("#product").val();
		 examinations = $("#examinations").val();
		 methods = $("#methods").val();
		 equipment = $("#equipment").val();
		 referenceRange = $("#referenceRange").val();
		 measurementUncertainty = $("#measurementUncertainty").val();
		 if(product != "" || examinations !="" || methods !="" || equipment !="" || referenceRange !="" || measurementUncertainty !=""){
			$(".addExaminationsScopeDetaiLTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addExaminationsScopeUrl}",
				data : {
					"<portlet:namespace/>examinationsScopeVal" : examinationsScopeVal,
				},
				async:false,
				success : function(data) {
					$(".addExaminationsScopeDetaiLTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".product" + examinationsScopeVal).append(product);
					$(".examinations" + examinationsScopeVal).append(examinations);
					$(".methods" + examinationsScopeVal).append(methods);
					$(".equipment" + examinationsScopeVal).append(equipment);
					$(".referenceRange" + examinationsScopeVal).append(referenceRange);
					$(".measurementUncertainty" + examinationsScopeVal).append(measurementUncertainty);
					addExaminationsScopeDetailData("");
					examinationsScopeVal++;
					$("#examinationsScopeVal").val(examinationsScopeVal);
					$("#product").val("");
					$("#examinations").val("");
					$("#methods").val("");
					$("#equipment").val("");
					$("#referenceRange").val("");
					$("#measurementUncertainty").val("");
				}
			});
		}else{
			$("#product").focus();
		}
	}
	function examinationsScopeEditTab(examinationsScopeVal){
		$(".editExaminationsScopeEditTabPopup").modal("show");
		$(".editProduct").attr("id" , "editProduct"+examinationsScopeVal);
		$(".editExaminations").attr("id" , "editExaminations"+examinationsScopeVal);
		$(".editMethods").attr("id" , "editMethods"+examinationsScopeVal);
		$(".editEquipment").attr("id" , "editEquipment"+examinationsScopeVal);
		$(".editReferenceRange").attr("id" , "editReferenceRange"+examinationsScopeVal);
		$(".editMeasurementUncertainty").attr("id" , "editMeasurementUncertainty"+examinationsScopeVal);
		product = $(".product"+examinationsScopeVal+":first").text().trim();
		examinations = $(".examinations"+examinationsScopeVal+":first").text().trim();
		methods = $(".methods"+examinationsScopeVal+":first").text().trim();
		equipment = $(".equipment"+examinationsScopeVal+":first").text().trim();
		referenceRange = $(".referenceRange"+examinationsScopeVal+":first").text().trim();
		measurementUncertainty = $(".measurementUncertainty"+examinationsScopeVal+":first").text().trim();
		$("#editProduct"+examinationsScopeVal).val(product);
		$("#editExaminations"+examinationsScopeVal).val(examinations);
		$("#editMethods"+examinationsScopeVal).val(methods);
		$("#editEquipment"+examinationsScopeVal).val(equipment);
		$("#editReferenceRange"+examinationsScopeVal).val(referenceRange);
		$("#editMeasurementUncertainty"+examinationsScopeVal).val(measurementUncertainty);
		$(".saveEditExaminationsScopePopupDataBtn").attr("onclick" , "examinationsScopeEditDataTab("+examinationsScopeVal+")");
	}
	function examinationsScopeEditDataTab(examinationsScopeVal){
		addExaminationsScopeDetailData(examinationsScopeVal);
		addExaminationsScopeDetailData(examinationsScopeVal);
		$(".product" + examinationsScopeVal).html($("#editProduct"+examinationsScopeVal).val());
		$(".examinations" + examinationsScopeVal).html($("#editExaminations"+examinationsScopeVal).val());
		$(".methods" + examinationsScopeVal).html($("#editMethods"+examinationsScopeVal).val());
		$(".equipment" + examinationsScopeVal).html($("#editEquipment"+examinationsScopeVal).val());
		$(".referenceRange" + examinationsScopeVal).html($("#editReferenceRange"+examinationsScopeVal).val());
		$(".measurementUncertainty" + examinationsScopeVal).html($("#editMeasurementUncertainty"+examinationsScopeVal).val());
		$(".editProduct").val("");
		$(".editExaminations").val("");
		$(".editMethods").val("");
		$(".editEquipment").val("");
		$(".editReferenceRange").val("");
		$(".editMeasurementUncertainty").val("");
	}
	function examinationsScopeDeleteData(examinationsScopeValData) {
		  var examinationsScopeCountCounter = $("#examinationsScopeVal").val();
		  $("#examinationsScopeVal").val(examinationsScopeCountCounter - 1);
		  var delRowElement = $(".examinations-scope-row" + examinationsScopeValData); 
		  delRowElement.remove();
		  var j = parseInt(examinationsScopeValData) + 1;
		  for (var i = j; i <= examinationsScopeCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".examinations-scope-row" + i);
		    rowElement.attr("class", "examinations-scope-row" + prevCounter);
		    rowElement.find("td.product"+i).removeClass("product"+i).addClass("product"+prevCounter);
		    rowElement.find("td.examinations"+i).removeClass("examinations"+i).addClass("examinations"+prevCounter);
			rowElement.find("td.methods"+i).removeClass("methods"+i).addClass("methods"+prevCounter);
			rowElement.find("td.equipment"+i).removeClass("equipment"+i).addClass("equipment"+prevCounter);
		    rowElement.find("td.referenceRange"+i).removeClass("referenceRange"+i).addClass("referenceRange"+prevCounter);
			rowElement.find("td.measurementUncertainty"+i).removeClass("measurementUncertainty"+i).addClass("measurementUncertainty"+prevCounter);
		    rowElement.find("#examinationsScopeDeleteDataTab").attr('onclick', 'examinationsScopeDeleteData(' +prevCounter+ ')');
		    rowElement.find("#examinationsScopeEditTab").attr('onclick', 'examinationsScopeEditTab(' +prevCounter+ ')');
		  }
	}
	function addMajorEquipmentDetail(){
		majorEquipmentVal = $("#majorEquipmentVal").val();
		 inventory = $("#inventory").val();
		 item = $("#item").val();
		 manufacturer = $("#manufacturer").val();
		 model = $("#model").val();
		 calibrationInterval = $("#calibrationInterval").val();
		 calibratedBy = $("#calibratedBy").val();
		 if(inventory != "" || item !="" || manufacturer !="" || model !="" || calibrationInterval !="" || calibratedBy !=""){
			$(".addMajorEquipmentDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMajorEquipmentUrl}",
				data : {
					"<portlet:namespace/>majorEquipmentVal" : majorEquipmentVal,
				},
				async:false,
				success : function(data) {
					$(".addMajorEquipmentDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".inventory" + majorEquipmentVal).append(inventory);
					$(".item" + majorEquipmentVal).append(item);
					$(".manufacturer" + majorEquipmentVal).append(manufacturer);
					$(".model" + majorEquipmentVal).append(model);
					$(".calibrationInterval" + majorEquipmentVal).append(calibrationInterval);
					$(".calibratedBy" + majorEquipmentVal).append(calibratedBy);
					addMajorEquipmentDetailData("");
					majorEquipmentVal++;
					$("#majorEquipmentVal").val(majorEquipmentVal);
					$("#inventory").val("");
					$("#item").val("");
					$("#manufacturer").val("");
					$("#model").val("");
					$("#calibrationInterval").val("");
					$("#calibratedBy").val("");
				}
			});
		}else{
			$("#inventory").focus();
		}
	}
	function majorEquipmentEditTab(majorEquipmentVal){
		$(".editMajorEquipmentEditTabPopup").modal("show");
		$(".editInventory").attr("id" , "editInventory"+majorEquipmentVal);
		$(".editItem").attr("id" , "editItem"+majorEquipmentVal);
		$(".editManufacturer").attr("id" , "editManufacturer"+majorEquipmentVal);
		$(".editModel").attr("id" , "editModel"+majorEquipmentVal);
		$(".editCalibrationInterval").attr("id" , "editCalibrationInterval"+majorEquipmentVal);
		$(".editCalibratedBy").attr("id" , "editCalibratedBy"+majorEquipmentVal);
		inventory = $(".inventory"+majorEquipmentVal+":first").text().trim();
		item = $(".item"+majorEquipmentVal+":first").text().trim();
		manufacturer = $(".manufacturer"+majorEquipmentVal+":first").text().trim();
		model = $(".model"+majorEquipmentVal+":first").text().trim();
		calibrationInterval = $(".calibrationInterval"+majorEquipmentVal+":first").text().trim();
		calibratedBy = $(".calibratedBy"+majorEquipmentVal+":first").text().trim();
		$("#editInventory"+majorEquipmentVal).val(inventory);
		$("#editItem"+majorEquipmentVal).val(item);
		$("#editManufacturer"+majorEquipmentVal).val(manufacturer);
		$("#editModel"+majorEquipmentVal).val(model);
		$("#editCalibrationInterval"+majorEquipmentVal).val(calibrationInterval);
		$("#editCalibratedBy"+majorEquipmentVal).val(calibratedBy);
		$(".saveEditMajorEquipmentPopupDataBtn").attr("onclick" , "majorEquipmentEditDataTab("+majorEquipmentVal+")");
	}
	function majorEquipmentEditDataTab(majorEquipmentVal){
		addMajorEquipmentDetailData(majorEquipmentVal);
		addMajorEquipmentDetailData(majorEquipmentVal);
		$(".inventory" + majorEquipmentVal).html($("#editInventory"+majorEquipmentVal).val());
		$(".item" + majorEquipmentVal).html($("#editItem"+majorEquipmentVal).val());
		$(".manufacturer" + majorEquipmentVal).html($("#editManufacturer"+majorEquipmentVal).val());
		$(".model" + majorEquipmentVal).html($("#editModel"+majorEquipmentVal).val());
		$(".calibrationInterval" + majorEquipmentVal).html($("#editCalibrationInterval"+majorEquipmentVal).val());
		$(".calibratedBy" + majorEquipmentVal).html($("#editCalibratedBy"+majorEquipmentVal).val());
		$(".editInventory").val("");
		$(".editItem").val("");
		$(".editManufacturer").val("");
		$(".editModel").val("");
		$(".editCalibrationInterval").val("");
		$(".editCalibratedBy").val("");
	}
	function majorEquipmentDeleteData(majorEquipmentValData) {
		  var majorEquipmentCountCounter = $("#majorEquipmentVal").val();
		  $("#majorEquipmentVal").val(majorEquipmentCountCounter - 1);
		  var delRowElement = $(".major-equipment-row" + majorEquipmentValData); 
		  delRowElement.remove();
		  var j = parseInt(majorEquipmentValData) + 1;
		  for (var i = j; i <= majorEquipmentCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".major-equipment-row" + i);
		    rowElement.attr("class", "major-equipment-row" + prevCounter);
		    rowElement.find("td.inventory"+i).removeClass("inventory"+i).addClass("inventory"+prevCounter);
		    rowElement.find("td.item"+i).removeClass("item"+i).addClass("item"+prevCounter);
			rowElement.find("td.manufacturer"+i).removeClass("manufacturer"+i).addClass("manufacturer"+prevCounter);
			rowElement.find("td.model"+i).removeClass("model"+i).addClass("model"+prevCounter);
		    rowElement.find("td.calibrationInterval"+i).removeClass("calibrationInterval"+i).addClass("calibrationInterval"+prevCounter);
			rowElement.find("td.calibratedBy"+i).removeClass("calibratedBy"+i).addClass("calibratedBy"+prevCounter);
		    rowElement.find("#majorEquipmentDeleteDataTab").attr('onclick', 'majorEquipmentDeleteData(' +prevCounter+ ')');
		    rowElement.find("#majorEquipmentEditTab").attr('onclick', 'majorEquipmentEditTab(' +prevCounter+ ')');
		  }
	}
	function addApplicationActivityLocDetail(){
		applicationActivityLocVal = $("#applicationActivityLocVal").val();
		 activityNumber = $("#activityNumber").val();
		 applicationActivityAddress = $("#applicationActivityAddress").val();
		 activityPerformedLoc = $("#activityPerformedLoc").val();
		 activityContactDetails = $("#activityContactDetails").val();
		 if(activityNumber != "" || applicationActivityAddress !="" || activityPerformedLoc !="" || activityContactDetails !=""){
			$(".addApplicationActivityLocDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addApplicationActivityLocUrl}",
				data : {
					"<portlet:namespace/>applicationActivityLocVal" : applicationActivityLocVal,
				},
				async:false,
				success : function(data) {
					$(".addApplicationActivityLocDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".activityNumber" + applicationActivityLocVal).append(activityNumber);
					$(".applicationActivityAddress" + applicationActivityLocVal).append(applicationActivityAddress);
					$(".activityPerformedLoc" + applicationActivityLocVal).append(activityPerformedLoc);
					$(".activityContactDetails" + applicationActivityLocVal).append(activityContactDetails);
					addApplicationActivityLocDetailData("");
					applicationActivityLocVal++;
					$("#applicationActivityLocVal").val(applicationActivityLocVal);
					$("#activityNumber").val("");
					$("#applicationActivityAddress").val("");
					$("#activityPerformedLoc").val("");
					$("#activityContactDetails").val("");
				}
			});
		}else{
			$("#activityNumber").focus();
		}
	}
	function applicationActivityLocEditTab(applicationActivityLocVal){
		$(".editApplicationActivityLocEditTabPopup").modal("show");
		$(".editActivityNumber").attr("id" , "editActivityNumber"+applicationActivityLocVal);
		$(".editApplicationActivityAddress").attr("id" , "editApplicationActivityAddress"+applicationActivityLocVal);
		$(".editActivityPerformedLoc").attr("id" , "editActivityPerformedLoc"+applicationActivityLocVal);
		$(".editActivityContactDetailsl").attr("id" , "editActivityContactDetailsl"+applicationActivityLocVal);
		activityNumber = $(".activityNumber"+applicationActivityLocVal+":first").text().trim();
		applicationActivityAddress = $(".applicationActivityAddress"+applicationActivityLocVal+":first").text().trim();
		activityPerformedLoc = $(".activityPerformedLoc"+applicationActivityLocVal+":first").text().trim();
		activityContactDetails = $(".activityContactDetails"+applicationActivityLocVal+":first").text().trim();
		$("#editActivityNumber"+applicationActivityLocVal).val(activityNumber);
		$("#editApplicationActivityAddress"+applicationActivityLocVal).val(applicationActivityAddress);
		$("#editActivityPerformedLoc"+applicationActivityLocVal).val(activityPerformedLoc);
		$("#editActivityContactDetailsl"+applicationActivityLocVal).val(activityContactDetails);
		$(".saveEditApplicationActivityLocPopupDataBtn").attr("onclick" , "applicationActivityLocEditDataTab("+applicationActivityLocVal+")");
	}
	function applicationActivityLocEditDataTab(applicationActivityLocVal){
		addApplicationActivityLocDetailData(applicationActivityLocVal);
		addApplicationActivityLocDetailData(applicationActivityLocVal);
		$(".activityNumber" + applicationActivityLocVal).html($("#editActivityNumber"+applicationActivityLocVal).val());
		$(".applicationActivityAddress" + applicationActivityLocVal).html($("#editApplicationActivityAddress"+applicationActivityLocVal).val());
		$(".activityPerformedLoc" + applicationActivityLocVal).html($("#editActivityPerformedLoc"+applicationActivityLocVal).val());
		$(".activityContactDetails" + applicationActivityLocVal).html($("#editActivityContactDetailsl"+applicationActivityLocVal).val());
		$(".editActivityNumber").val("");
		$(".editApplicationActivityAddress").val("");
		$(".editActivityPerformedLoc").val("");
		$(".editActivityContactDetailsl").val("");
	}
	function applicationActivityLocDeleteData(applicationActivityLocValData) {
		  var applicationActivityLocCountCounter = $("#applicationActivityLocVal").val();
		  $("#applicationActivityLocVal").val(applicationActivityLocCountCounter - 1);
		  var delRowElement = $(".application-activity-loc-row" + applicationActivityLocValData); 
		  delRowElement.remove();
		  var j = parseInt(applicationActivityLocValData) + 1;
		  for (var i = j; i <= applicationActivityLocCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".application-activity-loc-row" + i);
		    rowElement.attr("class", "application-activity-loc-row" + prevCounter);
		    rowElement.find("td.activityNumber"+i).removeClass("activityNumber"+i).addClass("activityNumber"+prevCounter);
		    rowElement.find("td.applicationActivityAddress"+i).removeClass("applicationActivityAddress"+i).addClass("applicationActivityAddress"+prevCounter);
			rowElement.find("td.activityPerformedLoc"+i).removeClass("activityPerformedLoc"+i).addClass("activityPerformedLoc"+prevCounter);
			rowElement.find("td.activityContactDetails"+i).removeClass("activityContactDetails"+i).addClass("activityContactDetails"+prevCounter);
		    rowElement.find("#applicationActivityLocDeleteDataTab").attr('onclick', 'applicationActivityLocDeleteData(' +prevCounter+ ')');
		    rowElement.find("#applicationActivityLocEditTab").attr('onclick', 'applicationActivityLocEditTab(' +prevCounter+ ')');
		  }
	}
	function addPersonnelResponsibleTestingDetail(){
		personnelResponsibleTestingVal = $("#personnelResponsibleTestingVal").val();
		
		 technicalPersonnelNameTesting = $("#technicalPersonnelNameTesting").val();
		 technicalPersonnelEmailTesting = $("#technicalPersonnelEmailTesting").val();
		 if(technicalPersonnelNameTesting != "" || technicalPersonnelEmailTesting !=""){
			$(".addPersonnelResponsibleTestingDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonnelResponsibleTestingUrl}",
				data : {
					"<portlet:namespace/>personnelResponsibleTestingVal" : personnelResponsibleTestingVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonnelResponsibleTestingDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonnelNameTesting" + personnelResponsibleTestingVal).append(technicalPersonnelNameTesting);
					$(".technicalPersonnelEmailTesting" + personnelResponsibleTestingVal).append(technicalPersonnelEmailTesting);
					addPersonnelResponsibleTestingDetailData("");
					personnelResponsibleTestingVal++;
					$("#personnelResponsibleTestingVal").val(personnelResponsibleTestingVal);
					$("#technicalPersonnelNameTesting").val("");
					$("#technicalPersonnelEmailTesting").val("");
				}
			});
		}else{
			$("#technicalPersonnelNameTesting").focus();
		}
	}
	function personnelResponsibleTestingEditTab(personnelResponsibleTestingVal){
		$(".editPersonnelResponsibleTestingEditTabPopup").modal("show");
		$(".editTechnicalPersonnelNameTesting").attr("id" , "editTechnicalPersonnelNameTesting"+personnelResponsibleTestingVal);
		$(".editTechnicalPersonnelEmailTesting").attr("id" , "editTechnicalPersonnelEmailTesting"+personnelResponsibleTestingVal);
		technicalPersonnelNameTesting = $(".technicalPersonnelNameTesting"+personnelResponsibleTestingVal+":first").text().trim();
		technicalPersonnelEmailTesting = $(".technicalPersonnelEmailTesting"+personnelResponsibleTestingVal+":first").text().trim();
		$("#editTechnicalPersonnelNameTesting"+personnelResponsibleTestingVal).val(technicalPersonnelNameTesting);
		$("#editTechnicalPersonnelEmailTesting"+personnelResponsibleTestingVal).val(technicalPersonnelEmailTesting);
		$(".saveEditPersonnelResponsibleTestingPopupDataBtn").attr("onclick" , "personnelResponsibleTestingEditDataTab("+personnelResponsibleTestingVal+")");
	}
	function personnelResponsibleTestingEditDataTab(personnelResponsibleTestingVal){
		addPersonnelResponsibleTestingDetailData(personnelResponsibleTestingVal);
		addPersonnelResponsibleTestingDetailData(personnelResponsibleTestingVal);
		$(".technicalPersonnelNameTesting" + personnelResponsibleTestingVal).html($("#editTechnicalPersonnelNameTesting"+personnelResponsibleTestingVal).val());
		$(".technicalPersonnelEmailTesting" + personnelResponsibleTestingVal).html($("#editTechnicalPersonnelEmailTesting"+personnelResponsibleTestingVal).val());
		$(".editTechnicalPersonnelNameTesting").val("");
		$(".editTechnicalPersonnelEmailTesting").val("");
	}
	function personnelResponsibleTestingDeleteData(personnelResponsibleTestingValData) {
		  var personnelResponsibleTestingCountCounter = $("#personnelResponsibleTestingVal").val();
		  $("#personnelResponsibleTestingVal").val(personnelResponsibleTestingCountCounter - 1);
		  var delRowElement = $(".personnel-responsible-testing-row" + personnelResponsibleTestingValData); 
		  delRowElement.remove();
		  var j = parseInt(personnelResponsibleTestingValData) + 1;
		  for (var i = j; i <= personnelResponsibleTestingCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".personnel-responsible-testing-row" + i);
			rowElement.attr("class", "personnel-responsible-testing-row" + prevCounter);
			rowElement.find("td.technicalPersonnelNameTesting"+i).removeClass("technicalPersonnelNameTesting"+i).addClass("technicalPersonnelNameTesting"+prevCounter);
			rowElement.find("td.technicalPersonnelEmailTesting"+i).removeClass("technicalPersonnelEmailTesting"+i).addClass("technicalPersonnelEmailTesting"+prevCounter);
			rowElement.find("#personnelResponsibleTestingDeleteDataTab").attr('onclick', 'personnelResponsibleTestingDeleteData(' +prevCounter+ ')');
			rowElement.find("#personnelResponsibleTestingEditTab").attr('onclick', 'personnelResponsibleTestingEditTab(' +prevCounter+ ')');
		  }
	}
	function addStaffDetail(){
		 staffDetailVal = $("#staffDetailVal").val();
		 staffNameTesting = $("#staffNameTesting").val();
		 jobTitleTesting = $("#jobTitleTesting").val();
		 majorResponsibilitiesTesting = $("#majorResponsibilitiesTesting").val();
		 analystsInvolveTesting = $("#analystsInvolveTesting").val();
		 if(staffNameTesting != "" || jobTitleTesting !="" || majorResponsibilitiesTesting !="" || analystsInvolveTesting !=""){
			$(".addStaffDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailTestingUrl}",
				data : {
					"<portlet:namespace/>staffDetailVal" : staffDetailVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameTesting" + staffDetailVal).append(staffNameTesting);
					$(".jobTitleTesting" + staffDetailVal).append(jobTitleTesting);
					$(".majorResponsibilitiesTesting" + staffDetailVal).append(majorResponsibilitiesTesting);
					$(".analystsInvolveTesting" + staffDetailVal).append(analystsInvolveTesting);
					addStaffDetailData("");
					staffDetailVal++;
					$("#staffDetailVal").val(staffDetailVal);
					$("#staffNameTesting").val("");
					$("#jobTitleTesting").val("");
					$("#majorResponsibilitiesTesting").val("");
					$("#analystsInvolveTesting").val("");
				}
			});
		}else{
			$("#staffNameTesting").focus();
		}
	}
	function staffDetailTestingEditTab(staffDetailVal){
		$(".editStaffDetailTestingEditTabPopup").modal("show");
		$(".editStaffNameTesting").attr("id" , "editStaffNameTesting"+staffDetailVal);
		$(".editJobTitleTesting").attr("id" , "editJobTitleTesting"+staffDetailVal);
		$(".editMajorResponsibilitiesTesting").attr("id" , "editMajorResponsibilitiesTesting"+staffDetailVal);
		$(".editAnalystsInvolveTesting").attr("id" , "editAnalystsInvolveTesting"+staffDetailVal);
		staffNameTesting = $(".staffNameTesting"+staffDetailVal+":first").text().trim();
		jobTitleTesting = $(".jobTitleTesting"+staffDetailVal+":first").text().trim();
		majorResponsibilitiesTesting = $(".majorResponsibilitiesTesting"+staffDetailVal+":first").text().trim();
		analystsInvolveTesting = $(".analystsInvolveTesting"+staffDetailVal+":first").text().trim();
		$("#editStaffNameTesting"+staffDetailVal).val(staffNameTesting);
		$("#editJobTitleTesting"+staffDetailVal).val(jobTitleTesting);
		$("#editMajorResponsibilitiesTesting"+staffDetailVal).val(majorResponsibilitiesTesting);
		$("#editAnalystsInvolveTesting"+staffDetailVal).val(analystsInvolveTesting);
		$(".saveEditStaffDetailTestingPopupDataBtn").attr("onclick" , "staffDetailTestingEditDataTab("+staffDetailVal+")");
	}
	function staffDetailTestingEditDataTab(staffDetailVal){
		addStaffDetailData(staffDetailVal);
		addStaffDetailData(staffDetailVal);
		$(".staffNameTesting" + staffDetailVal).html($("#editStaffNameTesting"+staffDetailVal).val());
		$(".jobTitleTesting" + staffDetailVal).html($("#editJobTitleTesting"+staffDetailVal).val());
		$(".majorResponsibilitiesTesting" + staffDetailVal).html($("#editMajorResponsibilitiesTesting"+staffDetailVal).val());
		$(".analystsInvolveTesting" + staffDetailVal).html($("#editAnalystsInvolveTesting"+staffDetailVal).val());
		$(".editStaffNameTesting").val("");
		$(".editJobTitleTesting").val("");
		$(".editMajorResponsibilitiesTesting").val("");
		$(".editAnalystsInvolveTesting").val("");
	}
	function staffDetailTestingDeleteData(staffDetailValData) {
		  var staffDetailTestingCountCounter = $("#staffDetailVal").val();
		  $("#staffDetailVal").val(staffDetailTestingCountCounter - 1);
		  var delRowElement = $(".staff-detail-testing-row" + staffDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailValData) + 1;
		  for (var i = j; i <= staffDetailTestingCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-testing-row" + i);
		    rowElement.attr("class", "staff-detail-testing-row" + prevCounter);
		    rowElement.find("td.staffNameTesting"+i).removeClass("staffNameTesting"+i).addClass("staffNameTesting"+prevCounter);
		    rowElement.find("td.jobTitleTesting"+i).removeClass("jobTitleTesting"+i).addClass("jobTitleTesting"+prevCounter);
			rowElement.find("td.majorResponsibilitiesTesting"+i).removeClass("majorResponsibilitiesTesting"+i).addClass("majorResponsibilitiesTesting"+prevCounter);
			rowElement.find("td.analystsInvolveTesting"+i).removeClass("analystsInvolveTesting"+i).addClass("analystsInvolveTesting"+prevCounter);
		    rowElement.find("#staffDetailTestingDeleteDataTab").attr('onclick', 'staffDetailTestingDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailTestingEditTab").attr('onclick', 'staffDetailTestingEditTab(' +prevCounter+ ')');
		  }
	}
	function addScopeForAccreditationDetail(){
		scopeForAccreditationVal = $("#scopeForAccreditationVal").val();
		 productTesting = $("#productTesting").val();
		 testsTesting = $("#testsTesting").val();
		 methodsTesting = $("#methodsTesting").val();
		 equipmentTesting = $("#equipmentTesting").val();
		 capanilityLimitTesting = $("#capanilityLimitTesting").val();
		 measurementUncertaintyTesting = $("#measurementUncertaintyTesting").val();
		 if(productTesting != "" || testsTesting !="" || methodsTesting !="" || equipmentTesting !="" || capanilityLimitTesting !="" || measurementUncertaintyTesting !=""){
			$(".addScopeForAccreditationDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addScopeForAccreditationTestingUrl}",
				data : {
					"<portlet:namespace/>scopeForAccreditationVal" : scopeForAccreditationVal,
				},
				async:false,
				success : function(data) {
					$(".addScopeForAccreditationDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".productTesting" + scopeForAccreditationVal).append(productTesting);
					$(".testsTesting" + scopeForAccreditationVal).append(testsTesting);
					$(".methodsTesting" + scopeForAccreditationVal).append(methodsTesting);
					$(".equipmentTesting" + scopeForAccreditationVal).append(equipmentTesting);
					$(".capanilityLimitTesting" + scopeForAccreditationVal).append(capanilityLimitTesting);
					$(".measurementUncertaintyTesting" + scopeForAccreditationVal).append(measurementUncertaintyTesting);
					addScopeForAccreditationDetailData("");
					scopeForAccreditationVal++;
					$("#scopeForAccreditationVal").val(scopeForAccreditationVal);
					$("#productTesting").val("");
					$("#testsTesting").val("");
					$("#methodsTesting").val("");
					$("#equipmentTesting").val("");
					$("#capanilityLimitTesting").val("");
					$("#measurementUncertaintyTesting").val("");
				}
			});
		}else{
			$("#productTesting").focus();
		}
	}
</script>