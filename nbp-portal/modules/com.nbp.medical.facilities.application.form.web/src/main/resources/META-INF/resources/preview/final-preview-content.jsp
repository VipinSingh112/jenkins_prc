<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.util.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<section id="medicalPreviewStep1" class="final-preview-section">
	<div class="applicant-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Applicant Details</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="applicantDetailsEdit">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Applicant Name</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Address</th>
							<th class="sub_heading text-nowrap">Email Address</th>
							<th class="sub_heading text-nowrap">Nationality of applicant</th>			
						</tr>
						<%if(Validator.isNotNull(applicantDetailsAdd)&&applicantDetailsAdd.size()>0){
							int applicantDetailVal=1;
	                       for(MedicalFacilitiesAppliInfo applicantDetails:applicantDetailsAdd){ %>
						<tr>
							<td class="sub_heading_content applicantName<%=applicantDetailVal%>">
							<%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getApplicantName())?applicantDetails.getApplicantName():""%></td>
							<td class="sub_heading_content applicantTelephone<%=applicantDetailVal%>">
							<%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliTelephoneNumber())?applicantDetails.getAppliTelephoneNumber():""%></td>
							<td class="sub_heading_content applicantAddress<%=applicantDetailVal%>">
							<%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliAddress())?applicantDetails.getAppliAddress():""%></td>
							<td class="sub_heading_content applicantEmailAddress<%=applicantDetailVal%>">
							<%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliEmailAddress())?applicantDetails.getAppliEmailAddress():""%></td>
							<td class="sub_heading_content applicantNationality<%=applicantDetailVal%>">
							<%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliNationality())?applicantDetails.getAppliNationality():""%></td>
						</tr>
						<input type="hidden" id="medicalFacilitiesAppliId<%=applicantDetailVal%>" name="medicalFacilitiesAppliId<%=applicantDetailVal%>" value="<%=applicantDetails.getMedicalFacilitiesAppliId()%>">
                            <%applicantDetailVal=applicantDetailVal+1;
	                      }} %>	
					</tbody>
				</table>
			</div>	
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep2" class="final-preview-section company-form">
	<div class="company-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Company Details</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="companyDetails">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addCompanyDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Full Name</th>
							<th class="sub_heading text-nowrap">Private address of person</th>
							<th class="sub_heading text-nowrap">Registered or principal office</th>
						</tr>
						<%if(Validator.isNotNull(companyDetailInfo)&&companyDetailInfo.size()>0){
							int companyDetailVal=1;
	                       for(MedicalFacilitiesComDetail companyDetails:companyDetailInfo){ %>
						<tr>
							<td class="sub_heading_content comFullName<%=companyDetailVal%>">
							  <%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getFullName())?companyDetails.getFullName():""%>
							</td>
							<td class="sub_heading_content comAddress<%=companyDetailVal%>">
							  <%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getPrivateAddress())?companyDetails.getPrivateAddress():""%>
							</td>
							<td class="sub_heading_content comOffice<%=companyDetailVal%>">
							  <%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getRegisteredOffice())?companyDetails.getRegisteredOffice():""%>
							</td>
						</tr>
						<input type="hidden" id="companyDetail<%=companyDetailVal%>" name="companyDetail<%=companyDetailVal%>" value="<%=companyDetails.getMedicalFacilitiesComDetailId()%>">
                          <%companyDetailVal=companyDetailVal+1;
	                    }} %>
					</tbody>
				</table>
			</div>	
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep3" class="final-preview-section">
	<div class="home-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Home Details</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="homeDetails">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name, style or title</p>
					<p class="sub_heading_content" id="homeCarriedNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content" id="homeAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Telephone Number</p>
					<p class="sub_heading_content" id="homeTelephonePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Email Address</p>
					<p class="sub_heading_content" id="homeEmailAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Brief description</p>
					<p class="sub_heading_content" id="homeSitutationDescriptionPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Other business</p>
					<p class="sub_heading_content" id="homeOtherBusinessPremisesPreview"></p>
				</div>
			</div>
			<!-- <div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addHomeDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name, style or title</th>
							<th class="sub_heading text-nowrap">Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Email Address</th>
							<th class="sub_heading text-nowrap">Brief description</th>
							<th class="sub_heading text-nowrap">Other business</th>
						</tr>
					</tbody>
				</table>
			</div> -->
			<div class="col-12">
				<div>
					<p>Number of patients provided for</p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Maternity</p>
					<p class="sub_heading_content" id="maternityPatientNumPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Other Patients</p>
					<p class="sub_heading_content" id="otherPatientNumPreview"></p>
				</div>
			</div>
			<!-- <div class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addPatientCountTable">
						<tr>
							<th class="sub_heading text-nowrap">Maternity</th>
							<th class="sub_heading text-nowrap">Other Patients</th>
						</tr>
					</tbody>
				</table>
			</div>	 -->
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep4" class="final-preview-section">
	<div class="nursing-staff-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Nursing Staff Details</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="nursingStaff">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addNursingStaffDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
						</tr>
						<%if(Validator.isNotNull(nursingStaffInfo) && nursingStaffInfo.size()>0){
						   int nursingStaffDetailVal=1;
	                     for(MedicalFacilitiesNurseStaff nursingStaff:nursingStaffInfo){ %>
						<tr>
							<td class="sub_heading_content nursingStaffName<%=nursingStaffDetailVal%>">
								<%=Validator.isNotNull(nursingStaff)&&Validator.isNotNull(nursingStaff.getNStaffName())?nursingStaff.getNStaffName():""%>
							</td>
							<td class="sub_heading_content nursingStaffQualifications<%=nursingStaffDetailVal%>">
								<%=Validator.isNotNull(nursingStaff)&&Validator.isNotNull(nursingStaff.getNStaffQualification())?nursingStaff.getNStaffQualification():""%>
							</td>
						</tr>
						<input type="hidden" id="nursingStaffDetail<%=nursingStaffDetailVal%>" name="nursingStaffDetail<%=nursingStaffDetailVal%>" value="<%=nursingStaff.getMedicalFacilitiesNurseStaffId()%>">
                           <%nursingStaffDetailVal=nursingStaffDetailVal+1;
			            }} %>	
					</tbody>
				</table>
			</div>	
			<div class="col-6">
				<div>
					<p class="sub_heading">Category of staff live on premises</p>
					<p class="sub_heading_content" id="nursingStaffCategoryPreview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep5" class="final-preview-section not-maternity-home hide">
	<div class="medical-practitioner-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Medical Practitioner/ Qualified Nurses Details</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="medicalPractitioner">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Is the home under the charge of a duly qualified medical practitioner or a qualified nurse, resident in the Home?</p>
					<p class="sub_heading_content" id="qualifiedNursePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content" id="medicalPractitionerNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Qualifications</p>
					<p class="sub_heading_content" id="medicalPractitionerQualificationsPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Ratio of qualified nurses</p>
					<p class="sub_heading_content" id="medicalPractitionerQualifiesNurseRatioPreview"></p>
				</div>
			</div>
			<!-- <div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addMedicalPractitionerDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
							<th class="sub_heading text-nowrap"></th>
						</tr>
					</tbody>
				</table>
			</div>	 -->
			<div class="col-6">
				<div>
					<p class="sub_heading">Is the care of the patients under the superintendence of a qualified nurse?</p>
					<p class="sub_heading_content" id="patientCareUnderSuperintencePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content" id="superintendenceNurseNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Qualifications</p>
					<p class="sub_heading_content" id="superintendenceNurseQualificationsPreview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep6" class="final-preview-section maternity-home hide">
	<div class="maternity-home-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Maternity Home</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="maternityHome">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<table class="table table-bordered mb-3">
					<tbody class="addMaternityHomeDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
							<th class="sub_heading text-nowrap">Attendant</th>
						</tr>
						<%if(Validator.isNotNull(maternityInfo) && maternityInfo.size()>0){
							int maternityHomeDetailVal=1;
	                       for(MedicalFacilitiesMaterHome maternityHome:maternityInfo){ %>
						<tr>
							<td class="sub_heading_content maternityHomeName<%=maternityHomeDetailVal%>">
							    <%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getNurseName())?maternityHome.getNurseName():""%>
						    </td>
							<td class="sub_heading_content maternityHomeQualifications<%=maternityHomeDetailVal%>">
							    <%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getNurseQualification())?maternityHome.getNurseQualification():""%>
							</td>
							<td class="sub_heading_content maternityHomeQualified<%=maternityHomeDetailVal%>">
							    <%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getOtherPerson())?maternityHome.getOtherPerson():""%>
							</td>
						</tr>
						<input type="hidden"
							id="maternityHomeDetail<%=maternityHomeDetailVal%>"
							name="maternityHomeDetail<%=maternityHomeDetailVal%>"
							value="<%=maternityHome.getMedicalFacilitiesMaterHomeId()%>">
						     <%maternityHomeDetailVal = maternityHomeDetailVal + 1;
							}}%>
					</tbody>
				</table>
			</div>	
		</div>
		<hr/>
	</div>
</section>
<section id="medicalPreviewStep7" class="final-preview-section">
	<div class="signature-info-preview">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Signature</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" class="preview-edit-button" id="signature">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p>Applicant employ in connection with the home any persons of alien nationality? If so,</p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Number</p>
					<p class="sub_heading_content" id="empConnectionNumPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Particulars</p>
					<p class="sub_heading_content" id="empConnectionParticularsPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Fees charged to Patients</p>
					<p class="sub_heading_content" id="patientFeePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content" id="applicantInterestAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="signatureDatePreview"></p>
				</div>
			</div>
			<div class="col-12">
				<p class="pt-2 common-para">Signature</p>			
				<div class="signature_texarea mb-2" id="signatureImageHolderPre">
					<%if(Validator.isNotNull(formNameDoc)){ %>
					<img src="<%=formNameDoc%>"  width="100" height="100"/>
				<%} %>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>

<section class="final-preview-section supporting-doc-preview" id="medicalPreviewStep8">
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
				<!-- <p>Optional Documents</p> -->
				<div id="notRequireDocPreview"></div>
			</div>
			<div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<!-- After save and cont -->
				<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
				<div id="additionalDocPreview"></div>
		<% 
		int counterOfDocumentsPre=1;
		String fileUrlForPreview="";
		FileEntry fileEntryForGenericPre=null;
		DLFolder supportingDocumentsParentFolderGenericPre = null;
		DLFolder supportingDocumentsSubFolderGenericPre = null;
		List<DLFileEntry> dlFileEntriesGenericPre =null;
		try{
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), medicalApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(medicalApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(medicalApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					fileUrlForPreview = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrlForPreview)? fileUrlForPreview:""%>"><%=uploadedFile.getFileName() %></a></div>
		</div>
			<%	
			counterOfDocumentsPre=counterOfDocumentsPre+1;
			}
				}else{
			%> 
				
			<%}%>
			</div>
		</div>
	</div>
</section>
<section class="final-preview-section" id="medicalPreviewStep9">
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