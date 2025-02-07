<fieldset class="wizard-fieldset" id="ogtformsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details
                            </p>
							<ul class="nav nav-tabs ogtClaimantFormTab side-tab-count" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item">
									<a href="#childStep1" id="claimantDetailsEditFormTab" class="nav-link active" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type green">1</span>
											<span>Claimant Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item ">
									<a href="#childStep2" id="assignmentInsolvenctEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span>Insolvent Person Details</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<span class="separator"></span> 
										<span class="heading-plus-subtitle-box nav-item p-0" role="presentation">
											<p class="applcation-detail-heading">Proof Of Claim</p>
											<p class="application-detail-subtitle common-para">(Form 38)</p>
									</span>
									<a href="#childStep3" id="proofClaimEditFormTab" class="nav-link disabled pt-2" data-toggle="tab" aria-controls="childStep3" role="tab" title="Step 3">
										<div class="w-100 text-wrap"> 
											<span class="step-type">3</span>
											<span>Section A</span>
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item bankrupcy-form hide">
									<a href="#childStep4" id="sectionBEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep4" role="tab" title="Step 4"> 
										<div class="w-100 text-wrap">
											<span class="step-type">4</span>
											<span>Section B</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<li role="presentation" class="nav-item">
									<a href="#childStep5" id="sectionCEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep5" role="tab" title="Step 5"> 
										<div class="w-100 text-wrap">
											<span class="step-type">5</span>
											<span>Signature</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
							</ul>
						</div>
					</div>

					<div class="col-lg-8">
						<jsp:include page="/forms/ogt-claimant-form-details.jsp" />	
					    			
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/ogt-wizard-buttons.jsp" %>
	</div> 
</fieldset>