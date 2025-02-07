<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="places-of-interest-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep25">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for Place
								of Interest/ Places of Worship Approval</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Place of Interest/Place of Worship</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="typeOfPlace">
										<option value="" selected="" disabled="">Please
											Select</option>
										<option value="Place of Interest">Place of Interest</option>
										<option value="Place of Worship">Place of Worship</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Owner/Operator/Manager</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="typeOfRole">
										<option value="" selected="" disabled="">Please
											Select</option>
										<option value="Owner">Owner</option>
										<option value="Operator">Operator</option>
										<option value="Manager">Manager</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6 placeOfInterest hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Places of Interest</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="placeOfInterest">
										<option value="" selected="" disabled="">Please
											Select</option>
										<option value="Museum" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterest().equals("Museum")?"selected":"":StringPool.BLANK%>>Museum</option>
										<option value="Art Gallery" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterest().equals("Art Gallery")?"selected":"":StringPool.BLANK%>>Art Gallery</option>
										<option value="Botanical Gardens" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterest().equals("Botanical Gardens")?"selected":"":StringPool.BLANK%>>Botanical Gardens</option>
										<option value="Forts" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterest().equals("Forts")?"selected":"":StringPool.BLANK%>>Forts</option>
										<option value="Great Houses" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterest().equals("Great Houses")?"selected":"":StringPool.BLANK%>>Great Houses</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of
									Owner/Operator/Manager *</p>
								<input type="text" class="form-control mt-3"
									id="placeInterestOwnerName" placeholder="John Doe" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceInterestOwnerName())?placeOfInterest.getPlaceInterestOwnerName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="placeOfInterestNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Place of Interest/ Worship</p>
								<input type="text" class="form-control mt-3"
									id="nameOfInterestLocation" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getNameOfInterestLocation())?placeOfInterest.getNameOfInterestLocation():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Place of Interest/Worship
									Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="placeOfInterestLocation" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestLocation())?placeOfInterest.getPlaceOfInterestLocation():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Mailing Address</p>
								<textarea rows="3" class="form-control" maxlength="255" id="placeOfInterestMailing" value="" placeholder="Mailing address" 
								style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestMailing())?placeOfInterest.getPlaceOfInterestMailing():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="placeOfInterestTelephone" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestTelephone())?placeOfInterest.getPlaceOfInterestTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control"
									id="placeOfInterestEmail" placeholder="info@example.jm"
									value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestEmail())?placeOfInterest.getPlaceOfInterestEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="placeOfInterestEmailValidation" style="color: red;">Please Enter E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">No. of Employees</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="placeOfInterestEmployeesNo" placeholder="No. of Employees" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestEmployeesNo())?placeOfInterest.getPlaceOfInterestEmployeesNo():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="placeOfInterestParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=placeOfInterest!=null?placeOfInterest.getPlaceOfInterestParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addPlaceOfInterestDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep26">
			<div class="tab-form">
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner</p>
								<input type="text" class="form-control"
									id="placeOfInterestOwnerName" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestOwnerGenDec())?placeOfInterest.getPlaceOfInterestOwnerGenDec():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">A company incorporated under the laws of</p>
								<input type="text" class="form-control"
									id="placeOfInterestHotelLaws" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestHotelLaws())?placeOfInterest.getPlaceOfInterestHotelLaws():"" %>" placeholder="">
								<p class="tab-form-sub-heading">Strike out if the owner is a
									private individual</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Incorporation in Jamaica</p>
								<input type="date" class="form-control" id="placeOfInterestDate"
									max="9999-12-31" placeholder="" value="<%=placeOfInterest!=null&&placeOfInterest.getPlaceOfInterestDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(placeOfInterest.getPlaceOfInterestDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Place of
									Interest/Worship</p>
								<input type="text" class="form-control" id="placeOfInterestName"
									placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestName())?placeOfInterest.getPlaceOfInterestName():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Operating Since</p>
								<input type="date" class="form-control"
									id="placeOfInterestOperatingSince" placeholder="" value="<%=placeOfInterest!=null&&placeOfInterest.getPlaceOfInterestOperating()!=null?new SimpleDateFormat("yyyy-MM-dd").format(placeOfInterest.getPlaceOfInterestOperating()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Acres of land Place of Interest/ Worship is situated on</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									id="placeOfInterestAcresLand" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestAcresLand())?placeOfInterest.getPlaceOfInterestAcresLand():"" %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">The Place of
								Interest/Worship offers the following activities</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Walking Tour</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="walkingtour" <%=placeOfInterest!=null &&placeOfInterest.getWalkingTour().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="walkingtour" <%=placeOfInterest!=null &&placeOfInterest.getWalkingTour().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Cemetery Tour</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="cemeterytour" <%=placeOfInterest!=null &&placeOfInterest.getCemeteryTour().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="cemeterytour" <%=placeOfInterest!=null &&placeOfInterest.getCemeteryTour().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Garden Tour</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="gardentour" <%=placeOfInterest!=null &&placeOfInterest.getGardenTour().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="gardentour" <%=placeOfInterest!=null &&placeOfInterest.getGardenTour().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Rooms/Cabins</p>
								<input type="text" class="form-control"
									id="placeOfInterestRooms" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestRooms())?placeOfInterest.getPlaceOfInterestRooms():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Tent Space</p>
								<input type="text" class="form-control"
									id="placeOfInterestTentSpace" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestTentSpace())?placeOfInterest.getPlaceOfInterestTentSpace():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Male/Female Showers</p>
								<input type="text" class="form-control"
									id="placeOfInterestShowers" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestShowers())?placeOfInterest.getPlaceOfInterestShowers():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Male/Female Sanitary Conveniences</p>
								<input type="text" class="form-control"
									id="placeOfInterestSanitaryConveniences" placeholder="" value="<%=Validator.isNotNull(placeOfInterest)&&Validator.isNotNull(placeOfInterest.getPlaceOfInterestSanitary())?placeOfInterest.getPlaceOfInterestSanitary():"" %>">
							</div>
						</div>
						
						<div class="col-md-12">
							<p class="tab-form-main-heading">The attached list shows the
								names and addresses of all the Directors of the operating
								company (if applicable)</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="address-of-directors-company"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>address-of-directors-company">
												<label class="custom-upload" for="address-of-directors-company">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(placeAddress))?placeAddress:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="wizard-info f2">I am properly authorized to state the foregoing</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureplaceOfInterestImageHolder">
								<%if(Validator.isNotNull(placeSignApp)){ %>
							<img src="<%=placeSignApp%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureplaceOfInterestBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureplaceOfInterestBtn"> <label
								for="applicantSignatureplaceOfInterestBtn" class="choose-sign-btn">
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
									id="placeOfInterestSignDate" max="9999-12-31" placeholder=""
									value="<%=placeOfInterest!=null&&placeOfInterest.getPlaceOfInterestSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(placeOfInterest.getPlaceOfInterestSignDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
