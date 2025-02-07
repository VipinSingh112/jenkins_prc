<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep37">
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
							implemented within your organization [Clause 8.1] </p>
							<div class="wizard-form-radio mt-2">
								<input value="Option A" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getOptionFollow().equals("Option A")? "checked":StringPool.BLANK%> name="cerProductImplementedWithOrg"> <label
									for="cerProductImplementedWithOrg">Option A</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="Option B" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getOptionFollow().equals("Option B")? "checked":StringPool.BLANK%> name="cerProductImplementedWithOrg"> <label
									for="cerProductImplementedWithOrg">Option B</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">21.0</span> Has your organization established documentation for the 
					following requirements of the ISO/IEC 17065:2012 Standard? Indicate also where in the management system manual or other suitable documentation, the related document 
					is referenced.</p>
					<p class="tab-form-main-heading">Documents/Processes/Procedures/Forms</p>
					<p class="tab-form-main-heading"><b>General Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqCerProductOne">1. Certification agreement 4.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertiAgreement().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductOne"> <label
									for="genReqCerProductOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertiAgreement().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductOne"> <label
									for="genReqCerProductOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerProductOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefCertiAgreement())?manReqTwoInfo.getQMRefCertiAgreement():""%>" placeholder=""/>
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
														<input type="file" id="managementRefCerProductAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach1"> 
														<label class="custom-upload" for="managementRefCerProductAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(certificationAgreementDoc1)){ %>
												<span class="attach-detailed-overview"><%=certificationAgreementDoc1%></span>
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
							<p class="tab-form-main-heading" id="genReqCerProductTwo">2. Risk assessment - impartiality and mitigation measures 4.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getRiskAssessment().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductTwo"> <label
									for="genReqCerProductTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getRiskAssessment().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductTwo"> <label
									for="genReqCerProductTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerProductTwo" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefRisk())?manReqTwoInfo.getQMRefRisk():""%>" placeholder=""/>
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
														<input type="file" id="managementRefCerProductAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach2"> 
														<label class="custom-upload" for="managementRefCerProductAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(impartialityMitigationMeasuresDoc1)){ %>
												<span class="attach-detailed-overview"><%=impartialityMitigationMeasuresDoc1%></span>
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
							<p class="tab-form-main-heading" id="genReqCerProductThree">3. Confidentiality 4.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getConfidentiality().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductThree"> <label
									for="genReqCerProductThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getConfidentiality().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductThree"> <label
									for="genReqCerProductThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefCerProductThree" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefConfidentiality())?manReqTwoInfo.getQMRefConfidentiality():""%>" placeholder=""/>
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
														<input type="file" id="managementRefCerProductAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach3"> 
														<label class="custom-upload" for="managementRefCerProductAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(confidentialityQualityManualDoc)){ %>
												<span class="attach-detailed-overview"><%=confidentialityQualityManualDoc%></span>
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
					<p class="tab-form-main-heading mb-0">4. Publicly available information</p>
				</div>
				<div class="col-md-12 ml-3">
					<div class="row">
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="genReqCerProductFour">a. Certification scheme(s), including
										 evaluation procedures, rules etc. 4.6 a.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSecurity().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductFour"> <label
											for="genReqCerProductFour">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSecurity().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductFour"> <label
											for="genReqCerProductFour">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerProductFour" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefSecurity())?manReqTwoInfo.getQMRefSecurity():""%>" placeholder=""/>
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
																<input type="file" id="managementRefCerProductAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach4"> 
																<label class="custom-upload" for="managementRefCerProductAttach4"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
												<%if(Validator.isNotNull(publiclyAvailableInformationDoc1)){ %>
												<span class="attach-detailed-overview"><%=publiclyAvailableInformationDoc1%></span>
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
									<p class="tab-form-main-heading" id="genReqCerProductFive">b. Financial support and fees 
										charged 4.6 b.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationScheme().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductFive"> <label
											for="genReqCerProductFive">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationScheme().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductFive"> <label
											for="genReqCerProductFive">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerProductFive" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefCertifiScheme())?manReqTwoInfo.getQMRefCertifiScheme():""%>" placeholder=""/>
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
																<input type="file" id="managementRefCerProductAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach5"> 
																<label class="custom-upload" for="managementRefCerProductAttach5"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
												<%if(Validator.isNotNull(financialSupportFeesDoc)){ %>
												<span class="attach-detailed-overview"><%=financialSupportFeesDoc%></span>
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
									<p class="tab-form-main-heading" id="genReqCerProductSix">c. Rights and duties of applicants 
										and clients 4.6 c.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getValidCertification().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductSix"> <label
											for="genReqCerProductSix">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getValidCertification().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductSix"> <label
											for="genReqCerProductSix">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerProductSix" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefValidCertification())?manReqTwoInfo.getQMRefValidCertification():""%>" placeholder=""/>
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
																<input type="file" id="managementRefCerProductAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach6"> 
																<label class="custom-upload" for="managementRefCerProductAttach6"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(rightsDutiesApplicantsDoc)){ %>
												<span class="attach-detailed-overview"><%=rightsDutiesApplicantsDoc%></span>
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
									<p class="tab-form-main-heading" id="genReqCerProductSeven">d. Procedures for handling complaints 
										and appeals 4.6 d.</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getPreRequisites().equals("Yes")? "checked":StringPool.BLANK%> name="genReqCerProductSeven"> <label
											for="genReqCerProductSeven">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getPreRequisites().equals("No")? "checked":StringPool.BLANK%> name="genReqCerProductSeven"> <label
											for="genReqCerProductSeven">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementRefCerProductSeven" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefPrerequisites())?manReqTwoInfo.getQMRefPrerequisites():""%>" placeholder=""/>
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
																<input type="file" id="managementRefCerProductAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefCerProductAttach7"> 
																<label class="custom-upload" for="managementRefCerProductAttach7"> 
																	<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																			  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																					fill="#047247"></path> 
																			 </svg>
																	</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(handlingComplaintsAppealsDoc)){ %>
												<span class="attach-detailed-overview"><%=handlingComplaintsAppealsDoc%></span>
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
							<p class="tab-form-main-heading" id="structuralReqCerProductOne">5. Organizational structure showing duties, responsibilities and
								authorities of management and other certification personnel and any
								committees 5.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getOrgStructure().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqCerProductOne"> <label
									for="structuralReqCerProductOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getOrgStructure().equals("No")? "checked":StringPool.BLANK%> name="structuralReqCerProductOne"> <label
									for="structuralReqCerProductOne">No</label>
							</div>
						</div>
						
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerProductOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefOrgStructure())?manReqTwoInfo.getQMRefOrgStructure():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefCerProductAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerProductAttach1"> 
														<label class="custom-upload" for="managementStrucRefCerProductAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(dutiesResponsibilitiesAuthoritiesDoc)){ %>
												<span class="attach-detailed-overview"><%=dutiesResponsibilitiesAuthoritiesDoc%></span>
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
							<p class="tab-form-main-heading" id="structuralReqCerProductTwo">6. Formal rules for the appointment, terms of reference and operation
								of any committees that are involved in the certification process 5.1.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getFormalRules().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqCerProductTwo"> <label
									for="structuralReqCerProductTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getFormalRules().equals("No")? "checked":StringPool.BLANK%> name="structuralReqCerProductTwo"> <label
									for="structuralReqCerProductTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerProductTwo" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefFormalRules())?manReqTwoInfo.getQMRefFormalRules():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefCerProductAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerProductAttach2"> 
														<label class="custom-upload" for="managementStrucRefCerProductAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(termsReferenceOperationDoc)){ %>
												<span class="attach-detailed-overview"><%=termsReferenceOperationDoc%></span>
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
							<p class="tab-form-main-heading" id="structuralReqCerProductThree">7. Mechanism for safeguarding impartiality 5.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSafeguardingMechanism().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqCerProductThree"> <label
									for="structuralReqCerProductThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSafeguardingMechanism().equals("No")? "checked":StringPool.BLANK%> name="structuralReqCerProductThree"> <label
									for="structuralReqCerProductThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefCerProductThree" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefSafeguarding())?manReqTwoInfo.getQMRefSafeguarding():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefCerProductAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefCerProductAttach3"> 
														<label class="custom-upload" for="managementStrucRefCerProductAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(mechanismSafeguardingImpartialityDoc1)){ %>
												<span class="attach-detailed-overview"><%=mechanismSafeguardingImpartialityDoc1%></span>
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
							<p class="tab-form-main-heading" id="resourceReqCerProductOne">8. Procedure for management of competencies of personnel involved
								in the certification process 6.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getManagementProc().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqCerProductOne"> <label
									for="resourceReqCerProductOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getManagementProc().equals("No")? "checked":StringPool.BLANK%> name="resourceReqCerProductOne"> <label
									for="resourceReqCerProductOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerProductOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefManagementProc())?manReqTwoInfo.getQMRefManagementProc():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefCerProductAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerProductAttach1"> 
														<label class="custom-upload" for="managementResourceRefCerProductAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(competenciesPersonnelInvolvedDoc)){ %>
												<span class="attach-detailed-overview"><%=competenciesPersonnelInvolvedDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqCerProductTwo">9. Contract with personnel (sample/template) 6.1.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getContractExaminer().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqCerProductTwo"> <label
									for="resourceReqCerProductTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getContractExaminer().equals("No")? "checked":StringPool.BLANK%> name="resourceReqCerProductTwo"> <label
									for="resourceReqCerProductTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerProductTwo" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefExaminer())?manReqTwoInfo.getQMRefExaminer():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefCerProductAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerProductAttach2"> 
														<label class="custom-upload" for="managementResourceRefCerProductAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(contractPersonnelSampleDoc)){ %>
												<span class="attach-detailed-overview"><%=contractPersonnelSampleDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqCerProductThree">10. Contract with the body that provides the outsourced service
								(sample/template) 6.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getContractBody().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqCerProductThree"> <label
									for="resourceReqCerProductThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getContractBody().equals("No")? "checked":StringPool.BLANK%> name="resourceReqCerProductThree"> <label
									for="resourceReqCerProductThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerProductThree" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefContractBody())?manReqTwoInfo.getQMRefContractBody():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefCerProductAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerProductAttach3"> 
														<label class="custom-upload" for="managementResourceRefCerProductAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(outsourcedServiceDoc)){ %>
												<span class="attach-detailed-overview"><%=outsourcedServiceDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqCerProductFour">11. Documented policies, procedures and records for the qualification,
								assessing and monitoring of all bodies that provide outsourced
								services 6.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqCerProductFour"> <label
									for="resourceReqCerProductFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocPolicies().equals("No")? "checked":StringPool.BLANK%> name="resourceReqCerProductFour"> <label
									for="resourceReqCerProductFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefCerProductFour" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefDocPolicies())?manReqTwoInfo.getQMRefDocPolicies():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefCerProductAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefCerProductAttach4"> 
														<label class="custom-upload" for="managementResourceRefCerProductAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(qualificationAssessingDoc)){ %>
												<span class="attach-detailed-overview"><%=qualificationAssessingDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductOne">12. Reference to specified standards and 
								other normative documents 7.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSpecifiedStandard().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductOne"> <label
									for="processReqCerProductOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSpecifiedStandard().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductOne"> <label
									for="processReqCerProductOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefSpecified())?manReqTwoInfo.getQMRefSpecified():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach1"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(normativeDocumentsDoc)){ %>
												<span class="attach-detailed-overview"><%=normativeDocumentsDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductTwo">13. Application form (sample/template) 7.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getApplicationForm().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductTwo"> <label
									for="processReqCerProductTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getApplicationForm().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductTwo"> <label
									for="processReqCerProductTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductTwo" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefAppliForm())?manReqTwoInfo.getQMRefAppliForm():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach2"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(applicationTemplateDoc)){ %>
												<span class="attach-detailed-overview"><%=applicationTemplateDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductThree">14. Process for application review 7.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getApplicationReview().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductThree"> <label
									for="processReqCerProductThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getApplicationReview().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductThree"> <label
									for="processReqCerProductThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductThree" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefAppliReview())?manReqTwoInfo.getQMRefAppliReview():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach3"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(processApplicationReviewDoc17065)){ %>
												<span class="attach-detailed-overview"><%=processApplicationReviewDoc17065%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductFour">15. Process to identify when the client's 
								request for certification includes product, normatour document, or certification scheme with 
								which the certification body has no prior experience 7.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getAssessmentPlan().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductFour"> <label
									for="processReqCerProductFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getAssessmentPlan().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductFour"> <label
									for="processReqCerProductFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductFour" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefAssessmentPlan())?manReqTwoInfo.getQMRefAssessmentPlan():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach4"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationIncludesProductDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationIncludesProductDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductFive">16. Plan for evaluation activities 7.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getProcessToReceive().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductFive"> <label
									for="processReqCerProductFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getProcessToReceive().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductFive"> <label
									for="processReqCerProductFive">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductFive" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefReceiveProcess())?manReqTwoInfo.getQMRefReceiveProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach5"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(planEvaluationActivitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=planEvaluationActivitiesDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductSix">17. Evaluation review and (sample/template) 7.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getExaminationProcess().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductSix"> <label
									for="processReqCerProductSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getExaminationProcess().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductSix"> <label
									for="processReqCerProductSix">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductSix" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefExamProcess())?manReqTwoInfo.getQMRefExamProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach6"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(evaluationReviewSampleDoc)){ %>
												<span class="attach-detailed-overview"><%=evaluationReviewSampleDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductSeven">18. Certification decision 7.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationDecision().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductSeven"> <label
									for="processReqCerProductSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationDecision().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductSeven"> <label
									for="processReqCerProductSeven">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductSeven" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefCertiDecision())?manReqTwoInfo.getQMRefCertiDecision():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach7"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationDecisionDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationDecisionDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductEight">19. Certification documentation 
								(sample/template) 7.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationDoc().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductEight"> <label
									for="processReqCerProductEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCertificationDoc().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductEight"> <label
									for="processReqCerProductEight">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductEight" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefCertiDoc())?manReqTwoInfo.getQMRefCertiDoc():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach8"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationDocumentationSampleDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationDocumentationSampleDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductNine">20. Directory of certified clients 7.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSuspension().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductNine"> <label
									for="processReqCerProductNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getSuspension().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductNine"> <label
									for="processReqCerProductNine">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductNine" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefSuspension())?manReqTwoInfo.getQMRefSuspension():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach9"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(directoryCertifiedClientsDoc)){ %>
												<span class="attach-detailed-overview"><%=directoryCertifiedClientsDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqCerProductTen">21. Process to receive, evaluate and make 
								decisions on complaints and appeals. 7.13</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getProcessToReceive().equals("Yes")? "checked":StringPool.BLANK%> name="processReqCerProductTen"> <label
									for="processReqCerProductTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getProcessToReceive().equals("No")? "checked":StringPool.BLANK%> name="processReqCerProductTen"> <label
									for="processReqCerProductTen">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefCerProductTen" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefReceiveProcess())?manReqTwoInfo.getQMRefReceiveProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefCerProductAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefCerProductAttach10"> 
														<label class="custom-upload" for="managementProcessRefCerProductAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(decisionsComplaintsAppealsDoc)){ %>
												<span class="attach-detailed-overview"><%=decisionsComplaintsAppealsDoc%></span>
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
			<div class="row cer-product-option-a hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option A</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerProductReqOne">22. General management system 
								documentation 8.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getGeneralManage().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqOne"> <label
									for="managementSystemCerProductReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getGeneralManage().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqOne"> <label
									for="managementSystemCerProductReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefGeneral())?manReqTwoInfo.getQMRefGeneral():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach1"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(generalManagementSystemDoc)){ %>
												<span class="attach-detailed-overview"><%=generalManagementSystemDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqTwo">23. Control of documents 8.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocControl().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqTwo"> <label
									for="managementSystemCerProductReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocControl().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqTwo"> <label
									for="managementSystemCerProductReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefTwo" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefDocControl())?manReqTwoInfo.getQMRefDocControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach2"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(controlDocumentsDoc1)){ %>
												<span class="attach-detailed-overview"><%=controlDocumentsDoc1%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqThree">24. Control of records 8.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getRecordControl().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqThree"> <label
									for="managementSystemCerProductReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getRecordControl().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqThree"> <label
									for="managementSystemCerProductReqThree">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefThree" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefRecControl())?manReqTwoInfo.getQMRefRecControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach3"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(controlRecordsDoc17065)){ %>
												<span class="attach-detailed-overview"><%=controlRecordsDoc17065%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqFour">25. Management review 8.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getManageReview().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqFour"> <label
									for="managementSystemCerProductReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getManageReview().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqFour"> <label
									for="managementSystemCerProductReqFour">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefFour" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefManageReview())?manReqTwoInfo.getQMRefManageReview():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach4"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementReviewDoc2)){ %>
												<span class="attach-detailed-overview"><%=managementReviewDoc2%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqFive">26. Internal audits 8.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getInternalAudit().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqFive"> <label
									for="managementSystemCerProductReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getInternalAudit().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqFive"> <label
									for="managementSystemCerProductReqFive">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefFive" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefInternal())?manReqTwoInfo.getQMRefInternal():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach5"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(internalAuditManageDoc)){ %>
												<span class="attach-detailed-overview"><%=internalAuditManageDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqSix">27. Corrective action 8.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCorrectiveAction().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqSix"> <label
									for="managementSystemCerProductReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getCorrectiveAction().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqSix"> <label
									for="managementSystemCerProductReqSix">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefSix" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefCorrective())?manReqTwoInfo.getQMRefCorrective():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach6"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(correctiveManageActionDoc)){ %>
												<span class="attach-detailed-overview"><%=correctiveManageActionDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemCerProductReqSeven">28. Preventive action 8.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getPreventiveAction().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqSeven"> <label
									for="managementSystemCerProductReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getPreventiveAction().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductReqSeven"> <label
									for="managementSystemCerProductReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductRefSeven" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefPreventive())?manReqTwoInfo.getQMRefPreventive():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductRefAttach7"> 
														<label class="custom-upload" for="managementSystemCerProductRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(preventiveManageActionDoc)){ %>
												<span class="attach-detailed-overview"><%=preventiveManageActionDoc%></span>
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
			<div class="row cer-product-option-b hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option B - ISO 9001 </b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemCerProductBReqOne">29. Documentation in keeping with 
								requirements of ISO 9001</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocInKeeping().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCerProductBReqOne"> <label
									for="managementSystemCerProductBReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=manReqTwoInfo!=null &&manReqTwoInfo.getDocInKeeping().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCerProductBReqOne"> <label
									for="managementSystemCerProductBReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefCerProduct hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemCerProductBRefOne" value="<%=Validator.isNotNull(manReqTwoInfo)&&Validator.isNotNull(manReqTwoInfo.getQMRefDocInKeeping())?manReqTwoInfo.getQMRefDocInKeeping():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemCerProductBRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemCerProductBRefAttach1"> 
														<label class="custom-upload" for="managementSystemCerProductBRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(keepingRequirementsDoc)){ %>
												<span class="attach-detailed-overview"><%=keepingRequirementsDoc%></span>
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
	<button type="button" id="saveName" onclick="accCerBodyProductManageSysReq(false);"
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