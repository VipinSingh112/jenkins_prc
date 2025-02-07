<%@page import="com.nbp.hsra.application.service.model.RadiationDeclaration"%>
<%@page import="com.nbp.hsra.application.service.model.SpecificReqPropLicActivity"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationProtectionSecOne"%>
<%@page import="com.nbp.hsra.application.service.model.BrokerDeclarationInfo"%>
<%@page import="com.nbp.hsra.application.service.model.BrokerRegistrationInfo"%>
<%@page import="com.nbp.hsra.application.service.service.BrokerDeclarationInfoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.QualityDeclarationInfoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.nbp.hsra.application.service.model.QualityProficiencyDetail"%>
<%@page import="com.nbp.hsra.application.service.model.QualityDeclarationInfo"%>
<%@page import="com.nbp.hsra.application.service.model.QualityEmploymentInfo"%>
<%@page import="com.nbp.hsra.application.service.model.QualityApplicantDetail"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.HsraApplicationPayment"%>
<%@page import="com.nbp.hsra.application.service.service.GenEquipmentDataLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.AlternateRsoOneAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.QualifedExpertAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.AlternateRsoAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadionuclideAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.SourcesDetailAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.MedicalPractitionerAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.SealedSourcesAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.GenEquipmentData"%>
<%@page import="com.nbp.hsra.application.service.model.AlternateRsoOneAdd"%>
<%@page import="com.nbp.hsra.application.service.model.QualifedExpertAdd"%>
<%@page import="com.nbp.hsra.application.service.model.AlternateRsoAdd"%>
<%@page import="com.nbp.hsra.application.service.model.RadionuclideAdd"%>
<%@page import="com.nbp.hsra.application.service.model.SourcesDetailAdd"%>
<%@page import="com.nbp.hsra.application.service.model.MedicalPractitionerAdd"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationDevicesAdd"%>
<%@page import="com.nbp.hsra.application.service.model.SealedSourcesAdd"%>
<%@page import="com.nbp.hsra.application.service.model.UnsealedSourceAdd"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.hsra.application.service.model.AddMedicalPractitioner"%>
<%@page import="com.nbp.hsra.application.service.service.AddMedicalPractitionerLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.QualifedExpertOneAdd"%>
<%@page import="com.nbp.hsra.application.service.service.QualifedExpertOneAddLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.HsraApplicationCurrentStage"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationLocalService"%>
<%@page import="com.nbp.hsra.application.service.model.HsraApplication"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.hsra.application.service.model.RadionuclideInfo"%>
<%@page import="com.nbp.hsra.application.service.service.RadionuclideInfoLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="signatureUploadInHsraFormUrl" id="/upload/multiple/documents"></portlet:resourceURL>
<portlet:resourceURL var="addUnsealedSourcesUrl" id="unsealed/sources"/>
<portlet:resourceURL var="addSealedSourcesUrl" id="sealed/sources"/>
<portlet:resourceURL var="addRadiationDevicesUrl" id="radiation/devices"/>
<portlet:resourceURL var="addMedicalPractitionerUrl" id="medical/practitioner"/>
<portlet:resourceURL var="addSourcesDetailUrl" id="sources/detail"/>
<portlet:resourceURL var="addRadionuclideDetailUrl" id="radionuclide/detail"/>
<portlet:resourceURL var="addGenEquipmentDetailUrl" id="gen/equipment/detail"/>
<portlet:resourceURL var="addAlternateRsoDetailUrl" id="alternate/rso/detail"/>
<portlet:resourceURL var="addQualifedExpertDetailUrl" id="qualifed/expert/detail"/>
<portlet:resourceURL var="addAlternateRsoOneDetailUrl" id="alternate/rso/one/detail"/>
<portlet:resourceURL var="addQualifedExpertOneDetailUrl" id="qualifed/expert/one/detail"/>
<portlet:resourceURL var="addAcknowledgementMedicalDetailUrl" id="acknowledgement/medical/detail"/>
<portlet:resourceURL var="addApplicantSignatureDetailUrl" id="applicant/signature/detail"/>
<portlet:resourceURL var="unsealedSourcesDetailDataAddFormUrl" id="/unsealed/sources/detail/data/add/form"/>
<portlet:resourceURL var="unsealedSourcesDetailDataDeleteUrl" id="/unsealed/sources/detail/data/delete"/>
<portlet:resourceURL var="sealedSourcesDetailDataAddFormUrl" id="/sealed/sources/detail/data/add/form"/>
<portlet:resourceURL var="sealedSourcesDetailDataDeleteUrl" id="/sealed/sources/detail/data/delete"/>
<portlet:resourceURL var="radiationDevicesDetailAddFormUrl" id="/radiation/devices/detail/add/form"/>
<portlet:resourceURL var="radiationDevicesDetailDeleteUrl" id="/radiation/devices/detail/delete"/>
<portlet:resourceURL var="medicalPractitionerDetailAddFormUrl" id="/medical/practitioner/detail/add/form"/>
<portlet:resourceURL var="medicalPractitionerDetailDeleteUrl" id="/medical/practitioner/detail/delete"/>
<portlet:resourceURL var="sourcesDetailDataAddFormUrl" id="/sources/details/data/add/form"/>
<portlet:resourceURL var="sourcesDetailDataDeleteUrl" id="/sources/detail/data/delete"/>
<portlet:resourceURL var="radionuclideDetailDataUrl" id="/radionulcide/Detail/Data"/>
<portlet:resourceURL var="radionuclideDetailDeleteUrl" id="/radionulcide/detail/delete"/>
<portlet:resourceURL var="alternateRsoDataUrl" id="/alternate/rso/data"/>
<portlet:resourceURL var="alternateRsoDetailDeleteUrl" id="/alternate/rso/detail/delete"/>
<portlet:resourceURL var="qualifedExpertDataUrl" id="/qualifed/expert/data"/>
<portlet:resourceURL var="qualifedExpertDetailDeleteUrl" id="/qualifed/expert/detail/delete"/>
<portlet:resourceURL var="alternateRsoOneDataUrl" id="/alternate/rso/one/data"/>
<portlet:resourceURL var="alternateRsoOneDataDeleteUrl" id="/alternate/rso/one/data/delete"/>
<portlet:resourceURL var="genEquipmentDataUrl" id="/gen/equipment/data"/>
<portlet:resourceURL var="genEquipmentDetailDeleteUrl" id="/gen/equipment/detail/delete"/>
<portlet:resourceURL var="qualifedExpertOneDetailUrl" id="/qualifed/expert/one/detail"/>
<portlet:resourceURL var="hsraApplicantDetailSectionTwo" id="/hsra/detail/applicant/section/two"></portlet:resourceURL>
<portlet:resourceURL var="DetailOfBusinessSecThreeUrl" id="/hsra/detail/of/business/three"></portlet:resourceURL>
<portlet:resourceURL var="PurposeOfPropLicenceUrl" id="/hsra/purpose/prop/lic/four"></portlet:resourceURL>
<portlet:resourceURL var="SpecificReqPropLicActivityUrl" id="/hsra/specific/requirements"></portlet:resourceURL>
<portlet:resourceURL var="RadiationDeclarationUrl" id="/hsra/radiation/declaration"></portlet:resourceURL>
<portlet:resourceURL var="AddBrokerResgistrationDetailUrl" id="/hsra/brokers/registration"></portlet:resourceURL>
<portlet:resourceURL var="AddBrokerDeclarationUrl" id="/hsra/brokers/declaration"></portlet:resourceURL>
<portlet:resourceURL var="AddQualityExpertDetailUrl" id="/hsra/quality/expert/details"></portlet:resourceURL>
<portlet:resourceURL var="hsraRadiationSectionOne" id="/hsra/rad/section/one"></portlet:resourceURL>
<portlet:resourceURL var="RadiationSafetyProgramUrl" id="/hsra/radiation/safety/program"></portlet:resourceURL>
<portlet:resourceURL var="RadiationSafetyLowRiskUrl" id="/hsra/radiation/safety/low/risk"></portlet:resourceURL>
<portlet:resourceURL var="AddQualityEmployementDetailUrl" id="/hsra/quality/employement"></portlet:resourceURL>
<portlet:resourceURL var="AddQualityProficiencyDetailUrl" id="/hsra/quality/proficiency/detail"></portlet:resourceURL>
<portlet:resourceURL var="AddQualityDeclarationUrl" id="/hsra/quality/declaration"></portlet:resourceURL>
<portlet:resourceURL var="AddFitPropDeclarationOfApplicantUrl" id="/hsra/fit/prop/declaration/applicant"></portlet:resourceURL>
<portlet:resourceURL var="AddLegalInformationUrl" id="/hsra/legal/contact/info"></portlet:resourceURL>
<portlet:resourceURL var="AddDetailSourceUrl" id="/hsra/detail/source/info"></portlet:resourceURL>
<portlet:resourceURL var="AddRadionuclideUrl" id="/hsra/radionuclide/info"></portlet:resourceURL>
<portlet:resourceURL var="AddGeneratingEquipmentUrl" id="/hsra/generatin/equipment"></portlet:resourceURL>
<portlet:resourceURL var="AddFitPropPersonalDetailUrl" id="/hsra/fit/prop/personal/detail"></portlet:resourceURL>
<portlet:resourceURL var="AddFitPropBusinessInformationUrl" id="/hsra/fit/prop/business"></portlet:resourceURL>
<portlet:resourceURL var="AddFitPropFinancialProfileUrl" id="/hsra/fit/prop/financial/profile"></portlet:resourceURL>
<%
    QualityApplicantDetail qualityApplicationDetail = null;
	QualityEmploymentInfo employmentInfo = null;
	QualityDeclarationInfo qualityDeclare = null;
	QualityProficiencyDetail proficienctDetail = null;
	List<DLFileEntry> fileEntry2 = null;
	DLFolder supportingDocumentsParentFolder1 = null;
	DLFolder supportingDocumentsFolder1 = null;
	DLFolder supportingDocumentSubFolderManagment1 = null;
	FileEntry fileEntrySignatureInDeclare = null;
	FileEntry fileEntrySignatureInQualityExpert = null;
	String fileUrlInDeclare = "";
	String fileUrlInQualityExpect = "";
	String copyofcvUrl = "";
	FileEntry fileEntryCopyofcv =null;
	FileEntry fileEntryexperiencecopy =null;
	String experiencecopy = "";
	String experiencecopyUrl = "";
	FileEntry fileEntryqualityAssuranceProgramme =null;
	String qualityAssuranceProgramme = "";
	String qualityAssuranceProgrammeUrl = "";
	FileEntry fileEntrynuclearMedicine =null;
	String nuclearMedicine = "";
	String nuclearMedicineUrl = "";
	FileEntry fileEntrytreatmentRoomsUpload =null;
	String treatmentRoomsUpload = "";
	String treatmentRoomsUploadUrl = "";
	FileEntry fileEntryreleaseOfTreatmentRoom =null;
	String releaseOfTreatmentRoom = "";
	String releaseOfTreatmentRoomUrl = "";
	FileEntry fileEntrymedicalEmergencies =null;
	String medicalEmergencies = "";
	String medicalEmergenciesUrl = "";
	FileEntry fileEntryresearchReviewComittee =null;
	String researchReviewComittee = "";
	String researchReviewComitteeUrl = "";
	FileEntry fileEntryresumeCopy =null;
	String resumeCopy = "";
	String resumeCopyUrl = "";
	FileEntry fileEntrytrainingCopy =null;
	String trainingCopy = "";
	String trainingCopyUrl = "";
	FileEntry fileEntryqualifiedCopy =null;
	String qualifiedCopy = "";
	String qualifiedCopyUrl = "";
	FileEntry fileEntrytrainingExpert =null;
	String trainingExpert = "";
	String trainingExpertUrl = "";
	FileEntry fileEntryrelevantCopy =null;
	String relevantCopy = "";
	String relevantCopyUrl = "";
	FileEntry fileEntrycertificateCv =null;
	String certificateCv = "";
	String certificateCvUrl = "";
	FileEntry fileEntrytransport =null;
	String transport = "";
	String transportUrl = "";
	FileEntry fileEntrytreatmentAnimal =null;
	String treatmentAnimal = "";
	String treatmentAnimalUrl = "";
	FileEntry fileEntryanimalHouse =null;
	String animalHouseUrl = "";
	String animalHouse = "";
	FileEntry fileEntrydisposalWaste =null;
	String disposalWasteUrl = "";
	String disposalWaste = "";
	FileEntry fileEntryreleaseOfAnimalHosting =null;
	String releaseOfAnimalHosting = "";
	String releaseOfAnimalHostingUrl = "";
	FileEntry fileEntryappendProcedure =null;
	String appendProcedureUrl = "";
	String appendProcedure = "";
	FileEntry fileEntryproceduresForMoni =null;
	String proceduresForMoniUrl = "";
	String proceduresForMoni = "";
	FileEntry fileEntryhandlingPro =null;
	String handlingPro = "";
	String handlingProUrl = "";
	FileEntry fileEntryreleaseOfRadiation =null;
	String releaseOfRadiationUrl = "";
	String releaseOfRadiation = "";
	FileEntry fileEntryabandonmentOfSealed =null;
	String abandonmentOfSealed = "";
	String abandonmentOfSealedUrl = "";
	FileEntry fileEntryfishingForStruck =null;
	String fishingForStruck = "";
	String fishingForStruckUrl = "";
	FileEntry fileEntryemergencyPro =null;
	String emergencyPro = "";
	String emergencyProUrl = "";
	FileEntry fileEntrytransportPlan =null;
	String transportPlan = "";
	String transportPlanUrl = "";
	FileEntry fileEntryinstallationOfFix =null;
	String installationOfFix = "";
	String installationOfFixUrl = "";
	FileEntry fileEntryabamdomentOfUnsealed =null;
	String abamdomentOfUnsealedUrl = "";
	String abamdomentOfUnsealed = "";
	FileEntry fileEntrycopyOfAll =null;
	String copyOfAllUrl = "";
	String copyOfAll = "";
	FileEntry fileEntryservicePro =null;
	String servicingProcedures="";
	String servicingProceduresUrl="";
	FileEntry fileEntryoperationOfInser =null;
	String operationOfInser = "";
	String operationOfInserUrl = "";
	FileEntry fileEntryoperatingCon =null;
	String operatingCon = "";
	String operatingConUrl = "";
	FileEntry fileEntryrulesForEntry =null;
	String rulesForEntry = "";
	String rulesForEntryUrl = "";
	FileEntry fileEntrymanagementDiposal =null;
	String managementDiposalUrl = "";
	String managementDiposal = "";
	FileEntry fileEntryreleaseOfAnimal =null;
	String releaseOfAnimal = "";
	String releaseOfAnimalUrl = "";
	FileEntry fileEntryinstructionOfCaregiver =null;
	String instructionOfCaregiver = "";
	String instructionOfCaregiverUrl = "";
	FileEntry fileEntryemergencyAndOperating =null;
	String emergencyAndOperating = "";
	String emergencyAndOperatingUrl = "";
	FileEntry fileEntrysafetyEmergency =null;
	String safetyEmergency2 = "";
	String safetyEmergency2Url = "";
	FileEntry fileEntryuseOfExposure =null;
	String useOfExposure = "";
	String useOfExposureUrl = "";
	FileEntry fileEntryapplicationForResgis =null;
	String applicationForResgis = "";
	String applicationForResgisUrl = "";
	FileEntry fileEntrybiomedicalResearch =null;
	String biomedicalResearch = "";
	String biomedicalResearchUrl = "";
	FileEntry fileEntrydiagnosticStudiesProtocol =null;
	String diagnosticStudiesProtocol = "";
	String diagnosticStudiesProtocolUrl = "";
	FileEntry fileEntryreleaseOfPatients =null;
	String releaseOfPatients = "";
	String releaseOfPatientsUrl = "";
	FileEntry fileEntryinstructionOfPatients =null;
	String instructionOfPatients = "";
	String instructionOfPatientsUrl = "";
	FileEntry fileEntrycertificatescopy =null;
	String certificatescopyUrl = "";
	String certificatescopy = "";
	FileEntry fileEntryqualifiedcopy =null;
	String qualifiedcopy = "";
	String qualifiedcopyUrl = "";
	FileEntry fileEntrycurriculumcopy =null;
	String curriculumVitaeCopy = "";
	String curriculumcopyUrl = "";
	FileEntry fileEntryclassificationOfWork =null;
	String classificationOfWork = "";
	String classificationOfWorkUrl = "";
	FileEntry fileEntryradiationInstrument =null;
	String radiationInstrument = "";
	String radiationInstrumentUrl = "";
	FileEntry fileEntryinvestigationLevel =null;
	String investigationLevel = "";
	String investigationLevelUrl = "";
	FileEntry fileEntryradioactiveSource =null;
	String radioactiveSource = "";
	String radioactiveSourceUrl = "";
	FileEntry fileEntryrecordReporting =null;
	String recordReporting = "";
	String recordReportingUrl = "";
	FileEntry fileEntrysecurityAccess =null;
	String securityAccess = "";
	String securityAccessUrl = "";
	FileEntry fileEntryraditionSource =null;
	String raditionSource = "";
	String raditionSourceUrl = "";
	FileEntry fileEntryworkTraninig =null;
	String workTraninig = "";
	String workTraninigUrl = "";
	FileEntry fileEntrymanagementSystem =null;
	String managementSystem = "";
	String managementSystemUrl = "";
	FileEntry fileEntrypublicControl =null;
	String publicControl = "";
	String publicControlUrl = "";
	FileEntry fileEntrylicenceLocation =null;
	String licenceLocation = "";
	String licenceLocationUrl = "";
	FileEntry fileEntrylowAchievable =null;
	String lowAchievable = "";
	String lowAchievableUrl = "";
	FileEntry fileEntryleakTesting =null;
	String leakTesting = "";
	String leakTestingUrl = "";
	FileEntry fileEntrytransferSource =null;
	String transferSource = "";
	String transferSourceUrl = "";
	FileEntry fileEntrypackagingTransfer =null;
	String packagingTransfer = "";
	String packagingTransferUrl = "";
	FileEntry fileEntryappendSafety =null;
	String appendSafety = "";
	String appendSafetyUrl = "";
	FileEntry fileEntrysafetyInternal =null;
	String safetyInternal = "";
	String safetyInternalUrl = "";
	FileEntry fileEntrynuclearMaterial =null;
	String nuclearMaterial = "";
	String nuclearMaterialUrl = "";
	FileEntry fileEntrysafetyEmergency1 =null;
	String safetyEmergency1 = "";
	String fileUrlOfRegistration = "";
	String safetyEmergencyUrl = "";
	FileEntry fileEntryworkerRecording =null;
	String workerRecording = "";
	String workerRecordingUrl = "";
	FileEntry fileEntryhealthWork =null;
	String healthWorkUrl = "";
	String healthWork = "";
	FileEntry fileEntryadminstrationOfRadiation =null;
	String adminstrationOfRadiationUrl = "";
	String adminstrationOfRadiation = "";
	FileEntry fileEntryconstraintSlimits =null;
	String constraintSlimits = "";
	String constraintSlimitsUrl = "";
	FileEntry fileEntryequipmentMonitoring =null;
	String equipmentMonitoring = "";
	String equipmentMonitoringUrl = "";
	FileEntry fileEntryareaControl =null;
	String areaControl = "";
	String areaControlUrl = "";
	FileEntry fileEntryclassificationArea =null;
	String classificationArea = "";
	String classificationAreaUrl = "";
	FileEntry fileEntryradiationPro =null;
	String radiationPro = "";
	String radiationProUrl = "";
	FileEntry fileEntryscopeOfActivity =null;
	String scopeOfActivity = "";
	String scopeOfActivityUrl = "";
	FileEntry fileEntryprospectiveQualified =null;
	String prospectiveQualifiedUrl = "";
	String prospectiveQualified="";
	String copyofcv="";
	FileEntry attachDocFE2=null;
	BrokerRegistrationInfo brokerRegisInfo = null;
	BrokerDeclarationInfo brokerDeclarationInfo = null;
	String fileUrlOfBrokerRegistration = "";
	DLFolder doclicenceCusBrokerInfo = null;
	List<DLFileEntry> doclicenceCusBrokerInfoFileEntry = null;
	FileEntry licenceCusBrokerDocFE=null;
	String licenceCusBrokerInfo="";
	String licenceCusBrokerInfoUrl="";
	DLFolder financialInfo = null;
	List<DLFileEntry> financialInfoFileEntry = null;
	FileEntry financialInfoDocFE=null;
	String financialInfoGuarantee="";
	String financialInfoGuaranteeUrl="";
	String fileUrlInDeclaration = "";
	SpecificReqPropLicActivity specificRquirements=null;
	RadiationDeclaration radiationDecData=null;
	String servicePro="";
	String fileUrlInApplicantMedical = "";
	String fileUrlInAcknowledgeMedical="";
	FileEntry fileEntrySignatureInDeclaration = null;
	DLFolder docAttachedStatement = null;
	List<DLFileEntry> attachedFileEntry = null;
	String feeRecipet="";
	String feeRecipetUrl="";
	String copyofcvInfoUrl="";
	int counterOfDocuments = 1;
	HsraApplication hsraApplicationData = null;
	HsraApplicationCurrentStage currentStageDate = null;
	long hsraApplicationId = 0;
	String typeOfApplicant = null;
	String typeOfActivities = null;
	String highOne = null;
	String highTwo = null;
	String medium = null;
	String lowOne = null;
	String lowTwo = null;
	String riskLevel = null;
	 String typeOfApplication = null;
	String typeOfTransaction = null;
	String specificApplicable = null;
	String qualifiedArea = null;
	String currentStage = "";
	String lastFormStep = "";
	String fileUrlOfLegalPerson="";
	String renewal = "";
	FileEntry attachDocFE8=null;
	int sizeOfUnsealedSourceAdd = 0;
	int sizeOfSealedSourceAdd = 0;
	int sizeOfRadiationDevices = 0;
	int sizeOfMedicalPractitioner = 0;
	int sizeOfSourcesDetail = 0;
	int sizeOfRadionuclideAdd = 0;
 	int sizeOfAddMedicalPractitioner=0;
	int sizeOfApplicant=0; 
	int sizeOfAlternateRsoAdd = 0;
	int sizeOfQualifedExpertAdd = 0;
	int sizeOfQualifedExpertOneAdd=0;
	int sizeOfAlternateRsoOneAdd = 0;
	int sizeOfGenEquipmentData = 0;
	String paymentMethod = "";
	String amount="";
	String currency="";
	String applicationType="";
	String applicationTypes="";
	String brokerTransaction=null;
	List<UnsealedSourceAdd> unsealedSourceAdd = null;
	List<SealedSourcesAdd> sealedSourcesAdd = null;
	List<RadiationDevicesAdd> radiationDevicesAdd = null;
	List<MedicalPractitionerAdd> medicalPractitionerAdd = null;
	List<SourcesDetailAdd> sourcesDetailAdd = null;
	List<RadionuclideAdd> radionuclideAdd = null;
	List<AlternateRsoAdd> alternateRsoAdd = null;
	List<QualifedExpertAdd> qualifedExpertAdd = null;
	List<QualifedExpertOneAdd> qualifedExpertOneAdd=null;
	List<AlternateRsoOneAdd> alternateRsoOneAdd = null;
	List<GenEquipmentData> genEquipmentData = null;
    List<AddMedicalPractitioner> medical = null; 
    List<AddMedicalPractitioner> applicant = null; 
	RadionuclideInfo radionuclide =null;
	RadiationProtectionSecOne radSectionOne=null;
	HsraApplicationPayment hsraAppPayment = null;
	HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
	if (Validator.isNotNull(httpServletRequest.getParameter("hsraApplicationId"))) {
		hsraApplicationId = Long.valueOf(httpServletRequest.getParameter("hsraApplicationId"));
	}
	if (Validator.isNotNull(httpServletRequest.getParameter("renewal"))) {
		renewal = String.valueOf(httpServletRequest.getParameter("renewal"));
	}
	if (hsraApplicationId > 0) {
		try {
			hsraApplicationData = HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
		} catch (Exception e) {}
		if (Validator.isNotNull(hsraApplicationData)) {
			if (Validator.isNotNull(hsraApplicationData.getTypeOfApplicant())) {
				typeOfApplicant = hsraApplicationData.getTypeOfApplicant();
			}
			if (Validator.isNotNull(hsraApplicationData.getTypeOfActivities())) {
				typeOfActivities = hsraApplicationData.getTypeOfActivities();
			}
			if (Validator.isNotNull(hsraApplicationData.getHighOne())) {
				highOne = hsraApplicationData.getHighOne();
			}
			if (Validator.isNotNull(hsraApplicationData.getHighTwo())) {
				highTwo = hsraApplicationData.getHighTwo();
			}
			if (Validator.isNotNull(hsraApplicationData.getMedium())) {
				medium = hsraApplicationData.getMedium();
			}
			if (Validator.isNotNull(hsraApplicationData.getLowOne())) {
				lowOne = hsraApplicationData.getLowOne();
			}
			if (Validator.isNotNull(hsraApplicationData.getLowTwo())) {
				lowTwo = hsraApplicationData.getLowTwo();
			}
			if (Validator.isNotNull(hsraApplicationData.getRiskLevel())) {
				riskLevel = hsraApplicationData.getRiskLevel();
			}
			 if (Validator.isNotNull(hsraApplicationData.getTypeOfApplication())) {
				typeOfApplication = hsraApplicationData.getTypeOfApplication();
			} 
			if (Validator.isNotNull(hsraApplicationData.getTypeOfTransaction())) {
				typeOfTransaction = hsraApplicationData.getTypeOfTransaction();
			}
			if (Validator.isNotNull(hsraApplicationData.getBrokerTransactionType())) {
				brokerTransaction=hsraApplicationData.getBrokerTransactionType();
			}
			if (Validator.isNotNull(hsraApplicationData.getSpecificApplicable())) {
				specificApplicable = hsraApplicationData.getSpecificApplicable();
			}
			if (Validator.isNotNull(hsraApplicationData.getSpecificApplicable())) {
				specificApplicable = hsraApplicationData.getSpecificApplicable();
			}
			if (Validator.isNotNull(hsraApplicationData.getQualifiedArea())) {
				qualifiedArea = hsraApplicationData.getQualifiedArea();
			}}
		try {
			unsealedSourceAdd = UnsealedSourceAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfUnsealedSourceAdd = unsealedSourceAdd.size();
		} catch (Exception e) {}
		 try {
			medical = AddMedicalPractitionerLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfAddMedicalPractitioner = medical.size();
		} catch (Exception e) {}  
		 try {
			 applicant = AddMedicalPractitionerLocalServiceUtil.getHsraById(hsraApplicationId);
				sizeOfApplicant=medical.size();
			} catch (Exception e) {}  
		try {
			sealedSourcesAdd = SealedSourcesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfSealedSourceAdd = sealedSourcesAdd.size();
		} catch (Exception e) {}
		try {
			radiationDevicesAdd = RadiationDevicesAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfRadiationDevices = radiationDevicesAdd.size();
		} catch (Exception e) {}
		try {
			medicalPractitionerAdd = MedicalPractitionerAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfMedicalPractitioner = medicalPractitionerAdd.size();
		} catch (Exception e) {}
		try {
			sourcesDetailAdd = SourcesDetailAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfSourcesDetail = sourcesDetailAdd.size();
		} catch (Exception e) {}
		try {
			radionuclideAdd = RadionuclideAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfRadionuclideAdd = radionuclideAdd.size();
		} catch (Exception e) {}
		try {
			alternateRsoAdd = AlternateRsoAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfAlternateRsoAdd = alternateRsoAdd.size();
		} catch (Exception e) {}
		try {
			qualifedExpertAdd = QualifedExpertAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfQualifedExpertAdd = qualifedExpertAdd.size();
		} catch (Exception e) {}
		try {
			qualifedExpertOneAdd = QualifedExpertOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfQualifedExpertOneAdd = qualifedExpertOneAdd.size();
		} catch (Exception e) {}
		try {
			alternateRsoOneAdd = AlternateRsoOneAddLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfAlternateRsoOneAdd = alternateRsoOneAdd.size();
		} catch (Exception e) {}
		try {
			genEquipmentData = GenEquipmentDataLocalServiceUtil.getHsraById(hsraApplicationId);
			sizeOfGenEquipmentData = genEquipmentData.size();
		} catch (Exception e) {}
		try {
			currentStageDate = HsraApplicationCurrentStageLocalServiceUtil.getHsra_Stage_HAI(hsraApplicationId);
		} catch (Exception e) {}
		if (Validator.isNotNull(currentStageDate) && Validator.isNotNull(currentStageDate.getCurrentStage())) {
			currentStage = currentStageDate.getCurrentStage();
		}
		if (Validator.isNotNull(currentStageDate) && Validator.isNotNull(currentStageDate.getLastFormStep())) {
			lastFormStep = currentStageDate.getLastFormStep();
		}
		try {
			hsraAppPayment = HsraApplicationPaymentLocalServiceUtil.getHsraById(hsraApplicationId);
			paymentMethod=hsraAppPayment.getPaymentMethod();
			amount=hsraAppPayment.getAmountPaid();
			currency=hsraAppPayment.getAmountCurrency();
		} catch (Exception e) {}
		try {
			qualityApplicationDetail = QualityApplicantDetailLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			employmentInfo = QualityEmploymentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			proficienctDetail = QualityProficiencyDetailLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			qualityDeclare = QualityDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			brokerRegisInfo = BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			brokerDeclarationInfo = BrokerDeclarationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			radSectionOne= RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
		}catch (Exception e) {}
		try{
		if (Validator.isNotNull(radSectionOne.getTypeOfApplication())) {
			applicationType = radSectionOne.getTypeOfApplication();
		}}catch(Exception e){}
		try{
		if (Validator.isNotNull(brokerRegisInfo.getApplicationTypes())) {
			applicationTypes = brokerRegisInfo.getApplicationTypes();
		}}catch(Exception e){}
		try {
			supportingDocumentsParentFolder1 =DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
			supportingDocumentsFolder1 = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder1.getFolderId(), String.valueOf(hsraApplicationId));
		} catch (Exception e) {}
		try {
			supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"Signature of Quality Expert");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				fileEntrySignatureInQualityExpert = DLAppLocalServiceUtil
						.getFileEntry(dlFileEntry.getFileEntryId());
				fileUrlInQualityExpect = DLURLHelperUtil.getDownloadURL(fileEntrySignatureInQualityExpert,
						fileEntrySignatureInQualityExpert.getFileVersion(), themeDisplay, StringPool.BLANK,
						false, true);
			}} catch (Exception e) {}
		try {
			supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"Signature of Declaration");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				fileEntrySignatureInDeclare = DLAppLocalServiceUtil
						.getFileEntry(dlFileEntry.getFileEntryId());
				fileUrlInDeclare = DLURLHelperUtil.getDownloadURL(fileEntrySignatureInDeclare,
						fileEntrySignatureInDeclare.getFileVersion(), themeDisplay, StringPool.BLANK, false,
						true);
			}} catch (Exception e) {}
		try{
			doclicenceCusBrokerInfo= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Certified Copy of Broker Licence");
			doclicenceCusBrokerInfoFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),doclicenceCusBrokerInfo.getFolderId());
		} catch (Exception e) {}
		if (doclicenceCusBrokerInfoFileEntry != null) {
			for (DLFileEntry uploadedFile : doclicenceCusBrokerInfoFileEntry) {
				licenceCusBrokerDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				licenceCusBrokerInfo=licenceCusBrokerDocFE.getFileName();
				licenceCusBrokerInfoUrl=DLURLHelperUtil.getDownloadURL(licenceCusBrokerDocFE,
						licenceCusBrokerDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}} 
				try{
					docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder1.getFolderId(), "Fee Reciept");
					attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
				} catch (Exception e) {}
				if (attachedFileEntry != null) {
					for (DLFileEntry uploadedFile : attachedFileEntry) {
						attachDocFE2 = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						feeRecipet=attachDocFE2.getFileName();
						feeRecipetUrl=DLURLHelperUtil.getDownloadURL(attachDocFE2,
								attachDocFE2.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}} 
				try{
					financialInfo= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder1.getFolderId(), "Financial Guarantee");
					financialInfoFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),financialInfo.getFolderId());
				} catch (Exception e) {}
				if (financialInfoFileEntry != null) {
					for (DLFileEntry uploadedFile : financialInfoFileEntry) {
						financialInfoDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						financialInfoGuarantee=financialInfoDocFE.getFileName();
						financialInfoGuaranteeUrl=DLURLHelperUtil.getDownloadURL(financialInfoDocFE,
								financialInfoDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}} 
				try{
					supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder1.getFolderId(), "Radiation Safety Officer Details");
					fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
				} catch (Exception e) {}
				if (fileEntry2 != null) {
					for (DLFileEntry uploadedFile : fileEntry2) {
						fileEntryCopyofcv = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						copyofcv=fileEntryCopyofcv.getFileName();
						copyofcvUrl=DLURLHelperUtil.getDownloadURL(fileEntryCopyofcv,
								fileEntryCopyofcv.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}} 
				try{
					supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingDocumentsFolder1.getFolderId(), "Prospective Qualified Expert");
					fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
				} catch (Exception e) {}
				if (fileEntry2 != null) {
					for (DLFileEntry uploadedFile : fileEntry2) {
						fileEntryprospectiveQualified = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
						prospectiveQualified=fileEntryprospectiveQualified.getFileName();
						prospectiveQualifiedUrl=DLURLHelperUtil.getDownloadURL(fileEntryprospectiveQualified,
								fileEntryprospectiveQualified.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
					}} 
		try {
			supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"Signature of Broker");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE2 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				fileUrlOfBrokerRegistration=DLURLHelperUtil.getDownloadURL(attachDocFE2,
						attachDocFE2.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}} catch (Exception e) {}
	}
%>
<script>
	function uploadDocuments(fileID, folderName,url,applicationId,fileTitle){
		hsraApplicationId = $("#hsraApplicationId").val();
		 var fileID = fileID; 
		var fileInput = $("#" + fileID)[0]; // File input element
 	    var fileLength = fileInput.files.length; // Count of selected files
 	   var saveAndConCheck = $("#saveAndConCheck").val();
	    var fileData = fileLength > 0 ? fileID : "0";
	    $("#hsraFormPreviewFieldset .custom_loader").removeClass("hide");
	    $(".preview-section").addClass("hide");
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : fileID,
			url : "${signatureUploadInHsraFormUrl}",
			dataType : 'text',
			data : {
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>folderName" : folderName,
				"<portlet:namespace/>hsraApplicationId" : hsraApplicationId,
				"<portlet:namespace/>saveAndConCheck": saveAndConCheck,
			},
			async : false,
			success : function(data, status) {
				  $(".additionalDocPreviewOne, #additionalDocPreview").html("");
				  var parsedData = typeof data === "string" ? JSON.parse(data) : data;
				  if(folderName=="Generic Documents"){
				  try{
        	            var jsonArrayLength=parsedData.JSON_LENGTH;
        	            var uniqueArray = parsedData.fileData;
        	           var responseData = uniqueArray.filter((value, index, self) =>
        	            index === self.findIndex((item) => item.fileName === value.fileName && item.title === value.title)
        	        );
        	       }catch(error){}
               	 if (jsonArrayLength > 0) {
							var counter = 1;
							$.each(responseData,function(key,entry){ 
								console.log("File name is - "+entry.fileName);
								console.log("File URL is - "+entry.downloadFileUrl);
									var documentContainerPreview = $('<div class="document-container-preview'+counter+' mb-2"></div>');
				                    documentContainerPreview.append('<p><a class="sub_heading_content" id="additionalDocNamePreview'+counter+'" href="'+entry.downloadFileUrl+'">'+ entry.fileName +'</a></p>');
				                    $('#additionalDocPreview').append(documentContainerPreview);		
				                    counter++; 
				                    $(".noAdditionalSupportingDoc").addClass("hide");
							});}}else{
							$(".noAdditionalSupportingDoc").removeClass("hide");
							$.each(parsedData.fileData, function(index, entry) {
				        	    var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
				        	    console.log(entry); // Log each entry in fileData
				        	    console.log(entry.fileName); // This should log "hello.pdf" for the first entry
				        	    $("."+fileID).html(fileTitle); // Set file title
				        	    $("#"+fileID+"-preview").html(entry.fileName); // Set file name in preview
				        	    $("#"+fileID+"-preview").attr("href", decodedUrl);
				        	});}
						$("#hsraFormPreviewFieldset .custom_loader").addClass("hide");
						$(".preview-section").removeClass("hide");
						$(".final-submit, .download-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			},
			error : function(data, status, e) {}
		});}
</script>