<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="travel-agency-preview hide">
	<section id="jtbPreviewStep19" class="final-preview-section">
		<div class="travel-agency-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Travel Agency Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="travelAgencyEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading_content" id="travelApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="travelAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="travelTelephonePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Travel Agency</p>
						<p class="sub_heading_content" id="travelAgencyNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="travelAgencyAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="travelAgencyTeleNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="travelFaxNoPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Whether Registered Company</p>
						<p class="sub_heading_content" id="travelRegistedCompanyPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Particulars of Registration</p>
						<p class="sub_heading_content" id="travelRegistrationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Proprietor\Directors</p>
						<p class="sub_heading_content" id="travelProprietorNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and address of Manager</p>
						<p class="sub_heading_content" id="travelManagerNamePreview"></p>
						<p class="sub_heading_content" id="travelManagerAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and address of Secretary(if a company)</p>
						<p class="sub_heading_content" id="travelSecretaryNamePreview"></p>
						<p class="sub_heading_content" id="travelSecretaryAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Bankers</p>
						<p class="sub_heading_content" id="travelBankersPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Bonding Company or Sureties</p>
						<p class="sub_heading_content" id="travelBondingCompanyPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="travelCompanyAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Auditors</p>
						<p class="sub_heading_content" id="travelAuditorsNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="travelAuditorsAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">No of Employees</p>
						<p class="sub_heading_content" id="travelAuditorsEmployeesNoPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(agencyDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignaturetravelAgencyHolderPreview">
						<img src="<%=agencyDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignaturetravelAgencyHolderPreview"></div>
					<%
						}
					%>	
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="travelSignDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewTravelAgencyLicenceDetailInfo() {
	travelAgencyApplicantName = $("#travelAgencyApplicantName").val();
	travelAgencyAddress = $("#travelAgencyAddress").val();
	travelAgencyTelephone = $("#travelAgencyTelephone").val();
	travelAgencyName = $("#travelAgencyName").val();
	travelAgencyAddressSec = $("#travelAgencyAddressSec").val();
	travelAgencyTelephoneNum = $("#travelAgencyTelephoneNum").val();
	/* travelAgencyFaxNum = $("#travelAgencyFaxNum").val(); */
	company = $("input[name='company']:checked").val();
	travelAgencyRegistration = $("#travelAgencyRegistration").val();
	travelAgencyProprietorName = $("#travelAgencyProprietorName").val();
	travelAgencyManagerName = $("#travelAgencyManagerName").val();
	travelAgencyManagerAddress = $("#travelAgencyManagerAddress").val();
	travelAgencySecretaryName = $("#travelAgencySecretaryName").val();
	travelAgencySecretaryAddress = $("#travelAgencySecretaryAddress").val();
	travelAgencyBankerName = $("#travelAgencyBankerName").val();
	travelAgencyCompanyName = $("#travelAgencyCompanyName").val();
	travelAgencyCompanyAddress = $("#travelAgencyCompanyAddress").val();
	travelAgencyAuditorsName = $("#travelAgencyAuditorsName").val();
	travelAgencyAuditorAddress = $("#travelAgencyAuditorAddress").val();
	travelAgencyEmployeesNo = $("#travelAgencyEmployeesNo").val();
	travelAgencySignDate = $("#travelAgencySignDate").val();

	$("#travelApplicantNamePreview").html(travelAgencyApplicantName);
	$("#travelAddressPreview").html(travelAgencyAddress);
	$("#travelTelephonePreview").html(travelAgencyTelephone);
	$("#travelAgencyNamePreview").html(travelAgencyName);
	$("#travelAgencyAddressPreview").html(travelAgencyAddressSec);
	$("#travelAgencyTeleNoPreview").html(travelAgencyTelephoneNum);
	/* $("#travelFaxNoPreview").html(travelAgencyFaxNum); */
	$("#travelRegistedCompanyPreview").html(company);
	$("#travelRegistrationPreview").html(travelAgencyRegistration);
	$("#travelProprietorNamePreview").html(travelAgencyProprietorName);
	$("#travelManagerNamePreview").html(travelAgencyManagerName);
	$("#travelManagerAddressPreview").html(travelAgencyManagerAddress);
	$("#travelSecretaryNamePreview").html(travelAgencySecretaryName);
	$("#travelSecretaryAddressPreview").html(travelAgencySecretaryAddress);
	$("#travelBankersPreview").html(travelAgencyBankerName);
	$("#travelBondingCompanyPreview").html(travelAgencyCompanyName);
	$("#travelCompanyAddressPreview").html(travelAgencyCompanyAddress);
	$("#travelAuditorsNamePreview").html(travelAgencyAuditorsName);
	$("#travelAuditorsAddressPreview").html(travelAgencyAuditorAddress);
	$("#travelAuditorsEmployeesNoPreview").html(travelAgencyEmployeesNo);
	$("#travelSignDatePreview").html(travelAgencySignDate);
}
</script>