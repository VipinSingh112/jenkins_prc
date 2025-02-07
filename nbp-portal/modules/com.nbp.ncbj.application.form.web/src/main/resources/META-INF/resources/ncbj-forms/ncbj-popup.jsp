<%@ include file="/init.jsp" %>
<div class="modal fade commonsavepopup editApplicantDetailEditTabPopupOne tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="accordion__body is-active ">
						<div class="row">
							
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Business Address and Physical Location of Premises</p>
									<textarea rows="3"  class="form-control editApplicantAddressOne" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number and time of Shifts</p>
									<input type="text" class="form-control editApplicantShifts" placeholder="22345678" oninput=""
									value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Types of Products/Services</p>
									<input type="text" class="form-control editApplicantProductTypes" placeholder="" oninput=""
									value=""/>
									
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Head Office/Site Name</p>
									<input type="text" class="form-control editHeadOffices" placeholder="" oninput=""
									value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of full time employees</p>
									<input type="text" class="form-control editNoOfFullTimeEmployees" placeholder="22345678" oninput=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""/>
									
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of part time employees</p>
									<input type="text" class="form-control editNoOfPartTimeEmployees" placeholder="22345678" oninput=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contractors</p>
									<input type="text" class="form-control editNoOfContractors" placeholder="22345678" oninput=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""/>
									
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contracted workers</p>
									<input type="text" class="form-control editNoOfContractedWorkers" placeholder="22345678" oninput=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1'); "value=""/>
									
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditApplicantDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="modal fade commonsavepopup editEffectiveApplicantDetailEditTabPopupOne tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
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
									<p class="tab-form-main-heading">Number of full time
										employees</p>
									<input type="text" class="form-control editNoOfFullTimeEmployees" placeholder="22345678"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of part time
										employees</p>
									<input type="text" class="form-control editNOfPartTimeEmployees"
										 placeholder="22345678"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contractors</p>
									<input type="text" class="form-control editNoOfContractors" 
										placeholder="22345678" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
										value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contracted
										workers</p>
									<input type="text" class="form-control editNoOfContractedWorkers"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addEffectiveApplicantDetail"
									onclick="addEffectiveApplicantDetail();"> <span>+ 1</span>
									Add More
								</a>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditEffectiveApplicantDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="modal fade commonsavepopup editCompanyDetailEditTabPopupOne tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm  tab-form">
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
									<p class="tab-form-main-heading">Company Name or Head Office</p>
									<input type="text" class="form-control editCompanyName" 
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Company Address</p>
									<input type="text" class="form-control editCompanyAddress"
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Head of Company Name</p>
									<input type="text" class="form-control editHeadOfCompany" 
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Job Title</p>
									<input type="text" class="form-control editJobTitleOne"
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">E-Mail Address </p>
									<input type="text" class="form-control editCompanyEmailOne" 
									placeholder = "mailto:info@companyname.jm"	oninput="" value="" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Telephone Number </p>
									<input type="text" class="form-control editCompanyNumOne"
									placeholder = "+1 876-876-1234"	 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
										value="" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>

						</div>

						<!--  -->
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Contact Name</p>
									<input type="text" class="form-control editContactName" 
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Job Title</p>
									<input type="text" class="form-control editJobTitleTwo" 
										oninput="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">E-Mail Address </p>
									<input type="text" class="form-control editCompanyEmailTwo"  placeholder = "mailto:info@companyname.jm" 
										oninput="" value="" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Telephone Number </p>
									<input type="text" class="form-control editCompanyNumTwo"
										 placeholder = "+1 876-876-1234" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
										value="" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditCompanyDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>

<div
	class="modal fade commonsavepopup editProductServicesEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Number of product types</p>
							<input type="text" class="form-control editProductType"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Please List Products</p>
							<input type="text"
								class="form-control editProductList" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of Production Lines</p>
							<input type="text" class="form-control editProductLines"
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditProductServicesPopupDataBtn">
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

<!-- number of employees -->
<div
	class="modal fade commonsavepopup editEmployeesNumberEditTabPopup tab-plus-wizard"
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
			<div class="accordion__body is-active">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Head Office</p>
							<input type="text" class="form-control editHeadOffice"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Administration/Office</p>
							<input type="text"
								class="form-control editAdministrationOffice" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Production/Processing</p>
							<input type="text" class="form-control editProductionProcessing"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Maintenance/Service</p>
							<input type="text" class="form-control editMaintenanceService"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Logistics</p>
							<input type="text"
								class="form-control editLogistics" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Total</p>
							<input type="text" class="form-control editTotal"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Seasonal</p>
							<input type="text" class="form-control editSeasonal"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Temporary</p>
							<input type="text"
								class="form-control editTemporary" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Subcontracted</p>
							<input type="text" class="form-control editSubcontracted"
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEmployeesNumberPopupDataBtn">
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

<!-- work pattern -->
<div
	class="modal fade commonsavepopup editWorkPatternEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Work Pattern</p>
							<input type="text" class="form-control editEmployeesShift"
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditWorkPatternPopupDataBtn">
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

<!-- Haccp Number -->
<div
	class="modal fade commonsavepopup editHaccpNumberEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Number of HACCP study</p>
							<input type="text" class="form-control editHaccpNumber"
								value="" placeholder="Number of HACCP study" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Type of HACCP study</p>
							<input type="text" class="form-control editHaccpType"
								placeholder="Type of HACCP study" value="" />
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
											<input type="file" id="editHaccpStudyNumber"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>editHaccpStudyNumber"> 
											<label class="custom-upload" for="editHaccpStudyNumber">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editHaccpStudyUpload"></span>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditHaccpNumberPopupDataBtn">
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

<!-- Hazard Analysis -->
<div
	class="modal fade commonsavepopup editHazardAnalysisEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Hazard analysis and critical control point aspects (ccp's ) & prerequisite programme (prp's)</p>
							<input type="text" class="form-control editHazardAnalysis"
								value="" placeholder="" />
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
											<input type="file" id="editHazardControlPoint"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet_INSTANCE_tkun_haccpStudyNumber">
											<label class="custom-upload" for="editHazardControlPoint">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editHazardFileUpload"></span>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditHazardAnalysisPopupDataBtn">
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

<!-- Consents licence  -->
<div
	class="modal fade commonsavepopup editLicenceListEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Consents, licences, permits, authorisations, agreements, codes of practice, etc.</p>
							<input type="text" class="form-control editConsentsList"
								value="" placeholder="" />
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
											<input type="file" id="editConsentsListUpload"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet_INSTANCE_tkun_haccpStudyNumber">
											<label class="custom-upload" for="editConsentsListUpload">
												<span class="mr-2"> <svg width="14" height="17"
														viewBox="0 0 14 17" fill="none"
														xmlns="http://www.w3.org/2000/svg"> <path
															d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
															fill="#047247"></path> </svg>
											</span>Upload
											</label>
										</div>
									</div>
									<span class="attach-detailed-overview editConsentsFileUpload"></span>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditLicenceListPopupDataBtn">
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

<!-- Company Details Section -->
<div
	class="modal fade commonsavepopup editSectionOneCompanyEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Company Name or Head Office</p>
							<input type="text" class="form-control editCompanyNameTwo"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Company Address</p>
							<input type="text"
								class="form-control editCompanyAddressTwo" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Head of Company Name</p>
							<input type="text" class="form-control editSectionOneCompName"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Job Title</p>
							<input type="text" class="form-control editSectionOneCompJobTitle"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">E-Mail Address</p>
							<input type="text"
								class="form-control editSectionOneCompEmailAddr" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone Number</p>
							<input type="text" class="form-control editSectionOneCompTelNum"
								value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" 
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Contact Name</p>
							<input type="text" class="form-control editSectOneCompContactName"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Job Title</p>
							<input type="text"
								class="form-control editSectOneCompJobTitle" value=""
								placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">E-Mail Address</p>
							<input type="text" class="form-control editSectOneCompEmail"
								value="" placeholder="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Telephone Number</p>
							<input type="text" class="form-control editSectOneCompTeleNumber"
								value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" 
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveSectionOneCompanyPopupDataBtn">
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

<!-- Quotation Details Section -->
<div
	class="modal fade commonsavepopup editQuotationApplicantDetailEditTabPopup tab-plus-wizard"
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
							<p class="tab-form-main-heading">Business Address and
								Physical Location of Premises</p>
							<textarea rows="3"
								class="form-control editQuotationApplicantAddressOne" maxlength="255"
								placeholder="Enter Address"
								style="border-radius: 5px; width: 100%"></textarea>

						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Types of Products/Services</p>
							<input type="text" class="form-control editQuotationApplicantProductTypes" placeholder="" value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Number and time of Shifts</p>
							<input type="text" class="form-control editQuotationApplicantShifts"
								placeholder=""
								value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Employee Numbers</p>
							<input type="text" class="form-control editQuotationEmpNum"
								placeholder=""
								value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Head Office</p>
							<input type="text" class="form-control editQuotationHeadOffices" placeholder="" value="" />
						</div> 
					</div> 
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of full time
								employees</p>
							<input type="text" class="form-control editQuotationNoOfFullTimeEmployees" placeholder="" 
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of part time
								employees</p>
							<input type="text" class="form-control editQuotationNoOfPartTimeEmployees" placeholder="" 
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of contractors</p>
							<input type="text" class="form-control editQuotationNoOfContractors"
								placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								value="" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Number of contracted
								workers</p>
							<input type="text" class="form-control editQuotationNoOfContractedWorkers" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditQuotationApplicantDetailPopupDataBtn">
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