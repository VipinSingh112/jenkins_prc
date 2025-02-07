<%@page import="com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant"%>
<%@ include file="/init.jsp" %>
<%@ include file="/mining-lease-wizard.jsp" %>
<%@ include file="/mining-lease-popup.jsp" %>
<jsp:include page="/js/prospecting-licence-js.jsp"/>
<portlet:resourceURL var="applyForLicenceUrl" id="/mining/apply/valid/license"></portlet:resourceURL>
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
                        <p class="modal-subtitle f2">Your application for a <span id="licenceTransactionDraft"></span> has been correctly saved as draft.</p>
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
                                            <svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none"> 
			                                     <path d="M144.375 144.375H75.625C56.375 144.375 41.25 159.5 41.25 178.75V199.375C41.25 202.812 44.6875 206.25 48.125 206.25H171.875C175.312 206.25 178.75 202.812 178.75 199.375V178.75C178.75 159.5 163.625 144.375 144.375 144.375ZM108.625 178.75L99.6875 158.125H114.813L108.625 178.75ZM110 13.75C106.562 13.75 103.125 17.1875 103.125 20.625V28.1875C79.75 31.625 61.875 51.5625 61.875 75.625V82.5C58.4375 82.5 55 85.9375 55 89.375C55 92.8125 58.4375 96.25 61.875 96.25H69.4375C72.875 115.5 89.375 130.625 110 130.625C130.625 130.625 147.125 115.5 150.562 96.25H158.125C161.562 96.25 165 92.8125 165 89.375C165 85.9375 161.562 82.5 158.125 82.5V75.625C158.125 51.5625 140.25 31.625 116.875 28.1875V20.625C116.875 17.1875 113.438 13.75 110 13.75ZM105.188 57.0625C107.938 54.3125 112.063 54.3125 114.813 57.0625C116.188 58.4375 116.875 59.8125 116.875 61.875C116.875 63.9375 116.188 65.3125 114.813 66.6875C113.438 68.0625 112.063 68.75 110 68.75C107.937 68.75 106.563 68.0625 105.188 66.6875C103.813 65.3125 103.125 63.9375 103.125 61.875C103.125 59.8125 103.813 58.4375 105.188 57.0625ZM136.812 96.25C133.375 107.938 123.062 116.875 110 116.875C96.9375 116.875 86.625 107.938 83.1875 96.25H136.812Z" fill="#047247"></path> 
			                                </svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">Mining Lease Application<br> Transaction Number</p>
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
});
function continueApplicationForm(){
	var miningApplicationId = "<%=miningApplicationId%>";
	if(miningApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();
	}
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
function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormStep%>";
	$(".tab-content .tab-pane").each(function(index, element) {
		if ($(this).attr("id") == lastFormStep) {
			$(this).addClass("active");
			$(this).prevAll().removeClass("active");
			$(this).nextAll().removeClass("active");
		}
	});
	$(".tab-plus-wizard-left li a").each(function(index, element) {
			if ($(this).attr("href") == "#" + lastFormStep) {
				$(this).parents().prevAll("li").find("a").removeClass("active disabled");
				$(this).addClass("active");
				$(this).removeClass("disabled");
			}
		});
}
function showSelectedCategory(){
		sizeOfLicDiretorDetailAdd="<%=sizeOfLicDiretorDetailAdd%>";
		currentStage = "<%=currentStage%>";
		lastFormStep = "<%=lastFormStep%>";
		typeOfApplicant="<%=typeOfApplicant%>";
		prospectingRightsTransactionType="<%=prospectingRightsTransactionType%>";
		prospectingLicenceTransactionType="<%=prospectingLicenceTransactionType%>";
		miningLicenceTransactionType="<%=miningLicenceTransactionType%>";
		areaDelination="<%=areaDelination%>";
		licenceExclusiveSpecial="<%=licenceExclusiveSpecial%>";
		areaDelinationTotalApprox="<%=areaDelinationTotalApprox%>";
		miningMineralsTypeVal="<%=miningMineralsTypeVal%>";
		sizeOfLicDiretorDetailAdd="<%=sizeOfLicDiretorDetailAdd%>";
		otherMineral="<%=otherMineral%>";
		paymentMethod="<%=paymentMethod%>";
		copyOfArticles="<%=copyOfArticles%>";
		var separator = ',';
	    var resultArr = miningMineralsTypeVal.split(separator);
	    $("#miningLeaseApplicationId").val(<%=miningApplicationId%>);
		$("#miningApplicantionType").val(typeOfApplicant);
		$("#prospectingRightsTransactionTypeVal").val(prospectingRightsTransactionType);
		$("#prospectingLicenceTransactionTypeVal").val(prospectingLicenceTransactionType);
		console.log("prospectingLicenceTransactionType***"+prospectingLicenceTransactionType);
		$("#miningLicenceTransactionTypeVal").val(miningLicenceTransactionType);
		$("#areaDelination").val(areaDelination);
		$("#leaseAreaDelination").val(areaDelination);
		$("#prospectingLicenceProspectingTypeVal").val(licenceExclusiveSpecial);
		$("#miningLeaseTypeVal").val(licenceExclusiveSpecial);
		$("#payment-method").val(paymentMethod);
		$("#miningMineralsTypeVal").val(miningMineralsTypeVal);
		gettingDocumentList();	    
	    $("#miningApplicantionType").val(typeOfApplicant);	    
	    if (typeOfApplicant != "") {
			$("#miningApplicatonType .wizard-title span").each(function(index, element) {
				if ($(this).text() == typeOfApplicant) {
					$(this).closest('.wizard-card').addClass("active");
				}
			});
	    }
	    if(typeOfApplicant=="Prospecting Rights"){
	    	$("#prospectingRightsTransactionTypeBox").removeClass("hide");
	    	  if (prospectingRightsTransactionType != "") {
	  			$("#prospectingRightsTransactionTypeBox .wizard-title").each(function(index, element) {
	  				if ($(this).text() == prospectingRightsTransactionType) {
	  					$(this).closest('a').click();
	  				}
	  			});
	  	    }
    		$(".prospectingRightsForm").removeClass("hide");
			$(".prospectingRightsForm .tab-pane:first").addClass("active");
			$(".prospectingRightsForm .nav-link:first").addClass("active");
			$(".prospectingRightsForm .nav-link:first").removeClass("disabled");
			$(".mining-prospecting-licence-forms").addClass("hide");
			$("#rightFeeIcon").removeClass("hide");
			$("#licenceFeeIcon, #leaseFeeIcon").addClass("hide");
			$("#payment_category").html("Prospecting Rights");
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
			var form3Doc='<%=formRightDoc%>';
			if (form3Doc != null) {
			    $(".principal-attachment").html("13.I attach hereto from my principal an undertaking in the prescribed form.");
			    $("#principal-attachment-preview").html("<%= formRightDoc %>");
			}
			userName=$("#applicantName").val();
			if(userName!=null){
				$(".user-name").html(userName);
			}
	    }
    if(typeOfApplicant=="Prospecting Licence"){
    	$("#prospectingLicenceSection").removeClass("hide");
    	$("#prospectingLicenceTransactionTypeBox").removeClass("hide");
    	  if (prospectingLicenceTransactionType != "") {
  			$("#prospectingLicenceTransactionTypeBox .wizard-card-title").each(function(index, element) {
  				if ($(this).text() == prospectingLicenceTransactionType) {
  					$(this).closest('a').click();
  				}
  			});
  	    }
    		delArea='<%=delinationOfArea%>';
			if(delArea!=null){
				$("input[name='areaDelination'][value='" + delArea + "']").prop("checked", true);
			}
			prospectingRightNumber='<%=prospectingRightNumber%>';
			if(prospectingRightNumber!=null){
				$("#prospecting-licence-number").val(prospectingRightNumber);
			}
		     if(prospectingLicenceTransactionType=="New" || prospectingLicenceTransactionType == "Renewal & Amendment"|| prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
		    	  if(prospectingLicenceTransactionType=="New"){
		    	    $(".mining-prospecting-licence-forms").removeClass("hide");
					$(".mining-prospecting-licence-forms .tab-pane:first").addClass("active");
					$(".mining-prospecting-licence-forms .nav-link:first").addClass("active");
					$(".mining-prospecting-licence-forms .nav-link:first").removeClass("disabled");
		    	  }
		    	  if(prospectingLicenceTransactionType == "Renewal & Amendment" || prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
		  		    $(".mining-prospecting-renewal-licence-forms").removeClass("hide");
		  		    $(".mining-prospecting-licence-forms").addClass("hide");
					$(".mining-prospecting-renewal-licence-forms .tab-pane:first").addClass("active");
					$(".mining-prospecting-renewal-licence-forms .nav-link:first").addClass("active");
					$(".mining-prospecting-renewal-licence-forms .nav-link:first").removeClass("disabled");
		    	  }
		    	 $("#prospectingLicenceRenewAreaSection").removeClass("hide");
		    	 $("#totalApproxAreaDelination").removeClass("hide");

                  if(licenceExclusiveSpecial=="EPL-Exclusive Prospecting Licence"){ 
                	  $("#prospectingLicenceExclusiveBtn .wizard-card").trigger("click");
		          }
		    	   $("#miningLicenceRenewSection").addClass("hide");
		    	   $("#miningLicenceRenewAreaSection").addClass("hide");
		    	    if(licenceExclusiveSpecial=="EPL-Exclusive Prospecting Licence"){
				    	$("#prospectingLicenceSpecialBtn").addClass("hide");
				    	$("#prospectingLicenceExclusiveBtn").removeClass("hide");
				    	$(this).closest("a").click();
				    }
		    	 $("#prospectingLicenceProspectingTypeBox").removeClass("hide");
		    	if (miningMineralsTypeVal != "") {
		  			$("#mineralsType .wizard-title").each(function(index, element) {
		  				if ($(this).text() == miningMineralsTypeVal) {
		  					$(this).closest('a').click();
		  				}
		  			});
		  	    }
		     }else if(prospectingLicenceTransactionType === "Additional Minerals" ||prospectingLicenceTransactionType === "Transfer" ||  prospectingLicenceTransactionType === "Surrender"){
					  $("#prospectingLicenceRenewSection").removeClass("hide");
					   if(prospectingLicenceTransactionType === "Additional Minerals"){
							$(".mining-prospecting-licence-forms").removeClass("hide");
							$(".mining-prospecting-licence-forms .tab-pane:first").addClass("active");
							$(".mining-prospecting-licence-forms .nav-link:first").addClass("active");
							$(".mining-prospecting-licence-forms .nav-link:first").removeClass("disabled");
					  }if(prospectingLicenceTransactionType === "Transfer"){
						    $(".mining-transfer-forms").removeClass("hide");
							$(".mining-transfer-forms .tab-pane:first").addClass("active");
							$(".mining-transfer-forms .nav-link:first").addClass("active");
							$(".mining-transfer-forms .nav-link:first").removeClass("disabled"); 
					  }if(prospectingLicenceTransactionType === "Surrender"){
							$(".mining-surrender-forms").removeClass("hide");
							$(".mining-surrender-forms .tab-pane:first").addClass("active");
							$(".mining-surrender-forms .nav-link:first").addClass("active");
							$(".mining-surrender-forms .nav-link:first").removeClass("disabled");
					  }
               }
			$("#payment_category").html("Prospecting Licence");	
			$("#licenceFeeIcon").removeClass("hide");
			$("#rightFeeIcon, #leaseFeeIcon").addClass("hide");
			
			if(prospectingLicenceTransactionType === "Additional Minerals"){
				$(".miningFacilitiesFee").html("2000.00");
			}
			if(sizeOfLicDiretorDetailAdd>0){
				var counterOfDirectorDetail=parseInt(sizeOfLicDiretorDetailAdd)+1;
				$(".addDirectorDetailTableBox").removeClass("hide");
				$("#miningDirectorDetailVal").val(counterOfDirectorDetail);
			}
	}		
     if(typeOfApplicant=="Mining Lease"){
    	 approValueMining='<%=delinationOfAreaTotalApprox%>';
			if(approValueMining!=null){
				$("#miningAreaDelinationTotalApprox").val(approValueMining);
			}
		 $("#miningLicenceTransactionTypeBox").removeClass("hide");
    	 if (miningLicenceTransactionType != "") {
   			$("#miningLicenceTransactionTypeBox .wizard-card-title").each(function(index, element) {
   				if ($(this).text() == miningLicenceTransactionType) {
   					$(this).closest('a').click();
   				     $(this).addClass('active');
   				}
   			});
   	    }
         if(miningLicenceTransactionType=="New"){
		    	$("#miningLicenceRenewAreaSection").removeClass("hide");
		    	$("#totalApproxLicenceAreaDelineation").removeClass("hide");
		    	  if(licenceExclusiveSpecial=="ML-Mining Lease"){ 
                	  $("#prospectingLicenceExclusiveBtn .wizard-card").trigger("click");
                	  $("#prospectingLicenceExclusiveBtn .wizard-card").addClass("active");
		          }
		    	  if (miningMineralsTypeVal != "") {
			  			$("#mineralsType .wizard-title").each(function(index, element) {
			  				if ($(this).text() == miningMineralsTypeVal) {
			  					$(this).closest('a').click();
			  				}
			  			});
			  	    }
         } 
         if(miningLicenceTransactionType==="Renewal"|| miningLicenceTransactionType==="Temporary Permission" ||
        		 miningLicenceTransactionType==="Transfer"|| miningLicenceTransactionType==="Surrender"|| miningLicenceTransactionType==="Amendment"){
        	 $("#miningLicenceRenewSection").removeClass("hide");
        	 
         }
			$("#payment_category").html("Mining Lease");
			$("#leaseFeeIcon").removeClass("hide");
			$("#rightFeeIcon, #licenceFeeIcon").addClass("hide");
     }
     if(sizeOfLicDiretorDetailAdd>0){
 		var counterOfDirectorDetail=parseInt(sizeOfLicDiretorDetailAdd)+1;
 		$(".addDirectorDetailTableBox").removeClass("hide");
 		$("#directorDetailVal").val(counterOfDirectorDetail);
 	}
     if(copyOfArticles=="Yes"){
    	 $("#other-copy").addClass("hide");
     }else if(copyOfArticles=="No"){
    	 $("#other-copy").removeClass("hide"); 
     }
    miningApplicantionType = $("#miningApplicantionType").val();
    if(miningApplicantionType == "Prospecting Licence"){ 
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
		
	}
	prospectingRightNumber='<%=prospectingRightNumber%>';
	$("#prospecting-licence-number").val(prospectingRightNumber);
	   if(prospectingLicenceTransactionType == "Renewal &amp; Amendment"){
			$("#prospectingLicenceRenewAreaSection").removeClass("hide");
			$("#totalApproxAreaDelination").removeClass("hide");
			 plAdditionalMinerals='<%=delinationOfAreaTotalApprox%>';
				if(plAdditionalMinerals!=null){
					$("#areaDelinationTotalApprox").val(plAdditionalMinerals);
				}
				$("#prospectingLicenceProspectingTypeBox").removeClass("hide");
				$("#mineralsType").removeClass("hide");
				var amProspectingLic = $("#miningMineralsTypeVal").val();
				if (amProspectingLic != "") {
			        $("#mineralsType  .wizard-title").each(function () {
			            if ($(this).text().trim() === amProspectingLic.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				proType=$("#prospectingLicenceProspectingTypeVal").val();
				 $("#prospectingLicenceProspectingTypeBox  .wizard-title").each(function () {
			            if ($(this).text().trim() === proType.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
				 renewNum='<%=renewNum%>';
					$("#renew-licence-numb").val(renewNum);
			if(prospectingLicenceProspectingType == "EPL-Exclusive Prospecting Licence"){
				$(".miningFacilitiesFee").html("5,000.00");
			}
			if(prospectingLicenceProspectingType == "SEPL-Special Exclusive Prospecting Licence"){
				km2Value = $("#areaDelinationTotalApprox").val();
				var fee = km2Value * 1000000 * 400; 
				$(".miningFacilitiesFee").html(fee.toFixed(2));
			}
		}else if(prospectingLicenceTransactionType == "Additional Minerals"){
			$("#prospectingLicenceRenewAreaSection").removeClass("hide");
			$("#totalApproxAreaDelination").removeClass("hide");
			renewNum='<%=renewNum%>';
			$("#renew-licence-numb").val(renewNum);
			 plAdditionalMinerals='<%=delinationOfAreaTotalApprox%>';
				if(plAdditionalMinerals!=null){
					$("#areaDelinationTotalApprox").val(plAdditionalMinerals);
				}
				$("#prospectingLicenceProspectingTypeBox").removeClass("hide");
				$("#mineralsType").removeClass("hide");
				var amProspectingLic = $("#miningMineralsTypeVal").val();
				if (amProspectingLic != "") {
			        $("#mineralsType  .wizard-title").each(function () {
			            if ($(this).text().trim() === amProspectingLic.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				proType=$("#prospectingLicenceProspectingTypeVal").val();
				 $("#prospectingLicenceProspectingTypeBox  .wizard-title").each(function () {
			            if ($(this).text().trim() === proType.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
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
		}else if(prospectingLicenceTransactionType == "Transfer" || (prospectingLicenceTransactionType == "Surrender")){
			renewNum='<%=renewNum%>';
			$("#renew-licence-numb").val(renewNum);
			$(".miningFacilitiesFee").html("1000.00");
			$("#prospectingLicenceRenewAreaSection").removeClass("hide");
			$("#totalApproxAreaDelination").removeClass("hide");
			 plAdditionalMinerals='<%=delinationOfAreaTotalApprox%>';
				if(plAdditionalMinerals!=null){
					$("#areaDelinationTotalApprox").val(plAdditionalMinerals);
				}
				$("#prospectingLicenceProspectingTypeBox").removeClass("hide");
				$("#mineralsType").removeClass("hide");
				var amProspectingLic = $("#miningMineralsTypeVal").val();
				if (amProspectingLic != "") {
			        $("#mineralsType  .wizard-title").each(function () {
			            if ($(this).text().trim() === amProspectingLic.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				var doc1='<%=formTransAssosDoc%>'
					$(".statement-transfer").html("If a copy of the Memorandum and Article of Association has not already been lodged with the Commissioner a copy must be enclosed herewith")
					$("#statement-transfer-preview").html(doc1)
					
					var doc2='<%=formTransPosDoc%>'
					$(".detail-association-transfer").html("A financial statement of the position of the applicant is appended hereto.")
					$("#detail-association-transfer-preview").html(doc2)
				proType=$("#prospectingLicenceProspectingTypeVal").val();
				 $("#prospectingLicenceProspectingTypeBox  .wizard-title").each(function () {
			            if ($(this).text().trim() === proType.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
				 renewNum='<%=renewNum%>';
					$("#renew-licence-numb").val(renewNum);
		}
	   leaseAreaDelination =$("input[name='areaDelination']:checked").val();
	   if(leaseAreaDelination == "An Area Approximately  18 KM2 or less"){
			  $("#prospectingLicenceExclusiveBtn").removeClass("hide");
		   }else if(leaseAreaDelination == "An Area Greater than 18 KM2"){
			   $("#prospectingLicenceSpecialBtn").removeClass("hide");
		   }
    }
    if(miningApplicantionType == "Mining Lease"){
    	prospectingRightNumber='<%=prospectingRightNumber%>';
    	prospectingLicenceNumber='<%=prospectingLicenceNumber%>';
		if(prospectingRightNumber!=null){
			$("#mining-prospecting-right-number").val(prospectingRightNumber);
		}
		if(prospectingLicenceNumber!=null){
			$("#mining-prospecting-licence-number").val(prospectingLicenceNumber);
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
	}else if(miningLicenceTransactionType == "Temporary Permission"){
		$(".miningFacilitiesFee").html("10,000.00");
	}else if(miningLicenceTransactionType == "Transfer" || miningLicenceTransactionType == "Surrender"){
		$(".miningFacilitiesFee").html("5000.00 ");
	}
		 delAreaMining='<%=delinationOfArea%>';
			if(delAreaMining!=null){
				$("input[name='leaseAreaDelination'][value='" + delAreaMining + "']").prop("checked", true);
			}
    }
		if(miningApplicantionType == "Mining Lease"){
			var typeofTransaction = $("#miningLicenceTransactionTypeVal").val();
			$("#miningLicenceRenewAreaSection").removeClass("hide");
			$("#totalApproxLicenceAreaDelineation").removeClass("hide");
			$("#mineralsType").removeClass("hide");
			debugger;
			 renewApproxVal='<%=delinationOfAreaTotalApprox%>';
				if(renewApproxVal!=null){
					$("#miningAreaDelinationTotalApprox").val(renewApproxVal);
				}
				var miningLeaseTypeValRen = $("#miningLeaseTypeVal").val();
				if (miningLeaseTypeValRen != "") {
			        $("#miningLeaseTypeBox .wizard-card-content-box .wizard-title").each(function () {
			            if ($(this).text().trim() === miningLeaseTypeValRen.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				var miningLeaseMinTypeValRen = $("#miningMineralsTypeVal").val(); 
				if (miningLeaseMinTypeValRen != "") {
				    $("#mineralsType .wizard-title").each(function () {
				        if ($(this).text().trim() === miningLeaseMinTypeValRen.trim()) {
				            $(this).closest('.wizard-card').addClass('active'); // Add the active class to the matching card
				        }
				    });
				}
				if(miningLeaseMinTypeValRen=='Other'){
					$("#otherMineralBox").removeClass('hide');
				}
			if(typeofTransaction=="New" || typeofTransaction=="Temporary Permission"){
				$(".mining-surrender-forms").addClass("hide");
				$(".mining-transfer-forms").addClass("hide");
				$(".prospecting-licence-details-forms").addClass("hide");
				$("#mining-form-5-btn").addClass("hide");
				$(".miningLeaseForm .tab-pane:first").addClass("active");
				$(".miningLeaseForm .nav-link:first").addClass("active");
				$(".miningLeaseForm .nav-link:first").removeClass("disabled");
			}
			if(typeofTransaction=="Renewal"){
				$(".mining-surrender-forms").addClass("hide");
				$(".mining-transfer-forms").addClass("hide");
				$(".prospecting-licence-details-forms").addClass("hide");
				$("#mining-form-5-btn").addClass("hide");
				$(".miningLeaseRenewalForms").removeClass("hide");
				$(".miningLeaseRenewalForms .tab-pane:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").addClass("active");
				$(".miningLeaseRenewalForms .nav-link:first").removeClass("disabled");
				$("#miningLicenceRenewAreaSection").removeClass("hide");
				$("#totalApproxLicenceAreaDelineation").removeClass("hide");
				$("#mineralsType").removeClass("hide");
				 renewApproxVal='<%=delinationOfAreaTotalApprox%>';
					if(renewApproxVal!=null){
						$("#miningAreaDelinationTotalApprox").val(renewApproxVal);
					}
					var miningLeaseTypeValRen = $("#miningLeaseTypeVal").val();
					if (miningLeaseTypeValRen != "") {
				        $("#miningLeaseTypeBox .wizard-card-content-box .wizard-title").each(function () {
				            if ($(this).text().trim() === miningLeaseTypeValRen.trim()) {
				                $(this).closest('.wizard-card').addClass('active');
				            }
				        });
				    }
					var miningLeaseMinTypeValRen = $("#miningMineralsTypeVal").val(); 
					if (miningLeaseMinTypeValRen != "") {
					    $("#mineralsType .wizard-title").each(function () {
					        if ($(this).text().trim() === miningLeaseMinTypeValRen.trim()) {
					            $(this).closest('.wizard-card').addClass('active'); // Add the active class to the matching card
					        }
					    });
					}
					if(miningLeaseMinTypeValRen=='Other'){
						$("#otherMineralBox").removeClass('hide');
					}
					docNameRenewAta='<%=docRenewMLSKDoc%>';
						renewNum='<%=renewNum%>';
					$(".approximateRenewalLease").html('If the application is for any area less than the area covered by the lease a sketch plan as required by the regulations must be attached and the delineation with the beacon set out.')
					$("#approximateRenewalLease-preview").html(docNameRenewAta);
					$("#renew-lic-number").val(renewNum);
			}
			if(typeofTransaction === "Transfer"){
				$("#miningLicenceRenewAreaSection").removeClass("hide");
				$("#totalApproxLicenceAreaDelineation").removeClass("hide");
				$(".mining-prospecting-licence-forms").addClass("hide");
				
				$("#mineralsType").removeClass("hide");
				var miningLeaseMinTypeValRen = $("#miningMineralsTypeVal").val(); 
				if (miningLeaseMinTypeValRen != "") {
				    $("#mineralsType .wizard-title").each(function () {
				        if ($(this).text().trim() === miningLeaseMinTypeValRen.trim()) {
				            $(this).closest('.wizard-card').addClass('active'); // Add the active class to the matching card
				        }
				    });
				}
				
				if(miningLeaseMinTypeValRen=='Other'){
					$("#otherMineralBox").removeClass('hide');
				}
				var miningLeaseTypeValRen = $("#miningLeaseTypeVal").val();
				if (miningLeaseTypeValRen != "") {
			        $("#miningLeaseTypeBox .wizard-card-content-box .wizard-title").each(function () {
			            if ($(this).text().trim() === miningLeaseTypeValRen.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				var titlesToActivate = $("#miningMineralsTypeVal").val();
				var titlesArray = titlesToActivate.split(',');
				$("#mineralsType .wizard-title").each(function () {
				    if (titlesArray.includes($(this).text().trim())) {
				        $(this).closest('.wizard-card').addClass('active');
				    } else {
				        $(this).closest('.wizard-card').removeClass('active');
				    }
				});
				renewNum='<%=renewNum%>';
				$("#renew-lic-number").val(renewNum);
				 if(sizeOfLicDiretorDetailAdd>0){
				 		var counterOfDirectorDetailTransfer=parseInt(sizeOfLicDiretorDetailAdd)+1;
				 		$(".addTransferDirectorDetailTableBox").removeClass("hide");
				 		$("#miningDirectorDetailVal").val(counterOfDirectorDetailTransfer);
				 	}
				 statementtransfer='<%=mlTRDocDoc%>';
					 $(".statement-transfer").html("A financial statement of the position of the applicant is appended hereto.");
					 $(".detail-association-transfer").html("If a copy of the Memorandum and Article of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
				 copRandom='<%=mlTRDocDoc2%>';
					 $("#statement-transfer-preview").html(statementtransfer);
					 $("#detail-association-transfer-preview").html(copRandom);
			}
			if(typeofTransaction === "Temporary Permission"){
				$("#totalApproxLicenceAreaDelineation").removeClass("hide");
				$("#mineralsType").removeClass("hide");
				var miningLeaseMinTypeValRen = $("#miningMineralsTypeVal").val(); 
				if (miningLeaseMinTypeValRen != "") {
				    $("#mineralsType .wizard-title").each(function () {
				        if ($(this).text().trim() === miningLeaseMinTypeValRen.trim()) {
				            $(this).closest('.wizard-card').addClass('active'); 
				        }
				    });
				}
				if(miningLeaseMinTypeValRen=='Other'){
					$("#otherMineralBox").removeClass('hide');
				}
				var miningLeaseTypeValRen = $("#miningLeaseTypeVal").val();
				if (miningLeaseTypeValRen != "") {
			        $("#miningLeaseTypeBox .wizard-card-content-box .wizard-title").each(function () {
			            if ($(this).text().trim() === miningLeaseTypeValRen.trim()) {
			                $(this).closest('.wizard-card').addClass('active');
			            }
			        });
			    }
				var titlesToActivate = $("#miningMineralsTypeVal").val();
				var titlesArray = titlesToActivate.split(',');
				$("#mineralsType .wizard-title").each(function () {
				    if (titlesArray.includes($(this).text().trim())) {
				        $(this).closest('.wizard-card').addClass('active');
				    } else {
				        $(this).closest('.wizard-card').removeClass('active');
				    }
				});
				renewNum='<%=renewNum%>';
				$("#renew-lic-number").val(renewNum);
			}
			if(typeofTransaction === "Surrender"){
				renewNum='<%=renewNum%>';
				$("#renew-lic-number").val(renewNum);
				var titlesToActivate = $("#miningMineralsTypeVal").val();
				var titlesArray = titlesToActivate.split(',');
				$("#mineralsType .wizard-title").each(function () {
				    if (titlesArray.includes($(this).text().trim())) {
				        $(this).closest('.wizard-card').addClass('active');
				    } else {
				        $(this).closest('.wizard-card').removeClass('active');
				    }
				});
				
				if(miningLeaseMinTypeValRen=='Other'){
					$("#otherMineralBox").removeClass('hide');
				}
				$(".mining-prospecting-licence-forms").addClass("hide");
			}
			if(typeofTransaction === "Amendment"){
				$(".mining-lease-surrender-details-forms").addClass("hide");
				$(".mining-lease-transfer-details-forms").addClass("hide");
				$(".mining-prospecting-licence-forms").addClass("hide");
				$(".mining-transfer-forms").addClass("hide");
				$(".mining-surrender-forms").addClass("hide");
				var titlesToActivate = $("#miningMineralsTypeVal").val();
				var titlesArray = titlesToActivate.split(',');
				$("#mineralsType .wizard-title").each(function () {
				    if (titlesArray.includes($(this).text().trim())) {
				        $(this).closest('.wizard-card').addClass('active');
				    } else {
				        $(this).closest('.wizard-card').removeClass('active');
				    }
				});
				renewNum='<%=renewNum%>';
				docNameRenewAta='<%=docRenewMLSKDoc%>';
				$("#renew-lic-number").val(renewNum);
				$(".approximateRenewalLease").html('If the application is for any area less than the area covered by the lease a sketch plan as required by the regulations must be attached and the delineation with the beacon set out.')
				$("#approximateRenewalLease-preview").html(docNameRenewAta);
			}
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
				   }
			 }else{
				 $("#miningAreaDelinationTotalApproxValidation").removeClass("hide");
				 $("#miningLeaseTypeBox, #miningLeaseMLBtn, #miningLeaseSpecialBtn, #mineralsType").addClass("hide");
				 
			 }
				$("#miningLicenceSection").removeClass("hide");
				$("#continue-to-form-mining-btn").removeClass("hide");
				 if(sizeOfLicDiretorDetailAdd>0){
				 		var counterOfDirectorDetail=parseInt(sizeOfLicDiretorDetailAdd)+1;
				 		$(".addMiningDirectorDetailTableBox").removeClass("hide");
				 		$("#miningDirectorDetailVal").val(counterOfDirectorDetail);
				 	}
				 statPosDocName='<%=statPosDocName%>';
				 if(statPosDocName!=null){
					 $("#mining-lease-fin-stat").html(statPosDocName);
					 $(".financial-statement").html("A financial statement of the position of the applicant is appended here to");
					 $("#financial-statement-preview").html(statPosDocName);
				 }
				 lsDocName='<%=lsDocName%>';
				 if(lsDocName!=null){
					 $("#sketch-plan-lease-min").html(lsDocName);
					 $(".sketchPlan").html("A sketch plan as required by the Regulations is attached here to");
					 $("#sketchPlan-preview").html(lsDocName);
				 }
				 copyOfMamoDocName='<%=copyOfMamoDocName%>';
				 if(copyOfMamoDocName!=null){
					 $("#copyMemorandumArticles").html(copyOfMamoDocName);
					 $(".commissionerCopy").html("In a case of an application by a company if a copy of the Memorandum and Articles of Association has not already been lodged with the Commissioner a copy must be enclosed herewith.");
					 $("#commissionerCopy-preview").html(copyOfMamoDocName);
				 }
		}
		if(miningApplicantionType == "Prospecting Licence"){ 
			debugger;
			if(prospectingLicenceTransactionType == "Additional Minerals"){
				renewNum='<%=renewNum%>';
				$("#renew-licence-numb").val(renewNum);
			}
			
			var amProspectingLic = $("#miningMineralsTypeVal").val();
			if (amProspectingLic != "") {
			    // Split the value into an array
			    var selectedMinerals = amProspectingLic.split(',');
			    
			    // Iterate through each card and check if it matches any of the selected minerals
			    $("#mineralsType .wizard-title").each(function () {
			        var cardTitle = $(this).text().trim();
			        if (selectedMinerals.includes(cardTitle)) {
			            $(this).closest('.wizard-card').addClass('active');
			        }
			    });
			}
			if(miningLeaseMinTypeValRen=='Other'){
				$("#otherMineralBox").removeClass('hide');
			}
		}
    previewOfFormsProspectingRight();
     
}
$(".hidePopup").click(function () {
	$(".editLicenceDirectorDetailEditTabPopup").modal("hide");
	$(".editTransferDirectorDetailEditTabPopup").modal("hide");
	$(".editMiningDirectorDetailEditTabPopup").modal("hide");
});

function validMiningApplication(){	
	var licenseNumber= null;
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	typeOfApplicant = $("#miningApplicantionType").val();
    $(".wizard-next-btn").attr("disabled", "disabled"); 
	if(typeOfApplicant=="Prospecting Licence"){
		 $("#prosp-lic-renew-btn").attr("disabled", "disabled"); 
		 $("#prospectingLicenceNumberValidation").addClass("hide");
		 licenseNumber = $("#prospecting-licence-number").val();
	   }else{
		   $("#right-lic-renew-btn").attr("disabled", "disabled"); 
			 $("#prospectingRightsLicNumberValidation").addClass("hide");
			 leaseProspLicNumber = $("#mining-prospecting-licence-number").val();
			 leaseProspRightsNumber = $("#mining-prospecting-right-number").val();
	   }
		
	 $.ajax({
		    type: "POST",
		    url: "${applyForLicenceUrl}",
		    data: {
		    	  "<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
			      "<portlet:namespace/>licenseNumber":licenseNumber,
			      "<portlet:namespace/>leaseProspRightsNumber":leaseProspRightsNumber,
			      "<portlet:namespace/>leaseProspLicNumber":leaseProspLicNumber,
			      
		      		    },
		    async:false,
		    success: function (data) { 
		    	var result = data.APP_DATA;
		    	var checkRightsNumber=result["rightsNumberCheck"];
		    	var checkLicNum=result["flag"];
		    	 if (checkLicNum == 0) {
		    		 console.log("Application Number EXISTs");
		    		 //$(".wizard-next-btn").removeAttr("disabled"); 
		    		 $("#prosp-lic-renew-btn").removeAttr("disabled");
		    		 $("#prospectingLicenceNumberValidation").addClass("hide");
		    		 
		    		 
		    	 }else if(checkLicNum == 1){
		    		 console.log("Application Number DOES NOT EXISTs");
		    		 $("#prosp-lic-renew-btn").attr("disabled");
		    		 $("#prospectingLicenceNumberValidation").removeClass("hide");
		    		 event.preventDefault();
		    	 }
		    	
 	    	},
			 error: function (data) {
		    },
		  });
}
	 function previewOfFormsProspectingRight(){
		 $(".user-name").html($("#applicantName").val());
		 $(".locArea").html($("#approximatelyArea").val());
		 $(".locBeacon").html($("#location").val());
		 $(".co-ordinates").html($("#coordinates").val());
		 $(".north").html($("#northSide").val());
		 $(".eastOn").html($("#eastSide").val());
		 $(".north1").html($("#north-side").val());
		 $(".eastApproximate").html($("#east-side").val());
		 $(".locGridbe").html($("#location-grid").val());
		 $(".bearingDegrees").html($("#degrees").val());
		 $(".northSecond").html($("#secondNorthSide").val());
		 $(".eastSecond").html($("#secondEastSide").val());
		 $(".locationSecond").html($("#secondLocationGrid").val());
		 $(".degreesSec").html($("#secondDegrees").val());
		 $(".thirdCorner").html($("#thirdCoordinates").val());
		 $(".thirdNorth").html($("#thirdNorthSide").val());
		 $(".thirdEastApp").html($("#thirdEastSide").val());
		 $(".degreesThird").html($("#thirdDegrees").val());
		 $(".locationThird").html($("#thirdGridLoc").val());
		 $(".gridThird").html($("#thirdGridL").val());
		 $(".coordinatesFourth").html($("#fourthCoordinates").val());
		 $(".northFourth").html($("#fourthNorthSide").val());
		 $(".eastFourth").html($("#fourthEastSide").val());
		 $(".approximateFourth").html($("#fourthDegrees").val());
		 $(".gridFourth").html($("#fourthGridLoc").val());
		 $(".degreeFourth").html($("#fourthGridL").val());
		 $(".coordinatesFifth").html($("#fifthCoordinates").val());
		 $(".northFifth").html($("#fifthNorthSide").val());
		 $(".eastFifth").html($("#fifthEastSide").val());
		 $(".gridBeFifth").html($("#fifthDegrees").val());
		 $(".degreesFifth").html($("#fifthGridLoc").val());
		 $(".cornerFifth").html($("#fifthGridL").val());
		 $(".squareArea").html($("#leaseSquareKilo").val());
		 $(".beaconLocation").html($("#leaseLocation").val());
		 $(".coordinatesLease").html($("#leaseCoordinates").val());
		 $(".northLease").html($("#leaseNorthSide").val());
		 $(".eastLease").html($("#leaseEastSide").val());
		 $(".northLea").html($("#firstNorthLease").val());
		 $(".approximateEast").html($("#firstEastLease").val());
		 $(".locationGridAn").html($("#leaselocationGrid").val());
		 $(".leaseDegreesFirst").html($("#leaseDegrees").val());
		 $(".northSecondLease").html($("#secondNorthLease").val());
		 $(".eastSecondLease").html($("#secondEastLease").val());
		 $(".locationSecondLease").html($("#secondLocationLease").val());
		 $(".degreesSecLease").html($("#secondDegreesLease").val());
		 $(".thirdNorthLe").html($("#thirdCoordinatesLease").val());
		 $(".thirdEastLe").html($("#thirdNorthLease").val());
		 $(".thirdGridLe").html($("#thirdEastLease").val());
		 $(".degreesThirdLease").html($("#thirdDegreesLease").val());
		 $(".locationThirdIs").html($("#thirdLocationLease").val());
		 $(".ThirdDeLease").html($("#thirdGridLease").val());
		 $(".coordinatesFourthLe").html($("#fourthCoordinatesLease").val());
		 $(".northFourthLea").html($("#fourthNorthLease").val());
		 $(".eastFourthLea").html($("#fourthEastLease").val());
		 $(".approximateFourthLea").html($("#fourthDegreesLease").val());
		 $(".gridLocFourth").html($("#fourthGridLease").val());
		 $(".degreeFourthLea").html($("#fourthLocationLease").val());
		 $(".coordinatFifthAt").html($("#fifthCoordinatesLease").val());
		 $(".northLeaseFifth").html($("#fifthNorthLease").val());
		 $(".eastFifthCon").html($("#fifthEastLease").val());
		 $(".gridBearingFifth").html($("#fifthDegreesLease").val());
		 $(".degreesIsFifth").html($("#fifthGridLease").val());
		 $(".cornerAppFifth").html($("#fifthLocationLease").val());
		 $(".locAreaRenewal").html($("#renApproximatelyArea").val());
		 $(".locBeaconRenewal").html($("#renewalLocation").val());
		 $(".coordinatesRenewal").html($("#renewalCoordinates").val());
		 $(".northRenewal").html($("#renewalNorthSide").val());
		 $(".eastOnRenewal").html($("#renewalEastSide").val());
		 $(".northAreaRenewal").html($("#renewalFirstNorth").val());
		 $(".renewalEastApp").html($("#renewalFirstEast").val());
		 $(".locGridRenewal").html($("#renewalFirstLocation").val());
		 $(".beDegreesRenewal").html($("#renewalFirstDegrees").val());
		 $(".northSecRenewal").html($("#renewalSecondNorth").val());
		 $(".eastSecRenewal").html($("#renewalSecondEast").val());
		 $(".locationSecRenewal").html($("#renewalSecondLocation").val());
		 $(".degreesSecRenewal").html($("#renewalSecondDegrees").val());
		 $(".thirdCornerRenewal").html($("#renewalThirdCoordinates").val());
		 $(".thirdNorthRenewal").html($("#renewalThirdNorth").val());
		 $(".thirdEastAppRenewal").html($("#renewalThirdEast").val());
		 $(".degreesThirdRenewal").html($("#renewalThirdDegrees").val());
		 $(".locationThirdRenewal").html($("#renewalThirdGridLoc").val());
		 $(".gridThirdRenewal").html($("#renewalThirdBearing").val());
	 }
</script>
