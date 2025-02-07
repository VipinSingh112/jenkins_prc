<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addRegisteredClientOrgCerProductUrl" id="registered/client/org/cer/product/detail"/>
<portlet:resourceURL var="addStaffDetailCerProductUrl" id="staff/cer/product/detail"/>
<portlet:resourceURL var="addAuditorListCerProductUrl" id="auditor/list/cer/product/detail"/>
<portlet:resourceURL var="addOutsourceActNatureCerProductUrl" id="outsource/act/nature/cer/product/detail"/>
<portlet:resourceURL var="addPersonResponsibleCerBodiesUrl" id="personnel/responsible/cer/bodies/detail"/>
<portlet:resourceURL var="addRegisteredClientOrgCerBodiesUrl" id="registered/client/org/cer/bodies/detail"/>
<portlet:resourceURL var="addStaffDetailCerBodiesUrl" id="staff/cer/bodies/detail"/>
<portlet:resourceURL var="addAuditorListCerBodiesUrl" id="auditor/list/cer/bodies/detail"/>
<portlet:resourceURL var="addOutsourceActNatureCerBodiesUrl" id="outsource/act/nature/cer/bodies/detail"/>

<portlet:resourceURL var="addPersonResponsibleCerDetailDataUrl" id="/add/cer/bodies/application/info"/>
<portlet:resourceURL var="addPersonResponsibleCerProductDetailDataUrl" id="/add/cer/bodies/application/info"/>
<portlet:resourceURL var="addPersonResponsibleCerBodiesDetailDataUrl" id="/add/cer/bodies/application/info"/>
<portlet:resourceURL var="addRegisteredClientOrgDetailDataUrl" id="/add/cer/bodies/Scope/service"/>
<portlet:resourceURL var="addRegisteredClientOrgCerProductDetailDataUrl" id="/add/cer/bodies/Scope/service"/>
<portlet:resourceURL var="addRegisteredClientOrgCerBodiesDetailDataUrl" id="/add/cer/bodies/scope/service/client"/>
<portlet:resourceURL var="addStaffDetailCertificationDataUrl" id="/add/cer/bodies/personnel/and/reso/first"/>
<portlet:resourceURL var="addStaffDetailCerProductDataUrl" id="/add/cer/bodies/personnel/and/reso/first"/>
<portlet:resourceURL var="addStaffDetailCerBodiesDataUrl" id="/add/cer/bodies/personnel/and/reso/first"/>
<portlet:resourceURL var="addAuditorListDataUrl" id="/add/cer/bodies/personnel/and/reso/second"/>
<portlet:resourceURL var="addAuditorListCerProductDataUrl" id="/add/cer/bodies/personnel/and/reso/second"/>
<portlet:resourceURL var="addAuditorListCerBodiesDataUrl" id="/add/cer/bodies/personnel/and/reso/second"/>
<portlet:resourceURL var="addActivityPerformLocationsDataUrl" id="/add/cer/bodies/personnel/and/reso/third"/>
<portlet:resourceURL var="outSourcedActivitiesDataUrl" id="out/Sourced/Activities/Data"/>
<portlet:resourceURL var="addOutsourceActNatureSecCatDataUrl" id="add/fda/personnel/and/resources/third"/>
<script>
function addRegisteredClientOrgCerProductDetail(){
		 registeredClientOrgCerProductVal = $("#registeredClientOrgCerProductVal").val();
		 clientOrganizationCerProduct = $("#clientOrganizationCerProduct").val();
		 certificationStandardCerProduct = $("#certificationStandardCerProduct").val();
   	 currentCertificationCerProduct = $("#currentCertificationCerProduct").val();
   	 clientOrgDateCerProduct = $("#clientOrgDateCerProduct").val();
		 if(clientOrganizationCerProduct != "" || certificationStandardCerProduct !="" || currentCertificationCerProduct !="" || clientOrgDateCerProduct !=""){
			$(".addRegisteredClientOrgCerProductDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRegisteredClientOrgCerProductUrl}",
				data : {
					"<portlet:namespace/>registeredClientOrgCerProductVal" : registeredClientOrgCerProductVal,
				},
				async:false,
				success : function(data) {
					$(".addRegisteredClientOrgCerProductDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".clientOrganizationCerProduct" + registeredClientOrgCerProductVal).append(clientOrganizationCerProduct);
					$(".certificationStandardCerProduct" + registeredClientOrgCerProductVal).append(certificationStandardCerProduct);
					$(".currentCertificationCerProduct" + registeredClientOrgCerProductVal).append(currentCertificationCerProduct);
        			$(".clientOrgDateCerProduct" + registeredClientOrgCerProductVal).append(clientOrgDateCerProduct);
					/* VALUE INCREAMENT */
					addRegisteredClientOrgCerProductDetailData("");
					registeredClientOrgCerProductVal++;
					$("#registeredClientOrgCerProductVal").val(registeredClientOrgCerProductVal);
					/* RESET FORM FIELDS */
					$("#clientOrganizationCerProduct").val("");
					$("#certificationStandardCerProduct").val("");
        			$("#currentCertificationCerProduct").val("");
       			$("#clientOrgDateCerProduct").val("");
				}
			});
		}else{
			$("#clientOrganizationCerProduct").focus();
		}
	}
 function registeredClientOrgCerProductEditTab(registeredClientOrgCerProductVal){
		$(".editRegisteredClientOrgCerProductEditTabPopup").modal("show");
		$(".editClientOrganizationCerProduct").attr("id" , "editClientOrganizationCerProduct"+registeredClientOrgCerProductVal);
		$(".editCertificationStandardCerProduct").attr("id" , "editCertificationStandardCerProduct"+registeredClientOrgCerProductVal);
		$(".editCurrentCertificationCerProduct").attr("id" , "editCurrentCertificationCerProduct"+registeredClientOrgCerProductVal);
		$(".editClientOrgDateCerProduct").attr("id" , "editClientOrgDateCerProduct"+registeredClientOrgCerProductVal);
		clientOrganizationCerProduct = $(".clientOrganizationCerProduct"+registeredClientOrgCerProductVal+":first").text().trim();
		certificationStandardCerProduct = $(".certificationStandardCerProduct"+registeredClientOrgCerProductVal+":first").text().trim();
		currentCertificationCerProduct = $(".currentCertificationCerProduct"+registeredClientOrgCerProductVal+":first").text().trim();
		clientOrgDateCerProduct = $(".clientOrgDateCerProduct"+registeredClientOrgCerProductVal+":first").text().trim();
		$("#editClientOrganizationCerProduct"+registeredClientOrgCerProductVal).val(clientOrganizationCerProduct);
		$("#editCertificationStandardCerProduct"+registeredClientOrgCerProductVal).val(certificationStandardCerProduct);
		$("#editCurrentCertificationCerProduct"+registeredClientOrgCerProductVal).val(currentCertificationCerProduct);
		$("#editClientOrgDateCerProduct"+registeredClientOrgCerProductVal).val(clientOrgDateCerProduct);
		$(".saveEditRegisteredClientOrgCerProductPopupDataBtn").attr("onclick" , "registeredClientOrgCerProductEditDataTab("+registeredClientOrgCerProductVal+")");
	}
	function registeredClientOrgCerProductEditDataTab(registeredClientOrgCerProductVal){
		addRegisteredClientOrgCerProductDetailData(registeredClientOrgCerProductVal);
		$(".clientOrganizationCerProduct" + registeredClientOrgCerProductVal).html($("#editClientOrganizationCerProduct"+registeredClientOrgCerProductVal).val());
		$(".certificationStandardCerProduct" + registeredClientOrgCerProductVal).html($("#editCertificationStandardCerProduct"+registeredClientOrgCerProductVal).val());
		$(".currentCertificationCerProduct" + registeredClientOrgCerProductVal).html($("#editCurrentCertificationCerProduct"+registeredClientOrgCerProductVal).val());
		$(".clientOrgDateCerProduct" + registeredClientOrgCerProductVal).html($("#editClientOrgDateCerProduct"+registeredClientOrgCerProductVal).val());
		
		$(".editClientOrganizationCerProduct").val("");
		$(".editCertificationStandardCerProduct").val("");
		$(".editCurrentCertificationCerProduct").val("");
		$(".editClientOrgDateCerProduct").val("");
	}
	function registeredClientOrgCerProductDeleteData(registeredClientOrgCerProductValData) {
		  var registeredClientOrgCerProductCountCounter = $("#registeredClientOrgCerProductVal").val();
		  $("#registeredClientOrgCerProductVal").val(registeredClientOrgCerProductCountCounter - 1);
		  var delRowElement = $(".registered-client-org-cer-product-row" + registeredClientOrgCerProductValData); 
		  delRowElement.remove();
		  var j = parseInt(registeredClientOrgCerProductValData) + 1;
		  for (var i = j; i <= registeredClientOrgCerProductCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".registered-client-org-cer-product-row" + i);
		    rowElement.attr("class", "registered-client-org-cer-product-row" + prevCounter);
		    rowElement.find("td.clientOrganizationCerProduct"+i).removeClass("clientOrganizationCerProduct"+i).addClass("clientOrganizationCerProduct"+prevCounter);
		    rowElement.find("td.certificationStandardCerProduct"+i).removeClass("certificationStandardCerProduct"+i).addClass("certificationStandardCerProduct"+prevCounter);
			rowElement.find("td.currentCertificationCerProduct"+i).removeClass("currentCertificationCerProduct"+i).addClass("currentCertificationCerProduct"+prevCounter);
			rowElement.find("td.clientOrgDateCerProduct"+i).removeClass("clientOrgDateCerProduct"+i).addClass("clientOrgDateCerProduct"+prevCounter);
		    rowElement.find("#registeredClientOrgCerProductDeleteDataTab").attr('onclick', 'registeredClientOrgCerProductDeleteData(' +prevCounter+ ')');
		    rowElement.find("#registeredClientOrgCerProductEditTab").attr('onclick', 'registeredClientOrgCerProductEditTab(' +prevCounter+ ')');
		  }
	}
function addStaffDetailCerProduct(){
		 staffDetailCerProductVal = $("#staffDetailCerProductVal").val();
		 staffNameCerProduct = $("#staffNameCerProduct").val();
		 jobTitleCerProduct = $("#jobTitleCerProduct").val();
		 majorResponsibilitiesCerProduct = $("#majorResponsibilitiesCerProduct").val();
		 specificFunctionCerProduct = $("#specificFunctionCerProduct").val();
		 if(staffNameCerProduct != "" || jobTitleCerProduct !="" || majorResponsibilitiesCerProduct !="" || specificFunctionCerProduct !=""){
			$(".addStaffDetailCerProductTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailCerProductUrl}",
				data : {
					"<portlet:namespace/>staffDetailCerProductVal" : staffDetailCerProductVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailCerProductTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameCerProduct" + staffDetailCerProductVal).append(staffNameCerProduct);
					$(".jobTitleCerProduct" + staffDetailCerProductVal).append(jobTitleCerProduct);
					$(".majorResponsibilitiesCerProduct" + staffDetailCerProductVal).append(majorResponsibilitiesCerProduct);
					$(".specificFunctionCerProduct" + staffDetailCerProductVal).append(specificFunctionCerProduct);
					addStaffDetailCerProductData("");
					staffDetailCerProductVal++;
					$("#staffDetailCerProductVal").val(staffDetailCerProductVal);
					$("#staffNameCerProduct").val("");
					$("#jobTitleCerProduct").val("");
					$("#majorResponsibilitiesCerProduct").val("");
					$("#specificFunctionCerProduct").val("");
				}
			});
		}else{
			$("#staffNameCerProduct").focus();
		}
	}
 function staffDetailCerProductEditTab(staffDetailCerProductVal){
		$(".editStaffDetailCerProductEditTabPopup").modal("show");
		$(".editStaffNameCerProduct").attr("id" , "editStaffNameCerProduct"+staffDetailCerProductVal);
		$(".editJobTitleCerProduct").attr("id" , "editJobTitleCerProduct"+staffDetailCerProductVal);
		$(".editMajorResponsibilitiesCerProduct").attr("id" , "editMajorResponsibilitiesCerProduct"+staffDetailCerProductVal);
		$(".editSpecificFunctionCerProduct").attr("id" , "editSpecificFunctionCerProduct"+staffDetailCerProductVal);
		staffNameCerProduct = $(".staffNameCerProduct"+staffDetailCerProductVal+":first").text().trim();
		jobTitleCerProduct = $(".jobTitleCerProduct"+staffDetailCerProductVal+":first").text().trim();
		majorResponsibilitiesCerProduct = $(".majorResponsibilitiesCerProduct"+staffDetailCerProductVal+":first").text().trim();
		specificFunctionCerProduct = $(".specificFunctionCerProduct"+staffDetailCerProductVal+":first").text().trim();
		$("#editStaffNameCerProduct"+staffDetailCerProductVal).val(staffNameCerProduct);
		$("#editJobTitleCerProduct"+staffDetailCerProductVal).val(jobTitleCerProduct);
		$("#editMajorResponsibilitiesCerProduct"+staffDetailCerProductVal).val(majorResponsibilitiesCerProduct);
		$("#editSpecificFunctionCerProduct"+staffDetailCerProductVal).val(specificFunctionCerProduct);
		$(".saveEditStaffDetailCerProductPopupDataBtn").attr("onclick" , "staffDetailCerProductEditDataTab("+staffDetailCerProductVal+")");
	}
	function staffDetailCerProductEditDataTab(staffDetailCerProductVal){
		addStaffDetailCerProductData(staffDetailCerProductVal);
		$(".staffNameCerProduct" + staffDetailCerProductVal).html($("#editStaffNameCerProduct"+staffDetailCerProductVal).val());
		$(".jobTitleCerProduct" + staffDetailCerProductVal).html($("#editJobTitleCerProduct"+staffDetailCerProductVal).val());
		$(".majorResponsibilitiesCerProduct" + staffDetailCerProductVal).html($("#editMajorResponsibilitiesCerProduct"+staffDetailCerProductVal).val());
		$(".specificFunctionCerProduct" + staffDetailCerProductVal).html($("#editSpecificFunctionCerProduct"+staffDetailCerProductVal).val());
		$(".editStaffNameCerProduct").val("");
		$(".editJobTitleCerProduct").val("");
		$(".editMajorResponsibilitiesCerProduct").val("");
		$(".editSpecificFunctionCerProduct").val("");
	}
	function staffDetailCerProductDeleteData(staffDetailCerProductValData) {
		  var staffDetailCerProductCountCounter = $("#staffDetailCerProductVal").val();
		  $("#staffDetailCerProductVal").val(staffDetailCerProductCountCounter - 1);
		  var delRowElement = $(".staff-detail-cer-product-row" + staffDetailCerProductValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailCerProductValData) + 1;
		  for (var i = j; i <= staffDetailCerProductCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-cer-product-row" + i);
		    rowElement.attr("class", "staff-detail-cer-product-row" + prevCounter);
		    rowElement.find("td.staffNameCerProduct"+i).removeClass("staffNameCerProduct"+i).addClass("staffNameCerProduct"+prevCounter);
		    rowElement.find("td.jobTitleCerProduct"+i).removeClass("jobTitleCerProduct"+i).addClass("jobTitleCerProduct"+prevCounter);
			rowElement.find("td.majorResponsibilitiesCerProduct"+i).removeClass("majorResponsibilitiesCerProduct"+i).addClass("majorResponsibilitiesCerProduct"+prevCounter);
			rowElement.find("td.specificFunctionCerProduct"+i).removeClass("specificFunctionCerProduct"+i).addClass("specificFunctionCerProduct"+prevCounter);
		    rowElement.find("#staffDetailCerProductDeleteDataTab").attr('onclick', 'staffDetailCerProductDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailCerProductEditTab").attr('onclick', 'staffDetailCerProductEditTab(' +prevCounter+ ')');
		  }
	}
function addAuditorListCerProduct(){
		 auditorListCerProductVal = $("#auditorListCerProductVal").val();
		 auditorNameCerProduct = $("#auditorNameCerProduct").val();
		 auditorRoleCerProduct = $("#auditorRoleCerProduct").val();
		 auditorCertificationStandardCerProduct = $("#auditorCertificationStandardCerProduct").val();
		 auditorExpertiseAreaCerProduct = $("#auditorExpertiseAreaCerProduct").val();
		 if(auditorNameCerProduct != "" || auditorRoleCerProduct !="" || auditorCertificationStandardCerProduct !="" || auditorExpertiseAreaCerProduct !=""){
			$(".addAuditorListCerProductTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAuditorListCerProductUrl}",
				data : {
					"<portlet:namespace/>auditorListCerProductVal" : auditorListCerProductVal,
				},
				async:false,
				success : function(data) {
					$(".addAuditorListCerProductTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".auditorNameCerProduct" + auditorListCerProductVal).append(auditorNameCerProduct);
					$(".auditorRoleCerProduct" + auditorListCerProductVal).append(auditorRoleCerProduct);
					$(".auditorCertificationStandardCerProduct" + auditorListCerProductVal).append(auditorCertificationStandardCerProduct);
					$(".auditorExpertiseAreaCerProduct" + auditorListCerProductVal).append(auditorExpertiseAreaCerProduct);
					addAuditorListCerProductData("");
					auditorListCerProductVal++;
					$("#auditorListCerProductVal").val(auditorListCerProductVal);
					$("#auditorNameCerProduct").val("");
					$("#auditorRoleCerProduct").val("");
					$("#auditorCertificationStandardCerProduct").val("");
					$("#auditorExpertiseAreaCerProduct").val("");
				}
			});
		}else{
			$("#auditorNameCerProduct").focus();
		}
	}
 function auditorListCerProductEditTab(auditorListCerProductVal){
		$(".editAuditorListCerProductEditTabPopup").modal("show");
		$(".editAuditorNameCerProduct").attr("id" , "editAuditorNameCerProduct"+auditorListCerProductVal);
		$(".editAuditorRoleCerProduct").attr("id" , "editAuditorRoleCerProduct"+auditorListCerProductVal);
		$(".editAuditorCertificationStandardCerProduct").attr("id" , "editAuditorCertificationStandardCerProduct"+auditorListCerProductVal);
		$(".editAuditorExpertiseAreaCerProduct").attr("id" , "editAuditorExpertiseAreaCerProduct"+auditorListCerProductVal);
		auditorNameCerProduct = $(".auditorNameCerProduct"+auditorListCerProductVal+":first").text().trim();
		auditorRoleCerProduct = $(".auditorRoleCerProduct"+auditorListCerProductVal+":first").text().trim();
		auditorCertificationStandardCerProduct = $(".auditorCertificationStandardCerProduct"+auditorListCerProductVal+":first").text().trim();
		auditorExpertiseAreaCerProduct = $(".auditorExpertiseAreaCerProduct"+auditorListCerProductVal+":first").text().trim();
		$("#editAuditorNameCerProduct"+auditorListCerProductVal).val(auditorNameCerProduct);
		$("#editAuditorRoleCerProduct"+auditorListCerProductVal).val(auditorRoleCerProduct);
		$("#editAuditorCertificationStandardCerProduct"+auditorListCerProductVal).val(auditorCertificationStandardCerProduct);
		$("#editAuditorExpertiseAreaCerProduct"+auditorListCerProductVal).val(auditorExpertiseAreaCerProduct);
		$(".saveEditAuditorListCerProductPopupDataBtn").attr("onclick" , "auditorListCerProductEditDataTab("+auditorListCerProductVal+")");
	}
	function auditorListCerProductEditDataTab(auditorListCerProductVal){
		addAuditorListCerProductData(auditorListCerProductVal);
		$(".auditorNameCerProduct" + auditorListCerProductVal).html($("#editAuditorNameCerProduct"+auditorListCerProductVal).val());
		$(".auditorRoleCerProduct" + auditorListCerProductVal).html($("#editAuditorRoleCerProduct"+auditorListCerProductVal).val());
		$(".auditorCertificationStandardCerProduct" + auditorListCerProductVal).html($("#editAuditorCertificationStandardCerProduct"+auditorListCerProductVal).val());
		$(".auditorExpertiseAreaCerProduct" + auditorListCerProductVal).html($("#editAuditorExpertiseAreaCerProduct"+auditorListCerProductVal).val());
		$(".editAuditorNameCerProduct").val("");
		$(".editAuditorRoleCerProduct").val("");
		$(".editAuditorCertificationStandardCerProduct").val("");
		$(".editAuditorExpertiseAreaCerProduct").val("");
	}
	function auditorListCerProductDeleteData(auditorListCerProductValData) {
		  var auditorListCerProductCountCounter = $("#auditorListCerProductVal").val();
		  $("#auditorListCerProductVal").val(auditorListCerProductCountCounter - 1);
		  var delRowElement = $(".auditor-list-cer-product-row" + auditorListCerProductValData); 
		  delRowElement.remove();
		  var j = parseInt(auditorListCerProductValData) + 1;
		  for (var i = j; i <= auditorListCerProductCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".auditor-list-cer-product-row" + i);
		    rowElement.attr("class", "auditor-list-cer-product-row" + prevCounter);
		    rowElement.find("td.auditorNameCerProduct"+i).removeClass("auditorNameCerProduct"+i).addClass("auditorNameCerProduct"+prevCounter);
		    rowElement.find("td.auditorRoleCerProduct"+i).removeClass("auditorRoleCerProduct"+i).addClass("auditorRoleCerProduct"+prevCounter);
			rowElement.find("td.auditorCertificationStandardCerProduct"+i).removeClass("auditorCertificationStandardCerProduct"+i).addClass("auditorCertificationStandardCerProduct"+prevCounter);
			rowElement.find("td.auditorExpertiseAreaCerProduct"+i).removeClass("auditorExpertiseAreaCerProduct"+i).addClass("auditorExpertiseAreaCerProduct"+prevCounter);
		    rowElement.find("#auditorListCerProductDeleteDataTab").attr('onclick', 'auditorListCerProductDeleteData(' +prevCounter+ ')');
		    rowElement.find("#auditorListCerProductEditTab").attr('onclick', 'auditorListCerProductEditTab(' +prevCounter+ ')');
		  }
	}
function addOutsourceActNatureCertProduct(){
		outsourceActNatureCertProductVal = $("#outsourceActNatureCertProductVal").val();
		 outsourcedActivityCertProduct = $("#outsourcedActivityCertProduct").val();
		 serviceProvdierCertProduct = $("#serviceProvdierCertProduct").val();
   	 activityPerformLocCertProduct = $("#activityPerformLocCertProduct").val();
		 if(outsourcedActivityCertProduct != "" || serviceProvdierCertProduct !="" || activityPerformLocCertProduct != ""){
			$(".addOutsourceActNatureCertProductTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addOutsourceActNatureCerProductUrl}",
				data : {
					"<portlet:namespace/>outsourceActNatureCertProductVal" : outsourceActNatureCertProductVal,
				},
				async:false,
				success : function(data) {
					$(".addOutsourceActNatureCertProductTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".outsourcedActivityCertProduct" + outsourceActNatureCertProductVal).append(outsourcedActivityCertProduct);
					$(".serviceProvdierCertProduct" + outsourceActNatureCertProductVal).append(serviceProvdierCertProduct);
        			$(".activityPerformLocCertProduct" + outsourceActNatureCertProductVal).append(activityPerformLocCertProduct);
					outsourceNatureCertProductData("");
					outsourceActNatureCertProductVal++;
					$("#outsourceActNatureCertProductVal").val(outsourceActNatureCertProductVal);
					$("#outsourcedActivityCertProduct").val("");
					$("#serviceProvdierCertProduct").val("");
        			$("#activityPerformLocCertProduct").val("");
				}
			});
		}else{
			$("#outsourcedActivityCertProduct").focus();
		}
	}
  function outsourceActNatureCertProductEditTab(outsourceActNatureCertProductVal){
		$(".editOutsourceActNatureCertProductEditTabPopup").modal("show");
		$(".editOutsourcedActivityCertProduct").attr("id" , "editOutsourcedActivityCertProduct"+outsourceActNatureCertProductVal);
		$(".editServiceProvdierCertProduct").attr("id" , "editServiceProvdierCertProduct"+outsourceActNatureCertProductVal);
		$(".editActivityPerformLocCertProduct").attr("id" , "editActivityPerformLocCertProduct"+outsourceActNatureCertProductVal);
		outsourcedActivityCertProduct = $(".outsourcedActivityCertProduct"+outsourceActNatureCertProductVal+":first").text().trim();
		serviceProvdierCertProduct = $(".serviceProvdierCertProduct"+outsourceActNatureCertProductVal+":first").text().trim();
		activityPerformLocCertProduct = $(".activityPerformLocCertProduct"+outsourceActNatureCertProductVal+":first").text().trim();
		$("#editOutsourcedActivityCertProduct"+outsourceActNatureCertProductVal).val(outsourcedActivityCertProduct);
		$("#editServiceProvdierCertProduct"+outsourceActNatureCertProductVal).val(serviceProvdierCertProduct);
		$("#editActivityPerformLocCertProduct"+outsourceActNatureCertProductVal).val(activityPerformLocCertProduct);
		$(".saveEditOutsourceActNatureCertProductPopupDataBtn").attr("onclick" , "outsourceActNatureCertProductEditDataTab("+outsourceActNatureCertProductVal+")");
	}
	function outsourceActNatureCertProductEditDataTab(outsourceActNatureCertProductVal){
		$(".outsourcedActivityCertProduct" + outsourceActNatureCertProductVal).html($("#editOutsourcedActivityCertProduct"+outsourceActNatureCertProductVal).val());
		$(".serviceProvdierCertProduct" + outsourceActNatureCertProductVal).html($("#editServiceProvdierCertProduct"+outsourceActNatureCertProductVal).val());
		$(".activityPerformLocCertProduct" + outsourceActNatureCertProductVal).html($("#editActivityPerformLocCertProduct"+outsourceActNatureCertProductVal).val());
		$(".editOutsourcedActivityCertProduct").val("");
		$(".editServiceProvdierCertProduct").val("");
		$(".editActivityPerformLocCertProduct").val("");
	}
	function outsourceActNatureCertProductDeleteData(outsourceActNatureCertProductValData) {
		  var outsourceActNatureCertProductCountCounter = $("#outsourceActNatureCertProductVal").val();
		  $("#outsourceActNatureCertProductVal").val(outsourceActNatureCertProductCountCounter - 1);
		  var delRowElement = $(".outsource-act-nature-cer-product-row" + outsourceActNatureCertProductValData); 
		  delRowElement.remove();
		  var j = parseInt(outsourceActNatureCertProductValData) + 1;
		  for (var i = j; i <= outsourceActNatureCertProductCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".outsource-act-nature-cer-product-row" + i);
		    rowElement.attr("class", "outsource-act-nature-cer-product-row" + prevCounter);
		    rowElement.find("td.outsourcedActivityCertProduct"+i).removeClass("outsourcedActivityCertProduct"+i).addClass("outsourcedActivityCertProduct"+prevCounter);
		    rowElement.find("td.serviceProvdierCertProduct"+i).removeClass("serviceProvdierCertProduct"+i).addClass("serviceProvdierCertProduct"+prevCounter);
			 rowElement.find("td.activityPerformLocCertProduct"+i).removeClass("activityPerformLocCertProduct"+i).addClass("activityPerformLocCertProduct"+prevCounter);
		    rowElement.find("#outsourceActNatureCertProductDeleteDataTab").attr('onclick', 'outsourceActNatureCertProductDeleteData(' +prevCounter+ ')');
		    rowElement.find("#outsourceActNatureCertProductEditTab").attr('onclick', 'outsourceActNatureCertProductEditTab(' +prevCounter+ ')');
		  }
	}
function addPersonResponsibleCerBodiesDetail(){
		personResponsibleCerBodiesVal = $("#personResponsibleCerBodiesVal").val();
		
		 technicalPersonNameCerBodies = $("#technicalPersonNameCerBodies").val();
		 technicalPersonEmailCerBodies = $("#technicalPersonEmailCerBodies").val();
		 if(technicalPersonNameCerBodies != "" || technicalPersonEmailCerBodies !=""){
			$(".addPersonResponsibleDetailCerBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addPersonResponsibleCerBodiesUrl}",
				data : {
					"<portlet:namespace/>personResponsibleCerBodiesVal" : personResponsibleCerBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addPersonResponsibleDetailCerBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".technicalPersonNameCerBodies" + personResponsibleCerBodiesVal).append(technicalPersonNameCerBodies);
					$(".technicalPersonEmailCerBodies" + personResponsibleCerBodiesVal).append(technicalPersonEmailCerBodies);
					addPersonResponsibleCerBodiesDetailData("");
					personResponsibleCerBodiesVal++;
					$("#personResponsibleCerBodiesVal").val(personResponsibleCerBodiesVal);
					$("#technicalPersonNameCerBodies").val("");
					$("#technicalPersonEmailCerBodies").val("");
				}
			});
		}else{
			$("#technicalPersonNameCerBodies").focus();
		}
	}
  function personResponsibleCerBodiesEditTab(personResponsibleCerBodiesVal){
		$(".editPersonResponsibleCerBodiesEditTabPopup").modal("show");
		$(".editTechnicalPersonNameCerBodies").attr("id" , "editTechnicalPersonNameCerBodies"+personResponsibleCerBodiesVal);
		$(".editTechnicalPersonEmailCerBodies").attr("id" , "editTechnicalPersonEmailCerBodies"+personResponsibleCerBodiesVal);
		technicalPersonNameCerBodies = $(".technicalPersonNameCerBodies"+personResponsibleCerBodiesVal+":first").text().trim();
		technicalPersonEmailCerBodies = $(".technicalPersonEmailCerBodies"+personResponsibleCerBodiesVal+":first").text().trim();
		$("#editTechnicalPersonNameCerBodies"+personResponsibleCerBodiesVal).val(technicalPersonNameCerBodies);
		$("#editTechnicalPersonEmailCerBodies"+personResponsibleCerBodiesVal).val(technicalPersonEmailCerBodies);
		$(".saveEditPersonResponsibleCerBodiesPopupDataBtn").attr("onclick" , "personResponsibleCerBodiesEditDataTab("+personResponsibleCerBodiesVal+")");
	}
	function personResponsibleCerBodiesEditDataTab(personResponsibleCerBodiesVal){
		addPersonResponsibleCerBodiesDetailData(personResponsibleCerBodiesVal);
		$(".technicalPersonNameCerBodies" + personResponsibleCerBodiesVal).html($("#editTechnicalPersonNameCerBodies"+personResponsibleCerBodiesVal).val());
		$(".technicalPersonEmailCerBodies" + personResponsibleCerBodiesVal).html($("#editTechnicalPersonEmailCerBodies"+personResponsibleCerBodiesVal).val());
		$(".editTechnicalPersonNameCerBodies").val("");
		$(".editTechnicalPersonEmailCerBodies").val("");
	}
	function personResponsibleCerBodiesDeleteData(personResponsibleCerBodiesValData) {
		  var personResponsibleCerBodiesCountCounter = $("#personResponsibleCerBodiesVal").val();
		  $("#personResponsibleCerBodiesVal").val(personResponsibleCerBodiesCountCounter - 1);
		  var delRowElement = $(".personnel-responsible-cer-bodies-row" + personResponsibleCerBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(personResponsibleCerBodiesValData) + 1;
		  for (var i = j; i <= personResponsibleCerBodiesCountCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".personnel-responsible-cer-bodies-row" + i);
			rowElement.attr("class", "personnel-responsible-cer-bodies-row" + prevCounter);
			rowElement.find("td.technicalPersonNameCerBodies"+i).removeClass("technicalPersonNameCerBodies"+i).addClass("technicalPersonNameCerBodies"+prevCounter);
			rowElement.find("td.technicalPersonEmailCerBodies"+i).removeClass("technicalPersonEmailCerBodies"+i).addClass("technicalPersonEmailCerBodies"+prevCounter);
			rowElement.find("#personResponsibleCerBodiesDeleteDataTab").attr('onclick', 'personResponsibleCerBodiesDeleteData(' +prevCounter+ ')');
			rowElement.find("#personResponsibleCerBodiesEditTab").attr('onclick', 'personResponsibleCerBodiesEditTab(' +prevCounter+ ')');
		  }
	}
function addRegisteredClientOrgCerBodiesDetail(){
	registeredClientOrgCerBodies = $("#registeredClientOrgCerBodies").val();
	clientOrganizationNameCerBodies = $("#clientOrganizationNameCerBodies").val();
	clientOrganizationAddressCerBodies = $("#clientOrganizationAddressCerBodies").val();
  certificationStandardCerBodies = $("#certificationStandardCerBodies").val();
  currentStatusCerBodies = $("#currentStatusCerBodies").val();
  firstGrantedDateCerBodies = $("#firstGrantedDateCerBodies").val();
  examinationDateCerBodies = $("#examinationDateCerBodies").val();
		 if(clientOrganizationNameCerBodies != "" || clientOrganizationAddressCerBodies !="" || certificationStandardCerBodies !="" || clientOrganizationNameCerBodies !="" || firstGrantedDateCerBodies !="" || examinationDateCerBodies !=""){
			$(".addRegisteredClientOrgCerBodiesDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addRegisteredClientOrgCerBodiesUrl}",
				data : {
					"<portlet:namespace/>registeredClientOrgCerBodies" : registeredClientOrgCerBodies,
				},
				async:false,
				success : function(data) {
					$(".addRegisteredClientOrgCerBodiesDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".clientOrganizationNameCerBodies" + registeredClientOrgCerBodies).append(clientOrganizationNameCerBodies);
					$(".clientOrganizationAddressCerBodies" + registeredClientOrgCerBodies).append(clientOrganizationAddressCerBodies);
					$(".certificationStandardCerBodies" + registeredClientOrgCerBodies).append(certificationStandardCerBodies);
		            $(".currentStatusCerBodies" + registeredClientOrgCerBodies).append(currentStatusCerBodies);
		            $(".firstGrantedDateCerBodies" + registeredClientOrgCerBodies).append(firstGrantedDateCerBodies);
		            $(".examinationDateCerBodies" + registeredClientOrgCerBodies).append(examinationDateCerBodies);
					addRegisteredClientOrgCerBodiesDetailData("");
					registeredClientOrgCerBodies++;
					$("#registeredClientOrgCerBodies").val(registeredClientOrgCerBodies);
					$("#clientOrganizationNameCerBodies").val("");
					$("#clientOrganizationAddressCerBodies").val("");
			        $("#certificationStandardCerBodies").val("");
			        $("#currentStatusCerBodies").val("");
			        $("#firstGrantedDateCerBodies").val("");
			        $("#examinationDateCerBodies").val("");
				}
			});
		}else{
			$("#clientOrganizationNameCerBodies").focus();
		}
	}
  function registeredClientOrgCerBodiesEditTab(registeredClientOrgCerBodies){
		$(".editRegisteredClientOrgCerBodiesEditTabPopup").modal("show");
		$(".editClientOrganizationNameCerBodies").attr("id" , "editClientOrganizationNameCerBodies"+registeredClientOrgCerBodies);
		$(".editClientOrganizationAddressCerBodies").attr("id" , "editClientOrganizationAddressCerBodies"+registeredClientOrgCerBodies);
		$(".editCertificationStandardCerBodies").attr("id" , "editCertificationStandardCerBodies"+registeredClientOrgCerBodies);
		$(".editCurrentStatusCerBodies").attr("id" , "editCurrentStatusCerBodies"+registeredClientOrgCerBodies);
		$(".editFirstGrantedDateCerBodies").attr("id" , "editFirstGrantedDateCerBodies"+registeredClientOrgCerBodies);
		$(".editExaminationDateCerBodies").attr("id" , "editExaminationDateCerBodies"+registeredClientOrgCerBodies);
		clientOrganizationNameCerBodies = $(".clientOrganizationNameCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		clientOrganizationAddressCerBodies = $(".clientOrganizationAddressCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		certificationStandardCerBodies = $(".certificationStandardCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		currentStatusCerBodies = $(".currentStatusCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		firstGrantedDateCerBodies = $(".firstGrantedDateCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		examinationDateCerBodies = $(".examinationDateCerBodies"+registeredClientOrgCerBodies+":first").text().trim();
		$("#editClientOrganizationNameCerBodies"+registeredClientOrgCerBodies).val(clientOrganizationNameCerBodies);
		$("#editClientOrganizationAddressCerBodies"+registeredClientOrgCerBodies).val(clientOrganizationAddressCerBodies);
		$("#editCertificationStandardCerBodies"+registeredClientOrgCerBodies).val(certificationStandardCerBodies);
		$("#editCurrentStatusCerBodies"+registeredClientOrgCerBodies).val(currentStatusCerBodies);
		$("#editFirstGrantedDateCerBodies"+registeredClientOrgCerBodies).val(firstGrantedDateCerBodies);
		$("#editExaminationDateCerBodies"+registeredClientOrgCerBodies).val(examinationDateCerBodies);
		$(".saveEditRegisteredClientOrgCerBodiesPopupDataBtn").attr("onclick" , "registeredClientOrgCerBodiesEditDataTab("+registeredClientOrgCerBodies+")");
	}
	function registeredClientOrgCerBodiesEditDataTab(registeredClientOrgCerBodies){
		addRegisteredClientOrgCerBodiesDetailData(registeredClientOrgCerBodies);
		$(".clientOrganizationNameCerBodies" + registeredClientOrgCerBodies).html($("#editClientOrganizationNameCerBodies"+registeredClientOrgCerBodies).val());
		$(".clientOrganizationAddressCerBodies" + registeredClientOrgCerBodies).html($("#editClientOrganizationAddressCerBodies"+registeredClientOrgCerBodies).val());
		$(".certificationStandardCerBodies" + registeredClientOrgCerBodies).html($("#editCertificationStandardCerBodies"+registeredClientOrgCerBodies).val());
		$(".currentStatusCerBodies" + registeredClientOrgCerBodies).html($("#editCurrentStatusCerBodies"+registeredClientOrgCerBodies).val());
		$(".firstGrantedDateCerBodies" + registeredClientOrgCerBodies).html($("#editFirstGrantedDateCerBodies"+registeredClientOrgCerBodies).val());
		$(".examinationDateCerBodies" + registeredClientOrgCerBodies).html($("#editExaminationDateCerBodies"+registeredClientOrgCerBodies).val());
		$(".editClientOrganizationNameCerBodies").val("");
		$(".editClientOrganizationAddressCerBodies").val("");
		$(".editCertificationStandardCerBodies").val("");
		$(".editCurrentStatusCerBodies").val("");
		$(".editFirstGrantedDateCerBodies").val("");
		$(".editExaminationDateCerBodies").val("");
	}
	function registeredClientOrgCerBodiesDeleteData(registeredClientOrgCerBodiesData) {
		  var registeredClientOrgCerBodiesCountCounter = $("#registeredClientOrgCerBodies").val();
		  $("#registeredClientOrgCerBodies").val(registeredClientOrgCerBodiesCountCounter - 1);
		  var delRowElement = $(".registered-client-org-cer-product-row" + registeredClientOrgCerBodiesData); 
		  delRowElement.remove();
		  var j = parseInt(registeredClientOrgCerBodiesData) + 1;
		  for (var i = j; i <= registeredClientOrgCerBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".registered-client-org-cer-product-row" + i);
		    rowElement.attr("class", "registered-client-org-cer-product-row" + prevCounter);
		    rowElement.find("td.clientOrganizationNameCerBodies"+i).removeClass("clientOrganizationNameCerBodies"+i).addClass("clientOrganizationNameCerBodies"+prevCounter);
		    rowElement.find("td.clientOrganizationAddressCerBodies"+i).removeClass("clientOrganizationAddressCerBodies"+i).addClass("clientOrganizationAddressCerBodies"+prevCounter);
			rowElement.find("td.certificationStandardCerBodies"+i).removeClass("certificationStandardCerBodies"+i).addClass("certificationStandardCerBodies"+prevCounter);
			rowElement.find("td.currentStatusCerBodies"+i).removeClass("currentStatusCerBodies"+i).addClass("currentStatusCerBodies"+prevCounter);
		    rowElement.find("td.firstGrantedDateCerBodies"+i).removeClass("firstGrantedDateCerBodies"+i).addClass("firstGrantedDateCerBodies"+prevCounter);
			rowElement.find("td.examinationDateCerBodies"+i).removeClass("examinationDateCerBodies"+i).addClass("examinationDateCerBodies"+prevCounter);
		    rowElement.find("#registeredClientOrgCerBodiesDeleteDataTab").attr('onclick', 'registeredClientOrgCerBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#registeredClientOrgCerBodiesEditTab").attr('onclick', 'registeredClientOrgCerBodiesEditTab(' +prevCounter+ ')');
		  }
	}
function addStaffDetailCerBodies(){
		 staffDetailCerBodiesVal = $("#staffDetailCerBodiesVal").val();
		 staffNameCerBodies = $("#staffNameCerBodies").val();
		 jobTitleCerBodies = $("#jobTitleCerBodies").val();
		 majorResponsibilitiesCerBodies = $("#majorResponsibilitiesCerBodies").val();
		 specificFunctionCerBodies = $("#specificFunctionCerBodies").val();
		 if(staffNameCerBodies != "" || jobTitleCerBodies !="" || majorResponsibilitiesCerBodies !="" || specificFunctionCerBodies !=""){
			$(".addStaffDetailCerBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addStaffDetailCerBodiesUrl}",
				data : {
					"<portlet:namespace/>staffDetailCerBodiesVal" : staffDetailCerBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addStaffDetailCerBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".staffNameCerBodies" + staffDetailCerBodiesVal).append(staffNameCerBodies);
					$(".jobTitleCerBodies" + staffDetailCerBodiesVal).append(jobTitleCerBodies);
					$(".majorResponsibilitiesCerBodies" + staffDetailCerBodiesVal).append(majorResponsibilitiesCerBodies);
					$(".specificFunctionCerBodies" + staffDetailCerBodiesVal).append(specificFunctionCerBodies);
					addStaffDetailCerBodiesData("");
					staffDetailCerBodiesVal++;
					$("#staffDetailCerBodiesVal").val(staffDetailCerBodiesVal);
					$("#staffNameCerBodies").val("");
					$("#jobTitleCerBodies").val("");
					$("#majorResponsibilitiesCerBodies").val("");
					$("#specificFunctionCerBodies").val("");
				}
			});
		}else{
			$("#staffNameCerBodies").focus();
		}
	}
  function staffDetailCerBodiesEditTab(staffDetailCerBodiesVal){
		$(".editStaffDetailCerBodiesEditTabPopup").modal("show");
		$(".editStaffNameCerBodies").attr("id" , "editStaffNameCerBodies"+staffDetailCerBodiesVal);
		$(".editJobTitleCerBodies").attr("id" , "editJobTitleCerBodies"+staffDetailCerBodiesVal);
		$(".editMajorResponsibilitiesCerBodies").attr("id" , "editMajorResponsibilitiesCerBodies"+staffDetailCerBodiesVal);
		$(".editSpecificFunctionCerBodies").attr("id" , "editSpecificFunctionCerBodies"+staffDetailCerBodiesVal);
		staffNameCerBodies = $(".staffNameCerBodies"+staffDetailCerBodiesVal+":first").text().trim();
		jobTitleCerBodies = $(".jobTitleCerBodies"+staffDetailCerBodiesVal+":first").text().trim();
		majorResponsibilitiesCerBodies = $(".majorResponsibilitiesCerBodies"+staffDetailCerBodiesVal+":first").text().trim();
		specificFunctionCerBodies = $(".specificFunctionCerBodies"+staffDetailCerBodiesVal+":first").text().trim();
		$("#editStaffNameCerBodies"+staffDetailCerBodiesVal).val(staffNameCerBodies);
		$("#editJobTitleCerBodies"+staffDetailCerBodiesVal).val(jobTitleCerBodies);
		$("#editMajorResponsibilitiesCerBodies"+staffDetailCerBodiesVal).val(majorResponsibilitiesCerBodies);
		$("#editSpecificFunctionCerBodies"+staffDetailCerBodiesVal).val(specificFunctionCerBodies);
		$(".saveEditStaffDetailCerBodiesPopupDataBtn").attr("onclick" , "staffDetailCerBodiesEditDataTab("+staffDetailCerBodiesVal+")");
	}
	function staffDetailCerBodiesEditDataTab(staffDetailCerBodiesVal){
		addStaffDetailCerBodiesData(staffDetailCerBodiesVal);
		$(".staffNameCerBodies" + staffDetailCerBodiesVal).html($("#editStaffNameCerBodies"+staffDetailCerBodiesVal).val());
		$(".jobTitleCerBodies" + staffDetailCerBodiesVal).html($("#editJobTitleCerBodies"+staffDetailCerBodiesVal).val());
		$(".majorResponsibilitiesCerBodies" + staffDetailCerBodiesVal).html($("#editMajorResponsibilitiesCerBodies"+staffDetailCerBodiesVal).val());
		$(".specificFunctionCerBodies" + staffDetailCerBodiesVal).html($("#editSpecificFunctionCerBodies"+staffDetailCerBodiesVal).val());
		$(".editStaffNameCerBodies").val("");
		$(".editJobTitleCerBodies").val("");
		$(".editMajorResponsibilitiesCerBodies").val("");
		$(".editSpecificFunctionCerBodies").val("");
	}
	function staffDetailCerBodiesDeleteData(staffDetailCerBodiesValData) {
		  var staffDetailCerBodiesCountCounter = $("#staffDetailCerBodiesVal").val();
		  $("#staffDetailCerBodiesVal").val(staffDetailCerBodiesCountCounter - 1);
		  var delRowElement = $(".staff-detail-cer-bodies-row" + staffDetailCerBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(staffDetailCerBodiesValData) + 1;
		  for (var i = j; i <= staffDetailCerBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".staff-detail-cer-bodies-row" + i);
		    rowElement.attr("class", "staff-detail-cer-bodies-row" + prevCounter);
		    rowElement.find("td.staffNameCerBodies"+i).removeClass("staffNameCerBodies"+i).addClass("staffNameCerBodies"+prevCounter);
		    rowElement.find("td.jobTitleCerBodies"+i).removeClass("jobTitleCerBodies"+i).addClass("jobTitleCerBodies"+prevCounter);
			rowElement.find("td.majorResponsibilitiesCerBodies"+i).removeClass("majorResponsibilitiesCerBodies"+i).addClass("majorResponsibilitiesCerBodies"+prevCounter);
			rowElement.find("td.specificFunctionCerBodies"+i).removeClass("specificFunctionCerBodies"+i).addClass("specificFunctionCerBodies"+prevCounter);
		    rowElement.find("#staffDetailCerBodiesDeleteDataTab").attr('onclick', 'staffDetailCerBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#staffDetailCerBodiesEditTab").attr('onclick', 'staffDetailCerBodiesEditTab(' +prevCounter+ ')');
		  }
	}
  function addAuditorListCerBodies(){
		auditorListCerBodiesVal = $("#auditorListCerBodiesVal").val();
		 auditorNameCerBodies = $("#auditorNameCerBodies").val();
		 auditorRoleCerBodies = $("#auditorRoleCerBodies").val();
		 auditorCerBodiesStandard = $("#auditorCerBodiesStandard").val();
		 auditorExpertiseAreaCerBodies = $("#auditorExpertiseAreaCerBodies").val();
		 if(auditorNameCerBodies != "" || auditorRoleCerBodies !="" || auditorCerBodiesStandard !="" || auditorExpertiseAreaCerBodies !=""){
			$(".addAuditorListCerBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addAuditorListCerBodiesUrl}",
				data : {
					"<portlet:namespace/>auditorListCerBodiesVal" : auditorListCerBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addAuditorListCerBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".auditorNameCerBodies" + auditorListCerBodiesVal).append(auditorNameCerBodies);
					$(".auditorRoleCerBodies" + auditorListCerBodiesVal).append(auditorRoleCerBodies);
					$(".auditorCerBodiesStandard" + auditorListCerBodiesVal).append(auditorCerBodiesStandard);
					$(".auditorExpertiseAreaCerBodies" + auditorListCerBodiesVal).append(auditorExpertiseAreaCerBodies);
					addAuditorListCerBodiesData("");
					auditorListCerBodiesVal++;
					$("#auditorListCerBodiesVal").val(auditorListCerBodiesVal);
					$("#auditorNameCerBodies").val("");
					$("#auditorRoleCerBodies").val("");
					$("#auditorCerBodiesStandard").val("");
					$("#auditorExpertiseAreaCerBodies").val("");
				}
			});
		}else{
			$("#auditorNameCerBodies").focus();
		}
	}
function auditorListCerBodiesEditTab(auditorListCerBodiesVal){
		$(".editAuditorListCerBodiesEditTabPopup").modal("show");
		$(".editAuditorNameCerBodies").attr("id" , "editAuditorNameCerBodies"+auditorListCerBodiesVal);
		$(".editAuditorRoleCerBodies").attr("id" , "editAuditorRoleCerBodies"+auditorListCerBodiesVal);
		$(".editAuditorCerBodiesStandard").attr("id" , "editAuditorCerBodiesStandard"+auditorListCerBodiesVal);
		$(".editAuditorExpertiseAreaCerBodies").attr("id" , "editAuditorExpertiseAreaCerBodies"+auditorListCerBodiesVal);
		auditorNameCerBodies = $(".auditorNameCerBodies"+auditorListCerBodiesVal+":first").text().trim();
		auditorRoleCerBodies = $(".auditorRoleCerBodies"+auditorListCerBodiesVal+":first").text().trim();
		auditorCerBodiesStandard = $(".auditorCerBodiesStandard"+auditorListCerBodiesVal+":first").text().trim();
		auditorExpertiseAreaCerBodies = $(".auditorExpertiseAreaCerBodies"+auditorListCerBodiesVal+":first").text().trim();
		$("#editAuditorNameCerBodies"+auditorListCerBodiesVal).val(auditorNameCerBodies);
		$("#editAuditorRoleCerBodies"+auditorListCerBodiesVal).val(auditorRoleCerBodies);
		$("#editAuditorCerBodiesStandard"+auditorListCerBodiesVal).val(auditorCerBodiesStandard);
		$("#editAuditorExpertiseAreaCerBodies"+auditorListCerBodiesVal).val(auditorExpertiseAreaCerBodies);
		$(".saveEditAuditorListCerBodiesPopupDataBtn").attr("onclick" , "auditorListCerBodiesEditDataTab("+auditorListCerBodiesVal+")");
	}
	function auditorListCerBodiesEditDataTab(auditorListCerBodiesVal){
		addAuditorListCerBodiesData(auditorListCerBodiesVal);
		$(".auditorNameCerBodies" + auditorListCerBodiesVal).html($("#editAuditorNameCerBodies"+auditorListCerBodiesVal).val());
		$(".auditorRoleCerBodies" + auditorListCerBodiesVal).html($("#editAuditorRoleCerBodies"+auditorListCerBodiesVal).val());
		$(".auditorCerBodiesStandard" + auditorListCerBodiesVal).html($("#editAuditorCerBodiesStandard"+auditorListCerBodiesVal).val());
		$(".auditorExpertiseAreaCerBodies" + auditorListCerBodiesVal).html($("#editAuditorExpertiseAreaCerBodies"+auditorListCerBodiesVal).val());
		$(".editAuditorNameCerBodies").val("");
		$(".editAuditorRoleCerBodies").val("");
		$(".editAuditorCerBodiesStandard").val("");
		$(".editAuditorExpertiseAreaCerBodies").val("");
	}
	function auditorListCerBodiesDeleteData(auditorListCerBodiesValData) {
		  var auditorListCerBodiesCountCounter = $("#auditorListCerBodiesVal").val();
		  $("#auditorListCerBodiesVal").val(auditorListCerBodiesCountCounter - 1);
		  var delRowElement = $(".auditor-list-bodies-row" + auditorListCerBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(auditorListCerBodiesValData) + 1;
		  for (var i = j; i <= auditorListCerBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".auditor-list-bodies-row" + i);
		    rowElement.attr("class", "auditor-list-bodies-row" + prevCounter);
		    rowElement.find("td.auditorNameCerBodies"+i).removeClass("auditorNameCerBodies"+i).addClass("auditorNameCerBodies"+prevCounter);
		    rowElement.find("td.auditorRoleCerBodies"+i).removeClass("auditorRoleCerBodies"+i).addClass("auditorRoleCerBodies"+prevCounter);
			rowElement.find("td.auditorCerBodiesStandard"+i).removeClass("auditorCerBodiesStandard"+i).addClass("auditorCerBodiesStandard"+prevCounter);
			rowElement.find("td.auditorExpertiseAreaCerBodies"+i).removeClass("auditorExpertiseAreaCerBodies"+i).addClass("auditorExpertiseAreaCerBodies"+prevCounter);
		    rowElement.find("#auditorListCerBodiesDeleteDataTab").attr('onclick', 'auditorListCerBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#auditorListCerBodiesEditTab").attr('onclick', 'auditorListCerBodiesEditTab(' +prevCounter+ ')');
		  }
	}
function addOutsourceActNatureCerBodies(){
		outsourceActNatureCerBodiesVal = $("#outsourceActNatureCerBodiesVal").val();
		 outsourcedActivityCerBodies = $("#outsourcedActivityCerBodies").val();
		 serviceProvdierCerBodies = $("#serviceProvdierCerBodies").val();
   	serviceProvdierAddressCerBodies = $("#serviceProvdierAddressCerBodies").val();
		 if(outsourcedActivityCerBodies != "" || serviceProvdierCerBodies !="" || serviceProvdierAddressCerBodies != ""){
			$(".addOutsourceActNatureCerBodiesTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addOutsourceActNatureCerBodiesUrl}",
				data : {
					"<portlet:namespace/>outsourceActNatureCerBodiesVal" : outsourceActNatureCerBodiesVal,
				},
				async:false,
				success : function(data) {
					$(".addOutsourceActNatureCerBodiesTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					$(".outsourcedActivityCerBodies" + outsourceActNatureCerBodiesVal).append(outsourcedActivityCerBodies);
					$(".serviceProvdierCerBodies" + outsourceActNatureCerBodiesVal).append(serviceProvdierCerBodies);
                  $(".serviceProvdierAddressCerBodies" + outsourceActNatureCerBodiesVal).append(serviceProvdierAddressCerBodies);
					outSourcedActivitiesData("");
					outsourceActNatureCerBodiesVal++;
					$("#outsourceActNatureCerBodiesVal").val(outsourceActNatureCerBodiesVal);
					$("#outsourcedActivityCerBodies").val("");
					$("#serviceProvdierCerBodies").val("");
                  $("#serviceProvdierAddressCerBodies").val("");
				}
			});
		}else{
				$("#outsourcedActivityCerBodies").focus();
			}
	}
  function outsourceActNatureCerBodiesEditTab(outsourceActNatureCerBodiesVal){
		$(".editOutsourceActNatureCerBodiesEditTabPopup").modal("show");
		$(".editOutsourcedActivityCerBodies").attr("id" , "editOutsourcedActivityCerBodies"+outsourceActNatureCerBodiesVal);
		$(".editServiceProvdierCerBodies").attr("id" , "editServiceProvdierCerBodies"+outsourceActNatureCerBodiesVal);
		$(".editServiceProvdierAddressCerBodies").attr("id" , "editServiceProvdierAddressCerBodies"+outsourceActNatureCerBodiesVal);
		outsourcedActivityCerBodies = $(".outsourcedActivityCerBodies"+outsourceActNatureCerBodiesVal+":first").text().trim();
		serviceProvdierCerBodies = $(".serviceProvdierCerBodies"+outsourceActNatureCerBodiesVal+":first").text().trim();
		serviceProvdierAddressCerBodies = $(".serviceProvdierAddressCerBodies"+outsourceActNatureCerBodiesVal+":first").text().trim();
		$("#editOutsourcedActivityCerBodies"+outsourceActNatureCerBodiesVal).val(outsourcedActivityCerBodies);
		$("#editServiceProvdierCerBodies"+outsourceActNatureCerBodiesVal).val(serviceProvdierCerBodies);
		$("#editServiceProvdierAddressCerBodies"+outsourceActNatureCerBodiesVal).val(serviceProvdierAddressCerBodies);
		$(".saveEditOutsourceActNatureCerBodiesPopupDataBtn").attr("onclick" , "outsourceActNatureCerBodiesEditDataTab("+outsourceActNatureCerBodiesVal+")");
	}
	function outsourceActNatureCerBodiesEditDataTab(outsourceActNatureCerBodiesVal){
		$(".outsourcedActivityCerBodies" + outsourceActNatureCerBodiesVal).html($("#editOutsourcedActivityCerBodies"+outsourceActNatureCerBodiesVal).val());
		$(".serviceProvdierCerBodies" + outsourceActNatureCerBodiesVal).html($("#editServiceProvdierCerBodies"+outsourceActNatureCerBodiesVal).val());
		$(".serviceProvdierAddressCerBodies" + outsourceActNatureCerBodiesVal).html($("#editServiceProvdierAddressCerBodies"+outsourceActNatureCerBodiesVal).val());
		$(".editOutsourcedActivityCerBodies").val("");
		$(".editServiceProvdierCerBodies").val("");
		$(".editServiceProvdierAddressCerBodies").val("");
	}
	function outsourceActNatureCerBodiesDeleteData(outsourceActNatureCerBodiesValData) {
		  var outsourceActNatureCerBodiesCountCounter = $("#outsourceActNatureCerBodiesVal").val();
		  $("#outsourceActNatureCerBodiesVal").val(outsourceActNatureCerBodiesCountCounter - 1);
		  var delRowElement = $(".outsource-act-nature-cer-product-row" + outsourceActNatureCerBodiesValData); 
		  delRowElement.remove();
		  var j = parseInt(outsourceActNatureCerBodiesValData) + 1;
		  for (var i = j; i <= outsourceActNatureCerBodiesCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".outsource-act-nature-cer-product-row" + i);
		    rowElement.attr("class", "outsource-act-nature-cer-product-row" + prevCounter);
		    rowElement.find("td.outsourcedActivityCerBodies"+i).removeClass("outsourcedActivityCerBodies"+i).addClass("outsourcedActivityCerBodies"+prevCounter);
		    rowElement.find("td.serviceProvdierCerBodies"+i).removeClass("serviceProvdierCerBodies"+i).addClass("serviceProvdierCerBodies"+prevCounter);
			 rowElement.find("td.serviceProvdierAddressCerBodies"+i).removeClass("serviceProvdierAddressCerBodies"+i).addClass("serviceProvdierAddressCerBodies"+prevCounter);
		    rowElement.find("#outsourceActNatureCerBodiesDeleteDataTab").attr('onclick', 'outsourceActNatureCerBodiesDeleteData(' +prevCounter+ ')');
		    rowElement.find("#outsourceActNatureCerBodiesEditTab").attr('onclick', 'outsourceActNatureCerBodiesEditTab(' +prevCounter+ ')');
		  }
	}
	function addPersonResponsibleCerDetailData(counter) {
		if (counter != "") {
			uniqueId = $("#personResponsibleCerId" + counter).val();
			certificationBodiesAppliName = $("#technicalPersonNameCer" + counter).val();
			certificationBodiesAppliEmail = $("#technicalPersonEmailCer" + counter).val();
		} else {
			uniqueId = $("#personResponsibleCerId").val();
			certificationBodiesAppliName = $("#technicalPersonNameCer").val();
			certificationBodiesAppliEmail = $("#technicalPersonEmailCer").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfCerBodiesOfAppliInfo = $("#personResponsibleCerVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonResponsibleCerDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>certificationBodiesAppliName" : certificationBodiesAppliName,
						"<portlet:namespace/>certificationBodiesAppliEmail" : certificationBodiesAppliEmail,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfCerBodiesOfAppliInfo" : counterOfCerBodiesOfAppliInfo,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personResponsibleCerId" + counter).val(
								result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
function addRegisteredClientOrgDetailData(counter){
		if (counter != "") {
			uniqueId = $("#registeredClientOrgId" + counter).val();
			clientOrganization = $("#clientOrganization" + counter).val();
			certificationStandard = $("#certificationStandard" + counter).val();
			currentCertification = $("#currentCertification" + counter).val();
			clientOrgDate = $("#clientOrgDate" + counter).val();
		} else {
			registeredClientOrgId = $("#registeredClientOrgId").val();
			clientOrganization = $("#clientOrganization").val();
			certificationStandard = $("#certificationStandard").val();
			currentCertification = $("#currentCertification").val();
			clientOrgDate = $("#clientOrgDate").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfScope = $("#registeredClientOrgVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addRegisteredClientOrgDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>clientOrganization" : clientOrganization,
						"<portlet:namespace/>certificationStandard" : certificationStandard,
						"<portlet:namespace/>currentCertification" : currentCertification,
						"<portlet:namespace/>clientOrgDate" : clientOrgDate,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfScope" : counterOfScope,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#registeredClientOrgId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
function addStaffDetailCertificationData(counter) {
		if (counter != "") {
			uniqueId = $("#staffDetailCertificationId" + counter).val();
			name = $("#staffNameCertification" + counter).val();
			jobTitle = $("#jobTitleCertification" + counter).val();
			majorResponsibilities= $("#majorResponsibilitiesCertification" + counter).val();
			specificFunction= $("#specificFunctionCertification" + counter).val();
		 }else {
			 uniqueId = $("#staffDetailCertificationId").val();
			 name = $("#staffNameCertification").val();
			 jobTitle = $("#jobTitleCertification").val();
			 majorResponsibilities = $("#majorResponsibilitiesCertification").val();
			 specificFunction = $("#specificFunctionCertification").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelFirst = $("#staffDetailCertificationVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailCertificationDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
						"<portlet:namespace/>specificFunction" : specificFunction,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelFirst" : counterOfPersonnelFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailCertificationId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
function addAuditorListData(counter) {
		if (counter != "") {
			uniqueId = $("#auditorListId" + counter).val();
			name = $("#auditorName" + counter).val();
			role = $("#auditorRole" + counter).val();
			certificationStandard = $(	"#auditorCertificationStandard" + counter).val();
			expertiseArea = $("#auditorExpertiseArea" + counter).val();
		} else {
			uniqueId = $("#auditorListId").val();
			name = $("#auditorName").val();
			role = $("#auditorRole").val();
			certificationStandard = $("#auditorCertificationStandard").val();
			expertiseArea = $("#auditorExpertiseArea").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelSec = $("#auditorListVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addAuditorListDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/> role" : role,
						"<portlet:namespace/>certificationStandard" : certificationStandard,
						"<portlet:namespace/>expertiseArea" : expertiseArea,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelSec" : counterOfPersonnelSec,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#auditorListId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addActivityPerformLocationsData(counter) {
		if (counter != "") {
			activityPerformLocationsId = $("#activityPerformLocationsId" + counter).val();
			activityPerformNum = $("#activityPerformNum" + counter).val();
			activityPerformLoc = $("#activityPerformLoc" + counter).val();
			activityPerformCertLoc = $("#activityPerformCertLoc" + counter).val();
			activityPerformContact = $("#activityPerformContact" + counter).val();
		 }else{
			activityPerformLocationsId = $("#activityPerformLocationsId").val();
			activityPerformNum = $("#activityPerformNum").val();
			activityPerformLoc = $("#activityPerformLoc").val();
			activityPerformCertLoc = $("#activityPerformCertLoc").val();
			activityPerformContact = $("#activityPerformContact").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterActivityPerformLocationsVal = $("#activityPerformLocationsVal")
				.val();
		$
				.ajax({
					type : "POST",
					url : "${addActivityPerformLocationsDataUrl}",
					data : {
						"<portlet:namespace/>activityPerformNum" : activityPerformNum,
						"<portlet:namespace/>activityPerformLoc" : activityPerformLoc,
						"<portlet:namespace/>activityPerformCertLoc" : activityPerformCertLoc,
						"<portlet:namespace/>activityPerformContact" : activityPerformContact,
						"<portlet:namespace/>activityPerformLocationsId" : activityPerformLocationsId,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterActivityPerformLocationsVal" : counterActivityPerformLocationsVal,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#activityPerformLocationsId" + counter).val(result["activityPerformLocationsId"]);
					},
					error : function(data) {
					}
				});
	}
	function addPersonResponsibleCerBodiesDetailData(counter) {
		if (counter != "") {
			uniqueId = $("#personResponsibleCerBodiesId" + counter).val();
			certificationBodiesAppliName = $("#technicalPersonNameCerBodies" + counter).val();
			certificationBodiesAppliEmail = $("#technicalPersonEmailCerBodies" + counter).val();
		} else {
			uniqueId = $("#personResponsibleCerBodiesId").val();
			certificationBodiesAppliName = $("#technicalPersonNameCerBodies").val();
			certificationBodiesAppliEmail = $("#technicalPersonEmailCerBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfCerBodiesOfAppliInfo = $("#personResponsibleCerBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonResponsibleCerBodiesDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>certificationBodiesAppliName" : certificationBodiesAppliName,
						"<portlet:namespace/>certificationBodiesAppliEmail" : certificationBodiesAppliEmail,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfCerBodiesOfAppliInfo" : counterOfCerBodiesOfAppliInfo,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personResponsibleCerBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addRegisteredClientOrgCerBodiesDetailData(counter) {
		if (counter != "") {
			registeredClientOrgCerBodiesId = $("#registeredClientOrgCerBodiesId" + counter).val();
			clientOrganizationNameCerBodies = $("#clientOrganizationNameCerBodies" + counter).val();
			clientOrganizationAddressCerBodies = $("#clientOrganizationAddressCerBodies" + counter).val();
			certificationStandardCerBodies = $("#certificationStandardCerBodies" + counter).val();
			currentStatusCerBodies = $("#currentStatusCerBodies" + counter).val();
			firstGrantedDateCerBodies = $("#firstGrantedDateCerBodies" + counter).val();
			examinationDateCerBodies = $("#examinationDateCerBodies" + counter).val();
		} else {
			registeredClientOrgCerBodiesId = $("#registeredClientOrgCerBodiesId").val();
			clientOrganizationNameCerBodies = $("#clientOrganizationNameCerBodies").val();
			clientOrganizationAddressCerBodies = $("#clientOrganizationAddressCerBodies").val();
			certificationStandardCerBodies = $("#certificationStandardCerBodies").val();
			currentStatusCerBodies = $("#currentStatusCerBodies").val();
			firstGrantedDateCerBodies = $("#firstGrantedDateCerBodies").val();
			examinationDateCerBodies = $("#examinationDateCerBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterRegisteredClientOrgCerBodies = $("#registeredClientOrgCerBodies").val();
		$.ajax({
					type : "POST",
					url : "${addRegisteredClientOrgCerBodiesDetailDataUrl}",
					data : {
						"<portlet:namespace/>clientOrganizationNameCerBodies" : clientOrganizationNameCerBodies,
						"<portlet:namespace/>clientOrganizationAddressCerBodies" : clientOrganizationAddressCerBodies,
						"<portlet:namespace/>certificationStandardCerBodies" : certificationStandardCerBodies,
						"<portlet:namespace/>currentStatusCerBodies" : currentStatusCerBodies,
						"<portlet:namespace/>firstGrantedDateCerBodies" : firstGrantedDateCerBodies,
						"<portlet:namespace/>examinationDateCerBodies" : examinationDateCerBodies,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterRegisteredClientOrgCerBodies" : counterRegisteredClientOrgCerBodies,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#registeredClientOrgCerBodiesId" + counter).val(
								result["registeredClientOrgCerBodiesId"]);
					},
					error : function(data) {
					}
				});
	}
	function addStaffDetailCerBodiesData(counter) {
		if (counter != "") {
			uniqueId = $("#staffDetailCerBodiesId" + counter).val();
			name = $("#staffNameCerBodies" + counter).val();
			jobTitle = $("#jobTitleCerBodies" + counter).val();
			majorResponsibilities = $("#majorResponsibilitiesCerBodies" + counter).val();
			specificFunction = $("#specificFunctionCerBodies" + counter).val();
		}else {
			uniqueId = $("#staffDetailCerBodiesId").val();
			name = $("#staffNameCerBodies").val();
			jobTitle = $("#jobTitleCerBodies").val();
			majorResponsibilities = $("#majorResponsibilitiesCerBodies").val();
			specificFunction = $("#specificFunctionCerBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelFirst = $("#staffDetailCerBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailCerBodiesDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
						"<portlet:namespace/>specificFunction" : specificFunction,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelFirst" : counterOfPersonnelFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailCerBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addAuditorListCerBodiesData(counter) {
		if (counter != "") {
			uniqueId = $("#auditorListCerBodiesId" + counter).val();
			name = $("#auditorNameCerBodies" + counter).val();
			role = $("#auditorRoleCerBodies" + counter).val();
			certificationStandard = $("#auditorCerBodiesStandard" + counter).val();
			expertiseArea = $("#auditorExpertiseAreaCerBodies" + counter).val();
		} else {
			uniqueId = $("#auditorListCerBodiesId").val();
			name = $("#auditorNameCerBodies").val();
			role = $("#auditorRoleCerBodies").val();
			certificationStandard = $("#auditorCerBodiesStandard").val();
			expertiseArea = $("#auditorExpertiseAreaCerBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelSec = $("#auditorListCerBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addAuditorListCerBodiesDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>role" : role,
						"<portlet:namespace/>certificationStandard" : certificationStandard,
						"<portlet:namespace/>expertiseArea" : expertiseArea,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelSec" : counterOfPersonnelSec,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#auditorListCerBodiesId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addPersonResponsibleCerProductDetailData(counter) {
		if (counter != "") {
			uniqueId = $("#personResponsibleCerProductId" + counter).val();
			certificationBodiesAppliName = $(
					"#technicalPersonNameCerProduct" + counter).val();
			technicalPersonEmailCerProduct = $(
					"#technicalPersonEmailCerProduct" + counter).val();
		} else {
			uniqueId = $("#personResponsibleCerProductId").val();
			certificationBodiesAppliName = $("#technicalPersonNameCerProduct")
					.val();
			certificationBodiesAppliEmail = $("#technicalPersonEmailCerProduct").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfCerBodiesOfAppliInfo = $("#personResponsibleCerProductVal")
				.val();
		$
				.ajax({
					type : "POST",
					url : "${addPersonResponsibleCerProductDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>certificationBodiesAppliName" : certificationBodiesAppliName,
						"<portlet:namespace/>certificationBodiesAppliEmail" : certificationBodiesAppliEmail,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfCerBodiesOfAppliInfo" : counterOfCerBodiesOfAppliInfo,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#personResponsibleCerProductId" + counter).val(
								result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addRegisteredClientOrgCerProductDetailData(counter) {
		if (counter != "") {
			uniqueId = $("#registeredClientOrgCerProductId" + counter).val();
			clientOrganization = $("#clientOrganizationCerProduct" + counter).val();
			certificationStandard = $("#certificationStandardCerProduct" + counter).val();
			currentCertification = $("#currentCertificationCerProduct" + counter).val();
			clientOrgDate = $("#clientOrgDateCerProduct" + counter).val();
		} else {
			uniqueId = $("#registeredClientOrgCerProductId").val();
			clientOrganization = $("#clientOrganizationCerProduct").val();
			certificationStandard = $("#certificationStandardCerProduct").val();
			currentCertification = $("#currentCertificationCerProduct").val();
			clientOrgDate = $("#clientOrgDateCerProduct").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfScope = $("#registeredClientOrgCerProductVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addRegisteredClientOrgCerProductDetailDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>clientOrganization" : clientOrganization,
						"<portlet:namespace/>certificationStandard" : certificationStandard,
						"<portlet:namespace/>currentCertification" : currentCertification,
						"<portlet:namespace/>clientOrgDate" : clientOrgDate,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfScope" : counterOfScope,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#registeredClientOrgCerProductId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addStaffDetailCerProductData(counter) {
		if (counter != "") {
			uniqueId = $("#staffDetailCerProductId" + counter).val();
			name = $("#staffNameCerProduct" + counter).val();
			jobTitle = $("#jobTitleCerProduct" + counter).val();
			majorResponsibilities = $("#majorResponsibilitiesCerProduct" + counter).val();
			specificFunction = $("#specificFunctionCerProduct" + counter).val();
		} else {
			uniqueId = $("#staffDetailCerProductId").val();
			name = $("#staffNameCerProduct").val();
			jobTitle = $("#jobTitleCerProduct").val();
			majorResponsibilities = $("#majorResponsibilitiesCerProduct").val();
			specificFunction = $("#specificFunctionCerProduct").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelFirst = $("#staffDetailCerProductVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addStaffDetailCerProductDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>jobTitle" : jobTitle,
						"<portlet:namespace/>majorResponsibilities" : majorResponsibilities,
						"<portlet:namespace/>specificFunction" : majorResponsibilities,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelFirst" : counterOfPersonnelFirst,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#staffDetailCerProductId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function addAuditorListCerProductData(counter) {
		if (counter != "") {
			uniqueId = $("#auditorListCerProductId" + counter).val();
			name = $("#auditorNameCerProduct" + counter).val();
			role = $("#auditorRoleCerProduct" + counter).val();
			certificationStandard = $("#auditorCertificationStandardCerProduct" + counter).val();
			expertiseArea = $("#auditorExpertiseAreaCerProduct" + counter).val();
		}else {
			uniqueId = $("#auditorListCerProductId").val();
			name = $("#auditorNameCerProduct").val();
			role = $("#auditorRoleCerProduct").val();
			certificationStandard = $("#auditorCertificationStandardCerProduct").val();
			expertiseArea = $("#auditorExpertiseAreaCerProduct").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfPersonnelSec = $("#auditorListCerProductVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addAuditorListCerProductDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>name" : name,
						"<portlet:namespace/>role" : role,
						"<portlet:namespace/>certificationStandard" : certificationStandard,
						"<portlet:namespace/>expertiseArea" : expertiseArea,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						"<portlet:namespace/>counterOfPersonnelSec" : counterOfPersonnelSec,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#auditorListCerProductId" + counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function outSourcedActivitiesData(counter) {
		if (counter != "") {
			uniqueId = $("#outsourceActNatureCerBodiesId").val();
			outsourcedActivityCerBodies = $("#outsourcedActivityCerBodies"+counter).val();
			serviceProvdierCerBodies = $("#serviceProvdierCerBodies"+counter).val();
	     	serviceProvdierAddressCerBodies = $("#serviceProvdierAddressCerBodies"+counter).val();
		} else {
			uniqueId = $("#outsourceActNatureCerBodiesId").val();
			outsourcedActivityCerBodies = $("#outsourcedActivityCerBodies").val();
			serviceProvdierCerBodies = $("#serviceProvdierCerBodies").val();
	     	serviceProvdierAddressCerBodies = $("#serviceProvdierAddressCerBodies").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfoutsourceActNatureCerBodies = $("#outsourceActNatureCerBodiesVal").val();
		$
				.ajax({
					type : "POST",
					url : "${outSourcedActivitiesDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>outsourcedActivityCerBodies" : outsourcedActivityCerBodies,
						"<portlet:namespace/>serviceProvdierCerBodies" : serviceProvdierCerBodies,
						"<portlet:namespace/>serviceProvdierAddressCerBodies" : serviceProvdierAddressCerBodies,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						
						"<portlet:namespace/>counterOfoutsourceActNatureCerBodies" : counterOfoutsourceActNatureCerBodies,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#outsourceActNatureCerBodiesId" + counter).val(
								result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	function outsourceNatureCertProductData(counter) {
		if (counter != "") {
			uniqueId = $("#outsourceActNatureCertProductId").val();
			
			outsourcedActivityCerBodies = $("#outsourcedActivityCertProduct"+counter).val();
			serviceProvdierCerBodies = $("#serviceProvdierCertProduct"+counter).val();
	     	serviceProvdierAddressCerBodies = $("#activityPerformLocCertProduct"+counter).val();
		} else {
			uniqueId = $("#outsourceActNatureCertProductId").val();
			
			outsourcedActivityCerBodies = $("#outsourcedActivityCertProduct").val();
			serviceProvdierCerBodies = $("#serviceProvdierCertProduct").val();
	     	serviceProvdierAddressCerBodies = $("#activityPerformLocCertProduct").val();
		}
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfoutsourceActNatureCerBodies = $("#outsourceActNatureCertProductVal").val();
		$
				.ajax({
					type : "POST",
					url : "${outSourcedActivitiesDataUrl}",
					data : {
						"<portlet:namespace/>uniqueId" : uniqueId,
						"<portlet:namespace/>outsourcedActivityCerBodies" : outsourcedActivityCerBodies,
						"<portlet:namespace/>serviceProvdierCerBodies" : serviceProvdierCerBodies,
						"<portlet:namespace/>serviceProvdierAddressCerBodies" : serviceProvdierAddressCerBodies,
						"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
						
						"<portlet:namespace/>counterOfoutsourceActNatureCerBodies" : counterOfoutsourceActNatureCerBodies,
					},
					success : function(data) {
						var result = data.APP_DATA;
						var counter = result["counter"];
						$("#outsourceActNatureCertProductId" + counter).val(
								result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
	
	function addOutsourceActNatureData(counter) {
		if (counter != "") {
		uniqueId = $("#outsourceActNatureId" + counter).val();
  	outSourcedActivity = $("#outsourcedActivity"+ counter).val();
	    supplierServicePro = $("#serviceProvdier"+ counter).val();
		} else {
			uniqueId = $("#outsourceActNatureId").val();
	    	outSourcedActivity = $("#outsourcedActivity").val();
		    supplierServicePro = $("#serviceProvdier").val();
		    }
		janaacApplicationId = $("#janaacApplicationId").val();
		counterOfFdaPersonalThird=$("#outsourceActNatureVal").val();
		$
				.ajax({
					type : "POST",
					url : "${addOutsourceActNatureSecCatDataUrl}",
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
						$("#outsourceActNatureId"+counter).val(result["uniqueId"]);
					},
					error : function(data) {
					}
				});
	}
</script>