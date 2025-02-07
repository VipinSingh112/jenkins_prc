<%@ include file="/init.jsp" %>
<%@ include file="/jadsc-wizard.jsp"%>
 <%@ include file="/forms/jadsc-popup.jsp" %>
<jsp:include page="/js/jadsc-form-js.jsp"/>
<jsp:include page="/js/jadsc-form-save-js.jsp"/>
<portlet:resourceURL var="settingApplicationKitDocumentUrl" id="jadsc/application/kits/documents/url"></portlet:resourceURL>
<portlet:resourceURL var="submitJadscApplicationUrl" id="/submit/Jadsc/Application"></portlet:resourceURL>
<!-- DRAFT POPUP START-->
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
                        <p class="modal-subtitle f2">Your application for a Trade Remedy Investigation has been correctly saved as draft.</p>
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
                                            <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 220 239" fill="none">
                                                <path d="M101.241 3.97184C96.1479 6.31443 89.8331 13.4441 89.0183 18.0274C87.1849 27.7033 91.4627 37.0737 99.8146 41.5552C103.583 43.4904 105.518 43.8978 110.611 43.5922C118.861 43.0829 124.259 39.62 127.824 32.5922C136.685 15.1755 118.861 -3.97261 101.241 3.97184Z" fill="#047247"/>
                                                <path d="M71.5001 51.5359C65.6945 54.3877 62.3334 58.1562 59.176 65.184C57.3427 69.2581 57.0371 71.9062 57.0371 87.2859V104.906H66.2038H75.2686L75.5741 91.36L75.8797 77.9155H78.426H80.9723L81.2779 91.36L81.5834 104.906H109.491H137.5V92.3785C137.5 79.2396 138.111 76.9988 141.167 77.61C142.898 77.9155 143.102 79.1377 143.407 91.4618L143.713 104.906H152.778H161.945V88.3044C161.945 79.2396 161.435 70.0729 160.926 68.0359C159.093 61.6192 153.593 54.7951 147.685 51.7396L142.389 48.8877H109.593H76.7964L71.5001 51.5359Z" fill="#047247"/>
                                                <path d="M2.03711 122.223V134.445H12.7316H23.426V185.371V236.297H109.491H195.556V185.371V134.445H206.759H217.963V122.223V110.001H110H2.03711V122.223ZM120.898 136.991C146.056 144.426 158.482 172.028 147.074 195.352C143.306 202.991 135.769 210.325 127.62 214.195C121.204 217.251 119.982 217.454 109.898 217.454C99.3056 217.454 98.8982 217.352 91.0556 213.38C81.7871 208.695 74.7593 200.954 71.0927 191.482C68.2408 184.047 68.0371 170.806 70.6853 163.167C72.5186 157.769 78.8334 148.806 83.4167 145.139C94.1112 136.482 108.676 133.325 120.898 136.991Z" fill="#047247"/>
                                                <path d="M77.2618 186.277C77.3711 186.69 77.5613 187.077 77.8213 187.416C78.0813 187.755 78.4061 188.038 78.7766 188.25L84.9821 191.839V198.987C84.9821 199.849 85.3246 200.675 85.9342 201.285C86.5438 201.894 87.3706 202.237 88.2328 202.237H95.3809L98.9696 208.445C99.4019 209.19 100.112 209.734 100.944 209.957C101.776 210.18 102.663 210.064 103.41 209.635L109.616 206.05L115.824 209.638C116.571 210.067 117.458 210.183 118.29 209.96C119.122 209.737 119.832 209.194 120.265 208.448L123.85 202.243H130.998C131.86 202.243 132.687 201.901 133.297 201.291C133.906 200.682 134.249 199.855 134.249 198.993V191.845L140.454 188.257C140.824 188.044 141.149 187.76 141.409 187.421C141.669 187.083 141.86 186.696 141.97 186.284C142.081 185.871 142.109 185.441 142.053 185.018C141.997 184.595 141.858 184.186 141.644 183.817L138.059 177.609L141.647 171.404C142.078 170.657 142.195 169.77 141.972 168.937C141.749 168.105 141.204 167.395 140.458 166.964L134.252 163.375V156.228C134.252 155.366 133.91 154.539 133.3 153.929C132.69 153.32 131.864 152.977 131.002 152.977H123.853L120.268 146.772C119.836 146.027 119.127 145.482 118.295 145.257C117.882 145.146 117.452 145.117 117.029 145.173C116.605 145.229 116.197 145.368 115.828 145.583L109.616 149.168L103.41 145.579C103.041 145.365 102.633 145.225 102.21 145.169C101.786 145.113 101.356 145.14 100.943 145.251C100.531 145.361 100.144 145.551 99.8055 145.811C99.4668 146.071 99.1827 146.396 98.9696 146.766L95.3809 152.974H88.2328C87.3706 152.974 86.5438 153.316 85.9342 153.926C85.3246 154.536 84.9821 155.362 84.9821 156.224V163.372L78.7766 166.964C78.0312 167.396 77.4877 168.106 77.2653 168.938C77.0429 169.771 77.1597 170.657 77.5901 171.404L81.1756 177.609L77.5869 183.814C77.1575 184.56 77.0406 185.446 77.2618 186.277Z" fill="#047247"/>
                                                <path d="M98 179.282L105.115 186L121 171" stroke="white" stroke-width="5" stroke-linecap="round" stroke-linejoin="round"/>
                                                <path d="M109.5 197C120.27 197 129 188.27 129 177.5C129 166.73 120.27 158 109.5 158C98.7304 158 90 166.73 90 177.5C90 188.27 98.7304 197 109.5 197Z" stroke="white" stroke-width="5"/>
                                            </svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">ADSC Application Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Status
                                        </p>
                                        <a href="javascript:;" class="draftlink f2" id="pop_status">Draft</a>
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
                <div><a href="/home" data-senna-off="true" class="text-dark common-nav-links text-white popup-home hidePopup">
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
$(document).ready(function () {
	continueApplicationForm();
	getJadscApplicationKitUrl();
});
	
	function getJadscApplicationKitUrl(){
		 $.ajax({
            type: "POST",
            url: '${settingApplicationKitDocumentUrl}',
            success: function(data) {
            	var result = data.APP_DATA;
            	if(result!=null){
            	$("#supplement").attr("href", result["supplementUrl"]);
            	$("#tradeRemedyGuide").attr("href", result["tradeRemedyGuideUrl"]);
            	$("#handbook").attr("href", result["handBookUrl"]);
            	$("#applicationKit").attr("href", result["applicationKitUrl"]);
            	$("#dumpingAndSubsidies").attr("href", result["dumpingAndSubsidiesUrl"]);
            	}
            },
            error: function(data) {}
    });
	}
	function submitJadscApplication(){ 
		typeOfApplication=$("#applicationTypeVal").val()
		typeOfComplaint=$("#complaintTypeVal").val()
		typeOfApplicant=$("#typeOfApplicant").val()
		var industriesImpacted=[];
		$('input[name="insdustryImpacted"]:checked').each(function() {
			industriesImpacted.push($(this).val());
        });
		industriesImpactedValues=industriesImpacted.toString();
		breachOfConfidentiality=$("#designationTypeVal").val()
		var selectedValues = [];
        $('input[name="confidentialInfoCat"]:checked').each(function() {
            selectedValues.push($(this).val());
        });
		var selectedInformation=selectedValues.toString();
		confidentialStatusReason=$("#confidentialStatusReason").val()
		nonConfidentialSummary=$("#nonConfidentialSummary").val()
		jadscApplicationId=$("#jadscApplicationId").val();
		 $.ajax({
	            type: "POST",
	            url: '${submitJadscApplicationUrl}',
	            data: {
				      "<portlet:namespace/>typeOfApplication": typeOfApplication,
				      "<portlet:namespace/>typeOfComplaint": typeOfComplaint,
				      "<portlet:namespace/>typeOfApplicant": typeOfApplicant,
				      "<portlet:namespace/>industriesImpactedValues": industriesImpactedValues,
				      "<portlet:namespace/>breachOfConfidentiality": breachOfConfidentiality,
				      "<portlet:namespace/>selectedInformation": selectedInformation,
				      "<portlet:namespace/>confidentialStatusReason": confidentialStatusReason,
				      "<portlet:namespace/>nonConfidentialSummary": nonConfidentialSummary,
				      "<portlet:namespace/>jadscApplicationId": jadscApplicationId,
				    },
	            success: function(data) {
	            	var result = data.APP_DATA;
			    	var appStatus = result["appStatus"];
		    		 if(appStatus==="submitted"){
		    			$("#detail_button").removeClass("hide");
				   		$("#submitted-content").removeClass("hide");
				   		$("#application_submitted-img").removeClass("hide");
				   		$(".final-submit, .download-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
				   	}else{
				   		$("#draft-content").removeClass("hide");
				   		$("#application_draft-img").removeClass("hide");
				     	}
		    		 $(".final-submit-container .custom_loader").addClass("hide");
		    		 if(result != null){
				      $("#submit_pop_app_no").html(result["jadscApplicationNumber"]);
				      $("#submit_pop_status").html(result["appStatus"]);
				      $("#submit_pop_category").html(result["category"]);
				      $("#submitted-status").html(result["category"]);
		    		 }},
	            
	            error: function(data) {}
	    });
		}
	
/* Save And Continue */
function continueApplicationForm(){
		var jadscApplicationId = "<%=jadscApplicationId%>";
		if(jadscApplicationId > 0 ){
			showSelectedCategory();
			showLastFormStep();
			continueEditFormDetails();
			$(".form-wizard-previous-btn").removeClass("hide");
    	    $(".form-wizard-save-btn").removeClass("hide");
		}else{
			$(".form-wizard-previous-btn").addClass("hide");
	    	$(".form-wizard-save-btn").addClass("hide");
		}
		/* $(".form-wizard-previous-btn").addClass("hide");
    	$(".form-wizard-save-btn").addClass("hide"); */
	}

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
}
function showSelectedCategory(){
	sizeOfCeritificateServiceAdd = "<%=sizeOfCeritificateServiceAdd%>";
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	typeOfApplication="<%=typeOfApplication%>";
	typeOfComplaint="<%=typeOfComplaint%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	typeOfApplicant="<%=typeOfApplicant%>";
	checkListSize=<%=checkListSize%>
	sizeOfJadscChecklistAdd=<%=sizeOfJadscChecklistAdd%>
	industriesImpacted="<%=industriesImpacted%>";
	breachOfConfidentiality="<%=breachOfConfidentiality%>";
	categoriesOfConfidentialInfo="<%=categoriesOfConfidentialInfo%>";
	$("#jadscApplicationId").val(<%=jadscApplicationId%>);
	$("#applicationTypeVal").val(typeOfApplication);
	$("#complaintTypeVal").val(typeOfComplaint);
	$("#typeOfApplicant").val(typeOfApplicant);
	$("#insdustryImpactedChoiceList").val(industriesImpacted);
	$("#designationTypeVal").val(breachOfConfidentiality);
	$("#confidentialInfoCatList").val(categoriesOfConfidentialInfo); 
	if(sizeOfCeritificateServiceAdd>0){
		var counterOfCeritficateService=parseInt(sizeOfCeritificateServiceAdd)+1;
		$(".addDocServedAddressDetailTableBox").removeClass("hide");
		$("#docServedAddressVal").val(counterOfCeritficateService);
	}
	if(typeOfApplication !=""){
		$("#applicationType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfApplication){
	            $(this).closest(".wizard-card").addClass("active");
	            $(this).closest("a").click();
		    	}
			  });
		} 
	if(typeOfComplaint !=""){
		$("#complaintType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfComplaint){
	            $(this).closest(".application-type-card-title").addClass("active");
	            $(this).closest("a").click();
		    	}
			  });
		} 
	if(typeOfTransaction !=""){
		$("#transactionType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfTransaction){
	            $(this).closest(".application-type-card-title").addClass("active");
	            $(this).closest("a").click();
		    	}
			  });
		}
	
	if(typeOfApplicant !=""){
		$("#applicationType .wizard-title").each( function( index, element ){
		    if($(this).text() == typeOfApplicant){
	            $(this).closest(".wizard-card").addClass("active");
	            $(this).closest("a").click();
		    	}
			  });
		} 
	 if(breachOfConfidentiality !=""){
	     if(sizeOfJadscChecklistAdd>0){
	    	 var counterOfJadscChecklistAdd=parseInt(sizeOfJadscChecklistAdd)+1;
	    	 $(".addChecklistDetailTableBox").removeClass("hide");
	    	 $("#checklistVal").val(sizeOfJadscChecklistAdd);
	     }
	$(".designation-type .wizard-title").each(function(index, element) {
				if ($(this).text() == breachOfConfidentiality) {
					$(this).closest(".wizard-card").addClass("active");
					$(this).closest("a").click();
				}
			});
	for (i = 0; i <= 15; i++) {
		if ($("#informationRegComplaint" + i).length > 0) { // Check if element exists
			informationRegComplaintChecked = $(
					"#informationRegComplaint" + i).is(':checked');
			if (informationRegComplaintChecked) {
				$("#checklistOther" + i).removeClass("hide");
			}
		}
	}
	/*for unhide the pleaseSpecify input in the click of other in confidential Info Category  */
	     $("input:checkbox[name=confidentialInfoCat]:checked").each(
			function() {
				if ($(this).val() == "Other") {
					$(".confidentialInfoCatOtherBox").removeClass(
							"hide");
				} else {
					$(".confidentialInfoCatOtherBox").addClass("hide");
				}
			});
	
	/*for unhide the Description textarea in the click of checkbox In checklist form  */
	$("input:checkbox[name=informationRegComplaint]").each(
			function() {
				if ($(this).prop("checked")) {
					$(this).parent().next('.checklistOtherBox')
							.removeClass("hide");
				}
			});

	}
		if (typeOfApplicant == "Acting on Behalf of Company E.g. Legal Council") {
			$(".confidential-ver-forms").removeClass("hide");
		}

		$(".investigation-type").html($("#investigationType").val());
		$(".party-name").html($("#partyName").val());
		$(".request-reason").html($("#requestReason").val());
		$(".company-official").html($("#comOfficial").val());
		$(".signature-date").html($("#signatureDate").val());

		// CERTIFICATE SERVICE FORM
		$(".doc-submit-date").html($("#docSubmitDate").val());

		// CERTIFICATE VERACITY FORM
		$(".veracity-com-name").html($("#veracityComName").val());
		$(".veracity-com-position").html($("#veracityComPosition").val());
		$(".veracity-com-company").html($("#veracityComCompany").val());

		// APPEARANCE NOTICE
		$(".appearance-notice-full-name").html($("#appearanceNoticeFullName").val());
		$(".appearance-notice-date").html($("#appearanceNoticeDate").val());
		$(".appearance-notice-address-one").html($("#appearanceNoticeAddressOne").val());
		gettingDocumentList();
	}
	function continueEditFormDetails() {
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
    
$(".hidePopup").click(function () {
	 $(".editDocServedAddressTabPopup").modal("hide");
	 $(".editChecklistDetailEditTabPopup").modal("hide");
});
	
</script>