<!-- Yearly Working Time MODAL -->
<%@page import="com.nbp.miic.application.util.MIICApplicationUtil"%>
<div class="modal fade commonsavepopup editCetSuspensionDetailPopup tab-plus-wizard"
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
			<div class="modal-body">
				<div class="row">
					<!-- <div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Name</p>
							<input type="text" class="form-control editCetName" placeholder="" value="" disabled>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Address</p>
							<textarea rows="3" class="form-control editCetAddress" maxlength="255" placeholder="Enter Address"
								style="border-radius: 5px; width: 100%" disabled></textarea>
						</div>
					</div> -->
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Tariff Heading no.</p>
							<input type="text" class="form-control editCetTariffHeading numeric-field" placeholder="" value=""
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							<p class="tab-form-sub-heading fieldAlert hide" id="editCetTariffHeadingValidation" style="color: red;">Only Numeric characters are allowed</p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Description</p>
							<textarea rows="3" class="form-control editCetDescription" maxlength="255" placeholder="Enter Description"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Amount Quantity</p>
							<input type="text" class="form-control editSuspensionQuantity"
								value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>		
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Amount Estimate in US $</p>
							<input type="text" class="form-control editSuspensionEstimate numeric-field"
								value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>
							<p class="tab-form-sub-heading fieldAlert hide" id="editSuspensionEstimateValidation" style="color: red;">Only Numeric characters are allowed</p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Technology Specification</p>
							<textarea rows="3" class="form-control editSuspensionSpecification" maxlength="255" placeholder="Enter Technology Specification"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">CET Rate</p>
							<input type="text" class="form-control editSuspensionCetRate"
								value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>

						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Rate Proposed</p>
							<input type="text" class="form-control editSuspensionRateProposed" value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>

						</div>
					</div>
				<!-- 	<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Period of Rate Change</p>
							<input type="text" class="form-control editSuspensionPeriodOfRateChange" value=""
								placeholder="" />

						</div>
					</div> -->
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Period of Rate Change</p>
						</div>
					</div> 
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Period From</p>
							<input type="date" class="form-control editSuspensionPeriodOfRateChangeFrom"
								value="" placeholder=""/>	
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Period To</p>
							<input type="date" class="form-control editSuspensionPeriodOfRateChangeTo"
								value="" placeholder=""/>	
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditCetSuspensionDetailPopupDataBtn">
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

<!-- Yearly Working Time MODAL -->

<div class="modal fade commonsavepopup editMaterialRequiredDetailPopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm tab-form">
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
					<!-- <div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Name</p>
							<input type="text" class="form-control editbreakdownWorkingYear" placeholder="" value="" disabled>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Address</p>
							<textarea rows="3"  class="form-control editsuspensionTechnologySpecification" 
							maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%" disabled></textarea>
						</div>
					</div> -->
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Tariff Heading no.</p>
							<input type="text" class="form-control editmmaterialTariff numeric-field"
								value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							<p class="tab-form-sub-heading fieldAlert hide" id="editmmaterialTariffValidation" style="color: red;">Only Numeric characters are allowed</p>			
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Description</p>
							<textarea rows="3" class="form-control editmaterialDiscription" maxlength="255" placeholder="Enter Description"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Amount Quantity</p>
							<input type="text" class="form-control editmaterialAmount"
								value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>

						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Period of importation</p>
						</div>
					</div> 
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Period From</p>
							<input type="date" class="form-control editMaterialImportationFrom"
								value="" placeholder=""/>	
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-sub-heading">Period To</p>
							<input type="date" class="form-control editMaterialImportationTo"
								value="" placeholder=""/>	
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Technology Specification</p>
							<textarea rows="3" class="form-control editmaterialSpecification" maxlength="255" placeholder="Enter Technology Specification"
								style="border-radius: 5px; width: 100%"></textarea>
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditMaterialRequiredDetailPopupDataBtn">
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


<!-- Yearly Working Time MODAL -->

<div class="modal fade commonsavepopup editgoodsProducedDetailopup tab-plus-wizard"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm tab-form">
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
							<p class="tab-form-main-heading">Tariff Heading no.</p>
							<input type="text" class="form-control editgoodsTariff numeric-field" placeholder="" value=""
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							<p class="tab-form-sub-heading fieldAlert hide" id="editgoodsTariffValidation" style="color: red;">Only Numeric characters are allowed</p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Description</p>
							<textarea rows="3" class="form-control editgoodsDescription" maxlength="255" placeholder="Enter Description"
								style="border-radius: 5px; width: 100%"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Amount Quantity</p>
							<input type="text" class="form-control editgoodsQuantity" placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Amount Estimate Value in $JM</p>
							<input type="text" class="form-control editgoodsEstimate numeric-field" placeholder="" value=""
							oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');">
							<p class="tab-form-sub-heading fieldAlert hide" id="editgoodsEstimateValidation" style="color: red;">Only Numeric characters are allowed</p>
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Reason for Request for the invoking of the Safeguard Mechanism</p>
							<input type="text" class="form-control editgoodsMechanism"
								value="" placeholder="" />			
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
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditgoodsProducedDetailPopupDataBtn">
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