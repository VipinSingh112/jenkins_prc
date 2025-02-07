<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="travel-halt-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep19">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for Travel
								Halt</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="travelHaltApplicantName" placeholder="John Doe" value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltApplicantName())?travelHalt.getTravelHaltApplicantName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="travelHaltApplicantNameValidation" style="color: red;">Please
									Enter Applicant Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelHaltAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltAddress())?travelHalt.getTravelHaltAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone No</p>
								<input type="text" class="form-control" id="travelHaltTelephone"
									value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltTelephone())?travelHalt.getTravelHaltTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="travelHaltEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltEmail())?travelHalt.getTravelHaltEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="travelHaltEmailValidation" style="color: red;">Please Enter E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Travel Halt</p>
								<input type="text" class="form-control mt-3" id="travelHaltName"
									placeholder="" value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltName())?travelHalt.getTravelHaltName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Location of Travel Halt</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="travelHaltLocation" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltLocation())?travelHalt.getTravelHaltLocation():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="travelHaltTelephoneNum" value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltTelephoneNum())?travelHalt.getTravelHaltTelephoneNum():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="travelHaltEmployeesNo" placeholder="" value="<%=Validator.isNotNull(travelHalt)&&Validator.isNotNull(travelHalt.getTravelHaltEmployeesNo())?travelHalt.getTravelHaltEmployeesNo():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">I hereby apply for
								permission to operate as a Travel Halt in accordance with the
								provision of the Tourist Board Act relating to Tourism
								Enterprise</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">
								I declare that the Travel Halt facilities at <span
									class="giluio haltLocation"> </span> will be clean, well
								maintained and safe with trained personnel to serve the
								customers' needs. The Travel Halt will also provide telephone
								services in the case of an emergency.
							</p>
						</div>

						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="applicantSignaturetravelHaltHolder">
								<%if(Validator.isNotNull(haltSignApp)){ %>
							<img src="<%=haltSignApp%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignaturetravelHaltBtn" hidden=""
								name="<portlet:namespace/>applicantSignaturetravelHaltBtn">
							<label for="applicantSignaturetravelHaltBtn"
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
								<input type="date" class="form-control" id="travelHaltSignDate"
									max="9999-12-31" placeholder="" value="<%=travelHalt!=null&&travelHalt.getTravelHaltSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(travelHalt.getTravelHaltSignDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addtravelHaltDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep20">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Please indicate what is
								offered at the Travel Halt by selecting the appropriate
								response(s)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Gas Station</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="gasStation" <%=travelHalt!=null &&travelHalt.getGasStation().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="gasStation" <%=travelHalt!=null &&travelHalt.getGasStation().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">Restrooms</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="restrooms1"
										value="Male" <%=travelHalt!=null &&travelHalt.getRestrooms().contains("Male")?"checked":StringPool.BLANK%> name="restrooms"> <label
										for="restrooms1">
										<p class="tab-form-main-heading mb-0">Male</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="restrooms2" value="Female" <%=travelHalt!=null &&travelHalt.getRestrooms().contains("Female")?"checked":StringPool.BLANK%>
										name="restrooms"> <label
										for="restrooms2">
										<p class="tab-form-main-heading mb-0">Female</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="restrooms3"
										value="Physically Challenged" <%=travelHalt!=null &&travelHalt.getRestrooms().contains("Physically Challenged")?"checked":StringPool.BLANK%> name="restrooms"> <label
										for="restrooms3">
										<p class="tab-form-main-heading mb-0">Physically Challenged</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Refreshment</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="refreshment" <%=travelHalt!=null &&travelHalt.getRefreshment().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="refreshment" <%=travelHalt!=null &&travelHalt.getRefreshment().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Drinks</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="drinks" <%=travelHalt!=null &&travelHalt.getDrinks().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="drinks" <%=travelHalt!=null &&travelHalt.getDrinks().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Restaurant</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="restaurant" <%=travelHalt!=null &&travelHalt.getRestaurant().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="restaurant" <%=travelHalt!=null &&travelHalt.getRestaurant().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Wireless Internet</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="wirelessinternet" <%=travelHalt!=null &&travelHalt.getWirelessinternet().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="wirelessinternet" <%=travelHalt!=null &&travelHalt.getWirelessinternet().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
