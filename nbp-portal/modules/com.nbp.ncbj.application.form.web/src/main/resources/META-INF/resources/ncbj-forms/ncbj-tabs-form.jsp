<fieldset class="wizard-fieldset" id="ncbjFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details
                            </p>
							<ul class="nav nav-tabs hide iso9001CertificationForm" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item applicant-details">
									<a href="#childStep1" id="siteDetailsEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Site Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item applicant-details">
									<a href="#childStep2" id="organizationDetailsEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Organization Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item applicant-details">
									<a href="#childStep3" id="sectionSecEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type">3</span>
											<span class="additional-location-tab">Section II</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item quotation-details">
									<a href="#childStep4" id="quotationEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 4"> 
										<div class="w-100 text-wrap">
											<span class="step-type quotation-form-tab">4</span>
											<span id="company-indiv-list">Quotation Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item surveillance-details">
									<p class="applcation-detail-heading">No Form Applicable</p>
								</li>
							</ul>
							<ul class="nav nav-tabs hide newForm22000" id="side-tabs" role="tablist">
								<!-- <li role="presentation" class="nav-item">
									<a href="#childStep5" id="companyDetailEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Company Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li> -->
								<li role="presentation" class="nav-item">
									<a href="#childStep6" id="sectionFirstEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep6" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type">1</span>
											<span id="company-indiv-list">Section I</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep7" id="sectionSecondEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep7" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Section II</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep8" id="sectionThirdEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep8" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type">3</span>
											<span id="company-indiv-list">Section III</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep9" id="sectionFourthEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep9" role="tab" title="Step 4"> 
										<div class="w-100 text-wrap">
											<span class="step-type">4</span>
											<span id="company-indiv-list">Section IV</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep10" id="quotationCertificateEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep10" role="tab" title="Step 5"> 
										<div class="w-100 text-wrap">
											<span class="step-type">5</span>
											<span id="company-indiv-list">Quotation Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs hide quotationForm22000" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep9" id="zEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep9" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Organization  Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-8">
						<div class="tab-content pl-lg-4">
							<p class="surveillance-details">No Form Applicable</p>
							<jsp:include page="/ncbj-forms/iso-first-category-form.jsp" />
							<jsp:include page="/ncbj-forms/iso-second-category-form.jsp" />
 					    </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/ncbj-wizard-buttons.jsp"%>
</fieldset>