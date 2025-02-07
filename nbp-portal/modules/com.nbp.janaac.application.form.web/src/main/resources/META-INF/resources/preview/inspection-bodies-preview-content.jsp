<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="inspection-bodies-pre hide">
	<section id="janaacPreviewStep41" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="inspection-applicantion-info-edit-tab">
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
						<p class="sub_heading_content" id="applicantNameInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressInsBodiesPreview"></p>
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
						<p class="sub_heading_content" id="applicantTelephoneInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsiteInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Inspection Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="certificationNameInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Inspection Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="insBodiesCertAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person in Charge of Inspection Body</p>
						<p class="sub_heading_content" id="personnelNameInsBodiesPreview"></p>
						<p class="sub_heading_content" id="personnelEmailInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Personnel Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailInsBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
							<%if(inspApplicationInfo!=null){
long inspApplicationInfoAddCounter=1;
for(AddInsApplicationInfo inspAppliInfo:inspApplicationInfo){
%>						
<tr class="person-responsible-ins-bodies-row<%=inspApplicationInfoAddCounter%>">
<td class="sub_heading_content technicalPersonNameInsBodies<%=inspApplicationInfoAddCounter%>">
<%=Validator.isNotNull(inspAppliInfo)&&Validator.isNotNull(inspAppliInfo.getName())?inspAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailInsBodies<%=inspApplicationInfoAddCounter%>">
<%=Validator.isNotNull(inspAppliInfo)&&Validator.isNotNull(inspAppliInfo.getEmail())?inspAppliInfo.getEmail():""%></td>
</tr>
     <input type="hidden" id="personResponsibleInsBodiesId<%=inspApplicationInfoAddCounter%>" name="personResponsibleInsBodiesId<%=inspApplicationInfoAddCounter%>" value="<%=inspAppliInfo.getAddInsApplicationInfoId()%>">
					<%
						inspApplicationInfoAddCounter++;
						}
}
					%>
						</tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Contact Person</p>
						<p class="sub_heading_content" id="contactPersonNameInsBodiesPreview"></p>
						<p class="sub_heading_content" id="contactPersonEmailInsBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Financial Manager of Inspection Body</p>
						<p class="sub_heading_content" id="financialManagerNameInsBodiesPreview"></p>
						<p class="sub_heading_content" id="financialManagerEmailInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelInsBodiesNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelInsBodiesPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelInsBodiesDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelInsBodiesImageHolderPre">
					      <% if(Validator.isNotNull(fileUrlOfAuthorizedPersonnel)) {  %>
						   <img src="<%=fileUrlOfAuthorizedPersonnel%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							<% }    %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampInsBodiesImageHolderPre">
						  <% if(Validator.isNotNull(fileUrlOfCompanyStamp)) {  %>
						   <img src="<%=fileUrlOfCompanyStamp%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							<% }    %>
						</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep42" class="final-preview-section">
		<div class="organization-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">I. The Organization</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="inspection-org-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">1.0</span> Is the inspection body a legal entity or a 
                            defined part of a legal entity? (CLAUSE 5.1.1)</p>
						<p class="sub_heading_content" id="insBodiesLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-6 legalStatusDescribeInsBodies hide">
					<div>
						<p class="sub_heading">Define the legal status</p>
						<p class="sub_heading_content" id="insBodiesLegalStatusEntityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">2.0</span> Is the inspection body a part of an organization that performs activities other than inspection?(CLAUSE 5.1.2)</p>
						<p class="sub_heading_content" id="insBodyOrgPartPreview"></p>
					</div>
				</div>
				<div class="col-12 hide insBodyOrgPartBoxs">
					<div class="row">
						<div class="col-12">
							<div>
								<p class="sub_heading">3.0 State the Names and Position of the key personnel of the organization that have 
								responsibility for, involvement in or influence on inspection activities (CLAUSE 5.2.4)</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addInspectionPersonnelDetailsTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Position</th>
									</tr>
									<%if(organFirst!=null){
long organFirstAddCounter=1;
for(AddInsOrgInfoFirst organFirstAdd:organFirst){
%>	
<tr class="inspection-personnel-row<%=organFirstAddCounter%>">
<td class="sub_heading_content orgPersonnelNameInsBodies<%=organFirstAddCounter%>">
<%=Validator.isNotNull(organFirstAdd)&&Validator.isNotNull(organFirstAdd.getName())?organFirstAdd.getName():""%></td>
<td class="sub_heading_content orgPersonnelPositionInsBodies<%=organFirstAddCounter%>">
<%=Validator.isNotNull(organFirstAdd)&&Validator.isNotNull(organFirstAdd.getPosition())?organFirstAdd.getPosition():""%></td>
</tr>					
     <input type="hidden" id="inspectionPersonnelId<%=organFirstAddCounter%>" name="inspectionPersonnelId<%=organFirstAddCounter%>" value="<%=organFirstAdd.getAddInsOrgInfoFirstId()%>">
					<%
						organFirstAddCounter++;
						}
}
					%>											
									
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">4.0</span> Indicate size of staff</p>
						<p class="sub_heading_content" id="staffSizeInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">5.0 Staff Details</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addStaffDetailInsBodiesTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name of Staff</th>
                                <th class="sub_heading text-nowrap">Job Title</th>
                                <th class="sub_heading text-nowrap">Major Responsibilities</th>
                                <th class="sub_heading text-nowrap">Indicate (X) Inspector involved in requested scope of accreditation</th>
                            </tr>
                            <% if(orgInfoSec!=null){
long orgInfoSecAddCounter=1;
for(AddInsOrgInfoSecond orgInfoSecAdd:orgInfoSec){
%>							
<tr class="staff-detail-ins-bodies-row<%=orgInfoSecAddCounter%>">
<td class="sub_heading_content staffNameInsBodies<%=orgInfoSecAddCounter%>">
<%=Validator.isNotNull(orgInfoSecAdd)&&Validator.isNotNull(orgInfoSecAdd.getNameOfStaff())?orgInfoSecAdd.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleInsBodies<%=orgInfoSecAddCounter%>">
<%=Validator.isNotNull(orgInfoSecAdd)&&Validator.isNotNull(orgInfoSecAdd.getJobTitle())?orgInfoSecAdd.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesInsBodies<%=orgInfoSecAddCounter%>">
<%=Validator.isNotNull(orgInfoSecAdd)&&Validator.isNotNull(orgInfoSecAdd.getMajorResponsibilities())?orgInfoSecAdd.getMajorResponsibilities():""%></td>
<td class="sub_heading_content specificFunctionInsBodies<%=orgInfoSecAddCounter%>">
<%=Validator.isNotNull(orgInfoSecAdd)&&Validator.isNotNull(orgInfoSecAdd.getIndexInspector())?orgInfoSecAdd.getIndexInspector():""%></td>
</tr>								
     <input type="hidden" id="staffDetailInsBodiesId<%=orgInfoSecAddCounter%>" name="staffDetailInsBodiesId<%=orgInfoSecAddCounter%>" value="<%=orgInfoSecAdd.getAddInsOrgInfoSecondId()%>">
				<%
							orgInfoSecAddCounter++;
						}
}
					%>	
                        </tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">6.0 Clearly define the scope for which accreditation is being sought</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addAccreditationSoughtScopeTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Inspection Activity</th>
                                <th class="sub_heading text-nowrap">Field of Inspection</th>
                                <th class="sub_heading text-nowrap">Type and Range of Inspection</th>
                                <th class="sub_heading text-nowrap">Methods and Procedures</th>
                                <th class="sub_heading text-nowrap">Equipment</th>
                                <th class="sub_heading text-nowrap">Limits of Capability</th>
                            </tr>
                            <% if(orgInfoThird!=null){
long orgInfoThirdAddCounter=1;
for(AddInsOrgInfoThird orgInfoThirdAdd:orgInfoThird){
%>								
<tr class="accreditation-sought-scope-row<%=orgInfoThirdAddCounter%>">
<td class="sub_heading_content activityInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getInspectionActivity())?orgInfoThirdAdd.getInspectionActivity():""%></td>
<td class="sub_heading_content fieldInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getFieldOfInspection())?orgInfoThirdAdd.getFieldOfInspection():""%></td>
<td class="sub_heading_content rangeInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getTypeOfInspection())?orgInfoThirdAdd.getTypeOfInspection():""%></td>
<td class="sub_heading_content proceduresInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getMethod())?orgInfoThirdAdd.getMethod():""%></td>
<td class="sub_heading_content equipmentInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getEqipment())?orgInfoThirdAdd.getEqipment():""%></td>
<td class="sub_heading_content capabilityLimitInsBodies<%=orgInfoThirdAddCounter%>">
<%=Validator.isNotNull(orgInfoThirdAdd)&&Validator.isNotNull(orgInfoThirdAdd.getLimitsOfCapabilities())?orgInfoThirdAdd.getLimitsOfCapabilities():""%></td>
</tr>								
									
     <input type="hidden" id="accreditationSoughtScopeId<%=orgInfoThirdAddCounter%>" name="accreditationSoughtScopeId<%=orgInfoThirdAddCounter%>" value="<%=orgInfoThirdAdd.getAddInsOrgInfoThirdId()%>">
				<%
					orgInfoThirdAddCounter++;
						}
}
					%>		
                        </tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0</span> What is the major source of income for the inspection body</p>
						<p class="sub_heading_content" id="insBodiesIncomeSourcePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0</span> What type of inspection body is your organization, as defined by ISO/IEC 17020:2012 (CLAUSE 4.1.6)?</p>
						<p class="sub_heading_content" id="orgInsBodyTypePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p><span class="tab-form-highlghtme-link">9.0</span> Who are the clients for which the inspection 
                            body provides services (CLAUSE 4.1.6)?</p>
                    </div>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Own or parent organization</p>
						<p class="sub_heading_content" id="insBodyServiceOwnOrgClientPreview"></p>
                        <p class="sub_heading">Other organization(s)</p>
						<p class="sub_heading_content" id="insBodyServiceOtherOrgClientPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep43" class="final-preview-section">
		<div class="human-inspection-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">II. Human Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="human-inspection-info-edit-tab">
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
						<p class="sub_heading">10.0 Kindly provide signed curriculum vitae for each key member of staff (CLAUSE 6.1.3)</p>
						<p class="sub_heading_content" id="keyMemberResumeInsBodies-preview">
						<%= Validator.isNotNull(resumeHumanInsUrl) ? resumeHumanInsUrl : "" %>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<section id="janaacPreviewStep44" class="final-preview-section">
		<div class="inspection-physical-res-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">III. Physical Resources - Facilities, Equipment, Materials</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="inspection-physical-res-info-edit-tab">
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
						<p class="sub_heading">11.0 List the major equipment used in the inspection(s) for which accreditation is being sought as well as the individual responsible for each equipment. Include equipment contracted for use by the inspection body 
                            (CLAUSE 6.2.1).</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addMajorEquipmentInsBodiesDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Inventory Number</th>
                                <th class="sub_heading text-nowrap">Item</th>
                                <th class="sub_heading text-nowrap">Manufacturer</th>
                                <th class="sub_heading text-nowrap">Model Number</th>
                                <th class="sub_heading text-nowrap">Calibration Interval</th>
                                <th class="sub_heading text-nowrap">Calibrated By</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading">12.0 If your application covers activities performed at more than one location</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addApplicationActivityLocInsBodiesDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
                                <th class="sub_heading text-nowrap">Location/Address</th>
                                <th class="sub_heading text-nowrap">Activities performed at location</th>
                                <th class="sub_heading text-nowrap">Contact Details</th>
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
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">13.0</span> Describe the Inspection Body's facilities in terms of type of lighting, power and water supplies, etc. (CLAUSE 6.2.1):</p>
						<p class="sub_heading_content" id="insBodyFacilityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0</span> What are the safety features and related equipment of the inspection body</p>
						<p class="sub_heading_content" id="safetyFeaturesInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">15.0</span> What are the security arrangements to prevent 
                            unauthorized access to the inspection body's facilities (CLAUSE 6.2.2)?</p>
						<p class="sub_heading_content" id="securityArrangmentInsBodiesPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep45" class="final-preview-section">
		<div class="inspection-manage-sys-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">IV. Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="inspection-manage-sys-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0</span> Which option does your organization follow with respect to your management system?(CLAUSE 8.1.1)</p>
						<p class="sub_heading_content" id="managementSysOptionInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
                    <p class="sub_heading"><span class="tab-form-highlghtme-link">17.0</span> Has the inspection body documented the following requirements of the ISO/IEC 17020:2012 Standard? Note where this in referenced in your quality manual or elsewhere.</p>
					<p>Management System Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a. Manual Approval/Authorization</p>
						<p class="sub_heading_content" id="manageSysManualOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefOnePreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach1-preview">
						    <%= Validator.isNotNull(manualApprovalDocUrl) ? manualApprovalDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">b. Relevant Policies: 8.2.1</p>
						<p class="sub_heading_content" id="manageSysManualTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefTwoPreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach2-preview">
						    <%= Validator.isNotNull(relevantPoliciesDocUrl) ? relevantPoliciesDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c. Overall Objectives: 8.2.1</p>
						<p class="sub_heading_content" id="manageSysManualThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefThreePreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach3-preview">
						    <%= Validator.isNotNull(overallObjectivesDocUrl) ? overallObjectivesDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">d. References to Supporting Procedures: 8.2.4</p>
						<p class="sub_heading_content" id="manageSysManualFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefFourPreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach4-preview">
						    <%= Validator.isNotNull(supportingProcedureDocUrl) ? supportingProcedureDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">e. Roles & Responsibilities of Technical  Management: 5.2.5</p>
						<p class="sub_heading_content" id="manageSysManualFivePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefFivePreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach5-preview">
						    <%= Validator.isNotNull(technicalManagementDocUrl) ? technicalManagementDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">f. Documentation (e.g. Job Descriptions) for Managerial, Technical and Key Support Personnel involved in Inspection Activities: 5.2.7</p>
						<p class="sub_heading_content" id="manageSysManualSixPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysManualRefSixPreview"></p>
						<p class="sub_heading_content" id="manageSysManualRefAttach6-preview">
						    <%= Validator.isNotNull(inspectionActivitieDocUrl) ? inspectionActivitieDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<p>Management System Procedures - Management Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a. Document Control Procedure: 8.3.1</p>
						<p class="sub_heading_content" id="manageSysReqOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefOnePreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach1-preview">
						    <%= Validator.isNotNull(documentControlProcedureDocUrl) ? documentControlProcedureDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">b. Document Changes: 8.3.2</p>
						<p class="sub_heading_content" id="manageSysReqTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach2-preview">
						    <%= Validator.isNotNull(documentChangesDocUrl) ? documentChangesDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c. Control of Quality & Inspection Records: 7.3.1, 8.4.1</p>
						<p class="sub_heading_content" id="manageSysReqThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefThreePreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach3-preview">
						    <%= Validator.isNotNull(inspectionRecordsDocUrl) ? inspectionRecordsDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">d. Management Review 8.5.1.1</p>
						<p class="sub_heading_content" id="manageSysReqFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefFourPreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach4-preview">
						    <%= Validator.isNotNull(managementReviewDocUrl) ? managementReviewDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">e. Internal Audits: 8.6.1</p>
						<p class="sub_heading_content" id="manageSysReqFivePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefFivePreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach5-preview">
						    <%= Validator.isNotNull(internalAuditsDocUrl) ? internalAuditsDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">f. Corrective Actions: 8.7.1</p>
						<p class="sub_heading_content" id="manageSysReqSixPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefSixPreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach6-preview">
						    <%= Validator.isNotNull(correctiveActionsDocUrl) ? correctiveActionsDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">g. Preventive Actions: 8.8.1</p>
						<p class="sub_heading_content" id="manageSysReqSevenPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysReqRefSevenPreview"></p>
						<p class="sub_heading_content" id="manageSysReqRefAttach7-preview">
						    <%= Validator.isNotNull(preventiveActionsDocUrl) ? preventiveActionsDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<p>Management System Procedures - Resource Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a. Personnel (Selection, Training, Authorizing, etc.): 6.1.5</p>
						<p class="sub_heading_content" id="manageSysResourceReqOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysResourceReqRefOnePreview"></p>
						<p class="sub_heading_content" id="manageSysResourceReqRefAttach1-preview">
						    <%= Validator.isNotNull(personnelTrainingDocUrl) ? personnelTrainingDocUrl : "" %>
						</p>

					</div>
				</div>

				<div class="col-12">
					<div>
						<p class="sub_heading">b. Equipment: 6.2.5, 6.2.14</p>
						<p class="sub_heading_content" id="manageSysResourceReqTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysResourceReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="manageSysResourceReqRefAttach2-preview">
						    <%= Validator.isNotNull(equipmentDocUrl) ? equipmentDocUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<p>Management System Procedures - Process Requirements</p>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">a. Inspection: 7.1.1</p>
						<p class="sub_heading_content" id="manageSysProcessReqOnePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysProcessReqRefOnePreview"></p>
						<p class="sub_heading_content" id="manageSysProcessReqRefAttach1-preview">
						    <%= Validator.isNotNull(inspectionBodiesProcessDocUrl) ? inspectionBodiesProcessDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">b. Contractual Arrangements with Clients: 
                            7.1.5</p>
						<p class="sub_heading_content" id="manageSysProcessReqTwoPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysProcessReqRefTwoPreview"></p>
						<p class="sub_heading_content" id="manageSysProcessReqRefAttach2-preview">
						    <%= Validator.isNotNull(contractualArrangementsDocUrl) ? contractualArrangementsDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">c. Handling of Inspection Items: 7.2.4</p>
						<p class="sub_heading_content" id="manageSysProcessReqThreePreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysProcessReqRefThreePreview"></p>
						<p class="sub_heading_content" id="manageSysProcessReqRefAttach3-preview">
						    <%= Validator.isNotNull(handlingInspectionDocUrl) ? handlingInspectionDocUrl : "" %>
						</p>

					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">d. Complaints & Appeals: 7.5.1</p>
						<p class="sub_heading_content" id="manageSysProcessReqFourPreview"></p>
					</div>
					<div class="qualityManualRef">
						<p class="sub_heading">Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="manageSysProcessReqRefFourPreview"></p>
						<p class="sub_heading_content" id="manageSysProcessReqRefAttach4-preview">
						    <%= Validator.isNotNull(complaintsAppealsDocUrl) ? complaintsAppealsDocUrl : "" %>
						</p>

					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

	<section id="janaacPreviewStep46" class="final-preview-section">
		<div class="other-requirements-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">V. Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="inspection-other-requirements-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0</span> Application fees (non-refundable) submitted?</p>
						<p class="sub_heading_content" id="otherFeeReqInsBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12 otherFeeReqInsBodiesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link"></span>State payment method</p>
						<p class="sub_heading_content" id="otherFeePayMethodInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's representative name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's representative position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionInsBodiesPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's representative signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeInsBodiesSignaturePre">
						  <% if(Validator.isNotNull(fileUrlOfRepresentativeSignature)) {  %>
						   <img src="<%=fileUrlOfRepresentativeSignature%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							<% }    %>
						</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeDateInsBodiesPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>
</div>