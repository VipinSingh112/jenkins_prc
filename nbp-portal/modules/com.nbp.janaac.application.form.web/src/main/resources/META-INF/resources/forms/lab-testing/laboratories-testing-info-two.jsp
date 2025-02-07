<%@ include file="../../init.jsp" %>
<!-- Structural Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep12">
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
							<p class="tab-form-main-heading" id="structuralLaboratoryLegalEntity"><span class="tab-form-highlghtme-link pr-2">1.0 </span>Is the laboratory a legal entity?</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=tesStructural!=null &&tesStructural.getTestLabLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="structuralLaboratoryLegalEntity"> <label
									for="structuralLaboratoryLegalEntity">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=tesStructural!=null &&tesStructural.getTestLabLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="structuralLaboratoryLegalEntity"> <label
									for="structuralLaboratoryLegalEntity">No</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12 structuralLaboratoryLegalEntityBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Define the legal status (CLAUSE 5.1)</p>
						<input type="text" class="form-control" id="structuralLaboratoryLegalEntityDefine" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestlegalStatus())?tesStructural.getTestlegalStatus():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading" id="laboratoryPartOfTesting"><span class="tab-form-highlghtme-link pr-2">2.0 </span>Is the laboratory a part of a larger organization that performs 
							activities other than testing?(CLAUSE 5.1.)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=tesStructural!=null &&tesStructural.getTestlabPartOfOrg().equals("Yes")? "checked":StringPool.BLANK%> name="laboratoryPartOfTesting"> <label
									for="laboratoryPartOfTesting">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=tesStructural!=null &&tesStructural.getTestlabPartOfOrg().equals("No")? "checked":StringPool.BLANK%> name="laboratoryPartOfTesting"> <label
									for="laboratoryPartOfTesting">No</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12 hide laboratoryPartOfTestingBox">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.0 </span>Define its place in the parent organization as well as the relationship between management,
						 technical operations and support services. (CLAUSE 5.5a)</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="testingLaboratoryPartOfOrgName" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestlabPartOfOrgName())?tesStructural.getTestlabPartOfOrgName():""%>" placeholder="Place in the parent organization"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="testingLaboratoryPartOfOrgPosition" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestLabPartOfOrgPos())?tesStructural.getTestLabPartOfOrgPos():""%>" placeholder="Relationship"/>
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
						<input type="text" class="form-control" id="testingManagerialStaffSize" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestMangerialStaff())?tesStructural.getTestMangerialStaff():""%>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Technical</p>
						<input type="text" class="form-control" id="testingTechnicalStaffSize" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestTechnicalStaff())?tesStructural.getTestTechnicalStaff():""%>" placeholder=""
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
					<input id="staffDetailVal" type="hidden" name="staffDetailVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailBox">
							<div class="accordion__header is-active"
								id="staffDetail" onclick="expandDetails(this.id)">
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
												id="staffNameTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<textarea rows="3" id="majorResponsibilitiesTesting"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Indicate (X) analysts involved in requested scope of accreditation</p>
											<input type="text" class="form-control"
												id="analystsInvolveTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetail" onclick="addStaffDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addStaffDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addStaffDetailTable">
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
<tr class="staff-detail-testing-row<%=testStructuralReqCounter%>">
<td class="sub_heading_content staffNameTesting<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getNameOfStaff())?labMedicalOrganFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleTesting<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getJobTitle())?labMedicalOrganFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesTesting<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getMajorResponsibilities())?labMedicalOrganFirstInfo.getMajorResponsibilities():""%></td>
<td class="sub_heading_content analystsInvolveTesting<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getIndicateAnalysts())?labMedicalOrganFirstInfo.getIndicateAnalysts():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailTestingEditTab" onclick="staffDetailTestingEditTab('<%=testStructuralReqCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailTestingDeleteDataTab" onclick="staffDetailTestingDeleteData('<%=testStructuralReqCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="staffDetailTestingId<%=testStructuralReqCounter%>" name="staffDetailTestingId<%=testStructuralReqCounter%>" value="<%=labMedicalOrganFirstInfo.getAddLabStructuralRequirementId()%>">    
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
											<input type="file" id="normativeDocuments" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>normativeDocuments"> 
											<label class="custom-upload" for="normativeDocuments"> 
												<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																fill="#047247"></path> 
		                                				 </svg>
												</span>Upload
											</label>
										</div>
									</div>
									<%if(Validator.isNotNull(normatDoc)){ %>
												<span class="attach-detailed-overview"><%=normatDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
								</div>
							</div>
						</div>
						<textarea rows="3" id="allTestingRelevantDocuments"
							class="form-control" maxlength="255" placeholder=""
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestingRelevantDoc())?tesStructural.getTestingRelevantDoc():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<input id="scopeForAccreditationVal" type="hidden" name="scopeForAccreditationVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="scopeForAccreditationDetailBox">
							<div class="accordion__header is-active"
								id="scopeForAccreditationDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>7.0 List the scope of the tests for which accreditation is being sought, 
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
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Product/Material</p>
											<input type="text" class="form-control"
												id="productTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Tests</p>
											<textarea rows="3" id="testsTesting"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Method/Technique</p>
											<textarea rows="3" id="methodsTesting"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>	
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Equipment(where appropriate)</p>
											<textarea rows="3" id="equipmentTesting"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>	
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Limits of Capability</p>
											<input type="text" class="form-control"
												id="capanilityLimitTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Estimate of Measurement Uncertainty</p>
											<input type="text" class="form-control"
												id="measurementUncertaintyTesting" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addScopeForAccreditationDetail" onclick="addScopeForAccreditationDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-12 table-responsive hide addScopeForAccreditationDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addScopeForAccreditationDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">Product/Material</th>
									<th class="sub_heading text-nowrap">Tests</th>
									<th class="sub_heading text-nowrap">Method/Technique</th>
									<th class="sub_heading text-nowrap">Equipment</th>
									<th class="sub_heading text-nowrap">Limits of Capability</th>
									<th class="sub_heading text-nowrap">Estimate of Measurement Uncertainty</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
<%if(labTestStructuralSecAdd!=null){
long testStructuralReqSecCounter=1;
for(AddLabTestStructuralReqSec labTestStructuralSecInfo:labTestStructuralSecAdd){
%>			
<tr class="scope-accreditation-row<%=testStructuralReqSecCounter%>">
<td class="sub_heading_content productTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getProductMaterial())?labTestStructuralSecInfo.getProductMaterial():""%></td>
<td class="sub_heading_content testsTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getTests())?labTestStructuralSecInfo.getTests():""%></td>
<td class="sub_heading_content methodsTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getMethod())?labTestStructuralSecInfo.getMethod():""%></td>
<td class="sub_heading_content equipmentTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getEquipment())?labTestStructuralSecInfo.getEquipment():""%></td>
<td class="sub_heading_content capanilityLimitTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getListOfCapability())?labTestStructuralSecInfo.getListOfCapability():""%></td>
<td class="sub_heading_content measurementUncertaintyTesting<%=testStructuralReqSecCounter%>">
<%=Validator.isNotNull(labTestStructuralSecInfo)&&Validator.isNotNull(labTestStructuralSecInfo.getEstimateOfMeasurement())?labTestStructuralSecInfo.getEstimateOfMeasurement():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="scopeForAccreditationEditTab" onclick="scopeForAccreditationEditTab('<%=testStructuralReqSecCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="scopeForAccreditationDeleteDataTab" onclick="scopeForAccreditationDeleteData('<%=testStructuralReqSecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="scopeForAccreditationId<%=testStructuralReqSecCounter%>" name="scopeForAccreditationId<%=testStructuralReqSecCounter%>" value="<%=labTestStructuralSecInfo.getAddLabTestStructuralReqSecId()%>">    
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
							id="majorIncomeSourceTesting" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestMajorIncome())?tesStructural.getTestMajorIncome():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">9.0 </span>Who are the clients for which the Laboratory provides services</p>
						<p class="tab-form-sub-heading">(government, private companies, individuals, etc.) (CLAUSE 4.1.3)?</p>
						<input type="text" class="form-control"
							id="testingLaboratoryClients" value="<%=Validator.isNotNull(tesStructural)&&Validator.isNotNull(tesStructural.getTestLabClients())?tesStructural.getTestLabClients():""%>" placeholder="">
					</div>
				</div>
				
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabTestStructuralReq(false);"
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
<!-- Structural Requirements Form End-->

<!-- Resource Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep13">
	<div class="tab-form">
		<div class="resources-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Resource Requirements</p>
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
						<input type="text" class="form-control" id="testingExternalPersonnel" value="<%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestExternal())?testResouceData.getTestExternal():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.0 </span>Provide competence requirements, qualifications and duties for the personnel (internal and 
						external) who manage, perform or verify work affecting the results of laboratory activities (CLAUSE 6.2.2, 6.2.4)</p>
						<textarea rows="3" id="testingCompetenceRequirements" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%">
						<%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestCompetence())?testResouceData.getTestCompetence():""%></textarea>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading mt-3"><b>B. Facilities and Environmental Conditions</b></p>
				</div>
				<div class="col-md-12">
				<input id="activityPerformedLocVal" type="hidden" name="activityPerformedLocVal" value="1">
					<div class="accordion secured-accordian"
						id="activityPerformedLocDetailBox">
						<div class="accordion__header is-active"
							id="activityPerformedLocDetail" onclick="expandDetails(this.id)">
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
										<input type="text" class="form-control" id="numberTesting" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Location/Address</p>
										<textarea rows="3" id="applicationActivityAddressTesting" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Activities performed at
											location</p>
										<textarea rows="3" id="activityPerformedTesting" class="form-control"
											maxlength="255" placeholder=""
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Contact Details</p>
										<input type="text" class="form-control"
											id="contactDetailsTesting" value="" placeholder="">
									</div>
								</div>
								
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee" id="addActivityPerformedLocDetail" onclick="addActivityPerformedLocDetail();"> 
										<span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addActivityPerformedLocDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addActivityPerformedLocDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labTestResourceFirstAdd!=null){
long testResFisrtCounter=1;
for(AddLabResourceReqFirst labTestResourceFirstInfo:labTestResourceFirstAdd){
%>			
<tr class="activity-performed-loc-row<%=testResFisrtCounter%>">
<td class="sub_heading_content numberTesting<%=testResFisrtCounter%>">
<%=Validator.isNotNull(labTestResourceFirstInfo)&&Validator.isNotNull(labTestResourceFirstInfo.getNum())?labTestResourceFirstInfo.getNum():""%></td>
<td class="sub_heading_content applicationActivityAddressTesting<%=testResFisrtCounter%>">
<%=Validator.isNotNull(labTestResourceFirstInfo)&&Validator.isNotNull(labTestResourceFirstInfo.getLocation())?labTestResourceFirstInfo.getLocation():""%></td>
<td class="sub_heading_content activityPerformedTesting<%=testResFisrtCounter%>">
<%=Validator.isNotNull(labTestResourceFirstInfo)&&Validator.isNotNull(labTestResourceFirstInfo.getActivities())?labTestResourceFirstInfo.getActivities():""%></td>
<td class="sub_heading_content contactDetailsTesting<%=testResFisrtCounter%>">
<%=Validator.isNotNull(labTestResourceFirstInfo)&&Validator.isNotNull(labTestResourceFirstInfo.getContactDetails())?labTestResourceFirstInfo.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="activityPerformedLocEditTab" onclick="activityPerformedLocEditTab('<%=testResFisrtCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="activityPerformedLocDeleteDataTab" onclick="activityPerformedLocDeleteData('<%=testResFisrtCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="activityPerformedLocId<%=testResFisrtCounter%>" name="activityPerformedLocId<%=testResFisrtCounter%>" value="<%=labTestResourceFirstInfo.getAddLabResourceReqFirstId()%>">    
 <%
  testResFisrtCounter++;
						}
}
					%>	
					</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.0 </span>Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3)</p>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-sub-heading">a) The laboratory's facilities</p>
						<!-- <input type="text" class="form-control" id="laboratoryFacilities" placeholder="" value="" name="laboratoryFacilities"> --> 
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryFacilities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestLabFacilities())?testResouceData.getTestLabFacilities():""%></textarea>
						<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-sub-heading">b) Contracted facilities used by the laboratory (if applicable) (CLAUSE 5.4, 6.3.5)</p>
						<!-- <input type="text" class="form-control" id="laboratoryContractedFacilities" placeholder="" value="" name="laboratoryContractedFacilities"> -->
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryContractedFacilities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestLabContracted())?testResouceData.getTestLabContracted():""%></textarea> 
						<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0 </span>Describe the laboratory's facilities in terms of type of lighting, power, ventilation, water supplies 
						and other environmental requirements (CLAUSE 6.3.2)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryFacilityEnvReq" placeholder="Describe facilities" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestLabFacilityEnv())?testResouceData.getTestLabFacilityEnv():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.0 </span>Describe, giving reasons, any special environmental conditions for the tests for which 
						accreditation is being sought, identifying sections of the laboratory that require these conditions. (CLAUSE 6.3.2)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="specialEnvConditions" placeholder="Describe conditions" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestSpecialEnv())?testResouceData.getTestSpecialEnv():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">16.0 </span>Describe the environmental or other monitoring activities carried out by the laboratory. (CLAUSE 6.3.3)</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="monitoringActivities" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestMonitoringAct())?testResouceData.getTestMonitoringAct():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">17.0 </span>What are the safety features and related equipment of the laboratory (e.g. fire protection, 
						alarms, hazardous indications, chemical and other storage areas, eye wash stations, safety showers, etc.)? Please list</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="laboratoryRelatedEquipment" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestLabRelatedEquip())?testResouceData.getTestLabRelatedEquip():""%></textarea>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">18.0 </span>What are the security arrangements to prevent unauthorized access to the laboratory's 
						facilities (CLAUSE 6.3.4)?</p>
						 <textarea rows="3" class="mt-3 form-control" maxlength="255" id="testingSecurityArrangements" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(testResouceData)&&Validator.isNotNull(testResouceData.getTestSecurityArrange())?testResouceData.getTestSecurityArrange():""%></textarea>
					</div> 
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 mt-3">
					<p class="tab-form-main-heading"><b>C. Equipment</b></p>
				</div>
				<div class="col-md-12">
				<input id="majorEquipmentTestingVal" type="hidden" name="majorEquipmentTestingVal" value="1">
					<div class="accordion secured-accordian"
						id="majorEquipmentTestingDetailBox">
						<div class="accordion__header is-active"
							id="majorEquipmentTestingDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>19.0 List the major equipment used in the tests for which accreditation is being sought Include 
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
										<input type="text" class="form-control" id="inventoryTesting" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Item</p>
										<input type="text" class="form-control"
											id="itemTesting" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Manufacturer</p>
										<input type="text" class="form-control"
											id="manufacturerTesting" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Model Number</p>
										<input type="text" class="form-control" id="modelTesting" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibration Interval</p>
										<input type="text" class="form-control"
											id="calibrationIntervalTesting" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Calibrated By</p>
										<input type="text" class="form-control"
											id="calibratedByTesting" value="" placeholder="">
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee" id="addMajorEquipmentTestingDetail" onclick="addMajorEquipmentTestingDetail();"> 
										<span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addMajorEquipmentTestingDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addMajorEquipmentTestingDetailTable">
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
long testResSecCounter=1;
for(AddLabResourceReqSec labTestResourceSecInfo:labTestResourceSecAdd){
%>			
<tr class="major-equipment-testing-row<%=testResSecCounter%>">
<td class="sub_heading_content inventoryTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getInventoryNumber())?labTestResourceSecInfo.getInventoryNumber():""%></td>
<td class="sub_heading_content itemTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getItem())?labTestResourceSecInfo.getItem():""%></td>
<td class="sub_heading_content manufacturerTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getManufacturer())?labTestResourceSecInfo.getManufacturer():""%></td>
<td class="sub_heading_content modelTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getModelNumber())?labTestResourceSecInfo.getModelNumber():""%></td>
<td class="sub_heading_content calibrationIntervalTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getCalibrationInterval())?labTestResourceSecInfo.getCalibrationInterval():""%></td>
<td class="sub_heading_content calibratedByTesting<%=testResSecCounter%>">
<%=Validator.isNotNull(labTestResourceSecInfo)&&Validator.isNotNull(labTestResourceSecInfo.getCalibratedBy())?labTestResourceSecInfo.getCalibratedBy():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="majorEquipmentTestingEditTab" onclick="majorEquipmentTestingEditTab('<%=testResSecCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="majorEquipmentTestingDeleteDataTab" onclick="majorEquipmentTestingDeleteData('<%=testResSecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="majorEquipmentTestingId<%=testResSecCounter%>" name="majorEquipmentTestingId<%=testResSecCounter%>" value="<%=labTestResourceSecInfo.getAddLabResourceReqSecId()%>">    
 <%
  testResSecCounter++;
						}
}
					%>	
			</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabTestResourceReq(false);"
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
<!-- Resource Requirements Form End-->