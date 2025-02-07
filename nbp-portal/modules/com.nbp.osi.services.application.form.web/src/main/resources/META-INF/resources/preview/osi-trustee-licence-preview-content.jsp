<%@ include file="../init.jsp" %>
<div class="hide" id="osiTrusteeIndiLicencePre">
	<section class="final-preview-section" id="osiServicesPreviewStep5">
		<div class="general-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Information(Form 54)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="indiGenInfoEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Family Name</p>
						<p class="sub_heading_content" id="indiFamilyNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Given Name(s)</p>
						<p class="sub_heading_content" id="indiGivenNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Birth</p>
						<p class="sub_heading_content" id="indiDateOfBirthPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Other Previous Legal Names or Aliases</p>
						<p class="sub_heading_content" id="indiOtherLegalNamesPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Business Address</p>
						<p class="sub_heading_content" id="indiBusinessAddressPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="indiBusinessTeleNoPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="indiBusinessFaxNoPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email</p>
						<p class="sub_heading_content" id="indiBusinessEmailPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Home Address</p>
						<p class="sub_heading_content" id="indiHomeAddressPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="indiHomeTeleNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="indiHomeFaxNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email</p>
						<p class="sub_heading_content" id="indiHomeEmailPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Current Employer</p>
						<p class="sub_heading_content" id="indiCurrentEmployerPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Employment</p>
						<p class="sub_heading_content" id="indiDateOfEmploymentPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Professional Organization(s)</p>
						<p class="sub_heading_content" id="indiProfessionalOrgPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep6">
		<div class="qualifications-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Qualifications(Form 54)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="indiQualificationEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading qualificationsForm"></p>
						<p><a class="sub_heading_content" id="qualificationsForm-preview" href="<%=Validator.isNotNull(ualificationUrl)? ualificationUrl:""%>"><%=(Validator.isNotNull(qualificationForm))?qualificationForm:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> 
						Formal education (degrees, professional designations, 
						year of conferment, post-secondary institutions) and relevant work experience. 
						Please provide curriculum vitae 
					</p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">If you are a member of a professional organization, do you intend to 
							retain your membership in that organization when you begin to practise as a trustee</p>
						<p class="sub_heading_content" id="orgMemberPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep7">
		<div class="declaration-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Declaration and Signature(Form 54)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="indiSignatureEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Applicant's Name</p>
						<p class="sub_heading_content" id="indiUndersignedApplicantNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="indiUndersignedDatedPreview"></p>
					</div>
				</div> 
				<div class="col-12">
					<p class="sub_heading"> 
						I,<span class="giluio indiUndersignedApplicantName"></span>, the undersigned, do solemnly declare that I am the applicant named in this application and that
						the information set out in this application and in the attached documents is, to the best of my
						knowledge and belief, true, correct and complete in all respects, and that I agree to respect the
						conditions contained in this form, if the Supervisor of Insolvency issues me a licence.
					</p>
					<p class="pt-2 common-para">Signature of Applicant</p>			
					<div class="signature_texarea mb-2" id="indi-undersigned-image-holder-pre">
						<%if(Validator.isNotNull(fileUrlTrustUnderSign)){ %>
							<img src="<%=fileUrlTrustUnderSign%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep8">
		<div class="trustee-licence-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Trustee Licence Breakdown(Form 54)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="indiBreakdownEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="indiBreakdownApplicantNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Firm</p>
						<p class="sub_heading_content" id="indiBreakdownFirmPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div>
						<p>Amount of time worked by the Applicant for a trustee licence</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addYearlyWorkingTimeTable">
							<tr>
								<th class="sub_heading text-nowrap">During(Year)</th>
								<th class="sub_heading text-nowrap">Individual Bankruptcies</th>
								<th class="sub_heading text-nowrap">Individual Proposals</th>
								<th class="sub_heading text-nowrap">Commercial Bankruptcies</th>
								<th class="sub_heading text-nowrap">Commercial Proposals</th>
								<th class="sub_heading text-nowrap">Interim Receiverships</th>
								<th class="sub_heading text-nowrap">Receiverships, Agency, Look-see, Secured Creditors</th>
								<th class="sub_heading text-nowrap">Other work not directly related to insolvency work</th>
							</tr>
							<%
											if (addinfo != null) {
												int counterYear = 1;
												for (OsiServicesTrusteeBreadDownAddinfo addInfos : addinfo) {
										%>
										<td
											class="sub_heading_content breakdownWorkingYear<%=counterYear%> ">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getBreakdownWorkingYear())? addInfos.getBreakdownWorkingYear(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingBankrupties<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingBankrupties())? addInfos.getWorkingBankrupties(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingProposal<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingProposal())? addInfos.getWorkingProposal(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingComBankrupts<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingComBankrupts())? addInfos.getWorkingComBankrupts(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingComProposal<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingComProposal())? addInfos.getWorkingComProposal(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingInterimReceive<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingInterimReceive())? addInfos.getWorkingInterimReceive(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingCreditors<%=counterYear%>">
											<%=Validator.isNotNull(addInfos)&& Validator.isNotNull(addInfos.getBreakdownWorkingCreditors())? addInfos.getBreakdownWorkingCreditors(): ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingOther<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getBreakdownWorkingOther())? addInfos.getBreakdownWorkingOther(): ""%>
										</td>
									<input type="hidden" id="yearlyWorkingTime<%=counterYear%>"
										name="yearlyWorkingTime<%=counterYear%>"
										value="<%=Validator.isNotNull(addInfos) ? addInfos.getOsiTrusId() : ""%>">
									<%
										counterYear++;
											}
										}
									%>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row"> 
				<div class="col-12">
					<p class="sub_heading"> 
						I, <span class="giluio indiUndersignedApplicantName"></span>, the undersigned applicant for a trustee licence, hereby attest that the above information faithfully reflects my experience in insolvency and other fields during the periods shown above.
					</p>
					<p class="pt-2 common-para">Signature of Applicant</p>			
					<div class="signature_texarea mb-2" id="breakdown-applicant-image-holder-pre">
						<%if(Validator.isNotNull(fileUrlBreakDownSign)){ %>
							<img src="<%=fileUrlBreakDownSign%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="indiBreakdownDatedPreview"></p>
					</div>
				</div>
					<div class="col-md-6">
					<div>
						<p class="sub_heading">Trustee's Name</p>
						<p class="sub_heading_content" id="indiBreakdownTrusteeNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="indiBreakdownTrusteeDatePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> 
						I, <span class="giluio indiBreakdownTrusteeName"></span>, the undersigned, a trustee of the firm where the above applicant trustee is presently employed or associated, hereby attest that the information provided by the applicant trustee, for the period of time with this firm, faithfully reflects the extend of his/her experience in the insolvency and other fields.
					</p>
					<p class="pt-2 common-para">Signature of Applicant</p>			
					<div class="signature_texarea mb-2" id="breakdown-trustee-image-holder-pre">
						<%if(Validator.isNotNull(fileUrlBreakTrusteeDownSign)){ %>
							<img src="<%=fileUrlBreakTrusteeDownSign%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep9">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Documents List(Form 54)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="indiDocumentEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">The following must also be provided with this application(Form 54)</p>
						<p class="sub_heading_content" id="indSupportingDocPreview"></p>
					</div>
				</div> 
			</div>
		</div>
	</section>
</div>
<!-- ---COMPANY--- -->
<div class="hide" id="osiTrusteeComLicencePre">
	<section class="final-preview-section" id="osiServicesPreviewStep10">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Information(Form 54A)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="comBreakdownEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name of Corporation</p>
						<p class="sub_heading_content" id="comCorporationNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Address of Head Office</p>
						<p class="sub_heading_content" id="comHeadOfficeAddressPreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="comTeleNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No.</p>
						<p class="sub_heading_content" id="comFaxNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email</p>
						<p class="sub_heading_content" id="comEmailPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Incorporated</p>
						<p class="sub_heading_content" id="otherCountryPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Incorporation</p>
						<p class="sub_heading_content" id="comIncorporationDatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">For which Licence is requested</p>
						<p class="sub_heading_content" id="comLicenceRequestPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep11">
		<div class="company-signature-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Signature(Form 54A)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="comSignatureEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> 
						I, <span class="giluio comCorporationName"></span>, the undersigned, do solemnly declare that I am authorized to submit the present application on behalf of the corporation named herein and that the information set out in this application and in the attached documents is, to the best of my knowledge and belief, true, correct and complete in all respects.
					</p>
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="undersigned-com-image-holder-pre">
						<%if(Validator.isNotNull(fileUrlBreakTrusteeDownComSign)){ %>
							<img src="<%=fileUrlBreakTrusteeDownComSign%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Incorporation</p>
						<p class="sub_heading_content" id="comUndersignedIncorporationDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep12">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Documents List(Form 54A)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="comDocumentEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Please fill out this page and return with your qualification.</p>
						<p class="sub_heading_content" id="comSupportingDocPreview"></p>
					</div>
				</div> 
			</div>
		</div>
	</section>
</div>
<div id="osiCommonApplicationPreview">
	<section class="final-preview-section" id="osiServicesPreviewStep13">
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
	<section class="final-preview-section hide fee-section" id="osiServicesPreviewStep14">
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
</div>