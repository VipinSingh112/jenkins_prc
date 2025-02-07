<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="hotel-accomadation-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For a Hotel
								Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner/Director *</p>
								<input type="text" class="form-control mt-3"
									id="newAccomadationOwnerName" placeholder="John Doe"
									value="<%=Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getNameOfOwner())?accoHotelLic.getNameOfOwner():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newAccommodationOwnerNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Hotel</p>
								<input type="text" class="form-control mt-3"
									id="newAccomadationHotelName"
									placeholder="Example name of the Hotel" value="<%=Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getNameOfHotel())?accoHotelLic.getNameOfHotel():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="newAccomadationTelephone" value="<%=Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getTelephoneNo())?accoHotelLic.getTelephoneNo():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newAccomadationFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control"
									id="newAccomadationEmail" placeholder="info@example.jm"
									value="<%=Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getEmailAddress())?accoHotelLic.getEmailAddress():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newAccommodationEmailValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="newAccomadationParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=accoHotelLic!=null?accoHotelLic.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newAccomadationAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(accoHotelLic)&&Validator.isNotNull(accoHotelLic.getAddress())?accoHotelLic.getAddress():"" %></textarea>
							</div>
						</div>
						<!-- <div class="col-md-12">
							<p class="wizard-info f2">Being the keeper of the
								hotel hereby apply for the grant of a licence to keep the hotel
								in accordance with the provisions of Section 23 of the Tourist
								Board Act, 1985.</p>
						</div> -->
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addAccoHotelLicenceDetail(false);"
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
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of bedrooms</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="newAccomadationHotelBedroom" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNoOfBedroom())?accoHotelGenDec.getNoOfBedroom():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Owner of hotel</p>
								<input type="text" class="form-control"
									id="accomadationHotelOwner" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getOwnerOfHotel())?accoHotelGenDec.getOwnerOfHotel():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newAccomadationHotelAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getAddressOne())?accoHotelGenDec.getAddressOne():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">A company incorporated under the laws of</p>
								<input type="text" class="form-control"
									id="accomadationHotelLaws" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getCompIncorporatedOne())?accoHotelGenDec.getCompIncorporatedOne():"" %>" placeholder="">
								<p class="tab-form-sub-heading">Strike out if the owner is a
									private individual</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Incorporation in Jamaica</p>
								<input type="date" class="form-control"
									id="newAccomadationDateCom" max="9999-12-31" placeholder=""
									value="<%=accoHotelGenDec!=null&&accoHotelGenDec.getCompanyDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoHotelGenDec.getCompanyDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Operator of Hotel</p>
								<input type="text" class="form-control"
									id="newAccomadationHotelOperator" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getHotelOperator())?accoHotelGenDec.getHotelOperator():"" %>"
									placeholder="Operator of hotel">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Operating Hotels since</p>
								<input type="date" class="form-control"
									id="newAccomadationHotelOperatorDate" value="<%=accoHotelGenDec!=null&&accoHotelGenDec.getHotelOperatorDateSince()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoHotelGenDec.getHotelOperatorDateSince()):StringPool.BLANK %>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newHotelAccomadationAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getAddressTwo())?accoHotelGenDec.getAddressTwo():"" %></textarea>
							</div>
						</div>
						<!-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Company incorporated under
									the laws</p>
								<input type="text" class="form-control"
									id="newAccomadationHotelCompanylaws" value="" placeholder="">
								<p class="tab-form-sub-heading">Strike out if the owner is a
									private individual</p>
							</div>
						</div> -->
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner</p>
								<input type="text" class="form-control"
									id="new-accomadation-hotel-owner" value="" placeholder="">
							</div>
						</div> -->
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of hotel Operator</p>
								<input type="text" class="form-control"
									id="newAccomadationHotelOperatorName" value=""
									placeholder="">
							</div>
						</div> -->
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="newAccomadationDateHotel" max="9999-12-31" placeholder=""
									value="">
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Hotel Inception date</p>
								<input type="date" class="form-control"
									id="newAccomadationDate" max="9999-12-31" placeholder=""
									value="<%=accoHotelGenDec!=null&&accoHotelGenDec.getHotelIncepDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoHotelGenDec.getHotelIncepDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">The attached list shows the
									names and addresses of all the Directors of the company</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="address-of-directors"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="address-of-directors">
													<label class="custom-upload" for="address-of-directors">
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(formNameDoc))?formNameDoc:""%></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">If necessary, enquires
									about the finances of the operation of the hotel can be made to
								</p>
								<input type="text" class="form-control"
									id="newAccomadationHotelFinance" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getFinanceOfOper())?accoHotelGenDec.getFinanceOfOper():"" %>" placeholder="">
							</div>
						</div>

						<div class="col-md-12">
							<p class="wizard-info f2">The hotel is/is not* a
								member of the Jamaica Hotel and Tourist Association</p>
							<p class="wizard-info f2">I am properly
								authorized to state the foregoing</p>
						</div>

						<div class="col-md-12">
							<p class="tab-form-main-heading">The attached certificate
								issued under the Public Health Law is to the best of my
								knowledge in full force and effect</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="public-laws"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="public-laws">
												<label class="custom-upload" for="public-laws"> <span
													class="mr-2"> <svg width="14" height="17"
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(publicLaw))?publicLaw:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">No. of Employees</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="newAccomadationHotelEmployeesNum" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNoOfEmployee())?accoHotelGenDec.getNoOfEmployee():"" %>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureHotelImageHolder">
							<%if(Validator.isNotNull(hotelSignApp)){ %>
							<img src="<%=hotelSignApp%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureHotelBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureHotelBtn"> <label
								for="applicantSignatureHotelBtn" class="choose-sign-btn">
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
									id="newAccomadationHSignDate" max="9999-12-31" placeholder=""
									value="<%=accoHotelGenDec!=null&&accoHotelGenDec.getSignatureDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoHotelGenDec.getSignatureDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Manager</p>
								<input type="text" class="form-control"
									id="newAccomadationHotelManagerName" value="<%=Validator.isNotNull(accoHotelGenDec)&&Validator.isNotNull(accoHotelGenDec.getNameOfManager())?accoHotelGenDec.getNameOfManager():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Manager</p>
							<div class="signature_texarea mb-2" id="managerSignatureHotelImageHolder">
							<%if(Validator.isNotNull(hotelSignManager)){ %>
							<img src="<%=hotelSignManager%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="managerSignatureHotelBtn" hidden=""
								name="<portlet:namespace/>managerSignatureHotelBtn"> <label
								for="managerSignatureHotelBtn" class="choose-sign-btn">
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