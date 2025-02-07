<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="motor-bike-rental-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep23">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for Motor
								Bike Rental Company Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="motorBikeApplicantName" placeholder="John Doe" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getApplicantName())?bikeRental.getApplicantName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="motorBikeApplicantNameValidation" style="color: red;">Please
									Enter Applicant Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="motorBikeAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getAddress())?bikeRental.getAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Company</p>
								<input type="text" class="form-control mt-3"
									id="motorBikeCompanyName"
									placeholder="Example name of the Company" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getCompanyName())?bikeRental.getCompanyName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Exact Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="motorBikeExactLocation" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getExactLocation())?bikeRental.getExactLocation():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control" id="motorBikeTelephone"
									value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getTelephone())?bikeRental.getTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="motorBikeEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getEmail())?bikeRental.getEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="motorBikeEmailValidation" style="color: red;">Please Enter E-mail address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Company
									Registration</p>
								<input type="date" class="form-control" id="motorBikeDate"
									max="9999-12-31" placeholder="" value="<%=bikeRental!=null&&bikeRental.getRegistrationDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(bikeRental.getRegistrationDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Manager's Name</p>
								<input type="text" class="form-control"
									id="motorBikeManagerName" placeholder="" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getManagerName())?bikeRental.getManagerName():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Bikes/units in
									Fleet</p>
								<input type="text" class="form-control" id="motorBikeNumber"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getNumberOfBikes())?bikeRental.getNumberOfBikes():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Helmets</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="motorBikeHelmetNumber" placeholder="" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getNumberOfHelmets())?bikeRental.getNumberOfHelmets():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="motorBikeEmployeesNo" placeholder="" value="<%=Validator.isNotNull(bikeRental)&&Validator.isNotNull(bikeRental.getNumberOfEmployees())?bikeRental.getNumberOfEmployees():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">I Hereby Certify That the
								Information Given Herein is to the Best of My Knowledge and
								Belief a True and Accurate Testimony</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureMotorHolder">
								<%if(Validator.isNotNull(bikeSignApp)){ %>
							<img src="<%=bikeSignApp%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureMotorBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureMotorBtn"> <label
								for="applicantSignatureMotorBtn" class="choose-sign-btn">
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
								<input type="date" class="form-control" id="motorBikeSignDate"
									max="9999-12-31" placeholder="" value="<%=bikeRental!=null&&bikeRental.getSignatureDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(bikeRental.getSignatureDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addMotorBikeDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep24">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Conditions Proposed for
								Motor Bike Rental Company/operation In the Tourist Industry</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry1"
										value="Motor Bike Rental operators are required to be established in accordance with the laws of Jamaica" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Motor Bike Rental operators are required to be established in accordance with the laws of Jamaica")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry1">
										<p class="tab-form-main-heading mb-0">Motor Bike Rental operators are
									required to be established in accordance with the laws of
									Jamaica</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry2"
										value="The operator must maintain adequately staffed and a conveniently located service office and/or responsible representative in each resort area served" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("The operator must maintain adequately staffed and a conveniently located service office and/or responsible representative in each resort area served")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry2">
										<p class="tab-form-main-heading mb-0">The operator must maintain
									adequately staffed and a conveniently located service office
									and/or responsible representative in each resort area served</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry3"
										value="Service office/representative must have regular opening hours as is customary in the trade" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Service office/representative must have regular opening hours as is customary in the trade")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry3">
										<p class="tab-form-main-heading mb-0">Service office/representative
									must have regular opening hours as is customary in the "trade"</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry4"
										value="Service office/representative must be properly identified and provided with telephone service to facilitate easy contact" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Service office/representative must be properly identified and provided with telephone service to facilitate easy contact")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry4">
										<p class="tab-form-main-heading mb-0">Service office/representative
									must be properly identified and provided with telephone service
									to facilitate easy contact</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry5"
										value="Operator's money exchange and collection systems must work in accordance with the Bank of Jamaica/Exchange Control regulations" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Operator's money exchange and collection systems must work in accordance with the Bank of Jamaica/Exchange Control regulations")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry5">
										<p class="tab-form-main-heading mb-0">Operator's money exchange and
									collection systems must work in accordance with the Bank of
									Jamaica/Exchange Control regulations</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry6"
										value="A schedule of bike rental rates and conditions must be displayed, indicating types of motor bikes applicable advance quotation and notice normally given for cost revision" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("A schedule of bike rental rates and conditions must be displayed, indicating types of motor bikes applicable advance quotation and notice normally given for cost revision")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry6">
										<p class="tab-form-main-heading mb-0">A schedule of bike rental rates
									and conditions must be displayed, indicating types of motor
									bikes applicable advance quotation and notice normally given
									for cost revision</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry7"
										value="The operator must assure that bikes are currently licensed and that adequate liability insurance protection is maintained relating to rental units and equipment in the event of loss, damage or accident. (crash helmets must be supplied along with bikes on rental)" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("The operator must assure that bikes are currently licensed and that adequate liability insurance protection is maintained relating to rental units and equipment in the event of loss, damage or accident. (crash helmets must be supplied along with bikes on rental)")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry7">
										<p class="tab-form-main-heading mb-0">The operator must assure that
									bikes are currently licensed and that adequate liability
									insurance protection is maintained relating to rental units and
									equipment in the event of loss, damage or accident. (crash
									helmets must be supplied along with bikes on rental)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry8"
										value="Terms of rental, deposit requirement and insurance protection provided as well as renter's liability and licence requirement to be clearly stated in advance information regarding rental contracts" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Terms of rental, deposit requirement and insurance protection provided as well as renter's liability and licence requirement to be clearly stated in advance information regarding rental contracts")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry8">
										<p class="tab-form-main-heading mb-0">Terms of rental, deposit
									requirement and insurance protection provided as well as
									renter's liability and licence requirement to be clearly stated
									in advance information regarding rental contracts</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry9"
										value="Contract forms used for completing rental agreements to be subject to approval by the Jamaica Tourist Board" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Contract forms used for completing rental agreements to be subject to approval by the Jamaica Tourist Board")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry9">
										<p class="tab-form-main-heading mb-0">Contract forms used for
									completing rental agreements to be subject to approval by the
									Jamaica Tourist Board</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry10"
										value="Authorized personnel of Tourism Product Development Company Limited to be allowed by operator to exercise scheduled inspection" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Authorized personnel of Tourism Product Development Company Limited to be allowed by operator to exercise scheduled inspection")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry10">
										<p class="tab-form-main-heading mb-0">Authorized personnel of Tourism
									Product Development Company Limited to be allowed by operator
									to exercise scheduled inspection</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="motorBikeIndustry11"
										value="Minimum of Six (6) Motor Bikes Required With Two (2) Helmets to Be Provided for Each Bike" <%=bikeRental!=null &&bikeRental.getMotorBikeIndustry().contains("Minimum of Six (6) Motor Bikes Required With Two (2) Helmets to Be Provided for Each Bike")?"checked":StringPool.BLANK%>
										name="motorBikeIndustry"> <label for="motorBikeIndustry11">
										<p class="tab-form-main-heading mb-0">Minimum of Six (6) Motor Bikes Required With Two (2) Helmets to Be Provided for Each Bike</p>
									</label>
								</div>
								<!-- <p class="tab-form-sub-heading">Minimum of Six (6) Motor Bikes Required With Two (2) Helmets to Be Provided for Each Bike</p> -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
