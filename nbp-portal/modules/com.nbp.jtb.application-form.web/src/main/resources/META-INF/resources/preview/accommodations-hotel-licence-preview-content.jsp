<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="accommodationHotelForm hide">
	<section id="jtbPreviewStep1" class="final-preview-section">
		<div class="accommodation-hotel-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Hotel Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="accommodationHotelEditTab"> <svg width="19" height="19"
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
				<div class="col-md-12">
					<p class="sub_heading">
						I <span class="giluio accommodationOwnerName"> </span> the
						Owner/Director of the <span class="giluio hotelName"> </span> Tel <span
							class="giluio hotelTelNo"> </span> Email Address <span
							class="giluio hotelEmailId"> </span> which is at <span
							class="giluio hotelAddress"> </span> in the Parish of <span
							class="giluio hotelParishLoc"> </span> being the keeper of the
						hotel hereby apply for the grant of a licence to keep the hotel in
						accordance with the provisions of Section 23 of the Tourist Board
						Act, 1985.

					</p>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep2">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="accommodationDeclarationEditTab"> <svg width="19"
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
					<p class="sub_heading">I declare that:-</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(a) the hotel has <span class="giluio bedroomNo"> </span> bedrooms
						for the accommodation of guests for reward; the hotel is owned by
						<span class="giluio hotelOwner"> </span> Address <span
							class="giluio ownerAddress"> </span> a company incorporated under
						the laws of <span class="giluio ownerCompanyLaw"> </span> on the <span
							class="giluio hotelDate"> </span>.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(b) the hotel is operated by <span
							class="giluio hotelOperaterName"> </span> Address <span
							class="giluio ownerAddress"> </span> a company incorporated
						under the laws of <span class="giluio ownerCompanyLaw"> </span>
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(c) the above-mentioned <span class="giluio hotelOperaterName">
						</span> has been operating hotels in <span
							class="giluio hotelParishLoc"> </span> since the <span
							class="giluio sinceDate"> </span> and the hotel since <span
							class="giluio hotelOpenDate"> </span>.
					</p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading address-of-directors">The attached list shows the names and addresses of all the Directors of the company</p>
					 <p><a class="sub_heading_content" id="address-of-directors-preview" href="<%=Validator.isNotNull(formNameDocUrl)? formNameDocUrl:""%>"><%=(Validator.isNotNull(formNameDoc))?formNameDoc:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">if necessary, enquires about the
							finances of the operation of the hotel can be made to</p>
						<p class="sub_heading_content" id="hotelEnquiresPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading public-laws">The attached certificate issued under the Public Health Law is to the best of my knowledge in full force and effect</p>
						 <p><a class="sub_heading_content" id="public-laws-preview" href="<%=Validator.isNotNull(publicLawDocUrl)? publicLawDocUrl:""%>"><%=(Validator.isNotNull(publicLaw))?publicLaw:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">No. of Employees</p>
						<p class="sub_heading_content" id="hotelEmployeesNumberPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(hotelSignApp)) {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureHotelImageHolderPreview">
						<img src="<%=hotelSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureHotelImageHolderPreview"></div>
					<%
						}
					%>		
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="dategeAccommodationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Manager</p>
						<p class="sub_heading_content" id="managerAccoNamePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Manager</p>
					<%
						if (Validator.isNotNull(hotelSignManager)) {
					%>
					<div class="signature_texarea mb-2"
						id="managerSignatureHotelImageHolderPreview">
						<img src="<%=hotelSignManager%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="managerSignatureHotelImageHolderPreview"></div>
					<%
						}
					%>		
				</div>

			</div>
		</div>
	</section>
</div>
<script>
	function previewHotelLicenceDetailInfo() {
		newAccomadationHotelFinance = $("#newAccomadationHotelFinance").val();
		newAccomadationHotelEmployeesNum = $("#newAccomadationHotelEmployeesNum").val();
		newAccomadationHSignDate = $("#newAccomadationHSignDate").val();
		newAccomadationHotelManagerName = $("#newAccomadationHotelManagerName").val();

		$("#hotelEnquiresPreview").html(newAccomadationHotelFinance);
		$("#hotelEmployeesNumberPreview").html(newAccomadationHotelEmployeesNum);
		$("#dategeAccommodationPreview").html(newAccomadationHSignDate);
		$("#managerAccoNamePreview").html(newAccomadationHotelManagerName);
	}
</script>
