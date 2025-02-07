<fieldset class="wizard-fieldset" id="medicalFormPreviewFieldset" name="MEDICAL FORM PREVIEW">
	<section class="form-preview">
		<div class="d-flex align-items-center justify-content-between">
			<div>
				<p class="common-heading f1 mb-2">Preview</p>
				<p class="supporting-document-subtitle">Please review your provided information</p>
			</div>
			<div>
				<a id="medicalDownloadPDF" type="button" class="common-yellow-bg p-2 border-0 download-btn">Download and Print
					<span>
						<svg xmlns="http://www.w3.org/2000/svg" width="24" height="25" viewBox="0 0 24 25" fill="none">
							<g clip-path="url(#clip0_6612_20494)">
							<path d="M19 9.5H15V3.5H9V9.5H5L12 16.5L19 9.5ZM5 18.5V20.5H19V18.5H5Z" fill="#1B1917"/>
							</g>
							<defs>
							<clipPath id="clip0_6612_20494">
							<rect width="24" height="24" fill="white" transform="translate(0 0.5)"/>
							</clipPath>
							</defs>
						</svg>
					</span>
				</a>
			</div>
		</div>
		<div class="tab-plus-wizard preview-section">
			<div class="row">
				<div class="col-md-12">
					<div class="row">
						<div class="col-lg-4">
							<div class="tab-plus-wizard-left side-tab-pre-count">
								<p class="tab-plus-wizard-left-heading f1">Application
									Details</p>
								<ul class="nav nav-tabs form-preview-nav" id="form-preview-nav-tab" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#medicalPreviewStep1" class="nav-link active"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span>
												<span>Applicant Details</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item company-form">
										<a href="#medicalPreviewStep2" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">2</span>
												<span>Company Details</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#medicalPreviewStep3" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">3</span>
												<span>Home Details</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#medicalPreviewStep4" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">4</span>
												<span>Nursing Staff</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item not-maternity-home hide">
										<a href="#medicalPreviewStep5" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">5</span>
												<span>Medical Practitioner/ Qualified Nurses</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item maternity-home hide">
										<a href="#medicalPreviewStep6" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">6</span>
												<span>Maternity Home</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#medicalPreviewStep7" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">7</span>
												<span>Signature</span> 
											</div>
										</a>
									</li>
								</ul>
								<ul class="nav nav-tabs form-preview-nav supporting-doc-preview" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#medicalPreviewStep8" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="supportingDocStep">8</span>
												<span class="">Supporting Documents</span> 
											</div>
										</a> 
									</li>
									<li role="presentation" class="nav-item ">
										<a href="#medicalPreviewStep9" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="feePaymentStep">9</span>
												<span class="">Fee Payment</span> 
											</div>
										</a> 
									</li>
								</ul>
							</div>
						</div>

						<div class="col-lg-8">
							<div class="tab-content Licence_form pl-lg-4">
								<jsp:include page="/preview/final-preview-content.jsp" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="custom_loader hide" style="z-index: 1;">
			<div class="loader">
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>
			</div>
		</div>
	</section>
	<%@ include file="/medical-facilities-wizard-buttons.jsp" %>
</fieldset>