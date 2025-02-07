<%@ include file="../init.jsp"%>
<div class="broker-registration-forms hide">
	<section id="hsraPreviewStep18" class="final-preview-section">
		<div class="broker-registration-forms-preview-details">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Broker Registration</p>
						<span class="ml-3"> <a href="javascript:void(0)" class="preview-edit-button" id="brokerRegistrationEdit"> <svg width="19" height="19"
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
						<p class="sub_heading">1. Type of Application</p>
						<p class="sub_heading_content" id="applicationTypesPreview"></p>
					</div>
				</div>
				<div class="col-6 otherSpecifyValuePreview hide">
					<div>
						<p class="sub_heading hide">valid or previous Registration
							Number</p>
						<p class="sub_heading_content" id="otherEquipmentOnePreview"></p>
					</div>
				</div>
				<div class="col-6 otherSpecifyValuePreview hide">
					<div>
						<p class="sub_heading">Registration Expiration Date</p>
						<p class="sub_heading_content" id="otherEquipmentTwoPreview"></p>
					</div>
				</div>
				<div class="col-6 otherVariationPreview hide">
					<div>
						<p class="sub_heading hide">valid or previous Registration
							Number</p>
						<p class="sub_heading_content" id="otherEquipmentVarPreview"></p>
					</div>
				</div>
				<div class="col-6 otherVariationPreview hide">
					<div>
						<p class="sub_heading">Registration Expiration Date</p>
						<p class="sub_heading_content" id="otherEquipmentRegPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>2. Applicant Details</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Organization</p>
						<p class="sub_heading_content" id="organizationNameDPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Principal place of business</p>
						<p class="sub_heading_content" id="businessPlacePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Organization T.R.N.</p>
						<p class="sub_heading_content" id="organizationTrnPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="organizationTeleNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax Number</p>
						<p class="sub_heading_content" id="organizationFaxNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email address</p>
						<p class="sub_heading_content" id="organizationEmailAddPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>3. Business Details</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Type of Business</p>
						<p class="sub_heading_content" id="businessTypeBrokerPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>(b) Proof of Legal Status</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Business Number</p>
						<p class="sub_heading_content" id="businessNumberBrokerPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Corporation Number</p>
						<p class="sub_heading_content" id="corporationNumberBrokerPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">For Public Institutions, specify the
							enabling legislation (Act)</p>
						<p class="sub_heading_content" id="publicActBrokerPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading proof-copy">License Customs Brokers Information</p>
						<p><a class="sub_heading_content" id="proof-copy-preview" href="<%=Validator.isNotNull(licenceCusBrokerInfoUrl)? licenceCusBrokerInfoUrl:""%>"><%=(Validator.isNotNull(licenceCusBrokerInfo))?licenceCusBrokerInfo:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">License Number</p>
						<p class="sub_heading_content" id="licenceNumberBrokerPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Expiration Date</p>
						<p class="sub_heading_content" id="expirationDateBrokerPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>4. Knowledge of the Nuclear Safety and
							Radiation Protection Act, 2015 and associated Regulations</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Radioactive material</p>
						<p class="sub_heading_content" id="radioactiveMaterialPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nuclear material</p>
						<p class="sub_heading_content" id="nuclearMaterialPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nuclear technology</p>
						<p class="sub_heading_content" id="nuclearTechnologyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Ionizing Radiation Apparatus</p>
						<p class="sub_heading_content" id="ionizingApparatusPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Radiation source</p>
						<p class="sub_heading_content" id="radiationSourcePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Does the applicant understand that the
							organization (person/ corporation) that wants to obtain or
							transfer a Radiation Source MUST be authorized by HSRA to
							possess/use radiation source?</p>
						<p class="sub_heading_content" id="organizationTransferPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Does the applicant understand its
							responsibilities under the Nuclear Safety and Radiation
							Protection Act, 2015 and the Nuclear Safety and Radiation
							Protection Regulations, 2019?</p>
						<p class="sub_heading_content" id="nuclearProtectionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Storage Facility Details</p>
						<p class="sub_heading_content" id="storageFacilityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Additional Information</p>
						<p class="sub_heading_content" id="additionalInformationPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep19">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Declaration</p>
						<span class="ml-3"> <a href="javascript:void(0)"
						 class="preview-edit-button" id="brokerDeclarationEdit"> <svg width="19" height="19"
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
						<p class="sub_heading">Legal Operator Name</p>
						<p class="sub_heading_content" id="brokerOperatorNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="brokerTitlePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>
						<%
								if (Validator.isNotNull(fileUrlOfBrokerRegistration)) {
							%>
							<div class="signature_texarea mb-2" id="signatureBrokerImageHolderPreview">
								<img src="<%=fileUrlOfBrokerRegistration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2" id="signatureBrokerImageHolderPreview"></div>
							<%
								}
							%>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="signDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>