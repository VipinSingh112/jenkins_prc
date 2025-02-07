<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="water-sports-operator-preview hide">
	<section id="jtbPreviewStep22" class="final-preview-section">
		<div class="water-sports-operator-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Watersports Operator's Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="waterSportsOperatorEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of Business</p>
						<p class="sub_heading_content" id="sportOperatorBusinessNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mailing Address</p>
						<p class="sub_heading_content" id="sportOperatorMailingAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Exact Location of Business</p>
						<p class="sub_heading_content" id="sportOperatorBusinessLocationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Phone No</p>
						<p class="sub_heading_content" id="sportOperatorPhoneNoPreview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="sportOperatorFaxNoPreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="sportOperatorEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Owner</p>
						<p class="sub_heading_content" id="sportOperatorOwnerNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of Owner</p>
						<p class="sub_heading_content" id="sportOperatorOwnerAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Manager/Director</p>
						<p class="sub_heading_content" id="sportOperatorManagerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="sportOperatorApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nationality</p>
						<p class="sub_heading_content" id="sportOperatorNationalityPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Employees</p>
						<p class="sub_heading_content" id="sportOperatorEmployeesNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">List of Activities</p>
						<p class="sub_heading_content" id="sportOperatorActivitiesListPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Evidence of Authority to Occupy Location</p>
						<p class="sub_heading_content" id="sportOperatorOccupyLocationPreview"></p>
						<!-- <p class="sub_heading_content occupyLocationWater1" id="evidenceOwnershipWater-pre"></p>
						<p class="sub_heading_content occupyLocationWater2" id="rentReceiptWater-pre"></p>
						<p class="sub_heading_content occupyLocationWater3" id="letterOwnerWater-pre"></p>
						<p class="sub_heading_content occupyLocationWater4" id="contractLeaseWater-pre"></p> -->
						 <p><a class="sub_heading_content" id="evidenceOwnershipWater-preview"></a></p>
						 <p><a class="sub_heading_content" id="evidenceOwnershipWater-preview" href="<%=Validator.isNotNull(waterEvidenceSignUrl)? waterEvidenceSignUrl:""%>"><%=(Validator.isNotNull(waterEvidenceSign))?waterEvidenceSign:""%></a></p>
						
						 <p><a class="sub_heading_content" id="rentReceiptWater-preview"></a></p>
						 <p><a class="sub_heading_content" id="rentReceiptWater-preview" href="<%=Validator.isNotNull(waterRentSignUrl)? waterRentSignUrl:""%>"><%=(Validator.isNotNull(waterRentSign))?waterRentSign:""%></a></p>
						
						 <p><a class="sub_heading_content" id="letterOwnerWater-preview"></a></p>
						 <p><a class="sub_heading_content" id="letterOwnerWater-preview" href="<%=Validator.isNotNull(waterLetterOwnerSignUrl)? waterLetterOwnerSignUrl:""%>"><%=(Validator.isNotNull(waterLetterOwnerSign))?waterLetterOwnerSign:""%></a></p>
						 
						 <p><a class="sub_heading_content" id="contractLeaseWater-preview"></a></p>
						 <p><a class="sub_heading_content" id="contractLeaseWater-preview" href="<%=Validator.isNotNull(waterContractLeaseSignUrl)? waterContractLeaseSignUrl:""%>"><%=(Validator.isNotNull(waterContractLeaseSign))?waterContractLeaseSign:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading address-of-directors"></p>
						<p><a class="sub_heading_content" id="address-of-directors-preview"></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Has Proposal Been Submitted</p>
						<p class="sub_heading_content" id="sportOperatorProposalPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Are Foreign Nationals Involved in the Operation</p>
						<p class="sub_heading_content" id="sportOperatorNationalsOperationPreview"></p>
					</div>
				</div>
				<div class="col-6 hide" id="otherCopyPre">
					<div>
						<p class="sub_heading">Has Work Permit Been Applied for</p>
						<p class="sub_heading_content" id="sportOperatorWorkPermitPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep23">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="waterSportDeclarationEditTab"> <svg width="19"
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
					<p class="common-para">I Declare That</p>
					<p class="sub_heading">1. I am qualified in</p>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">First Aid</p>
						<p class="sub_heading_content" id="sportOperatorFirstAidPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">CPR</p>
						<p class="sub_heading_content" id="sportOperatorCprPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="common-para">Rescue and Lifesaving - Level of Qualification</p>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">a. Diving Certificate</p>
						<p class="sub_heading_content" id="sportOperatorCertificatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">b. RLSS</p>
						<p class="sub_heading_content" id="sportOperatorRlssPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">c. Lifeguard</p>
						<p class="sub_heading_content" id="sportOperatorLifeguardPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">2. My staff complement is (Attach detailed list along with application for each employee with all relevant 
						documents/certificates including designated dive instructor(s) [where applicable])</p>
						<p><a class="sub_heading_content" id="employees-document-pre" href="<%=Validator.isNotNull(waterSportDocUrl)? waterSportDocUrl:""%>"><%=(Validator.isNotNull(waterSportDoc))?waterSportDoc:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">3. My business involves the use of compressed air for breathing</p>
						<p class="sub_heading_content" id="sportOperatorAirBreatingPreview"></p>
					</div>
				</div>
				<div class="col-md-12 hide" id="name-detailsPreview">
					<div>
						<p class="sub_heading">Compressed air is supplied by</p>
						<p class="sub_heading_content" id="sportOperatorNamePreview"></p>
						<p class="sub_heading_content" id="sportOperatorAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">4. My operation has $ <span class="giluio sportInsuranceAmount"> </span> Public Liability Insurance Coverage</p>
					</div>
				</div>	
				<div class="col-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(waterSportOwner)) {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureWaterSportImageHolderPreview">
						<img src="<%=waterSportOwner%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureWaterSportImageHolderPreview"></div>
					<%
						}
					%>		
					
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature of Manager</p>
					<%
						if (Validator.isNotNull(waterSportManager)) {
					%>
					<div class="signature_texarea mb-2"
						id="managerSignatureWaterSportImageHolderPreview">
						<img src="<%=waterSportManager%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="managerSignatureWaterSportImageHolderPreview"></div>
					<%
						}
					%>		
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="sportOperatorDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep24">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Watersports Requirements</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="waterSportsRequirementEditTab"> <svg width="19"
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
						<p class="sub_heading">General for all Operators</p>
						<p class="sub_heading_content" id="sportOperatorGeneralPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Personal Water Craft (Jet Ski/wave Runner)</p>
						<p class="sub_heading_content" id="sportOperatorWaterCraftPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Water Ski</p>
						<p class="sub_heading_content" id="sportOperatorWaterSkiPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Sunfish Sail</p>
						<p class="sub_heading_content" id="sportOperatorSunfishSailPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Parasail</p>
						<p class="sub_heading_content" id="sportOperatorParasailPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Scuba Diving</p>
						<p class="sub_heading_content" id="sportOperatorScubaDivingPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Glass Bottom Boat/cruise</p>
						<p class="sub_heading_content" id="sportOperatorCruisePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Banana Boat Ride</p>
						<p class="sub_heading_content" id="sportOperatorBananaRidePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>			
</div>		
<script>
function previewWaterSportOperatorLicenceDetailInfo() {
	waterSportBusinessName = $("#waterSportBusinessName").val();
	waterSportMailingaAdd = $("#waterSportMailingaAdd").val();
	waterSportOpLocationAddress = $("#waterSportOpLocationAddress").val();
	waterSportOpPhone = $("#waterSportOpPhone").val();
	/* waterSportOpFaxNum = $("#waterSportOpFaxNum").val(); */
	waterSportOpEmail = $("#waterSportOpEmail").val();
	waterSportOpOwnerName = $("#waterSportOpOwnerName").val();
	waterSportOpAddressOwner = $("#waterSportOpAddressOwner").val();
	waterSportOpManagerName = $("#waterSportOpManagerName").val();
	waterSportOpApplicantName = $("#waterSportOpApplicantName").val();
	waterSportOpNationality = $("#waterSportOpNationality").val();
	waterSportOpEmployeesNo = $("#waterSportOpEmployeesNo").val();
	waterSportOpActivitiesList = $("#waterSportOpActivitiesList").val();
	var selectedOccupyLocationWater = new Array();
	$("input:checkbox[name=occupyLocationWater]:checked").each(function() {
		selectedOccupyLocationWater.push($(this).val()); 
	});
	proposal = $("input[name='proposal']:checked").val();
	nationalsOperation = $("input[name='nationalsOperation']:checked").val();
	permitApplied = $("input[name='permitApplied']:checked").val();
	
	firstAid = $("input[name='firstAid']:checked").val();
	cpr = $("input[name='cpr']:checked").val();
	divingCertificate = $("input[name='divingCertificate']:checked").val();
	RLSS = $("input[name='RLSS']:checked").val();
	lifeguard = $("input[name='lifeguard']:checked").val();
	breathing = $("input[name='breathing']:checked").val();
	waterSportOpName = $("#waterSportOpName").val();
	waterSportOpAddress = $("#waterSportOpAddress").val();
	waterSportOpManagerSignDate = $("#waterSportOpManagerSignDate").val();
	
	$("#sportOperatorBusinessNamePreview").html(waterSportBusinessName);
	$("#sportOperatorMailingAddressPreview").html(waterSportMailingaAdd);
	$("#sportOperatorBusinessLocationPreview").html(waterSportOpLocationAddress);
	$("#sportOperatorPhoneNoPreview").html(waterSportOpPhone);
	/* $("#sportOperatorFaxNoPreview").html(waterSportOpFaxNum); */
	$("#sportOperatorEmailAddressPreview").html(waterSportOpEmail);
	$("#sportOperatorOwnerNamePreview").html(waterSportOpOwnerName);
	$("#sportOperatorOwnerAddressPreview").html(waterSportOpAddressOwner);
	$("#sportOperatorManagerNamePreview").html(waterSportOpManagerName);
	$("#sportOperatorApplicantNamePreview").html(waterSportOpApplicantName);
	$("#sportOperatorNationalityPreview").html(waterSportOpNationality);
	$("#sportOperatorEmployeesNamePreview").html(waterSportOpEmployeesNo);
	$("#sportOperatorActivitiesListPreview").html(waterSportOpActivitiesList);
	$("#sportOperatorOccupyLocationPreview").html(selectedOccupyLocationWater.join(", "));
	$("#sportOperatorProposalPreview").html(proposal);
	$("#sportOperatorNationalsOperationPreview").html(nationalsOperation);
	$("#sportOperatorWorkPermitPreview").html(permitApplied);
	
	$("#sportOperatorFirstAidPreview").html(firstAid);
	$("#sportOperatorCprPreview").html(cpr);
	$("#sportOperatorCertificatePreview").html(divingCertificate);
	$("#sportOperatorRlssPreview").html(RLSS);
	$("#sportOperatorLifeguardPreview").html(lifeguard);
	$("#sportOperatorAirBreatingPreview").html(breathing);
	$("#sportOperatorNamePreview").html(waterSportOpName);
	$("#sportOperatorAddressPreview").html(waterSportOpAddress);
	$("#sportOperatorDatePreview").html(waterSportOpManagerSignDate);
	
	var selectedgeneralOperator = new Array();
	$("input:checkbox[name=generalOperator]:checked").each(function() {
		selectedgeneralOperator.push($(this).val()); 
	});
	$("#sportOperatorGeneralPreview").html(selectedgeneralOperator.join(", "));
	
	var selectedwaterCraft = new Array();
	$("input:checkbox[name=waterCraft]:checked").each(function() {
		selectedwaterCraft.push($(this).val()); 
	});
	$("#sportOperatorWaterCraftPreview").html(selectedwaterCraft.join(", "));
	
	var selectedwaterSki = new Array();
	$("input:checkbox[name=waterSki]:checked").each(function() {
		selectedwaterSki.push($(this).val()); 
	});
	$("#sportOperatorWaterSkiPreview").html(selectedwaterSki.join(", "));
	
	var selectedsunfishSail = new Array();
	$("input:checkbox[name=sunfishSail]:checked").each(function() {
		selectedsunfishSail.push($(this).val()); 
	});
	$("#sportOperatorSunfishSailPreview").html(selectedsunfishSail.join(", "));
	
	var selectedparasail = new Array();
	$("input:checkbox[name=parasail]:checked").each(function() {
		selectedparasail.push($(this).val()); 
	});
	$("#sportOperatorParasailPreview").html(selectedparasail.join(", "));
	
	var selectedscubaDiving = new Array();
	$("input:checkbox[name=scubaDiving]:checked").each(function() {
		selectedscubaDiving.push($(this).val()); 
	});
	$("#sportOperatorScubaDivingPreview").html(selectedscubaDiving.join(", "));
	
	var selectedglassBoat = new Array();
	$("input:checkbox[name=glassBoat]:checked").each(function() {
		selectedglassBoat.push($(this).val()); 
	});
	$("#sportOperatorCruisePreview").html(selectedglassBoat.join(", "));
	
	var selectedbananaBoat = new Array();
	$("input:checkbox[name=bananaBoat]:checked").each(function() {
		selectedbananaBoat.push($(this).val()); 
	});
	$("#sportOperatorBananaRidePreview").html(selectedbananaBoat.join(", "));
	
}
</script>		