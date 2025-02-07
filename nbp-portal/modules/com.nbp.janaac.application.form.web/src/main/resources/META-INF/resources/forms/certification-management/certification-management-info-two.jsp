<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep27">
	<div class="tab-form">
		<div class="human-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">III. Personnel and Resources</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">15.0</span> Indicate</p> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Size of internal staff</p> 
					 <input type="text" class="form-control" id="internalStaffSize" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getInternalStaffSize())?cerBodyPersonnel.getInternalStaffSize():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Number of auditors</p> 
					 <input type="text" class="form-control" id="auditorsNum" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getAuditorsNum())?cerBodyPersonnel.getAuditorsNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Number of contracted personnel including external auditors</p> 
					 <input type="text" class="form-control" id="contractedPerNum" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getContractedPerNum())?cerBodyPersonnel.getContractedPerNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.0</span> Supported by documentation in Section A, II, 6. above, list all internal staff members for each position 
					within the organizational with functions related to certification activities, indicating the name, respective job titles and primary 
					responsibilities in the table below. Please also indicate in the last column by referencing the corresponding letter (i.e. a - m), individuals 
					specifically responsible for the following functions: </p>
					<ul class="list-group tab-form-sub-heading mb-3">
						<li class="list-group-item">a. Development and implementation of operational policies, processes and procedures [6.1.3]</li>
						<li class="list-group-item">b. Supervision of the implementation of operational policies, processes and procedures [6.1.3]</li>
						<li class="list-group-item">c. Ensuring impartiality [6.1.3]</li>
						<li class="list-group-item">d. Making decisions on certification [6.1.3]</li>
						<li class="list-group-item">e. Supervision of finances [6.1.3]</li>
						<li class="list-group-item">f. Development of management system certification schemes and services [6.1.3]</li>
						<li class="list-group-item">g. Leading/conducting certification audits; audit reporting [6.1.3]</li>
						<li class="list-group-item">h. Contractual arrangements [6.1.3] </li>
						<li class="list-group-item">i. Provision of resources for certification activities and associated operations [6.1.3]</li>
						<li class="list-group-item">j. Delegating authority to individual and committees to undertake activities on its behalf [6.1.3]</li>
						<li class="list-group-item">k. Selection, training and authorizing personnel including auditors and technical experts [7.2.4]</li>
						<li class="list-group-item">l. Handling appeals [9.7]</li>
						<li class="list-group-item">m. Handling complaints [9.8]</li>
						<li class="list-group-item">n. Establishing, implementing and maintaining the management system processes and procedures [10.1.2]</li>
						<li class="list-group-item">o. Assessing and reporting on the performance of the management system [10.1.2]</li>
					</ul>
				</div>
				<div class="col-md-12">
					<input id="staffDetailCertificationVal" type="hidden" name="staffDetailCertificationVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailCertificationBox">
							<div class="accordion__header is-active"
								id="staffDetailCertification" onclick="expandDetails(this.id)">
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
											<p class="tab-form-main-heading">Name of Staff Member</p>
											<input type="text" class="form-control"
												id="staffNameCertification" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleCertification" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<input type="text" class="form-control"
												id="majorResponsibilitiesCertification" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Specific Functions</p>
											<input type="text" class="form-control"
												id="specificFunctionCertification" value="" placeholder="">
											<p class="tab-form-sub-heading">(relative to 16.0  a. - o. above)</p>
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetailCertification" onclick="addStaffDetailCertification();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addStaffDetailCertificationTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addStaffDetailCertificationTable">
							<tr>
								<th class="sub_heading text-nowrap">Name of Staff</th>
								<th class="sub_heading text-nowrap">Job Title</th>
								<th class="sub_heading text-nowrap">Major Responsibilities</th>
								<th class="sub_heading text-nowrap">Specific Functions</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(cerApplicaionInfo!=null){
long cerPersonnelFirstAddCounter=1;
for(AddCerPersonnelFirst cerPerFirstInfo:cerPersonnelFirst){
%>						
<tr class="staff-detail-cer-row<%=cerPersonnelFirstAddCounter%>">
<td class="sub_heading_content staffNameCertification<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getNameOfStaff())?cerPerFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleCertification<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getJobTitle())?cerPerFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesCertification<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getMajorResponsibility())?cerPerFirstInfo.getMajorResponsibility():""%></td>
<td class="sub_heading_content specificFunctionCertification<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getSpecificFunctions())?cerPerFirstInfo.getSpecificFunctions():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailCertificationEditTab" onclick="staffDetailCertificationEditTab('<%=cerPersonnelFirstAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailCertificationDeleteDataTab" onclick="staffDetailCertificationDeleteData('<%=cerPersonnelFirstAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="staffDetailCertificationId<%=cerPersonnelFirstAddCounter%>" name="staffDetailCertificationId<%=cerPersonnelFirstAddCounter%>" value="<%=cerPerFirstInfo.getAddCerPersonnelFirstId()%>">
					<%
						cerPersonnelFirstAddCounter++;
						}
}
					%>								
						</tbody>
					</table>
				</div>
				
				<div class="col-md-12">
					<input id="auditorListVal" type="hidden" name="auditorListVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="auditorListBox">
							<div class="accordion__header is-active"
								id="auditorList" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="tab-form-highlghtme-link pr-2">17.0</span> Supported by documentation in Section A, II, 7. above, list all auditors, technical experts including contracted personnel that perform certification activities, 
											and respective areas of expertise. Indicate the applicable Accreditation Scope code based on IAF MD 1:2014, 
											NACE Rev. 2 or suitable system of  industry classification. [Clause7.2.2]</h2>
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
											<p class="tab-form-main-heading">Name</p>
											<input type="text" class="form-control"
												id="auditorName" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Role</p>
											<input type="text" class="form-control" id="auditorRole" value="" placeholder="">
											<p class="tab-form-sub-heading">Auditor, Technical Expert, etc</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification Standard</p>
											<input type="text" class="form-control"
												id="auditorCertificationStandard" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Area of Expertise & Industry code</p>
											<input type="text" class="form-control"
												id="auditorExpertiseArea" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addAuditorList" onclick="addAuditorList();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addAuditorListTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addAuditorListTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Role</th>
								<th class="sub_heading text-nowrap">Certification Standard</th>
								<th class="sub_heading text-nowrap">Area of Expertise & Industry code</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(cerPersonnelSec!=null){
long cerPersonnelSecAddCounter=1;
for(AddCerPersonnelSecond cerPerSecInfo:cerPersonnelSec){
%>						
<tr class="auditor-list-row<%=cerPersonnelSecAddCounter%>">
<td class="sub_heading_content auditorName<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getName())?cerPerSecInfo.getName():""%></td>
<td class="sub_heading_content auditorRole<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getRole())?cerPerSecInfo.getRole():""%></td>
  <td class="sub_heading_content auditorCertificationStandard<%=cerPersonnelSecAddCounter%>">
  <%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getCertificateStandard())?cerPerSecInfo.getCertificateStandard():""%></td>
<td class="sub_heading_content auditorExpertiseArea<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getAreaOfExpertise())?cerPerSecInfo.getAreaOfExpertise():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="auditorListEditTab" onclick="auditorListEditTab('<%=cerPersonnelSecAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="auditorListDeleteDataTab" onclick="auditorListDeleteData('<%=cerPersonnelSecAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="auditorListId<%=cerPersonnelSecAddCounter%>" name="auditorListId<%=cerPersonnelSecAddCounter%>" value="<%=cerPerSecInfo.getAddCerPersonnelSecondId()%>">
					<%
						cerPersonnelSecAddCounter++;
						}
}
					%>	
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.0</span> Does the certification body outsource (in part or in whole) any of its certification 
						services (e.g. to other  certification bodies etc.)? [Clause 7.5.1]</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("Yes")? "checked":StringPool.BLANK%> name="certificationBodyOutsource">
							<label for="certificationBodyOutsource">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("No")? "checked":StringPool.BLANK%> name="certificationBodyOutsource">
							<label for="certificationBodyOutsource">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 certificationBodyOutsourceBox hide">
					<input id="outsourceActNatureVal" type="hidden" name="outsourceActNatureVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="outsourceActNatureBox">
							<div class="accordion__header is-active"
								id="outsourceActNature" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="tab-form-highlghtme-link pr-2">19.0</span> Identify in the table below the nature of the outsourced activities and respective suppliers/service 
											providers for each</h2>
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
											<p class="tab-form-main-heading">Outsourced Activity</p>
											<input type="text" class="form-control"
												id="outsourcedActivity" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Supplier/Service provider</p>
											<input type="text" class="form-control"
												id="serviceProvdier" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addOutsourceActNature" onclick="addOutsourceActNature();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addOutsourceActNatureTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addOutsourceActNatureTable">
							<tr>
								<th class="sub_heading text-nowrap">Outsourced Activity</th>
								<th class="sub_heading text-nowrap">Supplier/Service provider</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							
<%if(fdaPersonnelThirdInfo!=null){
long PersonnelThirdInfoAddCounter=1;
for(AddFdaPersonnelThird PersonnelThirdInfoInfo:fdaPersonnelThirdInfo){
%>								
<tr class="outsource-act-nature-row<%=PersonnelThirdInfoAddCounter%>">
<td class="sub_heading_content outsourcedActivity<%=PersonnelThirdInfoAddCounter%>">
<%=Validator.isNotNull(PersonnelThirdInfoInfo)&&Validator.isNotNull(PersonnelThirdInfoInfo.getOutsourcedActivity())?PersonnelThirdInfoInfo.getOutsourcedActivity():""%></td>
<td class="sub_heading_content serviceProvdier<%=PersonnelThirdInfoAddCounter%>">
<%=Validator.isNotNull(PersonnelThirdInfoInfo)&&Validator.isNotNull(PersonnelThirdInfoInfo.getSupplierServiceProvider())?PersonnelThirdInfoInfo.getSupplierServiceProvider():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="outsourceActNatureEditTab" onclick="outsourceActNatureEditTab('<%=PersonnelThirdInfoAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="outsourceActNatureDeleteDataTab" onclick="outsourceActNatureDeleteData('<%=PersonnelThirdInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="outsourceActNatureId<%=PersonnelThirdInfoAddCounter%>" name="outsourceActNatureId<%=PersonnelThirdInfoAddCounter%>" value="<%=PersonnelThirdInfoInfo.getAddFdaPersonnelThirdId()%>">
							
				<%
				PersonnelThirdInfoAddCounter++;
					}}
				%>								
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<input id="activityPerformLocationsVal" type="hidden" name="activityPerformLocationsVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="activityPerformLocationsBox">
							<div class="accordion__header is-active"
								id="activityPerformLocations" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="tab-form-highlghtme-link pr-2">20.0</span> If your application covers activities performed at more than one location (including virtual sites if 
											applicable, branch offices, partners locations, agents, etc.), provide details in the table below: 
											[Clause  6.2; 8.1.2]</h2>
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
												id="activityPerformNum" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Location/Address</p>
											<textarea rows="3" id="activityPerformLoc" class="form-control" maxlength="255" 
											placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification activities performed at location</p>
											<textarea rows="3" id="activityPerformCertLoc" class="form-control" maxlength="255" 
											placeholder="Enter location" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Contact Details</p>
											<input type="text" class="form-control"
												id="activityPerformContact" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addActivityPerformLocations" onclick="addActivityPerformLocations();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addActivityPerformLocationsTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addActivityPerformLocationsTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Certification activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(cerPersonnelThird!=null){
long cerPersonnelThirdAddCounter=1;
for(AddCerPersonnelThird cerPerThirdInfo:cerPersonnelThird){
%>						
<tr class="activity-perform-locations-row<%=cerPersonnelThirdAddCounter%>">
<td class="sub_heading_content activityPerformNum<%=cerPersonnelThirdAddCounter%>">
<%=Validator.isNotNull(cerPerThirdInfo)&&Validator.isNotNull(cerPerThirdInfo.getNumber())?cerPerThirdInfo.getNumber():""%></td>
<td class="sub_heading_content activityPerformLoc<%=cerPersonnelThirdAddCounter%>">
<%=Validator.isNotNull(cerPerThirdInfo)&&Validator.isNotNull(cerPerThirdInfo.getLocation())?cerPerThirdInfo.getLocation():""%></td>
<td class="sub_heading_content activityPerformCertLoc<%=cerPersonnelThirdAddCounter%>">
<%=Validator.isNotNull(cerPerThirdInfo)&&Validator.isNotNull(cerPerThirdInfo.getCertificationActivities())?cerPerThirdInfo.getCertificationActivities():""%></td>
<td class="sub_heading_content activityPerformContact<%=cerPersonnelThirdAddCounter%>">
<%=Validator.isNotNull(cerPerThirdInfo)&&Validator.isNotNull(cerPerThirdInfo.getContactDetails())?cerPerThirdInfo.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="activityPerformLocationsEditTab" onclick="activityPerformLocationsEditTab('<%=cerPersonnelThirdAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="activityPerformLocationsDeleteDataTab" onclick="activityPerformLocationsDeleteData('<%=cerPersonnelThirdAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="activityPerformLocationsId<%=cerPersonnelThirdAddCounter%>" name="activityPerformLocationsId<%=cerPersonnelThirdAddCounter%>" value="<%=cerPerThirdInfo.getAddCerPersonnelThirdId()%>">
				<%
					cerPersonnelThirdAddCounter++;
					}}
				%>
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">21.0</span> Briefly describe the security arrangements, equipment and/or facilities established to prevent loss of,
						 or unauthorized access to client data and information? [Clause 8.4.7; 9.9;10.2.4]</p>
						<textarea rows="3" id="descSecurityArrangements" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getDescSecurity())?cerBodyPersonnel.getDescSecurity():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCerBodyPersonnelResource(false);"
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
<!-- Personnel and Resources Form End-->

<!-- Information Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep28">
	<div class="tab-form">
		<div class="information-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">IV. Information</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">22.0</span> Briefly describe the mechanisms through which information about the organization and its 
						certification services is made available to the public; to certified clients. [Clause 8.0]</p>
						<textarea rows="3" id="describeMechanism" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBobyInformation)&&Validator.isNotNull(cerBobyInformation.getDescribeMechanism())?cerBobyInformation.getDescribeMechanism():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCerBodyInformation(false);"
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
<!-- Information Form End-->