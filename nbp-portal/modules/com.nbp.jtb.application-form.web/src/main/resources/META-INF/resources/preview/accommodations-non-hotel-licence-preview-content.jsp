<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="accommodation-non-hotel-preview hide">
	<section id="jtbPreviewStep3" class="final-preview-section">
		<div class="accommodation-non-hotel-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Non-Hotel Licence</p>
						<span class="ml-3">
							<a href="javascript:void(0)" id="accommodationNonHotelEditTab"> 
								<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
									   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
								</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Accommodation</p>
						<p class="sub_heading_content" id="accommodationNameNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="addressNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="telephoneNonHotelPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="faxNonHotelPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="emailNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="employeeNoNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Type of accommodation to be offered</p>
						<p class="sub_heading_content" id="typeNonHotelPreview"></p>
					</div>
				</div>
                <div class="col-6">
					<div>
						<p class="sub_heading">Number of Rooms</p>
						<p class="sub_heading_content" id="numOfRoomsNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Owner</p>
						<p class="sub_heading_content" id="ownerNameNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address of Owner</p>
						<p class="sub_heading_content" id="ownerAddressNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="ownerTelephoneNonHotelPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="ownerFaxNonHotelPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Operating Company</p>
						<p class="sub_heading_content" id="companyNameNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="companyAddressNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Manager</p>
						<p class="sub_heading_content" id="managerNameNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="managerAddressNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="managerTelephoneNonHotelPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="managerFaxNonHotelPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="managerEmailNonHotelPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep4">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Licence Requirement</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="licenceRequirementEditTab"> <svg width="19"
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
						<p class="sub_heading">Requirement for Licence</p>
						<p class="sub_heading_content" id="requirementNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Bedrooms</p>
						<p class="sub_heading_content" id="bedroomNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Bathrooms</p>
						<p class="sub_heading_content" id="bathroomNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">I <span class="giluio nonHotelOwnerName"> </span> hereby apply for the
						grant of a licence in respect of the Non-Hotel Accommodation in
						accordance with the provision of Section 23 of the Tourist Board
						Act</p>
				</div>
			</div>
		</div>
	</section>			
	<section class="final-preview-section" id="jtbPreviewStep5">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="accommodationGeneralDeclarationEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading nonHotelAddress">The attached list show the names and addresses of all the Directors, of all or any companies connected with the Non-Hotel Accommodation as owner, manager or operator</p>
		                <p><a class="sub_heading_content" id="nonHotelAddress-preview" href="<%=Validator.isNotNull(resortAttachedUrl)? resortAttachedUrl:""%>"><%=(Validator.isNotNull(resortAttached))?resortAttached:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<p>The previous experience of the operator is as follows</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						 operating Non-Hotel Accommodation in <span class="giluio nonHotelOperater">
						</span> from <span class="giluio hotelFrom"> </span> To <span class="giluio dateTo"> </span> operating the Non-Hotel Accommodation since <span
							class="giluio dateSince"> </span> other, that is to say <span class="giluio otherHotel"> </span>
					</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="signDateNonHotelPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					
						<%
						if (Validator.isNotNull(resortSignApp)) {
					%>
						<div class="signature_texarea mb-2"
						id="signatureNonHotelImageHolderPreview">
						<img src="<%=resortSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="signatureNonHotelImageHolderPreview"></div>
					<%
						}
					%>		
						
				</div>
			</div>
		</div>
	</section>			
</div>			
<script>
function previewNonHotelLicenceDetailInfo() {
	nonHotelAccommodationName = $("#nonHotelAccommodationName").val();
	nonHotelAccomadationAddress = $("#nonHotelAccomadationAddress").val();
	nonHotelAccomadationTelephone = $("#nonHotelAccomadationTelephone").val();
	/* nonHotelAccomadationFaxNum = $("#nonHotelAccomadationFaxNum").val(); */
	nonHotelAccomadationEmail = $("#nonHotelAccomadationEmail").val();
	nonHotelAccomadationEmployeesNum = $("#nonHotelAccomadationEmployeesNum").val();
	nonHotelAccomadationTypeOffered = $("input[name='offeredAccomadation']:checked").val();
	nonHotelAccomadationRoomNum = $("#nonHotelAccomadationRoomNum").val();
	nonHotelAccomadationOwnerName = $("#nonHotelAccomadationOwnerName").val();
	nonHotelAccomadationAddressOwner = $("#nonHotelAccomadationAddressOwner").val();
	nonHotelAccomadationTelNo = $("#nonHotelAccomadationTelNo").val();
	/* nonHotelAccomadationFaxNumber = $("#nonHotelAccomadationFaxNumber").val(); */
	nonHotelAccomadationCompanyName = $("#nonHotelAccomadationCompanyName").val();
	nonHotelAccomadationAddressCompany = $("#nonHotelAccomadationAddressCompany").val();
	nonHotelAccomadationManagerName = $("#nonHotelAccomadationManagerName").val();
	nonHotelAccomadationAddressManager = $("#nonHotelAccomadationAddressManager").val();
	nonHotelAccomadationManagerTel = $("#nonHotelAccomadationManagerTel").val();
	/* nonHotelAccomadationManagerFax = $("#nonHotelAccomadationManagerFax").val(); */
	nonHotelAccomadationManagerEmail = $("#nonHotelAccomadationManagerEmail").val();
	newHotelAccomadationSignDate = $("#newHotelAccomadationSignDate").val();


	$("#accommodationNameNonHotelPreview").html(nonHotelAccommodationName);
	$("#addressNonHotelPreview").html(nonHotelAccomadationAddress);
	$("#telephoneNonHotelPreview").html(nonHotelAccomadationTelephone);
	/* $("#faxNonHotelPreview").html(nonHotelAccomadationFaxNum); */
	$("#emailNonHotelPreview").html(nonHotelAccomadationEmail);
	$("#employeeNoNonHotelPreview").html(nonHotelAccomadationEmployeesNum);
	$("#typeNonHotelPreview").html(nonHotelAccomadationTypeOffered);
	$("#numOfRoomsNonHotelPreview").html(nonHotelAccomadationRoomNum);
	$("#ownerNameNonHotelPreview").html(nonHotelAccomadationOwnerName);
	$("#ownerAddressNonHotelPreview").html(nonHotelAccomadationAddressOwner);
	$("#ownerTelephoneNonHotelPreview").html(nonHotelAccomadationTelNo);
	/* $("#ownerFaxNonHotelPreview").html(nonHotelAccomadationFaxNumber); */
	$("#companyNameNonHotelPreview").html(nonHotelAccomadationCompanyName);
	$("#companyAddressNonHotelPreview").html(nonHotelAccomadationAddressCompany);
	$("#managerNameNonHotelPreview").html(nonHotelAccomadationManagerName);
	$("#managerAddressNonHotelPreview").html(nonHotelAccomadationAddressManager);
	$("#managerTelephoneNonHotelPreview").html(nonHotelAccomadationManagerTel);
	/* $("#managerFaxNonHotelPreview").html(nonHotelAccomadationManagerFax); */
	$("#managerEmailNonHotelPreview").html(nonHotelAccomadationManagerEmail);
	$("#signDateNonHotelPreview").html(newHotelAccomadationSignDate);
	
	var selectedlicenceRequirement = new Array();
	$("input:checkbox[name=licenceRequirement]:checked").each(function() {
		selectedlicenceRequirement.push($(this).val()); 
	});
	$("#requirementNonHotelPreview").html(selectedlicenceRequirement.join(", "));
	
	var selectedbedrooms = new Array();
	$("input:checkbox[name=bedrooms]:checked").each(function() {
		selectedbedrooms.push($(this).val()); 
	});
	$("#bedroomNonHotelPreview").html(selectedbedrooms.join(", "));
	
	var selectedbathrooms = new Array();
	$("input:checkbox[name=bathrooms]:checked").each(function() {
		selectedbathrooms.push($(this).val()); 
	});
	$("#bathroomNonHotelPreview").html(selectedbathrooms.join(", "));
}
</script>	