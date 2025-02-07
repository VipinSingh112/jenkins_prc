<fieldset class="wizard-fieldset" id="jadscFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item confidential-ver-forms">
									<a href="#childStep1" id="information-request-tab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type">1</span>
											<span id="company-indiv-list">Information Request Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item confidential-ver-forms">
									<a href="#childStep2" id="oath-request-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Oath for Request Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item confidential-ver-forms">
									<a href="#childStep3" id="service-certificate-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type">3</span>
											<span id="company-indiv-list">Certificate of Service Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item confidential-ver-forms">
									<a href="#childStep4" id="veracity-certificate-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 4"> 
										<div class="w-100 text-wrap">
											<span class="step-type">4</span>
											<span id="company-indiv-list">Certificate of Veracity Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item appearance-notice-form hide confidential-ver-forms">
									<a href="#childStep5" id="appearance-notice-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 5"> 
										<div class="w-100 text-wrap">
											<span class="step-type">5</span>
											<span id="company-indiv-list">Notice of Appearance Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item non-confidential-ver-forms">
									<a href="#childStep6" id="checklist-details-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep6" role="tab" title="Step 6"> 
										<div class="w-100 text-wrap">
											<span class="step-type checklist-step">6</span>
											<span id="company-indiv-list">Checklist</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>

					<div class="col-lg-8">
						<div class="tab-content pl-lg-4">
							<jsp:include page="forms/information-request-info.jsp"/>
                            <jsp:include page="forms/oath-request-info.jsp"/>
                            <jsp:include page="forms/certificate-service-info.jsp"/>
                            <jsp:include page="forms/certificate-veracity-info.jsp"/>
                            <jsp:include page="forms/appearance-notice-info.jsp"/>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/jadsc-wizard-buttons.jsp"%>
</fieldset>




