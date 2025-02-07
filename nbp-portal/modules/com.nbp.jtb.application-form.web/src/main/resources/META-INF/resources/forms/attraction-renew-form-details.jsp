<div class=" hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For
								Attraction(RENEWAL)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of Attraction</p>
								<input type="text" class="form-control"
									id="newAttractionsTypeBox" placeholder="" disabled="" value="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of
									Owner/Operator/Manager in Attraction</p>
								<input type="text" class="form-control mt-3"
									id="renewAttractionsOwnerName" placeholder="John Doe" value="" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="renewAttractionsOwnerNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewAttractionsLocation" value="" placeholder=""
									style="border-radius: 5px; width: 100%"></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Mailing Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewAttractionsMailingEmail" value="" placeholder=""
									style="border-radius: 5px; width: 100%"></textarea>
								<!-- <input type="text" class="form-control"
									id="renewAttractionsMailingEmail" value=""
									placeholder="info@companyname.jm" /> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control"
									id="renewAttractionsTelephone" value=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="renewAttractionsFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control"
									id="renewAttractionsEmailAddress" value=""
									placeholder="info@companyname.jm" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="renewAttractionsEmployeesNum" placeholder="" value="" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="renewAttractionsParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston">Kingston</option>
										<option value="St. Andrew">St. Andrew</option>
										<option value="Portland">Portland</option>
										<option value="St. Thomas">St. Thomas</option>
										<option value="St. Catherine">St. Catherine</option>
										<option value="St. Mary">St. Mary</option>
										<option value="St. Ann">St. Ann</option>
										<option value="Manchester">Manchester</option>
										<option value="Clarendon">Clarendon</option>
										<option value="Hanover">Hanover</option>
										<option value="Westmoreland">Westmoreland</option>
										<option value="St. James">St. James</option>
										<option value="Trelawny">Trelawny</option>
										<option value="St. Elizabeth">St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<button type="button" id="saveName"
							onclick=" applicantInfo();addClaimantDetailsFormInfo();"
							class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
							Continue to the next form section <span class="ml-2"> <svg
									width="18" height="14" viewBox="0 0 18 14" fill="none"
									xmlns="http://www.w3.org/2000/svg"> 
			                        <pathd ="m6.00016 11.17l1.83016=""
										6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
										1.99997l16.5902="" 0.589966l6.00016="" 11.17z"=""
										fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
							</span>
						</button>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">The provisions of
								Section 23 of the Tourist Board Act</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner</p>
								<input type="text" class="form-control"
									id="reNewAttractionsOwner" placeholder="" disabled="" value="">
							</div>
						</div>
						
					</div>

					<div class="col-md-12">
						<p class="tab-form-main-heading">the attached list shows the
							names and addresses of all the Directors of the operating company
							(if applicable)</p>
						<div class="supporting-document-card my-3">
							<div class="row">
								<div class="col-md-12">
									<div class="supporting-document-card-wrapper">
										<div class="left">
											<p class="supporting-document-card-upper-heading">Attach
												File</p>
										</div>
										<div class="right">
											<input type="file" id="renew-attraction-address-of-directors"
												onchange="attachDetailed(this.id)" hidden="" multiple=""
												name="_com_nbp_attraction_application_form_web_ApplicationFormPortlet_address_of_directors">
											<label class="custom-upload"
												for="renew-attraction-address-of-directors"> <span
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
									<span class="attach-detailed-overview"></span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<p class="pt-2 common-para">Signature of Applicant</p>
						<div class="signature_texarea mb-2"
							id="applicantSignatureRenewAttractionImgHolder"></div>
						<input type="file" id="applicantSignatureRenewAttractionBtn"
							hidden=""
							name="<portlet:namespace/>applicantSignatureRenewAttractionBtn">
						<label for="applicantSignatureRenewAttractionBtn"
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
							<input type="date" class="form-control" id="attractionRenewDate"
								max="9999-12-31" placeholder="" value="">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>