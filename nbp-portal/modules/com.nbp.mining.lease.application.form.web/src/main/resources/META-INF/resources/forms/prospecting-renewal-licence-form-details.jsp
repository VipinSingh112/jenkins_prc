<%@ include file="../init.jsp" %>
<portlet:resourceURL var="renewalProspLicenceFormSevenInfoUrl" id="/renewal/licence/form/seven"></portlet:resourceURL>
<portlet:resourceURL var="renewalProspLicDelineationInfoUrl" id="/renewal/licence/delineation/area"></portlet:resourceURL>
<div class="mining-prospecting-renewal-licence-forms hide ">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="mining-lease-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form No. 7 (Regulation 16)</p>
							<p class="tab-form-title-subtitle f2">Application for renewal of Licence (EPL/SEPL)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minister through
								the Commissioner</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of applicant*</p>
								<input type="text" class="form-control"
									id="renewalApplicantName" value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewApplicantName())?renewLicence.getRenewApplicantName():"" %>" placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="renewalApplicantNameValidation" style="color: red;">Enter a
									Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>T.R.N./T.C.C. Number</p>
								<input type="text" class="form-control" id="renewalTrnNumber"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewTrnNum())?renewLicence.getRenewTrnNum():"" %>" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Applicant's licence No. for
									which application to renew is being made</p>
								<input type="text" class="form-control"
									id="renewalApplicantLicenceNo" value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewApplicantLicNum())?renewLicence.getRenewApplicantLicNum():"" %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>State whether renewal is
									sought for the whole of the area or only part of</p>
								<input type="text" class="form-control" id="renewalState"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getStateWhetherRenewIs())?renewLicence.getStateWhetherRenewIs():"" %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>If renewal is sought for
								only a part delineation and approximate area must be given (see
								under) and a sketch plan or the area applied for must be
								attached</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
 												<input type="file" id="approximateRenewalArea"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>approximateRenewalArea">
												<label class="custom-upload" for="approximateRenewalArea">
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
										<span class="attach-detailed-overview"><%=Validator.isNotNull(formRenewAreaDoc)?formRenewAreaDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox" id="proslicenceRenewFeeCheck" value="The appropriate licence fee is forwarded here with" <%=renewLicence!=null &&renewLicence.getRenewFeeCheck().contains("The appropriate licence fee is forwarded here with")?"checked":StringPool.BLANK%> name="proslicenceRenewFeeCheck"> 
									<label for="proslicenceRenewFeeCheck">
										<p class="tab-form-main-heading mb-0">
											<span class="tab-form-highlghtme-link pr-2">6.</span>The appropriate licence fee is forwarded herewith.
										</p>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="addRenewalProspLicenceFormSeven(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="mining-lease-delineation-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Delineation</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									An area of approximately <input type="text" class=""
										id="renApproximatelyArea" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getApproximatelyArea())?delineationArea.getApproximatelyArea():"" %>" placeholder=""> square
									kilometres.
								</p>
								<p class="common-section-small-heading mb-3">
									The <span>location beacon</span> consists of <input type="text"
										class="" id="renewalLocation" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getLocation())?delineationArea.getLocation():"" %>" placeholder="">
									and is situated approximately at the intersection of false
									co-ordinates <input type="text" class=""
										id="renewalCoordinates" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getCoordinates())?delineationArea.getCoordinates():"" %>" placeholder=""> North
									<input type="text" class="" id="renewalNorthSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getNorthSide())?delineationArea.getNorthSide():"" %>"
										placeholder=""> East on sheet <input type="text"
										class="" id="renewalEastSide" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getEastSide())?delineationArea.getEastSide():"" %>" placeholder="">
									of the topographical map of Jamaica.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">The first
									corner is situated approximately at the intersection of the
									false coordinate</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="renewalFirstNorth" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstNorthSide())?delineationArea.getFirstNorthSide():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="renewalFirstEast" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstEastSide())?delineationArea.getFirstEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class=""
										id="renewalFirstLocation" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstLocationGrid())?delineationArea.getFirstLocationGrid():"" %>" placeholder="">
									metres from the location beacon on an approximate grid bearing
									of <input type="text" class="" id="renewalFirstDegrees"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getFirstDegrees())?delineationArea.getFirstDegrees():"" %>" placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">The Second
									corner is situated approximately at the intersection of the
									false co- ordinates</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="renewalSecondNorth" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondNorthSide())?delineationArea.getSecondNorthSide():"" %>"
										placeholder=""> North and <input type="text" class=""
										id="renewalSecondEast" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondEastSide())?delineationArea.getSecondEastSide():"" %>" placeholder=""> East
									approximately <input type="text" class=""
										id="renewalSecondLocation" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondLocationGrid())?delineationArea.getSecondLocationGrid():"" %>" placeholder="">
									metres from the first corner on an approximate grid bearing of
									<input type="text" class="" id="renewalSecondDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getSecondDegrees())?delineationArea.getSecondDegrees():"" %>"
										placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="common-section-small-heading mb-3">The Third
									corner is situated approximately at the intersection of the
									false co-ordinates</p>
								<p class="tab-form-main-heading">
									<input type="text" class="" id="renewalThirdCoordinates"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdCoordinates())?delineationArea.getThirdCoordinates():"" %>" placeholder="">North and <input type="text"
										class="" id="renewalThirdNorth" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdNorthSide())?delineationArea.getThirdNorthSide():"" %>" placeholder="">
									East approximately <input type="text" class=""
										id="renewalThirdEast" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdEastSide())?delineationArea.getThirdEastSide():"" %>" placeholder=""> metres
									from the second corner on an approximate grid bearing of <input
										type="text" class="" id="renewalThirdDegrees" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdDegrees())?delineationArea.getThirdDegrees():"" %>" placeholder="">
									degrees and is <input type="text" class="" id="renewalThirdGridLoc"
										value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridLoc())?delineationArea.getThirdGridLoc():"" %>" placeholder=""> metres to the location beacon
									on an approximate grid bearing of <input type="text" class=""
										id="renewalThirdBearing" value="<%=Validator.isNotNull(delineationArea)&&Validator.isNotNull(delineationArea.getThirdGridL())?delineationArea.getThirdGridL():"" %>" placeholder=""> degrees.
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureRenewalImageHolder">
							<%if(Validator.isNotNull(signRenUrl)){ %>
							<img src="<%=signRenUrl%>"  width="100" height="100"/>
							<%} %>
							</div>					
							<input type="file" id="applicantSignatureRenewalBtn" hidden="" name="<portlet:namespace/>applicantSignatureRenewalBtn">
							<label for="applicantSignatureRenewalBtn" class="choose-sign-btn"> 
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
<!-- <style>
.tab-plus-wizard .tab-form input{
margin-bottom:6px;
}
</style> -->
<script>
function addRenewalProspLicenceFormSeven(isSaveAndContinue){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	renewalApplicantName=$("#renewalApplicantName").val();
	renewalTrnNumber=$("#renewalTrnNumber").val();
	renewalApplicantLicenceNo=$("#renewalApplicantLicenceNo").val();
	renewalState=$("#renewalState").val();
	var proslicenceRenewFeeCheck = new Array();
	$("input:checkbox[name=proslicenceRenewFeeCheck]:checked").each(function(){
		proslicenceRenewFeeCheck.push($(this).val());
	});
	var proslicRenewFeeCheck = proslicenceRenewFeeCheck.toString();
		submitForm= true;
			if(!renewalApplicantName){
			$("#renewalApplicantNameValidation").removeClass("hide");
			$("#renewalApplicantName").focus();
			submitForm= false;
		}else{
			$("#renewalApplicantNameValidation").addClass("hide");
		}	
		if(submitForm){
	$.ajax({
	    type: "POST",
	    url: "${renewalProspLicenceFormSevenInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>renewalApplicantName": renewalApplicantName,
		     "<portlet:namespace/>renewalTrnNumber": renewalTrnNumber,
		     "<portlet:namespace/>renewalApplicantLicenceNo": renewalApplicantLicenceNo,
		     "<portlet:namespace/>renewalState": renewalState,
		     "<portlet:namespace/>proslicRenewFeeCheck": proslicRenewFeeCheck,

		    },
	    success: function (data) {
	    	uploadDocuments('approximateRenewalArea',"RENEWAL DELINEATION AREA", "If renewal is sought for only a part delineation and approximate area must be given (see under) and a sketch plan or the area applied for must be attached");
			$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			if(!isSaveAndContinue){
				applicantInfo();
			}
	    },
	    error: function (data) {},
	  });
	}
}
function addRenewalDelineationAreaInfo(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	renApproximatelyArea=$("#renApproximatelyArea").val();
	renewalLocation=$("#renewalLocation").val();
	renewalCoordinates=$("#renewalCoordinates").val();
	renewalNorthSide=$("#renewalNorthSide").val();
	renewalEastSide=$("#renewalEastSide").val();
	renewalFirstNorth=$("#renewalFirstNorth").val();
	renewalFirstEast=$("#renewalFirstEast").val();
	renewalFirstLocation=$("#renewalFirstLocation").val();
	renewalFirstDegrees=$("#renewalFirstDegrees").val();
	renewalSecondNorth=$("#renewalSecondNorth").val();
	renewalSecondEast=$("#renewalSecondEast").val();
	renewalSecondLocation=$("#renewalSecondLocation").val();
	renewalSecondDegrees=$("#renewalSecondDegrees").val();
	renewalThirdCoordinates=$("#renewalThirdCoordinates").val();
	renewalThirdNorth=$("#renewalThirdNorth").val();
	renewalThirdEast=$("#renewalThirdEast").val();
	renewalThirdDegrees=$("#renewalThirdDegrees").val();
	renewalThirdGridLoc=$("#renewalThirdGridLoc").val();
	renewalThirdBearing=$("#renewalThirdBearing").val();
	$.ajax({
	    type: "POST",
	    url: "${renewalProspLicDelineationInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>renApproximatelyArea": renApproximatelyArea,
		     "<portlet:namespace/>renewalLocation": renewalLocation,
		     "<portlet:namespace/>renewalCoordinates": renewalCoordinates,
		     "<portlet:namespace/>renewalNorthSide": renewalNorthSide,
		     "<portlet:namespace/>renewalEastSide": renewalEastSide,
		     "<portlet:namespace/>renewalFirstNorth": renewalFirstNorth,
		     "<portlet:namespace/>renewalFirstEast": renewalFirstEast,
		     "<portlet:namespace/>renewalFirstLocation": renewalFirstLocation,
		     "<portlet:namespace/>renewalFirstDegrees": renewalFirstDegrees,
		     "<portlet:namespace/>renewalSecondNorth": renewalSecondNorth,
		     "<portlet:namespace/>renewalSecondEast": renewalSecondEast,
		     "<portlet:namespace/>renewalSecondLocation": renewalSecondLocation,
		     "<portlet:namespace/>renewalSecondDegrees": renewalSecondDegrees,
		     "<portlet:namespace/>renewalThirdCoordinates": renewalThirdCoordinates,
		     "<portlet:namespace/>renewalThirdNorth": renewalThirdNorth,
		     "<portlet:namespace/>renewalThirdEast": renewalThirdEast,
		     "<portlet:namespace/>renewalThirdDegrees": renewalThirdDegrees,
		     "<portlet:namespace/>renewalThirdGridLoc": renewalThirdGridLoc,
		     "<portlet:namespace/>renewalThirdBearing": renewalThirdBearing,

		    },
	    success: function (data) {
	    	uploadDocuments('applicantSignatureRenewalBtn',"Renew Signature of Applicant","");
	    },
	    error: function (data) {},
	  });
}

</script>