<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="hide" id="osiAssignmentCertificateForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="applicant-info-form">
					<div class="row">
                         <div class="col-md-12"> 
                          <p class="tab-form-title f2">Applicant Details</p> 
                          <p class="tab-form-title-subtitle f2">In this section you will provide general information about yourself.</p> 
                         </div> 
                        </div>
					<div class="row">
			            <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="applicantNature">Nature of Applicant *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="applicantNature">
										<option selected="" disabled="">Please Select</option>
										<option <%=applicantinfo!=null&&applicantinfo.getApplicantNature()!=null&&applicantinfo.getApplicantNature().equals("Individual")?"selected":"" %> value="Individual">Individual</option>	
										<option <%=applicantinfo!=null&&applicantinfo.getApplicantNature()!=null&&applicantinfo.getApplicantNature().equals("Company")?"selected":"" %>  value="Company">Company</option>
									</select>
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantNatureValidation" style="color: red;">
									Please Select </p>
								</div>
							</div>
						</div>
			            <div class="col-md-6 hide indi-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="indiFirstName">First Name *</p>
			                    <input type="text" class="form-control" id="indiFirstName" placeholder="" value="<%=applicantinfo!=null&&applicantinfo.getIndiFirstName()!=null?applicantinfo.getIndiFirstName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="indiFirstNameValidation" style="color: red;">
									Please Enter First Name</p>
			                </div>
			            </div>
			            <div class="col-md-6 hide indi-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="indiLastName">Last Name *</p>
			                    <input type="text" class="form-control" id="indiLastName" placeholder="" value="<%=applicantinfo!=null&&applicantinfo.getIndiFirstName()!=null?applicantinfo.getIndiLastName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="indiLastNameValidation" style="color: red;">
									Please Enter Last Name</p>
			                </div>
			            </div>
			            <div class="col-md-6 hide com-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="companyName">Company Name *</p>
			                    <input type="text" class="form-control" id="companyName" placeholder="" value="<%=applicantinfo!=null&&applicantinfo.getCompanyName()!=null?applicantinfo.getCompanyName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="companyNameValidation" style="color: red;">
									Please Enter Company Name</p>
			                </div>
			            </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="emailAddress">Email Address *</p>
								<input type="text" class="form-control" id="emailAddress" value="<%=applicantinfo!=null&&applicantinfo.getEmailAddress()!=null?applicantinfo.getEmailAddress():"" %>" placeholder="info@example.jm"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="emailAddressValidation" style="color: red;"></p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone No *</p>
								<input type="text" class="form-control" id="telephone" placeholder="+1 876-876-1234" value="<%=applicantinfo!=null&&applicantinfo.getTelephone()!=null?applicantinfo.getTelephone():"" %>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="telephoneValidation" style="color: red;">
								Please Enter Telephone No
								</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="applicationDate">Date of Application *</p>
								<input type="date" class="form-control" id="applicationDate" value="<%=applicantinfo!=null&&applicantinfo.getApplicationDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(applicantinfo.getApplicationDate()):"" %>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="applicationDateValidation" style="color: red;">
								Please Enter Date of Application
								</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="trnNumber">TRN # *</p>
								<input type="text" class="form-control" id="trnNumber" value="<%=applicantinfo!=null&&applicantinfo.getTrnNumber()!=null?applicantinfo.getTrnNumber():"" %>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="trnNumberValidation" style="color: red;">
								Please Enter TRN Number
								</p>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" id="address" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=applicantinfo!=null&&applicantinfo.getAddress()!=null?applicantinfo.getAddress():"" %></textarea>
								<p class="tab-form-sub-heading fieldAlert hide" id="addressValidation" style="color: red;">
									Please Enter Address</p>
							</div>
						</div>
			        </div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="applicantDetailInfo(false);"
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
				<div class="insolvent-info-form">
					<div class="row">
					 <div class="col-md-12"> 
                          <p class="tab-form-title f2">Insolvent Person Details</p>  
                          </div>
			            <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventPersonNature">Nature of Insolvent Person *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="insolventPersonNature">
										<option selected="" disabled="">Please Select</option>
										<option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventPersonNature()!=null&&insolventPersoninfo.getInsolventPersonNature().equals("Individual")?"selected":"" %> value="Individual">Individual</option>	
										<option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventPersonNature()!=null&&insolventPersoninfo.getInsolventPersonNature().equals("Company")?"selected":"" %> value="Company">Company</option>
									</select>
									<p class="tab-form-sub-heading fieldAlert hide" id="insolventPersonNatureValidation" style="color: red;">
									Please Select</p>
								</div>
							</div>
						</div>
			            <div class="col-md-6 hide insolvent-indi-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="insolventIndiFirstName">First Name *</p>
			                    <input type="text" class="form-control" id="insolventIndiFirstName" placeholder="" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventIndiFirstName()!=null?insolventPersoninfo.getInsolventIndiFirstName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="insolventIndiFirstNameValidation" style="color: red;">
									Please Enter First Name</p>
			                </div>
			            </div>
			            <div class="col-md-6 hide insolvent-indi-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="insolventIndiLastName">Last Name *</p>
			                    <input type="text" class="form-control" id="insolventIndiLastName" placeholder="" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventIndiLastName()!=null?insolventPersoninfo.getInsolventIndiLastName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="insolventIndiLastNameValidation" style="color: red;">
									Please Enter Last Name</p>
			                </div>
			            </div>
			            <div class="col-md-6 hide insolvent-com-detail">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="insolventCompanyName">Company Name *</p>
			                    <input type="text" class="form-control" id="insolventCompanyName" placeholder="" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventIndiLastName()!=null?insolventPersoninfo.getInsolventCompanyName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="insolventCompanyNameValidation" style="color: red;">
									Please Enter Company Name</p>
			                </div>
			            </div>
						<div class="col-lg-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="insolventParish">
										<option value="" selected="" disabled="">Choose Parish</option>
										<option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Kingston")?"selected":"" %> value="Kingston">Kingston</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Andrew")?"selected":"" %> value="St. Andrew">St. Andrew</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Manchester")?"selected":"" %> value="Manchester">Manchester</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Catherine")?"selected":"" %> value="St. Catherine">St. Catherine</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Thomas")?"selected":"" %> value="St. Thomas">St. Thomas</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Mary")?"selected":"" %> value="St. Mary">St. Mary</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Portland")?"selected":"" %> value="Portland">Portland</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Ann")?"selected":"" %> value="St. Ann">St. Ann</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Trelawny")?"selected":"" %> value="Trelawny">Trelawny</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. James")?"selected":"" %> value="St. James">St. James</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Hanover")?"selected":"" %> value="Hanover">Hanover</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Westmoreland")?"selected":"" %> value="Westmoreland">Westmoreland</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("St. Elizabeth")?"selected":"" %> value="St. Elizabeth">St. Elizabeth</option>
					                    <option <%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventParish()!=null&&insolventPersoninfo.getInsolventParish().equals("Clarendon")?"selected":"" %> value="Clarendon">Clarendon</option>
									</select>
									<p class="tab-form-sub-heading fieldAlert hide" id="insolventParishValidation" style="color: red;">
									Please Select</p>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventEmailAddress">Email Address *</p>
								<input type="text" class="form-control" id="insolventEmailAddress" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventEmailAddress()!=null?insolventPersoninfo.getInsolventEmailAddress():"" %>" placeholder="info@example.jm"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventEmailAddressValidation" style="color: red;">
								Please Enter Email Address
								</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventTelephone">Telephone No *</p>
								<input type="text" class="form-control" placeholder="+1 876-876-1234" id="insolventTelephone" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventTelephone()!=null?insolventPersoninfo.getInsolventTelephone():"" %>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventTelephoneValidation" style="color: red;">
								Please Enter Telephone No
								</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventTrnNumber">TRN # *</p>
								<input type="text" class="form-control" id="insolventTrnNumber" value="<%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventTrnNumber()!=null?insolventPersoninfo.getInsolventTrnNumber():"" %>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventTrnNumberValidation" style="color: red;">
								Please Enter TRN Number
								</p>
							</div> 
						</div>
						 <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" id="insolventAddress" class="form-control" maxlength="255"
								 placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=insolventPersoninfo!=null&&insolventPersoninfo.getInsolventAddress()!=null?insolventPersoninfo.getInsolventAddress():"" %></textarea>
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventAddressValidation" style="color: red;">
									Please Enter Address</p>
							</div>
						</div>
			        </div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="insolventDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="insolvent-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Please download and fill out Form 3 Statement of Affairs 
							and upload in the Supporting Documents Section
							</p>
						</div>
						<div class="col-md-12 cannabis-licence-process-content">
							<a class="bordered-link f2" href="https://104.200.102.32:108/documents/20123/714775/FORM+3+-+Statement+of+Affairs.pdf/f534a762-c6c7-6299-3cc6-b2194fdd431b?t=1707731926332" 
							target="_blank">
								Form 3
								<span class="ml-2"> 
									<svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg"> 
                   						<path d="M5 0V2H11.59L0 13.59L1.41 15L13 3.41V10H15V0H5Z" fill="#047247"></path> 
                  					</svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextWithoutSave(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="undersigned-info-form">
					<div class="row">
					 <div class="col-md-12"> 
                          <p class="tab-form-title f2">Assignment for the General Benefit of Creditors (Form 28)</p>
                          </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name *</p>
								<input type="text" class="form-control" id="creditorName" value="<%=applicantGeneralinfo!=null&&applicantGeneralinfo.getCreditorName()!=null?applicantGeneralinfo.getCreditorName():"" %>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="creditorNameValidation" style="color: red;">
									Please Enter Name</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="creditorDate" value="<%=applicantGeneralinfo!=null&&applicantGeneralinfo.getCreateDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(applicantGeneralinfo.getCreateDate()):"" %>"/>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" id="creditorAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=applicantGeneralinfo!=null&&applicantGeneralinfo.getCreditorAddress()!=null?applicantGeneralinfo.getCreditorAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
								The Undersigned, being an insolvent person, hereby assign all of my property to
								<span class="giluio creditorName"></span> to be administered for the
								general body of creditors in accordance with the Act. 
							</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Insolvent Person/Legal Representative</p>
							<%if(Validator.isNotNull(fileUrlApplicant)){ %>
							<div class="signature_texarea mb-2" id="creditorImageHolder">
							<img src="<%=fileUrlApplicant%>"  width="100" height="100"/>
								</div>
							<%}else{ %>
							<div class="signature_texarea mb-2" id="creditorImageHolder">
							</div>
							<%
								}
							%>
												
							<input type="file" id="creditorUploadBtn" hidden="" name="<portlet:namespace/>creditorUploadBtn">
							<label for="creditorUploadBtn" class="choose-sign-btn"> 
								<span class="mr-2">
									<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
										<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
									</svg>
							</span> Upload Signature
							</label>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="creditorDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="assignment-info-form">
					<div class="row">
					<div class="col-md-12"> 
                          <p class="tab-form-title f2">Application for Assignment(Form 27)</p>  
                         </div> 
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
							 	To The Supervisor of Insolvency 52-60 Grenada Crescent Kingston 5
								I,<span class="giluio indiName"></span>, hereby apply for the assignment of the property of
								<span class="giluio insolventCompanyName"></span> ("the insolvent person") for the general benefit of creditors
								 in form of the attached assignment. 
							</p>
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
							 	<p class="tab-form-title-subtitle f2">Attached are:</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="assignmentAttached1" <%=assignmentDetailinfo!=null&&assignmentDetailinfo.getSelectedAssignmentAttached()!=null&&assignmentDetailinfo.getSelectedAssignmentAttached().contains("Statement of Affairs")?"checked":"" %> value="Statement of Affairs" name="assignmentAttached"> 
									<label for="assignmentAttached1"> 
										<p class="tab-form-main-heading mb-0">Statement of Affairs(Form 3)</p> 
									</label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="assignmentAttached2" <%=assignmentDetailinfo!=null&&assignmentDetailinfo.getSelectedAssignmentAttached()!=null&&assignmentDetailinfo.getSelectedAssignmentAttached().contains("Form of Assignment")?"checked":"" %> value="Form of Assignment" name="assignmentAttached"> 
									<label for="assignmentAttached2"> 
										<p class="tab-form-main-heading mb-0">Form of Assignment(Form 28)</p> 
									</label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="assignmentAttached3" <%=assignmentDetailinfo!=null&&assignmentDetailinfo.getSelectedAssignmentAttached()!=null&&assignmentDetailinfo.getSelectedAssignmentAttached().contains("Resolution of the corporation authorizing the assignment")?"checked":"" %> value="Resolution of the corporation authorizing the assignment" name="assignmentAttached"> 
									<label for="assignmentAttached3"> 
										<p class="tab-form-main-heading mb-0">Resolution of the corporation authorizing the assignment</p> 
									</label> 
								</div>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<!-- <p class="tab-form-main-heading mb-0" for="indiv-mailingAddress">
									Mailing Address</p> -->
								<div class="checkbox-form-group">
									<input type="checkbox" <%=assignmentDetailinfo!=null&&assignmentDetailinfo.getTrusteeAct()!=null&&assignmentDetailinfo.getTrusteeAct().contains("on")?"checked":""%> id="trustee-act" name="trusteeWilling" /> <label
										for="trustee-act">
										<p class="tab-form-main-heading mb-0">*(I was unable to find a licensed trustee willing to act)</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name *</p>
								<input type="text" class="form-control" id="assignmentName" value="<%=assignmentDetailinfo!=null&&assignmentDetailinfo.getAssignmentName()!=null?assignmentDetailinfo.getAssignmentName():"" %>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="assignmentNameValidation" style="color: red;">
									Please Enter Name</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="dated">Date</p>
								<input type="date" class="form-control" id="assignmentDated" value="<%=assignmentDetailinfo!=null&&assignmentDetailinfo.getAssignmentDated()!=null?new SimpleDateFormat("yyyy-MM-dd").format(assignmentDetailinfo.getAssignmentDated()):"" %>"/>
							</div> 
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
							 	<span class="giluio assignmentName"></span> has agreed to act as trustee of the insolvent person's 
							 	bankruptcy estate.
							</p>
							<!-- <p class="tab-form-main-heading"> 
							 	*(I was unable to find a licensed trustee willing to act)
							</p> -->
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" id="assignmentAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=assignmentDetailinfo!=null&&assignmentDetailinfo.getAssignmentAddress()!=null?assignmentDetailinfo.getAssignmentAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Insolvent Person/Legal Representative</p>
							<div class="signature_texarea mb-2" id="insolventPersonImageHolder">
							<%if(Validator.isNotNull(fileUrlInsolvent)){ %>
							<img src="<%=fileUrlInsolvent%>"  width="100" height="100"/>
							<%} %>
							</div>					
							<input type="file" id="insolventPersonUploadBtn" hidden="" name="<portlet:namespace/>insolventPersonUploadBtn">
							<label for="insolventPersonUploadBtn" class="choose-sign-btn"> 
								<span class="mr-2">
									<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
										<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
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