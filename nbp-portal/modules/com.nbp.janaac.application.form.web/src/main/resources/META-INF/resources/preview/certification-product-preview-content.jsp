<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@ include file="/attachDoc.jsp" %>
<div class="certification-product-pre hide">
	<section id="janaacPreviewStep27" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="cer-product-app-info-edit-tab">
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
						<p class="sub_heading_content" id="applicantNameCerProductPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressCerProductPreview"></p>
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
						<p class="sub_heading_content" id="applicantTelephoneCerProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxCerProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsiteCerProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="cerProductNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="cerProductAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person in Charge of Certification Body</p></p>
						<p class="sub_heading_content" id="personnelNameCerProductPreview"></p>
						<p class="sub_heading_content" id="personnelEmailCerProductPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleCerProductDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
							<%if(cerApplicaionInfo!=null){
long cerAppliInfoAddCounter=1;
for(AddCerApplicationInfo cerAppliInfo:cerApplicaionInfo){
%>						
<tr class="personnel-responsible-cer-product-row<%=cerAppliInfoAddCounter%>">
<td class="sub_heading_content technicalPersonNameCerProduct<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getName())?cerAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailCerProduct<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getEmail())?cerAppliInfo.getEmail():""%></td>
</tr>
     <input type="hidden" id="personResponsibleCerProductId<%=cerAppliInfoAddCounter%>" name="personResponsibleCerProductId<%=cerAppliInfoAddCounter%>" value="<%=cerAppliInfo.getAddCerApplicationInfoId()%>">
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
						<p class="sub_heading_content" id="contactPersonNameCerProductPreview"></p>
						<p class="sub_heading_content" id="contactPersonEmailCerProductPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Financial Manager of Certification Body</p>
						<p class="sub_heading_content" id="financialManagerNameCerProductPreview"></p>
						<p class="sub_heading_content" id="financialManagerEmailCerProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestCerProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerProductNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerProductPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerProductDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelCerProductImageHolderPre">
						<%if(Validator.isNotNull(signAuthPersonnelCerti17065)){ %>
							<img src="<%=signAuthPersonnelCerti17065%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampCerProductImageHolderPre">
						<%if(Validator.isNotNull(companyStampCerti17065)){ %>
							<img src="<%=companyStampCerti17065%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep28" class="final-preview-section">
		<div class="general-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">General</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="general-pro-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">1.0</span> Is the Certification Body a legal entity or a defined part of a legal entity? [Clause 4.1.1]</p>
						<p class="sub_heading_content" id="cerProductLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-12 cerProductlLegalStatusDescribe hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">2.0</span> Describe the legal status and corporate ownership of the organization</p>
						<p class="sub_heading_content" id="cerProductLegalStatusEntityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0</span> Outline all major sources of income for the Certification Body. </p>
						<p class="sub_heading_content" id="incomeMajorSourcesCerProductPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep29" class="final-preview-section">
		<div class="scope-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Scope, Services, Clients and Interested Parties</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="scope-pro-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">4.0</span> Registered Client Organizations</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addRegisteredClientOrgCerProductDetailTable">
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
<tr class="registered-client-org-cer-product-row<%=cerScopeServiceAddCounter%>">
<td class="sub_heading_content clientOrganizationCerProduct<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getClientOrganization())?cerAppliInfo.getClientOrganization():""%></td>
<td class="sub_heading_content certificationStandardCerProduct<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getCertificationStandards())?cerAppliInfo.getCertificationStandards():""%></td>
<td class="sub_heading_content currentCertificationCerProduct<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getCurrentCertification())?cerAppliInfo.getCurrentCertification():""%></td>
<td class="sub_heading_content clientOrgDateCerProduct<%=cerScopeServiceAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getDateFirstGranted())?new SimpleDateFormat("yyyy-MM-dd").format(cerAppliInfo.getDateFirstGranted()):""%></td>
</tr>
     <input type="hidden" id="registeredClientOrgCerProductId<%=cerScopeServiceAddCounter%>" name="registeredClientOrgCerProductId<%=cerScopeServiceAddCounter%>" value="<%=cerAppliInfo.getAddCerScopeServiceId()%>">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0</span> Indicate interested parties (persons or organizations), excluding clients and staff, stating their specific  interest.</p>
						<p class="sub_heading_content" id="cerProductIntrestedPartiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">6.0</span> Does the certification body or entities under the same organizational control, 
                            provide services other than certification?</p>
						<p class="sub_heading_content" id="cerProductOtherServicesPreview"></p>
					</div>
				</div>
                <div class="col-12 cerProductOtherServicesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0</span> Briefly describe the nature of these services and the general 
                            groups who are clients of these services</p>
						<p class="sub_heading_content" id="cerProductOtherServicesDescribePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0</span> Does the certification body have established relationships with any organizations 
                            that perform internal auditing or consultancy services?</p>
						<p class="sub_heading_content" id="cerProductEstablishedRelationPreview"></p>
					</div>
				</div>
                <div class="col-12 cerProductEstablishedRelationBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0</span> Give a brief description of the organization(s), services provided and the nature/extent 
                            of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<p class="sub_heading_content" id="cerProEstablishedRelationDescPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">10.0</span> Has your organization provided certification services for any client that has received consultancy or 
                            internal audit services from any organization described in 8.0 and 9.0 above?</p>
						<p class="sub_heading_content" id="cerProductClientServicePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<p class="sub_heading_content" id="orgAccreditedAnotherAccreditationCerProductPreview"></p>
					</div>
				</div>
			</div>
            <div class="row hide orgAccreditedAnotherAccreditationCerProductBox">
                <div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">12.0 Indicate:</span></p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p></p>
						<p class="sub_heading">The name of the body responsible for the most recent accreditation</p>
						<p class="sub_heading_content" id="responsibleBodyAccreditationCerProductPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The expiry date of accreditation</p>
						<p class="sub_heading_content" id="accreditationExpDateCerProductPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The scope for which the certification body is/was accredited</p>
						<p class="sub_heading_content" id="certBodyScopeCerProductPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep30" class="final-preview-section">
		<div class="personal-res-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Organization, Personnel and Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="personal-res-pro-info-edit-tab">
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
                        <p><span class="tab-form-highlghtme-link">13.0</span> Indicate</p> 
                    </div>
                </div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Size of internal staff</p> 
						<p class="sub_heading_content" id="internalStaffSizeProPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Number of auditors</p> 
						<p class="sub_heading_content" id="auditorsNumProPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Number of contracted personnel including external auditors</p> 
						<p class="sub_heading_content" id="contractedPerNumProPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0</span> Staff Details</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailCerProductTable">
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
<tr class="staff-detail-cer-product-row<%=cerPersonnelFirstAddCounter%>">
<td class="sub_heading_content staffNameCerProduct<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getNameOfStaff())?cerPerFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleCerProduct<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getJobTitle())?cerPerFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesCerProduct<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getMajorResponsibility())?cerPerFirstInfo.getMajorResponsibility():""%></td>
<td class="sub_heading_content specificFunctionCerProduct<%=cerPersonnelFirstAddCounter%>">
<%=Validator.isNotNull(cerPerFirstInfo)&&Validator.isNotNull(cerPerFirstInfo.getSpecificFunctions())?cerPerFirstInfo.getSpecificFunctions():""%></td>
</tr>
     <input type="hidden" id="staffDetailCerProductId<%=cerPersonnelFirstAddCounter%>" name="staffDetailCerProductId<%=cerPersonnelFirstAddCounter%>" value="<%=cerPerFirstInfo.getAddCerPersonnelFirstId()%>">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">15.0</span> Supported by documentation in Section A, II, 4. above, list all auditors, technical experts including contracted personnel that perform certification
                            activities, as well as respective areas of expertise. Indicate the applicable Accreditation Scope code based on IAF MD 1:2014, NACE Rev. 2 or suitable system of  industry classification. [Clause 6.1.2]</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addAuditorListCerProductTable">
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
<tr class="auditor-list-cer-product-row<%=cerPersonnelSecAddCounter%>">
<td class="sub_heading_content auditorNameCerProduct<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getName())?cerPerSecInfo.getName():""%></td>
<td class="sub_heading_content auditorRoleCerProduct<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getRole())?cerPerSecInfo.getRole():""%></td>
<td class="sub_heading_content auditorCertificationStandardCerProduct<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getCertificateStandard())?cerPerSecInfo.getCertificateStandard():""%></td>
<td class="sub_heading_content auditorExpertiseAreaCerProduct<%=cerPersonnelSecAddCounter%>">
<%=Validator.isNotNull(cerPerSecInfo)&&Validator.isNotNull(cerPerSecInfo.getAreaOfExpertise())?cerPerSecInfo.getAreaOfExpertise():""%></td>
</tr>
     <input type="hidden" id="auditorListCerProductId<%=cerPersonnelSecAddCounter%>" name="auditorListCerProductId<%=cerPersonnelSecAddCounter%>" value="<%=cerPerSecInfo.getAddCerPersonnelSecondId()%>">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0</span> Does the certification body outsource (in part or in whole)
                            any of its evaluation activities (e.g. to laboratories for product testing)? [Clause 6.2.2]</p>
						<p class="sub_heading_content" id="CerProductBodyOutsourcePreview"></p>
					</div>
				</div>
                <div class="col-12 certProductBodyOutsourceBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0</span> Identify in the table below the nature of the outsourced activities and respective suppliers/service 
                            providers for each</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addOutsourceActNatureCertProductTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Outsourced Activity</th>
                                <th class="sub_heading text-nowrap">Supplier/Service provider</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
                            </tr>
                            <%if(outsourcedActivities!=null){
long outSourcedActivitiesAddCounter=1;
for(AddOutsourcedActivities outsourcedInfo:outsourcedActivities){
%>									
<tr class="outsource-act-nature-cer-product-row<%=outSourcedActivitiesAddCounter%>">
<td class="sub_heading_content outsourcedActivityCertProduct<%=outSourcedActivitiesAddCounter%>">
<%=Validator.isNotNull(outsourcedInfo)&&Validator.isNotNull(outsourcedInfo.getOutSourcedActivity())?outsourcedInfo.getOutSourcedActivity():""%></td>
<td class="sub_heading_content serviceProvdierCertProduct<%=outSourcedActivitiesAddCounter%>">
<%=Validator.isNotNull(outsourcedInfo)&&Validator.isNotNull(outsourcedInfo.getServiceProvider())?outsourcedInfo.getServiceProvider():""%></td>
<td class="sub_heading_content activityPerformLocCertProduct<%=outSourcedActivitiesAddCounter%>">
<%=Validator.isNotNull(outsourcedInfo)&&Validator.isNotNull(outsourcedInfo.getLocationAddress())?outsourcedInfo.getLocationAddress():""%></td>
</tr>
 		<input type="hidden" id="outsourceActNatureCertProductId<%=outSourcedActivitiesAddCounter%>" name="outsourceActNatureCertProductId<%=outSourcedActivitiesAddCounter%>" value="<%=outsourcedInfo.getAddOutsourcedActivitiesId()%>">
						<%
							outSourcedActivitiesAddCounter++;
						}
}
					%>							
                            
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0</span> Security arrangements, equipment and/or facilities established to prevent loss of,
                            or unauthorized access to client data and information? [Clause 4.5; 8.4.1]</p>
						<p class="sub_heading_content" id="descSecurityArrangementsProPreview"></p>
					</div>
				</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep31" class="final-preview-section">
		<div class="information-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="information-pro-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">19.0</span> The Mechanisms through which information about the organization and its certification services is made available to the public; to certified clients. [Clause 4.6]</p>
						<p class="sub_heading_content" id="describeMechanismCertProductPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep32" class="final-preview-section">
		<div class="management-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="management-pro-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">20.0</span> Indicate the management system option currently 
                            implemented within your organization [Clause 8.1] </p>
						<p class="sub_heading_content" id="cerProductImplementedWithOrgPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">21.0</span> Has your organization established documentation for the 
							following requirements of the ISO/IEC 17065:2012 Standard? Indicate also where in the management system manual or other suitable documentation, the related document 
							is referenced.</p>
                        <p>General Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">1. Certification agreement 4.1.2</p>
						<p class="sub_heading_content" id="genReqCerProductOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductOnePreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach1-preview">
						 <%= Validator.isNotNull(certificationAgreementDocUrl1) ? certificationAgreementDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">2. Risk assessment - impartiality and mitigation measures 4.2.3</p>
						<p class="sub_heading_content" id="genReqCerProductTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductTwoPreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach2-preview">
						  <%= Validator.isNotNull(impartialityMitigationMeasuresDocUrl1) ? impartialityMitigationMeasuresDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">3. Confidentiality 4.5</p>
						<p class="sub_heading_content" id="genReqCerProductThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductThreePreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach3-preview">
						  <%= Validator.isNotNull(confidentialityQualityManualDocUrl) ? confidentialityQualityManualDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>4. Publicly available information</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a. Certification scheme(s), including
                            evaluation procedures, rules etc. 4.6 a.</p>
						<p class="sub_heading_content" id="genReqCerProductFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductFourPreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach4-preview">
						   <%= Validator.isNotNull(publiclyAvailableInformationDocUrl1) ? publiclyAvailableInformationDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b. Financial support and fees charged 4.6 b.</p>
						<p class="sub_heading_content" id="genReqCerProductFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductFivePreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach5-preview">
						   <%= Validator.isNotNull(financialSupportFeesDocUrl) ? financialSupportFeesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c. Rights and duties of applicants and clients 4.6 c.</p>
						<p class="sub_heading_content" id="genReqCerProductSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductSixPreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach6-preview">
						   <%= Validator.isNotNull(rightsDutiesApplicantsDocUrl) ? rightsDutiesApplicantsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d. Procedures for handling complaints and appeals 4.6 d.</p>
						<p class="sub_heading_content" id="genReqCerProductSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerProductSevenPreview"></p>
						<p class="sub_heading_content" id="managementRefCerProductAttach7-preview">
						 <%= Validator.isNotNull(handlingComplaintsAppealsDocUrl) ? handlingComplaintsAppealsDocUrl :""%>
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
						<p class="sub_heading">5. Organizational structure showing duties, responsibilities and authorities of management and other certification personnel and any committees 5.1.2</p>
						<p class="sub_heading_content" id="structuralReqCerProductOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerProductOnePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerProductAttach1-preview">
						   <%= Validator.isNotNull(dutiesResponsibilitiesAuthoritiesDocUrl) ? dutiesResponsibilitiesAuthoritiesDocUrl :""%>
						</p>
					</div>
				</div>
                
                <div class="col-12">
					<div>
						<p class="sub_heading">6. Formal rules for the appointment, terms of reference and operation
                            of any committees that are involved in the certification process 5.1.4</p>
						<p class="sub_heading_content" id="structuralReqCerProductTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerProductTwoPreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerProductAttach2-preview">
						   <%= Validator.isNotNull(termsReferenceOperationDocUrl) ? termsReferenceOperationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">7. Mechanism for safeguarding impartiality 5.2</p>
						<p class="sub_heading_content" id="structuralReqCerProductThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerProductThreePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerProductAttach3-preview">
						   <%= Validator.isNotNull(mechanismSafeguardingImpartialityDocUrl1) ? mechanismSafeguardingImpartialityDocUrl1 :""%>
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
						<p class="sub_heading">8. Procedure for management of competencies of personnel involved
                            in the certification process 6.1.2</p>
						<p class="sub_heading_content" id="resourceReqCerProductOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerProductOnePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerProductAttach1-preview">
						   <%= Validator.isNotNull(competenciesPersonnelInvolvedDocUrl) ? competenciesPersonnelInvolvedDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">9. Contract with personnel (sample/template) 6.1.3</p>
						<p class="sub_heading_content" id="resourceReqCerProductTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerProductTwoPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerProductAttach2-preview">
						  <%= Validator.isNotNull(contractPersonnelSampleDocUrl) ? contractPersonnelSampleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">10. Contract with the body that provides the outsourced service
                            (sample/template) 6.2.2</p>
						<p class="sub_heading_content" id="resourceReqCerProductThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerProductThreePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerProductAttach3-preview">
						   <%= Validator.isNotNull(outsourcedServiceDocUrl) ? outsourcedServiceDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">11. Documented policies, procedures and records for the qualification,
                            assessing and monitoring of all bodies that provide outsourced
                            services 6.2.2</p>
						<p class="sub_heading_content" id="resourceReqCerProductFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerProductFourPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerProductAttach4-preview">
						   <%= Validator.isNotNull(qualificationAssessingDocUrl) ? qualificationAssessingDocUrl :""%>
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
						<p class="sub_heading">12. Reference to specified standards and 
                            other normative documents 7.1.2</p>
						<p class="sub_heading_content" id="processReqCerProductOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductOnePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach1-preview">
						  <%= Validator.isNotNull(normativeDocumentsDocUrl) ? normativeDocumentsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">13. Application form (sample/template) 7.2</p>
						<p class="sub_heading_content" id="processReqCerProductTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductTwoPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach2-preview">
						   <%= Validator.isNotNull(applicationTemplateDocUrl) ? applicationTemplateDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">14. Process for application review 7.3</p>
						<p class="sub_heading_content" id="processReqCerProductThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductThreePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach3-preview">
						     <%= Validator.isNotNull(processApplicationReviewDocUrl17065) ? processApplicationReviewDocUrl17065 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">15. Process to identify when the client's 
                            request for certification includes product, normatour document, or certification scheme with 
                            which the certification body has no prior experience 7.3.2</p>
						<p class="sub_heading_content" id="processReqCerProductFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductFourPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach4-preview">
						   <%= Validator.isNotNull(certificationIncludesProductDocUrl) ? certificationIncludesProductDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">16. Plan for evaluation activities 7.4</p>
						<p class="sub_heading_content" id="processReqCerProductFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductFivePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach5-preview">
						   <%= Validator.isNotNull(planEvaluationActivitiesDocUrl) ? planEvaluationActivitiesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">17. Evaluation review and (sample/template) 7.5</p>
						<p class="sub_heading_content" id="processReqCerProductSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductSixPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach6-preview">
						  <%= Validator.isNotNull(evaluationReviewSampleDocUrl) ? evaluationReviewSampleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">18. Certification decision 7.6</p>
						<p class="sub_heading_content" id="processReqCerProductSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductSevenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach7-preview">
						  <%= Validator.isNotNull(certificationDecisionDocUrl) ? certificationDecisionDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">19. Certification documentation 
                            (sample/template) 7.7</p>
						<p class="sub_heading_content" id="processReqCerProductEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductEightPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach8-preview">
						  <%= Validator.isNotNull(certificationDocumentationSampleDocUrl) ? certificationDocumentationSampleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">20. Directory of certified clients 7.8</p>
						<p class="sub_heading_content" id="processReqCerProductNinePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductNinePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach9-preview">
						  <%= Validator.isNotNull(directoryCertifiedClientsDocUrl) ? directoryCertifiedClientsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">21. Process to receive, evaluate and make 
                            decisions on complaints and appeals. 7.13</p>
						<p class="sub_heading_content" id="processReqCerProductTenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerProductTenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerProductAttach10-preview">
						 <%= Validator.isNotNull(decisionsComplaintsAppealsDocUrl) ? decisionsComplaintsAppealsDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row cer-product-option-a hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option A</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">22. General management system documentation 8.2</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach1-preview">
						 <%= Validator.isNotNull(generalManagementSystemDocUrl) ? generalManagementSystemDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">23. Control of documents 8.3</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach2-preview">
						  <%= Validator.isNotNull(controlDocumentsDocUrl1) ? controlDocumentsDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">24. Control of records 8.4</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefThreePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach3-preview">
						  <%= Validator.isNotNull(controlRecordsDocUrl17065) ? controlRecordsDocUrl17065 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">25. Management review 8.5</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefFourPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach4-preview">
						   <%= Validator.isNotNull(managementReviewDocUrl2) ? managementReviewDocUrl2 :""%>
						 </p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">26. Internal audits 8.6</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefFivePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach5-preview">
						  <%= Validator.isNotNull(internalAuditManageDocUrl) ? internalAuditManageDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">27. Corrective action 8.7</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefSixPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach6-preview">
						  <%= Validator.isNotNull(correctiveManageActionDocUrl) ? correctiveManageActionDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">28. Preventive action 8.8</p>
						<p class="sub_heading_content" id="managementSystemCerProductReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductRefAttach7-preview">
						    <%= Validator.isNotNull(preventiveManageActionDocUrl) ? preventiveManageActionDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row cer-product-option-b hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option B - ISO 9001</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">29. Documentation in keeping with 
                            requirements of ISO 9001</p>
						<p class="sub_heading_content" id="managementSystemCerProductBReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerProductBRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerProductBRefAttach1-preview">
						    <%= Validator.isNotNull(keepingRequirementsDocUrl) ? keepingRequirementsDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep33" class="final-preview-section">
		<div class="other-req-pro-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="other-req-pro-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">22.0</span> Application fees (non-refundable) submitted?</p>
						<p class="sub_heading_content" id="otherFeeReqCerProductPreview"></p>
					</div>
				</div>
                <div class="col-12 otherFeeReqCerProductBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">23.0</span> State payment method</p>
						<p class="sub_heading_content" id="otherFeePayMethodCerProductPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameCerProPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionCerProPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeCerProSignaturePre">
							<%if(Validator.isNotNull(CertiTwoSign)){ %>
							<img src="<%=CertiTwoSign%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeCerProDatePreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>
</div>