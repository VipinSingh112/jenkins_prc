<fieldset class="wizard-fieldset" id="medicalFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application Details</p>
							<ul class="nav nav-tabs side-tab-count" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="applicant-info-tab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Applicant Instructions</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep2" id="applicantDetailsEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span>Applicant Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item company-form">
									<a href="#childStep3" id="companyDetailsFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type company-tab">3</span>
											<span>Company Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep4" id="homeDetailsFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 4"> 
										<div class="w-100 text-wrap">
											<span class="step-type home-detail-tab">4</span>
											<span>Home Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep5" id="nursingStaffFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 5"> 
										<div class="w-100 text-wrap">
											<span class="step-type nursing-staff-tab">5</span>
											<span>Nursing Staff</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li> 
								<li role="presentation" class="nav-item not-maternity-home hide">
									<a href="#childStep6" id="medicalPractitionerFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep6" role="tab" title="Step 6"> 
										<div class="w-100 text-wrap">
											<span class="step-type medical-tab">6</span>
											<span>Medical Practitioner/ Qualified Nurses</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item maternity-home hide">
									<a href="#childStep7" id="maternityHomeFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep7" role="tab" title="Step 7"> 
										<div class="w-100 text-wrap">
											<span class="step-type maternity-tab">7</span>
											<span>Maternity Home</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep8" id="signatureFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep8" role="tab" title="Step 8"> 
										<div class="w-100 text-wrap">
											<span class="step-type sign-tab">8</span>
											<span>Signature</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>

					<div class="col-lg-8">
						<div class="tab-content pl-lg-4">
							<jsp:include page="forms/nursing-home-info.jsp"/>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/medical-facilities-wizard-buttons.jsp" %> 
</fieldset>