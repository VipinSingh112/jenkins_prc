<%@page import="com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="formFiveApplicantInfoUrl" id="/form/five/applicant/info"></portlet:resourceURL>
<portlet:resourceURL var="formFiveDirectorsDetailInfoUrl" id="/form/directors/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="formFiveDelineationAreaInfoUrl" id="/form/five/delineation/area/info"></portlet:resourceURL>
<%
int directorDetailVal=1;
%>
<div class="mining-prospecting-licence-forms" >
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="prospecting-licence-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form No. 5 (Regulation 10)</p>
							<p class="tab-form-title-subtitle f2">Application for an
								Exclusive/Special Exclusive Prospecting Licence</p>
						</div>
					</div>
					<div class="row"> 
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minister through
								the Commissioner of Mines</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of applicant *</p>
								<input type="text" class="form-control"
									id="applicantNameLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNameOfApplicant())?prospectLicence.getNameOfApplicant():"" %>" placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="applicantNameLicenceValidation" style="color: red;">Enter a
									Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>T.R.N./T.C.C. Number</p>
								<input type="text" class="form-control" id="trnNumberLicence"
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNameOfApplicant())?prospectLicence.getNameOfApplicant():"" %>" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Nationality of applicant</p>
								<input type="text" class="form-control"
									id="applicantNationalityLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNameOfApplicant())?prospectLicence.getNameOfApplicant():"" %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<input id="directorDetailVal" type="hidden" name="directorDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="nursingStaffDetailBox">
									<div class="accordion__header is-active"
										id="nursingStaffDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>4. Director Details</h2>
												</div>
											</div>
										</div>
										<div>
											<p class="accordian-employee mb-0 common-para"></p>
										</div>
									</div>
									<div class="accordion__body is-active">
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Name of directors
														of company</p>
													<input type="text" class="form-control"
														id="companyDirectorName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Nationality of
														directors of company</p>
													<input type="text" class="form-control"
														id="companyDirectorNationality" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Body of persons or
														partnership (if any)</p>
													<input type="text" class="form-control"
														id="companyDirectorPartnership" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addDirectorDetail"
													onclick="addDirectorDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class=" table-responsive hide addDirectorDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="adddirectorDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name</th>
											<th class="sub_heading text-nowrap">Nationality</th>
											<th class="sub_heading text-nowrap">Body of persons or partnership</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
											<%if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
											for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd){ %>
											<tr class="director-detail-row<%=directorDetailVal%>">
											<td class="sub_heading_content text-nowrap companyDirectorName<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
											<td class="sub_heading_content text-nowrap companyDirectorNationality<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
											<td class="sub_heading_content text-nowrap companyDirectorPartnership<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
											<td> 
												<span> 
													<a href="javascript:void(0)" id="directorDetailEditTab" onclick="directorDetailEdit('<%=directorDetailVal%>');"> 
												        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
												         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <td> 
												<span> 
													<a href="javascript:void(0)" id="directorDetailDeleteData" onclick="directorDetailDeleteData('<%=directorDetailVal%>');"> 
												        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <input type="hidden" id="directorDetailId<%=directorDetailVal%>" name="directorDetailId<%=directorDetailVal%>" value="<%=directorDetails.getMiningProspectingLicenseAddId()%>">
										</tr>
											<%directorDetailVal=directorDetailVal+1;
											}} %>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Address in Jamaica at which
									notices, etc, may be served</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddressLicence" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getAddressInJamaica())?prospectLicence.getAddressInJamaica():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Telephone No.(s)</p>
								<input type="text" class="form-control"
									id="applicantTelephoneLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getTelephoneNumber())?prospectLicence.getTelephoneNumber():"" %>" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Email address *</p>
								<input type="text" class="form-control"
									id="applicantEmailLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getEmailAddress())?prospectLicence.getEmailAddress():"" %>"
									placeholder="info@companyname.jm" />
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantEmailLicenceValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Number of applicant's
									Prospecting Right</p>
								<input type="text" class="form-control"
									id="applicantNumberLicence" 
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNumberOfApplicant())?prospectLicence.getNumberOfApplicant():"" %>" 
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">9.</span>If a Prospecting Right was
									held by an individual as agent for the applicant, name of that
									agent and number of this Prospecting Right</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control" id="agentNameLicence"
									placeholder="Agent Name" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNameOfTheAgent())?prospectLicence.getNameOfTheAgent():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control"
									id="numProspectingLicence"
									placeholder="Prospecting Right Number" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNumberOfThisProspecting())?prospectLicence.getNumberOfThisProspecting():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>If no Prospecting Right is
									held by the applicant or his agent, the special Circumstances
									in which he is asking for the grant of the</p>
								<input type="text" class="form-control"
									id="agentNameLicenceGrant" placeholder="Circumstances" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getProspectingRight())?prospectLicence.getProspectingRight():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Licence</p>
								<input type="text" class="form-control" id="applicantLicence"
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getLicence())?prospectLicence.getLicence():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">11.</span>Area of Parish</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-sub-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="justicePeaceParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="" disabled selected>Please Select</option>
										<option value="Kingston" <%=prospectLicence!=null?prospectLicence.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
										<option value="St. Andrew" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
										<option value="Portland" <%=prospectLicence!=null?prospectLicence.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
										<option value="St. Thomas" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
										<option value="St. Catherine" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
										<option value="St. Mary" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
										<option value="St. Ann" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
										<option value="Manchester" <%=prospectLicence!=null?prospectLicence.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
										<option value="Clarendon" <%=prospectLicence!=null?prospectLicence.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
										<option value="Hanover" <%=prospectLicence!=null?prospectLicence.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
										<option value="Westmoreland" <%=prospectLicence!=null?prospectLicence.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
										<option value="St. James" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
										<option value="Trelawny" <%=prospectLicence!=null?prospectLicence.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
										<option value="St. Elizabeth" <%=prospectLicence!=null?prospectLicence.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-sub-heading">State the nearest Landmark</p>
								<input type="text" class="form-control"
									id="applicantLandmarkLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getStateTheNearestLandmark())?prospectLicence.getStateTheNearestLandmark():"" %>"
									placeholder="Building, Town, etc.">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-sub-heading">Approximate area (in square
									kilometres)</p>
								<input type="text" class="form-control"
									id="applicantAreaLicence" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getApproximateArea())?prospectLicence.getApproximateArea():"" %>"
									placeholder="Square kilometres" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span>Mineral for which applicant
									desires to prospect</p>
								<input type="text" class="form-control" id="applicantDesires"
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getMineralForWhichApplicant())?prospectLicence.getMineralForWhichApplicant():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.</span>A Financial Statement as to
								the position of the applicant is apprehended hereto</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="detail-operating"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>detail-operating">
												<label class="custom-upload" for="detail-operating">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formLicPosDoc))?formLicPosDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.</span>Is a copy of the Articles
									of Incorporation lodged with the Commissioner</p>
								<div class="wizard-form-radio d-block">
									<input value="Yes" type="radio" name="incorporationLodged" <%=prospectLicence!=null &&prospectLicence.getCopyOfArticle().equals("Yes")?"checked":StringPool.BLANK%>>
									<label for="incorporationLodged">Yes</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="No" type="radio" name="incorporationLodged" <%=prospectLicence!=null &&prospectLicence.getCopyOfArticle().equals("No")?"checked":StringPool.BLANK%>>
									<label for="incorporationLodged">No</label>
								</div>

							</div>
						</div>
						<div class="col-md-12">
							<div class="hide" id="other-copy">
								<div class="form-group">
									<p class="tab-form-main-heading">A copy must be enclosed
										herewith</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="copy-herewith"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="<portlet:namespace/>copy-herewith">
														<label class="custom-upload" for="copy-herewith">
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
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(formLicCopyDoc))?formLicCopyDoc:""%></span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.</span>A sketch plan as required by
								the Regulations is attached hereto</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="fee-attachment"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>fee-attachment"> <label class="custom-upload"
													for="fee-attachment"> <span class="mr-2"> <svg
															width="14" height="17" viewBox="0 0 14 17" fill="none"
															xmlns="http://www.w3.org/2000/svg">
					                                        <path
																d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																fill="#047247"></path>
					                                    </svg>
												</span>Upload
												</label>
											</div>
										</div>
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formLicRegulationDoc))?formLicRegulationDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.</span>The date upon which the
									location beacon was erected was</p>
								<input type="date" class="form-control" id="dateLocationLic"
									value="<%=prospectLicence!=null&&prospectLicence.getDateUponTheLocation()!=null?new SimpleDateFormat("yyyy-MM-dd").format(prospectLicence.getDateUponTheLocation()):StringPool.BLANK %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox" id="proslicenceFeeCheck" value="The appropriate licence fee is forwarded here with" <%=prospectLicence!=null &&prospectLicence.getProslicenceFeeCheck().contains("The appropriate licence fee is forwarded here with")?"checked":StringPool.BLANK%> name="proslicenceFeeCheck"> 
									<label for="proslicenceFeeCheck">
										<p class="tab-form-main-heading mb-0">
											<span class="tab-form-highlghtme-link pr-2">17.</span>The appropriate licence fee is forwarded here with.
										</p>
									</label>
								</div>
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">The appropriate licence fee is forwarded herewith.</p>
								<input type="text" class="form-control" id="licenceFee"
									value="" placeholder="">
							</div>
						</div> -->
					</div>
				</div> 
			</div>
			<button type="button" id="saveName" id="mining-form-5-btn" onclick="exclusiveLicenseApplicantInfoFormFive(false);"
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
				<div class="prospecting-licence-delineation-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Delineation of Area</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">17. The delineation of the
								area is as follows</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									An area of approximately <input type="text" class=""
										id="approximatelyArea" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getApproximatelyArea())?delineationArea.getApproximatelyArea():"" %>" placeholder=""> square
									kilometres.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>location beacon</span> consists of 
									<input type="text" class="" id="location" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getLocation())?delineationArea.getLocation():"" %>" placeholder=""> and is
									situated approximately at the intersection of false
									co-ordinates <input type="text" class="" id="coordinates"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getCoordinates())?delineationArea.getCoordinates():"" %>" placeholder=""> North <input type="text"
										class="" id="northSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getNorthSide())?delineationArea.getNorthSide():"" %>" placeholder=""> East
									on sheet <input type="text" class="" id="eastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getEastSide())?delineationArea.getEastSide():"" %>"
										placeholder=""> of the topographical map of Jamaica.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>first corner</span> is situated approximately at the
									intersection of the false coordinate
								</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="north-side" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstNorthSide())?delineationArea.getFirstNorthSide():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="east-side" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstEastSide())?delineationArea.getFirstEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class="" id="location-grid"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstLocationGrid())?delineationArea.getFirstLocationGrid():"" %>" placeholder=""> metres from the location
									beacon on an approximate grid bearing of <input type="text"
										class="" id="degrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstDegrees())?delineationArea.getFirstDegrees():"" %>" placeholder="">
									degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>Second corner</span> is situated approximately at the
									intersection of the false co- ordinates
								</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="secondNorthSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondNorthSide())?delineationArea.getApproximatelyArea():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="secondEastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondEastSide())?delineationArea.getSecondEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class=""
										id="secondLocationGrid" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondLocationGrid())?delineationArea.getSecondLocationGrid():"" %>" placeholder="">
									metres from the first corner on an approximate grid bearing of
									<input type="text" class="" id="secondDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondDegrees())?delineationArea.getSecondDegrees():"" %>"
										placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>Third corner</span> is situated approximately at the
									intersection of the false co-ordinates <input type="text"
										class="" id="thirdCoordinates" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdCoordinates())?delineationArea.getThirdCoordinates():"" %>" placeholder="">
									North and <input type="text" class="" id="thirdNorthSide"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdNorthSide())?delineationArea.getThirdNorthSide():"" %>" placeholder=""> East approximately <input
										type="text" class="" id="thirdEastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdEastSide())?delineationArea.getThirdEastSide():"" %>"
										placeholder=""> metres from the second corner on an
									approximate grid bearing of <input type="text" class=""
										id="thirdDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdDegrees())?delineationArea.getThirdDegrees():"" %>" placeholder=""> degrees and
									is <input type="text" class="" id="thirdGridLoc" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridLoc())?delineationArea.getThirdGridLoc():"" %>"
										placeholder=""> metres to the location beacon on an
									approximate grid bearing of <input type="text" class=""
										id="thirdGridL" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridL())?delineationArea.getThirdGridL():"" %>" placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>fourth corner</span> is situated approximately at the
									intersection of the false co-ordinates <input type="text"
										class="" id="fourthCoordinates" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthCoordinates())?delineationArea.getFourthCoordinates():"" %>" placeholder="">
									North and <input type="text" class="" id="fourthNorthSide"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthNorthSide())?delineationArea.getFourthNorthSide():"" %>" placeholder=""> East approximately <input
										type="text" class="" id="fourthEastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthEastSide())?delineationArea.getFourthEastSide():"" %>"
										placeholder=""> metres from the second corner on an
									approximate grid bearing of <input type="text" class=""
										id="fourthDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthDegrees())?delineationArea.getFourthDegrees():"" %>" placeholder=""> degrees
									and is <input type="text" class="" id="fourthGridLoc" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthGridLoc())?delineationArea.getFourthGridLoc():"" %>"
										placeholder=""> metres to the location beacon on an
									approximate grid bearing of <input type="text" class=""
										id="fourthGridL" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthGridL())?delineationArea.getFourthGridL():"" %>" placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>fifth corner</span> is situated approximately at the
									intersection of the false co-ordinates<input type="text"
										class="" id="fifthCoordinates" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthCoordinates())?delineationArea.getFifthCoordinates():"" %>" placeholder="">
									North and <input type="text" class="" id="fifthNorthSide"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthNorthSide())?delineationArea.getFifthNorthSide():"" %>" placeholder=""> East approximately <input
										type="text" class="" id="fifthEastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthEastSide())?delineationArea.getFifthEastSide():"" %>"
										placeholder=""> metres from the second corner on an
									approximate grid bearing of <input type="text" class=""
										id="fifthDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthDegrees())?delineationArea.getFifthDegrees():"" %>" placeholder=""> degrees and
									is <input type="text" class="" id="fifthGridLoc" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthGridLoc())?delineationArea.getFifthGridLoc():"" %>"
										placeholder=""> metres to the location beacon on an
									approximate grid bearing of <input type="text" class=""
										id="fifthGridL" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthGridL())?delineationArea.getFifthGridL():"" %>" placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureMiningImageHolder">
							<%if(Validator.isNotNull(signLicUrl)){ %>
							<img src="<%=signLicUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureMiningBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureMiningBtn">
							<label for="applicantSignatureMiningBtn" class="choose-sign-btn">
								<span class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
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
<style>
/* .tab-plus-wizard .tab-form input {
	margin-bottom: 6px;
} */
</style>
<script>
function exclusiveLicenseApplicantInfoFormFive(theSaveandContinue){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	applicantNameLicence=$("#applicantNameLicence").val();
	trnNumberLicence=$("#trnNumberLicence").val();
	applicantNationalityLicence=$("#applicantNationalityLicence").val();
	applicantAddressLicence=$("#applicantAddressLicence").val();
	applicantTelephoneLicence=$("#applicantTelephoneLicence").val();
	applicantEmailLicence=$("#applicantEmailLicence").val();
	applicantNumberLicence=$("#applicantNumberLicence").val();
	agentNameLicence=$("#agentNameLicence").val();
	numProspectingLicence=$("#numProspectingLicence").val();
	agentNameLicenceGrant=$("#agentNameLicenceGrant").val();
	applicantLicence=$("#applicantLicence").val();
	justicePeaceParish=$("#justicePeaceParish").val();
	applicantLandmarkLicence=$("#applicantLandmarkLicence").val();
	applicantAreaLicence=$("#applicantAreaLicence").val();
	applicantDesires=$("#applicantDesires").val();
	dateLocationLic=$("#dateLocationLic").val();
	var proslicFeeCheck = new Array();
	$("input:checkbox[name=proslicenceFeeCheck]:checked").each(function(){
		proslicFeeCheck.push($(this).val());
	});
	var proslicenceFeeCheck = proslicFeeCheck.toString();
	incorporationLodged=$("input[name='incorporationLodged']:checked").val();
	applicantNameLicence= $("#applicantNameLicence").val();
	applicantEmailLicence= $("#applicantEmailLicence").val();
		 submitForm= true;
		 if(!theSaveandContinue){
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(!applicantEmailLicence){
			$("#applicantEmailLicenceValidation").removeClass("hide");
			$("#applicantEmailLicenceValidation").text("Please Enter Email Address");
			$("#applicantEmailLicence").focus();
			submitForm= false;
		}else if(applicantEmailLicence.match(mailformat)){ 
			$("#applicantEmailLicenceValidation").addClass("hide");
		}else{
			$("#applicantEmailLicenceValidation").removeClass("hide");
			$("#applicantEmailLicenceValidation").text("You have Entered an In-valid email address");
			$("#applicantEmailLicence").focus();
			submitForm= false;
		}
		if(!applicantNameLicence){
			$("#applicantNameLicenceValidation").removeClass("hide");
			$("#applicantNameLicence").focus();
			submitForm= false;
		}else{
			$("#applicantNameLicenceValidation").addClass("hide");
		    }	
		}
			if(submitForm){
	$.ajax({
	    type: "POST",
	    url: "${formFiveApplicantInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>applicantNameLicence": applicantNameLicence,
		     "<portlet:namespace/>trnNumberLicence": trnNumberLicence,
		     "<portlet:namespace/>applicantNationalityLicence": applicantNationalityLicence,
		     "<portlet:namespace/>applicantAddressLicence": applicantAddressLicence,
		     "<portlet:namespace/>applicantTelephoneLicence": applicantTelephoneLicence,
		     "<portlet:namespace/>applicantEmailLicence": applicantEmailLicence,
		     "<portlet:namespace/>applicantNumberLicence": applicantNumberLicence,
		     "<portlet:namespace/>agentNameLicence": agentNameLicence,
		     "<portlet:namespace/>numProspectingLicence": numProspectingLicence,
		     "<portlet:namespace/>agentNameLicenceGrant": agentNameLicenceGrant,
		     "<portlet:namespace/>applicantLicence": applicantLicence,
		     "<portlet:namespace/>justicePeaceParish": justicePeaceParish,
		     "<portlet:namespace/>applicantLandmarkLicence": applicantLandmarkLicence,
		     "<portlet:namespace/>applicantAreaLicence": applicantAreaLicence,
		     "<portlet:namespace/>applicantDesires": applicantDesires,
		     "<portlet:namespace/>dateLocationLic": dateLocationLic,
		     "<portlet:namespace/>proslicenceFeeCheck": proslicenceFeeCheck,
		     "<portlet:namespace/>incorporationLodged": incorporationLodged,

		    },
	    success: function (data) {
	    	uploadDocuments('detail-operating',"LICENCE POSITION OF APPLICANT", "A Financial Statement as to the position of the applicant is apprehended hereto");
	    	uploadDocuments('fee-attachment',"LICENCE REGULATION PLAN", "A sketch plan as required by the Regulations is attached hereto");
	    	uploadDocuments('copy-herewith',"LICENCE COPYENCLOSED HEREWITH", "A copy must be enclosed herewith");
			$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			if(!theSaveandContinue){
				applicantInfo();
			}
			addDirectorDetail();
	    },
	    error: function (data) {},
	  });
	}
}
function exclusiveLicenseDirectorsDetailInfo(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	companyDirectorName=$("#companyDirectorName").val();
	companyDirectorNationality=$("#companyDirectorNationality").val();
	companyDirectorPartnership=$("#companyDirectorPartnership").val();
	directorDetailVal=$("#directorDetailVal").val();
	
	
	$.ajax({
	    type: "POST",
	    url: "${formFiveDirectorsDetailInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>companyDirectorName": companyDirectorName,
		     "<portlet:namespace/>companyDirectorNationality": companyDirectorNationality,
		     "<portlet:namespace/>companyDirectorPartnership": companyDirectorPartnership,
		     "<portlet:namespace/>count" : directorDetailVal,

		    },
	    success: function (data) {
	    	var result=data.APP_DATA;
			$("#directorDetailId"+result["count"]).val(result["directorDetailId"]);
	    },
	    error: function (data) {},
	  });
}
function licenseDelineationAreaInfoFormFive(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	approximatelyArea=$("#approximatelyArea").val();
	locationBeacon=$("#location").val();
	coordinates=$("#coordinates").val();
	northSide=$("#northSide").val();
	eastSide=$("#eastSide").val();
	firstNorthSide=$("#north-side").val();
	firstEastSide=$("#east-side").val();
	firstLocationGrid=$("#location-grid").val();
	firstDegrees=$("#degrees").val();
	secondNorthSide=$("#secondNorthSide").val();
	secondEastSide=$("#secondEastSide").val();
	secondLocationGrid=$("#secondLocationGrid").val();
	secondDegrees=$("#secondDegrees").val();
	thirdCoordinates=$("#thirdCoordinates").val();
	thirdNorthSide=$("#thirdNorthSide").val();
	thirdEastSide=$("#thirdEastSide").val();
	thirdDegrees=$("#thirdDegrees").val();
	thirdGridLoc=$("#thirdGridLoc").val();
	thirdGridL=$("#thirdGridL").val();
	fourthCoordinates=$("#fourthCoordinates").val();
	fourthNorthSide=$("#fourthNorthSide").val();
	fourthEastSide=$("#fourthEastSide").val();
	fourthDegrees=$("#fourthDegrees").val();
	fourthGridLoc=$("#fourthGridLoc").val();
	fourthGridL=$("#fourthGridL").val();
	fifthCoordinates=$("#fourthCoordinates").val();
	fifthNorthSide=$("#fifthNorthSide").val();
	fifthEastSide=$("#fifthEastSide").val();
	fifthDegrees=$("#fifthDegrees").val();
	fifthGridLoc=$("#fifthGridLoc").val();
	fifthGridL=$("#fifthGridL").val();
	$.ajax({
	    type: "POST",
	    url: "${formFiveDelineationAreaInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>approximatelyArea": approximatelyArea,
		     "<portlet:namespace/>locationBeacon": locationBeacon, 
		     "<portlet:namespace/>coordinates": coordinates,
		     "<portlet:namespace/>northSide": northSide,
		     "<portlet:namespace/>eastSide": eastSide,
		     
		     "<portlet:namespace/>firstNorthSide": firstNorthSide,
		     "<portlet:namespace/>firstEastSide": firstEastSide,
		     "<portlet:namespace/>firstLocationGrid": firstLocationGrid,
		     "<portlet:namespace/>firstDegrees": firstDegrees,
		     
		     "<portlet:namespace/>secondNorthSide": secondNorthSide,
		     "<portlet:namespace/>secondEastSide": secondEastSide,
		     "<portlet:namespace/>secondLocationGrid": secondLocationGrid,
		     "<portlet:namespace/>secondDegrees": secondDegrees,
		     
		     "<portlet:namespace/>thirdCoordinates": thirdCoordinates,
		     "<portlet:namespace/>thirdNorthSide": thirdNorthSide,
		     "<portlet:namespace/>thirdEastSide": thirdEastSide,
		     "<portlet:namespace/>thirdDegrees": thirdDegrees,
		     "<portlet:namespace/>thirdGridLoc": thirdGridLoc,
		     "<portlet:namespace/>thirdGridL": thirdGridL,
		     
		     "<portlet:namespace/>fourthCoordinates": fourthCoordinates,
		     "<portlet:namespace/>fourthNorthSide": fourthNorthSide,
		     "<portlet:namespace/>fourthEastSide": fourthEastSide,
		     "<portlet:namespace/>fourthDegrees": fourthDegrees,
		     "<portlet:namespace/>fourthGridLoc": fourthGridLoc,
		     "<portlet:namespace/>fourthGridL": fourthGridL,
		     
		     "<portlet:namespace/>fifthCoordinates": fifthCoordinates,
		     "<portlet:namespace/>fifthNorthSide": fifthNorthSide,
		     "<portlet:namespace/>fifthEastSide": fifthEastSide,
		     "<portlet:namespace/>fifthDegrees": fifthDegrees,
		     "<portlet:namespace/>fifthGridLoc": fifthGridLoc,
		     "<portlet:namespace/>fifthGridL": fifthGridL,

		    },
	    success: function (data) {
	    	uploadDocuments('applicantSignatureMiningBtn',"Licence Signature of Applicant",""); 
	    },
	    error: function (data) {},
	  });
}
</script>
