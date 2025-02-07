<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@ include file="/attachDoc.jsp" %>
<div class="certification-management-pre hide">
	<section id="janaacPreviewStep20" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-applicantion-info-edit-tab">
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
						<p class="sub_heading_content" id="applicantNameCertificationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressCertificationPreview"></p>
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
						<p class="sub_heading_content" id="applicantTelephoneCertificationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxCertificationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsiteCertificationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Certification Seeking Accreditation</p>
						<p class="sub_heading_content" id="certificationNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="certificationAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person in Charge of Certification Body</p>
						<p class="sub_heading_content" id="personnelNameCertificationPreview"></p>
						<p class="sub_heading_content" id="personnelEmailCertificationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailCerTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
							<%if(cerApplicaionInfo!=null){
long cerAppliInfoAddCounter=1;
for(AddCerApplicationInfo cerAppliInfo:cerApplicaionInfo){
%>						
<tr class="personnel-responsible-cer-row<%=cerAppliInfoAddCounter%>">
<td class="sub_heading_content technicalPersonNameCer<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getName())?cerAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailCer<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getEmail())?cerAppliInfo.getEmail():""%></td>
</tr>
     <input type="hidden" id="personResponsibleCerId<%=cerAppliInfoAddCounter%>" name="personResponsibleCerId<%=cerAppliInfoAddCounter%>" value="<%=cerAppliInfo.getAddCerApplicationInfoId()%>">
					<%
						cerAppliInfoAddCounter++;
						}
}
					%>
						</tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Contact Person</p>
						<p class="sub_heading_content" id="contactPersonNamePreview"></p>
						<p class="sub_heading_content" id="contactPersonEmailPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Financial Manager of Certification Body</p>
						<p class="sub_heading_content" id="financialManagerNamePreview"></p>
						<p class="sub_heading_content" id="financialManagerEmailPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestCertificationPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Management System (MS) Scope for which accreditation is requested</p>
						<p class="sub_heading_content" id="managementSystemPreview"></p>
					</div>
				</div>
                <div class="col-6 otherManagementSystem hide">
					<div>
						<p class="sub_heading">Please Specify</p>
						<p class="sub_heading_content" id="specifyOtherManagementSystemPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">List all standard(s) that apply</p>
						<p class="sub_heading_content" id="listOfStandardPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelManagementNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelManagementPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelManagementDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelManagementImageHolderPre">
						<%if(Validator.isNotNull(signAuthPersonnelCerti)){ %>
							<img src="<%=signAuthPersonnelCerti%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampManagementImageHolderPre">
						<%if(Validator.isNotNull(companyStampCerti)){ %>
							<img src="<%=companyStampCerti%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep21" class="final-preview-section">
		<div class="general-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">General</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-general-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">1.0</span> Is the Certification Body a legal entity or a defined part of a legal entity? [Clause 5.1.1] </p>
						<p class="sub_heading_content" id="certificationLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-12 legalStatusDescribe hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">2.0</span> Describe the legal status and corporate ownership of the organization</p>
						<p class="sub_heading_content" id="certificationLegalStatusEntityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0</span> Outline all major sources of income for the Certification Body. </p>
						<p class="sub_heading_content" id="incomeMajorSourcesPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep22" class="final-preview-section">
		<div class="scope-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Scope, Services, Clients and Interested Parties</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-scope-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">4.0</span> Certification Standard</p>
						<p class="sub_heading_content" id="certificationStandardPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0</span> Registered Client Organizations</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addRegisteredClientOrgDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Client Organization</th>
								<th class="sub_heading text-nowrap">Certification Standard(s)</th>
								<th class="sub_heading text-nowrap">Current certification scope & Industry code</th>
								<th class="sub_heading text-nowrap">Date first granted</th>
							</tr>
							<%if(cerAddScopeService!=null){
long cerScopeServiceAddCounter=1;
for(AddCerScopeService cerAppliInfo:cerAddScopeService){
%>						
<tr class="registered-client-org-row<%=cerScopeServiceAddCounter%>">
<td class="sub_heading_content clientOrganization<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getClientOrganization())?cerAppliInfo.getClientOrganization():""%></td>
<td class="sub_heading_content certificationStandard<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getCertificationStandards())?cerAppliInfo.getCertificationStandards():""%></td>
<td class="sub_heading_content currentCertification<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getCurrentCertification())?cerAppliInfo.getCurrentCertification():""%></td>
<td class="sub_heading_content clientOrgDate<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getDateFirstGranted())?new SimpleDateFormat("yyyy-MM-dd").format(cerAppliInfo.getDateFirstGranted()):""%></td>
</tr>
     <input type="hidden" id="registeredClientOrgId<%=cerScopeServiceAddCounter%>" name="registeredClientOrgId<%=cerScopeServiceAddCounter%>" value="<%=cerAppliInfo.getAddCerScopeServiceId()%>">
					<%
						cerScopeServiceAddCounter++;
						}
}
					%>	
						</tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">6.0</span> Indicate interested parties (persons or organizations), excluding clients and staff, stating their specific interest. [Clause 5.2.3]</p>
						<p class="sub_heading_content" id="certificationIntrestedPartiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0</span> Does the certification body or entities under the same organizational control, provide services other than certification? [Clause 5.2.3]</p>
						<p class="sub_heading_content" id="certificationOtherServicesPreview"></p>
					</div>
				</div>
                <div class="col-12 certificationOtherServicesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0</span> Briefly describe the nature of these services and the general groups who are clients of these services</p>
						<p class="sub_heading_content" id="certificationOtherServicesDescribePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0</span> Does the certification body have established relationships with any organizations 
                            that perform internal auditing or consultancy services? [Clause 5.2.7]</p>
						<p class="sub_heading_content" id="certificationEstablishedRelationPreview"></p>
					</div>
				</div>
                <div class="col-12 certificationEstablishedRelationBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">10.0</span> Give a brief description of the organization(s), services provided and the nature/extent 
                            of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<p class="sub_heading_content" id="certificationEstablishedRelationDescPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p><span class="tab-form-highlghtme-link">14.0 Indicate:</span></p>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0</span> Has your organization provided certification services for any client that has received consultancy or 
                            internal audit services from any organization described in 9 and 10 above? [Clause 5.2.6; 5.2.7] </p>
						<p class="sub_heading_content" id="certificationClientServicePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">12.0</span> Has your organization provided certification services for any client that is also a 
                            certification body? [Clause 5.2.4] </p>
						<p class="sub_heading_content" id="certificationForCerBodyServicePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">13.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<p class="sub_heading_content" id="orgAccreditedAnotherAccreditationPreview"></p>
					</div>
				</div>
			</div>
            <div class="row hide orgAccreditedAnotherAccreditationBox">
				<div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">14.0 Indicate:</span></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The name of the body responsible for the most recent accreditation</p>
						<p class="sub_heading_content" id="responsibleBodyAccreditationPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The expiry date of accreditation</p>
						<p class="sub_heading_content" id="accreditationExpDatePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The scope for which the certification body is/was accredited</p>
						<p class="sub_heading_content" id="certBodyScopePreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep23" class="final-preview-section">
		<div class="personal-res-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Personnel and Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-personal-res-info-edit-tab">
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
                        <p><span class="tab-form-highlghtme-link">15.0</span> Indicate</p> 
                    </div>
                </div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Size of internal staff</p> 
						<p class="sub_heading_content" id="internalStaffSizePreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Number of auditors</p> 
						<p class="sub_heading_content" id="auditorsNumPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Number of contracted personnel including external auditors</p> 
						<p class="sub_heading_content" id="contractedPerNumPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0</span> Staff Details</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailCertificationTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name of Staff</th>
                                <th class="sub_heading text-nowrap">Job Title</th>
                                <th class="sub_heading text-nowrap">Major Responsibilities</th>
                                <th class="sub_heading text-nowrap">Specific Functions</th>
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
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0</span> Supported by documentation in Section A, II, 7. above, list all auditors, technical experts including contracted personnel that perform certification activities, 
                            and respective areas of expertise. Indicate the applicable Accreditation Scope code based on IAF MD 1:2014, 
                            NACE Rev. 2 or suitable system of  industry classification. [Clause7.2.2]</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addAuditorListTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name</th>
                                <th class="sub_heading text-nowrap">Role</th>
                                <th class="sub_heading text-nowrap">Certification Standard</th>
                                <th class="sub_heading text-nowrap">Area of Expertise & Industry code</th>
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
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0</span> Does the certification body outsource (in part or in whole) any of its certification 
                            services (e.g. to other  certification bodies etc.)? [Clause 7.5.1]</p>
						<p class="sub_heading_content" id="certificationBodyOutsourcePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">19.0</span> Identify in the table below the nature of the outsourced activities and respective suppliers/service 
                            providers for each</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addOutsourceActNatureTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Outsourced Activity</th>
                                <th class="sub_heading text-nowrap">Supplier/Service provider</th>
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
</tr>
<input type="hidden" id="outsourceActNatureId<%=PersonnelThirdInfoAddCounter%>" name="outsourceActNatureId<%=PersonnelThirdInfoAddCounter%>" value="<%=PersonnelThirdInfoInfo.getAddFdaPersonnelThirdId()%>">
							
				<%
				PersonnelThirdInfoAddCounter++;
					}}
				%>							
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">20.0</span> If your application covers activities performed at more than one location (including virtual sites if 
                            applicable, branch offices, partners locations, agents, etc.), provide details in the table below: 
                            [Clause  6.2; 8.1.2]</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addActivityPerformLocationsTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
                                <th class="sub_heading text-nowrap">Location/Address</th>
                                <th class="sub_heading text-nowrap">Certification activities performed at location</th>
                                <th class="sub_heading text-nowrap">Contact Details</th>
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
</tr>
     <input type="hidden" id="activityPerformLocationsId<%=cerPersonnelThirdAddCounter%>" name="activityPerformLocationsId<%=cerPersonnelThirdAddCounter%>" value="<%=cerPerThirdInfo.getAddCerPersonnelThirdId()%>">
				<%
					cerPersonnelThirdAddCounter++;
					}}
				%>
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">21.0</span> Security arrangements, equipment and/or facilities established to prevent loss of,
                            or unauthorized access to client data and information? [Clause 8.4.7; 9.9;10.2.4]</p>
						<p class="sub_heading_content" id="descSecurityArrangementsPreview"></p>
					</div>
				</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep24" class="final-preview-section">
		<div class="information-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">22.0</span> The mechanisms through which information about the organization and its 
                            certification services is made available to the public; to certified clients. [Clause 8.0]</p>
						<p class="sub_heading_content" id="describeMechanismPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep25" class="final-preview-section">
		<div class="management-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-management-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">23.0</span> In accordance with clause 10.1 in ISO/IEC 17021-1:2015, 
                            indicate the management system, currently implemented within your organization [Clause 10.1] </p>
						<p class="sub_heading_content" id="managementImplementedWithOrgPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">24.0</span> Has your organization established documentation for the following requirements of the ISO/IEC 
							17021-1:2015 Standard? Indicate also where in the management system manual or other suitable documentation, the related document 
							is referenced.</p>
                        <p>General Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Impartiality policy: 5.2.2</p>
						<p class="sub_heading_content" id="genReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefOnePreview"></p>
						<p class="sub_heading_content" id="managementRefAttach1-preview">
						<%= Validator.isNotNull(impartialityPolicyDocUrl) ? impartialityPolicyDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Risk assessment - treatment of threats to impartiality and mitigation measures: 5.2.3</p>
						<p class="sub_heading_content" id="genReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementRefAttach2-preview">
						<%= Validator.isNotNull(impartialityMitigationDocUrl) ? impartialityMitigationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Structural Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Organizational structure and duties (e.g. job descriptions) for managerial and key certification personnel 6.1.1</p>
						<p class="sub_heading_content" id="structuralReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefOnePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefAttach1-preview">
						<%= Validator.isNotNull(keyCertificationPersonnelDocUrl) ? keyCertificationPersonnelDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Terms of reference for all committees involved in certification activities 6.1.4</p>
						<p class="sub_heading_content" id="structuralReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementStrucRefAttach2-preview">
						<%= Validator.isNotNull(committeesInvolvedDocUrl) ? committeesInvolvedDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for control of activities conducted by branches, partnerships, agents, franchises, etc., 6.2.1</p>
						<p class="sub_heading_content" id="structuralReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefThreePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefAttach3-preview">
						<%= Validator.isNotNull(partnershipsAgentsDocUrl) ? partnershipsAgentsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Resource Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Criteria of required knowledge and skills necessary to perform audits and certification tasks 7.1.2; Annex A</p>
						<p class="sub_heading_content" id="resourceReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefOnePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach1-preview">
						 <%= Validator.isNotNull(criteriaRequiredKnowledgeDocUrl) ? criteriaRequiredKnowledgeDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure for initial competence evaluation and monitoring of personnel involved in audit and certification activities (general) 7.1.3 </p>
						<p class="sub_heading_content" id="resourceReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach2-preview">
						 <%= Validator.isNotNull(nitialCompetenceEvaluationDocUrl) ? nitialCompetenceEvaluationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Processes for selecting training and authorizing auditors; selecting and familiarizing experts 7.2.4 </p>
						<p class="sub_heading_content" id="resourceReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefThreePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach3-preview">
						 <%= Validator.isNotNull(authorizingAuditorsDocUrl) ? authorizingAuditorsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Monitoring of competence and performance of auditors and all personnel involved in certification activities (including on-site evaluation, review of audit reports and client feedback) 7.2.9</p>
						<p class="sub_heading_content" id="resourceReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefFourPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach4-preview">
						 <%= Validator.isNotNull(monitoringCompetenceDocUrl) ? monitoringCompetenceDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Written agreement for external auditors and technical experts (template/sample) 7.3</p>
						<p class="sub_heading_content" id="resourceReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefFivePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach5-preview">
						 <%= Validator.isNotNull(technicalExpertsDocUrl) ? technicalExpertsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Description of process for outsourcing of certification activities (whole or in part) 7.5.1</p>
						<p class="sub_heading_content" id="resourceReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefSixPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach6-preview">
						 <%= Validator.isNotNull(outsourcingCertificationDocUrl) ? outsourcingCertificationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for monitoring bodies that provide outsourced services 7.5.4</p>
						<p class="sub_heading_content" id="resourceReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach7-preview">
						 <%= Validator.isNotNull(outsourcedServicesDocUrl) ? outsourcedServicesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Information Requirements</p>
                        <p>Information made publicly available/accessible about the following (8.1.1)</p> 
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a. Audit processes</p>
						<p class="sub_heading_content" id="informationReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefOnePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach1-preview">
						 <%= Validator.isNotNull(publiclyAvailableAccessibleDocUrl) ? publiclyAvailableAccessibleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b. Processes for granting, refusing, maintaining, renewing, suspending, restoring or withdrawing certification or expanding or reducing the scope of certification</p>
						<p class="sub_heading_content" id="informationReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach2-preview">
						 <%= Validator.isNotNull(maintainingRenewingSuspendingDocUrl) ? maintainingRenewingSuspendingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c. Management systems and certification scheme for which certification is offered</p>
						<p class="sub_heading_content" id="informationReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefThreePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach3-preview">
						 <%= Validator.isNotNull(managementSystemsCertificationDocUrl) ? managementSystemsCertificationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d. Use of the certification body's name and certification mark or logo </p>
						<p class="sub_heading_content" id="informationReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefFourPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach4-preview">
						 <%= Validator.isNotNull(certificationMarkLogoDocUrl) ? certificationMarkLogoDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e. Handling requests for information, complaints and appeals</p>
						<p class="sub_heading_content" id="informationReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefFivePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach5-preview">
						 <%= Validator.isNotNull(handlingRequestInformationDocUrl) ? handlingRequestInformationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f. Impartiality Policy </p>
						<p class="sub_heading_content" id="informationReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefSixPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach6-preview">
						 <%= Validator.isNotNull(ImpartialityPoliciesDocUrl) ? ImpartialityPoliciesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Provisions for informing clients of certification activities and requirements and geographical areas of operation 8.1.2 </p>
						<p class="sub_heading_content" id="informationReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach7-preview">
						 <%= Validator.isNotNull(provisionsInformingDocUrl) ? provisionsInformingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Certification documents (sample/template) 8.2.2</p>
						<p class="sub_heading_content" id="informationReqEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefEightPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach8-preview">
						  <%= Validator.isNotNull(certificationDocumentsDocUrl) ? certificationDocumentsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Rules governing use of certification mark(s) and statements on product packaging 8.3.1/8.3.3</p>
						<p class="sub_heading_content" id="informationReqNinePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefNinePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach9-preview">
						  <%= Validator.isNotNull(productPackagingDocUrl) ? productPackagingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Legally enforceable arrangements for confidentiality 8.4.1 </p>
						<p class="sub_heading_content" id="informationReqTenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefTenPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach10-preview">
						 <%= Validator.isNotNull(legallyEnforceableArrangementsDocUrl) ? legallyEnforceableArrangementsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for ensuring confidentiality 8.4.7</p>
						<p class="sub_heading_content" id="informationReqElevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefElevenPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach11-preview">
						 <%= Validator.isNotNull(ensuringConfidentialityDocUrl) ? ensuringConfidentialityDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Mechanisms for informing clients on the certification activities and requirements (including normative requirements of certification and rights and duties of certified clients) 8.5.1</p>
						<p class="sub_heading_content" id="informationReqTwelvePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementInformationRefTwelvePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefAttach12-preview">
						 <%= Validator.isNotNull(mechanismsInformingClientsDocUrl) ? mechanismsInformingClientsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Process Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Application process 9.1.1; 9.1.2</p>
						<p class="sub_heading_content" id="processReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefOnePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach1-preview">
						  <%= Validator.isNotNull(applicationProcessDocUrl) ? applicationProcessDocUrl :""%>
						</p>
					</div>
				</div>
                
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for application review 9.1.2.1</p>
						<p class="sub_heading_content" id="processReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach2-preview">
						 <%= Validator.isNotNull(processApplicationReviewDocUrl1) ? processApplicationReviewDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Certification cycle audit programme 9.1.3.1</p>
						<p class="sub_heading_content" id="processReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefThreePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach3-preview">
						 <%= Validator.isNotNull(cycleAuditProgrammeDocUrl) ? cycleAuditProgrammeDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedures for determining audit time 9.1.4.1</p>
						<p class="sub_heading_content" id="processReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefFourPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach4-preview">
						 <%= Validator.isNotNull(determiningAuditTimeDocUrl) ? determiningAuditTimeDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Sampling programme/plan (if applicable) for multi-site audits 9.1.5</p>
						<p class="sub_heading_content" id="processReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefFivePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach5-preview">
						 <%= Validator.isNotNull(samplingProgrammePlanDocUrl) ? samplingProgrammePlanDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Audit planning (include sample/templates) 9.2</p>
						<p class="sub_heading_content" id="processReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefSixPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach6-preview">
						  <%= Validator.isNotNull(auditPlanningIncludeDocUrl) ? auditPlanningIncludeDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for selecting and appointing the audit team 9.2.2.1</p>
						<p class="sub_heading_content" id="processReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach7-preview">
						 <%= Validator.isNotNull(selectingAppointingDocUrl) ? selectingAppointingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for conducting on-site audits 9.4.1</p>
						<p class="sub_heading_content" id="processReqEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefEightPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach8-preview">
						 <%= Validator.isNotNull(processConductingDocUrl) ? processConductingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Audit Report (sample/template) 9.4.8.1</p>
						<p class="sub_heading_content" id="processReqNinePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefNinePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach9-preview">
						  <%= Validator.isNotNull(auditReportSampleDocUrl) ? auditReportSampleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for audit non-conformities and corrective actions 9.4.9; 9.4.10</p>
						<p class="sub_heading_content" id="processReqTenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefTenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach10-preview">
						  <%= Validator.isNotNull(auditNonConformitiesDocUrl) ? auditNonConformitiesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process to conduct review of audit results prior to decision 9.5.2</p>
						<p class="sub_heading_content" id="processReqElevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefElevenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach11-preview">
						 <%= Validator.isNotNull(auditResultsPriorDocUrl) ? auditResultsPriorDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Process for transfer of certification 9.5.3.3</p>
						<p class="sub_heading_content" id="processReqTwelvePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefTwelvePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach12-preview">
						 <%= Validator.isNotNull(transferCertificationDocUrl) ? transferCertificationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Policy for suspension, withdrawal or reduction of the scope of certification 9.6.5.1</p>
						<p class="sub_heading_content" id="processReqThirteenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefThirteenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach13-preview">
						  <%= Validator.isNotNull(withdrawalReductionDocUrl) ? withdrawalReductionDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure(s) for suspension, withdrawal or reduction of the scope of certification 9.6.5.1</p>
						<p class="sub_heading_content" id="processReqFourteenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefFourteenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach14-preview">
						  <%= Validator.isNotNull(suspensionWithdrawalDocUrl) ? suspensionWithdrawalDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure to receive, evaluate and make decisions on appeals 9.7.1 </p>
						<p class="sub_heading_content" id="processReqFifteenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefFifteenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach15-preview">
						  <%= Validator.isNotNull(decisionsAppealsDocUrl) ? decisionsAppealsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure for handling complaints 9.8.5</p>
						<p class="sub_heading_content" id="processReqSixteenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefSixteenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach16-preview">
						 <%= Validator.isNotNull(procedureHandlingComplaintsDocUrl) ? procedureHandlingComplaintsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Record retention policy 9.9.4 </p>
						<p class="sub_heading_content" id="processReqSeventeenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefSeventeenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach17-preview">
						  <%= Validator.isNotNull(recordRetentionPolicyDocUrl) ? recordRetentionPolicyDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Record retention procedure 9.9.4</p>
						<p class="sub_heading_content" id="processReqEighteenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefEighteenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefAttach18-preview">
						  <%= Validator.isNotNull(recordRetentionProcedureDocUrl) ? recordRetentionProcedureDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row option-a hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option A</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Management system policies 10.2.1</p>
						<p class="sub_heading_content" id="managementSystemReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach1-preview">
						  <%= Validator.isNotNull(managementSystemPoliciesDocUrl) ? managementSystemPoliciesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Management system objectives 10.2.1</p>
						<p class="sub_heading_content" id="managementSystemReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach2-preview">
						  <%= Validator.isNotNull(managementSystemObjectivesDocUrl) ? managementSystemObjectivesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Management system manual or equivalent documentation 10.2.2</p>
						<p class="sub_heading_content" id="managementSystemReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefThreePreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach3-preview">
						  <%= Validator.isNotNull(manualEquivalentDocUrl) ? manualEquivalentDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure for document control 10.2.3</p>
						<p class="sub_heading_content" id="managementSystemReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefFourPreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach4-preview">
						  <%= Validator.isNotNull(procedureDocumentControlDocUrl) ? procedureDocumentControlDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedure for record control 10.2.4</p>
						<p class="sub_heading_content" id="managementSystemReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefFivePreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach5-preview">
						  <%= Validator.isNotNull(procedureRecordControlDocUrl) ? procedureRecordControlDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Management review 10.2.5.1 </p>
						<p class="sub_heading_content" id="managementSystemReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefSixPreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach6-preview">
						 <%= Validator.isNotNull(managementReviewDocUrl1) ? managementReviewDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Internal audits 10.2.6.1</p>
						<p class="sub_heading_content" id="managementSystemReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach7-preview">
						  <%= Validator.isNotNull(internauditsDocUrl) ? internauditsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Procedures for identification and management of corrective actions 10.2.7</p>
						<p class="sub_heading_content" id="managementSystemReqEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemRefEightPreview"></p>
						<p class="sub_heading_content" id="managementSystemRefAttach8-preview">
						 <%= Validator.isNotNull(managementCorrectiveActionsDocUrl) ? managementCorrectiveActionsDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row option-b hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option B - ISO 9001</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Scope of QMS 10.3.2</p>
						<p class="sub_heading_content" id="managementSystemBReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemBRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemBRefAttach1-preview">
						  <%= Validator.isNotNull(ScopeQmsDocUrl) ? ScopeQmsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Design and development (planning, inputs, controls, outputs and  changes) 10.3.2</p>
						<p class="sub_heading_content" id="managementSystemBReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemBRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementSystemBRefAttach2-preview">
						  <%= Validator.isNotNull(planningInputsControlsDocUrl) ? planningInputsControlsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Needs of interested parties 10.3.3</p>
						<p class="sub_heading_content" id="managementSystemBReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemBRefThreePreview"></p>
						<p class="sub_heading_content" id="managementSystemBRefAttach3-preview">
						   <%= Validator.isNotNull(needsInterestedPartiesDocUrl) ? needsInterestedPartiesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Management review 10.3.4</p>
						<p class="sub_heading_content" id="managementSystemBReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemBRefFourPreview"></p>
						<p class="sub_heading_content" id="managementSystemBRefAttach4-preview">
						   <%= Validator.isNotNull(managementDocUrl) ? managementDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep26" class="final-preview-section">
		<div class="other-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="manage-other-req-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">25.0</span> Application fees (non-refundable) submitted?</p>
						<p class="sub_heading_content" id="otherFeeReqPreview"></p>
					</div>
				</div>
                <div class="col-12 otherFeeReqBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">26.0</span> state payment method</p>
						<p class="sub_heading_content" id="otherFeePayMethodPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeCerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativeCerPositionPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeCerSignaturePre">
						<%if(Validator.isNotNull(CertioneSign)){ %>
							<img src="<%=CertioneSign%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeCerDatePreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>
</div>