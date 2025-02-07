 <%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
 <div class="tab-pane confidential-ver-forms" role="tabpanel" id="childStep2">
      <div class="tab-form">
          <div class="oath-request-details-forms">
              <div class="row">
                  <div class="col-md-12">
                      <p class="tab-form-title f2">Oath for request for Treatment of information as confidential</p>
                      <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.
                      </p>
                  </div>
              </div>
              <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <p class="tab-form-main-heading">Type of Investigation</p>
                            <input type="text" class="form-control" id="investigationType" value="<%=oathReq!=null?oathReq.getInvestigationType():StringPool.BLANK %>" placeholder="" />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <p class="tab-form-main-heading">Name of Party</p>
                            <input type="text" class="form-control" id="partyName" value="<%=oathReq!=null?oathReq.getPartyName():StringPool.BLANK %>" placeholder="" />
                        </div>
                    </div>
                    <div class="col-md-12"> 
                        <div class="form-group"> 
                            <p class="tab-form-main-heading">Reasons for Request</p>
                            <textarea rows="3" class="mt-3 form-control" maxlength="255" id="requestReason" placeholder="" style="border-radius: 5px; width: 100%"><%=oathReq!=null?oathReq.getRequestReason():StringPool.BLANK %></textarea>
                        </div> 
                    </div>

                    <div class="col-md-12"> 
                        <div class="form-group">
                            <p class="tab-form-main-heading mb-1"><span class="tab-form-highlghtme-link">Executive Director</span></p> 
                            <p class="tab-form-main-heading mb-1"><span class="tab-form-highlghtme-link">Anti Dumping & Subsidies Commission 24 Trafalgar Road
                            </span></p> 
                            <p class="tab-form-main-heading mb-1"><span class="tab-form-highlghtme-link">Kingston 10</span></p>
                            <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link">Dear Executive Director:
                            </span></p>
                            <p class="tab-form-main-heading">Pursuant to Sections 8 and 9 of the Customs Duties (Dumping & Subsidies) Act, 1999, this is a request for confidential treatment of information being submitted to you in investigation <span class="investigation-type giluio"></span>. The nature of the information for which confidential treatment is requested relates to the designations set out in the exhibit summary attached hereto.
                            </p>
                            <p class="tab-form-main-heading">
                                The disclosure of this information would cause substantial harm to <span class="party-name giluio" ></span> because	<span class="request-reason giluio"></span>.
                            </p>
                            <p class="tab-form-main-heading">
                                Moreover, if the material were not granted confidential treatment by the Anti-dumping and Subsidies Commission, 	<span class="party-name giluio"></span> would not voluntarily submit the information.
                            </p>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <p class="tab-form-main-heading">Company Official</p>
                            <input type="text" class="form-control" id="comOfficial" value="<%=oathReq!=null?oathReq.getComOfficial():StringPool.BLANK %>" placeholder="" />
                        </div>
                    </div>
                    <div class="col-md-12">
                        <p class="tab-form-main-heading">
                            I, <span class="company-official giluio"></span>, having been duly sworn on this day of, do hereby certify that information substantially identical to that contained in the attached document is not available to the general public.
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <p class="tab-form-main-heading">
                                I further certify (1) that I have read the attached submission, and (2) that to the best of my knowledge and belief, the statements contained in the enclosed submission are true and accurate.
                            </p>
                            <p class="pt-2 common-para">Submitter's Signature</p>
                            <div class="signature_texarea mb-2" id="submitterSignatureImageHolder">
                            <%if(Validator.isNotNull(formNameDoc)){ %>
							<img src="<%=formNameDoc%>"  width="100" height="100"/>
							<%} %>
                            </div>
                            <input type="file" id="submitterSignatureBtn" hidden="" name="<portlet:namespace/>submitterSignatureBtn">
                            <label for="submitterSignatureBtn" class="choose-sign-btn">
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
                    <div class="col-md-6">
                        <div class="form-group">
                            <p class="tab-form-main-heading">Date</p>
                            <input type="date" class="form-control" id="signatureDate" value="<%=oathReq!=null&&oathReq.getSignatureDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(oathReq.getSignatureDate()):StringPool.BLANK %>" placeholder="" />
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="form-group">
                            <p class="tab-form-main-heading">
                                Sworn and subscribed before me this day of <span class="signature-date"></span>.
                            </p>
                            <p class="pt-2 common-para">Justice of the Peace</p>
                            <div class="signature_texarea mb-2" id="justicePeaceImageHolder">
                            <%if(Validator.isNotNull(oathJusticeDoc)){ %>
							<img src="<%=oathJusticeDoc%>"  width="100" height="100"/>
							<%} %>
                            </div>
                            <input type="file" id="justicePeaceBtn" hidden="" name="<portlet:namespace/>justicePeaceBtn">
                            <label for="justicePeaceBtn" class="choose-sign-btn">
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
      <button type="button" id="saveName" onclick="setOathForRequestInfo(false);"
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