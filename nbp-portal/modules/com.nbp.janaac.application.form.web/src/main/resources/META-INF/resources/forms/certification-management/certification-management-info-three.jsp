<%@ include file="../../init.jsp" %>
<!-- Management System Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep29">
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
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">23.0</span> In accordance with clause 10.1 in ISO/IEC 17021-1:2015, 
							indicate the management system, currently implemented within your organization [Clause 10.1] </p>
							<div class="wizard-form-radio mt-2">
								<input value="Option A" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOptionFollow().equals("Option A")? "checked":StringPool.BLANK%> name="managementImplementedWithOrg"> <label
									for="managementImplementedWithOrg">Option A</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="Option B" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOptionFollow().equals("Option B")? "checked":StringPool.BLANK%> name="managementImplementedWithOrg"> <label
									for="managementImplementedWithOrg">Option B</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">24.0</span> Has your organization established documentation for the following requirements of the ISO/IEC 
					17021-1:2015 Standard? Indicate also where in the management system manual or other suitable documentation, the related document 
					is referenced.</p>
					<p class="tab-form-main-heading">Documents/Processes/Procedures/Forms</p>
					<p class="tab-form-main-heading"><b>General Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="genReqOne"><span class="tab-form-highlghtme-link pr-2">1.</span>Impartiality policy: 5.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getImpartialityPolicy().equals("Yes")? "checked":StringPool.BLANK%> name="genReqOne"> <label
									for="genReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getImpartialityPolicy().equals("No")? "checked":StringPool.BLANK%> name="genReqOne"> <label
									for="genReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefImpartiality())?applicationCerSec.getQMRefImpartiality():""%>" placeholder=""/>
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
														<input type="file" id="managementRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefAttach1"> 
														
														<label class="custom-upload" for="managementRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityPolicyDoc)){ %>
												<span class="attach-detailed-overview"><%=impartialityPolicyDoc%></span>
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
							<p class="tab-form-main-heading" id="genReqTwo"><span class="tab-form-highlghtme-link pr-2">2.</span>Risk assessment - treatment of threats to impartiality and mitigation measures: 5.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRiskAssessment().equals("Yes")? "checked":StringPool.BLANK%> name="genReqTwo"> <label
									for="genReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRiskAssessment().equals("No")? "checked":StringPool.BLANK%> name="genReqTwo"> <label
									for="genReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefRisk())?applicationCerSec.getQMRefRisk():""%>" placeholder=""/>
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
														<input type="file" id="managementRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementRefAttach2"> 
														<label class="custom-upload" for="managementRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityMitigationDoc)){ %>
												<span class="attach-detailed-overview"><%=impartialityMitigationDoc%></span>
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
					<p class="tab-form-main-heading"><b>Structural Requirements</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="structuralReqOne"><span class="tab-form-highlghtme-link pr-2">3.</span>Organizational structure and duties (e.g. job descriptions) for managerial and key certification personnel 6.1.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOrgStructure().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqOne"> <label
									for="structuralReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOrgStructure().equals("No")? "checked":StringPool.BLANK%> name="structuralReqOne"> <label
									for="structuralReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefOrgStruct())?applicationCerSec.getQMRefOrgStruct():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefAttach1"> 
														<label class="custom-upload" for="managementStrucRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(keyCertificationPersonnelDoc)){ %>
												<span class="attach-detailed-overview"><%=keyCertificationPersonnelDoc%></span>
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
							<p class="tab-form-main-heading" id="structuralReqTwo"><span class="tab-form-highlghtme-link pr-2">4.</span>Terms of reference for all committees involved in certification activities 6.1.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getTermsOfReference().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqTwo"> <label
									for="structuralReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getTermsOfReference().equals("No")? "checked":StringPool.BLANK%> name="structuralReqTwo"> <label
									for="structuralReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefTerms())?applicationCerSec.getQMRefTerms():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefAttach2"> 
														<label class="custom-upload" for="managementStrucRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(committeesInvolvedDoc)){ %>
												<span class="attach-detailed-overview"><%=committeesInvolvedDoc%></span>
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
							<p class="tab-form-main-heading" id="structuralReqThree"><span class="tab-form-highlghtme-link pr-2">5.</span>Process for control of activities conducted by branches, partnerships, agents, franchises, etc., 6.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessForControl().equals("Yes")? "checked":StringPool.BLANK%> name="structuralReqThree"> <label
									for="structuralReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessForControl().equals("No")? "checked":StringPool.BLANK%> name="structuralReqThree"> <label
									for="structuralReqThree">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementStrucRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefProcess())?applicationCerSec.getQMRefProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementStrucRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementStrucRefAttach3"> 
														<label class="custom-upload" for="managementStrucRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(partnershipsAgentsDoc)){ %>
												<span class="attach-detailed-overview"><%=partnershipsAgentsDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqOne"><span class="tab-form-highlghtme-link pr-2">6.</span>Criteria of required knowledge and skills necessary to perform audits and certification tasks 7.1.2; Annex A</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCriteriaReq().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqOne"> <label
									for="resourceReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCriteriaReq().equals("No")? "checked":StringPool.BLANK%> name="resourceReqOne"> <label
									for="resourceReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefCriteria())?applicationCerSec.getQMRefCriteria():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach1"> 
														<label class="custom-upload" for="managementResourceRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(criteriaRequiredKnowledgeDoc)){ %>
												<span class="attach-detailed-overview"><%=criteriaRequiredKnowledgeDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqTwo"><span class="tab-form-highlghtme-link pr-2">7.</span>Procedure for initial competence evaluation and monitoring of personnel involved in audit and certification activities (general) 7.1.3 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInitialCompetence().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqTwo"> <label
									for="resourceReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInitialCompetence().equals("No")? "checked":StringPool.BLANK%> name="resourceReqTwo"> <label
									for="resourceReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefInitial())?applicationCerSec.getQMRefInitial():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach2"> 
														<label class="custom-upload" for="managementResourceRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(nitialCompetenceEvaluationDoc)){ %>
												<span class="attach-detailed-overview"><%=nitialCompetenceEvaluationDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqThree"><span class="tab-form-highlghtme-link pr-2">8.</span>Processes for selecting training and authorizing auditors; selecting and familiarizing experts 7.2.4 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSelectingTraining().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqThree"> <label
									for="resourceReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSelectingTraining().equals("No")? "checked":StringPool.BLANK%> name="resourceReqThree"> <label
									for="resourceReqThree">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefSelecting())?applicationCerSec.getQMRefSelecting():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach3"> 
														<label class="custom-upload" for="managementResourceRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(authorizingAuditorsDoc)){ %>
												<span class="attach-detailed-overview"><%=authorizingAuditorsDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqFour"><span class="tab-form-highlghtme-link pr-2">9.</span>Monitoring of competence and performance of auditors and all personnel involved in certification activities (including on-site evaluation, review of audit reports and client feedback) 7.2.9</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getMonitoringCompetence().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqFour"> <label
									for="resourceReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getMonitoringCompetence().equals("No")? "checked":StringPool.BLANK%> name="resourceReqFour"> <label
									for="resourceReqFour">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefFour" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefMonitoring())?applicationCerSec.getQMRefMonitoring():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach4"> 
														<label class="custom-upload" for="managementResourceRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(monitoringCompetenceDoc)){ %>
												<span class="attach-detailed-overview"><%=monitoringCompetenceDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqFive"><span class="tab-form-highlghtme-link pr-2">10.</span>Written agreement for external auditors and technical experts (template/sample) 7.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getWrittenAgreement().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqFive"> <label
									for="resourceReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getWrittenAgreement().equals("No")? "checked":StringPool.BLANK%> name="resourceReqFive"> <label
									for="resourceReqFive">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefFive" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefWritten())?applicationCerSec.getQMRefWritten():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach5"> 
														<label class="custom-upload" for="managementResourceRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(technicalExpertsDoc)){ %>
												<span class="attach-detailed-overview"><%=technicalExpertsDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqSix"><span class="tab-form-highlghtme-link pr-2">11.</span>Description of process for outsourcing of certification activities (whole or in part) 7.5.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDescOfProcess().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqSix"> <label
									for="resourceReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDescOfProcess().equals("No")? "checked":StringPool.BLANK%> name="resourceReqSix"> <label
									for="resourceReqSix">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefSix" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefDescProcess())?applicationCerSec.getQMRefDescProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach6"> 
														<label class="custom-upload" for="managementResourceRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(outsourcingCertificationDoc)){ %>
												<span class="attach-detailed-overview"><%=outsourcingCertificationDoc%></span>
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
							<p class="tab-form-main-heading" id="resourceReqSeven"><span class="tab-form-highlghtme-link pr-2">12.</span>Process for monitoring bodies that provide outsourced services 7.5.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessForMonitor().equals("No")? "checked":StringPool.BLANK%> name="resourceReqSeven"> <label
									for="resourceReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessForMonitor().equals("Yes")? "checked":StringPool.BLANK%> name="resourceReqSeven"> <label
									for="resourceReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementResourceRefSeven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefMonitorProcess())?applicationCerSec.getQMRefMonitorProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementResourceRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementResourceRefAttach7"> 
														<label class="custom-upload" for="managementResourceRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(outsourcedServicesDoc)){ %>
												<span class="attach-detailed-overview"><%=outsourcedServicesDoc%></span>
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
					<p class="tab-form-main-heading"><b>Information Requirements</b></p>
					<p class="tab-form-main-heading">Information made publicly available/accessible about the following (8.1.1)</p>
				</div>
				<div class="col-md-12 ml-3">
					<div class="row">
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req">
									<p class="tab-form-main-heading" id="informationReqOne">a. Audit processes</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditProcess().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqOne"> <label
											for="informationReqOne">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditProcess().equals("No")? "checked":StringPool.BLANK%> name="informationReqOne"> <label
											for="informationReqOne">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefAuditProcess())?applicationCerSec.getQMRefAuditProcess():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach1"> 
														<label class="custom-upload" for="managementInformationRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(publiclyAvailableAccessibleDoc)){ %>
												<span class="attach-detailed-overview"><%=publiclyAvailableAccessibleDoc%></span>
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
									<p class="tab-form-main-heading" id="informationReqTwo">b. Processes for granting, refusing, maintaining, renewing, suspending, restoring or withdrawing certification or expanding or reducing the scope of certification</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessGranting().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqTwo"> <label
											for="informationReqTwo">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProcessGranting().equals("No")? "checked":StringPool.BLANK%> name="informationReqTwo"> <label
											for="informationReqTwo">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefGranting())?applicationCerSec.getQMRefGranting():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach2"> 
														<label class="custom-upload" for="managementInformationRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(maintainingRenewingSuspendingDoc)){ %>
												<span class="attach-detailed-overview"><%=maintainingRenewingSuspendingDoc%></span>
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
									<p class="tab-form-main-heading" id="informationReqThree">c. Management systems and certification scheme for which certification is offered</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagemntSys().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqThree"> <label
											for="informationReqThree">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagemntSys().equals("No")? "checked":StringPool.BLANK%> name="informationReqThree"> <label
											for="informationReqThree">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefManagemnt())?applicationCerSec.getQMRefManagemnt():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach3"> 
														<label class="custom-upload" for="managementInformationRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementSystemsCertificationDoc)){ %>
												<span class="attach-detailed-overview"><%=managementSystemsCertificationDoc%></span>
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
									<p class="tab-form-main-heading" id="informationReqFour">d. Use of the certification body's name and certification mark or logo </p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getUseOfCertification().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqFour"> <label
											for="informationReqFour">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getUseOfCertification().equals("No")? "checked":StringPool.BLANK%> name="informationReqFour"> <label
											for="informationReqFour">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefFour" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefUseOfCerti())?applicationCerSec.getQMRefUseOfCerti():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach4"> 
														<label class="custom-upload" for="managementInformationRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationMarkLogoDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationMarkLogoDoc%></span>
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
									<p class="tab-form-main-heading" id="informationReqFive">e. Handling requests for information, complaints and appeals</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getHandlingReq().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqFive"> <label
											for="informationReqFive">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getHandlingReq().equals("No")? "checked":StringPool.BLANK%> name="informationReqFive"> <label
											for="informationReqFive">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefFive" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefHandling())?applicationCerSec.getQMRefHandling():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach5"> 
														<label class="custom-upload" for="managementInformationRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(handlingRequestInformationDoc)){ %>
												<span class="attach-detailed-overview"><%=handlingRequestInformationDoc%></span>
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
									<p class="tab-form-main-heading" id="informationReqSix">f. Impartiality Policy </p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getImpartialityPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqSix"> <label
											for="informationReqSix">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getImpartialityPolicies().equals("No")? "checked":StringPool.BLANK%> name="informationReqSix"> <label
											for="informationReqSix">No</label>
									</div>
								</div>
								<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="managementInformationRefSix" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefImpartPolicy())?applicationCerSec.getQMRefImpartPolicy():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach6"> 
														<label class="custom-upload" for="managementInformationRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ImpartialityPoliciesDoc)){ %>
												<span class="attach-detailed-overview"><%=ImpartialityPoliciesDoc%></span>
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
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="informationReqSeven"><span class="tab-form-highlghtme-link pr-2">13.</span>Provisions for informing clients of certification activities and requirements and geographical areas of operation 8.1.2 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProvisionInform().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqSeven"> <label
									for="informationReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getProvisionInform().equals("No")? "checked":StringPool.BLANK%> name="informationReqSeven"> <label
									for="informationReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefSeven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefProvision())?applicationCerSec.getQMRefProvision():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach7"> 
														<label class="custom-upload" for="managementInformationRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(provisionsInformingDoc)){ %>
												<span class="attach-detailed-overview"><%=provisionsInformingDoc%></span>
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
							<p class="tab-form-main-heading" id="informationReqEight"><span class="tab-form-highlghtme-link pr-2">14.</span>Certification documents (sample/template) 8.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCertificationDoc().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqEight"> <label
									for="informationReqEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCertificationDoc().equals("No")? "checked":StringPool.BLANK%> name="informationReqEight"> <label
									for="informationReqEight">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefEight" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefCertification())?applicationCerSec.getQMRefCertification():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach8"> 
														<label class="custom-upload" for="managementInformationRefAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(certificationDocumentsDoc)){ %>
												<span class="attach-detailed-overview"><%=certificationDocumentsDoc%></span>
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
							<p class="tab-form-main-heading" id="informationReqNine"><span class="tab-form-highlghtme-link pr-2">15.</span>Rules governing use of certification mark(s) and statements on product packaging 8.3.1/8.3.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRulesGoverning().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqNine"> <label
									for="informationReqNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRulesGoverning().equals("No")? "checked":StringPool.BLANK%> name="informationReqNine"> <label
									for="informationReqNine">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefNine" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefGoverning())?applicationCerSec.getQMRefGoverning():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach9"> 
														<label class="custom-upload" for="managementInformationRefAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(productPackagingDoc)){ %>
												<span class="attach-detailed-overview"><%=productPackagingDoc%></span>
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
							<p class="tab-form-main-heading" id="informationReqTen"><span class="tab-form-highlghtme-link pr-2">16.</span>Legally enforceable arrangements for confidentiality 8.4.1 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getEnforcableArrangements().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqTen"> <label
									for="informationReqTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getEnforcableArrangements().equals("No")? "checked":StringPool.BLANK%> name="informationReqTen"> <label
									for="informationReqTen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefTen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefEnforcable())?applicationCerSec.getQMRefEnforcable():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach10"> 
														<label class="custom-upload" for="managementInformationRefAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(legallyEnforceableArrangementsDoc)){ %>
												<span class="attach-detailed-overview"><%=legallyEnforceableArrangementsDoc%></span>
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
							<p class="tab-form-main-heading" id="informationReqEleven"><span class="tab-form-highlghtme-link pr-2">17.</span>Process for ensuring confidentiality 8.4.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getEnsureConfidential().equals("Yes")?"checked":StringPool.BLANK%> name="informationReqEleven"> <label
									for="informationReqEleven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getEnsureConfidential().equals("No")? "checked":StringPool.BLANK%> name="informationReqEleven"> <label
									for="informationReqEleven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefEleven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefEnsureConfid())?applicationCerSec.getQMRefEnsureConfid():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach11" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach11"> 
														<label class="custom-upload" for="managementInformationRefAttach11"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ensuringConfidentialityDoc)){ %>
												<span class="attach-detailed-overview"><%=ensuringConfidentialityDoc%></span>
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
							<p class="tab-form-main-heading" id="informationReqTwelve"><span class="tab-form-highlghtme-link pr-2">18.</span>Mechanisms for informing clients on the certification activities and requirements (including normative requirements of certification and rights and duties of certified clients) 8.5.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInformingMechanism().equals("Yes")? "checked":StringPool.BLANK%> name="informationReqTwelve"> <label
									for="informationReqTwelve">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInformingMechanism().equals("No")? "checked":StringPool.BLANK%> name="informationReqTwelve"> <label
									for="informationReqTwelve">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementInformationRefTwelve" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefInforming())?applicationCerSec.getQMRefInforming():""%>" placeholder=""/>
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
														<input type="file" id="managementInformationRefAttach12" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementInformationRefAttach12"> 
														<label class="custom-upload" for="managementInformationRefAttach12"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(mechanismsInformingClientsDoc)){ %>
												<span class="attach-detailed-overview"><%=mechanismsInformingClientsDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqOne"><span class="tab-form-highlghtme-link pr-2">19.</span>Application process 9.1.1; 9.1.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getApplicationProcess().equals("Yes")? "checked":StringPool.BLANK%> name="processReqOne"> <label
									for="processReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getApplicationProcess().equals("No")? "checked":StringPool.BLANK%> name="processReqOne"> <label
									for="processReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefApplication())?applicationCerSec.getQMRefApplication():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach1"> 
														<label class="custom-upload" for="managementProcessRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(applicationProcessDoc)){ %>
												<span class="attach-detailed-overview"><%=applicationProcessDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqTwo"><span class="tab-form-highlghtme-link pr-2">20.</span>Process for application review 9.1.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getApplicationReview().equals("Yes")? "checked":StringPool.BLANK%> name="processReqTwo"> <label
									for="processReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getApplicationReview().equals("No")? "checked":StringPool.BLANK%> name="processReqTwo"> <label
									for="processReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefReview())?applicationCerSec.getQMRefReview():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach2"> 
														<label class="custom-upload" for="managementProcessRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(processApplicationReviewDoc1)){ %>
												<span class="attach-detailed-overview"><%=processApplicationReviewDoc1%></span>
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
							<p class="tab-form-main-heading" id="processReqThree"><span class="tab-form-highlghtme-link pr-2">21.</span>Certification cycle audit programme 9.1.3.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCertificationCycle().equals("Yes")? "checked":StringPool.BLANK%> name="processReqThree"> <label
									for="processReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCertificationCycle().equals("No")? "checked":StringPool.BLANK%> name="processReqThree"> <label
									for="processReqThree">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefCertiCycle())?applicationCerSec.getQMRefCertiCycle():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach3"> 
														<label class="custom-upload" for="managementProcessRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(cycleAuditProgrammeDoc)){ %>
												<span class="attach-detailed-overview"><%=cycleAuditProgrammeDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqFour"><span class="tab-form-highlghtme-link pr-2">22.</span>Procedures for determining audit time 9.1.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditTime().equals("Yes")? "checked":StringPool.BLANK%> name="processReqFour"> <label
									for="processReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditTime().equals("No")? "checked":StringPool.BLANK%> name="processReqFour"> <label
									for="processReqFour">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefFour" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefAuditTime())?applicationCerSec.getQMRefAuditTime():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach4"> 
														<label class="custom-upload" for="managementProcessRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(determiningAuditTimeDoc)){ %>
												<span class="attach-detailed-overview"><%=determiningAuditTimeDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqFive"><span class="tab-form-highlghtme-link pr-2">23.</span>Sampling programme/plan (if applicable) for multi-site audits 9.1.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSamplingProgram().equals("Yes")? "checked":StringPool.BLANK%> name="processReqFive"> <label
									for="processReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSamplingProgram().equals("No")? "checked":StringPool.BLANK%> name="processReqFive"> <label
									for="processReqFive">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefFive" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefSampling())?applicationCerSec.getQMRefSampling():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach5"> 
														<label class="custom-upload" for="managementProcessRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(samplingProgrammePlanDoc)){ %>
												<span class="attach-detailed-overview"><%=samplingProgrammePlanDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqSix"><span class="tab-form-highlghtme-link pr-2">24.</span>Audit planning (include sample/templates) 9.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditPlanning().equals("Yes")? "checked":StringPool.BLANK%> name="processReqSix"> <label
									for="processReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditPlanning().equals("No")? "checked":StringPool.BLANK%> name="processReqSix"> <label
									for="processReqSix">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefSix" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefPlanning())?applicationCerSec.getQMRefPlanning():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach6"> 
														<label class="custom-upload" for="managementProcessRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(auditPlanningIncludeDoc)){ %>
												<span class="attach-detailed-overview"><%=auditPlanningIncludeDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqSeven"><span class="tab-form-highlghtme-link pr-2">25.</span>Process for selecting and appointing the audit team 9.2.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditTeam().equals("Yes")? "checked":StringPool.BLANK%> name="processReqSeven"> <label
									for="processReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditTeam().equals("No")? "checked":StringPool.BLANK%> name="processReqSeven"> <label
									for="processReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefSeven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefAuditTeam())?applicationCerSec.getQMRefAuditTeam():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach7"> 
														<label class="custom-upload" for="managementProcessRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(selectingAppointingDoc)){ %>
												<span class="attach-detailed-overview"><%=selectingAppointingDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqEight"><span class="tab-form-highlghtme-link pr-2">26.</span>Process for conducting on-site audits 9.4.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOnSiteAudit().equals("Yes")? "checked":StringPool.BLANK%> name="processReqEight"> <label
									for="processReqEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getOnSiteAudit().equals("No")? "checked":StringPool.BLANK%> name="processReqEight"> <label
									for="processReqEight">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefEight" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefonSiteAudit())?applicationCerSec.getQMRefonSiteAudit():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach8"> 
														<label class="custom-upload" for="managementProcessRefAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(processConductingDoc)){ %>
												<span class="attach-detailed-overview"><%=processConductingDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqNine"><span class="tab-form-highlghtme-link pr-2">27.</span>Audit Report (sample/template) 9.4.8.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditReport().equals("Yes")? "checked":StringPool.BLANK%> name="processReqNine"> <label
									for="processReqNine">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getAuditReport().equals("No")? "checked":StringPool.BLANK%> name="processReqNine"> <label
									for="processReqNine">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefNine" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefAuditReport())?applicationCerSec.getQMRefAuditReport():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach9"> 
														<label class="custom-upload" for="managementProcessRefAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(auditReportSampleDoc)){ %>
												<span class="attach-detailed-overview"><%=auditReportSampleDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqTen"><span class="tab-form-highlghtme-link pr-2">28.</span>Process for audit non-conformities and corrective actions 9.4.9; 9.4.10</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCorrectiveActions().equals("Yes")? "checked":StringPool.BLANK%> name="processReqTen"> <label
									for="processReqTen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getCorrectiveActions().equals("No")? "checked":StringPool.BLANK%> name="processReqTen"> <label
									for="processReqTen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefTen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefCorrective())?applicationCerSec.getQMRefCorrective():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach10"> 
														<label class="custom-upload" for="managementProcessRefAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(auditNonConformitiesDoc)){ %>
												<span class="attach-detailed-overview"><%=auditNonConformitiesDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqEleven"><span class="tab-form-highlghtme-link pr-2">29.</span>Process to conduct review of audit results prior to decision 9.5.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getReviewPriorDecision().equals("Yes")? "checked":StringPool.BLANK%> name="processReqEleven"> <label
									for="processReqEleven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getReviewPriorDecision().equals("No")? "checked":StringPool.BLANK%> name="processReqEleven"> <label
									for="processReqEleven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefEleven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefReviewPrior())?applicationCerSec.getQMRefReviewPrior():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach11" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach11"> 
														<label class="custom-upload" for="managementProcessRefAttach11"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(auditResultsPriorDoc)){ %>
												<span class="attach-detailed-overview"><%=auditResultsPriorDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqTwelve"><span class="tab-form-highlghtme-link pr-2">30.</span>Process for transfer of certification 9.5.3.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getTransferCertification().equals("Yes")? "checked":StringPool.BLANK%> name="processReqTwelve"> <label
									for="processReqTwelve">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getTransferCertification().equals("No")? "checked":StringPool.BLANK%> name="processReqTwelve"> <label
									for="processReqTwelve">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefTwelve" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefTransfer())?applicationCerSec.getQMRefTransfer():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach12" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach12"> 
														<label class="custom-upload" for="managementProcessRefAttach12"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(transferCertificationDoc)){ %>
												<span class="attach-detailed-overview"><%=transferCertificationDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqThirteen"><span class="tab-form-highlghtme-link pr-2">31.</span>Policy for suspension, withdrawal or reduction of the scope of certification 9.6.5.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSuspensionPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="processReqThirteen"> <label
									for="processReqThirteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSuspensionPolicies().equals("No")? "checked":StringPool.BLANK%> name="processReqThirteen"> <label
									for="processReqThirteen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefThirteen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefSuspension())?applicationCerSec.getQMRefSuspension():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach13" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach13"> 
														<label class="custom-upload" for="managementProcessRefAttach13"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(withdrawalReductionDoc)){ %>
												<span class="attach-detailed-overview"><%=withdrawalReductionDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqFourteen"><span class="tab-form-highlghtme-link pr-2">32.</span>Procedure(s) for suspension, withdrawal or reduction of the scope of certification 9.6.5.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSuspensionProcedure().equals("Yes")? "checked":StringPool.BLANK%> name="processReqFourteen"> <label
									for="processReqFourteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getSuspensionProcedure().equals("No")? "checked":StringPool.BLANK%> name="processReqFourteen"> <label
									for="processReqFourteen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefFourteen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefSuspensionProc())?applicationCerSec.getQMRefSuspensionProc():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach14" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach14"> 
														<label class="custom-upload" for="managementProcessRefAttach14"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(suspensionWithdrawalDoc)){ %>
												<span class="attach-detailed-overview"><%=suspensionWithdrawalDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqFifteen"><span class="tab-form-highlghtme-link pr-2">33.</span>Procedure to receive, evaluate and make decisions on appeals 9.7.1 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDecisionOnAppeals().equals("Yes")? "checked":StringPool.BLANK%> name="processReqFifteen"> <label
									for="processReqFifteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDecisionOnAppeals().equals("No")? "checked":StringPool.BLANK%> name="processReqFifteen"> <label
									for="processReqFifteen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefFifteen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefDecision())?applicationCerSec.getQMRefDecision():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach15" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach15"> 
														<label class="custom-upload" for="managementProcessRefAttach15"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(decisionsAppealsDoc)){ %>
												<span class="attach-detailed-overview"><%=decisionsAppealsDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqSixteen"><span class="tab-form-highlghtme-link pr-2">34.</span>Procedure for handling complaints 9.8.5</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getHandlingComplaints().equals("Yes")? "checked":StringPool.BLANK%> name="processReqSixteen"> <label
									for="processReqSixteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getHandlingComplaints().equals("No")? "checked":StringPool.BLANK%> name="processReqSixteen"> <label
									for="processReqSixteen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefSixteen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefComplaints())?applicationCerSec.getQMRefComplaints():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach16" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach16"> 
														<label class="custom-upload" for="managementProcessRefAttach16"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(procedureHandlingComplaintsDoc)){ %>
												<span class="attach-detailed-overview"><%=procedureHandlingComplaintsDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqSeventeen"><span class="tab-form-highlghtme-link pr-2">35.</span>Record retention policy 9.9.4 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecordRetentionPolicy().equals("Yes")? "checked":StringPool.BLANK%> name="processReqSeventeen"> <label
									for="processReqSeventeen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecordRetentionPolicy().equals("No")? "checked":StringPool.BLANK%> name="processReqSeventeen"> <label
									for="processReqSeventeen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefSeventeen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefRetentionPolicy())?applicationCerSec.getQMRefRetentionPolicy():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach17" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach17"> 
														<label class="custom-upload" for="managementProcessRefAttach17"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(recordRetentionPolicyDoc)){ %>
												<span class="attach-detailed-overview"><%=recordRetentionPolicyDoc%></span>
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
							<p class="tab-form-main-heading" id="processReqEighteen"><span class="tab-form-highlghtme-link pr-2">36.</span>Record retention procedure 9.9.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecordRetentionProc().equals("Yes")? "checked":StringPool.BLANK%> name="processReqEighteen"> <label
									for="processReqEighteen">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecordRetentionProc().equals("No")? "checked":StringPool.BLANK%> name="processReqEighteen"> <label
									for="processReqEighteen">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementProcessRefEighteen" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefRetentionProc())?applicationCerSec.getQMRefRetentionProc():""%>" placeholder=""/>
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
														<input type="file" id="managementProcessRefAttach18" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementProcessRefAttach18"> 
														<label class="custom-upload" for="managementProcessRefAttach18"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(recordRetentionProcedureDoc)){ %>
												<span class="attach-detailed-overview"><%=recordRetentionProcedureDoc%></span>
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
			<div class="row option-a hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option A (Only if Applicable)</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemReqOne">Management system policies 10.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqOne"> <label
									for="managementSystemReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysPolicies().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqOne"> <label
									for="managementSystemReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefPolicies())?applicationCerSec.getQMRefPolicies():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach1"> 
														<label class="custom-upload" for="managementSystemRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementSystemPoliciesDoc)){ %>
												<span class="attach-detailed-overview"><%=managementSystemPoliciesDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqTwo">Management system objectives 10.2.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysObjective().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqTwo"> <label
									for="managementSystemReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysObjective().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqTwo"> <label
									for="managementSystemReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefObjective())?applicationCerSec.getQMRefObjective():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach2"> 
														<label class="custom-upload" for="managementSystemRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementSystemObjectivesDoc)){ %>
												<span class="attach-detailed-overview"><%=managementSystemObjectivesDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqThree">Management system manual or equivalent documentation 10.2.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysManual().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqThree"> <label
									for="managementSystemReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManageSysManual().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqThree"> <label
									for="managementSystemReqThree">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefManual())?applicationCerSec.getQMRefManual():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach3"> 
														<label class="custom-upload" for="managementSystemRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(manualEquivalentDoc)){ %>
												<span class="attach-detailed-overview"><%=manualEquivalentDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqFour">Procedure for document control 10.2.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDocControlProcedure().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqFour"> <label
									for="managementSystemReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDocControlProcedure().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqFour"> <label
									for="managementSystemReqFour">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefFour" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefDocControl())?applicationCerSec.getQMRefDocControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach4"> 
														<label class="custom-upload" for="managementSystemRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(procedureDocumentControlDoc)){ %>
												<span class="attach-detailed-overview"><%=procedureDocumentControlDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqFive">Procedure for record control 10.2.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecControlProc().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqFive"> <label
									for="managementSystemReqFive">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getRecControlProc().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqFive"> <label
									for="managementSystemReqFive">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefFive" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefRecControl())?applicationCerSec.getQMRefRecControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach5"> 
														<label class="custom-upload" for="managementSystemRefAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
											<%if(Validator.isNotNull(procedureRecordControlDoc)){ %>
												<span class="attach-detailed-overview"><%=procedureRecordControlDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqSix">Management review 10.2.5.1 </p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagementReview().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqSix"> <label
									for="managementSystemReqSix">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagementReview().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqSix"> <label
									for="managementSystemReqSix">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefSix" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefManagementRev())?applicationCerSec.getQMRefManagementRev():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach6"> 
														<label class="custom-upload" for="managementSystemRefAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementReviewDoc1)){ %>
												<span class="attach-detailed-overview"><%=managementReviewDoc1%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqSeven">Internal audits 10.2.6.1</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInternalAudits().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqSeven"> <label
									for="managementSystemReqSeven">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInternalAudits().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqSeven"> <label
									for="managementSystemReqSeven">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefSeven" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefInternal())?applicationCerSec.getQMRefInternal():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach7"> 
														<label class="custom-upload" for="managementSystemRefAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(internauditsDoc)){ %>
												<span class="attach-detailed-overview"><%=internauditsDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemReqEight">Procedures for identification and management of corrective actions 10.2.7</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getIdentificationProc().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemReqEight"> <label
									for="managementSystemReqEight">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getIdentificationProc().equals("No")? "checked":StringPool.BLANK%> name="managementSystemReqEight"> <label
									for="managementSystemReqEight">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemRefEight" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefIdentification())?applicationCerSec.getQMRefIdentification():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemRefAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemRefAttach8"> 
														<label class="custom-upload" for="managementSystemRefAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementCorrectiveActionsDoc)){ %>
												<span class="attach-detailed-overview"><%=managementCorrectiveActionsDoc%></span>
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
			<div class="row option-b hide">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><b>Management System Requirements Option B - ISO 9001 (Only if Applicable)</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req">
							<p class="tab-form-main-heading" id="managementSystemBReqOne">Scope of QMS 10.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getQMSScopeB().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemBReqOne"> <label
									for="managementSystemBReqOne">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getQMSScopeB().equals("No")? "checked":StringPool.BLANK%> name="managementSystemBReqOne"> <label
									for="managementSystemBReqOne">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemBRefOne" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefQMSScopeB())?applicationCerSec.getQMRefQMSScopeB():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemBRefAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemBRefAttach1"> 
														<label class="custom-upload" for="managementSystemBRefAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(ScopeQmsDoc)){ %>
												<span class="attach-detailed-overview"><%=ScopeQmsDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemBReqTwo"> Design and development (planning, inputs, controls, outputs and  changes) 10.3.2</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDesignDevB().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemBReqTwo"> <label
									for="managementSystemBReqTwo">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getDesignDevB().equals("No")? "checked":StringPool.BLANK%> name="managementSystemBReqTwo"> <label
									for="managementSystemBReqTwo">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemBRefTwo" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefDesignB())?applicationCerSec.getQMRefDesignB():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemBRefAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemBRefAttach2"> 
														<label class="custom-upload" for="managementSystemBRefAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(planningInputsControlsDoc)){ %>
												<span class="attach-detailed-overview"><%=planningInputsControlsDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemBReqThree">Needs of interested parties 10.3.3</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInterestedPartyNeedsB().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemBReqThree"> <label
									for="managementSystemBReqThree">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getInterestedPartyNeedsB().equals("No")? "checked":StringPool.BLANK%> name="managementSystemBReqThree"> <label
									for="managementSystemBReqThree">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemBRefThree" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefInterestedB())?applicationCerSec.getQMRefInterestedB():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemBRefAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemBRefAttach3"> 
														<label class="custom-upload" for="managementSystemBRefAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(needsInterestedPartiesDoc)){ %>
												<span class="attach-detailed-overview"><%=needsInterestedPartiesDoc%></span>
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
							<p class="tab-form-main-heading" id="managementSystemBReqFour">Management review 10.3.4</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagementReviewB().equals("Yes")? "checked":StringPool.BLANK%> name="managementSystemBReqFour"> <label
									for="managementSystemBReqFour">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=applicationCerSec!=null &&applicationCerSec.getManagementReviewB().equals("No")? "checked":StringPool.BLANK%> name="managementSystemBReqFour"> <label
									for="managementSystemBReqFour">No</label>
							</div>
						</div>
						<div class="row managementRef hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSystemBRefFour" value="<%=Validator.isNotNull(applicationCerSec)&&Validator.isNotNull(applicationCerSec.getQMRefmanagementReviewB())?applicationCerSec.getQMRefmanagementReviewB():""%>" placeholder=""/>
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
														<input type="file" id="managementSystemBRefAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSystemBRefAttach4"> 
														<label class="custom-upload" for="managementSystemBRefAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                                  				<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
					                                				 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(managementDoc)){ %>
												<span class="attach-detailed-overview"><%=managementDoc%></span>
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
	<button type="button" id="saveName" onclick="accCerBodiesManagementSysReq(false);"
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