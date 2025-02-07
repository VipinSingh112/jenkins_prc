<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@ include file="/attachDoc.jsp" %>
<div class="third-party-cer-pre hide">
	<section id="janaacPreviewStep47" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-app-info-edit-tab">
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
						<p class="sub_heading_content" id="applicantNameThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressThirdPartyPreview"></p>
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
						<p class="sub_heading_content" id="applicantTelephoneThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsiteThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="certificationNameThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="certAddressThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person in Charge of Certification Body</p>
						<p class="sub_heading_content" id="personnelNameThirdPartyPreview"></p>
						<p class="sub_heading_content" id="personnelEmailThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
							<%if(fdaAppliInfo!=null){
long counterOfFdaAppliInfoAdd=1;
for(AddFdaAppliInfo fdaInfo:fdaAppliInfo){
%>			
  <tr class="personnel-responsible-third-party-row<%=counterOfFdaAppliInfoAdd%>">
<td class="sub_heading_content technicalPersonNameThirdParty<%=counterOfFdaAppliInfoAdd%>">
<%=Validator.isNotNull(fdaInfo)&&Validator.isNotNull(fdaInfo.getName())?fdaInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailThirdParty<%=counterOfFdaAppliInfoAdd%>">
<%=Validator.isNotNull(fdaInfo)&&Validator.isNotNull(fdaInfo.getEmail())?fdaInfo.getEmail():""%></td>
</tr>
<input type="hidden" id="personResponsibleThirdPartyId<%=counterOfFdaAppliInfoAdd%>" name="personResponsibleThirdPartyId<%=counterOfFdaAppliInfoAdd%>" value="<%=fdaInfo.getAddFdaAppliInfoId()%>">    
 <%
  counterOfFdaAppliInfoAdd++;
						}
}
					%>	
						</tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Contact Person</p>
						<p class="sub_heading_content" id="contactPersonNameThirdPartyPreview"></p>
						<p class="sub_heading_content" id="contactPersonEmailThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Financial Manager of Certification Body</p>
						<p class="sub_heading_content" id="financialManagerNameThirdPartyPreview"></p>
						<p class="sub_heading_content" id="financialManagerEmailThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The applicable FDA Scheme(s) for which accreditation is being sought</p>
						<p class="sub_heading_content" id="accreditationFdaSchemePreview"></p>
					</div>
				</div>
                <div class="col-12 accreditationFdaSchemeOther hide">
					<div>
						<p class="sub_heading">Please Specify</p>
						<p class="sub_heading_content" id="accreditationFdaSchemeOtherPreview"></p>
					</div>
				</div>

                <div class="col-12">
					<div>
						<p class="sub_heading">The Supplementary Certification Standard for which accreditation is being sought</p>
						<p class="sub_heading_content" id="supplementaryCertificateStandardPreview"></p>
					</div>
				</div>
                <div class="col-12 supplementaryCertificateStandardOther hide">
					<div>
						<p class="sub_heading">Please Specify</p>
						<p class="sub_heading_content" id="supplementaryCertificateStandardOtherPreview"></p>
					</div>
				</div>

                <div class="col-6">
					<div>
						<p class="sub_heading">List all standard(s) that apply</p>
						<p class="sub_heading_content" id="listOfStandardThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelThirdPartyNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelThirdPartyPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelThirdPartyDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelThirdPartyImageHolderPre">
						<%if(Validator.isNotNull(signAuthPersonnelFda)){ %>
							<img src="<%=signAuthPersonnelFda%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampThirdPartyImageHolderPre">
						<%if(Validator.isNotNull(companyStampFda)){ %>
							<img src="<%=companyStampFda%>"  width="100" height="100"/>
					<%} %>
						</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep48" class="final-preview-section">
		<div class="general-third-party-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">General</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="general-third-party-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">1.0</span> Is the Certification Body a 
                            legal entity or a defined part of a legal entity?</p>
						<p class="sub_heading_content" id="thirdPartyLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-12 legalStatusDescribeThirdParty hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">2.0</span> Describe the legal status and corporate ownership of the organization</p>
						<p class="sub_heading_content" id="thirdPartyLegalStatusEntityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0</span> Outline all major sources of income for the 
                            Certification Body.(i.e. service fees, corporate funding, government grants, other etc.)</p>
						<p class="sub_heading_content" id="incomeMajorSourcesThirdPartyPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep49" class="final-preview-section">
		<div class="scope-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Scope, Services, Clients and Interested Parties</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-scope-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">4.0</span>The specific scope(s) which accreditation is being requested. Also, include technical competence/expertise and limits of capability where applicable.</p>
					</div>
				</div>
				<div class="col-12">
					<div class="table-responsive">
						<table class="table table-bordered" id="scopeTable">
							<tr>
								<th>Category</th>
								<th>Food Products/Process</th>
								<th>FDA Regulations</th>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0</span> Registered Client Organizations</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addRegisteredClientOrgThirdPartyDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Client Organization</th>
                                <th class="sub_heading text-nowrap">Food Products/Process</th>
                                <th class="sub_heading text-nowrap">FDA Regulations</th>
                                <th class="sub_heading text-nowrap">Date granted</th>
                            </tr>
                            <%if(fdaScopeClientInfo!=null){
long CounterOfFdaScopeClientInfoAdd=1;
for(AddFdaScopeClient ScopeClientInfo:fdaScopeClientInfo){
%>			
<tr class="registered-client-org-third-party-row<%=CounterOfFdaScopeClientInfoAdd%>">
<td class="sub_heading_content clientOrganizationNameThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getClientOrganization())?ScopeClientInfo.getClientOrganization():""%></td>
<td class="sub_heading_content foodProductThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getFoodProducts())?ScopeClientInfo.getFoodProducts():""%></td>
<td class="sub_heading_content fdaRegulationsThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getFdaRegulations())?ScopeClientInfo.getFdaRegulations():""%></td>
<td class="sub_heading_content firstGrantedDateThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getDateGranted())?new SimpleDateFormat("YYYY-mm-dd").format(ScopeClientInfo.getDateGranted()):""%></td>
</tr>
<input type="hidden" id="registeredClientOrgThirdPartyId<%=CounterOfFdaScopeClientInfoAdd%>" name="registeredClientOrgThirdPartyId<%=CounterOfFdaScopeClientInfoAdd%>" value="<%=ScopeClientInfo.getAddFdaScopeClientId()%>">    
 <%
  CounterOfFdaScopeClientInfoAdd++;
						}
}
					%>	
                        </tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">6.0</span> Indicate the interested parties (persons or organizations), excluding clients and staff, stating their specific interest.</p>
						<p class="sub_heading_content" id="intrestedPartiesThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0</span> Does the certification body or entities under the same organizational control, provide services other than certification?</p>
						<p class="sub_heading_content" id="thirdPartyOtherServicesPreview"></p>
					</div>
				</div>
                <div class="col-12 thirdPartyOtherServicesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0</span> briefly describe the nature of these services and the general groups who are clients of these services</p>
						<p class="sub_heading_content" id="thirdPartyOtherServicesDescribePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0</span> Does the certification body have established relationships with any organizations that perform internal auditing or consultancy services?</p>
						<p class="sub_heading_content" id="thirdPartyEstablishedRelationPreview"></p>
					</div>
				</div>
                <div class="col-12 thirdPartyEstablishedRelationBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">10.0</span> give a brief description of the organization(s), services provided and the nature/extent of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<p class="sub_heading_content" id="thirdPartyEstablishedRelationDescPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0</span> Has your organization provided certification services for any client that has received consultancy or internal audit services from any organization described in 9 and 10 above?</p>
						<p class="sub_heading_content" id="thirdPartyCertificationServicePreview"></p>
					</div>
				</div>

                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">12.0</span> Has your organization provided certification services for any client that is also a certification body?</p>
						<p class="sub_heading_content" id="orgProvideCertificateThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">13.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<p class="sub_heading_content" id="orgPreviouslyAccreditedThirdPartyPreview"></p>
					</div>
				</div>
			</div>
            <div class="row hide orgPreviouslyAccreditedThirdPartyBox">
				<div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">14.0 Indicate:</span></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The name of the body responsible for the most recent accreditation</p>
						<p class="sub_heading_content" id="responsibleBodyAccreditationThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The expiry date of accreditation</p>
						<p class="sub_heading_content" id="accreditationExpDateThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The scope for which the certification body is/was accredited</p>
						<p class="sub_heading_content" id="certBodyScopeThirdPartyPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep50" class="final-preview-section">
		<div class="personal-res-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Personnel and Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-personal-res-info-edit-tab">
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
						<p class="sub_heading_content" id="internalStaffSizeThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Number of auditors</p> 
						<p class="sub_heading_content" id="auditorsNumThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Number of contracted personnel</p> 
						<p class="sub_heading_content" id="contractedPerNumThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0</span> Staff Details</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailThirdPartyTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name of Staff</th>
                                <th class="sub_heading text-nowrap">Job Title</th>
                                <th class="sub_heading text-nowrap">Major Responsibilities</th>
                                <th class="sub_heading text-nowrap">Specific Functions</th>
                            </tr>
                            <%if(fdaPersonnelFirstInfo!=null){
long counterOfFdaPerFirstInfoAdd=1;
for(AddFdaPersonnelFirst perFirstInfo:fdaPersonnelFirstInfo){
%>			
<tr class="staff-detail-third-party-row<%=counterOfFdaPerFirstInfoAdd%>">
<td class="sub_heading_content staffNameThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getNameOfStaff())?perFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getJobTitle())?perFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getMajorResponsibilites())?perFirstInfo.getMajorResponsibilites():""%></td>
<td class="sub_heading_content specificFunctionThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getSpecificFunctions())?perFirstInfo.getSpecificFunctions():""%></td>
</tr>
<input type="hidden" id="staffDetailThirdPartyId<%=counterOfFdaPerFirstInfoAdd%>" name="staffDetailThirdPartyId<%=counterOfFdaPerFirstInfoAdd%>" value="<%=perFirstInfo.getAddFdaPersonnelFirstId()%>">    
 <%
  counterOfFdaPerFirstInfoAdd++;
						}
}
					%>	
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">17.0</span> Supported by documentation in Section A, II, 7. above, list all auditors, technical experts including contracted personnel that perform certification activities.</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addAuditorListThirdPartyTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Role</th>
								<th class="sub_heading text-nowrap">FDA Regulation/Area of Expertise</th>
                            </tr>
                            <%if(fdaPersonnelSecInfo!=null){
long counterOfFdaPerSecInfoAdd=1;
for(AddFdaPersonnelSecond perSecInfo:fdaPersonnelSecInfo){
%>			
<tr class="auditor-list-third-party-row<%=counterOfFdaPerSecInfoAdd%>">
<td class="sub_heading_content auditorNameThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getName())?perSecInfo.getName():""%></td>
<td class="sub_heading_content auditorRoleThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getRole())?perSecInfo.getRole():""%></td>
<td class="sub_heading_content auditorExpertiseAreaThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getFdaRegulation())?perSecInfo.getFdaRegulation():""%></td>
</tr>
<input type="hidden" id="auditorListThirdPartyId<%=counterOfFdaPerSecInfoAdd%>" name="auditorListThirdPartyId<%=counterOfFdaPerSecInfoAdd%>" value="<%=perSecInfo.getAddFdaPersonnelSecondId()%>">    
 <%
  counterOfFdaPerSecInfoAdd++;
						}
}
					%>			
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0</span> Does the certification body outsource (in part or in whole) any of its certification services (e.g., to other
                            certification bodies etc.)?</p>
						<p class="sub_heading_content" id="thirdPartyBodyOutsourcePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">19.0</span> Identify in the table below the nature of the outsourced activities and respective suppliers/service providers for each</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addOutsourceActNatureThirdPartyTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Outsourced Activity</th>
                                <th class="sub_heading text-nowrap">Supplier/Service provdier</th>
                            </tr>
                            <%if(fdaPersonnelThirdInfo!=null){
long counterOfFdaPerThirdInfoAdd=1;
for(AddFdaPersonnelThird perThirdInfo:fdaPersonnelThirdInfo){
%>			
<tr class="outsource-act-nature-third-party-row<%=counterOfFdaPerThirdInfoAdd%>">
<td class="sub_heading_content outsourcedActivityThirdParty<%=counterOfFdaPerThirdInfoAdd%>">
<%=Validator.isNotNull(perThirdInfo)&&Validator.isNotNull(perThirdInfo.getOutsourcedActivity())?perThirdInfo.getOutsourcedActivity():""%></td>
<td class="sub_heading_content serviceProvdierThirdParty<%=counterOfFdaPerThirdInfoAdd%>">
<%=Validator.isNotNull(perThirdInfo)&&Validator.isNotNull(perThirdInfo.getSupplierServiceProvider())?perThirdInfo.getSupplierServiceProvider():""%></td>
</tr>
<input type="hidden" id="outsourceActNatureThirdPartyId<%=counterOfFdaPerThirdInfoAdd%>" name="outsourceActNatureThirdPartyId<%=counterOfFdaPerThirdInfoAdd%>" value="<%=perThirdInfo.getAddFdaPersonnelThirdId()%>">    
 <%
  counterOfFdaPerThirdInfoAdd++;
						}
}
					%>	
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">20.0</span> If your application covers activities performed at more than one location (including virtual sites if applicable, branch offices, partners locations, agents, etc.), provide details in the table below: [Clause 6.2; 8.1.2]</h2>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addActivityPerformedLocThirdPartyTable">
                            <tr>
                                <th class="sub_heading text-nowrap">No.</th>
                                <th class="sub_heading text-nowrap">Location/Address</th>
                                <th class="sub_heading text-nowrap">Certification activities performed at location</th>
                                <th class="sub_heading text-nowrap">Contact Details</th>
                            </tr>
                            <%if(fdaPersonnelFourInfo!=null){
long counterOfFdaPerFourInfoAdd=1;
for(AddFdaPersonnelFour perFourInfo:fdaPersonnelFourInfo){
%>			
<tr class="activity-performed-third-party-row<%=counterOfFdaPerFourInfoAdd%>">
<td class="sub_heading_content activityLocNumThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getNumber())?perFourInfo.getNumber():""%></td>
<td class="sub_heading_content activityLocationThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getLocationAddress())?perFourInfo.getLocationAddress():""%></td>
<td class="sub_heading_content certifiedActivityLocationThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getCertificationActivities())?perFourInfo.getCertificationActivities():""%></td>
<td class="sub_heading_content activityContactDetailThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getContactDetails())?perFourInfo.getContactDetails():""%></td>
</tr>
<input type="hidden" id="activityPerformedLocId<%=counterOfFdaPerFourInfoAdd%>" name="activityPerformedLocId<%=counterOfFdaPerFourInfoAdd%>" value="<%=perFourInfo.getAddFdaPersonnelFourId()%>">    
 <%
  counterOfFdaPerFourInfoAdd++;
						}
}
					%>		
                            
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">21.0</span> Briefly describe the security arrangements, equipment and/or facilities established to prevent loss of, or unauthorized access to client data and information?</p>
						<p class="sub_heading_content" id="descSecurityArrangementsThirdPartyPreview"></p>
					</div>
				</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep51" class="final-preview-section">
		<div class="information-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">22.0</span> Briefly describe the mechanisms through which information about the organization and its certification services is made available to the public; to certified clients.</p>
						<p class="sub_heading_content" id="describeMechanismThirdPartyPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep52" class="final-preview-section">
		<div class="management-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-management-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">23.0</span> In accordance with clause 10.1 in ISO/IEC 17021-1:2015; 8.1 in ISO/IEC 17065:2012, indicate the management system option employed by your organization.</p>
						<p class="sub_heading_content" id="managementImplementedWithOrgThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">24.0</span> Has your organization established documentation for the following requirements?</p>
                        <p>Impartiality/Confidentiality</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">1. Impartiality policy; Written program for protecting against conflicts of interest [F, M, P]</p>
						<p class="sub_heading_content" id="impartialityThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="impartialityRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="impartialityRefThirdPartyAttach1-preview">
						  <%= Validator.isNotNull(impartialityQualityOneUrl) ? impartialityQualityOneUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">2. Impartiality mechanism [P]</p>
						<p class="sub_heading_content" id="impartialityThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="impartialityRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="impartialityRefThirdPartyAttach2-preview">
					    <%= Validator.isNotNull(impartialityQualityTwoUrl) ? impartialityQualityTwoUrl : "" %>
					   </p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">3. Risk assessment - treatment of threats to impartiality and mitigation measures [M, P]</p>
						<p class="sub_heading_content" id="impartialityThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="impartialityRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="impartialityRefThirdPartyAttach3-preview">
					    <%= Validator.isNotNull(impartialityQualityThreeUrl) ? impartialityQualityThreeUrl : "" %>
					   </p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">4. Confidentiality Agreement [M, P]</p>
						<p class="sub_heading_content" id="impartialityThirdParty4Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="impartialityRefThirdParty4Preview"></p>
						<p class="sub_heading_content" id="impartialityRefThirdPartyAttach4-preview">
					    <%= Validator.isNotNull(impartialityQualityFourUrl) ? impartialityQualityFourUrl : "" %>
					   </p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Organizational Structure</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">5. Organizational structure and duties (e.g., job descriptions) for managerial and key certification personnel [M, P]</p>
						<p class="sub_heading_content" id="orgStructureThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="orgStructureRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="orgStructureRefThirdPartyAttach1-preview">
						 <%= Validator.isNotNull(orgStruFirstUrl) ? orgStruFirstUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">6. Terms of reference for all committees involved in certification activities [M, P]</p>
						<p class="sub_heading_content" id="orgStructureThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="orgStructureRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="orgStructureRefThirdPartyAttach2-preview">
						 <%= Validator.isNotNull(orgStruSecUrl) ? orgStruSecUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">7. Process for control of activities conducted by branches, partnerships, agents, franchises, etc. [M]</p>
						<p class="sub_heading_content" id="orgStructureThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="orgStructureRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="orgStructureRefThirdPartyAttach3-preview">
						 <%= Validator.isNotNull(orgStruFirstThreeUrl) ? orgStruFirstThreeUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Resources</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">8. Procedure of management and monitoring of
                            competence of certification personnel [F, P]</p>
						<p class="sub_heading_content" id="resourcesThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach1-preview">
						    <%= Validator.isNotNull(approvalFirstUrl) ? approvalFirstUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">9. Criteria of required knowledge and skills necessary to perform audits and certification tasks [M]</p>
						<p class="sub_heading_content" id="resourcesThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach2-preview">
						    <%= Validator.isNotNull(approvalSecUrl) ? approvalSecUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">10. Procedure for initial competence evaluation and monitoring of personnel involved in audit and certification activities (general) [M]</p>
						<p class="sub_heading_content" id="resourcesThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach3-preview">
						    <%= Validator.isNotNull(approvalThirdUrl) ? approvalThirdUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">11. Procedure containing audit instructions and relevant information to auditors [M]</p>
						<p class="sub_heading_content" id="resourcesThirdParty4Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty4Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach4-preview">
						    <%= Validator.isNotNull(approvalFourUrl) ? approvalFourUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">12. Monitoring of competence and performance of auditors (including on-site evaluation, review of audit reports and client feedback) [M]</p>
						<p class="sub_heading_content" id="resourcesThirdParty5Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty5Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach5-preview">
						    <%= Validator.isNotNull(approvalFiveUrl) ? approvalFiveUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">13. Description of process for outsourcing of certification activities [M, P]</p>
						<p class="sub_heading_content" id="resourcesThirdParty6Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty6Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach6-preview">
						    <%= Validator.isNotNull(approvalSixUrl) ? approvalSixUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">14. Contractual arrangements with auditors/experts [M, P]</p>
						<p class="sub_heading_content" id="resourcesThirdParty7Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty7Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach7-preview">
						    <%= Validator.isNotNull(approvalSevenUrl) ? approvalSevenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">15. Contractual arrangements with outsourced entities [M, P]</p>
						<p class="sub_heading_content" id="resourcesThirdParty8Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="resourcesRefThirdParty8Preview"></p>
						<p class="sub_heading_content" id="resourcesRefThirdPartyAttach8-preview">
						    <%= Validator.isNotNull(approvalEightUrl) ? approvalEightUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Information Requirements</p>
                        <p>16. Information made publicly available/accessible with respect to the following</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">a. Audit processes [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach1-preview">
						    <%= Validator.isNotNull(approvalInfoOneUrl) ? approvalInfoOneUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b. Processes for granting, refusing, maintaining, renewing, suspending, restoring or withdrawing certification or expanding or reducing the scope of certification [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach2-preview">
						    <%= Validator.isNotNull(approvalInfoTwoUrl) ? approvalInfoTwoUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c. Management systems and/or certification scheme for which certification is offered [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach3-preview">
						    <%= Validator.isNotNull(approvalInfoThreeUrl) ? approvalInfoThreeUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d. Use of the certification body's name and certification mark or logo [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty4Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty4Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach4-preview">
						    <%= Validator.isNotNull(approvalInfoFourUrl) ? approvalInfoFourUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e. Handling requests for information, complaints and appeals [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty5Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty5Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach5-preview">
						    <%= Validator.isNotNull(approvalInfoFiveUrl) ? approvalInfoFiveUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f. Impartiality Policy [M]</p>
						<p class="sub_heading_content" id="informationThirdParty6Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty6Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach6-preview">
						    <%= Validator.isNotNull(approvalInfoSixUrl) ? approvalInfoSixUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">g. Description of the rights and duties of
                            applicants and clients [P]</p>
						<p class="sub_heading_content" id="informationThirdParty7Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty7Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach7-preview">
						    <%= Validator.isNotNull(approvalInfoSevenUrl) ? approvalInfoSevenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">h. Description CB obtains financial support and general information on the certification fees
                            [P]</p>
						<p class="sub_heading_content" id="informationThirdParty8Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty8Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach8-preview">
						    <%= Validator.isNotNull(approvalInfoEightUrl) ? approvalInfoEightUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">17. Provisions for supplying information on certification activities and requirements, geographical areas of operation, status of a certification and certified clients [M]</p>
						<p class="sub_heading_content" id="informationThirdParty9Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty9Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach9-preview">
						   <%= Validator.isNotNull(approvalInfoNineUrl) ? approvalInfoNineUrl : "" %>
						</p>

				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">18. Directory of certified products [P]</p>
						<p class="sub_heading_content" id="informationThirdParty10Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty10Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach10-preview">
						    <%= Validator.isNotNull(approvalInfoTenUrl) ? approvalInfoTenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">19. Certification documents (sample) [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty11Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty11Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach11-preview">
						    <%= Validator.isNotNull(approvalInfoElevenUrl) ? approvalInfoElevenUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">20. Rights and duties of certified clients [M, P]</p>
						<p class="sub_heading_content" id="informationThirdParty12Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="informationRefThirdParty12Preview"></p>
						<p class="sub_heading_content" id="informationRefThirdPartyAttach12-preview">
						    <%= Validator.isNotNull(approvalInfTwelveUrl) ? approvalInfTwelveUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
                        <p>Certification Process</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">21. Application process; application review [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach1-preview">
						    <%= Validator.isNotNull(approvalProOneUrl) ? approvalProOneUrl : "" %>
						</p>

					</div>
				</div>
                
                <div class="col-12">
					<div>
						<p class="sub_heading">22. Audit programme; plan for evaluation [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach2-preview">
						    <%= Validator.isNotNull(approvalProTwoUrl) ? approvalProTwoUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">23. Procedures for determining audit time [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach3-preview">
						    <%= Validator.isNotNull(approvalProThreeUrl) ? approvalProThreeUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">24. Sampling programme/plan (if applicable) for multi-site audits [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty4Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty4Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach4-preview">
						    <%= Validator.isNotNull(approvalProfourUrl) ? approvalProfourUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">25. Process for selecting and appointing the audit team [M,P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty5Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty5Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach5-preview">
						    <%= Validator.isNotNull(approvalProFiveUrl) ? approvalProFiveUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">26. Process for conducting audits/evaluations [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty6Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty6Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach6-preview">
						    <%= Validator.isNotNull(approvalProSixUrl) ? approvalProSixUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">27. Audit Report (sample/template) [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty7Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty7Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach7-preview">
						    <%= Validator.isNotNull(approvalProSevenUrl) ? approvalProSevenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">28. Process to conduct review of audit results prior to decision [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty8Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty8Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach8-preview">
						    <%= Validator.isNotNull(approvalProEightUrl) ? approvalProEightUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">29. Process for transfer of certification [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty9Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty9Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach9-preview">
						    <%= Validator.isNotNull(approvalProNineUrl) ? approvalProNineUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">30. Policy for suspension, withdrawal or reduction of the scope of certification [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty10Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty10Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach10-preview">
						    <%= Validator.isNotNull(approvalProTenUrl) ? approvalProTenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">31. Procedure(s) for suspension, withdrawal or reduction of the scope of certification [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty11Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty11Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach11-preview">
						    <%= Validator.isNotNull(approvalProElevenUrl) ? approvalProElevenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">32. Certification documentation [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty12Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty12Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach12-preview">
						    <%= Validator.isNotNull(approvalProTwelveUrl) ? approvalProTwelveUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">33. Directory of certified products [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty13Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty13Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach13-preview">
						    <%= Validator.isNotNull(approvalProThirteenUrl) ? approvalProThirteenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">34. Procedure to receive, evaluate and make decisions on
                            appeals [F, M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty14Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty14Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach14-preview">
						    <%= Validator.isNotNull(approvalProFourteenUrl) ? approvalProFourteenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">35. Procedure to receive, evaluate and make decisions on complaints [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty15Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty15Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach15-preview">
						    <%= Validator.isNotNull(approvalProFiveteenUrl) ? approvalProFiveteenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">36. Record retention policy [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty16Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty16Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach16-preview">
						    <%= Validator.isNotNull(approvalProSixteenUrl) ? approvalProSixteenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">37. Record retention procedure [M, P]</p>
						<p class="sub_heading_content" id="cerProcessThirdParty17Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="cerProcessRefThirdParty17Preview"></p>
						<p class="sub_heading_content" id="cerProcessRefThirdPartyAttach17-preview">
						    <%= Validator.isNotNull(approvalProSeventeenUrl) ? approvalProSeventeenUrl : "" %>
						</p>
					</div>
				</div>
            </div>
            <div class="row">
                <div class="col-12">
					<div>
                        <p>Management System</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">38. Management system policies [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty1Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty1Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach1-preview">
						    <%= Validator.isNotNull(approvalManOneUrl) ? approvalManOneUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">39. Management system objectives [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty2Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty2Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach2-preview">
						    <%= Validator.isNotNull(approvalManTwoUrl) ? approvalManTwoUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">40. Management system manual or equivalent
                            documentation [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty3Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty3Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach3-preview">
						    <%= Validator.isNotNull(approvalManThreeUrl) ? approvalManThreeUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">41. Procedure for document control [F, M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty4Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty4Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach4-preview">
						    <%= Validator.isNotNull(approvalManFourUrl) ? approvalManFourUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">42. Procedure for record/data control [F, M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty5Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty5Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach5-preview">
						  <%= Validator.isNotNull(approvalManFiveUrl) ? approvalManFiveUrl : "" %>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">43. Management review [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty6Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty6Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach6-preview">
						    <%= Validator.isNotNull(approvalManSixUrl) ? approvalManSixUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">44. Internal audits [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty7Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty7Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach7-preview">
						    <%= Validator.isNotNull(approvalManSevenUrl) ? approvalManSevenUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">45. Procedures for identification and management of corrective actions [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty8Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty8Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach8-preview">
						    <%= Validator.isNotNull(approvalManEightUrl) ? approvalManEightUrl : "" %>
						</p>

					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">46. Preventive actions; risks [M, P]</p>
						<p class="sub_heading_content" id="managementSysThirdParty9Preview"></p>
					</div>
					<div class="managementRefThirdParty">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSysRefThirdParty9Preview"></p>
						<p class="sub_heading_content" id="managementSysRefThirdPartyAttach9-preview">
						    <%= Validator.isNotNull(approvalManNineUrl) ? approvalManNineUrl : "" %>
						</p>

					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep53" class="final-preview-section">
		<div class="other-req-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="third-party-other-req-info-edit-tab">
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
						<p class="sub_heading_content" id="otherFeeReqThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-12 otherFeeReqThirdPartyBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">26.0</span> state payment method</p>
						<p class="sub_heading_content" id="otherFeePayMethodThirdPartyPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionThirdPartyPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeThirdPartySignaturePre">
						<%if(Validator.isNotNull(fdaSign)){ %>
							<img src="<%=fdaSign%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeThirdPartyDatePreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>
</div>

<section class="final-preview-section supporting-doc-preview" id="janaacPreviewStep54">
	<div class="supporting-doc-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Supporting Documents</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="supporting-doc-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12 hide" id="requireDocPreviewSection">
				<p>Mandatory Documents</p>
				<div id="requireDocPreview"></div>
			</div>
			<div class="col-12 hide" id="notRequireDocPreviewSection">
				<p>Optional Documents</p>
				<div id="notRequireDocPreview"></div>
			</div>
			<div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<p class="sub_heading noAdditionalSupportingDoc">No Additional
					Supporting Documents</p>
				<div id="additionalDocPreview"></div>
				
				<div class="additionalDocPreviewOne">
					<div class="document-container-preview mb-2">
						<a class="sub_heading_content" id="additionalDocNamePreview"></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="final-preview-section" id="janaacPreviewStep55">
	<div class="fee-payment-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Fee Payment</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="fee-payment-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-6"> 
				<div>
					<p class="sub_heading">Method</p>
					<p class="sub_heading_content fee-method-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Proof of Payment</p>
					<p><a class="sub_heading_content" id="payment-upload-preview" href="<%=Validator.isNotNull(feeRecipetUrl)? feeRecipetUrl:""%>"><%=(Validator.isNotNull(feeRecipet))?feeRecipet:""%></a></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Amount</p>
					<p class="sub_heading_content fee-amount-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Currency</p>
					<p class="sub_heading_content fee-currency-preview"></p>
				</div>
			</div>	
		</div>
	</div>
</section>