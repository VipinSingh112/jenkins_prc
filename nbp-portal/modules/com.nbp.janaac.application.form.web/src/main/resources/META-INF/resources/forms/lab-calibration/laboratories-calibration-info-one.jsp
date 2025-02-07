<%@ include file="../../init.jsp" %>
<!-- Application Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep16">
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
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span> Name of Applicant (Legal entity or parent organization name) *</p>
						<input type="text" class="form-control" id="calibrationApplicantName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfApplicant())?labMedicalAppliInfo.getNameOfApplicant():""%>" placeholder="Applicant Name" />
						<p class="tab-form-sub-heading fieldAlert hide" id="calibrationApplicantNameValidation" style="color: red;">Please enter Name of Applicant</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span> Applicant's Address</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationApplicantAddress" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getApplicantAddress())?labMedicalAppliInfo.getApplicantAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">3.</span> Contact Information</p> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Telephone No.</p> 
					 <input type="text" class="form-control" id="calibrationApplicantTelephone" placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliTelephoneNo())?labMedicalAppliInfo.getAppliTelephoneNo():""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Fax No.</p> 
					 <input type="text" class="form-control" id="calibrationApplicantFax" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliFaxNo())?labMedicalAppliInfo.getAppliFaxNo():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Website</p> 
					 <input type="text" class="form-control" id="calibrationApplicantWebsite" placeholder="" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAppliWebsite())?labMedicalAppliInfo.getAppliWebsite():""%>"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span> Name of Laboratory Seeking Accreditation (If different from Name of Applicant)</p>
						<input type="text" class="form-control" id="calibrationLaboratoryName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryName())?labMedicalAppliInfo.getLaboratoryName():""%>" placeholder="" aria-describedby="calibrationLaboratorySeekingName"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span> Address of Laboratory Seeking Accreditation (If different from Applicant's Address)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="calibrationAaboratoryAddress" placeholder="Address" style="border-radius: 5px; width: 100%" aria-describedby="calibrationAaboratorySeekingAddress"><%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getLaboratoryAddress())?labMedicalAppliInfo.getLaboratoryAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span> Name & Email Address of Personnel in Charge of Laboratory</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getNameOfIncharge())?labMedicalAppliInfo.getNameOfIncharge():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelEmail" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getEmailOfIncharge())?labMedicalAppliInfo.getEmailOfIncharge():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7. </span>Name & Email Address of Personnel with Responsibility for the Management of the Quality Management System</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelQMName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMName())?labMedicalAppliInfo.getPersonnelQMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelQMEmail" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelQMEmail())?labMedicalAppliInfo.getPersonnelQMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8. </span>Name & Email Address of Deputy in Charge or Alternate Contact (if applicable)</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationDeputyName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getDeputyInchargeName())?labMedicalAppliInfo.getDeputyInchargeName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationDeputyEmail" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getDeputyInchargeEmail())?labMedicalAppliInfo.getDeputyInchargeEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9. </span>Name & Email Address of Personnel with Responsibility for Financial Matters</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelFMName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMName())?labMedicalAppliInfo.getPersonnelFMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="calibrationPersonnelFMEmail" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getPersonnelFMEmail())?labMedicalAppliInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<input id="personnelResponsibleCalibrationVal" type="hidden" name="personnelResponsibleCalibrationVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="personnelResponsibleCalibrationDetailBox">
							<div class="accordion__header is-active"
								id="personnelResponsibleCalibrationDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>10. Name & Email Address of Personnel Responsible for Technical Management</h2>
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
												id="technicalPersonnelNameCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Email</p>
											<input type="text" class="form-control"
												id="technicalPersonnelEmailCalibration" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addPersonnelResponsibleCalibrationDetail" onclick="addPersonnelResponsibleCalibrationDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addPersonnelResponsibleCalibrationDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonnelResponsibleCalibrationDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labMedicalAdd!=null){
long labCelAppliInfoCounter=1;
for(AddLabAppliInfo labCelAppliInfo:labMedicalAdd){
%>			
<tr class="personnel-responsible-calibration-row<%=labCelAppliInfoCounter%>">
<td class="sub_heading_content technicalPersonnelNameCalibration<%=labCelAppliInfoCounter%>">
<%=Validator.isNotNull(labCelAppliInfo)&&Validator.isNotNull(labCelAppliInfo.getName())?labCelAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonnelEmailCalibration<%=labCelAppliInfoCounter%>">
<%=Validator.isNotNull(labCelAppliInfo)&&Validator.isNotNull(labCelAppliInfo.getEmail())?labCelAppliInfo.getEmail():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="personnelResponsibleCalibrationEditTab" onclick="personnelResponsibleCalibrationEditTab('<%=labCelAppliInfoCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="personnelResponsibleCalibrationDeleteDataTab" onclick="personnelResponsibleCalibrationDeleteData('<%=labCelAppliInfoCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
  <input type="hidden" id="personnelResponsibleCalibrationId<%=labCelAppliInfoCounter%>" name="personnelResponsibleCalibrationId<%=labCelAppliInfoCounter%>" value="<%=labCelAppliInfo.getAddLabAppliInfoId()%>">
					<%
						labCelAppliInfoCounter++;
						}
}
					%>	
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11. </span>Please Tick the Appropriate Accreditation Request</p>
						<div class="wizard-form-radio d-block">
							<input value="1st Accreditation" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("1st Accreditation")? "checked":StringPool.BLANK%> name="calibrationAccreditationRequest">
							<label for="calibrationAccreditationRequest">1st Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Extension of Scope" type="radio"<%=labMedicalAppliInfo!=null &&labMedicalAppliInfo.getAccRequestType().equals("Extension of Scope")? "checked":StringPool.BLANK%> name="calibrationAccreditationRequest">
							<label for="calibrationAccreditationRequest">Extension of Scope</label>
						</div>

					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-main-heading">We hereby apply for accreditation for the calibration activity detailed in the attached documents.</p> 
					<p class="tab-form-main-heading">On the granting of accreditation, we agree:</p> 
					<ul class="list-group tab-form-sub-heading"> 
						<li class="list-group-item">To abide by the requirements stated in ISO/IEC 17025:2017</li> 
						<li class="list-group-item">To abide by the requirements of JANAAC's accreditation programme.</li> 
						<li class="list-group-item">To pay the required annual accreditation fees.</li> 
						<li class="list-group-item">That accreditation may be withdrawn, suspended, or reduced if we fail to comply with any of the foregoing, 
						subject only to the rights of appeal set out in the relevant standard.</li> 
					</ul> 
					<p class="tab-form-main-heading mt-3">
						<b>We acknowledge the fact that the application fee paid is non-refundable.</b>
					</p>
                     	</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12. </span>Name of Authorized Personnel *</p>
						<input type="text" class="form-control" id="calibrationAuthorizedPersonnelName" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelName())?labMedicalAppliInfo.getAuthorizedPersonnelName():""%>" placeholder=""/>
						<p class="tab-form-sub-heading fieldAlert hide" id="calibrationAuthorizedPersonnelNameValidation" style="color: red;">Please enter Name of Authorized Personnel</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Position</p>
						<input type="text" class="form-control" id="calibrationAuthorizedPersonnelPosition" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPosition())?labMedicalAppliInfo.getAuthorizedPosition():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="calibrationAuthorizedPersonnelDate" value="<%=Validator.isNotNull(labMedicalAppliInfo)&&Validator.isNotNull(labMedicalAppliInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(labMedicalAppliInfo.getAuthorizedPersonnelDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para"><span class="tab-form-highlghtme-link pr-2">13. </span>Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2" id="authorizedPersonnelCalibrationImageHolder"><%if(Validator.isNotNull(signAuthPersonnelCaliber)){ %>
							<img src="<%=signAuthPersonnelCaliber%>"  width="100" height="100"/>
							<%} %></div>
					<input type="file" id="authorizedPersonnelCalibrationBtn" hidden="" name="<portlet:namespace/>authorizedPersonnelCalibrationBtn">
					<label for="authorizedPersonnelCalibrationBtn" class="choose-sign-btn">
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
					<div class="signature_texarea mb-2" id="companyStampCalibrationImageHolder"><%if(Validator.isNotNull(companyStampCaliber)){ %>
							<img src="<%=companyStampCaliber%>"  width="100" height="100"/>
							<%} %></div>
					<input type="file" id="companyStampCalibrationBtn" hidden="" name="<portlet:namespace/>companyStampCalibrationBtn">
					<label for="companyStampCalibrationBtn" class="choose-sign-btn">
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
							Except for information that the applicant makes publicly available, or when agreed in writing between 
							JANAAC and the applicant, all other information obtained during the accreditation process will be considered 
							proprietary and shall be regarded as confidential. If JANAAC is required by law or authorized 
							by contractual arrangements to release confidential information, the applicant will, unless prohibited by law, 
							be notified of the information to be provided.
						</b>
					</p>
					<p class="tab-form-main-heading">
						<b>
							If, at any point during the application or initial assessment process there is evidence of fraudulent behaviour, 
							or if the CAB intentionally provides false information or conceals information, JANAAC shall reject the application 
							or terminate the assessment process.
						</b>
					</p>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabCalibrationApplicationInfo(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep17">
	<div class="tab-form">
		<div class="laboratories-calibration-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">I. General Instructions</p>
					<!-- <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">
							1. Applicants should review the relevant requirements (please see the General Criteria for Conformity Assessment Body Accreditation
							- JANAAC/DOC/33; JANAAC Requirements for Measurement Uncertainty-JANAAC/DOC/23; JANAAC Requirements for Measurement 
							Traceability-JANAAC/DOC/24 and Measurement Uncertainty in Calibration- JANAAC/DOC 35 on the JANAAC website or in your 
							information package) and standards that pertain to their facilities and the accreditation being sought, and ensure that 
							these are understood and fulfilled to the best of the applicant’s ability, before submitting the completed Application Form 
							and Questionnaire for Accreditation of Calibration Laboratories.
						</li> 
						<li class="list-group-item">2. Responses to each question and attached listings must be clear and concise.</li> 
						<li class="list-group-item">3. Material deemed to provide necessary additional information, e.g. promotional material, annual reports, 
						etc. may be submitted, but must be clearly titled as appendices and referenced to specific questions on your application form and 
						questionnaire.</li> 
						<li class="list-group-item">4. Any question or item on the application form or questionnaire that is deemed to be "not applicable" 
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
						<li class="list-group-item">1. Copy of approved plans (if premises are owned by the laboratory) or lease/rental contract for the laboratory</li> 
						<li class="list-group-item">2. Copy of licence to operate the laboratory (duly signed, stamped and dated)</li> 
						<li class="list-group-item">3. Layout of laboratory indicating equipment placement, for all locations where laboratory activities related to the requested scope of accreditation are performed</li> 
						<li class="list-group-item">4. Authorized copies of management system documentation, including:
							<ul class="list-group list-group-flush"> 
								<li class="list-group-item">a) Policies and objectives for fulfilling the requirements of the ISO/IEC 17025 standard</li> 
								<li class="list-group-item">b) Description of the organizational structure (including organizational chart if available)</li> 
								<li class="list-group-item">c) Documented competence requirements for each function influencing the results of laboratory activities</li>
								<li class="list-group-item">d) Test methods and procedures</li>
							</ul>
						</li> 
						<li class="list-group-item">5. Copies of certificates of qualification for the head, and deputy head of the facility, as well as any other key personnel with signatory authority that have been duly signed, stamped and dated. Please include specimen signatures).</li>
						<li class="list-group-item">6. Copies of normative documents that govern your operations, if permissible/permitted</li>
						<li class="list-group-item">7. Proficiency testing (PT) programme and,, PT and or interlaboratory comparison results obtained within the last two years.</li>
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
<div class="tab-pane" role="tabpanel" id="childStep18">
	<div class="tab-form">
		<div class="laboratories-medical-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title-subtitle f2 mb-0">Questions</p>
					<p class="tab-form-title-subtitle f2">
						<span class="tab-form-highlghtme-link pr-2">Answer all questions in the space provided. Please ensure that the cover page is signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</span></p>
					<p class="tab-form-title-subtitle f2 mb-0">Description of Activities</p>
					
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">A.</span></p>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="calibrationClinicalActivity1" value="Main Laboratory"<%=labMedicalTestDesc!=null &&labMedicalTestDesc.getTestClinicalActivity().contains("Main Laboratory")? "checked":StringPool.BLANK%> name="calibrationClinicalActivity"> 
							<label for="calibrationClinicalActivity1" class="mb-0">
								<p class="tab-form-main-heading mb-0">Main Laboratory</p>
							</label>
							<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(A main laboratory is the principal location where all or most key activities are performed).</p>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="calibrationClinicalActivity2" value="Branch Laboratory"<%=labMedicalTestDesc!=null &&labMedicalTestDesc.getTestClinicalActivity().contains("Branch Laboratory")? "checked":StringPool.BLANK%> name="calibrationClinicalActivity"> 
							<label for="calibrationClinicalActivity2" class="mb-0">
								<p class="tab-form-main-heading mb-0">Branch Laboratory</p>
							</label>
							<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(A branch system is one that consists of two or more laboratories 
								owned and operated by the same organization, utilizing the same management system).</p>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="calibrationClinicalActivity3" value="Satellite"<%=labMedicalTestDesc!=null &&labMedicalTestDesc.getTestClinicalActivity().contains("Satellite")? "checked":StringPool.BLANK%> name="calibrationClinicalActivity"> 
							<label for="calibrationClinicalActivity3" class="mb-0">
								<p class="tab-form-main-heading mb-0">Satellite</p>
							</label>
							<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(Satellite laboratories, or limited service laboratories, are located permanently away 
								from the main laboratory, with one or several analyzers operated by laboratory personnel. (e.g. emergency laboratories) and</p>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="calibrationClinicalActivity4" value="Mobile"<%=labMedicalTestDesc!=null &&labMedicalTestDesc.getTestClinicalActivity().contains("Mobile")? "checked":StringPool.BLANK%> name="calibrationClinicalActivity"> 
							<label for="calibrationClinicalActivity4" class="mb-0">
								<p class="tab-form-main-heading mb-0">Mobile</p>
							</label>
							<p class="tab-form-sub-heading mb-0 ml-4 pl-3">(Mobile - a self-sufficient laboratory which moves from location to location).</p>
						</div>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">B.</span> Shift Work</p>
						<p class="tab-form-sub-heading">If the laboratory works on shifts, please note the times for each shift</p> 
						<input type="text" class="form-control" id="calibrationLaboratoryWorkShifts" placeholder="" value="<%=Validator.isNotNull(labMedicalTestDesc)&&Validator.isNotNull(labMedicalTestDesc.getTestLabShiftWork())?labMedicalTestDesc.getTestLabShiftWork():""%>" name="calibrationLaboratoryWorkShifts"> 
						<p class="tab-form-sub-heading">Separate values with Enter</p>
					</div> 
				</div>
				<div class="col-md-12">
					<input id="calibrationSpecimenCollectionVal" type="hidden"
						name="calibrationSpecimenCollectionVal" value="1">
					<div class="accordion secured-accordian"
						id="calibrationSpecimenCollectionDetailBox">
						<div class="accordion__header is-active"
							id="calibrationSpecimenCollectionDetail" onclick="expandDetails(this.id)">
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
											id="calibrationSpecimenNumber" value="" placeholder="Number"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Location</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255"
											id="calibrationSpecimenLocation" placeholder="location"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addCalibrationSpecimenCollectionDetail"
										onclick="addCalibrationSpecimenCollectionDetail();"> <span>+
											1</span> Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addCalibrationSpecimenCollectionDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addCalibrationSpecimenCollectionDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number</th>
								<th class="sub_heading text-nowrap">Location</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(labMedicalDecOfActiAdd!=null){
long LabCelDecOfActiCounter=1;
for(AddLabDescOfActivity labCelDecOfActivityInfo:labMedicalDecOfActiAdd){
%>			
<tr class="calibration-responsible-row<%=LabCelDecOfActiCounter%>">
<td class="sub_heading_content calibrationSpecimenNumber<%=LabCelDecOfActiCounter%>">
<%=Validator.isNotNull(labCelDecOfActivityInfo)&&Validator.isNotNull(labCelDecOfActivityInfo.getNumber())?labCelDecOfActivityInfo.getNumber():""%></td>
<td class="sub_heading_content calibrationSpecimenLocation<%=LabCelDecOfActiCounter%>">
<%=Validator.isNotNull(labCelDecOfActivityInfo)&&Validator.isNotNull(labCelDecOfActivityInfo.getLocation())?labCelDecOfActivityInfo.getLocation():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="calibrationSpecimenCollectionEditTab" onclick="calibrationSpecimenCollectionEditTab('<%=LabCelDecOfActiCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="calibrationSpecimenCollectionDeleteDataTab" onclick="calibrationSpecimenCollectionDeleteData('<%=LabCelDecOfActiCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
  <input type="hidden" id="calibrationSpecimenCollectionId<%=LabCelDecOfActiCounter%>" name="calibrationSpecimenCollectionId<%=LabCelDecOfActiCounter%>" value="<%=labCelDecOfActivityInfo.getAddLabDescOfActivityId()%>">
					<%
						LabCelDecOfActiCounter++;
						}
}
					%>	
					</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accMediLabCalibrationActivityDesc(false);"
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