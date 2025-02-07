<%@ include file="../../init.jsp" %>
<!-- Management System Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep21">
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationOne">a) Policies and objectives for fulfilling the requirements of this 
							standard: 8.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPoliciesForFulfil().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCalibrationOne"> <label
									for="managementSystemCalibrationOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPoliciesForFulfil().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCalibrationOne"> <label
									for="managementSystemCalibrationOne">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefPolicies())?MediLabTestManageReq.getLabDocRefPolicies():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef1"> 
														<label class="custom-upload" for="calibrationLabDocRef1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(fulfillingRequirementsDoc)){ %>
												<span class="attach-detailed-overview"><%=fulfillingRequirementsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationTwo">b) Provisions for impartiality: 4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImpartialityProvision().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCalibrationTwo"> <label
									for="managementSystemCalibrationTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImpartialityProvision().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCalibrationTwo"> <label
									for="managementSystemCalibrationTwo">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCommitment())?MediLabTestManageReq.getLabDocRefCommitment():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef2"> 
														<label class="custom-upload" for="calibrationLabDocRef2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityProvisionsDoc)){ %>
												<span class="attach-detailed-overview"><%=impartialityProvisionsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationThree">c) Provisions for confidentiality: 4.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getConfidientialityProv().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCalibrationThree"> <label
									for="managementSystemCalibrationThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getConfidientialityProv().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCalibrationThree"> <label
									for="managementSystemCalibrationThree">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefConfid())?MediLabTestManageReq.getLabDocRefConfid():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef3"> 
														<label class="custom-upload" for="calibrationLabDocRef3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(provisionsConfidentialityDoc)){ %>
												<span class="attach-detailed-overview"><%=provisionsConfidentialityDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationFour">d) Evidence of commitment to development/implementation/continuous improvement of the management system: 8.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCommitmentEvidence().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCalibrationFour"> <label
									for="managementSystemCalibrationFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCommitmentEvidence().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCalibrationFour"> <label
									for="managementSystemCalibrationFour">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCommitment())?MediLabTestManageReq.getLabDocRefCommitment():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef4"> 
														<label class="custom-upload" for="calibrationLabDocRef4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(implementationContinuousDoc)){ %>
												<span class="attach-detailed-overview"><%=implementationContinuousDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationFive">e) Evidence of references to management system processes, systems records and other documentation: 8.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReferenceEvidence().equals("Yes")? "checked":StringPool.BLANK%>  name="managementSystemCalibrationFive"> <label
									for="managementSystemCalibrationFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReferenceEvidence().equals("No")? "checked":StringPool.BLANK%>  name="managementSystemCalibrationFive"> <label
									for="managementSystemCalibrationFive">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefReference())?MediLabTestManageReq.getLabDocRefReference():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef5"> 
														<label class="custom-upload" for="calibrationLabDocRef5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(evidenceReferencesDoc)){ %>
												<span class="attach-detailed-overview"><%=evidenceReferencesDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationSix">f) Documents describing roles, responsibilities and interrelationship of personnel who manage, perform and verify work affecting the results of laboratory activities: 5.5 b</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocDescribingRole().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCalibrationSix"> <label
									for="managementSystemCalibrationSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocDescribingRole().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCalibrationSix"> <label
									for="managementSystemCalibrationSix">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefDocDes())?MediLabTestManageReq.getLabDocRefDocDes():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef6"> 
														<label class="custom-upload" for="calibrationLabDocRef6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(responsibilitiesInterrelationshipDoc)){ %>
												<span class="attach-detailed-overview"><%=responsibilitiesInterrelationshipDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="managementSystemCalibrationSeven">g) Roles and responsibilities of personnel with responsibility for the management system: 5.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRolesofPersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemCalibrationSeven"> <label
									for="managementSystemCalibrationSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRolesofPersonnel().equals("No")? "checked":StringPool.BLANK%> name="managementSystemCalibrationSeven"> <label
									for="managementSystemCalibrationSeven">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRoles())?MediLabTestManageReq.getLabDocRefRoles():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocRef7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocRef7"> 
														<label class="custom-upload" for="calibrationLabDocRef7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(personnelResponsibilityDoc)){ %>
												<span class="attach-detailed-overview"><%=personnelResponsibilityDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocOne">a) Determination of competence requirements: 6.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCompetenceReq().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocOne"> <label
									for="calibrationManagSysReqResDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCompetenceReq().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocOne"> <label
									for="calibrationManagSysReqResDocOne">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCompetence())?MediLabTestManageReq.getLabDocRefCompetence():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef1"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(competenceRequirementsDoc)){ %>
												<span class="attach-detailed-overview"><%=competenceRequirementsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocTwo">b) Selection, training supervision, authorization and monitoring of personnel: 6.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSelectionOfPerson().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocTwo"> <label
									for="calibrationManagSysReqResDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSelectionOfPerson().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocTwo"> <label
									for="calibrationManagSysReqResDocTwo">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefSelection())?MediLabTestManageReq.getLabDocRefSelection():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef2"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(trainingSupervisionDoc)){ %>
												<span class="attach-detailed-overview"><%=trainingSupervisionDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocThree">c) Handling, transport, storage, use and planned maintenance of equipment: 6.4.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getHandlingEquip().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocThree"> <label
									for="calibrationManagSysReqResDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getHandlingEquip().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocThree"> <label
									for="calibrationManagSysReqResDocThree">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefHandling())?MediLabTestManageReq.getLabDocRefHandling():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef3"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(handlingTransportDoc)){ %>
												<span class="attach-detailed-overview"><%=handlingTransportDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocFour">d) Calibration programme: 6.4.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCalibrationProgram().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocFour"> <label
									for="calibrationManagSysReqResDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCalibrationProgram().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocFour"> <label
									for="calibrationManagSysReqResDocFour">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCalibrat())?MediLabTestManageReq.getLabDocRefCalibrat():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef4"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(calibrationProgrammeDoc)){ %>
												<span class="attach-detailed-overview"><%=calibrationProgrammeDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocFive">e) Defining, reviewing and approving the requirements for externally provided products and services: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getApprovingReq().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocFive"> <label
									for="calibrationManagSysReqResDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getApprovingReq().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocFive"> <label
									for="calibrationManagSysReqResDocFive">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefApproving())?MediLabTestManageReq.getLabDocRefApproving():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef5"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(reviewingApprovingDoc)){ %>
												<span class="attach-detailed-overview"><%=reviewingApprovingDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocSix">f) Selection, evaluation and monitoring performance of external providers of products and services: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getMonitorPerformance().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocSix"> <label
									for="calibrationManagSysReqResDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getMonitorPerformance().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocSix"> <label
									for="calibrationManagSysReqResDocSix">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefMonitor())?MediLabTestManageReq.getLabDocRefMonitor():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef6"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(selectionEvaluationDoc)){ %>
												<span class="attach-detailed-overview"><%=selectionEvaluationDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqResDocSeven">g) Ensuring that externally provided products and services conform to laboratory requirements and taking actions, where necessary: 6.6.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getEnsuringService().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocSeven"> <label
									for="calibrationManagSysReqResDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getEnsuringService().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqResDocSeven"> <label
									for="calibrationManagSysReqResDocSeven">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocResReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefEnsuring())?MediLabTestManageReq.getLabDocRefEnsuring():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocResReqRef7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocResReqRef7"> 
														<label class="custom-upload" for="calibrationLabDocResReqRef7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(laboratoryRequirementsDoc)){ %>
												<span class="attach-detailed-overview"><%=laboratoryRequirementsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocOne">a) Review of requests, tenders and contracts: 7.1. 1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReviewOfRequest().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocOne"> <label
									for="calibrationManagSysReqProcessDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getReviewOfRequest().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocOne"> <label
									for="calibrationManagSysReqProcessDocOne">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRequest())?MediLabTestManageReq.getLabDocRefRequest():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef1"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(tendersContractsDoc)){ %>
												<span class="attach-detailed-overview"><%=tendersContractsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocTwo">b) Procedures for laboratory: 7.2.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getProcedureForLab().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocTwo"> <label
									for="calibrationManagSysReqProcessDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getProcedureForLab().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocTwo"> <label
									for="calibrationManagSysReqProcessDocTwo">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefProcedure())?MediLabTestManageReq.getLabDocRefProcedure():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef2"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(proceduresLaboratoryDoc)){ %>
												<span class="attach-detailed-overview"><%=proceduresLaboratoryDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocThree">c) Calibration methods & validation: 7.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestMethodValidat().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocThree"> <label
									for="calibrationManagSysReqProcessDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestMethodValidat().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocThree"> <label
									for="calibrationManagSysReqProcessDocThree">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefTestMethod())?MediLabTestManageReq.getLabDocRefTestMethod():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef3"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(calibrationMethodsDoc)){ %>
												<span class="attach-detailed-overview"><%=calibrationMethodsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocFour">d) Reference to a sampling plan: 7.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSamplingPlan().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocFour"> <label
									for="calibrationManagSysReqProcessDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getSamplingPlan().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocFour"> <label
									for="calibrationManagSysReqProcessDocFour">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefSampling())?MediLabTestManageReq.getLabDocRefSampling():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef4"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(referenceSamplingPlanDoc)){ %>
												<span class="attach-detailed-overview"><%=referenceSamplingPlanDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocFive">e) Transportation, receipt, handling, protection, storage retention and disposal of calibration items: 7.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTransportationReciept().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocFive"> <label
									for="calibrationManagSysReqProcessDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTransportationReciept().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocFive"> <label
									for="calibrationManagSysReqProcessDocFive">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefTransport())?MediLabTestManageReq.getLabDocRefTransport():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef5"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(disposalCalibrationItemsDoc)){ %>
												<span class="attach-detailed-overview"><%=disposalCalibrationItemsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocSix">f) Uncertainty of measurement: 7.2.1.1, 7.6.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUncertainityMeasure().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocSix"> <label
									for="calibrationManagSysReqProcessDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUncertainityMeasure().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocSix"> <label
									for="calibrationManagSysReqProcessDocSix">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefUncertain())?MediLabTestManageReq.getLabDocRefUncertain():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef6"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(uncertaintyMeasurementDoc)){ %>
												<span class="attach-detailed-overview"><%=uncertaintyMeasurementDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocSeven">g) Monitoring the validity of calibration results: 7.7.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestResultValidity().equals("Yes")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqProcessDocSeven"> <label
									for="calibrationManagSysReqProcessDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getTestResultValidity().equals("No")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqProcessDocSeven"> <label
									for="calibrationManagSysReqProcessDocSeven">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocReftestResult())?MediLabTestManageReq.getLabDocReftestResult():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef7"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(validityCalibrationResultsDoc)){ %>
												<span class="attach-detailed-overview"><%=validityCalibrationResultsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocEight">h) Complaints: 7.9.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getComplaints().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocEight"> <label
									for="calibrationManagSysReqProcessDocEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getComplaints().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocEight"> <label
									for="calibrationManagSysReqProcessDocEight">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefEight" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefComplaints())?MediLabTestManageReq.getLabDocRefComplaints():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef8"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(complaintsReferenceLaboratoryDoc)){ %>
												<span class="attach-detailed-overview"><%=complaintsReferenceLaboratoryDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqProcessDocNine">i) Nonconforming work: 7.10.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getNonConformingWork().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocNine"> <label
									for="calibrationManagSysReqProcessDocNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getNonConformingWork().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqProcessDocNine"> <label
									for="calibrationManagSysReqProcessDocNine">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocProcessReqRefNine" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefNonConfirm())?MediLabTestManageReq.getLabDocRefNonConfirm():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocProcessReqRef9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocProcessReqRef9"> 
														<label class="custom-upload" for="calibrationLabDocProcessReqRef9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(nonconformingWorkDoc)){ %>
												<span class="attach-detailed-overview"><%=nonconformingWorkDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocOne">a) Unique identification of management system documents:8.3.2e</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUniqueIdentification().equals("Yes")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocOne"> <label
									for="calibrationManagSysReqManagementDocOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getUniqueIdentification().equals("No")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocOne"> <label
									for="calibrationManagSysReqManagementDocOne">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">b) Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefOne" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefUnique())?MediLabTestManageReq.getLabDocRefUnique():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef1"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(uniqueIdentificationDoc)){ %>
												<span class="attach-detailed-overview"><%=uniqueIdentificationDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocTwo">c) Identification of current revision status of documents: 8.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCurrentRevisionStatus().equals("Yes")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocTwo"> <label
									for="calibrationManagSysReqManagementDocTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"  <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCurrentRevisionStatus().equals("No")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocTwo"> <label
									for="calibrationManagSysReqManagementDocTwo">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefTwo" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCurrentRev())?MediLabTestManageReq.getLabDocRefCurrentRev():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef2"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(identificationCurrentRevisionDoc)){ %>
												<span class="attach-detailed-overview"><%=identificationCurrentRevisionDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocThree">d) Identification of document changes: 8.3.2c</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocChangeIdentify().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocThree"> <label
									for="calibrationManagSysReqManagementDocThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getDocChangeIdentify().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocThree"> <label
									for="calibrationManagSysReqManagementDocThree">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefThree" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefDocChange())?MediLabTestManageReq.getLabDocRefDocChange():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef3"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(identificationChangesDoc)){ %>
												<span class="attach-detailed-overview"><%=identificationChangesDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocFour">e) Reference to control of records: 8.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRecordControl().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocFour"> <label
									for="calibrationManagSysReqManagementDocFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getRecordControl().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocFour"> <label
									for="calibrationManagSysReqManagementDocFour">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefFour" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefRecordControl())?MediLabTestManageReq.getLabDocRefRecordControl():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef4"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(referenceRecordsDoc)){ %>
												<span class="attach-detailed-overview"><%=referenceRecordsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocFive">f) Reference to planned actions to address risks: 8.5.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPlannedAction().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocFive"> <label
									for="calibrationManagSysReqManagementDocFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getPlannedAction().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocFive"> <label
									for="calibrationManagSysReqManagementDocFive">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefFive" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefPlanned())?MediLabTestManageReq.getLabDocRefPlanned():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef5"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(plannedActionsRisksDoc)){ %>
												<span class="attach-detailed-overview"><%=plannedActionsRisksDoc%></span>
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
						<div class="form-group management-sys-req-calibration ">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocSix">g) Reference to identification of improvement opportunities and taking actions: 8.6</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImporvementOpportunity().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocSix"> <label
									for="calibrationManagSysReqManagementDocSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getImporvementOpportunity().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocSix"> <label
									for="calibrationManagSysReqManagementDocSix">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefSix" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefImprovement())?MediLabTestManageReq.getLabDocRefImprovement():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef6"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(improvementsOpportunitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=improvementsOpportunitiesDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocSeven">h) Reference to corrective action activities: 8.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCorrectiveAction().equals("Yes")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocSeven"> <label
									for="calibrationManagSysReqManagementDocSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getCorrectiveAction().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocSeven"> <label
									for="calibrationManagSysReqManagementDocSeven">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefSeven" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefCorrective())?MediLabTestManageReq.getLabDocRefCorrective():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef7"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(correctiveActionActivitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=correctiveActionActivitiesDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocEight">j) Internal audits: 8.8</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getInternalAudits().equals("Yes")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocEight"> <label
									for="calibrationManagSysReqManagementDocEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getInternalAudits().equals("No")? "checked":StringPool.BLANK%> name="calibrationManagSysReqManagementDocEight"> <label
									for="calibrationManagSysReqManagementDocEight">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefEight" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefInternal())?MediLabTestManageReq.getLabDocRefInternal():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef8"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(internalReferenceAuditsDoc)){ %>
												<span class="attach-detailed-overview"><%=internalReferenceAuditsDoc%></span>
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
						<div class="form-group management-sys-req-calibration">
							<p class="tab-form-main-heading" id="calibrationManagSysReqManagementDocNine">k) Management reviews: 8.9 1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getManagementReview().equals("Yes")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocNine"> <label
									for="calibrationManagSysReqManagementDocNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=MediLabTestManageReq!=null &&MediLabTestManageReq.getManagementReview().equals("No")? "checked":StringPool.BLANK%>  name="calibrationManagSysReqManagementDocNine"> <label
									for="calibrationManagSysReqManagementDocNine">No</label>
							</div>
						</div>
						<div class="row calibrationLabDocRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Reference to Laboratory Documentation</p>
									<input type="text" class="form-control" id="calibrationLabDocManagementReqRefNine" value="<%=Validator.isNotNull(MediLabTestManageReq)&&Validator.isNotNull(MediLabTestManageReq.getLabDocRefManagement())?MediLabTestManageReq.getLabDocRefManagement():""%>" placeholder=""/>
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
														<input type="file" id="calibrationLabDocManagementReqRef9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>calibrationLabDocManagementReqRef9"> 
														<label class="custom-upload" for="calibrationLabDocManagementReqRef9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementReviewsDoc)){ %>
												<span class="attach-detailed-overview"><%=managementReviewsDoc%></span>
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
	<button type="button" id="saveName" onclick="accMediLabCalibrationManagementSysReq(false);"
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