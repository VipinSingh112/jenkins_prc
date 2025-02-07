<%@ include file="../init.jsp" %>
<div class="hide" id="osiAssignmentCertificatePre">
	<section class="final-preview-section" id="osiServicesPreviewStep1">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Applicant Details</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="assignmentApplicantEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Nature of Applicant</p>
						<p class="sub_heading_content" id="applicantNaturePreview"></p>
					</div>
				</div> 
				<div class="col-md-6 hide indi-detail">
					<div>
						<p class="sub_heading">First Name</p>
						<p class="sub_heading_content" id="indiFirstNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide indi-detail">
					<div>
						<p class="sub_heading">Last Name</p>
						<p class="sub_heading_content" id="indiLastNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide com-detail">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="companyNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="addressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="emailAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="telephonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Application</p>
						<p class="sub_heading_content" id="applicationDatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">TRN #</p>
						<p class="sub_heading_content" id="trnNumberPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep2">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Insolvent Person Details</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="assignmentInsolvenctEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Nature of Insolvent Person</p>
						<p class="sub_heading_content" id="insolventPersonNaturePreview"></p>
					</div>
				</div> 
				<div class="col-md-6 hide insolvent-indi-detail">
					<div>
						<p class="sub_heading">First Name</p>
						<p class="sub_heading_content" id="insolventIndiFirstNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide insolvent-indi-detail">
					<div>
						<p class="sub_heading">Last Name</p>
						<p class="sub_heading_content" id="insolventIndiLastNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide insolvent-com-detail">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="insolventCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="insolventAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="insolventParishPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="insolventEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="insolventTelephonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">TRN #</p>
						<p class="sub_heading_content" id="insolventTrnNumberPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep3">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Assignment for the General Benefit of Creditors (Form 28)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="assignmentGenInfoEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="creditorNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="creditorDatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="creditorAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> 
						The Undersigned, being an insolvent person, hereby assign all of my property to
						<span class="giluio creditorName"></span> to be administered for the
						general body of creditors in accordance with the Act. 
					</p>
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="creditorImageHolderPre">
						<%if(Validator.isNotNull(fileUrlApplicant)){ %>
							<img src="<%=fileUrlApplicant%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="osiServicesPreviewStep4">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Application for Assignment(Form 27)</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="assignmentForApplicationEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="assignmentNamePreview"></p>
					</div>
				</div> 
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="assignmentDatedPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> 
						To The Supervisor of Insolvency 52-60 Grenada Crescent Kingston 5
						I,<span class="giluio indiName"></span>, hereby apply for the assignment of the property of
						<span class="giluio insolventCompanyName"></span> ("the insolvent person") for the general benefit of creditors
							in form of the attached assignment.
						
					</p>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Attached are</p>
						<p class="sub_heading_content" id="selectedAssignmentAttachedPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="assignmentAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Insolvent Person/Legal Representative</p>			
					<div class="signature_texarea mb-2" id="insolventPersonImageHolderPre">
						<%if(Validator.isNotNull(fileUrlInsolvent)){ %>
							<img src="<%=fileUrlInsolvent%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
/* ----PREVIEW---- */
function previewApplicantDetailInfo(){
	applicantNature = $("#applicantNature").val();
	indiFirstName = $("#indiFirstName").val();
	indiLastName = $("#indiLastName").val();
	companyName = $("#companyName").val();
	address = $("#address").val();
	emailAddress = $("#emailAddress").val();
	telephone = $("#telephone").val();
	applicationDate = $("#applicationDate").val();
	trnNumber = $("#trnNumber").val();
	$("#applicantNaturePreview").html(applicantNature);
	$("#indiFirstNamePreview").html(indiFirstName);
	$("#indiLastNamePreview").html(indiLastName);
	$("#companyNamePreview").html(companyName);
	$("#addressPreview").html(address);
	$("#emailAddressPreview").html(emailAddress);
	$("#telephonePreview").html(telephone);
	$("#applicationDatePreview").html(applicationDate);
	$("#trnNumberPreview").html(trnNumber);
}
function previewInsolventDetailInfo(){
	insolventPersonNature = $("#insolventPersonNature").val();
	insolventIndiFirstName = $("#insolventIndiFirstName").val();
	insolventIndiLastName = $("#insolventIndiLastName").val();
	insolventCompanyName = $("#insolventCompanyName").val();
	insolventAddress = $("#insolventAddress").val();
	insolventParish = $("#insolventParish").val();
	insolventEmailAddress = $("#insolventEmailAddress").val();
	insolventTelephone = $("#insolventTelephone").val();
	insolventTrnNumber = $("#insolventTrnNumber").val();
	$("#insolventPersonNaturePreview").html(insolventPersonNature);
	$("#insolventIndiFirstNamePreview").html(insolventIndiFirstName);
	$("#insolventIndiLastNamePreview").html(insolventIndiLastName);
	$("#insolventCompanyNamePreview").html(insolventCompanyName);
	$("#insolventAddressPreview").html(insolventAddress);
	$("#insolventParishPreview").html(insolventParish);
	$("#insolventEmailAddressPreview").html(insolventEmailAddress);
	$("#insolventTelephonePreview").html(insolventTelephone);
	$("#insolventTrnNumberPreview").html(insolventTrnNumber);
}

function previewCreditorDetailInfo(){
	creditorName = $("#creditorName").val();
	creditorDate = $("#creditorDate").val();
	creditorAddress = $("#creditorAddress").val();
	$("#creditorNamePreview").html(creditorName);
	$("#creditorDatePreview").html(creditorDate);
	$("#creditorAddressPreview").html(creditorAddress);
}
function previewAssignmentDetailInfo(){
	assignmentName = $("#assignmentName").val();
	assignmentDated = $("#assignmentDated").val();
	var selectedAssignmentAttached = new Array();
	$("input:checkbox[name=assignmentAttached]:checked").each(function() {
		selectedAssignmentAttached.push($(this).val());
	});
	assignmentAddress = $("#assignmentAddress").val();
	$("#assignmentNamePreview").html(assignmentName);
	$("#assignmentDatedPreview").html(assignmentDated);
	$("#selectedAssignmentAttachedPreview").html(selectedAssignmentAttached);
	$("#assignmentAddressPreview").html(assignmentAddress);
}
</script>