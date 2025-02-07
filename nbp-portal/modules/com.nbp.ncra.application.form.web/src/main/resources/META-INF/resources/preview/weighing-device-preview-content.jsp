<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo"%>
<%@ include file="/init.jsp" %>
<div class="hide weighing-device-forms-pre">
	<section id="ncraServicesPreviewStep1" class="final-preview-section">
		<div class="applicant-details-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Applicant Details</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="weighing-device-edit-tab">
								<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
			                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
			                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Business</p>
						<p class="sub_heading_content applicant-business-name-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content applicant-address-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">Contact Person</p>
						<p class="sub_heading_content applicant-contact-preview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone Number</p>
						<p class="sub_heading_content applicant-tele-num-preview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content applicant-fax-no-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content applicant-email-addr-preview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Location of scale(s) to be verified </p>
						<p class="sub_heading_content applicant-location-preview"></p>
					</div>
				</div>
			</div>
			<hr/>
		</div>
	</section>
	
	<section id="ncraServicesPreviewStep2" class="final-preview-section">
		<div class="weighing-device-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex align-items-center">
						<p class="heading2 mt-3"> Verification of Weighing Device</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="weighing-verification-device-edit-tab">
								<svg width="19" height="19"
								viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								<path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
								</svg>
							</a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addVerificationDeviceTable">
							<tr>
								<th class="sub_heading">Type of Device</th>
								<th class="sub_heading">Manufacturer</th>
								<th class="sub_heading">Serial Number</th>
								<th class="sub_heading">Quantity</th>
								<th class="sub_heading">Maximum Capacity</th>
							</tr>
							<tr>
	<%if(weighingDeviceInfo!=null){
		int counterWeighingDevice=1; 
		for(NcraVerifyWeighingDeviceInfo info:weighingDeviceInfo){
	%>
	<td class="sub_heading_content typeofDevice<%=counterWeighingDevice%>">
	<%=Validator.isNotNull(info)&&Validator.isNotNull(info.getTypeofDevice())?info.getTypeofDevice():""%>
	</td>
	<td class="sub_heading_content manufacturer<%=counterWeighingDevice%>">
	<%=Validator.isNotNull(info)&&Validator.isNotNull(info.getManufacturer())?info.getManufacturer():""%>
	</td>
	<td class="sub_heading_content serialNumber<%=counterWeighingDevice%>">
	<%=Validator.isNotNull(info)&&Validator.isNotNull(info.getSerialNumber())?info.getSerialNumber():""%>
	</td>
	<td class="sub_heading_content quantity<%=counterWeighingDevice%>">
	<%=Validator.isNotNull(info)&&Validator.isNotNull(info.getQuantity())?info.getQuantity():""%>
	</td>
	<td class="sub_heading_content maximumCapacity<%=counterWeighingDevice%>">
	<%=Validator.isNotNull(info)&&Validator.isNotNull(info.getMaximumCapacity())?info.getMaximumCapacity():""%></td>
	
</tr>
<input type="hidden" id="weighingDevice<%=counterWeighingDevice%>" name="weighingDevice<%=counterWeighingDevice%>" value="<%=info.getNcraVerifyWeighingDeviceInfoId()%>">
	<% counterWeighingDevice++;}%>
	<%} %>
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="signaure-image-holder-pre">
					<%if(Validator.isNotNull(signUrl)){ %>
							<img src="<%=signUrl%>"  width="100" height="100"/>
							<%} %>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Dated</p>
						<p class="sub_heading_content" id="weighingDatedPreview"></p>
					</div>
				</div>
			<hr />
		</div>
	  </div>
	</section>
</div>
<script>

function previewWeighingDeviceDetailInfo(){
	weighingDate = $("#weighing-date").val();
	$("#weighingDatedPreview").html(weighingDate);
}
function previewWeighingApplicantDetailInfo(){
	applicantBusinessName = $("#applicant-business-name").val();
	applicantAddress = $("#applicant-address").val();
	applicantContact = $("#applicant-contact").val();
	applicantTeleNum = $("#applicant-tele-num").val();
	applicantFaxNo = $("#applicant-fax-no").val();
	applicantEmailAddr = $("#applicant-email-addr").val();
	applicantLocation = $("#applicant-location").val();
	
	$(".applicant-business-name-preview").html(applicantBusinessName);
	$(".applicant-address-preview").html(applicantAddress);
	$(".applicant-contact-preview").html(applicantContact);
	$(".applicant-tele-num-preview").html(applicantTeleNum);
	$(".applicant-fax-no-preview").html(applicantFaxNo);
	$(".applicant-email-addr-preview").html(applicantEmailAddr);
	$(".applicant-location-preview").html(applicantLocation);
}
</script>