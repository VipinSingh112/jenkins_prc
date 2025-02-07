<%@ include file="../init.jsp" %>
<div class="miningLeaseRenewalForms hide">
	<section id="miningPreviewStep8" class="final-preview-section">
		<div class="Mining-Renewal-Lease-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 15</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="miningLeaseRenewEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of applicant</p>
						<p class="sub_heading_content" id="applicantNameRenewalLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">T.R.N./T.C.C. Number</p>
						<p class="sub_heading_content" id="trnNumberRenewalLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="telephoneRenewalPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="emailAddressRenewalPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of applicant's Mining Lease</p>
						<p class="sub_heading_content" id="miningNoRenewalPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mineral for which applicant desires to
							mine</p>
						<p class="sub_heading_content" id="applicantDesiresRenewalPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Length of term desired</p>
						<p class="sub_heading_content" id="desiredTermRenewalPre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading approximateRenewalLease"></p>
						<p><a class="sub_heading_content" id="approximateRenewalLease-preview"></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="dateRenewalPre"></p>
					</div>
				</div>
                 <div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImageRenewalLeasePre">
					<%if(Validator.isNotNull(signMiniLeaseUrl)){ %>
							<img src="<%=signMiniLeaseUrl%>"  width="100" height="100"/>
							<%} %>	
						
						</div>
			</div>
		</div>
	</section>
</div>

<script>
	function previewMiningLeaseRenewalLicenceDetailInfo() {
		renLeaseApplicantName = $("#renLeaseApplicantName").val();
		renLeaseTrnNumber = $("#renLeaseTrnNumber").val();
		renewalTelephone = $("#renewalTelephone").val();
		renewalEmailAddress = $("#renewalEmailAddress").val();
		renewalApplicantMining = $("#renewalApplicantMining").val();
		renewalDesiresMine = $("#renewalDesiresMine").val();
		renewalLenght = $("#renewalLenght").val();
		renewalDate = $("#renewalDate").val();
		
		
		$("#applicantNameRenewalLeasePre").html(renLeaseApplicantName);
		$("#trnNumberRenewalLeasePre").html(renLeaseTrnNumber);
		$("#telephoneRenewalPre").html(renewalTelephone);
		$("#emailAddressRenewalPre").html(renewalEmailAddress);
		$("#miningNoRenewalPre").html(renewalApplicantMining);
		$("#applicantDesiresRenewalPre").html(renewalDesiresMine);
		$("#desiredTermRenewalPre").html(renewalLenght);
		$("#dateRenewalPre").html(renewalDate);
	}
</script>

