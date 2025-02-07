<%@page import="com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="domestic-tour-company-preview hide">
	<section id="jtbPreviewStep17" class="final-preview-section">
		<div class="domestic-tour-company-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Domestic Tour Company Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="domesticTourEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading_content" id="companyTourApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="companyTourAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Company</p>
						<p class="sub_heading_content" id="companyTourNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Exact Location</p>
						<p class="sub_heading_content" id="companyTourLocationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="companyTourTeleNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="companyTourFaxNoPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="companyTourEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date of Company Registration</p>
						<p class="sub_heading_content" id="companyTourRegistrationDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Manager's Name</p>
						<p class="sub_heading_content" id="companyTourManagerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Vehicles in Fleet</p>
						<p class="sub_heading_content" id="companyTourVehiclesNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="companyTourEmployeesNumPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Branch Office Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addDomesticTourBranchDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Branch Office Locations</th>
										<th class="sub_heading text-nowrap">Telephone No</th>
									</tr>
										<%if(Validator.isNotNull(branchOfficeAdd)&&branchOfficeAdd.size()>0){
											int domesticTourBranchDetailVal=1;
					for(JtbAddBranchDetailInfo domesticBranch:branchOfficeAdd){ %>
					<tr class="domestic-branch-detail-row<%=domesticTourBranchDetailVal%>">
					<td class="sub_heading_content text-nowrap domesticTourOfficeLocation<%=domesticTourBranchDetailVal%>">
					<%=Validator.isNotNull(domesticBranch)&&Validator.isNotNull(domesticBranch.getBranchOfficeLocation())?domesticBranch.getBranchOfficeLocation():""%></td>
					<td class="sub_heading_content text-nowrap domesticTourBranchTelephoneNo<%=domesticTourBranchDetailVal%>">
					<%=Validator.isNotNull(domesticBranch)&&Validator.isNotNull(domesticBranch.getBranchOfficeDetails())?domesticBranch.getBranchOfficeDetails():""%></td>
					
				     <input type="hidden" id="domesticTourBranchDetailId<%=domesticTourBranchDetailVal%>" name="domesticTourBranchDetailId<%=domesticTourBranchDetailVal%>" value="<%=domesticBranch.getJtbBranchDetailInfoId()%>">
				</tr>
				<%domesticTourBranchDetailVal=domesticTourBranchDetailVal+1;
					}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I <span class="giluio domesticApplicantName"> </span> Hereby
						Certify That the Information Given Herein is to the Best of My
						Knowledge and Belief a True and Accurate Testimony.
					</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(domesticTourDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignaturedomesticHolderPreview">
						<img src="<%=domesticTourDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignaturedomesticHolderPreview"></div>
					<%
						}
					%>	
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="companyTourSignDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep18">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Services</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="domesticTourServicesEditTab"> <svg width="19"
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
						<p class="pt-2 common-para">Indicated Below Are the Services
							Offered by the Establishment Named</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">A. Secure accommodation - Hotel, Guest House, Villa, Apartment for individuals and groups</p>
						<p class="sub_heading_content" id="companyTourIndividualsApartmentPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">B. Provide meeting service and assistance at airport or dock</p>
						<p class="sub_heading_content" id="companyTourAirportAssistancePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">C. Processing, ticketing and general briefing for entire tour</p>
						<p class="sub_heading_content" id="companyTourEntireTourPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">D. Provides arrival and departure transfers whether by limousine or exclusive service</p>
						<p class="sub_heading_content" id="companyTourTransfersDeparturePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">E. Schedule transportation and sightseeing for groups and individuals</p>
						<p class="sub_heading_content" id="companyTourIndividualGroupsPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">F. Assigns escorts, guides, interpreters in conjunction with organized excursion and overland guided tour activity</p>
						<p class="sub_heading_content" id="companyTourOrganizedConjunctionPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">G. Supply chauffeur - driven or drive yourself transportation daily/weekly basis</p>
						<p class="sub_heading_content" id="companyTourDailyTransportationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">H. Arrange meals, meetings and entertainment</p>
						<p class="sub_heading_content" id="companyTourEntertainmentPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>
					<%
						if (Validator.isNotNull(domesticServDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="signatureDomesticTourHolderPreview">
						<img src="<%=domesticServDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
						<div class="signature_texarea mb-2"
						id="signatureDomesticTourHolderPreview"></div>
					<%
						}
					%>	
				
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Company Seal</p>
					<%
						if (Validator.isNotNull(domesticSealDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="companySealDomesticTourHolderPreview">
						<img src="<%=domesticSealDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
						<div class="signature_texarea mb-2"
						id="companySealDomesticTourHolderPreview"></div>
					<%
						}
					%>	
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="companyTourSealDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewDomesticTourCompanyLicenceDetailInfo() {
	domesticTourApplicantName = $("#domesticTourApplicantName").val();
	domesticTourAddress = $("#domesticTourAddress").val();
	domesticTourCompanyName = $("#domesticTourCompanyName").val();
	domesticTourExactLocation = $("#domesticTourExactLocation").val();
	domesticTourTelephone = $("#domesticTourTelephone").val();
	/* domesticTourFaxNum = $("#domesticTourFaxNum").val(); */
	domesticTourEmail = $("#domesticTourEmail").val();
	domesticTourDate = $("#domesticTourDate").val();
	domesticTourManagerName = $("#domesticTourManagerName").val();
	domesticTourVehiclesNumber = $("#domesticTourVehiclesNumber").val();
	domesticTourEmployeesNo = $("#domesticTourEmployeesNo").val();
	domesticTourSignDate = $("#domesticTourSignDate").val();
	
	individualsapartment = $("input[name='individualsapartment']:checked").val();
	airportassistance = $("input[name='airportassistance']:checked").val();
	entiretour = $("input[name='entiretour']:checked").val();
	transfersdeparture = $("input[name='transfersdeparture']:checked").val();
	individualgroups = $("input[name='individualgroups']:checked").val();
	organizedconjunction = $("input[name='organizedconjunction']:checked").val();
	dailytransportation = $("input[name='dailytransportation']:checked").val();
	entertainment = $("input[name='entertainment']:checked").val();
	domesticTourSealDate = $("#domesticTourSealDate").val();
	
	
	$("#companyTourApplicantNamePreview").html(domesticTourApplicantName);
	$("#companyTourAddressPreview").html(domesticTourAddress);
	$("#companyTourNamePreview").html(domesticTourCompanyName);
	$("#companyTourLocationPreview").html(domesticTourExactLocation);
	$("#companyTourTeleNoPreview").html(domesticTourTelephone);
	/* $("#companyTourFaxNoPreview").html(domesticTourFaxNum); */
	$("#companyTourEmailAddressPreview").html(domesticTourEmail);
	$("#companyTourRegistrationDatePreview").html(domesticTourDate);
	$("#companyTourManagerNamePreview").html(domesticTourManagerName);
	$("#companyTourVehiclesNumPreview").html(domesticTourVehiclesNumber);
	$("#companyTourEmployeesNumPreview").html(domesticTourEmployeesNo);
	$("#companyTourSignDatePreview").html(domesticTourSignDate);
	
	$("#companyTourIndividualsApartmentPreview").html(individualsapartment);
	$("#companyTourAirportAssistancePreview").html(airportassistance);
	$("#companyTourEntireTourPreview").html(entiretour);
	$("#companyTourTransfersDeparturePreview").html(transfersdeparture);
	$("#companyTourIndividualGroupsPreview").html(individualgroups);
	$("#companyTourOrganizedConjunctionPreview").html(organizedconjunction);
	$("#companyTourDailyTransportationPreview").html(dailytransportation);
	$("#companyTourEntertainmentPreview").html(entertainment);
	$("#companyTourSealDatePreview").html(domesticTourSealDate);
}
</script>