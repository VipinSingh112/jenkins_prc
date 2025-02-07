<div
	class="modal fade commonsavepopup editUnsealedSourcesEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Radionuclide</p>
							<input type="text" class="form-control editUnsealedSourcesRadionuclide" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Maximum Activity in possession at any one time</p>
							<input type="text" class="form-control editUnsealedSourcesActivity" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Total Activity to be acquired per year</p>
							<input type="text" class="form-control editUnsealedSourcesTotalYear" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Use</p>
							<input type="text" class="form-control editUnsealedSourcesUse" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="supporting-document-card my-3 py-2 px-2" style="border:1px solid #d5d3d1"> 
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper d-flex justify-content-between align-items-center">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach 
												File</p>
										</div>
										<div class="right">
											<input type="file" id="editUnsealedCertiCopy"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet_INSTANCE_tkun_haccpStudyNumber">
											<label class="custom-upload" for="editUnsealedCertiCopy">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editUnsealedUpload"></span>
								</div>
							</div>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditUnsealedSourcesPopupDataBtn">
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
	class="modal fade commonsavepopup editSealedSourcesEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Radionuclide</p>
							<input type="text" class="form-control editSealedSourcesRadionuclide" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Maximum Activity to be contained in any single source</p>
							<input type="text" class="form-control editSealedSourcesMaxActivity" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Activity Date</p>
							<input type="text" class="form-control editSealedSourcesActivityDate" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of sealed sources - Categories 1, 2 and 3 to be acquired</p>
							<input type="text" class="form-control editSealedSourcesCategories" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Use</p>
							<input type="text" class="form-control editSealedSourcesUse" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="supporting-document-card my-3 py-2 px-2" style="border:1px solid #d5d3d1"> 
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper d-flex justify-content-between align-items-center">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach 
												File</p>
										</div>
										<div class="right">
											<input type="file" id="editSealedSourceRadDevice"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet_INSTANCE_tkun_haccpStudyNumber">
											<label class="custom-upload" for="editSealedSourceRadDevice">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editSealedSourceUpload"></span>
								</div>
							</div>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditSealedSourcesPopupDataBtn">
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
	class="modal fade commonsavepopup editRadiationDevicesEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Radio-nuclide</p>
							<input type="text" class="form-control editRadiationDevicesRadio" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Maximum Activity</p>
							<input type="text" class="form-control editRadiationDevicesMaxActivity" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Manufacturer</p>
							<input type="text" class="form-control editRadiationDevicesManufacturer" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Type and Name of device</p>
							<input type="text" class="form-control editRadiationDevicesName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Model Number</p>
							<input type="text" class="form-control editRadiationDevicesModelNo" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">No. of devices</p>
							<input type="text" class="form-control editRadiationDevicesNumber" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Use</p>
							<input type="text" class="form-control editRadiationDevicesUse" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="supporting-document-card my-3 py-2 px-2" style="border:1px solid #d5d3d1"> 
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper d-flex justify-content-between align-items-center">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach 
												File</p>
										</div>
										<div class="right">
											<input type="file" id="editRadDeviceCeritificateCopy"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet_INSTANCE_tkun_haccpStudyNumber">
											<label class="custom-upload" for="editRadDeviceCeritificateCopy">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editRadDeviceUpload"></span>
								</div>
							</div>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditRadiationDevicesPopupDataBtn">
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
	class="modal fade commonsavepopup editMedicalPractitionerEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Name</p>
							<input type="text" class="form-control editMedicalPractitionerName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Address</p>
							<input type="text" class="form-control editMedicalPractitionerAddress" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone</p>
							<input type="text" class="form-control editMedicalPractitionerTelephone" 
							value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Fax Number</p>
							<input type="text" class="form-control editMedicalPractitionerFax" value=""
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email</p>
							<input type="text" class="form-control editMedicalPractitionerEmail" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Licence No</p>
							<input type="text" class="form-control editMedicalPractitionerLicenceNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" 
							value="" placeholder="" />
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditMedicalPractitionerPopupDataBtn">
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
	class="modal fade commonsavepopup editSourcesDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Identification of source</p>
							<input type="text" class="form-control editSourceIdentification" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"> State field of application and purpose of the activity in which the radiation source is or will be used</p>
							<input type="text" class="form-control editStateActivity" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditSourcesDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editRadionuclideDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Radionuclide</p>
							<input type="text" class="form-control editRadionuclideDetails" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Activity(Bq)</p>
							<input type="text" class="form-control editActivityDetails" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Activity Date</p>
							<input type="text" class="form-control editActivityDate" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Chemical form</p>
							<input type="text" class="form-control editChemicalDetailsForm" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Serial No</p>
							<input type="text" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" class="form-control editSerialNo" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Location</p>
							<input type="text" class="form-control editRadionuclideLocation" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditRadionuclideDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editGenEquipmentEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Manufacturer</p>
							<textarea rows="3" class="form-control editManufacturerEquipment" maxlength="255"
								 placeholder=""
								style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Model No</p>
							<input type="text" class="form-control editEquipmentModel" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Serial No</p>
							<input type="text" class="form-control editEquipmentSerial" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Max. Operating Potential</p>
							<input type="text" class="form-control editOperatingPotential" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Nature of the equipment in
								which the source is installed</p>
							<textarea rows="3" class="form-control editNatureEquipment"
								maxlength="255" placeholder=""
								style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Location</p>
							<textarea rows="3" class="form-control editRadiationGeneratingLoc" maxlength="255"
								 placeholder=""
								style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Model</p>
							<input type="text" class="form-control editEquipmentModels" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Status</p>
							<input type="text" class="form-control editEquipmentStatusDetail" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Date</p>
							<input type="date" class="form-control editEquipmentDate" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<p class="pt-2 common-para">Signature of legal person</p>
						<div class="signature_texarea mb-2 editLegalPersonSignature" ></div>
						<input type="file" id="editLegalPersonSignatureUpload"
							name="editLegalPersonSignatureUpload"
							onchange="editLegalPersonSignatureUpload" hidden=""> <label
							for="editLegalPersonSignatureUpload" class="choose-sign-btn"> <span
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditGenEquipmentPopupDataBtn">
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
	class="modal fade commonsavepopup editAlternateRsoDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">RSO Name</p>
							<input type="text" class="form-control editAlternateRsoName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Title</p>
							<input type="text" class="form-control editAlternateRsoTitle" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone</p>
							<input type="text" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" class="form-control editAlternateRsoTelephone" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Ext</p>
							<input type="text" class="form-control editAlternateRsoExt" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Fax</p>
							<input type="text" class="form-control editAlternateRsoFax" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email Address</p>
							<input type="text" class="form-control editAlternateRsoEmailAdd" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditAlternateRsoDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editQualifedExpertDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Qualified Expert Name</p>
							<input type="text" class="form-control editQualifedName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Title</p>
							<input type="text" class="form-control editQualifedTitle" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone</p>
							<input type="text" class="form-control editQualifedTelephone" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Ext</p>
							<input type="text" class="form-control editQualifedExt" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Fax</p>
							<input type="text" class="form-control editQualifedFax" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email Address</p>
							<input type="text" class="form-control editQualifedEmailAdd" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">HSRA Registration No</p>
							<input type="text" class="form-control editQualifedRegistrationNo" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">HSRA Registration Expiration Date</p>
							<input type="text" class="form-control editQualifedExpirationDate" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditQualifedExpertDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editAlternateRsoOneDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">RSO Name</p>
							<input type="text" class="form-control editAlternateRsoOneName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Title</p>
							<input type="text" class="form-control editAlternateRsoOneTitle" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone</p>
							<input type="text" class="form-control editAlternateRsoOneTelephone" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Ext</p>
							<input type="text" class="form-control editAlternateRsoOneExt" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Fax</p>
							<input type="text" class="form-control editAlternateRsoOneFax" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email Address</p>
							<input type="text" class="form-control editAlternateRsoOneEmailAdd" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditAlternateRsoOneDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editQualifedExpertOneDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Qualified Expert Name</p>
							<input type="text" class="form-control editQualifedOneName" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Title</p>
							<input type="text" class="form-control editQualifedOneTitle" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone</p>
							<input type="text" class="form-control editQualifedOneTelephone" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Ext</p>
							<input type="text" class="form-control editQualifedOneExt" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Fax</p>
							<input type="text" class="form-control editQualifedOneFax" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Email Address</p>
							<input type="text" class="form-control editQualifedOneEmailAdd" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">HSRA Registration No</p>
							<input type="text" class="form-control editQualifedOneRegistrationNo" value=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">HSRA Registration Expiration Date</p>
							<input type="text" class="form-control editQualifedOneExpirationDate" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditQualifedExpertOneDetailPopupDataBtn">
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
	class="modal fade commonsavepopup editAcknowledgementMedicalEditTabPopup tab-plus-wizard"
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
						<p class="pt-2 common-para">Signature</p>
						<div class="signature_texarea mb-2 editAcknowledgementMedicalSignature" ></div>
						<input type="file" id="editAcknowledgementMedicalSignatureUpload"
							name="editAcknowledgementMedicalSignatureUpload"
							onchange="editAcknowledgementMedicalSignatureUpload" hidden=""> <label
							for="editAcknowledgementMedicalSignatureUpload" class="choose-sign-btn"> <span
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
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Date</p>
							<input type="date" class="form-control editAcknowledgementMedicalDate" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditAcknowledgementMedicalPopupDataBtn">
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
	class="modal fade commonsavepopup editApplicantSignatureEditTabPopup tab-plus-wizard"
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
						<p class="pt-2 common-para">Signature</p>
						<div class="signature_texarea mb-2 editApplicantSignaturelegalSignature" ></div>
						<input type="file" id="editApplicantSignaturelegalSignatureUpload"
							name="editApplicantSignaturelegalSignatureUpload"
							onchange="editApplicantSignaturelegalSignatureUpload" hidden=""> <label
							for="editApplicantSignaturelegalSignatureUpload" class="choose-sign-btn"> <span
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
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Date</p>
							<input type="date" class="form-control editApplicantSignatureDate" value=""
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditApplicantSignaturePopupDataBtn">
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
<script>
$(document).on('change', '#editLegalPersonSignatureUpload', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $(".editLegalPersonSignature");
    /* var image_holder = $(".editDriverSignature"); */
   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
    image_holder.empty();
   /* form1a_image_holder.empty(); */ 
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
    	$(".editLegalPersonSignature").html("");
    	console.log("Function calling uplaod doc inside loop");
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              })
             /*   .appendTo(form1a_image_holder); */
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });
$(document).on('change', '#editAcknowledgementMedicalSignatureUpload', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $(".editAcknowledgementMedicalSignature");
    /* var image_holder = $(".editDriverSignature"); */
   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
    image_holder.empty();
   /* form1a_image_holder.empty(); */ 
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
    	$(".editAcknowledgementMedicalSignature").html("");
    	console.log("Function calling uplaod doc inside loop");
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              })
             /*   .appendTo(form1a_image_holder); */
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });
$(document).on('change', '#editApplicantSignaturelegalSignatureUpload', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $(".editApplicantSignaturelegalSignature");
    /* var image_holder = $(".editDriverSignature"); */
   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
    image_holder.empty();
   /* form1a_image_holder.empty(); */ 
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
    	$(".editApplicantSignaturelegalSignature").html("");
    	console.log("Function calling uplaod doc inside loop");
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              })
             /*   .appendTo(form1a_image_holder); */
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });
</script>