<%@ include file="../../init.jsp" %>
<!-- Application Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep23">
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
						<input type="text" class="form-control" id="applicantNameCertification" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getApplicantName())?applicantInfo.getApplicantName():""%>" placeholder="Applicant Name" />
						<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameCertificationValidation" style="color: red;">Enter a Name of Applicant</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span> Applicant's Address</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddressCertification" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getApplicantAddress())?applicantInfo.getApplicantAddress():""%></textarea>
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
					 <input type="text" class="form-control" id="applicantTelephoneCertification" placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getApplicantTelephone())?applicantInfo.getApplicantTelephone():""%>"
					  oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Fax No.</p> 
					 <input type="text" class="form-control" id="applicantFaxCertification" placeholder="" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getApplicantFaxNo())?applicantInfo.getApplicantFaxNo():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Website</p> 
					 <input type="text" class="form-control" id="applicantWebsiteCertification" placeholder="" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getApplicantWebsite())?applicantInfo.getApplicantWebsite():""%>"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span> Name of Certification Body Seeking Accreditation (If different from Name of Applicant)</p>
						<input type="text" class="form-control" id="certificationName" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getCertificationName())?applicantInfo.getCertificationName():""%>" placeholder="" aria-describedby="laboratorySeekingName"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span> Address of Certification Body Seeking Accreditation (If different from Applicant's Address)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="certificationAddress" placeholder="Address" style="border-radius: 5px; width: 100%" aria-describedby="certificationSeekingAddress"><%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getCertiAddress())?applicantInfo.getCertiAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span> Name & Email Address of Person in Charge of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelNameCertification" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelName())?applicantInfo.getPersonnelName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelEmailCertification" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelName())?applicantInfo.getPersonnelName():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<input id="personResponsibleCerVal" type="hidden" name="personResponsibleCerVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="personResponsibleDetailBox">
							<div class="accordion__header is-active"
								id="personResponsibleDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>7. Name & Email Address of Person Responsible for Technical Management</h2>
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
												id="technicalPersonNameCer" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Email</p>
											<input type="text" class="form-control"
												id="technicalPersonEmailCer" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addPersonResponsibleCerDetail" onclick="addPersonResponsibleCerDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addPersonResponsibleDetailCerTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailCerTable">
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
<tr class="personnel-responsible-cer-row<%=cerAppliInfoAddCounter%>">
<td class="sub_heading_content technicalPersonNameCer<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getName())?cerAppliInfo.getName():""%></td>
<td class="sub_heading_content technicalPersonEmailCer<%=cerAppliInfoAddCounter%>">
<%=Validator.isNotNull(cerAppliInfo)&&Validator.isNotNull(cerAppliInfo.getEmail())?cerAppliInfo.getEmail():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="personResponsibleCerEditTab" onclick="personResponsibleCerEditTab('<%=cerAppliInfoAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="personResponsibleCerDeleteDataTab" onclick="personResponsibleCerDeleteData('<%=cerAppliInfoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span> Name & Email Address of Contact Person</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonName" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelContactName())?applicantInfo.getPersonnelContactName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonEmail" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelContactEmail())?applicantInfo.getPersonnelContactEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span> Name & Email Address of Financial Manager of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerName" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelFMName())?applicantInfo.getPersonnelFMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerEmail" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getPersonnelFMEmail())?applicantInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span> Please select the Appropriate Accreditation Request</p>
						<div class="wizard-form-radio d-block">
							<input value="1st Accreditation" type="radio"<%=applicantInfo!=null &&applicantInfo.getAccreditationRequest().equals("1st Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestCertification">
							<label for="accreditationRequestCertification">1st Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Transfer of Accreditation" type="radio"<%=applicantInfo!=null &&applicantInfo.getAccreditationRequest().equals("Transfer of Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestCertification">
							<label for="accreditationRequestCertification">Transfer of Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Extension of Scope" type="radio"<%=applicantInfo!=null &&applicantInfo.getAccreditationRequest().equals("Extension of Scope")? "checked":StringPool.BLANK%> name="accreditationRequestCertification">
							<label for="accreditationRequestCertification">Extension of Scope</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span> Please select the appropriate Management System (MS) Scope for which accreditation is requested *</p>
						<div class="wizard-form-radio d-block">
							<input value="Quality MS - (ISO/IEC 17021-3:2017)" type="radio"<%=applicantInfo!=null &&applicantInfo.getManagementSystem().equals("Quality MS - (ISO/IEC 17021-3:2017)")? "checked":StringPool.BLANK%> name="managementSystem">
							<label for="managementSystem">Quality MS - (ISO/IEC 17021-3:2017)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Environmental MS - (ISO/IEC 17021-2:2016)" type="radio"<%=applicantInfo!=null &&applicantInfo.getManagementSystem().equals("Environmental MS - (ISO/IEC 17021-2:2016)")? "checked":StringPool.BLANK%> name="managementSystem">
							<label for="managementSystem">Environmental MS - (ISO/IEC 17021-2:2016)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Food Safety MS (ISO/TS 22003:2013)" type="radio"<%=applicantInfo!=null &&applicantInfo.getManagementSystem().equals("Food Safety MS (ISO/TS 22003:2013)")? "checked":StringPool.BLANK%> name="managementSystem">
							<label for="managementSystem">Food Safety MS (ISO/TS 22003:2013)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Occupational Health and Safety MS - (ISO/IEC/TS 17021-10:2018)" type="radio"<%=applicantInfo!=null &&applicantInfo.getManagementSystem().equals("Occupational Health and Safety MS - (ISO/IEC/TS 17021-10:2018)")? "checked":StringPool.BLANK%> name="managementSystem">
							<label for="managementSystem">Occupational Health and Safety MS - (ISO/IEC/TS 17021-10:2018)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Other" type="radio"<%=applicantInfo!=null &&applicantInfo.getManagementSystem().equals("Other")? "checked":StringPool.BLANK%> name="managementSystem">
							<label for="managementSystem">Other</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 otherManagementSystem hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Please Specify</p>
						<input type="text" class="form-control" id="specifyOtherManagementSystem" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getSpecifyOther())?applicantInfo.getSpecifyOther():""%>" placeholder=""/>
						<p class="tab-form-sub-heading" id="">*NB: Additional information will be required in Part B, Section B, 4.0 of this application form.</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading">List all standard(s) that apply</p>
						<input type="text" class="form-control" id="listOfStandard" placeholder="" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getListOfStandard())?applicantInfo.getListOfStandard():""%>" name="listOfStandard"> 
						<p class="tab-form-sub-heading">Separate values with Enter</p>
					</div> 
				</div>
				<!-- INSTRUCTION -->
				<div class="col-md-12"> 
					<p class="tab-form-main-heading">We hereby apply for accreditation for the certification activity(ies) detailed in the attached documents.</p> 
					<p class="tab-form-main-heading">On the granting of accreditation, we agree:</p> 
					<ul class="list-group tab-form-sub-heading"> 
						<li class="list-group-item">a) To abide by the requirements stated in ISO/IEC 17021-1:2015 and <span class="standard-list"></span></li> 
						<li class="list-group-item">b) To abide by all the statutory requirements of the field of management systems certification for which accreditation is requested</li> 
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
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span> Name of Authorized Personnel *</p>
						<input type="text" class="form-control" id="authorizedPersonnelManagementName" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getAuthorizedPersonnelName())?applicantInfo.getAuthorizedPersonnelName():""%>" placeholder=""/>
						<p class="tab-form-sub-heading fieldAlert hide" id="authorizedPersonnelManagementNameValidation" style="color: red;">Enter a Name of Authorized Personnel</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Position</p>
						<input type="text" class="form-control" id="authorizedPersonnelManagementPosition" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getAuthorizedPersonnelPos())?applicantInfo.getAuthorizedPersonnelPos():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="authorizedPersonnelManagementDate" value="<%=Validator.isNotNull(applicantInfo)&&Validator.isNotNull(applicantInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(applicantInfo.getAuthorizedPersonnelDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para"><span class="tab-form-highlghtme-link pr-2">13.</span> Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2" id="authorizedPersonnelManagementImageHolder">
					<%if(Validator.isNotNull(signAuthPersonnelCerti)){ %>
							<img src="<%=signAuthPersonnelCerti%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="authorizedPersonnelManagementBtn" hidden="" name="<portlet:namespace/>authorizedPersonnelManagementBtn">
					<label for="authorizedPersonnelManagementBtn" class="choose-sign-btn">
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
					<div class="signature_texarea mb-2" id="companyStampManagementImageHolder">
					<%if(Validator.isNotNull(companyStampCerti)){ %>
							<img src="<%=companyStampCerti%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="companyStampManagementBtn" hidden="" name="<portlet:namespace/>companyStampManagementBtn">
					<label for="companyStampManagementBtn" class="choose-sign-btn">
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
							Except for information that the applicant makes publicly available, or when agreed in writing between JANAAC 
							and the applicant, all  other information obtained during the accreditation process will be considered proprietary 
							and shall be regarded as confidential. If  JANAAC is required by law or authorized by contractual arrangements to 
							release confidential information, the applicant will, unless  prohibited by law, be notified of the information to be provided. 
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
	<button type="button" id="saveName" onclick="accCerBodiesApplicationInfo(false);"
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
<!-- Application Form End-->

<!-- General Instructions Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep24">
	<div class="tab-form">
		<div class="laboratories-medical-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">I. General Instructions</p>
					<!-- <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">1. Applicants should review the relevant requirements (please see the General Criteria for Conformity 
						Assessment Body Accreditation-JANAAC/DOC33 on the JANAAC website or in your information package), as well as statutory and other 
						regulations and standards that pertain to their facilities and  field of certification and the accreditation being sought. 
						They should also ensure that these are understood and fulfilled to the best of the applicant's ability, before submitting the 
						completed Application Form and Questionnaire for the Accreditation of Certification Bodies. </li> 
						<li class="list-group-item">2. Responses to each question and attached listings must be clear and concise.</li> 
						<li class="list-group-item">3. Material deemed to provide necessary additional information, e.g. promotional material, annual 
						reports, etc. can be submitted, but must be clearly titled as appendices and referenced to specific questions on this application 
						form and questionnaire.</li> 
						<li class="list-group-item">4. Any question or item on this application form and questionnaire that is deemed to be "not applicable" 
						to the applicant's facility should be indicated as such. </li> 
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
						<li class="list-group-item">1. Proof of legal status/identity of the Certification Body (CLAUSE 5.1.1)</li> 
						<li class="list-group-item">2. Copy/generic template of organization's legally enforceable client agreement for providing certification 
						services. See Question 24. In Section B (CLAUSE 5.1.2)</li> 
						<li class="list-group-item">3. Risk analysis related to potential conflicts of interest and threats to impartiality (CLAUSE 5.2.3)</li> 
						<li class="list-group-item">4. An authorized copy of the management system manual and/or associated documents that outline 
						compliance to the requirements of ISO/IEC 17021-1 and all other applicable standards. See Question 24. In Section B (CLAUSE 10.2.2)</li> 
						<li class="list-group-item">5. Documentation outlining organizational structure, including relationship to other parts within the same 
						legal entity, if applicable, and related details for ALL personnel (both full time and contracted) involved in the certification process 
						(i.e. job descriptions, resumes and/or other evidence of qualification competence) (CLAUSE 6.1.1, 7.2)</li>
						<li class="list-group-item">6. Evidence of qualifications, competence and industry scopes for all auditors/technical experts utilized 
						by the organization to conduct certification audits (CLAUSE 7.1.3).</li>
						<li class="list-group-item">7. Copies of certificates of qualification of the head and deputy head of the Certification Body as well as 
						any other person(s) with signatory authority (include specimen signatures) (CLAUSE 6.1.1)</li>
						<li class="list-group-item">8. Evidence of adequate provisions to cover liabilities arising from the operations of the organization, e.g.,
						 insurance (CLAUSE 5.3).</li>
						<li class="list-group-item">9. Sample of (blank) certification documentation (CLAUSE 8.2);</li>
						<li class="list-group-item">10. Evidence of accreditation received from any other accreditation body, if applicable</li>
						<li class="list-group-item">11. List of all current audit clients under the proposed accreditation scope indicating: client name; date of 
						last audit; audit type (i.e. stage 1, stage 2, surveillance, recertification etc.); date granted & date of expiry for current certificate 
						(if applicable); proposed/likely date of next audit, and geographical locations/company addresses within certified scope 
						(indicating single vs. multisite operations).</li>
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
<div class="tab-pane" role="tabpanel" id="childStep25">
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
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.0</span> Is the Certification Body a legal entity or a defined part of a legal entity? [Clause 5.1.1] </p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="certificationLegalEntity">
							<label for="certificationLegalEntity">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="certificationLegalEntity">
							<label for="certificationLegalEntity">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 legalStatusDescribe hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.0</span> Describe the legal status and corporate ownership of the organization</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="certificationLegalStatusEntity" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerLegalStatusEntity())?cerBodyGenInfo.getCerLegalStatusEntity():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.0</span> Outline all major sources of income for the Certification Body. 
						(i.e. service fees, corporate funding, government grants, other etc.) [Clause 5.3.2]</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="incomeMajorSources" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerMajorIncomeSources())?cerBodyGenInfo.getCerMajorIncomeSources():""%></textarea>
					</div> 
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCertificationBodiesGeneral(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep26">
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
					<p class="tab-form-main-heading">
				       <span class="tab-form-highlghtme-link pr-2">4.0</span> Indicate in the section below, the certification schemes offered, for which accreditation is being requested. 
				       Also, include technical competence/expertise and limits of capability where applicable. [Clause 7.1.1; 8.1.1c]
				    </p>
				    <p class="tab-form-main-heading "><b>Certification Standard</b></p>
				    <p class="tab-form-main-heading ">Select all relevant standards for which your organization performs certification</p>
				    <p class="tab-form-main-heading "><b>Field(s) of Expertise</b></p>
				    <p class="tab-form-main-heading mb-0">For each standard selected, state the specific technical fields/sectors for which employed/contracted
				    auditors are competent, e.g. food, agriculture, transport, education, public administration, IT, hospitality, 
				    finance, construction, energy/oil/gas, etc. Indicate where applicable, the relevant accreditation scope codes as outlined in IAF ID 1:2014, 
				    NACE Rev. 2, or suitable system of industry classification.</p>
				 </div>
				 <div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Certification Standard</p>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard1" value="ISO 9001"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 9001")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard1" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 9001</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField1" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField1())?cerBodyScope.getExpertiseField1():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard2" value="ISO 14001"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 14001")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard2" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 14001</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField2" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField2())?cerBodyScope.getExpertiseField2():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard3" value="ISO 22000"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 22000")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard3" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 22000</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField3" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField3())?cerBodyScope.getExpertiseField3():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard4" value="ISO 45001"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 45001")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard4" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 45001</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField4" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField4())?cerBodyScope.getExpertiseField4():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard5" value="OHSAS 18000"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("OHSAS 18000")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard5" class="mb-0">
								<p class="tab-form-main-heading mb-0">OHSAS 18000</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField5" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField5())?cerBodyScope.getExpertiseField5():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard6" value="GMP/HACCP"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("GMP/HACCP")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard6" class="mb-0">
								<p class="tab-form-main-heading mb-0">GMP/HACCP</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField6" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField6())?cerBodyScope.getExpertiseField6():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard7" value="FSSC 22000"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("FSSC 22000")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard7" class="mb-0">
								<p class="tab-form-main-heading mb-0">FSSC 22000</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField7" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField7())?cerBodyScope.getExpertiseField7():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard8" value="BRC"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("BRC")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard8" class="mb-0">
								<p class="tab-form-main-heading mb-0">BRC</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField8" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField8())?cerBodyScope.getExpertiseField8():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard9" value="Global G.A.P."<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("Global G.A.P.")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard9" class="mb-0">
								<p class="tab-form-main-heading mb-0">Global G.A.P.</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField9" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField9())?cerBodyScope.getExpertiseField9():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard10" value="SQF"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("SQF")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard10" class="mb-0">
								<p class="tab-form-main-heading mb-0">SQF</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField10" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField10())?cerBodyScope.getExpertiseField10():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard11" value="ISO 27001"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 27001")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard11" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 27001</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField11" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField11())?cerBodyScope.getExpertiseField11():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard12" value="ISO 50001"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 50001")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard12" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 50001</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField12" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField12())?cerBodyScope.getExpertiseField12():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard13" value="ISO 22301"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("ISO 22301")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard13" class="mb-0">
								<p class="tab-form-main-heading mb-0">ISO 22301</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField13" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField13())?cerBodyScope.getExpertiseField13():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>
						
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="certificationStandard14" value="Other"<%=cerBodyScope!=null &&cerBodyScope.getCertificationStandard().contains("Other")? "checked":StringPool.BLANK%> name="certificationStandard"> 
							<label for="certificationStandard14" class="mb-0">
								<p class="tab-form-main-heading mb-0">Other</p>
							</label>
						</div>
						<div class="row certificationExpertiseBox px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Field of Expertise</p>
									<input type="text" class="form-control" id="expertiseField14" placeholder="" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getExpertiseField14())?cerBodyScope.getExpertiseField14():""%>" autocomplete="off"/>
								</div>
							</div>
						</div>								
					</div>
				</div>
				
				<div class="col-md-12">
					<p class="tab-form-main-heading mb-0">
				        <span class="tab-form-highlghtme-link pr-2">5.0</span> List the registered client organizations for which the certification body currently provides certification services 
				        (add additional lines as necessary). State also the applicable certification standard(s), scope and business area/sector in which the 
				        client operates. Indicate the applicable Accreditation Scope code based on IAF MD 1:2014, NACE Rev. 2 or suitable system of industry 
				        classification. [Clause 5.2.3]
				    </p>
					<input id="registeredClientOrgVal" type="hidden" name="registeredClientOrgVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="registeredClientOrgDetailBox">
							<div class="accordion__header is-active"
								id="registeredClientOrgDetail" onclick="expandDetails(this.id)">
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
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Client Organization</p>
											<input type="text" class="form-control" id="clientOrganization" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification Standard(s)</p>
											<input type="text" class="form-control"
												id="certificationStandard" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Current certification scope & Industry code</p>
											<input type="text" class="form-control"
												id="currentCertification" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date first granted</p>
											<input type="date" class="form-control" id="clientOrgDate" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addRegisteredClientOrgDetail" onclick="addRegisteredClientOrgDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addRegisteredClientOrgDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addRegisteredClientOrgDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">Client Organization</th>
									<th class="sub_heading text-nowrap">Certification Standard(s)</th>
									<th class="sub_heading text-nowrap">Current certification scope & Industry code</th>
									<th class="sub_heading text-nowrap">Date first granted</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="registeredClientOrgEditTab" onclick="registeredClientOrgEditTab('<%=cerScopeServiceAddCounter%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="registeredClientOrgDeleteDataTab" onclick="registeredClientOrgDeleteData('<%=cerScopeServiceAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				</div>
										
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.0</span> Indicate interested parties (persons or organizations), excluding clients and staff, 
						stating their specific  interest. (e.g. government ministries, public/private entities, individuals etc.) [Clause 5.2.3]</p>
						<input type="text" class="form-control" id="certificationIntrestedParties" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getCerIntrestedParties())?cerBodyScope.getCerIntrestedParties():""%>" placeholder="">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.0</span> Does the certification body or entities under the same organizational control, 
						provide services other than certification? [Clause 5.2.3]</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getOtherServices().equals("Yes")? "checked":StringPool.BLANK%> name="certificationOtherServices">
							<label for="certificationOtherServices">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getOtherServices().equals("No")? "checked":StringPool.BLANK%> name="certificationOtherServices">
							<label for="certificationOtherServices">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 certificationOtherServicesBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.0</span> Briefly describe the nature of these services and the general 
						groups who are clients of these services</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="certificationOtherServicesDescribe" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getOtherServicesDescribe())?cerBodyScope.getOtherServicesDescribe():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.0</span> Does the certification body have established relationships with any organizations 
						that perform internal auditing or consultancy services? [Clause 5.2.7]</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getEstablishedRelation().equals("Yes")? "checked":StringPool.BLANK%> name="certificationEstablishedRelation">
							<label for="certificationEstablishedRelation">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getEstablishedRelation().equals("No")? "checked":StringPool.BLANK%> name="certificationEstablishedRelation">
							<label for="certificationEstablishedRelation">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 certificationEstablishedRelationBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.0</span> Give a brief description of the organization(s), services provided and the nature/extent 
						of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="certificationEstablishedRelationDesc" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getEstablishedRelDesc())?cerBodyScope.getEstablishedRelDesc():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.0</span> Has your organization provided certification services for any client that has received consultancy or 
						internal audit services from any organization described in 9 and 10 above? [Clause 5.2.6; 5.2.7] </p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getClientService().equals("Yes")? "checked":StringPool.BLANK%> name="certificationClientService">
							<label for="certificationClientService">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getClientService().equals("No")? "checked":StringPool.BLANK%> name="certificationClientService">
							<label for="certificationClientService">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.0</span> Has your organization provided certification services for any client that is also a 
						certification body? [Clause 5.2.4] </p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getCertificationCerBody().equals("Yes")? "checked":StringPool.BLANK%> name="certificationForCerBodyService">
							<label for="certificationForCerBodyService">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getCertificationCerBody().equals("No")? "checked":StringPool.BLANK%> name="certificationForCerBodyService">
							<label for="certificationForCerBodyService">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getOrgAccredited().equals("Yes")? "checked":StringPool.BLANK%> name="orgAccreditedAnotherAccreditation">
							<label for="orgAccreditedAnotherAccreditation">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyScope!=null &&cerBodyScope.getOrgAccredited().equals("No")? "checked":StringPool.BLANK%> name="orgAccreditedAnotherAccreditation">
							<label for="orgAccreditedAnotherAccreditation">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="row hide orgAccreditedAnotherAccreditationBox">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0 Indicate:</span></p>
						<p class="tab-form-main-heading">The name of the body responsible for the most recent accreditation</p>
						<input type="text" class="form-control" id="responsibleBodyAccreditation" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getResponsibleBody())?cerBodyScope.getResponsibleBody():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">The expiry date of accreditation</p>
						<input type="date" class="form-control" id="accreditationExpDate" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getAccExpDate())?new SimpleDateFormat("YYYY-MM-dd").format(cerBodyScope.getAccExpDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">The scope for which the certification body is/was accredited</p>
						<input type="text" class="form-control" id="certBodyScope" value="<%=Validator.isNotNull(cerBodyScope)&&Validator.isNotNull(cerBodyScope.getCertBodyScope())?cerBodyScope.getCertBodyScope():""%>" placeholder=""/>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accCerBodiesScopeService(false);"
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