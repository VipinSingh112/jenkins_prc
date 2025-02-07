<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addAcknowledgementMedicalDetailDataUrl" id="add/acknowledge/medical/detail"></portlet:resourceURL>
<portlet:resourceURL var="addApplicantSignatureDetailDataUrl" id="add/acknowledge/medical/detail"></portlet:resourceURL>
<script>
/* Unsealed Sources Detail */
	function addUnsealedSourcesDetail(){
		unsealedSourcesDetailVal = $("#unsealedSourcesDetailVal").val();
		unsealedSourcesRadionuclide = $("#unsealedSourcesRadionuclide").val();
		unsealedSourcesActivity = $("#unsealedSourcesActivity").val();
		unsealedSourcesTotalYear = $("#unsealedSourcesTotalYear").val();
		unsealedSourcesUse = $("#unsealedSourcesUse").val();
		unsealedCertiCopy=$("#unsealedCertiCopy").parent().parent().parent().find(".attach-detailed-overview").html();
		
		 if(unsealedSourcesRadionuclide != "" || unsealedSourcesActivity !="" || unsealedSourcesTotalYear !="" || unsealedSourcesUse !=""){
			$(".addUnsealedSourcesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addUnsealedSourcesUrl}",
				data : {
					"<portlet:namespace/>unsealedSourcesDetailVal" : unsealedSourcesDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addUnsealedSourcesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".unsealedSourcesRadionuclide" + unsealedSourcesDetailVal).append(unsealedSourcesRadionuclide);
					$(".unsealedSourcesActivity" + unsealedSourcesDetailVal).append(unsealedSourcesActivity);
					$(".unsealedSourcesTotalYear" + unsealedSourcesDetailVal).append(unsealedSourcesTotalYear);
					$(".unsealedSourcesUse" + unsealedSourcesDetailVal).append(unsealedSourcesUse);
					$(".unsealedCertiCopy" + unsealedSourcesDetailVal).append(unsealedCertiCopy);
					
				/*data save function calling */
				unsealedSourcesDetailData("",unsealedSourcesDetailVal);
					/* VALUE INCREAMENT */
					unsealedSourcesDetailVal++;
					$("#unsealedSourcesDetailVal").val(unsealedSourcesDetailVal);
					/* RESET FORM FIELDS */
					$("#unsealedSourcesRadionuclide").val("");
					$("#unsealedSourcesActivity").val("");
					$("#unsealedSourcesTotalYear").val("");
					$("#unsealedSourcesUse").val("");
					$("#unsealedCertiCopy").parent().parent().parent().find(".attach-detailed-overview").html("");
				}
			});
		}else{
			$("#unsealedSourcesRadionuclide").focus();
		}
	}
	function unsealedSourcesEditTab(unsealedSourcesDetailVal){
		$(".editUnsealedSourcesEditTabPopup").modal("show");
		$(".editUnsealedSourcesRadionuclide").attr("id" , "editUnsealedSourcesRadionuclide"+unsealedSourcesDetailVal);
		$(".editUnsealedSourcesActivity").attr("id" , "editUnsealedSourcesActivity"+unsealedSourcesDetailVal);
		$(".editUnsealedSourcesTotalYear").attr("id" , "editUnsealedSourcesTotalYear"+unsealedSourcesDetailVal);
		$(".editUnsealedSourcesUse").attr("id" , "editUnsealedSourcesUse"+unsealedSourcesDetailVal);
		$(".editUnsealedUpload").attr("id" , "editUnsealedUpload"+unsealedSourcesDetailVal);
		
		unsealedSourcesRadionuclide = $(".unsealedSourcesRadionuclide"+unsealedSourcesDetailVal+":first").text().trim();
		unsealedSourcesActivity = $(".unsealedSourcesActivity"+unsealedSourcesDetailVal+":first").text().trim();
		unsealedSourcesTotalYear = $(".unsealedSourcesTotalYear"+unsealedSourcesDetailVal+":first").text().trim();
		unsealedSourcesUse = $(".unsealedSourcesUse"+unsealedSourcesDetailVal+":first").text().trim();
		unsealedCertiCopy = $(".unsealedCertiCopy"+unsealedSourcesDetailVal+":first").text().trim();
		
		
		$("#editUnsealedSourcesRadionuclide"+unsealedSourcesDetailVal).val(unsealedSourcesRadionuclide);
		$("#editUnsealedSourcesActivity"+unsealedSourcesDetailVal).val(unsealedSourcesActivity);
		$("#editUnsealedSourcesTotalYear"+unsealedSourcesDetailVal).val(unsealedSourcesTotalYear);
		$("#editUnsealedSourcesUse"+unsealedSourcesDetailVal).val(unsealedSourcesUse);
		$("#editUnsealedUpload"+unsealedSourcesDetailVal).html(unsealedCertiCopy);
		
		
		$(".saveEditUnsealedSourcesPopupDataBtn").attr("onclick" , "unsealedSourcesEditDataTab("+unsealedSourcesDetailVal+")");
	}
	function unsealedSourcesEditDataTab(unsealedSourcesDetailVal){
		unsealedSourcesDetailData("",unsealedSourcesDetailVal);
		$(".unsealedSourcesRadionuclide" + unsealedSourcesDetailVal).html($("#editUnsealedSourcesRadionuclide"+unsealedSourcesDetailVal).val());
		$(".unsealedSourcesActivity" + unsealedSourcesDetailVal).html($("#editUnsealedSourcesActivity"+unsealedSourcesDetailVal).val());
		$(".unsealedSourcesTotalYear" + unsealedSourcesDetailVal).html($("#editUnsealedSourcesTotalYear"+unsealedSourcesDetailVal).val());
		$(".unsealedSourcesUse" + unsealedSourcesDetailVal).html($("#editUnsealedSourcesUse"+unsealedSourcesDetailVal).val());
		$(".unsealedCertiCopy" + unsealedSourcesDetailVal).html($("#editUnsealedUpload"+unsealedSourcesDetailVal).html());
		
		$(".editUnsealedSourcesRadionuclide").val("");
		$(".editUnsealedSourcesActivity").val("");
		$(".editUnsealedSourcesTotalYear").val("");
		$(".editUnsealedSourcesUse").val("");
		$(".editUnsealedUpload").html("");
		
	}
	function unsealedSourcesDetailDeleteData(unsealedSourcesDetailValData) {
		unsealedSourcesDetailDataDelete(unsealedSourcesDetailValData);
		  var unsealedSourcesCountCounter = $("#unsealedSourcesDetailVal").val();
		  $("#unsealedSourcesDetailVal").val(unsealedSourcesCountCounter - 1);
		  var delRowElement = $(".unsealed-sources-row" + unsealedSourcesDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(unsealedSourcesDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= unsealedSourcesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".unsealed-sources-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "unsealed-sources-row" + prevCounter);
		    rowElement.find("td.unsealedSourcesRadionuclide"+i).removeClass("unsealedSourcesRadionuclide"+i).addClass("unsealedSourcesRadionuclide"+prevCounter);
		    rowElement.find("td.unsealedSourcesActivity"+i).removeClass("unsealedSourcesActivity"+i).addClass("unsealedSourcesActivity"+prevCounter);
		    rowElement.find("td.unsealedSourcesTotalYear"+i).removeClass("unsealedSourcesTotalYear"+i).addClass("unsealedSourcesTotalYear"+prevCounter);
		    rowElement.find("td.unsealedSourcesUse"+i).removeClass("unsealedSourcesUse"+i).addClass("unsealedSourcesUse"+prevCounter);
		    rowElement.find("td a.unsealedCertiCopy"+i).removeClass("unsealedCertiCopy"+i).addClass("unsealedCertiCopy"+prevCounter);
		    rowElement.find("#unsealedSourcesDetailDeleteDataTab").attr('onclick', 'unsealedSourcesDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#unsealedSourcesEditTab").attr('onclick', 'unsealedSourcesEditTab(' +prevCounter+ ')');
		  }
	}
	
	/* Sealed Sources */
	function addSealedSourcesDetail(){
		sealedSourcesDetailVal = $("#sealedSourcesDetailVal").val();
		sealedSourcesRadionuclide = $("#sealedSourcesRadionuclide").val();
		sealedSourcesMaxActivity = $("#sealedSourcesMaxActivity").val();
		sealedSourcesActivityDate = $("#sealedSourcesActivityDate").val();
		sealedSourcesCategories = $("#sealedSourcesCategories").val();
		sealedSourcesUse = $("#sealedSourcesUse").val();
		sealedSourceRadDevice=$("#sealedSourceRadDevice").parent().parent().parent().find(".attach-detailed-overview").html();
		
		 if(sealedSourcesRadionuclide != "" || sealedSourcesMaxActivity !="" || sealedSourcesActivityDate !="" || sealedSourcesCategories !="" || sealedSourcesUse !=""){
			$(".addSealedSourcesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addSealedSourcesUrl}",
				data : {
					"<portlet:namespace/>sealedSourcesDetailVal" : sealedSourcesDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addSealedSourcesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".sealedSourcesRadionuclide" + sealedSourcesDetailVal).append(sealedSourcesRadionuclide);
					$(".sealedSourcesMaxActivity" + sealedSourcesDetailVal).append(sealedSourcesMaxActivity);
					$(".sealedSourcesActivityDate" + sealedSourcesDetailVal).append(sealedSourcesActivityDate);
					$(".sealedSourcesCategories" + sealedSourcesDetailVal).append(sealedSourcesCategories);
					$(".sealedSourcesUse" + sealedSourcesDetailVal).append(sealedSourcesUse);
					$(".sealedSourceRadDevice" + sealedSourcesDetailVal).append(sealedSourceRadDevice);
					
					/* VALUE INCREAMENT */
					sealedSourcesDetailData("",sealedSourcesDetailVal);
					sealedSourcesDetailVal++;
					$("#sealedSourcesDetailVal").val(sealedSourcesDetailVal);
					
					/* RESET FORM FIELDS */
					$("#sealedSourcesRadionuclide").val("");
					$("#sealedSourcesMaxActivity").val("");
					$("#sealedSourcesActivityDate").val("");
					$("#sealedSourcesCategories").val("");
					$("#sealedSourcesUse").val("");
					$("#sealedSourceRadDevice").parent().parent().parent().find(".attach-detailed-overview").html("");
				}
			});
		}else{
			$("#sealedSourcesRadionuclide").focus();
		}
	}
	function sealedSourcesEditTab(sealedSourcesDetailVal){
		$(".editSealedSourcesEditTabPopup").modal("show");
		$(".editSealedSourcesRadionuclide").attr("id" , "editSealedSourcesRadionuclide"+sealedSourcesDetailVal);
		$(".editSealedSourcesMaxActivity").attr("id" , "editSealedSourcesMaxActivity"+sealedSourcesDetailVal);
		$(".editSealedSourcesActivityDate").attr("id" , "editSealedSourcesActivityDate"+sealedSourcesDetailVal);
		$(".editSealedSourcesCategories").attr("id" , "editSealedSourcesCategories"+sealedSourcesDetailVal);
		$(".editSealedSourcesUse").attr("id" , "editSealedSourcesUse"+sealedSourcesDetailVal);
		$(".editSealedSourceUpload").attr("id" , "editSealedSourceUpload"+sealedSourcesDetailVal);
		
		sealedSourcesRadionuclide = $(".sealedSourcesRadionuclide"+sealedSourcesDetailVal+":first").text().trim();
		sealedSourcesMaxActivity = $(".sealedSourcesMaxActivity"+sealedSourcesDetailVal+":first").text().trim();
		sealedSourcesActivityDate = $(".sealedSourcesActivityDate"+sealedSourcesDetailVal+":first").text().trim();
		sealedSourcesCategories = $(".sealedSourcesCategories"+sealedSourcesDetailVal+":first").text().trim();
		sealedSourcesUse = $(".sealedSourcesUse"+sealedSourcesDetailVal+":first").text().trim();
		sealedSourceRadDevice = $(".sealedSourceRadDevice"+sealedSourcesDetailVal+":first").text().trim();
		
		
		$("#editSealedSourcesRadionuclide"+sealedSourcesDetailVal).val(sealedSourcesRadionuclide);
		$("#editSealedSourcesMaxActivity"+sealedSourcesDetailVal).val(sealedSourcesMaxActivity);
		$("#editSealedSourcesActivityDate"+sealedSourcesDetailVal).val(sealedSourcesActivityDate);
		$("#editSealedSourcesCategories"+sealedSourcesDetailVal).val(sealedSourcesCategories);
		$("#editSealedSourcesUse"+sealedSourcesDetailVal).val(sealedSourcesUse);
		$("#editSealedSourceUpload"+sealedSourcesDetailVal).html(sealedSourceRadDevice);
		
		
		$(".saveEditSealedSourcesPopupDataBtn").attr("onclick" , "sealedSourcesEditDataTab("+sealedSourcesDetailVal+")");
	}
	function sealedSourcesEditDataTab(sealedSourcesDetailVal){
		sealedSourcesDetailData(sealedSourcesDetailVal);
		$(".sealedSourcesRadionuclide" + sealedSourcesDetailVal).html($("#editSealedSourcesRadionuclide"+sealedSourcesDetailVal).val());
		$(".sealedSourcesMaxActivity" + sealedSourcesDetailVal).html($("#editSealedSourcesMaxActivity"+sealedSourcesDetailVal).val());
		$(".sealedSourcesActivityDate" + sealedSourcesDetailVal).html($("#editSealedSourcesActivityDate"+sealedSourcesDetailVal).val());
		$(".sealedSourcesCategories" + sealedSourcesDetailVal).html($("#editSealedSourcesCategories"+sealedSourcesDetailVal).val());
		$(".sealedSourcesUse" + sealedSourcesDetailVal).html($("#editSealedSourcesUse"+sealedSourcesDetailVal).val());
		$(".sealedSourceRadDevice" + sealedSourcesDetailVal).html($("#editSealedSourceUpload"+sealedSourcesDetailVal).html());
		
		$(".editSealedSourcesRadionuclide").val("");
		$(".editSealedSourcesMaxActivity").val("");
		$(".editSealedSourcesActivityDate").val("");
		$(".editSealedSourcesCategories").val("");
		$(".editSealedSourcesUse").val("");
		$(".editSealedSourceUpload").html("");
		
	}
	function sealedSourcesDetailDeleteData(sealedSourcesDetailValData) {
		sealedSourcesDetailDataDelete(sealedSourcesDetailValData);
		  var sealedSourcesCountCounter = $("#sealedSourcesDetailVal").val();
		  $("#sealedSourcesDetailVal").val(sealedSourcesCountCounter - 1);
		  var delRowElement = $(".sealed-sources-row" + sealedSourcesDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(sealedSourcesDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= sealedSourcesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".sealed-sources-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "sealed-sources-row" + prevCounter);
		    rowElement.find("td.sealedSourcesRadionuclide"+i).removeClass("sealedSourcesRadionuclide"+i).addClass("sealedSourcesRadionuclide"+prevCounter);
		    rowElement.find("td.sealedSourcesMaxActivity"+i).removeClass("sealedSourcesMaxActivity"+i).addClass("sealedSourcesMaxActivity"+prevCounter);
		    rowElement.find("td.sealedSourcesActivityDate"+i).removeClass("sealedSourcesActivityDate"+i).addClass("sealedSourcesActivityDate"+prevCounter);
		    rowElement.find("td.sealedSourcesCategories"+i).removeClass("sealedSourcesCategories"+i).addClass("sealedSourcesCategories"+prevCounter);
		    rowElement.find("td.sealedSourcesUse"+i).removeClass("sealedSourcesUse"+i).addClass("sealedSourcesUse"+prevCounter);
		    rowElement.find("td a.sealedSourceRadDevice"+i).removeClass("sealedSourceRadDevice"+i).addClass("sealedSourceRadDevice"+prevCounter);
		    rowElement.find("#sealedSourcesDetailDeleteDataTab").attr('onclick', 'sealedSourcesDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#sealedSourcesEditTab").attr('onclick', 'sealedSourcesEditTab(' +prevCounter+ ')');
		  }
	}
	/* Radiation Devices */
	function addRadiationDevicesDetail(){
		radiationDevicesDetailVal = $("#radiationDevicesDetailVal").val();
		radiationDevicesRadio = $("#radiationDevicesRadio").val();
		radiationDevicesMaxActivity = $("#radiationDevicesMaxActivity").val();
		radiationDevicesManufacturer = $("#radiationDevicesManufacturer").val();
		radiationDevicesName = $("#radiationDevicesName").val();
		radiationDevicesModelNo = $("#radiationDevicesModelNo").val();
		radiationDevicesNumber = $("#radiationDevicesNumber").val();
		radiationDevicesUse = $("#radiationDevicesUse").val();
		radDeviceCeritificateCopy=$("#radDeviceCeritificateCopy").parent().parent().parent().find(".attach-detailed-overview").html();
		
		 if(radiationDevicesRadio != "" || radiationDevicesMaxActivity !="" || radiationDevicesManufacturer !="" || radiationDevicesName !="" || radiationDevicesModelNo !="" || radiationDevicesNumber !="" || radiationDevicesUse !=""){
			$(".addRadiationDevicesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRadiationDevicesUrl}",
				data : {
					"<portlet:namespace/>radiationDevicesDetailVal" : radiationDevicesDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addRadiationDevicesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".radiationDevicesRadio" + radiationDevicesDetailVal).append(radiationDevicesRadio);
					$(".radiationDevicesMaxActivity" + radiationDevicesDetailVal).append(radiationDevicesMaxActivity);
					$(".radiationDevicesManufacturer" + radiationDevicesDetailVal).append(radiationDevicesManufacturer);
					$(".radiationDevicesName" + radiationDevicesDetailVal).append(radiationDevicesName);
					$(".radiationDevicesModelNo" + radiationDevicesDetailVal).append(radiationDevicesModelNo);
					$(".radiationDevicesNumber" + radiationDevicesDetailVal).append(radiationDevicesNumber);
					$(".radiationDevicesUse" + radiationDevicesDetailVal).append(radiationDevicesUse);
					$(".radDeviceCeritificateCopy" + radiationDevicesDetailVal).append(radDeviceCeritificateCopy);
					
					/* VALUE INCREAMENT */
					radiationDevicesDetail("",radiationDevicesDetailVal);
					radiationDevicesDetailVal++;
					$("#radiationDevicesDetailVal").val(radiationDevicesDetailVal);
					
					/* RESET FORM FIELDS */
					$("#radiationDevicesRadio").val("");
					$("#radiationDevicesMaxActivity").val("");
					$("#radiationDevicesManufacturer").val("");
					$("#radiationDevicesName").val("");
					$("#radiationDevicesModelNo").val("");
					$("#radiationDevicesNumber").val("");
					$("#radiationDevicesUse").val("");
					$("#radDeviceCeritificateCopy").parent().parent().parent().find(".attach-detailed-overview").html("");
				}
			});
		}else{
			$("#radiationDevicesRadio").focus();
		}
	}
	function radiationDevicesEditTab(radiationDevicesDetailVal){
		$(".editRadiationDevicesEditTabPopup").modal("show");
		$(".editRadiationDevicesRadio").attr("id" , "editRadiationDevicesRadio"+radiationDevicesDetailVal);
		$(".editRadiationDevicesMaxActivity").attr("id" , "editRadiationDevicesMaxActivity"+radiationDevicesDetailVal);
		$(".editRadiationDevicesManufacturer").attr("id" , "editRadiationDevicesManufacturer"+radiationDevicesDetailVal);
		$(".editRadiationDevicesName").attr("id" , "editRadiationDevicesName"+radiationDevicesDetailVal);
		$(".editRadiationDevicesModelNo").attr("id" , "editRadiationDevicesModelNo"+radiationDevicesDetailVal);
		$(".editRadiationDevicesNumber").attr("id" , "editRadiationDevicesNumber"+radiationDevicesDetailVal);
		$(".editRadiationDevicesUse").attr("id" , "editRadiationDevicesUse"+radiationDevicesDetailVal);
		$(".editRadDeviceUpload").attr("id" , "editRadDeviceUpload"+radiationDevicesDetailVal);
		
		radiationDevicesRadio = $(".radiationDevicesRadio"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesMaxActivity = $(".radiationDevicesMaxActivity"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesManufacturer = $(".radiationDevicesManufacturer"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesName = $(".radiationDevicesName"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesModelNo = $(".radiationDevicesModelNo"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesNumber = $(".radiationDevicesNumber"+radiationDevicesDetailVal+":first").text().trim();
		radiationDevicesUse = $(".radiationDevicesUse"+radiationDevicesDetailVal+":first").text().trim();
		radDeviceCeritificateCopy = $(".radDeviceCeritificateCopy"+radiationDevicesDetailVal+":first").text().trim();
		
		
		$("#editRadiationDevicesRadio"+radiationDevicesDetailVal).val(radiationDevicesRadio);
		$("#editRadiationDevicesMaxActivity"+radiationDevicesDetailVal).val(radiationDevicesMaxActivity);
		$("#editRadiationDevicesManufacturer"+radiationDevicesDetailVal).val(radiationDevicesManufacturer);
		$("#editRadiationDevicesName"+radiationDevicesDetailVal).val(radiationDevicesName);
		$("#editRadiationDevicesModelNo"+radiationDevicesDetailVal).val(radiationDevicesModelNo);
		$("#editRadiationDevicesNumber"+radiationDevicesDetailVal).val(radiationDevicesNumber);
		$("#editRadiationDevicesUse"+radiationDevicesDetailVal).val(radiationDevicesUse);
		$("#editRadDeviceUpload"+radiationDevicesDetailVal).html(radDeviceCeritificateCopy);
		
		
		$(".saveEditRadiationDevicesPopupDataBtn").attr("onclick" , "radiationDevicesEditDataTab("+radiationDevicesDetailVal+")");
	}
	function radiationDevicesEditDataTab(radiationDevicesDetailVal){
		radiationDevicesDetail(radiationDevicesDetailVal);
		$(".radiationDevicesRadio" + radiationDevicesDetailVal).html($("#editRadiationDevicesRadio"+radiationDevicesDetailVal).val());
		$(".radiationDevicesMaxActivity" + radiationDevicesDetailVal).html($("#editRadiationDevicesMaxActivity"+radiationDevicesDetailVal).val());
		$(".radiationDevicesManufacturer" + radiationDevicesDetailVal).html($("#editRadiationDevicesManufacturer"+radiationDevicesDetailVal).val());
		$(".radiationDevicesName" + radiationDevicesDetailVal).html($("#editRadiationDevicesName"+radiationDevicesDetailVal).val());
		$(".radiationDevicesModelNo" + radiationDevicesDetailVal).html($("#editRadiationDevicesModelNo"+radiationDevicesDetailVal).val());
		$(".radiationDevicesNumber" + radiationDevicesDetailVal).html($("#editRadiationDevicesNumber"+radiationDevicesDetailVal).val());
		$(".radiationDevicesUse" + radiationDevicesDetailVal).html($("#editRadiationDevicesUse"+radiationDevicesDetailVal).val());
		$(".radDeviceCeritificateCopy" + radiationDevicesDetailVal).html($("#editRadDeviceUpload"+radiationDevicesDetailVal).html());
		
		
		$(".editRadiationDevicesRadio").val("");
		$(".editRadiationDevicesMaxActivity").val("");
		$(".editRadiationDevicesManufacturer").val("");
		$(".editRadiationDevicesName").val("");
		$(".editRadiationDevicesModelNo").val("");
		$(".editRadiationDevicesNumber").val("");
		$(".editRadiationDevicesUse").val("");
		$(".editRadDeviceUpload").html("");
		
	}
	function radiationDevicesDetailDeleteData(radiationDevicesDetailValData) {
		  radiationDevicesDetailDelete(radiationDevicesDetailValData);
		  var radiationDevicesCountCounter = $("#radiationDevicesDetailVal").val();
		  $("#radiationDevicesDetailVal").val(radiationDevicesCountCounter - 1);
		  var delRowElement = $(".radiation-devices-row" + radiationDevicesDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(radiationDevicesDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= radiationDevicesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".radiation-devices-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "radiation-devices-row" + prevCounter);
		    rowElement.find("td.radiationDevicesRadio"+i).removeClass("radiationDevicesRadio"+i).addClass("radiationDevicesRadio"+prevCounter);
		    rowElement.find("td.radiationDevicesMaxActivity"+i).removeClass("radiationDevicesMaxActivity"+i).addClass("radiationDevicesMaxActivity"+prevCounter);
		    rowElement.find("td.radiationDevicesManufacturer"+i).removeClass("radiationDevicesManufacturer"+i).addClass("radiationDevicesManufacturer"+prevCounter);
		    rowElement.find("td.radiationDevicesName"+i).removeClass("radiationDevicesName"+i).addClass("radiationDevicesName"+prevCounter);
		    rowElement.find("td.radiationDevicesModelNo"+i).removeClass("radiationDevicesModelNo"+i).addClass("radiationDevicesModelNo"+prevCounter);
		    rowElement.find("td.radiationDevicesNumber"+i).removeClass("radiationDevicesNumber"+i).addClass("radiationDevicesNumber"+prevCounter);
		    rowElement.find("td.radiationDevicesUse"+i).removeClass("radiationDevicesUse"+i).addClass("radiationDevicesUse"+prevCounter);
		    rowElement.find("td a.radDeviceCeritificateCopy"+i).removeClass("radDeviceCeritificateCopy"+i).addClass("radDeviceCeritificateCopy"+prevCounter);
		    rowElement.find("#radiationDevicesDetailDeleteDataTab").attr('onclick', 'radiationDevicesDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#radiationDevicesEditTab").attr('onclick', 'radiationDevicesEditTab(' +prevCounter+ ')');
		  }
	}
	/* Medical Practitioner */
	function addMedicalPractitionerDetail(){
		medicalPractitionerDetailVal = $("#medicalPractitionerDetailVal").val();
		medicalPractitionerName = $("#medicalPractitionerName").val();
		medicalPractitionerAddress = $("#medicalPractitionerAddress").val();
		medicalPractitionerTelephone = $("#medicalPractitionerTelephone").val();
		medicalPractitionerFax = $("#medicalPractitionerFax").val();
		medicalPractitionerEmail = $("#medicalPractitionerEmail").val();
		medicalPractitionerLicenceNo = $("#medicalPractitionerLicenceNo").val();
		 if(medicalPractitionerName != "" || medicalPractitionerAddress !="" || medicalPractitionerTelephone !="" || medicalPractitionerFax !="" || medicalPractitionerEmail !="" || medicalPractitionerLicenceNo !=""){
			$(".addMedicalPractitionerDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMedicalPractitionerUrl}",
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
					$(".medicalPractitionerAddress" + medicalPractitionerDetailVal).append(medicalPractitionerAddress);
					$(".medicalPractitionerTelephone" + medicalPractitionerDetailVal).append(medicalPractitionerTelephone);
					$(".medicalPractitionerFax" + medicalPractitionerDetailVal).append(medicalPractitionerFax);
					$(".medicalPractitionerEmail" + medicalPractitionerDetailVal).append(medicalPractitionerEmail);
					$(".medicalPractitionerLicenceNo" + medicalPractitionerDetailVal).append(medicalPractitionerLicenceNo);
					/* VALUE INCREAMENT */
					medicalPractitionerDetailData("");
					medicalPractitionerDetailVal++;
					$("#medicalPractitionerDetailVal").val(medicalPractitionerDetailVal);
					
					/* RESET FORM FIELDS */
					$("#medicalPractitionerName").val("");
					$("#medicalPractitionerAddress").val("");
					$("#medicalPractitionerTelephone").val("");
					$("#medicalPractitionerFax").val("");
					$("#medicalPractitionerEmail").val("");
					$("#medicalPractitionerLicenceNo").val("");
				}
			});
		}else{
			$("#medicalPractitionerName").focus();
		}
	}
	function medicalPractitionerEditTab(medicalPractitionerDetailVal){
		$(".editMedicalPractitionerEditTabPopup").modal("show");
		$(".editMedicalPractitionerName").attr("id" , "editMedicalPractitionerName"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerAddress").attr("id" , "editMedicalPractitionerAddress"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerTelephone").attr("id" , "editMedicalPractitionerTelephone"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerFax").attr("id" , "editMedicalPractitionerFax"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerEmail").attr("id" , "editMedicalPractitionerEmail"+medicalPractitionerDetailVal);
		$(".editMedicalPractitionerLicenceNo").attr("id" , "editMedicalPractitionerLicenceNo"+medicalPractitionerDetailVal);
		
		medicalPractitionerName = $(".medicalPractitionerName"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerAddress = $(".medicalPractitionerAddress"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerTelephone = $(".medicalPractitionerTelephone"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerFax = $(".medicalPractitionerFax"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerEmail = $(".medicalPractitionerEmail"+medicalPractitionerDetailVal+":first").text().trim();
		medicalPractitionerLicenceNo = $(".medicalPractitionerLicenceNo"+medicalPractitionerDetailVal+":first").text().trim();
		
		
		$("#editMedicalPractitionerName"+medicalPractitionerDetailVal).val(medicalPractitionerName);
		$("#editMedicalPractitionerAddress"+medicalPractitionerDetailVal).val(medicalPractitionerAddress);
		$("#editMedicalPractitionerTelephone"+medicalPractitionerDetailVal).val(medicalPractitionerTelephone);
		$("#editMedicalPractitionerFax"+medicalPractitionerDetailVal).val(medicalPractitionerFax);
		$("#editMedicalPractitionerEmail"+medicalPractitionerDetailVal).val(medicalPractitionerEmail);
		$("#editMedicalPractitionerLicenceNo"+medicalPractitionerDetailVal).val(medicalPractitionerLicenceNo);
		
		
		$(".saveEditMedicalPractitionerPopupDataBtn").attr("onclick" , "medicalPractitionerEditDataTab("+medicalPractitionerDetailVal+")");
	}
	function medicalPractitionerEditDataTab(medicalPractitionerDetailVal){
		medicalPractitionerDetailData(medicalPractitionerDetailVal);
		$(".medicalPractitionerName" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerName"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerAddress" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerAddress"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerTelephone" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerTelephone"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerFax" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerFax"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerEmail" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerEmail"+medicalPractitionerDetailVal).val());
		$(".medicalPractitionerLicenceNo" + medicalPractitionerDetailVal).html($("#editMedicalPractitionerLicenceNo"+medicalPractitionerDetailVal).val());
		
		
		$(".editMedicalPractitionerName").val("");
		$(".editMedicalPractitionerAddress").val("");
		$(".editMedicalPractitionerTelephone").val("");
		$(".editMedicalPractitionerFax").val("");
		$(".editMedicalPractitionerEmail").val("");
		$(".editMedicalPractitionerLicenceNo").val("");
		
	}
	
	function medicalPractitionerDetailDeleteData(medicalPractitionerDetailValData) {
		  medicalPractitionerDetailDelete(medicalPractitionerDetailValData);
		  var medicalPractitionerCountCounter = $("#medicalPractitionerDetailVal").val();
		  $("#medicalPractitionerDetailVal").val(medicalPractitionerCountCounter - 1);
		  var delRowElement = $(".medical-practitioner-row" + medicalPractitionerDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(medicalPractitionerDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= medicalPractitionerCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".medical-practitioner-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "medical-practitioner-row" + prevCounter);
		    rowElement.find("td.medicalPractitionerName"+i).removeClass("medicalPractitionerName"+i).addClass("medicalPractitionerName"+prevCounter);
		    rowElement.find("td.medicalPractitionerAddress"+i).removeClass("medicalPractitionerAddress"+i).addClass("medicalPractitionerAddress"+prevCounter);
		    rowElement.find("td.medicalPractitionerTelephone"+i).removeClass("medicalPractitionerTelephone"+i).addClass("medicalPractitionerTelephone"+prevCounter);
		    rowElement.find("td.medicalPractitionerFax"+i).removeClass("medicalPractitionerFax"+i).addClass("medicalPractitionerFax"+prevCounter);
		    rowElement.find("td.medicalPractitionerEmail"+i).removeClass("medicalPractitionerEmail"+i).addClass("medicalPractitionerEmail"+prevCounter);
		    rowElement.find("td.medicalPractitionerLicenceNo"+i).removeClass("medicalPractitionerLicenceNo"+i).addClass("medicalPractitionerLicenceNo"+prevCounter);
		    rowElement.find("#medicalPractitionerDetailDeleteDataTab").attr('onclick', 'medicalPractitionerDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#medicalPractitionerEditTab").attr('onclick', 'medicalPractitionerEditTab(' +prevCounter+ ')');
		  }
	}
	
	/* Details of Source */
	function addSourcesDetail(){
		sourcesDetailVal = $("#sourcesDetailVal").val();
		sourceIdentification = $("#sourceIdentification").val();
		stateActivity = $("#stateActivity").val();
		 if(sourceIdentification != "" || stateActivity !=""){
			$(".addSourcesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addSourcesDetailUrl}",
				data : {
					"<portlet:namespace/>sourcesDetailVal" : sourcesDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addSourcesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".sourceIdentification" + sourcesDetailVal).append(sourceIdentification);
					$(".stateActivity" + sourcesDetailVal).append(stateActivity);
					/* VALUE INCREAMENT */
					sourcesDetailData("");
					sourcesDetailVal++;
					$("#sourcesDetailVal").val(sourcesDetailVal);
					
					/* RESET FORM FIELDS */
					$("#sourceIdentification").val("");
					$("#stateActivity").val("");
				}
			});
		}else{
			$("#sourceIdentification").focus();
		}
	}
	function sourcesDetailEditTab(sourcesDetailVal){
		$(".editSourcesDetailEditTabPopup").modal("show");
		$(".editSourceIdentification").attr("id" , "editSourceIdentification"+sourcesDetailVal);
		$(".editStateActivity").attr("id" , "editStateActivity"+sourcesDetailVal);
		
		sourceIdentification = $(".sourceIdentification"+sourcesDetailVal+":first").text().trim();
		stateActivity = $(".stateActivity"+sourcesDetailVal+":first").text().trim();
		
		
		$("#editSourceIdentification"+sourcesDetailVal).val(sourceIdentification);
		$("#editStateActivity"+sourcesDetailVal).val(stateActivity);
		
		
		$(".saveEditSourcesDetailPopupDataBtn").attr("onclick" , "sourcesDetailEditDataTab("+sourcesDetailVal+")");
	}
	function sourcesDetailEditDataTab(sourcesDetailVal){
		sourcesDetailData(sourcesDetailVal);
		$(".sourceIdentification" + sourcesDetailVal).html($("#editSourceIdentification"+sourcesDetailVal).val());
		$(".stateActivity" + sourcesDetailVal).html($("#editStateActivity"+sourcesDetailVal).val());
		
		
		$(".editSourceIdentification").val("");
		$(".editStateActivity").val("");
		
	}
	
	function sourcesDetailDeleteData(sourcesDetailValData) {
		  sourcesDetailDataDelete(sourcesDetailValData);
		  var sourcesDetailCountCounter = $("#sourcesDetailVal").val();
		  $("#sourcesDetailVal").val(sourcesDetailCountCounter - 1);
		  var delRowElement = $(".sources-detail-row" + sourcesDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(sourcesDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= sourcesDetailCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".sources-detail-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "sources-detail-row" + prevCounter);
		    rowElement.find("td.sourceIdentification"+i).removeClass("sourceIdentification"+i).addClass("sourceIdentification"+prevCounter);
		    rowElement.find("td.stateActivity"+i).removeClass("stateActivity"+i).addClass("stateActivity"+prevCounter);
		    rowElement.find("#sourcesDetailDeleteDataTab").attr('onclick', 'sourcesDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#sourcesDetailEditTab").attr('onclick', 'sourcesDetailEditTab(' +prevCounter+ ')');
		  }
	}
	/* Radionuclide Details */
	function addRadionuclideDetail(){
		radionuclideDetailVal = $("#radionuclideDetailVal").val();
		radionuclideDetails = $("#radionuclideDetails").val();
		activityDetails = $("#activityDetails").val();
		activityDate = $("#activityDate").val();
		chemicalDetailsForm = $("#chemicalDetailsForm").val();
		serialNo = $("#serialNo").val();
		radionuclideLocation = $("#radionuclideLocation").val();
		 if(radionuclideDetails != "" || activityDetails !="" || activityDate !="" || chemicalDetailsForm !="" || serialNo !="" || radionuclideLocation !=""){
			$(".addRadionuclideDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRadionuclideDetailUrl}",
				data : {
					"<portlet:namespace/>radionuclideDetailVal" : radionuclideDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addRadionuclideDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".radionuclideDetails" + radionuclideDetailVal).append(radionuclideDetails);
					$(".activityDetails" + radionuclideDetailVal).append(activityDetails);
					$(".activityDate" + radionuclideDetailVal).append(activityDate);
					$(".chemicalDetailsForm" + radionuclideDetailVal).append(chemicalDetailsForm);
					$(".serialNo" + radionuclideDetailVal).append(serialNo);
					$(".radionuclideLocation" + radionuclideDetailVal).append(radionuclideLocation);
					/* VALUE INCREAMENT */
					radionuclideDetailData("");
					radionuclideDetailVal++;
					$("#radionuclideDetailVal").val(radionuclideDetailVal);
					
					/* RESET FORM FIELDS */
					$("#radionuclideDetails").val("");
					$("#activityDetails").val("");
					$("#activityDate").val("");
					$("#chemicalDetailsForm").val("");
					$("#serialNo").val("");
					$("#radionuclideLocation").val("");
				}
			});
		}else{
			$("#radionuclideDetails").focus();
		}
	}
	function radionuclideDetailEditTab(radionuclideDetailVal){
		$(".editRadionuclideDetailEditTabPopup").modal("show");
		$(".editRadionuclideDetails").attr("id" , "editRadionuclideDetails"+radionuclideDetailVal);
		$(".editActivityDetails").attr("id" , "editActivityDetails"+radionuclideDetailVal);
		$(".editActivityDate").attr("id" , "editActivityDate"+radionuclideDetailVal);
		$(".editChemicalDetailsForm").attr("id" , "editChemicalDetailsForm"+radionuclideDetailVal);
		$(".editSerialNo").attr("id" , "editSerialNo"+radionuclideDetailVal);
		$(".editRadionuclideLocation").attr("id" , "editRadionuclideLocation"+radionuclideDetailVal);
		
		radionuclideDetails = $(".radionuclideDetails"+radionuclideDetailVal+":first").text().trim();
		activityDetails = $(".activityDetails"+radionuclideDetailVal+":first").text().trim();
		activityDate = $(".activityDate"+radionuclideDetailVal+":first").text().trim();
		chemicalDetailsForm = $(".chemicalDetailsForm"+radionuclideDetailVal+":first").text().trim();
		serialNo = $(".serialNo"+radionuclideDetailVal+":first").text().trim();
		radionuclideLocation = $(".radionuclideLocation"+radionuclideDetailVal+":first").text().trim();
		
		
		$("#editRadionuclideDetails"+radionuclideDetailVal).val(radionuclideDetails);
		$("#editActivityDetails"+radionuclideDetailVal).val(activityDetails);
		$("#editActivityDate"+radionuclideDetailVal).val(activityDate);
		$("#editChemicalDetailsForm"+radionuclideDetailVal).val(chemicalDetailsForm);
		$("#editSerialNo"+radionuclideDetailVal).val(serialNo);
		$("#editRadionuclideLocation"+radionuclideDetailVal).val(radionuclideLocation);
		
		
		$(".saveEditRadionuclideDetailPopupDataBtn").attr("onclick" , "radionuclideDetailEditDataTab("+radionuclideDetailVal+")");
	}
	function radionuclideDetailEditDataTab(radionuclideDetailVal){
		radionuclideDetailData(radionuclideDetailVal);
		$(".radionuclideDetails" + radionuclideDetailVal).html($("#editRadionuclideDetails"+radionuclideDetailVal).val());
		$(".activityDetails" + radionuclideDetailVal).html($("#editActivityDetails"+radionuclideDetailVal).val());
		$(".activityDate" + radionuclideDetailVal).html($("#editActivityDate"+radionuclideDetailVal).val());
		$(".chemicalDetailsForm" + radionuclideDetailVal).html($("#editChemicalDetailsForm"+radionuclideDetailVal).val());
		$(".serialNo" + radionuclideDetailVal).html($("#editSerialNo"+radionuclideDetailVal).val());
		$(".radionuclideLocation" + radionuclideDetailVal).html($("#editRadionuclideLocation"+radionuclideDetailVal).val());
		
		
		$(".editRadionuclideDetails").val("");
		$(".editActivityDetails").val("");
		$(".editActivityDate").val("");
		$(".editChemicalDetailsForm").val("");
		$(".editSerialNo").val("");
		$(".editRadionuclideLocation").val("");
		
	}
	
	function radionuclideDetailDeleteData(radionuclideDetailValData) {
		radionuclideDetailDelete(radionuclideDetailValData);
		  var radionuclideDetailCountCounter = $("#radionuclideDetailVal").val();
		  $("#radionuclideDetailVal").val(radionuclideDetailCountCounter - 1);
		  var delRowElement = $(".radionuclide-detail-row" + radionuclideDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(radionuclideDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= radionuclideDetailCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".radionuclide-detail-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "radionuclide-detail-row" + prevCounter);
		    rowElement.find("td.radionuclideDetails"+i).removeClass("radionuclideDetails"+i).addClass("radionuclideDetails"+prevCounter);
		    rowElement.find("td.activityDetails"+i).removeClass("activityDetails"+i).addClass("activityDetails"+prevCounter);
		    rowElement.find("td.activityDate"+i).removeClass("activityDate"+i).addClass("activityDate"+prevCounter);
		    rowElement.find("td.chemicalDetailsForm"+i).removeClass("chemicalDetailsForm"+i).addClass("chemicalDetailsForm"+prevCounter);
		    rowElement.find("td.serialNo"+i).removeClass("serialNo"+i).addClass("serialNo"+prevCounter);
		    rowElement.find("td.radionuclideLocation"+i).removeClass("radionuclideLocation"+i).addClass("radionuclideLocation"+prevCounter);
		    rowElement.find("#radionuclideDetailDeleteDataTab").attr('onclick', 'radionuclideDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#radionuclideDetailEditTab").attr('onclick', 'radionuclideDetailEditTab(' +prevCounter+ ')');
		  }
	} 
	/* Radiation Generating Equipment */
	function addGenEquipmentDetail(){
		genEquipmentDetailVal = $("#genEquipmentDetailVal").val();
		manufacturerEquipment = $("#manufacturerEquipment").val();
		equipmentModel = $("#equipmentModel").val();
		equipmentSerial = $("#equipmentSerial").val();
		operatingPotential = $("#operatingPotential").val();
		natureEquipment = $("#natureEquipment").val();
		radiationGeneratingLoc = $("#radiationGeneratingLoc").val();
		equipmentModels = $("#equipmentModels").val();
		equipmentStatusDetail = $("#equipmentStatusDetail").val();
		equipmentDate = $("#equipmentDate").val();
		legalPersonSignature = $("#legalPersonSignature img").attr("src");
		
		 if(manufacturerEquipment != "" || equipmentModel !="" || equipmentSerial !="" || operatingPotential !="" || natureEquipment !="" || 
				 radiationGeneratingLoc !="" || equipmentModels !="" || equipmentDate !=""){
			$(".addGenEquipmentDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addGenEquipmentDetailUrl}",
				data : {
					"<portlet:namespace/>genEquipmentDetailVal" : genEquipmentDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addGenEquipmentDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".manufacturerEquipment" + genEquipmentDetailVal).append(manufacturerEquipment);
					$(".equipmentModel" + genEquipmentDetailVal).append(equipmentModel);
					$(".equipmentSerial" + genEquipmentDetailVal).append(equipmentSerial);
					$(".operatingPotential" + genEquipmentDetailVal).append(operatingPotential);
					$(".natureEquipment" + genEquipmentDetailVal).append(natureEquipment);
					$(".radiationGeneratingLoc" + genEquipmentDetailVal).append(radiationGeneratingLoc);
					$(".equipmentModels" + genEquipmentDetailVal).append(equipmentModels);
					$(".equipmentStatusDetail" + genEquipmentDetailVal).append(equipmentStatusDetail);
					$(".equipmentDate" + genEquipmentDetailVal).append(equipmentDate);
					$("<img />", {
	                    "src": legalPersonSignature,
	                    "class": "h-100",
	                    "height":"100",
	                    "width":"100"
	                  }).appendTo(".legalPersonSignature" + genEquipmentDetailVal);
					 /* addContractCarriageListDriverInfo(""); */  
					/* VALUE INCREAMENT */
					genEquipmentData("",genEquipmentDetailVal);
					genEquipmentDetailVal++;
					$("#genEquipmentDetailVal").val(genEquipmentDetailVal);
					
					/* RESET FORM FIELDS */
					$("#manufacturerEquipment").val("");
					$("#equipmentModel").val("");
					$("#equipmentSerial").val("");
					$("#operatingPotential").val("");
					$("#natureEquipment").val("");
					$("#radiationGeneratingLoc").val("");
					$("#equipmentModels").val("");
					$("#equipmentStatusDetail").val("");
					$("#equipmentDate").val("");
					$("#legalPersonSignature").html("");
				}
			});
		}else{
			$("#manufacturerEquipment").focus();
		}
	}
	function genEquipmentEditTab(genEquipmentDetailVal){
		$(".editGenEquipmentEditTabPopup").modal("show");
		$(".editManufacturerEquipment").attr("id" , "editManufacturerEquipment"+genEquipmentDetailVal);
		$(".editEquipmentModel").attr("id" , "editEquipmentModel"+genEquipmentDetailVal);
		$(".editEquipmentSerial").attr("id" , "editEquipmentSerial"+genEquipmentDetailVal);
		$(".editOperatingPotential").attr("id" , "editOperatingPotential"+genEquipmentDetailVal);
		$(".editNatureEquipment").attr("id" , "editNatureEquipment"+genEquipmentDetailVal);
		$(".editRadiationGeneratingLoc").attr("id" , "editRadiationGeneratingLoc"+genEquipmentDetailVal);
		$(".editEquipmentModels").attr("id" , "editEquipmentModels"+genEquipmentDetailVal);
		$(".editEquipmentStatusDetail").attr("id" , "editEquipmentStatusDetail"+genEquipmentDetailVal);
		$(".equipmentDate").attr("id" , "equipmentDate"+genEquipmentDetailVal);
		$(".editLegalPersonSignature").attr("id" , "editLegalPersonSignature"+genEquipmentDetailVal);
		
		manufacturerEquipment = $(".manufacturerEquipment"+genEquipmentDetailVal+":first").text().trim();
		equipmentModel = $(".equipmentModel"+genEquipmentDetailVal+":first").text().trim();
		equipmentSerial = $(".equipmentSerial"+genEquipmentDetailVal+":first").text().trim();
		operatingPotential = $(".operatingPotential"+genEquipmentDetailVal+":first").text().trim();
		natureEquipment = $(".natureEquipment"+genEquipmentDetailVal+":first").text().trim();
		radiationGeneratingLoc = $(".radiationGeneratingLoc"+genEquipmentDetailVal+":first").text().trim();
		equipmentModels = $(".equipmentModels"+genEquipmentDetailVal+":first").text().trim();
		equipmentStatusDetail = $(".equipmentStatusDetail"+genEquipmentDetailVal+":first").text().trim();
		equipmentDate = $(".equipmentDate"+genEquipmentDetailVal+":first").text().trim();
		legalPersonSignature = $(".legalPersonSignature"+genEquipmentDetailVal+":first img").attr("src");
		
		$("#editManufacturerEquipment"+genEquipmentDetailVal).val(manufacturerEquipment);
		$("#editEquipmentModel"+genEquipmentDetailVal).val(equipmentModel);
		$("#editEquipmentSerial"+genEquipmentDetailVal).val(equipmentSerial);
		$("#editOperatingPotential"+genEquipmentDetailVal).val(operatingPotential);
		$("#editNatureEquipment"+genEquipmentDetailVal).val(natureEquipment);
		$("#editRadiationGeneratingLoc"+genEquipmentDetailVal).val(radiationGeneratingLoc);
		$("#editEquipmentModels"+genEquipmentDetailVal).val(equipmentModels);
		$("#editEquipmentStatusDetail"+genEquipmentDetailVal).val(equipmentStatusDetail);
		$("#editEquipmentDate"+genEquipmentDetailVal).val(equipmentDate);
		$("#editLegalPersonSignature"+genEquipmentDetailVal).html("");
		$("<img />", {
	        "src": legalPersonSignature,
	        "class": "h-100",
	        "height":"100",
	        "width":"100"
	      }).appendTo("#editLegalPersonSignature" + genEquipmentDetailVal);
		
		$(".saveEditGenEquipmentPopupDataBtn").attr("onclick" , "genEquipmentEditDataTab("+genEquipmentDetailVal+")");
	}
	function genEquipmentEditDataTab(genEquipmentDetailVal){
		genEquipmentData("",genEquipmentDetailVal);
		$(".manufacturerEquipment" + genEquipmentDetailVal).html($("#editManufacturerEquipment"+genEquipmentDetailVal).val());
		$(".equipmentModel" + genEquipmentDetailVal).html($("#editEquipmentModel"+genEquipmentDetailVal).val());
		$(".equipmentSerial" + genEquipmentDetailVal).html($("#editEquipmentSerial"+genEquipmentDetailVal).val());
		$(".operatingPotential" + genEquipmentDetailVal).html($("#editOperatingPotential"+genEquipmentDetailVal).val());
		$(".natureEquipment" + genEquipmentDetailVal).html($("#editNatureEquipment"+genEquipmentDetailVal).val());
		$(".radiationGeneratingLoc" + genEquipmentDetailVal).html($("#editRadiationGeneratingLoc"+genEquipmentDetailVal).val());
		$(".equipmentModels" + genEquipmentDetailVal).html($("#editEquipmentModels"+genEquipmentDetailVal).val());
		$(".equipmentStatusDetail" + genEquipmentDetailVal).html($("#editEquipmentStatusDetail"+genEquipmentDetailVal).val());
		$(".equipmentDate" + genEquipmentDetailVal).html($("#equipmentDate"+genEquipmentDetailVal).val());
		$(".legalPersonSignature"+genEquipmentDetailVal).html("");
		editLegalPersonSignature = $("#editLegalPersonSignature"+genEquipmentDetailVal+":first img").attr("src");
		$("<img />", {
	        "src": editLegalPersonSignature,
	        "class": "h-100 legalPersonSignature",
	        "height":"100",
	        "width":"100"
	      }).appendTo(".legalPersonSignature" + genEquipmentDetailVal);
		
		$(".editManufacturerEquipment").val("");
		$(".editEquipmentModel").val("");
		$(".editEquipmentSerial").val("");
		$(".editOperatingPotential").val("");
		$(".editNatureEquipment").val("");
		$(".editRadiationGeneratingLoc").val("");
		$(".editEquipmentModels").val("");
		$(".editEquipmentStatusDetail").val("");
		$(".editEquipmentDate").val("");
		$(".editLegalPersonSignature").val("");
	}
	
	function genEquipmentDetailDeleteData(genEquipmentDetailValData) {
		genEquipmentDetailDelete(genEquipmentDetailValData);
		  var genEquipmentCountCounter = $("#genEquipmentDetailVal").val();
		  $("#genEquipmentDetailVal").val(genEquipmentCountCounter - 1);
		  var delRowElement = $(".gen-equipment-row" + genEquipmentDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(genEquipmentDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= genEquipmentCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".gen-equipment-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "gen-equipment-row" + prevCounter);
		    rowElement.find("td.manufacturerEquipment"+i).removeClass("manufacturerEquipment"+i).addClass("manufacturerEquipment"+prevCounter);
		    rowElement.find("td.equipmentModel"+i).removeClass("equipmentModel"+i).addClass("equipmentModel"+prevCounter);
		    rowElement.find("td.equipmentSerial"+i).removeClass("equipmentSerial"+i).addClass("equipmentSerial"+prevCounter);
		    rowElement.find("td.operatingPotential"+i).removeClass("operatingPotential"+i).addClass("operatingPotential"+prevCounter);
		    rowElement.find("td.natureEquipment"+i).removeClass("natureEquipment"+i).addClass("natureEquipment"+prevCounter);
		    rowElement.find("td.radiationGeneratingLoc"+i).removeClass("radiationGeneratingLoc"+i).addClass("radiationGeneratingLoc"+prevCounter);
		    rowElement.find("td.equipmentModels"+i).removeClass("equipmentModels"+i).addClass("equipmentModels"+prevCounter);
		    rowElement.find("td.equipmentStatusDetail"+i).removeClass("equipmentStatusDetail"+i).addClass("equipmentStatusDetail"+prevCounter);
		    rowElement.find("td.equipmentDate"+i).removeClass("equipmentDate"+i).addClass("equipmentDate"+prevCounter);
		    rowElement.find("td.legalPersonSignature"+i).removeClass("legalPersonSignature"+i).addClass("legalPersonSignature"+prevCounter);
		    rowElement.find("#genEquipmentDetailDeleteDataTab").attr('onclick', 'genEquipmentDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#genEquipmentEditTab").attr('onclick', 'genEquipmentEditTab(' +prevCounter+ ')');
		  }
	}
	/* Alternate RSO Form */
	function addAlternateRsoDetail(){
		alternateRsoDetailVal = $("#alternateRsoDetailVal").val();
		alternateRsoName = $("#alternateRsoName").val();
		alternateRsoTitle = $("#alternateRsoTitle").val();
		alternateRsoTelephone = $("#alternateRsoTelephone").val();
		alternateRsoExt = $("#alternateRsoExt").val();
		alternateRsoFax = $("#alternateRsoFax").val();
		alternateRsoEmailAdd = $("#alternateRsoEmailAdd").val();
		 if(alternateRsoName != "" || alternateRsoTitle !="" || alternateRsoTelephone !="" || alternateRsoExt !="" || alternateRsoFax !="" || alternateRsoEmailAdd !=""){
			$(".addAlternateRsoDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAlternateRsoDetailUrl}",
				data : {
					"<portlet:namespace/>alternateRsoDetailVal" : alternateRsoDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addAlternateRsoDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".alternateRsoName" + alternateRsoDetailVal).append(alternateRsoName);
					$(".alternateRsoTitle" + alternateRsoDetailVal).append(alternateRsoTitle);
					$(".alternateRsoTelephone" + alternateRsoDetailVal).append(alternateRsoTelephone);
					$(".alternateRsoExt" + alternateRsoDetailVal).append(alternateRsoExt);
					$(".alternateRsoFax" + alternateRsoDetailVal).append(alternateRsoFax);
					$(".alternateRsoEmailAdd" + alternateRsoDetailVal).append(alternateRsoEmailAdd);
					/* VALUE INCREAMENT */
					alternateRsoData("");
					alternateRsoDetailVal++;
					$("#alternateRsoDetailVal").val(alternateRsoDetailVal);
					
					/* RESET FORM FIELDS */
					$("#alternateRsoName").val("");
					$("#alternateRsoTitle").val("");
					$("#alternateRsoTelephone").val("");
					$("#alternateRsoExt").val("");
					$("#alternateRsoFax").val("");
					$("#alternateRsoEmailAdd").val("");
				}
			});
		}else{
			$("#alternateRsoName").focus();
		}
	}
	function alternateRsoEditTab(alternateRsoDetailVal){
		$(".editAlternateRsoDetailEditTabPopup").modal("show");
		$(".editAlternateRsoName").attr("id" , "editAlternateRsoName"+alternateRsoDetailVal);
		$(".editAlternateRsoTitle").attr("id" , "editAlternateRsoTitle"+alternateRsoDetailVal);
		$(".editAlternateRsoTelephone").attr("id" , "editAlternateRsoTelephone"+alternateRsoDetailVal);
		$(".editAlternateRsoExt").attr("id" , "editAlternateRsoExt"+alternateRsoDetailVal);
		$(".editAlternateRsoFax").attr("id" , "editAlternateRsoFax"+alternateRsoDetailVal);
		$(".editAlternateRsoEmailAdd").attr("id" , "editAlternateRsoEmailAdd"+alternateRsoDetailVal);
		
		alternateRsoName = $(".alternateRsoName"+alternateRsoDetailVal+":first").text().trim();
		alternateRsoTitle = $(".alternateRsoTitle"+alternateRsoDetailVal+":first").text().trim();
		alternateRsoTelephone = $(".alternateRsoTelephone"+alternateRsoDetailVal+":first").text().trim();
		alternateRsoExt = $(".alternateRsoExt"+alternateRsoDetailVal+":first").text().trim();
		alternateRsoFax = $(".alternateRsoFax"+alternateRsoDetailVal+":first").text().trim();
		alternateRsoEmailAdd = $(".alternateRsoEmailAdd"+alternateRsoDetailVal+":first").text().trim();
		
		
		$("#editAlternateRsoName"+alternateRsoDetailVal).val(alternateRsoName);
		$("#editAlternateRsoTitle"+alternateRsoDetailVal).val(alternateRsoTitle);
		$("#editAlternateRsoTelephone"+alternateRsoDetailVal).val(alternateRsoTelephone);
		$("#editAlternateRsoExt"+alternateRsoDetailVal).val(alternateRsoExt);
		$("#editAlternateRsoFax"+alternateRsoDetailVal).val(alternateRsoFax);
		$("#editAlternateRsoEmailAdd"+alternateRsoDetailVal).val(alternateRsoEmailAdd);
		
		
		$(".saveEditAlternateRsoDetailPopupDataBtn").attr("onclick" , "alternateRsoDetailEditDataTab("+alternateRsoDetailVal+")");
	}
	function alternateRsoDetailEditDataTab(alternateRsoDetailVal){
		alternateRsoData(alternateRsoDetailVal);
		$(".alternateRsoName" + alternateRsoDetailVal).html($("#editAlternateRsoName"+alternateRsoDetailVal).val());
		$(".alternateRsoTitle" + alternateRsoDetailVal).html($("#editAlternateRsoTitle"+alternateRsoDetailVal).val());
		$(".alternateRsoTelephone" + alternateRsoDetailVal).html($("#editAlternateRsoTelephone"+alternateRsoDetailVal).val());
		$(".alternateRsoExt" + alternateRsoDetailVal).html($("#editAlternateRsoExt"+alternateRsoDetailVal).val());
		$(".alternateRsoFax" + alternateRsoDetailVal).html($("#editAlternateRsoFax"+alternateRsoDetailVal).val());
		$(".alternateRsoEmailAdd" + alternateRsoDetailVal).html($("#editAlternateRsoEmailAdd"+alternateRsoDetailVal).val());
		
		
		$(".editAlternateRsoName").val("");
		$(".editAlternateRsoTitle").val("");
		$(".editAlternateRsoTelephone").val("");
		$(".editAlternateRsoExt").val("");
		$(".editAlternateRsoFax").val("");
		$(".editAlternateRsoEmailAdd").val("");
		
	}

	function alternateRsoDetailDeleteData(alternateRsoDetailValData) {
		  alternateRsoDetailDelete(alternateRsoDetailValData);
		  var alternateRsoDetailCountCounter = $("#alternateRsoDetailVal").val();
		  $("#alternateRsoDetailVal").val(alternateRsoDetailCountCounter - 1);
		  var delRowElement = $(".alternate-rso-row" + alternateRsoDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(alternateRsoDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= alternateRsoDetailCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".alternate-rso-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "alternate-rso-row" + prevCounter);
			rowElement.find("td.alternateRsoName"+i).removeClass("alternateRsoName"+i).addClass("alternateRsoName"+prevCounter);
			rowElement.find("td.alternateRsoTitle"+i).removeClass("alternateRsoTitle"+i).addClass("alternateRsoTitle"+prevCounter);
			rowElement.find("td.alternateRsoTelephone"+i).removeClass("alternateRsoTelephone"+i).addClass("alternateRsoTelephone"+prevCounter);
			rowElement.find("td.alternateRsoExt"+i).removeClass("alternateRsoExt"+i).addClass("alternateRsoExt"+prevCounter);
			rowElement.find("td.alternateRsoFax"+i).removeClass("alternateRsoFax"+i).addClass("alternateRsoFax"+prevCounter);
			rowElement.find("td.alternateRsoEmailAdd"+i).removeClass("alternateRsoEmailAdd"+i).addClass("alternateRsoEmailAdd"+prevCounter);
			rowElement.find("#alternateRsoDetailDeleteDataTab").attr('onclick', 'alternateRsoDetailDeleteData(' +prevCounter+ ')');
			rowElement.find("#alternateRsoEditTab").attr('onclick', 'alternateRsoEditTab(' +prevCounter+ ')');
		  }
	}
	/* Alternate Qualified Expert Form */
	function addQualifedExpertDetail(){
		qualifedExpertDetailVal = $("#qualifedExpertDetailVal").val();
		qualifedName = $("#qualifedName").val();
		qualifedTitle = $("#qualifedTitle").val();
		qualifedTelephone = $("#qualifedTelephone").val();
		qualifedExt = $("#qualifedExt").val();
		qualifedFax = $("#qualifedFax").val();
		qualifedEmailAdd = $("#qualifedEmailAdd").val();
		qualifedRegistrationNo = $("#qualifedRegistrationNo").val();
		qualifedExpirationDate = $("#qualifedExpirationDate").val();
		 if(qualifedName != "" || qualifedTitle !="" || qualifedTelephone !="" || qualifedExt !="" || qualifedFax !="" || qualifedEmailAdd !="" || qualifedRegistrationNo !="" || qualifedExpirationDate !=""){
			$(".addQualifedExpertDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addQualifedExpertDetailUrl}",
				data : {
					"<portlet:namespace/>qualifedExpertDetailVal" : qualifedExpertDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addQualifedExpertDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".qualifedName" + qualifedExpertDetailVal).append(qualifedName);
					$(".qualifedTitle" + qualifedExpertDetailVal).append(qualifedTitle);
					$(".qualifedTelephone" + qualifedExpertDetailVal).append(qualifedTelephone);
					$(".qualifedExt" + qualifedExpertDetailVal).append(qualifedExt);
					$(".qualifedFax" + qualifedExpertDetailVal).append(qualifedFax);
					$(".qualifedEmailAdd" + qualifedExpertDetailVal).append(qualifedEmailAdd);
					$(".qualifedRegistrationNo" + qualifedExpertDetailVal).append(qualifedRegistrationNo);
					$(".qualifedExpirationDate" + qualifedExpertDetailVal).append(qualifedExpirationDate);
					/* VALUE INCREAMENT */
					qualifedExpertData("");
					qualifedExpertDetailVal++;
					$("#qualifedExpertDetailVal").val(qualifedExpertDetailVal);
					
					/* RESET FORM FIELDS */
					$("#qualifedName").val("");
					$("#qualifedTitle").val("");
					$("#qualifedTelephone").val("");
					$("#qualifedExt").val("");
					$("#qualifedFax").val("");
					$("#qualifedEmailAdd").val("");
					$("#qualifedRegistrationNo").val("");
					$("#qualifedExpirationDate").val("");
				}
			});
		}else{
			$("#qualifedName").focus();
		}
	}
	function qualifedExpertEditTab(qualifedExpertDetailVal){
		$(".editQualifedExpertDetailEditTabPopup").modal("show");
		$(".editQualifedName").attr("id" , "editQualifedName"+qualifedExpertDetailVal);
		$(".editQualifedTitle").attr("id" , "editQualifedTitle"+qualifedExpertDetailVal);
		$(".editQualifedTelephone").attr("id" , "editQualifedTelephone"+qualifedExpertDetailVal);
		$(".editQualifedExt").attr("id" , "editQualifedExt"+qualifedExpertDetailVal);
		$(".editQualifedFax").attr("id" , "editQualifedFax"+qualifedExpertDetailVal);
		$(".editQualifedEmailAdd").attr("id" , "editQualifedEmailAdd"+qualifedExpertDetailVal);
		$(".editQualifedRegistrationNo").attr("id" , "editQualifedRegistrationNo"+qualifedExpertDetailVal);
		$(".editQualifedExpirationDate").attr("id" , "editQualifedExpirationDate"+qualifedExpertDetailVal);
		
		qualifedName = $(".qualifedName"+qualifedExpertDetailVal+":first").text().trim();
		qualifedTitle = $(".qualifedTitle"+qualifedExpertDetailVal+":first").text().trim();
		qualifedTelephone = $(".qualifedTelephone"+qualifedExpertDetailVal+":first").text().trim();
		qualifedExt = $(".qualifedExt"+qualifedExpertDetailVal+":first").text().trim();
		qualifedFax = $(".qualifedFax"+qualifedExpertDetailVal+":first").text().trim();
		qualifedEmailAdd = $(".qualifedEmailAdd"+qualifedExpertDetailVal+":first").text().trim();
		qualifedRegistrationNo = $(".qualifedRegistrationNo"+qualifedExpertDetailVal+":first").text().trim();
		qualifedExpirationDate = $(".qualifedExpirationDate"+qualifedExpertDetailVal+":first").text().trim();
		
		
		$("#editQualifedName"+qualifedExpertDetailVal).val(qualifedName);
		$("#editQualifedTitle"+qualifedExpertDetailVal).val(qualifedTitle);
		$("#editQualifedTelephone"+qualifedExpertDetailVal).val(qualifedTelephone);
		$("#editQualifedExt"+qualifedExpertDetailVal).val(qualifedExt);
		$("#editQualifedFax"+qualifedExpertDetailVal).val(qualifedFax);
		$("#editQualifedEmailAdd"+qualifedExpertDetailVal).val(qualifedEmailAdd);
		$("#editQualifedRegistrationNo"+qualifedExpertDetailVal).val(qualifedRegistrationNo);
		$("#editQualifedExpirationDate"+qualifedExpertDetailVal).val(qualifedExpirationDate);
		
		
		$(".saveEditQualifedExpertDetailPopupDataBtn").attr("onclick" , "qualifedExpertDetailEditDataTab("+qualifedExpertDetailVal+")");
	}
	function qualifedExpertDetailEditDataTab(qualifedExpertDetailVal){
		qualifedExpertData(qualifedExpertDetailVal);
		$(".qualifedName" + qualifedExpertDetailVal).html($("#editQualifedName"+qualifedExpertDetailVal).val());
		$(".qualifedTitle" + qualifedExpertDetailVal).html($("#editQualifedTitle"+qualifedExpertDetailVal).val());
		$(".qualifedTelephone" + qualifedExpertDetailVal).html($("#editQualifedTelephone"+qualifedExpertDetailVal).val());
		$(".qualifedExt" + qualifedExpertDetailVal).html($("#editQualifedExt"+qualifedExpertDetailVal).val());
		$(".qualifedFax" + qualifedExpertDetailVal).html($("#editQualifedFax"+qualifedExpertDetailVal).val());
		$(".qualifedEmailAdd" + qualifedExpertDetailVal).html($("#editQualifedEmailAdd"+qualifedExpertDetailVal).val());
		$(".qualifedRegistrationNo" + qualifedExpertDetailVal).html($("#editQualifedRegistrationNo"+qualifedExpertDetailVal).val());
		$(".qualifedExpirationDate" + qualifedExpertDetailVal).html($("#editQualifedExpirationDate"+qualifedExpertDetailVal).val());
		
		
		$(".editQualifedName").val("");
		$(".editQualifedTitle").val("");
		$(".editQualifedTelephone").val("");
		$(".editQualifedExt").val("");
		$(".editQualifedFax").val("");
		$(".editQualifedEmailAdd").val("");
		$(".editQualifedRegistrationNo").val("");
		$(".editQualifedExpirationDate").val("");
		
	}

	function qualifedExpertDetailDeleteData(qualifedExpertDetailValData) {
		qualifedExpertDetailDelete(qualifedExpertDetailValData);
		  var qualifedExpertDetailCountCounter = $("#qualifedExpertDetailVal").val();
		  $("#qualifedExpertDetailVal").val(qualifedExpertDetailCountCounter - 1);
		  var delRowElement = $(".qualifed-expert-row" + qualifedExpertDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(qualifedExpertDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= qualifedExpertDetailCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".qualifed-expert-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "qualifed-expert-row" + prevCounter);
			rowElement.find("td.qualifedName"+i).removeClass("qualifedName"+i).addClass("qualifedName"+prevCounter);
			rowElement.find("td.qualifedTitle"+i).removeClass("qualifedTitle"+i).addClass("qualifedTitle"+prevCounter);
			rowElement.find("td.qualifedTelephone"+i).removeClass("qualifedTelephone"+i).addClass("qualifedTelephone"+prevCounter);
			rowElement.find("td.qualifedExt"+i).removeClass("qualifedExt"+i).addClass("qualifedExt"+prevCounter);
			rowElement.find("td.qualifedFax"+i).removeClass("qualifedFax"+i).addClass("qualifedFax"+prevCounter);
			rowElement.find("td.qualifedEmailAdd"+i).removeClass("qualifedEmailAdd"+i).addClass("qualifedEmailAdd"+prevCounter);
			rowElement.find("td.qualifedRegistrationNo"+i).removeClass("qualifedRegistrationNo"+i).addClass("qualifedRegistrationNo"+prevCounter);
			rowElement.find("td.qualifedExpirationDate"+i).removeClass("qualifedExpirationDate"+i).addClass("qualifedExpirationDate"+prevCounter);
			rowElement.find("#qualifedExpertDetailDeleteDataTab").attr('onclick', 'qualifedExpertDetailDeleteData(' +prevCounter+ ')');
			rowElement.find("#qualifedExpertEditTab").attr('onclick', 'qualifedExpertEditTab(' +prevCounter+ ')');
		  }
	}
	/* Alternate RSO One Form */
	function addAlternateRsoOneDetail(){
		alternateRsoOneDetailVal = $("#alternateRsoOneDetailVal").val();
		alternateRsoOneName = $("#alternateRsoOneName").val();
		alternateRsoOneTitle = $("#alternateRsoOneTitle").val();
		alternateRsoOneTelephone = $("#alternateRsoOneTelephone").val();
		alternateRsoOneExt = $("#alternateRsoOneExt").val();
		alternateRsoOneFax = $("#alternateRsoOneFax").val();
		alternateRsoOneEmailAdd = $("#alternateRsoOneEmailAdd").val();
		 if(alternateRsoOneName != "" || alternateRsoOneTitle !="" || alternateRsoOneTelephone !="" || alternateRsoOneExt !="" || alternateRsoOneFax !="" || alternateRsoOneEmailAdd !=""){
			$(".addAlternateRsoOneDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAlternateRsoOneDetailUrl}",
				data : {
					"<portlet:namespace/>alternateRsoOneDetailVal" : alternateRsoOneDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addAlternateRsoOneDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".alternateRsoOneName" + alternateRsoOneDetailVal).append(alternateRsoOneName);
					$(".alternateRsoOneTitle" + alternateRsoOneDetailVal).append(alternateRsoOneTitle);
					$(".alternateRsoOneTelephone" + alternateRsoOneDetailVal).append(alternateRsoOneTelephone);
					$(".alternateRsoOneExt" + alternateRsoOneDetailVal).append(alternateRsoOneExt);
					$(".alternateRsoOneFax" + alternateRsoOneDetailVal).append(alternateRsoOneFax);
					$(".alternateRsoOneEmailAdd" + alternateRsoOneDetailVal).append(alternateRsoOneEmailAdd);
					/* VALUE INCREAMENT */
					alternateRsoOneData("");
					alternateRsoOneDetailVal++;
					$("#alternateRsoOneDetailVal").val(alternateRsoOneDetailVal);
					
					/* RESET FORM FIELDS */
					$("#alternateRsoOneName").val("");
					$("#alternateRsoOneTitle").val("");
					$("#alternateRsoOneTelephone").val("");
					$("#alternateRsoOneExt").val("");
					$("#alternateRsoOneFax").val("");
					$("#alternateRsoOneEmailAdd").val("");
				}
			});
		}else{
			$("#alternateRsoOneName").focus();
		}
	}
	function alternateRsoOneEditTab(alternateRsoOneDetailVal){
		$(".editAlternateRsoOneDetailEditTabPopup").modal("show");
		$(".editAlternateRsoOneName").attr("id" , "editAlternateRsoOneName"+alternateRsoOneDetailVal);
		$(".editAlternateRsoOneTitle").attr("id" , "editAlternateRsoOneTitle"+alternateRsoOneDetailVal);
		$(".editAlternateRsoOneTelephone").attr("id" , "editAlternateRsoOneTelephone"+alternateRsoOneDetailVal);
		$(".editAlternateRsoOneExt").attr("id" , "editAlternateRsoOneExt"+alternateRsoOneDetailVal);
		$(".editAlternateRsoOneFax").attr("id" , "editAlternateRsoOneFax"+alternateRsoOneDetailVal);
		$(".editAlternateRsoOneEmailAdd").attr("id" , "editAlternateRsoOneEmailAdd"+alternateRsoOneDetailVal);
		
		alternateRsoOneName = $(".alternateRsoOneName"+alternateRsoOneDetailVal+":first").text().trim();
		alternateRsoOneTitle = $(".alternateRsoOneTitle"+alternateRsoOneDetailVal+":first").text().trim();
		alternateRsoOneTelephone = $(".alternateRsoOneTelephone"+alternateRsoOneDetailVal+":first").text().trim();
		alternateRsoOneExt = $(".alternateRsoOneExt"+alternateRsoOneDetailVal+":first").text().trim();
		alternateRsoOneFax = $(".alternateRsoOneFax"+alternateRsoOneDetailVal+":first").text().trim();
		alternateRsoOneEmailAdd = $(".alternateRsoOneEmailAdd"+alternateRsoOneDetailVal+":first").text().trim();
		
		
		$("#editAlternateRsoOneName"+alternateRsoOneDetailVal).val(alternateRsoOneName);
		$("#editAlternateRsoOneTitle"+alternateRsoOneDetailVal).val(alternateRsoOneTitle);
		$("#editAlternateRsoOneTelephone"+alternateRsoOneDetailVal).val(alternateRsoOneTelephone);
		$("#editAlternateRsoOneExt"+alternateRsoOneDetailVal).val(alternateRsoOneExt);
		$("#editAlternateRsoOneFax"+alternateRsoOneDetailVal).val(alternateRsoOneFax);
		$("#editAlternateRsoOneEmailAdd"+alternateRsoOneDetailVal).val(alternateRsoOneEmailAdd);
		
		
		$(".saveEditAlternateRsoOneDetailPopupDataBtn").attr("onclick" , "alternateRsoOneDetailEditDataTab("+alternateRsoOneDetailVal+")");
	}
	function alternateRsoOneDetailEditDataTab(alternateRsoOneDetailVal){
		alternateRsoOneData(alternateRsoOneDetailVal);
		$(".alternateRsoOneName" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneName"+alternateRsoOneDetailVal).val());
		$(".alternateRsoOneTitle" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneTitle"+alternateRsoOneDetailVal).val());
		$(".alternateRsoOneTelephone" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneTelephone"+alternateRsoOneDetailVal).val());
		$(".alternateRsoOneExt" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneExt"+alternateRsoOneDetailVal).val());
		$(".alternateRsoOneFax" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneFax"+alternateRsoOneDetailVal).val());
		$(".alternateRsoOneEmailAdd" + alternateRsoOneDetailVal).html($("#editAlternateRsoOneEmailAdd"+alternateRsoOneDetailVal).val());
		
		
		$(".editAlternateRsoOneName").val("");
		$(".editAlternateRsoOneTitle").val("");
		$(".editAlternateRsoOneTelephone").val("");
		$(".editAlternateRsoOneExt").val("");
		$(".editAlternateRsoOneFax").val("");
		$(".editAlternateRsoOneEmailAdd").val("");
		
	}

	function alternateRsoOneDetailDeleteData(alternateRsoOneDetailValData) {
		  var alternateRsoOneDetailCountCounter = $("#alternateRsoOneDetailVal").val();
		  $("#alternateRsoOneDetailVal").val(alternateRsoOneDetailCountCounter - 1);
		  var delRowElement = $(".alternate-rso-one-row" + alternateRsoOneDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(alternateRsoOneDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= alternateRsoOneDetailCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".alternate-rso-one-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "alternate-rso-one-row" + prevCounter);
			rowElement.find("td.alternateRsoOneName"+i).removeClass("alternateRsoOneName"+i).addClass("alternateRsoOneName"+prevCounter);
			rowElement.find("td.alternateRsoOneTitle"+i).removeClass("alternateRsoOneTitle"+i).addClass("alternateRsoOneTitle"+prevCounter);
			rowElement.find("td.alternateRsoOneTelephone"+i).removeClass("alternateRsoOneTelephone"+i).addClass("alternateRsoOneTelephone"+prevCounter);
			rowElement.find("td.alternateRsoOneExt"+i).removeClass("alternateRsoOneExt"+i).addClass("alternateRsoOneExt"+prevCounter);
			rowElement.find("td.alternateRsoOneFax"+i).removeClass("alternateRsoOneFax"+i).addClass("alternateRsoOneFax"+prevCounter);
			rowElement.find("td.alternateRsoOneEmailAdd"+i).removeClass("alternateRsoOneEmailAdd"+i).addClass("alternateRsoOneEmailAdd"+prevCounter);
			rowElement.find("#alternateRsoOneDetailDeleteDataTab").attr('onclick', 'alternateRsoOneDetailDeleteData(' +prevCounter+ ')');
			rowElement.find("#alternateRsoOneEditTab").attr('onclick', 'alternateRsoOneEditTab(' +prevCounter+ ')');
		  }
	}
	/* Alternate Qualified Expert One Form */
	function addQualifedExpertOneDetail(){
		qualifedExpertOneDetailVal = $("#qualifedExpertOneDetailVal").val();
		qualifedOneName = $("#qualifedOneName").val();
		qualifedOneTitle = $("#qualifedOneTitle").val();
		qualifedOneTelephone = $("#qualifedOneTelephone").val();
		qualifedOneExt = $("#qualifedOneExt").val();
		qualifedOneFax = $("#qualifedOneFax").val();
		qualifedOneEmailAdd = $("#qualifedOneEmailAdd").val();
		qualifedOneRegistrationNo = $("#qualifedOneRegistrationNo").val();
		qualifedOneExpirationDate = $("#qualifedOneExpirationDate").val();
		 if(qualifedOneName != "" || qualifedOneTitle !="" || qualifedOneTelephone !="" || qualifedOneExt !="" || qualifedOneFax !="" || qualifedOneEmailAdd !="" || qualifedOneRegistrationNo !="" || qualifedOneExpirationDate !=""){
			$(".addQualifedExpertOneDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addQualifedExpertOneDetailUrl}",
				data : {
					"<portlet:namespace/>qualifedExpertOneDetailVal" : qualifedExpertOneDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addQualifedExpertOneDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".qualifedOneName" + qualifedExpertOneDetailVal).append(qualifedOneName);
					$(".qualifedOneTitle" + qualifedExpertOneDetailVal).append(qualifedOneTitle);
					$(".qualifedOneTelephone" + qualifedExpertOneDetailVal).append(qualifedOneTelephone);
					$(".qualifedOneExt" + qualifedExpertOneDetailVal).append(qualifedOneExt);
					$(".qualifedOneFax" + qualifedExpertOneDetailVal).append(qualifedOneFax);
					$(".qualifedOneEmailAdd" + qualifedExpertOneDetailVal).append(qualifedOneEmailAdd);
					$(".qualifedOneRegistrationNo" + qualifedExpertOneDetailVal).append(qualifedOneRegistrationNo);
					$(".qualifedOneExpirationDate" + qualifedExpertOneDetailVal).append(qualifedOneExpirationDate);
					/* VALUE INCREAMENT */
					qualifedExpertOneDetail("");
					qualifedExpertOneDetailVal++;
					$("#qualifedExpertOneDetailVal").val(qualifedExpertOneDetailVal);
					
					/* RESET FORM FIELDS */
					$("#qualifedOneName").val("");
					$("#qualifedOneTitle").val("");
					$("#qualifedOneTelephone").val("");
					$("#qualifedOneExt").val("");
					$("#qualifedOneFax").val("");
					$("#qualifedOneEmailAdd").val("");
					$("#qualifedOneRegistrationNo").val("");
					$("#qualifedOneExpirationDate").val("");
				}
			});
		}else{
			$("#qualifedOneName").focus();
		}
	}
	function qualifedExpertOneEditTab(qualifedExpertOneDetailVal){
		$(".editQualifedExpertOneDetailEditTabPopup").modal("show");
		$(".editQualifedOneName").attr("id" , "editQualifedOneName"+qualifedExpertOneDetailVal);
		$(".editQualifedOneTitle").attr("id" , "editQualifedOneTitle"+qualifedExpertOneDetailVal);
		$(".editQualifedOneTelephone").attr("id" , "editQualifedOneTelephone"+qualifedExpertOneDetailVal);
		$(".editQualifedOneExt").attr("id" , "editQualifedOneExt"+qualifedExpertOneDetailVal);
		$(".editQualifedOneFax").attr("id" , "editQualifedOneFax"+qualifedExpertOneDetailVal);
		$(".editQualifedOneEmailAdd").attr("id" , "editQualifedOneEmailAdd"+qualifedExpertOneDetailVal);
		$(".editQualifedOneRegistrationNo").attr("id" , "editQualifedOneRegistrationNo"+qualifedExpertOneDetailVal);
		$(".editQualifedOneExpirationDate").attr("id" , "editQualifedOneExpirationDate"+qualifedExpertOneDetailVal);
		
		qualifedOneName = $(".qualifedOneName"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneTitle = $(".qualifedOneTitle"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneTelephone = $(".qualifedOneTelephone"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneExt = $(".qualifedOneExt"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneFax = $(".qualifedOneFax"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneEmailAdd = $(".qualifedOneEmailAdd"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneRegistrationNo = $(".qualifedOneRegistrationNo"+qualifedExpertOneDetailVal+":first").text().trim();
		qualifedOneExpirationDate = $(".qualifedOneExpirationDate"+qualifedExpertOneDetailVal+":first").text().trim();
		
		
		$("#editQualifedOneName"+qualifedExpertOneDetailVal).val(qualifedOneName);
		$("#editQualifedOneTitle"+qualifedExpertOneDetailVal).val(qualifedOneTitle);
		$("#editQualifedOneTelephone"+qualifedExpertOneDetailVal).val(qualifedOneTelephone);
		$("#editQualifedOneExt"+qualifedExpertOneDetailVal).val(qualifedOneExt);
		$("#editQualifedOneFax"+qualifedExpertOneDetailVal).val(qualifedOneFax);
		$("#editQualifedOneEmailAdd"+qualifedExpertOneDetailVal).val(qualifedOneEmailAdd);
		$("#editQualifedOneRegistrationNo"+qualifedExpertOneDetailVal).val(qualifedOneRegistrationNo);
		$("#editQualifedOneExpirationDate"+qualifedExpertOneDetailVal).val(qualifedOneExpirationDate);
		
		
		$(".saveEditQualifedExpertOneDetailPopupDataBtn").attr("onclick" , "qualifedExpertOneDetailEditDataTab("+qualifedExpertOneDetailVal+")");
	}
	function qualifedExpertOneDetailEditDataTab(qualifedExpertOneDetailVal){
		$(".qualifedOneName" + qualifedExpertOneDetailVal).html($("#editQualifedOneName"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneTitle" + qualifedExpertOneDetailVal).html($("#editQualifedOneTitle"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneTelephone" + qualifedExpertOneDetailVal).html($("#editQualifedOneTelephone"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneExt" + qualifedExpertOneDetailVal).html($("#editQualifedOneExt"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneFax" + qualifedExpertOneDetailVal).html($("#editQualifedOneFax"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneEmailAdd" + qualifedExpertOneDetailVal).html($("#editQualifedOneEmailAdd"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneRegistrationNo" + qualifedExpertOneDetailVal).html($("#editQualifedOneRegistrationNo"+qualifedExpertOneDetailVal).val());
		$(".qualifedOneExpirationDate" + qualifedExpertOneDetailVal).html($("#editQualifedOneExpirationDate"+qualifedExpertOneDetailVal).val());
		
		
		$(".editQualifedOneName").val("");
		$(".editQualifedOneTitle").val("");
		$(".editQualifedOneTelephone").val("");
		$(".editQualifedOneExt").val("");
		$(".editQualifedOneFax").val("");
		$(".editQualifedOneEmailAdd").val("");
		$(".editQualifedOneRegistrationNo").val("");
		$(".editQualifedOneExpirationDate").val("");
		
	}

	function qualifedExpertOneDetailDeleteData(qualifedExpertOneDetailValData) {
		  var qualifedExpertOneDetailCountCounter = $("#qualifedExpertOneDetailVal").val();
		  $("#qualifedExpertOneDetailVal").val(qualifedExpertOneDetailCountCounter - 1);
		  var delRowElement = $(".qualifed-expert-one-row" + qualifedExpertOneDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(qualifedExpertOneDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= qualifedExpertOneDetailCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".qualifed-expert-one-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "qualifed-expert-one-row" + prevCounter);
			rowElement.find("td.qualifedOneName"+i).removeClass("qualifedOneName"+i).addClass("qualifedOneName"+prevCounter);
			rowElement.find("td.qualifedOneTitle"+i).removeClass("qualifedOneTitle"+i).addClass("qualifedOneTitle"+prevCounter);
			rowElement.find("td.qualifedOneTelephone"+i).removeClass("qualifedOneTelephone"+i).addClass("qualifedOneTelephone"+prevCounter);
			rowElement.find("td.qualifedOneExt"+i).removeClass("qualifedOneExt"+i).addClass("qualifedOneExt"+prevCounter);
			rowElement.find("td.qualifedOneFax"+i).removeClass("qualifedOneFax"+i).addClass("qualifedOneFax"+prevCounter);
			rowElement.find("td.qualifedOneEmailAdd"+i).removeClass("qualifedOneEmailAdd"+i).addClass("qualifedOneEmailAdd"+prevCounter);
			rowElement.find("td.qualifedOneRegistrationNo"+i).removeClass("qualifedOneRegistrationNo"+i).addClass("qualifedOneRegistrationNo"+prevCounter);
			rowElement.find("td.qualifedOneExpirationDate"+i).removeClass("qualifedOneExpirationDate"+i).addClass("qualifedOneExpirationDate"+prevCounter);
			rowElement.find("#qualifedExpertOneDetailDeleteDataTab").attr('onclick', 'qualifedExpertOneDetailDeleteData(' +prevCounter+ ')');
			rowElement.find("#qualifedExpertOneEditTab").attr('onclick', 'qualifedExpertOneEditTab(' +prevCounter+ ')');
		  }
	}
	
	/*  Acknowledgement of Medical Practitioner */
	function addAcknowledgementMedicalDetail(){
		acknowledgementMedicalDetailVal = $("#acknowledgementMedicalDetailVal").val();
		acknowledgementMedicalSignature = $("#acknowledgementMedicalSignature img").attr("src");
		acknowledgementMedicalDate = $("#acknowledgementMedicalDate").val();
		 if(acknowledgementMedicalDate !=""){
			$(".addAcknowledgementMedicalDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAcknowledgementMedicalDetailUrl}",
				data : {
					"<portlet:namespace/>acknowledgementMedicalDetailVal" : acknowledgementMedicalDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addAcknowledgementMedicalDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$("<img />", {
	                    "src": acknowledgementMedicalSignature,
	                    "class": "h-100",
	                    "height":"100",
	                    "width":"100"
	                  }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
					  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).append(acknowledgementMedicalDate);
					  
					  addAcknowledgementMedicalDetailData("",acknowledgementMedicalDetailVal,"");

					/* VALUE INCREAMENT */
					acknowledgementMedicalDetailVal++;
					$("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalDetailVal);
					
					/* RESET FORM FIELDS */
					$("#acknowledgementMedicalSignature").html("");
					$("#acknowledgementMedicalDate").val("");
				}
			});
		}else{
			$("#acknowledgementMedicalSignature").focus();
		}
	}
	function acknowledgementMedicalEditTab(acknowledgementMedicalDetailVal){
		$(".editAcknowledgementMedicalEditTabPopup").modal("show");
		$(".editAcknowledgementMedicalSignature").attr("id" , "editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal);
		$(".editAcknowledgementMedicalDate").attr("id" , ".editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal);
		
		acknowledgementMedicalSignature = $(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
		acknowledgementMedicalDate = $(".acknowledgementMedicalDate"+acknowledgementMedicalDetailVal+":first").text().trim();
		
		$("#editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
		$("<img />", {
	        "src": acknowledgementMedicalSignature,
	        "class": "h-100",
	        "height":"100",
	        "width":"100"
	      }).appendTo("#editAcknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
		$("#editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val(acknowledgementMedicalDate);
		
		$(".saveEditAcknowledgementMedicalPopupDataBtn").attr("onclick" , "acknowledgementMedicalEditDataTab("+acknowledgementMedicalDetailVal+")");
	}
	function acknowledgementMedicalEditDataTab(acknowledgementMedicalDetailVal){
		$(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
		editAcknowledgementMedicalSignature = $("#editAcknowledgemtMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
		$("<img />", {
	        "src": editAcknowledgementMedicalSignature,
	        "class": "h-100 acknowledgementMedicalSignature",
	        "height":"100",
	        "width":"100"
	      }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
		  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).html($("#acknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val());

		$(".editAcknowledgementMedicalSignature").val("");
		$(".editAcknowledgementMedicalDate").val("");
	}
	
	function acknowledgementMedicalDetailDeleteData(acknowledgementMedicalDetailValData) {
		  var acknowledgementMedicalCountCounter = $("#acknowledgementMedicalDetailVal").val();
		  $("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalCountCounter - 1);
		  var delRowElement = $(".acknowledgement-medical-row" + acknowledgementMedicalDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(acknowledgementMedicalDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= acknowledgementMedicalCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".acknowledgement-medical-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "acknowledgement-medical-row" + prevCounter);
		    rowElement.find("td.acknowledgementMedicalSignature"+i).removeClass("acknowledgementMedicalSignature"+i).addClass("acknowledgementMedicalSignature"+prevCounter);
			rowElement.find("td.acknowledgementMedicalDate"+i).removeClass("acknowledgementMedicalDate"+i).addClass("acknowledgementMedicalDate"+prevCounter);
		    rowElement.find("#acknowledgementMedicalDetailDeleteDataTab").attr('onclick', 'acknowledgementMedicalDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#acknowledgementMedicalEditTab").attr('onclick', 'acknowledgementMedicalEditTab(' +prevCounter+ ')');
		  }
	}
	
	function applicantDetailSecTwoHsraApplication(isSaveAndContinue){
		hsraApplicationId=$("#hsraApplicationId").val();
		organizationName=$("#organizationName").val();
		nuclearMailingAddress=$("#nuclearMailingAddress").val();
		parish=$("#nuclearMailingParish").val();
		nuclearTrnNumber=$("#nuclearTrnNumber").val();
		nuclearTelephoneNo=$("#nuclearTelephoneNo").val();
		nuclearFaxNo=$("#nuclearFaxNo").val();
		organizationName=$("#organizationName").val();
		nuclearEmailAddress=$("#nuclearEmailAddress").val();
		submitForm= true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!isSaveAndContinue){
		if(!organizationEmailAdd){
			$("#nuclearEmailAddressValidation").removeClass("hide");
			$("#nuclearEmailAddressValidation").text("Please Enter Email Address");
			$("#nuclearEmailAddress").focus();
			submitForm= false;
		}else if(nuclearEmailAddress.match(mailformat)){ 
			$("#nuclearEmailAddressValidation").addClass("hide");
		}else{
			$("#nuclearEmailAddressValidation").removeClass("hide");
			$("#nuclearEmailAddressValidation").text("You have Entered an In-valid email address");
			$("#nuclearEmailAddress").focus();
			submitForm= false;
		}
		if(!organizationName){
			$("#organizationNameValidation").removeClass("hide");
			$("#organizationName").focus();
			submitForm= false;
		}else{
			$("#organizationNameValidation").addClass("hide");
		    }
		}
			if(submitForm){
		 $.ajax({
			    type: "POST",
			    url: "${hsraApplicantDetailSectionTwo}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>organizationName": organizationName,
			    	  "<portlet:namespace/>nuclearMailingAddress": nuclearMailingAddress,
			    	  "<portlet:namespace/>parish": parish,
			    	  "<portlet:namespace/>nuclearTrnNumber": nuclearTrnNumber,
			    	  "<portlet:namespace/>nuclearTelephoneNo": nuclearTelephoneNo,
			    	  "<portlet:namespace/>nuclearFaxNo": nuclearFaxNo,
			    	  "<portlet:namespace/>nuclearEmailAddress": nuclearEmailAddress,
			      		    },
			    success: function (data) { 
			    	if(!isSaveAndContinue){
					applicantInfo();
			      }
	 	    	},
				 error: function (data) {},
			  });
		}
	}
	  function detailOfBusinessSecThree(isSaveAndContinue){
		hsraApplicationId=$("#hsraApplicationId").val();
		businessType=$("#businessType").val();
		nuclearBusinessNumber=$("#nuclearBusinessNumber").val();
		nuclearCorporationNumber=$("#nuclearCorporationNumber").val();
		nuclearPublicAct=$("#nuclearPublicAct").val();
		nuclearName=$("#nuclearName").val();
		nuclearAddressThird=$("#nuclearAddressThird").val();
		nuclearThirdParish=$("#nuclearThirdParish").val();
		nuclearTelephoneNum=$("#nuclearTelephoneNum").val();
		nuclearfaxNumber=$("#nuclearfaxNumber").val();
		nuclearFinancialGuarantee=$("#nuclearFinancialGuarantee").val();
		nuclearName=$("#nuclearName").val();
		nuclearEmailAdd=$("#nuclearEmailAdd").val();
		submitForm= true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!isSaveAndContinue){
		if(!nuclearEmailAdd){
			$("#nuclearEmailAddValidation").removeClass("hide");
			$("#nuclearEmailAddValidation").text("Please Enter Email Address");
			$("#nuclearEmailAdd").focus();
			submitForm= false;
		}else if(nuclearEmailAdd.match(mailformat)){ 
			$("#nuclearEmailAddValidation").addClass("hide");
		}else{
			$("#nuclearEmailAddValidation").removeClass("hide");
			$("#nuclearEmailAddValidation").text("You have Entered an In-valid email address");
			$("#nuclearEmailAdd").focus();
			submitForm= false;
		}
		if(!nuclearName){
			$("#nuclearNameValidation").removeClass("hide");
			$("#nuclearName").focus();
			submitForm= false;
		}else{
			$("#nuclearNameValidation").addClass("hide");
		    }
		}
			if(submitForm){
		 $.ajax({
			    type: "POST",
			    url: "${DetailOfBusinessSecThreeUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>businessType": businessType,
			    	  "<portlet:namespace/>nuclearBusinessNumber": nuclearBusinessNumber,
			    	  "<portlet:namespace/>nuclearCorporationNumber": nuclearCorporationNumber,
			    	  "<portlet:namespace/>nuclearPublicAct": nuclearPublicAct,
			    	  "<portlet:namespace/>nuclearName": nuclearName,
			    	  "<portlet:namespace/>nuclearAddressThird": nuclearAddressThird,
			    	  "<portlet:namespace/>nuclearThirdParish": nuclearThirdParish,
			    	  "<portlet:namespace/>nuclearTelephoneNum": nuclearTelephoneNum,
			    	  "<portlet:namespace/>nuclearfaxNumber": nuclearfaxNumber,
			    	  "<portlet:namespace/>nuclearEmailAdd": nuclearEmailAdd,
			    	  "<portlet:namespace/>nuclearFinancialGuarantee": nuclearFinancialGuarantee,
			      		    },
			    success: function (data) { 
			    	if(!isSaveAndContinue){
			    	   applicantInfo();
			    	}	
				uploadDocuments('financialGuaranteeUpload',"Financial Guarantee",'<%=signatureUploadInHsraFormUrl%>',"", "Financial Guarantee");
				
				if(applicantTypeVal == "Users of Radiation Sources"){
				$("#hsraFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				}
				if(applicantTypeVal == "Service Providers"){
					$("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
	 	    	},
				 error: function (data) {},
			  });
			}
	}
	  function purposeOfPropLicenceSecFour(){
		hsraApplicationId=$("#hsraApplicationId").val();
		nuclearRegistrationLicence=$("#nuclearRegistrationLicence").val();
		nuclearBusinessPlace=$("#nuclearBusinessPlace").val();
		nuclearActivityMainAdd=$("#nuclearActivityMainAdd").val();
		applicationType=$("input[name='applicationTypeLoc']:checked").val();
		nuclearAdditionalLocation=$("#nuclearAdditionalLocation").val();
		 $.ajax({
			    type: "POST",
			    url: "${PurposeOfPropLicenceUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>nuclearRegistrationLicence": nuclearRegistrationLicence,
			    	  "<portlet:namespace/>nuclearBusinessPlace": nuclearBusinessPlace,
			    	  "<portlet:namespace/>nuclearActivityMainAdd": nuclearActivityMainAdd,
			    	  "<portlet:namespace/>applicationType": applicationType,
			    	  "<portlet:namespace/>nuclearAdditionalLocation": nuclearAdditionalLocation,
			      		    },
			    success: function (data) {
			    	addUnsealedSourcesDetail();
					addSealedSourcesDetail();
					addRadiationDevicesDetail();
					uploadDocuments('unsealedCertiCopy',"Unsealed Certificte Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Unsealed Certificte Copy");
					uploadDocuments('sealedSourceRadDevice',"Sealed Source Rad Device",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Sealed Source Rad Device");
					uploadDocuments('radDeviceCeritificateCopy',"Rad Device Certificate Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Rad Device Certificate Copy");
	 	    	},
				 error: function (data) {},
			  });
	}
	  function addSectionSeventhDetail(){
		hsraApplicationId=$("#hsraApplicationId").val();
		administrationTreatment=$("#administrationTreatment").val();
		qualityProgramme=$("#qualityProgramme").val();
		instructionsCaregivers=$("#instructionsCaregivers").val();
		instructionsPatients=$("#instructionsPatients").val();
		patientsRelease=$("#patientsRelease").val();
		treatmentRooms=$("#treatmentRooms").val();
		medicalEmergencies=$("#medicalEmergencies").val();
		nuclearMedicine=$("#nuclearMedicine").val();
		diagnosticStudies=$("#diagnosticStudies").val(); 
		biomedicalResearch=$("#biomedicalResearch").val();
		researchReview=$("#researchReview").val();
		emergencyOperating=$("#emergencyOperating").val();
		certificatePackages=$("#certificatePackages").val();
		exposureDevices=$("#exposureDevices").val();
		equipmentSafety=$("#equipmentSafety").val();
		transportPlan=$("#transportPlan").val();
		animalsTreatment=$("#animalsTreatment").val();
		animalHousing=$("#animalHousing").val();
		disposalWaste=$("#disposalWaste").val();
		monitoringAnimalHousing=$("#monitoringAnimalHousing").val();
		releaseAnimals=$("#releaseAnimals").val();
		proceduresApp=$("#proceduresApp").val();
		disposalsApp=$("#disposalsApp").val();
		monitoringMaterialNu=$("#monitoringMaterialNu").val();
		handlingProcedures=$("#handlingProcedures").val();
		hoppersEntry=$("#hoppersEntry").val();
		operatingConditions=$("#operatingConditions").val();
		insertionType=$("#insertionType").val();
		installationFixed=$("#installationFixed").val();
		transportPlanGauge=$("#transportPlanGauge").val();
		emergencyAddition=$("#EmergencyAddition").val();
		nuclearEnviroment=$("#nuclearEnviroment").val();
		fishingTool=$("#fishingTool").val();
		sealedSources=$("#sealedSources").val();
		abandonmentZone=$("#abandonmentZone").val();
		servicingCopy=$("#servicingCopy").val();
		manufacturingDevelopment=$("#manufacturingDevProcedure").val();
		 $.ajax({
			    type: "POST",
			    url: "${SpecificReqPropLicActivityUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	  "<portlet:namespace/>administrationTreatment": administrationTreatment,
			    	  "<portlet:namespace/>qualityProgramme": qualityProgramme,
			    	  "<portlet:namespace/>instructionsCaregivers": instructionsCaregivers,
			    	  "<portlet:namespace/>instructionsPatients": instructionsPatients,
			    	  "<portlet:namespace/>patientsRelease": patientsRelease,
			    	  "<portlet:namespace/>treatmentRooms": treatmentRooms,
			    	  "<portlet:namespace/>medicalEmergencies": medicalEmergencies,
			    	  "<portlet:namespace/>nuclearMedicine": nuclearMedicine,
			    	  "<portlet:namespace/>diagnosticStudies": diagnosticStudies,
			    	  "<portlet:namespace/>biomedicalResearch": biomedicalResearch,
			    	  "<portlet:namespace/>researchReview": researchReview,
			    	  "<portlet:namespace/>emergencyOperating": emergencyOperating,
			    	  "<portlet:namespace/>certificatePackages": certificatePackages,
			    	  "<portlet:namespace/>exposureDevices": exposureDevices,
			    	  "<portlet:namespace/>equipmentSafety": equipmentSafety,
			    	  "<portlet:namespace/>transportPlan": transportPlan,
			    	  "<portlet:namespace/>animalsTreatment": animalsTreatment,
			    	  "<portlet:namespace/>animalHousing": animalHousing,
			    	  "<portlet:namespace/>disposalWaste": disposalWaste,
			    	  "<portlet:namespace/>monitoringAnimalHousing": monitoringAnimalHousing,
			    	  "<portlet:namespace/>releaseAnimals": releaseAnimals,
			    	  "<portlet:namespace/>proceduresApp": proceduresApp,
			    	  "<portlet:namespace/>disposalsApp": disposalsApp,
			    	  "<portlet:namespace/>monitoringMaterialNu": monitoringMaterialNu,
			    	  "<portlet:namespace/>handlingProcedures": handlingProcedures,
			    	  "<portlet:namespace/>hoppersEntry": hoppersEntry,
			    	  "<portlet:namespace/>operatingConditions": operatingConditions,
			    	  "<portlet:namespace/>insertionType": insertionType,
			    	  "<portlet:namespace/>installationFixed": installationFixed,
			    	  "<portlet:namespace/>transportPlanGauge": transportPlanGauge,
			    	  "<portlet:namespace/>emergencyAddition": emergencyAddition,
			    	  "<portlet:namespace/>nuclearEnviroment": nuclearEnviroment,
			    	  "<portlet:namespace/>fishingTool": fishingTool,
			    	  "<portlet:namespace/>sealedSources": sealedSources,
			    	  "<portlet:namespace/>abandonmentZone": abandonmentZone,
			    	  "<portlet:namespace/>servicingCopy": servicingCopy,
			    	  "<portlet:namespace/>manufacturingDevelopment": manufacturingDevelopment,
			      		    },
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
			    	addMedicalPractitionerDetail();
					addAcknowledgementMedicalDetail();
					addApplicantSignatureDetail();
			    	uploadDocuments('administrationTreatmentUpload',"Administration of Radiation",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Administration of Radiation Doses for Therapeutic Treatment");
			    	uploadDocuments('qualityProgrammeUpload',"Quality Assurance Programme",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Quality Assurance Programme for Medical Exposure");
			    	uploadDocuments('instructionsCaregiversUpload',"Instructions to Caregiver",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Instructions to Caregivers");
			    	uploadDocuments('instructionsPatientsUpload',"Instructions to Patients",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Instructions to Patients and their Families");
			    	uploadDocuments('patientsReleaseUpload',"Release of Patients",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Release of Patients");
			    	uploadDocuments('treatmentRoomsUpload',"Release of Treatment Rooms",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Decontamination and Release of Treatment Rooms");
			    	uploadDocuments('medicalEmergenciesUpload',"Medical Emergencies",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Medical Emergencies");
			    	uploadDocuments('nuclearMedicineUpload',"Therapeutic Nuclear Medicine",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"For Therapeutic Nuclear Medicine: Assignment of Nuclear Medicine Therapy Rooms");
			    	uploadDocuments('diagnosticStudiesUpload',"Diagnostic Studies Protocols",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Diagnostic Studies Protocols and Procedures");
			    	uploadDocuments('biomedicalResearchUpload',"Biomedical Research",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"For Biomedical Research");
			    	uploadDocuments('researchReviewUpload',"Research Review Committee",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Research Review Committee");
			    	uploadDocuments('emergencyOperatingUpload',"Emergency and Operating",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Emergency and Operating Procedures");
			    	uploadDocuments('certificatePackagesUpload',"Application for Registration",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Application for Registration of Use of Packages");
			    	uploadDocuments('exposureDevicesUpload',"Use of Exposure Devices",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Maintenance and Use of Exposure Devices");
			    	uploadDocuments('equipmentSafetyUpload',"Safety Emergency Equipment",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Safety and Emergency Equipment");
			    	uploadDocuments('transportPlanOneUpload',"Transport Plan",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Transport Plan");
			    	uploadDocuments('animalsTreatmentUpload',"Treatment to Animals",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Administering Treatment to Animals");
			    	uploadDocuments('animalHousingUpload',"Animal Housing",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Animal Housing");
			    	uploadDocuments('disposalWasteUpload',"Disposal of Animal Waste",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Disposal of Animal Waste");
			    	uploadDocuments('monitoringAnimalHousingUpload',"Release of Animal Housing",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Monitoring and Release of Animal Housing");
			    	uploadDocuments('releaseAnimalsUpload',"Release of Animals",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Release of Animals");
			    	uploadDocuments('proceduresAppUpload',"Append Procedures",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Procedures");
			    	uploadDocuments('disposalsAppUpload',"Management Disposal Waste",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Disposals");
			    	uploadDocuments('monitoringMaterialNuUpload',"Procedures for Monitoring",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Monitoring");
			    	uploadDocuments('handlingProceduresUpload',"Handling Procedures",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Handling Procedures");
			    	uploadDocuments('hoppersEntryUpload',"Rules for Entry into the Vessels",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Rules for Entry into the Vessels or Hoppers");
			    	uploadDocuments('operatingConditionsUpload',"Operating Conditions",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Operating Conditions and Maintenance Programme");
			    	uploadDocuments('insertionTypeUpload',"Operation of Insertion-Type",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Operation of Insertion-Type Fixed Gauges");
			    	uploadDocuments('installationFixedUpload',"Installation of Fixed Gauges",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Installation and Dismounting of Fixed Gauges");
			    	uploadDocuments('transportPlanGaugeUpload',"Transport Plan",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Transport Plan");
			    	uploadDocuments('EmergencyAdditionUpload',"Emergency Procedures",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Emergency Procedures");
			    	uploadDocuments('nuclearEnviromentUpload',"Release of Radiation Sources",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Release of Radiation Sources");
			    	uploadDocuments('fishingToolUpload',"Fishing for Stuck Tools",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Fishing for Stuck Tools/Sources");
			    	uploadDocuments('sealedSourcesUpload',"Abandonment of Sealed Sources",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Abandonment of Sealed Sources");
			    	uploadDocuments('abandonmentZoneUpload',"Abandonment of Unsealed Sources",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Abandonment of Unsealed Sources");
			    	uploadDocuments('servicingCopyUpload',"Servicing Procedures",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Servicing Procedures");
			    	uploadDocuments('manufacturingDevelopmentUpload',"Copy of All Manufacturing",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Manufacturing or Development Procedures");
	 	    	},
				 error: function (data) {},
			  });
	}
	  function radiationDeclaration(){
			hsraApplicationId=$("#hsraApplicationId").val();
			legalOperatorName=$("#legalOperatorName").val();
			operatorTitle=$("#operatorTitle").val();
			operatorDate=$("#operatorDate").val();
			 $.ajax({
				    type: "POST",
				    url: "${RadiationDeclarationUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>legalOperatorName": legalOperatorName,
				    	  "<portlet:namespace/>operatorTitle": operatorTitle,
				    	  "<portlet:namespace/>operatorDate": operatorDate,
				      		    },
				    success: function (data) {
						var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('signatureOperatorBtn',"Signature of Service Declaration",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		 	    	},
					 error: function (data) {},
				  });
		}
	  function radiationSafetyProgramSectionFive(){
		  debugger;
			hsraApplicationId=$("#hsraApplicationId").val();
			nuclearRsoName=$("#nuclearRsoName").val();
			nuclearRsoTitle=$("#nuclearRsoTitle").val();
			nuclearRsoTeleNo=$("#nuclearRsoTeleNo").val();
			nuclearRsoExt=$("#nuclearRsoExt").val();
			nuclearRsoFax=$("#nuclearRsoFax").val();
			nuclearRsoEmail=$("#nuclearRsoEmail").val();
			rsoDetails=$("#rsoDetails").val();
			qualifiedExpertName=$("#qualifiedExpertName").val();
			qualifiedExpertTitle= $("#qualifiedExpertTitle").val();
			qualifiedExpertTele= $("#qualifiedExpertTele").val();
			qualifiedExpertExt= $("#qualifiedExpertExt").val();
			qualifiedExpertFax= $("#qualifiedExpertFax").val();
			qualifiedExpertEmail= $("#qualifiedExpertEmail").val();
			qualifiedExpertRegistrationNo= $("#qualifiedExpertRegistrationNo").val();
			qualifiedExpertDate= $("#qualifiedExpertDate").val();
			qualifiedDetails= $("#qualifiedDetails").val();
			applicantName= $("#applicantName").val();
			applicantTitle= $("#applicantTitle").val();
			otherLimitationAuth= $("#otherLimitationAuth").val();
			otherDate= $("#otherDate").val();
			classificationWorkersList= $("#classificationWorkersList").val();
			respiPleaseSpecify= $("#respiPleaseSpecify").val();
			tongsPleaseSpecify= $("#tongsPleaseSpecify").val();
			scopeOfActivities= $("#scopeOfActivities").val();
			managementSystem= $("#managementSystem").val();
			workerRecordings= $("#workerRecordings").val();
			categoriesLicence= $("#categoriesLicence").val();
			renewalsSummary= $("#renewalsSummary").val();
			constraintsLimits= $("#constraintsLimits").val();
			equipmentMonitoring= $("#equipmentMonitoring").val();
			areasControl= $("#areasControl").val();
			radioactiveSources= $("#radioactiveSources").val();
			radiationiInstruments= $("#radiationiInstruments").val();
			healthWorkers= $("#healthWorkers").val();
			investigationLevel= $("#investigationLevel").val();
			policyDetails= $("#policyDetails").val();
			securityAccess= $("#securityAccess").val();
			raditionSources= $("#raditionSources").val();
			workerTraining= $("#workerTraining").val();
			publicControl= $("#publicControl").val();
			managementSources= $("#managementSources").val();
			emergencyProcedure= $("#emergencyProcedure").val();
			licenceLocation= $("#licenceLocation").val();
			achievableProgram= $("#achievableProgram").val();
			leakedTestingSources= $("#leakedTestingSources").val();
			transferSources= $("#transferSources").val();
			nuclearMaterials= $("#nuclearMaterials").val();
			transportPackaging= $("#transportPackaging").val();
			internalReview= $("#internalReview").val();
			sourcesActivities= $("#sourcesActivities").val();
			var individualProtective=  new Array();
			$("input:checkbox[name=equipmentProtection]:checked").each(function(){
				individualProtective.push($(this).val());
			});
			var individualProtectiveEquipment= individualProtective.toString();
			
			RespiratoryProtectionPleaseSpecify= $("#otherEquipment").val()
			 $.ajax({
				    type: "POST",
				    url: "${RadiationSafetyProgramUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>nuclearRsoName": nuclearRsoName,
				    	  "<portlet:namespace/>nuclearRsoTitle": nuclearRsoTitle,
				    	  "<portlet:namespace/>nuclearRsoTeleNo": nuclearRsoTeleNo,
				    	  "<portlet:namespace/>nuclearRsoExt": nuclearRsoExt,
				    	  "<portlet:namespace/>nuclearRsoFax": nuclearRsoFax,
				    	  "<portlet:namespace/>nuclearRsoEmail": nuclearRsoEmail,
				    	  "<portlet:namespace/>rsoDetails": rsoDetails,
				    	  "<portlet:namespace/>qualifiedExpertName": qualifiedExpertName,
				    	  "<portlet:namespace/>qualifiedExpertTitle": qualifiedExpertTitle,
				    	  "<portlet:namespace/>qualifiedExpertTele": qualifiedExpertTele,
				    	  "<portlet:namespace/>qualifiedExpertExt": qualifiedExpertExt,
				    	  "<portlet:namespace/>qualifiedExpertFax": qualifiedExpertFax,
				    	  "<portlet:namespace/>qualifiedExpertEmail": qualifiedExpertEmail,
				    	  "<portlet:namespace/>qualifiedExpertRegistrationNo": qualifiedExpertRegistrationNo,
				    	  "<portlet:namespace/>qualifiedExpertDate": qualifiedExpertDate,
				    	  "<portlet:namespace/>qualifiedDetails": qualifiedDetails,
				    	  "<portlet:namespace/>applicantName": applicantName,
				    	  "<portlet:namespace/>applicantTitle": applicantTitle,
				    	  "<portlet:namespace/>otherLimitationAuth": otherLimitationAuth,
				    	  "<portlet:namespace/>otherDate":otherDate,
				    	  "<portlet:namespace/>classificationWorkersList": classificationWorkersList,
				    	  "<portlet:namespace/>respiPleaseSpecify": respiPleaseSpecify,
				    	  "<portlet:namespace/>tongsPleaseSpecify": tongsPleaseSpecify,
				    	  "<portlet:namespace/>scopeOfActivities": scopeOfActivities,
				    	  "<portlet:namespace/>managementSystem": managementSystem,
				    	  "<portlet:namespace/>workerRecordings": workerRecordings,
				    	  "<portlet:namespace/>categoriesLicence": categoriesLicence,
				    	  "<portlet:namespace/>renewalsSummary": renewalsSummary,
				    	  "<portlet:namespace/>constraintsLimits": constraintsLimits,
				    	  "<portlet:namespace/>equipmentMonitoring": equipmentMonitoring,
				    	  "<portlet:namespace/>areasControl": areasControl,
				    	  "<portlet:namespace/>radioactiveSources": radioactiveSources,
				    	  "<portlet:namespace/>radiationiInstruments": radiationiInstruments,
				    	  "<portlet:namespace/>healthWorkers": healthWorkers,
				    	  "<portlet:namespace/>investigationLevel": investigationLevel,
				    	  "<portlet:namespace/>policyDetails": policyDetails,
				    	  "<portlet:namespace/>securityAccess": securityAccess,
				    	  "<portlet:namespace/>raditionSources": raditionSources,
				    	  "<portlet:namespace/>workerTraining": workerTraining,
				    	  "<portlet:namespace/>publicControl": publicControl,
				    	  "<portlet:namespace/>managementSources": managementSources,
				    	  "<portlet:namespace/>emergencyProcedure": emergencyProcedure,
				    	  "<portlet:namespace/>licenceLocation": licenceLocation,
				    	  "<portlet:namespace/>achievableProgram": achievableProgram,
				    	  "<portlet:namespace/>leakedTestingSources": leakedTestingSources,
				    	  "<portlet:namespace/>transferSources": transferSources,
				    	  "<portlet:namespace/>nuclearMaterials": nuclearMaterials,
				    	  "<portlet:namespace/>transportPackaging": transportPackaging,
				    	  "<portlet:namespace/>internalReview": internalReview,
				    	  "<portlet:namespace/>sourcesActivities": sourcesActivities,
				    	  "<portlet:namespace/>individualProtectiveEquipment": individualProtectiveEquipment,
				    	  "<portlet:namespace/>RespiratoryProtectionPleaseSpecify": RespiratoryProtectionPleaseSpecify
				      		    },
				    success: function (data) { 
				    	debugger;
				    	var result = data.APP_DATA;
				    	 $("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	 addAlternateRsoDetail();
						 addQualifedExpertDetail();
				    	 uploadDocuments('copy-of-cv',"Radiation Safety Officer Details",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId, "Radiation Safety Officer (RSO) Details");
				    	 uploadDocuments('experience-copy',"Copy of the curriculum vitae",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId, "Copy of the curriculum vitae or resume of the prospective alternate RSO indicating radiation safety-related experience.");
				    	 uploadDocuments('certificates-copy',"Copies of relevant",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copies of relevant RSO training certificates of the prospective RSO.");
				    	 uploadDocuments('qualified-copy',"Details of Qualified Expert ",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Qualified Expert Details");
				    	 uploadDocuments('curriculum-copy',"Curriculum Vitae Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copy of the curriculum vitae or resume of the prospective alternate Qualified Expert indicating radiation safety-related experience.");
				    	 uploadDocuments('qualified-expert',"Prospective Qualified Expert",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copies of relevant training certificates of the prospective Qualified Expert.");
				    	 uploadDocuments('applicantRepresentativeSignatureBtn',"Signature of Representative",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
				    	 uploadDocuments('classificationOfWorkers',"Safety Classification of Workers",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Classification of Workers");
				    	 uploadDocuments('radiationProUpload',"Radiation Protection Program",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Radiation Protection Program (RPP)");
				    	 uploadDocuments('scopeOfActivitiesUpload',"Scope of Activities",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Scope of Activities");
				    	 uploadDocuments('managementSystemUpload',"Safety Management System",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Management System");
				    	 uploadDocuments('workerRecordingsUpload',"Safety Recording Doses",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Ascertaining and recording doses to workers");
				    	 uploadDocuments('constraintsLimitsUpload',"Safety Dose Limit Optimization",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Dose limits, dose constraints and optimization");
				    	 uploadDocuments('equipmentMonitoringUpload',"maintenance of individual",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Acquisition and maintenance of individual monitoring equipment");
				    	 uploadDocuments('areasControlUpload',"Safety Workplace Monitoring",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Workplace Monitoring");
				    	 uploadDocuments('classificationAreaUpload',"Classification Control",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Classification of areas (control and supervised areas) and local rules");
				    	 uploadDocuments('radioactiveSourcesUpload',"Control of radioactive",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Control of radioactive contamination; where unsealed radiation sources are handled");
				    	 uploadDocuments('radiationiInstrumentsUpload',"Radiation detection instrum",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Radiation detection instruments");
				    	 uploadDocuments('healthWorkersUpload',"Health Surveillance of Workers",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Health Surveillance of Workers");
				    	 uploadDocuments('investigationLevelUpload',"Investigation Levels",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Investigation Levels and Feedback of Operating Experience");
				    	 uploadDocuments('recordReportingUpload',"Record Reporting System",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Record and Reporting System");
				    	 uploadDocuments('securityAccessUpload',"Access control and security",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Access control and security");
				    	 uploadDocuments('raditionSourcesUpload',"Controlling possession",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Controlling possession of radiation sources");
				    	 uploadDocuments('workerTrainingUpload',"Worker Training",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Worker Training and Authorization");
				    	 uploadDocuments('publicControlUpload',"Control of Public Exposure",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Control of Public Exposure");
				    	 uploadDocuments('emergencyProceeUpload',"Safety Emergency Procedures",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Emergency Procedures");
				    	 uploadDocuments('licenceLocationUpload',"Safety Decommissioning",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Decommissioning");
				    	 uploadDocuments('lowAchievableProgramUpload',"Low As Reasonably Achievable",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"As Low As Reasonably Achievable (ALARA) Program");
				    	 uploadDocuments('leakTestingUpload',"Leak testing of sealed sources",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Leak testing of sealed sources");
				    	 uploadDocuments('transferSourcesUpload',"Transfer of radiation sources",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Transfer of radiation sources");
				    	 uploadDocuments('nuclearMaterialsUpload',"Nuclear Materials Transfer",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Transfer of radiation sources and / nuclear materials");
				    	 uploadDocuments('transportPackagingUpload',"Packaging Transfer Material",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Packaging and transport of radiation sources and/nuclear materials");
				    	 uploadDocuments('internalReviewUpload',"Safety Internal review",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Internal review");
				    	 uploadDocuments('sourcesActivitiesUpload',"Append Safety Assessment",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Append Safety Assessment for facilities of activities involving sources of Categories 1 and 2");
		 	    	},
					 error: function (data) {},
				  });
		}
	  function radiationSafetyLowRiskSectionSix(){
			hsraApplicationId=$("#hsraApplicationId").val();
			appendixRsoName= $("#appendixRsoName").val(),
			appendixRsoTitle= $("#appendixRsoTitle").val(),
			appendixRsoTeleNo= $("#appendixRsoTeleNo").val(),
			appendixRsoExt= $("#appendixRsoExt").val(),
			appendixRsoFax= $("#appendixRsoFax").val(),
			appendixRsoEmail= $("#appendixRsoEmail").val(),
			appendixRsoDetails= $("#appendixRsoDetails").val(),
	        qualifiedAppendixName= $("#qualifiedAppendixName").val(),
            qualifiedAppendixTitle= $("#qualifiedAppendixTitle").val(),
            qualifiedAppendixTele= $("#qualifiedAppendixTele").val(),
            qualifiedAppendixExt= $("#qualifiedAppendixExt").val(),
            qualifiedAppendixFax= $("#qualifiedAppendixFax").val(),
            qualifiedAppendixEmail= $("#qualifiedAppendixEmail").val(),
            qualifiedAppendixRegistrationNo= $("#qualifiedAppendixRegistrationNo").val(),
            qualifiedAppendixDate= $("#qualifiedAppendixDate").val(),
            qualifiedAppendixDetails= $("#qualifiedAppendixDetails").val(),
            monitoringExposure= $("#monitoringExposure").val(),
            recordSystem= $("#recordSystem").val(),
            securityAccess= $("#securityAccessOne").val(),
            trainingInformation= $("#trainingInformation").val(),
            leakTesting= $("#leakTesting").val(),
            emergencyProcedures= $("#emergencyProcedures").val(),
            managementSourcesDis= $("#managementSourcesDis").val(),
			 $.ajax({
				    type: "POST",
				    url: "${RadiationSafetyLowRiskUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />appendixRsoName": appendixRsoName,
			                "<portlet:namespace />appendixRsoTitle": appendixRsoTitle,
			                "<portlet:namespace />appendixRsoTeleNo":appendixRsoTeleNo,
			                "<portlet:namespace />appendixRsoExt": appendixRsoExt,
			                "<portlet:namespace />appendixRsoFax": appendixRsoFax,
			                "<portlet:namespace />appendixRsoEmail": appendixRsoEmail,
			                "<portlet:namespace />appendixRsoDetails": appendixRsoDetails,
			                "<portlet:namespace />qualifiedAppendixName": qualifiedAppendixName,
			                "<portlet:namespace />qualifiedAppendixTitle": qualifiedAppendixTitle,
			                "<portlet:namespace />qualifiedAppendixTele": qualifiedAppendixTele,
			                "<portlet:namespace />qualifiedAppendixExt": qualifiedAppendixExt,
			                "<portlet:namespace />qualifiedAppendixFax": qualifiedAppendixFax,
			                "<portlet:namespace />qualifiedAppendixEmail": qualifiedAppendixEmail,
			                "<portlet:namespace />qualifiedAppendixRegistrationNo":qualifiedAppendixRegistrationNo,
			                "<portlet:namespace />qualifiedAppendixDate":qualifiedAppendixDate,
			                "<portlet:namespace />qualifiedAppendixDetails":qualifiedAppendixDetails,
			                "<portlet:namespace />monitoringExposure":monitoringExposure,
			                "<portlet:namespace />recordSystem":recordSystem,
			                "<portlet:namespace />securityAccess": securityAccess,
			                "<portlet:namespace />trainingInformation": trainingInformation,
			                "<portlet:namespace />leakTesting": leakTesting,
			                "<portlet:namespace />emergencyProcedures":emergencyProcedures,
			                "<portlet:namespace />managementSourcesDis":managementSourcesDis,
			           
				      		    },
				    success: function (data) {
				    	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	addAlternateRsoOneDetail();
						addQualifedExpertOneDetail();
				    	uploadDocuments('relevant-cv-copy',"Relevant Cv Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Qualified Expert Details");
				    	uploadDocuments('certificates-cv',"Certificate Cv",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Radiation Safety Officer (RSO) Details");
				    	uploadDocuments('resume-copy',"Resume Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copy of the curriculum vitae or resume of the prospective alternate RSO indicating radiation safety-related experience.");
				    	uploadDocuments('training-copy',"Training Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copies of relevant RSO training certificates of the prospective RSO");
				    	uploadDocuments('qualified-resume-copy',"Qualified Resume Copy",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copy of the curriculum vitae or resume");
				    	uploadDocuments('training-expert',"Training Expert",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"Copies of relevant training certificates");
		 	    	},
					 error: function (data) {},
				  });
		}
	  /* Notification of Practices and Sources */
	  function addLegalInformation(isSaveAndContinue){
			hsraApplicationId=$("#hsraApplicationId").val();
			legalPersonName = $('#legalPersonName').val();
		   legalPersonAddress = $('#legalPersonAddress').val();
		   organizationName = $('#organizationNameLegal').val();
		   organizationAddress = $('#organizationAddress').val();
		   contactNumber = $('#contactNumber').val();
		   legalPersonEmail = $('#legalPersonEmail').val();
		   practiceNature = $('#practiceNature').val();
		   legalPersonName=$("#legalPersonName").val();
		   legalPersonEmail=$("#legalPersonEmail").val();
			submitForm= true;
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!isSaveAndContinue){
			if(!legalPersonEmail){
			$("#legalPersonEmailValidation").removeClass("hide");
			$("#legalPersonEmailValidation").text("Please Enter Email Address");
			$("#legalPersonEmail").focus();
			submitForm= false;
		}else if(legalPersonEmail.match(mailformat)){ 
			$("#legalPersonEmailValidation").addClass("hide");
		}else{
			$("#legalPersonEmailValidation").removeClass("hide");
			$("#legalPersonEmailValidation").text("You have Entered an In-valid email address");
			$("#legalPersonEmail").focus();
			submitForm= false;
		}
		if(!legalPersonName){
			$("#legalPersonNameValidation").removeClass("hide");
			$("#legalPersonName").focus();
			submitForm= false;
		}else{
			$("#legalPersonNameValidation").addClass("hide");
		    }
			}
			if(submitForm){
			 $.ajax({
				    type: "POST",
				    url: "${AddLegalInformationUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>legalPersonName": legalPersonName,
				    	  "<portlet:namespace/>legalPersonAddress": legalPersonAddress,
				    	  "<portlet:namespace/>organizationName": organizationName,
				    	  "<portlet:namespace/>organizationAddress": organizationAddress,
				    	  "<portlet:namespace/>contactNumber": contactNumber,
				    	  "<portlet:namespace/>legalPersonEmail": legalPersonEmail,
				    	  "<portlet:namespace/>practiceNature": practiceNature,
				      		    },
				    success: function (data) { 
						if(!isSaveAndContinue){
							applicantInfo();
						}
						$("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		 	    	},
					 error: function (data) {},
				  });
			}
		}
	  
	  function addDetailSource(){
			hsraApplicationId=$("#hsraApplicationId").val();
			 sourceIdentification = $('#sourceIdentification').val();
		     sourceLocation = $('#sourceLocation').val();
		     stateActivity = $('#stateActivity').val();
			 $.ajax({
				    type: "POST",
				    url: "${AddDetailSourceUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>sourceIdentification": sourceIdentification,
				    	  "<portlet:namespace/>sourceLocation": sourceLocation,
				    	  "<portlet:namespace/>stateActivity": stateActivity,
				    	  
				      		    },
				    success: function (data) { 
				    	addSourcesDetail();
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  function addRadionuclideButton(){
			hsraApplicationId=$("#hsraApplicationId").val();
			 radionuclideDetails = $('#radionuclideDetails').val();
		     activityDetails = $('#activityDetails').val();
		     activityDetailBq = $('#activityDetailBq').val();
		     activityDate = $('#activityDate').val();
		     chemicalDetailsForm = $('#chemicalDetailsForm').val();
		     serialNo = $('#serialNo').val();
		     sealedSource = $('input[name="sealedSource"]:checked').val();
		     manufacturerDetails = $('#manufacturerDetails').val();
		     modelNo = $('#modelNo').val();
		     identificationNo = $('#identificationNo').val();
		     statusDetails = $('#statusDetails').val();
			 $.ajax({
				    type: "POST",
				    url: "${AddRadionuclideUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>radionuclideDetails": radionuclideDetails,
				          "<portlet:namespace/>activityDetails": activityDetails,
				          "<portlet:namespace/>activityDetailBq": activityDetailBq,
				          "<portlet:namespace/>activityDate": activityDate,
				          "<portlet:namespace/>chemicalDetailsForm": chemicalDetailsForm,
				          "<portlet:namespace/>serialNo": serialNo,
				          "<portlet:namespace/>sealedSource": sealedSource,
				          "<portlet:namespace/>manufacturerDetails": manufacturerDetails,
				          "<portlet:namespace/>modelNo": modelNo,
				          "<portlet:namespace/>identificationNo": identificationNo,
				          "<portlet:namespace/>statusDetails": statusDetails,
				    	  
				      		    },
				    success: function (data) { 
				    	addRadionuclideDetail();
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  function addRadiationGeneratinEquipment(){
			hsraApplicationId=$("#hsraApplicationId").val();
			 manufacturerEquipment = $('#manufacturerEquipment').val();
			 equipmentModel = $('#equipmentModel').val();
			 equipmentSerial = $('#equipmentSerial').val();
			 operatingPotential = $('#operatingPotential').val();
			 equipmentModels = $('#equipmentModels').val();
			 natureEquipment = $('#natureEquipment').val();
			 equipmentStatusDetail = $('#equipmentStatusDetail').val();
			 equipmentDate = $('#equipmentDate').val();
			 $.ajax({
				    type: "POST",
				    url: "${AddGeneratingEquipmentUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>manufacturerEquipment": manufacturerEquipment,
				    	    "<portlet:namespace/>equipmentModel": equipmentModel,
				    	    "<portlet:namespace/>equipmentSerial": equipmentSerial,
				    	    "<portlet:namespace/>operatingPotential": operatingPotential,
				    	    "<portlet:namespace/>equipmentModels": equipmentModels,
				    	    "<portlet:namespace/>natureEquipment": natureEquipment,
				    	    "<portlet:namespace/>equipmentStatusDetail": equipmentStatusDetail,
				    	    "<portlet:namespace/>equipmentDate": equipmentDate,
				      		    },
				    success: function (data) { 
				    	var result = data.APP_DATA;
				    	/* $("#hsraApplicationId").html(result["hsraApplicationId"]); */
				    	addGenEquipmentDetail();
				    	
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  /* Fit and Proper Declaration */
	  function addFitProperDetail(){
			hsraApplicationId=$("#hsraApplicationId").val();
			  applicantFirstName = $('#applicantFirstName').val();
			  applicantMiddleName = $('#applicantMiddleName').val();
			  applicantSurname = $('#applicantSurname').val();
			  applicantFormerName = $('#applicantFormerName').val();
			  applicantAlias = $('#applicantAlias').val();
			  applicantStreetName = $('#applicantStreetName').val();
			  applicantStreetNo = $('#applicantStreetNo').val();
			  applicantPostalCode = $('#applicantPostalCode').val();
			  applicantCountry = $('#applicantCountry').val();
			  applicantTownName = $('#applicantTownName').val();
			  applicantCity = $('#applicantCity').val();
			  applicantParish = $('#applicantParish').val();
			  applicantTelephoneNum = $('#applicantTelephoneNum').val();
			  applicantEmailAdd = $('#applicantEmailAdd').val();
			  applicantDateBirth = $('#applicantDateBirth').val();
			  applicantPlaceOfBirthTown = $('#applicantTownName').val();
			  applicantPlaceOfBirthParish = $('#parishArea').val();
			  applicantPlaceOfBirthCountry = $('#applicantCountryName').val();
			  applicantNationality = $('#applicantNationality').val();
			  applicantNisNum = $('#applicanNisNum').val();
			  applicantSocialNum = $('#applicantSocialNum').val();
			  applicantNationalNum = $('#applicantNationalNum').val();
			  applicantRegistrationNum = $('#applicantRegistrationNum').val();
			  maritalStatusDetails = $('#maritalStatusDetails').val();
			  applicantRelationship = $('#applicantRelationship').val();
			  applicantSecTelephone = $('#applicantSecTelephone').val();
			  applicantSecMail = $('#applicantSecMail').val();
			  applicantSecAddress = $('#applicantSecAddress').val();
			  applicantSecAddressParish = $('#applicantSecAddressParish').val();
			 $.ajax({
				    type: "POST",
				    url: "${AddFitPropPersonalDetailUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />applicantFirstName": applicantFirstName,
				    	  "<portlet:namespace />applicantMiddleName": applicantMiddleName,
				    	  "<portlet:namespace />applicantSurname": applicantSurname,
				    	  "<portlet:namespace />applicantFormerName": applicantFormerName,
				    	  "<portlet:namespace />applicantAlias": applicantAlias,
				    	  "<portlet:namespace />applicantStreetName": applicantStreetName,
				    	  "<portlet:namespace />applicantStreetNo": applicantStreetNo,
				    	  "<portlet:namespace />applicantPostalCode": applicantPostalCode,
				    	  "<portlet:namespace />applicantCountry": applicantCountry,
				    	  "<portlet:namespace />applicantTownName": applicantTownName,
				    	  "<portlet:namespace />applicantCity": applicantCity,
				    	  "<portlet:namespace />applicantParish": applicantParish,
				    	  "<portlet:namespace />applicantTelephoneNum": applicantTelephoneNum,
				    	  "<portlet:namespace />applicantEmailAdd": applicantEmailAdd,
				    	  "<portlet:namespace />applicantDateBirth": applicantDateBirth,
				    	  "<portlet:namespace />applicantPlaceOfBirthTown": applicantPlaceOfBirthTown,
				    	  "<portlet:namespace />applicantPlaceOfBirthParish": applicantPlaceOfBirthParish,
				    	  "<portlet:namespace />applicantPlaceOfBirthCountry": applicantPlaceOfBirthCountry,
				    	  "<portlet:namespace />applicantNationality": applicantNationality,
				    	  "<portlet:namespace />applicantNisNum": applicantNisNum,
				    	  "<portlet:namespace />applicantSocialNum": applicantSocialNum,
				    	  "<portlet:namespace />applicantNationalNum": applicantNationalNum,
				    	  "<portlet:namespace />applicantRegistrationNum": applicantRegistrationNum,
				    	  "<portlet:namespace />maritalStatusDetails": maritalStatusDetails,
				    	  "<portlet:namespace />applicantRelationship": applicantRelationship,
				    	  "<portlet:namespace />applicantSecTelephone": applicantSecTelephone,
				    	  "<portlet:namespace />applicantSecMail": applicantSecMail,
				    	  "<portlet:namespace />applicantSecAddress": applicantSecAddress,
				    	  "<portlet:namespace />applicantSecAddressParish": applicantSecAddressParish
				      		    },
				    success: function (data) { 
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  function addBusinessInfoDetail(){
			hsraApplicationId=$("#hsraApplicationId").val();
			  companyType = $('#companyType').val();
              applicantBusinessName = $('#applicantBusinessName').val();
              applicantcomName = $('#applicantcomName').val();
              applicantComAddress = $('#applicantComAddress').val();
              applicantComAddressParish = $('#applicantComAddressParish').val();
              applicantComNo = $('#applicantComNo').val();
              applicantComEmail = $('#applicantComEmail').val();
              applicantComTelephone = $('#applicantComTelephone').val();
              applicantComTitle = $('#applicantComTitle').val();
              materialTechnology = $('input[name="materialTechnology"]:checked').val();
              relevantBox = $('input[name="relevantBox"]:checked').val();
              corporateDirector = $('input[name="corporateDirector"]:checked').val();
              facilitySources = $('input[name="facilitySources"]:checked').val();
              criminalFraud = $('input[name="criminalFraud"]:checked').val();
              professionalSubject = $('input[name="professionalSubject"]:checked').val();
              employmentResign = $('input[name="employmentResign"]:checked').val();
              mentallyIll = $('input[name="mentallyIll"]:checked').val();
              bankruptAuthority = $('input[name="bankruptAuthority"]:checked').val();
              circumstancesEvent = $('#circumstancesEvent').val();
              partnershipHsra = $('input[name="partnershipHsra"]:checked').val();
              facilityAssociated = $('input[name="facilityAssociated"]:checked').val();

			 $.ajax({
				    type: "POST",
				    url: "${AddFitPropBusinessInformationUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>companyType": companyType,
				    	    "<portlet:namespace/>applicantBusinessName": applicantBusinessName,
				    	    "<portlet:namespace/>applicantcomName": applicantcomName,
				    	    "<portlet:namespace/>applicantComAddress": applicantComAddress,
				    	    "<portlet:namespace/>applicantComAddressParish": applicantComAddressParish,
				    	    "<portlet:namespace/>applicantComNo": applicantComNo,
				    	    "<portlet:namespace/>applicantComEmail": applicantComEmail,
				    	    "<portlet:namespace/>applicantComTelephone": applicantComTelephone,
				    	    "<portlet:namespace/>applicantComTitle": applicantComTitle,
				    	    "<portlet:namespace/>materialTechnology": materialTechnology,
				    	    "<portlet:namespace/>relevantBox": relevantBox,
				    	    "<portlet:namespace/>corporateDirector": corporateDirector,
				    	    "<portlet:namespace/>facilitySources": facilitySources,
				    	    "<portlet:namespace/>criminalFraud": criminalFraud,
				    	    "<portlet:namespace/>professionalSubject": professionalSubject,
				    	    "<portlet:namespace/>employmentResign": employmentResign,
				    	    "<portlet:namespace/>mentallyIll": mentallyIll,
				    	    "<portlet:namespace/>bankruptAuthority": bankruptAuthority,
				    	    "<portlet:namespace/>circumstancesEvent": circumstancesEvent,
				    	    "<portlet:namespace/>partnershipHsra": partnershipHsra,
				    	    "<portlet:namespace/>facilityAssociated": facilityAssociated,
				      		    },
				    success: function (data) { 
		 	    	},
					 error: function (data) {},
				  });
		}
	  function addFinanicalButton(){
			hsraApplicationId=$("#hsraApplicationId").val();
			financialInstitution=$("input[name='financialInstitution']:checked").val();
            creditfacility=$("input[name='creditfacility']:checked").val();
            surroundingAction=$("#surroundingAction").val();
            jamaicaInstitution=$("input[name='jamaicaInstitution']:checked").val();

			 $.ajax({
				    type: "POST",
				    url: "${AddFitPropFinancialProfileUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />financialInstitution": financialInstitution,
				    	    "<portlet:namespace />creditfacility": creditfacility,
				    	    "<portlet:namespace />surroundingAction": surroundingAction,
				    	    "<portlet:namespace />jamaicaInstitution": jamaicaInstitution,
				      		    },
				    success: function (data) { 
		 	    	},
					 error: function (data) {},
				  });
		}
	  function addDeclarationOfApplicant(){
			hsraApplicationId=$("#hsraApplicationId").val();
			nameApplicant=$("#nameApplicant").val();
			dateApplicant=$("#dateApplicant").val();

			 $.ajax({
				    type: "POST",
				    url: "${AddFitPropDeclarationOfApplicantUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />nameApplicant": nameApplicant,
				    	    "<portlet:namespace />dateApplicant": dateApplicant,
				      		    },
				    success: function (data) { 
				    	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('declearationSignBtn',"Declaration of Applicant",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		 	    	},
					 error: function (data) {},
				  });
		}
	  /* Broker Registration  */
	  function addBrokerDetail(isSaveAndContinue){
			hsraApplicationId=$("#hsraApplicationId").val();
			     businessPlace = $("#businessPlace").val();
			     organizationTrn = $("#organizationTrn").val();
			     organizationTeleNum = $("#organizationTeleNum").val();
			     organizationFaxNum = $("#organizationFaxNum").val();
			     organizationEmailAdd = $("#organizationEmailAdd").val();
			     businessTypeBroker = $("#businessTypeBroker").val();
			     businessNumberBroker = $("#businessNumberBroker").val();
			     corporationNumberBroker = $("#corporationNumberBroker").val();
			     publicActBroker = $("#publicActBroker").val();
			     licenceNumberBroker = $("#licenceNumberBroker").val();
			     expirationDateBroker = $("#expirationDateBroker").val();
			     radioactiveMaterial = $("input[name='radioactiveMaterial']:checked").val();
			     nuclearMaterial = $("input[name='nuclearMaterial']:checked").val();
			     nuclearTechnology = $("input[name='nuclearTechnology']:checked").val();
			     ionizingApparatus = $("input[name='ionizingApparatus']:checked").val();
			     radiationSource = $("input[name='radiationSource']:checked").val();
			     organizationTransfer = $("input[name='organizationTransfer']:checked").val();
			     nuclearProtection = $("input[name='nuclearProtection']:checked").val();
			     applicationTypes = $("input:checkbox[name=applicationTypes]:checked").val()
			     storageFacility = $("#storageFacility").val();
			     additionalInformation = $("#additionalInformation").val();
				 organizationNameD=$("#organizationNameD").val();
				 organizationEmailAdd=$("#organizationEmailAdd").val();
						submitForm= true;
						var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
						if(!isSaveAndContinue){
						if(!organizationEmailAdd){
						$("#organizationEmailAddValidation").removeClass("hide");
						$("#organizationEmailAddValidation").text("Please Enter Email Address");
						$("#organizationEmailAdd").focus();
						submitForm= false;
					}else if(organizationEmailAdd.match(mailformat)){ 
						$("#organizationEmailAddValidation").addClass("hide");
					}else{
						$("#organizationEmailAddValidation").removeClass("hide");
						$("#organizationEmailAddValidation").text("You have Entered an In-valid email address");
						$("#organizationEmailAdd").focus();
						submitForm= false;
					}
					if(!organizationNameD){
						$("#organizationNameDValidation").removeClass("hide");
						$("#organizationNameD").focus();
						submitForm= false;
					}else{
						$("#organizationNameDValidation").addClass("hide");
						}
					}
						if(submitForm){

			     $.ajax({
				    type: "POST",
				    url: "${AddBrokerResgistrationDetailUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />organizationNameD": organizationNameD,
				    	    "<portlet:namespace />businessPlace": businessPlace,
				    	    "<portlet:namespace />organizationTrn": organizationTrn,
				    	    "<portlet:namespace />organizationTeleNum": organizationTeleNum,
				    	    "<portlet:namespace />organizationFaxNum": organizationFaxNum,
				    	    "<portlet:namespace />organizationEmailAdd": organizationEmailAdd,
				    	    "<portlet:namespace />businessTypeBroker": businessTypeBroker,
				    	    "<portlet:namespace />businessNumberBroker": businessNumberBroker,
				    	    "<portlet:namespace />corporationNumberBroker": corporationNumberBroker,
				    	    "<portlet:namespace />publicActBroker": publicActBroker,
				    	    "<portlet:namespace />licenceNumberBroker": licenceNumberBroker,
				    	    "<portlet:namespace />expirationDateBroker": expirationDateBroker,
				    	    "<portlet:namespace />radioactiveMaterial": radioactiveMaterial,
				    	    "<portlet:namespace />nuclearMaterial": nuclearMaterial,
				    	    "<portlet:namespace />nuclearTechnology": nuclearTechnology,
				    	    "<portlet:namespace />ionizingApparatus": ionizingApparatus,
				    	    "<portlet:namespace />radiationSource": radiationSource,
				    	    "<portlet:namespace />organizationTransfer": organizationTransfer,
				    	    "<portlet:namespace />nuclearProtection": nuclearProtection,
				    	    "<portlet:namespace />storageFacility": storageFacility,
				    	    "<portlet:namespace />additionalInformation": additionalInformation,
				    	    "<portlet:namespace />applicationTypes": applicationTypes,
				      		    },
				    success: function (data) { 
				    	if(!isSaveAndContinue){
						   nextForm(); 
				    	}
						$("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				     	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('proof-copy',"Certified Copy of Broker Licence",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"License Customs Brokers Information");
		 	    	},
					 error: function (data) {},
				  });
				}
		}
	  
	  function addBrokerDeclaration(){
			hsraApplicationId=$("#hsraApplicationId").val();
			brokerOperatorName=$("#brokerOperatorName").val();
			brokerTitle=$("#brokerTitle").val();
			signDate=$("#signDate").val();

			 $.ajax({
				    type: "POST",
				    url: "${AddBrokerDeclarationUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />brokerOperatorName": brokerOperatorName,
				    	    "<portlet:namespace />brokerTitle": brokerTitle,
				    	    "<portlet:namespace />signDate": signDate,
				      		    },
				    success: function (data) { 
				    	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('signatureBrokerBtn',"Signature of Broker",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		 	    	},
					 error: function (data) {},
				  });
		}
	  /* Quality Experts */
	  function addExpertDetails(isSaveAndContinue){
			hsraApplicationId=$("#hsraApplicationId").val();
			expertSurname = $("#expertSurname").val();
		    expertFirstName = $("#expertFirstName").val();
		    expertId = $("#expertId").val();
		    expertPosition = $("#expertPosition").val();
		    expertTelephone = $("#expertTelephone").val();
		    expertMobile = $("#expertMobile").val();
		    expertEmail = $("#expertEmail").val();
		    expertDate = $("#expertDate").val();
			expertFirstName=$("#expertFirstName").val();
			expertEmail=$("#expertEmail").val();
			submitForm= true;
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!isSaveAndContinue){
			if(!expertEmail){
					$("#expertEmailValidation").removeClass("hide");
					$("#expertEmailValidation").text("Please Enter Email Address");
					$("#expertEmail").focus();
				submitForm= false;		
		    }else if(expertEmail.match(mailformat)){ 
				$("#expertEmailValidation").addClass("hide");
			}else{
				$("#expertEmailValidation").removeClass("hide");
				$("#expertEmailValidation").text("You have Entered an In-valid email address");
				$("#expertEmail").focus();
					submitForm= false;
						}
				if(!expertFirstName){
				    $("#expertFirstNameValidation").removeClass("hide");
					$("#expertFirstName").focus();
				submitForm= false;
			}else{
				$("#expertFirstNameValidation").addClass("hide");
	    	}
			}	
			if(submitForm){
			 $.ajax({
				    type: "POST",
				    url: "${AddQualityExpertDetailUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />expertSurname": expertSurname,
				    	    "<portlet:namespace />expertFirstName": expertFirstName,
				    	    "<portlet:namespace />expertId": expertId,
				    	    "<portlet:namespace />expertPosition": expertPosition,
				    	    "<portlet:namespace />expertTelephone": expertTelephone,
				    	    "<portlet:namespace />expertMobile": expertMobile,
				    	    "<portlet:namespace />expertEmail": expertEmail,
				    	    "<portlet:namespace />expertDate": expertDate,
				      		    },
				    success: function (data) { 
				    	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('expertSignatureBtn',"Signature of Quality Expert",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
				    	if(!isSaveAndContinue){   
							applicantInfo(); 
					    }

		 	    	},
					 error: function (data) {},
				  });
				}
		}
	  
	  function addEmploymentDetails(isSaveAndContinue){
			hsraApplicationId=$("#hsraApplicationId").val();
			employmentCompanyName = $("#employmentCompanyName").val();
            employmentTeleNo = $("#employmentTeleNo").val();
            employmentAddress = $("#employmentAddress").val();
            employmentParish = $("#employmentParish").val();
            employmentMobileNo = $("#employmentMobileNo").val();
            employmentEmailAddress = $("#employmentEmailAddress").val();
			employmentCompanyName=$("#employmentCompanyName").val();
			employmentEmailAddress=$("#employmentEmailAddress").val();
			submitForm= true;
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!isSaveAndContinue){
			if(!expertEmail){
					$("#employmentEmailAddressValidation").removeClass("hide");
					$("#employmentEmailAddressValidation").text("Please Enter Email Address");
					$("#employmentEmailAddress").focus();
				submitForm= false;		
		    }else if(employmentEmailAddress.match(mailformat)){ 
				$("#employmentEmailAddressValidation").addClass("hide");
			}else{
				$("#employmentEmailAddressValidation").removeClass("hide");
				$("#employmentEmailAddressValidation").text("You have Entered an In-valid email address");
				$("#employmentEmailAddress").focus();
					submitForm= false;
						}
				if(!employmentCompanyName){
				    $("#employmentCompanyNameValidation").removeClass("hide");
					$("#employmentCompanyName").focus();
				submitForm= false;
			}else{
				$("#employmentCompanyNameValidation").addClass("hide");
	    	}
			}	
			if(submitForm){
			$.ajax({
				    type: "POST",
				    url: "${AddQualityEmployementDetailUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />employmentCompanyName": employmentCompanyName,
		                    "<portlet:namespace />employmentTeleNo": employmentTeleNo,
		                    "<portlet:namespace />employmentAddress": employmentAddress,
		                    "<portlet:namespace />employmentParish": employmentParish,
		                    "<portlet:namespace />employmentMobileNo": employmentMobileNo,
		                    "<portlet:namespace />employmentEmailAddress": employmentEmailAddress,
				      		    },
				    success: function (data) { 
						$("#hsraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						if(!isSaveAndContinue){   
						   applicantInfo(); 
						}
		 	    	},
					 error: function (data) {},
				  });
				}
		}
	  function addProficiencyDetails(){
			hsraApplicationId=$("#hsraApplicationId").val();
			var profDetail=  new Array();
			$("input:checkbox[name=proficiencyDetails]:checked").each(function(){
				profDetail.push($(this).val());
			});
			var proficiencyDetails= profDetail.toString();
			workDurationOne = $("#workDuration1").val();
            capacityOne = $("#capacity1").val();
			workDurationTwo = $("#workDuration2").val();
            capacityTwo = $("#capacity2").val();
			workDurationThree = $("#workDuration3").val();
            capacityThree = $("#capacity3").val();
            workDurationFour = $("#workDuration4").val();
            capacityFour = $("#capacity4").val();
            workDurationFive = $("#workDuration5").val();
            capacityFive = $("#capacity5").val();
            workDurationSix = $("#workDuration6").val();
            capacitySix = $("#capacity6").val();
            workDurationSeven = $("#workDuration7").val();
            capacitySeven = $("#capacity7").val();
            workDurationEight = $("#workDuration8").val();
            capacityEight = $("#capacity8").val();
            workDurationNine = $("#workDuration9").val();
            capacityNine = $("#capacity9").val();
            workDurationTen = $("#workDuration10").val();
            capacityTen = $("#capacity10").val();
            workDurationEleven = $("#workDuration11").val();
            capacityEleven = $("#capacity11").val();
            workDurationTwelve = $("#workDuration12").val();
            capacityTwelve = $("#capacity12").val();
			 $.ajax({
				    type: "POST",
				    url: "${AddQualityProficiencyDetailUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace />proficiencyDetails": proficiencyDetails,
				    	  "<portlet:namespace />workDurationOne": workDurationOne,
				    	    "<portlet:namespace />capacityOne": capacityOne,
				    	    "<portlet:namespace />workDurationTwo": workDurationTwo,
				    	    "<portlet:namespace />capacityTwo": capacityTwo,
				    	    "<portlet:namespace />workDurationThree": workDurationThree,
				    	    "<portlet:namespace />capacityThree": capacityThree,
				    	    "<portlet:namespace />workDurationFour": workDurationFour,
				    	    "<portlet:namespace />capacityFour": capacityFour,
				    	    "<portlet:namespace />workDurationFive": workDurationFive,
				    	    "<portlet:namespace />capacityFive": capacityFive,
				    	    "<portlet:namespace />workDurationSix": workDurationSix,
				    	    "<portlet:namespace />capacitySix": capacitySix,
				    	    "<portlet:namespace />workDurationSeven": workDurationSeven,
				    	    "<portlet:namespace />capacitySeven": capacitySeven,
				    	    "<portlet:namespace />workDurationEight": workDurationEight,
				    	    "<portlet:namespace />capacityEight": capacityEight,
				    	    "<portlet:namespace />workDurationNine": workDurationNine,
				    	    "<portlet:namespace />capacityNine": capacityNine,
				    	    "<portlet:namespace />workDurationTen": workDurationTen,
				    	    "<portlet:namespace />capacityTen": capacityTen,
				    	    "<portlet:namespace />workDurationEleven": workDurationEleven,
				    	    "<portlet:namespace />capacityEleven": capacityEleven,
				    	    "<portlet:namespace />workDurationTwelve": workDurationTwelve,
				    	    "<portlet:namespace />capacityTwelve": capacityTwelve,
				      		    },
				    success: function (data) { 
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  function addQualityexpertDeclaration(){
			hsraApplicationId=$("#hsraApplicationId").val();
			declarationSignDate = $("#declarationSignDate").val();

			 $.ajax({
				    type: "POST",
				    url: "${AddQualityDeclarationUrl}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	    "<portlet:namespace />declarationSignDate": declarationSignDate,
				      		    },
				    success: function (data) {
				    	var result = data.APP_DATA;
				    	$("#hsraApplicationId").html(result["hsraApplicationId"]);
				    	uploadDocuments('declarationSignBtn',"Signature of Declaration",'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		 	    	},
					 error: function (data) {},
				  });
		}
	  
	  /* Acknowledgement of Medical Practitioner 
		function addAcknowledgementMedicalDetail(){
			acknowledgementMedicalDetailVal = $("#acknowledgementMedicalDetailVal").val();
			acknowledgementMedicalSignature = $("#acknowledgementMedicalSignature img").attr("src");
			acknowledgementMedicalDate = $("#acknowledgementMedicalDate").val();
			 if(acknowledgementMedicalDate !=""){
				$(".addAcknowledgementMedicalDetailTableBox").removeClass("hide");
				$.ajax({
					type : "POST",
					url : "${addAcknowledgementMedicalDetailUrl}",
					data : {
						"<portlet:namespace/>acknowledgementMedicalDetailVal" : acknowledgementMedicalDetailVal,
					},
					async:false,
					success : function(data) {
						/ APPEND ROW JSP INTO TABLE /
						$(".addAcknowledgementMedicalDetailTable").each(function(index) {
							if (index === 0) {
								$(this).append(data);
		
							} else {
								$cloneRow = $(data).clone();
								$cloneRow.find('td').slice(-2).remove();
								$(this).append($cloneRow);
							}
						});
						/ APPEND DATA INTO TABLE /					
						$("<img />", {
		                    "src": acknowledgementMedicalSignature,
		                    "class": "h-100",
		                    "height":"100",
		                    "width":"100"
		                  }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
						  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).append(acknowledgementMedicalDate);

						/ VALUE INCREAMENT /
						acknowledgementMedicalDetailVal++;
						$("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalDetailVal);
						
						/ RESET FORM FIELDS /
						$("#acknowledgementMedicalSignature").html("");
						$("#acknowledgementMedicalDate").val("");
					}
				});
			}else{
				$("#acknowledgementMedicalSignature").focus();
			}
		}
	  */
		function acknowledgementMedicalEditTab(acknowledgementMedicalDetailVal){
			$(".editAcknowledgementMedicalEditTabPopup").modal("show");
			$(".editAcknowledgementMedicalSignature").attr("id" , "editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal);
			$(".editAcknowledgementMedicalDate").attr("id" , "editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal);
			
			acknowledgementMedicalSignature = $(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
			acknowledgementMedicalDate = $(".acknowledgementMedicalDate"+acknowledgementMedicalDetailVal+":first").text().trim();
			
			$("#editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
			$("<img />", {
		        "src": acknowledgementMedicalSignature,
		        "class": "h-100",
		        "height":"100",
		        "width":"100"
		      }).appendTo("#editAcknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
			$("#editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val(acknowledgementMedicalDate);
			
			$(".saveEditAcknowledgementMedicalPopupDataBtn").attr("onclick" , "acknowledgementMedicalEditDataTab("+acknowledgementMedicalDetailVal+")");
		}
		function acknowledgementMedicalEditDataTab(acknowledgementMedicalDetailVal){
			$(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
			editAcknowledgementMedicalSignature = $("#editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
			/ console.log("Image srf from edit popyp "+editAcknowledgementMedicalSignature); /
			$("<img />", {
		        "src": editAcknowledgementMedicalSignature,
		        "class": "h-100 acknowledgementMedicalSignature",
		        "height":"100",
		        "width":"100"
		      }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
			  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).html($("#editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val());

			$(".editAcknowledgementMedicalSignature").val("");
			$(".editAcknowledgementMedicalDate").val("");
		}
		
		function acknowledgementMedicalDetailDeleteData(acknowledgementMedicalDetailValData) {
			  var acknowledgementMedicalCountCounter = $("#acknowledgementMedicalDetailVal").val();
			  $("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalCountCounter - 1);
			  var delRowElement = $(".acknowledgement-medical-row" + acknowledgementMedicalDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(acknowledgementMedicalDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= acknowledgementMedicalCountCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".acknowledgement-medical-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "acknowledgement-medical-row" + prevCounter);
			    rowElement.find("td.acknowledgementMedicalSignature"+i).removeClass("acknowledgementMedicalSignature"+i).addClass("acknowledgementMedicalSignature"+prevCounter);
				rowElement.find("td.acknowledgementMedicalDate"+i).removeClass("acknowledgementMedicalDate"+i).addClass("acknowledgementMedicalDate"+prevCounter);
			    rowElement.find("#acknowledgementMedicalDetailDeleteDataTab").attr('onclick', 'acknowledgementMedicalDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#acknowledgementMedicalEditTab").attr('onclick', 'acknowledgementMedicalEditTab(' +prevCounter+ ')');
			  }
		}
		//  Signature of Applicant's Legal Operator to indicate designation of Medical Practitioner /
	   function addApplicantSignatureDetail(){
			applicantSignatureDetailVal = $("#applicantSignatureDetailVal").val();
			applicantSignaturelegalSignature = $("#applicantSignaturelegalSignature img").attr("src");
			applicantSignatureDate = $("#applicantSignatureDate").val();
			 if(applicantSignatureDate !=""){
				$(".addApplicantSignatureDetailTableBox").removeClass("hide");
				$.ajax({
					type : "POST",
					url : "${addApplicantSignatureDetailUrl}",
					data : {
						"<portlet:namespace/>applicantSignatureDetailVal" : applicantSignatureDetailVal,
					},
					async:false,
					success : function(data) {
						/ APPEND ROW JSP INTO TABLE /
						$(".addApplicantSignatureDetailTable").each(function(index) {
							if (index === 0) {
								$(this).append(data);
		
							} else {
								$cloneRow = $(data).clone();
								$cloneRow.find('td').slice(-2).remove();
								$(this).append($cloneRow);
							}
						});
						/ APPEND DATA INTO TABLE /					
						$("<img />", {
		                    "src": applicantSignaturelegalSignature,
		                    "class": "h-100",
		                    "height":"100",
		                    "width":"100"
		                  }).appendTo(".applicantSignaturelegalSignature" + applicantSignatureDetailVal);
						  $(".applicantSignatureDate" + applicantSignatureDetailVal).append(applicantSignatureDate);
						  
						  addApplicantSignatureDetailData("",applicantSignatureDetailVal,"");

						/ VALUE INCREAMENT /
						applicantSignatureDetailVal++;
						$("#applicantSignatureDetailVal").val(applicantSignatureDetailVal);
						
						/ RESET FORM FIELDS /
						$("#applicantSignaturelegalSignature").html("");
						$("#applicantSignatureDate").val("");
					}
				});
			}else{
				$("#applicantSignaturelegalSignature").focus();
			}
		}
		function applicantSignatureEditTab(applicantSignatureDetailVal){
			$(".editApplicantSignatureEditTabPopup").modal("show");
			$(".editApplicantSignaturelegalSignature").attr("id" , "editApplicantSignaturelegalSignature"+applicantSignatureDetailVal);
			$(".editApplicantSignatureDate").attr("id" , "editApplicantSignatureDate"+applicantSignatureDetailVal);
			
			applicantSignaturelegalSignature = $(".applicantSignaturelegalSignature"+applicantSignatureDetailVal+":first img").attr("src");
			applicantSignatureDate = $(".applicantSignatureDate"+applicantSignatureDetailVal+":first").text().trim();
			
			$("#editApplicantSignaturelegalSignature"+applicantSignatureDetailVal).html("");
			$("<img />", {
		        "src": applicantSignaturelegalSignature,
		        "class": "h-100",
		        "height":"100",
		        "width":"100"
		      }).appendTo("#editApplicantSignaturelegalSignature" + applicantSignatureDetailVal);
			$("#editApplicantSignatureDate"+applicantSignatureDetailVal).val(applicantSignatureDate);
			
			$(".saveEditApplicantSignaturePopupDataBtn").attr("onclick" , "applicantSignatureEditDataTab("+applicantSignatureDetailVal+")");
		}
		function applicantSignatureEditDataTab(applicantSignatureDetailVal){
			addApplicantSignatureDetailData("",applicantSignatureDetailVal,"");
			$(".applicantSignaturelegalSignature"+applicantSignatureDetailVal).html("");
			editApplicantSignaturelegalSignature = $("#editApplicantSignaturelegalSignature"+applicantSignatureDetailVal+":first img").attr("src");
			$("<img />", {
		        "src": editApplicantSignaturelegalSignature,
		        "class": "h-100 applicantSignaturelegalSignature",
		        "height":"100",
		        "width":"100"
		      }).appendTo(".applicantSignaturelegalSignature" + applicantSignatureDetailVal);
			  $(".applicantSignatureDate" + applicantSignatureDetailVal).html($("#editApplicantSignatureDate"+applicantSignatureDetailVal).val());

			$(".editApplicantSignaturelegalSignature").val("");
			$(".editApplicantSignatureDate").val("");
		}
		
		function applicantSignatureDetailDeleteData(applicantSignatureDetailValData) {
			addApplicantSignatureDetailData("",applicantSignatureDetailVal,'deleteApplicant');
			  var applicantSignatureCountCounter = $("#applicantSignatureDetailVal").val();
			  $("#applicantSignatureDetailVal").val(applicantSignatureCountCounter - 1);
			  var delRowElement = $(".applicant-signature-row" + applicantSignatureDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(applicantSignatureDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= applicantSignatureCountCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".applicant-signature-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "applicant-signature-row" + prevCounter);
			    rowElement.find("td.applicantSignaturelegalSignature"+i).removeClass("applicantSignaturelegalSignature"+i).addClass("applicantSignaturelegalSignature"+prevCounter);
				rowElement.find("td.applicantSignatureDate"+i).removeClass("applicantSignatureDate"+i).addClass("applicantSignatureDate"+prevCounter);
			    rowElement.find("#applicantSignatureDetailDeleteDataTab").attr('onclick', 'applicantSignatureDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#applicantSignatureEditTab").attr('onclick', 'applicantSignatureEditTab(' +prevCounter+ ')');
			  }
		}

		/*  Acknowledgement of Medical Practitioner 
		function addAcknowledgementMedicalDetail(){
			acknowledgementMedicalDetailVal = $("#acknowledgementMedicalDetailVal").val();
			acknowledgementMedicalSignature = $("#acknowledgementMedicalSignature img").attr("src");
			acknowledgementMedicalDate = $("#acknowledgementMedicalDate").val();
			 if(acknowledgementMedicalDate !=""){
				$(".addAcknowledgementMedicalDetailTableBox").removeClass("hide");
				$.ajax({
					type : "POST",
					url : "${addAcknowledgementMedicalDetailUrl}",
					data : {
						"<portlet:namespace/>acknowledgementMedicalDetailVal" : acknowledgementMedicalDetailVal,
					},
					async:false,
					success : function(data) {
						/ APPEND ROW JSP INTO TABLE /
						$(".addAcknowledgementMedicalDetailTable").each(function(index) {
							if (index === 0) {
								$(this).append(data);
		
							} else {
								$cloneRow = $(data).clone();
								$cloneRow.find('td').slice(-2).remove();
								$(this).append($cloneRow);
							}
						});
						/ APPEND DATA INTO TABLE /					
						$("<img />", {
		                    "src": acknowledgementMedicalSignature,
		                    "class": "h-100",
		                    "height":"100",
		                    "width":"100"
		                  }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
						  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).append(acknowledgementMedicalDate);
						  
						  
						
						/ VALUE INCREAMENT /
						acknowledgementMedicalDetailVal++;
						$("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalDetailVal);
						
						/ RESET FORM FIELDS /
						$("#acknowledgementMedicalSignature").html("");
						$("#acknowledgementMedicalDate").val("");
					}
				});
			}else{
				$("#acknowledgementMedicalSignature").focus();
			}
		}*/
		function acknowledgementMedicalEditTab(acknowledgementMedicalDetailVal){
			$(".editAcknowledgementMedicalEditTabPopup").modal("show");
			$(".editAcknowledgementMedicalSignature").attr("id" , "editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal);
			$(".editAcknowledgementMedicalDate").attr("id" , "editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal);
			
			acknowledgementMedicalSignature = $(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
			acknowledgementMedicalDate = $(".acknowledgementMedicalDate"+acknowledgementMedicalDetailVal+":first").text().trim();
			
			$("#editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
			$("<img />", {
		        "src": acknowledgementMedicalSignature,
		        "class": "h-100",
		        "height":"100",
		        "width":"100"
		      }).appendTo("#editAcknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
			$("#editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val(acknowledgementMedicalDate);
			
			$(".saveEditAcknowledgementMedicalPopupDataBtn").attr("onclick" , "acknowledgementMedicalEditDataTab("+acknowledgementMedicalDetailVal+")");
		}
		function acknowledgementMedicalEditDataTab(acknowledgementMedicalDetailVal){
			addAcknowledgementMedicalDetailData("",acknowledgementMedicalDetailVal,"")
			$(".acknowledgementMedicalSignature"+acknowledgementMedicalDetailVal).html("");
			editAcknowledgementMedicalSignature = $("#editAcknowledgementMedicalSignature"+acknowledgementMedicalDetailVal+":first img").attr("src");
			/ console.log("Image srf from edit popyp "+editAcknowledgementMedicalSignature); /
			$("<img />", {
		        "src": editAcknowledgementMedicalSignature,
		        "class": "h-100 acknowledgementMedicalSignature",
		        "height":"100",
		        "width":"100"
		      }).appendTo(".acknowledgementMedicalSignature" + acknowledgementMedicalDetailVal);
			  $(".acknowledgementMedicalDate" + acknowledgementMedicalDetailVal).html($("#editAcknowledgementMedicalDate"+acknowledgementMedicalDetailVal).val());

			$(".editAcknowledgementMedicalSignature").val("");
			$(".editAcknowledgementMedicalDate").val("");
		}
		
		function acknowledgementMedicalDetailDeleteData(acknowledgementMedicalDetailValData) {
		   	 addAcknowledgementMedicalDetailData("",acknowledgementMedicalDetailVal,'deleteApplicant')
			  var acknowledgementMedicalCountCounter = $("#acknowledgementMedicalDetailVal").val();
			  $("#acknowledgementMedicalDetailVal").val(acknowledgementMedicalCountCounter - 1);
			  var delRowElement = $(".acknowledgement-medical-row" + acknowledgementMedicalDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(acknowledgementMedicalDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= acknowledgementMedicalCountCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".acknowledgement-medical-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "acknowledgement-medical-row" + prevCounter);
			    rowElement.find("td.acknowledgementMedicalSignature"+i).removeClass("acknowledgementMedicalSignature"+i).addClass("acknowledgementMedicalSignature"+prevCounter);
				rowElement.find("td.acknowledgementMedicalDate"+i).removeClass("acknowledgementMedicalDate"+i).addClass("acknowledgementMedicalDate"+prevCounter);
			    rowElement.find("#acknowledgementMedicalDetailDeleteDataTab").attr('onclick', 'acknowledgementMedicalDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#acknowledgementMedicalEditTab").attr('onclick', 'acknowledgementMedicalEditTab(' +prevCounter+ ')');
			  }
		}
		//  Signature of Applicant's Legal Operator to indicate designation of Medical Practitioner /
	/*   function addApplicantSignatureDetail(){
			applicantSignatureDetailVal = $("#applicantSignatureDetailVal").val();
			applicantSignaturelegalSignature = $("#applicantSignaturelegalSignature img").attr("src");
			applicantSignatureDate = $("#applicantSignatureDate").val();
			 if(applicantSignatureDate !=""){
				$(".addApplicantSignatureDetailTableBox").removeClass("hide");
				$.ajax({
					type : "POST",
					url : "${addApplicantSignatureDetailUrl}",
					data : {
						"<portlet:namespace/>applicantSignatureDetailVal" : applicantSignatureDetailVal,
					},
					async:false,
					success : function(data) {
						/ APPEND ROW JSP INTO TABLE /
						$(".addApplicantSignatureDetailTable").each(function(index) {
							if (index === 0) {
								$(this).append(data);
		
							} else {
								$cloneRow = $(data).clone();
								$cloneRow.find('td').slice(-2).remove();
								$(this).append($cloneRow);
							}
						});
						/ APPEND DATA INTO TABLE /					
						$("<img />", {
		                    "src": applicantSignaturelegalSignature,
		                    "class": "h-100",
		                    "height":"100",
		                    "width":"100"
		                  }).appendTo(".applicantSignaturelegalSignature" + applicantSignatureDetailVal);
						  $(".applicantSignatureDate" + applicantSignatureDetailVal).append(applicantSignatureDate);

						/ VALUE INCREAMENT /
						applicantSignatureDetailVal++;
						$("#applicantSignatureDetailVal").val(applicantSignatureDetailVal);
						
						/ RESET FORM FIELDS /
						$("#applicantSignaturelegalSignature").html("");
						$("#applicantSignatureDate").val("");
					}
				});
			}else{
				$("#applicantSignaturelegalSignature").focus();
			}
		} */
		function applicantSignatureEditTab(applicantSignatureDetailVal){
			$(".editApplicantSignatureEditTabPopup").modal("show");
			$(".editApplicantSignaturelegalSignature").attr("id" , "editApplicantSignaturelegalSignature"+applicantSignatureDetailVal);
			$(".editApplicantSignatureDate").attr("id" , "editApplicantSignatureDate"+applicantSignatureDetailVal);
			
			applicantSignaturelegalSignature = $(".applicantSignaturelegalSignature"+applicantSignatureDetailVal+":first img").attr("src");
			applicantSignatureDate = $(".applicantSignatureDate"+applicantSignatureDetailVal+":first").text().trim();
			
			$("#editApplicantSignaturelegalSignature"+applicantSignatureDetailVal).html("");
			$("<img />", {
		        "src": applicantSignaturelegalSignature,
		        "class": "h-100",
		        "height":"100",
		        "width":"100"
		      }).appendTo("#editApplicantSignaturelegalSignature" + applicantSignatureDetailVal);
			$("#editApplicantSignatureDate"+applicantSignatureDetailVal).val(applicantSignatureDate);
			
			$(".saveEditApplicantSignaturePopupDataBtn").attr("onclick" , "applicantSignatureEditDataTab("+applicantSignatureDetailVal+")");
		}
		function applicantSignatureEditDataTab(applicantSignatureDetailVal){
			$(".applicantSignaturelegalSignature"+applicantSignatureDetailVal).html("");
			editApplicantSignaturelegalSignature = $("#editApplicantSignaturelegalSignature"+applicantSignatureDetailVal+":first img").attr("src");
			$("<img />", {
		        "src": editApplicantSignaturelegalSignature,
		        "class": "h-100 applicantSignaturelegalSignature",
		        "height":"100",
		        "width":"100"
		      }).appendTo(".applicantSignaturelegalSignature" + applicantSignatureDetailVal);
			  $(".applicantSignatureDate" + applicantSignatureDetailVal).html($("#editApplicantSignatureDate"+applicantSignatureDetailVal).val());

			$(".editApplicantSignaturelegalSignature").val("");
			$(".editApplicantSignatureDate").val("");
		}
		
		function applicantSignatureDetailDeleteData(applicantSignatureDetailValData) {
			  var applicantSignatureCountCounter = $("#applicantSignatureDetailVal").val();
			  $("#applicantSignatureDetailVal").val(applicantSignatureCountCounter - 1);
			  var delRowElement = $(".applicant-signature-row" + applicantSignatureDetailValData); 
			  delRowElement.remove();
			  var j = parseInt(applicantSignatureDetailValData) + 1;
			  // Update the row numbers and IDs for each row
			  for (var i = j; i <= applicantSignatureCountCounter; i++) {
			    var prevCounter = i - 1;
			    var rowElement = $(".applicant-signature-row" + i);
			    // Update the IDs for relevant elementsd
			    rowElement.attr("class", "applicant-signature-row" + prevCounter);
			    rowElement.find("td.applicantSignaturelegalSignature"+i).removeClass("applicantSignaturelegalSignature"+i).addClass("applicantSignaturelegalSignature"+prevCounter);
				rowElement.find("td.applicantSignatureDate"+i).removeClass("applicantSignatureDate"+i).addClass("applicantSignatureDate"+prevCounter);
			    rowElement.find("#applicantSignatureDetailDeleteDataTab").attr('onclick', 'applicantSignatureDetailDeleteData(' +prevCounter+ ')');
			    rowElement.find("#applicantSignatureEditTab").attr('onclick', 'applicantSignatureEditTab(' +prevCounter+ ')');
			  }
		}	
/* save the detail of BO field*/
	function unsealedSourcesDetailData(counter,docUploadCounter) {
		if (counter != "") {
			/*hidden field*/
			unsealedSourcesDetailId = $("#unsealedSourcesDetailId" + counter).val();
			/*forms field value*/
			unsealedSourcesRadionuclide = $("#editUnsealedSourcesRadionuclide"+counter).val();
			unsealedSourcesActivity = $("#editUnsealedSourcesActivity"+counter).val();
			unsealedSourcesTotalYear = $("#editUnsealedSourcesTotalYear"+counter).val();
			unsealedSourcesUse = $("#editUnsealedSourcesUse"+counter).val();
		} else if(docUploadCounter!=null) {
			/*counter value*/
			unsealedSourcesRadionuclide = $("#unsealedSourcesRadionuclide").val();
			unsealedSourcesActivity = $("#unsealedSourcesActivity").val();
			unsealedSourcesTotalYear = $("#unsealedSourcesTotalYear").val();
			unsealedSourcesUse = $("#unsealedSourcesUse").val();
			unsealedSourcesDetailId = $("#unsealedSourcesDetailId").val();
		}
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfUnsealed = $("#unsealedSourcesDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${unsealedSourcesDetailDataAddFormUrl}",
					data : {
						"<portlet:namespace/>unsealedSourcesRadionuclide" : unsealedSourcesRadionuclide,
						"<portlet:namespace/>unsealedSourcesActivity" : unsealedSourcesActivity,
						"<portlet:namespace/>unsealedSourcesTotalYear" : unsealedSourcesTotalYear,
						"<portlet:namespace/>unsealedSourcesUse" : unsealedSourcesUse,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>unsealedSourcesDetailId" : unsealedSourcesDetailId,
						"<portlet:namespace/>counterOfUnsealed" : counterOfUnsealed,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#unsealedSourcesDetailId"+counter).val(result["unsealedSourcesId"]);
						uploadDocuments('unsealedCertiCopy',"Unsealed Certificate Copy"+counter,'<%=signatureUploadInHsraFormUrl%>',"", "Unsealed Certificate Copy");
					},
					error : function(data) {
					}
				});
	}
	function unsealedSourcesDetailDataDelete(counter) {
		counterOfUnsealed = $("#unsealedSourcesDetailId"+counter).val();
		$
				.ajax({
					type : "POST",
					url : "${unsealedSourcesDetailDataDeleteUrl}",
					data : {
						"<portlet:namespace/>counterOfUnsealed" : counterOfUnsealed,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function sealedSourcesDetailData(counter,docUploadCounter) {
		if (counter != "") {
			/*hidden field*/
			sealedSourcesDetailId = $("#sealedSourcesDetailId" + counter).val();
			/*forms field value*/
			sealedSourcesRadionuclide = $("#editSealedSourcesRadionuclide"+ counter).val();
			sealedSourcesMaxActivity = $("#editSealedSourcesMaxActivity"+ counter).val();
			sealedSourcesActivityDate = $("#editSealedSourcesActivityDate"+ counter).val();
			sealedSourcesCategories = $("#editSealedSourcesCategories"+ counter).val();
			sealedSourcesUse = $("#editSealedSourcesUse"+ counter).val();
		} else if(docUploadCounter!=null){
			/*counter value*/
			sealedSourcesRadionuclide = $("#sealedSourcesRadionuclide").val();
			sealedSourcesMaxActivity = $("#sealedSourcesMaxActivity").val();
			sealedSourcesActivityDate = $("#sealedSourcesActivityDate").val();
			sealedSourcesCategories = $("#sealedSourcesCategories").val();
			sealedSourcesUse = $("#sealedSourcesUse").val();
			sealedSourcesDetailId = $("#sealedSourcesDetailId").val();
		}
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfSealed = $("#sealedSourcesDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${sealedSourcesDetailDataAddFormUrl}",
					data : {
						"<portlet:namespace/>sealedSourcesRadionuclide" : sealedSourcesRadionuclide,
						"<portlet:namespace/>sealedSourcesMaxActivity" : sealedSourcesMaxActivity,
						"<portlet:namespace/>sealedSourcesActivityDate" : sealedSourcesActivityDate,
						"<portlet:namespace/>sealedSourcesCategories" : sealedSourcesCategories,
						"<portlet:namespace/>sealedSourcesUse" : sealedSourcesUse,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>sealedSourcesDetailId" : sealedSourcesDetailId,
						"<portlet:namespace/>counterOfSealed" : counterOfSealed,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#sealedSourcesDetailId"+counter).val(result["sealedSourcesId"]);
						uploadDocuments('sealedSourceRadDevice',"SealedSource Certificate Copy"+counter,'<%=signatureUploadInHsraFormUrl%>',"", "SealedSource Certificate Copy");
					},
					error : function(data) {
					}
				});
	}
	function sealedSourcesDetailDataDelete(counter) {
		counterOfSealed = $("#sealedSourcesDetailId"+counter).val();
		$
				.ajax({
					type : "POST",
					url : "${sealedSourcesDetailDataDeleteUrl}",
					data : {
						"<portlet:namespace/>counterOfSealed" : counterOfSealed,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function radiationDevicesDetail(counter,docUploadCounter) {
		if (counter != "") {
			/*hidden field*/
			radiationDevicesDetailId = $("#radiationDevicesDetailId" + counter).val();
			/*forms field value*/
			radiationDevicesRadio = $("#editRadiationDevicesRadio"+ counter).val();
			radiationDevicesMaxActivity = $("#editRadiationDevicesMaxActivity"+ counter).val();
			radiationDevicesManufacturer = $("#editRadiationDevicesManufacturer"+ counter).val();
			radiationDevicesName = $("#editRadiationDevicesName"+ counter).val();
			radiationDevicesModelNo = $("#editRadiationDevicesModelNo"+ counter).val();
			radiationDevicesNumber = $("#editRadiationDevicesNumber"+ counter).val();
			radiationDevicesUse = $("#editRadiationDevicesUse"+ counter).val();
		}  else if(docUploadCounter!=null){
			/*counter value*/
			radiationDevicesRadio = $("#radiationDevicesRadio").val();
			radiationDevicesMaxActivity = $("#radiationDevicesMaxActivity").val();
			radiationDevicesManufacturer = $("#radiationDevicesManufacturer").val();
			radiationDevicesName = $("#radiationDevicesName").val();
			radiationDevicesModelNo = $("#radiationDevicesModelNo").val();
			radiationDevicesNumber = $("#radiationDevicesNumber").val();
			radiationDevicesUse = $("#radiationDevicesUse").val();
			radiationDevicesDetailId = $("#radiationDevicesDetailId").val();
		}
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfRadiation = $("#radiationDevicesDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${radiationDevicesDetailAddFormUrl}",
					data : {
						"<portlet:namespace/>radiationDevicesRadio" : radiationDevicesRadio,
						"<portlet:namespace/>radiationDevicesMaxActivity" : radiationDevicesMaxActivity,
						"<portlet:namespace/>radiationDevicesManufacturer" : radiationDevicesManufacturer,
						"<portlet:namespace/>radiationDevicesName" : radiationDevicesName,
						"<portlet:namespace/>radiationDevicesModelNo" : radiationDevicesModelNo,
						"<portlet:namespace/>radiationDevicesNumber" : radiationDevicesNumber,
						"<portlet:namespace/>radiationDevicesUse" : radiationDevicesUse,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>radiationDevicesDetailId" : radiationDevicesDetailId,
						"<portlet:namespace/>counterOfRadiation" : counterOfRadiation,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#radiationDevicesDetailId"+counter).val(result["radiationDeviceId"]);
						uploadDocuments('radDeviceCeritificateCopy',"RadDevice Certificate Copy"+counter,'<%=signatureUploadInHsraFormUrl%>',"", "RadDevice Certificate Copy");
					},
					error : function(data) {
					}
				});
	}
	
	function radiationDevicesDetailDelete(counter) {
		radiationDevicesDetailId = $("#radiationDevicesDetailId"+counter).val();
		$
				.ajax({
					type : "POST",
					url : "${radiationDevicesDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>radiationDevicesDetailId" : radiationDevicesDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	/*save the value in service.xml also  */
	function medicalPractitionerDetailData(counter) {
		if (counter != "") {
			/*hidden field*/
			medicalPractitionerDetailId = $("#medicalPractitionerDetailId" + counter).val();
			/*forms field value*/
			medicalPractitionerName = $("#editMedicalPractitionerName"+ counter).val();
			medicalPractitionerAddress = $("#editMedicalPractitionerAddress"+ counter).val();
			medicalPractitionerTelephone = $("#editMedicalPractitionerTelephone"+ counter).val();
			medicalPractitionerFax = $("#editMedicalPractitionerFax"+ counter).val();
			medicalPractitionerEmail = $("#editMedicalPractitionerEmail"+ counter).val();
			medicalPractitionerLicenceNo = $("#editMedicalPractitionerLicenceNo"+ counter).val();
		} else {
			/*counter value*/
			medicalPractitionerName = $("#medicalPractitionerName").val();
			medicalPractitionerAddress = $("#medicalPractitionerAddress").val();
			medicalPractitionerTelephone = $("#medicalPractitionerTelephone").val();
			medicalPractitionerFax = $("#medicalPractitionerFax").val();
			medicalPractitionerEmail = $("#medicalPractitionerEmail").val();
			medicalPractitionerLicenceNo = $("#medicalPractitionerLicenceNo").val();
			medicalPractitionerDetailId = $("#medicalPractitionerDetailId").val();
		    }
			hsraApplicationId = $("#hsraApplicationId").val();
			counterOfPractitioner= $("#medicalPractitionerDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${medicalPractitionerDetailAddFormUrl}",
					data : {
						"<portlet:namespace/>medicalPractitionerName" : medicalPractitionerName,
						"<portlet:namespace/>medicalPractitionerAddress" : medicalPractitionerAddress,
						"<portlet:namespace/>medicalPractitionerTelephone" : medicalPractitionerTelephone,
						"<portlet:namespace/>medicalPractitionerFax" : medicalPractitionerFax,
						"<portlet:namespace/>medicalPractitionerEmail" : medicalPractitionerEmail,
						"<portlet:namespace/>medicalPractitionerLicenceNo" : medicalPractitionerLicenceNo,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>medicalPractitionerDetailId" : medicalPractitionerDetailId,
						"<portlet:namespace/>counterOfPractitioner" : counterOfPractitioner,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#medicalPractitionerDetailId"+counter).val(result["practitionerDetailId"]);
					},
					error : function(data) {
					}
				});
	}
	function medicalPractitionerDetailDelete(counter) {
		medicalPractitionerDetailId = $("#medicalPractitionerDetailId"+counter).val();
		$
				.ajax({
					type : "POST",
					url : "${medicalPractitionerDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>medicalPractitionerDetailId" : medicalPractitionerDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function sourcesDetailData(counter) {
		if (counter != "") {
			/*hidden field*/
			sourcesDetailId = $("#sourcesDetailId" + counter).val();
			/*forms field value*/
			sourceIdentification = $("#editSourceIdentification"+ counter).val();
			stateActivity = $("#editStateActivity"+ counter).val();
		} else {
			/*counter value*/
		    sourceIdentification = $("#sourceIdentification").val();
			stateActivity = $("#stateActivity").val();
			sourcesDetailId = $("#sourcesDetailId").val();
		    }
			hsraApplicationId = $("#hsraApplicationId").val();
			counterOfSource= $("#sourcesDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${sourcesDetailDataAddFormUrl}",
					data : {
						"<portlet:namespace/>sourceIdentification" : sourceIdentification,
						"<portlet:namespace/>stateActivity" : stateActivity,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>sourcesDetailId" : sourcesDetailId,
						"<portlet:namespace/>counterOfSource" : counterOfSource,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#sourcesDetailId"+counter).val(result["sourcesDetailId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function sourcesDetailDataDelete(counter) {
		sourcesDetailId = $("#sourcesDetailId" + counter).val();
		$
				.ajax({
					type : "POST",
					url : "${sourcesDetailDataDeleteUrl}",
					data : {
						"<portlet:namespace/>sourcesDetailId" : sourcesDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function radionuclideDetailData(counter) {
		if (counter != "") {
			/*hidden field*/
			radionuclideDetailId = $("#radionuclideDetailId" + counter).val();
			/*forms field value*/
			radionuclideDetails = $("#editRadionuclideDetails"+ counter).val();
			activityDetails = $("#editActivityDetails"+ counter).val();
			activityDate = $("#editActivityDate"+ counter).val();
			chemicalDetailsForm = $("#editChemicalDetailsForm"+ counter).val();
			serialNo = $("#editSerialNo"+ counter).val();
	        radionuclideLocation = $("#editRadionuclideLocation"+ counter).val();
		} else {
			/*counter value*/
			radionuclideDetails = $("#radionuclideDetails").val();
			activityDetails = $("#activityDetails").val();
			activityDate = $("#activityDate").val();
			chemicalDetailsForm = $("#chemicalDetailsForm").val();
			serialNo = $("#serialNo").val();
	        radionuclideLocation = $("#radionuclideLocation").val();
	        radionuclideDetailId = $("#radionuclideDetailId").val();
		    }
			hsraApplicationId = $("#hsraApplicationId").val();
			counterOfRadionuclideDetail = $("#radionuclideDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${radionuclideDetailDataUrl}",
					data : {
						"<portlet:namespace/>radionuclideDetails" : radionuclideDetails,
						"<portlet:namespace/>activityDetails" : activityDetails,
						"<portlet:namespace/>activityDate" : activityDate,
						"<portlet:namespace/>chemicalDetailsForm" : chemicalDetailsForm,
						"<portlet:namespace/>serialNo" : serialNo,
						"<portlet:namespace/>radionuclideLocation" : radionuclideLocation,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>radionuclideDetailId" : radionuclideDetailId,
						"<portlet:namespace/>counterOfRadionuclideDetail" : counterOfRadionuclideDetail,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#radionuclideDetailId"+counter).val(result["radionuclideId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function radionuclideDetailDelete(counter) {
		radionuclideDetailId = $("#radionuclideDetailId" + counter).val();;
		$
				.ajax({
					type : "POST",
					url : "${radionuclideDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>radionuclideDetailId" : radionuclideDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function alternateRsoData(counter) {
		if (counter != "") {
			/*hidden field*/
		alternateRsoDetailId = $("#alternateRsoDetailId" + counter).val();
			/*forms field value*/
		alternateRsoName = $("#editAlternateRsoName"+ counter).val();
		alternateRsoTitle = $("#editAlternateRsoTitle"+ counter).val();
		alternateRsoTelephone = $("#editAlternateRsoTelephone"+ counter).val();
		alternateRsoExt = $("#editAlternateRsoExt"+ counter).val();
		alternateRsoFax = $("#editAlternateRsoFax"+ counter).val();
		alternateRsoEmailAdd = $("#editAlternateRsoEmailAdd"+ counter).val();
		} else {
			/*counter value*/
		alternateRsoName = $("#alternateRsoName").val();
		alternateRsoTitle = $("#alternateRsoTitle").val();
		alternateRsoTelephone = $("#alternateRsoTelephone").val();
		alternateRsoExt = $("#alternateRsoExt").val();
		alternateRsoFax = $("#alternateRsoFax").val();
		alternateRsoEmailAdd = $("#alternateRsoEmailAdd").val();
		alternateRsoDetailId = $("#alternateRsoDetailId").val();
		    }
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfAlternateRsoDetail = $("#alternateRsoDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${alternateRsoDataUrl}",
					data : {
						"<portlet:namespace/>alternateRsoName" : alternateRsoName,
						"<portlet:namespace/>alternateRsoTitle" : alternateRsoTitle,
						"<portlet:namespace/>alternateRsoTelephone" : alternateRsoTelephone,
						"<portlet:namespace/>alternateRsoExt" : alternateRsoExt,
						"<portlet:namespace/>alternateRsoFax" : alternateRsoFax,
						"<portlet:namespace/>alternateRsoEmailAdd" : alternateRsoEmailAdd,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>alternateRsoDetailId" : alternateRsoDetailId,
						"<portlet:namespace/>counterOfAlternateRsoDetail" : counterOfAlternateRsoDetail,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#alternateRsoDetailId"+counter).val(result["alternateRsoId"]);
					},
					error : function(data) {
					}
				});
	}
	function alternateRsoDetailDelete(counter) {
		alternateRsoDetailId = $("#alternateRsoDetailId" + counter).val();;
		$
				.ajax({
					type : "POST",
					url : "${alternateRsoDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>alternateRsoDetailId" : alternateRsoDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function qualifedExpertData(counter) {
		if (counter != "") {
			/*hidden field*/
		qualifedExpertDetailId = $("#qualifedExpertDetailId" + counter).val();
			/*forms field value*/
		qualifedName = $("#editQualifedName"+ counter).val();
		qualifedTitle = $("#editQualifedTitle"+ counter).val();
		qualifedTelephone = $("#editQualifedTelephone"+ counter).val();
		qualifedExt = $("#editQualifedExt"+ counter).val();
		qualifedFax = $("#editQualifedFax"+ counter).val();
		qualifedEmailAdd = $("#editQualifedEmailAdd"+ counter).val();
		qualifedRegistrationNo = $("#editQualifedRegistrationNo"+ counter).val();
		qualifedExpirationDate = $("#editQualifedExpirationDate"+ counter).val();
		} else {
			/*counter value*/
		qualifedName = $("#qualifedName").val();
		qualifedTitle = $("#qualifedTitle").val();
		qualifedTelephone = $("#qualifedTelephone").val();
		qualifedExt = $("#qualifedExt").val();
		qualifedFax = $("#qualifedFax").val();
		qualifedEmailAdd = $("#qualifedEmailAdd").val();
		qualifedRegistrationNo = $("#qualifedRegistrationNo").val();
		qualifedExpirationDate = $("#qualifedExpirationDate").val();
		qualifedExpertDetailId = $("#qualifedExpertDetailId").val();
		    }
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfQualifedExpertDetail = $("#qualifedExpertDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${qualifedExpertDataUrl}",
					data : {
						"<portlet:namespace/>qualifedName" : qualifedName,
						"<portlet:namespace/>qualifedTitle" : qualifedTitle,
						"<portlet:namespace/>qualifedTelephone" : qualifedTelephone,
						"<portlet:namespace/>qualifedExt" : qualifedExt,
						"<portlet:namespace/>qualifedFax" : qualifedFax,
						"<portlet:namespace/>qualifedEmailAdd" : qualifedEmailAdd,
						"<portlet:namespace/>qualifedRegistrationNo" : qualifedRegistrationNo,
						"<portlet:namespace/>qualifedExpirationDate" : qualifedExpirationDate,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>qualifedExpertDetailId" : qualifedExpertDetailId,
						"<portlet:namespace/>counterOfQualifedExpertDetail" : counterOfQualifedExpertDetail,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#qualifedExpertDetailId"+counter).val(result["qualifiedExpertId"]);
					},
					error : function(data) {
					}
				});
	}
	function qualifedExpertDetailDelete(counter) {
		alternateRsoDetailId = $("#alternateRsoDetailId" + counter).val();;
		$
				.ajax({
					type : "POST",
					url : "${qualifedExpertDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>alternateRsoDetailId" : alternateRsoDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function alternateRsoOneData(counter) {
		if (counter != "") {
			/*hidden field*/
		alternateRsoOneDetailId = $("#alternateRsoOneDetailId" + counter).val();
			/*forms field value*/
		alternateRsoOneName = $("#editAlternateRsoOneName"+ counter).val();
		alternateRsoOneTitle = $("#editAlternateRsoOneTitle"+ counter).val();
		alternateRsoOneTelephone = $("#editAlternateRsoOneTelephone"+ counter).val();
		alternateRsoOneExt = $("#editAlternateRsoOneExt"+ counter).val();
		alternateRsoOneFax = $("#editAlternateRsoOneFax"+ counter).val();
		alternateRsoOneEmailAdd = $("#editAlternateRsoOneEmailAdd"+ counter).val();
		} else {
			/*counter value*/
		alternateRsoOneName = $("#alternateRsoOneName").val();
		alternateRsoOneTitle = $("#alternateRsoOneTitle").val();
		alternateRsoOneTelephone = $("#alternateRsoOneTelephone").val();
		alternateRsoOneExt = $("#alternateRsoOneExt").val();
		alternateRsoOneFax = $("#alternateRsoOneFax").val();
		alternateRsoOneEmailAdd = $("#alternateRsoOneEmailAdd").val();
		alternateRsoOneDetailId = $("#alternateRsoOneDetailId").val();
		    }
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfAlternateRsoOne = $("#alternateRsoOneDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${alternateRsoOneDataUrl}",
					data : {
						"<portlet:namespace/>alternateRsoOneName" : alternateRsoOneName,
						"<portlet:namespace/>alternateRsoOneTitle" : alternateRsoOneTitle,
						"<portlet:namespace/>alternateRsoOneTelephone" : alternateRsoOneTelephone,
						"<portlet:namespace/>alternateRsoOneExt" : alternateRsoOneExt,
						"<portlet:namespace/>alternateRsoOneFax" : alternateRsoOneFax,
						"<portlet:namespace/>alternateRsoOneEmailAdd" : alternateRsoOneEmailAdd,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>alternateRsoOneDetailId" : alternateRsoOneDetailId,
						"<portlet:namespace/>counterOfAlternateRsoOne" : counterOfAlternateRsoOne,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#alternateRsoOneDetailId"+counter).val(result["alternateRsoOneId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function alternateRsoOneDataDelete (counter) {
		alternateRsoDetailId = $("#alternateRsoDetailId" + counter).val();;
		$
				.ajax({
					type : "POST",
					url : "${alternateRsoOneDataDeleteUrl}",
					data : {
						"<portlet:namespace/>alternateRsoDetailId" : alternateRsoDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	
	function genEquipmentData(counter,docUploadCounter) {
		if (counter != "") {
			/*hidden field*/
		genEquipmentDetailId = $("#genEquipmentDetailId" + counter).val();
			/*forms field value*/
		manufacturerEquipment = $("#editManufacturerEquipment"+ counter).val();
		equipmentModel = $("#editEquipmentModel"+ counter).val();
		equipmentSerial = $("#editEquipmentSerial"+ counter).val();
		operatingPotential = $("#editOperatingPotential"+ counter).val();
		natureEquipment = $("#editNatureEquipment"+ counter).val();
		radiationGeneratingLoc = $("#editRadiationGeneratingLoc"+ counter).val();
		equipmentModels = $("#editEquipmentModels"+ counter).val();
		equipmentStatusDetail = $("#editEquipmentStatusDetail"+ counter).val();
		equipmentDate = $("#equipmentDate"+ counter).val();
		/*this is signature in this*/
		/* legalPersonSignature = $("#legalPersonSignature img").attr("src"); */

		} else if (docUploadCounter!="") {
			/*counter value*/
		manufacturerEquipment = $("#manufacturerEquipment").val();
		equipmentModel = $("#equipmentModel").val();
		equipmentSerial = $("#equipmentSerial").val();
		operatingPotential = $("#operatingPotential").val();
		natureEquipment = $("#natureEquipment").val();
		radiationGeneratingLoc = $("#radiationGeneratingLoc").val();
		equipmentModels = $("#equipmentModels").val();
		equipmentStatusDetail = $("#equipmentStatusDetail").val();
		equipmentDate = $("#equipmentDate").val();
		/* legalPersonSignature = $("#legalPersonSignature img").attr("src"); */
		genEquipmentDetailId = $("#genEquipmentDetailId").val();
		    }
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfEquipmentDetail= $("#genEquipmentDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${genEquipmentDataUrl}",
					data : {
						"<portlet:namespace/>manufacturerEquipment" : manufacturerEquipment,
						"<portlet:namespace/>equipmentModel" : equipmentModel,
						"<portlet:namespace/>equipmentSerial" : equipmentSerial,
						"<portlet:namespace/>operatingPotential" : operatingPotential,
						"<portlet:namespace/>natureEquipment" : natureEquipment,
						"<portlet:namespace/>radiationGeneratingLoc" : radiationGeneratingLoc,
						"<portlet:namespace/>equipmentModels" : equipmentModels,
						"<portlet:namespace/>equipmentStatusDetail" : equipmentStatusDetail,
						"<portlet:namespace/>equipmentDate" : equipmentDate,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>genEquipmentDetailId" : genEquipmentDetailId,
						"<portlet:namespace/>counterOfEquipmentDetail" : counterOfEquipmentDetail,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#genEquipmentDetailId"+counter).val(result["equipmentDetailId"]);
						uploadDocuments('legalPersonSignatureBtn',"Signature of Equip"+counter,'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
					},
					error : function(data) {
					}
				});
	}
	
	function genEquipmentDetailDelete(counter) {
		genEquipmentDetailId = $("#genEquipmentDetailId" + counter).val();;
		$
				.ajax({
					type : "POST",
					url : "${genEquipmentDetailDeleteUrl}",
					data : {
						"<portlet:namespace/>genEquipmentDetailId" : genEquipmentDetailId,
					},
					success : function(data) {
					},
					error : function(data) {
					}
				});
	}
	function qualifedExpertOneDetail(counter) {
		if (counter != "") {
			/*hidden field*/
		qualifedExpertOneDetailId = $("#qualifedExpertOneDetailId" + counter).val();
			/*forms field value*/
		qualifedOneName = $("#qualifedOneName").val();
		qualifedOneTitle = $("#qualifedOneTitle").val();
		qualifedOneTelephone = $("#qualifedOneTelephone").val();
		qualifedOneExt = $("#qualifedOneExt").val();
		qualifedOneFax = $("#qualifedOneFax").val();
		qualifedOneEmailAdd = $("#qualifedOneEmailAdd").val();
		qualifedOneRegistrationNo = $("#qualifedOneRegistrationNo").val();
		qualifedOneExpirationDate = $("#qualifedOneExpirationDate").val();
		} else {
			/*counter value*/
		qualifedOneName = $("#qualifedOneName").val();
		qualifedOneTitle = $("#qualifedOneTitle").val();
		qualifedOneTelephone = $("#qualifedOneTelephone").val();
		qualifedOneExt = $("#qualifedOneExt").val();
		qualifedOneFax = $("#qualifedOneFax").val();
		qualifedOneEmailAdd = $("#qualifedOneEmailAdd").val();
		qualifedOneRegistrationNo = $("#qualifedOneRegistrationNo").val();
		qualifedOneExpirationDate = $("#qualifedOneExpirationDate").val();
		qualifedExpertOneDetailId = $("#qualifedExpertOneDetailId").val();
		    }
		hsraApplicationId = $("#hsraApplicationId").val();
		counterOfQualifedExpertOneDetail= $("#qualifedExpertOneDetailVal").val();
		$
				.ajax({
					type : "POST",
					url : "${qualifedExpertOneDetailUrl}",
					data : {
						"<portlet:namespace/>qualifedOneName" : qualifedOneName,
						"<portlet:namespace/>qualifedOneTitle" : qualifedOneTitle,
						"<portlet:namespace/>qualifedOneTelephone" : qualifedOneTelephone,
						"<portlet:namespace/>qualifedOneExt" : qualifedOneExt,
						"<portlet:namespace/>qualifedOneFax" : qualifedOneFax,
						"<portlet:namespace/>qualifedOneEmailAdd" : qualifedOneEmailAdd,
						"<portlet:namespace/>qualifedOneRegistrationNo" : qualifedOneRegistrationNo,
						"<portlet:namespace/>qualifedOneExpirationDate" : qualifedOneExpirationDate,
						"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
						"<portlet:namespace/>qualifedExpertOneDetailId" : qualifedExpertOneDetailId,
						"<portlet:namespace/>counterOfQualifedExpertOneDetail" : counterOfQualifedExpertOneDetail,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#qualifedExpertOneDetailId"+counter).val(result["qualifedExpertOneId"]);
					},
					error : function(data) {
					}
				});
	}
	
	 function radiationSectionOneHsraApplication(){
			hsraApplicationId=$("#hsraApplicationId").val();
			currentAuthorizationNo=$("#currentAuthorizationNo").val();
			amendmentReason=$("#amendmentReason").val();
			applicationType=$("input[name='applicationType']:checked").val();
			 $.ajax({
				    type: "POST",
				    url: "${hsraRadiationSectionOne}",
				    data: {
				    	
				    	  "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
				    	  "<portlet:namespace/>currentAuthorizationNo": currentAuthorizationNo,
				    	  "<portlet:namespace/>amendmentReason": amendmentReason,
				    	  "<portlet:namespace/>applicationType": applicationType,
				      		    },
				    success: function (data) { 

		 	    	},
					 error: function (data) {
				    },
				  });
		}
	 
	 
	 /* wizard js */
	 function showSelectedCategoryForm(){
	 	$(".medical-practices, .industrial-radiography, .vetrinary-nuclear-medicine, .other-industries, .gauges, .petroleum-exploration, .serivicing, .manufacturing").addClass("hide");
	    var selectedSpecificApplicableType = new Array();
	    $("#specificApplicableType").find(".wizard-card.active .wizard-title").each(function () {
	    	selectedSpecificApplicableType.push($(this).html());
	    });
	    applicantType = $("#applicantTypeVal").val();
	    if(applicantType == "Users of Radiation Sources"){
	    	if(selectedSpecificApplicableType.includes("(a)Medical Practices")){
		    	$(".medical-practices").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(b)Industrial Radiography")){
		    	$(".industrial-radiography").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(c)Veterinary Nuclear Medicine")){
		    	$(".vetrinary-nuclear-medicine").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(d)Other Industries that use Nuclear Material")){
		    	$(".other-industries").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(e)Gauges (Fixed &amp; Portable)")){
		    	$(".gauges").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(f)Petroleum Exploration (Well Logging)")){
		    	$(".petroleum-exploration").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(g)Servicing")){
		    	$(".serivicing").removeClass("hide");
		    }
		    if(selectedSpecificApplicableType.includes("(h)Manufacturing")){
		    	$(".manufacturing").removeClass("hide");
		    }
		    var selectedQualifiedAreaType = new Array();
		    $("#qualifiedAreaType").find(".wizard-card.active .wizard-title").each(function () {
		    	selectedQualifiedAreaType.push($(this).html());
		    });
	    }
	    if(applicantType == "Service Providers"){
	    	$(".serivicing").removeClass("hide");
	    }
	    
 }
 function activeSelectForm(){
	applicantType = $("#applicantTypeVal").val();
	$(".tab-pane").removeClass("active");
	$("#side-tabs .nav-link").removeClass("active");
	$("#side-tabs .nav-link").addClass("disabled");
	if(applicantType == "Users of Radiation Sources"){
		$(".nuclear-safety-forms .tab-pane:first").addClass("active");
		$(".nuclear-safety-forms .nav-link:first").addClass("active");
		$(".nuclear-safety-forms .nav-link:first").removeClass("disabled");
	}else if(applicantType == "Service Providers"){
		$(".nuclear-safety-forms .tab-pane:first").addClass("active");
		$(".nuclear-safety-forms .nav-link:first").addClass("active");
		$(".nuclear-safety-forms .nav-link:first").removeClass("disabled");
	}else if(applicantType == "Brokers"){
		$(".broker-registration-forms .tab-pane:first").addClass("active");
		$(".broker-registration-forms .nav-link:first").addClass("active");
		$(".broker-registration-forms .nav-link:first").removeClass("disabled");
	}else if(applicantType == "Qualified Experts"){
		$(".qualified-expert-forms .tab-pane:first").addClass("active");
		$(".qualified-expert-forms .nav-link:first").addClass("active");
		$(".qualified-expert-forms .nav-link:first").removeClass("disabled");
	}	
}
 function applicantInfo(){
	    nextForm();
		pendingHsraApplication();
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
		const formSections = document.getElementsByClassName('form-wizard');
		for (const formSection of formSections) {
			formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
			}
	}
	function nextTab(elem) {
	    $(elem).parent().next()
	            .find('a[data-toggle="tab"]').click();
	}

	$("input[name='equipmentProtection']").change(function(){
	    var targetData = $(this).attr('id');
	    $("." + targetData).toggleClass("hide");
	    if($(this).val() == 'Tongs/forceps/other remote handling tool'){
	        $(".otherSpecifyHere, .otherSpecifyHerePreview").toggleClass("hide");
	    }
	});
	$("input[name='applicationType']").change(function(){
	    var targetData = $(this).attr('id');
	    $("." + targetData).toggleClass("hide");
	    if($(this).val() == 'Renewal'){
	        $(".otherSpecifyValue, .otherSpecifyValuePreview").toggleClass("hide");
	    }
	});
	$("input[name='applicationType']").change(function(){
	    var targetData = $(this).attr('id');
	    $("." + targetData).toggleClass("hide");
	    if($(this).val() == 'Variation'){
	        $(".otherVariation, .otherVariationPreview").toggleClass("hide");
	    }
	});
	 function formatPhoneNumber(input) {
	        // Remove non-numeric characters except "+", "-", and " "
	        let formattedInput = input.value.replace(/[^\d\+\-\s]/g, '');
	        // Remove any leading "+" if it exists
	        formattedInput = formattedInput.replace(/^\+/, '');        
	        // Apply the desired format
	        if (formattedInput.length > 0) {
	            formattedInput = "+" + formattedInput;
	            if (formattedInput.length > 2 && formattedInput.charAt(2) !== " ") {
	                formattedInput = formattedInput.substring(0, 2) + " " + formattedInput.substring(2);
	            }
	            if (formattedInput.length > 8 && formattedInput.charAt(8) !== "-") {
	                formattedInput = formattedInput.substring(0, 8) + "-" + formattedInput.substring(8);
	            }
	            if (formattedInput.length > 13 && formattedInput.charAt(13) !== "-") {
	                formattedInput = formattedInput.substring(0, 13) + "-" + formattedInput.substring(13);
	            }
	        }
	        // Update the input value
	        input.value = formattedInput;
	    }
	 
	 function addAcknowledgementMedicalDetailData(counter,docUploadCounter,deleteKey){
  	 	 if(counter!=''&&deleteKey==''){
  	 		acknowledgementMedicalDetailVal=counter;
  	 		acknowledgementMedicalDate = $("#editAcknowledgementMedicalDate"+counter).val();
		 	hsraApplicationId=$("#hsraApplicationId").val();
		    }else if(docUploadCounter!=""){
			acknowledgementMedicalDetailVal = $("#acknowledgementMedicalDetailVal").val();		
			acknowledgementMedicalDate = $("#acknowledgementMedicalDate").val();
			hsraApplicationId=$("#hsraApplicationId").val();
    	 }
  	 	acknowledgementMedicalDetailId=$("#acknowledgementMedicalDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${addAcknowledgementMedicalDetailDataUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": acknowledgementMedicalDetailVal,
			    	 "<portlet:namespace/>acknowledgementMedicalDate": acknowledgementMedicalDate,
			    	 "<portlet:namespace/>id": acknowledgementMedicalDetailId,
			    	 "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			          },
			    success: function (data) {
			    	var result=data.APP_DATA;
					var counter = result["counter"];
			    	$("#acknowledgementMedicalDetail"+result["counter"]).val(result["acknowledgementMedicalDetailId"]);
					uploadDocuments('acknowledgementMedicalSignatureUpload',"Signature of Acknowledgement Medical"+counter,'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		    	},
			    error: function (data) {
			    },
			  });
	}
	 function addApplicantSignatureDetailData(counter,docUploadCounter,deleteKey){
	
  	 	 if(counter!=''&&deleteKey==''){
  	 		applicantSignatureDetailVal=counter;
  	 		applicantSignatureDate = $("#editApplicantSignatureDate"+counter).val();
		 	hsraApplicationId=$("#hsraApplicationId").val();
		    }else if(docUploadCounter!=""){
		    applicantSignatureDetailVal = $("#applicantSignatureDetailVal").val();		
		    applicantSignatureDate = $("#applicantSignatureDate").val();
			hsraApplicationId=$("#hsraApplicationId").val();
    	 }
  	 	applicantSignatureDetailId=$("#applicantSignatureDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${addApplicantSignatureDetailDataUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": applicantSignatureDetailVal,
			    	 "<portlet:namespace/>applicantSignatureDate": applicantSignatureDate,
			    	 "<portlet:namespace/>id": applicantSignatureDetailId,
			    	 "<portlet:namespace/>hsraApplicationId": hsraApplicationId,
			    	 "<portlet:namespace/>deleteKey": deleteKey,
			          },
			    success: function (data) {
			    	var result=data.APP_DATA;
					var counter = result["counter"];
			    	$("#applicantSignatureDetail"+result["counter"]).val(result["applicantSignatureDetailId"]);
			    	uploadDocuments('applicantSignaturelegalSignatureUpload',"Signature of Applicant Medical"+counter,'<%=signatureUploadInHsraFormUrl%>',hsraApplicationId,"");
		    	},
			    error: function (data) {
			    },
			  });
	} 
</script>