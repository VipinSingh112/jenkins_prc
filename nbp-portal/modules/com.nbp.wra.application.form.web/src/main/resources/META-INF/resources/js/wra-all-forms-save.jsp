<portlet:resourceURL var="setLicenceToAbstractAndWaterInfo" id="/set/Licence/To/Abstract/And/Water/Info"></portlet:resourceURL>
<portlet:resourceURL var="setRenewalLicToAbstractWaterInfo" id="/set/Renewal/To/Abstract/Water/Info"></portlet:resourceURL>
<portlet:resourceURL var="setPermitDrillFormDataInfo" id="/set/Permit/Drill/Form/Data/Info"></portlet:resourceURL>
<portlet:resourceURL var="setWellDrillingLicenceFormDataInfo" id="/set/Well/Drilling/Licence/Form/Data/Info"></portlet:resourceURL>
<script>

function setLicenceToAbstractAndUseWater() {
	 abstractApplicationNo=$("#abstractApplicationNo").val();
     nameOfApplicant = $("#abstractApplicantName").val();
     abstractMailingAddParish = $("#abstractMailingAddParish").val();
     abstractMailingAddress = $("#abstractMailingAddress").val();
     abstractEmailAddress = $("#abstractEmailAddress").val();
     abstractOfficePhone = $("#abstractOfficePhone").val();
     abstractMobilePhone = $("#abstractMobilePhone").val();
     abstractHomePhone = $("#abstractHomePhone").val();
     abstractWorkLocation = $("#abstractWorkLocation").val();
     abstractLocation = $("#abstractLocation").val();
     abstractContractorName = $("#abstractContractorName").val();
     abstractContractorAddress = $("#abstractContractorAddress").val();
     abstractWaterContractorAdd = $("#abstractWaterContractorAdd").val();
     abstractWaterSource = $("#abstractWaterSource").val();
     abstractWaterPurpose = $("#abstractWaterPurpose").val();
    // abstractAreaIrrigated = $("#abstractAreaIrrigated").val();
    // abstractSystemIrrigation = $("#abstractSystemIrrigation").val();
     abstractWasteWater = $("#abstractWasteWater").val();
     abstractBoreholeDepth = $("#abstractBoreholeDepth").val();
     abstractDiameterBorehole = $("#abstractDiameterBorehole").val();
     abstractSuppliesLine = $("#abstractSuppliesLine").val();
     abstractLimestone = $("#abstractLimestone").val();
     abstractWaterMethod = $("#abstractWaterMethod").val();
     abstractWaterQuantity = $("#abstractWaterQuantity").val();
     abstractRecordingType = $("#abstractRecordingType").val();
     abstractTechnicalInformation = $("#abstractTechnicalInformation").val();
     abstractWaterCommission = $("#abstractWaterCommission").val();
     abstractInformation = $("#abstractInformation").val();
     abstractSignDate = $("#abstractSignDate").val();
     wraApplicationId=$("#wraApplicationId").val();
    $.ajax({
        type: "POST",
        url: "${setLicenceToAbstractAndWaterInfo}",
        data: {
            "<portlet:namespace/>abstractApplicationNo": abstractApplicationNo,
            "<portlet:namespace/>nameOfApplicant": nameOfApplicant,
            "<portlet:namespace/>abstractMailingAddParish": abstractMailingAddParish,
            "<portlet:namespace/>abstractMailingAddress": abstractMailingAddress,
            "<portlet:namespace/>abstractEmailAddress": abstractEmailAddress,
            "<portlet:namespace/>abstractOfficePhone": abstractOfficePhone,
            "<portlet:namespace/>abstractMobilePhone": abstractMobilePhone,
            "<portlet:namespace/>abstractHomePhone": abstractHomePhone,
            "<portlet:namespace/>abstractWorkLocation": abstractWorkLocation,
            "<portlet:namespace/>abstractLocation": abstractLocation,
            "<portlet:namespace/>abstractContractorName": abstractContractorName,
            "<portlet:namespace/>abstractContractorAddress": abstractContractorAddress,
            "<portlet:namespace/>abstractWaterContractorAdd": abstractWaterContractorAdd,
            "<portlet:namespace/>abstractWaterSource": abstractWaterSource,
            "<portlet:namespace/>abstractWaterPurpose": abstractWaterPurpose,
           // "<portlet:namespace/>abstractAreaIrrigated": abstractAreaIrrigated,
           // "<portlet:namespace/>abstractSystemIrrigation": abstractSystemIrrigation,
            "<portlet:namespace/>abstractWasteWater": abstractWasteWater,
            "<portlet:namespace/>abstractBoreholeDepth": abstractBoreholeDepth,
            "<portlet:namespace/>abstractDiameterBorehole": abstractDiameterBorehole,
            "<portlet:namespace/>abstractSuppliesLine": abstractSuppliesLine,
            "<portlet:namespace/>abstractLimestone": abstractLimestone,
            "<portlet:namespace/>abstractWaterMethod": abstractWaterMethod,
            "<portlet:namespace/>abstractWaterQuantity": abstractWaterQuantity,
            "<portlet:namespace/>abstractRecordingType": abstractRecordingType,
            "<portlet:namespace/>abstractTechnicalInformation": abstractTechnicalInformation,
            "<portlet:namespace/>abstractWaterCommission": abstractWaterCommission,
            "<portlet:namespace/>abstractInformation": abstractInformation,
            "<portlet:namespace/>abstractSignDate": abstractSignDate,
            "<portlet:namespace/>wraApplicationId": wraApplicationId,
        },
        async: false,
        success: function(data) {
        	addWaterIrrigationDetail();
        	uploadDocuments('applicantSignatureAbstractBtn',"Abstract Signature Applicant",'');
        	pendingWraApplication();
            // Handle success
        },
        error: function(data) {
            // Handle error
        },
    });
}
function setRenewalLicenceAbstractAndUseWater() {
	renewName=$("#renewName").val();
	renewContact=$("#renewContact").val();
	renewJobTitle=$("#renewJobTitle").val();
	renewTelephoneNum=$("#renewTelephoneNum").val();
	renewFaxNum=$("#renewFaxNum").val();
	renewParishLocation=$("#renewParishLocation").val();
	renewAddress=$("#renewAddress").val();
	renewSourceName=$("#renewSourceName").val();
	renewDetailsParishAdd=$("#renewDetailsParishAdd").val();
	renewDetailsLocation=$("#renewDetailsLocation").val();
	renewAbstractionRate=$("#renewAbstractionRate").val();
	renewDetailsUse=$("#renewDetailsUse").val();
	renewAbstractionMethod=$("#renewAbstractionMethod").val();
	renewStateDevice=$("#renewStateDevice").val();
	attachedDevice=$("input[name='attachedDevice']:checked").val();
	abstractionData=$("input[name='abstractionData']:checked").val();
	renewSignName=$("#renewSignName").val();
	renewDate=$("#renewDate").val();
     wraApplicationId=$("#wraApplicationId").val();
    $.ajax({
        type: "POST",
        url: "${setRenewalLicToAbstractWaterInfo}",
        data: {
            "<portlet:namespace/>renewName": renewName,
            "<portlet:namespace/>renewContact": renewContact,
            "<portlet:namespace/>renewJobTitle": renewJobTitle,
            "<portlet:namespace/>renewTelephoneNum": renewTelephoneNum,
            "<portlet:namespace/>renewFaxNum": renewFaxNum,
            "<portlet:namespace/>renewParishLocation": renewParishLocation,
            "<portlet:namespace/>renewAddress": renewAddress,
            "<portlet:namespace/>renewSourceName": renewSourceName,
            "<portlet:namespace/>renewDetailsParishAdd": renewDetailsParishAdd,
            "<portlet:namespace/>renewDetailsLocation": renewDetailsLocation,
            "<portlet:namespace/>renewAbstractionRate": renewAbstractionRate,
            "<portlet:namespace/>renewDetailsUse": renewDetailsUse,
            "<portlet:namespace/>renewAbstractionMethod": renewAbstractionMethod,
            "<portlet:namespace/>renewStateDevice": renewStateDevice,
            "<portlet:namespace/>attachedDevice": attachedDevice,
            "<portlet:namespace/>abstractionData": abstractionData,
            "<portlet:namespace/>renewSignName": renewSignName,
            "<portlet:namespace/>renewDate": renewDate,
            "<portlet:namespace/>wraApplicationId": wraApplicationId,
        },
        async: false,
        success: function(data) {
        	uploadDocuments('applicantSignatureRenewBtn',"Abstract Renew Signature Applicant",'');
            // Handle success
        	pendingWraApplication();
        },
        error: function(data) {
            // Handle error
        },
    });
}

function setPermitDrillingFormData() {
	 permitDrillingApplicationNo = $("#permitDrillingApplicationNo").val();
     permitDrillingApplicantName = $("#permitDrillingApplicantName").val();
     permitDrillingMailingAddParish = $("#permitDrillingMailingAddParish").val();
     permitDrillingMailingAddress = $("#permitDrillingMailingAddress").val();
     permitDrillingEmailAddress = $("#permitDrillingEmailAddress").val();
     permitDrillingOfficePhone = $("#permitDrillingOfficePhone").val();
     permitDrillingMobilePhone = $("#permitDrillingMobilePhone").val();
     permitDrillingHomePhone = $("#permitDrillingHomePhone").val();
     permitDrillingWorkLocation = $("#permitDrillingWorkLocation").val();
     permitDrillingLocation = $("#permitDrillingLocation").val();
     permitDrillingNature = $("#permitDrillingNature").val();
     permitDrillingContractorName = $("#permitDrillingContractorName").val();
     permitDrillingContractorAddress = $("#permitDrillingContractorAddress").val();
     permitDrillingContractorAdd = $("#permitDrillingContractorAdd").val();
     permitDrillingPurpose = $("#permitDrillingPurpose").val();
     permitDrillingBoreholeDepth = $("#permitDrillingBoreholeDepth").val();
     permitDrillingDiameterBorehole = $("#permitDrillingDiameterBorehole").val();
     permitDrillingMethod = $("#permitDrillingMethod").val();
     permitDrillingConstMethod = $("#permitDrillingConstMethod").val();
     permitDrillingSupplies = $("#permitDrillingSupplies").val();
     permitDrillingTechnicalInfo = $("#permitDrillingTechnicalInfo").val();
     permitDrillingCubic = $("#permitDrillingCubic").val();
     permitDrillingAuthority = $("#permitDrillingAuthority").val();
     permitDrillingSignDate = $("#permitDrillingSignDate").val();
     wraApplicationId=$("#wraApplicationId").val();

    $.ajax({
        type: "POST",
        url: "${setPermitDrillFormDataInfo}",
        data: {
            "<portlet:namespace/>permitDrillingApplicationNo": permitDrillingApplicationNo,
            "<portlet:namespace/>permitDrillingApplicantName": permitDrillingApplicantName,
            "<portlet:namespace/>permitDrillingMailingAddParish": permitDrillingMailingAddParish,
            "<portlet:namespace/>permitDrillingMailingAddress": permitDrillingMailingAddress,
            "<portlet:namespace/>permitDrillingEmailAddress": permitDrillingEmailAddress,
            "<portlet:namespace/>permitDrillingOfficePhone": permitDrillingOfficePhone,
            "<portlet:namespace/>permitDrillingMobilePhone": permitDrillingMobilePhone,
            "<portlet:namespace/>permitDrillingHomePhone": permitDrillingHomePhone,
            "<portlet:namespace/>permitDrillingWorkLocation": permitDrillingWorkLocation,
            "<portlet:namespace/>permitDrillingLocation": permitDrillingLocation,
            "<portlet:namespace/>permitDrillingNature": permitDrillingNature,
            "<portlet:namespace/>permitDrillingContractorName": permitDrillingContractorName,
            "<portlet:namespace/>permitDrillingContractorAddress": permitDrillingContractorAddress,
            "<portlet:namespace/>permitDrillingContractorAdd": permitDrillingContractorAdd,
            "<portlet:namespace/>permitDrillingPurpose": permitDrillingPurpose,
            "<portlet:namespace/>permitDrillingBoreholeDepth": permitDrillingBoreholeDepth,
            "<portlet:namespace/>permitDrillingDiameterBorehole": permitDrillingDiameterBorehole,
            "<portlet:namespace/>permitDrillingMethod": permitDrillingMethod,
            "<portlet:namespace/>permitDrillingConstMethod": permitDrillingConstMethod,
            "<portlet:namespace/>permitDrillingSupplies": permitDrillingSupplies,
            "<portlet:namespace/>permitDrillingTechnicalInfo": permitDrillingTechnicalInfo,
            "<portlet:namespace/>permitDrillingCubic": permitDrillingCubic,
            "<portlet:namespace/>permitDrillingAuthority": permitDrillingAuthority,
            "<portlet:namespace/>permitDrillingSignDate": permitDrillingSignDate,
            "<portlet:namespace/>wraApplicationId": wraApplicationId,
        },
        async: false,
        success: function(data) {
        	uploadDocuments('applicantSignaturePermitBtn',"Permit Signature Applicant",'');
        	pendingWraApplication();
            // Handle success
        },
        error: function(data) {
            // Handle error
        },
    });
}
function setWellDrillingLicenceFormData() {
    // Getting the value of wraApplicationId from an element with ID wraApplicationId
     wraApplicationId = $("#wraApplicationId").val();
     wellDrillingApplicationNo = $("#wellDrillingApplicationNo").val();
     wellDrillingApplicantName = $("#wellDrillingApplicantName").val();
     wellDrillingAddressParish = $("#wellDrillingAddressParish").val();
     wellDrillingApplicantAddress = $("#wellDrillingApplicantAddress").val();
     wellDrillingDOBDate = $("#wellDrillingDOBDate").val();
     wellDrillingEducational = $("#wellDrillingEducational").val();
     wellDrillingSpecificTraining = $("#wellDrillingSpecificTraining").val();
     wellDrillingSpecificExperience = $("#wellDrillingSpecificExperience").val();
     selfEmployed = $("input[name='selfEmployed']:checked").val();
     wellDrillingName = $("#wellDrillingName").val();
     wellDrillingPersentEmployer = $("#wellDrillingPersentEmployer").val();
     wellDrillingAddress = $("#wellDrillingAddress").val();
     wellDrillingStateFirst = $("#wellDrillingStateFirst").val();
     wellDrillingFirstAddress = $("#wellDrillingFirstAddress").val();
     wellDrillingStateSec = $("#wellDrillingStateSec").val();
     wellDrillingAddressSec = $("#wellDrillingAddressSec").val();
     wellDrillingSignDate = $("#WellDrillingSignDate").val();

    // Sending an AJAX POST request
    $.ajax({
        type: "POST",
        url: "${setWellDrillingLicenceFormDataInfo}",
        data: {
            // Using portlet namespace for each variable
            "<portlet:namespace/>wraApplicationId": wraApplicationId,
            "<portlet:namespace/>wellDrillingApplicationNo": wellDrillingApplicationNo,
            "<portlet:namespace/>wellDrillingApplicantName": wellDrillingApplicantName,
            "<portlet:namespace/>wellDrillingAddressParish": wellDrillingAddressParish,
            "<portlet:namespace/>wellDrillingApplicantAddress": wellDrillingApplicantAddress,
            "<portlet:namespace/>wellDrillingDOBDate": wellDrillingDOBDate,
            "<portlet:namespace/>wellDrillingEducational": wellDrillingEducational,
            "<portlet:namespace/>wellDrillingSpecificTraining": wellDrillingSpecificTraining,
            "<portlet:namespace/>wellDrillingSpecificExperience": wellDrillingSpecificExperience,
            "<portlet:namespace/>selfEmployed": selfEmployed,
            "<portlet:namespace/>wellDrillingName": wellDrillingName,
            "<portlet:namespace/>wellDrillingPersentEmployer": wellDrillingPersentEmployer,
            "<portlet:namespace/>wellDrillingAddress": wellDrillingAddress,
            "<portlet:namespace/>wellDrillingStateFirst": wellDrillingStateFirst,
            "<portlet:namespace/>wellDrillingFirstAddress": wellDrillingFirstAddress,
            "<portlet:namespace/>wellDrillingStateSec": wellDrillingStateSec,
            "<portlet:namespace/>wellDrillingAddressSec": wellDrillingAddressSec,
            "<portlet:namespace/>wellDrillingSignDate": wellDrillingSignDate,
        },
        async: false,
        success: function(data) {
        	uploadDocuments('applicantSignatureWellDrillingBtn',"Well Drilling Signature Applicant",'');
        	pendingWraApplication();
            // Handling success
        },
        error: function(data) {
            // Handling error
        },
    });
}

</script>