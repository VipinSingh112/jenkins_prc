
<div class="tab-pane " role="tabpanel" id="childStep2">
	<div class="tab-form">
		<div class="applicant-info-form">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Pyrotechnic Competency Certificate</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading">Surname</p>
						<input type="text" class="form-control" id="pyrotechnicSurname"
							placeholder="Surname" />
						<!-- <p class="tab-form-sub-heading fieldAlert hide" id="" style="color: red;">Enter a Name of Applicant</p> -->
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading">First Name</p>
						<input type="text" class="form-control" id="pyrotechnicFistName"
							placeholder="First Name" />
						<!-- <p class="tab-form-sub-heading fieldAlert hide" id="" style="color: red;">Enter a Name of Applicant</p> -->
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading text-nowrap">Middle Initial</p>
						<input type="text" class="form-control" id="pyrotechnicMiddleName"
							value="" placeholder="Middle Initial" />
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Sex</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block ml-0">
								<input type="radio" id="pyrotechnicGender1" value="Male"
									name="pyrotechnicGender"> <label for="pyrotechnicGender1">
									<p class="tab-form-main-heading mb-0">Male</p>
								</label>
							</div>
							<div class="wizard-form-radio d-block pl-3">
								<input type="radio" id="pyrotechnicGender2" value="Female"
									name="pyrotechnicGender"> <label for="pyrotechnicGender2">
									<p class="tab-form-main-heading mb-0">Female</p>
								</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<p class="tab-form-main-heading mb-0">Telephone #</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-sub-heading">Office</p>
						<input type="text" class="form-control" id="pyrotechnicOfficeNumber"
							placeholder="+1 876-876-1234" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-sub-heading">Cell</p>
						<input type="text" class="form-control" id="pyrotechnicCellNumber"
							placeholder="Cell" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading" id="trnNumber">TRN</p>
						<input type="text" class="form-control" id="pyrotechnicTrnNumber"
							placeholder="TRN" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-main-heading">Date of Birth</p>
						<input type="date" class="form-control" id="pyrotechnicDob"
							placeholder="Date of Birth" />
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Address</p>
						<textarea rows="3" class="form-control" maxlength="255"
							id="pyrotechnicAddress" value="" placeholder="Address"
							style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Educational Background</p>

						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="pyrotechnicEducationalBackground1"
								value="Primary" name="pyrotechnicEducationalBackground"> <label
								for="pyrotechnicEducationalBackground1">
								<p class="tab-form-main-heading mb-0">Primary</p>
							</label>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="pyrotechnicEducationalBackground2"
								value="Secondary" name="pyrotechnicEducationalBackground"> <label
								for="pyrotechnicEducationalBackground2">
								<p class="tab-form-main-heading mb-0">Secondary</p>
							</label>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="pyrotechnicEducationalBackground3"
								value="Tertiary" name="pyrotechnicEducationalBackground"> <label
								for="pyrotechnicEducationalBackground3">
								<p class="tab-form-main-heading mb-0">Tertiary</p>
							</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Have you ever participated in
							a Blasting Course?</p>

						<div class="wizard-form-radio d-block">
							<input type="radio" id="pyrotechnicCourseParticipated1" value="Yes"
								name="pyrotechnicCourseParticipated"> <label
								for="pyrotechnicCourseParticipated1">
								<p class="tab-form-main-heading mb-0">Yes</p>
							</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input type="radio" id="pyrotechnicCourseParticipated2" value="No"
								name="pyrotechnicCourseParticipated"> <label
								for="pyrotechnicCourseParticipated2">
								<p class="tab-form-main-heading mb-0">No</p>
							</label>
						</div>
					</div>
				</div>

				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-main-heading">State</p>
						<input type="text" class="form-control" id="pyrotechnicState"
							placeholder="State" />
					</div>
				</div>

				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Name of Course</p>
						<input type="text" class="form-control" id="pyrotechnicCoursename"
							placeholder="Name of Course">
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-main-heading">Institution/Course Organizer</p>
						<input type="text" class="form-control" id="pyrotechnicOrganizer"
							placeholder="Institution/Course Organizer" />
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2" id="pyrotechnicSignatureHolder"></div>
					<input type="file" id="pyrotechnicApplicantSignatureBtn" hidden=""
						name="<portlet:namespace/>blasterApplicantSignatureBtn" /> <label
						for="pyrotechnicApplicantSignatureBtn" class="choose-sign-btn">
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
						<input type="date" class="form-control" id="pyrotechnicDate"
							placeholder="" />
					</div>
				</div>
			</div>
		</div>
	</div>
</div>