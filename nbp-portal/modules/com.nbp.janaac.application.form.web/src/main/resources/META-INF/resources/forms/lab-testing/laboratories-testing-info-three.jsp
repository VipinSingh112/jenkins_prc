<%@ include file="../../init.jsp" %>
<!-- Management System Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep14">
	<div class="tab-form">
		<div class="managemen-system-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Management System Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">20.0 </span>Has the laboratory documented the following requirements of the ISO/IEC 17025:2017 Standard?</p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingOne">a) Policies and objectives for fulfilling the requirements of this 
							standard: 8.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPoliciesForFulfil().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingOne"> <label
									for="managementSystemTestingOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPoliciesForFulfil().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingOne"> <label
									for="managementSystemTestingOne">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefPolicies())?MediLabTestManageReq.getLabDocRefPolicies():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach1"> 
														<label class="custom-upload" for="labDocRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(PoliciesObjectivesDoc)){ %>
												<span class="attach-detailed-overview"><%=PoliciesObjectivesDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingTwo">b) Provisions for impartiality: 4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImpartialityProvision().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingTwo"> <label
									for="managementSystemTestingTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImpartialityProvision().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingTwo"> <label
									for="managementSystemTestingTwo">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCommitment())?MediLabTestManageReq.getLabDocRefCommitment():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach2"> 
														<label class="custom-upload" for="labDocRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ProvisionsImpartialityDoc)){ %>
												<span class="attach-detailed-overview"><%=ProvisionsImpartialityDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingThree">c) Provisions for confidentiality: 4.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getConfidientialityProv().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingThree"> <label
									for="managementSystemTestingThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getConfidientialityProv().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingThree"> <label
									for="managementSystemTestingThree">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefConfid())?MediLabTestManageReq.getLabDocRefConfid():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach3"> 
														<label class="custom-upload" for="labDocRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ProvisionsConfidentialityDoc)){ %>
												<span class="attach-detailed-overview"><%=ProvisionsConfidentialityDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingFour">d) Evidence of commitment to development/implementation/continuous improvement of the management system: 8.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCommitmentEvidence().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingFour"> <label
									for="managementSystemTestingFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCommitmentEvidence().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingFour"> <label
									for="managementSystemTestingFour">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCommitment())?MediLabTestManageReq.getLabDocRefCommitment():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach4"> 
														<label class="custom-upload" for="labDocRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(developmentImplementDoc)){ %>
												<span class="attach-detailed-overview"><%=developmentImplementDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingFive">e) Evidence of references to management system processes, systems records and other documentation: 8.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReferenceEvidence().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingFive"> <label
									for="managementSystemTestingFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReferenceEvidence().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingFive"> <label
									for="managementSystemTestingFive">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefReference())?MediLabTestManageReq.getLabDocRefReference():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach5"> 
														<label class="custom-upload" for="labDocRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(evidenceReferencesDoc1)){ %>
												<span class="attach-detailed-overview"><%=evidenceReferencesDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingSix">f) Documents describing roles, responsibilities and interrelationship of personnel who manage, perform and verify work affecting the results of laboratory activities: 5.5 b</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocDescribingRole().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingSix"> <label
									for="managementSystemTestingSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocDescribingRole().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingSix"> <label
									for="managementSystemTestingSix">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefDocDes())?MediLabTestManageReq.getLabDocRefDocDes():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach6"> 
														<label class="custom-upload" for="labDocRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(laboratoryActivitiesTestDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryActivitiesTestDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managementSystemTestingSeven">g) Roles and responsibilities of personnel with responsibility for the management system: 5.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRolesofPersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemTestingSeven"> <label
									for="managementSystemTestingSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRolesofPersonnel().equals("No")? "checked":StringPool.BLANK%> name="managementSystemTestingSeven"> <label
									for="managementSystemTestingSeven">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRoles())?MediLabTestManageReq.getLabDocRefRoles():""%>" placeholder=""/>
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
														<input type="file" id="labDocRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocRefAttach7"> 
														<label class="custom-upload" for="labDocRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(personnelResponsibilityDoc1)){ %>
												<span class="attach-detailed-overview"><%=personnelResponsibilityDoc1%></span>
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
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Documentation - Resource Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocOne">a) Determination of competence requirements: 6.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCompetenceReq().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocOne"> <label
									for="managSysReqResDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCompetenceReq().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocOne"> <label
									for="managSysReqResDocOne">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCompetence())?MediLabTestManageReq.getLabDocRefCompetence():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach1"> 
														<label class="custom-upload" for="labDocResReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(determinationCompetenceDoc)){ %>
												<span class="attach-detailed-overview"><%=determinationCompetenceDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocTwo">b) Selection, training supervision, authorization and monitoring of personnel: 6.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSelectionOfPerson().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocTwo"> <label
									for="managSysReqResDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSelectionOfPerson().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocTwo"> <label
									for="managSysReqResDocTwo">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefSelection())?MediLabTestManageReq.getLabDocRefSelection():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach2"> 
														<label class="custom-upload" for="labDocResReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(monitoringPersonnelDoc)){ %>
												<span class="attach-detailed-overview"><%=monitoringPersonnelDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocThree">c) Handling, transport, storage, use and planned maintenance of equipment: 6.4.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getHandlingEquip().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocThree"> <label
									for="managSysReqResDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getHandlingEquip().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocThree"> <label
									for="managSysReqResDocThree">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefHandling())?MediLabTestManageReq.getLabDocRefHandling():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach3"> 
														<label class="custom-upload" for="labDocResReqRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(handlingTransportDoc1)){ %>
												<span class="attach-detailed-overview"><%=handlingTransportDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocFour">d) Calibration programme: 6.4.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCalibrationProgram().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocFour"> <label
									for="managSysReqResDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCalibrationProgram().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocFour"> <label
									for="managSysReqResDocFour">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCalibrat())?MediLabTestManageReq.getLabDocRefCalibrat():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach4"> 
														<label class="custom-upload" for="labDocResReqRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(calibrationProgrammeDoc1)){ %>
												<span class="attach-detailed-overview"><%=calibrationProgrammeDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocFive">e) Defining, reviewing and approving the requirements for externally provided products and services: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getApprovingReq().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocFive"> <label
									for="managSysReqResDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getApprovingReq().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocFive"> <label
									for="managSysReqResDocFive">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefApproving())?MediLabTestManageReq.getLabDocRefApproving():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach5"> 
														<label class="custom-upload" for="labDocResReqRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(reviewingApprovingDoc1)){ %>
												<span class="attach-detailed-overview"><%=reviewingApprovingDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocSix">f) Selection, evaluation and monitoring performance of external providers of products and services: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getMonitorPerformance().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocSix"> <label
									for="managSysReqResDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getMonitorPerformance().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocSix"> <label
									for="managSysReqResDocSix">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefMonitor())?MediLabTestManageReq.getLabDocRefMonitor():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach6"> 
														<label class="custom-upload" for="labDocResReqRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(selectionEvaluationDoc1)){ %>
												<span class="attach-detailed-overview"><%=selectionEvaluationDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqResDocSeven">g) Ensuring that externally provided products and services conform to laboratory requirements and taking actions, where necessary: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getEnsuringService().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqResDocSeven"> <label
									for="managSysReqResDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getEnsuringService().equals("No")? "checked":StringPool.BLANK%> name="managSysReqResDocSeven"> <label
									for="managSysReqResDocSeven">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocResReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefEnsuring())?MediLabTestManageReq.getLabDocRefEnsuring():""%>" placeholder=""/>
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
														<input type="file" id="labDocResReqRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocResReqRefAttach7"> 
														<label class="custom-upload" for="labDocResReqRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ensuringExternallyDoc)){ %>
												<span class="attach-detailed-overview"><%=ensuringExternallyDoc%></span>
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
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Documentation - Process Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocOne">a) Review of requests, tenders and contracts: 7.1. 1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReviewOfRequest().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocOne"> <label
									for="managSysReqProcessDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReviewOfRequest().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocOne"> <label
									for="managSysReqProcessDocOne">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRequest())?MediLabTestManageReq.getLabDocRefRequest():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach1"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(tendersContractsDoc1)){ %>
												<span class="attach-detailed-overview"><%=tendersContractsDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocTwo">b) Procedures for laboratory: 7.2.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getProcedureForLab().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocTwo"> <label
									for="managSysReqProcessDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getProcedureForLab().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocTwo"> <label
									for="managSysReqProcessDocTwo">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefProcedure())?MediLabTestManageReq.getLabDocRefProcedure():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach2"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(proceduresLaboratoryDoc1)){ %>
												<span class="attach-detailed-overview"><%=proceduresLaboratoryDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocThree">c) Test methods & validation: 7.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestMethodValidat().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocThree"> <label
									for="managSysReqProcessDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestMethodValidat().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocThree"> <label
									for="managSysReqProcessDocThree">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefTestMethod())?MediLabTestManageReq.getLabDocRefTestMethod():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach3"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(methodsValidationDoc)){ %>
												<span class="attach-detailed-overview"><%=methodsValidationDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocFour">d) Reference to a sampling plan: 7.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSamplingPlan().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocFour"> <label
									for="managSysReqProcessDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSamplingPlan().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocFour"> <label
									for="managSysReqProcessDocFour">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefSampling())?MediLabTestManageReq.getLabDocRefSampling():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach4"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(referenceSamplingDoc)){ %>
												<span class="attach-detailed-overview"><%=referenceSamplingDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocFive">e) Transportation, receipt, handling, protection, storage retention and disposal of test items: 7.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTransportationReciept().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocFive"> <label
									for="managSysReqProcessDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTransportationReciept().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocFive"> <label
									for="managSysReqProcessDocFive">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefTransport())?MediLabTestManageReq.getLabDocRefTransport():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach5"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(transportationReceiptDoc)){ %>
												<span class="attach-detailed-overview"><%=transportationReceiptDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocSix">f) Uncertainty of measurement: 7.2.1.1, 7.6.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUncertainityMeasure().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocSix"> <label
									for="managSysReqProcessDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUncertainityMeasure().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocSix"> <label
									for="managSysReqProcessDocSix">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefUncertain())?MediLabTestManageReq.getLabDocRefUncertain():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach6"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(uncertaintyMeasurementDoc1)){ %>
												<span class="attach-detailed-overview"><%=uncertaintyMeasurementDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocSeven">g) Monitoring the validity of test results: 7.7.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestResultValidity().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocSeven"> <label
									for="managSysReqProcessDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestResultValidity().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocSeven"> <label
									for="managSysReqProcessDocSeven">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocReftestResult())?MediLabTestManageReq.getLabDocReftestResult():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach7"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(monitoringValidityDoc)){ %>
												<span class="attach-detailed-overview"><%=monitoringValidityDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocEight">h)Complaints: 7.9.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getComplaints().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocEight"> <label
									for="managSysReqProcessDocEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getComplaints().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocEight"> <label
									for="managSysReqProcessDocEight">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefEight" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefComplaints())?MediLabTestManageReq.getLabDocRefComplaints():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach8"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(complaintsLaboratoryDoc)){ %>
												<span class="attach-detailed-overview"><%=complaintsLaboratoryDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqProcessDocNine">i) Nonconforming work: 7.10.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getNonConformingWork().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqProcessDocNine"> <label
									for="managSysReqProcessDocNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getNonConformingWork().equals("No")? "checked":StringPool.BLANK%> name="managSysReqProcessDocNine"> <label
									for="managSysReqProcessDocNine">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocProcessReqRefNine" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefNonConfirm())?MediLabTestManageReq.getLabDocRefNonConfirm():""%>" placeholder=""/>
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
														<input type="file" id="labDocProcessReqRefAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocProcessReqRefAttach9"> 
														<label class="custom-upload" for="labDocProcessReqRefAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(nonconformingWorkDoc1)){ %>
												<span class="attach-detailed-overview"><%=nonconformingWorkDoc1%></span>
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
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Procedures - Management Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocOne">a) Unique identification of management system documents:8.3.2e</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUniqueIdentification().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocOne"> <label
									for="managSysReqManagementDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUniqueIdentification().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocOne"> <label
									for="managSysReqManagementDocOne">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefUnique())?MediLabTestManageReq.getLabDocRefUnique():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach1"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(uniqueIdentificationDoc1)){ %>
												<span class="attach-detailed-overview"><%=uniqueIdentificationDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocTwo">b) Identification of current revision status of documents: 8.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCurrentRevisionStatus().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocTwo"> <label
									for="managSysReqManagementDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCurrentRevisionStatus().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocTwo"> <label
									for="managSysReqManagementDocTwo">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCurrentRev())?MediLabTestManageReq.getLabDocRefCurrentRev():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach2"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(identificationCurrentDoc)){ %>
												<span class="attach-detailed-overview"><%=identificationCurrentDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocThree">c) Identification of document changes: 8.3.2c</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocChangeIdentify().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocThree"> <label
									for="managSysReqManagementDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocChangeIdentify().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocThree"> <label
									for="managSysReqManagementDocThree">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefDocChange())?MediLabTestManageReq.getLabDocRefDocChange():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach3"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(identificationChangesDoc1)){ %>
												<span class="attach-detailed-overview"><%=identificationChangesDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocFour">d) Reference to control of records: 8.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRecordControl().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocFour"> <label
									for="managSysReqManagementDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRecordControl().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocFour"> <label
									for="managSysReqManagementDocFour">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRecordControl())?MediLabTestManageReq.getLabDocRefRecordControl():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach4"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(controlRecordsDoc1)){ %>
												<span class="attach-detailed-overview"><%=controlRecordsDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocFive">e) Reference to planned actions to address risks: 8.5.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPlannedAction().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocFive"> <label
									for="managSysReqManagementDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPlannedAction().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocFive"> <label
									for="managSysReqManagementDocFive">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefPlanned())?MediLabTestManageReq.getLabDocRefPlanned():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach5"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(addressRisksDoc)){ %>
												<span class="attach-detailed-overview"><%=addressRisksDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocSix">f) Reference to identification of improvement opportunities and taking actions: 8.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImporvementOpportunity().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocSix"> <label
									for="managSysReqManagementDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImporvementOpportunity().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocSix"> <label
									for="managSysReqManagementDocSix">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefImprovement())?MediLabTestManageReq.getLabDocRefImprovement():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach6"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(improvementOpportunitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=improvementOpportunitiesDoc%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocSeven">g) Reference to corrective action activities: 8.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCorrectiveAction().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocSeven"> <label
									for="managSysReqManagementDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCorrectiveAction().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocSeven"> <label
									for="managSysReqManagementDocSeven">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCorrective())?MediLabTestManageReq.getLabDocRefCorrective():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach7"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(correctiveActionActivitiesDoc1)){ %>
												<span class="attach-detailed-overview"><%=correctiveActionActivitiesDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocEight">h) Internal audits: 8.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getInternalAudits().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocEight"> <label
									for="managSysReqManagementDocEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getInternalAudits().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocEight"> <label
									for="managSysReqManagementDocEight">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefEight" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefInternal())?MediLabTestManageReq.getLabDocRefInternal():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach8"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(internalAuditsDoc1)){ %>
												<span class="attach-detailed-overview"><%=internalAuditsDoc1%></span>
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
						<div class="form-group management-sys-req-testing">
							<p class="tab-form-main-heading" id="managSysReqManagementDocNine">i) Management reviews: 8.9 1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getManagementReview().equals("Yes")? "checked":StringPool.BLANK%> name="managSysReqManagementDocNine"> <label
									for="managSysReqManagementDocNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getManagementReview().equals("No")? "checked":StringPool.BLANK%> name="managSysReqManagementDocNine"> <label
									for="managSysReqManagementDocNine">No</label>
							</div>
						</div>
						<div class="row labDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="labDocManagementReqRefNine" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefManagement())?MediLabTestManageReq.getLabDocRefManagement():""%>" placeholder=""/>
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
														<input type="file" id="labDocManagementReqRefAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>labDocManagementReqRefAttach9"> 
														<label class="custom-upload" for="labDocManagementReqRefAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementReviewsDoc1)){ %>
												<span class="attach-detailed-overview"><%=managementReviewsDoc1%></span>
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
	<button type="button" id="saveName" onclick="accMediLabTestManagementSysReq(false);"
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