<div
	class="modal fade commonsavepopup editApplicantDetailEditTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="modal-body">
				<div class="row">
					<div class="col-md-7">
						<div class="form-group">
							<p class="tab-form-main-heading">Full name of the applicant
								or applicants</p>
							<input type="text" class="form-control editApplicantName"
								placeholder="John Doe" value="" />

							<p class="tab-form-sub-heading fieldAlert hide"
								id="editApplicantNameValidation" style="color: red;">Please
								Enter Name</p>
						</div>
					</div>
					<div class="col-md-5">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone Number</p>
							<input type="text" class="form-control editApplicantTelephone"
								placeholder="22345678"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								value="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Address</p>
							<textarea rows="3" class="form-control editApplicantAddress"
								maxlength="255" placeholder="Enter Address"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Nationality of applicant</p>
							<input type="text" class="form-control editApplicantNationality"
								placeholder="" value="" />
						</div>
					</div>
					<div class="col-md-6"> 
                        <div class="form-group"> 
                          <p class="tab-form-main-heading">Email Address</p> 
                          <input type="text" class="form-control editApplicantEmailAddress" value=""> 
                        </div> 
                    </div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditApplicantDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editHomeDetailEditTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Name, style or title under
								which the home is carried on</p>
							<input type="text" class="form-control editHomeCarriedName"
								placeholder="John Doe" value="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Address of the home</p>
							<textarea rows="3" class="form-control editHomeAddress"
								maxlength="255" placeholder="Enter Address"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone Number of the home</p>
							<input type="text" class="form-control editHomeTelephone"
								placeholder="22345678"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email Address</p>
							<input type="text" class="form-control editHomeEmailAddress"
								value="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Brief description of
								situation, construction, accommodation and equipment of premises</p>
							<textarea rows="3"
								class="form-control editHomeSitutationDescription"
								maxlength="255" placeholder="Enter Description"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">What other business (if any)
								is transacted on the same premises as the home</p>
							<input type="text"
								class="form-control editHomeOtherBusinessPremises"
								placeholder="" value="" />
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				 <div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditHomeDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> 
					<svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
					</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editcompanyDetailEditTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="modal-body">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Full name of individual
								responsible for the management of the home</p>
							<input type="text" class="form-control editComFullName"
								placeholder="John Doe" value="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Private address of person</p>
							<textarea rows="3" class="form-control editComAddress"
								maxlength="255" placeholder="Enter Address"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Registered or principal
								office of Company, society, association or body</p>
							<input type="text" class="form-control editComOffice"
								placeholder="" value="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditCompanyDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editPatientCounEditTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Maternity</p>
							<input type="text"
								class="form-control numeric-field editMaternityPatientNum"
								value="" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
							<p class="tab-form-sub-heading fieldAlert hide"
								id="maternityPatientNumValidation" style="color: red;">Only
								Numeric characters are allowed</p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Other Patients</p>
							<input type="text"
								class="form-control numeric-field editOtherPatientNum" value=""
								placeholder=""
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
							<p class="tab-form-sub-heading fieldAlert hide"
								id="otherPatientNumValidation" style="color: red;">Only
								Numeric characters are allowed</p>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditPatientCounPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editNursingStaffEditTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Names of nursing staff</p>
							<input type="text" class="form-control editNursingStaffName"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Qualifications of nursing
								staff</p>
							<input type="text"
								class="form-control editNursingStaffQualifications" value=""
								placeholder="" />
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditNursingStaffPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editMedicalPractitionerTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Whether it is under the
								charge of a duly qualified medical practitioner or a qualified
								nurse, resident in the Home</p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Name</p>
							<input type="text"
								class="form-control editMedicalPractitionerName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Qualifications</p>
							<input type="text"
								class="form-control editMedicalPractitionerQualifications"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">What is the ratio of
								qualified nurses to other employees employed in the care of the
								patients?</p>
							<input type="text"
								class="form-control editMedicalPractitionerQualifiesNurseRatio"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<p class="tab-form-sub-heading">Note: If the Home is a mixed
							Home (i.e. makes provision for maternity and non-maternity
							patients) this question should be answered with reference to the
							provision made for non-maternity patient.</p>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditMedicalPractitionerDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editMaternityDetailEditTabPopup
tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Whether the person
								superintending the nursing of the patients is a certified nurse
								midwife</p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Name</p>
							<input type="text" class="form-control editMaternityHomeName"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Qualifications</p>
							<input type="text"
								class="form-control editMaternityHomeQualifications" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Whether there is any person
								employed in attending any women in the home in child-birth or in
								nursing any patient in the home, who is not either a duly
								qualified medical practitioner, a certified midwife, a pupil
								midwife or a qualified nurse.</p>
							<input type="text"
								class="form-control editMaternityHomeQualified" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<p class="tab-form-sub-heading">Note: If the Home is a mixed
							Home (i.e. makes provision for maternity and non-maternity
							patients) this question should be answered with reference to the
							provision made for non-maternity patient</p>
					</div>

				</div>
			</div>

			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditMaternityDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editMedicalPractitionerTabPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div
		class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Whether it is under the
								charge of a duly qualified medical practitioner or a qualified
								nurse, resident in the Home</p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Name</p>
							<input type="text"
								class="form-control editMedicalPractitionerName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Qualifications</p>
							<input type="text"
								class="form-control editMedicalPractitionerQualifications"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">What is the ratio of
								qualified nurses to other employees employed in the care of the
								patients?</p>
							<input type="text"
								class="form-control editMedicalPractitionerQualifiesNurseRatio"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<p class="tab-form-sub-heading">Note: If the Home is a mixed
							Home (i.e. makes provision for maternity and non-maternity
							patients) this question should be answered with reference to the
							provision made for non-maternity patient.</p>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditMedicalPractitionerDetailPopupDataBtn">
						Save<span class="ml-2"> </span>
					</a> <span class="ml-3"> <svg width="16" height="16"
							viewBox="0 0 16 16" fill="none"
							xmlns="http://www.w3.org/2000/svg">
							<path
								d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
								fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>