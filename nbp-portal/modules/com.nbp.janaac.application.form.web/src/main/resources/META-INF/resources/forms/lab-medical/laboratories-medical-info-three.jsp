<%@ include file="../../init.jsp" %>
<!-- Management System Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep7">
	<div class="tab-form">
		<div class="managemen-system-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">IV. Management System
						Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading">
						<b>Management System Requirements</b>
					</p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemOne">a)
								Has management established, documented, implemented and
								maintained a management system to support and demonstrate the
								consistent fulfilment of the requirements of this document.
								(8.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getManagementEstablished().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemOne">
								<label for="managementSystemOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getManagementEstablished().equals("No")? "checked":StringPool.BLANK%> name="managementSystemOne">
								<label for="managementSystemOne">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefOne" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefManagement())?mediLabManagementReq.getQMRefManagement():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach1"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="<portlet:namespace/>qualityManualRefAttach1"> <label
															class="custom-upload" for="qualityManualRefAttach1">
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
												<%if(Validator.isNotNull(hasManagementEstablishedDoc)){ %>
												<span class="attach-detailed-overview"><%=hasManagementEstablishedDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemTwo">b)
								Are persons doing work under the laboratory's control aware of
								relevant objectives and policies, their contribution to the
								effectiveness of the management system and the consequences of
								not conforming with the management system requirements (8.1.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPersonAware().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTwo">
								<label for="managementSystemTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPersonAware().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTwo">
								<label for="managementSystemTwo">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefTwo" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefPerson())?mediLabManagementReq.getQMRefPerson():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach2"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach2"> <label
															class="custom-upload" for="qualityManualRefAttach2">
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
												<%if(Validator.isNotNull(laboratoryControlAwareDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryControlAwareDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemThree">c)
								Does the laboratory ensure that the objectives and policies
								are acknowledged and implemented at all levels of the
								laboratory organization (8.2.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPoliciesAcknowledged().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemThree">
								<label for="managementSystemThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPoliciesAcknowledged().equals("No")? "checked":StringPool.BLANK%> name="managementSystemThree">
								<label for="managementSystemThree">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefThree" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefPolicies())?mediLabManagementReq.getQMRefPolicies():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach3"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach3"> <label
															class="custom-upload" for="qualityManualRefAttach3">
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
												<%if(Validator.isNotNull(ObjectivepoliciesDoc)){ %>
												<span class="attach-detailed-overview"><%=ObjectivepoliciesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemFour">d)
								Have the laboratory-controlled documents that relate to the
								fulfilment of the ISO 15189:2022 (8.3.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getControlledDocument().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemFour">
								<label for="managementSystemFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getControlledDocument().equals("No")? "checked":StringPool.BLANK%> name="managementSystemFour">
								<label for="managementSystemFour">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefFour" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefControlDoc())?mediLabManagementReq.getQMRefControlDoc():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach4"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach4"> <label
															class="custom-upload" for="qualityManualRefAttach4">
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
												<%if(Validator.isNotNull(laboratoryControlledDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryControlledDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemFive">e)
								Have the laboratory established and retained legible records
								(8.4.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLaboratoryEstablished().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemFive">
								<label for="managementSystemFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLaboratoryEstablished().equals("No")? "checked":StringPool.BLANK%> name="managementSystemFive">
								<label for="managementSystemFive">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefFive" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMReflabEstab())?mediLabManagementReq.getQMReflabEstab():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach5"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach5"> <label
															class="custom-upload" for="qualityManualRefAttach5">
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
											<%if(Validator.isNotNull(retainedLegibleRecordsDoc)){ %>
												<span class="attach-detailed-overview"><%=retainedLegibleRecordsDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemSix">f)
								Has the laboratory identify risks and opportunities for
								improvement associated with the laboratory activities (8.5.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getIdentifiedRisks().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemSix">
								<label for="managementSystemSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getIdentifiedRisks().equals("No")? "checked":StringPool.BLANK%> name="managementSystemSix">
								<label for="managementSystemSix">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefSix" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefRisks())?mediLabManagementReq.getQMRefRisks():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach6"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach6"> <label
															class="custom-upload" for="qualityManualRefAttach6">
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
												<%if(Validator.isNotNull(laboratoryActivitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryActivitiesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemSeven">g)
								Does the laboratory have personnel who, irrespective of other
								responsibilities, have the authority and resources needed to
								carry out their dutiesd (5.4.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getHavePersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemSeven">
								<label for="managementSystemSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getHavePersonnel().equals("No")? "checked":StringPool.BLANK%> name="managementSystemSeven">
								<label for="managementSystemSeven">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefSeven" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefPersonnel())?mediLabManagementReq.getQMRefPersonnel():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach7"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach7"> <label
															class="custom-upload" for="qualityManualRefAttach7">
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
												<%if(Validator.isNotNull(irrespectiveResponsibilitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=irrespectiveResponsibilitiesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementSystemEight">h)
								Does the laboratory authorize personnel to perform specific
								laboratory activities. (6.2..3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getAuthorizePersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemEight">
								<label for="managementSystemEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getAuthorizePersonnel().equals("No")? "checked":StringPool.BLANK%> name="managementSystemEight">
								<label for="managementSystemEight">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="qualityManualRefEight" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getQMRefAuthorize())?mediLabManagementReq.getQMRefAuthorize():""%>" placeholder="" />
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
														<input type="file" id="qualityManualRefAttach8"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="qualityManualRefAttach8"> <label
															class="custom-upload" for="qualityManualRefAttach8">
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
												<%if(Validator.isNotNull(laboratoryAuthorizePersonnelDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryAuthorizePersonnelDoc%></span>
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
					<p class="tab-form-main-heading">
						<b>Management Requirements</b>
					</p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementOne">a)
								Does the laboratory control documents (internal and external)
								that relate to the fulfilment of this document (8.3.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLabControlDocsFulfilment().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementOne">
								<label for="managementRquirementOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLabControlDocsFulfilment().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementOne">
								<label for="managementRquirementOne">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefOne" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefFulfil())?mediLabManagementReq.getOtherRefFulfil():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach1"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach1">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach1"> <span
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
												<%if(Validator.isNotNull(laboratoryControlDocumentsDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryControlDocumentsDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementTwo">b)
								Have the laboratory establish and retain legible records to
								demonstrate fulfilment of the requirements of this document.
								(8.4.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLegibleRecordsFulfil().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementTwo">
								<label for="managementRquirementTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLegibleRecordsFulfil().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementTwo">
								<label for="managementRquirementTwo">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefTwo" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefLegibleRec())?mediLabManagementReq.getOtherRefLegibleRec():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach2"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach2">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach2"> <span
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
												<%if(Validator.isNotNull(demonstrateFulfilmentDoc)){ %>
												<span class="attach-detailed-overview"><%=demonstrateFulfilmentDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementThree">c)
								Are procedures in place for the establishment and review of
								service agreements (6.7)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProceduresInPlace().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementThree"> <label
									for="managementRquirementThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProceduresInPlace().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementThree"> <label
									for="managementRquirementThree">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefThree" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefProcedure())?mediLabManagementReq.getOtherRefProcedure():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach3"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach3">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach3"> <span
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
												<%if(Validator.isNotNull(serviceAgreementDoc)){ %>
												<span class="attach-detailed-overview"><%=serviceAgreementDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementFour">d)
								Have the laboratory communicated its requirements to referral
								laboratories and consultants who provide interpretations and
								advice (6.8.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getCommunicatedRequirement().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementFour"> <label
									for="managementRquirementFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getCommunicatedRequirement().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementFour">
								<label for="managementRquirementFour">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefFour" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefRequirement())?mediLabManagementReq.getOtherRefRequirement():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach4"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach4">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach4"> <span
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
												<%if(Validator.isNotNull(interpretationAdviceDoc)){ %>
												<span class="attach-detailed-overview"><%=interpretationAdviceDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementFive">e)
								Is there a procedure for selection and purchasing of external
								services and supplies (6.8.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProcedureForSelection().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementFive"> <label
									for="managementRquirementFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProcedureForSelection().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementFive">
								<label for="managementRquirementFive">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefFive" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefSelection())?mediLabManagementReq.getOtherRefSelection():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach5"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach5">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach5"> <span
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
												<%if(Validator.isNotNull(serviceSuppliesDoc)){ %>
												<span class="attach-detailed-overview"><%=serviceSuppliesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementSix">f)
								Are arrangements in place to ensure effective resolution of
								complaints received from clients or other parties? (7.7)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getArrangementInPlace().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementSix">
								<label for="managementRquirementSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getArrangementInPlace().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementSix">
								<label for="managementRquirementSix">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefSix" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefArrange())?mediLabManagementReq.getOtherRefArrange():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach6"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach6">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach6"> <span
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
											<%if(Validator.isNotNull(complaintReceivedDoc)){ %>
												<span class="attach-detailed-overview"><%=complaintReceivedDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementSeven">g)
								Are there processes in place to ensure adequate control of
								nonconformities (7.5)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProceduresInPlace().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementSeven"> <label
									for="managementRquirementSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProceduresInPlace().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementSeven"> <label
									for="managementRquirementSeven">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefSeven" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefProcess())?mediLabManagementReq.getOtherRefProcess():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach7"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach7">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach7"> <span
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
												<%if(Validator.isNotNull(nonconformitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=nonconformitiesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementEight">h)
								Does the laboratory operate a programme of corrective action
								to eliminate causes of nonconformities (8.7)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLabOperateProgramme().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementEight"> <label
									for="managementRquirementEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getLabOperateProgramme().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementEight"> <label
									for="managementRquirementEight">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefEight" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefLabOperate())?mediLabManagementReq.getOtherRefLabOperate():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach8"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach8">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach8"> <span
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
												<%if(Validator.isNotNull(programmeCorrectiveDoc)){ %>
												<span class="attach-detailed-overview"><%=programmeCorrectiveDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementNine">i)
								Does the laboratory identify risks and opportunities for
								improvement associated with the laboratory activities (8.5)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getIdentifyOpportunities().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementNine"> <label
									for="managementRquirementNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getIdentifyOpportunities().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementNine">
								<label for="managementRquirementNine">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefNine" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefOpportunity())?mediLabManagementReq.getOtherRefOpportunity():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach9"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach9">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach9"> <span
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
												<%if(Validator.isNotNull(improvementAssociatedDoc)){ %>
												<span class="attach-detailed-overview"><%=improvementAssociatedDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading" id="managementRquirementTen">j)
								Has the laboratory established and retain legible records to
								demonstrate fulfilment of the requirements of this document?
								(8.4.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=mediLabManagementReq!=null &&mediLabManagementReq.getDemonstrateFulfilment().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementTen">
								<label for="managementRquirementTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getDemonstrateFulfilment().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementTen">
								<label for="managementRquirementTen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefTen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefDemonstrate())?mediLabManagementReq.getOtherRefDemonstrate():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach10"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach10">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach10"> <span
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
												<%if(Validator.isNotNull(retainLegibleDoc)){ %>
												<span class="attach-detailed-overview"><%=retainLegibleDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementRquirementEleven">k) Are arrangements in
								place to ensure the laboratory plan and implement the
								evaluation and internal audit processes for effective
								management of the quality system (8.8.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureLabPlan().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementEleven"> <label
									for="managementRquirementEleven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureLabPlan().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementEleven"> <label
									for="managementRquirementEleven">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefEleven" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefEnsurePlan())?mediLabManagementReq.getOtherRefEnsurePlan():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach11"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach11">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach11"> <span
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
												<%if(Validator.isNotNull(effectiveManagementDoc)){ %>
												<span class="attach-detailed-overview"><%=effectiveManagementDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementRquirementTwelve">l) Are arrangements in
								place for planned management reviews to ensure continued
								suitability, adequacy, effectiveness and support of the
								quality management system (8.9)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPlannedManageReview().equals("Yes")? "checked":StringPool.BLANK%> name="managementRquirementTwelve"> <label
									for="managementRquirementTwelve">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPlannedManageReview().equals("No")? "checked":StringPool.BLANK%> name="managementRquirementTwelve"> <label
									for="managementRquirementTwelve">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementReQualityManualRefTwelve" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getOtherRefPlanned())?mediLabManagementReq.getOtherRefPlanned():""%>" placeholder="" />
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
														<input type="file"
															id="managementReQualityManualRefAttach12"
															onchange="attachDetailed(this.id)" hidden=""
															multiple="" name="managementReQualityManualRefAttach12">
														<label class="custom-upload"
															for="managementReQualityManualRefAttach12"> <span
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
												<%if(Validator.isNotNull(suitabilityAdequacyDoc)){ %>
												<span class="attach-detailed-overview"><%=suitabilityAdequacyDoc%></span>
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
					<p class="tab-form-main-heading">
						<b>Management System - Resource and Process Requirements</b>
					</p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementOne">a) Does the
								laboratory have available personnel and support services
								necessary to manage and perform its activities(6.2.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getAvailablePersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="managementResourceRquirementOne"> <label
									for="managementResourceRquirementOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getAvailablePersonnel().equals("No")? "checked":StringPool.BLANK%> name="managementResourceRquirementOne"> <label
									for="managementResourceRquirementOne">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefOne" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefAvailable())?mediLabManagementReq.getManualRefAvailable():""%>" placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach1"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach1">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach1">
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
												<%if(Validator.isNotNull(servicesNecessaryDoc)){ %>
												<span class="attach-detailed-overview"><%=servicesNecessaryDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementTwo">b) Is a continuing
								education programme available to personnel who participate in
								managerial and technical processes. and the suitability of the
								programme and activities periodically reviewed (6.2.4)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEducationProgramme().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTwo"> <label
									for="managementResourceRquirementTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEducationProgramme().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTwo"> <label
									for="managementResourceRquirementTwo">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefTwo" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefEducation())?mediLabManagementReq.getManualRefEducation():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach2"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach2">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach2">
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
												<%if(Validator.isNotNull(participateManagerialDoc)){ %>
												<span class="attach-detailed-overview"><%=participateManagerialDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementThree">c) Are arrangements
								in place to ensure accommodation and environmental conditions
								provides quality, safety and efficacy of service to all users
								of the laboratory (6.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureAccomodation().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementThree"> <label
									for="managementResourceRquirementThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureAccomodation().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementThree"> <label
									for="managementResourceRquirementThree">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefThree" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefAccom())?mediLabManagementReq.getManualRefAccom():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach3"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach3">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach3">
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
												<%if(Validator.isNotNull(accommodationEnvironmentaltDoc)){ %>
												<span class="attach-detailed-overview"><%=accommodationEnvironmentaltDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementFour">d) Does the
								laboratory have processes in place for the selection,
								purchasing and management of equipment, reagents and
								consumables (6.4)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProcessForSelection().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFour"> <label
									for="managementResourceRquirementFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProcessForSelection().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFour"> <label
									for="managementResourceRquirementFour">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefFour" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefSelection())?mediLabManagementReq.getManualRefSelection():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach4"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach4">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach4">
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
												<%if(Validator.isNotNull(selectionPurchasingDoc)){ %>
												<span class="attach-detailed-overview"><%=selectionPurchasingDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementFive">e) Does the
								laboratory verify reagents and consumables before being put
								into use (6.6.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getVerifyReagents().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFive"> <label
									for="managementResourceRquirementFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getVerifyReagents().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFive"> <label
									for="managementResourceRquirementFive">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefFive" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefReagents())?mediLabManagementReq.getManualRefReagents():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach5"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach5">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach5">
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
												<%if(Validator.isNotNull(reagentsConsumablesDoc)){ %>
												<span class="attach-detailed-overview"><%=reagentsConsumablesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementSix">f) Does the
								laboratory have a documented procedure for pre-examination
								activities and are readily available(7.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getDocProcedure().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSix"> <label
									for="managementResourceRquirementSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getDocProcedure().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSix"> <label
									for="managementResourceRquirementSix">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefSix" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefDocProce())?mediLabManagementReq.getManualRefDocProce():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach6"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach6">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach6">
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
												<%if(Validator.isNotNull(preExaminationActivitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=preExaminationActivitiesDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementSeven">g) Have the
								laboratory selected and use examination methods which have
								been validated for their intended use to assure the clinical
								accuracy of the examination for patient testing?(7.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getUseExamMethods().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSeven"> <label
									for="managementResourceRquirementSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getUseExamMethods().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSeven"> <label
									for="managementResourceRquirementSeven">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefSeven" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefExam())?mediLabManagementReq.getManualRefExam():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach7"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach7">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach7">
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
												<%if(Validator.isNotNull(clinicalAccuracyDoc)){ %>
												<span class="attach-detailed-overview"><%=clinicalAccuracyDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementEight">h) Does the
								laboratory have a procedure for monitoring the validity of
								results?(7.3.7)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getMonitoringValidity().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEight"> <label
									for="managementResourceRquirementEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getMonitoringValidity().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEight"> <label
									for="managementResourceRquirementEight">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefEight" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefValidity())?mediLabManagementReq.getManualRefValidity():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach8"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach8">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach8">
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
												<%if(Validator.isNotNull(procedureMonitoringDoc)){ %>
												<span class="attach-detailed-overview"><%=procedureMonitoringDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementNine">i) Does the
								laboratory validate examination methods derived from none
								standardized methods?(7.3.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getValidateExam().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementNine"> <label
									for="managementResourceRquirementNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getValidateExam().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementNine"> <label
									for="managementResourceRquirementNine">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefNine" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefValidateExam())?mediLabManagementReq.getManualRefValidateExam():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach9"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach9">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach9">
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
												<%if(Validator.isNotNull(noneStandardizedMethodsDoc)){ %>
												<span class="attach-detailed-overview"><%=noneStandardizedMethodsDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementTen">j) Are measurement
								uncertainty for each measurement procedure determined,
								performance requirements defined and estimates regularly
								reviewed. (7.3.4)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getUncertainityReview().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTen"> <label
									for="managementResourceRquirementTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getUncertainityReview().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTen"> <label
									for="managementResourceRquirementTen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefTen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefUncertainity())?mediLabManagementReq.getManualRefUncertainity():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach10"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach10">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach10">
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
												<%if(Validator.isNotNull(measurementProcedureDeterminedDoc)){ %>
												<span class="attach-detailed-overview"><%=measurementProcedureDeterminedDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementEleven">k) Does the
								laboratory have procedures in place to prevent the release of
								results in the event of quality control failure. (7.3.7.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPreventResRelease().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEleven"> <label
									for="managementResourceRquirementEleven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPreventResRelease().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEleven"> <label
									for="managementResourceRquirementEleven">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefEleven" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefPrevent())?mediLabManagementReq.getManualRefPrevent():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach11"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach11">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach11">
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
												<%if(Validator.isNotNull(qualityControlFailureDoc)){ %>
												<span class="attach-detailed-overview"><%=qualityControlFailureDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementTwelve">l) Is there a
								programme for preventive maintenance of equipment?(6.4.5)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEquipmentMaintenance().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTwelve"> <label
									for="managementResourceRquirementTwelve">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEquipmentMaintenance().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementTwelve"> <label
									for="managementResourceRquirementTwelve">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefTwelve" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefMaintenance())?mediLabManagementReq.getManualRefMaintenance():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach12"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach12">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach12">
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
												<%if(Validator.isNotNull(preventiveMaintenanceDoc)){ %>
												<span class="attach-detailed-overview"><%=preventiveMaintenanceDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementThirteen">m) Does the
								laboratory have a procedure for the calibration of its
								equipment. (6.5.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEquipCalibration().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementThirteen"> <label
									for="managementResourceRquirementThirteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEquipCalibration().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementThirteen"> <label
									for="managementResourceRquirementThirteen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefThirteen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefCalibrat())?mediLabManagementReq.getManualRefCalibrat():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach13"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach13">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach13">
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
												<%if(Validator.isNotNull(procedureCalibrationDoc)){ %>
												<span class="attach-detailed-overview"><%=procedureCalibrationDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementFourteen">n) Does the
								laboratory operate a programme of interlaboratory
								comparison/proficiency testing (7.3.7.3)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProficencyTesting().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFourteen"> <label
									for="managementResourceRquirementFourteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getProficencyTesting().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFourteen"> <label
									for="managementResourceRquirementFourteen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefFourteen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefProfiTest())?mediLabManagementReq.getManualRefProfiTest():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach14"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach14">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach14">
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
												<%if(Validator.isNotNull(interLaboratoryComparisonDoc)){ %>
												<span class="attach-detailed-overview"><%=interLaboratoryComparisonDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementFifteen">o) Are
								arrangement in place to ensure quality and reliability of post
								examination processes (7.4)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPostExamReliabilty().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFifteen"> <label
									for="managementResourceRquirementFifteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getPostExamReliabilty().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementFifteen"> <label
									for="managementResourceRquirementFifteen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefFifteen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefPostExam())?mediLabManagementReq.getManualRefPostExam():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach15"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach15">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach15">
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
												<%if(Validator.isNotNull(postExaminationDoc)){ %>
												<span class="attach-detailed-overview"><%=postExaminationDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementSixteen">p) Do procedures
								exist for ensuring results are reported accurately, clearly,
								unambiguously and in accordance with any specific instructions
								(7.4.1.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getReportedAccurately().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSixteen"> <label
									for="managementResourceRquirementSixteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getReportedAccurately().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSixteen"> <label
									for="managementResourceRquirementSixteen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefSixteen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefReported())?mediLabManagementReq.getManualRefReported():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach16"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach16">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach16">
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
												<%if(Validator.isNotNull(reportedAccuratelyDoc)){ %>
												<span class="attach-detailed-overview"><%=reportedAccuratelyDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementSeventeen">q) Are
								responsibilities and procedures for how examination results
								are released for reporting, including by whom and to whom,
								specified?(7.4.1.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getResponsiblitySpecified().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSeventeen"> <label
									for="managementResourceRquirementSeventeen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getResponsiblitySpecified().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementSeventeen"> <label
									for="managementResourceRquirementSeventeen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefSeventeen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefSpecified())?mediLabManagementReq.getManualRefSpecified():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach17"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach17">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach17">
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
												<%if(Validator.isNotNull(responsibilitiesProceduresDoc)){ %>
												<span class="attach-detailed-overview"><%=responsibilitiesProceduresDoc%></span>
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
						<div class="form-group management-sys-req-medical">
							<p class="tab-form-main-heading"
								id="managementResourceRquirementEighteen">r) Does the
								laboratory ensure that the authorities and responsibilities
								for the management of the information systems are specified,
								including the maintenance and modification to the information
								systems that can affect patient care?. (7.6.2)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureAuthorities().equals("Yes")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEighteen"> <label
									for="managementResourceRquirementEighteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=mediLabManagementReq!=null &&mediLabManagementReq.getEnsureAuthorities().equals("No")? "checked":StringPool.BLANK%>
									name="managementResourceRquirementEighteen"> <label
									for="managementResourceRquirementEighteen">No</label>
							</div>
						</div>
						<div class="row qualityManualRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual Reference
										or Other Relevant Reference</p>
									<input type="text" class="form-control"
										id="managementResourceQualityManualRefEighteen" value="<%=Validator.isNotNull(mediLabManagementReq)&&Validator.isNotNull(mediLabManagementReq.getManualRefAuthorities())?mediLabManagementReq.getManualRefAuthorities():""%>"
										placeholder="" />
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
														<input type="file"
															id="managementResourceQualityManualRefAttach18"
															onchange="attachDetailed(this.id)" hidden=""
															multiple=""
															name="managementResourceQualityManualRefAttach18">
														<label class="custom-upload"
															for="managementResourceQualityManualRefAttach18">
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
												<%if(Validator.isNotNull(authoritiesAndResponsibilitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=authoritiesAndResponsibilitiesDoc%></span>
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
	<button type="button" id="saveName"
		onclick="accMediLabManagementSysReq(false);"
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