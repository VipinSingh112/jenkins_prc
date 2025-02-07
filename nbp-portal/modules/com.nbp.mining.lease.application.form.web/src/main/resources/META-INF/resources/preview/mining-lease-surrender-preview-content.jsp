<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="mining-surrender-forms hide">
	<section id="miningPreviewStep10" class="final-preview-section">
		<div class="Mining-Lease-Surrender-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 10</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="surrenderEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="surrenderTelephonePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="surrenderEmailAddressPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="surrenderDatePre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of holder</p>
					<div class="signature_texarea mb-2"
						id="holderSignatureImageSurrenderPre">
							<%if(Validator.isNotNull(mlSurrenderDoc2Url)){ %>
							<img src="<%=mlSurrenderDoc2Url%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Minister</p>
					<div class="signature_texarea mb-2"
						id="ministerSignatureImageSurrenderCoPre">
							<%if(Validator.isNotNull(mlSurrenderDoc1Url)){ %>
							<img src="<%=mlSurrenderDoc1Url%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
		</div>
	</section>
</div>
<section class="final-preview-section supporting-doc-preview"
		id="miningPreviewStep11">
		<div class="supporting-doc-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Supporting Documents</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="supporting-doc-edit-tab"> <svg width="19" height="19"
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
	<%--  <section class="final-preview-section" id="miningPreviewStep12">
		<div class="fee-payment-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Fee Payment</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="fee-payment-edit-tab"> <svg width="19" height="19"
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
	</section>  --%>
<script>
	function previewMiningLeaseSurrenderDetailInfo() {
		applicantTelephonesurrender = $("#applicantTelephonesurrender").val();
		applicantEmailsurrender = $("#applicantEmailsurrender").val();
		datesurrender = $("#datesurrender").val();

		$("#surrenderTelephonePre").html(applicantTelephonesurrender);
		$("#surrenderEmailAddressPre").html(applicantEmailsurrender);
		$("#surrenderDatePre").html(datesurrender);
	}
</script>
