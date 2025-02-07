<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
int craftTradersApplicantDetailVal=1;
int craftTradersEmployeeDetailVal=1;
%>
<div class="craft-traders-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep27">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For Craft
								Traders Permit</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner</p>
								<input type="text" class="form-control"
									id="craftTradersApplicantOwner" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliOwner())?craftTrader.getCraftTradersAppliOwner():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Home Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="craftTradersApplicantAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliAddress())?craftTrader.getCraftTradersAppliAddress():"" %></textarea>
								<!-- <input type="text" class="form-control"
									id="craftTradersApplicantAddress" value="" placeholder=""> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Phone No.</p>
								<input type="text" class="form-control "
									id="craftTradersApplicantPhoneNo" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliPhoneNo())?craftTrader.getCraftTradersAppliPhoneNo():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control "
									id="craftTradersApplicantEmail" placeholder="" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTradersAppliEmail())?craftTrader.getCraftTradersAppliEmail():"" %>">
							</div>
						</div>
					<div class="col-md-12">
							<input id="craftTradersApplicantDetailVal" type="hidden"
								name="craftTradersApplicantDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="craftTradersApplicantDetailBox">
									<div class="accordion__header is-active"
										id="craftTradersApplicantDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Selling Location Details</h2>
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
													<p class="tab-form-main-heading">Selling Location</p>
													<textarea rows="3" class="form-control" maxlength="255"
									id="craftTradersApplicantLocation" placeholder="Selling Location"
									style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addCraftTradersApplicantDetail" onclick="addCraftTradersApplicantDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addCraftTradersApplicantDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addCraftTradersApplicantDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Selling Location</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
	<%if(Validator.isNotNull(attarctionManagerAdd)&&attarctionManagerAdd.size()>0){
	for(JtbAddCraftApplicantInfo craftApplicant:attarctionManagerAdd){ %>
	<tr class="craft-applicant-detail-row<%=craftTradersApplicantDetailVal%>">
	<td class="sub_heading_content text-nowrap craftTradersApplicantLocation<%=craftTradersApplicantDetailVal%>">
	<%=Validator.isNotNull(craftApplicant)&&Validator.isNotNull(craftApplicant.getSellingLocation())?craftApplicant.getSellingLocation():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="craftTradersApplicantDetailEditTab" onclick="craftTradersApplicantDetailEditTab('<%=craftTradersApplicantDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="craftTradersApplicantDetailDeleteData" onclick="craftTradersApplicantDetailDeleteData('<%=craftTradersApplicantDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="craftTradersApplicantDetailId<%=craftTradersApplicantDetailVal%>" name="craftTradersApplicantDetailId<%=craftTradersApplicantDetailVal%>" value="<%=craftApplicant.getJtbAddCraftApplicantInfoId() %>">
</tr>
<%craftTradersApplicantDetailVal=craftTradersApplicantDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						</div>
						
                        <div class="col-md-12">
							<input id="craftTradersEmployeeDetailVal" type="hidden"
								name="craftTradersEmployeeDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="craftTradersEmployeeDetailBox">
									<div class="accordion__header is-active"
										id="craftTradersEmployeeDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Employee Details</h2>
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
													<p class="tab-form-main-heading">Name of Employee</p>
													<input type="text" class="form-control"
														id="craftTradersEmployeeName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Address</p>
													<textarea rows="3" class="form-control" maxlength="255" id="craftTradersEmployeeAddress" placeholder="" 
													style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Phone No.</p>
													<input type="text" class="form-control "
														id="craftTradersEmployeePhoneNo" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div>
											<!-- <div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax</p>
													<input type="text" class="form-control "
														id="craftTradersEmployeeFaxNo" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div> -->
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addCraftTradersEmployeeDetail" onclick="addCraftTradersEmployeeDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addCraftTradersEmployeeDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addCraftTradersEmployeeDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name of Employee</th>
											<th class="sub_heading text-nowrap">Address</th>
											<th class="sub_heading text-nowrap">Phone No.</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
	<%if(Validator.isNotNull(craftEmp)&&craftEmp.size()>0){
	for(JtbAddCraftEmployeeInfo craftEmployee:craftEmp){ %>
	<tr class="carft-employee-detail-row<%=craftTradersEmployeeDetailVal%>">
	<td class="sub_heading_content text-nowrap craftTradersEmployeeName<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpName())?craftEmployee.getEmpName():""%></td>
	<td class="sub_heading_content text-nowrap craftTradersEmployeeAddress<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpAddress())?craftEmployee.getEmpAddress():""%></td>
	<td class="sub_heading_content text-nowrap craftTradersEmployeePhoneNo<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpPhoneNo())?craftEmployee.getEmpPhoneNo():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="craftTradersEmployeeDetailEditTab" onclick="craftTradersEmployeeDetailEditTab('<%=craftTradersEmployeeDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="craftTradersEmployeeDetailDeleteData" onclick="craftTradersEmployeeDetailDeleteData('<%=craftTradersEmployeeDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="craftTradersEmployeeDetailId<%=craftTradersEmployeeDetailVal%>" name="craftTradersEmployeeDetailId<%=craftTradersEmployeeDetailVal%>" value="<%=craftEmployee.getJtbAddCraftEmployeeInfoId()%>">
</tr>
<%craftTradersEmployeeDetailVal=craftTradersEmployeeDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						</div>
						
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-title-subtitle f2">Permission to Occupy Location(Please Attach Copy)</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocation1"
										value="Evidence of Ownership" <%=craftTrader!=null &&craftTrader.getOccupyLocation().contains("Evidence of Ownership")?"checked":StringPool.BLANK%> name="occupyLocation"> <label
										for="occupyLocation1">
										<p class="tab-form-main-heading mb-0">Evidence of Ownership</p>
									</label>
								</div>
								<div class="form-group occupyLocation1 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="evidenceOwnership"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="evidenceOwnership">
														<label class="custom-upload" for="evidenceOwnership">
															<span class="mr-2"> <svg width="14" height="17"
																	viewBox="0 0 14 17" fill="none"
																	xmlns="http://www.w3.org/2000/svg"> 
                                                                   <path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#047247"></path> 
                                                                   </svg>
														</span>Upload
														</label>
													</div>
												</div>
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(evidenceSign))?evidenceSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocation2"
										value="Rent Receipt" <%=craftTrader!=null &&craftTrader.getOccupyLocation().contains("Rent Receipt")?"checked":StringPool.BLANK%> name="occupyLocation">
									<label for="occupyLocation2">
										<p class="tab-form-main-heading mb-0">Rent Receipt</p>
									</label>
								</div>
								<div class="form-group occupyLocation2 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="rentReceipt"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="rentReceipt">
														<label class="custom-upload" for="rentReceipt">
															<span class="mr-2"> <svg width="14" height="17"
																	viewBox="0 0 14 17" fill="none"
																	xmlns="http://www.w3.org/2000/svg"> 
                                                                   <path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#047247"></path> 
                                                                   </svg>
														</span>Upload
														</label>
													</div>
												</div>
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(rentSign))?rentSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocation3"
										value="Letter from Owner" <%=craftTrader!=null &&craftTrader.getOccupyLocation().contains("Letter from Owner")?"checked":StringPool.BLANK%> name="occupyLocation"> <label
										for="occupyLocation3">
										<p class="tab-form-main-heading mb-0">Letter from Owner</p>
									</label>
								</div>
								<div class="form-group occupyLocation3 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="letterOwner"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="letterOwner">
														<label class="custom-upload" for="letterOwner">
															<span class="mr-2"> <svg width="14" height="17"
																	viewBox="0 0 14 17" fill="none"
																	xmlns="http://www.w3.org/2000/svg"> 
                                                                   <path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#047247"></path> 
                                                                   </svg>
														</span>Upload
														</label>
													</div>
												</div>
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(letterOwnerSign))?letterOwnerSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocation4"
										value="Contract of Lease" <%=craftTrader!=null &&craftTrader.getOccupyLocation().contains("Contract of Lease")?"checked":StringPool.BLANK%> name="occupyLocation">
									<label for="occupyLocation4">
										<p class="tab-form-main-heading mb-0">Contract of Lease</p>
									</label>
								</div>
								<div class="form-group occupyLocation4 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="contractLease"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="contractLease">
														<label class="custom-upload" for="contractLease">
															<span class="mr-2"> <svg width="14" height="17"
																	viewBox="0 0 14 17" fill="none"
																	xmlns="http://www.w3.org/2000/svg"> 
                                                                   <path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#047247"></path> 
                                                                   </svg>
														</span>Upload
														</label>
													</div>
												</div>
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(contractLeaseSign))?contractLeaseSign:""%></span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of Goods Sold</p>
								<textarea rows="3" class="form-control" maxlength="255" id="craftTraderGoodsType" placeholder="" 
													style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderGoodsType())?craftTrader.getCraftTraderGoodsType():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 mb-0">References for Owner
								and Employee</p>
							<p class="tab-form-sub-heading pl-2">Please attach
								reference: (From: Minister of Religion or Teacher or Justice of
								the Peace)</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name*</p>
								<input type="text" class="form-control mt-3"
									id="craftTraderName"
									placeholder="Name of Owner" oninput="craftTraderValidation();" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderName())?craftTrader.getCraftTraderName():"" %>" />
									<p class="tab-form-sub-heading fieldAlert hide"
									id="craftTraderNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Position</p>
								<input type="text" class="form-control mt-3"
									id="craftTraderPosition"
									placeholder="" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderPosition())?craftTrader.getCraftTraderPosition():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="craftTraderNameMinisterAddress" placeholder="Owner Address"
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterAddr())?craftTrader.getCraftTraderMinisterAddr():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control mt-3"
									id="craftTraderNameMinisterName"
									placeholder="Name of Employee" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterName())?craftTrader.getCraftTraderMinisterName():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Position</p>
								<input type="text" class="form-control mt-3"
									id="craftTraderMinisterNamePosition"
									placeholder="" value="<%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderMinisterNamePos())?craftTrader.getCraftTraderMinisterNamePos():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="craftTraderAddressOwner" placeholder="Employee Address"
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(craftTrader)&&Validator.isNotNull(craftTrader.getCraftTraderAddressOwner())?craftTrader.getCraftTraderAddressOwner():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Craft Vendor's Signature</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureCraftImageHolder">
								<%if(Validator.isNotNull(craftVendorSign)){ %>
							<img src="<%=craftVendorSign%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureCraftBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureCraftBtn"> <label
								for="applicantSignatureCraftBtn" class="choose-sign-btn">
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
									id="craftTraderSignDate" max="9999-12-31" placeholder=""
									value="<%=craftTrader!=null&&craftTrader.getCraftTraderSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(craftTrader.getCraftTraderSignDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Craft Vendor's Assistant Signature	</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureCraftAssistantImageHolder">
								<%if(Validator.isNotNull(craftAssistantSign)){ %>
							<img src="<%=craftAssistantSign%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureCraftAssistantBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureCraftAssistantBtn"> <label
								for="applicantSignatureCraftAssistantBtn" class="choose-sign-btn">
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
									id="craftTraderAssistantSignDate" max="9999-12-31" placeholder=""
									value="<%=craftTrader!=null&&craftTrader.getCraftTraderAssistSiDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(craftTrader.getCraftTraderAssistSiDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$("input[name='occupyLocation']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    /* if($(this).val() == 'Other'){
        $(".otherSpecify, .otherSpecifyPre").toggleClass("hide");
    } */
});
function craftTraderValidation(){
	craftTraderName = $("#craftTraderName").val();
	  if (craftTraderName.trim() !== "") {
		 if(craftTraderName){ 
			  $("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#craftTraderNameValidation").addClass("hide");
			}else{
				$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#craftTraderNameValidation").removeClass("hide");
				$("#craftTraderNameValidation").text("Please Enter Owner Name");
			}
	  } else {
		  $("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
</script>
