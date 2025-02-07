<fieldset class="wizard-fieldset" id="miningFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs prospectingRightsForm hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="prospectingRightsTab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Form No. 1</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs mining-prospecting-licence-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep2" id="prospectingLicnecneTab" class="nav-link" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No. 5</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep3" id="prospectingLicnecneDelineationTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Delineation of Area</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs mining-prospecting-renewal-licence-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep4" id="prospectingLicnecneRenewTab" class="nav-link" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No. 7</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep5" id="prospectingLicnecneRenewDelineationTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Delineation</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs miningLeaseForm hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep6" id="miningLeaseTab" class="nav-link" data-toggle="tab" aria-controls="childStep6" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No. 12</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep7" id="miningLeaseDelineationTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep7" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list">Delineation</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs miningLeaseRenewalForms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep8" id="miningLeaseRenewTab" class="nav-link" data-toggle="tab" aria-controls="childStep8" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No. 15</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs mining-transfer-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep9" id="transferTab" class="nav-link" data-toggle="tab" aria-controls="childStep9" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No.9</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs mining-surrender-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep10" id="surrenderTab" class="nav-link" data-toggle="tab" aria-controls="childStep10" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span id="company-indiv-list">Form No.10</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-8">
						<jsp:include page="/forms/prospecting-rights-form-details.jsp" />
						<jsp:include page="/forms/prospecting-licence-form-details.jsp" />
						<jsp:include page="/forms/prospecting-renewal-licence-form-details.jsp" />
						<jsp:include page="/forms/mining-lease-form-details.jsp" />
						<jsp:include page="/forms/mining-renewal-lease-form-details.jsp" />
						<jsp:include page="/forms/mining-lease-transfer-form-details.jsp" />
						<jsp:include page="/forms/mining-lease-surrender-form-details.jsp" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/mining-lease-wizard-buttons.jsp" %>
</fieldset>