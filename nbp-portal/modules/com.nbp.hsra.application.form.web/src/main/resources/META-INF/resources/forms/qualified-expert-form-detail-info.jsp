<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp"%>
<div class="hide qualified-expert-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep22">
			<div class="tab-form">
				<div class="qualified-expert-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Qualified Expert Application
								Form</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">
									<p class="tab-form-sub-heading">
										<b>Note:</b> In compliance with Regulations 24(2) of Nuclear
										Safety and Radiation Protection Regulations, 2019, the
										qualifications of Qualified Experts in radiation safety shall
										include a level of academic knowledge and of professional
										experience compatible with the levels of risk associated with
										the authorized practices and sources within the practice.

									</p>
								</li>
							</ul>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading mt-3">
								<b>Instructions:</b> Kindly complete all applicable sections of
								this application form and submit to the HSRA along with a copy
								of receipt for fees paid, completed Fit and Proper
								Questionnaire, a certified copy of the legal operator's valid
								national ID and all supporting documents stipulated in the
								guidance document. Additionally, a Declaration Form is to be
								completed and submitted if radioactive material or nuclear
								material is being used on premises that are leased. For
								construction of new facilities that will use sources of
								Categories 1 and 2, an Environmental Impact Assessment (EIA) is
								also to be submitted.
							</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading mt-3">For further details on
								requirements of a Qualified Expert, refer to the HSRA Technical
								Guide: Requirements of Qualified Experts in Radiation Protection
								and Safety (HSRA-ADM-TD-10).</p>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();addInstructionsDetails(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep23">
			<div class="tab-form">
				<div class="applicant-details-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Part A : Applicant Details</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Surname</p>
								<input type="text" class="form-control" id="expertSurname"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertSurname())
							? qualityApplicationDetail.getExpertSurname()
							: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">First Name*</p>
								<input type="text" class="form-control" id="expertFirstName"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertFirstName())
							? qualityApplicationDetail.getExpertFirstName()
							: ""%>"
									placeholder="">
									<p class="tab-form-sub-heading fieldAlert hide" id="expertFirstNameValidation" style="color: red;">Enter a First Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">ID</p>
								<input type="text" class="form-control" id="expertId"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertId())
							? qualityApplicationDetail.getExpertId()
							: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Position</p>
								<input type="text" class="form-control" id="expertPosition"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertPosition())
							? qualityApplicationDetail.getExpertPosition()
							: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="expertTelephone"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertTelephone())
							? qualityApplicationDetail.getExpertTelephone()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mobile</p>
								<input type="text" class="form-control" id="expertMobile"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertMobile())
							? qualityApplicationDetail.getExpertMobile()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email*</p>
								<input type="text" class="form-control" id="expertEmail"
									value="<%=Validator.isNotNull(qualityApplicationDetail)
					&& Validator.isNotNull(qualityApplicationDetail.getExpertEmail())
							? qualityApplicationDetail.getExpertEmail()
							: ""%>"
						placeholder="info@companyname.jm">
						<p class="tab-form-sub-heading fieldAlert hide" id="expertEmailValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="expertDate"
								value="<%=Validator.isNotNull(qualityApplicationDetail)&&Validator.isNotNull(qualityApplicationDetail.getExpertDate())?new SimpleDateFormat("yyyy-MM-dd").format(qualityApplicationDetail.getExpertDate()):""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<%
								if (Validator.isNotNull(fileUrlInQualityExpect)) {
							%><div class="signature_texarea mb-2" id="expertSignatureImageHolder">
								<img src="<%=fileUrlInQualityExpect%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2"
								id="expertSignatureImageHolder"></div>
							<%
								}
							%>
							<input type="file" id="expertSignatureBtn" hidden=""
								name="<portlet:namespace/>expertSignatureBtn"> <label
								for="expertSignatureBtn" class="choose-sign-btn"> <span
								class="mr-2"> <svg width="14" height="17"
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
			<button type="button" id="saveName"
				onclick="addExpertDetails(false);"  
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
				<div class="employment-details-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Part B : Employment Details</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Company Name*</p>
								<input type="text" class="form-control"
									id="employmentCompanyName"
									value="<%=Validator.isNotNull(employmentInfo) && Validator.isNotNull(employmentInfo.getCompanyName())
					? employmentInfo.getCompanyName()
					: ""%>"
						placeholder="">
					    <p class="tab-form-sub-heading fieldAlert hide" id="employmentCompanyNameValidation" style="color: red;">Enter a Name Company Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="employmentTeleNo"
									value="<%=Validator.isNotNull(employmentInfo) && Validator.isNotNull(employmentInfo.getTeleNo())
					? employmentInfo.getTeleNo()
					: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="employmentAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"
									aria-describedby="employmentAddress"><%=Validator.isNotNull(employmentInfo) && Validator.isNotNull(employmentInfo.getAddress())
					? employmentInfo.getAddress()
					: ""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="employmentParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Kingston") ? "selected" : ""
					: StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Andrew") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Andrew</option>
										<option value="Portland"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Portland") ? "selected" : ""
					: StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Thomas") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Thomas</option>
										<option value="St. Catherine"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Catherine") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Catherine</option>
										<option value="St. Mary"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Mary") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Mary</option>
										<option value="St. Ann"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Ann") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Ann</option>
										<option value="Manchester"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Manchester") ? "selected" : ""
					: StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Clarendon") ? "selected" : ""
					: StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Hanover") ? "selected" : ""
					: StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Westmoreland") ? "selected" : ""
					: StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. James") ? "selected" : ""
					: StringPool.BLANK%>>St.
											James</option>
										<option value="Trelawny"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("Trelawny") ? "selected" : ""
					: StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth"
											<%=employmentInfo != null ? employmentInfo.getParish().equals("St. Elizabeth") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mobile</p>
								<input type="text" class="form-control" id="employmentMobileNo"
									value="<%=Validator.isNotNull(employmentInfo) && Validator.isNotNull(employmentInfo.getMobileNo())
					? employmentInfo.getMobileNo()
					: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email*</p>
								<input type="text" class="form-control"
									id="employmentEmailAddress"
									value="<%=Validator.isNotNull(employmentInfo) && Validator.isNotNull(employmentInfo.getEmailAddress())
					? employmentInfo.getEmailAddress()
					: ""%>"
									placeholder="info@companyname.jm">
									<p class="tab-form-sub-heading fieldAlert hide" id="employmentEmailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addEmploymentDetails(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep25">
			<div class="tab-form">
				<div class="proficiency-details-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Part C : Proficiency Details</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Check all areas for
								which applicant seeks approval for registration as Qualified
								Expert</p>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails1"
										value="Diagnostic Radiology"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Diagnostic Radiology") ? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails1">
										<p class="tab-form-main-heading mb-0">Diagnostic Radiology</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration1"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationOne())
							? proficienctDetail.getWorkDurationOne()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity1"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityOne())
					? proficienctDetail.getCapacityOne()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails2"
										value="Radiotherapy"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails().contains("Radiotherapy")
					? "checked"
					: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails2">
										<p class="tab-form-main-heading mb-0">Radiotherapy</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration2"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationTwo())
							? proficienctDetail.getWorkDurationTwo()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity2"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityTwo())
					? proficienctDetail.getCapacityTwo()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails3"
										value="Nuclear Medicine"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails().contains("Nuclear Medicine")
							? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails3">
										<p class="tab-form-main-heading mb-0">Nuclear Medicine</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration3"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationThree())
							? proficienctDetail.getWorkDurationThree()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity3"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityThree())
							? proficienctDetail.getCapacityThree()
							: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails4"
										value="Dentistry"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails().contains("Dentistry")
					? "checked"
					: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails4">
										<p class="tab-form-main-heading mb-0">Dentistry</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration4"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationFour())
							? proficienctDetail.getWorkDurationFour()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity4"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityFour())
					? proficienctDetail.getCapacityFour()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails5"
										value="Veterinary Radiography"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Veterinary Radiography") ? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails5">
										<p class="tab-form-main-heading mb-0">Veterinary
											Radiography</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration5"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationFive())
							? proficienctDetail.getWorkDurationFive()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity5"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityFive())
					? proficienctDetail.getCapacityFive()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails6"
										value="Non-Destructive Testing"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Non-Destructive Testing") ? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails6">
										<p class="tab-form-main-heading mb-0">Non-Destructive
											Testing</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration6"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationSix())
							? proficienctDetail.getWorkDurationSix()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity6"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacitySix())
					? proficienctDetail.getCapacitySix()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails7"
										value="Fixed Gauges and Fixed Screening Devices"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Fixed Gauges and Fixed Screening Devices")
							? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails7">
										<p class="tab-form-main-heading mb-0">Fixed Gauges and
											Fixed Screening Devices</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration7"
												placeholder="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationSeven())
							? proficienctDetail.getWorkDurationSeven()
							: ""%>"
												value="" autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity7"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacitySeven())
							? proficienctDetail.getCapacitySeven()
							: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails8"
										value="Mobile Gauges and Mobile Screening Devices"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Mobile Gauges and Mobile Screening Devices")
							? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails8">
										<p class="tab-form-main-heading mb-0">Mobile Gauges and
											Mobile Screening Devices</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration8"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationEight())
							? proficienctDetail.getWorkDurationEight()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity8"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityEight())
							? proficienctDetail.getCapacityEight()
							: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails9"
										value="Research with Un-Sealed Sources"
										<%=proficienctDetail != null
					&& proficienctDetail.getProficiencyDetails().contains("Research with Un-Sealed Sources") ? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails9">
										<p class="tab-form-main-heading mb-0">Research with
											Un-Sealed Sources</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration9"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationNine())
							? proficienctDetail.getWorkDurationNine()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity9"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityNine())
					? proficienctDetail.getCapacityNine()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails10"
										value="Research with X-Ray Equipment and Sealed Sources"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails()
					.contains("Research with X-Ray Equipment and Sealed Sources") ? "checked" : StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails10">
										<p class="tab-form-main-heading mb-0">Research with X-Ray
											Equipment and Sealed Sources</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration10"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationTen())
							? proficienctDetail.getWorkDurationTen()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity10"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityTen())
					? proficienctDetail.getCapacityTen()
					: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails11"
										value="Nuclear Reactor"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails().contains("Nuclear Reactor")
					? "checked"
					: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails11">
										<p class="tab-form-main-heading mb-0">Nuclear Reactor</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration11"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationEleven())
							? proficienctDetail.getWorkDurationEleven()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity11"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityEleven())
							? proficienctDetail.getCapacityEleven()
							: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="proficiencyDetails12"
										value="Other Application"
										<%=proficienctDetail != null && proficienctDetail.getProficiencyDetails().contains("Other Application")
							? "checked"
							: StringPool.BLANK%>
										name="proficiencyDetails"> <label
										for="proficiencyDetails12">
										<p class="tab-form-main-heading mb-0">Other Application</p>
									</label>
								</div>
								<div class="row documentChecklist px-4 mx-1">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Duration of work
												experience</p>
											<input type="text" class="form-control" id="workDuration12"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail)
					&& Validator.isNotNull(proficienctDetail.getWorkDurationTwelve())
							? proficienctDetail.getWorkDurationTwelve()
							: ""%>"
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Capacity</p>
											<input type="text" class="form-control" id="capacity12"
												placeholder=""
												value="<%=Validator.isNotNull(proficienctDetail) && Validator.isNotNull(proficienctDetail.getCapacityTwelve())
							? proficienctDetail.getCapacityTwelve()
							: ""%>">
											<p class="tab-form-sub-heading">Eg. Service Provider,
												Trainer/instructor, Operator of Sources</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();addProficiencyDetails(false);"
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
				<div class="declaration-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Declaration</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-sub-heading mt-3">
								I <span class="giluio appliNameD"> </span> certify that all the
								information given herein and any supplemental pages appended to
								this application, are true and correct to the best of my
								knowledge.
							</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<%
								if (Validator.isNotNull(fileUrlInDeclare)) {
							%>
							<div class="signature_texarea mb-2"
								id="declarationSignImageHolder">
								<img src="<%=fileUrlInDeclare%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2"
								id="declarationSignImageHolder"></div>
							<%
								}
							%>

							<input type="file" id="declarationSignBtn" hidden=""
								name="<portlet:namespace/>declarationSignBtn"> <label
								for="declarationSignBtn" class="choose-sign-btn"> <span
								class="mr-2"> <svg width="14" height="17"
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
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">Date</p>
								<input type="date" class="form-control" id="declarationSignDate"
									value="<%=Validator.isNotNull(qualityDeclare)&&Validator.isNotNull(qualityDeclare.getDeclarationSignDate())?new SimpleDateFormat("YYYY-dd-MM").format(qualityDeclare.getDeclarationSignDate()):""%>" placeholder="">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>