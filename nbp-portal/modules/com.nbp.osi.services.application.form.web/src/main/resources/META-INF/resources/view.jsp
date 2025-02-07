<%@ include file="/init.jsp" %>
<portlet:resourceURL var="osiServiceDraft" id="/osi/service/pending"></portlet:resourceURL>
<portlet:resourceURL var="osiServiceSubmit" id="/osi/submit"></portlet:resourceURL>
<portlet:resourceURL var="addSupportingDocFormInfoUrl" id="/supporting/doc/form/info"></portlet:resourceURL>
<portlet:resourceURL var="addIndividualDocListFormInfoUrl" id="/individual/supporting/doc/form/info"></portlet:resourceURL>
<portlet:resourceURL var="addOsiServicesDownloadPdfUrl" id="/osi/services/download/pdf"></portlet:resourceURL>
<%@ include file="/osi-services-wizard.jsp" %>
<%@ include file="/js/osi-assignment-certificate-form-js.jsp" %>
<%@ include file="/js/osi-trustee-licence-form-js.jsp" %>
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
                        <p class="modal-subtitle f2">Your application for a <span  id="osiSerDraftCategory"></span> has been correctly saved as draft.</p>
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
                                            <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 122 122" fill="none">
												<path d="M109.246 26.6875H63.1445V14.8711C63.1454 13.888 62.9524 12.9143 62.5766 12.0058C62.2007 11.0973 61.6494 10.2719 60.9542 9.57669C60.259 8.88151 59.4335 8.33026 58.525 7.95448C57.6165 7.5787 56.6428 7.38576 55.6596 7.38672H14.8706C13.8875 7.38587 12.9139 7.57889 12.0055 7.95472C11.0971 8.33055 10.2717 8.88183 9.57661 9.577C8.88149 10.2722 8.33028 11.0976 7.95451 12.006C7.57874 12.9144 7.3858 13.8881 7.38672 14.8711V107.129C7.38848 109.113 8.17751 111.016 9.58061 112.419C10.9837 113.822 12.8862 114.611 14.8706 114.613H55.6596C57.6441 114.612 59.5469 113.823 60.9502 112.419C62.3535 111.016 63.1427 109.113 63.1445 107.129V69.5781H109.246C110.67 69.5781 112.035 69.0127 113.041 68.0062C114.048 66.9998 114.613 65.6347 114.613 64.2113V32.055C114.613 31.3501 114.474 30.6522 114.205 30.0009C113.935 29.3497 113.54 28.758 113.041 28.2596C112.543 27.7612 111.951 27.3658 111.3 27.0961C110.649 26.8263 109.951 26.6875 109.246 26.6875ZM29.9043 11.9331H40.627C41.3379 11.9331 42.0198 12.2156 42.5225 12.7183C43.0252 13.221 43.3076 13.9028 43.3076 14.6138C43.3076 15.3247 43.0252 16.0066 42.5225 16.5093C42.0198 17.012 41.3379 17.2945 40.627 17.2945H29.9043C29.1933 17.2945 28.5115 17.012 28.0088 16.5093C27.5061 16.0066 27.2236 15.3247 27.2236 14.6138C27.2236 13.9028 27.5061 13.221 28.0088 12.7183C28.5115 12.2156 29.1933 11.9331 29.9043 11.9331ZM40.6259 110.049H29.9033C29.1923 110.049 28.5105 109.767 28.0077 109.264C27.505 108.761 27.2226 108.079 27.2226 107.368C27.2226 106.657 27.505 105.976 28.0077 105.473C28.5105 104.97 29.1923 104.688 29.9033 104.688H40.6259C41.3369 104.688 42.0187 104.97 42.5214 105.473C43.0241 105.976 43.3066 106.657 43.3066 107.368C43.3066 108.079 43.0241 108.761 42.5214 109.264C42.0187 109.767 41.3369 110.049 40.6259 110.049ZM58.4261 100.138H12.1041V21.8623H58.4261V26.6875H29.8602C28.45 26.6875 27.0975 27.2477 26.1004 28.2449C25.1032 29.2421 24.543 30.5945 24.543 32.0047V64.2559C24.543 64.9548 24.6806 65.6469 24.9481 66.2926C25.2156 66.9384 25.6076 67.5251 26.1018 68.0193C26.596 68.5135 27.1827 68.9055 27.8285 69.173C28.4742 69.4405 29.1663 69.5781 29.8652 69.5781H39.5547V78.1917C39.5547 78.7159 39.7101 79.2283 40.0013 79.6641C40.2926 80.0999 40.7065 80.4396 41.1907 80.6402C41.675 80.8408 42.2079 80.8932 42.722 80.791C43.236 80.6887 43.7083 80.4363 44.0789 80.0656L54.5664 69.5781H58.4261V100.138ZM52.6145 50.0843C53.2297 50.4416 53.6787 51.0276 53.8635 51.7146C54.0483 52.4016 53.9539 53.1338 53.6009 53.7515C53.4266 54.0587 53.1929 54.3283 52.9136 54.5445C52.6342 54.7607 52.3147 54.9193 51.9735 55.0111C51.6324 55.1029 51.2764 55.126 50.9263 55.0791C50.5761 55.0322 50.2388 54.9163 49.9338 54.738L46.5244 52.765V56.7109C46.5244 57.4219 46.242 58.1037 45.7393 58.6065C45.2365 59.1092 44.5547 59.3916 43.8438 59.3916C43.1328 59.3916 42.451 59.1092 41.9482 58.6065C41.4455 58.1037 41.1631 57.4219 41.1631 56.7109V52.765L37.7526 54.738C37.4476 54.9163 37.1102 55.0322 36.7601 55.0791C36.41 55.126 36.054 55.1029 35.7128 55.0111C35.3717 54.9193 35.0522 54.7607 34.7728 54.5445C34.4934 54.3283 34.2598 54.0587 34.0854 53.7515C33.733 53.1337 33.6389 52.4017 33.8236 51.7148C34.0084 51.028 34.4571 50.4419 35.0719 50.0843L38.4824 48.1328L35.0719 46.1598C34.4548 45.8044 34.0042 45.2183 33.8192 44.5306C33.6342 43.8429 33.73 43.1099 34.0855 42.4928C34.441 41.8757 35.027 41.4251 35.7147 41.2401C36.4025 41.0551 37.1355 41.1509 37.7526 41.5064L41.1631 43.4792V39.5547C41.1631 38.8437 41.4455 38.1619 41.9482 37.6592C42.451 37.1565 43.1328 36.874 43.8438 36.874C44.5547 36.874 45.2365 37.1565 45.7393 37.6592C46.242 38.1619 46.5244 38.8437 46.5244 39.5547V43.4792L49.9339 41.5064C50.551 41.1509 51.284 41.0551 51.9717 41.2401C52.6594 41.4251 53.2455 41.8757 53.601 42.4928C53.9564 43.1099 54.0522 43.8429 53.8672 44.5306C53.6822 45.2183 53.2316 45.8044 52.6146 46.1598L49.2051 48.1328L52.6145 50.0843ZM78.3488 50.0843C78.964 50.4416 79.413 51.0276 79.5978 51.7146C79.7826 52.4016 79.6883 53.1338 79.3353 53.7515C79.1609 54.0587 78.9273 54.3283 78.6479 54.5445C78.3686 54.7607 78.049 54.9193 77.7079 55.0111C77.3668 55.1029 77.0108 55.126 76.6606 55.0791C76.3105 55.0322 75.9731 54.9163 75.6682 54.738L72.2588 52.765V56.7109C72.2588 57.4219 71.9764 58.1037 71.4736 58.6065C70.9709 59.1092 70.2891 59.3916 69.5781 59.3916C68.8672 59.3916 68.1853 59.1092 67.6826 58.6065C67.1799 58.1037 66.8975 57.4219 66.8975 56.7109V52.765L63.4869 54.738C63.182 54.9163 62.8446 55.0322 62.4945 55.0791C62.1443 55.126 61.7884 55.1029 61.4472 55.0111C61.1061 54.9193 60.7866 54.7607 60.5072 54.5445C60.2278 54.3283 59.9942 54.0587 59.8198 53.7515C59.4673 53.1337 59.3732 52.4017 59.558 51.7148C59.7428 51.028 60.1914 50.4419 60.8063 50.0843L64.2168 48.1328L60.8063 46.1598C60.1892 45.8044 59.7386 45.2183 59.5536 44.5306C59.3686 43.8429 59.4644 43.1099 59.8199 42.4928C60.1754 41.8757 60.7614 41.4251 61.4491 41.2401C62.1368 41.0551 62.8699 41.1509 63.4869 41.5064L66.8975 43.4792V39.5547C66.8975 38.8437 67.1799 38.1619 67.6826 37.6592C68.1853 37.1565 68.8672 36.874 69.5781 36.874C70.2891 36.874 70.9709 37.1565 71.4736 37.6592C71.9764 38.1619 72.2588 38.8437 72.2588 39.5547V43.4792L75.6683 41.5064C76.2853 41.1509 77.0184 41.0551 77.7061 41.2401C78.3938 41.4251 78.9798 41.8757 79.3353 42.4928C79.6908 43.1099 79.7866 43.8429 79.6016 44.5306C79.4166 45.2183 78.966 45.8044 78.3489 46.1598L74.9395 48.1328L78.3488 50.0843ZM104.083 50.0843C104.698 50.4416 105.147 51.0276 105.332 51.7146C105.517 52.4016 105.423 53.1338 105.07 53.7515C104.895 54.0587 104.662 54.3283 104.382 54.5445C104.103 54.7607 103.783 54.9193 103.442 55.0111C103.101 55.1029 102.745 55.126 102.395 55.0791C102.045 55.0322 101.708 54.9163 101.403 54.738L97.9932 52.765V56.7109C97.9932 57.4219 97.7107 58.1037 97.208 58.6065C96.7053 59.1092 96.0235 59.3916 95.3125 59.3916C94.6015 59.3916 93.9197 59.1092 93.417 58.6065C92.9143 58.1037 92.6318 57.4219 92.6318 56.7109V52.765L89.2213 54.738C88.9163 54.9163 88.579 55.0322 88.2288 55.0791C87.8787 55.126 87.5227 55.1029 87.1816 55.0111C86.8404 54.9193 86.5209 54.7607 86.2416 54.5445C85.9622 54.3283 85.7285 54.0587 85.5542 53.7515C85.2017 53.1337 85.1076 52.4017 85.2924 51.7148C85.4772 51.028 85.9258 50.4419 86.5407 50.0843L89.9512 48.1328L86.5407 46.1598C85.9236 45.8044 85.473 45.2183 85.288 44.5306C85.103 43.8429 85.1988 43.1099 85.5543 42.4928C85.9097 41.8757 86.4958 41.4251 87.1835 41.2401C87.8712 41.0551 88.6042 41.1509 89.2213 41.5064L92.6318 43.4792V39.5547C92.6318 38.8437 92.9143 38.1619 93.417 37.6592C93.9197 37.1565 94.6015 36.874 95.3125 36.874C96.0235 36.874 96.7053 37.1565 97.208 37.6592C97.7107 38.1619 97.9932 38.8437 97.9932 39.5547V43.4792L101.403 41.5064C101.708 41.3304 102.045 41.2163 102.395 41.1706C102.745 41.1249 103.1 41.1485 103.44 41.2401C103.781 41.3317 104.1 41.4895 104.38 41.7044C104.659 41.9193 104.894 42.1872 105.07 42.4928C105.246 42.7983 105.36 43.1356 105.406 43.4852C105.451 43.8349 105.428 44.1901 105.336 44.5306C105.244 44.8711 105.087 45.1903 104.872 45.4698C104.657 45.7494 104.389 45.9838 104.083 46.1598L100.674 48.1328L104.083 50.0843Z" fill="#047247"></path>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">OSI Services<br> Transaction Number</p>
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
                                        <a href="" class="draftlink f2" id="pop_status"></a>
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
	function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();
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
		pendingOsiService();
	}

	$(".hidePopup").click(function () {
		$(".editYearlyWorkingTimeDetailPopup").modal("hide");
	});
	function openSaveToDraftPopupOsiServices(){
		openOsiServiceDraft();
		 $(".savecountinuePopup").modal("show");
		 osiAssignmentCertificateFormTab = $(".osiAssignmentCertificateFormTab").find(".active span:nth-child(2)").text();
		 osiTrusteeIndiLicenceFormTab = $(".osiTrusteeIndiLicenceFormTab").find(".active span:nth-child(2)").text();
		 osiTrusteeComLicenceFormTab = $(".osiTrusteeComLicenceFormTab").find(".active span:nth-child(2)").text();
		 
		 /* Assignment Ceritificate Form */
		 if(osiAssignmentCertificateFormTab == 'Applicant Details'){
			 applicantDetailInfo(true);
		 }else if(osiAssignmentCertificateFormTab == 'Insolvent Person Details'){
			 insolventDetailInfo(true);
		 }else if(osiAssignmentCertificateFormTab == 'Statement of Affairs'){
			 nextWithoutSave(true);
		 }else if(osiAssignmentCertificateFormTab == 'Assignment for the General Benefit of Creditors (Form 28)'){
			 creditorDetailInfo(true);
			 uploadDocuments("creditorUploadBtn","Signature General Benefit Creditors");
		 }else if(osiAssignmentCertificateFormTab == 'Application for Assignment'){
			 assignmentDetailInfo(true);
			 uploadDocuments("insolventPersonUploadBtn","Signature Assignment");
		 }
		 /* Trustee Indi Form */
		 if(osiTrusteeIndiLicenceFormTab == 'General Information(Form 54)'){
			 truteeIndiDetailInfo(true);
		 }else if(osiTrusteeIndiLicenceFormTab == 'Qualifications(Form 54)'){
			 indiQualificationDetailInfo(true);
			 uploadDocuments("qualificationsForm","qualification Form");
	         uploadDocuments("education-upload-btn","Signature Trustee Qualification");
		 }else if(osiTrusteeIndiLicenceFormTab == 'Reputation Declaration(Form 54)'){
			 nextWithoutSave(true);
		 }else if(osiTrusteeIndiLicenceFormTab == 'Applicant Undertaking(Form 54)'){
			 nextWithoutSave(true);
			 uploadDocuments("indi-undersigned-signature-upload-btn","Signature Trustee Undersigned");
		 }else if(osiTrusteeIndiLicenceFormTab == 'Declaration and Signature'){
			 indiUndersignedDetailInfo(true);
		 }else if(osiTrusteeIndiLicenceFormTab == 'Trustee Licence Breakdown'){
			 indiLicenceBreakdownInfo(true);
			 addYearlyWorkingTimeDetailBox();
			 uploadDocuments("breakdown-applicant-signature-upload-btn","Signature of Applicant");
	         uploadDocuments("breakdown-trustee-signature-upload-btn","Signature of Trustee");
		 }else if(osiTrusteeIndiLicenceFormTab == 'Documents List(Form 54)'){
			 addDocumentListForm();
		 }
		 
		 
		 /* Trustee Com Form */
		 if(osiTrusteeComLicenceFormTab == 'General Information(Form 54A)'){
			 truteeComDetailInfo(true);
		 }else if(osiTrusteeComLicenceFormTab == 'Signature(Form 54A)'){
			 uploadDocuments("undersigned-com-signature-upload-btn","Signature Behalf of Corporation");
			 signTrusteeComUpload(true);
			 comTrusteeSign(true);
			 
		 }else if(osiTrusteeComLicenceFormTab == "Documents List(Form 54A)"){
			 addSupportingDocument();
		 }
		 
	}
	function openOsiServiceDraft(){
		osiServiceApplicationId=$("#osiServicesApplicationId").val();
		assignmentCertificateTypeVal=$("#assignmentCertificateTypeVal").val();		
		trusteeLicenceTypeVal=$("#trusteeLicenceTypeVal").val();		
		trusteeTransactionTypeVal=$("#trusteeTransactionTypeVal").val();
		certificateTypeVal=$("#certificateTypeVal").val();
		 lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
		 
		 if(currentStage == "SUPPORTING DOCUMENTS"){
			 uploadDocuments("osiServiceGenericUpload","OSI Services Generic Documents","");
		 }
		 if(currentStage == "APPLICATION FEES PAYMENT"){
			 submitFeeDetailsInOsiService();
		 }
		 $.ajax({
			    type: "POST",
			    url: "${osiServiceDraft}",
			    data: {
			    	 "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
			    	 "<portlet:namespace/>assignmentCertificateTypeVal": assignmentCertificateTypeVal,
			    	 "<portlet:namespace/>trusteeLicenceTypeVal": trusteeLicenceTypeVal,
			    	 "<portlet:namespace/>trusteeTransactionTypeVal": trusteeTransactionTypeVal,
			    	 "<portlet:namespace/>certificateTypeVal": certificateTypeVal,
			    	 "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			    	 "<portlet:namespace/>currentStage": currentStage,
			      		    },
			    success: function (data) {
			    	var result = data.APP_DATA;
			    	$("#pop_app_no").html(result["applicationNumber"]);
				    $("#pop_status").html(result["status"]);
				    $("#pop_category").html(result["categories"]);
				    $("#osiSerDraftCategory").html(result["categories"]);
			        $("#osiServicesApplicationId").val(result["osiServiceApplicationId"]);
			       
		    	},
			    error: function (data) {
			    },
			  });
		}
	$(document).ready(function () {
		continueApplicationForm();
		
	});
	function continueApplicationForm(){
		var osiServicesApplicationId = "<%=osiServiceApplicationId%>";
		if(osiServicesApplicationId > 0 ){
			showLastFormStep();
			showSelectedCategory();
			continueEditFormDetails();
			showPaymentAfterSave();
			showPreviewInLastStage();
			/* showFinalButtonInLastStage(); */
			gettingDocumentList();
		}
	}
	function continueEditFormDetails(){
		var lastFormStep = "<%=lastFormStep%>";
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		$(".tab-content .tab-pane").each(function(index, element) {
			if ($(this).attr("id") == lastFormStep) {
				$(this).addClass("active");
				$(this).prevAll().removeClass("active");
				$(this).nextAll().removeClass("active");
			}
			
		});

		$(".tab-plus-wizard-left li a").each(
				function(index, element) {
					if ($(this).attr("href") == "#" + lastFormStep) {
						$(this).parents().prevAll("li").find("a").removeClass("active disabled");
						$(this).addClass("active");
						$(this).removeClass("disabled");
					}
				});
	}
	function showLastFormStep(){
		var currentStage = "<%=currentStageName %>";
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
		var osiServiceApplicationId='<%=osiServiceApplicationId%>'
		var currentStage = "<%=currentStageName%>";
		var doYouWantTo = "<%=doYouWantTo%>";
		var typeOfApplicant = "<%=typeOfApplicant%>";
		var natureOfApplicant = "<%=natureOfApplicant%>";
		var kindOfApplication = "<%=kindOfApplication%>";
		var counterOfTrustee = "<%=counterOfTrustee%>";
		var sizeOfYearlyAdd = "<%=sizeOfYearlyAdd%>";
		 var companyCheckbox="<%=checkBoxVal%>";
		paymentMethod="<%=paymentMethod%>";
		amount="<%=amount%>";
		currency="<%=currency%>";
		
		$("#rm-payment-method").val(paymentMethod);
		$("#amountCurrency").val(currency);
		$("#osiServicesApplicationId").val(osiServiceApplicationId);
		$("#assignmentCertificateTypeVal").val(typeOfApplicant);
		$("#trusteeLicenceTypeVal").val(natureOfApplicant);
		$("#trusteeTransactionTypeVal").val(kindOfApplication);
		$("#certificateTypeVal").val(doYouWantTo);
		if(sizeOfYearlyAdd>0){
		$("#yearlyWorkingTimeDetailVal").val(counterOfTrustee);
		$(".addYearlyWorkingTimeTableBox").removeClass("hide");
		}
		if(currentStage=="APPLICANT TYPE"){
			$("#licenceType").removeClass("hide");
		}
		if(doYouWantTo!= ""){
			$("#osiServicesCertificateTypeBox .wizard-title span").each( function( index, element ){
			    if($(this).text() == doYouWantTo ){
			    	$(this).parents(".wizard-card").addClass("active");
			    }
			});
		}
		
		if(doYouWantTo=="Certificate of Assignment"){
			$("#licenceType").addClass("hide");
			if(typeOfApplicant!= ""){
				$("#certificateType .wizard-title").each( function( index, element ){
				    if($(this).text() == typeOfApplicant ){
				    	$(this).parents(".wizard-card").addClass("active");
				    }
				});
			}
			$("#certificateType").removeClass("hide");
			$(".osiAssignmentCertificateFormTab ").removeClass("hide"); 
			$("#osiAssignmentCertificateForm").removeClass("hide"); 
			$(".osiAssignmentCertificatePreTab").removeClass("hide"); 
			$("#osiAssignmentCertificatePre").removeClass("hide"); 
			$("#rm-payment-method, .fee-section").addClass("hide");
			$(".application-Fees .common-heading").text("No Application Fee is applicable for the selected Category.");
			$("#supportingDocStep").html('5');
			$("#rm-payment-method, .fee-section").addClass("hide");
		}else{
			$("#rm-payment-method, .fee-section").removeClass("hide");
			$(".application-Fees .common-heading").text("Application Fee");
		}
		if(doYouWantTo=="Trustee Licence"){
		$("#licenceType").removeClass("hide");
		if(natureOfApplicant!= ""){
			$("#licenceType .wizard-title").each( function( index, element ){
			    if($(this).text() == natureOfApplicant ){
			    	$(this).parents(".wizard-card").addClass("active");
			    } 
			});
		}
		$("#transactionType").removeClass("hide");
		if(kindOfApplication!= ""){
			$("#transactionType .wizard-title").each( function( index, element ){
			    if($(this).text() == kindOfApplication ){
			    	$(this).parents(".wizard-card").addClass("active");
			    }
			});
		}
		if(natureOfApplicant=="Individual"){
			$(".osiTrusteeIndiLicenceFormTab ").removeClass("hide");
			$("#osiTrusteeIndiLicenceForm ").removeClass("hide");
			$(".osiTrusteeIndiLicencePreTab ").removeClass("hide");
			$("#osiTrusteeIndiLicencePre ").removeClass("hide");
			$("#supportingDocStep").html('5');
			$("#feePaymentStep").html('6');
		}else if(natureOfApplicant=="Company"){
			$(".osiTrusteeComLicenceFormTab ").removeClass("hide");
			$("#osiTrusteeComLicenceForm ").removeClass("hide");
			$(".osiTrusteeComLicencePreTab ").removeClass("hide");
			$("#osiTrusteeComLicencePre").removeClass("hide");
			$("#supportingDocStep").html('3');
			$("#feePaymentStep").html('4');
		}
		}
		var applicantNatureSaveAndCon = '<%=natureOfApplicantName%>';
		if(applicantNatureSaveAndCon == "Individual"){
	    	$(".indi-detail").removeClass("hide");
	    	$(".com-detail").addClass("hide");
	    }else if(applicantNatureSaveAndCon=="Company"){
	    	$(".com-detail").removeClass("hide");
	    	$(".indi-detail").addClass("hide");
	    }
		var insolventPersonNature = '<%=insolventPersonNature%>';
		if(insolventPersonNature == "Individual"){
	    	$(".insolvent-indi-detail").removeClass("hide");
	    	$(".insolvent-com-detail").addClass("hide");
	    }else if(insolventPersonNature=="Company"){
	    	$(".insolvent-com-detail").removeClass("hide");
	    	$(".insolvent-indi-detail").addClass("hide");
	    }
		
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
	if(natureOfApplicant == "Company"){
		$(document).ready(function() {
			  // Initial load pe checked checkboxes ke liye document checklist hide ho jayenge
			  toggleDocumentChecklist();
			  toggleIndiDocumentChecklist();
			});
			$("input:checkbox[name=comSupportingDoc]").on("change", function() {
			  toggleDocumentChecklist();
			});
			function toggleDocumentChecklist() {
			  $("input:checkbox[name=comSupportingDoc]").each(function() {
			    if ($(this).prop("checked")) {
			      $(this).parent().next('.documentChecklist').addClass("hide"); // If checked, hide
			    } else {
			      $(this).parent().next('.documentChecklist').removeClass("hide"); // If unchecked, show
			    }
			  });
			}
			$("input:checkbox[name=indSupportingDoc]").on("change", function() {
			  toggleIndiDocumentChecklist();
			});
			function toggleIndiDocumentChecklist() {
			  $("input:checkbox[name=indSupportingDoc]").each(function() {
			    if ($(this).prop("checked")) {
			      $(this).parent().next('.documentChecklist').addClass("hide"); // If checked, hide
			    } else {
			      $(this).parent().next('.documentChecklist').removeClass("hide"); // If unchecked, show
			    }
			  });
			}
	}

	}
	var paymentMethodOption="<%=clickPaymentOption%>";
	function showPaymentAfterSave(){
		if(paymentMethodOption != ""){
			$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		        if($(this).text() == paymentMethodOption){
		        	$(this).closest("a").click();
			    }
			});
		}
	}
	function showPreviewInLastStage(){
		previewApplicantDetailInfo();
		previewInsolventDetailInfo();
		previewCreditorDetailInfo();
		previewAssignmentDetailInfo();
		previewTruteeIndiDetailInfo();
		previewIndiQualificationDetailInfo();
		previewIndiUndersignedDetailInfo();
		previewIndiLicenceBreakdownInfo();
		previewTruteeComDetailInfo();
   	}
	function submitOsiService(){
		osiServiceApplicationId=$("#osiServicesApplicationId").val();
		assignmentCertificateTypeVal=$("#assignmentCertificateTypeVal").val();		
		trusteeLicenceTypeVal=$("#trusteeLicenceTypeVal").val();		
		trusteeTransactionTypeVal=$("#trusteeTransactionTypeVal").val();
		certificateTypeVal=$("#certificateTypeVal").val();
		lastFormDetailsStep = $(".tab-pane.active").attr("id");
		 $.ajax({
			    type: "POST",
			    url: "${osiServiceSubmit}",
			    data: {
			    	 "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
			    	 "<portlet:namespace/>assignmentCertificateTypeVal": assignmentCertificateTypeVal,
			    	 "<portlet:namespace/>trusteeLicenceTypeVal": trusteeLicenceTypeVal,
			    	 "<portlet:namespace/>trusteeTransactionTypeVal": trusteeTransactionTypeVal,
			    	 "<portlet:namespace/>certificateTypeVal": certificateTypeVal,
			    	 "<portlet:namespace/>lastFormDetailsStep": lastFormDetailsStep,
			      		    },
			    success: function (data) {
			    	var result = data.APP_DATA;
			    	var appStatus = result["status"];
			    	if(appStatus=="submitted"){
			    		$("#continueDashboardOSIServices").removeClass("hide");
			    		$("#submitted-content").removeClass("hide");
			    		$("#application_submitted-img").removeClass("hide");
			    	}else{
			    		$("#draft-content").removeClass("hide");
			    		$("#application_draft-img").removeClass("hide");
			    	}
			    	$(".custom_loader").addClass("hide");
			    	$("#submit_pop_app_no").html(result["applicationNumber"]);
				    $("#submit_pop_status").html(result["status"]);
			        $("#osiServicesApplicationId").val(result["osiServiceApplicationId"]);
			        $("#submit_pop_category").html(result["categories"]);
			        $("#osiSerSubmitCategory").html(result["categories"]);
		    	},
			    error: function (data) {
			    },
			  });
		}
	function addSupportingDocument(){
    var selectedSupportingDocCheckbox= new Array();
    $("input:checkbox[name=comSupportingDoc]:checked").each(function () {
        selectedSupportingDocCheckbox.push($(this).val());
    });
	  var selectedInfo=selectedSupportingDocCheckbox.toString();
	  supportingDocCheckboxes=selectedInfo;
	  nonProvisionReasonReq1=$("#nonProvisionReasonReq1").val();
	  expectedDateReq1=$("#expectedDateReq1").val();
	  nonProvisionReasonReq2=$("#nonProvisionReasonReq2").val();
	  expectedDateReq2=$("#expectedDateReq2").val();
	  nonProvisionReasonReq3=$("#nonProvisionReasonReq3").val();
	  expectedDateReq3=$("#expectedDateReq3").val();
	  nonProvisionReasonReq4=$("#nonProvisionReasonReq4").val();
	  expectedDateReq4=$("#expectedDateReq4").val();
	  nonProvisionReasonReq5=$("#nonProvisionReasonReq5").val();
	  expectedDateReq5=$("#expectedDateReq5").val();
	  nonProvisionReasonReq6=$("#nonProvisionReasonReq6").val();
	  expectedDateReq6=$("#expectedDateReq6").val();
	  nonProvisionReasonReq7=$("#nonProvisionReasonReq7").val();
	  expectedDateReq7=$("#expectedDateReq7").val();
	  nonProvisionReasonReq8=$("#nonProvisionReasonReq8").val();
	  expectedDateReq8=$("#expectedDateReq8").val();
	  nonProvisionReasonReq9=$("#nonProvisionReasonReq9").val();
	  expectedDateReq9=$("#expectedDateReq9").val();
	  nonProvisionReasonReq10=$("#nonProvisionReasonReq10").val();
	  expectedDateReq10=$("#expectedDateReq10").val();
	  nonProvisionReasonReq11=$("#nonProvisionReasonReq11").val();
	  expectedDateReq11=$("#expectedDateReq11").val();
	  nonProvisionReasonReq12=$("#nonProvisionReasonReq12").val();
	  expectedDateReq12=$("#expectedDateReq12").val();
	  osiServiceApplicationId=$("#osiServicesApplicationId").val();
	  trusteeLicenceTypeVal=$("#trusteeLicenceTypeVal").val();
	  $.ajax({
	      type: "POST",
	      url: "${addSupportingDocFormInfoUrl}",	
	      data: {
	        "<portlet:namespace/>supportingDocCheckboxes": supportingDocCheckboxes,
	        "<portlet:namespace/>nonProvisionReasonReq1": nonProvisionReasonReq1,
	        "<portlet:namespace/>expectedDateReq1": expectedDateReq1,
	        "<portlet:namespace/>nonProvisionReasonReq2": nonProvisionReasonReq2,
	        "<portlet:namespace/>expectedDateReq2": expectedDateReq2,
	        "<portlet:namespace/>nonProvisionReasonReq3": nonProvisionReasonReq3,
	        "<portlet:namespace/>expectedDateReq3": expectedDateReq3,
	        "<portlet:namespace/>nonProvisionReasonReq4": nonProvisionReasonReq4,
	        "<portlet:namespace/>expectedDateReq4": expectedDateReq4,
	        "<portlet:namespace/>nonProvisionReasonReq5": nonProvisionReasonReq5,
	        "<portlet:namespace/>expectedDateReq5": expectedDateReq5,
	        "<portlet:namespace/>nonProvisionReasonReq6": nonProvisionReasonReq6,
	        "<portlet:namespace/>expectedDateReq6": expectedDateReq6,
	        "<portlet:namespace/>nonProvisionReasonReq7": nonProvisionReasonReq7,
	        "<portlet:namespace/>expectedDateReq7": expectedDateReq7,
	        "<portlet:namespace/>nonProvisionReasonReq8": nonProvisionReasonReq8,
	        "<portlet:namespace/>expectedDateReq8": expectedDateReq8,
	        "<portlet:namespace/>nonProvisionReasonReq9": nonProvisionReasonReq9,
	        "<portlet:namespace/>expectedDateReq9": expectedDateReq9,
	        "<portlet:namespace/>nonProvisionReasonReq10": nonProvisionReasonReq10,
	        "<portlet:namespace/>expectedDateReq10": expectedDateReq10,
	        "<portlet:namespace/>nonProvisionReasonReq11": nonProvisionReasonReq11,
	        "<portlet:namespace/>expectedDateReq11": expectedDateReq11,
	        "<portlet:namespace/>nonProvisionReasonReq12": nonProvisionReasonReq12,
	        "<portlet:namespace/>expectedDateReq12": expectedDateReq12,
	        "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
	        "<portlet:namespace/>trusteeLicenceTypeVal": trusteeLicenceTypeVal,
	       
	         },
	      success: function (data) {
	      },
	      error: function (data) {},
	    });
	}
	/* OSI SERVICES-->SUPPORTING DOCS INDIVIDUAL */
	function addDocumentListForm(){
		osiServiceApplicationId=$("#osiServicesApplicationId").val();
		var indSupportDoc = new Array();
		$("input:checkbox[name=indSupportingDoc]:checked").each(function(){
			indSupportDoc.push($(this).val());
		});
		var indSupportingDoc = indSupportDoc.toString();
		$.ajax({
		    type: "POST",
		    url: "${addIndividualDocListFormInfoUrl}",
		    data: {
		    	
			     "<portlet:namespace/>indSupportingDoc": indSupportingDoc,
			     "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
		
			    },
		    success: function (data) {
		    },
		    error: function (data) {},
		  });
	} 
	
	function downloadPDF() {
		osiServiceApplicationId=$("#osiServicesApplicationId").val();
        checkPdfDownloadWithoutDocument = $("#checkPdfDownloadWithoutDocument").val();
        $.ajax({
                type: "POST",
                url: "${addOsiServicesDownloadPdfUrl}",
                data: {
                        "<portlet:namespace/>osiServiceApplicationId": osiServiceApplicationId,
                        "<portlet:namespace/>checkPdfDownloadWithoutDocument": checkPdfDownloadWithoutDocument,
                },
                success: function(data) {
                        var result = data.APP_DATA;
                        console.log("PDF FILE URL***");
                        $("#osiServicesDownloadPDF").attr("href", result["fileUrl"]);
                        $("#osiServicesDownloadPDF, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
                        $("#checkPdfDownloadWithoutDocument").val(result["checkPdfDownloadWithoutDocument"]);
                },
                error: function(data) {},
        });
    }
	
</script>