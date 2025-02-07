<fieldset class="wizard-fieldset" id="explosivesFormsFieldset" name="APPLICATION FORM DETAILS">
	<div class="tab-plus-wizard">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-lg-4">
						<div class="tab-plus-wizard-left">
							<p class="tab-plus-wizard-left-heading f1">Application
								Details</p>
							<ul class="nav nav-tabs" id="side-tabs" role="tablist">
								<li role="presentation" class="nav-item ">
									<a href="#childStep1" id="blasterDetailsEditFormTab" class="nav-link active" data-toggle="tab" aria-controls="childStep1" role="tab" title="Step 1"> 
										<div class="w-100 text-wrap">
											<span class="step-type">1</span>
											<span class="applicationTypeHeading"> Blaster's Competency Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li>
								<!-- <li role="presentation" class="nav-item ">
									<a href="#childStep2" id="pyrotechnicDetailsEditFormTab" class="nav-link disabled" data-toggle="tab" aria-controls="childStep2" role="tab" title="Step 2"> 
										<div class="w-100 text-wrap">
											<span class="step-type">2</span>
											<span id="company-indiv-list"> Pyrotechnic Competency Form</span> 
										</div>
										<span class="circle"></span>
									</a>
								</li> -->
							</ul>
						</div>
					</div>

					<div class="col-lg-8">
						<div class="tab-content pl-lg-4">
							 <jsp:include page="forms/blaster-form-details.jsp"/>
                            <%-- <jsp:include page="forms/pyrotechnic-form-details.jsp"/> --%> 
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/explosives-wizard-buttons.jsp"%>
</fieldset>
