<%@ include file="../../init.jsp" %>
		<!-- Application Form Start-->
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="laboratories-medical-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Application Information</p>
							<p class="tab-form-title-subtitle f2">Please Read the Forms
								Carefully and upload all required supporting documentation.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">1.</span> Name of
									Applicant (Legal entity or parent organization name) *
								</p>
								<input type="text" class="form-control" id="applicantName"
									value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfApplicant())?labMedicalAppliInfo.getNameOfApplicant():""%>" placeholder="Applicant Name"/>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="applicantNameValidation" style="color: red;">Please enter Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">2.</span>
									Applicant's Address
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="applicantAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getApplicantAddress())?labMedicalAppliInfo.getApplicantAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">3.</span> Contact
									Information
								</p>
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Telephone No.</p>
								<input type="text" class="form-control" id="applicantTelephone"
									placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliTelephoneNo())?labMedicalAppliInfo.getAppliTelephoneNo():""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Fax No.</p>
								<input type="text" class="form-control" id="applicantFax"
									placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliFaxNo())?labMedicalAppliInfo.getAppliFaxNo():""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Website</p>
								<input type="text" class="form-control" id="applicantWebsite"
									placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliWebsite())?labMedicalAppliInfo.getAppliWebsite():""%>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">4.</span> Name of
									Laboratory Seeking Accreditation (If different from Name of
									Applicant)
								</p>
								<input type="text" class="form-control" id="laboratoryName"
									value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryName())?labMedicalAppliInfo.getLaboratoryName():""%>" placeholder=""
									aria-describedby="laboratorySeekingName" />
								<!-- <p class="tab-form-sub-heading" id="laboratorySeekingName">If different from above</p> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">5.</span> Address
									of Laboratory Seeking Accreditation (If different from
									Applicant's Address)
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="laboratoryAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"
									aria-describedby="laboratorySeekingAddress"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryAddress())?labMedicalAppliInfo.getLaboratoryAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">6.</span> Name &
									Email Address of Personnel in Charge of Laboratory
								</p>
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelName"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfIncharge())?labMedicalAppliInfo.getNameOfIncharge():""%>" placeholder="Name" />
									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelEmail"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getEmailOfIncharge())?labMedicalAppliInfo.getEmailOfIncharge():""%>" placeholder="info@companyname.jm" />
									</div>
								</div>

							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">7.</span> Name &
									Email Address of Personnel with Responsibility for the
									Management of the Quality Management System
								</p>
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelQMName"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMName())?labMedicalAppliInfo.getPersonnelQMName():""%>" placeholder="Name" />
									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelQMEmail"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMEmail())?labMedicalAppliInfo.getPersonnelQMEmail():""%>" placeholder="info@companyname.jm" />
									</div>
								</div>

							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">8.</span> Name &
									Email Address of Deputy in Charge or Alternate Contact (if
									applicable)
								</p>
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="deputyName"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getDeputyInchargeName())?labMedicalAppliInfo.getDeputyInchargeName():""%>" placeholder="Name" />
									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" id="deputyEmail"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getDeputyInchargeEmail())?labMedicalAppliInfo.getDeputyInchargeEmail():""%>" placeholder="info@companyname.jm" />
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">9.</span> Name &
									Email Address of Personnel with Responsibility for Financial
									Matters
								</p>
								<div class="row">
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelFMName"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMName())?labMedicalAppliInfo.getPersonnelFMName():""%>" placeholder="Name" />
									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" id="personnelFMEmail"
											value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMEmail())?labMedicalAppliInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm" />
									</div>
								</div>

							</div>
						</div>
						<div class="col-md-12">
							<input id="personnelResponsibleVal" type="hidden"
								name="personnelResponsibleVal" value="1">
							<div class="accordion secured-accordian"
								id="personnelResponsibleDetailBox">
								<div class="accordion__header is-active"
									id="personnelResponsibleDetail"
									onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>10. Name & Email Address of Personnel Responsible
													for Technical Management</h2>
												<p class="tab-form-sub-heading">If there is more than
													one such person, please add relevant contact information as
													appendices</p>
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
													id="technicalPersonnelName" value="" placeholder="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Email</p>
												<input type="text" class="form-control"
													id="technicalPersonnelEmail" value="" placeholder="">
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee"
												id="addPersonnelResponsibleDetail"
												onclick="addPersonnelResponsibleDetail();"> <span>+
													1</span> Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div
							class="col-12 table-responsive hide addPersonnelResponsibleDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addPersonnelResponsibleDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Email</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
			<%if(labMedicalAdd!=null){
	long LabMedicalAppliInfoAddCounter=1;
	for(AddLabAppliInfo labAppliInfo:labMedicalAdd){
%>						
	<tr class="personnel-responsible-row<%=LabMedicalAppliInfoAddCounter%>">
	<td class="sub_heading_content technicalPersonnelName<%=LabMedicalAppliInfoAddCounter%>">
	<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getName():""%></td>
	<td class="sub_heading_content technicalPersonnelEmail<%=LabMedicalAppliInfoAddCounter%>">
	<%=Validator.isNotNull(labAppliInfo)&&Validator.isNotNull(labAppliInfo.getName())?labAppliInfo.getEmail():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="personnelResponsibleEditTab" onclick="personnelResponsibleEditTab('<%=LabMedicalAppliInfoAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="personnelResponsibleDeleteDataTab" onclick="personnelResponsibleDeleteData('<%=LabMedicalAppliInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
     </tr>
     <input type="hidden" id="personnelResponsibleId<%=LabMedicalAppliInfoAddCounter%>" name="personnelResponsibleId<%=LabMedicalAppliInfoAddCounter%>" value="<%=labAppliInfo.getAddLabAppliInfoId()%>">
							<%
							LabMedicalAppliInfoAddCounter++;
							}
 }
						%>
								</tbody>
							</table>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">11.</span> Please
									Tick the Appropriate Accreditation Request
								</p>
								<div class="wizard-form-radio d-block">
									<input value="1st Accreditation" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("1st Accreditation")? "checked":StringPool.BLANK%>
										name="accreditationRequest"> <label
										for="accreditationRequest">1st Accreditation</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Extension of Scope" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("Extension of Scope")? "checked":StringPool.BLANK%>
										name="accreditationRequest"> <label
										for="accreditationRequest">Extension of Scope</label>
								</div>

							</div>
						</div>
						<!-- INSTRUCTION -->
						<div class="col-md-12">
							<p class="tab-form-main-heading">We hereby apply for
								accreditation for the examination/Testing activity detailed in
								the attached documents.</p>
							<p class="tab-form-main-heading">On the granting of
								accreditation, we agree:</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">To abide by the requirements
									stated in ISO 15189:2022.</li>
								<li class="list-group-item">To abide by the requirements of
									JANAAC's accreditation programme.</li>
								<li class="list-group-item">To pay the required annual
									accreditation fees.</li>
								<li class="list-group-item">That accreditation may be
									withdrawn, suspended or reduced if we fail to comply with the
									foregoing, subject only to the rights of appeal set out in the
									relevant procedures.</li>
							</ul>
							<p class="tab-form-main-heading mt-3">
								<b>We acknowledge the fact that the application fee (paid
									for the initial assessment) is non-refundable.</b>
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">12.</span> Name of
									Authorized Personnel *
								</p>
								<input type="text" class="form-control"
									id="authorizedPersonnelName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelName())?labMedicalAppliInfo.getAuthorizedPersonnelName():""%>" placeholder="" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="authorizedPersonnelNameValidation" style="color: red;">Please enter Name of Authorized Personnel</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Position</p>
								<input type="text" class="form-control"
									id="authorizedPersonnelPosition" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPosition())?labMedicalAppliInfo.getAuthorizedPosition():""%>" placeholder="" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="authorizedPersonnelDate" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(labMedicalAppliInfo.getAuthorizedPersonnelDate()):""%>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">
								<span class="tab-form-highlghtme-link pr-2">13.</span> Signature
								of Authorized Personnel
							</p>
							<div class="signature_texarea mb-2"
								id="authorizedPersonnelImageHolder">
								<%if(Validator.isNotNull(signAuthPersonnel)){ %>
							<img src="<%=signAuthPersonnel%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="authorizedPersonnelBtn" hidden=""
								name="<portlet:namespace/>authorizedPersonnelBtn"> <label
								for="authorizedPersonnelBtn" class="choose-sign-btn"> <span
								class="mr-2"> <svg width="14" height="17"
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
							<div class="signature_texarea mb-2" id="companyStampImageHolder">
							<%if(Validator.isNotNull(companyStamp)){ %>
							<img src="<%=companyStamp%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="companyStampBtn" hidden=""
								name="<portlet:namespace/>companyStampBtn"> <label
								for="companyStampBtn" class="choose-sign-btn"> <span
								class="mr-2"> <svg width="14" height="17"
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
								<b> Except for information that the applicant makes publicly
									available, or when agreed in writing between JANAAC and the
									applicant, all other information obtained during the
									accreditation process will be considered proprietary and shall
									be regarded as confidential. If JANAAC is required by law or
									authorized by contractual arrangements to release confidential
									information, the applicant will, unless prohibited by law, be
									notified of the information to be provided. </b>
							</p>
							<p class="tab-form-main-heading">
								<b> If, at any point during the application or initial
									assessment process there is evidence of fraudulent behaviour,
									or if the CAB intentionally provides false information or
									conceals information, JANAAC shall reject the application or
									terminate the assessment process. </b>
							</p>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="accMediLabApplicationInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="laboratories-medical-general-ifno-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">I. General Instructions</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<ul class="list-group tab-form-sub-heading mb-3">
								<li class="list-group-item">1. Applicants should review the
									relevant requirements (please see the General Criteria for
									Conformity Assessment Body Accreditation - JANAAC/DOC/33;
									JANAAC Requirements for Measurement Uncertainty-JANAAC/DOC/23
									and Requirements for Measurement Traceability-JANAAC/DOC/24 on
									the JANAAC website or in your information package) and
									standards that pertain to their facilities and the
									accreditation being sought and ensure that these are understood
									and fulfilled to the best of the applicant's ability, before
									submitting the completed Application Form and Questionnaire for
									the Accreditation of Medical Laboratories.</li>
								<li class="list-group-item">2. Responses to each question
									and attached listings must be clear and concise.</li>
								<li class="list-group-item">3. Material deemed to provide
									necessary additional information e.g. promotional material,
									annual reports, etc. can be submitted, but must be clearly
									titled as appendices and referenced to specific questions on
									your application form and questionnaire.</li>
								<li class="list-group-item">4. Any question or item on the
									application form or questionnaire that is deemed to be "not
									applicable" to the applicant's facility should be indicated as
									such.</li>
							</ul>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">II. Required Documentation</p>
							<p class="tab-form-title-subtitle f2">Please attach the
								following:</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<ul class="list-group tab-form-sub-heading mb-3">
								<li class="list-group-item">1. Copy of approved plans (if
									premises are owned by the laboratory) or lease/rental contract
									for the laboratory</li>
								<li class="list-group-item">2. Copy of licence to operate
									the laboratory</li>
								<li class="list-group-item">3. Layout of laboratory
									indicating equipment placement, for all locations where
									laboratory activities related to the requested scope of
									accreditation are performed</li>
								<li class="list-group-item">4. Authorized copy of
									management system documentation (including organizational and
									management structure and job descriptions for all persons with
									signatory status in the organizational structure) i.e.:
									<ul class="list-group list-group-flush">
										<li class="list-group-item">a) Statement of quality
											policy and objective</li>
										<li class="list-group-item">b) Management system policies
											"Quality manual"</li>
										<li class="list-group-item">c) Management system
											procedures manual (management and technical requirements
											procedures)</li>
									</ul>
								</li>
								<li class="list-group-item">5. Copy of safety manual</li>
								<li class="list-group-item">6. Copies of certificates of
									the head and deputy head of the facility, as well as any other
									person(s) with signatory authority</li>
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
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="laboratories-medical-general-ifno-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 mb-0">Questions</p>
							<p class="tab-form-title-subtitle f2">
								<span class="tab-form-highlghtme-link pr-2">Answer all
									questions in the space provided. Please ensure that the cover
									page is signed by the organization/department leader, stamped
									or sealed, and dated, where attachments are necessary.</span>
							</p>
							<p class="tab-form-title-subtitle f2 mb-0">Description of
								Activities</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">A. Clinical</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="clinicalActivity1"
										value="Main Laboratory"<%=medicalDecOfActiInfo!=null &&medicalDecOfActiInfo.getActivitiesDescription().contains("Main Laboratory")? "checked":StringPool.BLANK%> name="clinicalActivity"> <label
										for="clinicalActivity1" class="mb-0">
										<p class="tab-form-main-heading mb-0">Main Laboratory</p>
									</label>
									<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(A main
										laboratory is the principal location where all or most key
										activities are performed).</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="clinicalActivity2"
										value="Branch Laboratory"<%=medicalDecOfActiInfo!=null &&medicalDecOfActiInfo.getActivitiesDescription().contains("Branch Laboratory")? "checked":StringPool.BLANK%> name="clinicalActivity"> <label
										for="clinicalActivity2" class="mb-0">
										<p class="tab-form-main-heading mb-0">Branch Laboratory</p>
									</label>
									<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(A branch
										system is one that consists of two or more laboratories owned
										and operated by the same organization, utilizing the same
										management system).</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="clinicalActivity3" value="Satellite"<%=medicalDecOfActiInfo!=null &&medicalDecOfActiInfo.getActivitiesDescription().contains("Satellite")? "checked":StringPool.BLANK%>
										name="clinicalActivity"> <label
										for="clinicalActivity3" class="mb-0">
										<p class="tab-form-main-heading mb-0">Satellite</p>
									</label>
									<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(Satellite
										laboratories, or limited service laboratories, are located
										permanently away from the main laboratory, with one or several
										analyzers operated by laboratory personnel. (e.g. emergency
										laboratories) and</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="clinicalActivity4" value="Mobile"<%=medicalDecOfActiInfo!=null &&medicalDecOfActiInfo.getActivitiesDescription().contains("Mobile")? "checked":StringPool.BLANK%>
										name="clinicalActivity"> <label
										for="clinicalActivity4" class="mb-0">
										<p class="tab-form-main-heading mb-0">Mobile</p>
									</label>
									<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(Mobile - a
										self-sufficient laboratory which moves from location to
										location).</p>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">B.</span> Shift
									Work
								</p>
								<p class="tab-form-sub-heading">If the laboratory works on
									shifts, please note the times for each shift</p>
								<input type="text" class="form-control"
									id="laboratoryWorkShifts" placeholder="" value="<%=Validator.isNotNull(medicalDecOfActiInfo)&&Validator.isNotNull(medicalDecOfActiInfo.getShiftWork())?medicalDecOfActiInfo.getShiftWork():""%>"
									name="laboratoryWorkShifts">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<input id="specimenCollectionVal" type="hidden"
								name="specimenCollectionVal" value="1">
							<div class="accordion secured-accordian"
								id="specimenCollectionDetailBox">
								<div class="accordion__header is-active"
									id="specimenCollectionDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>C. Specimen Collection Sites</h2>
												<p class="tab-form-sub-heading">If there are any
													specimen collection sites associated with applicant, please
													indicate the number and location(s)</p>
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
												<p class="tab-form-main-heading">Number</p>
												<input type="text" class="form-control"
													id="specimenCollectionNumber" value="" placeholder="Number"
												oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Location</p>
												<textarea rows="3" class="mt-3 form-control" maxlength="255"
													id="specimenCollectionLocation" placeholder="location"
													style="border-radius: 5px; width: 100%"></textarea>
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee"
												id="addSpecimenCollectionDetail"
												onclick="addSpecimenCollectionDetail();"> <span>+
													1</span> Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div
							class="col-12 table-responsive hide addSpecimenCollectionDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addSpecimenCollectionDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Number</th>
										<th class="sub_heading text-nowrap">Location</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(labMedicalDecOfActiAdd!=null){
	long LabMedicalDecOfActivityCounter=1;
	for(AddLabDescOfActivity labMedicalDecOfActivityInfo:labMedicalDecOfActiAdd){
%>			
   <tr class="specimen-collection-row<%=LabMedicalDecOfActivityCounter%>">
	<td class="sub_heading_content specimenCollectionNumber<%=LabMedicalDecOfActivityCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getNumber())?labMedicalDecOfActivityInfo.getNumber():""%></td>
	<td class="sub_heading_content specimenCollectionLocation<%=LabMedicalDecOfActivityCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivityInfo)&&Validator.isNotNull(labMedicalDecOfActivityInfo.getLocation())?labMedicalDecOfActivityInfo.getLocation():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="specimenCollectionEditTab" onclick="specimenCollectionEditTab('<%=LabMedicalDecOfActivityCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
	</td>  
     <td> 
		<span> 
			<a href="javascript:void(0)" id="specimenCollectionDeleteDataTab" onclick="specimenCollectionDeleteData('<%=LabMedicalDecOfActivityCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
     </tr>
  <input type="hidden" id="specimenCollectionId<%=LabMedicalDecOfActivityCounter%>" name="specimenCollectionId<%=LabMedicalDecOfActivityCounter%>" value="<%=labMedicalDecOfActivityInfo.getAddLabDescOfActivityId()%>">
							<%
							LabMedicalDecOfActivityCounter++;
							}
 }
						%>
								</tbody>
							</table>
						</div>
						<div class="col-md-12">
							<input id="pointCareTestingVal" type="hidden"
								name="pointCareTestingVal" value="1">
							<div class="accordion secured-accordian"
								id="pointCareTestingDetailBox">
								<div class="accordion__header is-active"
									id="pointCareTestingDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>D. Point-of-Care Testing (POCT)</h2>
												<p class="tab-form-sub-heading">If applicant is seeking
													accreditation for POCT please describe any POCT requested
													and location(s) where performed.</p>
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
												<p class="tab-form-main-heading">Requested POCT</p>
												<input type="text" class="form-control"
													id="pointCareTestingReqPoct" value="" placeholder="Requested POCT">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Location</p>
												<textarea rows="3" class="mt-3 form-control" maxlength="255"
													id="pointCareTestingLocation" placeholder="location"
													style="border-radius: 5px; width: 100%"></textarea>
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee"
												id="addPointCareTestingDetail"
												onclick="addPointCareTestingDetail();"> <span>+
													1</span> Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div
							class="col-12 table-responsive hide addPointCareTestingDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addPointCareTestingDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Requested POCT</th>
										<th class="sub_heading text-nowrap">Location</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(labMedicalDecOfActiSecAdd!=null){
	long LabMedicalDecOfActivitySecCounter=1;
	for(AddLabMedicalDescOfActiSec labMedicalDecOfActivitySecInfo:labMedicalDecOfActiSecAdd){
%>			
    <tr class="point-care-testing-row<%=LabMedicalDecOfActivitySecCounter%>">
	<td class="sub_heading_content pointCareTestingReqPoct<%=LabMedicalDecOfActivitySecCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivitySecInfo)&&Validator.isNotNull(labMedicalDecOfActivitySecInfo.getRequestedPoct())?labMedicalDecOfActivitySecInfo.getRequestedPoct():""%></td>
	<td class="sub_heading_content pointCareTestingLocation<%=LabMedicalDecOfActivitySecCounter%>">
	<%=Validator.isNotNull(labMedicalDecOfActivitySecInfo)&&Validator.isNotNull(labMedicalDecOfActivitySecInfo.getLocation())?labMedicalDecOfActivitySecInfo.getLocation():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="pointCareTestingEditTab" onclick="pointCareTestingEditTab('<%=LabMedicalDecOfActivitySecCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="pointCareTestingDeleteDataTab" onclick="pointCareTestingDeleteData('<%=LabMedicalDecOfActivitySecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="pointCareTestingId<%=LabMedicalDecOfActivitySecCounter%>" name="pointCareTestingId<%=LabMedicalDecOfActivitySecCounter%>" value="<%=labMedicalDecOfActivitySecInfo.getAddLabMedicalDescOfActiSecId()%>">    
   <%
   LabMedicalDecOfActivitySecCounter++;
							}
 }
						%>									
						</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick=" accMediLabDescriptionOfActivity(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="laboratories-medical-organization-ifno-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">I. The Organization</p>
							<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
							signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group">
									<p class="tab-form-main-heading" id="laboratoryLegalEntity"> 
										<span class="tab-form-highlghtme-link pr-2">1.0 </span>Is the
										laboratory a legal entity?
									</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=medicalOrganizationInfo!=null &&medicalOrganizationInfo.getLaboratoryLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="laboratoryLegalEntity">
										<label for="laboratoryLegalEntity">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=medicalOrganizationInfo!=null &&medicalOrganizationInfo.getLaboratoryLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="laboratoryLegalEntity">
										<label for="laboratoryLegalEntity">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 laboratoryLegalEntityBox hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Define the legal status
									(CLAUSE 5.1)</p>
								<input type="text" class="form-control"
									id="laboratoryLegalEntityDefine" value="<%=Validator.isNotNull(medicalOrganizationInfo)&&Validator.isNotNull(medicalOrganizationInfo.getLegalStatus())?medicalOrganizationInfo.getLegalStatus():""%>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group">
									<p class="tab-form-main-heading" id="laboratoryPartOfOrg">
										<span class="tab-form-highlghtme-link pr-2">2.0 </span>Is the
										laboratory a part of an organization that performs activities
										other than examinations (CLAUSE 5.1)?
									</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=medicalOrganizationInfo!=null &&medicalOrganizationInfo.getLaboratoryPartOfOrg().equals("Yes")? "checked":StringPool.BLANK%> name="laboratoryPartOfOrg">
										<label for="laboratoryPartOfOrg">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=medicalOrganizationInfo!=null &&medicalOrganizationInfo.getLaboratoryPartOfOrg().equals("No")? "checked":StringPool.BLANK%> name="laboratoryPartOfOrg">
										<label for="laboratoryPartOfOrg">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 laboratoryPartOfOrgBox hide">
							<div class="row">
								<div class="col-md-12">
									<input id="keyPersonnelDetailsVal" type="hidden"
										name="keyPersonnelDetailsVal" value="1">
									<div class="">
										<div class="accordion secured-accordian"
											id="keyPersonnelDetailsBox">
											<div class="accordion__header is-active"
												id="keyPersonnelDetails" onclick="expandDetails(this.id)">
												<div class="d-flex align-items-center">
													<div class="d-flex align-items-center">
														<div>
															<span class="accordion__toggle"></span>
														</div>
														<div>
															<h2>
																<span class="">3.0 </span>State the Names and Position
																of the key personnel of the organization that have
																responsibility, involvement or influence in examination
																activities (CLAUSE 6.2)
															</h2>
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
																id="laboratoryPartOfOrgName" value="" placeholder="Name">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Position</p>
															<input type="text" class="form-control"
																id="laboratoryPartOfOrgPosition" value=""
																placeholder="Position">
														</div>
													</div>
													<div class="col-md-12 d-flex justify-content-end py-4">
														<a href="javascript:void(0);" class="add-more-employee"
															id="addKeyPersonnelDetails"
															onclick="addKeyPersonnelDetails();"> <span>+ 1</span>
															Add More
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div
									class="col-12 table-responsive hide addKeyPersonnelDetailsTableBox">
									<table class="table table-bordered mb-3">
										<tbody class="addKeyPersonnelDetailsTable">
											<tr>
												<th class="sub_heading text-nowrap">Name</th>
												<th class="sub_heading text-nowrap">Position</th>
												<th class="sub_heading">Edit</th>
												<th class="sub_heading">Delete</th>
											</tr>
									
<%if(laboratoryPartOfOrg!=null){
	long LaboratoryPartOfOrgCounter=1;
	for(AddLaboratoryPartOfOrg laboratoryPartOfOrgInfo:laboratoryPartOfOrg){
%>	

<tr class="key-personnel-row<%=LaboratoryPartOfOrgCounter%>">
	<td class="sub_heading_content laboratoryPartOfOrgName<%=LaboratoryPartOfOrgCounter%>">
	<%=Validator.isNotNull(laboratoryPartOfOrgInfo)&&Validator.isNotNull(laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgName())?laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgName():""%></td>
	<td class="sub_heading_content laboratoryPartOfOrgPosition<%=LaboratoryPartOfOrgCounter%>">
	<%=Validator.isNotNull(laboratoryPartOfOrgInfo)&&Validator.isNotNull(laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgPosition())?laboratoryPartOfOrgInfo.getLaboratoryPartOfOrgPosition():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="keyPersonnelEditTab" onclick="keyPersonnelEditTab('<%=LaboratoryPartOfOrgCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="keyPersonnelDeleteDataTab" onclick="keyPersonnelDeleteData('<%=LaboratoryPartOfOrgCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>	
     <input type="hidden" id="keyPersonnelId<%=LaboratoryPartOfOrgCounter%>" name="keyPersonnelId<%=LaboratoryPartOfOrgCounter%>" value="<%=laboratoryPartOfOrgInfo.getAddLaboratoryPartOfOrgId()%>">
	 <%
				 LaboratoryPartOfOrgCounter++;
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
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">4.0 </span>List the
									names of the analysts who are involved in the requested scope
									of accreditation (CLAUSE 6.2)
								</p>
								<input type="text" class="form-control" id="analystsName"
									name="analystsName" value="<%=Validator.isNotNull(medicalOrganizationInfo)&&Validator.isNotNull(medicalOrganizationInfo.getNameOfAnalysts())?medicalOrganizationInfo.getNameOfAnalysts():""%>" placeholder="" />
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<input id="signatoryAuthorityVal" type="hidden"
								name="signatoryAuthorityVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="signatoryAuthorityDetailBox">
									<div class="accordion__header is-active"
										id="signatoryAuthorityDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>5.0 State the name of the key members of staff
														with signatory authority on the laboratory's
														organizational chart, indicating the title of their
														respective jobs and their major responsibilities.(CLAUSE
														6.2.3)</h2>
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
													<input type="text" class="form-control" id="staffName"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Job Title</p>
													<input type="text" class="form-control" id="jobTitle"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Major Responsibilities</p>
													<input type="text" class="form-control"
														id="majorResponsibilities" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addSignatoryAuthorityDetail"
													onclick="addSignatoryAuthorityDetail();"> <span>+
														1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addSignatoryAuthorityDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addSignatoryAuthorityDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name of Staff</th>
											<th class="sub_heading text-nowrap">Job Title</th>
											<th class="sub_heading text-nowrap">Major
												Responsibilities</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
<%if(labMedicalOrganFirstAdd!=null){
	long LabMedicalOrganFirstCounter=1;
	for(AddLabMedicalOrganFirst labMedicalOrganFirstInfo:labMedicalOrganFirstAdd){
%>			
<tr class="signatory-authority-row<%=LabMedicalOrganFirstCounter%>">
	<td class="sub_heading_content staffName<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getNameOfStaff())?labMedicalOrganFirstInfo.getNameOfStaff():""%></td>
	<td class="sub_heading_content jobTitle<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getJobTitle())?labMedicalOrganFirstInfo.getJobTitle():""%></td>
	<td class="sub_heading_content majorResponsibilities<%=LabMedicalOrganFirstCounter%>">
	<%=Validator.isNotNull(labMedicalOrganFirstInfo)&&Validator.isNotNull(labMedicalOrganFirstInfo.getMajorResponsibilities())?labMedicalOrganFirstInfo.getMajorResponsibilities():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="signatoryAuthorityEditTab" onclick="signatoryAuthorityEditTab('<%=LabMedicalOrganFirstCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="signatoryAuthorityDeleteDataTab" onclick="signatoryAuthorityDeleteData('<%=LabMedicalOrganFirstCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="signatoryAuthorityId<%=LabMedicalOrganFirstCounter%>" name="signatoryAuthorityId<%=LabMedicalOrganFirstCounter%>" value="<%=labMedicalOrganFirstInfo.getAddLabMedicalOrganFirstId()%>">    
   <%
   LabMedicalOrganFirstCounter++;
							}
 }
						%>										
									</tbody>
								</table>
							</div>
						</div>

						<div class="col-md-12">
							<input id="examinationsScopeVal" type="hidden"
								name="examinationsScopeVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="examinationsScopeDetailBox">
									<div class="accordion__header is-active"
										id="examinationsScopeDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>6.0 List the scope of the examinations for which
														accreditation is being sought</h2>
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
													<p class="tab-form-main-heading">Product/Material</p>
													<input type="text" class="form-control" id="product"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Examinations</p>
													<textarea rows="3" id="examinations" class="form-control"
														maxlength="255" placeholder=""
														style="border-radius: 5px; width: 100%"></textarea>
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Methods</p>
													<textarea rows="3" id="methods" class="form-control"
														maxlength="255" placeholder=""
														style="border-radius: 5px; width: 100%"></textarea>
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Equipment (where
														appropriate)</p>
													<textarea rows="3" id="equipment" class="form-control"
														maxlength="255" placeholder=""
														style="border-radius: 5px; width: 100%"></textarea>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Reference Range</p>
													<input type="text" class="form-control" id="referenceRange"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Measurement
														Uncertainty</p>
													<input type="text" class="form-control"
														id="measurementUncertainty" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addExaminationsScopeDetail"
													onclick="addExaminationsScopeDetail();"> <span>+
														1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addExaminationsScopeDetaiLTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addExaminationsScopeDetaiLTable">
										<tr>
											<th class="sub_heading text-nowrap">Product/Material</th>
											<th class="sub_heading text-nowrap">Examinations</th>
											<th class="sub_heading text-nowrap">Methods</th>
											<th class="sub_heading text-nowrap">Equipment</th>
											<th class="sub_heading text-nowrap">Reference Range</th>
											<th class="sub_heading text-nowrap">Measurement
												Uncertainty</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
<%if(labMedicalOrganSecAdd!=null){
	long LabMedicalOrganSecCounter=1;
	for(AddLabMedicalOrganSec labMedicalOrganSecInfo:labMedicalOrganSecAdd){
%>
<tr class="examinations-scope-row<%=LabMedicalOrganSecCounter%>">
	<td class="sub_heading_content product<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getProduct())?labMedicalOrganSecInfo.getProduct():""%></td>
	<td class="sub_heading_content examinations<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getExamination())?labMedicalOrganSecInfo.getExamination():""%></td>
	<td class="sub_heading_content methods<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getMethods())?labMedicalOrganSecInfo.getMethods():""%></td>
	<td class="sub_heading_content equipment<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getEquipment())?labMedicalOrganSecInfo.getEquipment():""%></td>
	<td class="sub_heading_content referenceRange<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getReferenceRange())?labMedicalOrganSecInfo.getReferenceRange():""%></td>
	<td class="sub_heading_content measurementUncertainty<%=LabMedicalOrganSecCounter%>">
	<%=Validator.isNotNull(labMedicalOrganSecInfo)&&Validator.isNotNull(labMedicalOrganSecInfo.getMeasurementUncertainty())?labMedicalOrganSecInfo.getMeasurementUncertainty():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="examinationsScopeEditTab" onclick="examinationsScopeEditTab('<%=LabMedicalOrganSecCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="examinationsScopeDeleteDataTab" onclick="examinationsScopeDeleteData('<%=LabMedicalOrganSecCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="examinationsScopeId<%=LabMedicalOrganSecCounter%>" name="examinationsScopeId<%=LabMedicalOrganSecCounter%>" value="<%=labMedicalOrganSecInfo.getAddLabMedicalOrganSecId()%>">    
   <%
   LabMedicalOrganSecCounter++;
							}
 }
						%>
									</tbody>
								</table>
							</div>
						</div>

						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">7.0 </span>What is
									the major source of income for the Laboratory
								</p>
								<p class="tab-form-sub-heading">(i.e. service fees,
									corporate funding, government grants, other - please specify)
									(CLAUSE 5.1)?</p>
								<input type="text" class="form-control" id="majorIncomeSource"
									value="<%=Validator.isNotNull(medicalOrganizationInfo)&&Validator.isNotNull(medicalOrganizationInfo.getMajorIncomeSource())?medicalOrganizationInfo.getMajorIncomeSource():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">8.0 </span>Who are
									the clients for which the Laboratory provides services
								</p>
								<p class="tab-form-sub-heading">(government, private
									companies, individuals, etc.) (CLAUSE 6.7)?</p>
								<input type="text" class="form-control" id="laboratoryClients"
									value="<%=Validator.isNotNull(medicalOrganizationInfo)&&Validator.isNotNull(medicalOrganizationInfo.getLaboratoryClients())?medicalOrganizationInfo.getLaboratoryClients():""%>" placeholder="">
							</div>
						</div>

					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick=" accMediLabOrganizationInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="human-resources-ifno-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">II. Human Resources</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">9.0 </span>Kindly
									provide a resume for the key members of staff with signatory
									authority including professional associations and training
									courses (CLAUSE 6.2)
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="keyMemberResume"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>keyMemberResume"> <label
														class="custom-upload" for="keyMemberResume"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"> 
				                                  				<path
																	d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																	fill="#047247"></path> 
				                                				 </svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(resumeHuman)){ %>
												<span class="attach-detailed-overview"><%=resumeHuman%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
										</div>
									</div>
								</div>
							</div>
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