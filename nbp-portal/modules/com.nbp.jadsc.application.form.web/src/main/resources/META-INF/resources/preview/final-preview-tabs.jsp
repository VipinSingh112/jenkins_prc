<fieldset class="wizard-fieldset" id="jadscFormPreviewFieldset" name="JADSC FORM PREVIEW">
	<section class="form-preview">
		<div class="d-flex align-items-center justify-content-between">
			<div>
				<p class="common-heading f1 mb-2">Preview</p>
				<p class="supporting-document-subtitle">Please review your
					provided information</p>
			</div>
			<div>
				<a id="jadscDownloadPDF" style="opacity: 0.4; pointer-events: none; cursor: default;" type="button"
					class="common-yellow-bg p-2 border-0">Download and Print <span>
						<svg xmlns="http://www.w3.org/2000/svg" width="24" height="25"
							viewBox="0 0 24 25" fill="none">
							<g clip-path="url(#clip0_6612_20494)">
							<path
								d="M19 9.5H15V3.5H9V9.5H5L12 16.5L19 9.5ZM5 18.5V20.5H19V18.5H5Z"
								fill="#1B1917" />
							</g>
							<defs>
							<clipPath id="clip0_6612_20494">
							<rect width="24" height="24" fill="white"
								transform="translate(0 0.5)" />
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
							<div class="tab-plus-wizard-left">
								<p class="tab-plus-wizard-left-heading f1">Application
									Details</p>
								<ul class="nav nav-tabs form-preview-nav" role="tablist">
									<li role="presentation" class="nav-item confidential-ver-forms">
										<a
										href="#jadscPreviewStep1" class="nav-link active">
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span> <span>Information Request Form</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item confidential-ver-forms">
										<a
										href="#jadscPreviewStep2" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type green">2</span> <span>Oath for Request Form</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item confidential-ver-forms">
										<a
										href="#jadscPreviewStep3" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type green">3</span> <span>Certificate of Service Form</span>
											</div>
										</a>
									</li> 
									<li role="presentation" class="nav-item confidential-ver-forms">
										<a
										href="#jadscPreviewStep4" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type green">4</span> <span>Certificate of Veracity Form</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item hide appearance-notice-form confidential-ver-forms">
										<a
										href="#jadscPreviewStep5" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type green">5</span> <span>Notice of Appearance Form</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a
										href="#jadscPreviewStep6" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type green checklist-step">6</span> <span>Checklist</span>
											</div>
										</a>
									</li>
								</ul>
								<ul class="nav nav-tabs form-preview-nav supporting-doc-preview" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#jadscPreviewStep7" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="supportingDocStep">7</span>
												<span class="">Supporting Documents</span> 
											</div>
										</a> 
									</li>
									<!-- <li role="presentation" class="nav-item ">
										<a href="#janaacPreviewStep53" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="feePaymentStep"></span>
												<span class="">Fee Payment</span> 
											</div>
										</a> 
									</li> -->
								</ul>
							</div>
						</div>
						<div class="col-lg-8">
							<div class="tab-content Licence_form pl-lg-4">
								<jsp:include page="preview/information-request-preview.jsp"/>
								<jsp:include page="preview/oath-request-preview.jsp"/>
								<jsp:include page="preview/certificate-service-preview.jsp"/>
								<jsp:include page="preview/certificate-veracity-preview.jsp"/>
								<jsp:include page="preview/appearance-notice-preview.jsp"/>
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
	<%@ include file="/jadsc-wizard-buttons.jsp"%>
</fieldset>
