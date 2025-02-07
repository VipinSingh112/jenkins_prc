<portlet:resourceURL var="miningApplicationGettingDocumentList" id="mining/Application/Getting/Document/List"></portlet:resourceURL>
<portlet:resourceURL var="miningDoucumentsUpload" id="/supporting/Document/Upload"></portlet:resourceURL>
<portlet:resourceURL var="miningDeleteDocumentUrl" id="mining/Delete/Document/Url"></portlet:resourceURL>
<portlet:resourceURL var="miningProspectingRightsUrl" id="prospesctive/form/info"></portlet:resourceURL>
<portlet:resourceURL id="/mining/download/Pdf" var="miningDownloadPDFUrl"></portlet:resourceURL>
<portlet:resourceURL var ="addToDraftMiningLeaseAppUrl" id="/mining/application/draft"></portlet:resourceURL>
<portlet:resourceURL var="miningPendingUrl" id="/mining/pending"></portlet:resourceURL>
<portlet:resourceURL var="miningFeeDetailsUrl" id="/mining/fee/payment"></portlet:resourceURL>
<portlet:resourceURL var="renewalLicenceUrl" id="/renewal/license/process"></portlet:resourceURL>
<portlet:resourceURL var="secondRenewalLicenseURL" id="second/Renewal/License"></portlet:resourceURL>
<portlet:resourceURL var="thirdRenewalLicenseURL" id="third/Renewal/License"></portlet:resourceURL>
<portlet:resourceURL var="checkLicenceNumberUrl" id="check/licence/number/url"></portlet:resourceURL>
<portlet:resourceURL var="checkLicenceNumberMiningLeaseUrl" id="check/Licence/Number/Mining/Lease/Url"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application to Obtain a</p>
							<p class="common-banner-title f1 mb-0">Prospecting Licence/Mining Lease</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support"
								class="common-banner-transparent-link f2 d-inline-block"><liferay-ui:message
									key="application-form-help" /> <span class="ml-2"> <svg
										xmlns="http://www.w3.org/2000/svg" width="20" height="20"
										viewBox="0 0 20 20" fill="none">
										<path
											d="M10 0C4.48 0 0 4.48 0 10C0 15.52 4.48 20 10 20C15.52 20 20 15.52 20 10C20 4.48 15.52 0 10 0ZM17.46 7.12L14.68 8.27C14.17 6.91 13.1 5.83 11.73 5.33L12.88 2.55C14.98 3.35 16.65 5.02 17.46 7.12ZM10 13C8.34 13 7 11.66 7 10C7 8.34 8.34 7 10 7C11.66 7 13 8.34 13 10C13 11.66 11.66 13 10 13ZM7.13 2.54L8.3 5.32C6.92 5.82 5.83 6.91 5.32 8.29L2.54 7.13C3.35 5.02 5.02 3.35 7.13 2.54ZM2.54 12.87L5.32 11.72C5.83 13.1 6.91 14.18 8.29 14.68L7.12 17.46C5.02 16.65 3.35 14.98 2.54 12.87ZM12.88 17.46L11.73 14.68C13.1 14.17 14.18 13.09 14.68 11.71L17.46 12.88C16.65 14.98 14.98 16.65 12.88 17.46Z"
											fill="#FAD47F" />
									</svg>
							</span> </a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="erros warning success">
		<div id="formError"></div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<div class="form-wizard">
					<form action="" method="post" role="form" enctype="multipart/form-data">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select</p>
									<p class="application-form-lower-heading">TYPE OF TRANSACTION</p> <span></span>
								</li>
								<li class="form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING DOCUMENTS</p> <span></span>
								</li>
								<li class="rm fee-payment fp">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES PAYMENT</p> <span></span>
								</li>
							    <li style="display:none" class="last-step">
			                       <span></span>
			                    </li>
							</ul>
							<input type="hidden" id="miningLeaseApplicationId" name="miningLeaseApplicationId" value=""> 
							<input type="hidden" id="miningLeaseCurrentStage" name="miningLeaseCurrentStage">
							<input type="hidden" id="permitNumber" name="permitNumber">
							<input type="hidden" id="checkPdfDownloadWithoutDocument" name="checkPdfDownloadWithoutDocument" value="true">
							<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=miningApplicationId%>">
						</div>
						<%@ include file="/type-of-applicantion/mining-applicantion-type.jsp"%>
						<%@ include file="/type-of-transaction/mining-transaction-type.jsp"%>
						<%@ include file="/forms/form-tabs.jsp"%>
						<%@ include file="/supporting-documents/mining-documents.jsp"%>
						<%@ include file="/mining-fee-payment.jsp"%>
             			<%@ include file="/preview/final-preview-tabs.jsp"%>
             			<%@ include file="/mining-lease-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var filledDocument = "";
var numberOfDocument = "";
/* Application Type Active Class */
$("#miningApplicatonType .wizard-card").click(function(){
	$("#miningApplicatonType .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#miningApplicantionType").val($(this).find(".wizard-title span").html());
	var miningApplicantionType = $("#miningApplicantionType").val();
	$("#prospectingRightsRenewSection").addClass("hide");
	$("#prospectingRightsTransactionTypeBox .wizard-card").removeClass("active");
	
	$("#prospectingRightsTransactionTypeBox, #prospectingRightsRenewSection").addClass("hide");
	$(".prospectingRightsForm").addClass("hide");
	
	$("#prospectingLicenceSection, #prospectingLicenceTransactionTypeBox, #prospectingLicenceRenewAreaSection, #prospectingLicenceProspectingTypeBox, #prospectingLicenceRenewSection").addClass("hide");
	$(".mining-prospecting-licence-forms, .mining-prospecting-renewal-licence-forms, .miningLeaseForm, .miningLeaseRenewalForms, .mining-transfer-forms, .mining-surrender-forms").addClass("hide");
	
	$("#miningLicenceTransactionTypeBox, #miningLicenceRenewSection, #miningLicenceRenewAreaSection, #miningLeaseTypeBox, #mineralsType").addClass("hide");
	
	$("#miningLicenceSection").addClass("hide");
	if(miningApplicantionType == "Prospecting Rights"){
		$("#documentList").addClass("hide");
		$("#prospectingRightsTransactionTypeBox").removeClass("hide");		
		/* Update Payment Category */
		$("#rightFeeIcon").removeClass("hide");
		$("#licenceFeeIcon, #leaseFeeIcon").addClass("hide");
		$("#payment_category").html("Prospecting Rights");
		$(".prospectingRightsForm").removeClass("hide");
		$("#supportingDocStep").html("2");
	}else if(miningApplicantionType == "Prospecting Licence"){
		
		$("#prospectingLicenceSection, #prospectingLicenceTransactionTypeBox").removeClass("hide");
		/* Update Payment Category */
		$("#payment_category").html("Prospecting Licence");	
		$("#licenceFeeIcon").removeClass("hide");
		$("#rightFeeIcon, #leaseFeeIcon").addClass("hide");
		/* $(".supporting-doc-preview").removeClass("hide"); */
		$(".mineral-type").html("Prospected");
	}else if(miningApplicantionType == "Mining Lease"){
		$("#miningLicenceSection").removeClass("hide");
		$("#miningLicenceTransactionTypeBox").removeClass("hide");
		$(".miningLeaseForm  #miningLeaseTab").removeClass("hide");
		$(".prospectingMiningForm").removeClass("hide");
		$(".miningLeaseTab").removeClass("hide");

		/* Update Payment Category */
		$("#payment_category").html("Mining Lease");
		$("#leaseFeeIcon").removeClass("hide");
		$("#rightFeeIcon, #licenceFeeIcon").addClass("hide");
		/* $(".supporting-doc-preview").removeClass("hide"); */
		$(".mineral-type").html("Mined");
	}
	$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});

$("#prospectingRightsTransactionTypeBox .wizard-card").click(function(){
	$("#prospectingRightsTransactionTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#prospectingRightsTransactionTypeVal").val($(this).find(".wizard-title").html());
	var prospectingRightsTransactionType = $("#prospectingRightsTransactionTypeVal").val();
	if(prospectingRightsTransactionType === "Renewal" || prospectingRightsTransactionType === "Surrender"){
		$("#prospectingRightsRenewSection").removeClass("hide");
		$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	}else{
		$("#prospectingRightsRenewSection").addClass("hide");
		$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	}
	/* Append Fee */
	if(prospectingRightsTransactionType === "Renewal" || prospectingRightsTransactionType === "New"){
		$(".miningFacilitiesFee").html("5,000.00");
	}else{
		$(".miningFacilitiesFee").html("00.00");
	}
	if(prospectingRightsTransactionType == "New"){
		$("#payment_sub_category").html("New");
	}
	if(prospectingRightsTransactionType == "Renewal"){
		$("#payment_sub_category").html("Renewal");
	}
	if(prospectingRightsTransactionType == "Surrender"){
		$("#payment_sub_category").html("Surrender");
	}
	
});

$("#prospectingLicenceTransactionTypeBox .wizard-card").click(function(){
	$("#prospectingLicenceTransactionTypeBox .wizard-card").removeClass("active");
	$("#prospectingLicenceTransactionTypeBox .wizard-card-title").removeClass("text-white");
	$(this).addClass("active");
	$(this).find(".wizard-card-title").addClass("text-white");
	$("#prospectingLicenceTransactionTypeVal").val($(this).find(".wizard-card-title").html());
	var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
	$("#prospectingLicenceProspectingTypeBox, #totalApproxAreaDelination").addClass("hide");
	$("#mineralsType").addClass("hide");
	$("#mineralsType .wizard-card").removeClass("active");
	$("input[name='areaDelination']").prop("checked", false);
	$("#payment_sub_category").html(prospectingLicenceTransactionType);
	
	if(prospectingLicenceTransactionType === "New"){
		$("#prospectingLicenceRenewSection").addClass("hide");
		$("#prospectingLicenceRenewAreaSection").removeClass("hide");	
		$("#prospectingLicenceProspectingTypeBox .wizard-card").removeClass("active");
	}else{
		$("#prospectingLicenceRenewSection").removeClass("hide");
		$("#prospectingLicenceRenewAreaSection").addClass("hide");
	}
	$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	/* Licence Form Jquery */
	if(prospectingLicenceTransactionType === "New" || prospectingLicenceTransactionType === "Additional Minerals"){
		$(".mining-prospecting-licence-forms").removeClass("hide");
		$(".mining-prospecting-renewal-licence-forms").addClass("hide");
		$(".mining-transfer-forms").addClass("hide");
		$(".mining-surrender-forms").addClass("hide");
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
	}
	if(prospectingLicenceTransactionType === "Renewal &amp; Amendment"){
		$(".mining-prospecting-licence-forms").addClass("hide");
		$(".mining-prospecting-renewal-licence-forms").removeClass("hide");
		$(".mining-transfer-forms").addClass("hide");
		$(".mining-surrender-forms").addClass("hide");
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
	}
	if(prospectingLicenceTransactionType === "Transfer"){
		$(".mining-prospecting-licence-forms").addClass("hide");
		$(".mining-prospecting-renewal-licence-forms").addClass("hide");
		$(".mining-transfer-forms").removeClass("hide");
		$(".mining-surrender-forms").addClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	if(prospectingLicenceTransactionType === "Surrender"){
		$(".mining-prospecting-licence-forms").addClass("hide");
		$(".mining-prospecting-renewal-licence-forms").addClass("hide");
		$(".mining-transfer-forms").addClass("hide");
		$(".mining-surrender-forms").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	if(prospectingLicenceTransactionType === "Additional Minerals"){
		$(".miningFacilitiesFee").html("2000.00");
	}
});
$("#prospectingLicenceProspectingTypeBox .wizard-card").click(function(){
	$("#prospectingLicenceProspectingTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#prospectingLicenceProspectingTypeVal").val($(this).find(".wizard-title").html());
	$("#mineralsType .wizard-card").removeClass("active");
    $("#mineralsType").removeClass("hide");
    $("#otherMineralBox").addClass("hide");
	$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
});

//mining lease type of transaction 
$("#miningLicenceTransactionTypeBox .wizard-card").click(function(){
	$("#miningLicenceTransactionTypeBox .wizard-card").removeClass("active");
	$("#miningLicenceTransactionTypeBox .wizard-card-title").removeClass("text-white");
	$(this).addClass("active");
	$(this).find(".wizard-card-title").addClass("text-white");
	$("#miningLicenceTransactionTypeVal").val($(this).find(".wizard-card-title").html());
	$("#miningLicenceRenewAreaSection").removeClass("hide");
	$("#miningLeaseTypeBox, #mineralsType, #totalApproxLicenceAreaDelineation").addClass("hide");
	$(".mining-transfer-forms, .mining-surrender-forms").removeClass("hide");
	$("input[name='leaseAreaDelination']").prop("checked",false);
	var typeofTransaction = $("#miningLicenceTransactionTypeVal").val();
	$("#payment_sub_category").html(typeofTransaction);
	if(typeofTransaction=="New"||typeofTransaction=="Temporary Permission"){
		$("#applicantLicenceTab").removeClass("hide");
		$(".miningLeaseForm").removeClass("hide");
		$(".mining-lease-forms").removeClass("hide");
		$(".mining-lease-forms-pre").removeClass("hide");
		$(".miningLeaseFormPre").removeClass("hide");
		
		$(".miningLeaseRenewalForms").addClass("hide");
		$("#supportingDocStep").html("3");
		$("#feePaymentStep").html("4");
	}
	if(typeofTransaction=="Renewal"){
		$("#applicantLicenceTab").addClass("hide");
		$(".miningLeaseForm").addClass("hide");
		$(".mining-lease-forms").addClass("hide");
		$(".mining-lease-forms-pre").addClass("hide");
		$(".miningLeaseFormPre").addClass("hide");
		
		$(".miningLeaseRenewalForms").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	} 
	
	if(typeofTransaction === "Transfer"){
		$("#applicantLicenceTab").addClass("hide");
		$(".miningLeaseForm").addClass("hide");
		$(".mining-lease-forms").addClass("hide");
		$(".mining-lease-forms-pre").addClass("hide");
		$(".miningLeaseFormPre").addClass("hide");
		
		$(".miningLeaseRenewalForms").addClass("hide");
		$(".mining-surrender-forms").addClass("hide");

		$(".mining-transfer-forms").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	if(typeofTransaction === "Surrender"){
		$("#applicantLicenceTab").addClass("hide");
		$(".miningLeaseForm").addClass("hide");
		$(".mining-lease-forms").addClass("hide");
		$(".mining-lease-forms-pre").addClass("hide");
		$(".miningLeaseFormPre").addClass("hide");
		
		$(".miningLeaseRenewalForms").addClass("hide");
		$(".mining-transfer-forms").addClass("hide");
		
		$(".mining-surrender-forms").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	if(typeofTransaction === "Amendment"){
		$("#applicantLicenceTab").addClass("hide");
		$(".miningLeaseForm").addClass("hide");
		$(".mining-lease-forms").addClass("hide");
		$(".mining-lease-forms-pre").addClass("hide");
		$(".miningLeaseFormPre").addClass("hide");
		
		$(".miningLeaseRenewalForms").removeClass("hide");
		$("#supportingDocStep").html("2");
		$("#feePaymentStep").html("3");
	}
	
	if(typeofTransaction=="New"){
		$("#miningLicenceRenewSection").addClass("hide");
		$("#miningLicenceRenewAreaSection").removeClass("hide");
	}else{
		$("#miningLicenceRenewSection").removeClass("hide");
		$("#miningLicenceRenewAreaSection").addClass("hide");
	}
});

$("input[name='leaseAreaDelination']").change(function() {
	$("#miningLeaseTypeBox .wizard-card").removeClass("active");
    $("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $("#otherMineralBox").addClass("hide");
    $("#mineralsType .wizard-card").removeClass("active");
    $("#totalApproxLicenceAreaDelineation").removeClass("hide");
    $("#miningLeaseTypeBox, #miningLeaseMLBtn, #miningLeaseSpecialBtn, #mineralsType").addClass("hide");
    $("#miningAreaDelinationTotalApprox").val("");
});
$("#miningLicenceRenewBtn").click(function(){
	debugger;
	miningApplicantionType = $("#miningApplicantionType").val();
	if(miningApplicantionType == "Mining Lease"){
		miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
		if(miningLicenceTransactionType == "Temporary Permission"){
			 $("#miningLicenceRenewAreaSection").addClass("hide");
			 $("#miningLeaseTypeBox, #mineralsType").addClass("hide");
			 thirdRenewalLicense();
		}
	else{
		$("#miningLicenceRenewAreaSection").removeClass("hide");
		 $("input[name='leaseAreaDelination']").prop("checked",false);
		 $("#miningLeaseTypeBox, #mineralsType").addClass("hide");
	}
}
	 
});
$("#miningLeaseTypeBox .wizard-card").click(function(){
	$(this).addClass("active");
	$(this).find(".wizard-card-title").addClass("text-white");
	$("#mineralsType").removeClass("hide");
	$("#mineralsType .wizard-card").removeClass("active");
	$("#miningLeaseTypeVal").val($(this).find(".wizard-title").html());
});


$("#mineralsType .wizard-card").click(function(){
	miningApplicantionType = $("#miningApplicantionType").val();
	if(miningApplicantionType == "Prospecting Licence"){
		prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
		if(prospectingLicenceTransactionType == "New" || prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
			$("#mineralsType .wizard-card").removeClass("active");
			$(this).addClass("active");
			$("#miningMineralsTypeVal").val($(this).find(".wizard-title").html());
			miningMineralsTypeVal = $("#miningMineralsTypeVal").val();
			if(miningMineralsTypeVal == "Other"){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
		}else if(prospectingLicenceTransactionType == "Additional Minerals"){
			$(this).toggleClass("active");
			selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			if(selectedMineralsType.includes("Other")){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
		}else{
			$(this).toggleClass("active");
			selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			if(selectedMineralsType.includes("Other")){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
		}
	}
	if(miningApplicantionType == "Mining Lease"){
		miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
	    console.log("miningLicenceTransactionType is "+miningLicenceTransactionType);
	    if(miningLicenceTransactionType == "New" || miningLicenceTransactionType == "Renewal"){
	   		$("#mineralsType .wizard-card").removeClass("active");
	   		$(this).addClass("active");
	   		$("#miningMineralsTypeVal").val($(this).find(".wizard-title").html());
	   		miningMineralsTypeVal = $("#miningMineralsTypeVal").val();
			if(miningMineralsTypeVal == "Other"){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
	   	}else if(miningLicenceTransactionType == "Temporary Permission"){
	   		$(this).toggleClass("active");
	   		console.log("indside temporary");
	   		selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			if(selectedMineralsType.includes("Other")){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
	   	}else{
	   		$(this).toggleClass("active");
	   		selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			if(selectedMineralsType.includes("Other")){
				$("#otherMineralBox").removeClass("hide");
			}else{
				$("#otherMineralBox").addClass("hide");
			}
	   	}
	}
    $("#miningTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
});

/* NEW JQUERY */
$("#prospectingLicenceRenewBtn").click(function () {
    debugger;
    let miningType = $("#miningApplicantionType").val();
    let prospectingLicenceTransactionTypeVal = $("#prospectingLicenceTransactionTypeVal").val();

    if ((miningType === "Prospecting Licence") && (prospectingLicenceTransactionTypeVal === "Additional Minerals")) {
        $("#miningLicenceRenewAreaSection").addClass("hide");
        $("#totalApproxLicenceAreaDelineation").addClass("hide");
        $("#prospectingLicenceProspectingTypeBox, #mineralsType").addClass("hide");
        secondRenewalLicense();
    } else {
        $("#prospectingLicenceRenewAreaSection").removeClass("hide");
        $("input[name='areaDelination']").prop("checked", false);
        $("#prospectingLicenceProspectingTypeBox, #mineralsType").addClass("hide");
    }
});
 
 $("input[name='areaDelination']").change(function() {
	$("#prospectingLicenceProspectingTypeBox .wizard-card").removeClass("active");
    $("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    $("#otherMineralBox").addClass("hide");
    $("#mineralsType .wizard-card").removeClass("active");
    
    $("#totalApproxAreaDelination").removeClass("hide");
	$("#areaDelinationTotalApproxValidation").removeClass("hide");
    
    $("#areaDelinationTotalApprox").val("");
    $("#prospectingLicenceProspectingTypeBox, #prospectingLicenceExclusiveBtn, #prospectingLicenceSpecialBtn, #mineralsType").addClass("hide");
});
 
 function totalApproxValidation(){
 	 miningApplicantion = $("#miningApplicantionType").val();
 	 $("#mineralsType .wizard-card, #prospectingLicenceProspectingTypeBox .wizard-card, #miningLeaseTypeBox .wizard-card").removeClass("active");
	 $("#miningLeaseTypeBox .wizard-card").removeClass("active");
	 $("#miningLeaseTypeBox .wizard-card").removeClass("active");
	 $("#mineralsType .wizard-card").removeClass("active");
 	if(miningApplicantion == "Prospecting Licence"){
 		areaDelinationTotalApprox = $("#areaDelinationTotalApprox").val();
 		 if (areaDelinationTotalApprox.trim() !== ""){
			$("#areaDelinationTotalApproxValidation").addClass("hide");
 			areaDelination = $("input[name='areaDelination']:checked").val();
 			if(areaDelination == "An Area Approximately  18 KM2 or less"){
 				  $("#prospectingLicenceProspectingTypeBox").removeClass("hide");
 			      $("#prospectingLicenceExclusiveBtn").removeClass("hide");
 			   }else if(areaDelination == "An Area Greater than 18 KM2"){
 				   $("#prospectingLicenceProspectingTypeBox").removeClass("hide");
 				   $("#prospectingLicenceSpecialBtn").removeClass("hide");
 			   }/* else if(areaDelination == "Total Approximate Area KM2"){
 				   $("#mineralsType").removeClass("hide");
 			   } */
 		 }else{
			$("#areaDelinationTotalApproxValidation").removeClass("hide");
 			$("#prospectingLicenceProspectingTypeBox, #prospectingLicenceExclusiveBtn, #prospectingLicenceSpecialBtn, #mineralsType").addClass("hide"); 
 			$("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
 		 }
 	}
	if(miningApplicantion == "Mining Lease"){
		miningAreaDelinationTotalApprox = $("#miningAreaDelinationTotalApprox").val();
		 if (miningAreaDelinationTotalApprox.trim() !== ""){
			$("#miningAreaDelinationTotalApproxValidation").addClass("hide");
			 leaseAreaDelination = $("input[name='leaseAreaDelination']:checked").val();
			 if(leaseAreaDelination == "An Area Approximately  18 KM2 or less"){
				  $("#miningLeaseTypeBox").removeClass("hide");
			      $("#miningLeaseMLBtn").removeClass("hide");
			   }else if(leaseAreaDelination == "An Area Greater than 18 KM2"){
				   $("#miningLeaseTypeBox").removeClass("hide");
				   $("#miningLeaseSpecialBtn").removeClass("hide");
			   }/* else if(leaseAreaDelination == "Total Approximate Area KM2"){
				   $("#mineralsType").removeClass("hide");
			   } */
		 }else{
			 $("#miningAreaDelinationTotalApproxValidation").removeClass("hide");
			 $("#miningLeaseTypeBox, #miningLeaseMLBtn, #miningLeaseSpecialBtn, #mineralsType").addClass("hide");
			 $("#miningTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			 
		 }
	}
}
var docRenderCount = 1;
 
var prospectingLicenceNewCount = 1;
var prospectingLicenceRenewCount = 1;
var prospectingLicenceAdditionalCount = 1;
var prospectingLicenceTransferCount = 1;
var prospectingLicenceSurrenderCount = 1;

var prospectingLicenceNewDocCount = 1;
var prospectingLicenceRenewDocCount = 1;
var prospectingLicenceAdditionalDocCount = 1;
var prospectingLicenceTransferDocCount = 1;

var miningLeaseNewCount = 1;
var miningLeaseRenewCount = 1;
var miningLeaseTransferCount = 1;
var miningLeaseSurrenderCount = 1;

var miningLeaseNewDocCount = 1;
var miningLeaseRenewDocCount = 1;
var miningLeaseTransferDocCount = 1;
var miningLeaseSurrenderDocCount = 1;

var nextWizardStep = true;
    jQuery(document).ready(function () {
        jQuery('.wizard-next-btn').click(function (){
        var parentFieldset = jQuery(this).parents('.wizard-fieldset');
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
        var next = jQuery(this);
        var currentFieldSet = $(".wizard-fieldset.show").attr("id");
        
        /* Scroll Page to top */
        scrollToPageTop();
        
        if(currentFieldSet == "miningApplicantionTypeFieldset"){
        	$("#miningLicenceTransactionTypeBox .wizard-card").removeClass("active");
        	$("#miningLicenceTransactionTypeBox .wizard-card-title").removeClass("text-white");
        	
        	$("#prospectingLicenceTransactionTypeBox .wizard-card").removeClass("active");
        	$("#prospectingLicenceTransactionTypeBox .wizard-card-title").removeClass("text-white");

			//pendingMiningApplication();
		}
		if(currentFieldSet == "miningTransactionTypeFieldset"){
			pendingMiningApplication(); 
			
			activeSelectForm();
			$("#miningFormsFieldset #save-continue").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			
			/* Fee Amount */
			miningApplicantionType = $("#miningApplicantionType").val();
			if(miningApplicantionType == "Prospecting Rights"){
				applicantName = $("#applicantName").val();
				applicantEmail = $("#applicantEmail").val(); 
				if(applicantName && applicantEmail){
					$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
			}
			if(miningApplicantionType == "Prospecting Licence"){
				applicantNameLicence = $("#applicantNameLicence").val();
				applicantEmailLicence = $("#applicantEmailLicence").val();
				if(applicantNameLicence && applicantEmailLicence){
					$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
				prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
				prospectingLicenceProspectingType = $("#prospectingLicenceProspectingTypeVal").val();
				if(prospectingLicenceTransactionType == "New"){

					if(prospectingLicenceProspectingType == "EPL-Exclusive Prospecting Licence"){
						$(".miningFacilitiesFee").html("10,000.00");
					}
					if(prospectingLicenceProspectingType == "SEPL-Special Exclusive Prospecting Licence"){
						km2Value = $("#areaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 600; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
					/* Getting doc list */
					if(prospectingLicenceNewDocCount == 1){
						gettingDocumentList();
					}
					prospectingLicenceNewDocCount++;
					
				}
			   if(prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
					if(prospectingLicenceProspectingType == "EPL-Exclusive Prospecting Licence"){
						$(".miningFacilitiesFee").html("5,000.00");
					}
					if(prospectingLicenceProspectingType == "SEPL-Special Exclusive Prospecting Licence"){
						km2Value = $("#areaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 400; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
					renewalApplicantName = $("#renewalApplicantName").val();
					if(renewalApplicantName){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
					/* Getting doc list */
					if(prospectingLicenceRenewDocCount == 1){
						gettingDocumentList();
					}
					prospectingLicenceRenewDocCount++;
					
				}else if(prospectingLicenceTransactionType == "Additional Minerals"){
					selectedMineralsType = [];
					$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
					    selectedMineralsType.push($(this).html());
					});
					var totalMinerals = selectedMineralsType.length;
				    var fee = 0;

				    if (totalMinerals == 1) {
				        fee = 2000.00;
				    } else if (totalMinerals > 1) {
				        fee = 2000.00 + (totalMinerals - 1) * 1000.00;
				    }
				    $(".miningFacilitiesFee").html(fee.toFixed(2));	
						applicantNameLicence = $("#applicantNameLicence").val();
					applicantEmailLicence = $("#applicantEmailLicence").val();
					if(applicantNameLicence && applicantEmailLicence){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}			
					/* Getting doc list */
					if(prospectingLicenceAdditionalDocCount == 1){
						gettingDocumentList();
					}
					prospectingLicenceAdditionalDocCount++;
					
				}else if(prospectingLicenceTransactionType == "Transfer"){
					$(".miningFacilitiesFee").html("1000.00");
					applicantNametransfer = $("#applicantNametransfer").val();
					applicantEmailtransfer = $("#applicantEmailtransfer").val();
					if(applicantNametransfer && applicantEmailtransfer){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
					/* Getting doc list */
					if(prospectingLicenceTransferDocCount == 1){
						gettingDocumentList();
					}
					prospectingLicenceTransferDocCount++;
					
				}else if(prospectingLicenceTransactionType == "Surrender"){
					$(".miningFacilitiesFee").html("1000.00");
					applicantEmailsurrender = $("#applicantEmailsurrender").val();
					if(applicantEmailsurrender){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
				} 
			}

			if(miningApplicantionType == "Mining Lease"){
				applicantNameLease = $("#applicantNameLease").val();
				if(applicantNameLease){
					$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}
				miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
				miningLeaseType = $("#miningLeaseTypeVal").val();
				if(miningLicenceTransactionType == "New"){
					
					if(miningLeaseType == "ML-Mining Lease"){
						km2Value = $("#miningAreaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 1200; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
					if(miningLeaseType == "SML-Special Mining Lease"){
						km2Value = $("#miningAreaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 1200; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
						applicantNameLease = $("#applicantNameLease").val();
					if(applicantNameLease){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
					/* Getting doc list */
					if(miningLeaseNewDocCount == 1){
						gettingDocumentList();
					}
					miningLeaseNewDocCount++;
					
				}else if(miningLicenceTransactionType == "Renewal" || miningLicenceTransactionType == "Amendment"){
					if(miningLeaseType == "ML-Mining Lease"){
						km2Value = $("#miningAreaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 600; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
					if(miningLeaseType == "SML-Special Mining Lease"){
						km2Value = $("#miningAreaDelinationTotalApprox").val();
						var fee = km2Value * 1000000 * 1200; 
						$(".miningFacilitiesFee").html(fee.toFixed(2));
					}
						renLeaseApplicantName = $("#renLeaseApplicantName").val();
					renewalEmailAddress = $("#renewalEmailAddress").val();
					if(renLeaseApplicantName && renewalEmailAddress){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
					/* Getting doc list */
					if(miningLeaseRenewDocCount == 1){
						gettingDocumentList();
					}
					miningLeaseRenewDocCount++;
					
				}else if(miningLicenceTransactionType == "Temporary Permission"){
					$(".miningFacilitiesFee").html("10,000.00");
				}else if(miningLicenceTransactionType == "Transfer" || miningLicenceTransactionType == "Surrender"){
					$(".miningFacilitiesFee").html("5000.00 ");
				}
				if(miningLicenceTransactionType == "Transfer"){
					/* Getting doc list */
					if(miningLeaseTransferDocCount == 1){
						gettingDocumentList();
					}
					miningLeaseTransferDocCount++;
				}
				
				
					applicantNameLease = $("#applicantNameLease").val();
					if(applicantNameLease){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
					applicantNametransfer = $("#applicantNametransfer").val();
						applicantEmailtransfer = $("#applicantEmailtransfer").val();
					if(applicantNametransfer && applicantEmailtransfer){
						$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
						applicantEmailsurrender = $("#applicantEmailsurrender").val();
						if(applicantEmailsurrender){
							$("#miningFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						}
			}
		
		}
        if(currentFieldSet == "miningFormsFieldset"){
			var miningApplicantionType = $("#miningApplicantionType").val();
		    if(miningApplicantionType == "Prospecting Rights"){
		    	debugger;
				var prospectingRightsTransactionType = $("#prospectingRightsTransactionTypeVal").val();
				if(prospectingRightsTransactionType == "New" || prospectingRightsTransactionType == "Surrender" || prospectingRightsTransactionType == "Renewal"){
					addProspectingRightsForm();
					addTransferDirectorDetail();
				}
			}
			 if(miningApplicantionType == "Prospecting Licence"){
				var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
				// DOCUMENT VALIDATION 
				var requiredDoc = $("div[id='requiredDoc']").length;
				filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
				if(requiredDoc >= 1){
					$(".mandatory-doc-heading").removeClass("hide");
					numberOfDocument = requiredDoc;
					if(numberOfDocument != filledDocument){
						$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(prospectingLicenceTransactionType == "New" || prospectingLicenceTransactionType == "Additional Minerals"){
					  licenseDelineationAreaInfoFormFive();
					  addDirectorDetail();
				}else if(prospectingLicenceTransactionType == "Renewal &amp; Amendment"){ 
					 	addRenewalDelineationAreaInfo();
				}else if(prospectingLicenceTransactionType == "Transfer"){ 
						addTransferDirectorDetail();
						addProspectLicenceTransferFormNine();
						addTransferDirectorDetail();
				}else if(prospectingLicenceTransactionType == "Surrender"){
						addProspectLicSurrenderFormTen();
						$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				 }
			}
			if(miningApplicantionType == "Mining Lease"){
				var miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
				// DOCUMENT VALIDATION 
				var requiredDoc = $("div[id='requiredDoc']").length;
				filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
				if(requiredDoc >= 1){
					$(".mandatory-doc-heading").removeClass("hide");
					numberOfDocument = requiredDoc;
					if(numberOfDocument != filledDocument){
						$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
				}
				if(miningLicenceTransactionType == "New" || miningLicenceTransactionType == "Temporary Permission"){
					leaseDelineationAreaInfo();
					addMiningDirectorDetail();
				}else if(miningLicenceTransactionType == "Renewal"){
					addRenewLeaseAppliFormFifteen();
				}else if(miningLicenceTransactionType == "Transfer"){
					addTransferDirectorDetail();
					addProspectLicenceTransferFormNine();
				}else if(miningLicenceTransactionType == "Surrender"){
					addProspectLicSurrenderFormTen();
					$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				}  
			}
			pendingMiningApplication();
		}
		
		if(currentFieldSet == "miningSupportingDocumentFieldset"){
			//uploadDocuments('miningGenericUpload','Generic Documents','');
			uploadDocuments('miningGenericUpload','generic Documents',"");
			pendingMiningApplication();
		}
		if(currentFieldSet == "miningfeePaymentFieldset"){
			uploadDocuments('miningGenericUpload','generic Documents',"");
			finalPreviewScroll();
			downloadPDF();
			submitFeeDetailsInMining();
			showFinalSubmitButton();
			previewProspectingRightsDetailInfo();
			previewProspectingLicenceDetailInfo();
			previewMiningLeaseDetailInfo();
			previewProspectingRenewalLicenceDetailInfo();
			previewMiningLeaseTransferDetailsInfo();
			previewMiningLeaseSurrenderDetailInfo();
			previewMiningLeaseRenewalLicenceDetailInfo();
			$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());

			pendingMiningApplication();
			
			/* DOC PREVIEW */
			var miningApplicantionType = $("#miningApplicantionType").val();
			if(miningApplicantionType == "Prospecting Licence"){
				var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
				if(prospectingLicenceTransactionType == "New"){
					showDocsPreview(prospectingLicenceNewCount);
					prospectingLicenceNewCount++;
				}else if(prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
					showDocsPreview(prospectingLicenceRenewCount);
					prospectingLicenceRenewCount++;
				}else if(prospectingLicenceTransactionType == "Additional Minerals"){
					showDocsPreview(prospectingLicenceAdditionalCount);
					prospectingLicenceAdditionalCount++;
				}else if(prospectingLicenceTransactionType == "Transfer"){
					showDocsPreview(prospectingLicenceTransferCount);
					prospectingLicenceTransferCount++;
				}else if(prospectingLicenceTransactionType == "Surrender"){
					showDocsPreview(prospectingLicenceSurrenderCount);
					prospectingLicenceSurrenderCount++;
				}
			}
			if(miningApplicantionType == "Mining Lease"){
				var miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
				if(miningLicenceTransactionType == "New" || miningLicenceTransactionType == "Temporary Permission"){
					showDocsPreview(miningLeaseNewCount);
					miningLeaseNewCount++;
				}else if(miningLicenceTransactionType == "Renewal"){
					showDocsPreview(miningLeaseRenewCount);
					miningLeaseRenewCount++;
				}else if(miningLicenceTransactionType == "Transfer"){
					showDocsPreview(miningLeaseTransferCount);
					miningLeaseTransferCount++;
				}else if(miningLicenceTransactionType == "Surrender"){
					showDocsPreview(miningLeaseSurrenderCount);
					miningLeaseSurrenderCount++;
				}  
			} 
			pendingMiningApplication();
		}
		if(currentFieldSet == "miningfeePaymentFieldset"){
			downloadPDF();
			showDocsPreview(docRenderCount);
        	docRenderCount++;
			submitFeeDetailsInMining();
			showFinalSubmitButton();
			previewProspectingRightsDetailInfo();
			previewProspectingLicenceDetailInfo();
			previewMiningLeaseDetailInfo();
			previewProspectingRenewalLicenceDetailInfo();
			previewMiningLeaseTransferDetailsInfo();
			previewMiningLeaseSurrenderDetailInfo();
			previewMiningLeaseRenewalLicenceDetailInfo();
			$(".fee-amount-preview").html($("#amountPaid").val());
        	$(".fee-currency-preview").html($("#amountCurrency").val());

			pendingMiningApplication();
		}
		
	
        if (nextWizardStep== true) {
          next.parents('.wizard-fieldset').removeClass("show", "400");
         
          currentActiveStep.removeClass('active').addClass('activated').next().addClass('active', "400");
          next.parents('.wizard-fieldset').next('.wizard-fieldset').addClass("show", "400");
          jQuery(document).find('.wizard-fieldset').each(function () {
            if (jQuery(this).hasClass('show')) {
              var formAtrr = jQuery(this).attr('data-tab-content');
              jQuery(document).find('.form-wizard-steps .form-wizard-step-item').each(function () {
                if (jQuery(this).attr('data-attr') == formAtrr) {
                  jQuery(this).addClass('active');
                  var innerWidth = jQuery(this).innerWidth();
                  var position = jQuery(this).position();
                  jQuery(document).find('.form-wizard-step-move').css({ "left": position.left, "width": innerWidth });
                } else {
                  jQuery(this).removeClass('active');
                }
              });
            }
          });
        }
    });
      //click on previous button
      jQuery('.form-wizard-previous-btn').click(function () {
        var counter = parseInt(jQuery(".wizard-counter").text());;
        var prev = jQuery(this);
        var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
       
        $(".form-wizard-next-btn ").show();
       	$(".final-submit").addClass("hide");
       	$(".final-submit-container").addClass("hide");
       	
        prev.parents('.wizard-fieldset').removeClass("show", "400");
        prev.parents('.wizard-fieldset').prev('.wizard-fieldset').addClass("show", "400");
        currentActiveStep.removeClass('active').prev().removeClass('activated').addClass('active', "400");
        jQuery(document).find('.wizard-fieldset').each(function () {
          if (jQuery(this).hasClass('show')) {
            var formAtrr = jQuery(this).attr('data-tab-content');
            jQuery(document).find('.form-wizard-steps .form-wizard-step-item').each(function () {
              if (jQuery(this).attr('data-attr') == formAtrr) {
                jQuery(this).addClass('active');
                var innerWidth = jQuery(this).innerWidth();
                var position = jQuery(this).position();
                jQuery(document).find('.form-wizard-step-move').css({ "left": position.left, "width": innerWidth });
              } else {
                jQuery(this).removeClass('active');
              }
            });
          }
        });
        $(".form-wizard-save-btn").show();
        $(".final-submit").addClass("hide");
        $(".form-wizard-next-btn").show();
      });
    
	//Initialize tooltips
        $('.nav-tabs > li a[title]').tooltip(); 
		//Wizard
		$('a[data-toggle="tab"]').on('show.bs.tab',
				function(e) {
					var $target = $(e.target);
					if ($target.parent().hasClass('disabled')) {
						return false;
					}
				});
		$(".prev-step").click(function(e) {
			var $active = $('.nav-tabs li>a.active');
			prevTab($active);
		});

		function prevTab(elem) {
			$(elem).parent().prev()
					.find('a[data-toggle="tab"]').click();

		}
	});
    /* Pending Application */
 	 function pendingMiningApplication(){
    	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		typeOfApplicant = $("#miningApplicantionType").val();
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		var prospectingRightsTransactionType = $("#prospectingRightsTransactionTypeVal").val();
		var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
		var miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
		var proLicNumber=$("#renew-licence-numb").val();
		areaDelination="";
    	licenceExclusiveSpecialType="";
		if(typeOfApplicant == "Prospecting Licence"){
			areaDelination=$("input[name='areaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#prospectingLicenceProspectingTypeVal").val();
		}
		if((typeOfApplicant == "Prospecting Licence")){
			if((prospectingLicenceTransactionType=="Surrender")||(prospectingLicenceTransactionType=="Transfer")){
				var selectedMinerals = [];
			 	$("#mineralsType .wizard-card.active .wizard-title").each(function () {
			 	    selectedMinerals.push($(this).text().trim());
			 	});
			 	
			 	var selectedMineralsString = selectedMinerals.join(",");
			 	$("#miningMineralsTypeVal").val(selectedMineralsString);
			 	console.log(selectedMineralsString);
			}
		}
		if(typeOfApplicant == "Mining Lease"){
			areaDelination=$("input[name='leaseAreaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#miningLeaseTypeVal").val();
		} 
		
		areaDelinationTotalApprox=$("#areaDelinationTotalApprox").val();
		
		if(prospectingLicenceTransactionType == "Additional Minerals" || miningLicenceTransactionType == "Temporary Permission"){
			selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			var selectedMineralsString = selectedMineralsType.join(",");
		 	$("#miningMineralsTypeVal").val(selectedMineralsString);
		}else{
			miningMineralsTypeVal = $("#miningMineralsTypeVal").val();
		}
		otherMineral = $("#otherMineral").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   		lastFormDetailsStep = $(".tab-pane.active").attr("id");
   		licenseNumber = $("#prospecting-licence-number").val();
   		leaseProspLicNumber = $("#mining-prospecting-licence-number").val();
		leaseProspRightsNumber = $("#mining-prospecting-right-number").val();
		miningAreaApprox=$("#miningAreaDelinationTotalApprox").val();
		var renewMLNum = $("#renew-lic-number").val();
		debugger;
		if(typeOfApplicant == "Mining Lease"){
			if(( miningLicenceTransactionType=="Temporary Permission")||( miningLicenceTransactionType=="Transfer")||( miningLicenceTransactionType=="Surrender")||
					(miningLicenceTransactionType=="Amendment")){
		 		var selectedMinerals = [];
		 	$("#mineralsType .wizard-card.active .wizard-title").each(function () {
		 	    selectedMinerals.push($(this).text().trim());
		 	});
		 	
		 	var selectedMineralsString = selectedMinerals.join(",");
		 	$("#miningMineralsTypeVal").val(selectedMineralsString);
		 	console.log(selectedMineralsString);
		 	}
		} 
		miningMineralsTypeVal=	$("#miningMineralsTypeVal").val();
		 $.ajax({
			    type: "POST",
			    url: "${miningPendingUrl}",
			    data: {
			    	
			    	  "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
			    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
			    	  "<portlet:namespace/>currentFormToSave": currentFormToSave,
			    	  "<portlet:namespace/>prospectingRightsTransactionType": prospectingRightsTransactionType,
			    	  "<portlet:namespace/>prospectingLicenceTransactionType": prospectingLicenceTransactionType,
			    	  "<portlet:namespace/>miningLicenceTransactionType": miningLicenceTransactionType,
			    	  "<portlet:namespace/>areaDelination":areaDelination,
				      "<portlet:namespace/>licenceExclusiveSpecialType":licenceExclusiveSpecialType,
				      "<portlet:namespace/>areaDelinationTotalApprox":areaDelinationTotalApprox,
				      "<portlet:namespace/>miningMineralsTypeVal":miningMineralsTypeVal,
				      "<portlet:namespace/>otherMineral":otherMineral,
				      "<portlet:namespace/>currentStage":currentStage,
    			      "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
    			      "<portlet:namespace/>licenseNumber":licenseNumber,
    			      "<portlet:namespace/>leaseProspRightsNumber":leaseProspRightsNumber,
    			      "<portlet:namespace/>leaseProspLicNumber":leaseProspLicNumber,
    			      "<portlet:namespace/>miningAreaApprox":miningAreaApprox,
    			      "<portlet:namespace/>renewMLNum":renewMLNum,
    			      "<portlet:namespace/>proLicNumber":proLicNumber,
			      		    },
  		        async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	var checkLicenseNumber=result["licenseNumberCheck"];
			    	$("#pop_app_no").html(result["miningAppNo"]);
    			    $("#pop_category").html(result["category"]);
    			    $("#licenceTransactionDraft").html(result["category"]);
    			    $("#pop_status").html(result["appStatus"]);
    		    	$("#miningLeaseApplicationId").val(result["miningLeaseApplicationId"]);
    		    	if(checkLicenseNumber == 0){
    		    		$("#prospectingLicenceNumberValidation").removeClass("hide");
                        $("#prosp-lic-renew-btn").removeAttr("disabled");
    		    	}
    		    	
	 	    	},
				 error: function (data) {
			    },
			  });
	}
    
    /*Download Pdf*/
 	function downloadPDF() {
 		miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${miningDownloadPDFUrl}",
                data: {
                        "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        $("#miningDownloadPDF").attr("href", result["fileUrl"]);
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                },
                error: function(data) {},
        });
    }
    /* Submit Application */
    function submitMiningApplication(){
    	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		typeOfApplicant = $("#miningApplicantionType").val();
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		
		var prospectingRightsTransactionType = $("#prospectingRightsTransactionTypeVal").val();
		var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
		var miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
		
		areaDelination="";
    	licenceExclusiveSpecialType="";
		if(typeOfApplicant == "Prospecting Licence"){
			areaDelination=$("input[name='areaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#prospectingLicenceProspectingTypeVal").val();
		}
		if(typeOfApplicant == "Mining Lease"){
			areaDelination=$("input[name='leaseAreaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#miningLeaseTypeVal").val();
		} 
		
		areaDelinationTotalApprox=$("#areaDelinationTotalApprox").val();
		
		if(prospectingLicenceTransactionType == "Additional Minerals" || miningLicenceTransactionType == "Temporary Permission"){
			selectedMineralsType = [];
			$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
			    selectedMineralsType.push($(this).html());
			});
			miningMineralsTypeVal = selectedMineralsType.toString();
		}else{
			miningMineralsTypeVal = $("#miningMineralsTypeVal").val();
		}
		otherMineral = $("#otherMineral").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 $.ajax({
			    type: "POST",
			    url: "${miningSubmitApplicationUrl}",
			    data: {
			    	
			    	 "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
			    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
			    	  "<portlet:namespace/>currentFormToSave": currentFormToSave,
			    	  "<portlet:namespace/>prospectingRightsTransactionType": prospectingRightsTransactionType,
			    	  "<portlet:namespace/>prospectingLicenceTransactionType": prospectingLicenceTransactionType,
			    	  "<portlet:namespace/>miningLicenceTransactionType": miningLicenceTransactionType,
			    	  "<portlet:namespace/>areaDelination":areaDelination,
				      "<portlet:namespace/>licenceExclusiveSpecialType":licenceExclusiveSpecialType,
				      "<portlet:namespace/>areaDelinationTotalApprox":areaDelinationTotalApprox,
				      "<portlet:namespace/>miningMineralsTypeVal":miningMineralsTypeVal,
				      "<portlet:namespace/>otherMineral":otherMineral,
				      "<portlet:namespace/>currentStage":currentStage,
  			    	  "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
			      		    },
  		    async:false,
			    success: function (data) { 
			    	var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
					   if(appStatus=="submitted"){
					   		$("#continueDashboardMiningLease").removeClass("hide");
					   		$("#submitted-content").removeClass("hide");
					   		$("#application_submitted-img").removeClass("hide");
					   	}else{
					   		$("#draft-content").removeClass("hide");
					   		$("#application_draft-img").removeClass("hide");
					   		$("#application_submitted-img").addClass("hide");
					   		
					   	}
					$(".custom_loader").addClass("hide");
					if(result!=null){
				    	$("#submit_pop_app_no").html(result["miningAppNo"]);
				    	$("#submit_pop_status").html(result["appStatus"]);
				    	$("#submit_pop_category").html(result["category"]);
				    	$("#submitted-status").html(result["category"]);
				    	$("#miningLeaseApplicationId").val(result["miningLeaseApplicationId"]);
				    }
	 	    	},
				 error: function (data) {
			    },
			  });
	}
    
    function showFinalSubmitButton(){
    	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    	if(currentFieldSet == "miningfeePaymentFieldset" || currentFieldSet == "miningFormPreviewFieldset"){
            	$(".form-wizard-next-btn ").hide();
            	$(".form-wizard-save-btn").hide();
            	$(".final-submit").removeClass("hide");
            }else{
            	$(".form-wizard-next-btn").show();
            	$(".form-wizard-save-btn").show();
            	$(".final-submit").addClass("hide");
            }
    }
    function activeSelectForm(){
    	$(".prospectingRightsForm, .mining-prospecting-licence-forms, .mining-prospecting-renewal-licence-forms").addClass("hide");
		$(".miningLeaseForm, .miningLeaseRenewalForms, .mining-transfer-forms, .mining-surrender-forms").addClass("hide");
		
    	$(".prospectingRightsForm .tab-pane").removeClass("active");
		$(".prospectingRightsForm .nav-link").removeClass("active");
		/* $(".prospectingRightsForm .nav-link").addClass("disabled"); */
		
		$(".mining-prospecting-licence-forms .tab-pane").removeClass("active");
		$(".mining-prospecting-licence-forms .nav-link").removeClass("active");
		/* $(".mining-prospecting-licence-forms .nav-link").addClass("disabled"); */
		
		$(".mining-prospecting-renewal-licence-forms .tab-pane").removeClass("active");
		$(".mining-prospecting-renewal-licence-forms .nav-link").removeClass("active");
		/* $(".mining-prospecting-renewal-licence-forms .nav-link").addClass("disabled"); */
		
		$(".miningLeaseForm .tab-pane").removeClass("active");
		$(".miningLeaseForm .nav-link").removeClass("active");
		/* $(".miningLeaseForm .nav-link").addClass("disabled"); */
		
		$(".miningLeaseRenewalForms .tab-pane").removeClass("active");
		$(".miningLeaseRenewalForms .nav-link").removeClass("active");
		/* $(".miningLeaseRenewalForms .nav-link").addClass("disabled"); */
		
		$(".mining-transfer-forms .tab-pane").removeClass("active");
		$(".mining-transfer-forms .nav-link").removeClass("active");
		/* $(".mining-transfer-forms .nav-link").addClass("disabled"); */
		
		$(".mining-surrender-forms .tab-pane").removeClass("active");
		$(".mining-surrender-forms .nav-link").removeClass("active");
		/* $(".mining-surrender-forms .nav-link").addClass("disabled"); */
		
		var miningApplicantionType = $("#miningApplicantionType").val();
		if(miningApplicantionType == "Prospecting Rights"){
			$(".prospectingRightsForm").removeClass("hide");
			$(".prospectingRightsForm .tab-pane:first").addClass("active");
			$(".prospectingRightsForm .nav-link:first").addClass("active");
			$(".prospectingRightsForm .nav-link:first").removeClass("disabled");
		}
		if(miningApplicantionType == "Prospecting Licence"){
			var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
			if(prospectingLicenceTransactionType === "New" || prospectingLicenceTransactionType === "Additional Minerals"){
				$(".mining-prospecting-licence-forms").removeClass("hide");
				$(".mining-prospecting-licence-forms .tab-pane:first").addClass("active");
				$(".mining-prospecting-licence-forms .nav-link:first").addClass("active");
				$(".mining-prospecting-licence-forms .nav-link:first").removeClass("disabled");
			}
			if(prospectingLicenceTransactionType === "Renewal &amp; Amendment"){
				$(".mining-prospecting-renewal-licence-forms").removeClass("hide");
				$(".mining-prospecting-renewal-licence-forms .tab-pane:first").addClass("active");
				$(".mining-prospecting-renewal-licence-forms .nav-link:first").addClass("active");
				$(".mining-prospecting-renewal-licence-forms .nav-link:first").removeClass("disabled");
			}
			if(prospectingLicenceTransactionType === "Transfer"){
				$(".mining-transfer-forms").removeClass("hide");
				$(".mining-transfer-forms .tab-pane:first").addClass("active");
				$(".mining-transfer-forms .nav-link:first").addClass("active");
				$(".mining-transfer-forms .nav-link:first").removeClass("disabled");
			}
			if(prospectingLicenceTransactionType === "Surrender"){
				$(".mining-surrender-forms").removeClass("hide");
				$(".mining-surrender-forms .tab-pane:first").addClass("active");
				$(".mining-surrender-forms .nav-link:first").addClass("active");
				$(".mining-surrender-forms .nav-link:first").removeClass("disabled");
			}
		}
		if(miningApplicantionType == "Mining Lease"){
			var typeofTransaction = $("#miningLicenceTransactionTypeVal").val();
			if(typeofTransaction=="New" || typeofTransaction=="Temporary Permission"){
				$(".miningLeaseForm").removeClass("hide");
				$(".miningLeaseForm .tab-pane:first").addClass("active");
				$(".miningLeaseForm .nav-link:first").addClass("active");
				$(".miningLeaseForm .nav-link:first").removeClass("disabled");
			}
			if(typeofTransaction=="Renewal"){
				$(".miningLeaseRenewalForms").removeClass("hide");
				$(".miningLeaseRenewalForms .tab-pane:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").removeClass("disabled");
			}
			if(typeofTransaction === "Transfer"){
				$(".mining-transfer-forms").removeClass("hide");
				$(".mining-transfer-forms .tab-pane:first").addClass("active");
				$(".mining-transfer-forms .nav-link:first").addClass("active");
				$(".mining-transfer-forms .nav-link:first").removeClass("disabled");
			}
			if(typeofTransaction === "Surrender"){
				$(".mining-surrender-forms").removeClass("hide");
				$(".mining-surrender-forms .tab-pane:first").addClass("active");
				$(".mining-surrender-forms .nav-link:first").addClass("active");
				$(".mining-surrender-forms .nav-link:first").removeClass("disabled");
			}
			if(typeofTransaction === "Amendment"){
				$(".miningLeaseRenewalForms").removeClass("hide");
				$(".miningLeaseRenewalForms .tab-pane:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").removeClass("disabled");9
			}
		}
		$(".form-preview-nav .nav-link").removeClass("disabled");
    }
    $(document).ready(function () {
    	$('input[name="superintendenceNurseQualifications"]').tagsinput({
    		trimValue: true,
    		confirmKeys: [13],
    		focusClass: 'my-focus-class'
    	});
    	
    	$('.bootstrap-tagsinput input').on('focus', function() {
    		$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
    	}).on('blur', function() {
    		$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
    	});
    });
    function openSaveToDraftPopupMining() {
    	debugger;
    	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
    	typeOfApplicant = $("#miningApplicantionType").val();
    	prNumber = $("#prospecting-licence-number").val();
    	currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
    	miningAreaApprox=$("#miningAreaDelinationTotalApprox").val();
    	var prospectingRightsTransactionType = $("#prospectingRightsTransactionTypeVal").val();
    	var prospectingLicenceTransactionType = $("#prospectingLicenceTransactionTypeVal").val();
    	var miningLicenceTransactionType = $("#miningLicenceTransactionTypeVal").val();
    	var renewMLNum = $("#renew-lic-number").val();
    	var proLicNumber = $("#renew-licence-numb").val();

    	areaDelination="";
    	licenceExclusiveSpecialType="";
		if(typeOfApplicant == "Prospecting Licence"){
			areaDelination=$("input[name='areaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#prospectingLicenceProspectingTypeVal").val();
		}
		if(typeOfApplicant == "Mining Lease"){
			areaDelination=$("input[name='leaseAreaDelination']:checked").val();
			licenceExclusiveSpecialType=$("#miningLeaseTypeVal").val();
		} 
    	areaDelinationTotalApprox=$("#areaDelinationTotalApprox").val();
    	licenseNumber = $("#prospecting-licence-number").val();
   		leaseProspLicNumber = $("#mining-prospecting-licence-number").val();
		leaseProspRightsNumber = $("#mining-prospecting-right-number").val();
    	if(prospectingLicenceTransactionType == "Additional Minerals" || miningLicenceTransactionType == "Temporary Permission"){
    		selectedMineralsType = [];
    		$("#mineralsType").find(".wizard-card.active .wizard-title").each(function() {
    		    selectedMineralsType.push($(this).html());
    		});
    		var selectedMineralsString = selectedMineralsType.join(",");
		 	$("#miningMineralsTypeVal").val(selectedMineralsString);
    	}else{
    		miningMineralsTypeVal = $("#miningMineralsTypeVal").val();
    	}
    	otherMineral = $("#otherMineral").val();
    	if(typeOfApplicant == "Mining Lease"){
			if(( miningLicenceTransactionType=="Temporary Permission")||( miningLicenceTransactionType=="Transfer")||( miningLicenceTransactionType=="Surrender")||( miningLicenceTransactionType=="Amendment")){
		 		var selectedMinerals = [];
		 	$("#mineralsType .wizard-card.active .wizard-title").each(function () {
		 	    selectedMinerals.push($(this).text().trim());
		 	});
		 	var selectedMineralsString = selectedMinerals.join(",");
		 	$("#miningMineralsTypeVal").val(selectedMineralsString);
		 	console.log(selectedMineralsString);
		 	}
		} 
    	 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
    	 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		 if(currentFormToSave=="Form No. 1"){
			addProspectingRightsForm();
		 }
		 if(typeOfApplicant == "Prospecting Licence"){
			currentFormToSave=$(".mining-prospecting-licence-forms").find(".active span:nth-child(2)").first().text().trim();
			 if(prospectingLicenceTransactionType === "New" || prospectingLicenceTransactionType === "Additional Minerals"){
				currentFormToSave=$(".mining-prospecting-licence-forms").find(".active span:nth-child(2)").first().text().trim();
			 	if(currentFormToSave=="Form No. 5"){
					exclusiveLicenseApplicantInfoFormFive(true);
					addDirectorDetail();
					('detail-operating',"LICENCE POSITION OF APPLICANT", "A Financial Statement as to the position of the applicant is apprehended hereto");
			    	uploadDocuments('fee-attachment',"LICENCE REGULATION PLAN", "A sketch plan as required by the Regulations is attached hereto");
			    	uploadDocuments('copy-herewith',"LICENCE COPYENCLOSED HEREWITH", "A copy must be enclosed herewith");
				}else if(currentFormToSave=="Delineation of Area"){
					licenseDelineationAreaInfoFormFive();
					uploadDocuments('applicantSignatureMiningBtn',"Licence Signature of Applicant",""); 
				 }
			}
			if(prospectingLicenceTransactionType === "Renewal &amp; Amendment"){
				currentFormToSave=$(".mining-prospecting-renewal-licence-forms").find(".active span:nth-child(2)").text();
				if(currentFormToSave=="Form No. 7"){
					addRenewalProspLicenceFormSeven(true);
					uploadDocuments('approximateRenewalArea',"RENEWAL DELINEATION AREA", "If renewal is sought for only a part delineation and approximate area must be given (see under) and a sketch plan or the area applied for must be attached");
				}else if(currentFormToSave=="Delineation"){
					addRenewalDelineationAreaInfo();
					uploadDocuments('applicantSignatureRenewalBtn',"Renew Signature of Applicant","");
				 }
			}
		}debugger;
		if((typeOfApplicant == "Prospecting Licence")){
			if((prospectingLicenceTransactionType=="Surrender")||(prospectingLicenceTransactionType=="Transfer")){
				var selectedMinerals = [];
			 	$("#mineralsType .wizard-card.active .wizard-title").each(function () {
			 	    selectedMinerals.push($(this).text().trim());
			 	});
			 	
			 	var selectedMineralsString = selectedMinerals.join(",");
			 	$("#miningMineralsTypeVal").val(selectedMineralsString);
			 	console.log(selectedMineralsString);
			}
		}
		 if(typeOfApplicant == "Mining Lease"){
			 if(miningLicenceTransactionType=="New" || miningLicenceTransactionType=="Temporary Permission"){
				 	currentFormToSave=$(".miningLeaseForm")
				    .find(".active span:nth-child(2)").contents().filter(function () {
				        return this.nodeType === Node.TEXT_NODE;
				    }) .first().text() .trim();
				 	if(currentFormToSave=="Form No. 12"){
				 		leaseApplicantDetailFormTwelveInfo(true);
						addMiningDirectorDetail();
						uploadDocuments('financial-statement',"LEASE STATEMENT OF POSITION","A financial statement of the position of the applicant is appended hereto");
				    	uploadDocuments('commissionerCopy',"LEASE COPY OF MEMORANDUM","In a case of an application by a company if a copy of the Memorandum and Articles of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
				    	uploadDocuments('sketchPlan',"LEASE SKETCH PLAN","A sketch plan as required by the Regulations is attached hereto");
				 	}else if(currentFormToSave=="Delineation"){
				 		leaseDelineationAreaInfo();
				 		uploadDocuments('applicantSignatureLeaseBtn',"Lease Signature of Applicant","");
				 	}
				}
				if(miningLicenceTransactionType=="Renewal" || miningLicenceTransactionType=="Amendment"){
					currentFormToSave= $(".miningLeaseRenewalForms")
				    .find(".active span:nth-child(2)").contents().filter(function () {
				        return this.nodeType === Node.TEXT_NODE;
				    }) .first().text() .trim();
					if(currentFormToSave=="Form No. 15"){
						addRenewLeaseAppliFormFifteen();
						uploadDocuments('approximateRenewalLease',"LEASE RENEWAL AREA OF DELINEATION", "If the application is for any area less than the area covered by the lease a sketch plan as required by the regulations must be attached and the delineation with the beacon set out.");
				    	uploadDocuments('applicantSignatureRenewalLeaseBtn',"LEASE Signature of Applicant","");
					}
				}
		 
		 currentFormToSave= $(".mining-transfer-forms")
		    .find(".active span:nth-child(2)").contents().filter(function () {
		        return this.nodeType === Node.TEXT_NODE;
		    }) .first().text() .trim();
		 if(currentFormToSave=="Form No.9"){
			 addTransferDirectorDetail();
			 addProspectLicenceTransferFormNine();
			 uploadDocuments('statement-transfer',"TRANSFER STATEMENT OF POSITION","A financial statement of the position of the applicant is appended hereto.");
	    	 uploadDocuments('detail-association-transfer',"TRANSFER STATEMENT OF ASSOCIATION","If a copy of the Memorandum and Article of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
	    	 uploadDocuments('applicantSignaturetransferBtn',"Transfer Signature of Applicant","");
	    	 uploadDocuments('applicantSignaturetransferCoBtn',"Transfer Signature of the person application","");
	    	 uploadDocuments('applicantSignatureMiningMinisterBtn',"Transfer Signature of Minister","");

		 }else if(currentFormToSave=="Form No.10"){
			 addProspectLicSurrenderFormTen();
			 uploadDocuments('holderSignaturesurrenderBtn',"Surrender Signature of Holder","");
		     uploadDocuments('ministerSignaturesurrenderBtn',"Surrender Signature of Minister","");
		 }
		 }
		 miningMineralsTypeVal=	$("#miningMineralsTypeVal").val();
    	 $.ajax({
    		    type: "POST",
    		    url: "${miningPendingUrl}",
    		    data: {
    		    	
    		    	  "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
    		    	  "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
    		    	  "<portlet:namespace/>currentFormToSave": currentFormToSave,
    		    	  "<portlet:namespace/>prospectingRightsTransactionType": prospectingRightsTransactionType,
    		    	  "<portlet:namespace/>prospectingLicenceTransactionType": prospectingLicenceTransactionType,
    		    	  "<portlet:namespace/>miningLicenceTransactionType": miningLicenceTransactionType,
    		    	  "<portlet:namespace/>areaDelination":areaDelination,
    			      "<portlet:namespace/>licenceExclusiveSpecialType":licenceExclusiveSpecialType,
    			      "<portlet:namespace/>areaDelinationTotalApprox":areaDelinationTotalApprox,
    			      "<portlet:namespace/>miningMineralsTypeVal":miningMineralsTypeVal,
    			      "<portlet:namespace/>otherMineral":otherMineral,
    			      "<portlet:namespace/>currentStage":currentStage,
    			      "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
    			      "<portlet:namespace/>prNumber":prNumber,
    			      "<portlet:namespace/>licenseNumber":licenseNumber,
    			      "<portlet:namespace/>leaseProspRightsNumber":leaseProspRightsNumber,
    			      "<portlet:namespace/>leaseProspLicNumber":leaseProspLicNumber,
    			      "<portlet:namespace/>miningAreaApprox":miningAreaApprox,
    			      "<portlet:namespace/>renewMLNum":renewMLNum,
    			      "<portlet:namespace/>proLicNumber":proLicNumber,
    			      /* "<portlet:namespace/>status": status, */
    			      
    		      		    },
    	    async:false,
    		    success: function (data) { 
    		    	var result = data.APP_DATA;
    		    	$("#pop_app_no").html(result["miningAppNo"]);
    			    $("#pop_category").html(result["category"]);
    			    $("#licenceTransactionDraft").html(result["category"]);
    			    $("#pop_status").html(result["appStatus"]);
    		    	$("#miningLeaseApplicationId").val(result["miningLeaseApplicationId"]);
    	    	},
    			 error: function (data) {
    		    },
    		  });
		$(".savecountinuePopup").modal("show");
		
	}
    function openMiningSaveToSubmitPopup() {
		$(".final-submit-container").removeClass("hide");
		submitMiningApplication();
	}
    $(".payment-method").parents(".wizard-card").addClass("disabled");
    $(".payment-method").css({"pointer-events": "none", opacity: "0.4",});
    $(".payment-method").find(".wizard-card-content-box .wizard-info").addClass("disabled-credit-card");
    $("#makePayment").click(function () {
  	  $("#paymentPopUp").modal("show");
  	});
    $("#credit-card-method").click(function () {
      $("#payment-method-wrapper").addClass("hide");
      $("#credit-card-details").removeClass("hide");
      $("#payment-method").removeClass("hide");
      $("#payment-method span").html($(this).find(".wizard-title").html());
    });
    $("#direct-deposit-method, #bank-draft-method, #cash-method, #cheque-method, #other-method").click(function () {
      $("#payment-method-wrapper").addClass("hide");
      $("#payment-method").removeClass("hide");
      $("#payment-method span").html($(this).find(".wizard-title").html());
      $("#selected-payment-method").html($(this).find(".wizard-title").html());
      $("#selected-payment-method-inner").html(
        $(this).find(".wizard-title").html()
      );
      $("#all-other-payment-details").removeClass("hide");
    });
    $("#makePayment").click(function () {
      $("#paymentPopUp").modal("show");
    });
    $("#choose-payment-method").click(function () {
    	$("#payment-method").addClass("hide");
    	$("#all-other-payment-details").addClass("hide");
    	$("#credit-card-details").addClass("hide");
    	$("#payment-method-wrapper").removeClass("hide");
    	});
    
    $('input[type=radio][name=incorporationLodged]').change(function() {
        if (this.value == 'No') {
            $("#other-copy, #otherCopyPre").removeClass("hide");
        }
        else{
        	$("#other-copy, #otherCopyPre").addClass("hide");
        }
    });
    async function gettingDocumentList(){
    	
    		miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
			typeOfApplicant=$("#miningApplicantionType").val();
			typeOfTransaction=$("#prospectingRightsTransactionTypeVal ").val();
			typeOfProspectingLicence=$("#prospectingLicenceTransactionTypeVal").val();
			typeofTransactionMiningLease = $("#miningLicenceTransactionTypeVal").val();
		$.ajax({
			type : "POST",
			url : "${miningApplicationGettingDocumentList}",
			data : {
				"<portlet:namespace/>typeOfProspectingLicence" : typeOfProspectingLicence,
				"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>miningLeaseApplicationId" : miningLeaseApplicationId,
				"<portlet:namespace/>typeofTransactionMiningLease" : typeofTransactionMiningLease,
			},
			success : function(data) {
				$("#documentList").html(data);
				if (typeOfApplicant === "Mining Lease" && 
					    (typeofTransactionMiningLease !== "New" && typeofTransactionMiningLease !== "Renewal")) {
					$("#documentList").addClass('hide');
				}

				var miningApplicationId = '<%=miningApplicationId%>';
				if (miningApplicationId > 0) {
					var currentStage = "<%=currentStage %>";
					if(currentStage == "SUPPORTING DOCUMENTS"){
						numberOfDocument = $("div[id='requiredDoc']").length;
						filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;

						if (numberOfDocument != filledDocument) {
							$("#miningSupportingDocumentFieldset #save-continue").css({
								"opacity": "0.4", 
								"pointer-events": "none", 
								"cursor": "default"
							});
						} else {
							$("#miningSupportingDocumentFieldset #save-continue").css({
								"opacity": "1", 
								"pointer-events": "auto", 
								"cursor": "pointer"
							});
						}
					}
				}

			},
			error : function(data) {
			},
		});
		validation();
	}
	async function validation(){
		var miningLeaseApplicationId='<%=miningApplicationId%>';
		if(miningLeaseApplicationId>0 ){
		  var requiredDoc = $("div[id='requiredDoc']").length;
		    filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    numberOfDocument = requiredDoc;

		    if (numberOfDocument != filledDocument) {
		        $("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    } else {
		        $("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		    }
	    
		}
	}
	
	$(function () {
		$(document).on('change', '#miningEnrollDocuments', function() { 
	        var fileName = $(this).val();
	        fileName = fileName.replace("C:\\fakepath\\", "");
	        $(this).next('.custom-file-label').html(fileName);
	    })
	}); 
    function openDocumentUploadPopup(counterVal,documentName){
        	$("#<portlet:namespace/>documentNumber").val("");
			$("#<portlet:namespace/>issueDate").val("");
			$("#<portlet:namespace/>expiryDate").val("");
			$("#documentuploadCounter").val("");
			$('.custom-file-label').html('Choose File');
			$("#miningDocumentCounter").val(counterVal);
			$("#documentuploadCounter").val(counterVal);	
			$("#<portlet:namespace/>documentName").val(documentName);
            $("#commonuploadpopup").modal("show");
	}
		function supportingDocumentUpload(){
		 	var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		    var issueDate = $("#<portlet:namespace/>issueDate").val();
		    var expiryDate=$("#<portlet:namespace/>expiryDate").val();
			var documentName = $("#<portlet:namespace/>documentName").val();
			var documentuploadCounter = $("#miningDocumentCounter").val();
		    var fileID = 'miningEnrollDocuments';
		    $("#commonuploadpopup").modal("hide");
		    $('.hidden'+documentuploadCounter).removeClass('hide');
		    var progress = document.getElementById('progress'+documentuploadCounter);
		    progress.ariaValueNow = 50;
		    progress.style.width ='50%';
		    miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		    $.ajaxFileUpload({
		        secureuri: false,
		        method: "POST",
		        fileElementId: 'miningEnrollDocuments',
		        url: '${miningDoucumentsUpload}',
		        dataType: 'text',
		        data: {
		            "<portlet:namespace/>documentNumber": documentNumber,
		            "<portlet:namespace/>documentName": documentName,
		            "<portlet:namespace/>fileID": fileID,
		            "<portlet:namespace/>command": "fileUpload",
		            "<portlet:namespace/>issueDate": issueDate,
		            "<portlet:namespace/>expiryDate": expiryDate,
		            "<portlet:namespace/>documentuploadCounter": documentuploadCounter,
		            "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		        },
		        success: function (data, status) {
		        	var progress = document.getElementById('progress'+documentuploadCounter);
		            progress.ariaValueNow = 100;
		            progress.style.width ='100%';
		            $('.hidden'+documentuploadCounter).addClass('hide');
		            $("#uploadedFormResult"+documentuploadCounter).html(data);
		            $("#<portlet:namespace/>uploaded-documents"+documentuploadCounter).hide();
		            $(".uploaded-info").removeClass("hide");
		            if(data != ""){
		            	$("#documentUpload"+documentuploadCounter).addClass("disabled");	
		            }
		            filledDocument = $(".supporting-document-card").find(".uploaded-info").length;
					if(numberOfDocument == filledDocument){
						$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					}
	        },
		        error: function () {
		        }
		    });
		}
		$("#mining-payment-upload" ).change(function() {
			selectedfiles = this.files[0].name;
			$("#mining-payment-file-chosen").html(selectedfiles);
			$(".fee-msg").removeClass("hide");
		});
		$("#payment-method-wrapper a").click(function(){
		    oldPaymentProof = $("#paymentMethod").val();
		    selectedPaymentProof = $(this).find(".wizard-title").html();
		    $(".fee-method-preview").html(selectedPaymentProof);
		   	$("#paymentMethod").val($(this).find(".wizard-title").html());
		    if(selectedPaymentProof != oldPaymentProof){
		        $(".fee-payment-wrapper #mining-payment-file-chosen").empty();
		        $("#amountPaid, #amountCurrency").val("");
		        $(".fee-payment-wrapper #medical-payment-upload").val('');
		    }
		});
		function opendelDocPopup(fileEntry, counter) {
			$("#documentuploadCounter").val(counter);
			$("#miningDocumentCounter").val(counter);
			console.log("documentcounter****"+counter);
			$("#deletepopup" + fileEntry).modal("show");
		}
		
		function deleteDocument(fileEntryId) {
			var documentuploadCounter = $("#miningDocumentCounter").val();
			$.ajax({
				type : "POST",
				url : '${miningDeleteDocumentUrl}',
				data : {
					"<portlet:namespace/>fileEntryId" : fileEntryId,
				},
				success : function(data) {
					debugger;
					$("#deletepopup" + fileEntryId).modal("hide");
					$("#unpload-info-card" + fileEntryId).remove();
					$("#documentUpload" + documentuploadCounter).removeClass("disabled");
					$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
					var requiredDoc = $("div[id='requiredDoc']").length;
					var notRequireDoc = $("div[id='notRequiredDoc']").length;
			        if(requiredDoc >= 1){
			        if(documentuploadCounter <= requiredDoc){
						$("#requireDocNamePreview" + documentuploadCounter).html("");
						filledDocument = filledDocument -1;
						$("#miningSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
					}
					if(notRequireDoc >= 1){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
					}
				},
				error : function(data) {

				}
			});
		}
		function addProspectingRightsForm(){
			miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
			applicantName=$("#applicantName").val();
			trnNumber=$("#trnNumber").val();
			applicantNationality=$("#applicantNationality").val();
			applicantAge=$("#applicantAge").val();
			applicantTelephone=$("#applicantTelephone").val();
			applicantEmail=$("#applicantEmail").val();
			applicantAddress=$("#applicantAddress").val();
			applicantProspectAccount=$("#applicantProspectAccount").val();
			otherPersonEmployName=$("#otherPersonEmployName").val();
			otherPersonEmployAddress=$("#otherPersonEmployAddress").val();
			applicantProspectingLicence=$("#applicantProspectingLicence").val();
			applicantOffenceConvicted=$("#applicantOffenceConvicted").val();
			validProspectionRight=$("#validProspectionRight").val();
			surrenderProspectingRightNo=$("#surrenderProspectingRightNo").val();
			var prosRightsFeeCheck = new Array();
			$("input:checkbox[name=prosRightFeeCheck]:checked").each(function(){
				prosRightsFeeCheck.push($(this).val());
			});
			var prospectRightsFeeCheck = prosRightsFeeCheck.toString();
			$.ajax({
			    type: "POST",
			    url: "${miningProspectingRightsUrl}",
			    data: {
				     "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
				     "<portlet:namespace/>applicantName": applicantName,
				     "<portlet:namespace/>trnNumber": trnNumber,
				     "<portlet:namespace/>applicantNationality": applicantNationality,
				     "<portlet:namespace/>applicantAge": applicantAge,
				     "<portlet:namespace/>applicantTelephone": applicantTelephone,
				     "<portlet:namespace/>applicantEmail": applicantEmail,
				     "<portlet:namespace/>applicantAddress": applicantAddress,
				     "<portlet:namespace/>applicantProspectAccount": applicantProspectAccount,
				     "<portlet:namespace/>otherPersonEmployName": otherPersonEmployName,
				     "<portlet:namespace/>otherPersonEmployAddress": otherPersonEmployAddress,
				     "<portlet:namespace/>applicantProspectingLicence": applicantProspectingLicence,
				     "<portlet:namespace/>applicantOffenceConvicted": applicantOffenceConvicted,
				     "<portlet:namespace/>validProspectionRight": validProspectionRight,
				     "<portlet:namespace/>surrenderProspectingRightNo": surrenderProspectingRightNo,
				     "<portlet:namespace/>prospectRightsFeeCheck": prospectRightsFeeCheck,

				    },
			    success: function (data) {
			    	uploadDocuments('principal-attachment',"RIGHTS PRINCIPAL UNDERTAKING","I attach hereto from my principal an undertaking in the prescribed form.");
			    	uploadDocuments('applicantSignatureBtn',"Rights Signature of Applicant","");
			    },
			    error: function (data) {},
			  });
		}
		
		

		
		$(document).ready(function () { 
		    var selectedFiles = [];
		    var selectedGenericFiles = [];
		    
		    function updateFileInput() {
		        var newFileList = new DataTransfer();
		        for (var i = 0; i < selectedFiles.length; i++) {
		            newFileList.items.add(selectedFiles[i]);
		        }
		        $('#miningGenericUpload')[0].files = newFileList.files;
		    }

		    function renderPreview() {
		        $('#uploaded-documents-container').empty();
		        counterOfDocAfterSaveAndCon=1;
		        selectedFiles.forEach(function (file) {
		            var documentContainer = $('<div class="document-container"></div>');
		            var deleteButton = $(
		            		  '<a class="uploaded-delete mr-2" onClick="deleteAfterSaveConDoc(this.id);" id="deleteButton' +
		            		    counterOfDocAfterSaveAndCon +
		            		    '" href="#">' +
		            		    '<svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">' +
		            		    '<path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524"></path>' +
		            		    '</svg></a>'
		            		);
		            counterOfDocAfterSaveAndCon++;
		            documentContainer.append(deleteButton);
		            documentContainer.append('<span>' + file.name + '</span>');
		            $('#uploaded-documents-container').append(documentContainer);
		        });
		    }

		    $('#uploaded-documents-container').on('click', '.uploaded-delete', function (e) {
		        e.preventDefault();
		        var fileNameToRemove = $(this).next('span').text();
		        selectedFiles = selectedFiles.filter(function (file) {
		            return file.name !== fileNameToRemove;
		        });
		        renderPreview(); // Re-render the preview after deletion
		        updateFileInput();
		    });

		    $(document).on('change', '#miningGenericUpload', function () {
		        var files = $(this)[0].files;
		        var newFiles = [];

		        for (var i = 0; i < files.length; i++) {
		            var selectedGenericFiles = $(".generic-document-list")
		                .find("#document-name")
		                .map(function () {
		                    return $(this).html(); // Extract each name as a string
		                })
		                .get();

		            var genericFileExists = selectedGenericFiles.some(function (genericFile) {
		                return genericFile === files[i].name; 
		            });
		            
		            var fileExists = selectedFiles.some(function (file) {
		                return file.name === files[i].name;
		            });
		            var miningApplicationId = "<%=miningApplicationId%>";
		        	if(miningApplicationId > 0 ){
		        		if (!fileExists && !genericFileExists) {
		                    newFiles.push(files[i]);
		                }
		        	}else{
		        		if (!fileExists) {
		                    newFiles.push(files[i]);
		                }
		        	}
		            
		        }

		        selectedFiles = selectedFiles.concat(newFiles); // Add new files to selected files
		        renderPreview(); // Render preview with all valid files
		        updateFileInput();

		        if (selectedFiles.length > 0) {
		            $('.uploaded-delete').show();
		            $(".noAdditionalSupportingDoc").hide();
		            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		            $("#miningFormPreviewFieldset .custom_loader").removeClass("hide");
		            $(".preview-section").addClass("hide");
		        } else {
		        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
		            $('.uploaded-delete').hide();
		            $(".noAdditionalSupportingDoc").show();
		            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		            $("#miningFormPreviewFieldset .custom_loader").addClass("hide");
		            $(".preview-section").removeClass("hide");
		        	}
		        }
		    });
		});
		function deleteDoc(id) {
		    var currentId = id;
			$(".document-container-preview"+currentId).remove();
		}
		function expandDetails(id){
      	    var currentIsActive = $("#"+id).hasClass('is-active');
      	    $("#"+id).removeClass('is-active');
      	    $("#"+id).next('.accordion__body').removeClass('is-active');
      	    if (currentIsActive != 1) {
      	        $("#"+id).addClass('is-active');
      	        $("#"+id).next('.accordion__body').addClass('is-active');
      	    }
   		}
		
		$("#prospectingRightsEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#prospectingRightsTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#prospectingLicnecneEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#prospectingLicnecneTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#prospectingLicnecneDelineationEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#prospectingLicnecneDelineationTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#prospectingLicnecneRenewEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#prospectingLicnecneRenewTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#prospectingLicnecneRenewDelineationEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#prospectingLicnecneRenewDelineationTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#miningLeaseEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#miningLeaseTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#miningLeaseDelineationEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#miningLeaseDelineationTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#miningLeaseRenewEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#miningLeaseRenewTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#transferEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#transferTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
		$("#surrenderEditTab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningFormsFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
		   $(".final-submit").addClass("hide");
		   $(".final-submit-container").addClass("hide");
		   $("#surrenderTab").trigger("click");
		   $(".form-section").addClass("active");
		   $(".rm, .form-section").removeClass("activated");
		   $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
		});
	   $("#supporting-doc-edit-tab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningSupportingDocumentFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $(".supporting-documents").addClass("active");
	       $(".rm, .supporting-documents").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	   $("#fee-payment-edit-tab").click(function(){
		   $('#miningFormPreviewFieldset').removeClass("show");
		   $('#miningfeePaymentFieldset').addClass("show", "400");
		   $(".form-wizard-next-btn ").show();
		   $(".form-wizard-save-btn").show();
	       $(".final-submit").addClass("hide");
	       $(".final-submit-container").addClass("hide");
	       $(".fee-payment").addClass("active");
	       $(".fp, .fee-payment").removeClass("activated");
	       $(".last-step").removeClass("activated");
		   $(".last-step").removeClass("active");
		   scrollToPageTop();
	   });
	   function deleteDirectorDetailData(directorDetailValData){
		directorDetailId=$("#directorDetailId"+directorDetailValData);
		 $.ajax({
				type: "POST",
				url: "${deleteDirectorDetailAddForm}", 
				data: {
					"<portlet:namespace/>directorDetailId": directorDetailId,
				},
				success: function (data) {
					var result=data.APP_DATA;
					var counter=result["directorDetailValData"];
					$("#directorDetailId"+counter).val(result["licDirectorDetailId"]);
				},
				error: function (data) {
				}
			});
		}
	   
	   function submitFeeDetailsInMining(){
		   miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paidAmount").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${miningFeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
		  		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
		              "<portlet:namespace/>paymentFee": paymentFee, 
		              "<portlet:namespace/>amountPaid": amountPaid,
		      		  "<portlet:namespace/>amountCurrency": amountCurrency,
			        },
			        success: function (data) {
			            $("#deletepopup"+fileEntryId).modal("hide");
			            $("#unpload-info-card"+fileEntryId).remove();
			        },
			        error: function (data) {
			        }
			    });
		    }else{
				     var fileID = 'mining-payment-upload';
			   		$.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${miningFeeDetailsUrl}",
			   		    fileElementId: 'mining-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		   	  "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
			   		  	  "<portlet:namespace/>paymentMethod": paymentMethod,
			   			  "<portlet:namespace/>paymentFee": paymentFee,
			   		      "<portlet:namespace/>amountPaid": amountPaid,
		  		  	      "<portlet:namespace/>amountCurrency": amountCurrency,
			   		    },
			   		    success: function (data) { 
			   		  		// Parse the JSON data
				   	        var parsedData = JSON.parse(data);
				   	        $.each(parsedData, function(key, entry) {
								var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
					            $("#payment-upload-preview").html(entry.fileName);
								$("#payment-upload-preview").attr("href", decodedUrl);
				   	        });
			   		    },
			   		    error: function (data) {},
			   		  });
		     }
		}
	   function renewalLicense(){
		   typeOfApplicant = $("#miningApplicantionType").val();	
		   prospectingRightsTransactionTypeVal = $("#prospectingRightsTransactionTypeVal").val();	
		   if(typeOfApplicant=="Prospecting Rights"){
		    $("#mining-renew-btn-pros").attr("disabled", true); 
			$("#prospectingLicenceNumberValidation").addClass("hide");
			rightLicenseNumber = $("#renew-licence-number").val();
			
		   }else if(typeOfApplicant=="Prospecting Licence"){
			   $("#mining-renew-btn").attr("disabled", "disabled"); 
        	   $("#prospectingLicenceNumberValidation").addClass("hide");
        	   rightLicenseNumber = $("#prospecting-licence-number").val();
       			}
		  
			$.ajax({
				type : "POST",
				url : "${renewalLicenceUrl}",
				data : {
					"<portlet:namespace/>rightLicenseNumber" :rightLicenseNumber,
					"<portlet:namespace/>prospectingRightsTransactionTypeVal" :prospectingRightsTransactionTypeVal,
					"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
				},
				success : function(data) {					
					var result = data.APP_DATA;
                	var checkLicenseNumber=result["licenseNumberCheck"];
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var typeOfApplicant=$("#miningApplicantionType").val();
                	var typeOfTransactionProspLic = $("#prospectingLicenceTransactionTypeVal").val();
                        if (checkLicenseNumber == 0) {
                        	if(typeOfApplicant=="Prospecting Rights"){
                               $("#renewRightNumbervalidation").removeClass("hide");
                               $("#mining-renew-btn-pros").attr("disabled", false);
                               $("#renew-licence-number").focus();
                        	}else if(typeOfApplicant=="Prospecting Licence"){
                        	   $("#prospectingLicenceNumberValidation").removeClass("hide");
                        	   $("#mining-renew-btn-pros").attr("disabled", false);
                        	     $("#prospecting-licence-number").focus();
                        	}
                        }else{
                        	window.location.href = renewLicenseUrl;
                        	
                        }
				},
				error : function(data) {
				},
			});
		
		}
	   
	   
	   function secondRenewalLicense(){
		   typeOfApplicant = $("#miningApplicantionType").val();
		   typeOfTransaction = $("#prospectingLicenceTransactionTypeVal").val();
		   rightLicenseNumber = $("#renew-licence-number").val();
			leaseProspLicNumber = $("#prospecting-licence-number").val();
				  if((typeOfTransaction=="Additional Minerals")){
					  $("#prospectingLicenceRenewBtn").attr("disabled", "disabled"); 
						$("#renewLicenseNumbvalidation").addClass("hide");
						prospLicenseNumber = $("#renew-licence-numb").val();
						}
				  
			$.ajax({
				type : "POST",
				url : "${secondRenewalLicenseURL}",
				data : {
					"<portlet:namespace/>prospLicenseNumber" : prospLicenseNumber,
					"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
					"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
					"<portlet:namespace/>rightLicenseNumber" :rightLicenseNumber,
					 "<portlet:namespace/>leaseProspRightsNumber":leaseProspLicNumber,
				},
				success : function(data) {
					debugger;
					var result = data.APP_DATA;
                	var checkLicenseNumber=result["licenseNumberCheck"];
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var typeOfApplicant = $("#miningApplicantionType").val();
                	var typeOfTransactionProspLic = $("#prospectingLicenceTransactionTypeVal").val();
                        if (checkLicenseNumber == 0) {
              				  if((typeOfTransaction=="Renewal &amp; Amendment")||(typeOfTransaction=="Additional Minerals")||(typeOfTransaction=="Transfer")||(typeOfTransaction=="Surrender")){
              					 $("#prospectingLicenceRenewAreaSection").addClass("hide");
              					 $("#renewLicenseNumbvalidation").removeClass("hide");
                                 $("#prospectingLicenceRenewBtn").removeAttr("disabled");
                                 $("#renew-licence-numb").focus();
              						}
                        }
                        else{
                        	window.location.href = renewLicenseUrl;
                        	
                        }
				},
				error : function(data) {
				},
			});
		
		}
	   
	   function thirdRenewalLicense(){
		   typeOfApplicant = $("#miningApplicantionType").val();
		   typeOfTransaction = $("#miningLicenceTransactionTypeVal").val();
		   plNumber = $("#mining-prospecting-licence-number").val();
		   prNumber = $("#mining-prospecting-right-number").val();
				  if((typeOfTransaction=="Renewal")||(typeOfTransaction=="Temporary Permission")||(typeOfTransaction=="Transfer")||(typeOfTransaction=="Surrender")||(typeOfTransaction=="Amendment")){
					  $("#miningLicenceRenewBtn").attr("disabled", "disabled"); 
						$("#renewLicenseNumbervalidation").addClass("hide");
						 miningLeaseNumber = $("#renew-lic-number").val();
						}
				  
			$.ajax({
				type : "POST",
				url : "${thirdRenewalLicenseURL}",
				data : {
					"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
					"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
					"<portlet:namespace/>miningLeaseNumber" :miningLeaseNumber,
					"<portlet:namespace/>prNumber" :prNumber,
					"<portlet:namespace/>plNumber" :plNumber,
				},
				success : function(data) {
					var result = data.APP_DATA;
                	var checkLicenseNumber=result["licenseNumberCheck"];
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var typeOfApplicant = $("#miningApplicantionType").val();
             	    var typeOfTransaction = $("#miningLicenceTransactionTypeVal").val();
                        if (checkLicenseNumber == 0) {
              				  if((typeOfTransaction=="Renewal")||(typeOfTransaction=="Temporary Permission")||(typeOfTransaction=="Transfer")||(typeOfTransaction=="Surrender")||(typeOfTransaction=="Amendment")){
              					 $("#miningLicenceRenewAreaSection").addClass("hide");
              					 $("#renewLicenseNumbervalidation").removeClass("hide");
                                 $("#miningLicenceRenewBtn").removeAttr("disabled");
                                 $("#renew-lic-number").focus();
              						}
                        }
                        else{
                        	window.location.href = renewLicenseUrl;
                        	
                        }
				},
				error : function(data) {
				},
			});
		
		}
	   function compareRenewalLicense(){
		   typeOfApplicant = $("#miningApplicantionType").val();
		   typeOfTransaction = $("#prospectingLicenceTransactionTypeVal").val();

				   if(typeOfApplicant=="Mining Lease"){
					  miningProsRightNum = $("#mining-prospecting-right-number").val();
					   miningProsLicNum = $("#mining-prospecting-licence-number").val();	
					    $("#farm-renew-btn").attr("disabled", "disabled"); 
						$("#prospectingLicenceMiningValidation").addClass("hide");
						
					   }
				  
			$.ajax({
				type : "POST",
				url : "${secondRenewalLicenseURL}",
				data : {
					"<portlet:namespace/>miningProsLicNum" : miningProsLicNum,
					"<portlet:namespace/>typeOfApplicant" : typeOfApplicant,
					"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
					"<portlet:namespace/>miningProsRightNum" :miningProsRightNum,
				},
				success : function(data) {
					var result = data.APP_DATA;
                	var checkLicenseNumber=result["licenseNumberCheck"];
                	var renewLicenseUrl=result["renewLicenseUrl"];
                	var typeOfApplicant = $("#miningApplicantionType").val();
                	var typeOfTransactionProspLic = $("#prospectingLicenceTransactionTypeVal").val();
                        if (checkLicenseNumber == 0) {
                        	if(typeOfApplicant=="Mining Lease"){
                                $("#prospectingLicenceMiningValidation").removeClass("hide");
                                $("#farm-renew-btn").removeAttr("disabled");
                                $("#mining-prospecting-right-number").focus();
                                $("#mining-prospecting-licence-number").focus();
                        	}
                        
                        }
                        else{
                        	window.location.href = renewLicenseUrl;
                        	
                        }
				},
				error : function(data) {
				},
			});
		
		}
		 function showDocsPreview(docRenderCount){
		 		var requiredDoc = $("#requiredCounter").val();
		 		var notRequiredDoc = $("#notRequiredCounter").val();
		 		var j;
		 		requiredDoc = parseInt(requiredDoc);
		 		notRequiredDoc = parseInt(notRequiredDoc);
		 		var notRequireDocCount;
		 		if(docRenderCount == "1"){
		 				var requireDocPreview = document.querySelector('#requireDocPreview');
		 				requireDocPreview.innerHTML="";
		 				var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
		 				notRequireDocPreview.innerHTML="";
		 			if(requiredDoc > 1){
		 				j = requiredDoc+1;
		 				notRequireDocCount = requiredDoc + notRequiredDoc;
		 				$("#requireDocPreviewSection").removeClass("hide");
		 				for(i=1;i<=requiredDoc;i++){
		 					requiredDocPre = $("#requiredDoc"+i).html();
		 					fileUrl = $("#fileUrl"+i).val();
		 					var requireDocPreview = document.querySelector('#requireDocPreview');
		 					var previewData = document.createElement('div');
		 					previewData.innerHTML = '<p class="sub_heading">'+requiredDocPre+'</p><a class="sub_heading_content" id="requireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
		 					requireDocPreview.append(previewData);
		 				}
		 			}else{
		 				j = 1;
		 				notRequireDocCount = notRequiredDoc;
		 			}
		 			if(notRequiredDoc > 1){
		 				$("#notRequireDocPreviewSection").removeClass("hide");
		 				for(i=j;i<=notRequireDocCount;i++){
		 					notRequiredDocPre = $("#notRequiredDoc"+i).html();
		 					fileUrl = $("#fileUrl"+i).val();
		 					documentName = $("#document-name"+i).html();
		 					var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
		 					var previewData = document.createElement('div');
		 					previewData.innerHTML = '<p class="sub_heading">'+notRequiredDocPre+'</p><a class="sub_heading_content" id="nonRequireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
		 					notRequireDocPreview.append(previewData);
		 				}
		 			}
		 		}
		 		/ TO APPEND DOC NAME /
		 		if(requiredDoc > 0){
		 			for(i=1;i<=requiredDoc;i++){
		 				documentName = $("#document-name"+i).html();
		 				$("#requireDocNamePreview"+i).html(documentName);
		 			}
		 		}
		 		if(notRequiredDoc > 0){
		 			for(i=j;i<=notRequireDocCount;i++){
		 				documentName = $("#document-name"+i).html();
		 				$("#nonRequireDocNamePreview"+i).html(documentName);
		 			}
		 		}
		 	}
		 function checkingLicence() {
			  var licenceNumber = $("#prospecting-licence-number").val();

			  $.ajax({
			    type: "POST",
			    url: "${checkLicenceNumberUrl}",
			    data: {
			      "<portlet:namespace/>licenceNumber": licenceNumber,
			    },
			    success: function (data) {
			      var result = data.APP_DATA;
			      var responseData = result["response"];
			      
			      if (responseData === "1") {
			        $("#prospectingLicenceNumberValidation").addClass("hide");
			        $("#continue-to-form-btn").removeAttr("disabled").focus();
			      } else if (responseData === "0") {
			        $("#prospectingLicenceNumberValidation").removeClass("hide");
			        $("#continue-to-form-btn").attr("disabled", true);
			      }
			    },
			    error: function (data) {
			      console.error("Error occurred while checking the licence number.");
			    },
			  });
			}
		 function checkingLicenceMiningLeaseCat() {
			  var proLicenNumber = $("#mining-prospecting-licence-number").val();
			  var proRightNum = $("#mining-prospecting-right-number").val();
			  $.ajax({
			    type: "POST",
			    url: "${checkLicenceNumberMiningLeaseUrl}",
			    data: {
			      "<portlet:namespace/>proLicenNumber": proLicenNumber,
			      "<portlet:namespace/>proRightNum": proRightNum,
			    },
			    success: function (data) {
			      var result = data.APP_DATA;
			      var responseData = result["response"];
			      if (responseData === "1") {
			        $("#prospectingLicenceMiningValidation").addClass("hide");
			        $("#continue-to-form-mining-btn").removeAttr("disabled").focus();
			      } else if (responseData === "0") {
			        $("#prospectingLicenceMiningValidation").removeClass("hide");
			        $("#continue-to-form-mining-btn").attr("disabled", true);
			      }
			    },
			    error: function (data) {
			      console.error("Error occurred while checking the licence number.");
			    },
			  });
			}

</script>