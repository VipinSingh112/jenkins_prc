<%@ include file="/init.jsp" %>
<%@ include file="/sez-status-wizard.jsp" %>
<jsp:include page="/js/sez-development-application-js.jsp" />
<jsp:include page="/sez-status-consultancy-final-popup.jsp" />
<jsp:include page="/js/sez-occupant-application-js.jsp" />
<jsp:include page="js/sez-zone-user-application-js.jsp" />
<jsp:include page="js/common-js.jsp" />
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<link  href="<%= themeDisplay.getPathThemeCss()%>/vendors/select2.min.css" rel="stylesheet" />
<script type="text/javascript" data-senna-track="permanent" src="<%= themeDisplay.getPathThemeJavaScript()%>/plugins/select2.min.js"></script>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<style>
	.schedule-meeting-box li{
		list-style: decimal !important;
	}
</style>

<div class="modal fade commonsavepopup savecountinuePopup"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-pic">
				 <img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" />
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="col-md-12">
						<p class="modal-title f1">Application saved as draft</p>
						<p class="modal-subtitle f2">Your application for a
							SEZ Status has been correctly saved as draft.</p>
						<p class="modal-info f2">
							You will be able to continue your application process at any
							moment. You can find the draft in <a
								href="/group/guest/dashboard">your Dashboard:</a>
						</p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box ml-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 90 90" fill="none">
												<path opacity="0.3" d="M38 61.96V16.4L42.7458 13.68H63.0847L74.6102 13L78 19.8V42.24V50.4V55.84L74.6102 64H44.1017L38 61.96Z" fill="#0C8D5A"></path>
												<path opacity="0.3" d="M12 74.3333V29.6667L16.7419 27H37.0645L39.0968 52.3333V59L41.129 62.3333H54V69.6667L49.2581 77.6667L16.7419 79L12 74.3333Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M42.5 10C38.358 10 35 13.3579 35 17.5V25H17.5C13.3579 25 10 28.3579 10 32.5V72.5C10 76.642 13.3579 80 17.5 80H47.5C51.642 80 55 76.642 55 72.5V65H72.5C76.642 65 80 61.642 80 57.5V17.5C80 13.3579 76.642 10 72.5 10H42.5ZM50 65H42.5C38.358 65 35 61.642 35 57.5V30H17.5C16.1193 30 15 31.1193 15 32.5V72.5C15 73.8805 16.1193 75 17.5 75H47.5C48.8805 75 50 73.8805 50 72.5V65ZM40 17.5C40 16.1193 41.1195 15 42.5 15H72.5C73.8805 15 75 16.1193 75 17.5V57.5C75 58.8805 73.8805 60 72.5 60H42.5C41.1195 60 40 58.8805 40 57.5V17.5Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M45 27.5C45 26.1193 46.1195 25 47.5 25H67.5C68.8805 25 70 26.1193 70 27.5C70 28.8807 68.8805 30 67.5 30H47.5C46.1195 30 45 28.8807 45 27.5Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M45 37.5C45 36.1195 46.1195 35 47.5 35H57.5C58.8805 35 60 36.1195 60 37.5C60 38.8805 58.8805 40 57.5 40H47.5C46.1195 40 45 38.8805 45 37.5Z" fill="#0C8D5A"></path>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">SEZ Status
												Transaction Number</p>
											<p class="licence-number f2" id="pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Category/ Sub Category</p>
										<p class="tier-box-upper f2" id="pop_category"></p>
									</div>
								</div>
								<div class="col-lg-3 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="" class="draftlink f2" id="pop_status">Draft</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="/home"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Go back to the Homepage
					</a>
				</div>
				<div>
					<a href="/group/guest/dashboard" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
						Continue to your dashboard<span class="ml-2"> <svg
								width="22" height="17" viewBox="0 0 22 17" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
									fill="#1B1917" />
                                <path
									d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
									fill="#1B1917" />
                                <path
									d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z"
									fill="#323232" />
                            </svg>
								<input type="hidden" id="sez-status-child-category" name="sez-status-child-category">
					</span>
					</a>
				</div>
			</div>
		</div>
	</div>
</div> 
<script>
$(document).ready(function(){
	continueApplicationForm();});	
var paymentMethodOption="<%=clickPaymentOption%>";
function showPaymentAfterSave(){
	 if (paymentMethodOption != "") {
		 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
			    if($(this).text() == paymentMethodOption){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			    	}
				  });
				$("#amountPaid").val(amount);
			 	$("#amountCurrency").val(currency).trigger("change");  	}}
//Save And Continue Functions
	function continueApplicationForm(){
	var sezStatusApplicationId = "<%=sezStatusApplicationId%>";
	if(sezStatusApplicationId > 0 ){
		showSelectedCategory(); 
		showLastFormStep();
		continueEditFormDetails();
		gettingDocumentList();
		showPaymentAfterSave();
		showPreviewInLastStage();
		showFinalButtonInLastStage();}}
	function showLastFormStep(){
		var currentStage = "<%=currentStage %>";
		$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
		    if($(this).text() == currentStage ){
		    	$(this).parents("li").addClass("active");
		    	$(this).parents("li").prevAll().removeClass("active");
		    	$(this).parents("li").prevAll().addClass("activated"); }});
		$( ".form-wizard fieldset" ).each( function( index, element ){
	        if($(this).attr("name") == currentStage ){
		    	$(this).addClass("show");
		    	$(this).prevAll().removeClass("show"); }});}
	function continueEditFormDetails(){
		var lastFormStep = "<%=lastFormStep%>";
		$( ".tab-content .tab-pane" ).each( function( index, element ){
		    if($(this).attr("id") == lastFormStep ){
		    	$(this).addClass("active");
		    	$(this).prevAll().removeClass("active");
		    	$(this).nextAll().removeClass("active");  }});
		$(".tab-plus-wizard-left li a").each( function( index, element ){
		    if($(this).attr("href") == "#"+lastFormStep ){
		    	$(this).parents().prevAll("li").find("a").removeClass("active disabled");
		    	$(this).addClass("active");
		    	$(this).removeClass("disabled");  }});}
	function showSelectedCategory(){
		debugger;
		currentStage="<%=currentStage%>";
		renew="<%=renew%>";
		sezApplicationId="<%=sezStatusApplicationId%>";
		jointVenture="<%=jointVenture%>";
		articleOfIncorporation="<%=articleOfIncorporation%>";
		existingJamaicanCompanies="<%=existingJamaicanCompanies%>";
		doYouWant="<%=doYouWant%>";
		sezStatus="<%=sezStatus%>";  
		typeOfTransaction="<%=typeOfTransaction%>";
		industries="<%=industries%>";
		directorBankRuptcy="<%=directorBankRuptcy%>";
		previouslyFreeZone="<%=previouslyFreeZone%>";
		parish="<%=parish%>";
		specialEconomicZone="<%=specialEconomicZoneValue%>";
		ownerShip="<%=ownerShip%>";
		amount="<%=amount%>";
		currency="<%=currency%>";
		applicantPreviously="<%=applicantPreviously%>";
		currentlyOperatingZone="<%=currentlyOperatingZone%>";
		existingBuilding="<%=existingBuilding%>";
		existingJamaicanCom="<%=existingJamaicanCom%>";
		occExistingOther="<%=occExistingOther%>";
		occFreeZone="<%=occFreeZone%>";
		occFreeZoneLocation="<%=occFreeZoneLocation%>";
		occOwnerShip="<%=occOwnerShip%>";
		infastructureOther="<%=infastructureOther%>";
		zoneExistingCompany="<%=zoneExistingCompany%>";
		zoneExistingCompanyOther="<%=zoneExistingCompanyOther%>";
		zoneDeniedApproval="<%=zoneDeniedApproval%>";
		zoneFreeZoneLocation="<%=zoneFreeZoneLocation%>";
		zoneSourceOfFinance="<%=zoneSourceOfFinance%>";
		occDirectorSponsorSize=<%=occDirectorSponsorSize%>;
		var occDirectorSponsorCounter="<%=occDirectorSponsorCounter%>";
		sizeOfOccupantPrincipleOfficer=<%=sizeOfOccupantPrincipleOfficer%>;
		sizeOfLocationAddBox=<%=sizeOfLocationAddBox%>;
		var counterOfOccupantPrincipleOfficer="<%=counterOfOccupantPrincipleOfficer%>";
		var sizeOfOccupantShareHoldingInfo=<%=sizeOfOccupantShareHoldingInfo%>;
		var sizeOfProjectLabour=<%=sizeOfProjectLabour%>;
		var sizeOfOccupantLocationAdd=<%=sizeOfOccupantLocationAdd%>;
		var sizeZoneEmpInfo=<%=sizeZoneEmpInfo%>;
		var sizeZoneLocationAdd=<%=sizeZoneLocationAdd%>;
		var sizeOfDevSharePrinciple=<%=sizeOfDevSharePrinciple%>;
		var sizeOfDevShareDirectorAdd=<%=sizeOfDevShareDirectorAdd%>;
		var sizeOfDevShareComDirectorShipAdd=<%=sizeOfDevShareComDirectorShipAdd%>;
		var sizeOfDevSharCorporationBusAdd=<%=sizeOfDevSharCorporationBusAdd%>;
		var sizeOfDevSharPleaseStateAdd=<%=sizeOfDevSharPleaseStateAdd%>;
		var sizeOfDevSharSafetyInfoAdd=<%=sizeOfDevSharSafetyInfoAdd%>;
		var sizeOfDevSharDefineOccuAdd=<%=sizeOfDevSharDefineOccuAdd%>;
		var sizeOfDevSharDisasterManagementAdd=<%=sizeOfDevSharDisasterManagementAdd%>;
		var sizeOfDevSharProjectAdd=<%=sizeOfDevSharProjectAdd%>;
		var sizeOfDevGenBussinessAdd=<%=sizeOfDevGenBussinessAdd%>;
		var sizeOfSezStatusWFMLocationAdd=<%=sizeOfSezStatusWFMLocationAdd%>;
		var applicationStatus="<%=applicationStatus%>";
		var controlNumberWFH="<%=controlNumberWFH%>";
		var typeOfTransactionWFH="<%=typeOfTransactionWFH%>";
		$("#paymentMethod").val(paymentMethodOption);
		$("#amountPaid").val(amount);
		$("#amountCurrency").val(currency);
		var selectedOptionText = $("#amountCurrency option:selected").text(currency);
		$("#sezStatusApplicationId").val(sezApplicationId);
		$("#sez-status-type-option-value").val(doYouWant);
		$("#sez-submit-application-type-option-value").val(sezStatus);
		if(sezStatus=="SEZ Developer"){
	    $("#sez-developer-type-option-value").val(typeOfTransaction);
	    $("#sez-dev-industry-option-value").val(industries);
		$("#sezDevParish").val(parish);
		var selectedOptionTextDev = $("#sezDevParish option:selected").text(parish);
		}else if(sezStatus=="SEZ Occupant"){
		 $("#sez-occupant-type-option-value").val(typeOfTransaction);
		 $("#sez-occu-industry-option-value").val(industries);
		 $("#sezOccuParish").val(parish);
		 var selectedOptionTextOcc = $("#sezOccuParish option:selected").text(parish);
		}else if(sezStatus=="SEZ Zone User"){
		 $("#sez-zone-type-option-value").val(typeOfTransaction);
		 $("#sez-zone-user-option-value").val(industries);
		 $("#sezZoneParish").val(parish);
		 var selectedOptionTextZone= $("#sezZoneParish option:selected").text(parish);
		}
		$("#applicantStatusVal").val(applicationStatus);
		$("#typeTransactionTypeVal").val(typeOfTransactionWFH);
		/* for Work From Home */
		if(doYouWant!=null && doYouWant =="Submit an Application for A Work From Home Certificate"){
			$("#sezApplicantStatus").removeClass("hide");
			$("#sezTransactionTypeBox").removeClass("hide");
			$(".sezWorkFromHomeApplicationFormTab").removeClass("hide");
			$("#sezWorkFromHomeApplicationForm, .sezWorkFromHomeApplicationPreview").removeClass("hide");
			$(".application-Fees, .fee-preview").addClass("hide");
			$(".application-Fees").after('<div class="first-heading"><h1 class="common-heading application-Fees">No Fee Applicable</h1></div>');
			$("#supportingDocStep").html("2");
		if(applicationStatus!=null){
			$( "#sezApplicantStatus .wizard-title" ).each( function( index, element ){
			    if($(this).text() == applicationStatus ){
			    	$(this).parents(".wizard-card").click();
			    }
			});
		}	
		if(typeOfTransactionWFH!=null){
			$( "#sezTransactionTypeBox .wizard-title" ).each( function( index, element ){
			    if($(this).text() == typeOfTransactionWFH ){
			    	$(this).parents(".wizard-card").click();
			    }
			});
		}
		if(typeOfTransactionWFH=="Renewal" || typeOfTransactionWFH=="Quarterly Report/Payment" ){
			$("#registrationCertificate").removeClass("hide");
		}
		if(sizeOfSezStatusWFMLocationAdd>0){
			var counterOfWFhAdd=parseInt(sizeOfSezStatusWFMLocationAdd)+1;
			$(".addWfhLocationDetailTableBox").removeClass("hide");
			$("#wfhLocationVal").val(counterOfWFhAdd);
		}}
		//Save and Cont Sez
		if(doYouWant!=null){
			debugger;
			$("#sez-status-type-box .wizard-title").each( function( index, element ){
			    if($(this).text() == doYouWant){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			    	}
				  });}
		if(sezStatus!=null){
			debugger;
		   if(sezStatus=="SEZ Developer"){
			   $("#sezDeveloperLevel1").addClass("active");
			   $("#sezDeveloperLevel1").click();
			   if(typeOfTransaction!= ""){
					debugger;
						$("#sezDeveloperTypeOfTransactionLevel2 .wizard-title" ).each( function( index, element ){
						    if($(this).text() == typeOfTransaction){
						    	$(this).parents(".wizard-card").click();
						    }
						});
					}
				if(industries!= ""){
					$("#sez-industries .wizard-title").each( function( index, element ){
					    if($(this).text() == industries ){
					    	$(this).parents(".wizard-card").click();
					    }
					});
				}
				if(jointVenture=="Yes"){
					debugger;
					$("#devJointVentureBox").removeClass("hide");
				}
				if(existingJamaicanCompanies=="Yes"){
					$("#devExistingComBox").removeClass("hide");
				}
				if(articleOfIncorporation=="Other"){
					$("#devFormArticleOtherBox").removeClass("hide");
				}
				if(directorBankRuptcy=="Yes"){
					$(".comDirectorBankruptInvolveBox").removeClass("hide");
				}
				if(previouslyFreeZone=="Yes"){
					$("#sezFreePreviousZoneBox").removeClass("hide");
				}
				if(currentlyOperatingZone=="Yes"){
					$(".sezFreeCurrentZoneBox").removeClass("hide");
				}
				if(specialEconomicZone=="Specialised Zone"){
					$("#applicationEconomicSpecialisedZoneBox").removeClass("hide");
				}
				if(ownerShip!=null){
					if(ownerShip=="Full Ownership"){
					$("#landOwnershipBox").addClass("hide");
				}else if (ownerShip="Other"){
					$("#otherLandOwnership").removeClass("hide");
				}
				}
				if(applicantPreviously=="Yes"){
					$("#freeZonePrmissionDeniedBox").removeClass("hide");
				}
				if(existingBuilding=="Yes"){
					$("#existingBuildingForBusiBox").removeClass("hide");
				}
				if(sizeOfDevSharePrinciple>0){
					var counterOfDevPrincipl=parseInt(sizeOfDevSharePrinciple)+1;
					$(".devShareholderDetailTableBox").removeClass("hide");
					$("#devShareholderDetailVal").val(counterOfDevPrincipl);
				}
				if(sizeOfDevShareDirectorAdd>0){
					var counterOfDevShare=parseInt(sizeOfDevShareDirectorAdd)+1;
					$(".devDirectorShareholderTableBox").removeClass("hide");
					$("#devDirectorShareholderVal").val(counterOfDevShare);
				}
				if(sizeOfDevShareComDirectorShipAdd>0){
					var counterOfDevComDirectShip=parseInt(sizeOfDevShareComDirectorShipAdd)+1;
					$(".addComDirectorTableBox").removeClass("hide");
					$("#devComDirectorVal").val(counterOfDevComDirectShip);
				}
				if(sizeOfDevSharCorporationBusAdd>0){
					var counterOfDevShareCorp=parseInt(sizeOfDevSharCorporationBusAdd)+1;
					$(".addCorporationTableBox").removeClass("hide");
					$("#devCorporationVal").val(counterOfDevShareCorp);
				}
				if(sizeOfDevSharPleaseStateAdd>0){
					var counterOfDevPleaseState=parseInt(sizeOfDevSharPleaseStateAdd)+1;
					$(".directorBankruptInvolveTableBox").removeClass("hide");
					$("#devDirectorBankruptInvolveVal").val(counterOfDevPleaseState);
				}
				if(sizeOfDevSharSafetyInfoAdd>0){
					var counterOfDevShare=parseInt(sizeOfDevSharSafetyInfoAdd)+1;
					$(".securityMeasuresTableBox").removeClass("hide");
					$("#devSecurityMeasuresVal").val(counterOfDevShare);
				}
				if(sizeOfDevSharDefineOccuAdd>0){
					var counterOfDevOccu=parseInt(sizeOfDevSharDefineOccuAdd)+1;
					$(".occuSafetySystemTableBox").removeClass("hide");
					$("#devOccuSafetySystemVal").val(counterOfDevOccu);
				}
				if(sizeOfDevSharDisasterManagementAdd>0){
					var counterOfDevDM=parseInt(sizeOfDevSharDisasterManagementAdd)+1;
					$(".disasterMitigationPlanTableBox").removeClass("hide");
					$("#disasterMitigationPlanVal").val(counterOfDevDM);
				}
				if(sizeOfDevSharProjectAdd>0){
					var counterOfShareProj=parseInt(sizeOfDevSharProjectAdd)+1;
					$(".operatingZoneLocationTableBox").removeClass("hide");
					$("#devOperatingZoneLocationVal").val(counterOfShareProj);
				}
				if(sizeOfDevGenBussinessAdd>0){
					var counterOfGenBussiness=parseInt(sizeOfDevGenBussinessAdd)+1;
					$(".devJointVentureTableBox").removeClass("hide");
					$("#devOperatingZoneLocationVal").val(counterOfGenBussiness);
				}
		   }else if(sezStatus=="SEZ Occupant"){
			   $("#sezOccupantLevel1").addClass("active");
			   $("#sezOccupantLevel1").removeClass("hide");
			   $("#sezOccupantLevel1").click();
			   $("#level-1").removeClass("hide");
			   $("#sezDevNumvalidate").addClass("hide");
			   if(typeOfTransaction!= ""){
					debugger;
					$("#sezOccupantLevel2").removeClass("hide");
						$("#occupant-type-of-transaction-box .wizard-title" ).each( function( index, element ){
						    if($(this).text() == typeOfTransaction){
						    	$(this).parents(".wizard-card").click();
						    }
						});
					}
				if(industries!= ""){
					$("#occupant-industries-check-box .wizard-title").each( function( index, element ){
					    if($(this).text() == industries ){
					    	$(this).parents(".wizard-card").click();
					    }
					});
				}
				$(".wizard-navigation-box-left").removeClass("hide");
				$(".wizard-navigation-box-right").removeClass("hide");
				if(occDirectorSponsorSize>0){
					var counterOfOccDirector=occDirectorSponsorSize+1;
					$(".occDirectorDetailTableBox").removeClass("hide");
					$("#occDirectorDetailVal").val(counterOfOccDirector);
				}
				if(sizeOfOccupantPrincipleOfficer>0){
					var counterOfOccPrincipleOfficer=parseInt(sizeOfOccupantPrincipleOfficer)+1;
					$(".occPrincipalOfficersTableBox").removeClass("hide");
					$("#occPrincipalOfficersVal").val(counterOfOccPrincipleOfficer);
				}
				if(sizeOfLocationAddBox>0){
					var counterOfOccLocation=parseInt(sizeOfLocationAddBox)+1;
					$(".occPrincipalOfficersTableBox").removeClass("hide");
					$("#occFreeZoneLocVal").val(counterOfOccLocation);
				}
				if(sizeOfOccupantShareHoldingInfo>0){
					var counterOfOccShareHolder=parseInt(sizeOfOccupantShareHoldingInfo)+1;
					$(".occDirectorShareholderTableBox").removeClass("hide");
					$("#occDirectorShareholdersVal").val(counterOfOccShareHolder);
				}
				if(sizeOfProjectLabour>0){
					var counterOfOccShareHolder=parseInt(sizeOfProjectLabour)+1;
					$(".occLabourReqTableBox").removeClass("hide");
					$("#occLabourReqVal").val(counterOfOccShareHolder);
				}
				if(sizeOfOccupantLocationAdd>0){
					var counterOfOccupantLocationAdd=parseInt(sizeOfOccupantLocationAdd)+1;
					$(".occFreeZoneLocTableBox").removeClass("hide");
					$("#occFreeZoneLocVal").val(counterOfOccupantLocationAdd);
				}
				$(".sezOccApplicationFormTab").removeClass("hide");
				$("#sezOccApplicationForm").removeClass("hide");
				$(".sezOccApplicationPreviewTab").removeClass("hide");
				$("#sezOccApplicationPreview").removeClass("hide");
				if(existingJamaicanCom=="Yes"){
					$("#occExistingComBox").removeClass("hide");
				}
				if(occExistingOther=="Other"){
					$("#occFormArticleOtherBox").removeClass("hide");
				}
				if(occFreeZone=="Yes"){
					$(".occDeniedFreeZoneApprData").removeClass("hide");
				}
				if(occFreeZoneLocation=="Yes"){
					$("#occFreeZoneLocBox").removeClass("hide");
				}
				if(occOwnerShip=="Lease"){
					$("#occLeaseYearsBox").removeClass("hide");
				}
				if(infastructureOther=="Yes"){
					$(".otherBuildUpRequirementBox").removeClass("hide");
				}$(".feeHeading").html("SEZ Occupant");
				$(".feeAmount").html("$USD 1,500.00");
				$(".sezZoneApplicationPreviewTab").addClass("hide");
		   }else if(sezStatus=="SEZ Zone User"){
			   $("#sezZoneLevel1").addClass("active");
			   $("#sezZoneLevel1").removeClass("hide");
			   $("#sezZoneLevel1").click();
			   $("#level-1").removeClass("hide");
			   $("#sezDevNumvalidate").addClass("hide");
			   if(typeOfTransaction!= ""){
					debugger;
					$("#sezZoneLevel2").removeClass("hide");
					$("#sezZoneTransactionType .wizard-title" ).each( function( index, element ){
						    if($(this).text() == typeOfTransaction){
						    	$(this).parents(".wizard-card").click();
						    }
						});
					}
				if(industries!= ""){
					$( "#sezZoneUserIndustryBox .wizard-title").each( function( index, element ){
					    if($(this).text() == industries ){
					    	$(this).parents(".wizard-card").click();
					    }
					});
				}
				$(".wizard-navigation-box-left").removeClass("hide");
				$(".wizard-navigation-box-right").removeClass("hide");
				if(sizeZoneLocationAdd>0){
					var counterOfZoneLocation=parseInt(sizeZoneLocationAdd)+1;
					$(".zoneUserFreeZoneLocTableBox").removeClass("hide");
					$("#zoneUserFreeZoneLocVal").val(counterOfZoneLocation);
				}
				if(sizeZoneEmpInfo>0){
					var counterOfEmpInfo=parseInt(sizeZoneEmpInfo)+1;
					$(".zoneUserLabourReqTableBox").removeClass("hide");
					$("#zoneUserLabourReqCounter").val(counterOfEmpInfo);
				}
				$("#sezZoneApplicationForm").removeClass("hide");	
				$(".sezZoneApplicationFormTab").removeClass("hide");	
				if(zoneDeniedApproval=="Yes"){
					$(".zoneUserDeniedFreeZoneApprData").removeClass("hide");
				}
				if(zoneFreeZoneLocation=="Yes"){
					$("#zoneUserFreeZoneLocBox").removeClass("hide");
				}
				if(zoneExistingCompany=="Yes"){
					$("#zoneUserExistingComBox").removeClass("hide");
				}
				if(zoneExistingCompanyOther=="Other"){
					$("#zoneUserFormArticleOtherBox").removeClass("hide");
				}
				if(zoneSourceOfFinance.includes("Other")){
					$("#zoneUserOtherFinanceSourceBox").removeClass("hide");
				}$("#SezStatusFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				$(".feeHeading").html("SEZ Zone User");
				$(".feeAmount").html("$USD 100.00");
		   }else  if(sezStatus=="MSME Occupant"){
			   $("#msmeOccupantLevel1").addClass("active");
			   $("#msmeOccupantLevel1").removeClass("hide");
			   $("#msmeOccupantLevel1").click();
		   }}
		if(renew=="true"){
			  if(currentStage == "TYPE OF TRANSACTION"){
				$("#typeOfSezStatus").addClass("hide");
				if(sezStatus=="SEZ Developer"){
				$("#sezDeveloperLevel2").addClass("hide");
				$("#sezRenewSection").addClass("hide");
				$("#sezDeveloperLevel3").removeClass("hide");}
				else if(sezStatus=="SEZ Occupant"){
				$("#sezOccupantLevel2").addClass("hide");
				$("#sezOccRenewSection").addClass("hide");
				$("#sezOccupantLevel3").removeClass("hide");}
				else if(sezStatus=="SEZ Zone User"){
				$("#sezZoneLevel2").addClass("hide");
				$("#sezZoneRenewSection").addClass("hide");
				$("#sezZoneUserLevel3").removeClass("hide");}}
			  else if(currentStage == "APPLICATION FORM DETAILS"){
				if(sezStatus=="SEZ Developer"){
					$("#dev-general-list-info-tab").click();}}}}
</script>