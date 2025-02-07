<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<div class="water-well-drilling-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="water-well-drilling-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form E(Regulation 19(1))</p>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Application No.</p>
										<input type="text" class="form-control mt-3"
											id="wellDrillingApplicationNo"
											placeholder="Application Number"
											oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
											value="<%=licToDrillAWell!=null?licToDrillAWell.getWellDrillingApplicationNo():StringPool.BLANK %>" />
									</div>
								</div>
							</div>
							<p class="tab-form-title-subtitle f2 mb-2">The Water
								Resources Act</p>
							<p class="tab-form-title-subtitle f2">Application for
								Well-Driller's Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1. </span>Name of Applicant *</p>
								<input type="text" class="form-control mt-3"
									id="wellDrillingApplicantName" placeholder="Name of Applicant"  oninput="wellDetailValidation();"
									value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingApplicantName():StringPool.BLANK %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="wellDrillingApplicantNameValidation" style="color: red;">Please
									Enter Owner Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="wellDrillingAddressParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="St. Andrew" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingAddressParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2. </span>Address of Applicant</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="wellDrillingApplicantAddress"
									placeholder="Applicant Address" spellcheck="false"><%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingApplicantAddress():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3. </span>Date of Birth</p>
								<input type="date" class="form-control" id="wellDrillingDOBDate"
									max="9999-12-31" placeholder="" value="<%=licToDrillAWell!=null&&licToDrillAWell.getPermitDrillingDOBDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(licToDrillAWell.getPermitDrillingDOBDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4. </span>Educational background</p>
								<input type="text" class="form-control mt-3"
									id="wellDrillingEducational" placeholder="" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingEducational():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5. </span>Indicate specific training
									relevant to well-drilling</p>
								<input type="text" class="form-control mt-3"
									id="wellDrillingSpecificTraining" placeholder="" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingSpecificTraining():StringPool.BLANK %>" />	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6. </span>Indicate specific
									experience in well-drilling</p>
								<input type="text" class="form-control mt-3"
									id="wellDrillingSpecificExperience" placeholder="" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingSpecificExp():StringPool.BLANK %>" />	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7. </span>Are you self-employed?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="selfEmployed" <%=licToDrillAWell!=null &&licToDrillAWell.getPermitDrillingSelfEmployed().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="selfEmployed" <%=licToDrillAWell!=null &&licToDrillAWell.getPermitDrillingSelfEmployed().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="notSelfEmployed hide">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8. </span>If not self-employed</p>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Name of Employer</p>
											<input type="text" class="form-control" id="wellDrillingName"
												value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingName():StringPool.BLANK %>" placeholder="Name of Employer">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">How long employed by
												present Employer?</p>
											<input type="text" class="mt-3 form-control"
												id="wellDrillingPersentEmployer" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingPresentEmployer():StringPool.BLANK %>"
												placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Address of Employer</p>
											<textarea rows="3" class="mt-3 form-control" maxlength="255"
												id="wellDrillingAddress" placeholder="Address of Employer"
												style="border-radius: 5px; width: 100%"><%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingEmployerAddress():StringPool.BLANK %></textarea>
										</div>
									</div>
								</div>
								<!-- <div class="form-group">
									<p class="tab-form-main-heading">self-employed</p>
									<input type="text" class="form-control"
										id="wellDrillingName" value=""
										placeholder="Name of Employer"> 
									<input type="text"
										class="mt-3 form-control" id="wellDrillingPersentEmployer"
										value="" placeholder="How long employed by present Employer">
									<textarea rows="3" class="mt-3 form-control" maxlength="255"
										id="wellDrillingAddress"
										placeholder="Address of Employer"
										style="border-radius: 5px; width: 100%"></textarea>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-0">
									<b><span class="tab-form-highlghtme-link pr-2">9. </span>State names and addresses of two references</b>
								</p>
								<p class="tab-form-sub-heading mt-3">References 1</p>
								<input type="text" class="form-control"
									id="wellDrillingStateFirst" placeholder="State Name" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingFirstRefName():StringPool.BLANK %>"
									oninput="">
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="wellDrillingFirstAddress" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingFirstRefAdd():StringPool.BLANK %></textarea>
								<p class="tab-form-sub-heading mt-3">References 2</p>
								<input type="text" class="form-control"
									id="wellDrillingStateSec" placeholder="State Name" value="<%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingSecondRefName():StringPool.BLANK %>"
									oninput="">
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="wellDrillingAddressSec" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=licToDrillAWell!=null?licToDrillAWell.getPermitDrillingSecondRefAdd():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12 mb-3">
							<p class="tab-form-sub-heading">
								<b>NOTE:</b> Completed forms must be accompanied by:
							</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">(a) Such documents or
									information as the Authority may require; and</li>
								<li class="list-group-item">(b) The relevant fee.</li>
							</ul>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I <span class="giluio wellApplicantName"> </span> hereby apply
								for a well-driller's licence pursuant to the Water Resources Act
								and declare that to the best of my knowledge the above
								particulars are true and correct.
							</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">I further declare that I am
								able to read and to make written reports on any well-drilling
								activity which I might undertake.</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureWellDrillingImgHolder">
							<%if(Validator.isNotNull(wellDrillingSignUrl)){ %>
							<img src="<%=wellDrillingSignUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureWellDrillingBtn"
								hidden=""
								name="<portlet:namespace/>applicantSignatureWellDrillingBtn">
							<label for="applicantSignatureWellDrillingBtn"
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
									id="WellDrillingSignDate" max="9999-12-31" placeholder=""
									value="<%=licToDrillAWell!=null&&licToDrillAWell.getPermitDrillingSignatureDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(licToDrillAWell.getPermitDrillingSignatureDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	function wellDetailValidation(){
		wellDrillingApplicantName = $("#wellDrillingApplicantName").val();
		  if (wellDrillingApplicantName.trim() !== "") {
			 if(wellDrillingApplicantName.match(name)){ 
				  $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#wellDrillingApplicantNameValidation").addClass("hide");
				}else{
					$("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#wellDrillingApplicantNameValidation").removeClass("hide");
				}
		  } else {
			  $("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
	}
	</script>