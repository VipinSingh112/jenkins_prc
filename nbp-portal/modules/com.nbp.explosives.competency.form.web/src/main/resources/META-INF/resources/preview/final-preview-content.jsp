<%@ include file="/init.jsp" %>
<section id="explosives-preview-step1" class="final-preview-section ">
	<div class="blaster-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="applicationTypeHeading heading2">Blaster's Competency Certificate</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="blasterDetailsEdit" class="preview-edit-button">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
                <div>
                    <p class="pt-2 common-para">Image of Applicant</p>
                    <div class="signature_texarea mb-2"
                    id="blasterApplicantImageHolderPre">
                    <%if(Validator.isNotNull(imageDoc)){ %>
							<img src="<%=imageDoc%>"  width="100" height="100"/>
							<%} %>
					</div>
                </div>
            </div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Surname</p>
					<p class="sub_heading_content" id="blasterSurnamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">First Name</p>
					<p class="sub_heading_content" id="blasterFistNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Middle Initial</p>
					<p class="sub_heading_content" id="blasterMiddleNamePreview"></p>
				</div>
			</div>
            <div class="col-6">
				<div>
					<p class="sub_heading">Sex</p>
					<p class="sub_heading_content" id="blasterGenderPreview"></p>
				</div>
			</div>			
			<div class="col-12">
                <div>
                    <p>
                        Telephone
                    </p>
                </div>
            </div>
			<div class="col-6">
                <div>
                    <p class="sub_heading">Office</p>
                    <p class="sub_heading_content" id="blasterOfficeNumberPreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Cell</p>
                    <p class="sub_heading_content" id="blasterCellNumberPreview"></p>
                </div>
            </div>
            <div class="col-6">
				<div>
					<p class="sub_heading">TRN</p>
					 <p class="sub_heading_content" id="blasterTrnNumberPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date Of Birth</p>
					<p class="sub_heading_content" id="blasterDobPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content" id="blasterAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
                <div>
                    <p class="sub_heading">Educational Background</p>
                    <p class="sub_heading_content" id="blasterEducationalBackgroundPreview"></p>
                </div>
            </div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Have you ever participated in a Blasting Course?</p>
					<p class="sub_heading_content" id="blasterCourseParticipatedPreview"></p>
				</div>
			</div>
		</div>
		<div class="row blasterCourseParticipatedInfo hide">
			<!-- <div class="col-6">
				<div>
					<p class="sub_heading">State</p>
					<p class="sub_heading_content" id="blasterStatePreview"></p>
				</div>
			</div> -->
            <div class="col-6">
				<div>
					<p class="sub_heading">Name Of Course</p>
					<p class="sub_heading_content" id="blasterCoursenamePreview"></p>
				</div>
			</div>			
			<div class="col-6">
				<div>
					<p class="sub_heading">Institution/Course Organizer</p>
					<p class="sub_heading_content" id="blasterOrganizerPreview"></p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
                <div>
                    <p class="pt-2 common-para">Signature of Applicant</p>
                    <div class="signature_texarea mb-2"
                    id="blasterSignatureHolderPre">
                    <%if(Validator.isNotNull(formNameDoc)){ %>
							<img src="<%=formNameDoc%>"  width="100" height="100"/>
							<%} %>
                    	
					</div>
                </div>
            </div>
			
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="blasterDatePreview"></p>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- <section id="explosives-preview-step2" class="final-preview-section ">
	<div class="pyrotechnic-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="applicationTypeHeading">Pyrotechnic Competency Certificate</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="pyrotechnicDetailsEdit" class="preview-edit-button">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Surname</p>
					<p class="sub_heading_content" id="pyrotechnicSurnamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">First Name</p>
					<p class="sub_heading_content" id="pyrotechnicFistNamePreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Middle Initial</p>
					<p class="sub_heading_content" id="pyrotechnicMiddleNamePreview"></p>
				</div>
			</div>
            <div class="col-6">
				<div>
					<p class="sub_heading">Sex</p>
					<p class="sub_heading_content" id="pyrotechnicGenderPreview"></p>
				</div>
			</div>			
			<div class="col-12">
                <div>
                    <p>
                        Telephone
                    </p>
                </div>
            </div>
			<div class="col-6">
                <div>
                    <p class="sub_heading">Office</p>
                    <p class="sub_heading_content" id="pyrotechnicOfficeNumberPreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Cell</p>
                    <p class="sub_heading_content" id="pyrotechnicCellNumberPreview"></p>
                </div>
            </div>
            <div class="col-6">
				<div>
					<p class="sub_heading">TRN</p>
					 <p class="sub_heading_content" id="pyrotechnicTrnNumberPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date Of Birth</p>
					<p class="sub_heading_content" id="pyrotechnicDobPreview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content" id="pyrotechnicAddressPreview"></p>
				</div>
			</div>
			<div class="col-6">
                <div>
                    <p class="sub_heading">Educational Background</p>
                    <p class="sub_heading_content" id="pyrotechnicEducationalBackgroundPreview"></p>
                </div>
            </div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Have you ever participated in a Blasting Course?</p>
					<p class="sub_heading_content" id="pyrotechnicCourseParticipatedPreview"></p>
				</div>
			</div>
		</div>
		<div class="row blasterCourseParticipatedInfo hide">
			<div class="col-6">
				<div>
					<p class="sub_heading">State</p>
					<p class="sub_heading_content" id="pyrotechnicStatePreview"></p>
				</div>
			</div>
            <div class="col-6">
				<div>
					<p class="sub_heading">Name Of Course</p>
					<p class="sub_heading_content" id="pyrotechnicCoursenamePreview"></p>
				</div>
			</div>			
			<div class="col-6">
				<div>
					<p class="sub_heading">Institution/Course Organizer</p>
					<p class="sub_heading_content" id="pyrotechnicOrganizerPreview"></p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
                <div>
                    <p class="pt-2 common-para">Submitter's Signature</p>
                   
                    <div class="signature_texarea mb-2"
                    id="pyrotechnicSignatureHolderPre">
					</div>
                </div>
            </div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="pyrotechnicDatePreview"></p>
				</div>
			</div>
		</div>
	</div>
</section> -->
<section class="final-preview-section supporting-doc-preview" id="explosives-preview-step3">
	<div class="supporting-doc-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Supporting Documents</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="supporting-doc-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12 hide" id="requireDocPreviewSection">
				<p>Mandatory Documents</p>
				<div id="requireDocPreview"></div>
			</div>
			<div class="col-12 hide" id="notRequireDocPreviewSection">
				<p>Optional Documents</p>
				<div id="notRequireDocPreview"></div>
			</div>
			<div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
				<div id="additionalDocPreview"></div>
			</div>
		</div>
	</div>
</section>
<section class="final-preview-section" id="explosives-preview-step4">
	<div class="fee-payment-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Fee Payment</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="fee-payment-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-6"> 
				<div>
					<p class="sub_heading">Method</p>
					<p class="sub_heading_content fee-method-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Proof of Payment</p>
					<p><a class="sub_heading_content" id="payment-upload-preview" href="<%=Validator.isNotNull(feeRecipetUrl)? feeRecipetUrl:""%>"><%=(Validator.isNotNull(feeRecipet))?feeRecipet:""%></a></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Amount</p>
					<p class="sub_heading_content fee-amount-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Currency</p>
					<p class="sub_heading_content fee-currency-preview"></p>
				</div>
			</div>	
		</div>
	</div>
</section>