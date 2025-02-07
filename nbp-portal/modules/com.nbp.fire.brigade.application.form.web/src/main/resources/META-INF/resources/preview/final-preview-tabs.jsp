<fieldset class="wizard-fieldset" id="fireBrigadeformPreviewFieldset" name="FIRE BRIGADE PREVIEW FORM">
	<section class="form-preview">
		<div class="d-flex align-items-center justify-content-between">
			<div>
				<p class="common-heading f1 mb-2">Preview</p>
				<p class="supporting-document-subtitle">Please review your provided information</p>
			</div>
			<div>
				<a id="fireBirgadeDownloadPDF" style="opacity: 0.4; pointer-events: none; cursor: default;" type="button" class="common-yellow-bg p-2 border-0 download-btn">Download and Print
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
							<div class="tab-plus-wizard-left">
								<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
								<ul class="nav nav-tabs form-preview-nav" id="form-preview-nav-tab" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step1" class="nav-link active"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span>
												<span>Signature</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step2" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">2</span>
												<span class="">Premises</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step3" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">3</span>
												<span class="">Operator's Detail</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step4" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">4</span>
												<span class="">Multiple Floor Structure</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step5" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">5</span>
												<span class="">Fire Protection Equipment</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step6" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">6</span>
												<span class="">Hazardous Substance/Materials</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step7" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">7</span>
												<span class="">Certificate Purpose</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step8" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">8</span>
												<span class="">Supporting Documents</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#fire-brigade-preview-step9" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">9</span>
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
<%@include file="/fire-brigade-wizard-buttons.jsp" %>
</fieldset>