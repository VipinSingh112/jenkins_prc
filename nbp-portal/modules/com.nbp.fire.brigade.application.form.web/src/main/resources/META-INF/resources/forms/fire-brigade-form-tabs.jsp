<fieldset class="wizard-fieldset" id="fireBrigadeFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs film-form-tabs" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="signature-tab" class="nav-link active" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green" id="comapny-indiv-list-number">1</span>
											<span id="company-indiv-list">Applicant's Detail</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep2" id="premises-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type gray">2</span>
											<span>Premises's Detail</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item importEquipmentData">
									<a href="#childStep3" id="operator-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type gray">3</span>
											<span class="">Operator's Detail</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item importEquipmentData">
									<a href="#childStep4" id="floor-structure-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 4">
										<div class="w-100 text-wrap"> 
											<span class="step-type gray">4</span>
											<span class="">Multiple Floor Structure</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item importEquipmentData">
									<a href="#childStep5" id="fire-protection-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 5">
										<div class="w-100 text-wrap"> 
											<span class="step-type gray">5</span>
											<span class="">Fire Protection Equipment</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item importEquipmentData">
									<a href="#childStep6" id="hazardous-substance-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep6" role="tab" title="Step 6">
										<div class="w-100 text-wrap"> 
											<span class="step-type gray">6</span>
											<span class="">Hazardous Substance/Materials</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item importEquipmentData">
									<a href="#childStep7" id="certificate-purpose-tab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep7" role="tab" title="Step 7">
										<div class="w-100 text-wrap"> 
											<span class="step-type gray">7</span>
											<span class="">Certificate Purpose</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>

					<div class="col-lg-8">
						<jsp:include page="/forms/fire-brigade-form-details.jsp" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/fire-brigade-wizard-buttons.jsp" %>
</fieldset>