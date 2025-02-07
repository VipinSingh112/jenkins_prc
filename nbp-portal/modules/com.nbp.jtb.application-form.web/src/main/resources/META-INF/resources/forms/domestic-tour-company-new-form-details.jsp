<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
int domesticTourBranchDetailVal=1;
%>
<div class="domestic-tour-company-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep11">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for
								Domestic Tour Company Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="domesticTourApplicantName" placeholder="John Doe" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourApplicantName())?domesticTour.getDomesticTourApplicantName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="domesticTourApplicantNameValidation" style="color: red;">Please
									Enter Applicant Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="domesticTourAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourAddress())?domesticTour.getDomesticTourAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Company</p>
								<input type="text" class="form-control mt-3"
									id="domesticTourCompanyName"
									placeholder="Example name of the Company" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourCompanyName())?domesticTour.getDomesticTourCompanyName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Exact Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="domesticTourExactLocation" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourExactLocation())?domesticTour.getDomesticTourExactLocation():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="domesticTourTelephone" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourTelephone())?domesticTour.getDomesticTourTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="domesticTourFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="domesticTourEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourEmail())?domesticTour.getDomesticTourEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="domesticTourEmailValidation" style="color: red;">Please Enter E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Company
									Registration</p>
								<input type="date" class="form-control" id="domesticTourDate"
									max="9999-12-31" placeholder="" value="<%=domesticTour!=null&&domesticTour.getDomesticTourDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(domesticTour.getDomesticTourDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Manager's Name</p>
								<input type="text" class="form-control"
									id="domesticTourManagerName" placeholder="" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourManagerName())?domesticTour.getDomesticTourManagerName():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Vehicles in Fleet</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="domesticTourVehiclesNumber" placeholder="" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourVehiclesNum())?domesticTour.getDomesticTourVehiclesNum():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="domesticTourEmployeesNo" placeholder="" value="<%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourEmployeesNo())?domesticTour.getDomesticTourEmployeesNo():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<input id="domesticTourBranchDetailVal" type="hidden"
								name="domesticTourBranchDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="domesticTourBranchDetailBox">
									<div class="accordion__header is-active"
										id="domesticTourBranchDetail" onclick="expandDetails(this.id)">
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
														id="domesticTourOfficeLocation" placeholder=""
														style="border-radius: 5px; width: 100%" spellcheck="false"><%-- <%=Validator.isNotNull(domesticTour)&&Validator.isNotNull(domesticTour.getDomesticTourOfficeLocation())?domesticTour.getDomesticTourOfficeLocation():"" %> --%></textarea>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone No</p>
													<input type="text" class="form-control "
														id="domesticTourBranchTelephoneNo" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addDomesticTourBranchDetail" onclick="addDomesticTourBranchDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addDomesticTourBranchDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addDomesticTourBranchDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Branch Office Locations</th>
											<th class="sub_heading text-nowrap">Telephone No</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
	<%if(Validator.isNotNull(branchOfficeAdd)&&branchOfficeAdd.size()>0){
	for(JtbAddBranchDetailInfo domesticBranch:branchOfficeAdd){ %>
	<tr class="domestic-branch-detail-row<%=domesticTourBranchDetailVal%>">
	<td class="sub_heading_content text-nowrap domesticTourOfficeLocation<%=domesticTourBranchDetailVal%>">
	<%=Validator.isNotNull(domesticBranch)&&Validator.isNotNull(domesticBranch.getBranchOfficeLocation())?domesticBranch.getBranchOfficeLocation():""%></td>
	<td class="sub_heading_content text-nowrap domesticTourBranchTelephoneNo<%=domesticTourBranchDetailVal%>">
	<%=Validator.isNotNull(domesticBranch)&&Validator.isNotNull(domesticBranch.getBranchOfficeDetails())?domesticBranch.getBranchOfficeDetails():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="domesticTourBranchDetailEditTab" onclick="domesticTourBranchDetailEditTab('<%=domesticTourBranchDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="domesticTourBranchDetailDeleteData" onclick="domesticTourBranchDetailDeleteData('<%=domesticTourBranchDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="domesticTourBranchDetailId<%=domesticTourBranchDetailVal%>" name="domesticTourBranchDetailId<%=domesticTourBranchDetailVal%>" value="<%=domesticBranch.getJtbBranchDetailInfoId()%>">
</tr>
<%domesticTourBranchDetailVal=domesticTourBranchDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">I hereby Certify That the
								Information Given Herein is to the Best of My Knowledge and
								Belief a True and Accurate Testimony</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignaturedomesticHolder">
							<%if(Validator.isNotNull(domesticTourDoc)){ %>
							<img src="<%=domesticTourDoc%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignaturedomesticBtn" hidden=""
								name="<portlet:namespace/>applicantSignaturedomesticBtn">
							<label for="applicantSignaturedomesticBtn"
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
								<input type="date" class="form-control"
									id="domesticTourSignDate" max="9999-12-31" placeholder=""
									value="<%=domesticTour!=null&&domesticTour.getDomesticTourSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(domesticTour.getDomesticTourSignDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addDomesticTourDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep12">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Indicated Below Are the
								Services Offered by the Establishment Named</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">A. Secure accommodation -
									Hotel, Guest House, Villa, Apartment for individuals and groups
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="individualsapartment" <%=domesticService!=null &&domesticService.getIndividualsApartment().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="individualsapartment" <%=domesticService!=null &&domesticService.getIndividualsApartment().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">B. Provide meeting service
									and assistance at airport or dock</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="airportassistance" <%=domesticService!=null &&domesticService.getAirportAssistance().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="airportassistance" <%=domesticService!=null &&domesticService.getAirportAssistance().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">C. Processing, ticketing
									and general briefing for entire tour</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="entiretour" <%=domesticService!=null &&domesticService.getEntireTour().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="entiretour" <%=domesticService!=null &&domesticService.getEntireTour().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">D. Provides arrival and
									departure transfers whether by limousine or exclusive service</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="transfersdeparture" <%=domesticService!=null &&domesticService.getTransfersDeparture().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="transfersdeparture" <%=domesticService!=null &&domesticService.getTransfersDeparture().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">E. Schedule transportation
									and sightseeing for groups and individuals</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="individualgroups" <%=domesticService!=null &&domesticService.getIndividualGroups().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="individualgroups" <%=domesticService!=null &&domesticService.getIndividualGroups().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">F. Assigns escorts, guides,
									interpreters in conjunction with organized excursion and
									overland guided tour activity</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="organizedconjunction" <%=domesticService!=null &&domesticService.getOrganizedconJunction().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="organizedconjunction" <%=domesticService!=null &&domesticService.getOrganizedconJunction().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">G. Supply chauffeur -
									driven or drive yourself transportation daily/weekly basis</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="dailytransportation" <%=domesticService!=null &&domesticService.getDailyTransportation().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="dailytransportation" <%=domesticService!=null &&domesticService.getDailyTransportation().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">H. Arrange meals, meetings
									and entertainment</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="entertainment" <%=domesticService!=null &&domesticService.getEntertainment().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="entertainment" <%=domesticService!=null &&domesticService.getEntertainment().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<div class="signature_texarea mb-2"
								id="signatureDomesticTourHolder">
								<%if(Validator.isNotNull(domesticServDoc)){ %>
							<img src="<%=domesticServDoc%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="signatureDomesticTourBtn" hidden=""
								name="<portlet:namespace/>signatureDomesticTourBtn"> <label
								for="signatureDomesticTourBtn" class="choose-sign-btn">
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
						<div class="col-md-12">
							<p class="pt-2 common-para">Company Seal</p>
							<div class="signature_texarea mb-2"
								id="companySealDomesticTourHolder">
								<%if(Validator.isNotNull(domesticSealDoc)){ %>
							<img src="<%=domesticSealDoc%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="companySealDomesticTourBtn" hidden=""
								name="<portlet:namespace/>companySealDomesticTourBtn"> <label
								for="companySealDomesticTourBtn" class="choose-sign-btn">
								<span class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Company Seal
							</label>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="domesticTourSealDate" max="9999-12-31" placeholder=""
									value="<%=domesticService!=null&&domesticService.getDomesticTourSealDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(domesticService.getDomesticTourSealDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>