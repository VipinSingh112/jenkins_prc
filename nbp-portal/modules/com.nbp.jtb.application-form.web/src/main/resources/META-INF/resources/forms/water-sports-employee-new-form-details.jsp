<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@ include file="../init.jsp" %>
<div class="water-sports-employee-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep21">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for
								Watersports Employee's Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading">I hereby make application to be
								licensed to operate in the Tourist Industry as a</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Full Name of Applicant *</p>
								<input type="text" class="form-control"
									id="waterSportEmployeeApplicantName" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantName())?waterEmpLic.getApplicantName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="waterSportEmployeeApplicantNameValidation" style="color: red;">Please
									Enter Applicant Name</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address of Applicant</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="waterSportEmployeeAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantAddress())?waterEmpLic.getApplicantAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Age</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									id="waterSportEmployeeApplicantAge" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantAge())?waterEmpLic.getApplicantAge():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Nationality</p>
								<%-- <input type="text" class="form-control"
									id="waterSportEmployeeNationality" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantNationality())?waterEmpLic.getApplicantNationality():"" %>" /> --%>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control employee-nationality-list" name="pselect"
										id="waterSportEmployeeNationality">
										<option value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getApplicantNationality())?waterEmpLic.getApplicantNationality():"" %>">Please
											Select</option>
									</select>
								</div>
							</div>
						</div>
					</div>
					<div class="row jamaicaWorkPermitUploadBox hide"> 
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Has Work Permit Been
									Applied for</p> 
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="permitApplied" <%=waterEmpLic!=null &&waterEmpLic.getWorkPermitApplied().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="permitApplied" <%=waterEmpLic!=null &&waterEmpLic.getWorkPermitApplied().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="jamaicaWorkPermit"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="jamaicaWorkPermit">
													<label class="custom-upload" for="jamaicaWorkPermit">
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
											<%if(Validator.isNotNull(workPermitDoc)){%>
													<span class="attach-detailed-overview"><%=workPermitDoc%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
												<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 hide" id="date-application">
						  <div>
							<div class="form-group">
								<p class="tab-form-main-heading">Date of
										Application</p>
								<input type="date" class="form-control" id="WaterSportEmployessADate"
									max="9999-12-31" placeholder="" value="<%=waterEmpLic!=null&&waterEmpLic.getWorkPermitDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(waterEmpLic.getWorkPermitDate()):StringPool.BLANK %>">
							</div>
						</div>
					  </div>	
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Qualification/certification
								</p>
								<input type="text" class="form-control"
									id="WaterSportEmployessQualification" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getQualification())?waterEmpLic.getQualification():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Place of Employment</p>
								<input type="text" class="form-control"
									id="WaterSportEmployessEmployment" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getPlaceOfEmployment())?waterEmpLic.getPlaceOfEmployment():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner/manager</p>
								<input type="text" class="form-control"
									id="WaterSportEmployessOwnerNam" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getOwnerName())?waterEmpLic.getOwnerName():"" %>" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addWaterSportsEmployeeFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep22">
			<div class="tab-form">
				<div class="water-sport-employee-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading">I Declare That</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<div class="form-group">
									<p class="tab-form-main-heading">CPR</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" name="cpr" <%=waterEmpLic!=null &&waterEmpLic.getCpr().equals("I Am Qualified")?"checked":StringPool.BLANK%>>
											<label for="">I Am Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" name="cpr" <%=waterEmpLic!=null &&waterEmpLic.getCpr().equals("Not Qualified")?"checked":StringPool.BLANK%>>
											<label for="">Not Qualified</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">First Aid</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" name="firstAid" <%=waterEmpLic!=null &&waterEmpLic.getFirstAid().equals("I Am Qualified")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">I Am Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" name="firstAid" <%=waterEmpLic!=null &&waterEmpLic.getFirstAid().equals("Not Qualified")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">Not Qualified</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Medic First Aid</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" <%=waterEmpLic!=null &&waterEmpLic.getMedicFirstAid().equals("I Am Qualified")?"checked":StringPool.BLANK%>
												name="medicFirstAid"> <label for="">I Am
												Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" <%=waterEmpLic!=null &&waterEmpLic.getMedicFirstAid().equals("Not Qualified")?"checked":StringPool.BLANK%>
												name="medicFirstAid"> <label for="">Not
												Qualified</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">Rescue and Lifesaving
								Level of Qualification</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<div class="form-group">
									<p class="tab-form-main-heading">Life Guard</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" name="lifeguard" <%=waterEmpLic!=null &&waterEmpLic.getLifeguard().equals("I Am Qualified")?"checked":StringPool.BLANK%>>
											<label for="">I Am Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" name="lifeguard" <%=waterEmpLic!=null &&waterEmpLic.getLifeguard().equals("Not Qualified")?"checked":StringPool.BLANK%>>
											<label for="">Not Qualified</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Rescue Diver</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" name="rescueDiver" <%=waterEmpLic!=null &&waterEmpLic.getRescueDiver().equals("I Am Qualified")?"checked":StringPool.BLANK%>>
											<label for="">I Am Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" name="rescueDiver" <%=waterEmpLic!=null &&waterEmpLic.getRescueDiver().equals("Not Qualified")?"checked":StringPool.BLANK%>>
											<label for="">Not Qualified</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Other</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="I Am Qualified" type="radio" name="other" <%=waterEmpLic!=null &&waterEmpLic.getOtherRescue().equals("I Am Qualified")?"checked":StringPool.BLANK%>>
											<label for="">I Am Qualified</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="Not Qualified" type="radio" name="other" <%=waterEmpLic!=null &&waterEmpLic.getOtherRescue().equals("Not Qualified")?"checked":StringPool.BLANK%>>
											<label for="">Not Qualified</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">I State the Foregoing to
								the Best of My Knowledge and Belief</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Employee</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureWaterSportEmployeeImageHolder">
								<%if(Validator.isNotNull(waterEmpSign)){ %>
							<img src="<%=waterEmpSign%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureWaterSportEmployeeBtn"
								hidden=""
								name="<portlet:namespace/>applicantSignatureWaterSportEmployeeBtn">
							<label for="applicantSignatureWaterSportEmployeeBtn"
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
								<input type="date" class="form-control" id="WaterSportEmpSignDate"
									max="9999-12-31" placeholder="" value="<%=waterEmpLic!=null&&waterEmpLic.getEmployeeSignatureDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(waterEmpLic.getEmployeeSignatureDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Known the Applicant for a period of (months/years)</p>
								<input type="text" class="form-control"
									id="waterSportTimePeriod" placeholder="" value="<%=Validator.isNotNull(waterEmpLic)&&Validator.isNotNull(waterEmpLic.getTimePeriod())?waterEmpLic.getTimePeriod():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading f2">
									This is to certify that the applicant is to the best of my
									knowledge and belief a person of good character and sober
									habits and has been known to me for a period of <span
										class="giluio timePeriod"> </span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Letter of Justice of the Peace</p>
												</div>
												<div class="right">
													<input type="file" id="justicePeaceLetter" hidden="" name="<portlet:namespace/>justicePeaceLetter" 
													onchange="attachDetailed(this.id)">
													<label class="custom-upload" for="justicePeaceLetter">
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
											<%if(Validator.isNotNull(justicePeaceDoc)){%>
													<span class="attach-detailed-overview"><%=justicePeaceDoc%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<%-- <div class="col-md-12">
							<p class="common-para">Superintendent of Police or
								Justice of the Peace(Seal and Stamp)</p>
							<div class="signature_texarea mb-2" id="applicantStampWaterSportEmployeeImageHolder">
								<%if(Validator.isNotNull(justiceSeal)){ %>
								<img src="<%=justiceSeal%>"  width="100" height="100"/>
								<%} %>
								</div>
							<input type="file" id="applicantStampWaterSportEmployeeBtn"
								hidden=""
								name="<portlet:namespace/>applicantStampWaterSportEmployeeBtn">
							<label for="applicantStampWaterSportEmployeeBtn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Seal and Stamp
							</label>
						</div> --%>
						<%-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please attach copy of
									First-Aid, Lifesaving, CPR and/or any other certificates which
									you may possess along with one recent photograph</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="cpr-copy" onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="cpr-copy">
													<label class="custom-upload" for="cpr-copy">
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(cprCopy))?cprCopy:""%></span>
										</div>
									</div>
								</div>
							</div>
						</div> --%>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
