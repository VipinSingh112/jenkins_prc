<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addCetSuspensionDetailInfoUrl" id="/cetSuspension/detail/info"/>
<portlet:resourceURL var="addMaterialRequiredDetailInfoUrl" id="/materialRequired/detail/info"/>
<portlet:resourceURL var="addGoodsProduceDetailInfoUrl" id="/goodsProduce/detail/info"/>
<portlet:resourceURL var="miicApplicantFormInfoUrl" id="/miic/application/form/info"/>
<portlet:resourceURL var="addMiicSuspensionOfCetUrl" id="/add/miic/suspension/of/cet"/>
<portlet:resourceURL var="addMiicSafeguardMechanismMaterialRequiredUrl" id="/add/miic/safeguard/mechanism/material/required"/>
<portlet:resourceURL var="addMiicSafeguardMechanismGoodsToBeProducedUrl" id="/add/miic/safeguard/mechanism/to/be/produced"/>
<portlet:resourceURL var="addMiicSuspensionOfCetFormUrl" id="/add/miic/suspension/of/cet/form"/>
<div class="miic-application-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="company-details-form">
					<div class="row"> 
                         <div class="col-md-12"> 
                          <p class="tab-form-title f2">Applicant Details</p> 
                          <p class="tab-form-title-subtitle f2 mb-0">Instructions to Applicant</p>
                          <p class="tab-form-heading suspension-cet-ins hide">Incentive that registered manufactures benefits from that allows them to import raw materials and 
                          intermediate good and have their products qualify for duty free access under CARICOM.</p>
                          <p class="tab-form-heading safeguard-ins hide">Incentive that registered manufactures benefits from that allows them to import raw materials and intermediate good 
                          and have their products qualify for duty free access under CARICOM.</p>
                          <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.</p> 
                         </div> 
                    </div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Nature of Applicant</p>
								<div class="select-wrapper position-relative">
									<select class="form-control" name="pselect"
										id="applicantNature">
										<option selected disabled>Please Select</option>
										<option value="Individual"<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant().contains("Individual"))?"selected":""%>>Individual</option>	
										<option value="Company"<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant().contains("Company"))?"selected":""%>>Company</option>
									</select>
								</div>
							</div> 
						</div>
						<div class="col-md-6 hide cet-option">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(a)</span>Applicant Name/ Requester Name *</p>
								<input type="text" class="form-control" id="mainApplicantName" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantName())?applicantDetail.getApplicantName():"" %>"
									placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide" id="mainApplicantNameValidation" style="color: red;">Enter a Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6 hide safeguard-option">
							<div class="form-group">
								<p class="tab-form-main-heading text-nowrap"><span class="tab-form-highlghtme-link pr-2">(a)</span>Name of Producer/Manufacturer of Goods *</p>
								<input type="text" class="form-control" id="mainProducerName" value=""
									placeholder="Name of producer" />
								<p class="tab-form-sub-heading fieldAlert hide" id="mainProducerNameValidation" style="color: red;">Enter a Name of Producer</p>
							</div>
						</div>
						<div class="col-md-6 hide indiApplication">
							<div class="form-group">
								<p class="tab-form-main-heading">First Name</p>
								<input type="text" class="form-control" id="mainFirstName" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getFirstName())?applicantDetail.getFirstName():"" %>"
									placeholder="Example Johnny" />
							</div>
						</div>
						<div class="col-md-6 hide indiApplication">
							<div class="form-group">
								<p class="tab-form-main-heading">Last Name</p>
								<input type="text" class="form-control" id="mainLastName" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getLastName())?applicantDetail.getLastName():"" %>"
									placeholder="Example Depp" />
							</div>
						</div>
						<div class="col-md-12 hide comApplication">
							<div class="form-group">
								<p class="tab-form-main-heading">Company Name</p>
								<input type="text" class="form-control" id="maincompanyName" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getCompanyName())?applicantDetail.getCompanyName():"" %>"
									placeholder="Example Company LTD" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" id="mainAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():"" %></textarea>
								<p class="tab-form-sub-heading fieldAlert hide" id="mainAddressValidation" style="color: red;">Enter Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email *</p>
								<input type="text" class="form-control" id="mainEmail" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getEmail())?applicantDetail.getEmail():"" %>"
									placeholder="user@example.com"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="mainEmailValidation" style="color: red;">Enter a Email</p>
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control numeric-field" id="mainTelephone" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTelephone())?applicantDetail.getTelephone():"" %>"
									placeholder="+1 876-876-1234" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
									<!-- <p class="tab-form-sub-heading fieldAlert hide" id="mainTelephoneValidation" style="color: red;">Only Numeric characters are allowed</p> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="applicationDate">Date of Application</p>
								<input type="date" class="form-control" id="mainApplicationDate" placeholder="24/3/1999" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getDateOfApplication())?new SimpleDateFormat("YYYY-dd-MM").format(applicantDetail.getDateOfApplication()):""%>"/>
								
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">TRN Number</p>
								<input type="text" class="form-control numeric-field" id="mainTrnNumber" value="<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getTrnNumber())?applicantDetail.getTrnNumber():"" %>"
									placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
									<p class="tab-form-sub-heading fieldAlert hide" id="mainTrnNumberValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<input type="hidden" id="filmCompanyDetailsId" name="filmCompanyDetailsId">
					</div>
				</div>
			</div>
			<button type="button" onclick="addMiicApplicantFormInfo(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg">
			          	<pathd
							="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
			         </svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="" id="miicProcessCetForm">
					<div class="row"> 
                         <div class="col-md-12 mx-2"> 
                          <p class="tab-form-title f2">Suspension of CET</p> 
                         </div> 
                    </div>
					<div class="row">
					  <input id="cetSuspensionDetailVal" type="hidden" name="cetSuspensionDetailVal" value="1">
					  <div class="col-md-12">
					    <div class="accordion secured-accordian" id="cetSuspensionDetailBox">
					      <div class="accordion__header is-active"  id="addCetSuspensionDetailBox" onclick="expandDetails(this.id)">
					        <div class="d-flex align-items-center">
					          <div class="d-flex align-items-center">
					            <div>
					              <span class="accordion__toggle"></span>
					            </div>
					            <div>
					              <h2>CET Suspension</h2>
					            </div>
					          </div>
					        </div>
					        <div>
					          <p class="accordian-employee mb-0 common-para"></p>
					        </div>
					      </div>		
					        
					      <div class="accordion__body is-active">
					        <div class="row">
								<!-- <div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Name</p>
										<input type="text" class="form-control" id="cetName" placeholder="" value="" disabled>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Address</p>
										<textarea rows="3" id="cetAddress"
											class="form-control" maxlength="255" placeholder="Enter Address"
											style="border-radius: 5px; width: 100%" disabled></textarea>
									</div>
								</div> -->
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(b)</span>Tariff Heading no.</p>
										<input type="text" class="form-control numeric-field"
											id="cetTariffHeading" placeholder="" value=""
											oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
										<p class="tab-form-sub-heading fieldAlert hide" id="cetTariffHeadingValidation" style="color: red;">Only Numeric characters are allowed</p>
									</div>
								</div>
								<div class="col-md-12">
									<p class="tab-form-title-subtitle f2"><span class="tab-form-highlghtme-link pr-2">(c)</span>Goods to be
										Imported</p>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Description</p>
										<textarea rows="3" id="cetDescription"
											class="form-control" maxlength="255" placeholder="Enter Description"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Amount Quantity</p>
										<input type="text" class="form-control" id="suspensionQuantity"
											value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Amount Estimate in US $</p>
										<input type="text" class="form-control numeric-field" id="suspensionEstimate" value="" placeholder=""
										oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>
										<p class="tab-form-sub-heading fieldAlert hide" id="suspensionEstimateValidation" style="color: red;">Only Numeric characters are allowed</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(d)</span>Technology Specification</p>
										<textarea rows="3" id="suspensionSpecification"
											class="form-control" maxlength="255" placeholder="Enter Technology Specification"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(e)</span>CET Rate</p>
										<input type="text" class="form-control" id="suspensionCetRate"
											value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>
			
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(f)</span>Rate Proposed</p>
										<input type="text" class="form-control"
											id="suspensionRateProposed" value="" placeholder="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>
			
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(g)</span>Period of Rate Change</p>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-sub-heading">Period From</p>
										<input type="date" class="form-control" id="suspensionPeriodOfRateChangeFrom"
											value="" placeholder="#2345"/>	
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-sub-heading">Period To</p>
										<input type="date" class="form-control" id="suspensionPeriodOfRateChangeTo"
											value="" placeholder="#2345"/>	
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4"> 
								  	<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreCetSuspensionDetail" onclick="addCetSuspensionDetailBox();"> <span>+ 1</span> Add More</a> 
								</div>
					        </div>
					      </div>
					    </div>			
					  </div>
					  <div class="col-12 table-responsive hide addCetSuspensionDetailTableBox">
					    <table class="table table-bordered mb-3">
					      <tbody class="addCetSuspensionDetailTable">
					        <tr>
					         <!--  <th class="sub_heading">Name</th>
					          <th class="sub_heading">Address</th> -->
					          <th class="sub_heading text-nowrap">Tariff Heading no.</th>
					          <th class="sub_heading">Description</th>
					          <th class="sub_heading text-nowrap">Amount Quantity</th>
					          <th class="sub_heading text-nowrap">Amount Estimate in US $</th>
					          <th class="sub_heading text-nowrap">Technology Specification</th>
					          <th class="sub_heading text-nowrap">CET Rate</th>
					          <th class="sub_heading text-nowrap">Rate Proposed</th>
					          <th class="sub_heading text-nowrap">Period of Rate Change From</th>
					          <th class="sub_heading text-nowrap">Period of Rate Change To</th>
					          <th class="sub_heading">Edit</th>
					          <th class="sub_heading">Delete</th>
					        </tr>
					        <%if(Validator.isNotNull(suspensionOfCetAdd)&&suspensionOfCetAdd.size()>0){
								for(MiicSuspensionOfCetAdd suspensionOfCets:suspensionOfCetAdd){
							%>	
					        <tr>
					<%-- <td class="sub_heading_content cetName<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant())?applicantDetail.getNatureOfApplicant():""%>
					</td>
					<td class="sub_heading_content cetAddress<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():""%>
					</td> --%>
					<td class="sub_heading_content cetTariffHeading<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getTariffHeadingNum())?suspensionOfCets.getTariffHeadingNum():""%>
					</td>
					<td class="sub_heading_content cetDescription<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getDescription())?suspensionOfCets.getDescription():""%>
					</td>
					<td class="sub_heading_content suspensionQuantity<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getAmountQuantity())?suspensionOfCets.getAmountQuantity():""%>
					</td>
					<td class="sub_heading_content suspensionEstimate<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getAmountEstimateInUs())?suspensionOfCets.getAmountEstimateInUs():""%>
					</td>
					<td class="sub_heading_content suspensionSpecification<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getTechnologySpecification())?suspensionOfCets.getTechnologySpecification():""%>
					</td>
					<td class="sub_heading_content suspensionCetRate<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getCetRate())?suspensionOfCets.getCetRate():""%>
					</td>
					<td class="sub_heading_content suspensionRateProposed<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getRateProposed())?suspensionOfCets.getRateProposed():""%>
					</td>
					<td class="sub_heading_content suspensionPeriodOfRateChangeFrom<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeFrom())?new SimpleDateFormat("YYYY-dd-MM").format(suspensionOfCets.getPeriodOfRateChangeFrom()):""%>
					</td>
					<td class="sub_heading_content suspensionPeriodOfRateChangeTo<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeTo())?new SimpleDateFormat("YYYY-dd-MM").format(suspensionOfCets.getPeriodOfRateChangeTo()):""%>
					</td>
					<td>
						<span> 
							<a href="javascript:void(0)" id="yearlyWorkingTimeEditTab" onclick="cetSuspensionDetailEditTab('<%=cetSuspensionDetailVal%>');"> 
						        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
						         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
						        </svg>
						      </a> 
						  </span>
				     </td>
				     <td> 
		                <span> 
			               <a href="javascript:void(0)" id="yearlyWorkingTimeDeleteDataTab" onclick="cetSuspensionDetailDeleteData('<%=cetSuspensionDetailVal%>');"> 
		                     <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		                        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		                     </svg>
		                   </a> 
		                </span>
                     </td>
				</tr>
				<input type="hidden" id="miicSuspensionOfCetAddId<%=cetSuspensionDetailVal%>" name="miicSuspensionOfCetAddId<%=cetSuspensionDetailVal%>" value="">
					<%cetSuspensionDetailVal=cetSuspensionDetailVal+1;
							}}%>
					        
					        
					      </tbody>
					    </table>
					  </div>
					  <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(h)</span>Indication of Urgency</p>
								<input type="text" class="form-control"
									id="suspensionIndicationUrgency" value="<%=Validator.isNotNull(susOfCet)&&Validator.isNotNull(susOfCet.getIndicationOfUrgency())?susOfCet.getIndicationOfUrgency():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(i)</span>Reason for Request for Suspension of Rate</p>
								<div class="select-wrapper position-relative">
									<select class="form-control" name="pselect"
										id="suspensionOfRate">
										<option selected disabled>Please Select</option>
										<option value="Not being produced regionally"<%=susOfCet!=null?susOfCet.getRequestForSuspension().equals("Not being produced regionally")?"selected":"":StringPool.BLANK%>>Not being produced regionally</option>	
										<option value="Does not satisfy demand"<%=susOfCet!=null?susOfCet.getRequestForSuspension().equals("Does not satisfy demand")?"selected":"":StringPool.BLANK%>>Does not satisfy demand</option>
										<option value="Quality below regional standard"<%=susOfCet!=null?susOfCet.getRequestForSuspension().equals("Quality below regional standard")?"selected":"":StringPool.BLANK%>>Quality below regional standard</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group MB-0">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(j)</span>Evidence of Inability to
									Supply</p>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="suspensionEvidenceInability1" value="Unfulfilled Orders" <%=susOfCet!=null &&susOfCet.getEvidenceOfInability().contains("Unfulfilled Orders")? "checked":StringPool.BLANK%> name="suspensionEvidenceInability"> 
									<label for="suspensionEvidenceInability1"> <p class="tab-form-main-heading mb-0">Unfulfilled Orders</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="suspensionEvidenceInability2" value="Transportation Logistics" <%=susOfCet!=null &&susOfCet.getEvidenceOfInability().contains("Transportation Logistics")? "checked":StringPool.BLANK%> name="suspensionEvidenceInability"> 
									<label for="suspensionEvidenceInability2"> <p class="tab-form-main-heading mb-0">Transportation Logistics</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="suspensionEvidenceInability3" value="Efforts made to obtain regional supplies" <%=susOfCet!=null &&susOfCet.getEvidenceOfInability().contains("Efforts made to obtain regional supplies")? "checked":StringPool.BLANK%> name="suspensionEvidenceInability"> 
									<label for="suspensionEvidenceInability3"> <p class="tab-form-main-heading mb-0 text-nowrap">Efforts made to obtain regional supplies</p> </label> 
								</div> 
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(k)</span>Evidence of Consultation</p>
								<%-- 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="suspensionConsultation1" value="Local" <%=susOfCet!=null &&susOfCet.getEvidenceOfConsultation().contains("Local")? "checked":StringPool.BLANK%> name="suspensionConsultation"> 
									<label for="suspensionConsultation1"> <p class="tab-form-main-heading mb-0">Local</p> </label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="suspensionConsultation2" value="Regional" <%=susOfCet!=null &&susOfCet.getEvidenceOfConsultation().contains("Regional")? "checked":StringPool.BLANK%> name="suspensionConsultation"> 
									<label for="suspensionConsultation2"> <p class="tab-form-main-heading mb-0">Regional</p> </label> 
								</div>  --%>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control"
									id="suspensionConsultationLocal" value="<%=Validator.isNotNull(susOfCet)&&Validator.isNotNull(susOfCet.getEvidenceOfConsultation())?susOfCet.getEvidenceOfConsultation():""%>" placeholder="Local">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control"
									id="suspensionConsultationForeign" value="<%=Validator.isNotNull(susOfCet)&&Validator.isNotNull(susOfCet.getEvidenceOfConsultationForeign())?susOfCet.getEvidenceOfConsultationForeign():""%>" placeholder="Foreign">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">12.</span> Name of
									Authorized Personnel
								</p>
								<input type="text" class="form-control"
									id="authorizedPersonnelName" value="<%=Validator.isNotNull(susOfCet)&&Validator.isNotNull(susOfCet.getNameOfAuthorizedPersonnel())?susOfCet.getNameOfAuthorizedPersonnel():""%>" placeholder="">
							</div>
						</div>
					</div>
				</div>
				<div class="hide" id="miicProcessSafeguardForm">
					<div class="row"> 
                         <div class="col-md-12 mx-2"> 
                          <p class="tab-form-title f2">Safeguard Mechanism</p>  
                         </div> 
                    </div>
					<div class="row">
					  <input id="materialRequiredDetailVal" type="hidden" name="materialRequiredDetailVal" value="1">
					  <div class="col-md-12">
					    <div class="accordion secured-accordian" id="addMaterialRequiredDetailBox ">
					      <div class="accordion__header is-active"  id="addMaterialRequiredDetail" onclick="expandDetails(this.id)">
					        <div class="d-flex align-items-center">
					          <div class="d-flex align-items-center">
					            <div>
					              <span class="accordion__toggle"></span>
					            </div>
					            <div>
					              <h2>Material Required</h2>
					            </div>
					          </div>
					        </div>
					        <div>
					          <p class="accordian-employee mb-0 common-para"></p>
					        </div>
					      </div>		
					        
					      <div class="accordion__body is-active">
					        <div class="row">
								<!-- <div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Name of Producer/Manufacturer of Goods utilizing the required Material</p>
										<input type="text" class="form-control"
											id="breakdownWorkingYear" placeholder="" value="" disabled>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Address of Producer/Manufacturer of Goods utilizing the required Material</p>
										<textarea rows="3" id="suspensionTechnologySpecification"
											class="form-control" maxlength="255" placeholder="Enter Address"
											style="border-radius: 5px; width: 100%" disabled></textarea>
									</div>
								</div> -->
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(b)</span>Tariff Heading no.</p>
										<input type="text" class="form-control numeric-field"
											id="materialTariff" placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
										<p class="tab-form-sub-heading fieldAlert hide" id="materialTariffValidation" style="color: red;">Only Numeric characters are allowed</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Description</p>
										<textarea rows="3" id="materialDiscription"
											class="form-control" maxlength="255" placeholder="Enter Description"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Amount Quantity</p>
										<input type="text" class="form-control" id="materialAmount"
											value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(c)</span>Period of importation</p>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-sub-heading">Period From</p>
										<input type="date" class="form-control" id="materialImportationFrom"
											value="" placeholder="#2345"/>	
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-sub-heading">Period To</p>
										<input type="date" class="form-control" id="materialImportationTo"
											value="" placeholder="#2345"/>	
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Technical Specifications</p>
										<textarea rows="3" id="materialSpecification"
											class="form-control" maxlength="255" placeholder="Enter Technical Specifications"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4"> 
							  		<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreMaterialRequiredDetail" onclick="addMaterialRequiredDetailBox();"> <span>+ 1</span> Add More</a> 
							  	</div>
					        </div>
					      </div>
					    </div>			
					  </div>
					  
					  <div class="col-12 table-responsive hide addMaterialRequiredDetailTableBox">
					    <table class="table table-bordered mb-3">
					      <tbody class="addMaterialRequiredDetailTable">
					        <tr>
					         <!--  <th class="sub_heading">Name</th>
					          <th class="sub_heading">Address</th> -->
							  <th class="sub_heading text-nowrap">Tariff Heading no.</th>
					          <th class="sub_heading">Description</th>
					          <th class="sub_heading">Amount Quantity</th>
					          <th class="sub_heading text-nowrap">Period of importation From</th>
					          <th class="sub_heading text-nowrap">Period of importation To</th>
					          <th class="sub_heading text-nowrap">Technical Specification</th>
					          <th class="sub_heading">Edit</th>
					          <th class="sub_heading">Delete</th>
					          
					        </tr>
					        <%if(Validator.isNotNull(safeguardMaterial)&&safeguardMaterial.size()>0){
								for(MiicSafeguardMaterialAdd safeguardMaterials:safeguardMaterial){
							%>	
					        <tr>
			<%-- <td class="sub_heading_content breakdownWorkingYear<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getNameOfProducer())?safeguardMaterials.getNameOfProducer():""%></td>
			<td class="sub_heading_content suspensionTechnologySpecification<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getAddressOfProducer())?safeguardMaterials.getAddressOfProducer():""%></td> --%>
			<td class="sub_heading_content materialDiscription<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getDescription())?safeguardMaterials.getDescription():""%></td>
			<td class="sub_heading_content materialTariff<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getTariffHeadingNum())?safeguardMaterials.getTariffHeadingNum():""%></td>
			<td class="sub_heading_content materialAmount<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getAmount())?safeguardMaterials.getAmount():""%></td>
			<td class="sub_heading_content materialImportationTo<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getPeriodOfImportationTo())?new SimpleDateFormat("YYYY-dd-MM").format(safeguardMaterials.getPeriodOfImportationTo()):""%></td>
			<td class="sub_heading_content materialSpecification<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getPeriodOfImportationFrom())?new SimpleDateFormat("YYYY-dd-MM").format(safeguardMaterials.getPeriodOfImportationFrom()):""%></td>
			<td class="sub_heading_content materialImportationFrom<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getTechnologySpecification())?safeguardMaterials.getTechnologySpecification():""%></td>
			<td> 
				<span> 
					<a href="javascript:void(0)" id="MaterialEditTab"  onclick="materialRequiredDetailEditTab('<%=materialRequiredDetailVal%>');"> 
					        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
					        </svg>
					      </a> 
					  </span>
			     </td>
			     <td> 
       <span> 
       <a href="javascript:void(0)" id="materialRequiredDeleteDataTab" onclick="materialRequiredDetailDeleteData('<%=materialRequiredDetailVal%>');"> 
            <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
               <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
            </svg>
          </a> 
       </span>
    </td>
			</tr>
				<input type="hidden" id="miicSafeguardMaterialAddId<%=materialRequiredDetailVal%>" name="miicSafeguardMaterialAddId<%=materialRequiredDetailVal%>" value="">
				<%materialRequiredDetailVal=materialRequiredDetailVal+1;
							}}%>
					      </tbody>
					    </table>
					  </div>
					</div>
					<div class="row">
					  <input id="goodsProducedDetailVal" type="hidden" name="goodsProducedDetailVal" value="1">
					  <div class="col-md-12">
					    <div class="accordion secured-accordian" id="addGoodsProducedDetailBox">
					      <div class="accordion__header is-active"  id="addGoodsProducedDetail" onclick="expandDetails(this.id)">
					        <div class="d-flex align-items-center">
					          <div class="d-flex align-items-center">
					            <div>
					              <span class="accordion__toggle"></span>
					            </div>
					            <div>
					              <h2>(d) Goods To Be Produced</h2>
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
										<p class="tab-form-main-heading">Tariff Heading no.</p>
										<input type="text" class="form-control numeric-field"
											id="goodsTariff" placeholder="" value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
										<p class="tab-form-sub-heading fieldAlert hide" id="goodsTariffValidation" style="color: red;">Only Numeric characters are allowed</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Description</p>
										<textarea rows="3" id="goodsDescription"
											class="form-control" maxlength="255" placeholder="Enter Description"
											style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Amount Quantity</p>
										<input type="text" class="form-control" id="goodsQuantity"
											value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>			
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Amount Estimate Value in $JM</p>
										<input type="text" class="form-control numeric-field" id="goodsEstimate"
											value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"/>			
										<p class="tab-form-sub-heading fieldAlert hide" id="goodsEstimateValidation" style="color: red;">Only Numeric characters are allowed</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Reason for Request for the invoking of the Safeguard Mechanism</p>
										<input type="text" class="form-control" id="goodsMechanism"
											value="" placeholder="" />	
									</div>
								</div>
								 <div class="col-md-12 d-flex justify-content-end py-4"> 
								  	<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreGoodsProducedDetail" onclick="addGoodsProducedDetailBox();"> <span>+ 1</span> Add More</a> 
								 </div>
					        </div>
					      </div>
					    </div>			
					  </div>
					 
					  <div class="col-12 table-responsive hide addGoodsProducedTableBox">
					    <table class="table table-bordered mb-3">
					      <tbody class="addGoodsProducedTable">
					        <tr>
					          <th class="sub_heading text-nowrap">Tariff Heading no.</th>
					          <th class="sub_heading">Description</th>
					          <th class="sub_heading text-nowrap">Amount Quantity</th>
					          <th class="sub_heading text-nowrap">Amount Estimate Value in $JM</th>
					          <th class="sub_heading text-nowrap">Reason for Request for the invoking of the Safeguard Mechanism</th>
					          <th class="sub_heading">Edit</th>
					          <th class="sub_heading">Delete</th>
					        </tr>
					         <%if(Validator.isNotNull(safeguardAdd)&&safeguardAdd.size()>0){
								for(MiicSafeguardGoodAdd safeguardGoods:safeguardAdd){
							%>	
					        <tr>
			<td class="sub_heading_content goodsTariff<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getTariffHeadingNum())?safeguardGoods.getTariffHeadingNum():""%></td>
			<td class="sub_heading_content goodsDescription<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getDescription())?safeguardGoods.getDescription():""%></td>
			<td class="sub_heading_content goodsQuantity<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getAmountQuantity())?safeguardGoods.getAmountQuantity():""%></td>
			<td class="sub_heading_content goodsEstimate<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getAmountEstimate())?safeguardGoods.getAmountEstimate():""%></td>
			<td class="sub_heading_content goodsMechanism<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getResonForRequest())?safeguardGoods.getResonForRequest():""%></td>
			<td> 
				<span> 
					<a href="javascript:void(0)" id="GoodsEditTab" onclick="goodsProducedDetailEditTab('<%=goodsProducedDetailVal%>');"> 
				        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
				         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
				        </svg>
				      </a> 
				  </span>
		     </td>
		     <td> 
                  <span> 
                     <a href="javascript:void(0)" id="goodsProducedDeleteDataTab" onclick="goodsProducedDetailDeleteData('<%=goodsProducedDetailVal%>');"> 
                       <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
                         <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
                       </svg>
                    </a> 
                  </span>
             </td>
		</tr>
		<input type="hidden" id="miicSafeguardGoodAddId<%=goodsProducedDetailVal%>" name="miicSafeguardGoodAddId<%=goodsProducedDetailVal%>" value="">
		<%goodsProducedDetailVal=goodsProducedDetailVal+1;
							}}%>
					        
					        
					      </tbody>
					    </table>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<script>
	$("#applicantNature").change(function(){
	    applicantNature = $(this).val();
	    if(applicantNature == "Individual"){
	    	$(".indiApplication").removeClass("hide");
	    	$(".comApplication").addClass("hide");
	    }else{
	    	$(".comApplication").removeClass("hide");
	    	$(".indiApplication").addClass("hide");
	    }
	});
	
        function addMiicApplicantFormInfo(isSaveAndContinue){
        	 natureOfApplicant=$("#applicantNature").val();
     	     mainApplicantName = $("#mainApplicantName").val();
             mainProducerName = $("#mainProducerName").val();
             mainFirstName = $("#mainFirstName").val();
             mainLastName = $("#mainLastName").val();
             maincompanyName = $("#maincompanyName").val();
             mainAddress = $("#mainAddress").val();
             mainEmail = $("#mainEmail").val();
             mainTelephone = $("#mainTelephone").val();
     	     dateOfApplication=$("#mainApplicationDate").val();
             mainTrnNumber = $("#mainTrnNumber").val();
             miicApplicationId=$("#miicApplicationId").val();
	         submitForm= true;
	         miicType = $("#miic-type-option-value").val();
	         /* $("#cetName").val(mainApplicantName); */
	         /* $("#breakdownWorkingYear").val(mainProducerName);
	         $("#cetAddress, #suspensionTechnologySpecification").val(mainAddress); */
	         if(!isSaveAndContinue){
		        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		        if(!mainEmail){
				    $("#mainEmailValidation").removeClass("hide");
				    $("#mainEmailValidation").text("Please Enter Email Address");
				    $("#mainEmail").focus();
				    submitForm= false;
		        }else if(mainEmail.match(mailformat)){ 
					$("#mainEmailValidation").addClass("hide");
			    }else{
					$("#mainEmailValidation").removeClass("hide");
					$("#mainEmailValidation").text("You have Entered an In-valid email address");
					$("#mainEmail").focus();
					submitForm= false;
				}
		        if(!mainAddress){
				    $("#mainAddressValidation").removeClass("hide");
				    $("#mainAddress").focus();
				    submitForm= false;
		        }else{
			    	$("#mainAddressValidation").addClass("hide");
		        }
		        if(miicType == "Suspension of CET"){
		        	if(!mainApplicantName){
					    $("#mainApplicantNameValidation").removeClass("hide");
					    $("#mainApplicantName").focus();
					    submitForm= false;
			        }else{
				    	$("#mainApplicantNameValidation").addClass("hide");
			        }
		        }else{
		        	if(!mainProducerName){
					    $("#mainProducerNameValidation").removeClass("hide");
					    $("#mainProducerName").focus();
					    submitForm= false;
			        }else{
				    	$("#mainProducerNameValidation").addClass("hide");
			        }
		        }
	         }
	        if(submitForm){
			    $.ajax({
					type : "POST",
					url : "${miicApplicantFormInfoUrl}",
					data : {
						"<portlet:namespace/>natureOfApplicant" : natureOfApplicant,
						"<portlet:namespace/>mainApplicantName" : mainApplicantName,
						"<portlet:namespace/>mainProducerName" : mainProducerName,
						"<portlet:namespace/>mainFirstName" : mainFirstName,
						"<portlet:namespace/>mainLastName" : mainLastName,
						"<portlet:namespace/>maincompanyName" : maincompanyName,
						"<portlet:namespace/>mainAddress" : mainAddress,
						"<portlet:namespace/>mainEmail" : mainEmail,
						"<portlet:namespace/>mainTelephone" : mainTelephone,
						"<portlet:namespace/>dateOfApplication" : dateOfApplication,
						"<portlet:namespace/>mainTrnNumber" : mainTrnNumber,
						"<portlet:namespace/>miicApplicationId" : miicApplicationId,
					},
					success : function(data) {
						if(!isSaveAndContinue){
							var $active = $('.nav-tabs li>.active');
							$active.parent().next().find('.nav-link').removeClass('disabled');
							$active.parent().next().find('.nav-link span').removeClass('gray');
							nextTab($active);
							const formSections = document.getElementsByClassName('form-wizard');
						    for (const formSection of formSections) {
							 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
							}
						    $("#miicFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						}
						pendingMiicApplication();
					}
					
			    });
	        }
        }
	
	function addMiicSuspensionOfCet(){
		cetTariffHeadingNum =$("#cetTariffHeading").val();
		cetDescription = $("#cetDescription").val();
		amountQuantity = $("#suspensionQuantity").val();
		amountEstimate = $("#suspensionEstimate").val();
		technologySpecification = $("#suspensionSpecification").val();
		cetRate = $("#suspensionCetRate").val();
		rateProposed = $("#suspensionRateProposed").val();
		periodOfRateChangeFrom = $("#suspensionPeriodOfRateChangeFrom").val();
	    periodOfRateChangeTo = $("#suspensionPeriodOfRateChangeTo").val();
		miicApplicationId=$("#miicApplicationId").val();
		cetSuspensionDetailVal = $("#cetSuspensionDetailVal").val();
		$.ajax({
			type : "POST",
			url : "${addMiicSuspensionOfCetUrl}",
			data : {
				"<portlet:namespace/>cetTariffHeadingNum" : cetTariffHeadingNum,
				"<portlet:namespace/>cetDescription" : cetDescription,
				"<portlet:namespace/>amountQuantity" : amountQuantity,
				"<portlet:namespace/>amountEstimate" : amountEstimate,
				"<portlet:namespace/>technologySpecification" : technologySpecification,
				"<portlet:namespace/>cetRate" : cetRate,
				"<portlet:namespace/>rateProposed" : rateProposed,
				"<portlet:namespace/>periodOfRateChangeFrom" : periodOfRateChangeFrom,
				"<portlet:namespace/>periodOfRateChangeTo" : periodOfRateChangeTo,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>count" : cetSuspensionDetailVal,
			},
			success : function(data) {
			var result=data.APP_DATA;
		    $("#miicSuspensionOfCetAddId"+result["counter"]).val(result["miicSuspensionOfCetAddId"]);
			},
			error : function(data) {
			},
		});
	}
	function addMiicSuspensionOfCetForm(){
		indicationOfUrgency = $("#suspensionIndicationUrgency").val();
		suspensionOfRate = $("#suspensionOfRate").val();
		var selectedEvidenceOfInability = new Array();
		$("input:checkbox[name=suspensionEvidenceInability]:checked").each(function(){
			selectedEvidenceOfInability.push($(this).val());
		});
		var suspensionEvidenceInability = selectedEvidenceOfInability.toString();
		var selectedEvidenceOfConsultation = new Array();
		$("input:checkbox[name=suspensionConsultation]:checked").each(function(){
			selectedEvidenceOfConsultation.push($(this).val());
		});
		var suspensionConsultation = selectedEvidenceOfConsultation.toString();
		suspensionConsultationLocal = $("#suspensionConsultationLocal").val();
		suspensionConsultationForeign = $("#suspensionConsultationForeign").val();
		authorizedPersonnelName = $("#authorizedPersonnelName").val();
		miicApplicationId=$("#miicApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${addMiicSuspensionOfCetFormUrl}",
			data : {
				"<portlet:namespace/>indicationOfUrgency" : indicationOfUrgency,
				"<portlet:namespace/>suspensionOfRate" : suspensionOfRate,
				"<portlet:namespace/>suspensionEvidenceInability" : suspensionEvidenceInability,
				"<portlet:namespace/>suspensionConsultation" : suspensionConsultation,
				"<portlet:namespace/>suspensionConsultationLocal" : suspensionConsultationLocal,
				"<portlet:namespace/>suspensionConsultationForeign" : suspensionConsultationForeign,
				"<portlet:namespace/>authorizedPersonnelName" : authorizedPersonnelName,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
	}
	
	function addMiicSafeguardMechanismMaterialRequired(counter){
		description = $("#materialDiscription").val();
		tariffHeadingNum = $("#materialTariff").val();
		amount = $("#materialAmount").val();
		technologySpecification = $("#materialSpecification").val();
		materialImportationFrom = $("#materialImportationFrom").val();
		materialImportationTo = $("#materialImportationTo").val();
		miicApplicationId = $("#miicApplicationId").val();
		materialRequiredDetailVal = $("#materialRequiredDetailVal").val();
		$.ajax({
			type : "POST",
			url : "${addMiicSafeguardMechanismMaterialRequiredUrl}",
			data : {
				"<portlet:namespace/>description" : description,
				"<portlet:namespace/>tariffHeadingNum" : tariffHeadingNum,
				"<portlet:namespace/>amount" : amount,
				"<portlet:namespace/>technologySpecification" : technologySpecification,
				"<portlet:namespace/>materialImportationFrom" : materialImportationFrom,
				"<portlet:namespace/>materialImportationTo" : materialImportationTo,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>count" : materialRequiredDetailVal,
			},
			success : function(data) {
			var result=data.APP_DATA;
			var counter=result["counter"];
		    $("#miicSafeguardMaterialAddId"+result["counter"]).val(result["miicSafeguardMaterialAddId"]);
			},
			error : function(data) {
			},
		});
	}
	function addMiicSafeguardMechanismgGoodsToBeProduced(){
		tariffHeadingNum = $("#goodsTariff").val();
		description = $("#goodsDescription").val();
		amountQuantity = $("#goodsQuantity").val();
		amountEstimate = $("#goodsEstimate").val();
		safeguardMechanism = $("#goodsMechanism").val();
		miicApplicationId = $("#miicApplicationId").val();
		goodsProducedDetailVal = $("#goodsProducedDetailVal").val();
		$.ajax({
			type : "POST",
			url : "${addMiicSafeguardMechanismGoodsToBeProducedUrl}",
			data : {
				"<portlet:namespace/>tariffHeadingNum" : tariffHeadingNum,
				"<portlet:namespace/>description" : description,
				"<portlet:namespace/>amountQuantity" : amountQuantity,
				"<portlet:namespace/>amountEstimate" : amountEstimate,
				"<portlet:namespace/>safeguardMechanism" : safeguardMechanism,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>count" : goodsProducedDetailVal,
			},
			success : function(data) {
			var result=data.APP_DATA;
			addMaterialRequiredDetailBox();
			addGoodsProducedDetailBox();
		    $("#miicSafeguardGoodAddId"+result["counter"]).val(result["miicSafeguardGoodAddId"]);
			},
			error : function(data) {
			},
		});
	}

/* ADD MORE FORMS JS */

      function addCetSuspensionDetailBox(){
		cetSuspensionDetailVal = $("#cetSuspensionDetailVal").val();
		/* cetName = $("#cetName").val(); */
		cetTariffHeading =$("#cetTariffHeading").val();
		/* cetAddress =$("#cetAddress").val(); */
		cetDescription = $("#cetDescription").val();
		suspensionQuantity = $("#suspensionQuantity").val();
		suspensionEstimate = $("#suspensionEstimate").val();
		suspensionSpecification = $("#suspensionSpecification").val();
		suspensionCetRate = $("#suspensionCetRate").val();
		suspensionRateProposed = $("#suspensionRateProposed").val();
		suspensionPeriodOfRateChangeFrom = $("#suspensionPeriodOfRateChangeFrom").val();
		suspensionPeriodOfRateChangeTo = $("#suspensionPeriodOfRateChangeTo").val();
		if(cetTariffHeading !="" || cetDescription !="" || 
				suspensionQuantity !="" || suspensionEstimate !="" || 
				suspensionSpecification !="" || suspensionCetRate !="" || suspensionRateProposed !=""
				|| suspensionPeriodOfRateChangeFrom !="" || suspensionPeriodOfRateChangeTo !=""){
			$(".addCetSuspensionDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addCetSuspensionDetailInfoUrl}",
				data : {
					"<portlet:namespace/>cetSuspensionDetailVal" : cetSuspensionDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addCetSuspensionDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */
					
					/* $(".cetName" + cetSuspensionDetailVal).append(cetName); */
					$(".cetTariffHeading" + cetSuspensionDetailVal).append(cetTariffHeading);
					/* $(".cetAddress" + cetSuspensionDetailVal).append(cetAddress); */
					$(".cetDescription" + cetSuspensionDetailVal).append(cetDescription);
					$(".suspensionQuantity" + cetSuspensionDetailVal).append(suspensionQuantity);
					$(".suspensionEstimate" + cetSuspensionDetailVal).append(suspensionEstimate);
					$(".suspensionSpecification" + cetSuspensionDetailVal).append(suspensionSpecification);
					$(".suspensionCetRate" + cetSuspensionDetailVal).append(suspensionCetRate);
					$(".suspensionRateProposed" + cetSuspensionDetailVal).append(suspensionRateProposed);
					$(".suspensionPeriodOfRateChangeFrom" + cetSuspensionDetailVal).append(suspensionPeriodOfRateChangeFrom);
					$(".suspensionPeriodOfRateChangeTo" + cetSuspensionDetailVal).append(suspensionPeriodOfRateChangeTo);
					/* occupantDirectorInfo(""); */
					/* VALUE INCREAMENT */
					addMiicSuspensionOfCet();
					cetSuspensionDetailVal++;
					$("#cetSuspensionDetailVal").val(cetSuspensionDetailVal);
					/* RESET FORM FIELDS */
					/* $("#cetName").val(""); */
					$("#cetTariffHeading").val("");
					/* $("#cetAddress").val(""); */
					$("#cetDescription").val("");
					$("#suspensionQuantity").val("");
					$("#suspensionEstimate").val("");
					$("#suspensionSpecification").val("");
					$("#suspensionCetRate").val("");
					$("#suspensionRateProposed").val("");
					$("#suspensionPeriodOfRateChangeFrom").val("");
					$("#suspensionPeriodOfRateChangeTo").val("");
				}
			});
		}else{
			$("#cetTariffHeading").focus();
		}
	}
	
	function cetSuspensionDetailEditTab(cetSuspensionDetailVal){
		$(".editCetSuspensionDetailPopup").modal("show");
		/* $(".editCetName").attr("id" , "editCetName"+cetSuspensionDetailVal); */
		$(".editCetTariffHeading").attr("id" , "editCetTariffHeading"+cetSuspensionDetailVal);
		/* $(".editCetAddress").attr("id" , "editCetAddress"+cetSuspensionDetailVal); */
		$(".editCetDescription").attr("id" , "editCetDescription"+cetSuspensionDetailVal);
		$(".editSuspensionQuantity").attr("id" , "editSuspensionQuantity"+cetSuspensionDetailVal);
		$(".editSuspensionEstimate").attr("id" , "editSuspensionEstimate"+cetSuspensionDetailVal);
		$(".editSuspensionSpecification").attr("id" , "editSuspensionSpecification"+cetSuspensionDetailVal);
		$(".editSuspensionCetRate").attr("id" , "editSuspensionCetRate"+cetSuspensionDetailVal);
		$(".editSuspensionRateProposed").attr("id" , "editSuspensionRateProposed"+cetSuspensionDetailVal);
		$(".editSuspensionPeriodOfRateChangeFrom").attr("id" , "editSuspensionPeriodOfRateChangeFrom"+cetSuspensionDetailVal);
		$(".editSuspensionPeriodOfRateChangeTo").attr("id" , "editSuspensionPeriodOfRateChangeTo"+cetSuspensionDetailVal);
		
		/* cetName = $(".cetName"+cetSuspensionDetailVal+":first").text().trim(); */
		cetTariffHeading = $(".cetTariffHeading"+cetSuspensionDetailVal+":first").text().trim();
		/* cetAddress = $(".cetAddress"+cetSuspensionDetailVal+":first").text().trim(); */
		cetDescription = $(".cetDescription"+cetSuspensionDetailVal+":first").text().trim();
		suspensionQuantity = $(".suspensionQuantity"+cetSuspensionDetailVal+":first").text().trim();
		suspensionEstimate = $(".suspensionEstimate"+cetSuspensionDetailVal+":first").text().trim();
		suspensionSpecification = $(".suspensionSpecification"+cetSuspensionDetailVal+":first").text().trim();
		suspensionCetRate = $(".suspensionCetRate"+cetSuspensionDetailVal+":first").text().trim();
		suspensionRateProposed = $(".suspensionRateProposed"+cetSuspensionDetailVal+":first").text().trim();
		suspensionPeriodOfRateChangeFrom = $(".suspensionPeriodOfRateChangeFrom"+cetSuspensionDetailVal+":first").text().trim();
		suspensionPeriodOfRateChangeTo = $(".suspensionPeriodOfRateChangeTo"+cetSuspensionDetailVal+":first").text().trim();
		
		/* $("#editCetName"+cetSuspensionDetailVal).val(cetName); */
		$("#editCetTariffHeading"+cetSuspensionDetailVal).val(cetTariffHeading);
		/* $("#editCetAddress"+cetSuspensionDetailVal).val(cetAddress); */
		$("#editCetDescription"+cetSuspensionDetailVal).val(cetDescription);
		$("#editSuspensionQuantity"+cetSuspensionDetailVal).val(suspensionQuantity);
		$("#editSuspensionEstimate"+cetSuspensionDetailVal).val(suspensionEstimate);
		$("#editSuspensionSpecification"+cetSuspensionDetailVal).val(suspensionSpecification);
		$("#editSuspensionCetRate"+cetSuspensionDetailVal).val(suspensionCetRate);
		$("#editSuspensionRateProposed"+cetSuspensionDetailVal).val(suspensionRateProposed);
		$("#editSuspensionPeriodOfRateChangeFrom"+cetSuspensionDetailVal).val(suspensionPeriodOfRateChangeFrom);
		$("#editSuspensionPeriodOfRateChangeTo"+cetSuspensionDetailVal).val(suspensionPeriodOfRateChangeTo);
		
		$(".saveEditCetSuspensionDetailPopupDataBtn").attr("onclick" , "cetSuspensionDetailEditData("+cetSuspensionDetailVal+")");
	}
	
	function cetSuspensionDetailDeleteData(cetSuspensionDetailValData) {
		  var cetSuspensionCountCounter = $("#cetSuspensionDetailVal").val();
		  $("#cetSuspensionDetailVal").val(cetSuspensionCountCounter - 1);
		  var delRowElement = $(".suspension-row" + cetSuspensionDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(cetSuspensionDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= cetSuspensionCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".suspension-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "suspension-row"+ prevCounter);
		    rowElement.find("td.cetTariffHeading"+i).removeClass("cetTariffHeading"+i).addClass("cetTariffHeading"+prevCounter);
		    rowElement.find("td.cetDescription"+i).removeClass("cetDescription"+i).addClass("cetDescription"+prevCounter);
		    rowElement.find("td.suspensionQuantity"+i).removeClass("suspensionQuantity"+i).addClass("suspensionQuantity"+prevCounter);
		    rowElement.find("td.suspensionEstimate"+i).removeClass("suspensionEstimate"+i).addClass("suspensionEstimate"+prevCounter);
		    rowElement.find("td.suspensionSpecification"+i).removeClass("suspensionSpecification"+i).addClass("suspensionSpecification"+prevCounter);
		    rowElement.find("td.suspensionCetRate"+i).removeClass("suspensionCetRate"+i).addClass("suspensionCetRate"+prevCounter);
		    rowElement.find("td.suspensionRateProposed"+i).removeClass("suspensionRateProposed"+i).addClass("suspensionRateProposed"+prevCounter);
		    rowElement.find("td.suspensionPeriodOfRateChangeFrom"+i).removeClass("suspensionPeriodOfRateChangeFrom"+i).addClass("suspensionPeriodOfRateChangeFrom"+prevCounter);
		    rowElement.find("td.suspensionPeriodOfRateChangeTo"+i).removeClass("suspensionPeriodOfRateChangeTo"+i).addClass("suspensionPeriodOfRateChangeTo"+prevCounter);
		    rowElement.find("#yearlyWorkingTimeDeleteDataTab").attr('onclick', 'cetSuspensionDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#yearlyWorkingTimeEditTab").attr('onclick', 'cetSuspensionDetailEditTab(' +prevCounter+ ')');
		  }
	 }
	
	function cetSuspensionDetailEditData(cetSuspensionDetailVal){
		/* $(".cetName" + cetSuspensionDetailVal).html($("#editCetName"+cetSuspensionDetailVal).val()); */
		$(".cetTariffHeading" + cetSuspensionDetailVal).html($("#editCetTariffHeading"+cetSuspensionDetailVal).val());
		/* $(".cetAddress" + cetSuspensionDetailVal).html($("#editCetAddress"+cetSuspensionDetailVal).val()); */
		$(".cetDescription" + cetSuspensionDetailVal).html($("#editCetDescription"+cetSuspensionDetailVal).val());
		$(".suspensionQuantity" + cetSuspensionDetailVal).html($("#editSuspensionQuantity"+cetSuspensionDetailVal).val());
		$(".suspensionEstimate" + cetSuspensionDetailVal).html($("#editSuspensionEstimate"+cetSuspensionDetailVal).val());
		$(".suspensionSpecification" + cetSuspensionDetailVal).html($("#editSuspensionSpecification"+cetSuspensionDetailVal).val());
		$(".suspensionCetRate" + cetSuspensionDetailVal).html($("#editSuspensionCetRate"+cetSuspensionDetailVal).val());
		$(".suspensionRateProposed" + cetSuspensionDetailVal).html($("#editSuspensionRateProposed"+cetSuspensionDetailVal).val());
		$(".suspensionPeriodOfRateChangeFrom" + cetSuspensionDetailVal).html($("#editSuspensionPeriodOfRateChangeFrom"+cetSuspensionDetailVal).val());
		$(".suspensionPeriodOfRateChangeTo" + cetSuspensionDetailVal).html($("#editSuspensionPeriodOfRateChangeTo"+cetSuspensionDetailVal).val());
		
		cetTariffHeadingNum =$(".editCetTariffHeading").val();
		cetDescription = $(".editCetDescription").val();
		amountQuantity = $(".editSuspensionQuantity").val();
		amountEstimate = $(".editSuspensionEstimate").val();
		technologySpecification = $(".editSuspensionSpecification").val();
		cetRate = $(".editSuspensionCetRate").val();
		rateProposed = $(".editSuspensionRateProposed").val();
		periodOfRateChangeFrom = $(".editSuspensionPeriodOfRateChangeFrom").val();
		periodOfRateChangeTo = $(".editSuspensionPeriodOfRateChangeTo").val();
		miicApplicationId=$("#miicApplicationId").val();
		miicSuspensionOfCetAddId = $("#miicSuspensionOfCetAddId"+cetSuspensionDetailVal).val();
		cetSuspensionDetailVal = $("#cetSuspensionDetailVal").val();
		
		/* $(".editCetName").val(""); */
		$(".editCetTariffHeading").val("");
		/* $(".editCetAddress").val(""); */
		$(".editCetDescription").val("");
		$(".editSuspensionQuantity").val("");
		$(".editSuspensionEstimate").val("");
		$(".editSuspensionSpecification").val("");
		$(".editSuspensionCetRate").val("");
		$(".editSuspensionRateProposed").val("");
		$(".editSuspensionPeriodOfRateChangeFrom").val("");
		$(".editSuspensionPeriodOfRateChangeTo").val("");
		$.ajax({
			type : "POST",
			url : "${addMiicSuspensionOfCetUrl}",
			data : {
				"<portlet:namespace/>cetTariffHeadingNum" : cetTariffHeadingNum,
				"<portlet:namespace/>cetDescription" : cetDescription,
				"<portlet:namespace/>amountQuantity" : amountQuantity,
				"<portlet:namespace/>amountEstimate" : amountEstimate,
				"<portlet:namespace/>technologySpecification" : technologySpecification,
				"<portlet:namespace/>cetRate" : cetRate,
				"<portlet:namespace/>rateProposed" : rateProposed,
				"<portlet:namespace/>periodOfRateChangeFrom" : periodOfRateChangeFrom,
				"<portlet:namespace/>periodOfRateChangeTo" : periodOfRateChangeTo,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>miicSuspensionOfCetAddId" : miicSuspensionOfCetAddId,
				"<portlet:namespace/>count" : cetSuspensionDetailVal,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
		
	}
	
	function addMaterialRequiredDetailBox(){
		materialRequiredDetailVal = $("#materialRequiredDetailVal").val();
		/* breakdownWorkingYear = $("#breakdownWorkingYear").val();
		suspensionTechnologySpecification =$("#suspensionTechnologySpecification").val(); */
		materialDiscription =$("#materialDiscription").val();
		materialTariff = $("#materialTariff").val();
		materialAmount = $("#materialAmount").val();
		materialSpecification = $("#materialSpecification").val();
		materialImportationFrom = $("#materialImportationFrom").val();
		materialImportationTo = $("#materialImportationTo").val();
		if(materialDiscription !="" || materialTariff !="" || materialAmount !="" || materialSpecification !="" || materialImportationFrom !=""
				|| materialImportationTo !=""){
			$(".addMaterialRequiredDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMaterialRequiredDetailInfoUrl}",
				data : {
					"<portlet:namespace/>materialRequiredDetailVal" : materialRequiredDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addMaterialRequiredDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */
					
					/* $(".breakdownWorkingYear" + materialRequiredDetailVal).append(breakdownWorkingYear);
					$(".suspensionTechnologySpecification" + materialRequiredDetailVal).append(suspensionTechnologySpecification); */
					$(".materialDiscription" + materialRequiredDetailVal).append(materialDiscription);
					$(".materialTariff" + materialRequiredDetailVal).append(materialTariff);
					$(".materialAmount" + materialRequiredDetailVal).append(materialAmount);
					$(".materialSpecification" + materialRequiredDetailVal).append(materialSpecification);
					$(".materialImportationFrom" + materialRequiredDetailVal).append(materialImportationFrom);
					$(".materialImportationTo" + materialRequiredDetailVal).append(materialImportationTo);
					
					/* occupantDirectorInfo(""); */
					/* VALUE INCREAMENT */
					addMiicSafeguardMechanismMaterialRequired('');
					materialRequiredDetailVal++;
					$("#materialRequiredDetailVal").val(materialRequiredDetailVal);
					/* RESET FORM FIELDS */
					/* $("#breakdownWorkingYear").val(""); */
					/* $("#suspensionTechnologySpecification").val(""); */
					$("#materialDiscription").val("");
					$("#materialTariff").val("");
					$("#materialAmount").val("");
					$("#materialSpecification").val("");
					$("#materialImportationFrom").val("");
					$("#materialImportationTo").val("");
				} 
			});
		}else{
			$("#materialDiscription").focus();
		}
	}

	function materialRequiredDetailEditTab(materialRequiredDetailVal){
		$(".editMaterialRequiredDetailPopup").modal("show");
		/* $(".editbreakdownWorkingYear").attr("id" , "editbreakdownWorkingYear"+materialRequiredDetailVal);
		$(".editsuspensionTechnologySpecification").attr("id" , "editsuspensionTechnologySpecification"+materialRequiredDetailVal); */
		$(".editmaterialDiscription").attr("id" , "editmaterialDiscription"+materialRequiredDetailVal);
		$(".editmmaterialTariff").attr("id" , "editmmaterialTariff"+materialRequiredDetailVal);
		$(".editmaterialAmount").attr("id" , "editmaterialAmount"+materialRequiredDetailVal);
		$(".editmaterialSpecification").attr("id" , "editmaterialSpecification"+materialRequiredDetailVal);
		$(".editMaterialImportationFrom").attr("id" , "editMaterialImportationFrom"+materialRequiredDetailVal);
		$(".editMaterialImportationTo").attr("id" , "editMaterialImportationTo"+materialRequiredDetailVal);

		/* breakdownWorkingYear = $(".breakdownWorkingYear"+materialRequiredDetailVal+":first").text().trim();
		suspensionTechnologySpecification = $(".suspensionTechnologySpecification"+materialRequiredDetailVal+":first").text().trim(); */
		materialDiscription = $(".materialDiscription"+materialRequiredDetailVal+":first").text().trim();
		materialTariff = $(".materialTariff"+materialRequiredDetailVal+":first").text().trim();
		materialAmount = $(".materialAmount"+materialRequiredDetailVal+":first").text().trim();
		materialSpecification = $(".materialSpecification"+materialRequiredDetailVal+":first").text().trim();
		materialImportationFrom = $(".materialImportationFrom"+materialRequiredDetailVal+":first").text().trim();
		materialImportationTo = $(".materialImportationTo"+materialRequiredDetailVal+":first").text().trim();
		
		/* $("#editbreakdownWorkingYear"+materialRequiredDetailVal).val(breakdownWorkingYear);
		$("#editsuspensionTechnologySpecification"+materialRequiredDetailVal).val(suspensionTechnologySpecification); */
		$("#editmaterialDiscription"+materialRequiredDetailVal).val(materialDiscription);
		$("#editmmaterialTariff"+materialRequiredDetailVal).val(materialTariff);
		$("#editmaterialAmount"+materialRequiredDetailVal).val(materialAmount);
		$("#editmaterialSpecification"+materialRequiredDetailVal).val(materialSpecification);
		$("#editMaterialImportationFrom"+materialRequiredDetailVal).val(materialImportationFrom);
		$("#editMaterialImportationTo"+materialRequiredDetailVal).val(materialImportationTo);

		$(".saveEditMaterialRequiredDetailPopupDataBtn").attr("onclick" , "materialRequiredDetailEditData("+materialRequiredDetailVal+")");
	}
	
	function materialRequiredDetailDeleteData(materialRequiredDetailValData) {
		  var materialRequiredCountCounter = $("#materialRequiredDetailVal").val();
		  $("#materialRequiredDetailVal").val(materialRequiredCountCounter - 1);
		  var delRowElement = $(".material-row" + materialRequiredDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(materialRequiredDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= materialRequiredCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".material-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "material-row"+ prevCounter);
		    rowElement.find("td.materialDiscription"+i).removeClass("materialDiscription"+i).addClass("materialDiscription"+prevCounter);
		    rowElement.find("td.materialTariff"+i).removeClass("materialTariff"+i).addClass("materialTariff"+prevCounter);
		    rowElement.find("td.materialAmount"+i).removeClass("materialAmount"+i).addClass("materialAmount"+prevCounter);
		    rowElement.find("td.materialImportationFrom"+i).removeClass("materialImportationFrom"+i).addClass("materialImportationFrom"+prevCounter);
		    rowElement.find("td.materialImportationTo"+i).removeClass("materialImportationTo"+i).addClass("materialImportationTo"+prevCounter);
		    rowElement.find("td.materialSpecification"+i).removeClass("materialSpecification"+i).addClass("materialSpecification"+prevCounter);
		    rowElement.find("#materialRequiredDeleteDataTab").attr('onclick', 'materialRequiredDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#MaterialEditTab").attr('onclick', 'materialRequiredDetailEditTab(' +prevCounter+ ')');
		  }
	 }
	
	function materialRequiredDetailEditData(materialRequiredDetailVal){
		/* $(".breakdownWorkingYear" + materialRequiredDetailVal).html($("#editbreakdownWorkingYear"+materialRequiredDetailVal).val());
		$(".suspensionTechnologySpecification" + materialRequiredDetailVal).html($("#editsuspensionTechnologySpecification"+materialRequiredDetailVal).val()); */
		$(".materialDiscription" + materialRequiredDetailVal).html($("#editmaterialDiscription"+materialRequiredDetailVal).val());
		$(".materialTariff" + materialRequiredDetailVal).html($("#editmaterialTariff"+materialRequiredDetailVal).val());
		$(".materialAmount" + materialRequiredDetailVal).html($("#editmaterialAmount"+materialRequiredDetailVal).val());
		$(".materialSpecification" + materialRequiredDetailVal).html($("#editmaterialSpecification"+materialRequiredDetailVal).val());
		$(".materialImportationFrom" +materialRequiredDetailVal).html($("#editMaterialImportationFrom"+materialRequiredDetailVal).val());
		$(".materialImportationTo" +materialRequiredDetailVal).html($("#editMaterialImportationTo"+materialRequiredDetailVal).val());
		
		/* nameOfProducer = $(".editbreakdownWorkingYear").val();
		addressOfProducer = $(".editsuspensionTechnologySpecification").val(); */
		description = $(".editmaterialDiscription").val();
		tariffHeadingNum = $(".editmaterialTariff").val();
		amount = $(".editmaterialAmount").val();
		technologySpecification = $(".editmaterialSpecification").val();
		materialImportationFrom = $(".editMaterialImportationFrom").val();
		materialImportationTo = $(".editMaterialImportationTo").val();
		miicApplicationId = $("#miicApplicationId").val();
		miicSafeguardMaterialAddId = $("#miicSafeguardMaterialAddId"+materialRequiredDetailVal).val();
		materialRequiredDetailVal = $("#materialRequiredDetailVal").val();
		
		/* $(".editbreakdownWorkingYear").val("");
		$(".editsuspensionTechnologySpecification").val(""); */
		$(".editmaterialDiscription").val("");
		$(".editmaterialTariff").val("");
		$(".editmaterialAmount").val("");
		$(".editmaterialSpecification").val("");
		$(".editMaterialImportationFrom").val("");
		$(".editMaterialImportationTo").val("");
		$.ajax({
			type : "POST",
			url : "${addMiicSafeguardMechanismMaterialRequiredUrl}",
			data : {
				/* "<portlet:namespace/>nameOfProducer" : nameOfProducer,
				"<portlet:namespace/>addressOfProducer" : addressOfProducer, */
				"<portlet:namespace/>description" : description,
				"<portlet:namespace/>tariffHeadingNum" : tariffHeadingNum,
				"<portlet:namespace/>amount" : amount,
				/* "<portlet:namespace/>quantity" : quantity, */
				"<portlet:namespace/>technologySpecification" : technologySpecification,
				"<portlet:namespace/>materialImportationFrom" : materialImportationFrom,
				"<portlet:namespace/>materialImportationTo" : materialImportationTo,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>miicSafeguardMaterialAddId" : miicSafeguardMaterialAddId,
				"<portlet:namespace/>count" : materialRequiredDetailVal,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
		
	}

	function addGoodsProducedDetailBox(){
		goodsProducedDetailVal = $("#goodsProducedDetailVal").val();
		goodsTariff = $("#goodsTariff").val();
		goodsDescription =$("#goodsDescription").val();
		goodsQuantity =$("#goodsQuantity").val();
		goodsEstimate = $("#goodsEstimate").val();
		goodsMechanism = $("#goodsMechanism").val();
		if(goodsTariff != "" || goodsDescription !="" || goodsQuantity !="" || goodsEstimate !="" || goodsMechanism !=""){
			$(".addGoodsProducedTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addGoodsProduceDetailInfoUrl}",
				data : {
					"<portlet:namespace/>goodsProducedDetailVal" : goodsProducedDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addGoodsProducedTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
 							$cloneRow.find('td').slice(-2).remove();
 							$(this).append($cloneRow);
						}
					});
					
					/* APPEND DATA INTO TABLE */
					$(".goodsTariff" + goodsProducedDetailVal).append(goodsTariff);
					$(".goodsDescription" + goodsProducedDetailVal).append(goodsDescription);
					$(".goodsQuantity" + goodsProducedDetailVal).append(goodsQuantity);
					$(".goodsEstimate" + goodsProducedDetailVal).append(goodsEstimate);
					$(".goodsMechanism" + goodsProducedDetailVal).append(goodsMechanism);
					
					/* occupantDirectorInfo(""); */
					/* VALUE INCREAMENT */
					addMiicSafeguardMechanismgGoodsToBeProduced();
					goodsProducedDetailVal++;
					$("#goodsProducedDetailVal").val(goodsProducedDetailVal);
					/* RESET FORM FIELDS */
					$("#goodsTariff").val("");
					$("#goodsDescription").val("");
					$("#goodsQuantity").val("");
					$("#goodsEstimate").val("");
					$("#goodsMechanism").val("");
				}
			});
		}else{
			$("#goodsTariff").focus();
		}
	}
	
	function goodsProducedDetailEditData(goodsProducedDetailVal){
		$(".goodsTariff" + goodsProducedDetailVal).html($("#editgoodsTarif"+goodsProducedDetailVal).val());
		$(".goodsDescription" + goodsProducedDetailVal).html($("#editgoodsDescription"+goodsProducedDetailVal).val());
		$(".goodsQuantity" + goodsProducedDetailVal).html($("#editgoodsQuantity"+goodsProducedDetailVal).val());
		$(".goodsEstimate" + goodsProducedDetailVal).html($("#editgoodsEstimate"+goodsProducedDetailVal).val());
		$(".goodsMechanism" + goodsProducedDetailVal).html($("#editgoodsMechanism"+goodsProducedDetailVal).val());
		
		tariffHeadingNum=$(".editgoodsTarif").val();
		description=$(".editgoodsDescription").val();
		amountQuantity=$(".editgoodsQuantity").val();
		amountEstimate=$(".editgoodsEstimate").val();
		safeguardMechanism=$(".editgoodsMechanism").val();
		miicApplicationId = $("#miicApplicationId").val();
		miicSafeguardGoodAddId = $("#miicSafeguardGoodAddId"+goodsProducedDetailVal).val();
		goodsProducedDetailVal = $("#goodsProducedDetailVal").val();
		
		$(".editgoodsTarif").val("");
		$(".editgoodsDescription").val("");
		$(".editgoodsQuantity").val("");
		$(".editgoodsEstimate").val("");
		$(".editgoodsMechanism").val("");
		$.ajax({
			type : "POST",
			url : "${addMiicSafeguardMechanismGoodsToBeProducedUrl}",
			data : {
				"<portlet:namespace/>tariffHeadingNum" : tariffHeadingNum,
				"<portlet:namespace/>description" : description,
				"<portlet:namespace/>amountQuantity" : amountQuantity,
				"<portlet:namespace/>amountEstimate" : amountEstimate,
				"<portlet:namespace/>safeguardMechanism" : safeguardMechanism,
				"<portlet:namespace/>miicApplicationId" : miicApplicationId,
				"<portlet:namespace/>miicSafeguardGoodAddId" : miicSafeguardGoodAddId,
				"<portlet:namespace/>count" : goodsProducedDetailVal,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
		
	}
	function goodsProducedDetailEditTab(goodsProducedDetailVal){
		$(".editgoodsProducedDetailopup").modal("show");
		$(".editgoodsTariff").attr("id" , "editgoodsTariff"+goodsProducedDetailVal);
		$(".editgoodsDescription").attr("id" , "editgoodsDescription"+goodsProducedDetailVal);
		$(".editgoodsQuantity").attr("id" , "editgoodsQuantity"+goodsProducedDetailVal);
		$(".editgoodsEstimate").attr("id" , "editgoodsEstimate"+goodsProducedDetailVal);
		$(".editgoodsMechanism").attr("id" , "editgoodsMechanism"+goodsProducedDetailVal);
		
		goodsTariff = $(".goodsTariff"+goodsProducedDetailVal+":first").text().trim();
		goodsDescription = $(".goodsDescription"+goodsProducedDetailVal+":first").text().trim();
		goodsQuantity = $(".goodsQuantity"+goodsProducedDetailVal+":first").text().trim();
		goodsEstimate = $(".goodsEstimate"+goodsProducedDetailVal+":first").text().trim();
		goodsMechanism = $(".goodsMechanism"+goodsProducedDetailVal+":first").text().trim();
		
		$("#editgoodsTariff"+goodsProducedDetailVal).val(goodsTariff);
		$("#editgoodsDescription"+goodsProducedDetailVal).val(goodsDescription);
		$("#editgoodsQuantity"+goodsProducedDetailVal).val(goodsQuantity);
		$("#editgoodsEstimate"+goodsProducedDetailVal).val(goodsEstimate);
		$("#editgoodsMechanism"+goodsProducedDetailVal).val(goodsMechanism);
		
		$(".saveEditgoodsProducedDetailPopupDataBtn").attr("onclick" , "goodsProducedDetailEditData("+goodsProducedDetailVal+")");
	}
	
	function goodsProducedDetailDeleteData(goodsProducedDetailValData) {
		  var goodsProducedCountCounter = $("#goodsProducedDetailVal").val();
		  $("#goodsProducedDetailVal").val(goodsProducedCountCounter - 1);
		  var delRowElement = $(".goodsProduced-row" + goodsProducedDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(goodsProducedDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= goodsProducedCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".goodsProduced-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "goodsProduced-row"+ prevCounter);
		    rowElement.find("td.goodsTariff"+i).removeClass("goodsTariff"+i).addClass("goodsTariff"+prevCounter);
		    rowElement.find("td.goodsDescription"+i).removeClass("goodsDescription"+i).addClass("goodsDescription"+prevCounter);
		    rowElement.find("td.goodsQuantity"+i).removeClass("goodsQuantity"+i).addClass("goodsQuantity"+prevCounter);
		    rowElement.find("td.goodsEstimate"+i).removeClass("goodsEstimate"+i).addClass("goodsEstimate"+prevCounter);
		    rowElement.find("td.goodsMechanism"+i).removeClass("goodsMechanism"+i).addClass("goodsMechanism"+prevCounter);
		    rowElement.find("#goodsProducedDeleteDataTab").attr('onclick', 'goodsProducedDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#GoodsEditTab").attr('onclick', 'goodsProducedDetailEditTab(' +prevCounter+ ')');
		  }
	 }
	
</script>