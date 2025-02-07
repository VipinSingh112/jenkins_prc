<%@ include file="../../init.jsp" %>
<!-- Management System Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep45">
	<div class="tab-form">
		<div class="managemen-system-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">V. Management System Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<!-- <p class="tab-form-main-heading"><b>Management System Requirements</b></p> -->
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">20.0</span> Indicate the management system option currently 
							implemented within your organization [Clause 10.1] </p>
							<div class="wizard-form-radio mt-2">
								<input value="Option A" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getOptionFollow().equals("Option A")? "checked":StringPool.BLANK%>  name="managementImplementedWithOrgCerBodies"> <label
									for="managementImplementedWithOrgCerBodies">Option A</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="Option B" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getOptionFollow().equals("Option B")? "checked":StringPool.BLANK%>  name="managementImplementedWithOrgCerBodies"> <label
									for="managementImplementedWithOrgCerBodies">Option B</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">21.0</span> Has your organization established documentation for the 
					following requirements of the ISO/IEC 17024:2012 Standard? Indicate also, where in the management system manual or other suitable 
					documentation, the related document is referenced.</p>
					<p class="tab-form-main-heading">Documents/Processes/Procedures/Forms</p>
					<p class="tab-form-main-heading"><b>General Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqCerBodiesOne">1. Certification agreement 9.7.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertiAgreement().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesOne"> <label
									for="genReqCerBodiesOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertiAgreement().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesOne"> <label
									for="genReqCerBodiesOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerBodiesOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefCertiAgreement())?accCerBodyMngReqTwo.getQMRefCertiAgreement():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementRefCerBodiesAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach1"> 
														<label class="custom-upload" for="managementRefCerBodiesAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationAgreementDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationAgreementDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqCerBodiesTwo">2. Risk assessment - impartiality and mitigation measures 4.3.6, 4.3.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getRiskAssessment().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesTwo"> <label
									for="genReqCerBodiesTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getRiskAssessment().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesTwo"> <label
									for="genReqCerBodiesTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerBodiesTwo" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefRisk())?accCerBodyMngReqTwo.getQMRefRisk():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementRefCerBodiesAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach2"> 
														<label class="custom-upload" for="managementRefCerBodiesAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityMitigationMeasuresDoc)){ %>
												<span class="attach-detailed-overview"><%=impartialityMitigationMeasuresDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqCerBodiesThree">3. Confidentiality 7.3.1, 6.1.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getConfidentiality().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesThree"> <label
									for="genReqCerBodiesThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getConfidentiality().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesThree"> <label
									for="genReqCerBodiesThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerBodiesThree" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefConfidentiality())?accCerBodyMngReqTwo.getQMRefConfidentiality():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementRefCerBodiesAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach3"> 
														<label class="custom-upload" for="managementRefCerBodiesAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(confidentialityDoc)){ %>
												<span class="attach-detailed-overview"><%=confidentialityDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqCerBodiesFour">4. Security 7.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSecurity().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesFour"> <label
									for="genReqCerBodiesFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSecurity().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesFour"> <label
									for="genReqCerBodiesFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerBodiesFour" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefSecurity())?accCerBodyMngReqTwo.getQMRefSecurity():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementRefCerBodiesAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach4"> 
														<label class="custom-upload" for="managementRefCerBodiesAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(securityDoc)){ %>
												<span class="attach-detailed-overview"><%=securityDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading mb-0">5. Publicly available information</p>
				</div>
				<div class="col-md-12 ml-3">
					<div class="row">
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesFive">a. Scope of the certification scheme(s), including description of the certification process 7.2.2</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationScheme().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesFive"> <label
											for="genReqCerBodiesFive">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationScheme().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesFive"> <label
											for="genReqCerBodiesFive">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesFive" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefCertifiScheme())?accCerBodyMngReqTwo.getQMRefCertifiScheme():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach5"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach5"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(publiclyAvailableInformationDoc)){ %>
												<span class="attach-detailed-overview"><%=publiclyAvailableInformationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesSix">b. Valid certification and scope of that certification for examiners 7.2.1</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"  <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getValidCertification().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerBodiesSix"> <label
											for="genReqCerBodiesSix">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getValidCertification().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesSix"> <label
											for="genReqCerBodiesSix">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesSix" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefValidCertification())?accCerBodyMngReqTwo.getQMRefValidCertification():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach6"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach6"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(certificationExaminersDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationExaminersDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesSeven">c. List of all pre-requisites of the certification scheme 7.2.3.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getPreRequisites().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesSeven"> <label
											for="genReqCerBodiesSeven">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getPreRequisites().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesSeven"> <label
											for="genReqCerBodiesSeven">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesSeven" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefPrerequisites())?accCerBodyMngReqTwo.getQMRefPrerequisites():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach7"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach7"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
													<%if(Validator.isNotNull(PreRequisitesCertificationDoc)){ %>
												<span class="attach-detailed-overview"><%=PreRequisitesCertificationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesEight">d. Information provided by the certification body, including advertising 7.2.4.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getInfoProvided().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesEight"> <label
											for="genReqCerBodiesEight">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getInfoProvided().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesEight"> <label
											for="genReqCerBodiesEight">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesEight" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefInfoProvided())?accCerBodyMngReqTwo.getQMRefInfoProvided():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach8"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach8"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(bodyIncludingAdvertisingDoc)){ %>
												<span class="attach-detailed-overview"><%=bodyIncludingAdvertisingDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesNine">e. Policies and procedures for handling appeals 9.8.2</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getHandlingAppeals().equals("Yes")? "checked":StringPool.BLANK%>   name="genReqCerBodiesNine"> <label
											for="genReqCerBodiesNine">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getHandlingAppeals().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesNine"> <label
											for="genReqCerBodiesNine">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesNine" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefHandlingAppeals())?accCerBodyMngReqTwo.getQMRefHandlingAppeals():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach9"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach9"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
													<%if(Validator.isNotNull(policiesProceduresHandlingDoc)){ %>
												<span class="attach-detailed-overview"><%=policiesProceduresHandlingDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerBodiesTen">f. Procedures for handling complaints 9.9.3</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getHandlingComplaints().equals("Yes")? "checked":StringPool.BLANK%>  name="genReqCerBodiesTen"> <label
											for="genReqCerBodiesTen">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getHandlingComplaints().equals("No")? "checked":StringPool.BLANK%>  name="genReqCerBodiesTen"> <label
											for="genReqCerBodiesTen">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerBodiesTen" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefHandlingComplaint())?accCerBodyMngReqTwo.getQMRefHandlingComplaint():""%>" placeholder=""/>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="managementRefCerBodiesAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerBodiesAttach10"> 
																<label class="custom-upload" for="managementRefCerBodiesAttach10"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(proceduresHandlingComplaintsDoc)){ %>
												<span class="attach-detailed-overview"><%=proceduresHandlingComplaintsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Structural Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="structuralReqCerBodiesOne">6. Organizational structure showing duties, responsibilities and authorities of management and other certification personnel and any 
								committees 5.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getOrgStructure().equals("Yes")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesOne"> <label
									for="structuralReqCerBodiesOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getOrgStructure().equals("No")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesOne"> <label
									for="structuralReqCerBodiesOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerBodiesOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefOrgStructure())?accCerBodyMngReqTwo.getQMRefOrgStructure():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementStrucRefCerBodiesAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerBodiesAttach1"> 
														<label class="custom-upload" for="managementStrucRefCerBodiesAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(authoritiesManagementDoc)){ %>
												<span class="attach-detailed-overview"><%=authoritiesManagementDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="structuralReqCerBodiesTwo">7. Formal rules for the appointment, terms of reference and operation of any committees that are involved in the certification process 
								6.1.1 and 6.1.4, 6.2.3.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getFormalRules().equals("Yes")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesTwo"> <label
									for="structuralReqCerBodiesTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getFormalRules().equals("No")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesTwo"> <label
									for="structuralReqCerBodiesTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerBodiesTwo" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefFormalRules())?accCerBodyMngReqTwo.getQMRefFormalRules():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementStrucRefCerBodiesAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerBodiesAttach2"> 
														<label class="custom-upload" for="managementStrucRefCerBodiesAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(operationCommitteesDoc)){ %>
												<span class="attach-detailed-overview"><%=operationCommitteesDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="structuralReqCerBodiesThree">8. Mechanism for safeguarding impartiality 4.3.1, 5.1.1, 5.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSafeguardingMechanism().equals("Yes")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesThree"> <label
									for="structuralReqCerBodiesThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSafeguardingMechanism().equals("No")? "checked":StringPool.BLANK%>  name="structuralReqCerBodiesThree"> <label
									for="structuralReqCerBodiesThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerBodiesThree" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefSafeguarding())?accCerBodyMngReqTwo.getQMRefSafeguarding():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementStrucRefCerBodiesAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerBodiesAttach3"> 
														<label class="custom-upload" for="managementStrucRefCerBodiesAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(mechanismSafeguardingImpartialityDoc)){ %>
												<span class="attach-detailed-overview"><%=mechanismSafeguardingImpartialityDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Resource Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="resourceReqCerBodiesOne">9. Procedure for management of competencies of examiners involved in the certification process 6.1.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getManagementProc().equals("Yes")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesOne"> <label
									for="resourceReqCerBodiesOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getManagementProc().equals("No")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesOne"> <label
									for="resourceReqCerBodiesOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerBodiesOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefManagementProc())?accCerBodyMngReqTwo.getQMRefManagementProc():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementResourceRefCerBodiesAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerBodiesAttach1"> 
														<label class="custom-upload" for="managementResourceRefCerBodiesAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(competenciesExaminersDoc)){ %>
												<span class="attach-detailed-overview"><%=competenciesExaminersDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="resourceReqCerBodiesTwo">10. Contract with examiners (sample/template) .6.1.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getContractExaminer().equals("Yes")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesTwo"> <label
									for="resourceReqCerBodiesTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getContractExaminer().equals("No")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesTwo"> <label
									for="resourceReqCerBodiesTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerBodiesTwo" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefExaminer())?accCerBodyMngReqTwo.getQMRefExaminer():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementResourceRefCerBodiesAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerBodiesAttach2"> 
														<label class="custom-upload" for="managementResourceRefCerBodiesAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(contractExaminerSampleDoc)){ %>
												<span class="attach-detailed-overview"><%=contractExaminerSampleDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="resourceReqCerBodiesThree">11. Contract with the body that provides the outsourced service (sample/template) 6.3.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getContractBody().equals("Yes")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesThree"> <label
									for="resourceReqCerBodiesThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getContractBody().equals("No")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesThree"> <label
									for="resourceReqCerBodiesThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerBodiesThree" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefContractBody())?accCerBodyMngReqTwo.getQMRefContractBody():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementResourceRefCerBodiesAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerBodiesAttach3"> 
														<label class="custom-upload" for="managementResourceRefCerBodiesAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(providesOutsourcedServiceDoc)){ %>
												<span class="attach-detailed-overview"><%=providesOutsourcedServiceDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="resourceReqCerBodiesFour">12. Documented policies, procedures and records for the qualification, assessing and monitoring of all bodies that provide 
								outsourced work 6.3.2d</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocPolicies().equals("Yes")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesFour"> <label
									for="resourceReqCerBodiesFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocPolicies().equals("No")? "checked":StringPool.BLANK%>  name="resourceReqCerBodiesFour"> <label
									for="resourceReqCerBodiesFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerBodiesFour" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefDocPolicies())?accCerBodyMngReqTwo.getQMRefDocPolicies():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementResourceRefCerBodiesAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerBodiesAttach4"> 
														<label class="custom-upload" for="managementResourceRefCerBodiesAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(recordsQualificationDoc)){ %>
												<span class="attach-detailed-overview"><%=recordsQualificationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Process Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesOne">13. Reference to specified standards and other normative documents</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSpecifiedStandard().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesOne"> <label
									for="processReqCerBodiesOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSpecifiedStandard().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesOne"> <label
									for="processReqCerBodiesOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefSpecified())?accCerBodyMngReqTwo.getQMRefSpecified():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach1"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(otherNormativeDocumentsDoc)){ %>
												<span class="attach-detailed-overview"><%=otherNormativeDocumentsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesTwo">14. Application form (sample/template) 
								7.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getApplicationForm().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesTwo"> <label
									for="processReqCerBodiesTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getApplicationForm().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesTwo"> <label
									for="processReqCerBodiesTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesTwo" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefAppliForm())?accCerBodyMngReqTwo.getQMRefAppliForm():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach2"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(applicationSampleTemplateDoc)){ %>
												<span class="attach-detailed-overview"><%=applicationSampleTemplateDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesThree">15. Process for application review 9.1.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getApplicationReview().equals("Yes")? "checked":StringPool.BLANK%>   name="processReqCerBodiesThree"> <label
									for="processReqCerBodiesThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getApplicationReview().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesThree"> <label
									for="processReqCerBodiesThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesThree" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefAppliReview())?accCerBodyMngReqTwo.getQMRefAppliReview():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach3"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(processApplicationReviewDoc)){ %>
												<span class="attach-detailed-overview"><%=processApplicationReviewDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesFour">16. Plan for assessment process including recertification 9.2 and 9.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getAssessmentPlan().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesFour"> <label
									for="processReqCerBodiesFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getAssessmentPlan().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesFour"> <label
									for="processReqCerBodiesFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesFour" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefAssessmentPlan())?accCerBodyMngReqTwo.getQMRefAssessmentPlan():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach4"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(processIncludingRecertificationDoc)){ %>
												<span class="attach-detailed-overview"><%=processIncludingRecertificationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesFive">17. Examination process (sample/template) 9.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getExaminationProcess().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesFive"> <label
									for="processReqCerBodiesFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getExaminationProcess().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesFive"> <label
									for="processReqCerBodiesFive">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesFive" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefExamProcess())?accCerBodyMngReqTwo.getQMRefExamProcess():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach5"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(examinationProcessDoc)){ %>
												<span class="attach-detailed-overview"><%=examinationProcessDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesSix">18. Certification decision 9.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationDecision().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesSix"> <label
									for="processReqCerBodiesSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationDecision().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesSix"> <label
									for="processReqCerBodiesSix">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesSix" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefCertiDecision())?accCerBodyMngReqTwo.getQMRefCertiDecision():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach6"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationsDecisionDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationsDecisionDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesSeven">19. Certification documentation (sample/template) 9.4.7; 9.4.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationDoc().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesSeven"> <label
									for="processReqCerBodiesSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCertificationDoc().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesSeven"> <label
									for="processReqCerBodiesSeven">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesSeven" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefCertiDoc())?accCerBodyMngReqTwo.getQMRefCertiDoc():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach7"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationDocumentationDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationDocumentationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesEight">20. Procedure for the use of certificates, logos and marks 9.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getUseOfCertificates().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesEight"> <label
									for="processReqCerBodiesEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getUseOfCertificates().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesEight"> <label
									for="processReqCerBodiesEight">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesEight" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefUseOfCertificate())?accCerBodyMngReqTwo.getQMRefUseOfCertificate():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach8"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificatesLogosMarksDoc)){ %>
												<span class="attach-detailed-overview"><%=certificatesLogosMarksDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesNine">21. Suspension 9.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSuspension().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesNine"> <label
									for="processReqCerBodiesNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getSuspension().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesNine"> <label
									for="processReqCerBodiesNine">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesNine" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefSuspension())?accCerBodyMngReqTwo.getQMRefSuspension():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach9"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(suspensionsDoc)){ %>
												<span class="attach-detailed-overview"><%=suspensionsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="processReqCerBodiesTen">22. Process to receive, evaluate and make decisions on appeals and complaints. 9.8.1 and 9.9.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getProcessToReceive().equals("Yes")? "checked":StringPool.BLANK%>  name="processReqCerBodiesTen"> <label
									for="processReqCerBodiesTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getProcessToReceive().equals("No")? "checked":StringPool.BLANK%>  name="processReqCerBodiesTen"> <label
									for="processReqCerBodiesTen">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerBodiesTen" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefReceiveProcess())?accCerBodyMngReqTwo.getQMRefReceiveProcess():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementProcessRefCerBodiesAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerBodiesAttach10"> 
														<label class="custom-upload" for="managementProcessRefCerBodiesAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(decisionsAppealsComplaintsDoc)){ %>
												<span class="attach-detailed-overview"><%=decisionsAppealsComplaintsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row cer-bodies-option-a hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option A</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqOne">23. General management system documentation 10.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getGeneralManage().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqOne"> <label
									for="managementSystemCerBodiesReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getGeneralManage().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqOne"> <label
									for="managementSystemCerBodiesReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefGeneral())?accCerBodyMngReqTwo.getQMRefGeneral():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach1"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(generalManagementSystemDocumentationDoc)){ %>
												<span class="attach-detailed-overview"><%=generalManagementSystemDocumentationDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqTwo">24. Control of documents 10.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocControl().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqTwo"> <label
									for="managementSystemCerBodiesReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocControl().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqTwo"> <label
									for="managementSystemCerBodiesReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefTwo" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefDocControl())?accCerBodyMngReqTwo.getQMRefDocControl():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach2"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(controlDocumentsDoc)){ %>
												<span class="attach-detailed-overview"><%=controlDocumentsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqThree">25. Control of records 10.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getRecordControl().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqThree"> <label
									for="managementSystemCerBodiesReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getRecordControl().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqThree"> <label
									for="managementSystemCerBodiesReqThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefThree" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefRecControl())?accCerBodyMngReqTwo.getQMRefRecControl():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach3"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(controlRecordsDoc)){ %>
												<span class="attach-detailed-overview"><%=controlRecordsDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqFour">26. Management review 10.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getManageReview().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqFour"> <label
									for="managementSystemCerBodiesReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getManageReview().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqFour"> <label
									for="managementSystemCerBodiesReqFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefFour" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefManageReview())?accCerBodyMngReqTwo.getQMRefManageReview():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach4"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementReviewDoc3)){ %>
												<span class="attach-detailed-overview"><%=managementReviewDoc3%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqFive">27. Internal audits 10.2.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getInternalAudit().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqFive"> <label
									for="managementSystemCerBodiesReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getInternalAudit().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqFive"> <label
									for="managementSystemCerBodiesReqFive">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefFive" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefInternal())?accCerBodyMngReqTwo.getQMRefInternal():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach5"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(internalAuditsDoc17024)){ %>
												<span class="attach-detailed-overview"><%=internalAuditsDoc17024%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqSix">28. Corrective action 10.2.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCorrectiveAction().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqSix"> <label
									for="managementSystemCerBodiesReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getCorrectiveAction().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqSix"> <label
									for="managementSystemCerBodiesReqSix">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefSix" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefCorrective())?accCerBodyMngReqTwo.getQMRefCorrective():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach6"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(correctiveActionsDoc1)){ %>
												<span class="attach-detailed-overview"><%=correctiveActionsDoc1%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesReqSeven">29. Preventive action 10.2.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getPreventiveAction().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqSeven"> <label
									for="managementSystemCerBodiesReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getPreventiveAction().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesReqSeven"> <label
									for="managementSystemCerBodiesReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesRefSeven" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefPreventive())?accCerBodyMngReqTwo.getQMRefPreventive():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesRefAttach7"> 
														<label class="custom-upload" for="managementSystemCerBodiesRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(preventiveActionsDoc1)){ %>
												<span class="attach-detailed-overview"><%=preventiveActionsDoc1%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row cer-bodies-option-b hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option B - ISO 9001 </b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerBodiesBReqOne">30. Documentation in keeping with requirements of ISO 9001</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocInKeeping().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesBReqOne"> <label
									for="managementSystemCerBodiesBReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=accCerBodyMngReqTwo!=null &&accCerBodyMngReqTwo.getDocInKeeping().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCerBodiesBReqOne"> <label
									for="managementSystemCerBodiesBReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerBodiesBRefOne" value="<%=Validator.isNotNull(accCerBodyMngReqTwo)&&Validator.isNotNull(accCerBodyMngReqTwo.getQMRefDocInKeeping())?accCerBodyMngReqTwo.getQMRefDocInKeeping():""%>" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="managementSystemCerBodiesBRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerBodiesBRefAttach1"> 
														<label class="custom-upload" for="managementSystemCerBodiesBRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(keepingRequirementsIsoDoc)){ %>
												<span class="attach-detailed-overview"><%=keepingRequirementsIsoDoc%></span>
												<%}else{%>
												<span class="attach-detailed-overview"></span>
												<%}%>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="applicantInfo();accCerBodiesManagementSystemReq(false);"
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
<!-- Management System Requirements Form End-->