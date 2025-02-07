<div class="mining-prospecting-renewal-licence-forms hide">
	<section id="miningPreviewStep4" class="final-preview-section">
		<div class="prospecting-Renewal-Licence-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 7</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="prospectingLicnecneRenewEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of applicant</p>
						<p class="sub_heading_content" id="applicantNameRenewalPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">T.R.N./T.C.C. Number</p>
						<p class="sub_heading_content" id="trnNumberRenewalPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Applicant's licence No. for which
							application to renew is being made</p>
						<p class="sub_heading_content" id="renewalLicenceNoPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">State whether renewal is sought for the
							whole of the area or only part of</p>
						<p class="sub_heading_content" id="applicantStateRenewalPre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading approximateRenewalArea"></p>
						<p><a class="sub_heading_content" id="approximateRenewalArea-preview"></a></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="miningPreviewStep5" class="final-preview-section">
		<div class="prospecting-Licence-delineation-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Delineation</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="prospectingLicnecneRenewDelineationEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						An area of approximately <span class="giluio locAreaRenewal">
						</span> square kilometres.
					</p>
					<p class="sub_heading">
						The location beacon consists of <span
							class="giluio locBeaconRenewal"> </span> and is situated
						approximately at the intersection of false co-ordinates <span
							class="giluio coordinatesRenewal"> </span> North <span
							class="giluio northRenewal"> </span> East on sheet <span
							class="giluio eastOnRenewal"> </span> of the topographical map of
						Jamaica.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The first corner is situated
						approximately at the intersection of the false coordinate</p>
					<p class="sub_heading">
						<span class="giluio northAreaRenewal"> </span> North and <span
							class="giluio renewalEastApp"> </span> East approximately <span
							class="giluio locGridRenewal"> </span> metres from the location
						beacon on an approximate grid bearing of <span
							class="giluio beDegreesRenewal"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The Second corner is situated
						approximately at the intersection of the false co- ordinates</p>
					<p class="sub_heading">
						<span class="giluio northSecRenewal"> </span> North and <span
							class="giluio eastSecRenewal"> </span> East approximately <span
							class="giluio locationSecRenewal"> </span> metres from the first
						corner on an approximate grid bearing of <span
							class="giluio degreesSecRenewal"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The Third corner is situated
						approximately at the intersection of the false co-ordinates</p>
					<p class="sub_heading">
						<span class="giluio thirdCornerRenewal"> </span>North and <span
							class="giluio thirdNorthRenewal"> </span> East approximately <span
							class="giluio thirdEastAppRenewal"> </span> metres from the
						second corner on an approximate grid bearing of <span
							class="giluio degreesThirdRenewal"> </span> degrees and is <span
							class="giluio locationThirdRenewal"> </span> metres to the
						location beacon on an approximate grid bearing of <span
							class="giluio gridThirdRenewal"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImageRenewalPre"></div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
	function previewProspectingRenewalLicenceDetailInfo() {
		renewalApplicantName = $("#renewalApplicantName").val();
		renewalTrnNumber = $("#renewalTrnNumber").val();
		renewalApplicantLicenceNo = $("#renewalApplicantLicenceNo").val();
		renewalState = $("#renewalState").val();

		$("#applicantNameRenewalPre").html(renewalApplicantName);
		$("#trnNumberRenewalPre").html(renewalTrnNumber);
		$("#renewalLicenceNoPre").html(renewalApplicantLicenceNo);
		$("#applicantStateRenewalPre").html(renewalState);

	}
</script>
