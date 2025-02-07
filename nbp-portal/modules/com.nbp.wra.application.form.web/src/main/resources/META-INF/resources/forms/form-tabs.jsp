<fieldset class="wizard-fieldset" id="wraFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs water-resources-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="waterResourceEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Form A (Regulation 3(1))</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs water-resources-renew-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep2" id="waterResourceRenewEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Licence Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<!-- <li role="presentation" class="nav-item">
									<a href="#childStep3" id="licenceDetailsTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">2</span>
											<span id="company-indiv-list">Licence Details 2</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li> -->
							</ul>
							<ul class="nav nav-tabs water-permit-drilling-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep4" id="waterResourcePermitEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Form C (Regulation 18(1))</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
							<ul class="nav nav-tabs water-well-drilling-forms hide" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep5" id="waterResourceWellEditFormTab" class="nav-link" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Form E(Regulation 19(1))</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-8">
						<div class="tab-content pl-lg-4">
							<jsp:include page="forms/water-resources-detail-info.jsp"/>
							<jsp:include page="forms/water-resources-renew-detail-info.jsp"/>
							<jsp:include page="forms/water-permit-drilling-detail-info.jsp"/>
							<jsp:include page="forms/water-well-drilling-licence-detail-info.jsp"/>
						</div>
					</div>		
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/wra-wizard-buttons.jsp"%>
</fieldset>
							