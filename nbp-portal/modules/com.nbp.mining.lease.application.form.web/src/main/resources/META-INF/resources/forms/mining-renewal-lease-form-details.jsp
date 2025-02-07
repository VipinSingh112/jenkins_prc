<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="renewLeaseAppFormFifteenInfoUrl" id="/renewal/lease/form/fifteen"></portlet:resourceURL>
<div class="miningLeaseRenewalForms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep8">
			<div class="tab-form">
				<div class="mining-lease-details-forms">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form No. 15 (Regulation 31)</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minster through
								the Commissioner</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of applicant*</p>
								<input type="text" class="form-control"
									id="renLeaseApplicantName"  oninput="addRenewLeaseAppliFormFifteen();" value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewApplicantName())?renewLicence.getRenewApplicantName():"" %>"
									placeholder="Applicant Name" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="renLeaseApplicantNameValidation" style="color: red;">Enter a
									Name of Applicant</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>T.R.N./T.C.C. Number</p>
								<input type="text" class="form-control" id="renLeaseTrnNumber"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewTrnNum())?renewLicence.getRenewTrnNum():"" %>"" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone"><span class="tab-form-highlghtme-link pr-2">3.</span>Telephone
									No</p>
								<input type="text" class="form-control" id="renewalTelephone"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewTelephone())?renewLicence.getRenewTelephone():"" %>""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="emailAddress"><span class="tab-form-highlghtme-link pr-2">4.</span>Email
									Address*</p>
								<input type="text" class="form-control" id="renewalEmailAddress"  oninput="addRenewLeaseAppliFormFifteen();"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewEmailAddr())?renewLicence.getRenewEmailAddr():"" %>"" placeholder="info@example.jm">
									<p class="tab-form-sub-heading fieldAlert hide" id="renewalEmailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Number of applicant's
									Mining Lease</p>
								<input type="text" class="form-control"
									id="renewalApplicantMining" value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewNumOfApplicantLease())?renewLicence.getRenewNumOfApplicantLease():"" %>"" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading text-nowrap"><span class="tab-form-highlghtme-link pr-2">6.</span>Mineral for which applicant
									desires to mine</p>
								<input type="text" class="form-control" id="renewalDesiresMine"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenApplicantDesireToMine())?renewLicence.getRenApplicantDesireToMine():"" %>"" placeholder="" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Length of term desired</p>
								<input type="text" class="form-control" id="renewalLenght"
									value="<%=Validator.isNotNull(renewLicence)&&Validator.isNotNull(renewLicence.getRenewTermDesired())?renewLicence.getRenewTermDesired():"" %>"" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>If the application is for
								any area less than the area covered by the lease a sketch plan
								as required by the regulations must be attached and the
								delineation with the beacon set out.</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="approximateRenewalLease"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>approximateRenewalLease">
												<label class="custom-upload" for="approximateRenewalLease">
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
										<span class="attach-detailed-overview"><%=Validator.isNotNull(formLeaseRenewAreaDoc)?formLeaseRenewAreaDoc:"" %></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox" id="miningLeaseRenewFeeCheck" value="The appropriate licence fee is forwarded here with" <%=renewLicence!=null &&renewLicence.getRenewFeeCheck().contains("The appropriate licence fee is forwarded here with")?"checked":StringPool.BLANK%> name="miningLeaseRenewFeeCheck"> 
									<label for="miningLeaseRenewFeeCheck">
										<p class="tab-form-main-heading mb-0">
											<span class="tab-form-highlghtme-link pr-2">9.</span>The appropriate fee if forwarded herewith.
										</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="renewalDate"
									value="<%=renewLicence!=null&&renewLicence.getRenewDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(renewLicence.getRenewDate()):StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="applicantSignatureRenewalLeaseImageHolder">
							<%if(Validator.isNotNull(signMiniLeaseUrl)){ %>
							<img src="<%=signMiniLeaseUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="applicantSignatureRenewalLeaseBtn"
								hidden=""
								name="<portlet:namespace/>applicantSignatureRenewalLeaseBtn">
							<label for="applicantSignatureRenewalLeaseBtn"
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
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
function addRenewLeaseAppliFormFifteen(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	renLeaseTrnNumber=$("#renLeaseTrnNumber").val();
	renewalTelephone=$("#renewalTelephone").val();
	renewalEmailAddress=$("#renewalEmailAddress").val();
	renewalApplicantMining=$("#renewalApplicantMining").val();
	renewalDesiresMine=$("#renewalDesiresMine").val();
	renewalLenght=$("#renewalLenght").val();
	renewalDate=$("#renewalDate").val();
	renLeaseApplicantName= $("#renLeaseApplicantName").val();
	renewalEmailAddress= $("#renewalEmailAddress").val();
	var leaseRenewFeeCheck = new Array();
	$("input:checkbox[name=miningLeaseRenewFeeCheck]:checked").each(function(){
		leaseRenewFeeCheck.push($(this).val());
	});
	var miningLeaseRenewFeeCheck = leaseRenewFeeCheck.toString();
			submitForm= true;
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!renewalEmailAddress){
			$("#applicantEmailValidation").removeClass("hide");
			$("#applicantEmailValidation").text("Please Enter Email Address");
			$("#applicantEmail").focus();
			submitForm= false;
		}else if(renewalEmailAddress.match(mailformat)){ 
			$("#renewalEmailAddressValidation").addClass("hide");
		}else{
			$("#renewalEmailAddressValidation").removeClass("hide");
			$("#renewalEmailAddressValidation").text("You have Entered an In-valid email address");
			$("#renewalEmailAddress").focus();
			submitForm= false;
		}
		if(!renLeaseApplicantName){
			$("#renLeaseApplicantNameValidation").removeClass("hide");
			$("#renLeaseApplicantName").focus();
			submitForm= false;
		}else{
			$("#applicantNameValidation").addClass("hide");
		    }
			if(submitForm){
	$.ajax({
	    type: "POST",
	    url: "${renewLeaseAppFormFifteenInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>renLeaseApplicantName": renLeaseApplicantName,
		     "<portlet:namespace/>renLeaseTrnNumber": renLeaseTrnNumber,
		     "<portlet:namespace/>renewalTelephone": renewalTelephone,
		     "<portlet:namespace/>renewalApplicantMining": renewalApplicantMining,
		     "<portlet:namespace/>renewalDesiresMine": renewalDesiresMine,
		     "<portlet:namespace/>renewalEmailAddress": renewalEmailAddress,
		     "<portlet:namespace/>renewalLenght": renewalLenght,
		     "<portlet:namespace/>renewalDate": renewalDate,
		     "<portlet:namespace/>miningLeaseRenewFeeCheck": miningLeaseRenewFeeCheck,

		    },
	    success: function (data) {
	    	uploadDocuments('approximateRenewalLease',"LEASE RENEWAL AREA OF DELINEATION", "If the application is for any area less than the area covered by the lease a sketch plan as required by the regulations must be attached and the delineation with the beacon set out.");
	    	uploadDocuments('applicantSignatureRenewalLeaseBtn',"LEASE Signature of Applicant","");
			applicantInfo();
			$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"}); 
	    },
	    error: function (data) {},
	  });
	}
}
</script>