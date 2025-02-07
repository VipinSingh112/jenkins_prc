<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="formTwelveApplicantInfoUrl" id="/form/twelve/applicant/info"></portlet:resourceURL>
<portlet:resourceURL var="formTwelveDirectorDetailInfoUrl" id="/form/twelve/director/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="formTwelveDelineationAreaInfoUrl" id="/form/twelve/delineation/area/info"></portlet:resourceURL>
<%
int miningDirectorDetailVal=1;
%>
<div class="mining-lease-forms hide miningLeaseForm" >
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep6">
			<div class="tab-form">
				<div class="mining-lease-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form No. 12 (Regulation 22)</p>
							<!-- <p class="tab-form-title-subtitle f2">In this section you
								will provide general information about Mining Lease.</p> -->
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minister through
								the Commissioner</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of applicant *</p>
								<input type="text" class="form-control" id="applicantNameLease"
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNameOfApplicant())?prospectLicence.getNameOfApplicant():"" %>" placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="applicantNameLeaseValidation" style="color: red;">Enter a
									Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Nationality of applicant</p>
								<input type="text" class="form-control"
									id="applicantNationalityLease" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNationalityOfApplicant())?prospectLicence.getNationalityOfApplicant():"" %>" placeholder="" />
							</div>
						</div>
						<!-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name and nationality of
									directors of company, body of persons or partnership (if any):</p>
								<input type="text" class="form-control"
									id="applicantNationalityName value=" " placeholder="" />
							</div>
						</div> -->
						<!-- <div class="col-md-12"> -->
							<input id="miningDirectorDetailVal" type="hidden" name="miningDirectorDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="miningDirectorDetailBox">
									<div class="accordion__header is-active"
										id="miningDirectorDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>3. Director Details</h2>
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
														id="miningCompanyDirectorName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Nationality of
														directors of company</p>
													<input type="text" class="form-control"
														id="miningCompanyDirectorNationality" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Body of persons or
														partnership (if any)</p>
													<input type="text" class="form-control"
														id="miningCompanyDirectorPartnership" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addMiningDirectorDetail"
													onclick="addMiningDirectorDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addMiningDirectorDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addMiningDirectorDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name</th>
											<th class="sub_heading text-nowrap">Nationality</th>
											<th class="sub_heading text-nowrap">Body of persons or partnership</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
											<%if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
											for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd){ %>
											<tr class="mining-director-detail-row<%=miningDirectorDetailVal%>">
											<td class="sub_heading_content text-nowrap miningCompanyDirectorName<%=miningDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
											<td class="sub_heading_content text-nowrap miningCompanyDirectorNationality<%=miningDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
											<td class="sub_heading_content text-nowrap miningCompanyDirectorPartnership<%=miningDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
											<td> 
												<span> 
													<a href="javascript:void(0)" id="miningDirectorDetailEditTab" onclick="miningDirectorDetailEditTab('<%=miningDirectorDetailVal%>');"> 
												        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
												         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <td> 
												<span> 
													<a href="javascript:void(0)" id="miningDirectorDetailDeleteData" onclick="miningDirectorDetailDeleteData('<%=miningDirectorDetailVal%>');"> 
												        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
												        </svg>
												      </a> 
												  </span>
										     </td>
										</tr>
														 <input type="hidden" id="miningDirectorDetailId<%=miningDirectorDetailVal%>" name="miningDirectorDetailId<%=miningDirectorDetailVal%>" value="<%=directorDetails.getMiningProspectingLicenseAddId()%>">
														 <%miningDirectorDetailVal=miningDirectorDetailVal+1;
											}} %>						
									</tbody>
								</table>
							</div>
						<!-- </div> -->
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Address in Jamaica at which
									notices, etc, may be served</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="applicantAddressLease" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getAddressInJamaica())?prospectLicence.getAddressInJamaica():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Number of applicant's
									prospecting right or licence</p>
								<input type="text" class="form-control"
									id="applicantNumberLease" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getNumberOfApplicant())?prospectLicence.getNumberOfApplicant():"" %>" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">6.</span>Parish and Area</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-sub-heading">Area(in square kilometres)
									of the area applied for</p>
								<input type="text" class="form-control" id="applicantLeaseArea"
									value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getApproximateArea())?prospectLicence.getApproximateArea():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-sub-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="justicePeaceParishLease">
										<option value="" disabled="" selected="">Please
											Select</option>
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
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish and Area(in square kilometres)
									of the area applied for</p>
								<input type="text" class="form-control" id="applicantLeaseArea"
									value="" placeholder="">
							</div>
						</div> -->
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Mineral for which the
									applicant desires to mine</p>
								<input type="text" class="form-control"
									id="applicantLeaseDesires" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getMineralForWhichApplicant())?prospectLicence.getMineralForWhichApplicant():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Length of term desired</p>
								<input type="text" class="form-control"
									id="applicantLenghtLease" value="<%=Validator.isNotNull(prospectLicence)&&Validator.isNotNull(prospectLicence.getLicence())?prospectLicence.getLicence():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>A financial statement of the
									position of the applicant is appended hereto</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="financial-statement"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>financial-statement"> <label class="custom-upload"
														for="financial-statement"> <span class="mr-2">
															<svg width="14" height="17" viewBox="0 0 14 17"
																fill="none" xmlns="http://www.w3.org/2000/svg">
						                                        <path
																	d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																	fill="#047247"></path>
						                                    </svg>
													</span>Upload
													</label>
												</div>
											</div>
											<span class="attach-detailed-overview" id="mining-lease-fin-stat"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>In a case of an application
									by a company if a copy of the Memorandum and Articles of
									Association has not already been lodged with the Commissioner a
									copy must be enclosed herewith.</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="commissionerCopy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>commissionerCopy"> <label class="custom-upload"
														for="commissionerCopy"> <span class="mr-2">
															<svg width="14" height="17" viewBox="0 0 14 17"
																fill="none" xmlns="http://www.w3.org/2000/svg">
						                                        <path
																	d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																	fill="#047247"></path>
						                                    </svg>
													</span>Upload
													</label>
												</div>
											</div>
											<span class="attach-detailed-overview" id="copyMemorandumArticles"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-7">
							<div class="form-group">
								<p class="tab-form-main-heading text-nowrap"><span class="tab-form-highlghtme-link pr-2">11.</span>The date on
									which location beacon was erected was</p>
								<input type="date" class="form-control"
									id="applicantDateLocation" value="<%=prospectLicence!=null&&prospectLicence.getDateUponTheLocation()!=null?new SimpleDateFormat("yyyy-MM-dd").format(prospectLicence.getDateUponTheLocation()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span>A sketch plan as required by
									the Regulations is attached here to</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="sketchPlan"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>sketchPlan"> <label class="custom-upload"
														for="sketchPlan"> <span class="mr-2"> <svg
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
											<span class="attach-detailed-overview" id="sketch-plan-lease-min"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox" id="miningLeaseFeeCheck" value="The appropriate licence fee is forwarded here with" <%=prospectLicence!=null &&prospectLicence.getProslicenceFeeCheck().contains("The appropriate licence fee is forwarded here with")?"checked":StringPool.BLANK%> name="miningLeaseFeeCheck"> 
									<label for="miningLeaseFeeCheck">
										<p class="tab-form-main-heading mb-0">
											<span class="tab-form-highlghtme-link pr-2">13.</span>The appropriate mining lease fee is forwarded here with.
										</p>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="leaseApplicantDetailFormTwelveInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep7">
			<div class="tab-form">
				<div class="mining-lease-delineation-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">14. Delineation of Area</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">The delineation of the
								area is as follows:</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									An area of approximately <input type="text" class=""
										id="leaseSquareKilo" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getApproximatelyArea())?delineationArea.getApproximatelyArea():"" %>" placeholder=""> square
									kilometres.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>location beacon</span> consists of <input type="text"
										class="" id="leaseLocation" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getLocation())?delineationArea.getLocation():"" %>" placeholder="">
									and is situated approximately at the intersection of false
									co-ordinates <input type="text" class="" id="leaseCoordinates"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getCoordinates())?delineationArea.getCoordinates():"" %>" placeholder=""> North <input type="text"
										class="" id="leaseNorthSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getNorthSide())?delineationArea.getNorthSide():"" %>" placeholder="">
									East on sheet <input type="text" class="" id="leaseEastSide"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getEastSide())?delineationArea.getEastSide():"" %>" placeholder=""> of the topographical map of
									Jamaica.
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
									<input type="text" class="" id="firstNorthLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstNorthSide())?delineationArea.getFirstNorthSide():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="firstEastLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getEastSide())?delineationArea.getEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class=""
										id="leaselocationGrid" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstLocationGrid())?delineationArea.getFirstLocationGrid():"" %>" placeholder=""> metres
									from the location beacon on an approximate grid bearing of <input
										type="text" class="" id="leaseDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstDegrees())?delineationArea.getFirstDegrees():"" %>" placeholder="">
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
									<input type="text" class="" id="secondNorthLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondNorthSide())?delineationArea.getApproximatelyArea():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="secondEastLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondEastSide())?delineationArea.getSecondEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class=""
										id="secondLocationLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondLocationGrid())?delineationArea.getSecondLocationGrid():"" %>" placeholder="">
									metres from the first corner on an approximate grid bearing of
									<input type="text" class="" id="secondDegreesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondDegrees())?delineationArea.getSecondDegrees():"" %>"
										placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>Third corner</span> is situated approximately at the
									intersection of the false co-ordinates
								</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="thirdCoordinatesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdCoordinates())?delineationArea.getThirdCoordinates():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="thirdNorthLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdNorthSide())?delineationArea.getThirdNorthSide():"" %>" placeholder=""> East
									approximately <input type="text" class="" id="thirdEastLease"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdEastSide())?delineationArea.getThirdEastSide():"" %>" placeholder=""> metres from the second corner
									on an approximate grid bearing of <input type="text" class=""
										id="thirdDegreesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdDegrees())?delineationArea.getThirdDegrees():"" %>" placeholder="">
									degrees and is <input type="text" class=""
										id="thirdLocationLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridLoc())?delineationArea.getThirdGridLoc():"" %>" placeholder="">
									metres to the location beacon on an approximate grid bearing of
									<input type="text" class="" id="thirdGridLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridL())?delineationArea.getThirdGridL():"" %>"
										placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>fourth corner</span> is situated approximately at the
									intersection of the false co-ordinates
								</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="fourthCoordinatesLease"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthCoordinates())?delineationArea.getFourthCoordinates():"" %>" placeholder=""> North and <input type="text"
										class="" id="fourthNorthLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthNorthSide())?delineationArea.getFourthNorthSide():"" %>" placeholder="">
									East approximately <input type="text" class=""
										id="fourthEastLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstEastSide())?delineationArea.getFirstEastSide():"" %>" placeholder=""> metres
									from the third corner on an approximate grid bearing of <input
										type="text" class="" id="fourthDegreesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthDegrees())?delineationArea.getFourthDegrees():"" %>"
										placeholder=""> degrees and is <input type="text"
										class="" id="fourthGridLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthGridLoc())?delineationArea.getFourthGridLoc():"" %>" placeholder="">
									metres to the location beacon on an approximate grid bearing of
									<input type="text" class="" id="fourthLocationLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFourthGridL())?delineationArea.getFourthGridL():"" %>"
										placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">
									The <span>fifth corner</span> is situated approximately at the
									intersection of the false co-ordinates
								</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="fifthCoordinatesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthCoordinates())?delineationArea.getFifthCoordinates():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="fifthNorthLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthNorthSide())?delineationArea.getFifthNorthSide():"" %>" placeholder=""> East
									approximately <input type="text" class="" id="fifthEastLease"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthEastSide())?delineationArea.getFifthEastSide():"" %>" placeholder=""> metres from the forth corner
									on an approximate grid bearing of <input type="text" class=""
										id="fifthDegreesLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthDegrees())?delineationArea.getFifthDegrees():"" %>" placeholder="">
									degrees and is <input type="text" class="" id="fifthGridLease"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthGridLoc())?delineationArea.getFifthGridLoc():"" %>" placeholder=""> metres to the location beacon
									on an approximate grid bearing of <input type="text" class=""
										id="fifthLocationLease" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFifthGridL())?delineationArea.getFifthGridL():"" %>" placeholder="">
									degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureLeaseImgHolder">
							<%if(Validator.isNotNull(signLeaseUrl)){ %>
							<img src="<%=signLeaseUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureLeaseBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureLeaseBtn"> <label
								for="applicantSignatureLeaseBtn" class="choose-sign-btn">
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
.tab-plus-wizard .tab-form input {
	margin-top: 6px;
	margin-bottom: 6px;
}
</style>
<script>
function leaseApplicantDetailFormTwelveInfo(theSaveandContinue){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	applicantNameLease=$("#applicantNameLease").val();
	applicantNationalityLease=$("#applicantNationalityLease").val();
	applicantAddressLease=$("#applicantAddressLease").val();
	applicantNumberLease=$("#applicantNumberLease").val();
	applicantLeaseArea=$("#applicantLeaseArea").val();
	justicePeaceParishLease=$("#justicePeaceParishLease").val();
	applicantLeaseDesires=$("#applicantLeaseDesires").val();
	applicantLenghtLease=$("#applicantLenghtLease").val();
	applicantDateLocation=$("#applicantDateLocation").val();
	applicantNameLicence= $("#applicantNameLicence").val();
	applicantNameLease= $("#applicantNameLease").val();
	saveAndContinue= $("#saveAndConCheck").val();
	var leaseFeeCheck = new Array();
	$("input:checkbox[name=miningLeaseFeeCheck]:checked").each(function(){
		leaseFeeCheck.push($(this).val());
	});
	var miningLeaseFeeCheck = leaseFeeCheck.toString();
		 submitForm= true;
		 if(!theSaveandContinue){
			if(!applicantNameLease){
			$("#applicantNameLeaseValidation").removeClass("hide");
			$("#applicantNameLease").focus();
			submitForm= false;
		}else{
			$("#applicantNameLeaseValidation").addClass("hide");
		    }	
		 }
		
			if(submitForm){
	$.ajax({
	    type: "POST",
	    url: "${formTwelveApplicantInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>applicantNameLease": applicantNameLease,
		     "<portlet:namespace/>applicantNationalityLease": applicantNationalityLease,
		     "<portlet:namespace/>applicantAddressLease": applicantAddressLease,
		     "<portlet:namespace/>applicantNumberLease": applicantNumberLease,
		     "<portlet:namespace/>applicantLeaseArea": applicantLeaseArea,
		     "<portlet:namespace/>justicePeaceParishLease": justicePeaceParishLease,
		     "<portlet:namespace/>applicantLeaseDesires": applicantLeaseDesires,
		     "<portlet:namespace/>applicantLenghtLease": applicantLenghtLease,
		     "<portlet:namespace/>applicantDateLocation": applicantDateLocation,
		     "<portlet:namespace/>miningLeaseFeeCheck": miningLeaseFeeCheck,

		    },
	    success: function (data) {
	    	uploadDocuments('financial-statement',"LEASE STATEMENT OF POSITION","A financial statement of the position of the applicant is appended hereto");
	    	uploadDocuments('commissionerCopy',"LEASE COPY OF MEMORANDUM","In a case of an application by a company if a copy of the Memorandum and Articles of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
	    	uploadDocuments('sketchPlan',"LEASE SKETCH PLAN","A sketch plan as required by the Regulations is attached hereto");
			
			$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			if(!theSaveandContinue){
				applicantInfo();
			}
			debugger;
			if(saveAndContinue>0){
				applicantInfo();
			}
	    },
	    error: function (data) {},
	  });
	}	  
}
function leaseDirectorDetailsInfo(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	miningCompanyDirectorName=$("#miningCompanyDirectorName").val();
	miningCompanyDirectorNationality=$("#miningCompanyDirectorNationality").val();
	miningCompanyDirectorPartnership=$("#miningCompanyDirectorPartnership").val();
	miningDirectorDetailVal=$("#miningDirectorDetailVal").val();
	$.ajax({
	    type: "POST",
	    url: "${formTwelveDirectorDetailInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>miningCompanyDirectorName": miningCompanyDirectorName,
		     "<portlet:namespace/>miningCompanyDirectorNationality": miningCompanyDirectorNationality,
		     "<portlet:namespace/>miningCompanyDirectorPartnership": miningCompanyDirectorPartnership,
		     "<portlet:namespace/>count" : miningDirectorDetailVal,

		    },
	    success: function (data) {
	    	var result=data.APP_DATA;
			$("#miningDirectorDetailId"+result["count"]).val(result["miningDirectorDetailId"]);
	    },
	    error: function (data) {},
	  });
}
function leaseDelineationAreaInfo(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	leaseSquareKilo=$("#leaseSquareKilo").val();
	
	leaseLocation=$("#leaseLocation").val();
	leaseCoordinates=$("#leaseCoordinates").val();
	leaseNorthSide=$("#leaseNorthSide").val();
	leaseEastSide=$("#leaseEastSide").val();
	
	firstNorthLease=$("#firstNorthLease").val();
	firstEastLease=$("#firstEastLease").val();
	leaselocationGrid=$("#leaselocationGrid").val();
	leaseDegrees=$("#leaseDegrees").val();
	
	secondNorthLease=$("#secondNorthLease").val();
	secondEastLease=$("#secondEastLease").val();
	secondLocationLease=$("#secondLocationLease").val();
	secondDegreesLease=$("#secondDegreesLease").val();
	
	thirdCoordinatesLease=$("#thirdCoordinatesLease").val();
	thirdNorthLease=$("#thirdNorthLease").val();
	thirdEastLease=$("#thirdEastLease").val();
	thirdDegreesLease=$("#thirdDegreesLease").val();
	thirdLocationLease=$("#thirdLocationLease").val();
	thirdGridLease=$("#thirdGridLease").val();
	
	fourthCoordinatesLease=$("#fourthCoordinatesLease").val();
	fourthNorthLease=$("#fourthNorthLease").val();
	fourthEastLease=$("#fourthEastLease").val();
	fourthDegreesLease=$("#fourthDegreesLease").val();
	fourthGridLease=$("#fourthGridLease").val();
	fourthLocationLease=$("#fourthLocationLease").val();
	
	fifthCoordinatesLease=$("#fifthCoordinatesLease").val();
	fifthNorthLease=$("#fifthNorthLease").val();
	fifthEastLease=$("#fifthEastLease").val();
	fifthDegreesLease=$("#fifthDegreesLease").val();
	fifthGridLease=$("#fifthGridLease").val();
	fifthLocationLease=$("#fifthLocationLease").val();
	
	$.ajax({
	    type: "POST",
	    url: "${formTwelveDelineationAreaInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>leaseSquareKilo": leaseSquareKilo,
		     
		     "<portlet:namespace/>leaseLocation": leaseLocation,
		     "<portlet:namespace/>leaseCoordinates": leaseCoordinates,
		     "<portlet:namespace/>leaseNorthSide": leaseNorthSide,
		     "<portlet:namespace/>leaseEastSide": leaseEastSide,
		     
		     "<portlet:namespace/>firstNorthLease": firstNorthLease,
		     "<portlet:namespace/>firstEastLease": firstEastLease,
		     "<portlet:namespace/>leaselocationGrid": leaselocationGrid,
		     "<portlet:namespace/>leaseDegrees": leaseDegrees,
		     
		     "<portlet:namespace/>secondNorthLease": secondNorthLease,
		     "<portlet:namespace/>secondEastLease": secondEastLease,
		     "<portlet:namespace/>secondLocationLease": secondLocationLease,
		     "<portlet:namespace/>secondDegreesLease": secondDegreesLease,
		     
		     "<portlet:namespace/>thirdCoordinatesLease": thirdCoordinatesLease,
		     "<portlet:namespace/>thirdNorthLease": thirdNorthLease,
		     "<portlet:namespace/>thirdEastLease": thirdEastLease,
		     "<portlet:namespace/>thirdDegreesLease": thirdDegreesLease,
		     "<portlet:namespace/>thirdLocationLease": thirdLocationLease,
		     "<portlet:namespace/>thirdGridLease": thirdGridLease,
		     
		     "<portlet:namespace/>fourthCoordinatesLease": fourthCoordinatesLease,
		     "<portlet:namespace/>fourthNorthLease": fourthNorthLease,
		     "<portlet:namespace/>fourthEastLease": fourthEastLease,
		     "<portlet:namespace/>fourthDegreesLease": fourthDegreesLease,
		     "<portlet:namespace/>fourthGridLease": fourthGridLease,
		     "<portlet:namespace/>fourthLocationLease": fourthLocationLease,
		     
		     "<portlet:namespace/>fifthCoordinatesLease": fifthCoordinatesLease,
		     "<portlet:namespace/>fifthNorthLease": fifthNorthLease,
		     "<portlet:namespace/>fifthEastLease": fifthEastLease,
		     "<portlet:namespace/>fifthDegreesLease": fifthDegreesLease,
		     "<portlet:namespace/>fifthGridLease": fifthGridLease,
		     "<portlet:namespace/>fifthLocationLease": fifthLocationLease,

		    },
	    success: function (data) {
	    	uploadDocuments('applicantSignatureLeaseBtn',"Lease Signature of Applicant","");
	    },
	    error: function (data) {},
	  });
} 
</script>