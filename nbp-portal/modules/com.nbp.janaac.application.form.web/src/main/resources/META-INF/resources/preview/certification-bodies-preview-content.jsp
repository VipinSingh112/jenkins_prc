<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@ include file="/attachDoc.jsp" %>
<div class="certification-bodies-pre hide">
	<section id="janaacPreviewStep34" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Application Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="cer-bodies-app-info-edit-tab">
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
						<p class="sub_heading_content" id="applicantNameCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's Address</p>
						<p class="sub_heading_content" id="applicantAddressCerBodiesPreview"></p>
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
						<p class="sub_heading_content" id="applicantTelephoneCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="applicantFaxCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="applicantWebsiteCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="certificationNameCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Certification Body Seeking Accreditation</p>
						<p class="sub_heading_content" id="cerBodiesCertAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person in Charge of Certification Body</p>
						<p class="sub_heading_content" id="personnelNameCerBodiesPreview"></p>
						<p class="sub_heading_content" id="personnelEmailCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Person Responsible for Technical Management</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailCerBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
							</tr>
						</tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Contact Person</p>
						<p class="sub_heading_content" id="contactPersonNameCerBodiesPreview"></p>
						<p class="sub_heading_content" id="contactPersonEmailCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Name & Email Address of Financial Manager of Certification Body</p>
						<p class="sub_heading_content" id="financialManagerNameCerBodiesPreview"></p>
						<p class="sub_heading_content" id="financialManagerEmailCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Accreditation Request</p>
						<p class="sub_heading_content" id="accreditationRequestCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Authorized Personnel</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerBodiesNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerBodiesPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorizedPersonnelCerBodiesDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2"
						id="authorizedPersonnelCerBodiesImageHolderPre">
							<%if(Validator.isNotNull(signAuthPersonnelCerti17024)){ %>
							<img src="<%=signAuthPersonnelCerti17024%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
					<div class="signature_texarea mb-2"
						id="companyStampCerBodiesImageHolderPre">
							<%if(Validator.isNotNull(companyStampCerti17024)){ %>
							<img src="<%=companyStampCerti17024%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep35" class="final-preview-section">
		<div class="general-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">General</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="general-bodies-info-edit-tab">
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
                            legal entity or a defined part of a legal entity? [Clause 4.1]</p>
						<p class="sub_heading_content" id="cerBodiesLegalEntityPreview"></p>
					</div>
				</div>
				<div class="col-12 legalStatusDescribeCerBodies hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">2.0</span> Describe the legal status and corporate 
                            ownership of the organization</p>
						<p class="sub_heading_content" id="cerBodiesLegalStatusEntityPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">3.0</span> Outline all major sources of income for the 
                            Certification Body.(i.e. service fees, corporate funding, government grants, other etc.)[Clause 4.4;]</p>
						<p class="sub_heading_content" id="incomeMajorSourcesCerBodiesPreview"></p>
					</div>
				</div>
			</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep36" class="final-preview-section">
		<div class="scope-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Scope, Services, Clients and Interested Parties</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="scope-bodies-info-edit-tab">
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
						<tbody class="addRegisteredClientOrgCerBodiesDetailTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Client Organization Name</th>
                                <th class="sub_heading text-nowrap">Client Organization Address</th>
                                <th class="sub_heading text-nowrap">Certification Scheme</th>
                                <th class="sub_heading text-nowrap">Current Status</th>
                                <th class="sub_heading text-nowrap">Date first granted</th>
                                <th class="sub_heading text-nowrap">Date of next examination</th>
                            </tr>
                        </tbody>
					</table>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">5.0</span> Indicate interested parties (persons or organizations), excluding clients and staff, stating their specific  interest. (e.g. government ministries, public/private entities, individuals etc.) [Clause 4.3.8]</p>
						<p class="sub_heading_content" id="cerBodiesIntrestedPartiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">6.0</span> Does the certification body or entities under the same organizational control, provide services other than certification?</p>
						<p class="sub_heading_content" id="cerBodiesOtherServicesPreview"></p>
					</div>
				</div>
                <div class="col-12 cerBodiesOtherServicesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">7.0</span> Briefly describe the nature of these services and the general 
                            groups who are clients of these services</p>
						<p class="sub_heading_content" id="cerBodiesOtherServicesDescribePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">8.0</span> Does the certification body have established relationships with any organizations 
                            that perform internal auditing or consultancy services?</p>
						<p class="sub_heading_content" id="cerBodiesEstablishedRelationPreview"></p>
					</div>
				</div>
                <div class="col-12 cerBodiesEstablishedRelationBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">9.0</span> Give a brief description of the organization(s), services provided and the nature/extent 
                            of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<p class="sub_heading_content" id="cerBodiesEstablishedRelationDescPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">10.0</span> Has your organization provided certification services for any client that has received consultancy or 
                            internal audit services from any organization described in 8.0 and 9.0 above?</p>
						<p class="sub_heading_content" id="cerBodiesClientServicePreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">11.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<p class="sub_heading_content" id="orgAccreditedAnotherAccreditationCerBodiesPreview"></p>
					</div>
				</div>
			</div>
            <div class="row hide orgAccreditedAnotherAccreditationCerBodiesBox">
                <div class="col-12">
					<div>
						<p><span class="tab-form-highlghtme-link">12.0 Indicate:</span></p>
					</div>
				</div>
                <div class="col-12">
					<div>
                        <p></p>
						<p class="sub_heading">The name of the body responsible for the most recent accreditation</p>
						<p class="sub_heading_content" id="responsibleBodyAccreditationCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The expiry date of accreditation</p>
						<p class="sub_heading_content" id="accreditationExpDateCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">The scope for which the certification body is/was accredited</p>
						<p class="sub_heading_content" id="certBodyScopeCerBodiesPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep37" class="final-preview-section">
		<div class="personal-res-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Organization, Personnel and Resources</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="personal-res-bodies-info-edit-tab">
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
						<p class="sub_heading_content" id="internalStaffSizeCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Number of auditors</p> 
						<p class="sub_heading_content" id="auditorsNumCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">Number of contracted personnel including external auditors</p> 
						<p class="sub_heading_content" id="contractedPerNumCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">14.0</span> Staff Details</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addStaffDetailCerBodiesTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name of Staff</th>
                                <th class="sub_heading text-nowrap">Job Title</th>
                                <th class="sub_heading text-nowrap">Major Responsibilities</th>
                                <th class="sub_heading text-nowrap">Specific Functions</th>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="">15.0</span> Supported by documentation in Section A, II, 5. above, 
                            list all examiners including contracted personnel that perform certification activities, as well as their 
                            respective areas of expertise. [Clause 6.1]</p>
					</div>
				</div>
                <div class="col-12 table-responsive">
                    <table class="table table-bordered mb-3">
                        <tbody class="addAuditorListCerBodiesTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Name</th>
                                <th class="sub_heading text-nowrap">Role</th>
                                <th class="sub_heading text-nowrap">Certification Standard</th>
                                <th class="sub_heading text-nowrap">Area of Expertise</th>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">16.0</span> Does the certification body outsource (in part or whole) 
                            any of its evaluation activities related to certification? [Clause 6.3]</p>
						<p class="sub_heading_content" id="cerBodiesBodyOutsourcePreview"></p>
					</div>
				</div>
                <div class="col-12 cerBodiesOutsourceBox hide">
					<div>
						<p class="sub_heading"><span class="">17.0</span> Identify in the table below the nature of the outsourced 
                            activities and respective suppliers/service providers for each</p>
					</div>
				</div>
                <div class="col-12 table-responsive hide cerBodiesOutsourceBox">
                    <table class="table table-bordered mb-3">
                        <tbody class="addOutsourceActNatureCerBodiesTable">
                            <tr>
                                <th class="sub_heading text-nowrap">Outsourced Activity</th>
                                <th class="sub_heading text-nowrap">Supplier/Service provdier</th>
                                <th class="sub_heading text-nowrap">Location/Address</th>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">18.0</span> Briefly describe the security arrangements, equipment, and/or facilities established to prevent loss of or unauthorized access to examination information. [Clause 7.4.1; 7.4.2]</p>
						<p class="sub_heading_content" id="descSecurityArrangementsCerBodiesPreview"></p>
					</div>
				</div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep38" class="final-preview-section">
		<div class="information-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Information</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="information-bodies-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">19.0</span> Briefly describe the mechanisms through which information about the organization and its certification services is made available to the public; to certified clients. [Clause 7.2]</p>
						<p class="sub_heading_content" id="describeMechanismCerBodiesPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep39" class="final-preview-section">
		<div class="management-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Management System Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="management-bodies-info-edit-tab">
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
						<p class="sub_heading"><span class="tab-form-highlghtme-link">20.0</span> Indicate the management system option currently implemented within your organization [Clause 10.1] </p>
						<p class="sub_heading_content" id="managementImplementedWithOrgCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">21.0</span> Has your organization established documentation for the 
							following requirements of the ISO/IEC 17024:2012 Standard? Indicate also, where in the management system manual or other suitable 
							documentation, the related document is referenced.</p>
                        <p>General Requirements</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">1. Certification agreement 9.7.2</p>
						<p class="sub_heading_content" id="genReqCerBodiesOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesOnePreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach1-preview">
						 <%= Validator.isNotNull(certificationAgreementDocUrl) ? certificationAgreementDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">2. Risk assessment - impartiality and mitigation measures 4.3.6, 4.3.7</p>
						<p class="sub_heading_content" id="genReqCerBodiesTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesTwoPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach2-preview">
						 <%= Validator.isNotNull(impartialityMitigationMeasuresDocUrl) ? impartialityMitigationMeasuresDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">3. Confidentiality 7.3.1, 6.1.7</p>
						<p class="sub_heading_content" id="genReqCerBodiesThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesThreePreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach3-preview">
						  <%= Validator.isNotNull(confidentialityDocUrl) ? confidentialityDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">4. Security 7.4.1</p>
						<p class="sub_heading_content" id="genReqCerBodiesFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesFourPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach4-preview">
						  <%= Validator.isNotNull(securityDocUrl) ? securityDocUrl :""%>
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
						<p class="sub_heading">a. Scope of the certification scheme(s), including description of the certification process 7.2.2</p>
						<p class="sub_heading_content" id="genReqCerBodiesFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesFivePreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach5-preview">
						  <%= Validator.isNotNull(publiclyAvailableInformationDocUrl) ? publiclyAvailableInformationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">b. Valid certification and scope of that certification for examiners 7.2.1</p>
						<p class="sub_heading_content" id="genReqCerBodiesSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesSixPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach6-preview">
						  <%= Validator.isNotNull(certificationExaminersDocUrl) ? certificationExaminersDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">c. List of all pre-requisites of the certification scheme 7.2.3.</p>
						<p class="sub_heading_content" id="genReqCerBodiesSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesSevenPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach7-preview">
						  <%= Validator.isNotNull(PreRequisitesCertificationDocUrl) ? PreRequisitesCertificationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">d. Information provided by the certification body, including advertising 7.2.4.</p>
						<p class="sub_heading_content" id="genReqCerBodiesEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesEightPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach8-preview">
						  <%= Validator.isNotNull(bodyIncludingAdvertisingDocUrl) ? bodyIncludingAdvertisingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">e. Policies and procedures for handling appeals 9.8.2</p>
						<p class="sub_heading_content" id="genReqCerBodiesNinePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesNinePreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach9-preview">
						  <%= Validator.isNotNull(policiesProceduresHandlingDocUrl) ? policiesProceduresHandlingDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">f. Procedures for handling complaints 9.9.3</p>
						<p class="sub_heading_content" id="genReqCerBodiesTenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementRefCerBodiesTenPreview"></p>
						<p class="sub_heading_content" id="managementRefCerBodiesAttach10-preview">
						  <%= Validator.isNotNull(proceduresHandlingComplaintsDocUrl) ? proceduresHandlingComplaintsDocUrl :""%>
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
						<p class="sub_heading">6. Organizational structure showing duties, responsibilities and authorities of management and other certification personnel and any committees 5.1.2</p>
						<p class="sub_heading_content" id="structuralReqCerBodiesOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesOnePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesAttach1-preview">
						  <%= Validator.isNotNull(authoritiesManagementDocUrl) ? authoritiesManagementDocUrl :""%>
						</p>
					</div>
				</div>
                
                <div class="col-12">
					<div>
						<p class="sub_heading">7. Formal rules for the appointment, terms of reference and operation of any committees that are involved in the certification process 
                            6.1.1 and 6.1.4, 6.2.3.1</p>
						<p class="sub_heading_content" id="structuralReqCerBodiesTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesTwoPreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesAttach2-preview">
						  <%= Validator.isNotNull(operationCommitteesDocUrl) ? operationCommitteesDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">8. Mechanism for safeguarding impartiality 4.3.1, 5.1.1, 5.2.3</p>
						<p class="sub_heading_content" id="structuralReqCerBodiesThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesThreePreview"></p>
						<p class="sub_heading_content" id="managementStrucRefCerBodiesAttach3-preview">
						  <%= Validator.isNotNull(mechanismSafeguardingImpartialityDocUrl) ? mechanismSafeguardingImpartialityDocUrl :""%>
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
						<p class="sub_heading">9. Procedure for management of competencies of examiners involved in the certification process 6.1.3</p>
						<p class="sub_heading_content" id="resourceReqCerBodiesOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesOnePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesAttach1-preview">
						 <%= Validator.isNotNull(competenciesExaminersDocUrl) ? competenciesExaminersDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">10. Contract with examiners (sample/template) .6.1.7</p>
						<p class="sub_heading_content" id="resourceReqCerBodiesTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesTwoPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesAttach2-preview">
						  <%= Validator.isNotNull(contractExaminerSampleDocUrl) ? contractExaminerSampleDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">11. Contract with the body that provides the outsourced service (sample/template) 6.3.1</p>
						<p class="sub_heading_content" id="resourceReqCerBodiesThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesThreePreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesAttach3-preview">
						  <%= Validator.isNotNull(providesOutsourcedServiceDocUrl) ? providesOutsourcedServiceDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">12. Documented policies, procedures and records for the qualification, assessing and monitoring of all bodies that provide outsourced work 6.3.2d</p>
						<p class="sub_heading_content" id="resourceReqCerBodiesFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesFourPreview"></p>
						<p class="sub_heading_content" id="managementResourceRefCerBodiesAttach4-preview">
						   <%= Validator.isNotNull(recordsQualificationDocUrl) ? recordsQualificationDocUrl :""%>
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
						<p class="sub_heading">13. Reference to specified standards and other normative documents</p>
						<p class="sub_heading_content" id="processReqCerBodiesOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesOnePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach1-preview">
						  <%= Validator.isNotNull(otherNormativeDocumentsDocUrl) ? otherNormativeDocumentsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">14. Application form (sample/template) 7.1.1</p>
						<p class="sub_heading_content" id="processReqCerBodiesTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesTwoPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach2-preview">
						   <%= Validator.isNotNull(applicationSampleTemplateDocUrl) ? applicationSampleTemplateDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">15. Process for application review 9.1.3</p>
						<p class="sub_heading_content" id="processReqCerBodiesThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesThreePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach3-preview">
						   <%= Validator.isNotNull(processApplicationReviewDocUrl) ? processApplicationReviewDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">16. Plan for assessment process including recertification 9.2 and 9.6</p>
						<p class="sub_heading_content" id="processReqCerBodiesFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesFourPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach4-preview">
						   <%= Validator.isNotNull(processIncludingRecertificationDocUrl) ? processIncludingRecertificationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">17. Examination process (sample/template) 9.3</p>
						<p class="sub_heading_content" id="processReqCerBodiesFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesFivePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach5-preview">
						   <%= Validator.isNotNull(examinationProcessDocUrl) ? examinationProcessDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">18. Certification decision 9.4</p>
						<p class="sub_heading_content" id="processReqCerBodiesSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesSixPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach6-preview">
						   <%= Validator.isNotNull(certificationsDecisionDocUrl) ? certificationsDecisionDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">19. Certification documentation (sample/template) 9.4.7; 9.4.8</p>
						<p class="sub_heading_content" id="processReqCerBodiesSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesSevenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach7-preview">
						  <%= Validator.isNotNull(certificationDocumentationDocUrl) ? certificationDocumentationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">20. Procedure for the use of certificates, logos and marks 9.7</p>
						<p class="sub_heading_content" id="processReqCerBodiesEightPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesEightPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach8-preview">
						   <%= Validator.isNotNull(certificatesLogosMarksDocUrl) ? certificatesLogosMarksDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">21. Suspension 9.5</p>
						<p class="sub_heading_content" id="processReqCerBodiesNinePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesNinePreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach9-preview">
						  <%= Validator.isNotNull(suspensionsDocUrl) ? suspensionsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">22. Process to receive, evaluate and make decisions on appeals and complaints. 9.8.1 and 9.9.1</p>
						<p class="sub_heading_content" id="processReqCerBodiesTenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesTenPreview"></p>
						<p class="sub_heading_content" id="managementProcessRefCerBodiesAttach10-preview">
						  <%= Validator.isNotNull(decisionsAppealsComplaintsDocUrl) ? decisionsAppealsComplaintsDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row cer-bodies-option-a hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option A</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">23. General management system documentation 10.2.2</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach1-preview">
						   <%= Validator.isNotNull(generalManagementSystemDocumentationDocUrl) ? generalManagementSystemDocumentationDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">24. Control of documents 10.2.3</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqTwoPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefTwoPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach2-preview">
						   <%= Validator.isNotNull(controlDocumentsDocUrl) ? controlDocumentsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">25. Control of records 10.2.4</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqThreePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefThreePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach3-preview">
						   <%= Validator.isNotNull(controlRecordsDocUrl) ? controlRecordsDocUrl :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">26. Management review 10.2.5</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqFourPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefFourPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach2-preview">
						   <%= Validator.isNotNull(managementReviewDocUrl3) ? managementReviewDocUrl3 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">27. Internal audits 10.2.6</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqFivePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefFivePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach5-preview">
						 <%= Validator.isNotNull(internalAuditsDocUrl17024) ? internalAuditsDocUrl17024 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">28. Corrective action 10.2.7</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqSixPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefSixPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach6-preview">
						   <%= Validator.isNotNull(correctiveActionsDocUrl1) ? correctiveActionsDocUrl1 :""%>
						</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">29. Preventive action 10.2.8</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesReqSevenPreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefSevenPreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesRefAttach7-preview">
						   <%= Validator.isNotNull(preventiveActionsDocUrl1) ? preventiveActionsDocUrl :""%>
						</p>
					</div>
				</div>
            </div>
            <div class="row cer-bodies-option-b hide">
                <div class="col-12">
					<div>
                        <p>Management System Requirements Option B - ISO 9001</p>
					</div>
				</div>
                <div class="col-12">
					<div>
						<p class="sub_heading">30. Documentation in keeping with requirements of ISO 9001</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesBReqOnePreview"></p>
					</div>
					<div class="managementRef">
						<p class="sub_heading">Management/Quality Manual or Other Relevant Reference</p>
						<p class="sub_heading_content" id="managementSystemCerBodiesBRefOnePreview"></p>
						<p class="sub_heading_content" id="managementSystemCerBodiesBRefAttach1-preview">
						   <%= Validator.isNotNull(keepingRequirementsIsoDocUrl1) ? keepingRequirementsIsoDocUrl1 :""%>
						</p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>

    <section id="janaacPreviewStep40" class="final-preview-section">
		<div class="other-req-bodies-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex justify-content-start">
						<p class="heading2 mt-2">Other Requirements</p>
						<span class="ml-3"> 
								<a href="javascript:void(0)" id="other-req-bodies-info-edit-tab">
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
						<p class="sub_heading_content" id="otherFeeReqCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-12 otherFeeReqCerBodiesBox hide">
					<div>
						<p class="sub_heading"><span class="tab-form-highlghtme-link">23.0</span> State payment method</p>
						<p class="sub_heading_content" id="otherFeePayMethodCerBodiesPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Name</p>
						<p class="sub_heading_content" id="applicantRepresentativeNameCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Applicant's Representative Position</p>
						<p class="sub_heading_content" id="applicantRepresentativePositionCerBodiesPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's Representative Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantRepresentativeCerBodiesSignaturePre">
							<%if(Validator.isNotNull(CertiThreeSign)){ %>
							<img src="<%=CertiThreeSign%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="applicantRepresentativeDateCerBodiesPreview"></p>
					</div>
				</div>
            </div>
			<hr />
		</div>
	</section>
</div>