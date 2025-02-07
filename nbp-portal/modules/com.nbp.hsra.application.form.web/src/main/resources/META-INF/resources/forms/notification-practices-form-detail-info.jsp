<%@page import="com.nbp.hsra.application.service.service.NotifiLegalInfoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.NotifiLegalInfo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.hsra.application.service.service.RadionuclideInfoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadionuclideInfo"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page
	import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
	<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
	<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="../init.jsp" %>
	<%
	RadionuclideInfo radioData = null;
	NotifiLegalInfo notifiLegalInfo = null;
	
	if (hsraApplicationId > 0) {
		
		
	
			try {
				radioData = RadionuclideInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {
			}
			try {
				notifiLegalInfo = NotifiLegalInfoLocalServiceUtil.getHsraById(hsraApplicationId);
			} catch (Exception e) {
			}
		}
	%>
		<div class="tab-pane notification-practices-forms" role="tabpanel" id="childStep10">
			<div class="tab-form">
				<div class="notification-practices-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form for Notification of
								Practices and Sources</p>
							<p class="tab-form-title-subtitle f2">Section 1 : Address and Contact
								Information</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">1.</span> Name and
									address of the legal person*.
								</p>
								<input type="text" class="form-control" id="legalPersonName"
									placeholder="Name" value="<%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getLegalPersonName())?notifiLegalInfo.getLegalPersonName():""%>" oninput="">
									<p class="tab-form-sub-heading fieldAlert hide" id="legalPersonNameValidation" style="color: red;">Enter a Name and Address of Applicant</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="legalPersonAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getLegalPersonAddress())?notifiLegalInfo.getLegalPersonAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">2.</span> Name and
									address of the organization.
								</p>
								<input type="text" class="form-control" id="organizationNameLegal"
									placeholder="Organization Name" value="<%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getOrganizationName())?notifiLegalInfo.getOrganizationName():""%>" oninput="">
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="organizationAddress" placeholder="Organization Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getOrganizationAddress())?notifiLegalInfo.getOrganizationAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">3.</span> Contact
									Number
								</p>
								<input type="text" class="form-control" id="contactNumber"
									placeholder="+1 876-876-1234" value="<%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getContactNumber())?notifiLegalInfo.getContactNumber():""%>" oninput=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address*</p>
								<input type="text" class="form-control" id="legalPersonEmail"
									value="<%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getLegalPersonEmail())?notifiLegalInfo.getLegalPersonEmail():""%>" placeholder="info@companyname.jm">
									<p class="tab-form-sub-heading fieldAlert hide" id="legalPersonEmailValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">4.</span> Nature of
									the practice in which the source is used
								</p>
								<input type="text" class="form-control mt-3" id="practiceNature"
									placeholder="" value="<%=Validator.isNotNull(notifiLegalInfo)&&Validator.isNotNull(notifiLegalInfo.getPracticeNature())?notifiLegalInfo.getPracticeNature():""%>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addLegalInformation(false);"
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
		<div class="tab-pane notification-practices-forms" role="tabpanel" id="childStep11">
			<div class="tab-form">
				<div class="details-source-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section 2 : Details of Source</p>
							<p class="tab-form-title-subtitle">("Source" means a radiation
								generator, a radioactive source or other radioactive material.)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<input id="sourcesDetailVal" type="hidden"
								name="sourcesDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="sourcesDetailValBox">
									<div class="accordion__header is-active"
										id="sourcesDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Details of Source</h2>
													
													</p>
												</div>
											</div>
										</div>
										<div>
											<p class="accordian-employee mb-0 common-para"></p>
										</div>
									</div>
									<div class="accordion__body is-active">
										<div class="row">
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">
														<span class="tab-form-highlghtme-link pr-2">5.</span>
														Identification of source
													</p>
													<input type="text" class="form-control mt-3"
														id="sourceIdentification" placeholder="" value="">
												</div>
											</div>
											<!-- <div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">
														<span class="tab-form-highlghtme-link pr-2">6.</span> Location
													</p>
													<textarea rows="3" class="form-control" maxlength="255"
														id="sourceLocation" placeholder="Location"
														style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
												</div>
											</div> -->
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">
														<span class="tab-form-highlghtme-link pr-2">6.</span> State
														field of application and purpose of the activity in which the
														radiation source is or will be used
													</p>
													<textarea rows="3" class="form-control" maxlength="255"
														id="stateActivity" placeholder=""
														style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addSourcesDetail"
													onclick="addSourcesDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						<div class="row">
							<div class="col-12 table-responsive hide addSourcesDetailTableBox">
								<table class="table table-bordered mb-3">
								<tbody class="addSourcesDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Identification of
											source</th>
										<th class="sub_heading text-nowrap">Field of application
											and purpose of the Activity</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
									<%
										if (sourcesDetailAdd != null) {
											long sourcesDetailAddCounter = 1;
											for (SourcesDetailAdd sourcesDetailInfo : sourcesDetailAdd) {
									%>
									<tr class="sources-detail-row<%=sourcesDetailAddCounter%>">
										<td
											class="sub_heading_content sourceIdentification<%=sourcesDetailAddCounter%>">
											<%=Validator.isNotNull(sourcesDetailInfo)
							&& Validator.isNotNull(sourcesDetailInfo.getSourceIdentification())
									? sourcesDetailInfo.getSourceIdentification()
									: ""%>
										</td>
										<td
											class="sub_heading_content stateActivity<%=sourcesDetailAddCounter%>">
											<%=Validator.isNotNull(sourcesDetailInfo)
							&& Validator.isNotNull(sourcesDetailInfo.getStateActivity())
									? sourcesDetailInfo.getStateActivity()
									: ""%>
										</td>
										<td><span> <a href="javascript:void(0)"
												id="sourcesDetailEditTab"
												onclick="sourcesDetailEditTab('<%=sourcesDetailAddCounter%>');">
													<svg width="19" height="19" viewBox="0 0 19 19" fill="none"
														xmlns="http://www.w3.org/2000/svg"> 
		         <path
															d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
															fill="#047247"></path> 
		        </svg>
											</a>
										</span></td>
										<td><span> <a href="javascript:void(0)"
												id="sourcesDetailDeleteDataTab"
												onclick="sourcesDetailDeleteData('<%=sourcesDetailAddCounter%>');">
													<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
														xmlns="http://www.w3.org/2000/svg">
		        <path
															d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
															fill="#047247"></path>
		        </svg>
											</a>
										</span></td>
									</tr>
									<input type="hidden"
										id="sourcesDetailId<%=sourcesDetailAddCounter%>"
										name="sourcesDetailId<%=sourcesDetailAddCounter%>"
										value="<%=sourcesDetailInfo.getSourcesDetailAddId()%>">
									<%
									sourcesDetailAddCounter++;
											}
										}
									%>
								</tbody>
							</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();addDetailSource(false);"
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
		<div class="tab-pane notification-practices-forms" role="tabpanel" id="childStep12">
			<div class="tab-form">
				<div class="radionuclide-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section 3 :Radionuclide</p>
						</div>
					</div>
			 		<div class="row">
                         <div class="col-md-12">
							<input id="radionuclideDetailVal" type="hidden"
								name="radionuclideDetailVal" value="1">
								<div class="">
									<div class="accordion secured-accordian"
										id="radionuclideDetailBox">
										<div class="accordion__header is-active"
											id="radionuclideDetail" onclick="expandDetails(this.id)">
											<div class="d-flex align-items-center">
												<div class="d-flex align-items-center">
													<div>
														<span class="accordion__toggle"></span>
													</div>
													<div>
														<h2>Radionuclide</h2>
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
														<p class="tab-form-main-heading">Radionuclide</p>
														<input type="text" class="form-control mt-3"
															id="radionuclideDetails" placeholder="" value="">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Activity(Bq)</p>
														<input type="text" class="form-control mt-3"
															id="activityDetails" placeholder="" value="">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Activity Date</p>
														<input type="date" class="form-control mt-3" id="activityDate"
															placeholder="" value="">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Chemical form</p>
														<input type="text" class="form-control mt-3"
															id="chemicalDetailsForm" placeholder="" value="">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Serial No</p>
														<input type="text" class="form-control mt-3" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" id="serialNo"
															placeholder="" value="">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<p class="tab-form-main-heading">Location</p>
														<textarea rows="3" class="form-control" maxlength="255"
															id="radionuclideLocation" placeholder="Location"
															style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
													</div>
												</div>
												<div class="col-md-12 d-flex justify-content-end py-4">
													<a href="javascript:void(0);" class="add-more-employee"
														id="addRadionuclideDetail"
														onclick="addRadionuclideDetail();"> <span>+ 1</span>
														Add More
													</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							<div class="row">
								<div class="col-12 table-responsive hide addRadionuclideDetailTableBox">
									<table class="table table-bordered mb-3">
										<tbody class="addRadionuclideDetailTable">
											<tr>
												<th class="sub_heading text-nowrap">Radionuclide</th>
												<th class="sub_heading text-nowrap">Activity(Bq)</th>
												<th class="sub_heading text-nowrap">Activity Date</th>
												<th class="sub_heading text-nowrap">Chemical form</th>
												<th class="sub_heading text-nowrap">Serial No</th>
												<th class="sub_heading text-nowrap">Location</th>
												<th class="sub_heading">Edit</th>
												<th class="sub_heading">Delete</th>
											</tr>

							 <%
										if (radionuclideAdd != null) {
											long radionuclideAddCounter = 1;
											for (RadionuclideAdd radionuclideinfo : radionuclideAdd) {
									%>
									<tr class="radionuclide-detail-row<%=radionuclideAddCounter%>">
										<td
											class="sub_heading_content radionuclideDetails<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getRadionuclideDetails())
									? radionuclideinfo.getRadionuclideDetails()
									: ""%>
										</td>
										<td
											class="sub_heading_content activityDetails<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getActivityDetails())
									? radionuclideinfo.getActivityDetails()
									: ""%></td>
										<td
											class="sub_heading_content activityDate<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getActivityDate())
									? new SimpleDateFormat("yyyy-MM-dd").format(radionuclideinfo.getActivityDate())
									: ""%></td>
										<td
											class="sub_heading_content chemicalDetailsForm<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getChemicalDetailsForm())
									? radionuclideinfo.getChemicalDetailsForm()
									: ""%></td>
										<td
											class="sub_heading_content serialNo<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo) && Validator.isNotNull(radionuclideinfo.getSerialNo())
									? radionuclideinfo.getSerialNo()
									: ""%></td>
										<td
											class="sub_heading_content radionuclideLocation<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getRadionuclideLocation())
									? radionuclideinfo.getRadionuclideLocation()
									: ""%></td>
										<td><span> <a href="javascript:void(0)"
												id="radionuclideDetailEditTab"
												onclick="radionuclideDetailEditTab('<%=radionuclideAddCounter%>');">
													<svg width="19" height="19" viewBox="0 0 19 19" fill="none"
														xmlns="http://www.w3.org/2000/svg"> 
		         <path
															d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
															fill="#047247"></path> 
		        </svg>
											</a>
										</span></td>
										<td><span> <a href="javascript:void(0)"
												id="radionuclideDetailDeleteDataTab"
												onclick="radionuclideDetailDeleteData('<%=radionuclideAddCounter%>');">
													<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
														xmlns="http://www.w3.org/2000/svg">
		        <path
															d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
															fill="#047247"></path>
		        </svg>
											</a>
										</span></td>
									</tr>
									<input type="hidden"
										id="radionuclideDetailId<%=radionuclideAddCounter%>"
										name="radionuclideDetailId<%=radionuclideAddCounter%>"
										value="<%=radionuclideinfo.getRadionuclideAddId()%>">
									<%
							radionuclideAddCounter++;
							}
 }
						%>
							</tbody>
									</table>
								</div>
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Sealed source</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"<%=radioData!=null &&radioData.getSealedSource().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="sealedSource"
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"<%=radioData!=null &&radioData.getSealedSource().equals("No")?"checked":StringPool.BLANK%> type="radio" name="sealedSource"
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="row hide" id="sealedManu">
								<div class="col-md-12">
									<div>
										<div class="form-group">
											<p class="tab-form-main-heading">Manufacturer</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="manufacturerDetails" placeholder=""
												style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(radioData)&&Validator.isNotNull(radioData.getManufacturerDetails())?radioData.getManufacturerDetails():""%></textarea>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div>
										<div class="form-group">
											<p class="tab-form-main-heading">Model No</p>
											<input type="text" class="form-control" id="modelNo"
												value="<%=Validator.isNotNull(radioData)&&Validator.isNotNull(radioData.getModelNo())?radioData.getModelNo():""%>"
												oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 sealNoMenu hide">
							<div>
								<div class="form-group">
									<p class="tab-form-main-heading">Identification no./code</p>
									<input type="text" class="form-control" id="identificationNo"
									value="<%=Validator.isNotNull(radioData)&&Validator.isNotNull(radioData.getIdentificationNo())?radioData.getIdentificationNo():""%>"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Status</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="statusDetails">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="In Use"<%=radioData!=null?radioData.getStatusDetails().equals("In Use")?"selected":"":StringPool.BLANK%>>In Use</option>
										<option value="Out of Use"<%=radioData!=null?radioData.getStatusDetails().equals("Out of Use")?"selected":"":StringPool.BLANK%>>Out of Use</option>
										<option value="In Storage"<%=radioData!=null?radioData.getStatusDetails().equals("In Storage")?"selected":"":StringPool.BLANK%>>In Storage</option>
										<option value="Disused"<%=radioData!=null?radioData.getStatusDetails().equals("Disused")?"selected":"":StringPool.BLANK%>>Disused</option>
									</select>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();addRadionuclideButton(false);"
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
		<div class="tab-pane notification-practices-forms" role="tabpanel" id="childStep13">
			<div class="tab-form">
				<div class="radionuclide-generation-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section 4 : Radiation Generating
								Equipment</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<input id="genEquipmentDetailVal" type="hidden"
								name="genEquipmentDetailVal" value="1">
								<div class="">
									<div class="accordion secured-accordian"
										id="genEquipmentDetailBox">
										<div class="accordion__header is-active"
											id="genEquipmentDetail" onclick="expandDetails(this.id)">
											<div class="d-flex align-items-center">
												<div class="d-flex align-items-center">
													<div>
														<span class="accordion__toggle"></span>
													</div>
													<div>
														<h2>Radiation Generating Equipment</h2>
													</div>
												</div>
											</div>
											<div>
												<p class="accordian-employee mb-0 common-para"></p>
											</div>
										</div>
										<div class="accordion__body is-active">
											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<p class="tab-form-main-heading">Manufacturer</p>
														<textarea rows="3" class="form-control" maxlength="255"
															id="manufacturerEquipment" placeholder=""
															style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading" for="model">Model No</p>
														<input type="text" class="form-control" id="equipmentModel"
															value=""
															oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading" for="serial no">Serial No</p>
														<input type="text" class="form-control" id="equipmentSerial"
															value=""
															oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<p class="tab-form-main-heading">Max. Operating Potential</p>
														<input type="text" class="form-control"
															id="operatingPotential" placeholder="" value="">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<p class="tab-form-main-heading">Nature of the equipment in
															which the source is installed (Medical, Industrial etc.)</p>
														<textarea rows="3" class="form-control" maxlength="255"
															id="natureEquipment" placeholder=""
															style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<p class="tab-form-main-heading">Location</p>
														<textarea rows="3" class="form-control" maxlength="255"
															id="radiationGeneratingLoc" placeholder="Location"
															style="border-radius: 5px; width: 100%" spellcheck="false"></textarea>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Model</p>
														<input type="text" class="form-control mt-3"
															id="equipmentModels" placeholder="" value="">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Status</p>
														<div class="select-wrapper position-relative">
															<select class="form-select form-control" name="pselect"
																id="equipmentStatusDetail">
																<option value="" disabled="" selected="">Please
																	Select</option>
																<option value="In Use">In Use</option>
																<option value="Out of Use">Out of Use</option>
																<option value="In Storage">In Storage</option>
																<option value="Disused">Disused</option>
															</select>
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<p class="tab-form-main-heading">Date</p>
														<input type="date" class="form-control mt-3" id="equipmentDate"
															placeholder="" value="">
													</div>
												</div>
												<div class="col-md-12">
													<p class="pt-2 common-para">Signature of legal person</p>
													<%
															if (Validator.isNotNull(fileUrlOfLegalPerson)) {
														%>
															<div class="signature_texarea mb-2"
															id="legalPersonSignature">
															<img src="<%=fileUrlOfLegalPerson%>" class="thumb-image"
																style="height: 100px; width: 100px;">
														</div>
														<%
															} else {
														%>
														<div class="signature_texarea mb-2"
															id="legalPersonSignature"></div>
														<%
															}
														%>
													
													<input type="file" id="legalPersonSignatureBtn" hidden=""
														name="<portlet:namespace/>legalPersonSignatureBtn">
													<label for="legalPersonSignatureBtn"
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
												<div class="col-md-12 d-flex justify-content-end py-4">
													<a href="javascript:void(0);" class="add-more-employee"
														id="addGenEquipmentDetail"
														onclick="addGenEquipmentDetail();"> <span>+ 1</span>
														Add More
													</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							<div class="row">
								<div class="col-12 table-responsive hide addGenEquipmentDetailTableBox">
									<table class="table table-bordered mb-3">
										<tbody class="addGenEquipmentDetailTable">
											<tr>
												<th class="sub_heading text-nowrap">Manufacturer</th>
												<th class="sub_heading text-nowrap">Model No</th>
												<th class="sub_heading text-nowrap">Serial No</th>
												<th class="sub_heading text-nowrap">Max. Operating Potential</th>
												<th class="sub_heading text-nowrap">Nature of the equipment in which the source is installed</th>
												<th class="sub_heading text-nowrap">Location</th>
												<th class="sub_heading text-nowrap">Model</th>
												<th class="sub_heading text-nowrap">Status</th>
												<th class="sub_heading text-nowrap">Date</th>
												<th class="sub_heading text-nowrap">Signature of legal person</th>
												<th class="sub_heading">Edit</th>
												<th class="sub_heading">Delete</th>
											</tr>
									<%

											List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
												DLFolder supportingDocumentsParentFolder = null;
												DLFolder supportingDocumentsFolder = null;
												DLFolder supportingDocumentSubFolderManagment = null;
												try {
													supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
													supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															supportingDocumentsParentFolder.getFolderId(), String.valueOf(hsraApplicationId));
												} catch (Exception e) {
												}
										if (genEquipmentData != null) {
											long genEquipmentDataCounter = 1;
											for (GenEquipmentData genEquipmentInfo : genEquipmentData) {
												FileEntry attachDocFE=null;

												try {
													supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
															themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
															"Signature of Equip"+genEquipmentDataCounter);
													fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
															supportingDocumentSubFolderManagment.getFolderId());
													for (DLFileEntry dlFileEntry : fileEntry) {
														attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
														fileUrlOfLegalPerson=DLURLHelperUtil.getPreviewURL(attachDocFE,
																attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
																System.out.println("--------------------------FileUrlOfLegalPerson--------------"+fileUrlOfLegalPerson);
														
													}
												} catch (Exception e) {
												}
												
												System.out.println("---------------------counter------------------"+genEquipmentDataCounter);
									%>
									<tr class="gen-equipment-row<%=genEquipmentDataCounter%>">
										<td
											class="sub_heading_content manufacturerEquipment<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getManufacturerEquipment())
									? genEquipmentInfo.getManufacturerEquipment()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentModel<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentModel())
									? genEquipmentInfo.getEquipmentModel()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentSerial<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentSerial())
									? genEquipmentInfo.getEquipmentSerial()
									: ""%>
										</td>
										<td
											class="sub_heading_content operatingPotential<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getOperatingPotential())
									? genEquipmentInfo.getOperatingPotential()
									: ""%>
										</td>
										<td
											class="sub_heading_content natureEquipment<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getNatureEquipment())
									? genEquipmentInfo.getNatureEquipment()
									: ""%>
										</td>
										<td
											class="sub_heading_content radiationGeneratingLoc<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getRadiationGeneratingLoc())
									? genEquipmentInfo.getRadiationGeneratingLoc()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentModels<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentModels())
									? genEquipmentInfo.getEquipmentModels()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentStatusDetail<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentStatusDetail())
									? genEquipmentInfo.getEquipmentStatusDetail()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentDate<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentDate())
									? new SimpleDateFormat("yyyy-MM-dd").format(genEquipmentInfo.getEquipmentDate())
									: ""%>
										</td>
										<td
										class="sub_heading_content legalPersonSignature<%=genEquipmentDataCounter%>">
											<div class="signature_texarea mb-2" id="legalPersonSignature">
												<img src="<%=Validator.isNotNull(fileUrlOfLegalPerson)?fileUrlOfLegalPerson:""%>" class="thumb-image" style="height: 100px; width: 100px;">
											</div>
										</td>
										<td><span> <a href="javascript:void(0)"
												id="genEquipmentEditTab"
												onclick="genEquipmentEditTab('<%=genEquipmentDataCounter%>');">
													<svg width="19" height="19" viewBox="0 0 19 19" fill="none"
														xmlns="http://www.w3.org/2000/svg"> 
		         <path
															d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
															fill="#047247"></path> 
		        </svg>
											</a>
										</span></td>
										<td><span> <a href="javascript:void(0)"
												id="genEquipmentDetailDeleteDataTab"
												onclick="genEquipmentDetailDeleteData('<%=genEquipmentDataCounter%>');">
													<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
														xmlns="http://www.w3.org/2000/svg">
		        <path
															d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
															fill="#047247"></path>
		        </svg>
											</a>
										</span></td>
									</tr>
									<input type="hidden"
										id="genEquipmentDetailId<%=genEquipmentDataCounter%>"
										name="genEquipmentDetailId<%=genEquipmentDataCounter%>"
										value="<%=genEquipmentInfo.getGenEquipmentDataId()%>">
									<%
							genEquipmentDataCounter++;
							}
 }
						%> 
								</tbody>
									</table>
								</div>
							</div>
						</div>
					
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();addRadiationGeneratinEquipment(false);"
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