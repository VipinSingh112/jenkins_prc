<fieldset class="wizard-fieldset" id="ogtFormPreviewFieldset" name="OGT FORM PREVIEW">
	<section class="form-preview">
		<div class="d-flex align-items-center justify-content-between">
			<div>
				<p class="common-heading f1 mb-2">Preview</p>
				<p class="supporting-document-subtitle">Please review your provided information</p>
			</div>
			<div>
				<a id="ogtDownloadPDF" style="opacity: 0.4; pointer-events: none; cursor: default;" type="button" class="common-yellow-bg p-2 border-0 download-btn">Download and Print
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
								<p class="tab-plus-wizard-left-heading f1">Application Details</p>
								<ul class="nav nav-tabs form-preview-nav ogtAdmissionClaimPreTab side-tab-pre-count" id="form-preview-nav-tab" role="tablist">
									<li role="presentation" class="nav-item">
										<a href="#ogtPreviewStep1" class="nav-link active"> 
											<div class="w-100 text-wrap">
												<span class="step-type green">1</span>
												<span id="company-indiv-list">Claimant Details</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#ogtPreviewStep2" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type">2</span>
												<span>Insolvent Person Details</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<span class="separator"></span> 
											<span class="heading-plus-subtitle-box nav-item p-0" role="presentation">
												<p class="applcation-detail-heading">Proof Of Claim</p>
												<p class="application-detail-subtitle common-para">(Form 38)</p>
										</span>
										<a href="#ogtPreviewStep3"  class="nav-link">
											<div class="w-100 text-wrap"> 
												<span class="step-type">3</span>
												<span>Section A</span>
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item  bankrupcy-form hide ">
										<a href="#ogtPreviewStep4" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type">4</span>
												<span>Section B</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#ogtPreviewStep5" class="nav-link"> 
											<div class="w-100 text-wrap">
												<span class="step-type">5</span>
												<span>Signature</span> 
											</div>
										</a>
									</li>
									<li role="presentation" class="nav-item">
										<a href="#ogtPreviewStep6" class="nav-link"">
											<div class="w-100 text-wrap">
												<span class="step-type" id="supportingDocStep">6</span>
												<span class="">Supporting Documents</span> 
											</div>
										</a> 
									</li>
								</ul>
							</div>
						</div>

						<div class="col-lg-8">
							<div class="tab-content Licence_form pl-lg-4">
								<jsp:include page="/preview/ogt-claimant-preview-content.jsp" />
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
	<%@include file="/ogt-wizard-buttons.jsp" %>
</fieldset>