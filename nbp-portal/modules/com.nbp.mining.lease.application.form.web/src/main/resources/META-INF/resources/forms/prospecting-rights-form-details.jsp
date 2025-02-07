<%@page import="com.nbp.mining.upload.document.commands.MiningApplicationUtil"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="miningProspectingRightsUrl" id="/add/mining/prospecting/rights"></portlet:resourceURL>
<div class="mining-prospecting-rights-forms hide prospectingRightsForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="prospecting-rights-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form No. 1 (Regulation 3)</p>
							<p class="tab-form-title-subtitle f2">Application for Prospecting Rights</p>
						</div>
					</div> 
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Commissioner of Mines</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of applicant *</p>
								<input type="text" class="form-control" id="applicantName"  oninput="miningDetailValidation();" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getNameOfApplicant())?prospectingRights.getNameOfApplicant():"" %>" placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">Enter a Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>T.R.N./T.C.C. Number</p>
								<input type="text" class="form-control" id="trnNumber" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getTrnNum())?prospectingRights.getTrnNum():"" %>" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Nationality of applicant</p>
								<input type="text" class="form-control" id="applicantNationality" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getNationalityOfApplicant())?prospectingRights.getNationalityOfApplicant():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Age of applicant</p>
								<input type="text" class="form-control" id="applicantAge" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getAgeOfApplicant())?prospectingRights.getAgeOfApplicant():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Telephone No.(s)</p>
								<input type="text" class="form-control" id="applicantTelephone" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getTelephoneNum())?prospectingRights.getTelephoneNum():"" %>" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
								<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Email address *</p>
								<input type="text" class="form-control" id="applicantEmail" oninput="miningDetailValidation();" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getEmailAddr())?prospectingRights.getEmailAddr():"" %>" placeholder="info@companyname.jm"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="applicantEmailValidation" style="color: red;">Enter a valid E-mail Address</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Address in Jamaica at which notices, etc., may be served</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="applicantAddress" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getAddressInJamaica())?prospectingRights.getAddressInJamaica():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Whether the applicant intends to prospect on his/her own account, or as a agent of any other person</p>
								<input type="text" class="form-control" id="applicantProspectAccount" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getApplicantProspectAcc())?prospectingRights.getApplicantProspectAcc():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>If he is in the employ of any other person, the Name and Address of such person</p>
								<input type="text" class="form-control" id="otherPersonEmployName" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getOtherPersonName())?prospectingRights.getOtherPersonName():"" %>" placeholder="Name"/>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="otherPersonEmployAddress" placeholder="Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getOtherPersonAddr())?prospectingRights.getOtherPersonAddr():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Whether he/she has previously made an application for a prospecting right or licence, and if so,
								 whether any such application has been refused</p>
								<input type="text" class="form-control" id="applicantProspectingLicence" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getPrevApplication())?prospectingRights.getPrevApplication():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Whether the applicant or his/her employer (if any) has been convicted of an offence of the mining 
								act, or previously held any prospecting rights, licence or mining lease in Jamaica which has been 
								revoked or forfeited</p>
								<input type="text" class="form-control" id="applicantOffenceConvicted" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getOffenceMiningAct())?prospectingRights.getOffenceMiningAct():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span>I am (not) in possession of a valid prospection right</p>
								<input type="text" class="form-control" id="validProspectionRight" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getValidProspectRight())?prospectingRights.getValidProspectRight():"" %>" placeholder=""/>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><b>Or</b></p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">I hereby surrender prospecting right No.</p>
								<input type="text" class="form-control" id="surrenderProspectingRightNo" value="<%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getSurrenderProspectRight())?prospectingRights.getSurrenderProspectRight():"" %>" placeholder=""/>
								<p class="tab-form-sub-heading">(Strike out whichever is inapplicable)</p>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.</span>I attach here to from my principal an undertaking in the prescribed form.</p>
					        <div class="supporting-document-card my-3">
					            <div class="row">
					                <div class="col-md-12">
					                    <div class="supporting-document-card-wrapper">
					                        <div class="left">
					                            <p class="supporting-document-card-upper-heading">Attach File</p>
					                        </div>
					                        <div class="right">
					                            <input type="file" id="principal-attachment" onchange="attachDetailed(this.id)" hidden="" multiple=""
					                                name="<portlet:namespace/>principal-attachment">
					                            <label class="custom-upload" for="principal-attachment"> <span class="mr-2">
					                                    <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
					                                        xmlns="http://www.w3.org/2000/svg">
					                                        <path
					                                            d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
					                                            fill="#047247"></path>
					                                    </svg> </span>Upload </label>
					                        </div>
					                    </div>
					                    <span class="attach-detailed-overview"><%=(Validator.isNotNull(formRightDoc))?formRightDoc:""%></span>
					                    <%-- <%if(miningApplicationId>0){
										List<DocumentMetaData> dlFileEntries =MiningApplicationUtil.getFormsDocumentList(themeDisplay,
												miningLeaseApplicationId, "RIGHTS PRINCIPAL UNDERTAKING");
										int operateCounter = 1;
										if (Validator.isNotNull(dlFileEntries)) {
											for (DocumentMetaData uploadedFile : dlFileEntries) {
												try {
									%>
						
									<div class="row">
										<div class="col-md-12" id="uploadedFormResultOperatingDetails<%=operateCounter%>">
											<%
												if (Validator.isNotNull(uploadedFile.getFileSize())) {
											%>
											<%@ include file="/forms/uploadedFileRender.jsp"%>
											<%
												}
											%>
										</div>
									</div>
									<%
										} catch (Exception e) {
						
												}
											}
										}
									}
									%> --%>
					                </div>
					            </div>
					        </div>
					        <p class="tab-form-sub-heading">(Strike out if inapplicable)</p>
						</div>
						<!-- <div class="col-md-12">
							<p class="tab-form-main-heading">I forward herewith the appropriate fee.</p>
					        <div class="supporting-document-card my-3">
					            <div class="row">
					                <div class="col-md-12">
					                    <div class="supporting-document-card-wrapper">
					                        <div class="left">
					                            <p class="supporting-document-card-upper-heading">Attach File</p>
					                        </div>
					                        <div class="right">
					                            <input type="file" id="fee-attachment" onchange="attachDetailed(this.id)" hidden="" multiple=""
					                                name="">
					                            <label class="custom-upload" for="fee-attachment"> <span class="mr-2">
					                                    <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
					                                        xmlns="http://www.w3.org/2000/svg">
					                                        <path
					                                            d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
					                                            fill="#047247"></path>
					                                    </svg> </span>Upload </label>
					                        </div>
					                    </div>
					                    <span class="attach-detailed-overview"></span>
					                </div>
					            </div>
					        </div>
						</div> -->
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox" id="prosRightFeeCheck"  value="The appropriate licence fee is forwarded here with" <%=prospectingRights!=null &&prospectingRights.getProspectRightsFeeCheck().contains("The appropriate licence fee is forwarded here with")?"checked":StringPool.BLANK%> name="prosRightFeeCheck"> 
									<label for="prosRightFeeCheck">
										<p class="tab-form-main-heading mb-0">
											<span class="tab-form-highlghtme-link pr-2">14.</span>I, <span class="giluio user-name"><%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getNameOfApplicant())?prospectingRights.getNameOfApplicant():"" %></span>, forward here with the appropriate fee.
										</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
								I, <span class="giluio user-name"><%=Validator.isNotNull(prospectingRights)&&Validator.isNotNull(prospectingRights.getNameOfApplicant())?prospectingRights.getNameOfApplicant():"" %></span>, hereby declare the above particulars to be true. 
							</p>
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureImageHolder">
							<%if(Validator.isNotNull(signUrl)){ %>
							<img src="<%=signUrl%>"  width="100" height="100"/>
							<%} %>
							</div>					
							<input type="file" id="applicantSignatureBtn" hidden="" name="<portlet:namespace/>applicantSignatureBtn">
							<label for="applicantSignatureBtn" class="choose-sign-btn"> 
								<span class="mr-2">
									<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
										<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
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
 <script>
	function miningDetailValidation(){
		applicantName = $("#applicantName").val();
		applicantEmail = $("#applicantEmail").val();
		  if (applicantName.trim() !== "" && applicantEmail.trim() !== "") {
			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			 if(applicantEmail.match(mailformat)){ 
				  $("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#applicantEmailValidation").addClass("hide");
				}else{
					$("#miningFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#applicantEmailValidation").removeClass("hide");
					$("#applicantEmailValidation").text("Please enter valid E-mail address");
				}
		  } else {
			  $("#miningFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
	}
</script>
