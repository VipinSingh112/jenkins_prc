<%@ include file="../../init.jsp" %>
<!-- Application Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep39">
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
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of Applicant (Legal entity or parent organization name) *</p>
						<input type="text" class="form-control" id="applicantNameCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfApplicant())?labMedicalAppliInfo.getNameOfApplicant():""%>" placeholder="Applicant Name" />
						<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameCerBodiesValidation" style="color: red;">Please enter Name of Applicant</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Applicant's Address</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddressCerBodies" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getApplicantAddress())?labMedicalAppliInfo.getApplicantAddress():""%></textarea>
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
					 <input type="text" class="form-control" id="applicantTelephoneCerBodies" placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliTelephoneNo())?labMedicalAppliInfo.getAppliTelephoneNo():""%>"
					  oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Fax No.</p> 
					 <input type="text" class="form-control" id="applicantFaxCerBodies" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliFaxNo())?labMedicalAppliInfo.getAppliFaxNo():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Website</p> 
					 <input type="text" class="form-control" id="applicantWebsiteCerBodies" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliWebsite())?labMedicalAppliInfo.getAppliWebsite():""%>"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Name of Certification Body Seeking Accreditation (If different from Name of Applicant)</p>
						<input type="text" class="form-control" id="certificationNameCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryName())?labMedicalAppliInfo.getLaboratoryName():""%>" placeholder=""  aria-describedby="cerBodiesName"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Address of Certification Body Seeking Accreditation (If different from Applicant's Address)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="cerBodiesCertAddress" placeholder="Address" 
						style="border-radius: 5px; width: 100%" aria-describedby="cerBodiesAddress"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryAddress())?labMedicalAppliInfo.getLaboratoryAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Name & Email Address of Person in Charge of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelNameCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfIncharge())?labMedicalAppliInfo.getNameOfIncharge():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelEmailCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getEmailOfIncharge())?labMedicalAppliInfo.getEmailOfIncharge():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<input id="personResponsibleCerBodiesVal" type="hidden" name="personResponsibleCerBodiesVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="personResponsibleCerBodiesDetailBox">
							<div class="accordion__header is-active"
								id="personResponsibleCerBodiesDetail" onclick="expandDetails(this.id)">
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
												id="technicalPersonNameCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Email</p>
											<input type="text" class="form-control"
												id="technicalPersonEmailCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addPersonResponsibleCerBodiesDetail" onclick="addPersonResponsibleCerBodiesDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addPersonResponsibleDetailCerBodiesTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailCerBodiesTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(cerApplicaionInfo!=null){
long cerAppliInfoAddCounter=1;
for(AddCerApplicationInfo cerAppliInfo:cerApplicaionInfo){
%>						
<tr class="personnel-responsible-cer-bodies-row<%=cerAppliInfoAddCounter%>">
<td class="sub_heading_content technicalPersonNameCerBodies<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getName())?cerAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailCerBodies<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getEmail())?cerAppliInfo.getEmail():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="personResponsibleCerBodiesEditTab" onclick="personResponsibleCerBodiesEditTab('<%=cerAppliInfoAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="personResponsibleCerBodiesDeleteDataTab" onclick="personResponsibleCerBodiesDeleteData('<%=cerAppliInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="personResponsibleCerBodiesId<%=cerAppliInfoAddCounter%>" name="personResponsibleCerBodiesId<%=cerAppliInfoAddCounter%>" value="<%=cerAppliInfo.getAddCerApplicationInfoId()%>">
					<%
						cerAppliInfoAddCounter++;
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
								<input type="text" class="form-control" id="contactPersonNameCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMName())?labMedicalAppliInfo.getPersonnelQMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonEmailCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMEmail())?labMedicalAppliInfo.getPersonnelQMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Name & Email Address of Financial Manager of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerNameCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMName())?labMedicalAppliInfo.getPersonnelFMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerEmailCerBodies" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMEmail())?labMedicalAppliInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Please select the Appropriate Accreditation Request</p>
						<div class="wizard-form-radio d-block">
							<input value="1st Accreditation" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("1st Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestCerBodies">
							<label for="accreditationRequestCerBodies">1st Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Transfer of Accreditation" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("Transfer of Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestCerBodies">
							<label for="accreditationRequestCerBodies">Transfer of Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Extension of Scope" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("Extension of Scope")? "checked":StringPool.BLANK%> name="accreditationRequestCerBodies">
							<label for="accreditationRequestCerBodies">Extension of Scope</label>
						</div>
					</div>
				</div>
				
				<!-- INSTRUCTION -->
				<div class="col-md-12"> 
					<p class="tab-form-main-heading">We hereby apply for accreditation for the certification activity(ies) detailed in the attached documents.</p> 
					<p class="tab-form-main-heading">On the granting of accreditation, we agree:</p> 
					<ul class="list-group tab-form-sub-heading"> 
						<li class="list-group-item">a) To abide by the requirements stated in ISO/IEC 17024:2012</li> 
						<li class="list-group-item">b) To abide by all the statutory requirements of the field of product certification for which accreditation is requested</li> 
						<li class="list-group-item">c) To abide by the requirements of JANAAC's accreditation programme</li> 
						<li class="list-group-item">d) To pay the required annual accreditation fees</li> 
						<li class="list-group-item">e) That accreditation may be withdrawn, suspended or reduced if we fail to comply with the foregoing, 
						subject only to the rights of appeal set out in the relevant standard.</li>
					</ul> 
					<p class="tab-form-main-heading mt-3">
						<b>We acknowledge the fact that the application fee (paid for the initial assessment) is non-refundable.</b>
					</p>
                     	</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Name of Authorized Personnel *</p>
						<input type="text" class="form-control" id="authorizedPersonnelCerBodiesName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelName())?labMedicalAppliInfo.getAuthorizedPersonnelName():""%>" placeholder=""/>
						<p class="tab-form-sub-heading fieldAlert hide" id="authorizedPersonnelCerBodiesNameValidation" style="color: red;">Please enter Name of Authorized Personnel</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Position</p>
						<input type="text" class="form-control" id="authorizedPersonnelCerBodiesPosition" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPosition())?labMedicalAppliInfo.getAuthorizedPosition():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="authorizedPersonnelCerBodiesDate" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(labMedicalAppliInfo.getAuthorizedPersonnelDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para"><span class="tab-form-highlghtme-link pr-2">12.</span>Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2" id="authorizedPersonnelCerBodiesImageHolder">
					<%if(Validator.isNotNull(signAuthPersonnelCerti17024)){ %>
							<img src="<%=signAuthPersonnelCerti17024%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="authorizedPersonnelCerBodiesBtn" hidden="" name="<portlet:namespace/>authorizedPersonnelCerBodiesBtn">
					<label for="authorizedPersonnelCerBodiesBtn" class="choose-sign-btn">
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
					<div class="signature_texarea mb-2" id="companyStampCerBodiesImageHolder">
						<%if(Validator.isNotNull(companyStampCerti17024)){ %>
							<img src="<%=companyStampCerti17024%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="companyStampCerBodiesBtn" hidden="" name="<portlet:namespace/>companyStampCerBodiesBtn">
					<label for="companyStampCerBodiesBtn" class="choose-sign-btn">
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
							If, at any point during the application or initial assessment process, there is evidence of fraudulent behaviour, or if the 
							applicant intentionally provides false information or conceals information, JANAAC shall reject the application or terminate the 
							assessment process.
						</b>
					</p>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCerBodiesAppliInfo(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep40">
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
						 Body Accreditation-JANAAC/DOC33 on the JANAAC website or in your information package), as well as statutory and other regulations and 
						 standards that pertain to their facilities and field of certification and the accreditation being sought. They should also ensure that 
						 these are understood and fulfilled to the best of the applicant's ability, before submitting the completed Application Form and Questionnaire
						  for the Accreditation of Bodies Operating Certification of Persons.</li> 
						<li class="list-group-item">2. Responses to each question and attached listings must be clear and concise.</li> 
						<li class="list-group-item">3. Material deemed to provide necessary additional information, e.g. promotional material, annual reports, etc. 
						can be submitted but must be clearly titled as appendices and referenced to specific questions on this application form and questionnaire.</li> 
						<li class="list-group-item">4. Any question or item on this application form and questionnaire that is deemed to be "not applicable" to the 
						applicant's facility should be indicated as such.</li> 
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
						<li class="list-group-item">1. Proof of legal status/identity of the Certification Body (CLAUSE 4.1)</li> 
						<li class="list-group-item">2. Evidence of adequate provisions to cover liabilities arising from the operations of the organization, e.g., 
						insurance (CLAUSE 4.4);</li> 
						<li class="list-group-item">3. Copy/generic template of organization's legally enforceable agreement for all information obtained during 
						the certification process.</li> 
						<li class="list-group-item">4. Documentation outlining the organizational structure, including relationship to other parts within the same 
						legal entity, if applicable, and related details for ALL personnel (both full time and contracted) involved in the certification process 
						(i.e., job descriptions, resumes, and/or other evidence of qualification competence). See also Section B, Question 14 (CLAUSE 5.1.2);</li> 
						<li class="list-group-item">5. Evidence of qualifications, competence and training for all personnel involved in the certification process. 
						See also Section B, Question 15 (CLAUSE 6.1).</li>
						<li class="list-group-item">6. Copies of certificates of qualification of personnel within the Certification Body (including committee 
						members) as well as any other person(s) with signatory authority (include specimen signatures) (CLAUSE 6.1.5)</li>
						<li class="list-group-item">7. Sample of (blank) certificate documentation (CLAUSE 9.4.8)</li>
						<li class="list-group-item">8. List of Certified Persons and their status. See also Section B, Question 4 (CLAUSE 7.1.1)</li>
						<li class="list-group-item">9. An authorized copy of the management system manual and/or associated documents that outline compliance 
						to the requirements of ISO/IEC 17024 and all other applicable standards. See also Section B, Question 24 (CLAUSE 10.2.1;10.2.2)</li>
						<li class="list-group-item">10. Evidence of accreditation received from any other accreditation body, if applicable</li>
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
<div class="tab-pane" role="tabpanel" id="childStep41">
	<div class="tab-form">
		<div class="laboratories-medical-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title-subtitle f2">Answer all questions in the fields provided. Where attachments are necessary please 
					ensure that each sheet is signed and dated by the organization/department leader, and the organization stamp/seal affixed.</p>
					<p class="tab-form-title f2">I. General</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.0</span> Is the Certification Body a 
						legal entity or a defined part of a legal entity? [Clause 4.1]</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="cerBodiesLegalEntity">
							<label for="cerBodiesLegalEntity">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="cerBodiesLegalEntity">
							<label for="cerBodiesLegalEntity">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 legalStatusDescribeCerBodies hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.0</span> Describe the legal status and corporate 
						ownership of the organization</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="cerBodiesLegalStatusEntity" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerLegalStatusEntity())?cerBodyGenInfo.getCerLegalStatusEntity():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.0</span> Outline all major sources of income for the 
						Certification Body.(i.e. service fees, corporate funding, government grants, other etc.)[Clause 4.4;]</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="incomeMajorSourcesCerBodies" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerMajorIncomeSources())?cerBodyGenInfo.getCerMajorIncomeSources():""%></textarea>
					</div> 
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCertiBodiesGeneral(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep42">
	<div class="tab-form">
		<div class="laboratories-medical-organization-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Scope, Services, Clients and Interested Parties</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading mb-0">
				        <span class="tab-form-highlghtme-link pr-2">4.0</span> List the registered client organizations for which the certification body currently provides certification services 
				        (add additional lines as necessary). State also the applicable certification scheme(s).[Clause 7.1.1]
				    </p>
					<input id="registeredClientOrgCerBodies" type="hidden" name="registeredClientOrgCerBodies" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="registeredClientOrgCerBodiesDetailBox">
							<div class="accordion__header is-active"
								id="registeredClientOrgCerBodiesDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>Registered Client Organizations</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Client Organization Name</p>
											<input type="text" class="form-control" id="clientOrganizationNameCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Client Organization Address</p>
											<textarea rows="3" id="clientOrganizationAddressCerBodies" class="form-control" maxlength="255" 
											placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification Scheme</p>
											<input type="text" class="form-control"
												id="certificationStandardCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Current Status</p>
											<input type="text" class="form-control"
												id="currentStatusCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date first granted</p>
											<input type="date" class="form-control" id="firstGrantedDateCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date of next examination</p>
											<input type="date" class="form-control" id="examinationDateCerBodies" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addRegisteredClientOrgCerBodiesDetail" onclick="addRegisteredClientOrgCerBodiesDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addRegisteredClientOrgCerBodiesDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addRegisteredClientOrgCerBodiesDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">Client Organization Name</th>
									<th class="sub_heading text-nowrap">Client Organization Address</th>
									<th class="sub_heading text-nowrap">Certification Scheme</th>
									<th class="sub_heading text-nowrap">Current Status</th>
									<th class="sub_heading text-nowrap">Date first granted</th>
									<th class="sub_heading text-nowrap">Date of next examination</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
<%if(cerThirdAddScopeService!=null){
long cerScopeInfoAddCounter=1;
for(AddCerScopeServiceThird cerScopeInfo:cerThirdAddScopeService){
%>						
<tr class="registered-client-org-cer-product-row<%=cerScopeInfoAddCounter%>">
<td class="sub_heading_content clientOrganizationNameCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getOrganizationName())?cerScopeInfo.getOrganizationName():""%></td>
<td class="sub_heading_content clientOrganizationAddressCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getOrganizationAddress())?cerScopeInfo.getOrganizationAddress():""%></td>
<td class="sub_heading_content certificationStandardCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getCertificationScheme())?cerScopeInfo.getCertificationScheme():""%></td>
<td class="sub_heading_content currentStatusCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getCurrentStatus())?cerScopeInfo.getCurrentStatus():""%></td>
<td class="sub_heading_content firstGrantedDateCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getDateFirstGranted())?new SimpleDateFormat("yyyy-MM-dd").format(cerScopeInfo.getDateFirstGranted()):""%></td>
<td class="sub_heading_content examinationDateCerBodies<%=cerScopeInfoAddCounter%>">
<%=Validator.isNotNull(cerScopeInfo)&&Validator.isNotNull(cerScopeInfo.getDateOfNextExamination())?new SimpleDateFormat("yyyy-MM-dd").format(cerScopeInfo.getDateOfNextExamination()):""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="registeredClientOrgCerBodiesEditTab" onclick="registeredClientOrgCerBodiesEditTab('<%=cerScopeInfoAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id=registeredClientOrgCerBodiesDeleteDataTab" onclick="registeredClientOrgCerBodiesDeleteData('<%=cerScopeInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
     <input type="hidden" id="registeredClientOrgCerBodiesId<%=cerScopeInfoAddCounter%>" name="registeredClientOrgCerBodiesId<%=cerScopeInfoAddCounter%>" value="<%=cerScopeInfo.getAddCerScopeServiceThirdId()%>">
					<%
						cerScopeInfoAddCounter++;
						}
}
					%>			
							</tbody>
						</table>
					</div>
				</div>
										
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.0</span> Indicate interested parties (persons or organizations), excluding clients and staff, 
						stating their specific  interest. (e.g. government ministries, public/private entities, individuals etc.) [Clause 4.3.8]</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="cerBodiesIntrestedParties" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getCerIntrestedParties())?cerBodyProdInfo.getCerIntrestedParties():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.0</span> Does the certification body or entities under the same organizational control, 
						provide services other than certification?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getOtherServices().equals("Yes")? "checked":StringPool.BLANK%> name="cerBodiesOtherServices">
							<label for="cerBodiesOtherServices">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getOtherServices().equals("No")? "checked":StringPool.BLANK%> name="cerBodiesOtherServices">
							<label for="cerBodiesOtherServices">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 cerBodiesOtherServicesBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.0</span> Briefly describe the nature of these services and the general 
						groups who are clients of these services</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="cerBodiesOtherServicesDescribe" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getOtherServicesDescribe())?cerBodyProdInfo.getOtherServicesDescribe():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.0</span> Does the certification body have established relationships with any organizations 
						that perform internal auditing or consultancy services?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getEstablishedRelation().equals("Yes")? "checked":StringPool.BLANK%> name="cerBodiesEstablishedRelation">
							<label for="cerBodiesEstablishedRelation">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getEstablishedRelation().equals("No")? "checked":StringPool.BLANK%> name="cerBodiesEstablishedRelation">
							<label for="cerBodiesEstablishedRelation">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 cerBodiesEstablishedRelationBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.0</span> Give a brief description of the organization(s), services provided and the nature/extent 
						of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="cerBodiesEstablishedRelationDesc" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getEstablishedRelDesc())?cerBodyProdInfo.getEstablishedRelDesc():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.0</span> Has your organization provided certification services for any client that has received consultancy or 
						internal audit services from any organization described in 8.0 and 9.0 above?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getClientService().equals("Yes")? "checked":StringPool.BLANK%> name="cerBodiesClientService">
							<label for="cerBodiesClientService">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getClientService().equals("No")? "checked":StringPool.BLANK%> name="cerBodiesClientService">
							<label for="cerBodiesClientService">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.0</span> Has your organization been previously accredited 
						by another accreditation body?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getOrgAccredited().equals("Yes")? "checked":StringPool.BLANK%> name="orgAccreditedAnotherAccreditationCerBodies">
							<label for="orgAccreditedAnotherAccreditationCerBodies">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyProdInfo!=null &&cerBodyProdInfo.getOrgAccredited().equals("No")? "checked":StringPool.BLANK%> name="orgAccreditedAnotherAccreditationCerBodies">
							<label for="orgAccreditedAnotherAccreditationCerBodies">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="row hide orgAccreditedAnotherAccreditationCerBodiesBox">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.0 Indicate:</span></p>
						<p class="tab-form-main-heading">The name of the body responsible for the most recent accreditation</p>
						<input type="text" class="form-control" id="responsibleBodyAccreditationCerBodies" value="<%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getResponsibleBody())?cerBodyProdInfo.getResponsibleBody():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">The expiry date of accreditation</p>
						<input type="date" class="form-control" id="accreditationExpDateCerBodies" value="<%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getAccExpDate())?new SimpleDateFormat("yyyy-MM-dd").format(cerBodyProdInfo.getAccExpDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">The scope for which the certification body is/was accredited</p>
						<input type="text" class="form-control" id="certBodyScopeCerBodies" value="<%=Validator.isNotNull(cerBodyProdInfo)&&Validator.isNotNull(cerBodyProdInfo.getCertBodyScope())?cerBodyProdInfo.getCertBodyScope():""%>" placeholder=""/>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCertiBodiesScopeService(false);"
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