<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="travel-halt-preview hide">
	<section id="jtbPreviewStep20" class="final-preview-section">
		<div class="travel-halt-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Travel Halt Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="travelHaltEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading_content" id="haltTravelApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="haltTravelAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="haltTravelTeleNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="haltTravelFaxNoPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="haltTravelEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Travel Halt</p>
						<p class="sub_heading_content" id="haltTravelNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Location of Travel Halt</p>
						<p class="sub_heading_content" id="haltTravelLocationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="haltTravelPhoneNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="haltTravelFaxNumberPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="haltTravelEmployeeNoPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I <span class="giluio haltApplicantName"> </span> hereby apply for
						permission to operate as a Travel Halt in accordance with the
						provision of the Tourist Board Act relating to Tourism Enterprise
					</p>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I declare that the Travel Halt facilities at <span
							class="giluio haltLocation"> </span> will be clean, well
						maintained and safe with trained personnel to serve the customers'
						needs. The Travel Halt will also provide telephone services in the
						case of an emergency.

					</p>
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					
						<%
						if (Validator.isNotNull(haltSignApp)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignaturetravelHaltHolderPreview">
						<img src="<%=haltSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignaturetravelHaltHolderPreview"></div>
					<%
						}
					%>	
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="haltTravelSignDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep21">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Travel Halt Offered</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="travelHaltOfferedEditTab"> <svg width="19"
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
				<div class="col-12">
					<div>
						<p class="pt-2 common-para">Please indicate what is offered at
							the Travel Halt by selecting the appropriate response(s)</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Gas Station</p>
						<p class="sub_heading_content" id="haltTravelGasStationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Restrooms</p>
						<p class="sub_heading_content" id="haltTravelRestroomsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Refreshment</p>
						<p class="sub_heading_content" id="haltTravelRefreshmentPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Drinks</p>
						<p class="sub_heading_content" id="haltTravelDrinksPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Restaurant</p>
						<p class="sub_heading_content" id="haltTravelRestaurantreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Wireless Internet</p>
						<p class="sub_heading_content" id="haltTravelWirelessInternetPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewTravelHaltDetailInfo() {
	travelHaltApplicantName = $("#travelHaltApplicantName").val();
	travelHaltAddress = $("#travelHaltAddress").val();
	travelHaltTelephone = $("#travelHaltTelephone").val();
	/* travelHaltFaxNum = $("#travelHaltFaxNum").val(); */
	travelHaltEmail = $("#travelHaltEmail").val();
	travelHaltName = $("#travelHaltName").val();
	travelHaltLocation = $("#travelHaltLocation").val();
	travelHaltTelephoneNum = $("#travelHaltTelephoneNum").val();
	/* travelHaltFax = $("#travelHaltFax").val(); */
	travelHaltEmployeesNo = $("#travelHaltEmployeesNo").val();
	travelHaltSignDate = $("#travelHaltSignDate").val();
	
	gasStation = $("input[name='gasStation']:checked").val();
	refreshment = $("input[name='refreshment']:checked").val();
	drinks = $("input[name='drinks']:checked").val();
	restaurant = $("input[name='restaurant']:checked").val();
	wirelessinternet = $("input[name='wirelessinternet']:checked").val();
	
	
	$("#haltTravelApplicantNamePreview").html(travelHaltApplicantName);
	$("#haltTravelAddressPreview").html(travelHaltAddress);
	$("#haltTravelTeleNoPreview").html(travelHaltTelephone);
	/* $("#haltTravelFaxNoPreview").html(travelHaltFaxNum); */
	$("#haltTravelEmailAddressPreview").html(travelHaltEmail);
	$("#haltTravelNamePreview").html(travelHaltName);
	$("#haltTravelLocationPreview").html(travelHaltLocation);
	$("#haltTravelPhoneNoPreview").html(travelHaltTelephoneNum);
	/* $("#haltTravelFaxNumberPreview").html(travelHaltFax); */
	$("#haltTravelEmployeeNoPreview").html(travelHaltEmployeesNo);
	$("#haltTravelSignDatePreview").html(travelHaltSignDate);
	
	$("#haltTravelGasStationPreview").html(gasStation);
	$("#haltTravelRefreshmentPreview").html(refreshment);
	$("#haltTravelDrinksPreview").html(drinks);
	$("#haltTravelRestaurantreview").html(restaurant);
	$("#haltTravelWirelessInternetPreview").html(wirelessinternet);
	
   var selectedrestrooms = new Array();
   $("input:checkbox[name=restrooms]:checked").each(function() {
	selectedrestrooms.push($(this).val()); 
   });
   $("#haltTravelRestroomsPreview").html(selectedrestrooms.join(", "));
}
</script>