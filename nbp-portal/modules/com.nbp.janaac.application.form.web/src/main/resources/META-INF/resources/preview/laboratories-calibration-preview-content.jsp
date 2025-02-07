<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@ include file="/attachDoc.jsp" %>
<div class="laboratories-calibration-pre hide">
	<section id="janaacPreviewStep14" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-applicantion-info-edit-tab">
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
						<p class="sub_heading_content" id="calibrationApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="calibrationApplicantAddressPreview"></p>
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
						<p class="sub_heading_content" id="calibrationApplicantTelephonePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="calibrationApplicantFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="calibrationApplicantWebsitePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="calibrationLaboratoryNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Laboratory Seeking Accreditation</p>
						<p class="sub_heading_content" id="calibrationAaboratoryAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and Email Address of Personnel in Charge of Laboratory</p>
						<p class="sub_heading_content" id="calibrationPersonnelNamePreview"></p>
						<p class="sub_heading_content" id="calibrationPersonnelEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for the Management of the Quality Management System</p>
						<p class="sub_heading_content" id="calibrationPersonnelQMNamePreview"></p>
						<p class="sub_heading_content" id="calibrationPersonnelQMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Deputy in Charge or Alternate Contact</p>
						<p class="sub_heading_content" id="calibrationDeputyNamePreview"></p>
						<p class="sub_heading_content" id="calibrationDeputyEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel with Responsibility for Financial Matters</p>
						<p class="sub_heading_content" id="calibrationPersonnelFMNamePreview"></p>
						<p class="sub_heading_content" id="calibrationPersonnelFMEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel Responsible for Technical Management</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addPersonnelResponsibleCalibrationDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name</th>
                                <th class="sub_heading text-nowrap">Email</th>
                            </tr>
                            <%if(labMedicalAdd!=null){
long labCelAppliInfoCounter=1;
for(AddLabAppliInfo labCelAppliInfo:labMedicalAdd){
%>			
<tr class="personnel-responsible-calibration-row<%=labCelAppliInfoCounter%>">
<td class="sub_heading_content technicalPersonnelNameCalibration<%=labCelAppliInfoCounter%>">
<%=Validator.isNotNull(labCelAppliInfo)&&Validator.isNotNull(labCelAppliInfo.getName())?labCelAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonnelEmailCalibration<%=labCelAppliInfoCounter%>">
<%=Validator.isNotNull(labCelAppliInfo)&&Validator.isNotNull(labCelAppliInfo.getEmail())?labCelAppliInfo.getEmail():""%></td>
</tr>
  <input type="hidden" id="personnelResponsibleCalibrationId<%=labCelAppliInfoCounter%>" name="personnelResponsibleCalibrationId<%=labCelAppliInfoCounter%>" value="<%=labCelAppliInfo.getAddLabAppliInfoId()%>">
					<%
						labCelAppliInfoCounter++;
						}
}
					%>	
                        </tbody>
                    </table>
                </div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="calibrationAccreditationRequestPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="calibrationAuthorizedPersonnelNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="calibrationAuthorizedPersonnelPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="calibrationAuthorizedPersonnelDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelCalibrationImageHolderPre"><%if(Validator.isNotNull(signAuthPersonnelCaliber)){ %>
							<img src="<%=signAuthPersonnelCaliber%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampCalibrationImageHolderPre"><%if(Validator.isNotNull(companyStampCaliber)){ %>
							<img src="<%=companyStampCaliber%>"  width="100" height="100"/>
							<%} %></div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep15" class="final-preview-section">
		<div class="activity-desc-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Description of Activities</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-activity-desc-info-edit-tab">
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
						<p class="sub_heading_content" id="calibrationClinicalActivityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Shift Work</p>
						<p class="sub_heading_content" id="calibrationLaboratoryWorkShiftsPreview"></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addCalibrationSpecimenCollectionDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number</th>
								<th class="sub_heading text-nowrap">Location</th>
							</tr>
							<%if(labMedicalDecOfActiAdd!=null){
long LabCelDecOfActiCounter=1;
for(AddLabDescOfActivity labCelDecOfActivityInfo:labMedicalDecOfActiAdd){
%>			
<tr class="calibration-responsible-row<%=LabCelDecOfActiCounter%>">
<td class="sub_heading_content calibrationSpecimenNumber<%=LabCelDecOfActiCounter%>">
<%=Validator.isNotNull(labCelDecOfActivityInfo)&&Validator.isNotNull(labCelDecOfActivityInfo.getNumber())?labCelDecOfActivityInfo.getNumber():""%></td>
<td class="sub_heading_content calibrationSpecimenLocation<%=LabCelDecOfActiCounter%>">
<%=Validator.isNotNull(labCelDecOfActivityInfo)&&Validator.isNotNull(labCelDecOfActivityInfo.getLocation())?labCelDecOfActivityInfo.getLocation():""%></td>
</tr>
  <input type="hidden" id="calibrationSpecimenCollectionId<%=LabCelDecOfActiCounter%>" name="calibrationSpecimenCollectionId<%=LabCelDecOfActiCounter%>" value="<%=labCelDecOfActivityInfo.getAddLabDescOfActivityId()%>">
					<%
						LabCelDecOfActiCounter++;
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

	<section id="janaacPreviewStep16" class="final-preview-section">
		<div class="structural-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">I. Structural Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-structural-req-info-edit-tab">
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
						<p class="sub_heading_content" id="calibrationLaboratoryLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-6 calibrationLaboratoryLegalEntityBox hide">
					<div>
						<p class="sub_heading">Define the legal status (CLAUSE 5.1)</p>
						<p class="sub_heading_content" id="calibrationLaboratoryLegalEntityDefinePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">2.0 Is the Calibration Laboratory a part of a larger organization that performs 
							activities other than calibration??(CLAUSE 5.1.)</p>
						<p class="sub_heading_content" id="calibrationLaboratoryPartOfTestingPreview"></p>
					</div>
				</div>
				<div class="col-12 hide calibrationLaboratoryPartOfTestingBox">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0 </span>Define its place in the parent organization as well as the relationship between management,
                            technical operations and support services. (CLAUSE 5.5a)</p>
						<p class="sub_heading_content" id="calibrationLaboratoryPartOfOrgNamePreview"></p>
						<p class="sub_heading_content" id="calibrationLaboratoryPartOfOrgPositionPreview"></p>
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
						<p class="sub_heading_content" id="calibrationManagerialStaffSizePreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Technical</p>
						<p class="sub_heading_content" id="calibrationTechnicalStaffSizePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0 </span>Staff Details</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailCalibrationTable">
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
<tr class="staff-detail-calibration-row<%=testStructuralReqCounter%>">
<td class="sub_heading_content staffNameCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getNameOfStaff())?labMedicalOrganFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getJobTitle())?labMedicalOrganFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getMajorResponsibilities())?labMedicalOrganFirstInfo.getMajorResponsibilities():""%></td>
<td class="sub_heading_content analystsInvolveCalibration<%=testStructuralReqCounter%>">
<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getIndicateAnalysts())?labMedicalOrganFirstInfo.getIndicateAnalysts():""%></td>
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
				<div class="col-12">
					<div>
						<p class="sub_heading">
							<span class="tab-form-highlghtme-link">6.0 </span>Indicate all
							relevant regulations, standards, codes, guidelines and/or other
							normative documents that govern your operations (CLAUSE 5.4)
						</p>
						<p class="sub_heading_content" id="normativeDocumentsCaliber-preview">
						 <%= Validator.isNotNull(normatDocCaliberUrl) ? normatDocCaliberUrl :""%>
						</p>
						<p class="sub_heading_content" id="allRelevantDocumentsPreview"></p>
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
                        <tbody class="addScopeForCalibrationsDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
                                <th class="sub_heading text-nowrap">Method/Technique</th>
                                <th class="sub_heading text-nowrap">Calibration item</th>
                                <th class="sub_heading text-nowrap">Range</th>
                                <th class="sub_heading text-nowrap">Measurement procedure</th>
                                <th class="sub_heading text-nowrap">Calibration and Measurement capability (cmc) as an expanded uncertainty(k = 2)</th>
                                <th class="sub_heading text-nowrap">Remarks</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0 </span>What is the major source of income for the Laboratory</p>
						<p class="sub_heading_content" id="calibrationMajorIncomeSourcePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0 </span>Who are the clients for which the Laboratory provides services</p>
						<p class="sub_heading_content" id="calibrationLaboratoryClientsPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep17" class="final-preview-section">
		<div class="calibration-resource-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">II. Resource Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-resource-req-info-edit-tab">
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
                        <p class="sub_heading_content" id="calibrationExternalPersonnelPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0 </span>Provide competence requirements, qualifications and duties for the personnel (internal and external) who manage, perform or verify work affecting the results of laboratory activities (CLAUSE 6.2.2, 6.2.4)</p>
                        <p class="sub_heading_content" id="calibrationCompetenceRequirementsPreview"></p>
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
                        <tbody class="addActivityPerformedLocCalibrationDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
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
				<div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">13.0 </span>Describe the layout (include the floor plan) identifying personnel and material flow(s) of (CLAUSES 6.3)</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">a) </span>The laboratory's facilities</p>
                        <p class="sub_heading_content" id="laboratoryCalibrationFacilitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">b) </span>Contracted facilities used by the laboratory (if applicable) (CLAUSE 5.4, 6.3.5)</p>
                        <p class="sub_heading_content" id="laboratoryCalibratioContractedFacilitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0 </span>Describe the laboratory's facilities in terms of type of lighting, power, ventilation, water supplies 
                            and other environmental requirements (CLAUSE 6.3.2)</p>
                        <p class="sub_heading_content" id="calibrationLaboratoryFacilityEnvReqPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">15.0 </span>Describe, giving reasons, any special environmental conditions for the tests for which 
                            accreditation is being sought, identifying sections of the laboratory that require these conditions. (CLAUSE 6.3.2)</p>
                        <p class="sub_heading_content" id="calibrationSpecialEnvConditionsPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0 </span>Describe the environmental or other monitoring activities carried out by the laboratory. (CLAUSE 6.3.3)</p>
                        <p class="sub_heading_content" id="calibrationMonitoringActivitiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0 </span>What are the safety features and related equipment of the laboratory</p>
                        <p class="sub_heading_content" id="calibrationLaboratoryRelatedEquipmentPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0 </span>What are the security arrangements to prevent unauthorized access to the laboratory's 
                            facilities (CLAUSE 6.3.4)?</p>
                        <p class="sub_heading_content" id="calibrationSecurityArrangementsPreview"></p>
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
                        <tbody class="addMajorEquipmentCalibrationDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Inventory Number</th>
                                <th class="sub_heading text-nowrap">Item</th>
                                <th class="sub_heading text-nowrap">Manufacturer</th>
                                <th class="sub_heading text-nowrap">Model Number</th>
                                <th class="sub_heading text-nowrap">Calibration Interval</th>
                                <th class="sub_heading text-nowrap">Calibrated By</th>
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
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep18" class="final-preview-section">
		<div class="calibration-manage-sys-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">
                            Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-manage-sys-info-edit-tab">
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
						<p class="sub_heading_content" id="managementSystemCalibrationOnePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefOnePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef1-preview">
						<%= Validator.isNotNull(fulfillingRequirementsDocUrl) ? fulfillingRequirementsDocUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Provisions for impartiality: 4.1</p>
						<p class="sub_heading_content" id="managementSystemCalibrationTwoPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefTwoPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef2-preview">
				 	  <%= Validator.isNotNull(impartialityProvisionsDocUrl) ? impartialityProvisionsDocUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Provisions for confidentiality: 4.2</p>
						<p class="sub_heading_content" id="managementSystemCalibrationThreePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefThreePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef3-preview">
                        <%= Validator.isNotNull(provisionsConfidentialityDocUrl) ? provisionsConfidentialityDocUrl : "" %>
                       </p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Evidence of commitment to development/implementation/continuous improvement of the management system: 8.2.3</p>
						<p class="sub_heading_content" id="managementSystemCalibrationFourPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefFourPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef4-preview">
						    <%= Validator.isNotNull(implementationContinuousDocUrl) ? implementationContinuousDocUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Evidence of references to management system processes, systems records and other documentation: 8.2.4</p>
						<p class="sub_heading_content" id="managementSystemCalibrationFivePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefFivePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef5-preview">
                         <%= Validator.isNotNull(evidenceReferencesDocUrl) ? evidenceReferencesDocUrl : "" %>
                        </p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Documents describing roles, responsibilities and interrelationship of personnel who manage, perform and verify work affecting the results of laboratory activities: 5.5 b</p>
						<p class="sub_heading_content" id="managementSystemCalibrationSixPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefSixPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef6-preview">
					     <%= Validator.isNotNull(responsibilitiesInterrelationshipDocUrl) ? responsibilitiesInterrelationshipDocUrl : "" %>
				     	</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Roles and responsibilities of personnel with responsibility for the management system: 5.6</p>
						<p class="sub_heading_content" id="managementSystemCalibrationSevenPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocRefSevenPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocRef7-preview">
                          <%= Validator.isNotNull(personnelResponsibilityDocUrl) ? personnelResponsibilityDocUrl : "" %>
                        </p>
						
					</div>
				</div>
                <div class="col-12">
					<p>Management System Documentation - Resource Requirements</p>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Determination of competence requirements: 6.2.5</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocOnePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefOnePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef1-preview">
                        <%= Validator.isNotNull(competenceRequirementsDocUrl) ? competenceRequirementsDocUrl : "" %>
                        </p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Selection, training supervision, authorization and monitoring of personnel: 6.2.5</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocTwoPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef2-preview">
                        <%= Validator.isNotNull(trainingSupervisionDocUrl) ? trainingSupervisionDocUrl : "" %>
                       </p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Handling, transport, storage, use and planned maintenance of equipment: 6.4.3</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocThreePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefThreePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef3-preview">
					    <%= Validator.isNotNull(handlingTransportDocUrl) ? handlingTransportDocUrl : "" %>
					    </p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Calibration programme: 6.4.7</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocFourPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefFourPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef4-preview">
						    <%= Validator.isNotNull(calibrationProgrammeDocUrl) ? calibrationProgrammeDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Defining, reviewing and approving the requirements for externally provided products and services: 6.6.2</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocFivePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefFivePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef5-preview">
						    <%= Validator.isNotNull(reviewingApprovingDocUrl) ? reviewingApprovingDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Selection, evaluation and monitoring performance of external providers of products and services: 6.6.2</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocSixPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefSixPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef6-preview">
						    <%= Validator.isNotNull(selectionEvaluationDocUrl) ? selectionEvaluationDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Ensuring that externally provided products and services conform to laboratory requirements and taking actions, where necessary: 6.6.2</p>
						<p class="sub_heading_content" id="calibrationManagSysReqResDocSevenPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocResReqRef7-preview">
						    <%= Validator.isNotNull(laboratoryRequirementsDocUrl) ? laboratoryRequirementsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-md-12">
                    <p>Management System Documentation - Process Requirements</p>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Review of requests, tenders and contracts: 7.1. 1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocOnePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefOnePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef1-preview">
						    <%= Validator.isNotNull(tendersContractsDocUrl) ? tendersContractsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Procedures for laboratory: 7.2.1.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocTwoPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef2-preview">
						    <%= Validator.isNotNull(proceduresLaboratoryDocUrl) ? proceduresLaboratoryDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Calibration methods & validation: 7.2.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocThreePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefThreePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef3-preview">
						    <%= Validator.isNotNull(calibrationMethodsDocUrl) ? calibrationMethodsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Reference to a sampling plan: 7.3</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocFourPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefFourPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef4-preview">
						    <%= Validator.isNotNull(referenceSamplingPlanDocUrl) ? referenceSamplingPlanDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Transportation, receipt, handling, protection, storage retention and disposal of test items: 7.4.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocFivePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefFivePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef5-preview">
						    <%= Validator.isNotNull(disposalCalibrationItemsDocUrl) ? disposalCalibrationItemsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Uncertainty of measurement: 7.2.1.1, 7.6.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocSixPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefSixPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef6-preview">
						    <%= Validator.isNotNull(uncertaintyMeasurementDocUrl) ? uncertaintyMeasurementDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Monitoring the validity of test results: 7.7.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocSevenPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef7-preview">
						    <%= Validator.isNotNull(validityCalibrationResultsDocUrl) ? validityCalibrationResultsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">h) Complaints: 7.9.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocEightPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefEightPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef8-preview">
						    <%= Validator.isNotNull(complaintsReferenceLaboratoryDocUrl) ? complaintsReferenceLaboratoryDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">i) Nonconforming work: 7.10.1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqProcessDocNinePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRefNinePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocProcessReqRef9-preview">
						    <%= Validator.isNotNull(nonconformingWorkDocUrl) ? nonconformingWorkDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-md-12">
                    <p>Management System Procedures - Management Requirements</p>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a) Unique identification of management system documents:8.3.2e</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocOnePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefOnePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef1-preview">
						    <%= Validator.isNotNull(uniqueIdentificationDocUrl) ? uniqueIdentificationDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b) Identification of current revision status of documents: 8.3.2</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocTwoPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef2-preview">
						    <%= Validator.isNotNull(identificationCurrentRevisionDocUrl) ? identificationCurrentRevisionDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c) Identification of document changes: 8.3.2c</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocThreePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefThreePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef3-preview">
						    <%= Validator.isNotNull(identificationChangesDocUrl) ? identificationChangesDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d) Reference to control of records: 8.4</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocFourPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefFourPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef4-preview">
						    <%= Validator.isNotNull(referenceRecordsDocUrl) ? referenceRecordsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e) Reference to planned actions to address risks: 8.5.2</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocFivePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefFivePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef5-preview">
						    <%= Validator.isNotNull(plannedActionsRisksDocUrl) ? plannedActionsRisksDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f) Reference to identification of improvement opportunities and taking actions: 8.6</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocSixPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefSixPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef6-preview">
						    <%= Validator.isNotNull(improvementsOpportunitiesDocUrl) ? improvementsOpportunitiesDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g) Reference to corrective action activities: 8.7</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocSevenPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef7-preview">
						    <%= Validator.isNotNull(correctiveActionActivitiesDocUrl) ? correctiveActionActivitiesDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">h) Internal audits: 8.8</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocEightPreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefEightPreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef8-preview">
						    <%= Validator.isNotNull(internalReferenceAuditsDocUrl) ? internalReferenceAuditsDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">i) Management reviews: 8.9 1</p>
						<p class="sub_heading_content" id="calibrationManagSysReqManagementDocNinePreview"></p>
					</div>
					<div class="calibrationLabDocRef">
						<p class="sub_heading">Reference to Laboratory Documentation</p>
						<p class="sub_heading_content" id="labDocManagementReqRefNinePreview"></p>
						<p class="sub_heading_content" id="calibrationLabDocManagementReqRef9-preview">
						    <%= Validator.isNotNull(managementReviewsDocUrl) ? managementReviewsDocUrl : "" %>
						</p>

					</div>
				</div>
            </div>
        </div>
    </section>

	<section id="janaacPreviewStep19" class="final-preview-section">
		<div class="calibration-other-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="calibration-other-req-info-edit-tab">
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
						<p class="sub_heading_content" id="paymentMethodCalibrationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameCalibrationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionCalibrationPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeSignatureCalibrationPre"><%if(Validator.isNotNull(caliberSign)){ %>
							<img src="<%=caliberSign%>"  width="100" height="100"/>
							<%} %></div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeDateCalibrationPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>
</div>