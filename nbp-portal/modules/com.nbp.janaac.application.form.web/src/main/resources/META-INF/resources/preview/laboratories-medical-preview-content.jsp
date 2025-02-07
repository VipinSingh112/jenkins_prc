<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="laboratories-medical-pre hide">
	<section id="janaacPreviewStep1" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-applicantion-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="applicantNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>
							Contact Information
						</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="applicantTelephonePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsitePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="laboratoryNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="laboratoryAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and Email Address of Personnel in Charge of Laboratory</p>
						<p class="sub_heading_content" id="personnelNamePreview"></p>
						<p class="sub_heading_content" id="personnelEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for the Management of the Quality Management System</p>
						<p class="sub_heading_content" id="personnelQMNamePreview"></p>
						<p class="sub_heading_content" id="personnelQMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Deputy in Charge or Alternate Contact</p>
						<p class="sub_heading_content" id="deputyNamePreview"></p>
						<p class="sub_heading_content" id="deputyEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for Financial Matters</p>
						<p class="sub_heading_content" id="personnelFMNamePreview"></p>
						<p class="sub_heading_content" id="personnelFMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonnelResponsibleDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
							<%if(labMedicalAdd!=null){
	long LabMedicalAppliInfoAddCounter=1;
	for(AddLabAppliInfo labAppliInfo:labMedicalAdd){
%>						
	<tr class="personnel-responsible-row<%=LabMedicalAppliInfoAddCounter%>">
	<td class="sub_heading_content technicalPersonnelName<%=LabMedicalAppliInfoAddCounter%>">
	<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getName():""%></td>
	<td class="sub_heading_content technicalPersonnelEmail<%=LabMedicalAppliInfoAddCounter%>">
	<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getEmail():""%></td>
     </tr>
     <input type="hidden" id="personnelResponsibleId<%=LabMedicalAppliInfoAddCounter%>" name="personnelResponsibleId<%=LabMedicalAppliInfoAddCounter%>" value="<%=labAppliInfo.getAddLabAppliInfoId()%>">
							<%
							LabMedicalAppliInfoAddCounter++;
							}
 }
						%>
						</tbody>
					</table>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelImageHolderPre">
						<%if(Validator.isNotNull(signAuthPersonnel)){ %>
							<img src="<%=signAuthPersonnel%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampImageHolderPre">
						<%if(Validator.isNotNull(companyStamp)){ %>
							<img src="<%=companyStamp%>"  width="100" height="100"/>
							<%} %></div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep2" class="final-preview-section">
		<div class="activity-desc-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Description of Activities</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-activity-desc-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">A. Clinical</p>
						<p class="sub_heading_content" id="clinicalActivityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">B. Shift Work</p>
						<p class="sub_heading_content" id="laboratoryWorkShiftsPreview"></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<p>C. Specimen Collection Sites</p>
					<table class="table table-bordered mb-3">
						<tbody class="addSpecimenCollectionDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number</th>
								<th class="sub_heading text-nowrap">Location</th>
							</tr>
							<%if(labMedicalDecOfActiAdd!=null){
	long LabMedicalDecOfActivityCounter=1;
	for(AddLabDescOfActivity labMedicalDecOfActivityInfo:labMedicalDecOfActiAdd){
%>			
   <tr class="specimen-collection-row<%=LabMedicalDecOfActivityCounter%>">
	<td class="sub_heading_content specimenCollectionNumber<%=LabMedicalDecOfActivityCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getNumber())?labMedicalDecOfActivityInfo.getNumber():""%></td>
	<td class="sub_heading_content specimenCollectionLocation<%=LabMedicalDecOfActivityCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getLocation())?labMedicalDecOfActivityInfo.getLocation():""%></td>
     </tr>
  <input type="hidden" id="specimenCollectionId<%=LabMedicalDecOfActivityCounter%>" name="specimenCollectionId<%=LabMedicalDecOfActivityCounter%>" value="<%=labMedicalDecOfActivityInfo.getAddLabDescOfActivityId()%>">
							<%
							LabMedicalDecOfActivityCounter++;
							}
 }
						%>
						</tbody>
					</table>
				</div>
				
				<div class="col-12 table-responsive">
					<p>D. Point-of-Care Testing (POCT)</p>
					<table class="table table-bordered mb-3">
						<tbody class="addPointCareTestingDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Requested POCT</th>
								<th class="sub_heading text-nowrap">Location</th>
							</tr>
							<%if(labMedicalDecOfActiSecAdd!=null){
	long LabMedicalDecOfActivitySecCounter=1;
	for(AddLabMedicalDescOfActiSec labMedicalDecOfActivitySecInfo:labMedicalDecOfActiSecAdd){
%>			
    <tr class="point-care-testing-row<%=LabMedicalDecOfActivitySecCounter%>">
	<td class="sub_heading_content pointCareTestingReqPoct<%=LabMedicalDecOfActivitySecCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivitySecInfo)&&Validator.isNotNull(labMedicalDecOfActivitySecInfo.getRequestedPoct())?labMedicalDecOfActivitySecInfo.getRequestedPoct():""%></td>
	<td class="sub_heading_content pointCareTestingLocation<%=LabMedicalDecOfActivitySecCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivitySecInfo)&&Validator.isNotNull(labMedicalDecOfActivitySecInfo.getLocation())?labMedicalDecOfActivitySecInfo.getLocation():""%></td>
</tr>
<input type="hidden" id="pointCareTestingId<%=LabMedicalDecOfActivitySecCounter%>" name="pointCareTestingId<%=LabMedicalDecOfActivitySecCounter%>" value="<%=labMedicalDecOfActivitySecInfo.getAddLabMedicalDescOfActiSecId()%>">    
   <%
   LabMedicalDecOfActivitySecCounter++;
							}
 }
						%>					
						</tbody>
					</table>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep3" class="final-preview-section">
		<div class="organization-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">I. The Organization</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-org-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">1.0 Is the laboratory a legal entity?</p>
						<p class="sub_heading_content" id="laboratoryLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-6 laboratoryLegalEntityBox hide">
					<div>
						<p class="sub_heading">Define the legal status (CLAUSE 5.1)</p>
						<p class="sub_heading_content" id="laboratoryLegalEntityDefinePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">2.0 Is the laboratory a part of an organization that performs activities other than examinations (CLAUSE 5.1)?</p>
						<p class="sub_heading_content" id="laboratoryPartOfOrgPreview"></p>
					</div>
				</div>
				<div class="col-12 hide laboratoryPartOfOrgBox">
					<div class="row">
						<div class="col-12">
							<div>
								<p class="sub_heading">3.0 State the names and position of the key personnel of the organization that have 
							responsibility, involvement or influence in examination activities (CLAUSE 6.2)</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addKeyPersonnelDetailsTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Position</th>
									</tr>
		<%if(laboratoryPartOfOrg!=null){
	long LaboratoryPartOfOrgCounter=1;
	for(AddLaboratoryPartOfOrg laboratoryPartOfOrgInfo:laboratoryPartOfOrg){
%>	

<tr class="key-personnel-row<%=LaboratoryPartOfOrgCounter%>">
	<td class="sub_heading_content laboratoryPartOfOrgName<%=LaboratoryPartOfOrgCounter%>">
	<%=Validator.isNotNull(laboratoryPartOfOrgInfo)&&Validator.isNotNull(laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgName())?laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgName():""%></td>
	<td class="sub_heading_content laboratoryPartOfOrgPosition<%=LaboratoryPartOfOrgCounter%>">
	<%=Validator.isNotNull(laboratoryPartOfOrgInfo)&&Validator.isNotNull(laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgPosition())?laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgPosition():""%></td>
</tr>	
     <input type="hidden" id="keyPersonnelId<%=LaboratoryPartOfOrgCounter%>" name="keyPersonnelId<%=LaboratoryPartOfOrgCounter%>" value="<%=laboratoryPartOfOrgInfo.getAddLaboratoryPartOfOrgId()%>">
	 <%
				 LaboratoryPartOfOrgCounter++;
		}
 }
						%>		
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-12 hide laboratoryPartOfOrgBox">
					<div>
						<p class="sub_heading">3.0 State the names and position of the key personnel of the organization that have 
							responsibility, involvement or influence in examination activities (CLAUSE 6.2)</p>
						<p class="sub_heading_content" id="laboratoryPartOfOrgNamePreview"></p>
						<p class="sub_heading_content" id="laboratoryPartOfOrgPositionPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">4.0 List the names of the analysts who are involved in the requested scope of accreditation (CLAUSE 6.2)</p>
						<p class="sub_heading_content" id="analystsNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">5.0 State the name of the key members of staff with signatory authority on the laboratory's 
							organizational chart, indicating the title of their respective jobs and their major responsibilities.(CLAUSE 6.2.3)</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addSignatoryAuthorityDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Name of Staff</th>
								<th class="sub_heading text-nowrap">Job Title</th>
								<th class="sub_heading text-nowrap">Major Responsibilities</th>
							</tr>
							<%if(labMedicalOrganFirstAdd!=null){
	long LabMedicalOrganFirstCounter=1;
	for(AddLabMedicalOrganFirst labMedicalOrganFirstInfo:labMedicalOrganFirstAdd){
%>			
<tr class="signatory-authority-row<%=LabMedicalOrganFirstCounter%>">
	<td class="sub_heading_content staffName<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getNameOfStaff())?labMedicalOrganFirstInfo.getNameOfStaff():""%></td>
	<td class="sub_heading_content jobTitle<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getJobTitle())?labMedicalOrganFirstInfo.getJobTitle():""%></td>
	<td class="sub_heading_content majorResponsibilities<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getMajorResponsibilities())?labMedicalOrganFirstInfo.getMajorResponsibilities():""%></td>
</tr>
<input type="hidden" id="signatoryAuthorityId<%=LabMedicalOrganFirstCounter%>" name="signatoryAuthorityId<%=LabMedicalOrganFirstCounter%>" value="<%=labMedicalOrganFirstInfo.getAddLabMedicalOrganFirstId()%>">    
   <%
   LabMedicalOrganFirstCounter++;
							}
 }
						%>					
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">6.0 List the scope of the examinations for which accreditation is being sought</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addExaminationsScopeDetaiLTable">
							<tr>
								<th class="sub_heading text-nowrap">Product/Material</th>
								<th class="sub_heading text-nowrap">Examinations</th>
								<th class="sub_heading text-nowrap">Methods</th>
								<th class="sub_heading text-nowrap">Equipment</th>
								<th class="sub_heading text-nowrap">Reference Range</th>
								<th class="sub_heading text-nowrap">Measurement Uncertainty</th>
							</tr>
							<%if(labMedicalOrganSecAdd!=null){
	long LabMedicalOrganSecCounter=1;
	for(AddLabMedicalOrganSec labMedicalOrganSecInfo:labMedicalOrganSecAdd){
%>
<tr class="examinations-scope-row<%=LabMedicalOrganSecCounter%>">
	<td class="sub_heading_content product<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getProduct())?labMedicalOrganSecInfo.getProduct():""%></td>
	<td class="sub_heading_content examinations<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getExamination())?labMedicalOrganSecInfo.getExamination():""%></td>
	<td class="sub_heading_content methods<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getMethods())?labMedicalOrganSecInfo.getMethods():""%></td>
	<td class="sub_heading_content equipment<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getEquipment())?labMedicalOrganSecInfo.getEquipment():""%></td>
	<td class="sub_heading_content referenceRange<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getReferenceRange())?labMedicalOrganSecInfo.getReferenceRange():""%></td>
	<td class="sub_heading_content measurementUncertainty<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getMeasurementUncertainty())?labMedicalOrganSecInfo.getMeasurementUncertainty():""%></td>
</tr>
<input type="hidden" id="examinationsScopeId<%=LabMedicalOrganSecCounter%>" name="examinationsScopeId<%=LabMedicalOrganSecCounter%>" value="<%=labMedicalOrganSecInfo.getAddLabMedicalOrganSecId()%>">    
   <%
   LabMedicalOrganSecCounter++;
							}
 }
						%>
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0 </span>What is the major source of income for the Laboratory</p>
						<p class="sub_heading_content" id="majorIncomeSourcePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0 </span>Who are the clients for which the Laboratory provides services</p>
						<p class="sub_heading_content" id="laboratoryClientsPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

  <section id="#janaacPreviewStep4" class="final-preview-section">
		<div class="human-resources-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">II. Human Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="human-resources-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">9.0 Kindly provide a resume for the key
							members of staff with signatory authority including professional
							associations and training courses (CLAUSE 6.2)</p>
						<p class="sub_heading_content" id="keyMemberResume-preview">
						 <%= Validator.isNotNull(resumeHumanUrl) ? resumeHumanUrl :""%>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>			
	<section id="janaacPreviewStep5" class="final-preview-section">
		<div class="physical-resources-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">III. Physical Resources - Facilities, Equipment, Materials</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-physical-res-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">10.0 List the major equipment used in the examination for which accreditation is being sought as
							well as the individual responsible for each equipment. Include equipment contracted for use
							by the Laboratory (CLAUSE 6.4).</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addMajorEquipmentDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Inventory Number</th>
								<th class="sub_heading text-nowrap">Item</th>
								<th class="sub_heading text-nowrap">Manufacturer</th>
								<th class="sub_heading text-nowrap">Model Number</th>
								<th class="sub_heading text-nowrap">Calibration Interval/pm</th>
								<th class="sub_heading text-nowrap">Calibrated By</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading">11.0 If your application covers activities performed at more than one location (including virtual sites if applicable), provide details in the table below</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addApplicationActivityLocDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">12.0 </span>Describe the laboratory's facilities in terms of type of lighting, power and water supplies, 
							monitoring of ambient conditions etc. (CLAUSE 6.3)</p>
						<p class="sub_heading_content" id="laboratoryFacilityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">13.0 </span>What are the safety features and related equipment of the laboratory (e.g. fire protection, 
							alarms, hazardous indications, chemical and other storage areas, eye wash stations, safety 
							showers, etc.) (CLAUSE 6.3)? Please list</p>
						<p class="sub_heading_content" id="safetyFeaturesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0 </span>Describe any special environmental conditions required for the examinations for which 
							accreditation is being sought. What sections of the laboratory require these special  environmental conditions (CLAUSE 6.3)? 
							Describe these conditions, giving reasons</p>
						<p class="sub_heading_content" id="specialEnvironmentalPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">15.0 </span>Describe the environmental or other monitoring activities carried out by the laboratory. 
							(CLAUSE 6.3) </p>
						<p class="sub_heading_content" id="laboratoryMonitoringActivityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0 </span>What are the security arrangements to prevent unauthorized access to the 
							laboratory's  facilities (CLAUSE 6.3.2)?</p>
						<p class="sub_heading_content" id="securityArrangementsPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0 </span>Has the laboratory documented the following requirements of the ISO 15189:2022 standard? </p>
						<p class="sub_heading_content" id="laboratoryDocumentedPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep6" class="final-preview-section">
		<div class="management-system-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">IV. Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-manag-sys-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<p>Management System Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a) Has management established, documented, 
							implemented and maintained a management system to support and demonstrate the 
							consistent fulfilment of the requirements of this document. (8.1)</p>
						<p class="sub_heading_content" id="managementSystemOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefOnePreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach1-preview">
						 <%= Validator.isNotNull(hasManagementEstablishedDocUrl) ? hasManagementEstablishedDocUrl :""%>
						 </p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">b) Are persons doing work under the laboratory's 
							control aware of relevant objectives and policies, their contribution to the effectiveness of the 
							management system and the consequences of not conforming with the management system requirements (8.1.3)</p>
						<p class="sub_heading_content" id="managementSystemTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefTwoPreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach2-preview">
						 <%= Validator.isNotNull(laboratoryControlAwareDocUrl) ? laboratoryControlAwareDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c) Does the laboratory ensure that the objectives and 
							policies are acknowledged and implemented at all levels of the laboratory organization (8.2.1)</p>
						<p class="sub_heading_content" id="managementSystemThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefThreePreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach3-preview">
						<%= Validator.isNotNull(ObjectivepoliciesDocUrl) ? ObjectivepoliciesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">d) Have the laboratory-controlled documents that relate 
							to the fulfilment of the ISO 15189:2022 (8.3.1)</p>
						<p class="sub_heading_content" id="managementSystemFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefFourPreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach4-preview">
						<%= Validator.isNotNull(laboratoryControlledDocUrl) ? laboratoryControlledDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">e) Have the laboratory established and retained legible records (8.4.1)</p>
						<p class="sub_heading_content" id="managementSystemFivePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefFivePreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach5-preview">
						<%= Validator.isNotNull(retainedLegibleRecordsDocUrl) ? retainedLegibleRecordsDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">f) Has the laboratory identify risks and opportunities for 
							improvement associated with the laboratory activities (8.5.1)</p>
						<p class="sub_heading_content" id="managementSystemSixPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefSixPreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach6-preview">
						<%= Validator.isNotNull(laboratoryActivitiesDocUrl) ? laboratoryActivitiesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">g) Does the laboratory have personnel who, irrespective 
							of other responsibilities, have the authority and resources needed to carry out their dutiesd (5.4.2)</p>
						<p class="sub_heading_content" id="managementSystemSevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefSevenPreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach7-preview">
						<%= Validator.isNotNull(irrespectiveResponsibilitiesDocUrl) ? irrespectiveResponsibilitiesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">h) Does the laboratory authorize personnel to perform 
							specific laboratory activities. (6.2..3)</p>
						<p class="sub_heading_content" id="managementSystemEightPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="qualityManualRefEightPreview"></p>
						<p class="sub_heading_content" id="qualityManualRefAttach8-preview">
						 <%= Validator.isNotNull(laboratoryAuthorizePersonnelDocUrl) ? laboratoryAuthorizePersonnelDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<p>Management Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a) Does the laboratory control documents (internal and external)
							that relate to the fulfilment of this document (8.3.1)</p>
						<p class="sub_heading_content" id="managementRquirementOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefOnePreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach1-preview">
						<%= Validator.isNotNull(laboratoryControlDocumentsDocUrl) ? laboratoryControlDocumentsDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">b) Have the laboratory establish and retain legible 
							records to demonstrate fulfilment of the requirements of this document. (8.4.1)</p>
						<p class="sub_heading_content" id="managementRquirementTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach2-preview">
						<%= Validator.isNotNull(demonstrateFulfilmentDocUrl) ? demonstrateFulfilmentDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c) Are procedures in place for the establishment and 
							review of service agreements (6.7)</p>
						<p class="sub_heading_content" id="managementRquirementThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefThreePreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach3-preview">
						<%= Validator.isNotNull(serviceAgreementDocUrl) ? serviceAgreementDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">d) Have the laboratory communicated its requirements to 
							referral laboratories and consultants who provide interpretations and advice (6.8.2)</p>
						<p class="sub_heading_content" id="managementRquirementFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefFourPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach4-preview">
						 <%= Validator.isNotNull(interpretationAdviceDocUrl) ? interpretationAdviceDocUrl :""%>
						</p>
						
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">e) Is there a procedure for selection and purchasing of 
							external services and supplies (6.8.3)</p>
						<p class="sub_heading_content" id="managementRquirementFivePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefFivePreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach5-preview">
						 <%= Validator.isNotNull(serviceSuppliesDocUrl) ? serviceSuppliesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">f) Are arrangements in place to ensure effective 
							resolution of complaints received from clients or other parties? (7.7)</p>
						<p class="sub_heading_content" id="managementRquirementSixPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefSixPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach6-preview">
						<%= Validator.isNotNull(complaintReceivedDocUrl) ? complaintReceivedDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">g) Are there processes in place to ensure adequate 
							control of nonconformities (7.5)</p>
						<p class="sub_heading_content" id="managementRquirementSevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach7-preview">
						<%= Validator.isNotNull(nonconformitiesDocUrl) ? nonconformitiesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">h) Does the laboratory operate a programme of 
							corrective action to eliminate causes of nonconformities (8.7)</p>
						<p class="sub_heading_content" id="managementRquirementEightPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefEightPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach8-preview">
						<%= Validator.isNotNull(programmeCorrectiveDocUrl) ? programmeCorrectiveDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">i) Does the laboratory identify risks and opportunities 
							for improvement associated with the laboratory activities (8.5)</p>
						<p class="sub_heading_content" id="managementRquirementNinePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefNinePreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach9-preview">
						  <%= Validator.isNotNull(improvementAssociatedDocUrl) ? improvementAssociatedDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">j) Has the laboratory established and retain 
							legible  records to demonstrate fulfilment of the requirements of  this document? (8.4.1)</p>
						<p class="sub_heading_content" id="managementRquirementTenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefTenPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach10-preview">
						<%= Validator.isNotNull(retainLegibleDocUrl) ? retainLegibleDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">k) Are arrangements in place to ensure the 
							laboratory  plan and implement the evaluation and internal audit processes for effective management of 
							the quality  system (8.8.3)</p>
						<p class="sub_heading_content" id="managementRquirementElevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefElevenPreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach11-preview">
						 <%= Validator.isNotNull(effectiveManagementDocUrl) ? effectiveManagementDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">l) Are arrangements in place for planned management  reviews 
							to ensure continued suitability, adequacy, effectiveness and support of the quality management  system (8.9) </p>
						<p class="sub_heading_content" id="managementRquirementTwelvePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementReQualityManualRefTwelvePreview"></p>
						<p class="sub_heading_content" id="managementReQualityManualRefAttach12-preview">
						 <%= Validator.isNotNull(suitabilityAdequacyDocUrl) ? suitabilityAdequacyDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<p>Management System - Resource and Process Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a) Does the laboratory have available personnel and support 
							services necessary to manage and perform its  activities(6.2.1)</p>
						<p class="sub_heading_content" id="managementResourceRquirementOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefOnePreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach1-preview">
						 <%= Validator.isNotNull(servicesNecessaryDocUrl) ? servicesNecessaryDocUrl :""%>
						</p>
						
					</div>
				</div>

				<div class="col-12">
					<div>
						<p class="sub_heading">b) Is a continuing education programme available to 
							personnel who participate in managerial and technical  processes. and the suitability of the programme and  activities 
							periodically reviewed (6.2.4)</p>
						<p class="sub_heading_content" id="managementResourceRquirementTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach2-preview">
						 <%= Validator.isNotNull(participateManagerialDocUrl) ? participateManagerialDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c) Are arrangements in place to ensure accommodation 
							and environmental conditions provides quality, safety and efficacy of service to all users of the laboratory (6.3)</p>
						<p class="sub_heading_content" id="managementResourceRquirementThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefThreePreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach3-preview">
						 <%= Validator.isNotNull(accommodationEnvironmentaltDocUrl) ? accommodationEnvironmentaltDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">d) Does the laboratory have processes in place for the 
							selection, purchasing and management of equipment,  reagents and consumables (6.4)</p>
						<p class="sub_heading_content" id="managementResourceRquirementFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefFourPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach4-preview">
						 <%= Validator.isNotNull(selectionPurchasingDocUrl) ? selectionPurchasingDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">e) Does the laboratory verify reagents and 
							consumables before being put into use (6.6.3)</p>
						<p class="sub_heading_content" id="managementResourceRquirementFivePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefFivePreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach5-preview">
						 <%= Validator.isNotNull(reagentsConsumablesDocUrl) ? reagentsConsumablesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">f) Does the laboratory have a documented procedure 
							for pre-examination activities and are readily available(7.2)</p>
						<p class="sub_heading_content" id="managementResourceRquirementSixPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefSixPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach6-preview">
						 <%= Validator.isNotNull(preExaminationActivitiesDocUrl) ? preExaminationActivitiesDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">g) Have the laboratory selected and use examination 
							methods which have been validated for their intended  use to assure the clinical accuracy of the examination for  patient testing?(7.3)</p>
						<p class="sub_heading_content" id="managementResourceRquirementSevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach7-preview">
						 <%= Validator.isNotNull(clinicalAccuracyDocUrl) ? clinicalAccuracyDocUrl :""%>
						</p>
						
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">h) Does the laboratory have a procedure for monitoring 
							the validity of results?(7.3.7)</p>
						<p class="sub_heading_content" id="managementResourceRquirementEightPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefEightPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach8-preview">
						 <%= Validator.isNotNull(procedureMonitoringDocUrl) ? procedureMonitoringDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">i) Does the laboratory validate examination methods 
							derived from none standardized methods?(7.3.3)</p>
						<p class="sub_heading_content" id="managementResourceRquirementNinePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefNinePreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach9-preview">
						 <%= Validator.isNotNull(noneStandardizedMethodsDocUrl) ? noneStandardizedMethodsDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">j) Are measurement uncertainty for each measurement 
							procedure determined, performance requirements  defined and estimates regularly reviewed. (7.3.4)</p>
						<p class="sub_heading_content" id="managementResourceRquirementTenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefTenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach10-preview">
						 <%= Validator.isNotNull(measurementProcedureDeterminedDocUrl) ? measurementProcedureDeterminedDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">k) Does the laboratory have procedures in place to 
							prevent the release of results in the event of quality  control failure. (7.3.7.2)</p>
						<p class="sub_heading_content" id="managementResourceRquirementElevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefElevenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach11-preview">
						 <%= Validator.isNotNull(qualityControlFailureDocUrl) ? qualityControlFailureDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">l) Is there a programme for preventive maintenance of 
							equipment?(6.4.5)</p>
						<p class="sub_heading_content" id="managementResourceRquirementTwelvePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefTwelvePreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach12-preview">
						  <%= Validator.isNotNull(preventiveMaintenanceDocUrl) ? preventiveMaintenanceDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">m) Does the laboratory have a procedure for 
							the calibration of its equipment. (6.5.2) </p>
						<p class="sub_heading_content" id="managementResourceRquirementThirteenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefThirteenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach13-preview">
						  <%= Validator.isNotNull(procedureCalibrationDocUrl) ? procedureCalibrationDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">n) Does the laboratory operate a programme of 
							interlaboratory comparison/proficiency testing (7.3.7.3)</p>
						<p class="sub_heading_content" id="managementResourceRquirementFourteenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefFourteenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach14-preview">
						 <%= Validator.isNotNull(interLaboratoryComparisonDocUrl) ? interLaboratoryComparisonDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">o) Are arrangement in place to ensure quality and 
							reliability of post examination processes (7.4)</p>
						<p class="sub_heading_content" id="managementResourceRquirementFifteenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefFifteenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach15-preview">
						 <%= Validator.isNotNull(postExaminationDocUrl) ? postExaminationDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">p) Do procedures exist for ensuring results are reported 
							accurately, clearly, unambiguously and in accordance  with any specific instructions (7.4.1.1)</p>
						<p class="sub_heading_content" id="managementResourceRquirementSixteenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefSixteenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach16-preview">
							 <%= Validator.isNotNull(reportedAccuratelyDocUrl) ? reportedAccuratelyDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">q) Are responsibilities and procedures for how 
							examination results are released for reporting, including  by whom and to whom, specified?(7.4.1.2)</p>
						<p class="sub_heading_content" id="managementResourceRquirementSeventeenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefSeventeenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach17-preview">
							 <%= Validator.isNotNull(responsibilitiesProceduresDocUrl) ? responsibilitiesProceduresDocUrl :""%>
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">r) Does the laboratory ensure that the authorities and 
							responsibilities for the management of the information  systems are specified, including the maintenance and  modification 
							to the information systems that can affect  patient care?. (7.6.2)</p>
						<p class="sub_heading_content" id="managementResourceRquirementEighteenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual Reference or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefEighteenPreview"></p>
						<p class="sub_heading_content" id="managementResourceQualityManualRefAttach18-preview">
							 <%= Validator.isNotNull(authoritiesAndResponsibilitiesDocUrl) ? authoritiesAndResponsibilitiesDocUrl :""%>
						</p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep7" class="final-preview-section">
		<div class="other-requirements-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">V. Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="medical-other-req-info-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
								</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0 </span>State payment method of Application fee (non-refundable) submitted</p>
						<p class="sub_heading_content" id="paymentMethodFeePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's representative name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's representative position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's representative signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeSignaturePre"><%if(Validator.isNotNull(medicalSign)){ %>
							<img src="<%=medicalSign%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeDatePreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>
</div>
<script>
	function previewMedicalApplicationInfo(){
		applicantName = $("#applicantName").val();
		applicantAddress = $("#applicantAddress").val();
		applicantTelephone = $("#applicantTelephone").val();
		applicantFax = $("#applicantFax").val();
		applicantWebsite = $("#applicantWebsite").val();
		laboratoryName = $("#laboratoryName").val();
		laboratoryAddress = $("#laboratoryAddress").val();
		personnelName = $("#personnelName").val();
		personnelEmail = $("#personnelEmail").val();
		personnelQMName = $("#personnelQMName").val();
		personnelQMEmail = $("#personnelQMEmail").val();
		deputyName = $("#deputyName").val();
		deputyEmail = $("#deputyEmail").val();
		personnelFMName = $("#personnelFMName").val();
		personnelFMEmail = $("#personnelFMEmail").val();
		accreditationRequest=  $("input[name='accreditationRequest']:checked").val();
		authorizedPersonnelName = $("#authorizedPersonnelName").val();
		authorizedPersonnelPosition = $("#authorizedPersonnelPosition").val();
		authorizedPersonnelDate = $("#authorizedPersonnelDate").val();
		$("#applicantNamePreview").html(applicantName);
		$("#applicantAddressPreview").html(applicantAddress);
		$("#applicantTelephonePreview").html(applicantTelephone);
		$("#applicantFaxPreview").html(applicantFax);
		$("#applicantWebsitePreview").html(applicantWebsite);
		$("#laboratoryNamePreview").html(laboratoryName);
		$("#laboratoryAddressPreview").html(laboratoryAddress);
		$("#personnelNamePreview").html(personnelName);
		$("#personnelEmailPreview").html(personnelEmail);
		$("#personnelQMNamePreview").html(personnelQMName);
		$("#personnelQMEmailPreview").html(personnelQMEmail);
		$("#deputyNamePreview").html(deputyName);
		$("#deputyEmailPreview").html(deputyEmail);
		$("#personnelFMNamePreview").html(personnelFMName);
		$("#personnelFMEmailPreview").html(personnelFMEmail);
		$("#accreditationRequestPreview").html(accreditationRequest);
		$("#authorizedPersonnelNamePreview").html(authorizedPersonnelName);
		$("#authorizedPersonnelPositionPreview").html(authorizedPersonnelPosition);
		$("#authorizedPersonnelDatePreview").html(authorizedPersonnelDate);
	}
	function previewMedicalActivityDescInfo(){
		selectedClinicalActivity = [];
		$("input[name='clinicalActivity']:checked").each(function () {
			selectedClinicalActivity.push($(this).val());
		});
		laboratoryWorkShifts = $("#laboratoryWorkShifts").val();
		specimenNumber = $("#specimenNumber").val();
		specimenLocation = $("#specimenLocation").val();
		requestedPOCT = $("#requestedPOCT").val();
		requestedPOCTLocation = $("#requestedPOCTLocation").val();
		$("#laboratoryWorkShiftsPreview").html(laboratoryWorkShifts);
		$("#specimenNumberPreview").html(specimenNumber);
		$("#specimenLocationPreview").html(specimenLocation);
		$("#requestedPOCTPreview").html(requestedPOCT);
		$("#requestedPOCTLocationPreview").html(requestedPOCTLocation);
	}
	function previewMedicalOrganizationDescInfo(){
		laboratoryLegalEntity = $("input[name='laboratoryLegalEntity']:checked").val();
		laboratoryLegalEntityDefine = $("#laboratoryLegalEntityDefine").val();
		laboratoryPartOfOrg = $("input[name='laboratoryPartOfOrg']:checked").val();
		laboratoryPartOfOrgName = $("#laboratoryPartOfOrgName").val();
		laboratoryPartOfOrgPosition = $("#laboratoryPartOfOrgPosition").val();
		analystsName = $("#analystsName").val();
		majorIncomeSource = $("#majorIncomeSource").val();
		laboratoryClients = $("#laboratoryClients").val();
		$("#laboratoryLegalEntityPreview").html(laboratoryLegalEntity);
		$("#laboratoryLegalEntityDefinePreview").html(laboratoryLegalEntityDefine);
		$("#laboratoryPartOfOrgPreview").html(laboratoryPartOfOrg);
		$("#laboratoryPartOfOrgNamePreview").html(laboratoryPartOfOrgName);
		$("#laboratoryPartOfOrgPositionPreview").html(laboratoryPartOfOrgPosition);
		$("#analystsNamePreview").html(analystsName);
		$("#majorIncomeSourcePreview").html(majorIncomeSource);
		$("#laboratoryClientsPreview").html(laboratoryClients);
	}
	function previewMedicalPhysicalResInfo(){
		laboratoryFacility = $("#laboratoryFacility").val();
		safetyFeatures = $("#safetyFeatures").val();
		specialEnvironmental = $("#specialEnvironmental").val();
		laboratoryMonitoringActivity = $("#laboratoryMonitoringActivity").val();
		securityArrangements = $("#securityArrangements").val();
		laboratoryDocumented = $("#laboratoryDocumented").val();
		$("#laboratoryFacilityPreview").html(laboratoryFacility);
		$("#safetyFeaturesPreview").html(safetyFeatures);
		$("#specialEnvironmentalPreview").html(specialEnvironmental);
		$("#laboratoryMonitoringActivityPreview").html(laboratoryMonitoringActivity);
		$("#securityArrangementsPreview").html(securityArrangements);
		$("#laboratoryDocumentedPreview").html(laboratoryDocumented);
	}
	function previewMedicalManagementInfo(){
		managementSystemOne = $("input[name='managementSystemOne']:checked").val();
		managementSystemTwo = $("input[name='managementSystemTwo']:checked").val();
		managementSystemThree = $("input[name='managementSystemThree']:checked").val();
		managementSystemFour = $("input[name='managementSystemFour']:checked").val();
		managementSystemFive = $("input[name='managementSystemFive']:checked").val();
		managementSystemSix = $("input[name='managementSystemSix']:checked").val();
		managementSystemSeven = $("input[name='managementSystemSeven']:checked").val();
		managementSystemEight = $("input[name='managementSystemEight']:checked").val();
		managementRquirementOne = $("input[name='managementRquirementOne']:checked").val();
		managementRquirementTwo = $("input[name='managementRquirementTwo']:checked").val();
		managementRquirementThree = $("input[name='managementRquirementThree']:checked").val();
		managementRquirementFour = $("input[name='managementRquirementFour']:checked").val();
		managementRquirementFive = $("input[name='managementRquirementFive']:checked").val();
		managementRquirementSix = $("input[name='managementRquirementSix']:checked").val();
		managementRquirementSeven = $("input[name='managementRquirementSeven']:checked").val();
		managementRquirementEight = $("input[name='managementRquirementEight']:checked").val();
		managementRquirementNine = $("input[name='managementRquirementNine']:checked").val();
		managementRquirementTen = $("input[name='managementRquirementTen']:checked").val();
		managementRquirementEleven = $("input[name='managementRquirementEleven']:checked").val();
		managementRquirementTwelve = $("input[name='managementRquirementTwelve']:checked").val();
		managementResourceRquirementOne = $("input[name='managementResourceRquirementOne']:checked").val();
		managementResourceRquirementTwo = $("input[name='managementResourceRquirementTwo']:checked").val();
		managementResourceRquirementThree = $("input[name='managementResourceRquirementThree']:checked").val();
		managementResourceRquirementFour = $("input[name='managementResourceRquirementFour']:checked").val();
		managementResourceRquirementFive = $("input[name='managementResourceRquirementFive']:checked").val();
		managementResourceRquirementSix = $("input[name='managementResourceRquirementSix']:checked").val();
		managementResourceRquirementSeven = $("input[name='managementResourceRquirementSeven']:checked").val();
		managementResourceRquirementEight = $("input[name='managementResourceRquirementEight']:checked").val();
		managementResourceRquirementNine = $("input[name='managementResourceRquirementNine']:checked").val();
		managementResourceRquirementTen = $("input[name='managementResourceRquirementTen']:checked").val();
		managementResourceRquirementEleven = $("input[name='managementResourceRquirementEleven']:checked").val();
		managementResourceRquirementTwelve = $("input[name='managementResourceRquirementTwelve']:checked").val();
		managementResourceRquirementThirteen = $("input[name='managementResourceRquirementThirteen']:checked").val();
		managementResourceRquirementFourteen = $("input[name='managementResourceRquirementFourteen']:checked").val();
		managementResourceRquirementFifteen = $("input[name='managementResourceRquirementFifteen']:checked").val();
		managementResourceRquirementSixteen = $("input[name='managementResourceRquirementSixteen']:checked").val();
		managementResourceRquirementSeventeen = $("input[name='managementResourceRquirementSeventeen']:checked").val();
		managementResourceRquirementEighteen = $("input[name='managementResourceRquirementEighteen']:checked").val();
		$("#managementSystemOnePreview").html(managementSystemOne);
		$("#managementSystemTwoPreview").html(managementSystemTwo);
		$("#managementSystemThreePreview").html(managementSystemThree);
		$("#managementSystemFourPreview").html(managementSystemFour);
		$("#managementSystemFivePreview").html(managementSystemFive);
		$("#managementSystemSixPreview").html(managementSystemSix);
		$("#managementSystemSevenPreview").html(managementSystemSeven);
		$("#managementSystemEightPreview").html(managementSystemEight);
		$("#managementRquirementOnePreview").html(managementRquirementOne);
		$("#managementRquirementTwoPreview").html(managementRquirementTwo);
		$("#managementRquirementThreePreview").html(managementRquirementThree);
		$("#managementRquirementFourPreview").html(managementRquirementFour);
		$("#managementRquirementFivePreview").html(managementRquirementFive);
		$("#managementRquirementSixPreview").html(managementRquirementSix);
		$("#managementRquirementSevenPreview").html(managementRquirementSeven);
		$("#managementRquirementEightPreview").html(managementRquirementEight);
		$("#managementRquirementNinePreview").html(managementRquirementNine);
		$("#managementRquirementTenPreview").html(managementRquirementTen);
		$("#managementRquirementElevenPreview").html(managementRquirementEleven);
		$("#managementRquirementTwelvePreview").html(managementRquirementTwelve);
		$("#managementResourceRquirementOnePreview").html(managementResourceRquirementOne);
		$("#managementResourceRquirementTwoPreview").html(managementResourceRquirementTwo);
		$("#managementResourceRquirementThreePreview").html(managementResourceRquirementThree);
		$("#managementResourceRquirementFourPreview").html(managementResourceRquirementFour);
		$("#managementResourceRquirementFivePreview").html(managementResourceRquirementFive);
		$("#managementResourceRquirementSixPreview").html(managementResourceRquirementSix);
		$("#managementResourceRquirementSevenPreview").html(managementResourceRquirementSeven);
		$("#managementResourceRquirementEightPreview").html(managementResourceRquirementEight);
		$("#managementResourceRquirementNinePreview").html(managementResourceRquirementNine);
		$("#managementResourceRquirementTenPreview").html(managementResourceRquirementTen);
		$("#managementResourceRquirementElevenPreview").html(managementResourceRquirementEleven);
		$("#managementResourceRquirementTwelvePreview").html(managementResourceRquirementTwelve);
		$("#managementResourceRquirementThirteenPreview").html(managementResourceRquirementThirteen);
		$("#managementResourceRquirementFourteenPreview").html(managementResourceRquirementFourteen);
		$("#managementResourceRquirementFifteenPreview").html(managementResourceRquirementFifteen);
		$("#managementResourceRquirementSixteenPreview").html(managementResourceRquirementSixteen);
		$("#managementResourceRquirementSeventeenPreview").html(managementResourceRquirementSeventeen);
		$("#managementResourceRquirementEighteenPreview").html(managementResourceRquirementEighteen);
	}
	function previewMedicalOtherReqInfo(){
		paymentMethod = $("#paymentMethod").val();
		applicantRepresentativeName = $("#applicantRepresentativeName").val();
		applicantRepresentativePosition = $("#applicantRepresentativePosition").val();
		applicantRepresentativeDate = $("#applicantRepresentativeDate").val();
		$("#paymentMethodPreview").html(paymentMethod);
		$("#applicantRepresentativeNamePreview").html(applicantRepresentativeName);
		$("#applicantRepresentativePositionPreview").html(applicantRepresentativePosition);
		$("#applicantRepresentativeDatePreview").html(applicantRepresentativeDate);
	}
</script>