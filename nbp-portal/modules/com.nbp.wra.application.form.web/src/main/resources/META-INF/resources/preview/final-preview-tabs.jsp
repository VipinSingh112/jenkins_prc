<fieldset class="wizard-fieldset" id="wraFormPreviewFieldset"
	name="WRA FORM PREVIEW">
	<section class="form-preview">
		<div class="d-flex align-items-center justify-content-between">
			<div>
				<p class="common-heading f1 mb-2">Preview</p>
				<p class="supporting-document-subtitle">Please review your
					provided information</p>
			</div>
			<div>
				<a id="wraDownloadPDF" style="opacity: 0.4; pointer-events: none; cursor: default;" type="button"
					class="common-yellow-bg p-2 border-0 download-btn">Download and Print <span>
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
								<ul
									class="nav nav-tabs form-preview-nav water-resources-forms-preview hide"
									role="tablist">
									<li role="presentation" class="nav-item"><a
										href="#wraPreviewStep1" class="nav-link active">
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span> <span>Form A (Regulation 3(1))</span>
											</div>
									</a></li>
								</ul>
								<ul
									class="nav nav-tabs form-preview-nav water-resources-renew-forms-preview hide"
									role="tablist">
									<li role="presentation" class="nav-item"><a
										href="#wraPreviewStep2" class="nav-link active">
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span> <span>Licence Details</span>
											</div>
									</a></li>
									<!-- <li role="presentation" class="nav-item"><a
										href="#wraPreviewStep3" class="nav-link">
											<div class="w-100 text-wrap">
												<span class="step-type">2</span> <span>Licence Details 2</span>
											</div>
									</a></li> -->
								</ul>
								<ul
									class="nav nav-tabs form-preview-nav water-permit-drilling-forms-preview hide"
									role="tablist">
									<li role="presentation" class="nav-item"><a
										href="#wraPreviewStep4" class="nav-link active">
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span> <span>Form C (Regulation 18(1))</span>
											</div>
									</a></li>
								</ul>
								<ul
									class="nav nav-tabs form-preview-nav water-well-drilling-forms-preview hide"
									role="tablist">
									<li role="presentation" class="nav-item"><a
										href="#wraPreviewStep5" class="nav-link active">
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span> <span>Form E (Regulation 19(1))</span>
											</div>
									</a></li>
								</ul>
								<ul class="nav nav-tabs form-preview-nav supporting-doc-preview" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#wraPreviewStep6" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="supportingDocStep">2</span>
												<span class="">Supporting Documents</span> 
											</div>
										</a> 
									</li>
									<li role="presentation" class="nav-item ">
										<a href="#wraPreviewStep7" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="feePaymentStep">3</span>
												<span class="">Fee Payment</span> 
											</div>
										</a> 
									</li>
								</ul>
							</div>
						</div>
						<div class="col-lg-8">
							<div class="tab-content Licence_form pl-lg-4">
								<jsp:include page="/preview/water-resources-preview-content.jsp" />
								<jsp:include page="/preview/water-resources-renew-preview-content.jsp" />
								<jsp:include page="/preview/water-permit-drilling-preview-content.jsp" />
								<jsp:include page="/preview/water-well-drilling-licence-preview-content.jsp" />
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
	<%@ include file="/wra-wizard-buttons.jsp"%>
</fieldset>
