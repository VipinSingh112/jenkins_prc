<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusWorkFromHomeLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome"%>
<%@ include file="../init.jsp" %>
<div class="hide" id="sezWorkFromHomeApplicationForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep20">
			<div class="tab-form">
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Work From Home</p>
							<p class="tab-form-title-subtitle f2">In this section you will provide general information about Work From Home.</p>
						</div>
					</div>
					<div class="row">
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Company Name</p>
			                    <input type="text" class="form-control" id="companyNameWfh" value="<%=Validator.isNotNull(workFormHomeData)&&Validator.isNotNull(workFormHomeData.getCompanyName())?workFormHomeData.getCompanyName():""%>">
			                </div>
			            </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Contact Person's Name *</p>
								<input type="text" class="form-control"
									id="contactPersonNameWfh" value="<%=Validator.isNotNull(workFormHomeData)&&Validator.isNotNull(workFormHomeData.getContactPersonName())?workFormHomeData.getContactPersonName():""%>" oninput="workFormHomeInfoValidation();"/>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="contactPersonNameWfhValiddation" style="color: red;">Please
									Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Contact Person's Email *</p>
			                    <input type="text" class="form-control" id="contactPersonEmailWfh" value="<%=Validator.isNotNull(workFormHomeData)&&Validator.isNotNull(workFormHomeData.getContactPersonEmail())?workFormHomeData.getContactPersonEmail():""%>"
			                    placeholder="user@gmail.com"
			                	oninput="workFormHomeInfoValidation();"/>
			                    <p class="tab-form-sub-heading fieldAlert hide"
			                        id="contactPersonEmailWfhValidation" style="color: red;">Enter a valid E-mail Address</p>
			                </div>
			            </div>
						<div class="col-md-12">
							<input id="wfhLocationVal" type="hidden" name="wfhLocationVal" value="1">
							<div class="accordion secured-accordian"
								id="operatorManagerDetailBox">
								<div class="accordion__header is-active"
									id="wfhLocationDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>4. Location</h2>
											</div>
										</div>
									</div>
									<div>
										<p class="accordian-employee mb-0 common-para"></p>
									</div>
								</div>
								<div class="accordion__body is-active">
									<div class="row">
										<div class="col-md-12">
							                <div class="form-group">
							                    <p class="tab-form-main-heading">Enter the control number(s) for the location(s) you wish to apply for Work from Home program</p>
							                    <input type="text" class="form-control" id="controlNumberWfh" value="">
							                </div>
							            </div>
							            <div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Location</p>
												<textarea rows="3" id="controlNumberLocationWfh"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"
												value=""></textarea>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Parish</p>
												<div class="select-wrapper position-relative">
													<select class="form-select form-control" name="pselect"
														id="controlNumberParishWfh">
														<option value="" disabled="" selected="">Please
															Select</option>
														<option value="Kingston">Kingston</option>
														<option value="St. Andrew">St. Andrew</option>
														<option value="Portland">Portland</option>
														<option value="St. Thomas">St. Thomas</option>
														<option value="St. Catherine">St. Catherine</option>
														<option value="St Mary">St. Mary</option>
														<option value="St. Ann">St. Ann</option>
														<option value="Manchester">Manchester</option>
														<option value="Clarendon">Clarendon</option>
														<option value="Hanover">Hanover</option>
														<option value="Westmoreland">Westmoreland</option>
														<option value="St. James">St. James</option>
														<option value="Trelawny">Trelawny</option>
														<option value="St. Elizabeth">St. Elizabeth</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee" id="addWfhLocationDetail" onclick="addWfhLocationDetail();"> 
												<span>+ 1</span>
												Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-12 table-responsive hide addWfhLocationDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addWfhLocationDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Control Number</th>
										<th class="sub_heading text-nowrap">Location</th>
										<th class="sub_heading text-nowrap">Parish</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(wfhLocationAddData!=null){
	long workFromHomeCounter=1;
	for(SezStatusWFMLocationAdd wfhData:wfhLocationAddData){
%>							
<tr class="wfh-location-detail-row<%=workFromHomeCounter%>">
	<td class="sub_heading_content controlNumberWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getControlNumber())?wfhData.getControlNumber():""%>
	</td>
	<td class="sub_heading_content controlNumberLocationWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getLocation())?wfhData.getLocation():""%>
	</td>
	<td class="sub_heading_content controlNumberParishWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getParish())?wfhData.getParish():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="wfhLocationDetailEditTab" onclick="wfhLocationDetailEditTab('<%=workFromHomeCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="wfhLocationDetailDeleteData" onclick="wfhLocationDetailDeleteData('<%=workFromHomeCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="wfhLocationDetailId<%=workFromHomeCounter%>" name="wfhLocationDetailId<%=workFromHomeCounter%>" value="<%=wfhData.getSezStatusWFHLocId()%>">
</tr>
	<%
	workFromHomeCounter++;
							}
 }
						%>										
</tbody>
							</table>
						</div>
						
			            <div class="col-md-12">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>How many workers will be utillizing WFH incentive?*</p>
			                    <input type="text" class="form-control" id="workerUtillizingWFH"  value="<%=Validator.isNotNull(workFormHomeData)&&Validator.isNotNull(workFormHomeData.getWorkerUtilizingIncentive())?workFormHomeData.getWorkerUtilizingIncentive():""%>"  placeholder="Number of Workers"
			                    oninput="workFormHomeInfoValidation(); this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1')"/>
			                    <input type="text" class="form-control mt-3" id="workerMonthsUtillizingWFH"  value="<%=Validator.isNotNull(workFormHomeData)&&Validator.isNotNull(workFormHomeData.getWorkerUtilizingIncentiveMonth())?workFormHomeData.getWorkerUtilizingIncentiveMonth():""%>" placeholder="Number of Months"
			                    oninput="workFormHomeInfoValidation(); this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1')"/>
			                </div>
			            </div>
			        </div>
			     </div>
			 </div>
		</div>
	</div>
</div>
<script>
function addWorkFormHomeInfo(){
	companyName = $("#companyNameWfh").val();
	contactPersonName = $("#contactPersonNameWfh").val();
	contactPersonEmail = $("#contactPersonEmailWfh").val();
	controlNumberWorkFromHome = $("#controlNumberWfh").val();
	workerUtillizingWorkFromHome = $("#workerUtillizingWFH").val();
	workerMonthsUtillizingWFH = $("#workerMonthsUtillizingWFH").val();
	sezStatusApplicationId = $("#sezStatusApplicationId").val();
	 $.ajax({
		    type: "POST",
		    url: "${addWorkFromHomeInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>companyName": companyName,
		    	  "<portlet:namespace/>contactPersonName": contactPersonName,
		    	  "<portlet:namespace/>contactPersonEmail": contactPersonEmail,
		    	  "<portlet:namespace/>controlNumberWorkFromHome": controlNumberWorkFromHome,
		    	  "<portlet:namespace/>workerUtillizingWorkFromHome": workerUtillizingWorkFromHome,
		    	  "<portlet:namespace/>sezStatusApplicationId": sezStatusApplicationId,
		    	  "<portlet:namespace/>workerMonthsUtillizingWFH": workerMonthsUtillizingWFH,
		      		    },
		    success: function (data) { 
	    	},
		    error: function (data) {
		    },
		  });
}
function workFormHomeInfoValidation(){	
	contactPersonName = $("#contactPersonNameWfh").val();
	contactPersonEmail = $("#contactPersonEmailWfh").val();
	workerUtillizingWorkFromHome = $("#workerUtillizingWFH").val();
	workerMonthsUtillizingWFH = $("#workerMonthsUtillizingWFH").val();
	  if (contactPersonName.trim() !== "" && contactPersonEmail.trim() !== "" && workerUtillizingWorkFromHome.trim() !== "" && workerMonthsUtillizingWFH.trim() !== "") {
		  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		 if(contactPersonEmail.match(mailformat)){ 
			  $("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#contactPersonEmailWfhValidation").addClass("hide");
			}else{
				$("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#contactPersonEmailWfhValidation").removeClass("hide");
				$("#contactPersonEmailWfhValidation").text("Please enter valid E-mail address");
			}
	  } else {
		  $("#SezStatusFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}


function addWfhLocationDetail(){
	wfhLocationVal = $("#wfhLocationVal").val();
	controlNumberWfh = $("#controlNumberWfh").val();
	controlNumberLocationWfh = $("#controlNumberLocationWfh").val();
	controlNumberParishWfh = $("#controlNumberParishWfh").val();
	 if(controlNumberWfh != "" || controlNumberLocationWfh !=""){
		$(".addWfhLocationDetailTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addWfhLocationDetailInfoUrl}",
			data : {
				"<portlet:namespace/>wfhLocationVal" : wfhLocationVal,
			},
			async:false,
			success : function(data) {
				/* APPEND ROW JSP INTO TABLE */
				$(".addWfhLocationDetailTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */	
				$(".controlNumberWfh" + wfhLocationVal).append(controlNumberWfh);
				$(".controlNumberLocationWfh" + wfhLocationVal).append(controlNumberLocationWfh);
				$(".controlNumberParishWfh" + wfhLocationVal).append(controlNumberParishWfh);
				
				/* VALUE INCREAMENT */
				wfmLocationAddInfoSaving();
				wfhLocationVal++;
				$("#wfhLocationVal").val(wfhLocationVal);
				
				/* RESET FORM FIELDS */
				$("#controlNumberWfh").val("");
				$("#controlNumberLocationWfh").val("");
				$("#controlNumberParishWfh").val("");
			}
		});
	}else{
		$("#controlNumberWfh").focus();
	}
}
function wfhLocationDetailEditTab(wfhLocationVal){
	$(".editWfhLocationDetailPopup").modal("show");
	$(".editControlNumberWfh").attr("id" , "editControlNumberWfh"+wfhLocationVal);
	$(".editControlNumberLocationWfh").attr("id" , "editControlNumberLocationWfh"+wfhLocationVal);
	$(".editControlNumberParishWfh").attr("id" , "editControlNumberParishWfh"+wfhLocationVal);
	controlNumberWfh = $(".controlNumberWfh"+wfhLocationVal+":first").text().trim();
	controlNumberLocationWfh = $(".controlNumberLocationWfh"+wfhLocationVal+":first").text().trim();
	controlNumberParishWfh = $(".controlNumberParishWfh"+wfhLocationVal+":first").text().trim();
	$("#editControlNumberWfh"+wfhLocationVal).val(controlNumberWfh);
	$("#editControlNumberLocationWfh"+wfhLocationVal).val(controlNumberLocationWfh);
	$("#editControlNumberParishWfh"+wfhLocationVal).val(controlNumberParishWfh);
	$(".saveEditWfhLocationDetailPopupDataBtn").attr("onclick" , "wfhLocationDetailEditData("+wfhLocationVal+")");
}
function wfhLocationDetailEditData(wfhLocationVal){
	$(".controlNumberWfh" + wfhLocationVal).html($("#editControlNumberWfh"+wfhLocationVal).val());
	$(".controlNumberLocationWfh" + wfhLocationVal).html($("#editControlNumberLocationWfh"+wfhLocationVal).val());
	$(".controlNumberParishWfh" + wfhLocationVal).html($("#editControlNumberParishWfh"+wfhLocationVal).val());
	$(".editControlNumberWfh").val("");
	$(".editControlNumberLocationWfh").val("");
	$(".editControlNumberParishWfh").val("");
}
	
function wfhLocationDetailDeleteData(wfhLocationVal) {
	wfmLocationAddInfoSaving(wfhLocationVal);
	  var wfhLocationDetailCounter = $("#wfhLocationVal").val();
	  $("#wfhLocationVal").val(wfhLocationDetailCounter - 1);
	  var delRowElement = $(".wfh-location-detail-row" + wfhLocationVal); 
	  delRowElement.remove();
	  var j = parseInt(wfhLocationVal) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= wfhLocationDetailCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".wfh-location-detail-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "wfh-location-detail-row" + prevCounter);
	    rowElement.find("td.controlNumberWfh"+i).removeClass("controlNumberWfh"+i).addClass("controlNumberWfh"+prevCounter);
	    rowElement.find("td.controlNumberLocationWfh"+i).removeClass("controlNumberLocationWfh"+i).addClass("controlNumberLocationWfh"+prevCounter);
		rowElement.find("td.controlNumberParishWfh"+i).removeClass("controlNumberParishWfh"+i).addClass("controlNumberParishWfh"+prevCounter);
	    rowElement.find("#wfhLocationDetailEditTab").attr('onclick', 'wfhLocationDetailEditTab(' +prevCounter+ ')');
	    rowElement.find("#wfhLocationDetailDeleteData").attr('onclick', 'wfhLocationDetailDeleteData(' +prevCounter+ ')');
	  }
}
</script>