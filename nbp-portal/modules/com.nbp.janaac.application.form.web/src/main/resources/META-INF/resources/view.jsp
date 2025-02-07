<%@ include file="/init.jsp" %>
<%@ include file="/janaac-wizard.jsp" %>
<jsp:include page="/forms/janaac-popup.jsp"/>
<jsp:include page="/js/laboratories-js.jsp"/>
<jsp:include page="/js/certification-js.jsp"/>
<jsp:include page="/js/inspection-bodies-js.jsp"/>
<jsp:include page="/js/third-party-js.jsp"/>
<jsp:include page="/js/accreditation-inspection-save-data-js.jsp"/>
<jsp:include page="/js/accreditation-certification-save-data-js.jsp"/>
<jsp:include page="/js/accreditation-certification-save-data-js-two.jsp"/>
<jsp:include page="/js/medical-lab-js.jsp"/>
<jsp:include page="/js/accreditation-third-party-save-data.jsp"/>
<jsp:include page="/js/common-js.jsp"/>
<jsp:include page="/js/common-js-two.jsp"/>
<jsp:include page="/js/laboratories-js-two.jsp"/>
<jsp:include page="/js/certification-js-two.jsp"/>
<jsp:include page="/js/medical-calibration-js.jsp"/>
<%-- <jsp:include page="/draft-popup.jsp"/> --%>
<jsp:include page="/js/view-js.jsp"/>
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
                        <p class="modal-subtitle f2">Your application for a JANAAC has been correctly saved as draft.</p>
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
                                            <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 220 220" fill="none">
												<g clip-path="url(#clip0_10050_318989)">
												<path d="M0.389771 139.379C0.759812 140.776 1.40288 142.086 2.28186 143.234C3.16084 144.381 4.25833 145.343 5.51102 146.064L26.5467 158.224V182.443C26.5467 185.364 27.707 188.165 29.7724 190.231C31.8378 192.296 34.6392 193.457 37.5601 193.457H61.7786L73.9375 214.493C74.91 216.162 76.3016 217.548 77.9744 218.514C79.6473 219.48 81.5434 219.992 83.4751 220C85.4121 220.002 87.3153 219.493 88.9928 218.524L110.006 206.365L131.042 218.524C133.572 219.982 136.577 220.376 139.398 219.62C142.218 218.864 144.624 217.02 146.086 214.493L158.234 193.468H182.453C185.374 193.468 188.175 192.307 190.24 190.242C192.306 188.176 193.466 185.375 193.466 182.454V158.235L214.502 146.075C217.029 144.613 218.873 142.207 219.627 139.385C220.381 136.564 219.983 133.559 218.522 131.031L206.363 110.005L218.522 88.9909C219.983 86.4626 220.381 83.4575 219.627 80.6362C218.873 77.8149 217.029 75.4085 214.502 73.9461L193.466 61.7869V37.5565C193.466 34.6355 192.306 31.8341 190.24 29.7686C188.175 27.7031 185.374 26.5427 182.453 26.5427H158.234L146.086 5.51741C144.623 2.99112 142.22 1.14614 139.401 0.384986C138.004 0.00628704 136.546 -0.0913623 135.111 0.0976981C133.676 0.286758 132.293 0.758769 131.042 1.48637L110.006 13.6456L88.9818 1.48637C87.7307 0.759847 86.3485 0.287474 84.9144 0.0963405C83.4803 -0.0947926 82.0227 -0.000925996 80.625 0.372558C79.2273 0.746042 77.917 1.3918 76.7694 2.27278C75.6218 3.15376 74.6594 4.25265 73.9375 5.5064L61.7786 26.5427H37.5601C34.6392 26.5427 31.8378 27.7031 29.7724 29.7686C27.707 31.8341 26.5467 34.6355 26.5467 37.5565V61.7759L5.51102 73.9351C4.25584 74.6571 3.15569 75.62 2.27378 76.7685C1.39187 77.917 0.745573 79.2285 0.372029 80.6275C-0.00151534 82.0266 -0.094947 83.4856 0.0971016 84.9209C0.28915 86.3562 0.762895 87.7393 1.49112 88.9909L13.6499 110.005L1.49112 131.02C0.765821 132.272 0.295141 133.655 0.106134 135.089C-0.0828724 136.524 0.0135197 137.982 0.389771 139.379ZM35.8971 104.487L26.0731 87.4931L43.0778 77.6578C44.75 76.6897 46.1381 75.2988 47.1027 73.6246C48.0673 71.9505 48.5746 70.052 48.5735 68.1198V48.5703H68.1334C72.0652 48.5703 75.7106 46.4777 77.671 43.0634L87.495 26.0692L104.5 35.8935C106.173 36.8623 108.073 37.3724 110.006 37.3724C111.94 37.3724 113.84 36.8623 115.513 35.8935L132.529 26.0692L142.342 43.0634C143.308 44.7377 144.699 46.128 146.373 47.0947C148.047 48.0613 149.946 48.5703 151.879 48.5703H171.439V68.1308C171.438 70.063 171.946 71.9615 172.91 73.6357C173.875 75.3098 175.263 76.7007 176.935 77.6688L193.94 87.5041L184.105 104.498C183.136 106.174 182.626 108.075 182.626 110.011C182.626 111.946 183.136 113.848 184.105 115.523L193.94 132.517L176.935 142.353C175.263 143.321 173.875 144.712 172.91 146.386C171.946 148.06 171.438 149.959 171.439 151.891V171.451H151.879C149.946 171.449 148.046 171.957 146.371 172.924C144.697 173.891 143.307 175.282 142.342 176.958L132.529 193.952L115.513 184.117C113.838 183.148 111.936 182.638 110.001 182.638C108.066 182.638 106.164 183.148 104.489 184.117L87.495 193.952L77.671 176.958C76.7027 175.285 75.3121 173.896 73.6382 172.93C71.9644 171.963 70.0661 171.453 68.1334 171.451H48.5735V151.891C48.5746 149.959 48.0673 148.06 47.1027 146.386C46.1381 144.712 44.75 143.321 43.0778 142.353L26.0731 132.517L35.9081 115.523C36.8771 113.845 37.3864 111.941 37.3845 110.004C37.3825 108.066 36.8695 106.163 35.8971 104.487Z" fill="#047247"></path>
												<path d="M50.72 98.1111H56.9386V118.859C56.9386 120.777 56.5075 122.443 55.6455 123.857C54.7931 125.271 53.6065 126.361 52.0858 127.126C50.565 127.891 48.7973 128.274 46.7826 128.274C44.9906 128.274 43.3633 127.959 41.9007 127.33C40.4478 126.69 39.2951 125.722 38.4427 124.424C37.5903 123.116 37.169 121.474 37.1787 119.498H43.4408C43.4602 120.283 43.62 120.956 43.9203 121.518C44.2302 122.07 44.6516 122.496 45.1843 122.796C45.7268 123.087 46.3661 123.232 47.1022 123.232C47.8771 123.232 48.5309 123.068 49.0637 122.738C49.6061 122.399 50.0178 121.905 50.2987 121.256C50.5796 120.607 50.72 119.808 50.72 118.859V98.1111ZM61.1317 127.867H54.3901L64.6624 98.1111H72.7697L83.0275 127.867H76.2858L68.8323 104.911H68.5998L61.1317 127.867ZM60.7104 116.171H76.6346V121.082H60.7104V116.171ZM105.361 98.1111V127.867H99.9265L86.9809 109.139H86.763V127.867H80.4718V98.1111H85.9929L98.8368 116.825H99.0984V98.1111H105.361ZM109.55 127.867H102.808L113.081 98.1111H121.188L131.446 127.867H124.704L117.251 104.911H117.018L109.55 127.867ZM109.129 116.171H125.053V121.082H109.129V116.171ZM134.019 127.867H127.277L137.55 98.1111H145.657L155.915 127.867H149.173L141.719 104.911H141.487L134.019 127.867ZM133.598 116.171H149.522V121.082H133.598V116.171ZM178.215 108.529H171.851C171.735 107.705 171.498 106.974 171.139 106.335C170.781 105.686 170.321 105.134 169.759 104.678C169.197 104.223 168.548 103.874 167.812 103.632C167.086 103.39 166.296 103.269 165.444 103.269C163.904 103.269 162.562 103.652 161.419 104.417C160.276 105.172 159.39 106.277 158.76 107.73C158.131 109.173 157.816 110.926 157.816 112.989C157.816 115.11 158.131 116.893 158.76 118.336C159.4 119.779 160.291 120.869 161.434 121.605C162.577 122.341 163.899 122.709 165.4 122.709C166.243 122.709 167.023 122.598 167.739 122.375C168.466 122.152 169.11 121.828 169.672 121.402C170.234 120.966 170.698 120.438 171.067 119.818C171.444 119.198 171.706 118.491 171.851 117.697L178.215 117.726C178.05 119.091 177.639 120.409 176.98 121.678C176.331 122.937 175.454 124.065 174.35 125.063C173.256 126.051 171.948 126.836 170.427 127.417C168.916 127.988 167.207 128.274 165.298 128.274C162.644 128.274 160.271 127.673 158.179 126.472C156.097 125.271 154.45 123.533 153.239 121.256C152.038 118.98 151.437 116.224 151.437 112.989C151.437 109.744 152.048 106.984 153.268 104.707C154.489 102.431 156.145 100.697 158.237 99.5059C160.329 98.3048 162.683 97.7043 165.298 97.7043C167.023 97.7043 168.621 97.9464 170.093 98.4307C171.575 98.915 172.888 99.6221 174.031 100.552C175.174 101.472 176.103 102.601 176.82 103.937C177.547 105.274 178.012 106.804 178.215 108.529Z" fill="#047247"></path>
												</g>
												<defs>
												<clipPath id="clip0_10050_318989">
												<rect width="220" height="220" fill="white"></rect>
												</clipPath>
												</defs>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">JANAAC Application Transaction Number</p>
                                            <p class="licence-number f2" id="janaac_pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Type of Accreditation</p>
                                        <p class="tier-box-upper f2" id="janaac_pop_category"></p>
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
$(document).ready(function(){
	continueApplicationForm();
});
	function continueApplicationForm(){
		var janaacApplicationId = "<%=janaacApplicationId%>";
		if(janaacApplicationId > 0 ){
			showSelectedCategory();
			showLastFormStep();
			continueEditFormDetails();
			gettingDocumentList();
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
	function showSelectedCategory(){
		janaacAppId = "<%=janaacApplicationId%>";
		currentStage = "<%=currentStage%>";
		lastFormStep = "<%=lastFormStep%>";
		accreditationType="<%=accreditationType%>";
		accreditationServicesType="<%=accreditationServicesType%>";
		typeOfTransaction="<%=typeOfTransaction%>";
		var sizeOfLabMedicalAdd=<%=sizeOfLabMedicalAdd%>;
		var sizeOfLabMedicalDecOfActiAdd=<%=sizeOfLabMedicalDecOfActiAdd%>;
		var sizeOfLabMedicalDecOfActiSecAdd=<%=sizeOfLabMedicalDecOfActiSecAdd%>;
		var sizeOfLabMedicalOrganFirstAdd=<%=sizeOfLabMedicalOrganFirstAdd%>;
		var sizeOfLabMedicalOrganSecAdd=<%=sizeOfLabMedicalOrganSecAdd%>;
		var sizeOfLabMedicalPhysicalFirstAdd=<%=sizeOfLabMedicalPhysicalFirstAdd%>;
		var sizeOfLabMedicalPhysicalSecAdd=<%=sizeOfLabMedicalPhysicalSecAdd%>;
		var sizeOfTestStructAdd=<%=sizeOfTestStructAdd%>;
		var sizeOfLabTestStructuralSecAdd=<%=sizeOfLabTestStructuralSecAdd%>;
		var sizeOfLabTestResourceFisrtAdd=<%=sizeOfLabTestResourceFisrtAdd%>;
		var sizeOfLabTestResourceSecAdd=<%=sizeOfLabTestResourceSecAdd%>;
		var sizeOfCerStruReqSec=<%=sizeOfCerStruReqSec%>;
		var sizeOfCerApplicaionInfo=<%=sizeOfCerApplicaionInfo%>;
		var sizeOfCerAddScopeService=<%=sizeOfCerAddScopeService%>;
		var sizeOfCerThirdAddScopeService=<%=sizeOfCerThirdAddScopeService%>;
		var sizeOfCerPersonnelFirst=<%=sizeOfCerPersonnelFirst%>;
		var sizeOfCerPersonnelSec=<%=sizeOfCerPersonnelSec%>;
		var sizeOfCerPersonnelThird=<%=sizeOfCerPersonnelThird%>;
		var sizeOfinspApplicationInfoAdd=<%=sizeOfinspApplicationInfoAdd%>;
		var sizeOforganFirstAdd=<%=sizeOforganFirstAdd%>;
		var sizeOforgInfoSecAdd=<%=sizeOforgInfoSecAdd%>;
		var sizeOforgInfoThirdAdd=<%=sizeOforgInfoThirdAdd%>;
		var sizeOfphyResourceFirstAdd=<%=sizeOfphyResourceFirstAdd%>;
		var sizeOfphyResourceSecondAdd=<%=sizeOfphyResourceSecondAdd%>;
		var sizeOfFdaAppliInfoAdd=<%=sizeOfFdaAppliInfoAdd%>;
		var sizeOfFdaScopeClientInfoAdd=<%=sizeOfFdaScopeClientInfoAdd%>;
		var sizeOfFdaPersonnelFirstInfoAdd=<%=sizeOfFdaPersonnelFirstInfoAdd%>;
		var sizeOfFdaPersonnelSecInfoAdd=<%=sizeOfFdaPersonnelSecInfoAdd%>;
		var sizeOfFdaPersonnelThirdInfoAdd=<%=sizeOfFdaPersonnelThirdInfoAdd%>;
		var sizeOfFdaPersonnelFourInfoAdd=<%=sizeOfFdaPersonnelFourInfoAdd%>;
		var sizeOflaboratoryPartOfOrgAdd=<%=sizeOflaboratoryPartOfOrgAdd%>;
		var sizeOfOutSourcedActivitiesAdd=<%=sizeOfOutSourcedActivitiesAdd%>;
		paymentMethod="<%=paymentMethod%>";
		currency="<%=currency%>";
		amount="<%=amount%>";
		$("#paymentMethod").val(paymentMethod);
		$("#amountPaid").val(amount);
		$("#amountCurrency").val(currency);
		
		var selectedOptionText = $("#amountCurrency option:selected").text(currency);
		$("#janaacApplicationId").val(janaacAppId);
		$("#janaacTransactionTypeVal").val(typeOfTransaction);
		var orgInsBodyPart =$("input[name='insBodyOrgPart']:checked").val();
		var insLegalEntity =$("input[name='insBodiesLegalEntity']:checked").val();
		if (accreditationType != "") {
			$("#accreditationType .wizard-title").each(function(index, element) {
				if ($(this).text() == accreditationType) {
					$(this).closest('a').click();
				}
			});
	    }
 	if(accreditationType=="Accreditation for Labs"){
 		var labMedicalOrgaLabEntity =$("input[name='laboratoryLegalEntity']:checked").val();
		var labMedicalExamination =$("input[name='laboratoryPartOfOrg']:checked").val();
		var labMediManSysOne = $("input[name='managementSystemOne']:checked").val();
		if(accreditationServicesType!= ""){
			$( "#laboratoriesAccreditation .wizard-title" ).each( function( index, element ){
			    if($(this).text() == accreditationServicesType ){
			    	$(this).closest('a').click();
			    	
			    }
			});
		}
		if(typeOfTransaction != ""){
			$("#transactionType .wizard-title").each( function( index, element ){
		        if($(this).text() == typeOfTransaction ){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(".form-wizard-save-btn, .form-wizard-next-btn").removeClass("hide");
			    	/* $("#save-continue").click(); */
			    }
			});
		}
	if(accreditationServicesType=="Accreditation of Medical Labs to the ISO 15189 Standard"){
		let medicalLab="";
		 const numbersInManagementSystem = ["One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight"];
		 numbersInManagementSystem.forEach(function(word) {
			 medicalLab = $("input[name='managementSystem" + word + "']:checked").val();
			 if (medicalLab!="") {
				 $("input[name='managementSystem" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 const numbersInManagementRquirement = ["One", "Two", "Three", "Four","Five", "Six","Seven","Eight","Nine","Ten","Eleven","Twelve"];
		 numbersInManagementRquirement.forEach(function(word) {
			 medicalLab = $("input[name='managementRquirement" + word + "']:checked").val();
			 if (medicalLab!="") {
				 $("input[name='managementRquirement" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 
		 const numbersInManagementResourceRquirement = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen"];
		 numbersInManagementResourceRquirement.forEach(function(word) {
			 medicalLab = $("input[name='managementResourceRquirement" + word + "']:checked").val();
			 if (medicalLab!="") {
				 $("input[name='managementResourceRquirement" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		if(sizeOfLabMedicalAdd>0){
			var counterOfLabMedical=parseInt(sizeOfLabMedicalAdd)+1;
			$(".addPersonnelResponsibleDetailTableBox").removeClass("hide");
			$("#personnelResponsibleVal").val(counterOfLabMedical);
		}
		if(sizeOfLabMedicalDecOfActiAdd>0){
			var counterOfLabMedicalDecOfActFirst=parseInt(sizeOfLabMedicalDecOfActiAdd)+1;
			$(".addSpecimenCollectionDetailTableBox").removeClass("hide");
			$("#specimenCollectionVal").val(counterOfLabMedicalDecOfActFirst);
		}
		if(sizeOfLabMedicalDecOfActiSecAdd>0){
			var counterOfLabMedicalDecOfActSec=parseInt(sizeOfLabMedicalDecOfActiSecAdd)+1;
			$(".addPointCareTestingDetailTableBox").removeClass("hide");
			$("#personnelResponsibleVal").val(counterOfLabMedicalDecOfActSec);
		}
		if(sizeOfLabMedicalOrganFirstAdd>0){
			var counterOfLabMedicalOrgFirst=parseInt(sizeOfLabMedicalOrganFirstAdd)+1;
			$(".addSignatoryAuthorityDetailTableBox").removeClass("hide");
			$("#signatoryAuthorityVal").val(counterOfLabMedicalOrgFirst);
		}
		if(sizeOfLabMedicalOrganSecAdd>0){
			var counterOfLabMedicalOrgSec=parseInt(sizeOfLabMedicalOrganSecAdd)+1;
			$(".addExaminationsScopeDetaiLTableBox").removeClass("hide");
			$("#examinationsScopeVal").val(counterOfLabMedicalOrgSec);
		}
		if(sizeOfLabMedicalPhysicalFirstAdd>0){
			var counterOfLabMedicalPhysicalFirst=parseInt(sizeOfLabMedicalPhysicalFirstAdd)+1;
			$(".addMajorEquipmentDetailTableBox").removeClass("hide");
			$("#majorEquipmentVal").val(counterOfLabMedicalPhysicalFirst);
		}
		if(sizeOfLabMedicalPhysicalSecAdd>0){
			var counterOfLabMedicalPhysicalSec=parseInt(sizeOfLabMedicalPhysicalSecAdd)+1;
			$(".addApplicationActivityLocDetailTableBox").removeClass("hide");
			$("#applicationActivityLocVal").val(counterOfLabMedicalPhysicalSec);
		}
		if(sizeOflaboratoryPartOfOrgAdd>0){
			var counterOfsizeOflaboratoryPartOfOrg=parseInt(sizeOflaboratoryPartOfOrgAdd)+1;
			$(".addKeyPersonnelDetailsTableBox").removeClass("hide");
			$("#keyPersonnelDetailsVal").val(counterOfsizeOflaboratoryPartOfOrg);
		}
		if(labMedicalOrgaLabEntity=="Yes"){
			$(".laboratoryLegalEntityBox").removeClass("hide");
		}
		if(labMedicalExamination=="Yes"){
			$(".laboratoryPartOfOrgBox").removeClass("hide");
		}
		if(labMediManSysOne=="Yes"){
			$(".laboratoryPartOfOrgBox").removeClass("hide");
		}
	}
	if(accreditationServicesType=="Accreditation of Testing Labs to the ISO/IEC 17025 Standard"){
		laboratoryPartOfTesting= $("input[name='laboratoryPartOfTesting']:checked").val();
		structuralLaboratoryLegalEntity= $("input[name='structuralLaboratoryLegalEntity']:checked").val();
		if(laboratoryPartOfTesting=="Yes"){
			$(".laboratoryPartOfTestingBox").removeClass("hide");
		}
		if(structuralLaboratoryLegalEntity=="Yes"){
			$(".structuralLaboratoryLegalEntityBox").removeClass("hide");
		}
		let testLab="";
		 const numbersInManagementSystemTesting = ["One", "Two", "Three", "Four", "Five","Six", "Seven"];
		 numbersInManagementSystemTesting.forEach(function(word) {
			 testLab = $("input[name='managementSystemTesting" + word + "']:checked").val();
			 if (testLab!="") {
				 $("input[name='managementSystemTesting" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 const numbersInManagSysReqResDoc = ["One", "Two", "Three", "Four","Five", "Six","Seven"];
		 numbersInManagSysReqResDoc.forEach(function(word) {
			 testLab = $("input[name='managSysReqResDoc" + word + "']:checked").val();
			 if (testLab!="") {
				 $("input[name='managSysReqResDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 
		 const numbersInManagSysReqProcessDoc = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"];
		 numbersInManagSysReqProcessDoc.forEach(function(word) {
			 testLab = $("input[name='managSysReqProcessDoc" + word + "']:checked").val();
			 if (testLab!="") {
				 $("input[name='managSysReqProcessDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 const numbersInManagSysReqManagementDoc = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"];
		 numbersInManagSysReqManagementDoc.forEach(function(word) {
			 testLab = $("input[name='managSysReqManagementDoc" + word + "']:checked").val();
			 if (testLab!="") {
				 $("input[name='managSysReqManagementDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		if(sizeOfLabMedicalAdd>0){
			var counterOftestMedical=parseInt(sizeOfLabMedicalAdd)+1;
			$(".addPersonnelResponsibleTestingDetailTableBox").removeClass("hide");
			$("#testingSpecimenCollectionVal").val(counterOftestMedical);
		}
		if(sizeOfTestStructAdd>0){
			var counterOfTestStrucReq=parseInt(sizeOfTestStructAdd)+1;
			$(".addStaffDetailTableBox").removeClass("hide");
			$("#staffDetailVal").val(counterOfTestStrucReq);
		}
		
		if(sizeOfLabTestStructuralSecAdd>0){
			var counterOfTestStrucReqSec=parseInt(sizeOfLabTestStructuralSecAdd)+1;
			$(".addScopeForAccreditationDetailTableBox").removeClass("hide");
			$("#scopeForAccreditationVal").val(counterOfTestStrucReqSec);
		}
		
		if(sizeOfLabTestResourceFisrtAdd>0){
			var counterOfTestResourceFirst=parseInt(sizeOfLabTestResourceFisrtAdd)+1;
			$(".addActivityPerformedLocDetailTableBox").removeClass("hide");
			$("#activityPerformedLocVal").val(counterOfTestResourceFirst);
		}
		if(sizeOfLabTestResourceSecAdd>0){
			var counterOfTestResourceSec=parseInt(sizeOfLabTestResourceSecAdd)+1;
			$(".addMajorEquipmentTestingDetailTableBox").removeClass("hide");
			$("#majorEquipmentTestingVal").val(counterOfTestResourceSec);
		}
		
		if(sizeOfLabMedicalDecOfActiAdd>0){
			var counterOfLabMedicalDecOfActi=parseInt(sizeOfLabMedicalDecOfActiAdd)+1;
			$(".addTestingSpecimenCollectionDetailTableBox").removeClass("hide");
			$("#testingSpecimenCollectionVal").val(counterOfLabMedicalDecOfActi);
		}
	
	}	
	if(accreditationServicesType=="Accreditation of Calibration Labs to the ISO/IEC 17025 Standard"){
		calibrationLaboratoryLegalEntity= $("input[name='calibrationLaboratoryLegalEntity']:checked").val();
		if(calibrationLaboratoryLegalEntity=="Yes"){
			$(".calibrationLaboratoryLegalEntityBox").removeClass("hide");
		}
		 let caliberLab="";
		 const numbersInManagementSystemCalibration = ["One", "Two", "Three", "Four", "Five","Six", "Seven"];
		 numbersInManagementSystemCalibration.forEach(function(word) {
			 caliberLab = $("input[name='managementSystemCalibration" + word + "']:checked").val();
			 if (caliberLab!="") {
				 $("input[name='managementSystemCalibration" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 const numbersInCalibrationManagSysReqResDoc = ["One", "Two", "Three", "Four","Five", "Six","Seven"];
		 numbersInCalibrationManagSysReqResDoc.forEach(function(word) {
			 caliberLab = $("input[name='calibrationManagSysReqResDoc" + word + "']:checked").val();
			 if (caliberLab!="") {
				 $("input[name='calibrationManagSysReqResDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 
		 const numbersInCalibrationManagSysReqProcessDoc = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"];
		 numbersInCalibrationManagSysReqProcessDoc.forEach(function(word) {
			 caliberLab = $("input[name='calibrationManagSysReqProcessDoc" + word + "']:checked").val();
			 if (caliberLab!="") {
				 $("input[name='calibrationManagSysReqProcessDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 const numbersInCalibrationManagSysReqManagementDoc = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"];
		 numbersInCalibrationManagSysReqManagementDoc.forEach(function(word) {
			 caliberLab = $("input[name='calibrationManagSysReqManagementDoc" + word + "']:checked").val();
			 if (caliberLab!="") {
				 $("input[name='calibrationManagSysReqManagementDoc" + word + "']:checked").closest('div').parent().next().removeClass("hide");
			 }
		 })
		 
		 var calibrationLaboratoryPartOfTesting=$("input[name='calibrationLaboratoryPartOfTesting']:checked").val();
		 if(calibrationLaboratoryPartOfTesting=="Yes"){
			 $(".calibrationLaboratoryPartOfTestingBox").removeClass("hide");
		 }
	 	if(sizeOfLabMedicalAdd>0){
			var counterOftestCal=parseInt(sizeOfLabMedicalAdd)+1;
			$(".addPersonnelResponsibleCalibrationDetailTableBox").removeClass("hide");
			$("#personnelResponsibleCalibrationVal").val(counterOftestCal);
		}
	 	if(sizeOfLabMedicalDecOfActiAdd>0){
			var counterOfLabCelDecOfActFirst=parseInt(sizeOfLabMedicalDecOfActiAdd)+1;
			$(".addCalibrationSpecimenCollectionDetailTableBox").removeClass("hide");
			$("#calibrationSpecimenCollectionVal").val(counterOfLabCelDecOfActFirst);
		}
	 	if(sizeOfTestStructAdd>0){
			var counterOfTestCalStrucReq=parseInt(sizeOfTestStructAdd)+1;
			$(".addStaffDetailCalibrationTableBox").removeClass("hide");
			$("#staffDetailCalibrationVal").val(counterOfTestCalStrucReq);
		}
	 	if(sizeOfCerStruReqSec>0){
			var counterOfTestCalStrucReqSec=parseInt(sizeOfCerStruReqSec)+1;
			$(".addScopeForCalibrationsDetailTableBox").removeClass("hide");
			$("#scopeForCalibrationsVal").val(counterOfTestCalStrucReqSec);
		}
	 	
	 	if(sizeOfLabTestResourceFisrtAdd>0){
			var counterOfTestResourceFirst=parseInt(sizeOfLabTestResourceFisrtAdd)+1;
			$(".addActivityPerformedLocCalibrationDetailTableBox").removeClass("hide");
			$("#activityPerformedLocCalibrationVal").val(counterOfTestResourceFirst);
		}
		if(sizeOfLabTestResourceSecAdd>0){
			var counterOfTestResourceSec=parseInt(sizeOfLabTestResourceSecAdd)+1;
			$(".addMajorEquipmentCalibrationDetailTableBox").removeClass("hide");
			$("#majorEquipmentCalibrationVal").val(counterOfTestResourceSec);
		}

	}	
}
 if(accreditationType=="Accreditation for Certification Bodies"){
	 var managementSystem=$("input[name='managementSystem']:checked").val();
	 certificationLegalEntity=$("input[name='certificationLegalEntity']:checked").val();
	 optionFollow = $("input[name='managementImplementedWithOrg']:checked").val();
	 cerProductImplemented = $("input[name='cerProductImplementedWithOrg']:checked").val();
	 managementImplementedWithOrg = $("input[name='managementImplementedWithOrgCerBodies']:checked").val();
	 cerBodiesBodyOutsource = $("input[name='cerBodiesBodyOutsource']:checked").val();
	 certificationOtherServices = $("input[name='certificationOtherServices']:checked").val();
	 certificationEstablishedRelation = $("input[name='certificationEstablishedRelation']:checked").val();
	 orgAccreditedAnotherAccreditation= $("input[name='orgAccreditedAnotherAccreditation']:checked").val();
	 certificationBodyOutsource= $("input[name='certificationBodyOutsource']:checked").val();
	 otherFeeReq= $("input[name='otherFeeReq']:checked").val();
	 if(managementSystem=="Other"){
		 $(".otherManagementSystem").removeClass("hide");
	 }
	 if(certificationLegalEntity=="Yes"){
		 $(".legalStatusDescribe").removeClass("hide");
	 }
	 if(certificationOtherServices=="Yes"){
		 $(".certificationOtherServicesBox").removeClass("hide");
	 }
	 if(certificationEstablishedRelation=="Yes"){
		 $(".certificationEstablishedRelationBox").removeClass("hide");
	 }
	 if(orgAccreditedAnotherAccreditation=="Yes"){
		 $(".orgAccreditedAnotherAccreditationBox").removeClass("hide");
	 }
	 if(certificationBodyOutsource=="Yes"){
		 $(".certificationBodyOutsourceBox").removeClass("hide");
	 }
	 if(otherFeeReq=="Yes"){
		 $(".otherFeeReqBox").removeClass("hide");
	 }
			if(accreditationServicesType!= ""){
				$( "#certificationAccreditation .wizard-title" ).each( function( index, element ){
				    if($(this).text() == accreditationServicesType ){
				    	$(this).closest('a').click();
				    }
				});
			}
			if(typeOfTransaction != ""){
				$("#transactionType .wizard-title").each( function( index, element ){
			        if($(this).text() == typeOfTransaction ){
				    	$(this).closest(".wizard-card").addClass("active");
				    	$(".form-wizard-save-btn, .form-wizard-next-btn").removeClass("hide");
				    	/* $("#save-continue").click(); */
				    }
				});
			}
			if(accreditationServicesType=="Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard"){
			if(sizeOfCerApplicaionInfo>0){
				var counterOfCerAppliInfo=parseInt(sizeOfCerApplicaionInfo)+1;
				$(".addPersonResponsibleDetailCerTableBox").removeClass("hide");
				$("#personResponsibleCerVal").val(counterOfCerAppliInfo);
			 }
			if(sizeOfCerAddScopeService>0){
				var counterOfCerScope=parseInt(sizeOfCerAddScopeService)+1;
				$(".addRegisteredClientOrgDetailTableBox").removeClass("hide");
				$("#registeredClientOrgVal").val(counterOfCerScope);
			 }
			if(sizeOfCerPersonnelFirst>0){
				var counterOfPersonnelFirst=parseInt(sizeOfCerPersonnelFirst)+1;
				$(".addStaffDetailCertificationTableBox").removeClass("hide");
				$("#staffDetailCertificationVal").val(counterOfPersonnelFirst);
			 }
			if(sizeOfCerPersonnelSec>0){
				var sizeOfCerPersonnelSec=parseInt(sizeOfCerPersonnelSec)+1;
				$(".addAuditorListTableBox").removeClass("hide");
				$("#auditorListVal").val(sizeOfCerPersonnelSec);
			 }
			if(sizeOfCerPersonnelThird>0){
				var sizeOfCerPersonnelSec=parseInt(sizeOfCerPersonnelSec)+1;
				$(".addActivityPerformLocationsTableBox").removeClass("hide");
				$("#activityPerformLocationsVal").val(sizeOfCerPersonnelSec);
			 }
			if(sizeOfFdaPersonnelThirdInfoAdd>0){
				var counterOfFdaPersonnelThirdInfoAdd=parseInt(sizeOfFdaPersonnelThirdInfoAdd)+1;
				$(".addOutsourceActNatureTableBox").removeClass("hide");
				$("#outsourceActNatureThirdPartyVal").val(counterOfFdaPersonnelThirdInfoAdd);
			}
			if(optionFollow=="Option A"){
				$(".option-a").removeClass("hide");
			}else{
				$(".option-b").removeClass("hide");
			}
			$("input:checkbox[name=certificationStandard]").each(function() {
		        if ($(this).prop("checked")) {
		        $(this).parent().next('.certificationExpertiseBox').removeClass("hide");
		        }
		    });
			$(".management-sys-req input").each(function() {
			    if ($(this).prop("checked")) {
			        $(this).closest(".form-group").next(".managementRef").removeClass("hide");
			    }
			});
		   }	
			if(accreditationServicesType=="Accreditation of Certification Bodies to the ISO/IEC 17065 Standard"){
				cerProductLegalEntity= $("input[name='cerProductLegalEntity']:checked").val();
				cerProductOtherServices= $("input[name='cerProductOtherServices']:checked").val();
				cerProductEstablishedRelation= $("input[name='cerProductEstablishedRelation']:checked").val();
				orgAccreditedAnotherAccreditationCerProduct= $("input[name='orgAccreditedAnotherAccreditationCerProduct']:checked").val();
				otherFeeReqCerProduct= $("input[name='otherFeeReqCerProduct']:checked").val();
				if(cerProductLegalEntity=="Yes"){
					$(".cerProductlLegalStatusDescribe").removeClass("hide");
				}
				if(cerProductOtherServices=="Yes"){
					$(".cerProductOtherServicesBox").removeClass("hide");
				}
				if(cerProductEstablishedRelation=="Yes"){
					$(".cerProductEstablishedRelationBox").removeClass("hide");
				}
				if(orgAccreditedAnotherAccreditationCerProduct=="Yes"){
					$(".orgAccreditedAnotherAccreditationCerProductBox").removeClass("hide");
				}
				if(otherFeeReqCerProduct=="Yes"){
					$(".otherFeeReqCerProductBox").removeClass("hide");
				}
				if(sizeOfCerApplicaionInfo>0){
					var counterOfCerAppliInfo=parseInt(sizeOfCerApplicaionInfo)+1;
					$(".addPersonResponsibleCerProductDetailTableBox").removeClass("hide");
					$("#personResponsibleCerProductVal").val(counterOfCerAppliInfo);
				 }
				if(sizeOfCerAddScopeService>0){
					var counterOfCerScope=parseInt(sizeOfCerAddScopeService)+1;
					$(".addRegisteredClientOrgCerProductDetailTableBox").removeClass("hide");
					$("#registeredClientOrgCerProductVal").val(counterOfCerScope);
				 }
				if(sizeOfCerPersonnelFirst>0){
					var counterOfPersonnelFirst=parseInt(sizeOfCerPersonnelFirst)+1;
					$(".addStaffDetailCerProductTableBox").removeClass("hide");
					$("#staffDetailCerProductVal").val(counterOfPersonnelFirst);
				 }
				if(sizeOfCerPersonnelSec>0){
					var sizeOfCerPersonnelSec=parseInt(sizeOfCerPersonnelSec)+1;
					$(".addAuditorListCerProductTableBox").removeClass("hide");
					$("#auditorListCerProductVal").val(sizeOfCerPersonnelSec);
				 }
				if(sizeOfOutSourcedActivitiesAdd>0){
					var CounterOutSourcedActivities=parseInt(sizeOfOutSourcedActivitiesAdd)+1
					$(".addOutsourceActNatureCertProductTableBox").removeClass("hide");
					$("#outsourceActNatureCertProductVal").val(CounterOutSourcedActivities);
				}
				if(cerProductImplemented=="Option A"){
					$(".cer-product-option-a").removeClass("hide");
				}else{
					$(".cer-product-option-b").removeClass("hide");
				}
				if(cerBodiesBodyOutsource=="Yes"){
					$(".certProductBodyOutsourceBox").removeClass("hide");
				}
				else{
					$(".certProductBodyOutsourceBox").addClass("hide");
				}
				$(".management-sys-req input").each(function() {
				    if ($(this).prop("checked")) {
				        $(this).closest(".form-group").next(".managementRefCerProduct").removeClass("hide");
				        $(this).closest(".form-group").next(".managementRef").removeClass("hide");
				    }
				});
			 }	
			if(accreditationServicesType=="Accreditation of Certification Bodies to the ISO/IEC 17024 Standard"){
				cerBodiesLegalEntity= $("input[name='cerBodiesLegalEntity']:checked").val();
				cerBodiesOtherServices= $("input[name='cerBodiesOtherServices']:checked").val();
				cerBodiesEstablishedRelation= $("input[name='cerBodiesEstablishedRelation']:checked").val();
				orgAccreditedAnotherAccreditationCerBodies= $("input[name='orgAccreditedAnotherAccreditationCerBodies']:checked").val();
				otherFeeReqCerBodies= $("input[name='otherFeeReqCerBodies']:checked").val();
				
				if(cerBodiesLegalEntity=="Yes"){
					$(".legalStatusDescribeCerBodies").removeClass("hide");
				}
				if(cerBodiesOtherServices=="Yes"){
					$(".cerBodiesOtherServicesBox").removeClass("hide");
				}
				if(cerBodiesEstablishedRelation=="Yes"){
					$(".cerBodiesEstablishedRelationBox").removeClass("hide");
				}
				if(orgAccreditedAnotherAccreditationCerBodies=="Yes"){
					$(".orgAccreditedAnotherAccreditationCerBodiesBox").removeClass("hide");
				}
				if(otherFeeReqCerBodies=="Yes"){
					$(".otherFeeReqCerBodiesBox").removeClass("hide");
				}
				if(sizeOfCerApplicaionInfo>0){
					var counterOfCerAppliInfo=parseInt(sizeOfCerApplicaionInfo)+1;
					$(".addPersonResponsibleDetailCerBodiesTableBox").removeClass("hide");
					$("#personResponsibleCerBodiesVal").val(counterOfCerAppliInfo);
				 }
				if(sizeOfCerThirdAddScopeService>0){
					var counterOfCerScope=parseInt(sizeOfCerApplicaionInfo)+1;
					$(".addRegisteredClientOrgCerBodiesDetailTableBox").removeClass("hide");
					$("#registeredClientOrgCerBodies").val(counterOfCerScope);
				 }
				if(sizeOfCerPersonnelFirst>0){
					var counterOfPersonnelFirst=parseInt(sizeOfCerPersonnelFirst)+1;
					$(".addStaffDetailCerBodiesTableBox").removeClass("hide");
					$("#staffDetailCerBodiesVal").val(counterOfPersonnelFirst);
				 }
				if(sizeOfCerPersonnelSec>0){
					var sizeOfCerPersonnelSec=parseInt(sizeOfCerPersonnelSec)+1;
					$(".addAuditorListCerBodiesTableBox").removeClass("hide");
					$("#auditorListCerBodiesVal").val(sizeOfCerPersonnelSec);
				 }
				if(sizeOfOutSourcedActivitiesAdd>0){
					var CounterOutSourcedActivities=parseInt(sizeOfOutSourcedActivitiesAdd)+1
					$(".addOutsourceActNatureCerBodiesTableBox").removeClass("hide");
					$("#outsourceActNatureCerBodiesVal").val(CounterOutSourcedActivities);
				}
				if(managementImplementedWithOrg=="Option A"){
					$(".cer-bodies-option-a").removeClass("hide");
				}else{
					$(".cer-bodies-option-b").removeClass("hide");
				}
				if(cerBodiesBodyOutsource=="Yes"){
					$(".cerBodiesOutsourceBox").removeClass("hide");
				}
				else{
					$(".cerBodiesOutsourceBox").addClass("hide");
				}
				
				$(".management-sys-req input").each(function() {
				    if ($(this).prop("checked")) {
				        $(this).closest(".form-group").next(".managementRefCerBodies").removeClass("hide");
				        $(this).closest(".form-group").next(".managementRef").removeClass("hide");
				    }
				});
			 }	
	}
 if(accreditationType=="Accreditation for Inspection Bodies"){
	 let inspectionBodies="";
	 const numbersInManageSysManual = ["One", "Two", "Three", "Four", "Five","Six"];
	 numbersInManageSysManual.forEach(function(word) {
		 inspectionBodies = $("input[name='manageSysManual" + word + "']:checked").val();
		 if (inspectionBodies!="") {
			 $("input[name='manageSysManual" + word + "']:checked").closest('div').parent().next().removeClass("hide");
		 }
	 })
	 const numbersInManageSysReq = ["One", "Two", "Three", "Four","Five", "Six","Seven"];
	 numbersInManageSysReq.forEach(function(word) {
		 inspectionBodies = $("input[name='manageSysReq" + word + "']:checked").val();
		 if (inspectionBodies!="") {
			 $("input[name='manageSysReq" + word + "']:checked").closest('div').parent().next().removeClass("hide");
		 }
	 })
	 
	 const numbersInManageSysResourceReq = ["One", "Two"];
	 numbersInManageSysResourceReq.forEach(function(word) {
		 inspectionBodies = $("input[name='manageSysResourceReq" + word + "']:checked").val();
		 if (inspectionBodies!="") {
			 $("input[name='manageSysResourceReq" + word + "']:checked").closest('div').parent().next().removeClass("hide");
		 }
	 })
	 const numbersInManageSysProcessReq = ["One", "Two", "Three", "Four"];
	 numbersInManageSysProcessReq.forEach(function(word) {
		 inspectionBodies = $("input[name='manageSysProcessReq" + word + "']:checked").val();
		 if (inspectionBodies!="") {
			 $("input[name='manageSysProcessReq" + word + "']:checked").closest('div').parent().next().removeClass("hide");
		 }
	 })
	 if(accreditationServicesType!= ""){
			$( "#inspectingAccreditation .wizard-title" ).each( function( index, element ){
			    if($(this).text() == accreditationServicesType ){
			    	$(this).closest('a').click();
			    }
			});
		}
		if(typeOfTransaction != ""){
			$("#transactionType .wizard-title").each( function( index, element ){
		        if($(this).text() == typeOfTransaction ){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(".form-wizard-save-btn, .form-wizard-next-btn").removeClass("hide");
			    	/* $("#save-continue").click(); */
			    }
			});
		}
		   if(sizeOfinspApplicationInfoAdd>0){
			var CounterOfinspApplication=parseInt(sizeOfinspApplicationInfoAdd)+1;
			$(".addPersonResponsibleDetailInsBodiesTableBox").removeClass("hide");
			$("#personResponsibleInsBodiesVal").val(CounterOfinspApplication);
			}
			if(sizeOforganFirstAdd>0){
			var CounterOfsizeOforganFirst=parseInt(sizeOforganFirstAdd)+1;
			$(".addInspectionPersonnelDetailsTableBox").removeClass("hide");
			$("#inspectionPersonnelDetailsVal").val(CounterOfsizeOforganFirst);
			}
			if(sizeOforgInfoSecAdd>0){
			var CounterOfsizeOforganSec=parseInt(sizeOforgInfoSecAdd)+1;	
			$(".addStaffDetailInsBodiesTableBox").removeClass("hide");
			$("#staffDetailInsBodiesVal").val(CounterOfsizeOforganSec);
			}
			if(sizeOforgInfoThirdAdd>0){
			var CounterOfsizeOforganThird=parseInt(sizeOforgInfoThirdAdd)+1;	
			$(".addAccreditationSoughtScopeTableBox").removeClass("hide");
			$("#accreditationSoughtScopeVal").val(CounterOfsizeOforganThird);	
			}
			if(sizeOfphyResourceFirstAdd>0){
			var CounterOfsizeOfphyResourceFirst=parseInt(sizeOfphyResourceFirstAdd)+1;
			$(".addMajorEquipmentInsBodiesDetailTableBox").removeClass("hide");
			$("#majorEquipmentInsBodiesVal").val(CounterOfsizeOfphyResourceFirst);
			}
			if(sizeOfphyResourceSecondAdd>0){
			var CounterOfsizeOfphyResourceSecond=parseInt(sizeOfphyResourceSecondAdd)+1;
			$(".addApplicationActivityLocInsBodiesDetailTableBox").removeClass("hide");
			$("#applicationActivityLocInsBodiesVal").val(CounterOfsizeOfphyResourceSecond);
			}
			if(insLegalEntity == "Yes"){
			$(".legalStatusDescribeInsBodies").removeClass("hide");
			}
			if(orgInsBodyPart == "Yes"){
			$(".insBodyOrgPartBoxs").removeClass("hide");
			}
}
 if(accreditationType=="FDA Approvals"){
	 accFdaScheme="<%=accFdaScheme%>";
	 supplementCerti="<%=supplementCerti%>";
	 if(accreditationServicesType!= ""){
			$( "#thirdPartyAccreditation .wizard-title" ).each( function( index, element ){
			    if($(this).text() == accreditationServicesType ){
			    	$(this).closest('a').click();
			    }
			});
		}
		if(typeOfTransaction != ""){
			$("#transactionType .wizard-title").each( function( index, element ){
		        if($(this).text() == typeOfTransaction ){
			    	$(this).closest(".wizard-card").addClass("active");
			    	$(".form-wizard-save-btn, .form-wizard-next-btn").removeClass("hide");
			    	/* $("#save-continue").click(); */
			    }
			});
		}
		 cerLegalEntity = $("input[name='thirdPartyLegalEntity']:checked").val();
		 otherServices = $("input[name='thirdPartyOtherServices']:checked").val();
		 establishedRelation= $("input[name='thirdPartyEstablishedRelation']:checked").val();
		 orgPreviouslyAccredited= $("input[name='orgPreviouslyAccreditedThirdParty']").val();
		 thirdPartyBodyOutsource= $("input[name='thirdPartyBodyOutsource']").val();
		 otherFeeReqThirdParty= $("input[name='otherFeeReqThirdParty']").val();
		 supplementaryCertificateStandard=  $("input[name='supplementaryCertificateStandard']").val();
		if(cerLegalEntity=="Yes"){
			$(".legalStatusDescribeThirdParty").removeClass("hide");
		}
		$("input:checkbox[name=accreditationCategory]").each(function() {
	        if ($(this).prop("checked")) {
	        $(this).parent().next('.accreditationCategoryInfo').removeClass("hide");
	        }
	    });
		if(otherServices=="Yes"){
			$(".thirdPartyOtherServicesBox").removeClass("hide");
		}
		if(establishedRelation=="Yes"){
			$(".thirdPartyEstablishedRelationBox").removeClass("hide");
		}
		if(orgPreviouslyAccredited=="Yes"){
			$(".orgPreviouslyAccreditedThirdPartyBox").removeClass("hide");
		}
		if(thirdPartyBodyOutsource=="Yes"){
			$(".thirdPartyOutsourceBox").removeClass("hide");
		}
		if(otherFeeReqThirdParty=="Yes"){
			$(".otherFeeReqThirdPartyBox").removeClass("hide");
		}
		if(accFdaScheme=="Other"){
			$(".accreditationFdaSchemeOther").removeClass("hide");
		}
		if(supplementCerti=="Other"){
			$(".supplementaryCertificateStandardOther").removeClass("hide");
		}
		$(".management-sys-req-third-party input").each(function() {
		    if ($(this).prop("checked")) {
		        $(this).closest(".form-group").next(".managementRefThirdParty").removeClass("hide");
		    }
		});
		if(sizeOfFdaAppliInfoAdd>0){
			var counterOfFdaAppliInfo=parseInt(sizeOfFdaAppliInfoAdd)+1;
			$(".addPersonResponsibleDetailThirdPartyTableBox").removeClass("hide");
			$("#personResponsibleThirdPartyVal").val(counterOfFdaAppliInfo);
		}
		if(sizeOfFdaScopeClientInfoAdd>0){
			var counterOfFdaScopeClientInfoAdd=parseInt(sizeOfFdaScopeClientInfoAdd)+1;
			$(".addRegisteredClientOrgThirdPartyDetailTableBox").removeClass("hide");
			$("#registeredClientOrgThirdPartyVal").val(counterOfFdaScopeClientInfoAdd);
		}
		if(sizeOfFdaPersonnelFirstInfoAdd>0){
			var counterOfFdaPersonnelFirstInfoAdd=parseInt(sizeOfFdaPersonnelFirstInfoAdd)+1;
			$(".addStaffDetailThirdPartyTableBox").removeClass("hide");
			$("#staffDetailThirdPartyVal").val(counterOfFdaPersonnelFirstInfoAdd);
		}
		if(sizeOfFdaPersonnelSecInfoAdd>0){
			var counterOfFdaPersonnelSecInfoAdd=parseInt(sizeOfFdaPersonnelSecInfoAdd)+1;
			$(".addAuditorListThirdPartyTableBox").removeClass("hide");
			$("#auditorListThirdPartyVal").val(counterOfFdaPersonnelSecInfoAdd);
		}
		if(sizeOfFdaPersonnelThirdInfoAdd>0){
			var counterOfFdaPersonnelThirdInfoAdd=parseInt(sizeOfFdaPersonnelThirdInfoAdd)+1;
			$(".addOutsourceActNatureThirdPartyTableBox").removeClass("hide");
			$("#outsourceActNatureThirdPartyVal").val(counterOfFdaPersonnelThirdInfoAdd);
		}
		if(sizeOfFdaPersonnelFourInfoAdd>0){
			var counterOfFdaPersonnelFourInfoAdd=parseInt(sizeOfFdaPersonnelFourInfoAdd)+1;
			$(".addActivityPerformedLocThirdPartyTableBox").removeClass("hide");
			$("#activityPerformedLocThirdPartyVal").val(counterOfFdaPersonnelFourInfoAdd);
		}
}
 /* FEE */
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
}
	function gettingDocumentList(){
		typeOfAccreditation=$("#accreditationTypeVal").val();
		typeOFAccreditationService="";
		if(typeOfAccreditation=="Accreditation for Labs"){
			typeOFAccreditationService=$("#laboratoriesAccreditationVal").val();	
		} else if(typeOfAccreditation=="Accreditation for Certification Bodies"){
			typeOFAccreditationService=$("#certificationAccreditationVal").val();
		}
		 else if(typeOfAccreditation=="Accreditation for Inspection Bodies"){
			 typeOFAccreditationService=$("#inspectingAccreditationVal").val();
			}
		 else if(typeOfAccreditation=="FDA Approvals"){
			 typeOFAccreditationService=$("#thirdPartyAccreditationVal").val();
			}
		janaacApplicationId = $("#janaacApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${janaacApplicationGettingDocumentList}",
			data : {
				"<portlet:namespace/>typeOfAccreditation" : typeOfAccreditation,
				"<portlet:namespace/>typeOFAccreditationService" : typeOFAccreditationService,
				"<portlet:namespace/>janaacApplicationId" : janaacApplicationId,
			},
			 async:false,
			success : function(data) {
				$("#documentList").html(data);
				var notRequiredDoc=$("#laboratoriesAccreditationVal").val();
				if(notRequiredDoc=="Accreditation of Medical Labs to the ISO 15189 Standard"){
					$("#notSupportingDoc").removeClass("hide");
				}
			},
			error : function(data) {
			},
		});
		 validation();
	}
	async function validation(){
		var janaacApplicationId = "<%=janaacApplicationId%>";
		if(janaacApplicationId>0 ){
		  var requiredDoc = $("div[id='requiredDoc']").length;
		    filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    numberOfDocument = requiredDoc;

		    if (numberOfDocument != filledDocument) {
		        $("#janaacSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    } else {
		        $("#janaacSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		    }
	}
	}
</script>