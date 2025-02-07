<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/ncbj-forms/attachDocument.jsp" %>
<div class="tab-content Licence_form pl-lg-4 hide iso9001CertificationForm">
<%
String numberOfHaccp="";
String numberOfHaccpUrl="";
String docConsentLic="";
String docConsentLicUrl="";
String hazardAnalysisDoc="";
String hazardAnalysisDocUrl="";
int applicantDetailVal=1;
int hazardAnalysisDetailVal=1;
int licenceListDetailVal=1;
int quotationApplicantDetailVal=1;
int sectionOneCompanyDetailVal=1;
int productServicesDetailVal=1;
int employeesNumberDetailVal=1;
int workPatternDetailVal=1;
int haccpNumberDetailVal=1;
List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsParentFolder = null;
DLFolder supportingDocumentSubFolderManagment = null;
 try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCBJ Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(ncbjApplicationId));
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<section id="ncbjPreviewStep1"
	class="final-preview-section applicant-details iso9001CertificationForm hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Site Details</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="siteDetailsEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-12 table-responsive addApplicantDetailTableBox">
			    <p>Business Detail</p>
				<table class="table table-bordered mb-3">
					<tbody class="addApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Business Address and
								Physical Location of Premises</th>
							<th class="sub_heading text-nowrap">Number and time of
								Shifts</th>
							<th class="sub_heading text-nowrap">Types of
								Products/Services</th>
							<th class="sub_heading text-nowrap">Head Office</th>
							<th class="sub_heading text-nowrap">Number of full time
								employees</th>
							<th class="sub_heading text-nowrap">Number of part time
								employees</th>
							<th class="sub_heading text-nowrap">Number of contractors</th>
							<th class="sub_heading text-nowrap">Number of contracted
								workers</th>
						</tr>
						<%if(Validator.isNotNull(businessDetail)&&businessDetail.size()>0){
	                   for(NcbjBusinessDetailAdd addBusinessDetail:businessDetail){ %>
						<tr class="applicant-row<%=applicantDetailVal%>">
	<td class="sub_heading_content applicantAddressOne<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getBusinessAddress())?addBusinessDetail.getBusinessAddress():"" %></td>
	<td class="sub_heading_content applicantShifts<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNumberAndTimeOfShift())?addBusinessDetail.getNumberAndTimeOfShift():"" %></td>
	<td class="sub_heading_content applicantProductTypes<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getTypeOfProduct())?addBusinessDetail.getTypeOfProduct():"" %></td>
	<td class="sub_heading_content headOffices<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getHeadOffices())?addBusinessDetail.getHeadOffices():"" %></td>
	<td class="sub_heading_content noOfFullTimeEmployees<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfFullTimeEmployees())?addBusinessDetail.getNoOfFullTimeEmployees():"" %></td>
	<td class="sub_heading_content noOfPartTimeEmployees<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfPartTimeEmployees())?addBusinessDetail.getNoOfPartTimeEmployees():"" %></td>
	<td class="sub_heading_content noOfContractors<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfContractors())?addBusinessDetail.getNoOfContractors():"" %></td>
	<td class="sub_heading_content noOfContractedWorkers<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfContractedWorkers())?addBusinessDetail.getNoOfContractedWorkers():"" %></td>
	
	<input type="hidden" id="applicantDetailValId<%=applicantDetailVal%>"
		name="applicantDetailValId<%=applicantDetailVal%>" value="<%=addBusinessDetail.getNcbjApplicationId()%>">
</tr>
<%applicantDetailVal=applicantDetailVal+1;
	}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
				<p>Preferred Dates for Your Certification Activities</p>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Stage 1</p>
					<p class="sub_heading_content" id="stage1Preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Stage 2</p>
					<p class="sub_heading_content" id="stage2Preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Surveillance audit</p>
					<p class="sub_heading_content" id="survAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Recertification audit</p>
					<p class="sub_heading_content" id="recerAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Pre-assessment audit</p>
					<p class="sub_heading_content" id="preAssessAudiPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Any other service (s)</p>
					<p class="sub_heading_content" id="otherServicePreview"></p>
				</div>
			</div>
		</div>
		<hr />
	</div>
</section>
<section id="ncbjPreviewStep2"
	class="final-preview-section applicant-details iso9001CertificationForm hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Organization Information</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="organizationDetailsEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Company Name</p>
					<p class="sub_heading_content" id="newCompanyNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Mailing Address</p>
					<p class="sub_heading_content" id="newMailingAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">City</p>
					<p class="sub_heading_content" id="newCityPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Postal Code</p>
					<p class="sub_heading_content" id="newPostalCodePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Country</p>
					<p class="sub_heading_content" id="newCountryPreview"></p>
				</div>
			</div>
			<!-- <div class="col-12">
				<p>Physical Address</p>
			</div> -->
			<div class="col-12">
				<div>
					<p class="sub_heading">Physical Address</p>
					<p class="sub_heading_content" id="physicalAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">City</p>
					<p class="sub_heading_content" id="physicalCityPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Postal Code</p>
					<p class="sub_heading_content" id="physicalPostalCodePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Country</p>
					<p class="sub_heading_content" id="physicalCountryPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Head of Company</p>
					<p class="sub_heading_content" id="companyHeadPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Title</p>
					<p class="sub_heading_content" id="companyTitlePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Company Contact</p>
					<p class="sub_heading_content" id="companyContactPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Title</p>
					<p class="sub_heading_content" id="companyContactTitlePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Telephone Number</p>
					<p class="sub_heading_content" id="companyTelephonePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Fax Number</p>
					<p class="sub_heading_content" id="companyFaxPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">E-mail Address</p>
					<p class="sub_heading_content" id="companyEmailPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Website</p>
					<p class="sub_heading_content" id="companyWebsitePreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Scope of Certification (Please include
						reference to design if applicable)</p>
					<p class="sub_heading_content"
						id="companyCertificationScopePreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Please list and justify any clause of
						non-applicability to the organization's scope of certification?</p>
					<p class="sub_heading_content" id="certificationScopePreview"></p>
				</div>
			</div>
			<div class="col-12 hide certificationScopeBoxPreview">
				<div>
					<p class="sub_heading">Please detail</p>
					<p class="sub_heading_content"
						id="managementAccessibleToAuditDetailPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Does your organization outsource any
						process that will affect conformity to requirements?</p>
					<p class="sub_heading_content" id="outsourceProcessPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Relevant Legal and Regulatory
						Requirements?</p>
					<p class="sub_heading_content" id="relevantRequirementPreview"></p>
				</div>
			</div>
			<div class="col-12 hide requirementListPreview">
				<div>
					<p class="sub_heading">Please list requirements</p>
					<p class="sub_heading_content" id="relevantRequirementListPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Are all areas and processes within the
						Management System accessible to the audit team?</p>
					<p class="sub_heading_content"
						id="managementAccessibleToAuditPreview"></p>
				</div>
			</div>
			<div class="col-12 hide managementAccessibleToAuditBoxPreview">
				<div>
					<p class="sub_heading">Please detail</p>
					<p class="sub_heading_content"
						id="managementAccessibleToAuditDetailPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Please list and submit key activities
						related to core processes /processes needed and their
						interactions(i.e. sequence of interaction of processes)</p>
					<p class="sub_heading_content"
						id="keyActivityPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Certification(s) Desired</p>
					<p class="sub_heading_content" id="desiredCertificationPreview"></p>
				</div>
			</div>
			<div class="col-6 hide transfer9001ReasonPreview">
				<div>
					<p class="sub_heading">Reason for transfer</p>
					<p class="sub_heading_content" id="transferReasonTwoPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Surveillance Schedule Desired</p>
					<p class="sub_heading_content" id="surveillanceSchedulePreview"></p>
				</div>
			</div>
			<div class="col-12">
			   <p>Existing management system information</p>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Does the company have a certified Management System?</p>
					<p class="sub_heading_content" id="certifiedManagementPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Indicate Standard</p>
					<p class="sub_heading_content" id="indicateStandardPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Has it been certified by an accredited Certification Body?</p>
					<p class="sub_heading_content" id="certifiedAccreditedCertificationPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name of Certification Body</p>
					<p class="sub_heading_content" id="ceritificationBodyNamePreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Has your company used any consulting services to assist in the development and/or implementation of your Management System?</p>
					<p class="sub_heading_content" id="companyUsedConsultingServicePreview"></p>
				</div>
				<div class="row hide companyUsedConsultingServiceBoxPreview">
					<div class="col-6">
						<div>
							<p class="sub_heading">Consulting Firm</p>
							<p class="sub_heading_content" id="consultingFirmPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Consultant(s) email</p>
							<p class="sub_heading_content" id="consultantPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Telephone</p>
							<p class="sub_heading_content" id="telephonePreview"></p>
						</div>
					</div>
					<!-- <div class="col-6">
						<div>
							<p class="sub_heading">Email</p>
							<p class="sub_heading_content" id="emailPreview"></p>
						</div>
					</div> -->
				</div>
			</div>
		</div>
	</div>
</section>
<section id="ncbjPreviewStep3"
	class="final-preview-section applicant-details iso9001CertificationForm hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3 additional-location hide">Section II</p>
				    <p class="heading2 mt-3 section-two-signature hide">Singnature</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="sectionSecEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row additional-location hide">
			<div class="col-6">
				<div>
					<p class="sub_heading">Sites have a contractual or legal link with central office</p>
					<p class="sub_heading_content" id="centralOfficeLinkPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Sites are subject to a common management system</p>
					<p class="sub_heading_content" id="commonManagementSystemPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Processes at the sites are substantially of the same kind</p>
					<p class="sub_heading_content" id="substantiallySameProcessPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Sites operate to similar methods and procedure</p>
					<p class="sub_heading_content" id="siteSimilarMethodPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Sites are under surveillance and internal audit by the central office</p>
					<p class="sub_heading_content" id="siteUnderAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Central office has the right to require site corrective actions</p>
					<p class="sub_heading_content" id="siteCorrectiveRightPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Central office has authority to initiate organizational changes</p>
					<p class="sub_heading_content" id="changesAuthorityPreview"></p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content" id="signatureNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Position</p>
					<p class="sub_heading_content" id="positionPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="datePreview"></p>
				</div>
			</div>
			<div class="col-md-12">
				<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(signUrl)) {
					%>
					<div class="signature_texarea mb-2"
						id="newSignaturePreview">
						<img src="<%=signUrl%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="newSignaturePreview"></div>
					<%
						}
					%>	
			</div>
		</div>
	</div>
</section>
<section id="ncbjPreviewStep4"
	class="final-preview-section quotation-details iso9001CertificationForm hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Quotation Form</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="quotationEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
		</div>
	</div>
	<div class="" id="">
		<div class="row">
			<div class="col-12">
				<div>
					<p class="heading2 mt-2"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">1. Name of organization</p>
					<p class="sub_heading_content" id="nameOfOrganizationPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">2. Address</p>
					<p class="sub_heading_content" id="addressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">3. Telephone number</p>
					<p class="sub_heading_content" id="telephoneNumberPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">4. Fax number</p>
					<p class="sub_heading_content" id="faxNumberPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">5. E-mail address</p>
					<p class="sub_heading_content" id="emailAddressPreview"></p>
					<p class="sub_heading_content suspension-consultation-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">6. Head of Organization</p>
					<p class="sub_heading_content" id="headOfOrganizationPreview"></p>
					
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">7. Position</p>
					<p class="sub_heading_content" id="positionFirstPreview"></p>
					
				</div>
			</div>
			<div class="col-12">
				<div>
				<p>8. Contact person</p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content" id="contactPersonNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Email</p>
					<p class="sub_heading_content" id="contactPersonEmailPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">9. Position</p>
					<p class="sub_heading_content" id="positionSecondPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">10. Which management system(s) has your
						organization implemented or is in the process of implementing?</p>
					<p class="sub_heading_content" id="managementSystemPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">10a. Have you determined the scope of the
						certification which you are seeking?</p>
					<p class="sub_heading_content" id="orgDeterminedTheScopePreview"></p>
				</div>
			</div>
			<div class="col-md-12 pleaseStateTheScope">
				<div>
					<p class="sub_heading">10b. Please state the scope along with a corporate brochure or relevant documents defining the nature and scope of your operations.</p>
					<p class="sub_heading operationScope"></p>
					<p><a class="sub_heading_content" id="operationScope-preview" href="<%=Validator.isNotNull(docBrochureUrl)? docBrochureUrl:""%>"><%=(Validator.isNotNull(docBrochure))?docBrochure:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
				<p class="sub_heading">11. Please indicate the size of Organization in terms of </p>
				<p>Business Detail</p>
				</div>
			</div>
			<div class="col-12 table-responsive addQuotationApplicantDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addQuotationApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Business Address and
								Physical Location of Premises</th>
							<th class="sub_heading text-nowrap">Types of
								Products/Services</th>
							<th class="sub_heading text-nowrap">Number and time of
								Shifts</th>
							<th class="sub_heading text-nowrap">Employee Numbers</th>
							<th class="sub_heading text-nowrap">Head Office</th>
							<th class="sub_heading text-nowrap">Number of full time
								employees</th>
							<th class="sub_heading text-nowrap">Number of part time
								employees</th>
							<th class="sub_heading text-nowrap">Number of contractors</th>
							<th class="sub_heading text-nowrap">Number of contracted
								workers</th>
						</tr>
						<%if(Validator.isNotNull(quotationBusinessDetail)&&quotationBusinessDetail.size()>0){
		for(NcbjBusinessDetail quotationbusiness:quotationBusinessDetail){ %>
		<tr class="quotation-applicant-row<%=quotationApplicantDetailVal%>">
	<td class="sub_heading_content quotationApplicantAddressOne<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationAddressOne())?quotationbusiness.getQuotationAddressOne():""%></td>
	<td class="sub_heading_content quotationApplicantShifts<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationApplicantShifts())?quotationbusiness.getQuotationApplicantShifts():""%></td>
	<td class="sub_heading_content quotationApplicantProductTypes<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationProductTypes())?quotationbusiness.getQuotationProductTypes():""%></td>
	<td class="sub_heading_content quotationEmpNum<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationEmpNum())?quotationbusiness.getQuotationEmpNum():""%></td>
	<td class="sub_heading_content quotationHeadOffices<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationHeadOffices())?quotationbusiness.getQuotationHeadOffices():""%></td>
	<td class="sub_heading_content quotationNoOfFullTimeEmployees<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationFullTimeEmploy())?quotationbusiness.getQuotationFullTimeEmploy():""%></td>
	<td class="sub_heading_content quotationNoOfPartTimeEmployees<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationPartTimeEmploy())?quotationbusiness.getQuotationPartTimeEmploy():""%></td>
	<td class="sub_heading_content quotationNoOfContractors<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationContractors())?quotationbusiness.getQuotationContractors():""%></td>
	<td class="sub_heading_content quotationNoOfContractedWorkers<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationContractedWorker())?quotationbusiness.getQuotationContractedWorker():""%></td>

	<input type="hidden" id="quotationApplicantDetailValId<%=quotationApplicantDetailVal%>"name="quotationApplicantDetailValId<%=quotationApplicantDetailVal%>" value="<%=quotationbusiness.getNcbjBusinessDetailId()%>">
</tr>
<%quotationApplicantDetailVal=quotationApplicantDetailVal+1;
	}} %>		
					</tbody>
				</table>
			</div>
		</div>
	</div>
</section>

</div>
<div class="tab-content Licence_form pl-lg-4 hide newForm22000">
<section id="ncbjPreviewStep6"
	class="final-preview-section newForm22000 hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Section I</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="sectionFirstEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p>Company Detail</p>
				</div>
			</div>
			<div class="col-12 additional-tab-form-single-site">
				<div class="row">
					<div class="col-12">
						<div>
							<p class="sub_heading">Company Address</p>
							<p class="sub_heading_content" id="companyNameTwoPreview"></p>
						</div>
					</div>
					<div class="col-12">
						<div>
							<p class="sub_heading">Company Address</p>
							<p class="sub_heading_content" id="companyAddressTwoPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Head of Company Name</p>
							<p class="sub_heading_content" id="sectionOneCompNamePreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Job Title</p>
							<p class="sub_heading_content" id="sectionOneCompJobTitlePreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">E-Mail Address</p>
							<p class="sub_heading_content" id="sectionOneCompEmailAddrPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Telephone Number</p>
							<p class="sub_heading_content" id="sectionOneCompTelNumPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Contact Name</p>
							<p class="sub_heading_content" id="sectOneCompContactNamePreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Job Title</p>
							<p class="sub_heading_content" id="sectOneCompJobTitlePreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">E-Mail Address</p>
							<p class="sub_heading_content" id="sectOneCompEmailPreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Telephone Number</p>
							<p class="sub_heading_content" id="sectOneCompTeleNumberPreview"></p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-12 table-responsive additional-tab-form-two">
				<table class="table table-bordered mb-3">
					<tbody class="addSectionOneCompanyDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Company Name or Head
								Office</th>
							<th class="sub_heading text-nowrap">Company Address</th>
							<th class="sub_heading text-nowrap">Head of Company Name</th>
							<th class="sub_heading text-nowrap">Job Title</th>
							<th class="sub_heading text-nowrap">E-Mail Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Contact Name</th>
							<th class="sub_heading text-nowrap">Job Title</th>
							<th class="sub_heading text-nowrap">E-Mail Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
						</tr>
						
						<%if(Validator.isNotNull(companyDetailTwo)&&companyDetailTwo.size()>0){
	for(NcbjCompanyDetailGen addCompanyTwo:companyDetailTwo){
		if(Validator.isNotNull(addCompanyTwo.getCompanyName())&&Validator.isNotNull(addCompanyTwo.getCompanyAddress())&&Validator.isNotNull(addCompanyTwo.getHeadOfCompany())&&Validator.isNotNull(addCompanyTwo.getJobTitleOne())&&Validator.isNotNull(addCompanyTwo.getCompanyEmailOne())&&Validator.isNotNull(addCompanyTwo.getCompanyNumOne())&&Validator.isNotNull(addCompanyTwo.getContactName())&&Validator.isNotNull(addCompanyTwo.getJobTitleTwo())&&Validator.isNotNull(addCompanyTwo.getCompanyEmailTwo())&&Validator.isNotNull(addCompanyTwo.getCompanyNumTwo())){%>
<tr class="section-one-company-detail-row<%=sectionOneCompanyDetailVal%>">
<td class="sub_heading_content companyNameTwo<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyName())?addCompanyTwo.getCompanyName():"" %></td>
	<td class="sub_heading_content companyAddressTwo<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyAddress())?addCompanyTwo.getCompanyAddress():"" %></td>
	<td class="sub_heading_content sectionOneCompName<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getHeadOfCompany())?addCompanyTwo.getHeadOfCompany():"" %></td>
	<td class="sub_heading_content sectionOneCompJobTitle<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getJobTitleOne())?addCompanyTwo.getJobTitleOne():"" %></td>
	<td class="sub_heading_content sectionOneCompEmailAddr<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyEmailOne())?addCompanyTwo.getCompanyEmailOne():"" %></td>
	<td class="sub_heading_content sectionOneCompTelNum<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyNumOne())?addCompanyTwo.getCompanyNumOne():"" %></td>
	<td class="sub_heading_content sectOneCompContactName<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getContactName())?addCompanyTwo.getContactName():"" %></td>
	<td class="sub_heading_content sectOneCompJobTitle<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getJobTitleTwo())?addCompanyTwo.getJobTitleTwo():"" %></td>
	<td class="sub_heading_content sectOneCompEmail<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyEmailTwo())?addCompanyTwo.getCompanyEmailTwo():"" %></td>
	<td class="sub_heading_content sectOneCompTeleNumber<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyNumTwo())?addCompanyTwo.getCompanyNumTwo():"" %></td>
	
     <input type="hidden" id="sectionOneCompanyDetailId<%=sectionOneCompanyDetailVal%>" name="sectionOneCompanyDetailId<%=sectionOneCompanyDetailVal%>" value="<%=addCompanyTwo.getNcbjApplicationId()%>">
</tr>
 <%sectionOneCompanyDetailVal=sectionOneCompanyDetailVal+1;
	}}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
				<p>Products and Services</p>
			</div>
			<div
				class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addProductServicesDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Number of product types</th>
							<th class="sub_heading text-nowrap">Please List Products</th>
							<th class="sub_heading text-nowrap">Number of Production
								Lines</th>
						</tr>
						<%if(Validator.isNotNull(productDetail)&&productDetail.size()>0){
	for(NcbjProductServiceDetail productService:productDetail){ %>
	<tr class="product-services-detail-row<%=productServicesDetailVal%>">
	<td class="sub_heading_content productType<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductType())?productService.getProductType():"" %></td>
	<td class="sub_heading_content productList<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductList())?productService.getProductList():"" %></td>
	<td class="sub_heading_content productLines<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductLines())?productService.getProductLines():"" %></td>
	
     <input type="hidden" id="productServicesDetailId<%=productServicesDetailVal%>" name="productServicesDetails<%=productServicesDetailVal%>" value="<%=productService.getNcbjApplicationId()%>">
</tr>
<%productServicesDetailVal=productServicesDetailVal+1;
	}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Draft Scope</p>
					<p class="sub_heading_content" id="transferReasonDraftPreview"></p>
					<p><a class="sub_heading_content" id="detail-operating-preview" href="<%=Validator.isNotNull(docDraftScopeUrl)? docDraftScopeUrl:""%>"><%=(Validator.isNotNull(docDraftScope))?docDraftScope:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Exclusions Are there exclusions to the
						activities to be certified compared to the activities you carry
						out in relation to food products?</p>
					<p class="sub_heading_content" id="activityExclusionPreview"></p>
					
				</div>
			</div>
			<div class="col-12 activityExclusionBoxPreview">
				<div>
					<p class="sub_heading_content" id="transferReasonActPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<p>Number of Employees</p>
			</div>
			<div
				class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addEmployeesNumberDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Head Office/Site Name</th>
							<th class="sub_heading text-nowrap">Administration/Office</th>
							<th class="sub_heading text-nowrap">Production/Processing</th>
							<th class="sub_heading text-nowrap">Maintenance/Service</th>
							<th class="sub_heading text-nowrap">Logistics</th>
							<th class="sub_heading text-nowrap">Total</th>
							<th class="sub_heading text-nowrap">Seasonal</th>
							<th class="sub_heading text-nowrap">Temporary</th>
							<th class="sub_heading text-nowrap">Subcontracted</th>
						</tr>
						
						<%if(Validator.isNotNull(numOfEmp)&&numOfEmp.size()>0){
	for(NcbjNumOfEmpAdd addNumOfEmp:numOfEmp){ %>
	<tr class="employees-number-detail-row<%=employeesNumberDetailVal%>">
	<td class="sub_heading_content headOffice<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getHeadOffice())?addNumOfEmp.getHeadOffice():"" %></td>
	<td class="sub_heading_content administrationOffice<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getAdministrationOffice())?addNumOfEmp.getAdministrationOffice():"" %></td>
	<td class="sub_heading_content productionProcessing<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getProductionProcessing())?addNumOfEmp.getProductionProcessing():"" %></td>
	<td class="sub_heading_content maintenanceService<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getMaintenanceService())?addNumOfEmp.getMaintenanceService():"" %></td>
	<td class="sub_heading_content logistics<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getLogistics())?addNumOfEmp.getLogistics():"" %></td>
	<td class="sub_heading_content total<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getTotal())?addNumOfEmp.getTotal():"" %></td>
	<td class="sub_heading_content seasonal<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getSeasonal())?addNumOfEmp.getSeasonal():"" %></td>
	<td class="sub_heading_content temporary<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getTemporary())?addNumOfEmp.getTemporary():"" %></td>
	<td class="sub_heading_content subcontracted<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getSubcontracted())?addNumOfEmp.getSubcontracted():"" %></td>
	
     <input type="hidden" id="employeesNumberDetailId<%=employeesNumberDetailVal%>" name="employeesNumberDetailId<%=employeesNumberDetailVal%>" value="<%=addNumOfEmp.getNcbjApplicationId()%>">
</tr>
<%employeesNumberDetailVal=employeesNumberDetailVal+1;
	}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
		       <p>Work Pattern</p>	
			</div>
			<div
				class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addWorkPatternDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Employees Shift</th>
						</tr>
						<%if(Validator.isNotNull(workPattern)&&workPattern.size()>0){
	for(NcbjSectionDetailAdd addWorkPattern:workPattern){
		if(Validator.isNotNull(addWorkPattern.getAddDetails())){
		%>
							<tr class="work-pattern-detail-row<%=workPatternDetailVal%>">
	<td class="sub_heading_content employeesShift<%=workPatternDetailVal%>"><%=Validator.isNotNull(addWorkPattern)&&Validator.isNotNull(addWorkPattern.getAddDetails())?addWorkPattern.getAddDetails():"" %></td>
	
     <input type="hidden" id="workPatternDetailId<%=workPatternDetailVal%>" name="workPatternDetailId<%=workPatternDetailVal%>" value="<%=addWorkPattern.getNcbjApplicationId()%>">
</tr>
<%workPatternDetailVal=workPatternDetailVal+1;
	}}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
			  <p>Premises & Location</p>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Please state the size of the production facilities</p>
					<p class="sub_heading_content" id="producitonFacilitySizePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Please state the size of any warehouse facilities on site</p>
					<p class="sub_heading_content" id="warehouseFacilitySizePreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Please state location of facilities i.e. industrial estate</p>
					<p class="sub_heading_content" id="facilitiesLocationPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">If any part of the site is sublet or under different management, please give details</p>
					<p class="sub_heading_content" id="detailForDiffManagementPreview"></p>
				</div>
			</div>
		</div>
	</div>
</section>		
<section id="ncbjPreviewStep7"
	class="final-preview-section newForm22000 hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Section II</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="sectionSecondEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">1. Incoming Materials (please list the main materials/and or ingredients)</p>
					<p class="sub_heading_content" id="transferReasonProPreview"></p>
					<p><a class="sub_heading_content" id="incomingMaterial-preview" href="<%=Validator.isNotNull(docIncomingMateUrl)? docIncomingMateUrl:""%>"><%=(Validator.isNotNull(docIncomingMate))?docIncomingMate:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">2. Product Storage - (please give details of on-site product storage including in process)</p>
					<p class="sub_heading_content" id="transferReasonStoragePreview"></p>
					<p><a class="sub_heading_content" id="productStorage-preview" href="<%=Validator.isNotNull(docProdStorageUrl)? docProdStorageUrl:""%>"><%=(Validator.isNotNull(docProdStorage))?docProdStorage:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">3. Building and Site Aspects ( Please give any significant details, e.g., Any neighbour whose activity may effect operation, etc)</p>
					<p class="sub_heading_content" id="transferReasonInvestPreview"></p>
					<p><a class="sub_heading_content" id="buildingSite-preview" href="<%=Validator.isNotNull(docBuildingAspectsUrl)? docBuildingAspectsUrl:""%>"><%=(Validator.isNotNull(docBuildingAspects))?docBuildingAspects:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">4. Waste and Discharges (Please list main wastes and effluents)</p>
					<p class="sub_heading_content" id="transferReasonWastePreview"></p>
					<p><a class="sub_heading_content" id="wasteDischarge-preview" href="<%=Validator.isNotNull(docDischargeWasteUrl)? docDischargeWasteUrl:""%>"><%=(Validator.isNotNull(docDischargeWaste))?docDischargeWaste:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">5. Transport (Please give details of transport and/or distribution etc.)</p>
					<p class="sub_heading_content" id="transferReasonTransportPreview"></p>
					<p><a class="sub_heading_content" id="transport-preview" href="<%=Validator.isNotNull(docTransportDetailUrl)? docTransportDetailUrl:""%>"><%=(Validator.isNotNull(docTransportDetail))?docTransportDetail:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">6. Sub Contracted Activities (Please detail any subcontract activities i.e.: maintenance, calibration, delivery, transport etc.)</p>
					<p class="sub_heading_content" id="transferReasonSubPreview"></p>
					<p><a class="sub_heading_content" id="contractedActivties-preview" href="<%=Validator.isNotNull(docSubContActUrl)? docSubContActUrl:""%>"><%=(Validator.isNotNull(docSubContAct))?docSubContAct:""%></a></p>
				</div>
			</div>
		</div>
	</div>
</section>
<section id="ncbjPreviewStep8"
	class="final-preview-section newForm22000 hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Section III</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="sectionThirdEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-md-12">
				<div>
					<p class="sub_heading">Activities and Processes on site</p>
					<p class="sub_heading_content" id="processActivityDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="processActivity-preview" href="<%=Validator.isNotNull(docProcessActivitiesUrl)? docProcessActivitiesUrl:""%>"><%=(Validator.isNotNull(docProcessActivities))?docProcessActivities:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Please list here (or attach) information relating to all site activities including number of personnel involved and the extent of activity</p>
					<p class="sub_heading_content" id="transferReasonListPreview"></p>
					<p><a class="sub_heading_content" id="siteActivity-preview" href="<%=Validator.isNotNull(siteActivitiesDocUrl)? siteActivitiesDocUrl:""%>"><%=(Validator.isNotNull(siteActivitiesDoc))?siteActivitiesDoc:""%></a></p>
				</div>
			</div>
			<div class="col-md-12">
				<div>
					<p class="sub_heading">1. Incoming materials</p>
					<p class="sub_heading_content" id="incomingMaterialsDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="incomingMaterials-preview" href="<%=Validator.isNotNull(incoMatDocUrl)? incoMatDocUrl:""%>"><%=(Validator.isNotNull(incoMatDoc))?incoMatDoc:""%></a></p>
				</div>
			</div>
			<div class="col-md-12">
				<div>
					<p class="sub_heading">2. Processes</p>
					<p class="sub_heading_content" id="processesDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="processes-preview" href="<%=Validator.isNotNull(processDocumentUrl)? processDocumentUrl:""%>"><%=(Validator.isNotNull(processDocument))?processDocument:""%></a></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">3. Specific Activities</p>
					<p class="sub_heading_content" id="specificActivityPreview"></p>
				</div>
			</div>
			<div class="col-6 hide specificActivityInfoPreview">
				<div>
					<p class="sub_heading">Please state the number</p>
					<p class="sub_heading_content" id="specificActivityNumber1Preview"></p>
				</div>
			</div>
			<div class="col-6 hide specificActivityInfoPreview">
				<div>
					<p class="sub_heading">Please state the number</p>
					<p class="sub_heading_content" id="specificActivityNumber2Preview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Please explain if needed</p>
					<p class="sub_heading_content" id="quantity1Preview"></p>
				</div>
			</div>
			<div class="col-md-12">
				<div>
					<p class="sub_heading">List of sub contracted activities</p>
					<p><a class="sub_heading_content" id="subContractedActivity-preview" href="<%=Validator.isNotNull(docSubContractListUrl)? docSubContractListUrl:""%>"><%=(Validator.isNotNull(docSubContractList))?docSubContractList:""%></a></p>
					
				</div>
			</div>
			<div class="col-12">
			   <p>5. Number and type of HACCP study</p>
			</div>
			<div
				class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addHaccpNumberDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Number of HACCP study</th>
							<th class="sub_heading text-nowrap">Type of HACCP study</th>
							<th class="sub_heading text-nowrap">Attach File Details</th>
						</tr>
							<%
	
	 if(Validator.isNotNull(haccpNum)&&haccpNum.size()>0){
			for(NcbjSectionDetailAdd addHaccp:haccpNum){ 
				if(Validator.isNotNull(addHaccp.getAddNumHaccp())){
		FileEntry attachDocFE1=null;
		numberOfHaccp="";      
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Number of HACCP study"+haccpNumberDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				numberOfHaccp=attachDocFE1.getFileName();
				numberOfHaccpUrl=DLURLHelperUtil.getDownloadURL(attachDocFE1,
						attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>
	<tr class="haccp-number-detail-row<%=haccpNumberDetailVal%>">
	<td class="sub_heading_content haccpNumber<%=haccpNumberDetailVal%>"><%=Validator.isNotNull(addHaccp)&&Validator.isNotNull(addHaccp.getAddNumHaccp())?addHaccp.getAddNumHaccp():"" %></td>
	<td class="sub_heading_content haccpType<%=haccpNumberDetailVal%>"><%=Validator.isNotNull(addHaccp)&&Validator.isNotNull(addHaccp.getAddTypeHaccp())?addHaccp.getAddTypeHaccp():"" %></td>
	<td class="sub_heading_content">
		<div id="haccpStudyNumber<%=haccpNumberDetailVal%>">
			<a class="file-info sub_heading_content haccpStudyNumber<%=haccpNumberDetailVal%>" href="<%=Validator.isNotNull(numberOfHaccpUrl)? numberOfHaccpUrl:""%>"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></a>
		</div>
	</td>    
</tr>
 <input type="hidden" id="haccpNumberDetailId<%=haccpNumberDetailVal%>" name="haccpNumberDetailId<%=haccpNumberDetailVal%>" value="<%=addHaccp.getNcbjApplicationId()%>">
<%haccpNumberDetailVal=haccpNumberDetailVal+1;
	}}} %>
				
					</tbody>
				</table>
			</div>
			<div class="col-12">
			   <p>6. Hazard analysis and critical control point aspects (ccp's ) & prerequisite programme (prp's)</p>
			</div>
			<div
				class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addHazardAnalysisDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Hazard analysis and
								critical control point aspects (ccp's ) &amp; prerequisite
								programme (prp's)</th>
							 <th class="sub_heading text-nowrap">Attach File Details</th>	
						</tr>
								<%
	
		if(Validator.isNotNull(hazardAnalysis)&&hazardAnalysis.size()>0){
			for(NcbjSectionDetailAdd addHazard:hazardAnalysis){
				if(Validator.isNotNull(addHazard.getAddHazard())){
		FileEntry attachDocFE1=null;
		hazardAnalysisDoc="";      
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Hazard Analysis"+hazardAnalysisDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				hazardAnalysisDocUrl=attachDocFE1.getFileName();
				hazardAnalysisDoc=DLURLHelperUtil.getDownloadURL(attachDocFE1,
						attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>
	<tr class="hazard-analysis-detail-row<%=hazardAnalysisDetailVal%>">
	<td class="sub_heading_content hazardAnalysis<%=hazardAnalysisDetailVal%>"><%=Validator.isNotNull(addHazard)&&Validator.isNotNull(addHazard.getAddHazard())?addHazard.getAddHazard():"" %></td>
	<td class="sub_heading_content">
		<div id="hazardControlPoint<%=hazardAnalysisDetailVal%>">
			<a class="file-info sub_heading_content hazardControlPoint<%=hazardAnalysisDetailVal%>"href="<%=Validator.isNotNull(hazardAnalysisDoc)? hazardAnalysisDoc:""%>"><%=(Validator.isNotNull(hazardAnalysisDocUrl))?hazardAnalysisDocUrl:""%></a>
		</div>
	</td>
</tr>
<input type="hidden" id="hazardAnalysisDetailId<%=hazardAnalysisDetailVal%>" name="hazardAnalysisDetailId<%=hazardAnalysisDetailVal%>" value="<%=addHazard.getNcbjApplicationId()%>">
<%hazardAnalysisDetailVal=hazardAnalysisDetailVal+1;
	}}} %>
					</tbody>
				</table>
			</div>
			<div class="col-12">
			   <p>7. Consents, licences, permits, authorisations, agreements, codes of practice, etc</p>
			</div>
			<div
				class="col-12 table-responsive hide addLicenceListDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addLicenceListDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Consents, licences,
								permits, authorisations, agreements, codes of practice, etc.
								(please list)</th>
							 <th class="sub_heading text-nowrap">Attach File Details</th>	
							 	<%
	
	 if(Validator.isNotNull(consentList)&&consentList.size()>0){
			for(NcbjSectionDetailAdd addConsentList:consentList){
				if(Validator.isNotNull(addConsentList.getAddConsentLic())){
		FileEntry attachDocFE1=null;
		docConsentLic="";      
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Consents Licences"+licenceListDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				docConsentLicUrl=attachDocFE1.getFileName();
 				docConsentLic=DLURLHelperUtil.getDownloadURL(attachDocFE1,
						attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>			
	<tr class="licence-list-detail-row<%=licenceListDetailVal%>">
	<td class="sub_heading_content text-nowrap consentsList<%=licenceListDetailVal%>"><%=Validator.isNotNull(addConsentList)&&Validator.isNotNull(addConsentList.getAddConsentLic())?addConsentList.getAddConsentLic():"" %></td>
	<td class="sub_heading_content">
		<div id="consentsListUpload<%=licenceListDetailVal%>">
			<a class="file-info sub_heading_content consentsListUpload<%=licenceListDetailVal%>" href="<%=Validator.isNotNull(docConsentLic)? docConsentLic:""%>"><%=(Validator.isNotNull(docConsentLicUrl))?docConsentLicUrl:""%></a>
		</div>
	</td>
</tr>
<input type="hidden" id="licenceListDetailId<%=licenceListDetailVal%>" name="licenceListDetailId<%=licenceListDetailVal%>" value="<%=addConsentList.getNcbjApplicationId()%>">
<%licenceListDetailVal=licenceListDetailVal+1;
	}}}%>
							 
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">ISO 22000 / FSSC 22000 Categories (C- Food Manufacturing, CI- CIV: Subcategories)</p>
					<p class="sub_heading_content" id="iso22000CatePreview"></p>
				</div>
			</div>
		</div>
	</div>
</section>				
<section id="ncbjPreviewStep9"
	class="final-preview-section newForm22000 hide">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex align-items-center">
					<p class="heading2 mt-3">Section IV</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="sectionFourthEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
                                <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247"></path> 
                               </svg>
					</a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Has your company used any consulting
						services to assist in the development and/or implementation of
						your Management System?</p>
					<p class="sub_heading_content" id="companyUsedFourPreview"></p>
				</div>
				<div class="row hide companyUsedFourBoxPreview">
					<div class="col-6">
						<div>
							<p class="sub_heading">Consulting Firm Telephone</p>
							<p class="sub_heading_content" id="sfConsultingFirmTelephonePreview"></p>
						</div>
					</div>
					<div class="col-6">
						<div>
							<p class="sub_heading">Consultant(s) Email</p>
							<p class="sub_heading_content" id="sfConsultingEmailPreview"></p>
						</div>
					</div>
				</div>
			</div>
			<div class="col-12">
				<p>Preferred Dates for Your Certification Activities</p>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Stage 1</p>
					<p class="sub_heading_content" id="sfStage1Preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Stage 2</p>
					<p class="sub_heading_content" id="sfStage2Preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Surveillance audit</p>
					<p class="sub_heading_content" id="sfSurveillanceAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Recertification audit</p>
					<p class="sub_heading_content" id="sfRecertificationAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Pre-assessment audit</p>
					<p class="sub_heading_content" id="sfPreAssessmentAuditPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Any other service (s)</p>
					<p class="sub_heading_content" id="sfOtherServicesPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content" id="sfNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Position</p>
					<p class="sub_heading_content" id="sfPositionPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="sfDatePreview"></p>
				</div>
			</div>
			<div class="col-md-12">
				<p class="pt-2 common-para">Signature</p>
			
					<%
						if (Validator.isNotNull(serviceSignUrl)) {
					%>
					<div class="signature_texarea mb-2"
					id="sectionFourSignatureImageHolderPreview">
						<img src="<%=serviceSignUrl%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
					id="sectionFourSignatureImageHolderPreview"></div>
					<%
						}
					%>
			</div>

		</div>
	</div>
</section>						

<section id="ncbjPreviewStep10"
	class="final-preview-section newForm22000">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex justify-content-start">
					<p class="heading2 mt-2 miicProcessTypeFormTab">Quotation Form</p>
					<span class="ml-3"> <a href="javascript:void(0)"
						id="quotationCertificateEdit" class="preview-edit-button"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg">
							<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
							</svg>
					</a>
					</span>
				</div>
			</div>
		</div>
	</div>
	<div class="" id="">
		<div class="row">
			<div class="col-6">
				<div>
					<p class="sub_heading">1. Name of organization:</p>
					<p class="sub_heading_content" id="nameOfOrganizationFoPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">2. Address</p>
					<p class="sub_heading_content" id="addressFoPreview"></p>
					<p class="sub_heading_content suspension-of-rate-preview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">3. Telephone number</p>
					<p class="sub_heading_content" id="telephoneNumberFoPreview"></p>
					<p
						class="sub_heading_content suspension-evidence-inability-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">4. Fax number</p>
					<p class="sub_heading_content" id="faxNumberFoPreview"></p>
					<p class="sub_heading_content suspension-consultation-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">5. E-mail address</p>
					<p class="sub_heading_content" id="emailAddressFoPreview"></p>
					<p class="sub_heading_content suspension-consultation-preview"></p>
				</div>
			</div>
			<!-- <div class="col-6">
				<div>
					<p class="sub_heading">Position</p>
					<p class="sub_heading_content" id="positionFirstFoPreview"></p>
				</div>
			</div> -->
			<div class="col-6">
				<div>
					<p class="sub_heading">6. Contact person</p>
					<p class="sub_heading_content" id="contactPersonNameFoPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">7. Position</p>
					<p class="sub_heading_content" id="positionSecondFoPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">8. Which management system(s) has your
						organization implemented or is in the process of implementing?</p>
					<p class="sub_heading_content" id="managementSystemFoPreview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">9a. Have you determined the scope of the
						certification which you are seeking?</p>
					<p class="sub_heading_content" id="orgDeterminedTheScopeFoPreview"></p>
				</div>
			</div>
			<div class="col-md-12 hide pleaseStateTheScopeFo">
				<div>
					<p class="sub_heading">9b. Please state the scope along with a corporate brochure or relevant
					documents defining the nature and scope of your operations.</p>
					<p><a class="sub_heading_content" id="operationScopeBroch-preview" href="<%=Validator.isNotNull(operationScopeUrl)? operationScopeUrl:""%>"><%=(Validator.isNotNull(operationScope))?operationScope:""%></a></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">10. Number of product types</p>
					<p class="sub_heading_content" id="productTypesPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">11. Number of product lines</p>
					<p class="sub_heading_content" id="productLinePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">12. Number of HACCP Studies</p>
					<p class="sub_heading_content" id="haccpStudiesPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">13. Number of critical control points</p>
					<p class="sub_heading_content" id="criticalControlPointsPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">14. Number of operational prerequisites programmes</p>
					<p class="sub_heading_content" id="operationalNumberPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">15. Size of the production facilities (in sq metres)</p>
					<p class="sub_heading_content" id="productionSizePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">16. Size of any warehouse facilities on site (in sq metres)</p>
					<p class="sub_heading_content" id="warehouseSizePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">17. Please Detail the processes/activities involved in manufacture/service?</p>
					<p class="sub_heading_content" id="warehouseDetailSizePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">18. Is your process seasonal</p>
					<p class="sub_heading_content" id="seasonalProcessPreview"></p>
				</div>
			</div>
		</div>
	</div>
</section>

</div>
<div class="tab-content Licence_form pl-lg-4">
<!-- end product and services  -->
<section class="final-preview-section supporting-doc-preview" id="ncbjPreviewStep11">
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
					<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
					<div id="additionalDocPreview"></div>
				</div>
			</div>
		</div>
	</section>
</div>