<%@ include file="../../init.jsp" %>
<div class="tab-pane" role="tabpanel" id="childStep60">
	<div class="tab-form">
		<div class="managemen-system-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">V. Management System Requirements</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<!-- <p class="tab-form-main-heading"><b>Management System Requirements</b></p> -->
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">23.0</span> In accordance with clause 10.1 in ISO/IEC 17021-1:2015; 8.1 in ISO/IEC 17065:2012, indicate the management system option employed by your organization.</p>
							<div class="wizard-form-radio mt-2 d-block">
								<input value="Option A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOptionFollow().equals("Option A")? "checked":StringPool.BLANK%> name="managementImplementedWithOrgThirdParty"> <label
									for="managementImplementedWithOrgThirdParty">Option A</label>
							</div>
							<div class="wizard-form-radio mt-2 d-block">
								<input value="Option B" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOptionFollow().equals("Option B")? "checked":StringPool.BLANK%> name="managementImplementedWithOrgThirdParty"> <label
									for="managementImplementedWithOrgThirdParty">Option B</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="Not Applicable" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOptionFollow().equals("Not Applicable")? "checked":StringPool.BLANK%> name="managementImplementedWithOrgThirdParty"> <label
									for="managementImplementedWithOrgThirdParty">Not Applicable</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">24.0</span> Has your organization established documentation for the following requirements?</p>
					<p class="tab-form-main-heading">Indicate where in a management system manual or other suitable documentation, the related process/policy/procedure is referenced. The requirements cited are abstracted from 21 CFR Chapter 1, Subchapter A, Part 1, Subpart M: Accreditation of Third-Party Certification Bodies to Conduct Food Safety Audits and to Issue Certifications (F), ISO/IEC 17021-1:2015 (M); and ISO/IEC 17065:2012 (P). Not all may be applicable to your organization. The corresponding code (F, M or P) is assigned to each applicable requirement for guidance.</p>
					<p class="tab-form-main-heading">Documents/Processes/Procedures</p>
					<p class="tab-form-main-heading"><b>Impartiality/Confidentiality</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="impartialityThirdParty1">1. Impartiality policy; Written program for protecting against conflicts of interest [F, M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicy().equals("Yes")? "checked":StringPool.BLANK%> name="impartialityThirdParty1"> <label
									for="impartialityThirdParty1">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicy().equals("No")? "checked":StringPool.BLANK%> name="impartialityThirdParty1"> <label
									for="impartialityThirdParty1">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicy().equals("N/A")? "checked":StringPool.BLANK%> name="impartialityThirdParty1"> <label
									for="impartialityThirdParty1">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="impartialityRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefImpartiality())?cerBodyManReqInfo.getQMRefImpartiality():""%>" placeholder=""/>
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
														<input type="file" id="impartialityRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>impartialityRefThirdPartyAttach1"> 
														<label class="custom-upload" for="impartialityRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityQualityOne)){ %>
												<span class="attach-detailed-overview"><%=impartialityQualityOne%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="impartialityThirdParty2">2. Impartiality mechanism [P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInterestedPartyNeedsB().equals("Yes")? "checked":StringPool.BLANK%> name="impartialityThirdParty2"> <label
									for="impartialityThirdParty2">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInterestedPartyNeedsB().equals("No")? "checked":StringPool.BLANK%> name="impartialityThirdParty2"> <label
									for="impartialityThirdParty2">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInterestedPartyNeedsB().equals("N/A")? "checked":StringPool.BLANK%> name="impartialityThirdParty2"> <label
									for="impartialityThirdParty2">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="impartialityRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefInterestedB())?cerBodyManReqInfo.getQMRefInterestedB():""%>" placeholder=""/>
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
														<input type="file" id="impartialityRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>impartialityRefThirdPartyAttach2"> 
														<label class="custom-upload" for="impartialityRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityQualityTwo)){ %>
												<span class="attach-detailed-overview"><%=impartialityQualityTwo%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="impartialityThirdParty3">3. Risk assessment - treatment of threats to impartiality and mitigation measures [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRiskAssessment().equals("Yes")? "checked":StringPool.BLANK%> name="impartialityThirdParty3"> <label
									for="impartialityThirdParty3">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRiskAssessment().equals("No")? "checked":StringPool.BLANK%> name="impartialityThirdParty3"> <label
									for="impartialityThirdParty3">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRiskAssessment().equals("N/A")? "checked":StringPool.BLANK%> name="impartialityThirdParty3"> <label
									for="impartialityThirdParty3">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="impartialityRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefRisk())?cerBodyManReqInfo.getQMRefRisk():""%>" placeholder=""/>
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
														<input type="file" id="impartialityRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>impartialityRefThirdPartyAttach3"> 
														<label class="custom-upload" for="impartialityRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityQualityThree)){ %>
												<span class="attach-detailed-overview"><%=impartialityQualityThree%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="impartialityThirdParty4">4. Confidentiality Agreement [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReviewB().equals("Yes")? "checked":StringPool.BLANK%> name="impartialityThirdParty4"> <label
									for="impartialityThirdParty4">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReviewB().equals("No")? "checked":StringPool.BLANK%> name="impartialityThirdParty4"> <label
									for="impartialityThirdParty4">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReviewB().equals("N/A")? "checked":StringPool.BLANK%> name="impartialityThirdParty4"> <label
									for="impartialityThirdParty4">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="impartialityRefThirdParty4" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefmanagementReviewB())?cerBodyManReqInfo.getQMRefmanagementReviewB():""%>" placeholder=""/>
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
														<input type="file" id="impartialityRefThirdPartyAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>impartialityRefThirdPartyAttach4"> 
														<label class="custom-upload" for="impartialityRefThirdPartyAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(impartialityQualityFour)){ %>
												<span class="attach-detailed-overview"><%=impartialityQualityFour%></span>
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
					<p class="tab-form-main-heading"><b>Organizational Structure</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="orgStructureThirdParty1">5. Organizational structure and duties (e.g., job descriptions) for managerial and key certification personnel [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOrgStructure().equals("Yes")? "checked":StringPool.BLANK%> name="orgStructureThirdParty1"> <label
									for="orgStructureThirdParty1">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOrgStructure().equals("No")? "checked":StringPool.BLANK%> name="orgStructureThirdParty1"> <label
									for="orgStructureThirdParty1">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOrgStructure().equals("N/A")? "checked":StringPool.BLANK%> name="orgStructureThirdParty1"> <label
									for="orgStructureThirdParty1">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="orgStructureRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefOrgStruct())?cerBodyManReqInfo.getQMRefOrgStruct():""%>" placeholder=""/>
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
														<input type="file" id="orgStructureRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>orgStructureRefThirdPartyAttach1"> 
														<label class="custom-upload" for="orgStructureRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(orgStruFirst)){ %>
												<span class="attach-detailed-overview"><%=orgStruFirst%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="orgStructureThirdParty2">6. Terms of reference for all committees involved in certification activities [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTermsOfReference().equals("Yes")? "checked":StringPool.BLANK%> name="orgStructureThirdParty2"> <label
									for="orgStructureThirdParty2">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTermsOfReference().equals("No")? "checked":StringPool.BLANK%> name="orgStructureThirdParty2"> <label
									for="orgStructureThirdParty2">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTermsOfReference().equals("N/A")? "checked":StringPool.BLANK%> name="orgStructureThirdParty2"> <label
									for="orgStructureThirdParty2">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="orgStructureRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefTerms())?cerBodyManReqInfo.getQMRefTerms():""%>" placeholder=""/>
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
														<input type="file" id="orgStructureRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>orgStructureRefThirdPartyAttach2"> 
														<label class="custom-upload" for="orgStructureRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(orgStruSec)){ %>
												<span class="attach-detailed-overview"><%=orgStruSec%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="orgStructureThirdParty3">7. Process for control of activities conducted by branches, partnerships, agents, franchises, etc. [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForControl().equals("Yes")? "checked":StringPool.BLANK%> name="orgStructureThirdParty3"> <label
									for="orgStructureThirdParty3">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForControl().equals("No")? "checked":StringPool.BLANK%> name="orgStructureThirdParty3"> <label
									for="orgStructureThirdParty3">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForControl().equals("N/A")? "checked":StringPool.BLANK%> name="orgStructureThirdParty3"> <label
									for="orgStructureThirdParty3">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="orgStructureRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefProcess())?cerBodyManReqInfo.getQMRefProcess():""%>" placeholder=""/>
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
														<input type="file" id="orgStructureRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>orgStructureRefThirdPartyAttach3"> 
														<label class="custom-upload" for="orgStructureRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(orgStruFirstThree)){ %>
												<span class="attach-detailed-overview"><%=orgStruFirstThree%></span>
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
					<p class="tab-form-main-heading"><b>Resources</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty1">8. Procedure of management and monitoring of
								competence of certification personnel [F, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCriteriaReq().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty1"> <label
									for="resourcesThirdParty1">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCriteriaReq().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty1"> <label
									for="resourcesThirdParty1">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCriteriaReq().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty1"> <label
									for="resourcesThirdParty1">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefCriteria())?cerBodyManReqInfo.getQMRefCriteria():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach1"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalFirst)){ %>
												<span class="attach-detailed-overview"><%=approvalFirst%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty2">9. Criteria of required knowledge and skills necessary to perform audits and certification tasks [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInitialCompetence().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty2"> <label
									for="resourcesThirdParty2">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInitialCompetence().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty2"> <label
									for="resourcesThirdParty2">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInitialCompetence().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty2"> <label
									for="resourcesThirdParty2">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefInitial())?cerBodyManReqInfo.getQMRefInitial():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach2"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalSec)){ %>
												<span class="attach-detailed-overview"><%=approvalSec%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty3">10. Procedure for initial competence evaluation and monitoring of personnel involved in audit and certification activities (general) [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSelectingTraining().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty3"> <label
									for="resourcesThirdParty3">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSelectingTraining().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty3"> <label
									for="resourcesThirdParty3">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSelectingTraining().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty3"> <label
									for="resourcesThirdParty3">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefSelecting())?cerBodyManReqInfo.getQMRefSelecting():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach3"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalThird)){ %>
												<span class="attach-detailed-overview"><%=approvalThird%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty4">11. Procedure containing audit instructions and relevant information to auditors [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getMonitoringCompetence().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty4"> <label
									for="resourcesThirdParty4">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getMonitoringCompetence().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty4"> <label
									for="resourcesThirdParty4">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getMonitoringCompetence().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty4"> <label
									for="resourcesThirdParty4">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty4" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefMonitoring())?cerBodyManReqInfo.getQMRefMonitoring():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach4"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalFour)){ %>
												<span class="attach-detailed-overview"><%=approvalFour%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty5">12. Monitoring of competence and performance of auditors (including on-site evaluation, review of audit reports and client feedback) [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getWrittenAgreement().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty5"> <label
									for="resourcesThirdParty5">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getWrittenAgreement().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty5"> <label
									for="resourcesThirdParty5">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getWrittenAgreement().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty5"> <label
									for="resourcesThirdParty5">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty5" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefWritten())?cerBodyManReqInfo.getQMRefWritten():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach5"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalFive)){ %>
												<span class="attach-detailed-overview"><%=approvalFive%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty6">13. Description of process for outsourcing of certification activities [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDescOfProcess().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty6"> <label
									for="resourcesThirdParty6">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDescOfProcess().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty6"> <label
									for="resourcesThirdParty6">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDescOfProcess().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty6"> <label
									for="resourcesThirdParty6">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty6" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefDescProcess())?cerBodyManReqInfo.getQMRefDescProcess():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach6"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalSix)){ %>
												<span class="attach-detailed-overview"><%=approvalSix%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty7">14. Contractual arrangements with auditors/experts [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForMonitor().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty7"> <label
									for="resourcesThirdParty7">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForMonitor().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty7"> <label
									for="resourcesThirdParty7">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessForMonitor().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty7"> <label
									for="resourcesThirdParty7">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty7" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefMonitorProcess())?cerBodyManReqInfo.getQMRefMonitorProcess():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach7"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalSeven)){ %>
												<span class="attach-detailed-overview"><%=approvalSeven%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="resourcesThirdParty8">15. Contractual arrangements with outsourced entities [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDesignDevB().equals("Yes")? "checked":StringPool.BLANK%> name="resourcesThirdParty8"> <label
									for="resourcesThirdParty8">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDesignDevB().equals("No")? "checked":StringPool.BLANK%> name="resourcesThirdParty8"> <label
									for="resourcesThirdParty8">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDesignDevB().equals("N/A")? "checked":StringPool.BLANK%> name="resourcesThirdParty8"> <label
									for="resourcesThirdParty8">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="resourcesRefThirdParty8" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefDesignB())?cerBodyManReqInfo.getQMRefDesignB():""%>" placeholder=""/>
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
														<input type="file" id="resourcesRefThirdPartyAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>resourcesRefThirdPartyAttach8"> 
														<label class="custom-upload" for="resourcesRefThirdPartyAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalEight)){ %>
												<span class="attach-detailed-overview"><%=approvalEight%></span>
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
					<p class="tab-form-main-heading"><b>Information</b></p>
					<p class="tab-form-main-heading">16. Information made publicly available/accessible with
						respect to the following</p>
				</div>
				<div class="col-md-12 ml-3">
					<div class="row">
						<div class="col-md-12">
							<div class="radiobox border-bottom-0">
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty1">a. Audit processes [M, P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditProcess().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty1"> <label
											for="informationThirdParty1">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditProcess().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty1"> <label
											for="informationThirdParty1">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditProcess().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty1"> <label
											for="informationThirdParty1">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefAuditProcess())?cerBodyManReqInfo.getQMRefAuditProcess():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach1"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfOne)){ %>
												<span class="attach-detailed-overview"><%=approvalInfOne%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty2">b. Processes for granting, refusing, maintaining, renewing, suspending, restoring or withdrawing certification or expanding or reducing the scope of certification [M, P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessGranting().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty2"> <label
											for="informationThirdParty2">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessGranting().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty2"> <label
											for="informationThirdParty2">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProcessGranting().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty2"> <label
											for="informationThirdParty2">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefGranting())?cerBodyManReqInfo.getQMRefGranting():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach2"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalInfoTwo)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoTwo%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty3">c. Management systems and/or certification scheme for which certification is offered [M, P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagemntSys().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty3"> <label
											for="informationThirdParty3">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagemntSys().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty3"> <label
											for="informationThirdParty3">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagemntSys().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty3"> <label
											for="informationThirdParty3">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefManagemnt())?cerBodyManReqInfo.getQMRefManagemnt():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach3"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalInfoThree)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoThree%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty4">d. Use of the certification body's name and certification mark or logo [M, P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getUseOfCertification().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty4"> <label
											for="informationThirdParty4">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getUseOfCertification().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty4"> <label
											for="informationThirdParty4">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getUseOfCertification().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty4"> <label
											for="informationThirdParty4">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty4" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefUseOfCerti())?cerBodyManReqInfo.getQMRefUseOfCerti():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach4"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalInfoFour)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoFour%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty5">e. Handling requests for information, complaints and appeals [M, P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingReq().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty5"> <label
											for="informationThirdParty5">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingReq().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty5"> <label
											for="informationThirdParty5">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingReq().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty5"> <label
											for="informationThirdParty5">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty5" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefHandling())?cerBodyManReqInfo.getQMRefHandling():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach5"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfoFive)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoFive%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty6">f. Impartiality Policy [M]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty6"> <label
											for="informationThirdParty6">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicies().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty6"> <label
											for="informationThirdParty6">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getImpartialityPolicies().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty6"> <label
											for="informationThirdParty6">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty6" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefImpartPolicy())?cerBodyManReqInfo.getQMRefImpartPolicy():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach6"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfoSix)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoSix%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty7">g. Description of the rights and duties of
										applicants and clients [P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProvisionInform().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty7"> <label
											for="informationThirdParty7">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProvisionInform().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty7"> <label
											for="informationThirdParty7">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getProvisionInform().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty7"> <label
											for="informationThirdParty7">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty7" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefProvision())?cerBodyManReqInfo.getQMRefProvision():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach7"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfoSeven)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoSeven%></span>
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
								<div class="form-group management-sys-req-third-party">
									<p class="tab-form-main-heading" id="informationThirdParty8">h. Description CB obtains financial support and general information on the certification fees
										[P]</p>
									<div class="wizard-form-radio mt-2">
										<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationDoc().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty8"> <label
											for="informationThirdParty8">Yes</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationDoc().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty8"> <label
											for="informationThirdParty8">No</label>
									</div>
									<div class="wizard-form-radio mt-2">
										<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationDoc().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty8"> <label
											for="informationThirdParty8">N/A</label>
									</div>
								</div>
								<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
											<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
											<input type="text" class="form-control" id="informationRefThirdParty8" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefCertification())?cerBodyManReqInfo.getQMRefCertification():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach8"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalInfoEight)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoEight%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="informationThirdPart98">17. Provisions for supplying information on certification activities and requirements, geographical areas of operation, status of a certification and certified clients [M]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRulesGoverning().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty9"> <label
									for="informationThirdParty9">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRulesGoverning().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty9"> <label
									for="informationThirdParty9">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRulesGoverning().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty9"> <label
									for="informationThirdParty9">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="informationRefThirdParty9" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefGoverning())?cerBodyManReqInfo.getQMRefGoverning():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach9"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfoNine)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoNine%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="informationThirdPart10">18. Directory of certified products [P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnforcableArrangements().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty10"> <label
									for="informationThirdParty10">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnforcableArrangements().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty10"> <label
									for="informationThirdParty10">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnforcableArrangements().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty10"> <label
									for="informationThirdParty10">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="informationRefThirdParty10" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefEnforcable())?cerBodyManReqInfo.getQMRefEnforcable():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach10"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfoTen)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoTen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="informationThirdParty11">19. Certification documents (sample) [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnsureConfidential().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty11"> <label
									for="informationThirdParty11">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnsureConfidential().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty11"> <label
									for="informationThirdParty11">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getEnsureConfidential().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty11"> <label
									for="informationThirdParty11">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="informationRefThirdParty11" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefEnsureConfid())?cerBodyManReqInfo.getQMRefEnsureConfid():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach11" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach11"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach11"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalInfoEleven)){ %>
												<span class="attach-detailed-overview"><%=approvalInfoEleven%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="informationThirdParty12">20. Rights and duties of certified clients [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInformingMechanism().equals("Yes")? "checked":StringPool.BLANK%> name="informationThirdParty12"> <label
									for="informationThirdParty12">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInformingMechanism().equals("No")? "checked":StringPool.BLANK%> name="informationThirdParty12"> <label
									for="informationThirdParty12">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInformingMechanism().equals("N/A")? "checked":StringPool.BLANK%> name="informationThirdParty12"> <label
									for="informationThirdParty12">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="informationRefThirdParty12" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefInforming())?cerBodyManReqInfo.getQMRefInforming():""%>" placeholder=""/>
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
														<input type="file" id="informationRefThirdPartyAttach12" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>informationRefThirdPartyAttach12"> 
														<label class="custom-upload" for="informationRefThirdPartyAttach12"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalInfTwelve)){ %>
												<span class="attach-detailed-overview"><%=approvalInfTwelve%></span>
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
					<p class="tab-form-main-heading"><b>Certification Process</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty1">21. Application process; application review [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationProcess().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty1"> <label
									for="cerProcessThirdParty1">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationProcess().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty1"> <label
									for="cerProcessThirdParty1">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationProcess().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty1"> <label
									for="cerProcessThirdParty1">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefApplication())?cerBodyManReqInfo.getQMRefApplication():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach1"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProOne)){ %>
												<span class="attach-detailed-overview"><%=approvalProOne%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty2">22. Audit programme; plan for evaluation [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationReview().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty2"> <label
									for="cerProcessThirdParty2">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationReview().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty2"> <label
									for="cerProcessThirdParty2">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getApplicationReview().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty2"> <label
									for="cerProcessThirdParty2">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefReview())?cerBodyManReqInfo.getQMRefReview():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach2"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProTwo)){ %>
												<span class="attach-detailed-overview"><%=approvalProTwo%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty3">23. Procedures for determining audit time [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationCycle().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty3"> <label
									for="cerProcessThirdParty3">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationCycle().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty3"> <label
									for="cerProcessThirdParty3">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCertificationCycle().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty3"> <label
									for="cerProcessThirdParty3">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefCertiCycle())?cerBodyManReqInfo.getQMRefCertiCycle():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach3"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProThree)){ %>
												<span class="attach-detailed-overview"><%=approvalProThree%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty4">24. Sampling programme/plan (if applicable) for multi-site audits [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTime().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty4"> <label
									for="cerProcessThirdParty4">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTime().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty4"> <label
									for="cerProcessThirdParty4">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTime().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty4"> <label
									for="cerProcessThirdParty4">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty4" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefAuditTime())?cerBodyManReqInfo.getQMRefAuditTime():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach4"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProfour)){ %>
												<span class="attach-detailed-overview"><%=approvalProfour%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty5">25. Process for selecting and appointing the audit team [M,P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSamplingProgram().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty5"> <label
									for="cerProcessThirdParty5">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSamplingProgram().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty5"> <label
									for="cerProcessThirdParty5">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSamplingProgram().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty5"> <label
									for="cerProcessThirdParty5">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty5" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefSampling())?cerBodyManReqInfo.getQMRefSampling():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach5"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProFive)){ %>
												<span class="attach-detailed-overview"><%=approvalProFive%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty6">26. Process for conducting audits/evaluations [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditPlanning().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty6"> <label
									for="cerProcessThirdParty6">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditPlanning().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty6"> <label
									for="cerProcessThirdParty6">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditPlanning().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty6"> <label
									for="cerProcessThirdParty6">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty6" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefPlanning())?cerBodyManReqInfo.getQMRefPlanning():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach6"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProSix)){ %>
												<span class="attach-detailed-overview"><%=approvalProSix%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty7">27. Audit Report (sample/template) [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTeam().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty7"> <label
									for="cerProcessThirdParty7">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTeam().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty7"> <label
									for="cerProcessThirdParty7">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditTeam().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty7"> <label
									for="cerProcessThirdParty7">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty7" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefAuditTeam())?cerBodyManReqInfo.getQMRefAuditTeam():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach7"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProSeven)){ %>
												<span class="attach-detailed-overview"><%=approvalProSeven%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty8">28. Process to conduct review of audit results prior to decision [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOnSiteAudit().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty8"> <label
									for="cerProcessThirdParty8">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOnSiteAudit().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty8"> <label
									for="cerProcessThirdParty8">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getOnSiteAudit().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty8"> <label
									for="cerProcessThirdParty8">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty8" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefonSiteAudit())?cerBodyManReqInfo.getQMRefonSiteAudit():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach8"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProEight)){ %>
												<span class="attach-detailed-overview"><%=approvalProEight%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty9">29. Process for transfer of certification [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditReport().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty9"> <label
									for="cerProcessThirdParty9">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditReport().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty9"> <label
									for="cerProcessThirdParty9">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getAuditReport().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty9"> <label
									for="cerProcessThirdParty9">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty9" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefAuditReport())?cerBodyManReqInfo.getQMRefAuditReport():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach9"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProNine)){ %>
												<span class="attach-detailed-overview"><%=approvalProNine%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty10">30. Policy for suspension, withdrawal or reduction of the scope of certification [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCorrectiveActions().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty10"> <label
									for="cerProcessThirdParty10">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCorrectiveActions().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty10"> <label
									for="cerProcessThirdParty10">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getCorrectiveActions().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty10"> <label
									for="cerProcessThirdParty10">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty10" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefCorrective())?cerBodyManReqInfo.getQMRefCorrective():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach10" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach10"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach10"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProTen)){ %>
												<span class="attach-detailed-overview"><%=approvalProTen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty11">31. Procedure(s) for suspension, withdrawal or reduction of the scope of certification [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getReviewPriorDecision().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty11"> <label
									for="cerProcessThirdParty11">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getReviewPriorDecision().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty11"> <label
									for="cerProcessThirdParty11">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getReviewPriorDecision().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty11"> <label
									for="cerProcessThirdParty11">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty11" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefReviewPrior())?cerBodyManReqInfo.getQMRefReviewPrior():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach11" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach11"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach11"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProEleven)){ %>
												<span class="attach-detailed-overview"><%=approvalProEleven%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty12">32. Certification documentation [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTransferCertification().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty12"> <label
									for="cerProcessThirdParty12">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTransferCertification().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty12"> <label
									for="cerProcessThirdParty12">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getTransferCertification().equals("N/A")? "checked":StringPool.BLANK%>name="cerProcessThirdParty12"> <label
									for="cerProcessThirdParty12">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty12" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefTransfer())?cerBodyManReqInfo.getQMRefTransfer():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach12" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach12"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach12"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalProTwelve)){ %>
												<span class="attach-detailed-overview"><%=approvalProTwelve%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty13">33. Directory of certified products [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty13"> <label
									for="cerProcessThirdParty13">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionPolicies().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty13"> <label
									for="cerProcessThirdParty13">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionPolicies().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty13"> <label
									for="cerProcessThirdParty13">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty13" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefSuspension())?cerBodyManReqInfo.getQMRefSuspension():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach13" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach13"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach13"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProThirteen)){ %>
												<span class="attach-detailed-overview"><%=approvalProThirteen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty14">34. Procedure to receive, evaluate and make decisions on
								appeals [F, M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionProcedure().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty14"> <label
									for="cerProcessThirdParty14">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionProcedure().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty14"> <label
									for="cerProcessThirdParty14">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getSuspensionProcedure().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty14"> <label
									for="cerProcessThirdParty14">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty14" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefSuspensionProc())?cerBodyManReqInfo.getQMRefSuspensionProc():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach14" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach14"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach14"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProFourteen)){ %>
												<span class="attach-detailed-overview"><%=approvalProFourteen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty15">35. Procedure to receive, evaluate and make decisions on complaints [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDecisionOnAppeals().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty15"> <label
									for="cerProcessThirdParty15">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDecisionOnAppeals().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty15"> <label
									for="cerProcessThirdParty15">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDecisionOnAppeals().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty15"> <label
									for="cerProcessThirdParty15">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty15" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefDecision())?cerBodyManReqInfo.getQMRefDecision():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach15" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach15"> 
														<label class="custom-upload" for=cerProcessRefThirdPartyAttach15"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProFiveteen)){ %>
												<span class="attach-detailed-overview"><%=approvalProFiveteen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty16">36. Record retention policy [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingComplaints().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty16"> <label
									for="cerProcessThirdParty16">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingComplaints().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty16"> <label
									for="cerProcessThirdParty16">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getHandlingComplaints().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty16"> <label
									for="cerProcessThirdParty16">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty16" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefComplaints())?cerBodyManReqInfo.getQMRefComplaints():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach16" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach16"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach16"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProSixteen)){ %>
												<span class="attach-detailed-overview"><%=approvalProSixteen%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="cerProcessThirdParty17">37. Record retention procedure [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionPolicy().equals("Yes")? "checked":StringPool.BLANK%> name="cerProcessThirdParty17"> <label
									for="cerProcessThirdParty17">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionPolicy().equals("No")? "checked":StringPool.BLANK%> name="cerProcessThirdParty17"> <label
									for="cerProcessThirdParty17">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionPolicy().equals("N/A")? "checked":StringPool.BLANK%> name="cerProcessThirdParty17"> <label
									for="cerProcessThirdParty17">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="cerProcessRefThirdParty17" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefRetentionPolicy())?cerBodyManReqInfo.getQMRefRetentionPolicy():""%>" placeholder=""/>
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
														<input type="file" id="cerProcessRefThirdPartyAttach17" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>cerProcessRefThirdPartyAttach17"> 
														<label class="custom-upload" for="cerProcessRefThirdPartyAttach17"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalProSeventeen)){ %>
												<span class="attach-detailed-overview"><%=approvalProSeventeen%></span>
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
					<p class="tab-form-main-heading"><b>Management System</b></p>
				</div>
				<div class="col-md-12">
					<div class="radiobox border-bottom-0">
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty1">38. Management system policies [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysPolicies().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty1"> <label
									for="managementSysThirdParty1">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysPolicies().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty1"> <label
									for="managementSysThirdParty1">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysPolicies().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty1"> <label
									for="managementSysThirdParty1">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty1" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefPolicies())?cerBodyManReqInfo.getQMRefPolicies():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach1" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach1"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach1"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalManOne)){ %>
												<span class="attach-detailed-overview"><%=approvalManOne%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty2">39. Management system objectives [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysObjective().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty2"> <label
									for="managementSysThirdParty2">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysObjective().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty2"> <label
									for="managementSysThirdParty2">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysObjective().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty2"> <label
									for="managementSysThirdParty2">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty2" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefObjective())?cerBodyManReqInfo.getQMRefObjective():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach2" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach2"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach2"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManTwo)){ %>
												<span class="attach-detailed-overview"><%=approvalManTwo%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty3">40. Management system manual or equivalent
								documentation [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysManual().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty3"> <label
									for="managementSysThirdParty3">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysManual().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty3"> <label
									for="managementSysThirdParty3">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManageSysManual().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty3"> <label
									for="managementSysThirdParty3">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty3" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefManual())?cerBodyManReqInfo.getQMRefManual():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach3" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach3"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach3"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManThree)){ %>
												<span class="attach-detailed-overview"><%=approvalManThree%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty4">41. Procedure for document control [F, M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDocControlProcedure().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty4"> <label
									for="managementSysThirdParty4">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDocControlProcedure().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty4"> <label
									for="managementSysThirdParty4">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getDocControlProcedure().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty4"> <label
									for="managementSysThirdParty4">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty4" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefDocControl())?cerBodyManReqInfo.getQMRefDocControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach4" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach4"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach4"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManFour)){ %>
												<span class="attach-detailed-overview"><%=approvalManFour%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty5">42. Procedure for record/data control [F, M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecControlProc().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty5"> <label
									for="managementSysThirdParty5">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecControlProc().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty5"> <label
									for="managementSysThirdParty5">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecControlProc().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty5"> <label
									for="managementSysThirdParty5">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty5" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefRecControl())?cerBodyManReqInfo.getQMRefRecControl():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach5" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach5"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach5"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManFive)){ %>
												<span class="attach-detailed-overview"><%=approvalManFive%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty6">43. Management review [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReview().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty6"> <label
									for="managementSysThirdParty6">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReview().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty6"> <label
									for="managementSysThirdParty6">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getManagementReview().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty6"> <label
									for="managementSysThirdParty6">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty6" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefManagementRev())?cerBodyManReqInfo.getQMRefManagementRev():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach6" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach6"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach6"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManSix)){ %>
												<span class="attach-detailed-overview"><%=approvalManSix%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty7">44. Internal audits [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInternalAudits().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty7"> <label
									for="managementSysThirdParty7">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInternalAudits().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty7"> <label
									for="managementSysThirdParty7">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getInternalAudits().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty7"> <label
									for="managementSysThirdParty7">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty7" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefInternal())?cerBodyManReqInfo.getQMRefInternal():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach7" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach7"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach7"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManSeven)){ %>
												<span class="attach-detailed-overview"><%=approvalManSeven%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty8">45. Procedures for identification and management of corrective actions [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getIdentificationProc().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty8"> <label
									for="managementSysThirdParty8">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getIdentificationProc().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty8"> <label
									for="managementSysThirdParty8">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getIdentificationProc().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty8"> <label
									for="managementSysThirdParty8">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty8" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefIdentification())?cerBodyManReqInfo.getQMRefIdentification():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach8" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach8"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach8"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
												<%if(Validator.isNotNull(approvalManEight)){ %>
												<span class="attach-detailed-overview"><%=approvalManEight%></span>
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
						<div class="form-group management-sys-req-third-party">
							<p class="tab-form-main-heading" id="managementSysThirdParty9">46. Preventive actions; risks [M, P]</p>
							<div class="wizard-form-radio mt-2">
								<input value="Yes" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionProc().equals("Yes")? "checked":StringPool.BLANK%> name="managementSysThirdParty9"> <label
									for="managementSysThirdParty9">Yes</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="No" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionProc().equals("No")? "checked":StringPool.BLANK%> name="managementSysThirdParty9"> <label
									for="managementSysThirdParty9">No</label>
							</div>
							<div class="wizard-form-radio mt-2">
								<input value="N/A" type="radio"<%=cerBodyManReqInfo!=null &&cerBodyManReqInfo.getRecordRetentionProc().equals("N/A")? "checked":StringPool.BLANK%> name="managementSysThirdParty9"> <label
									for="managementSysThirdParty9">N/A</label>
							</div>
						</div>
						<div class="row managementRefThirdParty hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Management/Quality Manual or Other Relevant Reference</p>
									<input type="text" class="form-control" id="managementSysRefThirdParty9" value="<%=Validator.isNotNull(cerBodyManReqInfo)&&Validator.isNotNull(cerBodyManReqInfo.getQMRefRetentionProc())?cerBodyManReqInfo.getQMRefRetentionProc():""%>" placeholder=""/>
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
														<input type="file" id="managementSysRefThirdPartyAttach9" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>managementSysRefThirdPartyAttach9"> 
														<label class="custom-upload" for="managementSysRefThirdPartyAttach9"> 
															<span class="mr-2"> <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
																	  <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
																	 </svg>
															</span>Upload
														</label>
													</div>
												</div>
													<%if(Validator.isNotNull(approvalManNine)){ %>
												<span class="attach-detailed-overview"><%=approvalManNine%></span>
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
	<button type="button" id="saveName" onclick=" accThirdPartyManagementSysReq(false);"
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