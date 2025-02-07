<%@ include file="../init.jsp" %>
<div class="prospectingRightsForm hide">
	<section id="miningPreviewStep1" class="final-preview-section">
		<div class="prospecting-rights-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 1</p>
						<span class="ml-3">
							<a href="javascript:void(0)" id="prospectingRightsEditTab"> 
								<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
									   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
								</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">1. Name of applicant</p>
						<p class="sub_heading_content" id="applicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">2. T.R.N./T.C.C. Number</p>
						<p class="sub_heading_content" id="trnNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">3. Nationality of applicant</p>
						<p class="sub_heading_content" id="applicantNationalityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">4. Age of applicant</p>
						<p class="sub_heading_content" id="applicantAgePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">5. Telephone No.(s)</p>
						<p class="sub_heading_content" id="applicantTelephonePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">6. Email address</p>
						<p class="sub_heading_content" id="applicantEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">7. Address in Jamaica at which notices, etc., may be served</p>
						<p class="sub_heading_content" id="applicantAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">8. Whether the applicant intends to prospect on his/her own account, or as a agent of any other person</p>
						<p class="sub_heading_content" id="applicantProspectAccountPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">9. If he is in the employ of any other person, the Name and Address of such person</p>
						<p class="sub_heading_content" id="otherPersonEmployNamePreview"></p>
						<p class="sub_heading_content" id="otherPersonEmployAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">10. Whether he/she has previously made an application for a prospecting right or licence, and if so,
								 whether any such application has been refused</p>
						<p class="sub_heading_content" id="applicantProspectingLicencePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">11. Whether the applicant or his/her employer (if any) has been convicted of an offence of the mining 
								act, or previously held any prospecting rights, licence or mining lease in Jamaica which has been 
								revoked or forfeited</p>
						<p class="sub_heading_content" id="applicantOffenceConvictedPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">12. I am (not) in possession of a valid prospection right</p>
						<p class="sub_heading_content" id="validProspectionRightPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">I hereby surrender prospecting right No.</p>
						<p class="sub_heading_content" id="surrenderProspectingRightNoPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading principal-attachment"></p>
						<p><a class="sub_heading_content" id="principal-attachment-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">
						I, <span class="giluio user-name"></span>, hereby declare the above
						particulars to be true.
					</p>
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(signUrl)) {
					%>
					<div class="signature_texarea mb-2" id="applicantSignatureImageHolderPre">
					<img src="<%=signUrl%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="applicantSignatureImageHolderPre">
					</div>
					<%
						}
					%>	
				</div>
			</div>
			<hr/>
		</div>
	</section>
</div>
<script>
function previewProspectingRightsDetailInfo() {
	applicantName = $("#applicantName").val();
	trnNumber = $("#trnNumber").val();
	applicantNationality = $("#applicantNationality").val();
	applicantAge = $("#applicantAge").val();
	applicantTelephone = $("#applicantTelephone").val();
	applicantEmail = $("#applicantEmail").val();
	applicantAddress = $("#applicantAddress").val();
	applicantProspectAccount = $("#applicantProspectAccount").val();
	otherPersonEmployName = $("#otherPersonEmployName").val();
	otherPersonEmployAddress = $("#otherPersonEmployAddress").val();
	applicantProspectingLicence = $("#applicantProspectingLicence").val();
	applicantOffenceConvicted = $("#applicantOffenceConvicted").val();
	validProspectionRight = $("#validProspectionRight").val();
	surrenderProspectingRightNo = $("#surrenderProspectingRightNo").val();
	applicantName = $("#applicantName").val();
	
	$("#applicantNamePreview").html(applicantName);
	$("#trnNumberPreview").html(trnNumber);
	$("#applicantNationalityPreview").html(applicantNationality);
	$("#applicantAgePreview").html(applicantAge);
	$("#applicantTelephonePreview").html(applicantTelephone);
	$("#applicantEmailPreview").html(applicantEmail);
	$("#applicantAddressPreview").html(applicantAddress);
	$("#applicantProspectAccountPreview").html(applicantProspectAccount);
	$("#otherPersonEmployNamePreview").html(otherPersonEmployName);
	$("#otherPersonEmployAddressPreview").html(otherPersonEmployAddress);
	$("#applicantProspectingLicencePreview").html(applicantProspectingLicence);
	$("#applicantOffenceConvictedPreview").html(applicantOffenceConvicted);
	$("#validProspectionRightPreview").html(validProspectionRight);
	$("#surrenderProspectingRightNoPreview").html(surrenderProspectingRightNo);
}
</script>