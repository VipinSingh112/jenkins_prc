<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep19">
	<div class="tab-form">
		<div class="structural-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">I. Structural Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading" id="calibrationLaboratoryLegalEntity"><span class="tab-form-highlghtme-link pr-2">1.0 </span>Is the laboratory a legal entity?</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabTestStructural!=null &&mediLabTestStructural.getTestLabLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationLaboratoryLegalEntity"> <label
									for="calibrationLaboratoryLegalEntity">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabTestStructural!=null &&mediLabTestStructural.getTestLabLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="calibrationLaboratoryLegalEntity"> <label
									for="calibrationLaboratoryLegalEntity">No</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12 calibrationLaboratoryLegalEntityBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Define the legal status (CLAUSE 5.1)</p>
						<input type="text" class="form-control" id="calibrationLaboratoryLegalEntityDefine" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestlegalStatus())?mediLabTestStructural.getTestlegalStatus():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading" id="calibrationLaboratoryPartOfTesting"><span class="tab-form-highlghtme-link pr-2">2.0 </span>Is the Calibration Laboratory a part of a larger organization that performs 
							activities other than calibration??(CLAUSE 5.1.)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabTestStructural!=null &&mediLabTestStructural.getTestlabPartOfOrg().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationLaboratoryPartOfTesting"> <label
									for="calibrationLaboratoryPartOfTesting">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabTestStructural!=null &&mediLabTestStructural.getTestlabPartOfOrg().equals("No")? "checked":StringPool.BLANK%> name="calibrationLaboratoryPartOfTesting"> <label
									for="calibrationLaboratoryPartOfTesting">No</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12 hide calibrationLaboratoryPartOfTestingBox">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.0 </span>Define its place in the parent organization as well as the relationship between management,
						 technical operations and support services. (CLAUSE 5.5a)</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationLaboratoryPartOfOrgName" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestlabPartOfOrgName())?mediLabTestStructural.getTestlabPartOfOrgName():""%>" placeholder="Place in the parent organization"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationLaboratoryPartOfOrgPosition" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestLabPartOfOrgPos())?mediLabTestStructural.getTestLabPartOfOrgPos():""%>" placeholder="Relationship"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12 mt-3">
					<p class="tab-form-main-heading mb-0"><b>4.0 Indicate Staff Size</b></p>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Managerial</p>
						<input type="text" class="form-control" id="calibrationManagerialStaffSize" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestMangerialStaff())?mediLabTestStructural.getTestMangerialStaff():""%>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Technical</p>
						<input type="text" class="form-control" id="calibrationTechnicalStaffSize" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestTechnicalStaff())?mediLabTestStructural.getTestTechnicalStaff():""%>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
					</div>
				</div>
				<div class="col-md-12">
			         <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.0 </span>Specify in the table below, the name of the staff member, responsibility and authority for all 
			         personnel who manage, perform or verify work affecting the results of laboratory activities indicating the title of their respective 
			         jobs and their major responsibilities (CLAUSE 5.5). Ensure that information is provided also, for individuals responsible for the 
			         following functions:</p>
			         <ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">a) Approval of the organizational structure</li> 
						<li class="list-group-item">b) Maintenance of documentation regarding competencies</li> 
						<li class="list-group-item">c) Quality control</li> 
						<li class="list-group-item">d) Supervision of technical staff (including trainees)</li> 
						<li class="list-group-item">e) Authorization of personnel</li>
						<li class="list-group-item">f) The laboratory's management system.</li>
					</ul> 
			    </div>
				<div class="col-md-12">
					<input id="staffDetailCalibrationVal" type="hidden" name="staffDetailCalibrationVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailBox">
							<div class="accordion__header is-active"
								id="staffDetailCalibration" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>Staff Details</h2>
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
											<p class="tab-form-main-heading">Name of Staff</p>
											<input type="text" class="form-control"
												id="staffNameCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<textarea rows="3" id="majorResponsibilitiesCalibration"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Indicate (X) analysts involved in requested scope of accreditation</p>
											<input type="text" class="form-control"
												id="analystsInvolveCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetailCalibration" onclick="addStaffDetailCalibration();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addStaffDetailCalibrationTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addStaffDetailCalibrationTable">
								<tr>
									<th class="sub_heading text-nowrap">Name of Staff</th>
									<th class="sub_heading text-nowrap">Job Title</th>
									<th class="sub_heading text-nowrap">Major Responsibilities</th>
									<th class="sub_heading text-nowrap">Indicate (X) analysts involved in requested scope of accreditation</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
<%if(labTestStructuralAdd!=null){
long testStructuralReqCounter=1;
for(AddLabStructuralRequirement labMedicalOrganFirstInfo:labTestStructuralAdd){
%>			
<tr class="staff-detail-calibration-row<%=testStructuralReqCounter%>">
<td class="sub_heading_content staffNameCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getNameOfStaff())?labMedicalOrganFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getJobTitle())?labMedicalOrganFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getMajorResponsibilities())?labMedicalOrganFirstInfo.getMajorResponsibilities():""%></td>
<td class="sub_heading_content analystsInvolveCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getIndicateAnalysts())?labMedicalOrganFirstInfo.getIndicateAnalysts():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailCalibrationEditTab" onclick="staffDetailCalibrationEditTab('<%=testStructuralReqCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailCalibrationDeleteDataTab" onclick="staffDetailCalibrationDeleteData('<%=testStructuralReqCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="staffDetailCalibrationId<%=testStructuralReqCounter%>" name="staffDetailCalibrationId<%=testStructuralReqCounter%>" value="<%=labMedicalOrganFirstInfo.getAddLabStructuralRequirementId()%>">    
 <%
  testStructuralReqCounter++;
						}
}
					%>
							</tbody>
						</table>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.0 </span>Indicate all relevant regulations, standards, codes, guidelines and/or other normative 
						documents that govern your operations (CLAUSE 5.4)</p>
						<div class="supporting-document-card my-3">
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach
												File</p>
										</div>
										<div class="right">
											<input type="file" id="normativeDocumentsCaliber" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>normativeDocumentsCaliber"> 
											<label class="custom-upload" for="normativeDocumentsCaliber"> 
												<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																fill="#047247"></path> 
		                                				 </svg>
												</span>Upload
											</label>
										</div>
									</div>
									<%if(Validator.isNotNull(normatDocCaliber)){ %>
									<span class="attach-detailed-overview"><%=normatDocCaliber%></span>
									<%}else{%>
									<span class="attach-detailed-overview"></span>
									<%}%>
								</div>
							</div>
						</div>
						<textarea rows="3" id="allRelevantDocuments"
							class="form-control" maxlength="255" placeholder=""
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestingRelevantDoc())?mediLabTestStructural.getTestingRelevantDoc():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<input id="scopeForCalibrationsVal" type="hidden" name="scopeForCalibrationsVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="scopeForCalibrationsDetailBox">
							<div class="accordion__header is-active"
								id="scopeForCalibrationsDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>7.0 List the scope of the calibrations for which accreditation is being sought, 
											(including limits of capability, where applicable)</h2>
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
											<p class="tab-form-main-heading">No.</p>
											<input type="text" class="form-control" id="numCalibration" value="" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Measured quantity</p>
											<input type="text" class="form-control" id="qualificationCalibration" value="" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Calibration item</p>
											<input type="text" class="form-control"
												id="itemCalibration" value="" placeholder="">
											<p class="tab-form-sub-heading">(where appropriate)</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Range</p>
											<input type="text" class="form-control"
												id="rangeCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Measurement Procedure</p>
											<textarea rows="3" id="measurementProcedureCalibration"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>		
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Calibration and Measurement capability (cmc) as an expanded uncertainty(k = 2)</p>
											<input type="text" class="form-control"
												id="measurementCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Remarks</p>
											<input type="text" class="form-control"
												id="remarksCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addScopeForCalibrationsDetail" onclick="addScopeForCalibrationsDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addScopeForCalibrationsDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addScopeForCalibrationsDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">No.</th>
									<th class="sub_heading text-nowrap">Method/Technique</th>
									<th class="sub_heading text-nowrap">Calibration item</th>
									<th class="sub_heading text-nowrap">Range</th>
									<th class="sub_heading text-nowrap">Measurement procedure</th>
									<th class="sub_heading text-nowrap">Calibration and Measurement capability (cmc) as an expanded uncertainty(k = 2)</th>
									<th class="sub_heading text-nowrap">Remarks</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
<%if(labCalStrucReqSecInfo!=null){
long testStructuralReqSecCounter=1;
for(AddLabCalibraStrucReqSec StrucReqSecInfo:labCalStrucReqSecInfo){
%>			
<tr class="scope-accreditation-calibration-row<%=testStructuralReqSecCounter%>">
<td class="sub_heading_content numCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getNumber())?StrucReqSecInfo.getNumber():""%></td>
<td class="sub_heading_content qualificationCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getMeasuredQuantity())?StrucReqSecInfo.getMeasuredQuantity():""%></td>
<td class="sub_heading_content itemCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getCalibrationItem())?StrucReqSecInfo.getCalibrationItem():""%></td>
<td class="sub_heading_content rangeCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getRange())?StrucReqSecInfo.getRange():""%></td>
<td class="sub_heading_content measurementProcedureCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getMeasurementProcedure())?StrucReqSecInfo.getMeasurementProcedure():""%></td>
<td class="sub_heading_content measurementCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getCalibration())?StrucReqSecInfo.getCalibration():""%></td>
<td class="sub_heading_content remarksCalibration<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(StrucReqSecInfo)&&Validator.isNotNull(StrucReqSecInfo.getRemarks())?StrucReqSecInfo.getRemarks():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="scopeForCalibrationsEditTab" onclick="scopeForCalibrationsEditTab('<%=testStructuralReqSecCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="scopeForCalibrationsDeleteDataTab" onclick="scopeForCalibrationsDeleteData('<%=testStructuralReqSecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="scopeForCalibrationsId<%=testStructuralReqSecCounter%>" name="scopeForCalibrationsId<%=testStructuralReqSecCounter%>" value="<%=StrucReqSecInfo.getAddLabCalibraStrucReqSecId()%>">    
 <%
  testStructuralReqSecCounter++;
						}
}
					%>					
							</tbody>
						</table>
					</div>
				</div>
				
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">8.0 </span>What is the major source of income for the Laboratory</p>
						<p class="tab-form-sub-heading">(i.e. service fees, corporate funding, government grants, other - please specify) (CLAUSE 4.1.3)?</p>
						<input type="text" class="form-control"
							id="calibrationMajorIncomeSource" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestMajorIncome())?mediLabTestStructural.getTestMajorIncome():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">9.0 </span>Who are the clients for which the Laboratory provides services</p>
						<p class="tab-form-sub-heading">(government, private companies, individuals, etc.) (CLAUSE 4.1.3)?</p>
						<input type="text" class="form-control"
							id="calibrationLaboratoryClients" value="<%=Validator.isNotNull(mediLabTestStructural)&&Validator.isNotNull(mediLabTestStructural.getTestLabClients())?mediLabTestStructural.getTestLabClients():""%>" placeholder="">
					</div>
				</div>
				
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabCalibrationStructuralReq(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep20">
	<div class="tab-form">
		<div class="resources-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Resource Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 mt-3">
					<p class="tab-form-main-heading"><b>A. Personnel</b></p>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.0 </span>Are there external personnel who influence laboratory activities? If so, please specify. 
						(Clause 6.2.1)</p>
						<input type="text" class="form-control" id="calibrationExternalPersonnel" value="<%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestExternal())?mediLabTestResourceReq.getTestExternal():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.0 </span>Provide competence requirements, qualifications and duties for the personnel (internal and 
						external) who manage, perform or verify work affecting the results of laboratory activities (CLAUSE 6.2.2, 6.2.4)</p>
						<textarea rows="3" id="calibrationCompetenceRequirements" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestCompetence())?mediLabTestResourceReq.getTestCompetence():""%></textarea>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 mt-3">
					<p class="tab-form-main-heading"><b>B. Facilities and Environmental Conditions</b></p>
				</div>
				<div class="col-md-12">
				<input id="activityPerformedLocCalibrationVal" type="hidden" name="activityPerformedLocCalibrationVal" value="1">
					<div class="accordion secured-accordian"
						id="activityPerformedLocCalibrationDetailBox">
						<div class="accordion__header is-active"
							id="activityPerformedLocCalibrationDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>12.0 If your application covers activities performed at more than one location (including virtual sites
										if applicable), provide details in the table below</h2>
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
										<input type="text" class="form-control" id="numberCalibration" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Location/Address</p>
										<textarea rows="3" id="applicationActivityAddressCalibration" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Activities performed at location</p>
										<textarea rows="3" id="activityPerformedCalibration"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>		
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Contact Details</p>
										<input type="text" class="form-control"
											id="contactDetailsCalibration" value="" placeholder="">
									</div>
								</div>
								
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee" id="addActivityPerformedLocCalibrationDetail" onclick="addActivityPerformedLocCalibrationDetail();"> 
										<span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addActivityPerformedLocCalibrationDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addActivityPerformedLocCalibrationDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labTestResourceFirstAdd!=null){
long testCelResFisrtCounter=1;
for(AddLabResourceReqFirst labTestCelResourceFirstInfo:labTestResourceFirstAdd){
%>			
<tr class="activity-performed-loc-cal-row<%=testCelResFisrtCounter%>">
<td class="sub_heading_content numberCalibration<%=testCelResFisrtCounter%>">
<%=Validator.isNotNull(labTestCelResourceFirstInfo)&&Validator.isNotNull(labTestCelResourceFirstInfo.getNum())?labTestCelResourceFirstInfo.getNum():""%></td>
<td class="sub_heading_content applicationActivityAddressCalibration<%=testCelResFisrtCounter%>">
<%=Validator.isNotNull(labTestCelResourceFirstInfo)&&Validator.isNotNull(labTestCelResourceFirstInfo.getLocation())?labTestCelResourceFirstInfo.getLocation():""%></td>
<td class="sub_heading_content activityPerformedCalibration<%=testCelResFisrtCounter%>">
<%=Validator.isNotNull(labTestCelResourceFirstInfo)&&Validator.isNotNull(labTestCelResourceFirstInfo.getActivities())?labTestCelResourceFirstInfo.getActivities():""%></td>
<td class="sub_heading_content contactDetailsCalibration<%=testCelResFisrtCounter%>">
<%=Validator.isNotNull(labTestCelResourceFirstInfo)&&Validator.isNotNull(labTestCelResourceFirstInfo.getContactDetails())?labTestCelResourceFirstInfo.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="activityPerformedLocCalEditTab" onclick="activityPerformedLocCalEditTab('<%=testCelResFisrtCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="activityPerformedLocCalDeleteDataTab" onclick="activityPerformedLocCalDeleteData('<%=testCelResFisrtCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="activityPerformedLocCalId<%=testCelResFisrtCounter%>" name="activityPerformedLocCalId<%=testCelResFisrtCounter%>" value="<%=labTestCelResourceFirstInfo.getAddLabResourceReqFirstId()%>">    
 <%
  testCelResFisrtCounter++;
						}
}
					%>
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.0</span> Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3)</p>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-sub-heading">a) The laboratory's facilities</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryCalibrationFacilities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilities())?mediLabTestResourceReq.getTestLabFacilities():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-sub-heading">b) Contracted facilities used by the laboratory (if applicable) (CLAUSE 5.4, 6.3.5)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryCalibratioContractedFacilities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabContracted())?mediLabTestResourceReq.getTestLabContracted():""%></textarea> 
						<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0 </span>Describe the laboratory's facilities in terms of type of lighting, power, ventilation, water supplies 
						and other environmental requirements (CLAUSE 6.3.2)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationLaboratoryFacilityEnvReq" placeholder="Describe facilities" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabFacilityEnv())?mediLabTestResourceReq.getTestLabFacilityEnv():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.0 </span>Describe, giving reasons, any special environmental conditions for the calibrations for which 
						accreditation is being sought, identifying sections of the laboratory that require these conditions. (CLAUSE 6.3.2)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationSpecialEnvConditions" placeholder="Describe conditions" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestSpecialEnv())?mediLabTestResourceReq.getTestSpecialEnv():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">16.0 </span>Describe the environmental or other monitoring activities carried out by the laboratory. (CLAUSE 6.3.3)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationMonitoringActivities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestMonitoringAct())?mediLabTestResourceReq.getTestMonitoringAct():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">17.0 </span>What are the safety features and related equipment of the laboratory (e.g. fire protection, 
						alarms, hazardous indications, chemical and other storage areas, eye wash stations, safety showers, etc.)? Please list</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationLaboratoryRelatedEquipment" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestLabRelatedEquip())?mediLabTestResourceReq.getTestLabRelatedEquip():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">18.0 </span>What are the security arrangements to prevent unauthorized access to the laboratory's 
						facilities (CLAUSE 6.3.4)?</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationSecurityArrangements" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(mediLabTestResourceReq)&&Validator.isNotNull(mediLabTestResourceReq.getTestSecurityArrange())?mediLabTestResourceReq.getTestSecurityArrange():""%></textarea>
					</div> 
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 mt-3">
					<p class="tab-form-main-heading"><b>C. Equipment</b></p>
				</div>
				<div class="col-md-12">
				<input id="majorEquipmentCalibrationVal" type="hidden" name="majorEquipmentCalibrationVal" value="1">
					<div class="accordion secured-accordian"
						id="majorEquipmentCalibrationDetailBox">
						<div class="accordion__header is-active"
							id="majorEquipmentCalibrationDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>19.0 List the major equipment used in the calibrations for which accreditation is being sought Include 
										equipment contracted for use by the laboratory (CLAUSE 6.4).</h2>
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
										<input type="text" class="form-control" id="inventoryCalibration" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Item</p>
										<input type="text" class="form-control"
											id="itemEquipmentCalibration" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Manufacturer</p>
										<input type="text" class="form-control"
											id="manufacturerCalibration" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Model Number</p>
										<input type="text" class="form-control" id="modelCalibration" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibration Interval</p>
										<input type="text" class="form-control"
											id="calibrationIntervalCalibration" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibrated By</p>
										<input type="text" class="form-control"
											id="calibratedByCalibration" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee" id="addMajorEquipmentCalibrationDetail" onclick="addMajorEquipmentCalibrationDetail();"> 
										<span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addMajorEquipmentCalibrationDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addMajorEquipmentCalibrationDetailTable">
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
<%if(labTestResourceSecAdd!=null){
long testCalResSecCounter=1;
for(AddLabResourceReqSec labTesCaltResourceSecInfo:labTestResourceSecAdd){
%>			
<tr class="major-equipment-calibration-row<%=testCalResSecCounter%>">
<td class="sub_heading_content inventoryCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getInventoryNumber())?labTesCaltResourceSecInfo.getInventoryNumber():""%></td>
<td class="sub_heading_content itemEquipmentCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getItem())?labTesCaltResourceSecInfo.getItem():""%></td>
<td class="sub_heading_content manufacturerCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getManufacturer())?labTesCaltResourceSecInfo.getManufacturer():""%></td>
<td class="sub_heading_content modelCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getModelNumber())?labTesCaltResourceSecInfo.getModelNumber():""%></td>
<td class="sub_heading_content calibrationIntervalCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getCalibrationInterval())?labTesCaltResourceSecInfo.getCalibrationInterval():""%></td>
<td class="sub_heading_content calibratedByCalibration<%=testCalResSecCounter%>">
<%=Validator.isNotNull(labTesCaltResourceSecInfo)&&Validator.isNotNull(labTesCaltResourceSecInfo.getCalibratedBy())?labTesCaltResourceSecInfo.getCalibratedBy():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="majorEquipmentCalibrationEditTab" onclick="majorEquipmentCalibrationEditTab('<%=testCalResSecCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="majorEquipmentCalibrationDeleteDataTab" onclick="majorEquipmentCalibrationDeleteData('<%=testCalResSecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="majorEquipmentCalibrationId<%=testCalResSecCounter%>" name="majorEquipmentCalibrationId<%=testCalResSecCounter%>" value="<%=labTesCaltResourceSecInfo.getAddLabResourceReqSecId()%>">    
 <%
  testCalResSecCounter++;
						}
}
					%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabCalibrationResourceReq(false);"
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