<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
 <div class="tab-pane active confidential-ver-forms" role="tabpanel" id="childStep1">
      <div class="tab-form">
          <div class="information-request-details-forms">
              <div class="row">
                  <div class="col-md-12">
                      <p class="tab-form-title f2">Information Request</p>
                      <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.
                      </p>
                  </div>
              </div>
              <div class="row"> 
                  <div class="col-md-12">
                      <div class="form-group">
                          <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Company Name *</p>
                          <input type="text" class="form-control" id="comName" value="<%=infoReq!=null?infoReq.getCompanyName():StringPool.BLANK %>" placeholder="Company Name" />
                          <p class="tab-form-sub-heading fieldAlert hide" id="comNameValidation" style="color: red;">Enter a Name of Company</p>
                      </div>
                  </div>
                  <div class="col-md-12"> 
                      <div class="form-group"> 
                          <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Address</p>
                          <textarea rows="3" class="mt-3 form-control" maxlength="255" id="address" placeholder="Address" style="border-radius: 5px; width: 100%"><%=infoReq!=null?infoReq.getAddress():StringPool.BLANK %></textarea>
                      </div> 
                  </div>
                  <div class="col-md-12"> 
                      <div class="form-group mb-0"> 
                       <p class="tab-form-main-heading mb-0">Phone</p> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Main</p> 
                       <input type="text" class="form-control" id="mainTelephone" placeholder="" value="<%=infoReq!=null?infoReq.getMainTelephone():StringPool.BLANK %>"
                        oninput="formatPhoneNumber(this);"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Office</p> 
                       <input type="text" class="form-control" id="officeTelephone" placeholder="" value="<%=infoReq!=null?infoReq.getOfficeTelephone():StringPool.BLANK %>"
                        oninput="formatPhoneNumber(this);"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Cell</p> 
                       <input type="text" class="form-control" id="cellTelephone" placeholder="" value="<%=infoReq!=null?infoReq.getCellTelephone():StringPool.BLANK %>"
                        oninput="formatPhoneNumber(this);"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Whatsapp</p> 
                       <input type="text" class="form-control" id="whatsappTelephone" placeholder="" value="<%=infoReq!=null?infoReq.getWhatsappTelephone():StringPool.BLANK %>"
                        oninput="formatPhoneNumber(this);"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                          <p class="tab-form-main-heading">Other</p>
                          <input type="text" class="form-control" id="otherContact" placeholder="" value="<%=infoReq!=null?infoReq.getOtherContact():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                          <p class="tab-form-main-heading">Email *</p>
                          <input type="text" class="form-control" id="emailContact" placeholder="" value="<%=infoReq!=null?infoReq.getEmailContact():StringPool.BLANK %>"> 
                          <p class="tab-form-sub-heading fieldAlert hide" id="emailContactValidation" style="color: red;">Enter a valid E-mail Address</p>
                      </div> 
                  </div>
                  <div class="col-md-12"> 
                      <div class="form-group mb-0"> 
                       <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">3.</span>Contact Person</p> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Name</p> 
                       <input type="text" class="form-control" id="contactPerName" placeholder="" value="<%=infoReq!=null?infoReq.getContactPerName():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Position</p> 
                       <input type="text" class="form-control" id="contactPerPosition" placeholder="" value="<%=infoReq!=null?infoReq.getContactPerPosition():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Phone</p> 
                       <input type="text" class="form-control" id="contactPerPhone" placeholder="" value="<%=infoReq!=null?infoReq.getContactPerPhone():StringPool.BLANK %>" 
                       oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Email</p> 
                       <input type="text" class="form-control" id="contactPerEmail" placeholder="" value="<%=infoReq!=null?infoReq.getContactPerEmail():StringPool.BLANK %>"> 
                      </div> 
                  </div>

                  <div class="col-md-12"> 
                      <div class="form-group mb-0"> 
                       <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">5.</span>Alternate Contact</p> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Name</p> 
                       <input type="text" class="form-control" id="altContactPerName" placeholder="" value="<%=infoReq!=null?infoReq.getAltContactPerName():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Position</p> 
                       <input type="text" class="form-control" id="altContactPerPosition" placeholder="" value="<%=infoReq!=null?infoReq.getAltContactPerPosition():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Phone</p> 
                       <input type="text" class="form-control" id="altContactPerPhone" placeholder="" value="<%=infoReq!=null?infoReq.getAltContactPerPhone():StringPool.BLANK %>" 
                       oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"> 
                      </div> 
                  </div>
                  <div class="col-md-6"> 
                      <div class="form-group"> 
                       <p class="tab-form-sub-heading">Email</p> 
                       <input type="text" class="form-control" id="altContactPerEmail" placeholder="" value="<%=infoReq!=null?infoReq.getAltContactPerEmail():StringPool.BLANK %>"> 
                      </div> 
                  </div>
                  <div class="col-md-12">
                      <div class="form-group">
                          <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Number of years Company in Operation</p>
                          <input type="text" class="form-control" id="comOperationYear" value="<%=infoReq!=null?infoReq.getComOperationYear():StringPool.BLANK %>" placeholder="" />
                      </div>
                  </div>
                  <div class="col-md-12">
                      <div class="form-group">
                          <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Product(s)</p>
                          <input type="text" class="form-control" id="products" name="products" value="<%=infoReq!=null?infoReq.getProducts():StringPool.BLANK %>" placeholder="" />
                          <p class="tab-form-sub-heading">Separate values with Enter</p>
                      </div>
                  </div>
                  <div class="col-md-12">
                      <div class="form-group">
                          <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Approximate share(%) of the Jamaica Market</p>
                          <input type="text" class="form-control" id="marketSharePer" value="<%=infoReq!=null?infoReq.getMarketSharePer():StringPool.BLANK %>" placeholder="" 
                          oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/>
                      </div>
                  </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <p class="tab-form-main-heading">Tick the boxes that best describe injury your business has experienced over the past three years.</p>
                            <p class="tab-form-main-heading">
                                To help you assess the potential usefulness to your business of a Trade Remedy measure, if you are able to indicate the factors below that apply to your business, this would be useful.
                            </p>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury1" value="Decline in Sales Volume" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Decline in Sales Volume")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury1">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">10.</span>Decline in Sales Volume</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury2" value="Increase in Sales Volume" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Increase in Sales Volume")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury2">
                                    <p class="tab-form-main-heading mb-0">Increase in Sales Volume</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury3" value="Decline in Production Volume" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Decline in Production Volume")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury3">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">11.</span>Decline in Production Volume</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury4" value="Increase in Production Volume" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Increase in Production Volume")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury4">
                                    <p class="tab-form-main-heading mb-0">Increase in Production Volume</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury5" value="Decline in Capacity Utilization" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Decline in Capacity Utilization")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury5">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">12.</span>Decline in Capacity Utilization</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury6" value="Increase in Capacity Utilization" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Increase in Capacity Utilization")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury6">
                                    <p class="tab-form-main-heading mb-0">Increase in Capacity Utilization</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury7" value="Negative Effect on Inventories" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Negative Effect on Inventories")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury7">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">13.</span>Negative Effect on Inventories</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury8" value="Positive Effect on Inventories" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Positive Effect on Inventories")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury8">
                                    <p class="tab-form-main-heading mb-0">Positive Effect on Inventories</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury9" value="Decline in Number of Employees" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Decline in Number of Employees")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury9">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">14.</span>Decline in Number of Employees</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury10" value="Increase in Number of Employees" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Increase in Number of Employees")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury10">
                                    <p class="tab-form-main-heading mb-0">Increase in Number of Employees</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury11" value="Increase in Unit Price" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Increase in Unit Price")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury11">
                                    <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">15.</span>Increase in Unit Price</p>
                                </label>
                            </div>
                            <div class="checkbox-form-group second-custom-checkbox">
                                <input type="checkbox" id="businessInjury12" value="Decrease in Unit Price" <%=infoReq!=null &&infoReq.getTradeRemedyMeasure().contains("Decrease in Unit Price")?"checked":StringPool.BLANK%>
                                name="businessInjury"> 
                                <label for="businessInjury12">
                                    <p class="tab-form-main-heading mb-0">Decrease in Unit Price</p>
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12"> 
                        <div class="form-group"> 
                            <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.</span>Investments in last five years</p>
                            <input type="text" class="form-control" id="fiveYearsInvestment" placeholder="" value="<%=infoReq!=null?infoReq.getFiveYearsInvestment():StringPool.BLANK %>"
                            oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"/> 
                            <!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
                        </div> 
                    </div>
                    <div class="col-md-6"> 
                        <div class="form-group"> 
                            <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">17.</span>Plan Capacity</p>
                            <input type="text" class="form-control" id="planCapacity" placeholder="" value="<%=infoReq!=null?infoReq.getPlanCapacity():StringPool.BLANK %>"/> 
                        </div> 
                    </div>
                    <div class="col-md-6"> 
                        <div class="form-group"> 
                            <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.</span>Growth Projection</p>
                            <input type="text" class="form-control" id="growthProjection" placeholder="" value="<%=infoReq!=null?infoReq.getGrowthProjection():StringPool.BLANK %>"/> 
                        </div> 
                    </div>
              </div> 
          </div>
      </div>
      <button type="button" id="saveName" onclick="setInformationRequestInfo(false);"
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