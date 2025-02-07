<%@ include file="../init.jsp" %>
<div class="water-resources-renew-forms-preview hide">
	<section id="wraPreviewStep1" class="final-preview-section">
		<div class="water-resources-renew-forms-preview">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Licence Details</p>
						<span class="ml-3"> <a href="javascript:void(0)" class="preview-edit-button"
							id="waterResourceRenewEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
									   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
								</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="renewNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Contact</p>
						<p class="sub_heading_content" id="renewContactPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Job Title</p>
						<p class="sub_heading_content" id="renewJobTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone Number</p>
						<p class="sub_heading_content" id="renewTelephoneNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax Number</p>
						<p class="sub_heading_content" id="renewFaxNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="renewParishLocationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="renewAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">If you wish to reduce your abstraction
							rate, please indicate the new rate. A higher abstraction rate is
							considered a new application.Licences are not transferable</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Source Name</p>
						<p class="sub_heading_content" id="renewSourceNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="renewDetailsParishAddPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Location</p>
						<p class="sub_heading_content" id="renewDetailsLocationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Abstraction rate (m3/day)</p>
						<p class="sub_heading_content" id="renewAbstractionRatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Use</p>
						<p class="sub_heading_content" id="renewDetailsUsePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Method of abstraction</p>
						<p class="sub_heading_content" id="renewAbstractionMethodPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Measuring device attached?</p>
						<p class="sub_heading_content" id="attachedDevicePreview"></p>
					</div>
				</div>
				<div class="col-6 measuring-devicePreview hide">
					<div>
						<p class="sub_heading">State type of device</p>
						<p class="sub_heading_content" id="renewStateDevicePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Abstraction data submitted?</p>
						<p class="sub_heading_content" id="abstractionDataPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">
							I hereby apply for renewal of the
							abovementioned licence for an additional five (5) years as of <span
									class="giluio renewApplicantName"> </span> I
							agree to abide by all conditions set out in the original licence.
						</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="renewSignNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="renewDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureRenewImgHolderPreview">
						<%if(Validator.isNotNull(abstractRenewSignUrl)){ %>
							<img src="<%=abstractRenewSignUrl%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
		</div>
	</section>
</div>

