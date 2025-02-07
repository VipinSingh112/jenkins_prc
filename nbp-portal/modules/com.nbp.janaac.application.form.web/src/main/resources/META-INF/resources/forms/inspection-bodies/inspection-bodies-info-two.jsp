<%@ include file="../../init.jsp" %>
<!-- Human Resources Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep50">
	<div class="tab-form">
		<div class="human-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Human Resources</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.0</span> Kindly provide signed curriculum vitae for 
						each key member of staff (CLAUSE 6.1.3)</p>
						<div class="supporting-document-card my-3">
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach
												File</p>
										</div>
										<div class="right">
											<input type="file" id="keyMemberResumeInsBodies" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>keyMemberResumeInsBodies"> 
											<label class="custom-upload" for="keyMemberResumeInsBodies"> 
												<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																fill="#047247"></path> 
		                                				 </svg>
												</span>Upload
											</label>
										</div>
									</div>
									<%if(Validator.isNotNull(resumeHumanIns)){ %>
												<span class="attach-detailed-overview"><%=resumeHumanIns%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="applicantInfo();"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep51">
	<div class="tab-form">
		<div class="physical-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">III. Physical Resources - Facilities, Equipment</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<input id="majorEquipmentInsBodiesVal" type="hidden" name="majorEquipmentInsBodiesVal" value="1">
						<div class="accordion secured-accordian"
							id="majorEquipmentInsBodiesDetailBox">
							<div class="accordion__header is-active"
								id="majorEquipmentInsBodiesDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>11.0 List the major equipment used in the inspection(s) for which accreditation is being sought as well as 
											the individual responsible for each equipment. Include equipment contracted for use by the inspection body 
											(CLAUSE 6.2.1).</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Inventory Number</p>
											<input type="text" class="form-control" id="inventoryInsBodies" value="" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Item</p>
											<input type="text" class="form-control"
												id="itemInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Manufacturer</p>
											<input type="text" class="form-control"
												id="manufacturerInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Model Number</p>
											<input type="text" class="form-control"
												id="modelInsBodies" value="" placeholder=""
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Calibration Interval</p>
											<input type="text" class="form-control"
												id="calibrationIntervalInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Calibrated By</p>
											<input type="text" class="form-control"
												id="calibratedByInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addMajorEquipmentInsBodiesDetail" onclick="addMajorEquipmentInsBodiesDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-12 table-responsive hide addMajorEquipmentInsBodiesDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addMajorEquipmentInsBodiesDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">Inventory Number</th>
									<th class="sub_heading text-nowrap">Item</th>
									<th class="sub_heading text-nowrap">Manufacturer</th>
									<th class="sub_heading text-nowrap">Model Number</th>
									<th class="sub_heading text-nowrap">Calibration Interval</th>
									<th class="sub_heading text-nowrap">Calibrated By</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
								
<% if(phyResourceFirst!=null){
long phyResourceFirstAddCounter=1;
for(AddPhyResourceFirst phyResourceFirstAdd:phyResourceFirst){
%>								
<tr class="major-equipment-ins-bodies-row<%=phyResourceFirstAddCounter%>">
<td class="sub_heading_content inventoryInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getInventoryNumber())?phyResourceFirstAdd.getInventoryNumber():""%></td>
<td class="sub_heading_content itemInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getItem())?phyResourceFirstAdd.getItem():""%></td>
<td class="sub_heading_content manufacturerInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getManufacturer())?phyResourceFirstAdd.getManufacturer():""%></td>
<td class="sub_heading_content modelInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getModelNumber())?phyResourceFirstAdd.getModelNumber():""%></td>
<td class="sub_heading_content calibrationIntervalInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getCalibrationInterval())?phyResourceFirstAdd.getCalibrationInterval():""%></td>
<td class="sub_heading_content calibratedByInsBodies<%=phyResourceFirstAddCounter%>">
<%=Validator.isNotNull(phyResourceFirstAdd)&&Validator.isNotNull(phyResourceFirstAdd.getCalibratedBy())?phyResourceFirstAdd.getCalibratedBy():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="majorEquipmentInsBodiesEditTab" onclick="majorEquipmentInsBodiesEditTab('<%=phyResourceFirstAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="majorEquipmentInsBodiesDeleteDataTab" onclick="majorEquipmentInsBodiesDeleteData('<%=phyResourceFirstAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>									
     <input type="hidden" id="majorEquipmentInsBodiesId<%=phyResourceFirstAddCounter%>" name="majorEquipmentInsBodiesId<%=phyResourceFirstAddCounter%>" value="<%=phyResourceFirstAdd.getAddPhyResourceFirstId()%>">
				<%
						phyResourceFirstAddCounter++;
						}
}
					%>	
							</tbody>
						</table>
					</div>
					
					<div class="col-md-12">
					<input id="applicationActivityLocInsBodiesVal" type="hidden" name="applicationActivityLocInsBodiesVal" value="1">
						<div class="accordion secured-accordian"
							id="applicationActivityLocInsBodiesDetailBox">
							<div class="accordion__header is-active"
								id="applicationActivityLocInsBodiesDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>12.0 If your application covers activities performed at more than one location (including virtual sites if applicable),
											 provide details in the table below:</h2>
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
											<p class="tab-form-main-heading">No.</p>
											<input type="text" class="form-control"
												id="numberInsBodies" value="" placeholder=""
												oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Location/Address</p>
											<textarea rows="3" id="applicationActivityAddressInsBodies" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Activities performed at location</p>
											<input type="text" class="form-control" id="activityPerformedLocInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Contact Details</p>
											<input type="text" class="form-control"
												id="contactDetailsInsBodies" value="" placeholder="">
										</div>
									</div>
									
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addApplicationActivityLocInsBodiesDetail" onclick="addApplicationActivityLocInsBodiesDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-12 table-responsive hide addApplicationActivityLocInsBodiesDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addApplicationActivityLocInsBodiesDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">No.</th>
									<th class="sub_heading text-nowrap">Location/Address</th>
									<th class="sub_heading text-nowrap">Activities performed at location</th>
									<th class="sub_heading text-nowrap">Contact Details</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
								
<% if(phyResourceSecond!=null){
long phyResourceSecondAddCounter=1;
for(AddPhyResourceSec phyResourceSecondAdd:phyResourceSecond){
%>										
<tr class="application-activity-loc-ins-bodies-row<%=phyResourceSecondAddCounter%>">
<td class="sub_heading_content numberInsBodies<%=phyResourceSecondAddCounter%>">
<%=Validator.isNotNull(phyResourceSecondAdd)&&Validator.isNotNull(phyResourceSecondAdd.getNumber())?phyResourceSecondAdd.getNumber():""%></td>
<td class="sub_heading_content applicationActivityAddressInsBodies<%=phyResourceSecondAddCounter%>">
<%=Validator.isNotNull(phyResourceSecondAdd)&&Validator.isNotNull(phyResourceSecondAdd.getLocation())?phyResourceSecondAdd.getLocation():""%></td>
<td class="sub_heading_content activityPerformedLocInsBodies<%=phyResourceSecondAddCounter%>">
<%=Validator.isNotNull(phyResourceSecondAdd)&&Validator.isNotNull(phyResourceSecondAdd.getActivitiesPerformed())?phyResourceSecondAdd.getActivitiesPerformed():""%></td>
<td class="sub_heading_content contactDetailsInsBodies<%=phyResourceSecondAddCounter%>">
<%=Validator.isNotNull(phyResourceSecondAdd)&&Validator.isNotNull(phyResourceSecondAdd.getContactDetails())?phyResourceSecondAdd.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="applicationActivityLocInsBodiesEditTab" onclick="applicationActivityLocInsBodiesEditTab('<%=phyResourceSecondAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="applicationActivityLocInsBodiesDeleteDataTab" onclick="applicationActivityLocInsBodiesDeleteData('<%=phyResourceSecondAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>									
     <input type="hidden" id="applicationActivityLocInsBodiesId<%=phyResourceSecondAddCounter%>" name="applicationActivityLocInsBodiesId<%=phyResourceSecondAddCounter%>" value="<%=phyResourceSecondAdd.getAddPhyResourceSecId()%>">
						<%
							phyResourceSecondAddCounter++;
						}
}
					%>									
							</tbody>
						</table>
					</div>
				
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.0</span> Describe the Inspection Body's facilities in terms of type of lighting, power and water 
							supplies, etc. (CLAUSE 6.2.1):</p>
							<textarea rows="3" id="insBodyFacility" class="form-control" maxlength="255" placeholder="Enter Inspection Body's facilities" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(insBodiesPhyResource)&&Validator.isNotNull(insBodiesPhyResource.getInsBodiesfacilities())?insBodiesPhyResource.getInsBodiesfacilities():""%></textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0</span> What are the safety features and related equipment of 
							the inspection body (e.g. fire protection, alarms, hazardous indications, personal protective equipment, etc.) 
							(CLAUSE 6.2.1)? Please list:</p>
							<textarea rows="3" id="safetyFeaturesInsBodies" class="form-control" maxlength="255" placeholder="Enter safety features and related equipment" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(insBodiesPhyResource)&&Validator.isNotNull(insBodiesPhyResource.getInsSafetyFeatures())?insBodiesPhyResource.getInsSafetyFeatures():""%></textarea>
							</textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.0</span> What are the security arrangements to prevent 
							unauthorized access to the inspection body's facilities (CLAUSE 6.2.2)?</p>
							<textarea rows="3" id="securityArrangmentInsBodies" class="form-control" maxlength="255" placeholder="Describe Security Arrangements" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(insBodiesPhyResource)&&Validator.isNotNull(insBodiesPhyResource.getInsSecurityArrangements())?insBodiesPhyResource.getInsSecurityArrangements():""%></textarea>
							</textarea>
						</div>
					</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accInsBodiesPhysicalResource(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>
<!-- Physical Resources Form End-->