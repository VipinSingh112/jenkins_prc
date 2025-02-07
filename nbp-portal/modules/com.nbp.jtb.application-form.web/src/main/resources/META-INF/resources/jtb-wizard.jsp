<portlet:resourceURL var="jtbFeeDetailsUrl" id="/jtb/fee/payment"></portlet:resourceURL>
<portlet:resourceURL var="jtbDownloadPdfUrl" id="/jtb/download/Pdf"></portlet:resourceURL>
<portlet:resourceURL var="renewLicenseUrl" id="/renew/license"></portlet:resourceURL>
<section class="wizard-section">
	<div class="inner-common-banner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row align-items-center">
						<div class="col-lg-8">
							<p class="common-banner-upper-title f2 mb-0">Application for
								a</p>
							<p class="common-banner-title f1 mb-0">Tourism Board Licence</p>
							<p class="common-banner-info f2 mb-3">All tourism entities
								operating in Jamaica, including Hotels, Resort Cottages and
								other tourism accommodation entities, are required to be in
								possession of a Jamaica Tourist Board (JTB) Licence as per
								Section 23A of the Jamaica Tourist Board Act (1955)</p>
						</div>
						<div class="col-lg-4 text-right">
							<a href="/help-support"
								class="common-banner-transparent-link f2 d-inline-block"><liferay-ui:message
									key="Need help in your application?" /> <span class="ml-2"> <svg
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
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
							<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="active">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF APPLICATION</p> <span></span>
								</li>
								<li class="">
									<p class="application-form-upper-title">Select your desired</p>
									<p class="application-form-lower-heading">TYPE OF TRANSACTION</p>
									<span></span>
								</li>
								<li class="form-section">
									<p class="application-form-upper-title">Fill your</p>
									<p class="application-form-lower-heading">APPLICATION FORM DETAILS</p> <span></span>
								</li>
								<li class="rm supporting-documents">
									<p class="application-form-upper-title">Upload your</p>
									<p class="application-form-lower-heading">SUPPORTING
										DOCUMENTS</p> <span></span>
								</li>
								<li class="rm fee-payment fp">
									<p class="application-form-upper-title">Upload the proof of</p>
									<p class="application-form-lower-heading">APPLICATION FEES
										PAYMENT</p> <span></span>
								</li>
								<li style="display: none" class="last-step"><span></span></li>
							</ul>
							<input type="hidden" id="jtbApplicationId" name="jtbApplicationId"> 
							<!-- <input id="employeeId"
								type="hidden" name="employeeId" /> <input
								id="tourismBonaAttracSignatureInfo" type="hidden"
								name="tourismBonaAttracSignatureInfo" /> <input type="hidden"
								id="tourismCurrentStage" name="tourismCurrentStage"> -->
								<input
								type="hidden" id="checkPdfDownloadWithoutDocument"
								name="checkPdfDownloadWithoutDocument" value="true"> 
								<input type="hidden" id="saveAndConCheck" name="saveAndConCheck" value="<%=jtbApplicationId%>">
						</div>
						<%@ include file="/type-of-application/jtb-application-type.jsp"%>
						<%@ include file="/type-of-transaction/jtb-transaction-type.jsp"%>
						<%@ include file="/forms/jtb-form-tabs.jsp"%>
						<%@ include file="/supporting-documents/jtb-documents.jsp"%>
						<%@ include file="/jtb-fee-payment.jsp"%>
						<%@ include file="/preview/final-preview-tabs.jsp"%>
						<%@ include file="/jtb-final-submission.jsp"%>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
var docRenderCount = 1;
var filledDocument = "";
var numberOfDocument = "";
var jtbSubCategoryHotelCounter=1;
var jtbSubCategoryResortCounter=1;
var jtbSubCategoryHomeStayCounter=1;
var jtbAttractionsCounter=1;
var jtbCarRentalsCounter=1;
var jtbDomesticToursCounter=1;
var jtbTravelAgenciesCounter=1;
var jtbWaterSportsOperatorsCounter=1;
var jtbContractCarriageCounter=1;
var jtbTravelHaltsCounter=1;
var jtbBondOperatorsCounter=1;
var jtbSportsEmployeesCounter=1;
var jtbBikeRentalCounter=1;
var jtbInterestWorshipCounter=1;
var jtbCraftTradersCounter=1;
var jtbRiverRaftingCounter=1;

$("#jtbApplicatonType .wizard-card").click(function(){
	$(".application-Fees .common-heading").html("Application Fee");
	$("#rm-payment-method").removeClass("hide");
	$("#jtbApplicatonType .wizard-card, #accommodationSubCategoryTypeBox .wizard-card, #attractionSubCategoryTypeBox .wizard-card, #otherCategoryType .wizard-card").removeClass("active");
	$(this).addClass("active");

	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	
	$("#accommodationSubCategoryTypeBox, #attractionSubCategoryTypeBox, #otherCategoryType, #jtbTransactionTypeBox, #nonHotelsCategoryTypeBox, #jtbTransactionRenewalForm, #domesticToursType").addClass("hide");
	$(".accommodation-reneew-subcategory, .attraction-reneew-subcategory, .other-reneew-subcategory").addClass("hide");
	$("#jtbApplicationType").val($(this).find(".wizard-title").html());
	var jtbApplicatonType = $("#jtbApplicationType").val();
	
	if(jtbApplicatonType == "Accommodations Licence"){
		$("#accommodationSubCategoryTypeBox").removeClass("hide");
		$(".application-Fees .common-heading").html("No Fee Applicable");
		$("#application-Fees").addClass("hide");
		$("#rm-payment-method").addClass("hide");
		$("#payment_category").html("Accommodations");
		$(".accommodation-reneew-subcategory").removeClass("hide");
	}
	if(jtbApplicatonType == "Attractions"){
		$("#attractionSubCategoryTypeBox").removeClass("hide");
		$("#rm-payment-method").removeClass("hide");
		$("#payment_category").html("Attractions");
		$(".attraction-reneew-subcategory").removeClass("hide");
	}
	if(jtbApplicatonType == "Other Tourism Related Licences"){
		$("#otherCategoryType").removeClass("hide");
		$("#rm-payment-method").removeClass("hide");
		$(".other-reneew-subcategory").removeClass("hide");
	}
});

$("#accommodationSubCategoryTypeBox .wizard-card").click(function(){
	$("#accommodationSubCategoryTypeBox .wizard-card, #jtbTransactionTypeBox .wizard-card, #nonHotelsCategoryTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");

	$("#jtbTransactionTypeBox, #nonHotelsCategoryTypeBox, #jtbTransactionRenewalForm").addClass("hide");

	$("#accommodationCategoryTypeVal").val($(this).find(".wizard-title").html());
	var accommodationCategoryTypeVal = $("#accommodationCategoryTypeVal").val();
	if(accommodationCategoryTypeVal == "Hotels"){
		$("#jtbTransactionTypeBox").addClass("hide");
		$("#hotel-accomadation-forms").removeClass("hide");
		$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	}
	if(accommodationCategoryTypeVal == "Resort Cottages"){
		$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		$("#nonHotelsCategoryTypeBox").removeClass("hide");
	}
	if(accommodationCategoryTypeVal == "Home Stay"){
		$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		$("#jtbTransactionTypeBox").removeClass("hide");
	}
});

$("#jtbTransactionTypeBox .wizard-card").click(function(){
	$(".select2").select2({
        placeholder: "Select",
        allowClear: true,
        width: '100%'
	});
	$("#jtbTransactionTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	$("#jtbTransactionRenewalForm").addClass("hide");
	$("#jtbTransactionTypeVal").val($(this).find(".wizard-title").html());
	var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
	var jtbApplicatonType = $("#jtbApplicationType").val();
	if(jtbApplicatonType == "Attractions"){
		$(".jtbFacilitiesFee").html("30,000");
	}
	if(jtbTransactionTypeVal == "New"){
		$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		
	}
	if(jtbTransactionTypeVal == "Renewal"){
		$("#jtbTransactionRenewalForm").removeClass("hide");
	}
});

$("#nonHotelsCategoryTypeBox .wizard-card").click(function(){
	$("#nonHotelsCategoryTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	$("#nonHotelsCategoryTypeVal").val($(this).find(".wizard-title").html());
	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
});

/* For multi select */
/* $("#attractionSubCategoryTypeBox .wizard-card").click(function(){
	$("#jtbTransactionTypeBox .wizard-card").removeClass("active");
	$(this).toggleClass("active");
	
	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	
	$("#jtbTransactionRenewalForm").addClass("hide");
	
	$("#attractionCategoryTypeVal").val($(this).find(".wizard-title").html());
	$("#jtbTransactionTypeBox").removeClass("hide");
}); */

$("#attractionSubCategoryTypeBox .wizard-card").click(function(){
	$("#jtbTransactionTypeBox .wizard-card").removeClass("active");
	$("#attractionSubCategoryTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	
	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	
	$("#jtbTransactionRenewalForm").addClass("hide");
	
	$("#attractionCategoryTypeVal").val($(this).find(".wizard-title").html());
	$("#jtbTransactionTypeBox").removeClass("hide");
/* 	$(".select2").select2({
        placeholder: "Select",
        allowClear: true,
        width: '100%'
	}); */
});

$("#otherCategoryType .wizard-card").click(function(){
	$("#rm-payment-method").removeClass("hide");
	$(".application-Fees .common-heading").html("Application Fee");
	$("#otherCategoryType .wizard-card, #jtbTransactionTypeBox .wizard-card, #domesticToursType .wizard-card").removeClass("active");
	$(this).addClass("active");
	
	$("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
	
	$("#jtbTransactionRenewalForm, #domesticToursType, #jtbTransactionTypeBox").addClass("hide");
	
	$("#otherCategoryTypeVal").val($(this).find(".wizard-title").html());
	var otherCategoryTypeVal = $("#otherCategoryTypeVal").val();
	$("#payment_category").html(otherCategoryTypeVal);
	$(".fee-details-preview").removeClass("hide");
	
	/* if(otherCategoryTypeVal == 'Domestic Tours'){
		return $("#domesticToursType").removeClass("hide");
	} */
	if(otherCategoryTypeVal == 'Places of Interest/Worship'){
		return;
	}
	$("#jtbTransactionTypeBox").removeClass("hide");

});

$("#domesticToursType .wizard-card").click(function(){
	$("#domesticToursType .wizard-card, #jtbTransactionTypeBox .wizard-card").removeClass("active");
	$(this).addClass("active");
	
	$("#domesticToursTypeVal").val($(this).find(".wizard-title").html());
	$("#jtbTransactionTypeBox").removeClass("hide");
	/* $("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"}); */
});



var nextWizardStep = true;
jQuery(document).ready(function () {
    jQuery('.wizard-next-btn').click(function () {
    var parentFieldset = jQuery(this).parents('.wizard-fieldset');
    var currentActiveStep = jQuery(this).parents('.form-wizard').find('.form-wizard-steps .active');
    var next = jQuery(this);
    var currentFieldSet = $(".wizard-fieldset.show").attr("id");
    
    /* Scroll Page to top */
    scrollToPageTop();
    
    if(currentFieldSet == "jtbTransactionTypeFieldset"){
    	activeSelectForm();
    	docRenderCount = 1;
		pendingJTBApplication();
		/* naveTabCount(); */
    }
    /* Implement Dynamic form renders */
    $(".hotel-accomadation-forms, .non-hotel-accomadation-forms, .home-stay-accomadation-forms, .new-attraction-forms, .new-car-rental-forms").addClass('hide');
    $(".domestic-tour-company-forms, .travel-agency-forms, .water-sports-operator-forms, .contract-carriage-forms, .travel-halt-forms, .water-sports-employee-forms, .motor-bike-rental-forms, .places-of-interest-forms, .craft-traders-forms, .river-rafting-forms, .in-bond-operator-forms").addClass('hide');
    
    $(".accommodationHotelForm, .accommodation-non-hotel-preview, .accommodationHomeStayForm, .attractionNewForm, .carRentalNewForm").addClass('hide');
	$(".water-sports-employee-preview, .motor-bike-rental-preview, .places-of-interest-preview, .domestic-tour-company-preview, .travel-halt-preview, .travel-agency-preview, .water-sports-operator-preview, .contract-carriage-preview, .carft-traders-preview").addClass('hide');
    
	var jtbApplicatonType = $("#jtbApplicationType").val();
    
	if(jtbApplicatonType == "Accommodations Licence"){

		var accommodationCategoryTypeVal = $("#accommodationCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
		
		if(accommodationCategoryTypeVal == "Hotels"){
				
				$(".hotel-accomadation-forms").removeClass('hide');
				$(".accommodationHotelForm ").removeClass('hide');
			/* if(jtbTransactionTypeVal == "Renewal"){
				$("#jtbTransactionRenewalForm").removeClass("hide");
			} */
		}
		else if(accommodationCategoryTypeVal == "Resort Cottages"){

				$(".non-hotel-accomadation-forms").removeClass('hide');
				$(".accommodation-non-hotel-preview").removeClass('hide');
		}
		else if(accommodationCategoryTypeVal == "Home Stay"){

			$(".home-stay-accomadation-forms").removeClass('hide');
			$(".accommodationHomeStayForm").removeClass('hide');
			/* if(jtbTransactionTypeVal == "New"){
			   
			} */
		}
		$(".fee-details-preview").addClass("hide");
	}
	
	if(jtbApplicatonType == "Attractions"){

		var attractionCategoryTypeVal = $("#attractionCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
		
		if(attractionCategoryTypeVal == "Nature Based" || "Water Based" || "Heritage"){
			
			$(".new-attraction-forms").removeClass('hide');
			$(".attractionNewForm").removeClass('hide');
			
			var attractionSubCategory = new Array();
	    	$("#attractionSubCategoryTypeBox .wizard-card").each(function(){
	    	   if($(this).hasClass("active")){
	    	       attractionSubCategory.push($(this).find(".wizard-title").html());
	    	   } 
	    	});
			$("input#newAttractionsTypeBox").val(attractionSubCategory);
			/* if(jtbTransactionTypeVal == "New"){
			} */       
			/* if(jtbTransactionTypeVal == "Renewal"){
				$("#jtbTransactionRenewalForm").removeClass("hide");
			} */
			
		}
		$(".fee-details-preview").removeClass("hide");
	}
	
	if(jtbApplicatonType == "Other Tourism Related Licences"){
		var otherCategoryTypeVal = $("#otherCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
				
		if(otherCategoryTypeVal == "Car Rentals"){
			
			$(".new-car-rental-forms").removeClass('hide');
			$(".carRentalNewForm").removeClass('hide');
			/* if(jtbTransactionTypeVal == "New"){
								
			}  */      
			/* if(jtbTransactionTypeVal == "Renewal"){
				$("#jtbTransactionRenewalForm").removeClass("hide");
			} */
			
		}else if(otherCategoryTypeVal == "Domestic Tours"){
			
			$(".domestic-tour-company-forms, .domestic-tour-company-preview").removeClass('hide');
			/* if(jtbTransactionTypeVal == "New"){
			} */       
			
		}else if(otherCategoryTypeVal == "Travel Agencies"){
			$(".travel-agency-forms, .travel-agency-preview").removeClass('hide');
			/* if(jtbTransactionTypeVal == "New"){
			} */       
			
		}else if(otherCategoryTypeVal == "Water Sports Operators"){
			
			$(".water-sports-operator-forms, .water-sports-operator-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "Contract Carriage"){
			
			$(".contract-carriage-forms, .contract-carriage-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "Travel Halts"){
			
			$(".travel-halt-forms").removeClass('hide');
			$(".travel-halt-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "In-Bond Operators"){
			$(".in-bond-operator-forms").removeClass('hide');
			if(jtbTransactionTypeVal == "New"){
				
				/* $(".travel-halt-forms").removeClass('hide'); */
				
			}       
			
		}else if(otherCategoryTypeVal == "Water Sports Employees"){
			
			$(".water-sports-employee-forms, .water-sports-employee-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "Bike Rental"){
			
			$(".motor-bike-rental-forms, .motor-bike-rental-preview").removeClass('hide');
		
		}else if(otherCategoryTypeVal == "Places of Interest/Worship"){
			
			$(".places-of-interest-forms, .places-of-interest-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "Craft Traders"){
			
			$(".craft-traders-forms, .carft-traders-preview").removeClass('hide');
			
		}else if(otherCategoryTypeVal == "River Rafting"){
			$(".river-rafting-forms").removeClass('hide');
			
		}
	}

/*  if(currentFieldSet == "jtbTransactionTypeFieldset"){
	 gettingDocumentList();
	 pendingJTBApplication();
    	
    }*/
 if(currentFieldSet == "jtbFormsFieldset"){
	 addAttractionGenDeclaration();
	 var accomodationSubCategory=$("#accommodationCategoryTypeVal").val();
	 var attractionCategoryTypeVal=$("#attractionCategoryTypeVal").val();
	 if(accomodationSubCategory=="Hotels"){
	 addAccoGenDeclarationDetail();  
	 }else if(accomodationSubCategory=="Resort Cottages"){
	 addAccoNonHotelGenDec();
	 } else if(accomodationSubCategory=="Home Stay"){
	 addAccoHomeStayLicence(false);
	 }
	 
	 addCarRentalConditionFormInfo();
	 addDomesticServiceOfferedInfo();
	 addTravelAgencyDetails();
	 addWaterSportsRequirementsInfo();
	 contractCarriageGeneralDeclareInfo();
	 addTravelHaltOfferedInfo();
	 addWaterSportsEmployeeGeneralDeclareInfo();
	 addMotorBikeCOnditionProposedInfo();
	 addCraftTradersPermitInfo();
	 addPlaceOfInterestGeneralDeclaration();
	 
	 /* APPEND FEE */
	jtbApplication = $("#jtbApplicationType").val();
	otherCategoryType = $("#otherCategoryTypeVal").val();
	$(".additionalDriverFeeBox").addClass("hide");
	if(jtbApplication == "Other Tourism Related Licences"){
		if(otherCategoryType == 'Car Rentals'){
			$(".jtbFacilitiesFee").html("10,000");
		}
		if(otherCategoryType == 'Contract Carriage'){
			$(".jtbFacilitiesFee").html("10,000");
		}
		if(otherCategoryType == 'Water Sports Employees'){
			$(".jtbFacilitiesFee").html("800.00");
		}
		if(otherCategoryType == 'Bike Rental'){
			$(".jtbFacilitiesFee").html("10,000");
		}
		if(otherCategoryType == 'Places of Interest/Worship'){
			$(".application-Fees .common-heading").html("No cost and no expiry date");
			$("#rm-payment-method").addClass("hide");
			$(".fee-details-preview").addClass("hide");
		}
		if(otherCategoryType == 'Domestic Tours'){
			$(".jtbFacilitiesFee").html("10,000");
		}
		if(otherCategoryType == 'Travel Halts'){
			$(".application-Fees .common-heading").html("No cost and no expiry date");
			$("#rm-payment-method").addClass("hide");
			$(".fee-details-preview").addClass("hide");
		}
		if(otherCategoryType == 'Water Sports Operators'){
			$(".jtbFacilitiesFee").html("10,000");
		}
		if(otherCategoryType == 'Travel Agencies'){
			$(".jtbFacilitiesFee").html("2000");
		}
		if(otherCategoryType == "Contract Carriage"){
			contractDriverListDetail = $("#contractDriverListDetailVal").val();
			contractDriverListCount = contractDriverListDetail-1;
			if(contractDriverListCount > 1){
				$(".additionalDriverFeeBox").removeClass("hide");
			    contractDriverListCountUp = contractDriverListCount-1;
			    $(".additionalDriverFeeTitle").html("Driver's Fee("+contractDriverListCountUp+" * 800)");
			    driverFee = contractDriverListCountUp * 800;
			    $(".additionalDriverFee").html(driverFee);
			    totalFee = 5000 + driverFee;
			    $(".jtbFacilitiesFee").eq(0).html("5000"); 
			    $(".jtbFacilitiesFee").eq(1).html(totalFee); 

			}else{
			    $(".jtbFacilitiesFee").html("5000");
			}
		 }	
		if(otherCategoryType == "Craft Traders"){
			craftTradersEmployeeDetail = $("#craftTradersEmployeeDetailVal").val();
			craftTradersEmployeeCount = craftTradersEmployeeDetail-1;
			if(craftTradersEmployeeCount > 1){
				$(".additionalDriverFeeBox").removeClass("hide");
			    craftTradersEmployeeCountUp = craftTradersEmployeeCount-1;
			    $(".additionalDriverFeeTitle").html("Employee's Fee("+craftTradersEmployeeCountUp+" * 800)");
			    assistantFee = craftTradersEmployeeCountUp * 800;
			    $(".additionalDriverFee").html(assistantFee);
			    totalFee = 1300 + assistantFee;
			    $(".jtbFacilitiesFee").eq(0).html("1300"); 
			    $(".jtbFacilitiesFee").eq(1).html(totalFee);
			}else{
			    $(".jtbFacilitiesFee").html("1300");
			}
		}
		if(otherCategoryType == "In-Bond Operators"){
			/* craftTradersApplicantDetail = $("#craftTradersApplicantDetailVal").val();
			craftTradersEmployeeDetail = $("#craftTradersEmployeeDetailVal").val();
			shopFee = craftTradersApplicantDetail * 1300;
			assistantFee = craftTradersEmployeeDetail * 800;
			totalFee = shopFee + assistantFee;
			$(".jtbFacilitiesFee").html(totalFee); */
		}
	}
	/* DOCUMENT VALIDATION */
	var requiredDoc = $("div[id='requiredDoc']").length;
	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
	if(requiredDoc >= 1){
		$(".mandatory-doc-heading").removeClass("hide");
		numberOfDocument = requiredDoc;
		if(numberOfDocument != filledDocument){
    		$("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
    	}
	}
	pendingJTBApplication();
 } 
    
 if(currentFieldSet == "jtbTransactionTypeFieldset"){

	 pendingJTBApplication();
	 if($("#accommodationCategoryTypeVal").val() == 'Hotels' ){
		 newAccomadationOwnerName = $("#newAccomadationOwnerName").val();
		 newAccomadationEmail = $("#newAccomadationEmail").val();
 		if(!newAccomadationOwnerName && !newAccomadationEmail){
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
 		}else{
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
 		}

 		
 	}else if($("#accommodationCategoryTypeVal").val() == 'Home Stay' ){
 		homeStayAccomadationOwnerName = $("#homeStayAccomadationOwnerName").val();
 		homeStayAccomadationEmail = $("#homeStayAccomadationEmail").val();
 		if(!homeStayAccomadationOwnerName && !homeStayAccomadationEmail){
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
 		}else{
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
 		}

 	}else if($("#otherCategoryTypeVal").val() == 'Travel Agencies' ){
 		travelAgencyApplicantName = $("#travelAgencyApplicantName").val();
 		if(!travelAgencyApplicantName){
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
 		}else{
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
 		}
 		
 	}else{
 		nonHotelAccomadationOwnerName = $("#nonHotelAccomadationOwnerName").val();
 		nonHotelAccomadationEmail = $("#nonHotelAccomadationEmail").val();
 		if(!nonHotelAccomadationOwnerName && !nonHotelAccomadationEmail){
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
 		}else{
 			$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
 		}
 	} 
 	
	 typeOfApplication=$("#jtbApplicationType").val();
	 if(typeOfApplication=="Accommodations Licence"){
 			 if($("#accommodationCategoryTypeVal").val() == "Hotels"){
 				if(jtbSubCategoryHotelCounter==1){
 					 gettingDocumentList();
 				} 
 				jtbSubCategoryHotelCounter++;
 			}
 			 else if($("#accommodationCategoryTypeVal").val() == "Resort Cottages" ){
 				if(jtbSubCategoryResortCounter==1){
 					 gettingDocumentList();
 				} 
 				jtbSubCategoryResortCounter++;
 			}
 			 else if($("#accommodationCategoryTypeVal").val() == "Home Stay" ){
 				if(jtbSubCategoryHomeStayCounter==1){
 					 gettingDocumentList();
 				}
 				jtbSubCategoryHomeStayCounter++;
 				}
 		}
	 
	 if(typeOfApplication=="Attractions"){
		  attractionSubCat=$("#attractionCategoryTypeVal").val();
		  if((attractionSubCat=="Nature Based")||(attractionSubCat=="Water Based")||(attractionSubCat=="Heritage")){
			  if(jtbAttractionsCounter==1){
				  gettingDocumentList(); 
			 	 }
			  jtbAttractionsCounter++;
			  }
		  }
	  
	 if(typeOfApplication=="Other Tourism Related Licences"){
		  otherCategoryType=$("#otherCategoryTypeVal").val();
		  if(otherCategoryType=="Car Rentals"){
			  if(jtbCarRentalsCounter==1){
				  gettingDocumentList(); 
			  }
			  jtbCarRentalsCounter++;
		  }
		  
		  else if(otherCategoryType=="Domestic Tours"){
			  if(jtbDomesticToursCounter==1){
				  gettingDocumentList();  
			  }
			  jtbDomesticToursCounter++;
		  }
		  
		  else if(otherCategoryType=="Travel Agencies"){
			  if(jtbTravelAgenciesCounter==1){
				  gettingDocumentList(); 
			  }
			  jtbTravelAgenciesCounter++;
		  }
		  
		  else if(otherCategoryType=="Water Sports Operators"){
			  if(jtbWaterSportsOperatorsCounter==1){
				  gettingDocumentList();  
			}
			  jtbWaterSportsOperatorsCounter++;
		  }
		  
		  else if(otherCategoryType=="Contract Carriage"){
			 	 if(jtbContractCarriageCounter==1){
				  gettingDocumentList(); 
			  }
			 	jtbContractCarriageCounter++;
		  }
		  
		  else if(otherCategoryType=="Travel Halts"){
			 if(jtbTravelHaltsCounter==1){
			 gettingDocumentList(); 
			  }
			 jtbTravelHaltsCounter++;
		  }
		  
		  else if(otherCategoryType=="In-Bond Operators"){
				 if(jtbBondOperatorsCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbBondOperatorsCounter++;
			}
		  
		  else if(otherCategoryType=="Water Sports Employees"){
				 if(jtbSportsEmployeesCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbSportsEmployeesCounter++;
			}
		  
		  else if(otherCategoryType=="Bike Rental"){
				 if(jtbBikeRentalCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbBikeRentalCounter++;
			}
	  
		  else if(otherCategoryType=="Places of Interest/Worship"){
				 if(jtbInterestWorshipCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbInterestWorshipCounter++;
			}
		  
		  else if(otherCategoryType=="Craft Traders"){
				 if(jtbCraftTradersCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbCraftTradersCounter++;
			}
		  
		  else if(otherCategoryType=="River Rafting"){
				 if(jtbRiverRaftingCounter==1){
				 gettingDocumentList(); 
				  }
				 jtbRiverRaftingCounter++;
			}
	  }
 }
	 
 if(currentFieldSet == "jtbSupportingDocumentFieldset"){
	 //uploadDocuments('jtbGenericUpload','Generic Documents');
	 jtbGenericDocuments("Generic Documents");
	$("#jtb-credit-card-method").parents(".wizard-card").removeClass("disabled");
	$("#jtb-credit-card-method").find(".wizard-info").removeClass("hide");    
	$("#jtb-credit-card-method").css({"pointer-events": "auto", opacity: "1",});
	$("#jtb-credit-card-method").find(".wizard-card-content-box").find("p.wizard-info.disabled-credit-card").remove();
    pendingJTBApplication(); 
} 
 if(currentFieldSet == "jtbfeePaymentFieldset"){
	 showDocsPreview(docRenderCount);
	 docRenderCount++;
	 downloadPDF();
	 submitFeeDetailsInJtb();
	 showFinalSubmitButton();
	 previewHotelLicenceDetailInfo();
 	 previewNonHotelLicenceDetailInfo();
 	 previewHomeStayLicenceDetailInfo();
 	 previewAttractionLicenceDetailInfo();
 	 previewCarRentalLicenceDetailInfo();
 	 previewWaterSportEmployeesLicenceDetailInfo();
 	 previewBikeRentalLicenceDetailInfo();
 	 previewPlacesInterestLicenceDetailInfo();
 	 previewTravelHaltDetailInfo();
 	 previewDomesticTourCompanyLicenceDetailInfo();
 	 previewTravelAgencyLicenceDetailInfo();
 	 previewWaterSportOperatorLicenceDetailInfo();
 	 previewContractCarriageOperatorDetailInfo();
 	 previewCarftTradersDetailInfo();
     finalPreviewScroll();
     addOperatorManagerDetailPre();
     $(".fee-amount-preview").html($("#amountPaid").val());
 	 $(".fee-currency-preview").html($("#amountCurrency").val());
	  pendingJTBApplication();
	 /* naveTabCount(); */
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
/* water-sport-operator */ 
    $(document).ready(function () {
    	$('input[name="waterSportOpActivitiesList"]').tagsinput({
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
	$(function () {
		$(document).on('change', '#ogtServicesEnrollDocuments', function() { 
	        var fileName = $(this).val();
	        fileName = fileName.replace("C:\\fakepath\\", "");
	        $(this).next('.custom-file-label').html(fileName);
	    })
	}); 
	function prevTab(elem) {
		$(elem).parent().prev()
				.find('a[data-toggle="tab"]').click();

	}	
	});
	
function activeSelectForm(){
	/* $(".tab-pane").removeClass("active"); */
	$(".hotel-accomadation-forms .tab-pane, .non-hotel-accomadation-forms .tab-pane, .home-stay-accomadation-forms .tab-pane, .new-attraction-forms .tab-pane, .new-car-rental-forms .tab-pane").removeClass('active');
    $(".hotel-accomadation-forms#side-tabs .nav-link, .non-hotel-accomadation-forms#side-tabs .nav-link, .home-stay-accomadation-forms#side-tabs .nav-link, .new-attraction-forms#side-tabs .nav-link, .new-car-rental-forms#side-tabs .nav-link").removeClass("active");
    /* $(".hotel-accomadation-forms#side-tabs .nav-link, .non-hotel-accomadation-forms#side-tabs .nav-link, .home-stay-accomadation-forms#side-tabs .nav-link, .new-attraction-forms#side-tabs .nav-link, .new-car-rental-forms#side-tabs .nav-link").addClass("disabled"); */

    $(".domestic-tour-company-forms .tab-pane, .travel-agency-forms .tab-pane, .water-sports-operator-forms .tab-pane, .contract-carriage-forms .tab-pane, .travel-halt-forms .tab-pane, .water-sports-employee-forms .tab-pane, .motor-bike-rental-forms .tab-pane, .places-of-interest-forms .tab-pane, .craft-traders-forms .tab-pane").removeClass("active");
    $(".domestic-tour-company-forms#side-tabs .nav-link, .travel-agency-forms#side-tabs .nav-link, .water-sports-operator-forms#side-tabs .nav-link, .contract-carriage-forms#side-tabs .nav-link, .travel-halt-forms#side-tabs .nav-link, .water-sports-employee-forms#side-tabs .nav-link, .motor-bike-rental-forms#side-tabs .nav-link, .places-of-interest-forms#side-tabs .nav-link, .craft-traders-forms#side-tabs .nav-link").removeClass("active");
    /* $(".domestic-tour-company-forms#side-tabs .nav-link, .travel-agency-forms#side-tabs .nav-link, .water-sports-operator-forms#side-tabs .nav-link, .contract-carriage-forms#side-tabs .nav-link, .travel-halt-forms#side-tabs .nav-link, .water-sports-employee-forms#side-tabs .nav-link, .motor-bike-rental-forms#side-tabs .nav-link, .places-of-interest-forms#side-tabs .nav-link, .craft-traders-forms#side-tabs .nav-link").addClass("disabled"); */
	
	var jtbApplicatonType = $("#jtbApplicationType").val();
	if(jtbApplicatonType == "Accommodations Licence"){
		
		var accommodationCategoryTypeVal = $("#accommodationCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
		
		if(accommodationCategoryTypeVal == "Hotels"){
				$(".hotel-accomadation-forms .tab-pane:first").addClass("active");
				$(".hotel-accomadation-forms#side-tabs .nav-link:first").addClass("active");
				$(".hotel-accomadation-forms#side-tabs .nav-link:first").removeClass("disabled");
				
				$("#supportingDocStep").html("3");
				$("#feePaymentStep").html("4");
		}
		else if(accommodationCategoryTypeVal == "Resort Cottages"){
				$(".non-hotel-accomadation-forms .tab-pane:first").addClass("active");
				$(".non-hotel-accomadation-forms#side-tabs .nav-link:first").addClass("active");
				$(".non-hotel-accomadation-forms#side-tabs .nav-link:first").removeClass("disabled");
				
				$("#supportingDocStep").html("4");
				$("#feePaymentStep").html("5");
		}
		else if(accommodationCategoryTypeVal == "Home Stay"){

			 $(".home-stay-accomadation-forms .tab-pane:first").addClass("active");
			   $(".home-stay-accomadation-forms#side-tabs .nav-link:first").addClass("active");
			   $(".home-stay-accomadation-forms#side-tabs .nav-link:first").removeClass("disabled");
			   
			   $("#supportingDocStep").html("2");
			   $("#feePaymentStep").html("3");
	}
	}
	
	if(jtbApplicatonType == "Attractions"){

		var attractionCategoryTypeVal = $("#attractionCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
		
		if(attractionCategoryTypeVal == "Nature Based" || "Water Based" || "Heritage"){
			   $(".new-attraction-forms .tab-pane:first").addClass("active");
			   $(".new-attraction-forms#side-tabs .nav-link:first").addClass("active");
			   $(".new-attraction-forms#side-tabs .nav-link:first").removeClass("disabled");
			   
			   $("#supportingDocStep").html("3");
			   $("#feePaymentStep").html("4");
			if(jtbTransactionTypeVal == "New"){
				  
			}       
			/* if(jtbTransactionTypeVal == "Renewal"){
				$("#jtbTransactionRenewalForm").removeClass("hide");
			} */
			
		}
	}
	
	if(jtbApplicatonType == "Other Tourism Related Licences"){
		var otherCategoryTypeVal = $("#otherCategoryTypeVal").val();
		var jtbTransactionTypeVal = $("#jtbTransactionTypeVal").val();
		
		if(otherCategoryTypeVal == "Car Rentals"){
			
		   $(".new-car-rental-forms .tab-pane:first").addClass("active");
		   $(".new-car-rental-forms#side-tabs .nav-link:first").addClass("active");
		   $(".new-car-rental-forms#side-tabs .nav-link:first").removeClass("disabled");
		   
		   $("#supportingDocStep").html("3");
		   $("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				   
			} */       
			/* if(jtbTransactionTypeVal == "Renewal"){
				$("#jtbTransactionRenewalForm").removeClass("hide");
			} */
		}else if(otherCategoryTypeVal == "Domestic Tours"){
			$(".domestic-tour-company-forms .tab-pane:first").addClass("active");
		    $(".domestic-tour-company-forms#side-tabs .nav-link:first").addClass("active");
		    $(".domestic-tour-company-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("3");
			$("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				
				
			}  */      
			
		}else if(otherCategoryTypeVal == "Travel Agencies"){
			
			$(".travel-agency-forms .tab-pane:first").addClass("active");
		    $(".travel-agency-forms#side-tabs .nav-link:first").addClass("active");
		    $(".travel-agency-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("2");
			$("#feePaymentStep").html("3");
			/* if(jtbTransactionTypeVal == "New"){
				
			}  */      
			
		}else if(otherCategoryTypeVal == "Water Sports Operators"){
			
			$(".water-sports-operator-forms .tab-pane:first").addClass("active");
		    $(".water-sports-operator-forms#side-tabs .nav-link:first").addClass("active");
		    $(".water-sports-operator-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("4");
		    $("#feePaymentStep").html("5");
			/* if(jtbTransactionTypeVal == "New"){
				
			}   */     
			
		}else if(otherCategoryTypeVal == "Contract Carriage"){
			
			$(".contract-carriage-forms .tab-pane:first").addClass("active");
		    $(".contract-carriage-forms#side-tabs .nav-link:first").addClass("active");
		    $(".contract-carriage-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("3");
		    $("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				
				
			}  */      
			
		}else if(otherCategoryTypeVal == "Travel Halts"){
			
			$(".travel-halt-forms .tab-pane:first").addClass("active");
		    $(".travel-halt-forms#side-tabs .nav-link:first").addClass("active");
		    $(".travel-halt-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("2");
		    $("#feePaymentStep").html("3");
			/* if(jtbTransactionTypeVal == "New"){
				
				
			}   */     
			
		}else if(otherCategoryTypeVal == "In-Bond Operators"){
			
			if(jtbTransactionTypeVal == "New"){
				
				/* $(".travel-halt-forms").removeClass('hide'); */
				
			}       
			
		}else if(otherCategoryTypeVal == "Water Sports Employees"){
			
			$(".water-sports-employee-forms .tab-pane:first").addClass("active");
		    $(".water-sports-employee-forms#side-tabs .nav-link:first").addClass("active");
		    $(".water-sports-employee-forms#side-tabs .nav-link:first").removeClass("disabled");
			
		    $("#supportingDocStep").html("3");
		    $("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				
			}   */     
			
		}else if(otherCategoryTypeVal == "Bike Rental"){
			
			$(".motor-bike-rental-forms .tab-pane:first").addClass("active");
		    $(".motor-bike-rental-forms#side-tabs .nav-link:first").addClass("active");
		    $(".motor-bike-rental-forms#side-tabs .nav-link:first").removeClass("disabled");
			
		    $("#supportingDocStep").html("3");
		    $("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				
			} */       
			
		}else if(otherCategoryTypeVal == "Places of Interest/Worship"){
			
			$(".places-of-interest-forms .tab-pane:first").addClass("active");
		    $(".places-of-interest-forms#side-tabs .nav-link:first").addClass("active");
		    $(".places-of-interest-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("3");
		    $("#feePaymentStep").html("4");
			/* if(jtbTransactionTypeVal == "New"){
				
			}   */     
			
		}else if(otherCategoryTypeVal == "Craft Traders"){
			
			$(".craft-traders-forms .tab-pane:first").addClass("active");
		    $(".craft-traders-forms#side-tabs .nav-link:first").addClass("active");
		    $(".craft-traders-forms#side-tabs .nav-link:first").removeClass("disabled");
		    
		    $("#supportingDocStep").html("2");
		    $("#feePaymentStep").html("3");
			/* if(jtbTransactionTypeVal == "New"){
				
				
			}    */    
			
		}else if(otherCategoryTypeVal == "River Rafting"){
			
			if(jtbTransactionTypeVal == "New"){
				
				/* $(".craft-traders-forms").removeClass('hide'); */
				
			}       
			
		}
	}
  }

	
function showFinalSubmitButton(){
	var currentFieldSet = $(".wizard-fieldset.show").attr("id");
	if(currentFieldSet == "jtbfeePaymentFieldset" || currentFieldSet == "jtbFormPreviewFieldset"){
        	$(".form-wizard-next-btn ").hide();
        	$(".form-wizard-save-btn").hide();
        	$(".final-submit").removeClass("hide");
        }else{
        	$(".form-wizard-next-btn").show();
        	$(".form-wizard-save-btn").show();
        	$(".final-submit").addClass("hide");
        }
}
//click on previous button
jQuery('.form-wizard-previous-btn').click(function () {
	scrollToPageTop();
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
 
 /* append Function */
 
 $("#newAccomadationOwnerName").on('input', function(){
    $(".accommodationOwnerName").html($(this).val());
});
$("#newAccomadationHotelName").on('input', function(){
	    $(".hotelName").html($(this).val());
});
$("#newAccomadationTelephone").on('input', function(){
    $(".hotelTelNo").html($(this).val());
});
$("#newAccomadationFaxNum").on('input', function(){
    $(".hotelFaxNo").html($(this).val());
});
$("#newAccomadationEmail").on('input', function(){
    $(".hotelEmailId").html($(this).val());
});
$("#newAccomadationParish").on('input', function(){
    $(".hotelParishLoc").html($(this).val());
});
$("#newAccomadationAddress").on('input', function(){
    $(".hotelAddress").html($(this).val());
});
 
$("#newAccomadationHotelBedroom").on('input', function(){
    $(".bedroomNo").html($(this).val());
});
$("#accomadationHotelOwner").on('input', function(){
    $(".hotelOwner").html($(this).val());
});
$("#newAccomadationHotelAddress").on('input', function(){
    $(".ownerAddress").html($(this).val());
});
$("#accomadationHotelLaws").on('input', function(){
    $(".ownerCompanyLaw").html($(this).val());
});
$("#newAccomadationDateCom").on('input', function(){
    $(".hotelDate").html($(this).val());
});
$("#newAccomadationHotelOperator").on('input', function(){
    $(".hotelOperaterName").html($(this).val());
});
$("#newAccomadationHotelOperatorDate").on('input', function(){
    $(".hotelOperaterName").html($(this).val());
});

$("#newHotelAccomadationAddress").on('input', function(){
    $(".ownerAddress1").html($(this).val());
});
$("#newAccomadationHotelCompanylaws").on('input', function(){
    $(".ownerCompanyLaw1").html($(this).val());
});
$("#newAccomadationHotelOperatorDate").on('input', function(){
    $(".sinceDate").html($(this).val());
});
$("#newAccomadationDate").on('input', function(){
    $(".hotelOpenDate").html($(this).val());
});

/* non-hotel append Function */
 $("#accommodationNonHotelOperater").on('input', function(){
    $(".nonHotelOperater").html($(this).val());
});
$("#newHotelAccomadationFromDate").on('input', function(){
    $(".hotelFrom").html($(this).val());
});
$("#newHotelAccomadationToDate").on('input', function(){
    $(".dateTo").html($(this).val());
});
$("#newAccomadationSince").on('input', function(){
    $(".dateSince").html($(this).val());
});
$("#nonHotelAccomadationOwnerName").on('input', function(){
    $(".nonHotelOwnerName").html($(this).val());
});

/* attraction-data-append */
   
$("#newAttractionsOwnerName").on('input', function(){
    $(".attractionsOwnerName").html($(this).val());
});
/* $("#newAttractionsLocation").on('input', function(){
    $(".locationAttraction").html($(this).val());
}); */
$("#newAttractionsMailingEmail").on('input', function(){
    $(".mailingAddress").html($(this).val());
});
/* $("#newAttractionsTelephone").on('input', function(){
    $(".telephoneAttractionNew").html($(this).val()); 
}); */
$("#newAttractionsFaxNum").on('input', function(){
    $(".faxNo").html($(this).val());
});
/* $("#newAttractionsEmailAddress").on('input', function(){
    $(".emailAddress").html($(this).val());
}); */
$("#newAttractionsEmployeesNum").on('input', function(){
    $(".employeesNo").html($(this).val());
});
$("#newAttractionsParish").on('input', function(){
    $(".parishLoc").html($(this).val());
});
$("#newAttractionsGenOwnerName").on('input', function(){
    $(".ownerNameAttraction").html($(this).val());
});
$("#newAttractionsCompanyLaw").on('input', function(){
    $(".companyNameAttraction").html($(this).val());
});
$("#newAttractionsDate").on('input', function(){
    $(".dateAttraction").html($(this).val());
});
$("#newAttractionsName").on('input', function(){
    $(".attractionName").html($(this).val());
});
$("#newAttractionsStartDate").on('input', function(){
    $(".datesinceAttraction").html($(this).val());
});
$("#newAttractionsSituatedLand").on('input', function(){
    $(".attractionAcresLand").html($(this).val());
});
$("#newAttractionsActivities").on('input', function(){
    $(".attractionOffers").html($(this).val());
});

/* car-rental */
$("#newCarRentalApplicantName").on('input', function(){
    $(".declaration-by").html($(this).val());
});
/* domestic-tour */
 $("#domesticTourApplicantName").on('input', function(){
    $(".domesticApplicantName").html($(this).val());
});
 
/* travel-halt */
$("#travelHaltApplicantName").on('input', function(){
    $(".haltApplicantName").html($(this).val());
});
$("#travelHaltLocation").on('input', function(){
    $(".haltLocation").html($(this).val());
});

 
/* Place of interest */
 
 $("#nameOfInterestLocation").on('input', function(){
    $(".namePlaceOfInterest").html($(this).val());
});
$("#placeInterestOwnerName").on('input', function(){
    $(".managerName").html($(this).val());
});
$("#placeOfInterestLocation").on('input', function(){
    $(".worshipLocation").html($(this).val());
});
$("#placeOfInterestMailing").on('input', function(){
    $(".worshipMailingAddress").html($(this).val());
});
$("#placeOfInterestTelephone").on('input', function(){
    $(".telNoOfplaces").html($(this).val());
});
$("#placeOfInterestFaxNum").on('input', function(){
    $(".faxNoOfInteres").html($(this).val());
});
$("#placeOfInterestEmail").on('input', function(){
    $(".emailOfInteres").html($(this).val());
});
$("#placeOfInterestEmployeesNo").on('input', function(){
    $(".employeesNoPlaces").html($(this).val());
});
$("#placeOfInterestParish").on('input', function(){
    $(".parishLocationWorship").html($(this).val());
});
$("#placeOfInterestOwnerName").on('input', function(){
    $(".ownerNameOfWorship").html($(this).val());
});
$("#placeOfInterestHotelLaws").on('input', function(){
    $(".companyIncorporatedLaw").html($(this).val());
});
$("#placeOfInterestDate").on('input', function(){
    $(".worshipDate").html($(this).val());
});
/* $("#placeOfInterestName").on('input', function(){
    $(".parishLocationWorship").html($(this).val());
}); */
$("#placeOfInterestOperatingSince").on('input', function(){
    $(".operatingSinceDate").html($(this).val());
});   
$("#placeOfInterestAcresLand").on('input', function(){
    $(".landOfAcresPlaces").html($(this).val());
});

/* bike-rental */
$("#motorBikeApplicantName").on('input', function(){
    $(".applicantBikeName").html($(this).val());
});

/* water sport employee */
$("#waterSportTimePeriod").on('input', function(){
    $(".timePeriod").html($(this).val());
});

/* water sport operator */
$("#waterSportOpinsuranceAmount").on('input', function(){
    $(".sportInsuranceAmount").html($(this).val());
});

/* contract-carriage */
$("#newContractOwnerName").on('input', function(){
    $(".contractOwnerName").html($(this).val());
});
 
$('input[type=radio][name=nationalsOperation]').change(function() {
    if (this.value == 'Yes') {
        $("#other-copy, #otherCopyPre").removeClass("hide");
    }
    else{
    	$("#other-copy, #otherCopyPre").addClass("hide");
    }
});

$('input[type=radio][name=breathing]').change(function() {
    if (this.value == 'Yes') {
        $("#name-details, #name-detailsPreview").removeClass("hide");
    }
    else{
    	$("#name-details, #name-detailsPreview").addClass("hide");
    }
});

$('input[type=radio][name=permitApplied]').change(function() {
    if (this.value == 'Yes') {
        $("#date-application, #date-applicationPre").removeClass("hide");
    }
    else{
    	$("#date-application, #date-applicationPre").addClass("hide");
    }
});

$("#accommodationHotelEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#hotelLicenceTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#accommodationDeclarationEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#generalDeclarationsTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#accommodationNonHotelEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#nonHotelLicenceTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#licenceRequirementEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#licenceRequirementTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#accommodationGeneralDeclarationEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#generalDeclarationNonHotelTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#accommodationHomeStayEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#homeStayLicenceTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#attractionLicenceEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#attractionLicenceTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});	
$("#attractionGeneralDeclarationEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#generalDeclarationAttractionTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#carRentalEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#carRentalTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#carRentalConditionsEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#generalDeclarationCarRentalTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#contractCarriageEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#contractCarriageTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#contractCarriageDeclarationEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#contractCarriageGeneralTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#motorBikeRentalEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#bikeRentalTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#bikeRentalConditionEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#bikeRentalConditionTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#domesticTourEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#domesticTourTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#domesticTourServicesEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#domesticServicesTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#travelHaltEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#travelHaltTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#travelHaltOfferedEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#travelHaltOfferedTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#placesOfInterestEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#placeInterestTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#placesOfInterestGeneralEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#placeInterestGeneralTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#travelAgencyEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#travelAgencyRegTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#carftTradersEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#craftTradersTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#waterSportsOperatorEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#waterSportsLicenceTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#waterSportDeclarationEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#waterSportsLicenceGeneralTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#waterSportsRequirementEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#waterSportsLicenceRequirementTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#waterSportEmployeeEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#waterSportEmpTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
$("#waterSportEmployeesGeneralEditTab").click(function(){
	   $('#jtbFormPreviewFieldset').removeClass("show");
	   $('#jtbFormsFieldset').addClass("show", "400");
	   $(".form-wizard-next-btn ").show();
	   $(".form-wizard-save-btn").show();
	   $(".final-submit").addClass("hide");
	   $(".final-submit-container").addClass("hide");
	   $("#waterSportEmpGeneralTab").trigger("click");
	   $(".form-section").addClass("active");
	   $(".rm, .form-section").removeClass("activated");
	   $(".last-step").removeClass("activated");
	   $(".last-step").removeClass("active");
	   scrollToPageTop();
	});
	
$("#supporting-doc-edit-tab").click(function(){
	$('#jtbFormPreviewFieldset').removeClass("show");
	$('#jtbSupportingDocumentFieldset').addClass("show", "400");
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
	$('#jtbFormPreviewFieldset').removeClass("show");
	$('#jtbfeePaymentFieldset').addClass("show", "400");
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
	
 
 
  /* next-form */
  function applicantInfo(){
		nextForm();
		pendingJTBApplication();
	}
	function nextForm(){
		var $active = $('.nav-tabs li>.active');
		$active.parent().next().find('.nav-link').removeClass('disabled');
		$active.parent().next().find('.nav-link span').removeClass('gray');
		nextTab($active);
		const formSections = document.getElementsByClassName('form-wizard');
	    for (const formSection of formSections) {
		 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
		 }
	}
	function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();
	}
	 function openSaveToDraftPopupJtb() {
		$(".savecountinuePopup").modal("show");
		saveToDraft();
		jtbApplicatonType = $("#jtbApplicationType").val();
		accommodationSubCategoryTypeBox = $("#accommodationCategoryTypeVal").val();
		attractionSubCategoryTypeBox = $("#attractionCategoryTypeVal").val();
		jtbTransactionTypeBox =$("#jtbTransactionTypeVal")
		otherCategoryType = $("#otherCategoryTypeVal").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		
		
		jtbApplicationTypeVal = $("#jtbApplicationType").val();
		
		if(jtbApplicationTypeVal == "Accommodations Licence"){
			accommodationCategoryType = $("#accommodationCategoryTypeVal").val();
			
			if(accommodationCategoryType == "Hotels"){
				
				 currentFormToSaveAccHotel = $("#jtbFormsFieldset .hotel-accomadation-forms#side-tabs").find(".active span:nth-child(2)").text();
				 if(currentFormToSaveAccHotel == "Hotel Licence"){
					 addAccoHotelLicenceDetail(true);
				 }else if(currentFormToSaveAccHotel == "General Declarations"){
					 addAccoGenDeclarationDetail();
					/*  uploadDocuments('address-of-directors',"Hotel Licence Certificate Issued","The attached list shows the names and addresses of all the Directors of the company");
		             uploadDocuments('public-laws',"Hotel Public Health Law","The attached certificate issued under the Public Health Law is to the best of my knowledge in full force and effect");
		             uploadDocuments('applicantSignatureHotelBtn',"Hotel Signature Of Applicant","");
		             uploadDocuments('managerSignatureHotelBtn',"Hotel Signature Of Manager",""); */
				 }
				
			}else if(accommodationCategoryType == "Resort Cottages"){
				currentFormToSaveAccResort = $("#jtbFormsFieldset .non-hotel-accomadation-forms#side-tabs").find(".active span:nth-child(2)").text();
				if(currentFormToSaveAccResort == "Resort Cottages Licence"){
					 addAccoNonHotelLicence(true);
				}else if(currentFormToSaveAccResort == "Licence Requirement"){
					addAccoNonHotelRequiredLic();
			    }else if(currentFormToSaveAccResort == "General Declarations"){
			    	addAccoNonHotelGenDec();
					uploadDocuments('nonHotelAddress',"Non Hotel Attached List","The attached list show the names and addresses of all the Directors, of all or any companies connected with the Non-Hotel Accommodation as owner, manager or operator");
					uploadDocuments('signatureNonHotelBtn',"Resort Signature of Applicant");
			    }
			}else{
				currentFormToSaveAccHomeStay = $("#jtbFormsFieldset .home-stay-accomadation-forms#side-tabs").find(".active span:nth-child(2)").text();
				if(currentFormToSaveAccHomeStay == "Home Stay Licence"){
					addAccoHomeStayLicence(true);
				}
			} 
		}
		/* Attraction */
		if(jtbApplicationTypeVal == "Attractions"){
			attractionCategoryType = $("#attractionCategoryTypeVal").val();
			
				currentFormToSaveAttraction = $("#jtbFormsFieldset .new-attraction-forms#side-tabs").find(".active span:nth-child(2)").text();
				 if(currentFormToSaveAttraction == "Attraction"){
					 addOperatorManagerDetail();
					 addAttractionDetailFormInfo(true);
				 }else if(currentFormToSaveAttraction == "General Declarations"){
					 addAttractionGenDeclaration();
					 uploadDocuments('attraction-address-of-directors',"Attraction Address of Directors","The attached list shows the names and addresses of all the Directors of the operating company (if applicable)");
					 uploadDocuments('applicantSignatureAttractionBtn',"Attraction Signature of Applicant","");
				 }
				
		}
		
        /* Other */
		if(jtbApplicationTypeVal == "Other Tourism Related Licences"){
			otherCategoryType = $("#otherCategoryTypeVal").val();
			
			if(otherCategoryType == "Car Rentals"){
				
				currentFormToSaveCarRental = $("#jtbFormsFieldset .new-car-rental-forms#side-tabs").find(".active span:nth-child(2)").text();
				 if(currentFormToSaveCarRental == "Car-Rental Licence"){
					 addCarRentalDetailFormInfo(true);
					 addcarRentalBranchDetail();
					 uploadDocuments('applicantSignatureCarRentalBtn',"Car Rental Signature of Applicant");
				 }else if(currentFormToSaveCarRental == "Car-Rental Conditions"){
					 addCarRentalConditionFormInfo();
				 }
				
			}else if(otherCategoryType == "Domestic Tours"){
				currentFormToSaveAccResort = $("#jtbFormsFieldset .domestic-tour-company-forms#side-tabs").find(".active span:nth-child(2)").text();
				if(currentFormToSaveAccResort == "Domestic Tour Company Licence"){
					addDomesticTourBranchDetail();
					addDomesticTourDetailFormInfo(true);
					uploadDocuments('applicantSignaturedomesticBtn',"Domestic Signature of Applicant");
				}else if(currentFormToSaveAccResort == "Services"){
					addDomesticServiceOfferedInfo();
					uploadDocuments('signatureDomesticTourBtn',"Domestic Signature Service");
					uploadDocuments('companySealDomesticTourBtn',"Domestic Company Seal");
			    }
			}else if(otherCategoryType == "Travel Agencies"){
				currentFormToSaveAgency = $("#jtbFormsFieldset .travel-agency-forms#side-tabs").find(".active span:nth-child(2)").text();
				if(currentFormToSaveAgency == "Travel Agency Registration"){
					addTravelAgencyDetails(true);
					uploadDocuments('applicantSignaturetravelAgencyBtn',"Travel Agency Applicant Sign");
				}
		}else if(otherCategoryType == "Water Sports Operators"){
			currentFormToSaveOperator = $("#jtbFormsFieldset .water-sports-operator-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveOperator == "Watersports Operator's Licence"){
				addWaterSportsFormInfo(true);
				uploadDocuments('evidenceOwnershipWater',"Water Evidence of Ownership","");
				uploadDocuments('rentReceiptWater',"Water Rent Receipt","");
				uploadDocuments('letterOwnerWater',"Water Letter from Owner","");
				uploadDocuments('contractLeaseWater',"Water Contract of Lease","");

			}else if(currentFormToSaveOperator == "General Declarations"){
				addWaterSportsSecondFormInfo();
				uploadDocuments('employees-document',"Watersports Employee Doc");
				uploadDocuments('applicantSignatureWaterSportBtn',"Watersports Signature of Owner");
				uploadDocuments('employees-document',"Watersports Signature of Manager");
		    }else if(currentFormToSaveOperator == "Watersports Requirements"){
		    	 addWaterSportsRequirementsInfo();
		    }
		}else if(otherCategoryType == "Contract Carriage"){
			currentFormToSaveCarriage = $("#jtbFormsFieldset .contract-carriage-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveCarriage == "Contract Carriage Operator"){
				addContractVehicleRegisterDetail();
				addContractDriverListDetail();
				contractCarriageDetailFormInfo(true);
			}else if(currentFormToSaveCarriage == "General Declarations"){
				contractCarriageGeneralDeclareInfo();
				uploadDocuments('ownerSignatureHotelBtn',"Carriage Signature of Owner Operator");
		    }
		}else if(otherCategoryType == "Travel Halts"){
			currentFormToSaveHalt = $("#jtbFormsFieldset .travel-halt-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveHalt == "Travel Halt Application"){
				 addtravelHaltDetailFormInfo(true);
				 uploadDocuments('applicantSignaturetravelHaltBtn',"Travel Halt Signature of Applicant");
			}else if(currentFormToSaveHalt == "Travel Halt Offered"){
				 addTravelHaltOfferedInfo();
		    }
		}else if(otherCategoryType == "Water Sports Employees"){
			currentFormToSaveEmployee = $("#jtbFormsFieldset .water-sports-employee-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveEmployee == "Watersports Employee's Licence"){
				addWaterSportsEmployeeFormInfo(true);
			}else if(currentFormToSaveEmployee == "General Declarations"){
				 addWaterSportsEmployeeGeneralDeclareInfo();
					uploadDocuments('applicantSignatureWaterSportEmployeeBtn',"Water Sport Signature of Employee");
					uploadDocuments('applicantStampWaterSportEmployeeBtn',"Superintendent of Police");
					uploadDocuments('cpr-copy',"Copy of CPR");
					uploadDocuments('justicePeaceLetter',"Justice Peace Letter");
		    }
		}else if(otherCategoryType == "Bike Rental"){
			currentFormToSaveBikeRental = $("#jtbFormsFieldset .motor-bike-rental-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveBikeRental == "Motor Bike Rental Company Licence"){
				addMotorBikeDetailFormInfo(true);
				uploadDocuments('applicantSignatureMotorBtn',"Bike Rental Signature of Applicant");
			}else if(currentFormToSaveBikeRental == "Conditions Proposed for Motor Bike Rental"){
				 addMotorBikeCOnditionProposedInfo();
		    }
		}else if(otherCategoryType == "Places of Interest/Worship"){
			currentFormToSavePlaceofInterest = $("#jtbFormsFieldset .places-of-interest-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSavePlaceofInterest == "Place of Interest/ Places of Worship Approval"){
				addPlaceOfInterestDetailFormInfo(true);
			}else if(currentFormToSavePlaceofInterest == "General Declarations"){
				addPlaceOfInterestGeneralDeclaration();
				uploadDocuments('address-of-directors-company',"Place Address of Directors","The attached list shows the names and addresses of all the Directors of the operating company (if applicable)");
				uploadDocuments('applicantSignatureplaceOfInterestBtn',"Place Signature of Applicant","");
		    }
		}else{
			currentFormToSaveCraft = $("#jtbFormsFieldset .craft-traders-forms#side-tabs").find(".active span:nth-child(2)").text();
			if(currentFormToSaveCraft == "Craft Traders Permit"){
				addCraftTradersPermitInfo(true);
			}
		} 
			
	}
		if(currentStage == "SUPPORTING DOCUMENTS"){
			 jtbGenericDocuments("Generic Documents");
		   }
		   if(currentStage=="APPLICATION FEES PAYMENT"){
			      submitFeeDetailsInJtb();
			  }

}
		
	function finalSubmitJtbApp() {
		$(".final-submit-container").removeClass("hide");
		submitJTBApplication();
	}
		
		
    $("#makePayment").click(function () {
 	  $("#paymentPopUp").modal("show");
 	});

   $("#jtb-credit-card-method").click(function () {
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
   

	$("#jtb-payment-upload" ).change(function() {
		selectedfiles = this.files[0].name;
		$("#jtb-payment-file-chosen").html(selectedfiles);
		$(".fee-msg").removeClass("hide");
	});
	$("#payment-method-wrapper a").click(function(){
	    oldPaymentProof = $("#paymentMethod").val();
	    selectedPaymentProof = $(this).find(".wizard-title").html();
	    $(".fee-method-preview").html(selectedPaymentProof);
	   	$("#paymentMethod").val($(this).find(".wizard-title").html());
	    if(selectedPaymentProof != oldPaymentProof){
	        $(".fee-payment-wrapper #jtb-payment-file-chosen").empty();
	        $("#amountPaid, #amountCurrency").val("");
	        $(".fee-payment-wrapper #jtb-payment-upload").val('');
	    }
	});
	
	function expandDetails(id){
  	    var currentIsActive = $("#"+id).hasClass('is-active');
  	    $("#"+id).removeClass('is-active');
  	    $("#"+id).next('.accordion__body').removeClass('is-active');
  	    if (currentIsActive != 1) {
  	        $("#"+id).addClass('is-active');
  	        $("#"+id).next('.accordion__body').addClass('is-active');
  	    }
	}
	/* PAYMENT SUBMISSION */
	function submitFeeDetailsInJtb(){
		   jtbApplicationId=$("#jtbApplicationId").val();
		    paymentMethod = $("#paymentMethod").val();
		    paymentFee = $("#paidAmount").val();
		    amountPaid=$("#amountPaid").val();
		    amountCurrency=$("#amountCurrency").val();
		    if(paymentMethod=="Credit Card"){
			    $.ajax({
			        type: "POST",
			        url: '${jtbFeeDetailsUrl}',
			        data: {
			          "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
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
				     var fileID = 'jtb-payment-upload';
			   		$.ajaxFileUpload({
			   		    secureuri: false,
			   		    method: "POST",
			   		    url: "${jtbFeeDetailsUrl}",
			   		    fileElementId: 'jtb-payment-upload',
			   		    dataType: 'text',
			   		    data: {
			   		      "<portlet:namespace/>fileID": fileID,
			   		      "<portlet:namespace/>command": "fileUpload",
			   		   	  "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
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
	
	function downloadPDF() {
		jtbApplicationId=$("#jtbApplicationId").val();
		checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${jtbDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        if (result && result["fileUrl"]) {
                        $("#jtbDownloadPDF").attr("href", result["fileUrl"]);
                        $("#jtbDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                        }},
                error: function(data) {},
        });
    }
	function jtbGenericDocuments(folderName) {
		jtbApplicationId=$("#jtbApplicationId").val();
		var fileID = 'jtbGenericUpload';
		 var fileInput = $("#" + fileID)[0]; // File input element
 	    var fileLength = fileInput.files.length; // Count of selected files
 	   var saveAndConCheck = $("#saveAndConCheck").val();
		
 	// Decide what to send to the backend
	    var fileData = fileLength > 0 ? fileID : "0";

	    // Show loader
	    $("#jtbFormPreviewFieldset .custom_loader").removeClass("hide");
	    $(".preview-section").addClass("hide");
		$
				.ajaxFileUpload({
					secureuri : false,
					method : "POST",
					fileElementId : 'jtbGenericUpload',
					url : '${uploadGenericDocumentsUrl}',
					dataType : 'text',
					data : {
						"<portlet:namespace/>folderName" : folderName,
						"<portlet:namespace/>fileID" : fileID,
						"<portlet:namespace/>command" : "fileUpload",
						"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						"<portlet:namespace/>saveAndConCheck": saveAndConCheck,

					},
					success : function(data) {
					      $(".additionalDocPreviewOne, #additionalDocPreview").html("");
		                
						  try{
		    	                var parsedData = typeof data === "string" ? JSON.parse(data) : data;
		        	            var jsonArrayLength=parsedData.JSON_LENGTH;
		        	            var uniqueArray = parsedData.fileData;
		        	           var responseData = uniqueArray.filter((value, index, self) =>
		        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
		        	        );

		        	            }catch(error){}
		                if (jsonArrayLength > 0) {
		               		var counter = 1;
							$.each(responseData,function(key,entry){
								
									var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
				                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
				                    $('#additionalDocPreview').append(documentContainerPreview);		
				                    counter++; 
				                    $(".noAdditionalSupportingDoc").addClass("hide");
							});
						}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
						}
						$("#jtbFormPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
					},
					error : function(data, status, e) {
					}
				});
	}
	 function renewLicense() {
			$("#accomodation-homestay-renew-btn").attr("disabled", "disabled");
	        $("#renewLicenseNumbervalidation").addClass("hide");
	        licenseNumber = $("#operatorNumber").val();
	        typeOfApplication=$("#jtbApplicationType").val();
			accommodationCategoryTypeValAccomodation=$("#accommodationCategoryTypeVal").val();
			otherCategoryTypeVal=$("#otherCategoryTypeVal").val();
			selectedAttractionCategory = [];
			$("#attractionSubCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedAttractionCategory.push($(this).html());
			});
			attractionCategoryTypeVal = selectedAttractionCategory.toString();
	        
	       
	        $.ajax({
	                type: "POST",
	                url: '${renewLicenseUrl}',
	                data: {
	                        "<portlet:namespace/>licenseNumber":licenseNumber,
	                        "<portlet:namespace/>typeOfApplication":typeOfApplication,
	                        "<portlet:namespace/>accommodationCategoryTypeValAccomodation":accommodationCategoryTypeValAccomodation,
	                        "<portlet:namespace/>otherCategoryTypeVal":otherCategoryTypeVal,
	                        "<portlet:namespace/>attractionCategoryTypeVal":attractionCategoryTypeVal,
	                },
	                success: function(data) {
	                	var result = data.APP_DATA;
	                	var renewLicenseUrl=result["renewLicenseUrl"];
	                	var validation=result["licenseNumberCheck"];
	                        if (validation == 0) {
	                                $("#renewLicenseNumbervalidation").removeClass("hide");
	                                $("#accomodation-homestay-renew-btn").removeAttr("disabled"); 
									$("#operatorNumber").focus();
	                        }else{
	                        	window.location.href = renewLicenseUrl;
	                        }
	                },
	                error: function(data) {}
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
		        $('#jtbGenericUpload')[0].files = newFileList.files;
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

		    $(document).on('change', '#jtbGenericUpload', function () {
		        var files = $(this)[0].files;
		        var newFiles = [];

		        for (var i = 0; i < files.length; i++) {
		        	// Extract all generic document names as an array
		            var selectedGenericFiles = $(".generic-document-list")
		                .find("#document-name")
		                .map(function () {
		                    return $(this).html(); // Extract each name as a string
		                })
		                .get();

		            // Check if the current file exists in selectedGenericFiles
		            var genericFileExists = selectedGenericFiles.some(function (genericFile) {
		                return genericFile === files[i].name; 
		            });
		            
		            var fileExists = selectedFiles.some(function (file) {
		                return file.name === files[i].name;
		            });
		            var jtbApplicationId = "<%=jtbApplicationId%>";
		        	if(jtbApplicationId > 0 ){
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

		        // Show or hide elements based on files
		        if (selectedFiles.length > 0) {
		            $('.uploaded-delete').show();
		            $(".noAdditionalSupportingDoc").hide();
		            $(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		            $("#jtbFormPreviewFieldset .custom_loader").removeClass("hide");
		            $(".preview-section").addClass("hide");
		        } else {
		        	if($(".generic-document #uploaded-documents-container").find(".document-container").length == 0 && $(".generic-document").find(".supporting-document-card").length == 0){
		            $('.uploaded-delete').hide();
		            $(".noAdditionalSupportingDoc").show();
		            $(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		            $("#jtbFormPreviewFieldset .custom_loader").addClass("hide");
		            $(".preview-section").removeClass("hide");
		        	}
		        }
		    });
		});
	 
	 
	 function deleteDoc(id) {
		    var currentId = id;
			$(".document-container-preview"+id).remove();
		}
	 
	 /* function naveTabCount(){
		 var j = 1;
		 $(".side-tab-count").find(".nav-item").each(function() {
		     var $next = $(this);
		     if (!$next.hasClass('hide')) {
		         var $link = $next.find("a");
		         var $stepType = $link.find('.step-type');
		         if ($stepType.length > 0) {
		             $stepType.html(j);
		             j++;
		         } else {
		         }
		     }
		 });
		var i = 1;
		$(".side-tab-pre-count").find(".nav-item").each(function() {
		    var $nextPre = $(this);
		     if (!$nextPre.hasClass('hide')) {
		         var $linkPre = $nextPre.find("a");
		         var $stepTypePre = $linkPre.find('.step-type');
		         if ($stepTypePre.length > 0) {
		             $stepTypePre.html(i);
		             i++;
		         } else {
		         }
		     }
		});
	  } */
</script>