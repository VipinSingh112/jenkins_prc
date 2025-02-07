<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="motor-bike-rental-preview hide">
	<section id="jtbPreviewStep13" class="final-preview-section">
		<div class="motor-bike-rental-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Motor Bike Rental Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="motorBikeRentalEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="bikeRentalApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="bikeRentalAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Company</p>
						<p class="sub_heading_content" id="bikeRentalCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Exact Location</p>
						<p class="sub_heading_content" id="bikeRentalLocationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="bikeRentalTeleNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="bikeRentalFaxNoPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="bikeRentalEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date of Company Registration</p>
						<p class="sub_heading_content" id="bikeRentalRegistrationDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Manager's Name</p>
						<p class="sub_heading_content" id="bikeRentalManagerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Bikes/units in Fleet</p>
						<p class="sub_heading_content" id="bikeRentalBikeNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Helmets</p>
						<p class="sub_heading_content" id="bikeRentalHelmetsNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="bikeRentalEmployeeNoPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						I <span class="giluio applicantBikeName"> </span> Hereby Certify That the
								Information Given Herein is to the Best of My Knowledge and
								Belief a True and Accurate Testimony</p>
				</div>		
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="bikeRentalDatePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					
						<%
						if (Validator.isNotNull(bikeSignApp)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureMotorHolderPreview">
						<img src="<%=bikeSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureMotorHolderPreview"></div>
					<%
						}
					%>	
				</div>
			</div>
		</div>
	</section>
    <section class="final-preview-section" id="jtbPreviewStep14">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Bike Rental Conditions</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="bikeRentalConditionEditTab"> <svg width="19"
									height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Conditions Proposed for Motor Bike Rental Company/operation In the Tourist Industry</p>
						<p class="sub_heading"><b id="motorBikeIndustryPreview"></b></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewBikeRentalLicenceDetailInfo() {
	motorBikeApplicantName = $("#motorBikeApplicantName").val();
	motorBikeAddress = $("#motorBikeAddress").val();
	motorBikeCompanyName = $("#motorBikeCompanyName").val();
	motorBikeExactLocation = $("#motorBikeExactLocation").val();
	motorBikeTelephone = $("#motorBikeTelephone").val();
	/* motorBikeFaxNum = $("#motorBikeFaxNum").val(); */
	motorBikeEmail = $("#motorBikeEmail").val();
	motorBikeDate = $("#motorBikeDate").val();
	motorBikeManagerName = $("#motorBikeManagerName").val();
	motorBikeNumber = $("#motorBikeNumber").val();
	motorBikeHelmetNumber = $("#motorBikeHelmetNumber").val();
	motorBikeEmployeesNo = $("#motorBikeEmployeesNo").val();
	motorBikeSignDate = $("#motorBikeSignDate").val();
	
	$("#bikeRentalApplicantNamePreview").html(motorBikeApplicantName);
	$("#bikeRentalAddressPreview").html(motorBikeAddress);
	$("#bikeRentalCompanyNamePreview").html(motorBikeCompanyName);
	$("#bikeRentalLocationPreview").html(motorBikeExactLocation);
	$("#bikeRentalTeleNoPreview").html(motorBikeTelephone);
	/* $("#bikeRentalFaxNoPreview").html(motorBikeFaxNum); */
	$("#bikeRentalEmailAddressPreview").html(motorBikeEmail);
	$("#bikeRentalRegistrationDatePreview").html(motorBikeDate);
	$("#bikeRentalManagerNamePreview").html(motorBikeManagerName);
	$("#bikeRentalBikeNumberPreview").html(motorBikeNumber);
	$("#bikeRentalHelmetsNumPreview").html(motorBikeHelmetNumber);
	$("#bikeRentalEmployeeNoPreview").html(motorBikeEmployeesNo);
	$("#bikeRentalDatePreview").html(motorBikeSignDate);
	
	var selectedmotorBikeIndustry = new Array();
	$("input:checkbox[name=motorBikeIndustry]:checked").each(function() {
		selectedmotorBikeIndustry.push($(this).val()); 
	});
	$("#motorBikeIndustryPreview").html(selectedmotorBikeIndustry.join("<br><br>"));
	
}




</script>