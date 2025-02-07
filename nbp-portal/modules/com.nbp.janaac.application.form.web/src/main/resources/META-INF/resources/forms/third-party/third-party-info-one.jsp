<%@ include file="../../init.jsp" %>
<!-- Application Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep54">
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
						<input type="text" class="form-control" id="applicantNameThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getApplicantName())?accThirdPartyAppliInfo.getApplicantName():""%>" placeholder="Applicant Name" />
						<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameThirdPartyValidation" style="color: red;">Enter a Name of Applicant</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span> Applicant's Address</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddressThirdParty" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getApplicantAddress())?accThirdPartyAppliInfo.getApplicantAddress():""%></textarea>
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
					 <input type="text" class="form-control" id="applicantTelephoneThirdParty" placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getApplicantTelephone())?accThirdPartyAppliInfo.getApplicantTelephone():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Fax No.</p> 
					 <input type="text" class="form-control" id="applicantFaxThirdParty" placeholder="" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getApplicantFaxNo())?accThirdPartyAppliInfo.getApplicantFaxNo():""%>"
					 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-4"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">Website</p> 
					 <input type="text" class="form-control" id="applicantWebsiteThirdParty" placeholder="" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getApplicantWebsite())?accThirdPartyAppliInfo.getApplicantWebsite():""%>"> 
					</div> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">4.</span> Name of
							Certification Body Seeking Accreditation (If different from
							Name of Applicant)
						</p>
						<input type="text" class="form-control"
							id="certificationNameThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getCertificationName())?accThirdPartyAppliInfo.getCertificationName():""%>" placeholder=""
							aria-describedby="ThirdPartyName" />
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">
							<span class="tab-form-highlghtme-link pr-2">5.</span> Address
							of Certification Body Seeking Accreditation (If different from Applicant's Address)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255"
							id="certAddressThirdParty" placeholder="Address"
							style="border-radius: 5px; width: 100%"
							aria-describedby="addressThirdParty"><%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getCertiAddress())?accThirdPartyAppliInfo.getCertiAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span> Name & Email Address of Person in Charge of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelNameThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelName())?accThirdPartyAppliInfo.getPersonnelName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="personnelEmailThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelEmail())?accThirdPartyAppliInfo.getPersonnelEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<input id="personResponsibleThirdPartyVal" type="hidden" name="personResponsibleThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="personResponsibleThirdPartyDetailBox">
							<div class="accordion__header is-active"
								id="personResponsibleThirdPartyDetail" onclick="expandDetails(this.id)">
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
												id="technicalPersonNameThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Email</p>
											<input type="text" class="form-control"
												id="technicalPersonEmailThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addPersonResponsibleThirdPartyDetail" onclick="addPersonResponsibleThirdPartyDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addPersonResponsibleDetailThirdPartyTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addPersonResponsibleDetailThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Email</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
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
<td> 
	<span> 
		<a href="javascript:void(0)" id="personResponsibleThirdPartyEditTab" onclick="personResponsibleThirdPartyEditTab('<%=counterOfFdaAppliInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="personResponsibleThirdPartyDeleteDataTab" onclick="personResponsibleThirdPartyDeleteData('<%=counterOfFdaAppliInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
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
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span> Name & Email Address of Contact Person</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonNameThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelContactName())?accThirdPartyAppliInfo.getPersonnelContactName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="contactPersonEmailThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelContactEmail())?accThirdPartyAppliInfo.getPersonnelContactEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
						
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span> Name & Email Address of Financial Manager of Certification Body</p>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerNameThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelFMName())?accThirdPartyAppliInfo.getPersonnelFMName():""%>" placeholder="Name"/>
							</div>
							<div class="col-md-6">
								<input type="text" class="form-control" id="financialManagerEmailThirdParty" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getPersonnelFMEmail())?accThirdPartyAppliInfo.getPersonnelFMEmail():""%>" placeholder="info@companyname.jm"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span> Please select the Appropriate Accreditation Request</p>
						<div class="wizard-form-radio d-block">
							<input value="1st Accreditation" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccreditationRequest().equals("1st Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestThirdParty" id="firstAccreditation">
							<label for="accreditationRequestThirdParty">1st Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Transfer of Accreditation" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccreditationRequest().equals("Transfer of Accreditation")? "checked":StringPool.BLANK%> name="accreditationRequestThirdParty">
							<label for="accreditationRequestThirdParty">Transfer of Accreditation</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Extension of Scope" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccreditationRequest().equals("Extension of Scope")? "checked":StringPool.BLANK%> name="accreditationRequestThirdParty">
							<label for="accreditationRequestThirdParty">Extension of Scope</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span> Please select the applicable FDA Scheme(s) for which accreditation is being sought*:</p>
						<div class="wizard-form-radio d-block">
							<input value="Third Party Programme (TPP)" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccFdaScheme().equals("Third Party Programme (TPP)")? "checked":StringPool.BLANK%> name="accreditationFdaScheme">
							<label for="accreditationFdaScheme">Third Party Programme (TPP)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Foreign Supplier Verification Program (FSVP)" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccFdaScheme().equals("Foreign Supplier Verification Program (FSVP)")? "checked":StringPool.BLANK%> name="accreditationFdaScheme">
							<label for="accreditationFdaScheme">Foreign Supplier Verification Program (FSVP)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Voluntary Qualified Importer Program (VQIP)" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccFdaScheme().equals("Voluntary Qualified Importer Program (VQIP)")? "checked":StringPool.BLANK%> name="accreditationFdaScheme">
							<label for="accreditationFdaScheme">Voluntary Qualified Importer Program (VQIP)</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Other" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getAccFdaScheme().equals("Other")? "checked":StringPool.BLANK%> name="accreditationFdaScheme">
							<label for="accreditationFdaScheme">Other</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 accreditationFdaSchemeOther hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Please Specify</p>
						<input type="text" class="form-control" id="accreditationFdaSchemeOther" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getSpecifyOther())?accThirdPartyAppliInfo.getSpecifyOther():""%>" placeholder=""  aria-describedby="fdaSchemeOther"/>
						<p class="tab-form-sub-heading" id="fdaSchemeOther">*NB: Additional information will be required in Part B, Section B, 4.0 of this application form.</p>
					</div>
				</div>

				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span> Please select the supplementary certification standard for which accreditation is being sought*:</p>
						<div class="wizard-form-radio d-block">
							<input value="ISO/IEC 17021-1:2015" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getSupplementaryCertificate().equals("ISO/IEC 17021-1:2015")? "checked":StringPool.BLANK%> name="supplementaryCertificateStandard">
							<label for="supplementaryCertificateStandard">ISO/IEC 17021-1:2015</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="ISO/IEC 17065:2012" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getSupplementaryCertificate().equals("ISO/IEC 17065:2012")? "checked":StringPool.BLANK%> name="supplementaryCertificateStandard">
							<label for="supplementaryCertificateStandard">ISO/IEC 17065:2012</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No supplementary standard" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getSupplementaryCertificate().equals("No supplementary standard")? "checked":StringPool.BLANK%> name="supplementaryCertificateStandard">
							<label for="supplementaryCertificateStandard">No supplementary standard</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="Other" type="radio"<%=accThirdPartyAppliInfo!=null &&accThirdPartyAppliInfo.getSupplementaryCertificate().equals("Other")? "checked":StringPool.BLANK%> name="supplementaryCertificateStandard">
							<label for="supplementaryCertificateStandard">Other</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 supplementaryCertificateStandardOther hide">
					<div class="form-group">
						<p class="tab-form-main-heading">Please Specify</p>
						<input type="text" class="form-control" id="supplementaryCertificateStandardOther" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getSupplementaryOther())?accThirdPartyAppliInfo.getSupplementaryOther():""%>" placeholder=""  aria-describedby="certificateStandardOther"/>
					</div>
				</div>
				<!-- INSTRUCTION -->
				<div class="col-md-12"> 
					<p class="tab-form-main-heading">We hereby apply for accreditation for the certification activity(ies) detailed in the attached documents.</p> 
					<p class="tab-form-main-heading">On the granting of accreditation, we agree:</p> 
					<ul class="list-group tab-form-sub-heading"> 
						<li class="list-group-item">a) To abide by the applicable requirements stated in 21 CFR Subpart M and <!--list any other standard(s) that apply below -->
							<!-- <ul class="list-group list-group-flush">
								<li class="list-group-item standard-list-third-party"></li>
							</ul> -->
						</li> 
						<li class="list-group-item">b) To abide by all the statutory requirements of the field of management systems certification for which accreditation is requested;</li> 
						<li class="list-group-item">c) To abide by the requirements of JANAAC's accreditation programme;</li> 
						<li class="list-group-item">d) To pay the required annual accreditation fees;</li> 
						<li class="list-group-item">e) That accreditation may be withdrawn, suspended or reduced if we fail to comply with the foregoing, subject only to the rights of appeal set out in the relevant standard and Subpart M.</li>
					</ul> 
					<p class="tab-form-main-heading mt-3">
						<b>We acknowledge the fact that the application fee (paid for the initial assessment) is non-refundable.</b>
					</p>
                     	</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.</span> Name of Authorized Personnel *</p>
						<input type="text" class="form-control" id="authorizedPersonnelThirdPartyName" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getAuthorizedPersonnelName())?accThirdPartyAppliInfo.getAuthorizedPersonnelName():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Position</p>
						<input type="text" class="form-control" id="authorizedPersonnelThirdPartyPosition" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getAuthorizedPersonnelPos())?accThirdPartyAppliInfo.getAuthorizedPersonnelPos():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="authorizedPersonnelThirdPartyDate" value="<%=Validator.isNotNull(accThirdPartyAppliInfo)&&Validator.isNotNull(accThirdPartyAppliInfo.getAuthorizedPersonnelDate())?new SimpleDateFormat("yyyy-MM-dd").format(accThirdPartyAppliInfo.getAuthorizedPersonnelDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para"><span class="tab-form-highlghtme-link pr-2">14.</span> Signature of Authorized Personnel</p>
					<div class="signature_texarea mb-2" id="authorizedPersonnelThirdPartyImageHolder">
					<%if(Validator.isNotNull(signAuthPersonnelFda)){ %>
							<img src="<%=signAuthPersonnelFda%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="authorizedPersonnelThirdPartyBtn" hidden="" name="<portlet:namespace/>authorizedPersonnelThirdPartyBtn">
					<label for="authorizedPersonnelThirdPartyBtn" class="choose-sign-btn">
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
					<div class="signature_texarea mb-2" id="companyStampThirdPartyImageHolder">
					<%if(Validator.isNotNull(companyStampFda)){ %>
							<img src="<%=companyStampFda%>"  width="100" height="100"/>
					<%} %>
					</div>
					<input type="file" id="companyStampThirdPartyBtn" hidden="" name="<portlet:namespace/>companyStampThirdPartyBtn">
					<label for="companyStampThirdPartyBtn" class="choose-sign-btn">
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
							Except for information that the applicant makes publicly available, or when agreed in writing between JANAAC and the applicant, all other information obtained during the accreditation process will be considered proprietary and shall be regarded as confidential. If JANAAC is required by law or authorized by contractual arrangements to release confidential information, the applicant will, unless prohibited by law, be notified of the information to be provided.
						</b>
					</p>
					<p class="tab-form-main-heading">
						<b>
							If, at any point during the application or initial assessment process, there is evidence of fraudulent behaviour, or if the applicant intentionally provides false information or conceals information, JANAAC shall reject the application or terminate the assessment process.
						</b>
					</p>
					<p class="tab-form-main-heading">
						<b>
							All assessments and audits are to be conducted in person.
						</b>
					</p>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accFDAThirdPartyAppliInfo(false);"
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
<div class="tab-pane" role="tabpanel" id="childStep55">
	<div class="tab-form">
		<div class="general-instruction-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">I. General Instructions</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<ul class="list-group tab-form-sub-heading mb-3"> 
						<li class="list-group-item">1. Applicants should review the relevant requirements (please see the General Criteria for Conformity Assessment Body Accreditation-JANAAC/DOC33 on the JANAAC website or in your information
							package), as well as statutory and other regulations and standards that pertain to their facilities and
							field of certification and the accreditation being sought. They should also ensure that these are
							understood and fulfilled to the best of the applicant's ability, before submitting the completed
							Application Form and Questionnaire for the Accreditation of Certification Bodies.</li> 
						<li class="list-group-item">2. Responses to each question and attached listings must be clear and concise.</li> 
						<li class="list-group-item">3. Material deemed to provide necessary additional information, e.g., promotional material, annual reports, etc. can be submitted, but must be clearly titled as appendices and referenced to specific questions on this application form and questionnaire.</li> 
						<li class="list-group-item">4. Any question or item on this application form and questionnaire that is deemed to be "not applicable" to the applicant's facility should be indicated as such.</li> 
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
						<li class="list-group-item">1. Proof of legal status/identity of the Certification Body.</li> 
						<li class="list-group-item">2. Copy/generic template of organization's legally enforceable client agreement for providing certification services.</li> 
						<li class="list-group-item">3. Authorized policy(ies) and agreements outlining the organization's understanding of, commitment to and management of impartiality and confidentiality.</li> 
						<li class="list-group-item">4. Policies/procedures related to the use of license, certificates and marks of conformity.</li> 
						<li class="list-group-item">5. Policies/procedures related to potential conflicts of interest and threats to impartiality.</li>
						<li class="list-group-item">6. An authorized copy of the management system manual and/or associated documents that outline compliance to all applicable requirements as indicated in 11.and 12. of Part A.</li>
						<li class="list-group-item">7. Documentation outlining organizational structure, including relationship to other parts within the same legal entity, if applicable, and related details for ALL personnel (both full time and contracted) involved in the certification process (i.e., job descriptions, resumes and/or other evidence of qualification competence).</li>
						<li class="list-group-item">8. Evidence of qualifications and competence of all auditors and technical experts (both full time and contracted) that are engaged by the organization to conduct certification audits.</li>
						<li class="list-group-item">9. Copies of certificates of qualification of the head and deputy head of the Certification Body as well as any other person(s) with signatory authority (include specimen signatures).</li>
						<li class="list-group-item">10. Evidence of adequate provisions to cover liabilities arising from the operations of the organization, e.g., insurance.</li>
						<li class="list-group-item">11. Sample of (blank) certification documentation.</li>
						<li class="list-group-item">12. Evidence of accreditation received from any other accreditation body, if applicable.</li>
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
<div class="tab-pane" role="tabpanel" id="childStep56"> 
	<div class="tab-form">
		<div class="laboratories-medical-general-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title-subtitle f2">Answer all questions in the fields provided. Where attachments are necessary please ensure that each sheet is signed and dated by the organization/department leader, and the organization stamp/seal affixed.</p>
					<p class="tab-form-title f2">I. General</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.0</span> Is the Certification Body a 
						legal entity or a defined part of a legal entity?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("Yes")? "checked":StringPool.BLANK%> name="thirdPartyLegalEntity">
							<label for="thirdPartyLegalEntity">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyGenInfo!=null &&cerBodyGenInfo.getCerLegalEntity().equals("No")? "checked":StringPool.BLANK%> name="thirdPartyLegalEntity">
							<label for="thirdPartyLegalEntity">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 legalStatusDescribeThirdParty hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.0</span> Describe the legal status and corporate ownership of the organization</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="thirdPartyLegalStatusEntity" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerLegalStatusEntity())?cerBodyGenInfo.getCerLegalStatusEntity():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.0</span> Outline all major sources of income for the 
						Certification Body.(i.e. service fees, corporate funding, government grants, other etc.)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="incomeMajorSourcesThirdParty" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyGenInfo)&&Validator.isNotNull(cerBodyGenInfo.getCerMajorIncomeSources())?cerBodyGenInfo.getCerMajorIncomeSources():""%></textarea>
					</div> 
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick=" accFDAThirdPartyGeneral(false);"
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