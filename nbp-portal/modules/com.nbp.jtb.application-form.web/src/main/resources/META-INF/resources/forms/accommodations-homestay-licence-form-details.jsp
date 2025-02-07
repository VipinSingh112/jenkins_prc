<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="home-stay-accomadation-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep6">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For HomeStay Licence </p>
							<p class="tab-form-title-subtitle f2">To Operate in The Tourism Industry</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Accommodation</p>
								<input type="text" class="form-control mt-3"
									id="homeStayAccommodationName" placeholder=""
									value="<%=Validator.isNotNull(accoHomeStay)&&Validator.isNotNull(accoHomeStay.getHomeAccoName())?accoHomeStay.getHomeAccoName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="homeStayAccommodationValidation" style="color: red;">Please
									Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner/Operator *</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationOwnerName" placeholder="" oninput="homeStayDetailValidation();" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getHomeOwnerName()) ? accoHomeStay.getHomeOwnerName() : "" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="homeStayAccomadationOwnerNameValidation" style="color: red;">Please
									Enter Owner Name</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address of Property</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="homeStayAccomadationPropertyAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getPropertyAddress()) ? accoHomeStay.getPropertyAddress() : "" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationTel" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getHomeTeleNo()) ? accoHomeStay.getHomeTeleNo() : "" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mobile</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="homeStayAccomadationMobileNum" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getHomeMobile()) ? accoHomeStay.getHomeMobile() : "" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationEmail" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getHomeEmail()) ? accoHomeStay.getHomeEmail() : "" %>""
									placeholder="info@companyname.jm" oninput="homeStayDetailValidation();" />
								<p class="tab-form-sub-heading fieldAlert hide" id="homeStayAccomadationEmailValidation" style="color: red;">Enter a valid E-mail Address</p>	
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="homeStayAccomadationEmployeesNum" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getHomeEmployeeNo()) ? accoHomeStay.getHomeEmployeeNo() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Website</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationWebsiteName" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getWebsite()) ? accoHomeStay.getWebsite() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Direction to Property</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="homeStayAccomadationDirection" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getPropDirection()) ? accoHomeStay.getPropDirection() : "" %></textarea>
								<!-- <input type="text" class="form-control"
									id="homeStayAccomadationDirection" placeholder="" value="" /> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Bedrooms in House</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="homeStayAccomadationBedrooms" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getNumOfBedrooms()) ? accoHomeStay.getNumOfBedrooms() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Available Number of bedrooms for guest Accommodation</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="homeStayAccomadationAvailableBedrooms" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getNumOfGuestBedroom()) ? accoHomeStay.getNumOfGuestBedroom() : "" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">With Bathroom</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationWithBathroom" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getWithBathroom()) ? accoHomeStay.getWithBathroom() : "" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Shared Bathroom</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationSharedBedrooms" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getSharedBathroom()) ? accoHomeStay.getSharedBathroom() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureHomeStayImgHolder">
							<%if(Validator.isNotNull(homeSignApp)){ %>
							<img src="<%=homeSignApp%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureHomeStayBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureHomeStayBtn">
							<label for="applicantSignatureHomeStayBtn" class="choose-sign-btn">
								<span class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
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
								<input type="date" class="form-control"
									id="homeStayAccomadationDate" max="9999-12-31" placeholder=""
									value="<%=accoHomeStay!=null&&accoHomeStay.getSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoHomeStay.getSignDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Certified by the Justice of Peace</p>
								<input type="text" class="form-control"
									id="homeStayAccomadationCertified" placeholder="" value="<%= Validator.isNotNull(accoHomeStay) && Validator.isNotNull(accoHomeStay.getCertifiedBy()) ? accoHomeStay.getCertifiedBy() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Seal</p>
							<div class="signature_texarea mb-2" id="applicantSealHomeStayImgHolder">
							<%if(Validator.isNotNull(homeSeal)){ %>
							<img src="<%=homeSeal%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSealHomeStayBtn" hidden=""
								name="<portlet:namespace/>applicantSealHomeStayBtn">
							<label for="applicantSealHomeStayBtn" class="choose-sign-btn">
								<span class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Seal
							</label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>	
<script>
function homeStayDetailValidation(){
	homeStayAccomadationOwnerName = $("#homeStayAccomadationOwnerName").val();
	homeStayAccomadationEmail = $("#homeStayAccomadationEmail").val();
	  if (homeStayAccomadationOwnerName.trim() !== "" && homeStayAccomadationEmail.trim() !== "") {
		  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		 if(homeStayAccomadationEmail.match(mailformat)){ 
			  $("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#homeStayAccomadationEmailValidation").addClass("hide");
			}else{
				$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#homeStayAccomadationEmailValidation").removeClass("hide");
				$("#homeStayAccomadationEmailValidation").text("Please enter valid E-mail address");
			}
	  } else {
		  $("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
</script>					