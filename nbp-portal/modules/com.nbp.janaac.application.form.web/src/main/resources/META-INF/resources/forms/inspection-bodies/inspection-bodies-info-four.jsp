<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep53">
	<div class="tab-form">
		<div class="other-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">V. Other Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.0</span> Application fees (non-refundable) submitted?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio" <%=insBodiesOtherReq!=null &&insBodiesOtherReq.getApplicationFees().equals("Yes")? "checked":StringPool.BLANK%> name="otherFeeReqInsBodies">
							<label for="otherFeeReqInsBodies">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio" <%=insBodiesOtherReq!=null &&insBodiesOtherReq.getApplicationFees().equals("No")? "checked":StringPool.BLANK%> name="otherFeeReqInsBodies">
							<label for="otherFeeReqInsBodies">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 otherFeeReqInsBodiesBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2"></span>State payment method</p>
						<input type="text" class="form-control" id="otherFeePayMethodInsBodies" value="<%=Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getInsPaymentMethod())?insBodiesOtherReq.getInsPaymentMethod():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">
						<span class="tab-form-highlghtme-link pr-2">NB:</span> In the event that application documents are incomplete or not satisfactorily completed, 
						the applicant will be informed of this, and is required to adequately address this in no more than twenty (20) working days after 
						notification. Failure to comply with this delivery date will result in the application being returned for completion and re-submission.
					</p>
					<p class="tab-form-main-heading"><b>
						The application will not be registered until the requisite documents are received.
					</b></p>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative name</p>
						<input type="text" class="form-control" id="applicantRepresentativeNameInsBodies" placeholder="" value="<%=Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getApplicantRepName())?insBodiesOtherReq.getApplicantRepName():""%>" />
					</div>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative position</p>
						<input type="text" class="form-control" id="applicantRepresentativePositionInsBodies" value="<%=Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getApplicantRepPosition())?insBodiesOtherReq.getApplicantRepPosition():""%>" />
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's representative signature</p>
					<%
						if (Validator.isNotNull(fileUrlOfRepresentativeSignature)) {
					%>
					<div class="signature_texarea mb-2" id="applicantRepresentativeInsBodiesSignature">
						<img src="<%=fileUrlOfRepresentativeSignature%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="applicantRepresentativeInsBodiesSignature"></div>
					<%
						}
					%>
					<input type="file" id="applicantRepresentativeInsBodiesSignatureBtn" hidden="" name="<portlet:namespace/>applicantRepresentativeInsBodiesSignatureBtn"> 
						<label for="applicantRepresentativeInsBodiesSignatureBtn" class="choose-sign-btn">
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
						<input type="date" class="form-control" id="applicantRepresentativeDateInsBodies" value="<%=Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(insBodiesOtherReq.getSignatureDate()):""%>" />
					</div>
				</div>
			</div>
	</div>
</div>
</div>