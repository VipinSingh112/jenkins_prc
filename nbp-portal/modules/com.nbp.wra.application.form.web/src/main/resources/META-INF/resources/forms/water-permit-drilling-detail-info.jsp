<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<div class="water-permit-drilling-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="water-permit-drilling-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form C(Regulation 18(1))</p>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Application No.</p>
										<input type="text" class="form-control mt-3"
											id="permitDrillingApplicationNo" placeholder="Application Number"
											oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
											value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillApplicationNum():StringPool.BLANK %>" />
									</div>
								</div>
							</div>
							<p class="tab-form-title-subtitle f2 mb-2">The Water
								Resources Act</p>
							<p class="tab-form-title-subtitle f2">Application for Consent
								of Authority to Well-Drilling</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1. </span>Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="permitDrillingApplicantName"
									placeholder="Name of Applicant" oninput="waterDetailValidation();" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingApplicantName():StringPool.BLANK %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="permitDrillingApplicantNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="permitDrillingMailingAddParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2. </span>Mailing Address of
									Applicant</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="permitDrillingMailingAddress"
									placeholder="Applicant Address" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddress():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control"
									id="permitDrillingEmailAddress"  value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingEmailAddress():StringPool.BLANK %>" 
									placeholder="info@companyname.jm" oninput="waterDetailValidation();"/> 
									<p class="tab-form-sub-heading fieldAlert hide" id="permitDrillingEmailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>	
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Office Phone</p>
								<input type="text" class="form-control"
									id="permitDrillingOfficePhone" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingOfficePhone():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Mobile Phone</p>
								<input type="text" class="form-control"
									id="permitDrillingMobilePhone" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMobilePhone():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Home Phone</p>
								<input type="text" class="form-control"
									id="permitDrillingHomePhone" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getWellDrillingHomePhone():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<%-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="permitDrillingWorkLocation">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div> --%>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3. </span>Location of proposed work
									or of existing work</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="permitDrillingLocation" placeholder="" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingLocation():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4. </span>Indicate the nature of your
									interest in the land on which well-drilling is to take place
									(i.e. whether you are owner, lessee, tenant, etc.)</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="permitDrillingNature" placeholder="" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingNature():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5. </span>Name of Drilling Contractor</p>
								<input type="text" class="form-control mt-3"
									id="permitDrillingContractorName"
									placeholder="Name of Drilling Contractor" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingContractorName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="permitDrillingContractorAddress">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6. </span>Address of Drilling
									Contractor</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="permitDrillingContractorAdd"
									placeholder="Drilling Contractor Address" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingContractorAdd():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7. </span>Purpose of drilling</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="permitDrillingPurpose" placeholder="" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingPurpose():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<b><span class="tab-form-highlghtme-link pr-2">8. </span>Technical details</b>
								</p>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(i) </span>Estimated depth of
												borehole or well metres</p>
											<input type="text" class="form-control mt-3"
												id="permitDrillingBoreholeDepth" placeholder="" 
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
												value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingBoreholeDepth():StringPool.BLANK %>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(ii) </span>Diameter of borehole or
												well centimetres</p>
											<input type="text" class="form-control mt-3"
												id="permitDrillingDiameterBorehole" placeholder="" 
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
												value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingDiameterBorehole():StringPool.BLANK %>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(iii) </span>Method of drilling</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="permitDrillingMethod" placeholder="" spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMethod():StringPool.BLANK %></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(iv) </span>Method of construction</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="permitDrillingConstMethod" placeholder=""
												spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingConstMethod():StringPool.BLANK %></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(v) </span>In the case of artesian
												supplies, the method proposed for controlling the flow from
												the borehole and for preventing leakage around the borehole
												lining</p>
											<input type="text" class="form-control mt-3"
												id="permitDrillingSupplies" placeholder="" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingSupplies():StringPool.BLANK %>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(vi) </span>Other technical
												information</p>
											<input type="text" class="form-control mt-3"
												id="permitDrillingTechnicalInfo" placeholder="" value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingTechnicalInfo():StringPool.BLANK %>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(vii) </span>Volume of water required
												cubic metres per day</p>
											<input type="text" class="form-control mt-3"
												id="permitDrillingCubic" placeholder="" 
												oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
												value="<%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingCubic():StringPool.BLANK %>" />
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9. </span>Any further matters
												which the Authority should take into account in considering
												the application</p>
											<textarea rows="3" class="form-control" maxlength="255"
												id="permitDrillingAuthority" placeholder=""
												spellcheck="false"><%=permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingAuthority():StringPool.BLANK %></textarea>
										</div>
									</div>
									<div class="col-md-12 mb-3">
										<p class="tab-form-sub-heading">
											<b>NOTE:</b> Completed forms must be accompanied by:
										</p>
										<ul class="list-group tab-form-sub-heading">
											<li class="list-group-item">(1) Two copies of a map on a
												scale of 1:50,000 showing location of proposed well along
												with such other maps, documents and information as the
												Authority may require; and</li>
											<li class="list-group-item">(2) The application fee of
												Ja$15,000.00</li>
										</ul>
									</div>

									<div class="col-md-12">
										<p class="tab-form-main-heading">
											I <span class="giluio permitApplicantName"> </span> hereby
											apply for the consent of the Authority under the Water
											Resources Act for the drilling of a well and hereby declare
											that to the best of my knowledge the above particulars are
											true and correct.
										</p>
									</div>
									<div class="col-md-12">
										<p class="pt-2 common-para">Signature of Applicant</p>
										<div class="signature_texarea mb-2" id="applicantSignaturePermitImgHolder">
										<%if(Validator.isNotNull(permitWellSignUrl)){ %>
											<img src="<%=permitWellSignUrl%>"  width="100" height="100"/>
											<%} %>
										</div>
										<input type="file" id="applicantSignaturePermitBtn" hidden=""
											name="<portlet:namespace/>applicantSignaturePermitBtn">
										<label for="applicantSignaturePermitBtn"
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
											<input type="date" class="form-control"
												id="permitDrillingSignDate" max="9999-12-31" placeholder=""
												value="<%=permitToDrillAWell!=null&&permitToDrillAWell.getPermitDrillingSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(permitToDrillAWell.getPermitDrillingSignDate()):StringPool.BLANK %>">
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
	function waterDetailValidation(){
		permitDrillingApplicantName = $("#permitDrillingApplicantName").val();
		permitDrillingEmailAddress = $("#permitDrillingEmailAddress").val();
		  if (permitDrillingApplicantName.trim() !== "" && permitDrillingEmailAddress.trim() !== "") {
			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			 if(permitDrillingEmailAddress.match(mailformat)){ 
				  $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#permitDrillingEmailAddressValidation").addClass("hide");
				}else{
					$("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#permitDrillingEmailAddressValidation").removeClass("hide");
					$("#permitDrillingEmailAddressValidation").text("Please enter valid E-mail address");
				}
		  } else {
			  $("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
	}
	</script>