<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="places-of-interest-preview hide">
	<section id="jtbPreviewStep15" class="final-preview-section">
		<div class="places-of-interest-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Place of Interest/ Worship Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="placesOfInterestEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Place of Interest/Place of Worship</p>
						<p class="sub_heading_content" id="typeOfPlacePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Owner/Operator/Manager</p>
						<p class="sub_heading_content" id="typeOfRolePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						I <span class="giluio managerName"> </span> The
						Owner/Operator/Manager of the Place of Interest/Worship <span
							class="giluio namePlaceOfInterest"> </span> (hereinafter referred to as
						the Place of Interest/Worship) which is located at <span
							class="giluio worshipLocation"> </span> Mailing Address <span
							class="giluio worshipMailingAddress"> </span> Telephone <span
							class="giluio telNoOfplaces"> </span> Email Address <span
							class="giluio emailOfInteres"> </span> No. of Employees <span
							class="giluio employeesNoPlaces"> </span> In the Parish of <span
							class="giluio parishLocationWorship"> </span> being the keeper of
						the Place of Interest/Worship.
					</p>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep16">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="placesOfInterestGeneralEditTab"> <svg width="19"
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
					<p class="sub_heading">I declare that -</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(a) the Place of Interest/Worship is owned by <span class="giluio ownerNameOfWorship"> </span> a Company incorporated under the laws of
						<span class="giluio companyIncorporatedLaw"> </span> on the <span
							class="giluio worshipDate"> </span>.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(b) the <span class="giluio namePlaceOfInterest"> </span> has been operating since <span
							class="giluio operatingSinceDate"> </span> 
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(c) the Place of Interest/Worship is situated on <span class="giluio landOfAcresPlaces">
						</span> acres of land.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(d) the Place of Interest/Worship offers the following activities .
					</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Walking Tour</p>
						<p class="sub_heading_content" id="worshipWalkingTourPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Cemetery Tour</p>
						<p class="sub_heading_content" id="worshipCemeteryTourPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Garden Tour</p>
						<p class="sub_heading_content" id="worshipGardenTourPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Rooms/Cabins</p>
						<p class="sub_heading_content" id="worshipRoomsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Tent Space</p>
						<p class="sub_heading_content" id="worshipTentSpacePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Male/Female Showers</p>
						<p class="sub_heading_content" id="worshipShowersPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Male/Female Sanitary Conveniences</p>
						<p class="sub_heading_content" id="worshipSanitaryConveniencePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading address-of-directors-company">The attached list shows the names and addresses of all the Directors of the operating company (if applicable)</p>
						<p><a class="sub_heading_content" id="address-of-directors-company-preview" href="<%=Validator.isNotNull(placeAddressUrl)? placeAddressUrl:""%>"><%=(Validator.isNotNull(placeAddress))?placeAddress:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					
						<%
						if (Validator.isNotNull(placeSignApp)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureplaceOfInterestImageHolderPreview">
						<img src="<%=placeSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureplaceOfInterestImageHolderPreview"></div>
					<%
						}
					%>	
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="worshipDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewPlacesInterestLicenceDetailInfo() {
	walkingtour = $("input[name='walkingtour']:checked").val();
	cemeterytour = $("input[name='cemeterytour']:checked").val();
	gardentour = $("input[name='gardentour']:checked").val();
	placeOfInterestRooms = $("#placeOfInterestRooms").val();
	placeOfInterestTentSpace = $("#placeOfInterestTentSpace").val();
	placeOfInterestShowers = $("#placeOfInterestShowers").val();
	placeOfInterestSanitaryConveniences = $("#placeOfInterestSanitaryConveniences").val();
	placeOfInterestSignDate = $("#placeOfInterestSignDate").val();
	typeOfPlace = $("#typeOfPlace").val();
	typeOfRole = $("#typeOfRole").val();
	
	$("#worshipWalkingTourPreview").html(walkingtour);
	$("#worshipCemeteryTourPreview").html(cemeterytour);
	$("#worshipGardenTourPreview").html(gardentour);
	$("#worshipRoomsPreview").html(placeOfInterestRooms);
	$("#worshipTentSpacePreview").html(placeOfInterestTentSpace);
	$("#worshipShowersPreview").html(placeOfInterestShowers);
	$("#worshipSanitaryConveniencePreview").html(placeOfInterestSanitaryConveniences);
	$("#worshipDatePreview").html(placeOfInterestSignDate);
	$("#typeOfPlacePreview").html(typeOfPlace);
	$("#typeOfRolePreview").html(typeOfRole);
}

   
</script>