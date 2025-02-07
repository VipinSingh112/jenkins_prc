<%@ include file="../../init.jsp" %>
<!-- Other Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep46">
	<div class="tab-form">
		<div class="other-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Other Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">22.0</span> Application fees (non-refundable) submitted?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerOtherRequ!=null &&cerOtherRequ.getApplicationFees().equals("Yes")? "checked":StringPool.BLANK%> name="otherFeeReqCerBodies">
							<label for="otherFeeReqCerBodies">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerOtherRequ!=null &&cerOtherRequ.getApplicationFees().equals("No")? "checked":StringPool.BLANK%> name="otherFeeReqCerBodies">
							<label for="otherFeeReqCerBodies">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 otherFeeReqCerBodiesBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">23.0</span> State payment method</p>
						<input type="text" class="form-control" id="otherFeePayMethodCerBodies" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getInsPaymentMethod())?cerOtherRequ.getInsPaymentMethod():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">
						<span class="tab-form-highlghtme-link pr-2">NB:</span> In the event that application documents are incomplete or not satisfactorily completed, 
						the applicant will be informed of this, and is required to adequately address discrepancies in no more than twenty (20) working days 
						after notification. Failure to comply with this delivery date will result in the application being returned for completion and re-submission.
					</p>
					<p class="tab-form-main-heading"><b>
						The application will not be registered until the requisite documents are received.
					</b></p>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative name</p>
						<input type="text" class="form-control" id="applicantRepresentativeNameCerBodies" placeholder="" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getApplicantRepName())?cerOtherRequ.getApplicantRepName():""%>" />
					</div>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative position</p>
						<input type="text" class="form-control" id="applicantRepresentativePositionCerBodies" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getApplicantRepPosition())?cerOtherRequ.getApplicantRepPosition():""%>" />
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's representative signature</p>
					<div class="signature_texarea mb-2" id="applicantRepresentativeCerBodiesSignature">
						<%if(Validator.isNotNull(CertiThreeSign)){ %>
							<img src="<%=CertiThreeSign%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="applicantRepresentativeCerBodiesSignatureBtn" hidden="" name="<portlet:namespace/>applicantRepresentativeCerBodiesSignatureBtn"> 
						<label for="applicantRepresentativeCerBodiesSignatureBtn" class="choose-sign-btn">
						<span class="mr-2"> <svg width="14" height="17"
								viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                        <path
									d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
									fill="#ffffff"></path> 
		                    </svg>
					</span> Upload Signature
					</label>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="applicantRepresentativeDateCerBodies" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(cerOtherRequ.getSignatureDate()):""%>" />
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Other Requirements Form End-->