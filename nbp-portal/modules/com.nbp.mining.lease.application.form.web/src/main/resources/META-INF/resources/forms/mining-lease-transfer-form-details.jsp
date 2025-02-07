<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="LicTransferFormNineInfoUrl" id="/add/form/nine/licence/transfer"></portlet:resourceURL>
<portlet:resourceURL var="formNineDirectorsDetailInfoUrl" id="/form/nine/director/details"></portlet:resourceURL>
<%
int transferDirectorDetailVal=1;
%>
<div class="mining-transfer-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep9">
			<div class="tab-form">
				<div class="mining-lease-transfer-details-forms">
					<div class="row">
						<div class="col-md-12">
							<!-- <p class="tab-form-title f2">Transfer</p> -->
							<p class="tab-form-title f2">Form No. 9 (Regulation 19, 29).</p>
							<p class="tab-form-title-subtitle f2">Application for
								Transfer.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minister through
								the Commissioner.</p>
							<p class="tab-form-title-subtitle f2">The following are the
								particulars of the person to whom I am applying for permission
								to transfer.</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of Applicant *</p>
								<input type="text" class="form-control"
									id="applicantNametransfer" value="<%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getNameOfApplicant())?transferLicence.getNameOfApplicant():"" %>"
									placeholder="Applicant Name" oninput="transferDetailValidation();"/>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="applicantNametransferValidation" style="color: red;">Enter a
									Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Telephone</p>
								<input type="text" class="form-control" id="Telephonetransfer"
									value="<%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getTelephoneNumber())?transferLicence.getTelephoneNumber():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Email address *</p>
								<input type="text" class="form-control"
									id="applicantEmailtransfer" value="<%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getEmailAddress())?transferLicence.getEmailAddress():"" %>"
									placeholder="info@companyname.jm"oninput="transferDetailValidation();"/>
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantEmailtransferValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>T.R.N./T.C.C. Number</p>
								<input type="text" class="form-control" id="trnNumbertransfer"
									value="<%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getTrnNumber())?transferLicence.getTrnNumber():"" %>" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Nationality of Applicant</p>
								<input type="text" class="form-control"
									id="applicantNationalitytransfer" value="<%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getNationalityOfApplicant())?transferLicence.getNationalityOfApplicant():"" %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Address in Jamaica at which
									notices, etc., may be served</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255"
									id="applicantAddresstransfer" placeholder="Address"
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(transferLicence)&&Validator.isNotNull(transferLicence.getAddressInJamaica())?transferLicence.getAddressInJamaica():"" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<input id="transferDirectorDetailVal" type="hidden" name="transferDirectorDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian"
									id="transferDirectorDetailBox">
									<div class="accordion__header is-active"
										id="transferDirectorDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>7. Director Details</h2>
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
														id="transferCompanyDirectorName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Nationality of
														directors of company</p>
													<input type="text" class="form-control"
														id="transferCompanyDirectorNationality" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Body of persons or
														partnership (if any)</p>
													<input type="text" class="form-control"
														id="transferCompanyDirectorPartnership" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addTransferDirectorDetail"
													onclick="addTransferDirectorDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class=" table-responsive hide addTransferDirectorDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addTransferDirectorDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name</th>
											<th class="sub_heading text-nowrap">Nationality</th>
											<th class="sub_heading text-nowrap">Body of persons or partnership</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
											<%if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
											for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd){ %>
											<tr class="director-detail-row<%=transferDirectorDetailVal%>">
											<td class="sub_heading_content text-nowrap transferCompanyDirectorName<%=transferDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
											<td class="sub_heading_content text-nowrap transferCompanyDirectorNationality<%=transferDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
											<td class="sub_heading_content text-nowrap transferCompanyDirectorPartnership<%=transferDirectorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
											<td> 
												<span> 
													<a href="javascript:void(0)" id="directorDetailEditTab" onclick="transferDirectorDetailEditTab('<%=transferDirectorDetailVal%>');"> 
												        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
												         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <td> 
												<span> 
													<a href="javascript:void(0)" id="transferDirectorDetailDeleteData" onclick="transferDirectorDetailDeleteData('<%=transferDirectorDetailVal%>');"> 
												        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <input type="hidden" id="transferDirectorDetailId<%=transferDirectorDetailVal%>" name="transferDirectorDetailId<%=transferDirectorDetailVal%>" value="<%=directorDetails.getMiningProspectingLicenseAddId()%>">
										</tr>
										<%transferDirectorDetailVal=transferDirectorDetailVal+1;
											}} %>
										
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>A financial statement of the
								position of the applicant is appended hereto.</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="statement-transfer" onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>statement-transfer">
												<label class="custom-upload" for="statement-transfer">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formTransPosDoc))?formTransPosDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>If a copy of the Memorandum
								and Article of Association has not already been lodged with the
								Commissioner a copy must be enclosed herewith.</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="detail-association-transfer"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>detail-association-transfer">
												<label class="custom-upload" for="detail-association-transfer">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formTransAssosDoc))?formTransAssosDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignaturetransferImageHolder">
							<%if(Validator.isNotNull(signTransferUrl)){ %>
							<img src="<%=signTransferUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignaturetransferBtn" hidden=""
								name="<portlet:namespace/>applicantSignaturetransferBtn">
							<label for="applicantSignaturetransferBtn"
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
						<div class="col-md-12 pt-2">
							<p class="tab-form-main-heading mb-0">I desire to acquire the
								interest above referred to and the above particulars are correct.</p>
							<p class="pt-2 common-para">Signature of the person to whom
								application for transfer is made.</p>
							<div class="signature_texarea mb-2" id="applicantSignaturetransferCoImageHolder">
							<%if(Validator.isNotNull(signPersonUrl)){ %>
							<img src="<%=signPersonUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignaturetransferCoBtn" hidden=""
								name="<portlet:namespace/>applicantSignaturetransferCoBtn">
							<label for="applicantSignaturetransferCoBtn"
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
						<div class="col-md-12 pt-2">
							<p class="tab-form-main-heading mb-0">Consent is given to the
								above Transfer.</p>
							<p class="pt-2 common-para">Minister</p>
							<div class="signature_texarea mb-2" id="applicantSignatureImgtransferMinister">
							<%if(Validator.isNotNull(signMiniTransferUrl)){ %>
							<img src="<%=signMiniTransferUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureMiningMinisterBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureMiningMinisterBtn">
							<label for="applicantSignatureMiningMinisterBtn" class="choose-sign-btn">
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
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="datetransfer"
									value="<%=transferLicence!=null&&transferLicence.getDateSurrender()!=null?new SimpleDateFormat("yyyy-MM-dd").format(transferLicence.getDateSurrender()):StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
function addProspectLicenceTransferFormNine(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	applicantNametransfer=$("#applicantNametransfer").val();
	telephonetransfer=$("#Telephonetransfer").val();
	applicantEmailtransfer=$("#applicantEmailtransfer").val();
	trnNumbertransfer=$("#trnNumbertransfer").val();
	applicantNationalitytransfer=$("#applicantNationalitytransfer").val();
	applicantAddresstransfer=$("#applicantAddresstransfer").val();
	datetransfer=$("#datetransfer").val();
	$.ajax({
	    type: "POST",
	    url: "${LicTransferFormNineInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>applicantNametransfer": applicantNametransfer,
		     "<portlet:namespace/>telephonetransfer": telephonetransfer,
		     "<portlet:namespace/>applicantEmailtransfer": applicantEmailtransfer,
		     "<portlet:namespace/>trnNumbertransfer": trnNumbertransfer,
		     "<portlet:namespace/>applicantNationalitytransfer": applicantNationalitytransfer,
		     "<portlet:namespace/>applicantAddresstransfer": applicantAddresstransfer,
		     "<portlet:namespace/>datetransfer": datetransfer,

		    },
	    success: function (data) {
	    	uploadDocuments('statement-transfer',"TRANSFER STATEMENT OF POSITION","A financial statement of the position of the applicant is appended hereto.");
	    	uploadDocuments('detail-association-transfer',"TRANSFER STATEMENT OF ASSOCIATION","If a copy of the Memorandum and Article of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
	    	uploadDocuments('applicantSignaturetransferBtn',"Transfer Signature of Applicant","");
	    	uploadDocuments('applicantSignaturetransferCoBtn',"Transfer Signature of the person application","");
	    	uploadDocuments('applicantSignatureMiningMinisterBtn',"Transfer Signature of Minister","");
	    },
	    error: function (data) {},
	  });
}
function addLicDirectorDetailTransferFormNine(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	transferCompanyDirectorName=$("#transferCompanyDirectorName").val();
	transferCompanyDirectorNationality=$("#transferCompanyDirectorNationality").val();
	transferCompanyDirectorPartnership=$("#transferCompanyDirectorPartnership").val();
	transferDirectorDetailVal=$("#transferDirectorDetailVal").val();
	$.ajax({
	    type: "POST",
	    url: "${formNineDirectorsDetailInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>transferCompanyDirectorNationality": transferCompanyDirectorNationality,
		     "<portlet:namespace/>transferCompanyDirectorName": transferCompanyDirectorName,
		     "<portlet:namespace/>transferCompanyDirectorPartnership": transferCompanyDirectorPartnership,
		     "<portlet:namespace/>count" : transferDirectorDetailVal,

		    },
	    success: function (data) {
	    	var result=data.APP_DATA;
			$("#transferDirectorDetailId"+result["count"]).val(result["transferDirectorDetailId"]);
	    },
	    error: function (data) {},
	  });
}
function transferDetailValidation(){ 
	applicantNametransfer = $("#applicantNametransfer").val();
	applicantEmailtransfer = $("#applicantEmailtransfer").val();
		  if (applicantNametransfer.trim() !== "" && applicantEmailtransfer.trim() !== "") {
			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			 if(applicantEmailtransfer.match(mailformat)){ 
				  $("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#applicantEmailtransferValidation").addClass("hide");
				}else{
					$("#miningFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#applicantEmailtransferValidation").removeClass("hide");
					$("#applicantEmailtransferValidation").text("Please enter valid E-mail address");
				}
		  } else {
			  $("#miningFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
}

</script>