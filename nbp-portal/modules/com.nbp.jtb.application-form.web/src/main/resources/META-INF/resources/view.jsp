<%@ include file="/init.jsp" %>
<%@ include file="/jtb-wizard.jsp" %>
<%-- <%@ include file="/js/jtb-licence-js.jsp" %> --%>
<jsp:include page="/js/jtb-licence-js.jsp"/>
<jsp:include page="/jtb-popup.jsp"/>
<link  href="<%= themeDisplay.getPathThemeCss()%>/vendors/select2.min.css" rel="stylesheet" />
<script type="text/javascript" data-senna-track="permanent" src="<%= themeDisplay.getPathThemeJavaScript()%>/plugins/select2.min.js"></script>

<portlet:resourceURL var="gettingDocumentList" id="getting/Document/List/Url"></portlet:resourceURL>
<portlet:resourceURL var="jtbDoucumentsUpload" id="/jtb/Doucuments/Upload/Url"></portlet:resourceURL>
<portlet:resourceURL var="deletedocumentUrl" id="/delete/document/Url"></portlet:resourceURL>
<portlet:resourceURL var="pendingApplicaiton" id="/pending/Applicaiton/Url"></portlet:resourceURL>
<portlet:resourceURL var="submitApplicaiton" id="/submit/Applicaiton/Url"></portlet:resourceURL>
<portlet:resourceURL var="draftApplicaiton" id="/save/To/Draft"></portlet:resourceURL>
<portlet:resourceURL var="delteDocAferSaveconUrl" id="delte/doc/afer/save/con"></portlet:resourceURL>


<div class="modal fade commonsavepopup savecountinuePopup" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
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
                        <p class="modal-subtitle f2">Your application for TPDCo has been correctly saved as draft.</p>
                        <p class="modal-info f2">
                            You will be able to continue your application process at any moment. You can find the draft
                            in
                            <a href="/group/guest/dashboard">your Dashboard:</a>
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="cards-wrapper">
                            <div class="row">
                                <div class="col-lg-5 d-flex justify-content-center">
                                    <div class="licence-box ml-2">
                                        <div class="left">
                                        <svg width="32" height="40" viewBox="0 0 220 220"
											fill="none" xmlns="http://www.w3.org/2000/svg">
                                                <path
											d="M16.3281 55.9883V66.2148C21.0117 66.2148 24.793 69.9961 24.793 74.6797C24.793 79.3633 21.0117 83.1445 16.3281 83.1445V89.8047C21.0117 89.8047 24.793 93.5859 24.793 98.2695C24.793 102.953 21.0117 106.734 16.3281 106.734V113.395C21.0117 113.395 24.793 117.176 24.793 121.859C24.793 126.543 21.0117 130.324 16.3281 130.324V136.984C21.0117 136.984 24.793 140.766 24.793 145.449C24.793 150.133 21.0117 153.914 16.3281 153.914V164.141H203.672V55.9883H16.3281ZM78.2031 147.812H46.2773C44.6016 147.812 43.2695 146.48 43.2695 144.805C43.2695 143.129 44.6016 141.797 46.2773 141.797H78.2031C79.8789 141.797 81.2109 143.129 81.2109 144.805C81.2109 146.48 79.8789 147.812 78.2031 147.812ZM78.2031 124.609H46.2773C44.6016 124.609 43.2695 123.277 43.2695 121.602C43.2695 119.926 44.6016 118.594 46.2773 118.594H78.2031C79.8789 118.594 81.2109 119.926 81.2109 121.602C81.2109 123.277 79.8789 124.609 78.2031 124.609ZM78.2031 101.406H46.2773C44.6016 101.406 43.2695 100.074 43.2695 98.3984C43.2695 96.7227 44.6016 95.3906 46.2773 95.3906H78.2031C79.8789 95.3906 81.2109 96.7227 81.2109 98.3984C81.2109 100.074 79.8789 101.406 78.2031 101.406ZM78.2031 78.2031H46.2773C44.6016 78.2031 43.2695 76.8711 43.2695 75.1953C43.2695 73.5195 44.6016 72.1875 46.2773 72.1875H78.2031C79.8789 72.1875 81.2109 73.5195 81.2109 75.1953C81.2109 76.8711 79.8789 78.2031 78.2031 78.2031ZM101.836 152.109C101.836 153.785 100.504 155.117 98.8281 155.117C97.1523 155.117 95.8203 153.785 95.8203 152.109V137.543C95.8203 135.867 97.1523 134.535 98.8281 134.535C100.504 134.535 101.836 135.867 101.836 137.543V152.109ZM101.836 128.906C101.836 130.582 100.504 131.914 98.8281 131.914C97.1523 131.914 95.8203 130.582 95.8203 128.906V114.34C95.8203 112.664 97.1523 111.332 98.8281 111.332C100.504 111.332 101.836 112.664 101.836 114.34V128.906ZM101.836 105.66C101.836 107.336 100.504 108.668 98.8281 108.668C97.1523 108.668 95.8203 107.336 95.8203 105.66V91.0937C95.8203 89.418 97.1523 88.0859 98.8281 88.0859C100.504 88.0859 101.836 89.418 101.836 91.0937V105.66ZM101.836 82.457C101.836 84.1328 100.504 85.4648 98.8281 85.4648C97.1523 85.4648 95.8203 84.1328 95.8203 82.457V67.8906C95.8203 66.2148 97.1523 64.8828 98.8281 64.8828C100.504 64.8828 101.836 66.2148 101.836 67.8906V82.457ZM187.387 80.6523L186.57 89.2461C186.398 90.9219 185.582 92.5117 184.25 93.5859L175.613 100.719L187.215 130.496L181.113 136.598L158.984 114.469L147.898 123.621L153.527 143.344L150.477 146.395L136.082 132C134.191 132.215 132.215 131.613 130.797 130.152C129.336 128.734 128.734 126.758 128.949 124.867L114.555 110.473L117.605 107.422L137.328 113.051L146.48 101.965L124.352 79.8359L130.453 73.7344L160.23 85.3359L167.363 76.7422C168.438 75.4102 170.027 74.5938 171.703 74.4648L180.297 73.6484C184.379 73.2617 187.73 76.6133 187.387 80.6523Z"
											fill="#047247" />
                                          </svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">TPDCo<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Sub Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Status
                                        </p>
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
                <div><a href="/home" class="text-dark common-nav-links text-white popup-home hidePopup">
                        <span class="mr-2"><svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
                            </svg>
                        </span>Go back to the Homepage</a>
                </div>
                <div>
                    <a href="/group/guest/dashboard" data-senna-off="true" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
                        Continue to your dashboard<span class="ml-2">
                            <svg width="22" height="17" viewBox="0 0 22 17" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
                                    fill="#1B1917" />
                                <path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
                                    fill="#1B1917" />
                                <path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
                            </svg>

                        </span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/js/form-save-js.jsp" />

<script>
var contextPath = "<%=request.getContextPath()%>";
function fetchJSONData() {
	fetch(contextPath + "/countryList.json")
        .then((res) => {
            if (!res.ok) {
                throw new Error
                    (`HTTP error! Status: ${res.status}`);
            }
            return res.json();
            var parsedData = JSON.parse(res.json());
            // data = res.json();
        })
        .then((data) => {
            // Assuming you have a <select> element with class 'nationality-list'
            const nationalityDropdown = document.querySelector('#waterSportOpNationality');
            const nationalityDropdownTwo = document.querySelector('#waterSportEmployeeNationality');
            data.forEach(item => {
                
                // Create a new <option> element
                const option = document.createElement('option');
                option.value = item.nationality; // Set the value
                option.textContent = item.nationality; // Set the text
                
                const optionTwo = document.createElement('option');
                optionTwo.value = item.nationality;
                optionTwo.textContent = item.nationality;

                // Append the option to the dropdown
                nationalityDropdown.appendChild(option);
                nationalityDropdownTwo.appendChild(optionTwo);
                
            });
        })
        .catch((error) =>
            console.error("Unable to fetch data:", error));
}

$('#waterSportEmployeeNationality').change(function() {
    var selectedCountry = $(this).val();
    if (selectedCountry === 'Jamaican') {
        $('#jamaicaWorkPermitBox').removeClass('col-md-6').addClass('col-md-12');
        $(".jamaicaWorkPermitUploadBox").removeClass("hide");
    } else {
        $('#jamaicaWorkPermitBox').removeClass('col-md-12').addClass('col-md-6');
        $(".jamaicaWorkPermitUploadBox").addClass("hide");
    }
});
$("#waterSportOpActivitiesList").change(function(){
	$(".personal-water-craft, .water-ski, .sunfish-sail, .parasail, .scuba-diving, .glass-bottom-boat, .banana-boat-ride").addClass("hide");
   currentVal = $(this).val();
   if(currentVal == "Personal Water Craft"){
	   $(".personal-water-craft").removeClass("hide");
   }else if(currentVal == "Water Ski"){
	   $(".water-ski").removeClass("hide");
   }else if(currentVal == "Sunfish Sail"){
	   $(".sunfish-sail").removeClass("hide");
   }else if(currentVal == "Parasail"){
	   $(".parasail").removeClass("hide");
   }else if(currentVal == "Scuba Diving"){
	   $(".scuba-diving").removeClass("hide");
   }else if(currentVal == "Glass Bottom Boat/Cruise"){
	   $(".glass-bottom-boat").removeClass("hide");
   }else if(currentVal == "Banana Boat Ride"){
	   $(".banana-boat-ride").removeClass("hide");
   }
});
$(".hidePopup").click(function () {
	$(".editOperatorManagerDetailEditTabPopup").modal("hide");
	$(".editCarRentalBranchDetailPopup").modal("hide");
	$(".editDomesticTourBranchDetailPopup").modal("hide");
	$(".editContractVehicleRegisterDetailPopup").modal("hide");
	$(".editContractDriverListDetailPopup").modal("hide");
	$(".editCraftTradersApplicantDetaiPopup").modal("hide");
	$(".editCraftTradersEmployeeDetailPopup").modal("hide");
	$(".editCraftTradersEmployeeDetailPopup").modal("hide");
});
$(document).ready(function () {
	fetchJSONData();
	continueApplicationForm();
	/* gettingDocumentList(); */
	
});
function continueApplicationForm(){
	var friendlyURL = "<%=friendlyURL%>";
	if(friendlyURL == "Accommodation"){
		$(".accommodation-cate").removeClass("hide");
		$(".attraction-cate").addClass("hide");
	}
	if(friendlyURL == "Attraction"){
		$(".attraction-cate").removeClass("hide");
		$(".accommodation-cate").addClass("hide");
	}
	var jtbApplicationId = "<%=jtbApplicationId%>";
	if(jtbApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();
		gettingDocumentList(); 
		showCreditCard();
		
	}
}

/* save and continue */
function showLastFormStep(){
	var currentStage = "<%=currentStage %>";
	$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
	    if($(this).text() == currentStage ){
	    	$(this).parents("li").addClass("active");
	    	$(this).parents("li").prevAll().removeClass("active");
	    	$(this).parents("li").prevAll().addClass("activated");
	    }
	});
	
	$( ".form-wizard fieldset" ).each( function( index, element ){
        if($(this).attr("name") == currentStage ){
	    	$(this).addClass("show");
	    	$(this).prevAll().removeClass("show");
    	}
	});
	if((otherCategories=="Travel Halts")||(otherCategories=="Places of Interest/Worship")){
		 $(".application-Fees .common-heading").html("No cost and no expiry date");
		 $("#rm-payment-method").addClass("hide");
	 }
	
}
function showCreditCard(){
	$("#jtb-credit-card-method").parents(".wizard-card").removeClass("disabled");
	$("#jtb-credit-card-method").find(".wizard-info").removeClass("hide");    
	$("#jtb-credit-card-method").css({"pointer-events": "auto", opacity: "1",});
	$("#jtb-credit-card-method").find(".wizard-card-content-box").find("p.wizard-info.disabled-credit-card").remove();
	
  $("#jtb-credit-card-method").click(function () {
	     $("#payment-method-wrapper").addClass("hide");
	     $("#credit-card-details").removeClass("hide");
	     $("#payment-method").removeClass("hide");
	     $("#payment-method span").html($(this).find(".wizard-title").html());
	   });
}

function showSelectedCategory(){
	sizeOfAttractionAdd = "<%=sizeOfAttractionAdd%>";
	sizeOfBranchOfficeAdd = "<%=sizeOfBranchOfficeAdd%>";
	sizeOflistVehicleRegstAdd = "<%=sizeOflistVehicleRegstAdd%>";
	sizeOfListDriverAdd = "<%=sizeOfListDriverAdd%>";
	sizeOfCraftEmpAdd = "<%=sizeOfCraftEmpAdd%>";
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	
	typeOfApplication="<%=typeOfApplication%>";
	categoryTypeValAccomo="<%=categoryTypeValAccomo%>";
	nonHotelSubCategory="<%=nonHotelSubCategory%>";
	jtbTransactionTypeVal="<%=jtbTransactionTypeVal%>";
	attractionCategoryTypeVal="<%=attractionCategoryTypeVal%>";
	domesticToursType="<%=domesticToursType%>";
	otherCategories="<%=otherCategories%>";
	occupyLocation="<%=occupyLocation%>";
	craftOccupyLocation="<%=craftOccupyLocation%>";
	applicantNationality="<%=applicantNationality%>";
	workPermitApplied="<%=workPermitApplied%>";
	paymentMethod="<%=paymentMethod%>";
	amount="<%=amount%>";
	currency="<%=currency%>";
	operatorName="<%=operatorName%>";
	licenceNumber="<%=licenceNumber%>";
	issued_date="<%=issued_date%>";
	expiration_date="<%=expiration_date%>";
	result="<%=result%>";
	typeOfPlace="<%=typeOfPlace%>";
	typeOfRole="<%=typeOfRole%>";
	waterSportOpActivitiesList="<%=waterSportOpActivitiesList%>";
	var separator = ',';
   /*  var resultArr = nonHotelSubCategory.split(separator); */
   /*  var attractionSubCatArr = attractionCategoryTypeVal.split(separator); */
	
	$("#jtbApplicationId").val(<%=jtbApplicationId%>);
	$("#jtbApplicationType").val(typeOfApplication);
	$("#accommodationCategoryTypeVal").val(categoryTypeValAccomo);
	$("#nonHotelsCategoryTypeVal").val(nonHotelSubCategory);
	$("#jtbTransactionTypeVal").val(jtbTransactionTypeVal);
	$("#attractionCategoryTypeVal").val(attractionCategoryTypeVal);
	$("#newAttractionsTypeBox").val(attractionCategoryTypeVal);
	$("#domesticToursTypeVal").val(domesticToursType);
	$("#otherCategoryTypeVal").val(otherCategories);
	$("#operatorName").val(operatorName);
	$("#operatorNumber").val(licenceNumber);
	$("#categories").val(typeOfApplication);
	$("#subcategoriesHomeStay").val(categoryTypeValAccomo);
	$("#subcategories").val(attractionCategoryTypeVal);
	$("#subcategoriesOther").val(otherCategories);
	$("#payment-method").val(paymentMethod);
	$("#waterSportEmployeeNationality").val(applicantNationality);
	$("#amountCurrency").val(currency);
	$("#typeOfPlace").val(typeOfPlace);
	$("#typeOfRole").val(typeOfRole);
	$("#issueDate").val(issued_date);
	$("#expirationDate").val(expiration_date);
	var selectedOptionText = $("#waterSportEmployeeNationality option:selected").text(applicantNationality);
	var selectedOption1Text = $("#typeOfPlace option:selected").text(typeOfPlace);
	var selectedOptionT2ext = $("#typeOfRole option:selected").text(typeOfRole);
	$(".hotel-accomadation-forms").addClass("hide");
	$(".domestic-tour-company-forms").addClass("hide");
	
	if((typeOfApplication=="Accommodations Licence") &&(jtbTransactionTypeVal=="Renewal")){
		$(".accommodation-reneew-subcategory").removeClass("hide");
		$(".attraction-reneew-subcategory").addClass("hide");
		$(".other-reneew-subcategory").addClass("hide");
	}else if((typeOfApplication=="Other Tourism Related Licences") &&(jtbTransactionTypeVal=="Renewal")){
		$(".other-reneew-subcategory").removeClass("hide");
		$(".attraction-reneew-subcategory").addClass("hide");
		$(".accommodation-reneew-subcategory").addClass("hide");
	}else if((typeOfApplication=="Attractions")&&(jtbTransactionTypeVal=="Renewal")){
		$(".accommodation-reneew-subcategory").addClass("hide");
		$(".attraction-reneew-subcategory").removeClass("hide");
		$(".other-reneew-subcategory").addClass("hide");
	}
	if(sizeOfAttractionAdd>0){
		var counterAttraction=parseInt(sizeOfAttractionAdd)+1;
		$(".addOperatorManagerDetailTableBox").removeClass("hide");
		$("#operatorManagerVal").val(counterAttraction);
		$(".addCraftTradersApplicantDetailTableBox").removeClass("hide");
		$("#craftTradersApplicantDetailVal").val(counterAttraction);
	}
	if(sizeOfBranchOfficeAdd>0){
		var counterBranchOffice=parseInt(sizeOfBranchOfficeAdd)+1;
		$(".addCarRentalBranchDetailTableBox").removeClass("hide");
		$("#carRentalBranchDetailVal").val(counterBranchOffice);
		$(".addDomesticTourBranchDetailTableBox").removeClass("hide");
		$("#domesticTourBranchDetailVal").val(counterBranchOffice);
	}
	if(sizeOflistVehicleRegstAdd>0){
		var counterVehicleRegst=parseInt(sizeOflistVehicleRegstAdd)+1;
		$(".addContractVehicleRegisterDetailTableBox").removeClass("hide");
		$("#contractVehicleRegisterDetailVal").val(counterVehicleRegst);
	}
	if(sizeOfListDriverAdd>0){
		var counterListOfDriver=parseInt(sizeOfListDriverAdd)+1;
		$(".addContractDriverListDetailTableBox").removeClass("hide");
		$("#contractDriverListDetailVal").val(counterListOfDriver);
	}
	if(sizeOfCraftEmpAdd>0){
		var counterCraftEmp=parseInt(sizeOfCraftEmpAdd)+1;
		$(".addCraftTradersEmployeeDetailTableBox").removeClass("hide");
		$("#craftTradersEmployeeDetailVal").val(counterCraftEmp);
	}
	
	//gettingDocumentList(); 
if(typeOfApplication=="Accommodations Licence"){
	$("#accommodationsLicence").addClass("active");
	$(".application-Fees .common-heading").html("No Fee Applicable");
	$("#rm-payment-method").addClass("hide");
	$("#accommodationSubCategoryTypeBox").removeClass("hide");
		$("#accommodationSubCategoryTypeBox .wizard-title").each( function( index, element ){
		    if($(this).text() == categoryTypeValAccomo){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		       }
		    $("#jtbTransactionTypeBox .wizard-title").each( function( index, element ){
			    if($(this).text() == jtbTransactionTypeVal){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			       }
			});
	});
		
		if(categoryTypeValAccomo == "Hotels"){

		  $("#supportingDocStep").html("3");
		  $("#feePaymentStep").html("4");
			
		}else if(categoryTypeValAccomo == "Resort Cottages"){

		  $("#supportingDocStep").html("4");
		  $("#feePaymentStep").html("5");
		  
		  $("#nonHotelsCategoryTypeBox .wizard-title").each( function( index, element ){
			    if($(this).text() == nonHotelSubCategory){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			       }
				});
		  
			
		}else if(categoryTypeValAccomo == "Home Stay"){
		  $("#supportingDocStep").html("2");
		  $("#feePaymentStep").html("3");
			
		}

}else if(typeOfApplication=="Attractions"){
	$("#attractionsLicence").addClass("active");
	$("#attractionSubCategoryTypeBox").removeClass("hide");
	$(".new-attraction-forms").removeClass("hide");
	$("#payment_category").html("Attractions");
	$("#supportingDocStep").html("3");
	$("#feePaymentStep").html("4");
	
	    $("#attractionSubCategoryTypeBox .wizard-title").each(function(index, element) {
	    	 if($(this).text() == attractionCategoryTypeVal){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(this).closest("a").click();
			       }
				});
		
	$("#jtbTransactionTypeBox .wizard-title").each( function( index, element ){
	    if($(this).text() == jtbTransactionTypeVal){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	       }
	});
	
	
}else if(typeOfApplication=="Other Tourism Related Licences"){
	$("#otherTourismLicence").addClass("active");
	$("#otherCategoryType").removeClass("hide");
	if(otherCategories=="Car Rentals"){
	   	 $(".jtbFacilitiesFee").html("10,000");
		 $("#payment_category").html("Car Rentals");
		 $(".new-car-rental-forms").removeClass("hide");
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
	 }
	if(otherCategories=="Domestic Tours"){
		 $(".jtbFacilitiesFee").html("10,000");
		 $("#payment_category").html("Domestic Tours");
		 $(".domestic-tour-company-forms").removeClass("hide");
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
	 }
	if(otherCategories=="Travel Agencies"){
		 $(".jtbFacilitiesFee").html("2000");
		 $("#payment_category").html("Travel Agencies");
		 $(".travel-agency-forms").removeClass("hide");
		 $("#supportingDocStep").html("2");
		 $("#feePaymentStep").html("3");
	 }
	if(otherCategories=="Water Sports Operators"){
		 $(".jtbFacilitiesFee").html("10,000");
		 $("#payment_category").html("Water Sports Operators");
		 $("#supportingDocStep").html("4");
		 $("#feePaymentStep").html("5");
		 $(".water-sports-operator-forms").removeClass("hide");
		    for (i = 1; i <= 4; i++) {
		    	occupyLocationWaterChecked = $("#occupyLocationWater" + i).is(':checked');
				if (occupyLocationWaterChecked) {
					$(".occupyLocationWater" + i).removeClass("hide");
				   }
				}
		    if(waterSportOpActivitiesList == "Personal Water Craft"){
		 	   $(".personal-water-craft").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Water Ski"){
		 	   $(".water-ski").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Sunfish Sail"){
		 	   $(".sunfish-sail").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Parasail"){
		 	   $(".parasail").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Scuba Diving"){
		 	   $(".scuba-diving").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Glass Bottom Boat/Cruise"){
		 	   $(".glass-bottom-boat").removeClass("hide");
		    }else if(waterSportOpActivitiesList == "Banana Boat Ride"){
		 	   $(".banana-boat-ride").removeClass("hide");
		    }
	 }
	if(otherCategories=="Contract Carriage"){
		contractDriverListDetail = $("#contractDriverListDetailVal").val();
		contractDriverListCount = contractDriverListDetail-1;
		if(contractDriverListCount > 1){
		    contractDriverListCountUp = contractDriverListCount-1;
		    driverFee = contractDriverListCountUp * 800;
		    totalFee = 5000 + driverFee;
		    $(".jtbFacilitiesFee").html(totalFee);
		}else{
		    $(".jtbFacilitiesFee").html("5000");
		}
		 $("#payment_category").html("Contract Carriage");
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
		 $(".contract-carriage-forms").removeClass("hide");
	 }
	if(otherCategories=="Travel Halts"){
		 $("#supportingDocStep").html("2");
	     $("#feePaymentStep").html("3");
		 $(".travel-halt-forms").removeClass("hide");
	 }
	if(otherCategories=="Water Sports Employees"){
		 $(".jtbFacilitiesFee").html("800.00");
		 $("#payment_category").html("Water Sports Employees");
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
		 $(".water-sports-employee-forms").removeClass("hide");
		 if(applicantNationality=="Jamaican"){
			 $(".jamaicaWorkPermitUploadBox").removeClass("hide");
		 }
		 if(workPermitApplied=="Yes"){
			 $("#date-application").removeClass("hide");
		 }
	 }
	if(otherCategories=="Bike Rental"){
		 $(".jtbFacilitiesFee").html("10,000");
		 $("#payment_category").html("Bike Rental");
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
		 $(".motor-bike-rental-forms").removeClass("hide");
	 }
	if(otherCategories=="Places of Interest/Worship"){
		 $("#supportingDocStep").html("3");
		 $("#feePaymentStep").html("4");
		 $(".places-of-interest-forms").removeClass("hide");
	 }
	if(otherCategories=="Craft Traders"){
		craftTradersEmployeeDetail = $("#craftTradersEmployeeDetailVal").val();
		craftTradersEmployeeCount = craftTradersEmployeeDetail-1;
		if(craftTradersEmployeeCount > 1){
		    craftTradersEmployeeCountUp = craftTradersEmployeeCount-1;
		    assistantFee = craftTradersEmployeeCountUp * 800;
		    totalFee = 1300 + assistantFee;
		    $(".jtbFacilitiesFee").html(totalFee);
		}else{
		    $(".jtbFacilitiesFee").html("1300");
		}
		 $("#payment_category").html("Craft Traders");
		 $("#supportingDocStep").html("2");
		 $("#feePaymentStep").html("3");
		 $(".craft-traders-forms").removeClass("hide");
		 for (i = 1; i <= 4; i++) {
		    	occupyCraftChecked = $("#occupyLocation" + i).is(':checked');
				if (occupyCraftChecked) {
					$(".occupyLocation" + i).removeClass("hide");
				   }
				}
		 
	 }
	$("#otherCategoryType .wizard-title").each( function( index, element ){
	    if($(this).text() == otherCategories){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	       }
		});
	 $("#domesticToursType .wizard-title").each( function( index, element ){
		    if($(this).text() == domesticToursType){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		       }
			});
	 $("#jtbTransactionTypeBox .wizard-title").each( function( index, element ){
		    if($(this).text() == jtbTransactionTypeVal){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		       }
		});
	 /* $("input:checkbox[name=occupyLocation]:checked").each(function () {
		    if($(this).val() == "Evidence of Ownership"){
			     $(".occupyLocation1").removeClass("hide");
			   }else if($(this).val() == "Rent Receipt"){
			     $(".occupyLocation2").removeClass("hide");
	            }else if($(this).val() == "Letter from Owner"){
			     $(".occupyLocation3").removeClass("hide");
	            }else if($(this).val() == "Contract of Lease"){
			     $(".occupyLocation4").removeClass("hide");
			   }
			}); input[name='occupyLocation']*/
			
			
   /*   $("input:checkbox[name=occupyLocation]:checked").each(function () {
		 //$(this).prop("checked", true);
		    if($(this).val() == "Evidence of Ownership"){
			     $(".occupyLocation1").removeClass("hide");
			   }else if($(this).val() == "Rent Receipt"){
			     $(".occupyLocation2").removeClass("hide");
	            }else if($(this).val() == "Letter from Owner"){
			     $(".occupyLocation3").removeClass("hide");
	            }else if($(this).val() == "Contract of Lease"){
			     $(".occupyLocation4").removeClass("hide");
			   }
			});  */
}
if(categoryTypeValAccomo=="Hotels"){
	$(".hotel-accomadation-forms").removeClass("hide");
}
if(categoryTypeValAccomo=="Resort Cottages"){
	$(".non-hotel-accomadation-forms").removeClass("hide");
}
if(categoryTypeValAccomo=="Home Stay"){
	$(".home-stay-accomadation-forms").removeClass("hide");
}

/*     $("#nonHotelsCategoryTypeBox .wizard-title").each(function(index, element) {
        if (resultArr.includes($(this).text())){
        	$(this).closest('.wizard-card').addClass("active");
        	$(this).closest("a").click();
       		 }
    	}); */

/* if (attractionSubCatArr != "") {
    $("#attractionSubCategoryTypeBox .wizard-title").each(function(index, element) {
        if (attractionSubCatArr.includes($(this).text())){
        	$(this).closest('.wizard-card').addClass("active");
        	$(this).closest("a").click(); 
       		 }
    	});
	} */
	$("input[name='nationalsOperation']:checked").each(function(index, element) {
	    if ($(this).val() == "Yes") {
	        $('#other-copy').removeClass("hide");
	    }
	 });
	/* FEE PAYMENT */
	if (paymentMethod != "") {
	 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		    if($(this).text() == paymentMethod){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
	 	$("#amountPaid").val(amount);
	 	$("#amountCurrency").val(currency).trigger("change");
	  	}
	/* append Function */
	
	 $('#categories').prop('disabled', true);
	 $('#subcategoriesHomeStay').prop('disabled', true);
	 $('#operatorNumber').prop('disabled', true);
	 $('#subcategories').prop('disabled', true);
	 $('#subcategoriesOther').prop('disabled', true);
	 $('#accomodation-homestay-renew-btn').prop('disabled', true);
	
	if(result=="true"){
		 $('#operatorName').prop('disabled', true);
		 $('#issueDate').prop('disabled', true);
		 $('#expirationDate').prop('disabled', true);
		 $("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});	
	}
	if(result=="false"){
		 $("#jtbTransactionTypeFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});	
	}
	
	$(".accommodationOwnerName").html($("#newAccomadationOwnerName").val());
	$(".hotelName").html($("#newAccomadationHotelName").val());
	$(".hotelTelNo").html($("#newAccomadationTelephone").val());
	$(".hotelFaxNo").html($("#newAccomadationFaxNum").val());
	$(".hotelEmailId").html($("#newAccomadationEmail").val());
	$(".hotelParishLoc").html($("#newAccomadationParish").val());
	$(".hotelAddress").html($("#newAccomadationAddress").val());

	$(".bedroomNo").html($("#newAccomadationHotelBedroom").val());
	$(".hotelOwner").html($("#accomadationHotelOwner").val());
	$(".ownerAddress").html($("#newAccomadationHotelAddress").val());
	$(".ownerCompanyLaw").html($("#accomadationHotelLaws").val());
	$(".hotelDate").html($("#newAccomadationDateCom").val());
	$(".hotelOperaterName").html($("#newAccomadationHotelOperator").val());
	$(".hotelOperaterName").html($("#newAccomadationHotelOperatorDate").val());

	$(".ownerAddress1").html($("#newHotelAccomadationAddress").val());
	$(".ownerCompanyLaw1").html($("#newAccomadationHotelCompanylaws").val());
	$(".sinceDate").html($("#newAccomadationHotelOperatorDate").val());
	$(".hotelOpenDate").html($("#newAccomadationDate").val());

	/* non-hotel append Function */
	$(".nonHotelOperater").html($("#accommodationNonHotelOperater").val());
	$(".hotelFrom").html($("#newHotelAccomadationFromDate").val());
	$(".dateTo").html($("#newHotelAccomadationToDate").val());
	$(".dateSince").html($("#newAccomadationSince").val());
	$(".nonHotelOwnerName").html($("#nonHotelAccomadationOwnerName").val());

	/* attraction-data-append */
	$(".attractionsOwnerName").html($("#newAttractionsOwnerName").val());
	/* $(".locationAttraction").html($("#newAttractionsLocation").val()); */
	$(".mailingAddress").html($("#newAttractionsMailingEmail").val());
	/* $(".telephoneAttractionNew").html($("#newAttractionsTelephone").val()); */
	$(".faxNo").html($("#newAttractionsFaxNum").val());
	/* $(".emailAddress").html($("#newAttractionsEmailAddress").val()); */
	$(".employeesNo").html($("#newAttractionsEmployeesNum").val());
	$(".parishLoc").html($("#newAttractionsParish").val());
	$(".ownerNameAttraction").html($("#newAttractionsGenOwnerName").val());
	$(".companyNameAttraction").html($("#newAttractionsCompanyLaw").val());
	$(".dateAttraction").html($("#newAttractionsDate").val());
	$(".attractionName").html($("#newAttractionsName").val());
	$(".datesinceAttraction").html($("#newAttractionsStartDate").val());
	$(".attractionAcresLand").html($("#newAttractionsSituatedLand").val());
	$(".attractionOffers").html($("#newAttractionsActivities").val());

	/* car-rental */
	$(".declaration-by").html($("#newCarRentalApplicantName").val());

	/* domestic-tour */
	$(".domesticApplicantName").html($("#domesticTourApplicantName").val());

	/* travel-halt */
	$(".haltApplicantName").html($("#travelHaltApplicantName").val());
	$(".haltLocation").html($("#travelHaltLocation").val());

	/* Place of interest */
	$(".namePlaceOfInterest").html($("#nameOfInterestLocation").val());
	$(".managerName").html($("#placeInterestOwnerName").val());
	$(".worshipLocation").html($("#placeOfInterestLocation").val());
	$(".worshipMailingAddress").html($("#placeOfInterestMailing").val());
	$(".telNoOfplaces").html($("#placeOfInterestTelephone").val());
	$(".faxNoOfInteres").html($("#placeOfInterestFaxNum").val());
	$(".emailOfInteres").html($("#placeOfInterestEmail").val());
	$(".employeesNoPlaces").html($("#placeOfInterestEmployeesNo").val());
	$(".parishLocationWorship").html($("#placeOfInterestParish").val());
	$(".ownerNameOfWorship").html($("#placeOfInterestOwnerName").val());
	$(".companyIncorporatedLaw").html($("#placeOfInterestHotelLaws").val());
	$(".worshipDate").html($("#placeOfInterestDate").val());
	$(".operatingSinceDate").html($("#placeOfInterestOperatingSince").val());
	$(".landOfAcresPlaces").html($("#placeOfInterestAcresLand").val());

	/* bike-rental */
	$(".applicantBikeName").html($("#motorBikeApplicantName").val());

	/* water sport employee */
	$(".timePeriod").html($("#waterSportTimePeriod").val());

	/* water sport operator */
	$(".sportInsuranceAmount").html($("#waterSportOpinsuranceAmount").val());

	/* contract-carriage */
	$(".contractOwnerName").html($("#newContractOwnerName").val());

	
	if(currentStage == "APPLICATION FEES PAYMENT"){
		$("#jtb-credit-card-method").parents(".wizard-card").removeClass("disabled");
		$("#jtb-credit-card-method").find(".wizard-info").removeClass("hide");    
		$("#jtb-credit-card-method").css({"pointer-events": "auto", opacity: "1",});
		$("#jtb-credit-card-method").find(".wizard-card-content-box").find("p.wizard-info.disabled-credit-card").remove();
	}
}
	 
	
	
function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormStep%>";
	
	$( ".tab-content .tab-pane" ).each( function( index, element ){
	    if($(this).attr("id") == lastFormStep ){
	    	$(this).addClass("active");
	    	$(this).prevAll().removeClass("active");
	    	$(this).nextAll().removeClass("active");
	    }
	});
	
	$(".tab-plus-wizard-left li a").each( function( index, element ){
	    if($(this).attr("href") == "#"+lastFormStep ){
	    	$(this).parents().prevAll("li").find("a").removeClass("active disabled");
	    	$(this).addClass("active");
	    	$(this).removeClass("disabled");
	    }
	});
}

function openDocumentUploadPopup(counterVal,documentName){
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$("#jtbEnrollDocuments").val("");
		$("#commonuploadpopup").modal("show");
		$('.custom-file-label').html('Choose File');
		$("#documentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
	}
	function supportingDocumentUpload(){
	 	var documentNumber = $("#<portlet:namespace/>documentNumber").val();
	    var issueDate = $("#<portlet:namespace/>issueDate").val();
	    var expiryDate=$("#<portlet:namespace/>expiryDate").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var documentuploadCounter = $("#documentuploadCounter").val();
	    var fileID = 'jtbEnrollDocuments';
	    $("#commonuploadpopup").modal("hide");
	    $('.hidden'+documentuploadCounter).removeClass('hide');
	    var progress = document.getElementById('progress'+documentuploadCounter);
	    progress.ariaValueNow = 50;
	    progress.style.width ='50%';
	    jtbApplicationId = $("#jtbApplicationId").val();
	    $.ajaxFileUpload({
	        secureuri: false,
	        method: "POST",
	        fileElementId: 'jtbEnrollDocuments',
	        url: '${jtbDoucumentsUpload}',
	        dataType: 'text',
	        data: {
	            "<portlet:namespace/>documentNumber": documentNumber,
	            "<portlet:namespace/>documentName": documentName,
	            "<portlet:namespace/>fileID": fileID,
	            "<portlet:namespace/>command": "fileUpload",
	            "<portlet:namespace/>issueDate": issueDate,
	            "<portlet:namespace/>expiryDate": expiryDate,
	            "<portlet:namespace/>documentuploadCounter": documentuploadCounter,
	            "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
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
	            updatedFillDoc = $(".supporting-document-card").find(".uploaded-info").length;
	            genericFilledDoc=$(".supporting-document-card").find(".generic-doc").length;
	            filledDocument=updatedFillDoc-genericFilledDoc;
				if(numberOfDocument == filledDocument){
		        	$("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		        }
	    },
	        error: function () {
	        }
	    });
	}
	function gettingDocumentList() {
		typeOfApplication=$("#jtbApplicationType").val();
		accommodationCategoryTypeValAccomodation=$("#accommodationCategoryTypeVal").val();
		jtbTransactionTypeVal=$("#jtbTransactionTypeVal").val();//Common for all category
		attractionCategoryTypeVal=$("#attractionCategoryTypeVal").val();
		otherCarRentalDomesticToursTypeVal=$("#domesticToursTypeVal").val();
		otherCategories=$("#otherCategoryTypeVal").val();
		jtbApplicationId = $("#jtbApplicationId").val();
		/* selectedNonHotelsType = [];
		$("#nonHotelsCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
			selectedNonHotelsType.push($(this).html());
		});
	    nonHotelsCategoryTypeValAccomodation = selectedNonHotelsType.toString(); */
	    nonHotelsCategoryTypeValAccomodation=$("#nonHotelsCategoryTypeVal").val();
		/* selectedAttractionSubCategory = [];
		$("#attractionSubCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
			selectedAttractionSubCategory.push($(this).html());
		});
		subCategoryValuesAttraction = selectedAttractionSubCategory.toString(); */
		subCategoryValuesAttraction=$("#attractionCategoryTypeVal").val();
			$.ajax({
						type : "POST",
						url : "${gettingDocumentList}",
						data : {
							"<portlet:namespace/>typeOfApplication" : typeOfApplication,
							"<portlet:namespace/>accommodationCategoryTypeValAccomodation" : accommodationCategoryTypeValAccomodation,
							"<portlet:namespace/>jtbTransactionTypeVal" : jtbTransactionTypeVal,
							"<portlet:namespace/>attractionCategoryTypeVal" : attractionCategoryTypeVal,
							"<portlet:namespace/>nonHotelsCategoryTypeValAccomodation" : nonHotelsCategoryTypeValAccomodation,
							"<portlet:namespace/>otherCarRentalDomesticToursTypeVal" : otherCarRentalDomesticToursTypeVal,
							"<portlet:namespace/>otherCategories" : otherCategories,
							"<portlet:namespace/>subCategoryValuesAttraction" : subCategoryValuesAttraction,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						 async:false,
						success : function(data) {
								$("#documentList").html(data);
						},
						error : function(data) {
						},
					});
			 validation();
	}
	async function validation(){
		var jtbApplicationId = "<%=jtbApplicationId%>";
		if(jtbApplicationId>0 ){
		  var requiredDoc = $("div[id='requiredDoc']").length;
		    filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    numberOfDocument = requiredDoc;

		    if (numberOfDocument != filledDocument) {
		        $("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    } else {
		        $("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		    }
	    
	}
	}
	function pendingJTBApplication() {
		typeOfApplication=$("#jtbApplicationType").val();
		accommodationCategoryTypeValAccomodation=$("#accommodationCategoryTypeVal").val();
			/* selectedNonHotelsType = [];
			$("#nonHotelsCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNonHotelsType.push($(this).html());
			});
		nonHotelsCategoryTypeValAccomodation = selectedNonHotelsType.toString(); */
		nonHotelsCategoryTypeValAccomodation=$("#nonHotelsCategoryTypeVal").val();
		jtbTransactionTypeValAccomodation=$("#jtbTransactionTypeVal").val();
		selectedAttractionCategory = [];
		/* $("#attractionSubCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
			selectedAttractionCategory.push($(this).html());
		});
		attractionCategoryTypeVal = selectedAttractionCategory.toString(); */
		attractionCategoryTypeVal=$("#attractionCategoryTypeVal").val();
		domesticToursTypeVal=$("#domesticToursTypeVal").val();
		operatorName=$("#operatorName").val();
		issueDate=$("#issueDate").val();
		expirationDate=$("#expirationDate").val();
		otherCategoryTypeVal=$("#otherCategoryTypeVal").val();
		jtbApplicationId = $("#jtbApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		/* currentFormToSave = $(".non-hotel-accomadation-forms").find(".active span:nth-child(2)").text(); */ 
			$.ajax({
						type : "POST",
						url : "${pendingApplicaiton}",
						data : {
							"<portlet:namespace/>typeOfApplication" : typeOfApplication,
							"<portlet:namespace/>accommodationCategoryTypeValAccomodation" : accommodationCategoryTypeValAccomodation,
							"<portlet:namespace/>nonHotelsCategoryTypeValAccomodation" : nonHotelsCategoryTypeValAccomodation,
							"<portlet:namespace/>jtbTransactionTypeValAccomodation" : jtbTransactionTypeValAccomodation,
							"<portlet:namespace/>attractionCategoryTypeVal" : attractionCategoryTypeVal,
							"<portlet:namespace/>domesticToursTypeVal" : domesticToursTypeVal,
							"<portlet:namespace/>operatorName" : operatorName,
							"<portlet:namespace/>issueDate" : issueDate,
							"<portlet:namespace/>expirationDate" : expirationDate,
							"<portlet:namespace/>otherCategoryTypeVal" : otherCategoryTypeVal,
							"<portlet:namespace/>currentStage" : currentStage,
							"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						async:false,
						success : function(data) {
							var result = data.APP_DATA;
					    	 $("#jtbApplicationId").val(result["jtbApplicationId"]);
						},
						error : function(data) {
						},
					});
	 }
	function submitJTBApplication() {
		typeOfApplication=$("#jtbApplicationType").val();
		accommodationCategoryTypeValAccomodation=$("#accommodationCategoryTypeVal").val();
		/* selectedNonHotelsType = [];
		$("#nonHotelsCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
			selectedNonHotelsType.push($(this).html());
		});
		nonHotelsCategoryTypeValAccomodation = selectedNonHotelsType.toString(); */
		nonHotelsCategoryTypeValAccomodation=$("#nonHotelsCategoryTypeVal").val();
		jtbTransactionTypeValAccomodation=$("#jtbTransactionTypeVal").val();
		selectedAttractionCategory = [];
		/* $("#attractionSubCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
			selectedAttractionCategory.push($(this).html());
		});
		attractionCategoryTypeVal = selectedAttractionCategory.toString(); */
		attractionCategoryTypeVal=$("#attractionCategoryTypeVal").val();
		domesticToursTypeVal=$("#domesticToursTypeVal").val();
		operatorName=$("#operatorName").val();
		issueDate=$("#issueDate").val();
		expirationDate=$("#expirationDate").val();
		otherCategoryTypeVal=$("#otherCategoryTypeVal").val();
		jtbApplicationId = $("#jtbApplicationId").val();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	    lastFormDetailsStep = $(".tab-pane.active").attr("id");
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
			$.ajax({
						type : "POST",
						url : "${submitApplicaiton}",
						data : {
							"<portlet:namespace/>typeOfApplication" : typeOfApplication,
							"<portlet:namespace/>accommodationCategoryTypeValAccomodation" : accommodationCategoryTypeValAccomodation,
							"<portlet:namespace/>nonHotelsCategoryTypeValAccomodation" : nonHotelsCategoryTypeValAccomodation,
							"<portlet:namespace/>jtbTransactionTypeValAccomodation" : jtbTransactionTypeValAccomodation,
							"<portlet:namespace/>attractionCategoryTypeVal" : attractionCategoryTypeVal,
							"<portlet:namespace/>domesticToursTypeVal" : domesticToursTypeVal,
							"<portlet:namespace/>operatorName" : operatorName,
							"<portlet:namespace/>issueDate" : issueDate,
							"<portlet:namespace/>expirationDate" : expirationDate,
							"<portlet:namespace/>otherCategoryTypeVal" : otherCategoryTypeVal,
							"<portlet:namespace/>currentFormToSave" : currentFormToSave,
							"<portlet:namespace/>currentStage" : currentStage,
							"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							var result = data.APP_DATA;
					    	var appStatus = result["appStatus"];
							    if(appStatus=="submitted"){
							    	$("#continueDashboardJtb").removeClass("hide");
							   		$("#submitted-content").removeClass("hide");
							   		$("#application_submitted-img").removeClass("hide");
							   	}else{
							   		$("#draft-content").removeClass("hide");
							   		$("#application_draft-img").removeClass("hide");
							   		/* $("#application_submitted-img").addClass("hide"); */
							   	}
							   	
							$(".custom_loader").addClass("hide");
							if(result!=null){
								$("#submit_pop_app_no").html(result["jtbAppNo"]);
						    	$("#submit_pop_status").html(result["appStatus"]);
						    	$("#submit_pop_category").html(result["category"]);
						    	$("#tpdcoSubmitCategory").html(result["jtbSubmitCategory"]);
							}
					    	
					    	 var modifiedSentence = typeOfApplication;
					    	if(typeOfApplication=="Attractions"){
					    		modifiedSentence=typeOfApplication+" Licence";
					    	}
					    	else if(typeOfApplication=="Other Tourism Related"){
					    		modifiedSentence="Attractions Licence";
					    	} 
					    	$("#tpdcoSubmitCategory").html(modifiedSentence);
					    	
					    	
						},
						error : function(data) {
						},
					});
	 }
	 
	 $(function () {
			$(document).on('change', '#jtbEnrollDocuments', function() { 
		        var fileName = $(this).val();
		        fileName = fileName.replace("C:\\fakepath\\", "");
		        $(this).next('.custom-file-label').html(fileName);
		    })
		}); 
	 function opendelDocPopup(fileEntry,counter){
			$("#documentuploadCounter").val(counter);
			$("#deletepopup"+fileEntry).modal("show");
		}
		function deleteDocument(fileEntryId){
		
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${deletedocumentUrl}',
				data : {
					"<portlet:namespace/>fileEntryId" : fileEntryId,
				},
				success : function(data) {
					$("#deletepopup"+fileEntryId).modal("hide");
					$("#unpload-info-card"+fileEntryId).remove();
					$("#documentUpload"+documentuploadCounter).removeClass("disabled");
					$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
					var requiredDoc = $("div[id='requiredDoc']").length;
					var notRequireDoc = $("div[id='notRequiredDoc']").length;
	                if(requiredDoc >= 1){
	                if(documentuploadCounter <= requiredDoc){
						$("#requireDocNamePreview" + documentuploadCounter).html("");
						filledDocument = filledDocument -1;
						$("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
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
		function deleteDocumentFee(fileEntryId){
		
			var documentuploadCounter = $("#documentuploadCounter").val();
			$.ajax({
				type : "POST",
				url : '${deletedocumentUrl}',
				data : {
					"<portlet:namespace/>fileEntryId" : fileEntryId,
				},
				success : function(data) {
				
					$("#deletepopup"+fileEntryId).modal("hide");
					$("#unpload-info-card"+fileEntryId).remove();
					$("#documentUpload"+documentuploadCounter).removeClass("disabled");
					$("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
					/* $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide"); */
					/* filledDocument = filledDocument - 1;
		            $("#PharmaSupportingDocumentFieldset .form-wizard-next-btn").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"}); */
					var requiredDoc = $("div[id='requiredDoc']").length;
					var notRequireDoc = $("div[id='notRequiredDoc']").length;
	                if(requiredDoc >= 1){
	                if(documentuploadCounter <= requiredDoc){
						$("#requireDocNamePreview" + documentuploadCounter).html("");
						filledDocument = filledDocument -1;
						$("#jtbSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
			     }
			     }
					if(notRequireDoc >= 1){
						$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
					}
					 checkFilePresence();
				},
				error : function(data) {

				}
			});
		}
		// Function to check if any files for payment remain and enable/disable the upload button
		function checkFilePresence() {
		    // Count the remaining file cards
		    var filesRemaining = $(".uploaded-info-two").length; // Adjust this selector if needed
		    if (filesRemaining === 0) {
		        // If no files are remaining, enable the upload button
		     
		        $("#jtb-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
		    } else {
		        // Otherwise, disable the upload button
		    	$("#jtb-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
		    }
		}


		function saveToDraft() {
			typeOfApplication=$("#jtbApplicationType").val();
			accommodationCategoryTypeValAccomodation=$("#accommodationCategoryTypeVal").val();
			/* selectedNonHotelsType = [];
			$("#nonHotelsCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNonHotelsType.push($(this).html());
			});
			selectedNonHotelsType = [];
			$("#nonHotelsCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedNonHotelsType.push($(this).html());
			});
			nonHotelsCategoryTypeValAccomodation = selectedNonHotelsType.toString(); */
			nonHotelsCategoryTypeValAccomodation=$("#nonHotelsCategoryTypeVal").val();
			jtbTransactionTypeValAccomodation=$("#jtbTransactionTypeVal").val();
			/* selectedAttractionCategory = [];
			$("#attractionSubCategoryTypeBox").find(".wizard-card.active .wizard-title").each(function() {
				selectedAttractionCategory.push($(this).html());
			});
			attractionCategoryTypeVal = selectedAttractionCategory.toString(); */
			attractionCategoryTypeVal=$("#attractionCategoryTypeVal").val();
			domesticToursTypeVal=$("#domesticToursTypeVal").val();
			otherCategories=$('#otherCategoryTypeVal').val();
			jtbApplicationId = $("#jtbApplicationId").val();
			currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
	   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
	   	 	
	   	 	/* newCurrentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
			hotelAccoCurrentFormToSave = $(".hotel-accomadation-forms").find(".active span:nth-child(2)").text();
			nonHotelAccoCurrentFormToSave = $(".non-hotel-accomadation-forms").find(".active span:nth-child(2)").text();
			homeStayAccoCurrentFormToSave = $(".home-stay-accomadation-forms").find(".active span:nth-child(2)").text(); */
			
				$.ajax({
							type : "POST",
							url : "${draftApplicaiton}",
							data : {
								"<portlet:namespace/>typeOfApplication" : typeOfApplication,
								"<portlet:namespace/>accommodationCategoryTypeValAccomodation" : accommodationCategoryTypeValAccomodation,
								"<portlet:namespace/>nonHotelsCategoryTypeValAccomodation" : nonHotelsCategoryTypeValAccomodation,
								"<portlet:namespace/>jtbTransactionTypeValAccomodation" : jtbTransactionTypeValAccomodation,
								"<portlet:namespace/>attractionCategoryTypeVal" : attractionCategoryTypeVal,
								"<portlet:namespace/>domesticToursTypeVal" : domesticToursTypeVal,
								"<portlet:namespace/>otherCategories" : otherCategories,
								"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
								"<portlet:namespace/>lastFormDetailsStep" : lastFormDetailsStep,
								"<portlet:namespace/>currentStage" : currentStage,
							},
							success : function(data) {
								var result = data.APP_DATA;
						    	 $("#jtbApplicationId").val(result["jtbApplicationId"]);
						    	 $("#pop_app_no").html(result["applicationNumber"]);
						    	 $("#pop_status").html(result["status"]);
						    	 $("#pop_category").html(result["category"]);
							},
							error : function(data) {
							},
						});
		 }
		
		function deleteAfterSaveConDoc(id) {
		    var fileName = $("#"+id).next().html();
			jtbApplicationId = $("#jtbApplicationId").val();
			saveAndCon='<%=jtbApplicationId%>';
			if(saveAndCon>0){
			 	 $.ajax({
				        type: "POST",
				        url: '${delteDocAferSaveconUrl}',
				        data: {
				            "<portlet:namespace/>fileName": fileName,
				            "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
				        },
				        success: function (data) {
				        },
				        error: function (data) {
				        }
				    });	
				
			}
		}
	
</script>