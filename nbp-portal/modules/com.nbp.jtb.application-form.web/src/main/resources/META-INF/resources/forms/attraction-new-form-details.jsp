<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
int operatorManagerVal=1;
%>

<div class="new-attraction-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep7">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For
								Attraction(NEW)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of Attraction</p>
								<input type="text" class="form-control"
									id="newAttractionsTypeBox" placeholder="" disabled="" value="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner *</p>
								<input type="text" class="form-control mt-3"
									id="newAttractionsOwnerName" placeholder="John Doe" value="<%=Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsOwnerName())?attractApplicant.getNewAttractionsOwnerName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newAttractionsOwnerNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<input id="operatorManagerVal" type="hidden" name="operatorManagerVal" value="1">
							<div class="accordion secured-accordian"
								id="operatorManagerDetailBox">
								<div class="accordion__header is-active"
									id="operatorManagerDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>Operator/Manager</h2>
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
												<p class="tab-form-main-heading">Name of Operator/Manager</p>
												<input type="text" class="form-control"
													id="newAttractionsOperatorName" value="" placeholder="">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Location</p>
												<textarea rows="3" class="form-control" maxlength="255"
												id="newAttractionsLocation" value="" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Email Address</p>
												<input type="text" class="form-control"
													id="newAttractionsEmailAddress" value=""
													placeholder="info@companyname.jm" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading" for="telephone">Telephone</p>
												<input type="text" class="form-control"
													id="newAttractionsTelephone" value=""
													oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee" id="addOperatorManagerDetail" onclick="addOperatorManagerDetail();"> 
												<span>+ 1</span>
												Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-12 table-responsive hide addOperatorManagerDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addOperatorManagerDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name of Operator/Manager</th>
										<th class="sub_heading text-nowrap">Location</th>
										<th class="sub_heading text-nowrap">Email Address</th>
										<th class="sub_heading text-nowrap">Telephone</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
		<%if(Validator.isNotNull(attarctionManagerAdd)&&attarctionManagerAdd.size()>0){
		for(JtbAddCraftApplicantInfo operatorManager:attarctionManagerAdd){ %>
		<tr class="operator-manager-detail-row<%=operatorManagerVal%>">
		<td class="sub_heading_content newAttractionsOperatorName<%=operatorManagerVal%>">
		<%=Validator.isNotNull(operatorManager)&&Validator.isNotNull(operatorManager.getOwnerName())?operatorManager.getOwnerName():""%></td>
		<td class="sub_heading_content newAttractionsLocation<%=operatorManagerVal%>">
		<%=Validator.isNotNull(operatorManager)&&Validator.isNotNull(operatorManager.getOwnerAddress())?operatorManager.getOwnerAddress():""%></td>
		<td class="sub_heading_content newAttractionsEmailAddress<%=operatorManagerVal%>">
		<%=Validator.isNotNull(operatorManager)&&Validator.isNotNull(operatorManager.getOperatingEmail())?operatorManager.getOperatingEmail():""%></td>
		<td class="sub_heading_content newAttractionsTelephone<%=operatorManagerVal%>">
		<%=Validator.isNotNull(operatorManager)&&Validator.isNotNull(operatorManager.getOwnerPhoneNo())?operatorManager.getOwnerPhoneNo():""%></td>
		<td> 
		<span> 
			<a href="javascript:void(0)" id="operatorManagerDetailEditTab" onclick="operatorManagerDetailEditTab('<%=operatorManagerVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="operatorManagerDetailDeleteData" onclick="operatorManagerDetailDeleteData('<%=operatorManagerVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="operatorManagerDetailId<%=operatorManagerVal%>" name="operatorManagerDetailId<%=operatorManagerVal%>" value="<%=operatorManager.getJtbAddCraftApplicantInfoId()%>">
</tr>
<%operatorManagerVal=operatorManagerVal+1;
	}} %>
								</tbody>
							</table>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Mailing Address</p>
								<textarea rows="3" class="form-control" maxlength="255" id="newAttractionsMailingEmail" value="" placeholder="Mailing address" 
								style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsMailing())?attractApplicant.getNewAttractionsMailing():"" %></textarea>
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newAttractionsFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newAttractionsEmployeesNum" placeholder="" value="<%=Validator.isNotNull(attractApplicant)&&Validator.isNotNull(attractApplicant.getNewAttractionsEmpNum())?attractApplicant.getNewAttractionsEmpNum():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="newAttractionsParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=attractApplicant!=null?attractApplicant.getNewAttractionsParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addAttractionDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep8">
			<div class="tab-form">
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner</p>
								<input type="text" class="form-control"
									id="newAttractionsGenOwnerName" value="<%=Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsGenOwnerName())?attractiongenDec.getNewAttractionsGenOwnerName():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">A Company incorporated under the laws of</p>
								<input type="text" class="form-control"
									id="newAttractionsCompanyLaw" value="<%=Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsCompanyLaw())?attractiongenDec.getNewAttractionsCompanyLaw():"" %>" placeholder="">
								<p class="tab-form-sub-heading">Strike out if the owner is a
									private individual</p>	
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Incorporation in Jamaica</p>
								<input type="date" class="form-control"
									id="newAttractionsDate" value="<%=attractiongenDec!=null&&attractiongenDec.getNewAttractionsDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(attractiongenDec.getNewAttractionsDate()):StringPool.BLANK %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Attraction</p>
								<input type="text" class="form-control"
									id="newAttractionsName" value="<%=Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsName())?attractiongenDec.getNewAttractionsName():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Operating since date</p>
								<input type="date" class="form-control"
									id="newAttractionsStartDate" value="<%=attractiongenDec!=null&&attractiongenDec.getNewAttractionsStartDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(attractiongenDec.getNewAttractionsStartDate()):StringPool.BLANK %>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Acres of land attraction is situated on</p>
								<input type="text" class="form-control" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									id="newAttractionsSituatedLand" value="<%=Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsSituatedLand())?attractiongenDec.getNewAttractionsSituatedLand():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Attraction offers the following activities</p>
								<input type="text" class="form-control"
									id="newAttractionsActivities" value="<%=Validator.isNotNull(attractiongenDec)&&Validator.isNotNull(attractiongenDec.getNewAttractionsActivities())?attractiongenDec.getNewAttractionsActivities():"" %>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">The attached list shows the
									names and addresses of all the Directors of the operating
									company (if applicable)</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="attraction-address-of-directors"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="attraction-address-of-directors">
													<label class="custom-upload" for="attraction-address-of-directors">
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(attarctionDirect))?attarctionDirect:""%></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureAttractionImgHolder">
							<%if(Validator.isNotNull(attractionSignApp)){ %>
							<img src="<%=attractionSignApp%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureAttractionBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureAttractionBtn">
							<label for="applicantSignatureAttractionBtn"
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
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="attractionNewDate"
									max="9999-12-31" placeholder="" value="<%=attractiongenDec!=null&&attractiongenDec.getAttractionNewDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(attractiongenDec.getAttractionNewDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>					
	</div>
</div>
