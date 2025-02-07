<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="tab-pane active" role="tabpanel" id="childStep1">
	<div class="tab-form">
		<div class="applicant-info-form">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2 applicationTypeHeading">Blaster's Competency Certificate</p>
					<p class="tab-form-title-subtitle f2">Please read the forms
						carefully and upload all the required supporting documentation.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="pt-2 common-para">Image of Applicant</p>
					<div class="signature_texarea mb-2" id="blasterApplicantImageHolder">
					<%if(Validator.isNotNull(imageDoc)){ %>
							<img src="<%=imageDoc%>"  width="100" height="100"/>
							<%} %></div>
					<input type="file" id="blasterApplicantImageBtn" hidden="" name="<portlet:namespace/>blasterApplicantImageBtn"/> 
					<label for="blasterApplicantImageBtn" class="choose-sign-btn"> <span
						class="mr-2"> <svg width="14" height="17"
								viewBox="0 0 14 17" fill="none"
								xmlns="http://www.w3.org/2000/svg"> 
										<path
									d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
									fill="#ffffff"></path> 
									</svg>
					</span> Upload Photo
					</label>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading">Surname</p>
						<input type="text" class="form-control" id="blasterSurname" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getSurName())?blaster.getSurName():"" %>"
							placeholder="Surname" />
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading">First Name *</p>
						<input type="text" class="form-control" id="blasterFistName" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getFirstName())?blaster.getFirstName():"" %>"
							placeholder="First Name" oninput="blasterFistValidation();" />
						<p class="tab-form-sub-heading fieldAlert hide" id="blasterFistNameValidation" style="color: red;">Please
									Enter First Name</p>	
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading text-nowrap">Middle Initial</p>
						<input type="text" class="form-control" id="blasterMiddleName" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getMiddleName())?blaster.getMiddleName():"" %>"
							placeholder="Middle Initial" />
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Sex</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block ml-0">
								<input type="radio" id="blasterGender1" value="Male"
								 name="blasterGender" <%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getGender())&&blaster.getGender().equals("Male")? "checked" :"" %>> <label
									for="blasterGender1">
									<p class="tab-form-main-heading mb-0">Male</p>
								</label>
							</div>
							<div class="wizard-form-radio d-block pl-3">
								<input type="radio" id="blasterGender2" value="Female" 
								name="blasterGender"<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getGender())&&blaster.getGender().equals("Female")? "checked" :"" %>> 
								<label for="blasterGender2">
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
						<input type="text" class="form-control" id="blasterOfficeNumber"
							placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getOfficeNumber())?blaster.getOfficeNumber():"" %>"
							oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-sub-heading">Cell</p>
						<input type="text" class="form-control" id="blasterCellNumber" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getCellNum())?blaster.getCellNum():"" %>"
							placeholder="Cell" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading" id="trnNumber">TRN</p>
						<input type="text" class="form-control" id="blasterTrnNumber" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getTrnNum())?blaster.getTrnNum():"" %>"
							placeholder="TRN" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-main-heading">Date of Birth</p>
						<input type="date" class="form-control" id="blasterDob" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getDateOfBirth())? new SimpleDateFormat("yyyy-MM-dd").format(blaster.getDateOfBirth()):"" %>"
							placeholder="Date of Birth" />
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Address</p>
						<textarea rows="3" class="form-control" maxlength="255"
							id="blasterAddress" value="" placeholder="Address"
							style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getAddress())?blaster.getAddress():"" %></textarea>
					</div>
				</div>
				<!-- <div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Educational Background</p>

						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="blasterEducationalBackground1" value="Primary" name="blasterEducationalBackground"> 
							<label for="blasterEducationalBackground1">
								<p class="tab-form-main-heading mb-0">Primary</p>
							</label>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="blasterEducationalBackground2" value="Secondary" name="blasterEducationalBackground">
							<label for="blasterEducationalBackground2">
								<p class="tab-form-main-heading mb-0">Secondary</p>
							</label>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="blasterEducationalBackground3" value="Tertiary" name="blasterEducationalBackground"> 
							<label for="blasterEducationalBackground3">
								<p class="tab-form-main-heading mb-0">Tertiary</p>
							</label>
						</div>
					</div>
				</div> -->
				
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Educational Background</p>
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" name="pselect"
								id="blasterEducationalBackground">
								<option value="" disabled="" selected="">Please Select</option>
								<option value="Primary"<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getEducationalBack().equals("Primary"))? "selected":"" %>>Primary</option>
								<option value="Secondary"<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getEducationalBack().equals("Secondary"))? "selected":"" %>>Secondary</option>
								<option value="Tertiary"<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getEducationalBack().equals("Tertiary"))? "selected":"" %>>Tertiary</option>
							</select>
						</div>
					</div>
				</div>
			
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Have you ever participated in
							a Blasting Course?</p>

						<div class="wizard-form-radio d-block">
							<input type="radio" value="Yes" 
							name="blasterCourseParticipated" <%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getBlastingCourse())&&(blaster.getBlastingCourse().equals("Yes"))? "checked" :"" %>> 
							<label for="blasterCourseParticipated1">
								<p class="tab-form-main-heading mb-0">Yes</p>
							</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input type="radio" value="No" 
							name="blasterCourseParticipated" <%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getBlastingCourse())&&(blaster.getBlastingCourse().equals("No"))? "checked" :"" %>> 
							<label for="blasterCourseParticipated2">
								<p class="tab-form-main-heading mb-0">No</p>
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="row blasterCourseParticipatedInfo hide">
				<!-- <div class="col-md-6 ">
					<div class="form-group">
						<p class="tab-form-main-heading">State</p>
						<input type="text" class="form-control" id="blasterState" placeholder="State" />
					</div>
				</div> -->
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Name of Course</p>
						<input type="text" class="form-control" id="blasterCoursename" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getNameOfCourse())?blaster.getNameOfCourse():"" %>"
						placeholder="Name of Course">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Institution/Course Organizer</p>
						<input type="text" class="form-control" id="blasterOrganizer" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getCourseOrganiser())?blaster.getCourseOrganiser():"" %>"
						placeholder="Institution/Course Organizer" />
					</div>
				</div>
			</div>
			<div class="row">
				
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2" id="blasterSignatureHolder">
					<%if(Validator.isNotNull(formNameDoc)){ %>
							<img src="<%=formNameDoc%>"  width="100" height="100"/>
							<%} %></div>
					<input type="file" id="blasterApplicantSignatureBtn" hidden="" name="<portlet:namespace/>blasterApplicantSignatureBtn"/> 
					<label for="blasterApplicantSignatureBtn" class="choose-sign-btn"> <span
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
					<div class="form-group">
						<p class="tab-form-main-heading">Date</p>
						<input type="date" class="form-control" id="blasterDate" value="<%=Validator.isNotNull(blaster)&&Validator.isNotNull(blaster.getDateAppli())? new SimpleDateFormat("yyyy-MM-dd").format(blaster.getDateAppli()):"" %>"
						placeholder="" />
					</div>
				</div>
			</div>
			<!-- <button type="button" id="saveName" onclick="applicantInfo(); addBlasterDetailInfo(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
			                      <pathd ="m6.00016 11.17l1.83016=""
							6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
							1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
				</span>
			</button> -->
		</div>
	</div>
</div>
<script>
function blasterFistValidation(){
	blasterFistName = $("#blasterFistName").val();
	  if (blasterFistName.trim() !== "") {
		 if(blasterFistName){ 
			  $("#explosivesFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			  $("#blasterFistNameValidation").addClass("hide");
			}else{
				$("#explosivesFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
				$("#blasterFistNameValidation").removeClass("hide");
				$("#blasterFistNameValidation").text("Please Enter First Name");
			}
	  } else {
		  $("#explosivesFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
</script>