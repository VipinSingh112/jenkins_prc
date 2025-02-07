<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="LicSurrenderFormTenInfoUrl" id="/add/form/ten/licence/surrender"></portlet:resourceURL>
<div class="mining-surrender-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep10">
			<div class="tab-form">
				<div class="mining-lease-surrender-details-forms">
					<div class="row">
						<div class="col-md-12">
							<!-- <p class="tab-form-title f2">Surrender</p> -->
							<p class="tab-form-title f2">Form No. 10 (Regulation 20, 30)</p>
							<p class="tab-form-title-subtitle f2">Application for Surrender</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">To the Minster through
								the Commissioner of Mines</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="applicantTelephonesurrender"
									value="<%=Validator.isNotNull(surrenderLicence)&&Validator.isNotNull(surrenderLicence.getTelephoneNumber())?surrenderLicence.getTelephoneNumber():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email address*</p>
								<input type="text" class="form-control"
									id="applicantEmailsurrender" oninput="addProspectLicSurrenderFormTen();" value="<%=Validator.isNotNull(surrenderLicence)&&Validator.isNotNull(surrenderLicence.getEmailAddress())?surrenderLicence.getEmailAddress():"" %>"
									placeholder="info@companyname.jm" />
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantEmailsurrenderValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="datesurrender"
									value="<%=surrenderLicence!=null&&surrenderLicence.getDateSurrender()!=null?new SimpleDateFormat("yyyy-MM-dd").format(surrenderLicence.getDateSurrender()):StringPool.BLANK %>" placeholder="" />
							</div>
						</div>
						<div class="col-md-12 pt-2">
							<p class="tab-form-main-heading mb-0">I forward herewith my Licence/Mining Lease and the appropriate surrender fee.</p>
							<p class="pt-2 common-para">Signature of holder</p>
							<div class="signature_texarea mb-2" id="holderSignaturesurrenderImgHolder">
							<%if(Validator.isNotNull(signHolderUrl)){ %>
							<img src="<%=signHolderUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="holderSignaturesurrenderBtn" hidden=""
								name="<portlet:namespace/>holderSignaturesurrenderBtn">
							<label for="holderSignaturesurrenderBtn"
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
							<p class="tab-form-main-heading mb-0">Consent is given to the surrender.</p>
							<p class="pt-2 common-para">Minister</p>
							<div class="signature_texarea mb-2" id="ministerSignaturesurrenderImgHolder">
							<%if(Validator.isNotNull(signMinisterUrl)){ %>
							<img src="<%=signMinisterUrl%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="ministerSignaturesurrenderBtn" hidden=""
								name="<portlet:namespace/>ministerSignaturesurrenderBtn">
							<label for="ministerSignaturesurrenderBtn"
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
function addProspectLicSurrenderFormTen(){
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	applicantTelephonesurrender=$("#applicantTelephonesurrender").val();
	datesurrender=$("#datesurrender").val();
	var applicantEmailsurrender = $("#applicantEmailsurrender").val() ? $("#applicantEmailsurrender").val().trim() : "";
    if (applicantEmailsurrender !== "" ) {

    	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if (applicantEmailsurrender.match(mailformat)) {
        	$("#miningFormsFieldset #save-continue").css({"opacity": "1", "pointer-events": "auto", "cursor": "pointer"});
        	$("#applicantEmailsurrenderValidation").addClass("hide");
        }else{
        	$("#applicantEmailsurrenderValidation").removeClass("hide");
        	$("#miningFormsFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
        }
    } else {
        $("#miningFormsFieldset #save-continue").css({"opacity": "0.4", "pointer-events": "none", "cursor": "default"});
    }
		
	$.ajax({
	    type: "POST",
	    url: "${LicSurrenderFormTenInfoUrl}",
	    data: {
		     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		     "<portlet:namespace/>applicantTelephonesurrender": applicantTelephonesurrender,
		     "<portlet:namespace/>applicantEmailsurrender": applicantEmailsurrender,
		     "<portlet:namespace/>datesurrender": datesurrender,

		    },
	    success: function (data) {
	    	uploadDocuments('holderSignaturesurrenderBtn',"Surrender Signature of Holder","");
	    	uploadDocuments('ministerSignaturesurrenderBtn',"Surrender Signature of Minister","");
			/* applicantInfo();
				$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"}); */
	    },
	    error: function (data) {},
	  });
	
}
</script>
