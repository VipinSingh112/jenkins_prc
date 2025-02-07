<%@ include file="../init.jsp" %>
<div class="mining-transfer-forms hide">
	<section id="miningPreviewStep9" class="final-preview-section">
		<div class="Mining-Lease-Transfer-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 9</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="transferEditTab"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
									   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
								</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of applicant</p>
						<p class="sub_heading_content" id="transferApplicantNamePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No</p>
						<p class="sub_heading_content" id="transferTelephonePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="transferEmailAddressPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">T.R.N./T.C.C. Number</p>
						<p class="sub_heading_content" id="transfertrnNumPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nationality of Applicant</p>
						<p class="sub_heading_content" id="transferNationalityPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address in Jamaica at which
									notices, etc., may be served</p>
						<p class="sub_heading_content" id="transferAddressPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Director Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addTransferDirectorDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Nationality</th>
										<th class="sub_heading text-nowrap">Body of persons or partnership</th>
									</tr>
		<%
		if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
			
		for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd)
		{ %>
		<td class="sub_heading_content text-nowrap transferCompanyDirectorName">
		<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
		<td class="sub_heading_content text-nowrap transferCompanyDirectorNationality">
		<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
		<td class="sub_heading_content text-nowrap transferCompanyDirectorPartnership">
		<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
		<%
		}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading statement-transfer"></p>
						<p><a class="sub_heading_content" id="statement-transfer-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading detail-association-transfer"></p>
						<p><a class="sub_heading_content" id="detail-association-transfer-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImagetransferPre">
						<%if(Validator.isNotNull(mlTransferDoc1Url)){ %>
							<img src="<%=mlTransferDoc1Url%>"  width="100" height="100"/>
							<%} %>	
						
						</div>
				</div> 
				 <div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant for transfer</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImagetransferCoPre">
						<%if(Validator.isNotNull(mlTransferDoc3Url)){ %>
							<img src="<%=mlTransferDoc3Url%>"  width="100" height="100"/>
							<%} %>	
						</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Minister</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImgtransferMinisterPre">
						<%if(Validator.isNotNull(mlTransferDoc2Url)){ %>
							<img src="<%=mlTransferDoc2Url%>"  width="100" height="100"/>
							<%} %>	
						</div>
				</div> 
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="transferdatePre"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
	function previewMiningLeaseTransferDetailsInfo() {
		applicantNametransfer = $("#applicantNametransfer").val();
		Telephonetransfer = $("#Telephonetransfer").val();
		applicantEmailtransfer = $("#applicantEmailtransfer").val();
		trnNumbertransfer = $("#trnNumbertransfer").val();
		applicantNationalitytransfer = $("#applicantNationalitytransfer").val();
		applicantAddresstransfer = $("#applicantAddresstransfer").val();
		
		datetransfer = $("#datetransfer").val();	
		
		$("#transferApplicantNamePre").html(applicantNametransfer);
		$("#transferTelephonePre").html(Telephonetransfer);
		$("#transferEmailAddressPre").html(applicantEmailtransfer);
		$("#transfertrnNumPre").html(trnNumbertransfer);
		$("#transferNationalityPre").html(applicantNationalitytransfer);
		$("#transferAddressPre").html(applicantAddresstransfer);
		
		$("#transferdatePre").html(datetransfer);
	}
</script>