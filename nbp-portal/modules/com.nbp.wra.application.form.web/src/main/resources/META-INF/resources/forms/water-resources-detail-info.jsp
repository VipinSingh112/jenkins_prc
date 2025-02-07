<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<%
long waterReqIrrAddCounter=1;
%>
<div class="water-resources-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="water-resources-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form A(Regulation 3(1))</p>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Application No.</p>
										<input type="text" class="form-control mt-3"
											id="abstractApplicationNo" placeholder="Application Number"
											oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
											value="<%=wraAbstractInfo!=null?wraAbstractInfo.getApplicationNum():StringPool.BLANK%>" />
									</div>
								</div>
							</div>
							<p class="tab-form-title-subtitle f2 mb-2">The Water
								Resources Act</p>
							<p class="tab-form-title-subtitle f2">Application for a
								Licence to Abstract and Use Water</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1. </span>Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="abstractApplicantName" placeholder="Name of Applicant" oninput="resourceDetailValidation();"
									value="<%=wraAbstractInfo!=null?wraAbstractInfo.getNameOfApplicant():StringPool.BLANK%>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="abstractApplicantNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="abstractMailingAddParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishApplicant().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2. </span>Mailing Address of
									Applicant</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="abstractMailingAddress" placeholder="Applicant Address"
									spellcheck="false"><%=wraAbstractInfo!=null?wraAbstractInfo.getMailingAddOfApplicant():StringPool.BLANK%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control"
									id="abstractEmailAddress" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getEmailOfApplicant():StringPool.BLANK%>"
									placeholder="info@companyname.jm" oninput="resourceDetailValidation();"/>
									<p class="tab-form-sub-heading fieldAlert hide" id="abstractEmailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Office Phone</p>
								<input type="text" class="form-control" id="abstractOfficePhone"
									value="<%=wraAbstractInfo!=null?wraAbstractInfo.getOfficePhone():StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Mobile Phone</p>
								<input type="text" class="form-control" id="abstractMobilePhone"
									value="<%=wraAbstractInfo!=null?wraAbstractInfo.getMobilePhone():StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Home Phone</p>
								<input type="text" class="form-control" id="abstractHomePhone"
									value="<%=wraAbstractInfo!=null?wraAbstractInfo.getHomePhone():StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<%-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="abstractWorkLocation">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProposedParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div> --%>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3. </span>Location of proposed work
									or of existing work in respect of which alteration or extension
									is proposed</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="abstractLocation" placeholder="" spellcheck="false"><%=wraAbstractInfo!=null?wraAbstractInfo.getLocationOfProParishWork():StringPool.BLANK%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4. </span>Name of Contractor</p>
								<input type="text" class="form-control mt-3"
									id="abstractContractorName" placeholder="Name of Contractor"
									value="<%=wraAbstractInfo!=null?wraAbstractInfo.getNameOfContractor():StringPool.BLANK%>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="abstractContractorAddress">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=wraAbstractInfo!=null?wraAbstractInfo.getParishContractor().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5. </span>Address of Contractor</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="abstractWaterContractorAdd"
									placeholder="Contractor Address" spellcheck="false"><%=wraAbstractInfo!=null?wraAbstractInfo.getAddressOfContractor():StringPool.BLANK%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6. </span>Source of water for which
									license is desired</p>
								<input type="text" class="form-control mt-3" name="abstractWaterSource"
									id="abstractWaterSource" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getSourceOfWater():StringPool.BLANK%>" />
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7. </span>Purpose for which water is
									to be used</p>
								<input type="text" class="form-control mt-3" id="abstractWaterPurpose" placeholder="" disabled="" value="<%-- <%=wraAbstractInfo!=null?wraAbstractInfo.getPurposeWaterUse():StringPool.BLANK%> --%>">	
								<%-- <input type="text" class="form-control mt-3" name="abstractWaterPurpose"
									id="abstractWaterPurpose" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getPurposeWaterUse():StringPool.BLANK%>" />
								<p class="tab-form-sub-heading">Separate values with Enter</p> --%>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">
									<b></b>
								</p>
								<div class="row">
									
								</div>
							</div>
						</div>
						
						<div class="col-md-12">
							<input id="waterIrrigationVal" type="hidden" name="waterIrrigationVal" value="<%=waterReqIrrAddCounter%>">
							<div class="accordion secured-accordian"
								id="waterIrrigationDetailBox">
								<div class="accordion__header is-active"
									id="waterIrrigationDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>8. If water is required for irrigation, state</h2>
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
												<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a. </span>Area and crop type to be irrigated</p>
												<input type="text" class="form-control mt-3"
													id="abstractAreaIrrigated" placeholder="" value="<%-- <%=wraAbstractInfo!=null?wraAbstractInfo.getAreaAndCropType():StringPool.BLANK%> --%>" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b. </span>System of irrigation</p>
												<input type="text" class="form-control mt-3"
													id="abstractSystemIrrigation" placeholder="" value="<%-- <%=wraAbstractInfo!=null?wraAbstractInfo.getSystemOfIrrigation():StringPool.BLANK%> --%>" />
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee" id="addWaterIrrigationDetail" onclick="addWaterIrrigationDetail();"> 
												<span>+ 1</span>
												Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-12 table-responsive hide addWaterIrrigationDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addWaterIrrigationDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Area and crop type to be irrigated</th>
										<th class="sub_heading text-nowrap">System of irrigation</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(waterReqIrr!=null){
	/* long waterReqIrrAddCounter=1; */
for(WRAReqIrrigation requiredIrrigation:waterReqIrr){ %>
	<tr class="water-irrigation-detail-row<%=waterReqIrrAddCounter%>">
	<td class="sub_heading_content abstractAreaIrrigated<%=waterReqIrrAddCounter%>">
	<%=Validator.isNotNull(requiredIrrigation)&&Validator.isNotNull(requiredIrrigation.getAbstractAreaIrrigated())?requiredIrrigation.getAbstractAreaIrrigated():""%></td>
	<td class="sub_heading_content abstractSystemIrrigation<%=waterReqIrrAddCounter%>">
	<%=Validator.isNotNull(requiredIrrigation)&&Validator.isNotNull(requiredIrrigation.getAbstractSystemIrrigated())?requiredIrrigation.getAbstractSystemIrrigated():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="waterIrrigationDetailEditTab" onclick="waterIrrigationDetailEditTab('<%=waterReqIrrAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="waterIrrigationDetailDeleteData" onclick="waterIrrigationDetailDeleteData('<%=waterReqIrrAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     
	</tr>
	<input type="hidden" id="waterIrrigationDetailId<%=waterReqIrrAddCounter%>" name="waterIrrigationDetailId<%=waterReqIrrAddCounter%>" value="<%=requiredIrrigation.getWraReqIrrigationId()%>">
	<%waterReqIrrAddCounter++;
		}} %>
								</tbody>
							</table>
						</div>
						
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9. </span>Means of disposal of excess
									or waste water</p>
								<input type="text" class="form-control mt-3"
									id="abstractWasteWater" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getMeansOfDisposal():StringPool.BLANK%>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<b><span class="tab-form-highlghtme-link pr-2">10. </span>Technical details</b>
								</p>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(i) </span>Estimated depth of
												borehole or well metres</p>
											<input type="text" class="form-control mt-3"
												id="abstractBoreholeDepth" placeholder="" 
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
												value="<%=wraAbstractInfo!=null?wraAbstractInfo.getEstimateDepthOfBorewell():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(ii) </span>Diameter of borehole or
												well centimetres</p>
											<input type="text" class="form-control mt-3"
												id="abstractDiameterBorehole" placeholder="" 
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
												value="<%=wraAbstractInfo!=null?wraAbstractInfo.getDiameterOfBorewell():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(iii) </span>In the case of artesian
												supplies, the method proposed for controlling the flow from
												the borehole and for preventing leakage around the borehole
												lining</p>
											<input type="text" class="form-control mt-3"
												id="abstractSuppliesLine" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getArtesianSupply():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(iv) </span>Geological strata from
												which water is to be drawn, e.g. limestone, gravel, etc.</p>
											<input type="text" class="form-control mt-3"
												id="abstractLimestone" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getGeologicalStrait():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(v) </span>State the method of
												abstracting water</p>
											<input type="text" class="form-control mt-3"
												id="abstractWaterMethod" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getMethodOfAbstractingWater():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(vi) </span>Maximum daily quantity
												of water to be abstracted in cubic metres</p>
											<input type="text" class="form-control mt-3"
												id="abstractWaterQuantity" placeholder=""
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" 
												value="<%=wraAbstractInfo!=null?wraAbstractInfo.getMaxDailyQuant():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(vii) </span>Type of apparatus
												proposed for measuring and recording the rate of abstraction</p>
											<input type="text" class="form-control mt-3"
												id="abstractRecordingType" name="abstractRecordingType"
												placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getTypeOfAppratusProposed():StringPool.BLANK%>" style="display: none;">
											<p class="tab-form-sub-heading">Separate values with
												Enter</p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(viii) </span>Other relevant technical
												information</p>
											<input type="text" class="form-control mt-3"
												id="abstractTechnicalInformation" placeholder="" value="<%=wraAbstractInfo!=null?wraAbstractInfo.getOtherInformation():StringPool.BLANK%>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11. </span>State whether any
												request for a supply of water has been made to the National
												Water Commission or National Irrigation Commission Limited
												and, if so, with what result</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="abstractWaterCommission" placeholder=""
												spellcheck="false"><%=wraAbstractInfo!=null?wraAbstractInfo.getRequestToSupplyWater():StringPool.BLANK%></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12. </span>Any further information
												which the Authority may take into account in considering the
												application</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="abstractInformation" placeholder="" spellcheck="false"><%=wraAbstractInfo!=null?wraAbstractInfo.getAuthorityInformation():StringPool.BLANK%></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<p class="tab-form-sub-heading">
											<b>NOTE:</b> Completed forms must be accompanied by:
										</p>
										<ul class="list-group tab-form-sub-heading">
											<li class="list-group-item">(1) Two copies of a map on a
												scale of 1:50,000 showing location of works;</li>
											<li class="list-group-item">(2) Such other documents as
												the Authority may require; and</li>
											<li class="list-group-item mb-4">(3) The application fee
												of Ja$15,000.00</li>
										</ul>
									</div>
									<div class="col-md-12">
										<p class="tab-form-main-heading">
											I <span class="giluio applicantName"> </span> hereby apply
											for a license under the Water Resources Act and declare that
											to the best of my knowledge and belief the particulars set
											out in this application are true and correct.
										</p>
									</div>
									<div class="col-md-12">
										<p class="pt-2 common-para">Signature of Applicant</p>
										<div class="signature_texarea mb-2" id="applicantSignatureAbstractImgHolder">
											<%if(Validator.isNotNull(abstractSignUrl)){ %>
											<img src="<%=abstractSignUrl%>"  width="100" height="100"/>
											<%} %>
											</div>
										<input type="file" id="applicantSignatureAbstractBtn" hidden="" name="<portlet:namespace/>applicantSignatureAbstractBtn">
										<label for="applicantSignatureAbstractBtn" class="choose-sign-btn"> <span class="mr-2"> 
										<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
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
											<input type="date" class="form-control" id="abstractSignDate"
												max="9999-12-31" placeholder="" value="<%=wraAbstractInfo!=null&&wraAbstractInfo.getDateOfSign()!=null?new SimpleDateFormat("yyyy-MM-dd").format(wraAbstractInfo.getDateOfSign()):StringPool.BLANK %>">
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
<script>
	function resourceDetailValidation(){
		abstractApplicantName = $("#abstractApplicantName").val();
		abstractEmailAddress = $("#abstractEmailAddress").val();
		  if (abstractApplicantName.trim() !== "" && abstractEmailAddress.trim() !== "") {
			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			 if(abstractEmailAddress.match(mailformat)){ 
				  $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#abstractEmailAddressValidation").addClass("hide");
				}else{
					$("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#abstractEmailAddressValidation").removeClass("hide");
					$("#abstractEmailAddressValidation").text("Please enter valid E-mail address");
				}
		  } else {
			  $("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
	}

	function addWaterIrrigationDetail(){
		waterIrrigationVal = $("#waterIrrigationVal").val();
		
		abstractAreaIrrigated = $("#abstractAreaIrrigated").val();
		abstractSystemIrrigation = $("#abstractSystemIrrigation").val();

		if(abstractAreaIrrigated != "" || abstractSystemIrrigation !=""){
			$(".addWaterIrrigationDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addWaterIrrigationDetailInfoUrl}",
				data : {
					"<portlet:namespace/>waterIrrigationVal" : waterIrrigationVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addWaterIrrigationDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */	
					$(".abstractAreaIrrigated" + waterIrrigationVal).append(abstractAreaIrrigated);
					$(".abstractSystemIrrigation" + waterIrrigationVal).append(abstractSystemIrrigation);
					addWaterRequiredIrrigationInfo('','');
					/* VALUE INCREAMENT */
					/* addLicBranchDetailCarRentalFormNine(); */
					waterIrrigationVal++;
					$("#waterIrrigationVal").val(waterIrrigationVal);
					
					/* RESET FORM FIELDS */
					$("#abstractAreaIrrigated").val("");
					$("#abstractSystemIrrigation").val("");
				}
			});
		}else{
			$("#abstractAreaIrrigated").focus();
		}
	}
	function addWaterRequiredIrrigationInfo(counter,deleteKey){
 		if(counter!=''&&deleteKey==''){
 		    waterIrrigationVal=counter;
			waterIrrigationDetailId = $("#waterIrrigationDetailId"+counter).val();
			abstractAreaIrrigated = $("#editAbstractAreaIrrigated"+counter).val();
			abstractSystemIrrigation = $("#editAbstractSystemIrrigation"+counter).val();
			}else{
			waterIrrigationVal = $("#waterIrrigationVal").val();
			abstractAreaIrrigated = $("#abstractAreaIrrigated").val();
			abstractSystemIrrigation = $("#abstractSystemIrrigation").val();
			waterIrrigationDetailId = $("#waterIrrigationDetailId").val();
			}
			wraApplicationId = $("#wraApplicationId").val();
			waterIrrigationDetailId = $("#waterIrrigationDetailId"+counter).val();
			  $.ajax({
					type: "POST",
					url: "${addWaterRequiredIrrigationInfoUrl}", 
					data: {
						"<portlet:namespace/>abstractAreaIrrigated": abstractAreaIrrigated,
						"<portlet:namespace/>abstractSystemIrrigation": abstractSystemIrrigation,
						"<portlet:namespace/>wraApplicationId": wraApplicationId,
						"<portlet:namespace/>waterIrrigationDetailId": waterIrrigationDetailId,
						"<portlet:namespace/>counter": waterIrrigationVal,
						"<portlet:namespace/>deleteKey": deleteKey,
					},
					success: function (data) {
						var result=data.APP_DATA;
						var counter=result["counter"];
						$("#waterIrrigationDetailId"+counter).val(result["waterIrrigationDetailId"]);
					},
					error: function (data) {
					}
				});
 	}
	function waterIrrigationDetailEditTab(waterIrrigationVal){
		$(".editWaterIrrigationDetailPopup").modal("show");
		
		$(".editAbstractAreaIrrigated").attr("id" , "editAbstractAreaIrrigated"+waterIrrigationVal);
		$(".editAbstractSystemIrrigation").attr("id" , "editAbstractSystemIrrigation"+waterIrrigationVal);

		abstractAreaIrrigated = $(".abstractAreaIrrigated"+waterIrrigationVal+":first").text().trim();
		abstractSystemIrrigation = $(".abstractSystemIrrigation"+waterIrrigationVal+":first").text().trim();

		$("#editAbstractAreaIrrigated"+waterIrrigationVal).val(abstractAreaIrrigated);
		$("#editAbstractSystemIrrigation"+waterIrrigationVal).val(abstractSystemIrrigation);
		
		$(".saveEditWaterIrrigationDetailPopupDataBtn").attr("onclick" , "waterIrrigationDetailEditData("+waterIrrigationVal+")");
	}
	function waterIrrigationDetailEditData(waterIrrigationVal){
		addWaterRequiredIrrigationInfo(waterIrrigationVal,'');
		$(".abstractAreaIrrigated" + waterIrrigationVal).html($("#editAbstractAreaIrrigated"+waterIrrigationVal).val());
		$(".abstractSystemIrrigation" + waterIrrigationVal).html($("#editAbstractSystemIrrigation"+waterIrrigationVal).val());
		
		$(".editAbstractAreaIrrigated").val("");
		$(".editAbstractSystemIrrigation").val("");
	}
		
	function waterIrrigationDetailDeleteData(waterIrrigationValData) {
		addWaterRequiredIrrigationInfo(waterIrrigationValData,'deleteApplicant');
		var waterIrrigationDetailCounter = $("#waterIrrigationVal").val();
		$("#waterIrrigationVal").val(waterIrrigationDetailCounter - 1);
		var delRowElement = $(".water-irrigation-detail-row" + waterIrrigationValData); 
		delRowElement.remove();
		var j = parseInt(waterIrrigationValData) + 1;
		// Update the row numbers and IDs for each row
		for (var i = j; i <= waterIrrigationDetailCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".water-irrigation-detail-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "water-irrigation-detail-row" + prevCounter);
			rowElement.find("td.abstractAreaIrrigated"+i).removeClass("abstractAreaIrrigated"+i).addClass("abstractAreaIrrigated"+prevCounter);
			rowElement.find("td.abstractSystemIrrigation"+i).removeClass("abstractSystemIrrigation"+i).addClass("abstractSystemIrrigation"+prevCounter);

			rowElement.find("#waterIrrigationDetailEditTab").attr('onclick', 'waterIrrigationDetailEditTab(' +prevCounter+ ')');
			rowElement.find("#waterIrrigationDetailDeleteData").attr('onclick', 'waterIrrigationDetailDeleteData(' +prevCounter+ ')');
		}
	}
	/* function waterIrrigationDetailDeleteData(waterIrrigationVal){
		waterIrrigationDetailId=$("#waterIrrigationDetailId"+waterIrrigationVal).val();
		 $.ajax({
				type: "POST",
				url: "${deleteWaterRequiredIrrigationAddUrl}", 
				data: {
					"<portlet:namespace/>waterIrrigationDetailId": waterIrrigationDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		} */
</script>
