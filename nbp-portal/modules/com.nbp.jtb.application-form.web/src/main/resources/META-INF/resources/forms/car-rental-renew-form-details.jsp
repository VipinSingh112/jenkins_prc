<div class="new-hotel-accomadation-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
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
								<p class="tab-form-main-heading">Name of Applicant</p>
								<input type="text" class="form-control"
									id="newCarRentalApplicantName" placeholder="" value="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newCarRentalAddress" placeholder=""
									style="border-radius: 5px; width: 100%"></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Company</p>
								<input type="text" class="form-control"
									id="newCarRentalCompanyName" placeholder="" value="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newCarRentalCompanyAddress" placeholder=""
									style="border-radius: 5px; width: 100%"></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No</p>
								<input type="text" class="form-control"
									id="newCarRentalTelephone" value=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newCarRentalFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control" id="newCarRentalEmail"
									placeholder="info@example.jm" value="" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newCarRentalEmailValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Company
									Registration</p>
								<input type="date" class="form-control" id="newCarRentalDate"
									max="9999-12-31" placeholder="" value="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Manager</p>
								<input type="text" class="form-control"
									id="newCarRentalManagerName" value="" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Vehicles in Fleet</p>
								<input type="text" class="form-control"
									id="newCarRentalVehiclesNo" value="" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
									id="newCarRentalEmployeesNo" value="" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Branch Office Locations</p>
								<input type="text" class="form-control"
									id="newCarRentalOfficeLocation" value="" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<input id="directorDetailVal" type="hidden"
								name="directorDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="nursingStaffDetailBox">
									<div class="accordion__header is-active"
										id="nursingStaffDetail" onclick="expandDetails(this.id)">
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
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone No</p>
													<input type="text" class="form-control"
														id="companyDirectorName" value="" placeholder="">
												</div>
											</div>
											<!-- <div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax No</p>
													<input type="text" class="form-control"
														id="companyDirectorNationality" value="" placeholder="">
												</div>
											</div> -->
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addDirectorDetail" onclick="addDirectorDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addDirectorDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="adddirectorDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Telephone No</th>
											<!-- <th class="sub_heading text-nowrap">Fax No</th> -->
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I,<span class="giluio declaration-by"> </span>, hereby certify
								that the information given is to the best of my knowledge and
								belief a true and accurate testimony.
							</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureCarRentalImgHolder"></div>
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
									id="newCarRentalPosition" value="" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="newCarRentalDate"
									max="9999-12-31" placeholder="" value="">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
