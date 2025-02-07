<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="laboratories-testing-pre hide">
	<section id="janaacPreviewStep8" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-applicantion-info-edit-tab">
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
						<p class="sub_heading_content" id="testingApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="testingApplicantAddressPreview"></p>
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
						<p class="sub_heading_content" id="testingApplicantTelephonePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="testingApplicantFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="testingApplicantWebsitePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="testingLaboratoryNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="testingLaboratoryAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and Email Address of Personnel in Charge of Laboratory</p>
						<p class="sub_heading_content" id="testingPersonnelNamePreview"></p>
						<p class="sub_heading_content" id="testingPersonnelEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for the Management of the Quality Management System</p>
						<p class="sub_heading_content" id="testingPersonnelQMNamePreview"></p>
						<p class="sub_heading_content" id="testingPersonnelQMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Deputy in Charge or Alternate Contact</p>
						<p class="sub_heading_content" id="testingDeputyNamePreview"></p>
						<p class="sub_heading_content" id="testingDeputyEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for Financial Matters</p>
						<p class="sub_heading_content" id="testingPersonnelFMNamePreview"></p>
						<p class="sub_heading_content" id="testingPersonnelFMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel Responsible for Technical Management</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addPersonnelResponsibleTestingDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name</th>
                                <th class="sub_heading text-nowrap">Email</th>
                            </tr>
                            <%if(labMedicalAdd!=null){
long LabMedicalAppliInfoAddCounter=1;
for(AddLabAppliInfo labAppliInfo:labMedicalAdd){
%>						
  <tr class="testing-responsible-row<%=LabMedicalAppliInfoAddCounter%>">
<td class="sub_heading_content testingSpecimenCollectionNumber<%=LabMedicalAppliInfoAddCounter%>">
<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getName():""%></td>
<td class="sub_heading_content testingSpecimenCollectionLocation<%=LabMedicalAppliInfoAddCounter%>">
<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getEmail():""%></td>
</tr>
     <input type="hidden" id="testingSpecimenCollectionId<%=LabMedicalAppliInfoAddCounter%>" name="testingSpecimenCollectionId<%=LabMedicalAppliInfoAddCounter%>" value="<%=labAppliInfo.getAddLabAppliInfoId()%>">
					<%
						LabMedicalAppliInfoAddCounter++;
						}
}
					%>
		</tbody>
                        </tbody>
                    </table>
                </div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="testingAccreditationRequestPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="testingAuthorizedPersonnelNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="testingAuthorizedPersonnelPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="testingAuthorizedPersonnelDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelTestingImageHolderPre"><%if(Validator.isNotNull(signAuthPersonnelTest)){ %>
							<img src="<%=signAuthPersonnelTest%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampTestingImageHolderPre">
						<%if(Validator.isNotNull(companyStampTest)){ %>
							<img src="<%=companyStampTest%>"  width="100" height="100"/>
							<%} %></div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep9" class="final-preview-section">
		<div class="activity-desc-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Description of Activities</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-activity-desc-info-edit-tab">
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
						<p class="sub_heading">Description of Activity</p>
						<p class="sub_heading_content" id="testingClinicalActivityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Shift Work</p>
						<p class="sub_heading_content" id="testingLaboratoryWorkShiftsPreview"></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addTestingSpecimenCollectionDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number</th>
								<th class="sub_heading text-nowrap">Location</th>

							</tr>
							<%if(labMedicalDecOfActiAdd!=null){
long LabMedicalDecOfActivityCounter=1;
for(AddLabDescOfActivity labMedicalDecOfActivityInfo:labMedicalDecOfActiAdd){
%>			
<tr class="testing-responsible-row<%=LabMedicalDecOfActivityCounter%>">
<td class="sub_heading_content testingSpecimenCollectionNumber<%=LabMedicalDecOfActivityCounter%>">
<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getNumber())?labMedicalDecOfActivityInfo.getNumber():""%></td>
<td class="sub_heading_content testingSpecimenCollectionLocation<%=LabMedicalDecOfActivityCounter%>">
<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getLocation())?labMedicalDecOfActivityInfo.getLocation():""%></td>
</tr>
  <input type="hidden" id="testingSpecimenCollectionId<%=LabMedicalDecOfActivityCounter%>" name="testingSpecimenCollectionId<%=LabMedicalDecOfActivityCounter%>" value="<%=labMedicalDecOfActivityInfo.getAddLabDescOfActivityId()%>">
					<%
						LabMedicalDecOfActivityCounter++;
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

	<section id="janaacPreviewStep10" class="final-preview-section">
		<div class="structural-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">I. Structural Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-structural-req-info-edit-tab">
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
						<p class="sub_heading_content" id="structuralLaboratoryLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-6 structuralLaboratoryLegalEntityBox hide">
					<div>
						<p class="sub_heading">Define the legal status (CLAUSE 5.1)</p>
						<p class="sub_heading_content" id="structuralLaboratoryLegalEntityDefinePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">2.0 Is the laboratory a part of a larger organization that performs 
                            activities other than testing?(CLAUSE 5.1.)</p>
						<p class="sub_heading_content" id="laboratoryPartOfTestingPreview"></p>
					</div>
				</div>
				<div class="col-12 hide laboratoryPartOfTestingBox">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0 </span>Define its place in the parent organization as well as the relationship between management,
                            technical operations and support services. (CLAUSE 5.5a)</p>
						<p class="sub_heading_content" id="testingLaboratoryPartOfOrgNamePreview"></p>
						<p class="sub_heading_content" id="testingLaboratoryPartOfOrgPositionPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p>
							<span class="tab-form-highlghtme-link">4.0 </span> Indicate Staff Size
						</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Managerial</p>
						<p class="sub_heading_content" id="testingManagerialStaffSizePreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Technical</p>
						<p class="sub_heading_content" id="testingTechnicalStaffSizePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0 </span>Staff Details</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name of Staff</th>
                                <th class="sub_heading text-nowrap">Job Title</th>
                                <th class="sub_heading text-nowrap">Major Responsibilities</th>
                                <th class="sub_heading text-nowrap">Indicate (X) analysts involved in requested scope of accreditation</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading">
							<span class="tab-form-highlghtme-link">6.0 </span> Indicate all
							relevant regulations, standards, codes, guidelines and/or other
							normative documents that govern your operations (CLAUSE 5.4)
						</p>
						<p class="sub_heading_content" id="normativeDocuments-preview">
						 <%= Validator.isNotNull(normatDocUrl) ? normatDocUrl :""%>
						</p>
						<p class="sub_heading_content" id="allTestingRelevantDocumentsPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0 </span> List the scope of the tests for which accreditation is being sought, 
                            (including limits of capability, where applicable)</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addScopeForAccreditationDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Product/Material</th>
                                <th class="sub_heading text-nowrap">Tests</th>
                                <th class="sub_heading text-nowrap">Method/Technique</th>
                                <th class="sub_heading text-nowrap">Equipment</th>
                                <th class="sub_heading text-nowrap">Limits of Capability</th>
                                <th class="sub_heading text-nowrap">Estimate of Measurement Uncertainty</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0 </span>What is the major source of income for the Laboratory</p>
						<p class="sub_heading_content" id="majorIncomeSourceTestingPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0 </span>Who are the clients for which the Laboratory provides services</p>
						<p class="sub_heading_content" id="testingLaboratoryClientsPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep11" class="final-preview-section">
		<div class="testing-resource-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">II. Resource Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-resource-req-info-edit-tab">
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
						<p>
							<span class="tab-form-highlghtme-link">A.</span> Personnel
						</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">10.0 </span>Are there external personnel who influence laboratory activities?</p>
                        <p class="sub_heading_content" id="testingExternalPersonnelPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0 </span>Provide competence requirements, qualifications and duties for the personnel (internal and external) who manage, perform or verify work affecting the results of laboratory activities (CLAUSE 6.2.2, 6.2.4)</p>
                        <p class="sub_heading_content" id="testingCompetenceRequirementsPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p>
							<span class="tab-form-highlghtme-link">B.</span> Facilities and Environmental Conditions
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">12.0 </span>If your application covers activities performed at more than one location</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addActivityPerformedLocDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
                                <th class="sub_heading text-nowrap">Location/Address</th>
                                <th class="sub_heading text-nowrap">Activities performed at location</th>
                                <th class="sub_heading text-nowrap">Contact Details</th>
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
				<div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">13.0 </span>Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3)</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">a) </span>The laboratory's facilities</p>
                        <p class="sub_heading_content" id="laboratoryFacilitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">b) </span>Contracted facilities used by the laboratory (if applicable) (CLAUSE 5.4, 6.3.5)</p>
                        <p class="sub_heading_content" id="laboratoryContractedFacilitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0 </span>Describe the laboratory's facilities in terms of type of lighting, power, ventilation, water supplies 
                            and other environmental requirements (CLAUSE 6.3.2)</p>
                        <p class="sub_heading_content" id="laboratoryFacilityEnvReqPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">15.0 </span>Describe, giving reasons, any special environmental conditions for the tests for which 
                            accreditation is being sought, identifying sections of the laboratory that require these conditions. (CLAUSE 6.3.2)</p>
                        <p class="sub_heading_content" id="specialEnvConditionsPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0 </span>Describe the environmental or other monitoring activities carried out by the laboratory. (CLAUSE 6.3.3)</p>
                        <p class="sub_heading_content" id="monitoringActivitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0 </span>What are the safety features and related equipment of the laboratory</p>
                        <p class="sub_heading_content" id="laboratoryRelatedEquipmentPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0 </span>What are the security arrangements to prevent unauthorized access to the laboratory's 
                            facilities (CLAUSE 6.3.4)?</p>
                        <p class="sub_heading_content" id="testingSecurityArrangementsPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p>
							<span class="tab-form-highlghtme-link">C.</span> Equipment
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">19.0 </span>List the major equipment used in the tests for which accreditation is being sought Include 
                            equipment contracted for use by the laboratory (CLAUSE 6.4).</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addMajorEquipmentTestingDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Inventory Number</th>
                                <th class="sub_heading text-nowrap">Item</th>
                                <th class="sub_heading text-nowrap">Manufacturer</th>
                                <th class="sub_heading text-nowrap">Model Number</th>
                                <th class="sub_heading text-nowrap">Calibration Interval</th>
                                <th class="sub_heading text-nowrap">Calibrated By</th>
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
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep12" class="final-preview-section">
		<div class="testing-manage-sys-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">
                            Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-manage-sys-info-edit-tab">
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
                    <p><span class="tab-form-highlghtme-link">20.0 </span>Has the laboratory documented the following requirements of the ISO/IEC 17025:2017 Standard?</p></p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a) Policies and objectives for fulfilling the requirements of this 
                            standard: 8.2.1</p>
						<p class="sub_heading_content" id="managementSystemTestingOnePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefOnePreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach1-preview">
						 <%= Validator.isNotNull(PoliciesObjectivesDocUrl) ? PoliciesObjectivesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Provisions for impartiality: 4.1</p>
						<p class="sub_heading_content" id="managementSystemTestingTwoPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefTwoPreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach2-preview">
						<%= Validator.isNotNull(ProvisionsImpartialityDocUrl) ? ProvisionsImpartialityDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Provisions for confidentiality: 4.2</p>
						<p class="sub_heading_content" id="managementSystemTestingThreePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefThreePreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach3-preview">
						<%= Validator.isNotNull(ProvisionsConfidentialityDocUrl) ? ProvisionsConfidentialityDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Evidence of commitment to development/implementation/continuous improvement of the management system: 8.2.3</p>
						<p class="sub_heading_content" id="managementSystemTestingFourPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefFourPreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach4-preview">
						<%= Validator.isNotNull(developmentImplementDocUrl) ? developmentImplementDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Evidence of references to management system processes, systems records and other documentation: 8.2.4</p>
						<p class="sub_heading_content" id="managementSystemTestingFivePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefFivePreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach5-preview">
						<%= Validator.isNotNull(evidenceReferencesDocUrl1) ? evidenceReferencesDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Documents describing roles, responsibilities and interrelationship of personnel who manage, perform and verify work affecting the results of laboratory activities: 5.5 b</p>
						<p class="sub_heading_content" id="managementSystemTestingSixPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefSixPreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach6-preview">
						<%= Validator.isNotNull(laboratoryActivitiesTestDocUrl) ? laboratoryActivitiesTestDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Roles and responsibilities of personnel with responsibility for the management system: 5.6</p>
						<p class="sub_heading_content" id="managementSystemTestingSevenPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocRefSevenPreview"></p>
						<p class="sub_heading_content" id="labDocRefAttach7-preview">
						<%= Validator.isNotNull(personnelResponsibilityDocUrl1) ? personnelResponsibilityDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<p>Management System Documentation - Resource Requirements</p>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Determination of competence requirements: 6.2.5</p>
						<p class="sub_heading_content" id="managSysReqResDocOnePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefOnePreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach1-preview">
						<%= Validator.isNotNull(determinationCompetenceDocUrl) ? determinationCompetenceDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Selection, training supervision, authorization and monitoring of personnel: 6.2.5</p>
						<p class="sub_heading_content" id="managSysReqResDocTwoPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach2-preview">
						 <%= Validator.isNotNull(monitoringPersonnelDocUrl) ? monitoringPersonnelDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Handling, transport, storage, use and planned maintenance of equipment: 6.4.3</p>
						<p class="sub_heading_content" id="managSysReqResDocThreePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefThreePreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach3-preview">
						<%= Validator.isNotNull(handlingTransportDocUrl1) ? handlingTransportDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Calibration programme: 6.4.7</p>
						<p class="sub_heading_content" id="managSysReqResDocFourPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefFourPreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach4-preview">
						<%= Validator.isNotNull(calibrationProgrammeDocUrl1) ? calibrationProgrammeDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Defining, reviewing and approving the requirements for externally provided products and services: 6.6.2</p>
						<p class="sub_heading_content" id="managSysReqResDocFivePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefFivePreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach5-preview">
						<%= Validator.isNotNull(reviewingApprovingDocUrl1) ? reviewingApprovingDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Selection, evaluation and monitoring performance of external providers of products and services: 6.6.2</p>
						<p class="sub_heading_content" id="managSysReqResDocSixPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefSixPreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach6-preview">
						 <%= Validator.isNotNull(selectionEvaluationDocUrl1) ? selectionEvaluationDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Ensuring that externally provided products and services conform to laboratory requirements and taking actions, where necessary: 6.6.2</p>
						<p class="sub_heading_content" id="managSysReqResDocSevenPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocResReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="labDocResReqRefAttach7-preview">
						<%= Validator.isNotNull(ensuringExternallyDocUrl) ? ensuringExternallyDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-md-12">
                    <p>Management System Documentation - Process Requirements</p>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Review of requests, tenders and contracts: 7.1. 1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocOnePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefOnePreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach1-preview">
						<%= Validator.isNotNull(tendersContractsDocUrl1) ? tendersContractsDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Procedures for laboratory: 7.2.1.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocTwoPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach2-preview">
						<%= Validator.isNotNull(proceduresLaboratoryDocUrl1) ? proceduresLaboratoryDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Test methods & validation: 7.2.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocThreePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefThreePreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach3-preview">
						<%= Validator.isNotNull(methodsValidationDocUrl) ? methodsValidationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Reference to a sampling plan: 7.3</p>
						<p class="sub_heading_content" id="managSysReqProcessDocFourPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefFourPreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach4-preview">
						<%= Validator.isNotNull(referenceSamplingDocUrl) ? referenceSamplingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Transportation, receipt, handling, protection, storage retention and disposal of test items: 7.4.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocFivePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefFivePreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach5-preview">
						<%= Validator.isNotNull(transportationReceiptDocUrl) ? transportationReceiptDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Uncertainty of measurement: 7.2.1.1, 7.6.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocSixPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefSixPreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach6-preview">
						<%= Validator.isNotNull(uncertaintyMeasurementDocUrl1) ? uncertaintyMeasurementDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Monitoring the validity of test results: 7.7.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocSevenPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach7-preview">
						<%= Validator.isNotNull(monitoringValidityDocUrl) ? monitoringValidityDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">h)Complaints: 7.9.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocEightPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefEightPreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach8-preview">
						<%= Validator.isNotNull(complaintsLaboratoryDocUrl) ? complaintsLaboratoryDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">i) Nonconforming work: 7.10.1</p>
						<p class="sub_heading_content" id="managSysReqProcessDocNinePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocProcessReqRefNinePreview"></p>
						<p class="sub_heading_content" id="labDocProcessReqRefAttach9-preview">
						<%= Validator.isNotNull(nonconformingWorkDocUrl1) ? nonconformingWorkDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-md-12">
                    <p>Management System Procedures - Management Requirements</p>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Unique identification of management system documents:8.3.2e</p>
						<p class="sub_heading_content" id="managSysReqManagementDocOnePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefOnePreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach1-preview">
						<%= Validator.isNotNull(uniqueIdentificationDocUrl1) ? uniqueIdentificationDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Identification of current revision status of documents: 8.3.2</p>
						<p class="sub_heading_content" id="managSysReqManagementDocTwoPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach2-preview">
						<%= Validator.isNotNull(identificationCurrentDocUrl) ? identificationCurrentDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Identification of document changes: 8.3.2c</p>
						<p class="sub_heading_content" id="managSysReqManagementDocThreePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefThreePreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach3-preview">
						<%= Validator.isNotNull(identificationChangesDocUrl1) ? identificationChangesDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Reference to control of records: 8.4</p>
						<p class="sub_heading_content" id="managSysReqManagementDocFourPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefFourPreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach4-preview">
						<%= Validator.isNotNull(controlRecordsDocUrl1) ? controlRecordsDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Reference to planned actions to address risks: 8.5.2</p>
						<p class="sub_heading_content" id="managSysReqManagementDocFivePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefFivePreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach5-preview">
						<%= Validator.isNotNull(addressRisksDocUrl) ? addressRisksDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Reference to identification of improvement opportunities and taking actions: 8.6</p>
						<p class="sub_heading_content" id="managSysReqManagementDocSixPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefSixPreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach6-preview">
						<%= Validator.isNotNull(improvementOpportunitiesDocUrl) ? improvementOpportunitiesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Reference to corrective action activities: 8.7</p>
						<p class="sub_heading_content" id="managSysReqManagementDocSevenPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach7-preview">
						 <%= Validator.isNotNull(correctiveActionActivitiesDocUrl1) ? correctiveActionActivitiesDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">h) Internal audits: 8.8</p>
						<p class="sub_heading_content" id="managSysReqManagementDocEightPreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefEightPreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach8-preview">
						 <%= Validator.isNotNull(internalAuditsDocUrl1) ? internalAuditsDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">i) Management reviews: 8.9 1</p>
						<p class="sub_heading_content" id="managSysReqManagementDocNinePreview"></p>
					</div>
					<div class="labDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefNinePreview"></p>
						<p class="sub_heading_content" id="labDocManagementReqRefAttach9-preview">
						<%= Validator.isNotNull(managementReviewsDocUrl1) ? managementReviewsDocUrl1 :""%>
						</p>
					</div>
				</div>
            </div>
        </div>
    </section>

	<section id="janaacPreviewStep13" class="final-preview-section">
		<div class="testing-other-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="testing-other-req-info-edit-tab">
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
						<p class="sub_heading">State payment method of Application fee (non-refundable) submitted</p>
						<p class="sub_heading_content" id="paymentMethodTestingPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameTestingPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionTestingPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeSignatureTestingPre"><%if(Validator.isNotNull(testingSign)){ %>
							<img src="<%=testingSign%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeDateTestingPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>
</div>