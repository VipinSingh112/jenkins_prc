<%@ include file="../../init.jsp" %>
   <div class="tab-pane" role="tabpanel" id="childStep6">
	<div class="tab-form">
		<div class="physical-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">III. Physical Resources -
						Facilities, Equipment, Materials</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<input id="majorEquipmentVal" type="hidden"
						name="majorEquipmentVal" value="1">
					<div class="accordion secured-accordian"
						id="majorEquipmentDetailBox">
						<div class="accordion__header is-active"
							id="majorEquipmentDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>10.0 List the major equipment used in the
											examination for which accreditation is being sought as well
											as the individual responsible for each equipment. Include
											equipment contracted for use by the Laboratory (CLAUSE
											6.4).</h2>
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
										<input type="text" class="form-control" id="inventory"
											value="" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Item</p>
										<input type="text" class="form-control" id="item" value=""
											placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Manufacturer</p>
										<input type="text" class="form-control" id="manufacturer"
											value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Model Number</p>
										<input type="text" class="form-control" id="model" value=""
											placeholder=""
											oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibration Interval/pm</p>
										<input type="text" class="form-control"
											id="calibrationInterval" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibrated By</p>
										<input type="text" class="form-control" id="calibratedBy"
											value="" placeholder="">
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addMajorEquipmentDetail"
										onclick="addMajorEquipmentDetail();"> <span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addMajorEquipmentDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addMajorEquipmentDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Inventory Number</th>
								<th class="sub_heading text-nowrap">Item</th>
								<th class="sub_heading text-nowrap">Manufacturer</th>
								<th class="sub_heading text-nowrap">Model Number</th>
								<th class="sub_heading text-nowrap">Calibration
									Interval/pm</th>
								<th class="sub_heading text-nowrap">Calibrated By</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labMedicalPhysicalFirstAdd!=null){
long LabMedicalPhysicalFirstCounter=1;
for(AddLabMedicalPhysicalFirst labMedicalPhysicalFirstInfo:labMedicalPhysicalFirstAdd){
%>
<tr class="major-equipment-row<%=LabMedicalPhysicalFirstCounter%>">
<td class="sub_heading_content inventory<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getInventoryNum())?labMedicalPhysicalFirstInfo.getInventoryNum():""%></td>
<td class="sub_heading_content item<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getItem())?labMedicalPhysicalFirstInfo.getItem():""%></td>
<td class="sub_heading_content manufacturer<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getManufacturer())?labMedicalPhysicalFirstInfo.getManufacturer():""%></td>
<td class="sub_heading_content model<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getModelNum())?labMedicalPhysicalFirstInfo.getModelNum():""%></td>
<td class="sub_heading_content calibrationInterval<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getCalibrationInterval())?labMedicalPhysicalFirstInfo.getCalibrationInterval():""%></td>
<td class="sub_heading_content calibratedBy<%=LabMedicalPhysicalFirstCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalFirstInfo)&&Validator.isNotNull(labMedicalPhysicalFirstInfo.getCalibratedBy())?labMedicalPhysicalFirstInfo.getCalibratedBy():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="majorEquipmentEditTab" onclick="majorEquipmentEditTab('<%=LabMedicalPhysicalFirstCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="majorEquipmentDeleteDataTab" onclick="majorEquipmentDeleteData('<%=LabMedicalPhysicalFirstCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="majorEquipmentId<%=LabMedicalPhysicalFirstCounter%>" name="majorEquipmentId<%=LabMedicalPhysicalFirstCounter%>" value="<%=labMedicalPhysicalFirstInfo.getAddLabMedicalPhysicalFirstId()%>">    
 <%
  LabMedicalPhysicalFirstCounter++;
						}
}
					%>									
						</tbody>
					</table>
				</div>

				<div class="col-md-12">
					<input id="applicationActivityLocVal" type="hidden"
						name="applicationActivityLocVal" value="1">
					<div class="accordion secured-accordian"
						id="applicationActivityLocDetailBox">
						<div class="accordion__header is-active"
							id="applicationActivityLocDetail"
							onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>11.0 If your application covers activities
											performed at more than one location (including virtual
											sites if applicable), provide details in the table below</h2>
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
										<input type="text" class="form-control" id="activityNumber"
											value="" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Location/Address</p>
										<textarea rows="3" id="applicationActivityAddress"
											class="form-control" maxlength="255"
											placeholder="Enter Address"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Activities performed at
											location</p>
										<textarea rows="3" id="activityPerformedLoc"
											class="form-control" maxlength="255" placeholder=""
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Contact Details</p>
										<input type="text" class="form-control"
											id="activityContactDetails" value="" placeholder="">
									</div>
								</div>

								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addApplicationActivityLocDetail"
										onclick="addApplicationActivityLocDetail();"> <span>+
											1</span> Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addApplicationActivityLocDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addApplicationActivityLocDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Activities performed
									at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labMedicalPhysicalSecAdd!=null){
long LabMedicalPhysicalSecondCounter=1;
for(AddLabMedicalPhysicalSec labMedicalPhysicalSecInfo:labMedicalPhysicalSecAdd){
	System.out.print("labMedicalPhysicalSecInfo**********"+labMedicalPhysicalSecInfo);
%>
<tr class="application-activity-loc-row<%=LabMedicalPhysicalSecondCounter%>">
<td class="sub_heading_content activityNumber<%=LabMedicalPhysicalSecondCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalSecInfo)&&Validator.isNotNull(labMedicalPhysicalSecInfo.getNumber())?labMedicalPhysicalSecInfo.getNumber():""%></td>
<td class="sub_heading_content applicationActivityAddress<%=LabMedicalPhysicalSecondCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalSecInfo)&&Validator.isNotNull(labMedicalPhysicalSecInfo.getLocation())?labMedicalPhysicalSecInfo.getLocation():""%></td>
<td class="sub_heading_content activityPerformedLoc<%=LabMedicalPhysicalSecondCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalSecInfo)&&Validator.isNotNull(labMedicalPhysicalSecInfo.getActivitiesPerformed())?labMedicalPhysicalSecInfo.getActivitiesPerformed():""%></td>
<td class="sub_heading_content activityContactDetails<%=LabMedicalPhysicalSecondCounter%>">
<%=Validator.isNotNull(labMedicalPhysicalSecInfo)&&Validator.isNotNull(labMedicalPhysicalSecInfo.getContactDetails())?labMedicalPhysicalSecInfo.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="applicationActivityLocEditTab" onclick="applicationActivityLocEditTab('<%=LabMedicalPhysicalSecondCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="applicationActivityLocDeleteDataTab" onclick="applicationActivityLocDeleteData('<%=LabMedicalPhysicalSecondCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="applicationActivityLocId<%=LabMedicalPhysicalSecondCounter%>" name="applicationActivityLocId<%=LabMedicalPhysicalSecondCounter%>" value="<%=labMedicalPhysicalSecInfo.getAddLabMedicalPhysicalSecId()%>">    
 <%
  LabMedicalPhysicalSecondCounter++;
						}
}
					%>									
						</tbody>
					</table>
				</div>

				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">12.0 </span>Describe
							the laboratory's facilities in terms of type of lighting, power
							and water supplies, monitoring of ambient conditions etc.
							(CLAUSE 6.3)
						</p>
						<textarea rows="3" id="laboratoryFacility" class="form-control"
							maxlength="255" placeholder="Enter laboratory's facilities"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getLaboratoryfacilities())?medicalPhyResource.getLaboratoryfacilities():""%>
						</textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">13.0 </span>What
							are the safety features and related equipment of the laboratory
							(e.g. fire protection, alarms, hazardous indications, chemical
							and other storage areas, eye wash stations, safety showers,
							etc.) (CLAUSE 6.3)? Please list
						</p>
						<textarea rows="3" id="safetyFeatures" class="form-control"
							maxlength="255"
							placeholder="Enter safety features and related equipment"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getSafetyFeatures())?medicalPhyResource.getSafetyFeatures():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">14.0 </span>Describe
							any special environmental conditions required for the
							examinations for which accreditation is being sought. What
							sections of the laboratory require these special environmental
							conditions (CLAUSE 6.3)? Describe these conditions, giving
							reasons
						</p>
						<textarea rows="3" id="specialEnvironmental"
							class="form-control" maxlength="255"
							placeholder="Describe any special environment conditions"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getSpecialEnvironment())?medicalPhyResource.getSpecialEnvironment():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">15.0 </span>Describe
							the environmental or other monitoring activities carried out by
							the laboratory. (CLAUSE 6.3)
						</p>
						<textarea rows="3" id="laboratoryMonitoringActivity"
							class="form-control" maxlength="255"
							placeholder="Describe Activities"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getMonitoringActivities())?medicalPhyResource.getMonitoringActivities():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">16.0 </span>What
							are the security arrangements to prevent unauthorized access to
							the laboratory's facilities (CLAUSE 6.3.2)?
						</p>
						<textarea rows="3" id="securityArrangements"
							class="form-control" maxlength="255"
							placeholder="Describe Security Arrangements"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getSecurityArrangements())?medicalPhyResource.getSecurityArrangements():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">17.0 </span>Has the
							laboratory documented the following requirements of the ISO
							15189:2022 standard?
						</p>
						<input type="text" class="form-control"
							id="laboratoryDocumented" placeholder="" value="<%=Validator.isNotNull(medicalPhyResource)&&Validator.isNotNull(medicalPhyResource.getLaboratoryDocumented())?medicalPhyResource.getLaboratoryDocumented():""%>" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName"
		onclick="accMediLabPhysicalResource(false);"
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