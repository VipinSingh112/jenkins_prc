<%@page import="com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="carRentalNewForm hide">
	<section id="jtbPreviewStep9" class="final-preview-section">
		<div class="car-rental-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Car Rental Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="carRentalEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of Owner/Director</p>
						<p class="sub_heading_content" id="carRentalDirectorNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="carRentalAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Company</p>
						<p class="sub_heading_content" id="carRentalCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="carRentalCompanyAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="carRentalTelephonePreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="carRentalFaxPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="carRentalEmailPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date of Company Registration</p>
						<p class="sub_heading_content" id="carRentalDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Manager</p>
						<p class="sub_heading_content" id="carRentalManagerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Vehicles in Fleet</p>
						<p class="sub_heading_content" id="carRentalVehiclesNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="carRentalEmployeesNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-12">
					<div>
						<p class="sub_heading">Branch Office Locations</p>
						<p class="sub_heading_content" id="carRentalOfficeLocationPreview"></p>
					</div>
				</div> -->
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Branch Office Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addCarRentalBranchDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Branch Office Locations</th>
										<th class="sub_heading text-nowrap">Telephone No</th>
									</tr>
									<%if(Validator.isNotNull(branchOfficeAdd)&&branchOfficeAdd.size()>0){
										int carRentalBranchDetailVal=1;
		for(JtbAddBranchDetailInfo carRentalBranch:branchOfficeAdd){ %>
	<tr class="branch-detail-row<%=carRentalBranchDetailVal%>">
	<td class="sub_heading_content text-nowrap carRentalOfficeLocation<%=carRentalBranchDetailVal%>">
	<%=Validator.isNotNull(carRentalBranch)&&Validator.isNotNull(carRentalBranch.getBranchOfficeLocation())?carRentalBranch.getBranchOfficeLocation():""%></td>
	<td class="sub_heading_content text-nowrap carRentalBranchTelephoneNo<%=carRentalBranchDetailVal%>">
	<%=Validator.isNotNull(carRentalBranch)&&Validator.isNotNull(carRentalBranch.getBranchOfficeDetails())?carRentalBranch.getBranchOfficeDetails():""%></td>
	
     <input type="hidden" id="carRentalBranchDetailId<%=carRentalBranchDetailVal%>" name="carRentalBranchDetailId<%=carRentalBranchDetailVal%>" value="<%=carRentalBranch.getJtbBranchDetailInfoId()%>">
</tr>
<%carRentalBranchDetailVal=carRentalBranchDetailVal+1;
	}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I, <span class="giluio declaration-by"></span>, hereby certify
						that the information given is to the best of my knowledge and
						belief a true and accurate testimony
					</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(carRentDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureCarRentalImgHolderPreview">
						<img src="<%=carRentDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureCarRentalImgHolderPreview"></div>
					<%
						}
					%>	
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="carRentalPositionPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="carRentalSignDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep10">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Car-Rental Conditions</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="carRentalConditionsEditTab"> <svg width="19"
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
						<p class="sub_heading">Conditions Proposed for
								Rent-a-car Company/operation in the Tourist Industry</p>
						<p class="sub_heading"><b  id="touristIndustryPreview"></b></p>
					</div>
				</div>
			</div>
		</div>
	</section>


</div>
<script>
	function previewCarRentalLicenceDetailInfo() {
		newCarRentalApplicantName = $("#newCarRentalApplicantName").val();
		newCarRentalAddress = $("#newCarRentalAddress").val();
		newCarRentalCompanyName = $("#newCarRentalCompanyName").val();
		newCarRentalCompanyAddress = $("#newCarRentalCompanyAddress").val();
		newCarRentalTelephone = $("#newCarRentalTelephone").val();
		/* newCarRentalFaxNum = $("#newCarRentalFaxNum").val(); */
		newCarRentalEmail = $("#newCarRentalEmail").val();
		newCarRentalDate = $("#newCarRentalDate").val();
		newCarRentalManagerName = $("#newCarRentalManagerName").val();
		newCarRentalVehiclesNo = $("#newCarRentalVehiclesNo").val();
		newCarRentalEmployeesNo = $("#newCarRentalEmployeesNo").val();
		newCarRentalOfficeLocation = $("#newCarRentalOfficeLocation").val();
		newCarRentalPosition = $("#newCarRentalPosition").val();
		newCarRentalDate = $("#newCarRentalDate").val();
		newCarRentalSignDate = $("#newCarRentalSignDate").val();

		$("#carRentalDirectorNamePreview").html(newCarRentalApplicantName);
		$("#carRentalAddressPreview").html(newCarRentalAddress);
		$("#carRentalCompanyNamePreview").html(newCarRentalCompanyName);
		$("#carRentalCompanyAddressPreview").html(newCarRentalCompanyAddress);
		$("#carRentalTelephonePreview").html(newCarRentalTelephone);
		/* $("#carRentalFaxPreview").html(newCarRentalFaxNum); */
		$("#carRentalEmailPreview").html(newCarRentalEmail);
		$("#carRentalDatePreview").html(newCarRentalDate);
		$("#carRentalManagerNamePreview").html(newCarRentalManagerName);
		$("#carRentalVehiclesNoPreview").html(newCarRentalVehiclesNo);
		$("#carRentalEmployeesNoPreview").html(newCarRentalEmployeesNo);
		$("#carRentalOfficeLocationPreview").html(newCarRentalOfficeLocation);
		$("#carRentalPositionPreview").html(newCarRentalPosition);
		$("#carRentalSignDatePreview").html(newCarRentalSignDate);
		
		var selectedtouristIndustry = new Array();
		$("input:checkbox[name=touristIndustry]:checked").each(function() {
			selectedtouristIndustry.push($(this).val()); 
		});
		$("#touristIndustryPreview").html(selectedtouristIndustry.join('<br><br>'));

	}
</script>

