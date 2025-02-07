<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep43">
	<div class="tab-form">
		<div class="human-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">III. Organization, Personnel and Resources</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">13.0</span> Indicate</p> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Size of internal staff</p> 
					 <input type="text" class="form-control" id="internalStaffSizeCerBodies" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getInternalStaffSize())?cerBodyPersonnel.getInternalStaffSize():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Number of auditors</p> 
					 <input type="text" class="form-control" id="auditorsNumCerBodies" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getAuditorsNum())?cerBodyPersonnel.getAuditorsNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Number of contracted personnel including external auditors</p> 
					 <input type="text" class="form-control" id="contractedPerNumCerBodies" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getContractedPerNum())?cerBodyPersonnel.getContractedPerNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0</span> Supported by documentation in Section A, II, 4. 
					above, list all internal staff members for each position within the organization with functions related to certification activities, 
					indicating the name, respective job titles, and primary responsibilities in the table below. Please also indicate in the last column by 
					referencing the corresponding letter (i.e., a. - n.), individuals specifically responsible for the following functions [Clause 5.1.2]:</p>
					<ul class="list-group tab-form-sub-heading mb-3">
						<li class="list-group-item">a. Development of policies relating to the operation of the certification body</li>
						<li class="list-group-item">b. Supervision of the implementation of the policies and procedures</li>
						<li class="list-group-item">c. Supervision of the finances of the certification body</li>
						<li class="list-group-item">d. Development of the resources for certification activities</li>
						<li class="list-group-item">e. Development and maintenance of the certification schemes</li>
						<li class="list-group-item">f. Assessment activities</li>
						<li class="list-group-item">g. Decisions on certification, including the granting, maintain, recertifying, expanding, reducing, 
						suspending or withdrawing of the certification</li>
						<li class="list-group-item">h. Contractual arrangements</li>
					</ul>
				</div>
				<div class="col-md-12">
					<input id="staffDetailCerBodiesVal" type="hidden" name="staffDetailCerBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailCerBodiesBox">
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
												id="staffNameCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<input type="text" class="form-control"
												id="majorResponsibilitiesCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Specific Functions</p>
											<input type="text" class="form-control"
												id="specificFunctionCerBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">(Choose from a - h above)</p>
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetailCerBodies" onclick="addStaffDetailCerBodies();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addStaffDetailCerBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addStaffDetailCerBodiesTable">
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
<tr class="staff-detail-cer-bodies-row<%=cerPersonnelFirstAddCounter%>">
<td class="sub_heading_content staffNameCerBodies<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getNameOfStaff())?cerPerFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleCerBodies<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getJobTitle())?cerPerFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesCerBodies<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getMajorResponsibility())?cerPerFirstInfo.getMajorResponsibility():""%></td>
<td class="sub_heading_content specificFunctionCerBodies<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getSpecificFunctions())?cerPerFirstInfo.getSpecificFunctions():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailCerBodiesEditTab" onclick="staffDetailCerBodiesEditTab('<%=cerPersonnelFirstAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailCerBodiesDeleteDataTab" onclick="staffDetailCerBodiesDeleteData('<%=cerPersonnelFirstAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="staffDetailCerBodiesId<%=cerPersonnelFirstAddCounter%>" name="staffDetailCerBodiesId<%=cerPersonnelFirstAddCounter%>" value="<%=cerPerFirstInfo.getAddCerPersonnelFirstId()%>">
					<%
						cerPersonnelFirstAddCounter++;
						}
}
					%>									
						</tbody>
					</table>
				</div>
				
				<div class="col-md-12">
					<input id="auditorListCerBodiesVal" type="hidden" name="auditorListCerBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="auditorListCerBodiesBox">
							<div class="accordion__header is-active"
								id="auditorList" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="">15.0</span> Supported by documentation in Section A, II, 5. above, 
											list all examiners including contracted personnel that perform certification activities, as well as their 
											respective areas of expertise. [Clause 6.1]</h2>
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
												id="auditorNameCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Role</p>
											<input type="text" class="form-control" id="auditorRoleCerBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">Auditor, Technical Expert, etc</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification Scheme</p>
											<input type="text" class="form-control"
												id="auditorCerBodiesStandard" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Area of Expertise</p>
											<input type="text" class="form-control"
												id="auditorExpertiseAreaCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addAuditorListCerBodies" onclick="addAuditorListCerBodies();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addAuditorListCerBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addAuditorListCerBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Role</th>
								<th class="sub_heading text-nowrap">Certification Standard</th>
								<th class="sub_heading text-nowrap">Area of Expertise</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(cerPersonnelSec!=null){
long cerPersonnelSecAddCounter=1;
for(AddCerPersonnelSecond cerPerSecInfo:cerPersonnelSec){
%>						
<tr class="auditor-list-bodies-row<%=cerPersonnelSecAddCounter%>">
<td class="sub_heading_content auditorNameCerBodies<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getName())?cerPerSecInfo.getName():""%></td>
<td class="sub_heading_content auditorRoleCerBodies<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getRole())?cerPerSecInfo.getRole():""%></td>
<td class="sub_heading_content auditorCerBodiesStandard<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getCertificateStandard())?cerPerSecInfo.getCertificateStandard():""%></td>
<td class="sub_heading_content auditorExpertiseAreaCerBodies<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getAreaOfExpertise())?cerPerSecInfo.getAreaOfExpertise():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="auditorListCerBodiesEditTab" onclick="auditorListCerBodiesEditTab('<%=cerPersonnelSecAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="auditorListCerBodiesDeleteDataTab" onclick="auditorListCerBodiesDeleteData('<%=cerPersonnelSecAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="auditorListCerBodiesId<%=cerPersonnelSecAddCounter%>" name="auditorListCerBodiesId<%=cerPersonnelSecAddCounter%>" value="<%=cerPerSecInfo.getAddCerPersonnelSecondId()%>">
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
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.0</span> Does the certification body outsource (in part or whole) 
						any of its evaluation activities related to certification? [Clause 6.3]</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("Yes")? "checked":StringPool.BLANK%> name="cerBodiesBodyOutsource">
							<label for="cerBodiesBodyOutsource">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("No")? "checked":StringPool.BLANK%> name="cerBodiesBodyOutsource">
							<label for="cerBodiesBodyOutsource">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 cerBodiesOutsourceBox hide">
					<input id="outsourceActNatureCerBodiesVal" type="hidden" name="outsourceActNatureCerBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="outsourceActNatureCerBodiesBox">
							<div class="accordion__header is-active"
								id="outsourceActNature" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="">17.0</span> Identify in the table below the nature of the outsourced 
											activities and respective suppliers/service providers for each</h2>
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
												id="outsourcedActivityCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Supplier/Service provider</p>
											<input type="text" class="form-control"
												id="serviceProvdierCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Location/Address</p>
											<textarea rows="3" class="mt-3 form-control" maxlength="255" id="serviceProvdierAddressCerBodies" placeholder="Address" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addOutsourceActNatureCerBodies" onclick="addOutsourceActNatureCerBodies();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addOutsourceActNatureCerBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addOutsourceActNatureCerBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Outsourced Activity</th>
								<th class="sub_heading text-nowrap">Supplier/Service provdier</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							
<%if(outsourcedActivities!=null){
long outSourcedAddCounter=1;
for(AddOutsourcedActivities outsourcedActivitieInfo:outsourcedActivities){
%>								
<tr class="outsource-act-nature-cer-product-row<%=outSourcedAddCounter%>">
<td class="sub_heading_content outsourcedActivityCerBodies<%=outSourcedAddCounter%>">
<%=Validator.isNotNull(outsourcedActivitieInfo)&&Validator.isNotNull(outsourcedActivitieInfo.getOutSourcedActivity())?outsourcedActivitieInfo.getOutSourcedActivity():""%></td>
<td class="sub_heading_content serviceProvdierCerBodies<%=outSourcedAddCounter%>">
<%=Validator.isNotNull(outsourcedActivitieInfo)&&Validator.isNotNull(outsourcedActivitieInfo.getServiceProvider())?outsourcedActivitieInfo.getServiceProvider():""%></td>
<td class="sub_heading_content serviceProvdierAddressCerBodies<%=outSourcedAddCounter%>">
<%=Validator.isNotNull(outsourcedActivitieInfo)&&Validator.isNotNull(outsourcedActivitieInfo.getLocationAddress())?outsourcedActivitieInfo.getLocationAddress():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="outsourceActNatureCerBodiesEditTab" onclick="outsourceActNatureCerBodiesEditTab('<%=outSourcedAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="outsourceActNatureCerBodiesDeleteDataTab" onclick="outsourceActNatureCerBodiesDeleteData('<%=outSourcedAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
	<input type="hidden" id="outsourceActNatureCerBodiesId<%=outSourcedAddCounter%>" name="outsourceActNatureCerBodiesId<%=outSourcedAddCounter%>" value="<%=outsourcedActivitieInfo.getAddOutsourcedActivitiesId()%>">
				<%
					outSourcedAddCounter++;
						}
}
					%>							
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.0</span> Briefly describe the security arrangements, equipment,
						 and/or facilities established to prevent loss of or unauthorized access to examination information. [Clause 7.4.1; 7.4.2]</p>
						<textarea rows="3" id="descSecurityArrangementsCerBodies" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getDescSecurity())?cerBodyPersonnel.getDescSecurity():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCerBodyOrgPersonnel(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep44">
	<div class="tab-form">
		<div class="information-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">IV. Information</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">19.0</span> Briefly describe the mechanisms through which information 
						about the organization and its certification services is made available to the public; to certified clients. [Clause 7.2]</p>
						<textarea rows="3" id="describeMechanismCerBodies" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBobyInformation)&&Validator.isNotNull(cerBobyInformation.getDescribeMechanism())?cerBobyInformation.getDescribeMechanism():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCertiBodyInformation(false);"
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