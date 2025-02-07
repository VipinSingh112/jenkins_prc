<fieldset class="wizard-fieldset" id="factoriesFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs factories-registration-forms" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="standardsActTab" class="nav-link" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Standards Act</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item second">
									<a href="#childStep2" id="processedActTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">2</span>
											<span id="company-indiv-list">Form A
													(Regulation 3)</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-8">
						<jsp:include page="/forms/standards-act-form-detail-info.jsp" />
					</div>	
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/factories-registration-wizard-buttons.jsp" %>
</fieldset>
							