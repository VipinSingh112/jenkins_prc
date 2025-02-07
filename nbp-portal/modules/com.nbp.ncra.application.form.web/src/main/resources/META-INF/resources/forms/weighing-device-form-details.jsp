<%@page import="com.nbp.ncra.application.upload.documents.util.NCRAApplicationUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo"%>
<%@ include file="/init.jsp" %>
<portlet:resourceURL var="addWeighingDeviceDetailInfoUrl" id="/weighingDevice/detail/info"/>
<!-- <portlet:resourceURL var="weightinDeviceFormInfo" id="/weight/in/device/form/info"/> -->
<portlet:resourceURL var="addVerifyWeightDevice" id="/weight/in/device/form/info"/>
<portlet:resourceURL var="verifyWeightDeviceDate" id="/weight/device/date/info"/>
<portlet:resourceURL var="applicantDetailInfo" id="applicant/detail/info"/>

<div class="hide weighing-device-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="applicant-details-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Weighing Device Verification</p>
							<p class="tab-form-title-subtitle f2">In this section you
								will provide general information about yourself.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Business *</p>
								<input type="text" class="form-control" id="applicant-business-name" 
								value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantBusinessName())?ncraApplicantDetailInfo.getApplicantBusinessName():""%>"
									placeholder="" />
								<p class="tab-form-sub-heading fieldAlert hide" id="applicantBusinessNameValidation" style="color: red;">Enter Name of Business  </p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" id="applicant-address" maxlength="255"  placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantAddress())?ncraApplicantDetailInfo.getApplicantAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Contact Person</p>
								<input type="text" class="form-control" id="applicant-contact"  
								oninput="this.value = this.value.replace(/[^a-zA-Z]/g, '');"
								value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantContact())?ncraApplicantDetailInfo.getApplicantContact():""%>"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control " id="applicant-tele-num" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantTeleNum())?ncraApplicantDetailInfo.getApplicantTeleNum():""%>"
									placeholder="+1 876-876-1234" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No.</p>
								<input type="text" class="form-control" id="applicant-fax-no" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantFaxNo())?ncraApplicantDetailInfo.getApplicantFaxNo():""%>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail *</p>
								<input type="text" class="form-control" id="applicant-email-addr" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantEmailAddr())?ncraApplicantDetailInfo.getApplicantEmailAddr():""%>" 
								placeholder="user@gmail.com">
								<p class="tab-form-sub-heading fieldAlert hide" id="applicantEmailAddrValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-12" id="applicant-loc">
							<div class="form-group">
								<p class="tab-form-main-heading">Location of scale(s) to be verified (if different from above)</p>
							   <textarea rows="3" class="form-control" id="applicant-location"  maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantLocation())?ncraApplicantDetailInfo.getApplicantLocation():"" %></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="applicantDetailsFormInfo(false);"
			    class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
			    Continue to the next form section <span class="ml-2"> <svg
			            width="18" height="14" viewBox="0 0 18 14" fill="none"
			            xmlns="http://www.w3.org/2000/svg"> 
			                        <pathd ="m6.00016 11.17l1.83016=""
			                6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
			                1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
			    </span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="weighing-device-form">
					<!-- <div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Verification of Weighing Device</p>
						</div>
					</div> -->
					<div class="row">
						<input id="weighingDeviceDetailVal" type="hidden" name="weighingDeviceDetailVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addWeighingDeviceDetail">
								<div class="accordion__header is-active" id="weighingDeviceDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>Information for Weighing Device</h2>
											</div>
										</div>
									</div>
									<div>
										<p class="accordian-employee mb-0 common-para"></p>
									</div>
								</div>
	
								<div class="accordion__body is-active">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Type of Device</p>
												<input type="text" class="form-control" id="weighing-type"
													placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Manufacturer</p>
												<input type="text" class="form-control"
													id="weighing-manufacturer" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Serial Number</p>
												<input type="text" class="form-control" id="weighing-serial"
													placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" >
											<p class="tab-form-sub-heading fieldAlert hide" id="weighing-serialValidation" style="color: red;">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Quantity</p>
												<input type="text" class="form-control"
													id="weighing-quantity" placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Maximum Capacity</p>
												<input type="text" class="form-control"
													id="weighing-capacity" placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreWeighingDeviceDetail" onclick="addVerificationDeviceTableBox();"> 
											<span>+ 1</span> Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-12 table-responsive hide addVerificationDeviceTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addVerificationDeviceTable">
									<tr>
										<th class="sub_heading">Type of Device</th>
										<th class="sub_heading">Manufacturer</th>
										<th class="sub_heading">Serial Number</th>
										<th class="sub_heading">Quantity</th>
										<th class="sub_heading">Maximum Capacity</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
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
	<td> 
		<span> 
			<a href="javascript:void(0)" id="yearlyWorkingTimeEditTab" onclick="weighingDeviceDetailEditTab('<%=counterWeighingDevice%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="weighingDeviceDetailDeleteDataTab" onclick="weighingDeviceDetailDeleteData('<%=counterWeighingDevice%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
</tr>
<input type="hidden" id="weighingDevice<%=counterWeighingDevice%>" name="weighingDevice<%=counterWeighingDevice%>" value="<%=info.getNcraVerifyWeighingDeviceInfoId()%>">
	<% counterWeighingDevice++;}%>
	<%} %>								
									<%-- <%=if(weighingDeviceInfo!=null){
										long weighingDeviceCounter=1;
										for(NcraVerifyWeighingDeviceInfo weighingDeviceInfo:weighingDeviceInfoData){
											weighingDeviceCounter = weighingDeviceInfoData.get
											}
										}
									%>	 --%>
									<%-- <tr>
										
										<td> 
											<span> 
												<a href="javascript:void(0)" id="yearlyWorkingTimeEditTab" onclick="weighingDeviceDetailEditTab('<%=weighingDeviceDetailVal%>');"> 
											        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
											         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
											        </svg>
											      </a> 
											  </span>
									     </td>
									</tr>
									<input type="hidden" id="weighingDevice<%=weighingDeviceDetailVal%>" name="weighingDevice<%=weighingDeviceDetailVal%>" value=""> --%>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<!-- <p class="tab-form-main-heading"> 
									I,<span class="giluio indiBreakdownApplicantName"></span>, the undersigned applicant for a trustee licence, hereby attest that the above information faithfully reflects my experience in insolvency and other fields during the periods shown above.
								</p> -->
							<p class="pt-2 common-para">Signature</p>
							<div class="signature_texarea mb-2" id="signaure-image-holder">
							<%if(Validator.isNotNull(signUrl)){ %>
							<img src="<%=signUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="signature-upload-btn" hidden="" name="<portlet:namespace/>signature-upload-btn">
							<label for="signature-upload-btn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
											<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
										</svg>
							</span> Upload Signature
							</label>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" max="<%=NCRAApplicationUtil.getValidationIssueDate()%>" id="weighing-date" value="<%=ncraVerifyWeighingDate!=null&&ncraVerifyWeighingDate.getWeighingDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(ncraVerifyWeighingDate.getWeighingDate()):"" %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		 </div>
	 </div>
</div>
<!-- Yearly Working Time MODAL -->
<div class="modal fade commonsavepopup editWeighingDeviceDetailPopup"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="modal-body">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Type of Device</p>
							<input type="text" class="form-control edit-weighing-type"
								placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Manufacturer</p>
							<input type="text" class="form-control edit-weighing-manufacturer" placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Serial Number</p>
							<input type="text" class="form-control edit-weighing-serial"
								placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Quantity</p>
							<input type="text" class="form-control edit-weighing-quantity" placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Maximum Capacity</p>
							<input type="text" class="form-control edit-weighing-capacity" placeholder="" value="">
						</div>
					</div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditWeighingDeviceDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
function applicantDetailsFormInfo(isSaveAndContinue){
	ncraApplicationId = $("#ncraApplicationId").val();
	submitForm= true;	
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	applicantBusinessName = $("#applicant-business-name").val();
	applicantAddress = $("#applicant-address").val();
	applicantContact = $("#applicant-contact").val();
	applicantTeleNum = $("#applicant-tele-num").val();
	applicantFaxNo = $("#applicant-fax-no").val();
	applicantEmailAddr = $("#applicant-email-addr").val();
	applicantLocation = $("#applicant-location").val();
	if(!isSaveAndContinue){
		if(!applicantEmailAddr){
			  $("#applicantEmailAddrValidation").removeClass("hide");
			  $("#applicantEmailAddrValidation").text("Please Enter E-mail address");
			  $("#applicant-email-addr").focus();
			  submitForm= false;
		  }else if(applicantEmailAddr.match(mailformat)){ 
				$("#applicantEmailAddrValidation").addClass("hide");
			}else
				{
					$("#applicantEmailAddrValidation").removeClass("hide");
					$("#applicantEmailAddrValidation").text("You have entered an invalid email address");
					$("#applicant-email-addr").focus();
					submitForm= false;
				}
		if(!applicantBusinessName){
			$("#applicantBusinessNameValidation").removeClass("hide");
			$("#applicant-business-name").focus();
			submitForm= false;
		}else{
			$("#applicantBusinessNameValidation").addClass("hide");
		}	
	}
	
	if(submitForm){
	$.ajax({
		type : "POST",
		url : "${applicantDetailInfo}",
		data : {
			"<portlet:namespace/>applicantBusinessName" : applicantBusinessName,
			"<portlet:namespace/>applicantAddress" : applicantAddress,
			"<portlet:namespace/>applicantContact" : applicantContact,
			"<portlet:namespace/>applicantTeleNum" : applicantTeleNum,
			"<portlet:namespace/>applicantFaxNo" : applicantFaxNo,
			"<portlet:namespace/>applicantEmailAddr" : applicantEmailAddr,
			"<portlet:namespace/>applicantLocation" : applicantLocation,
			"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
		},
		success : function(data) {
			if(!isSaveAndContinue){
				var $active = $('.nav-tabs li>.active');
				$active.parent().next().find('.nav-link').removeClass('disabled');
				$active.parent().next().find('.nav-link span').removeClass('gray');
				nextTab($active);
				const formSections = document.getElementsByClassName('form-wizard');
			    for (const formSection of formSections) {
				 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
				 }
			    $("#ncraformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			}
			pendingNCRAForm();
		},
		error : function(data) {

		}
	});
	}
}
function importedDetailValidation(){
	applicantBusinessName = $("#importedbusinessname").val();
	applicantEmailAddr = $("#imported-applicant-email-addr").val();
	  if (applicantBusinessName.trim() !== "" && applicantEmailAddr.trim() !== "") {
		  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		 if(applicantEmailAddr.match(mailformat)){ 
			  $("#ncraformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#importedApplicantEmailAddrValidation").addClass("hide");
			}else{
				$("#ncraformsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#importedApplicantEmailAddrValidation").removeClass("hide");
				$("#importedApplicantEmailAddrValidation").text("Please enter valid E-mail address");
			}
	  } else {
		  $("#ncraformsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
function weightDeviceDate(){
	weighingDate = $("#weighing-date").val();
	ncraApplicationId = $("#ncraApplicationId").val();
	$.ajax({
		type : "POST",
		url : "${verifyWeightDeviceDate}",
		data : {
			/* "<portlet:namespace/>typeofDevice" : typeofDevice,
			"<portlet:namespace/>manufacturer" : manufacturer,
			"<portlet:namespace/>serialNumber" : serialNumber,
			"<portlet:namespace/>quantity" : quantity,
			"<portlet:namespace/>maximumCapacity" : maximumCapacity, */
			"<portlet:namespace/>weighingDate" : weighingDate,
			"<portlet:namespace/>ncraApplicationId" : ncraApplicationId,
		},
		success : function(data) {
			addVerificationDeviceTableBox();
			uploadDocuments('signature-upload-btn','Verification of Weighing Signature','');
		},
		error : function(data) {

		}
	});
} 
$(document).on('change', '#signature-upload-btn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#signaure-image-holder");
    var form1a_image_holder = $("#signaure-image-holder-pre");
    image_holder.empty();
    form1a_image_holder.empty();
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              }).appendTo(form1a_image_holder);
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });
 
  
/* ADD MORE FORMS JS */

function addVerificationDeviceTableBox(){
	debugger;
	weighingDeviceDetailVal = $("#weighingDeviceDetailVal").val();
	typeofDevice = $("#weighing-type").val();
	manufacturer =$("#weighing-manufacturer").val();
	serialNumber =$("#weighing-serial").val();
	quantity = $("#weighing-quantity").val();
	maximumCapacity = $("#weighing-capacity").val();
	submitForm = true;
	
	if(typeofDevice != "" || manufacturer !="" || serialNumber !="" || quantity !="" || maximumCapacity !=""){
		if(!serialNumber){
			console.log("called-----");
			var letters = /^[A-Za-z]+$/;
			if(!serialNumber.match(letters)){	
			$("#weighing-serial").focus();
			$("#weighing-serialValidation").removeClass("hide");
			submitForm = false;
			}
		}
		$(".addVerificationDeviceTableBox").removeClass("hide");
		$.ajax({
			type : "POST",
			url : "${addWeighingDeviceDetailInfoUrl}",
			data : {
				"<portlet:namespace/>weighingDeviceDetailVal" : weighingDeviceDetailVal,
			},
			async:false,
			success : function(data) {
				debugger;
				/* APPEND ROW JSP INTO TABLE */
				$(".addVerificationDeviceTable").each(function(index) {
					if (index === 0) {
						$(this).append(data);
					} else {
						$cloneRow = $(data).clone();
						$cloneRow.find('td').slice(-2).remove();
						$(this).append($cloneRow);
					}
				});
				/* APPEND DATA INTO TABLE */
				
				$(".typeofDevice" + weighingDeviceDetailVal).append(typeofDevice);
				$(".manufacturer" + weighingDeviceDetailVal).append(manufacturer);
				$(".serialNumber" + weighingDeviceDetailVal).append(serialNumber);
				$(".quantity" + weighingDeviceDetailVal).append(quantity);
				$(".maximumCapacity" + weighingDeviceDetailVal).append(maximumCapacity);
				/* occupantDirectorInfo(""); */
				weighDeviceInfo('','');
				/* VALUE INCREAMENT */
				weighingDeviceDetailVal++;
				$("#weighingDeviceDetailVal").val(weighingDeviceDetailVal);
				/* RESET FORM FIELDS */
				$("#weighing-type").val("");
				$("#weighing-manufacturer").val("");
				$("#weighing-serial").val("");
				$("#weighing-quantity").val("");
				$("#weighing-capacity").val("");
			}
		});
	}else{
		$("#weighing-type").focus();
	}
}
function weighDeviceInfo(counter,deleteKey){
	ncraApplicationId = $("#ncraApplicationId").val();
	weighingDeviceDetailVal = $("#weighingDeviceDetailVal").val(); //countervalue
	if(counter!=''&&deleteKey==''){
		typeofDevice = $("#edit-weighing-type"+counter).val();
		manufacturer = $("#edit-weighing-manufacturer"+counter).val();
		serialNumber = $("#edit-weighing-serial"+counter).val();
		quantity = $("#edit-weighing-quantity"+counter).val();
		maximumCapacity = $("#edit-weighing-capacity"+counter).val();
		weighDeviceApplicationId = $("#weighingDevice"+counter).val();
	}
	else{
		typeofDevice = $("#weighing-type").val();
		manufacturer = $("#weighing-manufacturer").val();
		serialNumber = $("#weighing-serial").val();
		quantity = $("#weighing-quantity").val();
		maximumCapacity = $("#weighing-capacity").val();
		weighDeviceApplicationId = $("#weighingDevice").val(); //primary key 
	}
		$.ajax({
	        type: "POST",
	        url: "${addVerifyWeightDevice}",
	        data: {
	        	 "<portlet:namespace/>typeofDevice": typeofDevice,
	             "<portlet:namespace/>manufacturer": manufacturer,
	             "<portlet:namespace/>serialNumber": serialNumber,
	             "<portlet:namespace/>quantity": quantity,
	             "<portlet:namespace/>maximumCapacity": maximumCapacity,
	           	 "<portlet:namespace/>ncraApplicationId": ncraApplicationId,
	           	 "<portlet:namespace/>weighDeviceApplicationId": weighDeviceApplicationId,
	           	 "<portlet:namespace/>weighingDeviceDetailVal": weighingDeviceDetailVal,
	             "<portlet:namespace/>deleteKey": deleteKey,
	        },
	        success: function (data) {
	         	var resultJsonObject=data.APP_DATA;
				var counterOfDevice=resultJsonObject["weighDeviceCounter"];
				$("#weighingDevice"+counterOfDevice).val(resultJsonObject["weighDeviceId"]); 
	        },
	        error: function (data) {
	            // Handle error
	        },
	    });
	}
function weighingDeviceDetailEditTab(weighingDeviceDetailVal){
		$(".editWeighingDeviceDetailPopup").modal("show");
		$(".edit-weighing-type").attr("id" , "edit-weighing-type"+weighingDeviceDetailVal);
		$(".edit-weighing-manufacturer").attr("id" , "edit-weighing-manufacturer"+weighingDeviceDetailVal);
		$(".edit-weighing-serial").attr("id" , "edit-weighing-serial"+weighingDeviceDetailVal);
		$(".edit-weighing-quantity").attr("id" , "edit-weighing-quantity"+weighingDeviceDetailVal);
		$(".edit-weighing-capacity").attr("id" , "edit-weighing-capacity"+weighingDeviceDetailVal);
		
		typeofDevice = $(".typeofDevice"+weighingDeviceDetailVal+":first").text().trim();
		manufacturer = $(".manufacturer"+weighingDeviceDetailVal+":first").text().trim();
		serialNumber = $(".serialNumber"+weighingDeviceDetailVal+":first").text().trim();
		quantity = $(".quantity"+weighingDeviceDetailVal+":first").text().trim();
		maximumCapacity = $(".maximumCapacity"+weighingDeviceDetailVal+":first").text().trim();
		
		$("#edit-weighing-type"+weighingDeviceDetailVal).val(typeofDevice);
		$("#edit-weighing-manufacturer"+weighingDeviceDetailVal).val(manufacturer);
		$("#edit-weighing-serial"+weighingDeviceDetailVal).val(serialNumber);
		$("#edit-weighing-quantity"+weighingDeviceDetailVal).val(quantity);
		$("#edit-weighing-capacity"+weighingDeviceDetailVal).val(maximumCapacity);
		
		$(".saveEditWeighingDeviceDetailPopupDataBtn").attr("onclick" , "weighingDeviceDetailEditData("+weighingDeviceDetailVal+")");
		
	}
	function weighingDeviceDetailEditData(weighingDeviceDetailVal){
		weighDeviceInfo(weighingDeviceDetailVal,'');
		$(".typeofDevice" + weighingDeviceDetailVal).html($("#edit-weighing-type"+weighingDeviceDetailVal).val());
		$(".manufacturer" + weighingDeviceDetailVal).html($("#edit-weighing-manufacturer"+weighingDeviceDetailVal).val());
		$(".serialNumber" + weighingDeviceDetailVal).html($("#edit-weighing-serial"+weighingDeviceDetailVal).val());
		$(".quantity" + weighingDeviceDetailVal).html($("#edit-weighing-quantity"+weighingDeviceDetailVal).val());
		$(".maximumCapacity" + weighingDeviceDetailVal).html($("#edit-weighing-capacity"+weighingDeviceDetailVal).val());
		
		$(".edit-weighing-type").val("");
		$(".edit-weighing-manufacturer").val("");
		$(".edit-weighing-serial").val("");
		$(".edit-weighing-quantity").val("");
		$(".edit-weighing-capacity").val("");
	}
	function weighingDeviceDetailDeleteData(counter) {
	   debugger;
		weighDeviceInfo(weighingDeviceDetailVal,'deleteApplicant');
		/* deleteRowFromTable(counter); */
		  var fieldValue = $("#weighingDeviceDetailVal").val();
		  $("#weighingDeviceDetailVal").val(fieldValue - 1);
		  var delRowElement = $(".weighing-device-row" + counter); 
		  delRowElement.remove();
		  var j = parseInt(counter) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= fieldValue; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".weighing-device-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "weighing-device-row" + prevCounter);
		    rowElement.find("td.typeofDevice"+i).removeClass("typeofDevice"+i).addClass("typeofDevice"+prevCounter);
		    rowElement.find("td.manufacturer"+i).removeClass("manufacturer"+i).addClass("manufacturer"+prevCounter);
		    rowElement.find("td.serialNumber"+i).removeClass("serialNumber"+i).addClass("serialNumber"+prevCounter);
		    rowElement.find("td.quantity"+i).removeClass("quantity"+i).addClass("quantity"+prevCounter);
		    rowElement.find("td.maximumCapacity"+i).removeClass("maximumCapacity"+i).addClass("maximumCapacity"+prevCounter);
		    rowElement.find("#weighingDeviceDetailDeleteDataTab").attr('onclick', 'weighingDeviceDetailDeleteData(' +prevCounter+ ')');
		  }
	}
</script>