<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<div class="water-resources-renew-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="water-resources-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Renewal of Licence to Abstract
								and Use Water</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name *</p>
								<input type="text" class="form-control mt-3" id="renewName"
									placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewName():StringPool.BLANK %>" oninput="renewLicDetailValidation();"/>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="renewNameValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Contact</p>
								<input type="text" class="form-control" id="renewContact"
									value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewContact():StringPool.BLANK %>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Job Title</p>
								<input type="text" class="form-control" id="renewJobTitle"
									value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewJobTitle():StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									Number</p>
								<input type="text" class="form-control" id="renewTelephoneNum"
									value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewTelephoneNum():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Fax Number</p>
								<input type="text" class="form-control" id="renewFaxNum"
									value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewFaxNum():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="renewParishLocation">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewParishLocation().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewAddress" placeholder="" spellcheck="false"><%=renewAbstractInfo!=null?renewAbstractInfo.getRenewAddress():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading">
								If you wish to reduce your abstraction rate, please indicate the
								new rate. A higher abstraction rate is considered a new
								application.<b>Licences are not transferable</b>
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Source Name</p>
								<input type="text" class="form-control mt-3"
									id="renewSourceName" placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewSourceName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="renewDetailsParishAdd">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewDetailsLocation" placeholder="" spellcheck="false"><%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsLocation():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Abstraction rate (m3/day)</p>
								<input type="text" class="form-control"
									id="renewAbstractionRate" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewAbstractionRate():StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading">
								If you wish to reduce your abstraction rate, please indicate the
								new rate. <b>A higher abstraction rate is considered a new
									application.</b>
							</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Use</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewDetailsUse" placeholder="" spellcheck="false"><%=renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsUse():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Method of abstraction</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewAbstractionMethod" placeholder="" spellcheck="false"><%=renewAbstractInfo!=null?renewAbstractInfo.getRenewAbstractionMethod():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Measuring device attached?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="attachedDevice" <%=renewAbstractInfo!=null &&renewAbstractInfo.getAttachedDevice().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="attachedDevice" <%=renewAbstractInfo!=null &&renewAbstractInfo.getAttachedDevice().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="measuring-device hide">
								<div class="form-group">
									<p class="tab-form-main-heading">State type of device</p>
									<input type="text" class="form-control mt-3"
										id="renewStateDevice" placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewStateDevice():StringPool.BLANK %>">
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Abstraction data submitted?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="abstractionData" <%=renewAbstractInfo!=null &&renewAbstractInfo.getAbstractionData().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="abstractionData" <%=renewAbstractInfo!=null &&renewAbstractInfo.getAbstractionData().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 mb-3">
							<p class="tab-form-sub-heading">
								<b>Important Note:</b> All terms and conditions indicated on the
								existing licence are valid for the renewal.
							</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I hereby apply for renewal of the abovementioned licence for an
								additional five (5) years as of <span
									class="giluio renewApplicantName"> </span> I agree to abide by
								all conditions set out in the original licence.
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name *</p>
								<input type="text" class="form-control mt-3" id="renewSignName"
									placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getRenewSignName():StringPool.BLANK %>" oninput="renewLicDetailValidation();"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control mt-3" id="renewDate"
									placeholder="" value="<%=renewAbstractInfo!=null&&renewAbstractInfo.getRenewDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(renewAbstractInfo.getRenewDate()):StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<div class="signature_texarea mb-2" id="applicantSignatureRenewImgHolder">
							<%if(Validator.isNotNull(abstractRenewSignUrl)){ %>
							<img src="<%=abstractRenewSignUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureRenewBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureRenewBtn"> <label
								for="applicantSignatureRenewBtn" class="choose-sign-btn">
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
			<!-- <button type="button" id="saveName"
				onclick="applicantInfo();addWraRenewDetail();"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
			                        <pathd ="m6.00016 11.17l1.83016=""
							6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
							1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
				</span>
			</button> -->
		</div>
<%-- 		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="licence-Details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Licence Details</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Source Name</p>
								<input type="text" class="form-control mt-3"
									id="renewSourceName" placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="renewDetailsParishAdd">
										<option value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>" disabled="" selected="">Please
											Select</option>
										<option value="Kingston">Kingston</option>
										<option value="St. Andrew">St. Andrew</option>
										<option value="Portland">Portland</option>
										<option value="St. Thomas">St. Thomas</option>
										<option value="St. Catherine">St. Catherine</option>
										<option value="St. Mary">St. Mary</option>
										<option value="St. Ann">St. Ann</option>
										<option value="Manchester">Manchester</option>
										<option value="Clarendon">Clarendon</option>
										<option value="Hanover">Hanover</option>
										<option value="Westmoreland">Westmoreland</option>
										<option value="St. James">St. James</option>
										<option value="Trelawny">Trelawny</option>
										<option value="St. Elizabeth">St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Location</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewDetailsLocation" placeholder="" spellcheck="false"></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Abstraction rate (m3/day)</p>
								<input type="text" class="form-control"
									id="renewAbstractionRate" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading">
								If you wish to reduce your abstraction rate, please indicate the
								new rate. <b>A higher abstraction rate is considered a new
									application.</b>
							</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Use</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewDetailsUse" placeholder="" spellcheck="false"></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Method of abstraction</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="renewAbstractionMethod" placeholder="" spellcheck="false"></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Measuring device attached?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="attachedDevice"
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="attachedDevice"
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="hide" id="measuring-device">
								<div class="form-group">
									<p class="tab-form-main-heading">State type of device</p>
									<input type="text" class="form-control mt-3"
										id="renewStateDevice" placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>">
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Abstraction data submitted?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="abstractionData"
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="abstractionData"
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 mb-3">
							<p class="tab-form-sub-heading">
								<b>Important Note:</b> All terms and conditions indicated on the
								existing licence are valid for the renewal.
							</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I hereby apply for renewal of the abovementioned licence for an
								additional five (5) years as of <span
									class="giluio renewApplicantName"> </span> I agree to abide by
								all conditions set out in the original licence.
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control mt-3" id="renewSignName"
									placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control mt-3" id="renewDate"
									placeholder="" value="<%=renewAbstractInfo!=null?renewAbstractInfo.getClaimantCompanyName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureRenewImgHolder"></div>
							<input type="file" id="applicantSignatureRenewBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureRenewBtn"> <label
								for="applicantSignatureRenewBtn" class="choose-sign-btn">
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
		</div> --%>
	</div>
</div>
<script>
function renewLicDetailValidation(){
	renewName = $("#renewName").val();
	renewSignName = $("#renewSignName").val();
	  if (renewName.trim() !== "" && renewSignName.trim() !== "") {
		  $("#wraFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	  } else {
		  $("#wraFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	  }
}
</script>