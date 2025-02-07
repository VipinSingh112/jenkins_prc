<%@ include file="../init.jsp" %>
<portlet:resourceURL var="accoHotelLicenceDetail" id="/acco/hotel/licence"></portlet:resourceURL>
<portlet:resourceURL var="addAccoGenDecDetail" id="/add/acco/gen/dec"></portlet:resourceURL>
<portlet:resourceURL var="accoNonHotelLicenceInfo" id="/acco/non/hotel/licence"></portlet:resourceURL>
<portlet:resourceURL var="accoNonHotelRequiredLicInfo" id="/acco/non/hotel/required/lic"></portlet:resourceURL>
<portlet:resourceURL var="accoNonHotelGenDecInfo" id="/acco/non/hotel/gen/dec"></portlet:resourceURL>
<portlet:resourceURL var="accoHomeStayLicenceInfo" id="/acco/home/stay/licence"></portlet:resourceURL>
<portlet:resourceURL var="attractionApplicantDetailInfo" id="/attraction/applicant/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionGenDeclarationInfo" id="/attraction/general/declaration/info"></portlet:resourceURL>
<portlet:resourceURL var="carRentalLicenceInfo" id="/car/rental/licence/info"></portlet:resourceURL>
<portlet:resourceURL var="carRentalConditionInfo" id="/car/rental/condition/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionDomesticTourUrl" id="/domestic/tour/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionDomesticTourServiceUrl" id="/domestic/tour/service/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionTravelAgencyUrl" id="/domestic/travel/agency/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionWaterSportsUrl" id="/water/sport/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionWaterSportsGeneralDeclarationUrl" id="/water/sport/general/declare/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionWaterSportsRequirementsUrl" id="/water/sport/requirements/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionContractCarriageDetailUrl" id="/contract/carriage/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionContractCarriageGeneralDeclarationUrl" id="/contract/carriage/general/declare/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionTravelHaltApplicationUrl" id="/travel/halt/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionTravelHaltOfferedUrl" id="/travel/halt/offered/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionWaterEmployeeLicenceUrl" id="/water/employee/licence/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionWaterEmpGeneralDeclarationUrl" id="/water/employee/general/declareinfo"></portlet:resourceURL>
<portlet:resourceURL var="attractionMoterBikeRentalUrl" id="/motor/bike/rental/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionMoterBikeConditionProposedUrl" id="/motor/bike/condition/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionPlaceOfInterestDetailUrl" id="/place/of/interest/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionPlaceOfInterestGenDeclareUrl" id="/place/of/interest/general/declare/info"></portlet:resourceURL>
<portlet:resourceURL var="attractionCraftTraderPermitUrl" id="/craft/trader/permit/info"></portlet:resourceURL>
<script>
function addAccoHotelLicenceDetail(isSaveAndContinue) {  
	submit=true;
	   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		newAccomadationOwnerName=$("#newAccomadationOwnerName").val();
		newAccomadationHotelName=$("#newAccomadationHotelName").val();
		newAccomadationTelephone=$("#newAccomadationTelephone").val();
		newAccomadationFaxNum=$("#newAccomadationFaxNum").val();
		newAccomadationEmail=$("#newAccomadationEmail").val();
		newAccomadationParish=$("#newAccomadationParish").val();
		newAccomadationAddress=$("#newAccomadationAddress").val();
		if(!isSaveAndContinue){
			if(!newAccomadationEmail){
				  $("#newAccommodationEmailValidation").removeClass("hide");
				  $("#newAccommodationEmailValidation").text("Please Enter E-mail address");
				  $("#newAccomadationEmail").focus();
				  submit= false;
			  }else if(newAccomadationEmail.match(mailformat)){ 
					$("#newAccommodationEmailValidation").addClass("hide");
				}else
					{
						$("#newAccommodationEmailValidation").removeClass("hide");
						$("#newAccommodationEmailValidation").text("You have entered an invalid email address");
						$("#newAccomadationEmail").focus();
						submit= false;
					}
			if(!newAccomadationOwnerName){
				$("#newAccommodationOwnerNameValidation").removeClass("hide");
				$("#newAccomadationOwnerName").focus();
				submit= false;
			}else{
				$("#newAccommodationOwnerNameValidation").addClass("hide");
			}	
		}
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
			$.ajax({
						type : "POST",
						url : "${accoHotelLicenceDetail}",
						data : {
							"<portlet:namespace/>newAccomadationOwnerName" : newAccomadationOwnerName,
							"<portlet:namespace/>newAccomadationHotelName" : newAccomadationHotelName,
							"<portlet:namespace/>newAccomadationTelephone" : newAccomadationTelephone,
							"<portlet:namespace/>newAccomadationFaxNum" : newAccomadationFaxNum,
							"<portlet:namespace/>newAccomadationEmail" : newAccomadationEmail,
							"<portlet:namespace/>newAccomadationParish" : newAccomadationParish,
							"<portlet:namespace/>newAccomadationAddress" : newAccomadationAddress,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							if(!isSaveAndContinue){
								applicantInfo();
								/* addAccoHotelLicenceDetail(); */
							}						
							$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						},
						error : function(data) {
						},
					});
		}
	 }
	function addAccoGenDeclarationDetail() {
		newAccomadationHotelBedroom=$("#newAccomadationHotelBedroom").val();
		accomadationHotelOwner=$("#accomadationHotelOwner").val();
		newAccomadationHotelAddress=$("#newAccomadationHotelAddress").val();
		accomadationHotelLaws=$("#accomadationHotelLaws").val();
		newAccomadationDateCom=$("#newAccomadationDateCom").val();
		newAccomadationHotelOperator=$("#newAccomadationHotelOperator").val();
		newAccomadationHotelOperatorDate=$("#newAccomadationHotelOperatorDate").val();
		newHotelAccomadationAddress=$("#newHotelAccomadationAddress").val();
		newAccomadationHotelCompanylaws=$("#newAccomadationHotelCompanylaws").val();
		newAccomadationHotelOperatorName=$("#newAccomadationHotelOperatorName").val();
		newAccomadationDateHotel=$("#newAccomadationDateHotel").val();
		newAccomadationDate=$("#newAccomadationDate").val();
		newAccomadationHotelFinance=$("#newAccomadationHotelFinance").val();
		newAccomadationHotelEmployeesNo=$("#newAccomadationHotelEmployeesNum").val();
		newAccomadationSignDate=$("#newAccomadationHSignDate").val();
		newAccomadationHotelManager=$("#newAccomadationHotelManagerName").val();
		jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
						type : "POST",
						url : "${addAccoGenDecDetail}",
						data : {
							"<portlet:namespace/>newAccomadationHotelBedroom" : newAccomadationHotelBedroom,
							"<portlet:namespace/>accomadationHotelOwner" : accomadationHotelOwner,
							"<portlet:namespace/>newAccomadationHotelAddress" : newAccomadationHotelAddress,
							"<portlet:namespace/>accomadationHotelLaws" : accomadationHotelLaws,
							"<portlet:namespace/>newAccomadationDateCom" : newAccomadationDateCom,
							"<portlet:namespace/>newAccomadationHotelOperator" : newAccomadationHotelOperator,
							"<portlet:namespace/>newAccomadationHotelOperatorDate" : newAccomadationHotelOperatorDate,
							"<portlet:namespace/>newHotelAccomadationAddress" : newHotelAccomadationAddress,
							"<portlet:namespace/>newAccomadationHotelCompanylaws" : newAccomadationHotelCompanylaws,
							"<portlet:namespace/>newAccomadationHotelOperatorName" : newAccomadationHotelOperatorName,
							"<portlet:namespace/>newAccomadationDateHotel" : newAccomadationDateHotel,
							"<portlet:namespace/>newAccomadationDate" : newAccomadationDate,
							"<portlet:namespace/>newAccomadationHotelFinance" : newAccomadationHotelFinance,
							"<portlet:namespace/>newAccomadationHotelEmployeesNo" : newAccomadationHotelEmployeesNo,
							"<portlet:namespace/>newAccomadationSignDate" : newAccomadationSignDate,
							"<portlet:namespace/>newAccomadationHotelManager" : newAccomadationHotelManager,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							uploadDocuments('address-of-directors',"Hotel Licence Certificate Issued","The attached list shows the names and addresses of all the Directors of the company");
                            uploadDocuments('public-laws',"Hotel Public Health Law","The attached certificate issued under the Public Health Law is to the best of my knowledge in full force and effect");
                            uploadDocuments('applicantSignatureHotelBtn',"Hotel Signature Of Applicant","");
                            uploadDocuments('managerSignatureHotelBtn',"Hotel Signature Of Manager","");
						},
						error : function(data) {
						},
					});
	 }
	function addAccoNonHotelLicence(isSaveAndContinue) {
		submit=true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		nonHotelAccommodationName=$("#nonHotelAccommodationName").val();
		nonHotelAccomadationAddress=$("#nonHotelAccomadationAddress").val();
		nonHotelAccomadationTelephone=$("#nonHotelAccomadationTelephone").val();
		nonHotelAccomadationFaxNum=$("#nonHotelAccomadationFaxNum").val();
		nonHotelAccomadationEmail=$("#nonHotelAccomadationEmail").val();
		nonHotelAccomadationEmployeesNum=$("#nonHotelAccomadationEmployeesNum").val();
		nonHotelAccomadationTypeOffered=$("input[name='offeredAccomadation']:checked").val();
		nonHotelAccomadationRoomNum=$("#nonHotelAccomadationRoomNum").val();
		nonHotelAccomadationOwnerName=$("#nonHotelAccomadationOwnerName").val();
		nonHotelAccomadationAddressOwner=$("#nonHotelAccomadationAddressOwner").val();
		nonHotelAccomadationTelNo=$("#nonHotelAccomadationTelNo").val();
		nonHotelAccomadationFaxNumber=$("#nonHotelAccomadationFaxNumber").val();
		nonHotelAccomadationCompanyName=$("#nonHotelAccomadationCompanyName").val();
		nonHotelAccomadationAddressCompany=$("#nonHotelAccomadationAddressCompany").val();
		nonHotelAccomadationManagerName=$("#nonHotelAccomadationManagerName").val();
		nonHotelAccomadationAddressManager=$("#nonHotelAccomadationAddressManager").val();
		nonHotelAccomadationManagerTel=$("#nonHotelAccomadationManagerTel").val();
		nonHotelAccomadationManagerFax=$("#nonHotelAccomadationManagerFax").val();
		nonHotelAccomadationManagerEmail=$("#nonHotelAccomadationManagerEmail").val();
		if(!isSaveAndContinue){
			if(!nonHotelAccomadationEmail){
				  $("#nonHotelAccomadationEmailValidation").removeClass("hide");
				  $("#nonHotelAccomadationEmailValidation").text("Please Enter E-mail address");
				  $("#nonHotelAccomadationEmail").focus();
				  submit= false;
			  }else if(nonHotelAccomadationEmail.match(mailformat)){ 
					$("#nonHotelAccomadationEmailValidation").addClass("hide");
				}else
					{
						$("#nonHotelAccomadationEmailValidation").removeClass("hide");
						$("#nonHotelAccomadationEmailValidation").text("You have entered an invalid email address");
						$("#nonHotelAccomadationEmail").focus();
						submit= false;
					}
			if(!nonHotelAccomadationOwnerName){
				$("#nonHotelAccomadationOwnerNameValidation").removeClass("hide");
				$("#nonHotelAccomadationOwnerName").focus();
				submit= false;
			}else{
				$("#nonHotelAccomadationOwnerNameValidation").addClass("hide");
			}
		}
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
			$.ajax({
						type : "POST",
						url : "${accoNonHotelLicenceInfo}",
						data : {
							"<portlet:namespace/>nonHotelAccommodationName" : nonHotelAccommodationName,
							"<portlet:namespace/>nonHotelAccomadationAddress" : nonHotelAccomadationAddress,
							"<portlet:namespace/>nonHotelAccomadationTelephone" : nonHotelAccomadationTelephone,
							"<portlet:namespace/>nonHotelAccomadationFaxNum" : nonHotelAccomadationFaxNum,
							"<portlet:namespace/>nonHotelAccomadationEmail" : nonHotelAccomadationEmail,
							"<portlet:namespace/>nonHotelAccomadationEmployeesNum" : nonHotelAccomadationEmployeesNum,
							"<portlet:namespace/>nonHotelAccomadationTypeOffered" : nonHotelAccomadationTypeOffered,
							"<portlet:namespace/>nonHotelAccomadationRoomNum" : nonHotelAccomadationRoomNum,
							"<portlet:namespace/>nonHotelAccomadationOwnerName" : nonHotelAccomadationOwnerName,
							"<portlet:namespace/>nonHotelAccomadationAddressOwner" : nonHotelAccomadationAddressOwner,
							"<portlet:namespace/>nonHotelAccomadationTelNo" : nonHotelAccomadationTelNo,
							"<portlet:namespace/>nonHotelAccomadationFaxNumber" : nonHotelAccomadationFaxNumber,
							"<portlet:namespace/>nonHotelAccomadationCompanyName" : nonHotelAccomadationCompanyName,
							"<portlet:namespace/>nonHotelAccomadationAddressCompany" : nonHotelAccomadationAddressCompany,
							"<portlet:namespace/>nonHotelAccomadationManagerName" : nonHotelAccomadationManagerName,
							"<portlet:namespace/>nonHotelAccomadationAddressManager" : nonHotelAccomadationAddressManager,
							"<portlet:namespace/>nonHotelAccomadationManagerTel" : nonHotelAccomadationManagerTel,
							"<portlet:namespace/>nonHotelAccomadationManagerFax" : nonHotelAccomadationManagerFax,
							"<portlet:namespace/>nonHotelAccomadationManagerEmail" : nonHotelAccomadationManagerEmail,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							if(!isSaveAndContinue){
							applicantInfo();
						  }
							$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						},
						error : function(data) {
						},
					});
		}
	 }
	function addAccoNonHotelRequiredLic() {
		var reqLic = new Array();
		$("input:checkbox[name=licenceRequirement]:checked").each(function(){
			reqLic.push($(this).val());
		});
		var licenceRequirement = reqLic.toString();
		
		var bedrooms = new Array();
		$("input:checkbox[name=bedrooms]:checked").each(function(){
			bedrooms.push($(this).val());
		});
		var reqBedrooms = bedrooms.toString();
		
		var bathrooms = new Array();
		$("input:checkbox[name=bathrooms]:checked").each(function(){
			bathrooms.push($(this).val());
		});
		var reqBathrooms = bathrooms.toString();
		
		jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
						type : "POST",
						url : "${accoNonHotelRequiredLicInfo}",
						data : {
							"<portlet:namespace/>licenceRequirement" : licenceRequirement,
							"<portlet:namespace/>reqBedrooms" : reqBedrooms,
							"<portlet:namespace/>reqBathrooms" : reqBathrooms,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
						},
						error : function(data) {
						},
					});
	 }
	function addAccoNonHotelGenDec() { 
		accommodationNonHotelOperater=$("#accommodationNonHotelOperater").val();
		newHotelAccomadationFromDate=$("#newHotelAccomadationFromDate").val();
		newHotelAccomadationToDate=$("#newHotelAccomadationToDate").val();
		newAccomadationSince=$("#newAccomadationSince").val();
		newHotelAccomadationSignDate=$("#newHotelAccomadationSignDate").val();
		jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
						type : "POST",
						url : "${accoNonHotelGenDecInfo}",
						data : {
							"<portlet:namespace/>accommodationNonHotelOperater" : accommodationNonHotelOperater,
							"<portlet:namespace/>newHotelAccomadationFromDate" : newHotelAccomadationFromDate,
							"<portlet:namespace/>newHotelAccomadationToDate" : newHotelAccomadationToDate,
							"<portlet:namespace/>newAccomadationSince" : newAccomadationSince,
							"<portlet:namespace/>newHotelAccomadationSignDate" : newHotelAccomadationSignDate,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							uploadDocuments('nonHotelAddress',"Non Hotel Attached List","The attached list show the names and addresses of all the Directors, of all or any companies connected with the Non-Hotel Accommodation as owner, manager or operator");
							uploadDocuments('signatureNonHotelBtn',"Resort Signature of Applicant");
						},
						error : function(data) {
						},
					});
	 }
	function addAccoHomeStayLicence(isSaveAndContinue) { 
		submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		homeStayAccommodationName=$("#homeStayAccommodationName").val();
		homeStayAccomadationOwnerName=$("#homeStayAccomadationOwnerName").val();
		homeStayAccomadationPropertyAddress=$("#homeStayAccomadationPropertyAddress").val();
		homeStayAccomadationTel=$("#homeStayAccomadationTel").val();
		homeStayAccomadationMobileNum=$("#homeStayAccomadationMobileNum").val();
		homeStayAccomadationEmail=$("#homeStayAccomadationEmail").val();
		homeStayAccomadationEmployeesNum=$("#homeStayAccomadationEmployeesNum").val();
		homeStayAccomadationWebsiteName=$("#homeStayAccomadationWebsiteName").val();
		homeStayAccomadationDirection=$("#homeStayAccomadationDirection").val();
		homeStayAccomadationBedrooms=$("#homeStayAccomadationBedrooms").val();
		homeStayAccomadationAvailableBedrooms=$("#homeStayAccomadationAvailableBedrooms").val();
		homeStayAccomadationWithBathroom=$("#homeStayAccomadationWithBathroom").val();
		homeStayAccomadationSharedBedrooms=$("#homeStayAccomadationSharedBedrooms").val();
		homeStayAccomadationDate=$("#homeStayAccomadationDate").val();
		homeStayAccomadationCertified=$("#homeStayAccomadationCertified").val();
		if(!isSaveAndContinue){
			if(!homeStayAccomadationEmail){
				  $("#homeStayAccomadationEmailValidation").removeClass("hide");
				  $("#homeStayAccomadationEmailValidation").text("Please Enter E-mail address");
				  $("#homeStayAccomadationEmail").focus();
				  submit= false;
			  }else if(homeStayAccomadationEmail.match(mailformat)){ 
					$("#homeStayAccomadationEmailValidation").addClass("hide");
				}else
					{
						$("#homeStayAccomadationEmailValidation").removeClass("hide");
						$("#homeStayAccomadationEmailValidation").text("You have entered an invalid email address");
						$("#homeStayAccomadationEmail").focus();
						submit= false;
					}
			if(!homeStayAccomadationOwnerName){
				$("#homeStayAccomadationOwnerNameValidation").removeClass("hide");
				$("#homeStayAccomadationOwnerName").focus();
				submit= false;
			}else{
				$("#homeStayAccomadationOwnerNameValidation").addClass("hide");
			}
		 }
		
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
			$.ajax({
				type : "POST",
				url : "${accoHomeStayLicenceInfo}",
				data : {
					"<portlet:namespace/>homeStayAccommodationName" : homeStayAccommodationName,
					"<portlet:namespace/>homeStayAccomadationOwnerName" : homeStayAccomadationOwnerName,
					"<portlet:namespace/>homeStayAccomadationPropertyAddress" : homeStayAccomadationPropertyAddress,
					"<portlet:namespace/>homeStayAccomadationTel" : homeStayAccomadationTel,
					"<portlet:namespace/>homeStayAccomadationMobileNum" : homeStayAccomadationMobileNum,
					"<portlet:namespace/>homeStayAccomadationEmail" : homeStayAccomadationEmail,
					"<portlet:namespace/>homeStayAccomadationEmployeesNum" : homeStayAccomadationEmployeesNum,
					"<portlet:namespace/>homeStayAccomadationWebsiteName" : homeStayAccomadationWebsiteName,
					"<portlet:namespace/>homeStayAccomadationDirection" : homeStayAccomadationDirection,
					"<portlet:namespace/>homeStayAccomadationBedrooms" : homeStayAccomadationBedrooms,
					"<portlet:namespace/>homeStayAccomadationAvailableBedrooms" : homeStayAccomadationAvailableBedrooms,
					"<portlet:namespace/>homeStayAccomadationWithBathroom" : homeStayAccomadationWithBathroom,
					"<portlet:namespace/>homeStayAccomadationSharedBedrooms" : homeStayAccomadationSharedBedrooms,
					"<portlet:namespace/>homeStayAccomadationDate" : homeStayAccomadationDate,
					"<portlet:namespace/>homeStayAccomadationCertified" : homeStayAccomadationCertified,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					uploadDocuments('applicantSignatureHomeStayBtn',"Home Stay Signature Of Applicant");
					uploadDocuments('applicantSealHomeStayBtn',"Home Stay Applicant Seal");
				},
				error : function(data) {
				},
			});
		}
	 }
	
	/* TPDCo Attraction Form Saved */
	function addAttractionDetailFormInfo(isSaveAndContinue) { 
		submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		newAttractionsOwnerName=$("#newAttractionsOwnerName").val();
		newAttractionsLocation=$("#newAttractionsLocation").val();
		newAttractionsMailingEmail=$("#newAttractionsMailingEmail").val();
		newAttractionsTelephone=$("#newAttractionsTelephone").val();
		newAttractionsFaxNum=$("#newAttractionsFaxNum").val();
		newAttractionsEmailAddress=$("#newAttractionsEmailAddress").val();
		newAttractionsEmployeesNum=$("#newAttractionsEmployeesNum").val();
		newAttractionsParish=$("#newAttractionsParish").val();
		if(!isSaveAndContinue){
			if(!newAttractionsOwnerName){
				$("#newAttractionsOwnerNameValidation").removeClass("hide");
				$("#newAttractionsOwnerName").focus();
				submit= false;
			}else{
				$("#newAttractionsOwnerNameValidation").addClass("hide");
			}
		}
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
			$.ajax({
						type : "POST",
						url : "${attractionApplicantDetailInfo}",
						data : {
							"<portlet:namespace/>newAttractionsOwnerName" : newAttractionsOwnerName,
							"<portlet:namespace/>newAttractionsLocation" : newAttractionsLocation,
							"<portlet:namespace/>newAttractionsMailingEmail" : newAttractionsMailingEmail,
							"<portlet:namespace/>newAttractionsTelephone" : newAttractionsTelephone,
							"<portlet:namespace/>newAttractionsFaxNum" : newAttractionsFaxNum,
							"<portlet:namespace/>newAttractionsEmailAddress" : newAttractionsEmailAddress,
							"<portlet:namespace/>newAttractionsEmployeesNum" : newAttractionsEmployeesNum,
							"<portlet:namespace/>newAttractionsParish" : newAttractionsParish,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							if(!isSaveAndContinue){
							applicantInfo();
							addOperatorManagerDetail();
							}
							$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
						},
						error : function(data) {
						},
					});
		}
	 }
	
	function addAttractionGenDeclaration() { 
		newAttractionsGenOwnerName=$("#newAttractionsGenOwnerName").val();
		newAttractionsCompanyLaw=$("#newAttractionsCompanyLaw").val();
		newAttractionsDate=$("#newAttractionsDate").val();
		newAttractionsName=$("#newAttractionsName").val();
		newAttractionsStartDate=$("#newAttractionsStartDate").val();
		newAttractionsSituatedLand=$("#newAttractionsSituatedLand").val();
		newAttractionsActivities=$("#newAttractionsActivities").val();
		attractionNewDate=$("#attractionNewDate").val();
		jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
						type : "POST",
						url : "${attractionGenDeclarationInfo}",
						data : {
							"<portlet:namespace/>newAttractionsGenOwnerName" : newAttractionsGenOwnerName,
							"<portlet:namespace/>newAttractionsCompanyLaw" : newAttractionsCompanyLaw,
							"<portlet:namespace/>newAttractionsDate" : newAttractionsDate,
							"<portlet:namespace/>newAttractionsName" : newAttractionsName,
							"<portlet:namespace/>newAttractionsStartDate" : newAttractionsStartDate,
							"<portlet:namespace/>newAttractionsSituatedLand" : newAttractionsSituatedLand,
							"<portlet:namespace/>newAttractionsActivities" : newAttractionsActivities,
							"<portlet:namespace/>attractionNewDate" : attractionNewDate,
							"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
						},
						success : function(data) {
							uploadDocuments('attraction-address-of-directors',"Attraction Address of Directors","The attached list shows the names and addresses of all the Directors of the operating company (if applicable)");
							uploadDocuments('applicantSignatureAttractionBtn',"Attraction Signature of Applicant","");
						},
						error : function(data) {
						},
					});
	 }
	/* TPDCo Car Rental Form Saved */
	function addCarRentalDetailFormInfo(isSaveAndContinue) { 
		submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		carRentalLicenceApplicantName=$("#newCarRentalApplicantName").val();
		carRentalLicenceAddress=$("#newCarRentalAddress").val();
		carRentalLicenceCompanyName=$("#newCarRentalCompanyName").val();
		carRentalLicenceCompanyAddress=$("#newCarRentalCompanyAddress").val();
		carRentalLicenceTelephone=$("#newCarRentalTelephone").val();
		carRentalLicenceEmail=$("#newCarRentalEmail").val();
		carRentalLicenceDate=$("#newCarRentalDate").val();
		carRentalLicenceManagerName=$("#newCarRentalManagerName").val();
		carRentalLicenceVehiclesNo=$("#newCarRentalVehiclesNo").val();
		carRentalLicenceEmployeesNo=$("#newCarRentalEmployeesNo").val();
		carRentalLicenceOfficeLocation=$("#newCarRentalOfficeLocation").val();
		carRentalLicencePosition=$("#newCarRentalPosition").val();
	    carRentalLicenceSignDate=$("#newCarRentalSignDate").val();
	    if(!isSaveAndContinue){  
			if(!carRentalLicenceEmail){
				  $("#newCarRentalEmailValidation").removeClass("hide");
				  $("#newCarRentalEmailValidation").text("Please Enter E-mail address");
				  $("#newCarRentalEmail").focus();
				  submit= false;
			  }else if(carRentalLicenceEmail.match(mailformat)){ 
					$("#newCarRentalEmailValidation").addClass("hide");
				}else
					{
						$("#newCarRentalEmailValidation").removeClass("hide");
						$("#newCarRentalEmailValidation").text("You have entered an invalid email address");
						$("#newCarRentalEmail").focus();
						submit= false;
				}
			if(!carRentalLicenceApplicantName){
				$("#newCarRentalApplicantNameValidation").removeClass("hide");
				$("#newCarRentalApplicantName").focus();
				submit= false;
			}else{
				$("#newCarRentalApplicantNameValidation").addClass("hide");
			}
	    }
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${carRentalLicenceInfo}",
			data : {
				"<portlet:namespace/>carRentalLicenceApplicantName" : carRentalLicenceApplicantName,
				"<portlet:namespace/>carRentalLicenceAddress" : carRentalLicenceAddress,
				"<portlet:namespace/>carRentalLicenceCompanyName" : carRentalLicenceCompanyName,
				"<portlet:namespace/>carRentalLicenceCompanyAddress" : carRentalLicenceCompanyAddress,
				"<portlet:namespace/>carRentalLicenceTelephone" : carRentalLicenceTelephone,
				"<portlet:namespace/>carRentalLicenceEmail" : carRentalLicenceEmail,
				"<portlet:namespace/>carRentalLicenceManagerName" : carRentalLicenceManagerName,
				"<portlet:namespace/>carRentalLicenceDate" : carRentalLicenceDate,
				"<portlet:namespace/>carRentalLicenceVehiclesNo" : carRentalLicenceVehiclesNo,
				"<portlet:namespace/>carRentalLicenceEmployeesNo" : carRentalLicenceEmployeesNo,
				"<portlet:namespace/>carRentalLicenceOfficeLocation" : carRentalLicenceOfficeLocation,
				"<portlet:namespace/>carRentalLicencePosition" : carRentalLicencePosition,
				  "<portlet:namespace/>carRentalLicenceSignDate" : carRentalLicenceSignDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				if(!isSaveAndContinue){
				applicantInfo();
				addcarRentalBranchDetail();
				uploadDocuments('applicantSignatureCarRentalBtn',"Car Rental Signature of Applicant");
				}
				$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}
}
	
	function addCarRentalConditionFormInfo() { 
		var touristInd=  new Array();
		$("input:checkbox[name=touristIndustry]:checked").each(function(){
			touristInd.push($(this).val());
		});
		var touristIndustry= touristInd.toString();
		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${carRentalConditionInfo}",
			data : {
				"<portlet:namespace/>touristIndustry" : touristIndustry,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
	 }
	
	 function addDomesticTourDetailFormInfo(isSaveAndContinue) { 
		submit=true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		domesticTourApplicantName = $('#domesticTourApplicantName').val();
        domesticTourAddress = $('#domesticTourAddress').val();
        domesticTourCompanyName = $('#domesticTourCompanyName').val();
        domesticTourExactLocation = $('#domesticTourExactLocation').val();
        domesticTourTelephone = $('#domesticTourTelephone').val();
        domesticTourEmail = $('#domesticTourEmail').val();
        domesticTourDate = $('#domesticTourDate').val();
        domesticTourManagerName = $('#domesticTourManagerName').val();
        domesticTourVehiclesNumber = $('#domesticTourVehiclesNumber').val();
        domesticTourEmployeesNo = $('#domesticTourEmployeesNo').val();
        domesticTourOfficeLocation = $('#domesticTourOfficeLocation').val();
        domesticTourSignDate = $('#domesticTourSignDate').val();
        if(!isSaveAndContinue){
	        if(!domesticTourEmail){
				  $("#domesticTourEmailValidation").removeClass("hide");
				  $("#domesticTourEmailValidation").text("Please Enter E-mail Address");
				  $("#domesticTourEmail").focus();
				  submit= false;
			  }else if(domesticTourEmail.match(mailformat)){ 
					$("#domesticTourEmailValidation").addClass("hide");
				}else
					{
						$("#domesticTourEmailValidation").removeClass("hide");
						$("#domesticTourEmailValidation").text("You have entered an invalid email address");
						$("#domesticTourEmail").focus();
						submit= false;
					}
			if(!domesticTourApplicantName){
				$("#domesticTourApplicantNameValidation").removeClass("hide");
				$("#domesticTourApplicantName").focus();
				submit= false;
			}else{
				$("#domesticTourApplicantNameValidation").addClass("hide");
			}
        }
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${attractionDomesticTourUrl}",
			data : {
				"<portlet:namespace/>domesticTourApplicantName": domesticTourApplicantName,
	            "<portlet:namespace/>domesticTourAddress": domesticTourAddress,
	            "<portlet:namespace/>domesticTourCompanyName": domesticTourCompanyName,
	            "<portlet:namespace/>domesticTourExactLocation": domesticTourExactLocation,
	            "<portlet:namespace/>domesticTourTelephone": domesticTourTelephone,
	            "<portlet:namespace/>domesticTourEmail": domesticTourEmail,
	            "<portlet:namespace/>domesticTourDate": domesticTourDate,
	            "<portlet:namespace/>domesticTourManagerName": domesticTourManagerName,
	            "<portlet:namespace/>domesticTourVehiclesNumber": domesticTourVehiclesNumber,
	            "<portlet:namespace/>domesticTourEmployeesNo": domesticTourEmployeesNo,
	            "<portlet:namespace/>domesticTourOfficeLocation": domesticTourOfficeLocation,
	            "<portlet:namespace/>domesticTourSignDate": domesticTourSignDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				if(!isSaveAndContinue){
					applicantInfo();
				}
				addDomesticTourBranchDetail();
				uploadDocuments('applicantSignaturedomesticBtn',"Domestic Signature of Applicant");
				$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}	
} 
	
	 function addDomesticServiceOfferedInfo() { 
	    individualsapartment = $("input[name='individualsapartment']:checked").val();
	    airportassistance = $("input[name='airportassistance']:checked").val();
	    entiretour = $("input[name='entiretour']:checked").val();
	    transfersdeparture = $("input[name='transfersdeparture']:checked").val();
	    individualgroups = $("input[name='individualgroups']:checked").val();
	    organizedconjunction = $("input[name='organizedconjunction']:checked").val();
	    dailytransportation = $("input[name='dailytransportation']:checked").val();
	    entertainment = $("input[name='entertainment']:checked").val();
	    domesticTourSealDate = $("#domesticTourSealDate").val();
		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${attractionDomesticTourServiceUrl}",
			data : {
				"<portlet:namespace/>individualsapartment": individualsapartment,
			    "<portlet:namespace/>airportassistance": airportassistance,
			    "<portlet:namespace/>entiretour": entiretour,
			    "<portlet:namespace/>transfersdeparture": transfersdeparture,
			    "<portlet:namespace/>individualgroups": individualgroups,
			    "<portlet:namespace/>organizedconjunction": organizedconjunction,
			    "<portlet:namespace/>dailytransportation": dailytransportation,
			    "<portlet:namespace/>entertainment": entertainment,
			    "<portlet:namespace/>domesticTourSealDate": domesticTourSealDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				uploadDocuments('signatureDomesticTourBtn',"Domestic Signature Service");
				uploadDocuments('companySealDomesticTourBtn',"Domestic Company Seal");
			},
			error : function(data) {
			},
		});
	 } 
	/* Travel Agency */
	 function addTravelAgencyDetails(isSaveAndContinue) { 
		 submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		applicantName = $('#travelAgencyApplicantName').val();
	    agencyAddress = $('#travelAgencyAddress').val();
	    agencyTelephone = $('#travelAgencyTelephone').val();
	    agencyName = $('#travelAgencyName').val();
	    agencyAddressSec = $('#travelAgencyAddressSec').val();
	    agencyTelephoneNum = $('#travelAgencyTelephoneNum').val();
	    isRegistered = $('input[name="company"]:checked').val(); 
	    registrationParticulars = $('#travelAgencyRegistration').val();
	    proprietorName = $('#travelAgencyProprietorName').val();
	    managerName = $('#travelAgencyManagerName').val();
	    managerAddress = $('#travelAgencyManagerAddress').val();
	    secretaryName = $('#travelAgencySecretaryName').val();
	    secretaryAddress = $('#travelAgencySecretaryAddress').val();
	    bankerName = $('#travelAgencyBankerName').val();
	    bondingCompanyName = $('#travelAgencyCompanyName').val();
	    bondingCompanyAddress = $('#travelAgencyCompanyAddress').val();
	    auditorsName = $('#travelAgencyAuditorsName').val();
	    auditorsAddress = $('#travelAgencyAuditorAddress').val();
	    numberOfEmployees = $('#travelAgencyEmployeesNo').val();
	    signDate = $('#travelAgencySignDate').val();
	    if(!isSaveAndContinue){
		    if(!applicantName){
				$("#travelAgencyApplicantNameValidation").removeClass("hide");
				$("#travelAgencyApplicantName").focus();
				submit= false;
			}else{
				$("#travelAgencyApplicantNameValidation").addClass("hide");
			}
	    }
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${attractionTravelAgencyUrl}",
			data : {
				"<portlet:namespace/>applicantName": applicantName,
			    "<portlet:namespace/>agencyAddress": agencyAddress,
			    "<portlet:namespace/>agencyTelephone": agencyTelephone,
			    "<portlet:namespace/>agencyName": agencyName,
			    "<portlet:namespace/>agencyAddressSec": agencyAddressSec,
			    "<portlet:namespace/>agencyTelephoneNum": agencyTelephoneNum,
			    "<portlet:namespace/>isRegistered": isRegistered,
			    "<portlet:namespace/>registrationParticulars": registrationParticulars,
			    "<portlet:namespace/>proprietorName": proprietorName,
			    "<portlet:namespace/>managerName": managerName,
			    "<portlet:namespace/>managerAddress": managerAddress,
			    "<portlet:namespace/>secretaryName": secretaryName,
			    "<portlet:namespace/>secretaryAddress": secretaryAddress,
			    "<portlet:namespace/>bankerName": bankerName,
			    "<portlet:namespace/>bondingCompanyName": bondingCompanyName,
			    "<portlet:namespace/>bondingCompanyAddress": bondingCompanyAddress,
			    "<portlet:namespace/>auditorsName": auditorsName,
			    "<portlet:namespace/>auditorsAddress": auditorsAddress,
			    "<portlet:namespace/>numberOfEmployees": numberOfEmployees,
			    "<portlet:namespace/>signDate": signDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				uploadDocuments('applicantSignaturetravelAgencyBtn',"Travel Agency Applicant Sign");
			},
			error : function(data) {
			},
		});
	}
} 
	/* Water Sport*/
	 function addWaterSportsFormInfo(isSaveAndContinue) { 
		debugger;
		 submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		 waterSportBusinessName = $('#waterSportBusinessName').val();
		 waterSportMailingaAdd = $('#waterSportMailingaAdd').val();
		 waterSportOpLocationAddress = $('#waterSportOpLocationAddress').val();
		 waterSportOpPhone = $('#waterSportOpPhone').val();
		 waterSportOpEmail = $('#waterSportOpEmail').val();
		 waterSportOpOwnerName = $('#waterSportOpOwnerName').val();
		 waterSportOpAddressOwner = $('#waterSportOpAddressOwner').val();
		 waterSportOpManagerName = $('#waterSportOpManagerName').val();
		 waterSportOpApplicantName = $('#waterSportOpApplicantName').val();
		 waterSportOpNationality = $('#waterSportOpNationality').val();
		 waterSportOpEmployeesNo = $('#waterSportOpEmployeesNo').val();
		 /* waterSportOpActivitiesList = $('#waterSportOpActivitiesList').val(); */
		 var waterSportOpActivitiesList=  new Array();
			$("input:checkbox[name=listOfActivity]:checked").each(function(){
				waterSportOpActivitiesList.push($(this).val());
			});
			var activitiesList= waterSportOpActivitiesList.toString();
		 
		 // Retrieve radio button values
		  var checkLocWater=  new Array();
			$("input:checkbox[name=occupyLocationWater]:checked").each(function(){
				checkLocWater.push($(this).val());
			});
			var occupyLocationWater= checkLocWater.toString();
			
			
		 proposalSubmitted = $('input[name="proposal"]:checked').val();
		 foreignNationalsInvolved = $('input[name="nationalsOperation"]:checked').val();
		 workPermitApplied = $('input[name="permitApplied"]:checked').val();
		 if(!isSaveAndContinue){
		    if(!waterSportOpEmail){
		 			  $("#waterSportOpEmailValidation").removeClass("hide");
		 			  $("#waterSportOpEmailValidation").text("Please Enter E-mail address");
		 			  $("#waterSportOpEmail").focus();
		 			  submit= false;
		 		  }else if(waterSportOpEmail.match(mailformat)){ 
		 				$("#waterSportOpEmailValidation").addClass("hide");
		 			}else
		 				{
		 					$("#waterSportOpEmailValidation").removeClass("hide");
		 					$("#waterSportOpEmailValidation").text("You have entered an invalid email address");
		 					$("#waterSportOpEmail").focus();
		 					submit= false;
		 				}
		 		if(!waterSportOpOwnerName){
		 			$("#waterSportOpOwnerNameValidation").removeClass("hide");
		 			$("#waterSportOpOwnerName").focus();
		 			submit= false;
		 		}else{
		 			$("#waterSportOpOwnerNameValidation").addClass("hide");
		    }
		 }
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${attractionWaterSportsUrl}",
			data : {
			    "<portlet:namespace/>waterSportBusinessName": waterSportBusinessName,
			    "<portlet:namespace/>waterSportMailingaAdd": waterSportMailingaAdd,
			    "<portlet:namespace/>waterSportOpLocationAddress": waterSportOpLocationAddress,
			    "<portlet:namespace/>waterSportOpPhone": waterSportOpPhone,
			    "<portlet:namespace/>waterSportOpEmail": waterSportOpEmail,
			    "<portlet:namespace/>waterSportOpOwnerName": waterSportOpOwnerName,
			    "<portlet:namespace/>waterSportOpAddressOwner": waterSportOpAddressOwner,
			    "<portlet:namespace/>waterSportOpManagerName": waterSportOpManagerName,
			    "<portlet:namespace/>waterSportOpApplicantName": waterSportOpApplicantName,
			    "<portlet:namespace/>waterSportOpNationality": waterSportOpNationality,
			    "<portlet:namespace/>waterSportOpEmployeesNo": waterSportOpEmployeesNo,
			    "<portlet:namespace/>waterSportOpActivitiesList": activitiesList,
			    "<portlet:namespace/>occupyLocation": occupyLocationWater,
			    "<portlet:namespace/>proposalSubmitted": proposalSubmitted,
			    "<portlet:namespace/>foreignNationalsInvolved": foreignNationalsInvolved,
			    "<portlet:namespace/>workPermitApplied": workPermitApplied,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				if(!isSaveAndContinue){
				applicantInfo();
				/* checkbox docs */
				uploadDocuments('evidenceOwnershipWater',"Water Evidence of Ownership","");
				uploadDocuments('rentReceiptWater',"Water Rent Receipt","");
				uploadDocuments('letterOwnerWater',"Water Letter from Owner","");
				uploadDocuments('contractLeaseWater',"Water Contract of Lease","");
				}
				$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
		}	
	 } 
	
	 function addWaterSportsSecondFormInfo() { 
		firstAid = $("input[name='firstAid']:checked").val();
	    cpr = $("input[name='cpr']:checked").val();
	    divingCertificate = $("input[name='divingCertificate']:checked").val();
	    rlss = $("input[name='RLSS']:checked").val();
	    lifeguard = $("input[name='lifeguard']:checked").val();
	    breathing = $("input[name='breathing']:checked").val();
	    waterSportOpName = $("#waterSportOpName").val();
	    waterSportOpAddress = $("#waterSportOpAddress").val();
	    waterSportOpinsuranceAmount = $("#waterSportOpinsuranceAmount").val();
	    waterSportOpManagerSignDate = $("#waterSportOpManagerSignDate").val();

		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${attractionWaterSportsGeneralDeclarationUrl}",
			data : {
				"<portlet:namespace/>firstAid": firstAid,
		        "<portlet:namespace/>cpr": cpr,
		        "<portlet:namespace/>divingCertificate": divingCertificate,
		        "<portlet:namespace/>rlss": rlss,
		        "<portlet:namespace/>lifeguard": lifeguard,
		        "<portlet:namespace/>breathing": breathing,
		        "<portlet:namespace/>waterSportOpName": waterSportOpName,
		        "<portlet:namespace/>waterSportOpAddress": waterSportOpAddress,
		        "<portlet:namespace/>waterSportOpinsuranceAmount": waterSportOpinsuranceAmount,
		        "<portlet:namespace/>waterSportOpManagerSignDate": waterSportOpManagerSignDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				uploadDocuments('employees-document',"Watersports Employee Doc");
				uploadDocuments('applicantSignatureWaterSportBtn',"Watersports Signature of Owner");
				uploadDocuments('managerSignatureWaterSportBtn',"Manager Signature Water")
			},
			error : function(data) {
			},
		});
	 } 
	
	 function addWaterSportsRequirementsInfo() { 
		 var genOp=  new Array();
			$("input:checkbox[name=generalOperator]:checked").each(function(){
				genOp.push($(this).val());
			});
			var generalOperator= genOp.toString();
		 var craft=  new Array();
			$("input:checkbox[name=waterCraft]:checked").each(function(){
				craft.push($(this).val());
			});
			var waterCraft= craft.toString();
		 var ski=  new Array();
			$("input:checkbox[name=waterSki]:checked").each(function(){
				ski.push($(this).val());
			});
			var waterSki= ski.toString();
		 var fishSail=  new Array();
			$("input:checkbox[name=sunfishSail]:checked").each(function(){
				fishSail.push($(this).val());
			});
			var sunfishSail= fishSail.toString();
		 var para=  new Array();
			$("input:checkbox[name=parasail]:checked").each(function(){
				para.push($(this).val());
			});
			var parasail= para.toString();
		 var scuba=  new Array();
			$("input:checkbox[name=scubaDiving]:checked").each(function(){
				scuba.push($(this).val());
			});
			var scubaDiving= scuba.toString();
		 var boatGlass=  new Array();
			$("input:checkbox[name=glassBoat]:checked").each(function(){
				boatGlass.push($(this).val());
			});
			var glassBoat= boatGlass.toString();
		 var rideBoat=  new Array();
			$("input:checkbox[name=bananaBoat]:checked").each(function(){
				rideBoat.push($(this).val());
			});
			var bananaBoat= rideBoat.toString();

		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${attractionWaterSportsRequirementsUrl}",
			data : {
		        "<portlet:namespace/>generalOperator": generalOperator,
		        "<portlet:namespace/>waterCraft": waterCraft,
		        "<portlet:namespace/>waterSki": waterSki,
		        "<portlet:namespace/>sunfishSail": sunfishSail,
		        "<portlet:namespace/>parasail": parasail,
		        "<portlet:namespace/>scubaDiving": scubaDiving,
		        "<portlet:namespace/>glassBoat": glassBoat,
		        "<portlet:namespace/>bananaBoat": bananaBoat,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
			},
			error : function(data) {
			},
		});
	 } 
	 /* Contract Carriage Operator */
	function contractCarriageDetailFormInfo(isSaveAndContinue) { 
		submit=true;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		newContractOwnerName = $("#newContractOwnerName").val();
		newContractHomeAddress = $("#newContractHomeAddress").val();
		newContractEmail = $("#newContractEmail").val();
		newContractTelephone = $("#newContractTelephone").val();
		newContractParish = $("#newContractParish").val();
		newContractDate = $("#newContractDate").val();
		newContractVehiclesNo = $("#newContractVehiclesNo").val();
		newContractTrn = $("#newContractTrn").val();
		contractOrganization = $("#contractOrganization").val();
		if(!isSaveAndContinue){
			if(!newContractEmail){
				  $("#newContractEmailValidation").removeClass("hide");
				  $("#newContractEmailValidation").text("Please Enter E-mail address");
				  $("#newContractEmail").focus();
				  submit= false;
			  }else if(newContractEmail.match(mailformat)){ 
					$("#newContractEmailValidation").addClass("hide");
				}else
				 {
						$("#newContractEmailValidation").removeClass("hide");
						$("#newContractEmailValidation").text("You have entered an invalid email address");
						$("#newContractEmail").focus();
						submit= false;
				}
			if(!newContractOwnerName){
				$("#newContractOwnerNameValidation").removeClass("hide");
				$("#newContractOwnerName").focus();
				submit= false;
			}else{
				$("#newContractOwnerNameValidation").addClass("hide");
			}
		}
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${attractionContractCarriageDetailUrl}",
			data : {
			    "<portlet:namespace/>newContractOwnerName": newContractOwnerName,
			    "<portlet:namespace/>newContractHomeAddress": newContractHomeAddress,
			    "<portlet:namespace/>newContractEmail": newContractEmail,
			    "<portlet:namespace/>newContractTelephone": newContractTelephone,
			    "<portlet:namespace/>newContractParish": newContractParish,
			    "<portlet:namespace/>newContractDate": newContractDate,
			    "<portlet:namespace/>newContractVehiclesNo": newContractVehiclesNo,
			    "<portlet:namespace/>newContractTrn": newContractTrn,
			    "<portlet:namespace/>contractOrganization": contractOrganization,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				if(!isSaveAndContinue){
				applicantInfo();
				addContractVehicleRegisterDetail();
				addContractDriverListDetail();
				}
				$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}
} 
	function contractCarriageGeneralDeclareInfo() { 
		ownerSignDate = $("#OwnerSignDate").val();
		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${attractionContractCarriageGeneralDeclarationUrl}",
			data : {
			    "<portlet:namespace/>ownerSignDate": ownerSignDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				uploadDocuments('ownerSignatureHotelBtn',"Carriage Signature of Owner Operator");
			},
			error : function(data) {
			},
		});
	 } 
	
	function addtravelHaltDetailFormInfo(isSaveAndContinue) { 
		submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		travelHaltApplicantName= $("#travelHaltApplicantName").val();
        travelHaltAddress= $("#travelHaltAddress").val();
        travelHaltTelephone= $("#travelHaltTelephone").val();
        travelHaltEmail= $("#travelHaltEmail").val();
        travelHaltName= $("#travelHaltName").val();
        travelHaltLocation= $("#travelHaltLocation").val();
        travelHaltTelephoneNum= $("#travelHaltTelephoneNum").val();
        travelHaltEmployeesNo= $("#travelHaltEmployeesNo").val();
        travelHaltSignDate= $("#travelHaltSignDate").val();
        if(!isSaveAndContinue){
    		if(!travelHaltEmail){
    			  $("#travelHaltEmailValidation").removeClass("hide");
    			  $("#travelHaltEmailValidation").text("Please Enter E-mail address");
    			  $("#travelHaltEmail").focus();
    			  submit= false;
    		  }else if(travelHaltEmail.match(mailformat)){ 
    				$("#travelHaltEmailValidation").addClass("hide");
    			}else
    				{
    					$("#travelHaltEmailValidation").removeClass("hide");
    					$("#travelHaltEmailValidation").text("You have entered an invalid email address");
    					$("#travelHaltEmail").focus();
    					submit= false;
    				}
    		if(!travelHaltApplicantName){
    			$("#travelHaltApplicantNameValidation").removeClass("hide");
    			$("#travelHaltApplicantName").focus();
    			submit= false;
    		}else{
    			$("#travelHaltApplicantNameValidation").addClass("hide");
    		}
        }	
		jtbApplicationId = $("#jtbApplicationId").val();
		if(submit){
		$.ajax({
			type : "POST",
			url : "${attractionTravelHaltApplicationUrl}",
			data : {
				"<portlet:namespace/>travelHaltApplicantName": travelHaltApplicantName,
			    "<portlet:namespace/>travelHaltAddress": travelHaltAddress,
			    "<portlet:namespace/>travelHaltTelephone": travelHaltTelephone,
			    "<portlet:namespace/>travelHaltEmail": travelHaltEmail,
			    "<portlet:namespace/>travelHaltName": travelHaltName,
			    "<portlet:namespace/>travelHaltLocation": travelHaltLocation,
			    "<portlet:namespace/>travelHaltTelephoneNum": travelHaltTelephoneNum,
			    "<portlet:namespace/>travelHaltEmployeesNo": travelHaltEmployeesNo,
			    "<portlet:namespace/>travelHaltSignDate": travelHaltSignDate,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) {
				if(!isSaveAndContinue){
				applicantInfo();
				uploadDocuments('applicantSignaturetravelHaltBtn',"Travel Halt Signature of Applicant");
			}
			$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
			},
			error : function(data) {
			},
		});
	}
} 
	 function addTravelHaltOfferedInfo() { 
		gasStation = $('input[name="gasStation"]:checked').val();
		refreshment = $('input[name="refreshment"]:checked').val();
		drinks = $('input[name="drinks"]:checked').val();
		restaurant = $('input[name="restaurant"]:checked').val();
		wirelessinternet = $('input[name="wirelessinternet"]:checked').val();
        var genOp=  new Array();
		$("input:checkbox[name=restrooms]:checked").each(function(){
			genOp.push($(this).val());
		});
		var restrooms= genOp.toString();
		jtbApplicationId = $("#jtbApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${attractionTravelHaltOfferedUrl}",
			data : {
			    "<portlet:namespace/>gasStation": gasStation,
			    "<portlet:namespace/>refreshment": refreshment,
			    "<portlet:namespace/>drinks": drinks,
			    "<portlet:namespace/>restaurant": restaurant,
			    "<portlet:namespace/>wirelessinternet": wirelessinternet,
			    "<portlet:namespace/>restrooms": restrooms,
				"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
			},
			success : function(data) { 
			},
			error : function(data) {
			},
		});
 } 
	 
	 function addWaterSportsEmployeeFormInfo(isSaveAndContinue) { 
		 submit=true;
		 var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		 applicantName= $('#waterSportEmployeeApplicantName').val();
         applicantAddress= $('#waterSportEmployeeAddress').val();
         applicantAge= $('#waterSportEmployeeApplicantAge').val();
         applicantNationality= $('#waterSportEmployeeNationality').val();
         workPermitApplied= $('input[name="permitApplied"]:checked').val();
         workPermitDate= $('#WaterSportEmployessADate').val();
         qualification= $('#WaterSportEmployessQualification').val();
         placeOfEmployment= $('#WaterSportEmployessEmployment').val();
         ownerName= $('#WaterSportEmployessOwnerNam').val();
         if(!isSaveAndContinue){
	         if(!applicantName){
	 			$("#waterSportEmployeeApplicantNameValidation").removeClass("hide");
	 			$("#waterSportEmployeeApplicantName").focus();
	 			submit= false;
	 		 }else{
	 			$("#waterSportEmployeeApplicantNameValidation").addClass("hide");
	 		 }
         }
			jtbApplicationId = $("#jtbApplicationId").val();
			if(submit){
			$.ajax({
				type : "POST",
				url : "${attractionWaterEmployeeLicenceUrl}",
				data : {
					"<portlet:namespace/>applicantName": applicantName,
			        "<portlet:namespace/>applicantAddress": applicantAddress,
			        "<portlet:namespace/>applicantAge": applicantAge,
			        "<portlet:namespace/>applicantNationality": applicantNationality,
			        "<portlet:namespace/>workPermitApplied": workPermitApplied,
			        "<portlet:namespace/>workPermitDate": workPermitDate,
			        "<portlet:namespace/>qualification": qualification,
			        "<portlet:namespace/>placeOfEmployment": placeOfEmployment,
			        "<portlet:namespace/>ownerName": ownerName,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					if(!isSaveAndContinue){
					applicantInfo(); 
					uploadDocuments('jamaicaWorkPermit',"Jamaica Work Permit");
					}
					$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				},
				error : function(data) {
				},
			});
			}	
		 } 
	 function addWaterSportsEmployeeGeneralDeclareInfo() { 
         cpr= $("input[name='cpr']:checked").val();
         firstAid= $("input[name='firstAid']:checked").val();
         medicFirstAid= $("input[name='medicFirstAid']:checked").val();
         lifeguard= $("input[name='lifeguard']:checked").val();
         rescueDiver= $("input[name='rescueDiver']:checked").val();
         otherRescue= $("input[name='other']:checked").val();
         employeeSignatureDate= $('#WaterSportEmpSignDate').val();
         timePeriod= $('#waterSportTimePeriod').val();
			jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${attractionWaterEmpGeneralDeclarationUrl}",
				data : {
			        "<portlet:namespace/>cpr": cpr,
			        "<portlet:namespace/>firstAid": firstAid,
			        "<portlet:namespace/>medicFirstAid": medicFirstAid,
			        "<portlet:namespace/>lifeguard": lifeguard,
			        "<portlet:namespace/>rescueDiver": rescueDiver,
			        "<portlet:namespace/>otherRescue": otherRescue,
			        "<portlet:namespace/>employeeSignatureDate": employeeSignatureDate,
			        "<portlet:namespace/>timePeriod": timePeriod,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					uploadDocuments('applicantSignatureWaterSportEmployeeBtn',"Water Sport Signature of Employee");
					uploadDocuments('applicantStampWaterSportEmployeeBtn',"Superintendent of Police");
					uploadDocuments('cpr-copy',"Copy of CPR");
					uploadDocuments('justicePeaceLetter',"Justice Peace Letter");
				},
				error : function(data) {
				},
			});
		 } 
	 
	 function addMotorBikeDetailFormInfo(isSaveAndContinue) {
		 submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		   applicantName= $('#motorBikeApplicantName').val();
	        address= $('#motorBikeAddress').val();
	        companyName= $('#motorBikeCompanyName').val();
	        exactLocation= $('#motorBikeExactLocation').val();
	        telephone= $('#motorBikeTelephone').val();
	        email= $('#motorBikeEmail').val();
	        registrationDate= $('#motorBikeDate').val();
	        managerName= $('#motorBikeManagerName').val();
	        numberOfBikes= $('#motorBikeNumber').val();
	        numberOfHelmets= $('#motorBikeHelmetNumber').val();
	        numberOfEmployees= $('#motorBikeEmployeesNo').val();
	        signatureDate= $('#motorBikeSignDate').val();
	        if(!isSaveAndContinue){
			   if(!email){
					  $("#motorBikeEmailValidation").removeClass("hide");
					  $("#motorBikeEmailValidation").text("Please Enter E-mail Address");
					  $("#motorBikeEmail").focus();
					  submit= false;
				  }else if(email.match(mailformat)){ 
						$("#motorBikeEmailValidation").addClass("hide");
					}else
						{
							$("#motorBikeEmailValidation").removeClass("hide");
							$("#motorBikeEmailValidation").text("You have entered an invalid email address");
							$("#motorBikeEmail").focus();
							submit= false;
						}
				if(!applicantName){
					$("#motorBikeApplicantNameValidation").removeClass("hide");
					$("#motorBikeApplicantName").focus();
					submit= false;
				}else{
					$("#motorBikeApplicantNameValidation").addClass("hide");
				}
	        }
			var bikeInd=  new Array();
			$("input:checkbox[name=motorBikeIndustry]:checked").each(function(){
				bikeInd.push($(this).val());
			});
			var motorBikeIndustry= bikeInd.toString();
			jtbApplicationId = $("#jtbApplicationId").val();
			if(submit){
			$.ajax({
				type : "POST",
				url : "${attractionMoterBikeRentalUrl}",
				data : {
					"<portlet:namespace/>applicantName": applicantName,
				    "<portlet:namespace/>address": address,
				    "<portlet:namespace/>companyName": companyName,
				    "<portlet:namespace/>exactLocation": exactLocation,
				    "<portlet:namespace/>telephone": telephone,
				    "<portlet:namespace/>email": email,
				    "<portlet:namespace/>registrationDate": registrationDate,
				    "<portlet:namespace/>managerName": managerName,
				    "<portlet:namespace/>numberOfBikes": numberOfBikes,
				    "<portlet:namespace/>numberOfHelmets": numberOfHelmets,
				    "<portlet:namespace/>numberOfEmployees": numberOfEmployees,
				    "<portlet:namespace/>signatureDate": signatureDate,
				    "<portlet:namespace/>motorBikeIndustry": motorBikeIndustry,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					if(!isSaveAndContinue){
					applicantInfo();
					uploadDocuments('applicantSignatureMotorBtn',"Bike Rental Signature of Applicant");
					}
					$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				},
				error : function(data) {
				},
			});
		}
	} 
	 function addMotorBikeCOnditionProposedInfo() { 
			var bikeInd=  new Array();
			$("input:checkbox[name=motorBikeIndustry]:checked").each(function(){
				bikeInd.push($(this).val());
			});
			var motorBikeIndustry= bikeInd.toString();
			jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${attractionMoterBikeConditionProposedUrl}",
				data : {
				    "<portlet:namespace/>motorBikeIndustry": motorBikeIndustry,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
				},
				error : function(data) {
				},
			});
		 } 
	 function addPlaceOfInterestDetailFormInfo(isSaveAndContinue) { 
		 submit=true;
		   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			placeOfInterest = $('#typeOfPlace').val();
			typeOfRole = $('#typeOfRole').val();
		    placeInterestOwnerName = $('#placeInterestOwnerName').val();
		    nameOfInterestLocation = $('#nameOfInterestLocation').val();
		    placeOfInterestLocation = $('#placeOfInterestLocation').val();
		    placeOfInterestMailing = $('#placeOfInterestMailing').val();
		    placeOfInterestTelephone = $('#placeOfInterestTelephone').val();
		    placeOfInterestEmail = $('#placeOfInterestEmail').val();
		    placeOfInterestEmployeesNo = $('#placeOfInterestEmployeesNo').val();
		    placeOfInterestParish = $('#placeOfInterestParish').val();
		    if(!isSaveAndContinue){
		        if(!placeOfInterestEmail){
		    			  $("#placeOfInterestEmailValidation").removeClass("hide");
		    			  $("#placeOfInterestEmailValidation").text("Please Enter E-mail Address");
		    			  $("#placeOfInterestEmail").focus();
		    			  submit= false;
		    		  }else if(placeOfInterestEmail.match(mailformat)){ 
		    				$("#placeOfInterestEmailValidation").addClass("hide");
		    			}else
		    				{
		    					$("#placeOfInterestEmailValidation").removeClass("hide");
		    					$("#placeOfInterestEmailValidation").text("You have entered an invalid email address");
		    					$("#placeOfInterestEmail").focus();
		    					submit= false;
		    				}
		    		if(!placeInterestOwnerName){
		    			$("#placeOfInterestNameValidation").removeClass("hide");
		    			$("#placeInterestOwnerName").focus();
		    			submit= false;
		    		}else{
		    			$("#placeOfInterestNameValidation").addClass("hide");
		    	}
		    }

			jtbApplicationId = $("#jtbApplicationId").val();
			if(submit){
			$.ajax({
				type : "POST",
				url : "${attractionPlaceOfInterestDetailUrl}",
				data : {
					"<portlet:namespace/>placeOfInterest": placeOfInterest,
					"<portlet:namespace/>typeOfRole": typeOfRole,
					"<portlet:namespace/>placeInterestOwnerName": placeInterestOwnerName,
					"<portlet:namespace/>nameOfInterestLocation": nameOfInterestLocation,
					"<portlet:namespace/>placeOfInterestLocation": placeOfInterestLocation,
					"<portlet:namespace/>placeOfInterestMailing": placeOfInterestMailing,
					"<portlet:namespace/>placeOfInterestTelephone": placeOfInterestTelephone,
					"<portlet:namespace/>placeOfInterestEmail": placeOfInterestEmail,
					"<portlet:namespace/>placeOfInterestEmployeesNo": placeOfInterestEmployeesNo,
					"<portlet:namespace/>placeOfInterestParish": placeOfInterestParish,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					if(!isSaveAndContinue){
					applicantInfo(); 
					}
					$("#jtbFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				},
				error : function(data) {
				},
			});
		}
	} 
	 $("#typeOfPlace").change(function(){
		 if($(this).val() == "Place of Interest"){
			 $(".placeOfInterest").removeClass("hide");
		 }else{
			 $(".placeOfInterest").addClass("hide");
		 }
	 });
	 function addPlaceOfInterestGeneralDeclaration() { 
		 placeOfInterestOwnerName = $('#placeOfInterestOwnerName').val();
		    placeOfInterestGenHotelLaws = $('#placeOfInterestHotelLaws').val();
		    placeOfInterestGenDate = $('#placeOfInterestDate').val();
		    placeOfInterestGenName = $('#placeOfInterestName').val();
		    placeOfInterestGenOperatingSince = $('#placeOfInterestOperatingSince').val();
		    placeOfInterestGenAcresLand = $('#placeOfInterestAcresLand').val();
		    walkingTour = $("input[name='walkingtour']:checked").val();
		    cemeteryTour = $("input[name='cemeterytour']:checked").val();
		    gardenTour = $("input[name='gardentour']:checked").val();
		    placeOfInterestGenRooms = $('#placeOfInterestRooms').val();
		    placeOfInterestGenTentSpace = $('#placeOfInterestTentSpace').val();
		    placeOfInterestGenShowers = $('#placeOfInterestShowers').val();
		    placeOfInterestGenSanitaryConveniences = $('#placeOfInterestSanitaryConveniences').val();
		    placeOfInterestSignDate = $('#placeOfInterestSignDate').val();
			jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${attractionPlaceOfInterestGenDeclareUrl}",
				data : {

					"<portlet:namespace/>placeOfInterestOwnerName": placeOfInterestOwnerName,
					"<portlet:namespace/>placeOfInterestGenHotelLaws": placeOfInterestGenHotelLaws,
					"<portlet:namespace/>placeOfInterestGenDate": placeOfInterestGenDate,
					"<portlet:namespace/>placeOfInterestGenName": placeOfInterestGenName,
					"<portlet:namespace/>placeOfInterestGenOperatingSince": placeOfInterestGenOperatingSince,
					"<portlet:namespace/>placeOfInterestGenAcresLand": placeOfInterestGenAcresLand,
					"<portlet:namespace/>walkingtour": walkingTour,
					"<portlet:namespace/>cemeterytour": cemeteryTour,
					"<portlet:namespace/>gardentour": gardenTour,
					"<portlet:namespace/>placeOfInterestGenRooms": placeOfInterestGenRooms,
					"<portlet:namespace/>placeOfInterestGenTentSpace": placeOfInterestGenTentSpace,
					"<portlet:namespace/>placeOfInterestGenShowers": placeOfInterestGenShowers,
					"<portlet:namespace/>placeOfInterestGenSanitaryConveniences": placeOfInterestGenSanitaryConveniences,
					"<portlet:namespace/>placeOfInterestSignDate": placeOfInterestSignDate,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					uploadDocuments('address-of-directors-company',"Place Address of Directors","The attached list shows the names and addresses of all the Directors of the operating company (if applicable)");
					uploadDocuments('applicantSignatureplaceOfInterestBtn',"Place Signature of Applicant","");
				},
				error : function(data) {
				},
			});
		} 
	 function addCraftTradersPermitInfo() {  
		 var checkLoc=  new Array();
			$("input:checkbox[name=occupyLocation]:checked").each(function(){
				checkLoc.push($(this).val());
			});
			var occupyLocation= checkLoc.toString();
			craftTraderGoodsType = $('#craftTraderGoodsType').val();
		 craftTraderName = $('#craftTraderName').val();
		 craftTraderPosition = $('#craftTraderPosition').val();
		 craftTraderNameMinisterAddress = $('#craftTraderNameMinisterAddress').val();
		 craftTraderNameMinisterName = $('#craftTraderNameMinisterName').val();
		 craftTraderMinisterNamePosition = $('#craftTraderMinisterNamePosition').val();
		 craftTraderAddressOwner = $('#craftTraderAddressOwner').val();
		 craftTraderSignDate = $('#craftTraderSignDate').val();
		 craftTraderAssistantSignDate = $('#craftTraderAssistantSignDate').val();
		 
			craftTradersApplicantOwner = $("#craftTradersApplicantOwner").val();
			craftTradersApplicantAddress  = $("#craftTradersApplicantAddress").val();
			craftTradersApplicantEmail  = $("#craftTradersApplicantEmail").val();
			craftTradersApplicantPhoneNo  = $("#craftTradersApplicantPhoneNo").val();

			jtbApplicationId = $("#jtbApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${attractionCraftTraderPermitUrl}",
				data : {

					"<portlet:namespace/>occupyLocation": occupyLocation,
					"<portlet:namespace/>craftTraderGoodsType": craftTraderGoodsType,
					"<portlet:namespace/>craftTraderName": craftTraderName,
				    "<portlet:namespace/>craftTraderPosition": craftTraderPosition,
				    "<portlet:namespace/>craftTraderNameMinisterAddress": craftTraderNameMinisterAddress,
				    "<portlet:namespace/>craftTraderNameMinisterName": craftTraderNameMinisterName,
				    "<portlet:namespace/>craftTraderMinisterNamePosition": craftTraderMinisterNamePosition,
				    "<portlet:namespace/>craftTraderAddressOwner": craftTraderAddressOwner,
				    "<portlet:namespace/>craftTraderSignDate": craftTraderSignDate,
				    "<portlet:namespace/>craftTraderAssistantSignDate": craftTraderAssistantSignDate,
				    
				    "<portlet:namespace/>craftTradersApplicantOwner": craftTradersApplicantOwner,
					"<portlet:namespace/>craftTradersApplicantAddress": craftTradersApplicantAddress ,
					"<portlet:namespace/>craftTradersApplicantPhoneNo": craftTradersApplicantPhoneNo ,
					"<portlet:namespace/>craftTradersApplicantEmail": craftTradersApplicantEmail ,
					"<portlet:namespace/>jtbApplicationId" : jtbApplicationId,
				},
				success : function(data) {
					addCraftTradersApplicantDetail();
					addCraftTradersEmployeeDetail();
					uploadDocuments('applicantSignatureCraftBtn',"Craft Vendor's Signature");
					uploadDocuments('applicantSignatureCraftAssistantBtn',"Craft Vendor's Assistant Signature");
					/* checkbox docs */
					uploadDocuments('evidenceOwnership',"Evidence of Ownership");
					uploadDocuments('rentReceipt',"Rent Receipt");
					uploadDocuments('letterOwner',"Letter from Owner");
					uploadDocuments('contractLease',"Contract of Lease");
				},
				error : function(data) {
				},
			});
	} 
	 /* hotel-sign */
	 $(document).on('change', '#applicantSignatureHotelBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureHotelImageHolder");
		   var form1a_image_holder = $("#applicantSignatureHotelImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty();
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 $(document).on('change', '#managerSignatureHotelBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#managerSignatureHotelImageHolder");
		   var form1a_image_holder = $("#managerSignatureHotelImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty();
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* non-hotel-sign */
	 $(document).on('change', '#signatureNonHotelBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#signatureNonHotelImageHolder");
	    var form1a_image_holder = $("#signatureNonHotelImageHolderPreview");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	 
	/*  home-stay-sign */
	 $(document).on('change', '#applicantSignatureHomeStayBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureHomeStayImgHolder");
		    var form1a_image_holder = $("#applicantSignatureHomeStayImgHolderPre");
		    image_holder.empty();
		    form1a_image_holder.empty();
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
		  
	 $(document).on('change', '#applicantSealHomeStayBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSealHomeStayImgHolder");
	    var form1a_image_holder = $("#applicantSealHomeStayImgHolderPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	  
	 $(document).on('change', '#applicantSignatureAttractionBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureAttractionImgHolder");
	    var form1a_image_holder = $("#applicantSignatureAttractionImgHolderPreview");
	    image_holder.empty();
	    form1a_image_holder.empty(); 
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder); 
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	 
	 $(document).on('change', '#applicantSignatureRenewAttractionBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureRenewAttractionImgHolder");
	   /*  var form1a_image_holder = $("#applicantSignatureImageLeasePre"); */
	    image_holder.empty();
	   /*  form1a_image_holder.empty(); */
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              /* .appendTo(form1a_image_holder); */
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	  
	  /* car-rental */
	  $(document).on('change', '#applicantSignatureCarRentalBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureCarRentalImgHolder");
	    var form1a_image_holder = $("#applicantSignatureCarRentalImgHolderPreview");
	    image_holder.empty();
	   form1a_image_holder.empty(); 
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	  
	 /* contract-carriage */
	 $(document).on('change', '#ownerSignatureHotelBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#ownerSignatureHotelImageHolder");
	    var form1a_image_holder = $("#ownerSignatureHotelImageHolderPreview");
	    image_holder.empty();
	    form1a_image_holder.empty(); 
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	 /* moter-bike-sign */
	 $(document).on('change', '#applicantSignatureMotorBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureMotorHolder");
	   var form1a_image_holder = $("#applicantSignatureMotorHolderPreview");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	               .appendTo(form1a_image_holder); 
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	 /* domestic-tour-sign */
	 $(document).on('change', '#applicantSignaturedomesticBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignaturedomesticHolder");
	    var form1a_image_holder = $("#applicantSignaturedomesticHolderPreview");
	    image_holder.empty();
	     form1a_image_holder.empty(); 
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
	 $(document).on('change', '#signatureDomesticTourBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#signatureDomesticTourHolder");
		    var form1a_image_holder = $("#signatureDomesticTourHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 $(document).on('change', '#companySealDomesticTourBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#companySealDomesticTourHolder");
		    var form1a_image_holder = $("#companySealDomesticTourHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		               .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* travelHalt-sign */
	 $(document).on('change', '#applicantSignaturetravelHaltBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignaturetravelHaltHolder");
		    var form1a_image_holder = $("#applicantSignaturetravelHaltHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty();
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* place-Of-Interest-sign */
	 $(document).on('change', '#applicantSignatureplaceOfInterestBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureplaceOfInterestImageHolder");
		   var form1a_image_holder = $("#applicantSignatureplaceOfInterestImageHolderPreview");
		    image_holder.empty();
		   form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* travelAgency-sign */
	 $(document).on('change', '#applicantSignaturetravelAgencyBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignaturetravelAgencyHolder");
		   var form1a_image_holder = $("#applicantSignaturetravelAgencyHolderPreview");
		    image_holder.empty();
		   form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* carft-trader-sign */
	 $(document).on('change', '#applicantSignatureCraftBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureCraftImageHolder");
		    var form1a_image_holder = $("#applicantSignatureCraftImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 $(document).on('change', '#applicantSignatureCraftAssistantBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureCraftAssistantImageHolder");
		    var form1a_image_holder = $("#applicantSignatureCraftAssistantImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* WaterSport-sign */
	 $(document).on('change', '#applicantSignatureWaterSportBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureWaterSportImageHolder");
		    var form1a_image_holder = $("#applicantSignatureWaterSportImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		               .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 $(document).on('change', '#managerSignatureWaterSportBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#managerSignatureWaterSportImageHolder");
		    var form1a_image_holder = $("#managerSignatureWaterSportImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty();
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		             .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 /* water-sport-Employee */
	 $(document).on('change', '#applicantSignatureWaterSportEmployeeBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantSignatureWaterSportEmployeeImageHolder");
		   var form1a_image_holder = $("#applicantSignatureWaterSportEmployeeImageHolderPreview");
		    image_holder.empty();
		    form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		              .appendTo(form1a_image_holder); 
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 $(document).on('change', '#applicantStampWaterSportEmployeeBtn', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#applicantStampWaterSportEmployeeImageHolder");
		   var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview");
		    image_holder.empty();
		   form1a_image_holder.empty(); 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		               .appendTo(form1a_image_holder);
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });
	 
	 /* contract-carriage-add-sign */
	 $(document).on('change', '#contractDriverListSignatureUpload', function() {
		    //Get count of selected files
		    var countFiles = $(this)[0].files.length;
		    var imgPath = $(this)[0].value;
		    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
		    var image_holder = $("#driverSignature");
		   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
		    image_holder.empty();
		   /* form1a_image_holder.empty(); */ 
		    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
		      if (typeof(FileReader) != "undefined") {
		        //loop for each file selected for uploaded.
		        for (var i = 0; i < countFiles; i++) 
		        {
		          var reader = new FileReader();
		          reader.onload = function(e) {
		            $("<img />", {
		              "src": e.target.result,
		              "class": "thumb-image",
		              "height":"100",
		              "width":"100"
		            }).appendTo(image_holder);
		            $("<img />", {
		                "src": e.target.result,
		                "class": "thumb-image",
		                "height":"100",
		                "width":"100"
		              })
		             /*   .appendTo(form1a_image_holder); */
		          }
		          image_holder.show();
		          reader.readAsDataURL($(this)[0].files[i]);
		        }
		      } else {
		        alert("This browser does not support FileReader.");
		      }
		    } else {
		      alert("Pls select only images");
		    }
		  });		

	 </script>