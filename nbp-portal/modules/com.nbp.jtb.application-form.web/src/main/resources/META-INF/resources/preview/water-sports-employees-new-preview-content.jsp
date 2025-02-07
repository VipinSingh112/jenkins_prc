<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="water-sports-employee-preview hide">
	<section id="jtbPreviewStep11" class="final-preview-section">
		<div class="water-Sport-Employee-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Water Sports Employees Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="waterSportEmployeeEditTab"> <svg width="19" height="19"
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
						I hereby make application to be licensed to operate in the Tourist
						Industry as a <span class="giluio categoryName"> </span>
					</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Full Name of Applicant</p>
						<p class="sub_heading_content" id="waterSEmployeeApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address of Applicant</p>
						<p class="sub_heading_content" id="waterSEmployeeApplicantAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Age</p>
						<p class="sub_heading_content" id="waterSEmployeeApplicantAgePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nationality</p>
						<p class="sub_heading_content" id="waterSEmployeeApplicantNationalityPreview"></p>
					</div>
				</div>
			</div>
			<div class="row jamaicaWorkPermitUploadBox hide">
				<div class="col-6">
					<div>
						<p class="sub_heading">Has Work Permit Been Applied for</p>
						<p class="sub_heading_content" id="waterSEmployeePermitPreview"></p>
						<p><a class="sub_heading_content" id="waterSEmployeePermitPreview" href="<%=Validator.isNotNull(workPermitDocUrl)? workPermitDocUrl:""%>"><%=(Validator.isNotNull(workPermitDoc))?workPermitDoc:""%></a></p>
						
					</div>
				</div>
				<div class="col-6 hide" id="date-applicationPre">
					<div>
						<p class="sub_heading">Date of Application</p>
						<p class="sub_heading_content" id="waterSEmployeeAppliccationDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Qualification/certification</p>
						<p class="sub_heading_content" id="waterSEmployeeCertificationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Place of Employment</p>
						<p class="sub_heading_content" id="waterSEmployeePlacePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Owner/manager</p>
						<p class="sub_heading_content" id="waterSEmployeeOwnerNamePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep12">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="waterSportEmployeesGeneralEditTab"> <svg width="19" height="19"
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
				<div class="col-12">
					<p class="tab-form-main-heading">I Declare That</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">CPR</p>
						<p class="sub_heading_content" id="waterSEmployeeCprPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">First Aid</p>
						<p class="sub_heading_content" id="waterSEmployeeFirstAidPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Medic First Aid</p>
						<p class="sub_heading_content" id="waterSEmployeeMedicAidPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">Rescue and Lifesaving Level of
						Qualification</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Life Guard</p>
						<p class="sub_heading_content" id="waterSEmployeeLifeGuardPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Rescue Diver</p>
						<p class="sub_heading_content" id="waterSEmployeeDiverPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Other</p>
						<p class="sub_heading_content" id="waterSEmployeeOtherPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">I State the Foregoing to the
						Best of My Knowledge and Belief</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Employee</p>
					
						<%
						if (Validator.isNotNull(waterEmpSign)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureWaterSportEmployeeImageHolderPreview">
						<img src="<%=waterEmpSign%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureWaterSportEmployeeImageHolderPreview"></div>
					<%
						}
					%>	
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="waterSEmployeeSignDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						This is to certify that the applicant is to the best of my
						knowledge and belief a person of good character and sober habits
						and has been known to me for a period of <span
							class="giluio timePeriod"> </span>.
					</p>
				</div>
				<div class="col-12">
					<div>
						<p><a class="sub_heading_content" id="justicePeaceLetter-preview" href="<%=Validator.isNotNull(justicePeaceDocUrl)? justicePeaceDocUrl:""%>"><%=(Validator.isNotNull(justicePeaceDoc))?justicePeaceDoc:""%></a></p>
					</div>
				</div>
				<%-- <div class="col-md-12">
					<p class="pt-2 common-para">Superintendent of Police or
								Justice of the Peace</p>
				
						<%
						if (Validator.isNotNull(justiceSeal)) {
				      	%>
						<div class="signature_texarea mb-2"
						id="applicantStampWaterSportEmployeeImageHolderPreview">
						<img src="<%=justiceSeal%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantStampWaterSportEmployeeImageHolderPreview"></div>
					<%
						}
					%>	
				</div> --%>
			</div>
		</div>
	</section>
</div>
<script>
function previewWaterSportEmployeesLicenceDetailInfo() {
	waterSportEmployeeApplicantName = $("#waterSportEmployeeApplicantName").val();
	waterSportEmployeeAddress = $("#waterSportEmployeeAddress").val();
	waterSportEmployeeApplicantAge = $("#waterSportEmployeeApplicantAge").val();
	waterSportEmployeeNationality = $("#waterSportEmployeeNationality").val();
	permitApplied = $("input[name='permitApplied']:checked").val();
	WaterSportEmployessADate = $("#WaterSportEmployessADate").val();
	WaterSportEmployessQualification = $("#WaterSportEmployessQualification").val();
	WaterSportEmployessEmployment = $("#WaterSportEmployessEmployment").val();
	WaterSportEmployessOwnerNam = $("#WaterSportEmployessOwnerNam").val();
	cpr = $("input[name='cpr']:checked").val();
	firstAid = $("input[name='firstAid']:checked").val();
	medicFirstAid = $("input[name='medicFirstAid']:checked").val();
	lifeguard = $("input[name='lifeguard']:checked").val();
	rescueDiver = $("input[name='rescueDiver']:checked").val();
	other = $("input[name='other']:checked").val();
	WaterSportEmpSignDate = $("#WaterSportEmpSignDate").val();
	
	
	$("#waterSEmployeeApplicantNamePreview").html(waterSportEmployeeApplicantName);
	$("#waterSEmployeeApplicantAddressPreview").html(waterSportEmployeeAddress);
	$("#waterSEmployeeApplicantAgePreview").html(waterSportEmployeeApplicantAge);
	$("#waterSEmployeeApplicantNationalityPreview").html(waterSportEmployeeNationality);
	$("#waterSEmployeePermitPreview").html(permitApplied);
	$("#waterSEmployeeAppliccationDatePreview").html(WaterSportEmployessADate);
	$("#waterSEmployeeCertificationPreview").html(WaterSportEmployessQualification);
	$("#waterSEmployeePlacePreview").html(WaterSportEmployessEmployment);
	$("#waterSEmployeeOwnerNamePreview").html(WaterSportEmployessOwnerNam);
	$("#waterSEmployeeCprPreview").html(cpr);
	$("#waterSEmployeeFirstAidPreview").html(firstAid);
	$("#waterSEmployeeMedicAidPreview").html(medicFirstAid);
	$("#waterSEmployeeLifeGuardPreview").html(lifeguard);
	$("#waterSEmployeeDiverPreview").html(rescueDiver);
	$("#waterSEmployeeOtherPreview").html(other);
	$("#waterSEmployeeSignDatePreview").html(WaterSportEmpSignDate);
	
}
</script>
