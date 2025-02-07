<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="travel-agency-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep13">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for Registration of Travel Agency</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyApplicantName" placeholder="John Doe" onblur="travelAgencyValidation();"value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getApplicantName())?travelAgency.getApplicantName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="travelAgencyApplicantNameValidation" style="color: red;">Please
									Enter Applicant Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelAgencyAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAgencyAddress())?travelAgency.getAgencyAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control" id="travelAgencyTelephone"
									value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAgencyTelephone())?travelAgency.getAgencyTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Travel Agency</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyName"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAgencyName())?travelAgency.getAgencyName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelAgencyAddressSec" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAgencyAddressSec())?travelAgency.getAgencyAddressSec():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control" id="travelAgencyTelephoneNum"
									value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAgencyTelephoneNum())?travelAgency.getAgencyTelephoneNum():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="travelAgencyFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						 <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Whether Registered Company</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="company" <%=travelAgency!=null &&travelAgency.getIsRegistered().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="company" <%=travelAgency!=null &&travelAgency.getIsRegistered().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Particulars of Registration</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelAgencyRegistration" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getRegstParticulars())?travelAgency.getRegstParticulars():"" %></textarea>
								<%-- <input type="text" class="form-control mt-3"
									id="travelAgencyRegistration"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getRegstParticulars())?travelAgency.getRegstParticulars():"" %>" /> --%>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Proprietor\Directors</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyProprietorName"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getProprietorName())?travelAgency.getProprietorName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name and address of Manager</p>
								<input type="text" class="form-control"
									id="travelAgencyManagerName" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getManagerName())?travelAgency.getManagerName():"" %>" placeholder="Name">
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="travelAgencyManagerAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getManagerAddress())?travelAgency.getManagerAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name and address of Secretary(if a company)</p>
								<input type="text" class="form-control"
									id="travelAgencySecretaryName" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getSecretaryName())?travelAgency.getSecretaryName():"" %>" placeholder="Name">
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="travelAgencySecretaryAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getSecretaryAddress())?travelAgency.getSecretaryAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Bankers</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyBankerName"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getBankerName())?travelAgency.getBankerName():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Bonding Company or Sureties</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyCompanyName"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getBondingCompanyName())?travelAgency.getBondingCompanyName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelAgencyCompanyAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getBondingCompanyAddress())?travelAgency.getBondingCompanyAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Auditors</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyAuditorsName"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAuditorsName())?travelAgency.getAuditorsName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelAgencyAuditorAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getAuditorsAddress())?travelAgency.getAuditorsAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">No of Employees</p>
								<input type="text" class="form-control mt-3"
									id="travelAgencyEmployeesNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="" value="<%=Validator.isNotNull(travelAgency)&&Validator.isNotNull(travelAgency.getNumberOfEmployees())?travelAgency.getNumberOfEmployees():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="travelAgencySignDate"
									max="9999-12-31" placeholder="" value="<%=travelAgency!=null&&travelAgency.getSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(travelAgency.getSignDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="applicantSignaturetravelAgencyHolder">
								<%if(Validator.isNotNull(agencyDoc)){ %>
							<img src="<%=agencyDoc%>"  width="100" height="100"/>
							<%} %></div>
							<input type="file" id="applicantSignaturetravelAgencyBtn" hidden=""
								name="<portlet:namespace/>applicantSignaturetravelAgencyBtn"> <label
								for="applicantSignaturetravelAgencyBtn" class="choose-sign-btn">
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
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
function travelAgencyValidation(){
	applicantName = $("#travelAgencyApplicantName").val();
	  if (applicantName.trim() !== "") {
		 if(applicantName){ 
			  $("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#travelAgencyApplicantNameValidation").addClass("hide");
			}else{
				$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#travelAgencyApplicantNameValidation").removeClass("hide");
				$("#travelAgencyApplicantNameValidation").text("Please Enter Applicant Name");
			}
	  } else {
		  $("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
</script>		