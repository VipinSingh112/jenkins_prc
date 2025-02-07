<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep52">
	<div class="tab-form">
		<div class="managemen-system-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">IV. Management System Requirements</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.0</span> Which option does your organization follow with respect to your management system?(CLAUSE 8.1.1)</p>
							<div class="wizard-form-radio mt-2">
								<input value="Option A" type="radio"<%=bodiesManageSys!=null &&bodiesManageSys.getOptionFollow().equals("Option A")? "checked":StringPool.BLANK%> name="managementSysOptionInsBodies"> <label
									for="managementSysOptionInsBodies">Option A</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="Option B" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getOptionFollow().equals("Option B")? "checked":StringPool.BLANK%> name="managementSysOptionInsBodies"> <label
									for="managementSysOptionInsBodies">Option B</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">17.0</span> <b>Has the inspection body documented the following requirements of the ISO/IEC 17020:2012 Standard? Note where this in referenced in your quality manual or elsewhere.</b></p>
					<p class="tab-form-main-heading"><b>Activities</b></p>
					<p class="tab-form-main-heading"><b>Management System Manual</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualOne">a. Manual Approval/Authorization</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=bodiesManageSys!=null &&bodiesManageSys.getManualApproval().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualOne"> <label
									for="manageSysManualOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=bodiesManageSys!=null &&bodiesManageSys.getManualApproval().equals("No")? "checked":StringPool.BLANK%> name="manageSysManualOne"> <label
									for="manageSysManualOne">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefOne" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefManual())?bodiesManageSys.getQMRefManual():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach1"> 
														<label class="custom-upload" for="manageSysManualRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(manualApprovalDoc)){ %>
												<span class="attach-detailed-overview"><%=manualApprovalDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualTwo">b. Relevant Policies: 8.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=bodiesManageSys!=null &&bodiesManageSys.getRelevantPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualTwo"> <label
									for="manageSysManualTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getRelevantPolicies().equals("No")? "checked":StringPool.BLANK%>name="manageSysManualTwo"> <label
									for="manageSysManualTwo">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefTwo" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefRelevant())?bodiesManageSys.getQMRefRelevant():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach2"> 
														<label class="custom-upload" for="manageSysManualRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(relevantPoliciesDoc)){ %>
												<span class="attach-detailed-overview"><%=relevantPoliciesDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualThree">c. Overall Objectives: 8.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getOverallObj().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualThree"> <label
									for="manageSysManualThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getOverallObj().equals("No")? "checked":StringPool.BLANK%> name="manageSysManualThree"> <label
									for="manageSysManualThree">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefThree" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefOverallObj())?bodiesManageSys.getQMRefOverallObj():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach3"> 
														<label class="custom-upload" for="manageSysManualRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(overallObjectivesDoc)){ %>
												<span class="attach-detailed-overview"><%=overallObjectivesDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualFour">d. References to Supporting Procedures: 8.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getSupportingProcedure().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualFour"> <label
									for="manageSysManualFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getSupportingProcedure().equals("No")? "checked":StringPool.BLANK%> name="manageSysManualFour"> <label
									for="manageSysManualFour">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefFour" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefSupporting())?bodiesManageSys.getQMRefSupporting():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach4"> 
														<label class="custom-upload" for="manageSysManualRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(supportingProcedureDoc)){ %>
												<span class="attach-detailed-overview"><%=supportingProcedureDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualFive">e. Roles & Responsibilities of Technical  Management: 5.2.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getTechnicalMangmnt().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualFive"> <label
									for="manageSysManualFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getTechnicalMangmnt().equals("No")? "checked":StringPool.BLANK%> name="manageSysManualFive"> <label
									for="manageSysManualFive">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefFive" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefTechnical())?bodiesManageSys.getQMRefTechnical():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach5"> 
														<label class="custom-upload" for="manageSysManualRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(technicalManagementDoc)){ %>
												<span class="attach-detailed-overview"><%=technicalManagementDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysManualSix">f. Documentation (e.g. Job Descriptions) for Managerial, Technical and Key Support Personnel involved in Inspection Activities: 5.2.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocumentation().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysManualSix"> <label
									for="manageSysManualSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocumentation().equals("No")? "checked":StringPool.BLANK%> name="manageSysManualSix"> <label
									for="manageSysManualSix">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysManualRefSix" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefDocumentation())?bodiesManageSys.getQMRefDocumentation():""%>" placeholder=""/>
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
														<input type="file" id="manageSysManualRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysManualRefAttach6"> 
														<label class="custom-upload" for="manageSysManualRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(inspectionActivitieDoc)){ %>
												<span class="attach-detailed-overview"><%=inspectionActivitieDoc%></span>
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
					<p class="tab-form-main-heading"><b>Management System Procedures - Management Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqOne">a. Document Control Procedure: 8.3.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocContolProc().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqOne"> <label
									for="manageSysReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocContolProc().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqOne"> <label
									for="manageSysReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefOne" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefDocControl())?bodiesManageSys.getQMRefDocControl():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach1"> 
														<label class="custom-upload" for="manageSysReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(documentControlProcedureDoc)){ %>
												<span class="attach-detailed-overview"><%=documentControlProcedureDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqTwo">b. Document Changes: 8.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocumntChanges().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqTwo"> <label
									for="manageSysReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getDocumntChanges().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqTwo"> <label
									for="manageSysReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefTwo" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefDocumntChanges())?bodiesManageSys.getQMRefDocumntChanges():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach2"> 
														<label class="custom-upload" for="manageSysReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(documentChangesDoc)){ %>
												<span class="attach-detailed-overview"><%=documentChangesDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqThree">c. Control of Quality & Inspection Records: 7.3.1, 8.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getControlOfQuality().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqThree"> <label
									for="manageSysReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getControlOfQuality().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqThree"> <label
									for="manageSysReqThree">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefThree" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefControl())?bodiesManageSys.getQMRefControl():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach3"> 
														<label class="custom-upload" for="manageSysReqRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(inspectionRecordsDoc)){ %>
												<span class="attach-detailed-overview"><%=inspectionRecordsDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqFour">d. Management Review 8.5.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getManagementReview().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqFour"> <label
									for="manageSysReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getManagementReview().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqFour"> <label
									for="manageSysReqFour">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefFour" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefManage())?bodiesManageSys.getQMRefManage():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach4"> 
														<label class="custom-upload" for="manageSysReqRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(managementReviewDoc)){ %>
												<span class="attach-detailed-overview"><%=managementReviewDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqFive">e. Internal Audits: 8.6.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsInternalAudits().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqFive"> <label
									for="manageSysReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsInternalAudits().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqFive"> <label
									for="manageSysReqFive">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefFive" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefInternalAudit())?bodiesManageSys.getQMRefInternalAudit():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach5"> 
														<label class="custom-upload" for="manageSysReqRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(internalAuditsDoc)){ %>
												<span class="attach-detailed-overview"><%=internalAuditsDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqSix">f. Corrective Actions: 8.7.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsCorrectiveAction().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqSix"> <label
									for="manageSysReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsCorrectiveAction().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqSix"> <label
									for="manageSysReqSix">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefSix" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefCorrect())?bodiesManageSys.getQMRefCorrect():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach6"> 
														<label class="custom-upload" for="manageSysReqRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(correctiveActionsDoc)){ %>
												<span class="attach-detailed-overview"><%=correctiveActionsDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysReqSeven">g. Preventive Actions: 8.8.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsPreventiveAction().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysReqSeven"> <label
									for="manageSysReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInsPreventiveAction().equals("No")? "checked":StringPool.BLANK%> name="manageSysReqSeven"> <label
									for="manageSysReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysReqRefSeven" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefPreventive())?bodiesManageSys.getQMRefPreventive():""%>" placeholder=""/>
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
														<input type="file" id="manageSysReqRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysReqRefAttach7"> 
														<label class="custom-upload" for="manageSysReqRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(preventiveActionsDoc)){ %>
												<span class="attach-detailed-overview"><%=preventiveActionsDoc%></span>
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
					<p class="tab-form-main-heading"><b>Management System Procedures - Resource Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysResourceReqOne">a. Personnel (Selection, Training, Authorizing, etc.): 6.1.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getPersonnel().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysResourceReqOne"> <label
									for="manageSysResourceReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getPersonnel().equals("No")? "checked":StringPool.BLANK%> name="manageSysResourceReqOne"> <label
									for="manageSysResourceReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysResourceReqRefOne" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefPersonnel())?bodiesManageSys.getQMRefPersonnel():""%>" placeholder=""/>
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
														<input type="file" id="manageSysResourceReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysResourceReqRefAttach1"> 
														<label class="custom-upload" for="manageSysResourceReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(personnelTrainingDoc)){ %>
												<span class="attach-detailed-overview"><%=personnelTrainingDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysResourceReqTwo">b. Equipment: 6.2.5, 6.2.14</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getEquipment().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysResourceReqTwo"> <label
									for="manageSysResourceReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getEquipment().equals("No")? "checked":StringPool.BLANK%> name="manageSysResourceReqTwo"> <label
									for="manageSysResourceReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysResourceReqRefTwo" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefEquip())?bodiesManageSys.getQMRefEquip():""%>" placeholder=""/>
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
														<input type="file" id="manageSysResourceReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysResourceReqRefAttach2"> 
														<label class="custom-upload" for="manageSysResourceReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(equipmentDoc)){ %>
												<span class="attach-detailed-overview"><%=equipmentDoc%></span>
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
					<p class="tab-form-main-heading"><b>Management System Procedures - Process Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysProcessReqOne">a. Inspection: 7.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInspection().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysProcessReqOne"> <label
									for="manageSysProcessReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getInspection().equals("No")? "checked":StringPool.BLANK%> name="manageSysProcessReqOne"> <label
									for="manageSysProcessReqOne">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysProcessReqRefOne" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefInspection())?bodiesManageSys.getQMRefInspection():""%>" placeholder=""/>
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
														<input type="file" id="manageSysProcessReqRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysProcessReqRefAttach1"> 
														<label class="custom-upload" for="manageSysProcessReqRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(inspectionBodiesProcessDoc)){ %>
												<span class="attach-detailed-overview"><%=inspectionBodiesProcessDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysProcessReqTwo">b. Contractual Arrangements with Clients: 
								7.1.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getContractualArrange().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysProcessReqTwo"> <label
									for="manageSysProcessReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getContractualArrange().equals("No")? "checked":StringPool.BLANK%> name="manageSysProcessReqTwo"> <label
									for="manageSysProcessReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysProcessReqRefTwo" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefContractual())?bodiesManageSys.getQMRefContractual():""%>" placeholder=""/>
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
														<input type="file" id="manageSysProcessReqRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysProcessReqRefAttach2"> 
														<label class="custom-upload" for="manageSysProcessReqRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(contractualArrangementsDoc)){ %>
												<span class="attach-detailed-overview"><%=contractualArrangementsDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysProcessReqThree">c. Handling of Inspection Items: 7.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getHandlingInsItem().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysProcessReqThree"> <label
									for="manageSysProcessReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getHandlingInsItem().equals("No")? "checked":StringPool.BLANK%> name="manageSysProcessReqThree"> <label
									for="manageSysProcessReqThree">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysProcessReqRefThree" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefHandling())?bodiesManageSys.getQMRefHandling():""%>" placeholder=""/>
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
														<input type="file" id="manageSysProcessReqRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysProcessReqRefAttach3"> 
														<label class="custom-upload" for="manageSysProcessReqRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(handlingInspectionDoc)){ %>
												<span class="attach-detailed-overview"><%=handlingInspectionDoc%></span>
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
						<div class="form-group management-sys-req-ins-bodies">
							<p class="tab-form-main-heading" id="manageSysProcessReqFour">d. Complaints & Appeals: 7.5.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getComplaintsAppeals().equals("Yes")? "checked":StringPool.BLANK%> name="manageSysProcessReqFour"> <label
									for="manageSysProcessReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio" <%=bodiesManageSys!=null &&bodiesManageSys.getComplaintsAppeals().equals("No")? "checked":StringPool.BLANK%> name="manageSysProcessReqFour"> <label
									for="manageSysProcessReqFour">No</label>
							</div>
						</div>
						<div class="row managementRefInsBodies hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="manageSysProcessReqRefFour" value="<%=Validator.isNotNull(bodiesManageSys)&&Validator.isNotNull(bodiesManageSys.getQMRefComplaints())?bodiesManageSys.getQMRefComplaints():""%>" placeholder=""/>
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
														<input type="file" id="manageSysProcessReqRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>manageSysProcessReqRefAttach4"> 
														<label class="custom-upload" for="manageSysProcessReqRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(complaintsAppealsDoc)){ %>
												<span class="attach-detailed-overview"><%=complaintsAppealsDoc%></span>
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
	<button type="button" id="saveName" onclick="accInsBodiesManagementSysReq(false);"
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