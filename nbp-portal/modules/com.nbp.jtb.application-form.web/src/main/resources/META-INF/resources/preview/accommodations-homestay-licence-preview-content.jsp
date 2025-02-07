<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="accommodationHomeStayForm hide">
	<section id="jtbPreviewStep6" class="final-preview-section">
		<div class="accommodation-home-stay-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Home Stay Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="accommodationHomeStayEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of Accommodation</p>
						<p class="sub_heading_content" id="homeStayAccommodationNamePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Owner/Operator</p>
						<p class="sub_heading_content" id="homeStayOperatorNamePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Property</p>
						<p class="sub_heading_content" id="homeStayAddressPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="homeStayTelephonePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mobile</p>
						<p class="sub_heading_content" id="homeStayMobilePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="homeStayEmailPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="homeStayEmployeesNoPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="homeStayWebsitePre"></p>
					</div>
				</div>
                 <div class="col-6">
					<div>
						<p class="sub_heading">Direction to Property</p>
						<p class="sub_heading_content" id="homeStayPropertyDirectionPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Bedrooms in House</p>
						<p class="sub_heading_content" id="homeStayBedroomNumPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Available Number of bedrooms for guest Accommodation</p>
						<p class="sub_heading_content" id="homeStayGuestBedroomsPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">With Bathroom</p>
						<p class="sub_heading_content" id="homeStayWithBathroomPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Shared Bathroom</p>
						<p class="sub_heading_content" id="homeStaySharedBathroomPre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(homeSignApp)) {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureHomeStayImgHolderPre">
						<img src="<%=homeSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureHomeStayImgHolderPre"></div>
					<%
						}
					%>		
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="homeStayDatePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Certified by the Justice of Peace</p>
						<p class="sub_heading_content" id="homeStayCertifiedPeasePre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Seal</p>
					<%
						if (Validator.isNotNull(homeSeal)) {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSealHomeStayImgHolderPre">
						<img src="<%=homeSeal%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSealHomeStayImgHolderPre"></div>
					<%
						}
					%>		
					
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewHomeStayLicenceDetailInfo() {
	homeStayAccommodationName = $("#homeStayAccommodationName").val();
	homeStayAccomadationOwnerName = $("#homeStayAccomadationOwnerName").val();
	homeStayAccomadationPropertyAddress = $("#homeStayAccomadationPropertyAddress").val();
	homeStayAccomadationTel = $("#homeStayAccomadationTel").val();
	homeStayAccomadationMobileNum = $("#homeStayAccomadationMobileNum").val();
	homeStayAccomadationEmail = $("#homeStayAccomadationEmail").val();
	homeStayAccomadationEmployeesNum = $("#homeStayAccomadationEmployeesNum").val();
	homeStayAccomadationWebsiteName = $("#homeStayAccomadationWebsiteName").val();
	homeStayAccomadationDirection = $("#homeStayAccomadationDirection").val();
	homeStayAccomadationBedrooms = $("#homeStayAccomadationBedrooms").val();
	homeStayAccomadationAvailableBedrooms = $("#homeStayAccomadationAvailableBedrooms").val();
	homeStayAccomadationWithBathroom = $("#homeStayAccomadationWithBathroom").val();
	homeStayAccomadationSharedBedrooms = $("#homeStayAccomadationSharedBedrooms").val();
	homeStayAccomadationDate = $("#homeStayAccomadationDate").val();
	homeStayAccomadationCertified = $("#homeStayAccomadationCertified").val();


	$("#homeStayAccommodationNamePre").html(homeStayAccommodationName);
	$("#homeStayOperatorNamePre").html(homeStayAccomadationOwnerName);
	$("#homeStayAddressPre").html(homeStayAccomadationPropertyAddress);
	$("#homeStayTelephonePre").html(homeStayAccomadationTel);
	$("#homeStayMobilePre").html(homeStayAccomadationMobileNum);
	$("#homeStayEmailPre").html(homeStayAccomadationEmail);
	$("#homeStayEmployeesNoPre").html(homeStayAccomadationEmployeesNum);
	$("#homeStayWebsitePre").html(homeStayAccomadationWebsiteName);
	$("#homeStayPropertyDirectionPre").html(homeStayAccomadationDirection);
	$("#homeStayBedroomNumPre").html(homeStayAccomadationBedrooms);
	$("#homeStayGuestBedroomsPre").html(homeStayAccomadationAvailableBedrooms);
	$("#homeStayWithBathroomPre").html(homeStayAccomadationWithBathroom);
	$("#homeStaySharedBathroomPre").html(homeStayAccomadationSharedBedrooms);
	$("#homeStayDatePre").html(homeStayAccomadationDate);
	$("#homeStayCertifiedPeasePre").html(homeStayAccomadationCertified);
}
</script>

