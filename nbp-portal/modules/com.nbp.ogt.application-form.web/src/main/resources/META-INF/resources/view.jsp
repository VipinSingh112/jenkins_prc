<%@ include file="/init.jsp" %>
<%@ include file="/ogt-wizard.jsp" %>
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
                        <p class="modal-subtitle f2">Your Proof of Claim for <span class="pop_category"></span> has been correctly saved as draft.</p>
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
                                           <svg width="50" height="50" viewBox="0 0 176 176" fill="none" xmlns="http://www.w3.org/2000/svg">
											<g clip-path="url(#clip0_9972_318326)">
											<path d="M44.9574 25.1289H35.3923C34.0724 25.1289 33.001 26.2003 33.001 27.5203V118.389C33.001 119.709 34.0724 120.781 35.3923 120.781H44.9576C46.2776 120.781 47.349 119.709 47.349 118.389V111.215H40.1751C38.8551 111.215 37.7837 110.144 37.7837 108.824C37.7837 107.504 38.8551 106.433 40.1751 106.433H47.349V96.8675H40.1751C38.8551 96.8675 37.7837 95.7961 37.7837 94.4761C37.7837 93.1561 38.8551 92.0847 40.1751 92.0847H47.349V82.5195H40.1751C38.8551 82.5195 37.7837 81.4481 37.7837 80.1281C37.7837 78.8081 38.8551 77.7368 40.1751 77.7368H47.349V68.1715H40.1751C38.8551 68.1715 37.7837 67.1001 37.7837 65.7801C37.7837 64.4601 38.8551 63.3888 40.1751 63.3888H47.349V53.8235H40.1751C38.8551 53.8235 37.7837 52.7521 37.7837 51.4322C37.7837 50.1122 38.8551 49.0408 40.1751 49.0408H47.349V39.4755H40.1751C38.8551 39.4755 37.7837 38.4042 37.7837 37.0842C37.7837 35.7642 38.8551 34.6928 40.1751 34.6928H47.349V27.5189C47.3487 26.2003 46.2774 25.1289 44.9574 25.1289Z" fill="#047247"/>
											<path d="M140.609 25.1289H131.044C129.724 25.1289 128.652 26.2003 128.652 27.5203V34.6942H135.826C137.146 34.6942 138.218 35.7655 138.218 37.0855C138.218 38.4055 137.146 39.4769 135.826 39.4769H128.652V49.0421H135.826C137.146 49.0421 138.218 50.1135 138.218 51.4335C138.218 52.7535 137.146 53.8249 135.826 53.8249H128.652V63.3901H135.826C137.146 63.3901 138.218 64.4615 138.218 65.7815C138.218 67.1015 137.146 68.1728 135.826 68.1728H128.652V77.7381H135.826C137.146 77.7381 138.218 78.8095 138.218 80.1295C138.218 81.4495 137.146 82.5208 135.826 82.5208H128.652V92.0861H135.826C137.146 92.0861 138.218 93.1574 138.218 94.4774C138.218 95.7974 137.146 96.8688 135.826 96.8688H128.652V106.434H135.826C137.146 106.434 138.218 107.505 138.218 108.825C138.218 110.145 137.146 111.217 135.826 111.217H128.652V118.391C128.652 119.711 129.724 120.782 131.044 120.782H140.609C141.929 120.782 143 119.711 143 118.391V27.5203C143 26.2003 141.929 25.1289 140.609 25.1289Z" fill="#047247"/>
											<path d="M122.135 15.6549L88.6565 6.08962C88.2261 5.97013 87.7717 5.97013 87.3462 6.08962L53.8679 15.6549C52.8396 15.9515 52.1318 16.8888 52.1318 17.9552V118.39C52.1318 119.71 53.2032 120.781 54.5232 120.781H71.2623V104.042C71.2623 102.722 72.3337 101.65 73.6537 101.65H102.349C103.669 101.65 104.741 102.722 104.741 104.042V120.781H121.48C122.8 120.781 123.871 119.71 123.871 118.39V17.9552C123.871 16.8888 123.163 15.9512 122.135 15.6549ZM76.0448 94.4765C76.0448 95.7965 74.9735 96.8679 73.6535 96.8679H64.0882C62.7682 96.8679 61.6969 95.7965 61.6969 94.4765V84.9113C61.6969 83.5913 62.7682 82.5199 64.0882 82.5199H73.6535C74.9735 82.5199 76.0448 83.5913 76.0448 84.9113V94.4765ZM76.0448 75.3462C76.0448 76.6662 74.9735 77.7376 73.6535 77.7376H64.0882C62.7682 77.7376 61.6969 76.6662 61.6969 75.3462V65.781C61.6969 64.461 62.7682 63.3896 64.0882 63.3896H73.6535C74.9735 63.3896 76.0448 64.461 76.0448 65.781V75.3462ZM76.0448 56.216C76.0448 57.536 74.9735 58.6073 73.6535 58.6073H64.0882C62.7682 58.6073 61.6969 57.536 61.6969 56.216V46.6507C61.6969 45.3307 62.7682 44.2594 64.0882 44.2594H73.6535C74.9735 44.2594 76.0448 45.3307 76.0448 46.6507V56.216ZM76.0448 37.0855C76.0448 38.4055 74.9735 39.4769 73.6535 39.4769H64.0882C62.7682 39.4769 61.6969 38.4055 61.6969 37.0855V27.5205C61.6969 26.2005 62.7682 25.1291 64.0882 25.1291H73.6535C74.9735 25.1291 76.0448 26.2005 76.0448 27.5205V37.0855ZM95.1751 94.4765C95.1751 95.7965 94.1037 96.8679 92.7837 96.8679H83.2185C81.8985 96.8679 80.8271 95.7965 80.8271 94.4765V84.9113C80.8271 83.5913 81.8985 82.5199 83.2185 82.5199H92.7837C94.1037 82.5199 95.1751 83.5913 95.1751 84.9113V94.4765ZM95.1751 75.3462C95.1751 76.6662 94.1037 77.7376 92.7837 77.7376H83.2185C81.8985 77.7376 80.8271 76.6662 80.8271 75.3462V65.781C80.8271 64.461 81.8985 63.3896 83.2185 63.3896H92.7837C94.1037 63.3896 95.1751 64.461 95.1751 65.781V75.3462ZM95.1751 56.216C95.1751 57.536 94.1037 58.6073 92.7837 58.6073H83.2185C81.8985 58.6073 80.8271 57.536 80.8271 56.216V46.6507C80.8271 45.3307 81.8985 44.2594 83.2185 44.2594H92.7837C94.1037 44.2594 95.1751 45.3307 95.1751 46.6507V56.216ZM95.1751 37.0855C95.1751 38.4055 94.1037 39.4769 92.7837 39.4769H83.2185C81.8985 39.4769 80.8271 38.4055 80.8271 37.0855V27.5205C80.8271 26.2005 81.8985 25.1291 83.2185 25.1291H92.7837C94.1037 25.1291 95.1751 26.2005 95.1751 27.5205V37.0855ZM114.306 94.4765C114.306 95.7965 113.234 96.8679 111.914 96.8679H102.349C101.029 96.8679 99.9576 95.7965 99.9576 94.4765V84.9113C99.9576 83.5913 101.029 82.5199 102.349 82.5199H111.914C113.234 82.5199 114.306 83.5913 114.306 84.9113V94.4765ZM114.306 75.3462C114.306 76.6662 113.234 77.7376 111.914 77.7376H102.349C101.029 77.7376 99.9576 76.6662 99.9576 75.3462V65.781C99.9576 64.461 101.029 63.3896 102.349 63.3896H111.914C113.234 63.3896 114.306 64.461 114.306 65.781V75.3462ZM114.306 56.216C114.306 57.536 113.234 58.6073 111.914 58.6073H102.349C101.029 58.6073 99.9576 57.536 99.9576 56.216V46.6507C99.9576 45.3307 101.029 44.2594 102.349 44.2594H111.914C113.234 44.2594 114.306 45.3307 114.306 46.6507V56.216ZM114.306 37.0855C114.306 38.4055 113.234 39.4769 111.914 39.4769H102.349C101.029 39.4769 99.9576 38.4055 99.9576 37.0855V27.5205C99.9576 26.2005 101.029 25.1291 102.349 25.1291H111.914C113.234 25.1291 114.306 26.2005 114.306 27.5205V37.0855Z" fill="#047247"/>
											<path d="M66.892 150.182C66.892 154.94 65.9901 158.989 64.1861 162.327C62.3963 165.665 59.9531 168.214 56.8565 169.976C53.7741 171.723 50.3082 172.597 46.4588 172.597C42.581 172.597 39.1009 171.716 36.0185 169.955C32.9361 168.193 30.5 165.643 28.7102 162.305C26.9205 158.967 26.0256 154.926 26.0256 150.182C26.0256 145.423 26.9205 141.375 28.7102 138.037C30.5 134.699 32.9361 132.156 36.0185 130.409C39.1009 128.648 42.581 127.767 46.4588 127.767C50.3082 127.767 53.7741 128.648 56.8565 130.409C59.9531 132.156 62.3963 134.699 64.1861 138.037C65.9901 141.375 66.892 145.423 66.892 150.182ZM57.5384 150.182C57.5384 147.099 57.0767 144.5 56.1534 142.384C55.2443 140.267 53.9588 138.662 52.2969 137.568C50.6349 136.474 48.6889 135.928 46.4588 135.928C44.2287 135.928 42.2827 136.474 40.6207 137.568C38.9588 138.662 37.6662 140.267 36.7429 142.384C35.8338 144.5 35.3793 147.099 35.3793 150.182C35.3793 153.264 35.8338 155.864 36.7429 157.98C37.6662 160.097 38.9588 161.702 40.6207 162.795C42.2827 163.889 44.2287 164.436 46.4588 164.436C48.6889 164.436 50.6349 163.889 52.2969 162.795C53.9588 161.702 55.2443 160.097 56.1534 157.98C57.0767 155.864 57.5384 153.264 57.5384 150.182ZM102.661 142.469C102.363 141.432 101.944 140.516 101.404 139.72C100.864 138.911 100.203 138.229 99.4222 137.675C98.6552 137.107 97.7745 136.673 96.7802 136.375C95.8001 136.077 94.7134 135.928 93.5202 135.928C91.2901 135.928 89.3299 136.482 87.6396 137.589C85.9634 138.697 84.6566 140.31 83.7191 142.426C82.7816 144.528 82.3129 147.099 82.3129 150.139C82.3129 153.179 82.7745 155.764 83.6978 157.895C84.6211 160.026 85.9279 161.652 87.6183 162.774C89.3086 163.882 91.3043 164.436 93.6055 164.436C95.6935 164.436 97.4762 164.067 98.9535 163.328C100.445 162.575 101.581 161.517 102.363 160.153C103.158 158.79 103.556 157.178 103.556 155.317L105.431 155.594H94.1808V148.648H112.441V154.145C112.441 157.98 111.631 161.276 110.012 164.031C108.392 166.773 106.162 168.889 103.321 170.381C100.48 171.858 97.2276 172.597 93.5629 172.597C89.4719 172.597 85.8782 171.695 82.7816 169.891C79.685 168.072 77.2702 165.494 75.5373 162.156C73.8185 158.804 72.9592 154.827 72.9592 150.224C72.9592 146.687 73.4705 143.534 74.4933 140.764C75.5302 137.98 76.979 135.622 78.8398 133.69C80.7006 131.759 82.8668 130.288 85.3384 129.28C87.81 128.271 90.4876 127.767 93.3711 127.767C95.8427 127.767 98.1438 128.129 100.275 128.854C102.405 129.564 104.294 130.572 105.942 131.879C107.604 133.186 108.961 134.741 110.012 136.545C111.063 138.335 111.738 140.31 112.036 142.469H102.661ZM115.834 135.97V128.364H151.672V135.97H138.312V172H129.193V135.97H115.834Z" fill="#047247"/>
											</g>
											<defs>
											<clipPath id="clip0_9972_318326">
											<rect width="176" height="176" fill="white"/>
											</clipPath>
											</defs>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">OGT<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Type of Application</p>
                                        <p class="tier-box-upper f2 pop_category"></p>
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
<script>
/* save and continue */
$(document).ready(function () {
	continueApplicationForm();
	
});

function continueApplicationForm(){
	var ogtApplicationId = "<%=ogtApplicationId%>";
	if(ogtApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();
		 naveTabCount();
	}
}
function showLastFormStep(){
	var currentStage = "<%=currentStage %>";
	console.log("Current stage****"+currentStage);
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
}
function showSelectedCategory(){
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	doYouWant="<%=doYouWant%>";
	typeOfApplicant="<%=typeOfApplicant%>";
	natureOfApplicant="<%=natureOfApplicant%>";
	typeOfMatter="<%=typeOfMatter%>";
	typeOfDebt="<%=typeOfDebt%>";
	debtStatute="<%=debtStatute%>";
	typeOfBankruptcy="<%=typeOfBankruptcy%>";
	licenceNumber="<%=licenceNumber%>";
	registeredManufacturer="<%=registeredManufacturer%>";
	$("#ogtApplicationId").val(<%=ogtApplicationId%>);
	$("#ogtApplicationLodgeTypeVal").val(doYouWant);
	$("#ogtApplicantTypeVal").val(typeOfApplicant);
	$("#ogtApplicantNatureTypeVal").val(natureOfApplicant);
	$("#ogtMatterTypeVal").val(typeOfMatter);
	$("#ogtDebtTypeVal").val(typeOfDebt);
	$("#debtStatuteBox").val(debtStatute);
	$("#ogtmanufacturerTypeVal").val(registeredManufacturer);
	$("#renew-licence-number").val(licenceNumber);
	$("#trusteeTransactionTypeVal").val(typeOfBankruptcy);
	
	/* Do you want to apply */
	if (doYouWant == "Proof of Claim"){
		$("#ogtApplicationLodgeTypeBox .wizard-card").trigger("click");
	}
	
	/* Type of Applicant */
	 if (typeOfApplicant == "Claimant"){
		$("#ogtClaimantBtn .wizard-card").trigger("click");
	}else if (typeOfApplicant == "Person Authorized by the Claimant"){
		$("#ogtAuthorizedBtn .wizard-card").trigger("click");
	}
	
	 if(typeOfApplicant !=""){
		$("#applicantType .wizard-title").each( function( index, element ){
	    if($(this).text() == typeOfApplicant){
	    	$(this).closest('a').addClass("active");
	    	}
		  });
		}
	/* Nature of Insolvent */
	 if(natureOfApplicant !=""){
		$("#natureType .wizard-title").each( function( index, element ){
	    if($(this).text() == natureOfApplicant){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	    	}
		  });
		} 
	/*registered manufacturer  */
	 if(registeredManufacturer !=""){
			$("#manufacturerType .wizard-title").each( function( index, element ){
		    if($(this).text() == registeredManufacturer){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
			$("#prospecright").removeClass("hide");
	} 
	
	/* Type of matter */
	 if(typeOfMatter !=""){
		$("#matterType .wizard-title").each( function( index, element ){
	    if($(this).text() == typeOfMatter){
	    	$(this).closest(".wizard-card").addClass("active");
	    	$(this).closest("a").click();
	    	}
		  });
		} 
	
	/*Type Of Bankruptcy  */
	 if(typeOfBankruptcy !=""){
			$("#bankruptcyType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfBankruptcy){
		    	$(this).closest(".wizard-card").addClass("active").click();
		    	/* $(this).closest("a").click(); */
		    	}
			  });
	} 
	 $("#ogt-renew-btn").click();
	 if(typeOfMatter == "Proposal"){
			$("#matterType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfMatter){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
 }
	    if(typeOfDebt !=""){
	    	var arrayOfSelected = typeOfDebt.split(",");
	    	if(arrayOfSelected.includes("Secured")) {
				$("#secured").addClass("active").click();
			}
	    	if(arrayOfSelected.includes("Unsecured")) {
	    		$("#unsecured").addClass("active").click();
			}
	    	if(arrayOfSelected.includes("Preferred")) {
	    		$("#preferred").addClass("active").click();
			}
	   }
	/* Debt statue */
		if (debtStatute != "") {
			$("#debtStatuteBox input[name='debtStatute']").each(function(index, element) {
		        if ($(this).val() == debtStatute) {
		            $(this).prop("checked", true);
		            $(this).trigger('change');
		        }
		    });
		}
	
		$("#debtStatuteBox input[name='debtStatute']").each(function(index, element) {
		    if ($(this).val() == debtStatute) {
		        $(this).prop("checked", true);
		        $(this).trigger('click'); // This triggers the click event
		    }
		});
	
		$("#applicantClaimant").each( function( index, element ){
			applicantClaimant = $(this).val();
		    if(applicantClaimant == "Individual"){
		    	$(".indi-detail").removeClass("hide");
		    	$(".com-detail").addClass("hide");
		    }else if(applicantClaimant == "Company"){
		    	$(".com-detail").removeClass("hide");
		    	$(".indi-detail").addClass("hide");
		    }
		});
		$("#insolventPersonNature").each( function( index, element ){
			insolventPersonNature = $(this).val();
		    if(insolventPersonNature == "Individual"){
		    	$(".insolvent-indi-detail").removeClass("hide");
		    	$(".insolvent-com-detail").addClass("hide");
		    }else if(insolventPersonNature == "Company"){
		    	$(".insolvent-com-detail").removeClass("hide");
		    	$(".insolvent-indi-detail").addClass("hide");
		    }
		});
		$("input:checkbox[name=category4]:checked").each(function () {
		    if($(this).val() == "Other"){
			     $(".pleaseSpecify").removeClass("hide");
			   }else{
			     $(".pleaseSpecify").addClass("hide");
			   }
			});
		$("input[name='incorporationLodged']").each(function () {
		    if($(this).val() == "The Claimant"){
			     $(this).prop("checked", true);
			   }else if($(this).val() == "claimantPosition"){
			     $(this).prop("checked", true);
			   }
			});
		
			$("input:checkbox[name=statementAccount]:checked").each(function(){
		    if($(this).val() == "Statement of account"){
			     $("#statement-of-doc").removeClass("hide");
			}if($(this).val() == "Affidavit attached and marked Schedule 'A', after deducting any counterclaims to which the debtor is entitled."){
			     $("#affidavit-attached-doc").removeClass("hide");
			 }
			});
			
			
			insolventPersonNature=$("#insolventPersonNature").val();
			insolventIndiFirstName=$("#insolventIndiFirstName").val();
			insolventIndiLastName=$("#insolventIndiLastName").val();
			insolventCompanyName=$("#insolventCompanyName").val();
			if(insolventPersonNature == "Individual"){
				insolventIndiName = insolventIndiFirstName+" "+insolventIndiLastName;
				$("#debtorName").val(insolventIndiName);
				$(".debtorName").html(insolventIndiName);
			}else{
				$("#debtorName").val(insolventCompanyName);
				$(".debtorName").html(insolventCompanyName);
			}
			
			applicantClaimant=$("#applicantClaimant").val();
			indiFirstName=$("#indiFirstName").val();
			indiLastName=$("#indiLastName").val();
			companyName=$("#companyName").val();
			if(applicantClaimant == "Individual"){
				indiName = indiFirstName+" "+indiLastName;
				$("#claimantName").val(indiName);
				$(".claimantName").html(indiName);
			}else{
				$("#claimantName").val(companyName);
				$(".claimantName").html(companyName);
			}
			gettingDocumentList();
			
			$(".completingForm").html($("#completingForm").val());
			$(".positionCompletingForm").html($("#positionCompletingForm").val());
			$(".bankruptcyDatePro").html($("#bankruptcyDatePro").val());
			$(".claimNamePerson").html($("#claimName").val());
			$(".applicationDateCa").html($("#applicationDateCa").val());
			$(".valueOfClaim").html($("#valueOfClaim").val());
			
			$(".incorporationLodged").html($("input[name='incorporationLodged']").val());
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
</script>