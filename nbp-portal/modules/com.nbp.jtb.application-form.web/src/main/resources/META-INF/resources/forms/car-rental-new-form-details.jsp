<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
int carRentalBranchDetailVal=1;
%>
<div class="new-car-rental-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep9">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For
								Rent-a-Car Company Licence to Operate in the Tourism Industry</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control"
									id="newCarRentalApplicantName" placeholder="" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrApplicantName())?carRentalLicence.getNcrApplicantName():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="newCarRentalApplicantNameValidation" style="color: red;">Enter Name of Applicant  </p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newCarRentalAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrAddress())?carRentalLicence.getNcrAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Company</p>
								<input type="text" class="form-control"
									id="newCarRentalCompanyName" placeholder="" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrCompanyName())?carRentalLicence.getNcrCompanyName():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newCarRentalCompanyAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrCompanyAddr())?carRentalLicence.getNcrCompanyAddr():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="newCarRentalTelephone" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrTelephone())?carRentalLicence.getNcrTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="newCarRentalEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrEmail())?carRentalLicence.getNcrEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newCarRentalEmailValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Company
									Registration</p>
								<input type="date" class="form-control" id="newCarRentalDate"
									max="9999-12-31" placeholder="" value="<%=carRentalLicence!=null&&carRentalLicence.getNcrDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(carRentalLicence.getNcrDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Manager</p>
								<input type="text" class="form-control"
									id="newCarRentalManagerName" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrManagerName())?carRentalLicence.getNcrManagerName():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Vehicles in Fleet</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newCarRentalVehiclesNo" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrVehiclesNo())?carRentalLicence.getNcrVehiclesNo():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newCarRentalEmployeesNo" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrEmployeesNo())?carRentalLicence.getNcrEmployeesNo():"" %>" placeholder="">
							</div>
						</div>
						
						<div class="col-md-12">
							<input id="carRentalBranchDetailVal" type="hidden"
								name="carRentalBranchDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="carRentalBranchDetailBox">
									<div class="accordion__header is-active"
										id="carRentalBranchDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Branch Office Details</h2>
												</div>
											</div>
										</div>
										<div>
											<p class="accordian-employee mb-0 common-para"></p>
										</div>
									</div>
									<div class="accordion__body is-active">
										<div class="row">
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Branch Office Locations</p>
													<textarea rows="3" class="form-control" maxlength="255"
														id="carRentalOfficeLocation" placeholder=""
														style="border-radius: 5px; width: 100%"></textarea>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone No</p>
													<input type="text" class="form-control "
														id="carRentalBranchTelephoneNo" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addcarRentalBranchDetail" onclick="addcarRentalBranchDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addCarRentalBranchDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addCarRentalBranchDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Branch Office Locations</th>
											<th class="sub_heading text-nowrap">Telephone No</th>
											<!-- <th class="sub_heading text-nowrap">Fax No</th> -->
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
		<%if(Validator.isNotNull(branchOfficeAdd)&&branchOfficeAdd.size()>0){
		for(JtbAddBranchDetailInfo carRentalBranch:branchOfficeAdd){ %>
	<tr class="branch-detail-row<%=carRentalBranchDetailVal%>">
	<td class="sub_heading_content text-nowrap carRentalOfficeLocation<%=carRentalBranchDetailVal%>">
	<%=Validator.isNotNull(carRentalBranch)&&Validator.isNotNull(carRentalBranch.getBranchOfficeLocation())?carRentalBranch.getBranchOfficeLocation():""%></td>
	<td class="sub_heading_content text-nowrap carRentalBranchTelephoneNo<%=carRentalBranchDetailVal%>">
	<%=Validator.isNotNull(carRentalBranch)&&Validator.isNotNull(carRentalBranch.getBranchOfficeDetails())?carRentalBranch.getBranchOfficeDetails():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="carRentalBranchDetailEditTab" onclick="carRentalBranchDetailEditTab('<%=carRentalBranchDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="carRentalBranchDetailDeleteData" onclick="carRentalBranchDetailDeleteData('<%=carRentalBranchDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="carRentalBranchDetailId<%=carRentalBranchDetailVal%>" name="carRentalBranchDetailId<%=carRentalBranchDetailVal%>" value="<%=carRentalBranch.getJtbBranchDetailInfoId()%>">
</tr>
<%carRentalBranchDetailVal=carRentalBranchDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I <span class="giluio declaration-by"> </span> hereby certify
								that the information given is to the best of my knowledge and
								belief a true and accurate testimony.
							</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<%
						if (Validator.isNotNull(carRentDoc)) {
					%>
						<div class="signature_texarea mb-2" id="applicantSignatureCarRentalImgHolder">
						<img src="<%=carRentDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="applicantSignatureCarRentalImgHolder"></div>
					<%
						}
					%>	
							<input type="file" id="applicantSignatureCarRentalBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureCarRentalBtn">
							<label for="applicantSignatureCarRentalBtn"
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
								<p class="tab-form-main-heading">Position</p>
								<input type="text" class="form-control"
									id="newCarRentalPosition" value="<%=Validator.isNotNull(carRentalLicence)&&Validator.isNotNull(carRentalLicence.getNcrPosition())?carRentalLicence.getNcrPosition():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="newCarRentalSignDate"
									max="9999-12-31" placeholder="" value="<%=carRentalLicence!=null&&carRentalLicence.getNcrSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(carRentalLicence.getNcrSignDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addCarRentalDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep10">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<!-- <div class="col-md-12">
							<ul class="list-group tab-form-sub-heading pb-3">
								<li class="list-group-item">Jamaica Rent-a-car Association
									/rent-a-car Operators Are Rquired to Be Established in
									Accordance Wth the Laws of Jamaica.</li>
								<li class="list-group-item">The Operator Must Maintain
									Adequately Staffed and a Conveniently Located Service Office
									and/or Responsible Representative in Each Area Served.</li>
								<li class="list-group-item">Service Office/representative
									Must Be Properly Identified and Provided With Telephone Service
									to Facilitate Easy Contact.</li>
									
								<li class="list-group-item">Service Office/representative
									Must Have Regular Opening Hours as is Customary in the "trade".</li>
									
								<li class="list-group-item">Operator's Money Exchange and
									Collection Systems Must Work in Accordance With the Bank of
									Jamaica/exchange Control Regulations.</li>
									
								<li class="list-group-item">A Schedule of Car Rental Rates
									and Conditions Must Be Displayed, Indicating Types of Vehicles
									Applicable Advance Quotation and Notice Normally Given for Cost
									Revision.</li>
								<li class="list-group-item">The Operator Must Assure That
									Vehicles Are Currently Licensed and That Adequate Liability
									Insurance Protection is Maintained.</li>
									
								<li class="list-group-item">Rental Units to Be Fully
									Equipped and Supplied With Spare Tyres, Jack, Lug Tools and Any
									Needed Equipment for Satisfactory Operation of the Vehicle.</li>
									
								<li class="list-group-item">Terms of Rental, Deposit
									Requirement and Insurance Protection Provided as Well as
									Renters Liability to Be Clearly Stated in Advance Information
									Regarding Rental Contracts.</li>
									
								<li class="list-group-item">Contract Forms Used for
									Completing Rental Agreements to Be Subject to Approval by the
									Jamaica Tourist Board.</li>
								<li class="list-group-item">Authorised Personnel of Jamaica
									Tourist Board to Be Allowed by Operator to Exercise Scheduled
									Inspection.</li>
								<li class="list-group-item">Minimum of Five (5) Motor Cars
									or Ten (10) Motor Cars if Operator Intends to Apply for Car
									Concession After One Year of Being Licensed</li>
							</ul>
						</div> -->
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Conditions Proposed for
									Rent-a-car Company/operation in the Tourist Industry</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry1"
										value="Jamaica Rent-a-car Association /rent-a-car Operators Are Required to Be Established in Accordance With the Laws of Jamaica" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Jamaica Rent-a-car Association /rent-a-car Operators Are Required to Be Established in Accordance With the Laws of Jamaica")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry1">
										<p class="tab-form-main-heading mb-0">Jamaica Rent-a-car Association /rent-a-car Operators Are 
										Required to Be Established in Accordance With the Laws of Jamaica</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry2"
										value="The Operator Must Maintain Adequately Staffed and a Conveniently Located Service Office and/or Responsible Representative in Each Area Served" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("The Operator Must Maintain Adequately Staffed and a Conveniently Located Service Office and/or Responsible Representative in Each Area Served")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry2">
										<p class="tab-form-main-heading mb-0">The Operator Must
											Maintain Adequately Staffed and a Conveniently Located
											Service Office and/or Responsible Representative in Each Area
											Served</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry3"
										value="Service Office/representative Must Be Properly Identified and Provided With Telephone Service to Facilitate Easy Contact" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Service Office/representative Must Be Properly Identified and Provided With Telephone Service to Facilitate Easy Contact")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry3">
										<p class="tab-form-main-heading mb-0">Service
											Office/representative Must Be Properly Identified and
											Provided With Telephone Service to Facilitate Easy Contact</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry4"
										value="Service Office/representative Must Have Regular Opening Hours as is Customary in the trade" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Service Office/representative Must Have Regular Opening Hours as is Customary in the trade")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry4">
										<p class="tab-form-main-heading mb-0">Service
											Office/representative Must Have Regular Opening Hours as is
											Customary in the "trade"</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry5"
										value="Operator's Money Exchange and Collection Systems Must Work in Accordance With the Bank of Jamaica/exchange Control Regulations" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Operator's Money Exchange and Collection Systems Must Work in Accordance With the Bank of Jamaica/exchange Control Regulations")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry5">
										<p class="tab-form-main-heading mb-0">Operator's Money
											Exchange and Collection Systems Must Work in Accordance With
											the Bank of Jamaica/exchange Control Regulations</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry6"
										value="A Schedule of Car Rental Rates and Conditions Must Be Displayed, Indicating Types of Vehicles Applicable Advance Quotation and Notice Normally Given for Cost Revision" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("A Schedule of Car Rental Rates and Conditions Must Be Displayed, Indicating Types of Vehicles Applicable Advance Quotation and Notice Normally Given for Cost Revision")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry6">
										<p class="tab-form-main-heading mb-0">A Schedule of Car
											Rental Rates and Conditions Must Be Displayed, Indicating
											Types of Vehicles Applicable Advance Quotation and Notice
											Normally Given for Cost Revision</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry7"
										value="The Operator Must Assure That Vehicles Are Currently Licensed and That Adequate Liability Insurance Protection is Maintained" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("The Operator Must Assure That Vehicles Are Currently Licensed and That Adequate Liability Insurance Protection is Maintained")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry7">
										<p class="tab-form-main-heading mb-0">The Operator Must
											Assure That Vehicles Are Currently Licensed and That Adequate
											Liability Insurance Protection is Maintained</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry8"
										value="Rental Units to Be Fully Equipped and Supplied With Spare Tyres, Jack, Lug Tools and Any Needed Equipment for Satisfactory Operation of the Vehicle" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Rental Units to Be Fully Equipped and Supplied With Spare Tyres, Jack, Lug Tools and Any Needed Equipment for Satisfactory Operation of the Vehicle")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry8">
										<p class="tab-form-main-heading mb-0">Rental Units to Be
											Fully Equipped and Supplied With Spare Tyres, Jack, Lug Tools
											and Any Needed Equipment for Satisfactory Operation of the
											Vehicle</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry9"
										value="Terms of Rental, Deposit Requirement and Insurance Protection Provided as Well as Renters Liability to Be Clearly Stated in Advance Information Regarding Rental Contracts" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Terms of Rental, Deposit Requirement and Insurance Protection Provided as Well as Renters Liability to Be Clearly Stated in Advance Information Regarding Rental Contracts")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry9">
										<p class="tab-form-main-heading mb-0">Terms of Rental,
											Deposit Requirement and Insurance Protection Provided as Well
											as Renters Liability to Be Clearly Stated in Advance
											Information Regarding Rental Contracts</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry10"
										value="Contract Forms Used for Completing Rental Agreements to Be Subject to Approval by the Jamaica Tourist Board" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Contract Forms Used for Completing Rental Agreements to Be Subject to Approval by the Jamaica Tourist Board")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry10">
										<p class="tab-form-main-heading mb-0">Contract Forms Used
											for Completing Rental Agreements to Be Subject to Approval by
											the Jamaica Tourist Board</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry11"
										value="Authorised Personnel of Jamaica Tourist Board to Be Allowed by Operator to Exercise Scheduled Inspection" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Authorised Personnel of Jamaica Tourist Board to Be Allowed by Operator to Exercise Scheduled Inspection")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry11">
										<p class="tab-form-main-heading mb-0">Authorised Personnel
											of Jamaica Tourist Board to Be Allowed by Operator to
											Exercise Scheduled Inspection</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="touristIndustry12"
										value="Minimum of Five (5) Motor Cars or Ten (10) Motor Cars if Operator Intends to Apply for Car Concession After One Year of Being Licensed" <%=carRentalLicCond!=null &&carRentalLicCond.getNcrConditionProp().contains("Minimum of Five (5) Motor Cars or Ten (10) Motor Cars if Operator Intends to Apply for Car Concession After One Year of Being Licensed")?"checked":StringPool.BLANK%>
										name="touristIndustry"> <label for="touristIndustry12">
										<p class="tab-form-main-heading mb-0">Minimum of Five (5)
											Motor Cars or Ten (10) Motor Cars if Operator Intends to
											Apply for Car Concession After One Year of Being Licensed</p>
									</label>
								</div>
								<!-- <p class="tab-form-sub-heading">Minimum of Five (5)
											Motor Cars or Ten (10) Motor Cars if Operator Intends to
											Apply for Car Concession After One Year of Being Licensed</p> -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
