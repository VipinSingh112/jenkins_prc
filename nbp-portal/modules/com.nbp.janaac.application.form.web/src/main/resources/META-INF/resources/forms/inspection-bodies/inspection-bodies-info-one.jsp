<%@ include file="../../init.jsp" %>
<!-- Application Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep47">
	<div class="tab-form">
		<div class="laboratories-medical-details-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Application Information</p>
					<p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of Applicant (Legal entity or parent organization name)*</p>
						<input type="text" class="form-control" id="applicantNameInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfApplicant())?labMedicalAppliInfo.getNameOfApplicant():""%>" placeholder="Applicant Name" />
						<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameInsBodiesValidation" style="color: red;">Enter a Name of Applicant</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Applicant's Address</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddressInsBodies" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getApplicantAddress())?labMedicalAppliInfo.getApplicantAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">3.</span>Contact Information</p> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Telephone No.</p> 
					 <input type="text" class="form-control" id="applicantTelephoneInsBodies" placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliTelephoneNo())?labMedicalAppliInfo.getAppliTelephoneNo():""%>"
					  oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Fax No.</p> 
					 <input type="text" class="form-control" id="applicantFaxInsBodies" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliFaxNo())?labMedicalAppliInfo.getAppliFaxNo():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Website</p> 
					 <input type="text" class="form-control" id="applicantWebsiteInsBodies" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliWebsite())?labMedicalAppliInfo.getAppliWebsite():""%>"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Name of Inspection Body Seeking Accreditation (If different from Name of Applicant)</p>
						<input type="text" class="form-control" id="certificationNameInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryName())?labMedicalAppliInfo.getLaboratoryName():""%>" placeholder=""  aria-describedby="cerBodiesName"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Address of Inspection Body Seeking Accreditation (If different from Applicant's Address)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="insBodiesCertAddress" placeholder="Address" 
						style="border-radius: 5px; width: 100%" aria-describedby="insBodiesAddress"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryAddress())?labMedicalAppliInfo.getLaboratoryAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Name & Email Address of Person in Charge of Inspection Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelNameInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfIncharge())?labMedicalAppliInfo.getNameOfIncharge():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelEmailInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getEmailOfIncharge())?labMedicalAppliInfo.getEmailOfIncharge():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<input id="personResponsibleInsBodiesVal" type="hidden" name="personResponsibleInsBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="personResponsibleInsBodiesDetailBox">
							<div class="accordion__header is-active"
								id="personResponsibleInsBodiesDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>7.  Name & Email Address of Person Responsible for Technical Management</h2>
											<p class="tab-form-sub-heading">If there is more than one such person, please add relevant contact information as appendices</p>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Name</p>
											<input type="text" class="form-control"
												id="technicalPersonNameInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Email</p>
											<input type="text" class="form-control"
												id="technicalPersonEmailInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addPersonResponsibleInsBodiesDetail" onclick="addPersonResponsibleInsBodiesDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addPersonResponsibleDetailInsBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailInsBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="personResponsibleInsBodiesEditTab" onclick="personResponsibleInsBodiesEditTab('<%=inspApplicationInfoAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="personResponsibleInsBodiesDeleteDataTab" onclick="personResponsibleInsBodiesDeleteData('<%=inspApplicationInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Name & Email Address of Contact Person</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonNameInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMName())?labMedicalAppliInfo.getPersonnelQMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonEmailInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMEmail())?labMedicalAppliInfo.getPersonnelQMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Name & Email Address of Financial Manager of Inspection Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerNameInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMName())?labMedicalAppliInfo.getPersonnelFMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerEmailInsBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMEmail())?labMedicalAppliInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Please select the Appropriate Accreditation Request</p>
						<div class="wizard-form-radio d-block">
							<input value="1st Accreditation" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("1st Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestInsBodies">
							<label for="accreditationRequestCerBodies">1st Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Extension of Scope" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("Extension of Scope")? "checked":StringPool.BLANK%> name="accreditationRequestInsBodies">
							<label for="accreditationRequestCerBodies">Extension of Scope</label>
						</div>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-main-heading">We hereby apply for accreditation for the inspection activity detailed in the attached documents.</p> 
					<p class="tab-form-main-heading">On the granting of accreditation, we agree:</p> 
					<ul class="list-group tab-form-sub-heading"> 
						<li class="list-group-item">I. To abide by the requirements stated in ISO/IEC 17020:2012</li> 
						<li class="list-group-item">II. To abide by all the statutory requirements of the field of inspection for which accreditation is sought</li> 
						<li class="list-group-item">III. To abide by the requirements of JANAAC's accreditation programme</li> 
						<li class="list-group-item">IV. To pay the required annual accreditation fees</li> 
						<li class="list-group-item">V. That accreditation may be withdrawn, suspended or reduced if we fail to comply with the foregoing,
						 subject only to the rights set out in the relevant standard.</li>
					</ul> 
					<p class="tab-form-main-heading mt-3">
						<b>We acknowledge the fact that the application fee (paid for the initial assessment) is non-refundable.</b>
					</p>
                </div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Name of Authorized Personnel*</p>
						<input type="text" class="form-control" id="authorizedPersonnelInsBodiesName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelName())?labMedicalAppliInfo.getAuthorizedPersonnelName():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Position</p>
						<input type="text" class="form-control" id="authorizedPersonnelInsBodiesPosition" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPosition())?labMedicalAppliInfo.getAuthorizedPosition():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="authorizedPersonnelInsBodiesDate" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(labMedicalAppliInfo.getAuthorizedPersonnelDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para"><span class="tab-form-highlghtme-link pr-2">12.</span>Signature of Authorized Personnel</p>
					<%
						if (Validator.isNotNull(fileUrlOfAuthorizedPersonnel)) {
					%>
				<div class="signature_texarea mb-2" id="authorizedPersonnelInsBodiesImageHolder">
						<img src="<%=fileUrlOfAuthorizedPersonnel%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="authorizedPersonnelInsBodiesImageHolder"></div>
					<%
						}
					%>
					<input type="file" id="authorizedPersonnelInsBodiesBtn" hidden="" name="<portlet:namespace/>authorizedPersonnelInsBodiesBtn">
					<label for="authorizedPersonnelInsBodiesBtn" class="choose-sign-btn">
						<span class="mr-2"> <svg width="14" height="17"
								viewBox="0 0 14 17" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
								<path
									d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
									fill="#ffffff"></path> 
							</svg>
					</span> Upload Signature
					</label>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal/ Company Stamp</p>
						<%
						if (Validator.isNotNull(fileUrlOfCompanyStamp)) {
					%>
					<div class="signature_texarea mb-2" id="companyStampInsBodiesImageHolder">
						<img src="<%=fileUrlOfCompanyStamp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="companyStampInsBodiesImageHolder"></div>
					<%
						}
					%>
					
					<input type="file" id="companyStampInsBodiesBtn" hidden="" name="<portlet:namespace/>companyStampInsBodiesBtn">
					<label for="companyStampInsBodiesBtn" class="choose-sign-btn">
						<span class="mr-2"> <svg width="14" height="17"
								viewBox="0 0 14 17" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
								<path
									d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
									fill="#ffffff"></path> 
							</svg>
					</span> Upload Signature
					</label>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading mt-3">
						<b>
							Except for information that the applicant makes publicly available, or when agreed in writing between JANAAC and the applicant, 
							all other information obtained during the accreditation process will be considered proprietary and shall be regarded as confidential. 
							If JANAAC is required by law or authorized by contractual arrangements to release confidential information, the applicant will, 
							unless prohibited by law, be notified of the information to be provided. 
						</b>
					</p>
					<p class="tab-form-main-heading">
						<b>
							If, at any point during the application or initial assessment process, there is evidence of fraudulent behaviour, or if the applicant 
							intentionally provides false information or conceals information, JANAAC shall reject the application or terminate the assessment process.
						</b>
					</p>
				</div>
			</div>
		</div>
		</div>
		<button type="button" id="saveName" onclick="accInsBodiesApplicationInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep48">
	<div class="tab-form">
		<div class="general-instruction-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">I. General Instructions</p>
					<!-- <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">1. Applicants should review the relevant requirements (please see the General Criteria for Conformity Assessment
						 Body Accreditation-JANAAC/DOC33 on the JANAAC website or in your information package), statutory and other regulations and standards 
						 that pertain to their facilities and field of inspection and the accreditation being sought. They should also ensure that these are 
						 understood and fulfilled to the best of the applicant's ability, before submitting the completed Application Form and Questionnaire 
						 for the Accreditation of Inspection Bodies.</li> 
						<li class="list-group-item">2. Responses to each question and attached listings must be clear and concise.</li> 
						<li class="list-group-item">3. Material deemed to provide necessary additional information, e.g. promotional material, annual reports, etc.
						 can be submitted, but must be clearly titled as appendices and referenced to specific questions on this application 
						 form and questionnaire.</li> 
						<li class="list-group-item">4. Any question or item on this application form and questionnaire that is deemed to be "not applicable"
						 to the applicant's facility should be indicated as such.</li> 
					</ul> 
                     	</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Required Documentation</p>
					<p class="tab-form-title-subtitle f2">Please attach the following:</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">1. Proof of legal status of the inspection body (CLAUSE 5.1)</li> 
						<li class="list-group-item">2. A copy of approved plans (if premises are owned by the inspection body) or lease/rental contract 
						for the inspection body (if applicable) (CLAUSE 6.2.1)</li> 
						<li class="list-group-item">3. The layout of the inspection body indicating equipment placement (if applicable)</li> 
						<li class="list-group-item">4. An authorized copy of the management system manual (including organizational structure and documentation
						 (e.g. job descriptions) for all positions in the organizational structure). (CLAUSE 8.2.1, 5.2.7); i.e.:
						 	<ul class="list-group list-group-flush">
								<li class="list-group-item">a) Quality manual</li>
								<li class="list-group-item">b) Procedures manual (management, resource and process requirements procedures)</li>
							</ul>
						</li> 
						<li class="list-group-item">5. A copy of each inspection method/procedure (and reference method(s) if applicable) for which 
						accreditation is being sought as well as copies of the relevant regulation(s), standard(s) or other documentation, as is permissible.</li>
						<li class="list-group-item">6. Copies of certificates of qualification of the head and deputy head of the inspection body as well as 
						any other person(s) with signatory authority (include specimen signatures).</li>
						<li class="list-group-item">7. Evidence of adequate provisions to cover liabilities arising from its operations, e.g., insurance 
						(CLAUSE 5.1.4)</li>
					</ul> 
                     	</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="applicantInfo();"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep49">
	<div class="tab-form">
		<div class="laboratories-medical-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title-subtitle f2">Answer all questions in the spaces provided. Please ensure that each sheet is signed by the 
					organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p>
					<p class="tab-form-title f2">I. The Organization</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.0</span> Is the inspection body a legal entity or a 
						defined part of a legal entity? (CLAUSE 5.1.1)</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio" <%=insBodiesOrganization!=null &&insBodiesOrganization.getInsLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="insBodiesLegalEntity">
							<label for="insBodiesLegalEntity">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=insBodiesOrganization!=null &&insBodiesOrganization.getInsLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="insBodiesLegalEntity">
							<label for="insBodiesLegalEntity">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 legalStatusDescribeInsBodies hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Define the legal status</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="insBodiesLegalStatusEntity" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsLegalStatusEntity())?insBodiesOrganization.getInsLegalStatusEntity():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.0</span> Is the inspection body a part of an organization 
						that performs activities other than inspection?(CLAUSE 5.1.2)</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=insBodiesOrganization!=null &&insBodiesOrganization.getInsBodyOrgPart().equals("Yes")? "checked":StringPool.BLANK%> name="insBodyOrgPart">
							<label for="insBodyOrgPart">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio" <%=insBodiesOrganization!=null &&insBodiesOrganization.getInsBodyOrgPart().equals("No")? "checked":StringPool.BLANK%>name="insBodyOrgPart">
							<label for="insBodyOrgPart">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 insBodyOrgPartBoxs hide">
					<div class="row">
						<div class="col-md-12">
							<input id="inspectionPersonnelDetailsVal" type="hidden" name="inspectionPersonnelDetailsVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="inspectionPersonnelDetailsBox">
									<div class="accordion__header is-active"
										id="inspectionPersonnelDetails" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2><span class="">3.0</span> State the Names and Position of the key personnel of the organization that have responsibility for, involvement in or influence on inspection activities (CLAUSE 5.2.4)</h2>
												</div>
											</div>
										</div>
										<div>
											<p class="accordian-employee mb-0 common-para"></p>
										</div>
									</div>
									<div class="accordion__body is-active">
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Name</p>
													<input type="text" class="form-control" id="orgPersonnelNameInsBodies"
														value="" placeholder="Name">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Position</p>
													<input type="text" class="form-control" id="orgPersonnelPositionInsBodies"
														value="" placeholder="Position">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee" id="addInspectionPersonnelDetails" onclick="addInspectionPersonnelDetails();"> 
													<span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-12 table-responsive hide addInspectionPersonnelDetailsTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addInspectionPersonnelDetailsTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Position</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="inspectionPersonnelEditTab" onclick="inspectionPersonnelEditTab('<%=organFirstAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="inspectionPersonnelDeleteDataTab" onclick="inspectionPersonnelDeleteData('<%=organFirstAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.0</span> Indicate size of staff</p>
						<input type="text" class="form-control" id="staffSizeInsBodies" placeholder="" value="<%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsStaffSize())?insBodiesOrganization.getInsStaffSize():""%>" name="staffSize"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<!-- <p class="tab-form-main-heading mb-0" for="indiv-mailingAddress">
							Mailing Address</p> -->
						<div class="checkbox-form-group">
							<input type="checkbox" name="staffComplement" id="staffComplement" <%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsStaffComplement())&&insBodiesOrganization.getInsStaffComplement().contains("Yes")?"checked":""%> value="Yes"/> <label
								for="staffComplement">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.1</span> If staff complement is one (1) 
								check this box</p>
							</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.0</span> State the name of the staff member for each position on the 
					inspection body's organizational chart, indicating the title of their respective jobs and their major responsibilities in the table 
					below. Ensure that information is provided for individuals responsible for the following functions (CLAUSE 5.2.5, 5.2.7)</p>
					<ul class="list-group tab-form-sub-heading mb-3">
						<li class="list-group-item">(a) Approval of the organizational structure</li>
						<li class="list-group-item">(b) Maintenance of current job description documentation</li>
						<li class="list-group-item">(c) Supervision of technical staff (including trainees)</li>
						<li class="list-group-item">(d) The inspection body's management system.</li>
					</ul>
				</div>
				<div class="col-md-12">
					<input id="staffDetailInsBodiesVal" type="hidden" name="staffDetailInsBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailInsBodiesBox">
							<div class="accordion__header is-active"
								id="staffDetailInsBodies" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>Staff Details</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Name of Staff</p>
											<input type="text" class="form-control"
												id="staffNameInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<input type="text" class="form-control"
												id="majorResponsibilitiesInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Indicate (X) Inspector involved in requested scope of accreditation</p>
											<input type="text" class="form-control"
												id="specificFunctionInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetailInsBodies" onclick="addStaffDetailInsBodies();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addStaffDetailInsBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addStaffDetailInsBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name of Staff</th>
								<th class="sub_heading text-nowrap">Job Title</th>
								<th class="sub_heading text-nowrap">Major Responsibilities</th>
								<th class="sub_heading text-nowrap">Indicate (X) Inspector involved in requested scope of accreditation</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailInsBodiesEditTab" onclick="staffDetailInsBodiesEditTab('<%=orgInfoSecAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailInsBodiesDeleteDataTab" onclick="staffDetailInsBodiesDeleteData('<%=orgInfoSecAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				
				<div class="col-md-12">
					<input id="accreditationSoughtScopeVal" type="hidden" name="accreditationSoughtScopeVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="accreditationSoughtScopeBox">
							<div class="accordion__header is-active"
								id="accreditationSoughtScope" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>6.0 Clearly define the scope for which accreditation is being sought (including limits of capability 
											where applicable)</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Inspection Activity</p>
											<input type="text" class="form-control"
												id="activityInsBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">State the type of inspection that your organization performs, e.g. motor vehicle 
											inspection</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Field of Inspection</p>
											<input type="text" class="form-control"
												id="fieldInsBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">State the relevant field of inspection, e.g. mechanical</p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Type and Range of Inspection</p>
											<input type="text" class="form-control"
												id="rangeInsBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">State aspect of inspection performed, e.g. general inspection for roadworthiness</p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Methods and Procedures</p>
											<textarea rows="3" id="proceduresInsBodies"
												class="form-control" maxlength="255"
												placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
											<p class="tab-form-sub-heading">Example of procedure used: Procedure for inspection of motor vehicles: P15 
											(submit copy of procedure)</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Equipment</p>
											<input type="text" class="form-control"
												id="equipmentInsBodies" value="" placeholder="">
											<p class="tab-form-sub-heading">(where appropriate)</p>
											<p class="tab-form-sub-heading">Example of equipment: tyre pressure gauge</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Limits of Capability</p>
											<input type="text" class="form-control"
												id="capabilityLimitInsBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addAccreditationSoughtScope" onclick="addAccreditationSoughtScope();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addAccreditationSoughtScopeTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addAccreditationSoughtScopeTable">
							<tr>
								<th class="sub_heading text-nowrap">Inspection Activity</th>
								<th class="sub_heading text-nowrap">Field of Inspection</th>
								<th class="sub_heading text-nowrap">Type and Range of Inspection</th>
								<th class="sub_heading text-nowrap">Methods and Procedures</th>
								<th class="sub_heading text-nowrap">Equipment</th>
								<th class="sub_heading text-nowrap">Limits of Capability</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="accreditationSoughtScopeEditTab" onclick="accreditationSoughtScopeEditTab('<%=orgInfoThirdAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="accreditationSoughtScopeDeleteDataTab" onclick="accreditationSoughtScopeDeleteData('<%=orgInfoThirdAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.0</span> What is the major source of income for the inspection body (i.e. service fees, corporate 
						funding, government grants, other - please specify) (CLAUSE 4.1.3)?</p>
						<input type="text" class="form-control"
							id="insBodiesIncomeSource" value="<%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsIncomeSource())?insBodiesOrganization.getInsIncomeSource():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.0</span> What type of inspection body is your organization, 
						as defined by ISO/IEC 17020:2012 (CLAUSE 4.1.6)?</p>
						<div class="wizard-form-radio d-block">
							<input value="Type A" type="radio"<%=insBodiesOrganization!=null &&insBodiesOrganization.getInsOrgBodyType().equals("Type A")? "checked":StringPool.BLANK%> name="orgInsBodyType">
							<label for="orgInsBodyType">Type A</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Type B" type="radio" <%=insBodiesOrganization!=null &&insBodiesOrganization.getInsOrgBodyType().equals("Type B")? "checked":StringPool.BLANK%> name="orgInsBodyType">
							<label for="orgInsBodyType">Type B</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Type C" type="radio"<%=insBodiesOrganization!=null &&insBodiesOrganization.getInsOrgBodyType().equals("Type C")? "checked":StringPool.BLANK%> name="orgInsBodyType">
							<label for="orgInsBodyType">Type C</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.0</span> Who are the clients for which the inspection 
						body provides services (CLAUSE 4.1.6)?</p>
						<div class="row">
							<div class="col-md-12">
								<p class="tab-form-main-heading">Own or parent organization</p>
								<input type="text" class="form-control" id="insBodyServiceOwnOrgClient"
									value="<%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsBodyOwnOrgClient())?insBodiesOrganization.getInsBodyOwnOrgClient():""%>" placeholder="">
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Other organization(s)</p>
									<input type="text" class="form-control" id="insBodyServiceOtherOrgClient"
										value="<%=Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsBodyOtherOrgClient())?insBodiesOrganization.getInsBodyOtherOrgClient():""%>" placeholder="" name="insBodyServiceOtherOrgClient">
									<p class="tab-form-sub-heading">(government, private companies, individuals, etc.)</p>
									<p class="tab-form-sub-heading">Separate values with Enter</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accInsBodiesOrganization(false);"
	class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
			Continue to the next form section <span class="ml-2"> <svg
					width="18" height="14" viewBox="0 0 18 14" fill="none"
					xmlns="http://www.w3.org/2000/svg"> 
		                        <pathd ="m6.00016 11.17l1.83016=""
						6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
						1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
		                       </svg>
			</span>
		</button>
</div>
<!-- Section B Organization Form End-->